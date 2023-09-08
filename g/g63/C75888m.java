package g63;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.NinePatchDrawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.C72463b;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.C72467f;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kg3.C76577a;
import ud3.C101998d;

/* renamed from: g63.m */
public class C75888m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletSuccPageAwardWidget f222563d;

    public C75888m(WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f222563d = walletSuccPageAwardWidget;
    }

    public void run() {
        if (this.f222563d.f210776n.getHeight() != this.f222563d.getHeight()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f222563d.f210776n.getLayoutParams();
            layoutParams.width = this.f222563d.f210773h.getWidth();
            layoutParams.height = this.f222563d.f210773h.getHeight();
            this.f222563d.f210776n.setLayoutParams(layoutParams);
        }
        WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f222563d;
        int i = walletSuccPageAwardWidget.f210778p.f226713j;
        boolean z = i == 1 || i == 3;
        boolean z2 = i == 2 || i == 3;
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "initScratchShakeView, canScratch: %s, canShrake: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        int b = C76577a.m92151b(walletSuccPageAwardWidget.getContext(), 50);
        WalletScratchShakeView walletScratchShakeView = walletSuccPageAwardWidget.f210776n;
        float f = (float) b;
        int i2 = b / 2;
        walletScratchShakeView.getClass();
        Log.m105925i("MicroMsg.WalletScratchShakeView", "init canShake: %s, canScratch: %s", Boolean.valueOf(z2), Boolean.valueOf(z));
        walletScratchShakeView.f210742f = z;
        walletScratchShakeView.f210741e = z2;
        WalletScratchShakeView.C72449b bVar = walletScratchShakeView.f210740d;
        if (bVar != null) {
            walletScratchShakeView.removeView(bVar);
            walletScratchShakeView.f210740d = null;
        }
        WalletScratchShakeView.C72449b bVar2 = new WalletScratchShakeView.C72449b(walletScratchShakeView.getContext());
        walletScratchShakeView.f210740d = bVar2;
        walletScratchShakeView.addView(bVar2, new ViewGroup.LayoutParams(-1, -1));
        WalletScratchShakeView.C72449b bVar3 = walletScratchShakeView.f210740d;
        bVar3.getClass();
        Log.m105924i("MicroMsg.WalletScratchShakeView", "init inner view");
        Paint paint = new Paint();
        bVar3.f210749f = paint;
        paint.setAntiAlias(true);
        bVar3.f210749f.setDither(true);
        Bitmap decodeResource = BitmapFactory.decodeResource(bVar3.getResources(), C0966R.C0969drawable.cfb);
        int[] iArr = {30, decodeResource.getWidth() / 3, decodeResource.getWidth() - (decodeResource.getWidth() / 3), decodeResource.getWidth() - 30};
        int[] iArr2 = {0, decodeResource.getHeight()};
        ByteBuffer order = ByteBuffer.allocate(92).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 4);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(iArr[0]);
        order.putInt(iArr[1]);
        order.putInt(iArr[2]);
        order.putInt(iArr[3]);
        order.putInt(iArr2[0]);
        order.putInt(iArr2[1]);
        for (int i3 = 0; i3 < 9; i3++) {
            order.putInt(1);
        }
        bVar3.f210750g = new NinePatchDrawable(bVar3.getResources(), new NinePatch(decodeResource, order.array(), "shake_bg"));
        Paint paint2 = new Paint();
        bVar3.f210751h = paint2;
        paint2.setAntiAlias(true);
        bVar3.f210751h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        bVar3.f210751h.setStyle(Paint.Style.STROKE);
        bVar3.f210751h.setStrokeCap(Paint.Cap.ROUND);
        bVar3.f210751h.setStrokeWidth(f);
        Paint paint3 = new Paint();
        bVar3.f210752i = paint3;
        paint3.setAntiAlias(true);
        bVar3.f210752i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        bVar3.f210752i.setStyle(Paint.Style.FILL);
        bVar3.f210752i.setStrokeCap(Paint.Cap.ROUND);
        bVar3.f210753j = new Path();
        bVar3.f210754n = new Path();
        bVar3.f210763w = 0.0f;
        bVar3.f210762v = 0.0f;
        bVar3.f210757q = ViewConfiguration.get(bVar3.getContext()).getScaledTouchSlop();
        bVar3.f210759s = false;
        bVar3.f210760t = false;
        if (WalletScratchShakeView.this.f210741e) {
            C101998d dVar = new C101998d(bVar3.getContext());
            bVar3.f210761u = dVar;
            dVar.mo141497a(new C72463b(bVar3));
            bVar3.f210765y = Util.currentTicks();
        }
        bVar3.invalidate();
        walletScratchShakeView.setClipChildren(false);
        walletSuccPageAwardWidget.f210776n.setScratchShakeCallback(new C72467f(walletSuccPageAwardWidget));
    }
}
