package sk3;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.C54208j0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p248ug.C65347o0;
import qo3.C101218e0;
import qo3.C89779i0;
import rk3.C63462a;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: sk3.f */
public final class C63978f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f181383d;

    /* renamed from: e */
    public final /* synthetic */ C13703i f181384e;

    public C63978f(C101218e0 e0Var, C13703i iVar) {
        this.f181383d = e0Var;
        this.f181384e = iVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63462a.f180011a.mo88330e(102);
        ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89076QZ(true);
        this.f181383d.mo140680z();
        C39818r rVar = C39818r.f106831a;
        C64009r0 r0Var = (C64009r0) rVar.mo62444c(this.f181384e.getActivity()).mo75002a(C64009r0.class);
        r0Var.f181468r = true;
        r0Var.mo88776f3();
        View view2 = this.f181384e.f38776d;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C63995m mVar = (C63995m) rVar.mo62444c(this.f181384e.getActivity()).mo75002a(C63995m.class);
        View view4 = this.f181384e.f38778f;
        C87412m.m108591d(view4);
        mVar.getClass();
        mVar.f181433n = true;
        mVar.f181437r = true;
        mVar.f181430h = C89779i0.m112248e(mVar.getActivity(), MMApplicationContext.getString(C0966R.string.f360893m50), false, 0, (DialogInterface.OnCancelListener) null);
        C53895h.m60466d(C54208j0.m60899a(mVar), C53872d1.f151119c, (C53934p0) null, new C63985j(mVar, view4, (C15601d<? super C63985j>) null), 2, (Object) null);
        mVar.mo88769l3();
        mVar.f181435p = C53895h.m60466d(C54208j0.m60899a(mVar), (C66212f) null, (C53934p0) null, new C63990k(mVar, view4, (C15601d<? super C63990k>) null), 3, (Object) null);
        C64024v vVar = (C64024v) rVar.mo62444c(this.f181384e.getActivity()).mo75002a(C64024v.class);
        vVar.getClass();
        Log.m105924i("MicroMsg.FTSMultiItemAllResultUIC", "setIsFromOpen");
        vVar.f181509C = true;
        vVar.f181527t = false;
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
