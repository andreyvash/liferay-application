public Assignment addAssignment(
	long groupId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap,
	Date dueDate, ServiceContext serviceContext)
	throws PortalException {
	
	// Validate assignment parameters.

	_assignmentValidator.validate(titleMap, descriptionMap, dueDate);

	// Get group and user.

	Group group = groupLocalService.getGroup(groupId);

	long userId = serviceContext.getUserId();

	User user = userLocalService.getUser(userId);

	// Generate primary key for the assignment.

	long assignmentId =
		counterLocalService.increment(Assignment.class.getName());

	// Create assigment. This doesn't yet persist the entity.

	Assignment assignment = createAssignment(assignmentId);

	// Populate fields.

	assignment.setCompanyId(group.getCompanyId());
	assignment.setCreateDate(serviceContext.getCreateDate(new Date()));
	assignment.setDueDate(dueDate);
	assignment.setDescriptionMap(descriptionMap);
	assignment.setGroupId(groupId);
	assignment.setModifiedDate(serviceContext.getModifiedDate(new Date()));
	assignment.setTitleMap(titleMap);
	assignment.setUserId(userId);
	assignment.setUserName(user.getScreenName());

	// Persist assignment to database.

	assignment = super.addAssignment(assignment);
	
	// Add permission resources.
	
	boolean portletActions = false;
	boolean addGroupPermissions = true;
	boolean addGuestPermissions = true;

	resourceLocalService.addResources(
		group.getCompanyId(), groupId, userId, Assignment.class.getName(),
		assignment.getAssignmentId(), portletActions, addGroupPermissions,
		addGuestPermissions);

	return assignment;
}