package com.tencent.p014mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.order.model.MallTransactionObject */
public class MallTransactionObject implements Parcelable {
    public static final Parcelable.Creator<MallTransactionObject> CREATOR = new C70047a();

    /* renamed from: A */
    public String f202094A;

    /* renamed from: B */
    public String f202095B;

    /* renamed from: C */
    public String f202096C;

    /* renamed from: D */
    public String f202097D;

    /* renamed from: E */
    public String f202098E;

    /* renamed from: F */
    public String f202099F;

    /* renamed from: G */
    public String f202100G;

    /* renamed from: H */
    public String f202101H;

    /* renamed from: I */
    public String f202102I;

    /* renamed from: J */
    public double f202103J;

    /* renamed from: K */
    public String f202104K;

    /* renamed from: L */
    public String f202105L;

    /* renamed from: M */
    public String f202106M;

    /* renamed from: N */
    public String f202107N;

    /* renamed from: P */
    public String f202108P;

    /* renamed from: Q */
    public int f202109Q;

    /* renamed from: Q0 */
    public String f202110Q0;

    /* renamed from: R */
    public int f202111R;

    /* renamed from: R0 */
    public String f202112R0;

    /* renamed from: S */
    public double f202113S;

    /* renamed from: S0 */
    public double f202114S0;

    /* renamed from: T */
    public String f202115T;

    /* renamed from: T0 */
    public String f202116T0;

    /* renamed from: U */
    public int f202117U;

    /* renamed from: U0 */
    public List<MallOrderDetailObject.HelpCenter> f202118U0 = new LinkedList();

    /* renamed from: V */
    public String f202119V;

    /* renamed from: V0 */
    public int f202120V0 = -1;

    /* renamed from: W */
    public int f202121W;

    /* renamed from: X */
    public int f202122X;

    /* renamed from: Y */
    public int f202123Y;

    /* renamed from: Z */
    public String f202124Z;

    /* renamed from: d */
    public int f202125d;

    /* renamed from: e */
    public int f202126e;

    /* renamed from: f */
    public int f202127f;

    /* renamed from: g */
    public String f202128g;

    /* renamed from: h */
    public String f202129h;

    /* renamed from: i */
    public String f202130i;

    /* renamed from: j */
    public String f202131j;

    /* renamed from: n */
    public String f202132n;

    /* renamed from: o */
    public String f202133o;

    /* renamed from: p */
    public String f202134p;

    /* renamed from: p0 */
    public String f202135p0;

    /* renamed from: q */
    public double f202136q = 0.0d;

    /* renamed from: r */
    public String f202137r;

    /* renamed from: s */
    public String f202138s;

    /* renamed from: t */
    public String f202139t;

    /* renamed from: u */
    public String f202140u;

    /* renamed from: v */
    public int f202141v;

    /* renamed from: w */
    public int f202142w;

    /* renamed from: x */
    public String f202143x;

    /* renamed from: x0 */
    public String f202144x0;

    /* renamed from: y */
    public String f202145y;

    /* renamed from: y0 */
    public String f202146y0;

    /* renamed from: z */
    public String f202147z;

    /* renamed from: com.tencent.mm.plugin.order.model.MallTransactionObject$a */
    public class C70047a implements Parcelable.Creator<MallTransactionObject> {
        public Object createFromParcel(Parcel parcel) {
            return new MallTransactionObject(parcel);
        }

        public Object[] newArray(int i) {
            return new MallTransactionObject[i];
        }
    }

    public MallTransactionObject() {
    }

