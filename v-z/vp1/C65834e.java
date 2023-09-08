package vp1;

import android.util.LongSparseArray;
import c30.C104289g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.ConcurrentLruCache;
import eb0.C31543z5;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o40.C11348f;
import rx3.C13598b0;
import te3.C50124kf1;
import te3.C50953qf1;
import te3.C51966xf1;
import te3.C52104ye1;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: vp1.e */
public final class C65834e {

    /* renamed from: a */
    public static final C65834e f189316a = new C65834e();

    /* renamed from: b */
    public static final ConcurrentLruCache<Long, FinderItem> f189317b = new ConcurrentLruCache<>(200);

    /* renamed from: c */
    public static final HashMap<Integer, LongSparseArray<Long>> f189318c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<Integer, LongSparseArray<Long>> f189319d = new HashMap<>();

    /* renamed from: vp1.e$a */
    public static final class C65835a extends C65836b {

        /* renamed from: k */
        public final int f189320k;

        /* renamed from: l */
        public final long f189321l;

        public C65835a(int i, long j) {
            super("Cgi");
            this.f189320k = i;
            this.f189321l = j;
        }

        public String toString() {
            return "[name=" + this.f189331a + " funcId=" + this.f189320k + " requestId=" + this.f189321l + ']';
        }
    }

    /* renamed from: vp1.e$b */
    public static class C65836b {

        /* renamed from: b */
        public static final C65836b f189322b = new C65836b("FIRST_PAGE_DATA");

        /* renamed from: c */
        public static final C65836b f189323c = new C65836b("FOLLOW_PAT");

        /* renamed from: d */
        public static final C65836b f189324d = new C65836b("REPLY_COMMENT");

        /* renamed from: e */
        public static final C65836b f189325e = new C65836b("COUNT_COMMENT");

        /* renamed from: f */
        public static final C65836b f189326f = new C65836b("DELETE_COMMENT");

        /* renamed from: g */
        public static final C65836b f189327g = new C65836b("MOD_FEED_SETTING");

        /* renamed from: h */
        public static final C65836b f189328h = new C65836b("POST_FINISH");

        /* renamed from: i */
        public static final C65836b f189329i = new C65836b("HANDLE_FEED_LIST");

        /* renamed from: j */
        public static final C65836b f189330j = new C65836b("TEMP");

        /* renamed from: a */
        public final String f189331a;

        public C65836b(String str) {
            C87412m.m108594g(str, "name");
            this.f189331a = str;
        }

        public String toString() {
            return "[name=" + this.f189331a + ']';
        }
    }

    /* renamed from: vp1.e$c */
    public static final class C65837c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C104289g f189332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65837c(C104289g gVar) {
            super(0);
            this.f189332d = gVar;
        }

