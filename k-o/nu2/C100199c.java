package nu2;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co2.C92429f;
import com.tencent.p014mm.plugin.sns.p104ad.widget.dragad.AdDragViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jp2.C98963o;
import nq2.C100151a;
import rq2.C63505q;
import vr2.C102236a0;
import vr2.C102260r;
import yq2.C102898a;

/* renamed from: nu2.c */
public class C100199c extends C100198b {

    /* renamed from: k */
    public AdDragViewContainer f293584k;

    /* renamed from: l */
    public int f293585l;

    /* renamed from: m */
    public int f293586m;

    /* renamed from: n */
    public Point f293587n;

    /* renamed from: o */
    public C92429f f293588o;

    /* renamed from: p */
    public SnsInfo f293589p;

    /* renamed from: q */
    public Bitmap f293590q;

    /* renamed from: r */
    public boolean f293591r = false;

    /* renamed from: s */
    public boolean f293592s = false;

    /* renamed from: t */
    public boolean f293593t = true;

    /* renamed from: u */
    public long f293594u = 0;

    /* renamed from: v */
    public long f293595v = 0;

    /* renamed from: w */
    public C102898a.C102899a f293596w = new C102898a.C102899a();

    /* renamed from: x */
    public long f293597x = 0;

    /* renamed from: y */
    public AdDragViewContainer.C94757c f293598y = new C100200a();

    /* renamed from: z */
    public Handler f293599z = new C100201b(Looper.getMainLooper());

    /* renamed from: nu2.c$a */
    public class C100200a implements AdDragViewContainer.C94757c {
        public C100200a() {
        }

