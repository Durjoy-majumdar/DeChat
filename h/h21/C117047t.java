package h21;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import p140cw.C7138g;
import p910lj.C76701a;
import te3.C118461r00;
import te3.C118477wj3;
import te3.C49139df2;

/* renamed from: h21.t */
public class C117047t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f350716d;

    /* renamed from: e */
    public final /* synthetic */ boolean f350717e;

    /* renamed from: f */
    public final /* synthetic */ C118477wj3 f350718f;

    /* renamed from: g */
    public final /* synthetic */ C118461r00 f350719g;

    /* renamed from: h */
    public final /* synthetic */ int f350720h;

    /* renamed from: i */
    public final /* synthetic */ CollectMainUI f350721i;

    /* renamed from: h21.t$a */
    public class C117048a implements Runnable {
        public C117048a() {
        }

        public void run() {
            Class cls = C7138g.class;
            Log.m105919d("MicroMsg.CollectMainUI", "height: %d, width: %d", Integer.valueOf(C117047t.this.f350716d.getHeight()), Integer.valueOf(C117047t.this.f350716d.getWidth()));
            Bitmap createBitmap = Bitmap.createBitmap(C117047t.this.f350716d.getWidth(), C117047t.this.f350716d.getHeight(), Bitmap.Config.ARGB_8888);
            C117047t.this.f350716d.draw(new Canvas(createBitmap));
            try {
                String str = ((C7138g) C86312j.m106911c(cls)).mo8323lm() + "mm_facetoface_collect_qrcode_" + System.currentTimeMillis() + ".png";
                BitmapUtil.saveBitmapToImage(createBitmap, 100, Bitmap.CompressFormat.PNG, str, false);
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(C117047t.this.f350721i.f345628q1 == null);
                objArr[1] = Boolean.valueOf(C117047t.this.f350721i.f345643x1);
                objArr[2] = Boolean.valueOf(C117047t.this.f350721i.f345642x0 == 8);
                Log.m105925i("MicroMsg.CollectMainUI", "mHalfPageInfo:%s,hasHalfPageShown:%s,isRegionHK()%s", objArr);
                C117047t tVar = C117047t.this;
                CollectMainUI collectMainUI = tVar.f350721i;
                C49139df2 df22 = collectMainUI.f345628q1;
                if (df22 != null && !collectMainUI.f345643x1) {
                    if (!(collectMainUI.f345642x0 == 8)) {
                        CollectMainUI.m162069K7(collectMainUI, df22);
                        ((C7138g) C86312j.m106911c(cls)).mo8315Wr(str, C117047t.this.f350721i.getContext());
                        C117047t.this.f350721i.f345643x1 = false;
                        C117047t.this.f350721i.f345568A.setVisibility(8);
                    }
                }
                if (tVar.f350717e) {
                    Log.m105924i("MicroMsg.CollectMainUI", "doSaveQrCode success ");
                    CollectMainUI collectMainUI2 = C117047t.this.f350721i;
                    AppCompatActivity context = collectMainUI2.getContext();
                    String string = C117047t.this.f350721i.getContext().getResources().getString(C0966R.string.bh9);
                    C117047t tVar2 = C117047t.this;
                    CollectMainUI.m162070L7(collectMainUI2, context, string, C0966R.raw.icons_filled_done, tVar2.f350718f, tVar2.f350719g);
                }
                ((C7138g) C86312j.m106911c(cls)).mo8315Wr(str, C117047t.this.f350721i.getContext());
                C117047t.this.f350721i.f345643x1 = false;
            } catch (Exception e) {
                C117047t.this.f350721i.f345643x1 = false;
                Log.m105928w("MicroMsg.CollectMainUI", "save fixed amount qrcode failed!" + e.getMessage());
                C76701a.makeText((Context) C117047t.this.f350721i.getContext(), (CharSequence) C117047t.this.f350721i.getString(C0966R.string.bhb), 1).show();
            }
            C117047t.this.f350721i.f345568A.setVisibility(8);
        }
    }

    public C117047t(CollectMainUI collectMainUI, LinearLayout linearLayout, boolean z, C118477wj3 wj32, C118461r00 r002, int i) {
        this.f350721i = collectMainUI;
        this.f350716d = linearLayout;
        this.f350717e = z;
        this.f350718f = wj32;
        this.f350719g = r002;
        this.f350720h = i;
    }

    public void run() {
        MMHandlerThread.postToMainThreadDelayed(new C117048a(), (long) this.f350720h);
    }
}
