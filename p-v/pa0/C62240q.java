package pa0;

import a14.C0000n0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import y90.C66581h;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$performExport$1", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {651, 669}, mo125471m = "invokeSuspend")
/* renamed from: pa0.q */
public final class C62240q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f176934d;

    /* renamed from: e */
    public Object f176935e;

    /* renamed from: f */
    public int f176936f;

    /* renamed from: g */
    public /* synthetic */ Object f176937g;

    /* renamed from: h */
    public final /* synthetic */ C62211a f176938h;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$performExport$1$2", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.q$a */
    public static final class C62241a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f176939d;

        /* renamed from: e */
        public final /* synthetic */ C62211a f176940e;

        /* renamed from: f */
        public final /* synthetic */ String f176941f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62241a(C62211a aVar, String str, C15601d<? super C62241a> dVar) {
            super(3, dVar);
            this.f176940e = aVar;
            this.f176941f = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C62241a aVar = new C62241a(this.f176940e, this.f176941f, (C15601d) obj3);
            aVar.f176939d = (Throwable) obj2;
            return aVar.invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
            r1 = r1.f153252d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.ResultKt.throwOnFailure(r15)
                java.lang.Object r15 = r14.f176939d
                java.lang.Throwable r15 = (java.lang.Throwable) r15
                pa0.a r0 = r14.f176940e
                y90.h r0 = r0.mo87296f3()
                r0.dismiss()
                k21.c$a r0 = k21.C60960c.f173618a
                pa0.a r1 = r14.f176940e
                ca0.f0 r1 = r1.f176868n
                r12 = 0
                r13 = 1
                if (r1 == 0) goto L_0x002c
                j0.k2<java.lang.Boolean> r1 = r1.f153252d
                if (r1 == 0) goto L_0x002c
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != r13) goto L_0x002c
                r1 = 1
                goto L_0x002d
            L_0x002c:
                r1 = 0
            L_0x002d:
                r1 = r1 ^ r13
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r1)
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 240(0xf0, float:3.36E-43)
                r11 = 0
                java.lang.String r2 = "SnsTemplate"
                java.lang.String r3 = "editdetail"
                java.lang.String r4 = "musicStatus"
                r1 = r0
                k21.C60960c.C60961a.m71445p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                pa0.a r1 = r14.f176940e
                ca0.f0 r1 = r1.f176868n
                if (r1 == 0) goto L_0x005c
                j0.k2<java.lang.Boolean> r1 = r1.f153253e
                if (r1 == 0) goto L_0x005c
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != r13) goto L_0x005c
                r1 = 1
                goto L_0x005d
            L_0x005c:
                r1 = 0
            L_0x005d:
                r1 = r1 ^ r13
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r1)
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 240(0xf0, float:3.36E-43)
                r11 = 0
                java.lang.String r2 = "SnsTemplate"
                java.lang.String r3 = "editdetail"
                java.lang.String r4 = "oriMusicStatus"
                r1 = r0
                k21.C60960c.C60961a.m71445p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r1 = "MicroMsg.SnsTemplate.TemplateControlUIC"
                if (r15 != 0) goto L_0x01df
                java.lang.Integer r15 = new java.lang.Integer
                r15.<init>(r13)
                java.lang.String r2 = "SnsTemplate"
                java.lang.String r3 = "egendcnt"
                r0.mo85926j(r2, r3, r15)
                pa0.a r15 = r14.f176940e
                r3 = 3
                r15.mo87301l3(r3)
                pa0.a r15 = r14.f176940e
                java.lang.String r10 = r14.f176941f
                androidx.appcompat.app.AppCompatActivity r3 = r15.getActivity()
                java.lang.String r4 = "context"
                gy3.C87412m.m108594g(r3, r4)
                hi2.b r4 = hi2.C46072b.f124220a
                java.lang.String r5 = "com.tencent.phoenix"
                java.lang.String r6 = "A24DC0755072F64C480DC06DCD3412BF"
                boolean r3 = r4.mo71508b(r3, r5, r6)
                if (r3 == 0) goto L_0x00a5
                r3 = 1
                goto L_0x00a6
            L_0x00a5:
                r3 = 2
            L_0x00a6:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = "installMiaojian"
                r0.mo85926j(r2, r4, r3)
                hi2.h r3 = hi2.C98453h.f288774a
                r4 = 1
                r7 = 1
                r8 = 0
                r9 = 1
                java.lang.String r5 = ""
                r6 = r10
                r3.mo137817o(r4, r5, r6, r7, r8, r9)
                androidx.appcompat.app.AppCompatActivity r0 = r15.getActivity()
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = "key_export_video_path"
                r2.putExtra(r3, r10)
                te3.e94 r3 = new te3.e94
                r3.<init>()
                java.lang.String r4 = "miaojian"
                r3.f182942d = r4
                com.tencent.mm.mj_template.sns.compose.widget.y1 r4 = r15.mo87297g3()
                com.tencent.mm.mj_template.sns.compose.widget.n1 r4 = r4.f157677m
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x00e0
                java.lang.String r6 = r4.f157555a
                if (r6 != 0) goto L_0x00e1
            L_0x00e0:
                r6 = r5
            L_0x00e1:
                r3.f182943e = r6
                com.tencent.mm.mj_template.sns.compose.widget.y1 r6 = r15.mo87297g3()
                java.util.List r6 = r6.mo76619b()
                java.util.Iterator r6 = r6.iterator()
            L_0x00ef:
                boolean r7 = r6.hasNext()
                r8 = 0
                if (r7 == 0) goto L_0x010e
                java.lang.Object r7 = r6.next()
                r9 = r7
                com.tencent.mm.mj_template.sns.compose.widget.n1 r9 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1) r9
                java.lang.String r9 = r9.f157555a
                com.tencent.mm.mj_template.sns.compose.widget.y1 r10 = r15.mo87297g3()
                java.lang.String r10 = r10.mo76618a()
                boolean r9 = gy3.C87412m.m108589b(r9, r10)
                if (r9 == 0) goto L_0x00ef
                goto L_0x010f
            L_0x010e:
                r7 = r8
            L_0x010f:
                com.tencent.mm.mj_template.sns.compose.widget.n1 r7 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1) r7
                if (r7 == 0) goto L_0x0124
                com.tencent.mm.mj_template.sns.compose.widget.y1 r6 = r15.mo87297g3()
                java.util.List r6 = r6.mo76619b()
                int r6 = r6.indexOf(r7)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                goto L_0x0125
            L_0x0124:
                r6 = r8
            L_0x0125:
                k21.c$a r7 = k21.C60960c.f173618a
                if (r6 == 0) goto L_0x012e
                int r6 = r6.intValue()
                goto L_0x012f
            L_0x012e:
                r6 = 0
            L_0x012f:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.String r9 = "SnsPublishProcess"
                java.lang.String r10 = "egLocation"
                r7.mo85926j(r9, r10, r6)
                java.lang.String r6 = r3.f182943e
                java.lang.String r10 = "templateId"
                gy3.C87412m.m108593f(r6, r10)
                java.lang.String r10 = "egID"
                r7.mo85926j(r9, r10, r6)
                ca0.f0 r6 = r15.f176868n
                if (r6 == 0) goto L_0x015d
                j0.k2<java.lang.Boolean> r6 = r6.f153252d
                if (r6 == 0) goto L_0x015d
                java.lang.Object r6 = r6.getValue()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L_0x015d
                r6 = 1
                goto L_0x015e
            L_0x015d:
                r6 = 0
            L_0x015e:
                if (r6 == 0) goto L_0x0184
                java.lang.String r6 = "performPost has music id"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
                ca0.f0 r6 = r15.f176868n
                if (r6 == 0) goto L_0x017d
                j0.k2<com.tencent.maas.model.MJMusicInfo> r6 = r6.f153250b
                if (r6 == 0) goto L_0x017d
                java.lang.Object r6 = r6.getValue()
                com.tencent.maas.model.MJMusicInfo r6 = (com.tencent.maas.model.MJMusicInfo) r6
                if (r6 == 0) goto L_0x017d
                java.lang.String r6 = r6.getMusicID()
                if (r6 != 0) goto L_0x017c
                goto L_0x017d
            L_0x017c:
                r5 = r6
            L_0x017d:
                r3.f182944f = r5
                java.lang.String r6 = "musicID"
                r7.mo85926j(r9, r6, r5)
            L_0x0184:
                ca0.f0 r15 = r15.f176868n
                if (r15 == 0) goto L_0x0199
                j0.k2<java.lang.Boolean> r15 = r15.f153253e
                if (r15 == 0) goto L_0x0199
                java.lang.Object r15 = r15.getValue()
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 != r13) goto L_0x0199
                r12 = 1
            L_0x0199:
                r15 = r13 ^ r12
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                java.lang.String r5 = "ifVoice"
                r7.mo85926j(r9, r5, r15)
                boolean r15 = r4 instanceof com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d
                if (r15 == 0) goto L_0x01ab
                r8 = r4
                com.tencent.mm.mj_template.sns.compose.widget.n1$d r8 = (com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d) r8
            L_0x01ab:
                if (r8 == 0) goto L_0x01b5
                long r4 = r8.f157565g
                r3.f182946h = r4
                long r4 = r8.f157566h
                r3.f182945g = r4
            L_0x01b5:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                byte[] r15 = r3.toByteArray()
                java.lang.String r3 = "key_video_template_info"
                r2.putExtra(r3, r15)
                r15 = -1
                r0.setResult(r15, r2)
                r0.finish()
                pa0.a r0 = r14.f176940e
                android.app.Activity r0 = r0.getContext()
                r0.setResult(r15)
                pa0.a r15 = r14.f176940e
                android.app.Activity r15 = r15.getContext()
                r15.finish()
                java.lang.String r15 = "export successful"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r15)
                goto L_0x01ec
            L_0x01df:
                pa0.a r0 = r14.f176940e
                r2 = 4
                r0.mo87301l3(r2)
                java.lang.Object[] r0 = new java.lang.Object[r12]
                java.lang.String r2 = "maas error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r15, r2, r0)
            L_0x01ec:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: pa0.C62240q.C62241a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.uic.SnsTemplateControlUIC$performExport$1$3", mo125469f = "SnsTemplateControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pa0.q$b */
    public static final class C62242b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f176942d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f176943e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62242b(C32224a<C13598b0> aVar, C15601d<? super C62242b> dVar) {
            super(3, dVar);
            this.f176943e = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C45253g gVar = (C45253g) obj;
            C62242b bVar = new C62242b(this.f176943e, (C15601d) obj3);
            bVar.f176942d = (Throwable) obj2;
            return bVar.invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.printErrStackTrace("MicroMsg.SnsTemplate.TemplateControlUIC", (Throwable) this.f176942d, "maas error", new Object[0]);
            this.f176943e.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pa0.q$c */
    public static final class C62243c implements C45253g<Float> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176944d;

        public C62243c(C62211a aVar) {
            this.f176944d = aVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            float floatValue = ((Number) obj).floatValue();
            C66581h f3 = this.f176944d.mo87296f3();
            String string = this.f176944d.getResources().getString(C0966R.string.gsp, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
            C87412m.m108593f(string, "resources.getString(\n   …t()\n                    )");
            f3.mo90633a(string);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pa0.q$d */
    public static final class C62244d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62211a f176945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62244d(C62211a aVar) {
            super(0);
            this.f176945d = aVar;
        }

        public Object invoke() {
            this.f176945d.mo87296f3().dismiss();
            C76912y0.m92767f(this.f176945d.getContext(), this.f176945d.getString(C0966R.string.gsn));
            this.f176945d.mo87301l3(4);
            this.f176945d.getContext().setResult(0);
            this.f176945d.getContext().finish();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62240q(C62211a aVar, C15601d<? super C62240q> dVar) {
        super(2, dVar);
        this.f176938h = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C62240q qVar = new C62240q(this.f176938h, dVar);
        qVar.f176937g = obj;
        return qVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62240q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f176936f
            java.lang.String r2 = "MicroMsg.SnsTemplate.TemplateControlUIC"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0035
            if (r1 == r4) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            java.lang.Object r0 = r10.f176934d
            fy3.a r0 = (fy3.C32224a) r0
            java.lang.Object r1 = r10.f176937g
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00ea
        L_0x001c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0024:
            java.lang.Object r1 = r10.f176935e
            fy3.a r1 = (fy3.C32224a) r1
            java.lang.Object r4 = r10.f176934d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r10.f176937g
            a14.n0 r6 = (a14.C0000n0) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00b9
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f176937g
            r6 = r11
            a14.n0 r6 = (a14.C0000n0) r6
            pa0.a r11 = r10.f176938h
            y90.h r11 = r11.mo87296f3()
            pa0.a r1 = r10.f176938h
            r7 = 2131832917(0x7f113055, float:1.9298901E38)
            java.lang.String r1 = r1.getString(r7)
            r11.mo90633a(r1)
            r11.show()
            pa0.a r11 = r10.f176938h
            java.lang.String r1 = r11.f176870p
            r11.getClass()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r1)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            pa0.a r1 = r10.f176938h
            java.lang.String r1 = r1.f176870p
            r11.append(r1)
            long r7 = java.lang.System.currentTimeMillis()
            r11.append(r7)
            java.lang.String r1 = ".mp4"
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "performExport path:"
            r1.append(r7)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            pa0.q$d r1 = new pa0.q$d
            pa0.a r7 = r10.f176938h
            r1.<init>(r7)
            bl3.r r7 = bl3.C39818r.f106831a
            pa0.a r8 = r10.f176938h
            android.app.Activity r8 = r8.getContext()
            bl3.r$a r7 = r7.mo62443b(r8)
            java.lang.Class<la0.a> r8 = la0.C61242a.class
            bl3.c r7 = r7.mo62447c(r8)
            la0.a r7 = (la0.C61242a) r7
            r10.f176937g = r6
            r10.f176934d = r11
            r10.f176935e = r1
            r10.f176936f = r4
            java.lang.Object r4 = r7.mo86212N2(r11, r10)
            if (r4 != r0) goto L_0x00b6
            return r0
        L_0x00b6:
            r9 = r4
            r4 = r11
            r11 = r9
        L_0x00b9:
            d14.f r11 = (d14.C45252f) r11
            if (r11 == 0) goto L_0x00ed
            pa0.q$a r7 = new pa0.q$a
            pa0.a r8 = r10.f176938h
            r7.<init>(r8, r4, r5)
            d14.q r4 = new d14.q
            r4.<init>(r11, r7)
            pa0.q$b r11 = new pa0.q$b
            r11.<init>(r1, r5)
            d14.t r7 = new d14.t
            r7.<init>(r4, r11)
            pa0.q$c r11 = new pa0.q$c
            pa0.a r4 = r10.f176938h
            r11.<init>(r4)
            r10.f176937g = r6
            r10.f176934d = r1
            r10.f176935e = r5
            r10.f176936f = r3
            java.lang.Object r11 = r7.mo31880a(r11, r10)
            if (r11 != r0) goto L_0x00e9
            return r0
        L_0x00e9:
            r0 = r1
        L_0x00ea:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r1 = r0
        L_0x00ed:
            if (r5 != 0) goto L_0x00f8
            java.lang.String r11 = "unexpected export null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r11)
            r1.invoke()
        L_0x00f8:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62240q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
