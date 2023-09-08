package ij2;

import aj2.C54051a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.plugin.repairer.p099ui.RepairerGroupUI;
import com.tencent.p014mm.plugin.repairer.p099ui.uic.RepairerListUIC$buildItemCoverts$1;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj2.C59106c;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hj2.C59926a;
import hj2.C59927b;
import hj2.C59928c;
import hj2.C59930e;
import java.util.LinkedList;
import java.util.List;
import jq3.C60897k;
import jq3.C9493c;
import nj3.C11184p0;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64563mr3;
import uo3.C78253a;
import yb2.C15946a;
import yi2.C16018g;
import z04.C112550d0;
import z04.C112551y;
import zb2.C103009m;
import zb2.C53769h;

/* renamed from: ij2.c */
public final class C60313c extends C15946a {

    /* renamed from: d */
    public MvvmList<C59106c> f171946d;

    /* renamed from: e */
    public C78253a f171947e;

    /* renamed from: f */
    public int f171948f;

    /* renamed from: g */
    public int f171949g;

    /* renamed from: h */
    public final C60316c f171950h = new C60316c(this);

    /* renamed from: ij2.c$a */
    public final class C60314a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final C59106c f171951d;

        /* renamed from: e */
        public final int f171952e;

        public C60314a(C60313c cVar, C59106c cVar2, int i) {
            C87412m.m108594g(cVar2, "dataItem");
            this.f171951d = cVar2;
            this.f171952e = i;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            if (!(contextMenuInfo instanceof AdapterView.AdapterContextMenuInfo)) {
                return;
            }
            if (this.f171951d.f169068e == 1) {
                if (contextMenu != null) {
                    contextMenu.add(this.f171952e, 0, 0, "置顶");
                }
            } else if (contextMenu != null) {
                contextMenu.add(this.f171952e, 1, 0, "取消置顶");
            }
        }
    }

    /* renamed from: ij2.c$b */
    public final class C60315b implements C11184p0 {

        /* renamed from: d */
        public final C59106c f171953d;

        /* renamed from: e */
        public final /* synthetic */ C60313c f171954e;

        public C60315b(C60313c cVar, C59106c cVar2, int i) {
            C87412m.m108594g(cVar2, "dataItem");
            this.f171954e = cVar;
            this.f171953d = cVar2;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            MvvmList<C59106c> mvvmList;
            UIStateCenter stateCenter;
            C59927b bVar;
            MvvmList<C59106c> mvvmList2;
            UIStateCenter stateCenter2;
            C59927b bVar2;
            C104160f fVar = C104160f.RepairerConfig_Inner_TopKey_String;
            if (menuItem != null) {
                C60313c cVar = this.f171954e;
                int itemId = menuItem.getItemId();
                boolean z = true;
                if (itemId == 0) {
                    C79758p pVar = C79758p.f233760a;
                    String g = pVar.mo109884g(fVar, "");
                    Log.m105924i("MicroMsg.Repairer.RepairerListUIC", "favKeyString: " + g);
                    List U = C112550d0.m153785U(g, new String[]{","}, false, 0, 6, (Object) null);
                    if (!U.contains(this.f171953d.f169069f.f184380d)) {
                        LinkedList linkedList = new LinkedList(U);
                        linkedList.add(0, this.f171953d.f169069f.f184380d);
                        pVar.mo109887j(fVar, C110818d0.m150921S(linkedList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                        BaseMvvmActivity d3 = cVar.mo14598d3();
                        if (d3 == null || (stateCenter = d3.getStateCenter()) == null || (bVar = (C59927b) stateCenter.getState()) == null || !bVar.f171034d) {
                            z = false;
                        }
                        if (z && (mvvmList = cVar.f171946d) != null) {
                            C59106c cVar2 = this.f171953d;
                            mvvmList.mo129608k(new C59106c(0, 0, cVar2.f169069f, cVar2.f169070g), false);
                        }
                    }
                } else if (itemId == 1) {
                    C79758p pVar2 = C79758p.f233760a;
                    String g2 = pVar2.mo109884g(fVar, "");
                    Log.m105924i("MicroMsg.Repairer.RepairerListUIC", "favKeyString: " + g2);
                    List U2 = C112550d0.m153785U(g2, new String[]{","}, false, 0, 6, (Object) null);
                    if (U2.contains(this.f171953d.f169069f.f184380d)) {
                        LinkedList linkedList2 = new LinkedList(U2);
                        linkedList2.remove(this.f171953d.f169069f.f184380d);
                        pVar2.mo109887j(fVar, C110818d0.m150921S(linkedList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                        BaseMvvmActivity d35 = cVar.mo14598d3();
                        if (d35 == null || (stateCenter2 = d35.getStateCenter()) == null || (bVar2 = (C59927b) stateCenter2.getState()) == null || !bVar2.f171034d) {
                            z = false;
                        }
                        if (z && (mvvmList2 = cVar.f171946d) != null) {
                            C59106c cVar3 = this.f171953d;
                            mvvmList2.mo129612p(new C59106c(0, 0, cVar3.f169069f, cVar3.f169070g));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ij2.c$c */
    public static final class C60316c implements C60897k<C59106c> {

        /* renamed from: a */
        public final /* synthetic */ C60313c f171955a;

        public C60316c(C60313c cVar) {
            this.f171955a = cVar;
        }

        /* renamed from: a */
        public boolean mo2039a(View view, C9493c cVar, int i) {
            C59106c cVar2 = (C59106c) cVar;
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(cVar2, "data");
            C60313c cVar3 = this.f171955a;
            C78253a aVar = cVar3.f171947e;
            if (aVar != null) {
                C60314a aVar2 = new C60314a(cVar3, cVar2, i);
                C60315b bVar = new C60315b(this.f171955a, cVar2, i);
                C60313c cVar4 = this.f171955a;
                aVar.mo108272g(view, i, 0, aVar2, bVar, cVar4.f171948f, cVar4.f171949g);
            }
            C60897k.C9501a.m9192a(this, view, cVar2, i);
            return false;
        }

        /* renamed from: b */
        public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(motionEvent, "event");
            C87412m.m108594g((C59106c) cVar, "item");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            this.f171955a.f171948f = (int) motionEvent.getRawX();
            this.f171955a.f171949g = (int) motionEvent.getRawY();
            return false;
        }

        /* renamed from: c */
        public void mo2041c(View view, C9493c cVar, int i) {
            C59106c cVar2 = (C59106c) cVar;
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(cVar2, "dataItem");
            C64563mr3 mr32 = cVar2.f169069f;
            int i2 = mr32.f184382f;
            boolean z = true;
            if (i2 == 1) {
                C60313c cVar3 = this.f171955a;
                cVar3.getActivity().startActivityForResult(new Intent(cVar3.getActivity(), RepairerGroupUI.class).putExtra("key_config_item_list", mr32.toByteArray()), 1);
            } else if (i2 == 2) {
                C60313c cVar4 = this.f171955a;
                cVar4.getClass();
                LinkedList<String> linkedList = mr32.f184383g;
                C87412m.m108593f(linkedList, "groupItem.values");
                String str = (String) C110818d0.m150916N(linkedList);
                if (str != null) {
                    cVar4.getActivity().startActivityForResult(new Intent().setClassName(cVar4.getActivity(), str), 0);
                }
            } else if (i2 == 3) {
                C60313c cVar5 = this.f171955a;
                cVar5.getClass();
                C64563mr3 mr33 = cVar2.f169069f;
                String str2 = mr33.f184380d;
                C87412m.m108593f(str2, "configItem.key");
                List U = C112550d0.m153785U(str2, new String[]{"_"}, false, 0, 6, (Object) null);
                LinkedList<String> linkedList2 = mr33.f184383g;
                if (linkedList2.size() <= 0) {
                    z = false;
                }
                if (!z) {
                    linkedList2 = null;
                }
                if (linkedList2 != null) {
                    C77407n nVar = new C77407n((Context) cVar5.getActivity(), 2, false);
                    nVar.f225771i = new C60318d(linkedList2, mr33, cVar5, cVar2, nVar);
                    nVar.f225782p = new C60319e(mr33, U, cVar2, cVar5);
                    nVar.mo107573q();
                    return;
                }
                C16018g gVar = new C16018g(cVar5.getActivity(), mr33.f184381e, cVar2.f169070g, new C60320f(U, mr33, cVar2, cVar5));
                gVar.show();
                Window window = gVar.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
            }
        }
    }

    /* renamed from: ij2.c$d */
    public static final class C60317d extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60313c f171956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60317d(C60313c cVar) {
            super(1);
            this.f171956d = cVar;
        }

        public Object invoke(Object obj) {
            MvvmList<C59106c> mvvmList;
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            C60313c cVar = this.f171956d;
            IStateAction action = bVar.getAction();
            int i = 0;
            if (action != null && (action instanceof C59926a)) {
                C59926a aVar = (C59926a) action;
                WxRecyclerView wxRecyclerView = (WxRecyclerView) cVar.findViewById(C0966R.C0970id.iiq);
                if (wxRecyclerView != null) {
                    wxRecyclerView.setLayoutManager(new WxLinearLayoutManager(cVar.getActivity()));
                }
                MvvmList mvvmList2 = new MvvmList(new C54051a(aVar.f171033a, bVar.f171034d), new C53769h(), cVar.getActivity(), (LifecycleScope) null, (List) null, 24, (C8480h) null);
                if (wxRecyclerView != null) {
                    C103009m mVar = new C103009m(mvvmList2, new RepairerListUIC$buildItemCoverts$1(), false);
                    mVar.f165746y = cVar.f171950h;
                    wxRecyclerView.setAdapter(mVar);
                }
                cVar.f171946d = mvvmList2;
                cVar.f171947e = new C78253a(cVar.getActivity());
            }
            C60313c cVar2 = this.f171956d;
            IStateAction action2 = bVar.getAction();
            if (action2 != null && (action2 instanceof C59930e) && C112551y.m153811k(((C59930e) action2).f171039a) && (mvvmList = cVar2.f171946d) != null) {
                mvvmList.mo129609m();
            }
            C60313c cVar3 = this.f171956d;
            IStateAction action3 = bVar.getAction();
            if (action3 != null && (action3 instanceof C59928c)) {
                LinkedList linkedList = new LinkedList();
                for (T next : ((C59928c) action3).f171037a) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C64563mr3 mr32 = (C64563mr3) next;
                        linkedList.add(new C59106c(i, 1, mr32, C54051a.f151339g.mo74708a(mr32)));
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                MvvmList<C59106c> mvvmList3 = cVar3.f171946d;
                if (mvvmList3 != null) {
                    mvvmList3.mo129613q(linkedList);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60313c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        MvvmList<C59106c> mvvmList;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && (mvvmList = this.f171946d) != null) {
            mvvmList.mo129609m();
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C60317d(this));
        }
    }
}
