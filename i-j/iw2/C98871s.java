package iw2;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: iw2.s */
public final class C98871s implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ C98864r f289837a;

    /* renamed from: b */
    public final /* synthetic */ int f289838b;

    public C98871s(C98864r rVar, int i) {
        this.f289837a = rVar;
        this.f289838b = i;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        String str = this.f289837a.f289805h;
        Log.m105924i(str, "onRemoved: " + i + ' ' + i2);
        this.f289837a.f289802e.mo134402j(this.f289838b, i, i2);
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        String str = this.f289837a.f289805h;
        Log.m105924i(str, "onInserted: " + i + ' ' + i2);
        this.f289837a.f289802e.mo134398f(this.f289838b, i, i2);
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        String str = this.f289837a.f289805h;
        Log.m105924i(str, "onChanged: " + i + ' ' + i2);
        this.f289837a.f289802e.mo134396d(this.f289838b, i, i2);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        String str = this.f289837a.f289805h;
        Log.m105924i(str, "onMoved: " + i + ' ' + i2);
    }
}
