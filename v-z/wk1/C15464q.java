package wk1;

import android.graphics.Color;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import zp3.C79406f;

/* renamed from: wk1.q */
public final class C15464q implements C15482w<Integer> {

    /* renamed from: a */
    public final C15484y f41955a;

    /* renamed from: b */
    public final int f41956b;

    /* renamed from: c */
    public final WeakReference<View> f41957c;

    public C15464q(View view, C15484y yVar, int i) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(yVar, "sizeMode");
        this.f41955a = yVar;
        this.f41956b = i;
        this.f41957c = new WeakReference<>(view);
    }

    /* renamed from: a */
    public int mo14216a(Object obj) {
        ((Number) obj).intValue();
        return Color.parseColor("#FFFFFF");
    }

    /* renamed from: b */
    public int mo14217b(Object obj) {
        ((Number) obj).intValue();
        return this.f41955a == C15484y.SIZE_LARGE ? C79406f.m96347a(MMApplicationContext.getContext(), 24.0f) : C79406f.m96347a(MMApplicationContext.getContext(), 16.0f);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ int mo14218c(Object obj) {
        ((Number) obj).intValue();
        return 1;
    }

    /* renamed from: d */
    public int[] mo14219d(Object obj) {
        ((Number) obj).intValue();
        int a = C79406f.m96347a(MMApplicationContext.getContext(), 16.0f);
        int a2 = C79406f.m96347a(MMApplicationContext.getContext(), 20.0f);
        int[] iArr = new int[2];
        if (this.f41955a == C15484y.SIZE_LARGE) {
            iArr[0] = a2;
            iArr[1] = a2;
        } else {
            iArr[0] = a;
            iArr[1] = a;
        }
        return iArr;
    }

    /* renamed from: e */
    public C15478t mo14220e(int i) {
        return null;
    }

    /* renamed from: f */
    public int mo14221f(Object obj) {
        ((Number) obj).intValue();
        return this.f41955a == C15484y.SIZE_LARGE ? C79406f.m96347a(MMApplicationContext.getContext(), 15.0f) : C79406f.m96347a(MMApplicationContext.getContext(), 12.0f);
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ int mo14222g(Object obj) {
        ((Number) obj).intValue();
        return 0;
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ int mo14223h(Object obj) {
        ((Number) obj).intValue();
        return 0;
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ int mo14224i(Object obj) {
        ((Number) obj).intValue();
        return 0;
    }

    /* renamed from: j */
    public C15477s mo14225j(int i) {
        return null;
    }
}
