package vq1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49712hj1;
import u60.C65222f;
import up1.C37521f;
import up1.C37556t;
import up1.C37557u;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import vp1.C65834e;

/* renamed from: vq1.w */
public final class C65866w {

    /* renamed from: g */
    public static final C14968a f189406g = new C14968a((C8480h) null);

    /* renamed from: h */
    public static final C65866w f189407h = new C65866w();

    /* renamed from: a */
    public C65222f<C65869y> f189408a = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(1, 5), 1, "finder_action_like_post_quene"));

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C14961i> f189409b;

    /* renamed from: c */
    public final ConcurrentHashMap<Long, C52984v> f189410c;

    /* renamed from: d */
    public final ConcurrentHashMap<Long, ConcurrentHashMap<C14970c, C52981a0>> f189411d;

    /* renamed from: e */
    public final HashMap<Long, C37556t> f189412e;

    /* renamed from: f */
    public final Runnable f189413f;

    /* renamed from: vq1.w$a */
    public static final class C14968a {
        public C14968a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C65866w mo14019a() {
            return C65866w.f189407h;
        }
    }

    /* renamed from: vq1.w$b */
    public interface C14969b {
    }

    /* renamed from: vq1.w$c */
    public static final class C14970c {

        /* renamed from: a */
        public final long f41032a;

        /* renamed from: b */
        public final int f41033b;

        public C14970c(long j, int i) {
            this.f41032a = j;
            this.f41033b = i;
        }

        public boolean equals(Object obj) {
            C14970c cVar = obj instanceof C14970c ? (C14970c) obj : null;
            return cVar != null && cVar.f41032a == this.f41032a && cVar.f41033b == this.f41033b;
        }

        public int hashCode() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f41032a);
            sb.append('_');
            sb.append(this.f41033b);
            return sb.toString().hashCode();
        }
    }

    /* renamed from: vq1.w$d */
    public static final class C14971d extends C87413o implements C32226l<FinderCommentInfo, Boolean> {

        /* renamed from: d */
        public static final C14971d f41034d = new C14971d();

        public C14971d() {
            super(1);
        }

        public Object invoke(Object obj) {
            FinderCommentInfo finderCommentInfo = (FinderCommentInfo) obj;
            C87412m.m108594g(finderCommentInfo, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(finderCommentInfo.username, C75592q0.m90789s()));
        }
    }

    /* renamed from: vq1.w$e */
    public static final class C65867e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65866w f189414d;

        public C65867e(C65866w wVar) {
            this.f189414d = wVar;
        }

        public final void run() {
            this.f189414d.mo89913l();
        }
    }

    public C65866w() {
        try {
            FinderCommonFeatureService finderCommonFeatureService = (FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class);
            finderCommonFeatureService.getClass();
            C86709a0.m107523b().mo121108c();
            C37557u uVar = finderCommonFeatureService.f157776C;
            uVar = uVar == null ? new C37557u(finderCommonFeatureService.mo76790Np()) : uVar;
            finderCommonFeatureService.f157776C = uVar;
            Iterator it = ((ArrayList) uVar.mo61205jo()).iterator();
            while (it.hasNext()) {
                C37556t tVar = (C37556t) it.next();
                this.f189412e.put(Long.valueOf(tVar.field_localId), tVar);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("Finder.FinderLikeActionMgr", th, "restoreLocalLikeFeed", new Object[0]);
        }
        this.f189409b = new ConcurrentLinkedQueue<>();
        this.f189410c = new ConcurrentHashMap<>();
        this.f189411d = new ConcurrentHashMap<>();
        this.f189412e = new HashMap<>();
        this.f189413f = new C65867e(this);
    }

    /* renamed from: c */
    public static void m77594c(C65866w wVar, FinderItem finderItem, boolean z, boolean z2, int i, int i2, C14969b bVar, C49712hj1 hj12, int i3, Object obj) {
        C65866w wVar2 = wVar;
        FinderItem finderItem2 = finderItem;
        int i4 = (i3 & 16) != 0 ? 0 : i2;
        C14969b bVar2 = (i3 & 32) != 0 ? null : bVar;
        wVar.getClass();
        C87412m.m108594g(finderItem2, "feed");
        C49712hj1 hj13 = hj12;
        C87412m.m108594g(hj13, "contextObj");
        StringBuilder sb = new StringBuilder();
        sb.append("dolike ");
        sb.append(finderItem.getUserName());
        sb.append(' ');
        boolean z3 = z;
        sb.append(z3);
        Log.m105924i("Finder.FinderLikeActionMgr", sb.toString());
        long j = finderItem2.field_id;
        C52984v vVar = new C52984v(finderItem, j, finderItem.getObjectNonceId(), z3, z2, i, i4, bVar2, hj13);
        wVar2.f189410c.put(Long.valueOf(j), vVar);
        wVar2.f189408a.mo89349c(new C65869y(vVar), new C65868x(wVar, vVar));
    }

    /* renamed from: a */
    public final void mo89903a(LinkedList<FinderCommentInfo> linkedList) {
        T t;
        C87412m.m108594g(linkedList, "newList");
        synchronized (linkedList) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((FinderCommentInfo) t).username, C75592q0.m90789s())) {
                    break;
                }
            }
            if (((FinderCommentInfo) t) == null) {
                FinderCommentInfo finderCommentInfo = new FinderCommentInfo();
                finderCommentInfo.username = C75592q0.m90789s();
                finderCommentInfo.nickname = C75592q0.m90783m();
                finderCommentInfo.headUrl = "";
                C13598b0 b0Var = C13598b0.f38549a;
                linkedList.add(0, finderCommentInfo);
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo89904b(long r5, up1.C65426w0 r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "commentObj"
            gy3.C87412m.m108594g(r7, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0010
            int r5 = r7.getLikeCount()
            return r5
        L_0x0010:
            int r0 = r7.getLikeFlag()
            r1 = 1
            if (r0 != r1) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99211K1
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == r1) goto L_0x0056
            r2.getClass()
            int r2 = up1.C37521f.f99260Q
            if (r2 != r1) goto L_0x0056
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<vq1.w$c, vq1.a0>> r8 = r4.f189411d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r8.get(r5)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            if (r5 == 0) goto L_0x0078
            vq1.w$c r6 = new vq1.w$c
            long r2 = r7.mo89531n2()
            r6.<init>(r2, r1)
            java.lang.Object r5 = r5.get(r6)
            vq1.a0 r5 = (vq1.C52981a0) r5
            if (r5 == 0) goto L_0x0078
            boolean r5 = r5.f147874f
            goto L_0x0079
        L_0x0056:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<vq1.w$c, vq1.a0>> r2 = r4.f189411d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r2.get(r5)
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            if (r5 == 0) goto L_0x0078
            vq1.w$c r6 = new vq1.w$c
            long r2 = r7.mo89531n2()
            r6.<init>(r2, r8)
            java.lang.Object r5 = r5.get(r6)
            vq1.a0 r5 = (vq1.C52981a0) r5
            if (r5 == 0) goto L_0x0078
            boolean r5 = r5.f147874f
            goto L_0x0079
        L_0x0078:
            r5 = r0
        L_0x0079:
            if (r0 == 0) goto L_0x0083
            if (r0 == r5) goto L_0x0083
            int r5 = r7.getLikeCount()
            int r5 = r5 - r1
            return r5
        L_0x0083:
            if (r0 != 0) goto L_0x008d
            if (r0 == r5) goto L_0x008d
            int r5 = r7.getLikeCount()
            int r5 = r5 + r1
            return r5
        L_0x008d:
            int r5 = r7.getLikeCount()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vq1.C65866w.mo89904b(long, up1.w0, int):int");
    }

    /* renamed from: d */
    public final int mo89905d(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feed");
        long j = finderObject.f164794id;
        if (j == 0) {
            return finderObject.friendLikeCount;
        }
        boolean z = false;
        boolean z2 = finderObject.likeFlag == 1;
        C52984v vVar = this.f189410c.get(Long.valueOf(j));
        if (vVar == null) {
            z = z2;
        } else if (vVar.f147890f && !vVar.f147891g) {
            z = true;
        }
        return (!z2 || z2 == z) ? (z2 || z2 == z) ? finderObject.friendLikeCount : finderObject.friendLikeCount + 1 : finderObject.friendLikeCount - 1;
    }

    /* renamed from: e */
    public final LinkedList<FinderCommentInfo> mo89906e(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feed");
        long j = finderObject.f164794id;
        if (j == 0) {
            LinkedList<FinderCommentInfo> linkedList = finderObject.likeList;
            C87412m.m108593f(linkedList, "feed.likeList");
            return linkedList;
        }
        boolean z = false;
        boolean z2 = finderObject.likeFlag == 1;
        C52984v vVar = this.f189410c.get(Long.valueOf(j));
        if (vVar == null) {
            z = z2;
        } else if (vVar.f147890f && !vVar.f147891g) {
            z = true;
        }
        if (z2 && z2 != z) {
            LinkedList<FinderCommentInfo> linkedList2 = finderObject.likeList;
            C87412m.m108593f(linkedList2, "feed.likeList");
            LinkedList<FinderCommentInfo> linkedList3 = new LinkedList<>();
            linkedList3.addAll(linkedList2);
            mo89912k(linkedList3);
            return linkedList3;
        } else if (z2 || z2 == z) {
            LinkedList<FinderCommentInfo> linkedList4 = finderObject.likeList;
            C87412m.m108593f(linkedList4, "feed.likeList");
            return linkedList4;
        } else {
            LinkedList<FinderCommentInfo> linkedList5 = finderObject.likeList;
            C87412m.m108593f(linkedList5, "feed.likeList");
            LinkedList<FinderCommentInfo> linkedList6 = new LinkedList<>();
            linkedList6.addAll(linkedList5);
            mo89903a(linkedList6);
            return linkedList6;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89907f(long r10, up1.C65426w0 r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "commentObj"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 0
            r1 = 1
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0015
            int r10 = r12.getLikeFlag()
            if (r10 != r1) goto L_0x0014
            r0 = 1
        L_0x0014:
            return r0
        L_0x0015:
            int r2 = r12.getLikeFlag()
            if (r2 != r1) goto L_0x001c
            r0 = 1
        L_0x001c:
            java.lang.String r2 = ""
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99211K1
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 32
            java.lang.String r6 = " get from cache "
            if (r4 == r1) goto L_0x0075
            r3.getClass()
            int r3 = up1.C37521f.f99260Q
            if (r3 != r1) goto L_0x0075
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<vq1.w$c, vq1.a0>> r3 = r9.f189411d
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Object r3 = r3.get(r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L_0x00ad
            vq1.w$c r4 = new vq1.w$c
            long r7 = r12.mo89531n2()
            r4.<init>(r7, r1)
            java.lang.Object r1 = r3.get(r4)
            vq1.a0 r1 = (vq1.C52981a0) r1
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r1.f147874f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            boolean r1 = r1.f147874f
            r3.append(r1)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            goto L_0x00ad
        L_0x0075:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<vq1.w$c, vq1.a0>> r1 = r9.f189411d
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            java.lang.Object r1 = r1.get(r3)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L_0x00ad
            vq1.w$c r3 = new vq1.w$c
            long r7 = r12.mo89531n2()
            r3.<init>(r7, r13)
            java.lang.Object r1 = r1.get(r3)
            vq1.a0 r1 = (vq1.C52981a0) r1
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r1.f147874f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            boolean r1 = r1.f147874f
            r3.append(r1)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
        L_0x00ad:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "isCommentLike test "
            r1.append(r3)
            r1.append(r10)
            java.lang.String r10 = " commentObj:"
            r1.append(r10)
            r1.append(r12)
            java.lang.String r10 = " cache:"
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = " likeFlag:"
            r1.append(r10)
            int r10 = r12.getLikeFlag()
            r1.append(r10)
            java.lang.String r10 = " scene:"
            r1.append(r10)
            r1.append(r13)
            java.lang.String r10 = " result:"
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            java.lang.String r11 = "Finder.FinderLikeActionMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vq1.C65866w.mo89907f(long, up1.w0, int):boolean");
    }

    /* renamed from: g */
    public final C13604l<Boolean, Boolean> mo89908g(FinderObject finderObject) {
        C87412m.m108594g(finderObject, "feed");
        long j = finderObject.f164794id;
        boolean z = true;
        if (j == 0) {
            Boolean valueOf = Boolean.valueOf(finderObject.likeFlag != 0);
            if (finderObject.likeFlag != 2) {
                z = false;
            }
            return new C13604l<>(valueOf, Boolean.valueOf(z));
        }
        int i = finderObject.likeFlag;
        boolean z2 = i != 0;
        if (i != 2) {
            z = false;
        }
        C52984v vVar = this.f189410c.get(Long.valueOf(j));
        if (vVar != null) {
            z2 = vVar.f147890f;
            z = vVar.f147891g;
        }
        if (BuildInfo.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("isLike test ");
            sb.append(finderObject.f164794id);
            sb.append(" isLike:");
            C52984v vVar2 = this.f189410c.get(Long.valueOf(finderObject.f164794id));
            sb.append(vVar2 != null ? Boolean.valueOf(vVar2.f147890f) : null);
            sb.append(" likeFlag:");
            sb.append(finderObject.likeFlag);
            sb.append(" result:");
            sb.append(z2);
            Log.m105924i("Finder.FinderLikeActionMgr", sb.toString());
        }
        return new C13604l<>(Boolean.valueOf(z2), Boolean.valueOf(z));
    }

    /* renamed from: h */
    public final int mo89909h(FinderObject finderObject) {
        FinderItem e;
        FinderObject feedObject;
        C87412m.m108594g(finderObject, "f");
        if (finderObject.f164794id == 0) {
            return finderObject.likeCount;
        }
        C37521f.f99374d.getClass();
        boolean z = false;
        if (!(!(C37521f.f99511s4.mo60266n().intValue() == 1) || (e = C65834e.f189316a.mo89871e(finderObject.f164794id)) == null || (feedObject = e.getFeedObject()) == null)) {
            finderObject = feedObject;
        }
        if (finderObject.likeFlag != 0) {
            z = true;
        }
        C52984v vVar = this.f189410c.get(Long.valueOf(finderObject.f164794id));
        boolean z2 = vVar != null ? vVar.f147890f : z;
        return (!z || z == z2) ? (z || z == z2) ? finderObject.likeCount : finderObject.likeCount + 1 : finderObject.likeCount - 1;
    }

    /* renamed from: i */
    public final void mo89910i(C52984v vVar) {
        C87412m.m108594g(vVar, "action");
        C52984v vVar2 = this.f189410c.get(Long.valueOf(vVar.f147888d));
        if (vVar2 != null) {
            if (BuildInfo.DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeLikeCache ");
                sb.append(vVar);
                sb.append(" result ");
                sb.append(vVar.f41018b >= vVar2.f41018b);
                Log.m105924i("Finder.FinderLikeActionMgr", sb.toString());
            }
            if (vVar.f41018b >= vVar2.f41018b) {
                this.f189410c.remove(Long.valueOf(vVar.f147888d));
            }
        }
    }

    /* renamed from: j */
    public final void mo89911j(C52981a0 a0Var) {
        C87412m.m108594g(a0Var, "action");
        ConcurrentHashMap concurrentHashMap = this.f189411d.get(Long.valueOf(a0Var.f147871c));
        if (concurrentHashMap != null) {
            C14970c cVar = new C14970c(a0Var.f147873e.mo89531n2(), a0Var.f147875g);
            C52981a0 a0Var2 = (C52981a0) concurrentHashMap.get(cVar);
            if (a0Var2 != null) {
                if (BuildInfo.DEBUG) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeLikeCommentCache ");
                    sb.append(a0Var);
                    sb.append(" result ");
                    sb.append(a0Var.f41018b >= a0Var2.f41018b);
                    Log.m105924i("Finder.FinderLikeActionMgr", sb.toString());
                }
                if (a0Var.f41018b >= a0Var2.f41018b) {
                    concurrentHashMap.remove(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo89912k(LinkedList<FinderCommentInfo> linkedList) {
        C87412m.m108594g(linkedList, "newList");
        C61926c.m72675T(linkedList, C14971d.f41034d);
    }

    /* renamed from: l */
    public final void mo89913l() {
        if (this.f189409b.size() > 0) {
            C14961i poll = this.f189409b.poll();
            boolean b = poll.mo14011b();
            Log.m105924i("Finder.FinderLikeActionMgr", "tryNext isValid:" + b + " action:" + poll + " size:" + this.f189409b.size());
            if (!b) {
                mo89913l();
            } else {
                this.f189408a.mo89349c(new C65869y(poll), new C65868x(this, poll));
            }
        }
    }
}
