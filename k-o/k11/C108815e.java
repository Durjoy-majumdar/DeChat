package k11;

import android.view.View;
import android.widget.ExpandableListView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import gy3.C87412m;

/* renamed from: k11.e */
public final class C108815e implements ExpandableListView.OnChildClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108809b f325846a;

    /* renamed from: b */
    public final /* synthetic */ CleanCacheUI f325847b;

    public C108815e(C108809b bVar, CleanCacheUI cleanCacheUI) {
        this.f325846a = bVar;
        this.f325847b = cleanCacheUI;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        C108809b bVar = this.f325846a;
        Integer num = bVar.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[groupPos]");
        int intValue = num.intValue();
        boolean[] zArr = bVar.f325825i[intValue];
        C87412m.m108591d(zArr);
        boolean z = true;
        boolean z2 = !zArr[i2];
        zArr[i2] = z2;
        boolean[] zArr2 = bVar.f325822f;
        boolean z3 = false;
        if (z2) {
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (!zArr[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            z3 = z;
        }
        zArr2[intValue] = z3;
        bVar.notifyDataSetChanged();
        return this.f325847b.f312129n.invoke().booleanValue();
    }
}
