public Assignment addAssignment(
	long groupId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap,
	Date dueDate, ServiceContext serviceContext)
	throws PortalException {

	return assignmentLocalService.addAssignment(
		groupId, titleMap, descriptionMap, dueDate, serviceContext);
}

public Assignment deleteAssignment(long assignmentId)
	throws PortalException {

	Assignment assignment =
		assignmentLocalService.getAssignment(assignmentId);

	return assignmentLocalService.deleteAssignment(assignment);
}

public Assignment getAssignment(long assignmentId)
	throws PortalException {

	Assignment assignment =
		assignmentLocalService.getAssignment(assignmentId);

	return assignment;
}

public List<Assignment> getAssignmentsByGroupId(long groupId) {

	return assignmentPersistence.findByGroupId(groupId);
}

public List<Assignment> getAssignmentsByKeywords(
	long groupId, String keywords, int start, int end,
	OrderByComparator<Assignment> orderByComparator) {

	return assignmentLocalService.getAssignmentsByKeywords(
		groupId, keywords, start, end, orderByComparator);
}

public long getAssignmentsCountByKeywords(long groupId, String keywords) {

	return assignmentLocalService.getAssignmentsCountByKeywords(
		groupId, keywords);
}

public Assignment updateAssignment(
	long assignmentId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap,
	Date dueDate, ServiceContext serviceContext)
	throws PortalException {

	return assignmentLocalService.updateAssignment(
		assignmentId, titleMap, descriptionMap, dueDate, serviceContext);
}