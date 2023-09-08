package so2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ps2.C118127b0;
import qs2.C101255a0;

/* renamed from: so2.s */
public class C101689s extends C101255a0 {

    /* renamed from: A */
    public String f297697A;

    /* renamed from: B */
    public String f297698B;

    /* renamed from: C */
    public String f297699C;
    @C118127b0(resType = 1)

    /* renamed from: D */
    public String f297700D;
    @C118127b0(resType = 1)

    /* renamed from: E */
    public String f297701E;
    @C118127b0(resType = 1)

    /* renamed from: F */
    public String f297702F;

    /* renamed from: G */
    public String f297703G;
    @C118127b0(resType = 1)

    /* renamed from: H */
    public String f297704H;

    /* renamed from: I */
    public ArrayList<String> f297705I;

    /* renamed from: J */
    public ArrayList<String> f297706J;

    /* renamed from: K */
    public String f297707K;

    /* renamed from: L */
    public String f297708L;

    /* renamed from: z */
    public String f297709z;

    /* renamed from: b */
    public static C101689s m133569b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        try {
            C101689s sVar = new C101689s();
            sVar.f297709z = Util.nullAsNil(map.get(str + ".titlePrefix"));
            sVar.f297697A = Util.nullAsNil(map.get(str + ".titleInfix"));
            sVar.f297698B = Util.nullAsNil(map.get(str + ".titleSuffix"));
            sVar.f297699C = Util.nullAsNil(map.get(str + ".desc"));
            sVar.f297700D = Util.nullAsNil(map.get(str + ".backgroundImgWithFriends"));
            sVar.f297701E = Util.nullAsNil(map.get(str + ".backgroundImgCommon"));
            sVar.f297702F = Util.nullAsNil(map.get(str + ".avatarBackgroundImg"));
            sVar.f297703G = Util.nullAsNil(map.get(str + ".avatarDesc"));
            sVar.f297704H = Util.nullAsNil(map.get(str + ".adAvatarImg"));
            sVar.f297705I = new ArrayList<>();
            int i = 0;
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".friendAvatarImgs.username");
                sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
                String sb4 = sb.toString();
                if (!map.containsKey(sb4)) {
                    break;
                }
                String nullAsNil = Util.nullAsNil(map.get(sb4));
                if (!TextUtils.isEmpty(nullAsNil)) {
                    sVar.f297705I.add(nullAsNil);
                }
                i2++;
            }
            sVar.f297706J = new ArrayList<>();
            while (true) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(".commonAvatarImgs.imageUrl");
                sb5.append(i == 0 ? "" : Integer.valueOf(i));
                String sb6 = sb5.toString();
                if (!map.containsKey(sb6)) {
                    sVar.f297707K = Util.nullAsNil(map.get(str + ".friendAvatarDescWithFriends"));
                    sVar.f297708L = Util.nullAsNil(map.get(str + ".friendAvatarDescCommon"));
                    SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
                    return sVar;
                }
                String nullAsNil2 = Util.nullAsNil(map.get(sb6));
                if (!TextUtils.isEmpty(nullAsNil2)) {
                    sVar.f297706J.add(nullAsNil2);
                }
                i++;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageComponentInfo", "parseFromXml, exp=" + th.toString());
            Log.m105920e("MicroMsg.AdLandingPageComponentInfo", "parseFromXml, null");
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
            return null;
        }
    }

    /* renamed from: c */
    public void mo141136c(String str) {
        SnsMethodCalculate.markStartTimeMs("updateFromJson", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        Log.m105924i("MicroMsg.AdLandingPageComponentInfo", "updateFromJson, json=" + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("titlePrefix");
            if (!TextUtils.isEmpty(optString)) {
                this.f297709z = optString;
            }
            String optString2 = jSONObject.optString("titleInfix");
            if (!TextUtils.isEmpty(optString2)) {
                this.f297697A = optString2;
            }
            String optString3 = jSONObject.optString("titleSuffix");
            if (!TextUtils.isEmpty(optString3)) {
                this.f297698B = optString3;
            }
            String optString4 = jSONObject.optString("desc");
            if (!TextUtils.isEmpty(optString4)) {
                this.f297699C = optString4;
            }
            String optString5 = jSONObject.optString("avatarDesc");
            if (!TextUtils.isEmpty(optString5)) {
                this.f297703G = optString5;
            }
            String optString6 = jSONObject.optString("friendAvatarDescWithFriends");
            if (!TextUtils.isEmpty(optString6)) {
                this.f297707K = optString6;
            }
            String optString7 = jSONObject.optString("friendAvatarDescCommon");
            if (!TextUtils.isEmpty(optString7)) {
                this.f297708L = optString7;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            JSONArray optJSONArray = jSONObject.optJSONArray("friendAvatarImgs");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString8 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString8)) {
                        arrayList.add(optString8);
                    }
                }
            }
            this.f297705I = arrayList;
            ArrayList<String> arrayList2 = new ArrayList<>();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("commonAvatarImgs");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString9 = optJSONArray2.optString(i2);
                    if (!TextUtils.isEmpty(optString9)) {
                        arrayList2.add(optString9);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                this.f297706J = arrayList2;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageComponentInfo", "updateFromJson, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateFromJson", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("titlePrefix=");
        sb.append(this.f297709z);
        sb.append(", ");
        sb.append("titleInfix=");
        sb.append(this.f297697A);
        sb.append(", ");
        sb.append("titleSuffix=");
        sb.append(this.f297698B);
        sb.append(", ");
        sb.append("desc=");
        sb.append(this.f297699C);
        sb.append(", ");
        sb.append("backgroundImgWithFriends=");
        sb.append(this.f297700D);
        sb.append(", ");
        sb.append("backgroundImgCommon=");
        sb.append(this.f297701E);
        sb.append(", ");
        sb.append("avatarBackgroundImg=");
        sb.append(this.f297702F);
        sb.append(", ");
        sb.append("avatarDesc=");
        sb.append(this.f297703G);
        sb.append(", ");
        sb.append("adAvatarImg=");
        sb.append(this.f297704H);
        sb.append(", ");
        sb.append("userNameList.size=");
        ArrayList<String> arrayList = this.f297705I;
        int i = 0;
        sb.append(arrayList == null ? 0 : arrayList.size());
        sb.append(", ");
        sb.append("avatarUrlList.size=");
        ArrayList<String> arrayList2 = this.f297706J;
        if (arrayList2 != null) {
            i = arrayList2.size();
        }
        sb.append(i);
        sb.append(", ");
        sb.append("friendAvatarDescWithFriends=");
        sb.append(this.f297707K);
        sb.append(", ");
        sb.append("friendAvatarDescCommon=");
        sb.append(this.f297708L);
        sb.append("]");
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        return sb4;
    }
}
