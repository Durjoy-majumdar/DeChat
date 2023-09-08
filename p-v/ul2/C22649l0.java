package ul2;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanSharedMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import vl2.C22772v;

/* renamed from: ul2.l0 */
public final class C22649l0 implements C22772v.C22773a {

    /* renamed from: a */
    public final /* synthetic */ ScanSharedMaskView f65136a;

    public C22649l0(ScanSharedMaskView scanSharedMaskView) {
        this.f65136a = scanSharedMaskView;
    }

    /* renamed from: a */
    public void mo35766a(boolean z) {
        this.f65136a.f53820w = true;
    }

    /* renamed from: b */
    public void mo35767b(boolean z) {
    }

    /* renamed from: c */
    public void mo35768c() {
        ScanSharedMaskView scanSharedMaskView = this.f65136a;
        scanSharedMaskView.f53820w = false;
        Log.m105925i("MicroMsg.ScanSharedMaskView", "alvinluo onShowTaskEnd isFlashShow: %b, showToast: %b", Boolean.valueOf(scanSharedMaskView.f53821x), Boolean.valueOf(this.f65136a.f53801B));
        ScanSharedMaskView scanSharedMaskView2 = this.f65136a;
        if (!scanSharedMaskView2.f53821x) {
            if (scanSharedMaskView2.f53801B) {
                scanSharedMaskView2.f53801B = false;
                if (scanSharedMaskView2.f53819v == null) {
                    C22772v vVar = new C22772v();
                    TextView textView = scanSharedMaskView2.f53807g;
                    if (textView != null) {
                        vVar.f65497a = textView;
                        vVar.f65498b = 2000;
                        vVar.f65499c = new C22650m0(scanSharedMaskView2);
                        scanSharedMaskView2.f53819v = vVar;
                    } else {
                        C87412m.m108603p("scanToast");
                        throw null;
                    }
                }
                C22772v vVar2 = scanSharedMaskView2.f53819v;
                if (vVar2 != null) {
                    vVar2.mo35868b(true);
                    return;
                }
                return;
            }
            scanSharedMaskView2.mo24472c(true);
        }
    }

    /* renamed from: d */
    public void mo35769d(boolean z) {
        ScanSharedMaskView scanSharedMaskView = this.f65136a;
        TextView textView = scanSharedMaskView.f53805e;
        if (textView != null) {
            textView.setShadowLayer(10.0f, 0.0f, 0.0f, scanSharedMaskView.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        } else {
            C87412m.m108603p("scanTitle");
            throw null;
        }
    }
}
