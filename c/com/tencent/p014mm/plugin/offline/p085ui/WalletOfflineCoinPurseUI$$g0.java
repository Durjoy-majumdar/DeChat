package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$g0 */
public class WalletOfflineCoinPurseUI$$g0 {

    /* renamed from: a */
    public String f201952a;

    /* renamed from: b */
    public String f201953b;

    /* renamed from: c */
    public String f201954c;

    /* renamed from: d */
    public String f201955d;

    /* renamed from: e */
    public String f201956e;

    /* renamed from: f */
    public int f201957f;

    public WalletOfflineCoinPurseUI$$g0(WalletOfflineCoinPurseUI.C699651 r1) {
    }

    /* renamed from: a */
    public static void m82488a(WalletOfflineCoinPurseUI$$g0 walletOfflineCoinPurseUI$$g0, JSONObject jSONObject) {
        walletOfflineCoinPurseUI$$g0.f201952a = jSONObject.optString("icon_url");
        walletOfflineCoinPurseUI$$g0.f201953b = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        walletOfflineCoinPurseUI$$g0.f201954c = jSONObject.optString("tiny_app_username");
        walletOfflineCoinPurseUI$$g0.f201955d = jSONObject.optString("tiny_app_path");
        walletOfflineCoinPurseUI$$g0.f201956e = jSONObject.optString("h5_url");
        walletOfflineCoinPurseUI$$g0.f201957f = jSONObject.optInt("jump_type");
    }
}
