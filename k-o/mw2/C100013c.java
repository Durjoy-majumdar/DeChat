package mw2;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kw2.C99266g;
import te3.bc4;

/* renamed from: mw2.c */
public final class C100013c {

    /* renamed from: a */
    public final String f293026a;

    /* renamed from: b */
    public final List<C99266g> f293027b;

    public C100013c() {
        this((String) null, (List) null, 3, (C8480h) null);
    }

    public C100013c(String str, List<C99266g> list) {
        C87412m.m108594g(str, "label");
        C87412m.m108594g(list, "storyInfos");
        this.f293026a = str;
        this.f293027b = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C99266g gVar : this.f293027b) {
            String str = null;
            bc4 bc4 = gVar.f291069p.mo138657p2().f299136h.f299398e.size() > 0 ? gVar.f291069p.mo138657p2().f299136h.f299398e.get(0) : null;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("\t[date=");
            sb4.append(gVar.field_date);
            sb4.append(" localId=");
            sb4.append((int) gVar.f291069p.systemRowid);
            sb4.append(", storyId=");
            sb4.append(gVar.f291069p.field_storyID);
            sb4.append(", thumb=");
            sb4.append(bc4 != null ? bc4.f297963h : null);
            sb4.append(", video=");
            if (bc4 != null) {
                str = bc4.f297961f;
            }
            sb4.append(str);
            sb4.append("]\n");
            sb.append(sb4.toString());
        }
        return '[' + this.f293026a + "] \n " + sb;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C100013c(String str, List list, int i, C8480h hVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
