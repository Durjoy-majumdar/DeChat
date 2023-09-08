package com.tencent.p014mm.plugin.repairer.p099ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hj2.C59926a;
import hj2.C59927b;
import hj2.C59930e;
import ij2.C60313c;
import ij2.C60321g;
import ij2.C60326i;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerSearchUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerSearchUI */
public class RepairerSearchUI extends BaseRepairerUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: d */
    public FTSSearchView f163892d;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerSearchUI$a */
    public static final class C57185a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSearchUI f163893d;

        public C57185a(RepairerSearchUI repairerSearchUI) {
            this.f163893d = repairerSearchUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163893d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerSearchUI$b */
    public static final class C57186b extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSearchUI f163894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57186b(RepairerSearchUI repairerSearchUI) {
            super(1);
            this.f163894d = repairerSearchUI;
        }

        public Object invoke(Object obj) {
            FTSEditTextView ftsEditText;
            FTSEditTextView ftsEditText2;
            FTSEditTextView ftsEditText3;
            FTSEditTextView ftsEditText4;
            FTSEditTextView ftsEditText5;
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            RepairerSearchUI repairerSearchUI = this.f163894d;
            IStateAction action = bVar.getAction();
            if (action != null && (action instanceof C59926a)) {
                C59926a aVar = (C59926a) action;
                repairerSearchUI.getClass();
                FTSSearchView fTSSearchView = new FTSSearchView((Context) repairerSearchUI, false);
                repairerSearchUI.f163892d = fTSSearchView;
                fTSSearchView.setSearchViewListener(repairerSearchUI);
                FTSSearchView fTSSearchView2 = repairerSearchUI.f163892d;
                if (!(fTSSearchView2 == null || (ftsEditText5 = fTSSearchView2.getFtsEditText()) == null)) {
                    ftsEditText5.setHint("搜索配置");
                }
                FTSSearchView fTSSearchView3 = repairerSearchUI.f163892d;
                if (!(fTSSearchView3 == null || (ftsEditText4 = fTSSearchView3.getFtsEditText()) == null)) {
                    ftsEditText4.mo70338f();
                }
                FTSSearchView fTSSearchView4 = repairerSearchUI.f163892d;
                if (!(fTSSearchView4 == null || (ftsEditText3 = fTSSearchView4.getFtsEditText()) == null)) {
                    ftsEditText3.setFtsEditTextListener(repairerSearchUI);
                }
                ActionBar supportActionBar = repairerSearchUI.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.mo91114y(repairerSearchUI.f163892d);
                }
                FTSSearchView fTSSearchView5 = repairerSearchUI.f163892d;
                if (!(fTSSearchView5 == null || (ftsEditText2 = fTSSearchView5.getFtsEditText()) == null)) {
                    ftsEditText2.mo70355k();
                }
                FTSSearchView fTSSearchView6 = repairerSearchUI.f163892d;
                if (!(fTSSearchView6 == null || (ftsEditText = fTSSearchView6.getFtsEditText()) == null)) {
                    ftsEditText.mo70361q();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String obj;
        UIStateCenter stateCenter;
        if (str != null && (obj = C112550d0.m153799i0(str).toString()) != null && (stateCenter = getStateCenter()) != null) {
            stateCenter.dispatch(new C59930e(obj));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bt4;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickBackBtn(View view) {
        finish();
    }

    public void onClickCancelBtn(View view) {
        finish();
    }

    public void onClickClearTextBtn(View view) {
        showVKB();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C57185a(this));
        UIStateCenter stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.observe((C0125s) this, new C57186b(this));
        }
    }

    public void onDestroy() {
        hideVKB();
        super.onDestroy();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C60313c.class);
        hashSet.add(C60326i.class);
        hashSet.add(C60321g.class);
    }

    /* renamed from: y */
    public boolean mo3009y() {
        return false;
    }
}
