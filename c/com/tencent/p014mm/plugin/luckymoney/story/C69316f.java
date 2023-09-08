package com.tencent.p014mm.plugin.luckymoney.story;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import f32.C75675d;
import f32.C75676e;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.f */
public class C69316f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199605d;

    public C69316f(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199605d = envelopeAppBarLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("uin", this.f199605d.f199493X0.f228189t);
        intent.putExtra("name", this.f199605d.f199493X0.f228184o);
        intent.putExtra("headurl", this.f199605d.f199493X0.f228183n);
        intent.putExtra("extra_scence", 30);
        C88144b.m109791i(this.f199605d.getContext(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", intent, (Bundle) null);
        C75676e.m90932a(7);
        C75675d.m90931a(18, this.f199605d.f199495Z0);
        C69315e0.f199604n++;
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
