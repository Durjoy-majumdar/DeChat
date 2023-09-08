package com.tencent.p014mm.plugin.finder.music;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57839g4;
import com.tencent.p014mm.p136ui.C57840h4;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.Log;
import dm1.C58322c;
import dm1.C58323d;
import dm1.C7362e;
import dm1.C7363f;
import em1.C58636b;
import em1.C97671a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import mt1.C61580b;
import rx3.C13598b0;
import te3.C64726td1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010F\u001a\u00020E\u0012\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JB#\b\u0016\u0012\u0006\u0010F\u001a\u00020E\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bI\u0010MR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000205048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010D\u001a\b\u0012\u0004\u0012\u0002050=8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006N"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/music/FinderImgFeedMusicTag;", "Landroid/widget/FrameLayout;", "Lte3/td1;", "d", "Lte3/td1;", "getMusicInfo", "()Lte3/td1;", "setMusicInfo", "(Lte3/td1;)V", "musicInfo", "Lem1/b;", "e", "Lem1/b;", "getPlayer", "()Lem1/b;", "setPlayer", "(Lem1/b;)V", "player", "", "f", "Z", "isMusicFocused", "()Z", "setMusicFocused", "(Z)V", "g", "getShouldMusicResume", "setShouldMusicResume", "shouldMusicResume", "h", "isMusicPauseManually", "setMusicPauseManually", "Landroid/animation/ObjectAnimator;", "i", "Landroid/animation/ObjectAnimator;", "getRotate", "()Landroid/animation/ObjectAnimator;", "setRotate", "(Landroid/animation/ObjectAnimator;)V", "rotate", "j", "getShouldImgLoop", "setShouldImgLoop", "shouldImgLoop", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "n", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getMusicIcon", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "setMusicIcon", "(Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "musicIcon", "Lkotlin/Function1;", "Lrx3/b0;", "o", "Lfy3/l;", "getOnPlayCallback", "()Lfy3/l;", "setOnPlayCallback", "(Lfy3/l;)V", "onPlayCallback", "Lkotlin/Function0;", "p", "Lfy3/a;", "getOnHeadsetStateChangePauseMusicTag", "()Lfy3/a;", "setOnHeadsetStateChangePauseMusicTag", "(Lfy3/a;)V", "onHeadsetStateChangePauseMusicTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag */
public final class FinderImgFeedMusicTag extends FrameLayout {

    /* renamed from: d */
    public C64726td1 f160192d;

    /* renamed from: e */
    public C58636b f160193e;

    /* renamed from: f */
    public boolean f160194f;

    /* renamed from: g */
    public boolean f160195g;

    /* renamed from: h */
    public boolean f160196h;

    /* renamed from: i */
    public ObjectAnimator f160197i;

    /* renamed from: j */
    public boolean f160198j;

    /* renamed from: n */
    public WeImageView f160199n;

    /* renamed from: o */
    public C32226l<? super Boolean, C13598b0> f160200o = C7363f.f25491d;

    /* renamed from: p */
    public C32224a<C13598b0> f160201p = C7362e.f25490d;

    /* renamed from: q */
    public C61580b f160202q = new C58323d(this);

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag$a */
    public static final class C56167a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderImgFeedMusicTag f160203d;

        /* renamed from: e */
        public final /* synthetic */ Context f160204e;

        public C56167a(FinderImgFeedMusicTag finderImgFeedMusicTag, Context context) {
            this.f160203d = finderImgFeedMusicTag;
            this.f160204e = context;
        }

