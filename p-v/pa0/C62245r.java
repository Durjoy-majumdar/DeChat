package pa0;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import d14.C45253g;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import i21.C60242i;
import iy3.C60641c;
import k21.C60960c;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import y90.C66581h;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$performSwitchMusic$2", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {726, 758}, mo125471m = "invokeSuspend")
/* renamed from: pa0.r */
public final class C62245r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f176946d;

    /* renamed from: e */
    public /* synthetic */ Object f176947e;

    /* renamed from: f */
    public final /* synthetic */ C62211a f176948f;

    /* renamed from: g */
    public final /* synthetic */ String f176949g;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$performSwitchMusic$2$1", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.r$a */
    public static final class C62246a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f176950d;

        /* renamed from: e */
        public final /* synthetic */ C62211a f176951e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62246a(C62211a aVar, C15601d<? super C62246a> dVar) {
            super(3, dVar);
            this.f176951e = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C62246a aVar = new C62246a(this.f176951e, (C15601d) obj3);
            aVar.f176950d = (Throwable) obj2;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.f176950d;
            this.f176951e.mo87296f3().dismiss();
            if (th != null) {
                C76912y0.m92767f(this.f176951e.getContext(), this.f176951e.getString(C0966R.string.auh));
            } else {
                C60960c.C60961a aVar = C60960c.f173618a;
                Integer num = new Integer(1);
                C60242i iVar = C60242i.APPEND;
                aVar.mo85927k("SnsTemplate", "musiccnt", num, iVar);
                C60960c.C60961a.m71445p(aVar, "SnsTemplate", "editdetail", "musiccnt", new Integer(1), iVar, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
                C62211a aVar2 = this.f176951e;
                aVar2.mo87299j3(aVar2.mo87297g3().mo76618a());
                C62211a.m73133d3(this.f176951e);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$performSwitchMusic$2$2", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.r$b */
    public static final class C62247b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f176952d;

        /* renamed from: e */
        public final /* synthetic */ C62211a f176953e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62247b(C62211a aVar, C15601d<? super C62247b> dVar) {
            super(3, dVar);
            this.f176953e = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C62247b bVar = new C62247b(this.f176953e, (C15601d) obj3);
            bVar.f176952d = (Throwable) obj2;
            return bVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.printErrStackTrace("MicroMsg.SnsTemplate.TemplateControlUIC", (Throwable) this.f176952d, "maas error", new Object[0]);
            this.f176953e.mo87296f3().dismiss();
            C76912y0.m92767f(this.f176953e.getContext(), this.f176953e.getString(C0966R.string.auh));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pa0.r$c */
    public static final class C62248c implements C45253g<Float> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176954d;

        public C62248c(C62211a aVar) {
            this.f176954d = aVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            float floatValue = ((Number) obj).floatValue();
            C66581h f3 = this.f176954d.mo87296f3();
            String string = this.f176954d.getResources().getString(C0966R.string.gsw, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
            C87412m.m108593f(string, "resources.getString(\n   …                        )");
            f3.mo90633a(string);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62245r(C62211a aVar, String str, C15601d<? super C62245r> dVar) {
        super(2, dVar);
        this.f176948f = aVar;
        this.f176949g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C62245r rVar = new C62245r(this.f176948f, this.f176949g, dVar);
        rVar.f176947e = obj;
        return rVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62245r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f176946d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r0 = r6.f176947e
            a14.n0 r0 = (a14.C0000n0) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x007c
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001d:
            java.lang.Object r1 = r6.f176947e
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004e
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f176947e
            r1 = r7
            a14.n0 r1 = (a14.C0000n0) r1
            bl3.r r7 = bl3.C39818r.f106831a
            pa0.a r5 = r6.f176948f
            android.app.Activity r5 = r5.getContext()
            bl3.r$a r7 = r7.mo62443b(r5)
            java.lang.Class<la0.a> r5 = la0.C61242a.class
            bl3.c r7 = r7.mo62447c(r5)
            la0.a r7 = (la0.C61242a) r7
            java.lang.String r5 = r6.f176949g
            r6.f176947e = r1
            r6.f176946d = r3
            java.lang.Object r7 = r7.mo86206G2(r5, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x004e:
            d14.f r7 = (d14.C45252f) r7
            if (r7 == 0) goto L_0x007e
            pa0.r$a r3 = new pa0.r$a
            pa0.a r5 = r6.f176948f
            r3.<init>(r5, r4)
            d14.q r5 = new d14.q
            r5.<init>(r7, r3)
            pa0.r$b r7 = new pa0.r$b
            pa0.a r3 = r6.f176948f
            r7.<init>(r3, r4)
            d14.t r3 = new d14.t
            r3.<init>(r5, r7)
            pa0.r$c r7 = new pa0.r$c
            pa0.a r4 = r6.f176948f
            r7.<init>(r4)
            r6.f176947e = r1
            r6.f176946d = r2
            java.lang.Object r7 = r3.mo31880a(r7, r6)
            if (r7 != r0) goto L_0x007c
            return r0
        L_0x007c:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x007e:
            if (r4 != 0) goto L_0x009e
            pa0.a r7 = r6.f176948f
            java.lang.String r0 = "MicroMsg.SnsTemplate.TemplateControlUIC"
            java.lang.String r1 = "recreateWithMusicID return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            y90.h r0 = r7.mo87296f3()
            r0.dismiss()
            android.app.Activity r0 = r7.getContext()
            r1 = 2131822945(0x7f110961, float:1.9278676E38)
            java.lang.String r7 = r7.getString(r1)
            nj3.C76912y0.m92767f(r0, r7)
        L_0x009e:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62245r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
