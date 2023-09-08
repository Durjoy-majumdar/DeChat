package zs1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.webview.p800ad.CenterScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import gy3.C87412m;

/* renamed from: zs1.d */
public final class C53806d extends C53808f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53806d(Context context) {
        super(context, 1);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo74373c() {
        CenterScrollFrameLayout centerScrollFrameLayout = (CenterScrollFrameLayout) mo74379e();
        ScrollFrameLayout.m44967d(centerScrollFrameLayout, (float) centerScrollFrameLayout.f112039y, false, 0, new C53803a(centerScrollFrameLayout), 4, (Object) null);
    }

    /* renamed from: d */
    public void mo74374d() {
        this.f150983n = this.f150980h;
        int i = this.f150979g;
        int i2 = (i - this.f150981i) - this.f150982j;
        this.f150984o = i2;
        int i3 = (int) (((double) i) * 0.75d);
        this.f150985p = i3;
        this.f150986q = i3;
        this.f150987r = i2 - i3;
        this.f150988s = (int) (((double) i2) * 0.3d);
        this.f150989t = 80;
    }

    /* renamed from: f */
    public void mo74375f() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cvf, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout");
        this.f150978f = (CenterScrollFrameLayout) inflate;
        mo74379e().setScrollDownLimit((float) this.f150988s);
        mo74379e().setScrollUpLimit((float) 0);
        ((CenterScrollFrameLayout) mo74379e()).setPeekHeight(this.f150985p);
    }
}
