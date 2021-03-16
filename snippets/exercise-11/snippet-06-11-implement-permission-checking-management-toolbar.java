public CreationMenu getCreationMenu() {

	// Check if user has permissions to add assignments.

	if (!AssignmentTopLevelPermission.contains(
			_themeDisplay.getPermissionChecker(),
			_themeDisplay.getScopeGroupId(), "ADD_ENTRY")) {

		return null;
	}

	// Create the menu.

	return new CreationMenu() {
		{
			addDropdownItem(
				dropdownItem -> {
					dropdownItem.setHref(
						liferayPortletResponse.createRenderURL(),
						"mvcRenderCommandName", MVCCommandNames.EDIT_ASSIGNMENT,
						"redirect", currentURLObj.toString());
					dropdownItem.setLabel(
						LanguageUtil.get(request, "add-assignment"));
				});
		}
	};		
}