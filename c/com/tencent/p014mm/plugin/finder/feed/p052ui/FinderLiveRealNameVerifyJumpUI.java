package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import di3.C86312j;
import in3.C87773e;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import nj3.C88989a;
import zb3.C66782d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveRealNameVerifyJumpUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI */
public final class FinderLiveRealNameVerifyJumpUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveRealNameVerifyJumpUI$a */
    public static final class C55831a implements C66782d.C53770a {

        /* renamed from: a */
        public static final C55831a f159010a = new C55831a();

        public final void onProcessEnd(int i, Bundle bundle) {
            WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = new WalletRealNameResultNotifyEvent();
            walletRealNameResultNotifyEvent.f9603d.f9604a = i;
            walletRealNameResultNotifyEvent.publish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqx;
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        hideTitleView();
        C87773e.m109211d(getWindow());
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        if (getIntent().getBooleanExtra("enterRealnameVerifyUI", false)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("realname_verify_process_jump_activity", FinderLiveRealNameVerifyJumpUI.class.getName());
            bundle2.putString("realname_verify_process_jump_plugin", "finder");
            WeakReference<Activity> f = AppForegroundDelegate.INSTANCE.mo174212f();
            ((C66782d) C86312j.m106911c(C66782d.class)).cc0(f != null ? f.get() : null, bundle2, C55831a.f159010a);
        } else {
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
