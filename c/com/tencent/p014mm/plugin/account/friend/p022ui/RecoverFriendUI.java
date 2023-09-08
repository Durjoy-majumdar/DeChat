package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.friend.model.C68399b;
import com.tencent.p014mm.plugin.account.friend.model.RecoverFriendPresenter;
import com.tencent.p014mm.plugin.account.friend.widget.RecoverFriendSortView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import hg0.C59885c1;
import mg0.C76754b;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverFriendUI */
public class RecoverFriendUI extends MMActivity {

    /* renamed from: d */
    public RecoverFriendPresenter f196616d = new RecoverFriendPresenter(this);

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverFriendUI$a */
    public class C68428a implements MenuItem.OnMenuItemClickListener {
        public C68428a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RecoverFriendUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bqv;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_session_id");
        String stringExtra2 = getIntent().getStringExtra("key_old_username");
        RecoverFriendPresenter recoverFriendPresenter = this.f196616d;
        recoverFriendPresenter.f196530h = stringExtra;
        recoverFriendPresenter.f196529g = stringExtra2;
        setMMTitle((int) C0966R.string.fqv);
        RecoverFriendPresenter recoverFriendPresenter2 = this.f196616d;
        recoverFriendPresenter2.getClass();
        Log.m105924i("MicroMsg.RecoverFriendPresenter", "onUICreate");
        recoverFriendPresenter2.f196527e = (RecoverFriendSortView) recoverFriendPresenter2.f196526d.findViewById(C0966R.C0970id.efm);
        C86709a0.m107524d().mo123455a(3513, recoverFriendPresenter2);
        String str = recoverFriendPresenter2.f196529g;
        int i = 0;
        Cursor rawQuery = ((C76754b) C86312j.m106911c(C76754b.class)).mo105753zo().rawQuery("SELECT seq FROM OldAccountFriend WHERE oldUsername = " + C91753f.m115264e(str) + "ORDER BY " + TPReportKeys.Common.COMMON_SEQ + " DESC", new String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    i = rawQuery.getInt(0);
                }
            } finally {
                rawQuery.close();
            }
        }
        recoverFriendPresenter2.mo93945e(i);
        recoverFriendPresenter2.f196527e.getScrollBar().setVisibility(8);
        recoverFriendPresenter2.f196527e.getListView().setOnScrollListener(new C59885c1(recoverFriendPresenter2));
        RecoverFriendSortView recoverFriendSortView = recoverFriendPresenter2.f196527e;
        recoverFriendSortView.f196618s = recoverFriendPresenter2.f196529g;
        recoverFriendSortView.setOnItemClickListener(new C68399b(recoverFriendPresenter2));
        recoverFriendPresenter2.alive();
        setBackBtn(new C68428a());
    }

    public void onDestroy() {
        super.onDestroy();
        RecoverFriendPresenter recoverFriendPresenter = this.f196616d;
        recoverFriendPresenter.getClass();
        Log.m105924i("MicroMsg.RecoverFriendPresenter", "onUIDestroy");
        C86709a0.m107524d().mo123470p(3513, recoverFriendPresenter);
        recoverFriendPresenter.dead();
    }
}
