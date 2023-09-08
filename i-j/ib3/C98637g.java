package ib3;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gb3.C98096c;
import xa3.C102587c;
import xa3.C102590f;

/* renamed from: ib3.g */
public class C98637g extends C98648o {

    /* renamed from: V */
    public ImageView f289206V;

    /* renamed from: W */
    public int f289207W = 0;

    public C98637g(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        this.f289234B.setVisibility(0);
        this.f289242J.setVisibility(8);
        this.f289237E.setVisibility(8);
        this.f289234B.setTag(this);
        this.f289234B.setOnClickListener(this.f289249R);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4x);
        this.f289206V = imageView;
        imageView.setVisibility(8);
        this.f289207W = C96679b.f283183s - ((int) TypedValue.applyDimension(1, 20.0f, C96679b.f283184t));
    }

    /* renamed from: C */
    public View mo138063C() {
        return this.f289234B;
    }

    /* renamed from: y */
    public int mo138058y() {
        return 2;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        C102590f fVar = (C102590f) cVar;
        String str = fVar.f302101r;
        String str2 = fVar.f302104s;
        if (!C86013q1.m106450k(str)) {
            str = C86013q1.m106450k(str2) ? str2 : null;
        }
        if (this.f289192z.f283197m == 3) {
            if (!C86013q1.m106450k(str2)) {
                str2 = str;
            }
            str = str2;
        }
        Bitmap f = Util.isNullOrNil(str) ? null : C98096c.m126711f(str, (String) null);
        this.f289234B.setImageBitmap((Bitmap) null);
        ViewGroup.LayoutParams layoutParams = this.f289234B.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f289234B.setLayoutParams(layoutParams);
        if (f != null) {
            this.f289234B.setImageBitmap(f);
        } else {
            this.f289234B.setImageBitmap((Bitmap) null);
            ViewGroup.LayoutParams layoutParams2 = this.f289234B.getLayoutParams();
            int i3 = this.f289207W;
            layoutParams2.width = i3;
            layoutParams2.height = i3;
            this.f289234B.setLayoutParams(layoutParams2);
            this.f289234B.setBackgroundColor(Color.parseColor("#f6f6f6"));
        }
        if (cVar.f302078i) {
            this.f289206V.setVisibility(0);
        } else {
            this.f289206V.setVisibility(8);
        }
        super.mo138059z(cVar, i, i2);
    }
}
