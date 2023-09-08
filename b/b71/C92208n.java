package b71;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rh3.C101380d;

/* renamed from: b71.n */
public final class C92208n implements C92191c {

    /* renamed from: a */
    public final C92207m f263915a;

    /* renamed from: b */
    public final RecyclerView.C16613e<?> f263916b;

    /* renamed from: c */
    public final String f263917c = "MicroMsg.StickerRecommendData";

    /* renamed from: d */
    public final LinkedList<C101380d> f263918d = new LinkedList<>();

    /* renamed from: e */
    public String f263919e;

    /* renamed from: f */
    public int f263920f = 1;

    /* renamed from: g */
    public boolean f263921g = true;

    public C92208n(C92207m mVar, RecyclerView.C16613e<?> eVar) {
        C87412m.m108594g(mVar, "callback");
        C87412m.m108594g(eVar, "adapter");
        this.f263915a = mVar;
        this.f263916b = eVar;
    }

    /* renamed from: c */
    public void mo126157c(List<C101380d> list) {
        int i;
        C87412m.m108594g(list, "lensList");
        String str = this.f263917c;
        Log.m105924i(str, "updateData: " + list.size() + ", " + Util.getStack());
        this.f263918d.clear();
        this.f263918d.addAll(list);
        this.f263915a.mo126172c(this.f263918d);
        if (this.f263921g && (!list.isEmpty())) {
            int i2 = 0;
            if (this.f263919e == null) {
                i = this.f263920f;
                this.f263921g = false;
            } else {
                Iterator<C101380d> it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (C87412m.m108589b(it.next().f296960a.f298862d, this.f263919e)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 > 0) {
                    this.f263921g = false;
                    i2 = i3;
                }
                i = i2;
            }
            this.f263915a.mo126171a(i);
        }
    }

    /* renamed from: d */
    public void mo126158d(int i, int i2) {
        this.f263916b.notifyItemRangeChanged(i, i2);
    }

    /* renamed from: e */
    public void mo126159e(int i, int i2) {
        this.f263916b.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: f */
    public void mo126160f(int i, int i2) {
        this.f263916b.notifyItemRangeRemoved(i, i2);
    }

    public void onMove(int i, int i2) {
        this.f263916b.notifyItemMoved(i, i2);
    }
}
