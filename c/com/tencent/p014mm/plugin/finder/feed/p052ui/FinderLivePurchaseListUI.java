package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C87412m;
import java.util.HashSet;
import ke3.C88144b;
import kotlin.Metadata;
import rs1.C13328m6;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePurchaseListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseListUI */
public final class FinderLivePurchaseListUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseListUI$a */
    public static final class C2979a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePurchaseListUI f14581d;

        public C2979a(FinderLivePurchaseListUI finderLivePurchaseListUI) {
            this.f14581d = finderLivePurchaseListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14581d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePurchaseListUI$b */
    public static final class C2980b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePurchaseListUI f14582d;

        public C2980b(FinderLivePurchaseListUI finderLivePurchaseListUI) {
            this.f14582d = finderLivePurchaseListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/vuIelfSGnul4ZGDt");
            C88144b.m109791i(this.f14582d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.mrf);
        setBackBtn(new C2979a(this));
        addTextOptionMenu(1001, getString(C0966R.string.e5j), new C2980b(this));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C13328m6.class);
    }
}
