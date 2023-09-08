package f72;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.util.Size;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import i72.C98609j;
import j72.C98921l;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p156gj.C107822b0;
import p156gj.C107835h0;
import p914oj.C89231c;

/* renamed from: f72.b */
public class C97842b {

    /* renamed from: a */
    public static boolean f286991a;

    /* renamed from: b */
    public static int f286992b;

    /* renamed from: c */
    public static int f286993c;

    /* renamed from: d */
    public static ConcurrentHashMap<String, Long> f286994d = new ConcurrentHashMap<>();

    /* renamed from: f72.b$a */
    public class C97843a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f286995d;

        /* renamed from: e */
        public final /* synthetic */ String f286996e;

        public C97843a(int i, String str) {
            this.f286995d = i;
            this.f286996e = str;
        }

        public void run() {
            int i = C97842b.f286993c;
            while (true) {
                int i2 = this.f286995d;
                if (i < i2) {
                    C86009m1 m1Var = new C86009m1(String.format("%s/tempvideo%s.mp4", new Object[]{this.f286996e, Integer.valueOf(i)}));
                    if (m1Var.mo119967g()) {
                        m1Var.mo119966f();
                    }
                    C86009m1 m1Var2 = new C86009m1(m1Var.mo119971i() + ".remux");
                    if (m1Var2.mo119967g()) {
                        m1Var2.mo119966f();
                    }
                    C86009m1 m1Var3 = new C86009m1(m1Var.mo119969h() + ".thumb");
                    if (m1Var3.mo119967g()) {
                        m1Var3.mo119966f();
                    }
                    i++;
                } else {
                    C97842b.f286993c = Math.max(i2, 0);
                    return;
                }
            }
        }
    }

    /* renamed from: f72.b$b */
    public static class C97844b implements Comparator<Camera.Size> {
        public C97844b(C97843a aVar) {
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
    public static int m126284a(int i) {
        if (i % 16 == 0) {
            return i;
        }
        while (i % 16 != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static int m126285b(int i, int i2) {
        int i3 = i % 32;
        if (i3 == 0) {
            return i;
        }
        int min = i - Math.min(32, i3);
        return min < i2 ? min : i - i3;
    }

    /* renamed from: c */
    public static boolean m126286c(int i, int i2, int i3, PInt pInt, PInt pInt2) {
        boolean z;
        int i4;
        int i5;
        if (i3 <= 0 || Math.min(i, i2) <= i3) {
            z = false;
            i5 = i;
            i4 = i2;
        } else {
            if (i < i2) {
                i4 = (int) (((float) i2) / ((((float) i) * 1.0f) / ((float) i3)));
                i5 = i3;
            } else {
                i5 = (int) (((float) i) / ((((float) i2) * 1.0f) / ((float) i3)));
                i4 = i3;
            }
            z = true;
        }
        pInt.value = i5;
        pInt2.value = i4;
        Log.m105919d("MicroMsg.MMSightUtil", "check bitmap size result[%b] raw[%d %d] minSize[%d] out[%d %d]", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value));
        return z;
    }

    /* renamed from: d */
    public static boolean m126287d(Context context, Point point, boolean z) {
        float f;
        int i;
        Point g = m126290g(context);
        float f2 = ((float) g.y) / ((float) g.x);
        if (z) {
            f = (float) point.x;
            i = point.y;
        } else {
            f = (float) point.y;
            i = point.x;
        }
        float f3 = f / ((float) i);
        float abs = Math.abs(f2 - f3);
        Log.m105925i("MicroMsg.MMSightUtil", "checkIfNeedUsePreviewLarge: previewSize: %s, displaySize: %s, displayRatio: %s, previewRatio: %s, diff: %s", point, g, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(abs));
        return abs > 0.01f;
    }

    /* renamed from: e */
    public static Point m126288e(Point point, Point point2, boolean z, boolean z2) {
        int i = point2.x;
        int i2 = point2.y;
        int i3 = (int) (((float) i2) * (((float) (z ? point.y : point.x)) / ((float) (z ? point.x : point.y))));
        if (i3 % 2 != 0) {
            i3++;
        }
        if (z2) {
            i3 = m126303t(i3, i2);
        }
        Log.m105925i("MicroMsg.MMSightUtil", "getCropPreviewSizeWithHeight, previewSize: %s, displaySize: %s, width: %s, newWidth: %s, makeMediaCodecHappy %s, , isRoate: %s", point2, point, Integer.valueOf(i), Integer.valueOf(i3), Boolean.valueOf(z2), Boolean.valueOf(z));
        if (i3 <= point2.x) {
            return new Point(i3, i2);
        }
        Log.m105924i("MicroMsg.MMSightUtil", "can not adapt to screen");
        return null;
    }

    /* renamed from: f */
    public static Point m126289f(Point point, Point point2, boolean z, boolean z2) {
        int i = point2.x;
        int i2 = point2.y;
        int i3 = z ? point.y : point.x;
        float f = (float) (z ? point.x : point.y);
        float f2 = (float) i3;
        int i4 = (int) (((float) i) * (f / f2));
        if (i4 % 2 != 0) {
            i4--;
        }
        int i5 = (int) (((float) i2) * (f2 / f));
        if (z2) {
            i4 = m126303t(i4, i2);
        }
        Log.m105925i("MicroMsg.MMSightUtil", "getCropPreviewSizeWithHeight, previewSize: %s, displaySize: %s, width: %s, newHeight: %s makeMediaCodecHappy %s, newWidth: %s, isRoate: %s", point2, point, Integer.valueOf(i), Integer.valueOf(i4), Boolean.valueOf(z2), Integer.valueOf(i5), Boolean.valueOf(z));
        if (i4 <= point2.y && i <= point2.x) {
            return new Point(i, i4);
        }
        Log.m105924i("MicroMsg.MMSightUtil", "can not adapt to screen");
        return null;
    }

    /* renamed from: g */
    public static Point m126290g(Context context) {
        Point h = C85875k4.m106184h(context);
        if (!f286991a && C85875k4.m106190k(context)) {
            h.y -= C85875k4.m106188j(context);
        }
        return h;
    }

    /* renamed from: h */
    public static String m126291h(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(AndroidMediaUtil.getSysCameraDirPath());
        Object[] objArr = new Object[3];
        objArr[0] = WeChatBrands.AppInfo.current().isMainland() ? "wx_camera_" : "w_camera_";
        objArr[1] = Long.valueOf(System.currentTimeMillis());
        objArr[2] = str;
        sb.append(String.format("%s%d.%s", objArr));
        return sb.toString();
    }

    /* renamed from: i */
    public static String m126292i(String str) {
        if (Build.VERSION.SDK_INT > 29) {
            return m126291h(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154245q());
        Object[] objArr = new Object[3];
        objArr[0] = WeChatBrands.AppInfo.current().isMainland() ? "wx_camera_" : "w_camera_";
        objArr[1] = Long.valueOf(System.currentTimeMillis());
        objArr[2] = str;
        sb.append(String.format("%s%d.%s", objArr));
        return sb.toString();
    }

    /* renamed from: j */
    public static String m126293j(String str) {
        try {
            return C94555d.m119568d(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSightUtil", "getMediaInfo error: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: k */
    public static Point m126294k() {
        return C85875k4.m106184h(MMApplicationContext.getContext());
    }

    /* renamed from: l */
    public static String m126295l(String str) {
        int i = f286992b;
        f286992b = i + 1;
        C86009m1 m1Var = new C86009m1(String.format("%s/tempvideo%s.mp4", new Object[]{str, Integer.valueOf(i)}));
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        C86009m1 m1Var2 = new C86009m1(m1Var.mo119971i() + ".remux");
        if (m1Var2.mo119967g()) {
            m1Var2.mo119966f();
        }
        C86009m1 m1Var3 = new C86009m1(m1Var.mo119969h() + ".thumb");
        if (m1Var3.mo119967g()) {
            m1Var3.mo119966f();
        }
        C86009m1 m1Var4 = new C86009m1(m1Var.mo119969h() + ".soundmp4");
        if (m1Var4.mo119967g()) {
            m1Var4.mo119966f();
        }
        C98609j.f289118a.postToWorker(new C97843a(f286992b - 3, str));
        return m1Var.mo119971i();
    }

    /* renamed from: m */
    public static String m126296m(String str) {
        C86009m1 m1Var = new C86009m1(String.format("%s/%s.mp4", new Object[]{str, Long.valueOf(System.currentTimeMillis())}));
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        return m1Var.mo119971i();
    }

    /* renamed from: n */
    public static String m126297n(String str) {
        return Util.nullAs(str, "") + ".thumb";
    }

    /* renamed from: o */
    public static long m126298o(String str) {
        if (!f286994d.containsKey(str)) {
            return 0;
        }
        return System.currentTimeMillis() - f286994d.get(str).longValue();
    }

    /* renamed from: p */
    public static int m126299p(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
        return (int) (((double) memoryInfo.totalMem) / 1024.0d);
    }

    /* renamed from: q */
    public static Bitmap m126300q(String str) {
        return m126301r(str, 0);
    }

    /* renamed from: r */
    public static Bitmap m126301r(String str, long j) {
        int i;
        int i2;
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            Log.m105921e("MicroMsg.MMSightUtil", "getVideoThumb, %s not exist!!", str);
            return null;
        }
        Log.m105925i("MicroMsg.MMSightUtil", "getVideoThumb, %s", str);
        C107822b0 b0Var = C107835h0.f322852i;
        boolean z = b0Var == null || b0Var.f322647C != 1;
        try {
            int mp4RotateVFS = SightVideoJNI.getMp4RotateVFS(str);
            if (z) {
                C89231c cVar = new C89231c();
                cVar.setDataSource(C86013q1.m106448i(str, false));
                i2 = Util.getInt(cVar.extractMetadata(18), -1);
                i = Util.getInt(cVar.extractMetadata(19), -1);
                Log.m105925i("MicroMsg.MMSightUtil", "getVideoThumb, width: %s, height: %s, rotate: %s", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(mp4RotateVFS));
                Bitmap frameAtTime = cVar.getFrameAtTime(j, 2);
                Log.m105924i("MicroMsg.MMSightUtil", "retriever.getFrameAtTime finish");
                cVar.release();
                if (frameAtTime != null) {
                    Log.m105924i("MicroMsg.MMSightUtil", "use MediaMetadataRetriever, success! ");
                    return frameAtTime;
                }
            } else {
                i2 = 0;
                i = 0;
            }
            Log.m105924i("MicroMsg.MMSightUtil", "use MediaMetadataRetriever failed, try ffmpeg");
            if (i2 <= 0 || i <= 0) {
                String simpleMp4InfoVFS = SightVideoJNI.getSimpleMp4InfoVFS(str);
                Log.m105925i("MicroMsg.MMSightUtil", "getSimpleMp4Info: %s", simpleMp4InfoVFS);
                JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
                i2 = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
                i = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            }
            byte[] videoThumbVFS = MP4MuxerJNI.getVideoThumbVFS(str, i2, i);
            if (videoThumbVFS == null) {
                Log.m105920e("MicroMsg.MMSightUtil", "getVideoThumb, error, can not get rgb byte!!");
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(videoThumbVFS);
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(wrap);
            return mp4RotateVFS > 0 ? BitmapUtil.rotate(createBitmap, (float) mp4RotateVFS) : createBitmap;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMSightUtil", "get video thumb error!");
            Log.printErrStackTrace("MicroMsg.MMSightUtil", e, "get video thumb error! %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: s */
    public static int m126302s(int i) {
        return m126303t(i, Integer.MAX_VALUE);
    }

    /* renamed from: t */
    public static int m126303t(int i, int i2) {
        int i3 = i % 16;
        if (i3 == 0) {
            return i;
        }
        int i4 = (16 - i3) + i;
        return i4 < i2 ? i4 : i - i3;
    }

    /* renamed from: u */
    public static String m126304u(Size[] sizeArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Size size : sizeArr) {
            stringBuffer.append("size: " + size.getHeight() + "," + size.getWidth() + " " + ((((double) size.getHeight()) * 1.0d) / ((double) size.getWidth())) + "||");
        }
        return stringBuffer.toString();
    }

    /* renamed from: v */
    public static String m126305v(List<Camera.Size> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Camera.Size next : list) {
            stringBuffer.append("size: " + next.height + "," + next.width + " " + ((((double) next.height) * 1.0d) / ((double) next.width)) + "||");
        }
        return stringBuffer.toString();
    }

    /* renamed from: w */
    public static String m126306w(List<Camera.Size> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Camera.Size next : list) {
            stringBuffer.append("size: " + next.height + "," + next.width + ";");
        }
        return stringBuffer.toString();
    }

    /* renamed from: x */
    public static byte[] m126307x(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = bArr;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i6 == 0) {
            return bArr2;
        }
        byte[] n = C98921l.f289964d.mo126905m(Integer.valueOf(bArr2.length));
        int i7 = i4 * i5;
        boolean z = i6 % 180 != 0;
        boolean z2 = i6 % 270 != 0;
        boolean z3 = i6 >= 180;
        for (int i8 = 0; i8 < i5; i8++) {
            for (int i9 = 0; i9 < i4; i9++) {
                int i15 = (i8 * i4) + i9;
                int i16 = ((i8 >> 1) * i4) + i7 + (i9 & -2);
                int i17 = i16 + 1;
                int i18 = z ? i5 : i4;
                int i19 = z ? i4 : i5;
                int i25 = z ? i8 : i9;
                int i26 = z ? i9 : i8;
                if (z2) {
                    i25 = (i18 - i25) - 1;
                }
                if (z3) {
                    i26 = (i19 - i26) - 1;
                }
                int i27 = i7 + ((i26 >> 1) * i18) + (i25 & -2);
                n[(i26 * i18) + i25] = (byte) (bArr2[i15] & ExifInterface.MARKER);
                n[i27] = (byte) (bArr2[i16] & ExifInterface.MARKER);
                n[i27 + 1] = (byte) (bArr2[i17] & ExifInterface.MARKER);
            }
        }
        C98921l.f289964d.mo138260o(bArr2);
        return n;
    }

    /* renamed from: y */
    public static void m126308y(String str) {
        Log.m105925i("MicroMsg.MMSightUtil", "setTime key %s %s", str, Util.getStack().toString());
        f286994d.put(str, Long.valueOf(System.currentTimeMillis()));
    }
}
