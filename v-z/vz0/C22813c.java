package vz0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.C18609n0;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import dz0.C20483c;
import gz0.C20871g;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rz0.C22280a;
import rz0.C22286g;
import te3.C64808wp1;
import wz0.C22945n;

/* renamed from: vz0.c */
public class C22813c extends C22821l {

    /* renamed from: b */
    public View f65591b;

    /* renamed from: c */
    public TextView f65592c;

    /* renamed from: d */
    public C20483c f65593d;

    /* renamed from: e */
    public MMActivity f65594e;

    /* renamed from: f */
    public C22286g f65595f;

    /* renamed from: c */
    public void mo35949c() {
        C18609n0 n0Var = this.f65616a;
        this.f65594e = ((CardDetailUIContoller) n0Var).f51797e;
        this.f65595f = ((CardDetailUIContoller) n0Var).f51798f;
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65591b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f65591b == null) {
            View inflate = ((ViewStub) mo35969b(C0966R.C0970id.aru)).inflate();
            this.f65591b = inflate;
            inflate.findViewById(C0966R.C0970id.ark).setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
        }
        C18609n0 n0Var = this.f65616a;
        this.f65593d = ((CardDetailUIContoller) n0Var).f51776E;
        C22286g gVar = ((CardDetailUIContoller) n0Var).f51798f;
        this.f65595f = gVar;
        boolean i = gVar.mo35435i();
        boolean z = ((C22280a) this.f65595f).f63176f;
        if (i) {
            View view = this.f65591b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + i + " acceptViewEnabled:" + z);
            Button button = (Button) this.f65591b.findViewById(C0966R.C0970id.ark);
            View findViewById = this.f65591b.findViewById(C0966R.C0970id.art);
            findViewById.setBackgroundDrawable((Drawable) null);
            findViewById.setOnClickListener((View.OnClickListener) null);
            int dimensionPixelSize = this.f65594e.getResources().getDimensionPixelSize(C0966R.dimen.f4232x0);
            if (z) {
                if (!TextUtils.isEmpty(this.f65593d.mo23264L0().f64106D)) {
                    button.setText(this.f65593d.mo23264L0().f64106D);
                }
                if (this.f65593d.mo23291o()) {
                    button.setTextColor(C22945n.m27004d(this.f65593d.mo23264L0().f64145p));
                    ShapeDrawable l = C22945n.m27012l(this.f65594e, C22945n.m27004d(this.f65593d.mo23264L0().f64145p), dimensionPixelSize);
                    ShapeDrawable n = C22945n.m27014n(this.f65594e, C22945n.m27004d(this.f65593d.mo23264L0().f64145p), dimensionPixelSize);
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842919}, n);
                    stateListDrawable.addState(new int[0], l);
                    int[] iArr = {this.f65594e.getResources().getColor(C0966R.color.al6), C22945n.m27004d(this.f65593d.mo23264L0().f64145p)};
                    button.setBackgroundDrawable(stateListDrawable);
                    button.setTextColor(new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[0]}, iArr));
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f65591b.getLayoutParams();
                    layoutParams.topMargin = this.f65594e.getResources().getDimensionPixelSize(C0966R.dimen.f4211w_);
                    this.f65591b.setLayoutParams(layoutParams);
                    View findViewById2 = this.f65591b.findViewById(C0966R.C0970id.c8f);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = findViewById2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C20871g gVar2 = ((CardDetailUIContoller) this.f65616a).f51779H;
                    this.f65591b.setBackgroundColor(this.f65594e.getResources().getColor(C0966R.color.al6));
                    CheckBox checkBox = (CheckBox) this.f65591b.findViewById(C0966R.C0970id.au_);
                    gVar2.mo32577b();
                    if (gVar2.mo32577b().f59503v) {
                        Log.m105924i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
                        checkBox.setVisibility(0);
                        C64808wp1 wp12 = this.f65593d.mo23264L0().f64117P;
                        if (wp12 == null || TextUtils.isEmpty(wp12.f186150d)) {
                            checkBox.setText(gVar2.mo32577b().f64746d);
                        } else {
                            checkBox.setText(wp12.f186150d);
                        }
                        checkBox.setChecked(gVar2.mo32577b().f59504w);
                        checkBox.setOnClickListener(new C22810b(this, gVar2));
                    } else {
                        Log.m105924i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
                        checkBox.setVisibility(8);
                    }
                } else if (this.f65593d.mo23284h() || this.f65593d.mo23272T0() || this.f65593d.mo23271R1()) {
                    ShapeDrawable n2 = C22945n.m27014n(this.f65594e, C22945n.m27004d(this.f65593d.mo23264L0().f64145p), dimensionPixelSize);
                    ShapeDrawable n3 = C22945n.m27014n(this.f65594e, C22945n.m27005e(this.f65593d.mo23264L0().f64145p, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO), dimensionPixelSize);
                    StateListDrawable stateListDrawable2 = new StateListDrawable();
                    stateListDrawable2.addState(new int[]{16842919}, n3);
                    stateListDrawable2.addState(new int[0], n2);
                    button.setBackgroundDrawable(stateListDrawable2);
                    button.setTextColor(this.f65594e.getResources().getColor(C0966R.color.alc));
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
                    layoutParams2.width = -1;
                    button.setLayoutParams(layoutParams2);
                } else {
                    ShapeDrawable n4 = C22945n.m27014n(this.f65594e, C22945n.m27004d(this.f65593d.mo23264L0().f64145p), dimensionPixelSize);
                    ShapeDrawable n5 = C22945n.m27014n(this.f65594e, C22945n.m27005e(this.f65593d.mo23264L0().f64145p, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO), dimensionPixelSize);
                    StateListDrawable stateListDrawable3 = new StateListDrawable();
                    stateListDrawable3.addState(new int[]{16842919}, n5);
                    stateListDrawable3.addState(new int[0], n4);
                    button.setBackgroundDrawable(stateListDrawable3);
                    button.setTextColor(this.f65594e.getResources().getColor(C0966R.color.alc));
                }
            } else {
                this.f65591b.setEnabled(false);
                findViewById.setEnabled(false);
                button.setEnabled(false);
                button.setText(this.f65593d.mo23291o() ? this.f65593d.mo23264L0().f64106D : ((C22280a) this.f65595f).mo35445s());
                if (this.f65593d.mo23291o()) {
                    button.setTextColor(C22945n.m27005e(this.f65593d.mo23264L0().f64145p, 125));
                    button.setBackgroundDrawable(C22945n.m27012l(this.f65594e, C22945n.m27005e(this.f65593d.mo23264L0().f64145p, 125), dimensionPixelSize));
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f65591b.getLayoutParams();
                    layoutParams3.topMargin = this.f65594e.getResources().getDimensionPixelSize(C0966R.dimen.f4212wa);
                    this.f65591b.setLayoutParams(layoutParams3);
                    View findViewById3 = this.f65591b.findViewById(C0966R.C0970id.c8f);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view4 = findViewById3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (this.f65593d.mo23284h() || this.f65593d.mo23272T0() || this.f65593d.mo23271R1()) {
                    button.setTextColor(this.f65594e.getResources().getColor(C0966R.color.f3541x6));
                    MMActivity mMActivity = this.f65594e;
                    button.setBackgroundDrawable(C22945n.m27013m(mMActivity, mMActivity.getResources().getColor(C0966R.color.f3196im)));
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) button.getLayoutParams();
                    layoutParams4.width = -1;
                    button.setLayoutParams(layoutParams4);
                } else {
                    button.setTextColor(this.f65594e.getResources().getColor(C0966R.color.f3541x6));
                    MMActivity mMActivity2 = this.f65594e;
                    button.setBackgroundDrawable(C22945n.m27013m(mMActivity2, mMActivity2.getResources().getColor(C0966R.color.f3196im)));
                }
            }
            if (!this.f65593d.mo23284h() && !this.f65593d.mo23272T0()) {
                if (this.f65593d.mo23264L0().f64118Q == null || Util.isNullOrNil(this.f65593d.mo23264L0().f64118Q.f64198d)) {
                    TextView textView = this.f65592c;
                    if (textView != null) {
                        textView.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (this.f65592c == null) {
                    this.f65592c = (TextView) this.f65591b.findViewById(C0966R.C0970id.arr);
                }
                this.f65592c.setText(this.f65593d.mo23264L0().f64118Q.f64198d);
                if (!Util.isNullOrNil(this.f65593d.mo23264L0().f64118Q.f64199e)) {
                    this.f65592c.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
                    this.f65592c.setTextColor(C22945n.m27004d(this.f65593d.mo23264L0().f64145p));
                }
                this.f65592c.setVisibility(0);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
        View view5 = this.f65591b;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
