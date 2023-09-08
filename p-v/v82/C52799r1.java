package v82;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: v82.r1 */
public final class C52799r1 extends RecyclerView.C16631z {

    /* renamed from: A */
    public View f147506A;

    /* renamed from: z */
    public ImageView f147507z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52799r1(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.a1p);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar)");
        this.f147507z = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.ev8);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.header_stub)");
        this.f147506A = findViewById2;
    }
}
