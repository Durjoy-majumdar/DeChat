package iw2;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cw2.C97387k;
import dw2.C7521g;
import eb0.C31543z5;
import ew2.C97758b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32229r;
import gw2.C98266k;
import gw2.C98267l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iw2.C98862q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kw2.C99268i;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import sx3.C110818d0;
import vl0.C90830d;
import zv2.C103109c;

/* renamed from: iw2.r */
public class C98864r extends C98862q implements C11385n {

    /* renamed from: e */
    public final C98858n f289802e;

    /* renamed from: f */
    public final Map<String, ArrayList<Long>> f289803f;

    /* renamed from: g */
    public final int f289804g;

    /* renamed from: h */
    public final String f289805h;

    /* renamed from: i */
    public final int f289806i;

    /* renamed from: j */
    public final int f289807j;

    /* renamed from: n */
    public final List<C98865a> f289808n;

    /* renamed from: o */
    public final List<C98865a> f289809o;

    /* renamed from: p */
    public boolean f289810p;

    /* renamed from: q */
    public int f289811q;

    /* renamed from: r */
    public int f289812r;

    /* renamed from: s */
    public int f289813s;

    /* renamed from: t */
    public int f289814t;

    /* renamed from: u */
    public boolean f289815u;

    /* renamed from: v */
    public final boolean f289816v;

    /* renamed from: w */
    public final boolean f289817w;

    /* renamed from: x */
    public boolean f289818x;

    /* renamed from: y */
    public final C32229r<Long, Boolean, String, String, C13598b0> f289819y;

    /* renamed from: iw2.r$a */
    public static final class C98865a {

        /* renamed from: a */
        public final String f289820a;

        /* renamed from: b */
        public int f289821b;

        /* renamed from: c */
        public ArrayList<C98266k> f289822c;

        /* renamed from: d */
        public int f289823d;

