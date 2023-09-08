package pp1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import gy3.C87412m;

/* renamed from: pp1.e */
public final class C11995e extends RecyclerView.C16631z {

    /* renamed from: z */
    public final MMProcessBar f34988z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11995e(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        MMProcessBar mMProcessBar = (MMProcessBar) view.findViewById(C0966R.C0970id.g3j);
        this.f34988z = mMProcessBar;
        mMProcessBar.mo82302b(C0966R.raw.finder_live_icon_location_loading, -16777216);
    }
}
