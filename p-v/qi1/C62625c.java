package qi1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderFixedTextView;
import gy3.C87412m;
import nh1.C61737f;
import nh1.C61747q;
import ni1.C61753b;
import oi1.C62031c;
import p192l4.C10462b;
import qj1.C62660c;

/* renamed from: qi1.c */
public final class C62625c extends C62031c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62625c(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    public String getTagString() {
        return "FinderLiveMicGrabCoverVideoWidget";
    }

    /* renamed from: t */
    public void mo86977t() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f7178m7, this, false);
        int i = C0966R.C0970id.brz;
        if (((ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.brz)) != null) {
            i = C0966R.C0970id.f358179dr3;
            View a = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
            if (a != null) {
                C61737f a2 = C61737f.m72430a(a);
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1);
                if (textView != null) {
                    FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o79);
                    if (frameLayout != null) {
                        WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.o7_);
                        if (weImageView != null) {
                            View a3 = C10462b.m10395a(inflate, C0966R.C0970id.o7a);
                            if (a3 != null) {
                                C61747q a4 = C61747q.m72432a(a3);
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
                                            ConstraintLayout constraintLayout = a4.f175521a;
                                            C87412m.m108593f(constraintLayout, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                            setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                            setFinderLiveVideoLinkBottomBarAvatar(imageView);
                                            setFinderLiveVideoLinkBottomBarName(finderFixedTextView);
                                            setFinderLiveMicHeartText(textView);
                                            setFinderLiveVideoLinkBottomBarUserLevel(textView2);
                                            RelativeLayout relativeLayout2 = a2.f175451a;
                                            C87412m.m108593f(relativeLayout2, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                            setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
