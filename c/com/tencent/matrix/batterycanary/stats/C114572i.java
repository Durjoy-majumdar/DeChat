package com.tencent.matrix.batterycanary.stats;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.C114570h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p1177ce.C113310f;
import p1190de.C116608a;
import p723vf.C118672d;
import p723vf.C90778c;

/* renamed from: com.tencent.matrix.batterycanary.stats.i */
public final class C114572i extends C116608a {

    /* renamed from: b */
    public HandlerThread f343364b;

    /* renamed from: c */
    public Handler f343365c;

    /* renamed from: d */
    public C114559a f343366d;

    /* renamed from: e */
    public C114570h f343367e;

    /* renamed from: com.tencent.matrix.batterycanary.stats.i$a */
    public class C114573a implements Runnable {
        public C114573a() {
        }

        public void run() {
            boolean z;
            C114559a aVar = C114572i.this.f343366d;
            String b = C114559a.C114560a.f343346d.mo181110b();
            C114559a.C114560a aVar2 = (C114559a.C114560a) aVar;
            aVar2.getClass();
            if (!TextUtils.isEmpty(b)) {
                Set<String> decodeStringSet = aVar2.f343349b.decodeStringSet("bs-proc-set");
                if (decodeStringSet == null) {
                    decodeStringSet = Collections.emptySet();
                }
                if (!decodeStringSet.contains(b)) {
                    if (decodeStringSet.isEmpty()) {
                        decodeStringSet = new HashSet<>();
                    }
                    decodeStringSet.add(b);
                    aVar2.f343349b.encode("bs-proc-set", decodeStringSet);
                }
            }
            C114559a.C114560a aVar3 = (C114559a.C114560a) C114572i.this.f343366d;
            aVar3.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 7; i++) {
                arrayList.add(C114559a.C114560a.m161173a(-i));
            }
            String[] allKeys = aVar3.f343349b.allKeys();
            if (allKeys != null && allKeys.length != 0) {
                for (String str : allKeys) {
                    if (!"bs-proc-set".equals(str)) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (str.startsWith(aVar3.mo173737b((String) it.next(), ""))) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            try {
                                aVar3.f343349b.remove(str);
                            } catch (Exception e) {
                                C118672d.m167356f("Matrix.battery.recorder", "record clean failed: " + e.getMessage(), new Object[0]);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.i$b */
    public class C114574b implements Runnable {
        public C114574b() {
        }

        public void run() {
            HandlerThread handlerThread = C114572i.this.f343364b;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.i$c */
    public class C114575c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f343370d;

        /* renamed from: e */
        public final /* synthetic */ BatteryRecord f343371e;

        public C114575c(String str, BatteryRecord batteryRecord) {
            this.f343370d = str;
            this.f343371e = batteryRecord;
        }

        public void run() {
            C114572i iVar = C114572i.this;
            String str = this.f343370d;
            BatteryRecord batteryRecord = this.f343371e;
            C114559a aVar = iVar.f343366d;
            if (aVar != null) {
                C114559a.C114560a aVar2 = (C114559a.C114560a) aVar;
                String b = C114559a.C114560a.f343346d.mo181110b();
                try {
                    aVar2.f343349b.encode(aVar2.mo173737b(str, b) + "-" + aVar2.f343348a + "-" + aVar2.f343350c.getAndIncrement(), BatteryRecord.m161170c(batteryRecord));
                } catch (Exception e) {
                    C118672d.m167356f("Matrix.battery.recorder", "record encode failed: " + e.getMessage(), new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
        int i = z ? 1 : 2;
        if (this.f343367e != null) {
            BatteryRecord.AppStatRecord appStatRecord = new BatteryRecord.AppStatRecord();
            appStatRecord.f343326f = i;
            mo173742j(appStatRecord);
        }
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        C113310f fVar = this.f349668a.f339057d;
        C114559a aVar = fVar.f339054y;
        this.f343366d = aVar;
        this.f343367e = fVar.f339055z;
        if (aVar != null) {
            this.f343364b = C90778c.m113845c("matrix_stats", 5);
            Handler handler = new Handler(this.f343364b.getLooper());
            this.f343365c = handler;
            handler.post(new C114573a());
        }
        BatteryRecord.ProcStatRecord procStatRecord = new BatteryRecord.ProcStatRecord();
        procStatRecord.f343332g = Process.myPid();
        procStatRecord.f343331f = 1;
        mo173742j(procStatRecord);
    }

    /* renamed from: d */
    public int mo111818d() {
        return 0;
    }

    /* renamed from: f */
    public void mo111819f() {
        super.mo111819f();
        BatteryRecord.ProcStatRecord procStatRecord = new BatteryRecord.ProcStatRecord();
        procStatRecord.f343332g = Process.myPid();
        procStatRecord.f343331f = 2;
        mo173742j(procStatRecord);
        Handler handler = this.f343365c;
        if (handler != null) {
            handler.post(new C114574b());
        }
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.BatteryStats";
    }

    /* renamed from: i */
    public void mo173741i(String str, int i, Map<String, Object> map) {
        C114570h hVar = this.f343367e;
        if (hVar != null) {
            ((C114570h.C114571a) hVar).getClass();
            BatteryRecord.EventStatRecord eventStatRecord = new BatteryRecord.EventStatRecord();
            eventStatRecord.f343328f = (long) i;
            eventStatRecord.f343329g = str;
            if (!map.isEmpty()) {
                eventStatRecord.f343330h = map;
            }
            mo173742j(eventStatRecord);
        }
    }

    /* renamed from: j */
    public void mo173742j(BatteryRecord batteryRecord) {
        if (this.f343366d != null) {
            String a = C114559a.C114560a.m161173a(0);
            Handler handler = this.f343365c;
            if (handler != null) {
                handler.post(new C114575c(a, batteryRecord));
            }
        }
    }
}
