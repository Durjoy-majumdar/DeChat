package ps2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.io.Serializable;

/* renamed from: ps2.a */
public class C12004a implements Serializable {

    /* renamed from: d */
    public boolean f35001d;

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdCanvasParams");
        String str = "AdCanvasParams{isCompatible=" + this.f35001d + '}';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdCanvasParams");
        return str;
    }
}
