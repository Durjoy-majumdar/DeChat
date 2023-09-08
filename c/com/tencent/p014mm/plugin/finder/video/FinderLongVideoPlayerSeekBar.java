package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C8422q0;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u00013B\u001d\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B%\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b/\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00064"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBar;", "", "getLayoutId", "", "isPlay", "Lrx3/b0;", "setIsPlay", "playTime", "setPlayTimeText", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$a;", "H", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$a;", "getPlayStatusListener", "()Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$a;", "setPlayStatusListener", "(Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$a;)V", "playStatusListener", "Lkotlin/Function0;", "I", "Lfy3/a;", "getOnSeekStart", "()Lfy3/a;", "setOnSeekStart", "(Lfy3/a;)V", "onSeekStart", "J", "getOnSeekEnd", "setOnSeekEnd", "onSeekEnd", "Lkotlin/Function1;", "K", "Lfy3/l;", "getOnCustomLoadingStatusChange", "()Lfy3/l;", "setOnCustomLoadingStatusChange", "(Lfy3/l;)V", "onCustomLoadingStatusChange", "P", "Lrx3/g;", "getTouchSlop", "()I", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar */
public class FinderLongVideoPlayerSeekBar extends RedesignVideoPlayerSeekBar {

    /* renamed from: H */
    public C3908a f17551H;

    /* renamed from: I */
    public C32224a<C13598b0> f17552I;

    /* renamed from: J */
    public C32224a<C13598b0> f17553J;

    /* renamed from: K */
    public C32226l<? super Boolean, C13598b0> f17554K;

    /* renamed from: L */
    public int f17555L;

    /* renamed from: M */
    public int f17556M;

    /* renamed from: N */
    public boolean f17557N;

    /* renamed from: P */
    public final C13601g f17558P = C36568h.m40985a(new C8422q0(this));

    /* renamed from: Q */
    public int f17559Q;

    /* renamed from: R */
    public int f17560R;

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar$a */
    public interface C3908a {
        /* renamed from: a */
        void mo2425a(int i);

        /* renamed from: b */
        void mo2426b(float f);

        /* renamed from: c */
        void mo2427c(long j);

        /* renamed from: d */
        void mo2428d(boolean z);

        /* renamed from: e */
        void mo2429e();

        void onVideoEnded();
    }

    public FinderLongVideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public final int getTouchSlop() {
        return ((Number) this.f17558P.getValue()).intValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ar4;
    }

    public final C32226l<Boolean, C13598b0> getOnCustomLoadingStatusChange() {
        return this.f17554K;
    }

    public final C32224a<C13598b0> getOnSeekEnd() {
        return this.f17553J;
    }

    public final C32224a<C13598b0> getOnSeekStart() {
        return this.f17552I;
    }

    public final C3908a getPlayStatusListener() {
        return this.f17551H;
    }

    public void onVideoEnded() {
        setIsPlay(false);
        C3908a aVar = this.f17551H;
        if (aVar != null) {
            aVar.onVideoEnded();
        }
    }

    public void setIsPlay(boolean z) {
        if (this.f283824z != z) {
            super.setIsPlay(z);
            C3908a aVar = this.f17551H;
            if (aVar != null) {
                aVar.mo2428d(z);
            }
        }
    }

    public final void setOnCustomLoadingStatusChange(C32226l<? super Boolean, C13598b0> lVar) {
        this.f17554K = lVar;
    }

    public final void setOnSeekEnd(C32224a<C13598b0> aVar) {
        this.f17553J = aVar;
    }

    public final void setOnSeekStart(C32224a<C13598b0> aVar) {
        this.f17552I = aVar;
    }

    public final void setPlayStatusListener(C3908a aVar) {
        this.f17551H = aVar;
    }

    public void setPlayTimeText(int i) {
        TextView textView = this.f273526j;
        textView.setText(mo130086q(i / 60) + XVFSFile.PATH_SEPARATOR_CHAR + mo130086q(i % 60));
    }

    public FinderLongVideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
