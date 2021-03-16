/**
 * Custom constructor taking a list as a parameter.
 * 
 * @param errors
 */
public AssignmentValidationException(List<String> errors) {

	super(String.join(",", errors));
	_errors = errors;
}

public List<String> getErrors() {

	return _errors;
}

private List<String> _errors;