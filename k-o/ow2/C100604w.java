package ow2;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import cw2.C97399u;
import di3.C86312j;
import fy3.C32224a;
import gw2.C98266k;
import gw2.C98268m;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kw2.C34078m;
import kw2.C99264e;
import kw2.C99265f;
import o40.C61926c;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p663qo.C101213l;
import p682rz.C36594q;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import te3.bc4;
import z04.C112551y;

/* renamed from: ow2.w */
public final class C100604w {

    /* renamed from: a */
    public static final C100604w f294753a = new C100604w();

    /* renamed from: b */
    public static C100596k f294754b = new C100596k();

    /* renamed from: c */
    public static int f294755c;

    /* renamed from: d */
    public static int f294756d;

    /* renamed from: e */
    public static int f294757e;

    /* renamed from: f */
    public static final Map<String, C98268m> f294758f;

    /* renamed from: g */
    public static final Map<String, Integer> f294759g;

    /* renamed from: h */
    public static final Set<String> f294760h;

    /* renamed from: i */
    public static final List<C100610c> f294761i;

    /* renamed from: j */
    public static int f294762j = 3;

    /* renamed from: k */
    public static C100605a f294763k = new C100605a(new ArrayList(), 0, 0, (C100605a) null, false, 16, (C8480h) null);

    /* renamed from: l */
    public static volatile String f294764l;

    /* renamed from: m */
    public static volatile Long f294765m;

    /* renamed from: n */
    public static long f294766n;

    /* renamed from: o */
    public static long f294767o;

    /* renamed from: p */
    public static long f294768p;

    /* renamed from: ow2.w$b */
    public static final class C100609b {

        /* renamed from: a */
        public final boolean f294782a;

        /* renamed from: b */
        public final long f294783b;

        /* renamed from: c */
        public final long f294784c;

        /* renamed from: d */
        public final boolean f294785d;

