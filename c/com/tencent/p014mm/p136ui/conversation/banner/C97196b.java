package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import com.tencent.p014mm.app.plugin.C40030e;
import com.tencent.p014mm.p136ui.conversation.banner.C97204d;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import sd3.C101583a;
import tc0.C48631n;
import tc0.C77885p;
import wc3.C15134f0;
import wc3.C53145l0;

/* renamed from: com.tencent.mm.ui.conversation.banner.b */
public class C97196b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97204d f285206d;

    public C97196b(C97204d dVar) {
        this.f285206d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/ADBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C97204d dVar = this.f285206d;
        C97207e eVar = dVar.f285223h;
        if (!(eVar == null || dVar.f285226n == null)) {
            C97204d.C97205a aVar = this.f285206d.f285226n;
            C101583a aVar2 = eVar.f285227o.get(0).f285229a;
            String str = aVar2.f297389a;
            String str2 = aVar2.f297396h;
            C97202c cVar = (C97202c) aVar;
            cVar.getClass();
            C101583a.m133406a();
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48631n(2, str));
            Log.m105918d("MicroMsg.ADBanner", "jump to " + str2);
            ((C40030e) C15134f0.C15135a.m14248a()).mo62719c(cVar.f285222a.f230570g.get(), str2, true, (C53145l0) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/ADBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
