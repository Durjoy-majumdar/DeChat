package b03;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import hz2.C60235a;
import java.util.LinkedList;
import java.util.List;
import uz2.C52678e0;
import uz2.C52718u;
import uz2.C65488a0;
import z04.C112551y;

/* renamed from: b03.e */
public final class C67129e {
    /* renamed from: a */
    public static final String m79386a(List<? extends C65488a0> list) {
        C87412m.m108594g(list, "<this>");
        StringBuilder sb = new StringBuilder("size:" + list.size() + '-');
        for (C65488a0 a0Var : list) {
            C87412m.m108594g(a0Var, "<this>");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("jType:");
            sb4.append(a0Var.f188439d);
            sb4.append(" bid:");
            sb4.append(a0Var.f188440e);
            sb4.append(" buf:");
            String str = a0Var.f188441f;
            sb4.append(str != null ? str.length() : -1);
            sb4.append(" kbuf:");
            sb4.append(a0Var.f188442g);
            sb.append(sb4.toString());
            sb.append(",");
        }
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "sb.toString()");
        return sb5;
    }

    /* renamed from: b */
    public static final String m79387b(C52718u uVar) {
        C87412m.m108594g(uVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("mediaTyoe:");
        sb.append(uVar.f147237f);
        sb.append(" mediaUrl:");
        sb.append(uVar.f147239h);
        sb.append(" turl:");
        sb.append(uVar.f147241j);
        sb.append(" des:");
        sb.append(Util.secPrint(uVar.f147231J));
        sb.append(" bid:");
        sb.append(uVar.f147252x);
        sb.append(" rid:");
        sb.append(uVar.f147225D);
        sb.append(" rname:");
        sb.append(uVar.f147224C);
        sb.append(" did:");
        sb.append(uVar.f147228G);
        sb.append(" dname:");
        sb.append(uVar.f147227F);
        sb.append(" topicInfo:");
        C52678e0 e0Var = uVar.f147238g;
        C87412m.m108593f(e0Var, "topicInfo");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("tid:");
        sb4.append(e0Var.f147087d);
        sb4.append(" sid:");
        sb4.append(C60235a.m70504d(e0Var));
        sb4.append(" said:");
        sb4.append(C60235a.m70501a(e0Var));
        sb4.append(" sname:");
        sb4.append(C60235a.m70505e(e0Var));
        sb4.append(" sicon:");
        sb4.append(C60235a.m70503c(e0Var));
        sb4.append(" iconId:");
        sb4.append(e0Var.f147088e);
        sb4.append(" vinfo:");
        sb4.append(e0Var.f147091h);
        sb4.append(" jumpinfos:");
        LinkedList<C65488a0> linkedList = e0Var.f147090g;
        sb4.append(linkedList != null ? m79386a(linkedList) : null);
        sb4.append(" sourceInfos:");
        sb4.append(m79386a(C60235a.m70502b(e0Var)));
        sb.append(sb4.toString());
        sb.append(" hasBrandInfo:");
        String str = uVar.f147229H;
        sb.append(!(str == null || C112551y.m153811k(str)));
        sb.append(" option:");
        sb.append(uVar.f147249u);
        return sb.toString();
    }
}
