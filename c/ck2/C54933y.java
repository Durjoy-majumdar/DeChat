package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.plugin.ringtone.widget.RingtoneAuthorLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d03.C58010a;
import d14.C45253g;
import d14.C58050i1;
import d14.C58052j1;
import di3.C86312j;
import dk2.C58318a;
import eb0.C75592q0;
import ek2.C58615a;
import ek2.C58618b;
import ek2.C58619c;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import nj2.C61759g;
import nj2.C61768p;
import p145dx.C7522l;
import qc0.C101093a;
import qo3.C89779i0;
import r13.C63358c;
import rc0.C63389c;
import rj2.C63449b;
import rj2.C63451c;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sj2.C63924f;
import sj2.C63935h;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import xj2.C66286a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ck2.y */
public final class C54933y extends UIComponent {

    /* renamed from: d */
    public C58615a f153960d;

    /* renamed from: e */
    public boolean f153961e;

    /* renamed from: f */
    public final C13601g f153962f = C36568h.m40985a(C54940e.f153971d);

    /* renamed from: ck2.y$a */
    public static final class C54934a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C54933y f153963d;

        /* renamed from: ck2.y$a$a */
        public /* synthetic */ class C54935a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f153964a;

            static {
                int[] iArr = new int[C58619c.C58620a.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                f153964a = iArr;
            }
        }

        public C54934a(C54933y yVar) {
            this.f153963d = yVar;
        }

