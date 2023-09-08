package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C47350c;
import te3.C51510u9;
import te3.C51819wd3;
import te3.C64458j03;
import te3.C64842xx2;
import te3.C78012xd3;
import te3.C78017yd3;
import te3.pi4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex */
public class CgiLqtPlanIndex extends C75128o0<C78012xd3> {

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel */
    public static class BannerParcel implements Parcelable {
        public static final Parcelable.Creator<BannerParcel> CREATOR = new C71606a();

        /* renamed from: d */
        public String f207542d;

        /* renamed from: e */
        public String f207543e;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel$a */
        public class C71606a implements Parcelable.Creator<BannerParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new BannerParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new BannerParcel[i];
            }
        }

        public BannerParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f207542d);
            parcel.writeString(this.f207543e);
        }

        public BannerParcel(Parcel parcel) {
            this.f207542d = parcel.readString();
            this.f207543e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel */
    public static class MoreRecordsParcel implements Parcelable {
        public static final Parcelable.Creator<MoreRecordsParcel> CREATOR = new C71608a();

        /* renamed from: d */
        public String f207547d;

        /* renamed from: e */
        public String f207548e;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel$a */
        public class C71608a implements Parcelable.Creator<MoreRecordsParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new MoreRecordsParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new MoreRecordsParcel[i];
            }
        }

        public MoreRecordsParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f207547d);
            parcel.writeString(this.f207548e);
        }

        public MoreRecordsParcel(Parcel parcel) {
            this.f207547d = parcel.readString();
            this.f207548e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel */
    public static class PlanItemParcel implements Parcelable {
        public static final Parcelable.Creator<PlanItemParcel> CREATOR = new C71610a();

        /* renamed from: d */
        public int f207557d;

        /* renamed from: e */
        public long f207558e;

        /* renamed from: f */
        public String f207559f;

        /* renamed from: g */
        public String f207560g;

        /* renamed from: h */
        public String f207561h;

        /* renamed from: i */
        public String f207562i;

        /* renamed from: j */
        public TransTipsItemParcel f207563j;

        /* renamed from: n */
        public MoreRecordsParcel f207564n;

        /* renamed from: o */
        public MngPlanItemParcel f207565o;

        /* renamed from: p */
        public int f207566p;

        /* renamed from: q */
        public int f207567q;

        /* renamed from: r */
        public String f207568r;

        /* renamed from: s */
        public String f207569s;

        /* renamed from: t */
        public String f207570t;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel$a */
        public class C71610a implements Parcelable.Creator<PlanItemParcel> {
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
            parcel.writeInt(this.f207557d);
            parcel.writeLong(this.f207558e);
            parcel.writeString(this.f207559f);
            parcel.writeString(this.f207560g);
            parcel.writeString(this.f207561h);
            parcel.writeString(this.f207562i);
            parcel.writeParcelable(this.f207563j, i);
            parcel.writeParcelable(this.f207564n, i);
            parcel.writeParcelable(this.f207565o, i);
            parcel.writeInt(this.f207566p);
            parcel.writeInt(this.f207567q);
            parcel.writeString(this.f207568r);
            parcel.writeString(this.f207569s);
            parcel.writeString(this.f207570t);
        }

        public PlanItemParcel(Parcel parcel) {
            this.f207557d = parcel.readInt();
            this.f207558e = parcel.readLong();
            this.f207559f = parcel.readString();
            this.f207560g = parcel.readString();
            this.f207561h = parcel.readString();
            this.f207562i = parcel.readString();
            this.f207563j = (TransTipsItemParcel) parcel.readParcelable(TransTipsItemParcel.class.getClassLoader());
            this.f207564n = (MoreRecordsParcel) parcel.readParcelable(MoreRecordsParcel.class.getClassLoader());
            this.f207565o = (MngPlanItemParcel) parcel.readParcelable(MngPlanItemParcel.class.getClassLoader());
            this.f207566p = parcel.readInt();
            this.f207567q = parcel.readInt();
            this.f207568r = parcel.readString();
            this.f207569s = parcel.readString();
            this.f207570t = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel */
    public static class TransTipsItemParcel implements Parcelable {
        public static final Parcelable.Creator<TransTipsItemParcel> CREATOR = new C71611a();

        /* renamed from: d */
        public String f207571d;

        /* renamed from: e */
        public String f207572e;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel$a */
        public class C71611a implements Parcelable.Creator<TransTipsItemParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new TransTipsItemParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new TransTipsItemParcel[i];
            }
        }

        public TransTipsItemParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f207571d);
            parcel.writeString(this.f207572e);
        }

        public TransTipsItemParcel(Parcel parcel) {
            this.f207571d = parcel.readString();
            this.f207572e = parcel.readString();
        }
    }

    public CgiLqtPlanIndex() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51819wd3();
        bVar.f127067b = new C78012xd3();
        bVar.f127069d = 2796;
        bVar.f127068c = "/cgi-bin/mmpay-bin/planindex";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C51819wd3 wd32 = (C51819wd3) a.f127055a.f127080a;
        mo123453j(a);
        Log.m105924i("MicroMsg.CgiLqtPlanIndex", "isfirstclick: %s");
    }

    /* renamed from: k */
    public static PlanIndexParcel m84097k(C78012xd3 xd32) {
        if (xd32 == null) {
            return null;
        }
        PlanIndexParcel planIndexParcel = new PlanIndexParcel();
        planIndexParcel.f207549d = xd32.f228407d;
        planIndexParcel.f207550e = xd32.f228408e;
        Iterator<C78017yd3> it = xd32.f228409f.iterator();
        while (it.hasNext()) {
            C78017yd3 next = it.next();
            PlanItemParcel planItemParcel = new PlanItemParcel();
            planItemParcel.f207557d = next.f228571d;
            planItemParcel.f207558e = next.f228572e;
            planItemParcel.f207559f = next.f228573f;
            planItemParcel.f207560g = next.f228574g;
            planItemParcel.f207561h = next.f228575h;
            planItemParcel.f207562i = next.f228576i;
            planItemParcel.f207569s = next.f228583s;
            planItemParcel.f207570t = next.f228584t;
            if (next.f228577j != null) {
                TransTipsItemParcel transTipsItemParcel = new TransTipsItemParcel();
                planItemParcel.f207563j = transTipsItemParcel;
                pi4 pi4 = next.f228577j;
                transTipsItemParcel.f207571d = pi4.f184817d;
                transTipsItemParcel.f207572e = pi4.f184818e;
            }
            if (next.f228578n != null) {
                MoreRecordsParcel moreRecordsParcel = new MoreRecordsParcel();
                planItemParcel.f207564n = moreRecordsParcel;
                C64458j03 j032 = next.f228578n;
                moreRecordsParcel.f207547d = j032.f183749d;
                moreRecordsParcel.f207548e = j032.f183750e;
            }
            if (next.f228579o != null) {
                MngPlanItemParcel mngPlanItemParcel = new MngPlanItemParcel();
                planItemParcel.f207565o = mngPlanItemParcel;
                C64842xx2 xx22 = next.f228579o;
                mngPlanItemParcel.f207544d = xx22.f186414d;
                mngPlanItemParcel.f207545e = xx22.f186415e;
                Iterator<Integer> it4 = xx22.f186416f.iterator();
                while (it4.hasNext()) {
                    planItemParcel.f207565o.f207546f.add(it4.next());
                }
            }
            planItemParcel.f207566p = next.f228580p;
            planItemParcel.f207567q = next.f228581q;
            planItemParcel.f207568r = next.f228582r;
            planIndexParcel.f207551f.add(planItemParcel);
        }
        planIndexParcel.f207552g = xd32.f228410g;
        planIndexParcel.f207553h = xd32.f228411h;
        if (xd32.f228412i != null) {
            BannerParcel bannerParcel = new BannerParcel();
            planIndexParcel.f207554i = bannerParcel;
            C51510u9 u9Var = xd32.f228412i;
            bannerParcel.f207542d = u9Var.f142683d;
            bannerParcel.f207543e = u9Var.f142684e;
        }
        planIndexParcel.f207555j = xd32.f228413j;
        planIndexParcel.f207556n = xd32.f228414n;
        return planIndexParcel;
    }

    /* renamed from: l */
    public static C78012xd3 m84098l(PlanIndexParcel planIndexParcel) {
        if (planIndexParcel == null) {
            return null;
        }
        C78012xd3 xd32 = new C78012xd3();
        xd32.f228407d = planIndexParcel.f207549d;
        xd32.f228408e = planIndexParcel.f207550e;
        Iterator<PlanItemParcel> it = planIndexParcel.f207551f.iterator();
        while (it.hasNext()) {
            PlanItemParcel next = it.next();
            C78017yd3 yd32 = new C78017yd3();
            yd32.f228571d = next.f207557d;
            yd32.f228572e = next.f207558e;
            yd32.f228573f = next.f207559f;
            yd32.f228574g = next.f207560g;
            yd32.f228575h = next.f207561h;
            yd32.f228576i = next.f207562i;
            yd32.f228584t = next.f207570t;
            yd32.f228583s = next.f207569s;
            if (next.f207563j != null) {
                pi4 pi4 = new pi4();
                yd32.f228577j = pi4;
                TransTipsItemParcel transTipsItemParcel = next.f207563j;
                pi4.f184817d = transTipsItemParcel.f207571d;
                pi4.f184818e = transTipsItemParcel.f207572e;
            }
            if (next.f207564n != null) {
                C64458j03 j032 = new C64458j03();
                yd32.f228578n = j032;
                MoreRecordsParcel moreRecordsParcel = next.f207564n;
                j032.f183749d = moreRecordsParcel.f207547d;
                j032.f183750e = moreRecordsParcel.f207548e;
            }
            if (next.f207565o != null) {
                C64842xx2 xx22 = new C64842xx2();
                yd32.f228579o = xx22;
                MngPlanItemParcel mngPlanItemParcel = next.f207565o;
                xx22.f186414d = mngPlanItemParcel.f207544d;
                xx22.f186415e = mngPlanItemParcel.f207545e;
                Iterator<Integer> it4 = mngPlanItemParcel.f207546f.iterator();
                while (it4.hasNext()) {
                    yd32.f228579o.f186416f.add(it4.next());
                }
            }
            yd32.f228580p = next.f207566p;
            yd32.f228581q = next.f207567q;
            yd32.f228582r = next.f207568r;
            xd32.f228409f.add(yd32);
        }
        xd32.f228410g = planIndexParcel.f207552g;
        xd32.f228411h = planIndexParcel.f207553h;
        if (planIndexParcel.f207554i != null) {
            C51510u9 u9Var = new C51510u9();
            xd32.f228412i = u9Var;
            BannerParcel bannerParcel = planIndexParcel.f207554i;
            u9Var.f142683d = bannerParcel.f207542d;
            u9Var.f142684e = bannerParcel.f207543e;
        }
        xd32.f228413j = planIndexParcel.f207555j;
        xd32.f228414n = planIndexParcel.f207556n;
        return xd32;
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel */
    public static class MngPlanItemParcel implements Parcelable {
        public static final Parcelable.Creator<MngPlanItemParcel> CREATOR = new C71607a();

        /* renamed from: d */
        public boolean f207544d;

        /* renamed from: e */
        public String f207545e;

        /* renamed from: f */
        public ArrayList<Integer> f207546f = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel$a */
        public class C71607a implements Parcelable.Creator<MngPlanItemParcel> {
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
            parcel.writeByte(this.f207544d ? (byte) 1 : 0);
            parcel.writeString(this.f207545e);
            parcel.writeList(this.f207546f);
        }

        public MngPlanItemParcel(Parcel parcel) {
            this.f207544d = parcel.readByte() != 0;
            this.f207545e = parcel.readString();
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f207546f = arrayList;
            parcel.readList(arrayList, Integer.class.getClassLoader());
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel */
    public static class PlanIndexParcel implements Parcelable {
        public static final Parcelable.Creator<PlanIndexParcel> CREATOR = new C71609a();

        /* renamed from: d */
        public int f207549d;

        /* renamed from: e */
        public String f207550e;

        /* renamed from: f */
        public ArrayList<PlanItemParcel> f207551f = new ArrayList<>();

        /* renamed from: g */
        public long f207552g;

        /* renamed from: h */
        public String f207553h;

        /* renamed from: i */
        public BannerParcel f207554i;

        /* renamed from: j */
        public String f207555j;

        /* renamed from: n */
        public String f207556n;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel$a */
        public class C71609a implements Parcelable.Creator<PlanIndexParcel> {
            public Object createFromParcel(Parcel parcel) {
                return new PlanIndexParcel(parcel);
            }

            public Object[] newArray(int i) {
                return new PlanIndexParcel[i];
            }
        }

        public PlanIndexParcel() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f207549d);
            parcel.writeString(this.f207550e);
            parcel.writeList(this.f207551f);
            parcel.writeLong(this.f207552g);
            parcel.writeString(this.f207553h);
            parcel.writeParcelable(this.f207554i, i);
            parcel.writeString(this.f207555j);
            parcel.writeString(this.f207556n);
        }

        public PlanIndexParcel(Parcel parcel) {
            this.f207549d = parcel.readInt();
            this.f207550e = parcel.readString();
            ArrayList<PlanItemParcel> arrayList = new ArrayList<>();
            this.f207551f = arrayList;
            parcel.readList(arrayList, PlanItemParcel.class.getClassLoader());
            this.f207552g = parcel.readLong();
            this.f207553h = parcel.readString();
            this.f207554i = (BannerParcel) parcel.readParcelable(BannerParcel.class.getClassLoader());
            this.f207555j = parcel.readString();
            this.f207556n = parcel.readString();
        }
    }
}
