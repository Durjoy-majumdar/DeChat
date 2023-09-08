package x22;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.location.p069ui.impl.RealTimeLocationUI;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: x22.o */
public class C118805o {

    /* renamed from: a */
    public Context f355453a;

    /* renamed from: b */
    public C118808c f355454b;

    /* renamed from: c */
    public Resources f355455c;

    /* renamed from: x22.o$a */
    public class C118806a implements DialogInterface.OnClickListener {
        public C118806a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C118808c cVar = C118805o.this.f355454b;
            if (cVar != null) {
                RealTimeLocationUI realTimeLocationUI = (RealTimeLocationUI) cVar;
                realTimeLocationUI.f346465X.f353756y = realTimeLocationUI.f271953i.f271972f.getZoom();
                realTimeLocationUI.f271948d.finish();
            }
        }
    }

    /* renamed from: x22.o$b */
    public class C118807b implements DialogInterface.OnClickListener {
        public C118807b(C118805o oVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: x22.o$c */
    public interface C118808c {
    }

    public C118805o(Context context, C118808c cVar) {
        this.f355453a = context;
        this.f355454b = cVar;
        this.f355455c = context.getResources();
    }

    /* renamed from: a */
    public void mo183512a() {
        Object e = C86709a0.m107535s().mo121142i().mo119684e(67590, (Object) null);
        if (!(e == null ? false : ((Boolean) e).booleanValue())) {
            C76879j.m92714H(this.f355453a, this.f355455c.getString(C0966R.string.gbm), "", false, new C118806a(), new C118807b(this));
            C86709a0.m107535s().mo121142i().mo119676J(67590, Boolean.TRUE);
            return;
        }
        C118808c cVar = this.f355454b;
        if (cVar != null) {
            RealTimeLocationUI realTimeLocationUI = (RealTimeLocationUI) cVar;
            realTimeLocationUI.f346465X.f353756y = realTimeLocationUI.f271953i.f271972f.getZoom();
            realTimeLocationUI.f271948d.finish();
        }
    }
}
