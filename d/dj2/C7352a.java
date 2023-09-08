package dj2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;

/* renamed from: dj2.a */
public final class C7352a extends BaseAdapter {

    /* renamed from: d */
    public final Context f25475d;

    /* renamed from: e */
    public final List<String> f25476e;

    public C7352a(Context context, List<String> list) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "datas");
        this.f25475d = context;
        this.f25476e = list;
    }

    public int getCount() {
        return this.f25476e.size();
    }

    public Object getItem(int i) {
        return this.f25476e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = null;
        if (view == null) {
            view = LayoutInflater.from(this.f25475d).inflate(C0966R.C0971layout.bsp, (ViewGroup) null);
        }
        if (view != null) {
            textView = (TextView) view.findViewById(C0966R.C0970id.kv8);
        }
        if (textView != null) {
            textView.setText(this.f25476e.get(i));
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) ((100.0f * this.f25475d.getResources().getDisplayMetrics().density) + 0.5f);
            textView.setLayoutParams(layoutParams2);
            if (i % 2 == 0) {
                textView.setBackgroundColor(this.f25475d.getResources().getColor(C0966R.color.aky));
            } else {
                textView.setBackgroundColor(this.f25475d.getResources().getColor(C0966R.color.al6));
            }
        }
        C87412m.m108591d(view);
        return view;
    }
}
