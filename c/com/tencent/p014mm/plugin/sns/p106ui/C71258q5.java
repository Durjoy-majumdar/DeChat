package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.q5 */
public class C71258q5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsSelectChatRoomUI f206203d;

    public C71258q5(SnsSelectChatRoomUI snsSelectChatRoomUI) {
        this.f206203d = snsSelectChatRoomUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$1");
        SnsSelectChatRoomUI snsSelectChatRoomUI = this.f206203d;
        int i = SnsSelectChatRoomUI.f206144D;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        ArrayList<String> i8 = snsSelectChatRoomUI.mo97961i8(false);
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        snsSelectChatRoomUI.getClass();
        SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        Log.m105925i("MicroMsg.SnsSelectChatRoomUI", "sns post who can see scene,users=%s", i8.toString());
        ArrayList<String> i84 = snsSelectChatRoomUI.mo97961i8(false);
        i84.remove(C75592q0.m90789s());
        String listToString = Util.listToString(i84, ",");
        Intent intent = new Intent();
        intent.putExtra("select_chatrooms", listToString);
        snsSelectChatRoomUI.setResult(-1, intent);
        snsSelectChatRoomUI.finish();
        snsSelectChatRoomUI.mo103379N7().notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$1");
        return true;
    }
}
