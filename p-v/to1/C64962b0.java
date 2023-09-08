package to1;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: to1.b0 */
public final class C64962b0 extends RecyclerView.C16631z {

    /* renamed from: A */
    public final ProgressBar f187046A;

    /* renamed from: B */
    public final View f187047B;

    /* renamed from: z */
    public final ImageView f187048z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64962b0(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f187048z = (ImageView) view.findViewById(C0966R.C0970id.m7y);
        this.f187046A = (ProgressBar) view.findViewById(C0966R.C0970id.g2z);
        this.f187047B = view.findViewById(C0966R.C0970id.m7t);
    }
}
