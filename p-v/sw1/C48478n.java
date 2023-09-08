package sw1;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import di3.C7335d;
import java.util.List;
import w10.C53065b;

/* renamed from: sw1.n */
public interface C48478n extends C7335d {

    /* renamed from: sw1.n$c */
    public static class C13790c {

        /* renamed from: a */
        public String f38905a;

        /* renamed from: b */
        public String f38906b;
    }

    /* renamed from: sw1.n$d */
    public interface C13791d {
        /* renamed from: a */
        void mo5391a(C13790c cVar);
    }

    /* renamed from: sw1.n$e */
    public static class C13792e {

        /* renamed from: a */
        public String f38907a;

        /* renamed from: b */
        public String f38908b;

        /* renamed from: c */
        public String f38909c;

        /* renamed from: d */
        public String f38910d;

        /* renamed from: e */
        public long f38911e;

        /* renamed from: f */
        public long f38912f;

        /* renamed from: g */
        public String f38913g;

        /* renamed from: h */
        public String f38914h;

        /* renamed from: i */
        public String f38915i;

        /* renamed from: j */
        public String f38916j;
    }

    /* renamed from: sw1.n$h */
    public static class C13793h {

        /* renamed from: a */
        public String f38917a;

        /* renamed from: b */
        public String f38918b;

        /* renamed from: c */
        public String f38919c;

        /* renamed from: d */
        public String f38920d;

        /* renamed from: e */
        public String f38921e;

        /* renamed from: f */
        public String f38922f;

        /* renamed from: g */
        public int f38923g;

        /* renamed from: h */
        public int f38924h;

        /* renamed from: i */
        public int f38925i;
    }

    /* renamed from: sw1.n$a */
    public interface C48479a {
        /* renamed from: a */
        void mo71895a(C48480b bVar);
    }

    /* renamed from: sw1.n$b */
    public static class C48480b {

        /* renamed from: a */
        public boolean f129683a = false;

        /* renamed from: b */
        public int f129684b = 0;
    }

    /* renamed from: sw1.n$f */
    public interface C48481f {
        /* renamed from: a */
        void mo6931a(String str);

        void onCancel();

        void onSuccess();
    }

    /* renamed from: sw1.n$g */
    public interface C48482g {
        /* renamed from: a */
        void mo5395a(String str);

        void onCancel();

        /* renamed from: v */
        void mo5397v(String str, String str2);
    }

    int Fm0(int i);

    /* renamed from: Go */
    boolean mo65675Go();

    void Jc0();

    /* renamed from: Jw */
    String mo65677Jw(int i);

    /* renamed from: PW */
    int mo65678PW(Context context, String str, String str2);

    /* renamed from: Pf */
    void mo65679Pf(String str);

    List<C13792e> Qj0();

    int Vk0();

    void W20(List<C13793h> list, int i, C48481f fVar);

    void Yd0(Context context, C13793h hVar, C48481f fVar);

    void Zs0(C53065b bVar);

    void ew0(Context context);

    /* renamed from: fa */
    void mo65686fa();

    /* renamed from: jZ */
    void mo65687jZ(int i);

    void jg0(MMFragmentActivity mMFragmentActivity, C13793h hVar, C48481f fVar);

    /* renamed from: kS */
    void mo65689kS();

    /* renamed from: pN */
    void mo65690pN(String str, C13791d dVar);

    /* renamed from: r6 */
    void mo65691r6(Context context, C13793h hVar, C48481f fVar);

    /* renamed from: rR */
    C13792e mo65692rR(String str);

    /* renamed from: rp */
    void mo65693rp(Context context, C13793h hVar, C48482g gVar);

    /* renamed from: tC */
    void mo65694tC(C48479a aVar);

    /* renamed from: x1 */
    void mo65697x1(String str, String str2, String str3);
}
