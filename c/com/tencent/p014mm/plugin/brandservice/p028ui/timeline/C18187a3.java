package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import fx0.C20729b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.a3 */
public final class C18187a3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f50264d;

    /* renamed from: e */
    public final /* synthetic */ C18508z2 f50265e;

    public C18187a3(int i, C18508z2 z2Var) {
        this.f50264d = i;
        this.f50265e = z2Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$fillingNewMsgLine$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.BizTimeLineAdapter", "switchToMsgMode");
        C115669n.INSTANCE.idkeyStat(1590, 11, 1, false);
        int i = this.f50264d;
        String valueOf = String.valueOf(C19636w0.f55626c);
        C115669n.INSTANCE.mo160131h(22101, valueOf, 1, Integer.valueOf(i));
        C18508z2 z2Var = this.f50265e;
        C18508z2.C18509a aVar = C18508z2.f51409I;
        z2Var.mo23135B();
        this.f50265e.notifyDataSetChanged();
        C20729b bVar = C20729b.f58601a;
        C18508z2 z2Var2 = this.f50265e;
        bVar.mo32440a(z2Var2.f51436d.f50235f, z2Var2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$fillingNewMsgLine$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
