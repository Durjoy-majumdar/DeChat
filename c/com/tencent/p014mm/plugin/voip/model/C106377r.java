package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Proxy;
import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import bl0.C67288e;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82993v;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.wxmm.v2encoder;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fm0.C86940g0;
import h43.C108077f0;
import h81.C32735h;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import l33.C109246a;
import l33.C109247e;
import lu3.C34379c;
import nj3.C76912y0;
import org.json.JSONArray;
import p156gj.C107823c;
import p156gj.C107825d;
import p156gj.C107835h0;
import p156gj.C107842p;
import p156gj.C87203t;
import p206nj.C11171e;
import p723vf.C90773a;
import pe3.C89349b;
import qe3.C89625d;
import ql0.C89699b;
import s33.C101529h;
import s33.C101531j;
import s33.C101533k;
import sf0.C90188n0;
import te3.C101864x23;
import te3.C110963ht1;
import te3.C51018qv3;
import te3.aw4;
import te3.ia4;
import te3.np4;
import te3.pv4;
import te3.ru4;
import te3.su4;
import te3.yu4;
import te3.zt4;
import v33.C111383b;
import vn0.C90846d;
import w80.C111744e;
import z33.C112595h;
import z33.C112597j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.r */
public class C106377r {

    /* renamed from: A */
    public C106400y f317450A = null;

    /* renamed from: B */
    public C106373o0 f317451B;

    /* renamed from: C */
    public byte[] f317452C = null;

    /* renamed from: D */
    public yu4 f317453D = null;

    /* renamed from: E */
    public boolean f317454E = false;

    /* renamed from: F */
    public boolean f317455F = false;

    /* renamed from: G */
    public int f317456G = 0;

    /* renamed from: H */
    public boolean f317457H = false;

    /* renamed from: I */
    public int f317458I = 0;

    /* renamed from: J */
    public int f317459J = 0;

    /* renamed from: K */
    public int f317460K = 0;

    /* renamed from: L */
    public int f317461L = 0;

    /* renamed from: M */
    public boolean f317462M = false;

    /* renamed from: N */
    public boolean f317463N = true;

    /* renamed from: O */
    public VoipScoreState f317464O;

    /* renamed from: P */
    public Network f317465P = null;

    /* renamed from: Q */
    public ConnectivityManager.NetworkCallback f317466Q = null;

    /* renamed from: R */
    public LinkedList<Integer> f317467R = new LinkedList<>();

    /* renamed from: S */
    public int f317468S = 0;

