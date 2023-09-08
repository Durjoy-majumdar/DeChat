package pf1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.wcdb.FileUtils;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import mf1.C10786a1;
import rs1.C13442s8;

/* renamed from: pf1.d */
public final class C11894d extends C11908k {
    /* renamed from: u */
    public void mo11780u() {
        Context context;
        String str;
        C11906j jVar = this.f34794i;
        C11924s sVar = jVar instanceof C11924s ? (C11924s) jVar : null;
        if (sVar != null && (context = this.f34793h) != null) {
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C87412m.m108591d(context);
            C13442s8 f = aVar.mo12873f(context);
            if (f == null || (str = f.f38098n) == null) {
                str = "";
            }
            String str2 = str;
            C39818r rVar = C39818r.f106831a;
            Context context2 = this.f34793h;
            C87412m.m108591d(context2);
            long j = ((C10786a1) rVar.mo62443b(context2).mo75002a(C10786a1.class)).f32261v;
            String str3 = this.f34795j;
            int i = C87412m.m108589b(FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str3) ? 2 : C87412m.m108589b("TWO_FLOW", str3) ? 4 : 1;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.Py0((C58417y0) c, str2, true, false, sVar.f34783f, sVar.f34861m, sVar.f34862n, 0, 0, 0, sVar.f34787j, sVar.f34786i, j, i, FileUtils.S_IRWXU, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        r3 = r3.mo3513o();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11781x(jq3.C60905o r21, android.view.View r22, pf1.C11920q r23, pf1.C11906j r24, int r25, int r26, java.lang.String r27) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r27
            java.lang.String r6 = "holder"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "jumpView"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "infoEx"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.String r6 = "cache"
            gy3.C87412m.m108594g(r4, r6)
            super.mo11781x(r21, r22, r23, r24, r25, r26, r27)
            boolean r6 = r4 instanceof pf1.C11924s
            if (r6 != 0) goto L_0x0028
            return
        L_0x0028:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r3.f34830d
            if (r3 == 0) goto L_0x0037
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            if (r3 == 0) goto L_0x0037
            long r6 = r3.getId()
            goto L_0x0039
        L_0x0037:
            r6 = 0
        L_0x0039:
            java.lang.String r3 = "reportAdExpose"
            r0.mo11799w(r3, r6, r4)
            r3 = r4
            pf1.s r3 = (pf1.C11924s) r3
            r0.mo11783z(r2, r3)
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            android.content.Context r2 = r22.getContext()
            java.lang.String r7 = "jumpView.context"
            gy3.C87412m.m108593f(r2, r7)
            rs1.s8 r2 = r6.mo12873f(r2)
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = r2.f38098n
            if (r2 != 0) goto L_0x005b
        L_0x0059:
            java.lang.String r2 = ""
        L_0x005b:
            bl3.r r6 = bl3.C39818r.f106831a
            android.content.Context r1 = r1.f173499A
            java.lang.String r7 = "holder.context"
            gy3.C87412m.m108593f(r1, r7)
            bl3.r$a r1 = r6.mo62443b(r1)
            java.lang.Class<mf1.a1> r6 = mf1.C10786a1.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r6)
            mf1.a1 r1 = (mf1.C10786a1) r1
            long r14 = r1.f32261v
            java.lang.String r1 = "comment"
            boolean r1 = gy3.C87412m.m108589b(r1, r5)
            if (r1 == 0) goto L_0x007e
            r1 = 2
            r19 = 2
            goto L_0x008d
        L_0x007e:
            java.lang.String r1 = "TWO_FLOW"
            boolean r1 = gy3.C87412m.m108589b(r1, r5)
            if (r1 == 0) goto L_0x008a
            r1 = 4
            r19 = 4
            goto L_0x008d
        L_0x008a:
            r1 = 1
            r19 = 1
        L_0x008d:
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r6 = 0
            r7 = 1
            c30.g r8 = r4.f34783f
            int r9 = r3.f34861m
            int r10 = r3.f34862n
            r11 = 0
            java.lang.String r3 = r4.f34787j
            long r12 = r4.f34786i
            r4 = r1
            r5 = r2
            r1 = r12
            r12 = r25
            r13 = r26
            r17 = r14
            r14 = r3
            r15 = r1
            r4.Oy0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11894d.mo11781x(jq3.o, android.view.View, pf1.q, pf1.j, int, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r11 = r11.mo3513o();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11782y(jq3.C60905o r9, android.view.View r10, pf1.C11920q r11, pf1.C11906j r12, java.lang.String r13) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "jumpView"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "infoEx"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "cache"
            gy3.C87412m.m108594g(r12, r0)
            super.mo11782y(r9, r10, r11, r12, r13)
            boolean r0 = r12 instanceof pf1.C11924s
            if (r0 != 0) goto L_0x001c
            return
        L_0x001c:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r11.f34830d
            if (r11 == 0) goto L_0x002b
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            if (r11 == 0) goto L_0x002b
            long r0 = r11.getId()
            goto L_0x002d
        L_0x002b:
            r0 = 0
        L_0x002d:
            pf1.s r12 = (pf1.C11924s) r12
            java.lang.String r11 = "reportAdExpose"
            r8.mo11799w(r11, r0, r12)
            r8.mo11783z(r10, r12)
            pf1.c r11 = new pf1.c
            r2 = r11
            r3 = r8
            r4 = r10
            r5 = r12
            r6 = r9
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            int r9 = r12.f34861m
            if (r9 != 0) goto L_0x004a
            r10.post(r11)
            goto L_0x004d
        L_0x004a:
            r11.run()
        L_0x004d:
            java.lang.Runnable r9 = r8.f34797l
            r10.removeCallbacks(r9)
            java.lang.Runnable r9 = r8.f34797l
            r11 = 1000(0x3e8, double:4.94E-321)
            r10.postDelayed(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11894d.mo11782y(jq3.o, android.view.View, pf1.q, pf1.j, java.lang.String):void");
    }

    /* renamed from: z */
    public final void mo11783z(View view, C11924s sVar) {
        if (sVar.f34861m <= 0 || sVar.f34862n <= 0) {
            Integer valueOf = Integer.valueOf(view.getWidth());
            Integer valueOf2 = Integer.valueOf(view.getHeight());
            sVar.f34861m = valueOf.intValue();
            sVar.f34862n = valueOf2.intValue();
        }
    }
}
