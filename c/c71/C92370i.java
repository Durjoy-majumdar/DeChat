package c71;

import bi2.C92262a;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j71.C108587c;
import j71.C108590e;
import java.util.ArrayList;
import java.util.Iterator;
import p500dy.C97560f;
import p911ml.C76778b;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65234n;
import yh2.C102868n;

/* renamed from: c71.i */
public final class C92370i extends C65220d {

    /* renamed from: f */
    public final C92366f f264326f;

    /* renamed from: g */
    public final String f264327g = "MicroMsg.EmojiMixTask";

    /* renamed from: h */
    public final long f264328h;

    /* renamed from: i */
    public long f264329i;

    /* renamed from: c71.i$a */
    public static final class C92371a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92370i f264330d;

        /* renamed from: e */
        public final /* synthetic */ long f264331e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92371a(C92370i iVar, long j) {
            super(1);
            this.f264330d = iVar;
            this.f264331e = j;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = this.f264330d.f264327g;
            Log.m105924i(str, this.f264330d.mo11854d() + " mix end: " + this.f264330d.f264326f.f264313d + ' ' + booleanValue);
            Iterator it = ((ArrayList) this.f264330d.f264326f.f264314e.f264292c).iterator();
            while (it.hasNext()) {
                ((C92262a) it.next()).mo126256b();
            }
            this.f264330d.f264329i = Util.milliSecondsToNow(this.f264331e);
            if (booleanValue) {
                C92370i.m116172e(this.f264330d, true);
                this.f264330d.mo11853b(C65234n.OK);
            } else {
                C92370i.m116172e(this.f264330d, false);
                this.f264330d.mo11853b(C65234n.Fail);
            }
            return C13598b0.f38549a;
        }
    }

    public C92370i(C92366f fVar) {
        C87412m.m108594g(fVar, "mixInfo");
        this.f264326f = fVar;
        this.f264328h = fVar.f264311b;
    }

    /* renamed from: e */
    public static final void m116172e(C92370i iVar, boolean z) {
        C92370i iVar2 = iVar;
        boolean z2 = false;
        if (z) {
            C92366f fVar = iVar2.f264326f;
            int i = fVar.f264310a;
            if ((i == 3 || i == 4 || i == 5) && (i == 4 || i == 5)) {
                z2 = true;
            }
            if (!z2) {
                C76778b.f224582a.mo107030a(fVar.f264311b, true, (String) null);
            }
            EmojiCaptureProxy access$getInstance$cp = EmojiCaptureProxy.f269149i;
            C92366f fVar2 = iVar2.f264326f;
            String str = fVar2.f264313d;
            String md5 = fVar2.f264319j.getMd5();
            C87412m.m108593f(md5, "mixInfo.emojiInfo.md5");
            access$getInstance$cp.postUploadTask(str, md5);
            EmojiCaptureReporter.m117776b(19, iVar2.f264328h, 0, 0, 0, iVar2.f264329i, 0, 0, 0, iVar2.f264326f.f264310a);
            EmojiCaptureReporter.m117777c(1, 1);
            EmojiCaptureReporter.m117777c(38, (int) iVar2.f264329i);
            return;
        }
        iVar.getClass();
        C76778b.f224582a.mo107030a(iVar2.f264326f.f264311b, false, (String) null);
        EmojiInfo emojiInfo = iVar2.f264326f.f264319j;
        emojiInfo.getClass();
        emojiInfo.field_captureUploadErrCode = 11;
        EmojiInfo emojiInfo2 = iVar2.f264326f.f264319j;
        emojiInfo2.getClass();
        emojiInfo2.field_captureStatus = 2;
        EmojiCaptureProxy.f269149i.updateEmojiInfo(iVar2.f264326f.f264319j);
        EmojiCaptureReporter.m117778d(iVar2.f264328h, 3, iVar2.f264326f.f264310a);
    }

    /* renamed from: a */
    public void mo11852a() {
        C92366f fVar = this.f264326f;
        C92379t tVar = new C92379t(fVar.f264312c, fVar.f264314e, fVar.f264313d, fVar.f264315f, fVar.f264316g, fVar.f264317h, fVar.f264318i, fVar.f264311b);
        long nowMilliSecond = Util.nowMilliSecond();
        Iterator it = ((ArrayList) this.f264326f.f264314e.f264292c).iterator();
        while (it.hasNext()) {
            ((C92262a) it.next()).mo126258d();
        }
        EmojiCaptureReporter.m117777c(37, 1);
        C92371a aVar = new C92371a(this, nowMilliSecond);
        tVar.f264355o = System.currentTimeMillis();
        C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(tVar.f264341a);
        double d = (Z40 != null ? Integer.valueOf(Z40.f273447e) : null) != null ? 1000.0d / ((double) Z40.f273447e) : 0.0d;
        tVar.f264353m = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("start decode ");
        sb.append(Thread.currentThread().getId());
        sb.append(", fps: ");
        sb.append(Z40 != null ? Integer.valueOf(Z40.f273447e) : null);
        sb.append(", duration: ");
        sb.append(Z40 != null ? Integer.valueOf(Z40.f273443a) : null);
        sb.append(", videoFrameDuration: ");
        sb.append(d);
        sb.append(", removeBackground:");
        sb.append(tVar.f264345e);
        sb.append(", path: ");
        sb.append(tVar.f264341a);
        Log.m105924i("MicroMsg.EmojiMixer", sb.toString());
        int i = 0;
        tVar.f264350j = 0;
        boolean z = tVar.f264345e;
        boolean z2 = tVar.f264346f != null;
        boolean z3 = tVar.f264344d > 1;
        if (Z40 != null) {
            i = Z40.f273443a;
        }
        Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markStartEmojiMix, removeBackground:" + z + ", hasSticker:" + z2 + ", speedUp:" + z3 + ", videoDuration:" + i);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1012, 17, 1);
        if (z) {
            nVar.mo175913w(1012, 18, 1);
        }
        if (z2) {
            nVar.mo175913w(1012, 19, 1);
        }
        if (z3) {
            nVar.mo175913w(1012, 20, 1);
        }
        if (i > 0) {
            nVar.mo175913w(1012, 36, (long) i);
        }
        if (tVar.f264347g) {
            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markUseGif");
            nVar.mo175913w(1012, 31, 1);
        } else {
            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markUseWxam");
            nVar.mo175913w(1012, 30, 1);
        }
        tVar.f264351k = new C92361b(tVar.f264341a, tVar.f264342b, tVar.f264344d);
        if (!Util.isNullOrNil(tVar.f264343c)) {
            String str = tVar.f264343c;
            C102868n nVar2 = tVar.f264351k;
            if (nVar2 != null) {
                tVar.f264352l = new C92362c(str, C0947jz.f2205e, C0947jz.f2205e, (long) nVar2.f303667m, tVar.f264347g);
            } else {
                C87412m.m108603p("syncMgr");
                throw null;
            }
        }
        C108587c cVar = new C108587c(C0947jz.f2205e, C0947jz.f2205e, true ^ tVar.f264347g, tVar.f264346f);
        tVar.f264349i = cVar;
        cVar.f325064m = new C92375o(tVar);
        C108587c cVar2 = tVar.f264349i;
        if (cVar2 != null) {
            cVar2.f325062k.post(new C108590e(cVar2, tVar.f264345e, new C92378s(tVar, Z40)));
        } else {
            C87412m.m108603p("mixPixelBuffer");
            throw null;
        }
    }

    /* renamed from: d */
    public String mo11854d() {
        return String.valueOf(this.f264328h);
    }
}
