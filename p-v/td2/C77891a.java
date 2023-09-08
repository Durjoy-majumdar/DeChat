package td2;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: td2.a */
public class C77891a extends ClickableSpan {

    /* renamed from: d */
    public Context f226940d;

    /* renamed from: e */
    public C77892a f226941e = null;

    /* renamed from: f */
    public int f226942f = -1;

    /* renamed from: g */
    public int f226943g = -1;

    /* renamed from: td2.a$a */
    public interface C77892a {
        void onClick(View view);
    }

    public C77891a(Context context) {
        this.f226940d = context;
        this.f226942f = context.getResources().getColor(C0966R.color.a3q);
        this.f226943g = -1;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/order/util/MallClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C77892a aVar = this.f226941e;
        if (aVar != null) {
            aVar.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/order/util/MallClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.f226942f);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f226943g;
    }
}
