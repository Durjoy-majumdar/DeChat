package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sendtowework.AppBrandData;
import java.util.HashMap;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.l */
public class C82897l implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ String f242361d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f242362e;

    /* renamed from: f */
    public final /* synthetic */ int f242363f;

    /* renamed from: g */
    public final /* synthetic */ C82900n f242364g;

    public C82897l(C82900n nVar, String str, C81925i2 i2Var, int i) {
        this.f242364g = nVar;
        this.f242361d = str;
        this.f242362e = i2Var;
        this.f242363f = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("username", this.f242361d);
        C82900n nVar = this.f242364g;
        C81925i2 i2Var = this.f242362e;
        int i = this.f242363f;
        nVar.getClass();
        String string = bundle.getString("username");
        String string2 = bundle.getString("nickname");
        String string3 = bundle.getString("brandIconURL");
        String string4 = bundle.getString("appId");
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "");
        hashMap.put("type", 1);
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, string2);
        hashMap.put("img_url", string3);
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 3);
        intent.putExtra("appbrand_params", hashMap);
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 5);
        Intent intent2 = intent;
        intent2.putExtra("Select_Data_Send_To_WeWork", new AppBrandData(string, (String) null, string3, (String) null, string2, string2, 1));
        Activity R = i2Var.getRuntime().mo113026R();
        if (R instanceof MMFragmentActivity) {
            C88144b.m109804v((MMFragmentActivity) R, ".ui.transmit.SelectConversationUI", intent2, 1, new C82898m(nVar, string4, string2, string3, i2Var, i, R, string, bundle));
        }
    }
}
