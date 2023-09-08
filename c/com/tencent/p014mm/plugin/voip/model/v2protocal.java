package com.tencent.p014mm.plugin.voip.model;

import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Message;
import android.text.format.Formatter;
import android.view.Surface;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.plugin.voip.model.C106340f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31519v2;
import fy3.C32224a;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import l33.C109247e;
import p156gj.C107823c;
import p156gj.C107835h0;
import p156gj.C107842p;
import p156gj.C87203t;
import p206nj.C76866m;
import p206nj.C88957l;
import p723vf.C90773a;
import p734vz.C102300g;
import p80.C110194c;
import pu0.C110248b;
import rx3.C13598b0;
import te3.C101864x23;
import te3.dv4;
import te3.gv4;
import te3.wv4;
import w80.C111744e;
import z33.C112593f;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.v2protocal */
public class v2protocal {

    /* renamed from: R1 */
    public static int f317531R1;

    /* renamed from: S1 */
    public static final int f317532S1;

    /* renamed from: T1 */
    public static boolean f317533T1 = false;

    /* renamed from: U1 */
    public static boolean f317534U1 = false;

    /* renamed from: V1 */
    public static boolean f317535V1 = false;

    /* renamed from: W1 */
    public static boolean f317536W1 = false;

    /* renamed from: X1 */
    public static int f317537X1 = 0;

    /* renamed from: Y1 */
    public static boolean f317538Y1 = false;

    /* renamed from: Z1 */
    public static int f317539Z1 = 0;

    /* renamed from: a2 */
    public static int f317540a2 = 0;

    /* renamed from: b2 */
    public static int f317541b2 = 0;

    /* renamed from: c2 */
    public static int f317542c2 = 10;

    /* renamed from: d2 */
    public static C106340f.C106341a f317543d2;

    /* renamed from: e2 */
    public static C106339e f317544e2 = null;

    /* renamed from: f2 */
    public static Surface f317545f2 = null;

    /* renamed from: g2 */
    public static C110194c f317546g2 = null;

    /* renamed from: h2 */
    public static SurfaceTexture f317547h2;

    /* renamed from: A */
    public int f317548A = 999;

    /* renamed from: A0 */
    public int f317549A0 = 0;

    /* renamed from: A1 */
    public byte[] f317550A1;

    /* renamed from: B */
    public int f317551B = 0;

    /* renamed from: B0 */
    public int f317552B0 = -1;

    /* renamed from: B1 */
    public byte[] f317553B1;

    /* renamed from: C */
    public long f317554C = 0;

    /* renamed from: C0 */
    public int f317555C0 = 0;

    /* renamed from: C1 */
    public byte[] f317556C1;

    /* renamed from: D */
    public byte[] f317557D = null;

    /* renamed from: D0 */
    public int f317558D0 = 0;

    /* renamed from: D1 */
    public byte[] f317559D1;

    /* renamed from: E */
    public byte[] f317560E = null;

    /* renamed from: E0 */
    public int f317561E0 = 0;

    /* renamed from: E1 */
    public byte[] f317562E1;

    /* renamed from: F */
    public byte[] f317563F = new byte[10];

    /* renamed from: F0 */
    public int f317564F0 = 0;

    /* renamed from: F1 */
    public int[] f317565F1;

    /* renamed from: G */
    public int f317566G = 20;

    /* renamed from: G0 */
    public int f317567G0 = 100;

    /* renamed from: G1 */
    public C106401z f317568G1;

    /* renamed from: H */
    public int f317569H = 0;

    /* renamed from: H0 */
    public int f317570H0 = 300;

    /* renamed from: H1 */
    public int f317571H1;

    /* renamed from: I */
    public int f317572I = 0;

    /* renamed from: I0 */
    public int f317573I0 = 1;

    /* renamed from: I1 */
    public int f317574I1;

    /* renamed from: J */
    public int f317575J = 0;

    /* renamed from: J0 */
    public int f317576J0 = 1;

    /* renamed from: J1 */
    public MMHandler f317577J1;

    /* renamed from: K */
    public int f317578K = 0;

    /* renamed from: K0 */
    public int f317579K0 = 0;

    /* renamed from: K1 */
    public boolean f317580K1;

    /* renamed from: L */
    public int f317581L = 0;

    /* renamed from: L0 */
    public int f317582L0 = 1;

    /* renamed from: L1 */
    public volatile C106340f f317583L1;

    /* renamed from: M */
    public int f317584M = 65536;

    /* renamed from: M0 */
    public int f317585M0 = 0;

    /* renamed from: M1 */
    public int f317586M1;

    /* renamed from: N */
    public int f317587N = 0;

    /* renamed from: N0 */
    public int f317588N0 = 0;

    /* renamed from: N1 */
    public int f317589N1;

    /* renamed from: O */
    public int f317590O = 0;

    /* renamed from: O0 */
    public int f317591O0 = 0;

    /* renamed from: O1 */
    public int f317592O1;

    /* renamed from: P */
    public int f317593P = 0;

    /* renamed from: P0 */
    public int f317594P0 = 0;

    /* renamed from: P1 */
    public int f317595P1;

    /* renamed from: Q */
    public int f317596Q = 7;

    /* renamed from: Q0 */
    public int f317597Q0 = 0;

    /* renamed from: Q1 */
    public boolean f317598Q1;

    /* renamed from: R */
    public int f317599R = 3;

    /* renamed from: R0 */
    public int f317600R0 = 0;

    /* renamed from: S */
    public int f317601S = 3;

    /* renamed from: S0 */
    public int f317602S0 = 0;

    /* renamed from: T */
    public int f317603T = 0;

    /* renamed from: T0 */
    public int f317604T0 = 0;

    /* renamed from: U */
    public int f317605U = 0;

    /* renamed from: U0 */
    public int f317606U0 = 0;

    /* renamed from: V */
    public int f317607V = -1;

    /* renamed from: V0 */
    public int f317608V0 = 0;

    /* renamed from: W */
    public int f317609W = -1;

    /* renamed from: W0 */
    public int[] f317610W0 = null;

    /* renamed from: X */
    public int f317611X = -1;

    /* renamed from: X0 */
    public int f317612X0 = 0;

    /* renamed from: Y */
    public int f317613Y = -1;

    /* renamed from: Y0 */
    public int f317614Y0 = 0;

    /* renamed from: Z */
    public int f317615Z = -1;

    /* renamed from: Z0 */
    public int f317616Z0 = 0;

    /* renamed from: a */
    public boolean f317617a = false;

    /* renamed from: a0 */
    public int f317618a0 = -1;

    /* renamed from: a1 */
    public int f317619a1 = 0;

    /* renamed from: b */
    public String f317620b = null;

    /* renamed from: b0 */
    public int f317621b0 = -1;

    /* renamed from: b1 */
    public byte[] f317622b1 = null;

    /* renamed from: c */
    public int f317623c = C0947jz.f2205e;

    /* renamed from: c0 */
    public int f317624c0 = 0;

    /* renamed from: c1 */
    public int f317625c1 = 0;

    /* renamed from: d */
    public int f317626d = 240;

    /* renamed from: d0 */
    public int f317627d0 = -1;

    /* renamed from: d1 */
    public int f317628d1 = 0;

    /* renamed from: e */
    public int f317629e = 0;

    /* renamed from: e0 */
    public int f317630e0 = -1;

    /* renamed from: e1 */
    public int f317631e1 = 0;

    /* renamed from: f */
    public int f317632f = 0;

    /* renamed from: f0 */
    public int f317633f0 = -1;

    /* renamed from: f1 */
    public int f317634f1 = 0;
    public int[] field_ChannelReportDial = null;
    public int[] field_EngineReportStatFromApp = null;
    public int field_HWEncH;
    public int field_HWEncW;
    public int field_audioDuration;
    public byte[] field_capInfo = null;
    public int field_channelReportLength;
    public int field_channelStatLength;
    public int field_connectingStatusKey;
    public int field_engine2ndReportLength;
    public int field_engine2ndStatLength;
    public int field_engineQosStatLength;
    public int field_engineVersionStatLength;
    public int[] field_jbmBitratRsSvrParamArray;
    public double[] field_jbmBitratRsSvrParamDoubleArray;
    public int field_jbmParamArraySize;
    public int field_jbmParamDoubleArraySize;
    public int field_localImgHeight;
    public int field_localImgWidth;
    public int field_mGetValidSample = 0;
    public int[] field_natSvrArray = null;
    public int field_netFlowRecv;
    public int field_netFlowSent;
    public int field_newEngineExtStatLength;
    public int field_newEngineReportLength;
    public int field_newEngineStatLength;
    public byte[] field_peerId = null;
    public int field_pstnChannelInfoLength;
    public int field_pstnEngineInfoLength;
    public int field_realLinkQualityInfoBuffLen;
    public int field_recvVideoLen;
    public int field_relayDataSyncKey;
    public int field_remoteImgHeight;
    public int field_remoteImgLength;
    public int field_remoteImgOrien;
    public int field_remoteImgWidth;
    public int field_sendVideoLen;
    public int field_speedTestInfoLength;
    public int field_statInfoLength;
    public int field_statusSyncKey;
    public int field_videoDuration;

    /* renamed from: g */
    public String f317635g = "";

    /* renamed from: g0 */
    public int f317636g0 = 0;

    /* renamed from: g1 */
    public byte[] f317637g1 = new byte[1500];

    /* renamed from: h */
    public int f317638h = 0;

    /* renamed from: h0 */
    public int f317639h0 = 0;

    /* renamed from: h1 */
    public int f317640h1 = 0;

    /* renamed from: i */
    public String f317641i = "";

    /* renamed from: i0 */
    public int f317642i0 = 0;

    /* renamed from: i1 */
    public byte[] f317643i1 = null;

    /* renamed from: j */
    public String f317644j = "";

    /* renamed from: j0 */
    public int f317645j0 = 0;

    /* renamed from: j1 */
    public byte[] f317646j1 = null;

    /* renamed from: k */
    public long f317647k = 0;

    /* renamed from: k0 */
    public int f317648k0 = 0;

    /* renamed from: k1 */
    public int f317649k1 = 0;

    /* renamed from: l */
    public long f317650l = 0;

    /* renamed from: l0 */
    public int f317651l0 = 0;

    /* renamed from: l1 */
    public int f317652l1 = 0;

    /* renamed from: m */
    public int f317653m = 0;

    /* renamed from: m0 */
    public int f317654m0 = 0;

    /* renamed from: m1 */
    public int f317655m1 = 0;

    /* renamed from: n */
    public int f317656n = 0;

    /* renamed from: n0 */
    public String f317657n0 = "";

    /* renamed from: n1 */
    public int f317658n1 = 0;

    /* renamed from: o */
    public long f317659o = 0;

    /* renamed from: o0 */
    public int f317660o0 = 0;

    /* renamed from: o1 */
    public int f317661o1 = 0;

    /* renamed from: p */
    public int f317662p = 0;

    /* renamed from: p0 */
    public int f317663p0 = -1;

    /* renamed from: p1 */
    public byte[] f317664p1 = null;

    /* renamed from: q */
    public long f317665q = 0;

    /* renamed from: q0 */
    public int f317666q0 = 0;

    /* renamed from: q1 */
    public byte[] f317667q1 = null;

    /* renamed from: r */
    public int f317668r = 0;

    /* renamed from: r0 */
    public int f317669r0 = 0;

    /* renamed from: r1 */
    public byte[] f317670r1 = null;

    /* renamed from: s */
    public byte[] f317671s = null;

    /* renamed from: s0 */
    public int f317672s0 = 0;

    /* renamed from: s1 */
    public long f317673s1;

    /* renamed from: t */
    public volatile byte[] f317674t = null;

    /* renamed from: t0 */
    public int f317675t0 = 0;

    /* renamed from: t1 */
    public byte[] f317676t1;

    /* renamed from: u */
    public byte[] f317677u = null;

    /* renamed from: u0 */
    public int f317678u0 = 0;

    /* renamed from: u1 */
    public int f317679u1;

    /* renamed from: v */
    public int f317680v = 0;

    /* renamed from: v0 */
    public int f317681v0 = 0;

    /* renamed from: v1 */
    public int f317682v1;

    /* renamed from: w */
    public byte[] f317683w = null;

    /* renamed from: w0 */
    public int f317684w0 = 0;

    /* renamed from: w1 */
    public byte[] f317685w1;

    /* renamed from: x */
    public int f317686x = 0;

    /* renamed from: x0 */
    public int f317687x0 = 0;

    /* renamed from: x1 */
    public byte[] f317688x1;

    /* renamed from: y */
    public int f317689y = 500;

    /* renamed from: y0 */
    public int f317690y0 = 0;

