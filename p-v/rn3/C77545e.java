package rn3;

import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.transmit.MMCreateChatroomUI;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99681n;

/* renamed from: rn3.e */
public class C77545e extends C74526m1 {

    /* renamed from: n */
    public List<String> f226076n;

    /* renamed from: o */
    public List<C99664b> f226077o;

    /* renamed from: p */
    public List<C77547b> f226078p;

    /* renamed from: q */
    public HashSet<String> f226079q;

    /* renamed from: r */
    public MMHandler f226080r = new MMHandler(Looper.getMainLooper());

    /* renamed from: s */
    public C61173o f226081s = new C77546a();

    /* renamed from: t */
    public int f226082t = 0;

    /* renamed from: rn3.e$a */
    public class C77546a implements C61173o {
        public C77546a() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            C77547b bVar = new C77547b(C77545e.this, (C77546a) null);
            bVar.f226084a = lVar.f32072a.f224468c;
            bVar.f226085b = lVar.f32075d;
            List<C99681n> list = lVar.f32076e;
            bVar.f226089f = list;
            if (list == null || list.size() == 0) {
                C99681n nVar = new C99681n();
                nVar.f292151e = "no_result​";
                ArrayList arrayList = new ArrayList();
                bVar.f226089f = arrayList;
                arrayList.add(nVar);
            }
            ((ArrayList) C77545e.this.f226078p).add(bVar);
            C77545e.this.mo107709u();
        }
    }

    /* renamed from: rn3.e$b */
    public class C77547b {

        /* renamed from: a */
        public String f226084a;

        /* renamed from: b */
        public C99672i f226085b;

        /* renamed from: c */
        public int f226086c = Integer.MAX_VALUE;

        /* renamed from: d */
        public int f226087d = Integer.MAX_VALUE;

        /* renamed from: e */
        public boolean f226088e = true;

        /* renamed from: f */
        public List<C99681n> f226089f;

        /* renamed from: g */
        public String f226090g;

        public C77547b(C77545e eVar, C77546a aVar) {
        }
    }

    public C77545e(C74493g1 g1Var, List<String> list, boolean z, boolean z2, List<String> list2, int i) {
        super(g1Var, list, z, z2, i);
        this.f226076n = list2;
        this.f226078p = new ArrayList();
        this.f226079q = new HashSet<>();
    }

    public int getCount() {
        return this.f226082t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
        if (r4.f292151e.equals("no_result​") == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        r2 = new gl3.C75967t(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        r5 = new gl3.C75939h(r10);
        r5.f222676B = r4;
        r5.f222603z = r3.f226085b;
        r5.f222626w = true;
        r5.f222625v = r2 + 1;
        r2 = r4.f292148b;
        r4 = r4.f292149c;
        r5.f222624u = r2;
        r5.f222623t = r4;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r10 <= r4) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        r2 = (r10 - r4) - 1;
        r4 = r3.f226089f.get(r2);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gl3.C75922b mo7850h(int r10) {
        /*
            r9 = this;
            java.util.List<rn3.e$b> r0 = r9.f226078p
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L_0x000b:
            if (r0 < 0) goto L_0x0092
            java.util.List<rn3.e$b> r3 = r9.f226078p
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r0)
            rn3.e$b r3 = (rn3.C77545e.C77547b) r3
            int r4 = r3.f226086c
            if (r4 != r10) goto L_0x0037
            gl3.r r2 = new gl3.r
            r2.<init>(r10)
            com.tencent.mm.ui.contact.g1 r4 = r9.f219055d
            android.app.Activity r4 = r4.getActivity()
            r5 = 2131835543(0x7f113a97, float:1.9304228E38)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r7 = 0
            java.lang.String r8 = r3.f226084a
            r6[r7] = r8
            java.lang.String r4 = r4.getString(r5, r6)
            r2.f222731x = r4
            goto L_0x0081
        L_0x0037:
            int r5 = r3.f226087d
            if (r5 != r10) goto L_0x004a
            gl3.u r2 = new gl3.u
            r2.<init>(r10)
            r4 = 2131830472(0x7f1126c8, float:1.9293942E38)
            r2.f222762B = r4
            boolean r4 = r3.f226088e
            r2.f222763C = r4
            goto L_0x0081
        L_0x004a:
            if (r10 <= r4) goto L_0x0081
            int r2 = r10 - r4
            int r2 = r2 - r1
            java.util.List<lv1.n> r4 = r3.f226089f
            java.lang.Object r4 = r4.get(r2)
            lv1.n r4 = (lv1.C99681n) r4
            java.lang.String r5 = r4.f292151e
            java.lang.String r6 = "no_result​"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0067
            gl3.t r2 = new gl3.t
            r2.<init>(r10)
            goto L_0x0081
        L_0x0067:
            gl3.h r5 = new gl3.h
            r5.<init>(r10)
            r5.f222676B = r4
            lv1.i r6 = r3.f226085b
            r5.f222603z = r6
            r5.f222626w = r1
            int r2 = r2 + 1
            r5.f222625v = r2
            int r2 = r4.f292148b
            int r4 = r4.f292149c
            r5.f222624u = r2
            r5.f222623t = r4
            r2 = r5
        L_0x0081:
            if (r2 == 0) goto L_0x008e
            java.lang.String r10 = r3.f226084a
            r2.f222619p = r10
            int r10 = r9.f219059h
            r2.f222622s = r10
            r2.f222608e = r1
            goto L_0x0092
        L_0x008e:
            int r0 = r0 + -1
            goto L_0x000b
        L_0x0092:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rn3.C77545e.mo7850h(int):gl3.b");
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Iterator it = ((ArrayList) this.f226077o).iterator();
        while (it.hasNext()) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki((C99664b) it.next());
        }
    }

    /* renamed from: l */
    public boolean mo103531l(AdapterView<?> adapterView, View view, int i, long j) {
        return mo107708t(i);
    }

    /* renamed from: s */
    public List<String> mo107707s() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f226078p).iterator();
        while (it.hasNext()) {
            C77547b bVar = (C77547b) it.next();
            if (!Util.isNullOrNil(bVar.f226090g)) {
                hashSet.add(bVar.f226090g);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        return arrayList;
    }

    /* renamed from: t */
    public final boolean mo107708t(int i) {
        int headerViewsCount = i - this.f219055d.mo7831f6().getHeaderViewsCount();
        for (int size = ((ArrayList) this.f226078p).size() - 1; size >= 0; size--) {
            C77547b bVar = (C77547b) ((ArrayList) this.f226078p).get(size);
            C99681n nVar = null;
            if (bVar.f226087d == headerViewsCount) {
                if (bVar.f226088e) {
                    int selectedItemPosition = this.f219055d.mo7831f6().getSelectedItemPosition();
                    bVar.f226088e = false;
                    mo107709u();
                    this.f219055d.mo7831f6().setSelection(selectedItemPosition);
                } else {
                    bVar.f226088e = true;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= bVar.f226089f.size()) {
                            i2 = 0;
                            break;
                        }
                        C99681n nVar2 = bVar.f226089f.get(i2);
                        if (nVar2.f292151e.equals(bVar.f226090g) && i2 > 2) {
                            nVar = nVar2;
                            break;
                        }
                        i2++;
                    }
                    if (nVar != null) {
                        bVar.f226089f.remove(i2);
                        bVar.f226089f.add(0, nVar);
                    }
                    mo107709u();
                    this.f219055d.mo7831f6().setSelection(i);
                }
                notifyDataSetChanged();
                return true;
            }
            int i3 = bVar.f226086c;
            if (headerViewsCount == i3) {
                return true;
            }
            if (i > i3) {
                C99681n nVar3 = bVar.f226089f.get((headerViewsCount - i3) - 1);
                if (nVar3.f292151e.equals("no_result​")) {
                    return true;
                }
                MMCreateChatroomUI mMCreateChatroomUI = (MMCreateChatroomUI) this.f219055d;
                if (!Util.isNullOrNil(bVar.f226090g)) {
                    if (bVar.f226090g.equals(nVar3.f292151e)) {
                        MultiSelectContactView multiSelectContactView = mMCreateChatroomUI.f218609h;
                        String str = bVar.f226090g;
                        if (str != null) {
                            multiSelectContactView.mo100247g(str, false, false);
                        } else {
                            multiSelectContactView.getClass();
                        }
                        this.f226079q.remove(bVar.f226090g);
                        bVar.f226090g = null;
                    } else if (this.f226079q.contains(nVar3.f292151e)) {
                        return true;
                    } else {
                        this.f226079q.remove(bVar.f226090g);
                        MultiSelectContactView multiSelectContactView2 = mMCreateChatroomUI.f218609h;
                        String str2 = bVar.f226090g;
                        if (str2 != null) {
                            multiSelectContactView2.mo100247g(str2, false, false);
                        } else {
                            multiSelectContactView2.getClass();
                        }
                        String str3 = nVar3.f292151e;
                        bVar.f226090g = str3;
                        mMCreateChatroomUI.f218609h.mo100240a(str3, false);
                        this.f226079q.add(bVar.f226090g);
                    }
                } else if (this.f226079q.contains(nVar3.f292151e)) {
                    return true;
                } else {
                    mMCreateChatroomUI.f218609h.mo100240a(nVar3.f292151e, false);
                    String str4 = nVar3.f292151e;
                    bVar.f226090g = str4;
                    this.f226079q.add(str4);
                }
                mMCreateChatroomUI.mo104108k8();
                notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public final void mo107709u() {
        Iterator it = ((ArrayList) this.f226078p).iterator();
        int i = 0;
        while (it.hasNext()) {
            C77547b bVar = (C77547b) it.next();
            if (bVar.f226089f.size() > 0) {
                bVar.f226086c = i;
                int i2 = i + 1;
                if (bVar.f226089f.size() > 3) {
                    int size = bVar.f226088e ? i2 + 3 : i2 + bVar.f226089f.size();
                    bVar.f226087d = size;
                    i = size + 1;
                } else {
                    i = i2 + bVar.f226089f.size();
                }
            }
        }
        this.f226082t = i;
        mo103564g();
        notifyDataSetChanged();
    }
}
