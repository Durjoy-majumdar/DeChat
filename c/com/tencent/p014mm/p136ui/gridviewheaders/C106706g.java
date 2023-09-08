package com.tencent.p014mm.p136ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.ui.gridviewheaders.g */
public class C106706g extends BaseAdapter implements C97221b {

    /* renamed from: d */
    public C106705f f319022d;

    /* renamed from: e */
    public List<C106709c> f319023e;

    /* renamed from: com.tencent.mm.ui.gridviewheaders.g$b */
    public final class C106708b extends DataSetObserver {
        public C106708b(C106707a aVar) {
        }

        public void onChanged() {
            C106706g gVar = C106706g.this;
            gVar.f319023e = gVar.mo153679a(gVar.f319022d);
            C106706g.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C106706g gVar = C106706g.this;
            gVar.f319023e = gVar.mo153679a(gVar.f319022d);
            C106706g.this.notifyDataSetInvalidated();
        }
    }

    /* renamed from: com.tencent.mm.ui.gridviewheaders.g$c */
    public class C106709c {

        /* renamed from: a */
        public int f319025a = 0;

        /* renamed from: b */
        public int f319026b;

        public C106709c(C106706g gVar, int i) {
            this.f319026b = i;
        }
    }

    public C106706g(C106705f fVar) {
        this.f319022d = fVar;
        fVar.registerDataSetObserver(new C106708b((C106707a) null));
        this.f319023e = mo153679a(fVar);
    }

    /* renamed from: a */
    public List<C106709c> mo153679a(C106705f fVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fVar.getCount(); i++) {
            long y = fVar.mo138431y(i);
            C106709c cVar = (C106709c) hashMap.get(Long.valueOf(y));
            if (cVar == null) {
                cVar = new C106709c(this, i);
                arrayList.add(cVar);
            }
            cVar.f319025a++;
            hashMap.put(Long.valueOf(y), cVar);
        }
        return arrayList;
    }

    /* renamed from: c */
    public View mo136159c(int i, View view, ViewGroup viewGroup) {
        return this.f319022d.mo138426c(this.f319023e.get(i).f319026b, view, viewGroup);
    }

    /* renamed from: e */
    public int mo136160e(int i) {
        try {
            return this.f319023e.get(i).f319025a;
        } catch (IndexOutOfBoundsException e) {
            e.toString();
            return 0;
        }
    }

    public int getCount() {
        return this.f319022d.getCount();
    }

    public Object getItem(int i) {
        return this.f319022d.getItem(i);
    }

    public long getItemId(int i) {
        return this.f319022d.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f319022d.getView(i, view, viewGroup);
    }

    /* renamed from: m */
    public int mo136161m() {
        return this.f319023e.size();
    }
}