    /* renamed from: y1 */
    public byte[] f317691y1;

    /* renamed from: z */
    public int f317692z = 30;

    /* renamed from: z0 */
    public int f317693z0 = -1;

    /* renamed from: z1 */
    public byte[] f317694z1;

    /* renamed from: com.tencent.mm.plugin.voip.model.v2protocal$a */
    public class C106398a implements C32224a<C13598b0> {
        public C106398a() {
        }

        public Object invoke() {
            v2protocal.this.mo152736A();
            return null;
        }
    }

    static {
        Class<v2protocal> cls = v2protocal.class;
        C102300g.m134933a();
        C88957l.m111079o("voipChannel", cls.getClassLoader());
        C88957l.m111079o("voipMain", cls.getClassLoader());
        int a = C107842p.m146108a();
        f317531R1 = a;
        int i = (a & 1024) != 0 ? 16000 : 8000;
        f317532S1 = i;
        int i2 = i / 1000;
    }

    public v2protocal(MMHandler mMHandler) {
        new ArrayBlockingQueue(f317542c2);
        this.field_localImgWidth = 0;
        this.field_localImgHeight = 0;
        this.field_statusSyncKey = 0;
        this.field_relayDataSyncKey = 0;
        this.field_connectingStatusKey = 0;
        this.field_HWEncW = 0;
        this.field_HWEncH = 0;
        this.field_sendVideoLen = 100;
        this.field_realLinkQualityInfoBuffLen = 0;
        this.field_remoteImgLength = 0;
        this.field_remoteImgHeight = 0;
        this.field_remoteImgWidth = 0;
        this.field_remoteImgOrien = 0;
        this.field_recvVideoLen = 120;
        this.f317673s1 = 0;
        this.f317676t1 = new byte[8];
        this.f317679u1 = 0;
        this.f317682v1 = 0;
        this.f317685w1 = new byte[4096];
        this.f317688x1 = new byte[2048];
        this.f317691y1 = new byte[2048];
        this.f317694z1 = new byte[4096];
        this.f317550A1 = new byte[4096];
        this.f317553B1 = new byte[2048];
        this.f317556C1 = new byte[4096];
        this.f317559D1 = new byte[2048];
        this.f317562E1 = new byte[2048];
        this.f317565F1 = new int[30];
        this.field_statInfoLength = 0;
        this.field_speedTestInfoLength = 0;
        this.field_engineVersionStatLength = 0;
        this.field_engineQosStatLength = 0;
        this.field_channelStatLength = 0;
        this.field_channelReportLength = 0;
        this.field_newEngineStatLength = 0;
        this.field_newEngineReportLength = 0;
        this.field_netFlowSent = 0;
        this.field_netFlowRecv = 0;
        this.field_videoDuration = 0;
        this.field_audioDuration = 0;
        this.field_newEngineExtStatLength = 0;
        this.field_engine2ndStatLength = 0;
        this.field_engine2ndReportLength = 0;
        this.field_pstnChannelInfoLength = 0;
        this.field_pstnEngineInfoLength = 0;
        this.field_jbmBitratRsSvrParamArray = null;
        this.field_jbmParamArraySize = 0;
        this.field_jbmBitratRsSvrParamDoubleArray = null;
        this.field_jbmParamDoubleArraySize = 0;
        this.f317568G1 = new C106401z();
        this.f317571H1 = 0;
        this.f317574I1 = 0;
        this.f317577J1 = null;
        this.f317580K1 = false;
        this.f317583L1 = null;
        this.f317586M1 = 640;
        this.f317589N1 = 480;
        this.f317592O1 = 8;
        this.f317595P1 = 300;
        this.f317598Q1 = true;
        this.f317577J1 = mMHandler;
    }

