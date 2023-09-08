package jh2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import ih2.C60287a;
import java.util.LinkedList;
import jp3.C9486a;
import jp3.C9487b;
import nr3.C89059e;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C64839xt2;

/* renamed from: jh2.b */
public abstract class C60856b {

    /* renamed from: a */
    public final C9487b<C9486a> f173377a;

    /* renamed from: b */
    public final int f173378b = 1;

    /* renamed from: c */
    public final String f173379c = "MicroMsg.AbsGetRecommendAudioTask";

    /* renamed from: d */
    public final LinkedList<C89349b> f173380d = new LinkedList<>();

    /* renamed from: e */
    public int[] f173381e = new int[0];

    /* renamed from: f */
    public long f173382f;

    /* renamed from: g */
    public long f173383g;

    /* renamed from: h */
    public int f173384h;

    /* renamed from: i */
    public boolean f173385i;

    /* renamed from: j */
    public boolean f173386j;

    /* renamed from: k */
    public int f173387k = 299;

    /* renamed from: l */
    public int f173388l = 299;

    /* renamed from: m */
    public final C60857a f173389m;

    /* renamed from: n */
    public C32226l<? super LinkedList<C64839xt2>, C13598b0> f173390n;

    /* renamed from: o */
    public boolean f173391o;

    /* renamed from: jh2.b$a */
    public static final class C60857a extends Handler {

        /* renamed from: a */
        public final /* synthetic */ C60856b f173392a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60857a(C60856b bVar, Looper looper) {
            super(looper);
            this.f173392a = bVar;
        }

        public void handleMessage(Message message) {
            int i;
            int i2;
            C87412m.m108594g(message, "msg");
            int i3 = message.what;
            this.f173392a.getClass();
            boolean z = true;
            if (i3 == 0) {
                this.f173392a.mo85765c();
                C60856b bVar = this.f173392a;
                while (true) {
                    int i4 = bVar.f173388l;
                    if (i4 > 0 && (i2 = bVar.f173387k) > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
                        bVar.f173380d.clear();
                        int[] iArr = bVar.f173381e;
                        int length = iArr.length;
                        int i5 = 0;
                        int i6 = 0;
                        int i7 = 0;
                        while (i5 < length) {
                            int i8 = iArr[i5];
                            int i9 = i7 + 1;
                            Bitmap a = bVar.mo85763a(i7);
                            Canvas canvas = new Canvas(createBitmap);
                            C87412m.m108591d(a);
                            canvas.drawBitmap(a, (Rect) null, new Rect(0, 0, bVar.f173387k, bVar.f173388l), (Paint) null);
                            C89349b bVar2 = new C89349b(BitmapUtil.Bitmap2Bytes(createBitmap, 50));
                            bVar.f173380d.add(bVar2);
                            i6 += bVar2.f257327a.length;
                            i5++;
                            i7 = i9;
                        }
                        Log.m105924i(bVar.f173379c, "imageData size:" + i6 + " thumbWidth:" + bVar.f173387k + " thumbHeight:" + bVar.f173388l);
                        bVar.f173387k = bVar.f173387k / 2;
                        bVar.f173388l = bVar.f173388l / 2;
                        if (i6 <= 102400) {
                            break;
                        }
                    } else {
                        Log.m105924i(bVar.f173379c, "get image data fail!");
                        z = false;
                    }
                }
                Log.m105924i(bVar.f173379c, "get image data fail!");
                z = false;
                if (!z) {
                    bVar.f173380d.clear();
                    byte[] Bitmap2Bytes = BitmapUtil.Bitmap2Bytes(Bitmap.createBitmap(299, 299, Bitmap.Config.ARGB_8888), 50);
                    int i15 = 0;
                    for (int i16 : bVar.f173381e) {
                        C89349b bVar3 = new C89349b(Bitmap2Bytes);
                        bVar.f173380d.add(bVar3);
                        i15 += bVar3.f257327a.length;
                    }
                    Log.m105924i(bVar.f173379c, "backup imageData size:" + i15);
                }
                C60856b bVar4 = this.f173392a;
                bVar4.mo85764b();
                if (bVar4.f173386j) {
                    bVar4.f173389m.obtainMessage(bVar4.f173378b).sendToTarget();
                    return;
                }
                return;
            }
            C60856b bVar5 = this.f173392a;
            if (i3 == bVar5.f173378b) {
                Log.m105924i(bVar5.f173379c, "onLoadData: " + bVar5.f173391o + ' ' + bVar5.f173385i);
                if (!bVar5.f173391o && !bVar5.f173385i) {
                    bVar5.f173391o = true;
                    C60860f fVar = new C60860f(bVar5.f173380d, 0.0f, 0.0f, bVar5.f173382f, bVar5.f173383g, bVar5.f173384h, 0, 64, (C8480h) null);
                    fVar.f256791h = true;
                    C89059e i17 = fVar.mo9225i();
                    i17.mo11397F(bVar5.f173377a);
                    i17.mo123062e(new C60855a(bVar5));
                }
            }
        }
    }

    public C60856b(C9487b<C9486a> bVar) {
        C87412m.m108594g(bVar, "lifeCycleKeeper");
        this.f173377a = bVar;
        int i = C60287a.f171906a;
        MMHandler workerHandler = C86709a0.m107525e().getWorkerHandler();
        C87412m.m108593f(workerHandler, "getPizzaWorkerThread().workerHandler");
        this.f173389m = new C60857a(this, workerHandler.getLooper());
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_story_music_story_thumb_size, 299);
        this.f173387k = Qe;
        this.f173388l = Qe;
        Log.m105924i("MicroMsg.AbsGetRecommendAudioTask", "AbsGetRecommendAudioTask thumbWidth " + this.f173387k + " thumbHeight " + this.f173388l + " thumbTarget " + Qe);
    }

    /* renamed from: a */
    public abstract Bitmap mo85763a(int i);

    /* renamed from: b */
    public abstract void mo85764b();

    /* renamed from: c */
    public abstract void mo85765c();
}
