package wy3;

/* renamed from: wy3.f */
public enum C26453f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY((String) null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    /* access modifiers changed from: public */
    C26453f(String str) {
    }

    /* renamed from: a */
    public final boolean mo53431a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
