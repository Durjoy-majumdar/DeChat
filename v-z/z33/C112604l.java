package z33;

import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z33.l */
public class C112604l {

    /* renamed from: a */
    public static Map<Integer, String> f337212a;

    static {
        HashMap hashMap = new HashMap();
        f337212a = hashMap;
        hashMap.put(0, "CALLING_STATE_VIDEO_INVITING");
        f337212a.put(1, "CALLING_STATE_VOICE_INVITING");
        f337212a.put(2, "CALLING_STATE_VIDEO_WAITTING_ACCEPT");
        f337212a.put(3, "CALLING_STATE_VOICE_WAITTING_ACCEPT");
        f337212a.put(4, "CALLING_STATE_VIDEO_CONNECTING");
        f337212a.put(5, "CALLING_STATE_VOICE_CONNECTING");
        f337212a.put(6, "CALLING_STATE_VIDEO_TALKING");
        f337212a.put(7, "CALLING_STATE_VOICE_TALKING");
        f337212a.put(8, "CALLING_STATE_FINISH");
        f337212a.put(256, "CALLED_STATE_VIDEO_INVITING");
        f337212a.put(257, "CALLED_STATE_VOICE_INVITING");
        f337212a.put(258, "CALLED_STATE_VIDEO_CONNECTING");
        f337212a.put(Integer.valueOf(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION), "CALLED_STATE_VOICE_CONNECTING");
        f337212a.put(260, "CALLED_STATE_VIDEO_TALKING");
        f337212a.put(261, "CALLED_STATE_VOICE_TALKING");
        f337212a.put(262, "CALLED_STATE_FINISH");
        f337212a.put(4096, "ACTION_NOP");
        f337212a.put(4097, "ACTION_INVITE_RESPOND");
        f337212a.put(4098, "ACTION_CANCEL_INVITE");
        f337212a.put(4099, "ACTION_REJECT_INVITE");
        f337212a.put(4100, "ACTION_ACCEPT_INVITE");
        f337212a.put(4101, "ACTION_CLOSE_CAMERA");
        f337212a.put(4102, "ACTION_CONNECT_SUCC");
        f337212a.put(4103, "ACTION_SELF_HANGUP");
        f337212a.put(4104, "ACTION_ANOTHER_HANGUP");
        f337212a.put(4105, "ACTION_INVITE_TIMEOUT");
        f337212a.put(4106, "ACTION_SO_SHUTDOWN");
        f337212a.put(4107, "ACTION_PHONE_COMING");
        f337212a.put(4108, "ACTION_IGNORE_INVITE");
        f337212a.put(4109, "ACTION_ON_ERROR");
        f337212a.put(4110, "ACTION_SESSION_CALLED");
    }

