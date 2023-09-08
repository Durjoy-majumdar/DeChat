package f00;

import android.content.Intent;
import android.os.Bundle;
import aw0.C0225d;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43859b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import ie3.C87716k;
import java.util.Set;
import ke3.C88144b;
import xv0.C38857m;

/* renamed from: f00.x */
public class C45735x extends C38857m {
    /* renamed from: G1 */
    public void mo58338G1(BallInfo ballInfo) {
        Bundle bundle;
        String str;
        Set<String> set = C43859b.f118776v;
        Class cls = C45696d.class;
        if (ballInfo != null && (bundle = ballInfo.f311678C) != null) {
            String str2 = ballInfo.f311688f;
            String string = bundle.getString("rawUrl");
            boolean z = true;
            Log.m105925i("MicroMsg.WebViewFloatBallHelper", "handleBallInfoClicked, url:%s", string);
            int i = ballInfo.f311678C.getInt("minimize_secene", 0);
            int i2 = ballInfo.f311678C.getInt(C74928u.C45093i.f122318j, -1);
            Intent intent = new Intent();
            C0225d.m178b(intent, ballInfo.f311678C, C43859b.f118776v);
            intent.putExtra("rawUrl", string);
            intent.putExtra("minimize_secene", i);
            intent.putExtra("float_ball_key", str2);
            intent.putExtra("key_enable_teen_mode_check", true);
            intent.putExtra("webpageTitle", ballInfo.f311699t);
            if (i == 1) {
                Log.m105924i("MicroMsg.WebViewFloatBallHelper", "openWebPage, go to jd url");
                intent.putExtra("useJs", true);
                intent.putExtra("vertical_scroll", true);
                intent.putExtra("minimize_secene", 1);
                intent.putExtra("KPublisherId", "jd_store");
                C87716k.f253994a = 9;
            } else if (i == 2) {
                Log.m105924i("MicroMsg.WebViewFloatBallHelper", "openWebPage, go to game url");
                str = ".ui.tools.game.GameWebViewUI";
                C88144b.m109791i(MMApplicationContext.getContext(), "webview", str, intent, (Bundle) null);
            } else if (i2 > -1) {
                if (i2 != 5) {
                    z = false;
                }
                int i3 = ballInfo.f311678C.getInt("KOpenArticleSceneFromScene");
                int i4 = ballInfo.f311678C.getInt(C74928u.C45093i.f122315g);
                if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(i3) && ((C45696d) C86709a0.m107533q(cls)).Ms0(MMApplicationContext.getContext(), string, i2, z, i3, i4, intent)) {
                    Log.m105924i("MicroMsg.WebViewFloatBallHelper", "openWebPage, use fast Load");
                    return;
                }
            }
            str = ".ui.tools.WebViewUI";
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", str, intent, (Bundle) null);
        }
    }

    /* renamed from: H */
    public void mo58339H(BallInfo ballInfo) {
        Bundle bundle;
        Log.m105925i("WvFloatBallInfoEventListener", "onFloatBallInfoExposed, ballInfo:%s", ballInfo);
        Set<String> set = C43859b.f118776v;
        if (ballInfo != null && (bundle = ballInfo.f311678C) != null) {
            int i = bundle.getInt(C74928u.C45093i.f122318j, -1);
            String string = ballInfo.f311678C.getString("rawUrl");
            if (i > -1 && !Util.isNullOrNil(string)) {
                String string2 = ballInfo.f311678C.getString("srcDisplayname");
                int i2 = ballInfo.f311678C.getInt("KOpenArticleSceneFromScene");
                Log.m105919d("MicroMsg.WebViewFloatBallHelper", "addToPreload, name:%s", string2);
                ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(string, i, i2, new Object[0]);
            }
        }
    }

    /* renamed from: c2 */
    public void mo58340c2(BallInfo ballInfo) {
    }
}
