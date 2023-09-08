package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import pb1.C100734q;
import pb1.C62251b1;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b */
public class C94162b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C94161a f271977d;

    public C94162b(C94161a aVar) {
        this.f271977d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("key_fav_item_id", this.f271977d.mo129361n().getLongExtra("kFavInfoLocalId", -1));
        intent.putExtra("key_fav_result_list", this.f271977d.mo129361n().getStringArrayListExtra("kTags"));
        Intent n = this.f271977d.mo129361n();
        C94161a aVar = this.f271977d;
        String str = aVar.f271963v;
        long j = aVar.f271962u;
        int i = C62251b1.f176956C0;
        ((C62251b1) C86312j.m106911c(C62251b1.class)).mo87305En(n, str, j, 7);
        C100734q.m131877u0(this.f271977d.f271948d, ".ui.FavTagEditUI", intent, 4100, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
