package ht3;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.tencent.stubs.logger.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: ht3.a */
public class C108258a implements C108267t {

    /* renamed from: a */
    public Camera f324139a;

    /* renamed from: b */
    public volatile boolean f324140b = false;

    /* renamed from: c */
    public volatile boolean f324141c = false;

    /* renamed from: d */
    public Point f324142d = null;

    /* renamed from: e */
    public Point f324143e = null;

    /* renamed from: f */
    public Point f324144f = null;

    /* renamed from: g */
    public float f324145g = 1.0f;

    /* renamed from: h */
    public boolean f324146h;

    /* renamed from: i */
    public int f324147i;

    /* renamed from: j */
    public boolean f324148j = false;

    /* renamed from: k */
    public int f324149k = -1;

    /* renamed from: l */
    public int f324150l;

    /* renamed from: m */
    public int f324151m;

    /* renamed from: n */
    public int f324152n;

    /* renamed from: o */
    public int f324153o = -1;

    /* renamed from: p */
    public String f324154p = "";

    /* renamed from: ht3.a$b */
    public static class C108260b implements Comparator<Camera.Size> {
        public C108260b(C108259a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    /* renamed from: a */
    public void mo158639a() {
        Log.m106505i("BaseScanCamera", "close(), previewing " + this.f324141c);
        if (this.f324139a != null) {
            this.f324140b = false;
            long currentTimeMillis = System.currentTimeMillis();
            this.f324139a.setPreviewCallback((Camera.PreviewCallback) null);
            this.f324139a.stopPreview();
            this.f324141c = false;
            Log.m106505i("BaseScanCamera", "stopPreview costTime " + (System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = System.currentTimeMillis();
            C117292a.m165363i(this.f324139a, "com/tencent/scanlib/camera/BaseScanCamera", "close", "()V", "android/hardware/Camera", "release", "()V");
            this.f324139a = null;
            Log.m106505i("BaseScanCamera", "camera.close() costTime " + (System.currentTimeMillis() - currentTimeMillis2));
        } else {
            Log.m106513w("BaseScanCamera", "close(), camera == null");
        }
        this.f324148j = false;
        this.f324149k = -1;
        this.f324146h = false;
        this.f324153o = -1;
    }

    /* renamed from: b */
    public final Point mo158640b(Point point) {
        Point point2 = point;
        Camera.Parameters parameters = this.f324139a.getParameters();
        String str = parameters.get("preview-size-values");
        if (str == null) {
            str = parameters.get("preview-size-value");
        }
        Point point3 = null;
        if (str != null) {
            Log.m106493d("BaseScanCamera", "preview-size-values parameter: " + str);
            ArrayList arrayList = new ArrayList(parameters.getSupportedPreviewSizes());
            Collections.sort(arrayList, new C108260b((C108259a) null));
            arrayList.remove(0);
            int i = point2.x;
            float f = ((float) i) / ((float) point2.y);
            int i2 = 2;
            Log.m106493d("BaseScanCamera", String.format("visible.x: %d, visible.y: %d, ratio: %f", new Object[]{Integer.valueOf(i), Integer.valueOf(point2.y), Float.valueOf(f)}));
            Log.m106505i("BaseScanCamera", String.format("SCREEN_PIXELS: %s", new Object[]{Integer.valueOf(point2.x * point2.y)}));
            Iterator it = arrayList.iterator();
            float f2 = Float.POSITIVE_INFINITY;
            while (true) {
                if (it.hasNext()) {
                    Camera.Size size = (Camera.Size) it.next();
                    int i3 = size.width;
                    int i4 = size.height;
                    Object[] objArr = new Object[i2];
                    objArr[0] = Integer.valueOf(i3);
                    objArr[1] = Integer.valueOf(i4);
                    Log.m106505i("BaseScanCamera", String.format("realWidth: %d, realHeight: %d", objArr));
                    int min = !this.f324146h ? i3 : Math.min(i3, i4);
                    int max = !this.f324146h ? i4 : Math.max(i3, i4);
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = Integer.valueOf(min);
                    objArr2[1] = Integer.valueOf(max);
                    Log.m106493d("BaseScanCamera", String.format("maybeFlippedWidth: %d, maybeFlippedHeight: %d", objArr2));
                    if (min == point2.x && max == point2.y) {
                        Point point4 = new Point(i3, i4);
                        Log.m106505i("BaseScanCamera", "Found preview size exactly matching screen size: " + point4);
                        point3 = point4;
                        break;
                    }
                    if (i3 * i4 >= 307200) {
                        float abs = Math.abs((((float) min) / ((float) max)) - f);
                        if (abs < f2) {
                            point3 = new Point(i3, i4);
                            f2 = abs;
                        }
                        Log.m106505i("BaseScanCamera", String.format("diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[]{Float.valueOf(f2), Float.valueOf(abs), Integer.valueOf(i3), Integer.valueOf(i4)}));
                    }
                    i2 = 2;
                } else {
                    if (point3 == null) {
                        Camera.Size previewSize = parameters.getPreviewSize();
                        point3 = new Point(previewSize.width, previewSize.height);
                        Log.m106505i("BaseScanCamera", "No suitable preview sizes, using default: " + point3);
                    }
                    Log.m106505i("BaseScanCamera", "Found best approximate preview size: " + point3);
                }
            }
        }
        return point3 == null ? new Point((point2.x >> 3) << 3, (point2.y >> 3) << 3) : point3;
    }

    /* renamed from: c */
    public int mo158641c() {
        Camera camera = this.f324139a;
        if (camera == null || camera.getParameters() == null || this.f324139a.getParameters().getZoomRatios() == null || this.f324139a.getParameters().getZoomRatios().size() <= 0) {
            return 100;
        }
        return this.f324139a.getParameters().getZoomRatios().get(this.f324150l).intValue();
    }

    /* renamed from: d */
    public String mo158642d(boolean z) {
        if (!z) {
            try {
                String str = this.f324154p;
                if (str != null && !str.isEmpty()) {
                    return this.f324154p;
                }
            } catch (Exception e) {
                this.f324154p = "";
                Log.m106513w("BaseScanCamera", "getFocusMode() " + e.getMessage());
            }
        }
        Camera camera = this.f324139a;
        if (camera != null) {
            String focusMode = camera.getParameters().getFocusMode();
            this.f324154p = focusMode;
            return focusMode;
        }
        return "";
    }

    /* renamed from: e */
    public final Point mo158643e(Point point) {
        float f;
        int i;
        float f2;
        if (this.f324146h) {
            Point point2 = this.f324143e;
            f = (((float) point2.x) * 1.0f) / ((float) point.y);
            f2 = ((float) point2.y) * 1.0f;
            i = point.x;
        } else {
            Point point3 = this.f324143e;
            f = (((float) point3.x) * 1.0f) / ((float) point.x);
            f2 = ((float) point3.y) * 1.0f;
            i = point.y;
        }
        this.f324145g = Math.max(f, f2 / ((float) i));
        float f3 = this.f324145g;
        return new Point((int) (((float) point.x) * f3), (int) (((float) point.y) * f3));
    }

    /* renamed from: f */
    public Point mo158644f(Point point) {
        Point point2 = this.f324144f;
        int i = point2.x;
        Point point3 = this.f324143e;
        int i2 = (i - point3.x) / 2;
        int i3 = (point2.y - point3.y) / 2;
        Point point4 = new Point(point.x + i2, point.y + i3);
        if (this.f324146h) {
            Point point5 = this.f324144f;
            int i4 = point5.y;
            Point point6 = this.f324143e;
            i2 = (i4 - point6.x) / 2;
            i3 = (point5.x - point6.y) / 2;
            point4 = new Point(point.y + i3, (this.f324143e.x - point.x) + i2);
        }
        Log.m106493d("BaseScanCamera", String.format("dx %d, dy %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        float f = this.f324145g;
        Point point7 = new Point((int) (((float) point4.x) / f), (int) (((float) point4.y) / f));
        Log.m106505i("BaseScanCamera", "viewPoint " + point + ", previewPoint " + point4 + ", scanPoint " + point7);
        return point7;
    }

    /* renamed from: g */
    public Rect mo158645g(Rect rect) {
        Rect rect2 = new Rect();
        Log.m106505i("BaseScanCamera", String.format("visibleResolution:%s, previewResolution:%s", new Object[]{this.f324143e, this.f324144f}));
        Point f = mo158644f(this.f324146h ? new Point(rect.right, rect.top) : new Point(rect.left, rect.top));
        Point f2 = mo158644f(this.f324146h ? new Point(rect.left, rect.bottom) : new Point(rect.right, rect.bottom));
        rect2.set(f.x, f.y, f2.x, f2.y);
        Log.m106505i("BaseScanCamera", String.format("uiRect %s, scanRect %s", new Object[]{rect, rect2}));
        return rect2;
    }

    /* renamed from: h */
    public boolean mo158646h(boolean z) {
        return "auto".equals(mo158642d(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        if ((r7.get(r1).intValue() - r8) > (r8 - r7.get(r2).intValue())) goto L_0x0087;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo158647i(java.util.List<java.lang.Integer> r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0088
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x0088
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            int r2 = r7.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "zoomRatios: %s,size: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "BaseScanCamera"
            com.tencent.stubs.logger.Log.m106505i(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            int r1 = java.util.Collections.binarySearch(r7, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "insert index: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.stubs.logger.Log.m106505i(r2, r4)
            if (r1 < 0) goto L_0x0044
        L_0x0042:
            r0 = r1
            goto L_0x0088
        L_0x0044:
            int r1 = r1 + 1
            int r1 = -r1
            int r2 = r1 + -1
            if (r1 < 0) goto L_0x0074
            int r4 = r7.size()
            int r4 = r4 - r3
            if (r1 > r4) goto L_0x0074
            if (r2 < 0) goto L_0x0074
            int r4 = r7.size()
            int r4 = r4 - r3
            if (r2 > r4) goto L_0x0074
            java.lang.Object r0 = r7.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 - r8
            java.lang.Object r7 = r7.get(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r8 = r8 - r7
            if (r0 <= r8) goto L_0x0042
            goto L_0x0087
        L_0x0074:
            if (r1 < 0) goto L_0x007e
            int r8 = r7.size()
            int r8 = r8 - r3
            if (r1 > r8) goto L_0x007e
            goto L_0x0042
        L_0x007e:
            if (r2 < 0) goto L_0x0088
            int r7 = r7.size()
            int r7 = r7 - r3
            if (r2 > r7) goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ht3.C108258a.mo158647i(java.util.List, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01de  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158648j(int r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            boolean r2 = r1.f324140b
            java.lang.String r3 = "BaseScanCamera"
            if (r2 == 0) goto L_0x0010
            java.lang.String r0 = "in open(), is open already"
            com.tencent.stubs.logger.Log.m106513w(r3, r0)
            return
        L_0x0010:
            int r2 = android.hardware.Camera.getNumberOfCameras()
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x001b:
            java.lang.String r7 = "ScanCameraUtil"
            r8 = 2
            r9 = 1
            if (r6 >= r2) goto L_0x003f
            android.hardware.Camera.getCameraInfo(r6, r4)
            int r10 = r4.facing
            if (r10 != 0) goto L_0x003c
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r4[r5] = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r9] = r2
            java.lang.String r2 = "getBackCameraId get CAMERA_FACING_BACK bid:%d  num:%d"
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r7, (java.lang.String) r2, (java.lang.Object[]) r4)
            goto L_0x0053
        L_0x003c:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x003f:
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4[r5] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r9] = r2
            java.lang.String r2 = "getBackCameraId cannot get facing back id, bid:%d  num:%d"
            com.tencent.stubs.logger.Log.m106514w((java.lang.String) r7, (java.lang.String) r2, (java.lang.Object[]) r4)
            r6 = 0
        L_0x0053:
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r4 = "M9"
            boolean r12 = r2.equals(r4)
            r15 = 90
            r14 = 180(0xb4, float:2.52E-43)
            r13 = 3
            if (r12 == 0) goto L_0x0104
            ht3.u r7 = new ht3.u
            r7.<init>()
            java.lang.Object r17 = new java.lang.Object     // Catch:{ Exception -> 0x00fe }
            r17.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r18 = "com/tencent/scanlib/camera/CameraUtilImplM9"
            java.lang.String r19 = "openCamera"
            java.lang.String r20 = "(II)Lcom/tencent/scanlib/camera/ScanCameraUtil$IImpl$OpenCameraRes;"
            java.lang.String r21 = "android/hardware/Camera"
            java.lang.String r22 = "open"
            java.lang.String r23 = "()Landroid/hardware/Camera;"
            java.lang.Object r0 = j20.C117292a.m165363i(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x00fe }
            android.hardware.Camera r0 = (android.hardware.Camera) r0     // Catch:{ Exception -> 0x00fe }
            r7.f324159a = r0     // Catch:{ Exception -> 0x00fe }
            r7.f324160b = r5     // Catch:{ Exception -> 0x00fe }
            if (r0 != 0) goto L_0x008a
            goto L_0x00fe
        L_0x008a:
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r12 = "Flyme"
            boolean r12 = r0.startsWith(r12)
            if (r12 == 0) goto L_0x009c
            r7.f324160b = r15
            android.hardware.Camera r0 = r7.f324159a
            r0.setDisplayOrientation(r15)
            goto L_0x00fb
        L_0x009c:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00a3
            goto L_0x00ef
        L_0x00a3:
            java.lang.String r2 = r0.substring(r5, r5)
            java.lang.String r4 = "1"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00b0
            goto L_0x00ef
        L_0x00b0:
            java.lang.String r2 = "-"
            java.lang.String[] r0 = r0.split(r2)
            if (r0 == 0) goto L_0x00ef
            int r2 = r0.length
            if (r2 >= r8) goto L_0x00bc
            goto L_0x00ef
        L_0x00bc:
            r0 = r0[r9]
            java.lang.String r2 = gt3.C20839a.f58851a
            if (r0 == 0) goto L_0x00ed
            int r2 = r0.length()     // Catch:{ NumberFormatException -> 0x00d2 }
            if (r2 > 0) goto L_0x00c9
            goto L_0x00ed
        L_0x00c9:
            java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch:{ NumberFormatException -> 0x00d2 }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x00d2 }
            goto L_0x00f0
        L_0x00d2:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "getInt Exception: "
            r2.append(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ScanUtil"
            com.tencent.stubs.logger.Log.m106497e(r2, r0)
        L_0x00ed:
            r0 = 0
            goto L_0x00f0
        L_0x00ef:
            r0 = -1
        L_0x00f0:
            r2 = 7093(0x1bb5, float:9.94E-42)
            if (r0 < r2) goto L_0x00fb
            r7.f324160b = r15
            android.hardware.Camera r0 = r7.f324159a
            r0.setDisplayOrientation(r14)
        L_0x00fb:
            r16 = r7
            goto L_0x0100
        L_0x00fe:
            r16 = 0
        L_0x0100:
            r0 = r16
            goto L_0x0240
        L_0x0104:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "openCamera(), CameraUtilImplAPI9, cameraId = "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.stubs.logger.Log.m106493d(r7, r2)
            java.lang.String r2 = "CameraUtilImpl23"
            ht3.u r4 = new ht3.u
            r4.<init>()
            r7 = 0
            r4.f324159a = r7
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0223 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0223 }
            r12.<init>()     // Catch:{ Exception -> 0x0223 }
            java.lang.String r7 = "Call Camera.open cameraID "
            r12.append(r7)     // Catch:{ Exception -> 0x0223 }
            r12.append(r6)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r7 = r12.toString()     // Catch:{ Exception -> 0x0223 }
            com.tencent.stubs.logger.Log.m106505i(r2, r7)     // Catch:{ Exception -> 0x0223 }
            k20.a r7 = new k20.a     // Catch:{ Exception -> 0x0223 }
            r7.<init>()     // Catch:{ Exception -> 0x0223 }
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x0223 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0223 }
            r7.mo10233c(r12)     // Catch:{ Exception -> 0x0223 }
            java.lang.Object r19 = new java.lang.Object     // Catch:{ Exception -> 0x0223 }
            r19.<init>()     // Catch:{ Exception -> 0x0223 }
            java.lang.Object[] r20 = r7.mo10232b()     // Catch:{ Exception -> 0x0223 }
            java.lang.String r21 = "com/tencent/scanlib/camera/CameraUtilImplAPI9"
            java.lang.String r22 = "openCamera"
            java.lang.String r23 = "(II)Lcom/tencent/scanlib/camera/ScanCameraUtil$IImpl$OpenCameraRes;"
            java.lang.String r24 = "android/hardware/Camera"
            java.lang.String r25 = "open"
            java.lang.String r26 = "(I)Landroid/hardware/Camera;"
            java.lang.Object r7 = j20.C117292a.m165364j(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0223 }
            android.hardware.Camera r7 = (android.hardware.Camera) r7     // Catch:{ Exception -> 0x0223 }
            r4.f324159a = r7     // Catch:{ Exception -> 0x0223 }
            java.lang.String r7 = "Call Camera.open back, use %d ms"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0223 }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0223 }
            long r19 = r19 - r16
            java.lang.Long r16 = java.lang.Long.valueOf(r19)     // Catch:{ Exception -> 0x0223 }
            r12[r5] = r16     // Catch:{ Exception -> 0x0223 }
            java.lang.String r7 = java.lang.String.format(r7, r12)     // Catch:{ Exception -> 0x0223 }
            com.tencent.stubs.logger.Log.m106505i(r2, r7)     // Catch:{ Exception -> 0x0223 }
            android.hardware.Camera r7 = r4.f324159a
            if (r7 != 0) goto L_0x0187
            java.lang.String r0 = "open camera error, not exception, but camera null"
            com.tencent.stubs.logger.Log.m106497e(r2, r0)
            goto L_0x023c
        L_0x0187:
            android.hardware.Camera$CameraInfo r7 = new android.hardware.Camera$CameraInfo
            r7.<init>()
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "Call Camera.getCameraInfo cameraID "
            r12.append(r15)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            com.tencent.stubs.logger.Log.m106505i(r2, r12)
            android.hardware.Camera.getCameraInfo(r6, r7)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            long r20 = java.lang.System.currentTimeMillis()
            long r20 = r20 - r16
            java.lang.Long r15 = java.lang.Long.valueOf(r20)
            r12[r5] = r15
            java.lang.String r15 = "Call Camera.getCameraInfo back, use %dms"
            java.lang.String r12 = java.lang.String.format(r15, r12)
            com.tencent.stubs.logger.Log.m106505i(r2, r12)
            if (r0 == 0) goto L_0x01d0
            if (r0 == r9) goto L_0x01cd
            if (r0 == r8) goto L_0x01ca
            if (r0 == r13) goto L_0x01c7
            goto L_0x01d0
        L_0x01c7:
            r15 = 270(0x10e, float:3.78E-43)
            goto L_0x01d1
        L_0x01ca:
            r15 = 180(0xb4, float:2.52E-43)
            goto L_0x01d1
        L_0x01cd:
            r15 = 90
            goto L_0x01d1
        L_0x01d0:
            r15 = 0
        L_0x01d1:
            int r0 = r7.facing
            if (r0 != r9) goto L_0x01de
            int r0 = r7.orientation
            int r0 = r0 % 360
            int r0 = 360 - r0
            int r0 = r0 % 360
            goto L_0x01e5
        L_0x01de:
            int r0 = r7.orientation
            int r0 = r0 - r15
            int r0 = r0 + 360
            int r0 = r0 % 360
        L_0x01e5:
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r12 = new java.lang.Object[r8]
            int r15 = r7.facing
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12[r5] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r12[r9] = r15
            java.lang.String r15 = "Call Camera.setDisplayOrientation CameraInfo.facing:%d, degrees:%d"
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r2, (java.lang.String) r15, (java.lang.Object[]) r12)
            android.hardware.Camera r12 = r4.f324159a
            r12.setDisplayOrientation(r0)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            long r18 = java.lang.System.currentTimeMillis()
            long r18 = r18 - r16
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            r12[r5] = r15
            java.lang.String r15 = "Call Camera.setDisplayOrientation back, use %dms"
            java.lang.String r12 = java.lang.String.format(r15, r12)
            com.tencent.stubs.logger.Log.m106505i(r2, r12)
            r4.f324160b = r0
            int r0 = r7.facing
            r4.f324161c = r0
            r18 = r4
            goto L_0x023e
        L_0x0223:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "open camera error "
            r4.append(r7)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.stubs.logger.Log.m106497e(r2, r0)
        L_0x023c:
            r18 = 0
        L_0x023e:
            r0 = r18
        L_0x0240:
            if (r0 != 0) goto L_0x0248
            java.lang.String r0 = "in open(), openCameraRes == null"
            com.tencent.stubs.logger.Log.m106497e(r3, r0)
            return
        L_0x0248:
            r1.f324148j = r5
            r2 = -1
            r1.f324149k = r2
            int r2 = r0.f324160b
            r1.f324147i = r2
            int r2 = r2 % r14
            if (r2 == 0) goto L_0x0256
            r2 = 1
            goto L_0x0257
        L_0x0256:
            r2 = 0
        L_0x0257:
            r1.f324146h = r2
            int r2 = r0.f324161c
            r1.f324153o = r2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2[r5] = r4
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r10
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r2[r9] = r4
            int r4 = r1.f324147i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r8] = r4
            java.lang.String r4 = "openCamera done, cameraId=[%s] costTime=[%s] rotation[%d]"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            com.tencent.stubs.logger.Log.m106505i(r3, r2)
            android.hardware.Camera r0 = r0.f324159a
            r1.f324139a = r0
            if (r0 != 0) goto L_0x029e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "in open(), camera == null, bNeedRotate "
            r0.append(r2)
            boolean r2 = r1.f324146h
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106497e(r3, r0)
            return
        L_0x029e:
            r1.f324140b = r9
            android.hardware.Camera r0 = r1.f324139a
            android.hardware.Camera$Parameters r2 = r0.getParameters()
            android.hardware.Camera r0 = r1.f324139a     // Catch:{ Exception -> 0x0342 }
            if (r0 == 0) goto L_0x035b
            java.lang.String r0 = "zoom-supported"
            java.lang.String r0 = r2.get(r0)     // Catch:{ Exception -> 0x0342 }
            boolean r4 = gt3.C20839a.m22868d(r0)     // Catch:{ Exception -> 0x0342 }
            if (r4 != 0) goto L_0x033c
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x0342 }
            if (r0 != 0) goto L_0x02be
            goto L_0x033c
        L_0x02be:
            java.util.List r0 = r2.getZoomRatios()     // Catch:{ Exception -> 0x0342 }
            if (r0 == 0) goto L_0x035b
            int r4 = r0.size()     // Catch:{ Exception -> 0x0342 }
            if (r4 > 0) goto L_0x02cc
            goto L_0x035b
        L_0x02cc:
            r1.f324151m = r5     // Catch:{ Exception -> 0x0342 }
            r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r4 = r0.size()     // Catch:{ Exception -> 0x0342 }
            double r10 = (double) r4     // Catch:{ Exception -> 0x0342 }
            double r10 = r10 / r6
            int r4 = (int) r10     // Catch:{ Exception -> 0x0342 }
            r1.f324152n = r4     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = "divideRatio: %f,max zoom: %d"
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0342 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0342 }
            r10[r5] = r6     // Catch:{ Exception -> 0x0342 }
            int r6 = r1.f324152n     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0342 }
            r10[r9] = r6     // Catch:{ Exception -> 0x0342 }
            java.lang.String r4 = java.lang.String.format(r4, r10)     // Catch:{ Exception -> 0x0342 }
            com.tencent.stubs.logger.Log.m106493d(r3, r4)     // Catch:{ Exception -> 0x0342 }
            int r4 = r1.f324152n     // Catch:{ Exception -> 0x0342 }
            int r6 = r1.f324151m     // Catch:{ Exception -> 0x0342 }
            if (r4 >= r6) goto L_0x02fb
            r1.f324152n = r6     // Catch:{ Exception -> 0x0342 }
            goto L_0x030f
        L_0x02fb:
            java.lang.Object r4 = r0.get(r4)     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0342 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0342 }
            r6 = 400(0x190, float:5.6E-43)
            if (r4 <= r6) goto L_0x030f
            int r4 = r1.mo158647i(r0, r6)     // Catch:{ Exception -> 0x0342 }
            r1.f324152n = r4     // Catch:{ Exception -> 0x0342 }
        L_0x030f:
            java.lang.String r4 = "default zoom:%d,default ratio:%d,max zoom:%d,max ratio:%d"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0342 }
            int r7 = r1.f324151m     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0342 }
            r6[r5] = r7     // Catch:{ Exception -> 0x0342 }
            int r7 = r1.f324151m     // Catch:{ Exception -> 0x0342 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x0342 }
            r6[r9] = r7     // Catch:{ Exception -> 0x0342 }
            int r7 = r1.f324152n     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0342 }
            r6[r8] = r7     // Catch:{ Exception -> 0x0342 }
            int r7 = r1.f324152n     // Catch:{ Exception -> 0x0342 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x0342 }
            r6[r13] = r0     // Catch:{ Exception -> 0x0342 }
            java.lang.String r0 = java.lang.String.format(r4, r6)     // Catch:{ Exception -> 0x0342 }
            com.tencent.stubs.logger.Log.m106505i(r3, r0)     // Catch:{ Exception -> 0x0342 }
            goto L_0x035b
        L_0x033c:
            java.lang.String r0 = "not support zoom"
            com.tencent.stubs.logger.Log.m106505i(r3, r0)     // Catch:{ Exception -> 0x0342 }
            goto L_0x035b
        L_0x0342:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "init zoom exception! "
            r4.append(r6)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.stubs.logger.Log.m106497e(r3, r0)
        L_0x035b:
            java.util.List r0 = r2.getSupportedPreviewFormats()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "supportedPreviewFormat:"
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.stubs.logger.Log.m106505i(r3, r4)
            r4 = 17
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r6 = r0.contains(r6)
            r7 = 842094169(0x32315659, float:1.0322389E-8)
            if (r6 == 0) goto L_0x0384
            r6 = 0
            goto L_0x0392
        L_0x0384:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x0390
            r6 = 1
            goto L_0x0391
        L_0x0390:
            r6 = 0
        L_0x0391:
            r9 = 0
        L_0x0392:
            if (r9 == 0) goto L_0x039d
            java.lang.String r0 = "Preview support NV21"
            com.tencent.stubs.logger.Log.m106505i(r3, r0)
            r2.setPreviewFormat(r4)
            goto L_0x03cd
        L_0x039d:
            if (r6 == 0) goto L_0x03a8
            java.lang.String r0 = "Preview not support NV21, but support YV12"
            com.tencent.stubs.logger.Log.m106505i(r3, r0)
            r2.setPreviewFormat(r7)
            goto L_0x03cd
        L_0x03a8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Preview not support NV21 and YV12. Use format: "
            r4.append(r6)
            java.lang.Object r6 = r0.get(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.stubs.logger.Log.m106505i(r3, r4)
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setPreviewFormat(r0)
        L_0x03cd:
            android.hardware.Camera r0 = r1.f324139a
            r0.setParameters(r2)
            r27.mo158650l()     // Catch:{ Exception -> 0x03d6 }
            goto L_0x03f0
        L_0x03d6:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "set focus mode error: "
            r0.append(r4)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.stubs.logger.Log.m106497e(r3, r0)
        L_0x03f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ht3.C108258a.mo158648j(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r0 = r0.getParameters();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158649k(java.lang.String r3) {
        /*
            r2 = this;
            android.hardware.Camera r0 = r2.f324139a     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x003e
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Exception -> 0x001f }
            java.util.List r1 = r0.getSupportedFocusModes()     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x003e
            r0.setFocusMode(r3)     // Catch:{ Exception -> 0x001f }
            android.hardware.Camera r1 = r2.f324139a     // Catch:{ Exception -> 0x001f }
            r1.setParameters(r0)     // Catch:{ Exception -> 0x001f }
            r2.f324154p = r3     // Catch:{ Exception -> 0x001f }
            goto L_0x003e
        L_0x001f:
            r3 = move-exception
            java.lang.String r0 = ""
            r2.f324154p = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setFocusMode "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BaseScanCamera"
            com.tencent.stubs.logger.Log.m106513w(r0, r3)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ht3.C108258a.mo158649k(java.lang.String):void");
    }

    /* renamed from: l */
    public void mo158650l() {
        try {
            Log.m106505i("BaseScanCamera", "set scan focus");
            List<String> supportedFocusModes = this.f324139a.getParameters().getSupportedFocusModes();
            if (supportedFocusModes != null) {
                Log.m106505i("BaseScanCamera", "supported focus modes size = " + supportedFocusModes.size());
                for (String str : supportedFocusModes) {
                    Log.m106505i("BaseScanCamera", "supported focus modes : " + str);
                }
                if (supportedFocusModes.contains("continuous-video")) {
                    Log.m106493d("BaseScanCamera", "camera support continuous video focus");
                    mo158649k("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    Log.m106493d("BaseScanCamera", "camera support auto focus");
                    mo158649k("auto");
                }
            }
        } catch (Exception e) {
            Log.m106497e("BaseScanCamera", "setScanFocus error: " + e.getMessage());
        }
    }

    /* renamed from: m */
    public void mo158651m(Point point) {
        this.f324143e = new Point(point);
        Log.m106493d("BaseScanCamera", "set visible resolution: " + this.f324143e);
        try {
            Point b = mo158640b(this.f324143e);
            this.f324142d = b;
            this.f324144f = mo158643e(b);
        } catch (Exception e) {
            Log.m106497e("BaseScanCamera", "set preview size" + e.getMessage());
        }
    }

    /* renamed from: n */
    public void mo158652n(SurfaceTexture surfaceTexture) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f324139a != null && !this.f324141c) {
            if (surfaceTexture != null) {
                this.f324139a.setPreviewTexture(surfaceTexture);
            }
            if (this.f324142d == null) {
                Point b = mo158640b(this.f324143e);
                this.f324142d = b;
                this.f324144f = mo158643e(b);
            }
            Camera.Parameters parameters = this.f324139a.getParameters();
            Point point = this.f324142d;
            parameters.setPreviewSize(point.x, point.y);
            this.f324139a.setParameters(parameters);
            C117292a.m165363i(this.f324139a, "com/tencent/scanlib/camera/BaseScanCamera", "startPreview", "(Landroid/graphics/SurfaceTexture;)V", "android/hardware/Camera", "startPreview", "()V");
            this.f324141c = true;
            Log.m106493d("BaseScanCamera", String.format("startPreview done costTime=[%s]", new Object[]{Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis))}));
        }
    }

