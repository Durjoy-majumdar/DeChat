package gq2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import hq2.C98495a;
import hq2.C98497c;
import iq2.C76370a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import nj3.C76912y0;
import rq2.C101425k;
import rq2.C63505q;
import vr2.C102236a0;
import vr2.C102244f;
import vr2.C102259p;

/* renamed from: gq2.d */
public class C98175d implements C98176e, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public Context f287834d;

    /* renamed from: e */
    public C76370a f287835e;

    /* renamed from: f */
    public View f287836f;

    /* renamed from: g */
    public C98171c f287837g;

    /* renamed from: h */
    public C98169a f287838h;

    /* renamed from: i */
    public TimelineClickListener f287839i;

    /* renamed from: j */
    public Set<Integer> f287840j;

    /* renamed from: n */
    public boolean f287841n = false;

    /* renamed from: o */
    public int f287842o = 0;

    public C98175d(Context context) {
        this.f287834d = context;
        this.f287840j = new HashSet();
        C98169a aVar = new C98169a();
        this.f287838h = aVar;
        this.f287837g = new C98171c(context, aVar, this);
        this.f287842o = this.f287834d.getResources().getDimensionPixelOffset(C0966R.dimen.anj);
        if (context instanceof SnsCommentDetailUI) {
            this.f287841n = true;
            C98169a aVar2 = this.f287838h;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar2.f287802c = 1;
            SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    /* renamed from: a */
    public final int mo137468a(View view, View view2) {
        SnsMethodCalculate.markStartTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        view2.measure(View.MeasureSpec.makeMeasureSpec(this.f287842o, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view2.getMeasuredHeight();
        SnsMethodCalculate.markStartTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        SnsMethodCalculate.markEndTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom + measuredHeight > rect2.height()) {
            int i2 = -(measuredHeight + rect.height());
            SnsMethodCalculate.markEndTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return i2;
        }
        SnsMethodCalculate.markEndTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return 0;
    }

    /* renamed from: b */
    public final void mo137469b() {
        SnsMethodCalculate.markStartTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        C76370a aVar = this.f287835e;
        if (aVar != null) {
            aVar.dismiss();
        }
        SnsMethodCalculate.markEndTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* renamed from: c */
    public final void mo137470c() {
        SnsMethodCalculate.markStartTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (this.f287835e == null) {
            View inflate = LayoutInflater.from(this.f287834d).inflate(C0966R.C0971layout.c0o, (ViewGroup) null);
            C76370a aVar = new C76370a(this.f287834d);
            this.f287835e = aVar;
            aVar.setContentView(inflate);
            this.f287835e.setWidth(this.f287842o);
            this.f287835e.setHeight(-2);
            this.f287835e.setFocusable(true);
            this.f287835e.setBackgroundDrawable(new ColorDrawable(0));
            this.f287835e.setOnDismissListener(this);
        }
        SnsMethodCalculate.markEndTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* renamed from: d */
    public void mo137471d(View view, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (i == 5) {
            try {
                mo137474g(view, obj);
            } catch (Throwable unused) {
                Log.m105920e("FeedbackPromptManager", "onAction failed : actionId = " + i);
            }
        } else {
            if (i == 1) {
                mo137476i(view);
            } else if (i == 2) {
                mo137472e();
            } else if (i == 3) {
                mo137473f();
            } else if (i == 4) {
                mo137475h(view, obj);
            }
            C115669n.INSTANCE.mo175911u(1962, i + 10);
        }
        SnsMethodCalculate.markEndTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* renamed from: e */
    public final void mo137472e() {
        C98495a aVar;
        SnsMethodCalculate.markStartTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        int i = 1;
        mo137479l(true);
        mo137469b();
        C98169a aVar2 = this.f287838h;
        if (aVar2 != null) {
            boolean z = this.f287841n;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            SnsInfo snsInfo = aVar2.f287801b;
            ADXml c = aVar2.mo137450c();
            ADInfo b = aVar2.mo137449b();
            if (snsInfo == null || c == null || b == null) {
                aVar = null;
                SnsMethodCalculate.markEndTimeMs("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            } else {
                SnsMethodCalculate.markStartTimeMs("createAdApprovedChannelData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
                aVar = new C98495a();
                aVar.f288873a = snsInfo.field_snsId;
                if (z) {
                    i = 2;
                }
                aVar.f288875c = i;
                aVar.f288874b = C102259p.m134828a(b.uxInfo);
                aVar.f288876d = c.adExtInfo;
                SnsMethodCalculate.markEndTimeMs("createAdApprovedChannelData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
                SnsMethodCalculate.markEndTimeMs("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            C63505q.m74843b(aVar);
        }
        SnsMethodCalculate.markEndTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[Catch:{ all -> 0x0038, all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[Catch:{ all -> 0x0038, all -> 0x0058 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137473f() {
        /*
            r9 = this;
            java.lang.String r0 = "onComplaint"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r9.mo137469b()
            java.lang.String r2 = "complaint_weapp"
            java.lang.String r3 = "complaint"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            android.content.Context r4 = r9.f287834d     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0058
            gq2.a r5 = r9.f287838h     // Catch:{ all -> 0x0058 }
            r5.getClass()     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = "getComplaintIntent"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)     // Catch:{ all -> 0x0058 }
            android.content.Intent r8 = r5.mo137452e()     // Catch:{ all -> 0x0038 }
            if (r8 == 0) goto L_0x0030
            r5 = 1
            r8.putExtra(r2, r5)     // Catch:{ all -> 0x0038 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch:{ all -> 0x0058 }
            goto L_0x003c
        L_0x0030:
            android.content.Intent r8 = r5.mo137451d()     // Catch:{ all -> 0x0038 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch:{ all -> 0x0058 }
            goto L_0x003c
        L_0x0038:
            r8 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch:{ all -> 0x0058 }
        L_0x003c:
            r5 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r8, r2, r5)     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0047
            r9.mo137480m(r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0058
        L_0x0047:
            java.lang.Class<om.f> r2 = p214om.C11502f.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0058 }
            om.f r2 = (p214om.C11502f) r2     // Catch:{ all -> 0x0058 }
            wc3.z r2 = r2.mo11462yM()     // Catch:{ all -> 0x0058 }
            com.tencent.mm.app.r1 r2 = (com.tencent.p014mm.app.C67654r1) r2     // Catch:{ all -> 0x0058 }
            r2.mo93190w(r8, r4)     // Catch:{ all -> 0x0058 }
        L_0x0058:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C98175d.mo137473f():void");
    }

    /* renamed from: g */
    public final void mo137474g(View view, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        Set<Integer> set = this.f287840j;
        if (set != null && (obj instanceof C98497c)) {
            int i = ((C98497c) obj).f288886a;
            if (view == null || !view.isSelected()) {
                ((HashSet) set).remove(Integer.valueOf(i));
            } else {
                ((HashSet) set).add(Integer.valueOf(i));
            }
        }
        SnsMethodCalculate.markEndTimeMs("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* renamed from: h */
    public final void mo137475h(View view, Object obj) {
        C94877g0 g0Var;
        SnsMethodCalculate.markStartTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        mo137479l(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false);
        mo137469b();
        TimelineClickListener timelineClickListener = this.f287839i;
        if (timelineClickListener != null) {
            timelineClickListener.mo132103x(view);
        }
        C98169a aVar = this.f287838h;
        if (aVar != null) {
            Set<Integer> set = this.f287840j;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            ADInfo b = aVar.mo137449b();
            SnsInfo snsInfo = aVar.f287801b;
            C102244f fVar = aVar.f287800a;
            if (fVar == null || snsInfo == null || b == null || b.adUnlikeInfo == null) {
                g0Var = null;
                SnsMethodCalculate.markEndTimeMs("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            } else {
                LinkedList linkedList = new LinkedList();
                List<ADInfo.C95010c.C95011a> a = b.adUnlikeInfo.mo131416a();
                if (C101425k.m133100d(a)) {
                    for (ADInfo.C95010c.C95011a next : a) {
                        if (next != null) {
                            if (((HashSet) set).contains(Integer.valueOf(next.f275658d))) {
                                linkedList.add(Integer.valueOf(next.f275658d));
                            }
                        }
                    }
                }
                if (C101425k.m133097a(linkedList)) {
                    linkedList.add(10006);
                }
                ADInfo.C95010c.C95011a aVar2 = new ADInfo.C95010c.C95011a();
                aVar2.f275659e = linkedList.size();
                aVar2.f275660f.addAll(linkedList);
                aVar2.f275661g = fVar.f301111e;
                aVar2.f275662h = System.currentTimeMillis();
                g0Var = new C94877g0(snsInfo.field_snsId, 8, (Object) aVar2);
                SnsMethodCalculate.markEndTimeMs("getNoInterestingReasonNetSceneOp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            if (g0Var != null) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(g0Var);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137476i(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onNoInterestingClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.Set<java.lang.Integer> r2 = r10.f287840j
            if (r2 == 0) goto L_0x0011
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.clear()
        L_0x0011:
            gq2.a r2 = r10.f287838h
            r3 = 0
            if (r2 == 0) goto L_0x0090
            r2.getClass()
            java.lang.String r4 = "hasNoInterestingReason"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.storage.ADInfo r2 = r2.mo137449b()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x005a
            com.tencent.mm.plugin.sns.storage.ADInfo$c r2 = r2.adUnlikeInfo     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x005a
            java.util.List r2 = r2.mo131416a()     // Catch:{ all -> 0x005a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x005a }
            r6.<init>()     // Catch:{ all -> 0x005a }
            r7 = 0
        L_0x0034:
            int r8 = r2.size()     // Catch:{ all -> 0x005a }
            if (r7 >= r8) goto L_0x0052
            java.lang.Object r8 = r2.get(r7)     // Catch:{ all -> 0x005a }
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r8 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r8     // Catch:{ all -> 0x005a }
            int r8 = r8.f275658d     // Catch:{ all -> 0x005a }
            r9 = 10006(0x2716, float:1.4021E-41)
            if (r8 == r9) goto L_0x004f
            java.lang.Object r8 = r2.get(r7)     // Catch:{ all -> 0x005a }
            com.tencent.mm.plugin.sns.storage.ADInfo$c$a r8 = (com.tencent.p014mm.plugin.sns.storage.ADInfo.C95010c.C95011a) r8     // Catch:{ all -> 0x005a }
            r6.add(r8)     // Catch:{ all -> 0x005a }
        L_0x004f:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0052:
            boolean r2 = rq2.C101425k.m133100d(r6)     // Catch:{ all -> 0x005a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L_0x005e
        L_0x005a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0090
            iq2.a r2 = r10.f287835e
            if (r2 == 0) goto L_0x0090
            android.view.View r11 = r10.f287836f
            android.view.View r2 = r2.getContentView()
            int r7 = r10.mo137468a(r11, r2)
            r10.mo137477j(r7)
            iq2.a r4 = r10.f287835e
            android.view.View r5 = r10.f287836f
            r6 = 0
            r8 = -1
            r9 = -1
            r4.update(r5, r6, r7, r8, r9)
            gq2.a r11 = r10.f287838h
            com.tencent.mm.plugin.sns.model.g0 r11 = r11.mo137455h(r3)
            if (r11 == 0) goto L_0x00b4
            f40.C86709a0.m107528h()
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r11)
            goto L_0x00b4
        L_0x0090:
            r10.mo137479l(r3)
            r10.mo137469b()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r2 = r10.f287839i
            if (r2 == 0) goto L_0x009d
            r2.mo132103x(r11)
        L_0x009d:
            gq2.a r11 = r10.f287838h
            if (r11 == 0) goto L_0x00b4
            r2 = 1
            com.tencent.mm.plugin.sns.model.g0 r11 = r11.mo137455h(r2)
            if (r11 == 0) goto L_0x00b4
            f40.C86709a0.m107528h()
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r11)
        L_0x00b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C98175d.mo137476i(android.view.View):void");
    }

    /* renamed from: j */
    public final void mo137477j(int i) {
        SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        C98171c cVar = this.f287837g;
        if (cVar != null) {
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            WeImageView weImageView = cVar.f287813f;
            if (!(weImageView == null || cVar.f287814g == null)) {
                if (i < 0) {
                    weImageView.setVisibility(8);
                    cVar.f287814g.setVisibility(0);
                } else {
                    weImageView.setVisibility(0);
                    cVar.f287814g.setVisibility(8);
                }
            }
            SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        }
        SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC, Splitter:B:32:0x0069] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo137478k(android.view.View r8, com.tencent.p014mm.plugin.sns.storage.SnsInfo r9) {
        /*
            r7 = this;
            java.lang.String r0 = "FeedbackPromptManager"
            java.lang.String r1 = "showFeedback"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            if (r8 != 0) goto L_0x0011
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0011:
            java.lang.String r4 = "obtainAdUnlikeTag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r5 = r8.getTag()     // Catch:{ all -> 0x00f5 }
            boolean r6 = r5 instanceof vr2.C102244f     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x0025
            vr2.f r5 = (vr2.C102244f) r5     // Catch:{ all -> 0x00f5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x002f
        L_0x0025:
            java.lang.String r5 = "the tag is not AdUnlikeTag"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)     // Catch:{ all -> 0x00f5 }
            r5 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)     // Catch:{ all -> 0x00f5 }
        L_0x002f:
            if (r5 != 0) goto L_0x003b
            java.lang.String r8 = "the unlike tag is null. there is no data for showing window!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)     // Catch:{ all -> 0x00f5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x003b:
            gq2.a r4 = r7.f287838h     // Catch:{ all -> 0x00f5 }
            r4.mo137459l(r5, r9)     // Catch:{ all -> 0x00f5 }
            gq2.a r9 = r7.f287838h     // Catch:{ all -> 0x00f5 }
            r9.getClass()     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "shouldUseNewFeedbackPanel"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ all -> 0x00f5 }
            r6 = 1
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r9.mo137450c()     // Catch:{ all -> 0x005f }
            if (r9 == 0) goto L_0x005f
            int r9 = r9.newFeedbackPanel     // Catch:{ all -> 0x005f }
            if (r9 <= 0) goto L_0x005a
            r9 = 1
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x00f5 }
            goto L_0x0063
        L_0x005f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x00f5 }
            r9 = 0
        L_0x0063:
            if (r9 != 0) goto L_0x0069
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0069:
            r7.mo137470c()     // Catch:{ all -> 0x00f5 }
            iq2.a r9 = r7.f287835e     // Catch:{ all -> 0x00f5 }
            boolean r9 = r9.isShowing()     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x0078
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r6
        L_0x0078:
            java.lang.String r9 = "obtainRealAnchor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
            boolean r4 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0086
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x0096
        L_0x0086:
            android.view.ViewParent r4 = r8.getParent()     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0093
            r8 = r4
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x00f5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x0096
        L_0x0093:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
        L_0x0096:
            r7.f287836f = r8     // Catch:{ all -> 0x00f5 }
            gq2.c r8 = r7.f287837g     // Catch:{ all -> 0x00f5 }
            iq2.a r9 = r7.f287835e     // Catch:{ all -> 0x00f5 }
            android.view.View r9 = r9.getContentView()     // Catch:{ all -> 0x00f5 }
            r8.mo137464d(r9)     // Catch:{ all -> 0x00f5 }
            android.view.View r8 = r7.f287836f     // Catch:{ all -> 0x00f5 }
            iq2.a r9 = r7.f287835e     // Catch:{ all -> 0x00f5 }
            android.view.View r9 = r9.getContentView()     // Catch:{ all -> 0x00f5 }
            int r8 = r7.mo137468a(r8, r9)     // Catch:{ all -> 0x00f5 }
            r7.mo137477j(r8)     // Catch:{ all -> 0x00f5 }
            iq2.a r9 = r7.f287835e     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = "getAnimationStyle"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)     // Catch:{ all -> 0x00f5 }
            if (r8 >= 0) goto L_0x00c2
            r5 = 2131886897(0x7f120331, float:1.9408386E38)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c8
        L_0x00c2:
            r5 = 2131886898(0x7f120332, float:1.9408388E38)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)     // Catch:{ all -> 0x00f5 }
        L_0x00c8:
            r9.setAnimationStyle(r5)     // Catch:{ all -> 0x00f5 }
            iq2.a r9 = r7.f287835e     // Catch:{ all -> 0x00f5 }
            android.view.View r4 = r7.f287836f     // Catch:{ all -> 0x00f5 }
            r5 = 8388613(0x800005, float:1.175495E-38)
            r9.showAsDropDown(r4, r3, r8, r5)     // Catch:{ all -> 0x00f5 }
            iq2.a r8 = r7.f287835e     // Catch:{ all -> 0x00f5 }
            java.lang.String r9 = "getDimAccount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x00e9
            r4 = 1036831949(0x3dcccccd, float:0.1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ee
        L_0x00e9:
            r4 = 1056964608(0x3f000000, float:0.5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)     // Catch:{ all -> 0x00f5 }
        L_0x00ee:
            r8.mo106601a(r4)     // Catch:{ all -> 0x00f5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r6
        L_0x00f5:
            java.lang.String r8 = "show feedback window has something wrong!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C98175d.mo137478k(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    /* renamed from: l */
    public final void mo137479l(boolean z) {
        SnsMethodCalculate.markStartTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            Context context = this.f287834d;
            C76912y0.m92768g(context, context.getString(z ? C0966R.string.f361367ja3 : C0966R.string.myl));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* renamed from: m */
    public final void mo137480m(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        String stringExtra = IntentUtil.getStringExtra(intent, "appUserName");
        String stringExtra2 = IntentUtil.getStringExtra(intent, "appPagePath");
        String stringExtra3 = IntentUtil.getStringExtra(intent, "appVersion");
        String stringExtra4 = IntentUtil.getStringExtra(intent, "aId");
        String stringExtra5 = IntentUtil.getStringExtra(intent, "traceId");
        String stringExtra6 = IntentUtil.getStringExtra(intent, "sceneNote");
        String stringExtra7 = IntentUtil.getStringExtra(intent, "uxInfo");
        int intExtra = IntentUtil.getIntExtra(intent, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1045);
        SnsMethodCalculate.markStartTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (TextUtils.isEmpty(stringExtra)) {
            Log.m105928w("FeedbackPromptManager", "the app user name is empty");
            SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } else {
            C102236a0.m134761o0(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, intExtra);
            SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        }
        SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public void onDismiss() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        this.f287835e = null;
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }
}
