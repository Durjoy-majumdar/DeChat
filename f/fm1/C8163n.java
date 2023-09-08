package fm1;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import fm1.C8139f;
import gy3.C87412m;
import x50.C15626c;

/* renamed from: fm1.n */
public final class C8163n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f27039d;

    /* renamed from: e */
    public final /* synthetic */ C8139f f27040e;

    /* renamed from: f */
    public final /* synthetic */ View f27041f;

    public C8163n(String str, C8139f fVar, View view) {
        this.f27039d = str;
        this.f27040e = fVar;
        this.f27041f = view;
    }

    public final void run() {
        C8139f.C8140a aVar;
        TabLayout.C55061f k;
        if (!TextUtils.isEmpty(this.f27039d)) {
            TabLayout f3 = this.f27040e.mo9206f3();
            TextView textView = null;
            if (f3 == null || (k = f3.mo146907k(0)) == null) {
                aVar = null;
            } else {
                Object obj = k.f154600a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                aVar = (C8139f.C8140a) obj;
            }
            if (aVar != null) {
                textView = aVar.f27011c;
            }
            if (textView != null) {
                textView.setText(this.f27039d);
            }
            if (this.f27039d.length() != 2) {
                int length = (this.f27039d.length() - 2) * C15626c.m14629a(this.f27040e.getActivity(), 15.0f);
                if (this.f27041f.getLayoutParams() != null) {
                    ViewGroup.LayoutParams layoutParams = this.f27041f.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.leftMargin -= length;
                    this.f27041f.setLayoutParams(layoutParams2);
                }
            }
        }
    }
}
