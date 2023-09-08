package is2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C11184p0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: is2.h */
public final class C60620h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C0000n0 f172719d;

    /* renamed from: e */
    public final /* synthetic */ String f172720e;

    /* renamed from: f */
    public final /* synthetic */ int f172721f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f172722g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1", mo125469f = "WithTaRemove.kt", mo125470l = {32}, mo125471m = "invokeSuspend")
    /* renamed from: is2.h$a */
    public static final class C60621a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f172723d;

        /* renamed from: e */
        public final /* synthetic */ String f172724e;

        /* renamed from: f */
        public final /* synthetic */ int f172725f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f172726g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60621a(String str, int i, C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C60621a> dVar) {
            super(2, dVar);
            this.f172724e = str;
            this.f172725f = i;
            this.f172726g = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            C60621a aVar = new C60621a(this.f172724e, this.f172725f, this.f172726g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            Object invokeSuspend = ((C60621a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f172723d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C98793f fVar = C98793f.f289639a;
                String str = this.f172724e;
                int i2 = this.f172725f;
                this.f172723d = 1;
                obj = fVar.mo138168t(str, i2, this);
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
                throw illegalStateException;
            }
            this.f172726g.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
            return b0Var;
        }
    }

    public C60620h(C0000n0 n0Var, String str, int i, C32226l<? super Boolean, C13598b0> lVar) {
        this.f172719d = n0Var;
        this.f172720e = str;
        this.f172721f = i;
        this.f172722g = lVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2");
        if (menuItem.getItemId() == 1) {
            C53895h.m60466d(this.f172719d, (C66212f) null, (C53934p0) null, new C60621a(this.f172720e, this.f172721f, this.f172722g, (C15601d<? super C60621a>) null), 3, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2");
    }
}
