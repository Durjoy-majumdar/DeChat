package zo0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1680f5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di0.C86299o;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import kr0.C76630x0;
import kr0.C76632y0;
import p977hj.C87526a;
import zo0.C91813c;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: zo0.j */
public final class C91819j extends C86301e implements C76632y0 {

    /* renamed from: g */
    public static final int[] f262917g = {1025, 1031, 1032};

    /* renamed from: h */
    public static final int[] f262918h = {1011, 1012, 1013, 1047, 1049, 1048, C1680f5.CTRL_INDEX, 1124, 1125, 1126};

    /* renamed from: d */
    public final C91817f f262919d = new C91817f();

    /* renamed from: e */
    public final C91818i f262920e = new C91818i();

    /* renamed from: f */
    public final C91816e f262921f = new C91816e();

    /* renamed from: ZO */
    public boolean mo106903ZO(Context context, String str, int i, Bundle bundle, Bundle bundle2) {
        C91813c.C91814a aVar = C91813c.C91814a.OK;
        if (C87526a.m108856a(f262917g, i)) {
            return aVar == this.f262919d.mo125657b(context, str, i, bundle, bundle2);
        }
        if (C87526a.m108856a(f262918h, i)) {
            return aVar == this.f262920e.mo125657b(context, str, i, bundle, bundle2);
        }
        if (1064 == i || 1078 == i) {
            return aVar == this.f262921f.mo125657b(context, str, i, bundle, bundle2);
        }
        Log.m105921e("MicroMsg.WeAppLinkOpener", "handleScanCodeLink, unhandled case link[ %s ], scene[ %d ]", str, Integer.valueOf(i));
        return false;
    }

    /* renamed from: s8 */
    public boolean mo106904s8(String str, Bundle bundle) {
        C91815d dVar;
        Uri uri;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        Log.m105925i("MicroMsg.WeAppLinkOpener", "handle appLink = %s", str);
        C91815d[] values = C91815d.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = values[i];
            dVar.getClass();
            if (!Util.isNullOrNil(str) && str.startsWith(dVar.f262915d)) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            try {
                uri = Uri.parse(str);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WeAppLinkOpener", "handle nativeLink = %s, exp = %s", str, e);
                uri = null;
            }
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter("username");
            String queryParameter2 = uri.getQueryParameter("path");
            if (!Util.isNullOrNil(queryParameter) && C72996z1.m85804J4(queryParameter)) {
                C86299o oVar = new C86299o();
                oVar.f250929a = queryParameter;
                oVar.f250932d = -1;
                oVar.f250931c = 0;
                oVar.f250934f = queryParameter2;
                oVar.f250939k = dVar.f262916e;
                oVar.f250940l = "";
                oVar.f250941m = 0;
                oVar.f250942n = "";
                WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = bundle == null ? null : (WeAppOpenDeclarePromptBundle) bundle.getParcelable("weapp_open_declare_prompt_key");
                if (weAppOpenDeclarePromptBundle != null) {
                    oVar.f250951w = weAppOpenDeclarePromptBundle;
                }
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv((Context) null, oVar);
                return true;
            }
        }
        return false;
    }
}
