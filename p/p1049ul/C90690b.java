package p1049ul;

import java.lang.reflect.Field;

/* renamed from: ul.b */
public class C90690b<T> {

    /* renamed from: a */
    public Object f260510a;

    /* renamed from: b */
    public boolean f260511b;

    /* renamed from: c */
    public Field f260512c;

    public C90690b(Object obj, String str, String str2) {
        if (obj != null) {
            this.f260510a = obj;
            return;
        }
        throw new IllegalArgumentException("obj cannot be null");
    }

    /* renamed from: a */
    public T mo124826a() {
        mo124827b();
        Field field = this.f260512c;
        if (field != null) {
            try {
                return field.get(this.f260510a);
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("unable to cast object");
            }
        } else {
            throw new NoSuchFieldException();
        }
    }

    /* renamed from: b */
    public final void mo124827b() {
        if (!this.f260511b) {
            this.f260511b = true;
            Class cls = this.f260510a.getClass();
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField("mContentRoot");
                    declaredField.setAccessible(true);
                    this.f260512c = declaredField;
                    return;
                } catch (Exception unused) {
                } finally {
                    cls.getSuperclass();
                }
            }
        }
    }
}