        public C98865a(String str, int i, ArrayList arrayList, int i2, int i3, C8480h hVar) {
            if ((i3 & 8) != 0) {
                int e = C31543z5.m39455e();
                C97387k.f285887a.mo136646a();
                i2 = e - 86400;
            }
            C87412m.m108594g(str, "username");
            C87412m.m108594g(arrayList, "items");
            this.f289820a = str;
            this.f289821b = i;
            this.f289822c = arrayList;
            this.f289823d = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C98865a)) {
                return false;
            }
            C98865a aVar = (C98865a) obj;
            return C87412m.m108589b(this.f289820a, aVar.f289820a) && this.f289821b == aVar.f289821b && C87412m.m108589b(this.f289822c, aVar.f289822c) && this.f289823d == aVar.f289823d;
        }

        public int hashCode() {
            return (((((this.f289820a.hashCode() * 31) + this.f289821b) * 31) + this.f289822c.hashCode()) * 31) + this.f289823d;
        }

        public String toString() {
            return "UserData(username=" + this.f289820a + ", state=" + this.f289821b + ", items=" + this.f289822c + ", timestampBound=" + this.f289823d + ')';
        }
    }

    /* renamed from: iw2.r$b */
    public static final class C98866b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98865a f289824d;

        /* renamed from: e */
        public final /* synthetic */ C98865a f289825e;

        /* renamed from: f */
        public final /* synthetic */ C98864r f289826f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98866b(C98865a aVar, C98865a aVar2, C98864r rVar) {
            super(0);
            this.f289824d = aVar;
            this.f289825e = aVar2;
            this.f289826f = rVar;
        }

        public Object invoke() {
            C98865a aVar = this.f289824d;
            if (aVar != null) {
                this.f289826f.mo138227p(aVar);
            }
            C98865a aVar2 = this.f289825e;
            if (aVar2 != null) {
                this.f289826f.f289809o.add(aVar2);
            }
            this.f289826f.mo138225n();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.r$c */
    public static final class C98867c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98864r f289827d;

        /* renamed from: e */
        public final /* synthetic */ int f289828e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98867c(C98864r rVar, int i) {
            super(0);
            this.f289827d = rVar;
            this.f289828e = i;
        }

        public Object invoke() {
            this.f289827d.f289808n.remove(this.f289828e);
            this.f289827d.f289802e.mo134400h(this.f289828e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.r$d */
    public static final class C98868d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98864r f289829d;

        /* renamed from: e */
        public final /* synthetic */ int f289830e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<C98266k> f289831f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98868d(C98864r rVar, int i, ArrayList<C98266k> arrayList) {
            super(0);
            this.f289829d = rVar;
            this.f289830e = i;
            this.f289831f = arrayList;
        }

        public Object invoke() {
            this.f289829d.f289802e.mo134399g(this.f289830e, this.f289831f);
            this.f289829d.f289802e.mo134403k(this.f289830e);
            this.f289829d.f289802e.mo134397e();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.r$e */
    public static final class C98869e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98864r f289832d;

        /* renamed from: e */
        public final /* synthetic */ int f289833e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList<C98266k> f289834f;

        /* renamed from: g */
        public final /* synthetic */ C54248l.C54251c f289835g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98869e(C98864r rVar, int i, ArrayList<C98266k> arrayList, C54248l.C54251c cVar) {
            super(0);
            this.f289832d = rVar;
            this.f289833e = i;
            this.f289834f = arrayList;
            this.f289835g = cVar;
        }

        public Object invoke() {
            this.f289832d.f289802e.mo134399g(this.f289833e, this.f289834f);
            this.f289832d.f289802e.mo134397e();
            this.f289835g.mo75045a(new C98871s(this.f289832d, this.f289833e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: iw2.r$f */
    public static final class C98870f extends C87413o implements C32229r<Long, Boolean, String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98864r f289836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98870f(C98864r rVar) {
            super(4);
            this.f289836d = rVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int i;
            int i2;
            C99268i Ow;
            long longValue = ((Number) obj).longValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            String str = (String) obj4;
            C87412m.m108594g((String) obj3, "fromUser");
            C87412m.m108594g(str, "storyOwner");
            if (booleanValue) {
                this.f289836d.getClass();
            }
            List<C98865a> list = this.f289836d.f289808n;
            C87412m.m108593f(list, "userList");
            Iterator<C98865a> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Util.isEqual(it.next().f289820a, str)) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (i != -1) {
                ArrayList<C98266k> arrayList = this.f289836d.f289808n.get(i).f289822c;
                Iterator<C98266k> it4 = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it4.next().f288081d == longValue) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
                if (!(i2 == -1 || (Ow = StoryCore.f281736t.mo134191i().mo138664Ow(longValue)) == null)) {
                    C61926c.m72668M(new C98879w(booleanValue, this.f289836d, i, i2, arrayList, new C98266k(Ow, Ow.mo138657p2(), C98267l.NORMAL)));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C98864r(List list, String str, C98858n nVar, Map map, int i, int i2, C8480h hVar) {
        this(list, str, nVar, (i2 & 8) != 0 ? new HashMap() : map, (i2 & 16) != 0 ? 0 : i);
    }

    /* renamed from: b */
    public void mo138204b(int i) {
        List<C98865a> list = this.f289808n;
        C87412m.m108593f(list, "userList");
        C98865a aVar = (C98865a) C110818d0.m150917O(list, i);
        if (aVar != null) {
            mo138227p(aVar);
        }
        List<C98865a> list2 = this.f289808n;
        C87412m.m108593f(list2, "userList");
        List<C98865a> list3 = this.f289808n;
        C87412m.m108593f(list3, "userList");
        C61926c.m72657B("MultiUserGalleryPresenter_checkLoadMore", true, new C98866b((C98865a) C110818d0.m150917O(list2, this.f289806i + i), (C98865a) C110818d0.m150917O(list3, i + this.f289807j), this));
    }

    /* renamed from: c */
    public void mo138191c(int i, int i2) {
    }

    /* renamed from: d */
    public void mo138192d() {
        C86709a0.m107529k().f251779b.mo123470p(C90830d.CTRL_INDEX, this);
        C97758b.f286820d.mo137095j(this.f289819y);
    }

    /* renamed from: e */
    public void mo138205e(int i) {
        this.f289814t = i;
    }

    /* renamed from: f */
    public void mo138193f() {
        int i = 3;
        if (this.f289808n.size() <= 3) {
            i = this.f289808n.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            C98865a aVar = this.f289808n.get(i2);
            C87412m.m108593f(aVar, "userList[i]");
            mo138227p(aVar);
        }
        if (this.f289808n.size() > 0) {
            this.f289809o.add(this.f289808n.get(0));
            mo138225n();
        }
    }

    /* renamed from: g */
    public void mo138194g(int i) {
        this.f289813s = i;
        if (i == 1 && !this.f289818x) {
            StoryCore.f281736t.mo134194l().post(new C98874u(this));
        }
    }

    /* renamed from: h */
    public void mo138195h(int i, int i2, boolean z) {
        if (i != 3) {
            return;
        }
        if (!z) {
            StoryCore.f281736t.mo134194l().post(new C98872t(this));
        } else if (i2 == 0) {
            StoryCore.f281736t.mo134194l().post(new C98877v(this));
        } else if (i2 == 1) {
            StoryCore.f281736t.mo134194l().post(new C98872t(this));
        }
    }

    /* renamed from: i */
    public void mo138196i(int i, int i2) {
        this.f289811q = i;
        this.f289812r = i2;
        if (this.f289813s == 1) {
            StoryCore.f281736t.mo134194l().post(new C98874u(this));
        }
    }

    /* renamed from: n */
    public final void mo138225n() {
        if (!this.f289810p && this.f289809o.size() > 0) {
            C98865a aVar = this.f289809o.get(0);
            int indexOf = this.f289808n.indexOf(aVar);
            if (!(indexOf >= 0 && indexOf < this.f289808n.size()) || aVar.f289821b == 2) {
                this.f289809o.remove(0);
                mo138225n();
                return;
            }
            aVar.f289821b = 2;
            String str = this.f289805h;
            Log.m105924i(str, "LogStory: loadRemoteForUser " + aVar);
            this.f289810p = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ad  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138226o(iw2.C98864r.C98865a r9, java.util.ArrayList<gw2.C98266k> r10) {
        /*
            r8 = this;
            java.util.List<iw2.r$a> r0 = r8.f289808n
            int r0 = r0.indexOf(r9)
            boolean r1 = r10.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            int r1 = r8.f289811q
            int r4 = r1 + -1
            int r1 = r1 + r3
            if (r0 > r1) goto L_0x0019
            if (r4 > r0) goto L_0x0019
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            boolean r4 = r10.isEmpty()
            r4 = r4 ^ r3
            if (r4 != 0) goto L_0x002c
            int r4 = r8.f289813s
            if (r4 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.String r4 = r8.f289805h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "notifyUser: selection "
            r5.append(r6)
            java.util.List<iw2.r$a> r6 = r8.f289808n
            java.lang.String r7 = "userList"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.Object r6 = sx3.C110818d0.m150917O(r6, r0)
            r5.append(r6)
            r6 = 32
            r5.append(r6)
            r5.append(r0)
            r5.append(r6)
            int r7 = r8.f289811q
            r5.append(r7)
            java.lang.String r7 = ", "
            r5.append(r7)
            int r7 = r10.size()
            r5.append(r7)
            r5.append(r6)
            int r7 = r8.f289813s
            r5.append(r7)
            java.lang.String r7 = ", result "
            r5.append(r7)
            r5.append(r1)
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.ArrayList<gw2.k> r4 = r9.f289822c
            r9.f289822c = r10
            if (r1 == 0) goto L_0x00ad
            java.lang.String r10 = r8.f289805h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remove user from gallery "
            r1.append(r2)
            r1.append(r0)
            r1.append(r6)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            iw2.r$c r9 = new iw2.r$c
            r9.<init>(r8, r0)
            o40.C61926c.m72668M(r9)
            return
        L_0x00ad:
            if (r3 != 0) goto L_0x00b0
            return
        L_0x00b0:
            int r9 = r8.f289813s
            if (r9 == 0) goto L_0x00d1
            int r9 = r8.f289811q
            if (r0 == r9) goto L_0x00b9
            goto L_0x00d1
        L_0x00b9:
            java.lang.String r9 = "oldItems"
            gy3.C87412m.m108594g(r4, r9)
            iw2.p r9 = new iw2.p
            r9.<init>(r4, r10)
            androidx.recyclerview.widget.l$c r9 = androidx.recyclerview.widget.C54248l.m60949a(r9, r2)
            iw2.r$e r1 = new iw2.r$e
            r1.<init>(r8, r0, r10, r9)
            o40.C61926c.m72668M(r1)
            goto L_0x00d9
        L_0x00d1:
            iw2.r$d r9 = new iw2.r$d
            r9.<init>(r8, r0, r10)
            o40.C61926c.m72668M(r9)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iw2.C98864r.mo138226o(iw2.r$a, java.util.ArrayList):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ArrayList<C98266k> arrayList;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (this.f289809o.size() > 0) {
            C98865a aVar = this.f289809o.get(0);
            int indexOf = this.f289808n.indexOf(aVar);
            boolean z = true;
            if (!(indexOf >= 0 && indexOf < this.f289808n.size())) {
                this.f289809o.remove(0);
                this.f289810p = false;
                mo138225n();
                return;
            }
            String str2 = this.f289805h;
            Log.m105924i(str2, "LogStory: " + i + ' ' + i2 + ' ' + str + ", " + indexOf + ' ' + aVar);
            if (yVar instanceof C7521g) {
                if (indexOf < 0 || indexOf >= this.f289808n.size()) {
                    z = false;
                }
                if (z) {
                    C7521g gVar = (C7521g) yVar;
                    if (Util.isEqual((String) null, aVar.f289820a)) {
                        this.f289809o.remove(0);
                        this.f289810p = false;
                        String str3 = this.f289805h;
                        Log.m105924i(str3, "LogStory: updateUserGalleryItemsFromDb " + aVar.f289820a + ' ' + this.f289808n.indexOf(aVar));
                        if (this.f289817w) {
                            arrayList = C98862q.f289801d.mo138223d(aVar.f289820a, this.f289816v, aVar.f289823d);
                        } else if (this.f289815u) {
                            C98862q.C98863a aVar2 = C98862q.f289801d;
                            String str4 = aVar.f289820a;
                            arrayList = aVar2.mo138222c(str4, Util.isEqual(str4, StoryCore.f281736t.mo134187e()), this.f289803f.get(aVar.f289820a));
                        } else {
                            arrayList = C98862q.f289801d.mo138220a(aVar.f289820a, this.f289816v);
                        }
                        String str5 = this.f289805h;
                        Log.m105924i(str5, "LogStory: db data " + aVar + ' ' + arrayList.size());
                        mo138226o(aVar, arrayList);
                        mo138225n();
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo138227p(C98865a aVar) {
        if (this.f289808n.indexOf(aVar) >= 0) {
            if (aVar.f289821b != 0) {
                Log.m105924i(this.f289805h, "LogStory: preloadForUser already preload");
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str = this.f289805h;
            Log.m105924i(str, "LogStory: preloadForUser " + aVar + ' ' + this.f289815u + ' ' + this.f289804g);
            if (this.f289817w) {
                aVar.f289821b = 1;
                int e = C31543z5.m39455e();
                C97387k.f285887a.mo136646a();
                int max = Math.max(e - 86400, (int) (StoryCore.f281736t.mo134189g().mo138646jo(aVar.f289820a).field_readTime / ((long) 1000)));
                aVar.f289823d = max;
                ArrayList<C98266k> d = C98862q.f289801d.mo138223d(aVar.f289820a, this.f289816v, max);
                if (true ^ d.isEmpty()) {
                    String str2 = this.f289805h;
                    Log.m105924i(str2, "LogStory: preload add sync item and local item, " + d.size());
                    arrayList.addAll(d);
                }
            } else if (this.f289815u) {
                aVar.f289821b = 2;
                C98862q.C98863a aVar2 = C98862q.f289801d;
                String str3 = aVar.f289820a;
                ArrayList<C98266k> c = aVar2.mo138222c(str3, Util.isEqual(str3, StoryCore.f281736t.mo134187e()), this.f289803f.get(aVar.f289820a));
                if (true ^ c.isEmpty()) {
                    String str4 = this.f289805h;
                    Log.m105924i(str4, "LogStory: preload add sync item and local item, " + c.size());
                    arrayList.addAll(c);
                }
            } else if (Util.isEqual(StoryCore.f281736t.mo134187e(), aVar.f289820a)) {
                aVar.f289821b = 1;
                ArrayList<C98266k> a = C98862q.f289801d.mo138220a(aVar.f289820a, this.f289816v);
                if (a.size() > 0) {
                    String str5 = this.f289805h;
                    Log.m105924i(str5, "LogStory: preload add sync item and local item, " + a.size());
                    arrayList.addAll(a);
                }
            } else {
                aVar.f289821b = 1;
                C98862q.C98863a aVar3 = C98862q.f289801d;
                C98266k e2 = aVar3.mo138224e(aVar.f289820a, this.f289816v);
                if (e2 == null) {
                    mo138226o(aVar, arrayList);
                    return;
                }
                ArrayList<C98266k> a2 = aVar3.mo138220a(aVar.f289820a, this.f289816v);
                if (a2.size() > 0) {
                    String str6 = this.f289805h;
                    Log.m105924i(str6, "LogStory: preload add sync item and local item, " + a2.size());
                    if (a2.get(0).f288081d != e2.f288081d) {
                        arrayList.add(e2);
                    }
                    arrayList.addAll(a2);
                } else {
                    Log.m105924i(this.f289805h, "LogStory: preload add sync item");
                    arrayList.add(e2);
                }
            }
            mo138226o(aVar, arrayList);
        }
    }

    public C98864r(List<String> list, String str, C98858n nVar, Map<String, ? extends ArrayList<Long>> map, int i) {
        C87412m.m108594g(list, "users");
        C87412m.m108594g(nVar, "groupCallback");
        C87412m.m108594g(map, "storyFilterList");
        this.f289802e = nVar;
        this.f289803f = map;
        this.f289804g = i;
        this.f289805h = "MicroMsg.MultiUserGalleryPresenter";
        this.f289806i = 3;
        this.f289807j = 1;
        this.f289808n = Collections.synchronizedList(new ArrayList());
        this.f289809o = Collections.synchronizedList(new LinkedList());
        this.f289811q = -1;
        this.f289812r = -1;
        this.f289815u = C61926c.m72696u(i, 4);
        this.f289816v = C61926c.m72696u(i, 1);
        this.f289817w = C61926c.m72696u(i, 2);
        this.f289819y = new C98870f(this);
        Log.m105924i("MicroMsg.MultiUserGalleryPresenter", "TimeDiff: local: " + System.currentTimeMillis() + ", server: " + C31543z5.m39451a());
        StringBuilder sb = new StringBuilder();
        sb.append("chatRoom is ");
        sb.append(str);
        Log.m105924i("MicroMsg.MultiUserGalleryPresenter", sb.toString());
        for (String str2 : list) {
            String str3 = this.f289805h;
            Log.m105924i(str3, "LogStory: " + str2);
            this.f289808n.add(new C98865a(str2, 0, new ArrayList(), 0, 8, (C8480h) null));
        }
        this.f289802e.mo134393a(this.f289808n.size());
        C86709a0.m107529k().f251779b.mo123455a(C90830d.CTRL_INDEX, this);
        C97758b.f286820d.mo137087a(this.f289819y);
        this.f289818x = C103109c.f304232b.mo108963a();
    }
}
