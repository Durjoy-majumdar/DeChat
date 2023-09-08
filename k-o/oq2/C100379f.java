package oq2;

import android.view.ViewGroup;
import android.widget.ImageView;
import bv2.C92318f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import oq2.C100373a;
import p749xh.C66261f3;
import qq2.C101239f;
import rq2.C101432s;

/* renamed from: oq2.f */
public class C100379f implements CardLayoutManager.C19247c {

    /* renamed from: a */
    public boolean f294009a;

    /* renamed from: b */
    public boolean f294010b;

    /* renamed from: c */
    public final C101239f f294011c;

    /* renamed from: d */
    public SnsInfo f294012d;

    /* renamed from: e */
    public C100373a f294013e;

    /* renamed from: oq2.f$a */
    public class C100380a implements OnlineVideoView.IVideoViewCallback {

        /* renamed from: a */
        public final OnlineVideoView f294014a;

        /* renamed from: b */
        public final CardLayoutManager f294015b;

        /* renamed from: c */
        public boolean f294016c = false;

        public C100380a(CardLayoutManager cardLayoutManager, OnlineVideoView onlineVideoView) {
            this.f294014a = onlineVideoView;
            this.f294015b = cardLayoutManager;
        }

        /* renamed from: a */
        public void mo132395a(int i) {
            OnlineVideoView onlineVideoView;
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
            int i2 = i / 1000;
            try {
                CardLayoutManager cardLayoutManager = this.f294015b;
                if (cardLayoutManager != null) {
                    int v = cardLayoutManager.mo24713v();
                    if (!(C100379f.this.f294013e == null || (onlineVideoView = this.f294014a) == null)) {
                        Object tag = onlineVideoView.getTag(C0966R.C0970id.jpc);
                        if (tag instanceof Integer) {
                            if (((Integer) tag).intValue() == 1) {
                                Log.m105918d("SnsAd.TopicCardVideoPlayHelper", "the video view has bean seek to 0");
                                this.f294014a.setTag(C0966R.C0970id.jpc, 0);
                                this.f294016c = false;
                                C100373a aVar = C100379f.this.f294013e;
                                aVar.getClass();
                                SnsMethodCalculate.markStartTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                                C100373a.C100374a d = aVar.mo139646d(v);
                                if (d != null) {
                                    d.f293980g += d.f293984k;
                                    d.f293984k = 0;
                                }
                                SnsMethodCalculate.markEndTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                            }
                        }
                        C100373a aVar2 = C100379f.this.f294013e;
                        int i3 = i2 * 1000;
                        aVar2.getClass();
                        SnsMethodCalculate.markStartTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        C100373a.C100374a d2 = aVar2.mo139646d(v);
                        if (d2 != null) {
                            d2.f293984k = i3;
                            if (d2.f293981h < i3) {
                                d2.f293981h = i3;
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        if (!this.f294016c && i2 >= 1) {
                            this.f294016c = true;
                            C100373a aVar3 = C100379f.this.f294013e;
                            aVar3.getClass();
                            SnsMethodCalculate.markStartTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                            C100373a.C100374a d3 = aVar3.mo139646d(v);
                            if (d3 != null) {
                                d3.f293978e++;
                            }
                            SnsMethodCalculate.markEndTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        }

        /* renamed from: b */
        public void mo132396b(int i) {
            OnlineVideoView onlineVideoView;
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
            try {
                Log.m105918d("SnsAd.TopicCardVideoPlayHelper", "the video is start");
                CardLayoutManager cardLayoutManager = this.f294015b;
                if (cardLayoutManager != null) {
                    int v = cardLayoutManager.mo24713v();
                    C100373a aVar = C100379f.this.f294013e;
                    if (!(aVar == null || (onlineVideoView = this.f294014a) == null)) {
                        aVar.mo139648f(v, onlineVideoView.getDuration());
                    }
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
            try {
                Log.m105918d("SnsAd.TopicCardVideoPlayHelper", "the video is onCompletion");
                this.f294016c = false;
                CardLayoutManager cardLayoutManager = this.f294015b;
                if (cardLayoutManager != null) {
                    int v = cardLayoutManager.mo24713v();
                    C100373a aVar = C100379f.this.f294013e;
                    if (!(aVar == null || this.f294014a == null)) {
                        aVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        C100373a.C100374a d = aVar.mo139646d(v);
                        if (d != null) {
                            d.f293979f++;
                            d.f293980g += d.f293982i;
                            d.f293984k = 0;
                        }
                        SnsMethodCalculate.markEndTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                        C100379f.this.f294013e.mo139648f(v, this.f294014a.getDuration());
                    }
                }
                C100379f fVar = C100379f.this;
                CardLayoutManager cardLayoutManager2 = this.f294015b;
                OnlineVideoView onlineVideoView = this.f294014a;
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                if (fVar.f294009a) {
                    if (onlineVideoView != null) {
                        onlineVideoView.mo132322N(0, true);
                    }
                } else if (cardLayoutManager2 != null) {
                    cardLayoutManager2.mo24705C();
                }
                SnsMethodCalculate.markEndTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper$CardVideoViewCallback");
        }
    }

    public C100379f(C101239f fVar, C100373a aVar) {
        this.f294011c = fVar;
        this.f294013e = aVar;
    }

    /* renamed from: a */
    public void mo24721a(CardLayoutManager cardLayoutManager, int i) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        if (i == 1) {
            try {
                SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                this.f294009a = true;
                if (cardLayoutManager != null) {
                    cardLayoutManager.mo24712u();
                }
                SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            } catch (Throwable unused) {
            }
        } else {
            SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            this.f294009a = false;
            SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    /* renamed from: b */
    public void mo24722b(int i) {
        SnsMethodCalculate.markStartTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        SnsMethodCalculate.markEndTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    /* renamed from: c */
    public void mo24723c(CardLayoutManager cardLayoutManager, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        Log.m105918d("SnsAd.TopicCardVideoPlayHelper", "the onVisibleItemChanged is called , current position is " + i + ", the last position " + i2);
        try {
            C100373a aVar = this.f294013e;
            if (aVar != null) {
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                if (i == aVar.f293973f) {
                    SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                } else {
                    aVar.f293973f = i;
                    C100373a.C100374a d = aVar.mo139646d(i);
                    if (d != null) {
                        d.f293976c++;
                    }
                    SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                }
            }
            SnsMethodCalculate.markStartTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            mo139661d(cardLayoutManager, i, false);
            SnsMethodCalculate.markEndTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        } catch (Throwable unused) {
            Log.m105918d("SnsAd.TopicCardVideoPlayHelper", "onVisibleItemChanged has something wrong");
        }
        SnsMethodCalculate.markEndTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139661d(com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "playInner"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "playInner:: currentPosition is "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r4 = ", the ready to play is "
            r2.append(r4)
            boolean r4 = r12.f294010b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "SnsAd.TopicCardVideoPlayHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            if (r13 != 0) goto L_0x002f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x002f:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r12.f294012d
            java.lang.String r5 = "getAdFinderTopicResInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            r6 = 0
            java.lang.String r7 = "getRecyclerViewAdapter"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)     // Catch:{ all -> 0x005c }
            androidx.recyclerview.widget.RecyclerView r9 = r13.f54228t     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x004a
            androidx.recyclerview.widget.RecyclerView$e r9 = r9.getAdapter()     // Catch:{ all -> 0x004a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch:{ all -> 0x005c }
            goto L_0x004e
        L_0x004a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch:{ all -> 0x005c }
            r9 = r6
        L_0x004e:
            boolean r7 = r9 instanceof oq2.C100377d     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0061
            oq2.d r9 = (oq2.C100377d) r9     // Catch:{ all -> 0x005c }
            co2.l r7 = r9.mo139656F4(r14)     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x0065
        L_0x005c:
            java.lang.String r7 = "get topic resource information failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r7)
        L_0x0061:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r7 = r6
        L_0x0065:
            java.lang.String r5 = "getCardViewHolder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            androidx.recyclerview.widget.RecyclerView$z r8 = r13.mo24716y(r14)     // Catch:{ all -> 0x0078 }
            boolean r9 = r8 instanceof oq2.C100378e     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0078
            oq2.e r8 = (oq2.C100378e) r8     // Catch:{ all -> 0x0078 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x007c
        L_0x0078:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r8 = r6
        L_0x007c:
            if (r2 == 0) goto L_0x015f
            if (r7 == 0) goto L_0x015f
            if (r8 == 0) goto L_0x015f
            android.widget.FrameLayout r5 = r8.f294001A
            if (r5 != 0) goto L_0x0088
            goto L_0x015f
        L_0x0088:
            r13.mo24712u()
            boolean r5 = r12.f294010b
            if (r5 == 0) goto L_0x0155
            boolean r5 = r7.mo126434a()
            if (r5 == 0) goto L_0x0148
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r14)
            java.lang.String r14 = ", the res info is sight"
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            android.widget.FrameLayout r14 = r8.f294001A
            te3.kv2 r3 = r7.f264553i
            java.lang.String r5 = "playVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            qq2.f r7 = r12.f294011c
            if (r7 == 0) goto L_0x013e
            if (r14 == 0) goto L_0x013e
            if (r3 != 0) goto L_0x00c0
            goto L_0x013e
        L_0x00c0:
            bv2.f r8 = new bv2.f
            r8.<init>()
            r8.f264168a = r3
            java.lang.String r9 = r2.getLocalid()
            r8.f264169b = r9
            long r9 = r2.field_snsId
            java.lang.String r9 = vr2.C102236a0.m134765q0(r9)
            r8.f264171d = r9
            int r2 = r2.getCreateTime()
            r8.f264170c = r2
            android.content.Context r2 = r14.getContext()
            java.lang.String r9 = r3.f298689d
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = r7.mo140704a(r2, r9)
            java.lang.String r9 = "getVideoViewInContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            boolean r10 = rq2.C101432s.m133123e(r14)
            if (r10 == 0) goto L_0x0100
            r10 = 0
            android.view.View r10 = r14.getChildAt(r10)
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView
            if (r11 == 0) goto L_0x0100
            r6 = r10
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r6 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x0103
        L_0x0100:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
        L_0x0103:
            if (r6 != 0) goto L_0x010f
            java.lang.String r15 = "the videoViewInContainer need new view"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r15)
            r12.mo139662e(r2, r13, r14, r8)
            goto L_0x013a
        L_0x010f:
            if (r6 != r2) goto L_0x0134
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "the videoViewInContainer and media id view is same, is time line reason "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r13)
            if (r15 == 0) goto L_0x012e
            java.lang.String r13 = r3.f298689d
            r7.mo140709f(r6, r13)
            goto L_0x013a
        L_0x012e:
            java.lang.String r13 = r3.f298689d
            r7.mo140710g(r6, r13)
            goto L_0x013a
        L_0x0134:
            rq2.C101432s.m133121c(r14)
            r12.mo139662e(r2, r13, r14, r8)
        L_0x013a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x015b
        L_0x013e:
            java.lang.String r13 = "the input params are invalid!!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x015b
        L_0x0148:
            r14 = 3000(0xbb8, double:1.482E-320)
            r13.mo24706D(r14)
            qq2.f r13 = r12.f294011c
            if (r13 == 0) goto L_0x015b
            r13.mo140707d()
            goto L_0x015b
        L_0x0155:
            java.lang.String r13 = "playInner::the topic item is not able to play video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
        L_0x015b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x015f:
            java.lang.String r13 = "playInner::the resInfo or view holder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oq2.C100379f.mo139661d(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, int, boolean):void");
    }

    /* renamed from: e */
    public final void mo139662e(OnlineVideoView onlineVideoView, CardLayoutManager cardLayoutManager, ViewGroup viewGroup, C92318f fVar) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        C101239f fVar2 = this.f294011c;
        if (!(onlineVideoView == null || fVar2 == null)) {
            C101432s.m133126h(onlineVideoView);
            C101432s.m133131m(onlineVideoView, -1, -1);
            C101432s.m133120b(viewGroup, onlineVideoView, 0);
            C101432s.m133132n(onlineVideoView, true);
            onlineVideoView.setThumbViewScaleType(ImageView.ScaleType.CENTER_CROP);
            onlineVideoView.setVideoScaleType(C96814a.C96817e.COVER);
            onlineVideoView.setVideoCallback(new C100380a(cardLayoutManager, onlineVideoView));
            fVar2.mo140711h(onlineVideoView, fVar, fVar.f264171d, fVar.f264168a.f298689d);
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }

    /* renamed from: f */
    public void mo139663f(CardLayoutManager cardLayoutManager) {
        SnsMethodCalculate.markStartTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
        Log.m105924i("SnsAd.TopicCardVideoPlayHelper", "resumePlayByTimeline is called!");
        this.f294010b = true;
        if (cardLayoutManager != null) {
            try {
                int v = cardLayoutManager.mo24713v();
                if (v >= 0) {
                    mo139661d(cardLayoutManager, v, true);
                }
            } catch (Throwable unused) {
                Log.m105918d("SnsAd.TopicCardVideoPlayHelper", "resumePlayByTimeline has something wrong");
            }
        }
        SnsMethodCalculate.markEndTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
    }
}
