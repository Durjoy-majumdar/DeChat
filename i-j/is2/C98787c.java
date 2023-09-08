package is2;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2", mo125469f = "SnsImageLoader.kt", mo125470l = {163}, mo125471m = "invokeSuspend")
/* renamed from: is2.c */
public final class C98787c extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public Object f289623d;

    /* renamed from: e */
    public Object f289624e;

    /* renamed from: f */
    public Object f289625f;

    /* renamed from: g */
    public int f289626g;

    /* renamed from: h */
    public final /* synthetic */ boolean f289627h;

    /* renamed from: i */
    public final /* synthetic */ C101804kv2 f289628i;

    /* renamed from: is2.c$a */
    public static final class C98788a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C94853e f289629d;

        /* renamed from: e */
        public final /* synthetic */ C98789b f289630e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98788a(C94853e eVar, C98789b bVar) {
            super(1);
            this.f289629d = eVar;
            this.f289630e = bVar;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$1");
            Throwable th = (Throwable) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$1");
            this.f289629d.mo130997v(this.f289630e);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$1");
            return b0Var;
        }
    }

    /* renamed from: is2.c$b */
    public static final class C98789b implements C94853e.C94861h {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f289631d;

        /* renamed from: e */
        public final /* synthetic */ String f289632e;

        /* renamed from: f */
        public final /* synthetic */ C94853e f289633f;

        /* renamed from: g */
        public final /* synthetic */ C53916l<String> f289634g;

        public C98789b(C101804kv2 kv22, String str, C94853e eVar, C53916l<? super String> lVar) {
            this.f289631d = kv22;
            this.f289632e = str;
            this.f289633f = eVar;
            this.f289634g = lVar;
        }

        public void onImageFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
            if (C87412m.m108589b(str, this.f289631d.f298689d)) {
                this.f289633f.mo130997v(this);
                C53916l<String> lVar = this.f289634g;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(this.f289632e));
            }
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        }

        public void onSetbg() {
            SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
            SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        }

        public void onSightFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
            Log.m105924i("MicroMsg.SnsImageLoader", "onSightFinish: " + str);
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        }

        public void onThumbFinish(String str) {
            SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
            C87412m.m108594g(str, "mediaId");
            if (C87412m.m108589b(str, this.f289631d.f298689d)) {
                Log.m105924i("MicroMsg.SnsImageLoader", "onThumbFinish: " + this.f289632e);
                this.f289633f.mo130997v(this);
                C53916l<String> lVar = this.f289634g;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(this.f289632e));
            }
            SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98787c(boolean z, C101804kv2 kv22, C15601d<? super C98787c> dVar) {
        super(2, dVar);
        this.f289627h = z;
        this.f289628i = kv22;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        C98787c cVar = new C98787c(this.f289627h, this.f289628i, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        Object invokeSuspend = ((C98787c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f289626g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String X = this.f289627h ? C102236a0.m134729X(this.f289628i) : C102236a0.m134717L(this.f289628i);
            if (this.f289627h) {
                str = C94901o.m120386o(this.f289628i);
            } else {
                str = C86013q1.m106448i(C94938q1.m120518e(C94866e1.m120262YO(), this.f289628i.f298689d) + X, false);
            }
            if (C86013q1.m106450k(str)) {
                Log.m105920e("MicroMsg.SnsImageLoader", "getImagePathFromMedia fileExists path:" + str);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                return str;
            }
            C102268v vVar = new C102268v(this.f289628i);
            if (this.f289627h) {
                vVar.mo141832d(1);
                i = this.f289628i.f298690e == 6 ? 5 : 1;
            } else {
                vVar.mo141832d(3);
                i = 2;
            }
            vVar.mo141833e(this.f289628i.f298689d);
            C94853e Vx0 = C94866e1.Vx0();
            Log.m105924i("MicroMsg.SnsImageLoader", "start downloading mediaId=" + this.f289628i.f298689d);
            Vx0.mo130979d(this.f289628i, i, vVar, C96983o3.f284135g);
            C101804kv2 kv22 = this.f289628i;
            this.f289623d = str;
            this.f289624e = Vx0;
            this.f289625f = kv22;
            this.f289626g = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C98789b bVar = new C98789b(kv22, str, Vx0, mVar);
            Vx0.mo130978c(bVar);
            mVar.mo74599v(new C98788a(Vx0, bVar));
            obj = mVar.mo74608o();
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
                return aVar;
            }
        } else if (i2 == 1) {
            C101804kv2 kv23 = (C101804kv2) this.f289625f;
            C94853e eVar = (C94853e) this.f289624e;
            String str2 = (String) this.f289623d;
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
            throw illegalStateException;
        }
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2");
        return obj;
    }
}
