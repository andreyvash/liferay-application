public Assignment addAssignment(
	long groupId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap,
	Date dueDate, ServiceContext serviceContext)
	throws PortalException {
	
	// Validate assignment parameters.

	_assignmentValidator.validate(titleMap, descriptionMap, dueDate);