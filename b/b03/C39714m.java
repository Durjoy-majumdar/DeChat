package b03;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import go3.C76003c;
import gy3.C87412m;
import ke3.C88144b;
import kg3.C76577a;
import qy2.C63347a;
import rz2.C48201c;

/* renamed from: b03.m */
public final class C39714m extends C76003c {

    /* renamed from: g */
    public static final int f106549g = C76577a.m92151b(MMApplicationContext.getContext(), 4);

    /* renamed from: e */
    public final C48201c f106550e;

    /* renamed from: f */
    public final C63347a.C47892c f106551f;

    public C39714m(Drawable drawable, int i, C48201c cVar, C63347a.C47892c cVar2) {
        super(drawable, i);
        this.f106550e = cVar;
        this.f106551f = cVar2;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        Paint paint2 = paint;
        C87412m.m108594g(paint2, "paint");
        super.draw(canvas, charSequence, i, i2, f + ((float) f106549g), i3, i4, i5, paint2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + f106549g;
    }

    public void onClick(View view) {
        C48201c cVar = this.f106550e;
        C63347a.C47892c cVar2 = this.f106551f;
        if (cVar != null && cVar2 != null && cVar2 == C63347a.C47892c.SNS_FEED && C87412m.m108589b(cVar.field_IconID, "2021")) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", cVar.field_UserName);
            C88144b.m109791i(view != null ? view.getContext() : null, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }
}
