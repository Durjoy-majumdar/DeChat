package pu0;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.AudioDeviceInfoKvReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import mu0.C109638a;
import ou0.C110066a;
import ou0.C110071c;
import qu0.C110472b;
import qu0.C110473c;
import qu0.C77431a;
import sx3.C110823p;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: pu0.b */
public final class C110248b extends C86301e {

    /* renamed from: h */
    public static final C110249a f329777h = new C110249a((C8480h) null);

    /* renamed from: d */
    public C109638a f329778d = new C109638a();

    /* renamed from: e */
    public C110066a f329779e = new C110071c();

    /* renamed from: f */
    public String f329780f = "music";

    /* renamed from: g */
    public String[] f329781g;

    /* renamed from: pu0.b$a */
    public static final class C110249a {
        public C110249a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo161656a() {
            boolean z = false;
            boolean z2 = mo161657b().f329358h.getRingerMode() == 2;
            boolean z3 = mo161657b().f329358h.getRingerMode() == 2 || mo161657b().f329358h.getRingerMode() == 1;
            if (Util.nullAs(Build.MANUFACTURER, "").toLowerCase().contains("xiaomi".toLowerCase())) {
                try {
                    int i = Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "vibrate_in_silent");
                    int i2 = Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "vibrate_in_normal");
                    if (!(i == 0 && i2 == 0)) {
                        z = true;
                    }
                    z3 = z;
                } catch (Exception unused) {
                }
            }
            if (!z2 || !z3) {
                return (!z2 || z3) ? (z2 || !z3) ? (z2 || z3) ? "normal" : "silent" : "vibrate" : "ring";
            }
        }

        /* renamed from: b */
        public final C110066a mo161657b() {
            C110066a aVar = mo161659d().f329779e;
            if (aVar != null) {
                return aVar;
            }
            C110071c cVar = new C110071c();
            C7335d c = C86312j.m106911c(C110248b.class);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            ((C110248b) c).f329781g[0] = "music";
            return cVar;
        }

        /* renamed from: c */
        public final int mo161658c() {
            int i;
            AudioManager audioManager = mo161657b().f329358h;
            C87412m.m108594g(audioManager, "audioManager");
            if (C110472b.f330367c == -1) {
                try {
                    i = Class.forName("android.media.AudioManager").getField("STREAM_BLUETOOTH_SCO").getInt(audioManager);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.BluetoothUtil", "ClassNotFoundException  android.media.AudioManager,exception:" + e.getMessage());
                    i = 6;
                }
                C110472b.f330367c = i;
            }
            return C110472b.f330367c;
        }

        /* renamed from: d */
        public final C110248b mo161659d() {
            C7335d c = C86312j.m106911c(C110248b.class);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            return (C110248b) c;
        }

        /* renamed from: e */
        public final boolean mo161660e(String str) {
            C87412m.m108594g(str, "type");
            return C87412m.m108589b(str, mo161659d().f329781g[0]) || C87412m.m108589b(mo161659d().f329781g[0], "");
        }

        /* renamed from: f */
        public final int mo161661f() {
            return mo161657b().mo161473O();
        }

        /* renamed from: g */
        public final String mo161662g() {
            C110066a b = mo161657b();
            int mode = b.f329358h.getMode();
            return "mode:" + mode + " isSpeakerphoneOn:" + b.mo161485s() + " isBluetoothOn:" + C110472b.f330365a.mo161951b();
        }

        /* renamed from: h */
        public final int mo161663h(boolean z) {
            C110066a b = mo161657b();
            boolean z2 = b.f329358h.isBluetoothScoOn() || b.f329354d;
            int i = z ? 3 : 0;
            if (z2) {
                return 0;
            }
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
            if (r0.equals("voipcs") == false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
            if (r0.equals("ipcall") == false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
            r2 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x007a, code lost:
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
            switch(r13.hashCode()) {
                case -1182426107: goto L_0x0098;
                case -810977776: goto L_0x0091;
                case 3625376: goto L_0x008a;
                case 1268443040: goto L_0x0083;
                default: goto L_0x0082;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
            if (r13.equals("multitalke") == false) goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
            if (r13.equals("voip") != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
            if (r13.equals("voipcs") != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
            if (r13.equals("ipcall") != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
            if (r2 <= r8) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
            mo161659d().f329781g[1] = r13;
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
            mo161659d().f329781g[0] = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
            if (r9 == false) goto L_0x00da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SubCoreAudio", "success set the audio manager is: " + r13);
            r13 = di3.C86312j.m106911c(pu0.C110248b.class);
            gy3.C87412m.m108593f(r13, "getService(SubCoreAudio::class.java)");
            ((pu0.C110248b) r13).f329779e = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00da, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SubCoreAudio", "current  " + r0 + " is running a priority higher than request: " + r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0060, code lost:
            if (r0.equals("multitalke") != false) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
            if (r0.equals("voip") == false) goto L_0x007a;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo161664i(ou0.C110066a r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "audioManager"
                gy3.C87412m.m108594g(r12, r0)
                java.lang.String r0 = "type"
                gy3.C87412m.m108594g(r13, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "init audio manager from "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = "MicroMsg.SubCoreAudio"
                com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r3, r0, r2)
                pu0.b r0 = r11.mo161659d()
                java.lang.String[] r0 = r0.f329781g
                java.lang.Object r0 = sx3.C110823p.m150976B(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r2 = ""
                boolean r2 = gy3.C87412m.m108589b(r0, r2)
                if (r2 == 0) goto L_0x0048
                pu0.b r0 = r11.mo161659d()
                java.lang.String[] r0 = r0.f329781g
                r0[r1] = r13
                pu0.b r13 = r11.mo161659d()
                r13.f329779e = r12
                goto L_0x00f6
            L_0x0048:
                int r2 = r0.hashCode()
                java.lang.String r4 = "multitalke"
                java.lang.String r5 = "voip"
                java.lang.String r6 = "voipcs"
                java.lang.String r7 = "ipcall"
                r8 = 2
                r9 = 1
                switch(r2) {
                    case -1182426107: goto L_0x0071;
                    case -810977776: goto L_0x006a;
                    case 3625376: goto L_0x0063;
                    case 1268443040: goto L_0x005c;
                    default: goto L_0x005b;
                }
            L_0x005b:
                goto L_0x007a
            L_0x005c:
                boolean r2 = r0.equals(r4)
                if (r2 == 0) goto L_0x007a
                goto L_0x0078
            L_0x0063:
                boolean r2 = r0.equals(r5)
                if (r2 != 0) goto L_0x0078
                goto L_0x007a
            L_0x006a:
                boolean r2 = r0.equals(r6)
                if (r2 != 0) goto L_0x0078
                goto L_0x007a
            L_0x0071:
                boolean r2 = r0.equals(r7)
                if (r2 != 0) goto L_0x0078
                goto L_0x007a
            L_0x0078:
                r2 = 2
                goto L_0x007b
            L_0x007a:
                r2 = 1
            L_0x007b:
                int r10 = r13.hashCode()
                switch(r10) {
                    case -1182426107: goto L_0x0098;
                    case -810977776: goto L_0x0091;
                    case 3625376: goto L_0x008a;
                    case 1268443040: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                goto L_0x009e
            L_0x0083:
                boolean r4 = r13.equals(r4)
                if (r4 == 0) goto L_0x009e
                goto L_0x009f
            L_0x008a:
                boolean r4 = r13.equals(r5)
                if (r4 != 0) goto L_0x009f
                goto L_0x009e
            L_0x0091:
                boolean r4 = r13.equals(r6)
                if (r4 != 0) goto L_0x009f
                goto L_0x009e
            L_0x0098:
                boolean r4 = r13.equals(r7)
                if (r4 != 0) goto L_0x009f
            L_0x009e:
                r8 = 1
            L_0x009f:
                if (r2 <= r8) goto L_0x00ab
                pu0.b r2 = r11.mo161659d()
                java.lang.String[] r2 = r2.f329781g
                r2[r9] = r13
                r9 = 0
                goto L_0x00b3
            L_0x00ab:
                pu0.b r2 = r11.mo161659d()
                java.lang.String[] r2 = r2.f329781g
                r2[r1] = r13
            L_0x00b3:
                if (r9 == 0) goto L_0x00da
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "success set the audio manager is: "
                r0.append(r2)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
                java.lang.Class<pu0.b> r13 = pu0.C110248b.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                java.lang.String r0 = "getService(SubCoreAudio::class.java)"
                gy3.C87412m.m108593f(r13, r0)
                pu0.b r13 = (pu0.C110248b) r13
                r13.f329779e = r12
                goto L_0x00f6
            L_0x00da:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r2 = "current  "
                r12.append(r2)
                r12.append(r0)
                java.lang.String r0 = " is running a priority higher than request: "
                r12.append(r0)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            L_0x00f6:
                nu0.C109758a.m149087b()     // Catch:{ all -> 0x00fa }
                goto L_0x0102
            L_0x00fa:
                r12 = move-exception
                java.lang.Object[] r13 = new java.lang.Object[r1]
                java.lang.String r0 = "Fail to call tickLastForbiddenTimes()."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r12, r0, r13)
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pu0.C110248b.C110249a.mo161664i(ou0.a, java.lang.String):void");
        }

        /* renamed from: j */
        public final boolean mo161665j() {
            return C110472b.f330365a.mo161951b();
        }

        /* renamed from: k */
        public final boolean mo161666k() {
            return mo161657b().mo157504C();
        }

        /* renamed from: l */
        public final boolean mo161667l() {
            return mo161657b().mo161485s();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            if (r9 != 9) goto L_0x005f;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo161668m(int r9) {
            /*
                r8 = this;
                qu0.a r0 = qu0.C77431a.f225845a
                java.lang.Class<pu0.b> r1 = pu0.C110248b.class
                r2 = 5
                r3 = 4
                if (r9 == r2) goto L_0x005c
                r2 = 6
                r4 = 3
                if (r9 == r2) goto L_0x0019
                r2 = 8
                if (r9 == r2) goto L_0x0015
                r2 = 9
                if (r9 == r2) goto L_0x0019
                goto L_0x005f
            L_0x0015:
                r0.mo107610a(r4)
                goto L_0x005f
            L_0x0019:
                qu0.c r2 = qu0.C110473c.f330369a
                di3.d r5 = di3.C86312j.m106911c(r1)
                java.lang.String r6 = "getService(SubCoreAudio::class.java)"
                gy3.C87412m.m108593f(r5, r6)
                pu0.b r5 = (pu0.C110248b) r5
                ou0.a r5 = r5.f329779e
                if (r5 != 0) goto L_0x003f
                ou0.c r5 = new ou0.c
                r5.<init>()
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r6)
                pu0.b r1 = (pu0.C110248b) r1
                java.lang.String[] r1 = r1.f329781g
                r6 = 0
                java.lang.String r7 = "music"
                r1[r6] = r7
            L_0x003f:
                android.media.AudioManager r1 = r5.f329358h
                boolean r1 = r2.mo161952a(r1)
                if (r1 == 0) goto L_0x004b
                r0.mo107610a(r4)
                goto L_0x005f
            L_0x004b:
                qu0.b r1 = qu0.C110472b.f330365a
                boolean r1 = r1.mo161951b()
                if (r1 == 0) goto L_0x0057
                r0.mo107610a(r3)
                goto L_0x005f
            L_0x0057:
                r1 = 2
                r0.mo107610a(r1)
                goto L_0x005f
            L_0x005c:
                r0.mo107610a(r3)
            L_0x005f:
                ou0.a r0 = r8.mo161657b()
                r0.mo18021R(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pu0.C110248b.C110249a.mo161668m(int):void");
        }

        /* renamed from: n */
        public final void mo161669n(int i) {
            C110066a.m149592a0(mo161657b(), i, (C32224a) null, 2, (Object) null);
        }

        /* renamed from: o */
        public final void mo161670o(String str) {
            C87412m.m108594g(str, "type");
            if (C87412m.m108589b(str, (String) C110823p.m150976B(mo161659d().f329781g))) {
                Log.m105924i("MicroMsg.SubCoreAudio", "current do unInit audio manager and clear the queue");
                mo161659d().f329781g[0] = "";
                mo161659d().f329779e = null;
            }
        }
    }

    public C110248b() {
        String[] strArr = new String[2];
        for (int i = 0; i < 2; i++) {
            strArr[i] = "";
        }
        this.f329781g = strArr;
    }

    public static final boolean Jh0() {
        return f329777h.mo161665j();
    }

    public static final C110066a vx0() {
        return f329777h.mo161657b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r3.equals("voipcs") == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r1 = new ou0.C110072e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r3.equals("ipcall") == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1 = new ou0.C110070b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r1 = new ou0.C110071c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0.mo161659d().f329779e = r1;
        r0.mo161659d().f329780f = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r3.equals("multitalke") == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r3.equals("voip") == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ou0.C110066a wx0(java.lang.String r3) {
        /*
            pu0.b$a r0 = f329777h
            java.lang.String r1 = "type"
            gy3.C87412m.m108594g(r3, r1)
            pu0.b r1 = r0.mo161659d()
            java.lang.String r1 = r1.f329780f
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 == 0) goto L_0x0019
            ou0.a r3 = r0.mo161657b()
            goto L_0x0065
        L_0x0019:
            int r1 = r3.hashCode()
            switch(r1) {
                case -1182426107: goto L_0x0044;
                case -810977776: goto L_0x0034;
                case 3625376: goto L_0x002a;
                case 1268443040: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0053
        L_0x0021:
            java.lang.String r1 = "multitalke"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004d
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = "voip"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "voipcs"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x0053
        L_0x003e:
            ou0.e r1 = new ou0.e
            r1.<init>()
            goto L_0x0058
        L_0x0044:
            java.lang.String r1 = "ipcall"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            ou0.b r1 = new ou0.b
            r1.<init>()
            goto L_0x0058
        L_0x0053:
            ou0.c r1 = new ou0.c
            r1.<init>()
        L_0x0058:
            pu0.b r2 = r0.mo161659d()
            r2.f329779e = r1
            pu0.b r0 = r0.mo161659d()
            r0.f329780f = r3
            r3 = r1
        L_0x0065:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pu0.C110248b.wx0(java.lang.String):ou0.a");
    }

    public static final int xx0() {
        return f329777h.mo161661f();
    }

    public static final int yx0(int i) {
        return f329777h.mo161657b().mo157506c(i);
    }

    public static final boolean zx0() {
        return f329777h.mo161666k();
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.SubCoreAudio", "onAccountPostReset");
        Class cls = C110248b.class;
        C110473c cVar = C110473c.f330369a;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        C110066a aVar = ((C110248b) c).f329779e;
        if (aVar == null) {
            aVar = new C110071c();
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
            ((C110248b) c2).f329781g[0] = "music";
        }
        if (cVar.mo161952a(aVar.f329358h)) {
            C77431a.f225847c = 3;
            C77431a.f225846b = Util.currentTicks();
        } else if (C110472b.f330365a.mo161951b()) {
            C77431a.f225847c = 4;
            C77431a.f225846b = Util.currentTicks();
        } else {
            C77431a.f225847c = 2;
            C77431a.f225846b = Util.currentTicks();
        }
        this.f329778d.registerBroadcasts();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.SubCoreAudio", "onAccountRelease");
        int i = C77431a.f225847c;
        int i2 = C77431a.f225847c;
        if (i2 == -1) {
            C77431a.f225847c = i;
            C77431a.f225846b = Util.currentTicks();
        } else {
            AudioDeviceInfoKvReportStruct audioDeviceInfoKvReportStruct = new AudioDeviceInfoKvReportStruct();
            audioDeviceInfoKvReportStruct.f194142d = i2;
            audioDeviceInfoKvReportStruct.f194143e = Util.ticksToNow(C77431a.f225846b) / ((long) 1000);
            audioDeviceInfoKvReportStruct.mo86054n();
            C77431a.f225847c = i;
            C77431a.f225846b = Util.currentTicks();
        }
        this.f329778d.unRegisterBroadcasts();
    }
}
