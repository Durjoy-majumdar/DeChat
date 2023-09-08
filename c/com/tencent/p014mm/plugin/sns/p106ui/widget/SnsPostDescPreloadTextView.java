package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.p014mm.kiss.widget.textview.PLTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C96113p5;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gv2.C98249r;
import java.util.Map;
import m40.C99786a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView */
public class SnsPostDescPreloadTextView extends PLTextView {

    /* renamed from: q */
    public static final /* synthetic */ int f281563q = 0;

    /* renamed from: e */
    public boolean f281564e = true;

    /* renamed from: f */
    public int f281565f = 0;

    /* renamed from: g */
    public boolean f281566g = false;

    /* renamed from: h */
    public boolean f281567h = false;

    /* renamed from: i */
    public boolean f281568i = false;

    /* renamed from: j */
    public C96303b f281569j = null;

    /* renamed from: n */
    public int f281570n = ViewConfiguration.getLongPressTimeout();

    /* renamed from: o */
    public Map<String, Integer> f281571o;

    /* renamed from: p */
    public C96302a f281572p = new C96302a();

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView$a */
    public class C96302a implements Runnable {
        public C96302a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView$CheckForLongPress");
            SnsPostDescPreloadTextView snsPostDescPreloadTextView = SnsPostDescPreloadTextView.this;
            int i = SnsPostDescPreloadTextView.f281563q;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
            snsPostDescPreloadTextView.f281566g = true;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView$CheckForLongPress");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView$b */
    public interface C96303b {
        /* renamed from: a */
        void mo132940a();

        /* renamed from: b */
        void mo132941b();
    }

    public SnsPostDescPreloadTextView(Context context) {
        super(context);
    }

    private int getPostDescWidth() {
        SnsMethodCalculate.markStartTimeMs("getPostDescWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        int i = this.f281565f;
        if (i > 0) {
            SnsMethodCalculate.markEndTimeMs("getPostDescWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
            return i;
        }
        C98249r.m126976a();
        int d = C98249r.f288050e.mo137553d();
        SnsMethodCalculate.markEndTimeMs("getPostDescWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        return d;
    }

    /* renamed from: b */
    public C99786a mo126800b() {
        SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f281564e = true;
        C98249r.m126976a();
        C99786a b = C98249r.f288050e.mo137551b();
        SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        return b;
    }

    /* renamed from: g */
    public void mo126793g(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        SnsMethodCalculate.markEndTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    /* renamed from: h */
    public void mo126794h(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        if (charSequence != null) {
            mo126802f(charSequence, true);
        }
        SnsMethodCalculate.markEndTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f281567h = true;
            postDelayed(this.f281572p, (long) this.f281570n);
        } else if (actionMasked == 1) {
            if (!this.f281566g && this.f281567h && !this.f281568i) {
                SnsMethodCalculate.markStartTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                if (!(getTag() instanceof C96113p5)) {
                    Log.m105920e("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: skip");
                    SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                } else {
                    C96113p5 p5Var = (C96113p5) getTag();
                    if (p5Var == null) {
                        Log.m105920e("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: SnsPostDescInfo null");
                        SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                    } else {
                        Map<String, Integer> map = this.f281571o;
                        if (map == null || (map.containsKey(p5Var.f280720b) && this.f281571o.get(p5Var.f280720b).equals(0))) {
                            Log.m105920e("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: collapseibleMap error");
                            SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                        } else if (!this.f281571o.containsKey(p5Var.f280720b) || !this.f281571o.get(p5Var.f280720b).equals(1)) {
                            this.f281571o.put(p5Var.f280720b, 1);
                            if (this.f281569j != null) {
                                Log.m105918d("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: SHRINK_MODE");
                                this.f281569j.mo132941b();
                            }
                            SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                        } else {
                            Log.m105918d("MicroMsg.SnsPostDescPreloadTextView", "shrinkOrSpreadContent: SPREAD_MODE");
                            this.f281571o.put(p5Var.f280720b, 2);
                            C96303b bVar = this.f281569j;
                            if (bVar != null) {
                                bVar.mo132940a();
                            }
                            SnsMethodCalculate.markEndTimeMs("shrinkOrSpreadContent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
                        }
                    }
                }
            }
            this.f281566g = false;
            this.f281567h = false;
            removeCallbacks(this.f281572p);
        } else if (actionMasked == 3) {
            this.f281566g = false;
            this.f281567h = false;
            removeCallbacks(this.f281572p);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        return onTouchEvent;
    }

    public void setCollapseibleMap(Map<String, Integer> map) {
        SnsMethodCalculate.markStartTimeMs("setCollapseibleMap", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f281571o = map;
        SnsMethodCalculate.markEndTimeMs("setCollapseibleMap", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public void setIsAd(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f281568i = z;
        SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMaxLines(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = "setMaxLines"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.CharSequence r2 = r5.getText()
            if (r2 != 0) goto L_0x0011
            super.setMaxLines(r6)
        L_0x0011:
            r2 = 7
            r3 = 0
            r4 = 1
            if (r6 >= r2) goto L_0x0029
            boolean r6 = r5.f281564e
            if (r6 == 0) goto L_0x003c
            gv2.C98249r.m126976a()
            gv2.r r6 = gv2.C98249r.f288050e
            m40.a r6 = r6.mo137552c()
            r5.setConfig(r6)
            r5.f281564e = r3
            goto L_0x003b
        L_0x0029:
            boolean r6 = r5.f281564e
            if (r6 != 0) goto L_0x003c
            gv2.C98249r.m126976a()
            gv2.r r6 = gv2.C98249r.f288050e
            m40.a r6 = r6.mo137551b()
            r5.setConfig(r6)
            r5.f281564e = r4
        L_0x003b:
            r3 = 1
        L_0x003c:
            if (r3 == 0) goto L_0x0069
            l40.c r6 = l40.C99336c.f291266b
            m40.a r2 = r5.getConfig()
            java.lang.CharSequence r3 = r5.getText()
            l40.f r6 = r6.mo138732b(r2, r3)
            if (r6 != 0) goto L_0x0064
            int r2 = r5.getPostDescWidth()
            if (r2 <= 0) goto L_0x0064
            java.lang.CharSequence r6 = r5.getText()
            m40.a r3 = r5.getConfig()
            l40.d r6 = l40.C99337d.m129495d(r6, r2, r3)
            l40.f r6 = r6.mo138734a()
        L_0x0064:
            if (r6 == 0) goto L_0x0069
            r5.setTextLayout(r6)
        L_0x0069:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView.setMaxLines(int):void");
    }

    public void setShrinkOrSpreadListener(C96303b bVar) {
        SnsMethodCalculate.markStartTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f281569j = bVar;
        SnsMethodCalculate.markEndTimeMs("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public void setSpecialWidth(int i) {
        SnsMethodCalculate.markStartTimeMs("setSpecialWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
        this.f281565f = i;
        SnsMethodCalculate.markEndTimeMs("setSpecialWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView");
    }

    public SnsPostDescPreloadTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnsPostDescPreloadTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
