public List<Assignment> getAssignmentsByGroupId(long groupId) {
	
	return assignmentPersistence.findByGroupId(groupId);
}

public List<Assignment> getAssignmentsByGroupId(
	long groupId, int start, int end) {

	return assignmentPersistence.findByGroupId(groupId, start, end);
}

public List<Assignment> getAssignmentsByGroupId(
	long groupId, int start, int end,
	OrderByComparator<Assignment> orderByComparator) {

	return assignmentPersistence.findByGroupId(
		groupId, start, end, orderByComparator);
}

public List<Assignment> getAssignmentsByKeywords(
	long groupId, String keywords, int start, int end,
	OrderByComparator<Assignment> orderByComparator) {

	return assignmentLocalService.dynamicQuery(
		getKeywordSearchDynamicQuery(groupId, keywords), start, end,
		orderByComparator);
}

public long getAssignmentsCountByKeywords(long groupId, String keywords) {
	return assignmentLocalService.dynamicQueryCount(
		getKeywordSearchDynamicQuery(groupId, keywords));
}

private DynamicQuery getKeywordSearchDynamicQuery(
	long groupId, String keywords) {

	DynamicQuery dynamicQuery = dynamicQuery().add(
		RestrictionsFactoryUtil.eq("groupId", groupId));

	if (Validator.isNotNull(keywords)) {
		Disjunction disjunctionQuery =
			RestrictionsFactoryUtil.disjunction();

		disjunctionQuery.add(
			RestrictionsFactoryUtil.like("title", "%" + keywords + "%"));
		disjunctionQuery.add(
			RestrictionsFactoryUtil.like(
				"description", "%" + keywords + "%"));
		dynamicQuery.add(disjunctionQuery);
	}

	return dynamicQuery;
}