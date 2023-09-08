package com.tencent.p014mm.pluginsdk.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p427v4.p1171os.ResultReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.pluginsdk.wallet.WalletJsapiData */
public class WalletJsapiData implements Parcelable {
    public static final Parcelable.Creator<WalletJsapiData> CREATOR = new C6695a();

    /* renamed from: A */
    public int f24058A = 0;

    /* renamed from: B */
    public String f24059B;

    /* renamed from: C */
    public int f24060C = 0;

    /* renamed from: D */
    public String f24061D;

    /* renamed from: E */
    public String f24062E;

    /* renamed from: F */
    public String f24063F;

    /* renamed from: G */
    public boolean f24064G;

    /* renamed from: H */
    public String f24065H;

    /* renamed from: I */
    public int f24066I;

    /* renamed from: J */
    public int f24067J;

    /* renamed from: K */
    public int f24068K;

    /* renamed from: L */
    public String f24069L;

    /* renamed from: M */
    public String f24070M;

    /* renamed from: N */
    public String f24071N = "";

    /* renamed from: P */
    public Map<String, String> f24072P;

    /* renamed from: Q */
    public String f24073Q;

    /* renamed from: R */
    public ResultReceiver f24074R;

    /* renamed from: d */
    public String f24075d;

    /* renamed from: e */
    public String f24076e;

    /* renamed from: f */
    public String f24077f;

    /* renamed from: g */
    public String f24078g;

    /* renamed from: h */
    public String f24079h;

    /* renamed from: i */
    public String f24080i;

    /* renamed from: j */
    public String f24081j;

    /* renamed from: n */
    public int f24082n;

    /* renamed from: o */
    public int f24083o;

    /* renamed from: p */
    public String f24084p;

    /* renamed from: q */
    public String f24085q;

    /* renamed from: r */
    public String f24086r;

    /* renamed from: s */
    public String f24087s;

    /* renamed from: t */
    public int f24088t;

    /* renamed from: u */
    public int f24089u;

    /* renamed from: v */
    public int f24090v;

    /* renamed from: w */
    public int f24091w;

    /* renamed from: x */
    public int f24092x;

    /* renamed from: y */
    public String f24093y;

    /* renamed from: z */
    public int f24094z;

    /* renamed from: com.tencent.mm.pluginsdk.wallet.WalletJsapiData$a */
    public class C6695a implements Parcelable.Creator<WalletJsapiData> {
        public Object createFromParcel(Parcel parcel) {
            return new WalletJsapiData(parcel);
        }

        public Object[] newArray(int i) {
            return new WalletJsapiData[i];
        }
    }

    public WalletJsapiData() {
    }

