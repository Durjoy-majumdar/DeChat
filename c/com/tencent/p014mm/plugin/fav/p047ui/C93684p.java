package com.tencent.p014mm.plugin.fav.p047ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.plugin.fav.p047ui.C93687q;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fav.ui.p */
public class C93684p extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C93687q f270472d;

    public C93684p(C93687q qVar) {
        this.f270472d = qVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        MMActivity mMActivity = this.f270472d.f270473a;
        if (mMActivity != null) {
            mMActivity.finish();
            this.f270472d.f270473a.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
    }

    public void onAnimationStart(Animator animator) {
        MultiTouchImageView g4;
        super.onAnimationStart(animator);
        C93687q.C93688a aVar = this.f270472d.f270477e;
        if (aVar != null && (g4 = aVar.mo127461g4()) != null) {
            if (g4.getScale() > 1.0f) {
                g4.mo26059d();
            }
            this.f270472d.f270484l = g4.getTranslationX();
            this.f270472d.f270485m = g4.getTranslationY();
            this.f270472d.f270482j = g4.getScaleX();
            this.f270472d.f270483k = g4.getScaleY();
            Log.m105919d("MicroMsg.FavDragLogic", "onAnimationStart() scale:%s translationX:%s translationY:%s scaleX:%s scaleY:%s", Float.valueOf(g4.getScale()), Float.valueOf(this.f270472d.f270484l), Float.valueOf(this.f270472d.f270485m), Float.valueOf(this.f270472d.f270482j), Float.valueOf(this.f270472d.f270483k));
        }
    }
}
