package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import com.tencent.p014mm.p136ui.conversation.banner.C97204d;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import sd3.C101583a;
import tc0.C48631n;
import tc0.C77885p;

/* renamed from: com.tencent.mm.ui.conversation.banner.a */
public class C97195a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97204d f285205d;

    public C97195a(C97204d dVar) {
        this.f285205d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/ADBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C97204d dVar = this.f285205d;
        C97207e eVar = dVar.f285223h;
        if (!(eVar == null || dVar.f285226n == null)) {
            C97204d.C97205a aVar = this.f285205d.f285226n;
            String str = eVar.f285227o.get(0).f285229a.f297389a;
            ((C97202c) aVar).getClass();
            C101583a.m133406a();
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48631n(3, str));
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/ADBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
