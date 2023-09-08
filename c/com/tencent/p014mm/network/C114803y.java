package com.tencent.p014mm.network;

import android.content.SharedPreferences;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.mars.Mars;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.magicbox.IPxxLogic;
import com.tencent.mars.p468mm.MMLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114762a;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.network.C114776i0;
import com.tencent.p014mm.network.C114783m;
import com.tencent.p014mm.network.C26882h;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85798u1;
import eb0.C7627m3;
import ee0.C31566b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kj2.C117407d;
import oa1.C117731d;
import p823sg.C77710q;
import pc0.C118000d0;
import qe3.C101125b1;
import qe3.C118180j;
import qe3.C118181k;
import qe3.C89618a;
import qe3.C89619a1;
import qe3.C89623b0;
import qe3.C89625d;
import qe3.C89637y0;
import sf0.C90188n0;
import te3.C49510g33;
import te3.C51693vg2;
import te3.C52114yg2;
import te3.C64724t8;
import te3.C64747u8;
import te3.xk4;
import yb0.C118950a;

/* renamed from: com.tencent.mm.network.y */
public class C114803y extends C26882h.C26883a implements C114762a.C114764b, C114770g {

    /* renamed from: A */
    public static String f344200A = "";

    /* renamed from: B */
    public static String f344201B = "";

    /* renamed from: e */
    public int f344202e = 0;

    /* renamed from: f */
    public long f344203f = 0;

    /* renamed from: g */
    public long f344204g = 0;

    /* renamed from: h */
    public long f344205h = 0;

    /* renamed from: i */
    public WakerLock f344206i = null;

    /* renamed from: j */
    public final long f344207j;

    /* renamed from: n */
    public C114762a f344208n;

    /* renamed from: o */
    public C114818p f344209o;

    /* renamed from: p */
    public C114820q f344210p;

    /* renamed from: q */
    public long f344211q = 0;

    /* renamed from: r */
    public int f344212r = -1;

    /* renamed from: s */
    public int f344213s = 0;

    /* renamed from: t */
    public MMHandler f344214t;

    /* renamed from: u */
    public C85798u1 f344215u;

    /* renamed from: v */
    public C81044x f344216v;

    /* renamed from: w */
    public C114773i f344217w;

    /* renamed from: x */
    public byte[] f344218x;

    /* renamed from: y */
    public C114778k f344219y;

    /* renamed from: z */
    public long f344220z = 0;

    /* renamed from: com.tencent.mm.network.y$j */
    public class C81047j extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ boolean f238071a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81047j(long j, Object obj, boolean z) {
            super(j, obj);
            this.f238071a = z;
        }

