package on1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import bl3.C0317e;
import c14.C54624g;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import d14.C58017a1;
import d14.C58083t;
import d14.C58085t0;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import on1.C11537n;
import rx3.C13598b0;
import tf1.C13914m;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C16387t;

/* renamed from: on1.z */
public class C11577z<T extends C0740i2> {

    /* renamed from: a */
    public final C11548q<T> f33963a;

    /* renamed from: b */
    public final C58085t0<C11520f0<T>> f33964b;

    /* renamed from: c */
    public final C45252f<C11520f0<T>> f33965c;

    /* renamed from: d */
    public List<C11577z<T>.b> f33966d = new ArrayList();

    /* renamed from: e */
    public C11515d0<T> f33967e = new C11515d0<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.LoaderDispatcher$1", mo125469f = "LoaderDispatcher.kt", mo125470l = {38}, mo125471m = "invokeSuspend")
    /* renamed from: on1.z$a */
    public static final class C11578a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33968d;

        /* renamed from: e */
        public final /* synthetic */ C11577z<T> f33969e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.LoaderDispatcher$1$1", mo125469f = "LoaderDispatcher.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: on1.z$a$a */
        public static final class C11579a extends C91594j implements C32228q<C45253g<? super C11537n<T>>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f33970d;

            public C11579a(C15601d<? super C11579a> dVar) {
                super(3, dVar);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C11579a aVar = new C11579a((C15601d) obj3);
                aVar.f33970d = (Throwable) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("Finder.DataMerger", "catch :" + ((Throwable) this.f33970d));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: on1.z$a$b */
        public static final class C11580b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C11577z<T> f33971d;

            public C11580b(C11577z<T> zVar) {
                this.f33971d = zVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C11537n nVar = (C11537n) obj;
                this.f33971d.f33967e.getClass();
                C87412m.m108594g(nVar, "event");
                Log.m105924i("Finder.LoaderEventMachine", "transfer event:" + nVar + " refreshEvent:" + null + " loadMoreEvent:" + null);
                StringBuilder sb = new StringBuilder();
                sb.append("receive transferResult:");
                sb.append(nVar);
                sb.append(" event:");
                sb.append(nVar);
                Log.m105924i("Finder.DataMerger", sb.toString());
                C11577z<T> zVar = this.f33971d;
                if (!(nVar instanceof C11537n.C11539b)) {
                    C11577z.m11375a(zVar, nVar);
                } else if (((ArrayList) zVar.f33963a.f33886d).isEmpty()) {
                    C11577z.m11375a(zVar, nVar);
                } else {
                    Log.m105924i("Finder.DataMerger", "ignore firstScreen data!");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11578a(C11577z<T> zVar, C15601d<? super C11578a> dVar) {
            super(2, dVar);
            this.f33969e = zVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11578a(this.f33969e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11578a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33968d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58083t tVar = new C58083t(this.f33969e.f33963a.f33895p, new C11579a((C15601d<? super C11579a>) null));
                C11580b bVar = new C11580b(this.f33969e);
                this.f33968d = 1;
                if (tVar.mo31880a(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: on1.z$b */
    public final class C11581b implements C0740i2 {

        /* renamed from: d */
        public final T f33972d;

        /* renamed from: e */
        public final int f33973e;

        public C11581b(C11577z zVar, T t, int i) {
            C87412m.m108594g(t, "data");
            this.f33972d = t;
            this.f33973e = i;
        }

        /* renamed from: c */
        public int mo75c() {
            return 0;
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            return 0;
        }

        public long getItemId() {
            return this.f33972d.getItemId();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.LoaderDispatcher$dispatchDiffResult$1", mo125469f = "LoaderDispatcher.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: on1.z$c */
    public static final class C11582c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C54248l.C54251c f33974d;

        /* renamed from: e */
        public final /* synthetic */ C11577z<T> f33975e;

        /* renamed from: f */
        public final /* synthetic */ int f33976f;

        /* renamed from: on1.z$c$a */
        public static final class C11583a implements C54258u {

            /* renamed from: a */
            public final /* synthetic */ C11577z<T> f33977a;

            /* renamed from: b */
            public final /* synthetic */ int f33978b;

            public C11583a(C11577z<T> zVar, int i) {
                this.f33977a = zVar;
                this.f33978b = i;
            }

            /* renamed from: a */
            public void mo2860a(int i, int i2) {
                Log.m105924i("Finder.DataMerger", "handleState: onItemRangeRemoved position:" + i + " count:" + i2);
                C16387t tVar = this.f33977a.f33963a.f33893n;
                if (tVar != null) {
                    tVar.onItemRangeRemoved(i, i2);
                }
            }

            /* renamed from: b */
            public void mo2861b(int i, int i2) {
                Log.m105924i("Finder.DataMerger", "handleState: onItemRangeInserted position:" + i + " count:" + i2);
                C16387t tVar = this.f33977a.f33963a.f33893n;
                if (tVar != null) {
                    tVar.onItemRangeInserted(i, i2);
                }
            }

            /* renamed from: c */
            public void mo2862c(int i, int i2, Object obj) {
                Log.m105924i("Finder.DataMerger", "handleState: onItemRangeChanged position:" + i + " count:" + i2 + " payload:" + obj);
                C16387t tVar = this.f33977a.f33963a.f33893n;
                if (tVar != null) {
                    tVar.onItemRangeChanged(i, i2, obj);
                }
            }

            /* renamed from: d */
            public void mo2863d(int i, int i2) {
                Log.m105924i("Finder.DataMerger", "handleState: onItemRangeMoved fromPosition:" + i + " toPosition:" + i2 + " count：" + this.f33978b);
                C16387t tVar = this.f33977a.f33963a.f33893n;
                if (tVar != null) {
                    tVar.onItemRangeMoved(i, i2, this.f33978b);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11582c(C54248l.C54251c cVar, C11577z<T> zVar, int i, C15601d<? super C11582c> dVar) {
            super(2, dVar);
            this.f33974d = cVar;
            this.f33975e = zVar;
            this.f33976f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11582c(this.f33974d, this.f33975e, this.f33976f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11582c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f33974d.mo75045a(new C11583a(this.f33975e, this.f33976f));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.LoaderDispatcher$handleState$1", mo125469f = "LoaderDispatcher.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: on1.z$d */
    public static final class C11584d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C11577z<T> f33979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11584d(C11577z<T> zVar, C15601d<? super C11584d> dVar) {
            super(2, dVar);
            this.f33979d = zVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11584d(this.f33979d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11584d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C16387t tVar = this.f33979d.f33963a.f33893n;
            if (tVar != null) {
                tVar.onChanged();
            }
            return C13598b0.f38549a;
        }
    }

    public C11577z(C11548q<T> qVar) {
        C87412m.m108594g(qVar, "loader");
        this.f33963a = qVar;
        C58085t0<C11520f0<T>> b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        this.f33964b = b;
        this.f33965c = b;
        C53895h.m60466d(qVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C11578a(this, (C15601d<? super C11578a>) null), 3, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11375a(on1.C11577z r11, on1.C11537n r12) {
        /*
            r11.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "merge event:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = "Finder.DataMerger"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.List<on1.z<T>$b> r2 = r11.f33966d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            r7 = 1
            if (r2 == 0) goto L_0x002a
            goto L_0x0079
        L_0x002a:
            java.util.List<on1.z<T>$b> r2 = r11.f33966d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.ListIterator r2 = r2.listIterator()
        L_0x0032:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0079
            int r3 = r2.nextIndex()
            java.lang.Object r4 = r2.next()
            on1.z$b r4 = (on1.C11577z.C11581b) r4
            long r9 = r4.getItemId()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "filterSnapShot index: "
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = " id:"
            r5.append(r3)
            r5.append(r9)
            java.lang.String r3 = " lastItem:"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            int r3 = r4.f33973e
            if (r3 != r7) goto L_0x0032
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r1.add(r3)
            r2.remove()
            goto L_0x0032
        L_0x0079:
            on1.q<T> r2 = r11.f33963a
            java.util.List<T> r2 = r2.f33886d
            java.lang.String r3 = "filterOriginLoaderData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0089
            goto L_0x00ae
        L_0x0089:
            r3 = r2
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0090:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r4 = r3.next()
            cm1.i2 r4 = (cm1.C0740i2) r4
            long r4 = r4.getItemId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x0090
            r3.remove()
            goto L_0x0090
        L_0x00ae:
            boolean r1 = r12 instanceof on1.C11537n.C11539b
            if (r1 == 0) goto L_0x00c3
            on1.f0$a r1 = new on1.f0$a
            r0 = r12
            on1.n$b r0 = (on1.C11537n.C11539b) r0
            on1.y<T> r3 = r0.f33872a
            r1.<init>(r3)
            on1.y<T> r0 = r0.f33872a
            r11.mo11514e(r1, r2, r0)
            goto L_0x0288
        L_0x00c3:
            boolean r1 = r12 instanceof on1.C11537n.C11543f
            if (r1 == 0) goto L_0x00d8
            on1.f0$c r1 = new on1.f0$c
            r0 = r12
            on1.n$f r0 = (on1.C11537n.C11543f) r0
            on1.y<T> r3 = r0.f33877a
            r1.<init>(r3)
            on1.y<T> r0 = r0.f33877a
            r11.mo11514e(r1, r2, r0)
            goto L_0x0288
        L_0x00d8:
            boolean r1 = r12 instanceof on1.C11537n.C11541d
            if (r1 == 0) goto L_0x00ed
            on1.f0$b r1 = new on1.f0$b
            r0 = r12
            on1.n$d r0 = (on1.C11537n.C11541d) r0
            on1.y<T> r3 = r0.f33875a
            r1.<init>(r3)
            on1.y<T> r0 = r0.f33875a
            r11.mo11514e(r1, r2, r0)
            goto L_0x0288
        L_0x00ed:
            boolean r1 = r12 instanceof on1.C11537n.C11544g
            r8 = 0
            if (r1 == 0) goto L_0x0175
            r0 = r12
            on1.n$g r0 = (on1.C11537n.C11544g) r0
            long r1 = r0.f33879a
            boolean r3 = r0 instanceof on1.C11532j0
            if (r3 == 0) goto L_0x00ff
            r3 = r0
            on1.j0 r3 = (on1.C11532j0) r3
            goto L_0x0100
        L_0x00ff:
            r3 = r8
        L_0x0100:
            if (r3 == 0) goto L_0x0104
            java.lang.Object r8 = r3.f33859e
        L_0x0104:
            on1.q<T> r3 = r11.f33963a
            java.util.List<T> r3 = r3.f33886d
            int r4 = r0.mo11485b(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "update index："
            r5.append(r9)
            r5.append(r4)
            java.lang.String r9 = " updateId:"
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = " updatePayload:"
            r5.append(r1)
            r5.append(r8)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            boolean r0 = r0.f33880b
            if (r0 == 0) goto L_0x013e
            on1.b0 r0 = new on1.b0
            r0.<init>(r11)
            o40.C61926c.m72668M(r0)
            goto L_0x015a
        L_0x013e:
            java.util.List<on1.z<T>$b> r0 = r11.f33966d
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.put(r2, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            on1.a0 r2 = new on1.a0
            r2.<init>(r0, r3, r11, r1)
            androidx.recyclerview.widget.l$c r0 = androidx.recyclerview.widget.C54248l.m60949a(r2, r7)
            r11.mo11513b(r0, r7)
        L_0x015a:
            r1 = 1
            r2 = 0
            r5 = 0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r0 = r3.get(r4)
            r6 = r0
            cm1.i2 r6 = (cm1.C0740i2) r6
            r7 = 0
            r8 = 38
            r9 = 0
            r0 = r11
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            m11377d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0288
        L_0x0175:
            boolean r1 = r12 instanceof on1.C11537n.C11540c
            if (r1 == 0) goto L_0x0242
            r0 = r12
            on1.n$c r0 = (on1.C11537n.C11540c) r0
            on1.q<T> r1 = r11.f33963a
            java.util.List<T> r9 = r1.f33886d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "insert size:"
            r1.append(r2)
            java.util.List<on1.z<T>$b> r2 = r11.f33966d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Object r2 = sx3.C110818d0.m150916N(r9)
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x01a5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            goto L_0x01a6
        L_0x01a5:
            r2 = r8
        L_0x01a6:
            if (r2 == 0) goto L_0x01b3
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            if (r2 == 0) goto L_0x01b3
            java.lang.String r2 = r2.getDescription()
            goto L_0x01b4
        L_0x01b3:
            r2 = r8
        L_0x01b4:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.util.Set r10 = r0.mo11492b(r9)
            boolean r0 = r0.f33874b
            if (r0 == 0) goto L_0x01cf
            on1.b0 r0 = new on1.b0
            r0.<init>(r11)
            o40.C61926c.m72668M(r0)
            goto L_0x01dd
        L_0x01cf:
            java.util.List<on1.z<T>$b> r1 = r11.f33966d
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r11
            r2 = r9
            androidx.recyclerview.widget.l$c r0 = m11376c(r0, r1, r2, r3, r4, r5)
            r11.mo11513b(r0, r7)
        L_0x01dd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "insert size after:"
            r0.append(r1)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r1 = r9.size()
            r0.append(r1)
            java.lang.String r1 = "  "
            r0.append(r1)
            on1.q<T> r1 = r11.f33963a
            java.util.List<T> r1 = r1.f33886d
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r2 == 0) goto L_0x0204
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            goto L_0x0205
        L_0x0204:
            r1 = r8
        L_0x0205:
            if (r1 == 0) goto L_0x0211
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x0211
            java.lang.String r8 = r1.getDescription()
        L_0x0211:
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.util.Iterator r10 = r10.iterator()
        L_0x021f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0288
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.Object r0 = r9.get(r4)
            r5 = r0
            cm1.i2 r5 = (cm1.C0740i2) r5
            r6 = 0
            r7 = 35
            r8 = 0
            r0 = r11
            m11377d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x021f
        L_0x0242:
            boolean r1 = r12 instanceof on1.C11537n.C11538a
            if (r1 == 0) goto L_0x0275
            r0 = r12
            on1.n$a r0 = (on1.C11537n.C11538a) r0
            on1.q<T> r1 = r11.f33963a
            java.util.List<T> r2 = r1.f33886d
            java.lang.String r1 = "delete"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            int r6 = r0.mo11475b(r2)
            java.util.List<on1.z<T>$b> r1 = r11.f33966d
            r3 = 0
            r4 = 4
            r8 = 0
            r5 = 0
            r0 = r11
            androidx.recyclerview.widget.l$c r0 = m11376c(r0, r1, r2, r3, r4, r5)
            r11.mo11513b(r0, r7)
            r1 = 0
            r2 = 1
            r3 = 0
            r7 = 0
            r9 = 53
            r10 = 0
            r0 = r11
            r4 = r6
            r5 = r8
            r6 = r7
            r7 = r9
            r8 = r10
            m11377d(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0288
        L_0x0275:
            boolean r1 = r12 instanceof on1.C11537n.C11542e
            if (r1 == 0) goto L_0x0288
            r0 = r12
            on1.n$e r0 = (on1.C11537n.C11542e) r0
            java.lang.String r1 = "query"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            on1.q<T> r1 = r11.f33963a
            java.util.List<T> r1 = r1.f33886d
            r0.mo10502a(r1)
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11577z.m11375a(on1.z, on1.n):void");
    }

    /* renamed from: c */
    public static C54248l.C54251c m11376c(C11577z zVar, List list, List list2, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                map = null;
            }
            zVar.getClass();
            return C54248l.m60949a(new C11508a0(list, list2, zVar, map), true);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiffResult");
    }

    /* renamed from: d */
    public static void m11377d(C11577z zVar, boolean z, boolean z2, boolean z3, int i, C0740i2 i2Var, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                z = false;
            }
            if ((i3 & 2) != 0) {
                z2 = false;
            }
            if ((i3 & 4) != 0) {
                z3 = false;
            }
            if ((i3 & 8) != 0) {
                i = -1;
            }
            if ((i3 & 16) != 0) {
                i2Var = null;
            }
            if ((i3 & 32) != 0) {
                i2 = 2;
            }
            zVar.getClass();
            if (!(!z || i == -1 || i2Var == null)) {
                zVar.f33966d.set(i, new C11581b(zVar, i2Var, i2));
            }
            if (z2 && i != -1) {
                zVar.f33966d.remove(i);
            }
            if (z3 && i != -1 && i2Var != null) {
                zVar.f33966d.add(i, new C11581b(zVar, i2Var, i2));
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSnapShot");
    }

    /* renamed from: b */
    public final void mo11513b(C54248l.C54251c cVar, int i) {
        this.f33966d.size();
        C0317e.launchUI$default(this.f33963a, (C66212f) null, (C53934p0) null, new C11582c(cVar, this, i, (C15601d<? super C11582c>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public final void mo11514e(C11520f0<T> f0Var, List<T> list, C11575y<T> yVar) {
        boolean isEmpty = list.isEmpty();
        List<T> list2 = yVar.f33959a;
        yVar.mo11464b(list);
        if (!list2.isEmpty()) {
            if (isEmpty || yVar.f33960b) {
                C0317e.launchUI$default(this.f33963a, (C66212f) null, (C53934p0) null, new C11584d(this, (C15601d<? super C11584d>) null), 3, (Object) null);
            } else {
                mo11513b(m11376c(this, this.f33966d, list, (Map) null, 4, (Object) null), yVar.f33959a.size());
            }
            Log.m105924i("Finder.DataMerger", "handleState: " + this.f33966d.size() + " size:" + list.size());
            int c = yVar.mo11488c();
            ArrayList arrayList = new ArrayList(list.size());
            for (T bVar : list) {
                arrayList.add(new C11581b(this, bVar, c));
            }
            this.f33966d = arrayList;
        }
        Log.m105924i("Finder.DataMerger", "sendState: " + f0Var);
        C53895h.m60466d(this.f33963a.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C11513c0(this, f0Var, (C15601d<? super C11513c0>) null), 3, (Object) null);
    }
}
