package pc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import p156gj.C87200o;
import p156gj.C87203t;
import qe3.C118190r0;
import qe3.C118192s0;
import qe3.C89625d;
import qe3.C89631w;

/* renamed from: pc0.p */
public final class C118014p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f352763d;

    /* renamed from: e */
    public C114799u f352764e;

    /* renamed from: f */
    public long f352765f;

    /* renamed from: g */
    public byte[] f352766g;

    /* renamed from: h */
    public int f352767h = 0;

    /* renamed from: pc0.p$a */
    public static class C118015a extends C117746w {

        /* renamed from: a */
        public final C118190r0 f352768a = new C118190r0();

        /* renamed from: b */
        public final C118192s0 f352769b = new C118192s0();

        public int getEncryptAlgo() {
            return 0;
        }

        public String getReqHost() {
            return "";
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f352768a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f352769b;
        }

        public int getTimeOut() {
            return 0;
        }

        public int getType() {
            return 268369922;
        }

        public String getUri() {
            return null;
        }

        public void setEncryptAlgo(int i) {
        }

        public void setReqHost(String str) {
        }
    }

    /* renamed from: pc0.p$b */
    public static class C118016b implements C114799u {

        /* renamed from: a */
        public final C118190r0 f352770a = new C118190r0();

        /* renamed from: b */
        public final C118192s0 f352771b = new C118192s0();

        /* renamed from: c */
        public int f352772c;

        public int getEncryptAlgo() {
            return 0;
        }

        public boolean getIsLongPolling() {
            return false;
        }

        public boolean getIsUserCmd() {
            return false;
        }

        public int getLongPollingTimeout() {
            return 0;
        }

        public int getNewExtFlags() {
            return 0;
        }

        public int getOptions() {
            return 0;
        }

        public String getReqHost() {
            return "";
        }

        public C89631w.C89634d getReqObj() {
            this.f352770a.setDeviceID(C87203t.m108273i());
            C118190r0 r0Var = this.f352770a;
            int i = C89625d.f257835a;
            r0Var.setDeviceType(C87200o.f252868a);
            this.f352770a.setClientVersion(C89625d.f257841g);
            this.f352770a.setUin(this.f352772c);
            return this.f352770a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f352771b;
        }

        public int getTimeOut() {
            return 0;
        }

        public byte[] getTransHeader() {
            return null;
        }

        public int getType() {
            return 268369922;
        }

        public String getUri() {
            return null;
        }

        public boolean isSingleSession() {
            return true;
        }

        public boolean keepAlive() {
            return false;
        }

        public void setConnectionInfo(String str) {
        }

        public void setEncryptAlgo(int i) {
        }

        public void setReqHost(String str) {
        }

        public void setSingleSession(boolean z) {
        }
    }

    public C118014p(long j, byte[] bArr) {
        this.f352765f = j;
        this.f352766g = bArr;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (Util.isNullOrNil(this.f352766g)) {
            Log.m105921e("MicroMsg.NetSceneNotifyData", "dkpush %s", "get keyBuf failed");
            return -1;
        }
        if (this.f352767h == 0) {
            this.f352764e = new C118015a();
        } else {
            C118016b bVar = new C118016b();
            this.f352764e = bVar;
            bVar.f352772c = this.f352767h;
        }
        Log.m105925i("MicroMsg.NetSceneNotifyData", "doScene now:%d buf:%s", Long.valueOf(this.f352765f), Util.dumpHexBuf(this.f352766g));
        ((C118190r0) this.f352764e.getReqObj()).f353313b = this.f352765f;
        ((C118190r0) this.f352764e.getReqObj()).f353312a = this.f352766g;
        this.f352763d = nVar;
        return dispatch(gVar, this.f352764e, this);
    }

    public int getType() {
        return 268369922;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneNotifyData", "onGYNetEnd [%d,%d] %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f352763d.onSceneEnd(i2, i3, str, this);
    }
}
