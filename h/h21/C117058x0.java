package h21;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e21.C116673y0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p140cw.C7138g;
import p910lj.C76701a;
import te3.C118461r00;
import te3.C49139df2;

/* renamed from: h21.x0 */
public class C117058x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f350736d;

    /* renamed from: e */
    public final /* synthetic */ C116673y0.C116674b f350737e;

    /* renamed from: f */
    public final /* synthetic */ C118461r00 f350738f;

    /* renamed from: g */
    public final /* synthetic */ int f350739g;

    /* renamed from: h */
    public final /* synthetic */ WalletCollectQrCodeUI f350740h;

    /* renamed from: h21.x0$a */
    public class C117059a implements Runnable {
        public C117059a() {
        }

        public void run() {
            Class cls = C7138g.class;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "saveBitmap height: %s, width: %s", Integer.valueOf(C117058x0.this.f350736d.getHeight()), Integer.valueOf(C117058x0.this.f350736d.getWidth()));
            if (!C117058x0.this.f350740h.isFinishing() && !C117058x0.this.f350740h.isDestroyed() && C117058x0.this.f350736d.getHeight() != 0 && C117058x0.this.f350736d.getWidth() != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(C117058x0.this.f350736d.getWidth(), C117058x0.this.f350736d.getHeight(), Bitmap.Config.ARGB_8888);
                C117058x0.this.f350736d.draw(new Canvas(createBitmap));
                try {
                    String str = ((C7138g) C86312j.m106911c(cls)).mo8323lm() + "mm_facetoface_collect_qrcode_" + System.currentTimeMillis() + ".png";
                    BitmapUtil.saveBitmapToImage(createBitmap, 100, Bitmap.CompressFormat.PNG, str, false);
                    C117058x0 x0Var = C117058x0.this;
                    C116673y0.C116674b bVar = x0Var.f350737e;
                    C49139df2 df22 = bVar.f349846M;
                    if (df22 == null || bVar.f349847N) {
                        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "doSaveQrCode success ");
                        WalletCollectQrCodeUI walletCollectQrCodeUI = C117058x0.this.f350740h;
                        WalletCollectQrCodeUI.m162108M7(walletCollectQrCodeUI, walletCollectQrCodeUI.getContext(), C117058x0.this.f350740h.getContext().getResources().getString(C0966R.string.bh9), C0966R.raw.icons_filled_done, C117058x0.this.f350738f);
                    } else {
                        WalletCollectQrCodeUI.m162107L7(x0Var.f350740h, df22);
                    }
                    ((C7138g) C86312j.m106911c(cls)).mo8315Wr(str, C117058x0.this.f350740h.getContext());
                    C117058x0.this.f350737e.f349847N = false;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WalletCollectQrCodeUI", "save fixed amount qrcode failed!, errmsg:%s", e.getMessage());
                    C76701a.makeText((Context) C117058x0.this.f350740h.getContext(), (CharSequence) C117058x0.this.f350740h.getString(C0966R.string.bhb), 1).show();
                    C115669n.INSTANCE.mo160131h(25983, 17, Integer.valueOf(C117058x0.this.f350739g));
                    C117058x0.this.f350737e.f349847N = false;
                }
                View view = C117058x0.this.f350740h.f345704w;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$20$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$20$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public C117058x0(WalletCollectQrCodeUI walletCollectQrCodeUI, LinearLayout linearLayout, C116673y0.C116674b bVar, C118461r00 r002, int i) {
        this.f350740h = walletCollectQrCodeUI;
        this.f350736d = linearLayout;
        this.f350737e = bVar;
        this.f350738f = r002;
        this.f350739g = i;
    }

    public void run() {
        this.f350736d.postDelayed(new C117059a(), 50);
    }
}
