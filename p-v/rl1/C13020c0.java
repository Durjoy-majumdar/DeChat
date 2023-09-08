package rl1;

import bl3.C0325u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ht1.C60200t1;
import java.util.LinkedList;
import te3.C48659a31;

/* renamed from: rl1.c0 */
public final class C13020c0 extends C0325u<C60200t1> {

    /* renamed from: d */
    public final String f37082d = "LiveLotteryPrepareSlice";

    /* renamed from: e */
    public LinkedList<C48659a31> f37083e = new LinkedList<>();

    /* renamed from: c3 */
    public final void mo12527c3(int i) {
        String str = this.f37082d;
        Log.m105924i(str, "releasePrepareList source:" + i + " size:" + this.f37083e.size());
        this.f37083e.clear();
    }

    public void onCleared() {
        super.onCleared();
        mo12527c3(1);
    }
}
