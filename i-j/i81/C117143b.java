package i81;

import android.util.Pair;
import com.tencent.p014mm.autogen.events.KillSelfEvent;
import j20.C21152b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: i81.b */
public class C117143b {

    /* renamed from: a */
    public static final Map<String, List<Pair<String, String>>> f350976a = new HashMap();

    /* renamed from: b */
    public static final C21152b f350977b = new C117144a();

    /* renamed from: i81.b$a */
    public class C117144a implements C21152b {
        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            KillSelfEvent killSelfEvent = new KillSelfEvent();
            killSelfEvent.f343568d.f343569a = 0;
            killSelfEvent.publish();
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
            KillSelfEvent killSelfEvent = new KillSelfEvent();
            killSelfEvent.f343568d.f343569a = 1;
            killSelfEvent.publish();
        }
    }
}
