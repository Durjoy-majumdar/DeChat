package w82;

import android.text.TextUtils;
import as3.C103898r0;
import as3.C103900s0;
import c92.C104327a;
import c92.C104331h;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105712v1;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import v82.C111456j0;

/* renamed from: w82.k */
public final class C111770k {

    /* renamed from: a */
    public final C111456j0 f334704a;

    /* renamed from: b */
    public C32224a<C13598b0> f334705b = C111771a.f334713d;

    /* renamed from: c */
    public final List<C105882d> f334706c;

    /* renamed from: d */
    public final List<C105882d> f334707d;

    /* renamed from: e */
    public boolean f334708e;

    /* renamed from: f */
    public boolean f334709f;

    /* renamed from: g */
    public final C13601g f334710g;

    /* renamed from: h */
    public final List<String> f334711h;

    /* renamed from: i */
    public String f334712i;

    /* renamed from: w82.k$a */
    public static final class C111771a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C111771a f334713d = new C111771a();

        public C111771a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: w82.k$b */
    public static final class C111772b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C111772b f334714d = new C111772b();

        public C111772b() {
            super(0);
        }

        public Object invoke() {
            String s = C75592q0.m90789s();
            return s == null ? "" : s;
        }
    }

    public C111770k(C111456j0 j0Var) {
        C87412m.m108594g(j0Var, "multiTalkNewTalkingUILogic");
        this.f334704a = j0Var;
        ArrayList arrayList = new ArrayList();
        this.f334706c = arrayList;
        this.f334707d = arrayList;
        this.f334710g = C36568h.m40985a(C111772b.f334714d);
        this.f334711h = new ArrayList();
    }

    /* renamed from: b */
    public static final void m152391b(C111770k kVar, C8477a0 a0Var, List<C105882d> list) {
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "response list change");
        ArrayList arrayList = (ArrayList) kVar.f334706c;
        arrayList.clear();
        arrayList.addAll(list);
        boolean z = a0Var.f27482d;
        if (z != kVar.f334708e) {
            kVar.f334709f = true;
            kVar.f334708e = z;
        }
        kVar.f334705b.invoke();
    }

    /* renamed from: a */
    public final void mo163504a(Set<String> set, String str) {
        C87412m.m108594g(set, "visibleUser");
        List<C105882d> list = this.f334707d;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C105882d dVar = (C105882d) next;
            if (dVar.f314929d || dVar.mo150900a()) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((C105882d) it4.next()).f314927b);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            String str2 = (String) next2;
            if (set.contains(str2) && !C87412m.m108589b(str2, (String) ((C36570n) this.f334710g).getValue())) {
                arrayList3.add(next2);
            }
        }
        if (arrayList3.size() == ((ArrayList) this.f334711h).size() && C87412m.m108589b(str, this.f334712i) && !this.f334709f) {
            boolean z2 = !C87412m.m108589b(str, this.f334712i);
            if (!z2) {
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    if (!((ArrayList) this.f334711h).contains((String) it6.next())) {
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                return;
            }
        }
        this.f334712i = str;
        ((ArrayList) this.f334711h).clear();
        ((ArrayList) this.f334711h).addAll(arrayList3);
        Log.m105924i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "onVisibleUserChanged: visibleUser " + set + ", videoUser " + arrayList3 + ", " + str + ", forceRefresh " + this.f334709f);
        this.f334709f = false;
        MultiTalkManager zx02 = C105851w0.zx0();
        ArrayList arrayList4 = new ArrayList();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            Object next3 = it7.next();
            if (!C87412m.m108589b((String) next3, str)) {
                arrayList4.add(next3);
            }
        }
        Set D0 = C110818d0.m150904D0(arrayList4);
        if (zx02.mo150680v()) {
            ArrayList arrayList5 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                arrayList5.add(str);
            }
            C105724z zVar = C105724z.INSTANCE;
            ArrayList arrayList6 = new ArrayList(D0);
            zVar.getClass();
            zVar.mo150614x(new C105712v1(zVar, arrayList6, arrayList5));
            return;
        }
        HashSet hashSet = new HashSet(D0);
        if (str != null) {
            hashSet.add(str);
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            String str3 = (String) it8.next();
            Iterator it9 = ((ArrayList) zx02.f314504r).iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                C103900s0 s0Var = (C103900s0) it9.next();
                if (str3.equals(s0Var.f307156c)) {
                    if (s0Var.f307159f == 101) {
                        arrayList8.add(s0Var.f307156c);
                    } else {
                        arrayList7.add(s0Var.f307156c);
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (int i = 0; i < arrayList7.size(); i++) {
            C103898r0 r0Var = new C103898r0();
            r0Var.f307152b = C104331h.m139311c((String) arrayList7.get(i));
            arrayList9.add(r0Var);
        }
        for (int i2 = 0; i2 < arrayList8.size(); i2++) {
            C103898r0 r0Var2 = new C103898r0();
            r0Var2.f307152b = C104331h.m139311c((String) arrayList8.get(i2));
            arrayList9.add(r0Var2);
        }
        if (arrayList8.contains(str)) {
            zx02.mo150649Z(arrayList9);
            zx02.mo150653b0(str, false);
        } else if (!TextUtils.isEmpty(str)) {
            zx02.mo150649Z(arrayList9);
            zx02.mo150651a0(str);
            C104327a.f308804a.mo146023b(true, C104331h.m139311c(str));
        } else if (zx02.f314481T0 != -1) {
            C104327a.f308804a.mo146023b(false, -1);
            zx02.mo150653b0((String) null, true);
            zx02.mo150649Z(arrayList9);
        }
    }
}
