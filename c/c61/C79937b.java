package c61;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d61.C7239b;
import di0.C86294i;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import h61.C8490d;
import h61.C87455a;
import kr0.C33983a1;
import kr0.C33987b1;
import o40.C61926c;

@C86522b(dependencies = {C86294i.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: c61.b */
public final class C79937b extends C86301e implements C7239b {

    /* renamed from: c61.b$a */
    public static final class C79938a implements C33983a1.C33985b {

        /* renamed from: a */
        public static final C79938a f234159a = new C79938a();

        /* renamed from: b */
        public final void mo56555b(C29315z2 z2Var, String str) {
            C87412m.m108594g(z2Var, "<anonymous parameter 0>");
            C87412m.m108594g(str, "path");
            String str2 = "下载代码包成功：" + str;
            C87412m.m108594g(str2, "msg");
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
                C61926c.m72668M(new C8490d(str2));
                return;
            }
            Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", str2);
        }
    }

    /* renamed from: c61.b$b */
    public static final class C79939b implements C33983a1.C33984a {

        /* renamed from: a */
        public static final C79939b f234160a = new C79939b();

        /* renamed from: a */
        public final void mo8657a(int i, String str) {
            String str2 = "下载代码包失败: codes = " + i + ", msg = " + str;
            C87412m.m108594g(str2, "msg");
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
                C61926c.m72668M(new C8490d(str2));
                return;
            }
            Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", str2);
        }
    }

    public void nn0(boolean z) {
        if (z) {
            if (!C87455a.f253429e) {
                C87455a.C87456a aVar = C87455a.f253428d;
                C87412m.m108593f(aVar, "CURRENT_USING_APPID_BUNDLE_COCOS");
                vx0(true, aVar);
            } else if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
                C61926c.m72668M(new C8490d("走 boots 不支持下载"));
            } else {
                Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", "走 boots 不支持下载");
            }
        } else if (!C87455a.f253426b) {
            C87455a.C87456a aVar2 = C87455a.f253425a;
            C87412m.m108593f(aVar2, "CURRENT_USING_APPID_BUNDLE_UNITY");
            vx0(false, aVar2);
        } else if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
            C61926c.m72668M(new C8490d("走 boots 不支持下载"));
        } else {
            Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", "走 boots 不支持下载");
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        if (MMApplicationContext.isMainProcess()) {
            ((C86294i) C86312j.m106911c(C86294i.class)).requireAndWaitForAccountInitialized();
            C87455a.C87456a aVar = C87455a.f253425a;
            ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56532sv(aVar.f253432b, aVar.f253431a, 999);
            ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59394hF(aVar.f253431a, 0);
        }
    }

    public final void vx0(boolean z, C87455a.C87456a aVar) {
        String str = "开始下载代码包，isCocos:" + z + ", appId:" + aVar.f253431a + ", versionType:" + wx0(aVar.f253433c);
        C87412m.m108594g(str, "msg");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
            C61926c.m72668M(new C8490d(str));
        } else {
            Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", str);
        }
        ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56533yv(aVar.f253431a, aVar.f253433c, C79938a.f234159a, C79939b.f234160a);
    }

    public final String wx0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "体验版" : "开发版" : "正式版";
    }

    public String zd0() {
        StringBuilder sb = new StringBuilder();
        C87455a.C87456a aVar = C87455a.f253425a;
        sb.append("Unity 包信息：");
        sb.append(10);
        sb.append("appId: ");
        sb.append(aVar.f253431a);
        sb.append(10);
        sb.append("userName: ");
        sb.append(aVar.f253432b);
        sb.append(10);
        sb.append("versionType: ");
        sb.append(wx0(aVar.f253433c));
        sb.append(10);
        sb.append("debugMode: ");
        sb.append(C87455a.f253427c);
        sb.append(10);
        C87455a.C87456a aVar2 = C87455a.f253428d;
        sb.append("Cocos 包信息：");
        sb.append(10);
        if (aVar2 != null) {
            sb.append("appId: ");
            sb.append(aVar2.f253431a);
            sb.append(10);
            sb.append("userName: ");
            sb.append(aVar2.f253432b);
            sb.append(10);
            sb.append("versionType: ");
            sb.append(wx0(aVar2.f253433c));
            sb.append(10);
        } else {
            sb.append("没有 cocos 包的 x 实验");
            sb.append(10);
        }
        sb.append("版本类型：");
        sb.append("2.0 版本");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "builder.toString()");
        return sb4;
    }
}
