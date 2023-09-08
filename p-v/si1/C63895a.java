package si1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import gy3.C87412m;
import nh1.C61734c;
import nh1.C61737f;
import nh1.C61747q;
import nh1.C61750t;
import ni1.C61753b;
import oi1.C62028a;
import p192l4.C10462b;
import qj1.C62660c;

/* renamed from: si1.a */
public final class C63895a extends C62028a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63895a(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    public String getTagString() {
        return "FinderLiveMicCoverAnchorWidget";
    }

    /* renamed from: t */
    public void mo86921t() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d84, this, false);
        int i = C0966R.C0970id.dqp;
        View a = C10462b.m10395a(inflate, C0966R.C0970id.dqp);
        if (a != null) {
            C61734c a2 = C61734c.m72427a(a);
            View a3 = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
            if (a3 != null) {
                C61737f a4 = C61737f.m72430a(a3);
                FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o77);
                if (frameLayout == null) {
                    i = C0966R.C0970id.o77;
                } else if (((TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1)) != null) {
                    View a5 = C10462b.m10395a(inflate, C0966R.C0970id.o7a);
                    if (a5 != null) {
                        C61747q a6 = C61747q.m72432a(a5);
                        RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) inflate;
                        if (((ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.nex)) != null) {
                            View a7 = C10462b.m10395a(inflate, C0966R.C0970id.nez);
                            if (a7 != null) {
                                C61750t a8 = C61750t.m72433a(a7);
                                C87412m.m108593f(roundCornerConstraintLayout, "viewBinding.root");
                                setRoot(roundCornerConstraintLayout);
                                setFinderLiveMicAnchorAudioLayout(frameLayout);
                                RelativeLayout relativeLayout = a8.f175537a;
                                C87412m.m108593f(relativeLayout, "viewBinding.finderLiveVoteBubbleRoot.root");
                                setFinderLiveVoteBubbleRoot(relativeLayout);
                                RelativeLayout relativeLayout2 = a4.f175451a;
                                C87412m.m108593f(relativeLayout2, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                ConstraintLayout constraintLayout = a6.f175521a;
                                C87412m.m108593f(constraintLayout, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                RelativeLayout relativeLayout3 = a2.f175448a;
                                C87412m.m108593f(relativeLayout3, "viewBinding.finderLiveLotteryBubbleRoot.root");
                                setFinderLiveLotteryBubbleRoot(relativeLayout3);
                                return;
                            }
                            i = C0966R.C0970id.nez;
                        } else {
                            i = C0966R.C0970id.nex;
                        }
                    } else {
                        i = C0966R.C0970id.o7a;
                    }
                } else {
                    i = C0966R.C0970id.f358189ol1;
                }
            } else {
                i = C0966R.C0970id.f358179dr3;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
