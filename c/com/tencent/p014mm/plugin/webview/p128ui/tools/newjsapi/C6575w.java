package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.graphics.Bitmap;
import android.util.Base64;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8479f0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import p749xh.C66261f3;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.w */
public final class C6575w extends C15053a {

    /* renamed from: d */
    public static final C6575w f23801d = new C6575w();

    /* renamed from: e */
    public static final int f23802e = 249;

    /* renamed from: f */
    public static final String f23803f = "getLocalImgData";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.w$a */
    public static final class C6576a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f23804d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Bitmap> f23805e;

        /* renamed from: f */
        public final /* synthetic */ float f23806f;

        /* renamed from: g */
        public final /* synthetic */ C13855j f23807g;

        /* renamed from: h */
        public final /* synthetic */ C13851h1 f23808h;

        /* renamed from: i */
        public final /* synthetic */ long f23809i;

        public C6576a(String str, C8479f0<Bitmap> f0Var, float f, C13855j jVar, C13851h1 h1Var, long j) {
            this.f23804d = str;
            this.f23805e = f0Var;
            this.f23806f = f;
            this.f23807g = jVar;
            this.f23808h = h1Var;
            this.f23809i = j;
        }

        public final void run() {
            try {
                int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(this.f23804d);
                C8479f0<Bitmap> f0Var = this.f23805e;
                f0Var.f27484d = BitmapUtil.rotate((Bitmap) f0Var.f27484d, (float) exifOrientation);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = (int) (this.f23806f * ((float) 100));
                if (i < 10) {
                    i = 10;
                }
                if (i > 99) {
                    i = 99;
                }
                ((Bitmap) this.f23805e.f27484d).compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                String encodeToString = Base64.encodeToString(byteArray, 2);
                HashMap hashMap = new HashMap();
                C87412m.m108593f(encodeToString, "base64Content");
                hashMap.put("localData", encodeToString);
                this.f23807g.f39001d.mo10774a(this.f23808h.f38990c, "getLocalImgData:ok", hashMap);
                ((Bitmap) this.f23805e.f27484d).recycle();
                Log.m105924i("MicroMsg.JsApiGetLocalImgData", "getLocalImgData rawData size = " + byteArray.length + ", base64 size = " + encodeToString.length() + ", compressionRatio=" + this.f23806f + ", quality=" + i + ", degree=" + exifOrientation);
                StringBuilder sb = new StringBuilder();
                sb.append("getLocalImgData cost ");
                sb.append(System.currentTimeMillis() - this.f23809i);
                Log.m105918d("MicroMsg.JsApiGetLocalImgData", sb.toString());
            } catch (Exception e) {
                this.f23807g.f39001d.mo10774a(this.f23808h.f38990c, "getLocalImgData:fail", (Map<String, Object>) null);
                Log.m105921e("MicroMsg.JsApiGetLocalImgData", "getLocalImgData fail %s", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str = (String) h1Var2.f38983a.get(C66261f3.COL_LOCALID);
        float f = Util.getFloat((String) h1Var2.f38983a.get("compressionRatio"), 0.9f);
        if (Util.isNullOrNil(str)) {
            jVar2.f39001d.mo10774a(h1Var2.f38990c, "getLocalImgData:fail_invaild_localid", (Map<String, Object>) null);
            return false;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C43791l lVar = jVar2.f39000c;
            String J8 = lVar != null ? lVar.mo68098J8(str, 2) : null;
            Log.m105924i("MicroMsg.JsApiGetLocalImgData", "getLocalImgData localId " + str + ", path=" + J8);
            if (J8 != null) {
                C8479f0 f0Var = new C8479f0();
                T decodeFile = BitmapUtil.decodeFile(J8);
                f0Var.f27484d = decodeFile;
                if (decodeFile != null) {
                    Bitmap bitmap = (Bitmap) decodeFile;
                    if (!decodeFile.isRecycled()) {
                        ((C119157j) C119157j.f356862d).mo183876g(new C6576a(J8, f0Var, f, jVar, h1Var, currentTimeMillis), "GetLocalImgDataThread");
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiGetLocalImgData", "getLocalImgData fail %s", e.getMessage());
        }
        jVar2.f39001d.mo10774a(h1Var2.f38990c, "getLocalImgData:fail", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23802e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23803f;
    }
}
