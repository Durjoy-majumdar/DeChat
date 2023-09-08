package com.tencent.p014mm.plugin.sns.model;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import c30.C104289g;
import com.tencent.p014mm.autogen.events.SnsRetryEditTipExpiredEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineTrashReEditStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;
import os2.C35285a0;
import os2.C35287b0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.t1 */
public class C94950t1 {

    /* renamed from: f */
    public static long f275242f = -1;

    /* renamed from: g */
    public static long f275243g = -1;

    /* renamed from: h */
    public static int f275244h = 0;

    /* renamed from: i */
    public static long f275245i = 300000;

    /* renamed from: j */
    public static boolean f275246j = false;

    /* renamed from: k */
    public static int f275247k = 60;

    /* renamed from: a */
    public long f275248a = 0;

    /* renamed from: b */
    public String f275249b = "";

    /* renamed from: c */
    public SnsInfo f275250c = null;

    /* renamed from: d */
    public String f275251d = "";

    /* renamed from: e */
    public Runnable f275252e = new C94951a();

    /* renamed from: com.tencent.mm.plugin.sns.model.t1$a */
    public class C94951a implements Runnable {
        public C94951a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$1");
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            Log.m105924i("MicroMsg.SnsRetryEditTipManager", "run resetTask");
            C94950t1 t1Var = C94950t1.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            t1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("removeDraftTmpFile", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            C94866e1.my0().post(new C94954u1(t1Var, t1Var.f275249b));
            SnsMethodCalculate.markEndTimeMs("removeDraftTmpFile", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            C94950t1 t1Var2 = C94950t1.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            t1Var2.mo131281e();
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            C94950t1 t1Var3 = C94950t1.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            t1Var3.getClass();
            SnsMethodCalculate.markStartTimeMs("notifyDataChanged", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            new SnsRetryEditTipExpiredEvent().publish();
            SnsMethodCalculate.markEndTimeMs("notifyDataChanged", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            C94950t1 t1Var4 = C94950t1.this;
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            t1Var4.f275250c = null;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            C94950t1 t1Var5 = C94950t1.this;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            t1Var5.f275251d = "";
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$1");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r6 = f275244h;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo131277a(long r10, int r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "checkRetryTipExpose"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = f275246j
            r3 = 0
            if (r2 != 0) goto L_0x0010
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0010:
            long r4 = f275243g
            r6 = -1
            r2 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0032
            long r4 = f275242f
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x002b
            int r6 = f275244h
            if (r6 == 0) goto L_0x002b
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x002b
            if (r12 >= r6) goto L_0x002b
            r12 = 1
            goto L_0x002c
        L_0x002b:
            r12 = 0
        L_0x002c:
            if (r12 == 0) goto L_0x003a
            long r4 = (long) r13
            f275243g = r4
            goto L_0x003a
        L_0x0032:
            long r6 = (long) r13
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x0039
            r12 = 1
            goto L_0x003a
        L_0x0039:
            r12 = 0
        L_0x003a:
            if (r12 == 0) goto L_0x004f
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r4 = r4.mo131346G()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r5 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r5 = r5.mo131346G()
            long r5 = r5.f266439k
            r7 = 1
            long r5 = r5 + r7
            r4.f266439k = r5
        L_0x004f:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)
            r4[r3] = r5
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r4[r2] = r10
            r10 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r4[r10] = r11
            java.lang.String r10 = "MicroMsg.SnsRetryEditTipManager"
            java.lang.String r11 = "checkRetryTipExpose: result=%b, snsId=%s, localId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94950t1.mo131277a(long, int, int):boolean");
    }

    /* renamed from: b */
    public void mo131278b(Context context) {
        SnsMethodCalculate.markStartTimeMs("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (!f275246j) {
            SnsMethodCalculate.markEndTimeMs("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return;
        }
        this.f275250c = null;
        this.f275251d = "";
        Log.m105925i("MicroMsg.SnsRetryEditTipManager", "goRetryEdit draftKey:%s", this.f275249b);
        C35285a0 qq = C94866e1.Wx0().mo60188qq(this.f275249b);
        if (qq != null) {
            byte[] bArr = qq.field_draft;
            if (!Util.isNullOrNil(bArr)) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    Intent intent = (Intent) Intent.CREATOR.createFromParcel(obtain);
                    intent.putExtra("Kis_retry_edit", true);
                    String stringExtra = intent.getStringExtra("K_with_together_stat");
                    if (!Util.isNullOrNil(stringExtra)) {
                        try {
                            C57354l.f164333a.mo80975l(new C104289g(stringExtra));
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.SnsRetryEditTipManager", e.toString());
                        }
                    }
                    intent.putExtra("Kis_from_sns_drafg_stg", true);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/model/SnsRetryEditTipManager", "goRetryEdit", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/sns/model/SnsRetryEditTipManager", "goRetryEdit", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mo131281e();
                    MMHandlerThread.removeRunnable(this.f275252e);
                } catch (Exception unused) {
                    C94866e1.Wx0().mo60186Yt(this.f275249b, (byte[]) null, 0);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    /* renamed from: c */
    public void mo131279c() {
        SnsObject e;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        Log.m105924i("MicroMsg.SnsRetryEditTipManager", "create");
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_sns_retry_edit_interval;
        C32735h.C32737c cVar2 = C32735h.C32737c.clicfg_sns_retry_edit_enable;
        C32735h.C32737c cVar3 = C32735h.C32737c.clicfg_sns_retry_edit_expired_time;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            f275245i = (long) (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar3, 300) * 1000);
            f275246j = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 1) == 1;
            f275247k = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 60);
        } else {
            f275245i = (long) (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar3, 300) * 1000);
            f275246j = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 1) == 1;
            f275247k = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 60);
        }
        Log.m105925i("MicroMsg.SnsRetryEditTipManager", "updateConfig configEnable:%s, configInterval:%s, configExpiredTime:%s", Boolean.valueOf(f275246j), Integer.valueOf(f275247k), Long.valueOf(f275245i));
        SnsMethodCalculate.markEndTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        long j = this.f275248a;
        if (j != 0) {
            long milliSecondsToNow = Util.milliSecondsToNow(j);
            long j2 = f275245i;
            if (milliSecondsToNow >= j2) {
                Log.m105924i("MicroMsg.SnsRetryEditTipManager", "already expired, reset directly");
                MMHandlerThread.postToMainThread(this.f275252e);
            } else {
                long milliSecondsToNow2 = j2 - Util.milliSecondsToNow(this.f275248a);
                Log.m105925i("MicroMsg.SnsRetryEditTipManager", "delay %s to reset", Long.valueOf(milliSecondsToNow2));
                MMHandlerThread.postToMainThreadDelayed(this.f275252e, milliSecondsToNow2);
            }
            SnsInfo snsInfo = this.f275250c;
            if (!(snsInfo == null || (e = C94897n1.m120367e(snsInfo)) == null)) {
                TimelineTrashReEditStruct G = SnsReportHelper.f275506m0.mo131346G();
                G.f266436h = G.mo86045b("Sessionid", this.f275251d, true);
                TimelineTrashReEditStruct G2 = SnsReportHelper.f275506m0.mo131346G();
                G2.f266433e = G2.mo86045b("PublishId", C102236a0.m134763p0(this.f275250c.field_snsId), true);
                SnsReportHelper.f275506m0.mo131346G().f266434f = (long) e.LikeCount;
                SnsReportHelper.f275506m0.mo131346G().f266435g = (long) e.CommentCount;
                TimelineTrashReEditStruct G3 = SnsReportHelper.f275506m0.mo131346G();
                G3.f266437i = G3.mo86045b("ActionTimeStamp", String.valueOf(System.currentTimeMillis()), true);
                TimelineTrashReEditStruct w = SnsReportHelper.f275506m0.mo131390w();
                w.f266436h = w.mo86045b("Sessionid", this.f275251d, true);
                TimelineTrashReEditStruct w2 = SnsReportHelper.f275506m0.mo131390w();
                w2.f266433e = w2.mo86045b("PublishId", C102236a0.m134763p0(this.f275250c.field_snsId), true);
                SnsReportHelper.f275506m0.mo131390w().f266434f = (long) e.LikeCount;
                SnsReportHelper.f275506m0.mo131390w().f266435g = (long) e.CommentCount;
                TimelineTrashReEditStruct w3 = SnsReportHelper.f275506m0.mo131390w();
                w3.f266437i = w3.mo86045b("ActionTimeStamp", String.valueOf(System.currentTimeMillis()), true);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    /* renamed from: d */
    public void mo131280d(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (!f275246j || snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return;
        }
        Log.m105924i("MicroMsg.SnsRetryEditTipManager", "prepareRetryEditInfo: start");
        f275243g = -1;
        f275242f = snsInfo.field_snsId;
        f275244h = snsInfo.field_createTime;
        this.f275248a = Util.nowMilliSecond();
        this.f275249b = "draft_retry_edit";
        C35287b0 Wx0 = C94866e1.Wx0();
        int i = snsInfo.localid;
        Wx0.getClass();
        SnsMethodCalculate.markStartTimeMs("genRetryEditDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        C35285a0 qq = Wx0.mo60188qq("draft_sent_" + i);
        if (qq != null) {
            Wx0.mo60186Yt("draft_retry_edit", qq.field_draft, 0);
        }
        SnsMethodCalculate.markEndTimeMs("genRetryEditDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        MMHandlerThread.postToMainThreadDelayed(this.f275252e, f275245i);
        SnsObject e = C94897n1.m120367e(snsInfo);
        this.f275251d = SnsReportHelper.f275506m0.mo131346G().f266436h;
        if (e != null) {
            this.f275250c = snsInfo;
            TimelineTrashReEditStruct G = SnsReportHelper.f275506m0.mo131346G();
            G.f266433e = G.mo86045b("PublishId", C102236a0.m134763p0(snsInfo.field_snsId), true);
            SnsReportHelper.f275506m0.mo131346G().f266434f = (long) e.LikeCount;
            SnsReportHelper.f275506m0.mo131346G().f266435g = (long) e.CommentCount;
            TimelineTrashReEditStruct G2 = SnsReportHelper.f275506m0.mo131346G();
            G2.f266437i = G2.mo86045b("ActionTimeStamp", String.valueOf(System.currentTimeMillis()), true);
            TimelineTrashReEditStruct w = SnsReportHelper.f275506m0.mo131390w();
            w.f266433e = w.mo86045b("PublishId", C102236a0.m134763p0(snsInfo.field_snsId), true);
            SnsReportHelper.f275506m0.mo131390w().f266434f = (long) e.LikeCount;
            SnsReportHelper.f275506m0.mo131390w().f266435g = (long) e.CommentCount;
            TimelineTrashReEditStruct w2 = SnsReportHelper.f275506m0.mo131390w();
            w2.f266437i = w2.mo86045b("ActionTimeStamp", String.valueOf(System.currentTimeMillis()), true);
        }
        Log.m105925i("MicroMsg.SnsRetryEditTipManager", "prepareRetryEditInfo draftKey:%s", this.f275249b);
        SnsMethodCalculate.markEndTimeMs("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    /* renamed from: e */
    public final void mo131281e() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        f275242f = -1;
        f275244h = 0;
        f275243g = -1;
        this.f275249b = "";
        this.f275248a = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }
}