    /* renamed from: T */
    public MTimerHandler f317469T = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106379b(), true);

    /* renamed from: U */
    public MMHandler f317470U = new C106382d(Looper.getMainLooper());

    /* renamed from: V */
    public C34379c<?> f317471V = null;

    /* renamed from: W */
    public int f317472W = 0;

    /* renamed from: X */
    public boolean f317473X = false;

    /* renamed from: Y */
    public double f317474Y = 0.0d;

    /* renamed from: Z */
    public MTimerHandler f317475Z = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106378a(), false);

    /* renamed from: a */
    public int f317476a = 1;

    /* renamed from: a0 */
    public C106387h f317477a0 = null;

    /* renamed from: b */
    public boolean f317478b = false;

    /* renamed from: c */
    public boolean f317479c = false;

    /* renamed from: d */
    public boolean f317480d = false;

    /* renamed from: e */
    public boolean f317481e = false;

    /* renamed from: f */
    public boolean f317482f = false;

    /* renamed from: g */
    public boolean f317483g = false;

    /* renamed from: h */
    public boolean f317484h = false;

    /* renamed from: i */
    public boolean f317485i = false;

    /* renamed from: j */
    public boolean f317486j = false;

    /* renamed from: k */
    public ia4 f317487k = new ia4();

    /* renamed from: l */
    public int f317488l = 0;

    /* renamed from: m */
    public long f317489m = 0;

    /* renamed from: n */
    public long f317490n = 0;

    /* renamed from: o */
    public int f317491o = 0;

    /* renamed from: p */
    public int f317492p = 0;

    /* renamed from: q */
    public boolean f317493q = false;

    /* renamed from: r */
    public int f317494r = 10;

    /* renamed from: s */
    public int f317495s = -1;

    /* renamed from: t */
    public int f317496t = -1;

    /* renamed from: u */
    public int f317497u = -1;

    /* renamed from: v */
    public int f317498v = -1;

    /* renamed from: w */
    public int f317499w = -1;

    /* renamed from: x */
    public v2protocal f317500x = new v2protocal(this.f317470U);

    /* renamed from: y */
    public Context f317501y = null;

    /* renamed from: z */
    public C106393s0 f317502z = C106393s0.f317524q0;

    /* renamed from: com.tencent.mm.plugin.voip.model.r$a */
    public class C106378a implements MTimerHandler.CallBack {
        public C106378a() {
        }

        public boolean onTimerExpired() {
            if (C106377r.this.f317476a != 4) {
                return false;
            }
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "connect time out.. now finish..");
            C106377r rVar = C106377r.this;
            rVar.f317500x.f317568G1.f317772a = 105;
            rVar.mo152719v(1, -9000, "", -1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$b */
    public class C106379b implements MTimerHandler.CallBack {
        public C106379b() {
        }

        public boolean onTimerExpired() {
            Log.m105926v("MicroMsg.Voip.VoipContext", "voip repeat sync");
            C106377r.this.f317451B.mo152682a((su4) null, false, 7);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$c */
    public class C106380c extends ConnectivityManager.NetworkCallback {

        /* renamed from: com.tencent.mm.plugin.voip.model.r$c$a */
        public class C106381a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Network f317506d;

            /* renamed from: e */
            public final /* synthetic */ ConnectivityManager.NetworkCallback f317507e;

            public C106381a(Network network, ConnectivityManager.NetworkCallback networkCallback) {
                this.f317506d = network;
                this.f317507e = networkCallback;
            }

            public void run() {
                C106377r rVar = C106377r.this;
                if (rVar.f317465P != null) {
                    rVar.f317465P = this.f317506d;
                    if (rVar.f317467R != null) {
                        for (int i = 0; i < C106377r.this.f317467R.size(); i++) {
                            C106377r rVar2 = C106377r.this;
                            rVar2.mo152708j(rVar2.f317467R.get(i).intValue(), true);
                        }
                    }
                } else {
                    rVar.f317465P = this.f317506d;
                }
                C106377r rVar3 = C106377r.this;
                ConnectivityManager.NetworkCallback networkCallback = this.f317507e;
                rVar3.f317466Q = networkCallback;
                if (networkCallback != null) {
                    try {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "networkcallback hashCode: " + C106377r.this.f317466Q.hashCode());
                    } catch (Throwable unused) {
                        C112597j.m153936a("MicroMsg.Voip.VoipContext", "networkcallback is null");
                    }
                }
                C106377r.this.f317500x.f317648k0 = 1;
            }
        }

        public C106380c() {
        }

        public void onAvailable(Network network) {
            super.onAvailable(network);
            C106377r.this.f317500x.f317651l0++;
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "found requested network, toString: " + network.toString());
            if (C11171e.m11046c(28)) {
                ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
                try {
                    int multipathPreference = connectivityManager.getMultipathPreference(network);
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "getMultipathPreference ret " + multipathPreference);
                    if (multipathPreference == 0) {
                        C106377r.this.f317500x.f317648k0 = 3;
                    }
                } catch (Exception unused) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "getMultipathPreference  Error");
                    C106377r.this.f317500x.f317648k0 = 2;
                    try {
                        connectivityManager.unregisterNetworkCallback(this);
                        return;
                    } catch (Exception unused2) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "unregisterNetworkCallback Error");
                        return;
                    }
                }
            }
            MMHandlerThread.postToMainThread(new C106381a(network, this));
        }

        public void onLost(Network network) {
            super.onLost(network);
            C106377r.this.f317500x.f317654m0++;
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "network onLost, toString: " + network.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$d */
    public class C106382d extends MMHandler {

        /* renamed from: com.tencent.mm.plugin.voip.model.r$d$a */
        public class C106383a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f317510d;

            public C106383a(C106382d dVar, boolean z) {
                this.f317510d = z;
            }

            public void run() {
                C106343f0.m143231a().mo152576c(this.f317510d);
            }
        }

        public C106382d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            String str;
            Message message2 = message;
            if (message2 == null || message2.what != 59998) {
                super.handleMessage(message);
                return;
            }
            int i = message2.arg1;
            boolean z = false;
            if (i == 1) {
                if (C106377r.this.f317500x.f317656n == 0) {
                    C112597j.m153937b("MicroMsg.Voip.VoipContext", "JNI_DOSYNC without roomid , igored!");
                    return;
                }
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "need dosync for cmd from channel...");
                C106373o0 o0Var = C106377r.this.f317451B;
                int i2 = message2.arg2;
                o0Var.getClass();
                pv4 pv4 = new pv4();
                pv4.f184900d = 1;
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k((byte[]) message2.obj);
                pv4.f184901e = qv32;
                C51018qv3 qv33 = new C51018qv3();
                try {
                    qv33.mo73350k(pv4.toByteArray());
                    ru4 ru4 = new ru4();
                    ru4.f141157d = i2;
                    ru4.f141158e = qv33;
                    ru4.f141159f = C75592q0.m90789s();
                    su4 su4 = new su4();
                    su4.f141766d = 1;
                    su4.f141767e.add(ru4);
                    o0Var.mo152682a(su4, true, 2);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e, "", new Object[0]);
                }
            } else if (i == 4) {
                if (C106377r.this.f317500x.f317656n == 0) {
                    C112597j.m153937b("MicroMsg.Voip.VoipContext", "JNI_STARTDEVFAILED without roomid , igored!");
                    return;
                }
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "need hangUP for startTalk failed. ");
                C106377r rVar = C106377r.this;
                rVar.f317500x.f317568G1.f317772a = 107;
                rVar.mo152719v(1, -9004, "", -1);
            } else if (i == 6) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "OnChannelConnected from JNI");
                C106377r rVar2 = C106377r.this;
                v2protocal v2protocal = rVar2.f317500x;
                if (v2protocal.f317656n == 0) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "OnChannelConnected roomid null, ignored");
                    return;
                }
                rVar2.f317480d = true;
                v2protocal.f317568G1.f317788q = 1;
                if (!rVar2.f317482f && !rVar2.f317481e) {
                    v2protocal.f317564F0 = 1;
                }
                v2protocal.setInactive();
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "Voip.Channel setInactive");
                C106377r.this.mo152695I();
            } else if (i == 3) {
                C106377r.this.f317476a = 5;
            } else if (i == 5) {
                if (message2.arg2 == 14) {
                    ByteBuffer wrap = ByteBuffer.wrap((byte[]) message2.obj);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    int i3 = wrap.getInt();
                    if (i3 == 0 || i3 == 1) {
                        if (C106377r.this.f317500x.f317656n != 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "close room req from teg reason " + i3);
                            C106377r rVar3 = C106377r.this;
                            rVar3.f317500x.f317568G1.f317772a = 114;
                            rVar3.mo152719v(6, 0, "", -1);
                        }
                    } else if (i3 == 2) {
                        C106377r rVar4 = C106377r.this;
                        C106401z zVar = rVar4.f317500x.f317568G1;
                        zVar.f317772a = 113;
                        zVar.f317790s = 6;
                        rVar4.mo152719v(1, -9000, "", -1);
                    }
                } else {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "need hangUP for disconnect from channel..envent = " + message2.arg2);
                    C106377r rVar5 = C106377r.this;
                    if (rVar5.f317476a >= 5) {
                        rVar5.f317500x.f317568G1.f317772a = 108;
                    } else {
                        rVar5.f317500x.f317568G1.f317772a = 106;
                    }
                    int i4 = message2.arg2;
                    if (i4 == 5) {
                        rVar5.f317500x.f317568G1.f317790s = 1;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "channel broken...");
                    } else if (i4 == 8) {
                        if (rVar5.f317485i) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "channel connect fail while pre-connect");
                            C106377r.this.f317484h = true;
                            return;
                        }
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "channel connect fail...");
                        C106377r rVar6 = C106377r.this;
                        rVar6.f317480d = false;
                        rVar6.f317500x.f317568G1.f317790s = 5;
                    } else if (i4 == 2) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "channel closed...");
                        C106401z zVar2 = C106377r.this.f317500x.f317568G1;
                        zVar2.f317772a = 113;
                        zVar2.f317790s = 6;
                    }
                    Object obj = message2.obj;
                    if (obj != null) {
                        try {
                            if (((byte[]) obj)[0] == 1) {
                                C106377r.this.mo152719v(1, -9000, "", 3);
                                return;
                            }
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.Voip.VoipContext", "parse msg obj failed cause %s", e2.getMessage());
                        }
                    }
                    C106377r.this.mo152719v(1, -9000, "", -1);
                }
            } else if (i == 100) {
                C112597j.m153943h((byte[]) message2.obj, "MicroMsg.Voip.VoipContext", message2.arg2);
            } else if (i == 101) {
                C112597j.m153943h((byte[]) message2.obj, "MicroMsg.v2Core", message2.arg2);
            } else if (i == 7) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "NOTIFY_FROM_JNI_SPEEDTESTRESULT handle");
                byte[] bArr = (byte[]) message2.obj;
                int i5 = message2.arg2;
                String str2 = null;
                try {
                    str = ConnectivityCompat.Companion.getFormattedWiFiSsid();
                } catch (Exception unused) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "Get wifiName failed in voip speedTest!");
                    str = null;
                }
                try {
                    str2 = ((TelephonyManager) MMApplicationContext.getContext().getSystemService("phone")).getSimOperatorName();
                } catch (Exception unused2) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "Get netName failed in voip speedTest!");
                }
                C106377r rVar7 = C106377r.this;
                new C101531j(rVar7.f317490n, rVar7.f317489m, rVar7.f317491o, str2, str, 0.0d, 0.0d, rVar7.f317492p, i5, bArr).mo88544n1();
            } else if (i == 8) {
                C106377r.this.mo152720w((byte[]) message2.obj);
            } else if (i == 9) {
                C106401z zVar3 = C106377r.this.f317500x.f317568G1;
                if (0 == zVar3.f317750E) {
                    zVar3.f317750E = System.currentTimeMillis();
                    C112597j.m153938c("MicroMsg.VoipDailReport", "first pkt received timestamp:" + zVar3.f317750E);
                }
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "get first pkt for voip");
                if (1 == C106377r.this.f317500x.f317655m1) {
                    aw4 aw4 = new aw4();
                    aw4.f130810e = 1;
                    C106377r.this.f317451B.mo152684c(aw4, 2);
                }
            } else if (i == 11) {
                C106377r.this.f317468S = 2;
            } else if (i == 12) {
                C106377r.this.f317468S = 1;
            } else if (i == 13) {
                v2protocal v2protocal2 = C106377r.this.f317500x;
                new C101529h(v2protocal2.f317656n, v2protocal2.f317665q, v2protocal2.f317662p, 5, 0, (int[]) null, (LinkedList<C101864x23>) null).mo88544n1();
            } else if (i == 15) {
                C106377r.this.mo152708j(message2.arg2, false);
            } else if (i == 16) {
                if (message2.arg2 == 0) {
                    z = true;
                }
                MMHandlerThread.postToMainThread(new C106383a(this, z));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$e */
    public class C106384e implements Runnable {
        public C106384e() {
        }

        public void run() {
            C106377r.this.f317502z.mo152426F0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$f */
    public class C106385f implements Runnable {
        public C106385f() {
        }

        public void run() {
            C106377r rVar = C106377r.this;
            int i = rVar.f317472W + 1;
            rVar.f317472W = i;
            if (rVar.f317500x.f317682v1 != 0 || i > 10) {
                rVar.mo152711n();
                C34379c<?> cVar = C106377r.this.f317471V;
                if (cVar != null) {
                    cVar.cancel(false);
                    C106377r.this.f317471V = null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$g */
    public class C106386g implements C106388i {

        /* renamed from: a */
        public final /* synthetic */ C106390k f317513a;

        public C106386g(C106390k kVar) {
            this.f317513a = kVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$h */
    public interface C106387h {
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$i */
    public interface C106388i {
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$j */
    public class C106389j implements Runnable {

        /* renamed from: d */
        public int f317515d;

        /* renamed from: e */
        public int f317516e = 0;

        /* renamed from: f */
        public int f317517f = 0;

        /* renamed from: g */
        public C106388i f317518g;

        public C106389j(C106377r rVar, C106379b bVar) {
        }

        public void run() {
            byte b;
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost != null && defaultHost.length() > 0 && defaultPort > 0) {
                this.f317515d = 1;
                this.f317516e = defaultPort;
                try {
                    String hostAddress = InetAddress.getByName(defaultHost).getHostAddress();
                    try {
                        byte[] address = InetAddress.getByName(hostAddress).getAddress();
                        if (address != null) {
                            b = 0;
                            for (byte b2 : address) {
                                b = (b << 8) | (b2 & ExifInterface.MARKER);
                            }
                            Log.m105919d("MicroMsg.VoipHelper", "ipAddressStrToInt, ip: %s, result: %d", hostAddress, Integer.valueOf(b));
                            this.f317517f = b;
                        }
                    } catch (UnknownHostException e) {
                        Log.printErrStackTrace("MicroMsg.VoipHelper", e, "", new Object[0]);
                    }
                    b = 0;
                    this.f317517f = b;
                } catch (UnknownHostException e2) {
                    Log.printErrStackTrace("MicroMsg.Voip.VoipContext", e2, "", new Object[0]);
                }
            }
            C106388i iVar = this.f317518g;
            int i = this.f317515d;
            int i2 = this.f317516e;
            int i3 = this.f317517f;
            C106386g gVar = (C106386g) iVar;
            gVar.getClass();
            MMHandlerThread.postToMainThread(new C106396u(gVar, i, i3, i2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.r$k */
    public interface C106390k {
        /* renamed from: a */
        void mo152686a();
    }

    public C106377r() {
        C106400y yVar = new C106400y(this);
        this.f317450A = yVar;
        yVar.f317725r = this.f317500x.f317665q;
        this.f317451B = new C106373o0(this);
        this.f317461L = 0;
        this.f317464O = new VoipScoreState();
    }

    /* renamed from: l */
    public static double m143346l(byte[] bArr) {
        return Double.longBitsToDouble((((((((((((((((long) bArr[0]) & 255) | (((long) bArr[1]) << 8)) & 65535) | (((long) bArr[2]) << 16)) & 16777215) | (((long) bArr[3]) << 24)) & Util.MAX_32BIT_VALUE) | (((long) bArr[4]) << 32)) & 1099511627775L) | (((long) bArr[5]) << 40)) & 281474976710655L) | (((long) bArr[6]) << 48)) & 72057594037927935L) | (((long) bArr[7]) << 56));
    }

    /* renamed from: A */
    public void mo152687A(boolean z) {
        int i;
        C106393s0 s0Var;
        Class cls = C32735h.class;
        C112595h hVar = C112595h.f337166a;
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_RemoteRenderSharpen_Int;
        if (pVar.mo109882e(fVar, -1) != -1) {
            i = pVar.mo109882e(fVar, -1);
        } else {
            boolean z2 = true;
            if (C107835h0.f322845b.f322801P != 1) {
                boolean f = v2protocal.m143437f();
                boolean z3 = C111744e.f334654d.mo163483f() >= ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_sharpen_gpu_score_android, 80);
                Log.m105925i("MicroMsg.VoipRendererHelper", "checkRendererSharpenLocalConfig, localCheck:%s, gpuCheck:%s", Boolean.valueOf(f), Boolean.valueOf(z3));
                if (!f || !z3) {
                    z2 = false;
                }
                if (z2) {
                    i = z ? 25 : 20;
                }
            }
            i = 0;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_sharpen_1080p_android, 0);
        if (i > 0 && (s0Var = this.f317502z) != null) {
            s0Var.mo152418A0(i);
            this.f317502z.mo152479m0(Qe);
        }
        Log.m105924i("MicroMsg.Voip.VoipContext", "sifeng: voipSharpenFilterFlag:" + i + " isRemoteBeautyOpened:" + z + " voipSharpenFilter1080p:" + Qe);
        v2protocal v2protocal = this.f317500x;
        v2protocal.f317658n1 = i;
        v2protocal.f317661o1 = Qe;
    }

    /* renamed from: B */
    public void mo152688B(int i) {
        if (i != this.f317476a) {
            if (i == 4) {
                this.f317475Z.startTimer(60000);
            }
            this.f317476a = i;
        }
    }

    /* renamed from: C */
    public void mo152689C(boolean z) {
        this.f317473X = z;
        C106393s0 s0Var = this.f317502z;
        if (s0Var != null) {
            s0Var.mo149997h0(z);
        }
    }

    /* renamed from: D */
    public final void mo152690D() {
        if (!mo152715r() && !mo152714q()) {
            mo152711n();
        } else if (this.f317471V != null) {
            mo152711n();
        } else {
            this.f317472W = 0;
            this.f317471V = ((C119157j) C119157j.f356862d).mo183872c(new C106385f(), 200, 200);
        }
    }

    /* renamed from: E */
    public void mo152691E(C106390k kVar) {
        int i = this.f317476a;
        if (i != 2 && i != 3 && i != 4) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "startConnectRelay status fail, status:" + this.f317476a);
        } else if (this.f317478b) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "can not startConnectRelay again");
        } else {
            C106389j jVar = new C106389j(this, (C106379b) null);
            jVar.f317518g = new C106386g(kVar);
            ((C119157j) C119157j.f356862d).mo183875f(jVar);
        }
    }

    /* renamed from: F */
    public void mo152692F() {
        Log.m105924i("MicroMsg.Voip.VoipContext", "stop repeat voip sync");
        this.f317469T.stopTimer();
    }

    /* renamed from: G */
    public void mo152693G(int i) {
        if (!(8 == i || 9 == i)) {
            this.f317495s = i;
            this.f317496t = i;
        }
        C106373o0 o0Var = this.f317451B;
        o0Var.getClass();
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >>> (i2 * 8));
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        C51018qv3 qv33 = new C51018qv3();
        try {
            qv33.mo73350k(qv32.toByteArray());
            ru4 ru4 = new ru4();
            ru4.f141157d = 3;
            ru4.f141158e = qv33;
            ru4.f141159f = C75592q0.m90789s();
            su4 su4 = new su4();
            su4.f141766d = 1;
            su4.f141767e.add(ru4);
            o0Var.mo152682a(su4, false, 4);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e, "", new Object[0]);
        }
    }

    /* renamed from: H */
    public void mo152694H() {
        boolean z = !Util.isNullOrNil(this.f317500x.f317671s);
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "channel:try start connect, hasRemotePid:" + z + ",mStatus:" + this.f317476a + ",isPreConnect:" + this.f317485i + ",isRemoteAccepted:" + this.f317481e + ",isLocalAccept:" + this.f317482f);
        this.f317500x.f317568G1.f317784m = 7;
        if (z) {
            int i = this.f317476a;
            if (i != 4 && i != 5 && i != 6 && ((i != 2 || !this.f317485i) && (i != 3 || !this.f317485i))) {
                return;
            }
            if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "startConnect status fail, status:" + this.f317476a);
            } else if (this.f317481e || this.f317482f) {
                if (!this.f317478b) {
                    mo152691E(new C106376q(this));
                    return;
                }
                MMHandlerThread.postToMainThread(new C106397v(this));
                MMHandlerThread.postToMainThread(new C106399w(this));
            } else if (this.f317485i && !this.f317478b) {
                mo152691E(new C106375p(this));
            }
        }
    }

    /* renamed from: I */
    public void mo152695I() {
        int i;
        int i2;
        int i3;
        Class cls = C32735h.class;
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "tryStartTalk: try start talk");
        if (this.f317483g && this.f317480d) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "Voip tryStartTalk, channel setActive");
            this.f317500x.setActive();
            if (this.f317486j) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "tryStartTalk: engine already started, isEngineStarted " + this.f317486j);
                return;
            }
            v2protocal v2protocal = this.f317500x;
            v2protocal.setSvrConfig(205, 0, 0, v2protocal.f317628d1, 0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal2 = this.f317500x;
            v2protocal2.setSvrConfig(207, 0, 0, v2protocal2.f317551B, 0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal3 = this.f317500x;
            long j = v2protocal3.f317554C;
            v2protocal3.setSvrConfig(212, 0, 0, (int) (j & Util.MAX_32BIT_VALUE), (int) (j >> 32), 0, 0, 0, (byte[]) null);
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "bothSideGeneralSwitch = " + this.f317500x.f317628d1 + " SwitchFlag = " + this.f317500x.f317551B + " SwitchFlagExt = " + this.f317500x.f317554C);
            int i4 = ((int) ((this.f317500x.f317554C & Util.MAX_32BIT_VALUE) & 256)) >> 8;
            StringBuilder sb = new StringBuilder();
            sb.append("analysis opensl_flag=");
            sb.append(i4);
            C112597j.m153938c("MicroMsg.Voip.VoipContext", sb.toString());
            if (i4 == 1) {
                C106400y yVar = this.f317450A;
                yVar.f317730w = 1;
                C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "seenli, setOpenslFlag=" + yVar.f317730w);
            } else {
                C106400y yVar2 = this.f317450A;
                yVar2.f317730w = 0;
                C112597j.m153938c("MicroMsg.Voip.VoipDeviceHandler", "seenli, setOpenslFlag=" + yVar2.f317730w);
            }
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_frmidx_extension, -1);
            if (Qe > 0) {
                this.f317500x.setSvrConfig(211, Qe, 0, 0, 0, 0, 0, 0, (byte[]) null);
            }
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_video_vcodec2mix, -1);
            int i5 = Qe2 > 0 ? (Qe2 & 3) | 0 : 0;
            if (i5 >= 0) {
                this.f317500x.setSvrConfig(213, i5, 0, 0, 0, 0, 0, 0, (byte[]) null);
            }
            this.f317500x.setSvrConfig(210, 1, ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_video_arq, -1), 1, 0, 0, 0, 0, (byte[]) null);
            byte[] bArr = this.f317500x.f317557D;
            if (bArr != null && bArr.length >= 12 && (i3 = ByteBuffer.wrap(bArr, 8, 4).getInt()) > 0) {
                int i6 = (i3 / 1000000) % 10;
                int i7 = (i3 / 10000) % 100;
                int i8 = i3 % 10000;
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "lilyhpeng, getSvrBothSideGeneralStrategy for dtx, uiSvrDtxConfig:" + i3 + ", config dtx: [" + i6 + ", " + i7 + ", " + i8 + "]");
                this.f317500x.setJNIAppCmd(15, new byte[]{(byte) (i6 & 255), (byte) ((i6 >> 8) & 255), (byte) ((i6 >> 16) & 255), (byte) ((i6 >> 24) & 255), (byte) (i7 & 255), (byte) ((i7 >> 8) & 255), (byte) ((i7 >> 16) & 255), (byte) ((i7 >> 24) & 255), (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 24) & 255)}, 3);
            }
            if (this.f317500x.f317560E != null) {
                C110963ht1 ht12 = null;
                try {
                    ht12 = (C110963ht1) new C110963ht1().parseFrom(this.f317500x.f317560E);
                } catch (IOException unused) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "parse Voip general strategy fail");
                }
                if (ht12 != null) {
                    int i9 = ht12.f332015W0;
                    int i15 = ht12.f332017X0;
                    int i16 = ht12.f332019Y0;
                    int i17 = ht12.f332021Z0;
                    int i18 = ht12.f332022a1;
                    int i19 = ht12.f332023b1;
                    int i25 = ht12.f332024c1;
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "qipengfeng, jbm3_cofig:" + i9 + ", " + i15 + ", " + i16 + ", " + i17 + ", " + i18 + ", " + i19 + ", " + i25);
                    this.f317500x.setJNIAppCmd(13, new byte[]{(byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255), (byte) (i15 & 255), (byte) ((i15 >> 8) & 255), (byte) ((i15 >> 16) & 255), (byte) ((i15 >> 24) & 255), (byte) (i16 & 255), (byte) ((i16 >> 8) & 255), (byte) ((i16 >> 16) & 255), (byte) ((i16 >> 24) & 255), (byte) (i17 & 255), (byte) ((i17 >> 8) & 255), (byte) ((i17 >> 16) & 255), (byte) ((i17 >> 24) & 255), (byte) (i18 & 255), (byte) ((i18 >> 8) & 255), (byte) ((i18 >> 16) & 255), (byte) ((i18 >> 24) & 255), (byte) (i19 & 255), (byte) ((i19 >> 8) & 255), (byte) ((i19 >> 16) & 255), (byte) ((i19 >> 24) & 255), (byte) (i25 & 255), (byte) ((i25 >> 8) & 255), (byte) ((i25 >> 16) & 255), (byte) ((i25 >> 24) & 255)}, 7);
                    int i26 = ht12.f332026d1;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("qipengfeng, nsParas:");
                    sb4.append(i26);
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", sb4.toString());
                    if (i26 >= 0) {
                        this.f317500x.setJNIAppCmd(14, new byte[]{(byte) (i26 & 255), (byte) ((i26 >> 8) & 255), (byte) ((i26 >> 16) & 255), (byte) ((i26 >> 24) & 255)}, 1);
                    }
                    v2protocal v2protocal4 = this.f317500x;
                    byte[] bArr2 = v2protocal4.f317560E;
                    v2protocal4.setSvrConfig(208, 0, 0, 0, 0, 0, 0, bArr2.length, bArr2);
                    int i27 = ht12.f331994H;
                    int i28 = ht12.f331995I;
                    int i29 = ht12.f331996J;
                    int i35 = ht12.f331997K;
                    int i36 = (i27 & 15) | ((i28 & 15) << 4) | ((i29 & 15) << 8) | ((i35 & 15) << 12);
                    int g = C112597j.m153942g("hwenc");
                    int g2 = C112597j.m153942g("hwdec");
                    int g3 = C112597j.m153942g("swenc");
                    int g4 = C112597j.m153942g("swdec");
                    if (i36 != ((g & 15) | ((g2 & 15) << 4) | ((g3 & 15) << 8) | ((g4 & 15) << 12))) {
                        C112597j.m153947l("hwenc", i27);
                        C112597j.m153947l("hwdec", i28);
                        C112597j.m153947l("swenc", i29);
                        C112597j.m153947l("swdec", i35);
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli:nHWEncCap:" + i27 + ", nHWDecCap:" + i28 + ", nSWEncCap:" + i29 + ", nSWDecCap:" + i35 + ", nPrevHWEncCap:" + g + ", nPrevHWDecCap:" + g2 + ", nPrevSWEncCap:" + g3 + ", nPrevSWDecCap:" + g4);
                    int i37 = ht12.f332001P;
                    if (i37 != C112597j.m153942g("ladder_cpu")) {
                        C112597j.m153947l("ladder_cpu", i37);
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "qipeng, LADDER_CPU:" + i37);
                    this.f317500x.f317594P0 = ht12.f332025d;
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "AudioEnableXnoiseSup = " + this.f317500x.f317594P0);
                    this.f317450A.mo152860g(ht12.f332039k1, ht12.f332040l1);
                }
            } else {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "tryStartTalk: protocol has null generalStrategyBuf");
            }
            if (this.f317500x.startEngine() == 0) {
                this.f317500x.f317568G1.f317746A = 0;
            } else {
                this.f317486j = false;
                this.f317500x.f317568G1.f317746A = 1;
            }
            C79758p pVar = C79758p.f233760a;
            int e = pVar.mo109882e(C104160f.RepairerConfig_VOIP_TestEncodeParam_Int, 0);
            if (e != 0) {
                int e2 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_Use264_Int, 0);
                int e3 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_UseVcodec2_Int, 0);
                int e4 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_UseVCodec_Int, 0);
                int e5 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_UseVCodecMixRes_Int, 0);
                ArrayList arrayList = new ArrayList();
                if (e2 == 1) {
                    arrayList.add(8);
                }
                if (e3 == 1) {
                    arrayList.add(16);
                }
                if (e4 == 1) {
                    arrayList.add(2);
                }
                if (e5 == 1) {
                    arrayList.add(32);
                }
                int e6 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_Use1920_Int, 0);
                int e7 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_Use1280_Int, 0);
                int e8 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_Use640_Int, 0);
                int e9 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_Use480_Int, 0);
                int e15 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_Use320_Int, 0);
                ArrayList arrayList2 = new ArrayList();
                if (e6 == 1) {
                    arrayList2.add(12);
                }
                if (e7 == 1) {
                    arrayList2.add(10);
                }
                if (e8 == 1) {
                    arrayList2.add(8);
                }
                if (e9 == 1) {
                    arrayList2.add(6);
                }
                if (e15 == 1) {
                    arrayList2.add(4);
                }
                int e16 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_SetFPS_Int, 15);
                int e17 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_SetIPeriod_Int, 15);
                int e18 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_SetInterval_Int, 10);
                int e19 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_SetRSLevel_Int, 2);
                int e25 = pVar.mo109882e(C104160f.RepairerConfig_VOIP_SetBitrate_Int, 600);
                if (e != 3) {
                    byte[] bArr3 = new byte[12];
                    bArr3[4] = (byte) e16;
                    bArr3[5] = (byte) e17;
                    bArr3[6] = (byte) e18;
                    bArr3[7] = (byte) e19;
                    bArr3[8] = (byte) (e25 & 65535);
                    bArr3[9] = (byte) ((e25 >> 8) & 65535);
                    bArr3[10] = (byte) ((e25 >> 16) & 65535);
                    bArr3[11] = (byte) ((e25 >> 24) & 65535);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bArr3[2] = ((Integer) it.next()).byteValue();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            bArr3[3] = ((Integer) it4.next()).byteValue();
                            this.f317500x.setAppCmd(98, bArr3, 12);
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "weiranli: add result " + bArr3[0] + " size " + bArr3[1]);
                            if (bArr3[0] == 0) {
                                Context context = this.f317501y;
                                C76912y0.m92773l(context, "[tim]添加配置失败: codec:" + bArr3[2] + ", codecSize:" + bArr3[3]);
                                continue;
                            }
                            if (e == 1) {
                                continue;
                                break;
                            }
                        }
                        if (e == 1) {
                            break;
                        }
                    }
                } else {
                    try {
                        JSONArray jSONArray = new JSONArray(C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_VOIP_QOS_CUSTOM_STRING, ""));
                        for (int i38 = 0; i38 < jSONArray.length(); i38++) {
                            byte[] decode = Base64.decode(jSONArray.getString(i38), 0);
                            this.f317500x.setAppCmd(98, decode, 12);
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "tim: add result " + decode[0] + " size " + decode[1]);
                            if (decode[0] == 0) {
                                Context context2 = this.f317501y;
                                C76912y0.m92773l(context2, "[tim]添加配置失败: codec:" + decode[2] + ", codecSize:" + decode[3]);
                            }
                        }
                    } catch (Exception e26) {
                        Log.m105920e("MicroMsg.Voip.VoipContext", "use custom qos config fail:" + e26.getLocalizedMessage());
                    }
                }
            }
            mo152696J();
            this.f317476a = 5;
            mo152690D();
            this.f317502z.mo152491t0();
            this.f317450A.mo152861h();
            this.f317500x.f317568G1.mo152871c();
            this.f317502z.mo149999i0();
            this.f317500x.f317568G1.mo152870b();
            C106357m.m143314l(C109247e.xx0().mo152624w());
            v2protocal v2protocal5 = this.f317500x;
            v2protocal5.setSvrConfig(202, v2protocal5.f317567G0, v2protocal5.f317570H0, 0, 0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal6 = this.f317500x;
            v2protocal6.setSvrConfig(203, 0, 0, v2protocal6.f317582L0, 0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal7 = this.f317500x;
            v2protocal7.setSvrConfig(206, 0, 0, v2protocal7.f317594P0, 0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal8 = this.f317500x;
            v2protocal8.setSvrConfig(103, v2protocal8.f317573I0, v2protocal8.f317576J0, v2protocal8.f317579K0, v2protocal8.f317588N0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal9 = this.f317500x;
            int i39 = v2protocal9.f317597Q0;
            int i44 = (i39 >> 2) & 3;
            int i45 = i39 & 3;
            if (v2protocal9.f317662p == 0) {
                i44 <<= 2;
            } else {
                i45 <<= 2;
            }
            int i46 = i44 + i45;
            v2protocal9.setSvrConfig(502, 0, 0, i46, 0, 0, 0, 0, (byte[]) null);
            v2protocal v2protocal10 = this.f317500x;
            v2protocal10.setSvrConfig(503, 0, 0, v2protocal10.f317600R0, v2protocal10.f317602S0, v2protocal10.f317604T0, v2protocal10.f317606U0, 0, (byte[]) null);
            v2protocal v2protocal11 = this.f317500x;
            if (!(v2protocal11.f317643i1 == null || v2protocal11.f317646j1 == null)) {
                v2protocal11.setSvrConfig(504, 0, 0, v2protocal11.f317640h1, 0, 0, 0, 0, (byte[]) null);
                v2protocal v2protocal12 = this.f317500x;
                byte[] bArr4 = v2protocal12.f317643i1;
                v2protocal12.setSvrConfig(505, 0, 0, bArr4[0], bArr4[1], bArr4[2], bArr4[3], 0, (byte[]) null);
                v2protocal v2protocal13 = this.f317500x;
                byte[] bArr5 = v2protocal13.f317646j1;
                v2protocal13.setSvrConfig(506, 0, 0, bArr5[0], bArr5[1], 0, 0, 0, (byte[]) null);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "FECSvrCtr = " + this.f317500x.f317640h1 + ",FECKeyPara1 = " + this.f317500x.f317643i1[0] + "," + this.f317500x.f317643i1[1] + "," + this.f317500x.f317643i1[2] + "," + this.f317500x.f317643i1[3] + ",FECKeyPara2 = " + this.f317500x.f317646j1[0] + "," + this.f317500x.f317646j1[1]);
            }
            v2protocal v2protocal14 = this.f317500x;
            int i47 = v2protocal14.f317608V0;
            v2protocal14.setSvrConfig(507, 0, 0, (i47 & 4) >> 2, (i47 & 2) >> 1, i47 & 1, 0, 0, (byte[]) null);
            this.f317500x.setjbmbitraterssvrparam();
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "zhengxue[Logic] setSvrConfig brefore onStartTalk: audioTsdfBeyond3G = " + this.f317500x.f317567G0 + ",audioTsdEdge = " + this.f317500x.f317570H0 + ",passthroughQosAlgorithm = " + this.f317500x.f317573I0 + ",fastPlayRepair = " + this.f317500x.f317576J0 + ", audioDTX = " + this.f317500x.f317582L0 + ", mARQFlag = " + i46 + ", mQosStrategy = " + this.f317500x.f317608V0 + ", mSvrCfgListV = " + this.f317500x.f317579K0 + ", maxBRForRelay = " + this.f317500x.f317588N0);
            byte[] bArr6 = {(byte) C107835h0.f322845b.f322788C, -1};
            StringBuilder sb5 = new StringBuilder();
            sb5.append("steve: Model Name: ");
            sb5.append(C87203t.m108275k());
            C112597j.m153936a("MicroMsg.Voip.VoipContext", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("steve: Image Enhancement for Android Capture!!, mode: ");
            sb6.append(bArr6[0]);
            C112597j.m153936a("MicroMsg.Voip.VoipContext", sb6.toString());
            this.f317500x.setAppCmd(15, bArr6, 1);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("anlin: ClientVersion: ");
            sb7.append(C89625d.f257841g);
            C112597j.m153936a("MicroMsg.Voip.VoipContext", sb7.toString());
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN).putInt(C89625d.f257841g);
            byte[] array = allocate.array();
            this.f317500x.setAppCmd(505, array, 4);
            try {
                if (this.f317500x != null) {
                    np4 np4 = new np4();
                    np4.f332185d = 8;
                    np4.f332186e = new C89349b(array);
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin send local client version: " + array);
                    this.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                }
            } catch (Exception unused2) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin send local client version Error!");
            }
            String k = C87203t.m108275k();
            int length = k.length();
            byte[] bytes = k.getBytes();
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin DeviceModel: " + k);
            this.f317500x.setAppCmd(507, bytes, length);
            try {
                if (this.f317500x != null) {
                    np4 np42 = new np4();
                    np42.f332185d = 9;
                    np42.f332186e = new C89349b(bytes);
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin send local device model: " + k);
                    this.f317500x.SendRUDP(np42.toByteArray(), np42.toByteArray().length);
                }
            } catch (Exception unused3) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin send local device model Error!");
            }
            v2protocal v2protocal15 = this.f317500x;
            if (v2protocal15 != null) {
                String a = v2protocal15.mo152758a();
                if (a != null) {
                    this.f317500x.f317568G1.f317771Z = a.replace(',', ' ');
                    byte[] bytes2 = a.getBytes();
                    this.f317500x.setAppCmd(509, bytes2, a.length());
                    try {
                        np4 np43 = new np4();
                        np43.f332185d = 28;
                        np43.f332186e = new C89349b(bytes2);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin send local cpu hardware: " + a);
                        this.f317500x.SendRUDP(np43.toByteArray(), np43.toByteArray().length);
                    } catch (Exception unused4) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin send local device model Error!");
                    }
                } else {
                    Log.m105928w("MicroMsg.Voip.VoipContext", "get CpuHardware failed");
                }
            }
            this.f317500x.getClass();
            byte[] bArr7 = {0};
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "sifeng BeautyInfo: " + bArr7);
            try {
                if (this.f317500x != null) {
                    np4 np44 = new np4();
                    np44.f332185d = 22;
                    np44.f332186e = new C89349b(bArr7);
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "sifeng send local beauty info: " + bArr7);
                    this.f317500x.SendRUDP(np44.toByteArray(), np44.toByteArray().length);
                }
            } catch (Exception unused5) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "sifeng send local beautyInfo Error!");
            }
            int i48 = this.f317500x.f317551B;
            boolean z = ((i48 >> 17) & 1) != 0;
            boolean z2 = ((i48 >> 18) & 1) != 0;
            mo152702d(44, z);
            mo152703e(47, z2);
            if (!v2protocal.f317533T1) {
                mo152699a();
            }
            if ((this.f317500x.f317551B & 2) == 0) {
                mo152701c(16, true, true);
                i = 4;
                mo152701c(4, true, true);
            } else {
                i = 4;
            }
            int i49 = (this.f317500x.f317551B >> 12) & 1;
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate2.order(byteOrder);
            allocate2.putInt(i49);
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "weiranli set MixVcodec1 from svr = " + i49);
            this.f317500x.setAppCmd(46, allocate2.array(), 4);
            if ((this.f317500x.f317551B & 512) == 0) {
                ByteBuffer allocate3 = ByteBuffer.allocate(4);
                allocate3.order(byteOrder);
                allocate3.putInt(8);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen Disable 720p from svr: mSwitchFlag = " + this.f317500x.f317551B);
                this.f317500x.setAppCmd(32, allocate3.array(), 4);
                this.f317500x.setAppCmd(30, allocate3.array(), 4);
            }
            if ((this.f317500x.f317551B & 1048576) != 0) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "setAppCmd: EMethodSetP2SSendThreadEnable enble, mSwitchFlag: " + this.f317500x.f317551B);
                this.f317500x.mo152852z(52);
            } else {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "setAppCmd: EMethodSetP2SSendThreadEnable disable, mSwitchFlag: " + this.f317500x.f317551B);
            }
            if ((this.f317500x.f317554C & 512) != 0) {
                ByteBuffer allocate4 = ByteBuffer.allocate(4);
                allocate4.order(byteOrder);
                allocate4.putInt(1);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "setAppCmd: weiranli set rtprefext to 1, switchExt:" + this.f317500x.f317554C);
                i2 = 4;
                this.f317500x.setAppCmd(105, allocate4.array(), 4);
            } else {
                i2 = 4;
            }
            boolean z3 = C90188n0.f258933a;
            byte[] bArr8 = new byte[i2];
            this.f317500x.setAppCmd(26, bArr8, i2);
            ByteBuffer wrap = ByteBuffer.wrap(bArr8);
            wrap.order(byteOrder);
            int i54 = wrap.getInt();
            C112597j.m153936a("MicroMsg.Voip.VoipContext", "steve: iHW: " + i54);
            v2protocal v2protocal16 = this.f317500x;
            if (!((v2protocal16.f317579K0 & 4) != 0 || C107835h0.f322845b.f322790E > 0) && v2protocal16.f317598Q1) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:Server Disable HW enc/dec!!");
                boolean z4 = (i54 & 4) != 0;
                boolean z5 = (i54 & 8) != 0;
                if (z4 || z5) {
                    this.f317450A.f317718k = true;
                    mo152710m(false, false);
                }
                this.f317500x.f317598Q1 = false;
            }
            v2protocal v2protocal17 = this.f317500x;
            if (v2protocal17.f317598Q1) {
                boolean v = v2protocal17.mo152835v(C107835h0.f322845b.f322790E, i54);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve: HW encoder/decoder init ret: " + v + ", iHW:" + i54);
                if (!this.f317500x.f317598Q1) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve: HW dec/enc NOT supported for both sides,end HWEnc!!");
                    this.f317450A.f317718k = true;
                    mo152710m(false, false);
                    mo152700b(8, true, false, true);
                    mo152700b(8, true, false, false);
                }
            }
            C108077f0 T = C109247e.xx0().mo152619r().mo152447T();
            if (T != null) {
                T.mo158496k(C109247e.vx0().f333441a);
            }
            if (this.f317500x.f317583L1 != null) {
                this.f317500x.f317583L1.mo152570j(this);
            }
            C106339e eVar = v2protocal.f317544e2;
            if (eVar != null) {
                eVar.f317239q = this;
                Log.m105924i("MicroMsg.AvcDecoder", "setStrategyCaller");
            }
            this.f317486j = true;
            this.f317462M = false;
            this.f317464O.mo152532a();
            mo152717t();
            mo152716s();
            return;
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "tryStartTalk: fail isCanSendData " + this.f317483g + ", isChannelConnectedSuccess " + this.f317480d);
    }

    /* renamed from: J */
    public void mo152696J() {
        int i;
        int i2;
        Class cls = C32735h.class;
        C112597j.m153936a("MicroMsg.Voip.VoipContext", "SrvDeviceInfo.mAudioInfo.aecMode:" + C107835h0.f322846c.f322706O);
        if (C107835h0.f322846c.f322755m == 1) {
            this.f317500x.mo152852z(410);
        }
        byte[] bArr = new byte[2];
        int i3 = C107835h0.f322846c.f322706O;
        if (i3 > -1) {
            bArr[0] = (byte) i3;
            this.f317500x.setAppCmd(406, bArr, 1);
        } else if (i3 == -2) {
            this.f317500x.mo152852z(407);
        }
        this.f317500x.setAppCmd(v2helper.EMethodSetSendToNetworkOn, new byte[]{(byte) 1}, 1);
        int i4 = C107835h0.f322846c.f322708P;
        Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang SrvDeviceInfo.mAudioInfo.nsModeNew %d", Integer.valueOf(i4));
        int i5 = C107835h0.f322846c.f322708P;
        if (i5 > -1) {
            if (i4 > 0) {
                int floor = ((int) Math.floor(((double) i4) / 1000.0d)) % 100;
                Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang SrvDeviceInfo.mAudioInfo.iflag %d", Integer.valueOf(floor));
                if (floor > 0) {
                    this.f317500x.setAppCmd(408, new byte[]{(byte) (i4 & 255), (byte) ((i4 >> 8) & 255), (byte) ((i4 >> 16) & 255), (byte) ((i4 >> 24) & 255)}, 4);
                }
            } else if (i4 == 0) {
                this.f317500x.mo152852z(409);
            }
        } else if (i5 == -2) {
            this.f317500x.mo152852z(409);
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_rnnoise_sinfreqwind, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "mevinwang, nssinfwindmode = %d", Integer.valueOf(Qe));
        if (Qe > 0) {
            this.f317500x.setAppCmd(408, new byte[]{(byte) (Qe & 255), (byte) ((Qe >> 8) & 255), (byte) ((Qe >> 16) & 255), (byte) ((Qe >> 24) & 255)}, 4);
        } else if (Qe == 0) {
            this.f317500x.mo152852z(409);
        }
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_play_fadeinfadeout_switch, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang, play_fadeinfadeout_switch = %d", Integer.valueOf(Qe2));
        byte[] bArr2 = {0};
        if (Qe2 > 0) {
            bArr2[0] = (byte) Qe2;
        }
        this.f317500x.setAppCmd(451, bArr2, 1);
        StringBuilder sb = new StringBuilder(1024);
        VoipModelResMgr voipModelResMgr = VoipModelResMgr.f207454a;
        voipModelResMgr.mo98750b(sb);
        Log.m105924i("MicroMsg.Voip.VoipContext", "get ModelRoot: " + sb.toString());
        this.f317500x.setAppCmd(938, sb.toString().getBytes(), sb.toString().length());
        C106330a aVar = new C106330a();
        this.f317500x.mo152761b(aVar);
        StringBuilder sb4 = new StringBuilder(1024);
        if (aVar.f317170b <= 16000) {
            voipModelResMgr.mo98751c(sb4, 112, 3);
        } else {
            voipModelResMgr.mo98751c(sb4, 112, 4);
        }
        Log.m105924i("MicroMsg.Voip.VoipContext", "qipengfeng, ModelMd5: " + sb4.toString());
        if (sb4.toString().length() > 0 && sb4.toString().length() <= 256) {
            this.f317500x.setAppCmd(951, sb4.toString().getBytes(), sb4.toString().length());
        }
        StringBuilder sb5 = new StringBuilder(1024);
        if (aVar.f317170b <= 16000) {
            voipModelResMgr.mo98751c(sb5, 112, 7);
            Log.m105924i("MicroMsg.Voip.VoipContext", "dennyliang, HowlSup Model Md5: " + sb5.toString());
            if (sb5.toString().length() > 0 && sb5.toString().length() <= 256) {
                this.f317500x.setAppCmd(952, sb5.toString().getBytes(), sb5.toString().length());
            }
        }
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_vcodec2params_for_android, -1);
        int i6 = 11;
        if (Qe3 > 0) {
            byte b = (byte) (Qe3 & 1);
            int i7 = 3;
            byte[] bArr3 = {b, (byte) ((Qe3 >> 1) & 1), (byte) ((Qe3 >> 2) & 1), (byte) ((Qe3 >> 8) & 127)};
            Log.m105925i("MicroMsg.Voip.VoipContext", "ashlynli, x vcodec2 adaptiveBlur = %d, mixDenoise = %d, voipOpt = %d, cpuCap = %d", Byte.valueOf(b), Byte.valueOf(bArr3[1]), Byte.valueOf(bArr3[2]), Byte.valueOf(bArr3[3]));
            int i8 = 0;
            while (i8 < i7) {
                if (bArr3[i8] == 1) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    allocate.putInt(1);
                    try {
                        if (this.f317500x != null) {
                            np4 np4 = new np4();
                            if (i8 == 0) {
                                np4.f332185d = i6;
                            } else if (i8 == 1) {
                                np4.f332185d = 12;
                            } else if (i8 == 2) {
                                np4.f332185d = 13;
                            }
                            np4.f332186e = new C89349b(allocate.array());
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "Enable vcodec2 para, i = " + i8 + " , Send RUDP CMD rudpFlag =" + 1);
                            this.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                        }
                    } catch (Exception unused) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "Enable Vcodec2 para RUDP CMD Error, i = " + i8);
                    }
                }
                i8++;
                i7 = 3;
                i6 = 11;
            }
        }
        int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_fullbandflag, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang, fullbandmode = %d", Integer.valueOf(Qe4));
        int i9 = C107835h0.f322846c.f322712R;
        Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang SrvDeviceInfo.mAudioInfo.voipfullbandcfg %d", Integer.valueOf(i9));
        if (Qe4 > 0 && i9 > 0) {
            this.f317500x.setAppCmd(456, new byte[]{(byte) (Qe4 & 255), (byte) ((Qe4 >> 8) & 255), (byte) ((Qe4 >> 16) & 255), (byte) ((Qe4 >> 24) & 255)}, 4);
        }
        int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_play_fadeinfadeout_thresh, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang, play_fadeinfadeout_thresh = %d", Integer.valueOf(Qe5));
        bArr2[0] = 0;
        if (Qe5 > 0) {
            bArr2[0] = (byte) Qe5;
        }
        this.f317500x.setAppCmd(452, bArr2, 1);
        int Qe6 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_rcnnvadctr, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "kerrizhang, voip rcnnvad_switch = %d", Integer.valueOf(Qe6));
        if (Qe6 > 0) {
            this.f317500x.setAppCmd(C86940g0.CTRL_INDEX, new byte[]{(byte) Qe6}, 1);
        }
        int Qe7 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_aec_value, 0);
        Log.m105925i("MicroMsg.Voip.VoipContext", "dennyliang, voip aec_value = %d", Integer.valueOf(Qe7));
        if (Qe7 > 0) {
            this.f317500x.setAppCmd(460, new byte[]{(byte) (Qe7 & 255), (byte) ((Qe7 >> 8) & 255), (byte) ((Qe7 >> 16) & 255), (byte) ((Qe7 >> 24) & 255)}, 4);
        }
        int Qe8 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_cldnn_ns, -1);
        int Qe9 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_cldnn_ns_ct, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, cldnn_ns_config:%d, cldnn_ns_ct:%d", Integer.valueOf(Qe8), Integer.valueOf(Qe9));
        if (Qe8 > 0) {
            int i15 = Qe8 & 1;
            int i16 = (Qe8 >> 1) & 3;
            Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, cldnn ns para: %d, %d, %d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(Qe9));
            this.f317500x.setAppCmd(470, new byte[]{(byte) (i15 & 255), (byte) ((i15 >> 8) & 255), (byte) ((i15 >> 16) & 255), (byte) ((i15 >> 24) & 255), (byte) (i16 & 255), (byte) ((i16 >> 8) & 255), (byte) ((i16 >> 16) & 255), (byte) ((i16 >> 24) & 255), (byte) (Qe9 & 255), (byte) ((Qe9 >> 8) & 255), (byte) ((Qe9 >> 16) & 255), (byte) ((Qe9 >> 24) & 255)}, 3);
        }
        int Qe10 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_agc_params_ex, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, x_agc_paras: %d", Integer.valueOf(Qe10));
        if (Qe10 > 0) {
            byte b2 = (byte) (Qe10 & 1);
            Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, agc_switch: %d", Byte.valueOf(b2));
            if (b2 > 0) {
                byte b3 = (byte) ((Qe10 >> 1) & 3);
                byte[] bArr4 = {b3, (byte) ((Qe10 >> 3) & 31), (byte) ((Qe10 >> 8) & 31), (byte) ((Qe10 >> 13) & 31), (byte) ((Qe10 >> 18) & 31), (byte) ((Qe10 >> 23) & 7), (byte) ((Qe10 >> 26) & 15), (byte) ((Qe10 >> 30) & 1)};
                Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, agc para: %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(b3), Byte.valueOf(bArr4[1]), Byte.valueOf(bArr4[2]), Byte.valueOf(bArr4[3]), Byte.valueOf(bArr4[4]), Byte.valueOf(bArr4[5]), Byte.valueOf(bArr4[6]), Byte.valueOf(bArr4[7]));
                this.f317500x.setAppCmd(404, bArr4, 8);
            } else {
                this.f317500x.mo152852z(405);
            }
        }
        C107823c cVar = C107835h0.f322846c;
        int i17 = cVar.f322716T;
        if (i17 > -1) {
            byte[] bArr5 = new byte[8];
            byte[] bArr6 = new byte[2];
            int i18 = cVar.f322718U;
            if (i18 > -1 && (i2 = cVar.f322720V) > -1) {
                bArr6[0] = (byte) i18;
                bArr6[1] = (byte) i2;
                if (cVar.f322722W > -1) {
                    bArr5[0] = (byte) i17;
                    byte b4 = (byte) i2;
                    bArr5[1] = b4;
                    bArr5[2] = b4;
                    bArr5[3] = b4;
                    bArr5[4] = (byte) i18;
                    bArr5[5] = (byte) cVar.f322738d0;
                    bArr5[6] = (byte) cVar.f322740e0;
                    bArr5[7] = (byte) cVar.f322724X;
                    this.f317500x.setAppCmd(404, bArr5, 8);
                } else {
                    this.f317500x.setAppCmd(404, bArr6, 2);
                }
            } else if (i18 > -1 && (i = cVar.f322726Y) > -1) {
                bArr5[0] = (byte) i17;
                bArr5[1] = (byte) i;
                bArr5[2] = (byte) cVar.f322728Z;
                bArr5[3] = (byte) cVar.f322731a0;
                bArr5[4] = (byte) i18;
                bArr5[5] = (byte) cVar.f322738d0;
                bArr5[6] = (byte) cVar.f322740e0;
                bArr5[7] = (byte) cVar.f322724X;
                this.f317500x.setAppCmd(404, bArr5, 8);
            }
        } else if (i17 == -2) {
            this.f317500x.mo152852z(405);
        }
        int g = C112597j.m153942g("ladder_cpu");
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, nLadderCPU:%d", Integer.valueOf(g));
        if (g >= 0) {
            this.f317500x.setAppCmd(97, new byte[]{(byte) (g & 255), (byte) ((g >> 8) & 255), (byte) ((g >> 16) & 255), (byte) ((g >> 24) & 255)}, 1);
        }
        long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_voip_wave_agc, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, x-expt settings, wave_agc_paras: %d", Long.valueOf(He));
        if (He > -1) {
            byte[] bArr7 = new byte[11];
            byte b5 = (byte) ((int) (3 & He));
            bArr7[0] = b5;
            Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, x-expt settings, wave agc mode: %d", Byte.valueOf(b5));
            byte b6 = bArr7[0];
            if (b6 == 1) {
                bArr7[1] = (byte) ((int) ((He >> 2) & 31));
                bArr7[2] = (byte) ((int) ((He >> 7) & 31));
                bArr7[3] = (byte) ((int) ((He >> 12) & 31));
                bArr7[4] = (byte) ((int) ((He >> 17) & 31));
                bArr7[5] = (byte) ((int) ((He >> 22) & 15));
                bArr7[6] = (byte) ((int) ((He >> 26) & 15));
                bArr7[7] = (byte) ((int) ((He >> 30) & 1));
                bArr7[8] = (byte) ((int) ((He >> 31) & 31));
                bArr7[9] = (byte) ((int) ((He >> 36) & 31));
                bArr7[10] = (byte) ((int) ((He >> 41) & 31));
                this.f317500x.setAppCmd(461, bArr7, 11);
                Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, x-expt settings, wave agc paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr7[1]), Byte.valueOf(bArr7[2]), Byte.valueOf(bArr7[3]), Byte.valueOf(bArr7[4]), Byte.valueOf(bArr7[5]), Byte.valueOf(bArr7[6]), Byte.valueOf(bArr7[7]), Byte.valueOf(bArr7[8]), Byte.valueOf(bArr7[9]), Byte.valueOf(bArr7[10]));
            } else if (b6 == 2) {
                bArr7[1] = (byte) ((int) ((He >> 2) & 31));
                bArr7[2] = (byte) ((int) ((He >> 7) & 31));
                bArr7[3] = (byte) ((int) ((He >> 12) & 31));
                bArr7[4] = (byte) ((int) (31 & (He >> 17)));
                bArr7[5] = (byte) ((int) ((He >> 22) & 15));
                bArr7[6] = (byte) ((int) ((He >> 26) & 15));
                this.f317500x.setAppCmd(461, bArr7, 7);
                Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, x-expt settings, wave agc paras: %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr7[1]), Byte.valueOf(bArr7[2]), Byte.valueOf(bArr7[3]), Byte.valueOf(bArr7[4]), Byte.valueOf(bArr7[5]), Byte.valueOf(bArr7[6]));
            } else if (b6 == 0) {
                this.f317500x.setAppCmd(462, bArr7, 1);
            }
        }
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, device-model config, SrvDeviceInfo.mAudioInfo.waveAgcMode: %d", Integer.valueOf(C107835h0.f322846c.f322742f0));
        C107823c cVar2 = C107835h0.f322846c;
        int i19 = cVar2.f322742f0;
        if (i19 > -1) {
            byte[] bArr8 = new byte[11];
            byte b7 = (byte) i19;
            bArr8[0] = b7;
            if (b7 == 1) {
                bArr8[1] = (byte) cVar2.f322756m0;
                bArr8[2] = (byte) cVar2.f322758n0;
                bArr8[3] = (byte) cVar2.f322760o0;
                bArr8[4] = (byte) cVar2.f322750j0;
                bArr8[5] = (byte) cVar2.f322752k0;
                bArr8[6] = (byte) cVar2.f322754l0;
                bArr8[7] = (byte) cVar2.f322762p0;
                bArr8[8] = (byte) cVar2.f322744g0;
                bArr8[9] = (byte) cVar2.f322746h0;
                bArr8[10] = (byte) cVar2.f322748i0;
                this.f317500x.setAppCmd(461, bArr8, 11);
                Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, device-model config, wave agc paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr8[1]), Byte.valueOf(bArr8[2]), Byte.valueOf(bArr8[3]), Byte.valueOf(bArr8[4]), Byte.valueOf(bArr8[5]), Byte.valueOf(bArr8[6]), Byte.valueOf(bArr8[7]), Byte.valueOf(bArr8[8]), Byte.valueOf(bArr8[9]), Byte.valueOf(bArr8[10]));
            } else if (b7 == 2) {
                bArr8[1] = (byte) cVar2.f322744g0;
                bArr8[2] = (byte) cVar2.f322746h0;
                bArr8[3] = (byte) cVar2.f322748i0;
                bArr8[4] = (byte) cVar2.f322750j0;
                bArr8[5] = (byte) cVar2.f322752k0;
                bArr8[6] = (byte) cVar2.f322754l0;
                this.f317500x.setAppCmd(461, bArr8, 7);
                Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, device-model config, wave agc paras: %d, %d, %d, %d, %d, %d", Byte.valueOf(bArr8[1]), Byte.valueOf(bArr8[2]), Byte.valueOf(bArr8[3]), Byte.valueOf(bArr8[4]), Byte.valueOf(bArr8[5]), Byte.valueOf(bArr8[6]));
            } else if (b7 == 0) {
                this.f317500x.setAppCmd(462, bArr8, 1);
            }
        }
        int Qe11 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_frz_sta_peroid, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, tryUpdateAudioAdaption, frz_sta_p_x = %d", Integer.valueOf(Qe11));
        if (Qe11 > 0) {
            this.f317500x.setAppCmd(C82993v.CTRL_INDEX, new byte[]{(byte) (Qe11 & 255), (byte) ((Qe11 >> 8) & 255), (byte) ((Qe11 >> 16) & 255), (byte) ((Qe11 >> 24) & 255)}, 4);
        }
        int Qe12 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_new_net_state_tips, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, updateAudioAdaption, net_state_xexpt = %d", Integer.valueOf(Qe12));
        byte[] bArr9 = {0};
        if (Qe12 == 1) {
            bArr9[0] = 1;
        }
        this.f317500x.setAppCmd(C90846d.CTRL_INDEX, bArr9, 1);
        int Qe13 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_play_volume_factor, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, updateAudioAdaption, play_vol = %d", Integer.valueOf(Qe13));
        byte[] bArr10 = {0};
        if (Qe13 > 0 && Qe13 < 20) {
            bArr10[0] = (byte) Qe13;
            this.f317500x.setAppCmd(C89699b.C89702c.CTRL_INDEX, bArr10, 1);
        }
        int i25 = C107835h0.f322846c.f322734b0;
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, SrvDeviceInfo.mAudioInfo.playVolVoip: %d", Integer.valueOf(i25));
        if (i25 > 0 && i25 < 20) {
            bArr10[0] = (byte) i25;
            this.f317500x.setAppCmd(C89699b.C89702c.CTRL_INDEX, bArr10, 1);
        }
        int Qe14 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_engine_get_data_config, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, tryUpdateAudioAdaption, switch_flag_x = %d", Integer.valueOf(Qe14));
        byte[] bArr11 = {0};
        if (Qe14 > 0) {
            bArr11[0] = 1;
        }
        this.f317500x.setAppCmd(450, bArr11, 1);
        C107823c cVar3 = C107835h0.f322846c;
        int i26 = cVar3.f322757n;
        if (i26 > -1 || cVar3.f322761p > -1) {
            bArr[0] = -1;
            bArr[1] = -1;
            if (i26 > -1) {
                bArr[0] = (byte) i26;
            }
            int i27 = cVar3.f322761p;
            if (i27 > -1) {
                bArr[1] = (byte) i27;
            }
            this.f317500x.setAppCmd(414, bArr, 2);
        }
        C107823c cVar4 = C107835h0.f322846c;
        int i28 = cVar4.f322759o;
        if (i28 > -1 || cVar4.f322763q > -1) {
            bArr[0] = -1;
            bArr[1] = -1;
            if (i28 > -1) {
                bArr[0] = (byte) i28;
            }
            int i29 = cVar4.f322763q;
            if (i29 > -1) {
                bArr[1] = (byte) i29;
            }
            this.f317500x.setAppCmd(v2helper.EMethodOutputVolumeScaleEnable, bArr, 2);
        }
        C107823c cVar5 = C107835h0.f322846c;
        int i35 = cVar5.f322765r;
        if (i35 > -1 || cVar5.f322767s > -1) {
            bArr[0] = -1;
            bArr[1] = -1;
            if (i35 > -1) {
                bArr[0] = (byte) i35;
            }
            int i36 = cVar5.f322767s;
            if (i36 > -1) {
                bArr[1] = (byte) i36;
            }
            this.f317500x.setAppCmd(v2helper.EMethodOutputVolumeGainEnable, bArr, 2);
        }
        int i37 = C107835h0.f322846c.f322777x;
        if (i37 > -1) {
            bArr[0] = (byte) i37;
            this.f317500x.setAppCmd(v2helper.EMethodEhanceHeadsetEC, bArr, 1);
        }
        int i38 = C107835h0.f322846c.f322680B;
        if (i38 > -1) {
            bArr[0] = (byte) i38;
            this.f317500x.setAppCmd(431, bArr, 4);
        }
        int i39 = C107835h0.f322846c.f322779y;
        if (i39 > -1) {
            v2protocal v2protocal = this.f317500x;
            if (!(v2protocal.f317591O0 == 0 && i39 == 5)) {
                bArr[0] = (byte) i39;
                v2protocal.setAppCmd(417, bArr, 1);
            }
        }
        int i44 = C107835h0.f322846c.f322781z;
        if (i44 > -1) {
            v2protocal v2protocal2 = this.f317500x;
            if (!(v2protocal2.f317591O0 == 0 && i44 == 5)) {
                bArr[0] = (byte) i44;
                v2protocal2.setAppCmd(418, bArr, 1);
            }
        }
        int i45 = C107835h0.f322846c.f322678A;
        if (i45 > -1) {
            bArr[0] = (byte) i45;
            this.f317500x.setAppCmd(419, bArr, 1);
        }
        v2protocal v2protocal3 = this.f317500x;
        if (v2protocal3.f317591O0 == 1) {
            C107823c cVar6 = C107835h0.f322846c;
            if (cVar6.f322779y == 5 || cVar6.f322781z == 5) {
                v2protocal3.f317630e0 = 5;
            }
        }
        if (1 == C107835h0.f322846c.f322768s0) {
            byte[] bArr12 = new byte[30];
            for (int i46 = 0; i46 < 15; i46++) {
                int i47 = i46 * 2;
                short s = C107835h0.f322846c.f322770t0[i46];
                bArr12[i47] = (byte) (s & 255);
                bArr12[i47 + 1] = (byte) ((s >> 8) & 255);
            }
            this.f317500x.setAppCmd(v2helper.EMethodSetPlayerPreCorrectCofOn, bArr12, 30);
        }
        if (C107835h0.f322846c.f322768s0 == 0) {
            this.f317500x.mo152852z(v2helper.EMethodSetPlayerPreCorrectCofOff);
        }
        short[] sArr = C107835h0.f322846c.f322772u0;
        short s2 = sArr[0];
        if (s2 > 0 || sArr[1] > 0) {
            bArr[0] = 0;
            bArr[1] = 0;
            if (s2 > 0 && s2 < 10000) {
                bArr[0] = (byte) s2;
            }
            short s3 = sArr[1];
            if (s3 > 0 && s3 < 10000) {
                bArr[1] = (byte) s3;
            }
            this.f317500x.setAppCmd(v2helper.EMethodSetNgStrength, bArr, 2);
        }
        int i48 = C107835h0.f322846c.f322774v0;
        if (i48 > 0) {
            bArr[0] = (byte) i48;
            this.f317500x.setAppCmd(v2helper.EMethodSetSpkEnhance, bArr, 1);
        }
        int Qe15 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_agcrx_params, -1);
        Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, x_agcrx_para: %d", Integer.valueOf(Qe15));
        if (Qe15 > 0) {
            byte b8 = (byte) (Qe15 & 1);
            Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, agcrx_switch: %d", Byte.valueOf(b8));
            if (b8 > 0) {
                byte b9 = (byte) ((Qe15 >> 1) & 3);
                byte[] bArr13 = {b9, (byte) ((Qe15 >> 3) & 31), (byte) ((Qe15 >> 8) & 31), (byte) ((Qe15 >> 13) & 1)};
                Log.m105925i("MicroMsg.Voip.VoipContext", "qipengfeng, agcrx paras: %d, %d, %d, %d", Byte.valueOf(b9), Byte.valueOf(bArr13[1]), Byte.valueOf(bArr13[2]), Byte.valueOf(bArr13[3]));
                this.f317500x.setAppCmd(v2helper.EMethodSetAgcRxOn, bArr13, 4);
            }
        }
        C107823c cVar7 = C107835h0.f322846c;
        int i49 = cVar7.f322685D0;
        if (i49 > -1) {
            this.f317500x.setAppCmd(v2helper.EMethodSetAgcRxOn, new byte[]{(byte) i49, (byte) cVar7.f322687E0, (byte) cVar7.f322689F0, (byte) cVar7.f322691G0}, 4);
        }
    }

    /* renamed from: K */
    public void mo152697K(byte[] bArr) {
        boolean z = false;
        Log.m105925i("MicroMsg.Voip.VoipContext", "updateRemoteCapInfo, isGotCapInfo: %s", Byte.valueOf(this.f317500x.f317568G1.f317780i));
        v2protocal v2protocal = this.f317500x;
        C106401z zVar = v2protocal.f317568G1;
        if (zVar.f317780i != 1 && bArr != null) {
            zVar.f317780i = 1;
            v2protocal.f317674t = bArr;
            if (this.f317500x.f317674t != null) {
                v2protocal v2protocal2 = this.f317500x;
                int exchangeCabInfo = v2protocal2.exchangeCabInfo(v2protocal2.f317674t, this.f317500x.f317674t.length);
                if (this.f317500x.f317674t == null || this.f317500x.f317674t.length < 36) {
                    z = true;
                }
                this.f317463N = z;
                if (exchangeCabInfo < 0) {
                    C112597j.m153937b("MicroMsg.Voip.VoipContext", "protocal exchangecabinfo failed ret:" + exchangeCabInfo);
                    this.f317500x.f317568G1.f317772a = 15;
                    mo152719v(1, -9003, "", -1);
                }
            }
        }
    }

    /* renamed from: L */
    public void mo152698L(byte[] bArr) {
        Log.m105924i("MicroMsg.Voip.VoipContext", "updateRemotePid");
        v2protocal v2protocal = this.f317500x;
        C106401z zVar = v2protocal.f317568G1;
        zVar.f317777f = 1;
        zVar.f317776e = 1;
        v2protocal.f317671s = bArr;
    }

    /* renamed from: a */
    public void mo152699a() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(1);
        this.f317500x.setAppCmd(68, allocate.array(), 4);
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "hseasun: Voip close 720p Enc:  1");
    }

    /* renamed from: b */
    public int mo152700b(int i, boolean z, boolean z2, boolean z3) {
        if (i < 0) {
            return -1;
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec: targetCodec =" + i + ", local=" + z + ", remote =" + z2 + "encTag=" + z3);
        if (z && z3) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            try {
                if (this.f317500x != null) {
                    np4 np4 = new np4();
                    np4.f332185d = 6;
                    np4.f332186e = new C89349b(allocate.array());
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec:close local target codec: " + i);
                    this.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                }
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec Error");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(6);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putShort(2);
            allocate2.putShort((short) i);
            allocate2.putShort(0);
            this.f317500x.setAppCmd(39, allocate2.array(), 6);
            return 1;
        } else if (z && !z3) {
            ByteBuffer allocate3 = ByteBuffer.allocate(6);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate3.order(byteOrder);
            allocate3.putShort(0);
            allocate3.putShort((short) i);
            allocate3.putShort(0);
            this.f317500x.setAppCmd(39, allocate3.array(), 6);
            ByteBuffer allocate4 = ByteBuffer.allocate(4);
            allocate4.order(byteOrder);
            allocate4.putInt(i);
            try {
                if (this.f317500x == null) {
                    return 1;
                }
                np4 np42 = new np4();
                np42.f332185d = 7;
                np42.f332186e = new C89349b(allocate4.array());
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec:close local target codec: " + i);
                this.f317500x.SendRUDP(np42.toByteArray(), np42.toByteArray().length);
                return 1;
            } catch (Exception unused2) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec Error");
                return 1;
            }
        } else if (!z2 || !z3) {
            return 1;
        } else {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec:disable remote target codec: " + i);
            ByteBuffer allocate5 = ByteBuffer.allocate(6);
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            allocate5.order(byteOrder2);
            allocate5.putShort(3);
            allocate5.putShort((short) i);
            allocate5.putShort(0);
            this.f317500x.setAppCmd(39, allocate5.array(), 6);
            ByteBuffer allocate6 = ByteBuffer.allocate(4);
            allocate6.order(byteOrder2);
            allocate6.putInt(i);
            try {
                if (this.f317500x == null) {
                    return 1;
                }
                np4 np43 = new np4();
                np43.f332185d = 7;
                np43.f332186e = new C89349b(allocate6.array());
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec:close local target codec: " + i);
                this.f317500x.SendRUDP(np43.toByteArray(), np43.toByteArray().length);
                return 1;
            } catch (Exception unused3) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "CloseCodec Error");
                return 1;
            }
        }
    }

    /* renamed from: c */
    public int mo152701c(int i, boolean z, boolean z2) {
        if (i < 0) {
            return -1;
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:DisableCodec: targetCodec = " + i + ", local=" + z + ", remote =" + z2);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        if (z) {
            try {
                if (this.f317500x != null) {
                    np4 np4 = new np4();
                    np4.f332185d = 5;
                    np4.f332186e = new C89349b(allocate.array());
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:disable local target codec: " + i);
                    this.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                }
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "DisableCodec Error");
            }
        }
        if (!z2) {
            return 1;
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:disable remote target codec: " + i);
        ByteBuffer allocate2 = ByteBuffer.allocate(6);
        allocate2.order(ByteOrder.LITTLE_ENDIAN);
        allocate2.putShort(3);
        allocate2.putShort((short) i);
        allocate2.putShort(0);
        this.f317500x.setAppCmd(35, allocate2.array(), 6);
        return 1;
    }

    /* renamed from: d */
    public int mo152702d(int i, boolean z) {
        if (i < 0) {
            return -1;
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "EnableAq: SetAqFlag =" + i + ", aqBlur=" + z);
        if (z) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1);
            try {
                if (this.f317500x != null) {
                    np4 np4 = new np4();
                    np4.f332185d = 10;
                    np4.f332186e = new C89349b(allocate.array());
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "EnableAq: SetAqFlag =" + i + ", aqBlur=" + z);
                    this.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
                }
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "EnableAq Error");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            allocate2.putInt(1);
            this.f317500x.setAppCmd(44, allocate2.array(), 4);
        }
        return 1;
    }

    /* renamed from: e */
    public int mo152703e(int i, boolean z) {
        if (i < 0) {
            return -1;
        }
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "EnableBlur: SetBlurFlag =" + i + ", aqBlur=" + z);
        if (z) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1);
            this.f317500x.setAppCmd(47, allocate.array(), 4);
        }
        return 1;
    }

    /* renamed from: f */
    public int mo152704f(LinkedList<C101864x23> linkedList) {
        boolean z;
        LinkedList linkedList2 = new LinkedList();
        int c = this.f317500x.mo152762c(linkedList2);
        if (c == 0) {
            if (linkedList2.size() != 0 && linkedList2.size() <= 2) {
                if (((C101864x23) linkedList2.get(0)).f299815g == 4 && C112597j.m153940e(MMApplicationContext.getContext()) != 4) {
                    this.f317500x.f317642i0 = 1;
                    if (linkedList2.size() == 1) {
                        return 0;
                    }
                    ((C101864x23) linkedList2.get(1)).f299813e = 1;
                    linkedList2.remove();
                }
                if (((C101864x23) linkedList2.get(0)).f299813e == 1 && (((C101864x23) linkedList2.get(0)).f299815g == 5 || ((C101864x23) linkedList2.get(0)).f299815g == 6)) {
                    linkedList.add((C101864x23) linkedList2.get(0));
                    this.f317500x.f317645j0 = 1;
                    return 0;
                }
                linkedList.add((C101864x23) linkedList2.get(0));
                this.f317500x.f317642i0 = 1;
                ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
                try {
                    Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                    declaredMethod.setAccessible(true);
                    z = ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.Voip.VoipContext", "mobile network not connectedorconnecting");
                    return 0;
                }
                String simOperator = ((TelephonyManager) MMApplicationContext.getContext().getSystemService("phone")).getSimOperator();
                if (simOperator == null || simOperator.length() < 3) {
                    Log.m105924i("MicroMsg.Voip.VoipContext", "nic_op NULL");
                } else {
                    C101864x23 x232 = new C101864x23();
                    x232.f299812d = "android-cellular";
                    x232.f299813e = 0;
                    x232.f299815g = 5;
                    x232.f299814f = simOperator.substring(0, 3) + XVFSFile.PATH_SEPARATOR + simOperator.substring(3, simOperator.length());
                    linkedList.add(x232);
                    this.f317500x.f317645j0 = 1;
                }
            }
            return 0;
        }
        for (int i = 0; i < linkedList.size(); i++) {
            Log.m105918d("MicroMsg.Voip.VoipContext", "nic_name:" + linkedList.get(i).f299812d + " nic_role:" + linkedList.get(i).f299813e + " net_type:" + linkedList.get(i).f299815g + " nic_isp_info:" + linkedList.get(i).f299814f);
        }
        return c;
    }

    /* renamed from: g */
    public void mo152705g() {
        ia4 ia4;
        boolean z = this.f317478b;
        int i = 1;
        if (z && this.f317488l == 0) {
            this.f317488l = 1;
            v2protocal v2protocal = this.f317500x;
            int i2 = v2protocal.field_speedTestInfoLength;
            if (i2 < 8) {
                C112597j.m153937b("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! bufsize=" + this.f317500x.field_speedTestInfoLength);
                return;
            }
            int[] iArr = v2protocal.f317565F1;
            int i3 = iArr[1];
            int i4 = i3 + 2;
            if (i4 > i2) {
                C112597j.m153937b("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + i3 + ", bufsize=" + this.f317500x.field_speedTestInfoLength);
                return;
            }
            int i5 = iArr[i4 + 1];
            if (i3 + 6 + i5 != i2) {
                C112597j.m153937b("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + i3 + ", C2SRttCnt=" + i5 + ", bufsize=" + this.f317500x.field_speedTestInfoLength);
                return;
            }
            this.f317489m = v2protocal.f317665q;
            int i6 = v2protocal.f317629e;
            this.f317491o = i6;
            int i7 = v2protocal.f317656n;
            this.f317492p = i7;
            ia4 ia42 = this.f317487k;
            ia42.f298395d = i7;
            ia42.f298396e = v2protocal.f317569H;
            ia42.f298397f = i6;
            int i8 = 0;
            ia42.f298398g = z ? 1 : 0;
            if (!this.f317480d) {
                i = 0;
            }
            ia42.f298399h = i;
            ia42.f298400i = iArr[0];
            ia42.f298401j = i3;
            int i9 = 2;
            int i15 = 0;
            while (true) {
                ia4 = this.f317487k;
                if (i15 >= ia4.f298401j) {
                    break;
                }
                ia4.f298402n.add(Integer.valueOf(this.f317500x.f317565F1[i9]));
                i15++;
                i9++;
            }
            int[] iArr2 = this.f317500x.f317565F1;
            int i16 = i9 + 1;
            ia4.f298403o = iArr2[i9];
            int i17 = i16 + 1;
            ia4.f298404p = iArr2[i16];
            while (true) {
                ia4 ia43 = this.f317487k;
                if (i8 < ia43.f298404p) {
                    ia43.f298405q.add(Integer.valueOf(this.f317500x.f317565F1[i17]));
                    i8++;
                    i17++;
                } else {
                    int[] iArr3 = this.f317500x.f317565F1;
                    ia43.f298406r = iArr3[i17];
                    ia43.f298407s = iArr3[i17 + 1];
                    new C101533k(ia43).mo88544n1();
                    return;
                }
            }
        } else {
            C112597j.m153937b("MicroMsg.Voip.VoipContext", "StartVoipSpeedTest fail for status is wrong: isChannelStartConnect=" + this.f317478b + " ,mSpeedTestStatus=" + this.f317488l);
        }
    }

    /* renamed from: h */
    public void mo152706h() {
        int i = this.f317488l;
        if (i != 0) {
            if (i == 1) {
                this.f317488l = 0;
                this.f317500x.f317673s1 = 0;
                return;
            }
            this.f317488l = 0;
            v2protocal v2protocal = this.f317500x;
            v2protocal.getClass();
            C112597j.m153938c("MicroMsg.Voip", "v2protocal StopVoipSpeedTest!");
            v2protocal.StopSpeedTest();
            v2protocal.f317673s1 = 0;
        }
    }

    /* renamed from: i */
    public void mo152707i() {
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "try to UnregisterCellularNetwork");
        if (C11171e.m11046c(21)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            if (this.f317466Q != null) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "unregister networkcallback hashCode: " + this.f317466Q.hashCode());
                try {
                    connectivityManager.unregisterNetworkCallback(this.f317466Q);
                } catch (Exception unused) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "unregisterNetworkCallback Error");
                }
                this.f317466Q = null;
                this.f317465P = null;
            }
        }
    }

    /* renamed from: j */
    public void mo152708j(int i, boolean z) {
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "start bindSocket " + i + " ToNetwork " + this.f317465P + " rebind " + z);
        if (i == -1) {
            mo152707i();
        } else if (this.f317465P != null && C11171e.m11046c(23)) {
            FileDescriptor fileDescriptor = new FileDescriptor();
            try {
                Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                declaredField.setInt(fileDescriptor, i);
                this.f317465P.bindSocket(fileDescriptor);
                if (!z) {
                    this.f317467R.add(Integer.valueOf(i));
                }
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "bindSocketToNetwork success: network" + this.f317465P + "+socketfd" + i);
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "bindSocketToNetwork Error");
            }
        }
    }

    /* renamed from: k */
    public int mo152709k(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            Log.m105920e("MicroMsg.Voip.VoipContext", "transfer byte array to in fail:" + bArr);
            return 0;
        }
        return (bArr[0] & ExifInterface.MARKER) | ((bArr[3] & ExifInterface.MARKER) << 24) | ((bArr[2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[1] & ExifInterface.MARKER) << 8);
    }

    /* renamed from: m */
    public void mo152710m(boolean z, boolean z2) {
        if (!z) {
            if (this.f317500x != null) {
                if (this.f317463N) {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:closeRemoteHWEnc: Set P2S HW Flag False!!");
                    mo152701c(8, false, true);
                } else {
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "closecodec: remote i264 enc!");
                    mo152700b(8, false, true, true);
                }
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(6);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:closeRemoteHWEnc:reset maxsizeformat: 6");
                this.f317500x.setAppCmd(30, allocate.array(), 4);
            }
        } else if (this.f317463N) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "closeRemoteHWEnc: DecErr old!!");
            mo152721x(2);
        } else {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "closeRemoteHWEnc: DecErr new!!");
            if (z2) {
                mo152700b(4, true, false, false);
            } else {
                mo152700b(8, true, false, false);
            }
        }
    }

    /* renamed from: n */
    public final void mo152711n() {
        if (this.f317476a == 5) {
            mo152688B(6);
            C106401z zVar = this.f317500x.f317568G1;
            if (zVar.f317783l == 0) {
                zVar.f317775d = 0;
            } else {
                zVar.f317775d = (int) (System.currentTimeMillis() - zVar.f317783l);
            }
            C112597j.m153938c("MicroMsg.VoipDailReport", "devin:beginTime:" + zVar.f317783l + ", CurrentTime: " + System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append("devin:endDial:");
            sb.append(zVar.f317775d);
            C112597j.m153938c("MicroMsg.VoipDailReport", sb.toString());
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "talking  now .......!");
            this.f317470U.post(new C106384e());
        }
    }

    /* renamed from: o */
    public void mo152712o() {
        if (this.f317479c && !Util.isNullOrNil(this.f317500x.f317677u)) {
            v2protocal v2protocal = this.f317500x;
            byte[] bArr = v2protocal.f317677u;
            int handleCommand = v2protocal.handleCommand(1, bArr, bArr.length);
            if (handleCommand < 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipContext", "v2protocal handlecommand failed ret:" + handleCommand);
            }
            this.f317500x.f317677u = null;
        }
    }

    /* renamed from: p */
    public boolean mo152713p() {
        Log.m105919d("MicroMsg.Voip.VoipContext", "isWorking, status: %d", Integer.valueOf(this.f317476a));
        return this.f317476a != 1;
    }

    /* renamed from: q */
    public boolean mo152714q() {
        if (this.f317493q) {
            return false;
        }
        switch (this.f317495s) {
            case 0:
                return 4 == this.f317496t;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                int i = this.f317497u;
                if (4 == i || i == 0 || -1 == i) {
                    return true;
                }
                break;
            case 5:
            case 6:
            case 7:
                int i2 = this.f317497u;
                return (5 == i2 || 6 == i2 || 7 == i2) ? false : true;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo152715r() {
        if (this.f317493q) {
            return false;
        }
        switch (this.f317495s) {
            case 0:
                return 4 == this.f317496t;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                int i = this.f317496t;
                if (4 == i || -1 == i) {
                    return true;
                }
                break;
            case 5:
            case 6:
            case 7:
                int i2 = this.f317496t;
                return (5 == i2 || 6 == i2 || 7 == i2) ? false : true;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo152716s() {
        int i;
        boolean q = mo152714q();
        int i2 = this.f317499w;
        if (i2 == -1 || i2 != q) {
            if (q) {
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "setAppCmd: set start video In.......!");
                i = this.f317500x.mo152852z(201);
            } else {
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video In.......!");
                i = this.f317500x.mo152852z(200);
            }
            if (i == 0) {
                this.f317499w = q ? 1 : 0;
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "setAppCmd: succeed, ret: " + i + "recvVideoStatus: " + this.f317499w);
            }
        }
        return q;
    }

    /* renamed from: t */
    public boolean mo152717t() {
        int i;
        boolean r = mo152715r();
        int i2 = this.f317498v;
        if (i2 == -1 || i2 != r) {
            if (r) {
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "setAppCmd: set start video Out.......!");
                i = this.f317500x.mo152852z(203);
            } else {
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video Out.......!");
                i = this.f317500x.mo152852z(202);
            }
            if (i == 0) {
                this.f317498v = r ? 1 : 0;
                C112597j.m153936a("MicroMsg.Voip.VoipContext", "setAppCmd: succeed, ret: " + i + "sendVideoStatus: " + this.f317498v);
            }
        }
        return r;
    }

    /* renamed from: u */
    public void mo152718u() {
        C112597j.m153938c("MicroMsg.Voip.VoipContext", "In networkRequestViaCellular");
        if (C11171e.m11046c(21)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(0);
            builder.addCapability(12);
            NetworkRequest build = builder.build();
            if (build != null) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "NetworkRequest toString: " + build.toString() + " hashCode: " + build.hashCode());
            }
            try {
                connectivityManager.requestNetwork(build, new C106380c());
            } catch (Exception unused) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "missing the appropriate permissions");
                this.f317500x.f317648k0 = 2;
            }
        }
    }

    /* renamed from: v */
    public void mo152719v(int i, int i2, String str, int i3) {
        mo152692F();
        C106387h hVar = this.f317477a0;
        if (hVar != null) {
            ((C106359m0) hVar).mo152667l(i, i2, str, i3);
        }
    }

    /* renamed from: w */
    public void mo152720w(byte[] bArr) {
        C108077f0 T;
        C108077f0 T2;
        try {
            np4 np4 = (np4) new np4().parseFrom(bArr);
            if (!this.f317462M || np4.f332185d != 1) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve: onRecvRUDPCmd:" + np4.f332185d);
            }
            boolean z = false;
            switch (np4.f332185d) {
                case 1:
                    if (!this.f317462M) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: the other client end HWEnc!!");
                        mo152701c(8, false, true);
                        mo152700b(4, false, true, true);
                        C89349b bVar = np4.f332186e;
                        if (bVar != null) {
                            ByteBuffer wrap = ByteBuffer.wrap(bVar.f257327a, 0, 4);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            wrap.order(byteOrder);
                            int min = Math.min(wrap.getInt(), 6);
                            ByteBuffer allocate = ByteBuffer.allocate(4);
                            allocate.order(byteOrder);
                            allocate.putInt(min);
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:CMD_VOIP_CloseHWEnc:reset maxsizeformat: " + min);
                            this.f317500x.setAppCmd(30, allocate.array(), 4);
                        } else {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: cmdBuffer is nil!!");
                        }
                    }
                    this.f317462M = true;
                    return;
                case 2:
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: the other client tells us to end HWEnc!!");
                    this.f317450A.f317718k = true;
                    return;
                case 3:
                    C89349b bVar2 = np4.f332186e;
                    if (bVar2 != null) {
                        byte[] bArr2 = bVar2.f257327a;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve: remote new network type:" + bArr2);
                        int appCmd = this.f317500x.setAppCmd(302, bArr2, 4);
                        if (appCmd < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type " + bArr2 + "fail:" + appCmd + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
                    return;
                case 4:
                    C89349b bVar3 = np4.f332186e;
                    if (bVar3 != null) {
                        zt4 zt4 = (zt4) new zt4().parseFrom(bVar3.f257327a);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "zhengxue: remote audio dev occupied stat :" + zt4.f186874d);
                        byte[] bArr3 = new byte[4];
                        int i = zt4.f186874d;
                        bArr3[0] = (byte) i;
                        if (i == 1) {
                            int i2 = this.f317456G;
                            if (i2 == 0) {
                                this.f317456G = 2;
                            } else if (i2 == 1) {
                                this.f317456G = 3;
                            }
                        } else if (i == 2) {
                            int i3 = this.f317456G;
                            if (i3 == 2) {
                                this.f317456G = 0;
                            } else if (i3 == 3) {
                                this.f317456G = 1;
                            }
                        }
                        this.f317500x.setJNIAppCmd(2, bArr3, 4);
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "zhengxue:[CHANNEL]EMethod_AudioDevOccupiedStatsSync empty buffer");
                    return;
                case 5:
                    C89349b bVar4 = np4.f332186e;
                    if (bVar4 != null) {
                        byte[] bArr4 = bVar4.f257327a;
                        if (this.f317500x != null) {
                            ByteBuffer wrap2 = ByteBuffer.wrap(bArr4);
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            wrap2.order(byteOrder2);
                            int i4 = wrap2.getInt();
                            ByteBuffer allocate2 = ByteBuffer.allocate(6);
                            allocate2.order(byteOrder2);
                            allocate2.putShort(3);
                            allocate2.putShort((short) i4);
                            allocate2.putShort(0);
                            this.f317500x.setAppCmd(35, allocate2.array(), 6);
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_DisableCodec:  " + i4);
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_DisableCodec empty buffer");
                    return;
                case 6:
                    C89349b bVar5 = np4.f332186e;
                    if (bVar5 != null) {
                        byte[] bArr5 = bVar5.f257327a;
                        if (this.f317500x != null) {
                            ByteBuffer wrap3 = ByteBuffer.wrap(bArr5);
                            ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
                            wrap3.order(byteOrder3);
                            int i5 = wrap3.getInt();
                            ByteBuffer allocate3 = ByteBuffer.allocate(6);
                            allocate3.order(byteOrder3);
                            allocate3.putShort(3);
                            allocate3.putShort((short) i5);
                            allocate3.putShort(0);
                            this.f317500x.setAppCmd(39, allocate3.array(), 6);
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder:  " + i5);
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder empty buffer");
                    return;
                case 7:
                    C89349b bVar6 = np4.f332186e;
                    if (bVar6 != null) {
                        byte[] bArr6 = bVar6.f257327a;
                        if (this.f317500x != null) {
                            ByteBuffer wrap4 = ByteBuffer.wrap(bArr6);
                            ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                            wrap4.order(byteOrder4);
                            int i6 = wrap4.getInt();
                            if (i6 == 20) {
                                ByteBuffer allocate4 = ByteBuffer.allocate(6);
                                allocate4.order(byteOrder4);
                                allocate4.putShort(2);
                                allocate4.putShort(16);
                                allocate4.putShort(0);
                                this.f317500x.setAppCmd(39, allocate4.array(), 6);
                                ByteBuffer allocate5 = ByteBuffer.allocate(6);
                                allocate5.order(byteOrder4);
                                allocate5.putShort(2);
                                allocate5.putShort(4);
                                allocate5.putShort(0);
                                this.f317500x.setAppCmd(39, allocate5.array(), 6);
                            } else {
                                ByteBuffer allocate6 = ByteBuffer.allocate(6);
                                allocate6.order(byteOrder4);
                                allocate6.putShort(2);
                                allocate6.putShort((short) i6);
                                allocate6.putShort(0);
                                this.f317500x.setAppCmd(39, allocate6.array(), 6);
                            }
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder:  " + i6);
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder empty buffer");
                    return;
                case 8:
                    C89349b bVar7 = np4.f332186e;
                    if (bVar7 != null) {
                        byte[] bArr7 = bVar7.f257327a;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin: remote wx ver: " + bArr7);
                        int appCmd2 = this.f317500x.setAppCmd(506, bArr7, 4);
                        if (appCmd2 == 0) {
                            C109247e.vx0().f333444d = (long) mo152709k(bArr7);
                            C109246a aVar = C109247e.xx0().f317333b;
                            if (!(aVar == null || (T = aVar.mo152447T()) == null)) {
                                T.mo158496k(C109247e.vx0().f333441a);
                            }
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteClientVersion] remote wx ver: " + bArr7 + "ret: " + appCmd2 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteClientVersion] empty buffer");
                    return;
                case 9:
                    C89349b bVar8 = np4.f332186e;
                    if (bVar8 != null) {
                        byte[] bArr8 = bVar8.f257327a;
                        int length = bArr8.length;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin: remote device model: " + bArr8);
                        int appCmd3 = this.f317500x.setAppCmd(508, bArr8, length);
                        if (appCmd3 == 0) {
                            C111383b vx02 = C109247e.vx0();
                            String str = new String(bArr8);
                            vx02.getClass();
                            vx02.f333445e = str;
                            C109246a aVar2 = C109247e.xx0().f317333b;
                            if (!(aVar2 == null || (T2 = aVar2.mo152447T()) == null)) {
                                T2.mo158496k(C109247e.vx0().f333441a);
                            }
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteDeviceModel] remote device model: " + bArr8 + "ret: " + appCmd3 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteDeviceModel] empty buffer");
                    return;
                case 10:
                    break;
                case 11:
                    if (np4.f332186e != null) {
                        ByteBuffer allocate7 = ByteBuffer.allocate(4);
                        allocate7.order(ByteOrder.LITTLE_ENDIAN);
                        allocate7.putInt(1);
                        this.f317500x.setAppCmd(70, allocate7.array(), 4);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAdaptiveBlur:  1");
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAdaptiveBlur empty buffer");
                    return;
                case 12:
                    if (np4.f332186e != null) {
                        ByteBuffer allocate8 = ByteBuffer.allocate(4);
                        allocate8.order(ByteOrder.LITTLE_ENDIAN);
                        allocate8.putInt(1);
                        this.f317500x.setAppCmd(71, allocate8.array(), 4);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableMixDenoise:  1");
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableMixDenoise empty buffer");
                    return;
                case 13:
                    if (np4.f332186e != null) {
                        ByteBuffer allocate9 = ByteBuffer.allocate(4);
                        allocate9.order(ByteOrder.LITTLE_ENDIAN);
                        allocate9.putInt(1);
                        this.f317500x.setAppCmd(72, allocate9.array(), 4);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableVoipOpt:  1");
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableVoipOpt empty buffer");
                    return;
                case 14:
                    C89349b bVar9 = np4.f332186e;
                    if (bVar9 != null) {
                        ByteBuffer wrap5 = ByteBuffer.wrap(bVar9.f257327a);
                        ByteOrder byteOrder5 = ByteOrder.LITTLE_ENDIAN;
                        wrap5.order(byteOrder5);
                        int i7 = wrap5.getInt();
                        ByteBuffer allocate10 = ByteBuffer.allocate(4);
                        allocate10.order(byteOrder5);
                        allocate10.putInt((short) i7);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteCpuFreq:  " + i7);
                        int appCmd4 = this.f317500x.setAppCmd(84, allocate10.array(), 4);
                        if (appCmd4 < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteCpuFreq:  " + i7 + "ret: " + appCmd4 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteCpuFreq: empty buffer!");
                    return;
                case 15:
                    C89349b bVar10 = np4.f332186e;
                    if (bVar10 != null) {
                        byte[] bArr9 = bVar10.f257327a;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryTemp:  " + bArr9);
                        int appCmd5 = this.f317500x.setAppCmd(85, bArr9, 4);
                        if (appCmd5 < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryTemp:  " + bArr9 + "ret: " + appCmd5 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryTemp: empty buffer!");
                    return;
                case 16:
                    C89349b bVar11 = np4.f332186e;
                    if (bVar11 != null) {
                        byte[] bArr10 = bVar11.f257327a;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryQuan:  " + bArr10);
                        int appCmd6 = this.f317500x.setAppCmd(86, bArr10, 4);
                        if (appCmd6 < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryQuan:  " + bArr10 + "ret: " + appCmd6 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryQuan: empty buffer!");
                    return;
                case 17:
                    C89349b bVar12 = np4.f332186e;
                    if (bVar12 != null) {
                        byte[] bArr11 = bVar12.f257327a;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteLowBattery:  " + bArr11);
                        int appCmd7 = this.f317500x.setAppCmd(87, bArr11, 4);
                        if (appCmd7 < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteLowBattery:  " + bArr11 + "ret: " + appCmd7 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteLowBattery: empty buffer!");
                    return;
                case 18:
                    if (np4.f332186e == null) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteProtoBuf empty buffer");
                        return;
                    }
                    return;
                case 19:
                    C89349b bVar13 = np4.f332186e;
                    if (bVar13 == null) {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_RecoverCodec empty buffer");
                        break;
                    } else {
                        byte[] bArr12 = bVar13.f257327a;
                        if (this.f317500x != null) {
                            ByteBuffer wrap6 = ByteBuffer.wrap(bArr12);
                            ByteOrder byteOrder6 = ByteOrder.LITTLE_ENDIAN;
                            wrap6.order(byteOrder6);
                            int i8 = wrap6.getInt();
                            ByteBuffer allocate11 = ByteBuffer.allocate(6);
                            allocate11.order(byteOrder6);
                            allocate11.putShort(5);
                            allocate11.putShort((short) i8);
                            allocate11.putShort(0);
                            this.f317500x.setAppCmd(39, allocate11.array(), 6);
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_RecoverCodec:  " + i8);
                            break;
                        }
                    }
                    break;
                case 21:
                    C89349b bVar14 = np4.f332186e;
                    if (bVar14 != null) {
                        ByteBuffer wrap7 = ByteBuffer.wrap(bVar14.f257327a);
                        ByteOrder byteOrder7 = ByteOrder.LITTLE_ENDIAN;
                        wrap7.order(byteOrder7);
                        int i9 = wrap7.getInt();
                        ByteBuffer allocate12 = ByteBuffer.allocate(4);
                        allocate12.order(byteOrder7);
                        allocate12.putInt((short) i9);
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteTotalCpuFreq:  " + i9);
                        int appCmd8 = this.f317500x.setAppCmd(91, allocate12.array(), 4);
                        if (appCmd8 < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteTotalCpuFreq:  " + i9 + "ret: " + appCmd8 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteTotalCpuFreq: empty buffer!");
                    return;
                case 22:
                    C89349b bVar15 = np4.f332186e;
                    if (bVar15 != null) {
                        byte[] bArr13 = bVar15.f257327a;
                        if (bArr13.length > 0) {
                            try {
                                if (bArr13[0] != 0) {
                                    z = true;
                                }
                                mo152687A(z);
                                return;
                            } catch (Exception unused) {
                                C112597j.m153938c("MicroMsg.Voip.VoipContext", "sifeng set beautyInfo for sharpen Error!");
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "sifeng set beautyInfo for sharpen empty buffer");
                        return;
                    }
                case 23:
                case 24:
                    C89349b bVar16 = np4.f332186e;
                    if (bVar16 != null) {
                        byte[] bArr14 = bVar16.f257327a;
                        int length2 = bArr14.length;
                        Log.m105921e("MicroMsg.Voip.VoipContext", "cmdTpye  is %s and timestampe %s", Integer.valueOf(np4.f332185d), Double.valueOf(m143346l(bArr14)));
                        if (length2 > 0) {
                            try {
                                if (np4.f332185d == 24) {
                                    z = true;
                                }
                                if (this.f317474Y > m143346l(bArr14)) {
                                    Log.m105920e("MicroMsg.Voip.VoipContext", "error happened while signal un sorted");
                                    return;
                                }
                                this.f317474Y = m143346l(bArr14);
                                mo152689C(z);
                                return;
                            } catch (Exception unused2) {
                                Log.m105924i("MicroMsg.Voip.VoipContext", "anaylsis capture pause , Error!");
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        Log.m105924i("MicroMsg.Voip.VoipContext", "anaylsis capture pause empty buffer, Error!");
                        return;
                    }
                case 28:
                    C89349b bVar17 = np4.f332186e;
                    if (bVar17 != null) {
                        byte[] bArr15 = bVar17.f257327a;
                        int length3 = bArr15.length;
                        C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin: remote cpu hardware: " + new String(bArr15));
                        int appCmd9 = this.f317500x.setAppCmd(C67288e.CTRL_INDEX, bArr15, length3);
                        if (appCmd9 < 0) {
                            C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteCpuHardware] remote cpu hardware: " + bArr15 + "ret: " + appCmd9 + ", [roomid=" + this.f317500x.f317662p + ", roomkey=" + this.f317500x.f317665q + "]");
                            return;
                        }
                        return;
                    }
                    C112597j.m153938c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteCpuHardware] empty buffer");
                    return;
                default:
                    return;
            }
            if (np4.f332186e != null) {
                ByteBuffer allocate13 = ByteBuffer.allocate(4);
                allocate13.order(ByteOrder.LITTLE_ENDIAN);
                allocate13.putInt(1);
                this.f317500x.setAppCmd(48, allocate13.array(), 4);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAq:  1");
                return;
            }
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAq empty buffer");
        } catch (Exception unused3) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "rudp cmd processing Error");
        }
    }

    /* renamed from: x */
    public void mo152721x(int i) {
        try {
            np4 np4 = new np4();
            np4.f332185d = i;
            if (1 == i) {
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:send maxsizeformat: !!6");
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(6);
                np4.f332186e = new C89349b(allocate.array());
                this.f317500x.setAppCmd(32, allocate.array(), 4);
            } else {
                np4.f332186e = null;
            }
            this.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: send RUDP data to close remote HW encoding!Type:" + i);
        } catch (Exception unused) {
            C112597j.m153938c("MicroMsg.Voip.VoipContext", "onVoipSendCloseHWEncCmd Error");
        }
    }

    /* renamed from: y */
    public void mo152722y(int i, int i2, int i3, int i4, int i5) {
        this.f317500x.f317624c0 = (int) ((((double) i) * Math.pow(16.0d, 7.0d)) + (((double) i2) * Math.pow(16.0d, 6.0d)) + (((double) i3) * Math.pow(16.0d, 4.0d)) + (((double) i4) * Math.pow(16.0d, 2.0d)) + (((double) i5) * Math.pow(16.0d, 0.0d)));
    }

    /* renamed from: z */
    public void mo152723z() {
        Class cls = C32735h.class;
        int a = C107842p.m146108a();
        boolean z = (a & 1024) != 0;
        int i = (a >> 12) & 15;
        int i2 = a & 255;
        int i3 = Build.VERSION.SDK_INT;
        long g = (C90773a.m113841g(MMApplicationContext.getContext()) / 1024) / 1024;
        boolean z2 = i >= ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_beauty_cpu_core_num_threshold, 4);
        boolean z3 = i2 >= ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_beauty_cpu_freq_threshold, 45);
        boolean z4 = i3 >= ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_beauty_sdkint_threadshold, 23);
        boolean z5 = g >= ((long) ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_beauty_totalmem_threshold, 4096));
        double a2 = C90773a.m113835a();
        Debug.MemoryInfo b = C90773a.m113836b(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.Voip.VoipContext", "checkVoipBeautyLocalConfig, cpuFlags:%s, isNeon:%s, nCores:%s, nFreq:%s, sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s, cpuRate:%s, dalvikPss:%s, nativePss:%s", Integer.valueOf(a), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(g), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Double.valueOf(a2), Integer.valueOf(b.dalvikPss), Integer.valueOf(b.nativePss));
        if (z && z2 && z3 && z4 && z5) {
            boolean f = v2protocal.m143437f();
        }
        C107825d dVar = C107835h0.f322845b;
        int i4 = dVar.f322796K;
        int i5 = dVar.f322797L;
        C112595h hVar = C112595h.f337166a;
        Boolean bool = Boolean.FALSE;
        Log.m105924i("MicroMsg.Voip.VoipContext", "hseasun: voipSTFilterSvrCfg:" + ((this.f317500x.f317551B >> 15) & 1) + " voipSTFilterWhiteList:" + i4 + " voipSTFilterBlackList:" + i5 + " voipSTFilterFlag:%d " + 0 + " xSettingEnableSTFitler:" + bool);
        this.f317500x.getClass();
    }
}
