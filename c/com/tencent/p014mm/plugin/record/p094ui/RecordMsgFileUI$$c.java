package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI$$c */
public class RecordMsgFileUI$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f272607d;

    /* renamed from: e */
    public final /* synthetic */ int f272608e;

    /* renamed from: f */
    public final /* synthetic */ int f272609f;

    /* renamed from: g */
    public final /* synthetic */ RecordMsgFileUI f272610g;

    public RecordMsgFileUI$$c(RecordMsgFileUI recordMsgFileUI, int i, int i2, int i3) {
        this.f272610g = recordMsgFileUI;
        this.f272607d = i;
        this.f272608e = i2;
        this.f272609f = i3;
    }

    public void run() {
        this.f272610g.f272588j.setProgress(this.f272607d);
        RecordMsgFileUI recordMsgFileUI = this.f272610g;
        recordMsgFileUI.f272589n.setText(recordMsgFileUI.getString(C0966R.string.cno, new Object[]{Util.getLengthStr((float) this.f272608e), Util.getLengthStr((float) this.f272609f)}));
    }
}
