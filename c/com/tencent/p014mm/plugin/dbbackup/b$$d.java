package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$d */
public final /* synthetic */ class b$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f80861d;

    /* renamed from: e */
    public final /* synthetic */ C89779i0 f80862e;

    /* renamed from: f */
    public final /* synthetic */ Context f80863f;

    public /* synthetic */ b$$d(String str, C89779i0 i0Var, Context context) {
        this.f80861d = str;
        this.f80862e = i0Var;
        this.f80863f = context;
    }

    public final void run() {
        String str;
        String str2 = this.f80861d;
        C89779i0 i0Var = this.f80862e;
        Context context = this.f80863f;
        try {
            int executeUpdateDelete = C86709a0.m107535s().f251811i.mo125615f().compileStatement(str2).executeUpdateDelete();
            str = "成功更新 " + executeUpdateDelete + " 条记录";
            Log.m105925i("MicroMsg.DBCommand", "SQL executed, changes: %d, SQL: %s", Integer.valueOf(executeUpdateDelete), str2);
        } catch (RuntimeException e) {
            str = "Execution failed: " + e.getMessage();
            Log.printErrStackTrace("MicroMsg.DBCommand", e, "Failed executing SQL: %s", str2);
        }
        MMHandlerThread.postToMainThread(new b$$g(i0Var, context, str));
    }
}
