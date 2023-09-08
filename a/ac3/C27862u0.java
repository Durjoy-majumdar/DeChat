package ac3;

import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.autogen.mmdata.rpt.WeVisionModelResStruct;
import com.tencent.p014mm.plugin.xlabeffect.WeVisUpdateReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import p523fp.C32147e;
import qr3.C110470e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk2.C101643c;
import sx3.C110818d0;
import sx3.C36907w;
import te3.a05;
import te3.b05;
import zt3.C119157j;

/* renamed from: ac3.u0 */
public final class C27862u0 {

    /* renamed from: a */
    public static final C27862u0 f77002a;

    /* renamed from: b */
    public static final C13601g f77003b = C36568h.m40985a(C27863a.f77009d);

    /* renamed from: c */
    public static final LinkedList<C27848d1> f77004c = new LinkedList<>();

    /* renamed from: d */
    public static final a05 f77005d = new a05();

    /* renamed from: e */
    public static a05 f77006e = new a05();

    /* renamed from: f */
    public static final LinkedList<Integer> f77007f = new LinkedList<>();

    /* renamed from: g */
    public static final LinkedHashSet<String> f77008g = new LinkedHashSet<>();

    /* renamed from: ac3.u0$a */
    public static final class C27863a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C27863a f77009d = new C27863a();

