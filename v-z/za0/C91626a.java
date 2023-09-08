package za0;

import java.util.LinkedList;
import pe3.C89349b;
import te3.C90422jy;
import te3.C90446wm2;

/* renamed from: za0.a */
public final class C91626a {
    /* renamed from: a */
    public static final String m114981a(C90422jy jyVar) {
        if (jyVar == null) {
            return "CommRequestSource{NULL}";
        }
        return "CommRequestSource{open_scene=" + jyVar.f259639d + ", is_pre_hot=" + jyVar.f259640e + ", sync_type=" + jyVar.f259641f + '}';
    }

    /* renamed from: b */
    public static final String m114982b(C90446wm2 wm22) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("LaunchWxaAppResponse{");
        Object obj = "NULL";
        String str3 = obj;
        if (wm22 != null) {
            if (wm22.f259923e == null) {
                str = "NULL_API_INFO";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("api_info~ fg:");
                C89349b bVar = wm22.f259923e.f130770d;
                Object obj2 = obj;
                if (bVar != null) {
                    obj2 = Integer.valueOf(bVar.f257327a.length);
                }
                sb4.append(obj2);
                String sb5 = sb4.toString();
                LinkedList<C89349b> linkedList = wm22.f259923e.f130771e;
                if (linkedList != null) {
                    if (linkedList.size() > 0) {
                        sb5 = sb5 + " | bg:" + wm22.f259923e.f130771e.get(0).f257327a.length;
                    }
                    if (wm22.f259923e.f130771e.size() > 1) {
                        sb5 = sb5 + " | suspend:" + wm22.f259923e.f130771e.get(1).f257327a.length;
                    }
                }
                str = sb5 + '~';
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            if (wm22.f259922d == null) {
                str2 = " || NULL_LAUNCH";
            } else {
                str2 = " || launch " + wm22.f259922d.f259816d;
            }
            sb6.append(str2);
            str3 = sb6.toString();
        }
        sb.append(str3);
        sb.append('}');
        return sb.toString();
    }
}
