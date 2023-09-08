package ao1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bt1.C54563e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.view.FinderJumperView;
import com.tencent.p014mm.plugin.finder.view.FinderTencentVideoChooseView;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dr1.C7471a0;
import dr1.C7478d0;
import dr1.C7483i;
import dr1.C7488k;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C48996cf1;
import te3.C64364fg1;
import wp1.C15587j;

/* renamed from: ao1.g0 */
public final class C0152g0 extends UIComponent {

    /* renamed from: d */
    public final String f590d = "Finder.PostJumpInfoUIC";

    /* renamed from: e */
    public boolean f591e;

    /* renamed from: f */
    public C7478d0 f592f;

    /* renamed from: g */
    public C32226l<? super Boolean, C13598b0> f593g;

    /* renamed from: h */
    public final C13601g f594h;

    /* renamed from: ao1.g0$a */
    public static final class C0153a extends C87413o implements C32224a<C54563e> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0153a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f595d = appCompatActivity;
        }

        public Object invoke() {
            return ((PostMainUIC) C39818r.f106831a.mo62444c(this.f595d).mo75002a(PostMainUIC.class)).mo78410F3();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0152g0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f594h = C36568h.m40985a(new C0153a(appCompatActivity));
    }

    /* renamed from: c3 */
    public final void mo142c3(List<? extends FinderJumpInfo> list) {
        C32226l<? super Boolean, C13598b0> lVar;
        AppCompatActivity activity = getActivity();
        View findViewById = getActivity().findViewById(C0966R.C0970id.f357703bb3);
        C87412m.m108593f(findViewById, "activity.findViewById(co…R.id.choose_product_view)");
        C7488k kVar = new C7488k(activity, (FinderJumperView) findViewById);
        this.f592f = kVar;
        kVar.mo8615a(list);
        if (!(list == null || (lVar = this.f593g) == null)) {
            lVar.invoke(Boolean.TRUE);
        }
        String str = this.f590d;
        Log.m105924i(str, "createProductWidget " + this.f592f);
    }

    /* renamed from: d3 */
    public final void mo143d3(List<? extends FinderJumpInfo> list) {
        AppCompatActivity activity = getActivity();
        View findViewById = getActivity().findViewById(C0966R.C0970id.f357703bb3);
        C87412m.m108593f(findViewById, "activity.findViewById(co…R.id.choose_product_view)");
        C7483i iVar = new C7483i(activity, (FinderJumperView) findViewById);
        iVar.f25710k = this.f593g;
        this.f592f = iVar;
        iVar.mo8615a(list);
        String str = this.f590d;
        Log.m105924i(str, "createProductWidget " + this.f592f);
    }

    /* renamed from: e3 */
    public final void mo144e3(List<? extends FinderJumpInfo> list, boolean z) {
        String str;
        FinderJumpInfo finderJumpInfo = list != null ? (FinderJumpInfo) C110818d0.m150916N(list) : null;
        this.f591e = z;
        if (list == null || finderJumpInfo == null) {
            mo143d3((List<? extends FinderJumpInfo>) null);
            return;
        }
        int i = finderJumpInfo.jumpinfo_type;
        if (i != 1) {
            boolean z2 = false;
            if ((i == 2 || i == 3) || i == 4) {
                int i2 = finderJumpInfo.business_type;
                if (i2 == 13) {
                    C64364fg1 fg12 = ((C54563e) ((C36570n) this.f594h).getValue()).f152947E;
                    if (fg12 != null) {
                        String str2 = fg12.f183131e;
                        if (str2 != null) {
                            if (!(str2.length() == 0)) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            String str3 = fg12.f183132f;
                        }
                    }
                    C0192y yVar = (C0192y) C39818r.f106831a.mo62443b(getContext()).mo75002a(C0192y.class);
                    String str4 = finderJumpInfo.wording;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = str5;
                    }
                    Html5Info html5Info = finderJumpInfo.html5_info;
                    if (!(html5Info == null || (str = html5Info.url) == null)) {
                        str5 = str;
                    }
                    int i3 = html5Info != null ? html5Info.style : 2;
                    yVar.getClass();
                    yVar.mo172d3();
                    AppCompatActivity activity = yVar.getActivity();
                    View findViewById = yVar.getActivity().findViewById(C0966R.C0970id.bb5);
                    C87412m.m108593f(findViewById, "activity.findViewById(co…hoose_tencent_video_view)");
                    yVar.f661f = new C7471a0(activity, (FinderTencentVideoChooseView) findViewById);
                    C0152g0 f3 = yVar.mo174f3();
                    C7471a0 a0Var = yVar.f661f;
                    f3.f592f = a0Var;
                    if (a0Var != null) {
                        new C0147e0(yVar);
                        FinderJumpInfo finderJumpInfo2 = new FinderJumpInfo();
                        finderJumpInfo2.jumpinfo_type = 2;
                        finderJumpInfo2.business_type = 13;
                        finderJumpInfo2.source = 1;
                        finderJumpInfo2.wording = str4;
                        for (C48996cf1 cf12 : C15587j.f42217c) {
                            if (cf12.f131693d == 2) {
                                finderJumpInfo2.icon_url = cf12.f131694e;
                            }
                        }
                        Html5Info html5Info2 = new Html5Info();
                        html5Info2.url = str5;
                        html5Info2.style = i3;
                        finderJumpInfo2.html5_info = html5Info2;
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(finderJumpInfo2);
                        a0Var.mo8615a(arrayList);
                        if (C13598b0.f38549a == null) {
                            a0Var.mo8615a((List<? extends FinderJumpInfo>) null);
                        }
                    }
                } else if (i2 != 6) {
                    mo142c3(list);
                }
            }
        } else if (finderJumpInfo.business_type == 1) {
            mo143d3(list);
        } else {
            mo142c3(list);
        }
    }

    /* renamed from: f3 */
    public final void mo145f3() {
        C13598b0 b0Var;
        FinderJumpInfo finderJumpInfo = ((C54563e) ((C36570n) this.f594h).getValue()).f152946D;
        if (finderJumpInfo != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(finderJumpInfo);
            mo144e3(arrayList, false);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            mo144e3((List<? extends FinderJumpInfo>) null, false);
        }
    }
}
