package yj1;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import er1.C7859p5;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import wj1.C15419c;

/* renamed from: yj1.b */
public final class C16023b extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C16019a f43102d;

    public C16023b(C16019a aVar) {
        this.f43102d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$setConsumeManagerText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C16019a aVar = this.f43102d;
        aVar.mo9763a();
        aVar.f43091h.mo14207E(1);
        C15419c.f41825a.mo14214a(C7859p5.PANEL_MANAGER_CLICK, aVar.f43097q);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$setConsumeManagerText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#576B95"));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
