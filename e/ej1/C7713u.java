package ej1;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;

/* renamed from: ej1.u */
public final class C7713u extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ Context f26133d;

    /* renamed from: e */
    public final /* synthetic */ C7714v f26134e;

    public C7713u(Context context, C7714v vVar) {
        this.f26133d = context;
        this.f26134e = vVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalSetManager$onBindSetManagerInfo$2$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C62042e.f176370a.mo87009H0(this.f26133d, this.f26134e.f26135i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalSetManager$onBindSetManagerInfo$2$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f26133d.getResources().getColor(C0966R.color.f3417s5));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
