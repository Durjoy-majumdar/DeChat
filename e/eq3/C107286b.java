package eq3;

import android.content.Context;
import gy3.C87412m;
import me3.C109623f;

/* renamed from: eq3.b */
public final class C107286b extends C107287c {

    /* renamed from: S0 */
    public static final int[] f320988S0 = {-855310, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107286b(Context context, C109623f fVar) {
        super(context, fVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "presenter");
    }

    /* renamed from: e */
    public int mo157767e(int i) {
        if (i >= 0) {
            int[] iArr = f320988S0;
            if (i < 8) {
                return iArr[i];
            }
        }
        return -65536;
    }
}