        public Object invoke() {
            String gVar = this.f189332d.toString();
            C87412m.m108593f(gVar, "json.toString()");
            return C112551y.m153814n(gVar, ",", ";", false);
        }
    }

    /* renamed from: a */
    public final void mo89867a(int i, List<? extends FinderObject> list) {
        C87412m.m108594g(list, "feeds");
        HashMap<Integer, LongSparseArray<Long>> hashMap = f189318c;
        synchronized (hashMap) {
            Integer valueOf = Integer.valueOf(i);
            LongSparseArray<Long> longSparseArray = hashMap.get(valueOf);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                hashMap.put(valueOf, longSparseArray);
            }
            LongSparseArray longSparseArray2 = longSparseArray;
            for (FinderObject finderObject : list) {
                longSparseArray2.put(finderObject.f164794id, Long.valueOf(C31543z5.m39453c()));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getFeedObject();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo89868b(com.tencent.p014mm.protocal.protobuf.FinderObject r4, te3.C51100rf1 r5, te3.C51100rf1 r6) {
        /*
            r3 = this;
            long r0 = r4.f164794id
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo89871e(r0)
            if (r0 == 0) goto L_0x0011
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x0011
            int r0 = r0.commentCount
            goto L_0x0012
        L_0x0011:
            r0 = -1
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "commentCount[local="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " -> yes="
            r1.append(r0)
            int r0 = r5.f140879d
            r1.append(r0)
            java.lang.String r0 = "](no="
            r1.append(r0)
            if (r6 == 0) goto L_0x0037
            int r6 = r6.f140879d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0038
        L_0x0037:
            r6 = 0
        L_0x0038:
            r1.append(r6)
            r6 = 41
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            int r0 = r5.f140879d
            r4.commentCount = r0
            te3.qf1 r4 = r3.mo89870d(r4)
            r4.f140284e = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.C65834e.mo89868b(com.tencent.mm.protocal.protobuf.FinderObject, te3.rf1, te3.rf1):java.lang.String");
    }

    /* renamed from: c */
    public final String mo89869c(FinderObject finderObject, C52104ye1 ye12, C52104ye1 ye13) {
        FinderItem e = mo89871e(finderObject.f164794id);
        Integer num = null;
        FinderObject feedObject = e != null ? e.getFeedObject() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("likeCount[local=");
        int i = -1;
        sb.append(feedObject != null ? feedObject.likeCount : -1);
        sb.append(" -> yes=");
        sb.append(ye12.f145243d);
        sb.append("](no=");
        sb.append(ye13 != null ? Integer.valueOf(ye13.f145243d) : null);
        sb.append(") forwardCount[local=");
        sb.append(feedObject != null ? feedObject.forwardCount : -1);
        sb.append(" -> yes=");
        sb.append(ye12.f145244e);
        sb.append("](no=");
        sb.append(ye13 != null ? Integer.valueOf(ye13.f145244e) : null);
        sb.append(") readCount[local=");
        sb.append(feedObject != null ? feedObject.readCount : -1);
        sb.append(" -> yes=");
        sb.append(ye12.f145245f);
        sb.append("](no=");
        sb.append(ye13 != null ? Integer.valueOf(ye13.f145245f) : null);
        sb.append(") favCount[local=");
        if (feedObject != null) {
            i = feedObject.favCount;
        }
        sb.append(i);
        sb.append(" -> yes=");
        sb.append(ye12.f145246g);
        sb.append("](no=");
        if (ye13 != null) {
            num = Integer.valueOf(ye13.f145246g);
        }
        sb.append(num);
        sb.append(") ");
        String sb4 = sb.toString();
        finderObject.likeCount = ye12.f145243d;
        finderObject.forwardCount = ye12.f145244e;
        finderObject.readCount = ye12.f145245f;
        finderObject.favCount = ye12.f145246g;
        mo89870d(finderObject).f140283d = ye12;
        return sb4;
    }

    /* renamed from: d */
    public final C50953qf1 mo89870d(FinderObject finderObject) {
        if (finderObject.object_extend == null) {
            finderObject.object_extend = new C50124kf1();
        }
        C50124kf1 kf12 = finderObject.object_extend;
        C50953qf1 qf12 = null;
        if ((kf12 != null ? kf12.f136757s : null) == null && kf12 != null) {
            kf12.f136757s = new C50953qf1();
        }
        C50124kf1 kf13 = finderObject.object_extend;
        if (kf13 != null) {
            qf12 = kf13.f136757s;
        }
        C87412m.m108591d(qf12);
        return qf12;
    }

    /* renamed from: e */
    public final FinderItem mo89871e(long j) {
        return f189317b.get(Long.valueOf(j));
    }

    /* renamed from: f */
    public final FinderItem mo89872f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Iterator<Map.Entry<Long, FinderItem>> it = f189317b.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (C112550d0.m153803w(((FinderItem) next.getValue()).getObjectNonceId(), str, false, 2, (Object) null)) {
                return (FinderItem) next.getValue();
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo89873g(int i, long j) {
        boolean z;
        HashMap<Integer, LongSparseArray<Long>> hashMap = f189319d;
        synchronized (hashMap) {
            Integer valueOf = Integer.valueOf(i);
            LongSparseArray<Long> longSparseArray = hashMap.get(valueOf);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                hashMap.put(valueOf, longSparseArray);
            }
            z = longSparseArray.indexOfKey(j) >= 0;
        }
        return z;
    }

    /* renamed from: h */
    public final int mo89874h(C51966xf1 xf12, C51966xf1 xf13) {
        if (xf12 != null && xf12.f144632e) {
            return 0;
        }
        long j = -1;
        long j2 = xf12 != null ? xf12.f144631d : -1;
        if (xf13 != null) {
            j = xf13.f144631d;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i == 0 ? -1 : -1000;
    }

    /* renamed from: i */
    public final boolean mo89875i(long j) {
        f189317b.remove(Long.valueOf(j));
        return true;
    }

    /* renamed from: j */
    public final void mo89876j(int i, String str, String str2, C65836b bVar) {
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", i);
        boolean z = true;
        if (str.length() > 0) {
            gVar.put("field", str);
        }
        if (str2.length() <= 0) {
            z = false;
        }
        if (z) {
            gVar.put("extra", str2);
        }
        gVar.put(FirebaseAnalytics.C113379b.SOURCE, bVar.toString());
        C11348f.C11349a.m11178b(C59319a.f169618b, "FinderCache.update", false, (C11348f.C11352b) null, bVar instanceof C65835a, false, new C65837c(gVar), 20, (Object) null);
    }

    /* renamed from: k */
    public final String mo89877k(int i) {
        return i != -1000 ? i != -100 ? i != -1 ? i != 0 ? "(newVersion>oldVersion)" : "(override)" : "(newVersion=oldVersion)" : "(monotonic_data=null)" : "(newVersion<oldVersion)";
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02a2  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89878l(com.tencent.p014mm.plugin.finder.storage.FinderItem r22, vp1.C65834e.C65836b r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "new"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "source"
            gy3.C87412m.m108594g(r2, r3)
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99511s4
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 0
            if (r4 != 0) goto L_0x002a
            boolean r4 = r2 instanceof vp1.C65834e.C65835a
            if (r4 == 0) goto L_0x002a
            return r5
        L_0x002a:
            com.tencent.mm.sdk.platformtools.ConcurrentLruCache<java.lang.Long, com.tencent.mm.plugin.finder.storage.FinderItem> r4 = f189317b
            long r6 = r22.getExpectId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r4.get(r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r6
            java.lang.String r7 = " source="
            java.lang.String r8 = "Finder.FinderCache"
            if (r6 == 0) goto L_0x03a3
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x004d
            goto L_0x0075
        L_0x004d:
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r22.getFeedObject()
            te3.kf1 r3 = r3.object_extend
            if (r3 == 0) goto L_0x0058
            te3.qf1 r3 = r3.f136757s
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            r11 = 0
            if (r3 != 0) goto L_0x0079
            long r13 = r22.getExpectId()
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0067
        L_0x0065:
            r3 = 0
            goto L_0x006c
        L_0x0067:
            boolean r3 = r2 instanceof vp1.C65834e.C65835a
            if (r3 == 0) goto L_0x0065
            r3 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x0079
            r3 = -100
            java.lang.String r5 = ""
            r0.mo89876j(r3, r5, r5, r2)
        L_0x0075:
            r18 = r4
            goto L_0x0393
        L_0x0079:
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r22.getFeedObject()
            te3.kf1 r3 = r3.object_extend
            java.lang.String r13 = "feedId="
            java.lang.String r14 = " newV="
            java.lang.String r15 = " oldV="
            java.lang.String r5 = " ret="
            if (r3 == 0) goto L_0x020d
            te3.qf1 r3 = r3.f136757s
            if (r3 == 0) goto L_0x020d
            te3.ye1 r3 = r3.f140283d
            if (r3 != 0) goto L_0x0093
            goto L_0x020d
        L_0x0093:
            te3.xf1 r12 = r3.f145247h
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r6.getFeedObject()
            te3.kf1 r9 = r9.object_extend
            if (r9 == 0) goto L_0x00a4
            te3.qf1 r9 = r9.f136757s
            if (r9 == 0) goto L_0x00a4
            te3.ye1 r9 = r9.f140283d
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r9 == 0) goto L_0x00aa
            te3.xf1 r11 = r9.f145247h
            goto L_0x00ab
        L_0x00aa:
            r11 = 0
        L_0x00ab:
            int r10 = r0.mo89874h(r12, r11)
            long r18 = r22.getId()
            java.lang.String r1 = o40.C61926c.m72691p(r18)
            r18 = r4
            java.lang.String r4 = "[updateCountInfo] feedId="
            if (r10 < 0) goto L_0x0114
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r22.getFeedObject()
            r19 = r6
            r6 = 0
            java.lang.String r3 = r0.mo89869c(r9, r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r0.mo89877k(r10)
            r6.append(r1)
            r6.append(r14)
            if (r12 == 0) goto L_0x00e9
            long r9 = r12.f144631d
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            goto L_0x00ea
        L_0x00e9:
            r1 = 0
        L_0x00ea:
            r6.append(r1)
            r6.append(r15)
            if (r11 == 0) goto L_0x00f9
            long r9 = r11.f144631d
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            goto L_0x00fa
        L_0x00f9:
            r1 = 0
        L_0x00fa:
            r6.append(r1)
            r6.append(r7)
            r6.append(r2)
            r1 = 32
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x0211
        L_0x0114:
            r19 = r6
            r6 = -1000(0xfffffffffffffc18, float:NaN)
            if (r10 > r6) goto L_0x0211
            if (r9 == 0) goto L_0x0176
            vp1.e r6 = f189316a
            r20 = r13
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r22.getFeedObject()
            java.lang.String r3 = r6.mo89869c(r13, r9, r3)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r1)
            r9.append(r5)
            java.lang.String r4 = r6.mo89877k(r10)
            r9.append(r4)
            r9.append(r14)
            r4 = r14
            if (r12 == 0) goto L_0x014a
            long r13 = r12.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            goto L_0x014b
        L_0x014a:
            r6 = 0
        L_0x014b:
            r9.append(r6)
            r9.append(r15)
            if (r11 == 0) goto L_0x015a
            long r13 = r11.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            goto L_0x015b
        L_0x015a:
            r6 = 0
        L_0x015b:
            r9.append(r6)
            r9.append(r7)
            r9.append(r2)
            r6 = 32
            r9.append(r6)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x017a
        L_0x0176:
            r20 = r13
            r4 = r14
            r6 = 0
        L_0x017a:
            if (r6 != 0) goto L_0x01c0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "[updateCountInfo] localCountInfo is null. feedId="
            r3.append(r6)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r6 = r0.mo89877k(r10)
            r3.append(r6)
            r3.append(r4)
            if (r12 == 0) goto L_0x019f
            long r13 = r12.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            goto L_0x01a0
        L_0x019f:
            r6 = 0
        L_0x01a0:
            r3.append(r6)
            r3.append(r15)
            if (r11 == 0) goto L_0x01af
            long r13 = r11.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            goto L_0x01b0
        L_0x01af:
            r6 = 0
        L_0x01b0:
            r3.append(r6)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r3)
        L_0x01c0:
            long r13 = r22.getExpectId()
            r16 = 0
            int r3 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x01cc
        L_0x01ca:
            r3 = 0
            goto L_0x01d1
        L_0x01cc:
            boolean r3 = r2 instanceof vp1.C65834e.C65835a
            if (r3 == 0) goto L_0x01ca
            r3 = 1
        L_0x01d1:
            if (r3 == 0) goto L_0x020a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = r20
            r3.append(r6)
            r3.append(r1)
            r3.append(r4)
            if (r12 == 0) goto L_0x01ec
            long r12 = r12.f144631d
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            goto L_0x01ed
        L_0x01ec:
            r1 = 0
        L_0x01ed:
            r3.append(r1)
            r3.append(r15)
            if (r11 == 0) goto L_0x01fc
            long r11 = r11.f144631d
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            goto L_0x01fd
        L_0x01fc:
            r1 = 0
        L_0x01fd:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "count_info"
            r0.mo89876j(r10, r3, r1, r2)
            goto L_0x0213
        L_0x020a:
            r6 = r20
            goto L_0x0213
        L_0x020d:
            r18 = r4
            r19 = r6
        L_0x0211:
            r6 = r13
            r4 = r14
        L_0x0213:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r22.getFeedObject()
            te3.kf1 r1 = r1.object_extend
            if (r1 == 0) goto L_0x0393
            te3.qf1 r1 = r1.f136757s
            if (r1 == 0) goto L_0x0393
            te3.rf1 r1 = r1.f140284e
            if (r1 != 0) goto L_0x0225
            goto L_0x0393
        L_0x0225:
            te3.xf1 r3 = r1.f140880e
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r19.getFeedObject()
            te3.kf1 r9 = r9.object_extend
            if (r9 == 0) goto L_0x0236
            te3.qf1 r9 = r9.f136757s
            if (r9 == 0) goto L_0x0236
            te3.rf1 r9 = r9.f140284e
            goto L_0x0237
        L_0x0236:
            r9 = 0
        L_0x0237:
            if (r9 == 0) goto L_0x023c
            te3.xf1 r10 = r9.f140880e
            goto L_0x023d
        L_0x023c:
            r10 = 0
        L_0x023d:
            int r11 = r0.mo89874h(r3, r10)
            long r12 = r22.getId()
            java.lang.String r12 = o40.C61926c.m72691p(r12)
            java.lang.String r13 = "[updateCommentCountInfo] feedId="
            if (r11 < 0) goto L_0x02a2
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r22.getFeedObject()
            r14 = 0
            java.lang.String r1 = r0.mo89868b(r6, r1, r14)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r12)
            r6.append(r5)
            java.lang.String r5 = r0.mo89877k(r11)
            r6.append(r5)
            r6.append(r4)
            if (r3 == 0) goto L_0x0277
            long r3 = r3.f144631d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0278
        L_0x0277:
            r3 = r14
        L_0x0278:
            r6.append(r3)
            r6.append(r15)
            if (r10 == 0) goto L_0x0287
            long r3 = r10.f144631d
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            goto L_0x0288
        L_0x0287:
            r10 = r14
        L_0x0288:
            r6.append(r10)
            r6.append(r7)
            r6.append(r2)
            r2 = 32
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x0393
        L_0x02a2:
            r14 = -1000(0xfffffffffffffc18, float:NaN)
            if (r11 > r14) goto L_0x0393
            if (r9 == 0) goto L_0x0301
            vp1.e r14 = f189316a
            r20 = r6
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r22.getFeedObject()
            java.lang.String r1 = r14.mo89868b(r6, r9, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            r6.append(r12)
            r6.append(r5)
            java.lang.String r9 = r14.mo89877k(r11)
            r6.append(r9)
            r6.append(r4)
            if (r3 == 0) goto L_0x02d5
            long r13 = r3.f144631d
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            goto L_0x02d6
        L_0x02d5:
            r9 = 0
        L_0x02d6:
            r6.append(r9)
            r6.append(r15)
            if (r10 == 0) goto L_0x02e5
            long r13 = r10.f144631d
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            goto L_0x02e6
        L_0x02e5:
            r9 = 0
        L_0x02e6:
            r6.append(r9)
            r6.append(r7)
            r6.append(r2)
            r9 = 32
            r6.append(r9)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x0304
        L_0x0301:
            r20 = r6
            r6 = 0
        L_0x0304:
            if (r6 != 0) goto L_0x034a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "[updateCommentCountInfo] localCountInfo is null. feedId="
            r1.append(r6)
            r1.append(r12)
            r1.append(r5)
            java.lang.String r5 = r0.mo89877k(r11)
            r1.append(r5)
            r1.append(r4)
            if (r3 == 0) goto L_0x0329
            long r5 = r3.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r5)
            goto L_0x032a
        L_0x0329:
            r6 = 0
        L_0x032a:
            r1.append(r6)
            r1.append(r15)
            if (r10 == 0) goto L_0x0339
            long r5 = r10.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r5)
            goto L_0x033a
        L_0x0339:
            r6 = 0
        L_0x033a:
            r1.append(r6)
            r1.append(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
        L_0x034a:
            long r5 = r22.getExpectId()
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0356
        L_0x0354:
            r5 = 0
            goto L_0x035b
        L_0x0356:
            boolean r1 = r2 instanceof vp1.C65834e.C65835a
            if (r1 == 0) goto L_0x0354
            r5 = 1
        L_0x035b:
            if (r5 == 0) goto L_0x0393
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = r20
            r1.append(r5)
            r1.append(r12)
            r1.append(r4)
            if (r3 == 0) goto L_0x0376
            long r3 = r3.f144631d
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            goto L_0x0377
        L_0x0376:
            r6 = 0
        L_0x0377:
            r1.append(r6)
            r1.append(r15)
            if (r10 == 0) goto L_0x0386
            long r3 = r10.f144631d
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            goto L_0x0387
        L_0x0386:
            r10 = 0
        L_0x0387:
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "comment_count_info"
            r0.mo89876j(r11, r3, r1, r2)
        L_0x0393:
            long r1 = r22.getExpectId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3 = r22
            r4 = r18
            r4.set(r1, r3)
            goto L_0x03d1
        L_0x03a3:
            r3 = r1
            long r5 = r22.getExpectId()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r4.set(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "[insert] feedId="
            r1.append(r4)
            long r3 = r22.getExpectId()
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r1.append(r3)
            r1.append(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
        L_0x03d1:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.C65834e.mo89878l(com.tencent.mm.plugin.finder.storage.FinderItem, vp1.e$b):boolean");
    }
}
