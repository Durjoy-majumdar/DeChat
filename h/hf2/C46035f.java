package hf2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoSettingUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C45253g;
import d14.C45255r0;
import d14.C45256s0;
import d62.C75339i;
import di3.C86312j;
import e14.C58499p;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import kotlin.ResultKt;
import ob0.C47350c;
import pb0.C47445a;
import pb0.C47446b;
import pj3.C47511g;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C77702q0;
import te3.C50138kj2;
import te3.C50273lj2;
import te3.C50412mj2;
import te3.C50554nj2;
import wb2.C65946a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: hf2.f */
public final class C46035f extends UIComponent implements NewBizInfoSettingUI.C42652e {

    /* renamed from: j */
    public static C50273lj2 f124140j;

    /* renamed from: d */
    public int f124141d;

    /* renamed from: e */
    public String f124142e;

    /* renamed from: f */
    public String f124143f;

    /* renamed from: g */
    public String f124144g;

    /* renamed from: h */
    public final C13601g f124145h;

    /* renamed from: i */
    public C89779i0 f124146i;

    /* renamed from: hf2.f$a */
    public static final class C46036a implements C45252f<C47445a<C50273lj2>> {

        /* renamed from: d */
        public final /* synthetic */ C45252f f124147d;

        /* renamed from: hf2.f$a$a */
        public static final class C46037a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C45253g f124148d;

            @C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingJsApiUIC$onCreate$$inlined$filter$1$2", mo125469f = "NewBizInfoSettingJsApiUIC.kt", mo125470l = {224}, mo125471m = "emit")
            /* renamed from: hf2.f$a$a$a */
            public static final class C46038a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f124149d;

                /* renamed from: e */
                public int f124150e;

                /* renamed from: f */
                public final /* synthetic */ C46037a f124151f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C46038a(C46037a aVar, C15601d dVar) {
                    super(dVar);
                    this.f124151f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f124149d = obj;
                    this.f124150e |= Integer.MIN_VALUE;
                    return this.f124151f.emit((Object) null, this);
                }
            }

            public C46037a(C45253g gVar) {
                this.f124148d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, wx3.C15601d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hf2.C46035f.C46036a.C46037a.C46038a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    hf2.f$a$a$a r0 = (hf2.C46035f.C46036a.C46037a.C46038a) r0
                    int r1 = r0.f124150e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f124150e = r1
                    goto L_0x0018
                L_0x0013:
                    hf2.f$a$a$a r0 = new hf2.f$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f124149d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f124150e
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L_0x004b
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    kotlin.ResultKt.throwOnFailure(r7)
                    d14.g r7 = r5.f124148d
                    r2 = r6
                    pb0.a r2 = (pb0.C47445a) r2
                    qb0.b r2 = r2.f128348a
                    qb0.b r4 = qb0.C47798b.OnEnd
                    if (r2 != r4) goto L_0x003f
                    r2 = 1
                    goto L_0x0040
                L_0x003f:
                    r2 = 0
                L_0x0040:
                    if (r2 == 0) goto L_0x004b
                    r0.f124150e = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    rx3.b0 r6 = rx3.C13598b0.f38549a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hf2.C46035f.C46036a.C46037a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        public C46036a(C45252f fVar) {
            this.f124147d = fVar;
        }

        /* renamed from: a */
        public Object mo31880a(C45253g gVar, C15601d dVar) {
            Object a = this.f124147d.mo31880a(new C46037a(gVar), dVar);
            return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
        }
    }

    /* renamed from: hf2.f$b */
    public static final class C46039b implements C45252f<C47445a<C50554nj2>> {

        /* renamed from: d */
        public final /* synthetic */ C45252f f124152d;

        /* renamed from: hf2.f$b$a */
        public static final class C46040a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C45253g f124153d;

            @C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingJsApiUIC$onCreate$$inlined$filter$2$2", mo125469f = "NewBizInfoSettingJsApiUIC.kt", mo125470l = {224}, mo125471m = "emit")
            /* renamed from: hf2.f$b$a$a */
            public static final class C46041a extends C66704d {

                /* renamed from: d */
                public /* synthetic */ Object f124154d;

                /* renamed from: e */
                public int f124155e;

