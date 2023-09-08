package p233s3;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import java.util.concurrent.Executor;
import p233s3.C101526p;

/* renamed from: s3.g */
public final class C101514g {

    /* renamed from: a */
    public final Executor f297233a;

    /* renamed from: b */
    public final C101515a f297234b;

    /* renamed from: c */
    public final C101524n f297235c;

    /* renamed from: d */
    public float f297236d;

    /* renamed from: s3.g$a */
    public interface C101515a {
        /* renamed from: N6 */
        void mo133273N6(C101511d dVar);
    }

    public C101514g(Window window, Executor executor, C101515a aVar, C8480h hVar) {
        this.f297233a = executor;
        this.f297234b = aVar;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            View view = peekDecorView;
            ViewParent viewParent = peekDecorView.getParent();
            while (viewParent instanceof View) {
                view = (View) viewParent;
                viewParent = view.getParent();
            }
            Object tag = view.getTag(C0966R.C0970id.mtt);
            if (tag == null) {
                tag = new C101526p.C101527a();
                view.setTag(C0966R.C0970id.mtt, tag);
            }
            C101526p.C101527a aVar2 = (C101526p.C101527a) tag;
            if (aVar2.f297258a == null) {
                aVar2.f297258a = new C101526p((C8480h) null);
            }
            int i = Build.VERSION.SDK_INT;
            C101517i mVar = i >= 31 ? new C101523m(this, peekDecorView, window) : i >= 26 ? new C101522l(this, peekDecorView, window) : i >= 24 ? new C101520k(this, peekDecorView, window) : i >= 22 ? new C101519j(this, peekDecorView) : new C101517i(this, peekDecorView);
            this.f297235c = mVar;
            mVar.mo141003a(true);
            this.f297236d = 2.0f;
            return;
        }
        throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
    }
}
