package kq1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import au3.C54328a;
import bl3.C0317e;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeWatermarkDet;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7829l5;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64302cz3;
import te3.C64843xy3;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xe1.C38488a;
import xe1.C66248c;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kq1.l */
public final class C61137l extends C10395r {

    /* renamed from: e */
    public int f174051e;

    /* renamed from: f */
    public boolean f174052f;

    /* renamed from: g */
    public C54625h<Integer> f174053g = C54629k.m61479a(0, (C54624g) null, (C32226l) null, 7, (Object) null);

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$preCheckInner$1", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {92}, mo125471m = "invokeSuspend")
    /* renamed from: kq1.l$a */
    public static final class C33973a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f91729d;

        /* renamed from: e */
        public int f91730e;

        /* renamed from: f */
        public final /* synthetic */ C61137l f91731f;

        /* renamed from: g */
        public final /* synthetic */ C7829l5 f91732g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f91733h;

        /* renamed from: i */
        public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f91734i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostSafePreCheckUIC$preCheckInner$1$1", mo125469f = "FinderPostSafePreCheckUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: kq1.l$a$a */
        public static final class C33974a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C7829l5 f91735d;

            /* renamed from: e */
            public final /* synthetic */ C61137l f91736e;

            /* renamed from: f */
            public final /* synthetic */ C32224a<C13598b0> f91737f;

