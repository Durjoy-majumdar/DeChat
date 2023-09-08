package nj2;

import android.content.Context;
import android.os.Bundle;
import di3.C7335d;
import oj2.C110053a;

/* renamed from: nj2.c */
public interface C109749c extends C7335d {

    /* renamed from: nj2.c$a */
    public enum C61756a {
        VOIP,
        MULTITALK,
        WMPF_CALL_IN
    }

    /* renamed from: Px */
    int mo86664Px();

    /* renamed from: QT */
    void mo86665QT(boolean z);

    /* renamed from: SI */
    int mo86666SI();

    /* renamed from: W */
    boolean mo86667W();

    void Yb0(Context context, int i);

    /* renamed from: Z */
    boolean mo86669Z();

    C110053a i00();

    void setMute(boolean z);

    /* renamed from: vo */
    boolean mo86672vo(C61756a aVar, Bundle bundle);
}
