package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18378w3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import eb0.C20583z;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64635po3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.b3 */
public final class C18191b3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18508z2 f50272d;

    /* renamed from: e */
    public final /* synthetic */ C18378w3 f50273e;

    /* renamed from: f */
    public final /* synthetic */ int f50274f;

    public C18191b3(C18508z2 z2Var, C18378w3 w3Var, int i) {
        this.f50272d = z2Var;
        this.f50273e = w3Var;
        this.f50274f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$fillingNewMsgLine$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.BizTimeLineAdapter", "refresh RecFeed click");
        C18508z2.C18509a.m19195b(C18508z2.f51409I, this.f50272d, C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_REPLACE, false, (C64635po3) null, 12, (Object) null);
        this.f50273e.f50923h.setVisibility(0);
        int i = this.f50274f;
        String valueOf = String.valueOf(C19636w0.f55626c);
        C115669n.INSTANCE.mo160131h(22718, 1, Integer.valueOf(i), valueOf);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$fillingNewMsgLine$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
