package le3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116756s5;
import eb0.C97625j3;
import java.util.HashMap;
import java.util.Map;

/* renamed from: le3.a */
public final class C10499a {

    /* renamed from: a */
    public static final Map<Integer, Integer> f31735a = new HashMap();

    /* renamed from: a */
    public static void m10432a(int i) {
        Map<Integer, Integer> map = f31735a;
        HashMap hashMap = (HashMap) map;
        ((HashMap) map).put(Integer.valueOf(i), Integer.valueOf(Util.nullAsNil((Integer) hashMap.get(Integer.valueOf(i))) + 1));
    }

    /* renamed from: b */
    public static String m10433b() {
        StringBuilder sb = new StringBuilder();
        sb.append("[a=");
        String str = "0";
        sb.append(C97625j3.m125812b() == null ? str : "1");
        sb.append(" ");
        String sb4 = sb.toString();
        if (C97625j3.m125812b() == null) {
            return sb4;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("c=");
        sb5.append(C97625j3.m125812b().mo105906u() == null ? str : "1");
        sb5.append(" ");
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(sb6);
        sb7.append("u=");
        if (C97625j3.m125811a()) {
            str = "1";
        }
        sb7.append(str);
        sb7.append("]");
        return sb7.toString();
    }

    /* renamed from: c */
    public static void m10434c(String str) {
        String str2 = str + m10433b();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((HashMap) f31735a).entrySet()) {
            if (!(entry == null || entry.getKey() == null || entry.getValue() == null || ((Integer) entry.getValue()).intValue() == 0)) {
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                sb.append(',');
            }
        }
        ((HashMap) f31735a).clear();
        if (sb.length() > 0) {
            Log.m105918d("MicroMsg.PostTaskFMessageCardStat", "append fmesage card click");
            C116756s5.m164689b(10, sb.toString());
        }
        Log.m105918d("MicroMsg.PostTaskFMessageCardStat", "dkfm :" + (str2 + m10433b()));
        try {
            C97625j3.m125812b().mo105906u().mo119676J(66819, Long.valueOf(Util.nowSecond()));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.PostTaskFMessageCardStat", "e:" + e.getMessage());
        }
    }
}
