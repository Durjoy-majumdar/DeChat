package ay2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ay2.C67113b;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: ay2.e */
public final class C67120e extends C67113b {

    /* renamed from: j */
    public final TextView f192723j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67120e(Context context, C67113b.C67114a aVar, int i) {
        super(context, aVar, i, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c8g, getContainerView(), false);
        View findViewById = inflate.findViewById(C0966R.C0970id.cjd);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.empty_title)");
        this.f192723j = (TextView) findViewById;
        this.f192713i.addView(inflate, new FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: b */
    public void mo91215b() {
    }

    /* renamed from: c */
    public String mo91216c() {
        return "";
    }
}
