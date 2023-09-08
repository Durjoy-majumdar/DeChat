package cl0;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import eb0.C86493v0;
import java.util.HashMap;
import sn0.C90251c;

/* renamed from: cl0.b */
public class C80047b extends C82919r2 implements C90251c.C90256c {
    private static final int CTRL_INDEX = 678;
    public static final String NAME = "onImageViewLoad";

    /* renamed from: i */
    public final C86493v0.C86495c f234489i;

    /* renamed from: j */
    public final C82520h f234490j;

    /* renamed from: cl0.b$a */
    public class C80048a extends HashMap<String, Object> {
        public C80048a(C80047b bVar, BitmapFactory.Options options) {
            put("width", Integer.valueOf(options.outWidth));
            put("height", Integer.valueOf(options.outHeight));
        }
    }

    public C80047b(int i, C86493v0.C86495c cVar, C82520h hVar) {
        mo115164n("viewId", Integer.valueOf(i));
        this.f234489i = cVar;
        this.f234490j = hVar;
    }

    /* renamed from: p */
    public void mo110314p(BitmapFactory.Options options) {
        if (options != null) {
            mo115164n("errMsg", "ok");
            mo115164n("size", new C80048a(this, options));
        } else {
            mo115164n("errMsg", "fail");
        }
        C86493v0.C86495c cVar = this.f234489i;
        if (cVar == null || !"webview".equals(cVar.mo120959f("sendTo", (String) null))) {
            this.f234490j.mo109669n(this, (int[]) null);
        } else {
            this.f234490j.mo109676w(this);
        }
    }
}
