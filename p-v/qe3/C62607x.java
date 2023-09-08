package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import qe3.C89631w;
import te3.C64577nc;

/* renamed from: qe3.x */
public class C62607x extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public int f177802a;

    /* renamed from: b */
    public int f177803b = 0;

    public int getCmdId() {
        return 312;
    }

    public int getFuncId() {
        return 0;
    }

    public boolean getShortSupport() {
        return false;
    }

    public boolean isRawData() {
        return true;
    }

    public byte[] toProtoBuf() {
        C64577nc ncVar = new C64577nc();
        ncVar.f184455d = C89625d.f257841g;
        ncVar.f184456e = 2;
        ncVar.f184457f = this.f177802a;
        int i = this.f177803b;
        ncVar.f184458g = i;
        Log.m105925i("MicroMsg.MMBgFg", "somr online:%d nettype:%d ver:%d devid:%d", Integer.valueOf(i), Integer.valueOf(ncVar.f184457f), Integer.valueOf(ncVar.f184455d), Integer.valueOf(ncVar.f184456e));
        try {
            return ncVar.toByteArray();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.MMBgFg", "MMBgfg toProtoBuf exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }
}
