package oi1;

import al1.C54130j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ni1.C61753b;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import qj1.C62660c;
import si1.C63902g;
import wk1.C15484y;

/* renamed from: oi1.b */
public abstract class C62030b extends C63902g implements View.OnClickListener {

    /* renamed from: A */
    public TextView f176329A;

    /* renamed from: B */
    public ViewGroup f176330B;

    /* renamed from: q */
    public boolean f176331q;

    /* renamed from: r */
    public PAGView f176332r;

    /* renamed from: s */
    public FrameLayout f176333s;

    /* renamed from: t */
    public WeImageView f176334t;

    /* renamed from: u */
    public ViewGroup f176335u;

    /* renamed from: v */
    public ViewGroup f176336v;

    /* renamed from: w */
    public ImageView f176337w;

    /* renamed from: x */
    public TextView f176338x;

    /* renamed from: y */
    public ImageView f176339y;

    /* renamed from: z */
    public TextView f176340z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62030b(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar, 1);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
        mo86956t();
        getFinderLiveMicStateAudioWaveIcon().setComposition(PAGFile.Load(context.getAssets(), "finder_live_link_mic_wave.pag"));
        getFinderLiveMicStateAudioWaveIcon().setRepeatCount(-1);
        addView(getRoot());
        getRoot().setOnClickListener(this);
        getFinderLiveMicMuteIcon().setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftgiAnimationStart");
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
    }

    public ImageView getAudioBgView() {
        return getFinderLiveMicStateAudioBg();
    }

    public ImageView getAvatarView() {
        return getFinderLiveMicStateAudioAvatar();
    }

    public final ViewGroup getFinderLiveLuckyMoneyBubbleUiRoot() {
        ViewGroup viewGroup = this.f176330B;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public final TextView getFinderLiveMicHeartText() {
        TextView textView = this.f176340z;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveMicHeartText");
        throw null;
    }

    public final FrameLayout getFinderLiveMicMuteIcon() {
        FrameLayout frameLayout = this.f176333s;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("finderLiveMicMuteIcon");
        throw null;
    }

    public final WeImageView getFinderLiveMicMuteIconWe() {
        WeImageView weImageView = this.f176334t;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("finderLiveMicMuteIconWe");
        throw null;
    }

    public final ViewGroup getFinderLiveMicNewNormalMicGiftItemLayout() {
        ViewGroup viewGroup = this.f176336v;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    public final ImageView getFinderLiveMicStateAudioAvatar() {
        ImageView imageView = this.f176337w;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("finderLiveMicStateAudioAvatar");
        throw null;
    }

    public final ImageView getFinderLiveMicStateAudioBg() {
        ImageView imageView = this.f176339y;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("finderLiveMicStateAudioBg");
        throw null;
    }

    public final TextView getFinderLiveMicStateAudioName() {
        TextView textView = this.f176338x;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveMicStateAudioName");
        throw null;
    }

    public final PAGView getFinderLiveMicStateAudioWaveIcon() {
        PAGView pAGView = this.f176332r;
        if (pAGView != null) {
            return pAGView;
        }
        C87412m.m108603p("finderLiveMicStateAudioWaveIcon");
        throw null;
    }

    public final TextView getFinderLiveMicUserLevel() {
        TextView textView = this.f176329A;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveMicUserLevel");
        throw null;
    }

    public ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    public ViewGroup getLuckyMoneyRootView() {
        Log.m105924i(getTAG(), "getLuckyMoneyRootView");
        return getFinderLiveLuckyMoneyBubbleUiRoot();
    }

    public PAGView getMicAudioWaveIcon() {
        return getFinderLiveMicStateAudioWaveIcon();
    }

    public TextView getMicHeartTextView() {
        return getFinderLiveMicHeartText();
    }

    public FrameLayout getMicMuteIcon() {
        return getFinderLiveMicMuteIcon();
    }

    public TextView getMicUserLevelTextView() {
        return getFinderLiveMicUserLevel();
    }

    public TextView getNickTextView() {
        return getFinderLiveMicStateAudioName();
    }

    public final ViewGroup getRoot() {
        ViewGroup viewGroup = this.f176335u;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: l */
    public void mo86941l(boolean z, int i, boolean z2) {
        super.mo86941l(z, i, z2);
        if (mo88678i() || (mo88679k() && ((C54991o) getBasePlugin().mo87696x0(C54991o.class)).f154274W2)) {
            getMicAudioWaveIcon().setVisibility(8);
            getMicAudioWaveIcon().stop();
            getMicMuteIcon().setVisibility(0);
            return;
        }
        getMicMuteIcon().setVisibility(8);
        if (this.f176331q != z) {
            String tag = getTAG();
            Log.m105924i(tag, "notifyMicUserTalkingState notTalking:" + z + " lastNotTalking: " + this.f176331q);
            this.f176331q = z;
            if (z) {
                getMicAudioWaveIcon().stop();
                getMicAudioWaveIcon().setVisibility(8);
                return;
            }
            getMicAudioWaveIcon().setVisibility(0);
            getMicAudioWaveIcon().play();
        }
    }

    /* renamed from: n */
    public void mo86942n() {
        if (!mo88678i()) {
            super.mo86942n();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int id = getRoot().getId();
        if (valueOf != null && valueOf.intValue() == id) {
            mo88680m();
        } else {
            int id4 = getFinderLiveMicMuteIcon().getId();
            if (valueOf != null && valueOf.intValue() == id4) {
                mo88681o();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMicAudioWaveIcon().setVisibility(8);
        getMicAudioWaveIcon().stop();
    }

    /* renamed from: q */
    public void mo86914q() {
        C54130j bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            mo86641g(getNickTextView());
            mo86639e(getAvatarView());
            mo86638d(getAudioBgView());
            mo86941l(bindLinkMicUser.f152010n, bindLinkMicUser.f152018v, false);
            C87412m.m108594g(getMicHeartTextView(), "heatText");
            mo86640f(getMicUserLevelTextView(), C15484y.SIZE_NORMAL);
        }
    }

    public final void setFinderLiveLuckyMoneyBubbleUiRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176330B = viewGroup;
    }

    public final void setFinderLiveMicHeartText(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f176340z = textView;
    }

    public final void setFinderLiveMicMuteIcon(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f176333s = frameLayout;
    }

    public final void setFinderLiveMicMuteIconWe(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "<set-?>");
        this.f176334t = weImageView;
    }

    public final void setFinderLiveMicNewNormalMicGiftItemLayout(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176336v = viewGroup;
    }

    public final void setFinderLiveMicStateAudioAvatar(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f176337w = imageView;
    }

    public final void setFinderLiveMicStateAudioBg(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f176339y = imageView;
    }

    public final void setFinderLiveMicStateAudioName(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f176338x = textView;
    }

    public final void setFinderLiveMicStateAudioWaveIcon(PAGView pAGView) {
        C87412m.m108594g(pAGView, "<set-?>");
        this.f176332r = pAGView;
    }

    public final void setFinderLiveMicUserLevel(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f176329A = textView;
    }

    public final void setRoot(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f176335u = viewGroup;
    }

    /* renamed from: t */
    public abstract void mo86956t();
}
