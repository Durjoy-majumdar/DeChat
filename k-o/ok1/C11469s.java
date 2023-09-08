package ok1;

import com.tencent.p014mm.sdk.platformtools.Log;
import p565ir.C60606n;
import te3.C51713vn0;

/* renamed from: ok1.s */
public final class C11469s implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ long f33724a;

    /* renamed from: b */
    public final /* synthetic */ String f33725b;

    /* renamed from: c */
    public final /* synthetic */ int f33726c;

    public C11469s(long j, String str, int i) {
        this.f33724a = j;
        this.f33725b = str;
        this.f33726c = i;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        if (this.f33724a != j || !(obj instanceof C51713vn0)) {
            Log.m105920e("FinderLiveUtil", "tryToNotifyLiveEnd, local liveId:" + this.f33724a + " resp live id " + j + '!');
            return;
        }
        Log.m105924i("FinderLiveUtil", "tryToNotifyLiveEnd liveStatus:" + i);
        if (i == 2) {
            C62042e.f176370a.mo87119t1(this.f33724a, this.f33725b, 2, this.f33726c);
        }
    }
}
