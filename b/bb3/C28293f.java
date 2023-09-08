package bb3;

import bp3.C104160f;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import rx3.C36568h;

/* renamed from: bb3.f */
public final class C28293f {

    /* renamed from: a */
    public static final C28293f f77884a = new C28293f();

    /* renamed from: bb3.f$a */
    public static final class C28294a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C28294a f77885d = new C28294a();

        public C28294a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_note_ignore_handlep_append_and, C104160f.RepairerConfig_Fav_NoteIgnoreHandlePAppend_Int, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        C36568h.m40985a(C28294a.f77885d);
    }

    /* renamed from: a */
    public final boolean mo55909a() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_fav_small_pic_mode_and, C104160f.RepairerConfig_Fav_SmallPicMode_Int, 1) == 1;
    }
}
