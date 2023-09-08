package vv1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import gy3.C87412m;

/* renamed from: vv1.c */
public final class C52998c implements MMWebView.C45106e {

    /* renamed from: d */
    public final /* synthetic */ C65887b f147907d;

    public C52998c(C65887b bVar) {
        this.f147907d = bVar;
    }

    /* renamed from: y2 */
    public final void mo24942y2(int i, int i2, int i3, int i4) {
        AppCompatActivity activity = this.f147907d.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).hideVKB();
    }
}
