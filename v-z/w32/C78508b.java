package w32;

import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: w32.b */
public class C78508b extends C69210e2 {

    /* renamed from: B */
    public int f229957B = 0;

    /* renamed from: C */
    public int f229958C = 0;

    /* renamed from: D */
    public Map<String, String> f229959D = null;

    public C78508b(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3) {
        this.f199150i = str;
        this.f199151j = str2;
        this.f199152n = str5;
        HashMap hashMap = new HashMap();
        this.f229959D = hashMap;
        hashMap.put("msgType", i + "");
        Map<String, String> map = this.f229959D;
        ((HashMap) map).put(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, i2 + "");
        ((HashMap) this.f229959D).put("sendId", str);
        if (!Util.isNullOrNil(str2)) {
            ((HashMap) this.f229959D).put("nativeUrl", URLEncoder.encode(str2));
        }
        if (!Util.isNullOrNil(str3)) {
            ((HashMap) this.f229959D).put("headImg", URLEncoder.encode(str3));
            ((HashMap) this.f229959D).put("nickName", URLEncoder.encode(Util.nullAsNil(str4)));
        }
        ((HashMap) this.f229959D).put("ver", str6);
        ((HashMap) this.f229959D).put("timingIdentifier", str7);
        ((HashMap) this.f229959D).put("left_button_continue", str8);
        ((HashMap) this.f229959D).put("liveid", str9);
        ((HashMap) this.f229959D).put("liveattach", str10);
        if (i3 > 0) {
            ((HashMap) this.f229959D).put("channellive_sender_flag", String.valueOf(i3));
        }
        Log.m105924i("MicroMsg.NetSceneLiveOpenLuckyMoney", "NetSceneOpenLuckyMoney request");
        setRequestData(this.f229959D);
    }

    public int getType() {
        return 4595;
    }

    /* renamed from: j1 */
    public String mo95311j1() {
        return "/cgi-bin/mmpay-bin/ftfhb/channelliveopenwxhb";
    }

    /* renamed from: l1 */
    public void mo95405l1(int i, JSONObject jSONObject) {
        int i2;
        if (i == 0 || jSONObject == null) {
            Log.m105924i("MicroMsg.NetSceneLiveOpenLuckyMoney", "needCallbackWhenError error ok or json null");
            this.f229957B = 0;
            this.f229958C = 0;
            return;
        }
        int optInt = jSONObject.optInt("tryafterms");
        Log.m105925i("MicroMsg.NetSceneLiveOpenLuckyMoney", "needCallbackWhenError delayTimeMS: %s, retryTimes: %s, errCode: %s", Integer.valueOf(optInt), Integer.valueOf(this.f229957B), Integer.valueOf(i));
        if (optInt <= 0 || (i2 = this.f229957B) >= 1) {
            this.f229957B = 0;
            this.f229958C = 0;
            return;
        }
        this.f229957B = i2 + 1;
        this.f229958C = Math.min(optInt, 5000);
    }

    public C78508b(Map<String, String> map) {
        setRequestData(map);
    }
}
