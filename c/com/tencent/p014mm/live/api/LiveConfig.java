package com.tencent.p014mm.live.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.HashMap;
import pe3.C47465a;
import te3.C64634po2;

/* renamed from: com.tencent.mm.live.api.LiveConfig */
public class LiveConfig implements Parcelable {
    public static final Parcelable.Creator<LiveConfig> CREATOR = new C55203a();

    /* renamed from: V */
    public static boolean f157042V;

    /* renamed from: A */
    public String f157043A = "";

    /* renamed from: B */
    public long f157044B = 0;

    /* renamed from: C */
    public long f157045C = 0;

    /* renamed from: D */
    public String f157046D = "";

    /* renamed from: E */
    public String f157047E = "";

    /* renamed from: F */
    public boolean f157048F = false;

    /* renamed from: G */
    public String f157049G = "";

    /* renamed from: H */
    public int f157050H = 0;

    /* renamed from: I */
    public int f157051I = 0;

    /* renamed from: J */
    public String f157052J = "";

    /* renamed from: K */
    public String f157053K = "";

    /* renamed from: L */
    public long f157054L = 0;

    /* renamed from: M */
    public byte[] f157055M = null;

    /* renamed from: N */
    public int f157056N = 0;

    /* renamed from: P */
    public int f157057P = 0;

    /* renamed from: Q */
    public int f157058Q = 0;

    /* renamed from: R */
    public int f157059R = 0;

    /* renamed from: S */
    public int f157060S = 0;

    /* renamed from: T */
    public String f157061T = "";

    /* renamed from: U */
    public C64634po2 f157062U = null;

    /* renamed from: d */
    public int f157063d = 0;

    /* renamed from: e */
    public long f157064e = 0;

    /* renamed from: f */
    public String f157065f = "";

    /* renamed from: g */
    public String f157066g = "";

    /* renamed from: h */
    public HashMap f157067h = new HashMap();

    /* renamed from: i */
    public String f157068i = "";

    /* renamed from: j */
    public String f157069j = "";

    /* renamed from: n */
    public int f157070n = 0;

    /* renamed from: o */
    public int f157071o = 0;

    /* renamed from: p */
    public String f157072p = "";

    /* renamed from: q */
    public int f157073q = 0;

    /* renamed from: r */
    public String f157074r = "";

    /* renamed from: s */
    public long f157075s = 0;

    /* renamed from: t */
    public String f157076t = "";

    /* renamed from: u */
    public int f157077u = 0;

    /* renamed from: v */
    public String f157078v = "";

    /* renamed from: w */
    public String f157079w = "";

    /* renamed from: x */
    public String f157080x = "";

    /* renamed from: y */
    public String f157081y = "";

    /* renamed from: z */
    public String f157082z = "";

