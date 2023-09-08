package com.tencent.p014mm.plugin.appbrand.config;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import wi0.C66117m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig;", "Landroid/os/Parcelable;", "a", "BackgroundShapeConfig", "b", "c", "CloseWhenClickEmptyAreaConfig", "CustomSubjectInfo", "e", "ShareActionConfig", "f", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig */
public final class HalfScreenConfig implements Parcelable {
    public static final Parcelable.Creator<HalfScreenConfig> CREATOR = new C55454d();

    /* renamed from: P */
    public static final HalfScreenConfig f157929P = new HalfScreenConfig(false, 0, (C55451a) null, false, (BackgroundShapeConfig) null, false, (CloseWhenClickEmptyAreaConfig) null, (C55453c) null, false, false, (WeAppHalfScreenStatusChangeListener) null, (C55456f) null, false, false, (C66117m) null, false, (ShareActionConfig) null, 0, 0, 0, false, false, false, (C55455e) null, false, (CustomSubjectInfo) null, 0, false, false, 0, false, false, false, -4, 1, (C8480h) null);

    /* renamed from: A */
    public final boolean f157930A;

    /* renamed from: B */
    public final boolean f157931B;

    /* renamed from: C */
    public final C55455e f157932C;

    /* renamed from: D */
    public final boolean f157933D;

    /* renamed from: E */
    public final CustomSubjectInfo f157934E;

    /* renamed from: F */
    public final int f157935F;

    /* renamed from: G */
    public final boolean f157936G;

    /* renamed from: H */
    public final boolean f157937H;

    /* renamed from: I */
    public final int f157938I;

    /* renamed from: J */
    public final boolean f157939J;

    /* renamed from: K */
    public final boolean f157940K;

    /* renamed from: L */
    public final boolean f157941L;

    /* renamed from: M */
    public int f157942M;

    /* renamed from: N */
    public final boolean f157943N;

    /* renamed from: d */
    public final int f157944d;

    /* renamed from: e */
    public final C55451a f157945e;

    /* renamed from: f */
    public final boolean f157946f;

    /* renamed from: g */
    public final BackgroundShapeConfig f157947g;

    /* renamed from: h */
    public final boolean f157948h;

    /* renamed from: i */
    public final CloseWhenClickEmptyAreaConfig f157949i;

    /* renamed from: j */
    public final C55453c f157950j;

    /* renamed from: n */
    public final boolean f157951n;

    /* renamed from: o */
    public final boolean f157952o;

    /* renamed from: p */
    public WeAppHalfScreenStatusChangeListener f157953p;

    /* renamed from: q */
    public final C55456f f157954q;

    /* renamed from: r */
    public final boolean f157955r;

    /* renamed from: s */
    public final boolean f157956s;

    /* renamed from: t */
    public final C66117m f157957t;

    /* renamed from: u */
    public final boolean f157958u;

    /* renamed from: v */
    public final ShareActionConfig f157959v;

    /* renamed from: w */
    public final int f157960w;

    /* renamed from: x */
    public int f157961x;

    /* renamed from: y */
    public int f157962y;

    /* renamed from: z */
    public final boolean f157963z;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$CloseWhenClickEmptyAreaConfig;", "Landroid/os/Parcelable;", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CloseWhenClickEmptyAreaConfig */
    public static final class CloseWhenClickEmptyAreaConfig implements Parcelable {
        public static final Parcelable.Creator<CloseWhenClickEmptyAreaConfig> CREATOR = new C55448a();

        /* renamed from: f */
        public static final CloseWhenClickEmptyAreaConfig f157970f = new CloseWhenClickEmptyAreaConfig("", C55451a.POPUP);

        /* renamed from: d */
        public final String f157971d;