        public final void run() {
            C57839g4 g4Var = new C57839g4(this.f160203d);
            int f = C76577a.m92155f(this.f160204e, C0966R.dimen.f3766df);
            Rect rect = new Rect();
            this.f160203d.getHitRect(rect);
            int i = -f;
            rect.inset(i, i);
            g4Var.mo82266a(new C57840h4(rect, this.f160203d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImgFeedMusicTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo78355c(context);
    }

    /* renamed from: b */
    public static final void m64143b(C64726td1 td12, FinderImgFeedMusicTag finderImgFeedMusicTag, C64726td1 td13) {
        Class cls = C58322c.class;
        Log.m105924i("FinderImgFeedMusicTag", "[bindMusicInfo] musicInfo:" + td12.f185536f + ",viewID:" + finderImgFeedMusicTag);
        finderImgFeedMusicTag.f160192d = td12;
        if (finderImgFeedMusicTag.f160193e != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[bindMusicInfo] this.player is not null and isPlaying = ");
            C58636b bVar = finderImgFeedMusicTag.f160193e;
            sb.append(bVar != null ? Boolean.valueOf(bVar.isPlaying()) : null);
            Log.m105924i("FinderImgFeedMusicTag", sb.toString());
            C58636b bVar2 = finderImgFeedMusicTag.f160193e;
            if (bVar2 != null) {
                bVar2.release();
            }
            C39818r rVar = C39818r.f106831a;
            Context context = finderImgFeedMusicTag.getContext();
            C87412m.m108593f(context, "context");
            ((C58322c) rVar.mo62443b(context).mo75002a(cls)).mo83075d3(finderImgFeedMusicTag);
        }
        Context context2 = finderImgFeedMusicTag.getContext();
        C87412m.m108593f(context2, "context");
        C87412m.m108594g(td13, "musicInfo");
        finderImgFeedMusicTag.f160193e = new C97671a(context2, td13);
        C39818r rVar2 = C39818r.f106831a;
        Context context3 = finderImgFeedMusicTag.getContext();
        C87412m.m108593f(context3, "context");
        C58322c cVar = (C58322c) rVar2.mo62443b(context3).mo75002a(cls);
        C58636b bVar3 = finderImgFeedMusicTag.f160193e;
        C87412m.m108591d(bVar3);
        cVar.getClass();
        if (!cVar.f167005d.containsKey(finderImgFeedMusicTag)) {
            cVar.f167005d.put(finderImgFeedMusicTag, bVar3);
            Log.m105924i("FinderImgFeedMusicPlayer", finderImgFeedMusicTag.getId() + " attach, player size:" + cVar.f167005d.size());
            return;
        }
        cVar.mo83075d3(finderImgFeedMusicTag);
        cVar.f167005d.put(finderImgFeedMusicTag, bVar3);
        Log.m105924i("FinderImgFeedMusicPlayer", finderImgFeedMusicTag.getId() + " attach, already exist");
    }

    /* renamed from: a */
    public final void mo78354a(C64726td1 td12) {
        if (td12 != null) {
            C64726td1 td13 = this.f160192d;
            if (td13 == null) {
                m64143b(td12, this, td12);
                return;
            }
            C87412m.m108591d(td13);
            if (C87412m.m108589b(td13.f185534d, td12.f185534d)) {
                C58636b bVar = this.f160193e;
                boolean z = true;
                if (bVar == null || !bVar.isPlaying()) {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[bindMusicInfo] already bind and playing,musicName = ");
                    C64726td1 td14 = this.f160192d;
                    sb.append(td14 != null ? td14.f185536f : null);
                    Log.m105924i("FinderImgFeedMusicTag", sb.toString());
                    return;
                }
            }
            mo78358f();
            m64143b(td12, this, td12);
        }
    }

    /* renamed from: c */
    public final void mo78355c(Context context) {
        ViewGroup.LayoutParams layoutParams = null;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f359679a93, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        WeImageView weImageView = (WeImageView) inflate;
        this.f160199n = weImageView;
        addView(weImageView);
        WeImageView weImageView2 = this.f160199n;
        if (weImageView2 != null) {
            layoutParams = weImageView2.getLayoutParams();
        }
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        WeImageView weImageView3 = this.f160199n;
        if (weImageView3 != null) {
            weImageView3.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.finder_bgm_gif_first_page, C76577a.m92153d(context, C0966R.color.FG_2)));
        }
        post(new C56167a(this, context));
    }

