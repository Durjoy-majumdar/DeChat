package h61;

import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import o40.C61926c;

/* renamed from: h61.a */
public class C87455a {

    /* renamed from: a */
    public static C87456a f253425a;

    /* renamed from: b */
    public static boolean f253426b;

    /* renamed from: c */
    public static boolean f253427c;

    /* renamed from: d */
    public static C87456a f253428d;

    /* renamed from: e */
    public static boolean f253429e;

    /* renamed from: f */
    public static int f253430f = 1763;

    /* renamed from: h61.a$a */
    public static class C87456a {

        /* renamed from: a */
        public String f253431a;

        /* renamed from: b */
        public String f253432b;

        /* renamed from: c */
        public int f253433c;

        public C87456a(String str, String str2, int i) {
            this.f253431a = str;
            this.f253432b = str2;
            this.f253433c = i;
        }

        public String toString() {
            return "AppIdBundle{appId='" + this.f253431a + '\'' + ", userName='" + this.f253432b + '\'' + ", versionType=" + this.f253433c + '}';
        }
    }

    static {
        f253425a = new C87456a("wx9d5f7f0bf2dc950c", "gh_2ae1569f5edf@app", 0);
        f253426b = true;
        f253427c = false;
        f253428d = null;
        f253429e = true;
        if (WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            f253427c = MultiProcessMMKV.getDefault().decodeBool("magic_emoji_enable_debug", true);
        }
        Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] updateDebugStatus: in debug mode = " + f253427c);
        Class cls = C32735h.class;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_magic_emoji_debug_android, "");
        if (Y60.isEmpty()) {
            Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] get appId bundle from expt service failed");
        } else {
            try {
                C104289g gVar = new C104289g(Y60);
                f253425a = new C87456a(gVar.getString("appId"), gVar.getString("userName"), gVar.getInt("versionType"));
                if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger()) {
                    if (f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
                        Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", "拉取 x 实验成功");
                        f253426b = false;
                        Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] update appId = " + f253425a.toString());
                    }
                }
                C61926c.m72668M(new C8490d("拉取 x 实验成功"));
                f253426b = false;
                Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] update appId = " + f253425a.toString());
            } catch (C79923f unused) {
                Log.m105920e("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] update from expt service failed..., data = " + Y60);
            }
        }
        String F5 = ((C32735h) C86312j.m106911c(cls)).mo58776F5("clicfg_magic_emoji_debug_cocos_android", "");
        if (F5.isEmpty()) {
            Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] get appId bundle from expt service for cocos failed");
        } else {
            try {
                C104289g gVar2 = new C104289g(F5);
                f253428d = new C87456a(gVar2.getString("appId"), gVar2.getString("userName"), gVar2.getInt("versionType"));
                f253429e = false;
                if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !WeChatEnvironment.hasDebugger()) {
                    if (f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
                        Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", "拉取 cocos x 实验成功");
                        Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] update cocos appId = " + f253428d.toString());
                    }
                }
                C61926c.m72668M(new C8490d("拉取 cocos x 实验成功"));
                Log.m105924i("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] update cocos appId = " + f253428d.toString());
            } catch (C79923f unused2) {
                Log.m105920e("MicroMsg.ConstantsMagicEmoji", "[MagicEmoji] update from expt service for cocos failed..., data = " + F5);
            }
        }
    }
}
