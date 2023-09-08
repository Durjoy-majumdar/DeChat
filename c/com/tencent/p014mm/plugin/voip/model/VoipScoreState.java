package com.tencent.p014mm.plugin.voip.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75604z3;

/* renamed from: com.tencent.mm.plugin.voip.model.VoipScoreState */
public class VoipScoreState implements Parcelable {
    public static final Parcelable.Creator<VoipScoreState> CREATOR = new C106329a();

    /* renamed from: d */
    public String f317163d = "";

    /* renamed from: e */
    public int f317164e = -1;

    /* renamed from: f */
    public int f317165f = -1;

    /* renamed from: g */
    public long f317166g = -1;

    /* renamed from: h */
    public long f317167h = -1;

    /* renamed from: i */
    public long f317168i = 0;

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipScoreState$a */
    public class C106329a implements Parcelable.Creator<VoipScoreState> {
        public Object createFromParcel(Parcel parcel) {
            return new VoipScoreState(parcel);
        }

        public Object[] newArray(int i) {
            return new VoipScoreState[i];
        }
    }

    public VoipScoreState() {
        Log.printInfoStack("MicroMsg.VoipScoreState", "create VoipScoreState", new Object[0]);
    }

    /* renamed from: a */
    public void mo152532a() {
        long p = C75604z3.m90844p();
        this.f317167h = p;
        Log.m105925i("MicroMsg.VoipScoreState", "markStartTalk, startTalkTime:%s", Long.valueOf(p));
    }

    /* renamed from: b */
    public void mo152533b(String str, int i, int i2, long j) {
        Log.m105925i("MicroMsg.VoipScoreState", "setScoreState, roomId:%s, roomKey:%s, title:%s, interval:%s", Integer.valueOf(i2), Long.valueOf(j), str, Integer.valueOf(i));
        this.f317165f = i2;
        this.f317166g = j;
        if (!Util.isNullOrNil(str)) {
            try {
                String str2 = new String(Base64.decode(str.getBytes(), 0));
                Log.printInfoStack("MicroMsg.VoipScoreState", "setScoreState, title:%s, interval:%s", str2, Integer.valueOf(i));
                this.f317164e = i;
                this.f317163d = str2;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoipScoreState", e, "setScoreState error: %s", e.getMessage());
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "VoipScoreState{scoreTitle='" + this.f317163d + '\'' + ", scoreIntervalDay=" + this.f317164e + ", roomId=" + this.f317165f + ", roomKey=" + this.f317166g + ", startTalkTime=" + this.f317167h + ", lastShowScoreTime=" + this.f317168i + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f317163d);
        parcel.writeInt(this.f317164e);
        parcel.writeInt(this.f317165f);
        parcel.writeLong(this.f317166g);
        parcel.writeLong(this.f317167h);
        parcel.writeLong(this.f317168i);
    }

    public VoipScoreState(Parcel parcel) {
        this.f317163d = parcel.readString();
        this.f317164e = parcel.readInt();
        this.f317165f = parcel.readInt();
        this.f317166g = parcel.readLong();
        this.f317167h = parcel.readLong();
        this.f317168i = parcel.readLong();
    }
}
