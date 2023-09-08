package lu1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import bp3.C104160f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32227p;
import gy3.C87412m;
import h81.C32735h;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import mu1.C117558a;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p220pr.C110245g;
import p220pr.C77288i;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C86522b
/* renamed from: lu1.b */
public final class C109423b extends C86301e implements C77288i {

    /* renamed from: d */
    public final String f327545d = "MicroMsg.FlutterSettingService";

    /* renamed from: e */
    public final C0000n0 f327546e = C53930o0.m60555b();

    /* renamed from: f */
    public C53973z1 f327547f;

    /* renamed from: g */
    public LinkedList<C77288i.C77289a> f327548g = new LinkedList<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.settings.feature.FlutterSettingService$startSettingChatting$1", mo125469f = "FlutterSettingService.kt", mo125470l = {61, 63, 68}, mo125471m = "invokeSuspend")
    /* renamed from: lu1.b$a */
    public static final class C109424a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f327549d;

        /* renamed from: e */
        public int f327550e;

        /* renamed from: f */
        public final /* synthetic */ Context f327551f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109424a(Context context, C15601d<? super C109424a> dVar) {
            super(2, dVar);
            this.f327551f = context;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109424a(this.f327551f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C109424a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00b1 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r7 = r22
                xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r7.f327550e
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L_0x002d
                if (r0 == r4) goto L_0x0027
                if (r0 == r3) goto L_0x001f
                if (r0 != r2) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x00b2
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r7.f327549d
                a10.y r0 = (a10.C112726y) r0
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x005b
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r23)
                r0 = r23
                goto L_0x0041
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r23)
                java.lang.Class<pr.g> r0 = p220pr.C110245g.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                pr.g r0 = (p220pr.C110245g) r0
                r7.f327550e = r4
                java.lang.Object r0 = r0.Tw0(r7)
                if (r0 != r8) goto L_0x0041
                return r8
            L_0x0041:
                a10.c r0 = (a10.C112713c) r0
                a10.y r4 = new a10.y
                gy3.C87412m.m108591d(r0)
                java.lang.String r5 = "settings"
                r4.<init>(r0, r5)
                r7.f327549d = r4
                r7.f327550e = r3
                java.lang.String r0 = "chatting"
                java.lang.Object r0 = r4.mo164471g(r0, r1, r7)
                if (r0 != r8) goto L_0x005a
                return r8
            L_0x005a:
                r0 = r4
            L_0x005b:
                ku1.a r3 = new ku1.a
                r3.<init>(r0)
                r0.mo164472h(r3)
                mu1.a r3 = new mu1.a
                r3.<init>()
                java.util.List r3 = sx3.C26236u.m33719b(r3)
                r0.mo164465a(r3)
                com.tencent.mm.flutter.ui.FlutterPageStyle r3 = new com.tencent.mm.flutter.ui.FlutterPageStyle
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1023(0x3ff, float:1.434E-42)
                r21 = 0
                r9 = r3
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                android.content.Context r4 = r7.f327551f
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131099720(0x7f060048, float:1.7811801E38)
                int r4 = r4.getColor(r5)
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r4)
                r3.f310674j = r5
                android.content.Context r4 = r7.f327551f
                r5 = 0
                r6 = 4
                r9 = 0
                r7.f327549d = r1
                r7.f327550e = r2
                r1 = r4
                r2 = r3
                r3 = r5
                r4 = r22
                r5 = r6
                r6 = r9
                java.lang.Object r0 = a10.C112726y.m154145i(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x00b2
                return r8
            L_0x00b2:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lu1.C109423b.C109424a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.settings.feature.FlutterSettingService$startSettingPersonalInfo$1", mo125469f = "FlutterSettingService.kt", mo125470l = {76, 78, 83}, mo125471m = "invokeSuspend")
    /* renamed from: lu1.b$b */
    public static final class C109425b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f327552d;

        /* renamed from: e */
        public int f327553e;

        /* renamed from: f */
        public final /* synthetic */ Context f327554f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109425b(Context context, C15601d<? super C109425b> dVar) {
            super(2, dVar);
            this.f327554f = context;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C109425b(this.f327554f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C109425b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00ae A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r7 = r22
                xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r7.f327553e
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L_0x002d
                if (r0 == r4) goto L_0x0027
                if (r0 == r3) goto L_0x001f
                if (r0 != r2) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x00af
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r7.f327552d
                a10.y r0 = (a10.C112726y) r0
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x0058
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r23)
                r0 = r23
                goto L_0x0041
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r23)
                java.lang.Class<pr.g> r0 = p220pr.C110245g.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                pr.g r0 = (p220pr.C110245g) r0
                r7.f327553e = r4
                java.lang.Object r0 = r0.Tw0(r7)
                if (r0 != r8) goto L_0x0041
                return r8
            L_0x0041:
                a10.c r0 = (a10.C112713c) r0
                a10.y r4 = new a10.y
                java.lang.String r5 = "settings"
                r4.<init>(r0, r5)
                r7.f327552d = r4
                r7.f327553e = r3
                java.lang.String r0 = "personal_info"
                java.lang.Object r0 = r4.mo164471g(r0, r1, r7)
                if (r0 != r8) goto L_0x0057
                return r8
            L_0x0057:
                r0 = r4
            L_0x0058:
                ku1.a r3 = new ku1.a
                r3.<init>(r0)
                r0.mo164472h(r3)
                mu1.a r3 = new mu1.a
                r3.<init>()
                java.util.List r3 = sx3.C26236u.m33719b(r3)
                r0.mo164465a(r3)
                com.tencent.mm.flutter.ui.FlutterPageStyle r3 = new com.tencent.mm.flutter.ui.FlutterPageStyle
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1023(0x3ff, float:1.434E-42)
                r21 = 0
                r9 = r3
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                android.content.Context r4 = r7.f327554f
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131099720(0x7f060048, float:1.7811801E38)
                int r4 = r4.getColor(r5)
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r4)
                r3.f310674j = r5
                android.content.Context r4 = r7.f327554f
                r5 = 0
                r6 = 4
                r9 = 0
                r7.f327552d = r1
                r7.f327553e = r2
                r1 = r4
                r2 = r3
                r3 = r5
                r4 = r22
                r5 = r6
                r6 = r9
                java.lang.Object r0 = a10.C112726y.m154145i(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x00af
                return r8
            L_0x00af:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lu1.C109423b.C109425b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: IL */
    public void mo107432IL(C77288i.C77289a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f327548g.add(aVar);
    }

    /* renamed from: Pg */
    public void mo107433Pg(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f327545d, "startSettingPersonalInfo: ");
        C53973z1 z1Var = this.f327547f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f327547f = C53895h.m60466d(this.f327546e, (C66212f) null, (C53934p0) null, new C109425b(context, (C15601d<? super C109425b>) null), 3, (Object) null);
    }

    /* renamed from: X7 */
    public boolean mo107434X7() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_flutter_setting_chatting, C104160f.RepairerConfig_Global_EnableFlutterSettingChatting_Int, 0) == 1;
    }

    /* renamed from: Zo */
    public boolean mo107435Zo() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_flutter_setting_personal, C104160f.RepairerConfig_Global_EnableFlutterSettingPersonal_Int, 0) == 1;
    }

    public void ex0() {
        for (C77288i.C77289a a : this.f327548g) {
            a.mo107441a();
        }
    }

    public void l20(C77288i.C77289a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f327548g.remove(aVar);
    }

    /* renamed from: u */
    public void mo107438u(FlutterEngine flutterEngine) {
        C87412m.m108594g(flutterEngine, "engine");
        flutterEngine.getPlugins().add((FlutterPlugin) new C117558a());
    }

    /* renamed from: vw */
    public void mo107439vw() {
        if (mo107434X7() || mo107435Zo()) {
            ((C110245g) C86312j.m106911c(C110245g.class)).mo161654bC();
        }
    }

    public void z10(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i(this.f327545d, "startSettingChatting: ");
        C53973z1 z1Var = this.f327547f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f327547f = C53895h.m60466d(this.f327546e, (C66212f) null, (C53934p0) null, new C109424a(context, (C15601d<? super C109424a>) null), 3, (Object) null);
    }
}
