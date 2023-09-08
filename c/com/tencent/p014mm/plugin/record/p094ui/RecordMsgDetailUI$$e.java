package com.tencent.p014mm.plugin.record.p094ui;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import qg2.C101147j0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$e */
public class RecordMsgDetailUI$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f272571d;

    /* renamed from: e */
    public final /* synthetic */ String f272572e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f272573f;

    /* renamed from: g */
    public final /* synthetic */ Dialog f272574g;

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$e$a */
    public class C94341a implements Runnable {
        public C94341a() {
        }

        public void run() {
            RecordMsgDetailUI$$e.this.f272574g.dismiss();
        }
    }

    public RecordMsgDetailUI$$e(RecordMsgDetailUI recordMsgDetailUI, String str, String str2, C72963f4 f4Var, Dialog dialog) {
        this.f272571d = str;
        this.f272572e = str2;
        this.f272573f = f4Var;
        this.f272574g = dialog;
    }

    public void run() {
        C101147j0.m132616I(this.f272571d, this.f272572e, this.f272573f, false);
        MMHandlerThread.postToMainThread(new C94341a());
    }

    public String toString() {
        return super.toString() + "|onActivityResult";
    }
}
