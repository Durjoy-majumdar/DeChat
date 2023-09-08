package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationUI$$c */
public class SnsSelectConversationUI$$c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsSelectConversationUI f218881d;

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationUI$$c$a */
    public class C74447a implements Runnable {
        public C74447a() {
        }

        public void run() {
            if (!SnsSelectConversationUI$$c.this.f218881d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
                SnsSelectConversationUI$$c.this.f218881d.moveTaskToBack(true);
            }
        }
    }

    public SnsSelectConversationUI$$c(SnsSelectConversationUI snsSelectConversationUI) {
        this.f218881d = snsSelectConversationUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        List<String> list = this.f218881d.f218871I;
        if (list != null) {
            list.size();
        }
        SnsSelectConversationUI snsSelectConversationUI = this.f218881d;
        if (snsSelectConversationUI.mo103485j8(snsSelectConversationUI.f218871I.size())) {
            return false;
        }
        Intent intent = new Intent();
        ArrayList<String> stringsToList = Util.stringsToList((String[]) this.f218881d.f218871I.toArray(new String[0]));
        if (stringsToList == null || stringsToList.size() == 0) {
            intent.putExtra("Select_Contact", "");
        } else {
            intent.putExtra("Select_Contact", Util.listToString(stringsToList, ","));
        }
        this.f218881d.setResult(-1, intent);
        this.f218881d.finish();
        MMHandlerThread.postToMainThreadDelayed(new C74447a(), 100);
        this.f218881d.hideVKB();
        return true;
    }
}
