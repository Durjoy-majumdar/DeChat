package lw2;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ew2.C97757a;
import java.util.List;

/* renamed from: lw2.r */
public final class C99708r implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ C99706q f292245a;

    /* renamed from: b */
    public final /* synthetic */ List<C97757a> f292246b;

    public C99708r(C99706q qVar, List<C97757a> list) {
        this.f292245a = qVar;
        this.f292246b = list;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        String str = this.f292245a.f292239e;
        Log.m105918d(str, "onRemoved position:" + i + ", count:" + i2);
        this.f292245a.f292238d.clear();
        this.f292245a.f292238d.addAll(this.f292246b);
        this.f292245a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        String str = this.f292245a.f292239e;
        Log.m105918d(str, "onInserted position:" + i + ", count:" + i2);
        this.f292245a.f292238d.clear();
        this.f292245a.f292238d.addAll(this.f292246b);
        this.f292245a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        String str = this.f292245a.f292239e;
        Log.m105918d(str, "onChanged position:" + i + ", count:" + i2);
        this.f292245a.f292238d.clear();
        this.f292245a.f292238d.addAll(this.f292246b);
        this.f292245a.notifyItemRangeChanged(i, i2);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        String str = this.f292245a.f292239e;
        Log.m105918d(str, "onMoved fromPosition:" + i + ", toPosition:" + i2);
    }
}
