package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.storage.p0$$a */
public final /* synthetic */ class p0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19625p0 f55557d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f55558e;

    public /* synthetic */ p0$$a(C19625p0 p0Var, C19623o0 o0Var) {
        this.f55557d = p0Var;
        this.f55558e = o0Var;
    }

    public final void run() {
        C19625p0 p0Var = this.f55557d;
        C19623o0 o0Var = this.f55558e;
        p0Var.getClass();
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "updateValidExposeStatus ret = %b, msgId=%d", Boolean.valueOf(p0Var.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set isValidExposed = true where msgId = " + o0Var.field_msgId)), Long.valueOf(o0Var.field_msgId));
    }
}
