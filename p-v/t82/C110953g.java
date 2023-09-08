package t82;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import nh2.C109742b;
import qh2.C101198e;
import th2.C110992d;
import v82.C111415a1;

/* renamed from: t82.g */
public final class C110953g implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f331868d;

    /* renamed from: e */
    public C101198e f331869e;

    /* renamed from: f */
    public boolean f331870f;

    /* renamed from: g */
    public C109742b f331871g;

    /* renamed from: h */
    public final RelativeLayout f331872h;

    /* renamed from: i */
    public final ImageView f331873i;

    public C110953g(ViewGroup viewGroup, C101198e eVar) {
        boolean z;
        C87412m.m108594g(viewGroup, "viewGroup");
        C87412m.m108594g(eVar, "status");
        this.f331868d = viewGroup;
        this.f331869e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357879c90);
        C87412m.m108593f(findViewById, "viewGroup.findViewById(R.id.doddle_layout_root)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f331872h = relativeLayout;
        C111415a1.C111416a aVar = C111415a1.f333534e;
        Context context = this.f331868d.getContext();
        C87412m.m108593f(context, "viewGroup.context");
        if (aVar.mo163079a(context) != 90) {
            Context context2 = this.f331868d.getContext();
            C87412m.m108593f(context2, "viewGroup.context");
            if (aVar.mo163079a(context2) != 270) {
                z = false;
                C109742b bVar = new C109742b(z, relativeLayout);
                this.f331871g = bVar;
                C101198e eVar2 = this.f331869e;
                C87412m.m108594g(eVar2, "status");
                bVar.f328471h = eVar2;
                View findViewById2 = this.f331868d.findViewById(C0966R.C0970id.f357897cc1);
                C87412m.m108593f(findViewById2, "viewGroup.findViewById(R.id.editor_add_pencil)");
                ImageView imageView = (ImageView) findViewById2;
                this.f331873i = imageView;
                imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, -1));
                imageView.setOnClickListener(this);
            }
        }
        z = true;
        C109742b bVar2 = new C109742b(z, relativeLayout);
        this.f331871g = bVar2;
        C101198e eVar22 = this.f331869e;
        C87412m.m108594g(eVar22, "status");
        bVar2.f328471h = eVar22;
        View findViewById22 = this.f331868d.findViewById(C0966R.C0970id.f357897cc1);
        C87412m.m108593f(findViewById22, "viewGroup.findViewById(R.id.editor_add_pencil)");
        ImageView imageView2 = (ImageView) findViewById22;
        this.f331873i = imageView2;
        imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_duddle, -1));
        imageView2.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo162645a() {
        if (this.f331870f) {
            C109742b bVar = this.f331871g;
            if (bVar != null) {
                bVar.mo160980c(0);
                return;
            }
            return;
        }
        C109742b bVar2 = this.f331871g;
        if (bVar2 != null) {
            bVar2.mo160980c(4);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C110953g.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/editor/MultitalkScreenEditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = !this.f331870f;
        this.f331870f = z;
        if (z) {
            C110992d dVar = C110992d.f332425a;
            C110992d.m151314c(dVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, (Object) null);
            dVar.mo162669b(7);
            ImageView imageView = this.f331873i;
            imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, this.f331873i.getResources().getColor(C0966R.color.akw)));
            C101198e.C62622a.m73576a(this.f331869e, C101198e.C101199b.EDIT_PHOTO_DOODLE, (Bundle) null, 2, (Object) null);
        } else {
            C101198e.C62622a.m73576a(this.f331869e, C101198e.C101199b.EDIT_PHOTO_DOODLE_CANCEL, (Bundle) null, 2, (Object) null);
            ImageView imageView2 = this.f331873i;
            imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_duddle, -1));
        }
        mo162645a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/editor/MultitalkScreenEditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
        this.f331870f = false;
        mo162645a();
        C101198e.C62622a.m73576a(this.f331869e, C101198e.C101199b.EDIT_PHOTO_DOODLE_CANCEL, (Bundle) null, 2, (Object) null);
        ImageView imageView = this.f331873i;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_duddle, -1));
    }

    public void setVisibility(int i) {
        this.f331873i.setVisibility(i);
        RelativeLayout relativeLayout = this.f331872h;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
