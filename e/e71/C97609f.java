package e71;

import com.tencent.p014mm.plugin.emojicapture.p841ui.StickerPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nd3.C88930e;

/* renamed from: e71.f */
public final class C97609f implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ StickerPreviewUI f286340a;

    public C97609f(StickerPreviewUI stickerPreviewUI) {
        this.f286340a = stickerPreviewUI;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108593f(iArr, "results");
        int length = iArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (iArr[i2] != 0) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            Log.m105928w(this.f286340a.f269213d, "request permission: not granted");
            this.f286340a.finish();
        }
    }
}
