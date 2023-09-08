package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;
import zs2.C112685b;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b */
public class C106164b implements GLTextureView.C115748n {

    /* renamed from: a */
    public Context f316277a;

    /* renamed from: b */
    public int f316278b;

    /* renamed from: c */
    public int f316279c;

    /* renamed from: d */
    public int f316280d;

    /* renamed from: e */
    public int f316281e;

    /* renamed from: f */
    public final float[] f316282f = new float[16];

    /* renamed from: g */
    public int f316283g;

    /* renamed from: h */
    public FloatBuffer f316284h;

    /* renamed from: i */
    public FloatBuffer f316285i;

    /* renamed from: j */
    public int f316286j;

    /* renamed from: k */
    public float f316287k = 0.0f;

    /* renamed from: l */
    public float f316288l = 90.0f;

    /* renamed from: m */
    public final float[] f316289m = new float[16];

    /* renamed from: n */
    public final float[] f316290n = new float[16];

    /* renamed from: o */
    public float f316291o = 1.0f;

    /* renamed from: p */
    public float f316292p = 20.0f;

    /* renamed from: q */
    public float f316293q = 0.0f;

    public C106164b(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f316277a = context;
        String str5 = "SphereImageView.SphereRender";
        String str6 = APMidasPluginInfo.LAUNCH_INTERFACE_INIT;
        String str7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender";
        SnsMethodCalculate.markStartTimeMs(str6, str7);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            int i = 50;
            float f = (float) 50;
            double d = 6.283185307179586d / ((double) f);
            double d2 = (double) (1.0f / f);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            while (i2 < i) {
                int i3 = 0;
                while (i3 < i) {
                    str = str6;
                    str2 = str7;
                    double d3 = (double) i2;
                    int i4 = i2;
                    float f2 = (float) (d3 * d2);
                    long j = currentTimeMillis;
                    double d4 = (double) i3;
                    String str8 = str5;
                    float f3 = (float) (d4 * d2);
                    double d5 = d4;
                    double d6 = (double) (i4 + 1);
                    double d7 = d3;
                    float f4 = (float) (d6 * d2);
                    int i5 = i3 + 1;
                    double d8 = (double) i5;
                    str4 = str8;
                    int i6 = i5;
                    float f5 = (float) (d8 * d2);
                    try {
                        arrayList2.add(Float.valueOf(f3));
                        arrayList2.add(Float.valueOf(f2));
                        arrayList2.add(Float.valueOf(f3));
                        arrayList2.add(Float.valueOf(f4));
                        arrayList2.add(Float.valueOf(f5));
                        arrayList2.add(Float.valueOf(f4));
                        arrayList2.add(Float.valueOf(f5));
                        arrayList2.add(Float.valueOf(f4));
                        arrayList2.add(Float.valueOf(f5));
                        arrayList2.add(Float.valueOf(f2));
                        arrayList2.add(Float.valueOf(f3));
                        arrayList2.add(Float.valueOf(f2));
                        double d9 = (d7 * d) / 2.0d;
                        double d15 = d5 * d;
                        double d16 = d2;
                        float sin = (float) (Math.sin(d9) * Math.cos(d15));
                        float sin2 = (float) (Math.sin(d9) * Math.sin(d15));
                        float cos = (float) Math.cos(d9);
                        double d17 = (d6 * d) / 2.0d;
                        float sin3 = (float) (Math.sin(d17) * Math.sin(d15));
                        double d18 = d8 * d;
                        float sin4 = (float) (Math.sin(d17) * Math.cos(d18));
                        float cos2 = (float) Math.cos(d17);
                        float sin5 = (float) (Math.sin(d17) * Math.sin(d18));
                        double sin6 = Math.sin(d9);
                        arrayList.add(Float.valueOf(sin));
                        arrayList.add(Float.valueOf(cos));
                        arrayList.add(Float.valueOf(sin2));
                        arrayList.add(Float.valueOf((float) (Math.sin(d17) * Math.cos(d15))));
                        arrayList.add(Float.valueOf((float) Math.cos(d17)));
                        arrayList.add(Float.valueOf(sin3));
                        arrayList.add(Float.valueOf(sin4));
                        arrayList.add(Float.valueOf(cos2));
                        arrayList.add(Float.valueOf(sin5));
                        arrayList.add(Float.valueOf(sin4));
                        arrayList.add(Float.valueOf(cos2));
                        arrayList.add(Float.valueOf(sin5));
                        arrayList.add(Float.valueOf((float) (Math.sin(d9) * Math.cos(d18))));
                        arrayList.add(Float.valueOf((float) Math.cos(d9)));
                        arrayList.add(Float.valueOf((float) (Math.sin(d18) * sin6)));
                        arrayList.add(Float.valueOf(sin));
                        arrayList.add(Float.valueOf(cos));
                        arrayList.add(Float.valueOf(sin2));
                        str6 = str;
                        str7 = str2;
                        i2 = i4;
                        currentTimeMillis = j;
                        str5 = str4;
                        i3 = i6;
                        d2 = d16;
                        d = d;
                        i = 50;
                    } catch (Throwable th) {
                        th = th;
                        str3 = str4;
                        Log.m105920e(str3, "init, exp:" + th.toString());
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                    }
                }
                String str9 = str5;
                String str10 = str6;
                String str11 = str7;
                long j2 = currentTimeMillis;
                double d19 = d;
                double d25 = d2;
                i2++;
                i = 50;
            }
            str4 = str5;
            str = str6;
            str2 = str7;
            long j3 = currentTimeMillis;
            int size = arrayList.size() / 3;
            try {
                this.f316283g = size;
                int i7 = size * 2;
                float[] fArr = new float[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    fArr[i8] = ((Float) arrayList2.get(i8)).floatValue();
                }
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i7 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f316285i = asFloatBuffer;
                asFloatBuffer.put(fArr);
                this.f316285i.position(0);
                int i9 = this.f316283g * 3;
                float[] fArr2 = new float[i9];
                for (int i15 = 0; i15 < i9; i15++) {
                    fArr2[i15] = ((Float) arrayList.get(i15)).floatValue();
                }
                FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(i9 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f316284h = asFloatBuffer2;
                asFloatBuffer2.put(fArr2);
                this.f316284h.position(0);
                str3 = str4;
                try {
                    Log.m105924i(str3, "init, timeCost=" + (System.currentTimeMillis() - j3));
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                str3 = str4;
                Log.m105920e(str3, "init, exp:" + th.toString());
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        } catch (Throwable th6) {
            th = th6;
            str = str6;
            str2 = str7;
            String str12 = str5;
            str3 = str12;
            Log.m105920e(str3, "init, exp:" + th.toString());
            SnsMethodCalculate.markEndTimeMs(str, str2);
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: a */
    public void mo151984a(GL10 gl10) {
        SnsMethodCalculate.markStartTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            Matrix.rotateM(this.f316289m, 0, -this.f316287k, 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.f316289m, 0, -this.f316288l, 0.0f, 1.0f, 0.0f);
            Matrix.rotateM(this.f316289m, 0, -0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f316286j);
            int i = this.f316280d;
            SnsMethodCalculate.markStartTimeMs("getfinalMVPMatrix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            Matrix.multiplyMM(this.f316290n, 0, this.f316282f, 0, this.f316289m, 0);
            Matrix.setIdentityM(this.f316289m, 0);
            float[] fArr = this.f316290n;
            SnsMethodCalculate.markEndTimeMs("getfinalMVPMatrix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
            GLES20.glDrawArrays(4, 0, this.f316283g);
        } catch (Throwable th) {
            Log.m105918d("SphereImageView.SphereRender", "onDrawFrame, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDrawFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
    }

    /* renamed from: b */
    public void mo151985b(GL10 gl10, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            Log.m105924i("SphereImageView.SphereRender", "onSurfaceChanged, w=" + i3 + ", h=" + i4 + "， textureID=" + this.f316286j + ", near=" + this.f316291o + ", far=" + this.f316292p + ", z=" + this.f316293q);
            long currentTimeMillis = System.currentTimeMillis();
            if (i4 == 0) {
                SnsMethodCalculate.markEndTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
                return;
            }
            GLES20.glViewport(0, 0, i3, i4);
            GLES20.glEnable(2884);
            float f = ((float) i3) / ((float) i4);
            Matrix.frustumM(this.f316282f, 0, -f, f, -1.0f, 1.0f, this.f316291o, this.f316292p);
            Matrix.setIdentityM(this.f316289m, 0);
            Matrix.setIdentityM(this.f316290n, 0);
            Matrix.translateM(this.f316282f, 0, 0.0f, 0.0f, this.f316293q);
            Matrix.scaleM(this.f316282f, 0, 4.0f, 4.0f, 4.0f);
            int a = C112685b.m154068a(this.f316277a);
            this.f316278b = a;
            GLES20.glUseProgram(a);
            this.f316279c = GLES20.glGetAttribLocation(this.f316278b, "aPosition");
            this.f316280d = GLES20.glGetUniformLocation(this.f316278b, "uProjectMatrix");
            this.f316281e = GLES20.glGetAttribLocation(this.f316278b, "aTextureCoord");
            Log.m105924i("SphereImageView.SphereRender", "aPosition:" + this.f316279c);
            Log.m105924i("SphereImageView.SphereRender", "uProjectMatrix:" + this.f316280d);
            Log.m105924i("SphereImageView.SphereRender", "aTextureCoord:" + this.f316281e);
            GLES20.glVertexAttribPointer(this.f316279c, 3, 5126, false, 0, this.f316284h);
            GLES20.glVertexAttribPointer(this.f316281e, 2, 5126, false, 0, this.f316285i);
            GLES20.glEnableVertexAttribArray(this.f316279c);
            GLES20.glEnableVertexAttribArray(this.f316281e);
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m105924i("SphereImageView.SphereRender", "onSurfaceChanged, timeCost=" + (currentTimeMillis2 - currentTimeMillis));
            SnsMethodCalculate.markEndTimeMs("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        } catch (Throwable th) {
            Log.m105920e("SphereImageView.SphereRender", "onSurfaceChanged, exp=" + th.toString());
        }
    }
}
