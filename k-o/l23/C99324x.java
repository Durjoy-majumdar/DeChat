package l23;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C99417a;
import qh2.C101198e;

/* renamed from: l23.x */
public final class C99324x extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public ViewGroup f291240f;

    /* renamed from: g */
    public final ImageView f291241g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99324x(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f291240f = viewGroup;
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.ccb);
        this.f291241g = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(this.f291240f.getContext(), C0966R.raw.icons_filled_scissor, -1));
        imageView.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f291492d.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO, new Bundle());
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setVisibility(int i) {
        this.f291241g.setVisibility(i);
    }
}
