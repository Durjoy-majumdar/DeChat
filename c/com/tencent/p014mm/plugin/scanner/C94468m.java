package com.tencent.p014mm.plugin.scanner;

import android.content.Context;
import android.graphics.PointF;
import android.os.Vibrator;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.scanner.m */
public final class C94468m {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x002e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final rx3.C13604l<java.util.ArrayList<com.tencent.p014mm.plugin.scanner.ImageQBarDataBean>, java.util.ArrayList<android.graphics.PointF>> m119493a(android.content.Context r18, android.view.View r19, java.util.ArrayList<com.tencent.p014mm.plugin.scanner.ImageQBarDataBean> r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "dataList"
            r4 = r20
            gy3.C87412m.m108594g(r4, r3)
            r3 = 2131166974(0x7f0706fe, float:1.7948208E38)
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r1 == 0) goto L_0x0120
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Iterator r4 = r20.iterator()
        L_0x002e:
            boolean r8 = r4.hasNext()
            java.lang.String r9 = "MicroMsg.ScanCodeViewHelper"
            if (r8 == 0) goto L_0x00d8
            java.lang.Object r8 = r4.next()
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r8 = (com.tencent.p014mm.plugin.scanner.ImageQBarDataBean) r8
            if (r8 == 0) goto L_0x002e
            android.graphics.PointF r12 = new android.graphics.PointF
            float r13 = r8.f273117h
            float r14 = r8.f273118i
            r12.<init>(r13, r14)
            boolean r13 = r1 instanceof com.tencent.p014mm.p136ui.base.C19706a
            if (r13 == 0) goto L_0x005d
            r13 = r1
            com.tencent.mm.ui.base.a r13 = (com.tencent.p014mm.p136ui.base.C19706a) r13
            int r14 = r8.f273119j
            int r15 = r8.f273120n
            android.graphics.PointF r13 = r13.mo26061f(r12, r14, r15)
            java.lang.String r14 = "{\n                      …ht)\n                    }"
            gy3.C87412m.m108593f(r13, r14)
            goto L_0x0076
        L_0x005d:
            android.graphics.PointF r13 = new android.graphics.PointF
            float r14 = r8.f273117h
            int r15 = r19.getMeasuredWidth()
            float r15 = (float) r15
            float r14 = r14 * r15
            float r15 = r8.f273118i
            int r10 = r19.getMeasuredHeight()
            float r10 = (float) r10
            float r15 = r15 * r10
            float r10 = (float) r2
            float r15 = r15 + r10
            r13.<init>(r14, r15)
        L_0x0076:
            int r10 = r19.getMeasuredWidth()
            int r14 = r19.getMeasuredHeight()
            int r14 = r14 + r2
            r15 = 16
            int r15 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r15)
            float r11 = r13.x
            r16 = 0
            int r17 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r17 < 0) goto L_0x00a4
            float r10 = (float) r10
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x00a4
            float r10 = r13.y
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00a4
            int r11 = r3 / 2
            int r14 = r14 - r11
            int r14 = r14 - r15
            float r11 = (float) r14
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r10 = 1
            goto L_0x00a5
        L_0x00a4:
            r10 = 0
        L_0x00a5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "getGreenPointOnCurrentView  sourcePoint:"
            r11.append(r14)
            r11.append(r12)
            java.lang.String r12 = "  dstPoint:"
            r11.append(r12)
            r11.append(r13)
            java.lang.String r12 = "  "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
            if (r10 == 0) goto L_0x002e
            r5.add(r8)
            r6.add(r13)
            java.lang.String r8 = r8.f273113d
            r7.add(r8)
            goto L_0x002e
        L_0x00d8:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L_0x0120
            int r0 = r7.size()
            if (r0 != r1) goto L_0x0120
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getGreenPointOnCurrentView, all the point is the same url:"
            r0.append(r1)
            int r1 = r5.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r2 = "codePointInfoList[0]"
            gy3.C87412m.m108593f(r1, r2)
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r1 = (com.tencent.p014mm.plugin.scanner.ImageQBarDataBean) r1
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r2 = "dstPointList[0]"
            gy3.C87412m.m108593f(r0, r2)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            r5.clear()
            r5.add(r1)
            r6.clear()
            r6.add(r0)
        L_0x0120:
            rx3.l r0 = new rx3.l
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.C94468m.m119493a(android.content.Context, android.view.View, java.util.ArrayList, int):rx3.l");
    }

    /* renamed from: b */
    public static final void m119494b(Context context, View view, ArrayList<ImageQBarDataBean> arrayList, int i, C94467l lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(arrayList, "dataList");
        if (view != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            C13604l<ArrayList<ImageQBarDataBean>, ArrayList<PointF>> a = m119493a(context, view, arrayList2, i);
            ArrayList arrayList3 = (ArrayList) a.f38555d;
            ArrayList arrayList4 = (ArrayList) a.f38556e;
            Log.m105924i("MicroMsg.ScanCodeViewHelper", "handleCode  dataList:" + arrayList.size() + "  dstPointListOnCurrentDisplay:" + arrayList4.size() + ' ');
            try {
                Object systemService = context.getSystemService("vibrator");
                Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(10);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanCodeViewHelper", e, "", new Object[0]);
            }
            if (arrayList3.size() == 0) {
                if (arrayList.size() > 0) {
                    ImageQBarDataBean imageQBarDataBean = arrayList.get(0);
                    C87412m.m108593f(imageQBarDataBean, "dataList[0]");
                    ImageQBarDataBean imageQBarDataBean2 = imageQBarDataBean;
                    if (lVar != null) {
                        lVar.mo64854b(imageQBarDataBean2, arrayList2);
                    }
                }
            } else if (lVar != null) {
                lVar.mo64853a(arrayList4, arrayList3, arrayList2);
            }
        }
    }
}
