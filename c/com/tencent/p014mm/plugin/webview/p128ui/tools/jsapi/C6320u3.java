package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C89349b;
import te3.hz4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.u3 */
public class C6320u3 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ long f23201d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23202e;

    public C6320u3(MsgHandler msgHandler, long j) {
        this.f23202e = msgHandler;
        this.f23201d = j;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.MsgHandler", "doUxSearchOpLog rsp errType %d,errCode %d,errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        hz4 hz4 = (hz4) cVar.f127056b.f127083a;
        Bundle bundle = new Bundle();
        bundle.putLong("reqId", this.f23201d);
        bundle.putInt("ret", i2);
        C89349b bVar = hz4.f134988d;
        if (bVar != null) {
            bVar.mo123705h();
            bundle.putString("json", hz4.f134988d.mo123705h());
        }
        try {
            C6107m mVar = this.f23202e.f22715x;
            if (mVar != null) {
                mVar.callback(147, bundle);
            }
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.MsgHandler", e, "", new Object[0]);
        }
        return 0;
    }
}
