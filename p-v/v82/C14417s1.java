package v82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import d62.C75339i;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: v82.s1 */
public final class C14417s1 extends RecyclerView.C16613e<C14418t1> {

    /* renamed from: d */
    public Context f40022d;

    /* renamed from: e */
    public ArrayList<String> f40023e = new ArrayList<>();

    public C14417s1(Context context) {
        C87412m.m108594g(context, "context");
        this.f40022d = context;
    }

    /* renamed from: F4 */
    public final boolean mo13710F4(String str) {
        T t;
        C87412m.m108594g(str, "userName");
        Iterator<T> it = this.f40023e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b((String) t, str)) {
                break;
            }
        }
        return t != null;
    }

    public int getItemCount() {
        return (int) Math.ceil(((double) this.f40023e.size()) / ((double) 5));
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C14418t1 t1Var = (C14418t1) zVar;
        C87412m.m108594g(t1Var, "holder");
        int i2 = (i + 1) * 5;
        if (i2 >= this.f40023e.size()) {
            i2 = this.f40023e.size();
        }
        LinearLayout linearLayout = new LinearLayout(this.f40022d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        if (i != 0) {
            layoutParams.topMargin = C111418b0.f333543d;
        }
        if (i == getItemCount() - 1) {
            int size = this.f40023e.size() % 5;
            layoutParams.leftMargin = size == 0 ? 0 : ((C111418b0.f333548i + C111418b0.f333543d) * (5 - size)) / 2;
        }
        linearLayout.setLayoutParams(layoutParams);
        int i3 = i * 5;
        for (int i4 = i3; i4 < i2; i4++) {
            ImageView imageView = new ImageView(this.f40022d);
            int i5 = C111418b0.f333548i;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i5, i5);
            if (i4 != i3) {
                layoutParams2.leftMargin = C111418b0.f333543d;
            }
            imageView.setLayoutParams(layoutParams2);
            linearLayout.addView(imageView);
            imageView.setContentDescription(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f40022d, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f40023e.get(i4))));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, this.f40023e.get(i4));
        }
        RelativeLayout relativeLayout = t1Var.f40024z;
        if (relativeLayout != null) {
            relativeLayout.addView(linearLayout);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f40022d).inflate(C0966R.C0971layout.f359904bi3, viewGroup, false);
        C87412m.m108593f(inflate, "from(context).inflate(R.…avatar_cell,parent,false)");
        return new C14418t1(inflate);
    }
}
