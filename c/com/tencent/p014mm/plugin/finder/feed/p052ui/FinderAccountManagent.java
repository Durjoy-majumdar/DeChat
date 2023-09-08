package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import ct1.C7131a;
import di0.C86299o;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import ke3.C88144b;
import kotlin.Metadata;
import kr0.C76630x0;
import pj3.C47511g;
import rx3.C13601g;
import rx3.C36568h;
import te3.C48646a1;
import te3.C48790b1;
import te3.C51901x0;
import vf1.C14714a;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAccountManagent;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent */
public final class FinderAccountManagent extends MMPreference {

    /* renamed from: g */
    public static final /* synthetic */ int f14197g = 0;

    /* renamed from: d */
    public boolean f14198d = true;

    /* renamed from: e */
    public C51901x0 f14199e;

    /* renamed from: f */
    public final C13601g f14200f = C36568h.m40985a(new C2863a(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent$a */
    public static final class C2863a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountManagent f14201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2863a(FinderAccountManagent finderAccountManagent) {
            super(0);
            this.f14201d = finderAccountManagent;
        }

        public Object invoke() {
            Intent intent = this.f14201d.getIntent();
            int i = FinderAccountManagent.f14197g;
            return intent.getStringExtra("ACCOUNT_USERNAME");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent$b */
    public static final class C2864b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountManagent f14202d;

        public C2864b(FinderAccountManagent finderAccountManagent) {
            this.f14202d = finderAccountManagent;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14202d.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo2942H7(boolean z) {
        LinkedList<C48646a1> linkedList;
        LinkedList<C48790b1> linkedList2;
        LinkedList<C48790b1> linkedList3;
        if (z) {
            getPreferenceScreen().removeAll();
        }
        C51901x0 x0Var = this.f14199e;
        boolean z2 = false;
        if (!(x0Var == null || (linkedList3 = x0Var.f144376e) == null || !(!linkedList3.isEmpty()))) {
            z2 = true;
        }
        if (z2) {
            C51901x0 x0Var2 = this.f14199e;
            if (!(x0Var2 == null || (linkedList2 = x0Var2.f144376e) == null)) {
                for (C48790b1 b1Var : linkedList2) {
                    C87412m.m108593f(b1Var, LocaleUtil.ITALIAN);
                    PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(this, (AttributeSet) null);
                    preferenceTitleCategory.mo69924H(b1Var.f130879d);
                    getPreferenceScreen().mo72527k(preferenceTitleCategory);
                    LinkedList<C48646a1> linkedList4 = b1Var.f130880e;
                    C87412m.m108593f(linkedList4, "acctConfigGroup.configs");
                    for (C48646a1 a1Var : linkedList4) {
                        C47511g preferenceScreen = getPreferenceScreen();
                        C87412m.m108593f(a1Var, LocaleUtil.ITALIAN);
                        preferenceScreen.mo72527k(new C7131a(a1Var, this));
                    }
                }
            }
        } else {
            C51901x0 x0Var3 = this.f14199e;
            if (!(x0Var3 == null || (linkedList = x0Var3.f144375d) == null)) {
                for (C48646a1 a1Var2 : linkedList) {
                    C47511g preferenceScreen2 = getPreferenceScreen();
                    C87412m.m108593f(a1Var2, LocaleUtil.ITALIAN);
                    preferenceScreen2.mo72527k(new C7131a(a1Var2, this));
                }
            }
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8895ap;
    }

    public void initView() {
        super.initView();
        mo2942H7(false);
    }

    public void onCreate(Bundle bundle) {
        C51901x0 x0Var;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cxz);
        setBackBtn(new C2864b(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("ACCOUNT_EXTRA_CONFIG");
        if (byteArrayExtra != null) {
            x0Var = new C51901x0();
            x0Var.parseFrom(byteArrayExtra);
        } else {
            x0Var = null;
        }
        this.f14199e = x0Var;
        if (x0Var == null) {
            finish();
        } else {
            initView();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str;
        String str2;
        C87412m.m108592e(preference, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderAccountManagementPref");
        C7131a aVar = (C7131a) preference;
        C48646a1 a1Var = aVar.f25105J;
        Integer valueOf = a1Var != null ? Integer.valueOf(a1Var.f130192g) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            Intent intent = new Intent();
            C48646a1 a1Var2 = aVar.f25105J;
            intent.putExtra("rawUrl", a1Var2 != null ? a1Var2.f130193h : null);
            C88144b.m109791i(aVar.f121274d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            C86299o oVar = new C86299o();
            C48646a1 a1Var3 = aVar.f25105J;
            String str3 = "";
            if (a1Var3 == null || (str = a1Var3.f130189d) == null) {
                str = str3;
            }
            oVar.f250929a = str;
            if (!(a1Var3 == null || (str2 = a1Var3.f130190e) == null)) {
                str3 = str2;
            }
            oVar.f250934f = str3;
            oVar.f250939k = a1Var3 != null ? a1Var3.f130194i : 1000;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(aVar.f121274d, oVar);
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.f14198d) {
            this.f14198d = false;
        } else {
            C53895h.m60466d(getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C14714a(this, (C15601d<? super C14714a>) null), 3, (Object) null);
        }
    }
}
