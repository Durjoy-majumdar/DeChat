package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.h */
public final class C18063h extends C18046c {

    /* renamed from: E */
    public final String f49918E = "MicroMsg.WebViewThumbMediaPlayer";

    /* renamed from: F */
    public boolean f49919F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18063h(Context context) {
        super(context, (Looper) null, false, false, 14, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: H */
    public void mo22530H(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
        C87412m.m108594g(iTPPlayer, "player");
        String str = this.f49918E;
        Log.m105918d(str, "onTTPlayerInfoUpdate：what:" + i + "  arg1: " + j + ", arg2: " + j2 + ", extraObject: " + obj);
        if (i == 252) {
            String str2 = this.f49918E;
            Log.m105924i(str2, "TP_PLAYER_INFO_LONG1_ADAPTIVE_SWITCH_DEF_END：arg1: " + j + ", arg2: " + j2 + ", extraObject: " + obj);
            mo32890y(String.valueOf(j));
        } else if (i == 1006 && obj != null) {
            try {
                if (obj instanceof TPPlayerMsg.TPDownLoadProgressInfo) {
                    mo22603K(((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo);
                    String str3 = this.f49918E;
                    Log.m105918d(str3, "extraObject.extraInfo: " + ((TPPlayerMsg.TPDownLoadProgressInfo) obj).extraInfo);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(this.f49918E, e, "", new Object[0]);
            }
        }
    }

    /* renamed from: K */
    public final void mo22603K(String str) {
        Object opt;
        try {
            if (this.f49919F) {
                this.f49919F = false;
                if (str != null && (opt = new JSONObject(str).opt("hitDownloaded")) != null && (opt instanceof Integer)) {
                    if (C87412m.m108589b(opt, 1)) {
                        mo32882A(true);
                    } else {
                        mo32882A(false);
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f49918E, e, "", new Object[0]);
        }
    }

    /* renamed from: L */
    public final void mo22604L(String str, String str2, int i) {
        boolean z = false;
        int i2 = i == 1 ? 1 : 0;
        ITPPlayer iTPPlayer = this.f49877q;
        C13598b0 b0Var = C13598b0.f38549a;
        if (!this.f49878r) {
            try {
                Log.m105918d(this.f49876p, "setDataSource");
                String a = C18054e.f49894a.mo22563a(str);
                String str3 = this.f49918E;
                Log.m105924i(str3, "setDataSource, path: " + str + ", fileId:" + a + ", videoType:" + i);
                this.f49919F = true;
                iTPPlayer.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, 1000).buildLong(504, 1));
                TPVideoInfo.Builder fileId = new TPVideoInfo.Builder().fileId(a);
                TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(i2);
                HashMap hashMap = new HashMap();
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    hashMap.put("Referrer", str2);
                }
                tPDownloadParamData.setHeadersList(C26236u.m33719b(hashMap));
                iTPPlayer.setVideoInfo(fileId.downloadParam(tPDownloadParamData).build());
                iTPPlayer.setDataSource(str);
                this.f59681a = 1;
            } catch (Exception e) {
                String str4 = this.f49876p;
                Log.m105920e(str4, "setDataSource" + ", fail since " + e);
                mo22529G(e);
            }
        } else {
            Log.m105928w(this.f49876p, "setDataSource, player is not available");
        }
    }

    /* renamed from: d */
    public void mo22534d(String str, String str2) {
        C87412m.m108594g(str, "path");
        mo22604L(str, str2, 0);
    }

    /* renamed from: h */
    public void mo22541h(String str, int i) {
        if (str != null) {
            mo22604L(str, (String) null, i);
        }
    }
}
