package com.tencent.p014mm.plugin.sns.p106ui.monitor;

import a14.C0000n0;
import a14.C53866c1;
import a14.C53872d1;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import a14.C53935p1;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AbsListView;
import androidx.appcompat.app.AppCompatActivity;
import bp3.C79760s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SNSJankReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFrameJankReportStruct;
import com.tencent.p014mm.plugin.secdata.p843ui.WxPresenterSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ks2.C99180d;
import p233s3.C101511d;
import p233s3.C101512e;
import p233s3.C101513f;
import p233s3.C101514g;
import p233s3.C101526p;
import p233s3.C13617q;
import p761yd.C91441c;
import p995kf.C88146a;
import pu2.C62549p;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import su2.C101702a;
import uu2.C102112a;
import xu2.C102742a;
import xu2.C66444b;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity;", "Lcom/tencent/mm/plugin/secdata/ui/WxPresenterSecDataActivity;", "Ls3/g$a;", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/view/View;", "root", "Lrx3/b0;", "bindJankView", "<init>", "()V", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity */
public abstract class SnsJankActivity extends WxPresenterSecDataActivity implements C101514g.C101515a, AbsListView.OnScrollListener {

    /* renamed from: s */
    public static final C96073a f280539s = new C96073a((C8480h) null);

    /* renamed from: t */
    public static C101526p.C101527a f280540t;

    /* renamed from: u */
    public static int f280541u;

    /* renamed from: e */
    public final int f280542e = hashCode();

    /* renamed from: f */
    public long f280543f = -1;

    /* renamed from: g */
    public long f280544g = -1;

    /* renamed from: h */
    public final SNSJankReportStruct f280545h = new SNSJankReportStruct();

    /* renamed from: i */
    public final C13601g f280546i = C36568h.m40985a(new C96074b(this));

    /* renamed from: j */
    public C101514g f280547j;

    /* renamed from: n */
    public C102742a f280548n = new C102742a(0, 0, 0, 0, 0, 0, 0, 0, 255, (C8480h) null);

    /* renamed from: o */
    public C66444b f280549o = new C66444b(0, (String) null, 3, (C8480h) null);

    /* renamed from: p */
    public long f280550p;

    /* renamed from: q */
    public long f280551q;

    /* renamed from: r */
    public boolean f280552r;

