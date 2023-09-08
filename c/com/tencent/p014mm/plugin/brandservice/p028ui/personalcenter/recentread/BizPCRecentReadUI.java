package com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kx0.C46754a;
import kx0.C46768h;
import kx0.C46784m;
import kx0.C46785n;
import mx0.C34678k;
import mx0.C47110d;
import mx0.C47116i;
import mx0.C47117l;
import nj3.C76912y0;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C110826x0;
import sx3.C48501y0;
import te3.C48976ca2;
import te3.C49090d34;
import vo3.C78461f;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI */
public final class BizPCRecentReadUI extends MMActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f109265h = 0;

    /* renamed from: d */
    public final String f109266d = "MicroMsg.BizPCRecentReadUI";

    /* renamed from: e */
    public long f109267e;

    /* renamed from: f */
    public final C47110d f109268f = new C47110d();

    /* renamed from: g */
    public final C47117l f109269g = new C47117l();

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI$setting$1", mo125469f = "BizPCRecentReadUI.kt", mo125470l = {112}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI$c */
    public static final class C29717c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f80713d;

        /* renamed from: e */
        public final /* synthetic */ BizPCRecentReadUI f80714e;

        /* renamed from: f */
        public final /* synthetic */ C48976ca2 f80715f;

        /* renamed from: g */
        public final /* synthetic */ boolean f80716g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f80717h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29717c(BizPCRecentReadUI bizPCRecentReadUI, C48976ca2 ca22, boolean z, C32224a<C13598b0> aVar, C15601d<? super C29717c> dVar) {
            super(2, dVar);
            this.f80714e = bizPCRecentReadUI;
            this.f80715f = ca22;
            this.f80716g = z;
            this.f80717h = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C29717c(this.f80714e, this.f80715f, this.f80716g, this.f80717h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C29717c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f80713d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C47117l lVar = this.f80714e.f109269g;
                C48976ca2 ca22 = this.f80715f;
                boolean z = this.f80716g;
                this.f80713d = 1;
                lVar.getClass();
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                new C47116i(ca22, z).mo9225i().mo123420E(new C34678k(lVar, hVar));
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((C49090d34) obj) == null) {
                Log.m105924i(this.f80714e.f109266d, "resp == null");
                C76912y0.m92767f(this.f80714e.getContext(), this.f80714e.getString(C0966R.string.n0i));
            } else {
                String string = this.f80716g ? this.f80714e.getString(C0966R.string.n0h) : this.f80714e.getString(C0966R.string.n0j);
                C87412m.m108593f(string, "if (isCloseRecentReading…ent_reading_toast_opened)");
                C76912y0.m92769h(this.f80714e.getContext(), string, C0966R.raw.icons_filled_done);
                C32224a<C13598b0> aVar2 = this.f80717h;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI$a */
    public static final class C40671a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizPCRecentReadUI f109270d;

        public C40671a(BizPCRecentReadUI bizPCRecentReadUI) {
            this.f109270d = bizPCRecentReadUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f109270d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI$b */
    public static final class C40672b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizPCRecentReadUI f109271d;

        public C40672b(BizPCRecentReadUI bizPCRecentReadUI) {
            this.f109271d = bizPCRecentReadUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            BizPCRecentReadUI bizPCRecentReadUI = this.f109271d;
            int i = BizPCRecentReadUI.f109265h;
            C77407n nVar = new C77407n((Context) bizPCRecentReadUI.getContext(), 1, false);
            nVar.f225771i = new C46784m(bizPCRecentReadUI);
            nVar.f225782p = new C46785n(bizPCRecentReadUI);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo63581H7(C48976ca2 ca22, boolean z, C32224a<C13598b0> aVar) {
        if (ca22 == null) {
            Log.m105924i(this.f109266d, "oldSettingResp == null");
            C76912y0.m92767f(getContext(), getString(C0966R.string.n0i));
            return;
        }
        C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this), (C66212f) null, (C53934p0) null, new C29717c(this, ca22, z, aVar, (C15601d<? super C29717c>) null), 3, (Object) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d3p;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C46754a.class, C46768h.class));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i(this.f109266d, "onCreate");
        this.f109267e = getIntent().getLongExtra("biz_time_line_line_session_id", 0);
        setMMTitle(getResources().getString(C0966R.string.n08));
        hideActionbarLine();
        setBackBtn(new C40671a(this));
        C78461f bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBgColor(getResources().getColor(C0966R.color.f2929c));
        }
        addIconOptionMenu(0, (int) C0966R.string.f7369e7, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C40672b(this));
    }
}
