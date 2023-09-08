package if2;

import android.text.format.DateUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import te3.C48716ai;

/* renamed from: if2.r */
public final class C46245r extends C60896i<C46243b> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cs6;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C46243b bVar = (C46243b) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        ((ImageView) oVar.f44854d.findViewById(C0966R.C0970id.moz)).setVisibility(i == 0 ? 0 : 8);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.mur);
        C48716ai aiVar = bVar.f124654d.f136799d;
        textView.setText(aiVar != null ? aiVar.f130547e : null);
        TextView textView2 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.mus);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM/dd HH:mm", locale);
        long j = ((long) bVar.f124654d.f136800e) * 1000;
        textView2.setText(DateUtils.isToday(j) ? simpleDateFormat.format(new Date(j)) : simpleDateFormat2.format(new Date(j)));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
