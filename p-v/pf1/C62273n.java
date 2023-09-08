package pf1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53973z1;
import androidx.lifecycle.C54219z;
import bl3.C0327w;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import er1.C58784w3;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import qf1.C62608a;
import qf1.C62609b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C90364q0;
import te3.C49040cr0;
import te3.C49160dl;
import te3.C49712hj1;
import te3.C50232l93;
import te3.C51096re1;
import te3.C51235sf0;
import te3.C51388tf0;
import te3.C64650q60;
import te3.uc4;
import up1.C37521f;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pf1.n */
public final class C62273n extends C0327w<FinderCommonFeatureService> {

    /* renamed from: q */
    public static int f177018q;

    /* renamed from: r */
    public static long f177019r;

    /* renamed from: e */
    public final Map<Integer, Integer> f177020e = C90364q0.m113147f(new C13604l(33, 1), new C13604l(59, 60), new C13604l(22, 9), new C13604l(26, 27), new C13604l(81, 96), new C13604l(35, 2), new C13604l(24, 21), new C13604l(138, 139));

    /* renamed from: f */
    public final C62608a f177021f = new C62608a(new C62274a(this));

    /* renamed from: g */
    public C53973z1 f177022g;

    /* renamed from: h */
    public C32224a<? extends C64650q60> f177023h;

    /* renamed from: i */
    public final ConcurrentHashMap<String, C54219z<Set<C11911l>>> f177024i = new ConcurrentHashMap<>();

    /* renamed from: j */
    public final ConcurrentHashMap<String, C54219z<Set<C11911l>>> f177025j = new ConcurrentHashMap<>();

    /* renamed from: n */
    public final ConcurrentHashMap<Long, C54219z<C49160dl>> f177026n = new ConcurrentHashMap<>();

    /* renamed from: o */
    public final ConcurrentHashMap<Long, C54219z<C50232l93>> f177027o = new ConcurrentHashMap<>();

    /* renamed from: p */
    public final ConcurrentHashMap<Long, C54219z<C51096re1>> f177028p = new ConcurrentHashMap<>();

    /* renamed from: pf1.n$a */
    public static final class C62274a extends C87413o implements C32226l<Set<? extends C11911l>, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C62273n f177029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62274a(C62273n nVar) {
            super(1);
            this.f177029d = nVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x005f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.util.Set r8 = (java.util.Set) r8
                pf1.n r0 = r7.f177029d
                r0.getClass()
                r0 = 0
                r1 = 0
                r2 = 1
                if (r8 == 0) goto L_0x002c
                java.util.Iterator r8 = r8.iterator()
            L_0x0010:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L_0x0028
                java.lang.Object r3 = r8.next()
                r4 = r3
                pf1.l r4 = (pf1.C11911l) r4
                int r4 = r4.f34805c
                r5 = 2
                if (r4 != r5) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                if (r4 == 0) goto L_0x0010
                goto L_0x0029
            L_0x0028:
                r3 = r0
            L_0x0029:
                pf1.l r3 = (pf1.C11911l) r3
                goto L_0x002d
            L_0x002c:
                r3 = r0
            L_0x002d:
                if (r3 == 0) goto L_0x0062
                java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r8 = r3.f34806d
                if (r8 == 0) goto L_0x0062
                java.util.Iterator r8 = r8.iterator()
            L_0x0037:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L_0x0060
                java.lang.Object r3 = r8.next()
                r4 = r3
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r4
                int r5 = r4.business_type
                r6 = 3
                if (r5 != r6) goto L_0x005c
                int r5 = r4.jumpinfo_type
                if (r5 != r6) goto L_0x005c
                com.tencent.mm.protocal.protobuf.NativeInfo r4 = r4.native_info
                if (r4 == 0) goto L_0x0057
                int r4 = r4.native_type
                if (r4 != r6) goto L_0x0057
                r4 = 1
                goto L_0x0058
            L_0x0057:
                r4 = 0
            L_0x0058:
                if (r4 == 0) goto L_0x005c
                r4 = 1
                goto L_0x005d
            L_0x005c:
                r4 = 0
            L_0x005d:
                if (r4 == 0) goto L_0x0037
                r0 = r3
            L_0x0060:
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r0
            L_0x0062:
                if (r0 == 0) goto L_0x0065
                r1 = 1
            L_0x0065:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pf1.C62273n.C62274a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.jumper.FinderFeedJumperGlobalUIC$request$1", mo125469f = "FinderFeedJumperGlobalUIC.kt", mo125470l = {166}, mo125471m = "invokeSuspend")
    /* renamed from: pf1.n$b */
    public static final class C62275b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f177030d;