        public C27863a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_wevision_model_info_cgi, true));
        }
    }

    /* renamed from: ac3.u0$b */
    public static final class C27864b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public static final C27864b<_Ret, _Var> f77010a = new C27864b<>();

        public Object call(Object obj) {
            String AD;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C32147e.class;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            a05 a05 = (a05) cVar.f256796d;
            Log.m105924i("MicroMsg.WeVisModelMgr", "CgiWeVisGetModel: " + i + ", " + i2);
            if (i == 0 && i2 == 0) {
                C27862u0 u0Var = C27862u0.f77002a;
                C87412m.m108593f(a05, "resp");
                C27862u0.f77006e = a05;
                C27862u0.f77002a.mo55647b().encode("target_info", C61926c.m72699x(C27862u0.f77006e));
                LinkedList<b05> linkedList = a05.f130188d;
                C87412m.m108593f(linkedList, "resp.NewConfigList");
                for (b05 b05 : linkedList) {
                    String e6 = ((C32147e) C86312j.m106911c(cls)).mo58513e6(b05.f130875d, b05.f130876e);
                    Log.m105924i("MicroMsg.WeVisModelMgr", "resp: " + b05.f130875d + '.' + b05.f130876e + ", " + b05.f130877f + ", " + e6 + ", " + b05.f130878g);
                }
                LinkedList<b05> linkedList2 = C27862u0.f77006e.f130188d;
                C87412m.m108593f(linkedList2, "targetModelInfo.NewConfigList");
                for (b05 b052 : linkedList2) {
                    if (!C86013q1.m106450k(C91992q0.f263334d + XVFSFile.SEPARATOR_CHAR + b052.f130875d + '.' + b052.f130876e + XVFSFile.SEPARATOR_CHAR + b052.f130878g) && (AD = ((C32147e) C86312j.m106911c(cls)).mo58507AD(b052.f130875d, b052.f130876e)) != null) {
                        String e64 = ((C32147e) C86312j.m106911c(cls)).mo58513e6(b052.f130875d, b052.f130876e);
                        if (C87412m.m108589b(b052.f130877f, e64)) {
                            Log.m105924i("MicroMsg.WeVisModelMgr", "checkCopyResFile: get cached " + b052.f130875d + '.' + b052.f130876e + ", " + AD);
                            C27862u0.f77002a.mo55646a(b052.f130875d, b052.f130876e, AD);
                        } else {
                            Log.m105928w("MicroMsg.WeVisModelMgr", "checkCopyResFile: cached md5 mismatch res:" + e64 + ", config:" + b052.f130877f);
                        }
                    }
                }
                C27862u0 u0Var2 = C27862u0.f77002a;
                u0Var2.mo55651f();
                u0Var2.mo55652g();
                u0Var2.mo55647b().putLong("cgi_time", Util.nowMilliSecond());
                C27855h1.f76992a.mo55644c();
                StringBuilder sb = new StringBuilder();
                sb.append("checkRes: [");
                LinkedList<Integer> linkedList3 = C27862u0.f77007f;
                sb.append(C110818d0.m150921S(linkedList3, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null));
                sb.append(']');
                Log.m105924i("MicroMsg.WeVisModelMgr", sb.toString());
                if (!linkedList3.isEmpty()) {
                    C86709a0.m107529k().f251779b.mo123460f(((C32147e) C86312j.m106911c(cls)).mo58508K7(linkedList3));
                }
                u0Var2.mo55650e(86400000);
            } else if (i == 4) {
                C27862u0 u0Var3 = C27862u0.f77002a;
                u0Var3.mo55647b().putLong("cgi_time", Util.nowMilliSecond());
                WeVisionModelResStruct weVisionModelResStruct = new WeVisionModelResStruct();
                if (C110470e.f330363a == 0) {
                    C110470e.f330363a = 2011400;
                }
                weVisionModelResStruct.f79225d = C110470e.f330363a;
                weVisionModelResStruct.f79233l = ((C101643c) C86312j.m106911c(C101643c.class)).mo140873UJ();
                weVisionModelResStruct.f79231j = 10;
                Log.m105924i("MicroMsg.WeVisionModelReporter", "reportCgiFailed: " + weVisionModelResStruct.mo1006q());
                weVisionModelResStruct.mo86054n();
                u0Var3.mo55650e(86400000);
            } else {
                C61926c.m72666K(1800000, C27844b1.f76967d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ac3.u0$c */
    public static final class C27865c implements Runnable {

        /* renamed from: d */
        public static final C27865c f77011d = new C27865c();

        public final void run() {
            C27862u0.f77002a.mo55649d();
        }
    }

    /* renamed from: ac3.u0$d */
    public static final class C27866d implements Runnable {

        /* renamed from: d */
        public static final C27866d f77012d = new C27866d();

        public final void run() {
            C27862u0.f77002a.mo55649d();
        }
    }

    static {
        C27862u0 u0Var = new C27862u0();
        f77002a = u0Var;
        if (!MMApplicationContext.isMainProcess()) {
            u0Var.mo55648c();
            int i = WeVisUpdateReceiver.f82449a;
            if (!MMApplicationContext.isMainProcess()) {
                MMApplicationContext.getContext().registerReceiver(new WeVisUpdateReceiver(), new IntentFilter("com.tencent.mm.WeVisUpdate"));
                return;
            }
            throw new RuntimeException("WeVisUpdateReceiver can only register from non main process!");
        }
    }

    /* renamed from: a */
    public final void mo55646a(int i, int i2, String str) {
        boolean z;
        T t;
        boolean z2;
        C87412m.m108594g(str, "path");
        StringBuilder sb = new StringBuilder();
        C91992q0 q0Var = C91992q0.f263331a;
        sb.append(C91992q0.f263334d);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append(i);
        sb.append('.');
        sb.append(i2);
        String sb4 = sb.toString();
        LinkedList<b05> linkedList = f77006e.f130188d;
        C87412m.m108593f(linkedList, "targetModelInfo.NewConfigList");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            b05 b05 = (b05) t;
            if (b05.f130875d == i && b05.f130876e == i2) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        b05 b052 = (b05) t;
        if (b052 != null && C87412m.m108589b(((C32147e) C86312j.m106911c(C32147e.class)).mo58513e6(i, i2), b052.f130877f)) {
            String str2 = b052.f130878g;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                C86013q1.m106445f(sb4);
                C86013q1.m106447h(sb4);
                C86013q1.m106461v(sb4);
                C86013q1.m106442c(str, sb4 + XVFSFile.SEPARATOR_CHAR + b052.f130878g);
                C27855h1.f76992a.mo55643b(5, i, i2);
            }
        }
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo55647b() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WeVision_ModelInfo");
        C87412m.m108593f(mmkv, "getMMKV(\"WeVision_ModelInfo\")");
        return mmkv;
    }

    /* renamed from: c */
    public final void mo55648c() {
        Log.m105924i("MicroMsg.WeVisModelMgr", "initOtherProcess: ");
        byte[] decodeBytes = mo55647b().decodeBytes("local_info");
        a05 a05 = f77005d;
        if (decodeBytes != null) {
            try {
                a05.parseFrom(decodeBytes);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        mo55653h();
    }

    /* renamed from: d */
    public final void mo55649d() {
        if (((Boolean) ((C36570n) f77003b).getValue()).booleanValue()) {
            Log.m105924i("MicroMsg.WeVisModelMgr", "loadRemoteInfo: ");
            new C27845c().mo9225i().mo123420E(C27864b.f77010a);
        }
    }

    /* renamed from: e */
    public final void mo55650e(long j) {
        long nowMilliSecond = Util.nowMilliSecond();
        long j2 = mo55647b().getLong("cgi_time", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("loadRemoteInfoAfterLast: last:");
        sb.append(j2);
        sb.append(" diff:");
        long j3 = nowMilliSecond - j2;
        sb.append(j3);
        sb.append(", ");
        sb.append(j);
        Log.m105924i("MicroMsg.WeVisModelMgr", sb.toString());
        ((C119157j) C119157j.f356862d).mo183894y("WeVisModelMgr_cgi");
        if (j3 >= j) {
            ((C119157j) C119157j.f356862d).mo183876g(C27865c.f77011d, "WeVisModelMgr_cgi");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183879j(C27866d.f77012d, (j2 + j) - nowMilliSecond, "WeVisModelMgr_cgi");
    }

    /* renamed from: f */
    public final void mo55651f() {
        LinkedList<Integer> linkedList = f77007f;
        linkedList.clear();
        LinkedList<b05> linkedList2 = f77006e.f130188d;
        C87412m.m108593f(linkedList2, "targetModelInfo.NewConfigList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (b05 b05 : linkedList2) {
            arrayList.add(Integer.valueOf(b05.f130875d));
        }
        linkedList.addAll(C110818d0.m150905E(arrayList));
    }

    /* renamed from: g */
    public final void mo55652g() {
        boolean z;
        Log.m105924i("MicroMsg.WeVisModelMgr", "updateLocalModelInfo: ");
        LinkedList<b05> linkedList = new LinkedList<>();
        LinkedList<b05> linkedList2 = f77006e.f130188d;
        C87412m.m108593f(linkedList2, "targetModelInfo.NewConfigList");
        for (b05 b05 : linkedList2) {
            C103352e1 e1Var = C103352e1.f304762a;
            if (C103352e1.f304766e.get(Integer.valueOf(b05.f130875d)) != null) {
                String e6 = ((C32147e) C86312j.m106911c(C32147e.class)).mo58513e6(b05.f130875d, b05.f130876e);
                boolean z2 = false;
                if (!(e6 == null || e6.length() == 0) && C87412m.m108589b(e6, b05.f130877f)) {
                    if (!linkedList.isEmpty()) {
                        Iterator<T> it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((b05) it.next()).f130875d == b05.f130875d) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        linkedList.add(b05);
                    }
                }
            }
        }
        a05 a05 = f77005d;
        a05.f130188d = linkedList;
        mo55647b().encode("local_info", C61926c.m72699x(a05));
        MultiProcessMMKV b = mo55647b();
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        b.putInt("sdk_version", C110470e.f330363a);
        mo55653h();
        int i = WeVisUpdateReceiver.f82449a;
        if (MMApplicationContext.isMainProcess()) {
            Intent intent = new Intent("com.tencent.mm.WeVisUpdate");
            intent.putExtra("type", "wevis_model");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: h */
    public final void mo55653h() {
        LinkedList<C27848d1> linkedList = f77004c;
        synchronized (linkedList) {
            Log.m105924i("MicroMsg.WeVisModelMgr", "updateLocalModelList: ");
            linkedList.clear();
            LinkedList<b05> linkedList2 = f77005d.f130188d;
            C87412m.m108593f(linkedList2, "localModelInfo.NewConfigList");
            for (b05 b05 : linkedList2) {
                C103352e1 e1Var = C103352e1.f304762a;
                String str = C103352e1.f304766e.get(Integer.valueOf(b05.f130875d));
                if (!(str == null || b05.f130877f == null || b05.f130878g == null)) {
                    C27848d1 d1Var = new C27848d1();
                    d1Var.f76974a = str;
                    String str2 = b05.f130877f;
                    C87412m.m108593f(str2, "it.md5");
                    d1Var.f76977d = str2;
                    d1Var.f76975b = b05.f130875d;
                    d1Var.f76976c = b05.f130876e;
                    String str3 = b05.f130878g;
                    C87412m.m108593f(str3, "it.filename");
                    d1Var.f76978e = str3;
                    Log.m105924i("MicroMsg.WeVisModelMgr", "updateLocalModelList: " + str + ", " + b05.f130875d + '.' + b05.f130876e + ", " + b05.f130877f + ", " + b05.f130878g);
                    f77004c.add(d1Var);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
