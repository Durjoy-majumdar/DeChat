package hd0;

import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import mu3.C109639a;
import p206nj.C76861g;
import p261wl.C38166b;
import p682rz.C101489t;
import pc0.C100760a0;
import xb0.C102609h;

/* renamed from: hd0.z0 */
public class C98447z0 implements C101489t.C77595a {

    /* renamed from: y */
    public static int f288750y;

    /* renamed from: d */
    public MMHandler f288751d;

    /* renamed from: e */
    public boolean f288752e;

    /* renamed from: f */
    public MTimerHandler f288753f;

    /* renamed from: g */
    public List<C98437w0> f288754g;

    /* renamed from: h */
    public Queue<String> f288755h;

    /* renamed from: i */
    public Queue<String> f288756i;

    /* renamed from: j */
    public Queue<String> f288757j;

    /* renamed from: n */
    public Queue<String> f288758n;

    /* renamed from: o */
    public Map<String, C76861g.C47263a> f288759o;

    /* renamed from: p */
    public boolean f288760p;

    /* renamed from: q */
    public boolean f288761q;

    /* renamed from: r */
    public boolean f288762r;

    /* renamed from: s */
    public int f288763s;

    /* renamed from: t */
    public long f288764t;

    /* renamed from: u */
    public C98404n f288765u;

    /* renamed from: v */
    public C98415q f288766v;

    /* renamed from: w */
    public C76861g.C47263a f288767w;

    /* renamed from: x */
    public ConcurrentHashMap<String, C101489t.C77595a> f288768x;

    public C98447z0() {
        this.f288752e = false;
        this.f288753f = null;
        this.f288754g = new ArrayList();
        this.f288755h = new LinkedList();
        this.f288756i = new LinkedList();
        this.f288757j = new LinkedList();
        this.f288758n = new LinkedList();
        this.f288759o = new HashMap();
        this.f288760p = false;
        this.f288761q = false;
        this.f288762r = false;
        this.f288763s = 0;
        this.f288764t = 0;
        this.f288765u = null;
        this.f288766v = null;
        this.f288767w = new C76861g.C47263a();
        this.f288768x = new ConcurrentHashMap<>();
        this.f288752e = true;
        C109639a a = C109639a.m148950a("VideoService_runThread");
        this.f288751d = new MMHandler(a);
        this.f288753f = new MTimerHandler(a, (MTimerHandler.CallBack) new z0$$b(this), false);
        Log.m105924i("MicroMsg.VideoService", "create VideoService, start video send thread");
    }

