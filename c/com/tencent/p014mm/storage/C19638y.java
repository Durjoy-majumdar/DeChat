package com.tencent.p014mm.storage;

import android.content.ContentValues;
import com.tencent.p014mm.autogen.events.BizAdReplaceEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75604z3;
import gy3.C87412m;
import java.util.LinkedList;
import kj2.C117407d;
import rb0.C48009v0;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.y */
public final class C19638y implements Runnable {

    /* renamed from: d */
    public static final C19638y f55634d = new C19638y();

    public final void run() {
        C19627t tVar = C19627t.f55586a;
        if (C87412m.m108589b(C19627t.f55595j, C19627t.f55593h)) {
            Log.m105918d("MicroMsg.BizCardLogic", "replaceTimelineAd lastTranceId=lastReplaceTranceId=" + C19627t.f55595j);
            return;
        }
        C19627t.f55595j = C19627t.f55593h;
        C19623o0 DN = C48009v0.Jx0().mo25783DN(637534257);
        if (DN == null) {
            String str = C19627t.f55593h;
            if (str != null) {
                Log.m105924i("MicroMsg.BizCardLogic", "replaceTimelineAd ad not exist");
                C117407d.INSTANCE.mo182089r(1454, 159, 1);
                if (C19627t.f55580H > 0) {
                    BizAdReplaceEvent bizAdReplaceEvent = new BizAdReplaceEvent();
                    bizAdReplaceEvent.f48082d.f48083a = C19627t.f55580H;
                    bizAdReplaceEvent.publish();
                    return;
                }
                tVar.mo25828b("adReplace", "err_code:5,err_msg:'ad not exist', traceid:'" + str + '\'');
            }
        } else if (DN.field_isRead != 0) {
            Log.m105924i("MicroMsg.BizCardLogic", "replaceTimelineAd ad exposed");
            C117407d.INSTANCE.mo182089r(1454, 158, 1);
            tVar.mo25828b("adReplace", "err_code:1,err_msg:'ad exposed', traceid:'" + C19627t.f55593h + '\'');
        } else if (Util.isEqual(DN.mo25775y2(), C19627t.f55593h)) {
            Log.m105918d("MicroMsg.BizCardLogic", "replaceTimelineAd is same ad lastTraceId=" + C19627t.f55593h + '}');
            C117407d.INSTANCE.mo182089r(1454, 161, 1);
            tVar.mo25828b("adReplace", "err_code:4,err_msg:'same traceid', traceid:'" + C19627t.f55593h + '\'');
        } else {
            DN.field_content = tVar.mo25832f().decodeString(tVar.mo25825G("biz_ad_card_data"));
            DN.field_createTime = C75604z3.m90844p();
            C19625p0 Jx0 = C48009v0.Jx0();
            Jx0.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", DN.field_content);
            contentValues.put("createTime", Long.valueOf(DN.field_createTime));
            C91753f fVar = Jx0.f55550d;
            boolean z = true;
            int update = fVar.update("BizTimeLineInfo", contentValues, " msgId = ?", new String[]{"" + DN.field_msgId});
            if (update > 0) {
                p0$$f p0__f = new p0$$f();
                p0__f.f55564c = DN.field_talker;
                LinkedList linkedList = new LinkedList();
                p0__f.f55565d = linkedList;
                linkedList.add(DN);
                p0__f.f55562a = p0$$g.UPDATE;
                Jx0.mo25805jo(p0__f);
            }
            if (update <= 0) {
                z = false;
            }
            tVar.mo25832f().encode(tVar.mo25825G("biz_ad_card_data"), "");
            C117407d.INSTANCE.mo182089r(1454, 157, 1);
            tVar.mo25828b("adReplace", "err_code:0,err_msg:'ok', traceid:'" + C19627t.f55593h + '\'');
            C19627t.f55593h = null;
            C19627t.f55596k = null;
            Log.m105924i("MicroMsg.BizCardLogic", "replaceTimelineAd result: " + z + ", msgId:" + DN.field_msgId + " orderFlag:" + DN.field_orderFlag + " aid: " + DN.mo25764n2() + " traceid:" + DN.mo25775y2());
        }
    }
}
