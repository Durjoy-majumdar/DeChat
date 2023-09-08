package com.tencent.p014mm.chatroom.p015ui;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SelectServiceNotifySenderUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import kv1.C99254i;
import lv1.C99667f;

/* renamed from: com.tencent.mm.chatroom.ui.g2 */
public class C67960g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f195080d;

    /* renamed from: e */
    public final /* synthetic */ SelectServiceNotifySenderUI.C67939d f195081e;

    public C67960g2(SelectServiceNotifySenderUI.C67939d dVar, String str) {
        this.f195081e = dVar;
        this.f195080d = str;
    }

    public void run() {
        String str;
        this.f195081e.notifyDataSetChanged();
        List<SelectServiceNotifySenderUI.C67941e> list = this.f195081e.f195028h;
        if (list == null || list.size() != 0) {
            SelectServiceNotifySenderUI.this.f195010d.setVisibility(0);
            SelectServiceNotifySenderUI.this.f195017n.setVisibility(8);
            str = "1";
        } else {
            SelectServiceNotifySenderUI.this.f195010d.setVisibility(8);
            SelectServiceNotifySenderUI selectServiceNotifySenderUI = SelectServiceNotifySenderUI.this;
            TextView textView = selectServiceNotifySenderUI.f195017n;
            String string = selectServiceNotifySenderUI.getString(C0966R.string.igo);
            String string2 = SelectServiceNotifySenderUI.this.getString(C0966R.string.ign);
            String str2 = this.f195080d;
            textView.setText(C99254i.m129307d(string, string2, C99667f.m130088a(str2, str2, false, false)).f292107a);
            SelectServiceNotifySenderUI.this.f195017n.setVisibility(0);
            str = "0";
        }
        C115669n.INSTANCE.mo160131h(23903, 8, Long.valueOf(Util.nowSecond()), str, 2);
    }
}
