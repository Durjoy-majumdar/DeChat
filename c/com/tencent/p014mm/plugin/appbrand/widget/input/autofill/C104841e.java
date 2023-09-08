package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.database.DataSetObserver;
import android.widget.EditText;
import android.widget.ListAdapter;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.C104846k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import rt0.C110651a;
import rt0.C110652b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.e */
public final class C104841e {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.e$a */
    public class C104842a implements C104846k {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f311364a;

        /* renamed from: b */
        public final /* synthetic */ WeakReference f311365b;

        public C104842a(WeakReference weakReference, WeakReference weakReference2) {
            this.f311364a = weakReference;
            this.f311365b = weakReference2;
        }

        /* renamed from: a */
        public void mo148734a(String str, C104846k.C104847a aVar) {
            EditText editText = (EditText) this.f311364a.get();
            C83780d1 d1Var = (C83780d1) this.f311365b.get();
            if (editText != null && d1Var != null) {
                int inputId = ((C104863f1) editText).getInputId();
                C104843b bVar = new C104843b();
                HashMap hashMap = new HashMap();
                hashMap.put("id", str);
                hashMap.put("type", aVar.name().toLowerCase());
                hashMap.put("inputId", Integer.valueOf(inputId));
                bVar.mo115194p(d1Var);
                bVar.mo115165o(hashMap);
                bVar.mo115158h();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.e$b */
    public static final class C104843b extends C82926s {
        private static final int CTRL_INDEX = 207;
        public static final String NAME = "onKeyboardDropdownOperate";
    }

    /* renamed from: a */
    public static <Input extends EditText & C104863f1> void m140510a(C83780d1 d1Var, Input input, C110651a aVar) {
        C104863f1 f1Var = (C104863f1) input;
        if (f1Var.mo148800d()) {
            C104842a aVar2 = new C104842a(new WeakReference(input), new WeakReference(d1Var));
            C104829b autoFillController = f1Var.getAutoFillController();
            ArrayList<C110652b> arrayList = aVar.f331012b;
            autoFillController.getClass();
            C104826a aVar3 = new C104826a(autoFillController.f311339a.getContext(), arrayList);
            autoFillController.f311345g = aVar3;
            aVar3.f311329f = autoFillController.f311343e;
            C68706f fVar = autoFillController.f311340b;
            DataSetObserver dataSetObserver = fVar.f197367l;
            if (dataSetObserver == null) {
                fVar.f197367l = new AutoFillListPopupWindowBase.C68702c((C68707g) null);
            } else {
                ListAdapter listAdapter = fVar.f197358c;
                if (listAdapter != null) {
                    listAdapter.unregisterDataSetObserver(dataSetObserver);
                }
            }
            fVar.f197358c = aVar3;
            aVar3.registerDataSetObserver(fVar.f197367l);
            AutoFillListPopupWindowBase.C68700a aVar4 = fVar.f197359d;
            if (aVar4 != null) {
                aVar4.setAdapter(fVar.f197358c);
            }
            autoFillController.f311343e.f311353a = aVar2;
            autoFillController.f311344f = "screen".equalsIgnoreCase(aVar.f331011a) ? C104844i.SCREEN : C104844i.VIEW;
            autoFillController.mo148725c();
        }
    }
}
