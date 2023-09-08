package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18335q1;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22493dh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.p1 */
public final class C18330p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18335q1.C18336a f50733d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50734e;

    /* renamed from: f */
    public final /* synthetic */ C22493dh f50735f;

    public C18330p1(C18335q1.C18336a aVar, C19623o0 o0Var, C22493dh dhVar) {
        this.f50733d = aVar;
        this.f50734e = o0Var;
        this.f50735f = dhVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot$setPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C20642c) C86312j.m106911c(C20642c.class)).Eh0(this.f50733d.f50777u);
        if (this.f50734e.mo25774x2() != null) {
            try {
                Uri parse = Uri.parse(this.f50735f.f63755i);
                Util.getInt(parse.getQueryParameter("idx"), 0);
                Util.getLong(parse.getQueryParameter("mid"), 0);
            } catch (Exception unused) {
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMultiAccount$BizRecCardCommonSlot$setPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
