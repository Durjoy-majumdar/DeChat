package com.tencent.p014mm.plugin.finder.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55018j0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de1.C7290r;
import dp1.C7435f2;
import f40.C86709a0;
import fy3.C32224a;
import gr1.C59667n2;
import gr1.C8378a0;
import gr1.C8379b0;
import gr1.C8381c0;
import gr1.C8383d;
import gr1.C8384d0;
import gr1.C8386e;
import gr1.C8387e0;
import gr1.C8390f;
import gr1.C8391f0;
import gr1.C8393g0;
import gr1.C8399i;
import gr1.C8400i0;
import gr1.C8402j;
import gr1.C8403j0;
import gr1.C8410l;
import gr1.C8412m;
import gr1.C8414n;
import gr1.C8417o;
import gr1.C8418p;
import gr1.C8421q;
import gr1.C8427t;
import gr1.C8429v;
import gr1.C8430w;
import gr1.C8431x;
import gr1.C8432y;
import gr1.C8435z;
import gy3.C87412m;
import ht1.C60200t1;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l60.C99342a;
import l60.C99344b;
import lu3.C34379c;
import o40.C61926c;
import org.json.JSONObject;
import p282z2.C16095a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rs1.C13282j2;
import rs1.C13442s8;
import rs1.C63513a1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import t60.C64207e;
import te3.C48996cf1;
import te3.C64689rq2;
import up1.C27696y;
import up1.C37521f;
import wp1.C15587j;
import x60.C102564a;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001B(\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u0007\u0010\u0001\u001a\u00020\u0013¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0014\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bJ\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0010R\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R(\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R(\u00107\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R(\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R\"\u0010G\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001b\u0010R\u001a\u00020N8FX\u0002¢\u0006\f\n\u0004\bO\u0010\"\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0002¢\u0006\f\n\u0004\bT\u0010\"\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020S8BX\u0002¢\u0006\f\n\u0004\bX\u0010\"\u001a\u0004\bY\u0010VR\u001b\u0010]\u001a\u00020S8BX\u0002¢\u0006\f\n\u0004\b[\u0010\"\u001a\u0004\b\\\u0010VR\u001b\u0010b\u001a\u00020^8BX\u0002¢\u0006\f\n\u0004\b_\u0010\"\u001a\u0004\b`\u0010aR#\u0010f\u001a\n c*\u0004\u0018\u00010^0^8BX\u0002¢\u0006\f\n\u0004\bd\u0010\"\u001a\u0004\be\u0010aR\u001b\u0010i\u001a\u00020^8BX\u0002¢\u0006\f\n\u0004\bg\u0010\"\u001a\u0004\bh\u0010aR\u001b\u0010l\u001a\u00020^8BX\u0002¢\u0006\f\n\u0004\bj\u0010\"\u001a\u0004\bk\u0010aR\u001b\u0010o\u001a\u00020^8BX\u0002¢\u0006\f\n\u0004\bm\u0010\"\u001a\u0004\bn\u0010aR\u001b\u0010r\u001a\u00020^8FX\u0002¢\u0006\f\n\u0004\bp\u0010\"\u001a\u0004\bq\u0010aR#\u0010u\u001a\n c*\u0004\u0018\u00010^0^8BX\u0002¢\u0006\f\n\u0004\bs\u0010\"\u001a\u0004\bt\u0010aR\u001b\u0010x\u001a\u00020^8FX\u0002¢\u0006\f\n\u0004\bv\u0010\"\u001a\u0004\bw\u0010aR\u001d\u0010{\u001a\u0004\u0018\u00010^8BX\u0002¢\u0006\f\n\u0004\by\u0010\"\u001a\u0004\bz\u0010aR\u001d\u0010\u001a\u0004\u0018\u00010\u000b8BX\u0002¢\u0006\f\n\u0004\b|\u0010\"\u001a\u0004\b}\u0010~R \u0010\u0001\u001a\u0004\u0018\u00010\u000b8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010~R \u0010\u0001\u001a\u0004\u0018\u00010S8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010VR&\u0010\u0001\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010I\u001a\u0005\b\u0001\u0010K\"\u0005\b\u0001\u0010MR&\u0010\u0001\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010I\u001a\u0005\b\u0001\u0010K\"\u0005\b\u0001\u0010MR0\u0010\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout;", "Landroid/widget/FrameLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Lgr1/n2;", "Lcom/tencent/mm/plugin/finder/view/FinderViewPager$a;", "", "getSeekPercent", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lrx3/b0;", "setRecyclerView", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "icon", "setFloatPlayIcon", "getFloatPlayIcon", "setFakeFloatPlayIcon", "", "isPlaying", "setPlayingStatus", "", "target", "setProgress", "getCurrentProgress", "getMaxProgress", "Lgr1/n2$b;", "callback", "setSeekBarCallback", "", "set", "setExcludeIDs", "isShow", "setPlayIconState", "Landroid/widget/SeekBar;", "d", "Lrx3/g;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "Lkotlin/Function0;", "e", "Lfy3/a;", "getOnResumePlayListener", "()Lfy3/a;", "setOnResumePlayListener", "(Lfy3/a;)V", "onResumePlayListener", "f", "getOnPrivateLikeClickListener", "setOnPrivateLikeClickListener", "onPrivateLikeClickListener", "g", "getOnPauseClickListener", "setOnPauseClickListener", "onPauseClickListener", "h", "isPlayingCallback", "setPlayingCallback", "i", "getOnLongVideoBtnClickListener", "setOnLongVideoBtnClickListener", "onLongVideoBtnClickListener", "j", "getAdjustPositionCallback", "setAdjustPositionCallback", "adjustPositionCallback", "n", "I", "getLastProgress", "()I", "setLastProgress", "(I)V", "lastProgress", "o", "Z", "isShareGuidePause", "()Z", "setShareGuidePause", "(Z)V", "Landroid/view/ViewGroup;", "p", "getSeekLayout", "()Landroid/view/ViewGroup;", "seekLayout", "Landroid/widget/TextView;", "q", "getCurrentTimeTv", "()Landroid/widget/TextView;", "currentTimeTv", "r", "getAllTimeTv", "allTimeTv", "s", "getAllTimeLongTv", "allTimeLongTv", "Landroid/view/View;", "t", "getLongVideoLayout", "()Landroid/view/View;", "longVideoLayout", "kotlin.jvm.PlatformType", "u", "getVideoMsgLayout", "videoMsgLayout", "v", "getAutoSeekHint", "autoSeekHint", "w", "getLongVideoOrientationTurnBtn", "longVideoOrientationTurnBtn", "x", "getVideoOrientationTurnBtn", "videoOrientationTurnBtn", "y", "getPlayCtrlBtn", "playCtrlBtn", "z", "getHorizontalHint", "horizontalHint", "B", "getBulletBtn", "bulletBtn", "C", "getAwesomePrivateLayout", "awesomePrivateLayout", "F", "getPauseIcon", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "pauseIcon", "G", "getPrivateAwesomeIcon", "privateAwesomeIcon", "H", "getPrivateAweSomeTv", "privateAweSomeTv", "K", "isPendingExitMode", "setPendingExitMode", "Q", "getHidePrivateLike", "setHidePrivateLike", "hidePrivateLike", "Llu3/c;", "W", "Llu3/c;", "getHideSeekbarTask", "()Llu3/c;", "setHideSeekbarTask", "(Llu3/c;)V", "hideSeekbarTask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout */
public final class FinderFullSeekBarLayout extends FrameLayout implements SeekBar.OnSeekBarChangeListener, C59667n2, FinderViewPager.C3983a {

    /* renamed from: V0 */
    public static final HashMap<Long, Integer> f17481V0 = new HashMap<>();

    /* renamed from: A */
    public final Runnable f17482A = new C8414n(this);

    /* renamed from: B */
    public final C13601g f17483B = C36568h.m40985a(new C8402j(this));

    /* renamed from: C */
    public final C13601g f17484C = C36568h.m40985a(new C8399i(this));

    /* renamed from: D */
    public boolean f17485D;

    /* renamed from: E */
    public boolean f17486E = true;

    /* renamed from: F */
    public final C13601g f17487F = C36568h.m40985a(new C8379b0(this));

    /* renamed from: G */
    public final C13601g f17488G = C36568h.m40985a(new C8387e0(this));

    /* renamed from: H */
    public final C13601g f17489H = C36568h.m40985a(new C8384d0(this));

    /* renamed from: I */
    public WeImageView f17490I;

    /* renamed from: J */
    public boolean f17491J;

    /* renamed from: K */
    public boolean f17492K;

    /* renamed from: L */
    public WeImageView f17493L;

    /* renamed from: M */
    public boolean f17494M;

    /* renamed from: N */
    public BaseFinderFeed f17495N;

    /* renamed from: P */
    public boolean f17496P;

    /* renamed from: Q */
    public boolean f17497Q;

    /* renamed from: Q0 */
    public final HashSet<Integer> f17498Q0 = new HashSet<>();

    /* renamed from: R */
    public boolean f17499R;

    /* renamed from: R0 */
    public final Rect f17500R0 = new Rect();

    /* renamed from: S */
    public final Drawable f17501S = getResources().getDrawable(C0966R.raw.icons_filled_play);

    /* renamed from: S0 */
    public boolean f17502S0;

    /* renamed from: T */
    public final Drawable f17503T = getResources().getDrawable(C0966R.raw.icons_filled_pause);

    /* renamed from: T0 */
    public final int f17504T0 = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv);

    /* renamed from: U */
    public C59667n2.C8416b f17505U;

    /* renamed from: U0 */
    public final View.OnTouchListener f17506U0 = new C8412m(this);

    /* renamed from: V */
    public boolean f17507V;

    /* renamed from: W */
    public C34379c<?> f17508W;

    /* renamed from: d */
    public final C13601g f17509d = C36568h.m40985a(new C8391f0(this));

    /* renamed from: e */
    public C32224a<C13598b0> f17510e = C8378a0.f27369d;

    /* renamed from: f */
    public C32224a<Boolean> f17511f = C8435z.f27431d;

    /* renamed from: g */
    public C32224a<Boolean> f17512g = C8432y.f27428d;

    /* renamed from: h */
    public C32224a<Boolean> f17513h = C8427t.f27423d;

    /* renamed from: i */
    public C32224a<C13598b0> f17514i = C8431x.f27427d;

    /* renamed from: j */
    public C32224a<C13598b0> f17515j;

    /* renamed from: n */
    public int f17516n = -1;

    /* renamed from: o */
    public boolean f17517o;

    /* renamed from: p */
    public final C13601g f17518p = C36568h.m40985a(new C8393g0(this));

    /* renamed from: p0 */
    public int f17519p0 = -1;

    /* renamed from: q */
    public final C13601g f17520q = C36568h.m40985a(new C8410l(this));

    /* renamed from: r */
    public final C13601g f17521r = C36568h.m40985a(new C8386e(this));

    /* renamed from: s */
    public final C13601g f17522s = C36568h.m40985a(new C8383d(this));

    /* renamed from: t */
    public final C13601g f17523t = C36568h.m40985a(new C8429v(this));

    /* renamed from: u */
    public final C13601g f17524u = C36568h.m40985a(new C8400i0(this));

    /* renamed from: v */
    public final C13601g f17525v = C36568h.m40985a(new C8390f(this));

    /* renamed from: w */
    public final C13601g f17526w = C36568h.m40985a(new C8430w(this));

    /* renamed from: x */
    public final C13601g f17527x = C36568h.m40985a(new C8403j0(this));

    /* renamed from: x0 */
    public int f17528x0;

    /* renamed from: y */
    public final C13601g f17529y = C36568h.m40985a(new C8381c0(this));

    /* renamed from: y0 */
    public boolean f17530y0;

    /* renamed from: z */
    public final C13601g f17531z = C36568h.m40985a(new C8421q(this));

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$a */
    public static final class C3897a extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f17532d;

        /* renamed from: e */
        public final /* synthetic */ boolean f17533e;

        public C3897a(View view, boolean z) {
            this.f17532d = view;
            this.f17533e = z;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f17532d;
            int i = this.f17533e ? 8 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$animDisappearView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$animDisappearView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f17532d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$animDisappearView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$animDisappearView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$b */
    public static final class C3898b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f17534d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f17535e;

        public C3898b(View view, ViewGroup viewGroup) {
            this.f17534d = view;
            this.f17535e = viewGroup;
        }

        public final void run() {
            this.f17534d.animate().cancel();
            this.f17535e.removeView(this.f17534d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$c */
    public static final class C3899c extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ FinderFullSeekBarLayout f17536d;

        public C3899c(FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17536d = finderFullSeekBarLayout;
        }

        public void onAnimationEnd(Animator animator) {
            View c = this.f17536d.getAwesomePrivateLayout();
            if (c != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(c, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideAwesomePrivateLayout$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(c, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideAwesomePrivateLayout$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$d */
    public static final class C3900d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ FinderFullSeekBarLayout f17537d;

        public C3900d(FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17537d = finderFullSeekBarLayout;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View f = this.f17537d.getHorizontalHint();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(f, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideHorizontalHint$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(f, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$hideHorizontalHint$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f17537d.getHorizontalHint().removeCallbacks(this.f17537d.f17482A);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$e */
    public static final class C3901e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFullSeekBarLayout f17538d;

        public C3901e(FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17538d = finderFullSeekBarLayout;
        }

        public final void run() {
            this.f17538d.mo4259i("onStopTrackingTouch");
            this.f17538d.setPendingExitMode(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$f */
    public static final class C3902f<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ WeImageView f17539a;

        /* renamed from: b */
        public final /* synthetic */ FinderFullSeekBarLayout f17540b;

        public C3902f(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17539a = weImageView;
            this.f17540b = finderFullSeekBarLayout;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            this.f17539a.setIconColor(this.f17540b.getContext().getResources().getColor(C0966R.color.Red_90));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$g */
    public static final class C3903g<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ WeImageView f17541a;

        /* renamed from: b */
        public final /* synthetic */ FinderFullSeekBarLayout f17542b;

        public C3903g(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17541a = weImageView;
            this.f17542b = finderFullSeekBarLayout;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            if (((Bitmap) obj) != null) {
                C61926c.m72668M(new C3918b(this.f17541a, this.f17542b));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$h */
    public static final class C3904h<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ WeImageView f17543a;

        /* renamed from: b */
        public final /* synthetic */ FinderFullSeekBarLayout f17544b;

        public C3904h(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17543a = weImageView;
            this.f17544b = finderFullSeekBarLayout;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            if (((Bitmap) obj) != null) {
                C61926c.m72668M(new C3920d(this.f17543a, this.f17544b));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$i */
    public static final class C3905i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFullSeekBarLayout f17545d;

        public C3905i(FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17545d = finderFullSeekBarLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$setFloatPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (AccUtil.INSTANCE.isAccessibilityEnabled()) {
                this.f17545d.getOnResumePlayListener().invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$setFloatPlayIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$j */
    public static final class C3906j extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ FinderFullSeekBarLayout f17546d;

        public C3906j(FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f17546d = finderFullSeekBarLayout;
        }

        public void onAnimationEnd(Animator animator) {
            WeImageView weImageView = this.f17546d.f17490I;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
        }
    }

    static {
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3753d4);
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3749d0);
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFullSeekBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: G */
    public static void m4082G(FinderFullSeekBarLayout finderFullSeekBarLayout, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        boolean z2 = true;
        if ((i & 2) != 0) {
            z = true;
        }
        finderFullSeekBarLayout.getClass();
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Context context = finderFullSeekBarLayout.getContext();
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity == null || !mMActivity.isPaused()) {
            z2 = false;
        }
        if (z2) {
            Log.m105928w("Finder.FullSeekBarLayout", "[toggleSeekMode] Activity is paused!");
            return;
        }
        C34379c<?> cVar = finderFullSeekBarLayout.f17508W;
        if (cVar != null) {
            cVar.cancel(false);
        }
        if (!finderFullSeekBarLayout.f17507V || finderFullSeekBarLayout.f17492K) {
            finderFullSeekBarLayout.mo4242e(str, z);
        } else {
            finderFullSeekBarLayout.mo4259i("onSingleTapUp#isClickable=" + finderFullSeekBarLayout.getSeekLayout().isClickable());
        }
        if (!finderFullSeekBarLayout.f17507V) {
            finderFullSeekBarLayout.announceForAccessibility(finderFullSeekBarLayout.getContext().getString(C0966R.string.ems));
        } else {
            finderFullSeekBarLayout.announceForAccessibility(finderFullSeekBarLayout.getContext().getString(C0966R.string.egs));
        }
        finderFullSeekBarLayout.f17492K = false;
    }

    private final TextView getAllTimeLongTv() {
        Object value = this.f17522s.getValue();
        C87412m.m108593f(value, "<get-allTimeLongTv>(...)");
        return (TextView) value;
    }

    private final TextView getAllTimeTv() {
        Object value = this.f17521r.getValue();
        C87412m.m108593f(value, "<get-allTimeTv>(...)");
        return (TextView) value;
    }

    private final View getAutoSeekHint() {
        Object value = this.f17525v.getValue();
        C87412m.m108593f(value, "<get-autoSeekHint>(...)");
        return (View) value;
    }

    /* access modifiers changed from: private */
    public final View getAwesomePrivateLayout() {
        return (View) this.f17484C.getValue();
    }

    private final TextView getCurrentTimeTv() {
        Object value = this.f17520q.getValue();
        C87412m.m108593f(value, "<get-currentTimeTv>(...)");
        return (TextView) value;
    }

    /* access modifiers changed from: private */
    public final View getHorizontalHint() {
        return (View) this.f17531z.getValue();
    }

    private final View getLongVideoLayout() {
        Object value = this.f17523t.getValue();
        C87412m.m108593f(value, "<get-longVideoLayout>(...)");
        return (View) value;
    }

    private final View getLongVideoOrientationTurnBtn() {
        Object value = this.f17526w.getValue();
        C87412m.m108593f(value, "<get-longVideoOrientationTurnBtn>(...)");
        return (View) value;
    }

    private final WeImageView getPauseIcon() {
        return (WeImageView) this.f17487F.getValue();
    }

    private final TextView getPrivateAweSomeTv() {
        return (TextView) this.f17489H.getValue();
    }

    private final WeImageView getPrivateAwesomeIcon() {
        return (WeImageView) this.f17488G.getValue();
    }

    /* access modifiers changed from: private */
    public final SeekBar getSeekBar() {
        Object value = this.f17509d.getValue();
        C87412m.m108593f(value, "<get-seekBar>(...)");
        return (SeekBar) value;
    }

    private final float getSeekPercent() {
        SeekBar seekBar = getSeekBar();
        if (seekBar == null) {
            return 0.0f;
        }
        return (((float) seekBar.getProgress()) * 1.0f) / ((float) seekBar.getMax());
    }

    private final View getVideoMsgLayout() {
        return (View) this.f17524u.getValue();
    }

    private final View getVideoOrientationTurnBtn() {
        Object value = this.f17527x.getValue();
        C87412m.m108593f(value, "<get-videoOrientationTurnBtn>(...)");
        return (View) value;
    }

    /* renamed from: r */
    public static /* synthetic */ void m4086r(FinderFullSeekBarLayout finderFullSeekBarLayout, View view, long j, boolean z, boolean z2, int i, Object obj) {
        finderFullSeekBarLayout.mo4274q(view, j, z, (i & 8) != 0 ? true : z2);
    }

    /* renamed from: z */
    public static void m4087z(FinderFullSeekBarLayout finderFullSeekBarLayout, boolean z, long j, boolean z2, int i, Object obj) {
        FinderFullSeekBarLayout finderFullSeekBarLayout2 = finderFullSeekBarLayout;
        boolean z3 = true;
        boolean z4 = (i & 1) != 0 ? true : z;
        long j2 = (i & 2) != 0 ? 130 : j;
        boolean z5 = (i & 4) != 0 ? false : z2;
        finderFullSeekBarLayout.mo4295t();
        View findViewById = finderFullSeekBarLayout.getSeekLayout().findViewById(C0966R.C0970id.hr9);
        Float valueOf = Float.valueOf(1.0f);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            ViewPropertyAnimator animate = findViewById.animate();
            if (animate != null) {
                animate.cancel();
            }
            if (z4) {
                findViewById.animate().alpha(0.0f).setDuration(j2).setListener(new C8417o(findViewById)).start();
            } else {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(valueOf);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        ViewGroup viewGroup = (ViewGroup) finderFullSeekBarLayout.getSeekLayout().findViewById(C0966R.C0970id.hra);
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt.getId() == C0966R.C0970id.ewz || childAt.getId() == C0966R.C0970id.izy || childAt.getId() == C0966R.C0970id.egp || childAt.getVisibility() != 0 || childAt.getVisibility() != 0)) {
                ViewPropertyAnimator animate2 = childAt.animate();
                if (animate2 != null) {
                    animate2.cancel();
                }
                if (z4) {
                    childAt.animate().alpha(0.0f).setDuration(j2).setListener(new C8418p(childAt)).start();
                } else {
                    int i3 = childAt.getId() == C0966R.C0970id.l59 ? 8 : 4;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(Integer.valueOf(i3));
                    Object[] b = aVar3.mo10232b();
                    C9556a aVar4 = aVar3;
                    View view2 = childAt;
                    C117292a.m165358d(view2, b, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(valueOf);
                    C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideSeekLayout", "(ZJZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        if (finderFullSeekBarLayout.getAllTimeTv().getVisibility() == 0) {
            m4086r(finderFullSeekBarLayout, finderFullSeekBarLayout.getAllTimeTv(), 130, true, false, 8, (Object) null);
        }
        if (finderFullSeekBarLayout.getPlayCtrlBtn().getVisibility() == 0) {
            m4086r(finderFullSeekBarLayout, finderFullSeekBarLayout.getPlayCtrlBtn(), j2, z4, false, 8, (Object) null);
        }
        if (finderFullSeekBarLayout.getBulletBtn().getVisibility() == 0) {
            BaseFinderFeed baseFinderFeed = finderFullSeekBarLayout2.f17495N;
            C55018j0 j0Var = baseFinderFeed instanceof C55018j0 ? (C55018j0) baseFinderFeed : null;
            if (j0Var == null || j0Var.mo76077q0(finderFullSeekBarLayout2.f17496P)) {
                z3 = false;
            }
            if (z3) {
                m4086r(finderFullSeekBarLayout, finderFullSeekBarLayout.getBulletBtn(), j2, z4, false, 8, (Object) null);
            }
        }
        if (finderFullSeekBarLayout.getLongVideoOrientationTurnBtn().getVisibility() == 0) {
            m4086r(finderFullSeekBarLayout, finderFullSeekBarLayout.getLongVideoOrientationTurnBtn(), j2, z4, false, 8, (Object) null);
        }
        if (finderFullSeekBarLayout.getVideoOrientationTurnBtn().getVisibility() == 0) {
            finderFullSeekBarLayout.mo4274q(finderFullSeekBarLayout.getVideoOrientationTurnBtn(), j2, z4, false);
        }
        if (z5 || finderFullSeekBarLayout2.f17513h.invoke().booleanValue()) {
            Log.m105924i("Finder.FullSeekBarLayout", "isPlayingCallback false, onlyView=" + z5);
            return;
        }
        finderFullSeekBarLayout2.f17486E = false;
        if (finderFullSeekBarLayout2.f17512g.invoke().booleanValue()) {
            finderFullSeekBarLayout.mo4235D();
        }
    }

    /* renamed from: A */
    public final void mo4232A(BaseFinderFeed baseFinderFeed) {
        C13598b0 b0Var;
        C72994y1.C72995a aVar;
        int j;
        C87412m.m108594g(baseFinderFeed, "feed");
        C37521f.f99374d.getClass();
        ((C37521f.C37542s0) C37521f.f99310V4).getClass();
        Integer num = 0;
        if (num.intValue() == 0 && baseFinderFeed.mo3513o().isPostFinish() && baseFinderFeed.mo3513o().isLongVideo()) {
            C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(baseFinderFeed.mo3513o().getMediaList());
            if (rq22 == null) {
                b0Var = null;
            } else if (rq22.f185271i <= rq22.f185270h) {
                b0Var = C13598b0.f38549a;
            } else {
                return;
            }
            if (b0Var != null && (j = C86709a0.m107535s().mo121142i().mo119689j(aVar, 0)) < 3) {
                C86709a0.m107535s().mo121142i().mo119677K((aVar = C72994y1.C72995a.USERINFO_FINDER_FEED_SHOW_HORIZONTAL_HINT_LIMIT_INT_SYNC), Integer.valueOf(j + 1));
                C34379c<?> cVar = this.f17508W;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                mo4259i("checkShowHorizontalHint");
                View horizontalHint = getHorizontalHint();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                View view = horizontalHint;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "checkShowHorizontalHint", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                horizontalHint.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "checkShowHorizontalHint", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View horizontalHint2 = getHorizontalHint();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view2 = horizontalHint2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "checkShowHorizontalHint", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                horizontalHint2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "checkShowHorizontalHint", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                getHorizontalHint().animate().alpha(1.0f).setDuration(300).start();
                getHorizontalHint().postDelayed(this.f17482A, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                int i = Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) == 1 ? C0966R.string.d9i : C0966R.string.d9j;
                TextView textView = (TextView) getHorizontalHint().findViewById(C0966R.C0970id.f358400ex0);
                if (textView != null) {
                    textView.setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.f3684bd));
                    textView.setText(i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        r4 = (r4 = r4.mo3513o()).getFeedObject();
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4233B(boolean r10) {
        /*
            r9 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99208J7
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 != r3) goto L_0x0019
            return
        L_0x0019:
            wp1.j r2 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r9.f17495N
            r5 = 0
            if (r4 == 0) goto L_0x002f
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            if (r4 == 0) goto L_0x002f
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            if (r4 == 0) goto L_0x002f
            int r4 = r4.objectType
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            te3.if1 r2 = r2.mo14351c(r4)
            r4 = 0
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.f135273s
            goto L_0x003b
        L_0x003a:
            r2 = r4
        L_0x003b:
            r9.f17494M = r10
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[refreshAwesome] isLike="
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = " groupLikeIconUrl="
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "Finder.FullSeekBarLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            android.widget.TextView r6 = r9.getPrivateAweSomeTv()
            if (r6 != 0) goto L_0x0062
            goto L_0x0070
        L_0x0062:
            android.content.res.Resources r7 = r9.getResources()
            r8 = 2131826195(0x7f111613, float:1.9285268E38)
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
        L_0x0070:
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r9.getPrivateAwesomeIcon()
            if (r6 == 0) goto L_0x011b
            r7 = 2
            if (r10 == 0) goto L_0x00e2
            if (r2 == 0) goto L_0x00bb
            r6.setLayerPaint(r4)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62446e(r1)
            bl3.c r3 = r3.mo62447c(r0)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11871f2()
            pl1.n0 r5 = new pl1.n0
            up1.y r7 = up1.C27696y.RAW_IMAGE
            r5.<init>(r2, r7)
            l60.b r2 = r3.mo85955a(r5)
            pl1.e0$a r3 = pl1.C11978e0.C11979a.COMMON
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r1 = r5.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            r2.mo138758f(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$f r0 = new com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$f
            r0.<init>(r6, r9)
            r2.f291320d = r0
            l60.a r2 = (l60.C99342a) r2
            r2.mo85954d(r6)
            goto L_0x011b
        L_0x00bb:
            er1.w3 r0 = er1.C58784w3.f168295a
            r1 = 4
            java.lang.Integer r0 = er1.C58784w3.m68436c0(r0, r1, r5, r7, r4)
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.intValue()
            goto L_0x00cc
        L_0x00c9:
            r0 = 2131756064(0x7f100420, float:1.9143025E38)
        L_0x00cc:
            r6.setImageResource(r0)
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099905(0x7f060101, float:1.7812176E38)
            int r0 = r0.getColor(r1)
            r6.setIconColor(r0)
            goto L_0x011b
        L_0x00e2:
            if (r2 == 0) goto L_0x00ec
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            if (r3 == 0) goto L_0x0103
            er1.w3 r0 = er1.C58784w3.f168295a
            r1 = 3
            java.lang.Integer r0 = er1.C58784w3.m68436c0(r0, r1, r5, r7, r4)
            if (r0 == 0) goto L_0x00fc
            int r0 = r0.intValue()
            goto L_0x00ff
        L_0x00fc:
            r0 = 2131756330(0x7f10052a, float:1.9143564E38)
        L_0x00ff:
            r6.setImageResource(r0)
            goto L_0x0109
        L_0x0103:
            r0 = 2131756315(0x7f10051b, float:1.9143534E38)
            r6.setImageResource(r0)
        L_0x0109:
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131100935(0x7f060507, float:1.7814265E38)
            int r0 = r0.getColor(r1)
            r6.setIconColor(r0)
        L_0x011b:
            r9.mo4295t()
            android.view.View r0 = r9.getAwesomePrivateLayout()
            if (r0 == 0) goto L_0x013e
            r1 = 2131302579(0x7f0918b3, float:1.8223248E38)
            android.widget.TextView r2 = r9.getPrivateAweSomeTv()
            if (r2 == 0) goto L_0x0131
            java.lang.CharSequence r4 = r2.getText()
        L_0x0131:
            r0.setTag(r1, r4)
            r1 = 2131302527(0x7f09187f, float:1.8223143E38)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.setTag(r1, r10)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout.mo4233B(boolean):void");
    }

    /* renamed from: C */
    public final void mo4234C(boolean z) {
        String str;
        String str2;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        C27696y yVar = C27696y.RAW_IMAGE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C37521f.f99374d.getClass();
        if (C37521f.f99208J7.mo60266n().intValue() != 0) {
            TextView privateAweSomeTv = getPrivateAweSomeTv();
            if (privateAweSomeTv != null) {
                privateAweSomeTv.setText(getResources().getString(C0966R.string.fqj));
            }
            WeImageView privateAwesomeIcon = getPrivateAwesomeIcon();
            if (privateAwesomeIcon != null) {
                String str3 = "";
                if (z) {
                    C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOnIcon");
                    if (!(a == null || (str2 = a.f131694e) == null)) {
                        str3 = str2;
                    }
                    if (Util.isNullOrNil(str3)) {
                        privateAwesomeIcon.setImageResource(C0966R.raw.icons_outlined_star_new);
                        privateAwesomeIcon.setIconColor(getContext().getResources().getColor(C0966R.color.Red_90));
                    } else {
                        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str3, yVar), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                        C3903g gVar = new C3903g(privateAwesomeIcon, this);
                        b.getClass();
                        b.f291320d = gVar;
                        ((C99342a) b).mo85954d(privateAwesomeIcon);
                    }
                } else {
                    C48996cf1 a2 = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffIcon");
                    if (!(a2 == null || (str = a2.f131694e) == null)) {
                        str3 = str;
                    }
                    if (Util.isNullOrNil(str3)) {
                        privateAwesomeIcon.setImageResource(C0966R.raw.icons_outlined_star_new);
                        privateAwesomeIcon.setIconColor(getContext().getResources().getColor(C0966R.color.f3585yj));
                    } else {
                        C99344b<C100810g0, Bitmap> b2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str3, yVar), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                        C3904h hVar = new C3904h(privateAwesomeIcon, this);
                        b2.getClass();
                        b2.f291320d = hVar;
                        ((C99342a) b2).mo85954d(privateAwesomeIcon);
                    }
                }
            }
            View awesomePrivateLayout = getAwesomePrivateLayout();
            if (awesomePrivateLayout != null) {
                TextView privateAweSomeTv2 = getPrivateAweSomeTv();
                awesomePrivateLayout.setTag(C0966R.C0970id.f358041nl1, privateAweSomeTv2 != null ? privateAweSomeTv2.getText() : null);
                awesomePrivateLayout.setTag(C0966R.C0970id.f358032nl0, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: D */
    public final void mo4235D() {
        String str;
        if (this.f17486E) {
            str = "pause_by_icon";
        } else {
            this.f17486E = true;
            str = "pause_by_clckscreen";
        }
        String str2 = str;
        BaseFinderFeed baseFinderFeed = this.f17495N;
        if (baseFinderFeed != null) {
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            C7435f2.m7551e(f2Var, f != null ? f.mo12861q3() : null, str2, false, baseFinderFeed.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0061, code lost:
        r7 = r26.mo3513o();
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4236E(boolean r25, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r0.f17496P = r1
            r0.f17495N = r2
            android.widget.TextView r3 = r24.getAllTimeTv()
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.setVisibility(r4)
            r3 = 0
            r0.mo4299y(r3)
            android.view.View r14 = r24.getPlayCtrlBtn()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r15.mo10233c(r5)
            java.lang.Object[] r7 = r15.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r9 = "setFinderFeed"
            java.lang.String r10 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r14
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r15.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r14.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r8 = "setFinderFeed"
            java.lang.String r9 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r14
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            r6 = 1
            if (r2 == 0) goto L_0x006f
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r26.mo3513o()
            if (r7 == 0) goto L_0x006f
            boolean r7 = r7.isLongVideo()
            if (r7 != r6) goto L_0x006f
            r7 = 1
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            r8 = 0
            if (r7 == 0) goto L_0x017c
            android.view.View r7 = r24.getLongVideoLayout()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "setFinderFeed"
            java.lang.String r13 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r7
            r4 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "setFinderFeed"
            java.lang.String r12 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r26.mo3513o()
            java.util.LinkedList r4 = r4.getMediaList()
            java.lang.Object r4 = r4.getFirst()
            te3.rq2 r4 = (te3.C64689rq2) r4
            int r4 = r4.f185269g
            r0.mo4238H(r3, r4)
            android.widget.TextView r4 = r24.getAllTimeLongTv()
            r7 = 0
            r4.setTranslationX(r7)
            android.view.View r4 = r24.getBulletBtn()
            boolean r7 = r2 instanceof cm1.C55018j0
            if (r7 == 0) goto L_0x00e2
            cm1.j0 r2 = (cm1.C55018j0) r2
            goto L_0x00e3
        L_0x00e2:
            r2 = r8
        L_0x00e3:
            if (r2 == 0) goto L_0x00ed
            boolean r1 = r2.mo76077q0(r1)
            if (r1 != r6) goto L_0x00ed
            r1 = 1
            goto L_0x00ee
        L_0x00ed:
            r1 = 0
        L_0x00ee:
            if (r1 == 0) goto L_0x00f3
            r18 = 0
            goto L_0x00f5
        L_0x00f3:
            r18 = 8
        L_0x00f5:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r1.mo10233c(r2)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "setFinderFeed"
            java.lang.String r13 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r4
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "setFinderFeed"
            java.lang.String r12 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = r24.getVideoMsgLayout()
            if (r1 != 0) goto L_0x013d
            goto L_0x0241
        L_0x013d:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r19 = "setFinderFeed"
            java.lang.String r20 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r18 = "setFinderFeed"
            java.lang.String r19 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0241
        L_0x017c:
            android.view.View r1 = r24.getVideoMsgLayout()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "setFinderFeed"
            java.lang.String r13 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "setFinderFeed"
            java.lang.String r12 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = r24.getLongVideoLayout()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r19 = "setFinderFeed"
            java.lang.String r20 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r18 = "setFinderFeed"
            java.lang.String r19 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r1 = r24.getBulletBtn()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "setFinderFeed"
            java.lang.String r13 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "setFinderFeed"
            java.lang.String r12 = "(ZLcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0241:
            r1 = -1
            r0.f17516n = r1
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            boolean r2 = r0.f17485D
            if (r2 == 0) goto L_0x024c
            goto L_0x033e
        L_0x024c:
            r0.f17485D = r6
            gr1.s r2 = new gr1.s
            r2.<init>(r0)
            android.view.View r4 = r24.getLongVideoOrientationTurnBtn()
            r4.setOnClickListener(r2)
            android.view.View r4 = r24.getVideoOrientationTurnBtn()
            r4.setOnClickListener(r2)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            android.view.View r4 = r24.getLongVideoOrientationTurnBtn()
            java.lang.String r5 = "transpose_video_button"
            r2.o30(r4, r5)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            android.view.View r4 = r24.getVideoOrientationTurnBtn()
            r2.o30(r4, r5)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            android.view.View r4 = r24.getVideoOrientationTurnBtn()
            r5 = 40
            r7 = 25496(0x6398, float:3.5728E-41)
            r2.mo86175pO(r4, r5, r7)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            android.view.View r4 = r24.getLongVideoOrientationTurnBtn()
            r2.mo86175pO(r4, r5, r7)
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            android.content.Context r4 = r24.getContext()
            java.lang.String r5 = "context"
            gy3.C87412m.m108593f(r4, r5)
            rs1.s8 r4 = r2.mo12873f(r4)
            if (r4 == 0) goto L_0x02b2
            te3.hj1 r4 = r4.mo12861q3()
            goto L_0x02b3
        L_0x02b2:
            r4 = r8
        L_0x02b3:
            r7 = 4
            rx3.l[] r7 = new rx3.C13604l[r7]
            if (r4 == 0) goto L_0x02bb
            java.lang.String r9 = r4.f134670d
            goto L_0x02bc
        L_0x02bb:
            r9 = r8
        L_0x02bc:
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "behaviour_session_id"
            r10.<init>(r11, r9)
            r7[r3] = r10
            if (r4 == 0) goto L_0x02ca
            java.lang.String r3 = r4.f134671e
            goto L_0x02cb
        L_0x02ca:
            r3 = r8
        L_0x02cb:
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "finder_context_id"
            r9.<init>(r10, r3)
            r7[r6] = r9
            r3 = 2
            if (r4 == 0) goto L_0x02da
            java.lang.String r4 = r4.f134672f
            goto L_0x02db
        L_0x02da:
            r4 = r8
        L_0x02db:
            rx3.l r6 = new rx3.l
            java.lang.String r9 = "finder_tab_context_id"
            r6.<init>(r9, r4)
            r7[r3] = r6
            r3 = 3
            android.content.Context r4 = r24.getContext()
            gy3.C87412m.m108593f(r4, r5)
            rs1.s8 r2 = r2.mo12873f(r4)
            if (r2 == 0) goto L_0x02f8
            int r2 = r2.f38096i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x02f8:
            rx3.l r2 = new rx3.l
            java.lang.String r4 = "comment_scene"
            r2.<init>(r4, r8)
            r7[r3] = r2
            java.util.Map r2 = sx3.C90364q0.m113147f(r7)
            di3.d r3 = di3.C86312j.m106911c(r1)
            l31.e r3 = (l31.C61212e) r3
            android.view.View r4 = r24.getLongVideoOrientationTurnBtn()
            r3.mo86149PM(r4, r2)
            di3.d r3 = di3.C86312j.m106911c(r1)
            l31.e r3 = (l31.C61212e) r3
            android.view.View r4 = r24.getVideoOrientationTurnBtn()
            r3.mo86149PM(r4, r2)
            gr1.r r2 = new gr1.r
            r2.<init>(r0)
            di3.d r3 = di3.C86312j.m106911c(r1)
            l31.e r3 = (l31.C61212e) r3
            android.view.View r4 = r24.getLongVideoOrientationTurnBtn()
            r3.E60(r4, r2)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r3 = r24.getVideoOrientationTurnBtn()
            r1.E60(r3, r2)
        L_0x033e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout.mo4236E(boolean, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: F */
    public final void mo4237F(View view, boolean z) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator listener2;
        View view2 = view;
        if (view2 == null) {
            return;
        }
        if (z) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                animate.cancel();
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "setIconState", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "setIconState", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "setIconState", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "setIconState", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ViewPropertyAnimator animate2 = view.animate();
            if (animate2 != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(200)) != null && (listener2 = duration2.setListener((Animator.AnimatorListener) null)) != null) {
                listener2.start();
            }
        } else if (view.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = view.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "setIconState", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "setIconState", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ViewPropertyAnimator animate4 = view.animate();
            if (animate4 != null && (alpha = animate4.alpha(0.0f)) != null && (duration = alpha.setDuration(200)) != null && (listener = duration.setListener(new C3906j(this))) != null) {
                listener.start();
            }
        } else {
            WeImageView weImageView = this.f17490I;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
        }
    }

    /* renamed from: H */
    public final void mo4238H(int i, int i2) {
        getAllTimeTv().setText(mo4296v(i2));
        getAllTimeLongTv().setText(mo4296v(i2 - i));
        BaseFinderFeed baseFinderFeed = this.f17495N;
        if (baseFinderFeed != null) {
            baseFinderFeed.mo3493a0(true);
        }
    }

    /* renamed from: a */
    public boolean mo3291a(int i, ViewGroup viewGroup, float f, float f2) {
        C87412m.m108594g(viewGroup, "parent");
        if (!this.f17507V) {
            return false;
        }
        if (this.f17500R0.isEmpty()) {
            getSeekBar().getGlobalVisibleRect(this.f17500R0);
        }
        Rect rect = this.f17500R0;
        int i2 = rect.top;
        int i3 = this.f17504T0;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (rect.bottom + i3)) && f >= ((float) rect.left) && f <= ((float) rect.right);
    }

    /* renamed from: b */
    public void mo4239b(float f) {
    }

    /* renamed from: d */
    public boolean mo4240d() {
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!mo4275s(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r3 = (r3 = r3.mo3513o()).getFeedObject();
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0691  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4242e(java.lang.String r27, boolean r28) {
        /*
            r26 = this;
            r6 = r26
            r0 = r27
            java.lang.String r1 = "source"
            gy3.C87412m.m108594g(r0, r1)
            boolean r1 = r6.f17507V
            if (r1 == 0) goto L_0x0013
            boolean r1 = r6.f17492K
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            r1 = 1
            r6.f17507V = r1
            r2 = 0
            r6.setPlayingStatus(r2)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r6.f17495N
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            if (r3 == 0) goto L_0x0035
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            if (r3 == 0) goto L_0x0035
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            if (r3 == 0) goto L_0x0035
            er1.w3 r5 = er1.C58784w3.f168295a
            boolean r3 = r5.mo83857B(r3)
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r6.f17495N
            if (r5 == 0) goto L_0x0048
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            if (r5 == 0) goto L_0x0048
            boolean r5 = r5.isLongVideo()
            if (r5 != r1) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r7 = 8
            if (r5 == 0) goto L_0x0143
            android.widget.TextView r5 = r26.getAllTimeTv()
            r5.setVisibility(r7)
            android.view.View r5 = r26.getLongVideoLayout()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r15.mo10233c(r4)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r5
            r1 = r15
            r15 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r10 = "showSeekLayout"
            java.lang.String r11 = "(ZZLjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r26.getVideoMsgLayout()
            if (r1 != 0) goto L_0x00a0
            goto L_0x00e1
        L_0x00a0:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r8)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x00e1:
            android.view.View r1 = r26.getPlayCtrlBtn()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r6.f17495N
            if (r5 == 0) goto L_0x00f8
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            if (r5 == 0) goto L_0x00f8
            boolean r5 = r5.isPostFinish()
            r8 = 1
            if (r5 != r8) goto L_0x00f8
            r5 = 1
            goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            if (r5 == 0) goto L_0x00ff
            if (r3 != 0) goto L_0x00ff
            r3 = 0
            goto L_0x0101
        L_0x00ff:
            r3 = 8
        L_0x0101:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.mo10233c(r3)
            java.lang.Object[] r9 = r5.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r5.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r10 = "showSeekLayout"
            java.lang.String r11 = "(ZZLjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0218
        L_0x0143:
            android.view.View r1 = r26.getLongVideoLayout()
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r5)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r1 = r26.getVideoMsgLayout()
            if (r1 != 0) goto L_0x0191
            goto L_0x01cd
        L_0x0191:
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r4)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r10 = "showSeekLayout"
            java.lang.String r11 = "(ZZLjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x01cd:
            android.widget.TextView r1 = r26.getAllTimeTv()
            r1.setVisibility(r2)
            android.view.View r1 = r26.getPlayCtrlBtn()
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r5)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r10 = "showSeekLayout"
            java.lang.String r11 = "(ZZLjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x0218:
            r6.mo4299y(r2)
            android.view.View r1 = r26.getBulletBtn()
            int r1 = r1.getVisibility()
            r3 = 0
            if (r1 == 0) goto L_0x027e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r6.f17495N
            boolean r5 = r1 instanceof cm1.C55018j0
            if (r5 == 0) goto L_0x022f
            cm1.j0 r1 = (cm1.C55018j0) r1
            goto L_0x0230
        L_0x022f:
            r1 = r3
        L_0x0230:
            if (r1 == 0) goto L_0x023b
            boolean r1 = r1.mo76076p0()
            r5 = 1
            if (r1 != r5) goto L_0x023b
            r8 = 1
            goto L_0x023c
        L_0x023b:
            r8 = 0
        L_0x023c:
            if (r8 == 0) goto L_0x027e
            android.view.View r1 = r26.getBulletBtn()
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "showSeekLayout"
            java.lang.String r13 = "(ZZLjava/lang/String;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x027e:
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r5 = r26.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108593f(r5, r8)
            bl3.r$a r1 = r1.mo62443b(r5)
            java.lang.Class<rs1.y3> r5 = rs1.C13539y3.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r5)
            rs1.y3 r1 = (rs1.C13539y3) r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r6.f17495N
            if (r5 == 0) goto L_0x029e
            long r8 = r5.getItemId()
            goto L_0x02a0
        L_0x029e:
            r8 = 0
        L_0x02a0:
            jq3.o r1 = r1.f38397j
            if (r1 == 0) goto L_0x02b4
            java.lang.Object r1 = r1.f173503E
            cm1.i2 r1 = (cm1.C0740i2) r1
            if (r1 == 0) goto L_0x02b4
            long r10 = r1.getItemId()
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x02b4
            r8 = 1
            goto L_0x02b5
        L_0x02b4:
            r8 = 0
        L_0x02b5:
            if (r8 == 0) goto L_0x033a
            android.view.View r1 = r26.getLongVideoOrientationTurnBtn()
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "showSeekLayout"
            java.lang.String r13 = "(ZZLjava/lang/String;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r1 = r26.getVideoOrientationTurnBtn()
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03c3
        L_0x033a:
            android.view.View r1 = r26.getLongVideoOrientationTurnBtn()
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r8)
            java.lang.Object[] r9 = r5.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "showSeekLayout"
            java.lang.String r12 = "(ZZLjava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r10 = "showSeekLayout"
            java.lang.String r11 = "(ZZLjava/lang/String;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r26.getVideoOrientationTurnBtn()
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r7)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x03c3:
            android.view.ViewGroup r1 = r26.getSeekLayout()
            r5 = 2131310759(0x7f0938a7, float:1.823984E38)
            android.view.View r1 = r1.findViewById(r5)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r5 = r1.getChildCount()
            r7 = 0
        L_0x03d5:
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r10 = 130(0x82, double:6.4E-322)
            if (r7 >= r5) goto L_0x04c4
            android.view.View r12 = r1.getChildAt(r7)
            int r13 = r12.getId()
            r14 = 2131305996(0x7f09260c, float:1.8230179E38)
            if (r13 == r14) goto L_0x04c0
            int r13 = r12.getId()
            r14 = 2131305291(0x7f09234b, float:1.8228749E38)
            if (r13 == r14) goto L_0x04c0
            int r13 = r12.getId()
            r14 = 2131305312(0x7f092360, float:1.8228791E38)
            if (r13 == r14) goto L_0x04c0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = r6.f17495N
            if (r13 == 0) goto L_0x040d
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            if (r13 == 0) goto L_0x040d
            boolean r13 = r13.isLongVideo()
            if (r13 != 0) goto L_0x040d
            r13 = 1
            goto L_0x040e
        L_0x040d:
            r13 = 0
        L_0x040e:
            if (r13 != 0) goto L_0x041e
            int r13 = r12.getId()
            android.widget.TextView r14 = r26.getAllTimeTv()
            int r14 = r14.getId()
            if (r13 == r14) goto L_0x04c0
        L_0x041e:
            int r13 = r12.getVisibility()
            if (r13 == 0) goto L_0x04c0
            android.view.ViewPropertyAnimator r13 = r12.animate()
            if (r13 == 0) goto L_0x042d
            r13.cancel()
        L_0x042d:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r13.mo10233c(r4)
            java.lang.Object[] r19 = r13.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r12
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r13 = r13.mo10231a(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13.mo10233c(r9)
            java.lang.Object[] r19 = r13.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setAlpha"
            java.lang.String r25 = "(F)V"
            r18 = r12
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r9 = r13.mo10231a(r2)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r12.setAlpha(r9)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setAlpha"
            java.lang.String r24 = "(F)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.ViewPropertyAnimator r9 = r12.animate()
            android.view.ViewPropertyAnimator r8 = r9.alpha(r8)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r10)
            android.view.ViewPropertyAnimator r8 = r8.setListener(r3)
            r8.start()
        L_0x04c0:
            int r7 = r7 + 1
            goto L_0x03d5
        L_0x04c4:
            android.widget.TextView r1 = r26.getAllTimeTv()
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0500
            android.widget.TextView r1 = r26.getAllTimeTv()
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x04db
            r1.cancel()
        L_0x04db:
            android.widget.TextView r1 = r26.getAllTimeTv()
            r1.setVisibility(r2)
            android.widget.TextView r1 = r26.getAllTimeTv()
            r1.setAlpha(r9)
            android.widget.TextView r1 = r26.getAllTimeTv()
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r8)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r10)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r3)
            r1.start()
        L_0x0500:
            if (r28 != 0) goto L_0x0504
            goto L_0x0714
        L_0x0504:
            android.view.ViewGroup r1 = r26.getSeekLayout()
            r3 = 2131310757(0x7f0938a5, float:1.8239835E38)
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x05b6
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x05b6
            android.view.ViewPropertyAnimator r3 = r1.animate()
            if (r3 == 0) goto L_0x0520
            r3.cancel()
        L_0x0520:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r3.mo10233c(r4)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Float r4 = java.lang.Float.valueOf(r9)
            r3.mo10233c(r4)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r21 = "showSeekLayout"
            java.lang.String r22 = "(ZZLjava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setAlpha"
            java.lang.String r25 = "(F)V"
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r20 = "showSeekLayout"
            java.lang.String r21 = "(ZZLjava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setAlpha"
            java.lang.String r24 = "(F)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r8)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r10)
            gr1.h0 r3 = new gr1.h0
            r3.<init>(r6)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r3)
            r1.start()
        L_0x05b6:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r6.f17495N
            if (r1 == 0) goto L_0x0603
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x0603
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x0603
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99208J7
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x05fa
            vq1.w r3 = vq1.C65866w.f189407h
            rx3.l r1 = r3.mo89908g(r1)
            A r3 = r1.f38555d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            B r1 = r1.f38556e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r3 == 0) goto L_0x05f5
            if (r1 == 0) goto L_0x05f5
            r8 = 1
            goto L_0x05f6
        L_0x05f5:
            r8 = 0
        L_0x05f6:
            r6.mo4233B(r8)
            goto L_0x0603
        L_0x05fa:
            vq1.g r3 = vq1.C65854g.f189373e
            boolean r1 = r3.mo89893c(r1)
            r6.mo4234C(r1)
        L_0x0603:
            fy3.a<java.lang.Boolean> r1 = r6.f17513h
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0615
            boolean r1 = r6.f17530y0
            if (r1 == 0) goto L_0x0628
        L_0x0615:
            r6.f17486E = r2
            fy3.a<java.lang.Boolean> r1 = r6.f17512g
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0628
            r26.mo4235D()
        L_0x0628:
            java.lang.String r1 = "bulletClick"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0714
            boolean r0 = r6.f17496P
            if (r0 != 0) goto L_0x0714
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r6.f17495N
            if (r0 == 0) goto L_0x0641
            boolean r0 = r0.mo3479M()
            r8 = 1
            if (r0 != r8) goto L_0x0642
            r0 = 1
            goto L_0x0643
        L_0x0641:
            r8 = 1
        L_0x0642:
            r0 = 0
        L_0x0643:
            if (r0 != 0) goto L_0x0714
            boolean r0 = r6.f17497Q
            if (r0 == 0) goto L_0x064b
            goto L_0x0714
        L_0x064b:
            boolean r0 = r6.f17494M
            if (r0 == 0) goto L_0x0651
            goto L_0x0714
        L_0x0651:
            android.view.View r0 = r26.getAwesomePrivateLayout()
            if (r0 == 0) goto L_0x065f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x065f
            r0 = 1
            goto L_0x0660
        L_0x065f:
            r0 = 0
        L_0x0660:
            if (r0 != 0) goto L_0x0664
            goto L_0x0714
        L_0x0664:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FEED_GROUP_LIKE_GUIDE_INT
            int r5 = r0.mo119689j(r1, r2)
            r0 = 3
            if (r5 >= r0) goto L_0x0714
            android.view.ViewParent r0 = r26.getParent()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r0, r1)
            r4 = r0
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0 = 2131302831(0x7f0919af, float:1.822376E38)
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x068c
            r1 = 1
            goto L_0x068d
        L_0x068c:
            r1 = 0
        L_0x068d:
            if (r1 == 0) goto L_0x0691
            goto L_0x0714
        L_0x0691:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.content.Context r0 = r26.getContext()
            android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
            r1 = 2131494699(0x7f0c072b, float:1.8612914E38)
            android.view.View r7 = r0.inflate(r1, r4, r2)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            r0.mo10233c(r1)
            java.lang.Object[] r11 = r0.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r13 = "checkShowGroupLikeTips"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r10 = r7
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7.setAlpha(r0)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "checkShowGroupLikeTips"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setAlpha"
            java.lang.String r16 = "(F)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            r4.addView(r7)
            r0 = 2131305755(0x7f09251b, float:1.822969E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0705
            android.content.Context r1 = r26.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r8 = 2131165261(0x7f07004d, float:1.7944734E38)
            float r1 = r1.getDimension(r8)
            r0.setTextSize(r2, r1)
        L_0x0705:
            gr1.k r8 = new gr1.k
            r0 = r8
            r1 = r26
            r2 = r3
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 600(0x258, double:2.964E-321)
            r7.postDelayed(r8, r0)
        L_0x0714:
            android.widget.SeekBar r0 = r26.getSeekBar()
            int r0 = r0.getProgress()
            r6.f17516n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout.mo4242e(java.lang.String, boolean):void");
    }

    /* renamed from: g */
    public void mo4243g(float f, long j, long j2) {
        setProgress(C60641c.m70921b(f * ((float) getSeekBar().getMax())));
    }

    public final C32224a<C13598b0> getAdjustPositionCallback() {
        return this.f17515j;
    }

    public final View getBulletBtn() {
        Object value = this.f17483B.getValue();
        C87412m.m108593f(value, "<get-bulletBtn>(...)");
        return (View) value;
    }

    public int getCurrentProgress() {
        return getSeekBar().getProgress();
    }

    public final WeImageView getFloatPlayIcon() {
        return this.f17490I;
    }

    public final boolean getHidePrivateLike() {
        return this.f17497Q;
    }

    public final C34379c<?> getHideSeekbarTask() {
        return this.f17508W;
    }

    public final int getLastProgress() {
        return this.f17516n;
    }

    public int getMaxProgress() {
        return getSeekBar().getMax();
    }

    public final C32224a<C13598b0> getOnLongVideoBtnClickListener() {
        return this.f17514i;
    }

    public final C32224a<Boolean> getOnPauseClickListener() {
        return this.f17512g;
    }

    public final C32224a<Boolean> getOnPrivateLikeClickListener() {
        return this.f17511f;
    }

    public final C32224a<C13598b0> getOnResumePlayListener() {
        return this.f17510e;
    }

    public final View getPlayCtrlBtn() {
        Object value = this.f17529y.getValue();
        C87412m.m108593f(value, "<get-playCtrlBtn>(...)");
        return (View) value;
    }

    public final ViewGroup getSeekLayout() {
        Object value = this.f17518p.getValue();
        C87412m.m108593f(value, "<get-seekLayout>(...)");
        return (ViewGroup) value;
    }

    /* renamed from: h */
    public void mo4258h(int i, int i2) {
        Log.m105924i("Finder.FullSeekBarLayout", "showAutoSeekHint: playTime = " + i + ", durationSec = " + i2);
        this.f17528x0 = i2;
        if (i2 > 0 && getAutoSeekHint().getVisibility() != 0) {
            setProgress(C60641c.m70921b((((float) i) / ((float) this.f17528x0)) * ((float) getSeekBar().getMax())));
            BaseFinderFeed baseFinderFeed = this.f17495N;
            C55018j0 j0Var = baseFinderFeed instanceof C55018j0 ? (C55018j0) baseFinderFeed : null;
            if (j0Var != null) {
                j0Var.f154481f = true;
            }
        }
    }

    /* renamed from: i */
    public void mo4259i(String str) {
        int i;
        C59667n2.C8416b bVar;
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f17519p0 = -1;
        this.f17502S0 = false;
        if (this.f17507V) {
            if (!C87412m.m108589b(str, "exitBulletInput")) {
                C39818r rVar = C39818r.f106831a;
                Context context = getContext();
                C87412m.m108593f(context, "context");
                if (((C63513a1) rVar.mo62443b(context).mo75002a(C63513a1.class)).mo88377m3()) {
                    return;
                }
            }
            Log.m105924i("Finder.FullSeekBarLayout", "[exitSeekMode] reason=" + str);
            this.f17507V = false;
            boolean z = true;
            m4087z(this, !C87412m.m108589b(str, "exitBulletInput") && !C87412m.m108589b(str, "horizontalVideoAnimClose"), 0, false, 6, (Object) null);
            if (C87412m.m108589b(str, "exitBulletInput") || C87412m.m108589b(str, "horizontalVideoAnimClose")) {
                z = false;
            }
            mo4298x(false, z);
            getSeekLayout().setClickable(false);
            this.f17492K = false;
            if (C112551y.m153819s(str, "onSingleTapUp", false) && (i = this.f17516n) != -1 && Math.abs(i - getSeekBar().getProgress()) > 5 && (bVar = this.f17505U) != null) {
                bVar.mo9354c(getSeekPercent());
            }
            this.f17516n = -1;
        }
    }

    /* renamed from: j */
    public boolean mo4260j() {
        return this.f17491J;
    }

    /* renamed from: k */
    public boolean mo4261k() {
        BaseFinderFeed baseFinderFeed = this.f17495N;
        C55018j0 j0Var = baseFinderFeed instanceof C55018j0 ? (C55018j0) baseFinderFeed : null;
        if (j0Var == null) {
            Log.m105920e("Finder.FullSeekBarLayout", "enableAutoSeek: feed is null");
            return false;
        } else if (!j0Var.f154481f || getAutoSeekHint().getVisibility() == 0) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("enableAutoSeek: has been auto seek, feedId = ");
            BaseFinderFeed baseFinderFeed2 = this.f17495N;
            sb.append(C61926c.m72691p(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0));
            Log.m105924i("Finder.FullSeekBarLayout", sb.toString());
            return false;
        }
    }

    /* renamed from: l */
    public void mo4262l(boolean z) {
    }

    /* renamed from: m */
    public void mo4263m(float f, int i, int i2) {
        this.f17528x0 = i2;
        if (i <= 1) {
            this.f17519p0 = -1;
        }
        mo4238H(i, i2);
        getCurrentTimeTv().setText(mo4296v(i));
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C13282j2 j2Var = (C13282j2) rVar.mo62443b(context).mo62449e(C13282j2.class);
        if (j2Var != null) {
            j2Var.f37704n.put(Long.valueOf(j2Var.f37700g), Integer.valueOf(i));
        }
    }

    /* renamed from: n */
    public boolean mo4264n() {
        return this.f17507V;
    }

    /* renamed from: o */
    public void mo4265o() {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAllTimeLongTv().setTextSize(1, 14.0f);
        getAllTimeTv().setTextSize(1, 14.0f);
        getCurrentTimeTv().setTextSize(1, 14.0f);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4295t();
        if (this.f17492K) {
            C34379c<?> cVar = this.f17508W;
            if (cVar != null) {
                cVar.cancel(false);
            }
            mo4259i("hideSeekbarTask");
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f17502S0 || super.onInterceptTouchEvent(motionEvent);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C87412m.m108594g(seekBar, "seekBar");
        if (z) {
            float f = (float) this.f17528x0;
            getCurrentTimeTv().setText(mo4296v((int) C16095a.m14979a((((float) getSeekBar().getProgress()) / ((float) getSeekBar().getMax())) * f, 0.0f, f - 1.0f)));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C87412m.m108594g(seekBar, "seekBar");
        this.f17491J = true;
        C59667n2.C8416b bVar = this.f17505U;
        if (bVar != null) {
            bVar.mo9353a();
        }
        C34379c<?> cVar = this.f17508W;
        if (cVar != null) {
            cVar.cancel(false);
        }
        mo4295t();
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C87412m.m108594g(seekBar, "seekBar");
        this.f17491J = false;
        this.f17519p0 = seekBar.getProgress();
        this.f17492K = true;
        C59667n2.C8416b bVar = this.f17505U;
        if (bVar != null) {
            bVar.mo9354c(getSeekPercent());
        }
        this.f17516n = -1;
        this.f17510e.invoke();
        WeImageView weImageView = this.f17490I;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        C34379c<?> cVar = this.f17508W;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C119179t tVar = C119157j.f356862d;
        C3901e eVar = new C3901e(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f17508W = jVar.mo183892w(eVar, 3000, false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f17506U0.onTouch(this, motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void onVideoEnded() {
    }

    /* renamed from: q */
    public final void mo4274q(View view, long j, boolean z, boolean z2) {
        if (z) {
            view.animate().alpha(0.0f).setDuration(j).setListener(new C3897a(view, z2)).start();
            return;
        }
        int i = z2 ? 8 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "animDisappearView", "(Landroid/view/View;JZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "animDisappearView", "(Landroid/view/View;JZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(1.0f));
        View view3 = view;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "animDisappearView", "(Landroid/view/View;JZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "animDisappearView", "(Landroid/view/View;JZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: s */
    public final boolean mo4275s(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || !this.f17507V) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            getSeekBar().getGlobalVisibleRect(this.f17500R0);
        }
        if (!this.f17502S0 && motionEvent.getAction() == 0 && motionEvent.getRawY() >= ((float) (this.f17500R0.top - this.f17504T0)) && motionEvent.getRawY() <= ((float) (this.f17500R0.bottom + this.f17504T0)) && motionEvent.getRawX() >= ((float) this.f17500R0.left) && motionEvent.getRawX() <= ((float) this.f17500R0.right)) {
            this.f17502S0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return this.f17502S0;
    }

    public final void setAdjustPositionCallback(C32224a<C13598b0> aVar) {
        this.f17515j = aVar;
    }

    public final void setExcludeIDs(Set<Integer> set) {
        C87412m.m108594g(set, "set");
        this.f17498Q0.addAll(set);
    }

    public final void setFakeFloatPlayIcon(WeImageView weImageView) {
        this.f17493L = weImageView;
    }

    public final void setFloatPlayIcon(WeImageView weImageView) {
        this.f17490I = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(new C3905i(this));
        }
    }

    public final void setHidePrivateLike(boolean z) {
        this.f17497Q = z;
    }

    public final void setHideSeekbarTask(C34379c<?> cVar) {
        this.f17508W = cVar;
    }

    public final void setLastProgress(int i) {
        this.f17516n = i;
    }

    public final void setOnLongVideoBtnClickListener(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17514i = aVar;
    }

    public final void setOnPauseClickListener(C32224a<Boolean> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17512g = aVar;
    }

    public final void setOnPrivateLikeClickListener(C32224a<Boolean> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17511f = aVar;
    }

    public final void setOnResumePlayListener(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17510e = aVar;
    }

    public final void setPendingExitMode(boolean z) {
        this.f17492K = z;
    }

    public final void setPlayIconState(boolean z) {
        if (!this.f17517o) {
            WeImageView weImageView = this.f17493L;
            if (weImageView != null) {
                mo4237F(weImageView, z);
            } else {
                mo4237F(this.f17490I, z);
            }
        }
    }

    public final void setPlayingCallback(C32224a<Boolean> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17513h = aVar;
    }

    public final void setPlayingStatus(boolean z) {
        this.f17499R = z;
        if (!z) {
            WeImageView pauseIcon = getPauseIcon();
            if (pauseIcon != null) {
                pauseIcon.setImageDrawable(this.f17501S);
            }
            setPlayIconState(true);
            mo4298x(true, true);
            return;
        }
        WeImageView pauseIcon2 = getPauseIcon();
        if (pauseIcon2 != null) {
            pauseIcon2.setImageDrawable(this.f17503T);
        }
        setPlayIconState(false);
        mo4298x(false, true);
    }

    public void setProgress(int i) {
        if (i <= 1) {
            this.f17519p0 = -1;
        }
        getSeekBar().setProgress(Math.max(this.f17519p0, i));
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
    }

    public void setSeekBarCallback(C59667n2.C8416b bVar) {
        C87412m.m108594g(bVar, "callback");
        this.f17505U = bVar;
    }

    public final void setShareGuidePause(boolean z) {
        this.f17517o = z;
    }

    /* renamed from: t */
    public final void mo4295t() {
        View findViewById;
        Log.m105924i("Finder.FullSeekBarLayout", "[dismissGroupLikeTips]");
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(C0966R.C0970id.d98)) != null) {
            findViewById.post(new C3898b(findViewById, viewGroup));
        }
    }

    /* renamed from: v */
    public final String mo4296v(int i) {
        long j = (long) i;
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: w */
    public final void mo4297w() {
        View autoSeekHint = getAutoSeekHint();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(autoSeekHint, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideAutoSeekHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        autoSeekHint.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(autoSeekHint, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideAutoSeekHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r1 = (r1 = r1.mo3513o()).getFeedObject();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4298x(boolean r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.f17517o
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f17495N
            r2 = 0
            if (r1 == 0) goto L_0x001f
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x001f
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x001f
            er1.w3 r3 = er1.C58784w3.f168295a
            boolean r1 = r3.mo83942k(r1)
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f17495N
            r4 = 1
            if (r3 == 0) goto L_0x002d
            boolean r3 = r3.mo3479M()
            if (r3 != r4) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 != 0) goto L_0x033d
            boolean r3 = r0.f17496P
            if (r3 != 0) goto L_0x033d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f17495N
            if (r3 == 0) goto L_0x0046
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            if (r3 == 0) goto L_0x0046
            boolean r3 = r3.isPostFinish()
            if (r3 != r4) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x033d
            boolean r3 = r0.f17497Q
            if (r3 != 0) goto L_0x033d
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99559x6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == 0) goto L_0x033d
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_INT_SYNC
            int r3 = r3.mo119689j(r6, r2)
            if (r3 <= 0) goto L_0x0072
            r3 = 1
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_ANIMATE_INT_SYNC
            int r6 = r6.mo119689j(r7, r2)
            if (r6 <= 0) goto L_0x0085
            r6 = 1
            goto L_0x0086
        L_0x0085:
            r6 = 0
        L_0x0086:
            if (r3 != 0) goto L_0x008c
            if (r6 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r4 != 0) goto L_0x033d
            if (r1 != 0) goto L_0x0092
            goto L_0x033d
        L_0x0092:
            android.view.ViewParent r1 = r18.getParent()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r1, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 2131306267(0x7f09271b, float:1.8230728E38)
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x012b
            if (r19 == 0) goto L_0x00eb
            r3 = 8
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r3)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r9 = "hideAwesomePrivateLayout"
            java.lang.String r10 = "(ZZ)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r4.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r8 = "hideAwesomePrivateLayout"
            java.lang.String r9 = "(ZZ)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x012b
        L_0x00eb:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r4)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r9 = "hideAwesomePrivateLayout"
            java.lang.String r10 = "(ZZ)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r8 = "hideAwesomePrivateLayout"
            java.lang.String r9 = "(ZZ)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x012b:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            r3 = 0
            if (r1 == 0) goto L_0x0137
            java.lang.Object r1 = r1.getTag()
            goto L_0x0138
        L_0x0137:
            r1 = r3
        L_0x0138:
            r6 = 200(0xc8, double:9.9E-322)
            r4 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r19 == 0) goto L_0x025e
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r1, r9)
            if (r10 != 0) goto L_0x025e
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 == 0) goto L_0x0156
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x0156
            r1.cancel()
        L_0x0156:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x015d
            goto L_0x019d
        L_0x015d:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r5.mo10233c(r10)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r13 = "hideAwesomePrivateLayout"
            java.lang.String r14 = "(ZZ)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "hideAwesomePrivateLayout"
            java.lang.String r13 = "(ZZ)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x019d:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x01a4
            goto L_0x01a7
        L_0x01a4:
            r1.setTag(r9)
        L_0x01a7:
            if (r20 == 0) goto L_0x0213
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x01b0
            goto L_0x01f0
        L_0x01b0:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5.mo10233c(r4)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r13 = "hideAwesomePrivateLayout"
            java.lang.String r14 = "(ZZ)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r5.mo10231a(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "hideAwesomePrivateLayout"
            java.lang.String r13 = "(ZZ)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setAlpha"
            java.lang.String r16 = "(F)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x01f0:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.alpha(r8)
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r6)
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.setListener(r3)
            if (r1 == 0) goto L_0x033c
            r1.start()
            goto L_0x033c
        L_0x0213:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x021b
            goto L_0x033c
        L_0x021b:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r6 = "hideAwesomePrivateLayout"
            java.lang.String r7 = "(ZZ)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r11.mo10231a(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r4 = "hideAwesomePrivateLayout"
            java.lang.String r5 = "(ZZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x033c
        L_0x025e:
            if (r19 != 0) goto L_0x033c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x033c
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 == 0) goto L_0x0277
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x0277
            r1.cancel()
        L_0x0277:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x027e
            goto L_0x02c0
        L_0x027e:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r15.mo10233c(r8)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r12 = "hideAwesomePrivateLayout"
            java.lang.String r13 = "(ZZ)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r16 = "(F)V"
            r9 = r1
            r5 = r15
            r15 = r8
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r2)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r1.setAlpha(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r11 = "hideAwesomePrivateLayout"
            java.lang.String r12 = "(ZZ)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r15 = "(F)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x02c0:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x02c7
            goto L_0x02ca
        L_0x02c7:
            r1.setTag(r3)
        L_0x02ca:
            if (r20 == 0) goto L_0x02f3
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.alpha(r4)
            if (r1 == 0) goto L_0x033c
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r6)
            if (r1 == 0) goto L_0x033c
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$c r2 = new com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout$c
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            if (r1 == 0) goto L_0x033c
            r1.start()
            goto L_0x033c
        L_0x02f3:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x02fa
            goto L_0x033c
        L_0x02fa:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r6 = "hideAwesomePrivateLayout"
            java.lang.String r7 = "(ZZ)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r11.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r4 = "hideAwesomePrivateLayout"
            java.lang.String r5 = "(ZZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x033c:
            return
        L_0x033d:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 == 0) goto L_0x034c
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x034c
            r1.cancel()
        L_0x034c:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x0353
            goto L_0x0358
        L_0x0353:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.setTag(r3)
        L_0x0358:
            android.view.View r1 = r18.getAwesomePrivateLayout()
            if (r1 != 0) goto L_0x035f
            goto L_0x03a0
        L_0x035f:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r4)
            java.lang.Object[] r5 = r3.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r7 = "hideAwesomePrivateLayout"
            java.lang.String r8 = "(ZZ)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout"
            java.lang.String r6 = "hideAwesomePrivateLayout"
            java.lang.String r7 = "(ZZ)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x03a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout.mo4298x(boolean, boolean):void");
    }

    /* renamed from: y */
    public final void mo4299y(boolean z) {
        if (z) {
            View horizontalHint = getHorizontalHint();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view = horizontalHint;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideHorizontalHint", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            horizontalHint.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideHorizontalHint", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            getHorizontalHint().animate().alpha(0.0f).setDuration(300).setListener(new C3900d(this)).start();
            return;
        }
        getHorizontalHint().animate().cancel();
        getHorizontalHint().removeCallbacks(this.f17482A);
        View horizontalHint2 = getHorizontalHint();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = horizontalHint2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideHorizontalHint", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        horizontalHint2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout", "hideHorizontalHint", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFullSeekBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
