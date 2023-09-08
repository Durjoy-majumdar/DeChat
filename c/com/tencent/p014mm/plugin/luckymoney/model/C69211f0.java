package com.tencent.p014mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import org.libpag.PAGFile;
import org.libpag.PAGImage;
import org.libpag.PAGView;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.f0 */
public final class C69211f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f199165d;

    /* renamed from: e */
    public final /* synthetic */ String f199166e;

    /* renamed from: f */
    public final /* synthetic */ PAGView f199167f;

    /* renamed from: g */
    public final /* synthetic */ boolean f199168g;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.f0$a */
    public static final class C69212a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PAGView f199169d;

        public C69212a(PAGView pAGView) {
            this.f199169d = pAGView;
        }

        public final void run() {
            this.f199169d.play();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.f0$b */
    public static final class C69213b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PAGView f199170d;

        public C69213b(PAGView pAGView) {
            this.f199170d = pAGView;
        }

        public final void run() {
            this.f199170d.play();
        }
    }

    public C69211f0(int i, String str, PAGView pAGView, boolean z) {
        this.f199165d = i;
        this.f199166e = str;
        this.f199167f = pAGView;
        this.f199168g = z;
    }

    public final void run() {
        int i = this.f199165d;
        if (i != 0) {
            if (i == 1) {
                Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.cot);
                C87412m.m108593f(drawable, "getContext().resources.g…money_envelop_pag_red_bg)");
                Bitmap transformDrawableToBitmap = BitmapUtil.transformDrawableToBitmap(drawable);
                C87412m.m108593f(transformDrawableToBitmap, "transformDrawableToBitmap(drawable)");
                PAGImage FromBitmap = PAGImage.FromBitmap(transformDrawableToBitmap);
                String str = this.f199166e;
                if (!(str == null || str.length() == 0)) {
                    PAGFile Load = PAGFile.Load(this.f199166e);
                    if (Load == null) {
                        Log.m105925i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，cover targetFilePath is %s", this.f199166e);
                        if (C86013q1.m106450k(this.f199166e)) {
                            C86013q1.m106447h(this.f199166e);
                            return;
                        }
                        return;
                    }
                    Load.replaceImage(0, FromBitmap);
                    this.f199167f.setComposition(Load);
                } else {
                    return;
                }
            } else if (!this.f199167f.setPath(this.f199166e)) {
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，type：%s，targetFilePath is %s", Integer.valueOf(this.f199165d), this.f199166e);
                if (C86013q1.m106450k(this.f199166e)) {
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopePagLogic", "delete file，type：%s，targetFilePath is %s", Integer.valueOf(this.f199165d), this.f199166e);
                    C86013q1.m106447h(this.f199166e);
                    return;
                }
                return;
            }
            this.f199167f.setProgress(0.0d);
            this.f199167f.flush();
            if (this.f199168g) {
                ((C119157j) C119157j.f356862d).mo183895z(new C69213b(this.f199167f));
                return;
            }
            return;
        }
        this.f199167f.setPath(this.f199166e);
        this.f199167f.setProgress(0.0d);
        this.f199167f.flush();
        C119179t tVar = C119157j.f356862d;
        C69212a aVar = new C69212a(this.f199167f);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 150, false);
    }
}
