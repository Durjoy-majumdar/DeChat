package ho0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.skia_canvas.SkiaCanvasView;
import fo0.C87018f;
import java.io.IOException;
import java.util.HashMap;
import js0.C9514m;
import org.json.JSONObject;
import xk0.C91267e;

/* renamed from: ho0.f */
public class C87572f extends C91267e {
    public static final int CTRL_INDEX = 100;
    public static final String NAME = "xwebCanvasToTempFilePath";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105925i("MicroMsg.JsApiXWebCanvasToTempFilePath2", "invokeXWebCanvasJsApi data:%s", jSONObject);
        int i2 = (int) Util.getFloat(jSONObject.optString("x"), 0.0f);
        int i3 = (int) Util.getFloat(jSONObject.optString("y"), 0.0f);
        int i4 = (int) Util.getFloat(jSONObject.optString("width"), 0.0f);
        int i5 = (int) Util.getFloat(jSONObject.optString("height"), 0.0f);
        int optInt = jSONObject.optInt("viewId", 0);
        SkiaCanvasView a = C87018f.m108049a(optInt);
        if (a == null) {
            Log.m105921e("MicroMsg.JsApiXWebCanvasToTempFilePath2", "get skiaCanvasView failed, viewId:%d", Integer.valueOf(optInt));
            fVar.mo109647a(i, mo115109j("fail:internal error"));
            return;
        }
        Bitmap snapshot = a.getSnapshot(new Rect(i2, i3, i2 + i4, i3 + i5));
        if (snapshot == null) {
            Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath2", "oriBitmap is null, err, return");
            fVar.mo109647a(i, mo115109j("fail:illegal bitmap"));
            return;
        }
        float f = Util.getFloat(jSONObject.optString("destWidth"), (float) i4);
        float f2 = Util.getFloat(jSONObject.optString("destHeight"), (float) i5);
        if (!(((float) snapshot.getWidth()) == f && ((float) snapshot.getHeight()) == f2)) {
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(snapshot, (int) f, (int) f2, false);
                Log.m105925i("MicroMsg.JsApiXWebCanvasToTempFilePath2", "bitmap recycle %s %s ", snapshot, createScaledBitmap);
                snapshot = createScaledBitmap;
            } catch (Exception e) {
                Log.printInfoStack("MicroMsg.JsApiXWebCanvasToTempFilePath2", "create scaledbitmap fail:%s", e);
            } catch (Throwable th) {
                Log.printInfoStack("MicroMsg.JsApiXWebCanvasToTempFilePath2", "create scaledbitmap fail:%s", th);
            }
        }
        if (snapshot == null) {
            Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath2", "oriBitmap is null, err, return");
            fVar.mo109647a(i, mo115109j("fail:illegal bitmap"));
            return;
        }
        Bitmap.CompressFormat w = C91267e.m114491w(jSONObject);
        String str = w == Bitmap.CompressFormat.JPEG ? "jpg" : "png";
        C81415h0 fileSystem = fVar.getFileSystem();
        C86009m1 allocTempFile = fileSystem.allocTempFile("canvas_" + System.currentTimeMillis() + "." + str);
        if (allocTempFile == null) {
            Log.m105920e("MicroMsg.JsApiXWebCanvasToTempFilePath2", "toTempFilePath, alloc file failed");
            fVar.mo109647a(i, mo115109j("fail alloc file failed"));
            return;
        }
        String i6 = allocTempFile.mo119971i();
        Log.m105919d("MicroMsg.JsApiXWebCanvasToTempFilePath2", "toTempFilePath, savePath = %s", i6);
        try {
            BitmapUtil.saveBitmapToImage(snapshot, C91267e.m114492x(jSONObject), w, i6, true);
            C9514m mVar = new C9514m();
            fVar.getFileSystem().createTempFileFrom(new C86009m1(i6), str, false, mVar);
            String str2 = (String) mVar.f29691a;
            Log.m105919d("MicroMsg.JsApiXWebCanvasToTempFilePath2", "toTempFilePath, returnPath = %s", str2);
            HashMap hashMap = new HashMap();
            hashMap.put("tempFilePath", str2);
            fVar.mo109647a(i, mo115112m("ok", hashMap));
        } catch (IOException e2) {
            Log.m105929w("MicroMsg.JsApiXWebCanvasToTempFilePath2", "save bitmap to file failed. exception : %s", e2);
            fVar.mo109647a(i, mo115109j("fail:write file failed"));
        }
    }
}
