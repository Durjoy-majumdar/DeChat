package ag2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;
import p823sg.C90193h;

/* renamed from: ag2.n */
public class C27899n {

    /* renamed from: a */
    public String f77070a = null;

    /* renamed from: b */
    public int f77071b = 100;

    public C27899n(String str, int i) {
        Log.m105924i("Msg.Plugin.HttpRequestCache", "HttpRequestCache constructor, path = " + str + ", maxCount = " + i);
        this.f77070a = str;
        C86013q1.m106461v(str);
        this.f77071b = i <= 0 ? 100 : i;
    }

    /* renamed from: a */
    public void mo55675a() {
        String[] s = new C86009m1(this.f77070a).mo119981s();
        int i = 0;
        if ((s != null ? s.length : 0) >= this.f77071b) {
            String[] s2 = new C86009m1(this.f77070a).mo119981s();
            C86009m1 m1Var = null;
            long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
            int length = s2.length;
            while (i < length) {
                C86009m1 m1Var2 = new C86009m1(s2[i]);
                long q = m1Var2.mo119979q();
                if (q < j) {
                    j = q;
                }
                i++;
                m1Var = m1Var2;
            }
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
        }
    }

    /* renamed from: b */
    public final String mo55676b(String str, Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                stringBuffer.append((String) next.getKey());
                stringBuffer.append((String) next.getValue());
            }
        }
        return C90193h.m112878f(stringBuffer.toString().getBytes());
    }
}
