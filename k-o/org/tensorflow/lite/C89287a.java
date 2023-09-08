package org.tensorflow.lite;

/* renamed from: org.tensorflow.lite.a */
public enum C89287a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6);
    

    /* renamed from: n */
    public static final C89287a[] f257235n = null;

    /* renamed from: d */
    public final int f257237d;

    /* access modifiers changed from: public */
    static {
        f257235n = values();
    }

    /* access modifiers changed from: public */
    C89287a(int i) {
        this.f257237d = i;
    }

    /* renamed from: a */
    public int mo123622a() {
        switch (ordinal()) {
            case 0:
            case 1:
                return 4;
            case 2:
            case 6:
                return 1;
            case 3:
                return 8;
            case 4:
            case 5:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    /* renamed from: b */
    public String mo123623b() {
        switch (ordinal()) {
            case 0:
                return "float";
            case 1:
                return "int";
            case 2:
            case 6:
                return "byte";
            case 3:
                return "long";
            case 4:
                return "string";
            case 5:
                return "bool";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
