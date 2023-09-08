package ry1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import ke3.C88144b;
import nj3.C11184p0;

/* renamed from: ry1.w */
public class C48166w implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ GameDetailUI2 f129098d;

    public C48166w(GameDetailUI2 gameDetailUI2) {
        this.f129098d = gameDetailUI2;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            GameDetailUI2 gameDetailUI2 = this.f129098d;
            int i2 = GameDetailUI2.f113761V0;
            gameDetailUI2.getClass();
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            C88144b.m109802t(gameDetailUI2, ".ui.transmit.SelectConversationUI", intent, 2);
            gameDetailUI2.getContext().overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2394bx);
        } else if (itemId == 1) {
            GameDetailUI2 gameDetailUI22 = this.f129098d;
            int i3 = GameDetailUI2.f113761V0;
            gameDetailUI22.getClass();
            Intent intent2 = new Intent();
            intent2.putExtra("Ksnsupload_title", gameDetailUI22.f113802p0.f127910g);
            String str = gameDetailUI22.f113802p0.f127907d;
            if (Util.isNullOrNil(str)) {
                str = gameDetailUI22.f113793e.field_appIconUrl;
            }
            intent2.putExtra("Ksnsupload_imgurl", str);
            intent2.putExtra("Ksnsupload_link", gameDetailUI22.f113802p0.f127911h);
            intent2.putExtra("Ksnsupload_type", 1);
            intent2.putExtra("need_result", true);
            String a = C86493v0.m107223a("game_center");
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "game_center");
            intent2.putExtra("reportSessionId", a);
            C88144b.m109795m(gameDetailUI22.getContext(), "sns", ".ui.SnsUploadUI", intent2, 3);
        }
    }
}
