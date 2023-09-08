package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import t60.C64205a;

/* renamed from: com.tencent.mm.plugin.finder.view.v4 */
public final class C105331v4 implements C64205a {

    /* renamed from: a */
    public final /* synthetic */ String f313045a;

    /* renamed from: b */
    public final /* synthetic */ FinderRedDotTextView f313046b;

    /* renamed from: c */
    public final /* synthetic */ int f313047c;

    /* renamed from: com.tencent.mm.plugin.finder.view.v4$a */
    public static final class C105332a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f313048d;

        /* renamed from: e */
        public final /* synthetic */ FinderRedDotTextView f313049e;

        /* renamed from: f */
        public final /* synthetic */ int f313050f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105332a(boolean z, FinderRedDotTextView finderRedDotTextView, int i) {
            super(0);
            this.f313048d = z;
            this.f313049e = finderRedDotTextView;
            this.f313050f = i;
        }

        public Object invoke() {
            if (!this.f313048d) {
                WeImageView weImageView = this.f313049e.f312902j;
                if (weImageView != null) {
                    weImageView.setVisibility(4);
                } else {
                    C87412m.m108603p("highLightIcon");
                    throw null;
                }
            } else {
                WeImageView weImageView2 = this.f313049e.f312902j;
                if (weImageView2 != null) {
                    weImageView2.setIconColor(this.f313050f);
                } else {
                    C87412m.m108603p("highLightIcon");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C105331v4(String str, FinderRedDotTextView finderRedDotTextView, int i) {
        this.f313045a = str;
        this.f313046b = finderRedDotTextView;
        this.f313047c = i;
    }

    /* renamed from: a */
    public final void mo729a(boolean z, Object[] objArr) {
        Log.m105924i("Finder.RedDotTextView", "setImageDownloadListener iconUrl:" + this.f313045a + " success：" + z);
        C61926c.m72668M(new C105332a(z, this.f313046b, this.f313047c));
    }
}
