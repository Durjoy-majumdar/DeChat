package com.tencent.p014mm.p136ui;

import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.ui.j4 */
public class C19797j4<T> {

    /* renamed from: a */
    public Object f56326a;

    /* renamed from: b */
    public String f56327b;

    /* renamed from: c */
    public boolean f56328c;

    /* renamed from: d */
    public Field f56329d;

    public C19797j4(Object obj, String str, String str2) {
        if (obj != null) {
            this.f56326a = obj;
            this.f56327b = str;
            return;
        }
        throw new IllegalArgumentException("obj cannot be null");
    }

    /* renamed from: a */
    public T mo26271a() {
        mo26272b();
        Field field = this.f56329d;
        if (field != null) {
            try {
                return field.get(this.f56326a);
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("unable to cast object");
            }
        } else {
            throw new NoSuchFieldException();
        }
    }

    /* renamed from: b */
    public final void mo26272b() {
        if (!this.f56328c) {
            this.f56328c = true;
            Class cls = this.f56326a.getClass();
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(this.f56327b);
                    declaredField.setAccessible(true);
                    this.f56329d = declaredField;
                    return;
                } catch (Exception unused) {
                } finally {
                    cls.getSuperclass();
                }
            }
        }
    }
}