    /* renamed from: f */
    public static boolean m143437f() {
        int a = C107842p.m146108a();
        boolean z = (a & 1024) != 0;
        int i = (a >> 12) & 15;
        int i2 = a & 255;
        int i3 = Build.VERSION.SDK_INT;
        int f = C111744e.f334654d.mo163483f();
        long g = (C90773a.m113841g(MMApplicationContext.getContext()) / 1024) / 1024;
        boolean z2 = i >= 4;
        boolean z3 = i2 >= 71;
        boolean z4 = i3 >= 23;
        boolean z5 = g >= 4096;
        boolean z6 = f >= 50;
        Log.m105925i("MicroMsg.Voip", "check720EncodeLocalConfig, cpuFlags:%s, isNeon:%s, nCores:%s,gpuScore %s nFreq:%s, sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s gpuCheck:%s", Integer.valueOf(a), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(g), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6));
        return z && z2 && z3 && z4 && z5 && z6;
    }

    private native int forceredirect(int i, int i2, byte[] bArr, int i3);

    private native int setsvraddr(int i, int i2, int i3, String str, String str2, int i4, byte[] bArr, int i5);

    /* renamed from: u */
    public static String m143438u() {
        if (Build.VERSION.SDK_INT < 23) {
            String formatIpAddress = Formatter.formatIpAddress(((WifiManager) MMApplicationContext.getContext().getApplicationContext().getSystemService("wifi")).getDhcpInfo().gateway);
            C112597j.m153936a("MicroMsg.Voip", "get wifi route ip:" + formatIpAddress);
            return formatIpAddress;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
        if (linkProperties == null) {
            Log.m105924i("MicroMsg.Voip", "linkProperties null");
            return "";
        }
        C112597j.m153936a("MicroMsg.Voip", "Interface name:" + linkProperties.getInterfaceName());
        for (RouteInfo next : linkProperties.getRoutes()) {
            if (next.isDefaultRoute() && next.hasGateway()) {
                InetAddress gateway = next.getGateway();
                C112597j.m153936a("MicroMsg.Voip", "get wifi route ip:" + gateway.getHostAddress());
                if (gateway instanceof Inet6Address) {
                    int i = 0;
                    try {
                        i = NetworkInterface.getByName(linkProperties.getInterfaceName()).getIndex();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Voip", e, "NetworkInterface error: %s", e.getMessage());
                    }
                    return gateway.getHostAddress() + "%" + i;
                }
                String hostAddress = gateway.getHostAddress();
                return hostAddress == null ? "" : hostAddress;
            }
        }
        return "";
    }

    private native int uninit(int i, long j, int i2);

    /* renamed from: A */
    public void mo152736A() {
        if (this.f317583L1 != null) {
            this.f317583L1.mo152566f();
            this.f317583L1 = null;
            C112593f.f337160e = false;
        }
        C106339e eVar = f317544e2;
        if (eVar != null) {
            eVar.interrupt();
            C106339e eVar2 = f317544e2;
            eVar2.f317234i = false;
            eVar2.f317235j = false;
            eVar2.f317237o = 0;
            Log.m105918d("MicroMsg.AvcDecoder", "steve: Stop Decode Thread!");
            f317544e2 = null;
        }
        Surface surface = f317545f2;
        if (surface != null) {
            surface.release();
            f317545f2 = null;
        }
        f317546g2 = null;
        f317547h2 = null;
        f317543d2 = null;
    }

    public native int ActivateConn(int i);

    public native int AddNewDirectConns(byte[] bArr, int i, int i2);

    public native int AddNewRelayConns(byte[] bArr, int i, int i2, boolean z);

    public native int GetAudioFormat(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3);

    public native int GetChannelDataTimeoutCnt();

    public native int GetNetBottleneckSide();

    public native int GetNicInfo(int i, byte[] bArr, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, byte[] bArr2, AtomicInteger atomicInteger4, AtomicInteger atomicInteger5, AtomicInteger atomicInteger6);

    public native int InactivateConn(int i);

    public native int OpenSLDisableMute();

    public native int OpenSLEnableMute();

    public native int OpenslPlayCallBackNum();

    public native int OpenslPlayerCostInitTime();

    public native int OpenslRecordCallBackNum();

    public native int OpenslRecorderCostInitTime();

    public native int QueryNicWanIp(byte[] bArr, int i);

    public native int SendDTMF(int i);

    public native int SendRUDP(byte[] bArr, int i);

    public native int SetDTMFPayload(int i);

    public native int StartSpeedTest(byte[] bArr, int i);

    public native int StopSpeedTest();

    public native int UpdateSelfVoipType(boolean z);

    /* renamed from: a */
    public String mo152758a() {
        return this.f317620b;
    }

    public native int app2EngineDataEx(int i, int i2, byte[] bArr, int i3, int i4);

    public native int app2EngineLinkQualityEx(int i, byte[] bArr);

    /* renamed from: b */
    public int mo152761b(C106330a aVar) {
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicInteger atomicInteger3 = new AtomicInteger();
        int GetAudioFormat = GetAudioFormat(atomicInteger, atomicInteger2, atomicInteger3);
        if (GetAudioFormat == 0) {
            aVar.f317169a = atomicInteger3.get();
            aVar.f317171c = atomicInteger2.get();
            aVar.f317170b = atomicInteger.get();
        } else {
            aVar.f317170b = (C107842p.m146108a() & 1024) != 0 ? 16000 : 8000;
            aVar.f317169a = 1;
            aVar.f317171c = 20;
        }
        C112597j.m153938c("MicroMsg.Voip", "V2Protocal: GetAudioDeviceFmt ret :" + GetAudioFormat + ",samplerate = " + aVar.f317170b + ", framelenms =" + aVar.f317171c + ", channels =" + aVar.f317169a);
        return GetAudioFormat;
    }

    /* renamed from: c */
    public int mo152762c(LinkedList<C101864x23> linkedList) {
        LinkedList<C101864x23> linkedList2 = linkedList;
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicInteger atomicInteger3 = new AtomicInteger();
        byte[] bArr = new byte[20];
        AtomicInteger atomicInteger4 = new AtomicInteger();
        AtomicInteger atomicInteger5 = new AtomicInteger();
        AtomicInteger atomicInteger6 = new AtomicInteger();
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = bArr2;
        int GetNicInfo = GetNicInfo(20, bArr, atomicInteger, atomicInteger2, atomicInteger3, bArr2, atomicInteger4, atomicInteger5, atomicInteger6);
        if (GetNicInfo == 0) {
            if (atomicInteger.get() > 0) {
                C101864x23 x232 = new C101864x23();
                x232.f299812d = new String(bArr, 0, atomicInteger.get());
                x232.f299813e = atomicInteger3.get();
                x232.f299815g = atomicInteger2.get();
                linkedList2.add(x232);
            }
            if (atomicInteger4.get() > 0) {
                C101864x23 x233 = new C101864x23();
                x233.f299812d = new String(bArr3, 0, atomicInteger4.get());
                x233.f299813e = atomicInteger6.get();
                x233.f299815g = atomicInteger5.get();
                linkedList2.add(x233);
            }
        }
        return GetNicInfo;
    }

    public native int connectToPeer();

    public native int connectToPeerDirect();

    public native int connectToPeerRelay();

    /* renamed from: d */
    public int mo152766d(wv4 wv4) {
        if (this.f317673s1 != 0) {
            C112597j.m153938c("MicroMsg.Voip", "v2protocal StartVoipSpeedTest fail: a speedtest is doing");
            return -1;
        }
        this.f317673s1 = wv4.f144313e;
        dv4 dv4 = new dv4();
        dv4.f132547d = wv4.f144313e;
        for (int i = 0; i < wv4.f144314f; i++) {
            gv4 gv4 = new gv4();
            gv4.f134302d = wv4.f144315g.get(i).f137927d.f143696f;
            gv4.f134303e = wv4.f144315g.get(i).f137927d.f143695e;
            gv4.f134304f = wv4.f144315g.get(i).f137928e;
            gv4.f134305g = wv4.f144315g.get(i).f137929f;
            gv4.f134306h = wv4.f144315g.get(i).f137930g;
            gv4.f134307i = wv4.f144315g.get(i).f137931h;
            dv4.f132548e.add(gv4);
        }
        try {
            int StartSpeedTest = StartSpeedTest(dv4.toByteArray(), dv4.toByteArray().length);
            C112597j.m153938c("MicroMsg.Voip", "v2protocal StartVoipSpeedTest ret :" + StartSpeedTest);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Voip", e, "StartVoipSpeedTest exception", new Object[0]);
        }
        return 0;
    }

    public native int doubleLinkSwitch(int i);

    /* renamed from: e */
    public final boolean mo152768e(String str) {
        boolean z;
        if (MultiProcessMMKV.getDefault().contains("SupportAvcCodec_" + str)) {
            boolean decodeBool = MultiProcessMMKV.getDefault().decodeBool("SupportAvcCodec_" + str);
            Log.m105925i("MicroMsg.Voip", "SupportAvcCodec use MMKV cache res = %b", Boolean.valueOf(decodeBool));
            return decodeBool;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount() - 1;
            z = false;
            while (codecCount >= 0) {
                try {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(codecCount);
                    C112597j.m153938c("MicroMsg.Voip", "steve codecInfo : " + codecInfoAt.getName());
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    String name = codecInfoAt.getName();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            for (String startsWith : C106340f.f317247L) {
                                if (name.startsWith(startsWith)) {
                                    try {
                                        C112597j.m153938c("MicroMsg.Voip", "steve : H.264 HW encoder found:" + name);
                                        z = true;
                                    } catch (Exception e) {
                                        e = e;
                                        z = true;
                                        Log.printErrStackTrace("MicroMsg.Voip", e, "SupportAvcCodec error: %s", e.getMessage());
                                        MultiProcessMMKV.getDefault().encode("SupportAvcCodec_" + str, z);
                                        Log.m105925i("MicroMsg.Voip", "SupportAvcCodec result saving to MMKV, key = %s, val = %b", str, Boolean.valueOf(z));
                                        return z;
                                    }
                                }
                            }
                        }
                    }
                    codecCount--;
                } catch (Exception e2) {
                    e = e2;
                    Log.printErrStackTrace("MicroMsg.Voip", e, "SupportAvcCodec error: %s", e.getMessage());
                    MultiProcessMMKV.getDefault().encode("SupportAvcCodec_" + str, z);
                    Log.m105925i("MicroMsg.Voip", "SupportAvcCodec result saving to MMKV, key = %s, val = %b", str, Boolean.valueOf(z));
                    return z;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
            Log.printErrStackTrace("MicroMsg.Voip", e, "SupportAvcCodec error: %s", e.getMessage());
            MultiProcessMMKV.getDefault().encode("SupportAvcCodec_" + str, z);
            Log.m105925i("MicroMsg.Voip", "SupportAvcCodec result saving to MMKV, key = %s, val = %b", str, Boolean.valueOf(z));
            return z;
        }
        MultiProcessMMKV.getDefault().encode("SupportAvcCodec_" + str, z);
        Log.m105925i("MicroMsg.Voip", "SupportAvcCodec result saving to MMKV, key = %s, val = %b", str, Boolean.valueOf(z));
        return z;
    }

    public native int exchangeCabInfo(byte[] bArr, int i);

    public native int freeJNIReport();

    /* renamed from: g */
    public final String mo152771g() {
        this.f317599R = C110248b.vx0().mo161473O();
        this.f317601S = C110248b.vx0().mo161473O();
        C107823c cVar = C107835h0.f322846c;
        if (!cVar.f322730a) {
            this.f317599R = 3;
            this.f317601S = 3;
            int i = cVar.f322686E;
            if (i > -1) {
                this.f317599R = i;
            }
            if (C76866m.m92676e() && 2 == C107835h0.f322856m.f322905l) {
                this.f317601S = 2;
            }
            int i2 = C107835h0.f322846c.f322688F;
            if (i2 > -1) {
                this.f317601S = i2;
            }
        } else if (cVar.mo158228b()) {
            C107823c cVar2 = C107835h0.f322846c;
            int i3 = cVar2.f322735c;
            if (i3 >= 0) {
                this.f317599R = i3;
                this.f317601S = i3;
            } else if (cVar2.f322737d >= 0) {
                this.f317599R = 0;
                this.f317601S = 2;
            }
        } else if (C107835h0.f322846c.mo158227a()) {
            if (C107835h0.f322846c.mo158233g() >= 0) {
                this.f317599R = C107835h0.f322846c.mo158233g();
            }
            if (C107835h0.f322846c.mo158232f() >= 0) {
                this.f317601S = C107835h0.f322846c.mo158232f();
            }
        }
        this.f317596Q = 7;
        C107823c cVar3 = C107835h0.f322846c;
        if (cVar3.f322730a) {
            this.f317596Q = 1;
        }
        int i4 = cVar3.f322684D;
        if (i4 > -1) {
            this.f317596Q = i4;
        }
        if (cVar3.f322733b > 0) {
            this.f317603T = 3;
            this.f317605U = 0;
        } else {
            int i5 = cVar3.f322690G;
            if (i5 > -1) {
                this.f317603T = i5;
                this.f317605U = i5;
            }
        }
        int i6 = cVar3.f322692H;
        if (i6 > -1) {
            this.f317603T = i6;
        }
        int i7 = cVar3.f322694I;
        if (i7 > -1) {
            this.f317605U = i7;
        }
        return "," + this.f317599R + "," + this.f317601S + "," + this.f317596Q + "," + this.f317603T + "," + this.f317605U;
    }

    public native int getAVDuration(byte[] bArr, int i);

    public native int getChannelInfo(byte[] bArr, int i, int i2, int i3, int i4, int i5);

    public native int getChannelReport(byte[] bArr, int i);

    public native int getCurrentConnType();

    public native int getEngine2ndInfo(byte[] bArr, int i);

    public native int getEngine2ndInfoReport(byte[] bArr, int i);

    public native int getEngineQosInfo(byte[] bArr, int i);

    public native int getEngineVersionInfo(byte[] bArr, int i);

    public native int getIpStack();

    public native String[] getMPDirectReport();

    public native String[] getMPEngineReport();

    public native String[] getMPRelayReport();

    public native String[] getNatReport();

    public native int getNewEngineExtInfo(byte[] bArr, int i);

    public native int getNewEngineInfo(byte[] bArr, int i);

    public native int getNewEngineInfoReport(byte[] bArr, int i);

    public native int getOpenslErrorCode();

    public native int getPstnChannelInfo(byte[] bArr, int i, int i2, int i3);

    public native int getPstnEngineInfo(byte[] bArr, int i);

    public native int getStatInfo(byte[] bArr, int i, int[] iArr, int i2);

    public native int getVideoHWDecode(int[] iArr, byte[] bArr, int i);

    public native int getVoipcsChannelInfo(byte[] bArr, int i, int i2);

    public native int getVoipcsEngineInfo(byte[] bArr, int i);

    public native int getcurstrategy();

    /* renamed from: h */
    public String mo152796h() {
        if (this.field_videoDuration == 0) {
            C112597j.m153936a("MicroMsg.Voip", "captureFrames:" + this.f317679u1 + ", videoduration: 0");
            return ",0";
        }
        C112597j.m153936a("MicroMsg.Voip", "capturefps:" + (this.f317679u1 / this.field_videoDuration) + " framecount:" + this.f317679u1 + " videoDuration:" + this.field_videoDuration);
        return "," + (this.f317679u1 / this.field_videoDuration);
    }

    public native int handleCommand(int i, byte[] bArr, int i2);

    /* renamed from: i */
    public final String mo152798i() {
        return "," + this.f317686x;
    }

    public native int init(int i, int i2, int i3, int i4, int i5, int i6, String str, int i7, long j, int i8, int i9, int i15, int i16);

    public native int isDCReady();

    public native int isDCSameLan();

    public native int isRelayConnReady();

    /* renamed from: j */
    public final String mo152803j() {
        String str = "" + Build.MANUFACTURER;
        if (str.contains(",")) {
            str = str.replace(',', ' ');
        }
        String str2 = "" + C87203t.m108275k();
        if (str2.contains(",")) {
            str2 = str2.replace(',', ' ');
        }
        String str3 = "" + Build.VERSION.SDK;
        if (str3.contains(",")) {
            str3 = str3.replace(',', ' ');
        }
        String str4 = "" + Build.VERSION.RELEASE;
        if (str4.contains(",")) {
            str4 = str3.replace(',', ' ');
        }
        return "," + str + "," + str2 + "," + str3 + "," + str4;
    }

    /* renamed from: k */
    public String mo152804k() {
        byte[] bArr = this.f317556C1;
        getEngine2ndInfo(bArr, bArr.length);
        C112597j.m153938c("MicroMsg.Voip", "voipreport:12805,oldEngine2ndString:" + ("" + this.f317665q + "," + this.f317656n + "," + this.f317662p + new String(this.f317556C1, 0, this.field_engine2ndStatLength)));
        byte[] bArr2 = this.f317556C1;
        getEngine2ndInfoReport(bArr2, bArr2.length);
        String str = "" + this.f317665q + "," + this.f317656n + "," + this.f317662p + new String(this.f317556C1, 0, this.field_engine2ndReportLength);
        C112597j.m153938c("MicroMsg.Voip", "voipreport:12805,newEngine2ndString:" + str);
        return str;
    }

    public int keep_onNotifyFromJni(int i, int i2, byte[] bArr) {
        C112597j.m153936a("MicroMsg.VoipService", "callByJni : arg1:" + i + " arg2:" + i2);
        if (i == 100) {
            C112597j.m153943h(bArr, "MicroMsg.Voip", i2);
            return 0;
        } else if (i == 101) {
            C112597j.m153943h(bArr, "MicroMsg.v2Core", i2);
            return 0;
        } else {
            Message message = new Message();
            message.what = 59998;
            message.arg1 = i;
            message.arg2 = i2;
            message.obj = bArr;
            this.f317577J1.sendMessage(message);
            return 0;
        }
    }

    public int keep_onNotifyFromJniInt(int i, int i2, int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        C112597j.m153936a("MicroMsg.VoipService", "callByJniInt : arg1:" + i + " arg2:" + i2);
        Message message = new Message();
        message.what = 59998;
        message.arg1 = i;
        message.arg2 = i2;
        message.obj = iArr;
        this.f317577J1.sendMessage(message);
        return 0;
    }

    /* renamed from: l */
    public String[] mo152807l() {
        String[] mPDirectReport = getMPDirectReport();
        C112597j.m153937b("MicroMsg.Voip", "direct_report_string size:" + mPDirectReport.length);
        for (int i = 0; i < mPDirectReport.length; i++) {
            C112597j.m153937b("MicroMsg.Voip", "direct_report_string:" + mPDirectReport[i]);
        }
        return mPDirectReport;
    }

    /* renamed from: m */
    public String[] mo152808m() {
        String[] mPEngineReport = getMPEngineReport();
        C112597j.m153937b("MicroMsg.Voip", "engine_report_string size:" + mPEngineReport.length);
        for (int i = 0; i < mPEngineReport.length; i++) {
            mPEngineReport[i] = "" + this.f317665q + "," + this.f317662p + mPEngineReport[i];
            StringBuilder sb = new StringBuilder();
            sb.append("engine_report_string:");
            sb.append(mPEngineReport[i]);
            C112597j.m153937b("MicroMsg.Voip", sb.toString());
        }
        return mPEngineReport;
    }

    /* renamed from: n */
    public String[] mo152809n() {
        String[] mPRelayReport = getMPRelayReport();
        C112597j.m153937b("MicroMsg.Voip", "relay_report_string size:" + mPRelayReport.length);
        for (int i = 0; i < mPRelayReport.length; i++) {
            C112597j.m153937b("MicroMsg.Voip", "relay_report_string:" + mPRelayReport[i]);
        }
        return mPRelayReport;
    }

    /* renamed from: o */
    public String[] mo152810o() {
        String[] natReport = getNatReport();
        C112597j.m153937b("MicroMsg.Voip", "nat_report size:" + natReport.length);
        for (int i = 0; i < natReport.length; i++) {
            C112597j.m153937b("MicroMsg.Voip", "nat_report:" + natReport[i]);
        }
        return natReport;
    }

    /* renamed from: p */
    public String mo152811p() {
        byte[] bArr = this.f317694z1;
        getChannelInfo(bArr, bArr.length, this.f317612X0, this.f317614Y0, this.f317616Z0, this.f317619a1);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f317665q);
        sb.append(",");
        sb.append(this.f317656n);
        sb.append(",");
        sb.append(this.f317662p);
        sb.append(this.f317568G1.mo152872d());
        C106401z zVar = this.f317568G1;
        zVar.getClass();
        sb.append("," + zVar.f317788q);
        sb.append(new String(this.f317694z1, 0, this.field_channelStatLength));
        String sb4 = sb.toString();
        C112597j.m153938c("MicroMsg.Voip", "voipreport:oldChannelString: " + sb4);
        byte[] bArr2 = this.f317694z1;
        getChannelReport(bArr2, bArr2.length);
        String str = new String(this.f317694z1, 0, this.field_channelReportLength);
        C112597j.m153938c("MicroMsg.Voip", "voipreport:newChannelString: " + str);
        return str;
    }

    public native int parseSyncKeyBuff(byte[] bArr, int i);

    public native int playCallback(byte[] bArr, int i);

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0389  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo152814q() {
        /*
            r20 = this;
            r1 = r20
            java.lang.Class<pu0.b> r2 = pu0.C110248b.class
            int r0 = r1.f317572I
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0015
            int r7 = r1.f317575J
            if (r7 != 0) goto L_0x0015
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            r0.f317789r = r6
            goto L_0x002d
        L_0x0015:
            int r7 = r1.f317575J
            if (r7 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            r0.f317789r = r4
            goto L_0x002d
        L_0x0020:
            if (r7 == 0) goto L_0x0027
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            r0.f317789r = r5
            goto L_0x002d
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            r0.f317789r = r3
        L_0x002d:
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            com.tencent.mm.sdk.systemservicecache.NetworkCache r7 = com.tencent.p014mm.sdk.systemservicecache.NetworkCache.INSTANCE
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.net.NetworkInfo r7 = r7.getActiveNetworkInfoFromCache(r8)
            int r7 = z33.C112597j.m153941f(r7)
            r0.f317797z = r7
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r7 = z33.C112597j.m153939d(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "MicroMsg.VoipHelper"
            java.lang.String r9 = "Get simcard num"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "context is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0123
        L_0x005b:
            java.lang.Class<aw.d> r11 = p447aw.C103918d.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            aw.d r11 = (p447aw.C103918d) r11
            java.lang.String r12 = "android.permission.READ_PHONE_STATE"
            boolean r11 = r11.Lb0(r0, r12)
            if (r11 != 0) goto L_0x0073
            java.lang.String r0 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r0 = 1
            goto L_0x012b
        L_0x0073:
            java.lang.String r11 = "phone"
            java.lang.Object r0 = r0.getSystemService(r11)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            r11 = 0
            java.lang.Class<android.telephony.TelephonyManager> r12 = android.telephony.TelephonyManager.class
            java.lang.String r13 = "getSimStateGemini"
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x00a8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00a8 }
            r14[r6] = r15     // Catch:{ Exception -> 0x00a8 }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r14)     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00a8 }
            java.lang.Integer r14 = new java.lang.Integer     // Catch:{ Exception -> 0x00a8 }
            r14.<init>(r6)     // Catch:{ Exception -> 0x00a8 }
            r13[r6] = r14     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r13 = r12.invoke(r0, r13)     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00a6 }
            java.lang.Integer r15 = new java.lang.Integer     // Catch:{ Exception -> 0x00a6 }
            r15.<init>(r5)     // Catch:{ Exception -> 0x00a6 }
            r14[r6] = r15     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r11 = r12.invoke(r0, r14)     // Catch:{ Exception -> 0x00a6 }
            r0 = 1
            goto L_0x00c3
        L_0x00a6:
            r0 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r0 = move-exception
            r13 = r11
        L_0x00aa:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "Exception: "
            r12.append(r14)
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r0 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x0125
            if (r13 == 0) goto L_0x0123
            if (r11 != 0) goto L_0x00ca
            goto L_0x0123
        L_0x00ca:
            java.lang.String r0 = r13.toString()
            java.lang.String r12 = "5"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r11.toString()
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = "double card enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r0 = 5
            goto L_0x012b
        L_0x00e7:
            java.lang.String r0 = r13.toString()
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = r11.toString()
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "card 2 enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x011a
        L_0x0101:
            java.lang.String r0 = r13.toString()
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = r11.toString()
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x011c
            java.lang.String r0 = "card 1 enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x011a:
            r0 = 4
            goto L_0x012b
        L_0x011c:
            java.lang.String r0 = "0 card enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r0 = 3
            goto L_0x012b
        L_0x0123:
            r0 = 0
            goto L_0x012b
        L_0x0125:
            java.lang.String r0 = "single card enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r0 = 2
        L_0x012b:
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r11 = r1.field_videoDuration
            r8.f317796y = r11
            int r11 = r1.field_audioDuration
            r8.f317795x = r11
            di3.d r8 = di3.C86312j.m106911c(r2)
            java.lang.String r11 = "getService(SubCoreAudio::class.java)"
            gy3.C87412m.m108593f(r8, r11)
            pu0.b r8 = (pu0.C110248b) r8
            ou0.a r8 = r8.f329779e
            if (r8 != 0) goto L_0x0158
            ou0.c r8 = new ou0.c
            r8.<init>()
            di3.d r2 = di3.C86312j.m106911c(r2)
            gy3.C87412m.m108593f(r2, r11)
            pu0.b r2 = (pu0.C110248b) r2
            java.lang.String[] r2 = r2.f329781g
            java.lang.String r11 = "music"
            r2[r6] = r11
        L_0x0158:
            int r2 = r8.f329355e
            r8.f329355e = r6
            r1.f317587N = r2
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r11 = r2.f317763R
            r13 = 0
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0170
            long r9 = r2.f317747B
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0170
            long r9 = r9 - r11
            goto L_0x0171
        L_0x0170:
            r9 = r13
        L_0x0171:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "voipreport:acceptcalltime:"
            r2.append(r11)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "MicroMsg.Voip"
            z33.C112597j.m153936a(r11, r2)
            byte[] r2 = r1.f317676t1
            int r12 = r2.length
            r1.setJNIAppCmd(r5, r2, r12)
            byte[] r2 = r1.f317676t1
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.nativeOrder()
            r2.order(r12)
            long r16 = r2.getLong()
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r3 = r2.f317752G
            int r18 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r18 <= 0) goto L_0x01ae
            int r18 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r18 <= 0) goto L_0x01ae
            long r3 = r16 - r3
            goto L_0x01af
        L_0x01ae:
            r3 = r13
        L_0x01af:
            r2.f317764S = r3
            long r3 = r2.f317763R
            int r18 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r18 <= 0) goto L_0x01c0
            int r18 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r18 <= 0) goto L_0x01c0
            long r16 = r16 - r3
            r3 = r16
            goto L_0x01c1
        L_0x01c0:
            r3 = r13
        L_0x01c1:
            r2.f317765T = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "voipreport:lCallerWaitTime:"
            r2.append(r3)
            com.tencent.mm.plugin.voip.model.z r3 = r1.f317568G1
            long r3 = r3.f317764S
            r2.append(r3)
            java.lang.String r3 = " lCalledWaitTime:"
            r2.append(r3)
            com.tencent.mm.plugin.voip.model.z r3 = r1.f317568G1
            long r3 = r3.f317765T
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153936a(r11, r2)
            int r2 = f317531R1
            r2 = r2 & 255(0xff, float:3.57E-43)
            boolean r3 = l33.C109247e.zx0()
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r8 = h81.C32735h.C32737c.mmvoip_multipath_switch
            int r4 = r4.mo58779Qe(r8, r6)
            long r5 = r1.f317647k
            int r18 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r18 <= 0) goto L_0x0210
            long r5 = r1.f317650l
            long r13 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r13
            long r13 = r1.f317647k
            long r5 = r5 - r13
            r1.f317650l = r5
        L_0x0210:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ""
            r5.append(r6)
            int r13 = r1.f317569H
            r5.append(r13)
            java.lang.String r13 = ","
            r5.append(r13)
            int r14 = r1.f317656n
            r5.append(r14)
            r5.append(r13)
            r18 = r9
            long r8 = r1.f317665q
            r5.append(r8)
            r5.append(r13)
            int r8 = r1.f317662p
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317772a
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317784m
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317785n
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317786o
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317787p
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317788q
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317789r
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            byte r8 = r8.f317781j
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317790s
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317791t
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317792u
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317793v
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317794w
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317795x
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317796y
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317797z
            r5.append(r8)
            java.lang.String r8 = r20.mo152834t()
            r5.append(r8)
            java.lang.String r8 = r20.mo152818s()
            r5.append(r8)
            java.lang.String r8 = r20.mo152803j()
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            int r8 = r8.f317746A
            r5.append(r8)
            r5.append(r13)
            int r8 = r1.f317584M
            r5.append(r8)
            r5.append(r13)
            int r8 = r1.f317587N
            r5.append(r8)
            r5.append(r13)
            r8 = r18
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            long r8 = r8.f317764S
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r8 = r1.f317568G1
            long r8 = r8.f317765T
            r5.append(r8)
            r5.append(r13)
            int r8 = r1.f317590O
            r5.append(r8)
            r5.append(r13)
            int r8 = r1.f317638h
            r5.append(r8)
            java.lang.String r8 = r20.mo152798i()
            r5.append(r8)
            r5.append(r13)
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317630e0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317633f0
            r5.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r8 = android.os.Build.VERSION.INCREMENTAL
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            boolean r8 = r2.contains(r13)
            r9 = 32
            r14 = 44
            if (r8 == 0) goto L_0x0372
            java.lang.String r2 = r2.replace(r14, r9)
        L_0x0372:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = android.os.Build.DISPLAY
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            boolean r8 = r6.contains(r13)
            if (r8 == 0) goto L_0x038d
            java.lang.String r6 = r6.replace(r14, r9)
        L_0x038d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r13)
            r8.append(r2)
            r8.append(r13)
            r8.append(r6)
            java.lang.String r2 = r8.toString()
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r8 = r2.f317748C
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r8 = r2.f317750E
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r8 = r2.f317749D
            r5.append(r8)
            r5.append(r13)
            r2 = 0
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r8 = r2.f317767V
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r8 = r2.f317768W
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long r8 = r2.f317769X
            r5.append(r8)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            int r2 = r2.f317770Y
            r5.append(r2)
            r5.append(r13)
            r2 = 0
            r5.append(r2)
            r5.append(r13)
            r5.append(r2)
            r5.append(r13)
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317636g0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317639h0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317593P
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317642i0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317645j0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317648k0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317571H1
            r5.append(r2)
            r5.append(r13)
            java.lang.String r2 = r1.f317657n0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317651l0
            r5.append(r2)
            r5.append(r13)
            int r2 = f317537X1
            r5.append(r2)
            r5.append(r13)
            r5.append(r4)
            r5.append(r13)
            r5.append(r3)
            r5.append(r13)
            r5.append(r7)
            r5.append(r13)
            int r2 = r1.f317660o0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317663p0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317666q0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317681v0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317684w0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317687x0
            r5.append(r2)
            r5.append(r13)
            r2 = 0
            r5.append(r2)
            r5.append(r13)
            int r3 = r1.f317690y0
            r5.append(r3)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r3 = r1.f317568G1
            long[] r3 = r3.f317766U
            r2 = r3[r2]
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long[] r2 = r2.f317766U
            r3 = 1
            r3 = r2[r3]
            r5.append(r3)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long[] r2 = r2.f317766U
            r3 = 2
            r3 = r2[r3]
            r5.append(r3)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long[] r2 = r2.f317766U
            r3 = 3
            r3 = r2[r3]
            r5.append(r3)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long[] r2 = r2.f317766U
            r3 = 4
            r3 = r2[r3]
            r5.append(r3)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r2 = r1.f317568G1
            long[] r2 = r2.f317766U
            r3 = 5
            r3 = r2[r3]
            r5.append(r3)
            r5.append(r13)
            int r2 = f317540a2
            r5.append(r2)
            r5.append(r13)
            int r2 = f317541b2
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317681v0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317684w0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317687x0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317660o0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317663p0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317666q0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317549A0
            r5.append(r2)
            r5.append(r13)
            int r2 = r1.f317693z0
            r5.append(r2)
            r5.append(r13)
            r5.append(r0)
            r5.append(r13)
            int r0 = r1.f317669r0
            r5.append(r0)
            r5.append(r13)
            int r0 = r1.f317672s0
            r5.append(r0)
            r5.append(r13)
            int r0 = r1.f317675t0
            r5.append(r0)
            r5.append(r13)
            int r0 = r1.f317678u0
            r5.append(r0)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317752G
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317753H
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317755J
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317756K
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317757L
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317758M
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317751F
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317754I
            r5.append(r2)
            r5.append(r13)
            int r0 = r1.f317552B0
            r5.append(r0)
            r5.append(r13)
            int r0 = r1.f317555C0
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = r1.f317641i
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = r1.f317644j
            r5.append(r0)
            java.lang.String r0 = ",,,0,"
            r5.append(r0)
            long r2 = r1.f317650l
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            long r2 = r0.f317762Q
            r5.append(r2)
            r5.append(r13)
            com.tencent.mm.plugin.voip.model.z r0 = r1.f317568G1
            java.lang.String r0 = r0.f317771Z
            r5.append(r0)
            r5.append(r13)
            int r0 = r1.f317654m0
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "voipreport:initNetType:"
            r2.append(r3)
            int r3 = r1.f317638h
            r2.append(r3)
            java.lang.String r3 = " initSSID:"
            r2.append(r3)
            java.lang.String r3 = r1.f317641i
            r2.append(r3)
            java.lang.String r3 = " initBSSID:"
            r2.append(r3)
            java.lang.String r3 = r1.f317644j
            r2.append(r3)
            java.lang.String r3 = " miniViewDuration:"
            r2.append(r3)
            long r3 = r1.f317650l
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "voipreport:getChannelStrategyString:"
            r2.append(r3)
            java.lang.String r3 = r20.mo152798i()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lInterruptStartTime:"
            r2.append(r3)
            com.tencent.mm.plugin.voip.model.z r3 = r1.f317568G1
            long r3 = r3.f317768W
            r2.append(r3)
            java.lang.String r3 = ",lInterruptEndTime:"
            r2.append(r3)
            com.tencent.mm.plugin.voip.model.z r3 = r1.f317568G1
            long r3 = r3.f317769X
            r2.append(r3)
            java.lang.String r3 = ",mIinterruptCnt:"
            r2.append(r3)
            com.tencent.mm.plugin.voip.model.z r3 = r1.f317568G1
            int r3 = r3.f317770Y
            r2.append(r3)
            java.lang.String r3 = ",iPlayMinBufSize:"
            r2.append(r3)
            int r3 = r1.f317636g0
            r2.append(r3)
            java.lang.String r3 = ",iRecordMinBufSize:"
            r2.append(r3)
            int r3 = r1.f317639h0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "steve:[simucall]voipreport::iSimulCallStatus:"
            r2.append(r3)
            int r3 = r1.f317571H1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r11, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.v2protocal.mo152814q():java.lang.String");
    }

    /* renamed from: r */
    public String mo152815r() {
        byte[] bArr = this.f317550A1;
        getNewEngineInfo(bArr, bArr.length);
        byte[] bArr2 = this.f317553B1;
        getNewEngineExtInfo(bArr2, bArr2.length);
        C112597j.m153938c("MicroMsg.Voip", "voipreport:oldNewEngineString:" + ("" + this.f317662p + "," + this.f317665q + this.f317568G1.mo152872d() + "," + this.f317572I + "," + this.f317575J + mo152796h() + new String(this.f317550A1, 0, this.field_newEngineStatLength) + "," + this.f317578K + "," + this.f317581L + mo152771g() + new String(this.f317553B1, 0, this.field_newEngineExtStatLength)));
        byte[] bArr3 = this.f317550A1;
        getNewEngineInfoReport(bArr3, bArr3.length);
        String str = "" + this.f317662p + "," + this.f317665q + this.f317568G1.mo152872d() + "," + this.f317572I + "," + this.f317575J + mo152796h() + new String(this.f317550A1, 0, this.field_newEngineReportLength);
        C112597j.m153938c("MicroMsg.Voip", "voipreport:yaoyaoguoNewEngineString:" + str);
        return str;
    }

    public native int recordCallback(byte[] bArr, int i);

    public native int releaseAudioDevice();

    /* renamed from: s */
    public final String mo152818s() {
        C112597j.m153936a("MicroMsg.Voip", "preConnectSuccess:" + this.f317564F0);
        return "," + this.f317564F0;
    }

    public native int setActive();

    public native int setAppCmd(int i, byte[] bArr, int i2);

    public native int setConfigInfo(int i, long j, int i2, int i3, long j2, byte[] bArr, int i4, int i5, int i6, int i7, int i8, byte[] bArr2, int i9, int i15, int i16, int i17, byte[] bArr3, int i18, int i19, long j3, int i25, byte[] bArr4, int i26, byte[] bArr5, int i27, int i28, int i29, int i35, String str, String str2, String str3);

    public native int setInactive();

    public native int setJNIAppCmd(int i, byte[] bArr, int i2);

    public native int setNetSignalValue(int i, int i2);

    public native int setSvrConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr);

    public native int setjbmbitraterssvrparam();

    public native int startAudioDevice(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public native int startAudioPlayer();

    public native int startAudioRecorder();

    public native int startEngine();

    public native int stopAudioDevice();

    public native int stopAudioPlayer();

    public native int stopAudioRecorder();

    /* renamed from: t */
    public final String mo152834t() {
        C112597j.m153936a("MicroMsg.Voip", "usePreConnect:" + this.f317561E0);
        return "," + this.f317561E0;
    }

    /* renamed from: v */
    public boolean mo152835v(int i, int i2) {
        boolean z = true;
        boolean z2 = (i2 & 4) != 0;
        boolean z3 = (i2 & 8) != 0;
        if (z2 || z3) {
            String str = z2 ? "video/hevc" : "video/avc";
            C112597j.m153938c("MicroMsg.Voip", "steve : create HW encoder successfully:" + str);
            this.f317583L1 = new C106340f(this.f317586M1, this.f317589N1, this.f317592O1, this.f317595P1, i, str);
            this.f317583L1.f317253E = f317543d2;
            if (f317545f2 != null) {
                f317544e2 = new C106339e(f317545f2);
                C112597j.m153938c("MicroMsg.Voip", "steve : create HW decoder successfully!");
            }
        } else {
            z = false;
        }
        if (this.f317583L1 != null && f317544e2 != null) {
            return z;
        }
        this.f317598Q1 = false;
        C112597j.m153937b("MicroMsg.Voip", "create hw codec err!, avcCodec: " + this.f317583L1 + ", avcDecoder: " + f317544e2);
        return false;
    }

    public native int videoDecode(byte[] bArr);

    public native int videoDecode(int[] iArr);

    public native int videoDecodeBB(ByteBuffer byteBuffer);

    public native int videoEncodeToLocal(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr);

    public native int videoEncodeToLocal2(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr);

    public native int videoEncodeToSend(byte[] bArr, int i, int i2, int i3, int i4);

    public native int videoEncodeToSend2(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public native int videoGetEncWH(int i, int i2);

    public native int videoHWDecode(byte[] bArr);

    public native int videoHWProcess(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2);

    public native int videoHWProcess2(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, ByteBuffer byteBuffer2);

    public native int videoHWProcess3(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, ByteBuffer byteBuffer2, int i5);

    public native int videoRorate90D(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6, int i7, int i8);

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x06b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x077c  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08e3  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x091a  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x091c  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x09d4  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0126 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0251  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo152849w() {
        /*
            r31 = this;
            r15 = r31
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = z33.C112597j.m153940e(r0)
            r15.f317629e = r0
            r15.f317638h = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r2)
            r3 = r0
            android.net.wifi.WifiManager r3 = (android.net.wifi.WifiManager) r3
            java.lang.String r10 = "Exception: "
            java.lang.String r11 = ""
            if (r3 == 0) goto L_0x0056
            java.lang.String r4 = "com/tencent/mm/plugin/voip/util/VoipHelper"
            java.lang.String r5 = "getWifiSSID"
            java.lang.String r6 = "(Landroid/content/Context;)Ljava/lang/String;"
            java.lang.String r7 = "android/net/wifi/WifiManager"
            java.lang.String r8 = "getConnectionInfo"
            java.lang.String r9 = "()Landroid/net/wifi/WifiInfo;"
            java.lang.Object r0 = j20.C117292a.m165363i(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x003d }
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = r0.getSSID()     // Catch:{ Exception -> 0x003d }
            goto L_0x0057
        L_0x003d:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MicroMsg.VoipHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0056:
            r0 = r11
        L_0x0057:
            r15.f317641i = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object r0 = r0.getSystemService(r2)
            r2 = r0
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String r3 = "com/tencent/mm/plugin/voip/util/VoipHelper"
            java.lang.String r4 = "getWifiBSSID"
            java.lang.String r5 = "(Landroid/content/Context;)Ljava/lang/String;"
            java.lang.String r6 = "android/net/wifi/WifiManager"
            java.lang.String r7 = "getConnectionInfo"
            java.lang.String r8 = "()Landroid/net/wifi/WifiInfo;"
            java.lang.Object r0 = j20.C117292a.m165363i(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x007f }
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r0.getBSSID()     // Catch:{ Exception -> 0x007f }
            goto L_0x0099
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MicroMsg.VoipHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0098:
            r0 = r11
        L_0x0099:
            r15.f317644j = r0
            java.util.Map r0 = p156gj.C87203t.m108268d()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a9:
            boolean r3 = r2.hasNext()
            r4 = 0
            java.lang.String r14 = "MicroMsg.Voip"
            if (r3 == 0) goto L_0x0126
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "get, key: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", value: "
            r5.append(r6)
            java.lang.Object r7 = r0.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            java.lang.String r5 = "hardware"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r0.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = "get cpuname, key: "
            if (r5 == 0) goto L_0x010d
            r0 = 44
            r2 = 32
            java.lang.String r0 = r5.replace(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r3)
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            goto L_0x0127
        L_0x010d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r3)
            r4.append(r6)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r3)
            goto L_0x00a9
        L_0x0126:
            r0 = r4
        L_0x0127:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cpuhardware1: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            r2 = 2
            r3 = 0
            r13 = 1
            if (r0 != 0) goto L_0x017d
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r5 < r6) goto L_0x017d
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r6 = "android.os.SystemProperties"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.String r7 = "get"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            r8[r3] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            r8[r13] = r5     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.String r8 = "ro.soc.model"
            r7[r3] = r8     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            r7[r13] = r11     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.Object r5 = r5.invoke(r6, r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0169 }
            r4 = r5
        L_0x0169:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "cpuhardware2: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
        L_0x017d:
            if (r0 == 0) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r0 = r4
        L_0x0181:
            r15.f317620b = r0
            r4 = 8
            if (r0 == 0) goto L_0x01b6
            java.lang.String r5 = "SM8450"
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x01b6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "contains SM8450, cpuFlag0: "
            r5.append(r6)
            int r6 = f317531R1
            r5.append(r6)
            java.lang.String r6 = ", cuphardware: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            int r0 = f317531R1
            int r0 = r0 >> r4
            int r0 = r0 << r4
            int r0 = r0 + 90
            f317531R1 = r0
            goto L_0x01d4
        L_0x01b6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "do not contains SM8450, cpuFlag0: "
            r5.append(r6)
            int r6 = f317531R1
            r5.append(r6)
            java.lang.String r6 = ", cuphardware: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x01d4:
            int r0 = r15.f317638h
            r5 = 4
            if (r0 < r5) goto L_0x01e7
            int r0 = f317531R1
            r6 = r0 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01e7
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = 26
            if (r0 < r6) goto L_0x01e7
            r0 = 1
            goto L_0x01e8
        L_0x01e7:
            r0 = 0
        L_0x01e8:
            if (r0 == 0) goto L_0x01f4
            int r6 = f317531R1
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 30
            if (r6 < r7) goto L_0x01f4
            r6 = 1
            goto L_0x01f5
        L_0x01f4:
            r6 = 0
        L_0x01f5:
            if (r6 == 0) goto L_0x0201
            int r7 = f317531R1
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 60
            if (r7 < r8) goto L_0x0201
            r7 = 1
            goto L_0x0202
        L_0x0201:
            r7 = 0
        L_0x0202:
            if (r7 == 0) goto L_0x020c
            boolean r8 = m143437f()
            if (r8 == 0) goto L_0x020c
            r8 = 1
            goto L_0x020d
        L_0x020c:
            r8 = 0
        L_0x020d:
            f317535V1 = r8
            gj.d r8 = p156gj.C107835h0.f322845b
            int r9 = r8.f322789D
            r10 = 360(0x168, float:5.04E-43)
            r11 = 480(0x1e0, float:6.73E-43)
            if (r9 < r13) goto L_0x022f
            gj.d$a r12 = r8.f322810i
            int r4 = r12.f322833f
            if (r4 < r11) goto L_0x022f
            int r4 = r12.f322834g
            if (r4 < r10) goto L_0x022f
            gj.d$a r4 = r8.f322812k
            int r12 = r4.f322833f
            if (r12 < r11) goto L_0x022f
            int r4 = r4.f322834g
            if (r4 < r10) goto L_0x022f
            r4 = 1
            goto L_0x0230
        L_0x022f:
            r4 = 0
        L_0x0230:
            r12 = 640(0x280, float:8.97E-43)
            if (r9 < r2) goto L_0x024a
            gj.d$a r10 = r8.f322810i
            int r13 = r10.f322833f
            if (r13 < r12) goto L_0x024a
            int r10 = r10.f322834g
            if (r10 < r11) goto L_0x024a
            gj.d$a r10 = r8.f322812k
            int r13 = r10.f322833f
            if (r13 < r12) goto L_0x024a
            int r10 = r10.f322834g
            if (r10 < r11) goto L_0x024a
            r10 = 1
            goto L_0x024b
        L_0x024a:
            r10 = 0
        L_0x024b:
            r13 = 720(0x2d0, float:1.009E-42)
            r12 = 1280(0x500, float:1.794E-42)
            if (r9 == r2) goto L_0x0270
            gj.d$a r11 = r8.f322810i
            int r2 = r11.f322833f
            if (r2 == 0) goto L_0x026e
            if (r2 >= r12) goto L_0x026e
            int r2 = r11.f322834g
            if (r2 == 0) goto L_0x026e
            if (r2 >= r13) goto L_0x026e
            gj.d$a r2 = r8.f322812k
            int r11 = r2.f322833f
            if (r11 == 0) goto L_0x026e
            if (r11 >= r12) goto L_0x026e
            int r2 = r2.f322834g
            if (r2 == 0) goto L_0x026e
            if (r2 >= r13) goto L_0x026e
            goto L_0x0270
        L_0x026e:
            r2 = 0
            goto L_0x0271
        L_0x0270:
            r2 = 1
        L_0x0271:
            if (r9 < r5) goto L_0x0275
            r11 = 1
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            if (r9 != 0) goto L_0x027a
            r9 = 1
            goto L_0x027b
        L_0x027a:
            r9 = 0
        L_0x027b:
            int r13 = r8.f322790E
            if (r13 != 0) goto L_0x0282
            r22 = 1
            goto L_0x0284
        L_0x0282:
            r22 = 0
        L_0x0284:
            if (r13 <= 0) goto L_0x0288
            r13 = 1
            goto L_0x0289
        L_0x0288:
            r13 = 0
        L_0x0289:
            int r8 = r8.f322791F
            di3.d r23 = di3.C86312j.m106911c(r1)
            r12 = r23
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_voip_hwparam_for_mac
            int r5 = r12.mo58779Qe(r5, r3)
            r12 = r5 & 15
            r21 = 2
            int r12 = r12 >> 2
            if (r12 <= 0) goto L_0x02a3
            r12 = 1
            goto L_0x02a4
        L_0x02a3:
            r12 = 0
        L_0x02a4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r25 = r6
            java.lang.String r6 = "iHWParam: "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r5 = ", bEnableHWhevcFromSvr: "
            r3.append(r5)
            r3.append(r12)
            java.lang.String r5 = ", SrvDeviceInfo.mCameraInfo.mSupport480P: "
            r3.append(r5)
            gj.d r5 = p156gj.C107835h0.f322845b
            int r5 = r5.f322789D
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            z33.C112597j.m153938c(r14, r3)
            gj.d r3 = p156gj.C107835h0.f322845b
            int r3 = r3.f322792G
            r5 = 2
            if (r3 != r5) goto L_0x02db
            r5 = 0
            f317533T1 = r5
            r3 = 2
            r5 = 1
            goto L_0x02e8
        L_0x02db:
            r5 = 1
            if (r3 != r5) goto L_0x02e1
            f317533T1 = r5
            goto L_0x02e7
        L_0x02e1:
            boolean r3 = f317535V1
            if (r3 == 0) goto L_0x02e7
            f317533T1 = r5
        L_0x02e7:
            r3 = 2
        L_0x02e8:
            if (r8 != r3) goto L_0x02ee
            r3 = 0
            f317536W1 = r3
            goto L_0x02f9
        L_0x02ee:
            if (r8 != r5) goto L_0x02f3
            f317536W1 = r5
            goto L_0x02f9
        L_0x02f3:
            boolean r3 = f317535V1
            if (r3 == 0) goto L_0x02f9
            f317536W1 = r5
        L_0x02f9:
            if (r2 == 0) goto L_0x0306
            java.lang.String r3 = "hseasun:Close the 720p force due to configuration from svr"
            z33.C112597j.m153938c(r14, r3)
            r3 = 0
            f317533T1 = r3
            f317536W1 = r3
            goto L_0x0307
        L_0x0306:
            r3 = 0
        L_0x0307:
            bp3.p r5 = bp3.C79758p.f233760a
            bp3.f r6 = bp3.C104160f.RepairerConfig_VOIP_ForceHardEncode_Int
            int r5 = r5.mo109882e(r6, r3)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r5)
            r8[r3] = r18
            java.lang.String r3 = "hwEncodeRepairerConfig:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r8)
            r3 = 3
            if (r5 != r3) goto L_0x0322
            f317533T1 = r6
        L_0x0322:
            r8 = 4
            if (r5 != r8) goto L_0x0327
            f317534U1 = r6
        L_0x0327:
            boolean r8 = f317533T1
            if (r8 == 0) goto L_0x032d
            f317536W1 = r6
        L_0x032d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "hseasun: enable720Cap: "
            r6.append(r8)
            boolean r8 = f317536W1
            r6.append(r8)
            java.lang.String r8 = " enable1280HWEnc: "
            r6.append(r8)
            boolean r8 = f317533T1
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            z33.C112597j.m153938c(r14, r6)
            r6 = 0
            r15.f317598Q1 = r6
            if (r22 != 0) goto L_0x0492
            java.lang.String r6 = "video/avc"
            boolean r6 = r15.mo152768e(r6)
            java.lang.String r8 = "video/hevc"
            boolean r8 = r15.mo152768e(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r26 = r10
            java.lang.String r10 = "bEnable1280FromLocalD: "
            r3.append(r10)
            r3.append(r7)
            java.lang.String r10 = ", SupportAvcCodec-hevc: "
            r3.append(r10)
            java.lang.String r10 = "video/hevc"
            boolean r10 = r15.mo152768e(r10)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            if (r8 == 0) goto L_0x038b
            if (r12 == 0) goto L_0x038b
            r3 = 1
            goto L_0x038c
        L_0x038b:
            r3 = 0
        L_0x038c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r27 = r9
            java.lang.String r9 = "bSupportHEVCHW: "
            r10.append(r9)
            r10.append(r3)
            java.lang.String r9 = ", bEnableHWhevcFromSvr: "
            r10.append(r9)
            r10.append(r12)
            java.lang.String r9 = ", SrvDeviceInfo.mCameraInfo.mSupportHW: "
            r10.append(r9)
            gj.d r9 = p156gj.C107835h0.f322845b
            int r9 = r9.f322790E
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            z33.C112597j.m153938c(r14, r9)
            if (r13 == 0) goto L_0x03cd
            gj.d r9 = p156gj.C107835h0.f322845b
            int r9 = r9.f322790E
            r10 = r9 & 16
            if (r10 == 0) goto L_0x03c2
            r10 = 1
            goto L_0x03c3
        L_0x03c2:
            r10 = 0
        L_0x03c3:
            if (r6 == 0) goto L_0x03cb
            r9 = r9 & 15
            if (r9 == 0) goto L_0x03cb
            r9 = 1
            goto L_0x03cf
        L_0x03cb:
            r9 = 0
            goto L_0x03cf
        L_0x03cd:
            r9 = r6
            r10 = 0
        L_0x03cf:
            if (r3 != 0) goto L_0x03d6
            if (r9 == 0) goto L_0x03d4
            goto L_0x03d6
        L_0x03d4:
            r12 = 0
            goto L_0x03d7
        L_0x03d6:
            r12 = 1
        L_0x03d7:
            r15.f317598Q1 = r12
            if (r5 == 0) goto L_0x03de
            r12 = 1
            r15.f317598Q1 = r12
        L_0x03de:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "hwH264Local:"
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = ",hwHEVCLocal:"
            r12.append(r6)
            r12.append(r8)
            java.lang.String r6 = ", bSupportH264HW:"
            r12.append(r6)
            r12.append(r9)
            java.lang.String r6 = ", bSupportHEVCSW:"
            r12.append(r6)
            r12.append(r10)
            java.lang.String r6 = ", bSupportHEVCHW:"
            r12.append(r6)
            r12.append(r3)
            java.lang.String r6 = ", svrHWCfg:"
            r12.append(r6)
            gj.d r6 = p156gj.C107835h0.f322845b
            int r6 = r6.f322790E
            r12.append(r6)
            java.lang.String r6 = ", 720p jcchen "
            r12.append(r6)
            r12.append(r7)
            java.lang.String r6 = "-"
            r12.append(r6)
            r13 = r2 ^ 1
            r12.append(r13)
            r12.append(r6)
            r12.append(r11)
            r12.append(r6)
            boolean r6 = f317533T1
            r12.append(r6)
            java.lang.String r6 = " svr 480p:"
            r12.append(r6)
            gj.d r6 = p156gj.C107835h0.f322845b
            int r6 = r6.f322789D
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            z33.C112597j.m153938c(r14, r6)
            if (r10 == 0) goto L_0x044e
            r9 = r9 | 2
        L_0x044e:
            if (r3 == 0) goto L_0x0453
            r3 = r9 | 4
            goto L_0x0454
        L_0x0453:
            r3 = r9
        L_0x0454:
            di3.d r6 = di3.C86312j.m106911c(r1)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_voip_enable_hevc_hwencode
            r10 = 0
            int r6 = r6.mo58779Qe(r9, r10)
            r9 = 1
            if (r9 != r6) goto L_0x0466
            r6 = 1
            goto L_0x0467
        L_0x0466:
            r6 = 0
        L_0x0467:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "bEnableHWHevc: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            z33.C112597j.m153938c(r14, r9)
            if (r8 == 0) goto L_0x0489
            if (r6 == 0) goto L_0x0489
            gj.d r6 = p156gj.C107835h0.f322845b
            int r6 = r6.f322790E
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0489
            r6 = 1
            goto L_0x048a
        L_0x0489:
            r6 = 0
        L_0x048a:
            r15.f317617a = r6
            if (r6 == 0) goto L_0x0490
            r3 = r3 | 8
        L_0x0490:
            r13 = r3
            goto L_0x0497
        L_0x0492:
            r27 = r9
            r26 = r10
            r13 = 0
        L_0x0497:
            if (r0 != 0) goto L_0x049b
            if (r4 == 0) goto L_0x05a6
        L_0x049b:
            if (r27 != 0) goto L_0x05a6
            boolean r3 = r15.f317598Q1
            if (r3 != 0) goto L_0x04ae
            if (r26 == 0) goto L_0x04a4
            goto L_0x04ae
        L_0x04a4:
            r3 = 480(0x1e0, float:6.73E-43)
            r15.f317623c = r3
            r2 = 360(0x168, float:5.04E-43)
            r15.f317626d = r2
            goto L_0x0560
        L_0x04ae:
            r3 = 480(0x1e0, float:6.73E-43)
            r6 = 640(0x280, float:8.97E-43)
            r15.f317623c = r6
            r15.f317626d = r3
            if (r7 == 0) goto L_0x0560
            if (r2 != 0) goto L_0x0560
            r2 = 1280(0x500, float:1.794E-42)
            r15.f317623c = r2
            r2 = 720(0x2d0, float:1.009E-42)
            r15.f317626d = r2
            if (r7 == 0) goto L_0x04ce
            int r2 = f317531R1
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 90
            if (r2 < r3) goto L_0x04ce
            r2 = 1
            goto L_0x04cf
        L_0x04ce:
            r2 = 0
        L_0x04cf:
            if (r2 == 0) goto L_0x0512
            boolean r3 = z33.C112595h.m153927n()
            if (r3 == 0) goto L_0x04df
            boolean r3 = z33.C112595h.m153928o()
            if (r3 == 0) goto L_0x04df
            r3 = 1
            goto L_0x04e0
        L_0x04df:
            r3 = 0
        L_0x04e0:
            di3.d r6 = di3.C86312j.m106911c(r1)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_voip_1080p_enable
            r8 = 0
            int r6 = r6.mo58779Qe(r7, r8)
            r7 = 1
            if (r6 != r7) goto L_0x04f2
            r6 = 1
            goto L_0x04f3
        L_0x04f2:
            r6 = 0
        L_0x04f3:
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r10[r8] = r9
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r10[r7] = r8
            java.lang.String r7 = "check1920EncodeLocalConfig, enableCap1080: %s, enableEnc1080: %s, "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r10)
            if (r3 == 0) goto L_0x050d
            if (r6 == 0) goto L_0x050d
            r3 = 1
            goto L_0x050e
        L_0x050d:
            r3 = 0
        L_0x050e:
            if (r3 == 0) goto L_0x0512
            r3 = 1
            goto L_0x0513
        L_0x0512:
            r3 = 0
        L_0x0513:
            f317534U1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "bEnable1920FromLocal: "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = ", enable1920HWEnc: "
            r3.append(r2)
            boolean r2 = f317534U1
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            z33.C112597j.m153938c(r14, r2)
            boolean r2 = f317534U1
            if (r2 == 0) goto L_0x0560
            r2 = 1920(0x780, float:2.69E-42)
            r15.f317623c = r2
            r2 = 1080(0x438, float:1.513E-42)
            r15.f317626d = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "support 1920 cap! "
            r2.append(r3)
            int r3 = r15.f317623c
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            int r3 = r15.f317626d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r14, r2)
        L_0x0560:
            if (r5 == 0) goto L_0x0585
            r2 = 1
            if (r5 != r2) goto L_0x056e
            r2 = 480(0x1e0, float:6.73E-43)
            r15.f317623c = r2
            r2 = 360(0x168, float:5.04E-43)
            r15.f317626d = r2
            goto L_0x0585
        L_0x056e:
            r2 = 480(0x1e0, float:6.73E-43)
            r3 = 2
            if (r5 != r3) goto L_0x057a
            r3 = 640(0x280, float:8.97E-43)
            r15.f317623c = r3
            r15.f317626d = r2
            goto L_0x0585
        L_0x057a:
            r2 = 3
            if (r5 != r2) goto L_0x0585
            r2 = 1280(0x500, float:1.794E-42)
            r15.f317623c = r2
            r2 = 720(0x2d0, float:1.009E-42)
            r15.f317626d = r2
        L_0x0585:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "steve:Set Enable 480! "
            r2.append(r3)
            int r3 = r15.f317623c
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            int r3 = r15.f317626d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            z33.C112597j.m153938c(r14, r2)
        L_0x05a6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "steve: Android CPUFlag:"
            r2.append(r3)
            int r3 = f317531R1
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.append(r3)
            java.lang.String r3 = ", 480x360 Enc flags: bEnable480FromLocal:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", bEnable480FromSvr:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", bDisable480FromSvr:"
            r2.append(r0)
            r3 = r27
            r2.append(r3)
            java.lang.String r0 = ", bEnable640FromLocal:"
            r2.append(r0)
            r3 = r25
            r2.append(r3)
            java.lang.String r0 = ", bEnable640FromSvr:"
            r2.append(r0)
            r3 = r26
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            z33.C112597j.m153938c(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "FrontCameraInfo.width: "
            r0.append(r2)
            gj.d r2 = p156gj.C107835h0.f322845b
            gj.d$a r2 = r2.f322810i
            int r2 = r2.f322833f
            r0.append(r2)
            java.lang.String r2 = ", mFrontCameraInfo.height: "
            r0.append(r2)
            gj.d r2 = p156gj.C107835h0.f322845b
            gj.d$a r2 = r2.f322810i
            int r2 = r2.f322834g
            r0.append(r2)
            java.lang.String r2 = ", mBackCameraInfo.width: "
            r0.append(r2)
            gj.d r2 = p156gj.C107835h0.f322845b
            gj.d$a r2 = r2.f322812k
            int r2 = r2.f322833f
            r0.append(r2)
            java.lang.String r2 = ", mBackCameraInfo.height: "
            r0.append(r2)
            gj.d r2 = p156gj.C107835h0.f322845b
            gj.d$a r2 = r2.f322812k
            int r2 = r2.f322834g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            z33.C112597j.m153938c(r14, r0)
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.mo121110g()
            r15.f317632f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            int r12 = com.tencent.p014mm.plugin.voip.video.OpenGlRender.m143736e()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106207v()
            r4 = 9
            if (r3 != 0) goto L_0x0665
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r3 == 0) goto L_0x0660
            goto L_0x0665
        L_0x0660:
            int r3 = r2.getWidth()
            goto L_0x066d
        L_0x0665:
            int r3 = r2.getHeight()
            int r3 = r3 * 9
            int r3 = r3 / 16
        L_0x066d:
            int r2 = r2.getHeight()
            gj.m r5 = p156gj.C107835h0.f322856m
            int r10 = r5.f322919z
            di3.d r5 = di3.C86312j.m106911c(r1)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_voip_vcodec2params_for_android
            r7 = -1
            int r11 = r5.mo58779Qe(r6, r7)
            di3.d r8 = di3.C86312j.m106911c(r1)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_voip_fullbandflag
            int r8 = r8.mo58779Qe(r9, r7)
            r9 = 1
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r17 = 0
            r5[r17] = r6
            java.lang.String r6 = "kerrizhang, fullbandmode = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r6, r5)
            gj.c r5 = p156gj.C107835h0.f322846c
            int r5 = r5.f322712R
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r6[r17] = r9
            java.lang.String r9 = "kerrizhang SrvDeviceInfo.mAudioInfo.voipfullbandcfg %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r9, r6)
            if (r8 <= 0) goto L_0x06d1
            if (r5 <= 0) goto L_0x06d1
            double r5 = (double) r8
            r8 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            double r5 = r5 * r8
            long r5 = (long) r5
            r8 = 456(0x1c8, double:2.253E-321)
            long r5 = r5 + r8
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r7 = 0
            r9[r7] = r8
            java.lang.String r8 = "kerrizhang typectrl %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r8, r9)
            r19 = r5
            goto L_0x06d4
        L_0x06d1:
            r7 = 0
            r19 = 0
        L_0x06d4:
            di3.d r5 = di3.C86312j.m106911c(r1)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_voip_opuswb_switch
            int r5 = r5.mo58779Qe(r6, r7)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8[r7] = r9
            java.lang.String r9 = "winterwang get server opuswbswitch %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r9, r8)
            r8 = 4
            byte[] r9 = new byte[r8]
            byte r5 = (byte) r5
            r9[r7] = r5
            r5 = 5
            int r5 = r15.setJNIAppCmd(r5, r9, r8)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9[r7] = r5
            java.lang.String r5 = "winterwang setJNIAppCmd  EMethod_AudioOptionSwitch ,ret: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r9)
            di3.d r5 = di3.C86312j.m106911c(r1)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.mmvoip_audio_engine_rec
            int r5 = r5.mo58779Qe(r6, r7)
            byte[] r6 = new byte[r8]
            byte r9 = (byte) r5
            r6[r7] = r9
            r9 = 1
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            java.lang.String r5 = "amyfwang,audio_engine_rec_flag:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r4)
            r4 = 9
            r15.setJNIAppCmd(r4, r6, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5)
            com.tencent.mm.plugin.voip.model.VoipModelResMgr r5 = com.tencent.p014mm.plugin.voip.model.VoipModelResMgr.f207454a
            r5.mo98750b(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "get ModelRoot: "
            r5.append(r6)
            java.lang.String r6 = r4.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            java.lang.String r5 = r4.toString()
            byte[] r5 = r5.getBytes()
            r6 = 12
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            r15.setJNIAppCmd(r6, r5, r4)
            java.lang.String r4 = "ladder_cpu"
            int r4 = z33.C112597j.m153942g(r4)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r6[r7] = r5
            java.lang.String r5 = "qipengfeng, nLadderCPU:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r6)
            if (r4 < 0) goto L_0x07a2
            r5 = 4
            byte[] r6 = new byte[r5]
            r5 = r4 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6[r7] = r5
            int r5 = r4 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r7 = 1
            r6[r7] = r5
            int r5 = r4 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r7 = 2
            r6[r7] = r5
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 3
            r6[r5] = r4
            r4 = 11
            r5 = 1
            r15.setJNIAppCmd(r4, r6, r5)
        L_0x07a2:
            byte[] r4 = r15.f317563F
            if (r4 == 0) goto L_0x08e3
            di3.d r4 = di3.C86312j.m106911c(r1)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_voip_set_enc_res_hw264
            r6 = -1
            int r4 = r4.mo58779Qe(r5, r6)
            di3.d r5 = di3.C86312j.m106911c(r1)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_voip_set_dec_res_hw264
            int r5 = r5.mo58779Qe(r7, r6)
            di3.d r7 = di3.C86312j.m106911c(r1)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_voip_set_enc_res_hw265
            int r7 = r7.mo58779Qe(r8, r6)
            di3.d r8 = di3.C86312j.m106911c(r1)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_voip_set_dec_res_hw265
            int r8 = r8.mo58779Qe(r9, r6)
            di3.d r9 = di3.C86312j.m106911c(r1)
            h81.h r9 = (h81.C32735h) r9
            r17 = r10
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_voip_set_enc_res_vcodec2
            int r9 = r9.mo58779Qe(r10, r6)
            di3.d r10 = di3.C86312j.m106911c(r1)
            h81.h r10 = (h81.C32735h) r10
            r24 = r11
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_voip_set_dec_res_vcodec2
            int r10 = r10.mo58779Qe(r11, r6)
            di3.d r11 = di3.C86312j.m106911c(r1)
            h81.h r11 = (h81.C32735h) r11
            r25 = r0
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_voip_set_enc_res_vcodec1
            int r0 = r11.mo58779Qe(r0, r6)
            di3.d r11 = di3.C86312j.m106911c(r1)
            h81.h r11 = (h81.C32735h) r11
            r26 = r2
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_set_dec_res_vcodec1
            int r2 = r11.mo58779Qe(r2, r6)
            di3.d r11 = di3.C86312j.m106911c(r1)
            h81.h r11 = (h81.C32735h) r11
            r27 = r3
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_voip_set_enc_res_vcodec1mix
            int r3 = r11.mo58779Qe(r3, r6)
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_voip_set_dec_res_vcodec1mix
            int r1 = r1.mo58779Qe(r11, r6)
            byte[] r6 = r15.f317563F
            byte r0 = (byte) r0
            r11 = 0
            r6[r11] = r0
            byte r0 = (byte) r9
            r9 = 1
            r6[r9] = r0
            byte r0 = (byte) r4
            r4 = 2
            r6[r4] = r0
            byte r0 = (byte) r7
            r4 = 3
            r6[r4] = r0
            byte r0 = (byte) r3
            r3 = 4
            r6[r3] = r0
            byte r0 = (byte) r2
            r2 = 5
            r6[r2] = r0
            byte r0 = (byte) r10
            r3 = 6
            r6[r3] = r0
            byte r0 = (byte) r5
            r4 = 7
            r6[r4] = r0
            byte r0 = (byte) r8
            r5 = 8
            r6[r5] = r0
            byte r0 = (byte) r1
            r1 = 9
            r6[r1] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EMethodSetVideoCodecRes, Enc: v1: "
            r0.append(r1)
            byte[] r1 = r15.f317563F
            r5 = 0
            byte r1 = r1[r5]
            r0.append(r1)
            java.lang.String r1 = ", v1mix: "
            r0.append(r1)
            byte[] r5 = r15.f317563F
            r6 = 4
            byte r5 = r5[r6]
            r0.append(r5)
            java.lang.String r5 = ", v2: "
            r0.append(r5)
            byte[] r6 = r15.f317563F
            r7 = 1
            byte r6 = r6[r7]
            r0.append(r6)
            java.lang.String r6 = ", hw264: "
            r0.append(r6)
            byte[] r7 = r15.f317563F
            r8 = 2
            byte r7 = r7[r8]
            r0.append(r7)
            java.lang.String r7 = ", hw265: "
            r0.append(r7)
            byte[] r8 = r15.f317563F
            r9 = 3
            byte r8 = r8[r9]
            r0.append(r8)
            java.lang.String r8 = ", Dec: v1: "
            r0.append(r8)
            byte[] r8 = r15.f317563F
            byte r2 = r8[r2]
            r0.append(r2)
            r0.append(r1)
            byte[] r1 = r15.f317563F
            r2 = 9
            byte r1 = r1[r2]
            r0.append(r1)
            r0.append(r5)
            byte[] r1 = r15.f317563F
            byte r1 = r1[r3]
            r0.append(r1)
            r0.append(r6)
            byte[] r1 = r15.f317563F
            byte r1 = r1[r4]
            r0.append(r1)
            r0.append(r7)
            byte[] r1 = r15.f317563F
            r2 = 8
            byte r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            r0 = 209(0xd1, float:2.93E-43)
            byte[] r1 = r15.f317563F
            int r2 = r1.length
            r15.setJNIAppCmd(r0, r1, r2)
            goto L_0x08ed
        L_0x08e3:
            r25 = r0
            r26 = r2
            r27 = r3
            r17 = r10
            r24 = r11
        L_0x08ed:
            java.lang.String r0 = "hwenc"
            int r0 = z33.C112597j.m153942g(r0)
            java.lang.String r1 = "hwdec"
            int r1 = z33.C112597j.m153942g(r1)
            java.lang.String r2 = "swenc"
            int r2 = z33.C112597j.m153942g(r2)
            java.lang.String r3 = "swdec"
            int r3 = z33.C112597j.m153942g(r3)
            r0 = r0 & 15
            r1 = r1 & 15
            r4 = 4
            int r1 = r1 << r4
            r0 = r0 | r1
            r1 = r2 & 15
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r3 & 15
            int r1 = r1 << 12
            r0 = r0 | r1
            r10 = 1
            if (r12 != r10) goto L_0x091c
            r11 = 4
            goto L_0x091d
        L_0x091c:
            r11 = 1
        L_0x091d:
            int r1 = r15.f317629e
            int r2 = r13 << 8
            r2 = r2 | r1
            r3 = 2
            int r1 = r15.f317623c
            int r1 = r1 << 16
            int r4 = r15.f317626d
            r4 = r4 | r1
            int r1 = r27 << 16
            r5 = r1 | r26
            int r6 = r15.f317632f
            int r1 = r12 << 24
            int r7 = r25 << 16
            r1 = r1 | r7
            int r7 = f317531R1
            r7 = r7 | r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = a70.C112760b.m154216X()
            r1.append(r8)
            java.lang.String r8 = "lib/"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r9 = 0
            r1 = r31
            r16 = r17
            r18 = 1
            r17 = r11
            r10 = r19
            r28 = r12
            r12 = r16
            r29 = r13
            r13 = r24
            r30 = r14
            r14 = r0
            r15 = r17
            int r1 = r1.init(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "protocalInit protocal init ret :"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ",uin= "
            r2.append(r3)
            r3 = r31
            int r4 = r3.f317632f
            r2.append(r4)
            java.lang.String r4 = ", gl_vs:"
            r2.append(r4)
            r4 = r28
            r2.append(r4)
            java.lang.String r4 = ", cpuFlag0="
            r2.append(r4)
            int r4 = f317531R1
            r2.append(r4)
            java.lang.String r4 = ", hwCap= "
            r2.append(r4)
            r4 = r29
            r2.append(r4)
            java.lang.String r4 = ", groupRsCap = "
            r2.append(r4)
            r4 = r16
            r2.append(r4)
            java.lang.String r4 = ", x_vcodec2_paras = "
            r2.append(r4)
            r4 = r24
            r2.append(r4)
            java.lang.String r4 = ", static_cab = "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = ", outfmt = "
            r2.append(r0)
            r4 = r17
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            r2 = r30
            z33.C112597j.m153938c(r2, r0)
            r0 = 1
            r3.f317580K1 = r0
            if (r1 >= 0) goto L_0x09d7
            r31.mo152851y()
        L_0x09d7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.v2protocal.mo152849w():int");
    }

    /* renamed from: x */
    public String mo152850x(boolean z) {
        if (this.f317580K1) {
            C112597j.m153938c("MicroMsg.Voip", "call protocalUninit now...needStatInfo=" + z);
            int[] iArr = new int[6];
            this.field_ChannelReportDial = iArr;
            C106401z zVar = this.f317568G1;
            iArr[0] = zVar.f317781j;
            iArr[1] = zVar.f317788q;
            iArr[2] = this.f317612X0;
            iArr[3] = this.f317614Y0;
            iArr[4] = this.f317616Z0;
            iArr[5] = this.f317619a1;
            this.field_EngineReportStatFromApp = new int[32];
            mo152771g();
            int[] iArr2 = this.field_EngineReportStatFromApp;
            iArr2[0] = this.f317578K;
            iArr2[1] = this.f317581L;
            iArr2[2] = this.f317599R;
            iArr2[3] = this.f317601S;
            iArr2[4] = this.f317596Q;
            iArr2[5] = this.f317603T;
            iArr2[6] = this.f317605U;
            iArr2[7] = -1;
            if (this.f317583L1 != null) {
                this.field_EngineReportStatFromApp[8] = this.f317583L1.f317279w;
                this.field_EngineReportStatFromApp[9] = this.f317583L1.f317281y;
                this.field_EngineReportStatFromApp[10] = this.f317583L1.f317257a;
                this.field_EngineReportStatFromApp[30] = this.f317583L1.f317258b;
            } else {
                int[] iArr3 = this.field_EngineReportStatFromApp;
                iArr3[8] = 0;
                iArr3[9] = 0;
                iArr3[10] = 0;
                iArr3[30] = 0;
            }
            C106339e eVar = f317544e2;
            if (eVar != null) {
                int[] iArr4 = this.field_EngineReportStatFromApp;
                iArr4[11] = eVar.f317242t;
                iArr4[28] = eVar.f317243u;
            } else {
                int[] iArr5 = this.field_EngineReportStatFromApp;
                iArr5[11] = 0;
                iArr5[28] = 0;
            }
            int[] iArr6 = this.field_EngineReportStatFromApp;
            iArr6[12] = 0;
            iArr6[13] = 0;
            iArr6[14] = 0;
            if (f317536W1) {
                iArr6[15] = 1280;
                iArr6[16] = 720;
            } else {
                iArr6[15] = 640;
                iArr6[16] = 480;
            }
            iArr6[17] = f317535V1;
            iArr6[18] = f317533T1;
            iArr6[19] = this.f317607V;
            iArr6[20] = this.f317609W;
            iArr6[21] = this.f317611X;
            iArr6[22] = this.f317613Y;
            iArr6[23] = this.f317615Z;
            iArr6[24] = this.f317618a0;
            iArr6[25] = this.f317621b0;
            iArr6[26] = this.f317627d0;
            iArr6[27] = this.f317658n1 + (this.f317661o1 * 100);
            iArr6[29] = this.f317617a;
            iArr6[31] = this.f317624c0;
            this.f317580K1 = false;
            uninit(this.f317656n, this.f317665q, this.f317662p);
            if (C109247e.vx0().mo163047a(2) != null) {
                C109247e.vx0().mo163047a(2).mo162869c(new C106398a());
            } else {
                mo152736A();
            }
            C112597j.m153938c("MicroMsg.Voip", "uninit over.");
            if (z) {
                byte[] bArr = this.f317685w1;
                getStatInfo(bArr, bArr.length, this.f317565F1, 30);
                byte[] bArr2 = this.f317688x1;
                getEngineVersionInfo(bArr2, bArr2.length);
                byte[] bArr3 = this.f317691y1;
                getEngineQosInfo(bArr3, bArr3.length);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                int i = this.f317632f;
                long j = (long) i;
                if (i < 0) {
                    j += 4294967296L;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(j);
                sb4.append(",");
                sb4.append(this.f317665q);
                sb4.append(",");
                sb4.append(this.f317656n);
                sb4.append(",");
                sb4.append(this.f317662p);
                sb4.append(",");
                C106401z zVar2 = this.f317568G1;
                zVar2.getClass();
                sb4.append("" + zVar2.f317772a + "," + zVar2.f317773b + "," + zVar2.f317774c + "," + zVar2.f317775d + "," + zVar2.f317776e + "," + zVar2.f317777f + "," + zVar2.f317778g + "," + zVar2.f317779h + "," + 0 + "," + zVar2.f317780i + "," + zVar2.f317781j);
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("voipreport:DailStatString:");
                sb6.append(sb5);
                C112597j.m153938c("MicroMsg.Voip", sb6.toString());
                sb.append(sb5);
                sb.append(new String(this.f317685w1, 0, this.field_statInfoLength));
                sb.append(mo152803j());
                sb.append(mo152798i());
                C106401z zVar3 = this.f317568G1;
                zVar3.getClass();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(",");
                sb7.append(zVar3.f317782k);
                sb.append(sb7.toString());
                sb.append(new String(this.f317688x1, 0, this.field_engineVersionStatLength));
                sb.append(mo152796h());
                StringBuilder sb8 = new StringBuilder();
                sb8.append("cpuCapacity:");
                sb8.append(f317531R1);
                C112597j.m153936a("MicroMsg.Voip", sb8.toString());
                sb.append("," + f317531R1);
                sb.append(mo152834t());
                sb.append(mo152818s());
                sb.append(new String(this.f317691y1, 0, this.field_engineQosStatLength));
                String sb9 = sb.toString();
                C112597j.m153938c("MicroMsg.Voip", "statInfoBuffer = " + new String(this.f317685w1, 0, this.field_statInfoLength));
                C112597j.m153938c("MicroMsg.Voip", "engineVersionInfoBuffer = " + new String(this.f317688x1, 0, this.field_engineVersionStatLength));
                C112597j.m153938c("MicroMsg.Voip", "engineQosInfoBuffer = " + new String(this.f317691y1, 0, this.field_engineQosStatLength));
                C112597j.m153938c("MicroMsg.Voip", "voipreport:StatString = " + sb9);
                ((C29048w.C29055f) C31519v2.f84271a).mo56422a(this.field_netFlowRecv, this.field_netFlowSent, 0);
                C112597j.m153936a("MicroMsg.Voip", "voip net flow = " + (this.field_netFlowSent + this.field_netFlowRecv));
                return sb9;
            }
        }
        return "";
    }

    /* renamed from: y */
    public void mo152851y() {
        int i;
        Log.printInfoStack("MicroMsg.Voip", "v2protocal reset!", new Object[0]);
        int i2 = this.f317679u1;
        if (i2 > 0 && (i = this.field_videoDuration) > 0) {
            int i3 = i2 / i;
            this.f317574I1 = i3;
            Log.m105925i("MicroMsg.Voip", "calcCpatureFps:%s", Integer.valueOf(i3));
        }
        this.field_natSvrArray = null;
        this.field_peerId = null;
        this.field_capInfo = null;
        this.f317656n = 0;
        this.f317659o = 0;
        this.f317653m = 0;
        this.f317662p = 0;
        this.f317665q = 0;
        this.f317686x = 0;
        this.f317668r = 0;
        this.f317671s = null;
        this.f317674t = null;
        this.f317677u = null;
        this.f317680v = 0;
        this.f317683w = null;
        this.f317619a1 = 0;
        this.f317622b1 = null;
        this.f317625c1 = 0;
        this.f317628d1 = 0;
        this.f317557D = null;
        this.f317560E = null;
        this.f317643i1 = null;
        this.f317646j1 = null;
        this.f317664p1 = null;
        this.f317667q1 = null;
        this.f317670r1 = null;
        this.f317679u1 = 0;
        this.f317682v1 = 0;
        this.field_videoDuration = 0;
        this.field_audioDuration = 0;
        this.f317564F0 = 0;
        this.f317561E0 = 0;
        this.field_engineVersionStatLength = 0;
        this.field_engineQosStatLength = 0;
        this.field_statusSyncKey = 0;
        this.field_relayDataSyncKey = 0;
        this.field_connectingStatusKey = 0;
        this.f317578K = 0;
        this.f317581L = 0;
        this.f317584M = 65536;
        this.f317587N = 0;
        this.f317590O = 0;
        this.f317593P = 0;
        this.f317633f0 = -1;
        this.f317558D0 = 0;
        this.f317655m1 = 0;
        this.f317635g = "";
        this.f317569H = 0;
        this.f317649k1 = 0;
        this.f317652l1 = 0;
        C106401z zVar = this.f317568G1;
        zVar.f317783l = 0;
        zVar.f317772a = 0;
        zVar.f317773b = 0;
        zVar.f317774c = 0;
        zVar.f317775d = 0;
        zVar.f317776e = 0;
        zVar.f317777f = 0;
        zVar.f317778g = 0;
        zVar.f317779h = 0;
        zVar.f317780i = 0;
        zVar.f317781j = 0;
        zVar.f317782k = 0;
        zVar.mo152873e();
        this.field_jbmBitratRsSvrParamArray = null;
        this.field_jbmParamArraySize = 0;
        this.field_jbmBitratRsSvrParamDoubleArray = null;
        this.field_jbmParamDoubleArraySize = 0;
        this.f317642i0 = 0;
        this.f317645j0 = 0;
        this.f317648k0 = 0;
        this.f317651l0 = 0;
        this.f317654m0 = 0;
        f317537X1 = 0;
        this.f317660o0 = 0;
        this.f317663p0 = -1;
        this.f317666q0 = 0;
        this.f317681v0 = 0;
        this.f317684w0 = 0;
        this.f317687x0 = 0;
        this.f317690y0 = 0;
        this.f317549A0 = 0;
        this.f317693z0 = -1;
        this.f317555C0 = 0;
        this.f317552B0 = -1;
        f317538Y1 = false;
        f317539Z1 = 0;
        this.f317657n0 = "";
        f317540a2 = 0;
        f317541b2 = 0;
        this.f317647k = 0;
        this.f317650l = 0;
        this.f317571H1 = 0;
        C109247e.yx0(true);
        int freeJNIReport = freeJNIReport();
        C112597j.m153938c("MicroMsg.Voip", "freeJNIReport : " + freeJNIReport + ". [0: null, no need to free, 1: free success!]");
    }

    /* renamed from: z */
    public int mo152852z(int i) {
        int appCmd = setAppCmd(i, new byte[]{0}, 1);
        if (appCmd < 0) {
            C112597j.m153938c("MicroMsg.Voip", "setAppCmd: type:" + appCmd + ":ret:" + appCmd);
        }
        return appCmd;
    }
}
