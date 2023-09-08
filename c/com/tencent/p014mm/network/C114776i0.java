package com.tencent.p014mm.network;

import android.os.RemoteException;
import com.tencent.mars.Mars;
import com.tencent.mars.p468mm.MMLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kj2.C117407d;
import qe3.C118181k;
import te3.C90420iq;

/* renamed from: com.tencent.mm.network.i0 */
public final class C114776i0 {

    /* renamed from: a */
    public final C114777a[] f344152a = new C114777a[100];

    /* renamed from: com.tencent.mm.network.i0$a */
    public static class C114777a {

        /* renamed from: a */
        public C114800v f344153a;

        /* renamed from: b */
        public C114789o f344154b;

        /* renamed from: c */
        public C81039e f344155c;

        /* renamed from: d */
        public long f344156d;

        /* renamed from: e */
        public int f344157e;

        public C114777a(C114772h0 h0Var) {
        }
    }

    /* renamed from: a */
    public int mo174425a(int i, Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i2) {
        int i3;
        synchronized (this.f344152a) {
            int e = mo174429e(i);
            if (-1 == e) {
                return -1;
            }
            i3 = StnLogic.RESP_FAIL_HANDLE_DEFAULT;
            try {
                byte[] Zi = this.f344152a[e].f344153a.getReqObj().mo139605Zi();
                long eCDHEngine = this.f344152a[e].f344153a.getReqObj().getECDHEngine();
                C118181k respObj = this.f344152a[e].f344153a.getRespObj();
                boolean Zi0 = respObj.Zi0(this.f344152a[e].f344153a.getType(), bArr, Zi, eCDHEngine);
                if (this.f344152a[e].f344153a.getReqObj().mo139603Wl()) {
                    Log.m105918d("MicroMsg.MMNativeNetTaskAdapter", "axauth cgi is axcgi");
                } else {
                    Log.m105918d("MicroMsg.MMNativeNetTaskAdapter", "axauth cgi is not axcgi");
                }
                if (Zi0) {
                    int Df0 = respObj.Df0();
                    iArr2[0] = 0;
                    int Om = respObj.mo182462Om();
                    if ((Df0 & 2) == 0) {
                        iArr2[0] = iArr2[0] | 2;
                        C117407d.INSTANCE.idkeyStat(656, 0, 1, false);
                    }
                    if ((Df0 & 4) == 0) {
                        iArr2[0] = iArr2[0] | 4;
                        C117407d.INSTANCE.idkeyStat(656, 1, 1, false);
                    }
                    if (respObj.getCookie() != null && -13 == respObj.mo182462Om()) {
                        if (this.f344152a[e].f344153a.getReqObj().mo139603Wl()) {
                            Log.m105928w("MicroMsg.MMNativeNetTaskAdapter", "axsession cgi sessionkey timeout");
                            C117407d.INSTANCE.idkeyStat(162, 9, 1, false);
                        }
                        if (C114781l0.m161554a() != null) {
                            C114781l0.m161554a().mo174500s();
                        }
                    }
                    if (-13 == respObj.mo182462Om()) {
                        i3 = StnLogic.RESP_FAIL_HANDLE_SESSION_TIMEOUT;
                        iArr[0] = respObj.mo182462Om();
                    } else {
                        if (!(-3002 == respObj.mo182462Om() || -3003 == respObj.mo182462Om())) {
                            if (-3006 != respObj.mo182462Om()) {
                                if (-3001 == respObj.mo182462Om()) {
                                    i3 = StnLogic.RESP_FAIL_HANDLE_SESSION_TIMEOUT;
                                    iArr[0] = respObj.mo182462Om();
                                } else {
                                    i3 = StnLogic.RESP_FAIL_HANDLE_NORMAL;
                                }
                            }
                        }
                        i3 = StnLogic.RESP_FAIL_HANDLE_TASK_END;
                        iArr[0] = respObj.mo182462Om();
                    }
                    String uri = this.f344152a[e].f344153a.getUri();
                    if (respObj.mo182462Om() == -3800 && this.f344152a[e].f344153a.getReqObj().mo139608aS()) {
                        Log.m105920e("MicroMsg.MMNativeNetTaskAdapter", "ecdh decode failed 3800, " + uri);
                        MMLogic.clearMMtlsForbidenHostAndPsk();
                        i3 = StnLogic.RESP_FAIL_HANDLE_ECDH_VERSON_MISMATCH;
                        iArr[0] = respObj.mo182462Om();
                        C117407d.INSTANCE.idkeyStat(148, 58, 1, false);
                    }
                    if (!C114803y.f344200A.isEmpty() && uri.contains(C114803y.f344200A)) {
                        Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "axauth cgi %s session time", uri);
                        C114803y.f344200A = "";
                        i3 = StnLogic.RESP_FAIL_HANDLE_SESSION_TIMEOUT;
                        iArr[0] = -13;
                        if (C114781l0.m161554a() != null) {
                            C114781l0.m161554a().mo174500s();
                        }
                    }
                } else {
                    C117407d.INSTANCE.idkeyStat(162, 4, 1, false);
                    Log.m105920e("MicroMsg.MMNativeNetTaskAdapter", "buf to resp failed, change server and try again");
                }
            } catch (RemoteException e2) {
                C117407d.INSTANCE.idkeyStat(162, 5, 1, false);
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", Util.stackTraceToString(e2));
            } catch (Exception e3) {
                C117407d.INSTANCE.idkeyStat(162, 7, 1, false);
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", Util.stackTraceToString(e3));
            }
        }
        return i3;
    }

    /* renamed from: b */
    public void mo174426b(int i, int i2, String str) {
        Log.m105924i("MicroMsg.MMNativeNetTaskAdapter", "clearTaskAndCallback errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
        StnLogic.clearTask();
        StnLogic.resetAndInitEncoderVersion(Mars.currentCertVer());
        C114777a[] aVarArr = new C114777a[100];
        synchronized (this.f344152a) {
            for (int i3 = 0; i3 < 100; i3++) {
                C114777a[] aVarArr2 = this.f344152a;
                aVarArr[i3] = aVarArr2[i3];
                aVarArr2[i3] = null;
            }
        }
        for (int i4 = 0; i4 < 100; i4++) {
            if (aVarArr[i4] != null) {
                try {
                    Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi clearTaskAndCallback outQueue: netId:%d hash:%d type:%d", Integer.valueOf(i4), Integer.valueOf(aVarArr[i4].f344153a.getType()), Integer.valueOf(aVarArr[i4].f344153a.mo174479o8()));
                    C114777a aVar = aVarArr[i4];
                    aVar.f344154b.mo174444Rb(i4, i, i2, str, aVar.f344153a, (byte[]) null);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", Util.stackTraceToString(e));
                }
            }
        }
    }

    /* renamed from: c */
    public int mo174427c(int i) {
        synchronized (this.f344152a) {
            int e = mo174429e(i);
            if (-1 == e) {
                Log.m105920e("MicroMsg.MMNativeNetTaskAdapter", "-1 == index");
                return 0;
            }
            try {
                int Om = this.f344152a[e].f344153a.getRespObj().mo182462Om();
                return Om;
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", Util.stackTraceToString(e2));
                return 0;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo174428d() {
        synchronized (this.f344152a) {
            for (int i = 0; i < 100; i++) {
                try {
                    C114777a aVar = this.f344152a[i];
                    if (aVar != null && (252 == aVar.f344153a.getType() || 701 == this.f344152a[i].f344153a.getType() || 702 == this.f344152a[i].f344153a.getType() || 763 == this.f344152a[i].f344153a.getType() || 3941 == this.f344152a[i].f344153a.getType())) {
                        Log.m105928w("MicroMsg.MMNativeNetTaskAdapter", "hasAuthCmd Auth inQueue: netid=" + i + " type=" + this.f344152a[i].f344153a.getType());
                        return true;
                    }
                } catch (RemoteException e) {
                    this.f344152a[i] = null;
                    Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", Util.stackTraceToString(e), Integer.valueOf(i));
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public final int mo174429e(int i) {
        int i2 = 0;
        while (i2 < 100 && ((r2 = this.f344152a[i2]) == null || i != r2.f344157e)) {
            i2++;
        }
        if (100 <= i2) {
            return -1;
        }
        return i2;
    }

    /* renamed from: f */
    public void mo174430f(C90420iq iqVar, StnLogic.CgiProfile cgiProfile) {
        iqVar.f259607n = cgiProfile.taskStartTime;
        iqVar.f259600d = cgiProfile.startConnectTime;
        iqVar.f259601e = cgiProfile.connectSuccessfulTime;
        iqVar.f259602f = cgiProfile.startHandshakeTime;
        iqVar.f259603g = cgiProfile.handshakeSuccessfulTime;
        iqVar.f259604h = cgiProfile.startSendPacketTime;
        iqVar.f259605i = cgiProfile.startReadPacketTime;
        iqVar.f259606j = cgiProfile.readPacketFinishedTime;
        iqVar.f259608o = cgiProfile.rtt;
        iqVar.f259609p = (long) cgiProfile.channelType;
        iqVar.f259610q = (long) cgiProfile.protocolType;
    }

    public void finalize() {
        mo174434i();
        super.finalize();
    }

    /* renamed from: g */
    public final boolean mo174432g(int i) {
        return i == 1000 || i == 502 || i == 930 || i == 503 || i == 654 || i == 755 || i == 931 || i == 733 || i == 784 || i == 722 || i == 627;
    }

    /* renamed from: h */
    public boolean mo174433h(int i, Object obj, ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i2, String str) {
        boolean z;
        int i3;
        byte[] bArr;
        byte[] bArr2;
        int i4;
        C80814d d;
        String str2 = str;
        synchronized (this.f344152a) {
            try {
                int e = mo174429e(i);
                if (-1 == e) {
                    return false;
                }
                boolean q3 = this.f344152a[e].f344155c.mo55436q3(str2);
                int N0 = this.f344152a[e].f344155c.mo55419N0(str2);
                if (q3) {
                    N0 = this.f344152a[e].f344155c.mo55414C2(str2);
                }
                if (MultiProcessMMKV.getDefault().getBoolean("SM4GCM_SWITCH", true) && N0 == 14) {
                    this.f344152a[e].f344153a.setSingleSession(false);
                    this.f344152a[e].f344153a.getReqObj().ne0(this.f344152a[e].f344155c.mo55421S(2));
                }
                if (!this.f344152a[e].f344153a.isSingleSession()) {
                    this.f344152a[e].f344153a.getReqObj().mo139609ao(this.f344152a[e].f344155c.mo55421S(3));
                    Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "summerauths isSingleSession false type:[%s]", Integer.valueOf(this.f344152a[e].f344153a.getType()));
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                if (q3) {
                    Log.m105924i("MicroMsg.MMNativeNetTaskAdapter", "set axauth sessionkey " + str2);
                    this.f344152a[e].f344153a.getReqObj().mo139609ao(this.f344152a[e].f344155c.mo55426f2(str2));
                    byte[] J2 = this.f344152a[e].f344155c.mo55418J2(str2);
                    byte[] q4 = this.f344152a[e].f344155c.mo55437q4(str2);
                    this.f344152a[e].f344153a.getReqObj().mo139607aM(true);
                    if (J2 != null) {
                        Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "axauth sessionkey length[%d]", Integer.valueOf(J2.length));
                    } else {
                        Log.m105928w("MicroMsg.MMNativeNetTaskAdapter", "axauth axsessionkey is null");
                    }
                    if (q4 != null) {
                        Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "axauth cookie length[%d]", Integer.valueOf(q4.length));
                    } else {
                        Log.m105928w("MicroMsg.MMNativeNetTaskAdapter", "axauth cookie is null");
                    }
                    bArr2 = J2;
                    bArr = q4;
                    i3 = 2;
                } else {
                    bArr2 = this.f344152a[e].f344155c.mo55421S(i3);
                    bArr = this.f344152a[e].f344155c.getCookie();
                }
                this.f344152a[e].f344153a.getReqObj().ne0(bArr2);
                if (i3 == 1 && !mo174432g(this.f344152a[e].f344153a.getType())) {
                    this.f344152a[e].f344153a.getReqObj().mo139609ao((byte[]) null);
                }
                if (this.f344152a[e].f344153a.getNewExtFlags() != 0) {
                    this.f344152a[e].f344153a.getReqObj().mo139602Q9(this.f344152a[e].f344153a.getNewExtFlags());
                    this.f344152a[e].f344153a.getReqObj().v10(this.f344152a[e].f344153a.getTransHeader());
                }
                if (WeChatEnvironment.hasDebugger() && (d = C86709a0.m107531m().mo58407a().mo122282d()) != null) {
                    int i5 = Util.getInt(d.mo112569d(".com.tencent.mm.debug.groupKey"), 0);
                    Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "assist groupKey %d", Integer.valueOf(i5));
                    this.f344152a[e].f344153a.getReqObj().Pq0(i5);
                }
                this.f344152a[e].f344153a.getReqObj().mo139610b(this.f344152a[e].f344155c.getUin());
                if (i3 == 2) {
                    if (N0 != 0) {
                        Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "summerauths sm4gcm seesionKeyType=%d, hostAlgo=%d, encryptType=%d", Integer.valueOf(i3), Integer.valueOf(N0), Integer.valueOf(N0));
                        i4 = N0;
                    } else {
                        i4 = 13;
                    }
                    C117407d.INSTANCE.mo160131h(26782, Integer.valueOf(N0), str2, 0, Integer.valueOf(this.f344152a[e].f344153a.getType()), this.f344152a[e].f344153a.getUri());
                } else {
                    i4 = 0;
                }
                this.f344152a[e].f344153a.setReqHost(str2);
                this.f344152a[e].f344153a.setEncryptAlgo(i4);
                z = this.f344152a[e].f344153a.getReqObj().mo139606a9(this.f344152a[e].f344153a.getType(), bArr2, i4, bArr, this.f344152a[e].f344155c.mo55415D(), 0, this.f344152a[e].f344155c.isForeground());
                Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "link: %d req2Buf somr isfg:%b  cookie: %s, type:%d, host:%s, encryptAlgo:%s, cgi:%s", Integer.valueOf(i2), Boolean.valueOf(this.f344152a[e].f344155c.isForeground()), Util.secPrint(Util.encodeHexString(this.f344152a[e].f344155c.getCookie())), Integer.valueOf(this.f344152a[e].f344153a.getType()), str2, Integer.valueOf(i4), this.f344152a[e].f344153a.getUri());
                if (z) {
                    byteArrayOutputStream.write(this.f344152a[e].f344153a.getReqObj().X90());
                } else {
                    iArr[0] = 0;
                    C117407d.INSTANCE.idkeyStat(162, (long) 0, 1, false);
                    Log.m105920e("MicroMsg.MMNativeNetTaskAdapter", "request to buffer using jni failed");
                }
                Log.m105919d("MicroMsg.MMNativeNetTaskAdapter", "req2Buf bOk: %b", Boolean.valueOf(z));
                return z;
            } catch (RemoteException e2) {
                iArr[0] = 1;
                C117407d.INSTANCE.idkeyStat(162, (long) 1, 1, false);
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "RemoteException:%s", Util.stackTraceToString(e2));
            } catch (IOException e3) {
                iArr[0] = 2;
                C117407d.INSTANCE.idkeyStat(162, (long) 2, 1, false);
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "IOException:%s", Util.stackTraceToString(e3));
            } catch (Exception e4) {
                Exception exc = e4;
                iArr[0] = 3;
                C117407d.INSTANCE.idkeyStat(162, (long) 3, 1, false);
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "Exception:%s", Util.stackTraceToString(exc));
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        Log.m105919d("MicroMsg.MMNativeNetTaskAdapter", "req2Buf bOk: %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: i */
    public void mo174434i() {
        Log.m105924i("MicroMsg.MMNativeNetTaskAdapter", "reset");
        StnLogic.resetAndInitEncoderVersion(Mars.currentCertVer());
        synchronized (this.f344152a) {
            for (int i = 0; i < 100; i++) {
                if (this.f344152a[i] != null) {
                    try {
                        Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi reset outQueue: netId:%d hash:%d type:%d", Integer.valueOf(i), Integer.valueOf(this.f344152a[i].f344153a.getType()), Integer.valueOf(this.f344152a[i].f344153a.mo174479o8()));
                        this.f344152a[i] = null;
                    } catch (RemoteException e) {
                        Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", Util.stackTraceToString(e));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0154 A[Catch:{ RemoteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015f A[Catch:{ RemoteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x018d A[Catch:{ RemoteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0195 A[Catch:{ RemoteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x011f A[Catch:{ RemoteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0144 A[Catch:{ RemoteException -> 0x01ea }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo174435j(com.tencent.p014mm.network.C114800v r17, com.tencent.p014mm.network.C114789o r18, com.tencent.p014mm.network.C81039e r19, int r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = -1
            if (r2 != 0) goto L_0x0010
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r2 = "startTask  rr is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return r3
        L_0x0010:
            r17.hashCode()
            com.tencent.mars.stn.StnLogic$Task r4 = new com.tencent.mars.stn.StnLogic$Task
            r4.<init>()
            com.tencent.mm.network.i0$a[] r5 = r1.f344152a
            monitor-enter(r5)
            r6 = 0
            r7 = 0
        L_0x001d:
            r0 = 100
            r8 = 1
            if (r7 >= r0) goto L_0x020f
            com.tencent.mm.network.i0$a[] r0 = r1.f344152a     // Catch:{ RemoteException -> 0x01f7 }
            r9 = r0[r7]     // Catch:{ RemoteException -> 0x01f7 }
            if (r9 != 0) goto L_0x01f0
            com.tencent.mm.network.i0$a r9 = new com.tencent.mm.network.i0$a     // Catch:{ RemoteException -> 0x01f7 }
            r10 = 0
            r9.<init>(r10)     // Catch:{ RemoteException -> 0x01f7 }
            r0[r7] = r9     // Catch:{ RemoteException -> 0x01f7 }
            r9.f344153a = r2     // Catch:{ RemoteException -> 0x01f7 }
            r10 = r18
            r9.f344154b = r10     // Catch:{ RemoteException -> 0x01ec }
            r11 = r19
            r9.f344155c = r11     // Catch:{ RemoteException -> 0x01ea }
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ RemoteException -> 0x01ea }
            r9.f344156d = r12     // Catch:{ RemoteException -> 0x01ea }
            com.tencent.mm.network.i0$a[] r0 = r1.f344152a     // Catch:{ RemoteException -> 0x01ea }
            r0 = r0[r7]     // Catch:{ RemoteException -> 0x01ea }
            int r9 = r4.taskID     // Catch:{ RemoteException -> 0x01ea }
            r0.f344157e = r9     // Catch:{ RemoteException -> 0x01ea }
            qe3.j r0 = r17.getReqObj()     // Catch:{ RemoteException -> 0x01ea }
            int r0 = r0.mo139599M5()     // Catch:{ RemoteException -> 0x01ea }
            r4.cmdID = r0     // Catch:{ RemoteException -> 0x01ea }
            java.lang.String r0 = r17.getUri()     // Catch:{ RemoteException -> 0x01ea }
            r4.cgi = r0     // Catch:{ RemoteException -> 0x01ea }
            boolean r0 = r17.mo174484uw()     // Catch:{ RemoteException -> 0x01ea }
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01ea }
            r9.<init>()     // Catch:{ RemoteException -> 0x01ea }
            java.lang.String r12 = "keep-alive for cgi="
            r9.append(r12)     // Catch:{ RemoteException -> 0x01ea }
            java.lang.String r12 = r4.cgi     // Catch:{ RemoteException -> 0x01ea }
            r9.append(r12)     // Catch:{ RemoteException -> 0x01ea }
            java.lang.String r9 = r9.toString()     // Catch:{ RemoteException -> 0x01ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)     // Catch:{ RemoteException -> 0x01ea }
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.headers     // Catch:{ RemoteException -> 0x01ea }
            java.lang.String r9 = "Connection"
            java.lang.String r12 = "Keep-Alive"
            r0.put(r9, r12)     // Catch:{ RemoteException -> 0x01ea }
        L_0x007f:
            int r0 = r17.getType()     // Catch:{ RemoteException -> 0x01ea }
            int r9 = r17.getOptions()     // Catch:{ RemoteException -> 0x01ea }
            r9 = r9 & r8
            if (r9 == r8) goto L_0x008c
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r4.needAuthed = r9     // Catch:{ RemoteException -> 0x01ea }
            r9 = 126(0x7e, float:1.77E-43)
            r12 = 701(0x2bd, float:9.82E-43)
            r13 = 252(0xfc, float:3.53E-43)
            if (r0 == r9) goto L_0x00a7
            if (r0 == r13) goto L_0x00a7
            if (r0 == r12) goto L_0x00a7
            r9 = 702(0x2be, float:9.84E-43)
            if (r0 == r9) goto L_0x00a7
            r9 = 763(0x2fb, float:1.069E-42)
            if (r0 == r9) goto L_0x00a7
            r9 = 3941(0xf65, float:5.523E-42)
            if (r0 != r9) goto L_0x00af
        L_0x00a7:
            r4.needAuthed = r6     // Catch:{ RemoteException -> 0x01ea }
            if (r0 == r12) goto L_0x00ad
            if (r0 != r13) goto L_0x00af
        L_0x00ad:
            r4.retryCount = r8     // Catch:{ RemoteException -> 0x01ea }
        L_0x00af:
            r9 = 2962(0xb92, float:4.15E-42)
            r12 = 2
            if (r0 != r9) goto L_0x00b6
            r4.retryCount = r12     // Catch:{ RemoteException -> 0x01ea }
        L_0x00b6:
            r4.limitFlow = r8     // Catch:{ RemoteException -> 0x01ea }
            r9 = 149(0x95, float:2.09E-43)
            r13 = 4989(0x137d, float:6.991E-42)
            r14 = 4316(0x10dc, float:6.048E-42)
            r15 = 4302(0x10ce, float:6.028E-42)
            r3 = 3767(0xeb7, float:5.279E-42)
            r12 = 703(0x2bf, float:9.85E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 193(0xc1, float:2.7E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 110(0x6e, float:1.54E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 220(0xdc, float:3.08E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 323(0x143, float:4.53E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 324(0x144, float:4.54E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 326(0x146, float:4.57E-43)
            if (r0 == r9) goto L_0x00f0
            r9 = 327(0x147, float:4.58E-43)
            if (r0 == r9) goto L_0x00f0
            if (r0 == r12) goto L_0x00f0
            r9 = 2580(0xa14, float:3.615E-42)
            if (r0 == r9) goto L_0x00f0
            if (r0 == r3) goto L_0x00f0
            if (r0 == r15) goto L_0x00f0
            if (r0 == r14) goto L_0x00f0
            if (r0 != r13) goto L_0x00f2
        L_0x00f0:
            r4.limitFlow = r6     // Catch:{ RemoteException -> 0x01ea }
        L_0x00f2:
            if (r0 == r12) goto L_0x00fc
            if (r0 == r3) goto L_0x00fc
            if (r0 == r15) goto L_0x00fc
            if (r0 == r14) goto L_0x00fc
            if (r0 != r13) goto L_0x00fe
        L_0x00fc:
            r4.limitFrequency = r6     // Catch:{ RemoteException -> 0x01ea }
        L_0x00fe:
            r4.channelStrategy = r6     // Catch:{ RemoteException -> 0x01ea }
            r3 = 233(0xe9, float:3.27E-43)
            if (r0 == r3) goto L_0x010c
            r3 = 835(0x343, float:1.17E-42)
            if (r0 == r3) goto L_0x010c
            r3 = 238(0xee, float:3.34E-43)
            if (r0 != r3) goto L_0x010e
        L_0x010c:
            r4.channelStrategy = r8     // Catch:{ RemoteException -> 0x01ea }
        L_0x010e:
            r4.sendOnly = r6     // Catch:{ RemoteException -> 0x01ea }
            r3 = 10
            if (r0 == r3) goto L_0x011c
            r3 = 268369922(0xfff0002, float:2.5144944E-29)
            if (r0 != r3) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r3 = 0
            goto L_0x011d
        L_0x011c:
            r3 = 1
        L_0x011d:
            if (r3 == 0) goto L_0x0121
            r4.sendOnly = r8     // Catch:{ RemoteException -> 0x01ea }
        L_0x0121:
            qe3.j r3 = r17.getReqObj()     // Catch:{ RemoteException -> 0x01ea }
            boolean r3 = r3.P50()     // Catch:{ RemoteException -> 0x01ea }
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = r17.getUri()     // Catch:{ RemoteException -> 0x01ea }
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = r17.getUri()     // Catch:{ RemoteException -> 0x01ea }
            int r3 = r3.length()     // Catch:{ RemoteException -> 0x01ea }
            if (r3 <= 0) goto L_0x0140
            int r3 = r4.channelSelect     // Catch:{ RemoteException -> 0x01ea }
            r3 = r3 | r8
            r4.channelSelect = r3     // Catch:{ RemoteException -> 0x01ea }
        L_0x0140:
            int r3 = r4.cmdID     // Catch:{ RemoteException -> 0x01ea }
            if (r3 == 0) goto L_0x014a
            int r3 = r4.channelSelect     // Catch:{ RemoteException -> 0x01ea }
            r9 = 2
            r3 = r3 | r9
            r4.channelSelect = r3     // Catch:{ RemoteException -> 0x01ea }
        L_0x014a:
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ RemoteException -> 0x01ea }
            r4.reportArg = r3     // Catch:{ RemoteException -> 0x01ea }
            r3 = 522(0x20a, float:7.31E-43)
            if (r0 != r3) goto L_0x015b
            r3 = 300000(0x493e0, float:4.2039E-40)
            r4.totalTimeout = r3     // Catch:{ RemoteException -> 0x01ea }
            r4.priority = r6     // Catch:{ RemoteException -> 0x01ea }
        L_0x015b:
            r3 = 710(0x2c6, float:9.95E-43)
            if (r0 != r3) goto L_0x0165
            r3 = 15000(0x3a98, float:2.102E-41)
            r4.totalTimeout = r3     // Catch:{ RemoteException -> 0x01ea }
            r4.serverProcessCost = r6     // Catch:{ RemoteException -> 0x01ea }
        L_0x0165:
            r3 = 2632(0xa48, float:3.688E-42)
            if (r0 != r3) goto L_0x0171
            int r3 = r17.getTimeOut()     // Catch:{ RemoteException -> 0x01ea }
            if (r3 == 0) goto L_0x0171
            r4.totalTimeout = r3     // Catch:{ RemoteException -> 0x01ea }
        L_0x0171:
            r3 = 5105(0x13f1, float:7.154E-42)
            if (r0 != r3) goto L_0x017d
            int r3 = r17.getTimeOut()     // Catch:{ RemoteException -> 0x01ea }
            if (r3 == 0) goto L_0x017d
            r4.totalTimeout = r3     // Catch:{ RemoteException -> 0x01ea }
        L_0x017d:
            r3 = 5057(0x13c1, float:7.086E-42)
            if (r0 != r3) goto L_0x0189
            int r3 = r17.getTimeOut()     // Catch:{ RemoteException -> 0x01ea }
            if (r3 == 0) goto L_0x0189
            r4.totalTimeout = r3     // Catch:{ RemoteException -> 0x01ea }
        L_0x0189:
            r3 = 3686(0xe66, float:5.165E-42)
            if (r0 != r3) goto L_0x018f
            r4.retryCount = r6     // Catch:{ RemoteException -> 0x01ea }
        L_0x018f:
            boolean r0 = r17.getIsLongPolling()     // Catch:{ RemoteException -> 0x01ea }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r3 = "this is long-polling cgi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ RemoteException -> 0x01ea }
            r4.longPolling = r8     // Catch:{ RemoteException -> 0x01ea }
            int r0 = r17.getLongPollingTimeout()     // Catch:{ RemoteException -> 0x01ea }
            r4.longPollingTimeout = r0     // Catch:{ RemoteException -> 0x01ea }
            int r0 = r17.getTimeOut()     // Catch:{ RemoteException -> 0x01ea }
            if (r0 == 0) goto L_0x01ad
            r4.totalTimeout = r0     // Catch:{ RemoteException -> 0x01ea }
        L_0x01ad:
            r4.retryCount = r6     // Catch:{ RemoteException -> 0x01ea }
        L_0x01af:
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r3 = "mmcgi startTask inQueue netid:%d hash[%d,%d] net:%d cgi:%s needAuthed:%b"
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x01ea }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ RemoteException -> 0x01ea }
            r9[r6] = r12     // Catch:{ RemoteException -> 0x01ea }
            int r12 = r4.taskID     // Catch:{ RemoteException -> 0x01ea }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ RemoteException -> 0x01ea }
            r9[r8] = r12     // Catch:{ RemoteException -> 0x01ea }
            int r12 = r17.mo174479o8()     // Catch:{ RemoteException -> 0x01ea }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ RemoteException -> 0x01ea }
            r13 = 2
            r9[r13] = r12     // Catch:{ RemoteException -> 0x01ea }
            r12 = 3
            int r13 = r4.channelSelect     // Catch:{ RemoteException -> 0x01ea }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ RemoteException -> 0x01ea }
            r9[r12] = r13     // Catch:{ RemoteException -> 0x01ea }
            r12 = 4
            java.lang.String r13 = r4.cgi     // Catch:{ RemoteException -> 0x01ea }
            r9[r12] = r13     // Catch:{ RemoteException -> 0x01ea }
            r12 = 5
            boolean r13 = r4.needAuthed     // Catch:{ RemoteException -> 0x01ea }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ RemoteException -> 0x01ea }
            r9[r12] = r13     // Catch:{ RemoteException -> 0x01ea }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r9)     // Catch:{ RemoteException -> 0x01ea }
            goto L_0x0210
        L_0x01ea:
            r0 = move-exception
            goto L_0x01fb
        L_0x01ec:
            r0 = move-exception
        L_0x01ed:
            r11 = r19
            goto L_0x01fb
        L_0x01f0:
            r10 = r18
            r11 = r19
            goto L_0x020a
        L_0x01f5:
            r0 = move-exception
            goto L_0x023e
        L_0x01f7:
            r0 = move-exception
            r10 = r18
            goto L_0x01ed
        L_0x01fb:
            java.lang.String r3 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r9 = "exception:%s"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x01f5 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x01f5 }
            r8[r6] = r0     // Catch:{ all -> 0x01f5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r9, r8)     // Catch:{ all -> 0x01f5 }
        L_0x020a:
            int r7 = r7 + 1
            r3 = -1
            goto L_0x001d
        L_0x020f:
            r7 = -1
        L_0x0210:
            monitor-exit(r5)     // Catch:{ all -> 0x01f5 }
            r2 = -1
            if (r2 == r7) goto L_0x021e
            r2 = r20
            if (r2 != r8) goto L_0x021a
            r4.retryCount = r6
        L_0x021a:
            com.tencent.mars.stn.StnLogic.startTask(r4)
            goto L_0x0226
        L_0x021e:
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r2 = "startTask err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x0226:
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "startTask retsult="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return r7
        L_0x023e:
            monitor-exit(r5)     // Catch:{ all -> 0x01f5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114776i0.mo174435j(com.tencent.mm.network.v, com.tencent.mm.network.o, com.tencent.mm.network.e, int):int");
    }
}
