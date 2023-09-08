package ho0;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.wxmm.v2encoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import js0.C88016e;
import js0.C88024r;
import js0.C9514m;
import org.json.JSONException;
import org.json.JSONObject;
import xk0.C91266d;
import xk0.C91267e;

/* renamed from: ho0.g */
public class C87573g extends C91267e {
    public static final int CTRL_INDEX = 100;
    public static final String NAME = "canvasToTempFilePath";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        int i3 = 0;
        if (jSONObject2 != null && jSONObject2.has("data")) {
            Log.m105925i("MicroMsg.JsApiXWebCanvasToTempFilePath", "invokeXWebCanvasJsApi data:%s", jSONObject2);
            int optInt = jSONObject2.optInt("width", 300);
            int optInt2 = jSONObject2.optInt("height", 150);
            float f = Util.getFloat(jSONObject2.optString("destWidth"), (float) optInt);
            float f2 = Util.getFloat(jSONObject2.optString("destHeight"), (float) optInt2);
            try {
                Object obj = jSONObject2.get("data");
                if (!(obj instanceof ByteBuffer)) {
                    Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath", "get data failed, value is not a ByteBuffer");
                    fVar2.mo109647a(i2, mo115109j("fail:illegal data"));
                    return;
                }
                byte[] a = C88016e.m109544a((ByteBuffer) obj);
                int length = a.length / 4;
                int[] iArr = new int[length];
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = length;
                    byte b = ((a[i4] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((a[i5] & ExifInterface.MARKER) << 8);
                    int i8 = i6 + 1;
                    i4 = i8 + 1;
                    iArr[i3] = (a[i6] & ExifInterface.MARKER) | b | ((a[i8] & ExifInterface.MARKER) << 24);
                    i3++;
                    JSONObject jSONObject3 = jSONObject;
                    length = i7;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = Bitmap.createBitmap(iArr, optInt, optInt2, Bitmap.Config.ARGB_8888);
                } catch (Exception e) {
                    Log.printInfoStack("MicroMsg.JsApiXWebCanvasToTempFilePath", "create bitmap fail:%s", e);
                } catch (Throwable th) {
                    Log.printInfoStack("MicroMsg.JsApiXWebCanvasToTempFilePath", "create bitmap fail:%s", th);
                }
                if (bitmap == null) {
                    Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath", "oriBitmap is null, err, return");
                    fVar2.mo109647a(i2, mo115109j("fail:illegal bitmap"));
                    return;
                }
                if (!(((float) bitmap.getWidth()) == f && ((float) bitmap.getHeight()) == f2)) {
                    try {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f2, false);
                        Log.m105925i("MicroMsg.JsApiXWebCanvasToTempFilePath", "bitmap recycle %s %s ", bitmap, createScaledBitmap);
                        bitmap = createScaledBitmap;
                    } catch (Exception e2) {
                        Log.printInfoStack("MicroMsg.JsApiXWebCanvasToTempFilePath", "create scaledbitmap fail:%s", e2);
                    } catch (Throwable th4) {
                        Log.printInfoStack("MicroMsg.JsApiXWebCanvasToTempFilePath", "create scaledbitmap fail:%s", th4);
                    }
                }
                if (bitmap == null) {
                    Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath", "oriBitmap is null, err, return");
                    fVar2.mo109647a(i2, mo115109j("fail:illegal bitmap"));
                    return;
                }
                Bitmap.CompressFormat w = C91267e.m114491w(jSONObject);
                String str = w == Bitmap.CompressFormat.JPEG ? "jpg" : "png";
                C81415h0 fileSystem = fVar.getFileSystem();
                C86009m1 allocTempFile = fileSystem.allocTempFile("canvas_" + System.currentTimeMillis() + "." + str);
                if (allocTempFile == null) {
                    Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath", "toTempFilePath, alloc file failed");
                    fVar2.mo109647a(i2, mo115109j("fail alloc file failed"));
                    return;
                }
                String i9 = allocTempFile.mo119971i();
                Log.m105919d("MicroMsg.JsApiXWebCanvasToTempFilePath", "toTempFilePath, savePath = %s", i9);
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, C91267e.m114492x(jSONObject), w, i9, true);
                    C9514m mVar = new C9514m();
                    fVar.getFileSystem().createTempFileFrom(new C86009m1(i9), str, true, mVar);
                    String str2 = (String) mVar.f29691a;
                    Log.m105919d("MicroMsg.JsApiXWebCanvasToTempFilePath", "toTempFilePath, returnPath = %s", str2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("tempFilePath", str2);
                    fVar2.mo109647a(i2, mo115112m("ok", hashMap));
                } catch (IOException e3) {
                    Log.m105929w("MicroMsg.JsApiXWebCanvasToTempFilePath", "save bitmap to file failed. exception : %s", e3);
                    fVar2.mo109647a(i2, mo115109j("fail:write file failed"));
                }
            } catch (JSONException e4) {
                Log.m105921e("MicroMsg.JsApiXWebCanvasToTempFilePath", "get data failed, %s", android.util.Log.getStackTraceString(e4));
                fVar2.mo109647a(i2, mo115109j("fail:missing data"));
            }
        } else {
            C88024r.m109571a().postToWorker(new C91266d(this, fVar2, i2, jSONObject));
        }
    }
}
