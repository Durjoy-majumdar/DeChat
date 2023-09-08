package p418rx;

import android.os.Looper;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74554r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99681n;
import nv1.C100218a;
import nv1.C100219b;
import p240sx.C77803l;
import p240sx.C77804m;
import p240sx.C77805n;

/* renamed from: rx.g */
public class C77578g implements C77804m, C77805n {

    /* renamed from: a */
    public int f226155a;

    /* renamed from: b */
    public int f226156b;

    /* renamed from: c */
    public int f226157c;

    /* renamed from: d */
    public boolean f226158d;

    /* renamed from: e */
    public int f226159e;

    /* renamed from: f */
    public int f226160f;

    /* renamed from: g */
    public boolean f226161g;

    /* renamed from: h */
    public int f226162h;

    /* renamed from: i */
    public int f226163i;

    /* renamed from: j */
    public List<C99681n> f226164j;

    /* renamed from: k */
    public List<C99681n> f226165k;

    /* renamed from: l */
    public List<C99681n> f226166l;

    /* renamed from: m */
    public C99664b f226167m;

    /* renamed from: n */
    public String f226168n;

    /* renamed from: o */
    public List<Integer> f226169o;

    /* renamed from: p */
    public C99672i f226170p;

    /* renamed from: q */
    public List<String> f226171q;

    /* renamed from: r */
    public boolean f226172r;

    /* renamed from: s */
    public boolean f226173s;

    /* renamed from: t */
    public boolean f226174t;

    /* renamed from: u */
    public C74498h1 f226175u;

    /* renamed from: v */
    public C77805n.C77806a f226176v;

    /* renamed from: w */
    public boolean f226177w;

    /* renamed from: x */
    public MMHandler f226178x;

    /* renamed from: y */
    public final C61173o f226179y;

    /* renamed from: z */
    public int f226180z;

