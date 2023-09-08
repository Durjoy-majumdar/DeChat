package bh3;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C7335d;
import java.util.Arrays;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: bh3.k */
public interface C113177k extends C7335d {

    /* renamed from: e0 */
    public static final List<String> f338627e0 = Arrays.asList(new String[]{"search", "finder", WeChatBrands.Business.GROUP_LIVE, "nearby_appbrand", "story"});

    /* renamed from: bh3.k$c */
    public enum C79703c {
        SYSTEM_REFUSE(""),
        BUSINESS_REFUSE(""),
        GRANTED(""),
        ERROR("");
        

        /* renamed from: d */
        public String f233615d;

        /* access modifiers changed from: public */
        C79703c(String str) {
            this.f233615d = str;
        }
    }

    /* renamed from: bh3.k$f */
    public interface C79704f {
        /* renamed from: a */
        void mo109818a(C79703c cVar);
    }

    /* renamed from: bh3.k$a */
    public enum C113178a {
        CHATTING("chatting", 1),
        RADAR("radar", 2),
        FACE2FACE_GROUP("face2face_group", 3),
        SNS("sns", 5),
        FINDER("finder", 6),
        LIVE(WeChatBrands.Business.GROUP_LIVE, 7),
        SCAN("scan", 8),
        SHAKE("shake", 9),
        STORY("story", 10),
        SEARCH("search", 11),
        NEARBY("nearby", 12),
        GAME("game", 13),
        NEARBY_APPBRAND("nearby_appbrand", 14),
        MINE("mine", 15),
        STATUS("status", 16),
        FAV("fav", 17),
        CARD("card", 18),
        MUSICPLAYER("musicplayer", 21),
        WIFI_INFO("wifi_info", 24),
        PAY(WeChatBrands.Business.GROUP_PAY, 45, r29),
        WEBVIEW("webview", 41, r29),
        EMOJI("emoji", 19),
        SPORT("sport", 20),
        MAIL("mail", 22),
        VOICE_PRINT("voiceprint", 23),
        ADD_CONTACT("add_contact", 4),
        CONTACT_REMARK("contact_remark", 28),
        WECHAT_OUT("wechatout", 26),
        SAVE_FILE("savefile", 25),
        APPBRAND(XWalkEnvironment.MODULE_APPBRAND, 42, r29),
        APPBRAND_FAKE_NATIVE_DEFAULT("appbrand_fake_native", 46),
        OLYMPIC("olympic", 29);
        

        /* renamed from: d */
        public String f338661d;

        /* renamed from: e */
        public int f338662e;

        /* renamed from: f */
        public Boolean f338663f;

        /* access modifiers changed from: public */
        C113178a(String str, int i) {
            this(r7, r8, str, i, Boolean.FALSE);
        }

        /* access modifiers changed from: public */
        C113178a(String str, int i, Boolean bool) {
            this.f338661d = str;
            this.f338662e = i;
            this.f338663f = bool;
            if (C113177k.f338627e0.contains(str) && (!"CN".equalsIgnoreCase(MultiProcessMMKV.getMMKV("mmkv_crossprocess_infos").decodeString("mmkv_key_user_reg_ic", (String) null)))) {
                this.f338663f = Boolean.TRUE;
            }
        }
    }

    /* renamed from: bh3.k$b */
    public enum C113179b {
        LOCAION(FirebaseAnalytics.C113379b.LOCATION, 1),
        CONTRACT("contact", 3),
        STORAGE("storage", 22),
        CAMERA("camera", 11),
        MICRO_PHONE("microphone", 9),
        HEALTHY("healthy", 17),
        OVERLAY("overlay", 31);
        

        /* renamed from: d */
        public String f338672d;

        /* renamed from: e */
        public int f338673e;

        /* access modifiers changed from: public */
        C113179b(String str, int i) {
            this.f338672d = str;
            this.f338673e = i;
        }
    }

    /* renamed from: bh3.k$d */
    public interface C113180d {
        void onBusinessPermissionDenied(String str);

        void onBusinessPermissionGranted(String str);
    }

    /* renamed from: bh3.k$e */
    public interface C113181e {
        void onOp(Boolean bool);
    }

    String A90();

    void Aa0(C113179b bVar);

    /* renamed from: Ci */
    void mo165697Ci(String str);

    boolean Dn0(int i, C113181e eVar);

    boolean G00(C113179b bVar, C113178a aVar, C113181e eVar);

    /* renamed from: GT */
    boolean mo165700GT(String str, String str2);

    /* renamed from: Jp */
    String mo165701Jp(String str, String str2);

    /* renamed from: Oz */
    Pair<Integer, Integer> mo165702Oz(String str, String str2);

    /* renamed from: Qv */
    void mo165703Qv(String str, Long l);

    /* renamed from: UG */
    boolean mo165704UG(C113179b bVar, C113181e eVar);

    /* renamed from: Yr */
    Integer mo165705Yr(String str);

    /* renamed from: aQ */
    boolean mo165706aQ(int i);

    boolean ad0(C113179b bVar, C113178a aVar);

    Integer bp0(String str);

    /* renamed from: du */
    void mo165709du(String str);

    /* renamed from: eh */
    String mo165710eh(String str);

    boolean gl0(String str, String str2);

    /* renamed from: hg */
    boolean mo165712hg(C113179b bVar, C113178a aVar, C113181e eVar);

    /* renamed from: kx */
    void mo165713kx(Activity activity, String str, String str2, int i, C79704f fVar);

    C79703c ls0(Context context, String str, int i);

    /* renamed from: mi */
    String mo165715mi(String str, String str2);

    /* renamed from: oQ */
    void mo165716oQ(String str);

    /* renamed from: vM */
    MultiProcessMMKV mo165717vM(String str);

    boolean vf0();

    boolean w00(C113179b bVar, C113178a aVar);

    String y60();

    /* renamed from: yX */
    void mo165721yX(String str, String str2, boolean z);
}
