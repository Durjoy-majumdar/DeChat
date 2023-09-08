package com.tencent.p014mm.plugin.report.service;

import android.view.FrameMetrics;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Random;
import kj2.C117407d;
import p1029rf.C89940c;
import p221qf.C89640c;
import p221qf.C89643f;
import p723vf.C90773a;
import p761yd.C91441c;
import p995kf.C88146a;

/* renamed from: com.tencent.mm.plugin.report.service.c */
public class C71001c {

    /* renamed from: a */
    public static C89940c f205476a;

    /* renamed from: com.tencent.mm.plugin.report.service.c$a */
    public static class C71002a implements C89640c {

        /* renamed from: b */
        public static final C71002a f205477b = new C71002a();

        /* renamed from: a */
        public final Random f205478a = new Random();

        /* renamed from: a */
        public void mo97647a(String str, FrameMetrics frameMetrics, float f, float f2) {
            if (this.f205478a.nextInt(4000) == 0) {
                int i = C90773a.m113839e(MMApplicationContext.getContext()).f260682d;
                C117407d.INSTANCE.mo160131h(AccountTransferStatusCodes.INVALID_REQUEST, Integer.valueOf(Math.round(f)), str, 110, Integer.valueOf(i), Integer.valueOf((int) f2), C89940c.m112516m(frameMetrics));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.report.service.c$b */
    public static class C71003b implements C89643f {

        /* renamed from: b */
        public static final C71003b f205479b = new C71003b();

        /* renamed from: c */
        public static boolean f205480c = false;

        /* renamed from: a */
        public final Random f205481a = new Random();

        /* renamed from: a */
        public void mo97648a(String str, long[] jArr, int[] iArr, int[] iArr2, float f, float f2, float f3) {
            float f4 = f;
            if (this.f205481a.nextInt(3000) == 0) {
                int i = C90773a.m113839e(MMApplicationContext.getContext()).f260682d;
                C117407d dVar = C117407d.INSTANCE;
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(Math.round(100.0f * f4));
                objArr[1] = str;
                objArr[2] = 11;
                objArr[3] = Integer.valueOf(i);
                objArr[4] = Integer.valueOf(Math.round(f3));
                StringBuilder sb = new StringBuilder();
                sb.append('{');
                StringBuilder sb4 = new StringBuilder();
                sb4.append('{');
                for (C89940c.C89944d dVar2 : C89940c.C89944d.values()) {
                    sb4.append('(');
                    sb4.append(dVar2.name());
                    sb4.append("_LEVEL=");
                    sb4.append(iArr[dVar2.ordinal()]);
                    sb4.append(" ");
                    sb4.append(dVar2.name());
                    sb4.append("_SUM=");
                    sb4.append(iArr2[dVar2.ordinal()]);
                    sb4.append("); ");
                }
                sb4.setLength(sb4.length() - 2);
                sb4.append("}");
                sb.append(sb4.toString());
                sb.append("; ");
                StringBuilder sb5 = new StringBuilder();
                sb5.append('{');
                for (C89940c.C89945e eVar : C89940c.C89945e.values()) {
                    sb5.append(eVar.name());
                    sb5.append('=');
                    sb5.append(jArr[eVar.ordinal()]);
                    sb5.append("; ");
                }
                sb5.setLength(sb5.length() - 2);
                sb5.append("}");
                sb.append(sb5.toString());
                sb.append("; avgDroppedFrame=");
                sb.append(f4);
                sb.append("; avgRefreshRate=");
                sb.append(Math.round(f2));
                sb.append("; avgFPS=");
                sb.append(f3);
                sb.append('}');
                objArr[5] = sb.toString();
                dVar.mo160131h(AccountTransferStatusCodes.INVALID_REQUEST, objArr);
            }
        }

        /* renamed from: b */
        public boolean mo97649b() {
            return false;
        }

        /* renamed from: c */
        public int mo97650c() {
            return 0;
        }

        /* renamed from: d */
        public int mo97651d() {
            return 5000;
        }

        public String getName() {
            return null;
        }
    }

    static {
        if (C91441c.m114729c()) {
            C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
            if (aVar != null) {
                C89940c cVar = aVar.f254918n;
                f205476a = cVar;
                if (cVar == null) {
                    Log.m105924i("FrameReportService", "frameTracer is null");
                    return;
                }
                return;
            }
            Log.m105924i("FrameReportService", "tracePlugin is null");
            return;
        }
        Log.m105924i("FrameReportService", "matrix is not installed");
    }
}
