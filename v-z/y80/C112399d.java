package y80;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Looper;
import android.util.Size;
import android.view.SurfaceHolder;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import fy3.C32226l;
import gy3.C87412m;
import i72.C108376c;
import i72.C108382h;
import i72.C108393s;
import iy3.C60641c;
import j72.C108619m;
import j72.C98921l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l90.C109292b;
import n90.C109725a;
import p156gj.C107825d;
import p156gj.C107828e;
import p156gj.C107831f;
import p156gj.C107835h0;
import p156gj.C107848z;
import p206nj.C11171e;
import p282z2.C16095a;
import rx3.C13598b0;
import sx3.C110818d0;
import uu3.C111226b;
import ux3.C65486b;
import y80.C112397a;
import z80.C112609a;

/* renamed from: y80.d */
public class C112399d extends C112397a {

    /* renamed from: A */
    public C107848z f336554A;

    /* renamed from: B */
    public C107831f f336555B;

    /* renamed from: C */
    public Camera.AutoFocusCallback f336556C = new C112400a(this);

    /* renamed from: D */
    public final C108376c f336557D = new C108376c("prevcameraCallback");

    /* renamed from: E */
    public final C108376c f336558E = new C108376c("cameraCallback");

    /* renamed from: F */
    public final C108376c f336559F = new C108376c("cameraPreviewCallback");

    /* renamed from: G */
    public final C108376c f336560G = new C108376c("cameraCropCallback");

    /* renamed from: H */
    public final C108376c f336561H = new C108376c("finishCallbackTimeCallback");

    /* renamed from: I */
    public C111226b f336562I;

    /* renamed from: J */
    public final ArrayList<Integer> f336563J = new ArrayList<>();

    /* renamed from: K */
    public final Object f336564K = new Object();

    /* renamed from: L */
    public boolean f336565L;

    /* renamed from: M */
    public C32226l<? super Boolean, C13598b0> f336566M;

    /* renamed from: N */
    public int f336567N;

    /* renamed from: x */
    public final String f336568x = "MicroMsg.CommonCamera1";

    /* renamed from: y */
    public float f336569y = 10.0f;

    /* renamed from: z */
    public List<C108382h> f336570z = new ArrayList();

    /* renamed from: y80.d$a */
    public static final class C112400a implements Camera.AutoFocusCallback {

        /* renamed from: d */
        public final /* synthetic */ C112399d f336571d;

        public C112400a(C112399d dVar) {
            this.f336571d = dVar;
        }

