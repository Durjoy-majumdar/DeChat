package mo1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import com.google.android.gms.common.Scopes;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C75592q0;
import er1.C58784w3;
import er1.C7827l3;
import er1.C7919x;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60200t1;
import ht1.C8794p5;
import ht1.C8808v4;
import it1.C9247b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76912y0;
import org.json.JSONObject;
import p629ny.C76979h;
import rs1.C13317l7;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50542nh0;
import te3.C64553md1;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: mo1.q */
public final class C11025q extends C11059w {

    /* renamed from: A */
    public final C11038m f32750A = new C11038m(this);

    /* renamed from: B */
    public boolean f32751B;

    /* renamed from: C */
    public C32224a<C13598b0> f32752C;

    /* renamed from: D */
    public boolean f32753D;

    /* renamed from: e */
    public final C13601g f32754e = C36568h.m40985a(new C11039n(this));

    /* renamed from: f */
    public final C13601g f32755f = C36568h.m40985a(new C11026a(this));

    /* renamed from: g */
    public final C13601g f32756g = C36568h.m40985a(new C11040o(this));

    /* renamed from: h */
    public C9247b f32757h;

    /* renamed from: i */
    public boolean f32758i;

    /* renamed from: j */
    public boolean f32759j;

    /* renamed from: n */
    public final C13601g f32760n = C36568h.m40985a(new C11028c(this));

    /* renamed from: o */
    public final C13601g f32761o = C36568h.m40985a(new C11030e(this));

    /* renamed from: p */
    public final C13601g f32762p = C36568h.m40985a(new C11029d(this));

    /* renamed from: q */
    public final C13601g f32763q = C36568h.m40985a(new C11031f(this));

    /* renamed from: r */
    public boolean f32764r;

    /* renamed from: s */
    public RecyclerView f32765s;

    /* renamed from: t */
    public boolean f32766t;

    /* renamed from: u */
    public int f32767u = -1;

    /* renamed from: v */
    public int f32768v = -1;

    /* renamed from: w */
    public boolean f32769w;

    /* renamed from: x */
    public boolean f32770x;

    /* renamed from: y */
    public final C13601g f32771y = C36568h.m40985a(new C11027b(this));

    /* renamed from: z */
    public final C13601g f32772z = C36568h.m40985a(new C11041p(this));

    /* renamed from: mo1.q$a */
    public static final class C11026a extends C87413o implements C32224a<CheckBox> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11026a(C11025q qVar) {
            super(0);
            this.f32773d = qVar;
        }

