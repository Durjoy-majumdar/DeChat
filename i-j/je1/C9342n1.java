package je1;

import android.content.Context;
import android.util.LongSparseArray;
import bl3.C39818r;
import bo1.C0344g;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import do1.C58332b;
import do1.C58341h;
import dp1.C20480e0;
import dp1.C7453v;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i31.C117139g;
import it1.C9251d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.C46566c;
import jp3.C9486a;
import jp3.C9487b;
import kj2.C117407d;
import kotlin.Result;
import kt1.C46744d;
import le1.C10497i;
import le1.C10498j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C89349b;
import rs1.C13383r;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C50424mn0;
import te3.C50566nn0;
import te3.C51163rv3;
import te3.C51974xh1;
import te3.C52117yh1;
import te3.C52133yl1;
import te3.C52280zl1;
import te3.C64802wh1;
import te3.C90420iq;
import um0.C22657f;
import up1.C37521f;
import ux3.C65486b;
import vp1.C65834e;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import zc1.C66785b;

/* renamed from: je1.n1 */
public final class C9342n1 implements C117139g<String, C9346d> {

    /* renamed from: d */
    public final int f29180d;

    /* renamed from: e */
    public final int f29181e;

    /* renamed from: f */
    public final C89349b f29182f;

    /* renamed from: g */
    public final C49712hj1 f29183g;

    /* renamed from: h */
    public final List<FinderObject> f29184h;

    /* renamed from: i */
    public final boolean f29185i;

    /* renamed from: j */
    public final boolean f29186j;

    /* renamed from: n */
    public final boolean f29187n;

    /* renamed from: o */
    public final int f29188o;

    /* renamed from: p */
    public C9343a f29189p;

    /* renamed from: q */
    public C9347e f29190q;

    /* renamed from: r */
    public C9348f f29191r;

    /* renamed from: s */
    public C46566c<C9486a> f29192s;

    /* renamed from: t */
    public final ConcurrentLinkedQueue<C10498j<C10497i>> f29193t;

    /* renamed from: u */
    public final boolean f29194u;

    /* renamed from: v */
    public final AtomicBoolean f29195v;

    /* renamed from: w */
    public final String f29196w;

    /* renamed from: x */
    public final C9345c f29197x;

    /* renamed from: y */
    public final C9355m f29198y;

    /* renamed from: je1.n1$a */
    public interface C9343a {
        /* renamed from: a */
        void mo3675a(int i, int i2, String str, C9346d dVar, List<? extends C10497i> list);
    }

    /* renamed from: je1.n1$b */
    public final class C9344b extends C9251d<C50566nn0> {

        /* renamed from: s */
        public C52280zl1 f29199s;

        /* renamed from: t */
        public final JSONObject f29200t = new JSONObject();

        public C9344b(C52280zl1 zl12, C89349b bVar) {
            super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
            this.f29199s = zl12;
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            C50424mn0 mn02 = new C50424mn0();
            C9342n1.this.f29197x.getClass();
            mn02.f138111d = C66785b.f191882e.mo90662O5();
            mn02.f138114g = C9342n1.this.f29180d;
            mn02.f138112e = bVar;
            String str = C9342n1.this.f29196w;
            StringBuilder sb = new StringBuilder();
            sb.append("[request#historyCgi] isPreload=");
            sb.append(C9342n1.this.f29185i);
            sb.append(" tabType=");
            sb.append(C9342n1.this.f29180d);
            sb.append(" pullType=");
            sb.append(C9342n1.this.f29181e);
            sb.append(" lastBuffer=");
            sb.append(bVar == null ? "null" : MD5Util.getMD5String(bVar.f257327a));
            Log.m105924i(str, sb.toString());
            mn02.f138113f = C46523h2.f125330a.mo71860b(3814, this.f172731j);
            bVar2.f127066a = mn02;
            C50566nn0 nn02 = new C50566nn0();
            nn02.setBaseResponse(new C49966ja());
            nn02.getBaseResponse().f135956e = new C51163rv3();
            bVar2.f127067b = nn02;
            bVar2.f127068c = "/cgi-bin/micromsg-bin/findergethistory";
            bVar2.f127069d = 3814;
            mo123453j(bVar2.mo72403a());
        }

        /* renamed from: M */
        public C46744d mo8509M() {
            return C46744d.Enable;
        }

        /* renamed from: N */
        public JSONObject mo8506N() {
            JSONObject jSONObject = new JSONObject();
            C9342n1 n1Var = C9342n1.this;
            jSONObject.put("tabType", n1Var.f29180d);
            jSONObject.put("pullType", n1Var.f29181e);
            return jSONObject;
        }

        /* renamed from: R0 */
        public JSONObject mo8510R0() {
            return this.f29200t;
        }

        /* renamed from: q */
        public boolean mo10087q() {
            return true;
        }

        /* renamed from: r */
        public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
            C9346d dVar;
            LinkedList<FinderObject> linkedList;
            FinderObject finderObject;
            LinkedList<C52117yh1> linkedList2;
            LinkedList<C52117yh1> linkedList3;
            Iterator<T> it;
            int i3 = i;
            int i4 = i2;
            String str2 = str;
            C50566nn0 nn02 = (C50566nn0) eu32;
            C87412m.m108594g(nn02, "resp");
            super.mo332r(i, i2, str, nn02, yVar);
            C20480e0.f57583a.mo32034g(C9342n1.this.f29180d, false);
            this.f29200t.put("size", nn02.f138688d.size());
            long currentTimeMillis = System.currentTimeMillis();
            LinkedList<FinderObject> linkedList4 = nn02.f138688d;
            C87412m.m108593f(linkedList4, "resp.`object`");
            C9342n1 n1Var = C9342n1.this;
            Iterator<T> it4 = linkedList4.iterator();
            while (it4.hasNext()) {
                FinderObject finderObject2 = (FinderObject) it4.next();
                C58784w3 w3Var = C58784w3.f168295a;
                C87412m.m108593f(finderObject2, LocaleUtil.ITALIAN);
                if (w3Var.mo83872H0(finderObject2)) {
                    C13383r a = C13383r.f37907d.mo12791a();
                    C49712hj1 hj12 = this.f172731j;
                    int i5 = hj12 != null ? hj12.f134675i : 0;
                    int i6 = n1Var.f29180d;
                    boolean z = n1Var.f29185i;
                    String str3 = n1Var.f29197x.f145375j;
                    if (str3 == null) {
                        str3 = "";
                    }
                    it = it4;
                    C13383r.C13386c cVar = r11;
                    C13383r.C13386c cVar2 = new C13383r.C13386c(finderObject2, i5, i6, z, str3, 1, currentTimeMillis, 0, 0, 0, C22657f.CTRL_INDEX, (C8480h) null);
                    a.mo12790b(cVar);
                } else {
                    it = it4;
                }
                it4 = it;
            }
            C20480e0 e0Var = C20480e0.f57583a;
            e0Var.mo32040m(C9342n1.this.f29180d, false);
            C9347e eVar = C9342n1.this.f29190q;
            C64802wh1 wh12 = null;
            if (eVar != null) {
                boolean b = eVar.mo3672b(i3, i4, nn02);
                if (b) {
                    String str4 = C9342n1.this.f29196w;
                    Log.m105928w(str4, "[onCgiBack#historyCgi] return! isPreload=" + C9342n1.this.f29185i + " tabType=" + C9342n1.this.f29180d + " pullType=" + C9342n1.this.f29181e + " errType=" + i3 + " errCode=" + i4 + " errMsg=" + str2 + " isConsume=" + b);
                    C9348f fVar = C9342n1.this.f29191r;
                    if (fVar != null) {
                        ((C9353k) fVar).mo10089a(i3, i4, str2, nn02);
                        return;
                    }
                    return;
                }
                C9342n1 n1Var2 = C9342n1.this;
                C52280zl1 zl12 = this.f29199s;
                if (zl12 != null) {
                    dVar = n1Var2.mo10082e(zl12);
                } else {
                    n1Var2.getClass();
                    dVar = new C9346d();
                }
                C9345c cVar3 = n1Var2.f29197x;
                C87412m.m108594g(cVar3, "<set-?>");
                dVar.f29209L = cVar3;
                dVar.f146069d.addAll(nn02.f138688d);
                dVar.f29204G = nn02.f138690f;
                dVar.f146070e = nn02.f138689e;
                C51974xh1 xh12 = dVar.f146077o;
                if (xh12 == null) {
                    xh12 = new C51974xh1();
                }
                dVar.f146077o = xh12;
                C51974xh1 xh13 = nn02.f138691g;
                xh12.f144649d = xh13 != null ? xh13.f144649d : 0;
                if (xh13 != null) {
                    wh12 = xh13.f144650e;
                }
                xh12.f144650e = wh12;
                if (!(xh13 == null || (linkedList2 = xh13.f144651f) == null || (linkedList3 = xh12.f144651f) == null)) {
                    linkedList3.addAll(linkedList2);
                }
                if (!C9342n1.this.f29197x.f29202P) {
                    C52280zl1 zl13 = this.f29199s;
                    dVar.f29206I = (zl13 == null || (linkedList = zl13.f146069d) == null || (finderObject = (FinderObject) C110818d0.m150925W(linkedList)) == null) ? -1 : finderObject.f164794id;
                }
                int size = nn02.f138688d.size();
                dVar.f29207J = size;
                e0Var.mo32028a(C9342n1.this.f29180d, size);
                dVar.f29208K = true;
                if (i3 == 0 && i4 == 0) {
                    C117407d.INSTANCE.idkeyStat(1279, 153, 1, false);
                } else if (i3 == 4) {
                    C117407d.INSTANCE.idkeyStat(1279, 154, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1279, 155, 1, false);
                }
                String str5 = C9342n1.this.f29196w;
                Log.m105924i(str5, "[onCgiBack#historyCgi] errCode=" + i4 + " errMsg=" + str2 + " isConsume=" + b + ", isPreload=" + C9342n1.this.f29185i + " tabType=" + C9342n1.this.f29180d + " pullType=" + C9342n1.this.f29181e + ", historySize=" + dVar.f29207J + " continue_flag=" + nn02.f138690f + ' ' + C9311g2.f29093a.mo10062a(nn02.f138688d));
                C65834e eVar2 = C65834e.f189316a;
                int i7 = C9342n1.this.f29180d;
                LinkedList<FinderObject> linkedList5 = nn02.f138688d;
                C87412m.m108593f(linkedList5, "resp.`object`");
                eVar2.getClass();
                HashMap<Integer, LongSparseArray<Long>> hashMap = C65834e.f189319d;
                synchronized (hashMap) {
                    Integer valueOf = Integer.valueOf(i7);
                    LongSparseArray<Long> longSparseArray = hashMap.get(valueOf);
                    if (longSparseArray == null) {
                        longSparseArray = new LongSparseArray<>();
                        hashMap.put(valueOf, longSparseArray);
                    }
                    LongSparseArray longSparseArray2 = longSparseArray;
                    for (FinderObject finderObject3 : linkedList5) {
                        long j = finderObject3.f164794id;
                        longSparseArray2.append(j, Long.valueOf(j));
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C9342n1.this.mo10084g(i3, i4, str2, dVar);
                return;
            }
            C87412m.m108603p("config");
            throw null;
        }

        /* renamed from: s */
        public List mo10027s(C49335eu3 eu32) {
            C50566nn0 nn02 = (C50566nn0) eu32;
            C87412m.m108594g(nn02, "resp");
            LinkedList<FinderObject> linkedList = nn02.f138688d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar = FinderItem.Companion;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                arrayList.add(aVar.mo79056a(finderObject, 0));
            }
            return arrayList;
        }

