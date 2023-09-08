package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C82900n;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82970i0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C45628s0;
import eb0.C86493v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nj3.C76879j;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.m */
public class C82898m implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ String f242365a;

    /* renamed from: b */
    public final /* synthetic */ String f242366b;

    /* renamed from: c */
    public final /* synthetic */ String f242367c;

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f242368d;

    /* renamed from: e */
    public final /* synthetic */ int f242369e;

    /* renamed from: f */
    public final /* synthetic */ Context f242370f;

    /* renamed from: g */
    public final /* synthetic */ String f242371g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f242372h;

    /* renamed from: i */
    public final /* synthetic */ C82900n f242373i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.m$a */
    public class C82899a extends HashMap<String, Object> {
        public C82899a(C82898m mVar, int i, C68070l.C68072b bVar) {
            put("eventID", Integer.valueOf(i));
            put("shareId", bVar.f195589j2);
            put("shareActionType", 0);
            put("shareTitle", bVar.f195570f);
            put("imageUrl", bVar.f195646y);
        }
    }

    public C82898m(C82900n nVar, String str, String str2, String str3, C81925i2 i2Var, int i, Context context, String str4, Bundle bundle) {
        this.f242373i = nVar;
        this.f242365a = str;
        this.f242366b = str2;
        this.f242367c = str3;
        this.f242368d = i2Var;
        this.f242369e = i;
        this.f242370f = context;
        this.f242371g = str4;
        this.f242372h = bundle;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i == 1) {
            boolean z = intent2 != null && intent2.getBooleanExtra("finish_by_forward_to_wework", false);
            Log.m105925i("MicroMsg.ShareSpecificWeapp", "mmOnActivityResult, finishByForwardToWeWork: %b", Boolean.valueOf(z));
            if (z) {
                C82970i0 i0Var = new C82970i0();
                i0Var.f242600a = C82967h0.m101762a(this.f242365a, 0).toString();
                i0Var.f242601b = 0;
                i0Var.f242602c = this.f242366b;
                i0Var.f242604e = this.f242367c;
                HashMap hashMap = new HashMap();
                hashMap.put("actionResult", 1);
                String str = "action success";
                HashMap e = C90364q0.m113146e(new C13604l("shareId", i0Var.f242600a), new C13604l("shareActionType", Integer.valueOf(i0Var.f242601b)), new C13604l("shareTitle", i0Var.f242602c), new C13604l("imageUrl", i0Var.f242604e));
                e.put("eventID", 33);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(e);
                hashMap.put("reportInfo", arrayList);
                C81925i2 i2Var = this.f242368d;
                int i3 = this.f242369e;
                C82900n nVar = this.f242373i;
                nVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap.put("errno", 0);
                i2Var.mo109647a(i3, nVar.mo115114o("ok", hashMap));
                C76879j.m92726T(this.f242370f, MMApplicationContext.getResources().getString(C0966R.string.f360099a34));
                Log.m105924i("MicroMsg.ShareSpecificWeapp", str);
                return;
            }
            String str2 = "action success";
            if (i2 == -1) {
                String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105924i("MicroMsg.ShareSpecificWeapp", "mmOnActivityResult fail, toUser is null");
                    return;
                }
                Log.m105925i("MicroMsg.ShareSpecificWeapp", "result success toUser : %s ", stringExtra);
                String stringExtra2 = intent2.getStringExtra("custom_send_text");
                String str3 = str2;
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C86493v0.m107223a("wxapp_" + this.f242365a), true);
                c.mo120962i("prePublishId", "wxapp_" + this.f242365a);
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195570f = this.f242366b;
                bVar.f195582i = 33;
                bVar.f195573f2 = this.f242371g;
                bVar.f195577g2 = this.f242365a;
                bVar.f195581h2 = 1;
                bVar.f195494H1 = "wxapp_" + this.f242365a;
                bVar.f195646y = this.f242367c;
                bVar.f195586j = C83727p2.m102773c(this.f242365a);
                bVar.f195634v = this.f242371g;
                bVar.f195638w = this.f242366b;
                C80995a aVar = new C80995a();
                aVar.f237905n = this.f242372h.getInt("tradingGuaranteeFlag");
                aVar.f237906o = this.f242372h.getInt("showRelievedBuyFlag");
                bVar.mo93545f(aVar);
                Bundle bundle = new Bundle();
                String str4 = "MicroMsg.ShareSpecificWeapp";
                Object obj = "errno";
                bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f195570f);
                bundle.putInt("type", bVar.f195582i);
                bundle.putString("appbrandUsername", bVar.f195573f2);
                bundle.putString("appbrandAppId", bVar.f195577g2);
                bundle.putInt("appbrandType", bVar.f195581h2);
                bundle.putString("publisherId", bVar.f195494H1);
                bundle.putString("thumburl", bVar.f195646y);
                bundle.putString("url", bVar.f195586j);
                bundle.putString("srcUsername", bVar.f195634v);
                bundle.putString("srcDisplayname", bVar.f195638w);
                bundle.putInt("appbrandTradingGuaranteeFlag", aVar.f237905n);
                bundle.putInt("showRelievedBuyFlag", aVar.f237906o);
                ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
                HashMap hashMap2 = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                hashMap2.put("reportInfo", arrayList2);
                Iterator<String> it = stringsToList.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    int i5 = i4 + 1;
                    bVar.f195589j2 = C82967h0.m101762a(this.f242365a, i4).toString();
                    bundle.putString("username", next);
                    Iterator<String> it4 = it;
                    C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C82900n.C82902b.class, (C1256g) null);
                    if (!Util.isNullOrNil(stringExtra2)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar2 = sendMsgEvent.f9496d;
                        aVar2.f9497a = next;
                        aVar2.f9498b = stringExtra2;
                        aVar2.f9499c = C45628s0.m50810y(next);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                    arrayList2.add(new C82899a(this, next.endsWith("@chatroom") ? 31 : 30, bVar));
                    it = it4;
                    i4 = i5;
                }
                hashMap2.put("actionResult", 1);
                C81925i2 i2Var2 = this.f242368d;
                int i6 = this.f242369e;
                C82900n nVar2 = this.f242373i;
                nVar2.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                hashMap2.put(obj, 0);
                i2Var2.mo109647a(i6, nVar2.mo115114o("ok", hashMap2));
                C76879j.m92726T(this.f242370f, MMApplicationContext.getResources().getString(C0966R.string.f360099a34));
                Log.m105924i(str4, str3);
                return;
            }
            return;
        }
        Object obj2 = "errno";
        String str5 = "MicroMsg.ShareSpecificWeapp";
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        hashMap4.put("eventID", 30);
        arrayList3.add(hashMap4);
        hashMap3.put("reportInfo", arrayList3);
        hashMap3.put("actionResult", 2);
        C81925i2 i2Var3 = this.f242368d;
        int i7 = this.f242369e;
        C82900n nVar3 = this.f242373i;
        nVar3.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap3.put(obj2, 0);
        i2Var3.mo109647a(i7, nVar3.mo115114o("ok", hashMap3));
        Log.m105925i(str5, "action fail, eventID: %s", 30);
    }
}
