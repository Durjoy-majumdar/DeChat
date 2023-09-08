package si1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderFixedTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl1.C58321a;
import gy3.C87412m;
import nh1.C61735d;
import nh1.C61736e;
import nh1.C61737f;
import nh1.C61747q;
import ni1.C61753b;
import oi1.C62030b;
import org.libpag.PAGView;
import p192l4.C10462b;
import qj1.C62660c;

/* renamed from: si1.b */
public class C63896b extends C62030b {

    /* renamed from: C */
    public ViewGroup f181122C;

    /* renamed from: si1.b$a */
    public /* synthetic */ class C63897a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f181123a;

        static {
            int[] iArr = new int[C58321a.values().length];
            iArr[2] = 1;
            f181123a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63896b(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    private final int getAudioWaveIconSize() {
        return C63897a.f181123a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.awa);
    }

    private final int getAvatarSize() {
        return C63897a.f181123a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3755d6) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3761db);
    }

    private final int getMuteIconCircleSize() {
        return C63897a.f181123a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3725ce);
    }

    private final int getMuteIconSize() {
        return C63897a.f181123a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3738cr);
    }

    private final int getPadding() {
        return getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
    }

    private final float getTextSize() {
        return 14.0f;
    }

    public ViewGroup getLuckyMoneyRootView() {
        Log.m105924i(getTAG(), "getLuckyMoneyRootView");
        if (C63897a.f181123a[getCurWidgetMode().ordinal()] != 1) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        ViewGroup viewGroup = this.f181122C;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveLuckyMoneyBubbleSmallUiRoot");
        throw null;
    }

    public String getTagString() {
        return "FinderLiveMicAudioPreviewWidget";
    }

    /* renamed from: h */
    public void mo88670h() {
        getFinderLiveMicStateAudioName().setTextSize(1, getTextSize());
        ViewGroup.LayoutParams layoutParams = getFinderLiveMicNewNormalMicGiftItemLayout().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = getPadding();
            marginLayoutParams.rightMargin = getPadding();
            marginLayoutParams.bottomMargin = getPadding();
        }
        ViewGroup.LayoutParams layoutParams2 = getFinderLiveMicStateAudioAvatar().getLayoutParams();
        if (layoutParams2 != null) {
            int avatarSize = getAvatarSize();
            layoutParams2.width = avatarSize;
            layoutParams2.height = avatarSize;
        }
        ViewGroup.LayoutParams layoutParams3 = getFinderLiveMicStateAudioWaveIcon().getLayoutParams();
        if (layoutParams3 != null) {
            int audioWaveIconSize = getAudioWaveIconSize();
            layoutParams3.width = audioWaveIconSize;
            layoutParams3.height = audioWaveIconSize;
        }
        ViewGroup.LayoutParams layoutParams4 = getFinderLiveMicMuteIcon().getLayoutParams();
        if (layoutParams4 != null) {
            int muteIconSize = getMuteIconSize();
            layoutParams4.width = muteIconSize;
            layoutParams4.height = muteIconSize;
        }
        ViewGroup.LayoutParams layoutParams5 = getFinderLiveMicMuteIconWe().getLayoutParams();
        if (layoutParams5 != null) {
            int muteIconCircleSize = getMuteIconCircleSize();
            layoutParams5.width = muteIconCircleSize;
            layoutParams5.height = muteIconCircleSize;
        }
    }

    /* renamed from: t */
    public void mo86956t() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.aic, this, false);
        int i = C0966R.C0970id.okq;
        View a = C10462b.m10395a(inflate, C0966R.C0970id.okq);
        if (a != null) {
            C61736e.m72429a(a);
            i = C0966R.C0970id.f358178o71;
            View a2 = C10462b.m10395a(inflate, C0966R.C0970id.f358178o71);
            if (a2 != null) {
                C61737f.m72430a(a2);
                i = C0966R.C0970id.f358179dr3;
                View a3 = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
                if (a3 != null) {
                    C61735d a4 = C61735d.m72428a(a3);
                    TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1);
                    if (textView != null) {
                        FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o79);
                        if (frameLayout != null) {
                            WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.o7_);
                            if (weImageView != null) {
                                View a5 = C10462b.m10395a(inflate, C0966R.C0970id.o7a);
                                if (a5 != null) {
                                    C61747q a6 = C61747q.m72432a(a5);
                                    ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.dsr);
                                    if (imageView != null) {
                                        ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.dss);
                                        if (imageView2 != null) {
                                            FinderFixedTextView finderFixedTextView = (FinderFixedTextView) C10462b.m10395a(inflate, C0966R.C0970id.dsy);
                                            if (finderFixedTextView != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                PAGView pAGView = (PAGView) C10462b.m10395a(inflate, C0966R.C0970id.f358191dt1);
                                                if (pAGView != null) {
                                                    TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358192dt2);
                                                    if (textView2 != null) {
                                                        setFinderLiveMicStateAudioWaveIcon(pAGView);
                                                        setFinderLiveMicMuteIcon(frameLayout);
                                                        setFinderLiveMicMuteIconWe(weImageView);
                                                        C87412m.m108593f(constraintLayout, "viewBinding.root");
                                                        setRoot(constraintLayout);
                                                        ConstraintLayout constraintLayout2 = a6.f175521a;
                                                        C87412m.m108593f(constraintLayout2, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                                        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
                                                        setFinderLiveMicStateAudioAvatar(imageView);
                                                        setFinderLiveMicStateAudioName(finderFixedTextView);
                                                        setFinderLiveMicStateAudioBg(imageView2);
                                                        setFinderLiveMicHeartText(textView);
                                                        setFinderLiveMicUserLevel(textView2);
                                                        RelativeLayout relativeLayout = a4.f175449a;
                                                        C87412m.m108593f(relativeLayout, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                                        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout);
                                                        RelativeLayout relativeLayout2 = a4.f175449a;
                                                        C87412m.m108593f(relativeLayout2, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                                        this.f181122C = relativeLayout2;
                                                        return;
                                                    }
                                                    i = C0966R.C0970id.f358192dt2;
                                                } else {
                                                    i = C0966R.C0970id.f358191dt1;
                                                }
                                            } else {
                                                i = C0966R.C0970id.dsy;
                                            }
                                        } else {
                                            i = C0966R.C0970id.dss;
                                        }
                                    } else {
                                        i = C0966R.C0970id.dsr;
                                    }
                                } else {
                                    i = C0966R.C0970id.o7a;
                                }
                            } else {
                                i = C0966R.C0970id.o7_;
                            }
                        } else {
                            i = C0966R.C0970id.o79;
                        }
                    } else {
                        i = C0966R.C0970id.f358189ol1;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
