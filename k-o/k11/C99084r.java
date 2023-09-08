package k11;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import h11.C98311d;
import j20.C117292a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: k11.r */
public class C99084r extends BaseAdapter {

    /* renamed from: d */
    public final CleanChattingUI f290440d;

    /* renamed from: e */
    public final HashSet<Integer> f290441e = new HashSet<>();

    /* renamed from: f */
    public List<C99086u> f290442f = Collections.emptyList();

    /* renamed from: g */
    public AdapterView.OnItemClickListener f290443g;

    /* renamed from: h */
    public int f290444h;

    public C99084r(CleanChattingUI cleanChattingUI) {
        this.f290440d = cleanChattingUI;
    }

    /* renamed from: a */
    public C99086u getItem(int i) {
        if (i < 0 || i >= this.f290442f.size()) {
            return null;
        }
        return this.f290442f.get(i);
    }

    public int getCount() {
        return this.f290442f.size();
    }

    public long getItemId(int i) {
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        r$$b r__b;
        Class cls = C75339i.class;
        Class cls2 = C76979h.class;
        if (view == null) {
            view = this.f290440d.getLayoutInflater().inflate(C0966R.C0971layout.f7006uq, viewGroup, false);
            r__b = new r$$b();
            r__b.f290445a = (ImageView) view.findViewById(C0966R.C0970id.a27);
            r__b.f290446b = (TextView) view.findViewById(C0966R.C0970id.kpm);
            r__b.f290447c = (TextView) view.findViewById(C0966R.C0970id.c2h);
            r__b.f290448d = (CheckBox) view.findViewById(C0966R.C0970id.j9g);
            r__b.f290449e = view.findViewById(C0966R.C0970id.mob);
            r__b.f290450f = view.findViewById(C0966R.C0970id.krm);
            view.setTag(r__b);
        } else {
            r__b = (r$$b) view.getTag();
        }
        r__b.f290449e.setOnClickListener(new r$$a(this, r__b, i));
        C99086u a = getItem(i);
        if (a == null) {
            Log.m105921e("MicroMsg.CleanChattingAdapter", "get item is null. [%d]", Integer.valueOf(i));
            a = new C99086u();
            a.f290496a = "";
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(r__b.f290445a, a.f290496a);
        r__b.f290447c.setText(C98311d.m127053b(a.f290497b[this.f290444h]));
        if (C72996z1.m85820U5(a.f290496a)) {
            TextView textView = r__b.f290446b;
            CleanChattingUI cleanChattingUI = this.f290440d;
            String str = a.f290496a;
            textView.setText(((C76979h) C86312j.m106911c(cls2)).yp0(cleanChattingUI, ((C75339i) C86312j.m106911c(cls)).mo62519pb(str, str), r__b.f290446b.getTextSize()));
        } else {
            r__b.f290446b.setText(((C76979h) C86312j.m106911c(cls2)).yp0(this.f290440d, ((C75339i) C86312j.m106911c(cls)).getDisplayName(a.f290496a), r__b.f290446b.getTextSize()));
        }
        r__b.f290448d.setChecked(this.f290441e.contains(Integer.valueOf(i)));
        View view2 = r__b.f290450f;
        int i2 = i == 0 ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}
