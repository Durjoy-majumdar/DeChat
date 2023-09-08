package q83;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.BaseSearchWebViewUI;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import java.lang.ref.WeakReference;
import p206nj.C11171e;
import q83.C101058l;
import r83.C47948a;

/* renamed from: q83.j */
public class C101056j extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ int f295849a;

    /* renamed from: b */
    public final /* synthetic */ C47948a f295850b;

    /* renamed from: c */
    public final /* synthetic */ boolean f295851c;

    /* renamed from: d */
    public final /* synthetic */ C101058l f295852d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101056j(C101058l lVar, long j, Boolean bool, int i, C47948a aVar, boolean z) {
        super(j, bool);
        this.f295852d = lVar;
        this.f295849a = i;
        this.f295850b = aVar;
        this.f295851c = z;
    }

    public Object run() {
        C101058l.C101059a e;
        WeakReference<View> weakReference;
        View view;
        ViewGroup c;
        C101058l lVar = this.f295852d;
        int i = this.f295849a;
        C47948a aVar = this.f295850b;
        boolean z = this.f295851c;
        boolean z2 = false;
        if (!(i == lVar.f295858d || (e = lVar.mo140517e(i)) == null || (weakReference = e.f295864a) == null || (view = weakReference.get()) == null)) {
            lVar.f295859e = i;
            ViewGroup c2 = lVar.mo140515c(e.f295866c);
            C101058l.C101059a e2 = lVar.mo140517e(e.f295866c);
            if (!(e2 == null || (c = lVar.mo140515c(e2.f295866c)) == null)) {
                View view2 = e.f295864a.get();
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    view2.setLayoutParams(layoutParams);
                }
                lVar.f295859e = e2.f295865b;
                e = e2;
                c2 = c;
            }
            if (c2 != null) {
                view = e.f295864a.get();
                c2.addView(lVar.f295861g, c2.indexOfChild(view));
                c2.removeView(view);
            }
            lVar.f295860f = new float[]{view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight(), (float) e.f295867d};
            BaseSearchWebViewUI baseSearchWebViewUI = (BaseSearchWebViewUI) lVar.f295863i;
            baseSearchWebViewUI.mo68475T9();
            baseSearchWebViewUI.f118877V2 = view;
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
            ViewGroup viewGroup = (ViewGroup) baseSearchWebViewUI.getWindow().getDecorView();
            viewGroup.addView(view, layoutParams2);
            view.setX(0.0f);
            view.setY(0.0f);
            if (C11171e.m11044a(19)) {
                viewGroup.setSystemUiVisibility(2);
            } else {
                viewGroup.setSystemUiVisibility(4098);
            }
            baseSearchWebViewUI.getWindow().addFlags(1024);
            if (z) {
                baseSearchWebViewUI.setRequestedOrientation(0);
            }
            lVar.f295858d = i;
            lVar.f295862h = aVar;
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
