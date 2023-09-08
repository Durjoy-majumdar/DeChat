package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p156gj.C87203t;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView */
public class C115750SphereImageView extends GLTextureView {

    /* renamed from: x0 */
    public static final /* synthetic */ int f347246x0 = 0;

    /* renamed from: A */
    public float[] f347247A = new float[3];

    /* renamed from: B */
    public GestureDetector f347248B;

    /* renamed from: C */
    public float f347249C = 0.4f;

    /* renamed from: D */
    public long f347250D = 0;

    /* renamed from: E */
    public boolean f347251E = true;

    /* renamed from: F */
    public float f347252F;

    /* renamed from: G */
    public boolean f347253G = false;

    /* renamed from: H */
    public C115753d f347254H;

    /* renamed from: I */
    public int f347255I;

    /* renamed from: J */
    public Handler f347256J = new C115751a();

    /* renamed from: K */
    public int f347257K;

    /* renamed from: L */
    public int f347258L;

    /* renamed from: M */
    public boolean f347259M = true;

    /* renamed from: N */
    public boolean f347260N = false;

    /* renamed from: P */
    public boolean f347261P = false;

    /* renamed from: Q */
    public GestureDetector.OnGestureListener f347262Q = new C71196b();

    /* renamed from: R */
    public View.OnClickListener f347263R;

    /* renamed from: S */
    public View.OnLongClickListener f347264S;

    /* renamed from: T */
    public Bitmap f347265T = null;

    /* renamed from: U */
    public boolean f347266U = false;

    /* renamed from: V */
    public String f347267V = "";

    /* renamed from: W */
    public TextureView.SurfaceTextureListener f347268W = new C115752c();

    /* renamed from: p0 */
    public C115754e f347269p0;

    /* renamed from: s */
    public Context f347270s;

    /* renamed from: t */
    public float f347271t;

    /* renamed from: u */
    public float f347272u;

    /* renamed from: v */
    public float f347273v;

    /* renamed from: w */
    public float f347274w;

    /* renamed from: x */
    public C106164b f347275x;

    /* renamed from: y */
    public SensorManager f347276y;

    /* renamed from: z */
    public Sensor f347277z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$b */
    public class C71196b implements GestureDetector.OnGestureListener {
        public C71196b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/SphereImageView/SphereImageView$2", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            C115750SphereImageView sphereImageView = C115750SphereImageView.this;
            View.OnLongClickListener onLongClickListener = sphereImageView.f347264S;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(sphereImageView);
                Log.m105924i("SphereImageView.SphereView", "onLongPress, hash=" + hashCode());
            }
            SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/SphereImageView/SphereImageView$2", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
            SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/SphereImageView/SphereImageView$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            C115750SphereImageView sphereImageView = C115750SphereImageView.this;
            View.OnClickListener onClickListener = sphereImageView.f347263R;
            if (onClickListener != null) {
                onClickListener.onClick(sphereImageView);
                Log.m105924i("SphereImageView.SphereView", "onClick, hash=" + hashCode());
            }
            SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$2");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/SphereImageView/SphereImageView$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$a */
    public class C115751a extends Handler {
        public C115751a() {
        }

