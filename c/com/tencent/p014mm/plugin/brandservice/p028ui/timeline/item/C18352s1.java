package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.s1 */
public final class C18352s1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50821d;

    /* renamed from: e */
    public final /* synthetic */ C18335q1 f50822e;

    /* renamed from: f */
    public final /* synthetic */ int f50823f;

    public C18352s1(C19623o0 o0Var, C18335q1 q1Var, int i) {
        this.f50821d = o0Var;
        this.f50822e = q1Var;
        this.f50823f = i;
    }

    public final void onClick(View view) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        re4 x2 = this.f50821d.mo25774x2();
        if (this.f50822e.f50756q == -1) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C22495eh ehVar = this.f50821d.mo25774x2().f64523o.f63905g.get(this.f50822e.f50756q);
        int i2 = 0;
        C22493dh dhVar = ehVar.f63800n.get(0);
        String str = dhVar.f63755i;
        long j2 = 0;
        if (!Util.isNullOrNil(str)) {
            try {
                Uri parse = Uri.parse(str);
                i2 = Util.getInt(parse.getQueryParameter("idx"), 0);
                j2 = Util.getLong(parse.getQueryParameter("mid"), 0);
            } catch (Exception unused) {
            }
            i = i2;
            j = j2;
        } else {
            j = 0;
            i = 0;
        }
        C22499hb0 hb02 = x2.f64523o;
        this.f50822e.f50743d.f51443n.mo22986m(ehVar.f63794e, j, i, 16, 0, x2.f64519h, "", 0, hb02.f63909n, x2.f64522n, hb02.f63908j, dhVar.f63747F, x2.f64521j, dhVar.f63748G);
        C18335q1 q1Var = this.f50822e;
        C18251h hVar = new C18251h(q1Var.f50744e, this.f50821d, q1Var.f50743d, ehVar, this.f50823f);
        hVar.mo26452d(this.f50822e.f50747h);
        hVar.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$refreshClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
