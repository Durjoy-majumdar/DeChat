package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.ElementQuery */
public class ElementQuery implements Parcelable {
    public static final Parcelable.Creator<ElementQuery> CREATOR = new C72177a();

    /* renamed from: A */
    public boolean f209487A;

    /* renamed from: B */
    public boolean f209488B;

    /* renamed from: C */
    public boolean f209489C;

    /* renamed from: D */
    public boolean f209490D;

    /* renamed from: E */
    public boolean f209491E;

    /* renamed from: F */
    public boolean f209492F;

    /* renamed from: G */
    public boolean f209493G;

    /* renamed from: H */
    public boolean f209494H;

    /* renamed from: I */
    public int f209495I;

    /* renamed from: J */
    public String f209496J;

    /* renamed from: K */
    public String f209497K;

    /* renamed from: L */
    public List<Integer> f209498L;

    /* renamed from: M */
    public boolean f209499M;

    /* renamed from: N */
    public String f209500N;

    /* renamed from: P */
    public int f209501P;

    /* renamed from: Q */
    public ArrayList<CreTypeRuleInfo> f209502Q;

    /* renamed from: R */
    public boolean f209503R;

    /* renamed from: d */
    public String f209504d;

    /* renamed from: e */
    public String f209505e;

    /* renamed from: f */
    public String f209506f;

    /* renamed from: g */
    public boolean f209507g;

    /* renamed from: h */
    public boolean f209508h;

    /* renamed from: i */
    public boolean f209509i;

    /* renamed from: j */
    public boolean f209510j;

    /* renamed from: n */
    public String f209511n;

    /* renamed from: o */
    public String f209512o;

    /* renamed from: p */
    public boolean f209513p;

    /* renamed from: q */
    public int f209514q;

    /* renamed from: r */
    public int f209515r;

    /* renamed from: s */
    public String f209516s;

    /* renamed from: t */
    public String f209517t;

    /* renamed from: u */
    public String f209518u;

    /* renamed from: v */
    public String f209519v;

    /* renamed from: w */
    public String f209520w;

    /* renamed from: x */
    public String f209521x;

    /* renamed from: y */
    public String f209522y;

    /* renamed from: z */
    public boolean f209523z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.ElementQuery$a */
    public class C72177a implements Parcelable.Creator<ElementQuery> {
        public Object createFromParcel(Parcel parcel) {
            return new ElementQuery(parcel);
        }

        public Object[] newArray(int i) {
            return new ElementQuery[i];
        }
    }

    public ElementQuery() {
        this.f209498L = null;
        this.f209503R = false;
    }

    /* renamed from: a */
    public List<Integer> mo99415a() {
        List<Integer> list = this.f209498L;
        if (list != null) {
            return list;
        }
        if (Util.isNullOrNil(this.f209496J)) {
            return null;
        }
        this.f209498L = new ArrayList();
        for (String str : this.f209496J.split("\\|")) {
            int i = Util.getInt(str, 0);
            if (i > 0) {
                this.f209498L.add(Integer.valueOf(i));
            }
        }
        return this.f209498L;
    }

    /* renamed from: b */
    public boolean mo99416b() {
        return 1 == this.f209515r;
    }

