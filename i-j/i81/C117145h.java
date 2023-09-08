package i81;

import android.telephony.PhoneStateListener;
import android.util.Pair;
import com.tencent.p014mm.autogen.events.TelePmEvent;
import j20.C21152b;
import java.util.HashMap;
import java.util.List;

/* renamed from: i81.h */
public final class C117145h {

    /* renamed from: a */
    public static final HashMap<String, List<Pair<String, String>>> f350978a = new HashMap<>();

    /* renamed from: b */
    public static final C117146a f350979b = new C117146a();

    /* renamed from: i81.h$a */
    public static final class C117146a implements C21152b {
        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if (objArr != null && objArr.length >= 2) {
                TelePmEvent telePmEvent = new TelePmEvent();
                TelePmEvent.C114697a aVar = telePmEvent.f343626d;
                PhoneStateListener phoneStateListener = objArr[0];
                Integer num = null;
                PhoneStateListener phoneStateListener2 = phoneStateListener instanceof PhoneStateListener ? phoneStateListener : null;
                if (phoneStateListener2 == null) {
                    phoneStateListener2 = null;
                }
                aVar.f343627a = phoneStateListener2;
                Integer num2 = objArr[1];
                if (num2 instanceof Integer) {
                    num = num2;
                }
                aVar.f343628b = num != null ? num.intValue() : -1;
                telePmEvent.f343626d.f343629c = 0;
                telePmEvent.publish();
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
            TelePmEvent telePmEvent = new TelePmEvent();
            telePmEvent.f343626d.f343629c = 1;
            telePmEvent.publish();
        }
    }
}
