package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import java.util.ArrayList;
import sd3.C101583a;

/* renamed from: com.tencent.mm.ui.conversation.banner.e */
public class C97207e extends C6975i1<C97210f> {

    /* renamed from: o */
    public ArrayList<C97210f> f285227o = new ArrayList<>();

    /* renamed from: p */
    public C101583a f285228p = null;

    public C97207e(Context context) {
        super(context, null);
        mo1333o();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo1330d(Object obj, Cursor cursor) {
        C97210f fVar = (C97210f) obj;
        return null;
    }

    public int getCount() {
        return this.f285227o.size();
    }

    public Object getItem(int i) {
        return this.f285227o.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C97211g gVar;
        C97210f fVar = this.f285227o.get(i);
        if (view == null) {
            view = View.inflate(this.f24696e, C0966R.C0971layout.f6368cx, (ViewGroup) null);
            gVar = new C97211g();
            gVar.f285230a = view;
            gVar.f285231b = (Button) view.findViewById(C0966R.C0970id.f5533hm);
            view.setTag(gVar);
        } else {
            gVar = (C97211g) view.getTag();
        }
        if (fVar.mo136118a(gVar) != 0) {
            return null;
        }
        return view;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        this.f285227o.clear();
        C101583a aVar = this.f285228p;
        if (aVar != null) {
            this.f285227o.add(new C97210f(aVar));
            notifyDataSetChanged();
        }
    }
}
