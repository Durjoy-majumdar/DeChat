package oh2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import z10.C112558a;
import z10.C112564d;
import z10.C112565e;

/* renamed from: oh2.a */
public final class C110039a implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f329298d;

    /* renamed from: e */
    public C101198e f329299e;

    /* renamed from: f */
    public boolean f329300f;

    /* renamed from: g */
    public final PhotoFilterPlugin f329301g;

    /* renamed from: h */
    public final ImageView f329302h;

    public C110039a(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "viewGroup");
        C87412m.m108594g(eVar, "status");
        this.f329298d = viewGroup;
        this.f329299e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.d2v);
        C87412m.m108593f(findViewById, "viewGroup.findViewById(R.id.filter_layout)");
        PhotoFilterPlugin photoFilterPlugin = (PhotoFilterPlugin) findViewById;
        this.f329301g = photoFilterPlugin;
        photoFilterPlugin.setStatus(this.f329299e);
        View findViewById2 = this.f329298d.findViewById(C0966R.C0970id.cbv);
        C87412m.m108593f(findViewById2, "viewGroup.findViewById(R.id.editor_add_filter)");
        ImageView imageView = (ImageView) findViewById2;
        this.f329302h = imageView;
        imageView.setVisibility(0);
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_filters, -1));
        imageView.setOnClickListener(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return "plugin_filter";
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
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/filter/EditPhotoFilterPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = !this.f329300f;
        this.f329300f = z;
        if (z) {
            ImageView imageView = this.f329302h;
            imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_filters, this.f329302h.getResources().getColor(C0966R.color.f2960ag)));
        } else {
            C101198e.C62622a.m73576a(this.f329299e, C101198e.C101199b.EDIT_PHOTO_FILTER_CANCEL, (Bundle) null, 2, (Object) null);
            ImageView imageView2 = this.f329302h;
            imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_outlined_filters, -1));
        }
        if (this.f329300f) {
            this.f329301g.setVisibility(0);
        } else {
            this.f329301g.setVisibility(4);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/filter/EditPhotoFilterPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        C112565e eVar = C112558a.f336999c;
        if (eVar != null) {
            eVar.f337012a.removeCallbacksAndMessages((Object) null);
            Handler handler = eVar.f337014c;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                eVar.f337012a.post(new C112564d(eVar));
            } else {
                C87412m.m108603p("callbackHandler");
                throw null;
            }
        }
        C112558a.f337000d = false;
    }

    public void reset() {
        this.f329300f = false;
        this.f329301g.setVisibility(4);
        C101198e.C62622a.m73576a(this.f329299e, C101198e.C101199b.EDIT_PHOTO_FILTER_CANCEL, (Bundle) null, 2, (Object) null);
        ImageView imageView = this.f329302h;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_filters, -1));
    }

    public void setVisibility(int i) {
        this.f329302h.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
