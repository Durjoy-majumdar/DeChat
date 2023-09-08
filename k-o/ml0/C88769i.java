package ml0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.rtmp.TXLivePlayer;
import java.io.IOException;
import java.util.HashMap;
import jk0.C87987k;
import js0.C9514m;
import org.json.JSONObject;

/* renamed from: ml0.i */
public class C88769i implements TXLivePlayer.ITXSnapshotListener {

    /* renamed from: a */
    public final /* synthetic */ C87987k f256186a;

    /* renamed from: b */
    public final /* synthetic */ C82520h f256187b;

    /* renamed from: c */
    public final /* synthetic */ C88770j f256188c;

    public C88769i(C88770j jVar, C87987k kVar, C82520h hVar) {
        this.f256188c = jVar;
        this.f256186a = kVar;
        this.f256187b = hVar;
    }

    public void onSnapshot(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null || bitmap.isRecycled()) {
            Log.m105920e("MicroMsg.JsApiOperateLivePlayer", "onSnapshot: bitmap nil");
            C87987k kVar = this.f256186a;
            C88770j jVar = this.f256188c;
            jVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1107004, "fail:take snapshot fail");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 1107004);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            kVar.mo122438a(jVar.mo115115p("fail:take snapshot fail", jSONObject));
            return;
        }
        String str = AndroidMediaUtil.getSysCameraDirPath() + String.format("%s%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), "jpg"});
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            BitmapUtil.saveBitmapToImage(bitmap2, 90, Bitmap.CompressFormat.JPEG, str, true);
            C9514m mVar = new C9514m();
            if (this.f256187b.getFileSystem().createTempFileFrom(new C86009m1(str), "jpg", true, mVar) != C81410b0.OK) {
                C87987k kVar2 = this.f256186a;
                C88770j jVar2 = this.f256188c;
                jVar2.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1107006, "fail:save to temp file after take snapshot fail");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 1107006);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                kVar2.mo122438a(jVar2.mo115115p("fail:save to temp file after take snapshot fail", jSONObject2));
                return;
            }
            this.f256188c.getClass();
            if (!bitmap.isRecycled()) {
                Log.m105924i("MicroMsg.JsApiOperateLivePlayer", "bitmap recycle " + bitmap.toString());
                bitmap.recycle();
            }
            Log.m105925i("MicroMsg.JsApiOperateLivePlayer", "onSnapshot: actualPath:%s path:%s", str, mVar.f29691a);
            HashMap hashMap = new HashMap();
            hashMap.put("tempImagePath", mVar.f29691a);
            hashMap.put("width", Integer.valueOf(width));
            hashMap.put("height", Integer.valueOf(height));
            C87987k kVar3 = this.f256186a;
            C88770j jVar3 = this.f256188c;
            jVar3.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            kVar3.mo122438a(jVar3.mo115114o("ok", hashMap));
        } catch (IOException e3) {
            Log.m105921e("MicroMsg.JsApiOperateLivePlayer", "onSnapshot: exception %s", e3.getMessage());
            C87987k kVar4 = this.f256186a;
            C88770j jVar4 = this.f256188c;
            jVar4.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1107005, "fail:save to album after take snapshot fail");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 1107005);
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
            }
            kVar4.mo122438a(jVar4.mo115115p("fail:save to album after take snapshot fail", jSONObject3));
        }
    }
}
