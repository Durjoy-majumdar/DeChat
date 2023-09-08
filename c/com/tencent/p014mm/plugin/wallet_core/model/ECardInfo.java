package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.ECardInfo */
public class ECardInfo implements Parcelable {
    public static final Parcelable.Creator<ECardInfo> CREATOR = new C5772a();

    /* renamed from: d */
    public int f21883d;

    /* renamed from: e */
    public String f21884e;

    /* renamed from: f */
    public int f21885f;

    /* renamed from: g */
    public int f21886g;

    /* renamed from: h */
    public String f21887h;

    /* renamed from: i */
    public String f21888i;

    /* renamed from: j */
    public String f21889j;

    /* renamed from: n */
    public int f21890n;

    /* renamed from: o */
    public String f21891o;

    /* renamed from: p */
    public String f21892p;

    /* renamed from: q */
    public ArrayList<String> f21893q = new ArrayList<>();

    /* renamed from: r */
    public String f21894r;

    /* renamed from: s */
    public String f21895s;

    /* renamed from: t */
    public String f21896t;

    /* renamed from: u */
    public String f21897u;

    /* renamed from: v */
    public String f21898v;

    /* renamed from: w */
    public String f21899w;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.ECardInfo$a */
    public class C5772a implements Parcelable.Creator<ECardInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ECardInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ECardInfo[i];
        }
    }

    public ECardInfo() {
    }

    /* renamed from: a */
    public static ECardInfo m5535a() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, (Object) null);
        if (!Util.isNullOrNil(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("upload_reasons");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(optJSONArray.optString(i));
                    }
                }
                if (!jSONObject.has("ecard_info")) {
                    return null;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("ecard_info");
                ECardInfo eCardInfo = new ECardInfo();
                eCardInfo.f21898v = jSONObject.optString("guide_flag");
                eCardInfo.f21892p = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                eCardInfo.f21899w = jSONObject.optString("subtitle");
                eCardInfo.f21893q = new ArrayList<>(arrayList);
                eCardInfo.f21895s = jSONObject.optString("protocol_url");
                eCardInfo.f21896t = jSONObject.optString("left_protocol_wording");
                eCardInfo.f21897u = jSONObject.optString("right_protocol_wording");
                eCardInfo.f21894r = jSONObject.optString("done_button_wording");
                eCardInfo.f21883d = optJSONObject.optInt("ecard_open_scene", 0);
                eCardInfo.f21884e = optJSONObject.optString("ecard_type", "");
                eCardInfo.f21885f = optJSONObject.optInt("show_check_box", 0);
                eCardInfo.f21886g = optJSONObject.optInt("check_box_selected", 0);
                eCardInfo.f21887h = optJSONObject.optString("check_box_left_wording", "");
                eCardInfo.f21888i = optJSONObject.optString("check_box_right_wording", "");
                eCardInfo.f21889j = optJSONObject.optString("check_box_url", "");
                eCardInfo.f21890n = optJSONObject.optInt("is_upload_credid", 0);
                eCardInfo.f21891o = optJSONObject.optString("upload_credit_url", "");
                return eCardInfo;
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.ECardInfo", e, "", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m5536b(JSONObject jSONObject) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC;
        if (jSONObject != null) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONObject.toString());
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21883d);
        parcel.writeString(this.f21884e);
        parcel.writeInt(this.f21885f);
        parcel.writeInt(this.f21886g);
        parcel.writeString(this.f21887h);
        parcel.writeString(this.f21888i);
        parcel.writeString(this.f21889j);
        parcel.writeInt(this.f21890n);
        parcel.writeString(this.f21892p);
        parcel.writeStringList(this.f21893q);
        parcel.writeString(this.f21894r);
        parcel.writeString(this.f21895s);
        parcel.writeString(this.f21896t);
        parcel.writeString(this.f21897u);
        parcel.writeString(this.f21898v);
        parcel.writeString(this.f21899w);
    }

    public ECardInfo(Parcel parcel) {
        this.f21883d = parcel.readInt();
        this.f21884e = parcel.readString();
        this.f21885f = parcel.readInt();
        this.f21886g = parcel.readInt();
        this.f21887h = parcel.readString();
        this.f21888i = parcel.readString();
        this.f21889j = parcel.readString();
        this.f21890n = parcel.readInt();
        this.f21892p = parcel.readString();
        parcel.readStringList(this.f21893q);
        this.f21894r = parcel.readString();
        this.f21895s = parcel.readString();
        this.f21896t = parcel.readString();
        this.f21897u = parcel.readString();
        this.f21898v = parcel.readString();
        this.f21899w = parcel.readString();
    }
}
