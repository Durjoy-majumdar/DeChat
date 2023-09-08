package il1;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: il1.f */
public abstract class C46255f<LiveData> implements C0120a0<LiveData> {

    /* renamed from: d */
    public final C0125s f124692d;

    /* renamed from: e */
    public final C54219z<LiveData> f124693e;

    public C46255f(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        this.f124692d = sVar;
        C54219z<LiveData> zVar = new C54219z<>();
        this.f124693e = zVar;
        zVar.observe(sVar, this);
    }

    /* renamed from: a */
    public C54219z<LiveData> mo71666a() {
        if (!this.f124693e.hasObservers()) {
            Log.m105924i("BaseLiveDataViewWidget", "getViewData reobserve: " + this.f124692d);
            this.f124693e.observe(this.f124692d, this);
        }
        return this.f124693e;
    }
}
