private void updateAsset(
	Assignment assignment, ServiceContext serviceContext)
	throws PortalException {

	assetEntryLocalService.updateEntry(
		serviceContext.getUserId(), serviceContext.getScopeGroupId(),
		assignment.getCreateDate(), assignment.getModifiedDate(),
		Assignment.class.getName(), assignment.getAssignmentId(),
		assignment.getUuid(), 0, serviceContext.getAssetCategoryIds(),
		serviceContext.getAssetTagNames(), true, true,
		assignment.getCreateDate(), null, null, null,
		ContentTypes.TEXT_HTML,
		assignment.getTitle(serviceContext.getLocale()),
		assignment.getDescription(serviceContext.getLocale()), null, null, null, 0, 0,
		serviceContext.getAssetPriority());
}