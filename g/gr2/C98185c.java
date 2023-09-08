package gr2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;
import ps2.C100880k;
import ps2.C118127b0;
import rq2.C63489a;
import zt3.C119157j;

/* renamed from: gr2.c */
public class C98185c {
    @C118127b0(resType = 1)

    /* renamed from: a */
    public String f287853a;

    /* renamed from: b */
    public int f287854b;

    /* renamed from: c */
    public int f287855c;

    /* renamed from: d */
    public int f287856d;

    /* renamed from: e */
    public int f287857e;

    /* renamed from: f */
    public float f287858f;

    /* renamed from: g */
    public float f287859g;

    /* renamed from: h */
    public float f287860h;

    /* renamed from: i */
    public int f287861i;

    /* renamed from: j */
    public float f287862j;

    /* renamed from: k */
    public float f287863k;

    /* renamed from: l */
    public int f287864l;

    /* renamed from: m */
    public int f287865m;

    /* renamed from: n */
    public float f287866n;

    /* renamed from: o */
    public float f287867o;

    /* renamed from: p */
    public float f287868p;

    /* renamed from: q */
    public Bitmap f287869q;

    /* renamed from: r */
    public boolean f287870r = false;

    /* renamed from: gr2.c$a */
    public class C98186a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f287871d;

        public C98186a(String str) {
            this.f287871d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$1");
            C98185c cVar = C98185c.this;
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f287871d, (BitmapFactory.Options) null);
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            cVar.f287869q = decodeFile;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$1");
        }
    }

    /* renamed from: gr2.c$b */
    public class C98187b implements C100880k.C100881a {

        /* renamed from: gr2.c$b$a */
        public class C98188a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f287874d;

            public C98188a(String str) {
                this.f287874d = str;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2$1");
                C98185c cVar = C98185c.this;
                Bitmap decodeFile = BitmapUtil.decodeFile(this.f287874d, (BitmapFactory.Options) null);
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
                cVar.f287869q = decodeFile;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2$1");
            }
        }

        public C98187b() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
            C98185c cVar = C98185c.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            cVar.f287870r = false;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            Log.m105928w("ParticleAnimConfig", "onDownloadError, url=" + C98185c.this.f287853a);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
            C98185c cVar = C98185c.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            cVar.f287870r = false;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            Log.m105924i("ParticleAnimConfig", "onDownloaded, url=" + C98185c.this.f287853a);
            ((C119157j) C119157j.f356862d).mo183875f(new C98188a(str));
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
        }
    }

    /* renamed from: b */
    public static C98185c m126858b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        MMApplicationContext.getContext();
        String nullAsNil = Util.nullAsNil(map.get(str + ".imgUrl"));
        int safeParseInt = Util.safeParseInt(map.get(str + ".imgW"));
        int safeParseInt2 = Util.safeParseInt(map.get(str + ".imgH"));
        if (TextUtils.isEmpty(nullAsNil) || safeParseInt == 0 || safeParseInt2 == 0) {
            Log.m105920e("ParticleAnimConfig", "parseFromXml err, w=" + safeParseInt + ", h=" + safeParseInt2 + ", url=" + nullAsNil);
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return null;
        }
        C98185c cVar = new C98185c();
        cVar.f287853a = nullAsNil;
        cVar.f287855c = safeParseInt;
        cVar.f287854b = safeParseInt2;
        cVar.f287856d = Util.safeParseInt(map.get(str + ".animCountMax"));
        cVar.f287857e = Util.safeParseInt(map.get(str + ".animPerSecond"));
        cVar.f287858f = Util.safeParseFloat(map.get(str + ".scaleInitMin"));
        cVar.f287859g = Util.safeParseFloat(map.get(str + ".scaleInitMax"));
        cVar.f287860h = Util.safeParseFloat(map.get(str + ".scaleTarget"));
        cVar.f287861i = Util.safeParseInt(map.get(str + ".scaleDuration"));
        cVar.f287862j = Util.safeParseFloat(map.get(str + ".alphaInitMin"));
        cVar.f287863k = Util.safeParseFloat(map.get(str + ".alphaInitMax"));
        cVar.f287864l = Util.safeParseInt(map.get(str + ".fadeOutDuration"));
        cVar.f287865m = Util.safeParseInt(map.get(str + ".fadeOutDelay"));
        cVar.f287866n = Util.safeParseFloat(map.get(str + ".speedMin"));
        cVar.f287867o = Util.safeParseFloat(map.get(str + ".speedMax"));
        cVar.f287868p = Util.safeParseFloat(map.get(str + ".fillFactor"));
        Log.m105924i("ParticleAnimConfig", "parseCfg=" + cVar);
        SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return cVar;
    }

    /* renamed from: a */
    public Bitmap mo137484a() {
        SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        if (TextUtils.isEmpty(this.f287853a)) {
            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return null;
        }
        Bitmap bitmap = this.f287869q;
        if (bitmap != null) {
            SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
            return bitmap;
        }
        String d = C63489a.m74829d(this.f287853a);
        if (TextUtils.isEmpty(d) || !C86013q1.m106450k(d)) {
            Log.m105924i("ParticleAnimConfig", "no cache, try download, hash=" + hashCode() + ", isDownloading=" + this.f287870r + ", url=" + this.f287853a);
            if (!this.f287870r) {
                this.f287870r = true;
                C63489a.m74828c(this.f287853a, new C98187b());
            }
        } else {
            Log.m105924i("ParticleAnimConfig", "hit local cache, hash=" + hashCode());
            ((C119157j) C119157j.f356862d).mo183875f(new C98186a(d));
        }
        Bitmap bitmap2 = this.f287869q;
        SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return bitmap2;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        String str = "{imgUrl=" + this.f287853a + ", imgH=" + this.f287854b + ", imgW=" + this.f287855c + ", animCountMax=" + this.f287856d + ", animPerSecond=" + this.f287857e + ", scaleInitMin=" + this.f287858f + ", scaleInitMax=" + this.f287859g + ", scaleTarget=" + this.f287860h + ", scaleDuration=" + this.f287861i + ", alphaInitMin=" + this.f287862j + ", alphaInitMax=" + this.f287863k + ", fadoutDuration=" + this.f287864l + ", fadoutDelay=" + this.f287865m + ", speedMin=" + this.f287866n + ", speedMax=" + this.f287867o + ", fillFactor=" + this.f287868p + '}';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        return str;
    }
}
