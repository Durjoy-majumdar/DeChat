package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ma1.C117543a;

/* renamed from: com.tencent.mm.plugin.expt.ui.h */
public class C41388h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptDebugUI f111431d;

    /* renamed from: com.tencent.mm.plugin.expt.ui.h$a */
    public class C41389a implements C7045j.C7056k {

        /* renamed from: a */
        public final /* synthetic */ C7045j f111432a;

        /* renamed from: b */
        public final /* synthetic */ String[] f111433b;

        public C41389a(C7045j jVar, String[] strArr) {
            this.f111432a = jVar;
            this.f111433b = strArr;
        }

        public void onResult(boolean z, Object obj, Object obj2) {
            this.f111432a.mo8101d();
            ExptDebugUI.m44732H7(C41388h.this.f111431d, Util.getInt(this.f111433b[this.f111432a.mo8099b()], 0));
        }
    }

    public C41388h(ExptDebugUI exptDebugUI) {
        this.f111431d = exptDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList<Integer> xx02 = C117543a.Cx0().xx0();
        if (xx02 != null && xx02.size() > 0) {
            int size = xx02.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = xx02.get(i) + "";
            }
            C7045j jVar = new C7045j((Context) this.f111431d.getContext(), strArr);
            jVar.mo8106i(0);
            jVar.f24869t = new C41389a(jVar, strArr);
            jVar.mo8109l();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
