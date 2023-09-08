package iw2;

import bw2.C92326a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cw2.C97393p;
import di3.C86312j;
import dw2.C45455c;
import ew2.C97758b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32229r;
import gw2.C98266k;
import gw2.C98267l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jw2.C99069d;
import kw2.C99266g;
import kw2.C99268i;
import kw2.C99269j;
import o40.C61926c;
import ob0.C11385n;
import p232rw.C101476o;
import p749xh.C66261f3;
import rx3.C13598b0;
import sl0.C22368l;
import sx3.C110818d0;
import sx3.C64197v;
import zv2.C103109c;

/* renamed from: iw2.g0 */
public class C98830g0 extends C98862q implements C11385n {

    /* renamed from: e */
    public final String f289722e;

    /* renamed from: f */
    public final List<String> f289723f;

    /* renamed from: g */
    public final C98858n f289724g;

    /* renamed from: h */
    public final Map<String, ArrayList<Long>> f289725h;

    /* renamed from: i */
    public final String f289726i = "MicroMsg.SelfHistoryGalleryPresenter";

    /* renamed from: j */
    public final ArrayList<ArrayList<C98266k>> f289727j = new ArrayList<>();

    /* renamed from: n */
    public final ArrayList<C98860o> f289728n = new ArrayList<>();

    /* renamed from: o */
    public final LinkedList<String> f289729o = new LinkedList<>();

    /* renamed from: p */
    public boolean f289730p;

    /* renamed from: q */
    public int f289731q = -1;

    /* renamed from: r */
    public int f289732r = -1;

    /* renamed from: s */
    public int f289733s = -1;

    /* renamed from: t */
    public int f289734t = -1;

    /* renamed from: u */
    public boolean f289735u;

    /* renamed from: v */
    public ArrayList<String> f289736v;

    /* renamed from: w */
    public boolean f289737w;

    /* renamed from: x */
    public final C32229r<Long, Boolean, String, String, C13598b0> f289738x;

    /* renamed from: iw2.g0$a */
    public static final class C98831a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289739d;

        /* renamed from: e */
        public final /* synthetic */ int f289740e;

        public C98831a(C98830g0 g0Var, int i) {
            this.f289739d = g0Var;
            this.f289740e = i;
        }

