package bs0;

import a14.C53916l;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import lp3.C88633e;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.a85;
import te3.y45;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import zt3.C119157j;

/* renamed from: bs0.s */
public final class C79801s {

    /* renamed from: a */
    public static final C79801s f233867a = new C79801s();

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.manage.WxaAppGetUserAuthorizeScopeListWithAttrs", mo125469f = "WxaAppGetUserAuthorizeScopeListWithAttrs.kt", mo125470l = {46, 105}, mo125471m = "doFetch")
    /* renamed from: bs0.s$a */
    public static final class C79802a extends C66704d {

        /* renamed from: d */
        public Object f233868d;

        /* renamed from: e */
        public /* synthetic */ Object f233869e;

        /* renamed from: f */
        public final /* synthetic */ C79801s f233870f;

        /* renamed from: g */
        public int f233871g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79802a(C79801s sVar, C15601d<? super C79802a> dVar) {
            super(dVar);
            this.f233870f = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f233869e = obj;
            this.f233871g |= Integer.MIN_VALUE;
            return this.f233870f.mo109934a(0, this);
        }
    }

    /* renamed from: bs0.s$b */
    public static final class C79803b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88633e<List<String>> f233872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79803b(C88633e<List<String>> eVar) {
            super(1);
            this.f233872d = eVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            Log.m105924i("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "invokeOnCancellation");
            this.f233872d.dead();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bs0.s$c */
    public static final class C79804c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ y45 f233873d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<C53916l<C79807t>> f233874e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79804c(y45 y45, WeakReference<C53916l<C79807t>> weakReference) {
            super(0);
            this.f233873d = y45;
            this.f233874e = weakReference;
        }

        public Object invoke() {
            LinkedList<a85> linkedList = this.f233873d.f145115d;
            C87412m.m108593f(linkedList, "resp.wxa_item_list");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = linkedList.iterator();
            while (true) {
                C79800r rVar = null;
                if (!it.hasNext()) {
                    break;
                }
                a85 a85 = (a85) it.next();
                String str = a85.f130371d;
                List list = a85.f130372e;
                WxaAttributes LL = C81161g2.Cx0().mo114000LL(str, new String[0]);
                if (LL == null) {
                    Log.m105928w("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, wxaAttrs of " + str + " is null");
                } else {
                    if (list == null) {
                        list = C64186f0.f181907d;
                    }
                    rVar = new C79800r(LL, list, a85.f130373f);
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            if (arrayList.isEmpty()) {
                Log.m105928w("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, userAuthScopeList is empty");
                C53916l lVar = this.f233874e.get();
                if (lVar != null) {
                    lVar.resumeWith(Result.m168114constructorimpl((Object) null));
                }
            } else {
                C53916l lVar2 = this.f233874e.get();
                if (lVar2 != null) {
                    y45 y45 = this.f233873d;
                    int i = y45.f145116e;
                    List list2 = y45.f145117f;
                    if (list2 == null) {
                        list2 = C64186f0.f181907d;
                    }
                    lVar2.resumeWith(Result.m168114constructorimpl(new C79807t(i, arrayList, list2)));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bs0.s$d */
    public static final class C79805d implements C81662k.C81674j {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f233875a;

        public C79805d(C32224a<C13598b0> aVar) {
            this.f233875a = aVar;
        }

        /* renamed from: a */
        public final void mo109935a() {
            Log.m105924i("MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs", "doFetch, batch sync done");
            ((C119157j) C119157j.f356862d).mo183884o(new C79806e(this.f233875a));
        }
    }

    /* renamed from: bs0.s$e */
    public static final class C79806e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f233876d;

        public C79806e(C32224a aVar) {
            this.f233876d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f233876d.invoke();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109934a(int r13, wx3.C15601d<? super bs0.C79807t> r14) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r1 = r14 instanceof bs0.C79801s.C79802a
            if (r1 == 0) goto L_0x0015
            r1 = r14
            bs0.s$a r1 = (bs0.C79801s.C79802a) r1
            int r2 = r1.f233871g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f233871g = r2
            goto L_0x001a
        L_0x0015:
            bs0.s$a r1 = new bs0.s$a
            r1.<init>(r12, r14)
        L_0x001a:
            java.lang.Object r14 = r1.f233869e
            int r2 = r1.f233871g
            r8 = 0
            java.lang.String r9 = "MicroMsg.WxaAppGetUserAuthorizeScopeListWithAttrs"
            r10 = 2
            r11 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r11) goto L_0x003a
            if (r2 != r10) goto L_0x0032
            java.lang.Object r13 = r1.f233868d
            te3.y45 r13 = (te3.y45) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00c9
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ Exception -> 0x003e }
            goto L_0x0054
        L_0x003e:
            r13 = move-exception
            goto L_0x00ca
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r14)
            bs0.n r2 = bs0.C28414n.f78142a     // Catch:{ Exception -> 0x003e }
            r4 = 0
            r6 = 2
            r7 = 0
            r1.f233871g = r11     // Catch:{ Exception -> 0x003e }
            r3 = r13
            r5 = r1
            java.lang.Object r14 = bs0.C28414n.m38189a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x003e }
            if (r14 != r0) goto L_0x0054
            return r0
        L_0x0054:
            te3.y45 r14 = (te3.y45) r14     // Catch:{ Exception -> 0x003e }
            java.util.LinkedList<te3.a85> r13 = r14.f145115d
            if (r13 == 0) goto L_0x0063
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r13 = 0
            goto L_0x0064
        L_0x0063:
            r13 = 1
        L_0x0064:
            if (r13 == 0) goto L_0x006c
            java.lang.String r13 = "doFetch, resp is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r13)
            return r8
        L_0x006c:
            r1.f233868d = r14
            r1.f233871g = r10
            a14.m r13 = new a14.m
            wx3.d r1 = xx3.C66447b.m78392b(r1)
            r13.<init>(r1, r11)
            r13.mo74609p()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r13)
            bs0.s$c r2 = new bs0.s$c
            r2.<init>(r14, r1)
            java.util.LinkedList<te3.a85> r14 = r14.f145115d
            java.lang.String r1 = "resp.wxa_item_list"
            gy3.C87412m.m108593f(r14, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r14, r3)
            r1.<init>(r3)
            java.util.Iterator r14 = r14.iterator()
        L_0x009d:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r14.next()
            te3.a85 r3 = (te3.a85) r3
            java.lang.String r3 = r3.f130371d
            r1.add(r3)
            goto L_0x009d
        L_0x00af:
            com.tencent.mm.plugin.appbrand.config.f$a r14 = com.tencent.p014mm.plugin.appbrand.config.C81652f.C81653a.DEFAULT
            bs0.s$d r3 = new bs0.s$d
            r3.<init>(r2)
            lp3.e r14 = com.tencent.p014mm.plugin.appbrand.config.C81662k.m100184c(r1, r14, r3)
            bs0.s$b r1 = new bs0.s$b
            r1.<init>(r14)
            r13.mo74599v(r1)
            java.lang.Object r14 = r13.mo74608o()
            if (r14 != r0) goto L_0x00c9
            return r0
        L_0x00c9:
            return r14
        L_0x00ca:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "doFetch, fetch fail since "
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bs0.C79801s.mo109934a(int, wx3.d):java.lang.Object");
    }
}
