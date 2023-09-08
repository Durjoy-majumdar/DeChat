package zo1;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11184p0;
import nj3.C76875f0;
import qo3.C77407n;
import rx3.C13598b0;
import tf0.C64916p1;
import wc3.C15133e0;

/* renamed from: zo1.w */
public final class C16373w implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C16361r f43765d;

    /* renamed from: e */
    public final /* synthetic */ C15133e0 f43766e;

    /* renamed from: f */
    public final /* synthetic */ Context f43767f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f43768g;

    /* renamed from: zo1.w$a */
    public static final class C16374a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f43769d;

        /* renamed from: e */
        public final /* synthetic */ C77407n f43770e;

        /* renamed from: f */
        public final /* synthetic */ FinderObject f43771f;

        /* renamed from: g */
        public final /* synthetic */ MenuItem f43772g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16374a(Context context, C77407n nVar, FinderObject finderObject, MenuItem menuItem) {
            super(1);
            this.f43769d = context;
            this.f43770e = nVar;
            this.f43771f = finderObject;
            this.f43772g = menuItem;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "userName");
            Log.m105924i("FinderLiveUtil", "onClick onMenuItemSelect");
            Context context = this.f43769d;
            String str2 = null;
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity != null) {
                FinderObject finderObject = this.f43771f;
                MenuItem menuItem = this.f43772g;
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16384);
                C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
                if (oVar != null) {
                    str2 = oVar.f154199F1;
                }
                a.setEcSource(str2);
                C87412m.m108593f(menuItem, "menuItem");
                ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76724vV(appCompatActivity, str, (C76875f0) menuItem, a, C16372v.f43764d);
            }
            this.f43770e.mo107572p();
            return C13598b0.f38549a;
        }
    }

    public C16373w(C16361r rVar, C15133e0 e0Var, Context context, C77407n nVar) {
        this.f43765d = rVar;
        this.f43766e = e0Var;
        this.f43767f = context;
        this.f43768g = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        FinderObject finderObject = ((C54991o) this.f43765d.mo87684A0().mo71262a(C54991o.class)).f154341n;
        if (finderObject != null) {
            C15133e0 e0Var = this.f43766e;
            Context context = this.f43767f;
            C77407n nVar = this.f43768g;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            e0Var.xc0((C76875f0) menuItem, new C16374a(context, nVar, finderObject, menuItem));
        }
    }
}
