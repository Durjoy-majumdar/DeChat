package l23;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: l23.d */
public final class C76661d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109154a f224348d;

    public C76661d(C109154a aVar) {
        this.f224348d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$checkInit$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((WeImageView) ((C36570n) this.f224348d.f326839q).getValue()).performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/CompositionEditPlugin$checkInit$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
