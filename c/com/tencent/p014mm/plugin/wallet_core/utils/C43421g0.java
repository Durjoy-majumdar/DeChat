package com.tencent.p014mm.plugin.wallet_core.utils;

import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C50456mv3;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.g0 */
public class C43421g0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C43423i0.C43428e f117385d;

    /* renamed from: e */
    public final /* synthetic */ C50456mv3 f117386e;

    public C43421g0(C43423i0.C43428e eVar, C50456mv3 mv32) {
        this.f117385d = eVar;
        this.f117386e = mv32;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117385d.mo66651a(this.f117386e, new Object[0]);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
