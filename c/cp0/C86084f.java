package cp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: cp0.f */
public final class C86084f implements Runnable {

    /* renamed from: d */
    public final int f250567d;

    /* renamed from: e */
    public final String f250568e;

    public C86084f(int i, String str) {
        C87412m.m108594g(str, "TAG");
        this.f250567d = i;
        this.f250568e = str;
    }

    public void run() {
        if (C86083e.f250564a.mo120505a(this.f250567d)) {
            Log.m105928w(this.f250568e, "timeout, fallback to legacy logic");
        }
    }
}
