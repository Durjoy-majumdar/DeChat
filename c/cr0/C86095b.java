package cr0;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import br0.C39836d;
import br0.C79771a;
import br0.C79773b;
import br0.C79778e;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C11171e;

/* renamed from: cr0.b */
public final class C86095b extends C79771a {

    /* renamed from: l */
    public final C39836d.C39838c f250580l;

    /* renamed from: m */
    public int f250581m;

    /* renamed from: n */
    public int f250582n = -1;

    /* renamed from: o */
    public WindowManager.LayoutParams f250583o;

    /* renamed from: cr0.b$a */
    public class C86096a implements C39836d.C39838c {

        /* renamed from: a */
        public final /* synthetic */ C86127t f250584a;

        public C86096a(C86095b bVar, C86127t tVar) {
            this.f250584a = tVar;
        }

        /* renamed from: a */
        public void mo120521a(C79778e.C79780b bVar) {
            this.f250584a.getOrientationHandler().mo109918b(bVar, (C79778e.C79779a) null);
        }
    }

    public C86095b(C86127t tVar, C39836d.C39839b bVar) {
        super(tVar, bVar);
        this.f250580l = new C86096a(this, tVar);
    }

    /* renamed from: c */
    public final void mo62475c(View view, int i) {
        super.mo62475c(view, i);
        Activity w = ((C86127t) this.f233780b).mo120548w();
        if (w != null) {
            ViewGroup viewGroup = (ViewGroup) w.getWindow().getDecorView();
            if (this.f233788j == null) {
                this.f250581m = viewGroup.getSystemUiVisibility();
            }
            if (C11171e.m11044a(19)) {
                viewGroup.setSystemUiVisibility(2);
            } else {
                viewGroup.setSystemUiVisibility(4102);
            }
            if (this.f233788j == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                this.f250583o = layoutParams;
                layoutParams.copyFrom(w.getWindow().getAttributes());
            }
            w.getWindow().addFlags(1024);
            if (Build.VERSION.SDK_INT >= 28) {
                w.getWindow().getAttributes().layoutInDisplayCutoutMode = 2;
            }
            if (this.f233788j == null) {
                this.f250582n = w.getRequestedOrientation();
            }
            mo62477e(i);
        } else {
            Log.m105920e("Luggage.ActivityWindowFullscreenImpl", "enterFullscreen, get NULL activity");
            if (this.f233788j == null) {
                this.f250582n = -1;
                this.f250583o = null;
                this.f250581m = 0;
            }
        }
        for (C79773b e : this.f233787i) {
            e.mo109900e();
        }
        this.f233788j = null;
    }

    /* renamed from: d */
    public boolean mo62476d() {
        boolean z = this.f233789k;
        if (super.mo62476d()) {
            Activity w = ((C86127t) this.f233780b).mo120548w();
            if (w == null || w.isFinishing() || w.isDestroyed()) {
                Log.m105921e("Luggage.ActivityWindowFullscreenImpl", "exitFullscreen activity(%s) destroyed", w);
            } else {
                ((ViewGroup) w.getWindow().getDecorView()).setSystemUiVisibility(this.f250581m);
                w.getWindow().clearFlags(1024);
                if (this.f250583o != null) {
                    w.getWindow().setAttributes(this.f250583o);
                }
                ((C86096a) this.f250580l).mo120521a(C79778e.C79780b.m96934c(this.f250582n));
                this.f250582n = -1;
            }
            mo109899h();
            return true;
        } else if (!z) {
            return false;
        } else {
            this.f233789k = false;
            mo109899h();
            return true;
        }
    }

    /* renamed from: e */
    public void mo62477e(int i) {
        this.f233789k = true;
        if (i == -90) {
            ((C86096a) this.f250580l).mo120521a(C79778e.C79780b.m96934c(8));
        } else if (i == 0) {
            ((C86096a) this.f250580l).mo120521a(C79778e.C79780b.m96934c(1));
        } else if (i != 90) {
            ((C86096a) this.f250580l).mo120521a(C79778e.C79780b.m96934c(9));
        } else {
            ((C86096a) this.f250580l).mo120521a(C79778e.C79780b.m96934c(0));
        }
    }
}
