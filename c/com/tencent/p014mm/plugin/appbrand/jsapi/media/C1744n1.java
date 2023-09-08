package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.utils.C2033c1;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import hh2.C8532a;
import j20.C117292a;
import java.util.HashMap;
import js0.C9514m;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p225rc.C89916g;
import p225rc.g$$f;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n1 */
public final class C1744n1 implements C2033c1 {

    /* renamed from: a */
    public final /* synthetic */ String f11467a;

    /* renamed from: b */
    public final /* synthetic */ C81879g f11468b;

    /* renamed from: c */
    public final /* synthetic */ int f11469c;

    /* renamed from: d */
    public final /* synthetic */ C1747o1 f11470d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n1$a */
    public static final class C1745a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f11471d;

        /* renamed from: e */
        public final /* synthetic */ String f11472e;

        /* renamed from: f */
        public final /* synthetic */ C1747o1 f11473f;

        /* renamed from: g */
        public final /* synthetic */ C81879g f11474g;

        /* renamed from: h */
        public final /* synthetic */ int f11475h;

        /* renamed from: i */
        public final /* synthetic */ boolean f11476i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n1$a$a */
        public static final class C1746a implements g$$f {

            /* renamed from: a */
            public final /* synthetic */ C1747o1 f11477a;

            /* renamed from: b */
            public final /* synthetic */ C81879g f11478b;

            /* renamed from: c */
            public final /* synthetic */ int f11479c;

            /* renamed from: d */
            public final /* synthetic */ boolean f11480d;

            /* renamed from: e */
            public final /* synthetic */ String f11481e;

            public C1746a(C1747o1 o1Var, C81879g gVar, int i, boolean z, String str) {
                this.f11477a = o1Var;
                this.f11478b = gVar;
                this.f11479c = i;
                this.f11480d = z;
                this.f11481e = str;
            }

