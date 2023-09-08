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
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nh1.C61733b;
import nh1.C61735d;
import nh1.C61736e;
import nh1.C61747q;
import ni1.C61753b;
import oi1.C62028a;
import p192l4.C10462b;
import qj1.C62660c;

/* renamed from: ri1.a */
public final class C63437a extends C62028a {

    /* renamed from: A */
    public ViewGroup f179920A;

    /* renamed from: B */
    public ViewGroup f179921B;

    /* renamed from: C */
    public ViewGroup f179922C;

    /* renamed from: D */
    public ViewGroup f179923D;

    /* renamed from: x */
    public ViewGroup f179924x;

    /* renamed from: y */
    public ViewGroup f179925y;

    /* renamed from: z */
    public ViewGroup f179926z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63437a(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftAnimationStart");
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
    }

    public ViewGroup getAnchorAudioModeLayout() {
        if (!mo88307v()) {
            return getFinderLiveMicAnchorAudioLayout();
        }
        ViewGroup viewGroup = this.f179921B;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveMicFocusAnchorAudioLayout");
        throw null;
    }

    public ViewGroup getGiftRootView() {
        if (!mo88307v()) {
            return getFinderLiveMicNewNormalMicGiftItemLayout();
        }
        ViewGroup viewGroup = this.f179925y;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveFocusMicGiftItemLayout");
        throw null;
    }

    public ViewGroup getLotteryBubbleRootView() {
        if (!mo88307v()) {
            return getFinderLiveLotteryBubbleRoot();
        }
        ViewGroup viewGroup = this.f179924x;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveFocusLotteryBubbleRoot");
        throw null;
    }