        public void onChanged(Object obj) {
            C66132f fVar;
            int i;
            C58619c.C58620a aVar = (C58619c.C58620a) obj;
            Class cls = C54914j0.class;
            Class cls2 = C54925s.class;
            int i2 = aVar == null ? -1 : C54935a.f153964a[aVar.ordinal()];
            boolean z = false;
            if (i2 == 1) {
                C39818r rVar = C39818r.f106831a;
                C66132f value = ((C54925s) rVar.mo62444c(this.f153963d.getActivity()).mo75002a(cls2)).f153942d.getValue();
                if (value != null) {
                    C54933y yVar = this.f153963d;
                    if (value.f190078a == null) {
                        C66132f f = C61768p.m72478f();
                        value.f190078a = f.f190078a;
                        fVar = f;
                    } else {
                        fVar = value;
                    }
                    C58010a aVar2 = fVar.f190078a;
                    if (aVar2 != null) {
                        aVar2.f165940l = false;
                    }
                    if (yVar.f153961e) {
                        if (C58318a.f166995b) {
                            C101093a.m132486h();
                            ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
                        }
                        C58318a.f166995b = false;
                        i = 1;
                    } else {
                        i = C58318a.f166994a.mo83069a();
                        if (i == 0) {
                            return;
                        }
                    }
                    yVar.f153961e = !yVar.f153961e;
                    ((C119157j) C119157j.f356862d).mo183895z(new C54931w(yVar));
                    if (yVar.f153961e) {
                        ((C54914j0) rVar.mo62444c(yVar.getActivity()).mo75002a(cls)).mo75845e3(fVar, (String) null, (fVar.f190095r == null || fVar.mo90178i().f170150b == null || !C63358c.m74700b(fVar.mo90178i())) ? false : true);
                    }
                    if (i != 2) {
                        C39622i0 a = rVar.mo62444c(yVar.getActivity()).mo75002a(C54883d0.class);
                        C87412m.m108593f(a, "UICProvider.of(activity)…gtonePlayUIC::class.java)");
                        C54883d0 d0Var = (C54883d0) a;
                        long hashCode = (long) C75592q0.m90789s().hashCode();
                        boolean z2 = yVar.f153961e;
                        boolean z3 = !fVar.mo90179j();
                        C58010a aVar3 = fVar.f190078a;
                        d0Var.mo75824c3(fVar, hashCode, z2, z3, aVar3 != null ? aVar3.f165940l : false);
                        return;
                    }
                    C119179t tVar = C119157j.f356862d;
                    C54932x xVar = new C54932x(yVar);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(xVar, 200, false);
                }
            } else if (i2 == 2) {
                C39818r rVar2 = C39818r.f106831a;
                int i3 = ((RingtoneDataUIC) rVar2.mo62444c(this.f153963d.getActivity()).mo75002a(RingtoneDataUIC.class)).f164072e;
                C61759g.C61760a aVar4 = C61759g.f175551f;
                AppCompatActivity activity = this.f153963d.getActivity();
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                C61759g.C61760a.m72462b(aVar4, activity, 1, s, i3, false, (C66132f) null, 48, (Object) null);
                C66132f value2 = ((C54925s) rVar2.mo62444c(this.f153963d.getActivity()).mo75002a(cls2)).f153942d.getValue();
                if (value2 != null) {
                    C54933y yVar2 = this.f153963d;
                    if (!(value2.f190095r == null || value2.mo90178i().f170150b == null || !C63358c.m74700b(value2.mo90178i()))) {
                        z = true;
                    }
                    ((C54914j0) rVar2.mo62444c(yVar2.getActivity()).mo75002a(cls)).mo75846f3(value2, (String) null, z);
                }
            } else if (i2 == 3) {
                C39818r rVar3 = C39818r.f106831a;
                C54925s sVar = (C54925s) rVar3.mo62444c(this.f153963d.getActivity()).mo75002a(cls2);
                C89779i0 e = C89779i0.m112248e(sVar.getContext(), sVar.getContext().getResources().getString(C0966R.string.in7), false, 3, (DialogInterface.OnCancelListener) null);
                e.show();
                C53895h.m60466d(sVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54929v(sVar, e, (C15601d<? super C54929v>) null), 3, (Object) null);
                ((C54914j0) rVar3.mo62444c(this.f153963d.getActivity()).mo75002a(cls)).getClass();
                C66286a.m78216c(6, "", 3, (String) null, false, false, 56, (Object) null);
            }
        }
    }

    /* renamed from: ck2.y$b */
    public static final class C54936b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C54933y f153965d;

        public C54936b(C54933y yVar) {
            this.f153965d = yVar;
        }

        public void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            C66132f fVar = (C66132f) obj;
            long j = fVar.f190092o;
            if (j > 0) {
                C63449b.m74792c(j, fVar);
            }
            C58615a aVar = this.f153965d.f153960d;
            if (aVar != null) {
                if (fVar.f190091n) {
                    TextView textView = aVar.f167824b;
                    if (textView != null) {
                        textView.setText(aVar.f167829g.getString(C0966R.string.i5_));
                    }
                    TextView textView2 = aVar.f167824b;
                    if (textView2 != null) {
                        textView2.setTextColor(C76577a.m92153d(aVar.f167829g, C0966R.color.FG_4));
                    }
                    MMAnimateView mMAnimateView = aVar.f167825c;
                    if (mMAnimateView != null) {
                        Context context = aVar.f167829g;
                        C87412m.m108594g(context, "context");
                        int d = C76577a.m92153d(context, C0966R.color.a_e);
                        Drawable mutate = C76577a.m92158i(context, C0966R.raw.icons_filled_error).mutate();
                        C87412m.m108593f(mutate, "getDrawable(context, drawableRes).mutate()");
                        mutate.setColorFilter(new PorterDuffColorFilter(Color.argb(Color.alpha(d), Color.red(d), Color.green(d), Color.blue(d)), PorterDuff.Mode.SRC_ATOP));
                        mutate.setAlpha(Color.alpha(d));
                        mMAnimateView.setImageDrawable(mutate);
                    }
                } else {
                    C66132f fVar2 = aVar.f167830h;
                    if (C87412m.m108589b(fVar2 != null ? fVar2.mo90174e() : null, fVar.mo90174e())) {
                        Log.m105924i("MicroMsg.CommonRingtoneLayout", "hashCode is same:" + fVar.mo90174e() + ", skip bind!");
                        return;
                    }
                    TextView textView3 = aVar.f167824b;
                    if (textView3 != null) {
                        textView3.setText(fVar.f190086i);
                    }
                    RingtoneAuthorLayout ringtoneAuthorLayout = aVar.f167828f;
                    if (ringtoneAuthorLayout != null) {
                        ((C7522l) C86312j.m106911c(C7522l.class)).mo8645FD(ringtoneAuthorLayout, fVar);
                    }
                    int i = 80;
                    int b = C76577a.m92151b(aVar.f167829g, fVar.mo90179j() ? 202 : 80);
                    Context context2 = aVar.f167829g;
                    if (fVar.mo90179j()) {
                        i = 266;
                    }
                    int b2 = C76577a.m92151b(context2, i);
                    ImageView imageView = aVar.f167826d;
                    if (!(imageView == null || (layoutParams2 = imageView.getLayoutParams()) == null)) {
                        layoutParams2.width = b;
                        layoutParams2.height = b2;
                        ImageView imageView2 = aVar.f167826d;
                        if (imageView2 != null) {
                            imageView2.setLayoutParams(layoutParams2);
                        }
                    }
                    int i2 = fVar.mo90179j() ? C0966R.dimen.f3755d6 : C0966R.dimen.f3749d0;
                    MMAnimateView mMAnimateView2 = aVar.f167825c;
                    if (!(mMAnimateView2 == null || (layoutParams = mMAnimateView2.getLayoutParams()) == null)) {
                        layoutParams.width = C76577a.m92157h(aVar.f167829g, i2);
                        layoutParams.height = C76577a.m92157h(aVar.f167829g, i2);
                        MMAnimateView mMAnimateView3 = aVar.f167825c;
                        if (mMAnimateView3 != null) {
                            mMAnimateView3.setLayoutParams(layoutParams);
                        }
                    }
                    MMAnimateView mMAnimateView4 = aVar.f167825c;
                    if (mMAnimateView4 != null) {
                        Context context3 = aVar.f167829g;
                        C87412m.m108594g(context3, "context");
                        int d2 = C76577a.m92153d(context3, C0966R.color.al6);
                        Drawable mutate2 = C76577a.m92158i(context3, C0966R.raw.icons_outlined_play2).mutate();
                        C87412m.m108593f(mutate2, "getDrawable(context, drawableRes).mutate()");
                        mutate2.setColorFilter(new PorterDuffColorFilter(Color.argb(Color.alpha(d2), Color.red(d2), Color.green(d2), Color.blue(d2)), PorterDuff.Mode.SRC_ATOP));
                        mutate2.setAlpha(Color.alpha(d2));
                        mMAnimateView4.setImageDrawable(mutate2);
                    }
                    if (fVar.f190088k.length() > 0) {
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).aa0(fVar.f190088k, aVar.f167826d, fVar.mo90174e());
                    } else {
                        ImageView imageView3 = aVar.f167826d;
                        if (imageView3 != null) {
                            imageView3.setImageResource(C0966R.C0969drawable.ap_);
                        }
                    }
                    aVar.f167823a.setOnClickListener(new C58618b(aVar, fVar));
                }
                if (!C87412m.m108589b(fVar.mo90176g(), "voip_default_sound")) {
                    View view = aVar.f167833k;
                    if (view != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    View view3 = aVar.f167833k;
                    if (view3 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout", "refreshCommonRingBackInfo", "(Lcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                aVar.f167830h = fVar;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalMainUIC$onCreateAfter$1", mo125469f = "RingtoneGlobalMainUIC.kt", mo125470l = {110}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.y$c */
    public static final class C54937c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153966d;

        /* renamed from: e */
        public final /* synthetic */ C54933y f153967e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54937c(C54933y yVar, C15601d<? super C54937c> dVar) {
            super(2, dVar);
            this.f153967e = yVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54937c(this.f153967e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54937c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153966d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C54933y yVar = this.f153967e;
                yVar.getClass();
                int i2 = ((RingtoneDataUIC) C39818r.f106831a.mo62444c(yVar.getActivity()).mo75002a(RingtoneDataUIC.class)).f164074g;
                this.f153966d = 1;
                if (((C63935h) ((C36570n) this.f153967e.f153962f).getValue()).mo13066a(i2, true, true, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneGlobalMainUIC$onResume$1", mo125469f = "RingtoneGlobalMainUIC.kt", mo125470l = {126}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.y$d */
    public static final class C54938d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153968d;

        /* renamed from: e */
        public final /* synthetic */ C54933y f153969e;

        /* renamed from: ck2.y$d$a */
        public static final class C54939a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C54933y f153970d;

            public C54939a(C54933y yVar) {
                this.f153970d = yVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                C63451c.C63452a.C63453a aVar = (C63451c.C63452a.C63453a) obj;
                int i = aVar.f179989b;
                if (i != 1) {
                    if (i == 2) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C54874a0(aVar, this.f153970d));
                    } else if (i == 3 && aVar.f179988a == ((long) C75592q0.m90789s().hashCode())) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C54877b0(this.f153970d));
                        if (C58318a.f166995b) {
                            C101093a.m132486h();
                            ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
                        }
                        C58318a.f166995b = false;
                    }
                } else if (aVar.f179988a != ((long) C75592q0.m90789s().hashCode())) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C54941z(this.f153970d));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54938d(C54933y yVar, C15601d<? super C54938d> dVar) {
            super(2, dVar);
            this.f153969e = yVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54938d(this.f153969e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54938d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C58050i1<C63451c.C63452a.C63453a> i1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153968d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C63451c cVar = ((C54883d0) C39818r.f106831a.mo62444c(this.f153969e.getActivity()).mo75002a(C54883d0.class)).f153833d;
                if (cVar == null || (i1Var = cVar.f179977f) == null) {
                    return C13598b0.f38549a;
                }
                C54939a aVar2 = new C54939a(this.f153969e);
                this.f153968d = 1;
                if (((C58052j1) i1Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* renamed from: ck2.y$e */
    public static final class C54940e extends C87413o implements C32224a<C63935h> {

        /* renamed from: d */
        public static final C54940e f153971d = new C54940e();

        public C54940e() {
            super(0);
        }

        public Object invoke() {
            C63924f a = C63924f.f181198b.mo88701a(1);
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.ringtone.flow.RingtoneSelectDataLoader");
            return (C63935h) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54933y(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.bkh);
        C87412m.m108593f(findViewById, "findViewById(R.id.common_ringtone_layout)");
        C58615a aVar = new C58615a(findViewById);
        this.f153960d = aVar;
        C54219z<C58619c.C58620a> zVar = aVar.f167831i;
        if (zVar != null) {
            zVar.observe(getActivity(), new C54934a(this));
        }
        ((C54925s) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54925s.class)).f153942d.observe(getActivity(), new C54936b(this));
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54937c(this, (C15601d<? super C54937c>) null), 3, (Object) null);
    }

    public void onDestroy() {
        ((C63935h) ((C36570n) this.f153962f).getValue()).mo88700c(1);
        if (C58318a.f166995b) {
            C101093a.m132486h();
            ((C63389c) C86312j.m106911c(C63389c.class)).mo88298vr();
        }
        C58318a.f166995b = false;
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54938d(this, (C15601d<? super C54938d>) null), 3, (Object) null);
        C58615a aVar = this.f153960d;
        if (aVar != null) {
            aVar.mo83501b(false);
        }
    }
}
