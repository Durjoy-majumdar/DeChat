package u40;

import java.util.Arrays;
import nm0.C11221d;

/* renamed from: u40.h */
public final class C90609h {

    /* renamed from: a */
    public static C90608g f260328a = new C90610a();

    /* renamed from: u40.h$a */
    public static final class C90610a implements C90608g {
        /* renamed from: a */
        public void mo122635a(int i, int i2, int i3) {
            mo124755c("idKeyReport");
        }

        /* renamed from: b */
        public void mo122636b(int i, String str) {
            mo124755c(C11221d.NAME);
        }

        /* renamed from: c */
        public final void mo124755c(String str) {
            Object[] objArr = new Object[0];
            C37340f.f98736a.mo61043e("WebRTC.ReportDelegate", "Should not invoke " + str + " in default way!", Arrays.copyOf(objArr, objArr.length));
        }
    }
}
