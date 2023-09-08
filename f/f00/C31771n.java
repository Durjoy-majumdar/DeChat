package f00;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;
import xv0.C38857m;

/* renamed from: f00.n */
public class C31771n extends C38857m {
    /* renamed from: G1 */
    public void mo58338G1(BallInfo ballInfo) {
        if (ballInfo != null && ballInfo.f311678C != null) {
            Log.m105925i("LugWvFloatBallInfoClickedListener", "handleBallInfoClicked, openWebPage ballInfo:%s", ballInfo);
            String str = ballInfo.f311688f;
            String string = ballInfo.f311678C.getString("rawUrl");
            int i = ballInfo.f311678C.getInt("minimize_secene", 0);
            Intent intent = new Intent();
            intent.putExtras(ballInfo.f311678C);
            intent.putExtra("rawUrl", string);
            intent.putExtra("minimize_secene", i);
            intent.putExtra("float_ball_key", str);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, ballInfo.f311699t);
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: H */
    public void mo58339H(BallInfo ballInfo) {
    }

    /* renamed from: c2 */
    public void mo58340c2(BallInfo ballInfo) {
    }
}
