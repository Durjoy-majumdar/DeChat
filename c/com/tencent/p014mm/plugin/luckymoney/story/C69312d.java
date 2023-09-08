package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f32.C75675d;
import f32.C75676e;
import j20.C117292a;
import java.util.ArrayList;
import te3.C77993rp3;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.d */
public class C69312d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199582d;

    public C69312d(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199582d = envelopeAppBarLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "go to mini app");
        EnvelopeAppBarLayout envelopeAppBarLayout = this.f199582d;
        if (envelopeAppBarLayout.f199502g1) {
            C77993rp3 rp32 = envelopeAppBarLayout.f199493X0;
            C75228t.m90224Q(rp32.f228184o, rp32.f228183n, 0, 1100);
            C75676e.m90932a(7);
            C75675d.m90931a(14, this.f199582d.f199495Z0);
            C69315e0.f199604n++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
