package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53921m;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import ob0.C117747y;
import ob0.C89132b;
import rp0.C36431c;
import rp0.C36432d;
import rp0.C36433e;
import rx3.C13598b0;
import te3.C50115kd2;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherHeaderOrderEntrance$updateMoreOptionEntryRedDotStatus$1", mo125469f = "AppBrandLauncherHeaderOrderEntrance.kt", mo125470l = {85, 95}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e */
public final class C29671e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f80627d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandLauncherHeaderOrderEntrance f80628e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherHeaderOrderEntrance$updateMoreOptionEntryRedDotStatus$1$1$1", mo125469f = "AppBrandLauncherHeaderOrderEntrance.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e$a */
    public static final class C29672a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLauncherHeaderOrderEntrance f80629d;

        /* renamed from: e */
        public final /* synthetic */ C50115kd2 f80630e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29672a(AppBrandLauncherHeaderOrderEntrance appBrandLauncherHeaderOrderEntrance, C50115kd2 kd22, C15601d<? super C29672a> dVar) {
            super(2, dVar);
            this.f80629d = appBrandLauncherHeaderOrderEntrance;
            this.f80630e = kd22;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C29672a(this.f80629d, this.f80630e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C29672a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            AppBrandLauncherHeaderOrderEntrance appBrandLauncherHeaderOrderEntrance = this.f80629d;
            boolean z = this.f80630e.f136670d;
            appBrandLauncherHeaderOrderEntrance.getClass();
            Log.m105924i("AppBrandLauncherListHeaderFolderEntrance", "[showRedDot] showRedDot == " + z);
            View view = appBrandLauncherHeaderOrderEntrance.f246917p;
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "showRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "showRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29671e(AppBrandLauncherHeaderOrderEntrance appBrandLauncherHeaderOrderEntrance, C15601d<? super C29671e> dVar) {
        super(2, dVar);
        this.f80628e = appBrandLauncherHeaderOrderEntrance;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C29671e(this.f80628e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C29671e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f80627d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C36433e eVar = new C36433e();
            this.f80627d = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C36432d dVar = new C36432d(eVar, mVar);
            mVar.mo74599v(new C36431c(eVar, dVar));
            C86709a0.m107529k().f251779b.mo123455a(1893, dVar);
            C86709a0.m107529k().f251779b.mo123460f(eVar);
            obj = mVar.mo74608o();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AppBrandLauncherHeaderOrderEntrance appBrandLauncherHeaderOrderEntrance = this.f80628e;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i2 = cVar.f256793a;
        int i3 = cVar.f256794b;
        String str = cVar.f256795c;
        C50115kd2 kd22 = (C50115kd2) cVar.f256796d;
        C117747y yVar = cVar.f256797e;
        C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.netscene.NetSceneGetWxaOrderInfo");
        C36433e eVar2 = (C36433e) yVar;
        if (i2 == 0 && i3 == 0) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C29672a aVar2 = new C29672a(appBrandLauncherHeaderOrderEntrance, kd22, (C15601d<? super C29672a>) null);
            this.f80627d = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
        Log.m105924i("MicroMsg.AppBrandLauncherHeaderOrderEntrance", "NetSceneGetWxaOrderInfo error errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        return C13598b0.f38549a;
    }
}
