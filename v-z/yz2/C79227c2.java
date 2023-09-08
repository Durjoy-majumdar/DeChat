package yz2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: yz2.c2 */
public final class C79227c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f232597d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232598e;

    /* renamed from: yz2.c2$a */
    public static final class C79228a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditHalfScreenActivity f232599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79228a(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
            super(1);
            this.f232599d = textStatusEditHalfScreenActivity;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "setForegroundPic requestEffect effectBitmap:" + bitmap);
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f232599d;
            Bitmap bitmap2 = TextStatusEditHalfScreenActivity.f207059m2;
            textStatusEditHalfScreenActivity.mo98538A8(bitmap);
            return C13598b0.f38549a;
        }
    }

    public C79227c2(Bitmap bitmap, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f232597d = bitmap;
        this.f232598e = textStatusEditHalfScreenActivity;
    }

    public final void run() {
        if (this.f232597d.getWidth() != 0) {
            TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f232598e;
            Bitmap bitmap = TextStatusEditHalfScreenActivity.f207059m2;
            if (textStatusEditHalfScreenActivity.mo98572e8().getWidth() != 0) {
                float height = ((float) this.f232597d.getHeight()) / ((float) this.f232597d.getWidth());
                float height2 = ((float) this.f232598e.mo98572e8().getHeight()) / ((float) this.f232598e.mo98572e8().getWidth());
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "setForegroundPic vpic post end " + this.f232597d.getWidth() + ' ' + this.f232597d.getHeight() + ' ' + height + ' ' + this.f232598e.mo98572e8().getWidth() + ' ' + this.f232598e.mo98572e8().getHeight() + ' ' + height2);
                if (height > height2) {
                    this.f232598e.mo98538A8(this.f232597d);
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setForegroundPic vpic post end ");
        sb.append(this.f232597d.getWidth());
        sb.append(' ');
        sb.append(this.f232597d.getHeight());
        sb.append(' ');
        TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity2 = this.f232598e;
        Bitmap bitmap2 = TextStatusEditHalfScreenActivity.f207059m2;
        sb.append(textStatusEditHalfScreenActivity2.mo98572e8().getWidth());
        sb.append(' ');
        sb.append(this.f232598e.mo98572e8().getHeight());
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", sb.toString());
        C65849b bVar = new C65849b();
        bVar.mo89891b(this.f232597d);
        int width = this.f232598e.mo98572e8().getWidth();
        int height3 = this.f232598e.mo98572e8().getHeight();
        bVar.f189363b = width;
        bVar.f189364c = height3;
        bVar.f189366e.f334033b.mo154924d();
        bVar.mo89890a(new C79228a(this.f232598e));
    }
}
