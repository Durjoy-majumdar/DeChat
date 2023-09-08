package ii3;

import java.lang.reflect.Field;

/* renamed from: ii3.a */
public class C87738a<T> {

    /* renamed from: a */
    public Object f254028a;

    /* renamed from: b */
    public String f254029b;

    /* renamed from: c */
    public boolean f254030c;

    /* renamed from: d */
    public Field f254031d;

    public C87738a(Object obj, String str, String str2) {
        if (obj != null) {
            this.f254028a = obj;
            this.f254029b = str;
            return;
        }
        throw new IllegalArgumentException("obj cannot be null");
    }

    /* renamed from: a */
    public T mo122148a() {
        mo122149b();
        Field field = this.f254031d;
        if (field != null) {
            try {
                return field.get(this.f254028a);
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("unable to cast object");
            }
        } else {
            throw new NoSuchFieldException();
        }
    }

    /* renamed from: b */
    public final void mo122149b() {
        if (!this.f254030c) {
            this.f254030c = true;
            Class cls = this.f254028a.getClass();
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(this.f254029b);
                    declaredField.setAccessible(true);
                    this.f254031d = declaredField;
                    return;
                } catch (Exception unused) {
                } finally {
                    cls.getSuperclass();
                }
            }
        }
    }
}
