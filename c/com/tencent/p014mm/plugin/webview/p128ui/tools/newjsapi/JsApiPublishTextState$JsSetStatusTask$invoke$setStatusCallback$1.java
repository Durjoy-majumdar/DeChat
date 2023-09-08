package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.p014mm.ipcinvoker.C1256g;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1", "Landroid/os/ResultReceiver;", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1 */
public final class JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1 extends ResultReceiver {

    /* renamed from: d */
    public final /* synthetic */ C1256g<Bundle> f164754d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1(C1256g<Bundle> gVar) {
        super((Handler) null);
        this.f164754d = gVar;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("KEY_RESULT_CODE", i);
        bundle2.putParcelable("KEY_RESULT_DATA", bundle);
        C1256g<Bundle> gVar = this.f164754d;
        if (gVar != null) {
            gVar.mo894a(bundle2);
        }
    }
}
