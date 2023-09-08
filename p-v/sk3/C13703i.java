package sk3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import qo3.C101218e0;
import rk3.C63462a;

/* renamed from: sk3.i */
public final class C13703i extends UIComponent {

    /* renamed from: d */
    public View f38776d;

    /* renamed from: e */
    public View f38777e;

    /* renamed from: f */
    public View f38778f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13703i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m13006c3(C13703i iVar) {
        iVar.getClass();
        C63462a.f180011a.mo88330e(101);
        View inflate = C85868k2.m106137b(iVar.getActivity()).inflate(C0966R.C0971layout.cpg, (ViewGroup) null);
        C101218e0 e0Var = new C101218e0(iVar.getActivity(), 0, 0, false, false);
        ((TextView) inflate.findViewById(C0966R.C0970id.mbz)).setTextColor(iVar.getColor(C0966R.color.a7f));
        ((TextView) inflate.findViewById(C0966R.C0970id.mbr)).setTextColor(iVar.getColor(C0966R.color.BW_0_Alpha_0_5));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.mbn);
        textView.setTextColor(iVar.getColor(C0966R.color.Link_100));
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.mbo);
        textView2.setTextColor(iVar.getColor(C0966R.color.Link_100));
        ((Button) inflate.findViewById(C0966R.C0970id.mbt)).setVisibility(8);
        ((Button) inflate.findViewById(C0966R.C0970id.mby)).setVisibility(8);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.n0l);
        button.setVisibility(0);
        Button button2 = (Button) inflate.findViewById(C0966R.C0970id.n0m);
        button2.setVisibility(0);
        ((ImageView) inflate.findViewById(C0966R.C0970id.mbs)).setImageResource(C0966R.C0969drawable.cgy);
        e0Var.mo140663j(inflate);
        e0Var.mo140655A();
        button.setOnClickListener(new C13700e(e0Var));
        button2.setOnClickListener(new C63978f(e0Var, iVar));
        textView.setOnClickListener(new C13701g(iVar));
        textView2.setOnClickListener(new C13702h(iVar, e0Var));
    }
}
