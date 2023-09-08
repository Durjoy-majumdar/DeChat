package ri1;

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
import gi1.C59463a;
import gi1.C59465f;
import gy3.C87412m;
import nh1.C61733b;
import nh1.C61735d;
import nh1.C61736e;
import nh1.C61747q;
import ni1.C61753b;
import oi1.C62031c;
import p192l4.C10462b;
import qj1.C62660c;

/* renamed from: ri1.c */
public final class C63439c extends C62031c {

    /* renamed from: A */
    public ViewGroup f179935A;

    /* renamed from: z */
    public ViewGroup f179936z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63439c(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    public ViewGroup getGiftRootView() {
        C59465f fVar;
        C59463a bindMicData = getBindMicData();
        boolean z = true;
        if (bindMicData == null || (fVar = bindMicData.f169895b) == null || fVar.f169901e != 1) {
            z = false;
        }
        if (!z) {
            return getFinderLiveMicNewNormalMicGiftItemLayout();
        }
        ViewGroup viewGroup = this.f179935A;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveMicFocusNewNormalMicGiftItemLayout");
        throw null;
    }

    public ViewGroup getLuckyMoneyRootView() {
        C59465f fVar;
        C59463a bindMicData = getBindMicData();
        boolean z = true;
        if (bindMicData == null || (fVar = bindMicData.f169895b) == null || fVar.f169901e != 1) {
            z = false;
        }
        if (!z) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        ViewGroup viewGroup = this.f179936z;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public String getTagString() {
        return "FinderLiveMicGrabCoverVideoWidget";
    }

    /* renamed from: t */
    public void mo86977t() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f7176lc, this, false);
        int i = C0966R.C0970id.brz;
        if (((ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.brz)) != null) {
            i = C0966R.C0970id.okm;
            View a = C10462b.m10395a(inflate, C0966R.C0970id.okm);
            if (a != null) {
                C61735d a2 = C61735d.m72428a(a);
                View a3 = C10462b.m10395a(inflate, C0966R.C0970id.okn);
                if (a3 != null) {
                    C61733b a4 = C61733b.m72426a(a3);
                    View a5 = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
                    if (a5 != null) {
                        C61736e a6 = C61736e.m72429a(a5);
                        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1);
                        if (textView != null) {
                            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o79);
                            if (frameLayout != null) {
                                WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.o7_);
                                if (weImageView != null) {
                                    View a7 = C10462b.m10395a(inflate, C0966R.C0970id.o7a);
                                    if (a7 != null) {
                                        C61747q a8 = C61747q.m72432a(a7);
                                        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.e0q);
                                        if (imageView != null) {
                                            FinderFixedTextView finderFixedTextView = (FinderFixedTextView) C10462b.m10395a(inflate, C0966R.C0970id.e0u);
                                            if (finderFixedTextView != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.e0x);
                                                if (textView2 == null) {
                                                    i = C0966R.C0970id.e0x;
                                                } else if (((FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.itr)) != null) {
                                                    setFinderLiveMicMuteIcon(frameLayout);
                                                    setFinderLiveMicMuteIconWe(weImageView);
                                                    C87412m.m108593f(relativeLayout, "viewBinding.root");
                                                    setRoot(relativeLayout);
                                                    ConstraintLayout constraintLayout = a8.f175521a;
                                                    C87412m.m108593f(constraintLayout, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                                    setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                                    setFinderLiveVideoLinkBottomBarAvatar(imageView);
                                                    setFinderLiveVideoLinkBottomBarName(finderFixedTextView);
                                                    setFinderLiveMicHeartText(textView);
                                                    setFinderLiveVideoLinkBottomBarUserLevel(textView2);
                                                    RelativeLayout relativeLayout2 = a6.f175450a;
                                                    C87412m.m108593f(relativeLayout2, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                                    setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                                    RelativeLayout relativeLayout3 = a2.f175449a;
                                                    C87412m.m108593f(relativeLayout3, "viewBinding.finderLiveFo…ckyMoneyBubbleUiRoot.root");
                                                    this.f179936z = relativeLayout3;
                                                    RelativeLayout relativeLayout4 = a4.f175445a;
                                                    C87412m.m108593f(relativeLayout4, "viewBinding.finderLiveFo…malMicGiftItemLayout.root");
                                                    this.f179935A = relativeLayout4;
                                                    return;
                                                } else {
                                                    i = C0966R.C0970id.itr;
                                                }
                                            } else {
                                                i = C0966R.C0970id.e0u;
                                            }
                                        } else {
                                            i = C0966R.C0970id.e0q;
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
                    } else {
                        i = C0966R.C0970id.f358179dr3;
                    }
                } else {
                    i = C0966R.C0970id.okn;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
