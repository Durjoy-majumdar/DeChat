package p558i0;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i0.l */
public final class C108304l extends ViewGroup {

    /* renamed from: d */
    public final int f324296d = 5;

    /* renamed from: e */
    public final List<C108306n> f324297e;

    /* renamed from: f */
    public final List<C108306n> f324298f;

    /* renamed from: g */
    public final C108305m f324299g;

    /* renamed from: h */
    public int f324300h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108304l(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f324297e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f324298f = arrayList2;
        this.f324299g = new C108305m();
        setClipChildren(false);
        C108306n nVar = new C108306n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f324300h = 1;
        setTag(C0966R.C0970id.evz, Boolean.TRUE);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
