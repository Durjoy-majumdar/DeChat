package com.tencent.p014mm.plugin.label.p067ui.searchLabel;

import a22.C27740g;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72955b2;
import di3.C86312j;
import e22.C75529q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.b */
public class C69101b extends RecyclerView.C16613e<C75529q0> {

    /* renamed from: d */
    public ArrayList<C72955b2> f198705d;

    /* renamed from: e */
    public List<String> f198706e = new LinkedList();

    /* renamed from: f */
    public List<String> f198707f = new LinkedList();

    /* renamed from: g */
    public List<String> f198708g = new LinkedList();

    /* renamed from: h */
    public List<String> f198709h = new LinkedList();

    /* renamed from: i */
    public Context f198710i;

    /* renamed from: j */
    public int f198711j = 0;

    /* renamed from: n */
    public ArrayList<C72955b2> f198712n = null;

    /* renamed from: o */
    public Map<String, Integer> f198713o = new HashMap();

    /* renamed from: p */
    public String f198714p = "";

    /* renamed from: q */
    public boolean f198715q;

    /* renamed from: r */
    public boolean f198716r;

    /* renamed from: s */
    public boolean f198717s = true;

    /* renamed from: t */
    public C69102a f198718t = null;

    /* renamed from: u */
    public SparseArray<SpannableString> f198719u = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.b$a */
    public interface C69102a {
    }

    public C69101b(Context context) {
        this.f198710i = context;
    }

    /* renamed from: F4 */
    public C72955b2 mo95173F4(int i) {
        ArrayList<C72955b2> arrayList = this.f198705d;
        if (arrayList == null || i > arrayList.size()) {
            return null;
        }
        return this.f198705d.get(i);
    }

    /* renamed from: G4 */
    public int mo95174G4(String str) {
        Integer num = (Integer) ((HashMap) this.f198713o).get(str);
        if (num != null) {
            return num.intValue();
        }
        ArrayList<String> bO = C27740g.vx0().mo100951bO(str);
        int size = !Util.isNullOrNil((List) bO) ? bO.size() : 0;
        ((HashMap) this.f198713o).put(str, Integer.valueOf(size));
        return size;
    }

    /* renamed from: O4 */
    public void mo95175O4(ArrayList<C72955b2> arrayList) {
        if (arrayList == null) {
            this.f198705d = new ArrayList<>();
            notifyDataSetChanged();
            return;
        }
        if (((LinkedList) this.f198707f).size() > 0) {
            ((LinkedList) this.f198709h).clear();
            for (int i = 0; i < arrayList.size(); i++) {
                C72955b2 b2Var = arrayList.get(i);
                if (((LinkedList) this.f198707f).contains(String.valueOf(b2Var.field_labelID))) {
                    ((LinkedList) this.f198709h).add(String.valueOf(b2Var.field_labelID));
                }
            }
            ((LinkedList) this.f198706e).clear();
            ((LinkedList) this.f198706e).addAll(this.f198709h);
        }
        this.f198705d = arrayList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        ArrayList<C72955b2> arrayList = this.f198705d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C75529q0 q0Var = (C75529q0) zVar;
        C72955b2 F4 = mo95173F4(i);
        MMTextView mMTextView = q0Var.f221915z;
        String str = F4.field_labelName;
        int h = C76577a.m92157h(this.f198710i, C0966R.dimen.f3927j7);
        int hashCode = str.hashCode();
        SpannableString spannableString = this.f198719u.get(hashCode);
        if (spannableString == null) {
            spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f198710i, str, h));
            int indexOf = str.indexOf(this.f198714p);
            if (indexOf != -1) {
                int length = this.f198714p.length() + indexOf;
                spannableString.setSpan(new ForegroundColorSpan(this.f198710i.getResources().getColor(C0966R.color.akw)), indexOf, length, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, length, 33);
                this.f198719u.put(hashCode, spannableString);
            }
        }
        mMTextView.setText(spannableString);
        String valueOf = String.valueOf(F4.field_labelID);
        q0Var.f221910B.setOnClickListener(new C69100a(this, valueOf, F4, q0Var, i));
        q0Var.f221910B.setOnTouchListener((View.OnTouchListener) null);
        q0Var.f221912D.setVisibility(8);
        if (this.f198711j == 1) {
            q0Var.f221911C.setVisibility(0);
        } else {
            q0Var.f221911C.setVisibility(8);
        }
        if (this.f198716r) {
            q0Var.f221909A.setVisibility(0);
            q0Var.f221909A.setText(this.f198710i.getResources().getString(C0966R.string.n_v, new Object[]{Integer.valueOf(mo95174G4(valueOf))}));
        } else {
            q0Var.f221909A.setVisibility(8);
        }
        if (this.f198708g.contains(valueOf)) {
            q0Var.f221911C.setEnabled(false);
            q0Var.f221911C.setChecked(true);
            return;
        }
        q0Var.f221911C.setEnabled(true);
        if (q0Var.f221911C.getVisibility() == 0) {
            q0Var.f221911C.setChecked(((LinkedList) this.f198706e).contains(valueOf));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7084xq, viewGroup, false);
        C75529q0 q0Var = new C75529q0(inflate);
        inflate.setTag(q0Var);
        return q0Var;
    }
}
