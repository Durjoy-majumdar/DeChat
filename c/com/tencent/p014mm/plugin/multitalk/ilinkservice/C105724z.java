package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import as3.C103882j0;
import c82.C104323b;
import com.tencent.mars.ilink.comm.PlatformComm;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105689s;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.VoipModelResMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.wxmm.IConfCallBack;
import com.tencent.wxmm.v2conference;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import l33.C109247e;
import lu3.C109426i;
import lu3.C34379c;
import mu3.C109639a;
import ob0.C47350c;
import org.xwalk.core.XWalkEnvironment;
import ow3.C110090n;
import p144dt.C7516d;
import p156gj.C107823c;
import p156gj.C107835h0;
import p182kk.C61104a;
import p206nj.C11171e;
import p206nj.C76866m;
import p206nj.C88957l;
import p564iq.C87790d;
import pe3.C89349b;
import pu0.C110248b;
import te3.C110966jz;
import te3.C110967kz;
import te3.C49918iz;
import te3.C64407gz;
import te3.C64433hz;
import te3.C64670qz;
import te3.ct4;
import te3.dt4;
import te3.et4;
import te3.ft4;
import te3.gs4;
import te3.nd4;
import te3.od4;
import te3.rs4;
import te3.xs4;
import te3.ys4;
import te3.zs4;
import z33.C91617n;
import zr3.C112670b;
import zr3.C112672d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z */
public enum C105724z implements C112670b {
    INSTANCE;
    

    /* renamed from: E1 */
    public static boolean f314341E1;

    /* renamed from: A */
    public C105703u.C105704a f314343A;

    /* renamed from: A1 */
    public boolean f314344A1;

    /* renamed from: B */
    public C105703u.C105704a f314345B;

    /* renamed from: B1 */
    public boolean f314346B1;

    /* renamed from: C */
    public C105703u.C105704a f314347C;

    /* renamed from: C1 */
    public Runnable f314348C1;

    /* renamed from: D */
    public C105703u.C105704a f314349D;

    /* renamed from: E */
    public C105703u.C105704a f314350E;

    /* renamed from: F */
    public C105703u.C105704a f314351F;

    /* renamed from: G */
    public C105703u.C105704a f314352G;

    /* renamed from: H */
    public C105703u.C105704a f314353H;

    /* renamed from: I */
    public C105703u.C105704a f314354I;

    /* renamed from: J */
    public C105703u.C105704a f314355J;

    /* renamed from: K */
    public C105703u.C105704a f314356K;

    /* renamed from: L */
    public C105703u.C105704a f314357L;

    /* renamed from: M */
    public C105703u.C105704a f314358M;

    /* renamed from: N */
    public C105703u.C105704a f314359N;

    /* renamed from: P */
    public C105703u.C105704a f314360P;

    /* renamed from: Q */
    public C105703u.C105704a f314361Q;

    /* renamed from: Q0 */
    public String f314362Q0;

    /* renamed from: R */
    public C105703u.C105704a f314363R;

    /* renamed from: R0 */
    public long f314364R0;

    /* renamed from: S */
    public C105703u.C105704a f314365S;

    /* renamed from: S0 */
    public String f314366S0;

    /* renamed from: T */
    public C105703u.C105704a f314367T;

    /* renamed from: T0 */
    public String f314368T0;

    /* renamed from: U */
    public C105703u.C105704a f314369U;

    /* renamed from: U0 */
    public int f314370U0;

    /* renamed from: V */
    public boolean f314371V;

    /* renamed from: V0 */
    public boolean f314372V0;

    /* renamed from: W */
    public boolean f314373W;

    /* renamed from: W0 */
    public boolean f314374W0;

    /* renamed from: X */
    public boolean f314375X;

    /* renamed from: X0 */
    public String f314376X0;

    /* renamed from: Y */
    public boolean f314377Y;

    /* renamed from: Y0 */
    public LinkedList<et4> f314378Y0;

    /* renamed from: Z */
    public boolean f314379Z;

    /* renamed from: Z0 */
    public C105743t f314380Z0;

    /* renamed from: a1 */
    public int f314381a1;

    /* renamed from: b1 */
    public int f314382b1;

    /* renamed from: c1 */
    public int[] f314383c1;

    /* renamed from: d */
    public final C105662m2 f314384d;

    /* renamed from: d1 */
    public int[] f314385d1;

    /* renamed from: e */
    public final C105703u f314386e;

    /* renamed from: e1 */
    public int f314387e1;

    /* renamed from: f */
    public final C105689s f314388f;

    /* renamed from: f1 */
    public boolean f314389f1;

    /* renamed from: g */
    public final C105657m f314390g;

    /* renamed from: g1 */
    public boolean f314391g1;

    /* renamed from: h */
    public final C105697s2 f314392h;

    /* renamed from: h1 */
    public C105674p[] f314393h1;

    /* renamed from: i */
    public final C42574q f314394i;

    /* renamed from: i1 */
    public C105674p[] f314395i1;

    /* renamed from: j */
    public final MMHandler f314396j;

    /* renamed from: j1 */
    public C105594a f314397j1;

    /* renamed from: k1 */
    public boolean f314398k1;

    /* renamed from: l1 */
    public LinkedList<C64407gz> f314399l1;

    /* renamed from: m1 */
    public LinkedList<rs4> f314400m1;

    /* renamed from: n */
    public int f314401n;

    /* renamed from: n1 */
    public boolean f314402n1;

    /* renamed from: o */
    public C85291s f314403o;

    /* renamed from: o1 */
    public nd4 f314404o1;

    /* renamed from: p */
    public String f314405p;

    /* renamed from: p0 */
    public C105608d f314406p0;

    /* renamed from: p1 */
    public boolean f314407p1;

    /* renamed from: q */
    public int f314408q;

    /* renamed from: q1 */
    public Network f314409q1;

    /* renamed from: r */
    public int f314410r;

    /* renamed from: r1 */
    public ConnectivityManager.NetworkCallback f314411r1;

    /* renamed from: s */
    public int f314412s;

    /* renamed from: s1 */
    public LinkedList<Integer> f314413s1;

    /* renamed from: t */
    public int f314414t;

    /* renamed from: t1 */
    public Object f314415t1;

    /* renamed from: u */
    public C105703u.C105704a f314416u;

    /* renamed from: u1 */
    public int f314417u1;

    /* renamed from: v */
    public C105703u.C105704a f314418v;

    /* renamed from: v1 */
    public int f314419v1;

    /* renamed from: w */
    public C105703u.C105704a f314420w;

    /* renamed from: w1 */
    public int f314421w1;

    /* renamed from: x */
    public C105703u.C105704a f314422x;

    /* renamed from: x0 */
    public boolean f314423x0;

    /* renamed from: x1 */
    public int f314424x1;

    /* renamed from: y */
    public C105703u.C105704a f314425y;

    /* renamed from: y0 */
    public int f314426y0;

    /* renamed from: y1 */
    public Map<Long, rs4> f314427y1;

    /* renamed from: z */
    public C105703u.C105704a f314428z;

    /* renamed from: z1 */
    public boolean f314429z1;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$a */
    public class C30288a extends MMHandler {

        /* renamed from: a */
        public TelephonyManager f81789a;

        /* renamed from: b */
        public PhoneStateListener f81790b;

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$a$a */
        public class C30289a extends PhoneStateListener {

            /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$a$a$a */
            public class C30290a implements Runnable {
                public C30290a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: hy: phone broken. exit room if in room");
                    C105724z zVar = C105724z.this;
                    C85291s sVar = C85291s.ReasonInCommingCall;
                    C105724z zVar2 = C105724z.INSTANCE;
                    zVar.mo150605o(sVar);
                }
            }

            public C30289a() {
            }

            public void onCallStateChanged(int i, String str) {
                super.onCallStateChanged(i, str);
                if (i == 1) {
                    C105724z.this.mo150614x(new C30290a());
                }
            }
        }