    /* renamed from: o */
    public void mo158653o(Camera.PreviewCallback previewCallback) {
        Camera camera = this.f324139a;
        if (camera != null) {
            try {
                camera.setOneShotPreviewCallback(previewCallback);
            } catch (RuntimeException e) {
                Log.m106513w("BaseScanCamera", "takeOneShot() " + e.getMessage());
            }
        }
    }

    /* renamed from: p */
    public void mo158654p(int i) {
        if (this.f324139a != null && this.f324141c) {
            try {
                Camera.Parameters parameters = this.f324139a.getParameters();
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (zoomRatios == null) {
                    return;
                }
                if (zoomRatios.size() > 0) {
                    Log.m106505i("BaseScanCamera", String.format("zoom action:%d,beforeZoom:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(parameters.getZoom())}));
                    if (i == 0) {
                        this.f324150l = 0;
                    } else if (i == 1) {
                        this.f324150l = this.f324151m;
                    } else if (i == 2) {
                        int i2 = this.f324150l;
                        int i3 = this.f324152n;
                        if (i2 < i3) {
                            int i4 = i2 + 1;
                            this.f324150l = i4;
                            if (i4 <= i3) {
                                i3 = i4;
                            }
                            this.f324150l = i3;
                        }
                    } else if (i == 3) {
                        int i5 = this.f324150l;
                        int i6 = this.f324151m;
                        if (i5 > i6) {
                            int i7 = i5 - 1;
                            this.f324150l = i7;
                            if (i7 >= i6) {
                                i6 = i7;
                            }
                            this.f324150l = i6;
                        }
                    } else if (i == 4) {
                        this.f324150l = this.f324152n;
                    } else if (i == 5) {
                        int i8 = this.f324150l;
                        int i9 = this.f324151m;
                        if (i8 != i9) {
                            this.f324150l = i9;
                        } else {
                            this.f324150l = this.f324152n;
                        }
                    }
                    parameters.setZoom(this.f324150l);
                    this.f324139a.setParameters(parameters);
                    Log.m106505i("BaseScanCamera", String.format("zoom action:%d,afterZoom:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(parameters.getZoom())}));
                }
            } catch (Exception e) {
                Log.m106497e("BaseScanCamera", "zoom action exception:" + e.getMessage());
            }
        }
    }

    /* renamed from: q */
    public void mo158655q(int i) {
        int i2;
        if (this.f324139a != null && this.f324141c && i > 0) {
            try {
                Camera.Parameters parameters = this.f324139a.getParameters();
                List<Integer> zoomRatios = parameters.getZoomRatios();
                if (zoomRatios == null) {
                    return;
                }
                if (zoomRatios.size() > 0) {
                    Log.m106493d("BaseScanCamera", String.format("zoom to ratio:%d", new Object[]{Integer.valueOf(i)}));
                    if (i >= zoomRatios.get(this.f324151m).intValue() && i <= zoomRatios.get(this.f324152n).intValue()) {
                        i2 = mo158647i(zoomRatios, i);
                    } else if (i < zoomRatios.get(this.f324151m).intValue()) {
                        i2 = this.f324151m;
                    } else {
                        Log.m106505i("BaseScanCamera", "exceed max zoom");
                        int i3 = this.f324150l;
                        int i4 = this.f324152n;
                        i2 = i3 + ((i4 - i3) / 5);
                        if (i2 > i4) {
                            i2 = i4;
                        }
                    }
                    Log.m106505i("BaseScanCamera", String.format("zoom:%d,ratio:%d", new Object[]{Integer.valueOf(i2), zoomRatios.get(i2)}));
                    this.f324150l = i2;
                    parameters.setZoom(i2);
                    this.f324139a.setParameters(parameters);
                }
            } catch (Exception e) {
                Log.m106497e("BaseScanCamera", "zoom scale exception:" + e.getMessage());
            }
        }
    }
}
