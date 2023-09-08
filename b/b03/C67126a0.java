package b03;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import b03.C67133s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p1050v2.C111325g;

/* renamed from: b03.a0 */
public final class C67126a0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C67133s.C67136c f192739d;

    /* renamed from: e */
    public final /* synthetic */ C67133s f192740e;

    /* renamed from: f */
    public final /* synthetic */ View.OnClickListener f192741f;

    public C67126a0(C67133s.C67136c cVar, C67133s sVar, View.OnClickListener onClickListener) {
        this.f192739d = cVar;
        this.f192740e = sVar;
        this.f192741f = onClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$textWrapper$1$1$1$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        if (view instanceof TextView) {
            ((TextView) view).setHighlightColor(MMApplicationContext.getResources().getColor(17170445));
        }
        this.f192741f.onClick(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$textWrapper$1$1$1$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer num = this.f192739d.f192774c;
        textPaint.setColor(num != null ? num.intValue() : C111325g.m151807a(this.f192740e.f192747a.getResources(), C0966R.color.BW_100_Alpha_0_6, this.f192740e.f192747a.getContext().getTheme()));
    }
}
