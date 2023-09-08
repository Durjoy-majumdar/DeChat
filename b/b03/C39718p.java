package b03;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.Random;
import java.util.regex.Pattern;
import qy2.C77448f0;

/* renamed from: b03.p */
public final class C39718p {

    /* renamed from: a */
    public static final C39718p f106569a = new C39718p();

    /* renamed from: b */
    public static final Pattern f106570b;

    static {
        String str = "#([^\\n\\s\\t#@\\,，\\.。]{1,32})";
        if (C77448f0.m93394f()) {
            str = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_text_state_topic_separator_list_and, str);
        }
        f106570b = Pattern.compile(str);
    }

    /* renamed from: a */
    public final String mo62350a(int i) {
        return i == C0966R.C0969drawable.bry ? "text_state_default_image_1" : i == C0966R.C0969drawable.f357386bs2 ? "text_state_default_image_2" : i == C0966R.C0969drawable.f357387bs3 ? "text_state_default_image_3" : i == C0966R.C0969drawable.bs4 ? "text_state_default_image_4" : i == C0966R.C0969drawable.bs5 ? "text_state_default_image_5" : i == C0966R.C0969drawable.bs6 ? "text_state_default_image_6" : i == C0966R.C0969drawable.bs7 ? "text_state_default_image_7" : i == C0966R.C0969drawable.bs8 ? "text_state_default_image_8" : i == C0966R.C0969drawable.bs9 ? "text_state_default_image_9" : i == C0966R.C0969drawable.brz ? "text_state_default_image_10" : (i != C0966R.C0969drawable.f357384bs0 && i == C0966R.C0969drawable.f357385bs1) ? "text_state_default_image_12" : "text_state_default_image_11";
    }

    /* renamed from: b */
    public final int mo62351b(String str) {
        if (str == null) {
            return C0966R.C0969drawable.f357384bs0;
        }
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -1083859711:
                return !str.equals("text_state_default_image_10") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.brz;
            case -1083859710:
                boolean equals = str.equals("text_state_default_image_11");
                return C0966R.C0969drawable.f357384bs0;
            case -1083859709:
                return !str.equals("text_state_default_image_12") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.f357385bs1;
            default:
                switch (hashCode) {
                    case 1073415439:
                        return !str.equals("text_state_default_image_1") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bry;
                    case 1073415440:
                        return !str.equals("text_state_default_image_2") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.f357386bs2;
                    case 1073415441:
                        return !str.equals("text_state_default_image_3") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.f357387bs3;
                    case 1073415442:
                        return !str.equals("text_state_default_image_4") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bs4;
                    case 1073415443:
                        return !str.equals("text_state_default_image_5") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bs5;
                    case 1073415444:
                        return !str.equals("text_state_default_image_6") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bs6;
                    case 1073415445:
                        return !str.equals("text_state_default_image_7") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bs7;
                    case 1073415446:
                        return !str.equals("text_state_default_image_8") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bs8;
                    case 1073415447:
                        return !str.equals("text_state_default_image_9") ? C0966R.C0969drawable.f357384bs0 : C0966R.C0969drawable.bs9;
                    default:
                        return C0966R.C0969drawable.f357384bs0;
                }
        }
    }

    /* renamed from: c */
    public final int mo62352c() {
        int d = mo62353d();
        Log.m105924i("MicroMsg.TextStatus.TextStatusPostUtil", "getDefaultEditBackground :" + d);
        switch (d) {
            case 1:
                return C0966R.C0969drawable.bry;
            case 2:
                return C0966R.C0969drawable.f357386bs2;
            case 3:
                return C0966R.C0969drawable.f357387bs3;
            case 4:
                return C0966R.C0969drawable.bs4;
            case 5:
                return C0966R.C0969drawable.bs5;
            case 6:
                return C0966R.C0969drawable.bs6;
            case 7:
                return C0966R.C0969drawable.bs7;
            case 8:
                return C0966R.C0969drawable.bs8;
            case 9:
                return C0966R.C0969drawable.bs9;
            case 10:
                return C0966R.C0969drawable.brz;
            case 12:
                return C0966R.C0969drawable.f357385bs1;
            default:
                return C0966R.C0969drawable.f357384bs0;
        }
    }

    /* renamed from: d */
    public final int mo62353d() {
        return (((int) (System.currentTimeMillis() % ((long) 12))) + new Random((long) C86709a0.m107523b().mo121110g()).nextInt(12)) % 12;
    }
}
