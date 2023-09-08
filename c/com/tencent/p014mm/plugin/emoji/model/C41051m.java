package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.emoji.model.m */
public class C41051m {

    /* renamed from: g */
    public static C41051m f110532g;

    /* renamed from: a */
    public String f110533a = ((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_STORE_EXPT_MAIN_TAB_CONFIG_STRING, ""));

    /* renamed from: b */
    public String f110534b = ((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_STORE_EXPT_CONFIG_STRING, ""));

    /* renamed from: c */
    public boolean f110535c = false;

    /* renamed from: d */
    public boolean f110536d = false;

    /* renamed from: e */
    public String f110537e;

    /* renamed from: f */
    public String f110538f;

    public C41051m() {
        mo64089b();
    }

    /* renamed from: a */
    public static synchronized C41051m m44498a() {
        C41051m mVar;
        synchronized (C41051m.class) {
            if (f110532g == null) {
                f110532g = new C41051m();
            }
            mVar = f110532g;
        }
        return mVar;
    }

    /* renamed from: b */
    public final void mo64089b() {
        Log.m105925i("MicroMsg.EmojiStoreExpt", "updateExpt: %s %s", this.f110534b, this.f110533a);
        try {
            if (!Util.isNullOrNil(this.f110534b)) {
                this.f110535c = Util.isEqual(new JSONObject(this.f110534b).optString("second_strategy", "None"), "Paid");
            }
            if (!Util.isNullOrNil(this.f110533a)) {
                JSONObject jSONObject = new JSONObject(this.f110533a);
                this.f110536d = Util.isEqual(jSONObject.optString("strategy", "Recommend"), "FriendDownloads");
                this.f110537e = jSONObject.optString("tab_wording");
                this.f110538f = jSONObject.optString("list_wording");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EmojiStoreExpt", e, "", new Object[0]);
            this.f110535c = false;
            this.f110536d = false;
        }
    }
}
