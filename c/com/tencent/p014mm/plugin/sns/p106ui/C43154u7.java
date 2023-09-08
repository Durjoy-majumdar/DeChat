package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.u7 */
public class C43154u7 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUserUI f116736d;

    public C43154u7(SnsUserUI snsUserUI) {
        this.f116736d = snsUserUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$15");
        Intent intent = new Intent();
        intent.setClass(this.f116736d, SnsMsgUI.class);
        intent.putExtra("sns_msg_force_show_all", false);
        intent.putExtra("sns_msg_comment_list_scene", 2);
        this.f116736d.startActivityForResult(intent, 8);
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$15");
        return true;
    }
}
