package ao1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bt1.C54563e;
import cm1.C0764p0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dd3.C58256b;
import er1.C58784w3;
import er1.C58790x4;
import fe1.C58964h;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C51163rv3;
import te3.C64885zm2;
import up1.C37521f;

/* renamed from: ao1.l0 */
public final class C54269l0 extends UIComponent implements C58256b.C58257a {

    /* renamed from: d */
    public C58964h f152310d;

    /* renamed from: e */
    public WxRecyclerView f152311e;

    /* renamed from: f */
    public String f152312f;

    /* renamed from: g */
    public final ArrayList<C0764p0> f152313g = new ArrayList<>();

    /* renamed from: h */
    public final C13601g f152314h;

    /* renamed from: i */
    public final boolean f152315i;

    /* renamed from: ao1.l0$a */
    public static final class C0171a extends C87413o implements C32224a<C54563e> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0171a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f634d = appCompatActivity;
        }

        public Object invoke() {
            return ((PostMainUIC) C39818r.f106831a.mo62444c(this.f634d).mo75002a(PostMainUIC.class)).mo78410F3();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54269l0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f152314h = C36568h.m40985a(new C0171a(appCompatActivity));
        C37521f.f99374d.getClass();
        this.f152315i = C37521f.f99526u1.mo60266n().intValue() != 1 ? false : true;
    }

    /* renamed from: r2 */
    public void mo75059r2(String str, List<C64885zm2> list) {
        C64885zm2 zm22;
        boolean z = true;
        if (!(list == null || list.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            sb.append(" get lbsLife success，city=");
            sb.append(str);
            sb.append(", list=");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C64885zm2 zm23 : list) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(zm23.f186729d);
                sb4.append('-');
                sb4.append(zm23.f186730e);
                sb4.append('-');
                C58784w3 w3Var = C58784w3.f168295a;
                LinkedList<C51163rv3> linkedList = zm23.f186735j;
                C87412m.m108593f(linkedList, "it.DescList");
                sb4.append(w3Var.mo83874I(linkedList));
                sb4.append(' ');
                arrayList.add(sb4.toString());
            }
            sb.append(arrayList);
            Log.m105924i("PostLocationUIC", sb.toString());
            if (this.f152315i) {
                C58964h hVar = this.f152310d;
                if (hVar != null) {
                    hVar.mo83365d();
                    this.f152312f = str;
                    if (!(str == null || str.length() == 0)) {
                        z = false;
                    }
                    if (!z && (zm22 = (C64885zm2) C110818d0.m150916N(list)) != null) {
                        C64885zm2 zm24 = new C64885zm2();
                        zm24.f186729d = "";
                        zm24.f186730e = "";
                        zm24.f186731f = zm22.f186731f;
                        zm24.f186732g = zm22.f186732g;
                        zm24.f186733h = zm22.f186733h;
                        zm24.f186734i = zm22.f186734i;
                        zm24.f186736n = zm22.f186736n;
                        zm24.f186737o = zm22.f186737o;
                        zm24.f186738p = zm22.f186738p;
                        zm24.f186739q = zm22.f186739q;
                        zm24.f186740r = zm22.f186740r;
                        zm24.f186741s = zm22.f186741s;
                        zm24.f186742t = zm22.f186742t;
                        zm24.f186743u = zm22.f186743u;
                        this.f152313g.add(new C0764p0(zm24));
                    }
                    for (C64885zm2 p0Var : list) {
                        this.f152313g.add(new C0764p0(p0Var));
                    }
                    WxRecyclerView wxRecyclerView = this.f152311e;
                    if (wxRecyclerView != null) {
                        RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        WxRecyclerView wxRecyclerView2 = this.f152311e;
                        if (wxRecyclerView2 != null) {
                            wxRecyclerView2.setVisibility(0);
                        } else {
                            C87412m.m108603p("lbsRecyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("lbsRecyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("locationWidget");
                    throw null;
                }
            } else {
                C58964h hVar2 = this.f152310d;
                if (hVar2 != null) {
                    ((C54563e) ((C36570n) this.f152314h).getValue()).getClass();
                    hVar2.mo83366e(str, (C64885zm2) C110818d0.m150914L(list), (C58790x4) null);
                    return;
                }
                C87412m.m108603p("locationWidget");
                throw null;
            }
        } else {
            C58964h hVar3 = this.f152310d;
            if (hVar3 != null) {
                hVar3.mo83365d();
            } else {
                C87412m.m108603p("locationWidget");
                throw null;
            }
        }
    }
}
