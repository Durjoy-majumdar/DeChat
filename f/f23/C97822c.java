package f23;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Debug;
import android.os.Process;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f23.C97815b;
import gy3.C87412m;
import i23.C98593c;
import java.util.Iterator;
import java.util.Map;
import sp3.C110794b;
import z04.C112551y;

/* renamed from: f23.c */
public final class C97822c {

    /* renamed from: a */
    public MultiMediaEditResultStruct f286970a = new MultiMediaEditResultStruct();

    /* renamed from: b */
    public C97815b f286971b = new C97815b();

    /* renamed from: a */
    public final void mo137154a() {
        Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) systemService).getProcessMemoryInfo(new int[]{Process.myPid()});
        if ((processMemoryInfo != null ? processMemoryInfo.length : 0) >= 1) {
            this.f286971b.f286950c.f286955a = processMemoryInfo[0].getTotalPss();
        }
        C110794b.f331445i.getClass();
        Map<String, Bitmap> snapshot = C110794b.f331444h.snapshot();
        this.f286971b.f286950c.f286956b = snapshot.size();
        C97815b.C97818c cVar = this.f286971b.f286950c;
        int i = 0;
        for (Bitmap allocationByteCount : snapshot.values()) {
            i += allocationByteCount.getAllocationByteCount();
        }
        cVar.f286957c = i;
        String jSONObject = this.f286971b.mo33258a().toString();
        C87412m.m108593f(jSONObject, "reportJson.toJson().toString()");
        String n = C112551y.m153814n(jSONObject, ",", ";", false);
        MultiMediaEditResultStruct multiMediaEditResultStruct = this.f286970a;
        multiMediaEditResultStruct.f265740e = multiMediaEditResultStruct.mo86045b("JsonInfo", n, true);
        Log.m105924i("MicroMsg.MultiMediaEditReport", "report: " + this.f286970a.mo1006q());
        this.f286970a.mo86054n();
        this.f286970a = new MultiMediaEditResultStruct();
        this.f286971b = new C97815b();
    }

    /* renamed from: b */
    public final void mo137155b(C96552p0 p0Var) {
        C87412m.m108594g(p0Var, "composition");
        this.f286971b.f286948a.clear();
        Iterator<T> it = p0Var.f282570c.iterator();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            C97815b.C97820e a = C98593c.f289086a.mo137978a((C106205q0) it.next());
            C97815b.C97821f fVar = a instanceof C97815b.C97821f ? (C97815b.C97821f) a : null;
            if (fVar != null) {
                if (p0Var.mo134611h().f331513n == null) {
                    z = false;
                }
                fVar.f286969l = z;
            }
            if (a != null) {
                if (a instanceof C97815b.C97819d) {
                    j3++;
                } else {
                    j2++;
                }
                this.f286971b.f286948a.add(a);
            }
        }
        MultiMediaEditResultStruct multiMediaEditResultStruct = this.f286970a;
        multiMediaEditResultStruct.f265753r = 1;
        multiMediaEditResultStruct.f265741f = j2;
        multiMediaEditResultStruct.f265742g = j3;
        if (p0Var.f282576i) {
            j = 1;
        }
        multiMediaEditResultStruct.f265748m = j;
        Log.m105924i("MicroMsg.MultiMediaEditReport", "setComposition, isEnableVideoEnhancement:" + p0Var.f282576i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: ai2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: ai2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: f23.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: f23.b$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137156c(java.util.List<? extends ai2.C92007a> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "itemList"
            gy3.C87412m.m108594g(r9, r0)
            f23.b r0 = r8.f286971b
            java.util.ArrayList<f23.b$a> r0 = r0.f286949b
            r0.clear()
            java.util.Iterator r0 = r9.iterator()
        L_0x0011:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0101
            java.lang.Object r1 = r0.next()
            ai2.a r1 = (ai2.C92007a) r1
            ai2.d r2 = r1.f263402a
            ai2.d r3 = ai2.C92011d.TEXT
            java.lang.String r4 = "/"
            r5 = 0
            java.lang.String r6 = ""
            r7 = 0
            if (r2 != r3) goto L_0x007a
            f23.b$b r2 = new f23.b$b
            r2.<init>()
            boolean r3 = r1 instanceof ai2.C92025s
            if (r3 == 0) goto L_0x0035
            r7 = r1
            ai2.s r7 = (ai2.C92025s) r7
        L_0x0035:
            if (r7 == 0) goto L_0x003d
            java.lang.String r3 = r7.f263530k
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r3
        L_0x003d:
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r6 = r3.getPath()
            if (r6 == 0) goto L_0x0061
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r5, r5)
            java.lang.String r6 = r3.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0061
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r5)
            android.net.Uri r3 = r3.build()
        L_0x0061:
            java.lang.String r3 = r3.getPath()
            int r4 = r3.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
        L_0x0072:
            java.lang.String r4 = "VFSFile((it as? TextItem)?.font ?: \"\").name"
            gy3.C87412m.m108593f(r3, r4)
            r2.f286954c = r3
            goto L_0x00d4
        L_0x007a:
            ai2.d r3 = ai2.C92011d.CAPTION
            if (r2 != r3) goto L_0x00cf
            f23.b$b r2 = new f23.b$b
            r2.<init>()
            boolean r3 = r1 instanceof ai2.C92010c
            if (r3 == 0) goto L_0x008a
            r7 = r1
            ai2.c r7 = (ai2.C92010c) r7
        L_0x008a:
            if (r7 == 0) goto L_0x0092
            java.lang.String r3 = r7.f263435j
            if (r3 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r6 = r3
        L_0x0092:
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r6 = r3.getPath()
            if (r6 == 0) goto L_0x00b6
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r5, r5)
            java.lang.String r6 = r3.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x00b6
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r5)
            android.net.Uri r3 = r3.build()
        L_0x00b6:
            java.lang.String r3 = r3.getPath()
            int r4 = r3.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x00c1
            goto L_0x00c7
        L_0x00c1:
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
        L_0x00c7:
            java.lang.String r4 = "VFSFile((it as? CaptionItem)?.font ?: \"\").name"
            gy3.C87412m.m108593f(r3, r4)
            r2.f286954c = r3
            goto L_0x00d4
        L_0x00cf:
            f23.b$a r2 = new f23.b$a
            r2.<init>()
        L_0x00d4:
            ai2.d r3 = r1.f263402a
            int r3 = r3.f263445d
            r2.f286952a = r3
            java.util.ArrayList<java.lang.Long> r3 = r2.f286953b
            ci2.d r4 = r1.f263404c
            long r4 = r4.mo146049c()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.add(r4)
            java.util.ArrayList<java.lang.Long> r3 = r2.f286953b
            ci2.d r1 = r1.f263404c
            long r4 = r1.mo146048b()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.add(r1)
            f23.b r1 = r8.f286971b
            java.util.ArrayList<f23.b$a> r1 = r1.f286949b
            r1.add(r2)
            goto L_0x0011
        L_0x0101:
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct r0 = r8.f286970a
            int r9 = r9.size()
            long r1 = (long) r9
            r0.f265743h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.C97822c.mo137156c(java.util.List):void");
    }
}
