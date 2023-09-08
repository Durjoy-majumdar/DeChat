package b03;

import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lz2.C34452l;
import p823sg.C90193h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import su0.C13781a;
import uz2.C52676d1;
import uz2.C52679e1;
import uz2.C52700n;
import uz2.C52703o;
import z04.C119027c;

/* renamed from: b03.g */
public final class C39697g {

    /* renamed from: a */
    public static final C39697g f106502a = new C39697g();

    /* renamed from: b */
    public static final String f106503b;

    /* renamed from: c */
    public static final C13601g f106504c = C36568h.m40985a(C39700c.f106510d);

    /* renamed from: d */
    public static C52703o f106505d;

    /* renamed from: e */
    public static final C13601g f106506e = C36568h.m40985a(C39699b.f106509d);

    /* renamed from: f */
    public static final C13601g f106507f = C36568h.m40985a(C39698a.f106508d);

    /* renamed from: b03.g$a */
    public static final class C39698a extends C87413o implements C32224a<C52679e1> {

        /* renamed from: d */
        public static final C39698a f106508d = new C39698a();

        public C39698a() {
            super(0);
        }

        public Object invoke() {
            return IStatusIconHelperKt.m39109a().mo62290b();
        }
    }

    /* renamed from: b03.g$b */
    public static final class C39699b extends C87413o implements C32224a<C52679e1> {

        /* renamed from: d */
        public static final C39699b f106509d = new C39699b();

        public C39699b() {
            super(0);
        }

        public Object invoke() {
            return IStatusIconHelperKt.m39109a().mo62292d();
        }
    }

    /* renamed from: b03.g$c */
    public static final class C39700c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C39700c f106510d = new C39700c();

        public C39700c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV(C39697g.f106503b, 2);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String a = C13781a.m13082a();
        C87412m.m108593f(a, "username()");
        byte[] bytes = a.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        sb.append("RecentStatusInfoStorage");
        f106503b = sb.toString();
    }

    /* renamed from: a */
    public final boolean mo62323a(C34452l lVar) {
        C87412m.m108594g(lVar, "recentStatusInfo");
        C52703o b = mo62324b();
        String str = lVar.f92747d;
        LinkedList<C52700n> linkedList = b.f147170d;
        C87412m.m108593f(linkedList, "list.info_list");
        for (C52700n nVar : linkedList) {
            if (C87412m.m108589b(nVar.f147163d, str) && C87412m.m108589b(lVar.f92748e, nVar.f147165f)) {
                b.f147170d.remove(nVar);
                Object value = ((C36570n) f106504c).getValue();
                C87412m.m108593f(value, "<get-mmkv>(...)");
                ((MultiProcessMMKV) value).encode("MMKV_KEY_RECENT_STATUS_INFO_LIST", b.toByteArray());
                f106505d = b;
                Log.m105924i("MicroMsg.TextStatus.RecentStatusInfoStorage", "deleteShareInfo: " + str + ' ');
                return true;
            }
        }
        Log.m105920e("MicroMsg.TextStatus.RecentStatusInfoStorage", "deleteShareInfo: " + str + " is fail");
        return false;
    }

    /* renamed from: b */
    public final C52703o mo62324b() {
        C52703o oVar = f106505d;
        if (oVar != null) {
            return oVar;
        }
        C52703o oVar2 = new C52703o();
        Object value = ((C36570n) f106504c).getValue();
        C87412m.m108593f(value, "<get-mmkv>(...)");
        byte[] decodeBytes = ((MultiProcessMMKV) value).decodeBytes("MMKV_KEY_RECENT_STATUS_INFO_LIST");
        if (decodeBytes != null) {
            oVar2.parseFrom(decodeBytes);
        }
        f106505d = oVar2;
        return oVar2;
    }

    /* renamed from: c */
    public final List<C34452l> mo62325c() {
        LinkedList<C52700n> linkedList = mo62324b().f147170d;
        ArrayList arrayList = new ArrayList();
        Iterator<C52700n> it = linkedList.iterator();
        C87412m.m108593f(it, "infoList.iterator()");
        while (it.hasNext() && arrayList.size() < 6) {
            C52700n next = it.next();
            C87412m.m108593f(next, "info");
            C52676d1 j = IStatusIconHelperKt.m39109a().mo62298j(next.f147163d);
            boolean z = false;
            if ((C31543z5.m39453c() - next.f147164e < 1209600000) && (C39713l.m42504i((C52679e1) ((C36570n) f106506e).getValue(), next.f147163d) || C39713l.m42504i((C52679e1) ((C36570n) f106507f).getValue(), next.f147163d))) {
                if (j != null && C39713l.m42496a(j)) {
                    z = true;
                }
            }
            if (z) {
                String str = next.f147163d;
                C87412m.m108593f(str, "iconId");
                arrayList.add(new C34452l(str, next.f147165f));
            }
        }
        Log.m105924i("MicroMsg.TextStatus.RecentStatusInfoStorage", "[queryLimit] userNameList size=" + arrayList.size());
        Log.m105924i("MicroMsg.TextStatus.RecentStatusInfoStorage", "[query] list size=" + arrayList.size());
        return arrayList;
    }
}
