package aq0;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import lp3.C46888b;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49335eu3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.networking.lib_server_mode.CgiServiceImplByLibServer$syncPipeline$1$1", mo125469f = "CgiServiceImplByLibServer.kt", mo125470l = {153}, mo125471m = "invokeSuspend")
/* renamed from: aq0.b */
public final class C54289b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f152381d;

    /* renamed from: e */
    public final /* synthetic */ C79626a f152382e;

    /* renamed from: f */
    public final /* synthetic */ String f152383f;

    /* renamed from: g */
    public final /* synthetic */ C47465a f152384g;

    /* renamed from: h */
    public final /* synthetic */ Class<C49335eu3> f152385h;

    /* renamed from: i */
    public final /* synthetic */ C46888b f152386i;

    /* renamed from: j */
    public final /* synthetic */ String f152387j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54289b(C79626a aVar, String str, C47465a aVar2, Class<C49335eu3> cls, C46888b bVar, String str2, C15601d<? super C54289b> dVar) {
        super(2, dVar);
        this.f152382e = aVar;
        this.f152383f = str;
        this.f152384g = aVar2;
        this.f152385h = cls;
        this.f152386i = bVar;
        this.f152387j = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54289b(this.f152382e, this.f152383f, this.f152384g, this.f152385h, this.f152386i, this.f152387j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54289b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f152381d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C79626a aVar2 = this.f152382e;
            String str = this.f152383f;
            C87412m.m108591d(str);
            C47465a aVar3 = this.f152384g;
            Class<C49335eu3> cls = this.f152385h;
            C87412m.m108592e(cls, "null cannot be cast to non-null type java.lang.Class<in com.tencent.mm.protocal.protobuf.ResponseProtoBuf>");
            this.f152381d = 1;
            obj = C79626a.m96703c(aVar2, str, aVar3, cls, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                this.f152386i.mo72091a(e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f152386i.mo72093c((C49335eu3) obj);
        return C13598b0.f38549a;
    }
}
