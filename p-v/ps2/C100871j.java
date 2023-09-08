package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import jq2.C33629d;
import ps2.C100869i;
import ps2.C100880k;

/* renamed from: ps2.j */
public class C100871j {

    /* renamed from: ps2.j$a */
    public class C100872a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100880k.C100881a f295408d;

        /* renamed from: e */
        public final /* synthetic */ String f295409e;

        public C100872a(C100880k.C100881a aVar, String str) {
            this.f295408d = aVar;
            this.f295409e = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$1");
            C100880k.C100881a aVar = this.f295408d;
            if (aVar != null) {
                aVar.mo76115c(this.f295409e);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$1");
        }
    }

    /* renamed from: ps2.j$b */
    public class C100873b implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ C100880k.C100881a f295410a;

        /* renamed from: b */
        public final /* synthetic */ String f295411b;

        /* renamed from: c */
        public final /* synthetic */ int f295412c;

        /* renamed from: ps2.j$b$a */
        public class C100874a implements Runnable {
            public C100874a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$1");
                C100880k.C100881a aVar = C100873b.this.f295410a;
                if (aVar != null) {
                    aVar.mo76114b();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$1");
            }
        }

        /* renamed from: ps2.j$b$b */
        public class C100875b implements Runnable {
            public C100875b() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$2");
                C100880k.C100881a aVar = C100873b.this.f295410a;
                if (aVar != null) {
                    aVar.mo76113a();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$2");
            }
        }

        /* renamed from: ps2.j$b$c */
        public class C100876c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f295415d;

            public C100876c(String str) {
                this.f295415d = str;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$3");
                C100880k.C100881a aVar = C100873b.this.f295410a;
                if (aVar != null) {
                    aVar.mo76115c(this.f295415d);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$3");
            }
        }

        public C100873b(C100880k.C100881a aVar, String str, int i) {
            this.f295410a = aVar;
            this.f295411b = str;
            this.f295412c = i;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
            Log.m105921e("MicroMsg.AdLandingPageDownloadFileHelper", " download error for small file %s", this.f295411b);
            MMHandlerThread.postToMainThread(new C100875b());
            if (this.f295412c == 41) {
                C33629d.m40145b(1, 0, 0, this.f295411b);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
            MMHandlerThread.postToMainThread(new C100874a());
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
            Log.m105925i("MicroMsg.AdLandingPageDownloadFileHelper", " download success for small file %s", this.f295411b);
            MMHandlerThread.postToMainThread(new C100876c(str));
            if (this.f295412c == 41) {
                C33629d.m40145b(0, 0, 0, this.f295411b);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2");
        }
    }

    /* renamed from: ps2.j$c */
    public class C100877c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100880k.C100881a f295417d;

        public C100877c(C100880k.C100881a aVar) {
            this.f295417d = aVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$3");
            C100880k.C100881a aVar = this.f295417d;
            if (aVar != null) {
                aVar.mo76113a();
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$3");
        }
    }

    /* renamed from: ps2.j$d */
    public class C100878d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100880k.C100881a f295418d;

        /* renamed from: e */
        public final /* synthetic */ String f295419e;

        public C100878d(C100880k.C100881a aVar, String str) {
            this.f295418d = aVar;
            this.f295419e = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$4");
            this.f295418d.mo76115c(this.f295419e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$4");
        }
    }

    /* renamed from: ps2.j$e */
    public class C100879e implements C100869i.C100870a {

        /* renamed from: a */
        public final /* synthetic */ C100880k.C100881a f295420a;

        /* renamed from: b */
        public final /* synthetic */ String f295421b;

        /* renamed from: c */
        public final /* synthetic */ int f295422c;

        /* renamed from: d */
        public final /* synthetic */ String f295423d;

        public C100879e(C100880k.C100881a aVar, String str, int i, String str2) {
            this.f295420a = aVar;
            this.f295421b = str;
            this.f295422c = i;
            this.f295423d = str2;
        }

        /* renamed from: a */
        public void mo140347a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
            Log.m105925i("MicroMsg.AdLandingPageDownloadFileHelper", " download error for cdn file %s", this.f295421b);
            this.f295420a.mo76113a();
            if (this.f295422c == 0) {
                C33629d.m40145b(1, 1, 1, this.f295421b);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$5");
        }
    }

    /* renamed from: a */
    public static void m132170a(String str, String str2, String str3, int i, C100880k.C100881a aVar) {
        SnsMethodCalculate.markStartTimeMs("tryDownloadCDNFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
        String str4 = str2 + str3;
        if (!Util.isNullOrNil(str4)) {
            if (C86013q1.m106450k(str4)) {
                Log.m105925i("MicroMsg.AdLandingPageDownloadFileHelper", "cdn file %s is already exists", str4);
                MMHandlerThread.postToMainThread(new C100878d(aVar, str4));
                SnsMethodCalculate.markEndTimeMs("tryDownloadCDNFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
                return;
            }
            new C100869i(str, str2, str3, i, new C100879e(aVar, str, i, str4)).execute(new Void[0]);
        }
        SnsMethodCalculate.markEndTimeMs("tryDownloadCDNFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
    }

    /* renamed from: b */
    public static void m132171b(String str, String str2, boolean z, int i, int i2, C100880k.C100881a aVar) {
        String str3 = str2;
        C100880k.C100881a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("tryDownloadSmallFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
        if (Util.isNullOrNil(str2)) {
            MMHandlerThread.postToMainThread(new C100877c(aVar2));
        } else if (C86013q1.m106450k(str2)) {
            Log.m105925i("MicroMsg.AdLandingPageDownloadFileHelper", "small file %s is already exists", str3);
            MMHandlerThread.postToMainThread(new C100872a(aVar2, str2));
            SnsMethodCalculate.markEndTimeMs("tryDownloadSmallFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
            return;
        } else {
            new C100880k(str, str2, z, i, i2, new C100873b(aVar2, str, i)).execute(new Void[0]);
        }
        SnsMethodCalculate.markEndTimeMs("tryDownloadSmallFile", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper");
    }
}
