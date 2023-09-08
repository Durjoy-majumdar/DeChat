package ej2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.plugin.repairer.p099ui.RepairerMainUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import uv0.C111237j;
import xv0.C112185h;
import xv0.C53451i;

/* renamed from: ej2.a */
public final class C45659a extends C105052s {

    /* renamed from: s */
    public static final C112185h f123461s = new C45660a();

    /* renamed from: ej2.a$a */
    public static final class C45660a extends C53451i {
        /* renamed from: G1 */
        public void mo64040G1(BallInfo ballInfo) {
            Context context = MMApplicationContext.getContext();
            Intent intent = new Intent(context, RepairerMainUI.class);
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/repairer/ui/floatball/RepairerFloatBallHelper$Companion$floatBallInfoEventListener$1", "onFloatBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/repairer/ui/floatball/RepairerFloatBallHelper$Companion$floatBallInfoEventListener$1", "onFloatBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* renamed from: H */
        public void mo64041H(BallInfo ballInfo) {
        }

        /* renamed from: c2 */
        public void mo64042c2(BallInfo ballInfo) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45659a(C111237j jVar) {
        super(jVar);
        C87412m.m108594g(jVar, "pageAdapter");
    }
}
