package com.tencent.p014mm.plugin.record.p094ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p206nj.C88955f;
import qg2.C101147j0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$j */
public class RecordMsgFileUI$$j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgFileUI f272615d;

    public RecordMsgFileUI$$j(RecordMsgFileUI recordMsgFileUI) {
        this.f272615d = recordMsgFileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!C88955f.m111058b()) {
            C76879j.m92738i(this.f272615d.getContext(), C0966R.string.cpf, C0966R.string.a3h);
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        RecordMsgFileUI recordMsgFileUI = this.f272615d;
        C101147j0.m132618K(recordMsgFileUI.f272596u, recordMsgFileUI.f272594s, true);
        RecordMsgFileUI recordMsgFileUI2 = this.f272615d;
        recordMsgFileUI2.f272579B = true;
        recordMsgFileUI2.mo129686J7();
        this.f272615d.mo129692P7(7, 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