        /* renamed from: e */
        public Object f177031e;

        /* renamed from: f */
        public int f177032f;

        /* renamed from: g */
        public int f177033g;

        /* renamed from: h */
        public final /* synthetic */ List<FinderItem> f177034h;

        /* renamed from: i */
        public final /* synthetic */ C62273n f177035i;

        /* renamed from: j */
        public final /* synthetic */ int f177036j;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.jumper.FinderFeedJumperGlobalUIC$request$1$2$1", mo125469f = "FinderFeedJumperGlobalUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: pf1.n$b$a */
        public static final class C62276a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FinderItem f177037d;

            /* renamed from: e */
            public final /* synthetic */ C62273n f177038e;

            /* renamed from: f */
            public final /* synthetic */ int f177039f;

            /* renamed from: pf1.n$b$a$a */
            public static final class C62277a extends C87413o implements C32226l<FinderJumpInfo, Boolean> {

                /* renamed from: d */
                public final /* synthetic */ C11911l f177040d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C62277a(C11911l lVar) {
                    super(1);
                    this.f177040d = lVar;
                }

                public Object invoke(Object obj) {
                    FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
                    C87412m.m108594g(finderJumpInfo, LocaleUtil.ITALIAN);
                    return Boolean.valueOf(!this.f177040d.f34809g.contains(Integer.valueOf(finderJumpInfo.hashCode())));
                }
            }

            /* renamed from: pf1.n$b$a$b */
            public static final class C62278b extends C87413o implements C32226l<FinderJumpInfo, Boolean> {

                /* renamed from: d */
                public final /* synthetic */ FinderJumpInfo f177041d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C62278b(FinderJumpInfo finderJumpInfo) {
                    super(1);
                    this.f177041d = finderJumpInfo;
                }

