package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p262wm.C22921c;
import qg2.C101147j0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$h */
public class RecordMsgFileUI$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgFileUI f272614d;

    public RecordMsgFileUI$$h(RecordMsgFileUI recordMsgFileUI) {
        this.f272614d = recordMsgFileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RecordMsgFileUI recordMsgFileUI = this.f272614d;
        String q = C101147j0.m132636q(recordMsgFileUI.f272596u, recordMsgFileUI.f272594s, 1);
        new Intent().setAction("android.intent.action.VIEW");
        if (4 == this.f272614d.mo129684H7()) {
            RecordMsgFileUI recordMsgFileUI2 = this.f272614d;
            recordMsgFileUI2.f272578A = false;
            recordMsgFileUI2.mo129691O7();
        } else {
            RecordMsgFileUI recordMsgFileUI3 = this.f272614d;
            recordMsgFileUI3.getClass();
            ((C22921c) C86312j.m106911c(C22921c.class)).mo35876EU(recordMsgFileUI3, q, recordMsgFileUI3.f272596u.f299262K, 5);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
