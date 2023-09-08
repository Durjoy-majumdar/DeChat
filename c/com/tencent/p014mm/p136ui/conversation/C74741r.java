package com.tencent.p014mm.p136ui.conversation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.r */
public class C74741r extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C74720p.C74733m f219782d;

    /* renamed from: e */
    public final /* synthetic */ View f219783e;

    /* renamed from: f */
    public final /* synthetic */ C74720p f219784f;

    public C74741r(C74720p pVar, C74720p.C74733m mVar, View view) {
        this.f219784f = pVar;
        this.f219782d = mVar;
        this.f219783e = view;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C74720p.C74733m mVar = this.f219782d;
        if (mVar != null) {
            C74720p pVar = this.f219784f;
            View view = this.f219783e;
            pVar.getClass();
            Log.m105924i("MicroMsg.ConversationWithCacheAdapter", "[resetClickStatus]");
            if (!C85875k4.m106208w()) {
                view.setBackgroundResource(mVar.f219758m ? C0966R.C0969drawable.abh : C0966R.C0969drawable.f4878py);
                pVar.f219705T = null;
            }
        }
        Log.m105924i("MicroMsg.ConversationWithCacheAdapter", "[dismissClickStatus] setBackground back!");
    }
}
