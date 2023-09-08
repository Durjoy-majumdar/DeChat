package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gr1.C59667n2;
import gr1.C8394g1;
import gy3.C87412m;
import iy3.C60641c;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B%\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00101\u001a\u00020\u0003¢\u0006\u0004\b/\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoGreenSeekBar;", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "Lgr1/n2;", "", "getLayoutId", "Landroid/widget/ImageView;", "imgView", "Lrx3/b0;", "setPlayButton", "", "isPlay", "setIsPlay", "_len", "setVideoTotalTime", "playTime", "setPlayTimeText", "target", "setProgress", "getCurrentProgress", "getMaxProgress", "Lgr1/n2$b;", "callback", "setSeekBarCallback", "Landroid/widget/TextView;", "T", "Landroid/widget/TextView;", "getRelativeTotalTimeTv", "()Landroid/widget/TextView;", "setRelativeTotalTimeTv", "(Landroid/widget/TextView;)V", "relativeTotalTimeTv", "U", "getRelativeCurrentTimeTv", "setRelativeCurrentTimeTv", "relativeCurrentTimeTv", "Lkotlin/Function0;", "V", "Lfy3/a;", "getOnPauseClickListener", "()Lfy3/a;", "setOnPauseClickListener", "(Lfy3/a;)V", "onPauseClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoGreenSeekBar */
public final class FinderVideoGreenSeekBar extends FinderLongVideoPlayerSeekBar implements C59667n2 {

    /* renamed from: S */
    public String f17574S = "";

    /* renamed from: T */
    public TextView f17575T;

    /* renamed from: U */
    public TextView f17576U;

    /* renamed from: V */
    public C32224a<Boolean> f17577V = C8394g1.f27385d;

    /* renamed from: W */
    public C59667n2.C8416b f17578W;

    /* renamed from: p0 */
    public final int f17579p0 = 500;

    /* renamed from: x0 */
    public int f17580x0;

    /* renamed from: y0 */
    public boolean f17581y0;

    public FinderVideoGreenSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public void mo4239b(float f) {
        FinderLongVideoPlayerSeekBar.C3908a playStatusListener = getPlayStatusListener();
        if (playStatusListener != null) {
            playStatusListener.mo2426b(f);
        }
    }

    /* renamed from: d */
    public boolean mo4240d() {
        return true;
    }

    /* renamed from: e */
    public void mo4242e(String str, boolean z) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (!this.f17581y0) {
            this.f17577V.invoke();
            setIsPlay(false);
            this.f17581y0 = true;
        }
    }

    /* renamed from: g */
    public void mo4243g(float f, long j, long j2) {
        FinderLongVideoPlayerSeekBar.C3908a aVar = this.f17551H;
        if (aVar != null) {
            aVar.mo2427c(j);
        }
        setProgress(C60641c.m70921b(f * ((float) this.f17579p0)));
    }

    public int getCurrentProgress() {
        return this.f17580x0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cyz;
    }

    public int getMaxProgress() {
        return this.f17579p0;
    }

    public final C32224a<Boolean> getOnPauseClickListener() {
        return this.f17577V;
    }

    public final TextView getRelativeCurrentTimeTv() {
        return this.f17576U;
    }

    public final TextView getRelativeTotalTimeTv() {
        return this.f17575T;
    }

    /* renamed from: h */
    public void mo4258h(int i, int i2) {
    }

    /* renamed from: i */
    public void mo4259i(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (this.f17581y0) {
            this.f17577V.invoke();
            setIsPlay(true);
            this.f17581y0 = false;
        }
    }

    /* renamed from: j */
    public boolean mo4260j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo4261k() {
        return false;
    }

    /* renamed from: l */
    public void mo4262l(boolean z) {
    }

    /* renamed from: m */
    public void mo4263m(float f, int i, int i2) {
        setVideoTotalTime(i2);
        seek(i);
    }

    /* renamed from: n */
    public boolean mo4264n() {
        return this.f17581y0;
    }

    /* renamed from: o */
    public void mo4265o() {
    }

    public void onVideoEnded() {
        super.onVideoEnded();
        setProgress(0);
    }

    public void setIsPlay(boolean z) {
        if (this.f283824z != z) {
            super.setIsPlay(z);
            this.f273525i.setImageResource(z ? C0966R.C0969drawable.cjm : C0966R.C0969drawable.cjn);
        }
    }

    public final void setOnPauseClickListener(C32224a<Boolean> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17577V = aVar;
    }

    public final void setPlayButton(ImageView imageView) {
        C87412m.m108594g(imageView, "imgView");
        this.f273525i = imageView;
        imageView.setImageResource(C0966R.C0969drawable.cjm);
    }

    public void setPlayTimeText(int i) {
        String str = mo130086q(i / 60) + XVFSFile.PATH_SEPARATOR_CHAR + mo130086q(i % 60);
        TextView textView = this.f17576U;
        if (textView != null) {
            textView.setText(str);
        }
        this.f273526j.setText(str + this.f17574S);
    }

    public void setProgress(int i) {
        this.f17580x0 = Math.max(0, i);
    }

    public final void setRelativeCurrentTimeTv(TextView textView) {
        this.f17576U = textView;
    }

    public final void setRelativeTotalTimeTv(TextView textView) {
        this.f17575T = textView;
    }

    public void setSeekBarCallback(C59667n2.C8416b bVar) {
        C87412m.m108594g(bVar, "callback");
        this.f17578W = bVar;
    }

    public void setVideoTotalTime(int i) {
        boolean z = this.f273528o != i;
        super.setVideoTotalTime(i);
        this.f273527n.setVisibility(8);
        TextView textView = this.f17575T;
        if (textView != null) {
            textView.setText(this.f273527n.getText());
        }
        if (z) {
            this.f17574S = XVFSFile.SEPARATOR_CHAR + mo130086q(this.f273528o / 60) + XVFSFile.PATH_SEPARATOR_CHAR + mo130086q(this.f273528o % 60);
        }
    }

    public FinderVideoGreenSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
