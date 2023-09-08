package com.tencent.p014mm.plugin.appbrand.p026ui.record;

import com.tencent.p014mm.C0966R;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareLandscapeUI;", "Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareLandscapeUI */
public final class WAGameRecordShareLandscapeUI extends WAGameRecordShareUI {
    /* renamed from: J7 */
    public int mo117383J7(int i) {
        double d;
        double d2;
        if (i == C0966R.C0971layout.d0w) {
            d = (double) getResources().getDisplayMetrics().heightPixels;
            d2 = 0.92d;
        } else if (i != C0966R.C0971layout.d3k) {
            return 0;
        } else {
            d = (double) getResources().getDisplayMetrics().heightPixels;
            d2 = 0.82d;
        }
        return (int) (d * d2);
    }

    /* renamed from: K7 */
    public double mo117384K7() {
        return 0.52d;
    }

    public int getForceOrientation() {
        return 0;
    }

    public void setMMOrientation() {
        setRequestedOrientation(0);
    }
}
