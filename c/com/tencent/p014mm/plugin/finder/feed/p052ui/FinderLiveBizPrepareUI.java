package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44247d0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44305j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44365w;
import di3.C86312j;
import e00.C45528u;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import vf1.C52874t1;
import vf1.C52875u1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizPrepareUI */
public final class FinderLiveBizPrepareUI extends MMFinderUI {

    /* renamed from: o */
    public String f111508o = "";

    /* renamed from: p */
    public C44247d0 f111509p;

    public int getLayoutId() {
        return C0966R.C0971layout.d1p;
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        ViewGroup viewGroup = null;
        String string2 = extras != null ? extras.getString("finder_biz_live_article_url") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f111508o = string2;
        View findViewById = findViewById(C0966R.C0970id.mu5);
        C87412m.m108593f(findViewById, "findViewById(R.id.article)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        String str = this.f111508o;
        String str2 = "";
        C44305j jVar = r6;
        C44305j jVar2 = new C44305j(0.0f, (String) null, false, 0, true, (Dialog) null, (C44365w) null, 107, (C8480h) null);
        C44247d0 qI = ((C45528u) C86312j.m106911c(C45528u.class)).mo70751qI(this, str, (MMWebView) null, jVar);
        this.f111509p = qI;
        if (qI != null) {
            qI.mo68952m();
            View b = qI.mo68947b();
            ViewParent parent = b != null ? b.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            viewGroup2.addView(b, new ViewGroup.LayoutParams(-1, -1));
        }
        View findViewById2 = findViewById(C0966R.C0970id.k0c);
        C87412m.m108593f(findViewById2, "findViewById(R.id.start_btn)");
        findViewById2.setOnClickListener(new C52874t1(this));
        Bundle extras2 = getIntent().getExtras();
        setMMTitle((extras2 == null || (string = extras2.getString("finder_biz_live_article_title")) == null) ? str2 : string);
        setBackBtn(new C52875u1(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C44247d0 d0Var = this.f111509p;
        if (d0Var != null) {
            d0Var.onDestroy();
        }
    }
}
