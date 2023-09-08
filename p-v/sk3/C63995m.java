package sk3;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54208j0;
import androidx.lifecycle.LiveData;
import bl3.C39818r;
import bp3.C54526i;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gq3.C59629h;
import gq3.C59648q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import p157gk.C59479c;
import p157gk.C59481e;
import p157gk.C59491j;
import p248ug.C65347o0;
import p415q0.C110261c;
import qo3.C89779i0;
import rk3.C63462a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;

/* renamed from: sk3.m */
public final class C63995m extends UIComponent {

    /* renamed from: d */
    public View f181426d;

    /* renamed from: e */
    public MMComposeView f181427e;

    /* renamed from: f */
    public String f181428f = "";

    /* renamed from: g */
    public String f181429g = "";

    /* renamed from: h */
    public C89779i0 f181430h;

    /* renamed from: i */
    public final C13601g f181431i;

    /* renamed from: j */
    public LiveData<C59648q> f181432j;

    /* renamed from: n */
    public boolean f181433n;

    /* renamed from: o */
    public boolean f181434o;

    /* renamed from: p */
    public C53973z1 f181435p;

    /* renamed from: q */
    public C59479c f181436q;

    /* renamed from: r */
    public boolean f181437r;

    /* renamed from: sk3.m$a */
    public static final class C63996a extends C87413o implements C32224a<C59629h> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f181438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63996a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f181438d = appCompatActivity;
        }

        public Object invoke() {
            return (C59629h) C39818r.f106831a.mo62444c(this.f181438d).mo75002a(C59629h.class);
        }
    }

    /* renamed from: sk3.m$b */
    public static final class C63997b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63995m f181439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63997b(C63995m mVar) {
            super(0);
            this.f181439d = mVar;
        }

        public Object invoke() {
            LiveData<C59479c> liveData;
            C59481e eVar = C59491j.f169998c;
            if (!(eVar == null || (liveData = eVar.f169968h) == null)) {
                liveData.observe(this.f181439d.getActivity(), new C64000n(this.f181439d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sk3.m$c */
    public static final class C63998c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63995m f181440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63998c(C63995m mVar) {
            super(0);
            this.f181440d = mVar;
        }

        public Object invoke() {
            C39818r rVar = C39818r.f106831a;
            ((C64009r0) rVar.mo62444c(this.f181440d.getActivity()).mo75002a(C64009r0.class)).mo88777g3();
            ((C64024v) rVar.mo62444c(this.f181440d.getActivity()).mo75002a(C64024v.class)).mo88784j3(C59479c.RUNNING);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63995m(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f181431i = C36568h.m40985a(new C63996a(appCompatActivity));
        this.f181432j = mo88763e3().f170403g;
        this.f181436q = C59479c.INIT;
    }

    /* renamed from: c3 */
    public final void mo88761c3() {
        Class cls = C64009r0.class;
        this.f181433n = true;
        this.f181437r = true;
        C59481e eVar = C59491j.f169998c;
        if (eVar != null) {
            eVar.mo84579a(getActivity());
        }
        C39818r rVar = C39818r.f106831a;
        int i = ((C64009r0) rVar.mo62444c(getActivity()).mo75002a(cls)).f181466p;
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> currentTab: " + i);
        if (i == 0 || i == 1 || i == 2) {
            C13703i iVar = (C13703i) rVar.mo62444c(getActivity()).mo75002a(C13703i.class);
            View view = iVar.f38776d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "openFeatureFromMediaHistory", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC", "openFeatureFromMediaHistory", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = iVar.f38778f;
            if (view2 != null) {
                mo88768k3(view2);
            }
        }
        ((C64009r0) rVar.mo62444c(getActivity()).mo75002a(cls)).mo88777g3();
        C59479c cVar = C59479c.RUNNING;
        ((C64024v) rVar.mo62444c(getActivity()).mo75002a(C64024v.class)).mo88784j3(cVar);
        this.f181436q = cVar;
        mo88767j3();
    }

    /* renamed from: d3 */
    public final int mo88762d3() {
        if (this.f181434o) {
            return this.f181433n ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: e3 */
    public final C59629h mo88763e3() {
        return (C59629h) this.f181431i.getValue();
    }

    /* renamed from: f3 */
    public final int mo88764f3() {
        return mo88763e3().f170410q.size();
    }

    /* renamed from: g3 */
    public final boolean mo88765g3() {
        C54526i iVar = C54526i.f152882a;
        boolean z = iVar.mo75389a() && iVar.mo75390b();
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "getImageQueryEntrance >> " + z);
        return z;
    }

    /* renamed from: i3 */
    public final boolean mo88766i3() {
        boolean z = (C75592q0.m90780j() & 1) != 0;
        Log.m105924i("MicroMsg.ImageQueryEntranceConfig", "getC2CImageQuerySettingState: " + z);
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "getImageQueryFeatureState > " + z);
        return z;
    }

    /* renamed from: j3 */
    public final void mo88767j3() {
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "initIdentifyObserver");
        C61926c.m72668M(new C63997b(this));
    }

    /* renamed from: k3 */
    public final void mo88768k3(View view) {
        C87412m.m108594g(view, "parentView");
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "initParentView");
        this.f181426d = view;
        MMComposeView mMComposeView = (MMComposeView) view.findViewById(C0966R.C0970id.n0h);
        this.f181427e = mMComposeView;
        C59491j.f169996a = true;
        if (mMComposeView != null) {
            mMComposeView.setVisibility(0);
        }
        MMComposeView mMComposeView2 = this.f181427e;
        if (mMComposeView2 != null) {
            mMComposeView2.setContent(C110261c.m149879c(-1694448054, true, new C64003q(this)));
        }
    }

    /* renamed from: l3 */
    public final void mo88769l3() {
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "postRunning");
        C61926c.m72668M(new C63998c(this));
    }

    /* renamed from: m3 */
    public final void mo88770m3(String str) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "updateQuery >> " + str);
        this.f181429g = str;
        if (this.f181434o && this.f181433n) {
            mo88763e3().mo84636J3(str);
            if (str.length() > 0) {
                Log.m105924i("MicroMsg.FTSMultiImageUIC", "startToQuery: " + str);
                C59629h e3 = mo88763e3();
                C87412m.m108593f(e3, "imageDataQueryModel");
                List<String> list = C59629h.f170395E;
                e3.mo84639e3(str, (List<Integer>) null);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 != -1 || intent == null) {
            boolean i3 = mo88766i3();
            Log.m105924i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> deal " + i3 + ", " + this.f181433n);
            if (!this.f181433n && i3) {
                mo88761c3();
                return;
            }
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("RESULT_OPEN_FEATURE", false);
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "onActivityResult >> " + booleanExtra);
        if (booleanExtra) {
            mo88761c3();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f181428f = stringExtra;
        this.f181433n = mo88766i3();
        boolean g3 = mo88765g3();
        this.f181434o = g3;
        if (this.f181433n && g3) {
            this.f181435p = C53895h.m60466d(C54208j0.m60899a(this), C53872d1.f151119c, (C53934p0) null, new C64006r(this, (C15601d<? super C64006r>) null), 2, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "onDestroy >> " + this.f181433n + ", " + this.f181434o + 65292 + this.f181437r);
        if (!this.f181433n || !this.f181434o || !this.f181437r) {
            C63462a.f180011a.mo88332g(0);
            return;
        }
        C63462a.f180011a.mo88332g(mo88764f3());
        C53973z1 z1Var = this.f181435p;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C59481e eVar = C59491j.f169998c;
        if (eVar != null) {
            eVar.mo84582d();
        }
        ((C65347o0) C86312j.m106911c(C65347o0.class)).A40();
    }

    public void onResume() {
        super.onResume();
        C59491j.f169996a = true;
    }
}
