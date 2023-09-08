package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.t4 */
public final class C105320t4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f312964d;

    /* renamed from: e */
    public final /* synthetic */ FinderRedDotTextView f312965e;

    /* renamed from: f */
    public final /* synthetic */ String f312966f;

    /* renamed from: g */
    public final /* synthetic */ int f312967g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105320t4(Bitmap bitmap, FinderRedDotTextView finderRedDotTextView, String str, int i) {
        super(0);
        this.f312964d = bitmap;
        this.f312965e = finderRedDotTextView;
        this.f312966f = str;
        this.f312967g = i;
    }

    public Object invoke() {
        if (this.f312964d == null) {
            WeImageView weImageView = this.f312965e.f312902j;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            } else {
                C87412m.m108603p("highLightIcon");
                throw null;
            }
        } else {
            FinderRedDotTextView finderRedDotTextView = this.f312965e;
            String str = this.f312966f;
            int i = FinderRedDotTextView.f312895w;
            if (finderRedDotTextView.mo149775k(str)) {
                WeImageView weImageView2 = this.f312965e.f312902j;
                if (weImageView2 != null) {
                    weImageView2.setIconColor(this.f312967g);
                } else {
                    C87412m.m108603p("highLightIcon");
                    throw null;
                }
            } else {
                WeImageView weImageView3 = this.f312965e.f312902j;
                if (weImageView3 != null) {
                    weImageView3.setImageBitmap(this.f312964d);
                    WeImageView weImageView4 = this.f312965e.f312902j;
                    if (weImageView4 != null) {
                        weImageView4.setIconColor(this.f312967g);
                    } else {
                        C87412m.m108603p("highLightIcon");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("highLightIcon");
                    throw null;
                }
            }
            FinderRedDotTextView finderRedDotTextView2 = this.f312965e;
            String str2 = this.f312966f;
            if (str2 == null) {
                str2 = "";
            }
            finderRedDotTextView2.f312908s = str2;
        }
        Log.m105924i("Finder.RedDotTextView", "getImage resource :" + this.f312964d + " iconUrl:" + this.f312966f);
        return C13598b0.f38549a;
    }
}
