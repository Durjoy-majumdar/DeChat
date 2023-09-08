package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$o */
public class RecordMsgImageUI$$o implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ RecordMsgImageUI f272673a;

    public RecordMsgImageUI$$o(RecordMsgImageUI recordMsgImageUI) {
        this.f272673a = recordMsgImageUI;
    }

    public void onDismiss() {
        RecordMsgImageUI recordMsgImageUI = this.f272673a;
        recordMsgImageUI.f272641q = null;
        ((ScanCodeSheetItemLogic) recordMsgImageUI.f272646v).mo67083n();
    }
}
