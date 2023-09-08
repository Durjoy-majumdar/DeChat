package ft2;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C95747c1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vending.base.Vending;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ex0.C45696d;
import ex0.C45700h;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import ht2.C98524a;
import ht2.C98525b;
import ht2.C98526c;
import ic0.C108455d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kp3.C88253a;
import l31.C61212e;
import p227rn.C63484s;
import p243tn.C14050a;
import qu2.C101302a;
import t91.C64208c;
import te3.C101789j00;
import te3.C101833r5;
import te3.C101842st2;

/* renamed from: ft2.c */
public class C97979c extends BaseAdapter implements C95747c1 {

    /* renamed from: j */
    public static HashMap<Long, c$$e> f287345j = new HashMap<>();

    /* renamed from: n */
    public static boolean f287346n = false;

    /* renamed from: o */
    public static int f287347o = 2;

    /* renamed from: d */
    public SnsTimeLineBaseAdapter f287348d;

    /* renamed from: e */
    public C98525b f287349e;

    /* renamed from: f */
    public boolean f287350f = false;

    /* renamed from: g */
    public boolean f287351g;

    /* renamed from: h */
    public C101302a f287352h;

    /* renamed from: i */
    public SparseArray<Integer> f287353i = new SparseArray<>();

    public C97979c(MMActivity mMActivity, ListView listView, TimelineClickListener timelineClickListener, BaseTimeLine baseTimeLine, int i, String str, C98525b bVar, Vending.C97302l lVar) {
        MMActivity mMActivity2 = mMActivity;
        this.f287348d = new SnsTimeLineBaseAdapter(mMActivity, listView, timelineClickListener, baseTimeLine, i, this);
        this.f287352h = new C101302a(mMActivity, baseTimeLine.mo132093o(), this.f287348d);
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f287348d;
        snsTimeLineBaseAdapter.getClass();
        SnsMethodCalculate.markStartTimeMs("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        snsTimeLineBaseAdapter.f278571e = true;
        SnsMethodCalculate.markEndTimeMs("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        C98525b cVar = bVar == null ? new C98526c() : bVar;
        this.f287349e = cVar;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = this.f287348d;
        C98524a aVar = (C98524a) cVar;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        aVar.f288924p = mMActivity2;
        aVar.f288923o = snsTimeLineBaseAdapter2;
        aVar.f288926r = str;
        C86709a0.m107528h();
        aVar.f288927s = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        C98525b bVar2 = this.f287349e;
        bVar2.getClass();
        C88253a.m109903b("Vending.ForwardVending", "Vending.setRangeSize(%s)", 10);
        bVar2.f285599d = 10;
        this.f287349e.addVendingDataChangedCallback(lVar);
    }

    /* renamed from: a */
    public static /* synthetic */ SparseArray m126542a(C97979c cVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        SparseArray<Integer> sparseArray = cVar.f287353i;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return sparseArray;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m126543b() {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        HashMap<Long, c$$e> hashMap = f287345j;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return hashMap;
    }

    /* renamed from: d */
    public static void m126544d(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C101789j00 j002 = timeLineObject.ContentObj;
        if (j002 == null || TextUtils.isEmpty(j002.f298426g)) {
            SnsMethodCalculate.markEndTimeMs("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        C45700h hVar = (C45700h) C86709a0.m107533q(C45700h.class);
        C101789j00 j003 = timeLineObject.ContentObj;
        String str = j003.f298426g;
        int i = f287347o;
        C101833r5 r5Var = timeLineObject.AppInfo;
        hVar.mo71036ed(str, i, r5Var != null ? r5Var.f299236d : "", j003.f298425f, j003.f298423d, "timeline", 1);
        SnsMethodCalculate.markEndTimeMs("addToPreauth", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    /* renamed from: f */
    public static void m126545f(TimeLineObject timeLineObject) {
        C101842st2 st22;
        Class cls = C45696d.class;
        SnsMethodCalculate.markStartTimeMs("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (TextUtils.isEmpty(timeLineObject.ContentObj.f298426g) || !timeLineObject.ContentObj.f298426g.contains(WeChatHosts.domainString(C0966R.string.f360885fm3))) {
            SnsMethodCalculate.markEndTimeMs("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        C101842st2 st23 = timeLineObject.ContentObj.f298430n;
        int i = st23 != null ? st23.f299443d : -1;
        ((C45696d) C86709a0.m107533q(cls)).Tn0(timeLineObject.ContentObj.f298426g, i, f287347o, timeLineObject.f283893Id, null, null, timeLineObject.UserName, Integer.valueOf(timeLineObject.CreateTime), Long.valueOf(((C45696d) C86709a0.m107533q(cls)).mo70963J2("__sns_timeline__")));
        if (!f287346n && i != -1 && ((C45696d) C86709a0.m107533q(cls)).mo70957E5(24)) {
            f287346n = true;
            ((C45696d) C86709a0.m107533q(cls)).mo70972RM(f287347o);
        }
        if (i == 16 && (st22 = timeLineObject.ContentObj.f298430n) != null && !Util.isNullOrNil(st22.f299452p)) {
            String zH = ((C63484s) C86312j.m106911c(C63484s.class)).mo60498zH(timeLineObject.ContentObj.f298430n.f299452p, 4);
            String b = C14050a.m13405b(zH);
            if (!C86013q1.m106450k(b)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59346b = true;
                bVar.f59350f = b;
                C20828a.m22825b().mo32515d(zH, bVar.mo32666a(), (C108455d) null);
            }
        }
        SnsMethodCalculate.markEndTimeMs("addToPreload", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    /* renamed from: k */
    public static void m126546k(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("recordScan", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C94866e1.my0().post(new c$$d(snsInfo, i));
        SnsMethodCalculate.markEndTimeMs("recordScan", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    /* renamed from: n */
    public static void m126547n(List<Map<String, Object>> list, int i) {
        SnsMethodCalculate.markStartTimeMs("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        if (list == null) {
            SnsMethodCalculate.markEndTimeMs("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return;
        }
        try {
            for (Map next : list) {
                Map<String, Object> i2 = C64208c.f181951a.mo89034i((Map) next.get("event_params"), i);
                ((C61212e) C86312j.m106911c(C61212e.class)).oh0(((Long) next.get("event_time")).longValue(), (String) next.get("event_id"), i2, 26236, false);
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.SnsTimeLineVendingAdapter", "err !!!" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("useSdkRouteReport", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    /* renamed from: F0 */
    public void mo133186F0(String str) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        this.f287349e.notifyVendingDataChange();
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    /* renamed from: g */
    public SnsTimeLineBaseAdapter mo137288g() {
        SnsMethodCalculate.markStartTimeMs("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f287348d;
        SnsMethodCalculate.markEndTimeMs("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return snsTimeLineBaseAdapter;
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        int i = this.f287349e.f285600e;
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return i;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return 0;
    }

    public int getItemViewType(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C101302a aVar = this.f287352h;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
        int j = aVar.f296791c.mo132920j(i);
        SnsInfo i2 = aVar.f296791c.mo132919i(i);
        C87412m.m108593f(i2, "adapter.getItem(position)");
        if (aVar.mo140761a(i2.isAd())) {
            SnsMethodCalculate.markStartTimeMs("improveViewTypeTransform", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter$Companion");
            if (j == 2) {
                j = 37;
            } else if (j == 3 || j == 4 || j == 5) {
                j = 36;
            } else if (j == 9) {
                j = 38;
            }
            SnsMethodCalculate.markEndTimeMs("improveViewTypeTransform", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter$Companion");
            SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
        } else {
            SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "getView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.ui.w6 r5 = r21.mo133189h0(r22)
            qu2.a r6 = r0.f287352h
            r6.getClass()
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r7)
            java.lang.String r8 = "struct"
            gy3.C87412m.m108594g(r5, r8)
            java.lang.String r10 = ""
            if (r2 == 0) goto L_0x0034
            boolean r11 = r2 instanceof pu2.C100921i0
            if (r11 != 0) goto L_0x0034
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r7)
            r0 = r2
            r2 = r3
            r16 = r4
            r20 = r10
            goto L_0x02c1
        L_0x0034:
            boolean r11 = r5.f281391r
            boolean r11 = r6.mo140761a(r11)
            java.lang.String r12 = "MicroMsg.Improve.SnsTimelineImproveAdapter"
            if (r11 == 0) goto L_0x028a
            uu2.a r13 = uu2.C102112a.f300683a
            r15 = 1
            if (r2 == 0) goto L_0x0045
            r9 = 1
            goto L_0x0046
        L_0x0045:
            r9 = 0
        L_0x0046:
            r13.mo141614c(r1, r9)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r5.f281367a
            int r8 = r6.f296790b
            if (r8 == r15) goto L_0x0051
            r8 = 1
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            int r8 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122255q(r9, r8)
            java.lang.String r9 = "improveViewTypeTransform"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.item.improve.adapter.SnsTimelineImproveAdapter$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r15)
            r14 = 3
            r16 = r4
            r4 = 2
            if (r8 == r4) goto L_0x0076
            if (r8 == r14) goto L_0x0073
            r4 = 4
            if (r8 == r4) goto L_0x0073
            r4 = 5
            if (r8 == r4) goto L_0x0073
            r4 = 9
            if (r8 == r4) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            r8 = 38
            goto L_0x0078
        L_0x0073:
            r8 = 36
            goto L_0x0078
        L_0x0076:
            r8 = 37
        L_0x0078:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r15)
            java.lang.String r4 = "preHandleStruct"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r5.f281367a
            java.lang.String r9 = r9.getSnsId()
            r15 = 2
            boolean r15 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120626g(r9, r15)
            r14 = 22
            if (r15 == 0) goto L_0x00ab
            if (r8 == r14) goto L_0x00ab
            com.tencent.mm.plugin.sns.model.w1$b r15 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120624e(r9)
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r5.f281367a
            r17 = r15
            long r14 = r14.field_snsId
            r18 = 0
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 != 0) goto L_0x00a8
            com.tencent.mm.plugin.sns.model.w1$b r15 = new com.tencent.mm.plugin.sns.model.w1$b
            r15.<init>()
            goto L_0x00ac
        L_0x00a8:
            r15 = r17
            goto L_0x00ac
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            java.util.ArrayList r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122251f(r9)
            r5.f281376e0 = r1
            r5.f281378f0 = r15
            java.util.ArrayList<com.tencent.mm.plugin.sns.model.w1$b> r14 = r5.f281380g0
            r14.clear()
            java.util.ArrayList<com.tencent.mm.plugin.sns.model.w1$b> r14 = r5.f281380g0
            r14.addAll(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
            java.lang.String r4 = " hash:"
            java.lang.String r9 = " view:"
            java.lang.String r14 = " viewType:"
            if (r2 != 0) goto L_0x0231
            long r17 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "getViewByType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            java.lang.String r15 = "checkItemEnableImprove"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r0)
            java.lang.Class<h81.h> r19 = h81.C32735h.class
            di3.d r19 = di3.C86312j.m106911c(r19)
            r2 = r19
            h81.h r2 = (h81.C32735h) r2
            r19 = r3
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_sns_improve_feed_list_v1
            java.lang.String r2 = r2.Y60(r3, r10)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x00f7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
            r20 = r10
            goto L_0x0112
        L_0x00f7:
            if (r2 == 0) goto L_0x0109
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r20 = r10
            r10 = 0
            boolean r2 = z04.C112550d0.m153801u(r2, r3, r10)
            r3 = 1
            if (r2 != r3) goto L_0x010c
            r3 = 1
            goto L_0x010d
        L_0x0109:
            r20 = r10
            r10 = 0
        L_0x010c:
            r3 = 0
        L_0x010d:
            if (r3 == 0) goto L_0x0114
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
        L_0x0112:
            r10 = 1
            goto L_0x0117
        L_0x0114:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r0)
        L_0x0117:
            if (r10 == 0) goto L_0x019e
            r0 = 1
            if (r8 == r0) goto L_0x0191
            r0 = 16
            if (r8 == r0) goto L_0x0191
            r0 = 18
            if (r8 == r0) goto L_0x0187
            r0 = 20
            if (r8 == r0) goto L_0x017d
            r0 = 22
            if (r8 == r0) goto L_0x0173
            r0 = 24
            if (r8 == r0) goto L_0x0169
            r0 = 3
            if (r8 == r0) goto L_0x015f
            r0 = 4
            if (r8 == r0) goto L_0x015f
            r0 = 5
            if (r8 == r0) goto L_0x015f
            r0 = 6
            if (r8 == r0) goto L_0x0155
            switch(r8) {
                case 36: goto L_0x015f;
                case 37: goto L_0x014b;
                case 38: goto L_0x0141;
                default: goto L_0x013f;
            }
        L_0x013f:
            r0 = 0
            goto L_0x019a
        L_0x0141:
            pu2.m r0 = new pu2.m
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x014b:
            pu2.k r0 = new pu2.k
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x0155:
            pu2.l r0 = new pu2.l
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x015f:
            pu2.i r0 = new pu2.i
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x0169:
            pu2.h r0 = new pu2.h
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x0173:
            pu2.g r0 = new pu2.g
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x017d:
            pu2.b r0 = new pu2.b
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x0187:
            pu2.e r0 = new pu2.e
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
            goto L_0x019a
        L_0x0191:
            pu2.j r0 = new pu2.j
            android.content.Context r2 = r6.f296789a
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r0.<init>(r2, r5, r3)
        L_0x019a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            goto L_0x01a2
        L_0x019e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            r0 = 0
        L_0x01a2:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r17
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "create "
            r10.append(r11)
            r10.append(r1)
            r10.append(r14)
            r10.append(r8)
            r10.append(r9)
            if (r0 == 0) goto L_0x01c5
            java.lang.String r8 = r0.mo87544n()
            goto L_0x01c6
        L_0x01c5:
            r8 = 0
        L_0x01c6:
            r10.append(r8)
            r10.append(r4)
            if (r0 == 0) goto L_0x01d7
            int r4 = r0.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            goto L_0x01d8
        L_0x01d7:
            r9 = 0
        L_0x01d8:
            r10.append(r9)
            java.lang.String r4 = " cost:"
            r10.append(r4)
            r10.append(r2)
            java.lang.String r4 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            r13.mo141612a(r1, r2)
            r6.mo140762b(r1, r0, r5)
            if (r0 == 0) goto L_0x0216
            r2 = 2131296865(0x7f090261, float:1.8211659E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "itemView.findViewById(R.id.album_show_comment_tv)"
            gy3.C87412m.m108593f(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r3 = r6.f296791c
            r3.getClass()
            java.lang.String r4 = "registerIgnore"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            java.util.List<android.view.View> r3 = r3.f278566R
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
        L_0x0216:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r17
            r13.mo141613b(r1, r2)
            boolean r2 = r5.f281391r
            r13.mo141617e((int) r1, (boolean) r2)
            r13.mo141615d(r1)
            r2 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            r9 = r0
            r0 = r23
            goto L_0x02c2
        L_0x0231:
            r0 = r2
            r2 = r3
            r20 = r10
            boolean r3 = r0 instanceof pu2.C100921i0
            if (r3 == 0) goto L_0x0290
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = "reuse "
            r3.append(r15)
            r3.append(r1)
            r3.append(r14)
            r3.append(r8)
            r3.append(r9)
            r8 = r0
            pu2.i0 r8 = (pu2.C100921i0) r8
            java.lang.String r9 = r8.mo87544n()
            r3.append(r9)
            r3.append(r4)
            int r4 = r8.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            r6.mo140762b(r1, r8, r5)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r10
            r13.mo141612a(r1, r3)
            r13.mo141613b(r1, r3)
            boolean r3 = r5.f281391r
            r13.mo141617e((int) r1, (boolean) r3)
            r13.mo141615d(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            r9 = r0
            goto L_0x02c2
        L_0x028a:
            r0 = r2
            r2 = r3
            r16 = r4
            r20 = r10
        L_0x0290:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get view use old item["
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = "],position:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " convertView:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " id:"
            r3.append(r4)
            java.lang.String r4 = r5.f281382i
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
        L_0x02c1:
            r9 = 0
        L_0x02c2:
            if (r9 == 0) goto L_0x02e5
            r3 = r21
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r3.f287348d
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r0 = r0.f278568b
            com.tencent.mm.plugin.sns.model.m2 r0 = r0.f276700g
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r0 = r0.mo130970a()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r5.f281367a
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r4.getTimeLine()
            r0.mo131315b(r4, r5, r1)
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r3.f287348d
            java.util.HashMap<java.lang.Integer, android.view.View> r0 = r0.f278587u
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r0.put(r4, r9)
            goto L_0x02ed
        L_0x02e5:
            r3 = r21
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r4 = r3.f287348d
            android.view.View r9 = r4.mo132914b(r1, r0)
        L_0x02ed:
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            java.lang.String r4 = "reportSdkSnsLive"
            r5 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            if (r9 != 0) goto L_0x02fe
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L_0x0380
        L_0x02fe:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r6 = r3.f287348d
            if (r6 == 0) goto L_0x037d
            int r6 = r6.mo132920j(r1)
            r7 = 20
            if (r6 == r7) goto L_0x030e
            r7 = 33
            if (r6 != r7) goto L_0x037d
        L_0x030e:
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r6 = r3.f287348d
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r6.mo132919i(r1)
            if (r1 == 0) goto L_0x037d
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()
            te3.j00 r6 = r1.ContentObj
            if (r6 == 0) goto L_0x037d
            te3.p81 r6 = r6.f298435s
            if (r6 == 0) goto L_0x037d
            di3.d r7 = di3.C86312j.m106911c(r0)
            l31.e r7 = (l31.C61212e) r7
            r7.se0(r9)
            java.lang.Class<ir.n> r7 = p565ir.C60606n.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ir.n r7 = (p565ir.C60606n) r7
            boolean r7 = r7.mo85005G0(r6)
            if (r7 != 0) goto L_0x037d
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r8 = r6.f184780f
            java.lang.String r10 = "feed_id"
            r7.put(r10, r8)
            java.lang.String r8 = r6.f184778d
            java.lang.String r10 = "live_id"
            r7.put(r10, r8)
            java.lang.String r8 = "comment_scene"
            java.lang.String r10 = "temp_6"
            r7.put(r8, r10)
            java.lang.String r8 = r6.f184779e
            java.lang.String r10 = "finder_username"
            r7.put(r10, r8)
            java.lang.String r8 = "session_buffer"
            r10 = r20
            r7.put(r8, r10)
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            java.lang.String r8 = "live_room_card_item"
            l31.e r0 = r0.o30(r9, r8)
            l31.e r0 = r0.mo86149PM(r9, r7)
            ft2.d r7 = new ft2.d
            r7.<init>(r3, r6, r1)
            r0.E60(r9, r7)
        L_0x037d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x0380:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x038c
            ft2.c$$c r0 = new ft2.c$$c
            r0.<init>(r3)
            r9.setOnLongClickListener(r0)
        L_0x038c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ft2.C97979c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        SnsMethodCalculate.markStartTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        SnsMethodCalculate.markEndTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return 42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[EDGE_INSN: B:19:0x003b->B:16:0x003b ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo137293h(boolean r10) {
        /*
            r9 = this;
            java.lang.String r0 = "getCurFirstSnsId"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r9.getItem((int) r2)
            r5 = 0
            if (r10 == 0) goto L_0x001b
            if (r4 == 0) goto L_0x002c
            long r7 = r4.field_snsId
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x002c
        L_0x0019:
            r5 = r7
            goto L_0x003b
        L_0x001b:
            if (r4 == 0) goto L_0x002c
            r7 = 32
            boolean r7 = r4.isSourceExist(r7)
            if (r7 != 0) goto L_0x002c
            long r7 = r4.field_snsId
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            int r3 = r3 + 1
            int r2 = r2 + 1
            int r4 = r9.getCount()
            if (r2 < r4) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 <= r4) goto L_0x0009
        L_0x003b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ft2.C97979c.mo137293h(boolean):long");
    }

    /* renamed from: h0 */
    public C96275w6 mo133189h0(int i) {
        SnsMethodCalculate.markStartTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C96275w6 w6Var = (C96275w6) mo137295j().mo136391a(i);
        SnsMethodCalculate.markEndTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return w6Var;
    }

    /* renamed from: i */
    public long mo137294i() {
        long j;
        SnsMethodCalculate.markStartTimeMs("getCurLastSnsId", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        int count = getCount() - 1;
        int i = 0;
        while (true) {
            SnsInfo item = getItem(count);
            j = 0;
            if (item != null && !item.isSourceExist(32)) {
                long j2 = item.field_snsId;
                if (j2 != 0) {
                    j = j2;
                    break;
                }
            }
            i++;
            count--;
            if (count >= 0) {
                if (i > 500) {
                    break;
                }
            } else {
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCurLastSnsId", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return j;
    }

    /* renamed from: j */
    public C98525b mo137295j() {
        SnsMethodCalculate.markStartTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C98525b bVar = this.f287349e;
        SnsMethodCalculate.markEndTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return bVar;
    }

    /* renamed from: l */
    public void mo137296l(View view, int i) {
        int i2;
        SnsMethodCalculate.markStartTimeMs("traverseViewGroup", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        int i3 = 0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            i2 = viewGroup.getChildCount();
            for (int i4 = 0; i4 < i2; i4++) {
                if (viewGroup.getChildAt(i4) instanceof ViewGroup) {
                    mo137296l(viewGroup.getChildAt(i4), i + 1);
                }
            }
        } else {
            i2 = 0;
        }
        if (this.f287353i.get(i) != null) {
            i3 = this.f287353i.get(i).intValue();
        }
        this.f287353i.put(i, Integer.valueOf(i3 + i2));
        SnsMethodCalculate.markEndTimeMs("traverseViewGroup", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
    }

    /* renamed from: l0 */
    public /* bridge */ /* synthetic */ Vending mo133190l0() {
        SnsMethodCalculate.markStartTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C98525b j = mo137295j();
        SnsMethodCalculate.markEndTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return j;
    }

    public SnsInfo getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C96275w6 w6Var = (C96275w6) this.f287349e.mo136391a(i);
        if (w6Var == null) {
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            return null;
        }
        SnsInfo snsInfo = w6Var.f281367a;
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        return snsInfo;
    }
}
