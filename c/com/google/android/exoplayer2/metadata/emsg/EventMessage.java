package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20551y;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C16948a();

    /* renamed from: d */
    public final String f45802d;

    /* renamed from: e */
    public final String f45803e;

    /* renamed from: f */
    public final long f45804f;

    /* renamed from: g */
    public final long f45805g;

    /* renamed from: h */
    public final byte[] f45806h;

    /* renamed from: i */
    public int f45807i;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    public static class C16948a implements Parcelable.Creator<EventMessage> {
        public Object createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        public Object[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f45802d = str;
        this.f45803e = str2;
        this.f45804f = j;
        this.f45805g = j2;
        this.f45806h = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f45804f == eventMessage.f45804f && this.f45805g == eventMessage.f45805g && C20551y.m22311a(this.f45802d, eventMessage.f45802d) && C20551y.m22311a(this.f45803e, eventMessage.f45803e) && Arrays.equals(this.f45806h, eventMessage.f45806h);
    }

    public int hashCode() {
        if (this.f45807i == 0) {
            String str = this.f45802d;
            int i = 0;
            int hashCode = (C1883v2.CTRL_INDEX + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f45803e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f45804f;
            long j2 = this.f45805g;
            this.f45807i = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f45806h);
        }
        return this.f45807i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45802d);
        parcel.writeString(this.f45803e);
        parcel.writeLong(this.f45804f);
        parcel.writeLong(this.f45805g);
        parcel.writeByteArray(this.f45806h);
    }

    public EventMessage(Parcel parcel) {
        this.f45802d = parcel.readString();
        this.f45803e = parcel.readString();
        this.f45804f = parcel.readLong();
        this.f45805g = parcel.readLong();
        this.f45806h = parcel.createByteArray();
    }
}