            /* renamed from: b */
            public final boolean mo1596b(int i, int i2, Intent intent) {
                Log.m105924i("MicroMsg.AppBrand.JsApiEditImage", "onResult, requestCode: " + i + ", resultCode: " + i2);
                C1747o1 o1Var = this.f11477a;
                if (o1Var.f11482g != i) {
                    return false;
                }
                if (-1 != i2) {
                    C81879g gVar = this.f11478b;
                    int i3 = this.f11479c;
                    o1Var.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 1);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    gVar.mo109647a(i3, o1Var.mo115115p("cancel", jSONObject));
                    return true;
                }
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                if (captureVideoNormalModel == null) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiEditImage", "onResult, editResultModel is null");
                    C81879g gVar2 = this.f11478b;
                    int i4 = this.f11479c;
                    C1747o1 o1Var2 = this.f11477a;
                    o1Var2.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("errno", 4);
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                    }
                    gVar2.mo109647a(i4, o1Var2.mo115115p("fail:internal error", jSONObject2));
                    return true;
                }
                String str = captureVideoNormalModel.f272895f;
                Log.m105924i("MicroMsg.AppBrand.JsApiEditImage", "onResult, outputPath: " + str);
                if (!(str == null || str.length() == 0)) {
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                        C9514m mVar = new C9514m();
                        C81415h0 fileSystem = this.f11478b.getFileSystem();
                        if (fileSystem != null) {
                            fileSystem.createTempFileFrom(new C86009m1(str), C86013q1.m106454o(str), true, mVar);
                        }
                        String str2 = (String) mVar.f29691a;
                        Log.m105924i("MicroMsg.AppBrand.JsApiEditImage", "onResult, callbackTempPath: " + str2);
                        if (str2 == null || str2.length() == 0) {
                            Log.m105928w("MicroMsg.AppBrand.JsApiEditImage", "onResult, callbackTempPath is not exist");
                            C81879g gVar3 = this.f11478b;
                            int i5 = this.f11479c;
                            C1747o1 o1Var3 = this.f11477a;
                            o1Var3.getClass();
                            if (BuildInfo.DEBUG) {
                                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("errno", 4);
                            } catch (Exception e3) {
                                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                            }
                            gVar3.mo109647a(i5, o1Var3.mo115115p("fail:internal error", jSONObject3));
                            return true;
                        }
                        C81879g gVar4 = this.f11478b;
                        int i6 = this.f11479c;
                        C1747o1 o1Var4 = this.f11477a;
                        C87412m.m108593f(str2, "callbackTempPath");
                        HashMap e4 = C90364q0.m113146e(new C13604l("tempFilePath", str2));
                        o1Var4.getClass();
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                        }
                        e4.put("errno", 0);
                        gVar4.mo109647a(i6, o1Var4.mo115114o("ok", e4));
                        if (this.f11480d) {
                            Log.m105924i("MicroMsg.AppBrand.JsApiEditImage", "onResult, delete created resolved file");
                            Uri n2 = C116299g2.m163858n(this.f11481e);
                            String path2 = n2.getPath();
                            if (path2 != null) {
                                String k2 = C116299g2.m163855k(path2, false, false);
                                if (!n2.getPath().equals(k2)) {
                                    n2 = n2.buildUpon().path(k2).build();
                                }
                            }
                            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                            if (l2.mo177810a()) {
                                l2.f348991a.mo119933c(l2.f348992b);
                            }
                        }
                        return true;
                    }
                }
                Log.m105928w("MicroMsg.AppBrand.JsApiEditImage", "onResult, outputPath is not exist");
                C81879g gVar5 = this.f11478b;
                int i7 = this.f11479c;
                C1747o1 o1Var5 = this.f11477a;
                o1Var5.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (Exception e5) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
                }
                gVar5.mo109647a(i7, o1Var5.mo115115p("fail:internal error", jSONObject4));
                return true;
            }
        }

        public C1745a(Activity activity, String str, C1747o1 o1Var, C81879g gVar, int i, boolean z) {
            this.f11471d = activity;
            this.f11472e = str;
            this.f11473f = o1Var;
            this.f11474g = gVar;
            this.f11475h = i;
            this.f11476i = z;
        }

        public final void run() {
            C89916g.m112446a(this.f11471d).mo124232f(new C1746a(this.f11473f, this.f11474g, this.f11475h, this.f11476i, this.f11472e));
            String K = C112760b.m154203K();
            String i = new C86009m1(K, "microMsg." + System.currentTimeMillis() + ".jpg").mo119971i();
            C87412m.m108593f(i, "VFSFile(CConstants.DATAR…            .absolutePath");
            Log.m105924i("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, tempOutputPath: " + i);
            RecordConfigProvider b = RecordConfigProvider.m119432b(this.f11472e, i);
            b.f272905F = 294;
            b.f272938z = false;
            UICustomParam uICustomParam = new UICustomParam();
            ((HashMap) uICustomParam.f266575h).put("plugin_filter", Boolean.TRUE);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", true);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", true);
            b.f272927o = uICustomParam;
            C8532a aVar = C8532a.f27585a;
            Activity activity = this.f11471d;
            int i2 = this.f11473f.f11482g;
            Intent a = aVar.mo9442a(activity, "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", 1);
            if (a != null) {
                a.putExtra("KEY_PARAMS_CONFIG", b);
                a.putExtra("KEY_PARAMS_EXIT_ANIM", -1);
                a.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", 1);
                a.putExtra("KEY_PARAMS_TO_WHERE", 1);
                Log.m105925i("MicroMsg.VideoCaptureJumper", "configProvider: %s", b);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i2));
                aVar2.mo10233c(a);
                C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToCaptureViewForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;II)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                aVar.mo9443b(activity, C0966R.C0968anim.f2492eg, -1);
            }
        }
    }

    public C1744n1(String str, C81879g gVar, int i, C1747o1 o1Var) {
        this.f11467a = str;
        this.f11468b = gVar;
        this.f11469c = i;
        this.f11470d = o1Var;
    }

    /* renamed from: a */
    public void mo1683a(String str, boolean z) {
        String str2 = str;
        Log.m105924i("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, imageUrl: " + this.f11467a + ", resolvedPath: " + str + ", isPathCreated: " + z);
        if (!(str2 == null || str.length() == 0)) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                Activity R = this.f11468b.getRuntime().mo113026R();
                if (R == null) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, hostActivity is null");
                    C81879g gVar = this.f11468b;
                    int i = this.f11469c;
                    C1747o1 o1Var = this.f11470d;
                    o1Var.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 4);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    gVar.mo109647a(i, o1Var.mo115115p("fail:internal error", jSONObject));
                    return;
                }
                C81879g gVar2 = this.f11468b;
                gVar2.mo109673t(new C1745a(R, str, this.f11470d, gVar2, this.f11469c, z));
                return;
            }
        }
        Log.m105928w("MicroMsg.AppBrand.JsApiEditImage", "onPathResolve, resolvedPath is not exist");
        C81879g gVar3 = this.f11468b;
        int i2 = this.f11469c;
        C1747o1 o1Var2 = this.f11470d;
        o1Var2.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:Parse imageUrl fail, maybe imageUrl is illegal?");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
        }
        gVar3.mo109647a(i2, o1Var2.mo115115p("fail:Parse imageUrl fail, maybe imageUrl is illegal?", jSONObject2));
    }
}