    /* renamed from: c */
    public boolean mo99417c() {
        return "0".equals(Util.nullAs(this.f209518u, "").trim());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.mm.plugin.wallet_core.model.CreExtInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.tencent.mm.plugin.wallet_core.model.CreExtInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.tencent.mm.plugin.wallet_core.model.CreExtInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.tencent.mm.plugin.wallet_core.model.CreExtInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.tencent.mm.plugin.wallet_core.model.CreExtInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo99418d(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "bank_name"
            java.lang.String r0 = r10.optString(r0)
            r9.f209505e = r0
            java.lang.String r0 = "bank_type"
            java.lang.String r0 = r10.optString(r0)
            r9.f209516s = r0
            java.lang.String r0 = "bankacc_type_name"
            java.lang.String r0 = r10.optString(r0)
            r9.f209517t = r0
            java.lang.String r0 = "bank_phone"
            java.lang.String r0 = r10.optString(r0)
            r9.f209519v = r0
            java.lang.String r0 = "forbid_word"
            java.lang.String r0 = r10.optString(r0)
            r9.f209522y = r0
            java.lang.String r0 = "bank_recommend_desc"
            java.lang.String r0 = r10.optString(r0)
            r9.f209521x = r0
            java.lang.String r0 = "bank_app_user_name"
            java.lang.String r0 = r10.optString(r0)
            r9.f209520w = r0
            java.lang.String r0 = "bankacc_type"
            r1 = 1
            int r0 = r10.optInt(r0, r1)
            r9.f209515r = r0
            java.lang.String r0 = "canModifyName"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209507g = r0
            java.lang.String r0 = "canModifyCreID"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209508h = r0
            java.lang.String r0 = "is_sure"
            java.lang.String r0 = r10.optString(r0)
            java.lang.String r2 = "0"
            boolean r0 = r2.equals(r0)
            r9.f209513p = r0
            java.lang.String r0 = "needCVV"
            java.lang.String r0 = r10.optString(r0)
            java.lang.String r3 = "1"
            boolean r0 = r3.equals(r0)
            r9.f209509i = r0
            java.lang.String r0 = "needValiDate"
            java.lang.String r0 = r10.optString(r0)
            boolean r0 = r3.equals(r0)
            r9.f209510j = r0
            java.lang.String r0 = "time_stamp"
            java.lang.String r0 = r10.optString(r0)
            r9.f209506f = r0
            java.lang.String r0 = "uesr_name"
            java.lang.String r0 = r10.optString(r0)
            r9.f209512o = r0
            java.lang.String r0 = "bank_flag"
            java.lang.String r0 = r10.optString(r0)
            r9.f209518u = r0
            java.lang.String r0 = "needFirstName"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209523z = r0
            java.lang.String r0 = "needLastName"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209487A = r0
            java.lang.String r0 = "needCountry"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209488B = r0
            java.lang.String r0 = "needArea"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209489C = r0
            java.lang.String r0 = "needCity"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209490D = r0
            java.lang.String r0 = "needAddress"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209491E = r0
            java.lang.String r0 = "needZip"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209492F = r0
            java.lang.String r0 = "needPhone"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209493G = r0
            java.lang.String r0 = "needEmail"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209494H = r0
            java.lang.String r0 = "needShowProtocol"
            boolean r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r0)
            r9.f209499M = r0
            java.lang.String r0 = "support_cre_type"
            java.lang.String r4 = r10.optString(r0)
            r9.f209496J = r4
            java.lang.String r4 = "cre_id"
            java.lang.String r4 = r10.optString(r4)
            r9.f209511n = r4
            java.lang.String r4 = "bank_card_tag"
            int r4 = r10.optInt(r4, r1)
            r9.f209495I = r4
            r5 = 0
            if (r4 != r1) goto L_0x011a
            java.lang.String r4 = "IsSaveYfq"
            boolean r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r4)
            if (r4 != 0) goto L_0x010a
            r9.f209514q = r5
            goto L_0x0128
        L_0x010a:
            java.lang.String r4 = "canReturnYfq"
            boolean r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90233Z(r10, r4)
            if (r4 == 0) goto L_0x0116
            r4 = 4
            r9.f209514q = r4
            goto L_0x0128
        L_0x0116:
            r4 = 3
            r9.f209514q = r4
            goto L_0x0128
        L_0x011a:
            java.lang.String r4 = "auth_mode"
            int r4 = r10.optInt(r4)
            if (r4 != r1) goto L_0x0125
            r9.f209514q = r1
            goto L_0x0128
        L_0x0125:
            r4 = 2
            r9.f209514q = r4
        L_0x0128:
            java.lang.String r4 = "support_micropay"
            java.lang.String r4 = r10.optString(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0138
            r9.f209503R = r1
            goto L_0x0149
        L_0x0138:
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0141
            r9.f209503R = r1
            goto L_0x0149
        L_0x0141:
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L_0x0149
            r9.f209503R = r5
        L_0x0149:
            java.lang.String r1 = "arrive_type"
            java.lang.String r1 = r10.optString(r1)
            r9.f209497K = r1
            java.lang.String r1 = "pre_auth_word"
            java.lang.String r1 = r10.optString(r1)
            r9.f209500N = r1
            java.lang.String r1 = "support_foreign_mobile"
            int r1 = r10.optInt(r1, r5)
            r9.f209501P = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "cre_rule_array"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r10 == 0) goto L_0x01c0
            int r2 = r10.length()
            r3 = 0
        L_0x0174:
            if (r3 >= r2) goto L_0x01c0
            org.json.JSONObject r4 = r10.optJSONObject(r3)
            r6 = 0
            if (r4 == 0) goto L_0x01b8
            com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo r7 = new com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo
            r7.<init>()
            int r8 = r4.optInt(r0, r5)
            r7.f209485d = r8
            java.lang.String r8 = "cre_need_info"
            org.json.JSONObject r4 = r4.optJSONObject(r8)
            if (r4 == 0) goto L_0x01b5
            com.tencent.mm.plugin.wallet_core.model.CreExtInfo r6 = new com.tencent.mm.plugin.wallet_core.model.CreExtInfo
            r6.<init>()
            java.lang.String r8 = "need_creid_renewal"
            int r8 = r4.optInt(r8, r5)
            r6.f209481d = r8
            java.lang.String r8 = "need_birth_date"
            int r8 = r4.optInt(r8, r5)
            r6.f209482e = r8
            java.lang.String r8 = "need_cre_expire_date"
            int r8 = r4.optInt(r8, r5)
            r6.f209483f = r8
            java.lang.String r8 = "need_show_cre_type"
            int r4 = r4.optInt(r8, r5)
            r6.f209484g = r4
        L_0x01b5:
            r7.f209486e = r6
            r6 = r7
        L_0x01b8:
            if (r6 == 0) goto L_0x01bd
            r1.add(r6)
        L_0x01bd:
            int r3 = r3 + 1
            goto L_0x0174
        L_0x01c0:
            r9.f209502Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.model.ElementQuery.mo99418d(org.json.JSONObject):void");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Util.nullAs(this.f209504d, ""));
        parcel.writeString(Util.nullAs(this.f209505e, ""));
        parcel.writeString(Util.nullAs(this.f209506f, ""));
        parcel.writeInt(this.f209507g ? 1 : 0);
        parcel.writeInt(this.f209508h ? 1 : 0);
        parcel.writeInt(this.f209509i ? 1 : 0);
        parcel.writeInt(this.f209510j ? 1 : 0);
        parcel.writeString(Util.nullAs(this.f209512o, ""));
        parcel.writeString(Util.nullAs(this.f209504d, ""));
        parcel.writeInt(this.f209513p ? 1 : 0);
        parcel.writeInt(this.f209514q);
        parcel.writeInt(this.f209515r);
        parcel.writeString(Util.nullAs(this.f209516s, ""));
        parcel.writeString(Util.nullAs(this.f209517t, ""));
        parcel.writeString(Util.nullAs(this.f209518u, ""));
        parcel.writeString(Util.nullAs(this.f209519v, ""));
        parcel.writeString(Util.nullAs(this.f209522y, ""));
        parcel.writeString(Util.nullAs(this.f209521x, ""));
        parcel.writeString(Util.nullAs(this.f209520w, ""));
        parcel.writeInt(this.f209523z ? 1 : 0);
        parcel.writeInt(this.f209487A ? 1 : 0);
        parcel.writeInt(this.f209488B ? 1 : 0);
        parcel.writeInt(this.f209489C ? 1 : 0);
        parcel.writeInt(this.f209490D ? 1 : 0);
        parcel.writeInt(this.f209491E ? 1 : 0);
        parcel.writeInt(this.f209493G ? 1 : 0);
        parcel.writeInt(this.f209492F ? 1 : 0);
        parcel.writeInt(this.f209494H ? 1 : 0);
        parcel.writeInt(this.f209495I);
        parcel.writeString(this.f209496J);
        parcel.writeInt(this.f209503R ? 1 : 0);
        parcel.writeString(this.f209497K);
        parcel.writeInt(this.f209499M ? 1 : 0);
        parcel.writeString(this.f209500N);
        parcel.writeInt(this.f209501P);
        parcel.writeList(this.f209502Q);
    }

    public ElementQuery(Parcel parcel) {
        this.f209498L = null;
        boolean z = false;
        this.f209503R = false;
        this.f209504d = parcel.readString();
        this.f209505e = parcel.readString();
        this.f209506f = parcel.readString();
        this.f209507g = 1 == parcel.readInt();
        this.f209508h = 1 == parcel.readInt();
        this.f209509i = 1 == parcel.readInt();
        this.f209510j = 1 == parcel.readInt();
        this.f209512o = parcel.readString();
        this.f209504d = parcel.readString();
        this.f209513p = 1 == parcel.readInt();
        this.f209514q = parcel.readInt();
        this.f209515r = parcel.readInt();
        this.f209516s = parcel.readString();
        this.f209517t = parcel.readString();
        this.f209518u = parcel.readString();
        this.f209519v = parcel.readString();
        this.f209522y = parcel.readString();
        this.f209521x = parcel.readString();
        this.f209520w = parcel.readString();
        this.f209523z = 1 == parcel.readInt();
        this.f209487A = 1 == parcel.readInt();
        this.f209488B = 1 == parcel.readInt();
        this.f209489C = 1 == parcel.readInt();
        this.f209490D = 1 == parcel.readInt();
        this.f209491E = 1 == parcel.readInt();
        this.f209493G = 1 == parcel.readInt();
        this.f209492F = 1 == parcel.readInt();
        this.f209494H = 1 == parcel.readInt();
        this.f209495I = parcel.readInt();
        this.f209496J = parcel.readString();
        this.f209503R = 1 == parcel.readInt();
        this.f209497K = parcel.readString();
        this.f209499M = 1 == parcel.readInt() ? true : z;
        this.f209500N = parcel.readString();
        this.f209501P = parcel.readInt();
        this.f209502Q = parcel.readArrayList(CreTypeRuleInfo.class.getClassLoader());
    }
}