        public C100609b(boolean z, long j, long j2, boolean z2) {
            this.f294782a = z;
            this.f294783b = j;
            this.f294784c = j2;
            this.f294785d = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C100609b)) {
                return false;
            }
            C100609b bVar = (C100609b) obj;
            return this.f294782a == bVar.f294782a && this.f294783b == bVar.f294783b && this.f294784c == bVar.f294784c && this.f294785d == bVar.f294785d;
        }

        public int hashCode() {
            boolean z = this.f294782a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            long j = this.f294783b;
            long j2 = this.f294784c;
            int i = (((((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z3 = this.f294785d;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "MoovReadyInfo(isMoovReady=" + this.f294782a + ", offset=" + this.f294783b + ", length=" + this.f294784c + ", preloadFinish=" + this.f294785d + ')';
        }
    }

    /* renamed from: ow2.w$d */
    public static final class C100611d implements C98124g.C98126b {

        /* renamed from: d */
        public final long f294789d;

        /* renamed from: ow2.w$d$a */
        public static final class C100612a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f294790d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100612a(String str) {
                super(0);
                this.f294790d = str;
            }

            public Object invoke() {
                T t;
                Long l;
                C100604w wVar = C100604w.f294753a;
                String str = this.f294790d;
                wVar.getClass();
                Iterator<T> it = C100604w.f294761i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(str, ((C100610c) t).f294788c)) {
                        break;
                    }
                }
                C100610c cVar = (C100610c) t;
                if (cVar != null) {
                    C100604w.f294761i.remove(cVar);
                }
                boolean z = true;
                if (C100604w.f294755c == 1) {
                    Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "upgrades mediaId " + str + " runningMediaId " + C100604w.f294765m + " selectMediaId " + C100604w.f294766n);
                    Long l2 = C100604w.f294765m;
                    long j = C100604w.f294766n;
                    if (l2 == null || l2.longValue() != j || ((l = C100604w.f294765m) != null && l.longValue() == 0)) {
                        z = false;
                    }
                    wVar.mo140069m(z);
                }
                C100604w.f294754b.getClass();
                return C13598b0.f38549a;
            }
        }

        public C100611d(long j) {
            this.f294789d = j;
        }

        /* renamed from: b */
        public void mo31987b(String str, C98121d dVar) {
            C98268m mVar;
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + str + ", sceneResult:" + dVar);
            boolean z = false;
            if (dVar != null && dVar.field_retCode == -21112) {
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + str + ", video source change!");
                C100604w.m131612a(C100604w.f294753a, str);
            } else if (str != null && dVar != null) {
                Map<String, C98268m> map = C100604w.f294758f;
                if (map.containsKey(str) && (mVar = map.get(str)) != null) {
                    if (dVar.field_recvedBytes <= 0 || dVar.field_fileLength <= 0) {
                        Log.m105920e("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted error, recvedBytes:" + dVar.field_recvedBytes + ", fileLength:" + dVar.field_fileLength);
                        return;
                    }
                    C34078m b = C97399u.f285903a.mo136668b(mVar);
                    b.field_cacheSize = (int) dVar.field_recvedBytes;
                    b.field_totalSize = (int) dVar.field_fileLength;
                    StoryCore.f281736t.mo134193k().mo138677qq(b);
                    C100604w.f294760h.add(str);
                    Log.m105924i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted update cacheSize:" + b.field_cacheSize + ", totalSize:" + b.field_totalSize + ", preloadCost:" + Util.ticksToNow(this.f294789d));
                    C61926c.m72668M(new C100612a(str));
                }
            }
        }
    }

    /* renamed from: ow2.w$e */
    public static final class C100613e implements C98124g.C98125a {
        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            boolean z2;
            String str2 = str;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            boolean z3 = true;
            if (dVar2 != null && dVar2.field_retCode == -21112) {
                Log.m105924i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreload, mediaId:" + str2 + ", video source change!");
                C100604w.m131612a(C100604w.f294753a, str2);
                return 0;
            }
            if (cVar2 != null && cVar2.field_toltalLength > 0) {
                C98268m mVar = C100604w.f294758f.get(str2);
                Set<String> set = C100604w.f294760h;
                boolean D = C110818d0.m150903D(set, str2);
                int i2 = (int) ((((float) cVar2.field_finishedLength) / ((float) cVar2.field_toltalLength)) * ((float) 100));
                Integer num = C100604w.f294759g.get(str2);
                int intValue = num != null ? num.intValue() : 0;
                String str3 = hashCode() + " onPreload, mediaId:" + str2 + ", startRet:" + i + ", preloadOffset:" + cVar2.field_finishedLength + ", totalLength: " + cVar2.field_toltalLength + " desiredPreloadPercent:" + intValue + ", preloadPercent:" + i2 + " isFinish:" + D;
                if (intValue <= 0 || i2 < intValue) {
                    z2 = false;
                } else {
                    str3 = str3 + " exceed:true ";
                    z2 = true;
                }
                if (mVar != null) {
                    C34078m b = C97399u.f285903a.mo136668b(mVar);
                    b.field_cacheSize = (int) cVar2.field_finishedLength;
                    b.field_totalSize = (int) cVar2.field_toltalLength;
                    StoryCore.C96337h hVar = StoryCore.f281736t;
                    hVar.mo134193k().mo138677qq(b);
                    C99264e jo = hVar.mo134189g().mo138646jo(mVar.f288091d);
                    if (jo.field_syncId == mVar.f288089b && jo.isValid()) {
                        long j = mVar.f288089b;
                        String str4 = mVar.f288093f.f297959d;
                        C87412m.m108593f(str4, "videoItem.media.Id");
                        int i3 = b.field_cacheSize;
                        if (j == jo.field_syncId) {
                            jo.field_preloadStoryId = j;
                            jo.field_preloadMediaId = str4;
                            jo.field_preLoadResource = (long) i3;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            str3 = str3 + " * ext pre update * ";
                            C99265f g = hVar.mo134189g();
                            if (g.mo138642TE((long) ((int) jo.systemRowid), jo) >= 0) {
                                g.doNotify("notify_story_preload", 3, jo);
                            }
                        }
                    }
                    if (z2 && str2 != null) {
                        set.add(str2);
                    }
                    str3 = str3 + "update cacheSize done";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(", currentSpeed:");
                C100604w.f294753a.getClass();
                sb.append(CdnLogic.getRecentAverageSpeed(2));
                Log.m105924i("MicroMsg.StoryVideoPreloadMgr", sb.toString());
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    static {
        Map<String, C98268m> synchronizedMap = Collections.synchronizedMap(new HashMap());
        C87412m.m108593f(synchronizedMap, "synchronizedMap(HashMap<String, StoryVideoItem>())");
        f294758f = synchronizedMap;
        Map<String, Integer> synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        C87412m.m108593f(synchronizedMap2, "synchronizedMap(HashMap<String, Int>())");
        f294759g = synchronizedMap2;
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet());
        C87412m.m108593f(synchronizedSet, "synchronizedSet(HashSet<String>())");
        f294760h = synchronizedSet;
        List<C100610c> synchronizedList = Collections.synchronizedList(new LinkedList());
        C87412m.m108593f(synchronizedList, "synchronizedList(LinkedList<TaskInfo>())");
        f294761i = synchronizedList;
    }

    /* renamed from: a */
    public static final void m131612a(C100604w wVar, String str) {
        wVar.getClass();
        Log.printInfoStack("MicroMsg.StoryVideoPreloadMgr", "onVideoSourceChange: " + str, new Object[0]);
        C98268m mVar = f294758f.get(str);
        if (mVar != null) {
            wVar.mo140061d(mVar);
            C34078m b = C97399u.f285903a.mo136668b(mVar);
            b.field_cacheSize = 0;
            b.field_totalSize = 0;
            StoryCore.f281736t.mo134193k().mo138677qq(b);
            C86013q1.m106447h(b.field_filePath);
        }
    }

    /* renamed from: b */
    public static void m131613b(C100604w wVar, List list, int i, int i2, Object obj) {
        int i3;
        T t;
        int i4 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        wVar.getClass();
        C87412m.m108594g(list, "videoItemList");
        Log.printInfoStack("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList " + list.size(), new Object[0]);
        boolean h = wVar.mo140065h();
        boolean g = wVar.mo140064g();
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, isGoodNetwork:" + h + ", isBadNetwork:" + g + ", currentSpeed:" + CdnLogic.getRecentAverageSpeed(2) + " preloadRunningSet " + f294761i.size() + " downloadExpect " + i);
        List list2 = wVar.mo140064g() ? f294754b.f294743d : f294754b.f294742c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C98268m mVar = (C98268m) it.next();
                C100604w wVar2 = f294753a;
                if (wVar2.mo140067j(mVar)) {
                    if (i > 0) {
                        i3 = i;
                    } else {
                        i3 = ((Number) (i4 < list2.size() ? list2.get(i4) : C110818d0.m150923U(list2))).intValue();
                    }
                    int n = wVar2.mo140070n(i4);
                    C97399u uVar = C97399u.f285903a;
                    String a = uVar.mo136667a(mVar.f288090c, mVar.f288093f.f297961f);
                    int c = wVar2.mo140060c(a, mVar.f288093f, i3, wVar2.mo140065h());
                    C34078m b = uVar.mo136668b(mVar);
                    Iterator<T> it4 = f294761i.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (C87412m.m108589b(((C100610c) t).f294788c, a)) {
                            break;
                        }
                    }
                    if (t != null) {
                        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, " + a + ", already prealoding!");
                    } else {
                        if (!b.mo59432m2()) {
                            if ((((float) b.field_cacheSize) / ((float) b.field_totalSize)) * ((float) 100) < ((float) c)) {
                                if (f294753a.mo140068k(mVar, c, n, new C100610c(0, i4, mVar, i3, n))) {
                                    i4++;
                                }
                            }
                        }
                        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, " + a + ", already reach cache size! cacheSize:" + b.field_cacheSize + ", totalSize:" + b.field_totalSize + ", cachePercent:" + ((((float) b.field_cacheSize) / ((float) b.field_totalSize)) * ((float) 100)));
                    }
                }
            }
        }
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "finish addPreloadVideo withList, total pull video task:" + i4 + " preloadRunningSet " + f294761i.size());
    }

    /* renamed from: l */
    public static boolean m131614l(C100604w wVar, List list, int i, int i2, boolean z, int i3, Object obj) {
        int i4;
        C98268m mVar;
        boolean z2 = (i3 & 8) != 0 ? true : z;
        wVar.getClass();
        Class cls = C32735h.class;
        C87412m.m108594g(list, "groupItems");
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery, galleryItems size:" + list.size() + ", positionV:" + i + "  positionH:" + i2 + ", skipPosition:" + z2);
        C100605a aVar = f294763k;
        aVar.getClass();
        if (!(!aVar.mo140071b(list) && aVar.f294770b == i2 && aVar.f294769a == i)) {
            if (i >= 0 && i2 >= 0 && i < list.size() && i2 < ((List) list.get(i)).size() && (mVar = ((C98266k) ((List) list.get(i)).get(i2)).f288082e) != null) {
                f294766n = mVar.f288089b;
            }
            f294767o = 0;
            f294762j = 0;
            f294763k = new C100605a(list, i, i2, f294763k, z2);
            ArrayList arrayList = new ArrayList();
            synchronized (list) {
                int i5 = 0;
                for (Object next : list) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        List list2 = (List) next;
                        if (i5 >= i && list2.size() > 0) {
                            arrayList.add(Integer.valueOf(((C98266k) list2.get(0)).f288082e.f288088a));
                        }
                        i5 = i6;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            if (i < list.size() && i2 < ((List) list.get(i)).size()) {
                int size = ((List) list.get(i)).size();
                while (i2 < size) {
                    arrayList2.add(Integer.valueOf(((C98266k) ((List) list.get(i)).get(i2)).f288082e.f288088a));
                    i2++;
                }
            }
            List<C100610c> list3 = f294761i;
            ArrayList arrayList3 = new ArrayList();
            for (T next2 : list3) {
                C100610c cVar = (C100610c) next2;
                if (!arrayList.contains(Integer.valueOf(cVar.f294786a.f288088a)) && !arrayList2.contains(Integer.valueOf(cVar.f294786a.f288088a))) {
                    arrayList3.add(next2);
                }
            }
            synchronized (arrayList3) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    f294753a.mo140061d(((C100610c) it.next()).f294786a);
                }
            }
            f294755c = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_strategy, 1);
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_speed_good, 450);
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_speed_bad, 200);
            f294756d = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_force_preload, 0);
            f294757e = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_story_preload_force_canload, 100);
            C100596k kVar = f294754b;
            kVar.f294740a = Qe;
            kVar.f294741b = Qe2;
            int recentAverageSpeed = CdnLogic.getRecentAverageSpeed(2);
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery clicfg_story_preload_strategy " + f294755c + " clicfg_story_preload_speed_good:" + Qe + " clicfg_story_preload_speed_bad:" + Qe2 + " clicfg_story_preload_force_preload " + f294756d + "  clicfg_story_preload_force_canload: " + f294757e + " speed:" + recentAverageSpeed);
            if (recentAverageSpeed > 0 && (i4 = f294757e) > 0 && recentAverageSpeed < i4) {
                Log.m105928w("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery speed too low then pass " + recentAverageSpeed + " clicfg_story_preload_force_canload: " + f294757e);
                LinkedList linkedList = new LinkedList();
                linkedList.addAll(f294761i);
                Iterator it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    wVar.mo140061d(((C100610c) it4.next()).f294786a);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final int mo140060c(String str, bc4 bc4, int i, boolean z) {
        int i2;
        float f = bc4.f297978z;
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "calcPreloadPercent, cacheSecondsDowngrade:" + i + ", mediaId:" + str + ", duration:" + f + ", isGoodNetwork:" + z + " media:" + bc4.f297978z);
        int i3 = z ? 5 : 3;
        if (f <= 0.0f) {
            f294754b.getClass();
            i2 = 30;
        } else {
            i2 = (f > ((float) i3) || i > 0) ? (int) (((double) (((float) Math.max(3, i)) / f)) * 100.0d) : 100;
        }
        f294754b.getClass();
        if (i2 > 30) {
            return i2;
        }
        f294754b.getClass();
        return 30;
    }

    /* renamed from: d */
    public final void mo140061d(C98268m mVar) {
        String str;
        C87412m.m108594g(mVar, "videoItem");
        int i = mVar.f288090c;
        String str2 = mVar.f288093f.f297961f;
        if (str2 == null) {
            str = "story_local_video_" + i;
        } else {
            str = C1297x.m1387b("storyvideo", (long) i, "story", str2);
        }
        T t = null;
        if (Util.isNullOrNil(str)) {
            str = null;
        }
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "cancelPreloadTask, videoItem:" + str);
        ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(str);
        Iterator<T> it = f294761i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C87412m.m108589b(((C100610c) next).f294788c, str)) {
                t = next;
                break;
            }
        }
        C100610c cVar = (C100610c) t;
        if (cVar != null) {
            f294761i.remove(cVar);
            int i2 = f294762j;
            if (i2 > 0) {
                f294762j = i2 - 1;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140062e(gw2.C98268m r6) {
        /*
            r5 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkPreLoad "
            r0.append(r1)
            r0.append(r6)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMStack.getCaller()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.StoryVideoPreloadMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r5.mo140066i(r6)
            r2 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.String r6 = "checkPreLoad checkCanPlay isLocalVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            r5.mo140069m(r2)
            return
        L_0x0038:
            cw2.u r0 = cw2.C97399u.f285903a
            kw2.m r0 = r0.mo136668b(r6)
            boolean r3 = r0.mo59432m2()
            r4 = 1
            if (r3 == 0) goto L_0x005d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "z checkCanPlay downloadFinish "
            r0.append(r2)
            long r2 = r6.f288089b
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r6)
            goto L_0x0099
        L_0x005d:
            int r6 = r0.field_totalSize
            if (r6 > 0) goto L_0x0062
            goto L_0x009a
        L_0x0062:
            int r3 = r0.field_cacheSize
            float r3 = (float) r3
            float r6 = (float) r6
            float r3 = r3 / r6
            r6 = 100
            float r6 = (float) r6
            float r3 = r3 * r6
            ow2.k r6 = f294754b
            r6.getClass()
            r6 = 30
            float r6 = (float) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x009a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "z checkCanPlay cachesize "
            r6.append(r2)
            int r2 = r0.field_cacheSize
            r6.append(r2)
            java.lang.String r2 = " totalSize: "
            r6.append(r2)
            int r0 = r0.field_totalSize
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r6)
        L_0x0099:
            r2 = 1
        L_0x009a:
            if (r2 != r4) goto L_0x00a5
            java.lang.String r6 = "checkPreLoad checkCanPlay true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            r5.mo140069m(r4)
            return
        L_0x00a5:
            int r6 = f294756d
            if (r6 != r4) goto L_0x00ac
            r5.mo140069m(r4)
        L_0x00ac:
            java.lang.String r6 = "nothing can checkPreLoad"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ow2.C100604w.mo140062e(gw2.m):void");
    }

    /* renamed from: f */
    public final C98127h mo140063f(String str, String str2, String str3, int i, int i2) {
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "createVideoPreloadCDNTask, mediaId:" + str + ", path:" + str3 + ", url:" + str2 + ", preloadPercent:" + i + ", connectionCount:" + i2);
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_StoryVideoPreloadMgr";
        hVar.field_mediaId = str;
        hVar.f287705p0 = str2;
        hVar.f287654K = 2;
        hVar.f287689V = 2;
        hVar.f287655L = 6;
        hVar.f287692W0 = i;
        hVar.field_preloadRatio = i;
        hVar.f287696Y0 = 4;
        hVar.field_fullpath = str3;
        hVar.f287662f = new C100613e();
        hVar.f287656M = new C100611d(Util.currentTicks());
        hVar.f287657N = i2;
        hVar.field_fileType = CdnLogic.kMediaTypeAppVideo;
        hVar.field_requestVideoFormat = ((C36594q) C86312j.m106911c(C36594q.class)).mo60729EJ(2, str3);
        return hVar;
    }

    /* renamed from: g */
    public final boolean mo140064g() {
        int i = f294754b.f294741b;
        int recentAverageSpeed = CdnLogic.getRecentAverageSpeed(2);
        return 1 <= recentAverageSpeed && recentAverageSpeed <= i;
    }

    /* renamed from: h */
    public final boolean mo140065h() {
        return CdnLogic.getRecentAverageSpeed(2) >= f294754b.f294740a;
    }

    /* renamed from: i */
    public final boolean mo140066i(C98268m mVar) {
        if (mVar.mo137567a()) {
            return true;
        }
        C97399u uVar = C97399u.f285903a;
        if (C86013q1.m106451l(uVar.mo136671e(mVar.f288093f)) > 0) {
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "isLocalVideo video downloadDone " + mVar.f288093f.f297958A + " username:" + mVar.f288091d);
            return true;
        } else if (!uVar.mo136668b(mVar).mo59432m2()) {
            return false;
        } else {
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", " isLocalVideo video download finish " + mVar.f288093f.f297958A + " username:" + mVar.f288091d);
            return true;
        }
    }

    /* renamed from: j */
    public final boolean mo140067j(C98268m mVar) {
        String str;
        if (mo140066i(mVar) || mVar.mo137567a()) {
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo fail, " + mVar + " isLocalVideo or fake video");
            return false;
        }
        int i = mVar.f288090c;
        String str2 = mVar.f288093f.f297961f;
        if (str2 == null) {
            str = "story_local_video_" + i;
        } else {
            str = C1297x.m1387b("storyvideo", (long) i, "story", str2);
        }
        if (Util.isNullOrNil(str)) {
            str = null;
        }
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(mVar.f288093f.f297961f) && !C112551y.m153810j(f294764l, str, false, 2, (Object) null)) {
            return true;
        }
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo:" + str + ", already request preload or url " + mVar.f288093f.f297961f);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0130, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0132, code lost:
        return false;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo140068k(gw2.C98268m r10, int r11, int r12, ow2.C100604w.C100610c r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "videoItem"
            gy3.C87412m.m108594g(r10, r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "taskInfo"
            gy3.C87412m.m108594g(r13, r0)     // Catch:{ all -> 0x0133 }
            boolean r0 = r10.mo137567a()     // Catch:{ all -> 0x0133 }
            r1 = 0
            if (r0 != 0) goto L_0x0131
            te3.bc4 r0 = r10.f288093f     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r0.f297961f     // Catch:{ all -> 0x0133 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0020
            goto L_0x0131
        L_0x0020:
            boolean r0 = r9.mo140066i(r10)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r11 = "MicroMsg.StoryVideoPreloadMgr"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r12.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r13 = "preloadVideoWithPercent, isLocalVideo: "
            r12.append(r13)     // Catch:{ all -> 0x0133 }
            te3.bc4 r10 = r10.f288093f     // Catch:{ all -> 0x0133 }
            java.lang.String r10 = r10.f297961f     // Catch:{ all -> 0x0133 }
            r12.append(r10)     // Catch:{ all -> 0x0133 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0133 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)     // Catch:{ all -> 0x0133 }
            monitor-exit(r9)
            return r1
        L_0x0043:
            te3.bc4 r0 = r10.f288093f     // Catch:{ all -> 0x0133 }
            java.lang.String r4 = r0.f297961f     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r13.f294788c     // Catch:{ all -> 0x0133 }
            cw2.u r2 = cw2.C97399u.f285903a     // Catch:{ all -> 0x0133 }
            kw2.m r3 = r2.mo136668b(r10)     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = "MicroMsg.StoryVideoPreloadMgr"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r6.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = "preloadVideoWithPercent, "
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            r6.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = ", "
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            r6.append(r11)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = ", playingMediaId:"
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = f294764l     // Catch:{ all -> 0x0133 }
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = ", "
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = r3.field_filePath     // Catch:{ all -> 0x0133 }
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = ", "
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            r6.append(r4)     // Catch:{ all -> 0x0133 }
            java.lang.String r7 = "  videoCache "
            r6.append(r7)     // Catch:{ all -> 0x0133 }
            r6.append(r3)     // Catch:{ all -> 0x0133 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0133 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x012f
            java.lang.String r5 = f294764l     // Catch:{ all -> 0x0133 }
            r6 = 0
            r8 = 2
            boolean r5 = z04.C112551y.m153810j(r5, r0, r1, r8, r6)     // Catch:{ all -> 0x0133 }
            if (r5 != 0) goto L_0x012f
            java.lang.String r5 = r10.f288091d     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = r2.mo136669c(r5)     // Catch:{ all -> 0x0133 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = "url"
            gy3.C87412m.m108593f(r4, r2)     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = r3.field_filePath     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = "videoCache.field_filePath"
            gy3.C87412m.m108593f(r5, r2)     // Catch:{ all -> 0x0133 }
            r2 = r9
            r3 = r0
            r6 = r11
            r7 = r12
            gi.h r12 = r2.mo140063f(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0133 }
            java.lang.Class<qo.l> r2 = p663qo.C101213l.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0133 }
            qo.l r2 = (p663qo.C101213l) r2     // Catch:{ all -> 0x0133 }
            r2.xf0(r12)     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = "MicroMsg.StoryVideoPreloadMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r3.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r4 = "preloadVideoWithPercent:"
            r3.append(r4)     // Catch:{ all -> 0x0133 }
            r3.append(r12)     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = ", currentSpeed:"
            r3.append(r12)     // Catch:{ all -> 0x0133 }
            int r12 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r8)     // Catch:{ all -> 0x0133 }
            r3.append(r12)     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x0133 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)     // Catch:{ all -> 0x0133 }
            java.util.Map<java.lang.String, gw2.m> r12 = f294758f     // Catch:{ all -> 0x0133 }
            r12.put(r0, r10)     // Catch:{ all -> 0x0133 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0133 }
            java.util.Map<java.lang.String, java.lang.Integer> r11 = f294759g     // Catch:{ all -> 0x0133 }
            r11.put(r0, r10)     // Catch:{ all -> 0x0133 }
            java.util.List<ow2.w$c> r10 = f294761i     // Catch:{ all -> 0x0133 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0133 }
        L_0x00ff:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0133 }
            if (r11 == 0) goto L_0x0119
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0133 }
            ow2.w$c r11 = (ow2.C100604w.C100610c) r11     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = r11.f294788c     // Catch:{ all -> 0x0133 }
            java.lang.String r12 = r13.f294788c     // Catch:{ all -> 0x0133 }
            boolean r11 = gy3.C87412m.m108589b(r11, r12)     // Catch:{ all -> 0x0133 }
            if (r11 == 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            int r1 = r1 + 1
            goto L_0x00ff
        L_0x0119:
            r1 = -1
        L_0x011a:
            if (r1 <= 0) goto L_0x0122
            java.util.List<ow2.w$c> r10 = f294761i     // Catch:{ all -> 0x0133 }
            r10.set(r1, r13)     // Catch:{ all -> 0x0133 }
            goto L_0x0127
        L_0x0122:
            java.util.List<ow2.w$c> r10 = f294761i     // Catch:{ all -> 0x0133 }
            r10.add(r13)     // Catch:{ all -> 0x0133 }
        L_0x0127:
            java.util.Set<java.lang.String> r10 = f294760h     // Catch:{ all -> 0x0133 }
            r10.remove(r0)     // Catch:{ all -> 0x0133 }
            monitor-exit(r9)
            r10 = 1
            return r10
        L_0x012f:
            monitor-exit(r9)
            return r1
        L_0x0131:
            monitor-exit(r9)
            return r1
        L_0x0133:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ow2.C100604w.mo140068k(gw2.m, int, int, ow2.w$c):boolean");
    }

    /* renamed from: m */
    public final void mo140069m(boolean z) {
        List<Integer> list;
        List<C100610c> list2;
        String str;
        String str2;
        List<Integer> list3;
        int i;
        boolean z2;
        T t;
        int i2;
        List<Integer> list4;
        int i3;
        boolean z3 = z;
        boolean h = mo140065h();
        boolean g = mo140064g();
        int recentAverageSpeed = CdnLogic.getRecentAverageSpeed(2);
        if (!z3 || recentAverageSpeed <= 0 || (i3 = f294757e) <= 0 || recentAverageSpeed >= i3) {
            int i4 = 3;
            int i5 = g ? 1 : 3;
            if (f294755c == 1) {
                i5 = 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("startPreloadQueue, isGoodNetwork:");
            sb.append(h);
            sb.append(", isBadNetwork:");
            sb.append(g);
            sb.append(", currentSpeed:");
            sb.append(CdnLogic.getRecentAverageSpeed(2));
            String str3 = " preloadRunningSet ";
            sb.append(str3);
            sb.append(f294761i.size());
            sb.append(" maxTaskNum ");
            sb.append(i5);
            String str4 = " totalPreLoadOneItemSelect ";
            sb.append(str4);
            sb.append(f294762j);
            sb.append(" checkNet ");
            sb.append(z3);
            sb.append(" callerFrom ");
            sb.append(MMStack.getCaller());
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", sb.toString());
            List<Integer> list5 = mo140064g() ? f294754b.f294743d : f294754b.f294742c;
            int i6 = 0;
            while (true) {
                list2 = f294761i;
                if (list2.size() < i5 && i6 < list.size() && f294762j < i4) {
                    int intValue = list.get(i6).intValue();
                    int n = mo140070n(i6);
                    while (true) {
                        C100605a aVar = f294763k;
                        String str5 = null;
                        C13604l lVar = null;
                        int i7 = 0;
                        while (i7 < aVar.f294778j.size() && lVar == null) {
                            try {
                                int i8 = aVar.f294775g;
                                if (i8 > aVar.f294772d) {
                                    Log.m105924i("MicroMsg.GroupData.StoryVideoPreloadMgr", "stop preload now " + aVar.f294775g);
                                    list4 = list;
                                    lVar = null;
                                    Log.m105924i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + aVar.f294773e + "  walkHorizontal:" + aVar.f294774f + " positionV:" + aVar.f294769a + " positionH:" + aVar.f294770b + ", ret:" + lVar);
                                    i7++;
                                    list = list4;
                                } else {
                                    List<? extends C32224a<C13604l<C98268m, C100610c>>> list6 = aVar.f294778j;
                                    lVar = (C13604l) ((C32224a) list6.get(i8 % list6.size())).invoke();
                                    aVar.f294775g++;
                                    list4 = list;
                                    Log.m105924i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + aVar.f294773e + "  walkHorizontal:" + aVar.f294774f + " positionV:" + aVar.f294769a + " positionH:" + aVar.f294770b + ", ret:" + lVar);
                                    i7++;
                                    list = list4;
                                }
                            } catch (Exception e) {
                                list4 = list;
                                Log.printErrStackTrace("MicroMsg.GroupData.StoryVideoPreloadMgr", e, "error on produce", new Object[0]);
                            }
                        }
                        list3 = list;
                        if (lVar == null) {
                            str = str3;
                            str2 = str4;
                            i = i5;
                            z2 = false;
                            break;
                        }
                        C98268m mVar = (C98268m) lVar.f38555d;
                        String str6 = ((C100610c) lVar.f38556e).f294788c;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("try preload mediaId ");
                        sb4.append(str6);
                        sb4.append(" videoItem:");
                        sb4.append(mVar);
                        sb4.append(" pos:");
                        sb4.append(lVar.f38556e);
                        sb4.append("  groupinfo ");
                        C100605a aVar2 = f294763k;
                        aVar2.getClass();
                        StringBuilder sb5 = new StringBuilder();
                        i = i5;
                        sb5.append("positionV:");
                        sb5.append(aVar2.f294769a);
                        sb5.append(", positionH:");
                        sb5.append(aVar2.f294770b);
                        sb5.append(", walkVertical:");
                        sb5.append(aVar2.f294773e);
                        sb5.append(", walkHorizontal:");
                        sb5.append(aVar2.f294774f);
                        sb4.append(sb5.toString());
                        sb4.append(" quota:");
                        sb4.append(intValue);
                        sb4.append("  fromTag:");
                        sb4.append("startPreLoad");
                        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", sb4.toString());
                        Iterator<T> it = f294761i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (C87412m.m108589b(((C100610c) t).f294788c, str6)) {
                                break;
                            }
                        }
                        C100610c cVar = (C100610c) t;
                        if (cVar == null || intValue > cVar.f294787b) {
                            if (!(str6.length() == 0)) {
                                str5 = str6;
                            }
                            if (str5 != null) {
                                int c = mo140060c(str6, mVar.f288093f, intValue, mo140065h());
                                C34078m b = C97399u.f285903a.mo136668b(mVar);
                                str2 = str4;
                                if (!b.mo59432m2()) {
                                    str = str3;
                                    if ((((float) b.field_cacheSize) / ((float) b.field_totalSize)) * ((float) 100) < ((float) c)) {
                                        if (mo140068k(mVar, c, n, (C100610c) lVar.f38556e)) {
                                            ((C100610c) lVar.f38556e).f294787b = intValue;
                                            z2 = true;
                                            break;
                                        }
                                        str4 = str2;
                                        list = list3;
                                        i2 = i;
                                        str3 = str;
                                    }
                                } else {
                                    str = str3;
                                }
                                Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "pull preload video, " + str6 + ", already reach cache size! cacheSize:" + b.field_cacheSize + ", totalSize:" + b.field_totalSize + ", cachePercent:" + ((((float) b.field_cacheSize) / ((float) b.field_totalSize)) * ((float) 100)) + "  fromTag:" + "startPreLoad");
                                str4 = str2;
                                list = list3;
                                i2 = i;
                                str3 = str;
                            } else {
                                String str7 = str3;
                            }
                        } else {
                            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "no need add quota " + intValue + " cur:" + cVar.f294787b + " fromTag:" + "startPreLoad");
                        }
                        list = list3;
                        i2 = i;
                    }
                    if (!z2) {
                        break;
                    }
                    i6++;
                    f294762j++;
                    str4 = str2;
                    list5 = list3;
                    i5 = i;
                    str3 = str;
                    i4 = 3;
                } else {
                    str = str3;
                    str2 = str4;
                }
            }
            str = str3;
            str2 = str4;
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "startPreloadQueue finish loop preload queue, current queue size: " + list2.size() + ", pullPreloadTaskNum:" + 0 + ", preloadVideoNum:" + i6 + str + list2.size() + str2 + f294762j + ' ');
            return;
        }
        Log.m105928w("MicroMsg.StoryVideoPreloadMgr", "speed too low then pass " + recentAverageSpeed + " clicfg_story_preload_force_canload: " + f294757e + " callerFrom " + MMStack.getCaller());
    }

    /* renamed from: n */
    public final int mo140070n(int i) {
        Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "taskConnectionCount: " + i);
        List<Integer> list = f294754b.f294744e;
        if (i >= list.size()) {
            i = f294754b.f294744e.size() - 1;
        }
        return list.get(i).intValue();
    }

    /* renamed from: ow2.w$c */
    public static final class C100610c {

        /* renamed from: a */
        public final C98268m f294786a;

        /* renamed from: b */
        public int f294787b;

        /* renamed from: c */
        public String f294788c;

        public C100610c(int i, int i2, C98268m mVar, int i3, int i4) {
            String str;
            C87412m.m108594g(mVar, "item");
            this.f294786a = mVar;
            this.f294787b = i3;
            int i5 = mVar.f288090c;
            String str2 = mVar.f288093f.f297961f;
            if (str2 == null) {
                str = "story_local_video_" + i5;
            } else {
                str = C1297x.m1387b("storyvideo", (long) i5, "story", str2);
            }
            str = Util.isNullOrNil(str) ? null : str;
            this.f294788c = str == null ? "" : str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C100610c(int i, int i2, C98268m mVar, int i3, int i4, int i5, C8480h hVar) {
            this(i, i2, mVar, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 1 : i4);
        }
    }

    /* renamed from: ow2.w$a */
    public static final class C100605a {

        /* renamed from: a */
        public int f294769a;

        /* renamed from: b */
        public int f294770b;

        /* renamed from: c */
        public final boolean f294771c;

        /* renamed from: d */
        public final int f294772d;

        /* renamed from: e */
        public int f294773e;

        /* renamed from: f */
        public int f294774f;

        /* renamed from: g */
        public int f294775g;

        /* renamed from: h */
        public ArrayList<C98266k> f294776h;

        /* renamed from: i */
        public ArrayList<C98266k> f294777i;

        /* renamed from: j */
        public List<? extends C32224a<C13604l<C98268m, C100610c>>> f294778j;

        /* renamed from: ow2.w$a$a */
        public static final class C100606a extends C87413o implements C32224a<C13604l<? extends C98268m, ? extends C100610c>> {

            /* renamed from: d */
            public final /* synthetic */ C100605a f294779d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100606a(C100605a aVar) {
                super(0);
                this.f294779d = aVar;
            }

            public Object invoke() {
                return C100605a.m131626a(this.f294779d);
            }
        }

        /* renamed from: ow2.w$a$b */
        public static final class C100607b extends C87413o implements C32224a<C13604l<? extends C98268m, ? extends C100610c>> {

            /* renamed from: d */
            public final /* synthetic */ C100605a f294780d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100607b(C100605a aVar) {
                super(0);
                this.f294780d = aVar;
            }

            public Object invoke() {
                return C100605a.m131626a(this.f294780d);
            }
        }

        /* renamed from: ow2.w$a$c */
        public static final class C100608c extends C87413o implements C32224a<C13604l<? extends C98268m, ? extends C100610c>> {

            /* renamed from: d */
            public final /* synthetic */ C100605a f294781d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100608c(C100605a aVar) {
                super(0);
                this.f294781d = aVar;
            }

            public Object invoke() {
                C100605a aVar = this.f294781d;
                while (true) {
                    if (aVar.f294771c) {
                        aVar.f294774f++;
                    }
                    C98268m mVar = null;
                    if (aVar.f294774f >= aVar.f294776h.size()) {
                        return null;
                    }
                    try {
                        int size = aVar.f294776h.size();
                        int i = aVar.f294774f;
                        if (size > i) {
                            C98268m mVar2 = aVar.f294776h.get(i).f288082e;
                            if (C100604w.f294753a.mo140067j(mVar2)) {
                                mVar = mVar2;
                            }
                            if (mVar != null) {
                                C13604l lVar = new C13604l(mVar, new C100610c(aVar.f294773e, aVar.f294774f, mVar, 0, 0, 24, (C8480h) null));
                                if (!aVar.f294771c) {
                                    aVar.f294774f++;
                                }
                                return lVar;
                            }
                        }
                    } finally {
                        if (!aVar.f294771c) {
                            aVar.f294774f++;
                        }
                    }
                }
            }
        }

        public C100605a(List<? extends List<C98266k>> list, int i, int i2, C100605a aVar, boolean z) {
            C87412m.m108594g(list, "groupItems");
            this.f294769a = i;
            this.f294770b = i2;
            this.f294771c = z;
            this.f294772d = 15;
            this.f294776h = new ArrayList<>();
            this.f294777i = new ArrayList<>();
            this.f294778j = C64197v.m75537f(new C100606a(this), new C100607b(this), new C100608c(this));
            if (!(aVar == null || this.f294769a == aVar.f294769a) || (!(aVar == null || this.f294770b == aVar.f294770b) || mo140071b(list))) {
                this.f294773e = this.f294769a;
                this.f294774f = this.f294770b;
                this.f294775g = 0;
            }
            this.f294776h.clear();
            this.f294777i.clear();
            synchronized (list) {
                for (List list2 : list) {
                    if (!list2.isEmpty()) {
                        this.f294777i.add(list2.get(0));
                    }
                }
            }
            if (this.f294769a < list.size()) {
                Iterable<C98266k> iterable = (Iterable) list.get(this.f294769a);
                synchronized (iterable) {
                    for (C98266k add : iterable) {
                        this.f294776h.add(add);
                    }
                }
            }
        }

        /* renamed from: a */
        public static final C13604l m131626a(C100605a aVar) {
            while (true) {
                if (aVar.f294771c) {
                    aVar.f294773e++;
                }
                C98268m mVar = null;
                if (aVar.f294773e >= aVar.f294777i.size()) {
                    return null;
                }
                try {
                    if (aVar.f294777i.size() > 0) {
                        C98268m mVar2 = aVar.f294777i.get(aVar.f294773e).f288082e;
                        if (C100604w.f294753a.mo140067j(mVar2)) {
                            mVar = mVar2;
                        }
                        if (mVar != null) {
                            C13604l lVar = new C13604l(mVar, new C100610c(aVar.f294773e, 0, mVar, 0, 0, 24, (C8480h) null));
                            if (!aVar.f294771c) {
                                aVar.f294773e++;
                            }
                            return lVar;
                        }
                    }
                } finally {
                    if (!aVar.f294771c) {
                        aVar.f294773e++;
                    }
                }
            }
        }

        /* renamed from: b */
        public final boolean mo140071b(List<? extends List<C98266k>> list) {
            if (list.size() != this.f294777i.size()) {
                return true;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((List) list.get(i)).isEmpty() || this.f294777i.get(i).f288082e.f288088a != ((C98266k) ((List) list.get(i)).get(0)).f288082e.f288088a) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C100605a(List list, int i, int i2, C100605a aVar, boolean z, int i3, C8480h hVar) {
            this(list, i, i2, aVar, (i3 & 16) != 0 ? true : z);
        }
    }
}
