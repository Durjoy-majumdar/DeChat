package a92;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.voip.p475ui.C71599n0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: a92.d */
public final class C67021d extends RecyclerView.C16631z {

    /* renamed from: A */
    public ImageView f192515A;

    /* renamed from: z */
    public WeImageView f192516z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67021d(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 2);
        View findViewById = view.findViewById(C0966R.C0970id.h4s);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        this.f192515A = imageView;
        imageView.setClipToOutline(true);
        ImageView imageView2 = this.f192515A;
        if (imageView2 != null) {
            imageView2.setOutlineProvider(new C71599n0(b));
        }
        View findViewById2 = view.findViewById(C0966R.C0970id.h4t);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        WeImageView weImageView = (WeImageView) findViewById2;
        this.f192516z = weImageView;
        weImageView.setClipToOutline(true);
        WeImageView weImageView2 = this.f192516z;
        if (weImageView2 != null) {
            weImageView2.setOutlineProvider(new C71599n0(b));
        }
    }
}
