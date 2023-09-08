package k11;

import android.view.View;
import android.widget.ExpandableListView;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import gy3.C87412m;
import sx3.C110821n;

/* renamed from: k11.d */
public final class C108814d implements ExpandableListView.OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108809b f325844a;

    /* renamed from: b */
    public final /* synthetic */ CleanCacheUI f325845b;

    public C108814d(C108809b bVar, CleanCacheUI cleanCacheUI) {
        this.f325844a = bVar;
        this.f325845b = cleanCacheUI;
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        C108809b bVar = this.f325844a;
        Integer num = bVar.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[pos]");
        int intValue = num.intValue();
        if (intValue < 0) {
            int i2 = i - 1;
            AnimatedExpandableListView animatedExpandableListView = bVar.f325820d.f312122d;
            C87412m.m108591d(animatedExpandableListView);
            if (animatedExpandableListView.isGroupExpanded(i2)) {
                AnimatedExpandableListView animatedExpandableListView2 = bVar.f325820d.f312122d;
                C87412m.m108591d(animatedExpandableListView2);
                animatedExpandableListView2.mo136338c(i2);
            } else {
                Integer num2 = bVar.f325824h.get(i2);
                C87412m.m108593f(num2, "posToGroupMapping[groupPos]");
                int intValue2 = num2.intValue();
                if (bVar.f325826j[intValue2] != null) {
                    AnimatedExpandableListView animatedExpandableListView3 = bVar.f325820d.f312122d;
                    C87412m.m108591d(animatedExpandableListView3);
                    animatedExpandableListView3.mo136339e(i2);
                } else {
                    bVar.f325823g[intValue2] = true;
                }
            }
            bVar.notifyDataSetChanged();
        } else {
            boolean[] zArr = bVar.f325822f;
            boolean z = !zArr[intValue];
            zArr[intValue] = z;
            boolean[] zArr2 = bVar.f325825i[intValue];
            if (zArr2 != null) {
                C110821n.m150970q(zArr2, z, 0, 0, 6, (Object) null);
            }
            bVar.notifyDataSetChanged();
        }
        return this.f325845b.f312129n.invoke().booleanValue();
    }
}
