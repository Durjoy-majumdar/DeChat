package sk3;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.search.multi.FTSChattingConvMultiTabUI;
import com.tencent.p014mm.p136ui.chatting.search.multi.fragment.FTSMultiAllResultFragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99681n;
import nv1.C61907e;
import ok3.C62074i;
import qk3.C63284d;
import rk3.C63462a;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: sk3.q0 */
public final class C64004q0 extends UIComponent implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: d */
    public FTSSearchView f181447d;

    /* renamed from: e */
    public String f181448e = "";

    /* renamed from: f */
    public String f181449f = "";

    /* renamed from: g */
    public long f181450g;

    /* renamed from: h */
    public boolean f181451h = true;

    /* renamed from: sk3.q0$a */
    public static final class C64005a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64004q0 f181452d;

        public C64005a(C64004q0 q0Var) {
            this.f181452d = q0Var;
        }

        public final void run() {
            FTSEditTextView ftsEditText;
            FTSEditTextView ftsEditText2;
            FTSSearchView fTSSearchView = this.f181452d.f181447d;
            if (!(fTSSearchView == null || (ftsEditText2 = fTSSearchView.getFtsEditText()) == null)) {
                ftsEditText2.mo70355k();
            }
            FTSSearchView fTSSearchView2 = this.f181452d.f181447d;
            if (fTSSearchView2 != null && (ftsEditText = fTSSearchView2.getFtsEditText()) != null) {
                ftsEditText.mo70361q();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64004q0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "onEditTextFocusChange");
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3 = str;
        FTSEditTextView.C45052m mVar2 = mVar;
        Class cls = C99260q.class;
        Class cls2 = C64024v.class;
        Class cls3 = C63995m.class;
        Class cls4 = C64009r0.class;
        Class cls5 = C13704n0.class;
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "onEditTextChange: " + str2 + ", " + str3 + ", " + mVar2);
        if (str3 == null || str.length() == 0) {
            Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "dealClearText");
            this.f181449f = "";
            C39818r rVar = C39818r.f106831a;
            ((C13704n0) rVar.mo62444c(getActivity()).mo75002a(cls5)).mo13085c3(0);
            ((C64009r0) rVar.mo62444c(getActivity()).mo75002a(cls4)).mo88778i3(8);
            ((C63995m) rVar.mo62444c(getActivity()).mo75002a(cls3)).mo88770m3("");
            C64024v vVar = (C64024v) rVar.mo62444c(getActivity()).mo75002a(cls2);
            vVar.getClass();
            Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "clear text");
            vVar.mo88779d3();
            if (vVar.f181515e != null) {
                ((C99260q) C86312j.m106911c(cls)).mo128757ki(vVar.f181515e);
            }
            C53973z1 z1Var = vVar.f181528u;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C53973z1 z1Var2 = vVar.f181512F;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            C53973z1 z1Var3 = vVar.f181531x;
            if (z1Var3 != null) {
                C53973z1.C53974a.m60623a(z1Var3, (CancellationException) null, 1, (Object) null);
            }
            C63284d dVar = vVar.f181530w;
            dVar.getClass();
            Log.m105924i("MicroMsg.LoadMoreImageDataModel", "reset");
            dVar.f179617a = null;
            C53973z1 z1Var4 = dVar.f179619c;
            if (z1Var4 != null) {
                C53973z1.C53974a.m60623a(z1Var4, (CancellationException) null, 1, (Object) null);
            }
        } else if (mVar2 == FTSEditTextView.C45052m.UserInput) {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("deSearch >> timeStamp: ");
            String str4 = "MicroMsg.LoadMoreImageDataModel";
            String str5 = "reset";
            sb.append(this.f181450g);
            sb.append(", ");
            sb.append(currentTimeMillis);
            Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", sb.toString());
            if (currentTimeMillis - this.f181450g < 100) {
                Log.m105920e("MicroMsg.FTSMultiSearchViewUIC", "search is grep");
                return;
            }
            this.f181450g = currentTimeMillis;
            String o = C99251g.m129294o(str);
            if (Util.isNullOrNil(this.f181449f) || !C87412m.m108589b(this.f181449f, o)) {
                C87412m.m108593f(o, "preProcessText");
                this.f181449f = o;
                C63462a aVar = C63462a.f180011a;
                C39818r rVar2 = C39818r.f106831a;
                int f3 = ((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls3)).mo88764f3();
                int d3 = ((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls3)).mo88762d3();
                Log.m105924i("MicroMsg.FTSMultiReporter", "report do search " + C63462a.f180013c + ", " + C63462a.f180016f + ", " + f3 + ", " + d3 + ' ' + o);
                aVar.mo88332g(f3);
                C63462a.f180016f = o;
                C63462a.f180024n = d3;
                long currentTimeMillis2 = System.currentTimeMillis();
                C63462a.f180018h = currentTimeMillis2;
                C63462a.f180013c = String.valueOf(currentTimeMillis2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("setSearchSessionId >> ");
                sb4.append(C63462a.f180013c);
                Log.m105924i("MicroMsg.FTSMultiReporter", sb4.toString());
                SessionMsgSearchActionLogStruct a = aVar.mo88327a();
                a.f156819f = 4;
                a.f156822i = a.mo86045b(SearchIntents.EXTRA_QUERY, o, true);
                a.mo86054n();
                ((C13704n0) rVar2.mo62444c(getActivity()).mo75002a(cls5)).mo13085c3(8);
                ((C64009r0) rVar2.mo62444c(getActivity()).mo75002a(cls4)).mo88778i3(0);
                ((C63995m) rVar2.mo62444c(getActivity()).mo75002a(cls3)).mo88770m3(o);
                C64009r0 r0Var = (C64009r0) rVar2.mo62444c(getActivity()).mo75002a(cls4);
                r0Var.getClass();
                Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "updateQuery");
                UIComponentFragment uIComponentFragment = r0Var.f181460g.get(0);
                C87412m.m108592e(uIComponentFragment, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.search.multi.fragment.FTSMultiAllResultFragment");
                ((FTSMultiAllResultFragment) uIComponentFragment).f165125q = true;
                r0Var.f181470t = 0;
                C53973z1 z1Var5 = r0Var.f181469s;
                if (z1Var5 != null) {
                    C53973z1.C53974a.m60623a(z1Var5, (CancellationException) null, 1, (Object) null);
                }
                C53973z1 z1Var6 = r0Var.f181471u;
                if (z1Var6 != null) {
                    C53973z1.C53974a.m60623a(z1Var6, (CancellationException) null, 1, (Object) null);
                }
                if (r0Var.f181468r) {
                    WeImageView weImageView = r0Var.f181465o;
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    TextView textView = r0Var.f181464n;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                }
                r0Var.f181473w = true;
                C64024v vVar2 = (C64024v) rVar2.mo62444c(getActivity()).mo75002a(cls2);
                vVar2.getClass();
                Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "onSearch: " + o);
                C62074i iVar = C62074i.RUNNING;
                vVar2.mo88779d3();
                C53973z1 z1Var7 = vVar2.f181528u;
                if (z1Var7 != null) {
                    C53973z1.C53974a.m60623a(z1Var7, (CancellationException) null, 1, (Object) null);
                }
                AppCompatActivity activity = vVar2.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.search.multi.FTSChattingConvMultiTabUI");
                for (UIComponent uIComponent : ((FTSChattingConvMultiTabUI) activity).getUiComponents()) {
                    if (uIComponent instanceof C63994l0) {
                        C63994l0 l0Var = (C63994l0) uIComponent;
                        l0Var.getClass();
                        String str6 = l0Var.f181415d;
                        Log.m105924i(str6, "updateSearchState >> searchState " + iVar);
                        l0Var.f181419h.postValue(iVar);
                        C53973z1 z1Var8 = l0Var.f181422n;
                        if (z1Var8 != null) {
                            C53973z1.C53974a.m60623a(z1Var8, (CancellationException) null, 1, (Object) null);
                        }
                    }
                }
                vVar2.f181517g.setValue(iVar);
                if (vVar2.f181515e != null) {
                    ((C99260q) C86312j.m106911c(cls)).mo128757ki(vVar2.f181515e);
                }
                List<? extends C99681n> list2 = vVar2.f181519i;
                C87412m.m108592e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.fts.api.model.MatchInfo>");
                ((ArrayList) list2).clear();
                vVar2.f181527t = false;
                vVar2.f181520j.clear();
                vVar2.f181521n.clear();
                vVar2.f181526s.clear();
                vVar2.f181525r.clear();
                C63284d dVar2 = vVar2.f181530w;
                dVar2.getClass();
                Log.m105924i(str4, str5);
                dVar2.f179617a = null;
                C53973z1 z1Var9 = dVar2.f179619c;
                boolean z = true;
                if (z1Var9 != null) {
                    C53973z1.C53974a.m60623a(z1Var9, (CancellationException) null, 1, (Object) null);
                }
                C53973z1 z1Var10 = vVar2.f181531x;
                if (z1Var10 != null) {
                    C53973z1.C53974a.m60623a(z1Var10, (CancellationException) null, 1, (Object) null);
                }
                vVar2.f181532y = false;
                vVar2.f181533z = false;
                vVar2.f181507A = false;
                vVar2.f181508B = false;
                vVar2.f181509C = false;
                vVar2.f181510D = false;
                vVar2.f181513G.clear();
                C39818r rVar3 = C39818r.f106831a;
                if (((C64009r0) rVar3.mo62444c(vVar2.getActivity()).mo75002a(cls4)).f181466p == 0) {
                    vVar2.mo88783i3();
                }
                vVar2.f181516f = o;
                C76728k kVar = new C76728k();
                kVar.f224468c = o;
                kVar.f224469d = vVar2.f181514d;
                kVar.f224477l = C61907e.f176012d;
                kVar.f224475j.add("create_talker_message​");
                kVar.f224478m = vVar2;
                kVar.f224479n = new MMHandler();
                kVar.f224467b = 3;
                vVar2.f181515e = ((C99260q) C86312j.m106911c(cls)).Xn0(3, kVar);
                if (((C63995m) rVar3.mo62444c(vVar2.getActivity()).mo75002a(cls3)).f181434o && ((C63995m) rVar3.mo62444c(vVar2.getActivity()).mo75002a(cls3)).f181433n) {
                    Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "getDataFromFlow >> " + o + ", " + vVar2.f181514d + ", " + vVar2.f181529v);
                    if (o.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        vVar2.f181531x = C53895h.m60466d(vVar2.getMainScope(), (C66212f) null, (C53934p0) null, new C64020u(vVar2, o, (C15601d<? super C64020u>) null), 3, (Object) null);
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105925i("MicroMsg.FTSMultiSearchViewUIC", "Same query %s %s", this.f181449f, o);
        }
    }

    /* renamed from: c3 */
    public final void mo88771c3() {
        FTSEditTextView ftsEditText;
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "hideKB");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).hideVKB();
        FTSSearchView fTSSearchView = this.f181447d;
        if (fTSSearchView != null && (ftsEditText = fTSSearchView.getFtsEditText()) != null) {
            ftsEditText.mo70335c();
        }
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "onTagClick");
    }

    public void onClickBackBtn(View view) {
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "onClickBackBtn");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).hideVKB();
        getActivity().finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSEditTextView ftsEditText;
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "onClickClearTextBtn");
        FTSSearchView fTSSearchView = this.f181447d;
        if (!(fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null)) {
            ftsEditText.mo70355k();
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).showVKB();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f181448e = getString(C0966R.string.a2p);
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "initSearchView");
        FTSSearchView fTSSearchView = new FTSSearchView((Context) getActivity(), false);
        this.f181447d = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f181447d;
        C87412m.m108591d(fTSSearchView2);
        fTSSearchView2.getFtsEditText().setHint(this.f181448e);
        FTSSearchView fTSSearchView3 = this.f181447d;
        C87412m.m108591d(fTSSearchView3);
        fTSSearchView3.getFtsEditText().mo70338f();
        FTSSearchView fTSSearchView4 = this.f181447d;
        C87412m.m108591d(fTSSearchView4);
        fTSSearchView4.getFtsEditText().setFtsEditTextListener(this);
        FTSSearchView fTSSearchView5 = this.f181447d;
        C87412m.m108591d(fTSSearchView5);
        fTSSearchView5.getFtsEditText().setCanDeleteTag(false);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ActionBar supportActionBar = ((MMActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91114y(this.f181447d);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f181451h) {
            FTSSearchView fTSSearchView = this.f181447d;
            if (fTSSearchView != null) {
                fTSSearchView.postDelayed(new C64005a(this), 128);
            }
            this.f181451h = false;
        }
    }

    /* renamed from: y */
    public boolean mo3009y() {
        FTSEditTextView ftsEditText;
        Log.m105924i("MicroMsg.FTSMultiSearchViewUIC", "onSearchKeyDown");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).hideVKB();
        FTSSearchView fTSSearchView = this.f181447d;
        if (fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null) {
            return false;
        }
        ftsEditText.mo70335c();
        return false;
    }
}
