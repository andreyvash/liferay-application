public Assignment updateAssignment(
	long assignmentId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap,
	Date dueDate, ServiceContext serviceContext)
	throws PortalException {

	// Get the Assignment by id.

	Assignment assignment = getAssignment(assignmentId);

	// Set updated fields and modification date.

	assignment.setModifiedDate(new Date());
	assignment.setTitleMap(titleMap);
	assignment.setDueDate(dueDate);
	assignment.setDescriptionMap(descriptionMap);

	assignment = super.updateAssignment(assignment);

	return assignment;