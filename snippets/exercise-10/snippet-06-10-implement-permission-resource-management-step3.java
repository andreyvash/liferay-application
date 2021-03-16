public Assignment deleteAssignment(Assignment assignment)
	throws PortalException {

	// Delete permission resources.

	resourceLocalService.deleteResource(
		assignment, ResourceConstants.SCOPE_INDIVIDUAL);

	// Delete the Assignment

	return super.deleteAssignment(assignment);
}	