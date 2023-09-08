package p986je;

import android.app.Application;
import com.tencent.matrix.iocanary.core.IOCanaryCore;
import p1060we.C90970b;
import p1060we.C90971c;
import p361me.C88727a;
import p994ke.C88142a;

/* renamed from: je.a */
public class C87952a extends C90970b {

    /* renamed from: h */
    public final C88142a f254520h;

    /* renamed from: i */
    public IOCanaryCore f254521i;

    public C87952a(C88142a aVar) {
        this.f254520h = aVar;
    }

    /* renamed from: b */
    public String mo112098b() {
        return "io";
    }

    /* renamed from: c */
    public void mo112099c(Application application, C90971c cVar) {
        super.mo112099c(application, cVar);
        if (C88727a.f256088a == null) {
            C88727a.f256088a = application.getPackageName();
        }
        this.f254521i = new IOCanaryCore(this);
    }

    /* renamed from: d */
    public void mo112100d() {
        super.mo112100d();
        this.f254521i.start();
    }
}
