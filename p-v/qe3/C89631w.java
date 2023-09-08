package qe3;

import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import pe3.C89349b;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C90417ia;
import te3.C90420iq;

/* renamed from: qe3.w */
public final class C89631w {

    /* renamed from: qe3.w$a */
    public interface C89632a {
        /* renamed from: a */
        boolean mo75491a(PByteArray pByteArray, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, boolean z, int i3, int i4);
    }

    /* renamed from: qe3.w$b */
    public interface C89633b {
        long getECDHEngine();

        int getFuncId();

        int getRouteInfo();

        boolean isAxAuth();

        boolean isRawData();

        byte[] toProtoBuf();
    }

    /* renamed from: qe3.w$d */
    public static class C89634d {
        private static final String TAG = "MicroMsg.MMBase.Req";
        private boolean bShortSupport = true;
        private long bufferSize = 0;
        private C114766b.C114767a cgiVerifyKeys;
        private long ecdhEngine = 0;
        private int iClientVersion = 0;
        private int iSceneStatus = 0;
        private int iUin = 0;
        private C89632a mReqPackControl;
        private byte[] passKey;
        private int routeInfo = 0;
        private C101125b1 rsaInfo = new C101125b1("", "", 0);
        private String sDeviceID = "";
        private String sDeviceType = "";
        private byte[] sessionKey = new byte[0];
        private boolean useAxSession = false;
        private boolean useECDH = false;

        public long getBufferSize() {
            return this.bufferSize;
        }

        public String getCgiVerifyPrivateKey() {
            C114766b.C114767a aVar = this.cgiVerifyKeys;
            return aVar != null ? aVar.f344140a : "";
        }

        public String getCgiVerifyPublicKey() {
            C114766b.C114767a aVar = this.cgiVerifyKeys;
            return aVar != null ? aVar.f344141b : "";
        }

        public int getClientVersion() {
            return this.iClientVersion;
        }

        public int getCmdId() {
            return 0;
        }

        public String getDeviceID() {
            return this.sDeviceID;
        }

        public String getDeviceType() {
            return this.sDeviceType;
        }

        public long getECDHEngine() {
            return this.ecdhEngine;
        }

        public byte[] getPassKey() {
            return this.passKey;
        }

        public C89632a getReqPackControl() {
            return this.mReqPackControl;
        }

        public int getRouteInfo() {
            return this.routeInfo;
        }

        public C101125b1 getRsaInfo() {
            return this.rsaInfo;
        }

        public int getSceneStatus() {
            return this.iSceneStatus;
        }

        public byte[] getSessionKey() {
            return this.sessionKey;
        }

        public boolean getShortSupport() {
            return this.bShortSupport;
        }

        public int getUin() {
            return this.iUin;
        }

        public boolean isAxAuth() {
            return false;
        }

        public boolean isRawData() {
            return false;
        }

        public boolean packToNetMsg(PByteArray pByteArray) {
            return false;
        }

        public void setBufferSize(long j) {
            this.bufferSize = j;
        }

        public void setCGiVerifyKey(C114766b.C114767a aVar) {
            this.cgiVerifyKeys = aVar;
        }

        public void setClientVersion(int i) {
            this.iClientVersion = i;
        }

        public void setDeviceID(String str) {
            this.sDeviceID = str;
        }

        public void setDeviceType(String str) {
            this.sDeviceType = str;
        }

        public void setEcdhEngine(long j) {
            this.ecdhEngine = j;
        }

        public void setPassKey(byte[] bArr) {
            this.passKey = bArr;
        }

        public void setReqPackControl(C89632a aVar) {
            this.mReqPackControl = aVar;
        }

        public void setRouteInfo(int i) {
            this.routeInfo = i;
        }

        public void setRsaInfo(C101125b1 b1Var) {
            this.rsaInfo = b1Var;
            Log.m105925i(TAG, "summerauths setRsaInfo cgi[%s], USE_ECDH[%b], stack[%s]", Integer.valueOf(getCmdId()), Boolean.valueOf(C101127f.f296015a), Util.getStack());
            if (C101127f.f296015a) {
                setUseECDH(true);
            }
        }

