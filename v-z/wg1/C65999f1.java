package wg1;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej0.C58608e;
import ej0.C86525c;
import gj0.C87227a;
import hj0.C87535e;

/* renamed from: wg1.f1 */
public final class C65999f1 implements C87227a {

    /* renamed from: a */
    public final /* synthetic */ C65992e1 f189747a;

    /* renamed from: b */
    public final /* synthetic */ String f189748b;

    /* renamed from: wg1.f1$a */
    public static final class C66000a implements C87227a {

        /* renamed from: a */
        public final /* synthetic */ C65992e1 f189749a;

        /* renamed from: wg1.f1$a$a */
        public static final class C66001a implements C87227a {

            /* renamed from: a */
            public final /* synthetic */ C65992e1 f189750a;

            public C66001a(C65992e1 e1Var) {
                this.f189750a = e1Var;
            }

            /* renamed from: a */
            public void mo88410a(C87535e eVar) {
                String str = this.f189750a.f189733f;
                StringBuilder sb = new StringBuilder();
                sb.append("play new fail ");
                sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
                Log.m105920e(str, sb.toString());
                C65992e1 e1Var = this.f189750a;
                Message obtainMessage = e1Var.f189738n.obtainMessage(e1Var.f189734g);
                obtainMessage.arg1 = eVar != null ? eVar.f253592c : 0;
                obtainMessage.sendToTarget();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
                r4 = r2.f251382a;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo88411b(hj0.C87535e r7) {
                /*
                    r6 = this;
                    wg1.e1 r7 = r6.f189750a
                    java.lang.String r7 = r7.f189733f
                    java.lang.String r0 = "play new success"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)
                    wg1.e1 r7 = r6.f189750a
                    ej0.c r7 = r7.f189739o
                    if (r7 != 0) goto L_0x0010
                    goto L_0x0016
                L_0x0010:
                    ej0.e$a r0 = ej0.C58608e.C58609a.Playing
                    ej0.e r1 = r7.f251386e
                    r1.f167798a = r0
                L_0x0016:
                    if (r7 == 0) goto L_0x001b
                    r7.mo121005f()
                L_0x001b:
                    wg1.e1 r7 = r6.f189750a
                    ej0.c r7 = r7.f189739o
                    if (r7 == 0) goto L_0x0024
                    r7.mo121006g()
                L_0x0024:
                    wg1.e1 r7 = r6.f189750a
                    ej0.c r0 = r7.f189739o
                    if (r0 == 0) goto L_0x002e
                    ej0.d r1 = r7.f189740p
                    r0.f251389h = r1
                L_0x002e:
                    fj1.b r7 = r7.f189731d
                    java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                    androidx.lifecycle.i0 r7 = r7.mo71262a(r0)
                    cl1.o r7 = (cl1.C54991o) r7
                    al1.x r0 = new al1.x
                    wg1.e1 r1 = r6.f189750a
                    ej0.c r2 = r1.f189739o
                    r3 = 0
                    if (r2 == 0) goto L_0x0048
                    ej0.b r4 = r2.f251382a
                    if (r4 == 0) goto L_0x0048
                    java.lang.String r4 = r4.f251378g
                    goto L_0x0049
                L_0x0048:
                    r4 = r3
                L_0x0049:
                    if (r2 == 0) goto L_0x0051
                    ej0.b r5 = r2.f251382a
                    if (r5 == 0) goto L_0x0051
                    java.lang.String r3 = r5.f251380i
                L_0x0051:
                    r0.<init>(r4, r3)
                    r7.f154228M2 = r0
                    wg1.d1 r7 = r1.f189737j
                    if (r7 == 0) goto L_0x005d
                    r7.mo90025W(r2)
                L_0x005d:
                    wg1.e1 r7 = r6.f189750a
                    com.tencent.mm.sdk.platformtools.MTimerHandler r7 = r7.f189741q
                    r7.stopTimer()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: wg1.C65999f1.C66000a.C66001a.mo88411b(hj0.e):void");
            }
        }

        public C66000a(C65992e1 e1Var) {
            this.f189749a = e1Var;
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            String str = this.f189749a.f189733f;
            StringBuilder sb = new StringBuilder();
            sb.append("set AVTransportURI fail ");
            sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
            Log.m105920e(str, sb.toString());
            C65992e1 e1Var = this.f189749a;
            Message obtainMessage = e1Var.f189738n.obtainMessage(e1Var.f189734g);
            obtainMessage.arg1 = eVar != null ? eVar.f253592c : 0;
            obtainMessage.sendToTarget();
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            C65992e1 e1Var = this.f189749a;
            C86525c cVar = e1Var.f189739o;
            if (cVar != null) {
                cVar.f251386e.f167798a = C58608e.C58609a.Transitioning;
            }
            C65989d1 d1Var = e1Var.f189737j;
            if (d1Var != null) {
                d1Var.mo90023D0(cVar);
            }
            C65992e1 e1Var2 = this.f189749a;
            C86525c cVar2 = e1Var2.f189739o;
            if (cVar2 != null) {
                cVar2.mo121001c(new C66001a(e1Var2));
            }
        }
    }

    public C65999f1(C65992e1 e1Var, String str) {
        this.f189747a = e1Var;
        this.f189748b = str;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        String str = this.f189747a.f189733f;
        StringBuilder sb = new StringBuilder();
        sb.append("stop fail before play new ");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : null);
        Log.m105920e(str, sb.toString());
        C65992e1 e1Var = this.f189747a;
        Message obtainMessage = e1Var.f189738n.obtainMessage(e1Var.f189734g);
        obtainMessage.arg1 = eVar != null ? eVar.f253592c : 0;
        obtainMessage.sendToTarget();
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C65992e1 e1Var = this.f189747a;
        C86525c cVar = e1Var.f189739o;
        if (cVar != null) {
            cVar.f251386e.f167798a = C58608e.C58609a.Stopped;
        }
        if (cVar != null) {
            cVar.mo121002d(this.f189748b, new C66000a(e1Var));
        }
    }
}
