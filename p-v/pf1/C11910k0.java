package pf1;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import gy3.C87412m;
import o40.C61926c;
import t60.C64205a;

/* renamed from: pf1.k0 */
public final class C11910k0 implements C64205a {

    /* renamed from: a */
    public final /* synthetic */ View f34799a;

    /* renamed from: b */
    public final /* synthetic */ WeImageView f34800b;

    /* renamed from: c */
    public final /* synthetic */ C11918p f34801c;

    /* renamed from: d */
    public final /* synthetic */ int f34802d;

    public C11910k0(View view, WeImageView weImageView, C11918p pVar, int i) {
        this.f34799a = view;
        this.f34800b = weImageView;
        this.f34801c = pVar;
        this.f34802d = i;
    }

    /* renamed from: a */
    public final void mo729a(boolean z, Object[] objArr) {
        Log.m105924i("Finder.JumperUtils", "loadLinkIcon success :" + z);
        C62262d0 d0Var = C62262d0.f176978a;
        View view = this.f34799a;
        WeImageView weImageView = this.f34800b;
        C11918p pVar = this.f34801c;
        int i = this.f34802d;
        d0Var.getClass();
        C87412m.m108594g(weImageView, "iconView");
        C87412m.m108594g(pVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        C61926c.m72668M(new C11892b0(weImageView, z, i, view, pVar));
    }
}
