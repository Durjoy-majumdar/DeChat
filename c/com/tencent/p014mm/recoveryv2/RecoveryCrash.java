package com.tencent.p014mm.recoveryv2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85692k;
import df3.C86272a;

/* renamed from: com.tencent.mm.recoveryv2.RecoveryCrash */
public class RecoveryCrash {

    /* renamed from: a */
    public long f249626a;

    /* renamed from: b */
    public String f249627b;

    /* renamed from: c */
    public final C85672d f249628c;

    /* renamed from: d */
    public final C86272a f249629d;

    /* renamed from: com.tencent.mm.recoveryv2.RecoveryCrash$Record */
    public static class Record implements Parcelable {
        public static final Parcelable.Creator<Record> CREATOR = new C85661a();

        /* renamed from: d */
        public int f249630d;

        /* renamed from: e */
        public long f249631e;

        /* renamed from: f */
        public String f249632f;

        /* renamed from: com.tencent.mm.recoveryv2.RecoveryCrash$Record$a */
        public static class C85661a implements Parcelable.Creator<Record> {
            public Object createFromParcel(Parcel parcel) {
                return new Record(parcel);
            }

            public Object[] newArray(int i) {
                return new Record[i];
            }
        }

        public Record() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f249630d);
            parcel.writeLong(this.f249631e);
            parcel.writeString(this.f249632f);
        }

        public Record(Parcel parcel) {
            this.f249630d = parcel.readInt();
            this.f249631e = parcel.readLong();
            this.f249632f = parcel.readString();
        }
    }

    public RecoveryCrash(C86272a aVar, C85672d dVar) {
        this.f249628c = dVar;
        this.f249629d = aVar;
    }

    /* renamed from: b */
    public static RecoveryCrash m105765b(Context context) {
        C85672d.C85673a aVar = new C85672d.C85673a(context, "recovery_crash_count");
        aVar.mo119240a();
        C86272a aVar2 = new C86272a(aVar);
        RecoveryCrash recoveryCrash = new RecoveryCrash(aVar2, new C85672d.C85673a(context, "recovery_crash"));
        aVar2.f250884a = Math.max(aVar.getInt("crash_count", 0), 0);
        recoveryCrash.mo119228a();
        return recoveryCrash;
    }

    /* renamed from: c */
    public static RecoveryCrash m105766c(Context context) {
        C85672d.C85673a aVar = new C85672d.C85673a(context, "recovery_crash_count_isolated");
        aVar.mo119240a();
        C86272a aVar2 = new C86272a(aVar);
        RecoveryCrash recoveryCrash = new RecoveryCrash(aVar2, new C85672d.C85673a(context, "recovery_crash_isolated"));
        aVar2.f250884a = Math.max(aVar.getInt("crash_count", 0), 0);
        recoveryCrash.mo119228a();
        return recoveryCrash;
    }

    /* renamed from: a */
    public void mo119228a() {
        this.f249628c.mo119240a();
        if (this.f249627b == null) {
            this.f249627b = this.f249628c.getString("crash_version", (String) null);
            this.f249626a = Math.max(this.f249628c.getLong("crash_time", 0), 0);
        }
    }

    /* renamed from: d */
    public RecoveryCrash mo119229d() {
        C85692k.C85693a.m105840a(5, "MicroMsg.recovery.crash", "reset crash record!");
        this.f249629d.f250884a = 0;
        this.f249626a = 0;
        this.f249627b = null;
        return this;
    }

    /* renamed from: e */
    public void mo119230e() {
        C86272a aVar = this.f249629d;
        aVar.f250885b.putInt("crash_count", aVar.f250884a).mo119242c();
        this.f249628c.putString("crash_version", this.f249627b).putLong("crash_time", this.f249626a).mo119242c();
    }

    public RecoveryCrash(long j, String str, C86272a aVar, C85672d dVar) {
        this.f249626a = j;
        this.f249627b = str;
        this.f249628c = dVar;
        this.f249629d = aVar;
    }
}
