package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import te3.C22521pi1;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.d3 */
public final class C18235d3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18225c3 f50422d;

    /* renamed from: e */
    public final /* synthetic */ C22521pi1 f50423e;

    /* renamed from: f */
    public final /* synthetic */ View f50424f;

    public C18235d3(C18225c3 c3Var, C22521pi1 pi12, View view) {
        this.f50422d = c3Var;
        this.f50423e = pi12;
        this.f50424f = view;
    }

    public final void onClick(View view) {
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder$bindBodyClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18225c3 c3Var = this.f50422d;
        c3Var.f50375d.mo23141f(c3Var.f50327a, this.f50423e.f64423S);
        Intent intent = new Intent();
        C22521pi1 pi12 = this.f50423e;
        C18225c3 c3Var2 = this.f50422d;
        View view2 = this.f50424f;
        String str = pi12.f64435r;
        if (!(str == null || str.length() == 0)) {
            j = C61926c.m72671P(pi12.f64435r);
            intent.putExtra("feed_object_id", j);
        } else {
            j = 0;
        }
        if (j == 0) {
            intent.putExtra("feedID", pi12.f64436s);
        }
        intent.putExtra("nonceID", pi12.f64437t);
        intent.putExtra("key_need_related_list", pi12.f64438u == 9 ? 1 : 0);
        intent.putExtra("from_user", pi12.f64432o);
        intent.putExtra("key_extra_info", pi12.f64416K);
        boolean z = pi12.f64412G == 1 && pi12.f64438u == 4 && pi12.f64443z > pi12.f64442y;
        Log.m105924i("MicroMsg.BizTLRecFeedFinder", "bindBodyClick: isLandscapeVideo=" + z + ", alignment=" + pi12.f64412G + ", finder_media_type=" + pi12.f64438u + ", finder_width=" + pi12.f64443z + ", finder_height=" + pi12.f64442y);
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            t1Var.mo76787NL(26, 2, 25, c3Var2.f50376e, intent, view2, z);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedFinder$bindBodyClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
