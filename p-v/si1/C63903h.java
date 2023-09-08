package si1;

import al1.C54130j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderFixedTextView;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl1.C58321a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60171g1;
import ht1.C60200t1;
import k60.C60979d;
import m03.C61425b;
import nh1.C61735d;
import nh1.C61737f;
import nh1.C61747q;
import ni1.C61753b;
import o40.C61926c;
import o40.C61937h;
import oi1.C62031c;
import ok1.C62042e;
import p192l4.C10462b;
import p823sg.C90193h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import pl1.C62367r0;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C64274c60;
import te3.C64689rq2;
import te3.C64756up2;
import up1.C27696y;
import z04.C112551y;

/* renamed from: si1.h */
public final class C63903h extends C62031c {

    /* renamed from: A */
    public ViewGroup f181134A;

    /* renamed from: B */
    public ImageView f181135B;

    /* renamed from: C */
    public FrameLayout f181136C;

    /* renamed from: z */
    public FinderLiveThumbPlayerProxy f181137z;

    /* renamed from: si1.h$a */
    public /* synthetic */ class C63904a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f181138a;

        static {
            int[] iArr = new int[C58321a.values().length];
            iArr[2] = 1;
            f181138a = iArr;
        }
    }

    /* renamed from: si1.h$b */
    public static final class C63905b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54130j f181139d;

        /* renamed from: e */
        public final /* synthetic */ C63903h f181140e;

        public C63905b(C54130j jVar, C63903h hVar) {
            this.f181139d = jVar;
            this.f181140e = hVar;
        }

        public final void run() {
            Object obj;
            String str;
            C11978e0.C11979a aVar = C11978e0.C11979a.PROFILE_COVER;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C64756up2 up22 = this.f181139d.f152017u;
            if (up22 != null) {
                C62042e eVar = C62042e.f176370a;
                if (!eVar.mo87097m1(up22)) {
                    up22 = null;
                }
                if (up22 != null) {
                    C63903h hVar = this.f181140e;
                    ImageView imageView = hVar.f181135B;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        String C0 = eVar.mo86995C0(up22);
                        if (!(C0.length() > 0)) {
                            C0 = null;
                        }
                        if (C0 != null) {
                            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                            C11991t tVar = new C11991t(C0);
                            ImageView imageView2 = hVar.f181135B;
                            if (imageView2 != null) {
                                f2.mo85957c(tVar, imageView2, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                            } else {
                                C87412m.m108603p("finderLiveVideoLinkCoverBg");
                                throw null;
                            }
                        }
                        int i = up22.f185784f;
                        if (i == 0) {
                            hVar.mo88688w();
                            FrameLayout frameLayout = hVar.f181136C;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                                obj = C13598b0.f38549a;
                            } else {
                                C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
                                throw null;
                            }
                        } else if (i != 1) {
                            obj = C13598b0.f38549a;
                        } else {
                            hVar.mo88688w();
                            FrameLayout frameLayout2 = hVar.f181136C;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(0);
                                FrameLayout frameLayout3 = hVar.f181136C;
                                if (frameLayout3 != null) {
                                    frameLayout3.removeAllViews();
                                    Context context = hVar.getContext();
                                    C87412m.m108593f(context, "context");
                                    FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = new FinderLiveThumbPlayerProxy(context);
                                    finderLiveThumbPlayerProxy.setFullScreenEnjoy(true);
                                    finderLiveThumbPlayerProxy.setLoop(true);
                                    finderLiveThumbPlayerProxy.setMute(true);
                                    C64689rq2 rq22 = new C64689rq2();
                                    C64274c60 c602 = up22.f185783e;
                                    String str2 = c602 != null ? c602.f182415d : null;
                                    rq22.f185266d = str2;
                                    rq22.f185267e = c602 != null ? c602.f182416e : null;
                                    rq22.f185275p = C90193h.m112876d(str2);
                                    C62367r0 r0Var = new C62367r0(rq22, C27696y.V0_VIDEO, "xV0", 0, 0, (String) null, 56, (C8480h) null);
                                    C64274c60 c603 = up22.f185783e;
                                    finderLiveThumbPlayerProxy.mo78639o(r0Var, (c603 == null || (str = c603.f182415d) == null || C112551y.m153819s(str, "http", false)) ? false : true, new FeedData());
                                    hVar.f181137z = finderLiveThumbPlayerProxy;
                                    int width = hVar.getRoot().getWidth();
                                    int height = hVar.getRoot().getHeight();
                                    Log.m105924i(finderLiveThumbPlayerProxy.getFTPPTag(), "resizeTextureViewAndVideo width:" + width + ",height:" + height);
                                    C61425b bVar = finderLiveThumbPlayerProxy.f160765h;
                                    if (bVar != null) {
                                        ViewGroup.LayoutParams layoutParams = ((View) bVar).getLayoutParams();
                                        if (layoutParams != null) {
                                            layoutParams.width = width;
                                            layoutParams.height = height;
                                            C61425b bVar2 = finderLiveThumbPlayerProxy.f160765h;
                                            if (bVar2 != null) {
                                                bVar2.mo81140b(width, height);
                                                C61425b bVar3 = finderLiveThumbPlayerProxy.f160765h;
                                                if (bVar3 != null) {
                                                    ((View) bVar3).requestLayout();
                                                } else {
                                                    C87412m.m108603p("textureView");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("textureView");
                                                throw null;
                                            }
                                        }
                                        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = hVar.f181137z;
                                        if (finderLiveThumbPlayerProxy2 != null) {
                                            finderLiveThumbPlayerProxy2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                                        }
                                        FrameLayout frameLayout4 = hVar.f181136C;
                                        if (frameLayout4 != null) {
                                            frameLayout4.addView(hVar.f181137z);
                                            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = hVar.f181137z;
                                            if (finderLiveThumbPlayerProxy3 != null) {
                                                finderLiveThumbPlayerProxy3.setVideoViewFocused(true);
                                            }
                                            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy4 = hVar.f181137z;
                                            obj = finderLiveThumbPlayerProxy4 != null ? Boolean.valueOf(C60171g1.C8767a.m8577a(finderLiveThumbPlayerProxy4, (Integer) null, 1, (Object) null)) : null;
                                        } else {
                                            C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("textureView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
                                throw null;
                            }
                        }
                        if (obj != null) {
                            return;
                        }
                    } else {
                        C87412m.m108603p("finderLiveVideoLinkCoverBg");
                        throw null;
                    }
                }
            }
            C63903h hVar2 = this.f181140e;
            C54130j jVar = this.f181139d;
            ImageView imageView3 = hVar2.f181135B;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                FrameLayout frameLayout5 = hVar2.f181136C;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(8);
                    String str3 = jVar.f152011o;
                    if (str3 != null) {
                        if (!(str3.length() > 0)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            C60979d<C100810g0> f25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                            C11991t tVar2 = new C11991t(str3);
                            ImageView imageView4 = hVar2.f181135B;
                            if (imageView4 != null) {
                                f25.mo85957c(tVar2, imageView4, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                                C13598b0 b0Var = C13598b0.f38549a;
                                return;
                            }
                            C87412m.m108603p("finderLiveVideoLinkCoverBg");
                            throw null;
                        }
                        return;
                    }
                    return;
                }
                C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
                throw null;
            }
            C87412m.m108603p("finderLiveVideoLinkCoverBg");
            throw null;
        }
    }

    /* renamed from: si1.h$c */
    public static final class C63906c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63903h f181141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63906c(C63903h hVar) {
            super(0);
            this.f181141d = hVar;
        }

        public Object invoke() {
            String tag = this.f181141d.getTAG();
            Log.m105924i(tag, "showContent bindMicUser:" + this.f181141d.getBindLinkMicUser() + " isAnchor:" + C62042e.f176370a.mo87027N0() + " bindMicUserIsSelf:" + this.f181141d.mo88679k());
            C54130j bindLinkMicUser = this.f181141d.getBindLinkMicUser();
            if (bindLinkMicUser != null) {
                C63903h hVar = this.f181141d;
                if (bindLinkMicUser.f152004h) {
                    hVar.getFinderLiveVideoLinkBottomBarUserLevel().setText("");
                }
                if (bindLinkMicUser.f152004h) {
                    if (bindLinkMicUser.f152012p) {
                        ImageView imageView = hVar.f181135B;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                            hVar.mo88687v(bindLinkMicUser);
                        } else {
                            C87412m.m108603p("finderLiveVideoLinkCoverBg");
                            throw null;
                        }
                    } else {
                        ImageView imageView2 = hVar.f181135B;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        } else {
                            C87412m.m108603p("finderLiveVideoLinkCoverBg");
                            throw null;
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63903h(Context context, C62660c cVar, C61753b bVar) {
        super(context, cVar, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(bVar, "service");
    }

    private final int getAvatarSize() {
        return C63904a.f181138a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
    }

    private final int getMuteIconCircleSize() {
        return C63904a.f181138a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3725ce);
    }

    private final int getMuteIconSize() {
        return C63904a.f181138a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) : getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3738cr);
    }

    /* renamed from: a */
    public void mo86901a() {
        Log.m105924i(getTAG(), "onGiftAnimationStart");
    }

    /* renamed from: b */
    public void mo86902b() {
        Log.m105924i(getTAG(), "onGiftAnimationEnd");
    }

    public ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    public ViewGroup getLuckyMoneyRootView() {
        Log.m105924i(getTAG(), "getLuckyMoneyRootView");
        if (C63904a.f181138a[getCurWidgetMode().ordinal()] != 1) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        ViewGroup viewGroup = this.f181134A;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("finderLiveLuckyMoneyBubbleSmallUiRoot");
        throw null;
    }

    public String getTagString() {
        return "FinderLiveMicCoverVideoWidget";
    }

    /* renamed from: h */
    public void mo88670h() {
        ViewGroup.LayoutParams layoutParams = getFinderLiveVideoLinkBottomBarAvatar().getLayoutParams();
        if (layoutParams != null) {
            int avatarSize = getAvatarSize();
            layoutParams.width = avatarSize;
            layoutParams.height = avatarSize;
        }
        ViewGroup.LayoutParams layoutParams2 = getFinderLiveMicMuteIcon().getLayoutParams();
        if (layoutParams2 != null) {
            int muteIconSize = getMuteIconSize();
            layoutParams2.width = muteIconSize;
            layoutParams2.height = muteIconSize;
        }
        ViewGroup.LayoutParams layoutParams3 = getFinderLiveMicMuteIconWe().getLayoutParams();
        if (layoutParams3 != null) {
            int muteIconCircleSize = getMuteIconCircleSize();
            layoutParams3.width = muteIconCircleSize;
            layoutParams3.height = muteIconCircleSize;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo88688w();
    }

    /* renamed from: q */
    public void mo86914q() {
        super.mo86914q();
        C61926c.m72668M(new C63906c(this));
    }

    /* renamed from: t */
    public void mo86977t() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d85, this, false);
        int i = C0966R.C0970id.brz;
        if (((ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.brz)) != null) {
            i = C0966R.C0970id.f358178o71;
            View a = C10462b.m10395a(inflate, C0966R.C0970id.f358178o71);
            if (a != null) {
                C61737f a2 = C61737f.m72430a(a);
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
                                    ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.e0q);
                                    if (imageView != null) {
                                        FinderFixedTextView finderFixedTextView = (FinderFixedTextView) C10462b.m10395a(inflate, C0966R.C0970id.e0u);
                                        if (finderFixedTextView != null) {
                                            RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                            TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.e0x);
                                            if (textView2 != null) {
                                                ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.e0y);
                                                if (imageView2 != null) {
                                                    FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.n9n);
                                                    if (frameLayout2 == null) {
                                                        i = C0966R.C0970id.n9n;
                                                    } else if (((FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.itr)) != null) {
                                                        setFinderLiveMicMuteIcon(frameLayout);
                                                        setFinderLiveMicMuteIconWe(weImageView);
                                                        C87412m.m108593f(relativeLayout, "viewBinding.root");
                                                        setRoot(relativeLayout);
                                                        ConstraintLayout constraintLayout = a6.f175521a;
                                                        C87412m.m108593f(constraintLayout, "viewBinding.finderLiveMi…malMicGiftItemLayout.root");
                                                        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                                        setFinderLiveVideoLinkBottomBarAvatar(imageView);
                                                        setFinderLiveVideoLinkBottomBarName(finderFixedTextView);
                                                        setFinderLiveMicHeartText(textView);
                                                        setFinderLiveVideoLinkBottomBarUserLevel(textView2);
                                                        RelativeLayout relativeLayout2 = a4.f175449a;
                                                        C87412m.m108593f(relativeLayout2, "viewBinding.finderLiveLuckyMoneyBubbleUiRoot.root");
                                                        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                                        RelativeLayout relativeLayout3 = a2.f175451a;
                                                        C87412m.m108593f(relativeLayout3, "viewBinding.finderLiveLu…neyBubbleSmallUiRoot.root");
                                                        this.f181134A = relativeLayout3;
                                                        this.f181135B = imageView2;
                                                        this.f181136C = frameLayout2;
                                                        return;
                                                    } else {
                                                        i = C0966R.C0970id.itr;
                                                    }
                                                } else {
                                                    i = C0966R.C0970id.e0y;
                                                }
                                            } else {
                                                i = C0966R.C0970id.e0x;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* renamed from: v */
    public final void mo88687v(C54130j jVar) {
        String tag = getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("[loadMicUserBg] liveRoomImg = ");
        C64756up2 up22 = jVar.f152017u;
        sb.append(up22 != null ? C61937h.m72709h(up22) : null);
        Log.m105924i(tag, sb.toString());
        getRoot().post(new C63905b(jVar, this));
    }

    /* renamed from: w */
    public final void mo88688w() {
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f181137z;
        if (finderLiveThumbPlayerProxy != null) {
            finderLiveThumbPlayerProxy.stop();
        }
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = this.f181137z;
        if (finderLiveThumbPlayerProxy2 != null) {
            finderLiveThumbPlayerProxy2.mo78608c();
        }
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = this.f181137z;
        if (finderLiveThumbPlayerProxy3 != null) {
            finderLiveThumbPlayerProxy3.mo78609d();
        }
        this.f181137z = null;
        FrameLayout frameLayout = this.f181136C;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        } else {
            C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
            throw null;
        }
    }

    /* renamed from: x */
    public final void mo88689x() {
        String tag = getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("updateCoverBg isPk:");
        C54130j bindLinkMicUser = getBindLinkMicUser();
        sb.append(bindLinkMicUser != null ? Boolean.valueOf(bindLinkMicUser.f152004h) : null);
        sb.append(" audioMode:");
        C54130j bindLinkMicUser2 = getBindLinkMicUser();
        sb.append(bindLinkMicUser2 != null ? Boolean.valueOf(bindLinkMicUser2.f152012p) : null);
        sb.append(" bgUrl:");
        C54130j bindLinkMicUser3 = getBindLinkMicUser();
        sb.append(bindLinkMicUser3 != null ? bindLinkMicUser3.f152011o : null);
        Log.m105924i(tag, sb.toString());
        C54130j bindLinkMicUser4 = getBindLinkMicUser();
        if (bindLinkMicUser4 != null && bindLinkMicUser4.f152004h) {
            if (bindLinkMicUser4.f152012p) {
                mo88687v(bindLinkMicUser4);
                return;
            }
            mo88688w();
            FrameLayout frameLayout = this.f181136C;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                ImageView imageView = this.f181135B;
                if (imageView != null) {
                    imageView.setVisibility(8);
                } else {
                    C87412m.m108603p("finderLiveVideoLinkCoverBg");
                    throw null;
                }
            } else {
                C87412m.m108603p("finderLiveVideoLinkDynamicCoverBg");
                throw null;
            }
        }
    }
}
