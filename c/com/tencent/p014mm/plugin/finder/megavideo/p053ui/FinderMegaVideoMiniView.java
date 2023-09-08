package com.tencent.p014mm.plugin.finder.megavideo.p053ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.thumbplayer.api.ITPPlayer;
import gr1.C59673q2;
import gr1.C59684w2;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60157c5;
import kotlin.Metadata;
import mr1.C61575s;
import mr1.C61576t;
import qt1.C12931a;
import te3.C64689rq2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004/012B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u0010.J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015¨\u00063"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoMiniView;", "Landroid/widget/FrameLayout;", "", "isPlay", "Lrx3/b0;", "setMusicCtrlBtnStatus", "Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "getVideoView", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getAvatarIv", "()Landroid/widget/ImageView;", "setAvatarIv", "(Landroid/widget/ImageView;)V", "avatarIv", "f", "Z", "isVideoEnd", "()Z", "setVideoEnd", "(Z)V", "Lcom/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoMiniView$c;", "g", "Lcom/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoMiniView$c;", "getShapeType", "()Lcom/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoMiniView$c;", "setShapeType", "(Lcom/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoMiniView$c;)V", "shapeType", "Lht1/c5;", "h", "Lht1/c5;", "getVideoViewCallback", "()Lht1/c5;", "videoViewCallback", "isError", "setError", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView */
public final class FinderMegaVideoMiniView extends FrameLayout {

    /* renamed from: i */
    public static final C56148a f160139i = new C56148a((C8480h) null);

    /* renamed from: d */
    public final TextView f160140d;

    /* renamed from: e */
    public ImageView f160141e;

    /* renamed from: f */
    public boolean f160142f;

    /* renamed from: g */
    public C56150c f160143g = C56150c.PORTRAIT;

    /* renamed from: h */
    public final C60157c5 f160144h;

    /* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$a */
    public static final class C56148a {
        public C56148a(C8480h hVar) {
        }

