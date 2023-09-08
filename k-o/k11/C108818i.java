package k11;

import android.widget.ExpandableListView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import gy3.C87412m;
import wy0.C102506a;

/* renamed from: k11.i */
public final class C108818i implements ExpandableListView.OnGroupExpandListener {

    /* renamed from: a */
    public final /* synthetic */ C108809b f325852a;

    /* renamed from: b */
    public final /* synthetic */ CleanCacheUI f325853b;

    public C108818i(C108809b bVar, CleanCacheUI cleanCacheUI) {
        this.f325852a = bVar;
        this.f325853b = cleanCacheUI;
    }

    public final void onGroupExpand(int i) {
        Integer num = this.f325852a.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[pos]");
        if (num.intValue() == 3) {
            CleanCacheUI cleanCacheUI = this.f325853b;
            long j = cleanCacheUI.f312130o;
            if (j >= 0) {
                C102506a.m135309i(12, j, Long.valueOf(cleanCacheUI.f312132q), Long.valueOf((long) this.f325853b.f312131p));
                this.f325853b.f312130o = -2;
            }
        }
    }
}
