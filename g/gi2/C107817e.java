package gi2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view.FontSelectorView;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import uh2.C111175f;

/* renamed from: gi2.e */
public final class C107817e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FontSelectorView f322641d;

    public C107817e(FontSelectorView fontSelectorView) {
        this.f322641d = fontSelectorView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/view/FontSelectorView$initFontSelectView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FontSelectorView fontSelectorView = this.f322641d;
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        int i = FontSelectorView.f315699g;
        fontSelectorView.mo151529a(intValue);
        C32226l<? super String, C13598b0> lVar = fontSelectorView.f315702f;
        if (lVar != null) {
            lVar.invoke(C111175f.f332956d.mo151277g() + fontSelectorView.f315701e.get(intValue).optString("path"));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/view/FontSelectorView$initFontSelectView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
