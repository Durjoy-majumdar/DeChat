package nk1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58739j4;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import k14.C60942d;
import k14.C60949f;
import k14.C99088c;
import kotlin.ResultKt;
import nk1.C61788m;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C77813z;
import te3.C49765hx0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: nk1.k */
public final class C61781k implements C61788m {

    /* renamed from: j */
    public static final int f175632j = C32444a.f86150h0.mo60266n().intValue();

    /* renamed from: k */
    public static final int f175633k = C32444a.f86154i0.mo60266n().intValue();

    /* renamed from: a */
    public LinkedList<C61788m.C11208b> f175634a;

    /* renamed from: b */
    public final Object f175635b;

    /* renamed from: c */
    public final Set<C61788m.C61789a> f175636c;

    /* renamed from: d */
    public AtomicLong f175637d = new AtomicLong(1);

    /* renamed from: e */
    public final Set<String> f175638e;

    /* renamed from: f */
    public final C0000n0 f175639f = C53930o0.m60555b();

    /* renamed from: g */
    public final Map<String, C61788m.C11210d> f175640g = new LinkedHashMap();

    /* renamed from: h */
    public final C99088c f175641h = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: i */
    public final String f175642i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.util.GiftQueueImpl$clear$2", mo125469f = "GiftQueueImpl.kt", mo125470l = {298}, mo125471m = "invokeSuspend")
    /* renamed from: nk1.k$a */
    public static final class C61782a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f175643d;

        /* renamed from: e */
        public final /* synthetic */ C61781k f175644e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.util.GiftQueueImpl$clear$2$1", mo125469f = "GiftQueueImpl.kt", mo125470l = {338}, mo125471m = "invokeSuspend")
        /* renamed from: nk1.k$a$a */
        public static final class C61783a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f175645d;

            /* renamed from: e */
            public Object f175646e;

            /* renamed from: f */
            public int f175647f;

