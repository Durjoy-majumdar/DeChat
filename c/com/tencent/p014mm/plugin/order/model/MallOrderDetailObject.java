package com.tencent.p014mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.order.model.ProductSectionItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.order.model.MallOrderDetailObject */
public class MallOrderDetailObject {

    /* renamed from: a */
    public MallTransactionObject f202072a;

    /* renamed from: b */
    public C70046b f202073b;

    /* renamed from: c */
    public ArrayList<ProductSectionItem> f202074c;

    /* renamed from: d */
    public List<C70045a> f202075d;

    /* renamed from: e */
    public List<HelpCenter> f202076e;

    /* renamed from: f */
    public String f202077f;

    /* renamed from: g */
    public String f202078g;

    /* renamed from: h */
    public String f202079h;

    /* renamed from: i */
    public int f202080i;

    /* renamed from: com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter */
    public static class HelpCenter implements Parcelable {
        public static final Parcelable.Creator<HelpCenter> CREATOR = new C70044a();

        /* renamed from: d */
        public String f202081d;

        /* renamed from: e */
        public String f202082e;

        /* renamed from: f */
        public boolean f202083f;

        /* renamed from: com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter$a */
        public class C70044a implements Parcelable.Creator<HelpCenter> {
            public Object createFromParcel(Parcel parcel) {
                return new HelpCenter(parcel);
            }

            public Object[] newArray(int i) {
                return new HelpCenter[i];
            }
        }

        public HelpCenter() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f202081d);
            parcel.writeString(this.f202082e);
            parcel.writeByte(this.f202083f ? (byte) 1 : 0);
        }

        public HelpCenter(Parcel parcel) {
            this.f202081d = parcel.readString();
            this.f202082e = parcel.readString();
            this.f202083f = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.model.MallOrderDetailObject$a */
    public static class C70045a {

        /* renamed from: a */
        public String f202084a;

        /* renamed from: b */
        public String f202085b;

        /* renamed from: c */
        public String f202086c;

        /* renamed from: d */
        public boolean f202087d;

        /* renamed from: e */
        public int f202088e = 0;
    }

    /* renamed from: com.tencent.mm.plugin.order.model.MallOrderDetailObject$b */
    public static class C70046b {

        /* renamed from: a */
        public String f202089a;

        /* renamed from: b */
        public int f202090b;

        /* renamed from: c */
        public String f202091c;

        /* renamed from: d */
        public String f202092d;

        /* renamed from: e */
        public String f202093e;
    }

    public MallOrderDetailObject() {
        new LinkedList();
    }

    /* renamed from: a */
    public final void mo96370a(List<C70045a> list, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("evaluate_section");
        if (optJSONObject != null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            C70045a aVar = new C70045a();
            if (optJSONObject.has("value")) {
                aVar.f202085b = optJSONObject.optString("value");
                aVar.f202088e = 2;
            } else {
                aVar.f202088e = 1;
            }
            int optInt = optJSONObject.optInt("order", 0);
            if (optInt >= 0 && optInt <= optJSONObject.length() + 1) {
                list.add(optInt, aVar);
            }
        }
    }

    /* renamed from: b */
    public final List<C70045a> mo96371b(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("normal_sections");
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C70045a aVar = new C70045a();
            aVar.f202087d = jSONObject2.optInt("is_bar") != 0;
            String optString = jSONObject2.optString("name");
            aVar.f202084a = optString;
            if (TextUtils.isEmpty(optString)) {
                z = aVar.f202087d;
            } else {
                if (z) {
                    aVar.f202087d = z;
                }
                z = aVar.f202087d;
                aVar.f202085b = jSONObject2.optString("value");
                aVar.f202086c = jSONObject2.optString("jump_url");
                jSONObject2.optInt("jump_type");
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList<ProductSectionItem> mo96372c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("product_section");
        ArrayList<ProductSectionItem> arrayList = null;
        if (jSONObject2 == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                ProductSectionItem productSectionItem = new ProductSectionItem();
                productSectionItem.f202148d = jSONObject3.optString("icon_url");
                productSectionItem.f202149e = jSONObject3.optString("name");
                try {
                    productSectionItem.f202150f = mo96373d(jSONObject3);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e, "", new Object[0]);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.MallOrderDetailObject", e2, "", new Object[0]);
                }
                productSectionItem.f202151g = jSONObject3.optInt("count");
                productSectionItem.f202152h = jSONObject3.optString(FirebaseAnalytics.C113379b.PRICE);
                productSectionItem.f202153i = jSONObject3.optString("jump_url");
                productSectionItem.f202154j = jSONObject3.optString("pid");
                productSectionItem.f202155n = jSONObject3.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                arrayList.add(productSectionItem);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List<ProductSectionItem.Skus> mo96373d(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("skus");
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            ProductSectionItem.Skus skus = new ProductSectionItem.Skus();
            skus.f202156d = jSONObject2.optString("key");
            skus.f202157e = jSONObject2.optString("value");
            arrayList.add(skus);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C70046b mo96374e(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("status_section");
        if (jSONObject2 == null) {
            return null;
        }
        C70046b bVar = new C70046b();
        bVar.f202089a = jSONObject2.optString("last_status_name");
        bVar.f202090b = jSONObject2.optInt("time");
        bVar.f202091c = jSONObject2.optString("thumb_url");
        bVar.f202092d = jSONObject2.optString("jump_url");
        bVar.f202093e = jSONObject2.optString("last_status_desc");
        return bVar;
    }
}
