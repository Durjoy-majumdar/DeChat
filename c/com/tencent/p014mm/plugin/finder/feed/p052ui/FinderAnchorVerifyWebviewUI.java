package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import ke3.C88144b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAnchorVerifyWebviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderAnchorVerifyWebviewUI */
public final class FinderAnchorVerifyWebviewUI extends MMFinderUI {

    /* renamed from: o */
    public String f14203o;

    public int getLayoutId() {
        return C0966R.C0971layout.aex;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        String stringExtra = getIntent().getStringExtra("KEY_URL");
        this.f14203o = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            finish();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("rawUrl", this.f14203o);
        C88144b.m109795m(getContext(), "webview", ".ui.tools.WebViewUI", intent, 20003);
    }
}
