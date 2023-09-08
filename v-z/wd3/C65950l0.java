package wd3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import java.util.List;
import kg3.C76577a;
import p196ln.C76705f;
import z51.C79305f;

/* renamed from: wd3.l0 */
public class C65950l0 extends BaseAdapter {

    /* renamed from: d */
    public Context f189611d;

    /* renamed from: e */
    public List<String> f189612e;

    /* renamed from: f */
    public List<String> f189613f;

    /* renamed from: wd3.l0$a */
    public static class C65951a {

        /* renamed from: a */
        public ImageView f189614a;

        /* renamed from: b */
        public TextView f189615b;
    }

    public C65950l0(Context context, List<String> list, List<String> list2) {
        this.f189611d = context;
        this.f189612e = list2;
        this.f189613f = list;
    }

    /* renamed from: a */
    public final C65951a mo89984a(View view) {
        C65951a aVar = new C65951a();
        aVar.f189614a = (ImageView) view.findViewById(C0966R.C0970id.f357654b14);
        aVar.f189615b = (TextView) view.findViewById(C0966R.C0970id.b17);
        view.setTag(aVar);
        return aVar;
    }

    public int getCount() {
        return this.f189612e.size();
    }

    public Object getItem(int i) {
        return this.f189612e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C65951a aVar;
        if (view == null) {
            view = View.inflate(this.f189611d, C0966R.C0971layout.f6809p5, (ViewGroup) null);
            view.findViewById(C0966R.C0970id.f357654b14).setImportantForAccessibility(2);
            aVar = mo89984a(view);
        } else {
            aVar = (C65951a) view.getTag();
            if (aVar == null) {
                aVar = mo89984a(view);
            }
        }
        int size = this.f189612e.size() % 4;
        if (i >= 0 && i < this.f189612e.size() && i < this.f189613f.size()) {
            aVar.f189614a.setVisibility(0);
            aVar.f189615b.setVisibility(0);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f189614a, this.f189613f.get(i));
            aVar.f189615b.setText(this.f189612e.get(i));
            aVar.f189615b.setText(((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(this.f189611d, this.f189612e.get(i)));
            if (this.f189612e.size() <= 12 || i < this.f189612e.size() - size) {
                aVar.f189615b.setPadding(0, 0, 0, 0);
            } else {
                aVar.f189615b.setPadding(0, 0, 0, C76577a.m92157h(this.f189611d, C0966R.dimen.f3685be));
            }
        }
        return view;
    }
}
