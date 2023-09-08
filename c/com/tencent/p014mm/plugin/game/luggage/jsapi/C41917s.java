package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.autogen.events.QueryGameLifeMsgEvent;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Map;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import sw1.C48467i;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.s */
public final class C41917s extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.s$a */
    public static final class C41918a implements C15913g.C15916c {

        /* renamed from: a */
        public final /* synthetic */ QueryGameLifeMsgEvent f112924a;

        /* renamed from: b */
        public final /* synthetic */ C41917s f112925b;

        /* renamed from: c */
        public final /* synthetic */ C43620m2.C5947b f112926c;

        public C41918a(QueryGameLifeMsgEvent queryGameLifeMsgEvent, C41917s sVar, C43620m2.C5947b bVar) {
            this.f112924a = queryGameLifeMsgEvent;
            this.f112925b = sVar;
            this.f112926c = bVar;
        }

        /* renamed from: a */
        public final void mo445a(Map<String, C15912f> map) {
            C15912f fVar = map.get(this.f112924a.f107703d.f107706c);
            this.f112925b.getClass();
            Object[] objArr = new Object[2];
            objArr[0] = fVar != null ? fVar.getAvatarUrl() : null;
            objArr[1] = this.f112924a.f107703d.f107705b;
            Log.m105925i("fetchGameCenterEntranceInfo", "gameLifeEvent isShow = true iconUrl:%s , wording:%s", objArr);
            C43620m2.C5947b bVar = this.f112926c;
            JSONObject jSONObject = new JSONObject();
            QueryGameLifeMsgEvent queryGameLifeMsgEvent = this.f112924a;
            jSONObject.put("iconUrl", fVar != null ? fVar.getAvatarUrl() : null);
            jSONObject.put("wording", queryGameLifeMsgEvent.f107703d.f107705b);
            jSONObject.put("unReadCount", queryGameLifeMsgEvent.f107703d.f107707d);
            jSONObject.put("msgType", 3);
            bVar.mo6945a((String) null, jSONObject);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "fetchGameCenterEntranceInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null && context != null) {
            QueryGameLifeMsgEvent queryGameLifeMsgEvent = new QueryGameLifeMsgEvent();
            queryGameLifeMsgEvent.publish();
            C48467i iVar = C48467i.C48470c.f129676a;
            C48467i.C48469b bVar2 = iVar.f129671a;
            if (bVar2 != null) {
                JSONObject jSONObject = new JSONObject();
                String str2 = bVar2.f129672a;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                jSONObject.put("iconUrl", str2);
                String str4 = bVar2.f129673b;
                if (str4 == null) {
                    str4 = str3;
                }
                jSONObject.put("wording", str4);
                String str5 = bVar2.f129674c;
                if (str5 != null) {
                    str3 = str5;
                }
                jSONObject.put("noticeId", str3);
                jSONObject.put("msgType", bVar2.f129675d);
                bVar.mo6945a((String) null, jSONObject);
                Log.m105924i("fetchGameCenterEntranceInfo", "cacheMsg exist iconUrl = " + bVar2.f129672a + "  , wording = " + bVar2.f129673b + ", msgType= " + bVar2.f129675d);
                iVar.f129671a = null;
                return;
            }
            ((C15913g) C86312j.m106911c(C15913g.class)).xt0(queryGameLifeMsgEvent.f107703d.f107706c, new C41918a(queryGameLifeMsgEvent, this, bVar));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
