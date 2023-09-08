package qj3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: qj3.a */
public abstract class C47856a {

    /* renamed from: a */
    public int f128455a;

    /* renamed from: b */
    public Object f128456b;

    /* renamed from: c */
    public boolean f128457c;

    /* renamed from: qj3.a$a */
    public interface C47857a {
    }

    /* renamed from: qj3.a$b */
    public static abstract class C47858b {
        /* renamed from: a */
        public abstract void mo63542a(View view, C47857a aVar);

        /* renamed from: b */
        public abstract void mo63543b(Context context, C47857a aVar, C47856a aVar2, Object... objArr);

        /* renamed from: c */
        public abstract View mo63544c(Context context, ViewGroup viewGroup, View view);

        /* renamed from: d */
        public abstract boolean mo63545d(Context context, View view, C47856a aVar, Object... objArr);
    }

    public C47856a(int i, Object obj) {
        this.f128455a = i;
        this.f128456b = obj;
    }

    /* renamed from: a */
    public abstract void mo63539a(Context context, C47857a aVar, Object... objArr);

    /* renamed from: b */
    public abstract C47857a mo63540b();

    /* renamed from: c */
    public abstract C47858b mo63541c();

    /* renamed from: d */
    public boolean mo72586d() {
        return this.f128457c;
    }
}
