package p248ug;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ug.e */
public abstract class C111159e extends FrameLayout {

    /* renamed from: d */
    public C111163p0 f332922d = new C111160a(this);

    /* renamed from: ug.e$a */
    public class C111160a implements C111163p0 {
        public C111160a(C111159e eVar) {
        }

        /* renamed from: a */
        public void mo150361a(C111167t tVar) {
            Log.m105925i("MicroMsg.DrawingView", "Default [onSelectedFeature] features:%s", tVar.name());
        }

        /* renamed from: b */
        public void mo150362b(boolean z) {
        }

        /* renamed from: c */
        public void mo150363c(C111167t tVar, int i, Object obj) {
            Log.m105925i("MicroMsg.DrawingView", "Default [onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
        }
    }

    public C111159e(Context context) {
        super(context);
    }

    public C111163p0 getSelectedFeatureListener() {
        return this.f332922d;
    }

    public abstract void setActionBarCallback(C111168v vVar);

    public abstract void setActionBarVisible(boolean z);

    public abstract void setAutoShowFooterAndBar(boolean z);

    public abstract void setFooterVisible(boolean z);

    public void setSelectedFeatureListener(C111163p0 p0Var) {
        this.f332922d = p0Var;
    }
}
