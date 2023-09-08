package b52;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import e42.C86432k;
import gy3.C87412m;
import qo3.C89779i0;

/* renamed from: b52.c */
public final class C79670c<T extends C7594e> extends C86432k<T> {
    /* renamed from: e */
    public String mo16e() {
        return "showLoading";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: o */
    public C7596h mo62167o(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Log.m105924i("MBJsApiShowLoading", "title:" + optString);
        T t = this.f251227a;
        C89779i0 c = C89779i0.m112246c(t != null ? t.mo8720e0() : null, optString, false, 3, (DialogInterface.OnCancelListener) null);
        c.show();
        Log.m105918d("MBDialogCacheManager", "setCurrentDialog");
        Dialog dialog = C79668a.f233581a;
        if (dialog != null) {
            dialog.dismiss();
        }
        C79668a.f233581a = c;
        return mo120844i();
    }
}
