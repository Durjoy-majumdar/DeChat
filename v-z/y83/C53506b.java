package y83;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: y83.b */
public class C53506b implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C53505a f150457d;

    public C53506b(C53505a aVar) {
        this.f150457d = aVar;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 3456 && intent != null && this.f150457d != null) {
            Bundle bundleExtra = intent.getBundleExtra("input_data");
            if (intent.getBooleanExtra("event_type", false)) {
                this.f150457d.mo41060a(bundleExtra);
            } else {
                this.f150457d.onCallback(bundleExtra);
            }
        }
    }
}
