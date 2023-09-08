package l23;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C99417a;
import qh2.C101198e;

/* renamed from: l23.r0 */
public final class C99318r0 extends C99417a {

    /* renamed from: f */
    public final View f291233f;

    /* renamed from: g */
    public final ImageView f291234g;

    /* renamed from: l23.r0$a */
    public static final class C99319a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101198e f291235d;

        public C99319a(C101198e eVar) {
            this.f291235d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/VLogCropVideoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f291235d.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO, new Bundle());
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/VLogCropVideoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99318r0(View view, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(view, "layout");
        C87412m.m108594g(eVar, "status");
        this.f291233f = view;
        View findViewById = view.findViewById(C0966R.C0970id.ccb);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.editor_crop_video)");
        ImageView imageView = (ImageView) findViewById;
        this.f291234g = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(view.getContext(), C0966R.raw.icons_filled_crop, C76577a.m92153d(view.getContext(), C0966R.color.f356996ai0)));
        imageView.setOnClickListener(new C99319a(eVar));
    }

    public void setVisibility(int i) {
        this.f291234g.setVisibility(i);
    }
}
