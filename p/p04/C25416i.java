package p04;

/* renamed from: p04.i */
public enum C25416i {
    UNRESOLVED_JAVA_CLASS("Unresolved java class %s", true),
    UNRESOLVED_KCLASS_CONSTANT_VALUE("Unresolved type for %s (arrayDimensions=%s)", true),
    RETURN_TYPE_FOR_FUNCTION("Return type for function cannot be resolved", false, 2, (boolean) null),
    RECURSIVE_TYPE_ALIAS("Recursive type alias %s", false, 2, (boolean) null),
    CYCLIC_UPPER_BOUNDS("Cyclic upper bounds", false, 2, (boolean) null),
    CYCLIC_SUPERTYPES("Cyclic supertypes", false, 2, (boolean) null),
    UNINFERRED_LAMBDA_PARAMETER_TYPE("Cannot infer a lambda parameter type", false, 2, (boolean) null),
    UNINFERRED_TYPE_VARIABLE("Cannot infer a type variable %s", false, 2, (boolean) null),
    UNABLE_TO_SUBSTITUTE_TYPE("Unable to substitute type (%s)", false, 2, (boolean) null),
    DONT_CARE("Special DONT_CARE type", false, 2, (boolean) null),
    ERROR_FLEXIBLE_TYPE("Error java flexible type with id %s. (%s..%s)", false, 2, (boolean) null),
    ERROR_RAW_TYPE("Error raw type %s", false, 2, (boolean) null),
    CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, (boolean) null),
    CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME("Couldn't deserialize type parameter %s in %s", false, 2, (boolean) null),
    INCONSISTENT_SUSPEND_FUNCTION("Inconsistent suspend function type in metadata with constructor %s", false, 2, (boolean) null),
    UNKNOWN_TYPE("Unknown type", false, 2, (boolean) null),
    MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER("Missed a type argument for a type parameter %s", false, 2, (boolean) null),
    ERROR_CONSTANT_VALUE("Error constant value %s", false, 2, (boolean) null),
    ERROR_PROPERTY_TYPE("Error property type", false, 2, (boolean) null),
    ERROR_CLASS("Error class", false, 2, (boolean) null),
    TYPE_FOR_ERROR_TYPE_CONSTRUCTOR("Type for error type constructor (%s)", false, 2, (boolean) null),
    INTERSECTION_OF_ERROR_TYPES("Intersection of error types %s", false, 2, (boolean) null),
    CANNOT_COMPUTE_ERASED_BOUND("Cannot compute erased upper bound of a type parameter %s", false, 2, (boolean) null),
    NOT_FOUND_UNSIGNED_TYPE("Unsigned type %s not found", false, 2, (boolean) null),
    ERROR_ENUM_TYPE("Not found the corresponding enum class for given enum entry %s.%s", false, 2, (boolean) null),
    NO_RECORDED_TYPE("Not found recorded type for %s", false, 2, (boolean) null),
    UNMAPPED_ANNOTATION_TARGET_TYPE("Type for unmapped Java annotation target to Kotlin one", false, 2, (boolean) null),
    UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT("Unknown type for an array element of a java annotation argument", false, 2, (boolean) null),
    NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION("No fqName for annotation %s", false, 2, (boolean) null);
    

    /* renamed from: d */
    public final String f71998d;

    /* renamed from: e */
    public final boolean f71999e;

    /* access modifiers changed from: public */
    C25416i(String str, boolean z) {
        this.f71998d = str;
        this.f71999e = z;
    }
}
