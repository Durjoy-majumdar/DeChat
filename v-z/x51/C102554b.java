package x51;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C96984r2;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p441aq.C92054g;
import te3.C101824o80;
import u61.C101963g;
import w51.C102330b;
import x51.C102562g;

/* renamed from: x51.b */
public abstract class C102554b extends BaseAdapter {

    /* renamed from: d */
    public Context f301965d;

    /* renamed from: e */
    public C102556d f301966e;

    /* renamed from: f */
    public C93108e0.C93110b f301967f;

    /* renamed from: g */
    public volatile boolean f301968g = false;

    /* renamed from: h */
    public int f301969h = 0;

    /* renamed from: i */
    public int f301970i = 0;

    /* renamed from: j */
    public HashMap<String, C102330b> f301971j;

    public C102554b(Context context) {
        this.f301965d = context;
        if (context != null) {
            this.f301971j = new HashMap<>();
        }
    }

    /* renamed from: a */
    public void mo141905a() {
        HashMap<String, C102330b> hashMap = this.f301971j;
        if (hashMap != null) {
            hashMap.clear();
            this.f301971j = null;
        }
        C102556d dVar = this.f301966e;
        if (dVar != null) {
            ArrayList<C102562g> arrayList = dVar.f301972d;
            if (arrayList != null) {
                arrayList.clear();
                dVar.f301972d = null;
            }
            HashMap<String, C96984r2> hashMap2 = dVar.f301973e;
            if (hashMap2 != null) {
                hashMap2.clear();
                dVar.f301973e = null;
            }
            HashMap<String, C96984r2> hashMap3 = dVar.f301974f;
            if (hashMap3 != null) {
                hashMap3.clear();
                dVar.f301974f = null;
            }
            this.f301966e = null;
        }
        this.f301968g = false;
    }

    /* renamed from: b */
    public abstract int mo141896b();

    /* renamed from: d */
    public final String mo142173d(C102562g gVar) {
        if (gVar == null) {
            return null;
        }
        if (gVar.f301982a != C102562g.C102563a.cellset) {
            return gVar.f301983b.f298994d;
        }
        return "" + gVar.f301984c.f297841g + "_cell";
    }

    /* renamed from: f */
    public abstract int mo141897f();

    /* renamed from: g */
    public C102562g getItem(int i) {
        ArrayList<C102562g> arrayList;
        ArrayList<C102562g> arrayList2;
        C102556d dVar = this.f301966e;
        if (dVar == null || (arrayList = dVar.f301972d) == null || arrayList.size() <= i || i < 0 || (arrayList2 = dVar.f301972d) == null) {
            return null;
        }
        return arrayList2.get(i);
    }

    public int getCount() {
        ArrayList<C102562g> arrayList;
        C102556d dVar = this.f301966e;
        if (dVar == null || (arrayList = dVar.f301972d) == null) {
            return 0;
        }
        return arrayList.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102330b bVar = view != null ? (C102330b) view.getTag() : null;
        C102562g g = getItem(i);
        if (bVar == null) {
            bVar = mo141900j(this.f301965d, view);
            view = bVar.f301380D;
            this.f301971j.put(mo142173d(g), bVar);
        } else if (!Util.isNullOrNil(mo142173d(g))) {
            if (this.f301971j.containsValue(bVar)) {
                this.f301971j.remove(bVar.mo141886e());
            }
            this.f301971j.put(mo142173d(g), bVar);
        }
        bVar.f301385e = i;
        bVar.f301384d = g;
        View h = mo141898h(i, view, viewGroup);
        bVar.mo141890i();
        return h;
    }

    /* renamed from: h */
    public abstract View mo141898h(int i, View view, ViewGroup viewGroup);

    /* renamed from: i */
    public abstract int mo141899i();

    /* renamed from: j */
    public abstract C102330b mo141900j(Context context, View view);

    /* renamed from: k */
    public void mo142175k() {
        if (this.f301968g) {
            super.notifyDataSetChanged();
        }
    }

