package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C112935j0;
import androidx.fragment.app.FragmentManager;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.l */
public class C112939l implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f338111a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f338112b;

    /* renamed from: c */
    public final /* synthetic */ C112935j0.C112936a f338113c;

    /* renamed from: d */
    public final /* synthetic */ C112741b f338114d;

    /* renamed from: androidx.fragment.app.l$a */
    public class C112940a implements Runnable {
        public C112940a() {
        }

        public void run() {
            if (C112939l.this.f338112b.getAnimatingAway() != null) {
                C112939l.this.f338112b.setAnimatingAway((View) null);
                C112939l lVar = C112939l.this;
                ((FragmentManager.C112894d) lVar.f338113c).mo165134a(lVar.f338112b, lVar.f338114d);
            }
        }
    }

    public C112939l(ViewGroup viewGroup, Fragment fragment, C112935j0.C112936a aVar, C112741b bVar) {
        this.f338111a = viewGroup;
        this.f338112b = fragment;
        this.f338113c = aVar;
        this.f338114d = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f338111a.post(new C112940a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
