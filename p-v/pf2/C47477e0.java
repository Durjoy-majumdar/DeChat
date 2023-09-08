package pf2;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C50249le;

/* renamed from: pf2.e0 */
public final class C47477e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImageView f127350d;

    /* renamed from: e */
    public final /* synthetic */ String f127351e;

    /* renamed from: f */
    public final /* synthetic */ C50249le f127352f;

    public C47477e0(ImageView imageView, String str, C50249le leVar) {
        this.f127350d = imageView;
        this.f127351e = str;
        this.f127352f = leVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/SmallVoiceViewHolder$initPlay$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ImageView imageView = this.f127350d;
        int i = C47481f0.f127363F;
        imageView.setImageResource(C0966R.C0969drawable.f4604p4);
        Drawable drawable = imageView.getDrawable();
        C87412m.m108592e(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) drawable).start();
        String str = this.f127351e;
        C50249le leVar = this.f127352f;
        C74244u.C74254i iVar = new C74244u.C74254i();
        C74244u.C44867j jVar = new C74244u.C44867j();
        jVar.f121722a = str;
        jVar.f121723b = leVar.f137340h;
        jVar.f121724c = leVar.f137336d;
        jVar.f121725d = "";
        jVar.f121726e = leVar.f137351v;
        jVar.f121727f = leVar.f137342j;
        iVar.f218012a = jVar;
        view.setTag(iVar);
        C73309a2.m86452e(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/SmallVoiceViewHolder$initPlay$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
