package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.utils.C29679p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/WxaPkgV8SnapshotInfo;", "Landroid/os/Parcelable;", "c", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo */
public final class WxaPkgV8SnapshotInfo implements Parcelable {
    public static final Parcelable.Creator<WxaPkgV8SnapshotInfo> CREATOR = new C84829d();

    /* renamed from: v */
    public static final C84828c f247265v = new C84828c((C8480h) null);

    /* renamed from: w */
    public static final C13601g<String> f247266w = C36568h.m40985a(C84826a.f247283d);

    /* renamed from: x */
    public static final C13601g<String> f247267x = C36568h.m40985a(C84827b.f247284d);

    /* renamed from: d */
    public final int f247268d;

    /* renamed from: e */
    public final String f247269e;

    /* renamed from: f */
    public final String f247270f;

    /* renamed from: g */
    public final int f247271g;

    /* renamed from: h */
    public final C84872v0 f247272h;

    /* renamed from: i */
    public final String f247273i;

    /* renamed from: j */
    public final long f247274j;

    /* renamed from: n */
    public final long f247275n;

    /* renamed from: o */
    public final String f247276o;

    /* renamed from: p */
    public final JSONObject f247277p;

    /* renamed from: q */
    public final boolean f247278q;

    /* renamed from: r */
    public final String f247279r;

    /* renamed from: s */
    public final int f247280s;

    /* renamed from: t */
    public final int f247281t;

    /* renamed from: u */
    public final int f247282u;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$a */
    public static final class C84826a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C84826a f247283d = new C84826a();

        public C84826a() {
            super(0);
        }

