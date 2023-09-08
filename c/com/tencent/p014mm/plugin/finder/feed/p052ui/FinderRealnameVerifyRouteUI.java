package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderRealNameVertifyFinishEvent;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import di3.C86312j;
import er1.C58684b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRealnameVerifyRouteUI;", "Landroid/app/Activity;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRealnameVerifyRouteUI */
public final class FinderRealnameVerifyRouteUI extends HellActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.aqx);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (getIntent().getBooleanExtra("enterRealnameVerifyUI", false)) {
            ((C58684b) C86312j.m106911c(C58684b.class)).Ay0(this, "");
        } else {
            new FinderRealNameVertifyFinishEvent().publish();
            finish();
        }
        overridePendingTransition(0, 0);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}
