package uy2;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hz2.C60235a;
import java.util.Iterator;
import p773yy.C66710j;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import rz2.C48212k;
import su0.C13781a;
import uz2.C52678e0;
import uz2.C52718u;
import vz2.C78501d;
import xy2.C53477h;
import yy2.C53659b;

/* renamed from: uy2.g */
public final class C52665g extends UIComponent {

    /* renamed from: f */
    public static final C52666a f147055f = new C52666a((C8480h) null);

    /* renamed from: g */
    public static String f147056g = "";

    /* renamed from: d */
    public final C13601g f147057d = C36568h.m40985a(new C52667b(this));

    /* renamed from: e */
    public int f147058e;

    /* renamed from: uy2.g$a */
    public static final class C52666a {
        public C52666a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo73604a(C52678e0 e0Var) {
            C87412m.m108594g(e0Var, "<this>");
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = e0Var.f147089f.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(next);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final void mo73605b(String str, int i) {
            C52678e0 a;
            String d;
            String str2 = str;
            C87412m.m108594g(str2, "username");
            C48201c n0 = C39674e.f106452d.mo62253n0(str2);
            String str3 = null;
            String str4 = n0 != null ? n0.field_IconID : null;
            String str5 = str4 == null ? "" : str4;
            String str6 = (n0 == null || (a = C66710j.C53637a.m60171a(n0, false, 1, (Object) null)) == null || (d = C60235a.m70504d(a)) == null) ? "" : d;
            if (n0 != null) {
                str3 = n0.field_StatusID;
            }
            C78501d.m94808j(C78501d.f229945a, (long) i, (String) null, C52665g.f147056g, 0, (String) null, 0, 0, 0, 0, str, str5, str6, (String) null, str3 == null ? "" : str3, 4602, (Object) null);
        }

        /* renamed from: c */
        public final void mo73606c(String str, int i) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            C52718u l2;
            C52678e0 e0Var;
            String a;
            C52718u l25;
            C52678e0 e0Var2;
            C52718u l26;
            C52678e0 e0Var3;
            String str7;
            C52678e0 a2;
            String a3;
            C52678e0 a4;
            String str8 = str;
            C87412m.m108594g(str8, "sessionId");
            String str9 = null;
            String str10 = "";
            if (C87412m.m108589b(str8, C13781a.m13082a())) {
                C48201c n0 = C39674e.f106452d.mo62253n0(str8);
                String str11 = n0 != null ? n0.field_IconID : null;
                if (str11 == null) {
                    str11 = str10;
                }
                if (n0 == null || (a4 = C66710j.C53637a.m60171a(n0, false, 1, (Object) null)) == null || (str7 = C60235a.m70504d(a4)) == null) {
                    str7 = str10;
                }
                String str12 = n0 != null ? n0.field_StatusID : null;
                if (str12 == null) {
                    str12 = str10;
                }
                if (!(n0 == null || (a2 = C66710j.C53637a.m60171a(n0, false, 1, (Object) null)) == null || (a3 = mo73604a(a2)) == null)) {
                    str10 = a3;
                }
                str3 = str10;
                str5 = str11;
                str4 = str7;
                str2 = str12;
            } else {
                C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(str8);
                String str13 = (wx02 == null || (l26 = wx02.mo72977l2()) == null || (e0Var3 = l26.f147238g) == null) ? null : e0Var3.f147088e;
                if (str13 == null) {
                    str13 = str10;
                }
                if (wx02 == null || (l25 = wx02.mo72977l2()) == null || (e0Var2 = l25.f147238g) == null || (str6 = C60235a.m70504d(e0Var2)) == null) {
                    str6 = str10;
                }
                if (wx02 != null) {
                    str9 = wx02.field_textStatusId;
                }
                if (str9 == null) {
                    str9 = str10;
                }
                if (!(wx02 == null || (l2 = wx02.mo72977l2()) == null || (e0Var = l2.f147238g) == null || (a = mo73604a(e0Var)) == null)) {
                    str10 = a;
                }
                str2 = str9;
                str3 = str10;
                str5 = str13;
                str4 = str6;
            }
            C78501d.m94808j(C78501d.f229945a, (long) i, (String) null, C52665g.f147056g, 0, (String) null, 0, 0, 0, 0, str, str5, str4, str3, str2, 506, (Object) null);
        }
    }

    /* renamed from: uy2.g$b */
    public static final class C52667b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C52665g f147059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52667b(C52665g gVar) {
            super(0);
            this.f147059d = gVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f147059d.getIntent().getIntExtra("reportEnterScene", 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52665g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static void m59047c3(C52665g gVar, int i, int i2, int i3, int i4, int i5, Object obj) {
        int H0 = (i5 & 2) != 0 ? C39674e.f106452d.mo62240H0() : i2;
        int Lo = (i5 & 4) != 0 ? C39674e.f106452d.mo62238D().mo74246Lo() : i3;
        int jo = (i5 & 8) != 0 ? C53659b.m60196jo(C39674e.f106452d.mo62243O(), 0, 1, (Object) null) : i4;
        gVar.getClass();
        C78501d.m94808j(C78501d.f229945a, (long) i, (String) null, f147056g, 0, (String) null, 0, H0, Lo, jo, (String) null, (String) null, (String) null, (String) null, (String) null, 15930, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39674e eVar = C39674e.f106452d;
        int H0 = eVar.mo62240H0();
        int Lo = eVar.mo62238D().mo74246Lo();
        int jo = C53659b.m60196jo(eVar.mo62243O(), 0, 1, (Object) null);
        Activity context = getContext();
        C87412m.m108594g(context, "context");
        C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C52661f.class);
        C87412m.m108593f(a, "UICProvider.of(context).…PagerDataUIC::class.java)");
        C78501d.m94808j(C78501d.f229945a, 1, "0", f147056g, ((Number) ((C36570n) this.f147057d).getValue()).intValue(), (String) null, ((Number) ((C36570n) ((C52661f) a).f147051f).getValue()).intValue(), H0, Lo, jo, (String) null, (String) null, (String) null, (String) null, (String) null, 15888, (Object) null);
    }
}
