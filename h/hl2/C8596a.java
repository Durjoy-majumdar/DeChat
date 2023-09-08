package hl2;

import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wl2.C15512b;

/* renamed from: hl2.a */
public final class C8596a {

    /* renamed from: a */
    public static final C13601g f27688a = C36568h.m40985a(C8600d.f27697d);

    /* renamed from: b */
    public static final C13601g f27689b = C36568h.m40985a(C8599c.f27696d);

    /* renamed from: c */
    public static final C13601g f27690c = C36568h.m40985a(C8601e.f27698d);

    /* renamed from: hl2.a$a */
    public static final class C8597a {
    }

    /* renamed from: hl2.a$b */
    public static final class C8598b {

        /* renamed from: a */
        public int f27691a;

        /* renamed from: b */
        public int f27692b;

        /* renamed from: c */
        public String f27693c;

        /* renamed from: d */
        public int f27694d;

        /* renamed from: e */
        public int f27695e;
    }

    /* renamed from: hl2.a$c */
    public static final class C8599c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C8599c f27696d = new C8599c();

        public C8599c() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            int i = 1555200;
            int Qe = hVar != null ? hVar.mo58779Qe(C32735h.C32737c.clicfg_image_ocr_pic_max_size, 1555200) : 1555200;
            if (Qe <= 7372800 && Qe >= 230400) {
                i = Qe;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: hl2.a$d */
    public static final class C8600d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C8600d f27697d = new C8600d();

        public C8600d() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            int i = 1036800;
            int Qe = hVar != null ? hVar.mo58779Qe(C32735h.C32737c.clicfg_image_search_pic_max_size, 1036800) : 1036800;
            if (Qe <= 7372800 && Qe >= 230400) {
                i = Qe;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: hl2.a$e */
    public static final class C8601e extends C87413o implements C32224a<C15512b> {

        /* renamed from: d */
        public static final C8601e f27698d = new C8601e();

        public C8601e() {
            super(0);
        }

        public Object invoke() {
            return new C15512b();
        }
    }

    /* renamed from: a */
    public static final int m8446a(int i) {
        return i != 1 ? i != 3 ? ((Number) ((C36570n) f27688a).getValue()).intValue() : ((Number) ((C36570n) f27689b).getValue()).intValue() : ((Number) ((C36570n) f27688a).getValue()).intValue();
    }
}
