package com.tencent.liteav.videoproducer.capture;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoproducer.capture.CaptureSourceInterface;
import java.util.Locale;
import java.util.Objects;

public final class VirtualCamera extends C17417ar {

    /* renamed from: f */
    public PixelFrame f47216f;

    /* renamed from: g */
    private C113473t f47217g;

    /* renamed from: h */
    private VirtualCameraParams f47218h;

    /* renamed from: i */
    private boolean f47219i = true;

    /* renamed from: j */
    private boolean f47220j = false;

    /* renamed from: k */
    private final C113473t.C113474a f47221k = new C113473t.C113474a() {
        /* renamed from: a_ */
        public final void mo20405a_() {
            VirtualCamera virtualCamera = VirtualCamera.this;
            CaptureSourceInterface.C17399a aVar = virtualCamera.f47269d;
            if (aVar != null && virtualCamera.mo20575c()) {
                PixelFrame pixelFrame = VirtualCamera.this.f47216f;
                if (pixelFrame != null) {
                    pixelFrame.setTimestamp(TimeUtil.m16909a());
                }
                VirtualCamera virtualCamera2 = VirtualCamera.this;
                aVar.mo20532a(virtualCamera2, virtualCamera2.f47216f);
            }
        }
    };

    public static class VirtualCameraParams extends CaptureSourceInterface.CaptureParams {

        /* renamed from: a */
        public Bitmap f47223a;

        public VirtualCameraParams() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof VirtualCameraParams)) {
                return false;
            }
            return super.equals(obj) && Objects.equals(this.f47223a, ((VirtualCameraParams) obj).f47223a);
        }

        public String toString() {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[4];
            int i = 0;
            objArr[0] = super.toString();
            objArr[1] = Boolean.valueOf(this.f47223a != null);
            Bitmap bitmap = this.f47223a;
            objArr[2] = Integer.valueOf(bitmap != null ? bitmap.getWidth() : 0);
            Bitmap bitmap2 = this.f47223a;
            if (bitmap2 != null) {
                i = bitmap2.getHeight();
            }
            objArr[3] = Integer.valueOf(i);
            return String.format(locale, "%s, hasBitmap:%b, w*h:%d*%d", objArr);
        }

        public VirtualCameraParams(VirtualCameraParams virtualCameraParams) {
            super(virtualCameraParams);
            this.f47223a = virtualCameraParams.f47223a;
        }
    }

    public VirtualCamera(Looper looper, IVideoReporter iVideoReporter) {
        super(looper, iVideoReporter);
    }

    /* renamed from: e */
    private void m17426e() {
        LiteavLog.m16901i("VirtualCameraImpl", "Stop virtual camera");
        C113473t tVar = this.f47217g;
        if (tVar != null) {
            tVar.mo169973a();
            this.f47217g = null;
        }
        PixelFrame pixelFrame = this.f47216f;
        if (pixelFrame != null) {
            OpenGlUtils.deleteTexture(pixelFrame.getTextureId());
            this.f47216f = null;
        }
        this.f47219i = true;
    }

    /* renamed from: a */
    public final void mo20537a(CaptureSourceInterface.CaptureParams captureParams) {
        this.f47218h = new VirtualCameraParams((VirtualCameraParams) captureParams);
        m17425a();
        IVideoReporter iVideoReporter = this.f47267b;
        C17263h.C17269b bVar = C17263h.C17269b.EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_START_SUCCESS;
        iVideoReporter.notifyEvent(bVar, "Start virtual camera success params:" + this.f47218h, new Object[0]);
    }

    /* renamed from: b */
    public final void mo20540b() {
        m17426e();
        this.f47220j = false;
        this.f47267b.notifyEvent(C17263h.C17269b.EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_STOP_SUCCESS, "Stop virtual camera success", new Object[0]);
    }

    public final void pause() {
        m17426e();
    }

    public final void resume() {
        m17425a();
        if (this.f47220j) {
            this.f47220j = false;
            IVideoReporter iVideoReporter = this.f47267b;
            C17263h.C17269b bVar = C17263h.C17269b.EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_SIZE_CHANGE_SUCCESS;
            iVideoReporter.notifyEvent(bVar, "Start virtual camera success params:" + this.f47218h, new Object[0]);
        }
    }

    public final void updateParams(CaptureSourceInterface.CaptureParams captureParams) {
        this.f47218h = new VirtualCameraParams((VirtualCameraParams) captureParams);
        if (this.f47219i) {
            this.f47220j = true;
            return;
        }
        m17426e();
        m17425a();
        IVideoReporter iVideoReporter = this.f47267b;
        C17263h.C17269b bVar = C17263h.C17269b.EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_SIZE_CHANGE_SUCCESS;
        iVideoReporter.notifyEvent(bVar, "Start virtual camera success params:" + this.f47218h, new Object[0]);
    }

    /* renamed from: a */
    private void m17425a() {
        if (this.f47268c == null) {
            LiteavLog.m16898e("VirtualCameraImpl", "Start virtual camera, mEGLCore is null!");
        } else if (!this.f47219i) {
            LiteavLog.m16898e("VirtualCameraImpl", "virtual camera is started.");
        } else {
            this.f47219i = false;
            VirtualCameraParams virtualCameraParams = this.f47218h;
            Bitmap bitmap = virtualCameraParams.f47223a;
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(virtualCameraParams.f47184c, virtualCameraParams.f47185d, Bitmap.Config.ARGB_8888);
                new Canvas(bitmap).drawARGB(255, 0, 0, 0);
            } else if (bitmap.getWidth() % 2 == 1 || bitmap.getHeight() % 2 == 1) {
                Bitmap createBitmap = Bitmap.createBitmap((bitmap.getWidth() / 2) * 2, (bitmap.getHeight() / 2) * 2, bitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap = createBitmap;
            }
            LiteavLog.m16901i("VirtualCameraImpl", "Start virtual camera, bitmap:" + bitmap.getWidth() + "x" + bitmap.getHeight());
            PixelFrame pixelFrame = new PixelFrame();
            this.f47216f = pixelFrame;
            pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.TEXTURE_2D);
            this.f47216f.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
            this.f47216f.setWidth(bitmap.getWidth());
            this.f47216f.setHeight(bitmap.getHeight());
            this.f47216f.setGLContext(this.f47268c.mo147198c());
            this.f47216f.setTextureId(OpenGlUtils.loadTexture(bitmap, -1, false));
            if (bitmap != this.f47218h.f47223a) {
                bitmap.recycle();
            }
            C113473t tVar = new C113473t(this.f47266a.getLooper(), this.f47221k);
            this.f47217g = tVar;
            tVar.mo169974a(0, 1000 / this.f47218h.f47183b);
        }
    }
}
