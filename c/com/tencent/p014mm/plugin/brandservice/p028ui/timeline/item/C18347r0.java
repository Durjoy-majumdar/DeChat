package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.r0 */
public final class C18347r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50798d;

    /* renamed from: e */
    public final /* synthetic */ C22495eh f50799e;

    /* renamed from: f */
    public final /* synthetic */ C18326p0 f50800f;

    /* renamed from: g */
    public final /* synthetic */ int f50801g;

    public C18347r0(C19623o0 o0Var, C22495eh ehVar, C18326p0 p0Var, int i) {
        this.f50798d = o0Var;
        this.f50799e = ehVar;
        this.f50800f = p0Var;
        this.f50801g = i;
    }

    public final void onClick(View view) {
        int i;
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$refreshClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        re4 x2 = this.f50798d.mo25774x2();
        int i2 = 0;
        C22493dh dhVar = this.f50799e.f63800n.get(0);
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
        C18412m3 m3Var = this.f50800f.f50711d.f51443n;
        String str2 = this.f50799e.f63794e;
        long j3 = x2.f64519h;
        C22499hb0 hb02 = x2.f64523o;
        m3Var.mo22986m(str2, j, i, 16, 0, j3, "", 0, hb02.f63909n, x2.f64522n, hb02.f63908j, dhVar.f63747F, x2.f64521j, dhVar.f63748G);
        C18326p0 p0Var = this.f50800f;
        C18251h hVar = new C18251h(p0Var.f50712e, this.f50798d, p0Var.f50711d, this.f50799e, this.f50801g);
        hVar.mo26452d(this.f50800f.f50718k);
        hVar.show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$refreshClose$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
