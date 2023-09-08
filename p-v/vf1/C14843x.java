package vf1;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFriendLikeTimelineUI;
import ke3.C88144b;
import nj3.C11184p0;

/* renamed from: vf1.x */
public final class C14843x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderFriendLikeTimelineUI f40842d;

    public C14843x(FinderFriendLikeTimelineUI finderFriendLikeTimelineUI) {
        this.f40842d = finderFriendLikeTimelineUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            FinderFriendLikeTimelineUI finderFriendLikeTimelineUI = this.f40842d;
            C88144b.m109791i(finderFriendLikeTimelineUI, "setting", ".ui.setting.SettingsPrivacyUI", finderFriendLikeTimelineUI.getIntent(), (Bundle) null);
        }
    }
}
