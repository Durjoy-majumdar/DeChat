package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.utils.C2033c1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashMap;
import js0.C9514m;
import ke3.C88144b;
import org.json.JSONObject;
import p225rc.C89916g;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l1 */
public class C1739l1 implements C2033c1 {

    /* renamed from: a */
    public final /* synthetic */ String f11456a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f11457b;

    /* renamed from: c */
    public final /* synthetic */ int f11458c;

    /* renamed from: d */
    public final /* synthetic */ int f11459d;

    /* renamed from: e */
    public final /* synthetic */ int f11460e;

    /* renamed from: f */
    public final /* synthetic */ C1743m1 f11461f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l1$a */
    public class C1740a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f11462d;

        /* renamed from: e */
        public final /* synthetic */ String f11463e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l1$a$a */
        public class C1741a implements g$$f {
            public C1741a() {
            }

            /* renamed from: b */
            public boolean mo1596b(int i, int i2, Intent intent) {
                Log.m105925i("MicroMsg.JsApiCropImage", "onResult, requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i != C1739l1.this.f11461f.f11466g) {
                    Log.m105920e("MicroMsg.JsApiCropImage", "onActivityResult: not the requestCode");
                    return false;
                } else if (intent == null) {
                    Log.m105920e("MicroMsg.JsApiCropImage", "onActivityResult: data null");
                    C1739l1 l1Var = C1739l1.this;
                    C81925i2 i2Var = l1Var.f11457b;
                    int i3 = l1Var.f11458c;
                    C1743m1 m1Var = l1Var.f11461f;
                    m1Var.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 1);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    i2Var.mo109647a(i3, m1Var.mo115115p("cancel", jSONObject));
                    return false;
                } else {
                    String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    if (stringExtra == null) {
                        Log.m105920e("MicroMsg.JsApiCropImage", "onActivityResult: crop path null");
                        C1739l1 l1Var2 = C1739l1.this;
                        C81925i2 i2Var2 = l1Var2.f11457b;
                        int i4 = l1Var2.f11458c;
                        C1743m1 m1Var2 = l1Var2.f11461f;
                        m1Var2.getClass();
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("errno", 4);
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                        }
                        i2Var2.mo109647a(i4, m1Var2.mo115115p("fail:internal error", jSONObject2));
                        return false;
                    }
                    if (i2 == -1) {
                        C9514m mVar = new C9514m();
                        if (C1739l1.this.f11457b.getFileSystem() != null) {
                            C1739l1.this.f11457b.getFileSystem().createTempFileFrom(new C86009m1(stringExtra), C86013q1.m106454o(stringExtra), true, mVar);
                        }
                        String str = (String) mVar.f29691a;
                        Log.m105925i("MicroMsg.JsApiCropImage", "path:%s, callbackTempPath:%s", stringExtra, str);
                        HashMap hashMap = new HashMap();
                        hashMap.put("tempFilePath", str);
                        C1739l1 l1Var3 = C1739l1.this;
                        C81925i2 i2Var3 = l1Var3.f11457b;
                        int i5 = l1Var3.f11458c;
                        C1743m1 m1Var3 = l1Var3.f11461f;
                        m1Var3.getClass();
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                        }
                        hashMap.put("errno", 0);
                        i2Var3.mo109647a(i5, m1Var3.mo115114o("ok", hashMap));
                    } else {
                        C86013q1.m106447h(stringExtra);
                        Log.m105920e("MicroMsg.JsApiCropImage", "onActivityResult: resultCode error");
                        C1739l1 l1Var4 = C1739l1.this;
                        C81925i2 i2Var4 = l1Var4.f11457b;
                        int i6 = l1Var4.f11458c;
                        C1743m1 m1Var4 = l1Var4.f11461f;
                        m1Var4.getClass();
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("errno", 1);
                        } catch (Exception e3) {
                            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                        }
                        i2Var4.mo109647a(i6, m1Var4.mo115115p("cancel", jSONObject3));
                    }
                    if (C1740a.this.f11462d) {
                        Log.m105924i("MicroMsg.JsApiCropImage", "onResult, delete created resolved file");
                        Uri n = C116299g2.m163858n(C1740a.this.f11463e);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        if (l.mo177810a()) {
                            l.f348991a.mo119933c(l.f348992b);
                        }
                    }
                    return true;
                }
            }
        }

        public C1740a(boolean z, String str) {
            this.f11462d = z;
            this.f11463e = str;
        }

        public void run() {
            C89916g.m112446a(C1739l1.this.f11457b.getContext()).mo124232f(new C1741a());
            Intent intent = new Intent();
            intent.putExtra("CropImageMode", 1);
            intent.putExtra("CropImage_OutputPath", C112760b.m154203K() + "microMsg." + System.currentTimeMillis() + ".jpg");
            intent.putExtra("CropImage_ImgPath", this.f11463e);
            intent.putExtra("CropImage_from_scene", 5);
            C1739l1 l1Var = C1739l1.this;
            int i = l1Var.f11459d;
            float f = i > 0 ? ((float) l1Var.f11460e) / ((float) i) : 1.0f;
            Log.m105925i("MicroMsg.JsApiCropImage", "aspectRatio:%f", Float.valueOf(f));
            intent.putExtra("CropImage_aspect_ratio", f);
            C88144b.m109796n(C1739l1.this.f11457b.getContext(), "gallery", ".picker.view.ImageCropUI", intent, C1739l1.this.f11461f.f11466g, false);
        }
    }

    public C1739l1(C1743m1 m1Var, String str, C81925i2 i2Var, int i, int i2, int i3) {
        this.f11461f = m1Var;
        this.f11456a = str;
        this.f11457b = i2Var;
        this.f11458c = i;
        this.f11459d = i2;
        this.f11460e = i3;
    }

    /* renamed from: a */
    public void mo1683a(String str, boolean z) {
        String str2 = str;
        Log.m105925i("MicroMsg.JsApiCropImage", "onPathResolve src:%s, resolvedPath:%s, isPathCreated:%b", this.f11456a, str2, Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.JsApiCropImage", "onPathResolve, resolvedPath is not exist");
            C81925i2 i2Var = this.f11457b;
            int i = this.f11458c;
            C1743m1 m1Var = this.f11461f;
            m1Var.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 107, "fail:jsapi returns empty data");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            i2Var.mo109647a(i, m1Var.mo115115p("fail:jsapi returns empty data", jSONObject));
            return;
        }
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105920e("MicroMsg.JsApiCropImage", "onPathResolve, resolvedPath file is not exist");
            C81925i2 i2Var2 = this.f11457b;
            int i2 = this.f11458c;
            C1743m1 m1Var2 = this.f11461f;
            m1Var2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 107, "fail:jsapi returns empty data");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 107);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            i2Var2.mo109647a(i2, m1Var2.mo115115p("fail:jsapi returns empty data", jSONObject2));
        }
        Context context = this.f11457b.getContext();
        if (context == null || !(context instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiCropImage", "cropImage fail,  pageContext is null");
            C81925i2 i2Var3 = this.f11457b;
            int i3 = this.f11458c;
            C1743m1 m1Var3 = this.f11461f;
            m1Var3.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            i2Var3.mo109647a(i3, m1Var3.mo115115p("fail:internal error", jSONObject3));
            return;
        }
        this.f11457b.mo109673t(new C1740a(z, str2));
    }
}
