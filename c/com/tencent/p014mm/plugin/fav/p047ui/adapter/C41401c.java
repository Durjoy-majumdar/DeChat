package com.tencent.p014mm.plugin.fav.p047ui.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.fav.ui.adapter.c */
public abstract class C41401c extends BaseAdapter implements View.OnClickListener {

    /* renamed from: d */
    public Context f111481d;

    /* renamed from: e */
    public String f111482e;

    /* renamed from: f */
    public List<String> f111483f = new LinkedList();

    /* renamed from: g */
    public SparseArray<SpannableString> f111484g = new SparseArray<>();

    public C41401c(Context context) {
        this.f111481d = context;
    }

    /* renamed from: a */
    public abstract void mo64487a(String str);

    public int getCount() {
        return ((LinkedList) this.f111483f).size();
    }

    public Object getItem(int i) {
        return (String) ((LinkedList) this.f111483f).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(this.f111481d, C0966R.C0971layout.a7d, (ViewGroup) null);
            view.setOnClickListener(this);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.j5z);
        String nullAs = Util.nullAs((String) ((LinkedList) this.f111483f).get(i), "");
        int textSize = (int) textView.getTextSize();
        int hashCode = nullAs.hashCode();
        SpannableString spannableString = this.f111484g.get(hashCode);
        if (spannableString == null) {
            spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f111481d, nullAs, textSize));
            int indexOf = nullAs.indexOf(this.f111482e);
            if (-1 == indexOf) {
                Log.m105929w("MicroMsg.FavoriteTagSearchAdapter", "high light %s error", nullAs);
            } else {
                int length = this.f111482e.length() + indexOf;
                spannableString.setSpan(new ForegroundColorSpan(this.f111481d.getResources().getColor(C0966R.color.akw)), indexOf, length, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, length, 33);
                this.f111484g.put(hashCode, spannableString);
            }
        }
        textView.setText(spannableString);
        return view;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/adapter/FavoriteTagSearchAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String charSequence = ((TextView) view.findViewById(C0966R.C0970id.j5z)).getText().toString();
        Log.m105919d("MicroMsg.FavoriteTagSearchAdapter", "select search tag %s", charSequence);
        mo64487a(charSequence);
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/adapter/FavoriteTagSearchAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