        public void handleMessage(Message message) {
            C115754e eVar;
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$1");
            if (message.what == 1) {
                C115755f fVar = (C115755f) message.obj;
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getSensorY", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                float f = fVar.f347284b;
                SnsMethodCalculate.markEndTimeMs("getSensorY", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                SnsMethodCalculate.markStartTimeMs("getSensorX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                float f2 = fVar.f347283a;
                SnsMethodCalculate.markEndTimeMs("getSensorX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                C115750SphereImageView sphereImageView = C115750SphereImageView.this;
                int i = C115750SphereImageView.f347246x0;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                float f3 = sphereImageView.f347271t;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                float f4 = f - f3;
                C115750SphereImageView sphereImageView2 = C115750SphereImageView.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                float f5 = sphereImageView2.f347273v;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                float f6 = f2 - f5;
                C115750SphereImageView.m162797g(C115750SphereImageView.this).f316288l += f6 * 1.5f;
                C115750SphereImageView.m162797g(C115750SphereImageView.this).f316287k += (1.5f * f4) / 2.0f;
                if (C115750SphereImageView.m162797g(C115750SphereImageView.this).f316287k < -50.0f) {
                    C115750SphereImageView.m162797g(C115750SphereImageView.this).f316287k = -50.0f;
                } else if (C115750SphereImageView.m162797g(C115750SphereImageView.this).f316287k > 50.0f) {
                    C115750SphereImageView.m162797g(C115750SphereImageView.this).f316287k = 50.0f;
                }
                C115750SphereImageView sphereImageView3 = C115750SphereImageView.this;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                sphereImageView3.f347271t = f;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                C115750SphereImageView sphereImageView4 = C115750SphereImageView.this;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                sphereImageView4.f347273v = f2;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                if (Math.abs(f6) > 0.01f || Math.abs(f4) > 0.01f) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C115750SphereImageView.this.mo176044d();
                    if (Math.abs(f6) > 0.1f || Math.abs(f4) > 0.1f) {
                        C115750SphereImageView sphereImageView5 = C115750SphereImageView.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                        long j = sphereImageView5.f347250D;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                        if (currentTimeMillis - j > 500 && (eVar = C115750SphereImageView.this.f347269p0) != null) {
                            eVar.mo131840d();
                            C115750SphereImageView sphereImageView6 = C115750SphereImageView.this;
                            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                            sphereImageView6.f347250D = currentTimeMillis;
                            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$c */
    public class C115752c implements TextureView.SurfaceTextureListener {
        public C115752c() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
            Log.m105924i("SphereImageView.SphereView", "onSurfaceTextureAvailable, hasPendingImage=" + C115750SphereImageView.this.f347266U);
            C115750SphereImageView sphereImageView = C115750SphereImageView.this;
            if (sphereImageView.f347266U) {
                Bitmap bitmap = sphereImageView.f347265T;
                String str = sphereImageView.f347267V;
                SnsMethodCalculate.markStartTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                C115756a aVar = new C115756a(sphereImageView, bitmap, str);
                SnsMethodCalculate.markEndTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
                sphereImageView.mo176043c(aVar);
                C115750SphereImageView sphereImageView2 = C115750SphereImageView.this;
                sphereImageView2.f347265T = null;
                sphereImageView2.f347266U = false;
                sphereImageView2.f347267V = "";
            }
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$d */
    public static class C115753d implements SensorEventListener {

        /* renamed from: d */
        public long f347280d = 0;

        /* renamed from: e */
        public boolean f347281e = true;

        /* renamed from: f */
        public WeakReference<C115750SphereImageView> f347282f;

        public C115753d(C115750SphereImageView sphereImageView) {
            this.f347282f = new WeakReference<>(sphereImageView);
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
            SnsMethodCalculate.markStartTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
            SnsMethodCalculate.markEndTimeMs("onAccuracyChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            SnsMethodCalculate.markStartTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
            C115750SphereImageView sphereImageView = this.f347282f.get();
            if (sphereImageView == null) {
                SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
            } else if (Build.VERSION.SDK_INT >= 24 || this.f347281e) {
                if (sensorEvent.sensor.getType() == 4) {
                    if (this.f347280d != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        float f = ((float) (currentTimeMillis - this.f347280d)) / 1000.0f;
                        if (((double) f) < 0.012d) {
                            SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
                            return;
                        }
                        this.f347280d = currentTimeMillis;
                        float[] f2 = C115750SphereImageView.m162796f(sphereImageView);
                        f2[0] = f2[0] + (sensorEvent.values[0] * f);
                        float[] f3 = C115750SphereImageView.m162796f(sphereImageView);
                        f3[1] = f3[1] + (sensorEvent.values[1] * f);
                        float[] f4 = C115750SphereImageView.m162796f(sphereImageView);
                        f4[2] = f4[2] + (sensorEvent.values[2] * f);
                        float degrees = (float) Math.toDegrees((double) C115750SphereImageView.m162796f(sphereImageView)[0]);
                        Math.toDegrees((double) C115750SphereImageView.m162796f(sphereImageView)[2]);
                        C115755f fVar = new C115755f();
                        SnsMethodCalculate.markStartTimeMs("setSensorX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                        fVar.f347283a = (float) Math.toDegrees((double) C115750SphereImageView.m162796f(sphereImageView)[1]);
                        SnsMethodCalculate.markEndTimeMs("setSensorX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                        SnsMethodCalculate.markStartTimeMs("setSensorY", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                        fVar.f347284b = degrees;
                        SnsMethodCalculate.markEndTimeMs("setSensorY", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                        SnsMethodCalculate.markStartTimeMs("setSensorZ", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                        SnsMethodCalculate.markEndTimeMs("setSensorZ", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$SensorData");
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.obj = fVar;
                        sphereImageView.f347256J.sendMessage(obtain);
                    } else {
                        this.f347280d = System.currentTimeMillis();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
            } else {
                SnsMethodCalculate.markEndTimeMs("onSensorChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$GyroSensorEventListener");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$e */
    public interface C115754e {
        /* renamed from: a */
        void mo131837a();

        /* renamed from: b */
        void mo131838b(String str);

        /* renamed from: c */
        void mo131839c();

        /* renamed from: d */
        void mo131840d();

        void onDetachedFromWindow();
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$f */
    public static class C115755f {

        /* renamed from: a */
        public float f347283a;

        /* renamed from: b */
        public float f347284b;
    }

    public C115750SphereImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f347270s = context;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        setEGLContextClientVersion(2);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f347268W;
        SnsMethodCalculate.markStartTimeMs("addSurfaceTextureListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        ((ArrayList) this.f347205q).add(surfaceTextureListener);
        SnsMethodCalculate.markEndTimeMs("addSurfaceTextureListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        C106164b bVar = new C106164b(this.f347270s);
        this.f347275x = bVar;
        setRenderer(bVar);
        setRenderMode(0);
        SensorManager sensorManager = (SensorManager) this.f347270s.getSystemService("sensor");
        this.f347276y = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        this.f347277z = defaultSensor;
        if (defaultSensor == null) {
            Log.m105920e("SphereImageView.SphereView", "device has no Gyroscope sensor, model=" + C87203t.m108275k() + ", brand=" + Build.BRAND);
        } else {
            Log.m105924i("SphereImageView.SphereView", "has Gyroscope sensor, model=" + C87203t.m108275k() + ", brand=" + Build.BRAND + ", sensor=" + this.f347277z);
        }
        this.f347254H = new C115753d(this);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 4;
        this.f347255I = scaledTouchSlop;
        if (scaledTouchSlop < 4) {
            this.f347255I = 4;
        }
        this.f347248B = new GestureDetector(context, this.f347262Q);
        this.f347252F = context.getResources().getDisplayMetrics().density;
        Log.m105924i("SphereImageView.SphereView", "init, displayDensity=" + this.f347252F + ", apiLevel=" + Build.VERSION.SDK_INT + ", touchSlop=" + this.f347255I);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: f */
    public static /* synthetic */ float[] m162796f(C115750SphereImageView sphereImageView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        float[] fArr = sphereImageView.f347247A;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return fArr;
    }

    /* renamed from: g */
    public static /* synthetic */ C106164b m162797g(C115750SphereImageView sphereImageView) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        C106164b bVar = sphereImageView.f347275x;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return bVar;
    }

    public PointF getCurAngle() {
        SnsMethodCalculate.markStartTimeMs("getCurAngle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        PointF pointF = new PointF();
        C106164b bVar = this.f347275x;
        pointF.x = bVar.f316287k;
        pointF.y = bVar.f316288l;
        SnsMethodCalculate.markEndTimeMs("getCurAngle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return pointF;
    }

    /* renamed from: h */
    public float mo176085h(float f) {
        SnsMethodCalculate.markStartTimeMs("px2Angle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (this.f347252F == 0.0f) {
            this.f347252F = 3.0f;
            Log.m105920e("SphereImageView.SphereView", "px2Angle , mDisplayDensity==0");
        }
        float f2 = (f / this.f347252F) * this.f347249C;
        SnsMethodCalculate.markEndTimeMs("px2Angle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return f2;
    }

    /* renamed from: i */
    public void mo176086i(float f, float f2, float f3) {
        SnsMethodCalculate.markStartTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        C106164b bVar = this.f347275x;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        Log.m105924i("SphereImageView.SphereRender", "setScaleParams, near=" + f + ", far=" + f2 + ", z=" + f3);
        if (f >= f2 || f2 < 20.0f) {
            SnsMethodCalculate.markEndTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        } else {
            bVar.f316291o = f;
            bVar.f316292p = f2;
            bVar.f316293q = f3;
            SnsMethodCalculate.markEndTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        }
        SnsMethodCalculate.markEndTimeMs("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: j */
    public void mo176087j(Bitmap bitmap, String str) {
        SnsMethodCalculate.markStartTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        boolean isAvailable = isAvailable();
        Log.m105924i("SphereImageView.SphereView", "updateImage, isAvailable=" + isAvailable + ", hasPendingImage=" + this.f347266U);
        if (isAvailable) {
            this.f347265T = null;
            this.f347266U = false;
            this.f347267V = "";
            SnsMethodCalculate.markStartTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            C115756a aVar = new C115756a(this, bitmap, str);
            SnsMethodCalculate.markEndTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            mo176043c(aVar);
        } else {
            this.f347265T = bitmap;
            this.f347266U = true;
            this.f347267V = str;
        }
        SnsMethodCalculate.markEndTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: k */
    public void mo176088k() {
        SnsMethodCalculate.markStartTimeMs("zero", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        Log.m105924i("SphereImageView.SphereView", "zero, hash=" + hashCode());
        C106164b bVar = this.f347275x;
        bVar.f316288l = 90.0f;
        bVar.f316287k = 0.0f;
        SnsMethodCalculate.markEndTimeMs("zero", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        super.onAttachedToWindow();
        this.f347253G = false;
        Log.m105924i("SphereImageView.SphereView", "onAttachedToWindow, hash=" + hashCode() + ", apiLevel=" + Build.VERSION.SDK_INT);
        mo176088k();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        super.onDetachedFromWindow();
        this.f347253G = true;
        Log.m105924i("SphereImageView.SphereView", "onDetachedFromWindow, hash=" + hashCode());
        this.f347265T = null;
        this.f347266U = false;
        this.f347267V = "";
        setSensorEnabled(false);
        SnsMethodCalculate.markStartTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        C115756a aVar = new C115756a(this, (Bitmap) null, "");
        SnsMethodCalculate.markEndTimeMs("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        mo176043c(aVar);
        mo176088k();
        C115754e eVar = this.f347269p0;
        if (eVar != null) {
            eVar.onDetachedFromWindow();
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void onFinishTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onFinishTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (Build.VERSION.SDK_INT < 24) {
            Log.m105924i("SphereImageView.SphereView", "onFinishTemporaryDetach, hash=" + hashCode() + ", isAttach2Window=" + isAttachedToWindow());
            mo176088k();
            C115753d dVar = this.f347254H;
            dVar.f347280d = 0;
            dVar.f347281e = true;
        }
        SnsMethodCalculate.markEndTimeMs("onFinishTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void onStartTemporaryDetach() {
        SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (Build.VERSION.SDK_INT < 24) {
            Log.m105924i("SphereImageView.SphereView", "onStartTemporaryDetach, hash=" + hashCode() + ", isAttach2Window=" + isAttachedToWindow());
            mo176088k();
            C115753d dVar = this.f347254H;
            dVar.f347280d = 0;
            dVar.f347281e = false;
        }
        SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        if (r14 != 3) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "onTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.view.GestureDetector r10 = r13.f347248B
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r14)
            java.lang.Object[] r3 = r11.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/SphereImageView/SphereImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r7 = "android/view/GestureDetector_EXEC_"
            java.lang.String r8 = "onTouchEvent"
            java.lang.String r9 = "(Landroid/view/MotionEvent;)Z"
            r2 = r10
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r12 = 0
            java.lang.Object r2 = r11.mo10231a(r12)
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            boolean r3 = r10.onTouchEvent(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/widget/SphereImageView/SphereImageView"
            java.lang.String r5 = "onTouchEvent"
            java.lang.String r6 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r7 = "android/view/GestureDetector_EXEC_"
            java.lang.String r8 = "onTouchEvent"
            java.lang.String r9 = "(Landroid/view/MotionEvent;)Z"
            r2 = r10
            j20.C117292a.m165360f(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = r13.f347251E
            r3 = 1
            if (r2 == 0) goto L_0x012a
            float r2 = r14.getY()
            float r4 = r14.getX()
            android.view.ViewParent r5 = r13.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
            int r14 = r14.getAction()
            if (r14 == 0) goto L_0x010e
            if (r14 == r3) goto L_0x00fe
            r5 = 2
            if (r14 == r5) goto L_0x0069
            r5 = 3
            if (r14 == r5) goto L_0x00fe
            goto L_0x0123
        L_0x0069:
            float r14 = r13.f347272u
            float r14 = r2 - r14
            float r5 = r13.f347274w
            float r5 = r4 - r5
            boolean r6 = r13.f347261P
            if (r6 == 0) goto L_0x00d2
            boolean r6 = r13.f347259M
            if (r6 != 0) goto L_0x0088
            boolean r6 = r13.f347260N
            if (r6 == 0) goto L_0x0088
            android.view.ViewParent r14 = r13.getParent()
            r14.requestDisallowInterceptTouchEvent(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L_0x0088:
            boolean r6 = r13.f347260N
            if (r6 != 0) goto L_0x00d2
            int r6 = r13.f347258L
            float r7 = (float) r6
            float r7 = r2 - r7
            float r6 = (float) r6
            float r6 = r2 - r6
            float r7 = r7 * r6
            int r6 = r13.f347257K
            float r8 = (float) r6
            float r8 = r4 - r8
            float r6 = (float) r6
            float r6 = r4 - r6
            float r8 = r8 * r6
            float r7 = r7 + r8
            double r6 = (double) r7
            double r6 = java.lang.Math.sqrt(r6)
            int r6 = (int) r6
            int r7 = r13.f347255I
            if (r6 < r7) goto L_0x00d2
            r13.f347260N = r3
            int r6 = r13.f347258L
            float r6 = (float) r6
            float r6 = r2 - r6
            float r6 = java.lang.Math.abs(r6)
            int r7 = r13.f347257K
            float r7 = (float) r7
            float r7 = r4 - r7
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d0
            r13.f347259M = r12
            android.view.ViewParent r14 = r13.getParent()
            r14.requestDisallowInterceptTouchEvent(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L_0x00d0:
            r13.f347259M = r3
        L_0x00d2:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b r6 = r13.f347275x
            float r7 = r6.f316288l
            float r5 = r13.mo176085h(r5)
            float r7 = r7 + r5
            r6.f316288l = r7
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b r5 = r13.f347275x
            float r6 = r5.f316287k
            float r14 = r13.mo176085h(r14)
            float r6 = r6 + r14
            r5.f316287k = r6
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.b r14 = r13.f347275x
            float r5 = r14.f316287k
            r6 = -1035468800(0xffffffffc2480000, float:-50.0)
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f5
            r14.f316287k = r6
            goto L_0x0123
        L_0x00f5:
            r6 = 1112014848(0x42480000, float:50.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0123
            r14.f316287k = r6
            goto L_0x0123
        L_0x00fe:
            boolean r14 = r13.f347261P
            if (r14 == 0) goto L_0x0106
            r13.f347260N = r12
            r13.f347259M = r3
        L_0x0106:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$e r14 = r13.f347269p0
            if (r14 == 0) goto L_0x0123
            r14.mo131837a()
            goto L_0x0123
        L_0x010e:
            int r14 = (int) r4
            r13.f347257K = r14
            int r14 = (int) r2
            r13.f347258L = r14
            boolean r14 = r13.f347261P
            if (r14 == 0) goto L_0x011c
            r13.f347260N = r12
            r13.f347259M = r3
        L_0x011c:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$e r14 = r13.f347269p0
            if (r14 == 0) goto L_0x0123
            r14.mo131839c()
        L_0x0123:
            r13.f347272u = r2
            r13.f347274w = r4
            r13.mo176044d()
        L_0x012a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C115750SphereImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEventListener(C115754e eVar) {
        SnsMethodCalculate.markStartTimeMs("setEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.f347269p0 = eVar;
        SnsMethodCalculate.markEndTimeMs("setEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.f347263R = onClickListener;
        SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.f347264S = onLongClickListener;
        SnsMethodCalculate.markEndTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setOnlyHorizontalScroll(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setOnlyHorizontalScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.f347261P = z;
        SnsMethodCalculate.markEndTimeMs("setOnlyHorizontalScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setSensorEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (!z || !this.f347253G) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableSensor, enabled=");
            sb.append(z);
            sb.append(", hash=");
            sb.append(hashCode());
            sb.append(", hasSensor=");
            sb.append(this.f347277z != null);
            Log.m105924i("SphereImageView.SphereView", sb.toString());
            try {
                Sensor sensor = this.f347277z;
                if (sensor != null) {
                    if (z) {
                        C115753d dVar = this.f347254H;
                        dVar.f347280d = 0;
                        this.f347276y.registerListener(dVar, sensor, 0);
                    } else {
                        this.f347276y.unregisterListener(this.f347254H);
                        this.f347254H.f347280d = 0;
                    }
                }
            } catch (Exception e) {
                Log.m105920e("SphereImageView.SphereView", "setSensorEnabled exp:" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            return;
        }
        Log.m105920e("SphereImageView.SphereView", "setSensorEnabled when isDetachedFromWindow");
        SnsMethodCalculate.markEndTimeMs("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setTouchEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setTouchEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        Log.m105924i("SphereImageView.SphereView", "setTouchEnabled：" + z + ", hash=" + hashCode());
        this.f347251E = z;
        SnsMethodCalculate.markEndTimeMs("setTouchEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void setTouchSensitivity(float f) {
        SnsMethodCalculate.markStartTimeMs("setTouchSensitivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (f > 0.0f) {
            this.f347249C = f;
        }
        SnsMethodCalculate.markEndTimeMs("setTouchSensitivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }
}
