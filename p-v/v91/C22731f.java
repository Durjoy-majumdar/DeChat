package v91;

import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C22507la3;
import te3.C64549ma3;
import te3.C64574na3;

/* renamed from: v91.f */
public final class C22731f {

    /* renamed from: a */
    public static final C22732a f65379a = new C22732a();

    /* renamed from: v91.f$a */
    public static final class C22732a {
        /* renamed from: a */
        public final C64574na3 mo35816a() {
            byte[] a = C116850b.m164831a("hell_pge_sttics_d_1");
            if (a == null) {
                return null;
            }
            if (a.length == 0) {
                return null;
            }
            C64574na3 na32 = new C64574na3();
            try {
                na32.parseFrom(a);
                return na32;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.PageStatisticsDao", e, "_read, exception: " + e.getMessage(), new Object[0]);
                return null;
            }
        }

        /* renamed from: b */
        public final C64574na3 mo35817b() {
            byte[] a = C116850b.m164831a("hell_pge_sttics_d_3");
            if (a == null) {
                return null;
            }
            if (a.length == 0) {
                return null;
            }
            C64574na3 na32 = new C64574na3();
            try {
                na32.parseFrom(a);
                return na32;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.PageStatisticsDao", e, "_readWith78Event, exception: " + e.getMessage(), new Object[0]);
                return null;
            }
        }

        /* renamed from: c */
        public final void mo35818c(C64574na3 na32) {
            try {
                C116850b.m164834d("hell_pge_sttics_d_1", na32.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.PageStatisticsDao", e, "_write, exception: " + e.getMessage(), new Object[0]);
            }
        }

        /* renamed from: d */
        public final void mo35819d(C64574na3 na32) {
            try {
                C116850b.m164834d("hell_pge_sttics_d_3", na32.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.PageStatisticsDao", e, "_writeWith78Event, exception: " + e.getMessage(), new Object[0]);
            }
        }

        /* renamed from: e */
        public final synchronized C22507la3 mo35820e() {
            C64574na3 a = mo35816a();
            if (a == null) {
                return null;
            }
            if (a.f184449d.isEmpty()) {
                return null;
            }
            return a.f184449d.getLast().f184257e;
        }

        /* renamed from: f */
        public final synchronized C22507la3 mo35821f() {
            C64574na3 b = mo35817b();
            if (b == null) {
                return null;
            }
            if (b.f184449d.isEmpty()) {
                return null;
            }
            return b.f184449d.getLast().f184257e;
        }

        /* renamed from: g */
        public final synchronized C22507la3 mo35822g(String str, int i) {
            if (str == null) {
                return null;
            }
            C64574na3 a = mo35816a();
            if (a == null) {
                return null;
            }
            String str2 = str + i;
            LinkedList<C64549ma3> linkedList = a.f184449d;
            C87412m.m108593f(linkedList, "pageMap.map");
            for (C64549ma3 ma32 : linkedList) {
                if (C87412m.m108589b(str2, ma32.f184256d)) {
                    return ma32.f184257e;
                }
            }
            return null;
        }

        /* renamed from: h */
        public final synchronized C22507la3 mo35823h(String str, int i) {
            if (str == null) {
                return null;
            }
            C64574na3 b = mo35817b();
            if (b == null) {
                return null;
            }
            String str2 = str + i;
            LinkedList<C64549ma3> linkedList = b.f184449d;
            C87412m.m108593f(linkedList, "pageMap.map");
            for (C64549ma3 ma32 : linkedList) {
                if (C87412m.m108589b(str2, ma32.f184256d)) {
                    return ma32.f184257e;
                }
            }
            return null;
        }

        /* renamed from: i */
        public final synchronized void mo35824i() {
            if (C116711b.m164589n()) {
                Log.m105924i("HABBYGE-MALI.PageStatisticsDao", "resetWith78Event");
                C116850b.m164834d("hell_pge_sttics_d_3", new byte[0]);
            }
        }

        /* renamed from: j */
        public final synchronized void mo35825j(C22507la3 la32) {
            C87412m.m108594g(la32, "statics");
            C64574na3 a = mo35816a();
            if (a == null) {
                a = new C64574na3();
            }
            String str = la32.f64160e + la32.f64161f;
            boolean z = false;
            LinkedList<C64549ma3> linkedList = a.f184449d;
            C87412m.m108593f(linkedList, "pageMap.map");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C64549ma3 ma32 = (C64549ma3) it.next();
                if (C87412m.m108589b(str, ma32.f184256d)) {
                    ma32.f184257e = la32;
                    z = true;
                    break;
                }
            }
            if (!z) {
                C64549ma3 ma33 = new C64549ma3();
                ma33.f184256d = str;
                ma33.f184257e = la32;
                a.f184449d.add(ma33);
            }
            mo35818c(a);
        }

        /* renamed from: k */
        public final synchronized void mo35826k(C22507la3 la32) {
            C87412m.m108594g(la32, "statics");
            C64574na3 b = mo35817b();
            if (b == null) {
                b = new C64574na3();
            }
            String str = la32.f64160e + la32.f64161f;
            boolean z = false;
            LinkedList<C64549ma3> linkedList = b.f184449d;
            C87412m.m108593f(linkedList, "pageMap.map");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C64549ma3 ma32 = (C64549ma3) it.next();
                if (C87412m.m108589b(str, ma32.f184256d)) {
                    ma32.f184257e = la32;
                    z = true;
                    break;
                }
            }
            if (!z) {
                C64549ma3 ma33 = new C64549ma3();
                ma33.f184256d = str;
                ma33.f184257e = la32;
                b.f184449d.add(ma33);
            }
            mo35819d(b);
        }
    }
}
