package com.tencent.p014mm.wallet_core.tenpay.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.wallet_core.tenpay.model.ITenpaySave */
public interface ITenpaySave {
    RetryPayInfo getRetryPayInfo();

    /* renamed from: com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo */
    public static class RetryPayInfo implements Parcelable {
        public static final Parcelable.Creator<RetryPayInfo> CREATOR = new C75158a();

        /* renamed from: d */
        public int f221138d;

        /* renamed from: e */
        public int f221139e;

        /* renamed from: f */
        public String f221140f;

        /* renamed from: com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo$a */
        public class C75158a implements Parcelable.Creator<RetryPayInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new RetryPayInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new RetryPayInfo[i];
            }
        }

        public RetryPayInfo() {
            this.f221138d = -1;
            this.f221139e = -1;
            this.f221140f = "";
        }

        /* renamed from: a */
        public void mo104873a(JSONObject jSONObject) {
            JSONObject optJSONObject;
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("retry_pay_info")) != null) {
                this.f221138d = optJSONObject.optInt("retry_interval", -1);
                this.f221139e = optJSONObject.optInt("max_retry_count", -1);
                this.f221140f = optJSONObject.optString("retry_fail_wording", "");
            }
        }

        /* renamed from: b */
        public boolean mo104874b() {
            return (this.f221138d == -1 || this.f221139e == -1) ? false : true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f221138d);
            parcel.writeInt(this.f221139e);
            parcel.writeString(this.f221140f);
        }

        public RetryPayInfo(Parcel parcel) {
            this.f221138d = parcel.readInt();
            this.f221139e = parcel.readInt();
            this.f221140f = parcel.readString();
        }
    }
}
