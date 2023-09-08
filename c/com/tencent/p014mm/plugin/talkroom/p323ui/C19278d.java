package com.tencent.p014mm.plugin.talkroom.p323ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomVolumeMeter;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.d */
public class C19278d implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomVolumeMeter.C19277a f54376d;

    public C19278d(TalkRoomVolumeMeter.C19277a aVar) {
        this.f54376d = aVar;
    }

    public boolean onTimerExpired() {
        Canvas lockCanvas;
        float[] fArr;
        TalkRoomVolumeMeter.C19277a aVar = this.f54376d;
        float f = aVar.f54371u;
        if (!(f < aVar.f54358e || f > aVar.f54359f || aVar.f54362i == null || aVar.f54361h == null || (lockCanvas = aVar.f54360g.lockCanvas()) == null || aVar.f54365o == null)) {
            lockCanvas.setDrawFilter(aVar.f54372v);
            float f2 = aVar.f54371u;
            if (aVar.f54375y == null) {
                float f3 = aVar.f54359f;
                aVar.f54375y = new float[]{f3, f3, f3, f3, f3};
            }
            int i = 0;
            while (true) {
                fArr = aVar.f54375y;
                if (i >= fArr.length - 1) {
                    break;
                }
                int i2 = i + 1;
                fArr[i] = fArr[i2];
                i = i2;
            }
            fArr[i] = f2;
            float f4 = ((((fArr[0] + (fArr[1] * 4.0f)) + (fArr[2] * 6.0f)) + (fArr[3] * 4.0f)) + (fArr[4] * 1.0f)) / 16.0f;
            aVar.f54370t = f4;
            int i3 = (int) f4;
            aVar.f54365o.set(0, i3, aVar.f54367q, aVar.f54366p + i3);
            lockCanvas.drawBitmap(aVar.f54373w ? aVar.f54362i : aVar.f54361h, (Rect) null, aVar.f54365o, aVar.f54364n);
            aVar.f54360g.unlockCanvasAndPost(lockCanvas);
        }
        return this.f54376d.f54369s;
    }
}
