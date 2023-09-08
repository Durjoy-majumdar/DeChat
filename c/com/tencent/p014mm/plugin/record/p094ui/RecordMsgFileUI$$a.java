package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.sdk.platformtools.Log;
import og2.C100344n;
import qg2.C101147j0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$a */
public final /* synthetic */ class RecordMsgFileUI$$a implements C92795s {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgFileUI f272602d;

    public /* synthetic */ RecordMsgFileUI$$a(RecordMsgFileUI recordMsgFileUI) {
        this.f272602d = recordMsgFileUI;
    }

    /* renamed from: o2 */
    public final void mo76200o2(int i, C55385t tVar) {
        RecordMsgFileUI recordMsgFileUI = this.f272602d;
        int i2 = RecordMsgFileUI.f272577F;
        recordMsgFileUI.getClass();
        if (tVar.f157722d.equals(recordMsgFileUI.f272595t)) {
            int i3 = 3;
            Log.m105925i("MicroMsg.RecordMsgFileUI", "CdnMediaListener %s %s %s", Long.valueOf(recordMsgFileUI.f272594s), Integer.valueOf(i), tVar.f157722d);
            C100344n w = C101147j0.m132642w(tVar);
            if (i == 1) {
                i3 = 2;
            } else if (i != 2) {
                i3 = i != 3 ? 1 : 4;
            }
            w.field_status = i3;
            recordMsgFileUI.mo128649i1(0, w);
        }
    }
}
