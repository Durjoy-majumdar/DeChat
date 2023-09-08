package p1048uk;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p207nl.C100134k;
import p207nl.C89008j;
import p490dl.C97484a;
import p523fp.C32147e;
import sx3.C36907w;
import te3.C77946ib3;
import vd2.C78384d;

/* renamed from: uk.g */
public final class C102051g {

    /* renamed from: a */
    public static final C102052a f300534a;

    /* renamed from: b */
    public static final String f300535b = (C89008j.f256613a.mo123383b() + "panel/");

    /* renamed from: c */
    public static final String f300536c = "emoji-anim.xml";

    /* renamed from: d */
    public static long f300537d;

    /* renamed from: e */
    public static C102048b f300538e = new C102048b();

    /* renamed from: uk.g$a */
    public static final class C102052a {
        public C102052a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo141550a() {
            Class cls = C32147e.class;
            if (MMApplicationContext.isMainProcess() && C86709a0.m107522a() && Util.ticksToNow(C102051g.f300537d) > 1800000) {
                C102051g.f300537d = Util.currentTicks();
                ((C32147e) C86312j.m106911c(cls)).b70(37, 7, -1, false);
                ((C32147e) C86312j.m106911c(cls)).Yi0(37);
                Log.m105924i("MicroMsg.EmojiEggUtil", "checkAnimUpdate: " + C102051g.f300538e.f300528c.size() + ", " + C102051g.f300537d);
            }
        }

        /* renamed from: b */
        public final String mo141551b(C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msgInfo");
            String content = f4Var.getContent();
            if (C72996z1.m85820U5(f4Var.mo108768t())) {
                content = C75604z3.m90846r(content);
            }
            if (!f4Var.mo100977P3() && !f4Var.mo100987Z3()) {
                return content;
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            return u != null ? u.f195570f : null;
        }

        /* renamed from: c */
        public final List<String> mo141552c(C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msgInfo");
            LinkedList linkedList = new LinkedList();
            if (f4Var.mo100986Y3()) {
                String content = f4Var.getContent();
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    content = C75604z3.m90846r(content);
                }
                LinkedList<C77946ib3> linkedList2 = ((C78384d) C86312j.m106911c(C78384d.class)).mo108125bB(content).f183464e;
                C87412m.m108593f(linkedList2, "patContent.recordList");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                for (C77946ib3 ib32 : linkedList2) {
                    arrayList.add(ib32.f227609f);
                }
                linkedList.addAll(arrayList);
            }
            return linkedList;
        }

        /* renamed from: d */
        public final void mo141553d() {
            StringBuilder sb = new StringBuilder();
            String str = C102051g.f300535b;
            sb.append(str);
            sb.append("config.conf");
            int d = C100134k.m130830d(sb.toString());
            int d2 = C100134k.m130830d("assets:///panel/config.conf");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            String str2 = C102051g.f300536c;
            sb4.append(str2);
            String sb5 = sb4.toString();
            String str3 = "assets:///panel/" + str2;
            if (d <= 0 || d < d2 || !C86013q1.m106450k(sb5)) {
                C97484a.f286123a.mo136755a(str3, C102051g.f300538e);
            } else {
                C97484a.f286123a.mo136755a(sb5, C102051g.f300538e);
            }
            Log.m105924i("MicroMsg.EmojiEggUtil", "initAnimConfig: version:" + d + ", " + d2 + "; content " + C102051g.f300538e.f300528c.size());
        }
    }

    static {
        C102052a aVar = new C102052a((C8480h) null);
        f300534a = aVar;
        aVar.mo141553d();
    }
}
