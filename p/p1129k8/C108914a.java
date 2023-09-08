package p1129k8;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.C104438a;
import com.google.android.material.chip.Chip;

/* renamed from: k8.a */
public class C108914a extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f326276a;

    public C108914a(Chip chip) {
        this.f326276a = chip;
    }

    public void getOutline(View view, Outline outline) {
        C104438a aVar = this.f326276a.f309267e;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
