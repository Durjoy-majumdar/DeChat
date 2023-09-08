package com.tencent.p014mm.plugin.p019aa.model.cgi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49577gl3;
import te3.C64541m;
import te3.C77933g43;
import te3.C77943hl3;
import te3.C77970o;

/* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo */
public class NetSceneNewAAQueryPFInfo extends C75113f0 {

    /* renamed from: r */
    public C47350c f195911r;

    /* renamed from: s */
    public C77943hl3 f195912s;

    /* renamed from: t */
    public C11385n f195913t;

    /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel */
    public static class AALaunchItemParcel implements Parcelable {
        public static final Parcelable.Creator<AALaunchItemParcel> CREATOR = new C68163a();

        /* renamed from: d */
        public String f195914d;

        /* renamed from: e */
        public long f195915e;

        /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel$a */
        public class C68163a implements Parcelable.Creator<AALaunchItemParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new AALaunchItemParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new AALaunchItemParcel[i];
            }
        }

        public AALaunchItemParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "AALaunchItemParcel{username='" + this.f195914d + '\'' + ", amount=" + this.f195915e + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f195914d);
            parcel.writeLong(this.f195915e);
        }

        public AALaunchItemParcel(Parcel parcel) {
            this.f195914d = parcel.readString();
            this.f195915e = parcel.readLong();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel */
    public static class AAOperationInfoParcel implements Parcelable {
        public static final Parcelable.Creator<AAOperationInfoParcel> CREATOR = new C68164a();

        /* renamed from: d */
        public int f195916d;

        /* renamed from: e */
        public int f195917e;

        /* renamed from: f */
        public int f195918f;

        /* renamed from: g */
        public long f195919g;

        /* renamed from: h */
        public long f195920h;

        /* renamed from: i */
        public String f195921i;

        /* renamed from: j */
        public String f195922j;

        /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AAOperationInfoParcel$a */
        public class C68164a implements Parcelable.Creator<AAOperationInfoParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new AAOperationInfoParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new AAOperationInfoParcel[i];
            }
        }

        public AAOperationInfoParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "AAOperationInfoParcel{max_payer_num=" + this.f195916d + ", max_receiver_num=" + this.f195917e + ", max_total_num=" + this.f195918f + ", max_total_amount=" + this.f195919g + ", max_per_amount=" + this.f195920h + ", notice='" + this.f195921i + '\'' + ", notice_url='" + this.f195922j + '\'' + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f195916d);
            parcel.writeInt(this.f195917e);
            parcel.writeInt(this.f195918f);
            parcel.writeLong(this.f195919g);
            parcel.writeLong(this.f195920h);
            parcel.writeString(this.f195921i);
            parcel.writeString(this.f195922j);
        }

        public AAOperationInfoParcel(Parcel parcel) {
            this.f195916d = parcel.readInt();
            this.f195917e = parcel.readInt();
            this.f195918f = parcel.readInt();
            this.f195919g = parcel.readLong();
            this.f195920h = parcel.readLong();
            this.f195921i = parcel.readString();
            this.f195922j = parcel.readString();
        }
    }

    public NetSceneNewAAQueryPFInfo(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49577gl3();
        bVar.f127067b = new C77943hl3();
        bVar.f127069d = 1809;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaquerypfinfo";
        C47350c a = bVar.mo72403a();
        this.f195911r = a;
        C49577gl3 gl32 = (C49577gl3) a.f127055a.f127080a;
        gl32.f134119d = str;
        gl32.f134120e = str2;
        Log.m105925i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "do scene NetSceneNewAAQueryPFInfo pf_order_no:%s appid:%s", str, str2);
    }

    /* renamed from: r1 */
    public static PfInfoParcel m80582r1(C77943hl3 hl32) {
        if (hl32 == null) {
            return null;
        }
        PfInfoParcel pfInfoParcel = new PfInfoParcel();
        pfInfoParcel.f195923d = hl32.f227580f;
        pfInfoParcel.f195924e = hl32.f227581g;
        Iterator<C64541m> it = hl32.f227582h.iterator();
        while (it.hasNext()) {
            C64541m next = it.next();
            AALaunchItemParcel aALaunchItemParcel = new AALaunchItemParcel();
            aALaunchItemParcel.f195914d = next.f184188d;
            aALaunchItemParcel.f195915e = next.f184189e;
            pfInfoParcel.f195925f.add(aALaunchItemParcel);
        }
        pfInfoParcel.f195926g = hl32.f227583i;
        pfInfoParcel.f195927h = hl32.f227584j;
        if (hl32.f227585n != null) {
            pfInfoParcel.f195928i = new SessionIdListParcel();
            Iterator<String> it4 = hl32.f227585n.f140663d.iterator();
            while (it4.hasNext()) {
                pfInfoParcel.f195928i.f195932d.add(it4.next());
            }
            Iterator<String> it5 = hl32.f227585n.f140664e.iterator();
            while (it5.hasNext()) {
                pfInfoParcel.f195928i.f195933e.add(it5.next());
            }
        }
        pfInfoParcel.f195929j = hl32.f227586o;
        AAOperationInfoParcel aAOperationInfoParcel = new AAOperationInfoParcel();
        pfInfoParcel.f195930n = aAOperationInfoParcel;
        C77970o oVar = hl32.f227587p;
        aAOperationInfoParcel.f195916d = oVar.f227894d;
        aAOperationInfoParcel.f195917e = oVar.f227895e;
        aAOperationInfoParcel.f195918f = oVar.f227896f;
        aAOperationInfoParcel.f195919g = oVar.f227897g;
        aAOperationInfoParcel.f195920h = oVar.f227898h;
        aAOperationInfoParcel.f195921i = oVar.f227899i;
        aAOperationInfoParcel.f195922j = oVar.f227900j;
        pfInfoParcel.f195931o = hl32.f227588q;
        return pfInfoParcel;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "doScene");
        this.f195913t = nVar;
        return dispatch(gVar, this.f195911r, this);
    }

    public int getType() {
        return 1809;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C77943hl3 hl32 = (C77943hl3) ((C47350c) uVar).f127056b.f127083a;
        this.f195912s = hl32;
        Log.m105925i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "ret_code: %s, ret_msg: %s", Integer.valueOf(hl32.f227578d), this.f195912s.f227579e);
        C11385n nVar = this.f195913t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C77943hl3 hl32 = (C77943hl3) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = hl32.f227578d;
        this.f221038h = hl32.f227579e;
    }

    /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel */
    public static class PfInfoParcel implements Parcelable {
        public static final Parcelable.Creator<PfInfoParcel> CREATOR = new C68165a();

        /* renamed from: d */
        public long f195923d;

        /* renamed from: e */
        public String f195924e;

        /* renamed from: f */
        public ArrayList<AALaunchItemParcel> f195925f = new ArrayList<>();

        /* renamed from: g */
        public String f195926g;

        /* renamed from: h */
        public String f195927h;

        /* renamed from: i */
        public SessionIdListParcel f195928i;

        /* renamed from: j */
        public String f195929j;

        /* renamed from: n */
        public AAOperationInfoParcel f195930n;

        /* renamed from: o */
        public C77933g43 f195931o;

        /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$PfInfoParcel$a */
        public class C68165a implements Parcelable.Creator<PfInfoParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new PfInfoParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new PfInfoParcel[i];
            }
        }

        public PfInfoParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "PfInfoParcel{amount=" + this.f195923d + ", receiver_username='" + this.f195924e + '\'' + ", payer_list=" + this.f195925f + ", pic_url='" + this.f195926g + '\'' + ", remark='" + this.f195927h + '\'' + ", sessionid_list=" + this.f195928i + ", pic_sign='" + this.f195929j + '\'' + ", operation_info=" + this.f195930n + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f195923d);
            parcel.writeString(this.f195924e);
            parcel.writeTypedList(this.f195925f);
            parcel.writeString(this.f195926g);
            parcel.writeString(this.f195927h);
            parcel.writeParcelable(this.f195928i, i);
            parcel.writeString(this.f195929j);
            parcel.writeParcelable(this.f195930n, i);
            C77933g43 g432 = this.f195931o;
            if (g432 != null) {
                try {
                    byte[] byteArray = g432.toByteArray();
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray, 0, byteArray.length);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", e, "", new Object[0]);
                }
            } else {
                parcel.writeInt(0);
            }
        }

        public PfInfoParcel(Parcel parcel) {
            this.f195923d = parcel.readLong();
            this.f195924e = parcel.readString();
            this.f195925f = parcel.createTypedArrayList(AALaunchItemParcel.CREATOR);
            this.f195926g = parcel.readString();
            this.f195927h = parcel.readString();
            this.f195928i = (SessionIdListParcel) parcel.readParcelable(SessionIdListParcel.class.getClassLoader());
            this.f195929j = parcel.readString();
            this.f195930n = (AAOperationInfoParcel) parcel.readParcelable(AAOperationInfoParcel.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                C77933g43 g432 = new C77933g43();
                try {
                    g432.parseFrom(bArr);
                    this.f195931o = g432;
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel */
    public static class SessionIdListParcel implements Parcelable {
        public static final Parcelable.Creator<SessionIdListParcel> CREATOR = new C68166a();

        /* renamed from: d */
        public ArrayList<String> f195932d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<String> f195933e = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$SessionIdListParcel$a */
        public class C68166a implements Parcelable.Creator<SessionIdListParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new SessionIdListParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new SessionIdListParcel[i];
            }
        }

        public SessionIdListParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SessionIdListParcel{username=" + this.f195932d + ", groupid=" + this.f195933e + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.f195932d);
            parcel.writeStringList(this.f195933e);
        }

        public SessionIdListParcel(Parcel parcel) {
            this.f195932d = parcel.createStringArrayList();
            this.f195933e = parcel.createStringArrayList();
        }
    }
}
