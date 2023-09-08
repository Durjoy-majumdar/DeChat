package y90;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import iy3.C60641c;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$performSwitchMusic$2", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {220, 236}, mo125471m = "invokeSuspend")
/* renamed from: y90.f */
public final class C66577f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f191462d;

    /* renamed from: e */
    public /* synthetic */ Object f191463e;

    /* renamed from: f */
    public final /* synthetic */ C66559c f191464f;

    /* renamed from: g */
    public final /* synthetic */ String f191465g;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$performSwitchMusic$2$1", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: y90.f$a */
    public static final class C66578a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f191466d;

        /* renamed from: e */
        public final /* synthetic */ C66559c f191467e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66578a(C66559c cVar, C15601d<? super C66578a> dVar) {
            super(3, dVar);
            this.f191467e = cVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C66578a aVar = new C66578a(this.f191467e, (C15601d) obj3);
            aVar.f191466d = (Throwable) obj2;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.f191466d;
            this.f191467e.mo90625e3().dismiss();
            if (th != null) {
                C76912y0.m92767f(this.f191467e.getContext(), this.f191467e.getString(C0966R.string.auh));
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$performSwitchMusic$2$2", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: y90.f$b */
    public static final class C66579b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f191468d;

        /* renamed from: e */
        public final /* synthetic */ C66559c f191469e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66579b(C66559c cVar, C15601d<? super C66579b> dVar) {
            super(3, dVar);
            this.f191469e = cVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C66579b bVar = new C66579b(this.f191469e, (C15601d) obj3);
            bVar.f191468d = (Throwable) obj2;
            return bVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.printErrStackTrace("MaasBaseUILogicUIC", (Throwable) this.f191468d, "maas error", new Object[0]);
            this.f191469e.mo90625e3().dismiss();
            C76912y0.m92767f(this.f191469e.getContext(), this.f191469e.getString(C0966R.string.gsn));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y90.f$c */
    public static final class C66580c implements C45253g<Float> {

        /* renamed from: d */
        public final /* synthetic */ C66559c f191470d;

        public C66580c(C66559c cVar) {
            this.f191470d = cVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            float floatValue = ((Number) obj).floatValue();
            C66581h e3 = this.f191470d.mo90625e3();
            String string = this.f191470d.getResources().getString(C0966R.string.gsw, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
            C87412m.m108593f(string, "resources.getString(\n   …                        )");
            e3.mo90633a(string);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66577f(C66559c cVar, String str, C15601d<? super C66577f> dVar) {
        super(2, dVar);
        this.f191464f = cVar;
        this.f191465g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C66577f fVar = new C66577f(this.f191464f, this.f191465g, dVar);
        fVar.f191463e = obj;
        return fVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66577f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f191462d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r0 = r6.f191463e
            a14.n0 r0 = (a14.C0000n0) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x007c
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001d:
            java.lang.Object r1 = r6.f191463e
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004e
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f191463e
            r1 = r7
            a14.n0 r1 = (a14.C0000n0) r1
            bl3.r r7 = bl3.C39818r.f106831a
            y90.c r5 = r6.f191464f
            android.app.Activity r5 = r5.getContext()
            bl3.r$a r7 = r7.mo62443b(r5)
            java.lang.Class<la0.a> r5 = la0.C61242a.class
            bl3.c r7 = r7.mo62447c(r5)
            la0.a r7 = (la0.C61242a) r7
            java.lang.String r5 = r6.f191465g
            r6.f191463e = r1
            r6.f191462d = r3
            java.lang.Object r7 = r7.mo86206G2(r5, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x004e:
            d14.f r7 = (d14.C45252f) r7
            if (r7 == 0) goto L_0x007e
            y90.f$a r3 = new y90.f$a
            y90.c r5 = r6.f191464f
            r3.<init>(r5, r4)
            d14.q r5 = new d14.q
            r5.<init>(r7, r3)
            y90.f$b r7 = new y90.f$b
            y90.c r3 = r6.f191464f
            r7.<init>(r3, r4)
            d14.t r3 = new d14.t
            r3.<init>(r5, r7)
            y90.f$c r7 = new y90.f$c
            y90.c r4 = r6.f191464f
            r7.<init>(r4)
            r6.f191463e = r1
            r6.f191462d = r2
            java.lang.Object r7 = r3.mo31880a(r7, r6)
            if (r7 != r0) goto L_0x007c
            return r0
        L_0x007c:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x007e:
            if (r4 != 0) goto L_0x009e
            y90.c r7 = r6.f191464f
            java.lang.String r0 = "MaasBaseUILogicUIC"
            java.lang.String r1 = "recreateWithMusicID return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            y90.h r0 = r7.mo90625e3()
            r0.dismiss()
            android.app.Activity r0 = r7.getContext()
            r1 = 2131822945(0x7f110961, float:1.9278676E38)
            java.lang.String r7 = r7.getString(r1)
            nj3.C76912y0.m92767f(r0, r7)
        L_0x009e:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y90.C66577f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