    /* renamed from: com.tencent.mm.live.api.LiveConfig$a */
    public class C55203a implements Parcelable.Creator<LiveConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new LiveConfig(parcel);
        }

        public Object[] newArray(int i) {
            return new LiveConfig[i];
        }
    }

    /* renamed from: com.tencent.mm.live.api.LiveConfig$b */
    public static class C55204b {

        /* renamed from: A */
        public long f157083A = 0;

        /* renamed from: B */
        public byte[] f157084B = null;

        /* renamed from: C */
        public int f157085C = 0;

        /* renamed from: D */
        public int f157086D = 0;

        /* renamed from: E */
        public int f157087E = 0;

        /* renamed from: F */
        public int f157088F = 0;

        /* renamed from: G */
        public int f157089G = 0;

        /* renamed from: H */
        public String f157090H = "";

        /* renamed from: a */
        public int f157091a = 0;

        /* renamed from: b */
        public String f157092b = "";

        /* renamed from: c */
        public long f157093c = 0;

        /* renamed from: d */
        public String f157094d = "";

        /* renamed from: e */
        public String f157095e = "";

        /* renamed from: f */
        public String f157096f = "";

        /* renamed from: g */
        public int f157097g = 0;

        /* renamed from: h */
        public int f157098h = 0;

        /* renamed from: i */
        public String f157099i = "";

        /* renamed from: j */
        public int f157100j = 0;

        /* renamed from: k */
        public long f157101k = 0;

        /* renamed from: l */
        public String f157102l = "";

        /* renamed from: m */
        public int f157103m = 0;

        /* renamed from: n */
        public String f157104n = "";

        /* renamed from: o */
        public String f157105o = "";

        /* renamed from: p */
        public String f157106p = "";

        /* renamed from: q */
        public String f157107q = "";

        /* renamed from: r */
        public String f157108r = "";

        /* renamed from: s */
        public String f157109s = "";

        /* renamed from: t */
        public long f157110t = 0;

        /* renamed from: u */
        public long f157111u = 0;

        /* renamed from: v */
        public String f157112v = "";

        /* renamed from: w */
        public String f157113w = "";

        /* renamed from: x */
        public boolean f157114x = false;

        /* renamed from: y */
        public String f157115y = "";

        /* renamed from: z */
        public String f157116z = "";

        /* renamed from: a */
        public LiveConfig mo76374a() {
            LiveConfig liveConfig = new LiveConfig();
            liveConfig.f157063d = this.f157091a;
            liveConfig.f157065f = this.f157092b;
            liveConfig.f157064e = this.f157093c;
            liveConfig.f157066g = this.f157094d;
            liveConfig.f157068i = this.f157095e;
            liveConfig.f157069j = this.f157096f;
            liveConfig.f157070n = this.f157097g;
            liveConfig.f157071o = this.f157098h;
            liveConfig.f157072p = this.f157099i;
            liveConfig.f157073q = this.f157100j;
            liveConfig.f157075s = this.f157101k;
            liveConfig.f157076t = this.f157102l;
            liveConfig.f157077u = this.f157103m;
            liveConfig.f157078v = this.f157104n;
            liveConfig.f157079w = this.f157105o;
            liveConfig.f157080x = this.f157106p;
            liveConfig.f157081y = this.f157107q;
            liveConfig.f157044B = this.f157110t;
            liveConfig.f157045C = this.f157111u;
            liveConfig.f157082z = this.f157108r;
            liveConfig.f157043A = this.f157109s;
            liveConfig.f157046D = this.f157112v;
            liveConfig.f157047E = this.f157113w;
            liveConfig.f157048F = this.f157114x;
            liveConfig.f157049G = "";
            liveConfig.f157050H = 0;
            liveConfig.f157051I = 0;
            liveConfig.f157052J = "";
            liveConfig.f157074r = this.f157115y;
            liveConfig.f157053K = this.f157116z;
            liveConfig.f157054L = this.f157083A;
            liveConfig.f157055M = this.f157084B;
            liveConfig.f157056N = this.f157085C;
            liveConfig.f157057P = this.f157086D;
            liveConfig.f157058Q = this.f157087E;
            liveConfig.f157059R = this.f157088F;
            liveConfig.f157060S = this.f157089G;
            liveConfig.f157061T = this.f157090H;
            return liveConfig;
        }
    }

    public LiveConfig() {
    }

    /* renamed from: a */
    public static LiveConfig m62801a(String str, int i) {
        C55204b bVar = new C55204b();
        bVar.f157091a = 0;
        bVar.f157092b = str;
        bVar.f157096f = C75592q0.m90789s();
        bVar.f157097g = i;
        return bVar.mo76374a();
    }

    /* renamed from: b */
    public String mo76369b() {
        Object[] objArr = new Object[23];
        objArr[0] = Integer.valueOf(this.f157063d);
        objArr[1] = this.f157065f;
        objArr[2] = Long.valueOf(this.f157064e);
        objArr[3] = this.f157066g;
        objArr[4] = this.f157069j;
        objArr[5] = Integer.valueOf(this.f157070n);
        objArr[6] = Integer.valueOf(this.f157071o);
        objArr[7] = Long.valueOf(this.f157075s);
        objArr[8] = this.f157081y;
        objArr[9] = this.f157082z;
        objArr[10] = Long.valueOf(this.f157044B);
        objArr[11] = Long.valueOf(this.f157045C);
        objArr[12] = this.f157076t;
        objArr[13] = this.f157053K;
        String str = this.f157046D;
        if (Util.isNullOrNil(str)) {
            str = "";
        } else if (str.length() > 0 && 8 < str.length()) {
            str = str.substring(0, 8);
        }
        objArr[14] = str;
        objArr[15] = Integer.valueOf(this.f157077u);
        objArr[16] = this.f157078v;
        objArr[17] = this.f157079w;
        objArr[18] = Integer.valueOf(this.f157056N);
        objArr[19] = Integer.valueOf(this.f157057P);
        objArr[20] = Integer.valueOf(this.f157058Q);
        objArr[21] = Integer.valueOf(this.f157059R);
        objArr[22] = Integer.valueOf(this.f157060S);
        return String.format("toWhere:%s,hostRoomId:%s,liveId:%s,liveName:%s,anchorUsername:%s,scene:%s,fromScene:%s, finderObjectId:%s, linkAnchorUsername:%s, linkAnchorNickname:%s,linkFinderObjectId:%s, linkFinderLiveId:%s, desc:%s, nicknameOption:%s sessionBuffer:%s,bindType:%s,bizUsername:%s,bizNickname:%s, vrLiveType:%s, eventid:%s, partid:%s, eventStatus:%s, streamStatus:%s", objArr);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f157063d);
        parcel.writeSerializable(this.f157067h);
        parcel.writeString(this.f157065f);
        parcel.writeLong(this.f157064e);
        parcel.writeString(this.f157066g);
        parcel.writeString(this.f157068i);
        parcel.writeString(this.f157069j);
        parcel.writeInt(this.f157070n);
        parcel.writeInt(this.f157071o);
        parcel.writeString(this.f157072p);
        parcel.writeInt(this.f157073q);
        parcel.writeLong(this.f157075s);
        parcel.writeString(this.f157080x);
        parcel.writeString(this.f157081y);
        parcel.writeString(this.f157082z);
        parcel.writeString(this.f157043A);
        parcel.writeLong(this.f157044B);
        parcel.writeLong(this.f157045C);
        parcel.writeString(this.f157076t);
        parcel.writeString(this.f157046D);
        parcel.writeString(this.f157047E);
        parcel.writeByte(this.f157048F ? (byte) 1 : 0);
        parcel.writeString(this.f157049G);
        parcel.writeInt(this.f157050H);
        parcel.writeInt(this.f157051I);
        parcel.writeString(this.f157052J);
        parcel.writeString(this.f157074r);
        parcel.writeString(Util.nullAs(this.f157053K, ""));
        parcel.writeLong(this.f157054L);
        parcel.writeByteArray(this.f157055M);
        parcel.writeInt(this.f157077u);
        parcel.writeString(Util.nullAs(this.f157078v, ""));
        parcel.writeString(Util.nullAs(this.f157079w, ""));
        parcel.writeInt(this.f157056N);
        parcel.writeInt(this.f157057P);
        parcel.writeInt(this.f157058Q);
        parcel.writeInt(this.f157059R);
        parcel.writeInt(this.f157060S);
        parcel.writeString(this.f157061T);
        C64634po2 po22 = this.f157062U;
        if (po22 != null) {
            try {
                byte[] byteArray = po22.toByteArray();
                parcel.writeInt(byteArray.length);
                parcel.writeByteArray(byteArray);
            } catch (Throwable th) {
                Log.printErrStackTrace("LiveConfig", th, "writeToParcel", new Object[0]);
            }
        } else {
            parcel.writeInt(0);
        }
    }

    public LiveConfig(Parcel parcel) {
        this.f157063d = parcel.readInt();
        this.f157067h = (HashMap) parcel.readSerializable();
        this.f157065f = parcel.readString();
        this.f157064e = parcel.readLong();
        this.f157066g = parcel.readString();
        this.f157068i = parcel.readString();
        this.f157069j = parcel.readString();
        this.f157070n = parcel.readInt();
        this.f157071o = parcel.readInt();
        this.f157072p = parcel.readString();
        this.f157073q = parcel.readInt();
        this.f157075s = parcel.readLong();
        this.f157080x = parcel.readString();
        this.f157081y = parcel.readString();
        this.f157082z = parcel.readString();
        this.f157043A = parcel.readString();
        this.f157044B = parcel.readLong();
        this.f157045C = parcel.readLong();
        this.f157076t = parcel.readString();
        this.f157046D = parcel.readString();
        this.f157047E = parcel.readString();
        this.f157048F = parcel.readByte() != 1 ? false : true;
        this.f157049G = parcel.readString();
        this.f157050H = parcel.readInt();
        this.f157051I = parcel.readInt();
        this.f157052J = parcel.readString();
        this.f157074r = parcel.readString();
        this.f157053K = parcel.readString();
        this.f157054L = parcel.readLong();
        this.f157055M = parcel.createByteArray();
        this.f157077u = parcel.readInt();
        this.f157078v = parcel.readString();
        this.f157079w = parcel.readString();
        this.f157056N = parcel.readInt();
        try {
            this.f157057P = parcel.readInt();
            this.f157058Q = parcel.readInt();
            this.f157059R = parcel.readInt();
            this.f157060S = parcel.readInt();
            this.f157061T = parcel.readString();
        } catch (Throwable th) {
            Log.printErrStackTrace("LiveConfig", th, "read error", new Object[0]);
            this.f157057P = 0;
        }
        int readInt = parcel.readInt();
        if (readInt <= 0) {
            this.f157062U = null;
            return;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        try {
            C47465a parseFrom = new C64634po2().parseFrom(bArr);
            if (parseFrom instanceof C64634po2) {
                this.f157062U = (C64634po2) parseFrom;
            }
        } catch (Throwable th4) {
            Log.printErrStackTrace("LiveConfig", th4, "constructor", new Object[0]);
        }
    }
}
