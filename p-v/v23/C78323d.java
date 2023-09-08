package v23;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: v23.d */
public final class C78323d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111333a f229525d;

    public C78323d(C111333a aVar) {
        this.f229525d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$checkInit$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((WeImageView) ((C36570n) this.f229525d.f333332r).getValue()).performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$checkInit$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
