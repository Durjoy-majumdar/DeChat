package lq2;

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
import lq2.C99583c;
import p749xh.C66261f3;
import qq2.C101239f;
import rq2.C101432s;
import vr2.C102260r;

/* renamed from: lq2.h */
public class C99588h implements CardLayoutManager.C19247c {

    /* renamed from: a */
    public boolean f291947a;

    /* renamed from: b */
    public boolean f291948b;

    /* renamed from: c */
    public final C101239f f291949c;

    /* renamed from: d */
    public SnsInfo f291950d;

    /* renamed from: e */
    public C99583c f291951e;

    /* renamed from: lq2.h$a */
    public class C99589a implements OnlineVideoView.IVideoViewCallback {

        /* renamed from: a */
        public final OnlineVideoView f291952a;

        /* renamed from: b */
        public final CardLayoutManager f291953b;

        /* renamed from: c */
        public boolean f291954c = false;

        /* renamed from: d */
        public volatile int f291955d = -1;

        public C99589a(CardLayoutManager cardLayoutManager, OnlineVideoView onlineVideoView, int i) {
            this.f291952a = onlineVideoView;
            this.f291953b = cardLayoutManager;
            this.f291955d = Math.max(i, 0);
        }

        /* renamed from: a */
        public void mo132395a(int i) {
            OnlineVideoView onlineVideoView;
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
            try {
                CardLayoutManager cardLayoutManager = this.f291953b;
                if (cardLayoutManager != null) {
                    int v = cardLayoutManager.mo24713v();
                    if (v != this.f291955d) {
                        Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "index = " + v + ", mCurrentIndex = " + this.f291955d);
                        SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
                        return;
                    } else if (!(C99588h.this.f291951e == null || (onlineVideoView = this.f291952a) == null)) {
                        Object tag = onlineVideoView.getTag(C0966R.C0970id.jpc);
                        if (tag instanceof Integer) {
                            if (((Integer) tag).intValue() == 1) {
                                Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "the video view has bean seek to 0");
                                this.f291952a.setTag(C0966R.C0970id.jpc, 0);
                                this.f291954c = false;
                                C99583c cVar = C99588h.this.f291951e;
                                cVar.getClass();
                                SnsMethodCalculate.markStartTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                                C99583c.C99584a d = cVar.mo138951d(v);
                                if (d != null) {
                                    d.f291918i += d.f291921l;
                                    d.f291921l = 0;
                                }
                                SnsMethodCalculate.markEndTimeMs("adjustItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                            }
                        }
                        C99583c cVar2 = C99588h.this.f291951e;
                        cVar2.getClass();
                        SnsMethodCalculate.markStartTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        C99583c.C99584a d2 = cVar2.mo138951d(v);
                        if (d2 != null) {
                            if (i >= d2.f291921l) {
                                d2.f291921l = i;
                            }
                            if (d2.f291919j < i) {
                                d2.f291919j = i;
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("updateItemDataPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        int i2 = i / 1000;
                        if (!this.f291954c && i2 >= 1) {
                            this.f291954c = true;
                            C99583c cVar3 = C99588h.this.f291951e;
                            cVar3.getClass();
                            SnsMethodCalculate.markStartTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                            C99583c.C99584a d3 = cVar3.mo138951d(v);
                            if (d3 != null) {
                                d3.f291916g++;
                            }
                            SnsMethodCalculate.markEndTimeMs("updateItemPlayCountOneSecond", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        }

        /* renamed from: b */
        public void mo132396b(int i) {
            OnlineVideoView onlineVideoView;
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
            try {
                Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "the video is start");
                CardLayoutManager cardLayoutManager = this.f291953b;
                if (cardLayoutManager != null) {
                    int v = cardLayoutManager.mo24713v();
                    this.f291955d = v;
                    C99583c cVar = C99588h.this.f291951e;
                    if (!(cVar == null || (onlineVideoView = this.f291952a) == null)) {
                        cVar.mo138953f(v, onlineVideoView.getDuration());
                    }
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
            try {
                Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "the video is onCompletion");
                this.f291954c = false;
                CardLayoutManager cardLayoutManager = this.f291953b;
                if (cardLayoutManager != null) {
                    int v = cardLayoutManager.mo24713v();
                    C99583c cVar = C99588h.this.f291951e;
                    if (!(cVar == null || this.f291952a == null)) {
                        cVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        C99583c.C99584a d = cVar.mo138951d(v);
                        if (d != null) {
                            d.f291917h++;
                            d.f291918i += d.f291920k;
                            d.f291921l = 0;
                        }
                        SnsMethodCalculate.markEndTimeMs("updateItemDataFinishPlayCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                        C99588h.this.f291951e.mo138953f(v, this.f291952a.getDuration());
                    }
                }
                C99588h hVar = C99588h.this;
                CardLayoutManager cardLayoutManager2 = this.f291953b;
                OnlineVideoView onlineVideoView = this.f291952a;
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                if (hVar.f291947a) {
                    if (onlineVideoView != null) {
                        onlineVideoView.mo132322N(0, true);
                    }
                } else if (cardLayoutManager2 != null) {
                    cardLayoutManager2.mo24705C();
                }
                SnsMethodCalculate.markEndTimeMs("onVideoCompleted", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$CardVideoViewCallback");
        }
    }

    public C99588h(C101239f fVar, C99583c cVar) {
        this.f291949c = fVar;
        this.f291951e = cVar;
    }

    /* renamed from: a */
    public void mo24721a(CardLayoutManager cardLayoutManager, int i) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        if (i == 1) {
            try {
                SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.f291947a = true;
                if (cardLayoutManager != null) {
                    cardLayoutManager.mo24712u();
                }
                SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressed", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } catch (Throwable unused) {
            }
        } else {
            SnsMethodCalculate.markStartTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            this.f291947a = false;
            SnsMethodCalculate.markEndTimeMs("onRecyclerViewPressReleased", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    /* renamed from: b */
    public void mo24722b(int i) {
        SnsMethodCalculate.markStartTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        try {
            C99583c cVar = this.f291951e;
            if (cVar != null) {
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("updateItemDataAutoSlideInCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                C99583c.C99584a d = cVar.mo138951d(i);
                if (d != null) {
                    d.f291913d++;
                }
                SnsMethodCalculate.markEndTimeMs("updateItemDataAutoSlideInCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    /* renamed from: c */
    public void mo24723c(CardLayoutManager cardLayoutManager, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "the onVisibleItemChanged is called , current position is " + i + ", the last position " + i2);
        try {
            C99583c cVar = this.f291951e;
            if (cVar != null) {
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                if (i == cVar.f291909g) {
                    SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                } else {
                    cVar.f291909g = i;
                    C99583c.C99584a d = cVar.mo138951d(i);
                    if (d != null) {
                        d.f291912c++;
                    }
                    SnsMethodCalculate.markEndTimeMs("updateItemDataExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                }
            }
            SnsMethodCalculate.markStartTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            mo138963d(cardLayoutManager, i, false);
            SnsMethodCalculate.markEndTimeMs("triggerPlayByItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        } catch (Throwable unused) {
            Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "onVisibleItemChanged has something wrong");
        }
        SnsMethodCalculate.markEndTimeMs("onVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138963d(com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "playInner"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "playInner:: currentPosition is "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r4 = ", the ready to play is "
            r2.append(r4)
            boolean r4 = r12.f291948b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "SnsAd.SlideFullCardVideoPlayHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            if (r13 != 0) goto L_0x002f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x002f:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r12.f291950d
            java.lang.String r5 = "getAdSlideFullCardItemInfo"
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
            boolean r7 = r9 instanceof lq2.C99586f     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0061
            lq2.f r9 = (lq2.C99586f) r9     // Catch:{ all -> 0x005c }
            co2.q r7 = r9.mo138957O4(r14)     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x0065
        L_0x005c:
            java.lang.String r7 = "get adSlide resource information failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r7)
        L_0x0061:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r7 = r6
        L_0x0065:
            java.lang.String r5 = "getCardViewHolder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            androidx.recyclerview.widget.RecyclerView$z r8 = r13.mo24716y(r14)     // Catch:{ all -> 0x0078 }
            boolean r9 = r8 instanceof lq2.C99587g     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0078
            lq2.g r8 = (lq2.C99587g) r8     // Catch:{ all -> 0x0078 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x007c
        L_0x0078:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r8 = r6
        L_0x007c:
            if (r2 == 0) goto L_0x0164
            if (r7 == 0) goto L_0x0164
            if (r8 == 0) goto L_0x0164
            android.widget.FrameLayout r5 = r8.f291936D
            if (r5 != 0) goto L_0x0088
            goto L_0x0164
        L_0x0088:
            r13.mo24712u()
            boolean r5 = r12.f291948b
            if (r5 == 0) goto L_0x015a
            boolean r5 = r7.mo126435a()
            if (r5 == 0) goto L_0x014d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r14)
            java.lang.String r14 = ", the res info is sight"
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            android.widget.FrameLayout r14 = r8.f291936D
            te3.kv2 r3 = r7.f264577e
            java.lang.String r5 = "playVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            qq2.f r7 = r12.f291949c
            if (r7 == 0) goto L_0x0143
            if (r14 == 0) goto L_0x0143
            if (r3 != 0) goto L_0x00c0
            goto L_0x0143
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
            if (r2 == 0) goto L_0x00ea
            r2.mo132370w()
        L_0x00ea:
            java.lang.String r9 = "getVideoViewInContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            boolean r10 = rq2.C101432s.m133123e(r14)
            if (r10 == 0) goto L_0x0105
            r10 = 0
            android.view.View r10 = r14.getChildAt(r10)
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView
            if (r11 == 0) goto L_0x0105
            r6 = r10
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r6 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x0108
        L_0x0105:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
        L_0x0108:
            if (r6 != 0) goto L_0x0114
            java.lang.String r15 = "the videoViewInContainer need new view"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r15)
            r12.mo138964e(r2, r13, r14, r8)
            goto L_0x013f
        L_0x0114:
            if (r6 != r2) goto L_0x0139
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "the videoViewInContainer and media id view is same, is time line reason "
            r13.append(r14)
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r13)
            if (r15 == 0) goto L_0x0133
            java.lang.String r13 = r3.f298689d
            r7.mo140709f(r6, r13)
            goto L_0x013f
        L_0x0133:
            java.lang.String r13 = r3.f298689d
            r7.mo140710g(r6, r13)
            goto L_0x013f
        L_0x0139:
            rq2.C101432s.m133121c(r14)
            r12.mo138964e(r2, r13, r14, r8)
        L_0x013f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x0160
        L_0x0143:
            java.lang.String r13 = "the input params are invalid!!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x0160
        L_0x014d:
            r14 = 3000(0xbb8, double:1.482E-320)
            r13.mo24706D(r14)
            qq2.f r13 = r12.f291949c
            if (r13 == 0) goto L_0x0160
            r13.mo140707d()
            goto L_0x0160
        L_0x015a:
            java.lang.String r13 = "playInner::the adSlide item is not able to play video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
        L_0x0160:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0164:
            java.lang.String r13 = "playInner::the resInfo or view holder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lq2.C99588h.mo138963d(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, int, boolean):void");
    }

    /* renamed from: e */
    public final void mo138964e(OnlineVideoView onlineVideoView, CardLayoutManager cardLayoutManager, ViewGroup viewGroup, C92318f fVar) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        C101239f fVar2 = this.f291949c;
        if (!(onlineVideoView == null || fVar2 == null)) {
            String str = fVar.f264169b;
            fVar.f264169b = C102260r.m134862c(str, fVar.f264168a.f298689d + "_");
            C101432s.m133126h(onlineVideoView);
            C101432s.m133131m(onlineVideoView, -1, -1);
            C101432s.m133120b(viewGroup, onlineVideoView, 0);
            C101432s.m133132n(onlineVideoView, true);
            onlineVideoView.setThumbViewScaleType(ImageView.ScaleType.CENTER_CROP);
            onlineVideoView.setVideoScaleType(C96814a.C96817e.COVER);
            onlineVideoView.setVideoCallback(new C99589a(cardLayoutManager, onlineVideoView, cardLayoutManager.mo24713v()));
            fVar2.mo140711h(onlineVideoView, fVar, fVar.f264171d, fVar.f264168a.f298689d);
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }

    /* renamed from: f */
    public void mo138965f(CardLayoutManager cardLayoutManager) {
        SnsMethodCalculate.markStartTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        Log.m105924i("SnsAd.SlideFullCardVideoPlayHelper", "resumePlayByTimeline is called!");
        this.f291948b = true;
        if (cardLayoutManager != null) {
            try {
                int v = cardLayoutManager.mo24713v();
                if (v >= 0) {
                    mo138963d(cardLayoutManager, v, true);
                }
            } catch (Throwable unused) {
                Log.m105918d("SnsAd.SlideFullCardVideoPlayHelper", "resumePlayByTimeline has something wrong");
            }
        }
        SnsMethodCalculate.markEndTimeMs("triggerPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
    }
}
