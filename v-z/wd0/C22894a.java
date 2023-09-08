package wd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kj2.C117407d;
import sx3.C110818d0;

/* renamed from: wd0.a */
public final class C22894a {

    /* renamed from: a */
    public static final C22894a f65798a = new C22894a();

    /* renamed from: b */
    public static List<Integer> f65799b = new ArrayList();

    /* renamed from: c */
    public static List<Integer> f65800c = new ArrayList();

    /* renamed from: d */
    public static int f65801d;

    /* renamed from: wd0.a$a */
    public static final class C22895a {

        /* renamed from: a */
        public String f65802a = "";

        /* renamed from: b */
        public String f65803b = "";

        /* renamed from: c */
        public String f65804c = "";

        /* renamed from: d */
        public ArrayList<String> f65805d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<Integer> f65806e = new ArrayList<>();

        /* renamed from: f */
        public int f65807f;
    }

    /* renamed from: wd0.a$c */
    public static final class C22896c {

        /* renamed from: a */
        public int f65808a;

        /* renamed from: b */
        public String f65809b = "";

        /* renamed from: c */
        public long f65810c;

        /* renamed from: d */
        public boolean f65811d;

        /* renamed from: e */
        public int f65812e;

        /* renamed from: f */
        public ArrayList<String> f65813f = new ArrayList<>();

        /* renamed from: g */
        public ArrayList<Integer> f65814g = new ArrayList<>();

        /* renamed from: h */
        public ArrayList<String> f65815h = new ArrayList<>();

        /* renamed from: i */
        public ArrayList<Integer> f65816i = new ArrayList<>();

        /* renamed from: j */
        public ArrayList<Integer> f65817j = new ArrayList<>();
    }

    /* renamed from: wd0.a$b */
    public static final class C22897b {

        /* renamed from: a */
        public String f65818a = "";

        /* renamed from: b */
        public int f65819b;

        /* renamed from: c */
        public String f65820c = "";

        /* renamed from: d */
        public int f65821d;

        /* renamed from: e */
        public String f65822e = "";

        /* renamed from: f */
        public String f65823f = "";

        /* renamed from: g */
        public int f65824g;

        /* renamed from: h */
        public String f65825h = "";
    }

    /* renamed from: a */
    public final void mo36069a(int i, C22895a aVar) {
        C22895a aVar2 = aVar;
        C87412m.m108594g(aVar2, "reportInfo");
        if (i != 5) {
            C117407d.INSTANCE.mo160131h(21802, aVar2.f65802a, aVar2.f65804c, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), C110818d0.m150921S(aVar2.f65805d, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), C110818d0.m150921S(aVar2.f65806e, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), Integer.valueOf(aVar2.f65807f), aVar2.f65803b, 1);
            return;
        }
        C117407d.INSTANCE.mo160131h(21802, aVar2.f65802a, aVar2.f65804c, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), "", "", 0, aVar2.f65803b);
    }

    /* renamed from: b */
    public final void mo36070b(String str, int i, String str2, int i2, String str3, int i3) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "templateId");
        C87412m.m108594g(str3, "templateName");
        Log.m105927v("MicroMsg.SubscribeMsgReporter", "alvinluo reportSubscribeStatusOpInNotifyMessage bizUsername: %s, showType: %d, templateId: %s, status: %d, templateName: %s", str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3);
        C117407d.INSTANCE.mo160131h(17638, str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3, Integer.valueOf(i3));
    }
}
