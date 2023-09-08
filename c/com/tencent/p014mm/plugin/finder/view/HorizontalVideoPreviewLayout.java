package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import dp1.C7435f2;
import er1.C7919x;
import fy3.C32224a;
import gr1.C59667n2;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import o40.C61926c;
import org.json.JSONObject;
import os1.C62168u;
import p282z2.C16095a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sn0.C90259e;
import sx3.C90364q0;
import te3.C49712hj1;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010<\u001a\u00020;\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@B#\b\u0016\u0012\u0006\u0010<\u001a\u00020;\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\u0006\u0010A\u001a\u00020\u0017¢\u0006\u0004\b?\u0010BR\u001a\u0010\b\u001a\u00020\u00038\u0004X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0004X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u00018\u0004X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0004X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00178\u0004X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010\"\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0007R\u001b\u0010'\u001a\u00020#8FX\u0002¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020#8FX\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010&R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\u001b¨\u0006C"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/View;", "d", "Landroid/view/View;", "getBgView", "()Landroid/view/View;", "bgView", "e", "getFgView", "fgView", "f", "Landroid/widget/FrameLayout;", "getIconLayout", "()Landroid/widget/FrameLayout;", "iconLayout", "Lcom/tencent/mm/plugin/finder/view/HorizontalVideoSeekBarLayout;", "g", "Lrx3/g;", "getLongVideoSeekBarLayout", "()Lcom/tencent/mm/plugin/finder/view/HorizontalVideoSeekBarLayout;", "longVideoSeekBarLayout", "", "h", "I", "getRealScreenHeight", "()I", "realScreenHeight", "i", "getRealScreenWidth", "realScreenWidth", "j", "getSeekTimeLayout", "seekTimeLayout", "Landroid/widget/TextView;", "n", "getCurrentTimeTv", "()Landroid/widget/TextView;", "currentTimeTv", "o", "getTotalTimeTv", "totalTimeTv", "Lgr1/n2;", "p", "Lgr1/n2;", "getFullSeekBar", "()Lgr1/n2;", "setFullSeekBar", "(Lgr1/n2;)V", "fullSeekBar", "", "s", "getEnableLongPressSpeedPlay", "()Z", "enableLongPressSpeedPlay", "w", "getTouchSlop", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout */
public abstract class HorizontalVideoPreviewLayout extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public final View f18000d;

    /* renamed from: e */
    public final View f18001e;

    /* renamed from: f */
    public final FrameLayout f18002f;

    /* renamed from: g */
    public final C13601g f18003g = C36568h.m40985a(new C3996c(this));

    /* renamed from: h */
    public final int f18004h;

    /* renamed from: i */
    public final int f18005i;

    /* renamed from: j */
    public final C13601g f18006j = C36568h.m40985a(new C3997d(this));

    /* renamed from: n */
    public final C13601g f18007n = C36568h.m40985a(new C3994a(this));

    /* renamed from: o */
    public final C13601g f18008o = C36568h.m40985a(new C3998e(this));

    /* renamed from: p */
    public C59667n2 f18009p;

    /* renamed from: q */
    public final GestureDetector f18010q;

    /* renamed from: r */
    public boolean f18011r;

    /* renamed from: s */
    public final C13601g f18012s = C36568h.m40985a(C3995b.f18020d);

    /* renamed from: t */
    public int f18013t;

    /* renamed from: u */
    public int f18014u;

    /* renamed from: v */
    public boolean f18015v;

    /* renamed from: w */
    public final C13601g f18016w;

    /* renamed from: x */
    public int f18017x;

    /* renamed from: y */
    public int f18018y;

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout$a */
    public static final class C3994a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoPreviewLayout f18019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3994a(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
            super(0);
            this.f18019d = horizontalVideoPreviewLayout;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f18019d.getSeekTimeLayout().findViewById(C0966R.C0970id.bxs);
            C87412m.m108593f(textView, "this");
            C7919x.m8091a(textView);
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout$b */
    public static final class C3995b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C3995b f18020d = new C3995b();

        public C3995b() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = true;
            if (C37521f.f99378d4.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout$c */
    public static final class C3996c extends C87413o implements C32224a<HorizontalVideoSeekBarLayout> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoPreviewLayout f18021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3996c(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
            super(0);
            this.f18021d = horizontalVideoPreviewLayout;
        }

        public Object invoke() {
            Context context = this.f18021d.getContext();
            C87412m.m108593f(context, "context");
            return new HorizontalVideoSeekBarLayout(context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout$d */
    public static final class C3997d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoPreviewLayout f18022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3997d(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
            super(0);
            this.f18022d = horizontalVideoPreviewLayout;
        }

        public Object invoke() {
            return View.inflate(this.f18022d.getContext(), C0966R.C0971layout.ad5, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout$e */
    public static final class C3998e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoPreviewLayout f18023d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3998e(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
            super(0);
            this.f18023d = horizontalVideoPreviewLayout;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f18023d.getSeekTimeLayout().findViewById(C0966R.C0970id.ksz);
            C87412m.m108593f(textView, "this");
            C7919x.m8091a(textView);
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout$f */
    public static final class C3999f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ HorizontalVideoPreviewLayout f18024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3999f(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout) {
            super(0);
            this.f18024d = horizontalVideoPreviewLayout;
        }

        public Object invoke() {
            return Integer.valueOf(ViewConfiguration.get(this.f18024d.getContext()).getScaledTouchSlop());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalVideoPreviewLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View view = new View(getContext());
        view.setBackgroundColor(-16777216);
        this.f18000d = view;
        View view2 = new View(getContext());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setBackgroundColor(view2.getResources().getColor(C0966R.color.f3576y9));
        this.f18001e = view2;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18002f = frameLayout;
        setId(C0966R.C0970id.d_f);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        addView(view2, new FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3743cv);
        int dimension2 = (int) getResources().getDimension(C0966R.dimen.f3745cw);
        float f = ((float) dimension2) / 2.0f;
        frameLayout.setPivotX(f);
        frameLayout.setPivotY(f);
        WeImageView weImageView = new WeImageView(getContext());
        weImageView.setImageResource(C0966R.raw.icons_filled_back_left);
        weImageView.setIconColor(-1);
        frameLayout.addView(weImageView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams.setMarginEnd(dimension);
        layoutParams.bottomMargin = dimension;
        layoutParams.gravity = 8388661;
        C13598b0 b0Var = C13598b0.f38549a;
        addView(frameLayout, layoutParams);
        this.f18010q = new GestureDetector(getContext(), this);
        setClickable(true);
        Point b = C75044y4.m89990b(getContext());
        int max = Math.max(b.x, b.y);
        this.f18004h = max;
        this.f18005i = Math.min(b.x, b.y);
        getLongVideoSeekBarLayout().setVisibility(4);
        frameLayout.setVisibility(4);
        HorizontalVideoSeekBarLayout longVideoSeekBarLayout = getLongVideoSeekBarLayout();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(max, -2);
        layoutParams2.gravity = 8388611;
        addView(longVideoSeekBarLayout, layoutParams2);
        View seekTimeLayout = getSeekTimeLayout();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(seekTimeLayout, layoutParams3);
        View seekTimeLayout2 = getSeekTimeLayout();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = seekTimeLayout2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f18016w = C36568h.m40985a(new C3999f(this));
    }

    /* renamed from: b */
    public static final void m4253b(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout, FinderVideoLayout.C56521b bVar, int i, int i2, long j, boolean z) {
        horizontalVideoPreviewLayout.getClass();
        Log.m105924i("HorizontalVideoPreviewLayout", "reportSeek: currentPlaySec=" + i + ", seekTimeSec=" + i2 + ", videoDurationMs=" + j + ", isTouchSeek=" + z + ", feedId=" + C61926c.m72691p(bVar.f161892a.getExpectId()));
        if (i != i2) {
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = horizontalVideoPreviewLayout.getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            Integer num = null;
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[13];
            int i3 = 0;
            lVarArr[0] = new C13604l("view_id", "finder_feed_progress_bar");
            lVarArr[1] = new C13604l("behaviour_session_id", q3 != null ? q3.f134670d : null);
            lVarArr[2] = new C13604l("finder_context_id", q3 != null ? q3.f134671e : null);
            lVarArr[3] = new C13604l("finder_tab_context_id", q3 != null ? q3.f134672f : null);
            if (q3 != null) {
                num = Integer.valueOf(q3.f134675i);
            }
            lVarArr[4] = new C13604l("comment_scene", num);
            lVarArr[5] = new C13604l("feed_id", C61926c.m72691p(bVar.f161892a.getExpectId()));
            if (((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87220d3(bVar.f161892a.getExpectId()) > 0) {
                i3 = 1;
            }
            lVarArr[6] = new C13604l("is_pcr90", Integer.valueOf(i3));
            lVarArr[7] = new C13604l("is_pause", Integer.valueOf(bVar.f161902k ? 1 : 0));
            lVarArr[8] = new C13604l("time_point_before_dpb", Integer.valueOf(i));
            lVarArr[9] = new C13604l("time_point_after_dpb", Integer.valueOf(i2));
            lVarArr[10] = new C13604l("video_duration_time", Long.valueOf(j));
            lVarArr[11] = new C13604l("screen_type", 1);
            lVarArr[12] = new C13604l("is_finger_drag", Integer.valueOf(z ? 1 : 0));
            eVar.mo86168ix("drag_feed_progress_bar", C90364q0.m113147f(lVarArr), 25496);
        }
    }

    private final boolean getEnableLongPressSpeedPlay() {
        return ((Boolean) this.f18012s.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final int getTouchSlop() {
        return ((Number) this.f18016w.getValue()).intValue();
    }

    /* renamed from: i */
    public static /* synthetic */ void m4254i(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            horizontalVideoPreviewLayout.mo4802h(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleCtrlViews");
    }

    /* renamed from: c */
    public final String mo4787c(int i) {
        if (i < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i);
            return sb.toString();
        }
        return i + "";
    }

    /* renamed from: d */
    public abstract void mo4788d(boolean z);

    /* renamed from: e */
    public abstract void mo4789e();

    /* renamed from: f */
    public final void mo4790f(FinderThumbPlayerProxy finderThumbPlayerProxy, int i) {
        C87412m.m108594g(finderThumbPlayerProxy, "videoView");
        int b = C16095a.m14980b(i, 0, finderThumbPlayerProxy.getVideoDuration());
        TextView currentTimeTv = getCurrentTimeTv();
        currentTimeTv.setText(mo4787c(b / 60) + XVFSFile.PATH_SEPARATOR_CHAR + mo4787c(b % 60));
    }

    /* renamed from: g */
    public void mo4791g() {
    }

    public final View getBgView() {
        return this.f18000d;
    }

    public final TextView getCurrentTimeTv() {
        Object value = this.f18007n.getValue();
        C87412m.m108593f(value, "<get-currentTimeTv>(...)");
        return (TextView) value;
    }

    public final View getFgView() {
        return this.f18001e;
    }

    public final C59667n2 getFullSeekBar() {
        return this.f18009p;
    }

    public final FrameLayout getIconLayout() {
        return this.f18002f;
    }

    public final HorizontalVideoSeekBarLayout getLongVideoSeekBarLayout() {
        return (HorizontalVideoSeekBarLayout) this.f18003g.getValue();
    }

    public final int getRealScreenHeight() {
        return this.f18004h;
    }

    public final int getRealScreenWidth() {
        return this.f18005i;
    }

    public final View getSeekTimeLayout() {
        Object value = this.f18006j.getValue();
        C87412m.m108593f(value, "<get-seekTimeLayout>(...)");
        return (View) value;
    }

    public final TextView getTotalTimeTv() {
        Object value = this.f18008o.getValue();
        C87412m.m108593f(value, "<get-totalTimeTv>(...)");
        return (TextView) value;
    }

    /* renamed from: h */
    public void mo4802h(boolean z) {
        int i = 0;
        boolean z2 = z || getLongVideoSeekBarLayout().getVisibility() != 0;
        getLongVideoSeekBarLayout().setVisibility(z2 ? 0 : 4);
        FrameLayout frameLayout = this.f18002f;
        if (!z2) {
            i = 4;
        }
        frameLayout.setVisibility(i);
        if (z2) {
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar.mo12873f(context);
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "transpose_video_card", 1, (JSONObject) null);
        }
    }

    /* renamed from: j */
    public boolean mo4803j(boolean z) {
        boolean z2 = this.f18011r != z;
        this.f18011r = z;
        return z2;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        if (getEnableLongPressSpeedPlay()) {
            mo4803j(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        m4254i(this, false, 1, (Object) null);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public final void setFullSeekBar(C59667n2 n2Var) {
        this.f18009p = n2Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalVideoPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View view = new View(getContext());
        view.setBackgroundColor(-16777216);
        this.f18000d = view;
        View view2 = new View(getContext());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setBackgroundColor(view2.getResources().getColor(C0966R.color.f3576y9));
        this.f18001e = view2;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18002f = frameLayout;
        setId(C0966R.C0970id.d_f);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        addView(view2, new FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3743cv);
        int dimension2 = (int) getResources().getDimension(C0966R.dimen.f3745cw);
        float f = ((float) dimension2) / 2.0f;
        frameLayout.setPivotX(f);
        frameLayout.setPivotY(f);
        WeImageView weImageView = new WeImageView(getContext());
        weImageView.setImageResource(C0966R.raw.icons_filled_back_left);
        weImageView.setIconColor(-1);
        frameLayout.addView(weImageView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams.setMarginEnd(dimension);
        layoutParams.bottomMargin = dimension;
        layoutParams.gravity = 8388661;
        C13598b0 b0Var = C13598b0.f38549a;
        addView(frameLayout, layoutParams);
        this.f18010q = new GestureDetector(getContext(), this);
        setClickable(true);
        Point b = C75044y4.m89990b(getContext());
        int max = Math.max(b.x, b.y);
        this.f18004h = max;
        this.f18005i = Math.min(b.x, b.y);
        getLongVideoSeekBarLayout().setVisibility(4);
        frameLayout.setVisibility(4);
        HorizontalVideoSeekBarLayout longVideoSeekBarLayout = getLongVideoSeekBarLayout();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(max, -2);
        layoutParams2.gravity = 8388611;
        addView(longVideoSeekBarLayout, layoutParams2);
        View seekTimeLayout = getSeekTimeLayout();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(seekTimeLayout, layoutParams3);
        View seekTimeLayout2 = getSeekTimeLayout();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = seekTimeLayout2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f18016w = C36568h.m40985a(new C3999f(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalVideoPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View view = new View(getContext());
        view.setBackgroundColor(-16777216);
        this.f18000d = view;
        View view2 = new View(getContext());
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setBackgroundColor(view2.getResources().getColor(C0966R.color.f3576y9));
        this.f18001e = view2;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18002f = frameLayout;
        setId(C0966R.C0970id.d_f);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        addView(view2, new FrameLayout.LayoutParams(-1, -1));
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3743cv);
        int dimension2 = (int) getResources().getDimension(C0966R.dimen.f3745cw);
        float f = ((float) dimension2) / 2.0f;
        frameLayout.setPivotX(f);
        frameLayout.setPivotY(f);
        WeImageView weImageView = new WeImageView(getContext());
        weImageView.setImageResource(C0966R.raw.icons_filled_back_left);
        weImageView.setIconColor(-1);
        frameLayout.addView(weImageView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams.setMarginEnd(dimension);
        layoutParams.bottomMargin = dimension;
        layoutParams.gravity = 8388661;
        C13598b0 b0Var = C13598b0.f38549a;
        addView(frameLayout, layoutParams);
        this.f18010q = new GestureDetector(getContext(), this);
        setClickable(true);
        Point b = C75044y4.m89990b(getContext());
        int max = Math.max(b.x, b.y);
        this.f18004h = max;
        this.f18005i = Math.min(b.x, b.y);
        getLongVideoSeekBarLayout().setVisibility(4);
        frameLayout.setVisibility(4);
        HorizontalVideoSeekBarLayout longVideoSeekBarLayout = getLongVideoSeekBarLayout();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(max, -2);
        layoutParams2.gravity = 8388611;
        addView(longVideoSeekBarLayout, layoutParams2);
        View seekTimeLayout = getSeekTimeLayout();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(seekTimeLayout, layoutParams3);
        View seekTimeLayout2 = getSeekTimeLayout();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = seekTimeLayout2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f18016w = C36568h.m40985a(new C3999f(this));
    }
}
