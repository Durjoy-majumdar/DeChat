package xk0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.AppBrandDrawableView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import jk0.C87978d;
import org.json.JSONObject;
import pi0.C110222b;
import pi0.C110230e;

/* renamed from: xk0.h */
public class C112159h extends C87978d {
    public static final int CTRL_INDEX = 67;
    public static final String NAME = "insertCanvas";

    /* renamed from: xk0.h$a */
    public class C112160a implements C82531i.C82533b {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDrawableView f335846d;

        public C112160a(C112159h hVar, AppBrandDrawableView appBrandDrawableView) {
            this.f335846d = appBrandDrawableView;
        }

        /* renamed from: b */
        public void mo22089b() {
            AppBrandDrawableView appBrandDrawableView = this.f335846d;
            Log.m105927v("MicroMsg.MCanvasView", "onPause :%s", Integer.valueOf(appBrandDrawableView.hashCode()));
            C110222b bVar = appBrandDrawableView.f311174d;
            bVar.getClass();
            bVar.f329726i.mo113884d(bVar.f329729o);
            appBrandDrawableView.mo148551g();
        }
    }

    /* renamed from: xk0.h$b */
    public class C112161b implements C82531i.C82535d {

        /* renamed from: d */
        public final /* synthetic */ AppBrandDrawableView f335847d;

        public C112161b(C112159h hVar, AppBrandDrawableView appBrandDrawableView) {
            this.f335847d = appBrandDrawableView;
        }

        /* renamed from: c */
        public void mo22090c() {
            AppBrandDrawableView appBrandDrawableView = this.f335847d;
            Log.m105927v("MicroMsg.MCanvasView", "onResume :%s", Integer.valueOf(appBrandDrawableView.hashCode()));
            C110222b bVar = appBrandDrawableView.f311174d;
            bVar.f329726i.mo113884d(bVar.f329730p);
        }
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("canvasId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        Context context = hVar.getContext();
        AppBrandDrawableView appBrandDrawableView = new AppBrandDrawableView(context);
        appBrandDrawableView.getDrawContext().f329750g = (C110230e) hVar.mo109668l(C110230e.class);
        appBrandDrawableView.getDrawContext().f329752i = hVar;
        appBrandDrawableView.setContentDescription(context.getString(C0966R.string.f7579k8));
        hVar.mo114864j(new C112160a(this, appBrandDrawableView));
        hVar.mo114868y(new C112161b(this, appBrandDrawableView));
        return new CoverViewContainer(context, (View) appBrandDrawableView);
    }
}
