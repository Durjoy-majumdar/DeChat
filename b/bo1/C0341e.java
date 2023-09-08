package bo1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import j31.C9279c;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46518f;
import ob0.C89132b;
import sx3.C36907w;
import te3.C49173do1;
import te3.C49712hj1;
import te3.C50294lp0;
import up1.C37521f;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: bo1.e */
public final class C0341e extends C9279c<String, C89132b.C89134c<C50294lp0>> {

    /* renamed from: e */
    public boolean f923e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.preload.FinderGetRelativeCache", mo125469f = "FinderGetRelativeFutureTask.kt", mo125470l = {60}, mo125471m = "requestCache")
    /* renamed from: bo1.e$a */
    public static final class C0342a extends C66704d {

        /* renamed from: d */
        public Object f924d;

        /* renamed from: e */
        public /* synthetic */ Object f925e;

        /* renamed from: f */
        public final /* synthetic */ C0341e f926f;

        /* renamed from: g */
        public int f927g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0342a(C0341e eVar, C15601d<? super C0342a> dVar) {
            super(dVar);
            this.f926f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f925e = obj;
            this.f927g |= Integer.MIN_VALUE;
            return this.f926f.mo378d(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0341e(String str) {
        super(str);
        C87412m.m108594g(str, "key");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo378d(wx3.C15601d<? super ob0.C89132b.C89134c<te3.C50294lp0>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bo1.C0341e.C0342a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bo1.e$a r0 = (bo1.C0341e.C0342a) r0
            int r1 = r0.f927g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f927g = r1
            goto L_0x0018
        L_0x0013:
            bo1.e$a r0 = new bo1.e$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f925e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f927g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.f924d
            bo1.e r0 = (bo1.C0341e) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            a14.u0<? extends _result> r6 = r5.f29029d
            if (r6 == 0) goto L_0x0043
            boolean r6 = r6.mo74466a()
            if (r6 != r4) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            r5.f923e = r6
            r0.f924d = r5
            r0.f927g = r4
            java.lang.Object r6 = j31.C9279c.m8917i(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r5
        L_0x0052:
            ob0.b$c r6 = (ob0.C89132b.C89134c) r6
            r0.f923e = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "requestCache: errType = "
            r0.append(r1)
            r1 = 0
            if (r6 == 0) goto L_0x006b
            int r2 = r6.f256793a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L_0x006c
        L_0x006b:
            r3 = r1
        L_0x006c:
            r0.append(r3)
            java.lang.String r2 = ", errCode="
            r0.append(r2)
            if (r6 == 0) goto L_0x007e
            int r1 = r6.f256794b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = r2
        L_0x007e:
            r0.append(r1)
            java.lang.String r1 = ", cache="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderGetRelativeCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bo1.C0341e.mo378d(wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public void mo379e(Object obj, long j) {
        _result _result = (C89132b.C89134c) obj;
        C87412m.m108594g(_result, "result");
        this.f29027b = _result;
        this.f29028c = j;
    }

    /* renamed from: g */
    public boolean mo380g() {
        boolean z = false;
        if (this.f29027b == null) {
            return false;
        }
        C37521f.f99374d.getClass();
        long longValue = C37521f.f99342Z0.mo60266n().longValue() * 1000;
        if (longValue <= 0) {
            longValue = ((long) C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_MP_PREFETCH_INTERVAL_SEC_INT_SYNC, 0)) * 1000;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f29028c;
        if (this.f923e || currentTimeMillis < longValue) {
            z = true;
        }
        Log.m105924i("FinderGetRelativeCache", "checkCacheAvailable: result=" + z + ", doNotCheckTime=" + this.f923e + "cacheValidIntervalMs=" + longValue + ", cacheTimeDelta=" + currentTimeMillis);
        return z;
    }

    /* renamed from: h */
    public void mo381h(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C87412m.m108594g(cVar, "result");
        int size = ((C50294lp0) cVar.f256796d).f137560d.size();
        if (size > 0) {
            Log.m105924i("FinderGetRelativeCache", "recycleCache: size = " + size);
            LinkedList<FinderObject> linkedList = ((C50294lp0) cVar.f256796d).f137560d;
            C87412m.m108593f(linkedList, "result.resp.`object`");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                C49173do1 do12 = new C49173do1();
                do12.f132446d = finderObject.f164794id;
                do12.f132447e = finderObject.objectNonceId;
                do12.f132449g = finderObject.sessionBuffer;
                arrayList.add(do12);
            }
            C49712hj1 hj12 = new C49712hj1();
            hj12.f134675i = 162;
            new C46518f(arrayList, hj12).mo9225i();
        }
    }

    /* renamed from: j */
    public final C50294lp0 mo382j() {
        C89132b.C89134c cVar = (C89132b.C89134c) this.f29027b;
        if (cVar != null) {
            return (C50294lp0) cVar.f256796d;
        }
        return null;
    }
}
