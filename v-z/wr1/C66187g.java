package wr1;

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

/* renamed from: wr1.g */
public class C66187g extends BaseAdapter {

    /* renamed from: d */
    public Context f190211d;

    /* renamed from: e */
    public List<String> f190212e;

    /* renamed from: f */
    public List<String> f190213f;

    /* renamed from: wr1.g$a */
    public static class C66188a {

        /* renamed from: a */
        public ImageView f190214a;

        /* renamed from: b */
        public TextView f190215b;
    }

    public C66187g(Context context, List<String> list, List<String> list2) {
        this.f190211d = context;
        this.f190212e = list2;
        this.f190213f = list;
    }

    /* renamed from: a */
    public final C66188a mo90283a(View view) {
        C66188a aVar = new C66188a();
        aVar.f190214a = (ImageView) view.findViewById(C0966R.C0970id.f357654b14);
        aVar.f190215b = (TextView) view.findViewById(C0966R.C0970id.b17);
        view.setTag(aVar);
        return aVar;
    }

    public int getCount() {
        return this.f190212e.size();
    }

    public Object getItem(int i) {
        return this.f190212e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C66188a aVar;
        if (view == null) {
            view = View.inflate(this.f190211d, C0966R.C0971layout.f6809p5, (ViewGroup) null);
            aVar = mo90283a(view);
        } else {
            aVar = (C66188a) view.getTag();
            if (aVar == null) {
                aVar = mo90283a(view);
            }
        }
        int size = this.f190212e.size() % 4;
        if (i >= 0 && i < this.f190212e.size() && i < this.f190213f.size()) {
            aVar.f190214a.setVisibility(0);
            aVar.f190215b.setVisibility(0);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f190214a, this.f190213f.get(i));
            aVar.f190215b.setText(this.f190212e.get(i));
            aVar.f190215b.setText(((C79305f) C86312j.m106911c(C79305f.class)).mo109310M(this.f190211d, this.f190212e.get(i)));
            if (this.f190212e.size() <= 12 || i < this.f190212e.size() - size) {
                aVar.f190215b.setPadding(0, 0, 0, 0);
            } else {
                aVar.f190215b.setPadding(0, 0, 0, C76577a.m92157h(this.f190211d, C0966R.dimen.f3685be));
            }
        }
        return view;
    }
}
