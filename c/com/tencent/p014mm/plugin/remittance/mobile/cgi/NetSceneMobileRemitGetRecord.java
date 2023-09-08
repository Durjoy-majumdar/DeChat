package com.tencent.p014mm.plugin.remittance.mobile.cgi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C77947ig2;
import te3.dj4;
import te3.ej4;
import wi2.C53178a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord */
public class NetSceneMobileRemitGetRecord extends C53178a {

    /* renamed from: u */
    public static final /* synthetic */ int f115981u = 0;

    /* renamed from: t */
    public ej4 f115982t;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel */
    public static class HisRcvrParcel implements Parcelable {
        public static final Parcelable.Creator<HisRcvrParcel> CREATOR = new C42830a();

        /* renamed from: d */
        public String f115983d;

        /* renamed from: e */
        public String f115984e;

        /* renamed from: f */
        public String f115985f;

        /* renamed from: g */
        public String f115986g;

        /* renamed from: h */
        public long f115987h;

        /* renamed from: i */
        public int f115988i;

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel$a */
        public class C42830a implements Parcelable.Creator<HisRcvrParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new HisRcvrParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new HisRcvrParcel[i];
            }
        }

        public HisRcvrParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f115983d);
            parcel.writeString(this.f115984e);
            parcel.writeString(this.f115985f);
            parcel.writeString(this.f115986g);
            parcel.writeLong(this.f115987h);
            parcel.writeInt(this.f115988i);
        }

        public HisRcvrParcel(C77947ig2 ig22) {
            this.f115983d = ig22.f227615d;
            this.f115984e = ig22.f227616e;
            this.f115985f = ig22.f227617f;
            this.f115986g = ig22.f227618g;
            this.f115987h = ig22.f227619h;
            this.f115988i = ig22.f227620i;
        }

        public HisRcvrParcel(Parcel parcel) {
            this.f115983d = parcel.readString();
            this.f115984e = parcel.readString();
            this.f115985f = parcel.readString();
            this.f115986g = parcel.readString();
            this.f115987h = parcel.readLong();
            this.f115988i = parcel.readInt();
        }
    }

    public NetSceneMobileRemitGetRecord(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new dj4();
        bVar.f127067b = new ej4();
        bVar.f127069d = 2993;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonegethisrcvrs";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        dj4 dj4 = (dj4) a.f127055a.f127080a;
        dj4.f132368d = str;
        dj4.f132369e = str2;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitGetRecord last_id:%s homepage_ext:%s", str, str2);
    }

    public int getType() {
        return 2993;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        ej4 ej4 = (ej4) ((C47350c) uVar).f127056b.f127083a;
        this.f115982t = ej4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", Integer.valueOf(ej4.f132961d), this.f115982t.f132962e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        ej4 ej4 = (ej4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = ej4.f132961d;
        this.f221038h = ej4.f132962e;
    }
}
