@Reference(
	policy = ReferencePolicy.DYNAMIC,
	policyOption = ReferencePolicyOption.GREEDY,
	target = "(model.class.name=com.liferay.training.gradebook.model.Assignment)"
)
private volatile ModelResourcePermission<Assignment>
	_assignmentModelResourcePermission;

@Reference(
	policy = ReferencePolicy.DYNAMIC,
	policyOption = ReferencePolicyOption.GREEDY,
	target = "(resource.name=" + GradebookConstants.RESOURCE_NAME + ")"
)
private volatile PortletResourcePermission _portletResourcePermission;