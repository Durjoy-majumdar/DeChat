package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import la1.C61258b;
import la1.C61259e;

/* renamed from: com.tencent.mm.plugin.expt.ui.p */
public class C55650p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ KvInfoUI f158383d;

    /* renamed from: com.tencent.mm.plugin.expt.ui.p$a */
    public class C55651a implements C7045j.C7056k {

        /* renamed from: a */
        public final /* synthetic */ C7045j f158384a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f158385b;

        public C55651a(C7045j jVar, ArrayList arrayList) {
            this.f158384a = jVar;
            this.f158385b = arrayList;
        }

        public void onResult(boolean z, Object obj, Object obj2) {
            this.f158384a.mo8101d();
            int b = this.f158384a.mo8099b();
            KvInfoUI kvInfoUI = C55650p.this.f158383d;
            int i = KvInfoUI.f158368j;
            kvInfoUI.mo77152H7((String) this.f158385b.get(b));
        }
    }

    public C55650p(KvInfoUI kvInfoUI) {
        this.f158383d = kvInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/KvInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        HashMap<String, List<C61259e>> hashMap = C61258b.vx0().f174353f;
        if (hashMap != null && hashMap.size() > 0) {
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            C7045j jVar = new C7045j((Context) this.f158383d.getContext(), (ArrayList<String>) arrayList2);
            jVar.mo8106i(0);
            jVar.f24869t = new C55651a(jVar, arrayList2);
            jVar.mo8109l();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/KvInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
