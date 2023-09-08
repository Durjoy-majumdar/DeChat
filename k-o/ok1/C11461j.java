package ok1;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76875f0;
import p640ox.C77049b;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C64291co3;
import tf0.C64916p1;
import wc3.C15133e0;

/* renamed from: ok1.j */
public final class C11461j extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f33700d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C77407n> f33701e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C15133e0> f33702f;

    /* renamed from: g */
    public final /* synthetic */ FinderObject f33703g;

    /* renamed from: h */
    public final /* synthetic */ MenuItem f33704h;

    /* renamed from: i */
    public final /* synthetic */ BaseFinderFeed f33705i;

    /* renamed from: j */
    public final /* synthetic */ String f33706j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11461j(Context context, C8479f0<C77407n> f0Var, C8479f0<C15133e0> f0Var2, FinderObject finderObject, MenuItem menuItem, BaseFinderFeed baseFinderFeed, String str) {
        super(1);
        this.f33700d = context;
        this.f33701e = f0Var;
        this.f33702f = f0Var2;
        this.f33703g = finderObject;
        this.f33704h = menuItem;
        this.f33705i = baseFinderFeed;
        this.f33706j = str;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "userName");
        Log.m105924i("FinderLiveUtil", "onClick onMenuItemSelect");
        Context context = this.f33700d;
        String str2 = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            C8479f0<C15133e0> f0Var = this.f33702f;
            FinderObject finderObject = this.f33703g;
            MenuItem menuItem = this.f33704h;
            BaseFinderFeed baseFinderFeed = this.f33705i;
            String str3 = this.f33706j;
            C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context, 14, C64291co3.class);
            if (co32 != null) {
                co32.f182543h = ((C15133e0) f0Var.f27484d).getItemCount();
            }
            FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16384);
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null) {
                str2 = oVar.f154199F1;
            }
            a.setEcSource(str2);
            C87412m.m108593f(menuItem, "menuItem");
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76724vV(appCompatActivity, str, (C76875f0) menuItem, a, new C11460i(baseFinderFeed, str3));
        }
        C77407n nVar = (C77407n) this.f33701e.f27484d;
        if (nVar != null) {
            nVar.mo107572p();
        }
        return C13598b0.f38549a;
    }
}
