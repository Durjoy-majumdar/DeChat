package com.tencent.p014mm.plugin.finder.activity;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import i31.C117134d;
import jt1.C9517a;
import jt1.C9519c;
import kotlin.ResultKt;
import pd1.C11887a;
import rx3.C13598b0;
import te3.C51722vp0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.FinderActivityProfileUI$Companion$preloadCampaignInfo$1", mo125469f = "FinderActivityProfileUI.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.activity.a */
public final class C2300a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public long f12449d;

    /* renamed from: e */
    public int f12450e;

    /* renamed from: f */
    public /* synthetic */ Object f12451f;

    /* renamed from: g */
    public final /* synthetic */ long f12452g;

    /* renamed from: h */
    public final /* synthetic */ String f12453h;

    /* renamed from: com.tencent.mm.plugin.finder.activity.a$a */
    public static final class C2301a extends C87413o implements C32224a<C9519c<String, C51722vp0>> {

        /* renamed from: d */
        public final /* synthetic */ long f12454d;

        /* renamed from: e */
        public final /* synthetic */ String f12455e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2301a(long j, String str) {
            super(0);
            this.f12454d = j;
            this.f12455e = str;
        }

        public Object invoke() {
            return new C11887a(this.f12454d, this.f12455e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2300a(long j, String str, C15601d<? super C2300a> dVar) {
        super(2, dVar);
        this.f12452g = j;
        this.f12453h = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C2300a aVar = new C2300a(this.f12452g, this.f12453h, dVar);
        aVar.f12451f = obj;
        return aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C2300a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f12450e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long c = C31543z5.m39453c();
            Log.m105924i("Finder.ActivityProfileUI", "preloadCampaignInfo start");
            C2301a aVar2 = new C2301a(this.f12452g, this.f12453h);
            C66212f coroutineContext = ((C0000n0) this.f12451f).getCoroutineContext();
            int i2 = C53973z1.f151221b0;
            C9517a aVar3 = new C9517a(aVar2, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null, 4, (C8480h) null);
            this.f12449d = c;
            this.f12450e = 1;
            if (C117134d.m165172f(aVar3, this) == aVar) {
                return aVar;
            }
            j = c;
        } else if (i == 1) {
            j = this.f12449d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long c2 = C31543z5.m39453c();
        Log.m105924i("Finder.ActivityProfileUI", "preloadCampaignInfo end " + (c2 - j));
        return C13598b0.f38549a;
    }
}
