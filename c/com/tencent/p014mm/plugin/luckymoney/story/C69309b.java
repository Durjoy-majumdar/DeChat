package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f32.C75675d;
import f32.C75676e;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.b */
public class C69309b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199579d;

    public C69309b(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199579d = envelopeAppBarLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "go to h5");
        EnvelopeAppBarLayout envelopeAppBarLayout = this.f199579d;
        if (envelopeAppBarLayout.f199502g1) {
            C75228t.m90219L(envelopeAppBarLayout.getContext(), this.f199579d.f199493X0.f228183n, true);
            C75676e.m90932a(7);
            C75675d.m90931a(9, this.f199579d.f199495Z0);
            C69315e0.f199604n++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
