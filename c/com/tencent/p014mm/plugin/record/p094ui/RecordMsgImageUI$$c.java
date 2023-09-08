package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11184p0;
import p159gw.C98250h;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$c */
public class RecordMsgImageUI$$c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgImageUI f20379d;

    public RecordMsgImageUI$$c(RecordMsgImageUI recordMsgImageUI) {
        this.f20379d = recordMsgImageUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C93624e J7 = this.f20379d.mo129708J7();
        if (J7 == null) {
            Log.m105920e("MicroMsg.ShowImageUI", "onMMMenuItemSelected: dataItem is null");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            String w = J7.mo128537w();
            String j = J7.mo128524j();
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            if (C86013q1.m106450k(w)) {
                intent.putExtra("image_path", w);
            } else {
                intent.putExtra("image_path", j);
            }
            intent.putExtra("Retr_Msg_Type", 1);
            C88144b.m109802t(this.f20379d.getContext(), ".ui.transmit.SelectConversationUI", intent, 1);
        } else if (itemId == 1) {
            this.f20379d.mo129706H7();
        } else if (itemId == 2) {
            RecordMsgImageUI recordMsgImageUI = this.f20379d;
            String j2 = J7.mo128524j();
            recordMsgImageUI.getClass();
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(recordMsgImageUI.getContext(), j2, new C5042l(recordMsgImageUI, j2));
        }
    }
}
