package com.tencent.p014mm.plugin.appbrand.report.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.KV14609ReportEvent;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.regex.Pattern;
import kj2.C117407d;
import zp0.C91828f;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.kv_14609 */
public final class kv_14609 implements Parcelable {
    public static final Parcelable.Creator<kv_14609> CREATOR = new C84150b();

    /* renamed from: A */
    public String f245654A;

    /* renamed from: B */
    public int f245655B;

    /* renamed from: C */
    public int f245656C;

    /* renamed from: D */
    public int f245657D;

    /* renamed from: E */
    public long f245658E;

    /* renamed from: F */
    public boolean f245659F;

    /* renamed from: G */
    public int f245660G;

    /* renamed from: H */
    public int f245661H;

    /* renamed from: I */
    public int f245662I;

    /* renamed from: J */
    public long f245663J;

    /* renamed from: K */
    public int f245664K;

    /* renamed from: d */
    public CdnLogic.WebPageProfile f245665d;

    /* renamed from: e */
    public QualitySession f245666e;

    /* renamed from: f */
    public final String f245667f;

    /* renamed from: g */
    public final String f245668g;

    /* renamed from: h */
    public int f245669h = 1;

    /* renamed from: i */
    public String f245670i;

    /* renamed from: j */
    public final int f245671j;

    /* renamed from: n */
    public final int f245672n;

    /* renamed from: o */
    public long f245673o;

    /* renamed from: p */
    public final boolean f245674p;

    /* renamed from: q */
    public boolean f245675q;

    /* renamed from: r */
    public boolean f245676r;

    /* renamed from: s */
    public int f245677s;

    /* renamed from: t */
    public int f245678t;

    /* renamed from: u */
    public int f245679u;

    /* renamed from: v */
    public long f245680v;

    /* renamed from: w */
    public long f245681w;

    /* renamed from: x */
    public long f245682x;

    /* renamed from: y */
    public long f245683y;

