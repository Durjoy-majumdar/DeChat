package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import c02.C92331c;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.luggage.C43603j1;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import org.json.JSONObject;
import p828wa.C53096b;
import te3.C64459j13;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.s */
public class C43622s extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "currentMpInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        JSONObject jSONObject = aVar.f148190b.f129368c;
        String optString = jSONObject.optString("brandIcon");
        String optString2 = jSONObject.optString("brandName");
        String optString3 = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Log.m105925i("MicroMsg.JsApiCurrentMpInfo", "doCurrentMpInfo brandIcon:%s", optString);
        if (!Util.isNullOrNil(optString)) {
            ((C43658n) aVar.f148189a).f117916F.mo149076p0(optString);
            C43603j1 j1Var = ((C43658n) aVar.f148189a).f117917G;
            j1Var.getClass();
            C87412m.m108594g(optString, "icon");
            j1Var.f117857w = optString;
            j1Var.mo160076N(optString);
        }
        if (!Util.isNullOrNil(optString2)) {
            C43603j1 j1Var2 = ((C43658n) aVar.f148189a).f117917G;
            MultiTaskInfo multiTaskInfo = j1Var2.f326418a;
            C64459j13 m2 = multiTaskInfo != null ? multiTaskInfo.mo80305m2() : null;
            if (m2 != null) {
                m2.f183751d = optString2;
            }
            j1Var2.mo160074L();
        }
        if (!Util.isNullOrNil(optString3)) {
            ((C43658n) aVar.f148189a).f117916F.mo67998q0(optString3);
            ((C43658n) aVar.f148189a).f117917G.mo160077O(optString3);
        }
        HandOffURL handOffURL = ((C43658n) aVar.f148189a).f117918H;
        if (handOffURL != null) {
            handOffURL.setIcon(Util.nullAsNil(optString));
            if (!Util.isNullOrNil(optString2)) {
                ((C43658n) aVar.f148189a).f117918H.setTitle(optString2);
            }
            ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(((C43658n) aVar.f148189a).f117918H);
        }
        aVar.mo73776a();
    }
}
