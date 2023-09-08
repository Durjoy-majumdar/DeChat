package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C112912b;

/* renamed from: androidx.fragment.app.e */
public class C112923e implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f338054a;

    /* renamed from: b */
    public final /* synthetic */ View f338055b;

    /* renamed from: c */
    public final /* synthetic */ C112912b.C112914b f338056c;

    /* renamed from: androidx.fragment.app.e$a */
    public class C112924a implements Runnable {
        public C112924a() {
        }

        public void run() {
            C112923e eVar = C112923e.this;
            eVar.f338054a.endViewTransition(eVar.f338055b);
            C112923e.this.f338056c.mo165186a();
        }
    }

    public C112923e(C112912b bVar, ViewGroup viewGroup, View view, C112912b.C112914b bVar2) {
        this.f338054a = viewGroup;
        this.f338055b = view;
        this.f338056c = bVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.f338054a.post(new C112924a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