    /* renamed from: a */
    public static void m127870a(C98447z0 z0Var) {
        C98408n0 i;
        z0Var.getClass();
        Log.m105924i("MicroMsg.VideoService", "tryStartNetscene");
        z0Var.f288764t = System.currentTimeMillis();
        boolean z = false;
        if ((!z0Var.f288760p && ((LinkedList) z0Var.f288756i).size() + ((LinkedList) z0Var.f288757j).size() == 0) || (!z0Var.f288761q && ((LinkedList) z0Var.f288755h).size() == 0)) {
            long currentTicks = Util.currentTicks();
            if (C98398h0.Bx0() == null) {
                Log.m105920e("MicroMsg.VideoService", "error, video info storage is null!!");
            } else {
                try {
                    List<String> p = C98398h0.Bx0().mo137727p(10);
                    List<String> o = C98398h0.Bx0().mo137726o(10);
                    List<String> i2 = C98398h0.Bx0().mo137723i(10);
                    Log.m105918d("MicroMsg.VideoService", "getNeedRunInfo needSendList size: " + ((LinkedList) p).size());
                    for (String next : p) {
                        if (((HashMap) z0Var.f288759o).containsKey(next)) {
                            Log.m105918d("MicroMsg.VideoService", "need sendList File is Already running:" + next);
                        } else {
                            ((LinkedList) z0Var.f288755h).offer(next);
                            ((HashMap) z0Var.f288759o).put(next, (Object) null);
                        }
                    }
                    Log.m105918d("MicroMsg.VideoService", "getNeedRunInfo needRecvList size: " + ((LinkedList) o).size());
                    for (String next2 : o) {
                        if (((HashMap) z0Var.f288759o).containsKey(next2)) {
                            Log.m105918d("MicroMsg.VideoService", "need recvList File is Already running:" + next2);
                        } else {
                            ((LinkedList) z0Var.f288756i).offer(next2);
                            ((HashMap) z0Var.f288759o).put(next2, (Object) null);
                        }
                    }
                    Log.m105918d("MicroMsg.VideoService", "getNeedRunInfo online video list size: " + ((LinkedList) i2).size());
                    for (String next3 : i2) {
                        if (((HashMap) z0Var.f288759o).containsKey(next3)) {
                            Log.m105918d("MicroMsg.VideoService", "online videoList File is Already running:" + next3);
                        } else {
                            ((LinkedList) z0Var.f288757j).offer(next3);
                            ((HashMap) z0Var.f288759o).put(next3, (Object) null);
                        }
                    }
                    Log.m105925i("MicroMsg.VideoService", "GetNeedRun cost time[%d] procing[%d] [recv:%d, online:%d, send:%d ]", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(((HashMap) z0Var.f288759o).size()), Integer.valueOf(((LinkedList) z0Var.f288756i).size()), Integer.valueOf(((LinkedList) z0Var.f288757j).size()), Integer.valueOf(((LinkedList) z0Var.f288755h).size()));
                    ((LinkedList) z0Var.f288756i).size();
                    ((LinkedList) z0Var.f288755h).size();
                    ((LinkedList) z0Var.f288757j).size();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VideoService", e, "getNeedRunInfo error: %s", e.getMessage());
                }
            }
        }
        boolean z2 = ((LinkedList) z0Var.f288758n).size() == 0 || !C102609h.yx0();
        if (z0Var.f288760p || ((LinkedList) z0Var.f288756i).size() + ((LinkedList) z0Var.f288757j).size() != 0 || !z2 || z0Var.f288761q || ((LinkedList) z0Var.f288755h).size() != 0) {
            if (!z0Var.f288760p && (((LinkedList) z0Var.f288756i).size() > 0 || ((LinkedList) z0Var.f288757j).size() > 0 || !z2)) {
                if (((LinkedList) z0Var.f288757j).size() > 0) {
                    String str = (String) ((LinkedList) z0Var.f288757j).poll();
                    Log.m105924i("MicroMsg.VideoService", "Start Recv :" + str);
                    if (!Util.isNullOrNil(str)) {
                        ((HashMap) z0Var.f288759o).put(str, new C76861g.C47263a());
                        z0Var.f288760p = true;
                        Assert.assertTrue("sceneDown should null", z0Var.f288765u == null);
                        if (!(!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_update_mpvideo, true) || (i = C98429r0.m127818i(str)) == null || i.mo137706j() == 112)) {
                            i.mo137713q(112);
                            C98429r0.m127808N(i);
                        }
                        z0Var.f288765u = new C98404n(str, true);
                        C86709a0.m107524d().mo123460f(z0Var.f288765u);
                    }
                }
                if (!z0Var.f288760p && ((LinkedList) z0Var.f288756i).size() > 0) {
                    String str2 = (String) ((LinkedList) z0Var.f288756i).poll();
                    Log.m105924i("MicroMsg.VideoService", "Start Recv :" + str2);
                    if (str2 != null) {
                        ((HashMap) z0Var.f288759o).put(str2, new C76861g.C47263a());
                        z0Var.f288760p = true;
                        Assert.assertTrue("sceneDown should null", z0Var.f288765u == null);
                        z0Var.f288765u = new C98404n(str2);
                        C86709a0.m107524d().mo123460f(z0Var.f288765u);
                    }
                }
            }
            if (!z0Var.f288761q && ((LinkedList) z0Var.f288755h).size() > 0) {
                String str3 = (String) ((LinkedList) z0Var.f288755h).poll();
                Log.m105924i("MicroMsg.VideoService", "Start Send :" + str3);
                if (str3 != null) {
                    C98408n0 i3 = C98429r0.m127818i(str3);
                    if (i3 != null) {
                        Log.m105925i("MicroMsg.VideoService", "Start Send, f: %s, videoFormat: %s", str3, Integer.valueOf(i3.mo137708l()));
                    }
                    ((HashMap) z0Var.f288759o).put(str3, new C76861g.C47263a());
                    z0Var.f288761q = true;
                    if (z0Var.f288766v == null) {
                        z = true;
                    }
                    Assert.assertTrue("sceneUp should null", z);
                    List<C98437w0> list = z0Var.f288754g;
                    if (list != null && ((ArrayList) list).size() > 0) {
                        Iterator it = ((ArrayList) z0Var.f288754g).iterator();
                        while (it.hasNext()) {
                            ((C98437w0) it.next()).mo137772N4(str3);
                        }
                    }
                    C38166b.m41755b(C32815d0.class, new z0$$a(str3));
                    C92855q0 f = C92855q0.m117113f();
                    f.mo127223g(str3);
                    f.mo140196c(1);
                    C100760a0.C89338b a = f.mo140195a();
                    z0Var.f288766v = (C98415q) a.f257313a;
                    a.mo123694a();
                    return;
                }
                return;
            }
            return;
        }
        z0Var.mo137785b();
        Log.m105918d("MicroMsg.VideoService", "No Data Any More , Stop Service");
    }

    /* renamed from: b */
    public final void mo137785b() {
        ((HashMap) this.f288759o).clear();
        ((LinkedList) this.f288755h).clear();
        ((LinkedList) this.f288756i).clear();
        ((LinkedList) this.f288757j).clear();
        ((LinkedList) this.f288758n).clear();
        this.f288761q = false;
        this.f288760p = false;
        this.f288762r = false;
        Log.m105924i("MicroMsg.VideoService", "Finish service use time(ms):" + this.f288767w.mo72288a());
    }

    /* renamed from: c */
    public boolean mo137786c() {
        boolean z = false;
        if (this.f288765u != null) {
            C86709a0.m107524d().mo123458d(this.f288765u);
            this.f288762r = false;
            z = true;
        }
        ((HashMap) this.f288759o).clear();
        ((LinkedList) this.f288755h).clear();
        ((LinkedList) this.f288756i).clear();
        ((LinkedList) this.f288757j).clear();
        ((LinkedList) this.f288758n).clear();
        return z;
    }

    /* renamed from: d */
    public void mo137787d() {
        MMHandler mMHandler;
        if (!this.f288752e || (mMHandler = this.f288751d) == null) {
            Log.m105920e("MicroMsg.VideoService", "run error!, handler or thread is null!");
        } else {
            mMHandler.post(new z0$$c(this));
        }
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        C101489t.C77595a aVar2 = this.f288768x.get(aVar.f226215a);
        if (aVar2 != null) {
            aVar2.mo102579d5(aVar);
        }
        C98408n0 i = C98429r0.m127818i(aVar.f226215a);
        if (i != null) {
            int i2 = i.f288562i;
            if (i2 == 199 || i2 == 198) {
                this.f288768x.remove(aVar.f226215a);
            }
        }
    }
}
