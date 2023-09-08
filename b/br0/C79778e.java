package br0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: br0.e */
public interface C79778e {

    /* renamed from: br0.e$a */
    public interface C79779a {
        /* renamed from: g */
        void mo109919g(C79780b bVar, boolean z);
    }

    /* renamed from: br0.e$b */
    public enum C79780b {
        PORTRAIT(1),
        UNSPECIFIED(-1),
        LANDSCAPE_SENSOR(6),
        LANDSCAPE_LOCKED(0),
        LANDSCAPE_LEFT(8),
        LANDSCAPE_RIGHT(0);
        

        /* renamed from: n */
        public static final C79780b[] f233803n = null;

        /* renamed from: d */
        public final int f233805d;

        /* access modifiers changed from: public */
        static {
            C79780b bVar;
            C79780b bVar2;
            C79780b bVar3;
            C79780b bVar4;
            f233803n = new C79780b[]{bVar3, bVar4, bVar2, bVar};
        }

        /* access modifiers changed from: public */
        C79780b(int i) {
            this.f233805d = i;
        }

        /* renamed from: b */
        public static C79780b m96933b(String str) {
            C79780b bVar;
            String str2 = null;
            if (!"landscape".equals(str)) {
                if (!"portrait".equals(str)) {
                    if (!"landscapeLeft".equals(str)) {
                        if (!"landscapeRight".equals(str)) {
                            if (!"auto".equals(str) && !"UNSPECIFIED".equalsIgnoreCase(str)) {
                                C79780b[] values = values();
                                int length = values.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        bVar = null;
                                        break;
                                    }
                                    C79780b bVar2 = values[i];
                                    if (bVar2.name().equalsIgnoreCase(str)) {
                                        bVar = bVar2;
                                        break;
                                    }
                                    i++;
                                }
                            } else {
                                bVar = UNSPECIFIED;
                            }
                        } else {
                            bVar = LANDSCAPE_RIGHT;
                        }
                    } else {
                        bVar = LANDSCAPE_LEFT;
                    }
                } else {
                    bVar = PORTRAIT;
                }
            } else {
                bVar = LANDSCAPE_SENSOR;
            }
            Object[] objArr = new Object[3];
            objArr[0] = str;
            if (bVar != null) {
                str2 = bVar.name();
            }
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(bVar == null ? -1 : bVar.f233805d);
            Log.m105925i("Luggage.WXA.Window.Orientation", "parseOrientationString [%s]->[%s][%d]", objArr);
            return bVar;
        }

        /* renamed from: c */
        public static C79780b m96934c(int i) {
            for (C79780b bVar : values()) {
                if (bVar.f233805d == i) {
                    return bVar;
                }
            }
            return UNSPECIFIED;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = f233799g;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo109920a(br0.C79778e.C79780b r3) {
            /*
                r2 = this;
                br0.e$b r0 = LANDSCAPE_LOCKED
                if (r2 == r3) goto L_0x0011
                br0.e$b r1 = LANDSCAPE_SENSOR
                if (r2 != r1) goto L_0x000a
                if (r3 == r0) goto L_0x0011
            L_0x000a:
                if (r2 != r0) goto L_0x000f
                if (r3 != r1) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r3 = 0
                goto L_0x0012
            L_0x0011:
                r3 = 1
            L_0x0012:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: br0.C79778e.C79780b.mo109920a(br0.e$b):boolean");
        }
    }

    /* renamed from: a */
    C79780b mo109917a();

    /* renamed from: b */
    void mo109918b(C79780b bVar, C79779a aVar);
}
