package com.tencent.p014mm.plugin.record.p094ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import og2.C100336e;
import p823sg.C101611g;
import qg2.C101136b0;
import qg2.C101147j0;
import te3.C101834rc0;
import te3.C77915dp3;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$k */
public class RecordMsgFileUI$$k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgFileUI f272616d;

    public RecordMsgFileUI$$k(RecordMsgFileUI recordMsgFileUI) {
        this.f272616d = recordMsgFileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RecordMsgFileUI recordMsgFileUI = this.f272616d;
        int i = RecordMsgFileUI.f272577F;
        recordMsgFileUI.mo129689M7();
        RecordMsgFileUI recordMsgFileUI2 = this.f272616d;
        C101834rc0 rc02 = recordMsgFileUI2.f272596u;
        long j = recordMsgFileUI2.f272594s;
        C101611g<Integer, C77915dp3> gVar = C101147j0.f296056a;
        Class cls = C100336e.class;
        if (rc02 == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "try pause download data fail, dataitem is null");
        } else {
            ((C100336e) C86312j.m106911c(cls)).kl0().mo139220a(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(C101147j0.m132641v(rc02.f299280T, j, true)));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
