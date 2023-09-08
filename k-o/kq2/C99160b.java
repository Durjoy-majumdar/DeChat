package kq2;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bv2.C92312b;
import bv2.C92313c;
import co2.C92443k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.C19251a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p104ad.widget.stackup.StackUpLayout;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import er2.C97693b;
import jp2.C98957g;
import jp2.C98963o;
import kg3.C76577a;
import oq2.C100373a;
import oq2.C100375b;
import oq2.C100376c;
import oq2.C100379f;
import qq2.C101239f;
import rq2.C101432s;
import rq2.C63505q;
import tp2.C101911a;
import tp2.C101913c;
import tp2.C101914d;
import vr2.C102236a0;

/* renamed from: kq2.b */
public class C99160b extends BaseTimeLineItem implements C92312b, C97693b, C98957g {

    /* renamed from: q */
    public CardLayoutManager f290749q;

    /* renamed from: r */
    public C101239f f290750r = new C101239f();

    /* renamed from: s */
    public C99161a f290751s;

    /* renamed from: t */
    public SnsInfo f290752t;

    /* renamed from: u */
    public C100375b f290753u;

    /* renamed from: v */
    public C100379f f290754v;

    /* renamed from: w */
    public C100376c f290755w = new C100376c();

    /* renamed from: x */
    public C100373a f290756x;

    /* renamed from: kq2.b$a */
    public static class C99161a extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public ViewGroup f290757F0;

        /* renamed from: G0 */
        public RoundedCornerFrameLayout f290758G0;

        /* renamed from: H0 */
        public RecyclerView f290759H0;

        /* renamed from: I0 */
        public ViewGroup f290760I0;

        /* renamed from: J0 */
        public ImageView f290761J0;

        /* renamed from: K0 */
        public TextView f290762K0;

        /* renamed from: L0 */
        public StackUpLayout f290763L0;

