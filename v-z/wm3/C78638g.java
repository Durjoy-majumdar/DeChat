package wm3;

import ac2.C39534d;
import ac2.C53998c;
import ac2.C54000f;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C0262a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.mvvm.list.SelectContactMvvmList;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C45612m0;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import mm3.C76783a;
import mm3.C76785b;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import tm3.C78057f;
import tm3.C78065p;
import tm3.C78069w;
import zb2.C79317n;

/* renamed from: wm3.g */
public final class C78638g extends C0262a<C77020b> {

    /* renamed from: d */
    public String f230328d = "";

    /* renamed from: e */
    public final C13601g f230329e = C36568h.m40985a(new C78644f(this));

    /* renamed from: f */
    public final C13601g f230330f;

    /* renamed from: g */
    public final C13601g f230331g;

    /* renamed from: h */
    public final List<String> f230332h;

    /* renamed from: i */
    public final C13601g f230333i;

    /* renamed from: j */
    public final C13601g f230334j;

    /* renamed from: wm3.g$a */
    public static final class C78639a extends C87413o implements C32224a<C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>>> {

        /* renamed from: d */
        public final /* synthetic */ C78638g f230335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78639a(C78638g gVar) {
            super(0);
            this.f230335d = gVar;
        }

        public Object invoke() {
            return ((C76785b) ((C36570n) this.f230335d.f230331g).getValue()).mo74666a((C76783a) ((C36570n) this.f230335d.f230333i).getValue());
        }
    }

    /* renamed from: wm3.g$b */
    public static final class C78640b extends C87413o implements C32224a<C76783a> {

        /* renamed from: d */
        public final /* synthetic */ C78638g f230336d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f230337e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78640b(C78638g gVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f230336d = gVar;
            this.f230337e = appCompatActivity;
        }

        public Object invoke() {
            String stringExtra = this.f230336d.getIntent().getStringExtra("chatroomName");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return new C76783a(this.f230337e, stringExtra, this.f230336d.f230332h);
        }
    }

    /* renamed from: wm3.g$c */
    public static final class C78641c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78638g f230338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78641c(C78638g gVar) {
            super(1);
            this.f230338d = gVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C78057f) wVar.checkAction(C78057f.class)) != null) {
                C78638g gVar = this.f230338d;
                WxRecyclerView g = ((C79115l) ((C36570n) gVar.f230329e).getValue()).mo109049g();
                C87412m.m108593f(g, "uiBinding.selectContactRv");
                MvvmList a = C79317n.m96015a(g);
                if (a instanceof SelectContactMvvmList) {
                    ((C79115l) ((C36570n) gVar.f230329e).getValue()).mo109050h().setAlphabet(new String[]{"🔍", "#"});
                    ((SelectContactMvvmList) a).f272358t.observe(gVar.getActivity(), new C78645h(gVar, a));
                }
            }
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C78638g gVar2 = this.f230338d;
                Intent intent = new Intent();
                intent.putExtra("KSelectUserList", C110818d0.m150921S(pVar.f228813a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                gVar2.getActivity().setResult(-1, intent);
                gVar2.getActivity().finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wm3.g$d */
    public static final class C78642d extends C87413o implements C32224a<C76785b> {

        /* renamed from: d */
        public final /* synthetic */ C78638g f230339d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f230340e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78642d(C78638g gVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f230339d = gVar;
            this.f230340e = appCompatActivity;
        }

        public Object invoke() {
            String stringExtra = this.f230339d.getIntent().getStringExtra("chatroomName");
            if (stringExtra == null) {
                stringExtra = "";
            }
            AppCompatActivity appCompatActivity = this.f230340e;
            C78638g gVar = this.f230339d;
            String str = gVar.f230328d;
            String str2 = (String) ((C36570n) gVar.f230330f).getValue();
            C87412m.m108593f(str2, "quoteShowHeadDisplay");
            return new C76785b(appCompatActivity, stringExtra, str, str2);
        }
    }

    /* renamed from: wm3.g$e */
    public static final class C78643e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f230341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78643e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f230341d = appCompatActivity;
        }

        public Object invoke() {
            return this.f230341d.getResources().getString(C0966R.string.mxz);
        }
    }

    /* renamed from: wm3.g$f */
    public static final class C78644f extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78638g f230342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78644f(C78638g gVar) {
            super(0);
            this.f230342d = gVar;
        }

        public Object invoke() {
            return new C79115l(this.f230342d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78638g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f230330f = C36568h.m40985a(new C78643e(appCompatActivity));
        this.f230331g = C36568h.m40985a(new C78642d(this, appCompatActivity));
        this.f230332h = new ArrayList();
        this.f230333i = C36568h.m40985a(new C78640b(this, appCompatActivity));
        this.f230334j = C36568h.m40985a(new C78639a(this));
    }

    /* renamed from: g3 */
    public C54000f<C77020b, C53998c<C77020b>, C39534d<C77020b>> mo302g3() {
        return Util.isNullOrNil(this.f230328d) ? (C76783a) ((C36570n) this.f230333i).getValue() : (C54000f) ((C36570n) this.f230334j).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f230328d = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("chatroomName");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        List<String> l = C45612m0.m50695l(stringExtra2);
        String s = C75592q0.m90789s();
        if (!((LinkedList) l).contains(this.f230328d) || C87412m.m108589b(this.f230328d, s)) {
            this.f230328d = "";
        }
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C78641c(this));
        }
    }
}
