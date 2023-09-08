package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$x */
public class SnsTimeLineUI$$x implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f116639d;

    public SnsTimeLineUI$$x(SnsTimeLineUI snsTimeLineUI) {
        this.f116639d = snsTimeLineUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$42");
        Intent intent = new Intent();
        intent.setClass(this.f116639d, SnsMsgUI.class);
        intent.putExtra("sns_msg_force_show_all", true);
        intent.putExtra("sns_msg_comment_list_scene", 1);
        this.f116639d.startActivityForResult(intent, 8);
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$42");
        return true;
    }
}
