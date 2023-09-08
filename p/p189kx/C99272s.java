package p189kx;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine;
import com.tencent.qbar.C19934c;
import di3.C86301e;
import ei3.C86522b;
import p200lx.C99712h0;
import p200lx.C99716u;
import rw3.C22255b;
import zt3.C119157j;

@C86522b
/* renamed from: kx.s */
public class C99272s extends C86301e implements C99716u {
    public C94533d B80(MMActivity mMActivity) {
        return new ImageWordScanDetailEngine(mMActivity);
    }

    /* renamed from: NE */
    public void mo138680NE() {
        ((C119157j) C119157j.f356862d).mo183876g(new C22255b(), "WordDetectThread");
    }

    public C99712h0 wa0() {
        return C19934c.f56868h;
    }

    public C94533d zj0(MMActivity mMActivity, boolean z) {
        return new ImageWordScanDetailEngine(mMActivity, z);
    }
}