            /* renamed from: g */
            public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f91738g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C33974a(C7829l5 l5Var, C61137l lVar, C32224a<C13598b0> aVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar, C15601d<? super C33974a> dVar) {
                super(2, dVar);
                this.f91735d = l5Var;
                this.f91736e = lVar;
                this.f91737f = aVar;
                this.f91738g = pVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C33974a(this.f91735d, this.f91736e, this.f91737f, this.f91738g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C33974a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C7829l5 l5Var = this.f91735d;
                int i = this.f91736e.f174051e;
                C64843xy3 xy32 = new C64843xy3();
                C64302cz3 cz32 = new C64302cz3();
                cz32.f182620h = i;
                xy32.f186421h = cz32;
                byte[] byteArray = xy32.toByteArray();
                C87412m.m108593f(byteArray, "SecClientSDKMediaFeature…}\n        }.toByteArray()");
                l5Var.f26368b = byteArray;
                C33973a.super.mo10711f3(this.f91735d, this.f91737f, this.f91738g);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33973a(C61137l lVar, C7829l5 l5Var, C32224a<C13598b0> aVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar, C15601d<? super C33973a> dVar) {
            super(2, dVar);
            this.f91731f = lVar;
            this.f91732g = l5Var;
            this.f91733h = aVar;
            this.f91734i = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C33973a(this.f91731f, this.f91732g, this.f91733h, this.f91734i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C33973a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C61137l lVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f91730e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("Finder.PostSafePreCheckUIC", "[preCheckInner] wait for watermark detect result");
                C61137l lVar2 = this.f91731f;
                this.f91729d = lVar2;
                this.f91730e = 1;
                Object j3 = C61137l.m71704j3(lVar2, this);
                if (j3 == aVar) {
                    return aVar;
                }
                lVar = lVar2;
                obj = j3;
            } else if (i == 1) {
                lVar = (C61137l) this.f91729d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar.f174051e = ((Number) obj).intValue();
            Log.m105924i("Finder.PostSafePreCheckUIC", "[preCheckInner] receive watermark detect result, " + this.f91731f.f174051e);
            C61137l lVar3 = this.f91731f;
            C0317e.launchUI$default(lVar3, (C66212f) null, (C53934p0) null, new C33974a(this.f91732g, lVar3, this.f91733h, this.f91734i, (C15601d<? super C33974a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61137l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final Object m71702g3(C61137l lVar, List list, C15601d dVar) {
        lVar.getClass();
        return C66248c.f190305a.mo90342a() ? C53895h.m60469g(C54328a.f152462f, new C38488a(list, (C15601d<? super C38488a>) null), dVar) : Boolean.FALSE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71704j3(kq1.C61137l r4, wx3.C15601d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof kq1.C61138m
            if (r0 == 0) goto L_0x0016
            r0 = r5
            kq1.m r0 = (kq1.C61138m) r0
            int r1 = r0.f174056f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f174056f = r1
            goto L_0x001b
        L_0x0016:
            kq1.m r0 = new kq1.m
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.f174054d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f174056f
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004a
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r5)
            c14.h<java.lang.Integer> r5 = r4.f174053g
            boolean r5 = r5.mo75516m()
            if (r5 != 0) goto L_0x0051
            c14.h<java.lang.Integer> r4 = r4.f174053g
            r0.f174056f = r3
            c14.a r4 = (c14.C54602a) r4
            java.lang.Object r5 = r4.mo75514g(r0)
            if (r5 != r1) goto L_0x004a
            goto L_0x006d
        L_0x004a:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "receive watermarkFlag: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Finder.PostSafePreCheckUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kq1.C61137l.m71704j3(kq1.l, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m71705k3(kq1.C61137l r4, int r5, wx3.C15601d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof kq1.C61139n
            if (r0 == 0) goto L_0x0016
            r0 = r6
            kq1.n r0 = (kq1.C61139n) r0
            int r1 = r0.f174060g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f174060g = r1
            goto L_0x001b
        L_0x0016:
            kq1.n r0 = new kq1.n
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f174058e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f174060g
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f174057d
            kq1.l r4 = (kq1.C61137l) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0064
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "send watermarkFlag: "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "Finder.PostSafePreCheckUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            c14.h<java.lang.Integer> r6 = r4.f174053g
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r0.f174057d = r4
            r0.f174060g = r3
            c14.c r6 = (c14.C54614c) r6
            java.lang.Object r5 = r6.mo75536o(r2, r0)
            if (r5 != r1) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            c14.h<java.lang.Integer> r4 = r4.f174053g
            r5 = 0
            c14.C54612b0.C54613a.m61404a(r4, r5, r3, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kq1.C61137l.m71705k3(kq1.l, int, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public boolean mo10705d3() {
        C37521f.f99374d.getClass();
        return C37521f.f99318W3.mo60266n().intValue() == 1;
    }

    /* renamed from: e3 */
    public int mo10706e3() {
        return 1;
    }

    /* renamed from: f3 */
    public void mo10711f3(C7829l5 l5Var, C32224a<C13598b0> aVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(l5Var, "preCheckInfo");
        C87412m.m108594g(aVar, "onShowTipsDialog");
        C87412m.m108594g(pVar, "onEndCheck");
        Log.m105924i("Finder.PostSafePreCheckUIC", "[preCheckInner] needWatermarkDet:" + this.f174052f + ", watermarkFlag:" + this.f174051e);
        if (!this.f174052f || this.f174051e > 0) {
            int i = this.f174051e;
            C64843xy3 xy32 = new C64843xy3();
            C64302cz3 cz32 = new C64302cz3();
            cz32.f182620h = i;
            xy32.f186421h = cz32;
            byte[] byteArray = xy32.toByteArray();
            C87412m.m108593f(byteArray, "SecClientSDKMediaFeature…}\n        }.toByteArray()");
            l5Var.f26368b = byteArray;
            super.mo10711f3(l5Var, aVar, pVar);
            return;
        }
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C33973a(this, l5Var, aVar, pVar, (C15601d<? super C33973a>) null), 3, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("key_post_has_show_safe_dialog", false);
        Log.m105924i("Finder.PostSafePreCheckUIC", "[onCreate] hasShowSafeDialog:" + booleanExtra);
        if (booleanExtra) {
            this.f31613d++;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        long j = C66248c.f190306b;
        if (j != 0) {
            WeWatermarkDet.nRelease(j);
            C66248c.f190306b = 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61137l(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
