package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.t0 */
public final class C18358t0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18326p0 f50838d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50839e;

    /* renamed from: f */
    public final /* synthetic */ C22495eh f50840f;

    public C18358t0(C18326p0 p0Var, C19623o0 o0Var, C22495eh ehVar) {
        this.f50838d = p0Var;
        this.f50839e = o0Var;
        this.f50840f = ehVar;
    }

    public final boolean onLongClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$refreshHead$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C18508z2 z2Var = this.f50838d.f50711d;
        C19623o0 o0Var = this.f50839e;
        z2Var.f51442j = o0Var;
        re4 x2 = o0Var.mo25774x2();
        if (x2 != null) {
            C22493dh dhVar = this.f50840f.f63800n.get(0);
            long j = 0;
            try {
                Uri parse = Uri.parse(dhVar.f63755i);
                i = Util.getInt(parse.getQueryParameter("idx"), 0);
                try {
                    j = Util.getLong(parse.getQueryParameter("mid"), 0);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                i = 0;
            }
            C18412m3 m3Var = this.f50838d.f50711d.f51443n;
            String str = this.f50840f.f63794e;
            long j2 = x2.f64519h;
            C22499hb0 hb02 = x2.f64523o;
            m3Var.mo22986m(str, j, i, 15, 0, j2, "", 0, hb02.f63909n, x2.f64522n, hb02.f63908j, dhVar.f63747F, x2.f64521j, "");
        }
        this.f50838d.f50711d.mo23134A();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$refreshHead$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