    /* renamed from: a */
    public int mo7619a(int i, int i2) {
        int i3 = (i == 1000 || i == 1018 || i == 1017 || i == 1033) ? 0 : i == 1019 ? 1 : i == 1010 ? 5 : (i == 1007 || i == 1008) ? 6 : i == 1009 ? 7 : (i == 1035 || i == 1020) ? 8 : (i == 1011 || i == 1047 || i == 1025) ? 12 : (i == 1012 || i == 1032 || i == 1048 || i == 1050) ? 13 : (i == 1005 || i == 1027 || i == 1042 || i == 1006) ? 15 : (i == 1024 || i == 1021) ? 16 : (i == 1029 || i == 1028) ? 23 : (i == 1013 || i == 1031 || i == 1049) ? 24 : (i == 1001 || i == 1003) ? 25 : (i == 1045 || i == 1046) ? 26 : i == 1022 ? 27 : i == 1023 ? 28 : i == 1026 ? 29 : i == 1039 ? 30 : (i == 1034 || i == 1060) ? 31 : (i == 1014 || i == 1043 || i == 1044 || i == 1036) ? 32 : i;
        Log.m105925i("MicroMsg.WalletJsapiData", "parsePayChannelByScene, scene: %s, rawScene: %s, resultChannel: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        return i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24075d);
        parcel.writeString(this.f24076e);
        parcel.writeString(this.f24077f);
        parcel.writeString(this.f24078g);
        parcel.writeString(this.f24079h);
        parcel.writeString(this.f24080i);
        parcel.writeString(this.f24081j);
        parcel.writeInt(this.f24082n);
        parcel.writeInt(this.f24083o);
        parcel.writeString(this.f24084p);
        parcel.writeString(this.f24085q);
        parcel.writeString(this.f24086r);
        parcel.writeString(this.f24087s);
        parcel.writeInt(this.f24088t);
        parcel.writeInt(this.f24089u);
        parcel.writeInt(this.f24090v);
        parcel.writeInt(this.f24091w);
        parcel.writeInt(this.f24092x);
        parcel.writeString(this.f24093y);
        parcel.writeInt(this.f24058A);
        parcel.writeString(this.f24059B);
        parcel.writeInt(this.f24060C);
        parcel.writeString(this.f24061D);
        parcel.writeString(this.f24062E);
        parcel.writeString(this.f24063F);
        parcel.writeInt(this.f24094z);
        parcel.writeInt(this.f24064G ? 1 : 0);
        parcel.writeString(this.f24073Q);
        Map<String, String> map = this.f24072P;
        if (map != null) {
            parcel.writeInt(map.size());
            for (Map.Entry next : this.f24072P.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f24065H);
        parcel.writeInt(this.f24066I);
        if (this.f24074R != null) {
            parcel.writeString("PAY_SUCCESS_AHEAD_CALLBACK_RESULT_RECEIVER_MAGIC_WORD");
            this.f24074R.writeToParcel(parcel, i);
        } else {
            parcel.writeString((String) null);
        }
        parcel.writeInt(this.f24067J);
        parcel.writeInt(this.f24068K);
        parcel.writeString(this.f24069L);
        parcel.writeString(this.f24070M);
        parcel.writeString(this.f24071N);
    }

    public WalletJsapiData(Map<String, Object> map) {
        this.f24075d = (String) map.get("appId");
        this.f24076e = (String) map.get("partnerId");
        this.f24077f = (String) map.get("signType");
        this.f24078g = (String) map.get("nonceStr");
        this.f24079h = (String) map.get("timeStamp");
        this.f24080i = (String) map.get("package");
        this.f24081j = (String) map.get("reqKey");
        this.f24082n = Util.getInt((String) map.get("payScene"), 1);
        this.f24083o = Util.getInt((String) map.get("businessScene"), 1);
        this.f24084p = (String) map.get("paySign");
        this.f24086r = (String) map.get("url");
        this.f24087s = (String) map.get("src_username");
        int i = Util.getInt((String) map.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        this.f24088t = i;
        if (i == 0) {
            this.f24088t = Util.getInt((String) map.get("pay_scene"), 0);
        }
        this.f24090v = Util.getInt((String) map.get("pay_channel"), 0);
        this.f24091w = Util.getInt((String) map.get("pay_code_scene"), 0);
        this.f24093y = Util.nullAsNil((String) map.get("ext_info"));
        this.f24059B = Util.nullAsNil((String) map.get(XWalkReaderBasePlugin.PARAM_KEY_TOKEN));
        this.f24060C = Util.getInt(Util.nullAs((String) map.get("result_jump_mode"), "0"), 0);
        this.f24061D = Util.nullAsNil((String) map.get("key_appbrand_from_path"));
        this.f24062E = Util.nullAsNil((String) map.get("key_appbrand_from_username"));
        this.f24063F = Util.nullAsNil((String) map.get("key_appbrand_from_scene"));
        this.f24066I = Util.getInt((String) map.get("key_chat_type"), 0);
        this.f24067J = Util.getInt((String) map.get("key_send_type"), 0);
        this.f24068K = Util.getInt((String) map.get("key_qrcode_session_type"), 0);
        this.f24069L = Util.nullAsNil((String) map.get("key_qrcode_session_name"));
        this.f24070M = Util.nullAsNil((String) map.get("key_qrcode_timeline_objid"));
    }

    public WalletJsapiData(JSONObject jSONObject) {
        this.f24075d = jSONObject.optString("appId");
        this.f24076e = jSONObject.optString("partnerId");
        this.f24077f = jSONObject.optString("signType");
        this.f24078g = jSONObject.optString("nonceStr");
        this.f24079h = jSONObject.optString("timeStamp");
        this.f24080i = jSONObject.optString("package");
        this.f24081j = jSONObject.optString("reqKey");
        this.f24082n = jSONObject.optInt("payScene", 1);
        this.f24083o = jSONObject.optInt("businessScene", 1);
        this.f24084p = jSONObject.optString("paySign");
        this.f24085q = jSONObject.optString("cookie");
        this.f24086r = jSONObject.optString("url");
        this.f24087s = jSONObject.optString("src_username");
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f24088t = optInt;
        if (optInt == 0) {
            this.f24088t = jSONObject.optInt("pay_scene", 0);
        }
        this.f24090v = jSONObject.optInt("pay_channel", 0);
        this.f24091w = jSONObject.optInt("pay_code_scene", 0);
        this.f24093y = jSONObject.optString("ext_info", "");
        this.f24059B = jSONObject.optString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, "");
        this.f24060C = Util.getInt(jSONObject.optString("result_jump_mode", "0"), 0);
        this.f24058A = jSONObject.optInt("pay_for_wallet_type", 0);
        this.f24061D = Util.nullAsNil(jSONObject.optString("key_appbrand_from_path"));
        this.f24062E = Util.nullAsNil(jSONObject.optString("key_appbrand_from_username"));
        this.f24063F = Util.nullAsNil(jSONObject.optString("key_appbrand_from_scene"));
        this.f24064G = jSONObject.optBoolean("key_joint_pay", false);
        this.f24066I = jSONObject.optInt("key_chat_type", 0);
        this.f24067J = jSONObject.optInt("key_send_type", 0);
        this.f24068K = jSONObject.optInt("key_qrcode_session_type", 0);
        this.f24069L = jSONObject.optString("key_qrcode_session_name", "");
        this.f24070M = jSONObject.optString("key_qrcode_timeline_objid", "");
    }

    public WalletJsapiData(Parcel parcel) {
        this.f24075d = parcel.readString();
        this.f24076e = parcel.readString();
        this.f24077f = parcel.readString();
        this.f24078g = parcel.readString();
        this.f24079h = parcel.readString();
        this.f24080i = parcel.readString();
        this.f24081j = parcel.readString();
        this.f24082n = parcel.readInt();
        this.f24083o = parcel.readInt();
        this.f24084p = parcel.readString();
        this.f24085q = parcel.readString();
        this.f24086r = parcel.readString();
        this.f24087s = parcel.readString();
        this.f24088t = parcel.readInt();
        this.f24089u = parcel.readInt();
        this.f24090v = parcel.readInt();
        this.f24091w = parcel.readInt();
        this.f24092x = parcel.readInt();
        this.f24093y = parcel.readString();
        this.f24058A = parcel.readInt();
        this.f24059B = parcel.readString();
        this.f24060C = parcel.readInt();
        this.f24061D = parcel.readString();
        this.f24062E = parcel.readString();
        this.f24063F = parcel.readString();
        this.f24094z = parcel.readInt();
        this.f24064G = parcel.readInt() != 1 ? false : true;
        this.f24073Q = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f24072P = new HashMap();
            for (int i = 0; i < readInt; i++) {
                this.f24072P.put(parcel.readString(), parcel.readString());
            }
        }
        this.f24065H = parcel.readString();
        this.f24066I = parcel.readInt();
        if ("PAY_SUCCESS_AHEAD_CALLBACK_RESULT_RECEIVER_MAGIC_WORD".equals(parcel.readString())) {
            this.f24074R = ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        this.f24067J = parcel.readInt();
        this.f24068K = parcel.readInt();
        this.f24069L = parcel.readString();
        this.f24070M = parcel.readString();
        this.f24071N = parcel.readString();
    }
}
