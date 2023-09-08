package ul2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.sdk.platformtools.PlaySound;

/* renamed from: ul2.r */
public final class C111216r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333041d;

    public C111216r(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f333041d = scanCodeProductMergeMaskView;
    }

    public final void run() {
        PlaySound.play(this.f333041d.getContext(), C0966R.string.hq6);
    }
}
