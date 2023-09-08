package ib3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.vfs.C86013q1;
import gb3.C98096c;
import ud3.C102000f;
import xa3.C102587c;
import xa3.C102595k;

/* renamed from: ib3.s */
public class C98657s extends C98648o {

    /* renamed from: V */
    public ImageView f289263V;

    /* renamed from: W */
    public ImageView f289264W;

    /* renamed from: X */
    public ImageView f289265X;

    public C98657s(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        this.f289263V = (ImageView) view.findViewById(C0966R.C0970id.k17);
        MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.f359492l70);
        this.f289264W = (ImageView) view.findViewById(C0966R.C0970id.l7k);
        this.f289263V.setImageResource(C0966R.raw.shortvideo_play_btn);
        this.f289265X = (ImageView) view.findViewById(C0966R.C0970id.l6d);
        this.f289242J.setVisibility(8);
        this.f289237E.setVisibility(8);
        this.f289265X.setVisibility(8);
        this.f289241I.setTag(this);
        this.f289241I.setOnClickListener(this.f289249R);
    }

    /* renamed from: C */
    public View mo138063C() {
        return this.f289241I;
    }

    /* renamed from: y */
    public int mo138058y() {
        return 6;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        C102595k kVar = (C102595k) cVar;
        Bitmap f = C98096c.m126711f(kVar.f302084s, (String) null);
        if (f == null && C86013q1.m106450k(kVar.f302101r) && (f = C93693r.m118401b(kVar.f302101r)) != null) {
            try {
                if (C86013q1.m106450k(kVar.f302084s)) {
                    C86013q1.m106447h(kVar.f302084s);
                }
                C102000f.m134325a(f, 60, Bitmap.CompressFormat.JPEG, kVar.f302084s, false);
            } catch (Exception unused) {
            }
        }
        if (f != null) {
            ViewGroup.LayoutParams layoutParams = this.f289264W.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f289264W.setLayoutParams(layoutParams);
            this.f289264W.setImageBitmap(f);
            this.f289264W.setBackground((Drawable) null);
        } else {
            DisplayMetrics displayMetrics = this.f289264W.getResources().getDisplayMetrics();
            ViewGroup.LayoutParams layoutParams2 = this.f289264W.getLayoutParams();
            int i3 = displayMetrics.widthPixels - ((int) ((displayMetrics.density * 40.0f) + 0.5f));
            layoutParams2.width = i3;
            layoutParams2.height = (i3 * 52) / 68;
            this.f289264W.setLayoutParams(layoutParams2);
        }
        if (cVar.f302078i) {
            this.f289265X.setVisibility(0);
        } else {
            this.f289265X.setVisibility(8);
        }
        super.mo138059z(cVar, i, i2);
    }
}
