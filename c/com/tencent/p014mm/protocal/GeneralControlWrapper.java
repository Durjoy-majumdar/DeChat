package com.tencent.p014mm.protocal;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C48904bt1;

/* renamed from: com.tencent.mm.protocal.GeneralControlWrapper */
public class GeneralControlWrapper implements Parcelable {
    public static final Parcelable.Creator<GeneralControlWrapper> CREATOR = new C44640a();

    /* renamed from: e */
    public static final GeneralControlWrapper f121044e = new GeneralControlWrapper(10);

    /* renamed from: f */
    public static final GeneralControlWrapper f121045f = new GeneralControlWrapper(1);

    /* renamed from: d */
    public int f121046d;

    /* renamed from: com.tencent.mm.protocal.GeneralControlWrapper$a */
    public class C44640a implements Parcelable.Creator<GeneralControlWrapper> {
        public Object createFromParcel(Parcel parcel) {
            return new GeneralControlWrapper(parcel, (C44640a) null);
        }

        public Object[] newArray(int i) {
            return new GeneralControlWrapper[i];
        }
    }

    public GeneralControlWrapper(C48904bt1 bt12) {
        if (bt12 == null) {
            this.f121046d = 0;
        } else {
            this.f121046d = bt12.f131299d;
        }
        Log.m105918d("MicroMsg.GeneralControlWrapper", "edw <init>, " + this);
    }

    /* renamed from: a */
    public boolean mo69429a() {
        boolean z = (this.f121046d & 32768) > 0;
        Log.m105918d("MicroMsg.GeneralControlWrapper", "allowFavImage, ret = " + z);
        return z;
    }

    /* renamed from: b */
    public boolean mo69430b() {
        boolean z = (this.f121046d & 2) > 0;
        Log.m105918d("MicroMsg.GeneralControlWrapper", "allowInnerOpenUrl, ret = " + z);
        return z;
    }

    /* renamed from: c */
    public boolean mo69431c() {
        boolean z = (this.f121046d & 65536) > 0;
        Log.m105918d("MicroMsg.GeneralControlWrapper", "allowMsgTail, ret = " + z);
        return z;
    }

    /* renamed from: d */
    public boolean mo69432d() {
        boolean z = (this.f121046d & 64) > 0;
        Log.m105918d("MicroMsg.GeneralControlWrapper", "allowScanQRCode, ret = " + z);
        return z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo69434e() {
        boolean z = (this.f121046d & 16384) > 0;
        Log.m105918d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = " + z);
        return z;
    }

    public String toString() {
        return "[bitset=0x" + Integer.toHexString(this.f121046d) + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121046d);
    }

    public GeneralControlWrapper(int i) {
        this.f121046d = i;
        Log.m105918d("MicroMsg.GeneralControlWrapper", "edw <init>, " + this);
    }

    public GeneralControlWrapper(Parcel parcel, C44640a aVar) {
        this.f121046d = parcel.readInt();
    }
}