    /* renamed from: d */
    public final void mo78356d() {
        C58636b bVar;
        if (this.f160192d != null && (bVar = this.f160193e) != null) {
            if (bVar != null) {
                bVar.pause();
            }
            this.f160200o.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: e */
    public final void mo78357e() {
        C58636b bVar;
        String str = null;
        if (this.f160192d == null || (bVar = this.f160193e) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[playMusic] musicInfo = ");
            C64726td1 td12 = this.f160192d;
            if (td12 != null) {
                str = td12.f185536f;
            }
            sb.append(str);
            sb.append(",player = ");
            sb.append(this.f160193e);
            sb.append(",viewID:");
            sb.append(this);
            Log.m105924i("FinderImgFeedMusicTag", sb.toString());
            return;
        }
        boolean z = true;
        this.f160194f = true;
        this.f160195g = true;
        if (bVar == null || !bVar.isPlaying()) {
            z = false;
        }
        if (z) {
            Log.m105924i("FinderImgFeedMusicTag", "music playing");
        } else if (this.f160196h) {
            Log.m105924i("FinderImgFeedMusicTag", "music pause Manually, dont play");
        } else if (this.f160192d != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[playMusic] play success musicInfo:");
            C64726td1 td13 = this.f160192d;
            if (td13 != null) {
                str = td13.f185536f;
            }
            sb4.append(str);
            sb4.append(",viewID:");
            sb4.append(this);
            Log.m105924i("FinderImgFeedMusicTag", sb4.toString());
            C58636b bVar2 = this.f160193e;
            if (bVar2 != null) {
                bVar2.play();
            }
            this.f160200o.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: f */
    public final void mo78358f() {
        ObjectAnimator objectAnimator = this.f160197i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        clearAnimation();
        this.f160194f = false;
        this.f160195g = false;
        this.f160196h = false;
        C58636b bVar = this.f160193e;
        if (bVar != null) {
            bVar.release();
        }
        this.f160192d = null;
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        ((C58322c) rVar.mo62443b(context).mo75002a(C58322c.class)).mo83075d3(this);
    }

    public final WeImageView getMusicIcon() {
        return this.f160199n;
    }

    public final C64726td1 getMusicInfo() {
        return this.f160192d;
    }

    public final C32224a<C13598b0> getOnHeadsetStateChangePauseMusicTag() {
        return this.f160201p;
    }

    public final C32226l<Boolean, C13598b0> getOnPlayCallback() {
        return this.f160200o;
    }

    public final C58636b getPlayer() {
        return this.f160193e;
    }

    public final ObjectAnimator getRotate() {
        return this.f160197i;
    }

    public final boolean getShouldImgLoop() {
        return this.f160198j;
    }

    public final boolean getShouldMusicResume() {
        return this.f160195g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class)).mo80067F2(this.f160202q);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo78356d();
        ((FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class)).mo80081j1(this.f160202q);
    }

    public final void setMusicFocused(boolean z) {
        this.f160194f = z;
    }

    public final void setMusicIcon(WeImageView weImageView) {
        this.f160199n = weImageView;
    }

    public final void setMusicInfo(C64726td1 td12) {
        this.f160192d = td12;
    }

    public final void setMusicPauseManually(boolean z) {
        this.f160196h = z;
    }

    public final void setOnHeadsetStateChangePauseMusicTag(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f160201p = aVar;
    }

    public final void setOnPlayCallback(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f160200o = lVar;
    }

    public final void setPlayer(C58636b bVar) {
        this.f160193e = bVar;
    }

    public final void setRotate(ObjectAnimator objectAnimator) {
        this.f160197i = objectAnimator;
    }

    public final void setShouldImgLoop(boolean z) {
        this.f160198j = z;
    }

    public final void setShouldMusicResume(boolean z) {
        this.f160195g = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderImgFeedMusicTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo78355c(context);
    }
}