        public C30288a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 272) {
                if (this.f81789a == null) {
                    this.f81789a = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
                    this.f81790b = new C30289a();
                }
                TelephonyManager telephonyManager = this.f81789a;
                PhoneStateListener phoneStateListener = this.f81790b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(32);
                aVar.mo10233c(phoneStateListener);
                C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ilinkservice/ILinkService$1", "handleMessage", "(Landroid/os/Message;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/multitalk/ilinkservice/ILinkService$1", "handleMessage", "(Landroid/os/Message;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$w */
    public static class C30291w implements C109426i {

        /* renamed from: d */
        public final Runnable f81794d;

        public C30291w(Runnable runnable) {
            this.f81794d = runnable;
        }

        public String getKey() {
            return "IlinkNoLoggingRunnable";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            Runnable runnable = this.f81794d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$s */
    public enum C85291s {
        ReasonInterrupted(0),
        ReasonManual(1),
        ReasonDevice(2),
        ReasonInCommingCall(3),
        ReasonSessionUpdateFailed(4),
        ReasonUnknown(100);

        /* access modifiers changed from: public */
        C85291s(int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$u */
    public static class C85292u implements C80916r<Bundle, Bundle> {
        private C85292u() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putString("device_info", C86709a0.m107535s().mo121144k().mo119656Lo(77825));
            return bundle2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$v */
    public static class C85293v implements C80916r<Bundle, Bundle> {
        private C85293v() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            boolean z = C61104a.m71644D() || C91617n.m114968f() || C91617n.m114970h() || C91617n.m114969g();
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: check voip state:%b,%b,%b,%b,%b", Boolean.valueOf(z), Boolean.valueOf(C61104a.m71644D()), Boolean.valueOf(C91617n.m114968f()), Boolean.valueOf(C91617n.m114970h()), Boolean.valueOf(C91617n.m114969g()));
            bundle2.putBoolean("is_in_voip", z);
            return bundle2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$b */
    public class C105725b implements C105703u.C105704a<C64670qz, String> {
        public C105725b() {
        }

        /* renamed from: a */
        public Object mo150478a(byte[] bArr) {
            C64670qz qzVar = new C64670qz();
            try {
                qzVar.parseFrom(bArr);
                return qzVar;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e, "hy: unable to parse from data", new Object[0]);
                return null;
            }
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: on member changed");
            C105724z.this.mo150614x(new C105634h1(this, (C64670qz) obj));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$c */
    public class C105726c implements C105703u.C105704a<C64433hz, String> {
        public C105726c() {
        }

        /* renamed from: a */
        public Object mo150478a(byte[] bArr) {
            C64433hz hzVar = new C64433hz();
            try {
                hzVar.parseFrom(bArr);
                return hzVar;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e, "hy: unable to parse from data", new Object[0]);
                return null;
            }
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: on avmembers changed");
            C105724z.this.mo150614x(new C105642i1(this, (C64433hz) obj, i));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$d */
    public class C105727d implements C105703u.C105704a<String, String> {
        public C105727d() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            Log.m105929w("MicroMsg.Multitalk.ILinkService", "hy: call broken! %d, %s", Integer.valueOf(i), (String) obj);
            C105724z.this.mo150614x(new C105647j1(this));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$e */
    public class C105728e implements C105703u.C105704a<String, C110966jz> {
        public C105728e() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return null;
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            C110966jz jzVar = (C110966jz) obj;
            if (jzVar != null) {
                try {
                    return jzVar.toByteArray();
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e, "hy: error when convert to byte array", new Object[0]);
                }
            }
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            C104323b bVar;
            String str = (String) obj;
            C105724z.this.mo150589E();
            C105724z zVar = C105724z.this;
            zVar.getClass();
            zVar.f314417u1 = C110248b.vx0().mo161473O();
            zVar.f314419v1 = C110248b.vx0().mo161473O();
            C107823c cVar = C107835h0.f322846c;
            int i2 = -1;
            if (!cVar.f322730a) {
                zVar.f314417u1 = 3;
                zVar.f314419v1 = 3;
                int i3 = cVar.f322686E;
                if (i3 > -1) {
                    zVar.f314417u1 = i3;
                }
                if (C76866m.m92676e() && 2 == C107835h0.f322856m.f322905l) {
                    zVar.f314419v1 = 2;
                }
                int i4 = C107835h0.f322846c.f322688F;
                if (i4 > -1) {
                    zVar.f314419v1 = i4;
                }
            } else if (cVar.mo158228b()) {
                C107823c cVar2 = C107835h0.f322846c;
                int i5 = cVar2.f322735c;
                if (i5 >= 0) {
                    zVar.f314417u1 = i5;
                    zVar.f314419v1 = i5;
                } else if (cVar2.f322737d >= 0) {
                    zVar.f314417u1 = 0;
                    zVar.f314419v1 = 2;
                }
            } else if (C107835h0.f322846c.mo158227a()) {
                if (C107835h0.f322846c.mo158233g() >= 0) {
                    zVar.f314417u1 = C107835h0.f322846c.mo158233g();
                }
                if (C107835h0.f322846c.mo158232f() >= 0) {
                    zVar.f314419v1 = C107835h0.f322846c.mo158232f();
                }
            }
            zVar.f314421w1 = 0;
            zVar.f314424x1 = 0;
            C107823c cVar3 = C107835h0.f322846c;
            if (cVar3.f322733b > 0) {
                zVar.f314421w1 = 3;
                zVar.f314424x1 = 0;
            } else {
                int i6 = cVar3.f322690G;
                if (i6 > -1) {
                    zVar.f314421w1 = i6;
                    zVar.f314424x1 = i6;
                }
            }
            int i7 = cVar3.f322692H;
            if (i7 > -1) {
                zVar.f314421w1 = i7;
            }
            int i8 = cVar3.f322694I;
            if (i8 > -1) {
                zVar.f314424x1 = i8;
            }
            C105724z zVar2 = C105724z.this;
            C105719y.f314318d = zVar2.f314417u1;
            C105719y.f314319e = zVar2.f314419v1;
            C105719y.f314321g = zVar2.f314421w1;
            C105719y.f314322h = zVar2.f314424x1;
            C105657m mVar = zVar2.f314390g;
            C105719y.f314320f = mVar.f314154b == null ? 0 : mVar.f314154b.f330226e;
            C105724z.this.f314390g.f314153a.getClass();
            C104323b bVar2 = C105851w0.zx0().f314469K;
            C105719y.f314323i = bVar2 != null ? bVar2.f308784m : false ? 1 : 0;
            C105657m mVar2 = C105724z.this.f314390g;
            C105719y.f314324j = mVar2.f314154b == null ? 0 : mVar2.f314154b.mo161897b();
            if (C105724z.this.f314390g.f314153a == null || (bVar = C105851w0.zx0().f314469K) == null) {
                i2 = 0;
            } else {
                C106336d dVar = bVar.f308783l;
                if (dVar != null) {
                    i2 = dVar.mo152550i();
                }
            }
            C105719y.f314325k = i2;
            C105724z.this.f314390g.getClass();
            C105724z.this.f314390g.getClass();
            C105724z.this.f314390g.getClass();
            C105719y.f314326l = 0;
            C105719y.f314327m = 0;
            C105719y.f314328n = 0;
            C110966jz jzVar = new C110966jz();
            jzVar.f332114d = C105719y.f314315a;
            jzVar.f332116f = C105719y.f314316b;
            jzVar.f332117g = C105719y.f314317c;
            jzVar.f332125r = C105719y.f314324j;
            jzVar.f332124q = C105719y.f314323i;
            jzVar.f332120j = C105719y.f314320f;
            jzVar.f332118h = C105719y.f314318d;
            jzVar.f332119i = C105719y.f314319e;
            jzVar.f332121n = C105719y.f314321g;
            jzVar.f332122o = C105719y.f314322h;
            jzVar.f332126s = C105719y.f314325k;
            jzVar.f332127t = C105719y.f314326l;
            jzVar.f332128u = C105719y.f314327m;
            int i9 = C105719y.f314328n;
            jzVar.f332129v = i9;
            Log.m105925i("MicroMsg.ILinkReporter", "amyfwang,interrupt_cnt:%d", Integer.valueOf(i9));
            C105724z.this.mo150614x(new C105651k1(this, i));
            return jzVar;
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$f */
    public class C105729f implements C105689s.C105693b {

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$f$a */
        public class C105730a implements Runnable {
            public C105730a(ArrayList arrayList) {
            }

            public void run() {
                C105724z zVar = C105724z.this;
                if (zVar.f314401n != 1) {
                    Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: onSpeakerListChanged but not in room!");
                } else {
                    zVar.getClass();
                }
            }
        }

        public C105729f() {
        }

        /* renamed from: a */
        public void mo150558a(ArrayList<C105683r> arrayList) {
            Log.m105927v("MicroMsg.Multitalk.ILinkService", "hy: current talking members are %s", arrayList);
            C105724z.this.mo150614x(new C105730a(arrayList));
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$g */
    public class C105731g implements C105703u.C105704a<String, String> {
        public C105731g() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            Log.m105929w("MicroMsg.Multitalk.ILinkService", "hy: bind network! %d, %s", Integer.valueOf(i), (String) obj);
            C105724z.this.mo150614x(new C105655l1(this, i));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$h */
    public class C105732h implements C105703u.C105704a<byte[], String> {
        public C105732h() {
        }

        /* renamed from: a */
        public Object mo150478a(byte[] bArr) {
            return bArr;
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "tim: on switch av fail, errCode: %d", Integer.valueOf(i));
            C105724z.this.mo150614x(new C105661m1(this, i, (byte[]) obj));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$i */
    public class C105733i implements C40324j.C40326a {
        public C105733i(C105724z zVar) {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            if (i != 0 || i2 != 0 || cVar.f127056b.f127083a == null) {
                Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: cgiReportLog fail, errType:" + i + ",errCode:" + i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$j */
    public class C105734j implements C105703u.C105704a<String, String> {
        public C105734j() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            String str = (String) obj;
            C105724z.this.mo150614x(new C105695s1(this));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$k */
    public class C105735k implements C105703u.C105704a<String, String> {
        public C105735k() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            String str = (String) obj;
            C105724z.this.mo150614x(new C105701t1(this, i));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$l */
    public class C105736l implements C105703u.C105704a<C49918iz, String> {
        public C105736l() {
        }

        /* renamed from: a */
        public Object mo150478a(byte[] bArr) {
            C49918iz izVar = new C49918iz();
            try {
                izVar.parseFrom(bArr);
                return izVar;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e, "hy: unable to parse from data", new Object[0]);
                return null;
            }
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            C105724z.this.mo150614x(new C105706u1(this, (C49918iz) obj));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$m */
    public class C105737m implements C105703u.C105704a<String, String> {
        public C105737m() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            String str = (String) obj;
            C105724z.this.mo150604n();
            C105724z zVar = C105724z.this;
            zVar.mo150599i((C105598b<ArrayList<C105683r>>) null, -10086, -6, "accept talk callback failed: " + i);
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$n */
    public class C105738n implements C105598b<ArrayList<C105683r>> {
        public C105738n() {
        }

        /* renamed from: a */
        public void mo150477a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: accept success, tryTriggerAcceptSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C105724z zVar = C105724z.this;
                zVar.f314406p0.mo150489b(zVar.f314388f);
                return;
            }
            Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: accept failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$o */
    public class C105739o implements Runnable {
        public C105739o() {
        }

        public void run() {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial mSelfReleaseRunnable mCurrentStatus%d mIsJoiningRoom %b", Integer.valueOf(C105724z.this.f314401n), Boolean.valueOf(C105724z.this.f314371V));
            C105724z zVar = C105724z.this;
            if (zVar.f314401n == 0 && !zVar.f314371V) {
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: still not join room in %d ms. directly release", Long.valueOf(ApkDownloadManager.INTERVAL));
                C105724z.m141930e(C105724z.this, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$p */
    public class C105740p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f314444d;

        public C105740p(boolean z) {
            this.f314444d = z;
        }

        public void run() {
            boolean z = this.f314444d;
            C105724z zVar = C105724z.this;
            boolean z2 = zVar.f314423x0;
            C105714w.f314302c.SwitchAV(z ? 1 : 0, z2 ? 1 : 0, zVar.f314426y0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$q */
    public class C105741q implements Runnable {
        public C105741q() {
        }

        public void run() {
            C105724z zVar = C105724z.this;
            if (zVar.f314423x0) {
                zVar.f314423x0 = false;
                boolean z = zVar.f314407p1;
                C105714w.f314302c.SwitchAV(z ? 1 : 0, 0, zVar.f314426y0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$r */
    public class C105742r extends ConnectivityManager.NetworkCallback {
        public C105742r() {
        }

        public void onAvailable(Network network) {
            super.onAvailable(network);
            Parcel obtain = Parcel.obtain();
            network.writeToParcel(obtain, 0);
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "found requested network. netid: " + obtain.readInt() + " toString: " + network.toString());
            if (C11171e.m11046c(28)) {
                ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
                try {
                    int multipathPreference = connectivityManager.getMultipathPreference(network);
                    Log.m105924i("MicroMsg.Multitalk.ILinkService", "getMultipathPreference ret " + multipathPreference);
                } catch (Exception unused) {
                    Log.m105924i("MicroMsg.Multitalk.ILinkService", "getMultipathPreference  Error");
                    try {
                        connectivityManager.unregisterNetworkCallback(this);
                        return;
                    } catch (Exception unused2) {
                        Log.m105924i("MicroMsg.Multitalk.ILinkService", "unregisterNetworkCallback Error");
                        return;
                    }
                }
            }
            C105724z zVar = C105724z.this;
            zVar.f314409q1 = network;
            if (zVar.f314413s1 != null) {
                for (int i = 0; i < C105724z.this.f314413s1.size(); i++) {
                    C105724z zVar2 = C105724z.this;
                    zVar2.mo150598h(zVar2.f314413s1.get(i).intValue(), true);
                }
            }
            C105724z.this.f314411r1 = this;
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "networkcallback hashCode: " + C105724z.this.f314411r1.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.z$t */
    public enum C105743t {
        ILinkMemberRoleUnknown,
        ILinkMemberRoleCreate,
        ILinkMemberRoleAccept,
        ILinkMemberRoleJoin
    }

    /* access modifiers changed from: public */
    static {
        f314341E1 = false;
    }

    /* renamed from: e */
    public static int m141930e(C105724z zVar, boolean z) {
        zVar.getClass();
        C30282x xVar = C30282x.INSTANCE;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: reset sync, sdkReset %b", Boolean.valueOf(z));
        if (z && (zVar.f314373W || zVar.f314377Y)) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "uninitEngine called!");
            zVar.f314384d.mo150533b(zVar.f314405p);
            zVar.f314388f.mo150552d();
            zVar.f314390g.mo150525c();
            zVar.f314392h.mo150561a();
            zVar.f314414t = 0;
            f314341E1 = false;
            zVar.f314386e.mo150566a(true);
            zVar.f314373W = false;
            zVar.f314375X = false;
            zVar.f314377Y = false;
            Log.m105924i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: stop listen to network change");
            xVar.mo57266a(1);
            zVar.f314372V0 = false;
            zVar.f314374W0 = false;
            zVar.f314371V = false;
            LinkedList<C64407gz> linkedList = zVar.f314399l1;
            if (linkedList != null) {
                linkedList.clear();
                zVar.f314399l1 = null;
            }
            zVar.mo150595a();
            zVar.f314409q1 = null;
            zVar.f314411r1 = null;
            zVar.f314413s1.clear();
            zVar.f314407p1 = true;
            zVar.mo150604n();
            int UnInit = C105714w.f314302c.UnInit();
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "unInit ret:" + UnInit);
            for (int i = 0; i < 2; i++) {
                Log.m105924i("MicroMsg.Multitalk.ILinkService", "mScreenEncStatusList[" + i + "] = " + zVar.f314383c1[i] + ", mHWScreenEncoderList[" + i + "] = " + zVar.f314393h1[i]);
                zVar.f314383c1[i] = 0;
                zVar.f314393h1[i] = null;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                Log.m105924i("MicroMsg.Multitalk.ILinkService", "mVideoEncStatusList[" + i2 + "] = " + zVar.f314385d1[i2] + ", mHWVideoEncoderList[" + i2 + "] = " + zVar.f314395i1[i2]);
                zVar.f314385d1[i2] = 0;
                zVar.f314395i1[i2] = null;
            }
            zVar.f314387e1 = 0;
            zVar.f314389f1 = false;
            zVar.f314391g1 = true;
        }
        zVar.f314384d.mo150533b(zVar.f314405p);
        C105719y.f314315a = 0;
        C105719y.f314316b = 0;
        C105719y.f314317c = 0;
        C105719y.f314318d = -1;
        C105719y.f314319e = -1;
        C105719y.f314320f = 0;
        C105719y.f314321g = -1;
        C105719y.f314322h = -1;
        C105719y.f314323i = 0;
        C105719y.f314324j = 0;
        C105719y.f314325k = 0;
        zVar.f314405p = null;
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "danial: cleanUpLongTermCallbacks");
        zVar.f314388f.f314253a.clear();
        C105689s sVar = zVar.f314388f;
        synchronized (sVar.f314262j) {
            sVar.f314262j.clear();
        }
        C34379c<?> cVar = sVar.f314263k;
        if (cVar != null) {
            cVar.cancel(false);
        }
        zVar.f314390g.mo150525c();
        zVar.f314392h.mo150561a();
        synchronized (zVar.f314386e) {
            zVar.f314386e.mo150568c(24, zVar.f314416u);
            zVar.f314386e.mo150568c(28, zVar.f314428z);
            zVar.f314386e.mo150568c(26, zVar.f314418v);
            zVar.f314386e.mo150568c(20, zVar.f314420w);
            zVar.f314386e.mo150568c(32, zVar.f314343A);
            zVar.f314416u = null;
            zVar.f314418v = null;
            zVar.f314420w = null;
            zVar.f314422x = null;
            zVar.f314428z = null;
            zVar.f314343A = null;
        }
        zVar.f314373W = false;
        zVar.f314375X = false;
        zVar.f314377Y = false;
        zVar.f314374W0 = false;
        zVar.f314371V = false;
        Log.m105924i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: stop listen to network change");
        xVar.mo57266a(1);
        return 0;
    }

    /* renamed from: f */
    public static void m141931f(C105724z zVar, int i) {
        ArrayList<C105683r> a = zVar.f314388f.mo150549a();
        LinkedList<ft4> linkedList = new LinkedList<>();
        C105689s sVar = zVar.f314388f;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "send banner msg for wxgroupid %s sdkgroupid %s roomid %d seq %d bannerstatus %d", sVar.f314256d, sVar.f314260h, Long.valueOf(sVar.f314254b), Long.valueOf(zVar.f314388f.f314259g), Integer.valueOf(i));
        Iterator<C105683r> it = a.iterator();
        while (it.hasNext()) {
            C105683r next = it.next();
            ft4 ft4 = new ft4();
            et4 et4 = new et4();
            et4.f133116d = next.f314239c;
            et4.f133117e = next.f314238b;
            ft4.f133679d = et4;
            ft4.f133680e = next.f314241e;
            linkedList.add(ft4);
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "sendBannerMsg:username %s, openid %s, status %d", next.f314239c, next.f314238b, Integer.valueOf(next.f314241e));
        }
        gs4 gs4 = new gs4();
        C105689s sVar2 = zVar.f314388f;
        gs4.f331980d = sVar2.f314256d;
        gs4.f331981e = sVar2.f314254b;
        String str = sVar2.f314260h;
        gs4.f331982f = str;
        gs4.f331983g = linkedList;
        gs4.f331984h = sVar2.f314259g;
        gs4.f331985i = i;
        gs4.f331986j = sVar2.f314258f;
        if ((str != null && !str.equals("")) || gs4.f331985i == 0) {
            zVar.f314406p0.mo150491d(gs4);
            C40324j jVar = (C40324j) C86312j.m106911c(C40324j.class);
            C42574q qVar = zVar.f314394i;
            String str2 = zVar.f314388f.f314256d;
            String str3 = zVar.f314362Q0;
            qVar.getClass();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new ct4();
            bVar.f127067b = new dt4();
            bVar.f127069d = 3878;
            bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtsendbannermsg";
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            et4 et42 = new et4();
            et42.f133116d = str3;
            et42.f133117e = null;
            C47350c a2 = bVar.mo72403a();
            ct4 ct4 = (ct4) a2.f127055a.f127080a;
            ct4.f131957f = et42;
            ct4.f131955d = str2;
            try {
                ct4.f131956e = C89349b.m111674a(gs4.toByteArray());
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Multitalk.ILinkCGIImp", e, "hy: error when convert to byte array", new Object[0]);
            }
            jVar.mo63014eH(a2, new C105667n1(zVar));
        }
    }

    /* renamed from: g */
    public static void m141932g(C105724z zVar, String str, String str2, C105598b bVar) {
        int i;
        C105724z zVar2 = zVar;
        C105598b bVar2 = bVar;
        zVar.getClass();
        ((C7516d) C86312j.m106911c(C7516d.class)).mo8638Za();
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: initsession : mIsInitedEngine :%b mIsInitingEngine %b mCurrentStatus %d mIsJoiningRoom %b", Boolean.valueOf(zVar2.f314373W), Boolean.valueOf(zVar2.f314375X), Integer.valueOf(zVar2.f314401n), Boolean.valueOf(zVar2.f314371V));
        if (zVar2.f314375X) {
            bVar2.mo150477a(0, -66, "repeat init engine", null);
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "danialguo: initEngine repeat");
        } else if (!zVar2.f314373W) {
            zVar2.f314375X = true;
            C105675p0 p0Var = new C105675p0(zVar2, bVar2);
            zVar2.f314353H = p0Var;
            zVar2.f314354I = new C105684r0(zVar2, bVar2);
            zVar2.f314386e.mo150567b(1, p0Var);
            zVar2.f314386e.mo150567b(2, zVar2.f314354I);
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                Log.m105928w("MicroMsg.Multitalk.ILinkService", "Expansions not yet installed, drop ILinkService#initWithSession()");
                i = -2233;
            } else {
                IConfCallBack a = zVar2.f314386e.mo150566a(false);
                String str3 = zVar2.f314405p;
                int i2 = zVar2.f314410r;
                int i3 = zVar2.f314412s;
                String[] strArr = C105714w.f314300a;
                Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "hy: init voip");
                Context context = MMApplicationContext.getContext();
                Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "prepareOpenVoiceEnv, hasInit " + C105714w.f314301b);
                if (!C105714w.f314301b) {
                    C105714w.f314301b = true;
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "hy: load so");
                    String[] strArr2 = C105714w.f314300a;
                    for (int i4 = 0; i4 < 5; i4++) {
                        C88957l.m111079o(strArr2[i4], C105714w.class.getClassLoader());
                    }
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "load so end");
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        PlatformComm.init(context, new Handler(Looper.getMainLooper()));
                        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "main thread exec PlatformComm.init");
                    } else {
                        ConditionVariable conditionVariable = new ConditionVariable();
                        ((C119157j) C119157j.f356862d).mo183868B(new C105709v(context, conditionVariable));
                        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "condition block wait for open");
                        conditionVariable.block(2000);
                        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "condition block release...");
                    }
                }
                int i5 = -1;
                try {
                    C110967kz b = C105714w.m141917b((String) null, str3, str, str2, 0, i2, i3);
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "envInfo:" + new String(b.toByteArray()) + ",length:" + b.toByteArray().length);
                    i5 = C105714w.f314302c.InitSDK(b.toByteArray(), b.toByteArray().length, a);
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "qipengfeng VoipModelResMgr init");
                    VoipModelResMgr voipModelResMgr = VoipModelResMgr.f207454a;
                    voipModelResMgr.mo98752d();
                    StringBuilder sb = new StringBuilder(1024);
                    voipModelResMgr.mo98750b(sb);
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "get ModelRoot: " + sb.toString() + ", len: " + sb.toString().length());
                    C105714w.f314302c.SetAppCmd(938, sb.toString().getBytes(), sb.toString().length());
                    StringBuilder sb4 = new StringBuilder(1024);
                    if (C105714w.f314302c.audioSampleRate[0] <= 16000) {
                        voipModelResMgr.mo98751c(sb4, 112, 3);
                    } else {
                        voipModelResMgr.mo98751c(sb4, 112, 4);
                    }
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "qipengfeng, ModelMd5: " + sb4.toString());
                    if (sb4.toString().length() > 0 && sb4.toString().length() <= 256) {
                        C105714w.f314302c.SetAppCmd(951, sb4.toString().getBytes(), sb4.toString().length());
                    }
                    StringBuilder sb5 = new StringBuilder(1024);
                    if (C105714w.f314302c.audioSampleRate[0] <= 16000) {
                        voipModelResMgr.mo98751c(sb5, 112, 7);
                        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "dennyliang, HowlSup Model Md5: " + sb5.toString());
                        if (sb5.toString().length() > 0 && sb5.toString().length() <= 256) {
                            C105714w.f314302c.SetAppCmd(952, sb5.toString().getBytes(), sb5.toString().length());
                        }
                    }
                    Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "init ret:" + i5);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e, "envInfo exception", new Object[0]);
                }
                i = i5;
                C105705u0 u0Var = new C105705u0(zVar2);
                zVar2.f314422x = u0Var;
                zVar2.f314386e.mo150567b(27, u0Var);
            }
            if (i != 0) {
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "initEngine failed ret=%d", Integer.valueOf(i));
                if (bVar2 != null) {
                    if (i == -2) {
                        bVar2.mo150477a(0, -66, "repeat init engine", null);
                        Log.m105924i("MicroMsg.Multitalk.ILinkService", "danialguo: initEngine repeat");
                    } else {
                        bVar2.mo150477a(-10086, -3, "initengine failed", "");
                    }
                }
                zVar2.f314375X = false;
                zVar.mo150589E();
                return;
            }
            zVar2.f314375X = false;
        } else {
            zVar2.mo150614x(new C105694s0(zVar2, bVar2));
        }
    }

    /* renamed from: A */
    public final void mo150585A() {
        C105725b bVar = new C105725b();
        this.f314420w = bVar;
        this.f314386e.mo150567b(20, bVar);
        C105726c cVar = new C105726c();
        this.f314425y = cVar;
        this.f314386e.mo150567b(21, cVar);
        C105727d dVar = new C105727d();
        this.f314416u = dVar;
        this.f314386e.mo150567b(24, dVar);
        C105728e eVar = new C105728e();
        this.f314418v = eVar;
        this.f314386e.mo150567b(26, eVar);
        C105689s sVar = this.f314388f;
        C105729f fVar = new C105729f();
        synchronized (sVar.f314262j) {
            sVar.f314262j.add(fVar);
        }
        C105689s sVar2 = this.f314388f;
        sVar2.f314263k = ((C119157j) C119157j.f356862d).mo183872c(sVar2.f314264l, 1000, 1000);
        C105731g gVar = new C105731g();
        this.f314428z = gVar;
        this.f314386e.mo150567b(28, gVar);
        C105732h hVar = new C105732h();
        this.f314343A = hVar;
        this.f314386e.mo150567b(32, hVar);
    }

    /* renamed from: B */
    public void mo150586B(C105713v2 v2Var) {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "setVideoFrameCallback: " + v2Var);
        C105703u uVar = this.f314386e;
        if (uVar != null) {
            uVar.getClass();
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeCallbackMgr", "setFrameCallback: " + v2Var);
            uVar.f314287c = v2Var;
        }
    }

    /* renamed from: C */
    public void mo150587C() {
        int i = this.f314401n;
        if (i != 1) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: not in room, status: %d", Integer.valueOf(i));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<C105683r> a = this.f314388f.mo150549a();
        if (a != null && a.size() != 0) {
            LinkedList<od4> linkedList = new LinkedList<>();
            LinkedList<od4> linkedList2 = new LinkedList<>();
            Iterator<C105683r> it = a.iterator();
            while (it.hasNext()) {
                C105683r next = it.next();
                if (this.f314362Q0.equals(next.f314239c)) {
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "subscribeAll, skip myself memberId:%d,memberName%s", Integer.valueOf(next.f314237a), next.f314239c);
                } else {
                    int i2 = next.f314237a;
                    od4 od4 = new od4();
                    od4.f332187d = i2;
                    od4.f332188e = 480;
                    int p = mo150606p(i2);
                    if (p == 102 || p == 101) {
                        od4.f332188e = 240;
                        linkedList2.add(od4);
                    } else {
                        linkedList.add(od4);
                    }
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "subscribeAll, videoMembers memberId:%d,memberName%s", Integer.valueOf(i2), next.f314239c);
                }
            }
            nd4 nd4 = this.f314404o1;
            nd4.f332183d = linkedList;
            nd4.f332184e = linkedList2;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: subscribe, videoMembers %s", arrayList);
            C105714w.m141919d(this.f314404o1);
        }
    }

    /* renamed from: D */
    public final void mo150588D(C105598b<ArrayList<C105683r>> bVar) {
        Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: require exit. try exit exit again");
        mo150602l(bVar, -10086, -9, "interrupted because already cancelled or entered background");
        mo150605o(this.f314403o);
        this.f314379Z = false;
    }

    /* renamed from: E */
    public final void mo150589E() {
        String str = "," + this.f314388f.f314256d + "," + this.f314388f.f314260h + "," + this.f314388f.f314254b + "," + this.f314388f.f314255c + "," + this.f314429z1 + "," + this.f314344A1 + "," + this.f314346B1 + "," + this.f314401n + "," + this.f314373W;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "do svr report logid20434: %s", str);
        xs4 xs4 = new xs4();
        xs4.f144928d = 20434;
        xs4.f144929e = str;
        LinkedList<xs4> linkedList = new LinkedList<>();
        linkedList.add(xs4);
        C42574q qVar = this.f314394i;
        C105689s sVar = this.f314388f;
        String str2 = sVar.f314256d;
        String str3 = sVar.f314260h;
        String str4 = this.f314362Q0;
        qVar.getClass();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ys4();
        bVar.f127067b = new zs4();
        bVar.f127069d = 4237;
        bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtreportlog";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        ys4 ys4 = (ys4) a.f127055a.f127080a;
        et4 et4 = new et4();
        et4.f133116d = str4;
        et4.f133117e = null;
        ys4.f145500f = et4;
        ys4.f145498d = str2;
        ys4.f145499e = str3;
        ys4.f145501g = linkedList;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C105733i(this));
    }

    /* renamed from: F */
    public final void mo150590F(C105598b<ArrayList<C105683r>> bVar) {
        int i;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: try trigger AcceptSucc: %b %b %b", Boolean.valueOf(this.f314429z1), Boolean.valueOf(this.f314344A1), Boolean.valueOf(this.f314346B1));
        if (this.f314429z1 && this.f314346B1 && this.f314344A1) {
            if (this.f314379Z) {
                mo150588D(bVar);
                return;
            }
            this.f314392h.mo150562b();
            boolean e = this.f314390g.mo150527e();
            boolean f = this.f314390g.mo150528f(this.f314407p1);
            C105719y.f314315a = (!e || !f) ? 1 : 0;
            C105719y.f314317c = e ? 0 : this.f314390g.mo150523a();
            if (!f) {
                C105657m mVar = this.f314390g;
                if (mVar.f314154b != null) {
                    i = mVar.f314154b.f330222a;
                    C105719y.f314316b = i;
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial: start play playRet %b recordRet %b", Boolean.valueOf(e), Boolean.valueOf(f));
                    if (e || !f) {
                        mo150600j(bVar);
                    } else {
                        mo150599i(bVar, 0, 0, "ok");
                        return;
                    }
                }
            }
            i = 0;
            C105719y.f314316b = i;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial: start play playRet %b recordRet %b", Boolean.valueOf(e), Boolean.valueOf(f));
            if (e) {
            }
            mo150600j(bVar);
        }
    }

    /* renamed from: G */
    public final void mo150591G(C105598b<ArrayList<C105683r>> bVar) {
        int i;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: try trigger InviteSucc: %b %b %b %b %b", Boolean.valueOf(this.f314429z1), Boolean.valueOf(this.f314344A1), Boolean.valueOf(this.f314346B1), Boolean.valueOf(this.f314372V0), Boolean.valueOf(this.f314374W0));
        if (this.f314429z1 && this.f314346B1 && this.f314344A1 && this.f314372V0 && !this.f314374W0) {
            if (this.f314379Z) {
                mo150588D(bVar);
                return;
            }
            this.f314392h.mo150562b();
            boolean e = this.f314390g.mo150527e();
            boolean f = this.f314390g.mo150528f(this.f314407p1);
            C105719y.f314315a = (!e || !f) ? 1 : 0;
            C105719y.f314317c = e ? 0 : this.f314390g.mo150523a();
            if (!f) {
                C105657m mVar = this.f314390g;
                if (mVar.f314154b != null) {
                    i = mVar.f314154b.f330222a;
                    C105719y.f314316b = i;
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial: start play playRet %b recordRet %b", Boolean.valueOf(e), Boolean.valueOf(f));
                    if (e || !f) {
                        mo150600j(bVar);
                    }
                    mo150601k(bVar, 0, 0, "ok", (byte[]) null);
                    this.f314374W0 = true;
                    return;
                }
            }
            i = 0;
            C105719y.f314316b = i;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial: start play playRet %b recordRet %b", Boolean.valueOf(e), Boolean.valueOf(f));
            if (e) {
            }
            mo150600j(bVar);
        }
    }

    /* renamed from: H */
    public final void mo150592H(C105598b<ArrayList<C105683r>> bVar) {
        int i;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: try trigger JoinSucc: %b %b %b", Boolean.valueOf(this.f314429z1), Boolean.valueOf(this.f314344A1), Boolean.valueOf(this.f314346B1));
        if (this.f314429z1 && this.f314346B1 && this.f314344A1) {
            if (this.f314379Z) {
                mo150588D(bVar);
                return;
            }
            this.f314392h.mo150562b();
            boolean e = this.f314390g.mo150527e();
            boolean f = this.f314390g.mo150528f(this.f314407p1);
            C105719y.f314315a = (!e || !f) ? 1 : 0;
            C105719y.f314317c = e ? 0 : this.f314390g.mo150523a();
            if (!f) {
                C105657m mVar = this.f314390g;
                if (mVar.f314154b != null) {
                    i = mVar.f314154b.f330222a;
                    C105719y.f314316b = i;
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial: start play playRet %b recordRet %b", Boolean.valueOf(e), Boolean.valueOf(f));
                    if (e || !f) {
                        mo150600j(bVar);
                    } else {
                        mo150602l(bVar, 0, 0, "ok");
                        return;
                    }
                }
            }
            i = 0;
            C105719y.f314316b = i;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "danial: start play playRet %b recordRet %b", Boolean.valueOf(e), Boolean.valueOf(f));
            if (e) {
            }
            mo150600j(bVar);
        }
    }

    /* renamed from: I */
    public void mo150593I() {
        int i = 5;
        if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
            i = 1;
        } else if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
            i = 3;
        } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            i = 4;
        } else if (!NetStatusUtil.is4G(MMApplicationContext.getContext()) && !NetStatusUtil.is5G(MMApplicationContext.getContext())) {
            i = 0;
        }
        Log.m105925i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: current network type is: %d", Integer.valueOf(i));
        this.f314370U0 = i;
    }

    /* renamed from: J */
    public C105702t2 mo150594J(byte[] bArr, int i, int i2, int i3, int i4, int[] iArr) {
        if (bArr != null) {
            v2conference v2conference = C105714w.f314302c;
            if (v2conference != null) {
                int videoTrans = v2conference.videoTrans(bArr, i, i2, i3, i4, iArr);
                C105702t2 t2Var = new C105702t2();
                t2Var.f314281a = iArr;
                v2conference v2conference2 = C105714w.f314302c;
                t2Var.f314282b = v2conference2.field_localImgWidth;
                t2Var.f314283c = v2conference2.field_localImgHeight;
                t2Var.f314284d = videoTrans;
                return t2Var;
            }
        } else {
            String[] strArr = C105714w.f314300a;
        }
        Log.m105920e("MicroMsg.Multitalk.ILinkNativeEngine", "steve:videoTrans null,  engine:" + C105714w.f314302c);
        return null;
    }

    /* renamed from: a */
    public void mo150595a() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "try to UnregisterCellularNetwork");
        if (C11171e.m11046c(21)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            if (this.f314411r1 != null) {
                Log.m105924i("MicroMsg.Multitalk.ILinkService", "unregister networkcallback hashCode: " + this.f314411r1.hashCode());
                try {
                    connectivityManager.unregisterNetworkCallback(this.f314411r1);
                } catch (Exception unused) {
                    Log.m105924i("MicroMsg.Multitalk.ILinkService", "unregisterNetworkCallback Error");
                }
                this.f314411r1 = null;
                this.f314409q1 = null;
            }
        }
    }

    /* renamed from: b */
    public void mo150596b(int i, int i2, String str, C112672d dVar) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = " errType: ";
        objArr[2] = Integer.valueOf(i);
        objArr[3] = " scene.getType(): ";
        objArr[4] = dVar != null ? Integer.valueOf(dVar.mo161498d()) : "";
        Log.m105919d("MicroMsg.Multitalk.ILinkService", "CLTNOT onNetSceneEnd errCode:", objArr);
        if (dVar.mo161498d() == 214) {
            C103882j0 j0Var = (C103882j0) dVar.f337367d;
            C110090n nVar = (C110090n) dVar;
            if (nVar.f329405n == 0) {
                Log.m105918d("MicroMsg.Multitalk.ILinkService", "handleSwitchVideoGroup, but old multitalk event");
            } else if (j0Var.f307045l == 1 && nVar.f329404m == 103) {
                this.f314406p0.f314075a.mo150629F(nVar.f329406o, i2, j0Var.f307046m);
            }
        }
    }

    /* renamed from: c */
    public void mo150597c() {
        if (this.f314429z1) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "steve: already accept!!!");
            return;
        }
        this.f314380Z0 = C105743t.ILinkMemberRoleAccept;
        this.f314423x0 = false;
        C105734j jVar = new C105734j();
        this.f314361Q = jVar;
        this.f314363R = new C105735k();
        this.f314349D = new C105736l();
        this.f314350E = new C105737m();
        this.f314386e.mo150567b(14, jVar);
        this.f314386e.mo150567b(15, this.f314363R);
        this.f314386e.mo150567b(22, this.f314349D);
        this.f314386e.mo150567b(23, this.f314350E);
        mo150604n();
        if (C109247e.zx0()) {
            mo150611u();
        }
        int Accept = C105714w.f314302c.Accept(1);
        if (Accept != 0) {
            mo150599i((C105598b<ArrayList<C105683r>>) null, -10086, -4, "accept room sdk failed: " + Accept);
            return;
        }
        this.f314429z1 = true;
        mo150590F(new C105738n());
    }

    /* renamed from: h */
    public void mo150598h(int i, boolean z) {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "start bindSocket " + i + " ToNetwork " + this.f314409q1 + " rebind " + z);
        if (i == -1) {
            mo150595a();
        }
        if (!z) {
            this.f314413s1.add(Integer.valueOf(i));
        }
        if (this.f314409q1 != null && C11171e.m11046c(23)) {
            FileDescriptor fileDescriptor = new FileDescriptor();
            try {
                Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                declaredField.setInt(fileDescriptor, i);
                this.f314409q1.bindSocket(fileDescriptor);
                Log.m105918d("MicroMsg.Multitalk.ILinkService", "bindSocketToNetwork success: network" + this.f314409q1 + "+socketfd" + i);
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.Multitalk.ILinkService", "bindSocketToNetwork Error");
            }
        }
    }

    /* renamed from: i */
    public final void mo150599i(C105598b<ArrayList<C105683r>> bVar, int i, int i2, String str) {
        this.f314371V = false;
        synchronized (this.f314386e) {
            this.f314386e.mo150568c(14, this.f314361Q);
            this.f314386e.mo150568c(15, this.f314363R);
            this.f314386e.mo150568c(22, this.f314349D);
            this.f314386e.mo150568c(23, this.f314350E);
            this.f314361Q = null;
            this.f314363R = null;
            this.f314349D = null;
            this.f314350E = null;
            mo150603m();
        }
        ArrayList<C105683r> a = this.f314388f.mo150549a();
        if (bVar != null) {
            bVar.mo150477a(i, i2, str, a);
        }
        if (i == 0 && i2 == 0) {
            this.f314401n = 1;
        } else {
            this.f314406p0.mo150490c(2, this.f314366S0, (byte[]) null);
        }
    }

    /* renamed from: j */
    public final void mo150600j(C105598b<ArrayList<C105683r>> bVar) {
        this.f314406p0.mo150490c(4, this.f314366S0, (byte[]) null);
        mo150602l(bVar, -10086, -7, "start audio device failed");
        mo150605o(C85291s.ReasonDevice);
    }

    /* renamed from: k */
    public final void mo150601k(C105598b<ArrayList<C105683r>> bVar, int i, int i2, String str, byte[] bArr) {
        this.f314371V = false;
        synchronized (this.f314386e) {
            this.f314386e.mo150568c(5, this.f314351F);
            this.f314386e.mo150568c(6, this.f314352G);
            this.f314386e.mo150568c(22, this.f314349D);
            this.f314386e.mo150568c(23, this.f314350E);
            this.f314386e.mo150568c(7, this.f314355J);
            this.f314351F = null;
            this.f314352G = null;
            this.f314349D = null;
            this.f314350E = null;
            this.f314355J = null;
        }
        ArrayList<C105683r> a = this.f314388f.mo150549a();
        if (bVar != null) {
            bVar.mo150477a(i, i2, str, a);
        }
        if (i == 0 && i2 == 0) {
            this.f314401n = 1;
        } else if (i2 != 18 || bArr == null) {
            this.f314406p0.mo150490c(16, this.f314366S0, (byte[]) null);
        } else {
            this.f314406p0.mo150490c(11, this.f314366S0, bArr);
        }
    }

    /* renamed from: l */
    public final void mo150602l(C105598b<ArrayList<C105683r>> bVar, int i, int i2, String str) {
        this.f314371V = false;
        synchronized (this.f314386e) {
            this.f314386e.mo150568c(3, this.f314345B);
            this.f314386e.mo150568c(4, this.f314347C);
            this.f314386e.mo150568c(22, this.f314349D);
            this.f314386e.mo150568c(23, this.f314350E);
            this.f314345B = null;
            this.f314347C = null;
            this.f314349D = null;
            this.f314350E = null;
        }
        ArrayList<C105683r> a = this.f314388f.mo150549a();
        if (bVar != null) {
            bVar.mo150477a(i, i2, str, a);
        }
        if (i == 0 && i2 == 0) {
            this.f314401n = 1;
        } else if (i2 == 15) {
            C105608d dVar = this.f314406p0;
            dVar.getClass();
            MMHandlerThread.postToMainThread(new C105649k(dVar));
        } else {
            this.f314406p0.mo150490c(2, this.f314366S0, (byte[]) null);
        }
    }

    /* renamed from: m */
    public final void mo150603m() {
        synchronized (this.f314386e) {
            this.f314386e.mo150568c(8, this.f314356K);
            this.f314386e.mo150568c(9, this.f314357L);
            this.f314386e.mo150568c(11, this.f314358M);
            this.f314386e.mo150568c(16, this.f314365S);
            this.f314356K = null;
            this.f314357L = null;
            this.f314358M = null;
            this.f314365S = null;
        }
    }

    /* renamed from: n */
    public final void mo150604n() {
        this.f314429z1 = false;
        this.f314344A1 = false;
        this.f314346B1 = false;
    }

    /* renamed from: o */
    public final int mo150605o(C85291s sVar) {
        int i = 1;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: trigger exit with reason: %s", sVar);
        this.f314403o = sVar;
        if (this.f314371V) {
            Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: current joining room. waiting for exiting after joining");
            this.f314379Z = true;
            return -9999;
        } else if (this.f314401n == 0) {
            Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: not in room! maybe is joining room");
            return 0;
        } else {
            int ordinal = sVar.ordinal();
            if (ordinal != 1) {
                i = ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? 0 : 7 : 6 : 8;
            }
            int ExitRoom = C105714w.f314302c.ExitRoom(i);
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "exitRoom ret:" + ExitRoom);
            mo150607q(ApkDownloadManager.INTERVAL);
            return ExitRoom;
        }
    }

    /* renamed from: p */
    public int mo150606p(int i) {
        C105689s sVar = this.f314388f;
        if (sVar.f314253a.size() == 0) {
            return -1;
        }
        Iterator<C105683r> it = sVar.f314253a.iterator();
        while (it.hasNext()) {
            C105683r next = it.next();
            if (next.f314237a == i) {
                return next.f314242f;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final void mo150607q(long j) {
        this.f314396j.postDelayed(new C30291w(this.f314348C1), j);
    }

    /* renamed from: r */
    public void mo150608r(int i) {
        this.f314370U0 = i;
        C105714w.f314302c.OnNetworkChange(i, C105714w.m141916a().getBytes());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v45, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v63, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v64, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v65, resolved type: short} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0468, code lost:
        if (r1.f314382b1 != r12) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0196, code lost:
        if (r3 > r9) goto L_0x019a;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r12v44, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0935  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0372  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo150609s(byte[] r47, int r48, int r49, int r50) {
        /*
            r46 = this;
            r1 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0010
            r8 = 1
            goto L_0x0011
        L_0x0010:
            r8 = 0
        L_0x0011:
            java.lang.String r7 = "mHWScreenEncoderList["
            java.lang.String r6 = "mHWVideoEncoderList["
            java.lang.String r5 = "]: "
            java.lang.String r2 = ", mCapH: "
            java.lang.String r4 = "ILink[HWEnc]"
            java.lang.String r3 = "i: "
            java.lang.String r10 = "MicroMsg.Multitalk.ILinkService"
            if (r8 != 0) goto L_0x0458
            boolean r0 = r1.f314398k1
            if (r0 == 0) goto L_0x0458
            if (r8 == 0) goto L_0x002c
            r0 = 78
            r20 = 78
            goto L_0x0030
        L_0x002c:
            r0 = 61
            r20 = 61
        L_0x0030:
            if (r8 == 0) goto L_0x0035
            int[] r0 = r1.f314383c1
            goto L_0x0037
        L_0x0035:
            int[] r0 = r1.f314385d1
        L_0x0037:
            r21 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "bScreen: "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r9 = ", nLoopCount: "
            r0.append(r9)
            r9 = 2
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            r23 = r15
            r0 = 0
            r11 = 0
            r14 = 0
            r15 = 0
        L_0x005c:
            if (r14 >= r9) goto L_0x0446
            com.tencent.mm.plugin.multitalk.ilinkservice.a r9 = r1.f314397j1
            byte[] r9 = r9.f314053k
            r13 = r20
            int r9 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r13, r9, r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r14)
            r24 = r3
            java.lang.String r3 = ", ret: "
            r13.append(r3)
            r13.append(r9)
            java.lang.String r3 = ", stQoS.s2p.length: "
            r13.append(r3)
            com.tencent.mm.plugin.multitalk.ilinkservice.a r3 = r1.f314397j1
            byte[] r3 = r3.f314053k
            int r3 = r3.length
            r13.append(r3)
            java.lang.String r3 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r3)
            if (r9 != 0) goto L_0x042e
            com.tencent.mm.plugin.multitalk.ilinkservice.a r3 = r1.f314397j1
            byte[] r9 = r3.f314053k
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            java.nio.ByteOrder r13 = java.nio.ByteOrder.LITTLE_ENDIAN
            r9.order(r13)
            short r12 = r9.getShort()
            r3.f314043a = r12
            byte r12 = r9.get()
            r3.f314044b = r12
            byte r12 = r9.get()
            r3.f314045c = r12
            byte r12 = r9.get()
            r3.f314046d = r12
            byte r12 = r9.get()
            r3.f314047e = r12
            byte r12 = r9.get()
            r3.f314048f = r12
            byte r12 = r9.get()
            r3.f314049g = r12
            byte r12 = r9.get()
            r3.f314050h = r12
            byte r12 = r9.get()
            r3.f314051i = r12
            byte r9 = r9.get()
            r3.f314052j = r9
            com.tencent.mm.plugin.multitalk.ilinkservice.a r3 = r1.f314397j1
            r3.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "raw S2P:"
            r9.append(r12)
            byte[] r12 = r3.f314053k
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "-S2P- iKbps:"
            r9.append(r12)
            short r12 = r3.f314043a
            r9.append(r12)
            java.lang.String r12 = ", fps:"
            r9.append(r12)
            byte r12 = r3.f314044b
            r9.append(r12)
            java.lang.String r12 = ", IP:"
            r9.append(r12)
            byte r12 = r3.f314045c
            r9.append(r12)
            java.lang.String r12 = ", Reso:"
            r9.append(r12)
            byte r12 = r3.f314046d
            r9.append(r12)
            java.lang.String r12 = ", Codec:"
            r9.append(r12)
            byte r12 = r3.f314047e
            r9.append(r12)
            java.lang.String r12 = ", HWEnable:"
            r9.append(r12)
            byte r12 = r3.f314048f
            r9.append(r12)
            java.lang.String r12 = ", Skip:"
            r9.append(r12)
            byte r12 = r3.f314049g
            r9.append(r12)
            java.lang.String r12 = ", IReq:"
            r9.append(r12)
            byte r12 = r3.f314050h
            r9.append(r12)
            java.lang.String r12 = ", Rsvd1:"
            r9.append(r12)
            byte r12 = r3.f314051i
            r9.append(r12)
            java.lang.String r12 = ", DispRate:"
            r9.append(r12)
            byte r3 = r3.f314052j
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            com.tencent.mm.plugin.multitalk.ilinkservice.a r3 = r1.f314397j1
            byte r9 = r3.f314051i
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0429
            byte r3 = r3.f314046d
            r9 = 12
            short[] r12 = new short[r9]
            r12 = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480, 1280, 720} // fill-array
            short r12 = r12[r3]
            short[] r9 = new short[r9]
            r9 = {128, 96, 240, 160, 320, 240, 480, 360, 640, 480, 1280, 720} // fill-array
            short r3 = r9[r3]
            r9 = 4
            int r3 = r3 * 4
            int r3 = r3 / r9
            int r3 = r3 >> r9
            int r3 = r3 << r9
            if (r8 != 0) goto L_0x0199
            if (r12 <= r0) goto L_0x018c
            r0 = r12
        L_0x018c:
            if (r3 <= r15) goto L_0x018f
            r15 = r3
        L_0x018f:
            int r9 = r1.f314381a1
            if (r12 <= r9) goto L_0x0194
            r12 = r9
        L_0x0194:
            int r9 = r1.f314382b1
            if (r3 <= r9) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r9 = r3
        L_0x019a:
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r25 = r3
            java.lang.String r3 = "doHWQosCtrl: nEncWidth: "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r3 = ", nEncHeight: "
            r0.append(r3)
            r0.append(r9)
            java.lang.String r3 = ", mCapW: "
            r0.append(r3)
            int r3 = r1.f314381a1
            r0.append(r3)
            r0.append(r2)
            int r3 = r1.f314382b1
            r0.append(r3)
            java.lang.String r3 = ", stQoS.cCodecType: "
            r0.append(r3)
            com.tencent.mm.plugin.multitalk.ilinkservice.a r3 = r1.f314397j1
            byte r3 = r3.f314047e
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r1.f314397j1
            byte r3 = r0.f314047e
            r9 = 8
            if (r9 == r3) goto L_0x01ec
            r12 = 4
            if (r12 != r3) goto L_0x01e3
            goto L_0x01ec
        L_0x01e3:
            r12 = 2
            r21[r14] = r12
            r27 = r2
            r26 = r15
            goto L_0x0423
        L_0x01ec:
            int r12 = r1.f314387e1
            r18 = r12 & 1
            if (r18 != 0) goto L_0x01f6
            if (r9 != r3) goto L_0x01f6
            r9 = 1
            goto L_0x01f7
        L_0x01f6:
            r9 = 0
        L_0x01f7:
            r12 = r12 & 2
            if (r12 != 0) goto L_0x0202
            r12 = 4
            if (r12 != r3) goto L_0x0202
            r26 = r15
            r12 = 1
            goto L_0x0205
        L_0x0202:
            r26 = r15
            r12 = 0
        L_0x0205:
            byte r15 = r0.f314048f
            if (r15 == 0) goto L_0x03a8
            if (r9 != 0) goto L_0x020d
            if (r12 == 0) goto L_0x03a8
        L_0x020d:
            byte r9 = r0.f314049g
            r12 = 1
            if (r12 != r9) goto L_0x021c
            r0 = 16
            r21[r14] = r0
            r27 = r2
            r28 = r11
            goto L_0x03a2
        L_0x021c:
            if (r8 == 0) goto L_0x0223
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r12 = r1.f314393h1
            r12 = r12[r14]
            goto L_0x0227
        L_0x0223:
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r12 = r1.f314395i1
            r12 = r12[r14]
        L_0x0227:
            boolean r13 = r1.f314398k1
            if (r13 == 0) goto L_0x0248
            if (r12 != 0) goto L_0x0248
            r28 = 320(0x140, float:4.48E-43)
            r29 = 240(0xf0, float:3.36E-43)
            byte r3 = r0.f314044b
            short r0 = r0.f314043a
            r32 = -1
            com.tencent.mm.plugin.multitalk.ilinkservice.p r12 = new com.tencent.mm.plugin.multitalk.ilinkservice.p
            java.lang.String r33 = "video/avc"
            r27 = r12
            r30 = r3
            r31 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r27 = r2
            goto L_0x032f
        L_0x0248:
            com.tencent.mm.plugin.multitalk.ilinkservice.a r13 = r12.f314217v
            r27 = r2
            if (r13 == 0) goto L_0x032f
            com.tencent.mm.compatible.deviceinfo.a r2 = r12.f314197b
            if (r2 != 0) goto L_0x0254
            goto L_0x032f
        L_0x0254:
            short r2 = r0.f314043a
            r13.f314043a = r2
            r28 = r11
            byte r11 = r0.f314044b
            r13.f314044b = r11
            byte r11 = r0.f314045c
            r13.f314045c = r11
            byte r11 = r0.f314046d
            r13.f314046d = r11
            r13.f314047e = r3
            r13.f314048f = r15
            r13.f314049g = r9
            byte r3 = r0.f314050h
            r13.f314050h = r3
            byte r3 = r0.f314051i
            r13.f314051i = r3
            byte r0 = r0.f314052j
            r13.f314052j = r0
            double r2 = (double) r2
            r29 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r2 = r2 * r29
            int r2 = (int) r2
            int r0 = r12.f314202g
            if (r0 == r2) goto L_0x02ea
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x02ab }
            r0.<init>()     // Catch:{ Exception -> 0x02ab }
            int r3 = r2 * 1000
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ab }
            r9.<init>()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r11 = "steve: setRates: "
            r9.append(r11)     // Catch:{ Exception -> 0x02ab }
            r9.append(r3)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02ab }
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r9)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r9 = "video-bitrate"
            r0.putInt(r9, r3)     // Catch:{ Exception -> 0x02ab }
            com.tencent.mm.compatible.deviceinfo.a r3 = r12.f314197b     // Catch:{ Exception -> 0x02ab }
            r3.mo148220w(r0)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02c0
        L_0x02ab:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "steve: setRates failed:"
            r3.append(r9)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x02c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "steve[QoS]: Update BR! frameID: "
            r0.append(r3)
            int r3 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x
            r0.append(r3)
            java.lang.String r3 = ", new_br: "
            r0.append(r3)
            int r3 = r12.f314202g
            r0.append(r3)
            java.lang.String r3 = ", tuneBR:"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r12.f314202g = r2
        L_0x02ea:
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r12.f314217v
            byte r0 = r0.f314050h
            r2 = 1
            if (r2 != r0) goto L_0x0324
            int r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x
            if (r0 <= 0) goto L_0x0324
            com.tencent.mm.compatible.deviceinfo.a r0 = r12.f314197b
            if (r0 == 0) goto L_0x030e
            java.lang.String r0 = "steve: Sync frame request soon!"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "request-sync"
            r3 = 0
            r0.putInt(r2, r3)
            com.tencent.mm.compatible.deviceinfo.a r2 = r12.f314197b
            r2.mo148220w(r0)
        L_0x030e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve[QoS]: Force I Frame! frameID: "
            r0.append(r2)
            int r2 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0324:
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r12.f314217v
            byte r0 = r0.f314044b
            int r2 = r12.f314201f
            if (r0 == r2) goto L_0x0331
            r12.f314201f = r0
            goto L_0x0331
        L_0x032f:
            r28 = r11
        L_0x0331:
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r1.f314397j1
            byte r0 = r0.f314047e
            r2 = 8
            if (r2 != r0) goto L_0x033d
            r3 = 4
            r21[r14] = r3
            goto L_0x033f
        L_0x033d:
            r21[r14] = r2
        L_0x033f:
            java.lang.String r0 = ", pEncModeList["
            if (r8 == 0) goto L_0x0372
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r2 = r1.f314393h1
            r2[r14] = r12
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r14)
            r2.append(r5)
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r3 = r1.f314393h1
            r3 = r3[r14]
            r2.append(r3)
            r2.append(r0)
            r2.append(r14)
            r2.append(r5)
            r0 = r21[r14]
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            goto L_0x03a0
        L_0x0372:
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r2 = r1.f314395i1
            r2[r14] = r12
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r14)
            r2.append(r5)
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r3 = r1.f314395i1
            r3 = r3[r14]
            r2.append(r3)
            r2.append(r0)
            r2.append(r14)
            r2.append(r5)
            r0 = r21[r14]
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
        L_0x03a0:
            r12.f314203h = r14
        L_0x03a2:
            r0 = r25
            r15 = r26
            goto L_0x0437
        L_0x03a8:
            r27 = r2
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "herohe:[Waring] Engine should already disable HWCodec:%d!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r1.f314397j1
            byte r0 = r0.f314047e
            if (r0 >= 0) goto L_0x03d5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error targetCodec: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r3 = 2
            goto L_0x040e
        L_0x03d5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "closecodec: targetCodec: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "codecFlag: "
            r2.append(r3)
            r3 = 2
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r2 = 6
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r2)
            r9.order(r13)
            r9.putShort(r3)
            short r0 = (short) r0
            r9.putShort(r0)
            r11 = 0
            r9.putShort(r11)
            r0 = 39
            byte[] r9 = r9.array()
            com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.m141918c(r0, r9, r2)
        L_0x040e:
            r21[r14] = r3
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r1.f314397j1
            byte r0 = r0.f314047e
            r2 = 4
            if (r0 != r2) goto L_0x041d
            int r0 = r1.f314387e1
            r0 = r0 | r3
            r1.f314387e1 = r0
            goto L_0x0423
        L_0x041d:
            int r0 = r1.f314387e1
            r2 = 1
            r0 = r0 | r2
            r1.f314387e1 = r0
        L_0x0423:
            r0 = r25
            r15 = r26
            r11 = 1
            goto L_0x0439
        L_0x0429:
            r27 = r2
            r28 = r11
            goto L_0x0437
        L_0x042e:
            r27 = r2
            r28 = r11
            java.lang.String r2 = "get qos param failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r2)
        L_0x0437:
            r11 = r28
        L_0x0439:
            int r14 = r14 + 1
            r12 = r48
            r13 = r49
            r3 = r24
            r2 = r27
            r9 = 2
            goto L_0x005c
        L_0x0446:
            r27 = r2
            r24 = r3
            r28 = r11
            if (r8 == 0) goto L_0x0453
            r11 = r28
            r1.f314389f1 = r11
            goto L_0x045e
        L_0x0453:
            r11 = r28
            r1.f314391g1 = r11
            goto L_0x045e
        L_0x0458:
            r27 = r2
            r24 = r3
            r23 = r15
        L_0x045e:
            int r0 = r1.f314381a1
            r11 = r48
            if (r0 != r11) goto L_0x046b
            int r0 = r1.f314382b1
            r12 = r49
            if (r0 == r12) goto L_0x0471
            goto L_0x046d
        L_0x046b:
            r12 = r49
        L_0x046d:
            r1.f314381a1 = r11
            r1.f314382b1 = r12
        L_0x0471:
            if (r8 == 0) goto L_0x0476
            int[] r0 = r1.f314383c1
            goto L_0x0478
        L_0x0476:
            int[] r0 = r1.f314385d1
        L_0x0478:
            r13 = r0
            r0 = -1
            if (r8 != 0) goto L_0x09d9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "nSendVideoData, mCapW: "
            r2.append(r3)
            int r3 = r1.f314381a1
            r2.append(r3)
            r3 = r27
            r2.append(r3)
            int r3 = r1.f314382b1
            r2.append(r3)
            java.lang.String r3 = ", width: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = ", height: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ", bIsScreen: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", mIsHWEncEnable: "
            r2.append(r3)
            boolean r3 = r1.f314398k1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
            r0 = r1
            r2 = 2
            r14 = -1
            r15 = 0
        L_0x04c2:
            if (r15 >= r2) goto L_0x09ce
            r3 = r13[r15]
            r9 = 4
            if (r3 != r9) goto L_0x04ce
            r9 = 8
            r34 = 1
            goto L_0x04d2
        L_0x04ce:
            r9 = 8
            r34 = 0
        L_0x04d2:
            if (r3 != r9) goto L_0x04d6
            r3 = 1
            goto L_0x04d7
        L_0x04d6:
            r3 = 0
        L_0x04d7:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r16 = 0
            r9[r16] = r2
            r2 = r13[r15]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r17 = 1
            r9[r17] = r2
            java.lang.String r2 = "pEncModeList[%d] = %d, "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r9)
            java.lang.String r2 = "] = "
            if (r8 == 0) goto L_0x0517
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r9 = r0.f314393h1
            r9 = r9[r15]
            r20 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r15)
            r5.append(r2)
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r2 = r0.f314393h1
            r2 = r2[r15]
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
            goto L_0x0539
        L_0x0517:
            r20 = r5
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r5 = r0.f314395i1
            r9 = r5[r15]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            r5.append(r15)
            r5.append(r2)
            com.tencent.mm.plugin.multitalk.ilinkservice.p[] r2 = r0.f314395i1
            r2 = r2[r15]
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
        L_0x0539:
            if (r9 == 0) goto L_0x0967
            r5 = r34
            if (r5 != 0) goto L_0x0551
            if (r3 == 0) goto L_0x0542
            goto L_0x0551
        L_0x0542:
            r11 = r47
            r28 = r7
            r25 = r8
            r8 = r10
            r27 = r13
            r26 = r14
            r35 = r20
            goto L_0x0976
        L_0x0551:
            if (r23 == 0) goto L_0x0555
            r0 = 1
            goto L_0x0556
        L_0x0555:
            r0 = 0
        L_0x0556:
            r9.f314204i = r0
            int r0 = r9.f314207l
            if (r11 != r0) goto L_0x0560
            int r0 = r9.f314208m
            if (r12 == r0) goto L_0x0564
        L_0x0560:
            r9.f314207l = r11
            r9.f314208m = r12
        L_0x0564:
            byte[] r0 = r9.f314209n
            if (r0 != 0) goto L_0x0579
            int r0 = r9.f314207l
            int r2 = r9.f314208m
            int r0 = r0 * r2
            int r0 = r0 * 3
            r21 = 2
            int r0 = r0 / 2
            byte[] r0 = new byte[r0]
            r9.f314209n = r0
            goto L_0x057b
        L_0x0579:
            r21 = 2
        L_0x057b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "steve: m_framerate: "
            r0.append(r2)
            int r2 = r9.f314201f
            r0.append(r2)
            java.lang.String r2 = ", m_br_kbps:"
            r0.append(r2)
            int r2 = r9.f314202g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            com.tencent.mm.plugin.multitalk.ilinkservice.a r0 = r9.f314217v
            byte r0 = r0.f314049g
            java.lang.String r2 = " error:"
            if (r0 != 0) goto L_0x06cf
            r11 = r47
            int r0 = r11.length
            r22 = r10
            int r10 = r9.f314207l
            int r12 = r9.f314208m
            r25 = r8
            byte[] r8 = r9.f314209n
            com.tencent.wxmm.v2conference r26 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
            r27 = r13
            r13 = r2
            r2 = r26
            r1 = r3
            r26 = r14
            r14 = r24
            r3 = r47
            r24 = r1
            r1 = r4
            r4 = r0
            r36 = r5
            r35 = r20
            r5 = r10
            r20 = r6
            r6 = r12
            r28 = r7
            r7 = r50
            r21 = r14
            r29 = r15
            r14 = 2
            r18 = 8
            r19 = 4
            r15 = r9
            r9 = r10
            r37 = r22
            r14 = 0
            r10 = r12
            int r0 = r2.videoHWProcess(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 >= 0) goto L_0x0618
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "videoHWProcess failed! length: "
            r2.append(r3)
            int r3 = r11.length
            r2.append(r3)
            java.lang.String r3 = ", m_CapW: "
            r2.append(r3)
            int r3 = r15.f314207l
            r2.append(r3)
            java.lang.String r3 = ", m_CapH: "
            r2.append(r3)
            int r3 = r15.f314208m
            r2.append(r3)
            java.lang.String r3 = ", format: "
            r2.append(r3)
            r7 = r50
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x08a4
        L_0x0618:
            r7 = r50
            byte[] r2 = r15.f314209n
            com.tencent.wxmm.v2conference r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
            int r3 = r0.field_HWEncW
            int r0 = r0.field_HWEncH
            int r4 = r15.f314199d
            if (r4 != r3) goto L_0x0632
            int r4 = r15.f314200e
            if (r4 != r0) goto L_0x0632
            com.tencent.mm.compatible.deviceinfo.a r4 = r15.f314197b
            if (r4 != 0) goto L_0x062f
            goto L_0x0632
        L_0x062f:
            r10 = 0
            goto L_0x06cc
        L_0x0632:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "restart encoder! clipWH:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "x"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r6 = ", wh:"
            r4.append(r6)
            int r6 = r15.f314199d
            r4.append(r6)
            r4.append(r5)
            int r5 = r15.f314200e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r15.f314199d = r3
            r15.f314200e = r0
            int r3 = r3 * r0
            int r3 = r3 * 3
            r4 = 1
            int r0 = r3 >> 1
            r15.f314218w = r0
            int r0 = r15.mo150539a()     // Catch:{ Exception -> 0x0674 }
        L_0x0672:
            r3 = r0
            goto L_0x0696
        L_0x0674:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "mediacodec init error: "
            r0.append(r4)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r0 = 2003(0x7d3, float:2.807E-42)
            r15.f314196a = r0
            int r0 = r15.f314196a
            int r0 = -r0
            goto L_0x0672
        L_0x0696:
            if (r3 >= 0) goto L_0x06cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "mediacodec init failed, stop HW encoding! ret: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r15.mo150540b()     // Catch:{ Exception -> 0x06b0 }
            goto L_0x06c8
        L_0x06b0:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x06c8:
            r0 = r3
            goto L_0x08a4
        L_0x06cb:
            r10 = r3
        L_0x06cc:
            int r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x
            goto L_0x06f3
        L_0x06cf:
            r11 = r47
            r1 = r4
            r36 = r5
            r28 = r7
            r25 = r8
            r37 = r10
            r27 = r13
            r26 = r14
            r29 = r15
            r35 = r20
            r21 = r24
            r14 = 0
            r18 = 8
            r19 = 4
            r7 = r50
            r13 = r2
            r24 = r3
            r20 = r6
            r15 = r9
            r2 = 0
            r10 = 0
        L_0x06f3:
            if (r2 == 0) goto L_0x08fc
            com.tencent.mm.compatible.deviceinfo.a r0 = r15.f314197b
            if (r0 == 0) goto L_0x08fc
            r15.f314216u = r14     // Catch:{ Exception -> 0x08df }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x08df }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            java.lang.String r5 = "steve: put YUV into encoder, size:"
            r0.append(r5)     // Catch:{ Exception -> 0x08df }
            int r5 = r15.f314218w     // Catch:{ Exception -> 0x08df }
            r0.append(r5)     // Catch:{ Exception -> 0x08df }
            java.lang.String r5 = ", idx:"
            r0.append(r5)     // Catch:{ Exception -> 0x08df }
            int r5 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x     // Catch:{ Exception -> 0x08df }
            r0.append(r5)     // Catch:{ Exception -> 0x08df }
            java.lang.String r5 = ", time:"
            r0.append(r5)     // Catch:{ Exception -> 0x08df }
            r0.append(r3)     // Catch:{ Exception -> 0x08df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r0 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            java.nio.ByteBuffer[] r0 = r0.mo148208j()     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r3 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            java.nio.ByteBuffer[] r3 = r3.mo148211m()     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r4 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            r5 = -1
            int r39 = r4.mo148204f(r5)     // Catch:{ Exception -> 0x08df }
            if (r39 < 0) goto L_0x078b
            long r4 = r15.f314210o     // Catch:{ Exception -> 0x08df }
            int r6 = r15.f314201f     // Catch:{ Exception -> 0x08df }
            r8 = 15
            int r6 = java.lang.Math.max(r6, r8)     // Catch:{ Exception -> 0x08df }
            r8 = 30
            int r6 = java.lang.Math.min(r6, r8)     // Catch:{ Exception -> 0x08df }
            r8 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0763
            long r4 = r15.f314211p     // Catch:{ Exception -> 0x08df }
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x075a
            goto L_0x0763
        L_0x075a:
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = r8 / r6
            long r8 = (long) r8     // Catch:{ Exception -> 0x08df }
            long r4 = r4 + r8
            r15.f314211p = r4     // Catch:{ Exception -> 0x08df }
            goto L_0x0767
        L_0x0763:
            r4 = 132(0x84, double:6.5E-322)
            r15.f314211p = r4     // Catch:{ Exception -> 0x08df }
        L_0x0767:
            long r4 = r15.f314211p     // Catch:{ Exception -> 0x08df }
            r0 = r0[r39]     // Catch:{ Exception -> 0x08df }
            r0.clear()     // Catch:{ Exception -> 0x08df }
            int r6 = r15.f314218w     // Catch:{ Exception -> 0x08df }
            r0.put(r2, r14, r6)     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r0 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            r40 = 0
            int r2 = r15.f314218w     // Catch:{ Exception -> 0x08df }
            r44 = 0
            r38 = r0
            r41 = r2
            r42 = r4
            r38.mo148213o(r39, r40, r41, r42, r44)     // Catch:{ Exception -> 0x08df }
            long r4 = r15.f314210o     // Catch:{ Exception -> 0x08df }
            r8 = 1
            long r4 = r4 + r8
            r15.f314210o = r4     // Catch:{ Exception -> 0x08df }
        L_0x078b:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r2 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            r4 = 12000(0x2ee0, float:1.6816E-41)
            long r4 = (long) r4     // Catch:{ Exception -> 0x08df }
            int r2 = r2.mo148205g(r0, r4)     // Catch:{ Exception -> 0x08df }
            r6 = -2
            if (r2 != r6) goto L_0x07b6
            com.tencent.mm.compatible.deviceinfo.a r6 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            android.media.MediaFormat r6 = r6.mo148212n()     // Catch:{ Exception -> 0x08df }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r8.<init>()     // Catch:{ Exception -> 0x08df }
            java.lang.String r9 = "steve: encoder output format changed: "
            r8.append(r9)     // Catch:{ Exception -> 0x08df }
            r8.append(r6)     // Catch:{ Exception -> 0x08df }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)     // Catch:{ Exception -> 0x08df }
        L_0x07b6:
            if (r2 < 0) goto L_0x08dd
            r6 = r3[r2]     // Catch:{ Exception -> 0x08df }
            int r8 = r0.size     // Catch:{ Exception -> 0x08df }
            byte[] r9 = new byte[r8]     // Catch:{ Exception -> 0x08df }
            r6.get(r9)     // Catch:{ Exception -> 0x08df }
            int r6 = r0.flags     // Catch:{ Exception -> 0x08df }
            java.lang.String r10 = "mediacodec reinit error: "
            java.lang.String r12 = ", checkCodeForBSlice:"
            java.lang.String r14 = "steve:B-frames exist in High Profile, reset to Baseline!!!,maxAllowedProfile:"
            r22 = r3
            r3 = 2
            if (r6 != r3) goto L_0x084e
            int r3 = r15.f314213r     // Catch:{ Exception -> 0x08df }
            r6 = 1
            if (r3 == r6) goto L_0x0826
            com.tencent.mm.plugin.voip.model.h r3 = r15.f314212q     // Catch:{ Exception -> 0x08df }
            boolean r3 = r3.mo152584b(r9)     // Catch:{ Exception -> 0x08df }
            if (r3 == 0) goto L_0x0826
            com.tencent.mm.plugin.voip.model.h r0 = r15.f314212q     // Catch:{ Exception -> 0x08df }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x08df }
            r15.f314215t = r0     // Catch:{ Exception -> 0x08df }
            r2 = 1
            r15.f314214s = r2     // Catch:{ Exception -> 0x08df }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            r0.append(r14)     // Catch:{ Exception -> 0x08df }
            int r2 = r15.f314214s     // Catch:{ Exception -> 0x08df }
            r0.append(r2)     // Catch:{ Exception -> 0x08df }
            r0.append(r12)     // Catch:{ Exception -> 0x08df }
            int r2 = r15.f314215t     // Catch:{ Exception -> 0x08df }
            r0.append(r2)     // Catch:{ Exception -> 0x08df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x08df }
            int r0 = r15.mo150539a()     // Catch:{ Exception -> 0x0806 }
            goto L_0x08a4
        L_0x0806:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            r0.append(r10)     // Catch:{ Exception -> 0x08df }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x08df }
            r0.append(r2)     // Catch:{ Exception -> 0x08df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x08df }
            r2 = 2005(0x7d5, float:2.81E-42)
            r15.f314196a = r2     // Catch:{ Exception -> 0x08df }
            int r0 = r15.f314196a     // Catch:{ Exception -> 0x08df }
            goto L_0x08a3
        L_0x0826:
            byte[] r3 = r15.f314205j     // Catch:{ Exception -> 0x08df }
            if (r3 != 0) goto L_0x0830
            int r3 = r0.size     // Catch:{ Exception -> 0x08df }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x08df }
            r15.f314205j = r3     // Catch:{ Exception -> 0x08df }
        L_0x0830:
            byte[] r3 = r15.f314205j     // Catch:{ Exception -> 0x08df }
            if (r3 == 0) goto L_0x0843
            int r6 = r0.size     // Catch:{ Exception -> 0x08df }
            int r3 = r3.length     // Catch:{ Exception -> 0x08df }
            if (r6 <= r3) goto L_0x083d
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x08df }
            r15.f314205j = r3     // Catch:{ Exception -> 0x08df }
        L_0x083d:
            byte[] r3 = r15.f314205j     // Catch:{ Exception -> 0x08df }
            r10 = 0
            java.lang.System.arraycopy(r9, r10, r3, r10, r6)     // Catch:{ Exception -> 0x08df }
        L_0x0843:
            r3 = 0
            r15.f314206k = r3     // Catch:{ Exception -> 0x08df }
            int r3 = r0.flags     // Catch:{ Exception -> 0x08df }
            r15.mo150541c(r9, r3, r8)     // Catch:{ Exception -> 0x08df }
            r3 = 1
            goto L_0x08c3
        L_0x084e:
            int r3 = r15.f314213r     // Catch:{ Exception -> 0x08df }
            r6 = 1
            if (r3 == r6) goto L_0x08a6
            com.tencent.mm.plugin.voip.model.h r3 = r15.f314212q     // Catch:{ Exception -> 0x08df }
            boolean r3 = r3.mo152585c(r9)     // Catch:{ Exception -> 0x08df }
            if (r3 == 0) goto L_0x08a6
            com.tencent.mm.plugin.voip.model.h r0 = r15.f314212q     // Catch:{ Exception -> 0x08df }
            int r0 = r0.f317324a     // Catch:{ Exception -> 0x08df }
            r15.f314215t = r0     // Catch:{ Exception -> 0x08df }
            r2 = 1
            r15.f314214s = r2     // Catch:{ Exception -> 0x08df }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            r0.append(r14)     // Catch:{ Exception -> 0x08df }
            int r2 = r15.f314214s     // Catch:{ Exception -> 0x08df }
            r0.append(r2)     // Catch:{ Exception -> 0x08df }
            r0.append(r12)     // Catch:{ Exception -> 0x08df }
            int r2 = r15.f314215t     // Catch:{ Exception -> 0x08df }
            r0.append(r2)     // Catch:{ Exception -> 0x08df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x08df }
            int r0 = r15.mo150539a()     // Catch:{ Exception -> 0x0885 }
            goto L_0x08a4
        L_0x0885:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08df }
            r0.<init>()     // Catch:{ Exception -> 0x08df }
            r0.append(r10)     // Catch:{ Exception -> 0x08df }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x08df }
            r0.append(r2)     // Catch:{ Exception -> 0x08df }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x08df }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ Exception -> 0x08df }
            r2 = 2005(0x7d5, float:2.81E-42)
            r15.f314196a = r2     // Catch:{ Exception -> 0x08df }
            int r0 = r15.f314196a     // Catch:{ Exception -> 0x08df }
        L_0x08a3:
            int r0 = -r0
        L_0x08a4:
            r6 = 0
            goto L_0x090d
        L_0x08a6:
            boolean r3 = r15.f314206k     // Catch:{ Exception -> 0x08df }
            if (r3 == 0) goto L_0x08bb
            int r3 = r0.flags     // Catch:{ Exception -> 0x08df }
            r6 = 1
            if (r3 != r6) goto L_0x08bb
            java.lang.String r3 = "Need send SPS and PPS!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ Exception -> 0x08df }
            byte[] r3 = r15.f314205j     // Catch:{ Exception -> 0x08df }
            int r6 = r3.length     // Catch:{ Exception -> 0x08df }
            r10 = 2
            r15.mo150541c(r3, r10, r6)     // Catch:{ Exception -> 0x08df }
        L_0x08bb:
            int r3 = r0.flags     // Catch:{ Exception -> 0x08df }
            r15.mo150541c(r9, r3, r8)     // Catch:{ Exception -> 0x08df }
            r3 = 1
            r15.f314206k = r3     // Catch:{ Exception -> 0x08df }
        L_0x08c3:
            int r10 = r0.flags     // Catch:{ Exception -> 0x08df }
            int r6 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x     // Catch:{ Exception -> 0x08df }
            int r6 = r6 + r3
            com.tencent.p014mm.plugin.multitalk.ilinkservice.C105674p.f314194x = r6     // Catch:{ Exception -> 0x08df }
            com.tencent.mm.compatible.deviceinfo.a r3 = r15.f314197b     // Catch:{ Exception -> 0x08df }
            r6 = 0
            r3.mo148216r(r2, r6)     // Catch:{ Exception -> 0x08db }
            com.tencent.mm.compatible.deviceinfo.a r2 = r15.f314197b     // Catch:{ Exception -> 0x08db }
            int r2 = r2.mo148205g(r0, r4)     // Catch:{ Exception -> 0x08db }
            r3 = r22
            r14 = 0
            goto L_0x07b6
        L_0x08db:
            r0 = move-exception
            goto L_0x08e1
        L_0x08dd:
            r6 = 0
            goto L_0x090c
        L_0x08df:
            r0 = move-exception
            r6 = 0
        L_0x08e1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r0 = 2004(0x7d4, float:2.808E-42)
            r15.f314196a = r0
            goto L_0x090a
        L_0x08fc:
            r6 = 0
            int r0 = r15.f314216u
            int r2 = r0 + 1
            r15.f314216u = r2
            r2 = 5
            if (r0 <= r2) goto L_0x090c
            r0 = 2006(0x7d6, float:2.811E-42)
            r15.f314196a = r0
        L_0x090a:
            int r0 = -r0
            goto L_0x090d
        L_0x090c:
            r0 = r10
        L_0x090d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r21
            r2.append(r3)
            r4 = r29
            r2.append(r4)
            java.lang.String r5 = "DoMediacodecEnc, ret: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r8 = r37
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r2)
            if (r0 < 0) goto L_0x0935
            r2 = 2
            r26 = 1
            r9 = r46
            goto L_0x0961
        L_0x0935:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "StopHWEnc!! hw encoder error: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            if (r24 == 0) goto L_0x0954
            r9 = r46
            int r0 = r9.f314387e1
            r2 = 2
            r0 = r0 | r2
            r9.f314387e1 = r0
            goto L_0x0961
        L_0x0954:
            r2 = 2
            r9 = r46
            r5 = r36
            if (r5 == 0) goto L_0x0961
            int r0 = r9.f314387e1
            r5 = 1
            r0 = r0 | r5
            r9.f314387e1 = r0
        L_0x0961:
            r0 = r9
            r14 = r26
            r13 = r35
            goto L_0x09b8
        L_0x0967:
            r11 = r47
            r28 = r7
            r25 = r8
            r8 = r10
            r27 = r13
            r26 = r14
            r35 = r20
            r5 = r34
        L_0x0976:
            r2 = 2
            r18 = 8
            r19 = 4
            r7 = r50
            r10 = r3
            r20 = r6
            r3 = r24
            r6 = 0
            r45 = r9
            r9 = r1
            r1 = r4
            r4 = r15
            r15 = r45
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "pHWEnc["
            r12.append(r13)
            r12.append(r4)
            r13 = r35
            r12.append(r13)
            r12.append(r15)
            java.lang.String r14 = ", bIsHW264: "
            r12.append(r14)
            r12.append(r5)
            java.lang.String r5 = ", bIsHW265: "
            r12.append(r5)
            r12.append(r10)
            java.lang.String r5 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            r14 = r26
        L_0x09b8:
            int r15 = r4 + 1
            r11 = r48
            r12 = r49
            r4 = r1
            r24 = r3
            r10 = r8
            r1 = r9
            r5 = r13
            r6 = r20
            r8 = r25
            r13 = r27
            r7 = r28
            goto L_0x04c2
        L_0x09ce:
            r11 = r47
            r7 = r50
            r9 = r1
            r25 = r8
            r8 = r10
            r26 = r14
            goto L_0x09e7
        L_0x09d9:
            r11 = r47
            r7 = r50
            r9 = r1
            r25 = r8
            r8 = r10
            r1 = 1
            r9.f314389f1 = r1
            r0 = r9
            r26 = -1
        L_0x09e7:
            if (r25 == 0) goto L_0x09ed
            boolean r1 = r0.f314389f1
            if (r1 != 0) goto L_0x09f3
        L_0x09ed:
            if (r25 != 0) goto L_0x0a02
            boolean r1 = r0.f314391g1
            if (r1 == 0) goto L_0x0a02
        L_0x09f3:
            com.tencent.wxmm.v2conference r2 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w.f314302c
            int r4 = r11.length
            r3 = r47
            r5 = r48
            r6 = r49
            r7 = r50
            int r26 = r2.SendVideoData(r3, r4, r5, r6, r7)
        L_0x0a02:
            r1 = r26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "nSendVideoData, ret: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", mIsSWScreenEncUsing: "
            r2.append(r3)
            boolean r3 = r0.f314389f1
            r2.append(r3)
            java.lang.String r3 = ", mIsSWVideoEncUsing: "
            r2.append(r3)
            boolean r0 = r0.f314391g1
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.mo150609s(byte[], int, int, int):int");
    }

    /* renamed from: t */
    public int mo150610t(int i, byte[] bArr, int i2) {
        return C105714w.m141918c(i, bArr, i2);
    }

    /* renamed from: u */
    public void mo150611u() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "In networkRequestViaCellular");
        if (C11171e.m11046c(21)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(0);
            builder.addCapability(12);
            NetworkRequest build = builder.build();
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "NetworkRequest toString: " + build.toString() + " hashCode: " + build.hashCode());
            try {
                connectivityManager.requestNetwork(build, new C105742r());
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.Multitalk.ILinkService", "missing the appropriate permissions");
            }
        }
    }

    /* renamed from: v */
    public void mo150612v() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: onCameraStop");
        mo150614x(new C105741q());
    }

    /* renamed from: w */
    public void mo150613w(boolean z) {
        Object[] objArr = new Object[1];
        objArr[0] = z ? "yes" : "no";
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "onMicSwitch: %s", objArr);
        mo150614x(new C105740p(z));
    }

    /* renamed from: x */
    public void mo150614x(Runnable runnable) {
        if (this.f314396j.getSerialTag().equals(C109639a.m148954e())) {
            runnable.run();
        } else {
            this.f314396j.post(new C30291w(runnable));
        }
    }

    /* renamed from: y */
    public void mo150615y(long j, String str) {
        this.f314362Q0 = str;
        this.f314364R0 = j;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "set name=%s, uin=%d", str, Long.valueOf(j));
    }

    /* renamed from: z */
    public void mo150616z(boolean z) {
        try {
            this.f314390g.mo150525c();
            if (z && this.f314401n == 1) {
                this.f314390g.mo150524b();
                boolean e = this.f314390g.mo150527e();
                boolean f = this.f314390g.mo150528f(this.f314407p1);
                if (e && f) {
                    Log.m105924i("MicroMsg.Multitalk.ILinkService", "setRecordDevActive restart audio device OK!");
                }
            }
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "setRecordDevActive active: " + z);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "setRecordDevActive active: " + z + ", error:" + th);
        }
    }
}
