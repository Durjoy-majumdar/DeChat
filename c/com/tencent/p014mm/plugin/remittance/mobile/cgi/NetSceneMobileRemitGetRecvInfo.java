package com.tencent.p014mm.plugin.remittance.mobile.cgi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64600o30;
import te3.fj4;
import te3.gj4;
import wi2.C53178a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo */
public class NetSceneMobileRemitGetRecvInfo extends C53178a {

    /* renamed from: w */
    public static final /* synthetic */ int f115989w = 0;

    /* renamed from: t */
    public String f115990t;

    /* renamed from: u */
    public String f115991u;

    /* renamed from: v */
    public gj4 f115992v;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel */
    public static class DelayOptionParcel implements Parcelable {
        public static final Parcelable.Creator<DelayOptionParcel> CREATOR = new C42831a();

        /* renamed from: d */
        public String f115993d;

        /* renamed from: e */
        public int f115994e;

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel$a */
        public class C42831a implements Parcelable.Creator<DelayOptionParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new DelayOptionParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new DelayOptionParcel[i];
            }
        }

        public DelayOptionParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f115993d);
            parcel.writeInt(this.f115994e);
        }

        public DelayOptionParcel(C64600o30 o302) {
            this.f115993d = o302.f184612d;
            this.f115994e = o302.f184613e;
        }

        public DelayOptionParcel(Parcel parcel) {
            this.f115993d = parcel.readString();
            this.f115994e = parcel.readInt();
        }
    }

    public NetSceneMobileRemitGetRecvInfo(String str, String str2, String str3, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fj4();
        bVar.f127067b = new gj4();
        bVar.f127069d = 1495;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonegetrcvr";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        fj4 fj4 = (fj4) a.f127055a.f127080a;
        fj4.f133549d = str;
        fj4.f133550e = str2;
        fj4.f133551f = str3;
        fj4.f133552g = i;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "do scene NetSceneMobileRemitGetRecvInfo phone:%s rcvr_id:%s input_type:%s", str, str2, Integer.valueOf(i));
        this.f115990t = str2;
        this.f115991u = str;
    }

    public int getType() {
        return 1495;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        gj4 gj4 = (gj4) ((C47350c) uVar).f127056b.f127083a;
        this.f115992v = gj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "ret_code: %s, ret_msg: %s", Integer.valueOf(gj4.f227461d), this.f115992v.f227462e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        gj4 gj4 = (gj4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = gj4.f227461d;
        this.f221038h = gj4.f227462e;
    }
}