                /* renamed from: f */
                public final /* synthetic */ C46040a f124156f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C46041a(C46040a aVar, C15601d dVar) {
                    super(dVar);
                    this.f124156f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f124154d = obj;
                    this.f124155e |= Integer.MIN_VALUE;
                    return this.f124156f.emit((Object) null, this);
                }
            }

            public C46040a(C45253g gVar) {
                this.f124153d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, wx3.C15601d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hf2.C46035f.C46039b.C46040a.C46041a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    hf2.f$b$a$a r0 = (hf2.C46035f.C46039b.C46040a.C46041a) r0
                    int r1 = r0.f124155e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f124155e = r1
                    goto L_0x0018
                L_0x0013:
                    hf2.f$b$a$a r0 = new hf2.f$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f124154d
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f124155e
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L_0x004b
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    kotlin.ResultKt.throwOnFailure(r7)
                    d14.g r7 = r5.f124153d
                    r2 = r6
                    pb0.a r2 = (pb0.C47445a) r2
                    qb0.b r2 = r2.f128348a
                    qb0.b r4 = qb0.C47798b.OnEnd
                    if (r2 != r4) goto L_0x003f
                    r2 = 1
                    goto L_0x0040
                L_0x003f:
                    r2 = 0
                L_0x0040:
                    if (r2 == 0) goto L_0x004b
                    r0.f124155e = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    rx3.b0 r6 = rx3.C13598b0.f38549a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hf2.C46035f.C46039b.C46040a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        public C46039b(C45252f fVar) {
            this.f124152d = fVar;
        }

        /* renamed from: a */
        public Object mo31880a(C45253g gVar, C15601d dVar) {
            Object a = this.f124152d.mo31880a(new C46040a(gVar), dVar);
            return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingJsApiUIC$onCreate$1", mo125469f = "NewBizInfoSettingJsApiUIC.kt", mo125470l = {84}, mo125471m = "invokeSuspend")
    /* renamed from: hf2.f$c */
    public static final class C46042c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f124157d;

        /* renamed from: e */
        public final /* synthetic */ C45252f<C47445a<C50273lj2>> f124158e;

        /* renamed from: f */
        public final /* synthetic */ C45252f<C47445a<C50554nj2>> f124159f;

        /* renamed from: g */
        public final /* synthetic */ C46035f f124160g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingJsApiUIC$onCreate$1$1", mo125469f = "NewBizInfoSettingJsApiUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: hf2.f$c$a */
        public static final class C46043a extends C91594j implements C32228q<C47445a<C50273lj2>, C47445a<C50554nj2>, C15601d<? super C13604l<? extends C47445a<C50273lj2>, ? extends C47445a<C50554nj2>>>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f124161d;

            /* renamed from: e */
            public /* synthetic */ Object f124162e;

            public C46043a(C15601d<? super C46043a> dVar) {
                super(3, dVar);
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C46043a aVar = new C46043a((C15601d) obj3);
                aVar.f124161d = (C47445a) obj;
                aVar.f124162e = (C47445a) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                return new C13604l((C47445a) this.f124161d, (C47445a) this.f124162e);
            }
        }

        /* renamed from: hf2.f$c$b */
        public static final class C46044b implements C45253g<C13604l<? extends C47445a<C50273lj2>, ? extends C47445a<C50554nj2>>> {

            /* renamed from: d */
            public final /* synthetic */ C46035f f124163d;

            public C46044b(C46035f fVar) {
                this.f124163d = fVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C13604l lVar = (C13604l) obj;
                C47445a aVar = (C47445a) lVar.f38555d;
                C50273lj2 lj22 = (aVar.f128349b == 0 && aVar.f128350c == 0) ? (C50273lj2) aVar.f128353f : null;
                C47445a aVar2 = (C47445a) lVar.f38556e;
                C50554nj2 nj22 = (aVar2.f128349b == 0 && aVar2.f128350c == 0) ? (C50554nj2) aVar2.f128353f : null;
                C53896h0 h0Var = C53872d1.f151117a;
                Object g = C53895h.m60469g(C58901s.f168555a, new C46046g(nj22, lj22, this.f124163d, (C15601d<? super C46046g>) null), dVar);
                return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46042c(C45252f<C47445a<C50273lj2>> fVar, C45252f<C47445a<C50554nj2>> fVar2, C46035f fVar3, C15601d<? super C46042c> dVar) {
            super(2, dVar);
            this.f124158e = fVar;
            this.f124159f = fVar2;
            this.f124160g = fVar3;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C46042c(this.f124158e, this.f124159f, this.f124160g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C46042c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f124157d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C47445a<C50273lj2>> fVar = this.f124158e;
                C45252f<C47445a<C50554nj2>> fVar2 = this.f124159f;
                C46043a aVar2 = new C46043a((C15601d<? super C46043a>) null);
                C46044b bVar = new C46044b(this.f124160g);
                this.f124157d = 1;
                Object a = C58499p.m67934a(bVar, new C45252f[]{fVar, fVar2}, C45256s0.f122599d, new C45255r0(aVar2, (C15601d<? super C45255r0>) null), this);
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a == aVar) {
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

    /* renamed from: hf2.f$d */
    public static final class C46045d extends C87413o implements C32224a<NewBizInfoSettingUI> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f124164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46045d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f124164d = appCompatActivity;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f124164d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI");
            return (NewBizInfoSettingUI) appCompatActivity;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46035f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f124145h = C36568h.m40985a(new C46045d(appCompatActivity));
    }

    /* renamed from: c3 */
    public final NewBizInfoSettingUI mo71467c3() {
        return (NewBizInfoSettingUI) ((C36570n) this.f124145h).getValue();
    }

    /* renamed from: d3 */
    public final void mo71468d3(boolean z, C47511g gVar) {
        if (z) {
            Preference preference = new Preference(getContext());
            preference.f121290w = false;
            preference.mo26273A("preference_key_tip");
            preference.f121271G = C0966R.C0971layout.f6386df;
            String string = getContext().getResources().getString(C0966R.string.bkj);
            C87412m.m108593f(string, "context.resources.getStr…jsapi_bizinfo_no_any_use)");
            String format = String.format(string, Arrays.copyOf(new Object[]{this.f124142e}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            preference.mo69924H(format);
            if (gVar != null) {
                gVar.mo72531o("preference_key_tip");
            }
            if (gVar != null) {
                gVar.mo72527k(preference);
            }
            if (gVar != null) {
                gVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (gVar != null) {
            gVar.mo72531o("preference_key_tip");
        }
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66790k2(pj3.C47511g r11, com.tencent.p014mm.p136ui.base.preference.Preference r12) {
        /*
            r10 = this;
            te3.lj2 r11 = f124140j
            r0 = 1
            r1 = 0
            r2 = 0
            if (r11 == 0) goto L_0x0030
            java.util.LinkedList<te3.x7> r11 = r11.f137458e
            if (r11 == 0) goto L_0x0030
            if (r12 == 0) goto L_0x0010
            java.lang.String r3 = r12.f121285r
            goto L_0x0011
        L_0x0010:
            r3 = r2
        L_0x0011:
            java.util.Iterator r11 = r11.iterator()
            r4 = 0
        L_0x0016:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r11.next()
            te3.x7 r5 = (te3.C51933x7) r5
            java.lang.String r5 = r5.f144498d
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0016
            r4 = 1
            goto L_0x0016
        L_0x002c:
            if (r4 != r0) goto L_0x0030
            r11 = 1
            goto L_0x0031
        L_0x0030:
            r11 = 0
        L_0x0031:
            r3 = 2
            if (r11 == 0) goto L_0x0083
            boolean r11 = r12 instanceof com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference
            if (r11 == 0) goto L_0x0083
            r11 = r12
            com.tencent.mm.ui.base.preference.CheckBoxPreference r11 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r11
            boolean r11 = r11.mo6804J()
            if (r11 == 0) goto L_0x0043
            r9 = 1
            goto L_0x0044
        L_0x0043:
            r9 = 2
        L_0x0044:
            if (r12 == 0) goto L_0x00dd
            boolean r11 = r12 instanceof com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference
            if (r11 != 0) goto L_0x004c
            goto L_0x00dd
        L_0x004c:
            gy3.a0 r11 = new gy3.a0
            r11.<init>()
            r0 = r12
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            boolean r2 = r0.mo6804J()
            zt3.t r3 = zt3.C119157j.f356862d
            hf2.d r4 = new hf2.d
            r4.<init>(r11, r10)
            r5 = 800(0x320, double:3.953E-321)
            zt3.j r3 = (zt3.C119157j) r3
            r3.getClass()
            r3.mo183892w(r4, r5, r1)
            t83.c$a r1 = new t83.c$a
            r5 = 2
            java.lang.String r6 = r10.f124144g
            java.lang.String r8 = r0.f121285r
            java.lang.String r7 = ""
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            nr3.e r0 = r1.mo9225i()
            hf2.e r1 = new hf2.e
            r1.<init>(r11, r10, r12, r2)
            r0.mo123420E(r1)
            goto L_0x00dd
        L_0x0083:
            if (r12 == 0) goto L_0x0088
            java.lang.String r11 = r12.f121285r
            goto L_0x0089
        L_0x0088:
            r11 = r2
        L_0x0089:
            java.lang.String r0 = "NewBizInfoAuthMainUI"
            boolean r11 = z04.C112551y.m153810j(r11, r0, r1, r3, r2)
            java.lang.String r0 = "Contact_User"
            if (r11 == 0) goto L_0x00bc
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            java.lang.String r12 = r10.f124143f
            r11.putExtra(r0, r12)
            java.lang.String r12 = r10.f124142e
            java.lang.String r0 = "Contact_Nick"
            r11.putExtra(r0, r12)
            java.lang.String r12 = r10.f124144g
            java.lang.String r0 = "key_add_contact_openim_appid"
            r11.putExtra(r0, r12)
            java.lang.String r12 = "NewBizInfoSettingJsApiUIC"
            java.lang.String r0 = "go to JSAPI Auth UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            android.app.Activity r12 = r10.getContext()
            java.lang.String r0 = "com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI"
            ke3.C88144b.m109801s(r12, r0, r11, r2)
            goto L_0x00dd
        L_0x00bc:
            if (r12 == 0) goto L_0x00c1
            java.lang.String r11 = r12.f121285r
            goto L_0x00c2
        L_0x00c1:
            r11 = r2
        L_0x00c2:
            java.lang.String r12 = "NewBizInfoRecordUI"
            boolean r11 = z04.C112551y.m153810j(r11, r12, r1, r3, r2)
            if (r11 == 0) goto L_0x00dd
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            java.lang.String r12 = r10.f124143f
            r11.putExtra(r0, r12)
            android.app.Activity r12 = r10.getContext()
            java.lang.String r0 = "com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI"
            ke3.C88144b.m109801s(r12, r0, r11, r2)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.C46035f.mo66790k2(pj3.g, com.tencent.mm.ui.base.preference.Preference):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("NewBizInfoSettingJsApiUIC", "create");
        if (!mo71467c3().f115447e.mo62927s3()) {
            mo71467c3().f115446d.removeAll();
        }
        if (mo71467c3().f115448f != null && !C77702q0.m93719b(mo71467c3().f115448f.field_appId)) {
            this.f124144g = mo71467c3().f115448f.field_appId;
        }
        this.f124143f = getIntent().getStringExtra("Contact_User");
        String stringExtra = getIntent().getStringExtra("Contact_Nick");
        this.f124142e = stringExtra;
        if (stringExtra == null) {
            this.f124142e = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f124143f);
        }
        String str = this.f124143f;
        C50138kj2 kj22 = new C50138kj2();
        kj22.f136820d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = kj22;
        bVar.f127067b = new C50273lj2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-getalluseuserinfo";
        bVar.f127069d = 4975;
        C46036a aVar = new C46036a(C47446b.f127269a.mo72464a(bVar.mo72403a()));
        String str2 = this.f124143f;
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        C50412mj2 mj22 = new C50412mj2();
        mj22.f138070d = str2;
        mj22.f138071e = currentTimeMillis;
        mj22.f138072f = 10;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = mj22;
        bVar2.f127067b = new C50554nj2();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/jsapi-getbizuseuserinforecordlist";
        bVar2.f127069d = 1850;
        C46039b bVar3 = new C46039b(C47446b.f127269a.mo72464a(bVar2.mo72403a()));
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C65946a.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…ycleScopeUIC::class.java)");
        LifecycleScope.launchDefault$default(((C65946a) a).mo89983c3(), (C53934p0) null, new C46042c(aVar, bVar3, this, (C15601d<? super C46042c>) null), 1, (Object) null);
    }

    public void onFinished() {
        super.onFinished();
        Log.m105924i("NewBizInfoSettingJsApiUIC", "finish");
        f124140j = null;
    }
}