        public final void onAutoFocus(boolean z, Camera camera) {
            String str;
            String str2 = this.f336571d.f336568x;
            Log.m105926v(str2, "auto focus callback success " + z);
            C112399d dVar = this.f336571d;
            dVar.f336531e.f337237l = true;
            if (!dVar.f336565L) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    C87412m.m108593f(parameters, "camera.parameters");
                    if (parameters.getFocusMode() != null && (str = this.f336571d.f336531e.f337238m) != null) {
                        parameters.setFocusMode(str);
                        camera.setParameters(parameters);
                    }
                } catch (Exception unused) {
                    Log.m105920e(this.f336571d.f336568x, "auto focus return while camera is release");
                }
            }
        }
    }

    /* renamed from: y80.d$b */
    public static final class C112401b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((Camera.Size) t2).width), Integer.valueOf(((Camera.Size) t).width));
        }
    }

    /* renamed from: y80.d$c */
    public static final class C112402c implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ C112399d f336572d;

        public C112402c(C112399d dVar) {
            this.f336572d = dVar;
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            C112399d dVar;
            Point point;
            if (bArr != null) {
                boolean z = true;
                if (!(bArr.length == 0)) {
                    if (((ArrayList) this.f336572d.f336570z).size() <= 0) {
                        C107848z zVar = this.f336572d.f336554A;
                        if (zVar != null) {
                            zVar.mo158257a(bArr);
                            return;
                        }
                        return;
                    }
                    this.f336572d.getClass();
                    if (((ArrayList) this.f336572d.f336570z).size() > 0 && (point = dVar.f336545s) != null) {
                        if (point != null && point.x == dVar.f336537k.f324562c) {
                            if (point == null || point.y != dVar.f336537k.f324561b) {
                                z = false;
                            }
                            if (z) {
                                long currentTicks = Util.currentTicks();
                                boolean K = this.f336572d.mo164117K(bArr);
                                long ticksToNow = Util.ticksToNow(currentTicks);
                                if (K) {
                                    this.f336572d.f336561H.mo158893a(ticksToNow);
                                }
                                if (K) {
                                    bArr = C98921l.f289964d.mo126905m(Integer.valueOf(bArr.length));
                                }
                            }
                        }
                        C98921l lVar = C98921l.f289964d;
                        int i = (dVar = this.f336572d).f336537k.f324562c;
                        C87412m.m108591d(point);
                        byte[] n = lVar.mo126905m(Integer.valueOf(((i * point.y) * 3) / 2));
                        this.f336572d.f336559F.mo158893a(1);
                        long currentTicks2 = Util.currentTicks();
                        C112399d dVar2 = this.f336572d;
                        C108393s sVar = dVar2.f336537k;
                        int i2 = sVar.f324562c;
                        int i3 = sVar.f324561b;
                        Point point2 = dVar2.f336545s;
                        C87412m.m108591d(point2);
                        SightVideoJNI.cropCameraData(bArr, n, i2, i3, point2.y);
                        Point point3 = this.f336572d.f336545s;
                        C87412m.m108591d(point3);
                        int i4 = point3.x;
                        C112399d dVar3 = this.f336572d;
                        if (i4 < dVar3.f336537k.f324562c) {
                            Point point4 = dVar3.f336545s;
                            C87412m.m108591d(point4);
                            int i5 = point4.x;
                            Point point5 = this.f336572d.f336545s;
                            C87412m.m108591d(point5);
                            byte[] n2 = lVar.mo126905m(Integer.valueOf(((i5 * point5.y) * 3) / 2));
                            C112399d dVar4 = this.f336572d;
                            int i6 = dVar4.f336537k.f324562c;
                            Point point6 = dVar4.f336545s;
                            C87412m.m108591d(point6);
                            int i7 = point6.x;
                            Point point7 = this.f336572d.f336545s;
                            C87412m.m108591d(point7);
                            SightVideoJNI.cropCameraDataLongEdge(n, n2, i6, i7, point7.y);
                            lVar.mo138260o(n);
                            n = n2;
                        }
                        this.f336572d.f336560G.mo158893a(Util.ticksToNow(currentTicks2));
                        boolean K2 = this.f336572d.mo164117K(n);
                        long ticksToNow2 = Util.ticksToNow(currentTicks2);
                        if (K2) {
                            this.f336572d.f336561H.mo158893a(ticksToNow2);
                        }
                    }
                    C107848z zVar2 = this.f336572d.f336554A;
                    if (zVar2 != null) {
                        zVar2.mo158257a(bArr);
                        return;
                    }
                    return;
                }
            }
            Log.m105920e(this.f336572d.f336568x, "onPreviewFrame, frame data is null!!");
        }
    }

    /* renamed from: y80.d$d */
    public static final class C112403d implements Camera.PreviewCallback {

        /* renamed from: d */
        public final /* synthetic */ C112399d f336573d;

        public C112403d(C112399d dVar) {
            this.f336573d = dVar;
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr != null) {
                boolean z = true;
                if (!(bArr.length == 0)) {
                    C112399d dVar = this.f336573d;
                    if (dVar.f336554A != null) {
                        dVar.getClass();
                        List<C108382h> list = this.f336573d.f336570z;
                        if (list != null && ((ArrayList) list).size() > 0) {
                            C112399d dVar2 = this.f336573d;
                            Point point = dVar2.f336545s;
                            if (point != null) {
                                C98921l lVar = C98921l.f289964d;
                                int i = dVar2.f336537k.f324562c;
                                C87412m.m108591d(point);
                                byte[] n = lVar.mo126905m(Integer.valueOf(((i * point.y) * 3) / 2));
                                this.f336573d.f336559F.mo158893a(1);
                                long currentTicks = Util.currentTicks();
                                C112399d dVar3 = this.f336573d;
                                C108393s sVar = dVar3.f336537k;
                                int i2 = sVar.f324562c;
                                int i3 = sVar.f324561b;
                                Point point2 = dVar3.f336545s;
                                C87412m.m108591d(point2);
                                SightVideoJNI.cropCameraData(bArr, n, i2, i3, point2.y);
                                Point point3 = this.f336573d.f336545s;
                                C87412m.m108591d(point3);
                                int i4 = point3.x;
                                C112399d dVar4 = this.f336573d;
                                if (i4 < dVar4.f336537k.f324562c) {
                                    Point point4 = dVar4.f336545s;
                                    C87412m.m108591d(point4);
                                    int i5 = point4.x;
                                    Point point5 = this.f336573d.f336545s;
                                    C87412m.m108591d(point5);
                                    byte[] n2 = lVar.mo126905m(Integer.valueOf(((i5 * point5.y) * 3) / 2));
                                    C112399d dVar5 = this.f336573d;
                                    int i6 = dVar5.f336537k.f324562c;
                                    Point point6 = dVar5.f336545s;
                                    C87412m.m108591d(point6);
                                    int i7 = point6.x;
                                    Point point7 = this.f336573d.f336545s;
                                    C87412m.m108591d(point7);
                                    SightVideoJNI.cropCameraDataLongEdge(n, n2, i6, i7, point7.y);
                                    lVar.mo138260o(n);
                                    n = n2;
                                }
                                this.f336573d.f336560G.mo158893a(Util.ticksToNow(currentTicks));
                                if (!this.f336573d.f336533g) {
                                    currentTicks = Util.currentTicks();
                                    Point point8 = this.f336573d.f336545s;
                                    C87412m.m108591d(point8);
                                    int i8 = point8.x;
                                    Point point9 = this.f336573d.f336545s;
                                    C87412m.m108591d(point9);
                                    int i9 = point9.y;
                                    C107831f fVar = this.f336573d.f336555B;
                                    C87412m.m108591d(fVar);
                                    if (fVar.f322840b != 270) {
                                        C107831f fVar2 = this.f336573d.f336555B;
                                        C87412m.m108591d(fVar2);
                                        if (fVar2.f322840b != 90) {
                                            z = false;
                                        }
                                    }
                                    SightVideoJNI.mirrorCameraData(n, i8, i9, z);
                                }
                                boolean K = this.f336573d.mo164117K(n);
                                long ticksToNow = Util.ticksToNow(currentTicks);
                                if (K) {
                                    this.f336573d.f336561H.mo158893a(ticksToNow);
                                }
                            } else {
                                if (!dVar2.f336533g) {
                                    C108393s sVar2 = dVar2.f336537k;
                                    int i15 = sVar2.f324562c;
                                    int i16 = sVar2.f324561b;
                                    C107831f fVar3 = dVar2.f336555B;
                                    C87412m.m108591d(fVar3);
                                    if (fVar3.f322840b != 270) {
                                        C107831f fVar4 = this.f336573d.f336555B;
                                        C87412m.m108591d(fVar4);
                                        if (fVar4.f322840b != 90) {
                                            z = false;
                                        }
                                    }
                                    SightVideoJNI.mirrorCameraData(bArr, i15, i16, z);
                                }
                                this.f336573d.mo164117K(bArr);
                            }
                        }
                        this.f336573d.getClass();
                        C107848z zVar = this.f336573d.f336554A;
                        C87412m.m108591d(zVar);
                        zVar.mo158257a(bArr);
                        return;
                    }
                }
            }
            Log.m105920e(this.f336573d.f336568x, "onPreviewFrame, frame data is null!!");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112399d(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: A */
    public boolean mo143140A(Rect rect, Rect rect2) {
        C87412m.m108594g(rect, "focusArea");
        C87412m.m108594g(rect2, "meteringArea");
        try {
            Log.m105925i(this.f336568x, "focus on area :: focus rect %s, meter rect %s", rect, rect2);
            C107848z zVar = this.f336554A;
            List<String> list = null;
            Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
            if (c != null) {
                list = c.getSupportedFocusModes();
            }
            if (list != null && list.contains("auto")) {
                c.setFocusMode("auto");
            }
            if ((c != null ? c.getMaxNumFocusAreas() : 0) > 0) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new Camera.Area(rect, 1000));
                if (c != null) {
                    c.setFocusAreas(arrayList);
                }
            }
            if ((c != null ? c.getMaxNumMeteringAreas() : 0) > 0) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new Camera.Area(rect2, 1000));
                if (c != null) {
                    c.setMeteringAreas(arrayList2);
                }
            }
            C107848z zVar2 = this.f336554A;
            if (zVar2 != null) {
                zVar2.mo158262f(c);
            }
            C107848z zVar3 = this.f336554A;
            if (zVar3 != null) {
                zVar3.mo158258b(this.f336556C);
            }
            return true;
        } catch (Exception e) {
            Log.m105929w(this.f336568x, "autofocus with area fail, exception %s", e.getMessage());
            return false;
        }
    }

    /* renamed from: C */
    public boolean mo143141C() {
        C107831f fVar = this.f336555B;
        if (fVar == null) {
            return false;
        }
        int i = fVar.f322840b;
        return i == 90 || i == 270;
    }

    /* renamed from: E */
    public Size[] mo143142E() {
        Camera.Parameters c;
        List<Camera.Size> supportedPreviewSizes;
        C107848z zVar = this.f336554A;
        if (zVar == null || (c = zVar.mo158259c()) == null || (supportedPreviewSizes = c.getSupportedPreviewSizes()) == null) {
            return null;
        }
        int size = supportedPreviewSizes.size();
        Size[] sizeArr = new Size[size];
        for (int i = 0; i < size; i++) {
            Camera.Size size2 = supportedPreviewSizes.get(i);
            sizeArr[i] = new Size(size2.width, size2.height);
        }
        return sizeArr;
    }

    /* renamed from: G */
    public boolean mo143144G(int i, int i2) {
        try {
            C107848z zVar = this.f336554A;
            Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
            if (c != null) {
                c.setPreviewSize(i, i2);
            }
            C107848z zVar2 = this.f336554A;
            if (zVar2 == null) {
                return true;
            }
            zVar2.mo158262f(c);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: J */
    public void mo143145J(SurfaceHolder surfaceHolder, boolean z, int i) {
        this.f336541o = surfaceHolder;
        this.f336535i = z;
        this.f336542p = i;
        if (z) {
            mo164126T((SurfaceTexture) null, surfaceHolder, i);
        } else {
            mo164127U((SurfaceTexture) null, surfaceHolder, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo164117K(byte[] r5) {
        /*
            r4 = this;
            java.lang.String r0 = "frame"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Object r0 = r4.f336564K
            monitor-enter(r0)
            java.util.List<i72.h> r1 = r4.f336570z     // Catch:{ all -> 0x0037 }
            r2 = 0
            if (r1 == 0) goto L_0x0035
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0037 }
            int r1 = r1.size()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0035
        L_0x0019:
            java.util.List<i72.h> r1 = r4.f336570z     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0037 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0037 }
            i72.h r3 = (i72.C108382h) r3     // Catch:{ all -> 0x0037 }
            boolean r3 = r3.mo157927f(r5)     // Catch:{ all -> 0x0037 }
            r2 = r2 | r3
            goto L_0x0021
        L_0x0033:
            monitor-exit(r0)
            return r2
        L_0x0035:
            monitor-exit(r0)
            return r2
        L_0x0037:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.mo164117K(byte[]):boolean");
    }

    /* renamed from: L */
    public boolean mo164118L(SurfaceTexture surfaceTexture, SurfaceHolder surfaceHolder) {
        C107848z zVar = this.f336554A;
        if (zVar == null) {
            return false;
        }
        if (surfaceTexture == null && surfaceHolder == null) {
            Log.m105924i(this.f336568x, "doStartPreview error, surfaceTexture and surface is null");
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
            return false;
        }
        if (surfaceTexture != null) {
            zVar.mo158265i(surfaceTexture);
        } else {
            Camera camera = zVar.f322936a;
            if (camera != null) {
                camera.setPreviewDisplay(surfaceHolder);
            }
        }
        zVar.mo158267k();
        Log.m105924i(this.f336568x, "doStartPreview finish");
        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenSuccess");
        C115669n.INSTANCE.mo175913w(985, 4, 1);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r6.getZoomRatios();
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164119M(android.hardware.Camera.Parameters r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0010
            java.util.List r1 = r6.getZoomRatios()
            if (r1 == 0) goto L_0x0010
            java.lang.Object r1 = sx3.C110818d0.m150914L(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            r2 = 0
            if (r1 != 0) goto L_0x0016
            r1 = 0
            goto L_0x001a
        L_0x0016:
            int r1 = r1.intValue()
        L_0x001a:
            java.util.ArrayList<java.lang.Integer> r3 = r5.f336563J
            r3.clear()
            java.util.ArrayList<java.lang.Integer> r3 = r5.f336563J
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.add(r4)
            float r1 = (float) r1
            float r3 = r5.f336569y
            float r1 = r1 + r3
            if (r6 == 0) goto L_0x006f
            java.util.List r6 = r6.getZoomRatios()
            if (r6 == 0) goto L_0x006f
            java.util.Iterator r6 = r6.iterator()
        L_0x0038:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r6.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L_0x006b
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0054
            int r3 = r3.intValue()
            float r3 = (float) r3
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0055
        L_0x0054:
            r3 = r0
        L_0x0055:
            float r3 = r3.floatValue()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            float r3 = r5.f336569y
            float r1 = r1 + r3
            java.util.ArrayList<java.lang.Integer> r3 = r5.f336563J
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
        L_0x0069:
            r2 = r4
            goto L_0x0038
        L_0x006b:
            sx3.C64197v.m75542k()
            throw r0
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.mo164119M(android.hardware.Camera$Parameters):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0052 A[Catch:{ Exception -> 0x00ef }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053 A[Catch:{ Exception -> 0x00ef }] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo164120N(int r14) {
        /*
            r13 = this;
            gj.z r0 = r13.f336554A
            r1 = 0
            if (r0 == 0) goto L_0x0107
            gj.f r0 = r13.f336555B
            if (r0 != 0) goto L_0x000b
            goto L_0x0107
        L_0x000b:
            int r0 = r0.f322840b
            r2 = 90
            r3 = 1
            if (r0 != r2) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x0023
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 != r2) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            android.util.Size r2 = r13.f336543q     // Catch:{ Exception -> 0x00ef }
            if (r2 != 0) goto L_0x002f
            android.content.Context r2 = r13.f336527a     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r2 = f72.C97842b.m126290g(r2)     // Catch:{ Exception -> 0x00ef }
            goto L_0x0046
        L_0x002f:
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x00ef }
            android.util.Size r4 = r13.f336543q     // Catch:{ Exception -> 0x00ef }
            gy3.C87412m.m108591d(r4)     // Catch:{ Exception -> 0x00ef }
            int r4 = r4.getWidth()     // Catch:{ Exception -> 0x00ef }
            android.util.Size r5 = r13.f336543q     // Catch:{ Exception -> 0x00ef }
            gy3.C87412m.m108591d(r5)     // Catch:{ Exception -> 0x00ef }
            int r5 = r5.getHeight()     // Catch:{ Exception -> 0x00ef }
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x00ef }
        L_0x0046:
            gj.z r4 = r13.f336554A     // Catch:{ Exception -> 0x00ef }
            if (r4 == 0) goto L_0x004f
            android.hardware.Camera$Parameters r4 = r4.mo158259c()     // Catch:{ Exception -> 0x00ef }
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            if (r4 != 0) goto L_0x0053
            return r1
        L_0x0053:
            i72.i$d r14 = i72.C108383i.m146831e(r4, r2, r14, r0)     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r5 = r14.f324531a     // Catch:{ Exception -> 0x00ef }
            if (r5 != 0) goto L_0x007d
            java.lang.String r14 = r13.f336568x     // Catch:{ Exception -> 0x00ef }
            java.lang.String r5 = "fuck, preview size still null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r5)     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r14 = new android.graphics.Point     // Catch:{ Exception -> 0x00ef }
            int r5 = r2.x     // Catch:{ Exception -> 0x00ef }
            int r6 = r2.y     // Catch:{ Exception -> 0x00ef }
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ Exception -> 0x00ef }
            int r6 = r2.x     // Catch:{ Exception -> 0x00ef }
            int r2 = r2.y     // Catch:{ Exception -> 0x00ef }
            int r2 = java.lang.Math.max(r6, r2)     // Catch:{ Exception -> 0x00ef }
            r14.<init>(r5, r2)     // Catch:{ Exception -> 0x00ef }
            int r2 = r13.f336530d     // Catch:{ Exception -> 0x00ef }
            i72.i$d r14 = i72.C108383i.m146832f(r4, r14, r2, r0)     // Catch:{ Exception -> 0x00ef }
        L_0x007d:
            android.graphics.Point r0 = r14.f324531a     // Catch:{ Exception -> 0x00ef }
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r13.f336568x     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "checkMore start %s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00ef }
            java.lang.String r6 = r14.toString()     // Catch:{ Exception -> 0x00ef }
            r5[r1] = r6     // Catch:{ Exception -> 0x00ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r5)     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r0 = r14.f324534d     // Catch:{ Exception -> 0x00ef }
            r14.f324531a = r0     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r0 = r14.f324535e     // Catch:{ Exception -> 0x00ef }
            r14.f324532b = r0     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r0 = r14.f324536f     // Catch:{ Exception -> 0x00ef }
            r14.f324533c = r0     // Catch:{ Exception -> 0x00ef }
        L_0x009c:
            android.graphics.Point r0 = r14.f324531a     // Catch:{ Exception -> 0x00ef }
            if (r0 != 0) goto L_0x00ad
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00ef }
            r6 = 440(0x1b8, double:2.174E-321)
            r8 = 140(0x8c, double:6.9E-322)
            r10 = 0
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)     // Catch:{ Exception -> 0x00ef }
            return r1
        L_0x00ad:
            i72.s r2 = r13.f336537k     // Catch:{ Exception -> 0x00ef }
            int r5 = r0.x     // Catch:{ Exception -> 0x00ef }
            r2.f324562c = r5     // Catch:{ Exception -> 0x00ef }
            int r5 = r0.y     // Catch:{ Exception -> 0x00ef }
            r2.f324561b = r5     // Catch:{ Exception -> 0x00ef }
            r13.f336545s = r0     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r14 = r14.f324532b     // Catch:{ Exception -> 0x00ef }
            if (r14 == 0) goto L_0x00bf
            r13.f336545s = r14     // Catch:{ Exception -> 0x00ef }
        L_0x00bf:
            java.lang.String r14 = r13.f336568x     // Catch:{ Exception -> 0x00ef }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
            r2.<init>()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r5 = "final set camera preview size: "
            r2.append(r5)     // Catch:{ Exception -> 0x00ef }
            r2.append(r0)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r5 = ", cropSize: "
            r2.append(r5)     // Catch:{ Exception -> 0x00ef }
            android.graphics.Point r5 = r13.f336545s     // Catch:{ Exception -> 0x00ef }
            r2.append(r5)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ef }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)     // Catch:{ Exception -> 0x00ef }
            int r14 = r0.x     // Catch:{ Exception -> 0x00ef }
            int r0 = r0.y     // Catch:{ Exception -> 0x00ef }
            r4.setPreviewSize(r14, r0)     // Catch:{ Exception -> 0x00ef }
            gj.z r14 = r13.f336554A     // Catch:{ Exception -> 0x00ef }
            if (r14 != 0) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            r14.mo158262f(r4)     // Catch:{ Exception -> 0x00ef }
        L_0x00ee:
            return r3
        L_0x00ef:
            r14 = move-exception
            java.lang.String r0 = r13.f336568x
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            android.os.Looper r4 = android.os.Looper.myLooper()
            r2[r1] = r4
            java.lang.String r4 = r14.getMessage()
            r2[r3] = r4
            java.lang.String r3 = "setPreviewSize Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r14, r3, r2)
            return r1
        L_0x0107:
            java.lang.String r14 = r13.f336568x
            java.lang.String r0 = "maybe sth. is wrong ,camera is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.mo164120N(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8 A[Catch:{ Exception -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb A[Catch:{ Exception -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be A[Catch:{ Exception -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1 A[Catch:{ Exception -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4 A[Catch:{ Exception -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7 A[Catch:{ Exception -> 0x0114 }] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo164121O(int r12, float r13) {
        /*
            r11 = this;
            gj.z r0 = r11.f336554A
            r1 = 0
            if (r0 == 0) goto L_0x0124
            if (r12 > 0) goto L_0x0009
            goto L_0x0124
        L_0x0009:
            r2 = 1
            gy3.C87412m.m108591d(r0)     // Catch:{ Exception -> 0x0114 }
            android.hardware.Camera$Parameters r0 = r0.mo158259c()     // Catch:{ Exception -> 0x0114 }
            android.util.Size r3 = r11.f336543q     // Catch:{ Exception -> 0x0114 }
            if (r3 != 0) goto L_0x001e
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0114 }
            android.graphics.Point r3 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r3)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0035
        L_0x001e:
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ Exception -> 0x0114 }
            android.util.Size r4 = r11.f336543q     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r4)     // Catch:{ Exception -> 0x0114 }
            int r4 = r4.getWidth()     // Catch:{ Exception -> 0x0114 }
            android.util.Size r5 = r11.f336543q     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r5)     // Catch:{ Exception -> 0x0114 }
            int r5 = r5.getHeight()     // Catch:{ Exception -> 0x0114 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0114 }
        L_0x0035:
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ Exception -> 0x0114 }
            int r5 = r3.x     // Catch:{ Exception -> 0x0114 }
            int r6 = r3.y     // Catch:{ Exception -> 0x0114 }
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ Exception -> 0x0114 }
            int r6 = r3.x     // Catch:{ Exception -> 0x0114 }
            int r7 = r3.y     // Catch:{ Exception -> 0x0114 }
            int r6 = java.lang.Math.max(r6, r7)     // Catch:{ Exception -> 0x0114 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = r11.f336568x     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = "screenSize: %s, currentScreenSize: %s"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0114 }
            r8[r1] = r4     // Catch:{ Exception -> 0x0114 }
            r8[r2] = r3     // Catch:{ Exception -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)     // Catch:{ Exception -> 0x0114 }
            int r3 = r4.x     // Catch:{ Exception -> 0x0114 }
            int r5 = r4.y     // Catch:{ Exception -> 0x0114 }
            int r3 = java.lang.Math.min(r3, r5)     // Catch:{ Exception -> 0x0114 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0114 }
            int r5 = r4.x     // Catch:{ Exception -> 0x0114 }
            int r6 = r4.y     // Catch:{ Exception -> 0x0114 }
            int r5 = java.lang.Math.max(r5, r6)     // Catch:{ Exception -> 0x0114 }
            float r5 = (float) r5     // Catch:{ Exception -> 0x0114 }
            float r3 = r3 / r5
            float r5 = (float) r2     // Catch:{ Exception -> 0x0114 }
            float r5 = r5 / r13
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0075
            r5 = r12
            goto L_0x007b
        L_0x0075:
            float r6 = (float) r12     // Catch:{ Exception -> 0x0114 }
            float r6 = r6 / r5
            int r5 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x0114 }
        L_0x007b:
            java.lang.String r6 = r11.f336568x     // Catch:{ Exception -> 0x0114 }
            java.lang.String r8 = "safeSetPreviewSizeWithLimitAndRatio, shortSize: %s, displayRatio: %s, screenRatio: %s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0114 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0114 }
            r9[r1] = r10     // Catch:{ Exception -> 0x0114 }
            java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch:{ Exception -> 0x0114 }
            r9[r2] = r13     // Catch:{ Exception -> 0x0114 }
            java.lang.Float r13 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x0114 }
            r9[r7] = r13     // Catch:{ Exception -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)     // Catch:{ Exception -> 0x0114 }
            gj.f r13 = r11.f336555B     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r13)     // Catch:{ Exception -> 0x0114 }
            int r13 = r13.f322840b     // Catch:{ Exception -> 0x0114 }
            r3 = 270(0x10e, float:3.78E-43)
            r6 = 90
            if (r13 == r6) goto L_0x00b0
            gj.f r13 = r11.f336555B     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r13)     // Catch:{ Exception -> 0x0114 }
            int r13 = r13.f322840b     // Catch:{ Exception -> 0x0114 }
            if (r13 != r3) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r13 = 0
            goto L_0x00b1
        L_0x00b0:
            r13 = 1
        L_0x00b1:
            i72.i$d r13 = i72.C108383i.m146830d(r0, r4, r5, r1, r13)     // Catch:{ Exception -> 0x0114 }
            r5 = 0
            if (r13 == 0) goto L_0x00bb
            android.graphics.Point r8 = r13.f324531a     // Catch:{ Exception -> 0x0114 }
            goto L_0x00bc
        L_0x00bb:
            r8 = r5
        L_0x00bc:
            if (r8 != 0) goto L_0x00df
            java.lang.String r13 = r11.f336568x     // Catch:{ Exception -> 0x0114 }
            java.lang.String r8 = "fuck, preview size still null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r8)     // Catch:{ Exception -> 0x0114 }
            gj.f r13 = r11.f336555B     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r13)     // Catch:{ Exception -> 0x0114 }
            int r13 = r13.f322840b     // Catch:{ Exception -> 0x0114 }
            if (r13 == r6) goto L_0x00da
            gj.f r13 = r11.f336555B     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r13)     // Catch:{ Exception -> 0x0114 }
            int r13 = r13.f322840b     // Catch:{ Exception -> 0x0114 }
            if (r13 != r3) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r13 = 0
            goto L_0x00db
        L_0x00da:
            r13 = 1
        L_0x00db:
            i72.i$d r13 = i72.C108383i.m146832f(r0, r4, r12, r13)     // Catch:{ Exception -> 0x0114 }
        L_0x00df:
            if (r13 == 0) goto L_0x00e4
            android.graphics.Point r12 = r13.f324531a     // Catch:{ Exception -> 0x0114 }
            goto L_0x00e5
        L_0x00e4:
            r12 = r5
        L_0x00e5:
            if (r12 == 0) goto L_0x0124
            android.graphics.Point r12 = r13.f324531a     // Catch:{ Exception -> 0x0114 }
            i72.s r13 = r11.f336537k     // Catch:{ Exception -> 0x0114 }
            int r3 = r12.x     // Catch:{ Exception -> 0x0114 }
            r13.f324562c = r3     // Catch:{ Exception -> 0x0114 }
            int r3 = r12.y     // Catch:{ Exception -> 0x0114 }
            r13.f324561b = r3     // Catch:{ Exception -> 0x0114 }
            r11.f336545s = r5     // Catch:{ Exception -> 0x0114 }
            java.lang.String r13 = r11.f336529c     // Catch:{ Exception -> 0x0114 }
            java.lang.String r3 = "final set camera preview size: : %s, cropSize: %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0114 }
            r4[r1] = r12     // Catch:{ Exception -> 0x0114 }
            r4[r2] = r5     // Catch:{ Exception -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r4)     // Catch:{ Exception -> 0x0114 }
            i72.s r12 = r11.f336537k     // Catch:{ Exception -> 0x0114 }
            int r13 = r12.f324562c     // Catch:{ Exception -> 0x0114 }
            int r12 = r12.f324561b     // Catch:{ Exception -> 0x0114 }
            r0.setPreviewSize(r13, r12)     // Catch:{ Exception -> 0x0114 }
            gj.z r12 = r11.f336554A     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108591d(r12)     // Catch:{ Exception -> 0x0114 }
            r12.mo158262f(r0)     // Catch:{ Exception -> 0x0114 }
            return r2
        L_0x0114:
            r12 = move-exception
            java.lang.String r13 = r11.f336568x
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r12 = r12.getMessage()
            r0[r1] = r12
            java.lang.String r12 = "safeSetPreviewSizeWithLimit error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r12, r0)
        L_0x0124:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.mo164121O(int, float):boolean");
    }

    /* renamed from: P */
    public final boolean mo164122P(float f, int i) {
        Camera.Parameters parameters;
        boolean z;
        C107848z zVar = this.f336554A;
        if (zVar == null || this.f336555B == null) {
            Log.m105920e(this.f336568x, "maybe sth. is wrong ,camera is null");
            return false;
        }
        T t = null;
        if (zVar != null) {
            try {
                parameters = zVar.mo158259c();
            } catch (Exception e) {
                Log.printErrStackTrace(this.f336568x, e, "setPreviewSize Exception, %s, %s", Looper.myLooper(), e.getMessage());
                return false;
            }
        } else {
            parameters = null;
        }
        if (parameters == null) {
            return false;
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        C87412m.m108593f(supportedPreviewSizes, "parameter.supportedPreviewSizes");
        C110818d0.m150943o0(supportedPreviewSizes, new C112401b());
        Iterator<T> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Camera.Size size = (Camera.Size) next;
            if (((double) Math.abs(((((float) size.width) * 1.0f) / ((float) size.height)) - f)) > 0.1d || size.width > i) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        Camera.Size size2 = (Camera.Size) t;
        if (size2 == null) {
            return false;
        }
        parameters.setPreviewSize(size2.width, size2.height);
        C108393s sVar = this.f336537k;
        sVar.f324562c = size2.width;
        sVar.f324561b = size2.height;
        this.f336545s = new Point(size2.width, size2.height);
        Log.m105924i(this.f336568x, "selectRatioAndResolutionLimitPreviewSize final select target:" + size2.width + 'x' + size2.height);
        C107848z zVar2 = this.f336554A;
        if (zVar2 != null) {
            zVar2.mo158262f(parameters);
        }
        return true;
    }

    /* renamed from: Q */
    public final void mo164123Q() {
        Camera.Parameters parameters;
        C107848z zVar = this.f336554A;
        if (zVar != null && zVar != null) {
            if (zVar != null) {
                try {
                    parameters = zVar.mo158259c();
                } catch (Exception e) {
                    Log.m105921e(this.f336568x, "setPreviewCallbackImpl error: %s", e.getMessage());
                    return;
                }
            } else {
                parameters = null;
            }
            if (parameters != null) {
                C108393s sVar = this.f336537k;
                int bitsPerPixel = ((sVar.f324562c * sVar.f324561b) * ImageFormat.getBitsPerPixel(parameters.getPreviewFormat())) / 8;
                String str = this.f336568x;
                Log.m105924i(str, "setPreviewCallbackImpl  size: " + bitsPerPixel);
                for (int i = 0; i < 5; i++) {
                    byte[] n = C98921l.f289964d.mo126905m(Integer.valueOf(bitsPerPixel));
                    C107848z zVar2 = this.f336554A;
                    if (zVar2 != null) {
                        zVar2.mo158257a(n);
                    }
                }
                this.f336557D.mo158896d();
                this.f336558E.mo158896d();
                this.f336559F.mo158896d();
                this.f336560G.mo158896d();
                this.f336561H.mo158896d();
                C107848z zVar3 = this.f336554A;
                if (zVar3 != null) {
                    zVar3.mo158264h(new C112402c(this));
                }
            }
        }
    }

    /* renamed from: R */
    public void mo164124R() {
        C107848z zVar = this.f336554A;
        if (zVar != null) {
            try {
                C87412m.m108591d(zVar);
                Camera.Parameters c = zVar.mo158259c();
                Log.m105924i(this.f336568x, "setPreviewCallbackImpl");
                C108393s sVar = this.f336537k;
                C87412m.m108591d(c);
                int bitsPerPixel = ((sVar.f324562c * sVar.f324561b) * ImageFormat.getBitsPerPixel(c.getPreviewFormat())) / 8;
                for (int i = 0; i < 5; i++) {
                    byte[] n = C98921l.f289964d.mo126905m(Integer.valueOf(bitsPerPixel));
                    C107848z zVar2 = this.f336554A;
                    C87412m.m108591d(zVar2);
                    zVar2.mo158257a(n);
                }
                this.f336557D.mo158896d();
                this.f336558E.mo158896d();
                this.f336559F.mo158896d();
                this.f336560G.mo158896d();
                this.f336561H.mo158896d();
                C107848z zVar3 = this.f336554A;
                C87412m.m108591d(zVar3);
                zVar3.mo158264h(new C112403d(this));
            } catch (Exception e) {
                Log.m105921e(this.f336568x, "setPreviewCallbackImpl error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: S */
    public void mo164125S() {
        C107848z zVar;
        C107848z zVar2;
        C107848z zVar3;
        C109292b.C61240a aVar;
        HashMap<Integer, C109292b.C61240a.C61241a> hashMap;
        C109292b.C61240a.C61241a aVar2;
        HashMap<Integer, C109292b.C61240a.C61241a> hashMap2;
        Integer num = 0;
        SightParams sightParams = C108619m.f325223b.f325224a;
        if (sightParams != null) {
            num = Integer.valueOf(sightParams.f248463t);
        }
        String str = this.f336568x;
        Object[] objArr = new Object[6];
        objArr[0] = num;
        C107825d dVar = C107835h0.f322845b;
        objArr[1] = dVar.f322824w == 1 ? "Range" : dVar.f322823v == 1 ? "Fix" : "Error";
        objArr[2] = Boolean.valueOf(dVar.f322825x == 1);
        objArr[3] = Boolean.valueOf(C107835h0.f322845b.f322826y == 1);
        objArr[4] = Boolean.valueOf(C107835h0.f322845b.f322827z == 1);
        objArr[5] = Boolean.valueOf(C107835h0.f322845b.f322786A == 1);
        Log.m105925i(str, "startPreview Texture:: sightTest %s, config list: setFPS[%s], setYUV420SP[%B], useMetering[%B], useContinueFocus[%B] mUseContinueVideoFocusMode[%B]", objArr);
        boolean z = !(C107835h0.f322845b.f322824w == 1 && (num.intValue() == 0 || num.intValue() == 1)) && C107835h0.f322845b.f322823v == 1 && (num.intValue() == 0 || num.intValue() == 5);
        C109292b.C61240a aVar3 = this.f336539m;
        Camera.Parameters parameters = null;
        if (aVar3 != null) {
            if ((aVar3 != null ? aVar3.f174308a : null) != null) {
                if (!(((aVar3 == null || (hashMap2 = aVar3.f174308a) == null) ? null : hashMap2.get(Integer.valueOf(this.f336533g ^ true ? 1 : 0))) == null || (aVar = this.f336539m) == null || (hashMap = aVar.f174308a) == null || (aVar2 = hashMap.get(Integer.valueOf(this.f336533g ^ true ? 1 : 0))) == null)) {
                    Integer num2 = aVar2.f174312c;
                    if (num2 != null) {
                        this.f336567N = num2.intValue();
                    }
                    Boolean bool = aVar2.f174313d;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                }
            }
        }
        C107848z zVar4 = this.f336554A;
        if (zVar4 != null) {
            try {
                Camera.Parameters c = zVar4.mo158259c();
                if (z) {
                    mo164129W(c, this.f336567N);
                } else {
                    C87412m.m108593f(c, "p");
                    mo164128V(c, this.f336567N);
                }
                Log.m105925i(this.f336529c, "use fix mode %B, supported preview frame rates %s", Boolean.valueOf(z), c.getSupportedPreviewFrameRates());
                zVar4.mo158262f(c);
            } catch (Exception e) {
                Log.m105925i(this.f336529c, "setPreviewFrameRate Exception, %s, %s", Looper.myLooper(), e.getMessage());
            }
        }
        if (C107835h0.f322845b.f322825x == 1 && ((num.intValue() == 0 || num.intValue() == 2) && (zVar3 = this.f336554A) != null)) {
            try {
                Log.m105924i(this.f336568x, "safeSetPreviewFormat");
                Camera.Parameters c2 = zVar3.mo158259c();
                List<Integer> supportedPreviewFormats = c2.getSupportedPreviewFormats();
                if (supportedPreviewFormats == null || !supportedPreviewFormats.contains(17)) {
                    Log.m105920e(this.f336568x, "not support YCbCr_420_SP");
                }
                c2.setPreviewFormat(17);
                zVar3.mo158262f(c2);
            } catch (Exception e2) {
                Log.m105925i(this.f336568x, "setPreviewFormat Exception, %s, %s", Looper.myLooper(), e2.getMessage());
            }
        }
        int i = C107835h0.f322852i.f322660i;
        if (i != -1 && i == 1 && C11171e.m11045b(14) && (zVar2 = this.f336554A) != null) {
            try {
                Log.m105924i(this.f336568x, "safeSetMetering");
                Camera.Parameters c3 = zVar2.mo158259c();
                if (c3.getMaxNumMeteringAreas() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(new Rect(-1000, -1000, 1000, 1000), 600));
                    c3.setMeteringAreas(arrayList);
                }
                zVar2.mo158262f(c3);
            } catch (Exception e3) {
                Log.m105925i(this.f336568x, "safeSetMetering Exception, %s, %s", Looper.myLooper(), e3.getMessage());
            }
        }
        if (C107835h0.f322845b.f322827z == 1 && ((num.intValue() == 0 || num.intValue() == 4) && (zVar = this.f336554A) != null)) {
            try {
                Camera.Parameters c4 = zVar.mo158259c();
                List<String> supportedFocusModes = c4.getSupportedFocusModes();
                if (supportedFocusModes != null && supportedFocusModes.contains("continuous-picture")) {
                    Log.m105924i(this.f336568x, "support continuous picture");
                    c4.setFocusMode("continuous-picture");
                } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                    Log.m105924i(this.f336568x, "support continuous video");
                    c4.setFocusMode("continuous-video");
                } else if (supportedFocusModes == null || !supportedFocusModes.contains("auto")) {
                    Log.m105924i(this.f336568x, "not support continuous video or auto focus");
                } else {
                    Log.m105924i(this.f336568x, "support auto focus");
                    c4.setFocusMode("auto");
                }
                this.f336531e.f337238m = c4.getFocusMode();
                zVar.mo158262f(c4);
            } catch (Exception e4) {
                Log.m105925i(this.f336568x, "setFocusMode Exception, %s, %s", Looper.myLooper(), e4.getMessage());
            }
        }
        if (C107835h0.f322845b.f322786A == 1 && num.intValue() != 0) {
            int intValue = num.intValue();
        }
        try {
            C107848z zVar5 = this.f336554A;
            Camera.Parameters c5 = zVar5 != null ? zVar5.mo158259c() : null;
            if (c5 != null && c5.isZoomSupported()) {
                c5.setZoom(0);
            }
            C107848z zVar6 = this.f336554A;
            if (zVar6 != null) {
                zVar6.mo158262f(c5);
            }
        } catch (Exception e5) {
            Log.m105921e(this.f336568x, "safeResetZoom error: %s", e5.getMessage());
        }
        try {
            C107848z zVar7 = this.f336554A;
            if (zVar7 != null) {
                parameters = zVar7.mo158259c();
            }
            mo164119M(parameters);
        } catch (Exception unused) {
            Log.m105924i(this.f336568x, "current get parameters is null");
        }
    }

    /* renamed from: T */
    public final void mo164126T(SurfaceTexture surfaceTexture, SurfaceHolder surfaceHolder, int i) {
        long currentTicks = Util.currentTicks();
        String str = this.f336568x;
        Log.m105924i(str, "start startPreviewWithCPU,Looper.myLooper(): " + Looper.myLooper() + ",surfaceTexture:" + surfaceTexture + ", surface:" + surfaceHolder);
        if (mo164109B()) {
            Log.m105924i(this.f336568x, "startPreviewWithCPU, camera previewing");
            return;
        }
        try {
            mo164120N(i);
            mo164125S();
            mo164123Q();
            if (mo164118L(surfaceTexture, surfaceHolder)) {
                this.f336534h = C112397a.C112398a.CAMERA_IS_PREVIEWING;
            }
        } catch (Exception e) {
            Log.m105921e(this.f336568x, "start preview FAILED, %s, %s", Looper.myLooper(), e.getMessage());
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
        }
        Log.m105925i(this.f336568x, "start preview end, use %dms %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
    }

    /* renamed from: U */
    public void mo164127U(SurfaceTexture surfaceTexture, SurfaceHolder surfaceHolder, int i) {
        long currentTicks = Util.currentTicks();
        String str = this.f336568x;
        Log.m105924i(str, "start startPreviewWithGPU,Looper.myLooper(): " + Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture + ", surface:" + surfaceHolder);
        if (mo164109B()) {
            Log.m105924i(this.f336568x, "startPreviewWithGPU, camera previewing");
            return;
        }
        try {
            if (this.f336536j) {
                mo164121O(i, 0.0f);
                mo164124R();
            } else {
                mo143143F(i);
            }
            mo164125S();
            if (mo164118L(surfaceTexture, surfaceHolder)) {
                this.f336534h = C112397a.C112398a.CAMERA_IS_PREVIEWING;
            }
        } catch (Exception e) {
            Log.m105921e(this.f336568x, "start preview FAILED, %s, %s", Looper.myLooper(), e.getMessage());
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
        }
        Log.m105925i(this.f336568x, "start preview end, use %dms %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
    }

    /* renamed from: V */
    public void mo164128V(Camera.Parameters parameters, int i) {
        Camera.Parameters parameters2 = parameters;
        int i2 = i;
        C87412m.m108594g(parameters2, "p");
        if (C107835h0.f322845b.f322821t > 0) {
            Log.m105924i(this.f336529c, "set frame rate > 0, do not try set preview fps range");
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null && supportedPreviewFpsRange.size() != 0) {
            int size = supportedPreviewFpsRange.size();
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            boolean z = false;
            for (int i5 = 0; i5 < size; i5++) {
                int[] iArr = supportedPreviewFpsRange.get(i5);
                if (iArr != null && iArr.length > 1) {
                    int i6 = iArr[0];
                    int i7 = iArr[1];
                    Log.m105925i(this.f336568x, "dkfps %d:[%d %d]", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
                    if (i6 >= 0 && i7 >= i6) {
                        if (i7 >= i4 && !z) {
                            i4 = i7;
                            i3 = i6;
                        }
                        if (i2 != 0) {
                            if (i7 < i2 * 1000) {
                            }
                        } else if (i7 < 30000) {
                        }
                        z = true;
                    }
                }
            }
            Log.m105925i(this.f336529c, "dkfps get fit  [%d %d], max target fps %d", Integer.valueOf(i3), Integer.valueOf(i4), 30);
            if (i3 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                try {
                    parameters2.setPreviewFpsRange(i3, i4);
                    Log.m105925i(this.f336529c, "set fps range %d %d", Integer.valueOf(i3), Integer.valueOf(i4));
                } catch (Exception e) {
                    Log.m105925i(this.f336529c, "trySetPreviewFpsRangeParameters Exception, %s, %s", Looper.myLooper(), e.getMessage());
                }
            }
        }
    }

    /* renamed from: W */
    public void mo164129W(Camera.Parameters parameters, int i) {
        int i2;
        if (C107835h0.f322845b.f322821t > 0) {
            Log.m105924i(this.f336529c, "set frame rate > 0, do not try set preview frame rate");
        } else if (parameters == null) {
            Log.m105920e(this.f336568x, "trySetPreviewFrameRateParameters error, p is null!");
        } else {
            try {
                List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
                if (supportedPreviewFrameRates != null && supportedPreviewFrameRates.size() > 0) {
                    if (i != 0) {
                        Object max = Collections.max(supportedPreviewFrameRates);
                        C87412m.m108593f(max, "max(fr)");
                        i2 = Math.min(i, ((Number) max).intValue());
                    } else {
                        Object max2 = Collections.max(supportedPreviewFrameRates);
                        C87412m.m108593f(max2, "max(fr)");
                        i2 = Math.min(30, ((Number) max2).intValue());
                    }
                    parameters.setPreviewFrameRate(i2);
                    Log.m105925i(this.f336529c, "set preview frame rate %d", Integer.valueOf(i2));
                }
            } catch (Exception e) {
                Log.m105925i(this.f336529c, "trySetPreviewFrameRateParameters Exception, %s, %s", Looper.myLooper(), e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public boolean mo143161a() {
        Camera camera;
        try {
            Log.m105924i(this.f336568x, "triggerAutoFocus");
            C107848z zVar = this.f336554A;
            if (!(zVar == null || (camera = zVar.f322936a) == null)) {
                camera.cancelAutoFocus();
            }
            C107848z zVar2 = this.f336554A;
            if (zVar2 != null) {
                zVar2.mo158258b(this.f336556C);
            }
            return true;
        } catch (Exception e) {
            Log.m105929w(this.f336568x, "autofocus fail, exception %s", e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public int mo143163c() {
        if (this.f336555B == null || !mo164109B()) {
            return -1;
        }
        C107831f fVar = this.f336555B;
        if (fVar != null) {
            return fVar.f322840b;
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo143164d(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        try {
            if (this.f336549w) {
                Log.m105924i(this.f336568x, "initCamera, already open");
                return true;
            }
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpen");
            C115669n.INSTANCE.mo175913w(985, 3, 1);
            this.f336533g = z;
            release();
            int a = z ? C107828e.m146098a() : C107828e.m146099b();
            Log.printInfoStack(this.f336568x, "use camera id %d, SrvDeviceInfo id %d", Integer.valueOf(a), Integer.valueOf(C107835h0.f322845b.f322787B));
            C107848z zVar = null;
            this.f336555B = new C112406i().mo164134a(context, a, (Looper) null);
            Log.m105925i(this.f336568x, "open camera end, %s", Looper.myLooper());
            C107831f fVar = this.f336555B;
            if (fVar == null) {
                Log.m105925i(this.f336568x, "open camera FAILED, %s", Looper.myLooper());
                mo164112I();
                return false;
            }
            if (fVar != null) {
                zVar = fVar.f322839a;
            }
            this.f336554A = zVar;
            if (zVar != null) {
                zVar.mo158266j("CommonCamera1");
            }
            this.f336565L = false;
            C108393s sVar = this.f336537k;
            C107831f fVar2 = this.f336555B;
            sVar.f324564e = fVar2 != null ? fVar2.f322840b : 0;
            if (this.f336554A == null) {
                Log.m105920e(this.f336568x, "start camera FAILED!");
                mo164112I();
                return false;
            }
            this.f336549w = true;
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(this.f336568x, e, "init camera failed!", new Object[0]);
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
            C115669n.INSTANCE.mo175913w(985, 5, 1);
            return false;
        }
    }

    /* renamed from: e */
    public void mo143165e(String str, int i) {
        C87412m.m108594g(str, "tag");
    }

    /* renamed from: f */
    public void mo143166f(float f) {
        if (this.f336547u) {
            Log.m105918d(this.f336568x, "setForceZoomTargetRatio, zooming, ignore");
            return;
        }
        C107848z zVar = this.f336554A;
        if (zVar != null) {
            try {
                C87412m.m108591d(zVar);
                Camera.Parameters c = zVar.mo158259c();
                C87412m.m108591d(c);
                if (!c.isZoomSupported()) {
                    this.f336547u = false;
                } else if (this.f336562I == null) {
                    Log.m105918d(this.f336568x, "setForceZoomTargetRatio before init zoom info, ignore");
                    this.f336547u = false;
                } else {
                    List<Integer> zoomRatios = c.getZoomRatios();
                    C111226b bVar = this.f336562I;
                    C87412m.m108591d(bVar);
                    int c2 = bVar.mo162976c(bVar.f333061d, bVar.f333063f, C60641c.m70921b(f * ((float) 10)));
                    int indexOf = zoomRatios.indexOf(Integer.valueOf(c2 < 0 ? 0 : bVar.f333062e[c2]));
                    if (indexOf >= 0) {
                        if (indexOf <= c.getMaxZoom()) {
                            this.f336547u = true;
                            c.setZoom(indexOf);
                            C107848z zVar2 = this.f336554A;
                            C87412m.m108591d(zVar2);
                            zVar2.mo158262f(c);
                            this.f336547u = false;
                            return;
                        }
                    }
                    this.f336547u = false;
                }
            } catch (Exception e) {
                Log.m105921e(this.f336568x, "setForceZoomTargetRatio error: %s", e.getMessage());
            } catch (Throwable th) {
                this.f336547u = false;
                throw th;
            }
        }
    }

    /* renamed from: g */
    public Rect mo143167g(float f, float f2, float f3, int i, int i2) {
        float f4 = ((float) 80) * f3;
        RectF rectF = new RectF();
        float f5 = (float) i;
        float f6 = (float) i2;
        rectF.set(Math.max(f - f4, 0.0f), Math.max(f2 - f4, 0.0f), Math.min(f + f4, f5), Math.min(f2 + f4, f6));
        if (this.f336544r != null) {
            this.f336538l.getClass();
            int i3 = C66557b.f191417d;
            Context context = this.f336527a;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
            int i4 = 0;
            if (rotation != 0) {
                if (rotation == 1) {
                    i4 = 90;
                } else if (rotation == 2) {
                    i4 = 180;
                } else if (rotation == 3) {
                    i4 = 270;
                }
            }
            int i5 = ((i3 - i4) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1;
            RectF rectF2 = new RectF(0.0f, 0.0f, f5, f6);
            RectF rectF3 = C109725a.f328434a;
            this.f336538l.getClass();
            boolean z = C66557b.f191420g;
            float f7 = (float) i5;
            RectF rectF4 = C109725a.f328434a;
            C87412m.m108594g(rectF4, "cameraRect");
            RectF rectF5 = new RectF();
            Matrix matrix = new Matrix();
            matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
            matrix.postRotate(-f7);
            matrix.mapRect(rectF2);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF4, Matrix.ScaleToFit.FILL);
            matrix.setConcat(matrix2, matrix);
            matrix.mapRect(rectF5, rectF);
            Rect rect = new Rect();
            rectF5.round(rect);
            String str = this.f336568x;
            Log.m105924i(str, "calculateTapArea " + rect);
            return rect;
        }
        this.f336538l.getClass();
        float f8 = (float) 2000;
        float f9 = (float) 1000;
        float f15 = f4 / ((float) 2);
        float f16 = (((f / f5) * f8) - f9) - f15;
        float f17 = (((f2 / f6) * f8) - f9) - f15;
        RectF rectF6 = new RectF();
        rectF6.set(f16, f17, f16 + f4, f4 + f17);
        return new Rect(C16095a.m14980b(C60641c.m70921b(rectF6.left), -1000, 1000), C16095a.m14980b(C60641c.m70921b(rectF6.top), -1000, 1000), C16095a.m14980b(C60641c.m70921b(rectF6.right), -1000, 1000), C16095a.m14980b(C60641c.m70921b(rectF6.bottom), -1000, 1000));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo158259c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getFlashMode() {
        /*
            r4 = this;
            gj.z r0 = r4.f336554A
            if (r0 == 0) goto L_0x000f
            android.hardware.Camera$Parameters r0 = r0.mo158259c()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.getFlashMode()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r1 = 2
            if (r0 == 0) goto L_0x0042
            int r2 = r0.hashCode()
            r3 = 3551(0xddf, float:4.976E-42)
            if (r2 == r3) goto L_0x0038
            r3 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 == r3) goto L_0x0031
            r3 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r2 == r3) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.lang.String r2 = "auto"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            r1 = 3
            goto L_0x0042
        L_0x0031:
            java.lang.String r2 = "off"
            boolean r0 = r0.equals(r2)
            goto L_0x0042
        L_0x0038:
            java.lang.String r2 = "on"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r1 = 1
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.getFlashMode():int");
    }

    /* renamed from: h */
    public void mo143169h(SurfaceTexture surfaceTexture, boolean z, int i) {
        this.f336540n = surfaceTexture;
        this.f336535i = z;
        this.f336542p = i;
        if (z) {
            mo164126T(surfaceTexture, (SurfaceHolder) null, i);
        } else {
            mo164127U(surfaceTexture, (SurfaceHolder) null, i);
        }
    }

    /* renamed from: i */
    public void mo143170i(boolean z) {
        try {
            C107848z zVar = this.f336554A;
            Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
            if (z) {
                if (c != null) {
                    c.setFlashMode("torch");
                }
            } else if (c != null) {
                c.setFlashMode("off");
            }
            C107848z zVar2 = this.f336554A;
            if (zVar2 != null) {
                zVar2.mo158262f(c);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(this.f336568x, e, "set flash mode error", new Object[0]);
        }
    }

    /* renamed from: j */
    public void mo143171j(boolean z, boolean z2, int i) {
        int i2;
        if (this.f336554A != null && mo164109B()) {
            try {
                Log.m105919d(this.f336568x, "triggerSmallZoom, zoom: %s", Boolean.valueOf(z));
                if (this.f336547u) {
                    Log.m105918d(this.f336568x, "triggerSmallZoom, zooming, ignore");
                    this.f336547u = false;
                    return;
                }
                C107848z zVar = this.f336554A;
                Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
                if (c != null && c.isZoomSupported()) {
                    this.f336547u = true;
                    int zoom = c.getZoom();
                    int indexOf = this.f336563J.indexOf(Integer.valueOf(zoom));
                    int maxZoom = c.getMaxZoom();
                    Log.m105919d(this.f336568x, "triggerSmallZoom, currentZoom: %s, maxZoom: %s, smallZoomStep: %s, scrollSmallZoomStep: %s, factor: %s", Integer.valueOf(zoom), Integer.valueOf(maxZoom), Integer.valueOf(this.f336548v), Integer.valueOf(this.f336546t), Integer.valueOf(i));
                    if (z) {
                        if (zoom >= maxZoom) {
                            this.f336547u = false;
                            return;
                        } else if (indexOf == this.f336563J.size() - 1) {
                            i2 = ((Number) C110818d0.m150923U(this.f336563J)).intValue();
                        } else {
                            Integer num = this.f336563J.get(indexOf + 1);
                            C87412m.m108593f(num, "{\n                      …                        }");
                            i2 = num.intValue();
                        }
                    } else if (zoom == 0) {
                        this.f336547u = false;
                        return;
                    } else if (indexOf == 0) {
                        i2 = ((Number) C110818d0.m150914L(this.f336563J)).intValue();
                    } else {
                        Integer num2 = this.f336563J.get(indexOf - 1);
                        C87412m.m108593f(num2, "{\n                      …                        }");
                        i2 = num2.intValue();
                    }
                    Log.m105919d(this.f336568x, "triggerSmallZoom, nextZoom: %s, smoothZoomSupported: %s", Integer.valueOf(i2), Boolean.valueOf(c.isSmoothZoomSupported()));
                    c.setZoom(i2);
                    C107848z zVar2 = this.f336554A;
                    if (zVar2 != null) {
                        zVar2.mo158262f(c);
                    }
                }
                this.f336547u = false;
            } catch (Exception e) {
                Log.m105921e(this.f336568x, "triggerSmallZoom error: %s", e.getMessage());
            } catch (Throwable th) {
                this.f336547u = false;
                throw th;
            }
        }
    }

    /* renamed from: k */
    public void mo143172k(int i, int i2) {
        if (this.f336546t <= 0) {
            Point h = C85875k4.m106184h(MMApplicationContext.getContext());
            int i3 = h.y;
            Log.m105925i(this.f336568x, "calcScrollZoomStep, recordButtonTopLocation: %s, screenSize: %s", Integer.valueOf(i), h);
            if (i3 / 2 < i) {
                try {
                    C107848z zVar = this.f336554A;
                    if (zVar != null) {
                        Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
                        int maxZoom = c != null ? c.getMaxZoom() : 0;
                        double d = ((double) maxZoom) / ((((double) i) / 3.0d) / ((double) i2));
                        if (d > 0.0d) {
                            this.f336546t = ((int) d) + 1;
                        }
                        Log.m105925i(this.f336568x, "scrollSmallZoomStep: %s, maxZoom: %s", Integer.valueOf(this.f336546t), Integer.valueOf(maxZoom));
                    }
                } catch (Exception e) {
                    Log.m105921e(this.f336568x, "calcScrollZoomStep error: %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: l */
    public Point mo143173l(boolean z) {
        if (!z) {
            C108393s sVar = this.f336537k;
            return new Point(sVar.f324562c, sVar.f324561b);
        }
        Point point = this.f336545s;
        if (point != null) {
            C87412m.m108591d(point);
            return point;
        }
        C108393s sVar2 = this.f336537k;
        return new Point(sVar2.f324562c, sVar2.f324561b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r2 = r6.f336545s;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A[Catch:{ Exception -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A[Catch:{ Exception -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y80.C66557b mo143174m() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f336568x
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "generateCameraConfig"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r3, r2)
            gj.z r0 = r6.f336554A
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r6.f336568x
            java.lang.String r1 = "generateCameraConfig, camera is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r2
        L_0x0017:
            boolean r0 = r6.mo164109B()
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = r6.f336568x
            java.lang.String r1 = "generateCameraConfig, camera not previewing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r2
        L_0x0025:
            y80.b r0 = r6.f336538l
            gj.z r2 = r6.f336554A
            r3 = 1
            if (r2 != 0) goto L_0x002d
            goto L_0x0051
        L_0x002d:
            gj.f r2 = r6.f336555B
            if (r2 == 0) goto L_0x0051
            boolean r2 = r6.f336535i     // Catch:{ Exception -> 0x0041 }
            if (r2 == 0) goto L_0x003c
            android.graphics.Point r2 = r6.f336545s     // Catch:{ Exception -> 0x0041 }
            if (r2 == 0) goto L_0x003c
            int r2 = r2.x     // Catch:{ Exception -> 0x0041 }
            goto L_0x0052
        L_0x003c:
            i72.s r2 = r6.f336537k     // Catch:{ Exception -> 0x0041 }
            int r2 = r2.f324562c     // Catch:{ Exception -> 0x0041 }
            goto L_0x0052
        L_0x0041:
            r2 = move-exception
            java.lang.String r4 = r6.f336568x
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r5[r1] = r2
            java.lang.String r2 = "getPreviewWidth: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r5)
        L_0x0051:
            r2 = 0
        L_0x0052:
            r0.getClass()
            y80.C66557b.f191416c = r2
            y80.b r0 = r6.f336538l
            gj.z r2 = r6.f336554A
            if (r2 != 0) goto L_0x005e
            goto L_0x0082
        L_0x005e:
            gj.f r2 = r6.f336555B
            if (r2 == 0) goto L_0x0082
            boolean r2 = r6.f336535i     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x006d
            android.graphics.Point r2 = r6.f336545s     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x006d
            int r2 = r2.y     // Catch:{ Exception -> 0x0072 }
            goto L_0x0083
        L_0x006d:
            i72.s r2 = r6.f336537k     // Catch:{ Exception -> 0x0072 }
            int r2 = r2.f324561b     // Catch:{ Exception -> 0x0072 }
            goto L_0x0083
        L_0x0072:
            r2 = move-exception
            java.lang.String r4 = r6.f336568x
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r5[r1] = r2
            java.lang.String r2 = "getPreviewHeight: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r5)
        L_0x0082:
            r2 = 0
        L_0x0083:
            r0.getClass()
            y80.C66557b.f191415b = r2
            gj.f r0 = r6.f336555B
            if (r0 == 0) goto L_0x0098
            int r0 = r0.f322840b
            r2 = 90
            if (r0 == r2) goto L_0x0096
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 != r2) goto L_0x0098
        L_0x0096:
            r0 = 1
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            y80.b r2 = r6.f336538l
            i72.s r4 = r6.f336537k
            int r4 = r4.f324562c
            r2.getClass()
            y80.C66557b.f191418e = r4
            y80.b r2 = r6.f336538l
            i72.s r4 = r6.f336537k
            int r4 = r4.f324561b
            r2.getClass()
            y80.C66557b.f191419f = r4
            if (r0 == 0) goto L_0x00c8
            y80.b r0 = r6.f336538l
            r0.getClass()
            int r0 = y80.C66557b.f191418e
            y80.b r2 = r6.f336538l
            r2.getClass()
            int r2 = y80.C66557b.f191419f
            y80.C66557b.f191418e = r2
            y80.b r2 = r6.f336538l
            r2.getClass()
            y80.C66557b.f191419f = r0
        L_0x00c8:
            y80.b r0 = r6.f336538l
            gj.f r2 = r6.f336555B
            if (r2 == 0) goto L_0x00db
            boolean r2 = r6.mo164109B()
            if (r2 == 0) goto L_0x00db
            gj.f r2 = r6.f336555B
            if (r2 == 0) goto L_0x00dc
            int r1 = r2.f322840b
            goto L_0x00dc
        L_0x00db:
            r1 = -1
        L_0x00dc:
            r0.getClass()
            y80.C66557b.f191417d = r1
            y80.b r0 = r6.f336538l
            boolean r1 = r6.f336533g
            r1 = r1 ^ r3
            r0.getClass()
            y80.C66557b.f191420g = r1
            y80.b r0 = r6.f336538l
            boolean r1 = r6.f336535i
            r0.getClass()
            y80.C66557b.f191421h = r1
            y80.b r0 = r6.f336538l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.mo143174m():y80.b");
    }

    /* renamed from: n */
    public float[] mo143175n() {
        if (this.f336562I == null) {
            C107848z zVar = this.f336554A;
            List<Integer> list = null;
            if (zVar != null) {
                try {
                    Camera.Parameters c = zVar.mo158259c();
                    C87412m.m108591d(c);
                    if (c.isZoomSupported()) {
                        list = c.getZoomRatios();
                    }
                } catch (Exception e) {
                    Log.m105921e(this.f336568x, "getZoom error: %s", e.getMessage());
                }
            }
            if (list == null || list.isEmpty()) {
                this.f336562I = new C111226b();
            } else {
                int intValue = list.get(list.size() - 1).intValue();
                int i = intValue;
                int i2 = 1;
                while (true) {
                    i /= 10;
                    if (i < 10) {
                        break;
                    }
                    i2 *= 10;
                }
                int i3 = intValue / i2;
                if ((intValue + 4) / i2 > i3) {
                    i3++;
                }
                this.f336562I = new C111226b(i3);
                if (10 <= i3) {
                    int i4 = 10;
                    while (true) {
                        int i5 = i4 * i2;
                        if (list.indexOf(Integer.valueOf(i5)) < 0) {
                            int i6 = 1;
                            while (true) {
                                if (i6 > 4) {
                                    break;
                                }
                                int i7 = i5 - i6;
                                if (list.indexOf(Integer.valueOf(i7)) > 0) {
                                    C111226b bVar = this.f336562I;
                                    C87412m.m108591d(bVar);
                                    bVar.mo162974a(i4, i7);
                                    break;
                                }
                                int i8 = i5 + i6;
                                if (list.indexOf(Integer.valueOf(i8)) > 0) {
                                    C111226b bVar2 = this.f336562I;
                                    C87412m.m108591d(bVar2);
                                    bVar2.mo162974a(i4, i8);
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            C111226b bVar3 = this.f336562I;
                            C87412m.m108591d(bVar3);
                            bVar3.mo162974a(i4, i5);
                        }
                        if (i4 == i3) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        C111226b bVar4 = this.f336562I;
        C87412m.m108591d(bVar4);
        float[] fArr = new float[bVar4.f333063f];
        C111226b bVar5 = this.f336562I;
        C87412m.m108591d(bVar5);
        int i9 = bVar5.f333063f;
        for (int i15 = 0; i15 < i9; i15++) {
            C111226b bVar6 = this.f336562I;
            C87412m.m108591d(bVar6);
            fArr[i15] = (((float) bVar6.f333061d[i15]) * 1.0f) / ((float) 10);
        }
        return fArr;
    }

    /* renamed from: o */
    public void mo143176o(int i) {
        C109292b.C61240a aVar;
        HashMap<Integer, C109292b.C61240a.C61241a> hashMap;
        C109292b.C61240a.C61241a aVar2;
        Boolean bool;
        HashMap<Integer, C109292b.C61240a.C61241a> hashMap2;
        SightParams sightParams = C108619m.f325223b.f325224a;
        int i2 = sightParams != null ? sightParams.f248463t : 0;
        C107825d dVar = C107835h0.f322845b;
        boolean z = !(dVar.f322824w == 1 && (i2 == 0 || i2 == 1)) && dVar.f322823v == 1 && (i2 == 0 || i2 == 5);
        C109292b.C61240a aVar3 = this.f336539m;
        Camera.Parameters parameters = null;
        if (aVar3 != null) {
            if ((aVar3 != null ? aVar3.f174308a : null) != null) {
                if (!(((aVar3 == null || (hashMap2 = aVar3.f174308a) == null) ? null : hashMap2.get(Integer.valueOf(this.f336533g ^ true ? 1 : 0))) == null || (aVar = this.f336539m) == null || (hashMap = aVar.f174308a) == null || (aVar2 = hashMap.get(Integer.valueOf(this.f336533g ^ true ? 1 : 0))) == null || (bool = aVar2.f174313d) == null)) {
                    z = bool.booleanValue();
                }
            }
        }
        C107848z zVar = this.f336554A;
        if (zVar != null) {
            parameters = zVar.mo158259c();
        }
        if (parameters != null) {
            if (z) {
                mo164129W(parameters, i);
            } else {
                mo164128V(parameters, i);
            }
            Log.m105925i(this.f336529c, "use fix mode %B, supported preview frame rates %s", Boolean.valueOf(z), parameters.getSupportedPreviewFrameRates());
            C107848z zVar2 = this.f336554A;
            if (zVar2 != null) {
                zVar2.mo158262f(parameters);
            }
            C107848z zVar3 = this.f336554A;
            if (zVar3 != null) {
                zVar3.mo158267k();
            }
        }
    }

    /* renamed from: p */
    public void mo143177p(C32226l<? super Boolean, C13598b0> lVar) {
        this.f336566M = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090 A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A[Catch:{ Exception -> 0x00d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r9 = this;
            y80.a$a r0 = y80.C112397a.C112398a.CAMERA_IS_DEFAULT
            r9.f336534h = r0
            r0 = 0
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            i72.c r2 = r9.f336557D     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r2.mo158895c()     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            i72.c r2 = r9.f336558E     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r2.mo158895c()     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            i72.c r2 = r9.f336559F     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r2.mo158895c()     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            i72.c r2 = r9.f336560G     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r2.mo158895c()     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            i72.c r2 = r9.f336561H     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r2.mo158895c()     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00d5 }
            gj.z r1 = r9.f336554A     // Catch:{ Exception -> 0x00d5 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00cc
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r6 = "release camera beg, %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00d5 }
            android.os.Looper r8 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00d5 }
            r7[r0] = r8     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)     // Catch:{ Exception -> 0x00d5 }
            z80.a r1 = r9.f336531e     // Catch:{ Exception -> 0x00d5 }
            r1.removeCallbacksAndMessages(r3)     // Catch:{ Exception -> 0x00d5 }
            r9.f336565L = r2     // Catch:{ Exception -> 0x00d5 }
            l90.b$a r1 = r9.f336539m     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x009b
            if (r1 == 0) goto L_0x0065
            java.util.HashSet<java.lang.String> r6 = r1.f174309b     // Catch:{ Exception -> 0x00d5 }
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            if (r6 == 0) goto L_0x009b
            if (r1 == 0) goto L_0x007b
            java.util.HashSet<java.lang.String> r1 = r1.f174309b     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x007b
            int r6 = l90.C109292b.f327190v0     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r6 = "preview_callback_remove"
            boolean r1 = r1.contains(r6)     // Catch:{ Exception -> 0x00d5 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x007c
        L_0x007b:
            r1 = r3
        L_0x007c:
            if (r1 == 0) goto L_0x0089
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00d5 }
            boolean r6 = gy3.C87412m.m108589b(r1, r6)     // Catch:{ Exception -> 0x00d5 }
            if (r6 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r6 = 0
            goto L_0x008a
        L_0x0089:
            r6 = 1
        L_0x008a:
            if (r6 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r1 = r3
        L_0x008e:
            if (r1 == 0) goto L_0x00a2
            r1.booleanValue()     // Catch:{ Exception -> 0x00d5 }
            gj.z r1 = r9.f336554A     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x00a2
            r1.mo158263g(r3)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00a2
        L_0x009b:
            gj.z r1 = r9.f336554A     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x00a2
            r1.mo158263g(r3)     // Catch:{ Exception -> 0x00d5 }
        L_0x00a2:
            gj.z r1 = r9.f336554A     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x00a9
            r1.mo158268l()     // Catch:{ Exception -> 0x00d5 }
        L_0x00a9:
            gj.z r1 = r9.f336554A     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x00b0
            r1.mo158260d()     // Catch:{ Exception -> 0x00d5 }
        L_0x00b0:
            r9.f336554A = r3     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r9.f336568x     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r6 = "release camera end, use %dms, %s"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00d5 }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)     // Catch:{ Exception -> 0x00d5 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00d5 }
            r7[r0] = r4     // Catch:{ Exception -> 0x00d5 }
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00d5 }
            r7[r2] = r4     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)     // Catch:{ Exception -> 0x00d5 }
        L_0x00cc:
            z80.a r1 = r9.f336531e     // Catch:{ Exception -> 0x00d5 }
            r1.f337237l = r2     // Catch:{ Exception -> 0x00d5 }
            r9.f336545s = r3     // Catch:{ Exception -> 0x00d5 }
            r9.f336549w = r0     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00df
        L_0x00d5:
            r1 = move-exception
            java.lang.String r2 = r9.f336568x
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "cameraRelease error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112399d.release():void");
    }

    /* renamed from: s */
    public int mo143180s() {
        return this.f336533g ^ true ? 1 : 0;
    }

    public void setFlashMode(int i) {
        if (i == 1) {
            mo143170i(true);
        } else if (i == 2) {
            mo143170i(false);
        }
    }

    /* renamed from: t */
    public void mo143182t(C108382h hVar) {
        String str = this.f336568x;
        Log.printInfoStack(str, "addFrameDataCallback " + hVar, new Object[0]);
        if (hVar != null) {
            synchronized (this.f336564K) {
                ((ArrayList) this.f336570z).add(hVar);
            }
        }
    }

    /* renamed from: u */
    public void mo143183u(float f, float f2, int i, int i2, long j) {
        if (mo164109B() && !C11171e.m11044a(14)) {
            C112609a aVar = this.f336531e;
            int i3 = C112609a.f337225o;
            aVar.removeMessages(4354);
            C112609a aVar2 = this.f336531e;
            aVar2.f337233h = f;
            aVar2.f337234i = f2;
            aVar2.f337235j = i;
            aVar2.f337236k = i2;
            aVar2.sendMessageDelayed(aVar2.obtainMessage(4354, this.f336554A), j);
        }
    }

    /* renamed from: v */
    public void mo143184v(String str, boolean z) {
        C87412m.m108594g(str, "tag");
    }

    /* renamed from: w */
    public void mo143185w(C108382h hVar) {
        String str = this.f336568x;
        Log.printInfoStack(str, "removeFrameDataCallback " + hVar, new Object[0]);
        if (hVar != null) {
            synchronized (this.f336564K) {
                ((ArrayList) this.f336570z).remove(hVar);
            }
        }
    }

    /* renamed from: x */
    public String mo143186x() {
        try {
            C107848z zVar = this.f336554A;
            String str = null;
            Camera.Parameters c = zVar != null ? zVar.mo158259c() : null;
            if (c != null) {
                str = c.getFocusMode();
            }
            if (str == null) {
                str = "auto";
            }
            int hashCode = str.hashCode();
            if (hashCode != -194628547) {
                if (hashCode != 3005871) {
                    if (hashCode == 910005312) {
                        if (str.equals("continuous-picture")) {
                            int i = C109292b.f327190v0;
                            return "continue-picture";
                        }
                    }
                } else if (str.equals("auto")) {
                    int i2 = C109292b.f327190v0;
                    return "auto";
                }
            } else if (str.equals("continuous-video")) {
                int i3 = C109292b.f327190v0;
                return "continue-video";
            }
            int i4 = C109292b.f327190v0;
            return "auto";
        } catch (Exception unused) {
            int i5 = C109292b.f327190v0;
            return "auto";
        }
    }

    /* renamed from: y */
    public void mo143187y() {
        if (mo164109B()) {
            C112609a aVar = this.f336531e;
            int i = C112609a.f337225o;
            aVar.removeMessages(4354);
        }
    }

    /* renamed from: z */
    public void mo143188z(SurfaceTexture surfaceTexture, boolean z, Float f, int i) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        boolean z2 = z;
        Float f2 = f;
        int i2 = i;
        C112397a.C112398a aVar = C112397a.C112398a.CAMERA_IS_PREVIEWING;
        this.f336540n = surfaceTexture2;
        this.f336535i = z2;
        this.f336542p = i2;
        this.f336544r = f2;
        if (f2 == null) {
            mo143169h(surfaceTexture2, z2, i2);
        } else if (z2) {
            float floatValue = f.floatValue();
            long currentTicks = Util.currentTicks();
            String str = this.f336568x;
            Log.m105924i(str, "start startPreviewWithCPURatio,Looper.myLooper(): " + Looper.myLooper() + ",surfaceTexture:" + surfaceTexture2 + ", surface:" + null);
            if (mo164109B()) {
                Log.m105924i(this.f336568x, "startPreviewWithCPU, camera previewing");
                return;
            }
            try {
                if (!mo164122P(floatValue, i2)) {
                    mo164127U(surfaceTexture2, (SurfaceHolder) null, i2);
                    return;
                }
                mo164125S();
                mo164123Q();
                if (mo164118L(surfaceTexture2, (SurfaceHolder) null)) {
                    this.f336534h = aVar;
                }
                Log.m105925i(this.f336568x, "start preview end, use %dms %s", Long.valueOf(Util.ticksToNow(currentTicks)), Looper.myLooper());
            } catch (Exception e) {
                Log.m105921e(this.f336568x, "start preview FAILED, %s, %s", Looper.myLooper(), e.getMessage());
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
                C115669n.INSTANCE.mo175913w(985, 5, 1);
            }
        } else {
            float floatValue2 = f.floatValue();
            long currentTicks2 = Util.currentTicks();
            String str2 = this.f336568x;
            Log.m105924i(str2, "start startPreviewWithGPU,Looper.myLooper(): " + Looper.myLooper() + "  ,surfaceTexture:" + surfaceTexture2 + ", surface:" + null);
            if (mo164109B()) {
                Log.m105924i(this.f336568x, "startPreviewWithGPU, camera previewing");
                return;
            }
            try {
                if (!mo164122P(floatValue2, i2)) {
                    mo164127U(surfaceTexture2, (SurfaceHolder) null, i2);
                    return;
                }
                mo164125S();
                if (this.f336536j) {
                    mo164124R();
                }
                if (mo164118L(surfaceTexture2, (SurfaceHolder) null)) {
                    this.f336534h = aVar;
                }
                Log.m105925i(this.f336568x, "start preview end, use %dms %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Looper.myLooper());
            } catch (Exception e2) {
                Log.m105921e(this.f336568x, "start preview FAILED, %s, %s", Looper.myLooper(), e2.getMessage());
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markCameraOpenFailed");
                C115669n.INSTANCE.mo175913w(985, 5, 1);
            }
        }
    }
}