    /* renamed from: z */
    public int f245684z;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.kv_14609$a */
    public class C84149a extends C84152d {
        public C84149a() {
            super((C84149a) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.kv_14609$b */
    public class C84150b implements Parcelable.Creator<kv_14609> {
        public Object createFromParcel(Parcel parcel) {
            return new kv_14609(parcel);
        }

        public Object[] newArray(int i) {
            return new kv_14609[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.kv_14609$c */
    public interface C84151c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.kv_14609$d */
    public static abstract class C84152d implements C84151c {

        /* renamed from: a */
        public boolean f245686a = false;

        /* renamed from: b */
        public boolean f245687b = false;

        public C84152d(C84149a aVar) {
        }

        /* renamed from: a */
        public final void mo116833a() {
            if (!this.f245687b && !this.f245686a) {
                C84149a aVar = (C84149a) this;
                Log.m105925i("MicroMsg.AppBrand.Report.kv_14609", "report %s", kv_14609.this.toString());
                C117407d dVar = C117407d.INSTANCE;
                kv_14609 kv_14609 = kv_14609.this;
                kv_14609 kv_146092 = kv_14609.this;
                kv_14609 kv_146093 = kv_14609.this;
                dVar.mo160131h(14609, kv_14609.f245668g, Integer.valueOf(kv_14609.f245669h), C84116i0.m103659b(MMApplicationContext.getContext()), Integer.valueOf(kv_14609.this.f245671j), Integer.valueOf(kv_14609.this.f245672n), Long.valueOf(kv_14609.this.f245673o), Integer.valueOf(kv_14609.this.f245674p ? 1 : 0), Integer.valueOf(kv_14609.this.f245675q ? 1 : 0), Integer.valueOf(kv_14609.this.f245676r ? 1 : 0), Integer.valueOf(kv_14609.this.f245677s), Integer.valueOf(kv_14609.this.f245678t), Integer.valueOf(kv_14609.this.f245679u), kv_146092.f245670i, Long.valueOf(kv_146092.f245680v), Long.valueOf(kv_14609.this.f245681w), kv_146093.f245654A, Long.valueOf(kv_146093.f245682x), Long.valueOf(kv_14609.this.f245683y), Integer.valueOf(kv_14609.this.f245684z), Integer.valueOf(kv_14609.this.f245655B), Integer.valueOf(kv_14609.this.f245656C), Integer.valueOf(kv_14609.this.f245657D), Long.valueOf(kv_14609.this.f245658E), Integer.valueOf(kv_14609.this.f245659F ? 1 : 0), Integer.valueOf(kv_14609.this.f245660G), Integer.valueOf(kv_14609.this.f245661H), Integer.valueOf(kv_14609.this.f245662I), Long.valueOf(kv_14609.this.f245663J), Integer.valueOf(kv_14609.this.f245664K));
                this.f245686a = true;
            }
        }
    }

    public kv_14609(String str, int i, int i2) {
        Log.m105925i("MicroMsg.AppBrand.Report.kv_14609", "<init> appid:%s,oldVersion:%s,targetVersion:%s", str, Integer.valueOf(i), Integer.valueOf(i2));
        this.f245667f = str;
        if ("@LibraryAppId".equals(str)) {
            this.f245668g = "publiclib";
            this.f245670i = null;
            this.f245674p = C86709a0.m107522a();
        } else {
            if (str.contains("$")) {
                String[] split = str.split(Pattern.quote("$"));
                String str2 = split[0];
                this.f245668g = str2;
                int length = split.length;
                if (length == 2) {
                    String str3 = split[1];
                    if (!Util.isNullOrNil(str3)) {
                        if (str3.equals(ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE)) {
                            this.f245684z = 12;
                            this.f245670i = null;
                        } else if (str3.equals(ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE)) {
                            this.f245684z = 22;
                            this.f245670i = null;
                        } else if (str3.equals(ModulePkgInfo.PLUGIN_CODE)) {
                            this.f245684z = 6;
                            this.f245670i = null;
                        } else {
                            this.f245670i = str3;
                            this.f245684z = 4;
                        }
                    }
                } else if (length == 3) {
                    this.f245670i = split[1];
                    if (!Util.isNullOrNil(split[2])) {
                        if (split[2].equals(ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE)) {
                            this.f245684z = 13;
                        } else if (split[2].equals(ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE)) {
                            this.f245684z = 23;
                        }
                    }
                }
                Log.m105925i("MicroMsg.AppBrand.Report.kv_14609", "getModuleName modulename:%s,appid:%s,pkgtype:%s", this.f245670i, str2, Integer.valueOf(this.f245684z));
            } else {
                this.f245668g = str;
                this.f245670i = null;
            }
            this.f245674p = C86709a0.m107522a();
        }
        this.f245671j = i;
        this.f245672n = i2;
    }

    /* renamed from: a */
    public long mo116818a() {
        return this.f245683y;
    }

    /* renamed from: b */
    public void mo116819b() {
        long nowMilliSecond = Util.nowMilliSecond();
        this.f245681w = nowMilliSecond;
        this.f245673o = nowMilliSecond - this.f245680v;
        MMApplicationContext.isMainProcess();
        this.f245663J = (long) C84116i0.m103658a(C91828f.m115345a());
    }

    /* renamed from: c */
    public void mo116820c() {
        C84149a aVar = new C84149a();
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            KV14609ReportEvent kV14609ReportEvent = new KV14609ReportEvent();
            KV14609ReportEvent.C80727a aVar2 = kV14609ReportEvent.f236226d;
            aVar2.f236227a = this;
            aVar2.f236228b = aVar;
            kV14609ReportEvent.publish();
            aVar.mo116833a();
            return;
        }
        aVar.mo116833a();
    }

    /* renamed from: d */
    public void mo116821d(int i) {
        this.f245679u = i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo116823e(int i) {
        this.f245677s = i;
    }

    /* renamed from: f */
    public void mo116824f(long j) {
        this.f245682x = j;
    }

    /* renamed from: g */
    public void mo116825g(int i) {
        this.f245678t = i;
    }

    /* renamed from: h */
    public void mo116826h(boolean z) {
        this.f245675q = z;
    }

    /* renamed from: i */
    public void mo116827i(boolean z) {
        this.f245676r = z;
    }

    /* renamed from: j */
    public void mo116828j(long j) {
        this.f245683y = j;
    }

    public String toString() {
        return "kv_14609{appId='" + this.f245668g + '\'' + ", appstate=" + this.f245669h + 10 + ", moduleName='" + this.f245670i + '\'' + ", oldVersion=" + this.f245671j + ", targetVersion=" + this.f245672n + ", spendTime=" + this.f245673o + ", canUsePatchUpdate=" + this.f245674p + ", isUpdateComplete=" + this.f245675q + ", isUpdateCompleteWithPatch=" + this.f245676r + ", fullPkgSize=" + this.f245677s + ", patchSize=" + this.f245678t + ", errcode=" + this.f245679u + ", processStartMs=" + this.f245680v + ", processEndMs=" + this.f245681w + ", gzipReadyTimeMs=" + this.f245682x + ", zstdReadyTimeMs=" + this.f245683y + ", pkgType=" + this.f245684z + ", instanceId='" + this.f245654A + '\'' + ", appType=" + this.f245655B + ", scene=" + this.f245656C + ", protocol=" + this.f245657D + ", downloadFileSize=" + this.f245658E + ", isNewDNSUsed=" + this.f245659F + ", RequestSource_sync_type=" + this.f245660G + ", RequestSource_is_pre_hot=" + this.f245661H + ", RequestSource_launch_flag=" + this.f245662I + ", weakNetType=" + this.f245663J + ", downloadComponentType=" + this.f245664K + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f245667f);
        parcel.writeString(this.f245668g);
        parcel.writeString(this.f245670i);
        parcel.writeInt(this.f245671j);
        parcel.writeInt(this.f245672n);
        parcel.writeLong(this.f245673o);
        parcel.writeByte(this.f245674p ? (byte) 1 : 0);
        parcel.writeByte(this.f245675q ? (byte) 1 : 0);
        parcel.writeByte(this.f245676r ? (byte) 1 : 0);
        parcel.writeInt(this.f245677s);
        parcel.writeInt(this.f245678t);
        parcel.writeInt(this.f245679u);
        parcel.writeLong(this.f245680v);
        parcel.writeLong(this.f245681w);
        parcel.writeString(this.f245654A);
        parcel.writeLong(this.f245682x);
        parcel.writeLong(this.f245683y);
        parcel.writeInt(this.f245684z);
        parcel.writeInt(this.f245655B);
        parcel.writeInt(this.f245656C);
        parcel.writeInt(this.f245657D);
        parcel.writeLong(this.f245658E);
        parcel.writeByte(this.f245659F ? (byte) 1 : 0);
        parcel.writeInt(this.f245660G);
        parcel.writeInt(this.f245661H);
        parcel.writeInt(this.f245662I);
        parcel.writeLong(this.f245663J);
        parcel.writeInt(this.f245664K);
    }

    public kv_14609(Parcel parcel) {
        boolean z = true;
        this.f245667f = parcel.readString();
        this.f245668g = parcel.readString();
        this.f245670i = parcel.readString();
        this.f245671j = parcel.readInt();
        this.f245672n = parcel.readInt();
        this.f245673o = parcel.readLong();
        this.f245674p = parcel.readByte() != 0;
        this.f245675q = parcel.readByte() != 0;
        this.f245676r = parcel.readByte() != 0;
        this.f245677s = parcel.readInt();
        this.f245678t = parcel.readInt();
        this.f245679u = parcel.readInt();
        this.f245680v = parcel.readLong();
        this.f245681w = parcel.readLong();
        this.f245654A = parcel.readString();
        this.f245682x = parcel.readLong();
        this.f245683y = parcel.readLong();
        this.f245684z = parcel.readInt();
        this.f245655B = parcel.readInt();
        this.f245656C = parcel.readInt();
        this.f245657D = parcel.readInt();
        this.f245658E = parcel.readLong();
        this.f245659F = parcel.readByte() == 0 ? false : z;
        this.f245660G = parcel.readInt();
        this.f245661H = parcel.readInt();
        this.f245662I = parcel.readInt();
        this.f245663J = parcel.readLong();
        this.f245664K = parcel.readInt();
    }
}
