package com.tencent.p014mm.p136ui.mvvm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmlist.BaseMvvmListActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C76879j;
import o31.C11345b;
import o31.C76986a;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78051b;
import tm3.C78053c;
import tm3.C78065p;
import tm3.C78069w;
import tm3.C78071z;
import xm3.C66373k;
import xm3.C78916m0;
import xm3.C78937x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/ui/mvvm/MvvmSelectContactUI;", "Lcom/tencent/mm/plugin/mvvmlist/BaseMvvmListActivity;", "Lom3/b;", "<init>", "()V", "ui-selectcontact_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.mvvm.MvvmSelectContactUI */
public final class MvvmSelectContactUI extends BaseMvvmListActivity<C77020b> {

    /* renamed from: e */
    public static final /* synthetic */ int f219922e = 0;

    /* renamed from: d */
    public final C13601g f219923d = C36568h.m40985a(new C74797c(this));

    /* renamed from: com.tencent.mm.ui.mvvm.MvvmSelectContactUI$a */
    public static final class C74795a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MvvmSelectContactUI f219924d;

        public C74795a(MvvmSelectContactUI mvvmSelectContactUI) {
            this.f219924d = mvvmSelectContactUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f219924d.onBackPressed();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.mvvm.MvvmSelectContactUI$b */
    public static final class C74796b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MvvmSelectContactUI f219925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74796b(MvvmSelectContactUI mvvmSelectContactUI) {
            super(1);
            this.f219925d = mvvmSelectContactUI;
        }

        public Object invoke(Object obj) {
            UIStateCenter stateCenter;
            UIStateCenter stateCenter2;
            IStateActionResult result;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C64961s) wVar.checkAction(C64961s.class)) != null) {
                this.f219925d.setMMTitle(wVar.f228820e);
            }
            MvvmSelectContactUI mvvmSelectContactUI = this.f219925d;
            IStateAction action = wVar.getAction();
            C78053c cVar = null;
            if (action != null && (action instanceof C78071z) && (result = ((C78071z) action).getResult()) != null && (result instanceof C78048a0)) {
                C78048a0 a0Var = (C78048a0) result;
                if (a0Var.f228786a == C78048a0.C78050b.Add && a0Var.f228787b == C78048a0.C78049a.MaxLimit) {
                    String stringExtra = mvvmSelectContactUI.getIntent().getStringExtra("too_many_member_tip_string");
                    if (stringExtra == null) {
                        stringExtra = mvvmSelectContactUI.getString(C0966R.string.iiv, new Object[]{Integer.valueOf(wVar.f228823h)});
                    }
                    C87412m.m108593f(stringExtra, "intent.getStringExtra(Co…_tips, state.maxLimitNum)");
                    C76879j.m92749t(mvvmSelectContactUI.getContext(), stringExtra, "", (DialogInterface.OnClickListener) null);
                }
            }
            C78051b bVar = (C78051b) wVar.checkAction(C78051b.class);
            if (bVar != null) {
                MvvmSelectContactUI mvvmSelectContactUI2 = this.f219925d;
                IStateActionResult result2 = bVar.getResult();
                if (result2 != null && (result2 instanceof C78053c)) {
                    if (!((C78053c) result2).f228795a && (stateCenter2 = mvvmSelectContactUI2.getStateCenter()) != null) {
                        LinkedList<String> linkedList = wVar.f228826n;
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                        for (String add : linkedList) {
                            arrayList.add(add);
                        }
                        stateCenter2.dispatch(new C78065p(arrayList, -1));
                    }
                    cVar = result2;
                }
                if (cVar == null && (stateCenter = mvvmSelectContactUI2.getStateCenter()) != null) {
                    LinkedList<String> linkedList2 = wVar.f228826n;
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
                    for (String add2 : linkedList2) {
                        arrayList2.add(add2);
                    }
                    stateCenter.dispatch(new C78065p(arrayList2, -1));
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.mvvm.MvvmSelectContactUI$c */
    public static final class C74797c extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ MvvmSelectContactUI f219926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74797c(MvvmSelectContactUI mvvmSelectContactUI) {
            super(0);
            this.f219926d = mvvmSelectContactUI;
        }

        public Object invoke() {
            MvvmSelectContactUI mvvmSelectContactUI = this.f219926d;
            int i = MvvmSelectContactUI.f219922e;
            return new C79115l(mvvmSelectContactUI.getContentView());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bjl;
    }

    public boolean isContentAtTop() {
        return !((C79115l) ((C36570n) this.f219923d).getValue()).mo109049g().canScrollVertically(-1);
    }

    public void onBackPressed() {
        hideVKB();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C74795a(this));
        UIStateCenter stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.observe((C0125s) this, new C74796b(this));
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.SelectContactUI).mo86179qs(this, C76986a.NewGroupChat);
    }

    public void onResume() {
        super.onResume();
        UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
        updateSearchIndexAtOnceEvent.publish();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C66373k.class);
        hashSet.add(C78916m0.class);
        hashSet.add(C78937x.class);
    }
}
