package rs1;

import android.graphics.Rect;
import android.widget.TextView;
import as1.C0201a;
import gy3.C87412m;

/* renamed from: rs1.e5 */
public final class C13216e5 implements C0201a.C0203b {

    /* renamed from: a */
    public final /* synthetic */ TextView f37553a;

    public C13216e5(TextView textView) {
        this.f37553a = textView;
    }

    /* renamed from: g */
    public Rect mo236g(C0201a aVar) {
        C87412m.m108594g(aVar, "drawer");
        Rect rect = new Rect();
        this.f37553a.getGlobalVisibleRect(rect);
        return rect;
    }
}
