package com.tencent.p014mm.plugin.sns.p104ad.timeline.item.adSlideFullCard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr2.C98184b;
import gr2.C98189d;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView */
public class AdSlideRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public int f274178A1 = 0;

    /* renamed from: B1 */
    public long f274179B1 = 0;

    /* renamed from: y1 */
    public C98184b f274180y1 = null;

    /* renamed from: z1 */
    public long f274181z1 = 0;

    public AdSlideRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        if (motionEvent.getAction() == 0) {
            C98184b bVar = this.f274180y1;
            if (bVar != null) {
                ((C98189d) bVar).mo137488a(motionEvent);
            }
            this.f274179B1 = System.currentTimeMillis();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return dispatchTouchEvent;
    }

    public int getTotalTouchCount() {
        SnsMethodCalculate.markStartTimeMs("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        Log.m105924i("AdSlideRecyclerView", "totalCount:" + this.f274178A1);
        int i = this.f274178A1;
        SnsMethodCalculate.markEndTimeMs("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return i;
    }

    public long getTotalTouchDuration() {
        SnsMethodCalculate.markStartTimeMs("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        Log.m105924i("AdSlideRecyclerView", "totalDuration:" + this.f274181z1);
        long j = this.f274181z1;
        SnsMethodCalculate.markEndTimeMs("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f274179B1 = System.currentTimeMillis();
        } else {
            C98184b bVar = this.f274180y1;
            if (bVar != null) {
                ((C98189d) bVar).mo137488a(motionEvent);
            }
            if ((action == 1 || action == 3) && this.f274179B1 != 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f274179B1;
                this.f274181z1 += currentTimeMillis;
                this.f274178A1++;
                Log.m105924i("AdSlideRecyclerView", "touchUp, curTime=" + currentTimeMillis + ", total=" + this.f274181z1 + ", touchCount=" + this.f274178A1);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return onTouchEvent;
    }

    public void setTouchEventProxy(C98184b bVar) {
        SnsMethodCalculate.markStartTimeMs("setTouchEventProxy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        this.f274180y1 = bVar;
        Log.m105924i("AdSlideRecyclerView", "setTouchEventProxy:" + bVar);
        SnsMethodCalculate.markEndTimeMs("setTouchEventProxy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
    }

    public AdSlideRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
