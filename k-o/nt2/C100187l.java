package nt2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import co2.C92443k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.C19251a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p104ad.widget.stackup.StackUpLayout;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import er2.C97693b;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98957g;
import jp2.C98963o;
import kg3.C76577a;
import oq2.C100373a;
import oq2.C100375b;
import oq2.C100376c;
import oq2.C100377d;
import oq2.C100379f;
import qq2.C101239f;
import rq2.C101432s;
import rq2.C63505q;
import tp2.C101911a;
import tp2.C101913c;
import tp2.C101914d;
import vr2.C102236a0;

/* renamed from: nt2.l */
public class C100187l extends C100165c implements C97693b, C98957g {

    /* renamed from: A */
    public C100376c f293530A = new C100376c();

    /* renamed from: B */
    public C100375b f293531B;

    /* renamed from: C */
    public C100373a f293532C;

    /* renamed from: o */
    public Context f293533o;

    /* renamed from: p */
    public RoundedCornerFrameLayout f293534p;

    /* renamed from: q */
    public RecyclerView f293535q;

    /* renamed from: r */
    public ViewGroup f293536r;

    /* renamed from: s */
    public ImageView f293537s;

    /* renamed from: t */
    public TextView f293538t;

    /* renamed from: u */
    public StackUpLayout f293539u;

    /* renamed from: v */
    public TextView f293540v;

    /* renamed from: w */
    public CardLayoutManager f293541w;

    /* renamed from: x */
    public C98963o f293542x;

    /* renamed from: y */
    public C101239f f293543y = new C101239f();

    /* renamed from: z */
    public C100379f f293544z;

