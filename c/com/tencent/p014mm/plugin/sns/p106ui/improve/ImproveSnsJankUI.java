package com.tencent.p014mm.plugin.sns.p106ui.improve;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C79760s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SNSJankReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFrameJankReportStruct;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hu2.C98534b;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import p233s3.C101511d;
import p233s3.C101512e;
import p233s3.C101513f;
import p233s3.C101514g;
import qt2.C101301a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import su2.C101702a;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Ls3/g$a;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI */
public abstract class ImproveSnsJankUI extends MMSecDataActivity implements C101514g.C101515a {

    /* renamed from: r */
    public static int f279577r = 0;

    /* renamed from: s */
    public static boolean f279578s = true;

    /* renamed from: d */
    public final int f279579d = hashCode();

    /* renamed from: e */
    public long f279580e = -1;

    /* renamed from: f */
    public long f279581f = -1;

    /* renamed from: g */
    public final SNSJankReportStruct f279582g = new SNSJankReportStruct();

    /* renamed from: h */
    public final C13601g f279583h = C36568h.m40985a(new C95819c(this));

    /* renamed from: i */
    public C101514g f279584i;

    /* renamed from: j */
    public C101301a f279585j = new C101301a(0, 0, 0, 0, 0, 0, 0, 0, 255, (C8480h) null);

    /* renamed from: n */
    public long f279586n;

    /* renamed from: o */
    public long f279587o;

    /* renamed from: p */
    public boolean f279588p;

    /* renamed from: q */
    public final C13601g f279589q;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$a */
    public static final class C95817a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ ImproveSnsJankUI f279590d;

