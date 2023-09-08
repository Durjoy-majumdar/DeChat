package com.tencent.p014mm.p136ui.contact;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gl3.C75921a;
import gl3.C75922b;
import gl3.C75926d;
import gl3.C75934f;
import gl3.C75939h;
import gl3.C75952p;
import gl3.C75957r;
import gl3.C75970u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kv1.C99260q;
import lv1.C99681n;
import p240sx.C77803l;
import p240sx.C77804m;
import p240sx.C77810t;
import p418rx.C77578g;
import p418rx.C77582l;

/* renamed from: com.tencent.mm.ui.contact.q1 */
public class C74551q1 extends C74498h1 implements C77803l {

    /* renamed from: j */
    public C77804m f219151j;

    public C74551q1(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, int i) {
        super(mMBaseSelectContactUI, z, i);
        ((C77582l) ((C77810t) C86312j.m106911c(C77810t.class)).h50()).getClass();
        this.f219151j = new C77578g(this, list);
    }

    /* renamed from: a */
    public C75922b mo103609a(int i) {
        C77578g gVar = (C77578g) this.f219151j;
        int i2 = (i - gVar.f226160f) - 1;
        C75934f fVar = new C75934f(i);
        C99681n nVar = gVar.f226165k.get(i2);
        fVar.f222658B = nVar;
        fVar.f222608e = gVar.f226175u.f219057f;
        fVar.f222626w = true;
        fVar.f222625v = i2 + 1;
        int i3 = nVar.f292148b;
        int i4 = nVar.f292149c;
        fVar.f222624u = i3;
        fVar.f222623t = i4;
        return fVar;
    }

    /* renamed from: b */
    public void mo70171b(String str, boolean z) {
        C74498h1.C44878a aVar = this.f219051i;
        if (aVar != null) {
            aVar.mo62789t6(str, getCount(), z);
        }
    }

    /* renamed from: d */
    public C75922b mo103610d(int i, int i2) {
        C77578g gVar = (C77578g) this.f219151j;
        gVar.getClass();
        C75957r rVar = new C75957r(i2);
        rVar.f222731x = gVar.f226175u.f219055d.getActivity().getResources().getString(i);
        return rVar;
    }

    /* renamed from: f */
    public C75922b mo103611f(int i) {
        C77578g gVar = (C77578g) this.f219151j;
        int i2 = (i - gVar.f226160f) - 1;
        C75926d dVar = new C75926d(i);
        C99681n nVar = gVar.f226165k.get(i2);
        dVar.f222631B = nVar;
        dVar.f222608e = gVar.f226175u.f219057f;
        dVar.f222626w = true;
        dVar.f222625v = i2 + 1;
        int i3 = nVar.f292148b;
        int i4 = nVar.f292149c;
        dVar.f222624u = i3;
        dVar.f222623t = i4;
        return dVar;
    }

