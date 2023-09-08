package er1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import c30.C104289g;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import p225rc.C12969d;
import rx3.C13598b0;
import te3.C50975ql0;

/* renamed from: er1.t2 */
public final class C7881t2 {

    /* renamed from: a */
    public static final C7881t2 f26501a = new C7881t2();

    /* renamed from: er1.t2$a */
    public static final class C7882a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Activity f26502d;

        /* renamed from: e */
        public final /* synthetic */ C50975ql0 f26503e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7882a(Activity activity, C50975ql0 ql02) {
            super(1);
            this.f26502d = activity;
            this.f26503e = ql02;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("FinderShareJumpError", "jumpLiteApp result:" + booleanValue);
            if (booleanValue) {
                C12969d.m12410d(800, new C7867s2(this.f26502d));
            } else {
                Activity activity = this.f26502d;
                String str = this.f26503e.f140377g;
                if (!(str == null || str.length() == 0)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
                C12969d.m12410d(800, new C7867s2(activity));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo8996a(Activity activity, String str) {
        try {
            Log.m105924i("FinderShareJumpError", "[handleShareJumpErrorDirect] json = " + str);
            C104289g gVar = new C104289g(str);
            int i = gVar.getInt("link_type");
            if (i == 1) {
                mo8998c(activity, gVar.getJSONObject("link_h5").optString("link"));
            } else if (i == 2) {
                C104289g k = gVar.getJSONObject("link_lite_app");
                String optString = k.optString("app_id");
                String optString2 = k.optString("page");
                String optString3 = k.optString(SearchIntents.EXTRA_QUERY);
                String optString4 = k.optString("default_url");
                String optString5 = k.optString("ext_info");
                C50975ql0 ql02 = new C50975ql0();
                ql02.f140374d = optString;
                ql02.f140375e = optString2;
                ql02.f140376f = optString3;
                ql02.f140377g = optString4;
                ql02.f140378h = optString5;
                mo8999d(activity, ql02);
            }
        } catch (Exception e) {
            Log.m105924i("FinderShareJumpError", "[handleShareJumpErrorDirect] catch exception:" + e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo8997b(Activity activity, String str) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(str, "errMsg");
        if (!Util.isNullOrNil(str)) {
            try {
                Log.m105924i("FinderShareJumpError", "[handleShareJumpErrorUi] json = " + str);
                if (new C104289g(str).getInt("show_type") == 1) {
                    mo8996a(activity, str);
                }
            } catch (Exception e) {
                Log.m105924i("FinderShareJumpError", "[handleShareJumpErrorUi] catch exception:" + e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public final void mo8998c(Activity activity, String str) {
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C12969d.m12410d(800, new C7867s2(activity));
    }

    /* renamed from: d */
    public final void mo8999d(Activity activity, C50975ql0 ql02) {
        Bundle bundle = new Bundle();
        bundle.putString("appId", ql02.f140374d);
        bundle.putString(SearchIntents.EXTRA_QUERY, ql02.f140376f);
        bundle.putString("path", ql02.f140375e);
        bundle.putInt("nextAnimIn", C0966R.C0968anim.f2326n);
        bundle.putInt("currentAnimOut", C0966R.C0968anim.f2506eu);
        C7782b1 b1Var = C7782b1.f26282a;
        String str = ql02.f140377g;
        if (!b1Var.mo8894a(activity, bundle, !(str == null || str.length() == 0), new C7882a(activity, ql02))) {
            mo8998c(activity, ql02.f140377g);
        }
    }
}