    /* renamed from: rx.g$a */
    public class C77579a implements C61173o {
        public C77579a() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            C99664b bVar;
            int i = lVar.f32074c;
            if (i == -3 || i == -2 || i == -1) {
                if (lVar.f32072a.f224468c.equals(C77578g.this.f226168n)) {
                    C77578g.this.mo107752d();
                }
            } else if (i == 0 && (bVar = C77578g.this.f226167m) != null && bVar.equals(bVar)) {
                C77578g gVar = C77578g.this;
                gVar.f226170p = lVar.f32075d;
                List<C99681n> list = lVar.f32076e;
                if (gVar.f226171q != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C99681n nVar = list.get(size);
                        if (!gVar.f226171q.contains(nVar.f292151e)) {
                            int i2 = nVar.f292148b;
                            if (i2 == 131072 || i2 == 131075 || i2 == 131076 || i2 == 131081) {
                            }
                        }
                        list.remove(size);
                    }
                }
                C77805n.C77806a aVar = gVar.f226176v;
                if (aVar != null) {
                    C74554r1.C74555a aVar2 = (C74554r1.C74555a) aVar;
                    if (C74554r1.this.f219153n.size() > 0) {
                        int size2 = list.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            } else if (!C74554r1.this.f219153n.contains(list.get(size2).f292151e)) {
                                list.remove(size2);
                            }
                        }
                    }
                }
                int[] iArr = lVar.f32072a.f224472g;
                int i3 = (iArr == null || iArr.length <= 0) ? 0 : iArr[0];
                if (lVar.f32076e.size() <= 0) {
                    switch (i3) {
                        case 131072:
                        case 131081:
                            C77578g.m93564c(C77578g.this, (List) null, i3);
                            break;
                        case 131075:
                            C77578g.this.f226165k = null;
                            break;
                        case StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON /*131076*/:
                            C77578g.this.f226166l = null;
                            break;
                    }
                } else {
                    switch (i3) {
                        case 131072:
                        case 131081:
                            C77578g.m93564c(C77578g.this, lVar.f32076e, i3);
                            break;
                        case 131075:
                            C77578g gVar2 = C77578g.this;
                            List<C99681n> list2 = lVar.f32076e;
                            if (gVar2.f226174t && !Util.isNullOrNil((List) list2)) {
                                int size3 = list2.size();
                                for (int size4 = list2.size() - 1; size4 >= 0; size4--) {
                                    if (C45628s0.m50735A(list2.get(size4).f292151e)) {
                                        list2.remove(size4);
                                    }
                                }
                                Log.m105925i("MicroMsg.MMSearchContactAdapter", "checkFilterAssociateChatRoom: originCount:%d, final count:%d", Integer.valueOf(size3), Integer.valueOf(list2.size()));
                            }
                            C77578g.this.f226165k = lVar.f32076e;
                            break;
                        case StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON /*131076*/:
                            C77578g.this.f226166l = lVar.f32076e;
                            break;
                        default:
                            Log.m105924i("MicroMsg.MMSearchContactAdapter", "not support search");
                            break;
                    }
                }
                C77578g.this.mo107755g(lVar.f32072a.f224468c, C77578g.this.mo107752d(), true);
            }
        }
    }

    public C77578g(C74498h1 h1Var, List<String> list) {
        this.f226155a = Integer.MAX_VALUE;
        this.f226156b = Integer.MAX_VALUE;
        this.f226157c = Integer.MAX_VALUE;
        this.f226158d = true;
        this.f226159e = Integer.MAX_VALUE;
        this.f226160f = Integer.MAX_VALUE;
        this.f226161g = true;
        this.f226162h = Integer.MAX_VALUE;
        this.f226163i = Integer.MAX_VALUE;
        this.f226164j = null;
        this.f226165k = null;
        this.f226166l = null;
        this.f226172r = false;
        this.f226173s = false;
        this.f226174t = false;
        this.f226178x = new MMHandler(Looper.getMainLooper());
        this.f226179y = new C77579a();
        this.f226180z = 0;
        this.f226175u = h1Var;
        mo107753e(list);
    }

    /* renamed from: c */
    public static void m93564c(C77578g gVar, List list, int i) {
        if (gVar.f226164j == null) {
            gVar.f226164j = new LinkedList();
        }
        Iterator<C99681n> it = gVar.f226164j.iterator();
        while (it.hasNext()) {
            if (it.next().f292148b == i) {
                it.remove();
            }
        }
        if (list != null) {
            gVar.f226164j.addAll(list);
        }
    }

    /* renamed from: a */
    public void mo107750a(C77805n.C77806a aVar) {
        this.f226176v = aVar;
    }

    /* renamed from: b */
    public List<C99681n> mo107751b() {
        return this.f226165k;
    }

    /* renamed from: d */
    public final boolean mo107752d() {
        if (((ArrayList) this.f226169o).size() <= 0) {
            return true;
        }
        HashSet<String> hashSet = new HashSet<>();
        int intValue = ((Integer) ((ArrayList) this.f226169o).remove(0)).intValue();
        C76728k kVar = new C76728k();
        kVar.f224468c = this.f226168n;
        kVar.f224472g = new int[]{intValue};
        kVar.f224475j = hashSet;
        kVar.f224478m = this.f226179y;
        kVar.f224479n = this.f226178x;
        if (intValue == 131075) {
            kVar.f224467b = 32;
            kVar.f224477l = C100218a.f293644d;
        } else {
            kVar.f224467b = 16;
            kVar.f224477l = C100219b.f293645d;
        }
        this.f226167m = ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
        return false;
    }

    /* renamed from: e */
    public final void mo107753e(List<String> list) {
        this.f226171q = list;
        this.f226169o = new ArrayList();
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "Create!");
        mo107754f();
    }

    /* renamed from: f */
    public void mo107754f() {
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "initData!");
        this.f226168n = null;
        this.f226156b = Integer.MAX_VALUE;
        this.f226157c = Integer.MAX_VALUE;
        this.f226158d = true;
        this.f226159e = Integer.MAX_VALUE;
        this.f226160f = Integer.MAX_VALUE;
        this.f226161g = true;
        this.f226162h = Integer.MAX_VALUE;
        this.f226163i = Integer.MAX_VALUE;
        this.f226164j = null;
        this.f226165k = null;
        this.f226166l = null;
        this.f226170p = null;
        this.f226175u.mo103564g();
        this.f226175u.notifyDataSetChanged();
        if (this.f226167m != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f226167m);
            this.f226167m = null;
        }
        this.f226175u.mo103564g();
    }

    /* renamed from: g */
    public final void mo107755g(String str, boolean z, boolean z2) {
        int i;
        int i2;
        List<C99681n> list = this.f226164j;
        int size = list == null ? 0 : ((LinkedList) list).size();
        List<C99681n> list2 = this.f226165k;
        int size2 = list2 == null ? 0 : list2.size();
        List<C99681n> list3 = this.f226166l;
        int size3 = list3 == null ? 0 : list3.size();
        this.f226156b = Integer.MAX_VALUE;
        if (size > 0) {
            this.f226157c = 0;
            if (size <= 3 || (size2 <= 0 && size3 <= 0)) {
                this.f226159e = Integer.MAX_VALUE;
                i = 0 + size + 1;
            } else {
                int i3 = 4;
                if (this.f226158d) {
                    this.f226159e = 4;
                } else {
                    i3 = 0 + size + 1;
                    this.f226159e = i3;
                }
                i = i3 + 1;
            }
        } else {
            this.f226157c = Integer.MAX_VALUE;
            i = 0;
        }
        C99672i iVar = this.f226170p;
        if (iVar == null || iVar.f292122c.length <= 1 || this.f226175u.f219057f) {
            this.f226155a = Integer.MAX_VALUE;
        } else {
            this.f226155a = i;
            i++;
        }
        if (size2 > 0) {
            this.f226160f = i;
            if (size2 <= 3 || size3 <= 0) {
                this.f226162h = Integer.MAX_VALUE;
                i += size2 + 1;
            } else {
                if (this.f226161g) {
                    i2 = i + 4;
                    this.f226162h = i2;
                } else {
                    i2 = i + size2 + 1;
                    this.f226162h = i2;
                }
                i = i2 + 1;
            }
        } else {
            this.f226160f = Integer.MAX_VALUE;
        }
        if (size3 > 0) {
            this.f226163i = i;
            i += size3 + 1;
        } else {
            this.f226163i = Integer.MAX_VALUE;
        }
        Log.m105925i("MicroMsg.MMSearchContactAdapter", "setCount %d", Integer.valueOf(i));
        this.f226180z = i;
        if (z2) {
            ((C77803l) this.f226175u).mo70171b(str, z);
        }
        this.f226175u.mo103564g();
        this.f226175u.notifyDataSetChanged();
    }

    public C77578g(C74498h1 h1Var, List<String> list, boolean z, int i) {
        this.f226155a = Integer.MAX_VALUE;
        this.f226156b = Integer.MAX_VALUE;
        this.f226157c = Integer.MAX_VALUE;
        boolean z2 = true;
        this.f226158d = true;
        this.f226159e = Integer.MAX_VALUE;
        this.f226160f = Integer.MAX_VALUE;
        this.f226161g = true;
        this.f226162h = Integer.MAX_VALUE;
        this.f226163i = Integer.MAX_VALUE;
        this.f226164j = null;
        this.f226165k = null;
        this.f226166l = null;
        this.f226172r = false;
        this.f226173s = false;
        this.f226174t = false;
        this.f226178x = new MMHandler(Looper.getMainLooper());
        this.f226179y = new C77579a();
        this.f226180z = 0;
        this.f226175u = h1Var;
        this.f226172r = z;
        this.f226173s = i != 1 ? false : z2;
        mo107753e(list);
    }

    public C77578g(C74498h1 h1Var, List<String> list, boolean z, boolean z2) {
        this.f226155a = Integer.MAX_VALUE;
        this.f226156b = Integer.MAX_VALUE;
        this.f226157c = Integer.MAX_VALUE;
        this.f226158d = true;
        this.f226159e = Integer.MAX_VALUE;
        this.f226160f = Integer.MAX_VALUE;
        this.f226161g = true;
        this.f226162h = Integer.MAX_VALUE;
        this.f226163i = Integer.MAX_VALUE;
        this.f226164j = null;
        this.f226165k = null;
        this.f226166l = null;
        this.f226172r = false;
        this.f226173s = false;
        this.f226174t = false;
        this.f226178x = new MMHandler(Looper.getMainLooper());
        this.f226179y = new C77579a();
        this.f226180z = 0;
        this.f226175u = h1Var;
        this.f226172r = z;
        mo107753e(list);
        this.f226177w = z2;
    }
}