        /* renamed from: M0 */
        public TextView f290764M0;
    }

    /* renamed from: C */
    public final void mo138525C(SnsInfo snsInfo, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        C98963o oVar;
        BaseTimeLine baseTimeLine;
        SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
            Activity activity = this.f279904e;
            oVar = activity instanceof SnsTimeLineUI ? ((SnsTimeLineUI) activity).mo132956s8() : null;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (oVar != null) {
            String W = C102236a0.m134728W(snsInfo);
            if (!TextUtils.isEmpty(W) && !"0".equals(W)) {
                oVar.mo138294a(W, this);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* renamed from: D */
    public void mo138526D(View view, SnsInfo snsInfo) {
        C98963o s8;
        SnsMethodCalculate.markStartTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        Activity activity = this.f279904e;
        SnsMethodCalculate.markStartTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        C101913c a = C101911a.m134112a(5, activity);
        SnsMethodCalculate.markEndTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (a != null) {
            C101914d dVar = new C101914d();
            Activity activity2 = this.f279904e;
            if ((activity2 instanceof SnsTimeLineUI) && (s8 = ((SnsTimeLineUI) activity2).mo132956s8()) != null) {
                dVar.mo141403a("sns_ad_statistic", s8);
            }
            a.mo126055b(view, 0, snsInfo, dVar);
            SnsInfo snsInfo2 = this.f290752t;
            SnsMethodCalculate.markStartTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            C100375b bVar = this.f290753u;
            if (bVar != null) {
                bVar.mo139649b(snsInfo2, false);
            }
            SnsMethodCalculate.markEndTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        }
        SnsMethodCalculate.markEndTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138527E(kq2.C99160b.C99161a r10, com.tencent.p014mm.plugin.sns.storage.SnsInfo r11, co2.C92443k r12) {
        /*
            r9 = this;
            java.lang.String r12 = "fillTopicCardContent"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r0)
            oq2.f r1 = r9.f290754v
            if (r1 == 0) goto L_0x0018
            java.lang.String r2 = "setSnsInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r1.f294012d = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView r1 = r10.f290759H0
            if (r1 == 0) goto L_0x0079
            androidx.recyclerview.widget.RecyclerView$e r2 = r1.getAdapter()
            boolean r3 = r2 instanceof oq2.C100377d
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter"
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0056
            r3 = r2
            oq2.d r3 = (oq2.C100377d) r3
            r3.getClass()
            java.lang.String r7 = "isSameSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            if (r11 != 0) goto L_0x003a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x004f
        L_0x003a:
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.f293998f     // Catch:{ all -> 0x004c }
            java.lang.String r3 = vr2.C102236a0.m134728W(r3)     // Catch:{ all -> 0x004c }
            java.lang.String r8 = vr2.C102236a0.m134728W(r11)     // Catch:{ all -> 0x004c }
            boolean r3 = java.util.Objects.equals(r3, r8)     // Catch:{ all -> 0x004c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x0050
        L_0x004c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0056
            r2.notifyDataSetChanged()
            goto L_0x0057
        L_0x0056:
            r6 = 1
        L_0x0057:
            if (r6 == 0) goto L_0x0079
            java.lang.String r2 = "SnsAd.FinderTopicTimeLineItem"
            java.lang.String r3 = "the adapter sns info is not same"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            oq2.d r2 = new oq2.d
            androidx.recyclerview.widget.RecyclerView r10 = r10.f290759H0
            r2.<init>(r10, r11)
            r2.setHasStableIds(r5)
            java.lang.String r10 = "setItemClickListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
            r2.f294000h = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            r1.setAdapter(r2)
        L_0x0079:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kq2.C99160b.mo138527E(kq2.b$a, com.tencent.mm.plugin.sns.storage.SnsInfo, co2.k):void");
    }

    /* renamed from: F */
    public final void mo138528F(C99161a aVar) {
        SnsMethodCalculate.markStartTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        ViewGroup viewGroup = aVar.f290757F0;
        if (viewGroup == null) {
            Log.m105920e("SnsAd.FinderTopicTimeLineItem", "fillViewHolder::the root null, is it right????");
            SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        aVar.f290758G0 = (RoundedCornerFrameLayout) viewGroup.findViewById(C0966R.C0970id.jpm);
        aVar.f290759H0 = (RecyclerView) viewGroup.findViewById(C0966R.C0970id.jpl);
        aVar.f290761J0 = (ImageView) viewGroup.findViewById(C0966R.C0970id.jpi);
        aVar.f290762K0 = (TextView) viewGroup.findViewById(C0966R.C0970id.jpk);
        aVar.f290763L0 = (StackUpLayout) viewGroup.findViewById(C0966R.C0970id.jph);
        aVar.f290764M0 = (TextView) viewGroup.findViewById(C0966R.C0970id.jpg);
        aVar.f290760I0 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.jpj);
        ImageView imageView = aVar.f290761J0;
        if (imageView != null) {
            imageView.setImageResource(C0966R.raw.sns_ad_finder_topic_item_rear_flag);
        }
        StackUpLayout stackUpLayout = aVar.f290763L0;
        if (stackUpLayout != null) {
            stackUpLayout.setStackUpWidthSize(C76577a.m92151b(this.f279904e, 6));
            int b = C76577a.m92151b(this.f279904e, 20);
            SnsMethodCalculate.markStartTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            stackUpLayout.f274524e = b;
            stackUpLayout.f274525f = b;
            SnsMethodCalculate.markEndTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        }
        if (aVar.f290758G0 != null) {
            float b2 = (float) C76577a.m92151b(this.f279904e, 8);
            aVar.f290758G0.mo153905b(b2, b2, 0.0f, 0.0f);
        }
        RecyclerView recyclerView = aVar.f290759H0;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            CardLayoutManager cardLayoutManager = new CardLayoutManager(aVar.f290759H0);
            this.f290749q = cardLayoutManager;
            this.f290754v = new C100379f(this.f290750r, this.f290756x);
            cardLayoutManager.mo24707E(new C19251a(C76577a.m92151b(this.f279904e, 12), C76577a.m92151b(this.f279904e, 8)));
            this.f290749q.mo24708F(this.f290754v);
            aVar.f290759H0.setLayoutManager(this.f290749q);
        }
        this.f290753u = new C100375b(this.f279904e, aVar.f290764M0, aVar.f290759H0);
        SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|(2:6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0049 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126294b() {
        /*
            r9 = this;
            java.lang.String r0 = "onUIPause"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "SnsAd.FinderTopicTimeLineItem"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "the item  video onUIPause!!! item hash "
            r3.append(r4)     // Catch:{ all -> 0x0054 }
            int r4 = r9.hashCode()     // Catch:{ all -> 0x0054 }
            r3.append(r4)     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0054 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ all -> 0x0054 }
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r2 = r9.f290749q     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "onPause"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)     // Catch:{ all -> 0x0054 }
            oq2.f r4 = r9.f290754v     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x004c
            java.lang.String r5 = "pausePlayByTimeline"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)     // Catch:{ all -> 0x0054 }
            r7 = 0
            r4.f294010b = r7     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "SnsAd.TopicCardVideoPlayHelper"
            java.lang.String r8 = "the time line is paused, ready to play is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0054 }
            qq2.f r4 = r4.f294011c     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0049
            r4.mo140707d()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)     // Catch:{ all -> 0x0054 }
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.mo24712u()     // Catch:{ all -> 0x0054 }
        L_0x0051:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)     // Catch:{ all -> 0x0054 }
        L_0x0054:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kq2.C99160b.mo126294b():void");
    }

    /* renamed from: c */
    public void mo136948c(ViewGroup viewGroup, View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            mo138526D(view, this.f290752t);
            C100373a aVar = this.f290756x;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                C100373a.C100374a d = aVar.mo139646d(i);
                if (d != null) {
                    d.f293977d++;
                }
                SnsMethodCalculate.markEndTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            SnsInfo snsInfo = this.f290752t;
            if (snsInfo != null) {
                String W = C102236a0.m134728W(snsInfo);
                if (!TextUtils.isEmpty(W) && W.equals(str)) {
                    C63505q.m74843b(this.f290756x);
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            Log.m105918d("SnsAd.FinderTopicTimeLineItem", "the item video play!!! item hash " + hashCode());
            C96254a.m123394d().mo133938k();
            C92313c.m116089a().mo126302e(this);
            C100379f fVar = this.f290754v;
            if (fVar != null) {
                fVar.mo139663f(this.f290749q);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    public Rect getDisplayRect() {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            C99161a aVar = this.f290751s;
            if (!(aVar == null || (roundedCornerFrameLayout = aVar.f290758G0) == null)) {
                int[] iArr = new int[2];
                roundedCornerFrameLayout.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                Rect rect = new Rect(i, i2, aVar.f290758G0.getWidth() + i, aVar.f290758G0.getHeight() + i2);
                SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                return rect;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        return null;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        Log.m105918d("SnsAd.FinderTopicTimeLineItem", "AdFinderTopicTimeLineItem build content is called");
        if (!(baseViewHolder instanceof C99161a)) {
            Log.m105920e("SnsAd.FinderTopicTimeLineItem", "buildContent::the holder is not type of FinderTopicItemViewHolder!!!");
            SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        this.f290751s = (C99161a) baseViewHolder;
        try {
            if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c0p);
                if (!baseViewHolder.f279976q) {
                    this.f290751s.f290757F0 = (ViewGroup) BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                    baseViewHolder.f279976q = true;
                }
            } else if (!baseViewHolder.f279976q) {
                this.f290751s.f290757F0 = (ViewGroup) baseViewHolder.f279960i.findViewById(C0966R.C0970id.f5532hl);
                baseViewHolder.f279976q = true;
            }
            this.f290756x = new C100373a(1);
            mo138528F(this.f290751s);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (!(baseViewHolder instanceof C99161a)) {
            Log.m105920e("SnsAd.FinderTopicTimeLineItem", "fillItem::the holder is not type of FinderTopicItemViewHolder!!!");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } else if (w6Var == null) {
            Log.m105920e("SnsAd.FinderTopicTimeLineItem", "fillItem::the struct is null!!!");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } else if (baseViewHolder.f279985u0) {
            Log.m105924i("SnsAd.FinderTopicTimeLineItem", "holder is busy");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } else {
            baseViewHolder.f279985u0 = true;
            SnsInfo snsInfo = w6Var.f281367a;
            if (snsInfo == null || snsInfo.getAdXml() == null) {
                SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                return;
            }
            this.f290752t = snsInfo;
            StringBuilder sb = new StringBuilder();
            sb.append("ad fillItem, finderTopicItem, pos=");
            sb.append(i);
            sb.append(", snsId=");
            sb.append(timeLineObject == null ? "" : timeLineObject.f283893Id);
            sb.append(", hash=");
            sb.append(hashCode());
            Log.m105924i("SnsAd.FinderTopicTimeLineItem", sb.toString());
            try {
                C99161a aVar = (C99161a) baseViewHolder;
                C92443k kVar = snsInfo.getAdXml().adFinderTopicInfo;
                SnsMethodCalculate.markStartTimeMs("fillRelationAvatarAndText", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                C101432s.m133128j(aVar.f290764M0, kVar.f264542d);
                this.f290755w.mo139654c(aVar.f290763L0, snsInfo);
                SnsMethodCalculate.markEndTimeMs("fillRelationAvatarAndText", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                SnsMethodCalculate.markStartTimeMs("fillTopicRearFlagTextAndImage", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                TextView textView = aVar.f290762K0;
                if (textView != null) {
                    textView.setText(kVar.f264541c);
                }
                ViewGroup viewGroup = aVar.f290760I0;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new C99159a(this, snsInfo));
                }
                SnsMethodCalculate.markEndTimeMs("fillTopicRearFlagTextAndImage", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                mo138527E(aVar, snsInfo, kVar);
                SnsMethodCalculate.markStartTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                C100375b bVar = this.f290753u;
                if (bVar != null) {
                    bVar.mo139649b(snsInfo, true);
                }
                SnsMethodCalculate.markEndTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                C100373a aVar2 = this.f290756x;
                if (aVar2 != null) {
                    aVar2.mo139647e(snsInfo, 0, kVar);
                }
                mo138525C(snsInfo, snsTimeLineBaseAdapter);
            } catch (Throwable unused) {
            }
            baseViewHolder.f279985u0 = false;
            mo133391g(w6Var, 3);
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|(2:6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pause() {
        /*
            r9 = this;
            java.lang.String r0 = "pause"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "SnsAd.FinderTopicTimeLineItem"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "the item  video pause!!! item hash "
            r3.append(r4)     // Catch:{ all -> 0x0054 }
            int r4 = r9.hashCode()     // Catch:{ all -> 0x0054 }
            r3.append(r4)     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0054 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ all -> 0x0054 }
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r2 = r9.f290749q     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "onPause"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)     // Catch:{ all -> 0x0054 }
            oq2.f r4 = r9.f290754v     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x004c
            java.lang.String r5 = "pausePlayByTimeline"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)     // Catch:{ all -> 0x0054 }
            r7 = 0
            r4.f294010b = r7     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "SnsAd.TopicCardVideoPlayHelper"
            java.lang.String r8 = "the time line is paused, ready to play is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)     // Catch:{ all -> 0x0054 }
            qq2.f r4 = r4.f294011c     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0049
            r4.mo140707d()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)     // Catch:{ all -> 0x0054 }
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.mo24712u()     // Catch:{ all -> 0x0054 }
        L_0x0051:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)     // Catch:{ all -> 0x0054 }
        L_0x0054:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kq2.C99160b.pause():void");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            Log.m105918d("SnsAd.FinderTopicTimeLineItem", "the item video stop!!! item hash " + hashCode());
            C101239f fVar = this.f290750r;
            if (fVar != null) {
                fVar.mo140712i();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        return "AdFinderTopicTimeLineItem";
    }
}
