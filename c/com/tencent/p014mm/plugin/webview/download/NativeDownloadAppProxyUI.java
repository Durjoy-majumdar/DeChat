package com.tencent.p014mm.plugin.webview.download;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import kotlin.Metadata;
import l83.C10469b;
import l83.C10470c;
import nj3.C88989a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50916q50;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/download/NativeDownloadAppProxyUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.webview.download.NativeDownloadAppProxyUI */
public final class NativeDownloadAppProxyUI extends VASActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f22042e = 0;

    /* renamed from: d */
    public final C13601g f22043d = C36568h.m40985a(new C5858a(this));

    /* renamed from: com.tencent.mm.plugin.webview.download.NativeDownloadAppProxyUI$a */
    public static final class C5858a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ NativeDownloadAppProxyUI f22044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5858a(NativeDownloadAppProxyUI nativeDownloadAppProxyUI) {
            super(0);
            this.f22044d = nativeDownloadAppProxyUI;
        }

        public Object invoke() {
            String stringExtra = this.f22044d.getIntent().getStringExtra("download_app_id");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.download.NativeDownloadAppProxyUI$b */
    public static final class C5859b implements C10469b {

        /* renamed from: a */
        public final /* synthetic */ NativeDownloadAppProxyUI f22045a;

        public C5859b(NativeDownloadAppProxyUI nativeDownloadAppProxyUI) {
            this.f22045a = nativeDownloadAppProxyUI;
        }

        /* renamed from: a */
        public void mo6904a(C50916q50 q502) {
            C87412m.m108594g(q502, "downloadAppInfo");
            Log.m105924i("MicroMsg.NativeDownloadAppProxyUI", "getDownloadAppInfo onSuccess");
            NativeDownloadAppProxyUI nativeDownloadAppProxyUI = this.f22045a;
            int i = NativeDownloadAppProxyUI.f22042e;
            String str = (String) ((C36570n) nativeDownloadAppProxyUI.f22043d).getValue();
            C87412m.m108593f(str, "downloadAppId");
            Log.m105924i("MicroMsg.NativeDownloadAppProxyUI", "startDownloadUI downloadAppId: " + str + ", downloadAppInfo: " + q502.f140145e + ", md5: " + q502.f140147g + ", version: " + q502.f140146f + ", downloadUrl: " + q502.f140149i);
            Intent intent = new Intent();
            intent.putExtra("task_name", q502.f140145e);
            intent.putExtra("app_developer", q502.f140148h);
            intent.putExtra("app_version", q502.f140146f);
            intent.putExtra("app_privacy_url", q502.f140150j);
            intent.putExtra("app_permission_url", q502.f140151n);
            intent.putExtra("task_url", q502.f140149i);
            intent.putExtra("file_md5", q502.f140147g);
            intent.putExtra("thumb_url", q502.f140144d);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, q502.f140145e);
            intent.addFlags(268435456);
            C88144b.m109795m(nativeDownloadAppProxyUI.getContext(), "webview", ".ui.tools.WebViewDownloadUI", intent, 2000);
        }

        /* renamed from: b */
        public void mo6905b(String str, int i, int i2, String str2) {
            C87412m.m108594g(str, "appId");
            Log.m105920e("MicroMsg.NativeDownloadAppProxyUI", "getDownloadAppInfo onFailed appId: %s, errType: " + i + ", errCode: " + i2 + ", errMsg: " + str2);
            NativeDownloadAppProxyUI nativeDownloadAppProxyUI = this.f22045a;
            Intent intent = new Intent();
            boolean z = true;
            intent.putExtra("key_result_err_code", 1);
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z) {
                str2 = "get download appInfo failed";
            }
            intent.putExtra("key_result_err_msg", str2);
            C13598b0 b0Var = C13598b0.f38549a;
            nativeDownloadAppProxyUI.setResult(-1, intent);
            this.f22045a.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2000) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = (String) ((C36570n) this.f22043d).getValue();
        C87412m.m108593f(str, "downloadAppId");
        C10470c.m10400a(str, new C5859b(this));
    }
}
