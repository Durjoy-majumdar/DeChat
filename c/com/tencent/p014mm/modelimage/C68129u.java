package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.p136ui.chatting.component.C73601t4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import hi2.C98453h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import ob0.C77005v;
import p158gt.C76055o;
import p206nj.C76861g;
import pc0.C100760a0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.modelimage.u */
public class C68129u implements C11385n, C47355o, C76055o {

    /* renamed from: r */
    public static Set<Integer> f195788r = new HashSet();

    /* renamed from: d */
    public LinkedList<C92809c0> f195789d = new LinkedList<>();

    /* renamed from: e */
    public C68134e f195790e = null;

    /* renamed from: f */
    public boolean f195791f = false;

    /* renamed from: g */
    public C77005v f195792g = new C68130a();

    /* renamed from: h */
    public Queue<C92836k> f195793h = new LinkedList();

    /* renamed from: i */
    public boolean f195794i = false;

    /* renamed from: j */
    public int f195795j = 0;

    /* renamed from: n */
    public long f195796n = 0;

    /* renamed from: o */
    public boolean f195797o = false;

    /* renamed from: p */
    public C76861g.C47263a f195798p = new C76861g.C47263a();

    /* renamed from: q */
    public MTimerHandler f195799q;

    /* renamed from: com.tencent.mm.modelimage.u$a */
    public class C68130a implements C77005v {
        public C68130a() {
        }
    }

    /* renamed from: com.tencent.mm.modelimage.u$b */
    public class C68131b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92809c0 f195801d;

        public C68131b(C92809c0 c0Var) {
            this.f195801d = c0Var;
        }

