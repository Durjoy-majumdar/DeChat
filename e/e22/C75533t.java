package e22;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import p629ny.C76979h;

/* renamed from: e22.t */
public class C75533t extends BaseAdapter {

    /* renamed from: d */
    public Context f221920d;

    /* renamed from: e */
    public String f221921e;

    /* renamed from: f */
    public ArrayList<String> f221922f = new ArrayList<>();

    /* renamed from: g */
    public SparseArray<SpannableString> f221923g = new SparseArray<>();

    public C75533t(Context context) {
        this.f221920d = context;
    }

    /* renamed from: a */
    public String getItem(int i) {
        if (this.f221922f == null || i >= getCount()) {
            return null;
        }
        return this.f221922f.get(i);
    }

    public int getCount() {
        ArrayList<String> arrayList = this.f221922f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C75529q0 q0Var;
        if (view == null || view.getTag() == null) {
            view = LayoutInflater.from(this.f221920d).inflate(C0966R.C0971layout.f7082xo, viewGroup, false);
            q0Var = new C75529q0(view);
            view.setTag(q0Var);
        } else {
            q0Var = (C75529q0) view.getTag();
        }
        MMTextView mMTextView = q0Var.f221915z;
        String nullAs = Util.nullAs(getItem(i), "");
        int textSize = (int) q0Var.f221915z.getTextSize();
        int hashCode = nullAs.hashCode();
        SpannableString spannableString = this.f221923g.get(hashCode);
        if (spannableString == null) {
            spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f221920d, nullAs, textSize));
            int indexOf = nullAs.indexOf(this.f221921e);
            if (indexOf == -1) {
                Log.m105929w("MicroMsg.Label.ContactLabelSearchAdapter", "hight light %s error.", nullAs);
            } else {
                int length = this.f221921e.length() + indexOf;
                spannableString.setSpan(new ForegroundColorSpan(this.f221920d.getResources().getColor(C0966R.color.akw)), indexOf, length, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, length, 33);
                this.f221923g.put(hashCode, spannableString);
            }
        }
        mMTextView.setText(spannableString);
        return view;
    }
}
