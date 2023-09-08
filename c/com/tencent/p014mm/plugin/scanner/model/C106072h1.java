package com.tencent.p014mm.plugin.scanner.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Bundle;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.scanner.C115670k;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanTranslationResultUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import ml2.C10931f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.model.h1 */
public final class C106072h1 extends C10931f<Bundle> {

    /* renamed from: com.tencent.mm.plugin.scanner.model.h1$a */
    public static final class C106073a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C106072h1 f315816d;

        /* renamed from: e */
        public final /* synthetic */ String f315817e;

        public C106073a(C106072h1 h1Var, String str) {
            this.f315816d = h1Var;
            this.f315817e = str;
        }

        public final void run() {
            C106072h1 h1Var = this.f315816d;
            String str = this.f315817e;
            h1Var.getClass();
            if (!Util.isNullOrNil(str)) {
                int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
                Log.m105925i("MicroMsg.ScanTranslateHandler", "alvinluo processImage degree %s", Integer.valueOf(orientationInDegree));
                Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(str);
                if (decodeFileWithSample != null) {
                    Bitmap rotate = BitmapUtil.rotate(decodeFileWithSample, (float) orientationInDegree);
                    C87412m.m108591d(str);
                    C87412m.m108593f(rotate, "originalBitmap");
                    h1Var.mo151628e(str, 1, rotate, 0);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.h1$b */
    public static final class C106074b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C106072h1 f315818d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f315819e;

        /* renamed from: f */
        public final /* synthetic */ Point f315820f;

        /* renamed from: g */
        public final /* synthetic */ int f315821g;

        /* renamed from: h */
        public final /* synthetic */ long f315822h;

        public C106074b(C106072h1 h1Var, byte[] bArr, Point point, int i, long j) {
            this.f315818d = h1Var;
            this.f315819e = bArr;
            this.f315820f = point;
            this.f315821g = i;
            this.f315822h = j;
        }

        public final void run() {
            C106072h1 h1Var = this.f315818d;
            byte[] bArr = this.f315819e;
            Point point = this.f315820f;
            int i = this.f315821g;
            long j = this.f315822h;
            h1Var.getClass();
            try {
                if ((!(bArr.length == 0)) && point != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    YuvImage yuvImage = r3;
                    YuvImage yuvImage2 = new YuvImage(bArr, 17, point.x, point.y, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                    Bitmap decodeByteArray = BitmapUtil.decodeByteArray(byteArrayOutputStream.toByteArray());
                    int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
                    if (decodeByteArray != null) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        Bitmap rotate = BitmapUtil.rotate(decodeByteArray, (float) i);
                        Log.m105925i("MicroMsg.ScanTranslateHandler", "alvinluo processFrame decode cost %d, rotate cost %d", Integer.valueOf(currentTimeMillis2), Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis3)));
                        if (rotate != null) {
                            String L40 = ((C115670k) C86312j.m106911c(C115670k.class)).L40("jpg");
                            C87412m.m108593f(L40, "originalPath");
                            h1Var.mo151628e(L40, 0, rotate, j);
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanTranslateHandler", e, "alvinluo scanTranslate processFrame exception", new Object[0]);
            }
        }
    }

    public C106072h1(Context context) {
        C87412m.m108594g(context, "context");
        this.f32582f = context;
    }

    /* renamed from: d */
    public void mo360a(long j, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("key_translate_file_path");
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                ((C119157j) C119157j.f356862d).mo183870a(new C106073a(this, string));
                return;
            }
            byte[] byteArray = bundle.getByteArray("key_translate_yuv_byte_array");
            if (byteArray == null) {
                byteArray = new byte[0];
            }
            byte[] bArr = byteArray;
            if (!(bArr.length == 0)) {
                ((C119157j) C119157j.f356862d).mo183870a(new C106074b(this, bArr, (Point) bundle.getParcelable("key_translate_camera_resolution"), bundle.getInt("key_translate_camera_rotation", 0), bundle.getLong("key_translate_capture_time", 0)));
            }
        }
    }

    public void destroy() {
    }

    /* renamed from: e */
    public final void mo151628e(String str, int i, Bitmap bitmap, long j) {
        Log.m105925i("MicroMsg.ScanTranslateHandler", "alvinluo jumpResultUI originPath: %s, captureTime: %d", str, Long.valueOf(j));
        ConcurrentHashMap<String, Bitmap> concurrentHashMap = C57318j1.f164194a;
        C87412m.m108594g(str, "path");
        C57318j1.f164194a.put(str, bitmap);
        Intent intent = new Intent();
        intent.putExtra("key_translation_origin_image_path", str);
        intent.putExtra("key_translation_source", i);
        intent.putExtra("key_translation_capture_time", j);
        intent.setClass(this.f32582f, ScanTranslationResultUI.class);
        Context context = this.f32582f;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/model/ScanTranslateHandler", "jumpResultUI", "(Ljava/lang/String;ILandroid/graphics/Bitmap;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/scanner/model/ScanTranslateHandler", "jumpResultUI", "(Ljava/lang/String;ILandroid/graphics/Bitmap;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
