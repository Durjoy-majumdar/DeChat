package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.SliderSeekBar;
import gy3.C87412m;
import hi3.C87515a;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvSliderSeekBar;", "Lcom/tencent/mm/plugin/mv/ui/view/SliderSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar */
public final class MusicMvSliderSeekBar extends SliderSeekBar {
    public MusicMvSliderSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public void mo151139c() {
        int b = C76577a.m92151b(getContext(), 16);
        this.f315252j = new SliderSeekBar.C105938c(mo151141g(C0966R.raw.music_mv_left_bar, b), mo151141g(C0966R.raw.music_mv_left_bar, b));
        this.f315253n = new SliderSeekBar.C105938c(mo151141g(C0966R.raw.music_mv_right_bar, b), mo151141g(C0966R.raw.music_mv_right_bar, b));
        this.f315244C = true;
        postInvalidate();
    }

    /* renamed from: d */
    public void mo151140d() {
        super.mo151140d();
        this.f315254o = C76577a.m92151b(getContext(), 16);
        this.f315265z = C76577a.m92151b(getContext(), 16);
        this.f315247e = true;
    }

    /* renamed from: g */
    public final Drawable mo151141g(int i, int i2) {
        Drawable e = C87515a.m108835e(getContext().getResources(), i, (((float) i2) * 1.0f) / ((float) getContext().getResources().getDrawable(i).getIntrinsicWidth()));
        C87412m.m108593f(e, "getSVGDrawable(context.r…rces, drawableRes, scale)");
        return e;
    }

    public MusicMvSliderSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
