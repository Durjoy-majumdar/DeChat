package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$a */
public final /* synthetic */ class RecordMsgImageUI$$a implements C92795s {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgImageUI f272652d;

    public /* synthetic */ RecordMsgImageUI$$a(RecordMsgImageUI recordMsgImageUI) {
        this.f272652d = recordMsgImageUI;
    }

    /* renamed from: o2 */
    public final void mo76200o2(int i, C55385t tVar) {
        RecordMsgImageUI recordMsgImageUI = this.f272652d;
        Log.m105925i("MicroMsg.ShowImageUI", "CdnMediaListener %s %s %s", Long.valueOf(recordMsgImageUI.f272638n), Integer.valueOf(i), tVar.f157722d);
        if (recordMsgImageUI.f272638n == tVar.f157733o && i == 1) {
            for (C93624e i2 : recordMsgImageUI.f272631d) {
                if (i2.mo128523i().equals(tVar.f157721c)) {
                    MMHandlerThread.postToMainThread(recordMsgImageUI.f272628E);
                    return;
                }
            }
        }
    }
}
