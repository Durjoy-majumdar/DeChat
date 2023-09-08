package gq0;

import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialJsBridge;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.OpenMaterialWebView;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import e83.C45556b;
import gy3.C87412m;
import iq0.C98783b;
import java.util.List;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: gq0.h */
public final class C107887h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OpenMaterialJsBridge f323041d;

    /* renamed from: e */
    public final /* synthetic */ C107869a f323042e;

    /* renamed from: f */
    public final /* synthetic */ OpenMaterialWebView f323043f;

    /* renamed from: gq0.h$a */
    public static final class C107888a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ OpenMaterialWebView f323044d;

        /* renamed from: e */
        public final /* synthetic */ String f323045e;

        /* renamed from: f */
        public final /* synthetic */ byte[] f323046f;

        public C107888a(OpenMaterialWebView openMaterialWebView, String str, byte[] bArr) {
            this.f323044d = openMaterialWebView;
            this.f323045e = str;
            this.f323046f = bArr;
        }

        public final void run() {
            this.f323044d.loadDataWithBaseURL(this.f323045e, new String(this.f323046f, C119027c.f356488a), "text/html", "utf-8", (String) null);
        }
    }

    public C107887h(OpenMaterialJsBridge openMaterialJsBridge, C107869a aVar, OpenMaterialWebView openMaterialWebView) {
        this.f323041d = openMaterialJsBridge;
        this.f323042e = aVar;
        this.f323043f = openMaterialWebView;
    }

    public final void run() {
        C45556b g = C43471q.m46983g(7);
        if (g == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, openMaterialTemplate is null");
            return;
        }
        String str = g.mo71077o() + XVFSFile.SEPARATOR_CHAR + g.mo71058f();
        Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, htmlPath: " + str);
        boolean z = false;
        byte[] O = C86013q1.m106433O(str, 0, -1);
        if (O != null) {
            if (O.length == 0) {
                z = true;
            }
            if (!z) {
                String str2 = "file://" + str;
                Log.m105918d("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, baseUrl: " + str2);
                OpenMaterialJsBridge openMaterialJsBridge = this.f323041d;
                C98783b f = this.f323042e.f323014h.mo158308f();
                C87412m.m108593f(f, "openMaterialReporter.openMaterialScene");
                List<AppBrandOpenMaterialDetailModel> list = this.f323042e.f323012f.f311217f;
                C87412m.m108593f(list, "openMaterialCollection.a…dOpenMaterialDetailModels");
                ((C119157j) C119157j.f356862d).mo183895z(new C107888a(this.f323043f, str2, openMaterialJsBridge.attachMyOpenMaterials2Template(O, f, list)));
                return;
            }
        }
        Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "loadDataAsync, rawHtmlContent is empty");
    }
}
