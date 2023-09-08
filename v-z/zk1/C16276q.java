package zk1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.Toast;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fs1.C8198a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zk1.q */
public final class C16276q implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C16229h f43568a;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveNoticeUIC$initView$11$1", mo125469f = "FinderLiveNoticeUIC.kt", mo125470l = {440}, mo125471m = "invokeSuspend")
    /* renamed from: zk1.q$a */
    public static final class C16277a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f43569d;

        /* renamed from: e */
        public final /* synthetic */ C16229h f43570e;

        /* renamed from: f */
        public final /* synthetic */ boolean f43571f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16277a(C16229h hVar, boolean z, C15601d<? super C16277a> dVar) {
            super(2, dVar);
            this.f43570e = hVar;
            this.f43571f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C16277a(this.f43570e, this.f43571f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C16277a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f43569d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                new C8198a(this.f43570e.getContext());
                C8198a aVar2 = new C8198a(this.f43570e.getContext());
                String string = this.f43570e.getContext().getResources().getString(C0966R.string.mqp);
                C87412m.m108593f(string, "context.resources.getStr…re_sale_license_content1)");
                String string2 = this.f43570e.getContext().getResources().getString(C0966R.string.mqq);
                C87412m.m108593f(string2, "context.resources.getStr…_sale_license_content1_1)");
                C8198a.C8199a aVar3 = new C8198a.C8199a(string, string2, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/BsB5Jid0M6gtMOz8");
                ArrayList arrayList = new ArrayList();
                C16229h hVar = this.f43570e;
                String string3 = hVar.getContext().getResources().getString(C0966R.string.mqr);
                C87412m.m108593f(string3, "context.resources.getStr…sale_license_desc1_tips1)");
                arrayList.add(new C8198a.C8199a(string3, (String) null, (String) null, 6, (C8480h) null));
                String string4 = hVar.getContext().getResources().getString(C0966R.string.mqs);
                C87412m.m108593f(string4, "context.resources.getStr…sale_license_desc1_tips2)");
                arrayList.add(new C8198a.C8199a(string4, (String) null, (String) null, 6, (C8480h) null));
                C13598b0 b0Var = C13598b0.f38549a;
                this.f43569d = 1;
                obj2 = aVar2.mo9241b(aVar3, arrayList, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj2).booleanValue()) {
                return C13598b0.f38549a;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PRE_SALE_ANCHOR_LICENSE_BOOLEAN_SYNC, Boolean.TRUE);
            this.f43570e.mo14767j3().setCheck(true);
            C16276q.m15142a(this.f43570e, this.f43571f);
            return C13598b0.f38549a;
        }
    }

    public C16276q(C16229h hVar) {
        this.f43568a = hVar;
    }

    /* renamed from: a */
    public static final void m15142a(C16229h hVar, boolean z) {
        int i = 8;
        ((RelativeLayout) ((C36570n) hVar.f43460B).getValue()).setVisibility(z ? 0 : 8);
        RelativeLayout relativeLayout = (RelativeLayout) ((C36570n) hVar.f43462D).getValue();
        if (z) {
            i = 0;
        }
        relativeLayout.setVisibility(i);
    }

    public final void onStatusChange(boolean z) {
        if (!z || !this.f43568a.mo14763e3().f220433y) {
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_PRE_SALE_ANCHOR_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f).booleanValue();
            if (!z || booleanValue) {
                m15142a(this.f43568a, z);
                return;
            }
            this.f43568a.mo14767j3().setCheck(false);
            C16229h hVar = this.f43568a;
            C0317e.launchUI$default(hVar, (C66212f) null, (C53934p0) null, new C16277a(hVar, z, (C15601d<? super C16277a>) null), 3, (Object) null);
            return;
        }
        this.f43568a.mo14767j3().setCheck(false);
        Toast makeText = C76912y0.makeText((Context) this.f43568a.getContext(), (CharSequence) this.f43568a.getContext().getResources().getString(C0966R.string.mr7), 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }
}
