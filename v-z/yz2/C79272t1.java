package yz2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: yz2.t1 */
public final class C79272t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f232718d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusEditActivity f232719e;

    /* renamed from: yz2.t1$a */
    public static final class C79273a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditActivity f232720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79273a(TextStatusEditActivity textStatusEditActivity) {
            super(1);
            this.f232720d = textStatusEditActivity;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic requestEffect effectBitmap:" + bitmap);
            TextStatusEditActivity textStatusEditActivity = this.f232720d;
            TextStatusEditActivity.C71390b bVar = TextStatusEditActivity.f206867L1;
            textStatusEditActivity.mo98471p8(bitmap);
            return C13598b0.f38549a;
        }
    }

    public C79272t1(Bitmap bitmap, TextStatusEditActivity textStatusEditActivity) {
        this.f232718d = bitmap;
        this.f232719e = textStatusEditActivity;
    }

    public final void run() {
        if (this.f232718d.getWidth() != 0) {
            TextStatusEditActivity textStatusEditActivity = this.f232719e;
            TextStatusEditActivity.C71390b bVar = TextStatusEditActivity.f206867L1;
            if (textStatusEditActivity.mo98456a8().getWidth() != 0) {
                float height = ((float) this.f232718d.getHeight()) / ((float) this.f232718d.getWidth());
                float height2 = ((float) this.f232719e.mo98456a8().getHeight()) / ((float) this.f232719e.mo98456a8().getWidth());
                Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic vpic post end " + this.f232718d.getWidth() + ' ' + this.f232718d.getHeight() + ' ' + height + ' ' + this.f232719e.mo98456a8().getWidth() + ' ' + this.f232719e.mo98456a8().getHeight() + ' ' + height2);
                if (height > height2) {
                    this.f232719e.mo98471p8(this.f232718d);
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setForegroundPic vpic post end ");
        sb.append(this.f232718d.getWidth());
        sb.append(' ');
        sb.append(this.f232718d.getHeight());
        sb.append(' ');
        TextStatusEditActivity textStatusEditActivity2 = this.f232719e;
        TextStatusEditActivity.C71390b bVar2 = TextStatusEditActivity.f206867L1;
        sb.append(textStatusEditActivity2.mo98456a8().getWidth());
        sb.append(' ');
        sb.append(this.f232719e.mo98456a8().getHeight());
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", sb.toString());
        C65849b bVar3 = new C65849b();
        bVar3.mo89891b(this.f232718d);
        int width = this.f232719e.mo98456a8().getWidth();
        int height3 = this.f232719e.mo98456a8().getHeight();
        bVar3.f189363b = width;
        bVar3.f189364c = height3;
        bVar3.f189366e.f334033b.mo154924d();
        bVar3.mo89890a(new C79273a(this.f232719e));
    }
}
