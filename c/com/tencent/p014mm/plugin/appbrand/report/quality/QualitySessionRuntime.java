package com.tencent.p014mm.plugin.appbrand.report.quality;

import android.os.Parcel;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime */
public class QualitySessionRuntime extends QualitySession {

    /* renamed from: A */
    public AtomicInteger f245840A = new AtomicInteger(0);

    /* renamed from: B */
    public final C84237z f245841B = new C84237z();

    /* renamed from: C */
    public C84217q f245842C;

    /* renamed from: D */
    public C84217q f245843D;

    /* renamed from: E */
    public volatile int f245844E;

    /* renamed from: F */
    public long f245845F;

    /* renamed from: G */
    public long f245846G;

    /* renamed from: H */
    public long f245847H;

    /* renamed from: I */
    public volatile WeAppQualityCloseBeforeReadyStruct f245848I;

    /* renamed from: J */
    public volatile boolean f245849J;

    /* renamed from: K */
    public volatile boolean f245850K;

    /* renamed from: L */
    public volatile boolean f245851L;

    /* renamed from: M */
    public volatile boolean f245852M;

    /* renamed from: N */
    public Boolean f245853N;

    /* renamed from: o */
    public AppBrandRuntimeWC f245854o;

    /* renamed from: p */
    public long f245855p;

    /* renamed from: q */
    public long f245856q;

    /* renamed from: r */
    public long f245857r;

    /* renamed from: s */
    public long f245858s;

    /* renamed from: t */
    public long f245859t;

    /* renamed from: u */
    public long f245860u;

    /* renamed from: v */
    public volatile AppStartupPerformanceReportBundle f245861v;

    /* renamed from: w */
    public int f245862w;

    /* renamed from: x */
    public final b$$c f245863x = new b$$c();

    /* renamed from: y */
    public final C84197h f245864y = new C84197h();

    /* renamed from: z */
    public boolean f245865z;

    public QualitySessionRuntime(Parcel parcel) {
        super(parcel);
        C84217q qVar = C84217q.CreateOnRuntimeInit;
        this.f245842C = qVar;
        this.f245843D = qVar;
        this.f245844E = 4;
        this.f245845F = 0;
        this.f245849J = false;
        this.f245850K = false;
        this.f245851L = false;
        this.f245852M = false;
        this.f245848I = new WeAppQualityCloseBeforeReadyStruct();
        this.f245848I.f236787q = 2;
        this.f245848I.f236784n = 2;
        this.f245848I.f236788r = 2;
    }

    /* renamed from: a */
    public final long mo116871a() {
        int i;
        C84217q qVar = C84217q.PreloadBeforeRuntimeInit;
        int i2 = 2;
        int i3 = this.f245854o.mo121251g1() ? 2 : 1;
        C84217q qVar2 = this.f245842C;
        C84217q qVar3 = C84217q.PreloadOnProcessCreated;
        int i4 = qVar2 == qVar3 ? 1 : qVar2 == qVar ? 2 : 0;
        if (this.f245865z) {
            i = (i3 * 100) + (i4 * 10) + 0;
        } else {
            C84217q qVar4 = this.f245843D;
            if (qVar4 == qVar3) {
                i2 = 1;
            } else if (qVar4 != qVar) {
                i2 = 0;
            }
            i = (i3 * 100) + (i4 * 10) + i2;
        }
        return (long) i;
    }

    /* renamed from: b */
    public long mo116872b() {
        int ordinal = this.f245854o.f238113K.mo122980c().ordinal();
        if (ordinal != 1) {
            return (ordinal == 2 || ordinal == 3) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: c */
    public synchronized boolean mo116873c() {
        Boolean bool = this.f245853N;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
