package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import u62.C22583d;
import u62.C22597f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010C\u001a\u00020B\u0012\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GB#\b\u0016\u0012\u0006\u0010C\u001a\u00020B\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\u0006\u0010H\u001a\u00020\b¢\u0006\u0004\bF\u0010IJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R6\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR6\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR*\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R*\u00100\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\"\u00107\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010>\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006J"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderCommentAdVideoView;", "Lcom/tencent/mm/plugin/mmplayer/player/view/MMVideoFrameLayout;", "Lu62/f;", "", "mute", "Lrx3/b0;", "setMute", "Lkotlin/Function2;", "", "t", "Lfy3/p;", "getOnVideoSizeChange", "()Lfy3/p;", "setOnVideoSizeChange", "(Lfy3/p;)V", "onVideoSizeChange", "Lkotlin/Function0;", "u", "Lfy3/a;", "getOnFirstFrameRendered", "()Lfy3/a;", "setOnFirstFrameRendered", "(Lfy3/a;)V", "onFirstFrameRendered", "v", "getOnVideoReplay", "setOnVideoReplay", "onVideoReplay", "", "w", "getOnProgressChange", "setOnProgressChange", "onProgressChange", "x", "getOnStateChange", "setOnStateChange", "onStateChange", "y", "getOnVideoComplete", "setOnVideoComplete", "onVideoComplete", "z", "getOnVideoError", "setOnVideoError", "onVideoError", "A", "getOnVideoBufferingStart", "setOnVideoBufferingStart", "onVideoBufferingStart", "B", "J", "getCurStartPlayTime", "()J", "setCurStartPlayTime", "(J)V", "curStartPlayTime", "C", "getVideoTotalTime", "setVideoTotalTime", "videoTotalTime", "D", "Z", "isAttached", "()Z", "setAttached", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView */
public final class FinderCommentAdVideoView extends MMVideoFrameLayout<C22597f> {

    /* renamed from: A */
    public C32224a<C13598b0> f162015A;

    /* renamed from: B */
    public long f162016B;

    /* renamed from: C */
    public long f162017C;

    /* renamed from: D */
    public boolean f162018D;

    /* renamed from: t */
    public C32227p<? super Integer, ? super Integer, C13598b0> f162019t;

    /* renamed from: u */
    public C32224a<C13598b0> f162020u;

    /* renamed from: v */
    public C32224a<C13598b0> f162021v;

    /* renamed from: w */
    public C32227p<? super Long, ? super Long, C13598b0> f162022w;

    /* renamed from: x */
    public C32227p<? super Integer, ? super Integer, C13598b0> f162023x;

    /* renamed from: y */
    public C32224a<C13598b0> f162024y;

    /* renamed from: z */
    public C32224a<C13598b0> f162025z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentAdVideoView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d */
    public void mo23982d(String str) {
        C32224a<C13598b0> aVar = this.f162015A;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: e */
    public void mo23983e() {
        C32224a<C13598b0> aVar = this.f162024y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: f */
    public void mo23984f(C22583d dVar, int i, int i2) {
        C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
        super.mo23984f(dVar, i, i2);
        C32224a<C13598b0> aVar = this.f162025z;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: g */
    public void mo23985g(String str, int i) {
        C87412m.m108594g(str, "invokeSource");
        super.mo23985g(str, i);
        C32224a<C13598b0> aVar = this.f162020u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final long getCurStartPlayTime() {
        return this.f162016B;
    }

    public final C32224a<C13598b0> getOnFirstFrameRendered() {
        return this.f162020u;
    }

    public final C32227p<Long, Long, C13598b0> getOnProgressChange() {
        return this.f162022w;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnStateChange() {
        return this.f162023x;
    }

    public final C32224a<C13598b0> getOnVideoBufferingStart() {
        return this.f162015A;
    }

    public final C32224a<C13598b0> getOnVideoComplete() {
        return this.f162024y;
    }

    public final C32224a<C13598b0> getOnVideoError() {
        return this.f162025z;
    }

    public final C32224a<C13598b0> getOnVideoReplay() {
        return this.f162021v;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnVideoSizeChange() {
        return this.f162019t;
    }

    public final long getVideoTotalTime() {
        return this.f162017C;
    }

    /* renamed from: h */
    public void mo23995h(C22583d dVar, long j, long j2) {
        C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
        C32227p<? super Long, ? super Long, C13598b0> pVar = this.f162022w;
        if (pVar != null) {
            pVar.invoke(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: i */
    public void mo23996i() {
        super.mo23996i();
        C32224a<C13598b0> aVar = this.f162021v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: j */
    public void mo23997j(int i, int i2) {
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f162019t;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: p */
    public void mo24000p() {
        if (this.f162018D) {
            super.mo24000p();
        }
        this.f162019t = null;
        this.f162020u = null;
        this.f162022w = null;
        this.f162023x = null;
        this.f162024y = null;
        this.f162025z = null;
        this.f162015A = null;
    }

    public final void setAttached(boolean z) {
        this.f162018D = z;
    }

    public final void setCurStartPlayTime(long j) {
        this.f162016B = j;
    }

    public final void setMute(boolean z) {
        getPlayer().setOutputMute(z);
    }

    public final void setOnFirstFrameRendered(C32224a<C13598b0> aVar) {
        this.f162020u = aVar;
    }

    public final void setOnProgressChange(C32227p<? super Long, ? super Long, C13598b0> pVar) {
        this.f162022w = pVar;
    }

    public final void setOnStateChange(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f162023x = pVar;
    }

    public final void setOnVideoBufferingStart(C32224a<C13598b0> aVar) {
        this.f162015A = aVar;
    }

    public final void setOnVideoComplete(C32224a<C13598b0> aVar) {
        this.f162024y = aVar;
    }

    public final void setOnVideoError(C32224a<C13598b0> aVar) {
        this.f162025z = aVar;
    }

    public final void setOnVideoReplay(C32224a<C13598b0> aVar) {
        this.f162021v = aVar;
    }

    public final void setOnVideoSizeChange(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f162019t = pVar;
    }

    public final void setVideoTotalTime(long j) {
        this.f162017C = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentAdVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentAdVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