    /* renamed from: a */
    public static MallTransactionObject m82531a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        MallTransactionObject mallTransactionObject = new MallTransactionObject();
        jSONObject.optInt("rec_type", 1);
        mallTransactionObject.f202125d = jSONObject.optInt("sub_pay_type", 0);
        mallTransactionObject.f202126e = jSONObject.optInt("pay_scene");
        mallTransactionObject.f202127f = jSONObject.optInt("user_type");
        mallTransactionObject.f202128g = jSONObject.optString("buy_uin");
        mallTransactionObject.f202129h = jSONObject.optString("buy_name");
        mallTransactionObject.f202130i = jSONObject.optString("sale_uin");
        mallTransactionObject.f202131j = jSONObject.optString("sale_name");
        mallTransactionObject.f202143x = jSONObject.optString("trans_id");
        mallTransactionObject.f202145y = jSONObject.optString("sp_billno");
        mallTransactionObject.f202132n = jSONObject.optString("goods_name");
        mallTransactionObject.f202133o = jSONObject.optString("goods_detail");
        mallTransactionObject.f202136q = jSONObject.optDouble("fee") / 100.0d;
        mallTransactionObject.f202137r = jSONObject.optString("fee_color");
        mallTransactionObject.f202138s = jSONObject.optString("trade_state");
        mallTransactionObject.f202139t = jSONObject.optString("trade_state_name");
        mallTransactionObject.f202140u = jSONObject.optString("trade_state_color");
        mallTransactionObject.f202147z = jSONObject.optString("buy_bank_name");
        mallTransactionObject.f202094A = jSONObject.optString("card_tail");
        mallTransactionObject.f202141v = jSONObject.optInt("create_timestamp");
        mallTransactionObject.f202142w = jSONObject.optInt("modify_timestamp");
        mallTransactionObject.f202095B = jSONObject.optString("fee_type");
        JSONObject optJSONObject = jSONObject.optJSONObject("appinfo");
        if (optJSONObject != null) {
            mallTransactionObject.f202096C = optJSONObject.optString("app_username");
            mallTransactionObject.f202097D = optJSONObject.optString("app_telephone");
            mallTransactionObject.f202098E = optJSONObject.optString("app_nickname");
            mallTransactionObject.f202099F = optJSONObject.optString("app_icon_url");
            mallTransactionObject.f202107N = optJSONObject.optString("safeguard_url");
            mallTransactionObject.f202108P = optJSONObject.optString("display_name");
        }
        mallTransactionObject.f202100G = jSONObject.optString("deliver_price");
        mallTransactionObject.f202101H = jSONObject.optString("preferential_price");
        mallTransactionObject.f202102I = jSONObject.optString("discount");
        mallTransactionObject.f202103J = jSONObject.optDouble("original_total_fee") / 100.0d;
        mallTransactionObject.f202104K = jSONObject.optString("total_price");
        mallTransactionObject.f202105L = jSONObject.optString("receipt_company");
        mallTransactionObject.f202106M = jSONObject.optString("biz_pledge");
        mallTransactionObject.f202109Q = jSONObject.optInt("pre_fetch_timestamp");
        mallTransactionObject.f202111R = jSONObject.optInt("arrived_timestamp");
        mallTransactionObject.f202113S = jSONObject.optDouble("transfer_fee") / 100.0d;
        mallTransactionObject.f202115T = jSONObject.optString("receiver_name");
        mallTransactionObject.f202117U = jSONObject.optInt("allow_resend_msg");
        mallTransactionObject.f202119V = jSONObject.optString("charge_fee");
        mallTransactionObject.f202121W = jSONObject.optInt("receive_timestamp");
        mallTransactionObject.f202122X = jSONObject.optInt("refund_timestamp");
        mallTransactionObject.f202123Y = jSONObject.optInt("create_timestamp");
        mallTransactionObject.f202124Z = jSONObject.optString("buy_bank_type");
        mallTransactionObject.f202135p0 = jSONObject.optString("payer_name");
        mallTransactionObject.f202144x0 = jSONObject.optString("true_name");
        mallTransactionObject.f202146y0 = jSONObject.optString("refund_bank_type");
        mallTransactionObject.f202110Q0 = jSONObject.optString("rateinfo");
        mallTransactionObject.f202112R0 = jSONObject.optString("original_feeinfo");
        mallTransactionObject.f202114S0 = jSONObject.optDouble("fetch_total_fee") / 100.0d;
        mallTransactionObject.f202116T0 = jSONObject.optString("fetch_total_fee_color");
        mallTransactionObject.f202120V0 = jSONObject.optInt("userroll_type");
        LinkedList linkedList = new LinkedList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("help_center");
            for (int i = 0; i < jSONArray.length(); i++) {
                MallOrderDetailObject.HelpCenter helpCenter = new MallOrderDetailObject.HelpCenter();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                helpCenter.f202083f = jSONObject2.optBoolean("is_show_button");
                helpCenter.f202081d = jSONObject2.optString("name");
                helpCenter.f202082e = jSONObject2.optString("url");
                linkedList.add(helpCenter);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MallTransactionObject", e, "", new Object[0]);
            Log.m105921e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", e.getMessage());
        }
        mallTransactionObject.f202118U0 = linkedList;
        return mallTransactionObject;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f202125d);
        parcel.writeInt(this.f202126e);
        parcel.writeInt(this.f202127f);
        parcel.writeString(this.f202128g);
        parcel.writeString(this.f202129h);
        parcel.writeString(this.f202130i);
        parcel.writeString(this.f202131j);
        parcel.writeString(this.f202132n);
        parcel.writeString(this.f202133o);
        parcel.writeString(this.f202134p);
        parcel.writeDouble(this.f202136q);
        parcel.writeString(this.f202137r);
        parcel.writeString(this.f202138s);
        parcel.writeString(this.f202139t);
        parcel.writeString(this.f202140u);
        parcel.writeInt(this.f202141v);
        parcel.writeInt(this.f202142w);
        parcel.writeString(this.f202143x);
        parcel.writeString(this.f202145y);
        parcel.writeString(this.f202147z);
        parcel.writeString(this.f202095B);
        parcel.writeString(this.f202096C);
        parcel.writeString(this.f202097D);
        parcel.writeString(this.f202098E);
        parcel.writeString(this.f202099F);
        parcel.writeString(this.f202100G);
        parcel.writeString(this.f202101H);
        parcel.writeString(this.f202102I);
        parcel.writeDouble(this.f202103J);
        parcel.writeString(this.f202104K);
        parcel.writeString(this.f202105L);
        parcel.writeString(this.f202106M);
        parcel.writeString(this.f202107N);
        parcel.writeInt(this.f202109Q);
        parcel.writeInt(this.f202121W);
        parcel.writeDouble(this.f202113S);
        parcel.writeString(this.f202115T);
        parcel.writeInt(this.f202117U);
        parcel.writeString(this.f202119V);
        parcel.writeInt(this.f202121W);
        parcel.writeInt(this.f202122X);
        parcel.writeInt(this.f202123Y);
        parcel.writeString(this.f202124Z);
        parcel.writeString(this.f202135p0);
        parcel.writeString(this.f202144x0);
        parcel.writeString(this.f202146y0);
        parcel.writeString(this.f202110Q0);
        parcel.writeString(this.f202112R0);
        parcel.writeDouble(this.f202114S0);
        parcel.writeString(this.f202116T0);
        parcel.writeString(this.f202108P);
        parcel.writeInt(this.f202120V0);
        parcel.writeInt(this.f202118U0.size());
        for (MallOrderDetailObject.HelpCenter writeParcelable : this.f202118U0) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    public MallTransactionObject(Parcel parcel) {
        this.f202125d = parcel.readInt();
        this.f202126e = parcel.readInt();
        this.f202127f = parcel.readInt();
        this.f202128g = parcel.readString();
        this.f202129h = parcel.readString();
        this.f202130i = parcel.readString();
        this.f202131j = parcel.readString();
        this.f202132n = parcel.readString();
        this.f202133o = parcel.readString();
        this.f202134p = parcel.readString();
        this.f202136q = parcel.readDouble();
        this.f202137r = parcel.readString();
        this.f202138s = parcel.readString();
        this.f202139t = parcel.readString();
        this.f202140u = parcel.readString();
        this.f202141v = parcel.readInt();
        this.f202142w = parcel.readInt();
        this.f202143x = parcel.readString();
        this.f202145y = parcel.readString();
        this.f202147z = parcel.readString();
        this.f202095B = parcel.readString();
        this.f202096C = parcel.readString();
        this.f202097D = parcel.readString();
        this.f202098E = parcel.readString();
        this.f202099F = parcel.readString();
        this.f202100G = parcel.readString();
        this.f202101H = parcel.readString();
        this.f202102I = parcel.readString();
        this.f202103J = parcel.readDouble();
        this.f202104K = parcel.readString();
        this.f202105L = parcel.readString();
        this.f202106M = parcel.readString();
        this.f202107N = parcel.readString();
        this.f202109Q = parcel.readInt();
        this.f202121W = parcel.readInt();
        this.f202113S = parcel.readDouble();
        this.f202115T = parcel.readString();
        this.f202117U = parcel.readInt();
        this.f202119V = parcel.readString();
        this.f202121W = parcel.readInt();
        this.f202122X = parcel.readInt();
        this.f202123Y = parcel.readInt();
        this.f202124Z = parcel.readString();
        this.f202135p0 = parcel.readString();
        this.f202144x0 = parcel.readString();
        this.f202146y0 = parcel.readString();
        this.f202110Q0 = parcel.readString();
        this.f202112R0 = parcel.readString();
        this.f202114S0 = parcel.readDouble();
        this.f202116T0 = parcel.readString();
        this.f202108P = parcel.readString();
        this.f202120V0 = parcel.readInt();
        int readInt = parcel.readInt();
        this.f202118U0 = new LinkedList();
        for (int i = 0; i < readInt; i++) {
            this.f202118U0.add((MallOrderDetailObject.HelpCenter) parcel.readParcelable(MallOrderDetailObject.HelpCenter.class.getClassLoader()));
        }
    }
}
