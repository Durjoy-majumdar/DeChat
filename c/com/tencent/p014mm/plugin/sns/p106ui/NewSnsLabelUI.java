package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ReturnSnsObjectDetailEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.visiblerange.BaseSelectVisibleRangeUI;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import dv2.C58442c;
import dv2.C58446g;
import dv2.C97557d;
import f40.C86709a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI */
public class NewSnsLabelUI extends BaseSelectVisibleRangeUI implements C97557d {

    /* renamed from: K */
    public static final /* synthetic */ int f277103K = 0;

    /* renamed from: C */
    public boolean f277104C = false;

    /* renamed from: D */
    public int f277105D = -1;

    /* renamed from: E */
    public Long f277106E = -1L;

    /* renamed from: F */
    public C95353a f277107F;

    /* renamed from: G */
    public ReturnSnsObjectDetailEventListener f277108G;

    /* renamed from: H */
    public long f277109H = 0;

    /* renamed from: I */
    public long f277110I = 0;

    /* renamed from: J */
    public long f277111J = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener */
    public static class ReturnSnsObjectDetailEventListener extends IListener<ReturnSnsObjectDetailEvent> {

        /* renamed from: d */
        public WeakReference<MMActivity> f277112d;

        public ReturnSnsObjectDetailEventListener(MMActivity mMActivity) {
            super(C40008f.f107254d);
            this.f277112d = new WeakReference<>(mMActivity);
            this.__eventId = -1656522510;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            ReturnSnsObjectDetailEvent returnSnsObjectDetailEvent = (ReturnSnsObjectDetailEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            boolean z = false;
            if (returnSnsObjectDetailEvent == null) {
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            } else {
                NewSnsLabelUI newSnsLabelUI = null;
                WeakReference<MMActivity> weakReference = this.f277112d;
                if (!(weakReference == null || weakReference.get() == null || !(this.f277112d.get() instanceof NewSnsLabelUI))) {
                    newSnsLabelUI = (NewSnsLabelUI) this.f277112d.get();
                }
                if (newSnsLabelUI == null) {
                    Log.m105924i("MicroMsg.NewSnsLabelUI", "ReturnSnsObjectDetailEvent callback, but NewSnsLabelUI not alive !!");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
                } else {
                    SnsObject snsObject = returnSnsObjectDetailEvent.f9459d.f9460a;
                    if (snsObject != null) {
                        Log.m105925i("MicroMsg.NewSnsLabelUI", "ReturnSnsObjectDetailEvent callback, snsobject id:%s", Long.valueOf(snsObject.f283891Id));
                        int i = NewSnsLabelUI.f277103K;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        newSnsLabelUI.mo132279a8(snsObject);
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        SnsMethodCalculate.markStartTimeMs("refreshAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        C96313x4 x4Var = newSnsLabelUI.f281309n;
                        int i2 = newSnsLabelUI.f281311p;
                        x4Var.f281650i = i2;
                        if (newSnsLabelUI.f281310o.mo83405k(i2, 2)) {
                            Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "refreshAdapter: SavedSelect:%d, expand INCLUDE", Integer.valueOf(newSnsLabelUI.f281311p));
                            newSnsLabelUI.f281302d.expandGroup(newSnsLabelUI.f281310o.mo83402h(2));
                        } else if (newSnsLabelUI.f281310o.mo83405k(newSnsLabelUI.f281309n.f281650i, 3)) {
                            Log.m105925i("MicroMsg.BaseSelectVisibleRangeUI", "refreshAdapter: SavedSelect:%d, expand EXCLUDE", Integer.valueOf(newSnsLabelUI.f281311p));
                            newSnsLabelUI.f281302d.expandGroup(newSnsLabelUI.f281310o.mo83402h(3));
                        }
                        newSnsLabelUI.f281309n.notifyDataSetChanged();
                        SnsMethodCalculate.markEndTimeMs("refreshAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    } else {
                        C76879j.m92749t(MMApplicationContext.getContext(), MMApplicationContext.getString(C0966R.string.jde), "", new C96241v1(this, newSnsLabelUI));
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
                    z = true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$a */
    public static class C95353a extends BaseSelectVisibleRangeUI.C96268j {

        /* renamed from: e */
        public WeakReference<MMActivity> f277113e;

        public C95353a(WeakReference<MMActivity> weakReference) {
            super(weakReference);
            this.f277113e = weakReference;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
            Log.m105925i("MicroMsg.NewSnsLabelUI", "[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            WeakReference<MMActivity> weakReference = this.f277113e;
            if (weakReference == null) {
                Log.m105924i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] WeakRef null");
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
                return;
            }
            NewSnsLabelUI newSnsLabelUI = (NewSnsLabelUI) weakReference.get();
            if (newSnsLabelUI == null) {
                Log.m105924i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] activity null");
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
                return;
            }
            super.onSceneEnd(i, i2, str, yVar);
            int i3 = NewSnsLabelUI.f277103K;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            SnsMethodCalculate.markStartTimeMs("isInTransforming", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            boolean z = newSnsLabelUI.f281314s;
            SnsMethodCalculate.markEndTimeMs("isInTransforming", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            if (!z) {
                Log.m105924i("MicroMsg.NewSnsLabelUI", "[onSceneEnd] but not isInTransform");
                SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
                return;
            }
            if (yVar.getType() == 218) {
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                SnsMethodCalculate.markStartTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                newSnsLabelUI.f281314s = false;
                SnsMethodCalculate.markEndTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                if (yVar instanceof C94877g0) {
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    boolean z2 = newSnsLabelUI.f277104C;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                    if (z2) {
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        SnsMethodCalculate.markStartTimeMs("hideProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        C89779i0 i0Var = newSnsLabelUI.f281316u;
                        if (i0Var != null && i0Var.isShowing()) {
                            newSnsLabelUI.f281316u.dismiss();
                        }
                        SnsMethodCalculate.markEndTimeMs("hideProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                        if (i == 0 && i2 == 0) {
                            SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            long j = ((C94877g0) yVar).f274934g;
                            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                            Long l = newSnsLabelUI.f277106E;
                            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
                            if (j == l.longValue()) {
                                newSnsLabelUI.finish();
                                C76912y0.m92768g(MMApplicationContext.getContext(), MMApplicationContext.getString(C0966R.string.a3s));
                            }
                        } else {
                            newSnsLabelUI.finish();
                            C76912y0.m92767f(MMApplicationContext.getContext(), MMApplicationContext.getString(C0966R.string.myo));
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$NewSnsLabelNetCallback");
        }
    }

    /* renamed from: Z7 */
    public static boolean m121602Z7(Context context, int i, int i2) {
        Context context2 = context;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        Log.m105925i("MicroMsg.NewSnsLabelUI", "jumpToSnsLabelUI snsLocalId:%d scene:%s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i3 <= 0) {
            SnsMethodCalculate.markEndTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("key_from_sns_feed_id", i);
        intent.setClass(context, NewSnsLabelUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/NewSnsLabelUI", "jumpToSnsLabelUI", "(Landroid/content/Context;II)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/NewSnsLabelUI", "jumpToSnsLabelUI", "(Landroid/content/Context;II)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        SnsReportHelper.f275506m0.mo131344E().f266364D = (long) i2;
        SnsMethodCalculate.markEndTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return true;
    }

    /* renamed from: Q7 */
    public C58442c mo132276Q7() {
        SnsMethodCalculate.markStartTimeMs("createSelectVisibleResCollectorInstance", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        C58446g gVar = new C58446g();
        SnsMethodCalculate.markEndTimeMs("createSelectVisibleResCollectorInstance", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        return gVar;
    }

    /* renamed from: U7 */
    public void mo132277U7() {
        SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.mo132277U7();
        this.f277110I = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    /* renamed from: V7 */
    public void mo132278V7() {
        SnsMethodCalculate.markStartTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.mo132278V7();
        this.f277111J = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* renamed from: a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo132279a8(com.tencent.p014mm.protocal.protobuf.SnsObject r14) {
        /*
            r13 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r1 = "refreshGroupDataBySnsObject"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.String r4 = "MicroMsg.NewSnsLabelUI"
            if (r14 != 0) goto L_0x0019
            java.lang.String r14 = "refreshViewBySnsObject failed, snsObject null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0019:
            java.lang.String r5 = "hideProgressDialog"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            qo3.i0 r7 = r13.f281316u
            if (r7 == 0) goto L_0x002f
            boolean r7 = r7.isShowing()
            if (r7 == 0) goto L_0x002f
            qo3.i0 r7 = r13.f281316u
            r7.dismiss()
        L_0x002f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            int r6 = r13.f277105D
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.mo139800LL(r6)
            r6 = 1
            if (r5 != 0) goto L_0x0053
            java.lang.Object[] r14 = new java.lang.Object[r6]
            int r0 = r13.f277105D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r3] = r0
            java.lang.String r0 = "refreshGroupDataBySnsObject error %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x0053:
            long r7 = r5.field_snsId
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r13.f277106E = r7
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r9 = r13.f277105D
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            java.lang.Long r9 = r13.f277106E
            r8[r6] = r9
            java.lang.String r9 = "refreshViewBySnsObject snsLocalId:%s snsid:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r8)
            vr2.b0$a r8 = vr2.C65874b0.f189421a
            r8.mo89928g(r4, r14, r3)
            int r5 = r5.getPravited()
            java.lang.String r8 = "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion"
            if (r5 != r6) goto L_0x0090
            java.lang.String r5 = "snsInfo visiblity ITEM_INDEX_PRIVACY"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r13.f281311p = r6
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r4 = r4.mo131344E()
            r9 = 2
            r4.f266365E = r9
            goto L_0x00fb
        L_0x0090:
            int r5 = r14.ExtFlag
            java.lang.String r9 = "checkHaveBlackContactListOrTagListByExtFlag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            r10 = r5 & 2
            if (r10 <= 0) goto L_0x00a0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
        L_0x009e:
            r5 = 1
            goto L_0x00ac
        L_0x00a0:
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 <= 0) goto L_0x00a8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x009e
        L_0x00a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            r5 = 0
        L_0x00ac:
            if (r5 == 0) goto L_0x00c2
            java.lang.String r5 = "snsInfo visiblity ITEM_INDEX_EXCLUDE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r4 = 3
            r13.f281311p = r4
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r4 = r4.mo131344E()
            r9 = 4
            r4.f266365E = r9
            goto L_0x00fb
        L_0x00c2:
            int r5 = r14.ExtFlag
            java.lang.String r9 = "checkHaveGroupContactListOrTagListByExtFlag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            r10 = r5 & 4
            if (r10 <= 0) goto L_0x00d2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
        L_0x00d0:
            r5 = 1
            goto L_0x00de
        L_0x00d2:
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 <= 0) goto L_0x00da
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x00d0
        L_0x00da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            r5 = 0
        L_0x00de:
            if (r5 == 0) goto L_0x00e9
            java.lang.String r5 = "snsInfo visiblity ITEM_INDEX_INCLUDE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r13.f281311p = r7
            goto L_0x00fb
        L_0x00e9:
            java.lang.String r5 = "snsInfo visiblity ITEM_INDEX_PUBLIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r13.f281311p = r3
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r4 = r4.mo131344E()
            r9 = 1
            r4.f266365E = r9
        L_0x00fb:
            com.tencent.mm.plugin.sns.ui.x4 r4 = r13.f281309n
            java.util.ArrayList<java.lang.String> r4 = r4.f281654m
            r4.clear()
            java.util.LinkedList<java.lang.Integer> r4 = r14.BlackContactTagIdList
            java.util.Iterator r4 = r4.iterator()
        L_0x0108:
            boolean r5 = r4.hasNext()
            java.lang.String r7 = "isValidLabel"
            if (r5 == 0) goto L_0x0156
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.String r9 = r5.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 == 0) goto L_0x0129
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r9 = 0
            goto L_0x0147
        L_0x0129:
            b22.b r10 = b22.C28250a.m38138a()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            a22.a r10 = (a22.C67001a) r10
            java.util.List r9 = r10.mo90973k(r9)
            if (r9 == 0) goto L_0x013e
            int r9 = r9.size()
            goto L_0x013f
        L_0x013e:
            r9 = 0
        L_0x013f:
            if (r9 <= 0) goto L_0x0143
            r9 = 1
            goto L_0x0144
        L_0x0143:
            r9 = 0
        L_0x0144:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x0147:
            if (r9 != 0) goto L_0x014a
            goto L_0x0108
        L_0x014a:
            com.tencent.mm.plugin.sns.ui.x4 r7 = r13.f281309n
            java.util.ArrayList<java.lang.String> r7 = r7.f281654m
            java.lang.String r5 = r5.toString()
            r7.add(r5)
            goto L_0x0108
        L_0x0156:
            com.tencent.mm.plugin.sns.ui.x4 r4 = r13.f281309n
            java.util.ArrayList<java.lang.String> r4 = r4.f281654m
            java.lang.String r5 = ","
            if (r4 == 0) goto L_0x0164
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r4, r5)
            r13.f281305g = r4
        L_0x0164:
            com.tencent.mm.plugin.sns.ui.x4 r4 = r13.f281309n
            r4.mo134133e()
            java.util.LinkedList<te3.rv3> r4 = r14.BlackList
            java.util.Iterator r4 = r4.iterator()
        L_0x016f:
            boolean r9 = r4.hasNext()
            java.lang.String r10 = "isValidContact"
            if (r9 == 0) goto L_0x01ad
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r11 == 0) goto L_0x018e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            r11 = 0
            goto L_0x01a3
        L_0x018e:
            k40.a r11 = f40.C86709a0.m107533q(r0)
            f62.k0 r11 = (f62.C75700k0) r11
            com.tencent.mm.storage.u3 r11 = r11.mo96097Ni()
            com.tencent.mm.storage.z1 r11 = r11.get(r9)
            boolean r11 = r11.mo62927s3()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
        L_0x01a3:
            if (r11 == 0) goto L_0x016f
            com.tencent.mm.plugin.sns.ui.x4 r10 = r13.f281309n
            java.util.ArrayList<java.lang.String> r10 = r10.f281656o
            r10.add(r9)
            goto L_0x016f
        L_0x01ad:
            com.tencent.mm.plugin.sns.ui.x4 r4 = r13.f281309n
            java.util.ArrayList<java.lang.String> r4 = r4.f281653l
            r4.clear()
            java.util.LinkedList<java.lang.Integer> r4 = r14.GroupContactTagIdList
            java.util.Iterator r4 = r4.iterator()
        L_0x01ba:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0205
            java.lang.Object r9 = r4.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r11 = r9.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 == 0) goto L_0x01d8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r11 = 0
            goto L_0x01f6
        L_0x01d8:
            b22.b r12 = b22.C28250a.m38138a()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            a22.a r12 = (a22.C67001a) r12
            java.util.List r11 = r12.mo90973k(r11)
            if (r11 == 0) goto L_0x01ed
            int r11 = r11.size()
            goto L_0x01ee
        L_0x01ed:
            r11 = 0
        L_0x01ee:
            if (r11 <= 0) goto L_0x01f2
            r11 = 1
            goto L_0x01f3
        L_0x01f2:
            r11 = 0
        L_0x01f3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x01f6:
            if (r11 != 0) goto L_0x01f9
            goto L_0x01ba
        L_0x01f9:
            com.tencent.mm.plugin.sns.ui.x4 r11 = r13.f281309n
            java.util.ArrayList<java.lang.String> r11 = r11.f281653l
            java.lang.String r9 = r9.toString()
            r11.add(r9)
            goto L_0x01ba
        L_0x0205:
            com.tencent.mm.plugin.sns.ui.x4 r4 = r13.f281309n
            java.util.ArrayList<java.lang.String> r4 = r4.f281653l
            if (r4 == 0) goto L_0x0211
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r4, r5)
            r13.f281305g = r4
        L_0x0211:
            com.tencent.mm.plugin.sns.ui.x4 r4 = r13.f281309n
            r4.mo134134f()
            java.util.LinkedList<te3.rv3> r14 = r14.GroupUser
            java.util.Iterator r14 = r14.iterator()
        L_0x021c:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0257
            java.lang.Object r4 = r14.next()
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x0238
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            r7 = 0
            goto L_0x024d
        L_0x0238:
            k40.a r7 = f40.C86709a0.m107533q(r0)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            com.tencent.mm.storage.z1 r7 = r7.get(r4)
            boolean r7 = r7.mo62927s3()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
        L_0x024d:
            if (r7 == 0) goto L_0x021c
            com.tencent.mm.plugin.sns.ui.x4 r7 = r13.f281309n
            java.util.ArrayList<java.lang.String> r7 = r7.f281655n
            r7.add(r4)
            goto L_0x021c
        L_0x0257:
            com.tencent.mm.plugin.sns.ui.x4 r14 = r13.f281309n
            java.util.ArrayList<java.lang.String> r14 = r14.f281656o
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r14, r5)
            r13.f281307i = r14
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r14 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r0 = r13.f281311p
            r14.mo131365Z(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.NewSnsLabelUI.mo132279a8(com.tencent.mm.protocal.protobuf.SnsObject):boolean");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4 = i;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.onActivityResult(i, i2, intent);
        char c = 0;
        if (i4 == 4003) {
            long currentTimeMillis = SnsReportHelper.f275506m0.mo131344E().f266369I + (System.currentTimeMillis() - this.f277110I);
            SnsReportHelper.f275506m0.mo131344E().f266369I = currentTimeMillis;
            if (this.f277104C && intent2 != null) {
                String stringExtra = intent2.getStringExtra("Select_Contact");
                if (!Util.isNullOrNil(stringExtra)) {
                    SnsReportHelper.f275506m0.mo131364Y(Util.stringsToList(stringExtra.split(",")));
                }
            }
            Log.m105925i("MicroMsg.NewSnsLabelUI", "setSelectFriendDuration %d", Long.valueOf(currentTimeMillis));
        } else if (i4 == 4005) {
            long currentTimeMillis2 = SnsReportHelper.f275506m0.mo131344E().f266372L + (System.currentTimeMillis() - this.f277111J);
            SnsReportHelper.f275506m0.mo131344E().f266372L = currentTimeMillis2;
            if (!this.f277104C || intent2 == null) {
                i3 = 1;
            } else {
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("label_id");
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    i3 = 1;
                    SnsMethodCalculate.markEndTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                } else {
                    snsReportHelper.f275557n.f266394w += stringArrayListExtra.size();
                    TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = snsReportHelper.f275557n;
                    timelineGroupUserBehaviorStruct.f266363C = timelineGroupUserBehaviorStruct.mo86045b("SelectedLabelidList", Util.listToString(stringArrayListExtra, ";"), true);
                    StringBuilder sb = new StringBuilder();
                    for (String next : stringArrayListExtra) {
                        List k = ((C67001a) C28250a.m38138a()).mo90973k(next);
                        String h = ((C67001a) C28250a.m38138a()).mo90970h(next);
                        Object[] objArr = new Object[3];
                        objArr[c] = next;
                        objArr[1] = h;
                        objArr[2] = Integer.valueOf(k.size());
                        Log.m105925i("MicroMsg.SnsReportHelper", "select label:%s name:%s count:%d", objArr);
                        sb.append(h);
                        sb.append("|");
                        sb.append(k.size());
                        sb.append(";");
                        c = 0;
                    }
                    TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = snsReportHelper.f275557n;
                    i3 = 1;
                    timelineGroupUserBehaviorStruct2.f266395x = timelineGroupUserBehaviorStruct2.mo86045b("SelectedLabelList", sb.toString(), true);
                    SnsMethodCalculate.markEndTimeMs("updateSelectedLabelReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
            }
            Object[] objArr2 = new Object[i3];
            objArr2[0] = Long.valueOf(currentTimeMillis2);
            Log.m105925i("MicroMsg.NewSnsLabelUI", "setDynamicLabelDuration %d", objArr2);
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        this.f277104C = getIntent().hasExtra("key_from_sns_feed_id");
        this.f277105D = getIntent().getIntExtra("key_from_sns_feed_id", -1);
        Log.m105925i("MicroMsg.NewSnsLabelUI", "onCreate isFromFeedDialog:%b", Boolean.valueOf(this.f277104C));
        SnsMethodCalculate.markStartTimeMs("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f281319x = this;
        SnsMethodCalculate.markEndTimeMs("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f277107F = new C95353a(new WeakReference(this));
        ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener = new ReturnSnsObjectDetailEventListener(this);
        this.f277108G = returnSnsObjectDetailEventListener;
        returnSnsObjectDetailEventListener.alive();
        super.onCreate(bundle);
        if (this.f277104C) {
            updateOptionMenuText(0, getString(C0966R.string.myp));
        }
        this.f277109H = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        Log.m105924i("MicroMsg.NewSnsLabelUI", "onDestroy");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(218, this.f277107F);
        this.f277108G.dead();
        super.onDestroy();
        SnsMethodCalculate.markStartTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        boolean z = this.f277104C;
        SnsMethodCalculate.markEndTimeMs("isNeedDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        if (z) {
            SnsReportHelper.f275506m0.mo131356Q();
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        Log.m105924i("MicroMsg.NewSnsLabelUI", "onResume");
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
        super.onStop();
        Log.m105924i("MicroMsg.NewSnsLabelUI", "onStop");
        SnsReportHelper.f275506m0.mo131344E().f266368H = System.currentTimeMillis() - this.f277109H;
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
    }
}
