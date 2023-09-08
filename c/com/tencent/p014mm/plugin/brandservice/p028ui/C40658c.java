package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.widget.AbsListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import qj3.C47856a;
import qj3.C47859b;
import te3.C50274lk;
import te3.C51256sk;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.c */
public class C40658c extends C47859b {

    /* renamed from: g */
    public List<C40659a> f109229g = new ArrayList();

    /* renamed from: h */
    public int f109230h;

    /* renamed from: i */
    public int f109231i;

    /* renamed from: j */
    public String f109232j;

    /* renamed from: n */
    public boolean f109233n = true;

    /* renamed from: o */
    public boolean f109234o = true;

    /* renamed from: p */
    public boolean f109235p = true;

    /* renamed from: q */
    public int f109236q;

    /* renamed from: r */
    public long[] f109237r = {1};

    /* renamed from: s */
    public C40660b f109238s;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.c$a */
    public static class C40659a {

        /* renamed from: a */
        public long f109239a;

        /* renamed from: b */
        public int f109240b;

        /* renamed from: c */
        public int f109241c;

        /* renamed from: d */
        public List<String> f109242d;

        /* renamed from: e */
        public List<C51256sk> f109243e;

        /* renamed from: f */
        public boolean f109244f;

        /* renamed from: g */
        public boolean f109245g;

        /* renamed from: h */
        public List<C50274lk> f109246h;
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.c$b */
    public interface C40660b {
        /* renamed from: a */
        void mo63467a(C40658c cVar, C47856a aVar, int i, String str, int i2, int i3);
    }

    public C40658c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public Object[] mo63559a(int i) {
        C40659a k = mo63568k(i);
        C50274lk i2 = mo63566i(i);
        String str = i2 != null ? i2.f137474j : "";
        if (k == null) {
            return null;
        }
        return new Object[]{this, k.f109242d, Integer.valueOf(this.f109231i), str};
    }

    /* renamed from: d */
    public final synchronized void mo63560d() {
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < ((ArrayList) this.f109229g).size(); i++) {
            C40659a aVar = (C40659a) ((ArrayList) this.f109229g).get(i);
            if (aVar != null) {
                hashMap.put(Long.valueOf(aVar.f109239a), aVar);
            }
        }
        ((ArrayList) this.f109229g).clear();
        this.f109230h = 0;
        int i2 = 0;
        while (true) {
            long[] jArr = this.f109237r;
            if (i2 >= jArr.length) {
                break;
            }
            C40659a aVar2 = (C40659a) hashMap.get(Long.valueOf(jArr[i2]));
            if (aVar2 != null) {
                ((ArrayList) this.f109229g).add(aVar2);
                this.f109230h += mo63569l(aVar2);
            }
            i2++;
        }
        if (((ArrayList) this.f109229g).size() > 0) {
            List<C40659a> list = this.f109229g;
            C40659a aVar3 = (C40659a) ((ArrayList) list).get(((ArrayList) list).size() - 1);
            boolean z2 = aVar3.f109245g;
            boolean z3 = this.f109233n;
            if (z2 == z3) {
                this.f109230h += z2 ? -1 : 1;
                if (!z3) {
                    z = true;
                }
                aVar3.f109245g = z;
            }
        }
        hashMap.clear();
    }

    /* renamed from: f */
    public void mo63561f(C50274lk lkVar, boolean z) {
        if ((!this.f109233n || lkVar != null) && lkVar.f137472h != null) {
            if (isEmpty()) {
                this.f109236q = (int) (System.currentTimeMillis() / 1000);
            }
            C40659a j = mo63567j(lkVar.f137468d);
            if (j != null) {
                if (j.f109243e == null) {
                    j.f109243e = new LinkedList();
                }
                ((LinkedList) j.f109243e).addAll(lkVar.f137472h);
                if (j.f109246h == null) {
                    j.f109246h = new LinkedList();
                }
                ((LinkedList) j.f109246h).add(lkVar);
                j.f109240b += lkVar.f137472h.size();
                this.f109230h += lkVar.f137472h.size();
            } else if (z) {
                ((ArrayList) this.f109229g).add(mo63565h(lkVar));
                mo63560d();
            } else {
                Log.m105921e("MicroMsg.BrandService.BizSearchResultAdapter", "The type(%d) do not exist.", Long.valueOf(lkVar.f137468d));
                return;
            }
            MMHandlerThread.postToMainThread(this.f128460f);
            return;
        }
        Log.m105920e("MicroMsg.BrandService.BizSearchResultAdapter", "The content or content.ItemList is null or the mode do not support to append data.");
    }

