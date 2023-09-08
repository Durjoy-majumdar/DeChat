package ao1;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: ao1.e1 */
public final class C0148e1 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f586d;

    public C0148e1(C32226l<? super Boolean, C13598b0> lVar) {
        this.f586d = lVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("Finder.PostRealNameAuthUIC", "[checkRealName] requestCode:" + i + ", resultCode:" + i2);
        if (i != 30001) {
            return;
        }
        if (i2 == -1) {
            this.f586d.invoke(Boolean.TRUE);
        } else {
            this.f586d.invoke(Boolean.FALSE);
        }
    }
}
