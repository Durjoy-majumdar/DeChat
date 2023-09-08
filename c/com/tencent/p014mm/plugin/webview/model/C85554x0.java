package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.webview.model.C85541t0;
import di3.C86312j;
import gt0.C87330d0;
import gt0.C87347g;
import java.util.ArrayList;
import p196ln.C76708i;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.model.x0 */
public final class C85554x0<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C85541t0.C85542a f249335d;

    /* renamed from: e */
    public final /* synthetic */ C90437rw3 f249336e;

    public C85554x0(C85541t0.C85542a aVar, C90437rw3 rw32) {
        this.f249335d = aVar;
        this.f249336e = rw32;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C87347g gVar = this.f249335d.f249293c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C87330d0.C87331a(0, bundle.getString("userName", ""), this.f249335d.f249291a.getResources().getString(C0966R.string.a4v), this.f249336e.f259822d, true, ((C76708i) C86312j.m106911c(C76708i.class)).Wd0(bundle.getString("userIcon", ""), (String) null), 0));
        gVar.setSelectListItem(arrayList);
        C85541t0.C85542a aVar = this.f249335d;
        aVar.f249292b.mo121778b(aVar.f249293c);
    }
}
