package vu1;

import gy3.C8480h;

/* renamed from: vu1.c */
public enum C111619c {
    Unknown,
    Inviting,
    Waiting,
    Connecting,
    Connected,
    Finished;
    

    /* renamed from: d */
    public static final C111620a f334120d = null;

    /* renamed from: vu1.c$a */
    public static final class C111620a {
        public C111620a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return vu1.C111619c.f334126j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return vu1.C111619c.f334125i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            return vu1.C111619c.f334124h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return vu1.C111619c.f334123g;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final vu1.C111619c mo163290a(int r3) {
            /*
                r2 = this;
                switch(r3) {
                    case 0: goto L_0x002b;
                    case 1: goto L_0x002b;
                    case 2: goto L_0x0028;
                    case 3: goto L_0x0028;
                    case 4: goto L_0x0025;
                    case 5: goto L_0x0025;
                    case 6: goto L_0x0022;
                    case 7: goto L_0x0022;
                    case 8: goto L_0x001f;
                    default: goto L_0x0003;
                }
            L_0x0003:
                switch(r3) {
                    case 256: goto L_0x0028;
                    case 257: goto L_0x0028;
                    case 258: goto L_0x0025;
                    case 259: goto L_0x0025;
                    case 260: goto L_0x0022;
                    case 261: goto L_0x0022;
                    case 262: goto L_0x001f;
                    default: goto L_0x0006;
                }
            L_0x0006:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Not supported state: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "MicroMsg.FlutterVoIPEnums"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
                vu1.c r3 = vu1.C111619c.Unknown
                goto L_0x002d
            L_0x001f:
                vu1.c r3 = vu1.C111619c.Finished
                goto L_0x002d
            L_0x0022:
                vu1.c r3 = vu1.C111619c.Connected
                goto L_0x002d
            L_0x0025:
                vu1.c r3 = vu1.C111619c.Connecting
                goto L_0x002d
            L_0x0028:
                vu1.c r3 = vu1.C111619c.Waiting
                goto L_0x002d
            L_0x002b:
                vu1.c r3 = vu1.C111619c.Inviting
            L_0x002d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: vu1.C111619c.C111620a.mo163290a(int):vu1.c");
        }
    }

    /* access modifiers changed from: public */
    static {
        f334120d = new C111620a((C8480h) null);
    }
}
