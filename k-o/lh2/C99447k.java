package lh2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.k */
public final class C99447k extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public ImageView f291582f;

    /* renamed from: g */
    public boolean f291583g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99447k(ImageView imageView, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291582f = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_previous2, -1));
        this.f291582f.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditBackToRecordPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.BACK_RECORD, (Bundle) null, 2, (Object) null);
        C110992d dVar = C110992d.f332425a;
        dVar.mo162669b(11);
        dVar.mo162670d(12);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditBackToRecordPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setVisibility(int i) {
        this.f291582f.setVisibility(i);
    }

    /* renamed from: x */
    public void mo138883x(int i) {
        if (this.f291583g) {
            ImageView imageView = this.f291582f;
            imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_back, this.f291582f.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8)));
            return;
        }
        ImageView imageView2 = this.f291582f;
        imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_previous2, i));
    }
}
