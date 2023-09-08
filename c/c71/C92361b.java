package c71;

import com.tencent.p014mm.sdk.platformtools.Log;
import ei2.C97648b;
import gy3.C87412m;
import yh2.C102868n;

/* renamed from: c71.b */
public final class C92361b extends C102868n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92361b(String str, C97648b bVar, int i) {
        super(str, bVar);
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(bVar, "emojiFrameRetriever");
        int i2 = i * 20;
        this.f303665k = i2;
        if (i2 > 30) {
            this.f303665k = 30;
        }
        float f = this.f303666l / ((float) i);
        this.f303666l = f;
        float f2 = 1000.0f / ((float) this.f303665k);
        this.f303667m = f2;
        if (f2 < f) {
            this.f303667m = f;
        }
        this.f303663i = (int) (((float) (this.f303659e / i)) / this.f303667m);
        this.f303664j = 0;
        Log.m105924i("MicroMsg.EmojiMixFrameSyncMgr", "init MixFrameSyncMgr,videoPath:" + str + ", videoPlayRate:" + i + ", fps:" + this.f303658d + ", duration:" + this.f303659e + ", frameCount:" + this.f303657c + ", frameDuration:" + this.f303666l + ", targetFrameRate:" + this.f303665k + ", targetFrameCount:" + this.f303663i + ", targetFrameDuration:" + this.f303667m);
    }
}
