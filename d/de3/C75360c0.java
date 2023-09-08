package de3;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: de3.c0 */
public class C75360c0 extends C75359b0 {

    /* renamed from: d */
    public Object f221538d;

    /* renamed from: e */
    public C75361a f221539e;

    /* renamed from: f */
    public Boolean f221540f = Boolean.TRUE;

    /* renamed from: de3.c0$a */
    public interface C75361a {
        /* renamed from: a */
        void mo67369a(View view, Object obj);
    }

    public C75360c0() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/SnsClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        C75361a aVar = this.f221539e;
        if (aVar != null) {
            aVar.mo67369a(view, this.f221538d);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/span/SnsClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        super.updateDrawState(textPaint);
        if (this.f221540f.booleanValue()) {
            C85875k4.m106189j0(textPaint, 0.8f);
        }
        SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
    }

    public C75360c0(Context context, Object obj, C75361a aVar) {
        super(2, (C53155r0) null);
        this.f221539e = aVar;
        this.f221538d = obj;
    }

    public C75360c0(Context context, Object obj, C75361a aVar, int i) {
        super(2, (C53155r0) null);
        this.f221539e = aVar;
        this.f221538d = obj;
        setColorConfig(i);
    }

    public C75360c0(Object obj, C75361a aVar) {
        super(2, (C53155r0) null);
        this.f221539e = aVar;
        this.f221538d = obj;
        setColorConfig(2);
    }
}
