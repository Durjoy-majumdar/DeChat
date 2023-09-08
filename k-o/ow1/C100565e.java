package ow1;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;

/* renamed from: ow1.e */
public class C100565e implements Animation.AnimationListener {

    /* renamed from: a */
    public Runnable f294648a = new C100566a();

    /* renamed from: b */
    public final /* synthetic */ AlbumPreviewUI f294649b;

    /* renamed from: ow1.e$a */
    public class C100566a implements Runnable {
        public C100566a() {
        }

        public void run() {
            C100565e.this.f294649b.f271301o.startAnimation(AnimationUtils.loadAnimation(C100565e.this.f294649b.getContext(), C0966R.C0968anim.f2394bx));
            C100565e.this.f294649b.f271301o.setVisibility(8);
        }
    }

    public C100565e(AlbumPreviewUI albumPreviewUI) {
        this.f294649b = albumPreviewUI;
    }

    public void onAnimationEnd(Animation animation) {
        this.f294649b.f271301o.setVisibility(0);
        this.f294649b.f271301o.postDelayed(this.f294648a, 4000);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