        /* renamed from: t */
        public long mo10028t() {
            C49842ig0 ig02 = C9342n1.this.f29197x.f145372g;
            if (ig02 != null) {
                return ig02.f135317i;
            }
            return 0;
        }
    }

    /* renamed from: je1.n1$c */
    public static final class C9345c extends C52133yl1 {

        /* renamed from: P */
        public boolean f29202P;

        /* renamed from: Q */
        public String f29203Q = "";
    }

    /* renamed from: je1.n1$d */
    public static final class C9346d extends C52280zl1 {

        /* renamed from: G */
        public int f29204G = 1;

        /* renamed from: H */
        public int f29205H;

        /* renamed from: I */
        public long f29206I = -1;

        /* renamed from: J */
        public int f29207J = -1;

        /* renamed from: K */
        public boolean f29208K;

        /* renamed from: L */
        public C9345c f29209L;

        /* renamed from: M */
        public int f29210M;

        /* renamed from: N */
        public int f29211N;

        /* renamed from: P */
        public String f29212P;

        /* renamed from: Q */
        public String f29213Q = "";

        /* renamed from: R */
        public C90420iq f29214R;

        /* renamed from: b */
        public final C9345c mo10088b() {
            C9345c cVar = this.f29209L;
            if (cVar != null) {
                return cVar;
            }
            C87412m.m108603p("requestEx");
            throw null;
        }
    }

    /* renamed from: je1.n1$e */
    public interface C9347e {
        /* renamed from: a */
        void mo3671a();

        /* renamed from: b */
        boolean mo3672b(int i, int i2, C49335eu3 eu32);

        /* renamed from: c */
        boolean mo3673c();

        /* renamed from: d */
        void mo3674d(C9345c cVar);
    }

    /* renamed from: je1.n1$f */
    public interface C9348f {
        /* renamed from: a */
        void mo10089a(int i, int i2, String str, C49335eu3 eu32);
    }

