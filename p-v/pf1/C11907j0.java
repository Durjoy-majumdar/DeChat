package pf1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import gy3.C87412m;
import o40.C61926c;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: pf1.j0 */
public final class C11907j0<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ View f34789a;

    /* renamed from: b */
    public final /* synthetic */ WeImageView f34790b;

    /* renamed from: c */
    public final /* synthetic */ C11918p f34791c;

    /* renamed from: d */
    public final /* synthetic */ int f34792d;

    public C11907j0(View view, WeImageView weImageView, C11918p pVar, int i) {
        this.f34789a = view;
        this.f34790b = weImageView;
        this.f34791c = pVar;
        this.f34792d = i;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C62262d0 d0Var = C62262d0.f176978a;
        View view = this.f34789a;
        WeImageView weImageView = this.f34790b;
        boolean z = bitmap != null;
        C11918p pVar = this.f34791c;
        int i = this.f34792d;
        d0Var.getClass();
        C87412m.m108594g(weImageView, "iconView");
        C87412m.m108594g(pVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        C61926c.m72668M(new C11892b0(weImageView, z, i, view, pVar));
        Log.m105924i("Finder.JumperUtils", "loadLinkIcon resource :" + bitmap);
    }
}
