package mh1;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64311db1;

/* renamed from: mh1.c */
public final class C10888c extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C47030e f32499d;

    /* renamed from: e */
    public final /* synthetic */ Context f32500e;

    /* renamed from: f */
    public final /* synthetic */ C64311db1 f32501f;

    public C10888c(C47030e eVar, Context context, C64311db1 db12) {
        this.f32499d = eVar;
        this.f32500e = context;
        this.f32501f = db12;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setCitySpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C47030e.m52356j(this.f32499d, this.f32500e, this.f32501f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setCitySpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f32500e.getResources().getColor(C0966R.color.f3417s5));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
