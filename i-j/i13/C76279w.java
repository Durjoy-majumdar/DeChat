package i13;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import i13.C76259g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.w */
public final class C76279w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223467d;

    public C76279w(C76259g gVar) {
        this.f223467d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76259g gVar = this.f223467d;
        if (gVar.f223441z) {
            gVar.f223397B = C76259g.C76260a.INPUT_EMOJI;
            gVar.mo106512M(false);
            C76259g.m91671I(this.f223467d, true);
            ImageView imageView = this.f223467d.f223431r;
            if (imageView != null) {
                imageView.setImageResource(C0966R.C0969drawable.f4803nc);
            }
        } else {
            gVar.f223397B = C76259g.C76260a.INPUT_KEYBOARD;
            gVar.mo106512M(true);
            C76259g.m91671I(this.f223467d, false);
            ImageView imageView2 = this.f223467d.f223431r;
            if (imageView2 != null) {
                imageView2.setImageResource(C0966R.C0969drawable.f4802nb);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