        public Object run() {
            Mars.onForeground(this.f238071a);
            C118950a.m167707d(this.f238071a);
            CrashReportFactory.setForeground(this.f238071a);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$a */
    public class C114804a extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ String f344221a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114804a(long j, Object obj, String str) {
            super(j, obj);
            this.f344221a = str;
        }

        public Object run() {
            Log.appenderFlush();
            IPxxLogic.onIPxx(this.f344221a, 0);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$b */
    public class C114805b implements Runnable {
        public C114805b() {
        }

        public void run() {
            Log.m105924i("MicroMsg.MMAutoAuth", "makeSureAuth AUTH_HOLD_KEY hold  clearTaskAndCallback");
            C114781l0.m161559f().mo174426b(4, -100, MMApplicationContext.getContext().getString(C0966R.string.gmd));
        }
    }

    /* renamed from: com.tencent.mm.network.y$c */
    public class C114806c extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ String[] f344224a;

        /* renamed from: b */
        public final /* synthetic */ String[] f344225b;

        /* renamed from: c */
        public final /* synthetic */ int[] f344226c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114806c(long j, Object obj, String[] strArr, String[] strArr2, int[] iArr) {
            super(j, obj);
            this.f344224a = strArr;
            this.f344225b = strArr2;
            this.f344226c = iArr;
        }

        public Object run() {
            MMLogic.setHostInfo(this.f344224a, this.f344225b, this.f344226c);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$d */
    public class C114807d extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ String[] f344228a;

        /* renamed from: b */
        public final /* synthetic */ String[] f344229b;

        /* renamed from: c */
        public final /* synthetic */ int[] f344230c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114807d(long j, Object obj, String[] strArr, String[] strArr2, int[] iArr) {
            super(j, obj);
            this.f344228a = strArr;
            this.f344229b = strArr2;
            this.f344230c = iArr;
        }

        public Object run() {
            Log.m105925i("MicroMsg.MMAutoAuth", "add host size [%d]", Integer.valueOf(this.f344228a.length));
            MMLogic.addHostInfo(this.f344228a, this.f344229b, this.f344230c);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$e */
    public class C114808e extends SyncTask<Integer> {

        /* renamed from: a */
        public final /* synthetic */ String f344232a;

        /* renamed from: b */
        public final /* synthetic */ int f344233b;

        /* renamed from: c */
        public final /* synthetic */ long f344234c;

        /* renamed from: d */
        public final /* synthetic */ String f344235d;

        /* renamed from: e */
        public final /* synthetic */ String f344236e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114808e(long j, Integer num, String str, int i, long j2, String str2, String str3) {
            super(j, num);
            this.f344232a = str;
            this.f344233b = i;
            this.f344234c = j2;
            this.f344235d = str2;
            this.f344236e = str3;
        }

        /* JADX INFO: finally extract failed */
        public Object run() {
            try {
                C114803y.this.f344206i.lock(2000, "MMAutoAuth.uploadFile");
                int uploadFile = IPxxLogic.uploadFile(this.f344232a, 0, this.f344233b, this.f344234c, this.f344235d, this.f344236e);
                Log.m105925i("MicroMsg.MMAutoAuth", "[+] uploadFile triggered, path: %s", this.f344232a);
                C114803y.this.f344206i.unLock();
                return Integer.valueOf(uploadFile);
            } catch (Throwable th) {
                C114803y.this.f344206i.unLock();
                throw th;
            }
        }
    }

    /* renamed from: com.tencent.mm.network.y$f */
    public class C114809f extends SyncTask<Integer> {

        /* renamed from: a */
        public final /* synthetic */ int f344238a;

        /* renamed from: b */
        public final /* synthetic */ int f344239b;

        /* renamed from: c */
        public final /* synthetic */ int[] f344240c;

        /* renamed from: d */
        public final /* synthetic */ boolean f344241d;

        /* renamed from: e */
        public final /* synthetic */ long f344242e;

        /* renamed from: f */
        public final /* synthetic */ String f344243f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114809f(long j, Integer num, int i, int i2, int[] iArr, boolean z, long j2, String str) {
            super(j, num);
            this.f344238a = i;
            this.f344239b = i2;
            this.f344240c = iArr;
            this.f344241d = z;
            this.f344242e = j2;
            this.f344243f = str;
        }

        /* JADX INFO: finally extract failed */
        public Object run() {
            try {
                C114803y.this.f344206i.lock(2000, "MMAutoAuth.uploadLog");
                Log.appenderFlush();
                Log.m105925i("MicroMsg.MMAutoAuth", "[+] uploadLog triggered, hours: [%s, %s].", Integer.valueOf(this.f344238a), Integer.valueOf(this.f344239b));
                int uploadLog = IPxxLogic.uploadLog(0, this.f344240c, this.f344241d, this.f344242e, this.f344243f, this.f344238a, this.f344239b);
                Log.m105924i("MicroMsg.MMAutoAuth", "[+] uploadLog triggered.");
                C114803y.this.f344206i.unLock();
                return Integer.valueOf(uploadLog);
            } catch (Throwable th) {
                C114803y.this.f344206i.unLock();
                throw th;
            }
        }
    }

    /* renamed from: com.tencent.mm.network.y$g */
    public class C114810g extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ int f344245a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114810g(long j, Object obj, int i) {
            super(j, obj);
            this.f344245a = i;
        }

        public Object run() {
            try {
                C114803y.m161593g(C114803y.this, this.f344245a);
                return null;
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.network.y$h */
    public class C114811h extends SyncTask<Object> {
        public C114811h(long j, Object obj) {
            super(j, obj);
        }

        public Object run() {
            C114803y yVar = C114803y.this;
            yVar.f344202e = 0;
            yVar.f344203f = 0;
            yVar.f344204g = 0;
            C114781l0.m161559f().mo174434i();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$i */
    public class C114812i extends SyncTask<Integer> {

        /* renamed from: a */
        public final /* synthetic */ C114800v f344248a;

        /* renamed from: b */
        public final /* synthetic */ C114789o f344249b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114812i(long j, Integer num, C114800v vVar, C114789o oVar) {
            super(j, num);
            this.f344248a = vVar;
            this.f344249b = oVar;
        }

        public Object run() {
            try {
                return Integer.valueOf(C114803y.m161591e(C114803y.this, this.f344248a, this.f344249b));
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
                C114803y yVar = C114803y.this;
                yVar.f344202e = 0;
                yVar.f344203f = 0;
                yVar.f344204g = 0;
                C114781l0.m161559f().mo174434i();
                return -1;
            }
        }
    }

    /* renamed from: com.tencent.mm.network.y$k */
    public class C114813k extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ HashMap f344251a;

        /* renamed from: b */
        public final /* synthetic */ int[] f344252b;

        /* renamed from: c */
        public final /* synthetic */ HashMap f344253c;

        /* renamed from: d */
        public final /* synthetic */ int[] f344254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114813k(long j, Object obj, HashMap hashMap, int[] iArr, HashMap hashMap2, int[] iArr2) {
            super(j, obj);
            this.f344251a = hashMap;
            this.f344252b = iArr;
            this.f344253c = hashMap2;
            this.f344254d = iArr2;
        }

        public Object run() {
            this.f344251a.entrySet().iterator();
            try {
                MMLogic.saveAuthLongList(this.f344251a, this.f344252b);
            } catch (Throwable unused) {
                MMLogic.saveAuthLongList(this.f344251a, this.f344252b);
            }
            this.f344253c.entrySet().iterator();
            MMLogic.saveAuthShortList(this.f344253c, this.f344254d);
            Mars.onNetworkChange();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$l */
    public class C114814l extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ String f344256a;

        /* renamed from: b */
        public final /* synthetic */ String f344257b;

        /* renamed from: c */
        public final /* synthetic */ String f344258c;

        /* renamed from: d */
        public final /* synthetic */ String f344259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114814l(long j, Object obj, String str, String str2, String str3, String str4) {
            super(j, obj);
            this.f344256a = str;
            this.f344257b = str2;
            this.f344258c = str3;
            this.f344259d = str4;
        }

        public Object run() {
            MMLogic.setDebugIP(this.f344256a, this.f344257b, this.f344258c, this.f344259d);
            Mars.onNetworkChange();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$m */
    public class C114815m extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ String f344261a;

        /* renamed from: b */
        public final /* synthetic */ String f344262b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114815m(long j, Object obj, String str, String str2) {
            super(j, obj);
            this.f344261a = str;
            this.f344262b = str2;
        }

        public Object run() {
            MMLogic.setNewDnsDebugHost(this.f344261a, this.f344262b);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$n */
    public class C114816n extends SyncTask<Object> {

        /* renamed from: a */
        public final /* synthetic */ String f344264a;

        /* renamed from: b */
        public final /* synthetic */ String f344265b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C114816n(long j, Object obj, String str, String str2) {
            super(j, obj);
            this.f344264a = str;
            this.f344265b = str2;
        }

        public Object run() {
            StnLogic.setDebugIP(this.f344264a, this.f344265b);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$o */
    public class C114817o extends SyncTask<Object> {
        public C114817o(long j, Object obj) {
            super(j, obj);
        }

        public Object run() {
            C114803y.this.f344203f = 0;
            Mars.onNetworkChange();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.network.y$p */
    public static class C114818p extends C114783m.C114784a implements C114789o {

        /* renamed from: e */
        public C114803y f344268e;

        /* renamed from: f */
        public WakerLock f344269f;

        /* renamed from: g */
        public int f344270g = 0;

        /* renamed from: com.tencent.mm.network.y$p$a */
        public class C114819a extends SyncTask<Object> {

            /* renamed from: a */
            public final /* synthetic */ C114800v f344271a;

            /* renamed from: b */
            public final /* synthetic */ int f344272b;

            /* renamed from: c */
            public final /* synthetic */ int f344273c;

            /* renamed from: d */
            public final /* synthetic */ String f344274d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C114819a(long j, Object obj, C114800v vVar, int i, int i2, String str) {
                super(j, obj);
                this.f344271a = vVar;
                this.f344272b = i;
                this.f344273c = i2;
                this.f344274d = str;
            }

            public Object run() {
                try {
                    C114803y.m161590c(C114818p.this.f344268e, this.f344271a, this.f344272b, this.f344273c, this.f344274d);
                    return null;
                } catch (RemoteException e) {
                    Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
                    return null;
                }
            }
        }

        public C114818p(C114803y yVar, WakerLock wakerLock) {
            this.f344268e = yVar;
            this.f344269f = wakerLock;
        }

        /* renamed from: Rb */
        public void mo174444Rb(int i, int i2, int i3, String str, C114800v vVar, byte[] bArr) {
            int i4 = i2;
            int i5 = i3;
            String str2 = str;
            C114800v vVar2 = vVar;
            if (vVar.getType() == 252 || vVar.getType() == 701) {
                Log.m105918d("MicroMsg.MMAutoAuth", "summerauth IOnAutoAuth onGYNetEnd manual auth");
                if (vVar.getRespObj().mo182462Om() != 0 || i4 != 0) {
                    C117407d.INSTANCE.idkeyStat(148, -102 == i5 ? 30 : 29, 1, false);
                } else if (vVar.mo174485zy() == 2) {
                    C117407d.INSTANCE.idkeyStat(148, 28, 1, false);
                    int i6 = this.f344270g + 1;
                    this.f344270g = i6;
                    if (i6 > 1) {
                        Log.m105928w("MicroMsg.MMAutoAuth", "summerauth manualLoginDecodeFailedTry beyond 1 no more try!");
                        C114803y yVar = this.f344268e;
                        yVar.mo174495m(i4, i5, "auth_decode_failed_" + Util.nullAs(str2, ""));
                    } else {
                        vVar2.mo174463FG(this, 0, 0);
                    }
                } else {
                    this.f344270g = 0;
                    vVar2.mo174464YQ(this, i4, i5, str2);
                }
            }
            if (vVar.getRespObj().mo182462Om() == 0 && i4 == 0) {
                vVar2.mo174464YQ(this, i4, i5, str2);
            } else if (-102 == i5) {
                C114803y yVar2 = this.f344268e;
                yVar2.f344212r = i;
                vVar2.mo174478kD(yVar2.f344208n, yVar2.f344210p, 0, 0);
            } else {
                if (-301 == i5) {
                    vVar2.mo174464YQ(this, i4, i5, str2);
                } else if (-105 == i5) {
                    vVar2.mo174464YQ(this, i4, i5, str2);
                } else if (-17 == i5) {
                    vVar2.mo174464YQ(this, i4, i5, str2);
                }
                C114803y yVar3 = this.f344268e;
                yVar3.mo174495m(i4, i5, "autoauth_errmsg_" + Util.nullAs(str2, ""));
            }
        }

        /* renamed from: jM */
        public void mo174439jM(C114800v vVar, int i, int i2, String str) {
            this.f344269f.lock(C114803y.m161594k(), "MMAutoAuth.IOnAutoAuth.onAutoAuth");
            new C114819a(1000, (Object) null, vVar, i, i2, str).exec(this.f344268e.f344214t);
        }
    }

    /* renamed from: com.tencent.mm.network.y$q */
    public static class C114820q extends C114783m.C114784a implements C114789o {

        /* renamed from: e */
        public C114803y f344276e;

        /* renamed from: f */
        public WakerLock f344277f;

        /* renamed from: com.tencent.mm.network.y$q$a */
        public class C114821a extends SyncTask<Object> {

            /* renamed from: a */
            public final /* synthetic */ C114800v f344278a;

            /* renamed from: b */
            public final /* synthetic */ int f344279b;

            /* renamed from: c */
            public final /* synthetic */ int f344280c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C114821a(long j, Object obj, C114800v vVar, int i, int i2) {
                super(j, obj);
                this.f344278a = vVar;
                this.f344279b = i;
                this.f344280c = i2;
            }

            public Object run() {
                try {
                    C114803y.m161592f(C114820q.this.f344276e, this.f344278a, this.f344279b, this.f344280c);
                    return null;
                } catch (RemoteException e) {
                    Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
                    return null;
                }
            }
        }

        public C114820q(C114803y yVar, WakerLock wakerLock) {
            this.f344276e = yVar;
            this.f344277f = wakerLock;
        }

        /* renamed from: Rb */
        public void mo174444Rb(int i, int i2, int i3, String str, C114800v vVar, byte[] bArr) {
        }

        /* renamed from: jM */
        public void mo174439jM(C114800v vVar, int i, int i2, String str) {
            this.f344277f.lock(C114803y.m161594k(), "MMAutoAuth.IOnGetCert.onAutoAuth");
            new C114821a(1000, (Object) null, vVar, i, i2).exec(this.f344276e.f344214t);
        }
    }

    public C114803y(MMHandler mMHandler) {
        this.f344214t = mMHandler == null ? new MMHandler() : mMHandler;
        this.f344208n = new C114762a(this);
        this.f344206i = new WakerLock(C114781l0.m161555b(), "MicroMsg.MMAutoAuth");
        this.f344207j = m161594k();
        this.f344209o = new C114818p(this, this.f344206i);
        this.f344210p = new C114820q(this, this.f344206i);
        this.f344215u = new C85798u1(C72994y1.f212832a + "autoauth.cfg");
    }

    /* renamed from: c */
    public static void m161590c(C114803y yVar, C114800v vVar, int i, int i2, String str) {
        yVar.getClass();
        Log.m105918d("MicroMsg.MMAutoAuth", "account info updated:" + yVar.f344208n);
        Log.m105925i("MicroMsg.MMAutoAuth", "oreh doAutoAuth ticket:%s, login:%b", str, Boolean.valueOf(yVar.f344208n.mo54108G3()));
        Log.appenderFlush();
        if (!yVar.f344208n.mo54108G3() && !C114781l0.m161559f().mo174428d() && C114781l0.m161559f().mo174435j(vVar, yVar.f344209o, yVar.f344208n, 1) < 0) {
            yVar.mo174495m(3, -1, "");
        }
    }

    /* renamed from: e */
    public static int m161591e(C114803y yVar, C114800v vVar, C114789o oVar) {
        yVar.getClass();
        Log.m105925i("MicroMsg.MMAutoAuth", "dkcgi sendImp rr.type:%d callback:%d", Integer.valueOf(vVar.getType()), Integer.valueOf(oVar.hashCode()));
        int type = vVar.getType();
        if (type == 126) {
            vVar.getType();
            C114762a aVar = new C114762a(yVar);
            aVar.f344117e = vVar.getReqObj().getUserName();
            int j = C114781l0.m161559f().mo174435j(vVar, oVar, aVar, 0);
            if (j < 0) {
                Log.m105920e("MicroMsg.MMAutoAuth", "register: net.send err");
                return j;
            }
            Log.m105924i("MicroMsg.MMAutoAuth", "register: netid=" + j);
            return j;
        } else if (type == 252) {
            int h = yVar.mo174491h(vVar, oVar);
            Log.m105925i("MicroMsg.MMAutoAuth", "summerauths MMFunc_SecManualAuth netId[%s]", Integer.valueOf(h));
            return h;
        } else if (type == 701) {
            return yVar.mo174491h(vVar, oVar);
        } else {
            try {
                vVar.getReqObj().mo139610b(yVar.f344208n.f344122j);
                int j2 = C114781l0.m161559f().mo174435j(vVar, oVar, yVar.f344208n, vVar.getIsUserCmd() ? 1 : 0);
                if (j2 >= 0) {
                    return j2;
                }
                Log.m105920e("MicroMsg.MMAutoAuth", "nonauth: in queue err");
                return j2;
            } catch (Throwable unused) {
                return -1;
            }
        }
    }

    /* renamed from: f */
    public static void m161592f(C114803y yVar, C114800v vVar, int i, int i2) {
        yVar.getClass();
        Log.m105918d("MicroMsg.MMAutoAuth", "dkcert doGetCert");
        if (yVar.f344211q > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = yVar.f344211q;
            if (60000 >= elapsedRealtime - j) {
                Log.m105929w("MicroMsg.MMAutoAuth", "getcert lastGetCertSucTime=%d, curtime=%d", Long.valueOf(j), Long.valueOf(SystemClock.elapsedRealtime()));
                yVar.mo174495m(3, -1, "");
                return;
            }
        }
        if (C114781l0.m161559f().mo174435j(vVar, yVar.f344210p, yVar.f344208n, 0) < 0) {
            yVar.mo174495m(3, -1, "");
        }
    }

    /* renamed from: g */
    public static void m161593g(C114803y yVar, int i) {
        int i2;
        yVar.getClass();
        Log.m105924i("MicroMsg.MMAutoAuth", "cancel: netid=" + i);
        if (i < 0) {
            Log.m105920e("MicroMsg.MMAutoAuth", "error netid < 0, " + i);
            return;
        }
        C114776i0 f = C114781l0.m161559f();
        f.getClass();
        Log.m105924i("MicroMsg.MMNativeNetTaskAdapter", "stopTask netId=" + i);
        if (i >= 0 && i < 100) {
            synchronized (f.f344152a) {
                C114776i0.C114777a aVar = f.f344152a[i];
                i2 = aVar != null ? aVar.f344157e : 0;
            }
            if (i2 != 0) {
                StnLogic.stopTask(i2);
            }
            synchronized (f.f344152a) {
                if (f.f344152a[i] != null) {
                    try {
                        Log.m105925i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi stopTask outQueue: netId:%d hash:%d type:%d", Integer.valueOf(i2), Integer.valueOf(f.f344152a[i].f344153a.getType()), Integer.valueOf(f.f344152a[i].f344153a.mo174479o8()));
                        f.f344152a[i] = null;
                    } catch (RemoteException e) {
                        Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", Util.stackTraceToString(e));
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static long m161594k() {
        return Util.safeParseLong(C117731d.m166007c().mo182444f("clicfg_mars_auth_wakelock_ms", "1000", false, true), 1000);
    }

    /* renamed from: A3 */
    public C81039e mo54136A3() {
        return this.f344208n;
    }

    /* renamed from: B3 */
    public void mo54137B3(long j, long j2) {
        StnLogic.setSignallingStrategy(j, j2);
    }

    /* renamed from: D5 */
    public void mo54138D5() {
        StnLogic.startNetworkAnalysis();
    }

    /* renamed from: E5 */
    public String[] mo54139E5(boolean z) {
        return MMLogic.getIPsString(z);
    }

    /* renamed from: F3 */
    public String[] mo54140F3() {
        C114762a aVar = this.f344208n;
        if (aVar != null) {
            aVar.getClass();
            C114766b.C114767a aVar2 = C114762a.f344116x;
            return new String[]{aVar2.f344141b, aVar2.f344140a};
        }
        Log.m105928w("MicroMsg.MMAutoAuth", "accinfo is empty");
        return new String[2];
    }

    /* renamed from: H0 */
    public long mo54141H0() {
        return MMLogic.getMarsTimestamp();
    }

    /* renamed from: H1 */
    public void mo54142H1(String str) {
        f344200A = str;
    }

    /* renamed from: I4 */
    public void mo54143I4() {
        Log.appenderFlush();
    }

    /* renamed from: J3 */
    public void mo54144J3(C31566b bVar) {
        C114781l0.m161558e().f344173a = bVar;
    }

    /* renamed from: J4 */
    public void mo54145J4(boolean z) {
        MMLogic.reportV6Status(z);
    }

    /* renamed from: O0 */
    public int mo54146O0(String str, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, C40384w wVar) {
        return MMLogic.doLiveSpeedTest(str, i, i2, i3, i4, bArr, bArr2, wVar);
    }

    /* renamed from: O4 */
    public void mo54147O4(String str) {
        Log.m105918d("mmlogic", "receive command " + str);
        MMLogic.simpleTestCommand(str);
    }

    /* renamed from: Q */
    public void mo54148Q() {
        StnLogic.keepSignalling();
    }

    /* renamed from: Q2 */
    public void mo54149Q2(C114778k kVar) {
        this.f344219y = kVar;
    }

    /* renamed from: Q4 */
    public String mo54150Q4() {
        return MMLogic.getIspId();
    }

    /* renamed from: Rb */
    public void mo174489Rb(int i, int i2, int i3, String str, C114800v vVar, byte[] bArr) {
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        String str2 = str;
        C114800v vVar2 = vVar;
        byte[] bArr2 = bArr;
        Log.m105918d("MicroMsg.MMAutoAuth", "summerauth onGYNetEnd threadId: " + i5 + " errType: " + i6 + " errCode: " + i7 + " errMsg: " + str2 + " rr: " + vVar2 + " type: " + vVar.getType() + " netIdGetCertBeforeAutoAuth: " + this.f344212r);
        if (i5 < 0) {
            Log.m105928w("MicroMsg.MMAutoAuth", "send failed locally");
            return;
        }
        if (i7 != 0) {
            this.f344202e++;
        } else if (vVar.getType() != 10) {
            this.f344202e = 0;
        }
        C118181k respObj = vVar.getRespObj();
        int type = vVar.getType();
        int i8 = 4;
        String str3 = "";
        if (!(type == 126 || type == 252)) {
            if (type == 381) {
                if (i6 == 0 && i7 == 0) {
                    C101125b1.m132539g(vVar.getRespObj().mo182464SE(), vVar.getRespObj().mo182458Ct(), vVar.getRespObj().mo182457Bh());
                    this.f344211q = SystemClock.elapsedRealtime();
                }
                if (C90188n0.f258950r != 10003 || (i4 = C90188n0.f258951s) <= 0) {
                    i8 = i6;
                } else {
                    if (i4 <= 1) {
                        C90188n0.f258951s = 0;
                    }
                    C101125b1.m132539g(str3, str3, 0);
                    i7 = -1;
                }
                if (this.f344212r != -1) {
                    if (i8 == 0 && i7 == 0) {
                        vVar2.mo174463FG(this.f344209o, 0, 0);
                    }
                    this.f344212r = -1;
                    return;
                }
                return;
            } else if (!(type == 763 || type == 701 || type == 702)) {
                return;
            }
        }
        Log.m105925i("MicroMsg.MMAutoAuth", "summerauth end type: %d, ret:[%d,%d][%s]", Integer.valueOf(vVar.getType()), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (respObj.mo182462Om() == 0 && i6 == 0 && i7 == 0) {
            int zy = vVar.mo174485zy();
            Log.m105925i("MicroMsg.MMAutoAuth", "summerauth accinfo doAuthEnd type:%d, ret:%d loginDecodeFailedTry:%d", Integer.valueOf(vVar.getType()), Integer.valueOf(zy), Integer.valueOf(this.f344213s));
            if (zy != 2) {
                this.f344213s = 0;
                C118180j reqObj = vVar.getReqObj();
                try {
                    Log.m105925i("MicroMsg.MMAutoAuth", "summerauth accinfo %d: username:%s, wxusername:%s, ticket:%s, single session: %s client session:%s, server session:%s uin:%d", Integer.valueOf(vVar.getType()), reqObj.getUserName(), respObj.mo182456B(), Util.secPrint(Util.dumpHex(respObj.ou0())), Util.secPrint(Util.dumpHex(respObj.mo182463S(1))), Util.secPrint(Util.dumpHex(respObj.mo182463S(2))), Util.secPrint(Util.dumpHex(respObj.mo182463S(3))), Integer.valueOf(respObj.getUin()));
                    int uin = respObj.getUin();
                    byte[] ou02 = respObj.ou0();
                    String encodeHexString = Util.isNullOrNil(ou02) ? str3 : Util.encodeHexString(ou02);
                    if (!Util.isNullOrNil(bArr)) {
                        str3 = Util.encodeHexString(bArr);
                    }
                    if (mo174498p(encodeHexString, str3, uin)) {
                        this.f344208n.mo174414l(bArr2);
                        this.f344208n.f344117e = reqObj.getUserName();
                        this.f344208n.f344126q = respObj.mo182456B();
                        this.f344208n.mo54113X0(respObj.mo182463S(1), respObj.mo182463S(2), respObj.mo182463S(3), respObj.getUin());
                        this.f344208n.f344124o = respObj.mo182459D();
                        try {
                            mo174503v(respObj.mo182461Jg());
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.MMAutoAuth", e.getLocalizedMessage());
                        }
                        CrashReportFactory.setReportID(C77710q.m93738a(respObj.getUin()));
                        StnLogic.touchTasks();
                    } else {
                        C117407d.INSTANCE.idkeyStat(148, 35, 1, false);
                        Log.m105928w("MicroMsg.MMAutoAuth", "summerauth save serverid aak failed 2");
                    }
                    Log.m105924i("MicroMsg.MMAutoAuth", "summerauth decode and save ok!");
                } catch (RemoteException e2) {
                    Log.printErrStackTrace("MicroMsg.MMAutoAuth", e2, "summerauth save serverid aak failed 2 cookie:" + Util.encodeHexString(bArr), new Object[0]);
                    Log.appenderFlush();
                    throw e2;
                }
            } else if (vVar.getType() == 702 || vVar.getType() == 763) {
                C117407d.INSTANCE.idkeyStat(148, 34, 1, false);
                int i9 = this.f344213s + 1;
                this.f344213s = i9;
                if (i9 > 1) {
                    Log.m105928w("MicroMsg.MMAutoAuth", "summerauth loginDecodeFailedTry beyond 1 no more try!");
                    mo174495m(i6, i7, "auth_decode_failed_" + Util.nullAs(str2, str3));
                    return;
                }
                try {
                    int uin2 = respObj.getUin();
                    byte[] ou03 = respObj.ou0();
                    String encodeHexString2 = Util.isNullOrNil(ou03) ? str3 : Util.encodeHexString(ou03);
                    if (!Util.isNullOrNil(bArr)) {
                        str3 = Util.encodeHexString(bArr);
                    }
                    if (mo174498p(encodeHexString2, str3, uin2)) {
                        this.f344208n.mo174414l(bArr2);
                    } else {
                        Log.m105928w("MicroMsg.MMAutoAuth", "summerauth save serverid aak failed 1");
                    }
                    vVar2.mo174463FG(this.f344209o, 0, 0);
                } catch (RemoteException e3) {
                    Log.printErrStackTrace("MicroMsg.MMAutoAuth", e3, "summerauth save serverid aak failed 1 cookie:" + Util.encodeHexString(bArr), new Object[0]);
                    Log.appenderFlush();
                    throw e3;
                }
            }
        } else if (vVar.getType() == 126) {
            Log.m105920e("MicroMsg.MMAutoAuth", "net.end: reg err: type=" + vVar.getType() + " err=" + i6 + "," + i7 + " errmsg=" + str2);
        } else if (i7 == -2023 || i7 == -213 || i7 == -205 || i7 == -100) {
            MMApplicationContext.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
            if (i7 == -213) {
                C117407d.INSTANCE.idkeyStat(148, 31, 1, false);
            } else if (i7 == -100 || i7 == -2023) {
                C117407d.INSTANCE.idkeyStat(148, 32, 1, false);
            } else if (i7 == -205) {
                C117407d.INSTANCE.idkeyStat(148, 33, 1, false);
            }
        }
    }

    /* renamed from: S1 */
    public int mo54151S1(int[] iArr, boolean z, long j, int i, int i2, String str) {
        return ((Integer) new C114809f(2000, (Integer) null, i, i2, iArr, z, j, str).exec(this.f344214t)).intValue();
    }

    /* renamed from: S4 */
    public String mo54152S4() {
        return MMLogic.getNetworkServerIp();
    }

    /* renamed from: T0 */
    public void mo54153T0(boolean z) {
        new C81047j(3000, -1, z).exec(this.f344214t);
    }

    /* renamed from: T2 */
    public void mo54154T2(C40377j jVar) {
        MMLogic.addMMNetCommonCallback(jVar);
    }

    /* renamed from: T4 */
    public int mo54155T4(String str, boolean z, List<String> list) {
        return MMLogic.getSnsIpsForSceneWithHostName(list, str, z);
    }

    /* renamed from: U2 */
    public void mo54156U2(int i) {
        this.f344206i.lock(this.f344207j, String.format("MMAutoAuth.cancel,%d", new Object[]{Integer.valueOf(i)}));
        new C114810g(1000, (Object) null, i).exec(this.f344214t);
    }

    /* renamed from: Y5 */
    public void mo54157Y5(String str, String str2, String str3) {
        MMLogic.setNetIdAndIsp(str, str2, str3);
    }

    /* renamed from: Z5 */
    public C81040l mo55465Z5() {
        return null;
    }

    /* renamed from: a4 */
    public synchronized int mo54158a4(C114800v vVar, C114789o oVar) {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.send");
        return ((Integer) new C114812i(3000, -1, vVar, oVar).exec(this.f344214t)).intValue();
    }

    /* renamed from: b3 */
    public void mo54159b3(boolean z) {
        Log.m105919d("MicroMsg.MMAutoAuth", "summer setMMTLS enable[%b]", Boolean.valueOf(z));
        MMLogic.setMmtlsCtrlInfo(z);
    }

    /* renamed from: c4 */
    public void mo54160c4() {
        MMLogic.clearMMtlsForbidenHostAndPsk();
    }

    /* renamed from: d4 */
    public void mo54161d4(boolean z) {
        MMLogic.switchProcessActiveState(z);
    }

    /* renamed from: e4 */
    public void mo54162e4(boolean z) {
        MMLogic.forceUseV6(z);
    }

    /* renamed from: e5 */
    public void mo54163e5(String[] strArr, String[] strArr2, int[] iArr) {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.addHostInfo");
        new C114807d(1000, (Object) null, strArr, strArr2, iArr).exec(this.f344214t);
    }

    /* renamed from: f0 */
    public void mo54164f0(String str) {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.ipxxStatistics");
        new C114804a(1000, (Object) null, str).exec(this.f344214t);
    }

    public void finalize() {
        reset();
        super.finalize();
    }

    /* renamed from: g0 */
    public void mo54165g0(String str) {
        MMLogic.reportFailIp(str);
    }

    /* renamed from: g5 */
    public int mo54166g5(String str, long j, int i) {
        return MMLogic.ackActionNotify(str, j, i);
    }

    /* renamed from: h */
    public final int mo174491h(C114800v vVar, C114789o oVar) {
        if (C114781l0.m161559f().mo174428d()) {
            return -1;
        }
        C118180j reqObj = vVar.getReqObj();
        C114762a aVar = new C114762a(this);
        aVar.f344117e = reqObj.getUserName();
        int j = C114781l0.m161559f().mo174435j(vVar, oVar, aVar, 0);
        if (j < 0) {
            Log.m105920e("MicroMsg.MMAutoAuth", "auth: net.send err");
        } else {
            Log.m105924i("MicroMsg.MMAutoAuth", "auth: netid=" + j);
        }
        return j;
    }

    /* renamed from: h1 */
    public boolean mo54167h1() {
        return this.f344202e < 5;
    }

    public void hi0(C81044x xVar) {
        this.f344216v = xVar;
    }

    /* renamed from: i */
    public void mo174492i(int i, int i2, String str, C114800v vVar, byte[] bArr) {
        try {
            mo174489Rb(0, i, i2, str, vVar, bArr);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: i2 */
    public void mo54169i2(C114773i iVar) {
        this.f344217w = iVar;
    }

    /* renamed from: i5 */
    public String[] mo54170i5(String str) {
        MMLogic.NetworkIdInfo networkId = MMLogic.getNetworkId(str);
        String[] strArr = new String[3];
        if (networkId != null) {
            byte[] bArr = networkId.networkId;
            if (bArr != null) {
                strArr[0] = new String(bArr);
            } else {
                strArr[0] = "";
            }
            byte[] bArr2 = networkId.ctx;
            if (bArr2 != null) {
                strArr[1] = new String(bArr2);
            } else {
                strArr[1] = "";
            }
            byte[] bArr3 = networkId.clientIp;
            if (bArr3 != null) {
                strArr[2] = new String(bArr3);
            } else {
                strArr[2] = "";
            }
        } else {
            strArr[0] = "";
            strArr[1] = "";
            strArr[2] = "";
        }
        return strArr;
    }

    /* renamed from: j */
    public void mo174493j() {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.forceUpdateHostCache");
        new C114817o(3000, -1).exec(this.f344214t);
    }

    /* renamed from: j0 */
    public void mo54171j0(boolean z) {
        if (EventCenter.instance == null) {
            Log.m105928w("MicroMsg.MMAutoAuth", "loginevent but eventpool null, event:" + z);
        }
    }

    /* renamed from: j3 */
    public void mo54172j3(String str, String str2, int i) {
        MMLogic.setCgiDebugIP(str, str2, i);
    }

    /* renamed from: k1 */
    public void mo54173k1(String[] strArr, String[] strArr2, int[] iArr) {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.setHostInfo");
        if (strArr2 != null && strArr2.length > 0) {
            ((ArrayList) this.f344208n.f344130u).clear();
            for (String bytes : strArr2) {
                ((ArrayList) this.f344208n.f344130u).add(new String(bytes.getBytes()));
            }
        }
        new C114806c(1000, (Object) null, strArr, strArr2, iArr).exec(this.f344214t);
    }

    /* renamed from: l */
    public byte[] mo174494l() {
        byte[] bArr;
        if (!this.f344208n.mo54108G3()) {
            return null;
        }
        C89637y0 y0Var = new C89637y0();
        y0Var.f257861d = this.f344208n.f344122j;
        y0Var.f257858a = C118000d0.f352701a.mo182756a();
        y0Var.f257859b = C89618a.m112051a(MMApplicationContext.getContext());
        y0Var.f257860c = CrashReportFactory.foreground ? 1 : 2;
        MMLogic.NetworkIdInfo networkId = MMLogic.getNetworkId("synccheck");
        if (networkId == null || (bArr = networkId.networkId) == null) {
            Log.m105928w("MicroMsg.MMAutoAuth", "network id is empty");
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(bArr.length);
            byte[] bArr2 = networkId.ctx;
            objArr[1] = Integer.valueOf(bArr2 == null ? 0 : bArr2.length);
            Log.m105925i("MicroMsg.MMAutoAuth", "getnetworkid, id length: %d, ctx length %d,", objArr);
            y0Var.f257863f = networkId.networkId;
            byte[] bArr3 = networkId.ctx;
            if (bArr3 != null) {
                y0Var.f257865h = bArr3;
                y0Var.f257864g = bArr3.length;
            } else {
                y0Var.f257864g = 0;
            }
        }
        try {
            byte[] protoBuf = y0Var.toProtoBuf();
            this.f344218x = y0Var.f257862e;
            return protoBuf;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMAutoAuth", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: l3 */
    public void mo54174l3(boolean z) {
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
    }

    /* renamed from: m */
    public final void mo174495m(int i, int i2, String str) {
        int i3;
        int i4 = i;
        int i5 = i2;
        String str2 = str;
        Log.m105924i("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail inErrType=" + i4 + ", inErrCode=" + i5 + ", errMsg=" + str2 + " stack=" + Util.getStack());
        int i6 = -3;
        if (i4 == 4 && (i5 == -106 || i5 == -3 || i5 == -5)) {
            Log.m105921e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth errCode %s should be transfer to MM_ERR_AUTH_ANOTHERPLACE", Integer.valueOf(i2));
            i3 = -100;
        } else {
            i3 = i5;
        }
        if (i4 == 5 && i5 == -13) {
            Log.m105920e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth should not be return MM_ERR_SESSIONTIMEOUT trans to MM_ERR_PASSWORD");
            C117407d.INSTANCE.idkeyStat(148, 42, 1, false);
            i4 = 4;
        } else {
            i6 = i3;
        }
        if ((i4 == 6 && i5 == -10001) || (i4 == 5 && i5 != -13)) {
            Log.m105920e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp");
            SharedPreferences a = C7627m3.m7760a();
            String string = a.getString("_auth_key", "");
            String string2 = a.getString("server_id", "");
            if (Util.isNullOrNil(string) && Util.isNullOrNil(string2)) {
                Log.m105920e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp aak and cookie null logout");
                i6 = -104;
                C117407d.INSTANCE.idkeyStat(148, 52, 1, false);
                i4 = 4;
            }
        }
        C114781l0.m161559f().mo174426b(i4, i6, str2);
        if (i4 != 4) {
            return;
        }
        if (i6 == -100 || i6 == -2023 || i6 == -205 || i6 == -213) {
            MMApplicationContext.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
            reset();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: n */
    public boolean mo174496n(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            int r0 = sf0.C90188n0.f258950r
            r3 = 0
            r4 = 10001(0x2711, float:1.4014E-41)
            if (r4 != r0) goto L_0x0014
            int r0 = sf0.C90188n0.f258951s
            if (r0 <= 0) goto L_0x0014
            sf0.C90188n0.f258951s = r3
            r20.mo174500s()
        L_0x0014:
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r4 = "summerdiz makeSureAuth host[%s]"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r6)
            com.tencent.mm.network.a r0 = r1.f344208n
            boolean r4 = r0.mo54127q3(r2)
            if (r4 != 0) goto L_0x002a
            goto L_0x003e
        L_0x002a:
            byte[] r4 = r0.mo54109J2(r2)
            byte[] r0 = r0.mo54117f2(r2)
            if (r4 == 0) goto L_0x003e
            int r4 = r4.length
            if (r4 <= 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length
            if (r0 <= 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "axauth axsession exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r5
        L_0x0049:
            com.tencent.mm.network.a r0 = r1.f344208n
            boolean r0 = r0.mo54127q3(r2)
            r4 = 2
            r6 = 100
            r7 = 0
            r9 = 0
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r10 = "axauth the host [%s] is axhost but no axsessionkey"
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r10, r11)
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 148(0x94, double:7.3E-322)
            r15 = 139(0x8b, double:6.87E-322)
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            com.tencent.mm.network.i0 r10 = com.tencent.p014mm.network.C114781l0.m161559f()
            com.tencent.mm.network.i0$a[] r11 = r10.f344152a
            monitor-enter(r11)
            r12 = 0
        L_0x0077:
            if (r12 >= r6) goto L_0x00ab
            com.tencent.mm.network.i0$a[] r0 = r10.f344152a     // Catch:{ RemoteException -> 0x008e }
            r0 = r0[r12]     // Catch:{ RemoteException -> 0x008e }
            if (r0 == 0) goto L_0x00a8
            com.tencent.mm.network.v r0 = r0.f344153a     // Catch:{ RemoteException -> 0x008e }
            qe3.j r0 = r0.getReqObj()     // Catch:{ RemoteException -> 0x008e }
            boolean r0 = r0.isAxAuth()     // Catch:{ RemoteException -> 0x008e }
            if (r0 == 0) goto L_0x00a8
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            r0 = 1
            goto L_0x00ad
        L_0x008e:
            r0 = move-exception
            com.tencent.mm.network.i0$a[] r13 = r10.f344152a     // Catch:{ all -> 0x00f7 }
            r13[r12] = r9     // Catch:{ all -> 0x00f7 }
            java.lang.String r13 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r14 = "exception:%s, remove index:%d"
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x00f7 }
            r15[r3] = r0     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00f7 }
            r15[r5] = r0     // Catch:{ all -> 0x00f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r14, r15)     // Catch:{ all -> 0x00f7 }
        L_0x00a8:
            int r12 = r12 + 1
            goto L_0x0077
        L_0x00ab:
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            r0 = 0
        L_0x00ad:
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "NetsceneAxAuth already has axauth cmd"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            return r3
        L_0x00b7:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r12 = 46000(0xb3b0, double:2.2727E-319)
            long r14 = r1.f344220z
            long r16 = r10 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00e0
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e0
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "axauth time limit, last time [%d], current time is [%d]"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r4[r3] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r4[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r4)
            return r3
        L_0x00e0:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r1.f344220z = r10
            r20.mo174500s()
            kj2.d r12 = kj2.C117407d.INSTANCE
            r13 = 148(0x94, double:7.3E-322)
            r15 = 140(0x8c, double:6.9E-322)
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x00fa
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f7 }
            throw r0
        L_0x00fa:
            com.tencent.mm.network.a r0 = r1.f344208n
            boolean r0 = r0.mo54108G3()
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "make sure auth isLogin"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            return r5
        L_0x010a:
            com.tencent.mm.network.i0 r0 = com.tencent.p014mm.network.C114781l0.m161559f()
            boolean r0 = r0.mo174428d()
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth hasAuthCmd ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r3
        L_0x011c:
            int r0 = r1.f344212r
            r10 = -1
            if (r0 == r10) goto L_0x0129
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth auto limit now is getting cert, ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            return r3
        L_0x0129:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r12 = 30000(0x7530, double:1.4822E-319)
            if (r2 == 0) goto L_0x0159
            int r0 = r21.length()
            if (r0 <= 0) goto L_0x0159
            long r14 = r1.f344203f
            long r16 = r10 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0159
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0159
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth auto limit lastAutoAuthtime=%d, curtime=%d, return false"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r4[r3] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r4[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r4)
            return r3
        L_0x0159:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "auth_hold_prefs"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            java.lang.String r2 = "auth_ishold"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth AUTH_HOLD_KEY hold ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.network.i0 r2 = com.tencent.p014mm.network.C114781l0.m161559f()
            com.tencent.mm.network.i0$a[] r14 = r2.f344152a
            monitor-enter(r14)
            r7 = 0
        L_0x017a:
            if (r7 >= r6) goto L_0x01d4
            com.tencent.mm.network.i0$a[] r0 = r2.f344152a     // Catch:{ RemoteException -> 0x01b7 }
            r0 = r0[r7]     // Catch:{ RemoteException -> 0x01b7 }
            if (r0 == 0) goto L_0x01d1
            r8 = 1000(0x3e8, float:1.401E-42)
            com.tencent.mm.network.v r0 = r0.f344153a     // Catch:{ RemoteException -> 0x01b7 }
            int r0 = r0.getType()     // Catch:{ RemoteException -> 0x01b7 }
            if (r8 != r0) goto L_0x01d1
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01b7 }
            r8.<init>()     // Catch:{ RemoteException -> 0x01b7 }
            java.lang.String r10 = "hasWithoutLoginCmd inQueue: netid="
            r8.append(r10)     // Catch:{ RemoteException -> 0x01b7 }
            r8.append(r7)     // Catch:{ RemoteException -> 0x01b7 }
            java.lang.String r10 = " type="
            r8.append(r10)     // Catch:{ RemoteException -> 0x01b7 }
            com.tencent.mm.network.i0$a[] r10 = r2.f344152a     // Catch:{ RemoteException -> 0x01b7 }
            r10 = r10[r7]     // Catch:{ RemoteException -> 0x01b7 }
            com.tencent.mm.network.v r10 = r10.f344153a     // Catch:{ RemoteException -> 0x01b7 }
            int r10 = r10.getType()     // Catch:{ RemoteException -> 0x01b7 }
            r8.append(r10)     // Catch:{ RemoteException -> 0x01b7 }
            java.lang.String r8 = r8.toString()     // Catch:{ RemoteException -> 0x01b7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r8)     // Catch:{ RemoteException -> 0x01b7 }
            monitor-exit(r14)     // Catch:{ all -> 0x01ff }
            r0 = 1
            goto L_0x01d6
        L_0x01b7:
            r0 = move-exception
            com.tencent.mm.network.i0$a[] r8 = r2.f344152a     // Catch:{ all -> 0x01ff }
            r8[r7] = r9     // Catch:{ all -> 0x01ff }
            java.lang.String r8 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r10 = "exception:%s, remove index:%d"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x01ff }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x01ff }
            r11[r3] = r0     // Catch:{ all -> 0x01ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01ff }
            r11[r5] = r0     // Catch:{ all -> 0x01ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r10, r11)     // Catch:{ all -> 0x01ff }
        L_0x01d1:
            int r7 = r7 + 1
            goto L_0x017a
        L_0x01d4:
            monitor-exit(r14)     // Catch:{ all -> 0x01ff }
            r0 = 0
        L_0x01d6:
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "sendImp hit push hold, pid:%d, stack[%s]"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r6 = android.os.Process.myPid()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r3] = r6
            com.tencent.mm.sdk.platformtools.MMStack r6 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r4[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r4)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.network.C114781l0.m161556c()
            com.tencent.mm.network.y$b r2 = new com.tencent.mm.network.y$b
            r2.<init>()
            r0.post(r2)
        L_0x01fe:
            return r3
        L_0x01ff:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01ff }
            throw r0
        L_0x0202:
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "make sure auth"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            com.tencent.mm.network.i0 r2 = com.tencent.p014mm.network.C114781l0.m161559f()
            com.tencent.mm.network.x r0 = r1.f344216v
            if (r0 != 0) goto L_0x0213
        L_0x0211:
            r4 = 0
            goto L_0x0218
        L_0x0213:
            boolean r0 = r0.mo112343iD()     // Catch:{ Exception -> 0x0211 }
            r4 = r0
        L_0x0218:
            com.tencent.mm.network.i0$a[] r14 = r2.f344152a
            monitor-enter(r14)
            r16 = r9
            r15 = 0
        L_0x021e:
            if (r15 >= r6) goto L_0x02cf
            com.tencent.mm.network.i0$a[] r0 = r2.f344152a     // Catch:{ all -> 0x0340 }
            r0 = r0[r15]     // Catch:{ all -> 0x0340 }
            if (r0 != 0) goto L_0x0228
            goto L_0x02c6
        L_0x0228:
            if (r4 == 0) goto L_0x0234
            com.tencent.mm.network.v r6 = r0.f344153a     // Catch:{ RemoteException -> 0x0231 }
            boolean r6 = r6 instanceof com.tencent.p014mm.network.C114800v.C114801a     // Catch:{ RemoteException -> 0x0231 }
            if (r6 != 0) goto L_0x02c6
            goto L_0x0234
        L_0x0231:
            r0 = move-exception
            goto L_0x02b7
        L_0x0234:
            if (r4 != 0) goto L_0x023e
            com.tencent.mm.network.v r6 = r0.f344153a     // Catch:{ RemoteException -> 0x0231 }
            boolean r6 = r6 instanceof com.tencent.p014mm.network.C114800v.C114801a     // Catch:{ RemoteException -> 0x0231 }
            if (r6 != 0) goto L_0x023e
            goto L_0x02c6
        L_0x023e:
            r6 = 252(0xfc, float:3.53E-43)
            com.tencent.mm.network.v r0 = r0.f344153a     // Catch:{ RemoteException -> 0x0231 }
            int r0 = r0.getType()     // Catch:{ RemoteException -> 0x0231 }
            if (r6 == r0) goto L_0x028c
            r0 = 701(0x2bd, float:9.82E-43)
            com.tencent.mm.network.i0$a[] r6 = r2.f344152a     // Catch:{ RemoteException -> 0x0231 }
            r6 = r6[r15]     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.mm.network.v r6 = r6.f344153a     // Catch:{ RemoteException -> 0x0231 }
            int r6 = r6.getType()     // Catch:{ RemoteException -> 0x0231 }
            if (r0 == r6) goto L_0x028c
            r0 = 763(0x2fb, float:1.069E-42)
            com.tencent.mm.network.i0$a[] r6 = r2.f344152a     // Catch:{ RemoteException -> 0x0231 }
            r6 = r6[r15]     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.mm.network.v r6 = r6.f344153a     // Catch:{ RemoteException -> 0x0231 }
            int r6 = r6.getType()     // Catch:{ RemoteException -> 0x0231 }
            if (r0 == r6) goto L_0x028c
            r0 = 702(0x2be, float:9.84E-43)
            com.tencent.mm.network.i0$a[] r6 = r2.f344152a     // Catch:{ RemoteException -> 0x0231 }
            r6 = r6[r15]     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.mm.network.v r6 = r6.f344153a     // Catch:{ RemoteException -> 0x0231 }
            int r6 = r6.getType()     // Catch:{ RemoteException -> 0x0231 }
            if (r0 == r6) goto L_0x028c
            r0 = 3941(0xf65, float:5.523E-42)
            com.tencent.mm.network.i0$a[] r6 = r2.f344152a     // Catch:{ RemoteException -> 0x0231 }
            r6 = r6[r15]     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.mm.network.v r6 = r6.f344153a     // Catch:{ RemoteException -> 0x0231 }
            int r6 = r6.getType()     // Catch:{ RemoteException -> 0x0231 }
            if (r0 != r6) goto L_0x0281
            goto L_0x028c
        L_0x0281:
            if (r16 != 0) goto L_0x02c6
            com.tencent.mm.network.i0$a[] r0 = r2.f344152a     // Catch:{ all -> 0x0340 }
            r0 = r0[r15]     // Catch:{ all -> 0x0340 }
            com.tencent.mm.network.v r0 = r0.f344153a     // Catch:{ all -> 0x0340 }
            r16 = r0
            goto L_0x02c6
        L_0x028c:
            java.lang.String r0 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0231 }
            r6.<init>()     // Catch:{ RemoteException -> 0x0231 }
            java.lang.String r9 = "getAutoAuthRR Auth inQueue: netid="
            r6.append(r9)     // Catch:{ RemoteException -> 0x0231 }
            r6.append(r15)     // Catch:{ RemoteException -> 0x0231 }
            java.lang.String r9 = " type="
            r6.append(r9)     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.mm.network.i0$a[] r9 = r2.f344152a     // Catch:{ RemoteException -> 0x0231 }
            r9 = r9[r15]     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.mm.network.v r9 = r9.f344153a     // Catch:{ RemoteException -> 0x0231 }
            int r9 = r9.getType()     // Catch:{ RemoteException -> 0x0231 }
            r6.append(r9)     // Catch:{ RemoteException -> 0x0231 }
            java.lang.String r6 = r6.toString()     // Catch:{ RemoteException -> 0x0231 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ RemoteException -> 0x0231 }
            monitor-exit(r14)     // Catch:{ all -> 0x0340 }
            r0 = 0
            goto L_0x02d2
        L_0x02b7:
            java.lang.String r6 = "MicroMsg.MMNativeNetTaskAdapter"
            java.lang.String r9 = "exception:%s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0340 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0340 }
            r7[r3] = r0     // Catch:{ all -> 0x0340 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r9, r7)     // Catch:{ all -> 0x0340 }
        L_0x02c6:
            int r15 = r15 + 1
            r6 = 100
            r7 = 0
            r9 = 0
            goto L_0x021e
        L_0x02cf:
            monitor-exit(r14)     // Catch:{ all -> 0x0340 }
            r0 = r16
        L_0x02d2:
            if (r0 == 0) goto L_0x0331
            boolean r2 = r0 instanceof com.tencent.p014mm.network.C114800v.C114801a     // Catch:{ RemoteException -> 0x0320 }
            if (r2 == 0) goto L_0x0304
            long r6 = r1.f344205h     // Catch:{ RemoteException -> 0x0320 }
            long r10 = r10 - r6
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x02ed
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ed
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth session time out in push_notify mode, but hit limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ RemoteException -> 0x0320 }
            return r3
        L_0x02ed:
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth session time out in push_notify mode, send broast to mm"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ RemoteException -> 0x0320 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RemoteException -> 0x0320 }
            r1.f344205h = r6     // Catch:{ RemoteException -> 0x0320 }
            com.tencent.mm.network.g0 r0 = com.tencent.p014mm.network.C114781l0.m161557d()     // Catch:{ RemoteException -> 0x0320 }
            r2 = 5
            r4 = 0
            r0.mo174420a(r2, r4)     // Catch:{ RemoteException -> 0x0320 }
            goto L_0x0338
        L_0x0304:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RemoteException -> 0x0320 }
            r1.f344203f = r6     // Catch:{ RemoteException -> 0x0320 }
            java.lang.String r2 = "MicroMsg.MMAutoAuth"
            java.lang.String r4 = "makeSureAuth rest lastAutoAuthTime[%d]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ RemoteException -> 0x0320 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ RemoteException -> 0x0320 }
            r8[r3] = r6     // Catch:{ RemoteException -> 0x0320 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r8)     // Catch:{ RemoteException -> 0x0320 }
            r2 = 3
            com.tencent.mm.network.y$p r4 = r1.f344209o     // Catch:{ RemoteException -> 0x0320 }
            r0.mo174463FG(r4, r2, r2)     // Catch:{ RemoteException -> 0x0320 }
            goto L_0x0338
        L_0x0320:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.MMAutoAuth"
            java.lang.String r4 = "makeSureAuth exception:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)
            goto L_0x0338
        L_0x0331:
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth getAutoAuthRR is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x0338:
            java.lang.String r0 = "MicroMsg.MMAutoAuth"
            java.lang.String r2 = "makeSureAuth at last ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return r3
        L_0x0340:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0340 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C114803y.mo174496n(java.lang.String):boolean");
    }

    /* renamed from: n1 */
    public void mo54175n1(boolean z, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, String str3, String str4) {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.setIDCHostInfo");
        f344201B = str3;
        List<C89623b0> d = C89623b0.m112055d(str2);
        List<C89623b0> d2 = C89623b0.m112055d(str);
        Object[] objArr = new Object[7];
        objArr[0] = str3;
        objArr[1] = str;
        objArr[2] = Integer.valueOf(((LinkedList) d2).size());
        objArr[3] = str4;
        objArr[4] = str2;
        objArr[5] = Integer.valueOf(((LinkedList) d).size());
        objArr[6] = z ? "!!!!!CHANGE IDC NOW" : "false";
        Log.m105919d("MicroMsg.MMAutoAuth", "dkidc setIDCHostInfo short:[%s][%s](%d) long:[%s][%s](%d) reset:%s", objArr);
        HashMap hashMap = new HashMap();
        for (C89623b0 next : d) {
            ArrayList arrayList = (ArrayList) hashMap.get(next.f257831d);
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(next.f257831d, arrayList);
            }
            arrayList.add(next.f257830c);
        }
        HashMap hashMap2 = new HashMap();
        for (C89623b0 next2 : d2) {
            ArrayList arrayList2 = (ArrayList) hashMap2.get(next2.f257831d);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(next2.f257831d, arrayList2);
            }
            arrayList2.add(next2.f257830c);
        }
        new C114813k(3000, -1, hashMap, iArr2, hashMap2, iArr).exec(this.f344214t);
    }

    /* renamed from: n3 */
    public void mo54176n3(C89619a1 a1Var) {
        C114776i0 f = C114781l0.m161559f();
        f.getClass();
        for (int i = 0; i < 100; i++) {
            try {
                C114776i0.C114777a aVar = f.f344152a[i];
                if (aVar != null) {
                    aVar.f344153a.getType();
                }
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", Util.stackTraceToString(e), Integer.valueOf(i));
                f.f344152a[i] = null;
            }
        }
    }

    /* renamed from: n4 */
    public void mo54177n4(int i) {
        MMLogic.setMMtlsRegion(i);
    }

    /* renamed from: o */
    public final void mo174497o(List<String> list, List<String> list2, List<Integer> list3, C52114yg2 yg22) {
        LinkedList<C51693vg2> linkedList;
        if (yg22 == null || (linkedList = yg22.f145277e) == null || linkedList.size() == 0) {
            Log.m105928w("MicroMsg.MMAutoAuth", "host list size is zero");
            return;
        }
        Log.m105925i("MicroMsg.MMAutoAuth", "autoauth parse hostlist size [%d]", Integer.valueOf(yg22.f145277e.size()));
        Iterator<C51693vg2> it = yg22.f145277e.iterator();
        while (it.hasNext()) {
            C51693vg2 next = it.next();
            Log.m105925i("MicroMsg.MMAutoAuth", "parse hostlist host org:%s sub:%s", next.f143479d, next.f143480e);
            list.add(next.f143479d);
            list2.add(next.f143480e);
            list3.add(Integer.valueOf(next.f143481f));
        }
    }

    /* renamed from: o4 */
    public int mo54178o4() {
        return MMLogic.getMMtlsRegion();
    }

    /* renamed from: p */
    public final boolean mo174498p(String str, String str2, int i) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(str3 == null ? -1 : str.length());
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.MMAutoAuth", "summerauths saveAAKAndCookieToSp aak[%s] uin[%s]", objArr);
        MMApplicationContext.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().remove("auth_ishold").commit();
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4);
        boolean z = sharedPreferences.getBoolean("key_auth_info_prefs_created", false);
        int i3 = sharedPreferences.getInt("key_auth_update_version", 0);
        int i4 = sharedPreferences.getInt("_auth_uin", 0);
        String string = sharedPreferences.getString("_auth_key", "");
        String string2 = sharedPreferences.getString("server_id", "");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("key_auth_info_prefs_created", true);
        edit.putInt("key_auth_update_version", C89625d.f257841g);
        edit.putInt("_auth_uin", i2);
        edit.putString("_auth_key", str3);
        edit.putString("server_id", str4);
        if (!edit.commit()) {
            Log.m105920e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 1th!");
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(148, 36, 1, false);
            if (!edit.commit()) {
                Log.m105920e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2nd!");
                dVar.idkeyStat(148, 37, 1, false);
                Log.m105921e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2th so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", Boolean.valueOf(z), Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Boolean.TRUE, Integer.valueOf(i3), Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(C89625d.f257841g), Integer.valueOf(i4), Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), Integer.valueOf(i), string, sharedPreferences.getString("_auth_key", ""), str3, string2, sharedPreferences.getString("server_id", ""), str4);
                Log.appenderFlush();
                return false;
            }
        }
        boolean z2 = sharedPreferences.getBoolean("key_auth_info_prefs_created", false);
        int i5 = sharedPreferences.getInt("key_auth_update_version", 0);
        int i6 = sharedPreferences.getInt("_auth_uin", 0);
        String string3 = sharedPreferences.getString("_auth_key", "");
        String string4 = sharedPreferences.getString("server_id", "");
        if (!z2 || i5 != C89625d.f257841g || i6 != i2 || !string3.equals(str3) || !string4.equals(str4)) {
            Log.m105921e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed check not equal so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.TRUE, Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(C89625d.f257841g), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i), string, string3, str3, string2, string4, str4);
            Log.appenderFlush();
            return false;
        }
        C85798u1 u1Var = this.f344215u;
        synchronized (u1Var) {
            try {
                u1Var.f249887h = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f344215u.mo119664f(1, Integer.valueOf(C89625d.f257841g));
        this.f344215u.mo119664f(2, Integer.valueOf(i));
        this.f344215u.mo119664f(3, str3);
        this.f344215u.mo119664f(4, str4);
        C85798u1 u1Var2 = this.f344215u;
        synchronized (u1Var2) {
            u1Var2.f249887h = false;
            u1Var2.mo119669j();
        }
        Log.m105925i("MicroMsg.MMAutoAuth", "summerauth save aak & id ok old vs new vs input[%b, %b, %b, %b] version[%d, %d, %d. %d], uin[%d, %d, %d, %d], aak[%s, %s, %s, %s], cookie[%s, %s, %s, %s]", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.TRUE, Boolean.valueOf(!this.f344215u.f249883d), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(C89625d.f257841g), (Integer) this.f344215u.mo119660a(1), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i), (Integer) this.f344215u.mo119660a(2), string, string3, str3, (String) this.f344215u.mo119660a(3), string2, string4, str4, (String) this.f344215u.mo119660a(4));
        return true;
    }

    /* renamed from: q */
    public void mo54179q() {
        StnLogic.stopSignalling();
    }

    /* renamed from: r */
    public void mo174499r(String str, String str2) {
        C114762a aVar = this.f344208n;
        if (aVar != null) {
            aVar.getClass();
            try {
                Log.m105924i("MicroMsg.AccInfo", "saveBackUpCgiSignKeys " + str.length() + " " + str2.length());
                C114766b.C114767a aVar2 = C114762a.f344116x;
                aVar2.f344141b = str;
                aVar2.f344140a = str2;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AccInfo", e.getLocalizedMessage());
            }
        } else {
            Log.m105928w("MicroMsg.MMAutoAuth", "accinfo is empty");
        }
    }

    /* renamed from: r3 */
    public void mo54180r3() {
        StnLogic.makesureLongLinkConnected();
    }

    public void reset() {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.reset");
        new C114811h(1000, (Object) null).exec(this.f344214t);
    }

    /* renamed from: s */
    public boolean mo174500s() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f344204g;
        if (90000 >= elapsedRealtime - j) {
            Log.m105929w("MicroMsg.MMAutoAuth", "auto limit lastSessionTimeout=%d, curtime=%d", Long.valueOf(j), Long.valueOf(SystemClock.elapsedRealtime()));
            return false;
        }
        this.f344204g = SystemClock.elapsedRealtime();
        C114762a aVar = this.f344208n;
        aVar.mo54113X0(new byte[0], new byte[0], new byte[0], aVar.f344122j);
        this.f344208n.mo54123j1();
        return true;
    }

    /* renamed from: s5 */
    public void mo54182s5(String str) {
        MMLogic.setDebugHost(str);
    }

    /* renamed from: t */
    public void mo174501t(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(new String[0])) {
            new C114816n(1000, (Object) null, str, str2).exec(this.f344214t);
        }
    }

    /* renamed from: t0 */
    public void mo54183t0(String str) {
        Log.m105921e("MicroMsg.MMAutoAuth", "killPush %s", str);
    }

    /* renamed from: u */
    public void mo174502u(String str, String str2, String str3, String str4) {
        this.f344206i.lock(this.f344207j, "MMAutoAuth.setFixedHost");
        Log.m105925i("MicroMsg.MMAutoAuth", "dkidc setFixedHost debug short:%s:%s long:%s:%s", str, str2, str3, str4);
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str3)) {
            Log.m105928w("MicroMsg.MMAutoAuth", "dkidc setFixedHost FAILED ! check assist");
        } else {
            new C114814l(3000, -1, str, str2, str3, str4).exec(this.f344214t);
        }
    }

    /* renamed from: v */
    public final void mo174503v(byte[] bArr) {
        LinkedList<C64724t8> linkedList;
        C49510g33 g332;
        Log.m105924i("MicroMsg.MMAutoAuth", "autoauth parseHostInfo");
        if (bArr != null) {
            xk4 xk4 = new xk4();
            try {
                xk4.parseFrom(bArr);
                int i = xk4.f354537d;
                int i2 = 0;
                if (!((i & 4) == 0 || (g332 = xk4.f354540g) == null)) {
                    Log.m105924i("MicroMsg.MMAutoAuth", "autoauth start to parse main hostlist");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    mo174497o(arrayList, arrayList2, arrayList3, g332.f133826d);
                    int size = arrayList.size();
                    String[] strArr = new String[size];
                    String[] strArr2 = new String[arrayList2.size()];
                    int[] iArr = new int[arrayList3.size()];
                    arrayList.toArray(strArr);
                    arrayList2.toArray(strArr2);
                    Iterator it = arrayList3.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        iArr[i3] = ((Integer) arrayList3.get(((Integer) it.next()).intValue())).intValue();
                        i3++;
                    }
                    Log.m105925i("MicroMsg.MMAutoAuth", "after parse main host list size [%d]", Integer.valueOf(size));
                    mo54173k1(strArr, strArr2, iArr);
                }
                if ((i & 8) != 0) {
                    Log.m105924i("MicroMsg.MMAutoAuth", "autoauth start to parse ax hostlist");
                    C64747u8 u8Var = xk4.f354541h;
                    if (u8Var == null || u8Var.f185721d == 0 || (linkedList = u8Var.f185722e) == null || linkedList.size() == 0) {
                        Log.m105928w("MicroMsg.MMAutoAuth", "ax host list is null");
                        return;
                    }
                    Log.m105925i("MicroMsg.MMAutoAuth", "ax host list size [%d]", Integer.valueOf(u8Var.f185721d));
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    LinkedList<C64724t8> linkedList2 = u8Var.f185722e;
                    if (linkedList2 != null) {
                        Iterator<C64724t8> it4 = linkedList2.iterator();
                        while (it4.hasNext()) {
                            mo174497o(arrayList4, arrayList5, arrayList6, it4.next().f185509f);
                        }
                    }
                    Log.m105925i("MicroMsg.MMAutoAuth", "after parse ax host list size [%d]", Integer.valueOf(arrayList4.size()));
                    if (arrayList4.size() > 0) {
                        String[] strArr3 = new String[arrayList4.size()];
                        String[] strArr4 = new String[arrayList5.size()];
                        int[] iArr2 = new int[arrayList6.size()];
                        arrayList4.toArray(strArr3);
                        arrayList5.toArray(strArr4);
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            iArr2[i2] = ((Integer) arrayList6.get(((Integer) it5.next()).intValue())).intValue();
                            i2++;
                        }
                        mo54163e5(strArr3, strArr4, iArr2);
                    }
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MMAutoAuth", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: v5 */
    public int mo54184v5(String str, int i, long j, String str2, String str3) {
        return ((Integer) new C114808e(2000, (Integer) null, str, i, j, str2, str3).exec(this.f344214t)).intValue();
    }

    /* renamed from: w */
    public void mo174504w(String str, String str2) {
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            new C114815m(1000, (Object) null, str, str2).exec(this.f344214t);
        } else {
            Log.m105918d("MicroMsg.MMAutoAuth", "setNewDnsDebugHost FAILED ! check assist");
        }
    }

    /* renamed from: w3 */
    public int mo54185w3(String str, List<String> list) {
        return MMLogic.getHostByName(str, list);
    }

    public C81040l yu0() {
        return C114781l0.m161560g();
    }

    /* renamed from: A3 */
    public C26879f m161596A3() {
        return this.f344208n;
    }
}
