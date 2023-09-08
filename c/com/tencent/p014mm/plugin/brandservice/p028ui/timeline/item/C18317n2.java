package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18321o2;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ex0.C20642c;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22493dh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.n2 */
public final class C18317n2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18321o2.C18322a f50684d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50685e;

    /* renamed from: f */
    public final /* synthetic */ C22493dh f50686f;

    public C18317n2(C18321o2.C18322a aVar, C19623o0 o0Var, C22493dh dhVar) {
        this.f50684d = aVar;
        this.f50685e = o0Var;
        this.f50686f = dhVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot$setPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C20642c) C86312j.m106911c(C20642c.class)).Eh0(this.f50684d.f50777u);
        if (this.f50685e.mo25774x2() != null) {
            try {
                Uri parse = Uri.parse(this.f50686f.f63755i);
                Util.getInt(parse.getQueryParameter("idx"), 0);
                Util.getLong(parse.getQueryParameter("mid"), 0);
            } catch (Exception unused) {
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardSubscribe$BizRecCardCommonSlot$setPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