        /* renamed from: e */
        public final C55451a f157972e;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CloseWhenClickEmptyAreaConfig$a */
        public static final class C55448a implements Parcelable.Creator<CloseWhenClickEmptyAreaConfig> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                String str = "";
                if (readString == null) {
                    readString = str;
                }
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    str = readString2;
                }
                return new CloseWhenClickEmptyAreaConfig(readString, C55451a.valueOf(str));
            }

            public Object[] newArray(int i) {
                return new CloseWhenClickEmptyAreaConfig[i];
            }
        }

        public CloseWhenClickEmptyAreaConfig(String str, C55451a aVar) {
            C87412m.m108594g(str, "activityClassName");
            C87412m.m108594g(aVar, "closeAnimStyle");
            this.f157971d = str;
            this.f157972e = aVar;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseWhenClickEmptyAreaConfig)) {
                return false;
            }
            CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = (CloseWhenClickEmptyAreaConfig) obj;
            return C87412m.m108589b(this.f157971d, closeWhenClickEmptyAreaConfig.f157971d) && this.f157972e == closeWhenClickEmptyAreaConfig.f157972e;
        }

        public int hashCode() {
            return (this.f157971d.hashCode() * 31) + this.f157972e.hashCode();
        }

        public String toString() {
            return "CloseWhenClickEmptyAreaConfig(activityClassName=" + this.f157971d + ", closeAnimStyle=" + this.f157972e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f157971d);
            parcel.writeString(this.f157972e.name());
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$CustomSubjectInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo */
    public static final class CustomSubjectInfo implements Parcelable {
        public static final C55449a CREATOR = new C55449a((C8480h) null);

        /* renamed from: f */
        public static final CustomSubjectInfo f157973f = new CustomSubjectInfo("", "");

        /* renamed from: d */
        public final String f157974d;

        /* renamed from: e */
        public final String f157975e;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo$a */
        public static final class C55449a implements Parcelable.Creator<CustomSubjectInfo> {
            public C55449a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                String readString = parcel.readString();
                C87412m.m108591d(readString);
                String readString2 = parcel.readString();
                C87412m.m108591d(readString2);
                return new CustomSubjectInfo(readString, readString2);
            }

            public Object[] newArray(int i) {
                return new CustomSubjectInfo[i];
            }
        }

        public CustomSubjectInfo(String str, String str2) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "iconUrl");
            this.f157974d = str;
            this.f157975e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomSubjectInfo)) {
                return false;
            }
            CustomSubjectInfo customSubjectInfo = (CustomSubjectInfo) obj;
            return C87412m.m108589b(this.f157974d, customSubjectInfo.f157974d) && C87412m.m108589b(this.f157975e, customSubjectInfo.f157975e);
        }

        public int hashCode() {
            return (this.f157974d.hashCode() * 31) + this.f157975e.hashCode();
        }

        public String toString() {
            return "CustomSubjectInfo(name=" + this.f157974d + ", iconUrl=" + this.f157975e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f157974d);
            parcel.writeString(this.f157975e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$ShareActionConfig;", "Landroid/os/Parcelable;", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig */
    public static final class ShareActionConfig implements Parcelable {
        public static final Parcelable.Creator<ShareActionConfig> CREATOR = new C55450a();

        /* renamed from: f */
        public static final ShareActionConfig f157976f = new ShareActionConfig(false, (String) null, 3, (C8480h) null);

        /* renamed from: d */
        public final boolean f157977d;

        /* renamed from: e */
        public final String f157978e;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig$a */
        public static final class C55450a implements Parcelable.Creator<ShareActionConfig> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                boolean z = parcel.readByte() != 0;
                String readString = parcel.readString();
                C87412m.m108591d(readString);
                return new ShareActionConfig(z, readString);
            }

            public Object[] newArray(int i) {
                return new ShareActionConfig[i];
            }
        }

        public ShareActionConfig() {
            this(false, (String) null, 3, (C8480h) null);
        }

        public ShareActionConfig(boolean z, String str) {
            C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
            this.f157977d = z;
            this.f157978e = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareActionConfig)) {
                return false;
            }
            ShareActionConfig shareActionConfig = (ShareActionConfig) obj;
            return this.f157977d == shareActionConfig.f157977d && C87412m.m108589b(this.f157978e, shareActionConfig.f157978e);
        }

        public int hashCode() {
            boolean z = this.f157977d;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f157978e.hashCode();
        }

        public String toString() {
            return "ShareActionConfig(showShare=" + this.f157977d + ", token=" + this.f157978e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeByte(this.f157977d ? (byte) 1 : 0);
            parcel.writeString(this.f157978e);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ShareActionConfig(boolean z, String str, int i, C8480h hVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a */
    public enum C55451a {
        POPUP,
        SLIDE
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$b */
    public static final class C55452b {

        /* renamed from: A */
        public int f157982A = -1;

        /* renamed from: B */
        public boolean f157983B;

        /* renamed from: C */
        public boolean f157984C;

        /* renamed from: D */
        public int f157985D = -1;

        /* renamed from: E */
        public boolean f157986E;

        /* renamed from: F */
        public boolean f157987F;

        /* renamed from: G */
        public boolean f157988G;

        /* renamed from: a */
        public boolean f157989a;

        /* renamed from: b */
        public int f157990b = -1;

        /* renamed from: c */
        public int f157991c = -1;

        /* renamed from: d */
        public int f157992d = -2;

        /* renamed from: e */
        public int f157993e = -2;

        /* renamed from: f */
        public C55451a f157994f = C55451a.POPUP;

        /* renamed from: g */
        public boolean f157995g;

        /* renamed from: h */
        public CloseWhenClickEmptyAreaConfig f157996h = CloseWhenClickEmptyAreaConfig.f157970f;

        /* renamed from: i */
        public BackgroundShapeConfig f157997i = BackgroundShapeConfig.f157964i;

        /* renamed from: j */
        public boolean f157998j;

        /* renamed from: k */
        public C55453c f157999k = C55453c.NORMAL;

        /* renamed from: l */
        public boolean f158000l;

        /* renamed from: m */
        public boolean f158001m;

        /* renamed from: n */
        public boolean f158002n;

        /* renamed from: o */
        public WeAppHalfScreenStatusChangeListener f158003o;

        /* renamed from: p */
        public C55456f f158004p = C55456f.FAKE_NATIVE;

        /* renamed from: q */
        public boolean f158005q;

        /* renamed from: r */
        public C66117m f158006r = C66117m.NORMAL;

        /* renamed from: s */
        public boolean f158007s;

        /* renamed from: t */
        public ShareActionConfig f158008t = ShareActionConfig.f157976f;

        /* renamed from: u */
        public boolean f158009u = true;

        /* renamed from: v */
        public boolean f158010v = true;

        /* renamed from: w */
        public boolean f158011w = true;

        /* renamed from: x */
        public C55455e f158012x = C55455e.NORMAL;

        /* renamed from: y */
        public boolean f158013y;

        /* renamed from: z */
        public CustomSubjectInfo f158014z = CustomSubjectInfo.f157973f;

        /* renamed from: a */
        public final HalfScreenConfig mo76967a() {
            return new HalfScreenConfig(this.f157989a, this.f157990b, this.f157994f, this.f157995g, this.f157997i, this.f157998j, this.f157996h, this.f157999k, this.f158000l, this.f158002n, this.f158003o, this.f158004p, this.f158005q, this.f158001m, this.f158006r, this.f158007s, this.f158008t, this.f157991c, this.f157992d, this.f157993e, this.f158009u, this.f158010v, this.f158011w, this.f158012x, this.f158013y, this.f158014z, this.f157982A, this.f157983B, this.f157984C, this.f157985D, this.f157986E, this.f157987F, this.f157988G);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c */
    public enum C55453c {
        NORMAL,
        SINGLE_CLOSE,
        HIDE
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$d */
    public static final class C55454d implements Parcelable.Creator<HalfScreenConfig> {
        public Object createFromParcel(Parcel parcel) {
            C66117m mVar;
            Parcel parcel2 = parcel;
            C87412m.m108594g(parcel2, "parcel");
            boolean z = parcel.readInt() > 0;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            C55451a valueOf = C55451a.valueOf(readString);
            boolean z2 = parcel.readByte() != 0;
            Parcelable readParcelable = parcel2.readParcelable(BackgroundShapeConfig.class.getClassLoader());
            C87412m.m108591d(readParcelable);
            BackgroundShapeConfig backgroundShapeConfig = (BackgroundShapeConfig) readParcelable;
            boolean z3 = parcel.readByte() != 0;
            Parcelable readParcelable2 = parcel2.readParcelable(CloseWhenClickEmptyAreaConfig.class.getClassLoader());
            C87412m.m108591d(readParcelable2);
            CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = (CloseWhenClickEmptyAreaConfig) readParcelable2;
            String readString2 = parcel.readString();
            C87412m.m108591d(readString2);
            C55453c valueOf2 = C55453c.valueOf(readString2);
            boolean z4 = parcel.readByte() != 0;
            boolean z5 = parcel.readByte() != 0;
            WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = (WeAppHalfScreenStatusChangeListener) parcel2.readParcelable(WeAppHalfScreenStatusChangeListener.class.getClassLoader());
            String readString3 = parcel.readString();
            C87412m.m108591d(readString3);
            C55456f valueOf3 = C55456f.valueOf(readString3);
            boolean z6 = parcel.readByte() != 0;
            boolean z7 = parcel.readByte() != 0;
            String readString4 = parcel.readString();
            if (TextUtils.isEmpty(readString4)) {
                mVar = C66117m.NORMAL;
            } else {
                C87412m.m108591d(readString4);
                mVar = C66117m.valueOf(readString4);
            }
            C66117m mVar2 = mVar;
            boolean z8 = parcel.readByte() != 0;
            Parcelable readParcelable3 = parcel2.readParcelable(ShareActionConfig.class.getClassLoader());
            C87412m.m108591d(readParcelable3);
            ShareActionConfig shareActionConfig = (ShareActionConfig) readParcelable3;
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            boolean z9 = parcel.readByte() != 0;
            boolean z15 = parcel.readByte() != 0;
            boolean z16 = parcel.readByte() != 0;
            String readString5 = parcel.readString();
            C87412m.m108591d(readString5);
            C55455e valueOf4 = C55455e.valueOf(readString5);
            boolean z17 = parcel.readByte() != 0;
            Parcelable readParcelable4 = parcel2.readParcelable(CustomSubjectInfo.class.getClassLoader());
            C87412m.m108591d(readParcelable4);
            HalfScreenConfig halfScreenConfig = new HalfScreenConfig(z, readInt, valueOf, z2, backgroundShapeConfig, z3, closeWhenClickEmptyAreaConfig, valueOf2, z4, z5, weAppHalfScreenStatusChangeListener, valueOf3, z6, z7, mVar2, z8, shareActionConfig, readInt2, readInt3, readInt4, z9, z15, z16, valueOf4, z17, (CustomSubjectInfo) readParcelable4, parcel.readInt(), parcel.readByte() != 0, parcel.readByte() != 0, parcel.readInt(), parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0);
            halfScreenConfig.mo76934e(parcel.readInt());
            return halfScreenConfig;
        }

        public Object[] newArray(int i) {
            return new HalfScreenConfig[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e */
    public enum C55455e {
        NORMAL,
        EMBED
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f */
    public enum C55456f {
        NORMAL,
        FAKE_NATIVE
    }

    public HalfScreenConfig(boolean z, int i, C55451a aVar, boolean z2, BackgroundShapeConfig backgroundShapeConfig, boolean z3, CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig, C55453c cVar, boolean z4, boolean z5, WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener, C55456f fVar, boolean z6, boolean z7, C66117m mVar, boolean z8, ShareActionConfig shareActionConfig, int i2, int i3, int i4, boolean z9, boolean z15, boolean z16, C55455e eVar, boolean z17, CustomSubjectInfo customSubjectInfo, int i5, boolean z18, boolean z19, int i6, boolean z25, boolean z26, boolean z27) {
        BackgroundShapeConfig backgroundShapeConfig2 = backgroundShapeConfig;
        CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig2 = closeWhenClickEmptyAreaConfig;
        C55453c cVar2 = cVar;
        C55456f fVar2 = fVar;
        C66117m mVar2 = mVar;
        ShareActionConfig shareActionConfig2 = shareActionConfig;
        C55455e eVar2 = eVar;
        boolean z28 = z17;
        CustomSubjectInfo customSubjectInfo2 = customSubjectInfo;
        C87412m.m108594g(aVar, "activityAnimStyle");
        C87412m.m108594g(backgroundShapeConfig2, "bgShapeConf");
        C87412m.m108594g(closeWhenClickEmptyAreaConfig2, "closeWhenClickEmptyAreaConfig");
        C87412m.m108594g(cVar2, "capsuleType");
        C87412m.m108594g(fVar2, "splashLoadingType");
        C87412m.m108594g(mVar2, "loadingDarkModeStyle");
        C87412m.m108594g(shareActionConfig2, "shareActionConfig");
        C87412m.m108594g(eVar2, "mode");
        C87412m.m108594g(customSubjectInfo2, "customSubjectInfo");
        this.f157944d = i;
        this.f157945e = aVar;
        this.f157946f = z2;
        this.f157947g = backgroundShapeConfig2;
        this.f157948h = z3;
        this.f157949i = closeWhenClickEmptyAreaConfig2;
        this.f157950j = cVar2;
        this.f157951n = z4;
        this.f157952o = z5;
        this.f157953p = weAppHalfScreenStatusChangeListener;
        this.f157954q = fVar2;
        this.f157955r = z6;
        this.f157956s = z7;
        this.f157957t = mVar2;
        this.f157958u = z8;
        this.f157959v = shareActionConfig2;
        this.f157960w = i2;
        int i7 = i3;
        this.f157961x = i7;
        int i8 = i4;
        this.f157962y = i8;
        this.f157963z = z9;
        this.f157930A = z15;
        this.f157931B = z16;
        this.f157932C = eVar2;
        this.f157933D = z28;
        this.f157934E = customSubjectInfo2;
        this.f157935F = i5;
        this.f157936G = z18;
        this.f157937H = z19;
        this.f157938I = i6;
        this.f157939J = z25;
        this.f157940K = z26;
        this.f157941L = z27;
        this.f157943N = z;
        this.f157962y = z28 ? -1 : i8;
        this.f157961x = z28 ? -1 : i7;
    }

    /* renamed from: a */
    public final C55451a mo76929a(Context context) {
        C87412m.m108594g(context, "context");
        return context.getResources().getConfiguration().orientation == 2 ? C55451a.SLIDE : this.f157945e;
    }

    /* renamed from: b */
    public final C66117m mo76930b() {
        C66117m mVar = this.f157957t;
        return (mVar != C66117m.NORMAL || !this.f157948h) ? mVar : C66117m.FORCE_LIGHT;
    }

    /* renamed from: c */
    public final boolean mo76931c() {
        return this.f157943N && this.f157944d != 0;
    }

    /* renamed from: d */
    public final boolean mo76932d() {
        return mo76931c() && this.f157932C == C55455e.NORMAL && this.f157936G;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo76934e(int i) {
        this.f157942M = i;
        Log.m105924i("MicroMsg.HalfScreenConfig", "set appServiceType[" + i + ']');
    }

    /* renamed from: f */
    public final C55452b mo76935f() {
        C55452b bVar = new C55452b();
        bVar.f157989a = mo76931c();
        bVar.f157990b = this.f157944d;
        bVar.f157991c = this.f157960w;
        bVar.f157992d = this.f157961x;
        bVar.f157993e = this.f157962y;
        C55451a aVar = this.f157945e;
        C87412m.m108594g(aVar, "activityAnimStyle");
        bVar.f157994f = aVar;
        bVar.f157995g = this.f157946f;
        CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = this.f157949i;
        C87412m.m108594g(closeWhenClickEmptyAreaConfig, "closeWhenClickEmptyAreaConfig");
        bVar.f157996h = closeWhenClickEmptyAreaConfig;
        BackgroundShapeConfig backgroundShapeConfig = this.f157947g;
        C87412m.m108594g(backgroundShapeConfig, "bgShapeConf");
        bVar.f157997i = backgroundShapeConfig;
        bVar.f157998j = this.f157948h;
        CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig2 = this.f157949i;
        C87412m.m108594g(closeWhenClickEmptyAreaConfig2, "closeWhenClickEmptyAreaConfig");
        bVar.f157996h = closeWhenClickEmptyAreaConfig2;
        C55453c cVar = this.f157950j;
        C87412m.m108594g(cVar, "capsuleType");
        bVar.f157999k = cVar;
        bVar.f158000l = this.f157951n;
        bVar.f158002n = this.f157952o;
        bVar.f158003o = this.f157953p;
        C55456f fVar = this.f157954q;
        C87412m.m108594g(fVar, "splashLoadingType");
        bVar.f158004p = fVar;
        bVar.f158005q = this.f157955r;
        bVar.f158001m = this.f157956s;
        C66117m mVar = this.f157957t;
        C87412m.m108594g(mVar, "loadingDarkModeStyle");
        bVar.f158006r = mVar;
        bVar.f158007s = this.f157958u;
        ShareActionConfig shareActionConfig = this.f157959v;
        C87412m.m108594g(shareActionConfig, "shareActionConfig");
        bVar.f158008t = shareActionConfig;
        bVar.f158009u = this.f157963z;
        bVar.f158010v = this.f157930A;
        bVar.f158011w = this.f157931B;
        C55455e eVar = this.f157932C;
        C87412m.m108594g(eVar, "mode");
        bVar.f158012x = eVar;
        bVar.f158013y = this.f157933D;
        CustomSubjectInfo customSubjectInfo = this.f157934E;
        C87412m.m108594g(customSubjectInfo, "customSubjectInfo");
        bVar.f158014z = customSubjectInfo;
        bVar.f157982A = this.f157935F;
        bVar.f157983B = this.f157936G;
        bVar.f157984C = this.f157937H;
        bVar.f157985D = this.f157938I;
        bVar.f157986E = this.f157939J;
        bVar.f157987F = this.f157940K;
        bVar.f157988G = this.f157941L;
        return bVar;
    }

    public String toString() {
        return "HalfScreenConfig(height=" + this.f157944d + ", activityAnimStyle=" + this.f157945e + ", closeWhenClickEmptyArea=" + this.f157946f + ", bgShapeConf=" + this.f157947g + ", forceLightMode=" + this.f157948h + ", closeWhenClickEmptyAreaConfig=" + this.f157949i + ", capsuleType=" + this.f157950j + ", supportGesture=" + this.f157951n + ", showHalfScreenCommonHeader=" + this.f157952o + ", halfScreenStatusChangeListener=" + this.f157953p + ", splashLoadingType=" + this.f157954q + ", showHalfScreenCustomHeader=" + this.f157955r + ", forbidSlidingUpGesture=" + this.f157956s + ", loadingDarkModeStyle=" + this.f157957t + ", showBgMask=" + this.f157958u + ", shareActionConfig=" + this.f157959v + ", autoFullScreenWhenTap=" + this.f157963z + ", consumeNavigationBarHeight=" + this.f157931B + ", appServiceType=" + this.f157942M + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(mo76931c() ? 1 : 0);
        parcel.writeInt(this.f157944d);
        parcel.writeString(this.f157945e.name());
        parcel.writeByte(this.f157946f ? (byte) 1 : 0);
        parcel.writeParcelable(this.f157947g, i);
        parcel.writeByte(this.f157948h ? (byte) 1 : 0);
        parcel.writeParcelable(this.f157949i, i);
        parcel.writeString(this.f157950j.name());
        parcel.writeByte(this.f157951n ? (byte) 1 : 0);
        parcel.writeByte(this.f157952o ? (byte) 1 : 0);
        parcel.writeParcelable(this.f157953p, i);
        parcel.writeString(this.f157954q.name());
        parcel.writeByte(this.f157955r ? (byte) 1 : 0);
        parcel.writeByte(this.f157956s ? (byte) 1 : 0);
        parcel.writeString(this.f157957t.name());
        parcel.writeByte(this.f157958u ? (byte) 1 : 0);
        parcel.writeParcelable(this.f157959v, i);
        parcel.writeInt(this.f157960w);
        parcel.writeInt(this.f157961x);
        parcel.writeInt(this.f157962y);
        parcel.writeByte(this.f157963z ? (byte) 1 : 0);
        parcel.writeByte(this.f157930A ? (byte) 1 : 0);
        parcel.writeByte(this.f157931B ? (byte) 1 : 0);
        parcel.writeString(this.f157932C.name());
        parcel.writeByte(this.f157933D ? (byte) 1 : 0);
        parcel.writeParcelable(this.f157934E, i);
        parcel.writeInt(this.f157935F);
        parcel.writeByte(this.f157936G ? (byte) 1 : 0);
        parcel.writeByte(this.f157937H ? (byte) 1 : 0);
        parcel.writeInt(this.f157938I);
        parcel.writeByte(this.f157939J ? (byte) 1 : 0);
        parcel.writeByte(this.f157940K ? (byte) 1 : 0);
        parcel.writeByte(this.f157941L ? (byte) 1 : 0);
        parcel.writeInt(this.f157942M);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/config/HalfScreenConfig$BackgroundShapeConfig;", "Landroid/os/Parcelable;", "data-model_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$BackgroundShapeConfig */
    public static final class BackgroundShapeConfig implements Parcelable {
        public static final Parcelable.Creator<BackgroundShapeConfig> CREATOR = new C55447a();

        /* renamed from: i */
        public static final BackgroundShapeConfig f157964i = new BackgroundShapeConfig(0.0f, false, false, false, false, 31, (C8480h) null);

        /* renamed from: d */
        public final float f157965d;

        /* renamed from: e */
        public final boolean f157966e;

        /* renamed from: f */
        public final boolean f157967f;

        /* renamed from: g */
        public final boolean f157968g;

        /* renamed from: h */
        public final boolean f157969h;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$BackgroundShapeConfig$a */
        public static final class C55447a implements Parcelable.Creator<BackgroundShapeConfig> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new BackgroundShapeConfig(parcel.readFloat(), parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0);
            }

            public Object[] newArray(int i) {
                return new BackgroundShapeConfig[i];
            }
        }

        public BackgroundShapeConfig() {
            this(0.0f, false, false, false, false, 31, (C8480h) null);
        }

        public BackgroundShapeConfig(float f, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f157965d = f;
            this.f157966e = z;
            this.f157967f = z2;
            this.f157968g = z3;
            this.f157969h = z4;
        }

        /* renamed from: a */
        public final float[] mo76938a(int i) {
            float[] fArr;
            float f = 0.0f;
            if (i == 2) {
                fArr = new float[8];
                boolean z = this.f157967f;
                fArr[0] = z ? this.f157965d : 0.0f;
                fArr[1] = z ? this.f157965d : 0.0f;
                boolean z2 = this.f157969h;
                fArr[2] = z2 ? this.f157965d : 0.0f;
                fArr[3] = z2 ? this.f157965d : 0.0f;
                boolean z3 = this.f157968g;
                fArr[4] = z3 ? this.f157965d : 0.0f;
                fArr[5] = z3 ? this.f157965d : 0.0f;
                boolean z4 = this.f157966e;
                fArr[6] = z4 ? this.f157965d : 0.0f;
                if (z4) {
                    f = this.f157965d;
                }
                fArr[7] = f;
            } else {
                fArr = new float[8];
                boolean z5 = this.f157966e;
                fArr[0] = z5 ? this.f157965d : 0.0f;
                fArr[1] = z5 ? this.f157965d : 0.0f;
                boolean z6 = this.f157967f;
                fArr[2] = z6 ? this.f157965d : 0.0f;
                fArr[3] = z6 ? this.f157965d : 0.0f;
                boolean z7 = this.f157969h;
                fArr[4] = z7 ? this.f157965d : 0.0f;
                fArr[5] = z7 ? this.f157965d : 0.0f;
                boolean z8 = this.f157968g;
                fArr[6] = z8 ? this.f157965d : 0.0f;
                if (z8) {
                    f = this.f157965d;
                }
                fArr[7] = f;
            }
            return fArr;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BackgroundShapeConfig)) {
                return false;
            }
            BackgroundShapeConfig backgroundShapeConfig = (BackgroundShapeConfig) obj;
            return C87412m.m108589b(Float.valueOf(this.f157965d), Float.valueOf(backgroundShapeConfig.f157965d)) && this.f157966e == backgroundShapeConfig.f157966e && this.f157967f == backgroundShapeConfig.f157967f && this.f157968g == backgroundShapeConfig.f157968g && this.f157969h == backgroundShapeConfig.f157969h;
        }

        public int hashCode() {
            int floatToIntBits = Float.floatToIntBits(this.f157965d) * 31;
            boolean z = this.f157966e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (floatToIntBits + (z ? 1 : 0)) * 31;
            boolean z3 = this.f157967f;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f157968g;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f157969h;
            if (!z5) {
                z2 = z5;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "BackgroundShapeConfig(cornerRadius=" + this.f157965d + ", topLeft=" + this.f157966e + ", topRight=" + this.f157967f + ", bottomLeft=" + this.f157968g + ", bottomRight=" + this.f157969h + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeFloat(this.f157965d);
            parcel.writeByte(this.f157966e ? (byte) 1 : 0);
            parcel.writeByte(this.f157967f ? (byte) 1 : 0);
            parcel.writeByte(this.f157968g ? (byte) 1 : 0);
            parcel.writeByte(this.f157969h ? (byte) 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ BackgroundShapeConfig(float r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, gy3.C8480h r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0005
                r4 = 0
            L_0x0005:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L_0x000c
                r10 = 0
                goto L_0x000d
            L_0x000c:
                r10 = r5
            L_0x000d:
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                r1 = 0
                goto L_0x0014
            L_0x0013:
                r1 = r6
            L_0x0014:
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                r2 = 0
                goto L_0x001b
            L_0x001a:
                r2 = r7
            L_0x001b:
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0020
                goto L_0x0021
            L_0x0020:
                r0 = r8
            L_0x0021:
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r1
                r9 = r2
                r10 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig.<init>(float, boolean, boolean, boolean, boolean, int, gy3.h):void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HalfScreenConfig(boolean r35, int r36, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a r37, boolean r38, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig r39, boolean r40, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig r41, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c r42, boolean r43, boolean r44, com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener r45, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f r46, boolean r47, boolean r48, wi0.C66117m r49, boolean r50, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig r51, int r52, int r53, int r54, boolean r55, boolean r56, boolean r57, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e r58, boolean r59, com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo r60, int r61, boolean r62, boolean r63, int r64, boolean r65, boolean r66, boolean r67, int r68, int r69, gy3.C8480h r70) {
        /*
            r34 = this;
            r0 = r68
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0008
            r1 = -1
            goto L_0x000a
        L_0x0008:
            r1 = r36
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0011
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r3 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
            goto L_0x0013
        L_0x0011:
            r3 = r37
        L_0x0013:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x001a
            r4 = 0
            goto L_0x001c
        L_0x001a:
            r4 = r38
        L_0x001c:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0023
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$BackgroundShapeConfig r6 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.BackgroundShapeConfig.f157964i
            goto L_0x0025
        L_0x0023:
            r6 = r39
        L_0x0025:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002b
            r7 = 0
            goto L_0x002d
        L_0x002b:
            r7 = r40
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CloseWhenClickEmptyAreaConfig r8 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig.f157970f
            goto L_0x0036
        L_0x0034:
            r8 = r41
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r9 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.NORMAL
            goto L_0x003f
        L_0x003d:
            r9 = r42
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = 0
            goto L_0x0047
        L_0x0045:
            r10 = r43
        L_0x0047:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004d
            r11 = 0
            goto L_0x004f
        L_0x004d:
            r11 = r44
        L_0x004f:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0055
            r12 = 0
            goto L_0x0057
        L_0x0055:
            r12 = r45
        L_0x0057:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x005e
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f r13 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f.FAKE_NATIVE
            goto L_0x0060
        L_0x005e:
            r13 = r46
        L_0x0060:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0066
            r14 = 0
            goto L_0x0068
        L_0x0066:
            r14 = r47
        L_0x0068:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x006e
            r15 = 0
            goto L_0x0070
        L_0x006e:
            r15 = r48
        L_0x0070:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0077
            wi0.m r2 = wi0.C66117m.NORMAL
            goto L_0x0079
        L_0x0077:
            r2 = r49
        L_0x0079:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0083
            r16 = 0
            goto L_0x0085
        L_0x0083:
            r16 = r50
        L_0x0085:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008e
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig r17 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f157976f
            goto L_0x0090
        L_0x008e:
            r17 = r51
        L_0x0090:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0099
            r18 = -1
            goto L_0x009b
        L_0x0099:
            r18 = r52
        L_0x009b:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            r20 = -2
            if (r19 == 0) goto L_0x00a6
            r19 = -2
            goto L_0x00a8
        L_0x00a6:
            r19 = r53
        L_0x00a8:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r20 = r54
        L_0x00b1:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            r22 = 1
            if (r21 == 0) goto L_0x00bc
            r21 = 1
            goto L_0x00be
        L_0x00bc:
            r21 = r55
        L_0x00be:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00c7
            r23 = 1
            goto L_0x00c9
        L_0x00c7:
            r23 = r56
        L_0x00c9:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00d2
            r24 = 1
            goto L_0x00d4
        L_0x00d2:
            r24 = r57
        L_0x00d4:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00dd
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r25 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.NORMAL
            goto L_0x00df
        L_0x00dd:
            r25 = r58
        L_0x00df:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00e8
            r26 = 0
            goto L_0x00ea
        L_0x00e8:
            r26 = r59
        L_0x00ea:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00f3
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r27 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo.f157973f
            goto L_0x00f5
        L_0x00f3:
            r27 = r60
        L_0x00f5:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00fe
            r28 = -1
            goto L_0x0100
        L_0x00fe:
            r28 = r61
        L_0x0100:
            r29 = 134217728(0x8000000, float:3.85186E-34)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0109
            r29 = 0
            goto L_0x010b
        L_0x0109:
            r29 = r62
        L_0x010b:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0114
            r30 = 0
            goto L_0x0116
        L_0x0114:
            r30 = r63
        L_0x0116:
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x011f
            r31 = -1
            goto L_0x0121
        L_0x011f:
            r31 = r64
        L_0x0121:
            r32 = 1073741824(0x40000000, float:2.0)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x012a
            r32 = 1
            goto L_0x012c
        L_0x012a:
            r32 = r65
        L_0x012c:
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r33
            if (r0 == 0) goto L_0x0134
            r0 = 0
            goto L_0x0136
        L_0x0134:
            r0 = r66
        L_0x0136:
            r22 = r69 & 1
            if (r22 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r5 = r67
        L_0x013d:
            r36 = r34
            r37 = r35
            r38 = r1
            r39 = r3
            r40 = r4
            r41 = r6
            r42 = r7
            r43 = r8
            r44 = r9
            r45 = r10
            r46 = r11
            r47 = r12
            r48 = r13
            r49 = r14
            r50 = r15
            r51 = r2
            r52 = r16
            r53 = r17
            r54 = r18
            r55 = r19
            r56 = r20
            r57 = r21
            r58 = r23
            r59 = r24
            r60 = r25
            r61 = r26
            r62 = r27
            r63 = r28
            r64 = r29
            r65 = r30
            r66 = r31
            r67 = r32
            r68 = r0
            r69 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.<init>(boolean, int, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a, boolean, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$BackgroundShapeConfig, boolean, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CloseWhenClickEmptyAreaConfig, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c, boolean, boolean, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f, boolean, boolean, wi0.m, boolean, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig, int, int, int, boolean, boolean, boolean, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e, boolean, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo, int, boolean, boolean, int, boolean, boolean, boolean, int, int, gy3.h):void");
    }
}