    /* renamed from: g */
    public void mo63562g() {
        mo63570n((String) null, (List<C50274lk>) null);
        this.f109236q = 0;
    }

    public int getCount() {
        return this.f109230h;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return getItem(i);
    }

    /* renamed from: h */
    public final C40659a mo63565h(C50274lk lkVar) {
        C40659a aVar = new C40659a();
        LinkedList linkedList = new LinkedList();
        aVar.f109246h = linkedList;
        linkedList.add(lkVar);
        aVar.f109239a = lkVar.f137468d;
        aVar.f109240b = lkVar.f137472h.size();
        aVar.f109241c = lkVar.f137469e;
        LinkedList linkedList2 = new LinkedList();
        aVar.f109243e = linkedList2;
        linkedList2.addAll(lkVar.f137472h);
        aVar.f109242d = lkVar.f137471g;
        aVar.f109244f = this.f109235p;
        aVar.f109245g = this.f109234o && aVar.f109241c != 0;
        return aVar;
    }

    /* renamed from: i */
    public C50274lk mo63566i(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < ((ArrayList) this.f109229g).size(); i3++) {
            C40659a aVar = (C40659a) ((ArrayList) this.f109229g).get(i3);
            int l = mo63569l(aVar);
            i2 += l;
            if (i < i2) {
                int i4 = (i2 - l) + (aVar.f109244f ? 1 : 0);
                for (int i5 = 0; i5 < aVar.f109246h.size(); i5++) {
                    C50274lk lkVar = aVar.f109246h.get(i5);
                    i4 += lkVar.f137472h.size();
                    if (i < i4) {
                        return lkVar;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: j */
    public final C40659a mo63567j(long j) {
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) this.f109229g).size()) {
                i = -1;
                break;
            } else if (((C40659a) ((ArrayList) this.f109229g).get(i)).f109239a == j) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return (C40659a) ((ArrayList) this.f109229g).get(i);
        }
        return null;
    }

    /* renamed from: k */
    public C40659a mo63568k(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < ((ArrayList) this.f109229g).size(); i3++) {
            C40659a aVar = (C40659a) ((ArrayList) this.f109229g).get(i3);
            i2 += mo63569l(aVar);
            if (i < i2) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final int mo63569l(C40659a aVar) {
        if (aVar == null) {
            return 0;
        }
        return (aVar.f109245g ? 1 : 0) + aVar.f109240b + (aVar.f109244f ? 1 : 0);
    }

    /* renamed from: n */
    public void mo63570n(String str, List<C50274lk> list) {
        LinkedList<C51256sk> linkedList;
        ((ArrayList) this.f109229g).clear();
        this.f128458d.clear();
        MMHandlerThread.postToMainThread(this.f128460f);
        this.f109230h = 0;
        this.f109232j = str;
        if (list != null) {
            this.f109236q = (int) (System.currentTimeMillis() / 1000);
            for (int i = 0; i < list.size(); i++) {
                C50274lk lkVar = list.get(i);
                if (!(lkVar == null || (linkedList = lkVar.f137472h) == null || linkedList.size() <= 0)) {
                    C40659a h = mo63565h(lkVar);
                    this.f109230h += mo63569l(h);
                    ((ArrayList) this.f109229g).add(h);
                    Log.m105925i("MicroMsg.BrandService.BizSearchResultAdapter", "type(%d) , count(%d) , offset(%d)", Long.valueOf(h.f109239a), Integer.valueOf(h.f109240b), Integer.valueOf(this.f109230h));
                }
            }
            mo63560d();
        }
        MMHandlerThread.postToMainThread(this.f128460f);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
