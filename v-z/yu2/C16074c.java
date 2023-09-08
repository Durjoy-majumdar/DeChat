package yu2;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.Set;

/* renamed from: yu2.c */
public final class C16074c extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f43220d;

    /* renamed from: e */
    public final int f43221e;

    /* renamed from: f */
    public final Set<Integer> f43222f;

    public C16074c(int i, int i2, int i3, boolean z, Set<Integer> set) {
        C87412m.m108594g(set, "mIgnoreItemViewTypeSet");
        this.f43220d = i;
        this.f43221e = i2;
        this.f43222f = set;
        new ColorDrawable(i3);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (recyclerView.getAdapter() != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108591d(adapter);
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b = ((RecyclerView.LayoutParams) layoutParams).mo17280b();
        if (b < 0 || i <= 0) {
            SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
            return;
        }
        if (recyclerView.getAdapter() != null) {
            RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
            C87412m.m108591d(adapter2);
            i2 = adapter2.getItemViewType(b);
        } else {
            i2 = -1;
        }
        if (i2 == -1 || this.f43222f.contains(Integer.valueOf(i2))) {
            rect.set(0, 0, 0, 0);
            SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
            return;
        }
        int i3 = this.f43220d;
        int i4 = this.f43221e;
        rect.set(i3 / 2, i4 / 2, i3 / 2, i4 / 2);
        SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerGridItemDecoration");
    }
}
