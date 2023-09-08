package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import hh2.C8532a;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import nj3.C11184p0;
import p140cw.C7138g;
import p215oo.C77032h;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$b */
public class RecordMsgImageUI$$b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ RecordMsgImageUI f272653d;

    public RecordMsgImageUI$$b(RecordMsgImageUI recordMsgImageUI) {
        this.f272653d = recordMsgImageUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            RecordMsgImageUI recordMsgImageUI = this.f272653d;
            int i2 = RecordMsgImageUI.f272623H;
            recordMsgImageUI.f272639o = recordMsgImageUI.mo129709K7();
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("image_path", recordMsgImageUI.f272639o);
            ((C77032h) C86312j.m106911c(C77032h.class)).setScene(5);
            C88144b.m109802t(recordMsgImageUI, ".ui.transmit.SelectConversationUI", intent, 1001);
        } else if (itemId == 1) {
            this.f272653d.mo129706H7();
        } else if (itemId == 2) {
            RecordMsgImageUI recordMsgImageUI2 = this.f272653d;
            int i3 = RecordMsgImageUI.f272623H;
            recordMsgImageUI2.getClass();
            ((C7138g) C86312j.m106911c(C7138g.class)).he0(recordMsgImageUI2.mo129709K7(), recordMsgImageUI2.getContext());
        } else if (itemId != 4) {
            if (itemId == 5) {
                RecordMsgImageUI recordMsgImageUI3 = this.f272653d;
                int i4 = RecordMsgImageUI.f272623H;
                String K7 = recordMsgImageUI3.mo129709K7();
                Log.m105925i("MicroMsg.ShowImageUI", "edit image path:%s msgId:%s", K7, Long.valueOf(recordMsgImageUI3.f272638n));
                RecordConfigProvider b = RecordConfigProvider.m119432b(K7, "");
                b.f272905F = 0;
                UICustomParam uICustomParam = new UICustomParam();
                Map<String, Boolean> map = uICustomParam.f266575h;
                Boolean bool = Boolean.TRUE;
                ((HashMap) map).put("plugin_filter", bool);
                ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
                ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
                ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
                b.f272927o = uICustomParam;
                C8532a.f27585a.mo9446e(recordMsgImageUI3.getContext(), 4369, C0966R.C0968anim.f2492eg, -1, b, 1, 2);
            }
        } else if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f272653d.getContext())) {
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265619e = 3;
            galleryTranslateReportStruct.f265620f = 5;
            int selectedItemPosition = this.f272653d.f272635h.getSelectedItemPosition();
            if (-1 != selectedItemPosition) {
                C93624e a = this.f272653d.f272636i.getItem(selectedItemPosition);
                galleryTranslateReportStruct.mo126621t(a.mo128520f());
                galleryTranslateReportStruct.mo126620s(a.mo128519e());
            }
            galleryTranslateReportStruct.mo86054n();
            this.f272653d.f272645u.mo128354a();
        }
    }
}
