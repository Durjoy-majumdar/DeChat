package com.tencent.p014mm.plugin.sport.model;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.ExtStepCountEvent;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85796t4;
import eb0.C31543z5;
import f40.C86709a0;
import java.util.Calendar;
import tv2.C78112d;

/* renamed from: com.tencent.mm.plugin.sport.model.b */
public class C115762b {

    /* renamed from: a */
    public IMvvmObserver<Integer> f347317a = new C115763a();

    /* renamed from: b */
    public C43165f f347318b;

    /* renamed from: c */
    public long f347319c;

    /* renamed from: d */
    public long f347320d;

    /* renamed from: com.tencent.mm.plugin.sport.model.b$a */
    public class C115763a implements IMvvmObserver<Integer> {
        public C115763a() {
        }

        public void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2 || intValue == 3) {
                if (C115778q.m162833b()) {
                    long b = C115762b.this.mo176119b();
                    if (num.intValue() == 1) {
                        z = C115762b.this.mo176120c(b);
                        C115762b.this.getClass();
                        ExtStepCountEvent extStepCountEvent = new ExtStepCountEvent();
                        extStepCountEvent.f107516d.f107518a = 1;
                        extStepCountEvent.asyncPublish(Looper.getMainLooper());
                    } else {
                        z = C115778q.m162834c(C115762b.this.mo176118a(), b) ? C115762b.this.mo176120c(b) : false;
                    }
                    Log.m105925i("MicroMsg.Sport.ExtApiStepManager", "upload step %d %d %b", num, Long.valueOf(b), Boolean.valueOf(z));
                }
            } else if ((intValue == 4 || intValue == 5) && C115778q.m162833b()) {
                long b2 = C115762b.this.mo176119b();
                C115762b bVar = C115762b.this;
                if (bVar.f347319c == 0) {
                    bVar.f347319c = C115775n.f347342a.mo176128a("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", 0);
                }
                boolean d = C115778q.m162835d(bVar.f347319c, C31543z5.m39453c());
                boolean c = C115778q.m162834c(C115762b.this.mo176118a(), b2);
                Log.m105925i("MicroMsg.Sport.ExtApiStepManager", "upload step %d %d result %b timeCondition %b stepCountCondition %b", num, Long.valueOf(b2), Boolean.valueOf((c || d) ? C115762b.this.mo176120c(b2) : false), Boolean.valueOf(d), Boolean.valueOf(c));
            }
        }
    }

    public C115762b() {
        ((C78112d) MvvmEventCenter.getEvent(C78112d.class)).observe(C86709a0.m107523b().f251755f, "UploadSportStepEventHandle", this.f347317a);
    }

    /* renamed from: a */
    public long mo176118a() {
        if (this.f347320d == 0) {
            this.f347320d = C115775n.f347342a.mo176128a("KEY_LAST_UPLOAD_EXT_API_STEP_COUNT_LONG", 0);
        }
        return this.f347320d;
    }

    /* renamed from: b */
    public long mo176119b() {
        long g = C115778q.m162838g();
        C115775n nVar = C115775n.f347342a;
        long a = nVar.mo176128a("KEY_EXT_API_LAST_STEP_TIME_LONG", 0);
        long a2 = nVar.mo176128a("KEY_EXT_API_TODAY_STEP_LONG", 0);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(a);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        if (g == instance.getTimeInMillis()) {
            return a2;
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo176120c(long j) {
        long j2 = j;
        if (j2 <= 0) {
            Log.m105925i("MicroMsg.Sport.ExtApiStepManager", "invalid step %d", Long.valueOf(j));
            return false;
        }
        if (this.f347318b != null) {
            C86709a0.m107524d().mo123458d(this.f347318b);
        }
        long c = C31543z5.m39453c();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        Log.m105925i("MicroMsg.Sport.ExtApiStepManager", "update Api Step time: %s stepCount: %s", C115778q.m162837f(c), Long.valueOf(j));
        this.f347318b = new C43165f("", "gh_43f2581f6fd6", (int) (instance.getTimeInMillis() / 1000), (int) (c / 1000), (int) j2, C85796t4.m105983jo(), 2);
        C86709a0.m107524d().mo123460f(this.f347318b);
        this.f347319c = c;
        C115775n nVar = C115775n.f347342a;
        nVar.mo176131d("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", c);
        this.f347320d = j2;
        nVar.mo176131d("KEY_LAST_UPLOAD_EXT_API_STEP_COUNT_LONG", j2);
        return true;
    }
}
