package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.media.record.C92910c;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import java.util.HashMap;
import java.util.Set;
import js0.C88024r;
import js0.C9514m;
import org.json.JSONObject;
import p225rc.C89922k;
import p492dn.C75416u;
import qq0.C89790a;
import qq0.C89816t;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice */
public final class JsApiStartRecordVoice extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 31;
    public static final String NAME = "startRecord";

    /* renamed from: j */
    public static volatile String f240664j;

    /* renamed from: g */
    public StartRecordVoice f240665g;

    /* renamed from: h */
    public C83780d1 f240666h;

    /* renamed from: i */
    public C89816t.C89818b f240667i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$a */
    public class C82064a implements C82531i.C82533b {

        /* renamed from: d */
        public final /* synthetic */ C81925i2 f240678d;

        public C82064a(C81925i2 i2Var) {
            this.f240678d = i2Var;
        }

        /* renamed from: b */
        public void mo22089b() {
            JsApiStopRecordVoice.m100784w(this.f240678d);
            JsApiStartRecordVoice.this.f240666h.mo114863i(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$b */
    public class C82065b implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C81925i2 f240680d;

        public C82065b(C81925i2 i2Var) {
            this.f240680d = i2Var;
        }

        public void onDestroy() {
            JsApiStopRecordVoice.m100784w(this.f240680d);
            JsApiStartRecordVoice.this.f240666h.mo114867r(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$c */
    public class C82066c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f240682d;

        public C82066c(boolean z) {
            this.f240682d = z;
        }

        public void run() {
            JsApiStartRecordVoice.this.mo114516x(this.f240682d);
        }
    }

    /* renamed from: w */
    public void mo1505u(C81925i2 i2Var, JSONObject jSONObject, int i) {
        boolean z;
        C91085v.m114266a(i2Var.getAppId(), new C82105z(this, i2Var, jSONObject, i));
        Activity activity = i2Var.getContext() instanceof Activity ? (Activity) i2Var.getContext() : null;
        if (activity == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            z = false;
        } else {
            z = C89922k.m112464a(activity, i2Var, "android.permission.RECORD_AUDIO", 116, "", "");
            if (z) {
                C91085v.m114268c(i2Var.getAppId());
            }
        }
        if (!z) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        C83849m0 Z = i2Var.getRuntime().mo113042Z();
        if (Z.getCurrentPage() == null || Z.getCurrentPage().getCurrentPageView() == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
        } else if (f240664j != null) {
            i2Var.mo109647a(i, mo115109j("fail:audio is recording, don't start record again"));
        } else {
            this.f240666h = Z.getCurrentPage().getCurrentPageView();
            int i2 = 60;
            int optInt = jSONObject.optInt("duration", 60);
            if (optInt <= 0) {
                Log.m105920e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, less than 0");
            } else {
                i2 = optInt;
            }
            if (i2 > 600) {
                Log.m105921e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, more than %d", 600);
                i2 = 600;
            }
            this.f240666h.mo114864j(new C82064a(i2Var));
            this.f240666h.mo114865m(new C82065b(i2Var));
            StartRecordVoice startRecordVoice = new StartRecordVoice(this, i2Var, i2, i);
            this.f240665g = startRecordVoice;
            f240664j = startRecordVoice.f240672j;
            this.f240665g.mo114395c();
            mo114516x(true);
        }
    }

    /* renamed from: x */
    public final void mo114516x(boolean z) {
        if (this.f240666h != null) {
            if (!MMHandlerThread.isMainThread()) {
                MMHandlerThread.postToMainThread(new C82066c(z));
            } else if (z) {
                this.f240667i = C89790a.C89791a.m112271a(this.f240666h.getRuntime()).mo124076f(C89790a.C89793b.VOICE);
                C84072q1.m103586a(this.f240666h.getAppId()).f245459c = this.f240667i;
            } else {
                C89816t.C89818b bVar = this.f240667i;
                if (bVar != null) {
                    bVar.dismiss();
                    this.f240667i = null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice */
    public static class StartRecordVoice extends MainProcessTask {
        public static final Parcelable.Creator<StartRecordVoice> CREATOR = new C82061b();

        /* renamed from: f */
        public JsApiStartRecordVoice f240668f;

        /* renamed from: g */
        public C81925i2 f240669g;

        /* renamed from: h */
        public int f240670h;

        /* renamed from: i */
        public String f240671i;

        /* renamed from: j */
        public String f240672j;

        /* renamed from: n */
        public boolean f240673n = false;

        /* renamed from: o */
        public int f240674o;

        /* renamed from: p */
        public int f240675p;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice$b */
        public class C82061b implements Parcelable.Creator<StartRecordVoice> {
            public Object createFromParcel(Parcel parcel) {
                return new StartRecordVoice(parcel);
            }

            public Object[] newArray(int i) {
                return new StartRecordVoice[i];
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice$a */
        public class C82062a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice$a$a */
            public class C82063a implements C92910c.C83623a {
                public C82063a() {
                }

                /* renamed from: a */
                public void mo114520a(int i) {
                    StartRecordVoice startRecordVoice = StartRecordVoice.this;
                    startRecordVoice.f240675p = i;
                    startRecordVoice.mo114394b();
                }
            }

            public C82062a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:38:0x00dd  */
            /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice r0 = com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.StartRecordVoice.this
                    java.lang.String r1 = r0.f240672j
                    com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice$a$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice$a$a
                    r2.<init>()
                    int r3 = r0.f240674o
                    int r3 = r3 * 1000
                    java.lang.String r4 = "MicroMsg.Record.AudioRecorder"
                    java.lang.String r5 = "startRecord"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                    r5 = 1
                    com.tencent.p014mm.plugin.appbrand.media.record.C92910c.m117223a(r5)
                    boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    r7 = 0
                    if (r6 == 0) goto L_0x0028
                    java.lang.String r1 = "startRecord, path is null or nil"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                    goto L_0x00d4
                L_0x0028:
                    java.lang.Class<dn.o> r6 = p492dn.C97497o.class
                    di3.d r6 = di3.C86312j.m106911c(r6)
                    dn.o r6 = (p492dn.C97497o) r6
                    dj.c r8 = p331dj.C75411c.SILK
                    qh.a r6 = r6.mo126430Xc(r8)
                    com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a = r6
                    qh.e r6 = (p375qh.C101182e) r6
                    dj.c r8 = r6.f296176q
                    dj.c r9 = p331dj.C75411c.AMR
                    if (r8 != r9) goto L_0x0049
                    android.media.MediaRecorder r6 = r6.f296174o
                    if (r6 != 0) goto L_0x0045
                    goto L_0x0055
                L_0x0045:
                    r6.reset()
                    goto L_0x0055
                L_0x0049:
                    qh.e$f r8 = r6.f296177r
                    qh.e$f r10 = p375qh.C101182e.C101192f.f296194g
                    if (r8 == r10) goto L_0x0055
                    r6.mo140629d()
                    r6.mo140627b()
                L_0x0055:
                    qh.a r6 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a
                    qh.e r6 = (p375qh.C101182e) r6
                    dj.c r8 = r6.f296176q
                    if (r8 != r9) goto L_0x0065
                    android.media.MediaRecorder r6 = r6.f296174o
                    if (r6 != 0) goto L_0x0062
                    goto L_0x0065
                L_0x0062:
                    r6.setAudioSource(r5)
                L_0x0065:
                    qh.a r6 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a
                    r8 = 3
                    qh.e r6 = (p375qh.C101182e) r6
                    dj.c r10 = r6.f296176q
                    if (r10 != r9) goto L_0x0076
                    android.media.MediaRecorder r6 = r6.f296174o
                    if (r6 != 0) goto L_0x0073
                    goto L_0x0076
                L_0x0073:
                    r6.setOutputFormat(r8)
                L_0x0076:
                    qh.a r6 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a
                    qh.e r6 = (p375qh.C101182e) r6
                    dj.c r8 = r6.f296176q
                    if (r8 != r9) goto L_0x0085
                    android.media.MediaRecorder r6 = r6.f296174o
                    if (r6 == 0) goto L_0x0085
                    r6.setAudioEncoder(r5)
                L_0x0085:
                    qh.a r6 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a
                    qh.e r6 = (p375qh.C101182e) r6
                    r6.mo140631f(r1)
                    qh.a r6 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a
                    com.tencent.mm.plugin.appbrand.media.record.b r8 = new com.tencent.mm.plugin.appbrand.media.record.b
                    r8.<init>()
                    qh.e r6 = (p375qh.C101182e) r6
                    r6.mo140630e(r8)
                    qh.a r6 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a     // Catch:{ Exception -> 0x00c5 }
                    qh.e r6 = (p375qh.C101182e) r6     // Catch:{ Exception -> 0x00c5 }
                    r6.mo140628c()     // Catch:{ Exception -> 0x00c5 }
                    qh.a r4 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267599a
                    qh.e r4 = (p375qh.C101182e) r4
                    r4.mo140632g()
                    com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267601c = r2
                    com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267600b = r1
                    long r1 = (long) r3
                    com.tencent.mm.sdk.platformtools.MTimerHandler r3 = com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267602d
                    if (r3 == 0) goto L_0x00b2
                    r3.stopTimer()
                L_0x00b2:
                    r3 = 0
                    com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267602d = r3
                    com.tencent.mm.sdk.platformtools.MTimerHandler r3 = new com.tencent.mm.sdk.platformtools.MTimerHandler
                    com.tencent.mm.plugin.appbrand.media.record.a r4 = new com.tencent.mm.plugin.appbrand.media.record.a
                    r4.<init>()
                    r3.<init>(r4, r7)
                    com.tencent.p014mm.plugin.appbrand.media.record.C92910c.f267602d = r3
                    r3.startTimer(r1)
                    goto L_0x00d5
                L_0x00c5:
                    r1 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r5]
                    java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                    r2[r7] = r1
                    java.lang.String r1 = "record prepare, exp = %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r2)
                L_0x00d4:
                    r5 = 0
                L_0x00d5:
                    r0.f240673n = r5
                    com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice r0 = com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.StartRecordVoice.this
                    boolean r1 = r0.f240673n
                    if (r1 != 0) goto L_0x00e0
                    r0.mo114394b()
                L_0x00e0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.StartRecordVoice.C82062a.run():void");
            }
        }

        public StartRecordVoice(JsApiStartRecordVoice jsApiStartRecordVoice, C81925i2 i2Var, int i, int i2) {
            this.f240668f = jsApiStartRecordVoice;
            this.f240669g = i2Var;
            this.f240674o = i;
            this.f240670h = i2;
            this.f240671i = i2Var.getAppId();
            String SQ = ((C75416u) C86312j.m106911c(C75416u.class)).mo91608SQ(this.f240671i, "silk_");
            C9514m mVar = new C9514m();
            if (i2Var.getFileSystem().getTempDirectory(mVar) == C81410b0.OK) {
                this.f240672j = new C86009m1((String) mVar.f29691a, SQ).mo119971i();
            } else {
                this.f240672j = new C86009m1(i2Var.getContext().getCacheDir(), SQ).mo119971i();
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240670h = parcel.readInt();
            this.f240671i = parcel.readString();
            this.f240672j = parcel.readString();
            this.f240673n = parcel.readByte() != 0;
            this.f240674o = parcel.readInt();
            this.f240675p = parcel.readInt();
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f240675p == -1) {
                Log.m105920e("MicroMsg.JsApiStartRecordVoice", "fail:record_error");
                this.f240669g.mo109647a(this.f240670h, this.f240668f.mo115109j("fail:record_error"));
                return;
            }
            if (this.f240673n) {
                HashMap hashMap = new HashMap(1);
                C9514m mVar = new C9514m();
                if (this.f240669g.getFileSystem().createTempFileFrom(new C86009m1(this.f240672j), "silk", true, mVar) == C81410b0.OK) {
                    hashMap.put("tempFilePath", (String) mVar.f29691a);
                    this.f240669g.mo109647a(this.f240670h, this.f240668f.mo115112m("ok", hashMap));
                } else {
                    Log.m105920e("MicroMsg.JsApiStartRecordVoice", "AppBrandLocalMediaObject obj is null");
                    hashMap.put("tempFilePath", "");
                    this.f240669g.mo109647a(this.f240670h, this.f240668f.mo115109j("fail"));
                }
            } else {
                this.f240669g.mo109647a(this.f240670h, this.f240668f.mo115109j("fail"));
            }
            Log.m105925i("MicroMsg.JsApiStartRecordVoice", "runInClientProcess, appId = %s, startRecordOk = %b", this.f240671i, Boolean.valueOf(this.f240673n));
            this.f240668f.mo114516x(false);
        }

        /* renamed from: j */
        public void mo1553j() {
            Set<Object> set = C84737f0.f247137a;
            C88024r.m109571a().postToWorker(new C82062a());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f240670h);
            parcel.writeString(this.f240671i);
            parcel.writeString(this.f240672j);
            parcel.writeByte(this.f240673n ? (byte) 1 : 0);
            parcel.writeInt(this.f240674o);
            parcel.writeInt(this.f240675p);
        }

        public StartRecordVoice(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