        /* renamed from: a */
        public final Size mo78293a(Resources resources, C56150c cVar) {
            C87412m.m108594g(resources, "resource");
            C87412m.m108594g(cVar, "type");
            int ordinal = cVar.ordinal();
            return ordinal != 1 ? ordinal != 2 ? (ordinal == 3 || ordinal == 4) ? new Size(resources.getDimensionPixelOffset(C0966R.dimen.axa), resources.getDimensionPixelOffset(C0966R.dimen.ax_)) : new Size(resources.getDimensionPixelOffset(C0966R.dimen.a8i), resources.getDimensionPixelOffset(C0966R.dimen.a8h)) : new Size(resources.getDimensionPixelOffset(C0966R.dimen.a8j), resources.getDimensionPixelOffset(C0966R.dimen.a8j)) : new Size(resources.getDimensionPixelOffset(C0966R.dimen.a8g), resources.getDimensionPixelOffset(C0966R.dimen.a8f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$b */
    public static class C56149b extends C56151d {
        public C56149b(FinderMegaVideoMiniView finderMegaVideoMiniView) {
            C87412m.m108594g(finderMegaVideoMiniView, "miniView");
        }

        /* renamed from: c */
        public void mo78294c(C64689rq2 rq22, int i, int i2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$c */
    public enum C56150c {
        PORTRAIT,
        MUSIC,
        ERROR
    }

    /* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$d */
    public static class C56151d implements C59684w2 {
        /* renamed from: b */
        public void mo78295b(float f) {
        }

        /* renamed from: c */
        public void mo78294c(C64689rq2 rq22, int i, int i2) {
        }

        /* renamed from: d */
        public void mo78296d(C64689rq2 rq22, long j, long j2) {
        }

        /* renamed from: e */
        public void mo77475e(C64689rq2 rq22) {
        }

        /* renamed from: f */
        public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
        }

        /* renamed from: g */
        public void mo78298g(C64689rq2 rq22, C59673q2 q2Var, int i) {
        }

        /* renamed from: h */
        public void mo78299h(C64689rq2 rq22) {
        }

        /* renamed from: i */
        public void mo78300i(C64689rq2 rq22, C61576t tVar) {
        }

        /* renamed from: j */
        public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        }

        /* renamed from: k */
        public void mo78302k(C64689rq2 rq22) {
        }

        /* renamed from: l */
        public void mo78303l(C64689rq2 rq22, C59673q2 q2Var, int i) {
        }

        /* renamed from: m */
        public void mo78304m(C64689rq2 rq22, long j) {
        }

        /* renamed from: n */
        public void mo78305n(C64689rq2 rq22, C59673q2 q2Var, int i) {
        }

        /* renamed from: o */
        public void mo78306o(C59673q2 q2Var, C61575s sVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView$e */
    public static final class C56152e implements C60157c5 {

        /* renamed from: d */
        public final /* synthetic */ FinderMegaVideoMiniView f160149d;

        public C56152e(FinderMegaVideoMiniView finderMegaVideoMiniView) {
            this.f160149d = finderMegaVideoMiniView;
        }

        /* renamed from: F */
        public void mo22955F(String str, String str2) {
            FinderMegaVideoMiniView finderMegaVideoMiniView = this.f160149d;
            C56148a aVar = FinderMegaVideoMiniView.f160139i;
            finderMegaVideoMiniView.mo78283a();
        }

        /* renamed from: I1 */
        public void mo22956I1(String str, String str2) {
        }

        /* renamed from: I3 */
        public void mo22957I3(String str, String str2, Boolean bool) {
            bool.booleanValue();
            this.f160149d.setVideoEnd(false);
            FinderMegaVideoMiniView finderMegaVideoMiniView = this.f160149d;
            finderMegaVideoMiniView.setContentDescription(finderMegaVideoMiniView.getResources().getString(C0966R.string.ju9));
        }

        /* renamed from: L */
        public void mo22958L(String str, String str2) {
            FinderMegaVideoMiniView finderMegaVideoMiniView = this.f160149d;
            finderMegaVideoMiniView.setContentDescription(finderMegaVideoMiniView.getResources().getString(C0966R.string.ju8));
            this.f160149d.setVideoEnd(true);
            this.f160149d.setMusicCtrlBtnStatus(false);
        }

        /* renamed from: M5 */
        public void mo22959M5(int i, int i2) {
        }

        /* renamed from: T */
        public void mo22960T(String str, String str2, String str3, int i, int i2) {
            FinderMegaVideoMiniView finderMegaVideoMiniView = this.f160149d;
            finderMegaVideoMiniView.setContentDescription(finderMegaVideoMiniView.getResources().getString(C0966R.string.ju9));
            this.f160149d.setVideoEnd(false);
            FinderThumbPlayerProxy videoView = this.f160149d.getVideoView();
            if (videoView != null) {
                videoView.stop();
            }
            this.f160149d.setError(true);
        }

        /* renamed from: V5 */
        public void mo22961V5(String str, String str2, int i, int i2, int i3) {
        }

        /* renamed from: Z */
        public void mo22962Z(String str, String str2) {
        }

        /* renamed from: a0 */
        public void mo22963a0(String str, String str2) {
        }

        /* renamed from: l0 */
        public void mo22964l0(String str, String str2, int i, int i2) {
        }

        /* renamed from: m0 */
        public void mo22965m0(String str, String str2) {
            FinderMegaVideoMiniView finderMegaVideoMiniView = this.f160149d;
            C56148a aVar = FinderMegaVideoMiniView.f160139i;
            finderMegaVideoMiniView.mo78283a();
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMegaVideoMiniView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View.inflate(getContext(), C0966R.C0971layout.f359688d40, this);
        View findViewById = findViewById(C0966R.C0970id.nv_);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_mini_view_hint_tv)");
        this.f160140d = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.nv9);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_mini_view_avatar_iv)");
        this.f160141e = (ImageView) findViewById2;
        this.f160144h = new C56152e(this);
    }

    /* renamed from: a */
    public final void mo78283a() {
        this.f160140d.setVisibility(8);
        this.f160142f = false;
        setContentDescription(getResources().getString(C0966R.string.ju6));
    }

    public final ImageView getAvatarIv() {
        return this.f160141e;
    }

    public final C56150c getShapeType() {
        return this.f160143g;
    }

    public final FinderThumbPlayerProxy getVideoView() {
        return null;
    }

    public final C60157c5 getVideoViewCallback() {
        return this.f160144h;
    }

    public final void setAvatarIv(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f160141e = imageView;
    }

    public final void setError(boolean z) {
    }

    public final void setMusicCtrlBtnStatus(boolean z) {
        FinderVideoPassiveMiniViewHelper.C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
        dVar.mo77472a().f311726d.f311693n.f311706d = z;
        dVar.mo77472a().mo90540s(dVar.mo77472a().f311726d.f311693n);
    }

    public final void setShapeType(C56150c cVar) {
        C87412m.m108594g(cVar, "<set-?>");
        this.f160143g = cVar;
    }

    public final void setVideoEnd(boolean z) {
        this.f160142f = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMegaVideoMiniView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View.inflate(getContext(), C0966R.C0971layout.f359688d40, this);
        View findViewById = findViewById(C0966R.C0970id.nv_);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_mini_view_hint_tv)");
        this.f160140d = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.nv9);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_mini_view_avatar_iv)");
        this.f160141e = (ImageView) findViewById2;
        this.f160144h = new C56152e(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMegaVideoMiniView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(getContext(), C0966R.C0971layout.f359688d40, this);
        View findViewById = findViewById(C0966R.C0970id.nv_);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_mini_view_hint_tv)");
        this.f160140d = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.nv9);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_mini_view_avatar_iv)");
        this.f160141e = (ImageView) findViewById2;
        this.f160144h = new C56152e(this);
    }
}
