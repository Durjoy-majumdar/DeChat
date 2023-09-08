package ob0;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116746l3;
import f40.C86709a0;
import lc3.C10485b;
import p156gj.C87200o;
import p156gj.C87203t;
import qe3.C101127f;
import qe3.C89625d;
import qe3.C89626p;
import qe3.C89631w;

/* renamed from: ob0.w */
public abstract class C117746w implements C114799u {
    private static final String TAG = "MicroMsg.MMReqRespBase";
    private int encryptAlgo = 0;
    private boolean isSingleSession = true;
    private boolean isUserCmd = false;
    private C89631w.C89634d req;
    private String reqHost;

    public static void fillBaseReq(C89631w.C89634d dVar, C117746w wVar) {
        Class cls = C10485b.class;
        dVar.setDeviceID(C87203t.m108273i());
        int i = C89625d.f257835a;
        dVar.setDeviceType(C87200o.f252868a);
        dVar.setClientVersion(C89625d.f257841g);
        dVar.setUin(((C116746l3) C89626p.C89627a.f257849a).mo180722b());
        if (C86709a0.m107522a()) {
            int type = wVar.getType();
            boolean z = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("UseAesGcmSessionKeySwitch", 1) == 0;
            Log.m105925i(TAG, "summerauths check cgi[%s] accHasReady openSwitch[%s] ", Integer.valueOf(type), Boolean.valueOf(z));
            if (z) {
                String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("UseAesGcmSessionKeyCgiList");
                if (!Util.isNullOrNil(c)) {
                    Log.m105925i(TAG, "summerauths check cgi list[%s]", c);
                    String[] split = c.trim().split(",");
                    if (split.length > 0) {
                        for (String str : split) {
                            if (type == Util.getInt(str, 0)) {
                                wVar.setSingleSession(false);
                                Log.m105925i(TAG, "summerauths check cgi list found cgi[%s] singleSession[%s]", str, Boolean.valueOf(wVar.isSingleSession()));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Log.m105925i(TAG, "summerauths check cgi[%s] USE_ECDH[%s] accHasReady[%s] ", Integer.valueOf(dVar.getCmdId()), Boolean.valueOf(C101127f.f296015a), Boolean.valueOf(C86709a0.m107522a()));
    }

    public int getEncryptAlgo() {
        return this.encryptAlgo;
    }

    public boolean getIsLongPolling() {
        return false;
    }

    public boolean getIsUserCmd() {
        return this.isUserCmd;
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

    public boolean getPush() {
        return false;
    }

    public String getReqHost() {
        return this.reqHost;
    }

    public final C89631w.C89634d getReqObj() {
        if (this.req == null) {
            C89631w.C89634d reqObjImp = getReqObjImp();
            this.req = reqObjImp;
            fillBaseReq(reqObjImp, this);
        }
        return this.req;
    }

    public abstract C89631w.C89634d getReqObjImp();

    public int getTimeOut() {
        return 0;
    }

    public byte[] getTransHeader() {
        return null;
    }

    public boolean isSingleSession() {
        return this.isSingleSession;
    }

    public boolean keepAlive() {
        return false;
    }

    public void setConnectionInfo(String str) {
    }

    public void setEncryptAlgo(int i) {
        this.encryptAlgo = i;
    }

    public void setIsUserCmd(boolean z) {
        this.isUserCmd = z;
    }

    public void setReqHost(String str) {
        this.reqHost = str;
    }

    public void setSingleSession(boolean z) {
        this.isSingleSession = z;
    }
}
