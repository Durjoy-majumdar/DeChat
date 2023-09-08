package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import t60.C64205a;

/* renamed from: com.tencent.mm.plugin.finder.view.y2 */
public final class C4217y2 implements C64205a {

    /* renamed from: a */
    public final /* synthetic */ String f18516a;

    /* renamed from: b */
    public final /* synthetic */ WeImageView f18517b;

    /* renamed from: c */
    public final /* synthetic */ int f18518c;

    /* renamed from: com.tencent.mm.plugin.finder.view.y2$a */
    public static final class C4218a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f18519d;

        /* renamed from: e */
        public final /* synthetic */ WeImageView f18520e;

        /* renamed from: f */
        public final /* synthetic */ int f18521f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4218a(boolean z, WeImageView weImageView, int i) {
            super(0);
            this.f18519d = z;
            this.f18520e = weImageView;
            this.f18521f = i;
        }

        public Object invoke() {
            if (!this.f18519d) {
                this.f18520e.setVisibility(8);
            } else {
                this.f18520e.setIconColor(this.f18521f);
            }
            return C13598b0.f38549a;
        }
    }

    public C4217y2(String str, WeImageView weImageView, int i) {
        this.f18516a = str;
        this.f18517b = weImageView;
        this.f18518c = i;
    }

    /* renamed from: a */
    public final void mo729a(boolean z, Object[] objArr) {
        Log.m105924i("Finder.HomeTabRedDotTipsBubbleView", "setImageDownloadListener iconUrl:" + this.f18516a + " success：" + z);
        C61926c.m72668M(new C4218a(z, this.f18517b, this.f18518c));
    }
}
