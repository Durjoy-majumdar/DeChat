package l91;

import gy3.C87412m;
import h81.C20928j;
import j20.C21153d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l91.a */
public final class C21398a {

    /* renamed from: a */
    public static final C21398a f60538a = new C21398a();

    /* renamed from: b */
    public static boolean f60539b;

    /* renamed from: c */
    public static boolean f60540c;

    /* renamed from: d */
    public static boolean f60541d;

    /* renamed from: e */
    public static List<C21408i> f60542e = new ArrayList();

    /* renamed from: f */
    public static List<C20928j.C20932d> f60543f = new ArrayList();

    /* renamed from: g */
    public static final C21399a f60544g = new C21399a();

    /* renamed from: l91.a$a */
    public static final class C21399a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (C87412m.m108589b(str, "com/tencent/mm/ui/chatting/ChattingUIFragment") && str2 != null) {
                switch (str2.hashCode()) {
                    case -1799985168:
                        if (str2.equals("onEnterBegin") && C87412m.m108589b(str3, "()V") && !C21398a.f60539b) {
                            synchronized (C21398a.f60538a) {
                                Iterator it = ((ArrayList) C21398a.f60542e).iterator();
                                while (it.hasNext()) {
                                    ((C21408i) it.next()).mo33530d(obj);
                                }
                            }
                            C21398a.f60540c = true;
                            return;
                        }
                        return;
                    case -1427566836:
                        if (str2.equals("onExitBegin") && C87412m.m108589b(str3, "()V") && !C21398a.f60539b) {
                            synchronized (C21398a.f60538a) {
                                Iterator it4 = ((ArrayList) C21398a.f60542e).iterator();
                                while (it4.hasNext()) {
                                    ((C21408i) it4.next()).mo33529c(obj);
                                }
                            }
                            C21398a.f60541d = true;
                            return;
                        }
                        return;
                    case -112389456:
                        if (str2.equals("doAttach") && C87412m.m108589b(str3, "(Landroid/content/Context;)V")) {
                            C21398a.f60539b = true;
                            return;
                        }
                        return;
                    case 20863998:
                        if (str2.equals("onExitEnd") && C87412m.m108589b(str3, "()V")) {
                            C21398a.f60539b = false;
                            for (C20928j.C20932d g : C21398a.f60543f) {
                                g.mo32648g(obj);
                            }
                            return;
                        }
                        return;
                    case 360443032:
                        if (!str2.equals("doResume") || !C87412m.m108589b(str3, "()V") || C21398a.f60539b) {
                            return;
                        }
                        if (!C21398a.f60540c) {
                            synchronized (C21398a.f60538a) {
                                Iterator it5 = ((ArrayList) C21398a.f60542e).iterator();
                                while (it5.hasNext()) {
                                    ((C21408i) it5.next()).mo33527a(obj);
                                }
                            }
                            return;
                        }
                        C21398a.f60540c = false;
                        return;
                    case 1810778155:
                        if (!str2.equals("doPause") || !C87412m.m108589b(str3, "()V") || C21398a.f60539b) {
                            return;
                        }
                        if (!C21398a.f60541d) {
                            synchronized (C21398a.f60538a) {
                                Iterator it6 = ((ArrayList) C21398a.f60542e).iterator();
                                while (it6.hasNext()) {
                                    ((C21408i) it6.next()).mo33528b(obj);
                                }
                            }
                            return;
                        }
                        C21398a.f60541d = false;
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
