package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C98520u2;
import java.util.ArrayList;
import kotlin.Metadata;
import ok1.C62041a;
import ok1.C62042e;
import rx3.C13601g;
import rx3.C36568h;
import y50.C66524m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView;", "Landroid/widget/FrameLayout;", "Lht1/u2;", "", "alpha", "Lrx3/b0;", "setIconAlpha", "scale", "setScale", "", "ms", "setInterval", "getView", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "s", "Lrx3/g;", "getTimeHandler", "()Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "timeHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView */
public final class FinderLiveConfettiView extends FrameLayout implements C98520u2 {

    /* renamed from: d */
    public final String f160063d = "FinderLiveConfettiView";

    /* renamed from: e */
    public final ArrayList<Bitmap> f160064e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<Bitmap> f160065f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<Integer> f160066g = new ArrayList<>();

    /* renamed from: h */
    public C62041a f160067h = new C62041a();

    /* renamed from: i */
    public int f160068i;

    /* renamed from: j */
    public long f160069j;

    /* renamed from: n */
    public int f160070n;

    /* renamed from: o */
    public int f160071o;

    /* renamed from: p */
    public float f160072p;

    /* renamed from: q */
    public float f160073q;

    /* renamed from: r */
    public long f160074r;

    /* renamed from: s */
    public final C13601g f160075s;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView$a */
    public static final class C29971a extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveConfettiView f81140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29971a(FinderLiveConfettiView finderLiveConfettiView) {
            super(0);
            this.f81140d = finderLiveConfettiView;
        }

        public Object invoke() {
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C56144a(this.f81140d), true);
            mTimerHandler.setLogging(false);
            return mTimerHandler;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveConfettiView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C62042e.f176370a.getClass();
        this.f160069j = 500;
        this.f160072p = 1.0f;
        this.f160073q = 1.0f;
        this.f160075s = C36568h.m40985a(new C29971a(this));
    }

    private final MTimerHandler getTimeHandler() {
        return (MTimerHandler) this.f160075s.getValue();
    }

    /* renamed from: a */
    public void mo78227a() {
        getTimeHandler().stopTimer();
        this.f160064e.clear();
        this.f160065f.clear();
        this.f160066g.clear();
        this.f160068i = 0;
        String str = this.f160063d;
        Log.m105924i(str, "[stopAndDestroy]  startTime = " + this.f160074r);
    }

    /* renamed from: b */
    public void mo78228b(ArrayList<Bitmap> arrayList, ArrayList<Integer> arrayList2) {
        C87412m.m108594g(arrayList, "bitmaps");
        C87412m.m108594g(arrayList2, "rates");
        this.f160065f.addAll(arrayList);
        this.f160066g.addAll(arrayList2);
        for (Number intValue : arrayList2) {
            this.f160068i += intValue.intValue();
        }
    }

    /* renamed from: c */
    public void mo78229c(ArrayList<Integer> arrayList) {
        C87412m.m108594g(arrayList, "bitmaps");
        this.f160064e.clear();
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            int i = C66524m.C66525a.f191366a;
            int i2 = (int) (((float) C66524m.C66525a.f191366a) * this.f160072p);
            this.f160064e.add(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getContext().getResources(), intValue2), i2, i2, true));
        }
    }

    /* renamed from: d */
    public void mo78230d(int i, int i2) {
        this.f160070n = i;
        this.f160071o = i2;
    }

    public FrameLayout getView() {
        return this;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo78227a();
    }

    public void setIconAlpha(float f) {
        this.f160073q = f;
    }

    public void setInterval(long j) {
        this.f160069j = j;
    }

    public void setScale(float f) {
        this.f160072p = f;
    }

    public void start() {
        getTimeHandler().stopTimer();
        getTimeHandler().startTimer(this.f160069j);
        this.f160074r = System.currentTimeMillis();
        String str = this.f160063d;
        Log.m105924i(str, "[start]  time = " + this.f160074r);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveConfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        C62042e.f176370a.getClass();
        this.f160069j = 500;
        this.f160072p = 1.0f;
        this.f160073q = 1.0f;
        this.f160075s = C36568h.m40985a(new C29971a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveConfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        C62042e.f176370a.getClass();
        this.f160069j = 500;
        this.f160072p = 1.0f;
        this.f160073q = 1.0f;
        this.f160075s = C36568h.m40985a(new C29971a(this));
    }
}
