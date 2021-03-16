@Indexable(type = IndexableType.REINDEX)
@Override
public Assignment addAssignment(Assignment assignment) {
	assignment.setNew(true);

	return assignmentPersistence.update(assignment);
}