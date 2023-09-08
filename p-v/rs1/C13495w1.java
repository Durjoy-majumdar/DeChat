package rs1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.os.SystemClock;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import rs1.C13426s1;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.db4;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$onEventHappen$1", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {233, 240, 258, 271, 277, 284}, mo125471m = "invokeSuspend")
/* renamed from: rs1.w1 */
public final class C13495w1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f38230d;

    /* renamed from: e */
    public Object f38231e;

    /* renamed from: f */
    public Object f38232f;

    /* renamed from: g */
    public int f38233g;

    /* renamed from: h */
    public final /* synthetic */ db4 f38234h;

    /* renamed from: i */
    public final /* synthetic */ C13426s1 f38235i;

    /* renamed from: j */
    public final /* synthetic */ boolean f38236j;

    /* renamed from: n */
    public final /* synthetic */ int f38237n;

    /* renamed from: o */
    public final /* synthetic */ C13426s1.C13427a f38238o;

    /* renamed from: p */
    public final /* synthetic */ C13426s1.C13428b f38239p;

    /* renamed from: q */
    public final /* synthetic */ C49712hj1 f38240q;

    /* renamed from: r */
    public final /* synthetic */ FinderObject f38241r;

    /* renamed from: s */
    public final /* synthetic */ FinderItem f38242s;

    /* renamed from: rs1.w1$a */
    public static final class C13496a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C13496a f38243d = new C13496a();

        public C13496a() {
            super(0);
        }

        public Object invoke() {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "long click avatar return 0", 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.w1$b */
    public static final class C13497b extends C87413o implements C32226l<BaseFinderFeed, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C13426s1 f38244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13497b(C13426s1 s1Var) {
            super(1);
            this.f38244d = s1Var;
        }

        public Object invoke(Object obj) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
            C13426s1 s1Var = this.f38244d;
            FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
            ConcurrentSkipListSet<Long> concurrentSkipListSet = C13426s1.f38005t;
            return s1Var.mo12823j3(feedObject);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$onEventHappen$1$3", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {286, 292, 300}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.w1$c */
    public static final class C13498c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f38245d;

        /* renamed from: e */
        public final /* synthetic */ C13426s1.C13427a f38246e;

        /* renamed from: f */
        public final /* synthetic */ C13426s1 f38247f;

        /* renamed from: g */
        public final /* synthetic */ int f38248g;

        /* renamed from: h */
        public final /* synthetic */ FinderObject f38249h;

        /* renamed from: i */
        public final /* synthetic */ List<FinderObject> f38250i;

        /* renamed from: j */
        public final /* synthetic */ boolean f38251j;

        /* renamed from: n */
        public final /* synthetic */ C13426s1.C13428b f38252n;

        /* renamed from: o */
        public final /* synthetic */ C49712hj1 f38253o;

        /* renamed from: p */
        public final /* synthetic */ LinkedList<FinderObject> f38254p;

        /* renamed from: q */
        public final /* synthetic */ List<BaseFinderFeed> f38255q;

        /* renamed from: r */
        public final /* synthetic */ FinderItem f38256r;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderEnhanceFeedUIC$onEventHappen$1$3$1", mo125469f = "FinderEnhanceFeedUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.w1$c$a */
        public static final class C13499a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ List<FinderObject> f38257d;

            /* renamed from: e */
            public final /* synthetic */ C13426s1.C13428b f38258e;

            /* renamed from: f */
            public final /* synthetic */ int f38259f;

            /* renamed from: g */
            public final /* synthetic */ C13426s1.C13427a f38260g;

            /* renamed from: h */
            public final /* synthetic */ C13426s1 f38261h;

            /* renamed from: i */
            public final /* synthetic */ FinderObject f38262i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13499a(List<? extends FinderObject> list, C13426s1.C13428b bVar, int i, C13426s1.C13427a aVar, C13426s1 s1Var, FinderObject finderObject, C15601d<? super C13499a> dVar) {
                super(2, dVar);
                this.f38257d = list;
                this.f38258e = bVar;
                this.f38259f = i;
                this.f38260g = aVar;
                this.f38261h = s1Var;
                this.f38262i = finderObject;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13499a(this.f38257d, this.f38258e, this.f38259f, this.f38260g, this.f38261h, this.f38262i, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13499a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                for (FinderObject finderObject : this.f38257d) {
                    ConcurrentSkipListSet<Long> concurrentSkipListSet = C13426s1.f38005t;
                    C13426s1.f38005t.add(new Long(finderObject.f164794id));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[onEventHappen] successfully insert of type=");
                sb.append(this.f38258e);
                sb.append(' ');
                sb.append(this.f38259f);
                sb.append("! ");
                sb.append(this.f38260g);
                sb.append(" requestObj=");
                C13426s1 s1Var = this.f38261h;
                FinderObject finderObject2 = this.f38262i;
                ConcurrentSkipListSet<Long> concurrentSkipListSet2 = C13426s1.f38005t;
                sb.append(s1Var.mo12823j3(finderObject2));
                sb.append(" insert=");
                List<FinderObject> list = this.f38257d;
                C13426s1 s1Var2 = this.f38261h;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (FinderObject j3 : list) {
                    arrayList.add(s1Var2.mo12823j3(j3));
                }
                sb.append(arrayList);
                Log.m105924i("Finder.EnhanceFeedUIC", sb.toString());
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13498c(C13426s1.C13427a aVar, C13426s1 s1Var, int i, FinderObject finderObject, List<? extends FinderObject> list, boolean z, C13426s1.C13428b bVar, C49712hj1 hj12, LinkedList<FinderObject> linkedList, List<? extends BaseFinderFeed> list2, FinderItem finderItem, C15601d<? super C13498c> dVar) {
            super(2, dVar);
            this.f38246e = aVar;
            this.f38247f = s1Var;
            this.f38248g = i;
            this.f38249h = finderObject;
            this.f38250i = list;
            this.f38251j = z;
            this.f38252n = bVar;
            this.f38253o = hj12;
            this.f38254p = linkedList;
            this.f38255q = list2;
            this.f38256r = finderItem;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13498c(this.f38246e, this.f38247f, this.f38248g, this.f38249h, this.f38250i, this.f38251j, this.f38252n, this.f38253o, this.f38254p, this.f38255q, this.f38256r, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13498c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f38245d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f38246e.f38026h = SystemClock.uptimeMillis();
                C13426s1 s1Var = this.f38247f;
                int i2 = this.f38248g;
                FinderObject finderObject = this.f38249h;
                List<FinderObject> list = this.f38250i;
                boolean z = this.f38251j;
                this.f38245d = 1;
                obj2 = C13426s1.m12737c3(s1Var, i2, finderObject, list, z, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = ((Number) obj2).intValue();
            if (intValue < 0) {
                C13426s1.C13427a aVar2 = this.f38246e;
                aVar2.f38025g = SystemClock.uptimeMillis();
                aVar2.mo12824a(6);
                StringBuilder sb = new StringBuilder();
                sb.append("[onEventHappen] #3 failure[位置不合适插入]! type=");
                sb.append(this.f38252n);
                sb.append(" insertPos=");
                sb.append(intValue);
                sb.append(' ');
                sb.append(this.f38246e);
                sb.append(" requestObj=");
                C13426s1 s1Var2 = this.f38247f;
                FinderObject finderObject2 = this.f38249h;
                ConcurrentSkipListSet<Long> concurrentSkipListSet = C13426s1.f38005t;
                sb.append(s1Var2.mo12823j3(finderObject2));
                Log.m105928w("Finder.EnhanceFeedUIC", sb.toString());
                this.f38246e.mo12824a(-3);
                C13426s1 s1Var3 = this.f38247f;
                int i3 = this.f38248g;
                C49712hj1 hj12 = this.f38253o;
                LinkedList<FinderObject> linkedList = this.f38254p;
                this.f38245d = 2;
                if (C13426s1.m12739e3(s1Var3, i3, hj12, linkedList, this) == aVar) {
                    return aVar;
                }
                return C13598b0.f38549a;
            }
            C13426s1 s1Var4 = this.f38247f;
            C13426s1.C13428b bVar = this.f38252n;
            List<BaseFinderFeed> list2 = this.f38255q;
            boolean z2 = this.f38251j;
            BaseFeedLoader<C0740i2> baseFeedLoader = s1Var4.f38010h;
            BaseFinderFeedLoader baseFinderFeedLoader = baseFeedLoader instanceof BaseFinderFeedLoader ? (BaseFinderFeedLoader) baseFeedLoader : null;
            if (baseFinderFeedLoader != null) {
                RecyclerView recyclerView = s1Var4.f38011i;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator(new C54234f());
                }
                if (z2) {
                    baseFinderFeedLoader.removeAll(intValue + 1);
                }
                int i4 = intValue + 1;
                baseFinderFeedLoader.insertAll(list2, i4);
                if (bVar == C13426s1.C13428b.LONG_CLICK_AVATAR) {
                    RecyclerView recyclerView2 = s1Var4.f38011i;
                    if (recyclerView2 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(Integer.valueOf(i4));
                        RecyclerView recyclerView3 = recyclerView2;
                        C117292a.m165358d(recyclerView3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderEnhanceFeedUIC", "insertEnhanceObj", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderEnhanceFeedUIC$EventType;Ljava/util/List;IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        recyclerView2.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderEnhanceFeedUIC", "insertEnhanceObj", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderEnhanceFeedUIC$EventType;Ljava/util/List;IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    }
                    s1Var4.f38018s = true;
                }
                if (Log.getLogLevel() <= 1) {
                    DataBuffer dataListJustForAdapter = baseFinderFeedLoader.getDataListJustForAdapter();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("[insertEnhanceObj] type=");
                    sb4.append(bVar);
                    sb4.append(" allFeed=");
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(dataListJustForAdapter, 10));
                    Iterator it = dataListJustForAdapter.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C61926c.m72691p(((C0740i2) it.next()).getItemId()));
                    }
                    sb4.append(arrayList);
                    Log.m105918d("Finder.EnhanceFeedUIC", sb4.toString());
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(dataListJustForAdapter, 10));
                    Iterator it4 = dataListJustForAdapter.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(Long.valueOf(((C0740i2) it4.next()).getItemId()));
                    }
                    HashSet hashSet = new HashSet(arrayList2);
                    if (hashSet.size() < dataListJustForAdapter.size()) {
                        Iterator it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            Long l = (Long) it5.next();
                            Iterator it6 = dataListJustForAdapter.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i5 = -1;
                                    break;
                                }
                                if (l != null && ((C0740i2) it6.next()).getItemId() == l.longValue()) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 >= 0) {
                                dataListJustForAdapter.remove(i5);
                            }
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("[insertEnhanceObj] type=");
                        sb5.append(bVar);
                        sb5.append(" error! duplicate id=");
                        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(dataListJustForAdapter, 10));
                        Iterator it7 = dataListJustForAdapter.iterator();
                        while (it7.hasNext()) {
                            arrayList3.add(C61926c.m72691p(((C0740i2) it7.next()).getItemId()));
                        }
                        sb5.append(arrayList3);
                        Log.m105920e("Finder.EnhanceFeedUIC", sb5.toString());
                    }
                }
            }
            this.f38247f.f38006d.add(new Long(this.f38256r.field_id));
            this.f38246e.f38027i = this.f38255q.size();
            C13426s1.C13427a aVar4 = this.f38246e;
            aVar4.f38025g = SystemClock.uptimeMillis();
            aVar4.mo12824a(6);
            C53896h0 h0Var = C53872d1.f151119c;
            C13499a aVar5 = new C13499a(this.f38250i, this.f38252n, intValue, this.f38246e, this.f38247f, this.f38249h, (C15601d<? super C13499a>) null);
            this.f38245d = 3;
            if (C53895h.m60469g(h0Var, aVar5, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13495w1(db4 db4, C13426s1 s1Var, boolean z, int i, C13426s1.C13427a aVar, C13426s1.C13428b bVar, C49712hj1 hj12, FinderObject finderObject, FinderItem finderItem, C15601d<? super C13495w1> dVar) {
        super(2, dVar);
        this.f38234h = db4;
        this.f38235i = s1Var;
        this.f38236j = z;
        this.f38237n = i;
        this.f38238o = aVar;
        this.f38239p = bVar;
        this.f38240q = hj12;
        this.f38241r = finderObject;
        this.f38242s = finderItem;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13495w1(this.f38234h, this.f38235i, this.f38236j, this.f38237n, this.f38238o, this.f38239p, this.f38240q, this.f38241r, this.f38242s, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13495w1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0371, code lost:
        r0 = ((java.lang.Boolean) r0).booleanValue();
        r2 = r1.f38238o;
        r2.f38024f = android.os.SystemClock.uptimeMillis();
        r2.mo12824a(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0383, code lost:
        if (r0 != false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0385, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("[onEventHappen] #2 failure[预加载失败]! type=");
        r2.append(r1.f38239p);
        r2.append(' ');
        r2.append(r1.f38238o);
        r2.append(" requestObj=");
        r3 = r1.f38235i;
        r4 = r1.f38241r;
        r6 = rs1.C13426s1.f38005t;
        r2.append(r3.mo12823j3(r4));
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("Finder.EnhanceFeedUIC", r2.toString());
        r1.f38238o.mo12824a(-2);
        r0 = r1.f38235i;
        r2 = r1.f38237n;
        r3 = r1.f38240q;
        r1.f38230d = null;
        r1.f38231e = null;
        r1.f38232f = null;
        r1.f38233g = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d3, code lost:
        if (rs1.C13426s1.m12739e3(r0, r2, r3, r15, r1) != r5) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03d5, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03d8, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03d9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.EnhanceFeedUIC", "[onEventHappen] type=" + r1.f38239p + " pendingInsert=[" + sx3.C110818d0.m150921S(r16, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new rs1.C13495w1.C13497b(r1.f38235i), 31, (java.lang.Object) null) + ']');
        r0 = a14.C53872d1.f151117a;
        r0 = f14.C58901s.f168555a;
        r6 = new rs1.C13495w1.C13498c(r1.f38238o, r1.f38235i, r1.f38237n, r1.f38241r, r3, r1.f38236j, r1.f38239p, r1.f38240q, r15, r16, r1.f38242s, (wx3.C15601d<? super rs1.C13495w1.C13498c>) null);
        r1.f38230d = null;
        r1.f38231e = null;
        r1.f38232f = null;
        r1.f38233g = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0440, code lost:
        if (a14.C53895h.m60469g(r0, r6, r1) != r5) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0442, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0445, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r1.f38236j == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        r17 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        r3 = r1.f38238o;
        r3.f38021c = android.os.SystemClock.uptimeMillis();
        r3.mo12824a(2);
        r3 = r1.f38235i;
        r11 = r3.f38008f;
        r14 = r1.f38239p.f38036d;
        r12 = r1.f38237n;
        r13 = r1.f38240q;
        r7 = r1.f38241r;
        r4 = r3.f38007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5 = new java.util.LinkedList(r3.f38007e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r1.f38233g = 2;
        r11.f29829a.mo89360c();
        r3 = c14.C54629k.m61479a(0, (c14.C54624g) null, (fy3.C32226l) null, 7, (java.lang.Object) null);
        r4 = r11.f29829a;
        r22 = r10;
        r10 = new ke1.C9594m(r12, r13, r7, r5, r15, r14, r17, r3);
        r4.mo11856a(new ke1.C9590j.C9591a(r3, r22));
        r3 = ((c14.C54602a) r3).mo75514g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        if (r3 != r2) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0100, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        r3 = (ob0.C89132b.C89134c) r3;
        r4 = r1.f38238o;
        r4.f38022d = android.os.SystemClock.uptimeMillis();
        r4.mo12824a(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        if (r1.f38239p != rs1.C13426s1.C13428b.STAR) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        if (r1.f38235i.f38017r.get() == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.EnhanceFeedUIC", "[onEventHappen] #0 failure[星标被取消] type=" + r1.f38239p);
        r1.f38235i.f38017r.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0140, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0141, code lost:
        r4 = new java.util.LinkedList();
        r7 = r1.f38235i;
        r8 = r1.f38239p;
        r10 = r1.f38237n;
        r11 = r3.f256793a;
        r12 = r3.f256794b;
        r3 = r3.f256796d;
        gy3.C87412m.m108593f(r3, "result.resp");
        r3 = (te3.C51981xj0) r3;
        r13 = r1.f38241r;
        r14 = r1.f38236j;
        r15 = rs1.C13426s1.f38005t;
        r7.getClass();
        r15 = new java.lang.StringBuilder();
        r15.append("[handleResp] errType=");
        r15.append(r11);
        r15.append(" errCode=");
        r15.append(r12);
        r5 = " requestObj=";
        r15.append(r5);
        r15.append(r7.mo12823j3(r13));
        r15.append(" isOverwrite=");
        r15.append(r14);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("Finder.EnhanceFeedUIC", r15.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0194, code lost:
        if (r11 != 0) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0196, code lost:
        if (r12 != 0) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0198, code lost:
        r11 = r3.f144695d;
        gy3.C87412m.m108593f(r11, "respList");
        r12 = r11.listIterator(r11.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01ab, code lost:
        if (r12.hasPrevious() == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ad, code lost:
        r6 = r12.previous();
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01c1, code lost:
        if (r7.mo12821g3().mo11614e3(r10, r6.f164794id) != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c3, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ca, code lost:
        if (r6.f164794id != r7.f38016q) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cd, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cf, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d0, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d1, code lost:
        if (r1 == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d3, code lost:
        r1 = r12.nextIndex();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d8, code lost:
        r1 = r21;
        r5 = r9;
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01df, code lost:
        r19 = r2;
        r9 = r5;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e3, code lost:
        if (r1 < 0) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e5, code lost:
        if (r14 == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("Finder.EnhanceFeedUIC", "[handleResp] sub respList by lastReadIndex=" + r1);
        r1 = r1 + 1;
        r2 = r11.subList(0, r1);
        gy3.C87412m.m108593f(r2, "respList.subList(0, lastReadIndex + 1)");
        r5 = new java.util.ArrayList();
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0214, code lost:
        if (r2.hasNext() == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0216, code lost:
        r6 = r2.next();
        r16 = r2;
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x022d, code lost:
        if ((!r7.mo12821g3().mo11614e3(r10, ((com.tencent.p014mm.protocal.protobuf.FinderObject) r6).f164794id)) == false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x022f, code lost:
        r5.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0232, code lost:
        r2 = r16;
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0237, code lost:
        r20 = r13;
        r4.addAll(r5);
        r11 = r11.subList(r1, r11.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0245, code lost:
        r20 = r13;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0247, code lost:
        if (r14 == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0249, code lost:
        if (r8 == r0) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0250, code lost:
        if (r11.size() >= 3) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0252, code lost:
        r4.addAll(r3.f144695d);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("Finder.EnhanceFeedUIC", "[handleResp] throw this resp. rawSize=" + r3.f144695d.size() + " unreadSize=" + r11.size() + r9 + r7.mo12823j3(r20));
        r1 = sx3.C64186f0.f181907d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x028c, code lost:
        r1 = bo1.C0344g.f929a;
        r2 = r3.f144698g;
        r3 = r3.f144695d;
        gy3.C87412m.m108593f(r3, "resp.`object`");
        r1.mo386b(r2, r3, com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE);
        gy3.C87412m.m108593f(r11, "finalUnreadList");
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02a3, code lost:
        r19 = r2;
        r1 = sx3.C64186f0.f181907d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02a7, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ac, code lost:
        if (r3.isEmpty() == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02ae, code lost:
        r1 = r21;
        r2 = r1.f38238o;
        r2.f38025g = android.os.SystemClock.uptimeMillis();
        r2.mo12824a(6);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("Finder.EnhanceFeedUIC", "[onEventHappen] #1 failure[最终条数不够]! type=" + r1.f38239p + ' ' + r1.f38238o + " requestObj=" + r1.f38235i.mo12823j3(r1.f38241r));
        r1.f38238o.mo12824a(-1);
        r2 = r1.f38235i;
        r3 = r1.f38237n;
        r5 = r1.f38240q;
        r1.f38233g = 3;
        r2 = rs1.C13426s1.m12739e3(r2, r3, r5, r4, r1);
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0303, code lost:
        if (r2 != r5) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0305, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0308, code lost:
        if (r1.f38239p != r0) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x030a, code lost:
        o40.C61926c.m72668M(rs1.C13495w1.C13496a.f38243d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0311, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0312, code lost:
        r1 = r21;
        r5 = r19;
        r0 = r1.f38238o;
        r0.f38023e = android.os.SystemClock.uptimeMillis();
        r0.mo12824a(4);
        r0 = wp1.C15585f.f42211a.mo14343f(r3, r1.f38237n, r1.f38240q);
        r6 = new java.util.ArrayList(sx3.C36907w.m41090l(r0, 10));
        r0 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0341, code lost:
        if (r0.hasNext() == false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0343, code lost:
        r6.add(wp1.C15585f.f42211a.mo14348k((com.tencent.p014mm.plugin.finder.storage.FinderItem) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0353, code lost:
        r1.f38230d = r4;
        r1.f38231e = r3;
        r1.f38232f = r6;
        r1.f38233g = 4;
        r0 = rs1.C13426s1.m12738d3(r1.f38235i, r1.f38240q, r1.f38237n, (com.tencent.p014mm.protocal.protobuf.FinderObject) sx3.C110818d0.m150914L(r3), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x036b, code lost:
        if (r0 != r5) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x036d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x036e, code lost:
        r15 = r4;
        r16 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            rs1.s1$b r0 = rs1.C13426s1.C13428b.LONG_CLICK_AVATAR
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r1.f38233g
            r6 = 0
            r7 = 5
            r8 = 0
            r9 = 1
            switch(r3) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0044;
                case 2: goto L_0x003d;
                case 3: goto L_0x0038;
                case 4: goto L_0x0021;
                case 5: goto L_0x001c;
                case 6: goto L_0x0017;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x0443
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x03d6
        L_0x0021:
            java.lang.Object r0 = r1.f38232f
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r1.f38231e
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r6 = r1.f38230d
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            kotlin.ResultKt.throwOnFailure(r22)
            r16 = r0
            r5 = r2
            r15 = r6
            r0 = r22
            goto L_0x0371
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r22)
            goto L_0x0306
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r22)
            r3 = r22
            goto L_0x0101
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r22)
            r3 = r22
            goto L_0x009a
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r22)
            dp1.j1$a r3 = dp1.C58378j1.f167214j0
            te3.db4 r10 = r1.f38234h
            java.lang.String r11 = "Finder.EnhanceFeedUIC"
            r3.mo83213c(r10, r11)
            rs1.s1 r3 = r1.f38235i
            te3.db4 r10 = r1.f38234h
            java.util.LinkedList<te3.db4> r11 = r3.f38007e
            monitor-enter(r11)
            java.util.LinkedList<te3.db4> r12 = r3.f38007e     // Catch:{ all -> 0x0449 }
            int r12 = r12.size()     // Catch:{ all -> 0x0449 }
            if (r12 < r7) goto L_0x0072
            java.util.LinkedList<te3.db4> r12 = r3.f38007e     // Catch:{ all -> 0x0449 }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x0449 }
            if (r12 != 0) goto L_0x0072
            java.util.LinkedList<te3.db4> r12 = r3.f38007e     // Catch:{ all -> 0x0449 }
            r12.removeFirst()     // Catch:{ all -> 0x0449 }
        L_0x0072:
            java.util.LinkedList<te3.db4> r3 = r3.f38007e     // Catch:{ all -> 0x0449 }
            r3.add(r10)     // Catch:{ all -> 0x0449 }
            monitor-exit(r11)
            boolean r3 = r1.f38236j
            if (r3 == 0) goto L_0x009e
            rs1.s1 r3 = r1.f38235i
            int r10 = r1.f38237n
            r1.f38233g = r9
            r3.getClass()
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            a14.h0 r12 = a14.C53872d1.f151117a
            a14.k2 r12 = f14.C58901s.f168555a
            rs1.v1 r13 = new rs1.v1
            r13.<init>(r3, r11, r10, r8)
            java.lang.Object r3 = a14.C53895h.m60469g(r12, r13, r1)
            if (r3 != r2) goto L_0x009a
            return r2
        L_0x009a:
            java.util.List r3 = (java.util.List) r3
        L_0x009c:
            r15 = r3
            goto L_0x00a1
        L_0x009e:
            sx3.f0 r3 = sx3.C64186f0.f181907d
            goto L_0x009c
        L_0x00a1:
            boolean r3 = r1.f38236j
            r10 = 2
            if (r3 == 0) goto L_0x00a9
            r17 = 1
            goto L_0x00ab
        L_0x00a9:
            r17 = 2
        L_0x00ab:
            rs1.s1$a r3 = r1.f38238o
            long r11 = android.os.SystemClock.uptimeMillis()
            r3.f38021c = r11
            r3.mo12824a(r10)
            rs1.s1 r3 = r1.f38235i
            ke1.j r11 = r3.f38008f
            rs1.s1$b r12 = r1.f38239p
            int r14 = r12.f38036d
            int r12 = r1.f38237n
            te3.hj1 r13 = r1.f38240q
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r1.f38241r
            java.util.LinkedList<te3.db4> r4 = r3.f38007e
            monitor-enter(r4)
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ all -> 0x0446 }
            java.util.LinkedList<te3.db4> r3 = r3.f38007e     // Catch:{ all -> 0x0446 }
            r5.<init>(r3)     // Catch:{ all -> 0x0446 }
            monitor-exit(r4)
            r1.f38233g = r10
            u60.m r3 = r11.f29829a
            r3.mo89360c()
            r3 = 7
            c14.h r3 = c14.C54629k.m61479a(r6, r8, r8, r3, r8)
            u60.m r4 = r11.f29829a
            ke1.j$a r11 = new ke1.j$a
            ke1.m r10 = new ke1.m
            r22 = r10
            r8 = r11
            r11 = r12
            r12 = r13
            r13 = r7
            r7 = r14
            r14 = r5
            r16 = r7
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r5 = r22
            r8.<init>(r3, r5)
            r4.mo11856a(r8)
            c14.a r3 = (c14.C54602a) r3
            java.lang.Object r3 = r3.mo75514g(r1)
            if (r3 != r2) goto L_0x0101
            return r2
        L_0x0101:
            ob0.b$c r3 = (ob0.C89132b.C89134c) r3
            rs1.s1$a r4 = r1.f38238o
            long r7 = android.os.SystemClock.uptimeMillis()
            r4.f38022d = r7
            r5 = 3
            r4.mo12824a(r5)
            rs1.s1$b r4 = r1.f38239p
            rs1.s1$b r7 = rs1.C13426s1.C13428b.STAR
            if (r4 != r7) goto L_0x0141
            rs1.s1 r4 = r1.f38235i
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f38017r
            boolean r4 = r4.get()
            if (r4 == 0) goto L_0x0141
            java.lang.String r0 = "Finder.EnhanceFeedUIC"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onEventHappen] #0 failure[星标被取消] type="
            r2.append(r3)
            rs1.s1$b r3 = r1.f38239p
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            rs1.s1 r0 = r1.f38235i
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f38017r
            r0.set(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0141:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            rs1.s1 r7 = r1.f38235i
            rs1.s1$b r8 = r1.f38239p
            int r10 = r1.f38237n
            int r11 = r3.f256793a
            int r12 = r3.f256794b
            T r3 = r3.f256796d
            java.lang.String r13 = "result.resp"
            gy3.C87412m.m108593f(r3, r13)
            te3.xj0 r3 = (te3.C51981xj0) r3
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r1.f38241r
            boolean r14 = r1.f38236j
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Long> r15 = rs1.C13426s1.f38005t
            r7.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "[handleResp] errType="
            r15.append(r5)
            r15.append(r11)
            java.lang.String r5 = " errCode="
            r15.append(r5)
            r15.append(r12)
            java.lang.String r5 = " requestObj="
            r15.append(r5)
            java.lang.String r6 = r7.mo12823j3(r13)
            r15.append(r6)
            java.lang.String r6 = " isOverwrite="
            r15.append(r6)
            r15.append(r14)
            java.lang.String r6 = r15.toString()
            java.lang.String r15 = "Finder.EnhanceFeedUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
            if (r11 != 0) goto L_0x02a3
            if (r12 != 0) goto L_0x02a3
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r11 = r3.f144695d
            java.lang.String r12 = "respList"
            gy3.C87412m.m108593f(r11, r12)
            int r12 = r11.size()
            java.util.ListIterator r12 = r11.listIterator(r12)
        L_0x01a7:
            boolean r17 = r12.hasPrevious()
            if (r17 == 0) goto L_0x01df
            java.lang.Object r17 = r12.previous()
            r6 = r17
            com.tencent.mm.protocal.protobuf.FinderObject r6 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r6
            os1.q r9 = r7.mo12821g3()
            r19 = r2
            long r1 = r6.f164794id
            boolean r1 = r9.mo11614e3(r10, r1)
            if (r1 != 0) goto L_0x01cf
            long r1 = r6.f164794id
            r9 = r5
            long r5 = r7.f38016q
            int r20 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r20 != 0) goto L_0x01cd
            goto L_0x01d0
        L_0x01cd:
            r1 = 0
            goto L_0x01d1
        L_0x01cf:
            r9 = r5
        L_0x01d0:
            r1 = 1
        L_0x01d1:
            if (r1 == 0) goto L_0x01d8
            int r1 = r12.nextIndex()
            goto L_0x01e3
        L_0x01d8:
            r1 = r21
            r5 = r9
            r2 = r19
            r9 = 1
            goto L_0x01a7
        L_0x01df:
            r19 = r2
            r9 = r5
            r1 = -1
        L_0x01e3:
            if (r1 < 0) goto L_0x0245
            if (r14 == 0) goto L_0x0245
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "[handleResp] sub respList by lastReadIndex="
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r2)
            r2 = 1
            int r1 = r1 + r2
            r2 = 0
            java.util.List r2 = r11.subList(r2, r1)
            java.lang.String r5 = "respList.subList(0, lastReadIndex + 1)"
            gy3.C87412m.m108593f(r2, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0210:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0237
            java.lang.Object r6 = r2.next()
            r12 = r6
            com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
            r16 = r2
            os1.q r2 = r7.mo12821g3()
            r20 = r13
            long r12 = r12.f164794id
            boolean r2 = r2.mo11614e3(r10, r12)
            r12 = 1
            r2 = r2 ^ r12
            if (r2 == 0) goto L_0x0232
            r5.add(r6)
        L_0x0232:
            r2 = r16
            r13 = r20
            goto L_0x0210
        L_0x0237:
            r20 = r13
            r4.addAll(r5)
            int r2 = r11.size()
            java.util.List r11 = r11.subList(r1, r2)
            goto L_0x0247
        L_0x0245:
            r20 = r13
        L_0x0247:
            if (r14 == 0) goto L_0x028c
            if (r8 == r0) goto L_0x028c
            int r1 = r11.size()
            r2 = 3
            if (r1 >= r2) goto L_0x028c
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r3.f144695d
            r4.addAll(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[handleResp] throw this resp. rawSize="
            r1.append(r2)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r2 = r3.f144695d
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = " unreadSize="
            r1.append(r2)
            int r2 = r11.size()
            r1.append(r2)
            r1.append(r9)
            r2 = r20
            java.lang.String r2 = r7.mo12823j3(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r1)
            sx3.f0 r1 = sx3.C64186f0.f181907d
            goto L_0x02a7
        L_0x028c:
            bo1.g r1 = bo1.C0344g.f929a
            te3.xh1 r2 = r3.f144698g
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r3.f144695d
            java.lang.String r5 = "resp.`object`"
            gy3.C87412m.m108593f(r3, r5)
            r5 = 4004(0xfa4, float:5.611E-42)
            r1.mo386b(r2, r3, r5)
            java.lang.String r1 = "finalUnreadList"
            gy3.C87412m.m108593f(r11, r1)
            r3 = r11
            goto L_0x02a8
        L_0x02a3:
            r19 = r2
            sx3.f0 r1 = sx3.C64186f0.f181907d
        L_0x02a7:
            r3 = r1
        L_0x02a8:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0312
            r1 = r21
            rs1.s1$a r2 = r1.f38238o
            long r5 = android.os.SystemClock.uptimeMillis()
            r2.f38025g = r5
            r3 = 6
            r2.mo12824a(r3)
            java.lang.String r2 = "Finder.EnhanceFeedUIC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "[onEventHappen] #1 failure[最终条数不够]! type="
            r3.append(r5)
            rs1.s1$b r5 = r1.f38239p
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            rs1.s1$a r5 = r1.f38238o
            r3.append(r5)
            java.lang.String r5 = " requestObj="
            r3.append(r5)
            rs1.s1 r5 = r1.f38235i
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r1.f38241r
            java.lang.String r5 = r5.mo12823j3(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            rs1.s1$a r2 = r1.f38238o
            r3 = -1
            r2.mo12824a(r3)
            rs1.s1 r2 = r1.f38235i
            int r3 = r1.f38237n
            te3.hj1 r5 = r1.f38240q
            r6 = 3
            r1.f38233g = r6
            java.lang.Object r2 = rs1.C13426s1.m12739e3(r2, r3, r5, r4, r1)
            r5 = r19
            if (r2 != r5) goto L_0x0306
            return r5
        L_0x0306:
            rs1.s1$b r2 = r1.f38239p
            if (r2 != r0) goto L_0x030f
            rs1.w1$a r0 = rs1.C13495w1.C13496a.f38243d
            o40.C61926c.m72668M(r0)
        L_0x030f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0312:
            r1 = r21
            r5 = r19
            rs1.s1$a r0 = r1.f38238o
            long r6 = android.os.SystemClock.uptimeMillis()
            r0.f38023e = r6
            r2 = 4
            r0.mo12824a(r2)
            wp1.f$a r0 = wp1.C15585f.f42211a
            int r6 = r1.f38237n
            te3.hj1 r7 = r1.f38240q
            java.util.List r0 = r0.mo14343f(r3, r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r6.<init>(r7)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x033d:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0353
            java.lang.Object r7 = r0.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r7
            wp1.f$a r8 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r8.mo14348k(r7)
            r6.add(r7)
            goto L_0x033d
        L_0x0353:
            rs1.s1 r0 = r1.f38235i
            te3.hj1 r7 = r1.f38240q
            int r8 = r1.f38237n
            java.lang.Object r9 = sx3.C110818d0.m150914L(r3)
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r9
            r1.f38230d = r4
            r1.f38231e = r3
            r1.f38232f = r6
            r1.f38233g = r2
            java.lang.Object r0 = rs1.C13426s1.m12738d3(r0, r7, r8, r9, r1)
            if (r0 != r5) goto L_0x036e
            return r5
        L_0x036e:
            r15 = r4
            r16 = r6
        L_0x0371:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            rs1.s1$a r2 = r1.f38238o
            long r6 = android.os.SystemClock.uptimeMillis()
            r2.f38024f = r6
            r4 = 5
            r2.mo12824a(r4)
            if (r0 != 0) goto L_0x03d9
            java.lang.String r0 = "Finder.EnhanceFeedUIC"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onEventHappen] #2 failure[预加载失败]! type="
            r2.append(r3)
            rs1.s1$b r3 = r1.f38239p
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            rs1.s1$a r3 = r1.f38238o
            r2.append(r3)
            java.lang.String r3 = " requestObj="
            r2.append(r3)
            rs1.s1 r3 = r1.f38235i
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r1.f38241r
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Long> r6 = rs1.C13426s1.f38005t
            java.lang.String r3 = r3.mo12823j3(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            rs1.s1$a r0 = r1.f38238o
            r2 = -2
            r0.mo12824a(r2)
            rs1.s1 r0 = r1.f38235i
            int r2 = r1.f38237n
            te3.hj1 r3 = r1.f38240q
            r4 = 0
            r1.f38230d = r4
            r1.f38231e = r4
            r1.f38232f = r4
            r4 = 5
            r1.f38233g = r4
            java.lang.Object r0 = rs1.C13426s1.m12739e3(r0, r2, r3, r15, r1)
            if (r0 != r5) goto L_0x03d6
            return r5
        L_0x03d6:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x03d9:
            java.lang.String r0 = "Finder.EnhanceFeedUIC"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[onEventHappen] type="
            r2.append(r4)
            rs1.s1$b r4 = r1.f38239p
            r2.append(r4)
            java.lang.String r4 = " pendingInsert=["
            r2.append(r4)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            rs1.w1$b r12 = new rs1.w1$b
            rs1.s1 r4 = r1.f38235i
            r12.<init>(r4)
            r13 = 31
            r14 = 0
            r6 = r16
            java.lang.String r4 = sx3.C110818d0.m150921S(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.append(r4)
            r4 = 93
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r0 = f14.C58901s.f168555a
            rs1.w1$c r2 = new rs1.w1$c
            rs1.s1$a r7 = r1.f38238o
            rs1.s1 r8 = r1.f38235i
            int r9 = r1.f38237n
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r1.f38241r
            boolean r12 = r1.f38236j
            rs1.s1$b r13 = r1.f38239p
            te3.hj1 r14 = r1.f38240q
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f38242s
            r18 = 0
            r6 = r2
            r11 = r3
            r17 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = 0
            r1.f38230d = r3
            r1.f38231e = r3
            r1.f38232f = r3
            r3 = 6
            r1.f38233g = r3
            java.lang.Object r0 = a14.C53895h.m60469g(r0, r2, r1)
            if (r0 != r5) goto L_0x0443
            return r5
        L_0x0443:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0446:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0449:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13495w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
