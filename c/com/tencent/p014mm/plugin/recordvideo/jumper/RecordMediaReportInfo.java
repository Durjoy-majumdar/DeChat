package com.tencent.p014mm.plugin.recordvideo.jumper;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo */
public class RecordMediaReportInfo implements Parcelable {
    public static final Parcelable.Creator<RecordMediaReportInfo> CREATOR = new C94406a();

    /* renamed from: d */
    public HashMap f272939d = new HashMap();

    /* renamed from: com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo$a */
    public class C94406a implements Parcelable.Creator<RecordMediaReportInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new RecordMediaReportInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new RecordMediaReportInfo[i];
        }
    }

    public RecordMediaReportInfo() {
    }

    /* renamed from: a */
    public void mo129810a(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f272939d.put(next, jSONObject.get(next));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public <T> T mo129811b(String str, T t) {
        return this.f272939d.get(str) != null ? this.f272939d.get(str) : t;
    }

    /* renamed from: c */
    public void mo129812c(String str, Object obj) {
        this.f272939d.put(str, obj);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f272939d);
    }

    public RecordMediaReportInfo(Parcel parcel) {
        this.f272939d = (HashMap) parcel.readSerializable();
    }
}
