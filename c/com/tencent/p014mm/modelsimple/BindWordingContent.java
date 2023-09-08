package com.tencent.p014mm.modelsimple;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.modelsimple.BindWordingContent */
public class BindWordingContent implements Parcelable {
    public static final Parcelable.Creator<BindWordingContent> CREATOR = new C68137a();

    /* renamed from: d */
    public String f195809d = "";

    /* renamed from: e */
    public String f195810e = "";

    /* renamed from: f */
    public Integer f195811f = 0;

    /* renamed from: com.tencent.mm.modelsimple.BindWordingContent$a */
    public class C68137a implements Parcelable.Creator<BindWordingContent> {
        public Object createFromParcel(Parcel parcel) {
            return new BindWordingContent(parcel);
        }

        public Object[] newArray(int i) {
            return new BindWordingContent[i];
        }
    }

    public BindWordingContent(String str, String str2) {
        this.f195809d = str;
        this.f195810e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{this.f195809d, this.f195810e});
        parcel.writeInt(this.f195811f.intValue());
    }

    public BindWordingContent(Parcel parcel) {
        String[] strArr = new String[2];
        parcel.readStringArray(strArr);
        this.f195809d = strArr[0];
        this.f195810e = strArr[1];
        this.f195811f = Integer.valueOf(parcel.readInt());
    }
}
