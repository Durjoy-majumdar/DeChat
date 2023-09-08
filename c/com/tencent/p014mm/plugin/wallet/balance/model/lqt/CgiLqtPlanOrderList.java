package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C47350c;
import te3.C49861ik3;
import te3.C50004jk3;
import te3.C64842xx2;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList */
public class CgiLqtPlanOrderList extends C75128o0<C50004jk3> {

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel */
    public static class PlanItemParcel implements Parcelable {
        public static final Parcelable.Creator<PlanItemParcel> CREATOR = new C71613a();

        /* renamed from: d */
        public int f207576d;

        /* renamed from: e */
        public long f207577e;

        /* renamed from: f */
        public String f207578f;

        /* renamed from: g */
        public String f207579g;

        /* renamed from: h */
        public MngPlanItemParcel f207580h;

        /* renamed from: i */
        public int f207581i;

        /* renamed from: j */
        public int f207582j;

        /* renamed from: n */
        public String f207583n;

        /* renamed from: o */
        public String f207584o;

        /* renamed from: p */
        public String f207585p;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel$a */
        public class C71613a implements Parcelable.Creator<PlanItemParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new PlanItemParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new PlanItemParcel[i];
            }
        }

        public PlanItemParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f207576d);
            parcel.writeLong(this.f207577e);
            parcel.writeString(this.f207578f);
            parcel.writeString(this.f207579g);
            parcel.writeParcelable(this.f207580h, i);
            parcel.writeInt(this.f207581i);
            parcel.writeInt(this.f207582j);
            parcel.writeString(this.f207583n);
            parcel.writeString(this.f207584o);
            parcel.writeString(this.f207585p);
        }

        public PlanItemParcel(Parcel parcel) {
            this.f207576d = parcel.readInt();
            this.f207577e = parcel.readLong();
            this.f207578f = parcel.readString();
            this.f207579g = parcel.readString();
            this.f207580h = (MngPlanItemParcel) parcel.readParcelable(MngPlanItemParcel.class.getClassLoader());
            this.f207581i = parcel.readInt();
            this.f207582j = parcel.readInt();
            this.f207583n = parcel.readString();
            this.f207584o = parcel.readString();
            this.f207585p = parcel.readString();
        }
    }

    public CgiLqtPlanOrderList(int i, int i2, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49861ik3();
        bVar.f127067b = new C50004jk3();
        bVar.f127069d = 1916;
        bVar.f127068c = "/cgi-bin/mmpay-bin/qryautoplanorderlist";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C49861ik3 ik32 = (C49861ik3) a.f127055a.f127080a;
        ik32.f135433d = (long) i;
        ik32.f135434e = (long) i2;
        ik32.f135435f = (long) i3;
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiLqtPlanOrderList", "CgiLqtPlanOrderList Req：plan_id: %s, offset: %s, limit: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: k */
    public static C78017yd3 m84099k(PlanItemParcel planItemParcel) {
        if (planItemParcel == null) {
            return null;
        }
        C78017yd3 yd32 = new C78017yd3();
        yd32.f228580p = planItemParcel.f207581i;
        yd32.f228572e = planItemParcel.f207577e;
        yd32.f228571d = planItemParcel.f207576d;
        yd32.f228583s = planItemParcel.f207584o;
        yd32.f228582r = planItemParcel.f207583n;
        yd32.f228573f = planItemParcel.f207578f;
        yd32.f228574g = planItemParcel.f207579g;
        yd32.f228581q = planItemParcel.f207582j;
        yd32.f228584t = planItemParcel.f207585p;
        if (planItemParcel.f207580h != null) {
            C64842xx2 xx22 = new C64842xx2();
            yd32.f228579o = xx22;
            MngPlanItemParcel mngPlanItemParcel = planItemParcel.f207580h;
            xx22.f186414d = mngPlanItemParcel.f207573d;
            xx22.f186415e = mngPlanItemParcel.f207574e;
            Iterator<Integer> it = mngPlanItemParcel.f207575f.iterator();
            while (it.hasNext()) {
                yd32.f228579o.f186416f.add(it.next());
            }
        }
        return yd32;
    }

    /* renamed from: l */
    public static PlanItemParcel m84100l(C78017yd3 yd32) {
        if (yd32 == null) {
            return null;
        }
        PlanItemParcel planItemParcel = new PlanItemParcel();
        planItemParcel.f207581i = yd32.f228580p;
        planItemParcel.f207577e = yd32.f228572e;
        planItemParcel.f207576d = yd32.f228571d;
        planItemParcel.f207584o = yd32.f228583s;
        planItemParcel.f207583n = yd32.f228582r;
        planItemParcel.f207578f = yd32.f228573f;
        planItemParcel.f207579g = yd32.f228574g;
        planItemParcel.f207582j = yd32.f228581q;
        planItemParcel.f207585p = yd32.f228584t;
        if (yd32.f228579o != null) {
            MngPlanItemParcel mngPlanItemParcel = new MngPlanItemParcel();
            planItemParcel.f207580h = mngPlanItemParcel;
            C64842xx2 xx22 = yd32.f228579o;
            mngPlanItemParcel.f207573d = xx22.f186414d;
            mngPlanItemParcel.f207574e = xx22.f186415e;
            Iterator<Integer> it = xx22.f186416f.iterator();
            while (it.hasNext()) {
                planItemParcel.f207580h.f207575f.add(it.next());
            }
        }
        return planItemParcel;
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel */
    public static class MngPlanItemParcel implements Parcelable {
        public static final Parcelable.Creator<MngPlanItemParcel> CREATOR = new C71612a();

        /* renamed from: d */
        public boolean f207573d;

        /* renamed from: e */
        public String f207574e;

        /* renamed from: f */
        public ArrayList<Integer> f207575f = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel$a */
        public class C71612a implements Parcelable.Creator<MngPlanItemParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new MngPlanItemParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new MngPlanItemParcel[i];
            }
        }

        public MngPlanItemParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f207573d ? (byte) 1 : 0);
            parcel.writeString(this.f207574e);
            parcel.writeList(this.f207575f);
        }

        public MngPlanItemParcel(Parcel parcel) {
            this.f207573d = parcel.readByte() != 0;
            this.f207574e = parcel.readString();
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f207575f = arrayList;
            parcel.readList(arrayList, Integer.class.getClassLoader());
        }
    }
}
