package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18401z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import qx0.C22136a;
import te3.C22533wo3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.x2 */
public final class C18383x2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18401z2.C18402a f50938d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50939e;

    /* renamed from: f */
    public final /* synthetic */ C22533wo3 f50940f;

    /* renamed from: g */
    public final /* synthetic */ int f50941g;

    /* renamed from: h */
    public final /* synthetic */ int f50942h;

    public C18383x2(C18401z2.C18402a aVar, C19623o0 o0Var, C22533wo3 wo32, int i, int i2) {
        this.f50938d = aVar;
        this.f50939e = o0Var;
        this.f50940f = wo32;
        this.f50941g = i;
        this.f50942h = i2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18401z2.C18402a aVar = this.f50938d;
        C19623o0 o0Var = this.f50939e;
        C22533wo3 wo32 = this.f50940f;
        int i = this.f50941g;
        int i2 = this.f50942h;
        aVar.getClass();
        if (wo32 == null || o0Var.f55539x1 == null || wo32.f64689d == null || wo32.f64690e == null) {
            Log.m105928w("MicroMsg.BizTimeLineItem", "onAppMsgClick appMsg is null");
        } else {
            C22136a.f62618a.mo35252d(aVar.f51030E, o0Var, wo32, i);
            aVar.f51043R.mo22968h(o0Var, "PAUSE_FOR_RESUME");
            aVar.f51029D.f51443n.mo22975b(o0Var, i2, (int) (System.currentTimeMillis() / ((long) 1000)));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
