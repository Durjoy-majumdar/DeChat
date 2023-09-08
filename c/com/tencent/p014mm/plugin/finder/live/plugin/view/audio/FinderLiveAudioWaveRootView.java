package com.tencent.p014mm.plugin.finder.live.plugin.view.audio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import er1.C7919x;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B#\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveRootView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "e", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Landroid/view/View;", "f", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView;", "g", "Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView;", "getLeftWave", "()Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView;", "setLeftWave", "(Lcom/tencent/mm/plugin/finder/live/plugin/view/audio/FinderLiveAudioWaveView;)V", "leftWave", "h", "getRightWave", "setRightWave", "rightWave", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "setTitleTxt", "(Landroid/widget/TextView;)V", "titleTxt", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView */
public final class FinderLiveAudioWaveRootView extends FrameLayout {

    /* renamed from: d */
    public final String f159492d;

    /* renamed from: e */
    public Context f159493e;

    /* renamed from: f */
    public View f159494f;

    /* renamed from: g */
    public FinderLiveAudioWaveView f159495g;

    /* renamed from: h */
    public FinderLiveAudioWaveView f159496h;

    /* renamed from: i */
    public TextView f159497i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveAudioWaveRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo77689a() {
        this.f159495g.setWaveStart(false, false);
        this.f159496h.setWaveStart(false, true);
    }

    public final FinderLiveAudioWaveView getLeftWave() {
        return this.f159495g;
    }

    public final Context getMContext() {
        return this.f159493e;
    }

    public final FinderLiveAudioWaveView getRightWave() {
        return this.f159496h;
    }

    public final View getRoot() {
        return this.f159494f;
    }

    public final TextView getTitleTxt() {
        return this.f159497i;
    }

    public final void setLeftWave(FinderLiveAudioWaveView finderLiveAudioWaveView) {
        C87412m.m108594g(finderLiveAudioWaveView, "<set-?>");
        this.f159495g = finderLiveAudioWaveView;
    }

    public final void setMContext(Context context) {
        C87412m.m108594g(context, "<set-?>");
        this.f159493e = context;
    }

    public final void setRightWave(FinderLiveAudioWaveView finderLiveAudioWaveView) {
        C87412m.m108594g(finderLiveAudioWaveView, "<set-?>");
        this.f159496h = finderLiveAudioWaveView;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f159494f = view;
    }

    public final void setTitleTxt(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f159497i = textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAudioWaveRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159492d = "FinderLiveAudioWaveRootView";
        this.f159493e = context;
        View inflate = View.inflate(context, C0966R.C0971layout.cy6, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…_audio_wave_layout, this)");
        this.f159494f = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.nd7);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.wave_view_left)");
        this.f159495g = (FinderLiveAudioWaveView) findViewById;
        View findViewById2 = this.f159494f.findViewById(C0966R.C0970id.nd8);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.wave_view_right)");
        this.f159496h = (FinderLiveAudioWaveView) findViewById2;
        View findViewById3 = this.f159494f.findViewById(C0966R.C0970id.nd9);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.wave_view_txt_view)");
        TextView textView = (TextView) findViewById3;
        this.f159497i = textView;
        C7919x.m8091a(textView);
    }
}
