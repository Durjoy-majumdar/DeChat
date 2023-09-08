package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C59773g;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.expt.ui.l */
public class C55644l implements View.OnClickListener {

    /* renamed from: com.tencent.mm.plugin.expt.ui.l$a */
    public class C55645a implements DialogInterface.OnDismissListener {
        public C55645a(C55644l lVar) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.expt.ui.l$b */
    public class C55646b implements C47883u {
        public C55646b(C55644l lVar) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                ((C59773g) C86312j.m106911c(C59773g.class)).mo84744SW();
            }
        }
    }

    public C55644l(ExptReportBanner exptReportBanner) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptReportBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77426q qVar = new C77426q(MMApplicationContext.getContext());
        qVar.mo107595g("cancel expt debug now!");
        qVar.mo107589a(true);
        qVar.mo107590b(new C55646b(this));
        qVar.mo107593e(new C55645a(this));
        qVar.mo107603o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
