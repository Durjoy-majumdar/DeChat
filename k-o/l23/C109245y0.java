package l23;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import d23.C106976a;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import lh2.C99417a;
import n23.C109675a;
import n23.C109676b;
import org.json.JSONArray;
import qh2.C101198e;
import qr3.C110465b;

/* renamed from: l23.y0 */
public final class C109245y0 extends C99417a {

    /* renamed from: f */
    public ViewGroup f327070f;

    /* renamed from: g */
    public RectF f327071g = new RectF();

    /* renamed from: h */
    public RectF f327072h = new RectF();

    /* renamed from: i */
    public RelativeLayout f327073i;

    /* renamed from: j */
    public final int f327074j;

    /* renamed from: n */
    public final int f327075n;

    /* renamed from: o */
    public final int f327076o;

    /* renamed from: p */
    public C109675a f327077p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109245y0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        HashMap<Integer, List<C110465b>> hashMap;
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f327070f = viewGroup;
        View findViewById = this.f327070f.findViewById(C0966R.C0970id.f358956i23);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id…view_decorator_container)");
        this.f327073i = (RelativeLayout) findViewById;
        this.f327074j = this.f327070f.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3750d1);
        this.f327075n = this.f327070f.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
        this.f327076o = this.f327070f.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3713c6);
        this.f327077p = new C109675a();
        boolean z = true;
        C85868k2.m106137b(this.f327070f.getContext()).inflate(C0966R.C0971layout.a0z, this.f327073i, true);
        View findViewById2 = this.f327073i.findViewById(C0966R.C0970id.f357508a81);
        C87412m.m108593f(findViewById2, "container.findViewById(R.id.beauty_effect)");
        WeImageView weImageView = (WeImageView) findViewById2;
        View findViewById3 = this.f327073i.findViewById(C0966R.C0970id.g3j);
        C87412m.m108593f(findViewById3, "container.findViewById(R.id.loading_progress)");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        View findViewById4 = this.f327073i.findViewById(C0966R.C0970id.g3p);
        C87412m.m108593f(findViewById4, "container.findViewById(R.id.loading_tips)");
        TextView textView = (TextView) findViewById4;
        weImageView.setIconColor(-1);
        weImageView.setVisibility(8);
        C106976a aVar = C106976a.f320208a;
        this.f327073i.setVisibility(8);
        C109676b bVar = C109676b.f328306a;
        if (MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SETTING_INT_SYNC", 0) != 1 ? false : z) {
            try {
                hashMap = bVar.mo160902c(new JSONArray(C86013q1.m106432N(C109676b.f328307b)));
            } catch (Exception unused) {
                hashMap = C109676b.f328308c;
            }
            if (hashMap != null) {
                HashMap<Integer, List<C110465b>> hashMap2 = C109676b.f328309d;
                hashMap2.clear();
                hashMap2.putAll(hashMap);
                C109676b.f328306a.mo160903d();
            }
        }
    }

    public void setVisibility(int i) {
        C106976a aVar = C106976a.f320208a;
    }

    /* renamed from: x */
    public final void mo160480x(RectF rectF) {
        C87412m.m108594g(rectF, "rect");
        Log.m105924i("MicroMsg.VideoPreviewDecorationPlugin", "setVisibleRect:" + rectF + ", animator:" + 0 + ", isRunning:" + null);
        if (!C87412m.m108589b(this.f327071g, rectF)) {
            this.f327071g.set(rectF);
            ViewGroup.LayoutParams layoutParams = this.f327073i.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            RectF rectF2 = this.f327071g;
            marginLayoutParams.topMargin = (int) (((((float) ((int) rectF2.top)) + rectF2.height()) - ((float) this.f327074j)) - ((float) this.f327075n));
            marginLayoutParams.leftMargin = (int) (((this.f327071g.width() + this.f327071g.left) - ((float) this.f327074j)) - ((float) this.f327075n));
            this.f327073i.setLayoutParams(marginLayoutParams);
            return;
        }
        this.f327072h.set(rectF);
    }
}
