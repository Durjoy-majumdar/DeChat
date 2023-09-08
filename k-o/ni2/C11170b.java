package ni2;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import di3.C86312j;
import e00.C45520t;
import e00.C7574m0;
import gy3.C87412m;
import java.util.Map;
import li2.C10531a;
import mi2.C10897e;
import p256vw.C15016h;

/* renamed from: ni2.b */
public final class C11170b implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C47260d f32965d;

    public C11170b(C47260d dVar) {
        this.f32965d = dVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47260d dVar = this.f32965d;
        dVar.getClass();
        ((C7574m0) C86312j.m106911c(C7574m0.class)).mo8344P6(C10897e.f32521b);
        BoxWebView boxWebView = dVar.f126882t;
        if (boxWebView != null) {
            boxWebView.destroy();
        }
        dVar.f126882t = null;
        C45520t tVar = dVar.f126873h;
        if (tVar != null) {
            tVar.onDestroy();
        }
        Context context = dVar.f126872g;
        if (context != null) {
            int hashCode = context.hashCode();
            Map<Integer, C15016h> map = C10531a.f31800a;
            if (map != null) {
                C15016h hVar = map.get(Integer.valueOf(hashCode));
                if (hVar != null) {
                    hVar.f41148j = null;
                    hVar.f41143e = "";
                }
                C10531a.f31800a.clear();
                C10531a.f31800a = null;
            }
            dVar.f126877o = null;
            return;
        }
        C87412m.m108603p("mContext");
        throw null;
    }
}
