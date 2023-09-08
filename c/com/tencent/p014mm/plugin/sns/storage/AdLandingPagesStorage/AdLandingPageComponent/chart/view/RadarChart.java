package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.Chart;
import java.util.ArrayList;
import rs2.C101460a;
import rs2.C101462c;
import ss2.C101700a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart */
public class RadarChart extends Chart {

    /* renamed from: d */
    public Context f275755d;

    /* renamed from: e */
    public ArrayList<C101460a> f275756e;

    /* renamed from: f */
    public C101462c f275757f = new C101462c();

    /* renamed from: g */
    public RadarGrid f275758g;

    /* renamed from: h */
    public RadarDataLayer[] f275759h;

    /* renamed from: i */
    public C101700a f275760i;

    /* renamed from: j */
    public int f275761j = 3;

    /* renamed from: n */
    public int f275762n = 0;

    /* renamed from: o */
    public int f275763o = 4;

    /* renamed from: p */
    public Spannable[] f275764p;

    /* renamed from: q */
    public float f275765q = 1.0f;

    public RadarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f275755d = context;
    }

    public C101462c getGridStyle() {
        SnsMethodCalculate.markStartTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        RadarGrid radarGrid = this.f275758g;
        if (radarGrid == null) {
            C101462c cVar = this.f275757f;
            SnsMethodCalculate.markEndTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
            return cVar;
        }
        this.f275757f = radarGrid.getGridStyle();
        C101462c gridStyle = this.f275758g.getGridStyle();
        SnsMethodCalculate.markEndTimeMs("getGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        return gridStyle;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[LOOP:2: B:12:0x002e->B:26:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0077 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setData(rs2.C101460a... r13) {
        /*
            r12 = this;
            java.lang.String r0 = "setData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r12.removeAllViews()
            int r2 = r13.length
            r3 = 0
            r4 = 0
        L_0x000e:
            r5 = 1
            if (r4 >= r2) goto L_0x0027
            r6 = r13[r4]
            int r6 = r6.size()
            if (r6 < r5) goto L_0x001c
            int r4 = r4 + 1
            goto L_0x000e
        L_0x001c:
            java.lang.Exception r13 = new java.lang.Exception
            java.lang.String r2 = "Not enough elements."
            r13.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r13
        L_0x0027:
            r2 = 0
        L_0x0028:
            int r4 = r13.length
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.ARCDataLayer"
            if (r2 >= r4) goto L_0x0085
            r4 = 0
        L_0x002e:
            int r7 = r13.length
            if (r4 >= r7) goto L_0x0082
            r7 = r13[r2]
            r8 = r13[r4]
            r7.getClass()
            java.lang.String r9 = "check"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r6)
            int r10 = r7.size()
            int r11 = r8.size()
            if (r10 == r11) goto L_0x004c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
        L_0x004a:
            r7 = 0
            goto L_0x0072
        L_0x004c:
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0054:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x006e
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getKey()
            boolean r10 = r7.containsKey(r10)
            if (r10 != 0) goto L_0x0054
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
            goto L_0x004a
        L_0x006e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
            r7 = 1
        L_0x0072:
            if (r7 == 0) goto L_0x0077
            int r4 = r4 + 1
            goto L_0x002e
        L_0x0077:
            java.lang.Error r13 = new java.lang.Error
            java.lang.String r2 = "Layer not compatible."
            r13.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r13
        L_0x0082:
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0085:
            r2 = r13[r3]
            r2.getClass()
            java.lang.String r4 = "getLabels"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x009c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            android.text.Spannable r7 = (android.text.Spannable) r7
            r5.add(r7)
            goto L_0x009c
        L_0x00b2:
            int r2 = r5.size()
            android.text.Spannable[] r2 = new android.text.Spannable[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            android.text.Spannable[] r2 = (android.text.Spannable[]) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            r12.f275764p = r2
            r2 = r13[r3]
            int r2 = r2.size()
            r12.f275762n = r2
            java.util.ArrayList<rs2.a> r2 = r12.f275756e
            if (r2 != 0) goto L_0x00d6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r12.f275756e = r2
        L_0x00d6:
            int r2 = r13.length
            r4 = 0
        L_0x00d8:
            if (r4 >= r2) goto L_0x00e4
            r5 = r13[r4]
            java.util.ArrayList<rs2.a> r6 = r12.f275756e
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x00d8
        L_0x00e4:
            java.lang.String r13 = "setGridToChart"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid r2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid
            android.content.Context r5 = r12.f275755d
            int r6 = r12.f275762n
            int r7 = r12.f275763o
            float r8 = r12.f275765q
            android.text.Spannable[] r9 = r12.f275764p
            rs2.c r10 = r12.f275757f
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
            r12.f275758g = r2
            r12.addView(r2)
            int r13 = r12.f275761j
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer[] r13 = new com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer[r13]
            r12.f275759h = r13
        L_0x010a:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer[] r13 = r12.f275759h
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0140
            java.util.ArrayList<rs2.a> r13 = r12.f275756e
            int r13 = r13.size()
            if (r13 > r3) goto L_0x0118
            goto L_0x0140
        L_0x0118:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer[] r13 = r12.f275759h
            java.lang.String r2 = "setDataLayerToChart"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer r4 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer
            android.content.Context r5 = r12.f275755d
            float r6 = r12.f275765q
            java.util.ArrayList<rs2.a> r7 = r12.f275756e
            java.lang.Object r7 = r7.get(r3)
            rs2.a r7 = (rs2.C101460a) r7
            r4.<init>((android.content.Context) r5, (float) r6, (rs2.C101460a) r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r13[r3] = r4
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarDataLayer[] r13 = r12.f275759h
            r13 = r13[r3]
            r12.addView(r13)
            int r3 = r3 + 1
            goto L_0x010a
        L_0x0140:
            ss2.a r13 = r12.f275760i
            if (r13 != 0) goto L_0x014f
            ss2.a r13 = new ss2.a
            android.content.Context r2 = r12.f275755d
            rs2.c r3 = r12.f275757f
            r13.<init>(r2, r3)
            r12.f275760i = r13
        L_0x014f:
            ss2.a r13 = r12.f275760i
            r12.addView(r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart.setData(rs2.a[]):void");
    }

    public void setGridStyle(C101462c cVar) {
        SnsMethodCalculate.markStartTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        this.f275757f = cVar;
        RadarGrid radarGrid = this.f275758g;
        if (radarGrid != null) {
            radarGrid.setGridStyle(cVar);
        }
        SnsMethodCalculate.markEndTimeMs("setGridStyle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
    }

    public void setLatitudeNum(int i) {
        SnsMethodCalculate.markStartTimeMs("setLatitudeNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
        this.f275763o = i;
        SnsMethodCalculate.markEndTimeMs("setLatitudeNum", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
    }

    public RadarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f275755d = context;
    }
}
