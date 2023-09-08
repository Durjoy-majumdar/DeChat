package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import org.json.JSONException;
import org.json.JSONObject;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101292t;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i1 */
public class C95113i1 extends C95295z implements SensorEventListener {

    /* renamed from: A */
    public float[] f276036A;

    /* renamed from: B */
    public boolean f276037B = true;

    /* renamed from: s */
    public SensorManager f276038s;

    /* renamed from: t */
    public ProgressBar f276039t;

    /* renamed from: u */
    public Sensor f276040u;

    /* renamed from: v */
    public Sensor f276041v;

    /* renamed from: w */
    public ImageView f276042w;

    /* renamed from: x */
    public int f276043x;

    /* renamed from: y */
    public HorizontalScrollView f276044y;

    /* renamed from: z */
    public float[] f276045z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i1$a */
    public class C95114a implements C100880k.C100881a {
        public C95114a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$1");
            C95113i1 i1Var = C95113i1.this;
            i1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            i1Var.f276039t.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$1");
            C95113i1 i1Var = C95113i1.this;
            i1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            i1Var.f276039t.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$1");
            try {
                C95113i1.this.mo131637G(BitmapUtil.decodeFile(str));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i1$b */
    public class C95115b implements Runnable {
        public C95115b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$2");
            int measuredWidth = C95113i1.this.f276042w.getMeasuredWidth();
            C95113i1 i1Var = C95113i1.this;
            int i = i1Var.f276588p;
            if (measuredWidth > i) {
                int i2 = (measuredWidth - i) / 2;
                i1Var.f276043x = i2;
                i1Var.f276044y.scrollBy(i2, 0);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent$2");
        }
    }

    public C95113i1(Context context, C101292t tVar, ViewGroup viewGroup) {
        super(context, tVar, viewGroup);
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        super.mo124360B();
        SnsMethodCalculate.markStartTimeMs("registerListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        this.f276038s.registerListener(this, this.f276040u, 1);
        this.f276038s.registerListener(this, this.f276041v, 1);
        SnsMethodCalculate.markEndTimeMs("registerListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        super.mo124361D();
        SnsMethodCalculate.markStartTimeMs("unregisterListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        this.f276038s.unregisterListener(this);
        SnsMethodCalculate.markEndTimeMs("unregisterListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    /* renamed from: E */
    public final C101292t mo131636E() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        C101292t tVar = (C101292t) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        return tVar;
    }

    /* renamed from: G */
    public void mo131637G(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (bitmap == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp is null!");
            SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        } else if (this.f276042w == null) {
            Log.m105920e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the imageView is null!");
            SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        } else if (bitmap.getHeight() == 0) {
            Log.m105920e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp.getHeight is 0!");
            SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        } else {
            this.f276039t.setVisibility(8);
            this.f276042w.setImageBitmap(bitmap);
            this.f276042w.post(new C95115b());
            if (bitmap.getHeight() != 0) {
                int i = this.f276589q;
                if (mo131636E().f296502h != 2.14748365E9f) {
                    i = (int) mo131636E().f296502h;
                }
                this.f276042w.setLayoutParams(new RelativeLayout.LayoutParams((bitmap.getWidth() * i) / bitmap.getHeight(), i));
            }
            SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        }
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        View view = this.f276586n;
        SensorManager sensorManager = (SensorManager) MMApplicationContext.getContext().getSystemService("sensor");
        this.f276038s = sensorManager;
        this.f276040u = sensorManager.getDefaultSensor(1);
        this.f276041v = this.f276038s.getDefaultSensor(2);
        this.f276044y = (HorizontalScrollView) view.findViewById(C0966R.C0970id.f5483gd);
        this.f276042w = (ImageView) view.findViewById(C0966R.C0970id.f5484ge);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.i89);
        this.f276039t = progressBar;
        progressBar.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (!C86013q1.m106450k(C100891r.m132217l("adId", mo131636E().f296734z))) {
            this.f276037B = false;
        }
        String str = mo131636E().f296734z;
        Bitmap h = C100891r.m132213h(str);
        if (h != null) {
            Log.m105924i("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "loaded cached image with  " + str);
            mo131637G(h);
        } else {
            SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            this.f276039t.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            C100891r.m132208c(str, false, mo131636E().f296496b, 0, new C95114a());
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        return C0966R.C0971layout.c0z;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (sensorEvent.sensor.getType() == 1) {
            this.f276045z = sensorEvent.values;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.f276036A = sensorEvent.values;
        }
        float[] fArr2 = this.f276045z;
        if (!(fArr2 == null || (fArr = this.f276036A) == null)) {
            float[] fArr3 = new float[9];
            if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
                float[] fArr4 = new float[3];
                SensorManager.getOrientation(fArr3, fArr4);
                float f = fArr4[2];
                int i = this.f276043x;
                if (i != 0) {
                    if (f > 10.0f) {
                        f = 10.0f;
                    }
                    if (f < -10.0f) {
                        f = -10.0f;
                    }
                    this.f276044y.scrollBy((int) ((((float) i) * f) / 10.0f), 0);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
    }

    /* renamed from: s */
    public boolean mo131640s() {
        SnsMethodCalculate.markStartTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (mo131853l() >= ((int) (((float) mo131855p().getHeight()) * 0.1f))) {
            SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        return false;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return false;
        }
        try {
            SnsMethodCalculate.markStartTimeMs("getSwapCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            SnsMethodCalculate.markEndTimeMs("getSwapCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            jSONObject.put("swipeCount", 0);
            if (!this.f276037B) {
                String mD5String = MD5Util.getMD5String(mo131636E().f296734z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("urlMd5", mD5String);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("imgUrlInfo", jSONObject2);
            }
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePanoramaImageComponent");
            return false;
        }
    }
}
