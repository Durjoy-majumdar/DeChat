package sk3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;
import rk3.C63462a;

/* renamed from: sk3.h */
public final class C13702h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13703i f38774d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f38775e;

    public C13702h(C13703i iVar, C101218e0 e0Var) {
        this.f38774d = iVar;
        this.f38775e = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63462a.f180011a.mo88330e(105);
        C13703i iVar = this.f38774d;
        View inflate = C85868k2.m106137b(iVar.getActivity()).inflate(C0966R.C0971layout.cpf, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(activity).in…_custom_permission, null)");
        C101218e0 e0Var = new C101218e0(iVar.getActivity(), 0, 0, false, false);
        ((TextView) inflate.findViewById(C0966R.C0970id.mbz)).setTextColor(iVar.getColor(C0966R.color.a7f));
        ((TextView) inflate.findViewById(C0966R.C0970id.mbr)).setTextColor(iVar.getColor(C0966R.color.BW_0_Alpha_0_5));
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.mbq);
        weImageView.setIconColor(iVar.getColor(C0966R.color.FG_0));
        e0Var.mo140663j(inflate);
        e0Var.mo140655A();
        weImageView.setOnClickListener(new C13699d(e0Var, iVar));
        this.f38775e.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
