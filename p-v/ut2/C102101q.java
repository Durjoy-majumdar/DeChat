package ut2;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0317e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import hu2.C98528a;
import hu2.C98536c;
import java.util.ArrayList;
import kotlin.ResultKt;
import l31.C61212e;
import l31.C99333f;
import o31.C11345b;
import o31.C76986a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ut2.q */
public final class C102101q extends C102084a {

    /* renamed from: d */
    public final ArrayList<C98528a> f300655d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2", mo125469f = "ImproveReportUIC.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
    /* renamed from: ut2.q$a */
    public static final class C102102a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f300656d;

        /* renamed from: e */
        public final /* synthetic */ C102101q f300657e;

        /* renamed from: f */
        public final /* synthetic */ C102104r f300658f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102102a(C102101q qVar, C102104r rVar, C15601d<? super C102102a> dVar) {
            super(2, dVar);
            this.f300657e = qVar;
            this.f300658f = rVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            C102102a aVar = new C102102a(this.f300657e, this.f300658f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            Object invokeSuspend = ((C102102a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f300656d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C102101q qVar = this.f300657e;
                WxRecyclerView recycleView = qVar.getRecycleView();
                C102104r rVar = this.f300658f;
                this.f300656d = 1;
                if (qVar.onScrollStateChanged(recycleView, rVar, 0, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onPause$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC", mo125469f = "ImproveReportUIC.kt", mo125470l = {93, 94}, mo125471m = "onScrollStateChanged")
    /* renamed from: ut2.q$b */
    public static final class C102103b extends C66704d {

        /* renamed from: d */
        public Object f300659d;

        /* renamed from: e */
        public Object f300660e;

        /* renamed from: f */
        public Object f300661f;

        /* renamed from: g */
        public int f300662g;

        /* renamed from: h */
        public /* synthetic */ Object f300663h;

        /* renamed from: i */
        public final /* synthetic */ C102101q f300664i;

        /* renamed from: j */
        public int f300665j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102103b(C102101q qVar, C15601d<? super C102103b> dVar) {
            super(dVar);
            this.f300664i = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onScrollStateChanged$1");
            this.f300663h = obj;
            this.f300665j |= Integer.MIN_VALUE;
            Object onScrollStateChanged = this.f300664i.onScrollStateChanged((RecyclerView) null, (C102104r) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC$onScrollStateChanged$1");
            return onScrollStateChanged;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102101q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        ArrayList<C98528a> arrayList = new ArrayList<>();
        this.f300655d = arrayList;
        arrayList.add(new C98536c(this));
    }

    public void onCreate(Bundle bundle) {
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        Log.m105924i("MicroMsg.Improve.ReportUIC", '[' + hashCode() + "]onCreate");
        super.onCreate(bundle);
        for (C98528a b : this.f300655d) {
            b.mo137885b(bundle);
        }
        int intExtra = getIntent().getIntExtra("sns_unread_count", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("enter_by_red", false);
        ((C99333f) C86312j.m106911c(cls)).mo138724nU(12076, "UnReadMsgCount", Integer.valueOf(intExtra));
        ((C99333f) C86312j.m106911c(cls)).mo138724nU(12076, "HasNewSnsMsgWhenEntrance", Boolean.valueOf(booleanExtra));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(getActivity(), C11345b.SnsTimeLineUI).mo86179qs(getActivity(), C76986a.Moments).mo86136FZ(getActivity(), C102101q.class.getSimpleName());
        SnsReportHelper.f275506m0.mo131378k();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        Log.m105924i("MicroMsg.Improve.ReportUIC", '[' + hashCode() + "]onDestroy");
        super.onDestroy();
        for (C98528a c : this.f300655d) {
            c.mo137886c();
        }
        SnsReportHelper.f275506m0.mo131380m();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        Log.m105924i("MicroMsg.Improve.ReportUIC", '[' + hashCode() + "]onPause");
        super.onPause();
        for (C98528a d : this.f300655d) {
            d.mo137887d();
        }
        C0317e.launch$default(this, getDispatcher(), (C53934p0) null, new C102102a(this, getVisibleItemView(), (C15601d<? super C102102a>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        Log.m105924i("MicroMsg.Improve.ReportUIC", '[' + hashCode() + "]onResume");
        super.onResume();
        for (C98528a e : this.f300655d) {
            e.mo137888e();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: ut2.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r8, ut2.C102104r r9, int r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r7 = this;
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof ut2.C102101q.C102103b
            if (r2 == 0) goto L_0x001b
            r2 = r11
            ut2.q$b r2 = (ut2.C102101q.C102103b) r2
            int r3 = r2.f300665j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f300665j = r3
            goto L_0x0020
        L_0x001b:
            ut2.q$b r2 = new ut2.q$b
            r2.<init>(r7, r11)
        L_0x0020:
            java.lang.Object r11 = r2.f300663h
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f300665j
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x005e
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0040
            int r8 = r2.f300662g
            java.lang.Object r9 = r2.f300661f
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r2.f300660e
            ut2.r r10 = (ut2.C102104r) r10
            java.lang.Object r4 = r2.f300659d
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0080
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r8
        L_0x004b:
            int r10 = r2.f300662g
            java.lang.Object r8 = r2.f300661f
            r9 = r8
            ut2.r r9 = (ut2.C102104r) r9
            java.lang.Object r8 = r2.f300660e
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            java.lang.Object r4 = r2.f300659d
            ut2.q r4 = (ut2.C102101q) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0076
        L_0x005e:
            kotlin.ResultKt.throwOnFailure(r11)
            r2.f300659d = r7
            r2.f300660e = r8
            r2.f300661f = r9
            r2.f300662g = r10
            r2.f300665j = r6
            java.lang.Object r11 = super.onScrollStateChanged(r8, r9, r10, r2)
            if (r11 != r3) goto L_0x0075
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0075:
            r4 = r7
        L_0x0076:
            java.util.ArrayList<hu2.a> r11 = r4.f300655d
            java.util.Iterator r11 = r11.iterator()
            r4 = r8
            r8 = r10
            r10 = r9
            r9 = r11
        L_0x0080:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00a0
            java.lang.Object r11 = r9.next()
            hu2.a r11 = (hu2.C98528a) r11
            r2.f300659d = r4
            r2.f300660e = r10
            r2.f300661f = r9
            r2.f300662g = r8
            r2.f300665j = r5
            java.lang.Object r11 = r11.mo137889f(r4, r10, r8, r2)
            if (r11 != r3) goto L_0x0080
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x00a0:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.C102101q.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, ut2.r, int, wx3.d):java.lang.Object");
    }
}