    /* renamed from: a */
    public static C112605m m153978a(int i) {
        C112605m mVar = new C112605m(i);
        mVar.mo164379a(256, 4098, 262);
        mVar.mo164379a(256, 4099, 262);
        mVar.mo164379a(256, 4105, 262);
        mVar.mo164379a(256, 4106, 262);
        mVar.mo164379a(256, 4107, 262);
        mVar.mo164379a(256, 4108, 262);
        mVar.mo164379a(256, 4109, 262);
        mVar.mo164379a(256, 4100, 258);
        mVar.mo164379a(256, 4101, 257);
        mVar.mo164379a(257, 4100, TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION);
        mVar.mo164379a(257, 4098, 262);
        mVar.mo164379a(257, 4099, 262);
        mVar.mo164379a(257, 4105, 262);
        mVar.mo164379a(257, 4106, 262);
        mVar.mo164379a(257, 4107, 262);
        mVar.mo164379a(257, 4108, 262);
        mVar.mo164379a(257, 4109, 262);
        mVar.mo164379a(258, 4098, 262);
        mVar.mo164379a(258, 4099, 262);
        mVar.mo164379a(258, 4106, 262);
        mVar.mo164379a(258, 4107, 262);
        mVar.mo164379a(258, 4103, 262);
        mVar.mo164379a(258, 4109, 262);
        mVar.mo164379a(258, 4102, 260);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4102, 261);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4098, 262);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4099, 262);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4106, 262);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4107, 262);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4103, 262);
        mVar.mo164379a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, 4109, 262);
        mVar.mo164379a(260, 4101, 261);
        mVar.mo164379a(260, 4103, 262);
        mVar.mo164379a(260, 4104, 262);
        mVar.mo164379a(260, 4106, 262);
        mVar.mo164379a(260, 4107, 262);
        mVar.mo164379a(260, 4109, 262);
        mVar.mo164379a(261, 4103, 262);
        mVar.mo164379a(261, 4104, 262);
        mVar.mo164379a(261, 4106, 262);
        mVar.mo164379a(261, 4107, 262);
        mVar.mo164379a(261, 4109, 262);
        return mVar;
    }

    /* renamed from: b */
    public static C112605m m153979b(int i) {
        C112605m mVar = new C112605m(i);
        mVar.mo164379a(0, 4098, 8);
        mVar.mo164379a(0, 4106, 8);
        mVar.mo164379a(0, 4107, 8);
        mVar.mo164379a(0, 4109, 8);
        mVar.mo164379a(0, 4097, 2);
        mVar.mo164379a(0, 4101, 1);
        mVar.mo164379a(1, 4097, 3);
        mVar.mo164379a(1, 4098, 8);
        mVar.mo164379a(1, 4106, 8);
        mVar.mo164379a(1, 4107, 8);
        mVar.mo164379a(1, 4109, 8);
        mVar.mo164379a(2, 4098, 8);
        mVar.mo164379a(2, 4099, 8);
        mVar.mo164379a(2, 4105, 8);
        mVar.mo164379a(2, 4106, 8);
        mVar.mo164379a(2, 4107, 8);
        mVar.mo164379a(2, 4109, 8);
        mVar.mo164379a(2, 4100, 4);
        mVar.mo164379a(2, 4101, 3);
        mVar.mo164379a(3, 4100, 5);
        mVar.mo164379a(3, 4098, 8);
        mVar.mo164379a(3, 4099, 8);
        mVar.mo164379a(3, 4105, 8);
        mVar.mo164379a(3, 4106, 8);
        mVar.mo164379a(3, 4107, 8);
        mVar.mo164379a(3, 4109, 8);
        mVar.mo164379a(4, 4102, 6);
        mVar.mo164379a(4, 4101, 5);
        mVar.mo164379a(5, 4102, 7);
        mVar.mo164379a(6, 4103, 8);
        mVar.mo164379a(6, 4104, 8);
        mVar.mo164379a(6, 4106, 8);
        mVar.mo164379a(6, 4107, 8);
        mVar.mo164379a(6, 4109, 8);
        mVar.mo164379a(6, 4101, 7);
        mVar.mo164379a(7, 4103, 8);
        mVar.mo164379a(7, 4104, 8);
        mVar.mo164379a(7, 4106, 8);
        mVar.mo164379a(7, 4107, 8);
        mVar.mo164379a(7, 4109, 8);
        mVar.mo164379a(4, 4098, 8);
        mVar.mo164379a(4, 4099, 8);
        mVar.mo164379a(4, 4106, 8);
        mVar.mo164379a(4, 4107, 8);
        mVar.mo164379a(4, 4103, 8);
        mVar.mo164379a(4, 4109, 8);
        mVar.mo164379a(5, 4098, 8);
        mVar.mo164379a(5, 4099, 8);
        mVar.mo164379a(5, 4106, 8);
        mVar.mo164379a(5, 4107, 8);
        mVar.mo164379a(5, 4103, 8);
        mVar.mo164379a(5, 4109, 8);
        mVar.mo164379a(0, 4110, 4);
        mVar.mo164379a(1, 4110, 5);
        return mVar;
    }

    /* renamed from: c */
    public static int m153980c(boolean z, boolean z2) {
        if (true == z && true == z2) {
            return 0;
        }
        if (true != z || z2) {
            return (z || true != z2) ? 257 : 256;
        }
        return 1;
    }

    /* renamed from: d */
    public static String m153981d(int i) {
        if (!((HashMap) f337212a).containsKey(Integer.valueOf(i))) {
            return "no found value";
        }
        return (String) ((HashMap) f337212a).get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public static boolean m153982e(int i) {
        return 1 == i || i == 0 || 2 == i || 3 == i;
    }

    /* renamed from: f */
    public static boolean m153983f(int i) {
        return i == 0 || 2 == i || 4 == i || 6 == i || 256 == i || 258 == i || 260 == i;
    }

    /* renamed from: g */
    public static boolean m153984g(int i) {
        return 260 == i || 261 == i || 6 == i || 7 == i;
    }
}
