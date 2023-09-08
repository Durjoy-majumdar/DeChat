package mf1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import de1.C7290r;

/* renamed from: mf1.u */
public final class C10869u extends C7290r {

    /* renamed from: d */
    public final /* synthetic */ C10872v f32451d;

    /* renamed from: e */
    public final /* synthetic */ float f32452e;

    /* renamed from: f */
    public final /* synthetic */ View f32453f;

    /* renamed from: g */
    public final /* synthetic */ View f32454g;

    /* renamed from: mf1.u$a */
    public static final class C10870a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ float f32455d;

        /* renamed from: e */
        public final /* synthetic */ C10872v f32456e;

        /* renamed from: f */
        public final /* synthetic */ View f32457f;

        /* renamed from: g */
        public final /* synthetic */ View f32458g;

        public C10870a(float f, C10872v vVar, View view, View view2) {
            this.f32455d = f;
            this.f32456e = vVar;
            this.f32457f = view;
            this.f32458g = view2;
        }

        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("height=");
            sb.append(this.f32455d);
            sb.append(", after 1=");
            ViewGroup viewGroup = this.f32456e.f32461o;
            Float f = null;
            sb.append(viewGroup != null ? Float.valueOf(viewGroup.getTranslationY()) : null);
            sb.append(" 2=");
            View view = this.f32457f;
            sb.append(view != null ? Float.valueOf(view.getTranslationY()) : null);
            sb.append(" 3=");
            View view2 = this.f32458g;
            if (view2 != null) {
                f = Float.valueOf(view2.getTranslationY());
            }
            sb.append(f);
            Log.m105924i("FeedJumperBigBtnObserver", sb.toString());
            ViewGroup viewGroup2 = this.f32456e.f32461o;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            ViewGroup viewGroup3 = this.f32456e.f32461o;
            if (viewGroup3 != null) {
                viewGroup3.setTranslationY(0.0f);
            }
            View view3 = this.f32457f;
            if (view3 != null) {
                view3.setTranslationY(0.0f);
            }
            View view4 = this.f32458g;
            if (view4 != null) {
                view4.setTranslationY(0.0f);
            }
        }
    }

    public C10869u(C10872v vVar, float f, View view, View view2) {
        this.f32451d = vVar;
        this.f32452e = f;
        this.f32453f = view;
        this.f32454g = view2;
    }

    public void onAnimationEnd(Animator animator) {
        C10872v vVar = this.f32451d;
        ViewGroup viewGroup = vVar.f32461o;
        if (viewGroup != null) {
            viewGroup.post(new C10870a(this.f32452e, vVar, this.f32453f, this.f32454g));
        }
    }
}
