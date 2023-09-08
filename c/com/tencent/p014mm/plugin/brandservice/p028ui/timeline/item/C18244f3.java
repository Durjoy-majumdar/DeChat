package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18291i3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import qx0.C22136a;
import te3.C22533wo3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.f3 */
public final class C18244f3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18291i3.C18292a f50451d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50452e;

    /* renamed from: f */
    public final /* synthetic */ C22533wo3 f50453f;

    /* renamed from: g */
    public final /* synthetic */ int f50454g;

    /* renamed from: h */
    public final /* synthetic */ int f50455h;

    public C18244f3(C18291i3.C18292a aVar, C19623o0 o0Var, C22533wo3 wo32, int i, int i2) {
        this.f50451d = aVar;
        this.f50452e = o0Var;
        this.f50453f = wo32;
        this.f50454g = i;
        this.f50455h = i2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18291i3.C18292a aVar = this.f50451d;
        C19623o0 o0Var = this.f50452e;
        C22533wo3 wo32 = this.f50453f;
        int i = this.f50454g;
        int i2 = this.f50455h;
        aVar.getClass();
        if (wo32 == null || o0Var.f55539x1 == null || wo32.f64689d == null || wo32.f64690e == null) {
            Log.m105928w("MicroMsg.BizTimeLineItem", "onAppMsgClick appMsg is null");
        } else {
            C22136a.f62618a.mo35252d(aVar.f50590E, o0Var, wo32, i);
            aVar.f50594I.getClass();
            aVar.f50589D.f51443n.mo22975b(o0Var, i2, (int) (System.currentTimeMillis() / ((long) 1000)));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedTag$BizRecFeedTagCommonSlot$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