    /* renamed from: l */
    public void mo142176l(C102562g gVar, String str, int i) {
        if (gVar != null && str != null) {
            gVar.mo142189b(i);
            C96984r2 r2Var = this.f301966e.f301973e.get(str);
            if (r2Var != null) {
                r2Var.mo135631a(i);
            }
        }
    }

    /* renamed from: n */
    public abstract void mo141901n(int i);

    public void notifyDataSetChanged() {
        this.f301968g = false;
        C102556d dVar = this.f301966e;
        if (dVar != null) {
            if (dVar.f301972d != null) {
                ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                dVar.f301974f = C30790w2.m39221h().mo57715b().mo142022SE();
                Iterator<C102562g> it = dVar.f301972d.iterator();
                while (it.hasNext()) {
                    C102562g next = it.next();
                    C101824o80 o802 = next.f301983b;
                    if (o802 != null) {
                        if (C101963g.m134218c(o802)) {
                            next.mo142189b(C101963g.m134216a() ? 7 : 3);
                        } else {
                            String str = o802.f298994d;
                            boolean z = dVar.f301975g;
                            C96984r2 r2Var = dVar.f301973e.get(str);
                            HashMap<String, C96984r2> hashMap = dVar.f301974f;
                            next.mo142188a(z, r2Var, hashMap == null ? false : hashMap.containsKey(str));
                        }
                    }
                }
                dVar.mo142180f();
            }
            int i = this.f301969h;
            this.f301969h = i + 1;
            Log.m105919d("MicroMsg.BaseEmojiListAdapter", "xxx data Notify: %d", Integer.valueOf(i));
        }
        int i2 = this.f301970i;
        this.f301970i = i2 + 1;
        Log.m105927v("MicroMsg.BaseEmojiListAdapter", "xxx ui Notify: %d", Integer.valueOf(i2));
        HashMap<String, C102330b> hashMap2 = this.f301971j;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        super.notifyDataSetChanged();
        this.f301968g = true;
    }

    /* renamed from: o */
    public abstract void mo141902o(int i);

    /* renamed from: p */
    public abstract void mo141903p(int i);

    /* renamed from: q */
    public void mo142178q(String str, int i) {
        C102556d dVar;
        if (this.f301971j != null && (dVar = this.f301966e) != null && str != null) {
            C102562g l = dVar.mo142184l(str);
            if (l != null) {
                if (i >= 0 && i < 100) {
                    mo142176l(l, str, 6);
                    l.f301986e = i;
                }
                if (i >= 100) {
                    mo142176l(l, str, 7);
                }
            }
            HashMap<String, C102330b> hashMap = this.f301971j;
            String str2 = null;
            C102330b bVar = hashMap == null ? null : hashMap.get(str);
            if (bVar != null) {
                if (bVar.mo141886e() != null) {
                    str2 = bVar.mo141886e();
                }
                if (str2 != null && str2.equals(str)) {
                    bVar.mo141890i();
                }
            }
        }
    }

    /* renamed from: r */
    public void mo141911r(String str, int i) {
        C102556d dVar;
        if (this.f301971j != null && (dVar = this.f301966e) != null && str != null) {
            C102562g l = dVar.mo142184l(str);
            if (l != null) {
                mo142176l(l, str, i);
            }
            if (!(l == null || this.f301966e == null || l.f301987f != -1)) {
                Log.m105924i("MicroMsg.BaseEmojiListAdapter", "force refresh status");
                C102556d dVar2 = this.f301966e;
                boolean z = dVar2.f301975g;
                C96984r2 r2Var = dVar2.f301973e.get(str);
                HashMap<String, C96984r2> hashMap = this.f301966e.f301974f;
                l.mo142188a(z, r2Var, hashMap == null ? false : hashMap.containsKey(str));
            }
            HashMap<String, C102330b> hashMap2 = this.f301971j;
            String str2 = null;
            C102330b bVar = hashMap2 == null ? null : hashMap2.get(str);
            if (bVar != null) {
                if (bVar.mo141886e() != null) {
                    str2 = bVar.mo141886e();
                }
                if (str2 != null && str2.equals(str)) {
                    bVar.mo141890i();
                }
            }
        }
    }
}
