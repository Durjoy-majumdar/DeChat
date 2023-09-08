package tl1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedList;
import te3.C49225e31;
import te3.C50617o01;
import te3.C51773w21;
import te3.C52204z21;

/* renamed from: tl1.j0 */
public final class C13985j0 {

    /* renamed from: a */
    public final C13998p f39273a;

    /* renamed from: b */
    public final ViewGroup f39274b;

    /* renamed from: c */
    public final View f39275c;

    /* renamed from: d */
    public final View f39276d;

    /* renamed from: e */
    public final String f39277e = "VisitorLotteryCardDoneWidget";

    /* renamed from: f */
    public WeImageView f39278f;

    /* renamed from: g */
    public TextView f39279g;

    /* renamed from: h */
    public TextView f39280h;

    /* renamed from: i */
    public RecyclerView f39281i;

    /* renamed from: j */
    public View f39282j;

    /* renamed from: k */
    public TextView f39283k;

    /* renamed from: l */
    public C13995n f39284l;

    /* renamed from: m */
    public boolean f39285m;

    public C13985j0(C13998p pVar, ViewGroup viewGroup, View view, View view2) {
        C87412m.m108594g(pVar, "visitorCardPlugin");
        C87412m.m108594g(viewGroup, "doneWinnerListContainer");
        C87412m.m108594g(view, "cardContainer");
        C87412m.m108594g(view2, "card");
        this.f39273a = pVar;
        this.f39274b = viewGroup;
        this.f39275c = view;
        this.f39276d = view2;
    }

    /* renamed from: a */
    public final void mo13426a(C50617o01 o012) {
        C49225e31 e312;
        LinkedList<C51773w21> linkedList = null;
        C52204z21 z212 = o012 != null ? o012.f138872d : null;
        TextView textView = this.f39279g;
        if (textView != null) {
            String string = this.f39274b.getContext().getResources().getString(C0966R.string.duh);
            C87412m.m108593f(string, "doneWinnerListContainer.…ive_lottery_winner_count)");
            Object[] objArr = new Object[1];
            objArr[0] = z212 != null ? Integer.valueOf(z212.f145650q) : null;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
        }
        TextView textView2 = this.f39280h;
        if (textView2 != null) {
            String string2 = this.f39274b.getContext().getResources().getString(C0966R.string.du6);
            C87412m.m108593f(string2, "doneWinnerListContainer.…ottery_participate_count)");
            Object[] objArr2 = new Object[1];
            objArr2[0] = z212 != null ? Integer.valueOf(z212.f145647n) : null;
            String format2 = String.format(string2, Arrays.copyOf(objArr2, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            textView2.setText(format2);
        }
        C13995n nVar = this.f39284l;
        if (nVar != null) {
            if (!(o012 == null || (e312 = o012.f138875g) == null)) {
                linkedList = e312.f132658d;
            }
            nVar.mo13433G4(linkedList);
        }
        C13995n nVar2 = this.f39284l;
        if (nVar2 != null) {
            nVar2.notifyDataSetChanged();
        }
    }
}
