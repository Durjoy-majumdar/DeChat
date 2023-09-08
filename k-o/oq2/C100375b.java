package oq2;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.dynamic.listener.RequestListenerManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq2.C97354d;
import dq2.C97520a;
import eq2.C97689a;
import eq2.C97690b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vr2.C102236a0;

/* renamed from: oq2.b */
public class C100375b implements C97689a {

    /* renamed from: a */
    public WeakReference<Activity> f293985a;

    /* renamed from: b */
    public TextView f293986b;

    /* renamed from: c */
    public RecyclerView f293987c;

    /* renamed from: d */
    public SnsInfo f293988d;

    /* renamed from: e */
    public C97354d.C97355a f293989e;

    public C100375b(Activity activity, TextView textView, RecyclerView recyclerView) {
        if (activity != null) {
            this.f293985a = new WeakReference<>(activity);
            this.f293989e = new C97520a(activity);
        }
        this.f293986b = textView;
        this.f293987c = recyclerView;
    }

    /* renamed from: a */
    public void mo136945a(String str, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        try {
            mo139651d(str, obj);
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.TopicCardDynamic", "the on result failed!");
        }
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
    }

    /* renamed from: b */
    public void mo139649b(SnsInfo snsInfo, boolean z) {
        SnsMethodCalculate.markStartTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        try {
            mo139650c(snsInfo, z);
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.TopicCardDynamic", "doDynamicRequest failed!!!");
        }
        SnsMethodCalculate.markEndTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
    }

