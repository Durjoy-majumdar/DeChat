package com.tencent.p014mm.plugin.luckymoney.story;

import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Set;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.w */
public class C69331w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeStoryVideoManager.C94180e f199621d;

    /* renamed from: e */
    public final /* synthetic */ EnvelopeStoryVideoManager f199622e;

    public C69331w(EnvelopeStoryVideoManager envelopeStoryVideoManager, EnvelopeStoryVideoManager.C94180e eVar) {
        this.f199622e = envelopeStoryVideoManager;
        this.f199621d = eVar;
    }

    public void run() {
        EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f199622e;
        EnvelopeStoryVideoManager.C94180e eVar = this.f199621d;
        Set<String> set = EnvelopeStoryVideoManager.f272049j;
        envelopeStoryVideoManager.getClass();
        if (eVar.f272082n.getTop() < 0 || eVar.f272082n.getTop() > C85875k4.m106198o(MMApplicationContext.getContext())) {
            ((RelativeLayout.LayoutParams) eVar.f272085q.getLayoutParams()).topMargin = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
        } else {
            ((RelativeLayout.LayoutParams) eVar.f272085q.getLayoutParams()).topMargin = (C85875k4.m106198o(MMApplicationContext.getContext()) - eVar.f272082n.getTop()) + C76577a.m92151b(MMApplicationContext.getContext(), 8);
        }
        eVar.f272085q.requestLayout();
    }
}
