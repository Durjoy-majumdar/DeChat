package jp0;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.plugin.appbrand.media.record.C83631l;
import com.tencent.p014mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.p014mm.sdk.platformtools.Log;
import p375qh.C110390f;

/* renamed from: jp0.a */
public class C88008a {

    /* renamed from: a */
    public C110390f f254618a = null;

    /* renamed from: b */
    public RecordParam f254619b;

    /* renamed from: c */
    public int f254620c = 0;

    /* renamed from: d */
    public int f254621d = 0;

    /* renamed from: e */
    public long f254622e = 0;

    /* renamed from: f */
    public C88010b f254623f;

    /* renamed from: g */
    public int f254624g = -1;

    /* renamed from: h */
    public C110390f.C89659b f254625h = new C88009a();

    /* renamed from: jp0.a$a */
    public class C88009a implements C110390f.C89659b {
        public C88009a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
            r0 = (com.tencent.p014mm.plugin.appbrand.media.record.C83631l.C83636e) r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35508a(byte[] r7, int r8) {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.Record.AppBrandRecorder"
                java.lang.String r1 = "onRecPcmDataReady()"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                jp0.a r0 = jp0.C88008a.this
                jp0.a$b r0 = r0.f254623f
                if (r0 == 0) goto L_0x006b
                com.tencent.mm.plugin.appbrand.media.record.l$e r0 = (com.tencent.p014mm.plugin.appbrand.media.record.C83631l.C83636e) r0
                java.lang.String r1 = "MicroMsg.Record.AudioRecordMgr"
                com.tencent.mm.plugin.appbrand.media.record.l r2 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.this
                ip0.c r3 = r2.f244227f
                if (r3 == 0) goto L_0x006b
                jp0.a r4 = r2.f244222a
                if (r4 == 0) goto L_0x006b
                qh.f r4 = r4.f254618a
                if (r4 == 0) goto L_0x0022
                int r4 = r4.f330229h
                goto L_0x0024
            L_0x0022:
                r4 = 20
            L_0x0024:
                int r5 = r2.f244230i
                int r5 = r5 + r4
                r2.f244230i = r5
                boolean r2 = r2.f244229h     // Catch:{ Exception -> 0x0037 }
                boolean r7 = r3.mo122234a(r2, r7, r8)     // Catch:{ Exception -> 0x0037 }
                if (r7 != 0) goto L_0x006b
                java.lang.String r7 = "encode pcm fail!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)     // Catch:{ Exception -> 0x0037 }
                goto L_0x006b
            L_0x0037:
                r7 = move-exception
                r8 = 0
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r2 = "onRecPcmDataReady"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r2, r8)
                com.tencent.mm.plugin.appbrand.media.record.l r7 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.this
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r7 = r7.f244225d
                if (r7 == 0) goto L_0x0056
                java.lang.String r7 = r7.f244265h
                java.lang.String r8 = "mp3"
                boolean r7 = r8.equalsIgnoreCase(r7)
                if (r7 == 0) goto L_0x0056
                r7 = 19
                com.tencent.p014mm.plugin.appbrand.media.record.C83646t.m102682a(r7)
                goto L_0x006b
            L_0x0056:
                com.tencent.mm.plugin.appbrand.media.record.l r7 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.this
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r7 = r7.f244225d
                if (r7 == 0) goto L_0x006b
                java.lang.String r7 = r7.f244265h
                java.lang.String r8 = "aac"
                boolean r7 = r8.equalsIgnoreCase(r7)
                if (r7 == 0) goto L_0x006b
                r7 = 23
                com.tencent.p014mm.plugin.appbrand.media.record.C83646t.m102682a(r7)
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp0.C88008a.C88009a.mo35508a(byte[], int):void");
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105921e("MicroMsg.Record.AppBrandRecorder", "state:%d, detailState:%d", Integer.valueOf(i), Integer.valueOf(i2));
            C88010b bVar = C88008a.this.f254623f;
            if (bVar != null) {
                C83631l.C83636e eVar = (C83631l.C83636e) bVar;
                eVar.getClass();
                Log.m105925i("MicroMsg.Record.AudioRecordMgr", "onRecError state:%d, detailState:%d", Integer.valueOf(i), Integer.valueOf(i2));
                C83631l.this.mo115944h(1);
            }
        }
    }

    /* renamed from: jp0.a$b */
    public interface C88010b {
    }

    public C88008a(RecordParam recordParam) {
        recordParam = recordParam == null ? new RecordParam() : recordParam;
        this.f254620c = recordParam.f244262e;
        this.f254621d = recordParam.f244263f;
        this.f254624g = recordParam.f244267j;
        this.f254619b = recordParam;
    }

    /* renamed from: a */
    public boolean mo122457a() {
        Log.m105924i("MicroMsg.Record.AppBrandRecorder", JsApiStopRecordVoice.NAME);
        C110390f fVar = this.f254618a;
        boolean l = fVar != null ? fVar.mo161907l() : false;
        long currentTimeMillis = System.currentTimeMillis();
        this.f254622e -= currentTimeMillis;
        Log.m105925i("MicroMsg.Record.AppBrandRecorder", "stop time ticket:%d, costTimeInMs:%d", Long.valueOf(currentTimeMillis), Long.valueOf(this.f254622e));
        return l;
    }
}
