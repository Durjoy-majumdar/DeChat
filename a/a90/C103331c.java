package a90;

import android.graphics.Point;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import b90.C104059b;
import c90.C104325a;
import com.tencent.p014mm.sdk.platformtools.Log;
import d90.C107026a;
import di3.C86312j;
import e90.C107267a;
import fy3.C32226l;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import n90.C109726b;
import rx3.C13598b0;

/* renamed from: a90.c */
public final class C103331c {

    /* renamed from: a */
    public static final C103331c f304672a = new C103331c();

    /* renamed from: b */
    public static CameraManager f304673b = null;

    /* renamed from: c */
    public static String f304674c = null;

    /* renamed from: d */
    public static int f304675d = 0;

    /* renamed from: e */
    public static Point f304676e = null;

    /* renamed from: f */
    public static boolean f304677f = true;

    /* renamed from: g */
    public static boolean f304678g = false;

    /* renamed from: h */
    public static boolean f304679h = true;

    /* renamed from: i */
    public static boolean f304680i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_camera_use_video_stabilization_switch, true);

    /* renamed from: j */
    public static boolean f304681j = true;

    /* renamed from: k */
    public static String f304682k;

    /* renamed from: l */
    public static int f304683l = 40;

    /* renamed from: m */
    public static int f304684m = 40;

    /* renamed from: n */
    public static boolean f304685n;

    /* renamed from: o */
    public static C32226l<? super Boolean, C13598b0> f304686o;

    /* renamed from: p */
    public static Boolean f304687p;

    /* renamed from: q */
    public static ArrayList<C104325a> f304688q;

    /* renamed from: r */
    public static ArrayList<C107026a> f304689r;

    /* renamed from: s */
    public static ArrayList<C107267a> f304690s;

    static {
        int[] iArr = C109726b.f328435a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0068 A[EDGE_INSN: B:66:0x0068->B:27:0x0068 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo143134a(android.hardware.camera2.CaptureRequest.Builder r12, java.util.List<java.lang.String> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "builder"
            gy3.C87412m.m108594g(r12, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r0 = f304674c
            gy3.C87412m.m108591d(r0)
            java.util.ArrayList<c90.a> r1 = f304688q
            java.lang.String r2 = "0"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 2
        L_0x001d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x007d
            java.util.Iterator r13 = r13.iterator()
        L_0x002a:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x007d
            java.lang.Object r6 = r13.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r1 == 0) goto L_0x006b
            java.util.Iterator r7 = r1.iterator()
        L_0x003c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0067
            java.lang.Object r8 = r7.next()
            r9 = r8
            c90.a r9 = (c90.C104325a) r9
            java.lang.String r10 = r9.f308794h
            boolean r10 = gy3.C87412m.m108589b(r10, r6)
            if (r10 == 0) goto L_0x0063
            java.lang.Integer r9 = r9.f308795i
            if (r9 == 0) goto L_0x005e
            int r9 = r9.intValue()
            r9 = r9 & r0
            if (r9 != 0) goto L_0x005e
            r9 = 1
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            if (r9 != 0) goto L_0x0063
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 == 0) goto L_0x003c
            goto L_0x0068
        L_0x0067:
            r8 = r4
        L_0x0068:
            c90.a r8 = (c90.C104325a) r8
            goto L_0x006c
        L_0x006b:
            r8 = r4
        L_0x006c:
            if (r8 == 0) goto L_0x0071
            java.lang.String r6 = r8.f308799m
            goto L_0x0072
        L_0x0071:
            r6 = r4
        L_0x0072:
            if (r6 == 0) goto L_0x002a
            java.lang.String r6 = r8.f308799m
            gy3.C87412m.m108591d(r6)
            r3.add(r6)
            goto L_0x002a
        L_0x007d:
            java.util.Iterator r13 = r3.iterator()
        L_0x0081:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r5] = r0
            java.lang.String r3 = "MicroMsg.CameraUtil"
            java.lang.String r6 = "request tag %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r1)
            r12.add(r0)
            goto L_0x0081
        L_0x009c:
            java.util.ArrayList<e90.a> r13 = f304690s
            if (r13 == 0) goto L_0x00f0
            java.util.Iterator r13 = r13.iterator()
        L_0x00a4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r13.next()
            r1 = r0
            e90.a r1 = (e90.C107267a) r1
            r1.getClass()
            java.util.Iterator r3 = r12.iterator()
            r6 = 0
        L_0x00b9:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00e7
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList<java.lang.String> r7 = r1.f320937e
            java.util.Iterator r7 = r7.iterator()
        L_0x00cb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00df
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = gy3.C87412m.m108589b(r9, r6)
            if (r9 == 0) goto L_0x00cb
            goto L_0x00e0
        L_0x00df:
            r8 = r4
        L_0x00e0:
            if (r8 == 0) goto L_0x00e4
            r6 = 1
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            if (r6 != 0) goto L_0x00b9
        L_0x00e7:
            if (r6 == 0) goto L_0x00a4
            r4 = r0
        L_0x00ea:
            e90.a r4 = (e90.C107267a) r4
            if (r4 == 0) goto L_0x00f0
            int r5 = r4.f320936d
        L_0x00f0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103331c.mo143134a(android.hardware.camera2.CaptureRequest$Builder, java.util.List):int");
    }

    /* renamed from: b */
    public final String mo143135b(int i) {
        Integer num;
        CameraManager cameraManager = f304673b;
        String str = null;
        String[] cameraIdList = cameraManager != null ? cameraManager.getCameraIdList() : null;
        if (cameraIdList != null) {
            int length = cameraIdList.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str2 = cameraIdList[i2];
                CameraManager cameraManager2 = f304673b;
                CameraCharacteristics cameraCharacteristics = cameraManager2 != null ? cameraManager2.getCameraCharacteristics(str2) : null;
                if ((cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) == null || num.intValue() != i) ? false : true) {
                    str = str2;
                    break;
                }
                i2++;
            }
        }
        if (str != null) {
            return str;
        }
        Log.m105921e("MicroMsg.CameraUtil", "can not find the id: %s in camera manage", Integer.valueOf(i));
        return String.valueOf(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = r2.getCameraCharacteristics(r0);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Size[] mo143136c() {
        /*
            r4 = this;
            java.lang.String r0 = f304674c
            if (r0 != 0) goto L_0x0009
            r0 = 1
            java.lang.String r0 = r4.mo143135b(r0)
        L_0x0009:
            r1 = 35
            android.hardware.camera2.CameraManager r2 = f304673b
            r3 = 0
            if (r2 == 0) goto L_0x001f
            android.hardware.camera2.CameraCharacteristics r0 = r2.getCameraCharacteristics(r0)
            if (r0 == 0) goto L_0x001f
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r0 = r0.get(r2)
            android.hardware.camera2.params.StreamConfigurationMap r0 = (android.hardware.camera2.params.StreamConfigurationMap) r0
            goto L_0x0020
        L_0x001f:
            r0 = r3
        L_0x0020:
            if (r0 == 0) goto L_0x0026
            android.util.Size[] r3 = r0.getOutputSizes(r1)
        L_0x0026:
            gy3.C87412m.m108591d(r3)
            java.lang.String r0 = "image"
            r4.mo143137d(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.C103331c.mo143136c():android.util.Size[]");
    }

    /* renamed from: d */
    public final void mo143137d(Size[] sizeArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Size size : sizeArr) {
            stringBuffer.append("size: " + size.getHeight() + ',' + size.getWidth() + " ratios " + ((((double) size.getHeight()) * 1.0d) / ((double) size.getWidth())) + "||");
        }
        Log.m105924i("MicroMsg.CameraUtil", "Print currentCamera " + f304674c + " support " + str + " sizes " + stringBuffer);
    }

    /* renamed from: e */
    public final void mo143138e(CaptureRequest.Builder builder) {
        C87412m.m108594g(builder, "builder");
        ArrayList<C104325a> arrayList = f304688q;
        if (arrayList != null) {
            for (C104325a aVar : arrayList) {
                Log.m105924i("MicroMsg.CameraUtil", "close effect :  " + aVar.f308799m);
                Object obj = aVar.f308796j;
                C87412m.m108591d(obj);
                C104059b.m138818a(builder, aVar, false, obj);
            }
        }
    }

    /* renamed from: f */
    public final void mo143139f(boolean z, CaptureRequest.Builder builder) {
        C87412m.m108594g(builder, "builder");
        if (C109726b.m149048c()) {
            if (z) {
                builder.set(CaptureRequest.FLASH_MODE, 1);
            } else {
                builder.set(CaptureRequest.FLASH_MODE, 0);
            }
        } else if (z) {
            builder.set(CaptureRequest.FLASH_MODE, 2);
        } else {
            builder.set(CaptureRequest.FLASH_MODE, 0);
        }
    }
}
