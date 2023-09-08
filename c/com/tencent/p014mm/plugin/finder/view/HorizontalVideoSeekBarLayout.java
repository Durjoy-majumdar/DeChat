package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u0010.R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\u0006R\u001b\u0010\"\u001a\u00020\u001e8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\u0016¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/HorizontalVideoSeekBarLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "e", "Lrx3/g;", "getLongVideoSeekBar", "()Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "longVideoSeekBar", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "f", "getSpeedCtrlBtn", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "speedCtrlBtn", "Landroid/widget/TextView;", "g", "getDescTv", "()Landroid/widget/TextView;", "descTv", "h", "getHiddenTv", "hiddenTv", "i", "getBulletBtnLayout", "bulletBtnLayout", "Landroid/widget/ImageView;", "j", "getBulletSwitch", "()Landroid/widget/ImageView;", "bulletSwitch", "n", "getBulletHintTv", "bulletHintTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout */
public final class HorizontalVideoSeekBarLayout extends FrameLayout {

    /* renamed from: d */
    public final View f162138d;

    /* renamed from: e */
    public final C13601g f162139e = C36568h.m40985a(new C56576f(this));

    /* renamed from: f */
    public final C13601g f162140f = C36568h.m40985a(new C56577g(this));

    /* renamed from: g */
    public final C13601g f162141g = C36568h.m40985a(new C56574d(this));

    /* renamed from: h */
    public final C13601g f162142h = C36568h.m40985a(new C56575e(this));

    /* renamed from: i */
    public final C13601g f162143i = C36568h.m40985a(new C56571a(this));

    /* renamed from: j */
    public final C13601g f162144j = C36568h.m40985a(new C56573c(this));

    /* renamed from: n */
    public final C13601g f162145n = C36568h.m40985a(new C56572b(this));

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$a */
    public static final class C56571a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56571a(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162146d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            return this.f162146d.getContentView().findViewById(C0966R.C0970id.mo7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$b */
    public static final class C56572b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162147d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56572b(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162147d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            return (TextView) this.f162147d.getContentView().findViewById(C0966R.C0970id.f358053mq3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$c */
    public static final class C56573c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56573c(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162148d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            return (ImageView) this.f162148d.getContentView().findViewById(C0966R.C0970id.mq6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$d */
    public static final class C56574d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56574d(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162149d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            return (TextView) this.f162149d.getContentView().findViewById(C0966R.C0970id.ewy);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$e */
    public static final class C56575e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162150d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56575e(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162150d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f162150d.getContentView().findViewById(C0966R.C0970id.evy);
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$f */
    public static final class C56576f extends C87413o implements C32224a<FinderLongVideoPlayerSeekBar> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162151d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56576f(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162151d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            return (FinderLongVideoPlayerSeekBar) this.f162151d.getContentView().findViewById(C0966R.C0970id.l7d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoSeekBarLayout$g */
    public static final class C56577g extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoSeekBarLayout f162152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56577g(HorizontalVideoSeekBarLayout horizontalVideoSeekBarLayout) {
            super(0);
            this.f162152d = horizontalVideoSeekBarLayout;
        }

        public Object invoke() {
            return (WeImageView) this.f162152d.getContentView().findViewById(C0966R.C0970id.hx6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalVideoSeekBarLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(getContext(), C0966R.C0971layout.als, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…eo_seek_bar_layout, this)");
        this.f162138d = inflate;
    }

    public final View getBulletBtnLayout() {
        Object value = this.f162143i.getValue();
        C87412m.m108593f(value, "<get-bulletBtnLayout>(...)");
        return (View) value;
    }

    public final TextView getBulletHintTv() {
        Object value = this.f162145n.getValue();
        C87412m.m108593f(value, "<get-bulletHintTv>(...)");
        return (TextView) value;
    }

    public final ImageView getBulletSwitch() {
        Object value = this.f162144j.getValue();
        C87412m.m108593f(value, "<get-bulletSwitch>(...)");
        return (ImageView) value;
    }

    public final View getContentView() {
        return this.f162138d;
    }

    public final TextView getDescTv() {
        Object value = this.f162141g.getValue();
        C87412m.m108593f(value, "<get-descTv>(...)");
        return (TextView) value;
    }

    public final TextView getHiddenTv() {
        Object value = this.f162142h.getValue();
        C87412m.m108593f(value, "<get-hiddenTv>(...)");
        return (TextView) value;
    }

    public final FinderLongVideoPlayerSeekBar getLongVideoSeekBar() {
        Object value = this.f162139e.getValue();
        C87412m.m108593f(value, "<get-longVideoSeekBar>(...)");
        return (FinderLongVideoPlayerSeekBar) value;
    }

    public final WeImageView getSpeedCtrlBtn() {
        Object value = this.f162140f.getValue();
        C87412m.m108593f(value, "<get-speedCtrlBtn>(...)");
        return (WeImageView) value;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalVideoSeekBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(getContext(), C0966R.C0971layout.als, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…eo_seek_bar_layout, this)");
        this.f162138d = inflate;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalVideoSeekBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(getContext(), C0966R.C0971layout.als, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…eo_seek_bar_layout, this)");
        this.f162138d = inflate;
    }
}
