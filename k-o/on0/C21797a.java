package on0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a;
import com.tencent.p014mm.sdk.platformtools.Log;
import ym0.C91515l;

/* renamed from: on0.a */
public class C21797a {

    /* renamed from: a */
    public Context f61781a;

    /* renamed from: b */
    public View f61782b;

    /* renamed from: c */
    public C21799b f61783c = C21799b.None;

    /* renamed from: d */
    public GestureDetector f61784d;

    /* renamed from: e */
    public C21800c f61785e;

    /* renamed from: f */
    public float f61786f = 0.0f;

    /* renamed from: g */
    public int f61787g = 0;

    /* renamed from: h */
    public float f61788h = 0.0f;

    /* renamed from: i */
    public int f61789i = -1;

    /* renamed from: j */
    public int f61790j = 0;

    /* renamed from: k */
    public Runnable f61791k = new C21798a();

    /* renamed from: on0.a$a */
    public class C21798a implements Runnable {
        public C21798a() {
        }

        public void run() {
            C17976a aVar = (C17976a) C21797a.this.f61785e;
            aVar.getClass();
            Log.m105918d("MicroMsg.Video.AppBrandVideoView", "onSingleTap");
            AppBrandVideoView appBrandVideoView = aVar.f49577a;
            if (appBrandVideoView.f49490B && appBrandVideoView.f49525j.getVisibility() != 0) {
                aVar.f49577a.f49524i.mo22337C();
                AppBrandVideoView appBrandVideoView2 = aVar.f49577a;
                if (appBrandVideoView2.f49514V) {
                    appBrandVideoView2.mo22228i();
                }
            }
        }
    }

    /* renamed from: on0.a$b */
    public enum C21799b {
        None,
        Volume,
        Brightness,
        FastBackwardOrForward
    }

    /* renamed from: on0.a$c */
    public interface C21800c {
    }

    public C21797a(Context context, View view, C21800c cVar) {
        this.f61781a = context;
        this.f61785e = cVar;
        this.f61782b = view;
        this.f61784d = new GestureDetector(this.f61781a, new C21801b(this));
        this.f61786f = C91515l.m114818b(context);
    }
}