        public Object invoke() {
            return ((JSONObject) ((C36570n) C84880y.f247398b.f247399a.f247400a).getValue()).toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$b */
    public static final class C84827b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C84827b f247284d = new C84827b();

        public C84827b() {
            super(0);
        }

        public Object invoke() {
            return ((JSONObject) ((C36570n) C84880y.f247398b.f247399a.f247401b).getValue()).toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$c */
    public static final class C84828c {
        public C84828c(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
            if (r1.mo117626a(r4) != null) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo mo117562a(com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84875w0 r22) {
            /*
                r21 = this;
                r0 = r22
                java.lang.String r1 = "dao"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.String r1 = r0.field_wxaPkgMd5
                r2 = 1
                if (r1 == 0) goto L_0x003a
                java.lang.String r1 = r0.field_wxaPkgPath
                if (r1 == 0) goto L_0x0019
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r1 = 0
                goto L_0x001a
            L_0x0019:
                r1 = 1
            L_0x001a:
                if (r1 != 0) goto L_0x003a
                java.lang.String r1 = r0.field_snapshotCategory
                if (r1 == 0) goto L_0x0029
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r1 = 0
                goto L_0x002a
            L_0x0029:
                r1 = 1
            L_0x002a:
                if (r1 != 0) goto L_0x003a
                com.tencent.mm.plugin.appbrand.v8_snapshot.v0$a r1 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0.f247376f
                java.lang.String r4 = r0.field_snapshotCategory
                gy3.C87412m.m108591d(r4)
                com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r1 = r1.mo117626a(r4)
                if (r1 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 != 0) goto L_0x003f
                r0 = 0
                return r0
            L_0x003f:
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r19 = new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo
                int r2 = r0.field_arch
                java.lang.String r4 = r0.field_wxaPkgMd5
                gy3.C87412m.m108591d(r4)
                java.lang.String r5 = r0.field_wxaPkgPath
                gy3.C87412m.m108591d(r5)
                int r6 = r0.field_wxaPkgVersion
                com.tencent.mm.plugin.appbrand.v8_snapshot.v0$a r1 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0.f247376f
                java.lang.String r7 = r0.field_snapshotCategory
                gy3.C87412m.m108591d(r7)
                com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r7 = r1.mo117626a(r7)
                gy3.C87412m.m108591d(r7)
                java.lang.String r1 = r0.field_snapshotPath
                if (r1 != 0) goto L_0x0063
                java.lang.String r1 = ""
            L_0x0063:
                r8 = r1
                long r9 = r0.field_snapshotLastModified
                long r11 = r0.field_snapshotLength
                java.lang.String r1 = r0.field_snapshotBaseConfig
                java.lang.String r13 = "{}"
                java.lang.String r14 = com.tencent.p014mm.plugin.appbrand.utils.C29679p0.m38855a(r1, r13)
                org.json.JSONObject r15 = new org.json.JSONObject
                java.lang.String r1 = r0.field_snapshotMetaInfo
                java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.utils.C29679p0.m38855a(r1, r13)
                r15.<init>(r1)
                boolean r1 = r0.field_isNodeSnapshot
                java.lang.String r3 = r0.field_snapshotNodeConfig
                java.lang.String r17 = com.tencent.p014mm.plugin.appbrand.utils.C29679p0.m38855a(r3, r13)
                int r3 = r0.field_producingSnapshotCount
                if (r3 >= 0) goto L_0x008b
                r18 = 0
                goto L_0x008d
            L_0x008b:
                r18 = r3
            L_0x008d:
                int r3 = r0.field_consumingSnapshotCount
                if (r3 >= 0) goto L_0x0094
                r20 = 0
                goto L_0x0096
            L_0x0094:
                r20 = r3
            L_0x0096:
                int r0 = r0.field_recoverCount
                if (r0 >= 0) goto L_0x009b
                r0 = 0
            L_0x009b:
                r16 = r1
                r1 = r19
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r9
                r10 = r11
                r12 = r14
                r13 = r15
                r14 = r16
                r15 = r17
                r16 = r18
                r17 = r20
                r18 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
                return r19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.C84828c.mo117562a(com.tencent.mm.plugin.appbrand.v8_snapshot.w0):com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo");
        }

        /* renamed from: b */
        public final String mo117563b(C84872v0 v0Var) {
            C87412m.m108594g(v0Var, "snapshotCategory");
            return v0Var.f247381d + ":main";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$d */
    public static final class C84829d implements Parcelable.Creator<WxaPkgV8SnapshotInfo> {
        public Object createFromParcel(Parcel parcel) {
            JSONObject jSONObject;
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            C84872v0 a = readString3 != null ? C84872v0.f247376f.mo117626a(readString3) : null;
            String readString4 = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString5 = parcel.readString();
            try {
                jSONObject = new JSONObject(C29679p0.m38855a(parcel.readString(), "{}"));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.JSONObjectParceler", "create JSONObject failure since " + e);
                jSONObject = new JSONObject();
            }
            return new WxaPkgV8SnapshotInfo(readInt, readString, readString2, readInt2, a, readString4, readLong, readLong2, readString5, jSONObject, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new WxaPkgV8SnapshotInfo[i];
        }
    }

    public WxaPkgV8SnapshotInfo(int i, String str, String str2, int i2, C84872v0 v0Var, String str3, long j, long j2, String str4, JSONObject jSONObject, boolean z, String str5, int i3, int i4, int i5) {
        String str6 = str4;
        JSONObject jSONObject2 = jSONObject;
        String str7 = str5;
        C87412m.m108594g(str, "wxaPkgMd5");
        C87412m.m108594g(str2, "wxaPkgPath");
        C87412m.m108594g(v0Var, "snapshotCategory");
        C87412m.m108594g(str3, "snapshotPath");
        C87412m.m108594g(str6, "snapshotBaseConfig");
        C87412m.m108594g(jSONObject2, "snapshotMetaInfo");
        C87412m.m108594g(str7, "snapshotNodeConfig");
        this.f247268d = i;
        this.f247269e = str;
        this.f247270f = str2;
        this.f247271g = i2;
        this.f247272h = v0Var;
        this.f247273i = str3;
        this.f247274j = j;
        this.f247275n = j2;
        this.f247276o = str6;
        this.f247277p = jSONObject2;
        this.f247278q = z;
        this.f247279r = str7;
        this.f247280s = i3;
        this.f247281t = i4;
        this.f247282u = i5;
    }

    /* renamed from: b */
    public static WxaPkgV8SnapshotInfo m104498b(WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, int i, String str, String str2, int i2, C84872v0 v0Var, String str3, long j, long j2, String str4, JSONObject jSONObject, boolean z, String str5, int i3, int i4, int i5, int i6, Object obj) {
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = wxaPkgV8SnapshotInfo;
        int i7 = i6;
        int i8 = (i7 & 1) != 0 ? wxaPkgV8SnapshotInfo2.f247268d : i;
        String str6 = (i7 & 2) != 0 ? wxaPkgV8SnapshotInfo2.f247269e : str;
        String str7 = (i7 & 4) != 0 ? wxaPkgV8SnapshotInfo2.f247270f : str2;
        int i9 = (i7 & 8) != 0 ? wxaPkgV8SnapshotInfo2.f247271g : i2;
        C84872v0 v0Var2 = (i7 & 16) != 0 ? wxaPkgV8SnapshotInfo2.f247272h : v0Var;
        String str8 = (i7 & 32) != 0 ? wxaPkgV8SnapshotInfo2.f247273i : str3;
        long j3 = (i7 & 64) != 0 ? wxaPkgV8SnapshotInfo2.f247274j : j;
        long j4 = (i7 & 128) != 0 ? wxaPkgV8SnapshotInfo2.f247275n : j2;
        String str9 = (i7 & 256) != 0 ? wxaPkgV8SnapshotInfo2.f247276o : str4;
        JSONObject jSONObject2 = (i7 & 512) != 0 ? wxaPkgV8SnapshotInfo2.f247277p : jSONObject;
        boolean z2 = (i7 & 1024) != 0 ? wxaPkgV8SnapshotInfo2.f247278q : z;
        String str10 = (i7 & 2048) != 0 ? wxaPkgV8SnapshotInfo2.f247279r : str5;
        boolean z3 = z2;
        int i15 = (i7 & 4096) != 0 ? wxaPkgV8SnapshotInfo2.f247280s : i3;
        int i16 = (i7 & 8192) != 0 ? wxaPkgV8SnapshotInfo2.f247281t : i4;
        int i17 = (i7 & 16384) != 0 ? wxaPkgV8SnapshotInfo2.f247282u : i5;
        wxaPkgV8SnapshotInfo.getClass();
        C87412m.m108594g(str6, "wxaPkgMd5");
        C87412m.m108594g(str7, "wxaPkgPath");
        C87412m.m108594g(v0Var2, "snapshotCategory");
        C87412m.m108594g(str8, "snapshotPath");
        C87412m.m108594g(str9, "snapshotBaseConfig");
        C87412m.m108594g(jSONObject2, "snapshotMetaInfo");
        C87412m.m108594g(str10, "snapshotNodeConfig");
        return new WxaPkgV8SnapshotInfo(i8, str6, str7, i9, v0Var2, str8, j3, j4, str9, jSONObject2, z3, str10, i15, i16, i17);
    }

    /* renamed from: a */
    public final boolean mo117551a(ICommLibReader iCommLibReader, boolean z) {
        C87412m.m108594g(iCommLibReader, "commLibReader");
        if (!z && this.f247278q) {
            Log.m105925i("MicroMsg.WxaPkgV8SnapshotInfo", "canUse, enableNodeSnapshot: %b, isNodeSnapshot: %b", Boolean.valueOf(z), Boolean.valueOf(this.f247278q));
            return false;
        } else if (mo117558g()) {
            C84868u0.f247366a.mo117622s(iCommLibReader, this.f247272h, this.f247281t, this.f247282u, true, false);
            return false;
        } else if (mo117557f()) {
            C84868u0.f247366a.mo117622s(iCommLibReader, this.f247272h, this.f247281t, this.f247282u, false, false);
            return false;
        } else {
            if (this.f247273i.length() == 0) {
                Log.m105918d("MicroMsg.WxaPkgV8SnapshotInfo", "canUse, snapshotPath is empty");
                return false;
            } else if (!mo117555e()) {
                return true;
            } else {
                C84868u0.f247366a.mo117622s(iCommLibReader, this.f247272h, this.f247281t, this.f247282u, false, true);
                return false;
            }
        }
    }

    /* renamed from: c */
    public final int mo117552c() {
        C84828c cVar = f247265v;
        String b = cVar.mo117563b(this.f247272h);
        C87412m.m108594g(b, "contextName");
        int optInt = this.f247277p.optInt(b, CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX);
        if (CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX != optInt) {
            return optInt;
        }
        String b2 = cVar.mo117563b(C84872v0.NODE);
        C87412m.m108594g(b2, "contextName");
        return this.f247277p.optInt(b2, CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX);
    }

    /* renamed from: d */
    public final boolean mo117553d(ICommLibReader iCommLibReader) {
        String Yk0;
        Object obj;
        C87412m.m108594g(iCommLibReader, "commLibReader");
        if (C84872v0.NODE == this.f247272h || (Yk0 = iCommLibReader.Yk0("snapshotConfig")) == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            JSONArray optJSONArray = new JSONObject(Yk0).optJSONArray(f247265v.mo117563b(this.f247272h));
            obj = Result.m168114constructorimpl(Boolean.valueOf((optJSONArray != null ? optJSONArray.length() : 0) > 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168120isFailureimpl(obj)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo117555e() {
        C86009m1 m1Var = new C86009m1(this.f247273i);
        if (m1Var.mo119967g() && this.f247275n == m1Var.mo119980r() && this.f247274j == m1Var.mo119979q()) {
            return false;
        }
        Log.m105920e("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotBad, maybe snapshot is bad");
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WxaPkgV8SnapshotInfo)) {
            return false;
        }
        WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) obj;
        return this.f247268d == wxaPkgV8SnapshotInfo.f247268d && C87412m.m108589b(this.f247269e, wxaPkgV8SnapshotInfo.f247269e) && C87412m.m108589b(this.f247270f, wxaPkgV8SnapshotInfo.f247270f) && this.f247271g == wxaPkgV8SnapshotInfo.f247271g && this.f247272h == wxaPkgV8SnapshotInfo.f247272h && C87412m.m108589b(this.f247273i, wxaPkgV8SnapshotInfo.f247273i) && this.f247274j == wxaPkgV8SnapshotInfo.f247274j && this.f247275n == wxaPkgV8SnapshotInfo.f247275n && C87412m.m108589b(this.f247276o, wxaPkgV8SnapshotInfo.f247276o) && C87412m.m108589b(this.f247277p, wxaPkgV8SnapshotInfo.f247277p) && this.f247278q == wxaPkgV8SnapshotInfo.f247278q && C87412m.m108589b(this.f247279r, wxaPkgV8SnapshotInfo.f247279r) && this.f247280s == wxaPkgV8SnapshotInfo.f247280s && this.f247281t == wxaPkgV8SnapshotInfo.f247281t && this.f247282u == wxaPkgV8SnapshotInfo.f247282u;
    }

    /* renamed from: f */
    public final boolean mo117557f() {
        C84840f0 f0Var = C84840f0.f247297a;
        if (!f0Var.mo117570b()) {
            f0Var.getClass();
            if (C84840f0.f247317u <= this.f247281t) {
                Log.m105920e("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotConsumeException, reach use snapshot exception count threshold, consumingSnapshotCount: " + this.f247281t);
                return true;
            }
        }
        if (!f0Var.mo117570b()) {
            f0Var.getClass();
            if (C84840f0.f247318v <= this.f247282u) {
                Log.m105920e("MicroMsg.WxaPkgV8SnapshotInfo", "canUse, reach use recover count threshold, recoverCount: " + this.f247282u);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo117558g() {
        String str = this.f247276o;
        C13601g<String> gVar = f247266w;
        if (!C87412m.m108589b(str, (String) ((C36570n) gVar).getValue())) {
            Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotEnvChange, snapshotBaseConfig: " + this.f247276o + ", curSnapshotBaseConfig: " + ((String) ((C36570n) gVar).getValue()));
            return true;
        } else if (!this.f247278q) {
            return false;
        } else {
            String str2 = this.f247279r;
            C13601g<String> gVar2 = f247267x;
            if (C87412m.m108589b(str2, (String) ((C36570n) gVar2).getValue())) {
                return false;
            }
            Log.m105924i("MicroMsg.WxaPkgV8SnapshotInfo", "isSnapshotEnvChange, isNodeSnapshot, snapshotNodeConfig: " + this.f247279r + ", curSnapshotNodeFlag: " + ((String) ((C36570n) gVar2).getValue()));
            return true;
        }
    }

    public int hashCode() {
        long j = this.f247274j;
        long j2 = this.f247275n;
        int hashCode = ((((((((((((((((((this.f247268d * 31) + this.f247269e.hashCode()) * 31) + this.f247270f.hashCode()) * 31) + this.f247271g) * 31) + this.f247272h.hashCode()) * 31) + this.f247273i.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f247276o.hashCode()) * 31) + this.f247277p.hashCode()) * 31;
        boolean z = this.f247278q;
        if (z) {
            z = true;
        }
        return ((((((((hashCode + (z ? 1 : 0)) * 31) + this.f247279r.hashCode()) * 31) + this.f247280s) * 31) + this.f247281t) * 31) + this.f247282u;
    }

    public String toString() {
        return "WxaPkgV8SnapshotInfo(arch=" + this.f247268d + ", wxaPkgMd5=" + this.f247269e + ", wxaPkgPath=" + this.f247270f + ", wxaPkgVersion=" + this.f247271g + ", snapshotCategory=" + this.f247272h + ", snapshotPath=" + this.f247273i + ", snapshotLastModified=" + this.f247274j + ", snapshotLength=" + this.f247275n + ", snapshotBaseConfig=" + this.f247276o + ", snapshotMetaInfo=" + this.f247277p + ", isNodeSnapshot=" + this.f247278q + ", snapshotNodeConfig=" + this.f247279r + ", producingSnapshotCount=" + this.f247280s + ", consumingSnapshotCount=" + this.f247281t + ", recoverCount=" + this.f247282u + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f247268d);
        parcel.writeString(this.f247269e);
        parcel.writeString(this.f247270f);
        parcel.writeInt(this.f247271g);
        C84872v0 v0Var = this.f247272h;
        parcel.writeString(v0Var != null ? v0Var.f247381d : null);
        parcel.writeString(this.f247273i);
        parcel.writeLong(this.f247274j);
        parcel.writeLong(this.f247275n);
        parcel.writeString(this.f247276o);
        JSONObject jSONObject = this.f247277p;
        C87412m.m108594g(jSONObject, "<this>");
        parcel.writeString(jSONObject.toString());
        parcel.writeInt(this.f247278q ? 1 : 0);
        parcel.writeString(this.f247279r);
        parcel.writeInt(this.f247280s);
        parcel.writeInt(this.f247281t);
        parcel.writeInt(this.f247282u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WxaPkgV8SnapshotInfo(int r21, java.lang.String r22, java.lang.String r23, int r24, com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0 r25, java.lang.String r26, long r27, long r29, java.lang.String r31, org.json.JSONObject r32, boolean r33, java.lang.String r34, int r35, int r36, int r37, int r38, gy3.C8480h r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            int r1 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.f247394d
            int r1 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0.f247394d
            r3 = r1
            goto L_0x000e
        L_0x000c:
            r3 = r21
        L_0x000e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = ""
            r8 = r1
            goto L_0x0018
        L_0x0016:
            r8 = r26
        L_0x0018:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L_0x0020
            r9 = r4
            goto L_0x0022
        L_0x0020:
            r9 = r27
        L_0x0022:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0028
            r11 = r4
            goto L_0x002a
        L_0x0028:
            r11 = r29
        L_0x002a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            java.lang.String r2 = "{}"
            if (r1 == 0) goto L_0x0033
            r13 = r2
            goto L_0x0035
        L_0x0033:
            r13 = r31
        L_0x0035:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0040
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r14 = r1
            goto L_0x0042
        L_0x0040:
            r14 = r32
        L_0x0042:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r1 == 0) goto L_0x0049
            r15 = 0
            goto L_0x004b
        L_0x0049:
            r15 = r33
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r16 = r2
            goto L_0x0054
        L_0x0052:
            r16 = r34
        L_0x0054:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r17 = 0
            goto L_0x005d
        L_0x005b:
            r17 = r35
        L_0x005d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0064
            r18 = 0
            goto L_0x0066
        L_0x0064:
            r18 = r36
        L_0x0066:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x006d
            r19 = 0
            goto L_0x006f
        L_0x006d:
            r19 = r37
        L_0x006f:
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.<init>(int, java.lang.String, java.lang.String, int, com.tencent.mm.plugin.appbrand.v8_snapshot.v0, java.lang.String, long, long, java.lang.String, org.json.JSONObject, boolean, java.lang.String, int, int, int, int, gy3.h):void");
    }
}
