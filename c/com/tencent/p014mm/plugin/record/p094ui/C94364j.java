package com.tencent.p014mm.plugin.record.p094ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.record.p094ui.RecordMsgDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.record.ui.j */
public class C94364j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgDetailUI.C943361 f272742d;

    /* renamed from: com.tencent.mm.plugin.record.ui.j$a */
    public class C94365a implements DialogInterface.OnClickListener {
        public C94365a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RecordMsgDetailUI", "revoke history alert: click i know");
            RecordMsgDetailUI.this.finish();
        }
    }

    public C94364j(RecordMsgDetailUI.C943361 r1) {
        this.f272742d = r1;
    }

    public void run() {
        RecordMsgDetailUI recordMsgDetailUI = RecordMsgDetailUI.this;
        C76879j.m92754y(recordMsgDetailUI, recordMsgDetailUI.getString(C0966R.string.ijw), "", RecordMsgDetailUI.this.getString(C0966R.string.lkg), new C94365a());
    }
}
