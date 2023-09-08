package l23;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: l23.b0 */
public final class C109165b0 extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public ViewGroup f326858f;

    /* renamed from: g */
    public final Context f326859g;

    /* renamed from: h */
    public final C13601g f326860h = C36568h.m40985a(new C109166a(this));

    /* renamed from: i */
    public int f326861i = -1;

    /* renamed from: l23.b0$a */
    public static final class C109166a extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C109165b0 f326862d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109166a(C109165b0 b0Var) {
            super(0);
            this.f326862d = b0Var;
        }

        public Object invoke() {
            return (ViewGroup) this.f326862d.f326858f.findViewById(C0966R.C0970id.cb5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109165b0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f326858f = viewGroup;
        this.f326859g = viewGroup.getContext();
        View findViewById = this.f326858f.findViewById(C0966R.C0970id.grx);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.menu_crop)");
        mo160405y((ViewGroup) findViewById, C0966R.raw.icons_filled_crop, C0966R.string.f360495d73);
        View findViewById2 = this.f326858f.findViewById(C0966R.C0970id.f358734gs2);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.menu_emoji)");
        mo160405y((ViewGroup) findViewById2, C0966R.raw.icons_filled_sticker, C0966R.string.d75);
        View findViewById3 = this.f326858f.findViewById(C0966R.C0970id.gss);
        C87412m.m108593f(findViewById3, "parent.findViewById(R.id.menu_text)");
        mo160405y((ViewGroup) findViewById3, C0966R.raw.icons_filled_text, C0966R.string.d77);
        View findViewById4 = this.f326858f.findViewById(C0966R.C0970id.gsr);
        C87412m.m108593f(findViewById4, "parent.findViewById(R.id.menu_speed)");
        mo160405y((ViewGroup) findViewById4, C0966R.raw.icons_outline_change_speed, C0966R.string.d76);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.grx) {
            C101198e eVar = this.f291492d;
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_VLOG_SINGLE_TRACK_CROP;
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_VLOG_SELECT_TRACK", this.f326861i);
            C13598b0 b0Var = C13598b0.f38549a;
            eVar.mo14585p(bVar, bundle);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358734gs2) {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_SHOW_EMOJI, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.gss) {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_SHOW_TEXT, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.gsr) {
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_VLOG_EDIT_SPEED, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void reset() {
        this.f326861i = -1;
        setVisibility(4);
    }

    public void setVisibility(int i) {
        ((ViewGroup) ((C36570n) this.f326860h).getValue()).setVisibility(i);
    }

    /* renamed from: x */
    public final int mo160404x() {
        return this.f326861i;
    }

    /* renamed from: y */
    public final void mo160405y(ViewGroup viewGroup, int i, int i2) {
        ((TextView) viewGroup.findViewById(C0966R.C0970id.knx)).setText(C76577a.m92166q(this.f326859g, i2));
        ((ImageView) viewGroup.findViewById(C0966R.C0970id.f15)).setImageDrawable(C74933u4.m89768e(this.f326859g, i, -1));
        viewGroup.setOnClickListener(this);
    }

    /* renamed from: z */
    public final void mo160406z(int i) {
        this.f326861i = i;
    }
}
