package yt2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53896h0;
import a14.C53934p0;
import android.view.MenuItem;
import bl3.C0317e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import nj3.C11184p0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: yt2.i */
public final class C39168i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C53578f f105403d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1", mo125469f = "ImproveToolBarUIC.kt", mo125470l = {116}, mo125471m = "invokeSuspend")
    /* renamed from: yt2.i$a */
    public static final class C39169a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f105404d;

        /* renamed from: e */
        public final /* synthetic */ C53578f f105405e;

        /* renamed from: f */
        public final /* synthetic */ MenuItem f105406f;

        /* renamed from: yt2.i$a$a */
        public static final class C39170a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C39160b f105407d;

            /* renamed from: e */
            public final /* synthetic */ C53578f f105408e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39170a(C39160b bVar, C53578f fVar) {
                super(1);
                this.f105407d = bVar;
                this.f105408e = fVar;
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
                if (this.f105407d.type() == C53572c.SECOND_CUT.mo74217a()) {
                    C53578f fVar = this.f105408e;
                    int type = this.f105407d.type();
                    int i = booleanValue ? 1 : 2;
                    SnsMethodCalculate.markStartTimeMs("access$report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                    fVar.mo74224e3(type, i);
                    SnsMethodCalculate.markEndTimeMs("access$report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                } else {
                    C53578f fVar2 = this.f105408e;
                    int type2 = this.f105407d.type();
                    SnsMethodCalculate.markStartTimeMs("report$default", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                    fVar2.mo74224e3(type2, 0);
                    SnsMethodCalculate.markEndTimeMs("report$default", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                }
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39169a(C53578f fVar, MenuItem menuItem, C15601d<? super C39169a> dVar) {
            super(2, dVar);
            this.f105405e = fVar;
            this.f105406f = menuItem;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            C39169a aVar = new C39169a(this.f105405e, this.f105406f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            Object invokeSuspend = ((C39169a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f105404d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C39160b bVar = (C39160b) C53578f.m60109d3(this.f105405e).get(new Integer(this.f105406f.getItemId()));
                if (bVar == null) {
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
                    return b0Var;
                }
                C39170a aVar2 = new C39170a(bVar, this.f105405e);
                this.f105404d = 1;
                if (bVar.mo61965b(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
                throw illegalStateException;
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1");
            return b0Var2;
        }
    }

    public C39168i(C53578f fVar) {
        this.f105403d = fVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2");
        C87412m.m108594g(menuItem, "menuItem");
        C53578f fVar = this.f105403d;
        C53896h0 h0Var = C53872d1.f151117a;
        C0317e.launch$default(fVar, C58901s.f168555a, (C53934p0) null, new C39169a(fVar, menuItem, (C15601d<? super C39169a>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2");
    }
}
