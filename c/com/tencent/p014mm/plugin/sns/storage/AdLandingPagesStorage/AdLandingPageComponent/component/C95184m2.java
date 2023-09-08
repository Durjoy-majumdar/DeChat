package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import fm0.C86937f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kg3.C76577a;
import lu3.C88656g;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101288r0;
import rs2.C101460a;
import rs2.C101461b;
import rs2.C101462c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m2 */
public class C95184m2 extends C95295z {

    /* renamed from: w */
    public static final int f276233w = Color.parseColor("#26eae9e2");

    /* renamed from: s */
    public RadarChart f276234s;

    /* renamed from: t */
    public Bitmap f276235t;

    /* renamed from: u */
    public Bitmap f276236u;

    /* renamed from: v */
    public CountDownLatch f276237v = new CountDownLatch(2);

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m2$a */
    public class C95185a implements C88656g {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m2$a$a */
        public class C95186a implements Runnable {
            public C95186a() {
            }

            public void run() {
                String str;
                StringBuilder sb;
                AbsoluteSizeSpan absoluteSizeSpan;
                ForegroundColorSpan foregroundColorSpan;
                String str2;
                String str3;
                Iterator it;
                String str4 = "run";
                String str5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$1$1";
                SnsMethodCalculate.markStartTimeMs(str4, str5);
                C95184m2 m2Var = C95184m2.this;
                int i = C95184m2.f276233w;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                Bitmap bitmap = m2Var.f276235t;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                C95184m2 m2Var2 = C95184m2.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                Bitmap bitmap2 = m2Var2.f276236u;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                String str6 = "access$300";
                SnsMethodCalculate.markStartTimeMs(str6, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                SnsMethodCalculate.markStartTimeMs("drawChart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                C101288r0 r0Var = (C101288r0) m2Var.mo131856q();
                RadarChart radarChart = m2Var.f276234s;
                radarChart.getClass();
                SnsMethodCalculate.markStartTimeMs("clearData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
                radarChart.f275762n = 0;
                radarChart.f275764p = null;
                radarChart.f275756e = null;
                SnsMethodCalculate.markEndTimeMs("clearData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
                m2Var.f276234s.setLatitudeNum(5);
                C101462c cVar = new C101462c();
                SnsMethodCalculate.markStartTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297143a = 0;
                SnsMethodCalculate.markEndTimeMs("setGridChartType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                int parseColor = Color.parseColor(r0Var.f296716B);
                SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297144b = 1442840575 & parseColor;
                SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                int i2 = C95184m2.f276233w;
                SnsMethodCalculate.markStartTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297145c = i2;
                SnsMethodCalculate.markEndTimeMs("setGridBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297149g = 1.0f;
                SnsMethodCalculate.markEndTimeMs("setGridBorderStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setBackgroundImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297159q = bitmap2;
                SnsMethodCalculate.markEndTimeMs("setBackgroundImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297146d = i2;
                SnsMethodCalculate.markEndTimeMs("setGridLatitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297147e = i2;
                SnsMethodCalculate.markEndTimeMs("setGridLongitudeColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297148f = (float) C76577a.m92151b(m2Var.f276579d, 1);
                SnsMethodCalculate.markEndTimeMs("setGridStrokeWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297150h = -1;
                SnsMethodCalculate.markEndTimeMs("setGridLabelColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297152j = 30.0f;
                SnsMethodCalculate.markEndTimeMs("setGridLabelPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297151i = 40.0f;
                SnsMethodCalculate.markEndTimeMs("setGridLabelSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297155m = bitmap;
                SnsMethodCalculate.markEndTimeMs("setBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                float f = r0Var.f296715A;
                SnsMethodCalculate.markStartTimeMs("setBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297156n = f;
                SnsMethodCalculate.markEndTimeMs("setBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                int parseColor2 = Color.parseColor("#7feae9e2");
                SnsMethodCalculate.markStartTimeMs("setGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297157o = parseColor2;
                SnsMethodCalculate.markEndTimeMs("setGridDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                int b = C76577a.m92151b(m2Var.f276579d, 1);
                SnsMethodCalculate.markStartTimeMs("setGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                cVar.f297158p = b;
                SnsMethodCalculate.markEndTimeMs("setGridDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
                m2Var.f276234s.setGridStyle(cVar);
                C101461b bVar = new C101461b();
                SnsMethodCalculate.markStartTimeMs("setLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                bVar.f297137a = i2;
                SnsMethodCalculate.markEndTimeMs("setLayerBorderColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                bVar.f297138b = 1.0f;
                SnsMethodCalculate.markEndTimeMs("setLayerBorderWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setLayerFillColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                bVar.f297139c = parseColor & Integer.MAX_VALUE;
                SnsMethodCalculate.markEndTimeMs("setLayerFillColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                SnsMethodCalculate.markStartTimeMs("setLayerFillAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                bVar.f297140d = 127;
                SnsMethodCalculate.markEndTimeMs("setLayerFillAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                int parseColor3 = Color.parseColor("#00fcff");
                SnsMethodCalculate.markStartTimeMs("setLayerDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                bVar.f297141e = parseColor3;
                SnsMethodCalculate.markEndTimeMs("setLayerDotColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                int b2 = C76577a.m92151b(m2Var.f276579d, 2);
                SnsMethodCalculate.markStartTimeMs("setLayerDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                bVar.f297142f = b2;
                SnsMethodCalculate.markEndTimeMs("setLayerDotRadius", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.DataLayerStyle");
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(r0Var.f296717C);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(r0Var.f296719E);
                AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(r0Var.f296718D);
                AbsoluteSizeSpan absoluteSizeSpan3 = new AbsoluteSizeSpan(r0Var.f296720F);
                C101460a aVar = new C101460a(bVar);
                StringBuilder sb4 = new StringBuilder();
                Iterator it4 = ((ArrayList) r0Var.f296722H).iterator();
                while (it4.hasNext()) {
                    C101288r0.C101289a aVar2 = (C101288r0.C101289a) it4.next();
                    if (aVar2 != null) {
                        it = it4;
                        sb4.delete(0, sb4.length());
                        sb4.append(aVar2.f296724a);
                        sb4.append(XVFSFile.PATH_SEPARATOR);
                        sb4.append(aVar2.f296725b);
                        SpannableString spannableString = new SpannableString(sb4.toString());
                        int length = aVar2.f296724a.length() + 1;
                        str3 = str4;
                        str2 = str5;
                        Object[] objArr = {foregroundColorSpan2, absoluteSizeSpan2};
                        SnsMethodCalculate.markStartTimeMs("setSapn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                        foregroundColorSpan = foregroundColorSpan2;
                        absoluteSizeSpan = absoluteSizeSpan2;
                        int i3 = 0;
                        while (i3 < 2) {
                            spannableString.setSpan(objArr[i3], 0, length, 18);
                            i3++;
                            objArr = objArr;
                            str6 = str6;
                        }
                        str = str6;
                        SnsMethodCalculate.markEndTimeMs("setSapn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                        int length2 = aVar2.f296724a.length() + 1;
                        int length3 = sb4.length();
                        Object[] objArr2 = {foregroundColorSpan3, absoluteSizeSpan3};
                        SnsMethodCalculate.markStartTimeMs("setSapn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                        int i4 = 0;
                        for (int i5 = 2; i4 < i5; i5 = 2) {
                            spannableString.setSpan(objArr2[i4], length2, length3, 18);
                            i4++;
                            sb4 = sb4;
                        }
                        sb = sb4;
                        SnsMethodCalculate.markEndTimeMs("setSapn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                        aVar.put(spannableString, Float.valueOf(aVar2.f296726c));
                    } else {
                        sb = sb4;
                        foregroundColorSpan = foregroundColorSpan2;
                        str3 = str4;
                        str2 = str5;
                        str = str6;
                        it = it4;
                        absoluteSizeSpan = absoluteSizeSpan2;
                    }
                    it4 = it;
                    str4 = str3;
                    str5 = str2;
                    foregroundColorSpan2 = foregroundColorSpan;
                    absoluteSizeSpan2 = absoluteSizeSpan;
                    sb4 = sb;
                    str6 = str;
                }
                String str7 = str4;
                String str8 = str5;
                String str9 = str6;
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                try {
                    m2Var.f276234s.setData((C101460a[]) arrayList.toArray(new C101460a[arrayList.size()]));
                } catch (Exception e) {
                    Log.getStackTraceString(e);
                }
                RadarChart radarChart2 = m2Var.f276234s;
                radarChart2.getClass();
                SnsMethodCalculate.markStartTimeMs("simultaneousLayersAllowed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
                radarChart2.f275761j = 2;
                SnsMethodCalculate.markEndTimeMs("simultaneousLayersAllowed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart");
                SnsMethodCalculate.markEndTimeMs("drawChart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                SnsMethodCalculate.markEndTimeMs(str9, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                SnsMethodCalculate.markEndTimeMs(str7, str8);
            }
        }

        public C95185a() {
        }

        public String getKey() {
            SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$1");
            SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$1");
            return "AdlandingRadarComp";
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$1");
            try {
                C95184m2.m121116E(C95184m2.this).await();
            } catch (InterruptedException unused) {
            }
            C95184m2 m2Var = C95184m2.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
            Bitmap bitmap = m2Var.f276235t;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
            if (bitmap != null) {
                C95184m2 m2Var2 = C95184m2.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                Bitmap bitmap2 = m2Var2.f276236u;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                if (bitmap2 != null) {
                    C95184m2.this.f276586n.post(new C95186a());
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m2$b */
    public class C95187b implements C100880k.C100881a {
        public C95187b() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$2");
            C95184m2 m2Var = C95184m2.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
            m2Var.f276235t = null;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
            C95184m2.m121116E(C95184m2.this).countDown();
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$2");
            try {
                Bitmap decodeFile = BitmapUtil.decodeFile(str);
                C95184m2 m2Var = C95184m2.this;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                m2Var.f276235t = decodeFile;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                C95184m2.m121116E(C95184m2.this).countDown();
            } catch (Exception e) {
                com.tencent.p014mm.sdk.platformtools.Log.m105920e("AdlandingRadarChartComp", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m2$c */
    public class C95188c implements C100880k.C100881a {
        public C95188c() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$3");
            C95184m2 m2Var = C95184m2.this;
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
            m2Var.f276236u = null;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
            C95184m2.m121116E(C95184m2.this).countDown();
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$3");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$3");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$3");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$3");
            try {
                C95184m2 m2Var = C95184m2.this;
                Bitmap decodeFile = BitmapUtil.decodeFile(str);
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                m2Var.f276236u = decodeFile;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
                C95184m2.m121116E(C95184m2.this).countDown();
            } catch (Exception e) {
                com.tencent.p014mm.sdk.platformtools.Log.m105920e("AdlandingRadarChartComp", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp$3");
        }
    }

    public C95184m2(Context context, C101288r0 r0Var, ViewGroup viewGroup) {
        super(context, r0Var, viewGroup);
    }

    /* renamed from: E */
    public static /* synthetic */ CountDownLatch m121116E(C95184m2 m2Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        CountDownLatch countDownLatch = m2Var.f276237v;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        return countDownLatch;
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        super.mo67235C();
        this.f276237v.countDown();
        this.f276237v.countDown();
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        this.f276234s = (RadarChart) this.f276586n.findViewById(C0966R.C0970id.f357646b01);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        ((C119157j) C119157j.f356862d).mo183875f(new C95185a());
        C101288r0 r0Var = (C101288r0) mo131856q();
        if (r0Var != null) {
            C100891r.m132208c(r0Var.f296723z, false, r0Var.f296496b, 0, new C95187b());
            C100891r.m132208c(r0Var.f296721G, false, r0Var.f296496b, 0, new C95188c());
            mo118814y();
        } else {
            Log.wtf("AdlandingRadarChartComp", "null info");
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        return C0966R.C0971layout.c0y;
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdlandingRadarChartComp");
    }
}
