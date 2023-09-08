package gf1;

import gy3.C87412m;
import te3.C64487k90;
import te3.C64517l90;

/* renamed from: gf1.j */
public final class C59426j {
    /* renamed from: a */
    public static final String m69334a(C59417a aVar) {
        C87412m.m108594g(aVar, "<this>");
        C64517l90 l902 = aVar.f169822a;
        if (l902 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("is_merge=");
            sb.append(l902.f184053f);
            sb.append(" fg_config=[");
            C64487k90 k902 = l902.f184052e;
            Integer num = null;
            sb.append(k902 != null ? Integer.valueOf(k902.f183898d) : null);
            sb.append(',');
            C64487k90 k903 = l902.f184052e;
            sb.append(k903 != null ? Integer.valueOf(k903.f183899e) : null);
            sb.append("] discovery_config=[");
            C64487k90 k904 = l902.f184051d;
            sb.append(k904 != null ? Integer.valueOf(k904.f183898d) : null);
            sb.append(',');
            C64487k90 k905 = l902.f184051d;
            sb.append(k905 != null ? Integer.valueOf(k905.f183899e) : null);
            sb.append("] enter_sns_config=[");
            C64487k90 k906 = l902.f184054g;
            sb.append(k906 != null ? Integer.valueOf(k906.f183898d) : null);
            sb.append(", ");
            C64487k90 k907 = l902.f184054g;
            sb.append(k907 != null ? Integer.valueOf(k907.f183899e) : null);
            sb.append("] exit_sns_config=[");
            C64487k90 k908 = l902.f184055h;
            sb.append(k908 != null ? Integer.valueOf(k908.f183898d) : null);
            sb.append(", ");
            C64487k90 k909 = l902.f184055h;
            sb.append(k909 != null ? Integer.valueOf(k909.f183899e) : null);
            sb.append("] sns_expose_last_feed_config=[");
            C64487k90 k9010 = l902.f184056i;
            sb.append(k9010 != null ? Integer.valueOf(k9010.f183898d) : null);
            sb.append(", ");
            C64487k90 k9011 = l902.f184056i;
            sb.append(k9011 != null ? Integer.valueOf(k9011.f183899e) : null);
            sb.append("] sns_expose_n_feed_config=[");
            C64487k90 k9012 = l902.f184057j;
            sb.append(k9012 != null ? Integer.valueOf(k9012.f183898d) : null);
            sb.append(", ");
            C64487k90 k9013 = l902.f184057j;
            sb.append(k9013 != null ? Integer.valueOf(k9013.f183899e) : null);
            sb.append(", ");
            C64487k90 k9014 = l902.f184057j;
            sb.append(k9014 != null ? Integer.valueOf(k9014.f183900f) : null);
            sb.append("] reddot_session_report_config=[");
            C64487k90 k9015 = l902.f184058n;
            sb.append(k9015 != null ? Integer.valueOf(k9015.f183898d) : null);
            sb.append(", ");
            C64487k90 k9016 = l902.f184058n;
            sb.append(k9016 != null ? Integer.valueOf(k9016.f183899e) : null);
            sb.append(", ");
            C64487k90 k9017 = l902.f184058n;
            if (k9017 != null) {
                num = Integer.valueOf(k9017.f183901g);
            }
            sb.append(num);
            sb.append(']');
            String sb4 = sb.toString();
            return sb4 == null ? "" : sb4;
        }
    }
}
