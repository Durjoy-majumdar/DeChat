package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.SnsVideoMenuEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$g */
public class SnsOnlineVideoActivity$$g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f278429d;

    public SnsOnlineVideoActivity$$g(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f278429d = snsOnlineVideoActivity;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
        int itemId = menuItem.getItemId();
        boolean z = true;
        if (itemId == 1003) {
            SnsOnlineVideoActivity snsOnlineVideoActivity = this.f278429d;
            int i2 = SnsOnlineVideoActivity.f278370y0;
            SnsMethodCalculate.markStartTimeMs("access$3202", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            snsOnlineVideoActivity.f278412v = true;
            SnsMethodCalculate.markEndTimeMs("access$3202", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            SnsVideoMenuEvent snsVideoMenuEvent = new SnsVideoMenuEvent();
            SnsVideoMenuEvent.C92599a aVar = snsVideoMenuEvent.f265214d;
            aVar.f265215a = 1;
            aVar.f265219e = 4097;
            aVar.f265218d = SnsOnlineVideoActivity.m122196K7(this.f278429d);
            snsVideoMenuEvent.publish();
            C94891k2.f274975a.mo131070c(SnsOnlineVideoActivity.m122195J7(this.f278429d), 1);
        } else if (itemId == 1004) {
            Intent intent = new Intent();
            SnsInfo DN = C94866e1.Yx0().mo139798DN(SnsOnlineVideoActivity.m122196K7(this.f278429d));
            if (DN != null) {
                Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "expose id " + DN.getSnsId());
            }
            intent.putExtra("k_expose_msg_id", DN == null ? 0 : DN.getSnsId());
            intent.putExtra("k_username", DN == null ? "" : DN.field_userName);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{33}));
            C88144b.m109791i(this.f278429d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (itemId == 1006) {
            SnsVideoMenuEvent snsVideoMenuEvent2 = new SnsVideoMenuEvent();
            SnsVideoMenuEvent.C92599a aVar2 = snsVideoMenuEvent2.f265214d;
            aVar2.f265215a = 2;
            aVar2.f265216b = 17;
            SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f278429d;
            int i3 = SnsOnlineVideoActivity.f278370y0;
            SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            int i4 = snsOnlineVideoActivity2.f278400h;
            SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            if (i4 != 0) {
                z = false;
            }
            aVar2.f265217c = z;
            snsVideoMenuEvent2.f265214d.f265218d = SnsOnlineVideoActivity.m122196K7(this.f278429d);
            snsVideoMenuEvent2.publish();
        } else if (itemId == 1008) {
            SnsInfo DN2 = C94866e1.Yx0().mo139798DN(SnsOnlineVideoActivity.m122196K7(this.f278429d));
            if (DN2 == null) {
                SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
                return;
            }
            Intent intent2 = new Intent();
            if (DN2.getTimeLine().ContentObj.f298424e == 15 && DN2.getTimeLine().ContentObj.f298427h.get(0) == null) {
                Log.m105928w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
                SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
                return;
            }
            intent2.putExtra("exdevice_open_scene_type", 2);
            intent2.putExtra("sns_local_id", SnsOnlineVideoActivity.m122196K7(this.f278429d));
            intent2.putExtra("sns_send_data_ui_activity", true);
            C88144b.m109801s(this.f278429d, ".ui.chatting.ChattingSendDataToDeviceUI", intent2, (Bundle) null);
        } else if (itemId == 1013) {
            SnsVideoMenuEvent snsVideoMenuEvent3 = new SnsVideoMenuEvent();
            SnsVideoMenuEvent.C92599a aVar3 = snsVideoMenuEvent3.f265214d;
            aVar3.f265215a = 3;
            aVar3.f265218d = SnsOnlineVideoActivity.m122196K7(this.f278429d);
            snsVideoMenuEvent3.publish();
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$16");
    }
}
