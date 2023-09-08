package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma1.C117543a;
import oa1.C61982a;
import oa1.C61983b;

/* renamed from: com.tencent.mm.plugin.expt.ui.b */
public class C55642b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptAppDebugUI f158376d;

    /* renamed from: com.tencent.mm.plugin.expt.ui.b$a */
    public class C55643a implements C7045j.C7056k {

        /* renamed from: a */
        public final /* synthetic */ C7045j f158377a;

        /* renamed from: b */
        public final /* synthetic */ String[] f158378b;

        public C55643a(C7045j jVar, String[] strArr) {
            this.f158377a = jVar;
            this.f158378b = strArr;
        }

        public void onResult(boolean z, Object obj, Object obj2) {
            this.f158377a.mo8101d();
            ExptAppDebugUI.m63246H7(C55642b.this.f158376d, Util.getInt(this.f158378b[this.f158377a.mo8099b()], 0));
        }
    }

    public C55642b(ExptAppDebugUI exptAppDebugUI) {
        this.f158376d = exptAppDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117543a.Cx0().getClass();
        List<C61982a> a = C61983b.m72724e().mo86866a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) a;
        if (arrayList3.size() > 0) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C61982a) it.next()).f176193a));
            }
        }
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = arrayList2.get(i) + "";
            }
            C7045j jVar = new C7045j((Context) this.f158376d.getContext(), strArr);
            jVar.mo8106i(0);
            jVar.f24869t = new C55643a(jVar, strArr);
            jVar.mo8109l();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
