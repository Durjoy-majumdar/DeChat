package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ht1.C76245e1;
import nr3.C35015b;
import org.json.JSONObject;
import p1081gi.C98121d;
import p225rc.C89916g;
import p225rc.g$$e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.j */
public class C68615j extends C82268c {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "shareFinderEndorsementToFriend";

    /* renamed from: g */
    public static C35015b f197094g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.j$b */
    public class C55512b implements g$$e {

        /* renamed from: a */
        public final /* synthetic */ C82381f f158104a;

        /* renamed from: b */
        public final /* synthetic */ int f158105b;

        public C55512b(C82381f fVar, int i) {
            this.f158104a = fVar;
            this.f158105b = i;
        }

        /* renamed from: a */
        public void mo1626a(int i, Intent intent) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (i == -1) {
                    jSONObject.put("isSuccess", true);
                    jSONObject.put("isCancel", false);
                    this.f158104a.mo109647a(this.f158105b, C1690a.m1745a("", 0, jSONObject));
                } else if (i == 0) {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put("isCancel", true);
                    this.f158104a.mo109647a(this.f158105b, C1690a.m1745a("", 1, jSONObject));
                } else {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put("isCancel", false);
                    this.f158104a.mo109647a(this.f158105b, C1690a.m1745a("", i, jSONObject));
                }
            } catch (Exception e) {
                Log.m105924i("MicroMsg.Finder.JsApiShareFinderEndorsementToFriend", e.getMessage());
            } catch (Throwable th) {
                C68615j.this.getClass();
                throw th;
            }
            C68615j.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.j$a */
    public class C68616a implements C35015b<C76245e1> {
        public Object get() {
            return new C76245e1();
        }
    }

    static {
        C68616a aVar = new C68616a();
        f197094g = aVar;
        C68070l.C68074c.f195661a.add(aVar);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (!(fVar.getContext() instanceof Activity) || jSONObject == null) {
            fVar.mo109647a(i, "fail");
            return;
        }
        String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        String optString2 = jSONObject.optString("desc", "");
        String optString3 = jSONObject.optString("relativePath", "");
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        jSONObject.optString("sceneNote", "");
        String optString4 = jSONObject.optString("appid", "");
        C68070l.C68072b bVar = new C68070l.C68072b();
        C76245e1 e1Var = new C76245e1();
        e1Var.f223338b = optString;
        e1Var.f223339c = optString2;
        e1Var.f223340d = optString3;
        e1Var.f223342f = optString4;
        e1Var.f223341e = optInt;
        bVar.f195582i = 81;
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        bVar.f195570f = optString;
        bVar.f195517O1 = optString2;
        bVar.mo93545f(e1Var);
        String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
        Log.m105925i("MicroMsg.Finder.JsApiShareFinderEndorsementToFriend", "msgContent %s", s);
        Intent intent = new Intent();
        Context context = fVar.getContext();
        intent.setClassName(context, MMApplicationContext.getSourcePackageName() + ".ui.transmit.MsgRetransmitUI");
        intent.putExtra("Retr_Msg_Type", 19);
        intent.putExtra("Retr_Msg_content", s);
        intent.putExtra("Multi_Retr", false);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        C89916g.m112446a(fVar.getContext()).mo124236j(intent, new C55512b(fVar, i));
    }
}
