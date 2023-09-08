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
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nh1.C61733b;
import nh1.C61735d;
import nh1.C61736e;
import nh1.C61747q;
import ni1.C61753b;
import oi1.C62030b;
import org.libpag.PAGView;
import p192l4.C10462b;
import qj1.C62660c;

/* renamed from: ri1.b */
public final class C63438b extends C62030b {

    /* renamed from: C */
    public PAGView f179927C;

    /* renamed from: D */
    public FrameLayout f179928D;

    /* renamed from: E */
    public ViewGroup f179929E;

    /* renamed from: F */
    public ViewGroup f179930F;

    /* renamed from: G */
    public ImageView f179931G;

    /* renamed from: H */
    public TextView f179932H;

    /* renamed from: I */
    public TextView f179933I;

    /* renamed from: J */
    public ViewGroup f179934J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63438b(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    public ImageView getAvatarView() {
        if (!mo88308v()) {
            return getFinderLiveMicStateAudioAvatar();
        }
        ImageView imageView = this.f179931G;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("finderLiveMicFocusStateAudioAvatar");
        throw null;
    }

    public ViewGroup getLuckyMoneyRootView() {
        Log.m105924i(getTAG(), "getLuckyMoneyRootView");
        if (!mo88308v()) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        ViewGroup viewGroup = this.f179934J;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    public PAGView getMicAudioWaveIcon() {
        if (!mo88308v()) {
            return super.getMicAudioWaveIcon();
        }
        PAGView pAGView = this.f179927C;
        if (pAGView != null) {
            return pAGView;
        }
        C87412m.m108603p("finderLiveMicFocusStateAudioWaveIcon");
        throw null;
    }

    public FrameLayout getMicMuteIcon() {
        if (!mo88308v()) {
            return super.getMicMuteIcon();
        }
        FrameLayout frameLayout = this.f179928D;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("finderLiveMicFocusMuteIcon");
        throw null;
    }

    public TextView getMicUserLevelTextView() {
        if (!mo88308v()) {
            return getFinderLiveMicUserLevel();
        }
        TextView textView = this.f179933I;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveMicFocusUserLevel");
        throw null;
    }

    public TextView getNickTextView() {
        if (!mo88308v()) {
            return getFinderLiveMicStateAudioName();
        }
        TextView textView = this.f179932H;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("finderLiveMicFocusStateAudioName");
        throw null;
    }

    public String getTagString() {
        return "FinderLiveMicGrabCoverAudioWidget";
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/widget/grabfocus/FinderLiveMicGrabFocusCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        FrameLayout frameLayout = this.f179928D;
        if (frameLayout != null) {
            int id = frameLayout.getId();
            if (valueOf != null && valueOf.intValue() == id) {
                mo88681o();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/widget/grabfocus/FinderLiveMicGrabFocusCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("finderLiveMicFocusMuteIcon");
        throw null;
    }

    /* renamed from: q */
    public void mo86914q() {
        super.mo86914q();
        if (mo88308v()) {
            ViewGroup viewGroup = this.f179930F;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                ViewGroup viewGroup2 = this.f179929E;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                } else {
                    C87412m.m108603p("finderLiveMicFocusLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("finderLiveMicSmallLayout");
                throw null;
            }
        } else {
            ViewGroup viewGroup3 = this.f179930F;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
                ViewGroup viewGroup4 = this.f179929E;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                } else {
                    C87412m.m108603p("finderLiveMicFocusLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("finderLiveMicSmallLayout");
                throw null;
            }
        }
    }

    /* renamed from: t */
    public void mo86956t() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f7169hy, this, false);
        int i = C0966R.C0970id.ayd;
        ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.ayd);
        if (constraintLayout != null) {
            i = C0966R.C0970id.beg;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.beg);
            if (constraintLayout2 != null) {
                i = C0966R.C0970id.okm;
                View a = C10462b.m10395a(inflate, C0966R.C0970id.okm);
                if (a != null) {
                    C61735d a2 = C61735d.m72428a(a);
                    View a3 = C10462b.m10395a(inflate, C0966R.C0970id.f358179dr3);
                    if (a3 != null) {
                        C61736e a4 = C61736e.m72429a(a3);
                        FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o78);
                        if (frameLayout == null) {
                            i = C0966R.C0970id.o78;
                        } else if (((WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.okt)) != null) {
                            View a5 = C10462b.m10395a(inflate, C0966R.C0970id.oku);
                            if (a5 != null) {
                                C61733b a6 = C61733b.m72426a(a5);
                                ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.okw);
                                if (imageView == null) {
                                    i = C0966R.C0970id.okw;
                                } else if (((ImageView) C10462b.m10395a(inflate, C0966R.C0970id.okx)) != null) {
                                    FinderFixedTextView finderFixedTextView = (FinderFixedTextView) C10462b.m10395a(inflate, C0966R.C0970id.oky);
                                    if (finderFixedTextView != null) {
                                        PAGView pAGView = (PAGView) C10462b.m10395a(inflate, C0966R.C0970id.okz);
                                        if (pAGView != null) {
                                            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358188ol0);
                                            if (textView != null) {
                                                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358189ol1);
                                                if (textView2 != null) {
                                                    FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.o79);
                                                    if (frameLayout2 != null) {
                                                        WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.o7_);
                                                        if (weImageView != null) {
                                                            View a7 = C10462b.m10395a(inflate, C0966R.C0970id.o7a);
                                                            if (a7 != null) {
                                                                C61747q a8 = C61747q.m72432a(a7);
                                                                ConstraintLayout constraintLayout3 = constraintLayout;
                                                                ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.dsr);
                                                                if (imageView2 != null) {
                                                                    C61735d dVar = a2;
                                                                    ImageView imageView3 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.dss);
                                                                    if (imageView3 != null) {
                                                                        TextView textView3 = textView;
                                                                        FinderFixedTextView finderFixedTextView2 = (FinderFixedTextView) C10462b.m10395a(inflate, C0966R.C0970id.dsy);
                                                                        if (finderFixedTextView2 != null) {
                                                                            FinderFixedTextView finderFixedTextView3 = finderFixedTextView;
                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) inflate;
                                                                            ImageView imageView4 = imageView;
                                                                            PAGView pAGView2 = (PAGView) C10462b.m10395a(inflate, C0966R.C0970id.f358191dt1);
                                                                            if (pAGView2 != null) {
                                                                                C61733b bVar = a6;
                                                                                TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f358192dt2);
                                                                                if (textView4 != null) {
                                                                                    setFinderLiveMicStateAudioWaveIcon(pAGView2);
                                                                                    setFinderLiveMicMuteIcon(frameLayout2);
                                                                                    setFinderLiveMicMuteIconWe(weImageView);
                                                                                    C87412m.m108593f(constraintLayout4, "viewBinding.root");
                                                                                    setRoot(constraintLayout4);
                                                                                    ConstraintLayout constraintLayout5 = a8.f175521a;
                                                                                    C87412m.m108593f(constraintLayout5, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                                                                    setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout5);
                                                                                    setFinderLiveMicStateAudioAvatar(imageView2);
                                                                                    setFinderLiveMicStateAudioName(finderFixedTextView2);
                                                                                    setFinderLiveMicStateAudioBg(imageView3);
                                                                                    setFinderLiveMicHeartText(textView2);
                                                                                    setFinderLiveMicUserLevel(textView4);
                                                                                    RelativeLayout relativeLayout = a4.f175450a;
                                                                                    C87412m.m108593f(relativeLayout, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                                                                    setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout);
                                                                                    this.f179930F = constraintLayout2;
                                                                                    this.f179927C = pAGView;
                                                                                    this.f179928D = frameLayout;
                                                                                    FrameLayout frameLayout3 = this.f179928D;
                                                                                    if (frameLayout3 != null) {
                                                                                        frameLayout3.setOnClickListener(this);
                                                                                        C87412m.m108593f(constraintLayout4, "viewBinding.root");
                                                                                        setRoot(constraintLayout4);
                                                                                        C87412m.m108593f(bVar.f175445a, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                                                                        this.f179931G = imageView4;
                                                                                        this.f179932H = finderFixedTextView3;
                                                                                        this.f179933I = textView3;
                                                                                        RelativeLayout relativeLayout2 = dVar.f175449a;
                                                                                        C87412m.m108593f(relativeLayout2, "viewBinding.finderLiveFo…ckyMoneyBubbleUiRoot.root");
                                                                                        this.f179934J = relativeLayout2;
                                                                                        this.f179929E = constraintLayout3;
                                                                                        return;
                                                                                    }
                                                                                    C87412m.m108603p("finderLiveMicFocusMuteIcon");
                                                                                    throw null;
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
                                            } else {
                                                i = C0966R.C0970id.f358188ol0;
                                            }
                                        } else {
                                            i = C0966R.C0970id.okz;
                                        }
                                    } else {
                                        i = C0966R.C0970id.oky;
                                    }
                                } else {
                                    i = C0966R.C0970id.okx;
                                }
                            } else {
                                i = C0966R.C0970id.oku;
                            }
                        } else {
                            i = C0966R.C0970id.okt;
                        }
                    } else {
                        i = C0966R.C0970id.f358179dr3;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f169895b;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88308v() {
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
        throw new UnsupportedOperationException("Method not decompiled: ri1.C63438b.mo88308v():boolean");
    }
}