    /* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$a */
    public static final class C96073a {
        public C96073a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo133612a(String str, String str2) {
            C101526p pVar;
            SnsMethodCalculate.markStartTimeMs("addState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, "state");
            SnsMethodCalculate.markStartTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            C96073a aVar = SnsJankActivity.f280539s;
            SnsMethodCalculate.markStartTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            C101526p.C101527a aVar2 = SnsJankActivity.f280540t;
            SnsMethodCalculate.markEndTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            SnsMethodCalculate.markEndTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            if (!(aVar2 == null || (pVar = aVar2.f297258a) == null)) {
                synchronized (pVar.f297255b) {
                    long nanoTime = System.nanoTime();
                    pVar.mo141013d(str, pVar.f297254a, nanoTime);
                    ((ArrayList) pVar.f297254a).add(new C101526p.C101528b(nanoTime, -1, new C13617q(str, str2)));
                }
            }
            SnsMethodCalculate.markEndTimeMs("addState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        }

        /* renamed from: b */
        public final void mo133613b(String str) {
            C101526p pVar;
            SnsMethodCalculate.markStartTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            C87412m.m108594g(str, "name");
            SnsMethodCalculate.markStartTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            C96073a aVar = SnsJankActivity.f280539s;
            SnsMethodCalculate.markStartTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            C101526p.C101527a aVar2 = SnsJankActivity.f280540t;
            SnsMethodCalculate.markEndTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            SnsMethodCalculate.markEndTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            if (!(aVar2 == null || (pVar = aVar2.f297258a) == null)) {
                pVar.mo141013d(str, pVar.f297254a, System.nanoTime());
            }
            SnsMethodCalculate.markEndTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$b */
    public static final class C96074b extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ SnsJankActivity f280553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96074b(SnsJankActivity snsJankActivity) {
            super(0);
            this.f280553d = snsJankActivity;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
            Float valueOf = Float.valueOf(this.f280553d.getWindowManager().getDefaultDisplay().getRefreshRate());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$refreshRate$2");
            return valueOf;
        }
    }

    public SnsJankActivity() {
    }

    /* renamed from: I7 */
    public final float mo133608I7() {
        SnsMethodCalculate.markStartTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        float floatValue = ((Number) ((C36570n) this.f280546i).getValue()).floatValue();
        SnsMethodCalculate.markEndTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        return floatValue;
    }

    /* renamed from: N6 */
    public void mo133273N6(C101511d dVar) {
        C101511d dVar2 = dVar;
        SnsMethodCalculate.markStartTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        C87412m.m108594g(dVar2, "frameData");
        C102742a aVar = this.f280548n;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        int i = aVar.f303367b;
        SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        SnsMethodCalculate.markStartTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        aVar.f303367b = i + 1;
        SnsMethodCalculate.markEndTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        if (this.f280552r) {
            C102742a aVar2 = this.f280548n;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i2 = aVar2.f303373h;
            SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            SnsMethodCalculate.markStartTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar2.f303373h = i2 + 1;
            SnsMethodCalculate.markEndTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        }
        if (dVar2.f297229c) {
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            String valueOf = String.valueOf(this.f280542e);
            C102742a aVar3 = this.f280548n;
            aVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i3 = aVar3.f303367b;
            SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j = (long) 1000000;
            SnsMethodCalculate.printFrameMethodStack(context, valueOf, i3, dVar2.f297228b / j);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_jank_frame_report, false)) {
                SnsFrameJankReportStruct snsFrameJankReportStruct = new SnsFrameJankReportStruct();
                snsFrameJankReportStruct.f266043d = snsFrameJankReportStruct.mo86045b("SessionId", String.valueOf(this.f280542e), true);
                C102112a aVar4 = C102112a.f300683a;
                SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
                String str = C102112a.f300685c;
                SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
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
            C102742a aVar5 = this.f280548n;
            aVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i4 = aVar5.f303370e;
            SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            SnsMethodCalculate.markStartTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar5.f303370e = i4 + 1;
            SnsMethodCalculate.markEndTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            C102742a aVar6 = this.f280548n;
            aVar6.getClass();
            SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j2 = aVar6.f303371f;
            SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            SnsMethodCalculate.markStartTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar6.f303371f = j2 + (dVar2.f297228b / j);
            SnsMethodCalculate.markEndTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            if (this.f280552r) {
                C102742a aVar7 = this.f280548n;
                aVar7.getClass();
                SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                int i5 = aVar7.f303372g;
                SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                SnsMethodCalculate.markStartTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                aVar7.f303372g = i5 + 1;
                SnsMethodCalculate.markEndTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                C102742a aVar8 = this.f280548n;
                aVar8.getClass();
                SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                long j3 = aVar8.f303369d;
                SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                SnsMethodCalculate.markStartTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                aVar8.f303369d = j3 + (dVar2.f297228b / j);
                SnsMethodCalculate.markEndTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            }
            Log.m105924i("MicroMsg.SnsJankActivity", "jank frame:" + dVar2);
        }
        SnsMethodCalculate.frameClear();
        SnsMethodCalculate.markEndTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    public final void bindJankView(View view) {
        Executor executor;
        SnsMethodCalculate.markStartTimeMs("bindJankView", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        C87412m.m108594g(view, "root");
        Log.m105924i("MicroMsg.SnsJankActivity", "bindJankView");
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_jank_global_report, false)) {
            ViewParent viewParent = view.getParent();
            while (viewParent instanceof View) {
                view = (View) viewParent;
                viewParent = view.getParent();
            }
            Object tag = view.getTag(C0966R.C0970id.mtt);
            if (tag == null) {
                tag = new C101526p.C101527a();
                view.setTag(C0966R.C0970id.mtt, tag);
            }
            f280540t = (C101526p.C101527a) tag;
            Window window = getWindow();
            C87412m.m108593f(window, "window");
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C53935p1 p1Var = k2Var instanceof C53935p1 ? (C53935p1) k2Var : null;
            if (p1Var == null || (executor = p1Var.mo74625i0()) == null) {
                executor = new C53866c1(k2Var);
            }
            this.f280547j = new C101514g(window, executor, this, (C8480h) null);
        }
        SnsMethodCalculate.markEndTimeMs("bindJankView", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        C62549p.f177651a = C53930o0.m60555b();
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        this.f280543f = getIntent().getLongExtra("sns_jump_timestamp", -1);
        this.f280545h.f265813m = (int) mo133608I7();
        SNSJankReportStruct sNSJankReportStruct = this.f280545h;
        long currentTimeMillis = System.currentTimeMillis();
        sNSJankReportStruct.f265815o = currentTimeMillis;
        sNSJankReportStruct.mo86046c("PageStartTimeMs", currentTimeMillis);
        this.f280545h.f265822v = 2;
        C102112a aVar = C102112a.f300683a;
        SnsMethodCalculate.markStartTimeMs("setRefreshRate", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        C102112a.f300686d = (int) mo133608I7();
        SnsMethodCalculate.markEndTimeMs("setRefreshRate", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        if (Build.VERSION.SDK_INT >= 24) {
            SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
            if (C91441c.m114729c() && !C99180d.f290856b) {
                ((C88146a) C91441c.m114730d().mo125377a(C88146a.class)).f254918n.mo124268n(C99180d.f290855a);
                C99180d.f290856b = true;
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        }
        Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]onCreate clickJumpToPageTimeMs:" + this.f280543f);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        if (Build.VERSION.SDK_INT >= 24) {
            SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
            if (C91441c.m114729c() && C99180d.f290856b) {
                ((C88146a) C91441c.m114730d().mo125377a(C88146a.class)).f254918n.mo124269o(C99180d.f290855a);
                C99180d.f290856b = false;
            }
            SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        }
        Log.m105924i("MicroMsg.SnsJankActivity", "onDestroy PageEnterCount:" + f280541u + " jank info:\n系统刷新率:" + mo133608I7() + 10 + this.f280548n);
        super.onDestroy();
        SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        C0000n0 n0Var = C62549p.f177651a;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        C62549p.f177651a = null;
        SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        this.f280547j = null;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_jank_global_report, false)) {
            SNSJankReportStruct sNSJankReportStruct = this.f280545h;
            int i = 1;
            sNSJankReportStruct.f265818r = sNSJankReportStruct.mo86045b("SessionId", String.valueOf(this.f280542e), true);
            SNSJankReportStruct sNSJankReportStruct2 = this.f280545h;
            C102112a aVar = C102112a.f300683a;
            SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            String str = C102112a.f300685c;
            SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            sNSJankReportStruct2.f265821u = sNSJankReportStruct2.mo86045b("CpuInfo", str, true);
            SNSJankReportStruct sNSJankReportStruct3 = this.f280545h;
            long currentTimeMillis = System.currentTimeMillis();
            sNSJankReportStruct3.f265816p = currentTimeMillis;
            sNSJankReportStruct3.mo86046c("PageEnTimeMs", currentTimeMillis);
            SNSJankReportStruct sNSJankReportStruct4 = this.f280545h;
            C102742a aVar2 = this.f280548n;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j = aVar2.f303368c;
            SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i2 = (int) j;
            sNSJankReportStruct4.f265806f = i2;
            sNSJankReportStruct4.mo86046c("TotalScrollTimeMs", (long) i2);
            SNSJankReportStruct sNSJankReportStruct5 = this.f280545h;
            C102742a aVar3 = this.f280548n;
            aVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j2 = aVar3.f303371f;
            SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i3 = (int) j2;
            sNSJankReportStruct5.f265807g = i3;
            sNSJankReportStruct5.mo86046c("TotalJankTimeMs", (long) i3);
            SNSJankReportStruct sNSJankReportStruct6 = this.f280545h;
            C102742a aVar4 = this.f280548n;
            aVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j3 = aVar4.f303369d;
            SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i4 = (int) j3;
            sNSJankReportStruct6.f265808h = i4;
            sNSJankReportStruct6.mo86046c("ScrollJankTimeMs", (long) i4);
            SNSJankReportStruct sNSJankReportStruct7 = this.f280545h;
            C102742a aVar5 = this.f280548n;
            aVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i5 = aVar5.f303367b;
            SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct7.f265809i = i5;
            SNSJankReportStruct sNSJankReportStruct8 = this.f280545h;
            C102742a aVar6 = this.f280548n;
            aVar6.getClass();
            SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i6 = aVar6.f303370e;
            SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct8.f265810j = i6;
            SNSJankReportStruct sNSJankReportStruct9 = this.f280545h;
            C102742a aVar7 = this.f280548n;
            aVar7.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i7 = aVar7.f303373h;
            SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct9.f265811k = i7;
            SNSJankReportStruct sNSJankReportStruct10 = this.f280545h;
            C102742a aVar8 = this.f280548n;
            aVar8.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i8 = aVar8.f303372g;
            SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct10.f265812l = i8;
            SNSJankReportStruct sNSJankReportStruct11 = this.f280545h;
            C102742a aVar9 = this.f280548n;
            aVar9.getClass();
            SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j4 = aVar9.f303366a;
            SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i9 = (int) j4;
            sNSJankReportStruct11.f265814n = i9;
            sNSJankReportStruct11.mo86046c("PageStayTimeMs", (long) i9);
            SNSJankReportStruct sNSJankReportStruct12 = this.f280545h;
            int i15 = f280541u;
            f280541u = i15 + 1;
            sNSJankReportStruct12.f265819s = i15;
            if (!C101702a.f297759b.mo141157a()) {
                i = 2;
            }
            sNSJankReportStruct12.f265820t = i;
            this.f280545h.mo86054n();
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]onPause");
        super.onPause();
        C101514g gVar = this.f280547j;
        if (gVar != null) {
            gVar.f297235c.mo141003a(false);
        }
        C102742a aVar = this.f280548n;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j = aVar.f303366a;
        SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        SnsMethodCalculate.markStartTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        aVar.f303366a = j + (System.currentTimeMillis() - this.f280550p);
        SnsMethodCalculate.markEndTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]onResume");
        super.onResume();
        C101514g gVar = this.f280547j;
        if (gVar != null) {
            gVar.f297235c.mo141003a(true);
        }
        this.f280550p = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        C66444b bVar = this.f280549o;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        int i2 = bVar.f191201a;
        SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        if (i2 != i) {
            C96073a aVar = f280539s;
            C66444b bVar2 = this.f280549o;
            bVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            String str = bVar2.f191202b;
            SnsMethodCalculate.markEndTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            aVar.mo133613b(str);
            if (i == 1) {
                this.f280549o.mo90530a("scroll");
                SnsMethodCalculate.markStartTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (!this.f280552r) {
                    this.f280552r = true;
                    this.f280551q = System.currentTimeMillis();
                }
                SnsMethodCalculate.markEndTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            } else if (i != 2) {
                this.f280549o.mo90530a("idle");
                SnsMethodCalculate.markStartTimeMs("stopScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (this.f280552r) {
                    this.f280552r = false;
                    C102742a aVar2 = this.f280548n;
                    aVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    long j = aVar2.f303368c;
                    SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    SnsMethodCalculate.markStartTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    aVar2.f303368c = j + (System.currentTimeMillis() - this.f280551q);
                    SnsMethodCalculate.markEndTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                }
                SnsMethodCalculate.markEndTimeMs("stopScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            } else {
                this.f280549o.mo90530a("fling");
                SnsMethodCalculate.markStartTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (!this.f280552r) {
                    this.f280552r = true;
                    this.f280551q = System.currentTimeMillis();
                }
                SnsMethodCalculate.markEndTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            }
            C66444b bVar3 = this.f280549o;
            bVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            String str2 = bVar3.f191202b;
            SnsMethodCalculate.markEndTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            SnsMethodCalculate.markStartTimeMs("addState$default", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            aVar.mo133612a(str2, "");
            SnsMethodCalculate.markEndTimeMs("addState$default", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        super.onWindowFocusChanged(z);
        C79760s.m96909b();
        if (this.f280544g < 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f280544g = currentTimeMillis;
            long j = this.f280543f;
            if (j > 0) {
                this.f280545h.f265817q = (int) (currentTimeMillis - j);
                Log.m105924i("MicroMsg.SnsJankActivity", '[' + hashCode() + "]enter page cost:" + this.f280545h.f265817q);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }
}