        public void setSceneStatus(int i) {
            this.iSceneStatus = i;
        }

        public void setSessionKey(byte[] bArr) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.sessionKey = bArr;
        }

        public void setShortSupport(boolean z) {
            this.bShortSupport = z;
        }

        public void setUin(int i) {
            this.iUin = i;
        }

        public void setUseAxsession(boolean z) {
            this.useAxSession = z;
        }

        public void setUseECDH(boolean z) {
            this.useECDH = z;
            Log.m105925i(TAG, "summerauths setUseECDH[%s]  cgi[%s], stack[%s]", Boolean.valueOf(z), Integer.valueOf(getCmdId()), Util.getStack());
        }

        public boolean useAxSession() {
            return this.useAxSession;
        }

        public boolean useECDH() {
            return this.useECDH;
        }
    }

    /* renamed from: qe3.w$c */
    public interface C89635c {
        int fromProtoBuf(byte[] bArr);

        boolean isRawData();
    }

    /* renamed from: qe3.w$e */
    public static class C89636e {
        private long bufferSize = 0;
        private int iHeadExtFlags = 255;
        private int iRetCode = -99;
        private C90420iq profile;
        private String sErrMsg = "";

        public byte[] getAuthResponse() {
            return null;
        }

        public long getBufferSize() {
            return this.bufferSize;
        }

        public int getCmdId() {
            return 0;
        }

        public String getErrMsg() {
            return this.sErrMsg;
        }

        public int getHeadExtFlags() {
            return this.iHeadExtFlags;
        }

        public C90420iq getProfile() {
            return this.profile;
        }

        public int getRetCode() {
            return this.iRetCode;
        }

        public boolean isRawData() {
            return false;
        }

        public void setBufferSize(long j) {
            this.bufferSize = j;
        }

        public void setErrMsg(String str) {
            this.sErrMsg = str;
        }

        public void setHeadExtFlags(int i) {
            this.iHeadExtFlags = i;
        }

        public void setProfile(byte[] bArr) {
            C90420iq iqVar = new C90420iq();
            this.profile = iqVar;
            try {
                iqVar.parseFrom(bArr);
            } catch (Exception e) {
                Log.m105920e("setProfile", e.getLocalizedMessage());
            }
        }

        public void setRetCode(int i) {
            this.iRetCode = i;
        }
    }

    /* renamed from: a */
    public static C90417ia m112065a(C89634d dVar) {
        C90417ia iaVar = new C90417ia();
        iaVar.f259573g = dVar.getClientVersion();
        iaVar.f259575i = dVar.getSceneStatus();
        iaVar.f259571e = dVar.getUin();
        C89349b a = C89349b.m111674a(dVar.getDeviceID().getBytes());
        iaVar.f259572f = a;
        if (a.f257327a.length >= 16) {
            a.mo123701d(16);
            iaVar.f259572f = a;
        }
        C89349b a2 = C89349b.m111674a(dVar.getDeviceType().getBytes());
        iaVar.f259574h = a2;
        if (a2.f257327a.length >= 132) {
            a2.mo123701d(132);
            iaVar.f259574h = a2;
        }
        try {
            String str = new String("\u0000");
            C89349b bVar = new C89349b();
            bVar.f257327a = str.getBytes("UTF-8");
            iaVar.f259570d = bVar;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMBase", e.getLocalizedMessage());
        }
        return iaVar;
    }

    /* renamed from: b */
    public static void m112066b(C89636e eVar, C49966ja jaVar) {
        C51163rv3 rv32 = jaVar.f135956e;
        if (rv32 != null) {
            eVar.setErrMsg(rv32.f141175d);
            return;
        }
        eVar.setErrMsg("");
        Log.m105920e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
    }
}
