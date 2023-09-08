package com.tencent.p014mm.plugin.mmsight.segment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105562q;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f72.C97842b;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.d */
public class C105479d implements C105562q.C105564b {

    /* renamed from: a */
    public final /* synthetic */ MMSightEditUI f313685a;

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.d$a */
    public class C105480a implements Runnable {
        public C105480a() {
        }

        public void run() {
            C76701a.makeText((Context) C105479d.this.f313685a, (int) C0966R.string.gta, 1).show();
        }
    }

    public C105479d(MMSightEditUI mMSightEditUI) {
        this.f313685a = mMSightEditUI;
    }

    /* renamed from: a */
    public void mo150277a() {
        C105562q qVar = this.f313685a.f313569h;
        if (qVar != null) {
            qVar.mo150417e();
            this.f313685a.f313569h = null;
        }
        MMHandlerThread.postToMainThread(new C105480a());
    }

    /* renamed from: b */
    public void mo150278b() {
        Log.m105924i("MicroMsg.MMSightEditUI", "onEditFinish");
        try {
            MMSightEditUI mMSightEditUI = this.f313685a;
            mMSightEditUI.f313576r = true;
            C105562q qVar = mMSightEditUI.f313569h;
            long j = (long) qVar.f313985d;
            long j2 = (long) qVar.f313986e;
            qVar.mo150418f(false, "");
            this.f313685a.f313569h.mo150417e();
            MMSightEditUI mMSightEditUI2 = this.f313685a;
            mMSightEditUI2.f313569h = null;
            if (!mMSightEditUI2.f313575q) {
                Intent intent = new Intent();
                intent.putExtra("K_SEGMENTVIDEOPATH", this.f313685a.f313568g);
                intent.putExtra("key_seek_look_start_time", j);
                intent.putExtra("key_seek_end_time", j2);
                this.f313685a.setResult(-1, intent);
                this.f313685a.finish();
                return;
            }
            Bitmap q = C97842b.m126300q(mMSightEditUI2.f313572n);
            if (q != null) {
                PInt pInt = new PInt();
                PInt pInt2 = new PInt();
                if (C97842b.m126286c(q.getWidth(), q.getHeight(), this.f313685a.f313570i.f267179t, pInt, pInt2)) {
                    q = Bitmap.createScaledBitmap(q, pInt.value, pInt2.value, true);
                }
                Log.m105925i("MicroMsg.MMSightEditUI", "getBitmap size = [%d, %d]", Integer.valueOf(q.getWidth()), Integer.valueOf(q.getHeight()));
                BitmapUtil.saveBitmapToImage(q, 80, Bitmap.CompressFormat.JPEG, this.f313685a.f313573o, true);
                Intent intent2 = new Intent();
                intent2.putExtra("K_SEGMENTVIDEOPATH", this.f313685a.f313572n);
                intent2.putExtra("KSEGMENTVIDEOTHUMBPATH", this.f313685a.f313573o);
                this.f313685a.setResult(-1, intent2);
                this.f313685a.finish();
                return;
            }
            Log.m105920e("MicroMsg.MMSightEditUI", "getVideoThumb failed!");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSightEditUI", e, "save video thumb error", new Object[0]);
            C76701a.makeText((Context) this.f313685a, (int) C0966R.string.gta, 1).show();
            this.f313685a.finish();
        }
    }

    /* renamed from: c */
    public void mo150279c() {
        Log.m105924i("MicroMsg.MMSightEditUI", "onExitEdit");
        C105562q qVar = this.f313685a.f313569h;
        if (qVar != null) {
            qVar.mo150418f(true, "");
            this.f313685a.f313569h.mo150417e();
            this.f313685a.f313569h = null;
        }
        this.f313685a.finish();
    }
}
