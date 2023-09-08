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

/* renamed from: com.tencent.mm.plugin.location.ui.MyLocationButton */
public class MyLocationButton extends FrameLayout {

    /* renamed from: d */
    public Context f346345d;

    /* renamed from: e */
    public ImageButton f346346e;

    /* renamed from: f */
    public LinearLayout f346347f;

    /* renamed from: g */
    public C118913e f346348g;

    /* renamed from: h */
    public boolean f346349h = true;

    /* renamed from: i */
    public C92411b.C92412a f346350i = new C115514a();

    /* renamed from: com.tencent.mm.plugin.location.ui.MyLocationButton$a */
    public class C115514a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.location.ui.MyLocationButton$a$a */
        public class C115515a implements Runnable {
            public C115515a() {
            }

            public void run() {
                ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(MyLocationButton.this.f346350i);
            }
        }

        public C115514a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                return false;
            }
            MyLocationButton.this.f346347f.setVisibility(8);
            MyLocationButton.this.f346346e.setVisibility(0);
            MyLocationButton myLocationButton = MyLocationButton.this;
            C118913e eVar = myLocationButton.f346348g;
            if (eVar != null && myLocationButton.f346349h) {
                eVar.getIController().setCenter((double) f2, (double) f);
                if (MyLocationButton.this.f346348g.getZoomLevel() < 15) {
                    MyLocationButton.this.f346348g.getIController().setZoom(15);
                }
            }
            new MMHandler(Looper.getMainLooper()).post(new C115515a());
            return false;
        }
    }

    public MyLocationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f346345d = context;
        mo175497a();
    }

    /* renamed from: a */
    public final void mo175497a() {
        View inflate = View.inflate(this.f346345d, C0966R.C0971layout.bjq, this);
        this.f346346e = (ImageButton) inflate.findViewById(C0966R.C0970id.f358625g43);
        this.f346347f = (LinearLayout) inflate.findViewById(C0966R.C0970id.i7m);
    }

    public ImageButton getMyLocationBtn() {
        return this.f346346e;
    }

    public LinearLayout getProgressBar() {
        return this.f346347f;
    }

    public void setAnimToSelf(boolean z) {
        this.f346349h = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f346346e.setOnClickListener(onClickListener);
    }

    public void setProgressBar(C118913e eVar) {
        this.f346348g = eVar;
        this.f346347f.setVisibility(0);
        this.f346346e.setVisibility(8);
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126412f(this.f346350i, true);
    }

    public MyLocationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f346345d = context;
        mo175497a();
    }
}
