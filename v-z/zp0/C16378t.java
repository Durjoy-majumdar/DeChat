package zp0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53921m;
import a14.C53934p0;
import a14.C53953u0;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C36907w;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.networking.WxaPrefetchDNSDomainsUtils$tryPrefetch$1", mo125469f = "WxaPrefetchDNSDomainsUtils.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: zp0.t */
public final class C16378t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f43776d;

    /* renamed from: e */
    public /* synthetic */ Object f43777e;

    /* renamed from: f */
    public final /* synthetic */ List<String> f43778f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.networking.WxaPrefetchDNSDomainsUtils$tryPrefetch$1$awaits$1$1", mo125469f = "WxaPrefetchDNSDomainsUtils.kt", mo125470l = {24}, mo125471m = "invokeSuspend")
    /* renamed from: zp0.t$a */
    public static final class C16379a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f43779d;

        /* renamed from: e */
        public final /* synthetic */ String f43780e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16379a(String str, C15601d<? super C16379a> dVar) {
            super(2, dVar);
            this.f43780e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16379a(this.f43780e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16379a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f43779d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f43780e;
                this.f43779d = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                long currentTicks = Util.currentTicks();
                try {
                    InetAddress.getByName(Uri.parse(str).getHost());
                    Log.m105924i("Luggage.WxaPrefetchDNSDomainsUtils", "prefetchForUrl(" + str + "), succeed, cost:" + Util.ticksToNow(currentTicks));
                } catch (Exception e) {
                    Log.m105924i("Luggage.WxaPrefetchDNSDomainsUtils", "prefetchForUrl(" + str + "), failed with exception:" + e);
                    z = false;
                }
                mVar.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16378t(List<String> list, C15601d<? super C16378t> dVar) {
        super(2, dVar);
        this.f43778f = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C16378t tVar = new C16378t(this.f43778f, dVar);
        tVar.f43777e = obj;
        return tVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C16378t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Iterator it;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f43776d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f43777e;
            List<String> list = this.f43778f;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (String aVar2 : list) {
                arrayList.add(C53895h.m60464b(n0Var, C53872d1.f151119c, (C53934p0) null, new C16379a(aVar2, (C15601d<? super C16379a>) null), 2, (Object) null));
            }
            it = arrayList.iterator();
        } else if (i == 1) {
            it = (Iterator) this.f43777e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            this.f43777e = it;
            this.f43776d = 1;
            if (((C53953u0) it.next()).mo74634A(this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
