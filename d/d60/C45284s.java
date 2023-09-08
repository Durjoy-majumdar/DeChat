package d60;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.sdk.platformtools.Log;
import i60.C46169a;
import java.util.List;

/* renamed from: d60.s */
public final class C45284s implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ C45272n f122658a;

    /* renamed from: b */
    public final /* synthetic */ List<C46169a> f122659b;

    public C45284s(C45272n nVar, List<C46169a> list) {
        this.f122658a = nVar;
        this.f122659b = list;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        Log.m105918d("MicroMsg.LiveCommentPlugin", "onRemoved position:" + i + ", count:" + i2);
        this.f122658a.f122637j.f124462d.clear();
        this.f122658a.f122637j.f124462d.addAll(this.f122659b);
        this.f122658a.f122637j.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        Log.m105918d("MicroMsg.LiveCommentPlugin", "onInserted position:" + i + ", count:" + i2);
        this.f122658a.f122637j.f124462d.clear();
        this.f122658a.f122637j.f124462d.addAll(this.f122659b);
        this.f122658a.f122637j.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        Log.m105918d("MicroMsg.LiveCommentPlugin", "onChanged position:" + i + ", count:" + i2);
        this.f122658a.f122637j.f124462d.clear();
        this.f122658a.f122637j.f124462d.addAll(this.f122659b);
        this.f122658a.f122637j.notifyItemRangeChanged(i, i2);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        Log.m105918d("MicroMsg.LiveCommentPlugin", "onMoved fromPosition:" + i + ", toPosition:" + i2);
        this.f122658a.f122637j.notifyItemMoved(i, i2);
    }
}
