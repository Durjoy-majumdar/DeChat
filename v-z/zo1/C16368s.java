package zo1;

import android.content.Context;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: zo1.s */
public final class C16368s implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f43755d;

    /* renamed from: e */
    public final /* synthetic */ C16361r f43756e;

    /* renamed from: f */
    public final /* synthetic */ Context f43757f;

    public C16368s(C77407n nVar, C16361r rVar, Context context) {
        this.f43755d = nVar;
        this.f43756e = rVar;
        this.f43757f = context;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        this.f43755d.mo107567l((View) null);
        e0Var.clear();
        C16361r rVar = this.f43756e;
        Context context = this.f43757f;
        rVar.getClass();
        C58739j4 j4Var = C58739j4.f168176a;
        FinderObject finderObject = ((C54991o) rVar.mo87696x0(C54991o.class)).f154341n;
        j4Var.getClass();
        if (((finderObject != null ? finderObject.permissionFlag : 0) & 1) == 0) {
            e0Var.mo107146h(1, MMApplicationContext.getResources().getString(C0966R.string.f360640dy0), C0966R.raw.finder_icons_filled_share, context.getResources().getColor(C0966R.color.f2939n));
            e0Var.mo107146h(2, MMApplicationContext.getResources().getString(C0966R.string.f360641dy1), C0966R.raw.bottomsheet_icon_moment, 0);
        }
    }
}