        public final void run() {
            if (this.f289739d.f289728n.get(this.f289740e).f289798a != 2) {
                C98830g0 g0Var = this.f289739d;
                g0Var.f289729o.add(g0Var.f289736v.get(this.f289740e));
            }
            int i = this.f289740e + 1;
            if (i < this.f289739d.f289736v.size()) {
                C98830g0 g0Var2 = this.f289739d;
                g0Var2.f289729o.add(g0Var2.f289736v.get(i));
                this.f289739d.mo138208n();
            }
        }
    }

    /* renamed from: iw2.g0$b */
    public static final class C98832b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289741d;

        /* renamed from: e */
        public final /* synthetic */ int f289742e;

        /* renamed from: f */
        public final /* synthetic */ int f289743f;

        /* renamed from: iw2.g0$b$a */
        public static final class C98833a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C98830g0 f289744d;

            /* renamed from: e */
            public final /* synthetic */ C98266k f289745e;

            public C98833a(C98830g0 g0Var, C98266k kVar) {
                this.f289744d = g0Var;
                this.f289745e = kVar;
            }

            public final void run() {
                Class cls = C101476o.class;
                String str = this.f289744d.f289726i;
                Log.m105924i(str, "LogStory: deleteItem fake " + this.f289745e);
                C97393p.f285894a.mo136657a(this.f289745e.f288082e.f288088a);
                String str2 = this.f289745e.f288082e.f288094g;
                C87412m.m108594g(str2, "taskId");
                Log.m105924i("MicroMsg.StoryMixManager", "run cleanNullData data");
                ((C101476o) C86312j.m106911c(cls)).mo140779XR(str2);
                String str3 = this.f289745e.f288082e.f288094g;
                C87412m.m108594g(str3, "taskId");
                Log.m105924i("MicroMsg.StoryMixManager", "run cleanUnAvailableData data");
                ((C101476o) C86312j.m106911c(cls)).uh0(str3);
            }
        }

        public C98832b(C98830g0 g0Var, int i, int i2) {
            this.f289741d = g0Var;
            this.f289742e = i;
            this.f289743f = i2;
        }

        public final void run() {
            C98830g0 g0Var = this.f289741d;
            int i = this.f289742e;
            g0Var.f289731q = i;
            g0Var.f289732r = this.f289743f;
            Object obj = g0Var.f289727j.get(i).get(this.f289743f);
            C87412m.m108593f(obj, "dateGalleryMap[row][column]");
            C98266k kVar = (C98266k) obj;
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i Yt = hVar.mo134191i().mo138667Yt(kVar.f288082e.f288088a);
            C99269j i2 = hVar.mo134191i();
            StringBuilder sb = new StringBuilder();
            sb.append(kVar.f288082e.f288088a);
            sb.append('_');
            sb.append(kVar.f288082e.f288090c);
            String sb4 = sb.toString();
            C87412m.m108594g(sb4, C66261f3.COL_LOCALID);
            i2.f291094i.add(sb4);
            if (Yt != null) {
                C98830g0 g0Var2 = this.f289741d;
                String str = g0Var2.f289726i;
                Log.m105924i(str, "LogStory: deleteItem2 storyinfo " + kVar + " deleteItemRow " + g0Var2.f289731q + " deleteItemCol " + g0Var2.f289732r + " localid " + kVar.f288082e.f288088a + ' ' + Yt.field_storyID);
                long j = Yt.field_storyID;
                if (j == 0) {
                    C97393p.f285894a.mo136657a(kVar.f288082e.f288088a);
                    C61926c.m72668M(new C98839h0(true, g0Var2));
                } else if (!(g0Var2.f289731q == -1 || g0Var2.f289732r == -1)) {
                    C97393p.f285894a.mo136658b(j, kVar.f288082e.f288088a);
                }
            }
            if (kVar.f288082e.mo137567a()) {
                hVar.mo134194l().post(new C98833a(this.f289741d, kVar));
            }
        }
    }

    /* renamed from: iw2.g0$c */
    public static final class C98834c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289746d;

        /* renamed from: e */
        public final /* synthetic */ int f289747e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98834c(C98830g0 g0Var, int i) {
            super(0);
            this.f289746d = g0Var;
            this.f289747e = i;
        }

        public Object invoke() {
            this.f289746d.f289724g.mo134400h(this.f289747e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.g0$d */
    public static final class C98835d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289748d;

        /* renamed from: e */
        public final /* synthetic */ int f289749e;

        /* renamed from: f */
        public final /* synthetic */ List<C98266k> f289750f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98835d(C98830g0 g0Var, int i, List<C98266k> list) {
            super(0);
            this.f289748d = g0Var;
            this.f289749e = i;
            this.f289750f = list;
        }

        public Object invoke() {
            this.f289748d.f289724g.mo134399g(this.f289749e, this.f289750f);
            this.f289748d.f289724g.mo134403k(this.f289749e);
            this.f289748d.f289724g.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.g0$e */
    public static final class C98836e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289751d;

        /* renamed from: e */
        public final /* synthetic */ int f289752e;

        public C98836e(C98830g0 g0Var, int i) {
            this.f289751d = g0Var;
            this.f289752e = i;
        }

        public final void run() {
            if (this.f289751d.f289728n.get(this.f289752e).f289798a != 2) {
                C98830g0 g0Var = this.f289751d;
                g0Var.f289729o.add(g0Var.f289736v.get(this.f289752e));
            }
            int i = this.f289752e + 1;
            if (i < this.f289751d.f289736v.size()) {
                C98830g0 g0Var2 = this.f289751d;
                g0Var2.f289729o.add(g0Var2.f289736v.get(i));
                this.f289751d.mo138208n();
            }
            C98830g0 g0Var3 = this.f289751d;
            g0Var3.getClass();
            StoryCore.f281736t.mo134194l().post(new C98852l0(g0Var3));
        }
    }

    /* renamed from: iw2.g0$f */
    public static final class C98837f extends C87413o implements C32229r<Long, Boolean, String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98830g0 f289753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98837f(C98830g0 g0Var) {
            super(4);
            this.f289753d = g0Var;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int i;
            long longValue = ((Number) obj).longValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g((String) obj3, "fromUser");
            C87412m.m108594g((String) obj4, "storyOwner");
            C99268i Ow = StoryCore.f281736t.mo134191i().mo138664Ow(longValue);
            if (Ow != null) {
                C98830g0 g0Var = this.f289753d;
                Iterator<String> it = g0Var.f289736v.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (Util.isEqual(it.next(), C92326a.f264186a.mo126326a(Integer.valueOf(Ow.field_createTime)))) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    ArrayList<C98266k> arrayList = g0Var.f289727j.get(i2);
                    C87412m.m108593f(arrayList, "dateGalleryMap[rowIndex]");
                    ArrayList arrayList2 = arrayList;
                    Iterator it4 = arrayList2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((C98266k) it4.next()).f288081d == longValue) {
                            i = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i != -1) {
                        C61926c.m72668M(new C98859n0(booleanValue, g0Var, i2, i, arrayList2, new C98266k(Ow, Ow.mo138657p2(), C98267l.NORMAL)));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C98830g0(String str, List<String> list, C98858n nVar, Map<String, ? extends ArrayList<Long>> map, int i) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "dates");
        C87412m.m108594g(nVar, "galleryUserCallback");
        C87412m.m108594g(map, "storyFilterList");
        this.f289722e = str;
        this.f289723f = list;
        this.f289724g = nVar;
        this.f289725h = map;
        this.f289735u = C61926c.m72696u(i, 4);
        this.f289736v = new ArrayList<>();
        this.f289738x = new C98837f(this);
        this.f289736v.addAll(list);
        nVar.mo134393a(this.f289736v.size());
        Iterator<String> it = this.f289736v.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String str2 = this.f289726i;
            Log.m105924i(str2, "LogStory: " + next);
            this.f289727j.add(new ArrayList());
            this.f289728n.add(new C98860o(next));
        }
        C97758b.f286820d.mo137087a(this.f289738x);
        C86709a0.m107529k().f251779b.mo123455a(764, this);
        C86709a0.m107529k().f251779b.mo123455a(C22368l.CTRL_INDEX, this);
        this.f289737w = C103109c.f304232b.mo108963a();
    }

    /* renamed from: a */
    public void mo138190a(int i, int i2) {
        this.f289731q = -1;
        this.f289732r = -1;
        C86709a0.m107529k().f251779b.mo123457c(764);
    }

    /* renamed from: b */
    public void mo138204b(int i) {
        StoryCore.f281736t.mo134194l().post(new C98831a(this, i));
    }

    /* renamed from: c */
    public void mo138191c(int i, int i2) {
        String str = this.f289726i;
        Log.m105924i(str, "LogStory: deleteItem " + i);
        if (i >= 0 && i < this.f289736v.size() && i2 >= 0 && i2 < this.f289727j.get(i).size()) {
            StoryCore.f281736t.mo134194l().post(new C98832b(this, i, i2));
        }
    }

    /* renamed from: d */
    public void mo138192d() {
        C97758b.f286820d.mo137095j(this.f289738x);
        C86709a0.m107529k().f251779b.mo123470p(C22368l.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(764, this);
    }

    /* renamed from: e */
    public void mo138205e(int i) {
    }

    /* renamed from: f */
    public void mo138193f() {
        int i = 0;
        for (T next : this.f289736v) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) next;
                this.f289728n.get(i).f289798a = 1;
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int i3 = 0;
        for (T next2 : this.f289736v) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                String str2 = (String) next2;
                String str3 = this.f289736v.get(i3);
                C87412m.m108593f(str3, "dateList[dateIndex]");
                String str4 = str3;
                ArrayList<C98266k> arrayList = this.f289727j.get(i3);
                C87412m.m108593f(arrayList, "dateGalleryMap[dateIndex]");
                ArrayList arrayList2 = arrayList;
                C98860o oVar = this.f289728n.get(i3);
                C87412m.m108593f(oVar, "dateState[dateIndex]");
                C98860o oVar2 = oVar;
                if (this.f289735u) {
                    ArrayList<C98266k> b = C98862q.f289801d.mo138221b(this.f289722e, str4);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<C98266k> it = b.iterator();
                    while (it.hasNext()) {
                        C98266k next3 = it.next();
                        C98266k kVar = next3;
                        ArrayList arrayList4 = this.f289725h.get(str4);
                        C98860o oVar3 = oVar2;
                        if (arrayList4 != null ? arrayList4.contains(Long.valueOf(kVar.f288081d)) : true) {
                            arrayList3.add(next3);
                        }
                        oVar2 = oVar3;
                    }
                    C98860o oVar4 = oVar2;
                    if (!arrayList3.isEmpty()) {
                        arrayList2.addAll(arrayList3);
                        oVar4.f289798a = 2;
                        String str5 = this.f289726i;
                        Log.m105924i(str5, "LogStory: preload Db with filter data " + arrayList3.size());
                    }
                } else {
                    C99266g jo = StoryCore.f281736t.mo134190h().mo138652jo(str4);
                    int i5 = jo != null ? jo.field_count : 0;
                    String str6 = this.f289726i;
                    Log.m105924i(str6, "LogStory: preloadForDate " + str4 + " historyCount " + i5);
                    ArrayList<C98266k> b2 = C98862q.f289801d.mo138221b(this.f289722e, str4);
                    if (b2.size() > 0) {
                        arrayList2.addAll(b2);
                        if (b2.size() == i5) {
                            oVar2.f289798a = 2;
                        } else {
                            oVar2.f289798a = 1;
                        }
                        String str7 = this.f289726i;
                        Log.m105924i(str7, "LogStory: preload Db data " + b2.size());
                    } else if (i5 != 0) {
                        oVar2.f289798a = 1;
                        Log.m105924i(this.f289726i, "LogStory: initLoad Sync data");
                    }
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (this.f289736v.size() > 0) {
            this.f289729o.add(C110818d0.m150914L(this.f289736v));
            mo138208n();
        }
        int i6 = 0;
        for (T next4 : this.f289736v) {
            int i7 = i6 + 1;
            if (i6 >= 0) {
                String str8 = (String) next4;
                String str9 = this.f289736v.get(i6);
                C87412m.m108593f(str9, "dateList[index]");
                ArrayList<C98266k> arrayList5 = this.f289727j.get(i6);
                C87412m.m108593f(arrayList5, "dateGalleryMap[index]");
                mo138209o(str9, arrayList5);
                i6 = i7;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: g */
    public void mo138194g(int i) {
    }

    /* renamed from: h */
    public void mo138195h(int i, int i2, boolean z) {
        if (i != 3) {
            return;
        }
        if (!z) {
            StoryCore.f281736t.mo134194l().post(new C98849k0(this));
        } else if (i2 == 0) {
            StoryCore.f281736t.mo134194l().post(new C98856m0(this));
        } else if (i2 == 1) {
            StoryCore.f281736t.mo134194l().post(new C98849k0(this));
        }
    }

    /* renamed from: i */
    public void mo138196i(int i, int i2) {
        this.f289733s = i;
        this.f289734t = i2;
        String str = this.f289726i;
        Log.m105918d(str, "onSelected row=" + i + " column=" + i2);
        StoryCore.f281736t.mo134194l().post(new C98836e(this, i));
    }

    /* renamed from: j */
    public void mo138206j() {
    }

    /* renamed from: k */
    public void mo138207k() {
    }

    /* renamed from: l */
    public void mo138197l(int i, int i2, boolean z, C99268i iVar) {
        int i3 = i;
        int i4 = i2;
        Log.m105924i(this.f289726i, "LogStory: setFavorite " + i4);
        if (i3 >= 0 && i3 < this.f289736v.size() && i4 >= 0 && i4 < this.f289727j.get(i3).size()) {
            boolean z2 = !z;
            Object obj = this.f289727j.get(i3).get(i4);
            C87412m.m108593f(obj, "dateGalleryMap[row][column]");
            C98266k kVar = (C98266k) obj;
            Log.m105924i(this.f289726i, "LogStory: setFavorite storyinfo " + kVar + " localid " + kVar.f288082e.f288088a + " targetFavorite:" + z2);
            C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt((int) kVar.f288078a.systemRowid);
            if (Yt != null) {
                if (z2) {
                    C115669n.INSTANCE.mo175913w(1045, 0, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1045, 1, 1);
                }
                C99069d.m129023f(C99069d.f290418a, z2 ? 1 : 2, String.valueOf(Yt.field_storyID), 2, 0, 0, 16, (Object) null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(Long.valueOf(Yt.field_storyID));
                arrayList2.add(Integer.valueOf((int) Yt.systemRowid));
                C97393p.f285894a.mo136662f(arrayList, arrayList2, z2);
            }
        }
    }

    /* renamed from: m */
    public void mo138198m(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2;
        Log.m105924i(this.f289726i, "LogStory: setPrivacy row:" + i3 + " column:" + i4);
        if (i3 >= 0 && i3 < this.f289736v.size() && i4 >= 0 && i4 < this.f289727j.get(i3).size()) {
            boolean z2 = !z;
            Object obj = this.f289727j.get(i3).get(i4);
            C87412m.m108593f(obj, "dateGalleryMap[row][column]");
            C98266k kVar = (C98266k) obj;
            Log.m105924i(this.f289726i, "LogStory: setPrivacy storyinfo " + kVar + " targetPrivacy:" + z2);
            C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt((int) kVar.f288078a.systemRowid);
            if (Yt != null) {
                if (z2) {
                    C115669n.INSTANCE.mo175913w(1045, 2, 1);
                } else {
                    C115669n.INSTANCE.mo175913w(1045, 3, 1);
                }
                C99069d.m129023f(C99069d.f290418a, z2 ? 3 : 4, String.valueOf(Yt.field_storyID), 2, 0, 0, 16, (Object) null);
                C97393p.f285894a.mo136663g(Yt.field_storyID, (int) Yt.systemRowid, z2, Yt.mo138658q2());
            }
        }
    }

    /* renamed from: n */
    public final void mo138208n() {
        if (!this.f289730p && this.f289729o.size() > 0) {
            String str = this.f289729o.get(0);
            C87412m.m108593f(str, "loadingIndexQueue[0]");
            String str2 = str;
            int indexOf = this.f289736v.indexOf(str2);
            if (indexOf >= 0 && indexOf < this.f289728n.size()) {
                String str3 = this.f289726i;
                Log.m105924i(str3, "LogStory: loadRemoteForDate " + str2);
                if (this.f289728n.get(indexOf).f289798a != 2) {
                    C86709a0.m107529k().f251779b.mo123460f(new C45455c(this.f289722e, 0, str2));
                    this.f289730p = true;
                    return;
                }
                this.f289729o.remove(0);
                mo138208n();
            }
        }
    }

    /* renamed from: o */
    public final void mo138209o(String str, List<C98266k> list) {
        int indexOf = this.f289736v.indexOf(str);
        if (list.isEmpty()) {
            C61926c.m72668M(new C98834c(this, indexOf));
        } else {
            C61926c.m72668M(new C98835d(this, indexOf, list));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d0, code lost:
        r11 = (dw2.C45456e) r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
        /*
            r7 = this;
            java.lang.String r0 = "scene"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = r7.f289726i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LogStory: "
            r1.append(r2)
            r1.append(r8)
            r2 = 32
            r1.append(r2)
            r1.append(r9)
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            boolean r10 = r11 instanceof dw2.C45455c
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x00cc
            r10 = r11
            dw2.c r10 = (dw2.C45455c) r10
            java.lang.String r10 = r10.f123028d
            java.lang.String r3 = r7.f289722e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r3)
            if (r10 == 0) goto L_0x00cc
            java.util.LinkedList<java.lang.String> r8 = r7.f289729o
            java.lang.Object r8 = r8.poll()
            java.lang.String r8 = (java.lang.String) r8
            java.util.ArrayList<java.lang.String> r9 = r7.f289736v
            int r8 = r9.indexOf(r8)
            if (r8 < 0) goto L_0x0056
            java.util.ArrayList<iw2.o> r9 = r7.f289728n
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x0211
            r7.f289730p = r0
            java.util.ArrayList<iw2.o> r9 = r7.f289728n
            java.lang.Object r9 = r9.get(r8)
            iw2.o r9 = (iw2.C98860o) r9
            r10 = 2
            r9.f289798a = r10
            java.lang.String r9 = r7.f289726i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "LogStory: updateUserGalleryItemsFromDb "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.util.ArrayList<java.lang.String> r9 = r7.f289736v
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r10 = "dateList[dateIndex]"
            gy3.C87412m.m108593f(r9, r10)
            java.lang.String r9 = (java.lang.String) r9
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r10 = r7.f289727j
            java.lang.Object r8 = r10.get(r8)
            java.lang.String r10 = "dateGalleryMap[dateIndex]"
            gy3.C87412m.m108593f(r8, r10)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            iw2.q$a r10 = iw2.C98862q.f289801d
            java.lang.String r11 = r7.f289722e
            java.util.ArrayList r10 = r10.mo138221b(r11, r9)
            r8.clear()
            r8.addAll(r10)
            java.lang.String r10 = r7.f289726i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "LogStory: db data "
            r11.append(r0)
            r11.append(r9)
            r11.append(r2)
            int r0 = r8.size()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            r7.mo138209o(r9, r8)
            r7.mo138208n()
            goto L_0x0211
        L_0x00cc:
            boolean r10 = r11 instanceof dw2.C45456e
            if (r10 == 0) goto L_0x0211
            dw2.e r11 = (dw2.C45456e) r11
            dw2.a r10 = r11.mo70944j1()
            if (r10 == 0) goto L_0x0211
            boolean r2 = r10 instanceof dw2.C45467j
            if (r2 == 0) goto L_0x0107
            if (r9 != 0) goto L_0x00fa
            java.util.List<java.lang.Integer> r8 = r11.f123035e
            java.util.Iterator r8 = r8.iterator()
        L_0x00e4:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00fa
            java.lang.Object r10 = r8.next()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            cw2.p$a r11 = cw2.C97393p.f285894a
            r11.mo136657a(r10)
            goto L_0x00e4
        L_0x00fa:
            if (r9 != 0) goto L_0x00fd
            r0 = 1
        L_0x00fd:
            iw2.h0 r8 = new iw2.h0
            r8.<init>(r0, r7)
            o40.C61926c.m72668M(r8)
            goto L_0x0211
        L_0x0107:
            boolean r2 = r10 instanceof dw2.C45468k
            if (r2 == 0) goto L_0x0195
            java.lang.String r2 = r7.f289726i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r8 = ", errcode:"
            r3.append(r8)
            r3.append(r9)
            java.lang.String r8 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            if (r9 != 0) goto L_0x0211
            java.util.List<java.lang.Integer> r8 = r11.f123035e
            java.util.Iterator r8 = r8.iterator()
        L_0x0132:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0180
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r11 = r10
            dw2.k r11 = (dw2.C45468k) r11
            int r11 = r11.f123064c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setPrivacyLocal story item: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " to "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.StoryInfoStorageLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            com.tencent.mm.plugin.story.model.StoryCore$h r2 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            kw2.j r2 = r2.mo134191i()
            kw2.i r9 = r2.mo138667Yt(r9)
            if (r9 == 0) goto L_0x0132
            r3 = 4
            if (r11 != r1) goto L_0x0179
            r9.mo138653l2(r3)
            goto L_0x017c
        L_0x0179:
            r9.mo138659r2(r3)
        L_0x017c:
            r2.replace(r9)
            goto L_0x0132
        L_0x0180:
            dw2.k r10 = (dw2.C45468k) r10
            int r8 = r10.f123064c
            if (r8 != r1) goto L_0x018b
            boolean r8 = r10.f123065d
            if (r8 != 0) goto L_0x018b
            r0 = 1
        L_0x018b:
            iw2.j0 r8 = new iw2.j0
            r8.<init>(r7, r0)
            o40.C61926c.m72668M(r8)
            goto L_0x0211
        L_0x0195:
            boolean r2 = r10 instanceof dw2.C45466i
            if (r2 == 0) goto L_0x0211
            if (r9 != 0) goto L_0x01fd
            java.util.List<java.lang.Integer> r11 = r11.f123035e
            java.util.Iterator r11 = r11.iterator()
        L_0x01a1:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x01ed
            java.lang.Object r2 = r11.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = r7.f289726i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onSceneEnd update story favorite: errType "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = ", errcode "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = ", localId "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", favorite:"
            r4.append(r5)
            r5 = r10
            dw2.i r5 = (dw2.C45466i) r5
            int r6 = r5.f123063c
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            cw2.p$a r3 = cw2.C97393p.f285894a
            int r4 = r5.f123063c
            r3.mo136661e(r2, r4)
            goto L_0x01a1
        L_0x01ed:
            dw2.i r10 = (dw2.C45466i) r10
            int r8 = r10.f123063c
            if (r8 != r1) goto L_0x01f4
            r0 = 1
        L_0x01f4:
            iw2.i0 r8 = new iw2.i0
            r8.<init>(r7, r0, r1)
            o40.C61926c.m72668M(r8)
            goto L_0x0211
        L_0x01fd:
            r8 = 324(0x144, float:4.54E-43)
            if (r9 != r8) goto L_0x0211
            dw2.i r10 = (dw2.C45466i) r10
            int r8 = r10.f123063c
            if (r8 != r1) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r1 = 0
        L_0x0209:
            iw2.i0 r8 = new iw2.i0
            r8.<init>(r7, r1, r0)
            o40.C61926c.m72668M(r8)
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98830g0.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