                public Object invoke(Object obj) {
                    FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
                    C87412m.m108594g(finderJumpInfo, LocaleUtil.ITALIAN);
                    return Boolean.valueOf(C87412m.m108589b(finderJumpInfo.jump_id, this.f177041d.jump_id));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62276a(FinderItem finderItem, C62273n nVar, int i, C15601d<? super C62276a> dVar) {
                super(2, dVar);
                this.f177037d = finderItem;
                this.f177038e = nVar;
                this.f177039f = i;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C62276a(this.f177037d, this.f177038e, this.f177039f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62276a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                LinkedList<C51235sf0> linkedList;
                Object obj2;
                int i;
                HashSet hashSet;
                FinderJumpInfo finderJumpInfo;
                boolean z;
                ResultKt.throwOnFailure(obj);
                C51388tf0 tf02 = this.f177037d.getFeedObject().attachmentList;
                if (!(tf02 == null || (linkedList = tf02.f142195d) == null)) {
                    ArrayList arrayList = new ArrayList();
                    for (T next : linkedList) {
                        C51235sf0 sf02 = (C51235sf0) next;
                        C58784w3 w3Var = C58784w3.f168295a;
                        C87412m.m108593f(sf02, LocaleUtil.ITALIAN);
                        w3Var.getClass();
                        if (!(sf02.f141468d == 1)) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList<FinderJumpInfo> arrayList2 = new ArrayList<>(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        FinderJumpInfo finderJumpInfo2 = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        C49040cr0 cr02 = ((C51235sf0) it.next()).f141471g;
                        if (cr02 != null) {
                            finderJumpInfo2 = cr02.f131919d;
                        }
                        arrayList2.add(finderJumpInfo2);
                    }
                    C62273n nVar = this.f177038e;
                    FinderItem finderItem = this.f177037d;
                    int i2 = this.f177039f;
                    C54219z<Set<C11911l>> g3 = nVar.mo87341g3(finderItem.getExpectId(), i2);
                    Collection value = g3.getValue();
                    if (value == null) {
                        value = new HashSet();
                    }
                    HashSet<C11911l> hashSet2 = new HashSet<>(value);
                    for (C11911l lVar : hashSet2) {
                        C64175a0.m75512t(lVar.f34806d, new C62277a(lVar));
                    }
                    for (FinderJumpInfo finderJumpInfo3 : arrayList2) {
                        if (finderJumpInfo3 != null) {
                            LinkedList<uc4> linkedList2 = finderJumpInfo3.style;
                            C87412m.m108593f(linkedList2, "jumpInfo.style");
                            for (uc4 uc4 : linkedList2) {
                                Iterator it4 = hashSet2.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it4.next();
                                    if (((C11911l) obj2).f34805c == uc4.f142760f) {
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
                                C11911l lVar2 = (C11911l) obj2;
                                if (lVar2 == null) {
                                    finderJumpInfo = finderJumpInfo3;
                                    hashSet = hashSet2;
                                    i = i2;
                                    lVar2 = new C11911l(i2, finderItem.getExpectId(), uc4.f142760f, new LinkedList(), false, (String) null, 48, (C8480h) null);
                                } else {
                                    finderJumpInfo = finderJumpInfo3;
                                    hashSet = hashSet2;
                                    i = i2;
                                }
                                C64175a0.m75512t(lVar2.f34806d, new C62278b(finderJumpInfo));
                                lVar2.f34806d.add(finderJumpInfo);
                                lVar2.f34809g.remove(new Integer(finderJumpInfo.hashCode()));
                                hashSet.remove(lVar2);
                                hashSet.add(lVar2);
                                finderJumpInfo3 = finderJumpInfo;
                                hashSet2 = hashSet;
                                i2 = i;
                            }
                        }
                    }
                    g3.postValue(hashSet2);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62275b(List<? extends FinderItem> list, C62273n nVar, int i, C15601d<? super C62275b> dVar) {
            super(2, dVar);
            this.f177034h = list;
            this.f177035i = nVar;
            this.f177036j = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62275b(this.f177034h, this.f177035i, this.f177036j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62275b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C62275b bVar;
            C62273n nVar;
            Iterator it;
            int i;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i2 = this.f177033g;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                List<FinderItem> list = this.f177034h;
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    FinderObject finderObject = ((FinderItem) next).field_finderObject;
                    if ((finderObject != null ? finderObject.f164794id : 0) == 0) {
                        arrayList.add(next);
                    }
                }
                nVar = this.f177035i;
                bVar = this;
                int i3 = this.f177036j;
                it = arrayList.iterator();
                i = i3;
            } else if (i2 == 1) {
                i = this.f177032f;
                it = (Iterator) this.f177031e;
                nVar = (C62273n) this.f177030d;
                ResultKt.throwOnFailure(obj);
                bVar = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C62276a aVar2 = new C62276a((FinderItem) it.next(), nVar, i, (C15601d<? super C62276a>) null);
                bVar.f177030d = nVar;
                bVar.f177031e = it;
                bVar.f177032f = i;
                bVar.f177033g = 1;
                if (C53895h.m60469g(k2Var, aVar2, bVar) == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C62273n() {
        new C54219z();
    }

    /* renamed from: c3 */
    public static final void m73198c3(C62273n nVar, int i, int i2, String str, List list, String str2) {
        ArrayList arrayList;
        nVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("[request] scene=");
        sb.append(i);
        sb.append(" commentScene=");
        sb.append(i2);
        sb.append(" feedId=");
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        sb.append('=');
        if (list != null) {
            arrayList = new ArrayList(C36907w.m41090l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FinderJumpInfo finderJumpInfo = (FinderJumpInfo) it.next();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("jump_id=");
                sb4.append(finderJumpInfo.jump_id);
                sb4.append("#jump_type=");
                sb4.append(finderJumpInfo.jumpinfo_type);
                sb4.append("#business_type=");
                sb4.append(finderJumpInfo.business_type);
                sb4.append("#wording=");
                sb4.append(finderJumpInfo.wording);
                sb4.append("#style=");
                LinkedList<uc4> linkedList = finderJumpInfo.style;
                C87412m.m108593f(linkedList, "it.style");
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (uc4 uc4 : linkedList) {
                    arrayList2.add("pos=" + uc4.f142760f + "#style=" + uc4.f142762h + "#screen=" + uc4.f142758d);
                }
                sb4.append(arrayList2);
                arrayList.add(sb4.toString());
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        Log.m105924i("Finder.FeedGlobalJumperUIC", sb.toString());
    }

    /* renamed from: k3 */
    public static void m73199k3(C62273n nVar, FinderObject finderObject, int i, C49712hj1 hj12, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            hj12 = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        nVar.getClass();
        C87412m.m108594g(finderObject, "feed");
        nVar.mo87343j3(C26236u.m33719b(FinderItem.Companion.mo79056a(finderObject, 0)), i, hj12, i2);
    }

    /* renamed from: l3 */
    public static /* synthetic */ void m73200l3(C62273n nVar, List list, int i, C49712hj1 hj12, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            hj12 = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        nVar.mo87343j3(list, i, hj12, i2);
    }

    /* renamed from: d3 */
    public final void mo87338d3(HashMap<Integer, LinkedList<FinderJumpInfo>> hashMap, int i, List<? extends FinderJumpInfo> list) {
        if (!(list == null || list.isEmpty())) {
            Integer valueOf = Integer.valueOf(i);
            LinkedList<FinderJumpInfo> linkedList = hashMap.get(valueOf);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                hashMap.put(valueOf, linkedList);
            }
            linkedList.addAll(list);
        }
    }

    /* renamed from: e3 */
    public final void mo87339e3(List<? extends FinderJumpInfo> list, int i, int i2, boolean z) {
        if (!(list == null || list.isEmpty())) {
            for (FinderJumpInfo finderJumpInfo : list) {
                if ((finderJumpInfo.style.isEmpty() && z) || !z) {
                    LinkedList<uc4> linkedList = finderJumpInfo.style;
                    uc4 uc4 = new uc4();
                    uc4.f142760f = i;
                    uc4.f142761g = true;
                    uc4.f142762h = i2;
                    uc4.f142763i = true;
                    linkedList.add(uc4);
                }
            }
        }
    }

    /* renamed from: f3 */
    public final C54219z<Set<C11911l>> mo87340f3(long j, long j2, int i) {
        ConcurrentHashMap<String, C54219z<Set<C11911l>>> concurrentHashMap = this.f177025j;
        Integer num = this.f177020e.get(Integer.valueOf(i));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            i = intValue;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('#');
        sb.append(j2);
        sb.append('#');
        sb.append(i);
        String sb4 = sb.toString();
        C54219z<Set<C11911l>> zVar = concurrentHashMap.get(sb4);
        if (zVar == null) {
            C37521f.f99374d.getClass();
            zVar = C37521f.f99137B8.mo60266n().intValue() == 1 ? new C11921q0<>() : new C54219z<>();
            C54219z<Set<C11911l>> putIfAbsent = concurrentHashMap.putIfAbsent(sb4, zVar);
            if (putIfAbsent != null) {
                zVar = putIfAbsent;
            }
        }
        return zVar;
    }

    /* renamed from: g3 */
    public final C54219z<Set<C11911l>> mo87341g3(long j, int i) {
        ConcurrentHashMap<String, C54219z<Set<C11911l>>> concurrentHashMap = this.f177024i;
        Integer num = this.f177020e.get(Integer.valueOf(i));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            i = intValue;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('#');
        sb.append(i);
        String sb4 = sb.toString();
        C54219z<Set<C11911l>> zVar = concurrentHashMap.get(sb4);
        if (zVar == null) {
            C37521f.f99374d.getClass();
            zVar = C37521f.f99137B8.mo60266n().intValue() == 1 ? new C11921q0<>() : new C54219z<>();
            C54219z<Set<C11911l>> putIfAbsent = concurrentHashMap.putIfAbsent(sb4, zVar);
            if (putIfAbsent != null) {
                zVar = putIfAbsent;
            }
        }
        return zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = new androidx.lifecycle.C54219z<>();
     */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C54219z<te3.C50232l93> mo87342i3(long r2) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.l93>> r0 = r1.f177027o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L_0x0019
            androidx.lifecycle.z r3 = new androidx.lifecycle.z
            r3.<init>()
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            if (r2 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            androidx.lifecycle.z r3 = (androidx.lifecycle.C54219z) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62273n.mo87342i3(long):androidx.lifecycle.z");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87343j3(java.util.List<? extends com.tencent.p014mm.plugin.finder.storage.FinderItem> r19, int r20, te3.C49712hj1 r21, int r22) {
        /*
            r18 = this;
            r1 = r19
            r10 = r20
            r2 = r21
            r6 = r22
            java.lang.String r0 = "feeds"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.Class<ht1.v4> r0 = ht1.C8808v4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            java.lang.String r3 = "Finder.FeedGlobalJumperUIC"
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "[request] return teenMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        L_0x0023:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r0 = r19.iterator()
        L_0x002c:
            boolean r5 = r0.hasNext()
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r0.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r5
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r5.field_finderObject
            r11 = 0
            if (r9 == 0) goto L_0x0043
            long r13 = r9.f164794id
            goto L_0x0044
        L_0x0043:
            r13 = r11
        L_0x0044:
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x002c
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r5.getFeedObject()
            int r9 = r9.permissionFlag
            r9 = r9 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x005a
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r5.getFeedObject()
            int r9 = r9.adFlag
            if (r9 <= 0) goto L_0x0068
        L_0x005a:
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r5.getFeedObject()
            long r13 = r9.block_cgi_flag
            r15 = 1
            long r13 = r13 & r15
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0068
            r7 = 1
        L_0x0068:
            if (r7 == 0) goto L_0x002c
            te3.wf1 r7 = new te3.wf1
            r7.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r5.field_finderObject
            long r8 = r8.f164794id
            r7.f186081d = r8
            java.lang.String r8 = r5.getObjectNonceId()
            r7.f186082e = r8
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.field_finderObject
            int r8 = r5.adFlag
            r7.f186083f = r8
            pe3.b r5 = r5.cookie
            r7.f186084g = r5
            r4.add(r7)
            goto L_0x002c
        L_0x0089:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ r8
            r11 = 0
            if (r0 == 0) goto L_0x0178
            if (r2 == 0) goto L_0x0098
            java.lang.String r0 = r2.f134681r     // Catch:{ f -> 0x0096 }
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            goto L_0x00ba
        L_0x0098:
            r0 = r11
        L_0x0099:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ f -> 0x0096 }
            if (r5 != 0) goto L_0x00c1
            c30.g r5 = new c30.g     // Catch:{ f -> 0x0096 }
            r5.<init>((java.lang.String) r0)     // Catch:{ f -> 0x0096 }
            java.lang.String r0 = "sns_ad"
            c30.g r0 = r5.optJSONObject(r0)     // Catch:{ f -> 0x0096 }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r5 = "uxinfo"
            java.lang.String r0 = r0.optString(r5)     // Catch:{ f -> 0x0096 }
            if (r0 != 0) goto L_0x00b8
        L_0x00b6:
            java.lang.String r0 = ""
        L_0x00b8:
            r8 = r0
            goto L_0x00c2
        L_0x00ba:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r7 = "parse json error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r7, r5)
        L_0x00c1:
            r8 = r11
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "[getUxInfo] contextObj="
            r0.append(r5)
            if (r2 == 0) goto L_0x00d7
            int r2 = r21.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00d8
        L_0x00d7:
            r2 = r11
        L_0x00d8:
            r0.append(r2)
            java.lang.String r2 = ", uxinfo:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r0 = 2
            boolean r2 = r4.isEmpty()
            java.lang.String r5 = " triggerScene="
            java.lang.String r7 = " commentScene="
            if (r2 == 0) goto L_0x0116
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[request] units isEmpty! scene="
            r2.append(r4)
            r2.append(r0)
            r2.append(r7)
            r2.append(r10)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0178
        L_0x0116:
            long r12 = android.os.SystemClock.uptimeMillis()
            long r14 = f177019r
            long r12 = r12 - r14
            int r2 = f177018q
            long r14 = (long) r2
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r16
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x015d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[request] scene="
            r2.append(r4)
            r2.append(r0)
            r2.append(r7)
            r2.append(r10)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = " diffTimeSeconds="
            r2.append(r0)
            long r12 = r12 / r16
            r2.append(r12)
            java.lang.String r0 = " intervalSeconds="
            r2.append(r0)
            int r0 = f177018q
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0178
        L_0x015d:
            r0 = 0
            r12 = 0
            pf1.m r13 = new pf1.m
            r9 = 0
            r5 = 2
            r2 = r13
            r3 = r4
            r4 = r5
            r5 = r20
            r6 = r22
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r8 = 3
            r4 = r18
            r5 = r0
            r6 = r12
            r7 = r13
            bl3.C0317e.launch$default(r4, r5, r6, r7, r8, r9)
        L_0x0178:
            r2 = 0
            r3 = 0
            pf1.n$b r4 = new pf1.n$b
            r7 = r18
            r4.<init>(r1, r7, r10, r11)
            r5 = 3
            r6 = 0
            r1 = r18
            bl3.C0317e.launch$default(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62273n.mo87343j3(java.util.List, int, te3.hj1, int):void");
    }

    /* renamed from: m3 */
    public final void mo87344m3(List<? extends C0740i2> list, int i) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C0740i2 i2Var : list) {
                FinderItem o = i2Var instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var).mo3513o() : null;
                if (o != null) {
                    arrayList.add(o);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                FinderItem finderItem = (FinderItem) next;
                C62609b bVar = this.f177021f.f177805b.get(Long.valueOf(finderItem.getId()));
                long j = (bVar == null || bVar.f177807b == 1) ? 0 : bVar.f177806a;
                boolean z = j != 0 && C31543z5.m39451a() - j > 30000;
                if (z) {
                    C62609b bVar2 = this.f177021f.f177805b.get(Long.valueOf(finderItem.getId()));
                    if (bVar2 != null) {
                        bVar2.f177807b = 1;
                    }
                }
                Log.m105924i("Finder.FeedGlobalJumperUIC", "requestFeedsByCacheFilter refreshTime:" + j + " delta:" + (C31543z5.m39451a() - j) + " isRefresh:" + z);
                if (z) {
                    arrayList2.add(next);
                }
            }
            Log.m105924i("Finder.FeedGlobalJumperUIC", "requestFeedsByCacheFilter: size:" + arrayList2.size());
            if (!arrayList2.isEmpty()) {
                m73200l3(this, arrayList2, i, (C49712hj1) null, 0, 12, (Object) null);
            }
        }
    }

    /* renamed from: n3 */
    public final void mo87345n3(List<? extends C0740i2> list, int i) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C0740i2 i2Var : list) {
                FinderItem o = i2Var instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var).mo3513o() : null;
                if (o != null) {
                    arrayList.add(o);
                }
            }
            m73200l3(this, arrayList, i, (C49712hj1) null, 0, 12, (Object) null);
        }
    }
}