        public void run() {
            Log.m105925i("MicroMsg.ImgService", "offer to queue ? %b, scene hashcode %d", Boolean.valueOf(C68129u.this.f195791f), Integer.valueOf(this.f195801d.hashCode()));
            C68129u uVar = C68129u.this;
            if (uVar.f195791f) {
                uVar.f195789d.offer(this.f195801d);
                return;
            }
            C86709a0.m107529k().f251779b.mo123460f(this.f195801d);
            C68129u.this.f195791f = true;
        }
    }

    /* renamed from: com.tencent.mm.modelimage.u$c */
    public class C68132c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f195803d;

        public C68132c(C117747y yVar) {
            this.f195803d = yVar;
        }

        public void run() {
            if (this.f195803d.getType() == 110) {
                C117747y yVar = this.f195803d;
                if (yVar instanceof C92809c0) {
                    C68129u uVar = C68129u.this;
                    uVar.f195797o = false;
                    int i = (int) ((C92809c0) yVar).f267272h;
                    if (uVar.f195795j > 0) {
                        C68129u.m80532a(uVar);
                    } else {
                        uVar.mo93635b();
                    }
                    C68129u.m80533e(i);
                }
            }
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: com.tencent.mm.modelimage.u$d */
    public class C68133d implements MTimerHandler.CallBack {
        public C68133d() {
        }

        public boolean onTimerExpired() {
            try {
                C68129u.m80532a(C68129u.this);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ImgService", "exception:%s", Util.stackTraceToString(e));
            }
            return false;
        }

        public String toString() {
            return super.toString() + "|scenePusher";
        }
    }

    /* renamed from: com.tencent.mm.modelimage.u$e */
    public interface C68134e {
    }

    public C68129u() {
        C86709a0.m107528h();
        this.f195799q = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C68133d(), false);
        if (C86709a0.m107529k().f251779b != null) {
            C86709a0.m107529k().f251779b.mo123455a(110, this);
        }
        this.f195789d.clear();
        this.f195791f = false;
    }

    /* renamed from: a */
    public static void m80532a(C68129u uVar) {
        C92836k kVar;
        uVar.getClass();
        C100760a0.C100763e eVar = C100760a0.C100763e.IMAGE;
        uVar.f195796n = System.currentTimeMillis();
        if (!uVar.f195797o && ((LinkedList) uVar.f195793h).size() == 0) {
            ArrayList arrayList = (ArrayList) C92837k0.Bx0().ko0();
            if (arrayList.size() == 0) {
                Log.m105924i("MicroMsg.ImgService", "get need run info by search db, but size is 0.");
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C92836k kVar2 = (C92836k) it.next();
                    if (Util.isNullOrNil(kVar2.f267378e)) {
                        Log.m105924i("MicroMsg.ImgService", "the process is killed while selecting pic");
                    } else {
                        C92836k bO = C92837k0.Bx0().mo127181bO((int) kVar2.f267374a);
                        if (((HashSet) f195788r).contains(Integer.valueOf((int) (bO == null ? kVar2.f267374a : bO.f267374a)))) {
                            Log.m105918d("MicroMsg.ImgService", "File is Already running:" + kVar2.f267374a);
                        } else if (bO == null ? !(kVar2.f267387n <= 0 || kVar2.f267375b > 0 || kVar2.f267376c > kVar2.f267377d || kVar2.f267388o == -1) : !(bO.f267387n <= 0 || bO.f267375b > 0 || kVar2.f267376c > kVar2.f267377d || kVar2.f267388o == -1 || bO.f267388o == -1)) {
                            if (((long) (kVar2.f267386m + 600)) < Util.nowSecond()) {
                                m80534f((int) kVar2.f267374a);
                            } else {
                                Log.m105925i("MicroMsg.ImgService", "getNeedRunInfo queueSend add %s %s %s %s", Long.valueOf(kVar2.f267374a), Boolean.valueOf(kVar2.mo127146q()), Integer.valueOf(kVar2.f267376c), Integer.valueOf(kVar2.f267377d));
                                ((LinkedList) uVar.f195793h).add(kVar2);
                            }
                        }
                    }
                }
                ((LinkedList) uVar.f195793h).size();
            }
        }
        if (!uVar.f195797o && ((LinkedList) uVar.f195793h).size() <= 0) {
            uVar.mo93635b();
            Log.m105918d("MicroMsg.ImgService", "No Data Any More , Stop Service");
        } else if (!uVar.f195797o && ((LinkedList) uVar.f195793h).size() > 0) {
            loop1:
            while (true) {
                kVar = null;
                while (true) {
                    if (((LinkedList) uVar.f195793h).size() <= 0) {
                        break loop1;
                    }
                    kVar = (C92836k) ((LinkedList) uVar.f195793h).poll();
                    C92836k bO2 = C92837k0.Bx0().mo127181bO((int) kVar.f267374a);
                    if (((HashSet) f195788r).contains(Integer.valueOf((int) (bO2 == null ? kVar.f267374a : bO2.f267374a)))) {
                    }
                }
            }
            uVar.f195797o = true;
            if (kVar != null && kVar.f267374a > 0) {
                C92836k bO3 = C92837k0.Bx0().mo127181bO((int) kVar.f267374a);
                if (bO3 != null) {
                    Log.m105925i("MicroMsg.ImgService", "try upload hdinfo %s", Long.valueOf(bO3.f267374a));
                    C100760a0.C100764f b = C100760a0.m131932b(eVar);
                    b.f295207u = (int) bO3.f267374a;
                    b.f295194h = 2;
                    b.mo140195a().mo123694a();
                    return;
                }
                Log.m105925i("MicroMsg.ImgService", "try upload normalinfo %s", Long.valueOf(kVar.f267374a));
                C100760a0.C100764f b2 = C100760a0.m131932b(eVar);
                b2.f295207u = (int) kVar.f267374a;
                b2.f295197k = 0;
                b2.f295194h = 2;
                b2.mo140195a().mo123694a();
            }
        }
    }

    /* renamed from: e */
    public static boolean m80533e(int i) {
        return ((HashSet) f195788r).remove(Integer.valueOf(i));
    }

    /* renamed from: f */
    public static void m80534f(int i) {
        C72963f4 f4Var;
        Class cls = C75700k0.class;
        Log.m105929w("MicroMsg.ImgService", "setImgError, %d", Integer.valueOf(i));
        C92836k TO = C92837k0.Bx0().mo127173TO(i);
        if (TO.f267374a > 0) {
            C92836k bO = C92837k0.Bx0().mo127181bO((int) TO.f267374a);
            if (bO != null) {
                bO.mo127127D(-1);
                C92837k0.Bx0().Dx0(Long.valueOf((long) ((int) bO.f267374a)), bO);
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(bO.f267387n);
            } else {
                TO.mo127127D(-1);
                C92837k0.Bx0().Dx0(Long.valueOf((long) i), TO);
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(TO.f267387n);
            }
            if (f4Var.getMsgId() == TO.f267387n) {
                f4Var.mo100991d(5);
                C117407d.INSTANCE.idkeyStat(111, 31, 1, true);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0((long) ((int) f4Var.getMsgId()), f4Var);
            }
        }
    }

    /* renamed from: g */
    public static boolean m80535g(int i) {
        return ((HashSet) f195788r).add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo93635b() {
        ((LinkedList) this.f195793h).clear();
        this.f195794i = false;
        Log.m105918d("MicroMsg.ImgService", "Finish service use time(ms):" + this.f195798p.mo72288a());
    }

    /* renamed from: c */
    public long mo93636c(int i, String str, String str2, String str3, int i2, boolean z, int i3) {
        boolean a = C75592q0.m90771a(str3, str2, z);
        Log.m105927v("MicroMsg.ImgService", "pushsendimage, param.compressImg:%b, compresstype:%d", Boolean.valueOf(z), Integer.valueOf(a ? 1 : 0));
        C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
        b.f295195i = i;
        b.f295188b = str;
        b.f295187a = str2;
        b.f295196j = str3;
        b.f295197k = a;
        b.f295198l = this;
        b.f295200n = i2;
        b.f295199m = this.f195792g;
        b.f295202p = true;
        b.f295201o = i3;
        b.f295194h = 10;
        C92809c0 c0Var = (C92809c0) b.mo140195a().f257313a;
        mo93638h(c0Var);
        return c0Var.getMsg().getMsgId();
    }

    /* renamed from: d */
    public void mo93637d(int i, String str, String str2, ArrayList<String> arrayList, int i2, boolean z, int i3) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            boolean a = C75592q0.m90771a(next, str2, z);
            Log.m105927v("MicroMsg.ImgService", "pushsendimage, param.compressImg:%b, compresstype:%d", Boolean.valueOf(z), Integer.valueOf(a ? 1 : 0));
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
            b.f295195i = i;
            b.f295188b = str;
            b.f295187a = str2;
            b.f295196j = next;
            b.f295197k = a;
            b.f295198l = this;
            b.f295200n = i2;
            b.f295199m = this.f195792g;
            b.f295202p = true;
            b.f295201o = i3;
            b.f295194h = 10;
            mo93638h((C92809c0) b.mo140195a().f257313a);
        }
    }

    /* renamed from: h */
    public final void mo93638h(C92809c0 c0Var) {
        if (c0Var != null) {
            C86709a0.m107528h();
            C86709a0.m107525e().postToWorker(new C68131b(c0Var));
        }
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        C92809c0 c0Var = (C92809c0) yVar;
        if (this.f195790e != null && c0Var != null && c0Var.getMsg() != null) {
            C68134e eVar = this.f195790e;
            ((C79368l) ((C73601t4) eVar).f215752d.f193278b.mo102812a(C79368l.class)).mo108184T1(c0Var.getMsg().getMsgId(), i, i2);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        objArr[3] = yVar != null ? Integer.valueOf(yVar.hashCode()) : null;
        Log.m105925i("MicroMsg.ImgService", "img onSceneEnd errType %d, errCode %d, errMsg %s scene:%s", objArr);
        if (yVar instanceof C92809c0) {
            C92809c0 c0Var = (C92809c0) yVar;
            if (!(this.f195790e == null || c0Var == null || c0Var.getMsg() == null)) {
                C68134e eVar = this.f195790e;
                long msgId = c0Var.getMsg().getMsgId();
                if (c0Var.getMsg().getStatus() != 5) {
                    z = true;
                }
                C73601t4 t4Var = (C73601t4) eVar;
                t4Var.getClass();
                C98453h hVar = C98453h.f288774a;
                String valueOf = String.valueOf(msgId);
                if (valueOf != null) {
                    hVar.mo137810h(C98453h.f288777d.decodeString(valueOf, ""));
                }
                ((C79368l) t4Var.f215752d.f193278b.mo102812a(C79368l.class)).mo108173G(msgId, z);
            }
        }
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C68132c(yVar));
    }
}