    public int getCount() {
        return ((C77578g) this.f219151j).f226180z;
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        C77578g gVar = (C77578g) this.f219151j;
        C75952p pVar = null;
        if (i == gVar.f226155a) {
            C75952p pVar2 = new C75952p(i);
            pVar2.f222626w = true;
            pVar = pVar2;
        } else {
            int i2 = gVar.f226156b;
            if (i == i2) {
                pVar = ((C77803l) gVar.f226175u).mo103610d(C0966R.string.f38, i);
            } else {
                int i3 = gVar.f226157c;
                if (i == i3) {
                    pVar = ((C77803l) gVar.f226175u).mo103610d(C0966R.string.f2r, i);
                } else {
                    int i4 = gVar.f226160f;
                    if (i == i4) {
                        pVar = ((C77803l) gVar.f226175u).mo103610d(C0966R.string.f2q, i);
                    } else {
                        int i5 = gVar.f226163i;
                        if (i == i5) {
                            pVar = ((C77803l) gVar.f226175u).mo103610d(C0966R.string.f2o, i);
                        } else if (i == gVar.f226159e) {
                            boolean z = gVar.f226158d;
                            C75970u uVar = new C75970u(i);
                            uVar.f222762B = C0966R.string.f2r;
                            uVar.f222763C = z;
                            pVar = uVar;
                        } else if (i == gVar.f226162h) {
                            boolean z2 = gVar.f226161g;
                            C75970u uVar2 = new C75970u(i);
                            uVar2.f222762B = C0966R.string.f2q;
                            uVar2.f222763C = z2;
                            pVar = uVar2;
                        } else if (i > i5) {
                            int i6 = (i - i5) - 1;
                            C75939h hVar = new C75939h(i);
                            C99681n nVar = gVar.f226166l.get(i6);
                            hVar.f222676B = nVar;
                            hVar.f222608e = gVar.f226175u.f219057f;
                            hVar.f222626w = true;
                            hVar.f222625v = i6 + 1;
                            int i7 = nVar.f292148b;
                            int i8 = nVar.f292149c;
                            hVar.f222624u = i7;
                            hVar.f222623t = i8;
                            pVar = hVar;
                        } else if (i > i4) {
                            pVar = gVar.f226177w ? ((C77803l) gVar.f226175u).mo103609a(i) : ((C77803l) gVar.f226175u).mo103611f(i);
                        } else if (i > i3) {
                            int i9 = (i - i3) - 1;
                            C75939h hVar2 = new C75939h(i);
                            C99681n nVar2 = (C99681n) ((LinkedList) gVar.f226164j).get(i9);
                            hVar2.f222676B = nVar2;
                            hVar2.f222608e = gVar.f226175u.f219057f;
                            hVar2.f222626w = true;
                            hVar2.f222625v = i9 + 1;
                            int i15 = nVar2.f292148b;
                            int i16 = nVar2.f292149c;
                            hVar2.f222624u = i15;
                            hVar2.f222623t = i16;
                            hVar2.f222606c = gVar.f226172r;
                            hVar2.f222681G = gVar.f226173s;
                            pVar = hVar2;
                        } else if (i <= i2) {
                            Log.m105921e("MicroMsg.MMSearchContactAdapter", "unkown position=%d", Integer.valueOf(i));
                        } else {
                            throw null;
                        }
                    }
                }
            }
        }
        if (pVar != null) {
            pVar.f222619p = gVar.f226168n;
            if (pVar instanceof C75921a) {
                pVar.f222603z = gVar.f226170p;
            }
            pVar.f222622s = gVar.f226175u.f219059h;
        }
        return pVar;
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "finish!");
        mo96748q();
    }

    /* renamed from: l */
    public boolean mo103531l(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        C77578g gVar = (C77578g) this.f219151j;
        int headerViewsCount = i - gVar.f226175u.f219055d.mo7831f6().getHeaderViewsCount();
        if (headerViewsCount == gVar.f226159e) {
            if (gVar.f226158d) {
                int selectedItemPosition = gVar.f226175u.f219055d.mo7831f6().getSelectedItemPosition();
                gVar.f226158d = false;
                gVar.mo107755g(gVar.f226168n, true, false);
                gVar.f226175u.f219055d.mo7831f6().setSelection(selectedItemPosition);
            } else {
                gVar.f226158d = true;
                gVar.mo107755g(gVar.f226168n, true, false);
                gVar.f226175u.f219055d.mo7831f6().setSelection(gVar.f226159e);
            }
        } else if (headerViewsCount != gVar.f226162h) {
            C75922b j2 = gVar.f226175u.getItem(headerViewsCount);
            if (j2 == null || !j2.f222626w || (i2 = gVar.f226155a) == Integer.MAX_VALUE) {
                return false;
            }
            if (j2.f222605b == i2) {
                C44879k3.m49761b(1);
                return false;
            }
            C44879k3.m49761b(0);
            return false;
        } else if (gVar.f226161g) {
            int selectedItemPosition2 = gVar.f226175u.f219055d.mo7831f6().getSelectedItemPosition();
            gVar.f226161g = false;
            gVar.mo107755g(gVar.f226168n, true, false);
            gVar.f226175u.f219055d.mo7831f6().setSelection(selectedItemPosition2);
        } else {
            gVar.f226161g = true;
            gVar.mo107755g(gVar.f226168n, true, false);
            gVar.f226175u.f219055d.mo7831f6().setSelection(gVar.f226162h);
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo70169n(C75922b bVar) {
        C77578g gVar = (C77578g) this.f219151j;
        gVar.getClass();
        int i = bVar.f222605b + 1;
        int[] iArr = {gVar.f226156b, gVar.f226157c, gVar.f226160f, gVar.f226163i};
        for (int i2 = 0; i2 < 4; i2++) {
            if (i == iArr[i2]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo96748q() {
        ((C77578g) this.f219151j).mo107754f();
    }

    /* renamed from: r */
    public void mo63130r(String str, int[] iArr, boolean z) {
        C77578g gVar = (C77578g) this.f219151j;
        if (gVar.f226167m != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(gVar.f226167m);
            gVar.f226167m = null;
        }
        gVar.f226168n = str;
        ((ArrayList) gVar.f226169o).clear();
        for (int valueOf : iArr) {
            ((ArrayList) gVar.f226169o).add(Integer.valueOf(valueOf));
        }
        Log.m105925i("MicroMsg.MMSearchContactAdapter", "doSearch: query=%s", gVar.f226168n);
        gVar.mo107752d();
    }

    public C74551q1(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, int i, boolean z2, int i2) {
        super(mMBaseSelectContactUI, z, i);
        ((C77582l) ((C77810t) C86312j.m106911c(C77810t.class)).h50()).getClass();
        this.f219151j = new C77578g((C74498h1) this, list, z2, i2);
    }

    public C74551q1(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, int i, boolean z2, boolean z3) {
        super(mMBaseSelectContactUI, z, i);
        ((C77582l) ((C77810t) C86312j.m106911c(C77810t.class)).h50()).getClass();
        this.f219151j = new C77578g((C74498h1) this, list, z2, z3);
    }
}