    /* renamed from: c */
    public final void mo139650c(SnsInfo snsInfo, boolean z) {
        Activity activity;
        String str;
        SnsInfo snsInfo2 = snsInfo;
        SnsMethodCalculate.markStartTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        if (snsInfo2 == null) {
            Log.m105928w("SnsAd.TopicCardDynamic", "Are you OK??? The input sns info or listener is null!!");
            SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        } else if (this.f293989e == null) {
            Log.m105928w("SnsAd.TopicCardDynamic", "Are you OK??? I think the activity is null, which is input in constructor!!!!");
            SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        } else {
            String W = C102236a0.m134728W(snsInfo);
            if (TextUtils.isEmpty(W) || "0".equals(W)) {
                Log.m105928w("SnsAd.TopicCardDynamic", "the sns id is empty!! Are you sure?");
                SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            WeakReference<Activity> weakReference = this.f293985a;
            if (weakReference == null) {
                SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                activity = null;
            } else {
                activity = weakReference.get();
                SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            }
            if (activity == null) {
                Log.m105928w("SnsAd.TopicCardDynamic", "the context is null! Is activity destroyed?");
                SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                return;
            }
            RequestListenerManager a = RequestListenerManager.m119934a(activity);
            if (a == null) {
                Log.m105928w("SnsAd.TopicCardDynamic", "OK, i fu le you!!! the activity is not life cycle owner!");
                SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            C97690b bVar = a.f274152d;
            if (bVar != null) {
                SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                if (!TextUtils.isEmpty(W)) {
                    WeakReference weakReference2 = (WeakReference) ((HashMap) bVar.f286536a).get(W);
                    if (weakReference2 == null || weakReference2.get() != this) {
                        SnsMethodCalculate.markStartTimeMs("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                        Iterator it = ((HashMap) bVar.f286536a).entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                SnsMethodCalculate.markEndTimeMs("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                                str = null;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null && entry.getValue() == this) {
                                str = (String) entry.getKey();
                                SnsMethodCalculate.markEndTimeMs("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                                break;
                            }
                        }
                        if (!TextUtils.isEmpty(str) && !str.equals(W)) {
                            ((HashMap) bVar.f286536a).remove(str);
                        }
                        ((HashMap) bVar.f286536a).put(W, new WeakReference(this));
                        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                    }
                } else {
                    SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                }
            }
            SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
            C97354d c = C97354d.m125367c(activity);
            if (c == null) {
                Log.m105928w("SnsAd.TopicCardDynamic", "OK, i fule you!!! the request manager is null. Isn't the RequestManager singleton?");
                SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
                return;
            }
            this.f293988d = snsInfo2;
            C97354d.C97355a aVar = this.f293989e;
            SnsMethodCalculate.markStartTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            if (aVar == null || snsInfo.getAdXml() == null) {
                Log.m105928w("SnsAd.DynamicUpdate", "the sns info or request action is null, please check it !!!");
                SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            } else {
                try {
                    String W2 = C102236a0.m134728W(snsInfo);
                    if (!TextUtils.isEmpty(W2)) {
                        if (!"0".equals(W2)) {
                            ADXml adXml = snsInfo.getAdXml();
                            C97520a aVar2 = (C97520a) aVar;
                            SnsMethodCalculate.markStartTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                            SnsMethodCalculate.markEndTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                            if (!c.mo136624d(W2, 3, adXml.adDynamicUpdateInfo, z)) {
                                Log.m105924i("SnsAd.DynamicUpdate", "the request is too frequently, snsId is " + W2);
                                SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                            } else {
                                Log.m105918d("SnsAd.DynamicUpdate", "it is going to do dynamic request, snsId is " + W2);
                                aVar2.mo136794b(0, snsInfo2);
                                SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                            }
                        }
                    }
                    Log.m105928w("SnsAd.DynamicUpdate", "the sns id is empty, is it right?");
                    SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                } catch (Throwable unused) {
                }
            }
            SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139651d(java.lang.String r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.String r0 = "onResultInternal"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r12.f293988d
            java.lang.String r2 = vr2.C102236a0.m134728W(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "SnsAd.TopicCardDynamic"
            if (r3 != 0) goto L_0x0158
            boolean r13 = r2.equals(r13)
            if (r13 != 0) goto L_0x001e
            goto L_0x0158
        L_0x001e:
            boolean r13 = r14 instanceof fq2.C97948a
            if (r13 != 0) goto L_0x002b
            java.lang.String r13 = "Crazy!!! the result data is not TopicCardResponseModel!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x002b:
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r12.f293988d
            if (r13 == 0) goto L_0x0154
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r13.getAdXml()
            if (r2 != 0) goto L_0x0037
            goto L_0x0154
        L_0x0037:
            com.tencent.mm.plugin.sns.storage.ADXml r13 = r13.getAdXml()
            co2.k r13 = r13.adFinderTopicInfo
            if (r13 != 0) goto L_0x0048
            java.lang.String r13 = "Yep !!! topicInfo is null, please check!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0048:
            fq2.a r14 = (fq2.C97948a) r14
            r14.getClass()
            java.lang.String r2 = "toAdFinderTopicInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.dynamic.model.TopicCardResponseModel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.List<co2.l> r5 = r13.f264544f
            java.lang.String r6 = "toAdTopicResInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r7 = rq2.C101425k.m133097a(r5)
            r8 = 0
            if (r7 != 0) goto L_0x010e
            java.util.List<fq2.a$b> r7 = r14.f287288b
            boolean r7 = rq2.C101425k.m133097a(r7)
            if (r7 != 0) goto L_0x010e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r7 = r5.size()
            java.util.List<fq2.a$b> r9 = r14.f287288b
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            if (r7 == r9) goto L_0x007e
            goto L_0x010e
        L_0x007e:
            java.util.List<fq2.a$b> r7 = r14.f287288b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            if (r8 >= r7) goto L_0x0109
            int r7 = r5.size()
            if (r8 >= r7) goto L_0x0109
            java.lang.Object r7 = r5.get(r8)
            co2.l r7 = (co2.C92444l) r7
            java.util.List<fq2.a$b> r9 = r14.f287288b
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r8)
            fq2.a$b r9 = (fq2.C97948a.C97950b) r9
            if (r7 == 0) goto L_0x0105
            if (r9 != 0) goto L_0x00a3
            goto L_0x0105
        L_0x00a3:
            java.lang.String r10 = r9.f287295a
            if (r10 == 0) goto L_0x00a9
            r7.f264545a = r10
        L_0x00a9:
            java.lang.String r10 = r9.f287296b
            if (r10 == 0) goto L_0x00af
            r7.f264546b = r10
        L_0x00af:
            java.lang.String r10 = r9.f287297c
            if (r10 == 0) goto L_0x00b5
            r7.f264547c = r10
        L_0x00b5:
            java.lang.String r10 = r9.f287298d
            if (r10 == 0) goto L_0x00bb
            r7.f264548d = r10
        L_0x00bb:
            java.lang.String r10 = r9.f287299e
            if (r10 == 0) goto L_0x00c1
            r7.f264549e = r10
        L_0x00c1:
            java.lang.String r10 = r9.f287300f
            if (r10 == 0) goto L_0x00c7
            r7.f264551g = r10
        L_0x00c7:
            fq2.a$a r9 = r9.f287301g
            if (r9 == 0) goto L_0x0105
            te3.kv2 r7 = r7.f264553i
            java.lang.String r10 = "toMediaObj"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)
            if (r7 != 0) goto L_0x00d9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            goto L_0x0105
        L_0x00d9:
            java.lang.String r11 = r9.f287289a
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0102
            java.lang.String r11 = r9.f287290b
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0102
            java.lang.String r11 = r9.f287291c
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x00f2
            goto L_0x0102
        L_0x00f2:
            java.lang.String r11 = r9.f287289a
            r7.f298689d = r11
            java.lang.String r11 = r9.f287290b
            r7.f298692g = r11
            java.lang.String r9 = r9.f287291c
            r7.f298694i = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            goto L_0x0105
        L_0x0102:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
        L_0x0105:
            int r8 = r8 + 1
            goto L_0x007e
        L_0x0109:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            r8 = 1
            goto L_0x0119
        L_0x010e:
            java.lang.String r5 = "SnsAd.TopicCardResponseModel"
            java.lang.String r7 = "the targetResInfoList size is not same as res infos size"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x0119:
            if (r8 == 0) goto L_0x012b
            java.lang.String r5 = r14.f287287a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0127
            java.lang.String r14 = r14.f287287a
            r13.f264542d = r14
        L_0x0127:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x012f
        L_0x012b:
            r13 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x012f:
            if (r13 != 0) goto L_0x013a
            java.lang.String r13 = "Yep !!! after converting, the topic info is null!!! Don't update!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x013a:
            java.lang.String r13 = r13.f264542d
            if (r13 == 0) goto L_0x0143
            android.widget.TextView r14 = r12.f293986b
            rq2.C101432s.m133128j(r14, r13)
        L_0x0143:
            androidx.recyclerview.widget.RecyclerView r13 = r12.f293987c
            if (r13 == 0) goto L_0x0150
            androidx.recyclerview.widget.RecyclerView$e r13 = r13.getAdapter()
            if (r13 == 0) goto L_0x0150
            r13.notifyDataSetChanged()
        L_0x0150:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0154:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0158:
            java.lang.String r13 = "en ?? the sns is not same as the one when request used!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oq2.C100375b.mo139651d(java.lang.String, java.lang.Object):void");
    }
}
