package od1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import pe3.C47465a;

/* renamed from: od1.g */
public class C11404g<T extends C47465a> extends C11407i<T> {

    /* renamed from: g */
    public FrameLayout f33560g;

    /* renamed from: h */
    public ProgressBar f33561h;

    /* renamed from: i */
    public TextView f33562i;

    /* renamed from: j */
    public Drawable f33563j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11404g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        FrameLayout frameLayout = this.f33560g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ProgressBar progressBar = this.f33561h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(C85875k4.m106211z());
    }

    /* renamed from: d3 */
    public void mo327d3(int i, String str) {
        FrameLayout frameLayout = this.f33560g;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ProgressBar progressBar = this.f33561h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: g3 */
    public void mo492g3(T t) {
        super.mo492g3(t);
        if (mo11419l3()) {
            FrameLayout frameLayout = this.f33560g;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.f33560g;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundColor(0);
            }
            ProgressBar progressBar = this.f33561h;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.f33562i;
            if (textView != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.f33560g;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo509k3() {
        /*
            r3 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
            r1 = 2131301640(0x7f091508, float:1.8221344E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.f33560g = r0
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r2 = 2131296608(0x7f090160, float:1.8211137E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            r3.f33561h = r0
            android.widget.FrameLayout r0 = r3.f33560g
            if (r0 == 0) goto L_0x002d
            r1 = 2131301630(0x7f0914fe, float:1.8221323E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x002d:
            r3.f33562i = r1
            android.graphics.drawable.Drawable r0 = r3.f33563j
            if (r0 == 0) goto L_0x003b
            android.widget.FrameLayout r1 = r3.f33560g
            if (r1 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r1.setBackground(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od1.C11404g.mo509k3():void");
    }

    /* renamed from: l3 */
    public boolean mo11419l3() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo509k3();
        FrameLayout frameLayout = this.f33560g;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        ProgressBar progressBar = this.f33561h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        TextView textView = this.f33562i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
