package xk1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58739j4;
import gy3.C87412m;

/* renamed from: xk1.k */
public final class C15746k extends UIComponent {

    /* renamed from: d */
    public MMEditText f42464d;

    /* renamed from: e */
    public LinearLayout f42465e;

    /* renamed from: f */
    public View f42466f;

    /* renamed from: g */
    public String f42467g = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15746k(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("DESC");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f42467g = stringExtra;
        View findViewById = getActivity().findViewById(C0966R.C0970id.j48);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.scroll_view)");
        ScrollView scrollView = (ScrollView) findViewById;
        View findViewById2 = getActivity().findViewById(C0966R.C0970id.fwy);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.id.live_post_desc_et)");
        this.f42464d = (MMEditText) findViewById2;
        View findViewById3 = getActivity().findViewById(C0966R.C0970id.hlm);
        C87412m.m108593f(findViewById3, "activity.findViewById(R.id.ok_btn_container)");
        this.f42465e = (LinearLayout) findViewById3;
        View findViewById4 = getActivity().findViewById(C0966R.C0970id.iyk);
        C87412m.m108593f(findViewById4, "activity.findViewById(R.…er_game_live_option_root)");
        this.f42466f = findViewById4;
        LinearLayout linearLayout = this.f42465e;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            MMEditText mMEditText = this.f42464d;
            if (mMEditText != null) {
                mMEditText.setHint(C58739j4.f168176a.mo83720p());
                MMEditText mMEditText2 = this.f42464d;
                if (mMEditText2 != null) {
                    mMEditText2.setText(this.f42467g);
                    View view = this.f42466f;
                    if (view != null) {
                        view.post(new C15742j(this, layoutParams2));
                    } else {
                        C87412m.m108603p("optionRoot");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("descTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("descTv");
                throw null;
            }
        } else {
            C87412m.m108603p("btnContainer");
            throw null;
        }
    }
}