    public ViewGroup getLuckyMoneyRootView() {
        if (!mo88307v()) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        ViewGroup viewGroup = this.f179926z;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public String getTagString() {
        return "FinderLiveMicGrabFocusCoverAnchorWidget";
    }

    public ViewGroup getVoteBubbleRootView() {
        if (!mo88307v()) {
            return getFinderLiveVoteBubbleRoot();
        }
        ViewGroup viewGroup = this.f179920A;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveFocusVoteBubbleRoot");
        throw null;
    }

    /* renamed from: q */
    public void mo86914q() {
        if (mo88307v()) {
            ViewGroup viewGroup = this.f179922C;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                ViewGroup viewGroup2 = this.f179923D;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                } else {
                    C87412m.m108603p("focusLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("smallLayout");
                throw null;
            }
        } else {
            ViewGroup viewGroup3 = this.f179922C;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
                ViewGroup viewGroup4 = this.f179923D;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                } else {
                    C87412m.m108603p("focusLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("smallLayout");
                throw null;
            }
        }
    }

    /* renamed from: t */
    public void mo86921t() {
        int i;
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f7175lb, this, false);
        int i2 = C0966R.C0970id.okl;
        View a = C10462b.m10395a(inflate, C0966R.C0970id.okl);
        if (a != null) {
            int i3 = C0966R.C0970id.f5845q7;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(a, C0966R.C0970id.f5845q7);
            int i4 = C0966R.C0970id.f357800bu0;
            if (frameLayout != null) {
                if (((ImageView) C10462b.m10395a(a, C0966R.C0970id.a8r)) == null) {
                    i3 = C0966R.C0970id.a8r;
                } else if (((TextView) C10462b.m10395a(a, C0966R.C0970id.f357800bu0)) == null) {
                    i3 = C0966R.C0970id.f357800bu0;
                } else if (((FrameLayout) C10462b.m10395a(a, C0966R.C0970id.dqo)) != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) a;
                    View a2 = C10462b.m10395a(inflate, C0966R.C0970id.okm);
                    if (a2 != null) {
                        C61735d a3 = C61735d.m72428a(a2);
                        View a4 = C10462b.m10395a(inflate, C0966R.C0970id.oko);
                        if (a4 != null) {
                            if (((ImageView) C10462b.m10395a(a4, C0966R.C0970id.a8r)) == null) {
                                i = C0966R.C0970id.a8r;
                            } else if (((TextView) C10462b.m10395a(a4, C0966R.C0970id.f357800bu0)) == null) {
                                i = C0966R.C0970id.f357800bu0;
                            } else if (((FrameLayout) C10462b.m10395a(a4, C0966R.C0970id.ney)) != null) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) a4;
                                if (((ImageView) C10462b.m10395a(a4, C0966R.C0970id.ngx)) != null) {
                                    View a5 = C10462b.m10395a(inflate, C0966R.C0970id.dqp);
                                    if (a5 != null) {
                                        if (((FrameLayout) C10462b.m10395a(a5, C0966R.C0970id.f5845q7)) != null) {
                                            if (((TextView) C10462b.m10395a(a5, C0966R.C0970id.f357800bu0)) == null) {
                                                i3 = C0966R.C0970id.f357800bu0;
                                            } else if (((FrameLayout) C10462b.m10395a(a5, C0966R.C0970id.dqo)) != null) {
                                                RelativeLayout relativeLayout3 = (RelativeLayout) a5;
                                                View a6 = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
                                                if (a6 != null) {
                                                    C61736e a7 = C61736e.m72429a(a6);
                                                    FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o77);
                                                    if (frameLayout2 != null) {
                                                        FrameLayout frameLayout3 = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.okr);
                                                        if (frameLayout3 != null) {
                                                            View a8 = C10462b.m10395a(inflate, C0966R.C0970id.oks);
                                                            if (a8 != null) {
                                                                C61733b a9 = C61733b.m72426a(a8);
                                                                if (((TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1)) != null) {
                                                                    View a15 = C10462b.m10395a(inflate, C0966R.C0970id.o7a);
                                                                    if (a15 != null) {
                                                                        C61747q a16 = C61747q.m72432a(a15);
                                                                        RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) inflate;
                                                                        if (((ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.nex)) != null) {
                                                                            View a17 = C10462b.m10395a(inflate, C0966R.C0970id.nez);
                                                                            if (a17 != null) {
                                                                                if (((TextView) C10462b.m10395a(a17, C0966R.C0970id.f357800bu0)) != null) {
                                                                                    if (((FrameLayout) C10462b.m10395a(a17, C0966R.C0970id.ney)) != null) {
                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) a17;
                                                                                        i4 = C0966R.C0970id.ngx;
                                                                                        if (((ImageView) C10462b.m10395a(a17, C0966R.C0970id.ngx)) != null) {
                                                                                            RoundCornerConstraintLayout roundCornerConstraintLayout2 = (RoundCornerConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.n_0);
                                                                                            if (roundCornerConstraintLayout2 != null) {
                                                                                                RoundCornerConstraintLayout roundCornerConstraintLayout3 = (RoundCornerConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.ncb);
                                                                                                if (roundCornerConstraintLayout3 != null) {
                                                                                                    C87412m.m108593f(roundCornerConstraintLayout, "viewBinding.root");
                                                                                                    setRoot(roundCornerConstraintLayout);
                                                                                                    setFinderLiveMicAnchorAudioLayout(frameLayout2);
                                                                                                    setFinderLiveVoteBubbleRoot(relativeLayout4);
                                                                                                    RelativeLayout relativeLayout5 = a7.f175450a;
                                                                                                    C87412m.m108593f(relativeLayout5, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                                                                                    setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout5);
                                                                                                    ConstraintLayout constraintLayout = a16.f175521a;
                                                                                                    C87412m.m108593f(constraintLayout, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                                                                                    setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                                                                                    setFinderLiveLotteryBubbleRoot(relativeLayout3);
                                                                                                    this.f179922C = roundCornerConstraintLayout3;
                                                                                                    this.f179921B = frameLayout3;
                                                                                                    this.f179920A = relativeLayout2;
                                                                                                    RelativeLayout relativeLayout6 = a3.f175449a;
                                                                                                    C87412m.m108593f(relativeLayout6, "viewBinding.finderLiveFo…ckyMoneyBubbleUiRoot.root");
                                                                                                    this.f179926z = relativeLayout6;
                                                                                                    this.f179924x = relativeLayout;
                                                                                                    RelativeLayout relativeLayout7 = a9.f175445a;
                                                                                                    C87412m.m108593f(relativeLayout7, "viewBinding.finderLiveMicFocusGiftItemLayout.root");
                                                                                                    this.f179925y = relativeLayout7;
                                                                                                    this.f179923D = roundCornerConstraintLayout2;
                                                                                                    return;
                                                                                                }
                                                                                                i2 = C0966R.C0970id.ncb;
                                                                                            } else {
                                                                                                i2 = C0966R.C0970id.n_0;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i4 = C0966R.C0970id.ney;
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("Missing required view with ID: ".concat(a17.getResources().getResourceName(i4)));
                                                                            }
                                                                            i2 = C0966R.C0970id.nez;
                                                                        } else {
                                                                            i2 = C0966R.C0970id.nex;
                                                                        }
                                                                    } else {
                                                                        i2 = C0966R.C0970id.o7a;
                                                                    }
                                                                } else {
                                                                    i2 = C0966R.C0970id.f358189ol1;
                                                                }
                                                            } else {
                                                                i2 = C0966R.C0970id.oks;
                                                            }
                                                        } else {
                                                            i2 = C0966R.C0970id.okr;
                                                        }
                                                    } else {
                                                        i2 = C0966R.C0970id.o77;
                                                    }
                                                } else {
                                                    i2 = C0966R.C0970id.f358179dr3;
                                                }
                                            } else {
                                                i3 = C0966R.C0970id.dqo;
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(a5.getResources().getResourceName(i3)));
                                    }
                                    i2 = C0966R.C0970id.dqp;
                                } else {
                                    i = C0966R.C0970id.ngx;
                                }
                            } else {
                                i = C0966R.C0970id.ney;
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(a4.getResources().getResourceName(i)));
                        }
                        i2 = C0966R.C0970id.oko;
                    } else {
                        i2 = C0966R.C0970id.okm;
                    }
                } else {
                    i3 = C0966R.C0970id.dqo;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(a.getResources().getResourceName(i3)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f169895b;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88307v() {
        /*
            r3 = this;
            gi1.a r0 = r3.getBindMicData()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            gi1.f r0 = r0.f169895b
            if (r0 == 0) goto L_0x0011
            int r0 = r0.f169901e
            if (r0 != r1) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ri1.C63437a.mo88307v():boolean");
    }
}