        /* renamed from: a */
        public void mo130525a() {
            SnsMethodCalculate.markStartTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
            C100199c.m130980p(C100199c.this).f303723b++;
            C100199c cVar = C100199c.this;
            long currentTimeMillis = System.currentTimeMillis();
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            cVar.f293597x = currentTimeMillis;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            Log.m105924i("DragAdBusiness", "onDragStart, dragCount=" + C100199c.m130980p(C100199c.this).f303723b);
            C100199c cVar2 = C100199c.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            boolean z = cVar2.f293593t;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            if (z) {
                C100199c cVar3 = C100199c.this;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                cVar3.f293593t = false;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                C100199c cVar4 = C100199c.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                long j = cVar4.f293595v;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                if (j > 0) {
                    C102898a.C102899a p = C100199c.m130980p(C100199c.this);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    C100199c cVar5 = C100199c.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                    long j2 = cVar5.f293595v;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                    p.f303725d = ((int) (currentTimeMillis2 - j2)) + 500;
                } else {
                    Log.m105920e("DragAdBusiness", "mVideoStartPlayTime==0");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        }

        /* renamed from: b */
        public void mo130526b() {
            SnsMethodCalculate.markStartTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
            Log.m105924i("DragAdBusiness", "onDragHit");
            SnsMethodCalculate.markEndTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        }

        /* renamed from: c */
        public void mo130527c() {
            SnsMethodCalculate.markStartTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
            C100199c.this.mo139500o((Bundle) null);
            C102236a0.m134708C0(new long[]{20, 100});
            C100199c.this.mo139494i();
            C100199c.this.mo139493h(42);
            C100199c.m130980p(C100199c.this).f303724c++;
            Log.m105924i("DragAdBusiness", "onDragSucc=" + C100199c.m130980p(C100199c.this).f303724c + ", duration=" + ((long) C100199c.m130981q(C100199c.this)) + ", totalDuration=" + C100199c.m130980p(C100199c.this).f303722a + ", firstJumplayTime=" + C100199c.m130980p(C100199c.this).f303725d);
            SnsMethodCalculate.markEndTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        }

        /* renamed from: d */
        public void mo130528d() {
            SnsMethodCalculate.markStartTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
            int q = C100199c.m130981q(C100199c.this);
            Log.m105924i("DragAdBusiness", "onDragCancel, duration=" + q + ", totalDuration=" + C100199c.m130980p(C100199c.this).f303722a);
            SnsMethodCalculate.markEndTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        }
    }

    /* renamed from: nu2.c$b */
    public class C100201b extends Handler {
        public C100201b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$2");
            C100199c cVar = C100199c.this;
            long j = (long) message.arg1;
            int i = message.arg2;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            if (cVar.f293595v == 0) {
                cVar.f293595v = System.currentTimeMillis();
            }
            if (cVar.f293588o == null) {
                SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            } else {
                Log.m105918d("DragAdBusiness", "onVideoPlaying:" + j + ", startTime=" + cVar.f293588o.f264495b + ", endTime=" + cVar.f293588o.f264496c + ", duration=" + i);
                cVar.mo139505t();
                C92429f fVar = cVar.f293588o;
                if (j < ((long) fVar.f264495b) || j > ((long) fVar.f264496c)) {
                    cVar.f293584k.setDragEnabled(false);
                    cVar.f293584k.mo130517b(true);
                } else {
                    cVar.f293584k.setDragEnabled(true);
                    AdDragViewContainer adDragViewContainer = cVar.f293584k;
                    adDragViewContainer.getClass();
                    SnsMethodCalculate.markStartTimeMs("showDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                    if (adDragViewContainer.f274376j.getVisibility() != 0) {
                        Log.m105924i("AdDragViewContainer", "showDragView");
                        adDragViewContainer.mo130519d();
                        adDragViewContainer.f274376j.setVisibility(0);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adDragViewContainer.f274376j, "alpha", new float[]{0.0f, 1.0f});
                        ofFloat.setDuration(300);
                        ofFloat.start();
                    }
                    SnsMethodCalculate.markEndTimeMs("showDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                }
                SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            }
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$2");
        }
    }

    /* renamed from: p */
    public static /* synthetic */ C102898a.C102899a m130980p(C100199c cVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        C102898a.C102899a aVar = cVar.f293596w;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return aVar;
    }

    /* renamed from: q */
    public static int m130981q(C100199c cVar) {
        int i;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("calcDragTime", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (cVar.f293597x != 0) {
            i = (int) (System.currentTimeMillis() - cVar.f293597x);
            if (i > 0) {
                cVar.f293596w.f303722a += i;
            }
            cVar.f293597x = 0;
        } else {
            Log.m105928w("DragAdBusiness", "calcDragTime, startTime==0");
            i = -1;
        }
        SnsMethodCalculate.markEndTimeMs("calcDragTime", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return i;
    }

    /* renamed from: a */
    public void mo139487a(Activity activity, C98963o oVar, TimelineClickListener timelineClickListener, C100151a.C100155d dVar, C100151a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.mo139487a(activity, oVar, timelineClickListener, dVar, aVar);
        AdDragViewContainer adDragViewContainer = new AdDragViewContainer(activity);
        this.f293584k = adDragViewContainer;
        adDragViewContainer.setDragEventCallback(this.f293598y);
        this.f293584k.setDragEnabled(false);
        this.f293584k.mo130517b(false);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: b */
    public void mo139488b() {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.mo139488b();
        C63505q.m74843b(new C102898a(this.f293579f, this.f293576c.f293355K.f293340a, this.f293596w));
        Log.m105924i("DragAdBusiness", "onAdRemoved, reportData:" + this.f293596w);
        mo139504s();
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: d */
    public void mo139490d(int i, SnsInfo snsInfo, ADXml.C95018g gVar, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.mo139490d(i, snsInfo, gVar, layoutParams);
        if (!C102260r.m134840I(this.f293589p, snsInfo)) {
            Log.m105924i("DragAdBusiness", "onRefresh, snsInfo changed, last=" + C102236a0.m134777w0(this.f293589p) + ", cur=" + C102236a0.m134777w0(snsInfo) + ", hash=" + hashCode());
            mo139504s();
            this.f293589p = snsInfo;
        } else {
            Log.m105924i("DragAdBusiness", "onRefresh, same ad:" + C102236a0.m134777w0(snsInfo) + ", hash=" + hashCode());
        }
        C92429f fVar = gVar.f275697m;
        this.f293588o = fVar;
        if (fVar == null) {
            Log.m105920e("DragAdBusiness", "mAdDragInfo==null");
            SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            return;
        }
        mo139505t();
        SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: f */
    public void mo139492f() {
        SnsMethodCalculate.markStartTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.mo139492f();
        AdDragViewContainer adDragViewContainer = this.f293584k;
        if (adDragViewContainer != null) {
            adDragViewContainer.setDragEnabled(false);
            this.f293584k.mo130517b(false);
        }
        SnsMethodCalculate.markEndTimeMs("onCardClickAnimEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: g */
    public void mo139502g(long j, int i) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.arg1 = (int) j;
        obtain.arg2 = i;
        this.f293599z.removeMessages(1);
        this.f293599z.sendMessageDelayed(obtain, 50);
        SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: k */
    public boolean mo139496k() {
        SnsMethodCalculate.markStartTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        SnsMethodCalculate.markEndTimeMs("isNeedBreakFrameContainer", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        return true;
    }

    /* renamed from: l */
    public void mo139497l(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.mo139497l(frameLayout);
        SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerInflated", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: m */
    public void mo139498m(FrameLayout frameLayout, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        super.mo139498m(frameLayout, i, i2);
        if (this.f293584k.getParent() == null) {
            frameLayout.addView(this.f293584k, mo139495j() ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(i, i2));
        }
        SnsMethodCalculate.markEndTimeMs("onBreakFrameContainerSizeCalcFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: n */
    public void mo139499n(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        mo139503r(this.f293576c);
        SnsMethodCalculate.markEndTimeMs("onContentPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: r */
    public final void mo139503r(C100151a.C100155d dVar) {
        SnsMethodCalculate.markStartTimeMs("calcOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        this.f293585l = dVar.f293379x.getWidth();
        this.f293586m = dVar.f293379x.getHeight();
        int[] iArr = new int[2];
        dVar.f293377v.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        dVar.f293379x.getLocationOnScreen(iArr2);
        this.f293587n = new Point(iArr2[0], iArr2[1] - iArr[1]);
        Log.m105924i("DragAdBusiness", "calcOffset, w=" + this.f293585l + ", h=" + this.f293586m + ", offset=" + this.f293587n + ", root[0]=" + iArr[0] + ", root[1]=" + iArr[1] + ", content[0]=" + iArr2[0] + ", content[1]=" + iArr2[1]);
        SnsMethodCalculate.markEndTimeMs("calcOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: s */
    public final void mo139504s() {
        SnsMethodCalculate.markStartTimeMs("doClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        this.f293599z.removeCallbacksAndMessages((Object) null);
        C102898a.C102899a aVar = this.f293596w;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
        aVar.f303722a = 0;
        aVar.f303723b = 0;
        aVar.f303724c = 0;
        aVar.f303725d = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData$DragData");
        this.f293584k.setDragEnabled(false);
        this.f293584k.mo130517b(false);
        this.f293584k.setDragViewImg((Bitmap) null);
        this.f293589p = null;
        this.f293588o = null;
        this.f293590q = null;
        this.f293591r = false;
        this.f293592s = false;
        this.f293593t = true;
        this.f293594u = 0;
        this.f293597x = 0;
        this.f293595v = 0;
        SnsMethodCalculate.markEndTimeMs("doClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }

    /* renamed from: t */
    public final void mo139505t() {
        Point point;
        C92429f fVar;
        SnsMethodCalculate.markStartTimeMs("tryInitData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (!this.f293591r) {
            if (this.f293585l == 0 || this.f293587n == null) {
                mo139503r(this.f293576c);
            }
            int i = this.f293585l;
            if (i <= 0 || this.f293586m <= 0 || (point = this.f293587n) == null || (fVar = this.f293588o) == null) {
                Log.m105920e("DragAdBusiness", "tryInitData, mContentW=" + this.f293585l + ", mOffset=" + this.f293587n);
            } else {
                this.f293591r = true;
                Rect a = C92429f.m116257a(fVar.f264497d, i, point);
                Rect a2 = C92429f.m116257a(this.f293588o.f264499f, this.f293585l, this.f293587n);
                Rect a3 = C92429f.m116257a(this.f293588o.f264498e, this.f293585l, this.f293587n);
                Rect a4 = C92429f.m116257a(this.f293588o.f264500g, this.f293585l, this.f293587n);
                Log.m105924i("DragAdBusiness", "tryInitData succ");
                AdDragViewContainer adDragViewContainer = this.f293584k;
                adDragViewContainer.getClass();
                SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                Log.m105924i("AdDragViewContainer", "initData");
                adDragViewContainer.f274371e.set(a);
                adDragViewContainer.f274374h.set(a2);
                adDragViewContainer.f274372f.set(a3);
                adDragViewContainer.f274373g.set(a4);
                Rect rect = adDragViewContainer.f274371e;
                int i2 = rect.right - rect.left;
                int i3 = rect.bottom - rect.top;
                ViewGroup.LayoutParams layoutParams = adDragViewContainer.f274376j.getLayoutParams();
                layoutParams.width = i2;
                layoutParams.height = i3;
                adDragViewContainer.f274376j.setLayoutParams(layoutParams);
                adDragViewContainer.f274376j.setVisibility(8);
                adDragViewContainer.mo130519d();
                if (adDragViewContainer.f274384u) {
                    adDragViewContainer.invalidate();
                }
                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            }
        }
        SnsMethodCalculate.markStartTimeMs("initDragBmp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        try {
            if (this.f293590q == null && System.currentTimeMillis() - this.f293594u >= 1000) {
                this.f293594u = System.currentTimeMillis();
                Log.m105918d("DragAdBusiness", "onVideoPlaying, checkLoad bitmap");
                this.f293590q = this.f293588o.mo126431b();
            }
            if (this.f293590q != null && !this.f293592s) {
                this.f293592s = true;
                Log.m105924i("DragAdBusiness", "onVideoPlaying, setDragViewImg");
                this.f293584k.setDragViewImg(this.f293590q);
            }
        } catch (Throwable th) {
            Log.m105920e("DragAdBusiness", "checkSetDragBmp, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initDragBmp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        SnsMethodCalculate.markEndTimeMs("tryInitData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
    }
}
