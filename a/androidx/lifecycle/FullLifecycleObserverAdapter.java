package androidx.lifecycle;

import androidx.lifecycle.C39623j;

class FullLifecycleObserverAdapter implements C103764p {

    /* renamed from: d */
    public final C103761g f306492d;

    /* renamed from: e */
    public final C103764p f306493e;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    public static /* synthetic */ class C54201a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f152161a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.j$b[] r0 = androidx.lifecycle.C39623j.C39625b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f152161a = r0
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f152161a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f152161a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f152161a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f152161a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f152161a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f152161a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.j$b r1 = androidx.lifecycle.C39623j.C39625b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C54201a.<clinit>():void");
        }
    }

    public FullLifecycleObserverAdapter(C103761g gVar, C103764p pVar) {
        this.f306492d = gVar;
        this.f306493e = pVar;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        switch (C54201a.f152161a[bVar.ordinal()]) {
            case 1:
                this.f306492d.onCreate(sVar);
                break;
            case 2:
                this.f306492d.onStart(sVar);
                break;
            case 3:
                this.f306492d.onResume(sVar);
                break;
            case 4:
                this.f306492d.onPause(sVar);
                break;
            case 5:
                this.f306492d.onStop(sVar);
                break;
            case 6:
                this.f306492d.onDestroy(sVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C103764p pVar = this.f306493e;
        if (pVar != null) {
            pVar.mo104k4(sVar, bVar);
        }
    }
}
