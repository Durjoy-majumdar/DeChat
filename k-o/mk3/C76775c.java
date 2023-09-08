package mk3;

import android.os.Bundle;
import hk3.C76227e;

/* renamed from: mk3.c */
public class C76775c {

    /* renamed from: b */
    public static final C76775c f224573b = new C76775c();

    /* renamed from: a */
    public int[] f224574a = {0, 0, 0, 0, 0};

    /* renamed from: a */
    public void mo107029a(C76227e.C76230d dVar) {
        int ordinal = dVar.f223308b.ordinal();
        if (ordinal == 0) {
            int[] iArr = this.f224574a;
            iArr[1] = iArr[1] + 1;
        } else if (ordinal == 1) {
            int[] iArr2 = this.f224574a;
            iArr2[0] = iArr2[0] + 1;
        } else if (ordinal == 2) {
            int[] iArr3 = this.f224574a;
            iArr3[2] = iArr3[2] + 1;
        } else if (ordinal == 4) {
            Bundle bundle = dVar.f223307a;
            if (bundle == null || bundle.getInt("SCENE") != 1) {
                int[] iArr4 = this.f224574a;
                iArr4[4] = iArr4[4] + 1;
                return;
            }
            int[] iArr5 = this.f224574a;
            iArr5[3] = iArr5[3] + 1;
        }
    }
}
