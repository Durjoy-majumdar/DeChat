package xm3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bc2.C67221b;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import sx3.C64197v;
import tm3.C64958n;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78061j;
import tm3.C78064o;
import tm3.C78069w;
import tm3.C78071z;
import z04.C112551y;
import zb2.C103009m;
import zb2.C79317n;

/* renamed from: xm3.y */
public final class C78938y extends C67221b<C77020b> {

    /* renamed from: d */
    public final C13601g f231810d;

    /* renamed from: e */
    public final C13601g f231811e = C36568h.m40985a(new C78943e(this));

    /* renamed from: f */
    public int f231812f;

    /* renamed from: g */
    public String f231813g = "";

    /* renamed from: xm3.y$a */
    public final class C78939a implements VerticalScrollBar.C6756b {
        public C78939a() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            UIStateCenter stateCenter;
            if (str != null && !C87412m.m108589b(C78938y.this.f231813g, str)) {
                C78938y yVar = C78938y.this;
                int i = yVar.f231812f + 1;
                yVar.f231812f = i;
                BaseMvvmActivity d3 = yVar.mo14598d3();
                if (!(d3 == null || (stateCenter = d3.getStateCenter()) == null)) {
                    stateCenter.dispatch(new C78061j(i));
                }
                C78938y yVar2 = C78938y.this;
                yVar2.getClass();
                yVar2.f231813g = str;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 35) {
                    if (hashCode != 8593) {
                        if (hashCode != 9734) {
                            if (hashCode == 1772656 && str.equals("🔍")) {
                                mo108912a(0, true);
                                return;
                            }
                        } else if (str.equals("☆")) {
                            mo108912a(32, false);
                            return;
                        }
                    } else if (str.equals("↑")) {
                        mo108912a(0, true);
                        return;
                    }
                } else if (str.equals("#")) {
                    mo108912a(123, false);
                    return;
                }
                char[] charArray = str.toCharArray();
                C87412m.m108593f(charArray, "this as java.lang.String).toCharArray()");
                Character F = C110823p.m150980F(charArray, 0);
                if (F != null) {
                    mo108912a(F.charValue(), false);
                }
            }
        }

        /* renamed from: a */
        public final void mo108912a(int i, boolean z) {
            ArrayList<T> arrayList;
            C78938y yVar = C78938y.this;
            WxRecyclerView g = yVar.mo108911j3().mo109049g();
            C87412m.m108593f(g, "uiBinding.selectContactRv");
            C103009m b = C79317n.m96016b(g);
            int c6 = b != null ? b.mo85796c6() : 0;
            if (!z) {
                WxRecyclerView g2 = yVar.mo108911j3().mo109049g();
                C87412m.m108593f(g2, "uiBinding.selectContactRv");
                MvvmList a = C79317n.m96015a(g2);
                if (a != null && (arrayList = a.f272353o) != null) {
                    int i2 = 0;
                    for (T next : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C77020b bVar = (C77020b) next;
                            if (bVar.f225009h.mo105660b() != i || !bVar.f225012n) {
                                i2 = i3;
                            } else {
                                yVar.mo108911j3().mo109049g().mo17155w1();
                                WxRecyclerView g3 = yVar.mo108911j3().mo109049g();
                                C87412m.m108593f(g3, "uiBinding.selectContactRv");
                                WxLinearLayoutManager c = C79317n.m96017c(g3);
                                if (c != null) {
                                    int i4 = i2 + c6;
                                    int i35 = C78938y.m95437i3(yVar);
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(Integer.valueOf(i35));
                                    aVar.mo10233c(Integer.valueOf(i4));
                                    WxLinearLayoutManager wxLinearLayoutManager = c;
                                    C117292a.m165358d(wxLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$ScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                    c.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                                    C117292a.m165359e(wxLinearLayoutManager, "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$ScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                    return;
                                }
                                return;
                            }
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            WxRecyclerView g4 = yVar.mo108911j3().mo109049g();
            C87412m.m108593f(g4, "uiBinding.selectContactRv");
            WxLinearLayoutManager c2 = C79317n.m96017c(g4);
            if (c2 != null) {
                int i36 = C78938y.m95437i3(yVar);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i36));
                aVar2.mo10233c(0);
                WxLinearLayoutManager wxLinearLayoutManager2 = c2;
                C117292a.m165358d(wxLinearLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$ScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c2.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$ScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: xm3.y$b */
    public final class C78940b implements VerticalScrollBar.C6756b {
        public C78940b() {
        }

        /* renamed from: S0 */
        public void mo5638S0(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 35) {
                    if (hashCode != 8593) {
                        if (hashCode == 9734 && str.equals("☆")) {
                            mo108913a(32, false);
                            return;
                        }
                    } else if (str.equals("↑")) {
                        mo108913a(0, true);
                        return;
                    }
                } else if (str.equals("#")) {
                    mo108913a(123, false);
                    return;
                }
                char[] charArray = str.toCharArray();
                C87412m.m108593f(charArray, "this as java.lang.String).toCharArray()");
                Character F = C110823p.m150980F(charArray, 0);
                if (F != null) {
                    mo108913a(F.charValue(), false);
                }
            }
        }

        /* renamed from: a */
        public final void mo108913a(int i, boolean z) {
            ArrayList<T> arrayList;
            C78938y yVar = C78938y.this;
            WxRecyclerView e = yVar.mo108911j3().mo109047e();
            C87412m.m108593f(e, "uiBinding.searchContactRv");
            C103009m b = C79317n.m96016b(e);
            int c6 = b != null ? b.mo85796c6() : 0;
            if (!z) {
                WxRecyclerView e2 = yVar.mo108911j3().mo109047e();
                C87412m.m108593f(e2, "uiBinding.searchContactRv");
                MvvmList a = C79317n.m96015a(e2);
                if (a != null && (arrayList = a.f272353o) != null) {
                    int i2 = 0;
                    for (T next : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C77020b bVar = (C77020b) next;
                            if (bVar.f225009h.mo105660b() != i || !bVar.f225012n) {
                                i2 = i3;
                            } else {
                                yVar.mo108911j3().mo109049g().mo17155w1();
                                WxRecyclerView e3 = yVar.mo108911j3().mo109047e();
                                C87412m.m108593f(e3, "uiBinding.searchContactRv");
                                WxLinearLayoutManager c = C79317n.m96017c(e3);
                                if (c != null) {
                                    int i4 = i2 + c6;
                                    int i35 = C78938y.m95437i3(yVar);
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(Integer.valueOf(i35));
                                    aVar.mo10233c(Integer.valueOf(i4));
                                    WxLinearLayoutManager wxLinearLayoutManager = c;
                                    C117292a.m165358d(wxLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                    c.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                                    C117292a.m165359e(wxLinearLayoutManager, "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                    return;
                                }
                                return;
                            }
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            WxRecyclerView e4 = yVar.mo108911j3().mo109047e();
            C87412m.m108593f(e4, "uiBinding.searchContactRv");
            WxLinearLayoutManager c2 = C79317n.m96017c(e4);
            if (c2 != null) {
                int i36 = C78938y.m95437i3(yVar);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i36));
                aVar2.mo10233c(0);
                WxLinearLayoutManager wxLinearLayoutManager2 = c2;
                C117292a.m165358d(wxLinearLayoutManager2, aVar2.mo10232b(), "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c2.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(wxLinearLayoutManager2, "com/tencent/mm/ui/mvvm/uic/base/SelectContactScrollBarUIC$SearchScrollBarTouchListener", "scrollToShowHead", "(IZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: xm3.y$c */
    public static final class C78941c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f231816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78941c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f231816d = appCompatActivity;
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92151b(this.f231816d, 56));
        }
    }

    /* renamed from: xm3.y$d */
    public static final class C78942d extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78938y f231817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78942d(C78938y yVar) {
            super(1);
            this.f231817d = yVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                C78938y yVar = this.f231817d;
                yVar.mo108911j3().mo109050h().setVisibility(0);
                yVar.mo108911j3().mo109050h().setOnScrollBarTouchListener(new C78939a());
                yVar.mo108911j3().mo109051i().setVisibility(8);
                yVar.mo108911j3().mo109051i().setOnScrollBarTouchListener(new C78940b());
            }
            C64958n nVar = (C64958n) wVar.checkAction(C64958n.class);
            if (nVar != null) {
                C78938y yVar2 = this.f231817d;
                if (!C112551y.m153811k(nVar.f187041b)) {
                    IStateActionResult result = nVar.getResult();
                    if (result == null || !(result instanceof C78064o)) {
                        result = null;
                    } else if (((C78064o) result).f228812d) {
                        yVar2.mo108911j3().mo109051i().setVisibility(0);
                    } else {
                        yVar2.mo108911j3().mo109051i().setVisibility(8);
                    }
                    if (((C78064o) result) == null) {
                        yVar2.mo108911j3().mo109051i().setVisibility(8);
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                    yVar2.mo108911j3().mo109050h().setVisibility(8);
                } else {
                    yVar2.mo108911j3().mo109051i().setVisibility(8);
                    yVar2.mo108911j3().mo109050h().setVisibility(0);
                }
            }
            C78071z zVar = (C78071z) wVar.checkAction(C78071z.class);
            if (zVar != null) {
                C78938y yVar3 = this.f231817d;
                IStateActionResult result2 = zVar.getResult();
                if (result2 != null && (result2 instanceof C78048a0) && ((C78048a0) result2).f228787b == C78048a0.C78049a.Success) {
                    zVar.f228837a.getClass();
                    C77020b bVar = zVar.f228837a;
                    if (bVar.f225009h.mo105663e(bVar)) {
                        yVar3.mo108911j3().mo109051i().setVisibility(8);
                        yVar3.mo108911j3().mo109050h().setVisibility(0);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.y$e */
    public static final class C78943e extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78938y f231818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78943e(C78938y yVar) {
            super(0);
            this.f231818d = yVar;
        }

        public Object invoke() {
            return new C79115l(this.f231818d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78938y(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f231810d = C36568h.m40985a(new C78941c(appCompatActivity));
    }

    /* renamed from: i3 */
    public static final int m95437i3(C78938y yVar) {
        return ((Number) ((C36570n) yVar.f231810d).getValue()).intValue();
    }

    /* renamed from: j3 */
    public final C79115l mo108911j3() {
        return (C79115l) ((C36570n) this.f231811e).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78942d(this));
        }
    }
}
