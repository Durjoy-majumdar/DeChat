package pj3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.base.preference.C73244a;

/* renamed from: pj3.b */
public class C47510b extends C73244a {

    /* renamed from: y */
    public SparseArray<View> f127482y = new SparseArray<>();

    public C47510b(Context context, ListView listView, SharedPreferences sharedPreferences) {
        super(context, listView, sharedPreferences);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        this.f127482y.put(i, view2);
        return view2;
    }

    /* renamed from: v */
    public View mo72518v(int i, ListView listView) {
        if (i > listView.getLastVisiblePosition() || i < listView.getFirstVisiblePosition()) {
            return null;
        }
        return this.f127482y.get(i);
    }
}
