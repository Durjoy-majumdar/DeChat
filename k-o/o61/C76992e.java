package o61;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import gy3.C87412m;
import kg3.C76577a;
import u61.C101962d;
import zp3.C79406f;

/* renamed from: o61.e */
public final class C76992e extends RecyclerView.C16631z {

    /* renamed from: A */
    public final MMAnimateView f224986A;

    /* renamed from: B */
    public final TextView f224987B;

    /* renamed from: C */
    public final Drawable f224988C;

    /* renamed from: z */
    public final LinearLayout f224989z;

    /* renamed from: o61.e$a */
    public static final class C76993a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ Context f224990a;

        public C76993a(Context context) {
            this.f224990a = context;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) C79406f.m96347a(this.f224990a, 8.0f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76992e(Context context, View view) {
        super(view);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.lyg);
        this.f224989z = linearLayout;
        MMAnimateView mMAnimateView = (MMAnimateView) view.findViewById(C0966R.C0970id.ce7);
        this.f224986A = mMAnimateView;
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.lyd);
        this.f224987B = textView;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.lye);
        int d = C76577a.m92153d(context, C0966R.color.BW_100);
        int d2 = C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_0_5);
        float a = (float) C79406f.m96347a(context, 8.0f);
        Drawable b = C101962d.f300168a.mo141484b(d, d2, a, a, a, a);
        this.f224988C = b;
        view.setClickable(true);
        view.setBackground(b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(C79406f.m96347a(context, 264.0f), C79406f.m96347a(context, 176.0f)));
        linearLayout.setOutlineProvider(new C76993a(context));
        linearLayout.setClipToOutline(true);
        mMAnimateView.setLayoutParams(new LinearLayout.LayoutParams(-1, C79406f.m96347a(context, 140.0f)));
        mMAnimateView.setDefaultImageResource(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C79406f.m96347a(context, 36.0f));
        layoutParams.setMargins(C79406f.m96347a(context, 12.0f), 0, 0, 0);
        textView.setLayoutParams(layoutParams);
    }
}
