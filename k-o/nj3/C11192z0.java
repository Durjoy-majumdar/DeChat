package nj3;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: nj3.z0 */
public class C11192z0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f33001d;

    /* renamed from: e */
    public final /* synthetic */ Context f33002e;

    public C11192z0(TextView textView, Context context) {
        this.f33001d = textView;
        this.f33002e = context;
    }

    public void onGlobalLayout() {
        if (this.f33001d.getLineCount() > 1) {
            this.f33001d.setTextSize(0, (float) C76577a.m92157h(this.f33002e, C0966R.dimen.f3684bd));
        }
        this.f33001d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
