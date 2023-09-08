package xz0;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import wz0.C53263p;

/* renamed from: xz0.a */
public abstract class C23145a implements C23154i {

    /* renamed from: a */
    public C20483c f66472a;

    /* renamed from: b */
    public Context f66473b;

    /* renamed from: c */
    public View f66474c;

    /* renamed from: d */
    public ImageView f66475d;

    /* renamed from: e */
    public TextView f66476e;

    /* renamed from: f */
    public View.OnClickListener f66477f;

    public C23145a(Context context) {
        this.f66473b = context;
    }

    /* renamed from: a */
    public void mo36522a(ShapeDrawable shapeDrawable) {
    }

    /* renamed from: b */
    public void mo36523b(boolean z) {
    }

    /* renamed from: c */
    public void mo36524c(int i) {
    }

    /* renamed from: d */
    public void mo36525d(boolean z) {
    }

    /* renamed from: e */
    public void mo36526e(boolean z, boolean z2) {
    }

    /* renamed from: f */
    public View mo36527f() {
        C20483c cVar = this.f66472a;
        if (cVar == null || cVar.mo23264L0() == null) {
            Log.m105920e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
            return null;
        }
        LayoutInflater layoutInflater = (LayoutInflater) this.f66473b.getSystemService("layout_inflater");
        boolean h = this.f66472a.mo23284h();
        int i = C0966R.C0971layout.f6703m9;
        if (!h) {
            if (this.f66472a.mo23271R1()) {
                i = C0966R.C0971layout.f6786oh;
            } else if (this.f66472a.mo23291o()) {
                i = C0966R.C0971layout.f6756no;
            } else if (this.f66472a.mo23289m0()) {
                i = C0966R.C0971layout.f6710mf;
            } else if (this.f66472a.mo23285h2()) {
                i = C0966R.C0971layout.f6745nd;
            }
        }
        View inflate = layoutInflater.inflate(i, (ViewGroup) null);
        this.f66474c = inflate;
        this.f66475d = (ImageView) inflate.findViewById(C0966R.C0970id.f6046vt);
        this.f66476e = (TextView) this.f66474c.findViewById(C0966R.C0970id.f6056w3);
        mo36528g();
        mo36530i();
        return this.f66474c;
    }

    /* renamed from: g */
    public abstract void mo36528g();

    /* renamed from: h */
    public abstract void mo36529h();

    /* renamed from: i */
    public final void mo36530i() {
        C20483c cVar = this.f66472a;
        if (cVar == null || cVar.mo23264L0() == null) {
            Log.m105920e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
            return;
        }
        if (!Util.isNullOrNil(this.f66472a.mo23264L0().f64137e)) {
            int dimensionPixelSize = this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f4215wg);
            if (this.f66472a.mo23267O() && this.f66472a.mo23284h()) {
                dimensionPixelSize = this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f4235x4);
            } else if (this.f66472a.mo23267O() && this.f66472a.mo23291o()) {
                dimensionPixelSize = this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f4235x4);
            } else if (this.f66472a.mo23267O() && this.f66472a.mo23271R1()) {
                dimensionPixelSize = this.f66473b.getResources().getDimensionPixelSize(C0966R.dimen.f4245xf);
            } else if (this.f66472a.mo23285h2()) {
                dimensionPixelSize = 0;
            }
            if (dimensionPixelSize > 0) {
                C53263p.m59701b(this.f66475d, this.f66472a.mo23264L0().f64137e, dimensionPixelSize, C0966R.C0969drawable.f357296c91, true);
            }
        } else if (this.f66472a.mo23284h()) {
            this.f66475d.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f66472a.mo23264L0().f64142j)) {
            this.f66476e.setText(this.f66472a.mo23264L0().f64142j);
        }
        mo36529h();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f66477f = onClickListener;
    }
}