        public C95817a(ImproveSnsJankUI improveSnsJankUI) {
            this.f279590d = improveSnsJankUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            ImproveSnsJankUI improveSnsJankUI = this.f279590d;
            int i2 = ImproveSnsJankUI.f279577r;
            SnsMethodCalculate.markStartTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
            improveSnsJankUI.getClass();
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
            if (i != 0) {
                if ((i == 1 || i == 2) && !improveSnsJankUI.f279588p) {
                    improveSnsJankUI.f279588p = true;
                    improveSnsJankUI.f279587o = System.currentTimeMillis();
                }
            } else if (improveSnsJankUI.f279588p) {
                improveSnsJankUI.f279588p = false;
                C101301a aVar = improveSnsJankUI.f279585j;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                long j = aVar.f296783c;
                SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                SnsMethodCalculate.markStartTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                aVar.f296783c = j + (System.currentTimeMillis() - improveSnsJankUI.f279587o);
                SnsMethodCalculate.markEndTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
            SnsMethodCalculate.markEndTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$b */
    public static final class C95818b extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveSnsJankUI f279591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95818b(ImproveSnsJankUI improveSnsJankUI) {
            super(0);
            this.f279591d = improveSnsJankUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$recycleView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$recycleView$2");
            WxRecyclerView wxRecyclerView = (WxRecyclerView) this.f279591d.findViewById(C0966R.C0970id.oez);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$recycleView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$recycleView$2");
            return wxRecyclerView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$c */
    public static final class C95819c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ ImproveSnsJankUI f279592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95819c(ImproveSnsJankUI improveSnsJankUI) {
            super(0);
            this.f279592d = improveSnsJankUI;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$refreshRate$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$refreshRate$2");
            Float valueOf = Float.valueOf(this.f279592d.getWindowManager().getDefaultDisplay().getRefreshRate());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$refreshRate$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$refreshRate$2");
            return valueOf;
        }
    }

    public ImproveSnsJankUI() {
        C87412m.m108594g(true & true ? "idle" : null, "scrollWord");
        this.f279589q = C36568h.m40985a(new C95818b(this));
    }

    /* renamed from: H7 */
    public final float mo133272H7() {
        SnsMethodCalculate.markStartTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        float floatValue = ((Number) ((C36570n) this.f279583h).getValue()).floatValue();
        SnsMethodCalculate.markEndTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        return floatValue;
    }

    /* renamed from: N6 */
    public void mo133273N6(C101511d dVar) {
        C101511d dVar2 = dVar;
        SnsMethodCalculate.markStartTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        C87412m.m108594g(dVar2, "frameData");
        C101301a aVar = this.f279585j;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i = aVar.f296782b;
        SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        SnsMethodCalculate.markStartTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        aVar.f296782b = i + 1;
        SnsMethodCalculate.markEndTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        if (this.f279588p) {
            C101301a aVar2 = this.f279585j;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            int i2 = aVar2.f296788h;
            SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            SnsMethodCalculate.markStartTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            aVar2.f296788h = i2 + 1;
            SnsMethodCalculate.markEndTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        }
        if (dVar2.f297229c) {
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            String valueOf = String.valueOf(this.f279579d);
            C101301a aVar3 = this.f279585j;
            aVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            int i3 = aVar3.f296782b;
            SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long j = (long) 1000000;
            SnsMethodCalculate.printFrameMethodStack(context, valueOf, i3, dVar2.f297228b / j);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_jank_frame_report, true)) {
                SnsFrameJankReportStruct snsFrameJankReportStruct = new SnsFrameJankReportStruct();
                snsFrameJankReportStruct.f266043d = snsFrameJankReportStruct.mo86045b("SessionId", String.valueOf(this.f279579d), true);
                C98534b bVar = C98534b.f288944a;
                SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
                String str = C98534b.f288946c;
                SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
                snsFrameJankReportStruct.f266050k = snsFrameJankReportStruct.mo86045b("CpuInfo", str, true);
                snsFrameJankReportStruct.f266044e = dVar2.f297227a;
                snsFrameJankReportStruct.f266045f = dVar2.f297228b;
                snsFrameJankReportStruct.f266048i = snsFrameJankReportStruct.mo86045b("JankState", C112551y.m153816p(dVar2.f297230d.toString(), ",", ";", false, 4, (Object) null), true);
                snsFrameJankReportStruct.f266049j = C101702a.f297759b.mo141157a() ? 1 : 2;
                if (dVar2 instanceof C101512e) {
                    snsFrameJankReportStruct.f266046g = ((C101512e) dVar2).f297231e;
                }
                if (dVar2 instanceof C101513f) {
                    snsFrameJankReportStruct.f266047h = ((C101513f) dVar2).f297232f;
                }
                snsFrameJankReportStruct.mo86054n();
            }
            C101301a aVar4 = this.f279585j;
            aVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            int i4 = aVar4.f296785e;
            SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            SnsMethodCalculate.markStartTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            aVar4.f296785e = i4 + 1;
            SnsMethodCalculate.markEndTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            C101301a aVar5 = this.f279585j;
            aVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long j2 = aVar5.f296786f;
            SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            SnsMethodCalculate.markStartTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            aVar5.f296786f = j2 + (dVar2.f297228b / j);
            SnsMethodCalculate.markEndTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            if (this.f279588p) {
                C101301a aVar6 = this.f279585j;
                aVar6.getClass();
                SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                int i5 = aVar6.f296787g;
                SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                SnsMethodCalculate.markStartTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                aVar6.f296787g = i5 + 1;
                SnsMethodCalculate.markEndTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                C101301a aVar7 = this.f279585j;
                aVar7.getClass();
                SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                long j3 = aVar7.f296784d;
                SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                SnsMethodCalculate.markStartTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                aVar7.f296784d = j3 + (dVar2.f297228b / j);
                SnsMethodCalculate.markEndTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            }
            Log.m105924i("MicroMsg.SnsJankActivity", "jank frame:" + dVar2);
        }
        SnsMethodCalculate.frameClear();
        SnsMethodCalculate.markEndTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "onCreate"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            super.onCreate(r11)
            java.lang.String r11 = "updateRepairInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            java.lang.String r3 = "update"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "enableAsmImprove"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_ASM_INT_SYNC
            r8 = 0
            int r6 = r6.mo119689j(r7, r8)
            r7 = 1
            if (r6 == r7) goto L_0x0047
            r9 = 2
            if (r6 == r9) goto L_0x0045
            di3.d r6 = di3.C86312j.m106911c(r0)
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_sns_improve_asm_enable
            boolean r6 = r6.mo58784wf(r9, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            goto L_0x004b
        L_0x0045:
            r6 = 0
            goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
        L_0x004b:
            su2.C101702a.f297758a = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_USE_IMPROVEUI_DISABLE_JANK_DIALOG_INT_SYNC
            int r3 = r3.mo119689j(r4, r8)
            if (r3 != 0) goto L_0x0061
            r8 = 1
        L_0x0061:
            f279578s = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            android.content.Intent r11 = r10.getIntent()
            r3 = -1
            java.lang.String r5 = "sns_jump_timestamp"
            long r3 = r11.getLongExtra(r5, r3)
            r10.f279580e = r3
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct r11 = r10.f279582g
            float r3 = r10.mo133272H7()
            int r3 = (int) r3
            r11.f265813m = r3
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct r11 = r10.f279582g
            long r3 = java.lang.System.currentTimeMillis()
            r11.f265815o = r3
            java.lang.String r5 = "PageStartTimeMs"
            r11.mo86046c(r5, r3)
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct r11 = r10.f279582g
            r11.f265822v = r7
            hu2.b r11 = hu2.C98534b.f288944a
            float r11 = r10.mo133272H7()
            int r11 = (int) r11
            java.lang.String r3 = "setRefreshRate"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            hu2.C98534b.f288947d = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r3 = 91
            r11.append(r3)
            int r3 = r10.hashCode()
            r11.append(r3)
            java.lang.String r3 = "]onCreate clickJumpToPageTimeMs:"
            r11.append(r3)
            long r3 = r10.f279580e
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.String r3 = "MicroMsg.SnsJankActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            r11 = 2131312849(0x7f0940d1, float:1.8244078E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.scroll_layout)"
            gy3.C87412m.m108593f(r11, r4)
            java.lang.String r4 = "bindJankView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            au2.b r5 = au2.C92093b.f263643a
            java.lang.String r5 = "enableJankGlobalReport"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_sns_improve_jank_global_report
            boolean r0 = r0.mo58784wf(r8, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "bindJankView enbaleJankReport:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r0 == 0) goto L_0x0155
            android.view.ViewParent r0 = r11.getParent()
        L_0x010a:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L_0x0116
            r11 = r0
            android.view.View r11 = (android.view.View) r11
            android.view.ViewParent r0 = r11.getParent()
            goto L_0x010a
        L_0x0116:
            r0 = 2131309194(0x7f09328a, float:1.8236665E38)
            java.lang.Object r3 = r11.getTag(r0)
            if (r3 != 0) goto L_0x0127
            s3.p$a r3 = new s3.p$a
            r3.<init>()
            r11.setTag(r0, r3)
        L_0x0127:
            s3.p$a r3 = (p233s3.C101526p.C101527a) r3
            android.view.Window r11 = r10.getWindow()
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r0 = f14.C58901s.f168555a
            boolean r3 = r0 instanceof a14.C53935p1
            r5 = 0
            if (r3 == 0) goto L_0x013a
            r3 = r0
            a14.p1 r3 = (a14.C53935p1) r3
            goto L_0x013b
        L_0x013a:
            r3 = r5
        L_0x013b:
            if (r3 == 0) goto L_0x0143
            java.util.concurrent.Executor r3 = r3.mo74625i0()
            if (r3 != 0) goto L_0x0148
        L_0x0143:
            a14.c1 r3 = new a14.c1
            r3.<init>(r0)
        L_0x0148:
            java.lang.String r0 = "window"
            gy3.C87412m.m108594g(r11, r0)
            s3.g r0 = new s3.g
            r0.<init>(r11, r3, r10, r5)
            r10.f279584i = r0
        L_0x0155:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r11 = "getRecycleView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r2)
            rx3.g r0 = r10.f279589q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "<get-recycleView>(...)"
            gy3.C87412m.m108593f(r0, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r2)
            com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$a r11 = new com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$a
            r11.<init>(r10)
            r0.mo17043c(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsJankUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        super.onDestroy();
        Log.m105924i("MicroMsg.SnsJankActivity", "onDestroy PageEnterCount:" + f279577r + " jank info:\nfreshRate:" + mo133272H7() + 10 + this.f279585j);
        this.f279584i = null;
        SNSJankReportStruct sNSJankReportStruct = this.f279582g;
        int i = 1;
        sNSJankReportStruct.f265818r = sNSJankReportStruct.mo86045b("SessionId", String.valueOf(this.f279579d), true);
        SNSJankReportStruct sNSJankReportStruct2 = this.f279582g;
        C98534b bVar = C98534b.f288944a;
        SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        String str = C98534b.f288946c;
        SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        sNSJankReportStruct2.f265821u = sNSJankReportStruct2.mo86045b("CpuInfo", str, true);
        SNSJankReportStruct sNSJankReportStruct3 = this.f279582g;
        long currentTimeMillis = System.currentTimeMillis();
        sNSJankReportStruct3.f265816p = currentTimeMillis;
        sNSJankReportStruct3.mo86046c("PageEnTimeMs", currentTimeMillis);
        SNSJankReportStruct sNSJankReportStruct4 = this.f279582g;
        C101301a aVar = this.f279585j;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j = aVar.f296783c;
        SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i2 = (int) j;
        sNSJankReportStruct4.f265806f = i2;
        sNSJankReportStruct4.mo86046c("TotalScrollTimeMs", (long) i2);
        SNSJankReportStruct sNSJankReportStruct5 = this.f279582g;
        C101301a aVar2 = this.f279585j;
        aVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j2 = aVar2.f296786f;
        SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i3 = (int) j2;
        sNSJankReportStruct5.f265807g = i3;
        sNSJankReportStruct5.mo86046c("TotalJankTimeMs", (long) i3);
        SNSJankReportStruct sNSJankReportStruct6 = this.f279582g;
        C101301a aVar3 = this.f279585j;
        aVar3.getClass();
        SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j3 = aVar3.f296784d;
        SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i4 = (int) j3;
        sNSJankReportStruct6.f265808h = i4;
        sNSJankReportStruct6.mo86046c("ScrollJankTimeMs", (long) i4);
        SNSJankReportStruct sNSJankReportStruct7 = this.f279582g;
        C101301a aVar4 = this.f279585j;
        aVar4.getClass();
        SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i5 = aVar4.f296782b;
        SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct7.f265809i = i5;
        SNSJankReportStruct sNSJankReportStruct8 = this.f279582g;
        C101301a aVar5 = this.f279585j;
        aVar5.getClass();
        SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i6 = aVar5.f296785e;
        SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct8.f265810j = i6;
        SNSJankReportStruct sNSJankReportStruct9 = this.f279582g;
        C101301a aVar6 = this.f279585j;
        aVar6.getClass();
        SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i7 = aVar6.f296788h;
        SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct9.f265811k = i7;
        SNSJankReportStruct sNSJankReportStruct10 = this.f279582g;
        C101301a aVar7 = this.f279585j;
        aVar7.getClass();
        SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i8 = aVar7.f296787g;
        SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct10.f265812l = i8;
        SNSJankReportStruct sNSJankReportStruct11 = this.f279582g;
        C101301a aVar8 = this.f279585j;
        aVar8.getClass();
        SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j4 = aVar8.f296781a;
        SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i9 = (int) j4;
        sNSJankReportStruct11.f265814n = i9;
        sNSJankReportStruct11.mo86046c("PageStayTimeMs", (long) i9);
        SNSJankReportStruct sNSJankReportStruct12 = this.f279582g;
        int i15 = f279577r;
        f279577r = i15 + 1;
        sNSJankReportStruct12.f265819s = i15;
        if (!C101702a.f297759b.mo141157a()) {
            i = 2;
        }
        sNSJankReportStruct12.f265820t = i;
        this.f279582g.mo86054n();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]onPause");
        super.onPause();
        C101514g gVar = this.f279584i;
        if (gVar != null) {
            gVar.f297235c.mo141003a(false);
        }
        C101301a aVar = this.f279585j;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j = aVar.f296781a;
        SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        SnsMethodCalculate.markStartTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        aVar.f296781a = j + (System.currentTimeMillis() - this.f279586n);
        SnsMethodCalculate.markEndTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]onResume");
        super.onResume();
        C101514g gVar = this.f279584i;
        if (gVar != null) {
            gVar.f297235c.mo141003a(true);
        }
        this.f279586n = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        super.onWindowFocusChanged(z);
        C79760s.m96909b();
        if (this.f279581f < 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f279581f = currentTimeMillis;
            long j = this.f279580e;
            if (j > 0) {
                this.f279582g.f265817q = (int) (currentTimeMillis - j);
                Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]enter page cost:" + this.f279582g.f265817q);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }
}
