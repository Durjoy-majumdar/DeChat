package com.tencent.p014mm.openim.api;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.openim.model.IOpenIMKefuConfirmController;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C51195s3;

/* renamed from: com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest */
public class OpenIMKefuStartConversationRequest implements Parcelable {
    public static final Parcelable.Creator<OpenIMKefuStartConversationRequest> CREATOR = new C40387a();

    /* renamed from: d */
    public Context f108515d;

    /* renamed from: e */
    public long f108516e;

    /* renamed from: f */
    public int f108517f;

    /* renamed from: g */
    public boolean f108518g;

    /* renamed from: h */
    public int f108519h;

    /* renamed from: i */
    public C51195s3 f108520i;

    /* renamed from: j */
    public boolean f108521j;

    /* renamed from: n */
    public boolean f108522n;

    /* renamed from: o */
    public String f108523o;

    /* renamed from: p */
    public boolean f108524p;

    /* renamed from: q */
    public boolean f108525q;

    /* renamed from: r */
    public boolean f108526r;

    /* renamed from: s */
    public boolean f108527s;

    /* renamed from: t */
    public Intent f108528t;

    /* renamed from: u */
    public Intent f108529u;

    /* renamed from: com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest$a */
    public class C40387a implements Parcelable.Creator<OpenIMKefuStartConversationRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new OpenIMKefuStartConversationRequest(parcel, (C40387a) null);
        }

        public Object[] newArray(int i) {
            return new OpenIMKefuStartConversationRequest[i];
        }
    }

    public OpenIMKefuStartConversationRequest() {
        this.f108515d = null;
        this.f108516e = 0;
        this.f108518g = false;
        this.f108521j = false;
        this.f108522n = false;
        this.f108523o = "";
        this.f108527s = true;
        this.f108529u = new Intent();
        this.f108519h = 2;
        this.f108524p = false;
        this.f108525q = false;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        Object[] objArr = new Object[9];
        objArr[0] = Integer.valueOf(this.f108517f);
        objArr[1] = Boolean.valueOf(this.f108518g);
        C51195s3 s3Var = this.f108520i;
        String str = "null";
        objArr[2] = s3Var != null ? s3Var.f141285d : str;
        objArr[3] = Integer.valueOf(this.f108519h);
        objArr[4] = Boolean.valueOf(this.f108524p);
        objArr[5] = Boolean.valueOf(this.f108525q);
        C51195s3 s3Var2 = this.f108520i;
        if (s3Var2 != null) {
            str = s3Var2.f141289h;
        }
        objArr[6] = str;
        objArr[7] = Boolean.valueOf(this.f108527s);
        objArr[8] = Boolean.valueOf(this.f108521j);
        return String.format("OpenIMKefuStartConversationRequest {getContactScene: %s, skipAppBrandBindStateCheck: %b, url: %s, uiMode: %s, needConversationList: %s, needChattingAnim: %s, username: %s, needUpdateTicket: %s, isStartingHalfActivity: %s}", objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f108516e);
        parcel.writeInt(this.f108517f);
        parcel.writeByte(this.f108518g ? (byte) 1 : 0);
        parcel.writeInt(this.f108519h);
        parcel.writeByte(this.f108522n ? (byte) 1 : 0);
        parcel.writeString(this.f108523o);
        parcel.writeByte(this.f108524p ? (byte) 1 : 0);
        parcel.writeByte(this.f108525q ? (byte) 1 : 0);
        parcel.writeByte(this.f108527s ? (byte) 1 : 0);
        parcel.writeByte(this.f108526r ? (byte) 1 : 0);
        parcel.writeParcelable(this.f108529u, i);
        try {
            C51195s3 s3Var = this.f108520i;
            if (s3Var != null) {
                byte[] byteArray = s3Var.toByteArray();
                if (byteArray != null) {
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                } else {
                    parcel.writeInt(0);
                    parcel.writeByteArray(new byte[0]);
                }
            } else {
                parcel.writeInt(0);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("", e, "OpenIMKefuStartConversationRequest writeToParcel exception", new Object[0]);
        }
        parcel.writeByte(this.f108521j ? (byte) 1 : 0);
    }

    public OpenIMKefuStartConversationRequest(Parcel parcel, C40387a aVar) {
        this.f108515d = null;
        this.f108516e = 0;
        boolean z = false;
        this.f108518g = false;
        this.f108521j = false;
        this.f108522n = false;
        this.f108523o = "";
        this.f108527s = true;
        this.f108529u = new Intent();
        this.f108516e = parcel.readLong();
        this.f108517f = parcel.readInt();
        this.f108518g = parcel.readByte() != 0;
        this.f108519h = parcel.readInt();
        this.f108522n = parcel.readByte() != 0;
        this.f108523o = parcel.readString();
        this.f108524p = parcel.readByte() != 0;
        this.f108525q = parcel.readByte() != 0;
        this.f108527s = parcel.readByte() != 0;
        this.f108526r = parcel.readByte() != 0;
        this.f108529u = (Intent) parcel.readParcelable(IOpenIMKefuConfirmController.ConfirmResultReceiver.class.getClassLoader());
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                C51195s3 s3Var = new C51195s3();
                this.f108520i = s3Var;
                s3Var.parseFrom(bArr);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("", e, "OpenIMKefuStartConversationRequest parse exception", new Object[0]);
        }
        this.f108521j = parcel.readByte() != 0 ? true : z;
    }
}
