package com.google.protobuf;

/* renamed from: com.google.protobuf.h0 */
public enum C23839h0 {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, C23840a.MAP, C23926q0.VOID);
    

    /* renamed from: W0 */
    public static final C23839h0[] f68297W0 = null;

    /* renamed from: d */
    public final C23926q0 f68322d;

    /* renamed from: e */
    public final int f68323e;

    /* renamed from: f */
    public final C23840a f68324f;

    /* renamed from: com.google.protobuf.h0$a */
    public enum C23840a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: d */
        public final boolean f68330d;

        /* access modifiers changed from: public */
        C23840a(boolean z) {
            this.f68330d = z;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        C23839h0[] values = values();
        f68297W0 = new C23839h0[values.length];
        for (C23839h0 h0Var : values) {
            f68297W0[h0Var.f68323e] = h0Var;
        }
    }

    /* access modifiers changed from: public */
    C23839h0(int i, C23840a aVar, C23926q0 q0Var) {
        this.f68323e = i;
        this.f68324f = aVar;
        this.f68322d = q0Var;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            q0Var.getClass();
        } else if (ordinal == 3) {
            q0Var.getClass();
        }
        if (aVar == C23840a.SCALAR) {
            q0Var.ordinal();
        }
    }

    /* renamed from: a */
    public int mo37690a() {
        return this.f68323e;
    }
}
