package vg1;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: vg1.d */
public final class C52889d implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ View f147698d;

    /* renamed from: e */
    public final /* synthetic */ C52890e f147699e;

    public C52889d(View view, C52890e eVar) {
        this.f147698d = view;
        this.f147699e = eVar;
    }

    public final void onDismiss() {
        this.f147698d.setBackground(this.f147699e.f147703d);
    }
}
