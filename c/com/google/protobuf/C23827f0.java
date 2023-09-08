package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.f0 */
public final class C23827f0 implements Comparable<C23827f0> {

    /* renamed from: d */
    public final Field f68239d;

    /* renamed from: e */
    public final C23839h0 f68240e;

    /* renamed from: f */
    public final Class<?> f68241f;

    /* renamed from: g */
    public final int f68242g;

    /* renamed from: h */
    public final Field f68243h;

    /* renamed from: i */
    public final int f68244i;

    /* renamed from: j */
    public final boolean f68245j;

    /* renamed from: n */
    public final boolean f68246n;

    /* renamed from: o */
    public final C24058v1 f68247o;

    /* renamed from: p */
    public final Field f68248p;

    /* renamed from: q */
    public final Class<?> f68249q;

    /* renamed from: r */
    public final Object f68250r;

    /* renamed from: s */
    public final C23908o0.C23913e f68251s;

    public C23827f0(Field field, int i, C23839h0 h0Var, Class<?> cls, Field field2, int i2, boolean z, boolean z2, C24058v1 v1Var, Class<?> cls2, Object obj, C23908o0.C23913e eVar, Field field3) {
        this.f68239d = field;
        this.f68240e = h0Var;
        this.f68241f = cls;
        this.f68242g = i;
        this.f68243h = field2;
        this.f68244i = i2;
        this.f68245j = z;
        this.f68246n = z2;
        this.f68247o = v1Var;
        this.f68249q = cls2;
        this.f68250r = obj;
        this.f68251s = eVar;
        this.f68248p = field3;
    }

    /* renamed from: a */
    public static void m28758a(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("fieldNumber must be positive: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static C23827f0 m28759b(Field field, int i, C23839h0 h0Var, boolean z) {
        C23839h0 h0Var2 = h0Var;
        m28758a(i);
        Charset charset = C23908o0.f68505a;
        if (field == null) {
            throw new NullPointerException("field");
        } else if (h0Var2 == null) {
            throw new NullPointerException("fieldType");
        } else if (h0Var2 != C23839h0.MESSAGE_LIST && h0Var2 != C23839h0.GROUP_LIST) {
            return new C23827f0(field, i, h0Var, (Class<?>) null, (Field) null, 0, false, z, (C24058v1) null, (Class<?>) null, (Object) null, (C23908o0.C23913e) null, (Field) null);
        } else {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
    }

    /* renamed from: c */
    public static C23827f0 m28760c(Field field, int i, Object obj, C23908o0.C23913e eVar) {
        Charset charset = C23908o0.f68505a;
        if (obj != null) {
            m28758a(i);
            if (field != null) {
                return new C23827f0(field, i, C23839h0.MAP, (Class<?>) null, (Field) null, 0, false, true, (C24058v1) null, (Class<?>) null, obj, eVar, (Field) null);
            }
            throw new NullPointerException("field");
        }
        throw new NullPointerException("mapDefaultEntry");
    }

    /* renamed from: e */
    public static C23827f0 m28761e(Field field, int i, C23839h0 h0Var, Field field2) {
        C23839h0 h0Var2 = h0Var;
        m28758a(i);
        Charset charset = C23908o0.f68505a;
        if (field == null) {
            throw new NullPointerException("field");
        } else if (h0Var2 == null) {
            throw new NullPointerException("fieldType");
        } else if (h0Var2 != C23839h0.MESSAGE_LIST && h0Var2 != C23839h0.GROUP_LIST) {
            return new C23827f0(field, i, h0Var, (Class<?>) null, (Field) null, 0, false, false, (C24058v1) null, (Class<?>) null, (Object) null, (C23908o0.C23913e) null, field2);
        } else {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
    }

    /* renamed from: f */
    public static C23827f0 m28762f(Field field, int i, C23839h0 h0Var, Class<?> cls) {
        m28758a(i);
        Charset charset = C23908o0.f68505a;
        if (field == null) {
            throw new NullPointerException("field");
        } else if (h0Var == null) {
            throw new NullPointerException("fieldType");
        } else if (cls != null) {
            return new C23827f0(field, i, h0Var, cls, (Field) null, 0, false, false, (C24058v1) null, (Class<?>) null, (Object) null, (C23908o0.C23913e) null, (Field) null);
        } else {
            throw new NullPointerException("messageClass");
        }
    }

    public int compareTo(Object obj) {
        return this.f68242g - ((C23827f0) obj).f68242g;
    }
}
