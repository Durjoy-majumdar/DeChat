package h41;

import android.view.View;
import m41.C117536f;

/* renamed from: h41.c */
public class C117068c implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f350806d;

    /* renamed from: e */
    public final /* synthetic */ C117067b f350807e;

    public C117068c(C117067b bVar, View view) {
        this.f350807e = bVar;
        this.f350806d = view;
    }

    public void onViewAttachedToWindow(View view) {
        this.f350807e.zx0(1, 0);
    }

    public void onViewDetachedFromWindow(View view) {
        C117536f.m165799a(new c$$a(this, view, this.f350806d));
    }
}
