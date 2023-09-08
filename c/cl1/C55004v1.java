package cl1;

import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58113g;
import d50.C7170j;
import fj1.C45795b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import o40.C61926c;
import te3.C64239aq2;
import te3.C64404gv0;
import te3.C64733to;
import te3.C64890zp2;

/* renamed from: cl1.v1 */
public final class C55004v1 extends C39970c<C45795b> {

    /* renamed from: f */
    public final LiveMutableData<Boolean> f154435f = new LiveMutableData<>();

    /* renamed from: g */
    public final LiveMutableData<C55005a> f154436g = new LiveMutableData<>();

    /* renamed from: h */
    public int f154437h;

    /* renamed from: i */
    public LinkedList<C64239aq2> f154438i = new LinkedList<>();

    /* renamed from: j */
    public LiveMutableData<C64404gv0> f154439j = new LiveMutableData<>();

    /* renamed from: n */
    public LiveMutableData<LinkedList<C64239aq2>> f154440n = new LiveMutableData<>();

    /* renamed from: o */
    public LiveMutableData<Integer> f154441o = new LiveMutableData<>();

    /* renamed from: p */
    public LiveMutableData<Float> f154442p = new LiveMutableData<>();

    /* renamed from: q */
    public LiveMutableData<Float> f154443q = new LiveMutableData<>();

    /* renamed from: r */
    public int f154444r;

    /* renamed from: s */
    public String f154445s;

    /* renamed from: t */
    public String f154446t;

    /* renamed from: cl1.v1$a */
    public static final class C55005a {

        /* renamed from: a */
        public final int f154447a;

        /* renamed from: b */
        public final int f154448b;

        /* renamed from: c */
        public final int f154449c;

        /* renamed from: d */
        public final int f154450d;

        public C55005a(int i, int i2, int i3, int i4) {
            this.f154447a = i;
            this.f154448b = i2;
            this.f154449c = i3;
            this.f154450d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55005a)) {
                return false;
            }
            C55005a aVar = (C55005a) obj;
            return this.f154447a == aVar.f154447a && this.f154448b == aVar.f154448b && this.f154449c == aVar.f154449c && this.f154450d == aVar.f154450d;
        }

        public int hashCode() {
            return (((((this.f154447a * 31) + this.f154448b) * 31) + this.f154449c) * 31) + this.f154450d;
        }

        public String toString() {
            return "IndicatorData(pos=" + this.f154447a + ", viewX=" + this.f154448b + ", viewY=" + this.f154449c + ", viewHeight=" + this.f154450d + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55004v1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r0.get(r4.f154437h).f182132e;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo76046c3() {
        /*
            r4 = this;
            java.util.LinkedList<te3.aq2> r0 = r4.f154438i
            int r1 = r0.size()
            java.lang.String r2 = ""
            if (r1 <= 0) goto L_0x0020
            int r1 = r4.f154437h
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x0020
            int r1 = r4.f154437h
            java.lang.Object r0 = r0.get(r1)
            te3.aq2 r0 = (te3.C64239aq2) r0
            java.lang.String r0 = r0.f182132e
            if (r0 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C55004v1.mo76046c3():java.lang.String");
    }

    /* renamed from: d3 */
    public final void mo76047d3(C58113g gVar) {
        C87412m.m108594g(gVar, "liveRoomInfo");
        Log.m105924i("MultiStreamSlice", "updateCurLiveRoomInfo currentPosition: " + this.f154437h + " size: " + this.f154438i.size());
        if (this.f154437h < this.f154438i.size()) {
            HashMap<Integer, C7170j> hashMap = new HashMap<>();
            C64239aq2 aq22 = this.f154438i.get(this.f154437h);
            C87412m.m108593f(aq22, "multiChannelParamsList[currentPosition]");
            C64239aq2 aq23 = aq22;
            LinkedList<C64733to> linkedList = aq23.f182131d.f186812j;
            if (linkedList != null) {
                for (C64733to toVar : linkedList) {
                    Integer valueOf = Integer.valueOf(toVar.f185623f);
                    String str = toVar.f185622e;
                    C87412m.m108593f(str, "it.url");
                    hashMap.put(valueOf, new C7170j(str, toVar.f185627j, toVar.f185628n));
                }
            }
            gVar.f166241k = hashMap;
            C64890zp2 zp22 = aq23.f182131d;
            C87412m.m108593f(zp22, "curStream.channel_params");
            gVar.f166244n = zp22;
            gVar.f166243m = aq23.f182131d.f186822v;
            ((C0678p1) business(C0678p1.class)).f1596f = C61926c.m72696u(gVar.f166243m, 2);
        }
    }

    public void onCleared() {
        super.onCleared();
        this.f154441o.postValue(0);
    }
}
