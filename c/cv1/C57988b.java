package cv1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import ev1.C58838a;
import gv1.C59712c;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: cv1.b */
public abstract class C57988b<T extends C58838a> extends C60896i<T> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.asc;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C58838a aVar = (C58838a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        String d = aVar.mo84034d();
        Drawable b = aVar.mo84033b();
        int a = aVar.mo84032a();
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.axl);
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f2a);
        if (textView != null) {
            textView.setText(d);
        }
        weImageView.setVisibility(b != null ? 0 : 8);
        weImageView.setImageDrawable(b);
        weImageView.setIconColor(a);
        View D = oVar.mo85812D(C0966R.C0970id.ale);
        if (D != null) {
            D.setOnClickListener(new C57987a(aVar));
        }
        mo82777k(oVar, aVar, i, i2, z, list);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View inflate = C85868k2.m106137b(oVar.f173499A).inflate(mo82776j(), (ViewGroup) null);
        mo82778l(recyclerView, oVar, i);
        ((FrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.brm)).addView(inflate);
        boolean z = C59712c.f170575I.mo84705a().f170567g;
        Context context = oVar.f173499A;
        if (z) {
            View D = oVar.mo85812D(C0966R.C0970id.atk);
            if (D != null) {
                D.setBackground(context.getDrawable(C0966R.C0969drawable.a6l));
            }
            WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f2a);
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(C0966R.color.f3482us));
            }
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.axl);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(C0966R.color.f3482us));
            }
            View D2 = oVar.mo85812D(C0966R.C0970id.ale);
            if (D2 != null) {
                D2.setBackground(context.getDrawable(C0966R.C0969drawable.f4835oa));
            }
            WeImageView weImageView2 = (WeImageView) oVar.mo85812D(C0966R.C0970id.alf);
            if (weImageView2 != null) {
                weImageView2.setIconColor(context.getResources().getColor(C0966R.color.f3474ue));
            }
        } else {
            View D3 = oVar.mo85812D(C0966R.C0970id.atk);
            if (D3 != null) {
                D3.setBackground(context.getDrawable(C0966R.C0969drawable.a6k));
            }
            WeImageView weImageView3 = (WeImageView) oVar.mo85812D(C0966R.C0970id.f2a);
            if (weImageView3 != null) {
                weImageView3.setIconColor(context.getResources().getColor(C0966R.color.f3479uo));
            }
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.axl);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(C0966R.color.f3479uo));
            }
            View D4 = oVar.mo85812D(C0966R.C0970id.ale);
            if (D4 != null) {
                D4.setBackground(context.getDrawable(C0966R.C0969drawable.f4836ob));
            }
            WeImageView weImageView4 = (WeImageView) oVar.mo85812D(C0966R.C0970id.alf);
            if (weImageView4 != null) {
                weImageView4.setIconColor(context.getResources().getColor(C0966R.color.f3473ud));
            }
        }
        C85875k4.m106189j0(((TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm)).getPaint(), 0.8f);
    }

    /* renamed from: j */
    public abstract int mo82776j();

    /* renamed from: k */
    public abstract void mo82777k(C60905o oVar, T t, int i, int i2, boolean z, List<Object> list);

    /* renamed from: l */
    public abstract void mo82778l(RecyclerView recyclerView, C60905o oVar, int i);
}
