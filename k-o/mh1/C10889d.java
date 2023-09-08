package mh1;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64311db1;

/* renamed from: mh1.d */
public final class C10889d extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C47030e f32502d;

    /* renamed from: e */
    public final /* synthetic */ Context f32503e;

    /* renamed from: f */
    public final /* synthetic */ C64311db1 f32504f;

    public C10889d(C47030e eVar, Context context, C64311db1 db12) {
        this.f32502d = eVar;
        this.f32503e = context;
        this.f32504f = db12;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setPoiIconSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C47030e.m52356j(this.f32502d, this.f32503e, this.f32504f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setPoiIconSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
    }
}
