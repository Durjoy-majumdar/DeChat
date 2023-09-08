package er1;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: er1.e4 */
public final class C7796e4 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f26303d;

    /* renamed from: e */
    public final /* synthetic */ boolean f26304e;

    /* renamed from: f */
    public final /* synthetic */ TextView f26305f;

    public C7796e4(C32224a<C13598b0> aVar, boolean z, TextView textView) {
        this.f26303d = aVar;
        this.f26304e = z;
        this.f26305f = textView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/utils/FinderUtil$setToMachineTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C32224a<C13598b0> aVar = this.f26303d;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/utils/FinderUtil$setToMachineTab$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        if (this.f26304e) {
            textPaint.setColor(this.f26305f.getContext().getResources().getColor(C0966R.color.f3595yw));
        } else {
            textPaint.setColor(this.f26305f.getContext().getResources().getColor(C0966R.color.f3592y));
        }
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
