package lq1;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: lq1.f */
public final class C61353f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMFragmentActivity f174516d;

    /* renamed from: e */
    public final /* synthetic */ View f174517e;

    /* renamed from: f */
    public final /* synthetic */ UniCommentDrawer f174518f;

    /* renamed from: g */
    public final /* synthetic */ FrameLayout.LayoutParams f174519g;

    /* renamed from: h */
    public final /* synthetic */ UniCommentDrawer.C56448a f174520h;

    /* renamed from: i */
    public final /* synthetic */ boolean f174521i;

    public C61353f(MMFragmentActivity mMFragmentActivity, View view, UniCommentDrawer uniCommentDrawer, FrameLayout.LayoutParams layoutParams, UniCommentDrawer.C56448a aVar, boolean z) {
        this.f174516d = mMFragmentActivity;
        this.f174517e = view;
        this.f174518f = uniCommentDrawer;
        this.f174519g = layoutParams;
        this.f174520h = aVar;
        this.f174521i = z;
    }

    public final void run() {
        int e = C75044y4.m89993e(this.f174516d);
        Log.m105924i("MicroMsg.MusicUni.CommentDrawer", "[initView] bottomMargin= " + e);
        View view = this.f174517e;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) view).addView(this.f174518f, this.f174519g);
        this.f174520h.mo79221a(this.f174516d, this.f174518f.getHeaderLayout(), this.f174521i);
        this.f174520h.mo79222b(this.f174516d, this.f174518f.getCenterLayout());
        this.f174520h.mo79223c(this.f174516d, this.f174518f.getFooterLayout(), this.f174521i);
        this.f174520h.mo79224d(this.f174516d, this.f174518f.getLoadingLayout());
    }
}