    /* renamed from: je1.n1$g */
    public static final class C9349g<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C10498j) t).f31734b), Integer.valueOf(((C10498j) t2).f31734b));
        }
    }

    /* renamed from: je1.n1$h */
    public static final class C9350h<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C10498j) t).f31734b), Integer.valueOf(((C10498j) t2).f31734b));
        }
    }

    /* renamed from: je1.n1$i */
    public static final class C9351i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9342n1 f29215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9351i(C9342n1 n1Var) {
            super(0);
            this.f29215d = n1Var;
        }

        public Object invoke() {
            C20480e0.C20481a e = C20480e0.f57583a.mo32032e(this.f29215d.f29180d);
            if (e != null) {
                if (!(e.f57617a && !e.f57619b)) {
                    e = null;
                }
                if (e != null) {
                    e.f57631h = C31543z5.m39453c();
                    e.f57594D = 4;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: je1.n1$j */
    public static final class C9352j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9342n1 f29216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9352j(C9342n1 n1Var) {
            super(0);
            this.f29216d = n1Var;
        }

        public Object invoke() {
            String str;
            if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                Context context = MMApplicationContext.getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("[run] use preload cache. tabType=");
                C58784w3 w3Var = C58784w3.f168295a;
                int i = this.f29216d.f29180d;
                w3Var.getClass();
                if (i == 0) {
                    str = "TAB_TYPE_ALL";
                } else if (i == 1) {
                    str = "TAB_TYPE_FRIEND";
                } else if (i == 2) {
                    str = "TAB_TYPE_LBS";
                } else if (i == 3) {
                    str = "TAB_TYPE_FOLLOW";
                } else if (i != 4) {
                    str = "unknow " + i;
                } else {
                    str = "TAB_TYPE_MACHINE";
                }
                sb.append(str);
                C76912y0.makeText(context, (CharSequence) sb.toString(), 1).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: je1.n1$k */
    public static final class C9353k implements C9348f {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f29217a;

        /* renamed from: b */
        public final /* synthetic */ C9342n1 f29218b;

        /* renamed from: c */
        public final /* synthetic */ C15601d<C9346d> f29219c;

        public C9353k(C8477a0 a0Var, C9342n1 n1Var, C15601d<? super C9346d> dVar) {
            this.f29217a = a0Var;
            this.f29218b = n1Var;
            this.f29219c = dVar;
        }

        /* renamed from: a */
        public void mo10089a(int i, int i2, String str, C49335eu3 eu32) {
            if (!this.f29217a.f27482d) {
                String str2 = this.f29218b.f29196w;
                Log.m105928w(str2, "runTask: onConcurrentError tabType = " + this.f29218b.f29180d + ", pullType = " + this.f29218b.f29181e);
                C15601d<C9346d> dVar = this.f29219c;
                C9346d dVar2 = new C9346d();
                dVar2.f29211N = 3;
                dVar.resumeWith(Result.m168114constructorimpl(dVar2));
                this.f29217a.f27482d = true;
            }
        }
    }

    /* renamed from: je1.n1$l */
    public static final class C9354l implements C9343a {

        /* renamed from: a */
        public final /* synthetic */ C9343a f29220a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f29221b;

        /* renamed from: c */
        public final /* synthetic */ C15601d<C9346d> f29222c;

        public C9354l(C9343a aVar, C8477a0 a0Var, C15601d<? super C9346d> dVar) {
            this.f29220a = aVar;
            this.f29221b = a0Var;
            this.f29222c = dVar;
        }

        /* renamed from: a */
        public void mo3675a(int i, int i2, String str, C9346d dVar, List<? extends C10497i> list) {
            C87412m.m108594g(dVar, "resp");
            C87412m.m108594g(list, "interceptors");
            this.f29220a.mo3675a(i, i2, str, dVar, list);
            if (!this.f29221b.f27482d) {
                this.f29222c.resumeWith(Result.m168114constructorimpl(dVar));
            }
            this.f29221b.f27482d = true;
        }
    }

    /* renamed from: je1.n1$m */
    public static final class C9355m extends C9251d<C52280zl1> {

        /* renamed from: s */
        public final JSONObject f29223s = new JSONObject();

        /* renamed from: t */
        public final /* synthetic */ C9342n1 f29224t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01de, code lost:
            if (r8 == null) goto L_0x01e7;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x02a4  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x02a6  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02c1  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x02d8  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x03c3  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x03cc  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x03d9  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x03e4  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x03ef  */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x0471 A[LOOP:3: B:166:0x046b->B:168:0x0471, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x04a5 A[LOOP:4: B:170:0x049f->B:172:0x04a5, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x04ba  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x04c2  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x04c8  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x056a  */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x05b4 A[LOOP:7: B:201:0x05ae->B:203:0x05b4, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x05da  */
        /* JADX WARNING: Removed duplicated region for block: B:219:0x066a  */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0673  */
        /* JADX WARNING: Removed duplicated region for block: B:223:0x0683  */
        /* JADX WARNING: Removed duplicated region for block: B:226:0x06ab  */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x06b5  */
        /* JADX WARNING: Removed duplicated region for block: B:230:0x06c2  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x06c5  */
        /* JADX WARNING: Removed duplicated region for block: B:238:0x06f7  */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x06fe  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x020e  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0211  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0216  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0218  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x026b  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0286  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x028d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9355m(je1.C9342n1 r26, te3.C49712hj1 r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                java.lang.Class<ns3.d> r2 = ns3.C11266d.class
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                r0.f29224t = r1
                r4 = 0
                r5 = 2
                r6 = r27
                r0.<init>(r6, r4, r5, r4)
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                r0.f29223s = r5
                je1.n1$c r5 = r1.f29197x
                je1.h2 r6 = je1.C46523h2.f125330a
                boolean r7 = r1.f29186j
                if (r7 != 0) goto L_0x0023
                r7 = 3901(0xf3d, float:5.466E-42)
                goto L_0x0025
            L_0x0023:
                r7 = 4270(0x10ae, float:5.984E-42)
            L_0x0025:
                te3.hj1 r10 = r1.f29183g
                te3.ig0 r6 = r6.mo71860b(r7, r10)
                r5.f145372g = r6
                pe3.b r6 = r1.f29182f
                r5.f145369d = r6
                int r6 = r1.f29181e
                r5.f145371f = r6
                int r6 = r1.f29180d
                r5.f145379q = r6
                bl3.r r6 = bl3.C39818r.f106831a
                bl3.r$a r7 = r6.mo62446e(r3)
                java.lang.Class<os1.d> r10 = os1.C62153d.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r10)
                os1.d r7 = (os1.C62153d) r7
                rx3.l r7 = r7.mo9104X0()
                A r10 = r7.f38555d
                java.lang.Number r10 = (java.lang.Number) r10
                float r10 = r10.floatValue()
                r5.f145373h = r10
                B r7 = r7.f38556e
                java.lang.Number r7 = (java.lang.Number) r7
                float r7 = r7.floatValue()
                r5.f145374i = r7
                r7 = 1
                r5.f145378p = r7
                je1.n1$c r5 = r1.f29197x
                int r10 = r1.f29181e
                r13 = 3
                r14 = 4
                if (r10 == r7) goto L_0x006c
                if (r10 != 0) goto L_0x00c2
            L_0x006c:
                int r10 = r1.f29180d
                if (r10 == r7) goto L_0x0074
                if (r10 == r13) goto L_0x0074
                if (r10 != r14) goto L_0x00c2
            L_0x0074:
                java.util.HashMap<java.lang.Integer, java.lang.Long> r15 = rs1.C63580na.f180295g
                java.util.HashMap<java.lang.Integer, java.lang.Long> r15 = rs1.C63580na.f180295g
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r10 = r15.remove(r10)
                java.lang.Long r10 = (java.lang.Long) r10
                if (r10 != 0) goto L_0x0087
                r9 = 0
                goto L_0x008c
            L_0x0087:
                long r15 = r10.longValue()
                r9 = r15
            L_0x008c:
                vp1.e r15 = vp1.C65834e.f189316a
                int r8 = r1.f29180d
                boolean r8 = r15.mo89873g(r8, r9)
                if (r8 != 0) goto L_0x0098
                r5.f145383u = r9
            L_0x0098:
                java.lang.String r9 = r1.f29196w
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r15 = "[request] tabType="
                r10.append(r15)
                int r15 = r1.f29180d
                r10.append(r15)
                java.lang.String r15 = " isHistoryFeed="
                r10.append(r15)
                r10.append(r8)
                java.lang.String r8 = " partialExposedObjectId="
                r10.append(r8)
                long r4 = r5.f145383u
                r10.append(r4)
                java.lang.String r4 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            L_0x00c2:
                je1.n1$c r4 = r1.f29197x
                te3.hj1 r5 = r1.f29183g
                if (r5 == 0) goto L_0x00d0
                int r5 = r5.f134675i
                r10 = 15
                if (r5 != r10) goto L_0x00d0
                r5 = 1
                goto L_0x00d1
            L_0x00d0:
                r5 = 0
            L_0x00d1:
                java.lang.String r10 = " pullType="
                java.lang.String r15 = ""
                r8 = 6
                r9 = 17
                r13 = 20
                if (r5 == 0) goto L_0x00fa
                java.lang.String r4 = r1.f29196w
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r11 = "buildRedDotRequest return for commentScene:"
                r5.append(r11)
                te3.hj1 r11 = r1.f29183g
                r5.append(r11)
                java.lang.String r11 = ".commentScene"
                r5.append(r11)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                goto L_0x011e
            L_0x00fa:
                int r5 = r1.f29188o
                if (r5 != r7) goto L_0x0103
                int r5 = r1.f29180d
                if (r5 != r14) goto L_0x0103
                goto L_0x011e
            L_0x0103:
                int r5 = r1.f29181e
                if (r5 == r7) goto L_0x0126
                if (r5 == 0) goto L_0x0126
                r11 = 5
                if (r5 == r11) goto L_0x0126
                r11 = 7
                if (r5 == r11) goto L_0x0126
                r11 = 8
                if (r5 == r11) goto L_0x0126
                if (r5 == r8) goto L_0x0126
                if (r5 == r9) goto L_0x0126
                r11 = 9
                if (r5 == r11) goto L_0x0126
                if (r5 != r13) goto L_0x011e
                goto L_0x0126
            L_0x011e:
                r22 = r2
                r23 = r3
                r18 = 0
                goto L_0x02b1
            L_0x0126:
                di3.d r5 = di3.C86312j.m106911c(r3)
                com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r5.Nt0()
                int r11 = r1.f29180d
                java.lang.String r11 = r5.mo77283w(r11)
                te3.yi1 r12 = r5.mo77279s(r11)
                if (r12 == 0) goto L_0x013e
                r9 = 1
                goto L_0x013f
            L_0x013e:
                r9 = 0
            L_0x013f:
                java.lang.String r8 = "FinderEntrance"
                if (r12 == 0) goto L_0x0178
                long r13 = r12.f186549g
                r18 = 0
                int r21 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
                if (r21 != 0) goto L_0x014f
                pe3.b r7 = r12.f186553n
                if (r7 == 0) goto L_0x0178
            L_0x014f:
                r4.f145380r = r13
                java.lang.String r7 = r12.f186554o
                r4.f145381s = r7
                java.lang.String r7 = r12.f186547e
                r4.f145387y = r7
                pe3.b r7 = r12.f186553n
                r4.f145388z = r7
                r4.f145356B = r8
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$a> r7 = r5.f158547x
                java.lang.Object r7 = r7.get(r11)
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager$a r7 = (com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager.C29940a) r7
                if (r7 == 0) goto L_0x016d
                java.lang.String r7 = r7.f81095b
                if (r7 != 0) goto L_0x016e
            L_0x016d:
                r7 = r15
            L_0x016e:
                r4.f29203Q = r7
                r22 = r2
                r23 = r3
                r18 = 0
                goto L_0x020a
            L_0x0178:
                com.tencent.mm.plugin.finder.extension.reddot.s0 r7 = r5.mo77227G5(r8)
                java.lang.String r13 = "it.field_tipsId"
                if (r7 == 0) goto L_0x01e1
                te3.yi1 r14 = r7.f158585F
                r22 = r2
                r23 = r3
                long r2 = r14.f186549g
                r18 = 0
                int r24 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
                if (r24 == 0) goto L_0x0196
                int r2 = r14.f186555p
                int r3 = r1.f29180d
                if (r2 != r3) goto L_0x0196
                r2 = 1
                goto L_0x0197
            L_0x0196:
                r2 = 0
            L_0x0197:
                if (r2 == 0) goto L_0x019a
                goto L_0x019b
            L_0x019a:
                r14 = 0
            L_0x019b:
                if (r14 == 0) goto L_0x01b9
                long r2 = r14.f186549g
                r4.f145380r = r2
                java.lang.String r2 = r14.f186554o
                r4.f145381s = r2
                java.lang.String r2 = r14.f186547e
                r4.f145387y = r2
                pe3.b r2 = r14.f186553n
                r4.f145388z = r2
                r4.f145356B = r8
                java.lang.String r2 = r7.field_tipsId
                gy3.C87412m.m108593f(r2, r13)
                r4.f29203Q = r2
                rx3.b0 r8 = rx3.C13598b0.f38549a
                goto L_0x01de
            L_0x01b9:
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r5.mo77227G5(r11)
                if (r2 == 0) goto L_0x01dd
                te3.yi1 r3 = r2.f158585F
                long r7 = r3.f186549g
                r4.f145380r = r7
                java.lang.String r7 = r3.f186554o
                r4.f145381s = r7
                java.lang.String r7 = r3.f186547e
                r4.f145387y = r7
                pe3.b r3 = r3.f186553n
                r4.f145388z = r3
                r4.f145356B = r11
                java.lang.String r2 = r2.field_tipsId
                gy3.C87412m.m108593f(r2, r13)
                r4.f29203Q = r2
                rx3.b0 r8 = rx3.C13598b0.f38549a
                goto L_0x01de
            L_0x01dd:
                r8 = 0
            L_0x01de:
                if (r8 != 0) goto L_0x020a
                goto L_0x01e7
            L_0x01e1:
                r22 = r2
                r23 = r3
                r18 = 0
            L_0x01e7:
                com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r5.mo77227G5(r11)
                if (r2 == 0) goto L_0x020a
                te3.yi1 r3 = r2.f158585F
                long r7 = r3.f186549g
                r4.f145380r = r7
                java.lang.String r7 = r3.f186554o
                r4.f145381s = r7
                java.lang.String r7 = r3.f186547e
                r4.f145387y = r7
                pe3.b r3 = r3.f186553n
                r4.f145388z = r3
                r4.f145356B = r11
                java.lang.String r2 = r2.field_tipsId
                gy3.C87412m.m108593f(r2, r13)
                r4.f29203Q = r2
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x020a:
                te3.ig0 r2 = r4.f145372g
                if (r2 == 0) goto L_0x0211
                int r2 = r2.f135315g
                goto L_0x0212
            L_0x0211:
                r2 = 0
            L_0x0212:
                r2 = r2 & 8192(0x2000, float:1.14794E-41)
                if (r2 == 0) goto L_0x0218
                r2 = 1
                goto L_0x0219
            L_0x0218:
                r2 = 0
            L_0x0219:
                java.lang.String r3 = r1.f29196w
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "[buildRedDotRequest] tabType="
                r7.append(r8)
                int r8 = r1.f29180d
                r7.append(r8)
                java.lang.String r8 = " machineShowSquareFlag="
                r7.append(r8)
                r7.append(r2)
                java.lang.String r2 = " entranceCtrlTypeWhenEnter="
                r7.append(r2)
                int r2 = r5.f158541r
                r7.append(r2)
                java.lang.String r2 = " isEnterRequest="
                r7.append(r2)
                r7.append(r9)
                java.lang.String r2 = " tab_tips_path="
                r7.append(r2)
                java.lang.String r2 = r4.f145356B
                r7.append(r2)
                r7.append(r10)
                int r2 = r1.f29181e
                r7.append(r2)
                java.lang.String r2 = " tabTipsUsername="
                r7.append(r2)
                java.lang.String r2 = r4.f145387y
                r7.append(r2)
                java.lang.String r2 = " tabTipsByPassInfo="
                r7.append(r2)
                pe3.b r2 = r4.f145388z
                if (r2 == 0) goto L_0x026b
                r2 = 1
                goto L_0x026c
            L_0x026b:
                r2 = 0
            L_0x026c:
                r7.append(r2)
                java.lang.String r2 = " objectId="
                r7.append(r2)
                long r8 = r4.f145380r
                java.lang.String r2 = o40.C61926c.m72691p(r8)
                r7.append(r2)
                java.lang.String r2 = " requestId="
                r7.append(r2)
                te3.ig0 r2 = r4.f145372g
                if (r2 == 0) goto L_0x028d
                long r8 = r2.f135317i
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                goto L_0x028e
            L_0x028d:
                r8 = 0
            L_0x028e:
                r7.append(r8)
                java.lang.String r2 = " requestHash="
                r7.append(r2)
                int r2 = r4.hashCode()
                r7.append(r2)
                java.lang.String r2 = ", isEnterTapTip = "
                r7.append(r2)
                if (r12 == 0) goto L_0x02a6
                r2 = 1
                goto L_0x02a7
            L_0x02a6:
                r2 = 0
            L_0x02a7:
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            L_0x02b1:
                je1.n1$c r2 = r1.f29197x
                java.lang.Class<h81.i> r3 = h81.C59774i.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                h81.i r3 = (h81.C59774i) r3
                java.lang.String r3 = r3.mo84751Wb()
                if (r3 != 0) goto L_0x02c2
                r3 = r15
            L_0x02c2:
                r2.f145375j = r3
                java.lang.Class<tf0.p1> r3 = tf0.C64916p1.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                tf0.p1 r3 = (tf0.C64916p1) r3
                te3.hh0 r3 = r3.Na0()
                int r4 = r1.f29180d
                r5 = -1
                r7 = 10
                r8 = 4
                if (r4 != r8) goto L_0x03ef
                r4 = r23
                bl3.r$a r4 = r6.mo62446e(r4)
                java.lang.Class<os1.o> r6 = os1.C62165o.class
                androidx.lifecycle.i0 r4 = r4.mo75002a(r6)
                os1.o r4 = (os1.C62165o) r4
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.protocal.protobuf.FinderObject>> r6 = r4.f176741e
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
                r8 = 0
            L_0x02f1:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x030d
                java.lang.Object r9 = r6.next()
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                java.lang.Object r11 = r9.getValue()
                java.util.Collection r11 = (java.util.Collection) r11
                boolean r11 = r11.isEmpty()
                r12 = 1
                r11 = r11 ^ r12
                if (r11 == 0) goto L_0x02f1
                r8 = r9
                goto L_0x02f1
            L_0x030d:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "[getThisReadStats] entry is null? "
                r6.append(r9)
                if (r8 != 0) goto L_0x031b
                r9 = 1
                goto L_0x031c
            L_0x031b:
                r9 = 0
            L_0x031c:
                r6.append(r9)
                java.lang.String r9 = " list="
                r6.append(r9)
                if (r8 == 0) goto L_0x0351
                java.lang.Object r9 = r8.getValue()
                java.util.List r9 = (java.util.List) r9
                if (r9 == 0) goto L_0x0351
                java.util.ArrayList r11 = new java.util.ArrayList
                int r12 = sx3.C36907w.m41090l(r9, r7)
                r11.<init>(r12)
                java.util.Iterator r9 = r9.iterator()
            L_0x033b:
                boolean r12 = r9.hasNext()
                if (r12 == 0) goto L_0x0352
                java.lang.Object r12 = r9.next()
                com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
                long r12 = r12.f164794id
                java.lang.String r12 = o40.C61926c.m72691p(r12)
                r11.add(r12)
                goto L_0x033b
            L_0x0351:
                r11 = 0
            L_0x0352:
                r6.append(r11)
                java.lang.String r6 = r6.toString()
                java.lang.String r9 = "Finder.StreamCardVM"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
                if (r8 == 0) goto L_0x03aa
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.tencent.mm.protocal.protobuf.FinderObject>> r4 = r4.f176741e
                java.lang.Object r6 = r8.getKey()
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
                r4.put(r6, r9)
                java.lang.Object r4 = r8.getValue()
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L_0x03aa
                java.util.ArrayList r8 = new java.util.ArrayList
                int r6 = sx3.C36907w.m41090l(r4, r7)
                r8.<init>(r6)
                java.util.Iterator r4 = r4.iterator()
            L_0x0383:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x03ab
                java.lang.Object r6 = r4.next()
                com.tencent.mm.protocal.protobuf.FinderObject r6 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r6
                te3.tu2 r9 = new te3.tu2
                r9.<init>()
                long r11 = r6.f164794id
                r9.f142417d = r11
                r11 = 20
                r9.f142420g = r11
                java.lang.String r6 = r6.sessionBuffer
                r9.f142421h = r6
                r6 = 6
                r9.f142418e = r6
                r12 = 4
                r9.f142419f = r12
                r8.add(r9)
                goto L_0x0383
            L_0x03aa:
                r8 = 0
            L_0x03ab:
                java.lang.String r4 = r1.f29196w
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "[buildStatsRequest] pullType="
                r6.append(r9)
                int r9 = r1.f29181e
                r6.append(r9)
                java.lang.String r9 = " readStats="
                r6.append(r9)
                if (r8 == 0) goto L_0x03cc
                int r9 = r8.size()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x03cd
            L_0x03cc:
                r9 = 0
            L_0x03cd:
                r6.append(r9)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
                if (r8 != 0) goto L_0x03e4
                cm1.e1 r4 = cm1.C55012e1.f154468d
                int r6 = r1.f29180d
                java.util.LinkedList r4 = r4.mo76063g(r6)
                r2.f145377o = r4
                goto L_0x042a
            L_0x03e4:
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>(r8)
                r2.f145377o = r4
                r4 = 1
                r2.f145386x = r4
                goto L_0x042a
            L_0x03ef:
                te3.hj1 r4 = r1.f29183g
                if (r4 == 0) goto L_0x03f6
                int r4 = r4.f134675i
                goto L_0x03f7
            L_0x03f6:
                r4 = -1
            L_0x03f7:
                di3.d r6 = di3.C86312j.m106911c(r22)
                ns3.d r6 = (ns3.C11266d) r6
                ns3.f r6 = r6.mo9188YS()
                boolean r6 = r6.mo10835c(r4)
                if (r6 == 0) goto L_0x0420
                int r6 = r1.f29181e
                r8 = 1
                if (r6 != r8) goto L_0x0420
                java.util.LinkedList<te3.tu2> r6 = r2.f145377o
                di3.d r8 = di3.C86312j.m106911c(r22)
                ns3.d r8 = (ns3.C11266d) r8
                ns3.f r8 = r8.mo9188YS()
                java.util.List r4 = r8.mo10834b(r4)
                r6.addAll(r4)
                goto L_0x042a
            L_0x0420:
                cm1.e1 r4 = cm1.C55012e1.f154468d
                int r6 = r1.f29180d
                java.util.LinkedList r4 = r4.mo76063g(r6)
                r2.f145377o = r4
            L_0x042a:
                up1.f r4 = up1.C37521f.f99374d
                r4.getClass()
                pe1.c<java.lang.Integer> r4 = up1.C37521f.f99416h6
                java.lang.Object r4 = r4.mo60266n()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                r6 = 1
                if (r4 != r6) goto L_0x0453
                int r4 = r1.f29180d
                if (r4 != r6) goto L_0x0453
                int r4 = r1.f29181e
                if (r4 == 0) goto L_0x044a
                r6 = 17
                if (r4 != r6) goto L_0x0453
            L_0x044a:
                cm1.e1 r4 = cm1.C55012e1.f154468d
                r6 = 4
                java.util.LinkedList r4 = r4.mo76063g(r6)
                r2.f145368N = r4
            L_0x0453:
                je1.h2 r4 = je1.C46523h2.f125330a
                te3.ig0 r6 = r2.f145372g
                java.util.LinkedList<te3.tu2> r8 = r2.f145377o
                java.lang.String r9 = "request.readStats"
                gy3.C87412m.m108593f(r8, r9)
                java.util.ArrayList r11 = new java.util.ArrayList
                int r12 = sx3.C36907w.m41090l(r8, r7)
                r11.<init>(r12)
                java.util.Iterator r8 = r8.iterator()
            L_0x046b:
                boolean r12 = r8.hasNext()
                if (r12 == 0) goto L_0x0492
                java.lang.Object r12 = r8.next()
                te3.tu2 r12 = (te3.C51449tu2) r12
                rx3.l r13 = new rx3.l
                int r14 = r12.f142420g
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r20 = r8
                long r7 = r12.f142417d
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r13.<init>(r14, r7)
                r11.add(r13)
                r8 = r20
                r7 = 10
                goto L_0x046b
            L_0x0492:
                r7 = 0
                r4.mo71865g(r6, r11, r7)
                java.util.LinkedList<te3.tu2> r4 = r2.f145377o
                gy3.C87412m.m108593f(r4, r9)
                java.util.Iterator r4 = r4.iterator()
            L_0x049f:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x04ae
                java.lang.Object r6 = r4.next()
                te3.tu2 r6 = (te3.C51449tu2) r6
                r6.f142421h = r15
                goto L_0x049f
            L_0x04ae:
                r2.f145376n = r3
                dp1.c0$a r3 = dp1.C7422c0.f25598H
                int r4 = r1.f29180d
                java.util.LinkedList r3 = r3.mo8560a(r4)
                if (r3 == 0) goto L_0x04bc
                r2.f145382t = r3
            L_0x04bc:
                je1.n1$c r2 = r1.f29197x
                te3.hj1 r3 = r1.f29183g
                if (r3 == 0) goto L_0x04c4
                int r5 = r3.f134675i
            L_0x04c4:
                java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r1.f29184h
                if (r3 == 0) goto L_0x056a
                java.lang.String r3 = r1.f29196w
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "[buildUnreadRequest] tabType="
                r4.append(r6)
                int r6 = r1.f29180d
                r4.append(r6)
                java.lang.String r6 = " unreadList="
                r4.append(r6)
                java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r1.f29184h
                java.util.ArrayList r7 = new java.util.ArrayList
                r9 = 10
                int r11 = sx3.C36907w.m41090l(r6, r9)
                r7.<init>(r11)
                java.util.Iterator r6 = r6.iterator()
            L_0x04ef:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x0528
                java.lang.Object r9 = r6.next()
                com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                long r12 = r9.f164794id
                java.lang.String r12 = o40.C61926c.m72691p(r12)
                r11.append(r12)
                r12 = 32
                r11.append(r12)
                er1.w3 r12 = er1.C58784w3.f168295a
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
                if (r9 == 0) goto L_0x0518
                java.lang.String r9 = r9.description
                if (r9 != 0) goto L_0x0519
            L_0x0518:
                r9 = r15
            L_0x0519:
                java.lang.String r9 = r12.mo83950n0(r9)
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r7.add(r9)
                goto L_0x04ef
            L_0x0528:
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                java.util.LinkedList<te3.do1> r3 = r2.f145384v
                java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r1.f29184h
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r9 = sx3.C36907w.m41090l(r4, r7)
                r6.<init>(r9)
                java.util.Iterator r4 = r4.iterator()
            L_0x0545:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0566
                java.lang.Object r7 = r4.next()
                com.tencent.mm.protocal.protobuf.FinderObject r7 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r7
                te3.do1 r9 = new te3.do1
                r9.<init>()
                long r11 = r7.f164794id
                r9.f132446d = r11
                java.lang.String r7 = r7.objectNonceId
                r9.f132447e = r7
                int r7 = r1.f29180d
                r9.f132448f = r7
                r6.add(r9)
                goto L_0x0545
            L_0x0566:
                r3.addAll(r6)
                goto L_0x0594
            L_0x056a:
                di3.d r3 = di3.C86312j.m106911c(r22)
                ns3.d r3 = (ns3.C11266d) r3
                ns3.f r3 = r3.mo9188YS()
                boolean r3 = r3.mo10835c(r5)
                if (r3 == 0) goto L_0x0594
                int r3 = r1.f29181e
                r4 = 1
                if (r3 != r4) goto L_0x0594
                java.util.LinkedList<te3.do1> r3 = r2.f145384v
                di3.d r4 = di3.C86312j.m106911c(r22)
                ns3.d r4 = (ns3.C11266d) r4
                ns3.f r4 = r4.mo9188YS()
                int r6 = r1.f29180d
                java.util.List r4 = r4.mo10833a(r5, r6)
                r3.addAll(r4)
            L_0x0594:
                je1.h2 r3 = je1.C46523h2.f125330a
                te3.ig0 r4 = r2.f145372g
                java.util.LinkedList<te3.do1> r2 = r2.f145384v
                java.lang.String r6 = "request.markUnreadObjectList"
                gy3.C87412m.m108593f(r2, r6)
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = sx3.C36907w.m41090l(r2, r7)
                r6.<init>(r7)
                java.util.Iterator r2 = r2.iterator()
            L_0x05ae:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x05cd
                java.lang.Object r7 = r2.next()
                te3.do1 r7 = (te3.C49173do1) r7
                rx3.l r9 = new rx3.l
                java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
                long r12 = r7.f132446d
                java.lang.Long r7 = java.lang.Long.valueOf(r12)
                r9.<init>(r11, r7)
                r6.add(r9)
                goto L_0x05ae
            L_0x05cd:
                r7 = 0
                r3.mo71865g(r4, r6, r7)
                je1.n1$c r2 = r1.f29197x
                int r3 = r1.f29180d
                java.lang.String r4 = ", "
                r5 = 4
                if (r3 != r5) goto L_0x062d
                java.lang.String r3 = r1.f29196w
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "buildMachineTabRequest, "
                r5.append(r6)
                te3.sl1 r6 = rs1.C13457t3.f38149j
                r5.append(r6)
                r5.append(r4)
                int r6 = r1.f29180d
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                te3.sl1 r3 = rs1.C13457t3.f38149j
                if (r3 == 0) goto L_0x062d
                java.util.LinkedList<te3.cm1> r2 = r2.f145360F
                te3.cm1 r5 = new te3.cm1
                r5.<init>()
                java.util.LinkedList<te3.c53> r6 = r5.f131823d
                te3.c53 r7 = new te3.c53
                r7.<init>()
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r3.f141585d
                if (r9 == 0) goto L_0x0613
                long r11 = r9.f164794id
                goto L_0x0615
            L_0x0613:
                r11 = r18
            L_0x0615:
                r7.f131529d = r11
                if (r9 == 0) goto L_0x061c
                java.lang.String r9 = r9.objectNonceId
                goto L_0x061d
            L_0x061c:
                r9 = 0
            L_0x061d:
                r7.f131530e = r9
                r6.add(r7)
                pe3.b r6 = r3.f141587f
                r5.f131825f = r6
                int r3 = r3.f141586e
                r5.f131824e = r3
                r2.add(r5)
            L_0x062d:
                r2 = 0
                rs1.C13457t3.f38149j = r2
                je1.n1$c r3 = r1.f29197x
                er1.j4 r5 = er1.C58739j4.f168176a
                te3.kw0 r6 = r5.mo83698a()
                r3.f145365K = r6
                je1.n1$c r3 = r1.f29197x
                r6 = 3
                te3.xw0 r5 = er1.C58739j4.m68251e(r5, r2, r2, r6, r2)
                r3.f145355A = r5
                ob0.c$b r3 = new ob0.c$b
                r3.<init>()
                je1.n1$c r5 = r1.f29197x
                r3.f127066a = r5
                te3.zl1 r5 = new te3.zl1
                r5.<init>()
                te3.ja r6 = new te3.ja
                r6.<init>()
                r5.setBaseResponse(r6)
                te3.ja r6 = r5.getBaseResponse()
                te3.rv3 r7 = new te3.rv3
                r7.<init>()
                r6.f135956e = r7
                r3.f127067b = r5
                boolean r5 = r1.f29186j
                if (r5 != 0) goto L_0x0673
                java.lang.String r5 = "/cgi-bin/micromsg-bin/finderstream"
                r3.f127068c = r5
                r5 = 3901(0xf3d, float:5.466E-42)
                r3.f127069d = r5
                goto L_0x067b
            L_0x0673:
                java.lang.String r5 = "/cgi-bin/micromsg-bin/finderstreamforpush"
                r3.f127068c = r5
                r5 = 4270(0x10ae, float:5.984E-42)
                r3.f127069d = r5
            L_0x067b:
                ob0.c r3 = r3.mo72403a()
                boolean r5 = r1.f29186j
                if (r5 == 0) goto L_0x0687
                r5 = 1
                r3.setIsUserCmd(r5)
            L_0x0687:
                java.lang.String r5 = r1.f29196w
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "[CgiFetchFinderTimeline#init] tabType="
                r6.append(r7)
                int r7 = r1.f29180d
                r6.append(r7)
                r6.append(r10)
                int r7 = r1.f29181e
                r6.append(r7)
                java.lang.String r7 = " lastBuffer="
                r6.append(r7)
                je1.n1$c r7 = r1.f29197x
                pe3.b r7 = r7.f145369d
                if (r7 == 0) goto L_0x06b5
                byte[] r7 = r7.f257327a
                int r7 = r7.length
                java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
                r7 = r17
                goto L_0x06b6
            L_0x06b5:
                r7 = r2
            L_0x06b6:
                r6.append(r7)
                r6.append(r4)
                je1.n1$c r4 = r1.f29197x
                pe3.b r4 = r4.f145369d
                if (r4 != 0) goto L_0x06c5
                java.lang.String r4 = "null"
                goto L_0x06cb
            L_0x06c5:
                byte[] r4 = r4.f257327a
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r4)
            L_0x06cb:
                r6.append(r4)
                java.lang.String r4 = " longitude="
                r6.append(r4)
                je1.n1$c r4 = r1.f29197x
                float r4 = r4.f145373h
                r6.append(r4)
                java.lang.String r4 = " latitude="
                r6.append(r4)
                je1.n1$c r4 = r1.f29197x
                float r4 = r4.f145374i
                r6.append(r4)
                java.lang.String r4 = ",speed="
                r6.append(r4)
                je1.n1$c r1 = r1.f29197x
                if (r1 == 0) goto L_0x06fe
                te3.kw0 r1 = r1.f145365K
                if (r1 == 0) goto L_0x06fe
                te3.jw0 r1 = r1.f137066d
                if (r1 == 0) goto L_0x06fe
                int r1 = r1.f136359d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                goto L_0x06ff
            L_0x06fe:
                r4 = r2
            L_0x06ff:
                r6.append(r4)
                java.lang.String r1 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                r0.mo123453j(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je1.C9342n1.C9355m.<init>(je1.n1, te3.hj1):void");
        }

        /* renamed from: M */
        public C46744d mo8509M() {
            return C46744d.Enable;
        }

        /* renamed from: N */
        public JSONObject mo8506N() {
            JSONObject jSONObject = new JSONObject();
            C9342n1 n1Var = this.f29224t;
            jSONObject.put("tabType", n1Var.f29180d);
            jSONObject.put("pullType", n1Var.f29181e);
            return jSONObject;
        }

        /* renamed from: R0 */
        public JSONObject mo8510R0() {
            return this.f29223s;
        }

        /* renamed from: q */
        public boolean mo10087q() {
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
            r5 = (r5 = r40.getReqResp()).getRespObj();
         */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo332r(int r36, int r37, java.lang.String r38, te3.C49335eu3 r39, ob0.C117747y r40) {
            /*
                r35 = this;
                r6 = r35
                r7 = r36
                r8 = r37
                r9 = r38
                r10 = r39
                te3.zl1 r10 = (te3.C52280zl1) r10
                java.lang.String r0 = "resp"
                gy3.C87412m.m108594g(r10, r0)
                r0 = r35
                r1 = r36
                r2 = r37
                r3 = r38
                r4 = r10
                r5 = r40
                super.mo332r(r1, r2, r3, r4, r5)
                dp1.e0 r0 = dp1.C20480e0.f57583a
                je1.n1 r1 = r6.f29224t
                int r1 = r1.f29180d
                r2 = 0
                r0.mo32034g(r1, r2)
                je1.n1 r1 = r6.f29224t
                int r1 = r1.f29180d
                pe3.b r3 = r10.f146063A
                if (r40 == 0) goto L_0x0042
                com.tencent.mm.network.u r5 = r40.getReqResp()
                if (r5 == 0) goto L_0x0042
                qe3.w$e r5 = r5.getRespObj()
                if (r5 == 0) goto L_0x0042
                te3.iq r5 = r5.getProfile()
                goto L_0x0043
            L_0x0042:
                r5 = 0
            L_0x0043:
                r0.mo32041o(r1, r2, r3, r5)
                if (r7 != 0) goto L_0x004c
                if (r8 != 0) goto L_0x004c
                r3 = 2
                goto L_0x004d
            L_0x004c:
                r3 = 3
            L_0x004d:
                dp1.v r5 = dp1.C7453v.f25647a
                je1.n1 r11 = r6.f29224t
                int r12 = r11.f29180d
                boolean r11 = r11.f29187n
                r5.mo8603d(r12, r2, r11, r3)
                int r3 = r10.f146075j
                if (r3 == 0) goto L_0x005e
                r3 = 1
                goto L_0x005f
            L_0x005e:
                r3 = 0
            L_0x005f:
                int r11 = r10.f146073h
                if (r11 <= 0) goto L_0x0065
                r11 = 1
                goto L_0x0066
            L_0x0065:
                r11 = 0
            L_0x0066:
                int r12 = r10.f146074i
                if (r12 <= 0) goto L_0x006c
                r12 = 1
                goto L_0x006d
            L_0x006c:
                r12 = 0
            L_0x006d:
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r13 = r10.f146069d
                int r13 = r13.size()
                je1.n1 r14 = r6.f29224t
                int r14 = r14.f29180d
                r0.mo32028a(r14, r13)
                long r32 = java.lang.System.currentTimeMillis()
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r0 = r10.f146069d
                java.lang.String r14 = "resp.`object`"
                gy3.C87412m.m108593f(r0, r14)
                je1.n1 r14 = r6.f29224t
                java.util.Iterator r0 = r0.iterator()
            L_0x008b:
                boolean r15 = r0.hasNext()
                java.lang.String r4 = ""
                if (r15 == 0) goto L_0x00ee
                java.lang.Object r15 = r0.next()
                com.tencent.mm.protocal.protobuf.FinderObject r15 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r15
                er1.w3 r5 = er1.C58784w3.f168295a
                java.lang.String r1 = "it"
                gy3.C87412m.m108593f(r15, r1)
                boolean r1 = r5.mo83872H0(r15)
                if (r1 == 0) goto L_0x00e8
                rs1.r$b r1 = rs1.C13383r.f37907d
                rs1.r r1 = r1.mo12791a()
                rs1.r$c r5 = new rs1.r$c
                te3.hj1 r2 = r6.f172731j
                if (r2 == 0) goto L_0x00b7
                int r2 = r2.f134675i
                r17 = r2
                goto L_0x00b9
            L_0x00b7:
                r17 = 0
            L_0x00b9:
                int r2 = r14.f29180d
                r34 = r0
                boolean r0 = r14.f29185i
                r16 = r15
                je1.n1$c r15 = r14.f29197x
                java.lang.String r15 = r15.f145375j
                if (r15 != 0) goto L_0x00ca
                r20 = r4
                goto L_0x00cc
            L_0x00ca:
                r20 = r15
            L_0x00cc:
                r21 = 1
                r24 = 0
                r26 = 0
                r28 = 0
                r30 = 896(0x380, float:1.256E-42)
                r31 = 0
                r4 = r16
                r15 = r5
                r18 = r2
                r19 = r0
                r22 = r32
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r31)
                r1.mo12790b(r5)
                goto L_0x00ea
            L_0x00e8:
                r34 = r0
            L_0x00ea:
                r0 = r34
                r2 = 0
                goto L_0x008b
            L_0x00ee:
                je1.n1 r0 = r6.f29224t
                boolean r0 = r0.f29194u
                if (r0 == 0) goto L_0x0171
                pe3.b r0 = r10.f146063A
                if (r0 == 0) goto L_0x0171
                java.lang.String r0 = r0.mo123705h()
                java.lang.String r2 = "\u0006"
                r5 = 0
                java.lang.String r2 = z04.C112551y.m153814n(r0, r2, r4, r5)
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x010b
                r2 = 1
                goto L_0x010c
            L_0x010b:
                r2 = 0
            L_0x010c:
                if (r2 == 0) goto L_0x0171
                java.util.Calendar r2 = ze1.C16145a.f43335a
                r4 = 2
                int r14 = r2.get(r4)
                r4 = 1
                int r14 = r14 + r4
                r4 = 5
                int r4 = r2.get(r4)
                r15 = 11
                int r15 = r2.get(r15)
                r5 = 12
                int r5 = r2.get(r5)
                r1 = 13
                int r1 = r2.get(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                r14 = 45
                r2.append(r14)
                r2.append(r4)
                r4 = 32
                r2.append(r4)
                r2.append(r15)
                r14 = 58
                r2.append(r14)
                r2.append(r5)
                r2.append(r14)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.util.List<java.lang.String> r2 = ze1.C16145a.f43336b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r5.append(r4)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r0)
            L_0x0171:
                je1.n1 r0 = r6.f29224t
                java.lang.String r0 = r0.f29196w
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[onCgiBack#streamCgi] errType="
                r1.append(r2)
                r1.append(r7)
                java.lang.String r2 = " errCode="
                r1.append(r2)
                r1.append(r8)
                java.lang.String r2 = " errMsg="
                r1.append(r2)
                r1.append(r9)
                java.lang.String r2 = " isGetHistory="
                r1.append(r2)
                r1.append(r11)
                java.lang.String r2 = " isNeedClear="
                r1.append(r2)
                r1.append(r12)
                java.lang.String r2 = " isFetchHistoryNow="
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = " list="
                r1.append(r2)
                r1.append(r13)
                java.lang.String r2 = " isPreload="
                r1.append(r2)
                je1.n1 r2 = r6.f29224t
                boolean r2 = r2.f29185i
                r1.append(r2)
                java.lang.String r2 = " tabType="
                r1.append(r2)
                je1.n1 r4 = r6.f29224t
                int r4 = r4.f29180d
                r1.append(r4)
                java.lang.String r4 = " pullType="
                r1.append(r4)
                je1.n1 r4 = r6.f29224t
                int r4 = r4.f29181e
                r1.append(r4)
                java.lang.String r4 = "isAuto:"
                r1.append(r4)
                je1.n1 r4 = r6.f29224t
                boolean r4 = r4.f29187n
                r1.append(r4)
                java.lang.String r4 = " interval_conf="
                r1.append(r4)
                te3.vl1 r4 = r10.f146085w
                if (r4 == 0) goto L_0x01ed
                r4 = 1
                goto L_0x01ee
            L_0x01ed:
                r4 = 0
            L_0x01ee:
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                org.json.JSONObject r0 = r6.f29223s
                int r1 = r10.f146075j
                java.lang.String r4 = "getHistoryNow"
                r0.put(r4, r1)
                org.json.JSONObject r0 = r6.f29223s
                java.lang.String r1 = "isGetHistory"
                r0.put(r1, r11)
                org.json.JSONObject r0 = r6.f29223s
                int r1 = r10.f146074i
                java.lang.String r4 = "needClear"
                r0.put(r4, r1)
                org.json.JSONObject r0 = r6.f29223s
                java.lang.String r1 = "size"
                r0.put(r1, r13)
                org.json.JSONObject r0 = r6.f29223s
                boolean r1 = rs1.C13539y3.f38388C
                java.lang.String r4 = "systemEnableRotate"
                r0.put(r4, r1)
                if (r7 != 0) goto L_0x0275
                if (r8 != 0) goto L_0x0275
                if (r13 > 0) goto L_0x0245
                if (r11 != 0) goto L_0x0245
                je1.n1 r0 = r6.f29224t
                java.lang.String r1 = "size <= 0 && !isGetHistory"
                java.lang.String r0 = r0.f29196w
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r0 != 0) goto L_0x023d
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 == 0) goto L_0x0245
            L_0x023d:
                je1.o1 r0 = new je1.o1
                r0.<init>(r1)
                o40.C61926c.m72668M(r0)
            L_0x0245:
                if (r12 != 0) goto L_0x0267
                if (r13 <= 0) goto L_0x0267
                je1.n1 r0 = r6.f29224t
                int r1 = r0.f29181e
                r4 = 2
                if (r1 == r4) goto L_0x0267
                java.lang.String r1 = "!isNeedClear && size > 0 && pullType != PULL_TYPE_BOTTOM"
                java.lang.String r0 = r0.f29196w
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r0 != 0) goto L_0x025f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 == 0) goto L_0x0267
            L_0x025f:
                je1.o1 r0 = new je1.o1
                r0.<init>(r1)
                o40.C61926c.m72668M(r0)
            L_0x0267:
                kj2.d r17 = kj2.C117407d.INSTANCE
                r18 = 1279(0x4ff, double:6.32E-321)
                r20 = 150(0x96, double:7.4E-322)
                r22 = 1
                r24 = 0
                r17.idkeyStat(r18, r20, r22, r24)
                goto L_0x0293
            L_0x0275:
                r0 = 4
                if (r7 != r0) goto L_0x0286
                kj2.d r17 = kj2.C117407d.INSTANCE
                r18 = 1279(0x4ff, double:6.32E-321)
                r20 = 151(0x97, double:7.46E-322)
                r22 = 1
                r24 = 0
                r17.idkeyStat(r18, r20, r22, r24)
                goto L_0x0293
            L_0x0286:
                kj2.d r25 = kj2.C117407d.INSTANCE
                r26 = 1279(0x4ff, double:6.32E-321)
                r28 = 152(0x98, double:7.5E-322)
                r30 = 1
                r32 = 0
                r25.idkeyStat(r26, r28, r30, r32)
            L_0x0293:
                je1.n1 r0 = r6.f29224t
                java.lang.String r0 = r0.f29196w
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "[onCgiBack#streamCgi] isPreload="
                r1.append(r4)
                je1.n1 r4 = r6.f29224t
                boolean r4 = r4.f29185i
                r1.append(r4)
                r1.append(r2)
                je1.n1 r2 = r6.f29224t
                int r2 = r2.f29180d
                r1.append(r2)
                java.lang.String r2 = ", tabTipsObjectId="
                r1.append(r2)
                je1.n1 r2 = r6.f29224t
                je1.n1$c r2 = r2.f29197x
                long r4 = r2.f145380r
                java.lang.String r2 = o40.C61926c.m72691p(r4)
                r1.append(r2)
                java.lang.String r2 = ", layoutSize:"
                r1.append(r2)
                te3.tl1 r2 = r10.f146086x
                if (r2 == 0) goto L_0x02da
                java.util.LinkedList<te3.pl1> r2 = r2.f142276e
                if (r2 == 0) goto L_0x02da
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x02db
            L_0x02da:
                r2 = 0
            L_0x02db:
                r1.append(r2)
                java.lang.String r2 = ", "
                r1.append(r2)
                je1.g2 r4 = je1.C9311g2.f29093a
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r10.f146069d
                java.lang.String r4 = r4.mo10062a(r5)
                r1.append(r4)
                r4 = 125(0x7d, float:1.75E-43)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                te3.tl1 r0 = r10.f146086x
                if (r0 == 0) goto L_0x035a
                java.util.LinkedList<te3.pl1> r0 = r0.f142276e
                if (r0 == 0) goto L_0x035a
                je1.n1 r1 = r6.f29224t
                java.util.Iterator r0 = r0.iterator()
            L_0x0308:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x035a
                java.lang.Object r4 = r0.next()
                te3.pl1 r4 = (te3.C64629pl1) r4
                int r5 = r4.f184847n
                if (r5 == 0) goto L_0x0328
                r12 = 1
                if (r5 == r12) goto L_0x0324
                r12 = 2
                if (r5 == r12) goto L_0x0321
                java.lang.String r5 = "others"
                goto L_0x032b
            L_0x0321:
                java.lang.String r5 = "albumList"
                goto L_0x032b
            L_0x0324:
                r12 = 2
                java.lang.String r5 = "liveList"
                goto L_0x032b
            L_0x0328:
                r12 = 2
                java.lang.String r5 = "hotTabList"
            L_0x032b:
                java.lang.String r13 = r1.f29196w
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "[onCgiBack#streamCgi] layoutType:"
                r14.append(r15)
                int r15 = r4.f184847n
                r14.append(r15)
                r14.append(r2)
                r14.append(r5)
                r5 = 58
                r14.append(r5)
                je1.g2 r15 = je1.C9311g2.f29093a
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r4.f184844h
                java.lang.String r4 = r15.mo10062a(r4)
                r14.append(r4)
                java.lang.String r4 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
                goto L_0x0308
            L_0x035a:
                je1.n1 r0 = r6.f29224t
                je1.n1$e r0 = r0.f29190q
                if (r0 == 0) goto L_0x03b9
                boolean r0 = r0.mo3672b(r7, r8, r10)
                if (r0 != 0) goto L_0x0394
                if (r7 != 0) goto L_0x0394
                if (r8 != 0) goto L_0x0394
                if (r11 == 0) goto L_0x0394
                if (r3 == 0) goto L_0x0394
                dp1.e0 r0 = dp1.C20480e0.f57583a
                je1.n1 r1 = r6.f29224t
                int r1 = r1.f29180d
                r2 = 1
                r0.mo32040m(r1, r2)
                je1.n1 r1 = r6.f29224t
                int r1 = r1.f29180d
                r0.mo32034g(r1, r2)
                je1.n1$b r0 = new je1.n1$b
                je1.n1 r1 = r6.f29224t
                pe3.b r2 = r10.f146070e
                r0.<init>(r10, r2)
                nr3.e r0 = r0.mo9225i()
                je1.n1 r1 = r6.f29224t
                jp3.c<jp3.a> r1 = r1.f29192s
                r0.mo11397F(r1)
                goto L_0x03b8
            L_0x0394:
                je1.n1 r0 = r6.f29224t
                je1.n1$d r0 = r0.mo10082e(r10)
                r1 = 1
                r0.f29204G = r1
                if (r40 == 0) goto L_0x03b0
                com.tencent.mm.network.u r1 = r40.getReqResp()
                if (r1 == 0) goto L_0x03b0
                qe3.w$e r1 = r1.getRespObj()
                if (r1 == 0) goto L_0x03b0
                te3.iq r4 = r1.getProfile()
                goto L_0x03b1
            L_0x03b0:
                r4 = 0
            L_0x03b1:
                r0.f29214R = r4
                je1.n1 r1 = r6.f29224t
                r1.mo10084g(r7, r8, r9, r0)
            L_0x03b8:
                return
            L_0x03b9:
                java.lang.String r0 = "config"
                gy3.C87412m.m108603p(r0)
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: je1.C9342n1.C9355m.mo332r(int, int, java.lang.String, te3.eu3, ob0.y):void");
        }

        /* renamed from: s */
        public List mo10027s(C49335eu3 eu32) {
            C52280zl1 zl12 = (C52280zl1) eu32;
            C87412m.m108594g(zl12, "resp");
            LinkedList<FinderObject> linkedList = zl12.f146069d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                FinderItem.C56324a aVar = FinderItem.Companion;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                arrayList.add(aVar.mo79056a(finderObject, 0));
            }
            return arrayList;
        }

        /* renamed from: t */
        public long mo10028t() {
            C49842ig0 ig02 = this.f29224t.f29197x.f145372g;
            if (ig02 != null) {
                return ig02.f135317i;
            }
            return 0;
        }
    }

    public C9342n1(int i, int i2, C89349b bVar, C49712hj1 hj12, List<? extends FinderObject> list, boolean z, boolean z2, boolean z3, int i3, boolean z4) {
        int i4 = i2;
        C49712hj1 hj13 = hj12;
        boolean z5 = z;
        this.f29180d = i;
        this.f29181e = i4;
        this.f29182f = bVar;
        this.f29183g = hj13;
        this.f29184h = list;
        this.f29185i = z5;
        this.f29186j = z2;
        this.f29187n = z3;
        this.f29188o = i3;
        this.f29192s = new C46566c<>();
        this.f29193t = new ConcurrentLinkedQueue<>();
        C37521f.f99374d.getClass();
        this.f29194u = ((Boolean) C37521f.f99350a1.mo60266n()).booleanValue();
        this.f29195v = new AtomicBoolean(false);
        C20480e0.m22095r(C20480e0.f57583a, i, i2, hj12, 0, z4, 8, (Object) null);
        this.f29196w = "Finder.FinderStream#" + i + '#' + i4 + '#' + z5 + '@' + hashCode();
        this.f29197x = new C9345c();
        this.f29198y = new C9355m(this, hj13);
    }

    /* renamed from: a */
    public void mo10079a() {
        this.f29195v.compareAndSet(false, true);
        String str = this.f29196w;
        Log.m105924i(str, "cancelTask: tabType = " + this.f29180d + ", pullType = " + this.f29181e);
    }

    /* renamed from: b */
    public void mo10080b(Object obj) {
        C9346d dVar = (C9346d) obj;
        C87412m.m108594g(dVar, "value");
        String str = this.f29196w;
        Log.m105924i(str, "hitPreloadCache: tabType = " + this.f29180d + ", pullType = " + this.f29181e);
        mo10084g(dVar.f29210M, dVar.f29211N, dVar.f29212P, dVar);
    }

    /* renamed from: d */
    public final C9342n1 mo10081d(C10497i iVar, int i) {
        C87412m.m108594g(iVar, "interceptor");
        this.f29193t.add(new C10498j(iVar, i));
        return this;
    }

    /* renamed from: e */
    public final C9346d mo10082e(C52280zl1 zl12) {
        C9346d dVar = new C9346d();
        C9345c cVar = this.f29197x;
        C87412m.m108594g(cVar, "<set-?>");
        dVar.f29209L = cVar;
        dVar.f146072g = zl12.f146072g;
        dVar.f146071f = zl12.f146071f;
        dVar.f146069d.addAll(zl12.f146069d);
        dVar.f146080r.addAll(zl12.f146080r);
        dVar.f146073h = zl12.f146073h;
        dVar.f146074i = zl12.f146074i;
        dVar.f146075j = zl12.f146075j;
        dVar.f146077o = zl12.f146077o;
        dVar.f146079q = zl12.f146079q;
        dVar.f146076n = zl12.f146076n;
        dVar.f146067E = zl12.f146067E;
        dVar.f146082t = zl12.f146082t;
        dVar.f146078p = zl12.f146078p;
        dVar.f146081s = zl12.f146081s;
        dVar.f146070e = zl12.f146070e;
        dVar.f29205H = zl12.f146069d.size();
        dVar.f146083u = zl12.f146083u;
        dVar.f146084v = zl12.f146084v;
        dVar.f146085w = zl12.f146085w;
        dVar.f146068F = zl12.f146068F;
        dVar.f146086x = zl12.f146086x;
        dVar.f146063A = zl12.f146063A;
        return dVar;
    }

    /* renamed from: f */
    public Object mo10083f(C15601d<? super C9346d> dVar) {
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C9343a aVar = this.f29189p;
        if (aVar != null) {
            C8477a0 a0Var = new C8477a0();
            this.f29191r = new C9353k(a0Var, this, hVar);
            this.f29189p = new C9354l(aVar, a0Var, hVar);
            mo10086i();
            return hVar.mo90314b();
        }
        C87412m.m108603p("callback");
        throw null;
    }

    /* renamed from: g */
    public final void mo10084g(int i, int i2, String str, C9346d dVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C9346d dVar2 = dVar;
        C58341h.C58344f fVar = C58341h.C58344f.RefreshContinue;
        String str3 = this.f29196w;
        Log.m105924i(str3, "onCgiBack tabType=" + this.f29180d + " pullType:" + this.f29181e);
        C9347e eVar = this.f29190q;
        if (eVar != null) {
            eVar.mo3671a();
            C0344g gVar = C0344g.f929a;
            C51974xh1 xh12 = dVar2.f146077o;
            LinkedList<FinderObject> linkedList = dVar2.f146069d;
            C87412m.m108593f(linkedList, "resp.`object`");
            gVar.mo386b(xh12, linkedList, 3901);
            List<T> o0 = C110818d0.m150943o0(this.f29193t, new C9350h());
            ArrayList arrayList = new ArrayList(C36907w.m41090l(o0, 10));
            for (T t : o0) {
                arrayList.add((C10497i) t.f31733a);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10497i iVar = (C10497i) it.next();
                if (iVar.mo10788c(dVar2, this.f29180d, this.f29181e)) {
                    String str4 = this.f29196w;
                    Log.m105928w(str4, "[onCgiBack] Interceptor is interrupted by " + iVar);
                    break;
                }
            }
            if (!(i3 == 0 && i4 == 0)) {
                C20480e0.f57583a.mo32046u(this.f29180d, this.f29183g);
            }
            dVar2.f29210M = i3;
            dVar2.f29211N = i4;
            dVar2.f29212P = str2;
            C9347e eVar2 = this.f29190q;
            if (eVar2 == null) {
                C87412m.m108603p("config");
                throw null;
            } else if (!eVar2.mo3672b(i, i2, dVar2)) {
                C9343a aVar = this.f29189p;
                if (aVar != null) {
                    List<T> o05 = C110818d0.m150943o0(this.f29193t, new C9349g());
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(o05, 10));
                    for (T t2 : o05) {
                        arrayList2.add((C10497i) t2.f31733a);
                    }
                    aVar.mo3675a(i, i2, str, dVar, C110818d0.m150953y0(arrayList2));
                    return;
                }
                C87412m.m108603p("callback");
                throw null;
            } else {
                int i5 = this.f29181e;
                if (i5 == 0 || i5 == 1 || i5 == 4) {
                    C58341h f3 = ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).mo78457f3(this.f29180d);
                    if (i3 == 0 && i4 == 0) {
                        C9346d e = mo10082e(dVar2);
                        if (f3 != null) {
                            int i6 = this.f29181e;
                            C58341h.C58343d dVar3 = new C58341h.C58343d();
                            dVar3.f167055a = e.mo10088b().f145380r;
                            dVar3.f167056b = e.mo10088b().f145371f;
                            C13598b0 b0Var = C13598b0.f38549a;
                            f3.mo83096r(e, fVar, i6, dVar3, 0);
                        }
                    } else if (f3 != null) {
                        f3.mo83098u(false, fVar);
                    }
                }
                C9348f fVar2 = this.f29191r;
                if (fVar2 != null) {
                    fVar2.mo10089a(i, i2, str2, dVar2);
                }
            }
        } else {
            C87412m.m108603p("config");
            throw null;
        }
    }

    public Object getKey() {
        int i = this.f29181e;
        if (i == 0 || i == 1 || i == 4) {
            i = 0;
        } else if (i == 3 || i == 5 || i == 6 || i == 7 || i == 8 || i == 17 || i == 9 || i == 20) {
            i = 3;
        }
        return "Finder.FinderStream.tabType" + this.f29180d + ",pullType" + i;
    }

    /* renamed from: h */
    public final void mo10085h() {
        C9347e eVar = this.f29190q;
        if (eVar != null) {
            eVar.mo3674d(this.f29197x);
            C20480e0.f57583a.mo32041o(this.f29180d, true, (C89349b) null, (C90420iq) null);
            C7453v.f25647a.mo8603d(this.f29180d, true, this.f29187n, 1);
            this.f29198y.mo9225i();
            return;
        }
        C87412m.m108603p("config");
        throw null;
    }

    /* renamed from: i */
    public final void mo10086i() {
        C9346d t;
        boolean z;
        String str = this.f29196w;
        Log.m105924i(str, "run: tabType = " + this.f29180d + ", pullType = " + this.f29181e);
        C20480e0 e0Var = C20480e0.f57583a;
        C20480e0.m22094n(e0Var, this.f29180d, true, (C49712hj1) null, false, 0, false, 60, (Object) null);
        C9345c cVar = this.f29197x;
        C9347e eVar = this.f29190q;
        C13598b0 b0Var = null;
        if (eVar != null) {
            cVar.f29202P = eVar.mo3673c();
            boolean z2 = true;
            if (this.f29197x.f29202P) {
                e0Var.mo32040m(this.f29180d, true);
                new C9344b((C52280zl1) null, this.f29182f).mo9225i().mo11397F(this.f29192s);
                return;
            }
            C58341h f3 = ((FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class)).mo78457f3(this.f29180d);
            int i = this.f29181e;
            boolean z3 = false;
            boolean z4 = (i == 1 || i == 0) ? false : true;
            if (this.f29185i || z4) {
                if (z4) {
                    if (f3 != null) {
                        z3 = f3.mo83089e(true, "CgiFinderStream");
                    }
                    if (z3) {
                        C58332b.m67542a(C58332b.f167018a, 0, 0, 3, 2, false, 0, false, 115, (Object) null);
                    }
                }
                C9347e eVar2 = this.f29190q;
                if (eVar2 != null) {
                    eVar2.mo3674d(this.f29197x);
                    e0Var.mo32041o(this.f29180d, true, (C89349b) null, (C90420iq) null);
                    C7453v.f25647a.mo8603d(this.f29180d, true, this.f29187n, 1);
                    this.f29198y.mo9225i();
                    return;
                }
                C87412m.m108603p("config");
                throw null;
            } else if (this.f29188o == 1 && this.f29180d == 4) {
                mo10085h();
            } else {
                if (!(f3 == null || (t = C58341h.m67553t(f3, i, false, new C9351i(this), 2, (Object) null)) == null)) {
                    if (MediaPreloadCore.f160304p) {
                        C61926c.m72668M(new C9352j(this));
                    }
                    String str2 = this.f29196w;
                    Log.m105924i(str2, "[run] use preload cache. tabType=" + this.f29180d + " pullType=" + this.f29181e);
                    LinkedList<FinderObject> linkedList = t.f146069d;
                    C87412m.m108593f(linkedList, "it.`object`");
                    FinderObject finderObject = (FinderObject) C110818d0.m150916N(linkedList);
                    if (finderObject != null) {
                        if (C58739j4.f168176a.mo83711h(finderObject) != 2) {
                            z2 = false;
                        }
                        z = z2;
                    } else {
                        z = false;
                    }
                    e0Var.mo32042p(this.f29180d, t.f146063A, t.f29213Q, t.f29214R, z, false);
                    mo10084g(0, 0, (String) null, t);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    mo10085h();
                }
            }
        } else {
            C87412m.m108603p("config");
            throw null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9342n1(int r14, int r15, pe3.C89349b r16, te3.C49712hj1 r17, java.util.List r18, boolean r19, boolean r20, boolean r21, int r22, boolean r23, int r24, gy3.C8480h r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r7 = r1
            goto L_0x000b
        L_0x0009:
            r7 = r18
        L_0x000b:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r8 = 0
            goto L_0x0014
        L_0x0012:
            r8 = r19
        L_0x0014:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001a
            r9 = 0
            goto L_0x001c
        L_0x001a:
            r9 = r20
        L_0x001c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0022
            r10 = 0
            goto L_0x0024
        L_0x0022:
            r10 = r21
        L_0x0024:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002a
            r11 = 0
            goto L_0x002c
        L_0x002a:
            r11 = r22
        L_0x002c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0032
            r12 = 0
            goto L_0x0034
        L_0x0032:
            r12 = r23
        L_0x0034:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9342n1.<init>(int, int, pe3.b, te3.hj1, java.util.List, boolean, boolean, boolean, int, boolean, int, gy3.h):void");
    }
}
