package nk3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kv1.C99254i;

/* renamed from: nk3.g */
public class C61801g extends RecyclerView.C16631z {

    /* renamed from: A */
    public ImageView f175720A;

    /* renamed from: B */
    public TextView f175721B;

    /* renamed from: C */
    public TextView f175722C;

    /* renamed from: D */
    public TextView f175723D;

    /* renamed from: E */
    public View f175724E;

    /* renamed from: z */
    public final View f175725z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61801g(View view) {
        super(view);
        C87412m.m108594g(view, "convertView");
        this.f175725z = view;
        View findViewById = view.findViewById(C0966R.C0970id.n0r);
        C87412m.m108593f(findViewById, "convertView.findViewById…id.fts_multi_item_avatar)");
        this.f175720A = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.n0t);
        C87412m.m108593f(findViewById2, "convertView.findViewById(R.id.fts_multi_item_name)");
        this.f175721B = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.n0u);
        C87412m.m108593f(findViewById3, "convertView.findViewById(R.id.fts_multi_item_time)");
        this.f175722C = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.n19);
        C87412m.m108593f(findViewById4, "convertView.findViewById(R.id.fts_multi_title)");
        this.f175723D = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.n0n);
        C87412m.m108593f(findViewById5, "convertView.findViewById(R.id.fts_multi_divider)");
        this.f175724E = findViewById5;
        this.f175723D.setSingleLine(false);
        this.f175723D.setMaxLines(2);
    }

    /* renamed from: y */
    public final void mo86724y(TextView textView, String str) {
        C87412m.m108594g(textView, "view");
        if (!Util.isNullOrNil(str)) {
            textView.setText(C99254i.m129306c(textView.getContext(), textView.getText(), str));
        }
    }
}