            /* renamed from: g */
            public final /* synthetic */ C61781k f175648g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61783a(C61781k kVar, C15601d<? super C61783a> dVar) {
                super(2, dVar);
                this.f175648g = kVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61783a(this.f175648g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C61783a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX INFO: finally extract failed */
            public final Object invokeSuspend(Object obj) {
                C60942d dVar;
                C61781k kVar;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f175647f;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C61781k kVar2 = this.f175648g;
                    C99088c cVar = kVar2.f175641h;
                    this.f175645d = cVar;
                    this.f175646e = kVar2;
                    this.f175647f = 1;
                    C60942d dVar2 = (C60942d) cVar;
                    if (dVar2.mo85908b((Object) null, this) == aVar) {
                        return aVar;
                    }
                    kVar = kVar2;
                    dVar = dVar2;
                } else if (i == 1) {
                    kVar = (C61781k) this.f175646e;
                    ResultKt.throwOnFailure(obj);
                    dVar = (C99088c) this.f175645d;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ((LinkedHashMap) kVar.f175640g).clear();
                    C13598b0 b0Var = C13598b0.f38549a;
                    dVar.mo85909c((Object) null);
                    return C13598b0.f38549a;
                } catch (Throwable th) {
                    dVar.mo85909c((Object) null);
                    throw th;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61782a(C61781k kVar, C15601d<? super C61782a> dVar) {
            super(2, dVar);
            this.f175644e = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61782a(this.f175644e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61782a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175643d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C61783a aVar2 = new C61783a(this.f175644e, (C15601d<? super C61783a>) null);
                this.f175643d = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.util.GiftQueueImpl", mo125469f = "GiftQueueImpl.kt", mo125470l = {60}, mo125471m = "getOvertimeCache")
    /* renamed from: nk1.k$b */
    public static final class C61784b extends C66704d {

        /* renamed from: d */
        public Object f175649d;

        /* renamed from: e */
        public /* synthetic */ Object f175650e;

        /* renamed from: f */
        public final /* synthetic */ C61781k f175651f;

        /* renamed from: g */
        public int f175652g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61784b(C61781k kVar, C15601d<? super C61784b> dVar) {
            super(dVar);
            this.f175651f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f175650e = obj;
            this.f175652g |= Integer.MIN_VALUE;
            return this.f175651f.mo86708e((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.util.GiftQueueImpl$getOvertimeCache$2", mo125469f = "GiftQueueImpl.kt", mo125470l = {338}, mo125471m = "invokeSuspend")
    /* renamed from: nk1.k$c */
    public static final class C61785c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f175653d;

        /* renamed from: e */
        public Object f175654e;

        /* renamed from: f */
        public Object f175655f;

        /* renamed from: g */
        public Object f175656g;

        /* renamed from: h */
        public int f175657h;

        /* renamed from: i */
        public final /* synthetic */ C61781k f175658i;

        /* renamed from: j */
        public final /* synthetic */ C8479f0<C61788m.C11210d> f175659j;

        /* renamed from: n */
        public final /* synthetic */ String f175660n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61785c(C61781k kVar, C8479f0<C61788m.C11210d> f0Var, String str, C15601d<? super C61785c> dVar) {
            super(2, dVar);
            this.f175658i = kVar;
            this.f175659j = f0Var;
            this.f175660n = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61785c(this.f175658i, this.f175659j, this.f175660n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61785c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C99088c cVar;
            C8479f0<C61788m.C11210d> f0Var;
            C61781k kVar;
            String str;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175657h;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kVar = this.f175658i;
                C99088c cVar2 = kVar.f175641h;
                C8479f0<C61788m.C11210d> f0Var2 = this.f175659j;
                String str2 = this.f175660n;
                this.f175653d = cVar2;
                this.f175654e = f0Var2;
                this.f175655f = kVar;
                this.f175656g = str2;
                this.f175657h = 1;
                C60942d dVar = (C60942d) cVar2;
                if (dVar.mo85908b((Object) null, this) == aVar) {
                    return aVar;
                }
                f0Var = f0Var2;
                str = str2;
                cVar = dVar;
            } else if (i == 1) {
                str = (String) this.f175656g;
                kVar = (C61781k) this.f175655f;
                f0Var = (C8479f0) this.f175654e;
                cVar = (C99088c) this.f175653d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                f0Var.f27484d = ((LinkedHashMap) kVar.f175640g).getOrDefault(str, (Object) null);
                C13598b0 b0Var = C13598b0.f38549a;
                cVar.mo85909c((Object) null);
                return C13598b0.f38549a;
            } catch (Throwable th) {
                cVar.mo85909c((Object) null);
                throw th;
            }
        }
    }

    public C61781k() {
        String str = "Finder.GiftQueueImpl@" + hashCode();
        this.f175642i = str;
        this.f175634a = new LinkedList<>();
        this.f175635b = new byte[0];
        this.f175636c = new CopyOnWriteArraySet();
        this.f175638e = new CopyOnWriteArraySet();
        Log.m105924i(str, "MAX_SIZE:" + f175632j + ",COMBOID_LIVE_TIME:" + f175633k);
    }

    /* renamed from: a */
    public boolean mo86702a(C61788m.C11208b bVar) {
        boolean remove;
        C87412m.m108594g(bVar, "giftShowInfo");
        synchronized (this.f175635b) {
            remove = this.f175634a.remove(bVar);
        }
        return remove;
    }

    public boolean addAll(Collection<C61788m.C11208b> collection) {
        List<T> list;
        String str;
        FinderContact finderContact;
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        Iterator<C61788m.C11208b> it = collection.iterator();
        while (it.hasNext()) {
            C61788m.C11208b next = it.next();
            if (!Util.isNullOrNil(next.f33040d.f144904f)) {
                if (C110818d0.m150903D(this.f175638e, next.f33040d.f144904f)) {
                    String str2 = this.f175642i;
                    Log.m105924i(str2, "addAll: duplicate client_msg_id:" + next.f33040d.f144904f);
                    it.remove();
                } else {
                    String str3 = next.f33040d.f144904f;
                    if (str3 != null) {
                        ((CopyOnWriteArraySet) this.f175638e).add(str3);
                    }
                }
            }
        }
        synchronized (this.f175635b) {
            String str4 = this.f175642i;
            Log.m105924i(str4, "addAll: incrementMsgId = " + this.f175637d + ", list size = " + this.f175634a.size() + ", collection size = " + collection.size() + ", observerSetSize:" + ((CopyOnWriteArraySet) this.f175636c).size());
            int size = collection.size();
            int i = f175632j;
            if (size > i) {
                String str5 = this.f175642i;
                Log.m105924i(str5, "addAll: oversize, drop origin collection:" + C110818d0.m150948t0(C110818d0.m150953y0(collection), collection.size() - i));
                list = C110818d0.m150947s0(collection, i);
            } else {
                list = C110818d0.m150953y0(collection);
            }
            if (this.f175634a.size() + list.size() > i) {
                String str6 = this.f175642i;
                StringBuilder sb = new StringBuilder();
                sb.append("offer: oversize, drop list:");
                LinkedList<C61788m.C11208b> linkedList = this.f175634a;
                sb.append(C110818d0.m150948t0(linkedList, (linkedList.size() + list.size()) - i));
                Log.m105924i(str6, sb.toString());
                LinkedList<C61788m.C11208b> linkedList2 = this.f175634a;
                this.f175634a = new LinkedList<>(C110818d0.m150909G(linkedList2, (linkedList2.size() + list.size()) - i));
            }
            for (T t : list) {
                t.f33042f = this.f175637d.getAndIncrement();
                String str7 = t.f33044h;
                if (str7 == null) {
                    str7 = "";
                }
                long currentTimeMillis = System.currentTimeMillis();
                C49765hx0 hx02 = t.f33040d.f144914s;
                if (hx02 == null || (finderContact = hx02.f134919d) == null || (str = finderContact.nickname) == null) {
                    str = "";
                }
                C53895h.m60466d(this.f175639f, (C66212f) null, (C53934p0) null, new C61786l(this, new C61788m.C11210d(str7, currentTimeMillis, str), (C15601d<? super C61786l>) null), 3, (Object) null);
            }
            this.f175634a.addAll(list);
            C77813z.m93908n(this.f175634a);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C61788m.C11209c h = mo86711h();
        if (h != null) {
            Iterator it4 = ((CopyOnWriteArraySet) this.f175636c).iterator();
            while (it4.hasNext()) {
                ((C61788m.C61789a) it4.next()).mo84240s(h, list);
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo86704b(C61788m.C11208b bVar) {
        String str;
        FinderContact finderContact;
        if (bVar == null) {
            return false;
        }
        if (!Util.isNullOrNil(bVar.f33040d.f144904f)) {
            if (C110818d0.m150903D(this.f175638e, bVar.f33040d.f144904f)) {
                String str2 = this.f175642i;
                Log.m105924i(str2, "offer: duplicate client_msg_id:" + bVar.f33040d.f144904f);
                return false;
            }
            String str3 = bVar.f33040d.f144904f;
            if (str3 != null) {
                ((CopyOnWriteArraySet) this.f175638e).add(str3);
            }
        }
        synchronized (this.f175635b) {
            String str4 = this.f175642i;
            Log.m105924i(str4, "offer: incrementMsgId = " + this.f175637d + ", size = " + this.f175634a.size());
            int size = this.f175634a.size();
            int i = f175632j;
            if (size >= i && i >= 1) {
                String str5 = this.f175642i;
                StringBuilder sb = new StringBuilder();
                sb.append("offer: oversize, drop:");
                LinkedList<C61788m.C11208b> linkedList = this.f175634a;
                sb.append(C110818d0.m150948t0(linkedList, (linkedList.size() - i) + 1));
                Log.m105924i(str5, sb.toString());
                this.f175634a = new LinkedList<>(C110818d0.m150947s0(this.f175634a, i - 1));
            }
            bVar.f33042f = this.f175637d.getAndIncrement();
            this.f175634a.offerLast(bVar);
            C77813z.m93908n(this.f175634a);
            String str6 = bVar.f33044h;
            if (str6 == null) {
                str6 = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            C49765hx0 hx02 = bVar.f33040d.f144914s;
            if (hx02 == null || (finderContact = hx02.f134919d) == null || (str = finderContact.nickname) == null) {
                str = "";
            }
            C53895h.m60466d(this.f175639f, (C66212f) null, (C53934p0) null, new C61786l(this, new C61788m.C11210d(str6, currentTimeMillis, str), (C15601d<? super C61786l>) null), 3, (Object) null);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C61788m.C11209c h = mo86711h();
        if (h != null) {
            List b = C26236u.m33719b(bVar);
            Iterator it = ((CopyOnWriteArraySet) this.f175636c).iterator();
            while (it.hasNext()) {
                ((C61788m.C61789a) it.next()).mo84240s(h, b);
            }
        }
        return true;
    }

    /* renamed from: c */
    public C61788m.C11208b mo86705c(String str) {
        T t;
        C61788m.C11208b bVar;
        C87412m.m108594g(str, "targetUserName");
        synchronized (this.f175635b) {
            Iterator<T> it = this.f175634a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (str.equals(((C61788m.C11208b) t).f33051r)) {
                    break;
                }
            }
            bVar = (C61788m.C11208b) t;
        }
        return bVar;
    }

    public void clear() {
        String str = this.f175642i;
        StringBuilder sb = new StringBuilder();
        sb.append("clear observer ");
        sb.append(C58739j4.f168176a.mo83692U() ? Util.getStack().toString() : "");
        Log.m105924i(str, sb.toString());
        synchronized (this.f175635b) {
            this.f175634a.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        ((CopyOnWriteArraySet) this.f175636c).clear();
        C53895h.m60466d(this.f175639f, (C66212f) null, (C53934p0) null, new C61782a(this, (C15601d<? super C61782a>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public C61788m.C11208b mo86707d(String str) {
        C61788m.C11208b k;
        C87412m.m108594g(str, "comboId");
        synchronized (this.f175635b) {
            k = mo86715k(str);
            if (k != null) {
                this.f175634a.remove(k);
            }
        }
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86708e(java.lang.String r7, wx3.C15601d<? super nk1.C61788m.C11210d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof nk1.C61781k.C61784b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            nk1.k$b r0 = (nk1.C61781k.C61784b) r0
            int r1 = r0.f175652g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f175652g = r1
            goto L_0x0018
        L_0x0013:
            nk1.k$b r0 = new nk1.k$b
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f175650e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f175652g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f175649d
            gy3.f0 r7 = (gy3.C8479f0) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004f
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            gy3.f0 r8 = new gy3.f0
            r8.<init>()
            a14.h0 r2 = a14.C53872d1.f151119c
            nk1.k$c r4 = new nk1.k$c
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.f175649d = r8
            r0.f175652g = r3
            java.lang.Object r7 = a14.C53895h.m60469g(r2, r4, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r7 = r8
        L_0x004f:
            T r7 = r7.f27484d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.C61781k.mo86708e(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public void mo86709f(C61788m.C61789a aVar) {
        C87412m.m108594g(aVar, "observer");
        String str = this.f175642i;
        Log.m105924i(str, "unregisterObserver " + aVar + "  " + ((CopyOnWriteArraySet) this.f175636c).size() + ' ' + C58739j4.f168176a.mo83708f0());
        ((CopyOnWriteArraySet) this.f175636c).remove(aVar);
    }

    /* renamed from: g */
    public C61788m.C11208b mo86710g(String str) {
        T t;
        C61788m.C11208b bVar;
        boolean z;
        C87412m.m108594g(str, "targetUserName");
        synchronized (this.f175635b) {
            Iterator<T> it = this.f175634a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                C61788m.C11208b bVar2 = (C61788m.C11208b) t;
                if (bVar2.f33047n || !str.equals(bVar2.f33051r)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            bVar = (C61788m.C11208b) t;
        }
        return bVar;
    }

    /* renamed from: h */
    public C61788m.C11209c mo86711h() {
        C61788m.C11209c cVar;
        synchronized (this.f175635b) {
            C61788m.C11208b peekFirst = this.f175634a.peekFirst();
            cVar = peekFirst != null ? peekFirst.f33041e : null;
        }
        return cVar;
    }

    public boolean hasNext() {
        boolean z;
        synchronized (this.f175635b) {
            z = !this.f175634a.isEmpty();
        }
        return z;
    }

    /* renamed from: i */
    public void mo86713i() {
        synchronized (this.f175635b) {
            String str = this.f175642i;
            Log.m105924i(str, "clearGifts, list size:" + this.f175634a.size());
            this.f175634a.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: j */
    public void mo86714j(C61788m.C61789a aVar) {
        C87412m.m108594g(aVar, "observer");
        String str = this.f175642i;
        Log.m105924i(str, "registerObserver " + aVar + "  " + ((CopyOnWriteArraySet) this.f175636c).size() + ' ' + C58739j4.f168176a.mo83708f0());
        ((CopyOnWriteArraySet) this.f175636c).add(aVar);
    }

    /* renamed from: k */
    public C61788m.C11208b mo86715k(String str) {
        T t;
        C61788m.C11208b bVar;
        C87412m.m108594g(str, "comboId");
        synchronized (this.f175635b) {
            Iterator<T> it = this.f175634a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (str.equals(((C61788m.C11208b) t).f33044h)) {
                    break;
                }
            }
            bVar = (C61788m.C11208b) t;
        }
        return bVar;
    }

    public C61788m.C11208b poll() {
        C61788m.C11208b pollFirst;
        synchronized (this.f175635b) {
            pollFirst = this.f175634a.pollFirst();
        }
        return pollFirst;
    }

    public int size() {
        int size;
        synchronized (this.f175635b) {
            size = this.f175634a.size();
        }
        return size;
    }
}
