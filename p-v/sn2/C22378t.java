package sn2;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qafpapi.QAFPNative;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.List;
import nn2.C21685l;
import nn2.C47288f;
import p375qh.C110390f;

/* renamed from: sn2.t */
public class C22378t extends C21685l.C21687b {

    /* renamed from: h */
    public static boolean f63450h;

    /* renamed from: i */
    public static boolean f63451i;

    /* renamed from: e */
    public Context f63452e;

    /* renamed from: f */
    public C22371b f63453f = new C22371b();

    /* renamed from: g */
    public long f63454g;

    public C22378t(Context context, C21685l.C21686a aVar) {
        super(aVar);
        this.f63452e = context;
        f63451i = false;
    }

    /* renamed from: a */
    public void mo33950a() {
        this.f61391d = null;
        this.f63453f.mo35512d();
        if (f63451i) {
            long currentTimeMillis = System.currentTimeMillis() - this.f63454g;
            Log.m105919d("Micromsg.ShakeTVService", "a%s, isRunning=%s", Long.valueOf(currentTimeMillis), Boolean.valueOf(f63451i));
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(10987, 1, "", 2, Integer.valueOf((int) currentTimeMillis));
            nVar.mo175913w(835, 1, 1);
            f63451i = false;
        }
    }

    /* renamed from: b */
    public void mo33951b() {
        if (f63450h) {
            return;
        }
        if (!this.f63453f.mo35510b()) {
            Log.m105920e("Micromsg.ShakeTVService", "init MusicFingerPrintRecorder false");
        } else {
            f63450h = true;
        }
    }

    /* renamed from: c */
    public void mo33952c() {
    }

    /* renamed from: d */
    public void mo33953d() {
    }

    /* renamed from: e */
    public void mo33954e() {
        Log.m105926v("Micromsg.ShakeTVService", "hy: start shake tv!");
        if (this.f61391d == null) {
            Log.m105928w("Micromsg.ShakeTVService", "shakeGetListener == null");
        } else if (!(this.f63452e instanceof Activity)) {
            Log.m105920e("Micromsg.ShakeTVService", "context not an Activity");
            ((ShakeReportUI) this.f61391d).mo24635O7(new ArrayList(), 0);
        } else {
            f63451i = true;
            this.f63454g = System.currentTimeMillis();
            C22371b bVar = this.f63453f;
            t$$a t__a = new t$$a(this);
            bVar.mo35512d();
            synchronized (bVar.f63430n) {
                bVar.f63436t = QAFPNative.QAFPGetVersion();
            }
            bVar.mo35510b();
            bVar.f63427h = 408;
            bVar.f63431o = t__a;
            bVar.f63434r = false;
            bVar.f63433q = false;
            bVar.f63428i = false;
            bVar.f63440x = false;
            C97625j3.m125815e().mo123455a(367, bVar);
            C97625j3.m125815e().mo123455a(408, bVar);
            int nowMilliSecond = (int) Util.nowMilliSecond();
            bVar.f63435s = nowMilliSecond;
            Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "startRecord now clientid:%d", Integer.valueOf(nowMilliSecond));
            C110390f fVar = new C110390f(8000, 1, 4);
            bVar.f63432p = fVar;
            fVar.f330234m = -19;
            fVar.f330245x = bVar.f63441y;
            if (!fVar.mo161906k()) {
                Log.m105920e("MicroMsg.MusicFingerPrintRecorder", "start record failed");
                bVar.mo35511c();
            } else {
                synchronized (bVar.f63430n) {
                    int QAFPReset = QAFPNative.QAFPReset();
                    Log.m105919d("MicroMsg.MusicFingerPrintRecorder", "QAFPReset ret:%d", Integer.valueOf(QAFPReset));
                    if (QAFPReset < 0) {
                        Log.m105921e("MicroMsg.MusicFingerPrintRecorder", "init failed QAFPReset:%d clientid:%d", Integer.valueOf(QAFPReset), Integer.valueOf(bVar.f63435s));
                        bVar.mo35511c();
                    } else {
                        bVar.f63426g = Util.nowMilliSecond();
                        bVar.f63438v = Util.nowMilliSecond();
                        bVar.f63439w = 0;
                    }
                }
            }
            C115669n.INSTANCE.mo175913w(835, 5, 1);
        }
    }

    /* renamed from: f */
    public final void mo35518f(List<C47288f> list, long j) {
        C21685l.C21686a aVar = this.f61391d;
        if (aVar != null) {
            ((ShakeReportUI) aVar).mo24635O7(list, j);
        }
    }
}
