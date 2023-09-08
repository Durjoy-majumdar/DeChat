package rl3;

import android.text.Editable;

/* renamed from: rl3.a */
public final class C101392a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f296997a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f296998b;

    /* renamed from: c */
    public static Class<?> f296999c;

    public C101392a() {
        try {
            f296999c = C101392a.class.getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f296999c;
        return cls != null ? new C101394c(cls, charSequence) : super.newEditable(charSequence);
    }
}
