package com.tencent.p014mm.pluginsdk.model.app;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.model.app.t0 */
public class C44582t0 implements Runnable {

    /* renamed from: d */
    public MMHandler f120885d;

    /* renamed from: e */
    public String f120886e;

    /* renamed from: f */
    public int f120887f;

    /* renamed from: g */
    public String f120888g;

    public C44582t0(MMHandler mMHandler, String str, int i, String str2) {
        this.f120885d = mMHandler;
        this.f120886e = str;
        this.f120887f = i;
        this.f120888g = str2;
    }

    public void run() {
        String str;
        String str2 = this.f120886e;
        if (str2 != null && str2.length() != 0 && (str = this.f120888g) != null && str.length() != 0) {
            C44588z0 z0Var = new C44588z0(this.f120886e, this.f120887f, Util.httpGet(this.f120888g));
            Message obtain = Message.obtain();
            obtain.obj = z0Var;
            this.f120885d.sendMessage(obtain);
        }
    }
}