    /* renamed from: nt2.l$a */
    public class C100188a implements View.OnClickListener {
        public C100188a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/detail/item/TopicCardDetailItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem$1");
            C100373a aVar = C100187l.this.f293532C;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("updateBarClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                aVar.f293971d++;
                SnsMethodCalculate.markEndTimeMs("updateBarClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
            C100187l lVar = C100187l.this;
            lVar.mo139476h(view, lVar.f293412e);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/detail/item/TopicCardDetailItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C100187l(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar) {
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
        this.f293542x = oVar;
        this.f293532C = new C100373a(2);
    }

    /* renamed from: a */
    public void mo139451a(View view, View view2) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            mo139477i(view, view2);
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.TopicCardDetail", "the init view failed");
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|(2:6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0031 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139452b() {
        /*
            r7 = this;
            java.lang.String r0 = "onPause"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "SnsAd.TopicCardDetail"
            java.lang.String r3 = "the onPause is called"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            super.mo139452b()     // Catch:{ all -> 0x003b }
            oq2.f r2 = r7.f293544z     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = "pausePlayByTimeline"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x003b }
            r5 = 0
            r2.f294010b = r5     // Catch:{ all -> 0x003b }
            java.lang.String r5 = "SnsAd.TopicCardVideoPlayHelper"
            java.lang.String r6 = "the time line is paused, ready to play is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)     // Catch:{ all -> 0x003b }
            qq2.f r2 = r2.f294011c     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0031
            r2.mo140707d()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x003b }
        L_0x0034:
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r2 = r7.f293541w     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x003b
            r2.mo24712u()     // Catch:{ all -> 0x003b }
        L_0x003b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100187l.mo139452b():void");
    }

    /* renamed from: c */
    public void mo136948c(ViewGroup viewGroup, View view, int i) {
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            Log.m105918d("SnsAd.TopicCardDetail", "the item is click");
            mo139476h(view, this.f293412e);
            C100373a aVar = this.f293532C;
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
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            SnsInfo snsInfo = this.f293412e;
            if (snsInfo != null) {
                String W = C102236a0.m134728W(snsInfo);
                if (!TextUtils.isEmpty(W) && W.equals(str)) {
                    C63505q.m74843b(this.f293532C);
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    /* renamed from: g */
    public void mo139454g() {
        SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            Log.m105918d("SnsAd.TopicCardDetail", "the refresh view is called");
            C100379f fVar = this.f293544z;
            if (fVar != null) {
                fVar.mo139663f(this.f293541w);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    /* renamed from: h */
    public void mo139476h(View view, SnsInfo snsInfo) {
        int i;
        SnsMethodCalculate.markStartTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        Context context = this.f293533o;
        SnsMethodCalculate.markStartTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        C101913c a = C101911a.m134112a(5, context);
        SnsMethodCalculate.markEndTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (a != null) {
            C101914d dVar = new C101914d();
            C98963o oVar = this.f293542x;
            if (oVar != null) {
                dVar.mo141403a("sns_ad_statistic", oVar);
            }
            SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            C98963o oVar2 = this.f293542x;
            if (oVar2 != null) {
                i = oVar2.f290131k;
                SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            } else {
                i = 1;
                SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            }
            a.mo126055b(view, i, snsInfo, dVar);
        }
        C100375b bVar = this.f293531B;
        if (bVar != null) {
            bVar.mo139649b(snsInfo, false);
        }
        SnsMethodCalculate.markEndTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    /* renamed from: i */
    public void mo139477i(View view, View view2) {
        SnsInfo snsInfo;
        ViewGroup.LayoutParams layoutParams;
        int i;
        SnsMethodCalculate.markStartTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        if (view == null || (snsInfo = this.f293412e) == null || snsInfo.getAdXml() == null) {
            Log.m105928w("SnsAd.TopicCardDetail", "the content view is null??? the init view can't complete!!!!");
            SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            return;
        }
        C92443k kVar = this.f293412e.getAdXml().adFinderTopicInfo;
        if (kVar == null) {
            Log.m105928w("SnsAd.TopicCardDetail", "the adFinderTopicInfo is null");
            SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            return;
        }
        C100373a aVar = this.f293532C;
        if (aVar != null) {
            SnsInfo snsInfo2 = this.f293412e;
            SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            C98963o oVar = this.f293542x;
            if (oVar != null) {
                i = oVar.f290131k;
                SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            } else {
                SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i = 1;
            }
            aVar.mo139647e(snsInfo2, i, kVar);
        }
        this.f293533o = view.getContext();
        this.f293534p = (RoundedCornerFrameLayout) view.findViewById(C0966R.C0970id.jpm);
        this.f293535q = (RecyclerView) view.findViewById(C0966R.C0970id.jpl);
        this.f293537s = (ImageView) view.findViewById(C0966R.C0970id.jpi);
        this.f293538t = (TextView) view.findViewById(C0966R.C0970id.jpk);
        this.f293539u = (StackUpLayout) view.findViewById(C0966R.C0970id.jph);
        this.f293540v = (TextView) view.findViewById(C0966R.C0970id.jpg);
        this.f293536r = (ViewGroup) view.findViewById(C0966R.C0970id.jpj);
        ImageView imageView = this.f293537s;
        if (imageView != null) {
            imageView.setImageResource(C0966R.raw.sns_ad_finder_topic_item_rear_flag);
        }
        ViewGroup viewGroup = this.f293536r;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new C100188a());
        }
        C101432s.m133128j(this.f293538t, kVar.f264541c);
        C101432s.m133128j(this.f293540v, kVar.f264542d);
        StackUpLayout stackUpLayout = this.f293539u;
        if (stackUpLayout != null) {
            stackUpLayout.setStackUpWidthSize(C76577a.m92151b(this.f293533o, 6));
            int b = C76577a.m92151b(this.f293533o, 20);
            StackUpLayout stackUpLayout2 = this.f293539u;
            stackUpLayout2.getClass();
            SnsMethodCalculate.markStartTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            stackUpLayout2.f274524e = b;
            stackUpLayout2.f274525f = b;
            SnsMethodCalculate.markEndTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            this.f293530A.mo139654c(this.f293539u, this.f293412e);
        }
        if (this.f293534p != null) {
            float b2 = (float) C76577a.m92151b(this.f293533o, 8);
            this.f293534p.mo153905b(b2, b2, 0.0f, 0.0f);
        }
        if (this.f293535q != null) {
            SnsMethodCalculate.markStartTimeMs("resetRecyclerViewLayoutParams", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            RecyclerView recyclerView = this.f293535q;
            if (!(recyclerView == null || (layoutParams = recyclerView.getLayoutParams()) == null)) {
                layoutParams.height = C76577a.m92151b(this.f293533o, WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS);
            }
            SnsMethodCalculate.markEndTimeMs("resetRecyclerViewLayoutParams", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            this.f293541w = new CardLayoutManager(this.f293535q);
            C100379f fVar = new C100379f(this.f293543y, this.f293532C);
            this.f293544z = fVar;
            SnsInfo snsInfo3 = this.f293412e;
            SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            fVar.f294012d = snsInfo3;
            SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            this.f293541w.mo24707E(new C19251a(C76577a.m92151b(this.f293533o, 12), C76577a.m92151b(this.f293533o, 8)));
            this.f293541w.mo24708F(this.f293544z);
            this.f293535q.setLayoutManager(this.f293541w);
            C100377d dVar = new C100377d(this.f293535q, this.f293412e);
            dVar.setHasStableIds(true);
            SnsMethodCalculate.markStartTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            dVar.f294000h = this;
            SnsMethodCalculate.markEndTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            this.f293535q.setAdapter(dVar);
        }
        Context context = this.f293533o;
        if (context instanceof Activity) {
            C100375b bVar = new C100375b((Activity) context, this.f293540v, this.f293535q);
            this.f293531B = bVar;
            bVar.mo139649b(this.f293412e, true);
        }
        SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        C98963o oVar2 = this.f293542x;
        if (oVar2 != null) {
            String W = C102236a0.m134728W(this.f293412e);
            if (!TextUtils.isEmpty(W) && !"0".equals(W)) {
                oVar2.mo138294a(W, this);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }
}
