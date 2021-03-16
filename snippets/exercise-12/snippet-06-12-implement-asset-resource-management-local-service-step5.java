
	// Delete the Asset resource.

	assetEntryLocalService.deleteEntry(
		Assignment.class.getName(), assignment.getAssignmentId());

	return super.deleteAssignment(assignment);
}