        public Object invoke() {
            return (CheckBox) this.f32773d.getActivity().findViewById(C0966R.C0970id.cde);
        }
    }

    /* renamed from: mo1.q$b */
    public static final class C11027b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11027b(C11025q qVar) {
            super(0);
            this.f32774d = qVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f32774d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: mo1.q$c */
    public static final class C11028c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11028c(C11025q qVar) {
            super(0);
            this.f32775d = qVar;
        }

        public Object invoke() {
            return this.f32775d.getActivity().findViewById(C0966R.C0970id.e5v);
        }
    }

    /* renamed from: mo1.q$d */
    public static final class C11029d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11029d(C11025q qVar) {
            super(0);
            this.f32776d = qVar;
        }

        public Object invoke() {
            return this.f32776d.getActivity().findViewById(C0966R.C0970id.ff5);
        }
    }

    /* renamed from: mo1.q$e */
    public static final class C11030e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11030e(C11025q qVar) {
            super(0);
            this.f32777d = qVar;
        }

        public Object invoke() {
            return this.f32777d.getActivity().findViewById(C0966R.C0970id.ff6);
        }
    }

    /* renamed from: mo1.q$f */
    public static final class C11031f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11031f(C11025q qVar) {
            super(0);
            this.f32778d = qVar;
        }

        public Object invoke() {
            return (TextView) this.f32778d.getActivity().findViewById(C0966R.C0970id.mep);
        }
    }

    /* renamed from: mo1.q$g */
    public static final class C11032g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32779d;

        public C11032g(C11025q qVar) {
            this.f32779d = qVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32779d.mo11179g3().toggle();
            C11025q.m10964c3(this.f32779d);
            this.f32779d.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.q$h */
    public static final class C11033h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32780d;

        public C11033h(C11025q qVar) {
            this.f32780d = qVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11025q.m10964c3(this.f32780d);
            this.f32780d.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.q$i */
    public static final class C11034i extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11034i(C11025q qVar) {
            super(1);
            this.f32781d = qVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", C75592q0.m90789s());
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
            C88144b.m109791i(this.f32781d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            C11025q.m10965k3(this.f32781d, "to_profile", 0, (String) null, 0, (String) null, 30, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mo1.q$j */
    public static final class C11035j implements C4191v0.C4192a {

        /* renamed from: a */
        public final /* synthetic */ C11025q f32782a;

        public C11035j(C11025q qVar) {
            this.f32782a = qVar;
        }

        public final void onDismiss() {
            C11025q qVar = this.f32782a;
            if (!qVar.f32759j) {
                C11025q.m10965k3(qVar, "cancel", 0, (String) null, 0, (String) null, 30, (Object) null);
            }
        }
    }

    /* renamed from: mo1.q$k */
    public static final class C11036k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32783d;

        /* renamed from: e */
        public final /* synthetic */ C4191v0 f32784e;

        public C11036k(C11025q qVar, C4191v0 v0Var) {
            this.f32783d = qVar;
            this.f32784e = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11025q.m10965k3(this.f32783d, "set", 0, (String) null, 0, (String) null, 30, (Object) null);
            C11025q qVar = this.f32783d;
            qVar.f32759j = true;
            qVar.mo11179g3().setChecked(true);
            this.f32783d.mo11178f3(true);
            this.f32784e.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.q$l */
    public static final class C11037l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4191v0 f32785d;

        public C11037l(C4191v0 v0Var) {
            this.f32785d = v0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$3$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32785d.mo5072g();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onCreateAfter$3$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.q$m */
    public static final class C11038m implements C8794p5<C64553md1> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32786d;

        public C11038m(C11025q qVar) {
            this.f32786d = qVar;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C64553md1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            Log.m105924i(C54492n.TAG, "profileSettingCallback, " + nh02.f138603e);
            if (nh02.f138603e != 0) {
                this.f32786d.mo11179g3().setChecked(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8929h());
                C76912y0.makeText((Context) this.f32786d.getActivity(), (CharSequence) this.f32786d.getString(C0966R.string.et6), 0).show();
            }
            C9247b bVar = this.f32786d.f32757h;
            if (bVar != null) {
                bVar.mo8913b();
            }
        }
    }

    /* renamed from: mo1.q$n */
    public static final class C11039n extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11039n(C11025q qVar) {
            super(0);
            this.f32787d = qVar;
        }

        public Object invoke() {
            return this.f32787d.getActivity().findViewById(C0966R.C0970id.cdd);
        }
    }

    /* renamed from: mo1.q$o */
    public static final class C11040o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11040o(C11025q qVar) {
            super(0);
            this.f32788d = qVar;
        }

        public Object invoke() {
            return (TextView) this.f32788d.getActivity().findViewById(C0966R.C0970id.cdf);
        }
    }

    /* renamed from: mo1.q$p */
    public static final class C11041p extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C11025q f32789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11041p(C11025q qVar) {
            super(0);
            this.f32789d = qVar;
        }

        public Object invoke() {
            return this.f32789d.getActivity().getIntent().getStringExtra("finder_username");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11025q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m10964c3(C11025q qVar) {
        qVar.getClass();
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, qVar.getActivity(), 13, 1, false, 0, 0, (String) null, 120, (Object) null);
        boolean isChecked = qVar.mo11179g3().isChecked();
        if (isChecked != C58784w3.f168295a.mo83904U0()) {
            qVar.mo11178f3(isChecked);
        }
    }

    /* renamed from: k3 */
    public static /* synthetic */ void m10965k3(C11025q qVar, String str, int i, String str2, int i2, String str3, int i3, Object obj) {
        qVar.mo11182j3(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 78 : i2, (i3 & 16) != 0 ? "" : str3);
    }

    /* renamed from: d3 */
    public final void mo11176d3() {
        mo11180i3();
        if (mo11180i3().getVisibility() == 0) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) mo11180i3().getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            translateAnimation.setInterpolator(AnimationUtils.loadInterpolator(getContext(), 17432581));
            mo11180i3().startAnimation(translateAnimation);
            View i3 = mo11180i3();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = i3;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "btnGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "btnGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e3 */
    public final void mo11177e3() {
        int i;
        if (this.f32766t && (i = this.f32767u) != -1 && this.f32751B) {
            int i2 = this.f32768v;
            if (i2 != -1 || this.f32770x) {
                RecyclerView recyclerView = this.f32765s;
                AppBarLayout.Behavior behavior = null;
                if (recyclerView == null) {
                    C87412m.m108603p("recyclerView");
                    throw null;
                } else if (i2 == -2) {
                    this.f32769w = true;
                    Object value = ((C36570n) this.f32761o).getValue();
                    C87412m.m108593f(value, "<get-justWatchedLoading>(...)");
                    if (((View) value).getVisibility() == 0) {
                        Object value2 = ((C36570n) this.f32761o).getValue();
                        C87412m.m108593f(value2, "<get-justWatchedLoading>(...)");
                        View view = (View) value2;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "endLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "endLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        Object value3 = ((C36570n) this.f32762p).getValue();
                        C87412m.m108593f(value3, "<get-justWatchedLittleIcon1>(...)");
                        View view3 = (View) value3;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "endLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "endLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    mo11176d3();
                } else if (i2 < 0 || i2 >= 3) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    if (i > ((GridLayoutManager) layoutManager).f44669w + i2 && i2 != -1) {
                        this.f32769w = true;
                    }
                    if (this.f32769w) {
                        mo11176d3();
                    } else if (i < 0 && !this.f32753D) {
                        mo11176d3();
                    } else if (i2 != -1 || this.f32770x || this.f32753D) {
                        if (mo11180i3().getVisibility() == 4) {
                            this.f32764r = true;
                            View i3 = mo11180i3();
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view5 = i3;
                            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "jumpToJustWatched", "(IILandroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "jumpToJustWatched", "(IILandroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            TranslateAnimation translateAnimation = new TranslateAnimation((float) mo11180i3().getWidth(), 0.0f, 0.0f, 0.0f);
                            translateAnimation.setDuration(300);
                            translateAnimation.setInterpolator(AnimationUtils.loadInterpolator(getContext(), 17432581));
                            mo11180i3().startAnimation(translateAnimation);
                            mo11183l3("channel_profile_recentviewed", 0, 1);
                        }
                        if (this.f32753D && i2 != -1) {
                            this.f32769w = true;
                            mo11176d3();
                            int dimension = (int) recyclerView.getContext().getResources().getDimension(C0966R.dimen.f3705bx);
                            AppBarLayout appBarLayout = (AppBarLayout) ((C36570n) ((C10943a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C10943a.class)).f32633o).getValue();
                            C87412m.m108593f(appBarLayout, "UICProvider.of(activity)…:class.java).appBarLayout");
                            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
                            CoordinatorLayout.C103717e eVar = layoutParams instanceof CoordinatorLayout.C103717e ? (CoordinatorLayout.C103717e) layoutParams : null;
                            CoordinatorLayout.Behavior behavior2 = eVar != null ? eVar.f306328a : null;
                            if (behavior2 instanceof AppBarLayout.Behavior) {
                                behavior = (AppBarLayout.Behavior) behavior2;
                            }
                            if (behavior != null) {
                                behavior.mo146260y(appBarLayout.getHeight() * -1);
                            }
                            recyclerView.postDelayed(new C11049s(recyclerView, i2, dimension), 200);
                            mo11183l3("channel_profile_recentviewed", 1, 1);
                        }
                        if (this.f32770x && i2 == -1 && !this.f32753D && !mo11180i3().hasOnClickListeners()) {
                            mo11180i3().setOnClickListener(new C11051t(this));
                        }
                        if (!this.f32753D && i2 != -1) {
                            mo11180i3().setOnClickListener(new C11054u(this, recyclerView, i2));
                        }
                    } else {
                        mo11176d3();
                    }
                }
            }
        }
    }

    /* renamed from: f3 */
    public final void mo11178f3(boolean z) {
        Log.m105924i(C54492n.TAG, "change isShowAtWxProfile, now:" + z);
        C9247b bVar = this.f32757h;
        if (bVar != null) {
            bVar.mo8913b();
        }
        C9247b a = C9247b.C9248a.m8889a(C9247b.f28989d, getContext(), getContext().getString(C0966R.string.a4d), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        this.f32757h = a;
        a.begin();
        ((C3605p1) C86312j.m106911c(C3605p1.class)).mo3985kH(z, this.f32750A);
    }

    /* renamed from: g3 */
    public final CheckBox mo11179g3() {
        return (CheckBox) this.f32755f.getValue();
    }

    /* renamed from: i3 */
    public final View mo11180i3() {
        Object value = this.f32760n.getValue();
        C87412m.m108593f(value, "<get-justWatchedLayout>(...)");
        return (View) value;
    }

    public final boolean isSelf() {
        return C87412m.m108589b((String) ((C36570n) this.f32772z).getValue(), C66785b.f191882e.mo90662O5());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r3.put("draftid", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r3.put("feedid", r9);
        r3.put("songid", r11);
     */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11182j3(java.lang.String r7, int r8, java.lang.String r9, int r10, java.lang.String r11) {
        /*
            r6 = this;
            java.lang.String r0 = "eid"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "feedId"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "songId"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.Class<h81.i> r0 = h81.C59774i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.i r0 = (h81.C59774i) r0
            java.lang.String r0 = r0.mo84751Wb()
            androidx.appcompat.app.AppCompatActivity r1 = r6.getActivity()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "key_context_id"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = ""
        L_0x002e:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            int r4 = r7.hashCode()     // Catch:{ all -> 0x008a }
            switch(r4) {
                case -780512022: goto L_0x0076;
                case -780114674: goto L_0x006d;
                case 3497: goto L_0x0064;
                case 95844769: goto L_0x0055;
                case 745112204: goto L_0x004c;
                case 1298526356: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x008a }
        L_0x0042:
            goto L_0x008a
        L_0x0043:
            java.lang.String r4 = "mvdelete"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x007f
            goto L_0x008a
        L_0x004c:
            java.lang.String r11 = "draftdelete"
            boolean r11 = r7.equals(r11)     // Catch:{ all -> 0x008a }
            if (r11 != 0) goto L_0x005e
            goto L_0x008a
        L_0x0055:
            java.lang.String r11 = "draft"
            boolean r11 = r7.equals(r11)     // Catch:{ all -> 0x008a }
            if (r11 != 0) goto L_0x005e
            goto L_0x008a
        L_0x005e:
            java.lang.String r11 = "draftid"
            r3.put(r11, r9)     // Catch:{ all -> 0x008a }
            goto L_0x008a
        L_0x0064:
            java.lang.String r4 = "mv"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x007f
            goto L_0x008a
        L_0x006d:
            java.lang.String r4 = "music_play"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x008a
            goto L_0x007f
        L_0x0076:
            java.lang.String r4 = "music_card"
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x008a }
            if (r4 != 0) goto L_0x007f
            goto L_0x008a
        L_0x007f:
            java.lang.String r4 = "feedid"
            r3.put(r4, r9)     // Catch:{ all -> 0x008a }
            java.lang.String r9 = "songid"
            r3.put(r9, r11)     // Catch:{ all -> 0x008a }
        L_0x008a:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 21875(0x5573, float:3.0653E-41)
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r0] = r10
            r10 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r10] = r8
            r8 = 4
            r4[r8] = r2
            r8 = 5
            r4[r8] = r7
            r7 = 6
            java.lang.String r8 = r3.toString()
            r4[r7] = r8
            r9.mo160131h(r11, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mo1.C11025q.mo11182j3(java.lang.String, int, java.lang.String, int, java.lang.String):void");
    }

    /* renamed from: l3 */
    public final void mo11183l3(String str, int i, int i2) {
        C87412m.m108594g(str, "eid");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, i2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …rce)\n        }.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String stringExtra = getActivity().getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        int i3 = isSelf() ? 33 : 32;
        C115669n.INSTANCE.mo160131h(21875, Wb, stringExtra, Integer.valueOf(i3), Integer.valueOf(i), String.valueOf(System.currentTimeMillis()), str, n);
    }

    public void onCreateAfter(Bundle bundle) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC;
        Class cls = C76979h.class;
        super.onCreateAfter(bundle);
        boolean z = getIntent().getIntExtra("report_scene", 0) == 19;
        this.f32758i = z;
        if (z) {
            ((C13317l7) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13317l7.class)).mo12758c3("Source", "1");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("showWxProfileTips ");
        sb.append(isSelf());
        sb.append(", ");
        sb.append(((Boolean) ((C36570n) this.f32771y).getValue()).booleanValue());
        sb.append(", ");
        C7827l3 l3Var = C7827l3.f26365a;
        sb.append(l3Var.mo8930i());
        sb.append(", ");
        C58784w3 w3Var = C58784w3.f168295a;
        sb.append(!w3Var.mo83904U0());
        sb.append(", ");
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC;
        sb.append(i.mo119689j(aVar2, 0) == 0);
        Log.m105924i(C54492n.TAG, sb.toString());
        if (isSelf() && ((Boolean) ((C36570n) this.f32771y).getValue()).booleanValue() && l3Var.mo8930i() && !w3Var.mo83904U0() && C86709a0.m107535s().mo121142i().mo119689j(aVar2, 0) == 0 && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.fy0((C58417y0) c, getActivity(), 13, 2, false, 0, 0, (String) null, 120, (Object) null);
            View view = (View) ((C36570n) this.f32754e).getValue();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo11179g3().setChecked(w3Var.mo83904U0());
            String string = getContext().getString(C0966R.string.el8);
            C87412m.m108593f(string, "context.getString(R.stri…r_profile_show_tips_link)");
            String string2 = getContext().getString(C0966R.string.el7, new Object[]{string});
            C87412m.m108593f(string2, "context.getString(R.stri…file_show_tips, linkText)");
            SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(getActivity(), string2);
            C87412m.m108593f(T1, "tips");
            int E = C112550d0.m153769E(T1, string, 0, false, 6, (Object) null);
            if (E >= 0) {
                C4059g5 g5Var = r14;
                int i2 = E;
                C4059g5 g5Var2 = new C4059g5(string, getContext().getResources().getColor(C0966R.color.f2958ae), getContext().getResources().getColor(C0966R.color.Link_Alpha_0_6), false, false, new C11046r(this), 16, (C8480h) null);
                T1.setSpan(g5Var, i2, string.length() + i2, 17);
            }
            ((TextView) ((C36570n) this.f32756g).getValue()).setText(T1);
            TextView textView = (TextView) ((C36570n) this.f32756g).getValue();
            C87412m.m108593f(textView, "tv");
            w3Var.mo83876I1(textView, T1);
            ((View) ((C36570n) this.f32754e).getValue()).setOnClickListener(new C11032g(this));
            mo11179g3().setOnClickListener(new C11033h(this));
        } else {
            View view3 = (View) ((C36570n) this.f32754e).getValue();
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!getFragmentMode()) {
            TextView textView2 = (TextView) ((C36570n) this.f32763q).getValue();
            if (textView2 != null) {
                textView2.setText(getContext().getString(C0966R.string.eka));
            }
        } else {
            TextView textView3 = (TextView) ((C36570n) this.f32763q).getValue();
            if (textView3 != null) {
                textView3.setText(getContext().getString(C0966R.string.m4i));
            }
        }
        if (isSelf() && ((Boolean) ((C36570n) this.f32771y).getValue()).booleanValue() && l3Var.mo8930i() && !w3Var.mo83904U0() && C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            C4191v0 v0Var = new C4191v0(getActivity());
            v0Var.mo5070e(C0966R.C0971layout.arc);
            View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.luq);
            C87412m.m108593f(findViewById, "rootView.findViewById<Te…wxprofile_apply_title_tv)");
            C7919x.m8091a((TextView) findViewById);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(getContext().getString(C0966R.string.etz));
            SpannableString T12 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), getContext().getString(C0966R.string.f360797eu0));
            String spannableString = T12.toString();
            C87412m.m108593f(spannableString, "linkSpan.toString()");
            T12.setSpan(new C4059g5(spannableString, getContext().getResources().getColor(C0966R.color.f2958ae), getContext().getResources().getColor(C0966R.color.Link_Alpha_0_6), false, false, new C11034i(this), 16, (C8480h) null), 0, T12.length(), 17);
            spannableStringBuilder.append(T12);
            TextView textView4 = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.lup);
            textView4.setText(spannableStringBuilder);
            w3Var.mo83876I1(textView4, spannableStringBuilder);
            v0Var.f18472r = new C11035j(this);
            v0Var.f18463f.findViewById(C0966R.C0970id.luo).setOnClickListener(new C11036k(this, v0Var));
            v0Var.f18463f.findViewById(C0966R.C0970id.lur).setOnClickListener(new C11037l(v0Var));
            v0Var.mo5073h();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String stringExtra = getActivity().getIntent().getStringExtra("key_context_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            int intExtra = getActivity().getIntent().getIntExtra("KEY_REF_COMMENTSCENE", 0);
            String valueOf = String.valueOf(System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f32758i) {
                    jSONObject.put("Source", 1);
                } else {
                    jSONObject.put("Source", 0);
                }
            } catch (Throwable unused) {
            }
            C115669n.INSTANCE.mo160131h(21874, Wb, stringExtra, 78, 2, valueOf, (String) ((C36570n) this.f32772z).getValue(), jSONObject.toString(), ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13442s8.class)).f38100p, Integer.valueOf(intExtra), 0);
        }
    }

    public void onResume() {
        super.onResume();
        mo11179g3().setChecked(C58784w3.f168295a.mo83904U0());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11025q(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
