package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p214om.C11502f;
import sn2.C48447s;
import te3.C101801kd0;
import te3.C101835rd0;
import te3.C101850ud0;
import un2.C102057c;
import un2.C78239b;

/* renamed from: com.tencent.mm.plugin.shake.ui.f */
public class C94551f implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ TVInfoUI f273422a;

    /* renamed from: com.tencent.mm.plugin.shake.ui.f$a */
    public class C94552a implements C76879j.C76888o {
        public C94552a() {
        }

        /* renamed from: a */
        public void mo5759a(int i, int i2) {
            if (i2 != -1) {
                Log.m105918d("MicroMsg.TVInfoUI", "do del cancel");
                return;
            }
            DeleteFavoriteEvent deleteFavoriteEvent = new DeleteFavoriteEvent();
            deleteFavoriteEvent.f264667d.f264669a = C94551f.this.f273422a.getIntent().getLongExtra("key_favorite_local_id", -1);
            deleteFavoriteEvent.f264667d.f264670b = 8;
            deleteFavoriteEvent.publish();
            Log.m105919d("MicroMsg.TVInfoUI", "do del fav tv, local id %d, result %B", Long.valueOf(deleteFavoriteEvent.f264667d.f264669a), Boolean.valueOf(deleteFavoriteEvent.f264668e.f264671a));
            if (deleteFavoriteEvent.f264668e.f264671a) {
                C94551f.this.f273422a.finish();
            }
        }
    }

    public C94551f(TVInfoUI tVInfoUI) {
        this.f273422a = tVInfoUI;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        if (i2 == -1) {
            C76879j.m92732c(this.f273422a.getContext(), this.f273422a.getContext().getString(C0966R.string.f7946x3), (List<String>) null, (List<Integer>) null, this.f273422a.getContext().getString(C0966R.string.f7944x1), new C94552a());
        } else if (i2 == 0) {
            TVInfoUI tVInfoUI = this.f273422a;
            if (tVInfoUI.f273395i == null) {
                Log.m105928w("MicroMsg.TVInfoUI", "shareToFriend, but tv is null");
                return;
            }
            C115669n.INSTANCE.mo160131h(10987, 4, "", "", "");
            String c = C102057c.m134445c(tVInfoUI.getContext(), tVInfoUI.f273395i);
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_content", c);
            intent.putExtra("Retr_Msg_Type", 2);
            C78239b bVar = tVInfoUI.f273398o;
            if (bVar != null && tVInfoUI.f273399p) {
                intent.putExtra("Retr_Msg_thumb_path", bVar.mo94827k());
            }
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93184q(intent, tVInfoUI);
        } else if (i2 == 1) {
            TVInfoUI tVInfoUI2 = this.f273422a;
            if (tVInfoUI2.f273395i == null) {
                Log.m105928w("MicroMsg.TVInfoUI", "shareToTimeLine, but tv is null");
                return;
            }
            C115669n.INSTANCE.mo160131h(10987, 3, "", "", "");
            Intent intent2 = new Intent();
            if (!Util.isNullOrNil(tVInfoUI2.f273395i.field_topic)) {
                intent2.putExtra("KContentObjDesc", tVInfoUI2.f273395i.field_topic);
            } else {
                intent2.putExtra("KContentObjDesc", tVInfoUI2.f273395i.field_subtitle);
            }
            intent2.putExtra("Ksnsupload_title", tVInfoUI2.f273395i.field_title);
            intent2.putExtra("Ksnsupload_link", tVInfoUI2.f273395i.field_shareurl);
            intent2.putExtra("Ksnsupload_appname", tVInfoUI2.getString(C0966R.string.iev));
            if (C48447s.m53803e()) {
                intent2.putExtra("Ksnsupload_appid", "wxaf060266bfa9a35c");
            }
            intent2.putExtra("Ksnsupload_imgurl", tVInfoUI2.f273395i.field_thumburl);
            C78239b bVar2 = tVInfoUI2.f273398o;
            if (bVar2 != null && tVInfoUI2.f273399p) {
                intent2.putExtra("KsnsUpload_imgPath", bVar2.mo94827k());
            }
            intent2.putExtra("Ksnsupload_type", 5);
            intent2.putExtra("KUploadProduct_UserData", C102057c.m134443a(tVInfoUI2.f273395i));
            String a = C86493v0.m107223a("shake_tv");
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "shake_tv");
            intent2.putExtra("reportSessionId", a);
            C88144b.m109791i(tVInfoUI2, "sns", ".ui.SnsUploadUI", intent2, (Bundle) null);
        } else if (i2 == 2) {
            TVInfoUI tVInfoUI3 = this.f273422a;
            if (tVInfoUI3.f273395i == null) {
                Log.m105928w("MicroMsg.TVInfoUI", "do favorite, but tv is null");
                return;
            }
            C115669n.INSTANCE.mo160131h(10987, 5, "", "", "");
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C101801kd0 kd02 = new C101801kd0();
            C101835rd0 rd02 = new C101835rd0();
            C101850ud0 ud02 = new C101850ud0();
            rd02.mo141275k(C75592q0.m90789s());
            rd02.mo141279o(C75592q0.m90789s());
            rd02.mo141277m(8);
            rd02.mo141273f(Util.nowMilliSecond());
            if (C48447s.m53803e()) {
                rd02.mo141272d("wxaf060266bfa9a35c");
            }
            ud02.mo141318n(tVInfoUI3.f273395i.field_title);
            if (!Util.isNullOrNil(tVInfoUI3.f273395i.field_topic)) {
                ud02.mo141315k(tVInfoUI3.f273395i.field_topic);
            } else {
                ud02.mo141315k(tVInfoUI3.f273395i.field_subtitle);
            }
            ud02.mo141316l(C102057c.m134443a(tVInfoUI3.f273395i));
            ud02.mo141317m(tVInfoUI3.f273395i.field_thumburl);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            C102057c.C102058a aVar2 = tVInfoUI3.f273395i;
            aVar.f264679d = aVar2.field_title;
            aVar.f264680e = aVar2.field_topic;
            aVar.f264676a = kd02;
            aVar.f264678c = 15;
            kd02.mo141219q(rd02);
            kd02.f298604C = ud02;
            kd02.f298605D = true;
            DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
            aVar3.f264688m = 12;
            aVar3.f264684i = tVInfoUI3;
            doFavoriteEvent.publish();
        }
    }
}
