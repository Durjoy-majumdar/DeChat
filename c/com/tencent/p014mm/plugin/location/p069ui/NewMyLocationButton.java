package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import p702ts.C78085c;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location.ui.NewMyLocationButton */
public class NewMyLocationButton extends FrameLayout {

    /* renamed from: d */
    public Context f346359d;

    /* renamed from: e */
    public ImageButton f346360e;

    /* renamed from: f */
    public LinearLayout f346361f;

    /* renamed from: g */
    public C118913e f346362g;

    /* renamed from: h */
    public boolean f346363h = true;

    /* renamed from: i */
    public C92411b.C92412a f346364i = new C115517a();

    /* renamed from: com.tencent.mm.plugin.location.ui.NewMyLocationButton$a */
    public class C115517a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.location.ui.NewMyLocationButton$a$a */
        public class C115518a implements Runnable {
            public C115518a() {
            }

            public void run() {
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(NewMyLocationButton.this.f346364i);
            }
        }

        public C115517a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                return false;
            }
            NewMyLocationButton.this.f346361f.setVisibility(8);
            NewMyLocationButton.this.f346360e.setVisibility(0);
            NewMyLocationButton newMyLocationButton = NewMyLocationButton.this;
            C118913e eVar = newMyLocationButton.f346362g;
            if (eVar != null && newMyLocationButton.f346363h) {
                eVar.getIController().setCenter((double) f2, (double) f);
                if (NewMyLocationButton.this.f346362g.getZoomLevel() < 15) {
                    NewMyLocationButton.this.f346362g.getIController().setZoom(15);
                }
            }
            new MMHandler(Looper.getMainLooper()).post(new C115518a());
            return false;
        }
    }

    public NewMyLocationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f346359d = context;
        mo175506a();
    }

    /* renamed from: a */
    public final void mo175506a() {
        View inflate = View.inflate(this.f346359d, C0966R.C0971layout.bku, this);
        this.f346360e = (ImageButton) inflate.findViewById(C0966R.C0970id.hdj);
        this.f346361f = (LinearLayout) inflate.findViewById(C0966R.C0970id.hdu);
    }

    public void setAnimToSelf(boolean z) {
        this.f346363h = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f346360e.setOnClickListener(onClickListener);
    }

    public void setProgressBar(C118913e eVar) {
        this.f346362g = eVar;
        this.f346361f.setVisibility(0);
        this.f346360e.setVisibility(8);
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126412f(this.f346364i, true);
    }

    public void setSelected(boolean z) {
        if (z != this.f346360e.isSelected()) {
            this.f346360e.setSelected(z);
        }
    }

    public NewMyLocationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f346359d = context;
        mo175506a();
    }
}
