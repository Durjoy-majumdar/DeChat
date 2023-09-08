package bu0;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import js0.C88020k;

/* renamed from: bu0.e */
public class C79832e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f233980d;

    /* renamed from: e */
    public final /* synthetic */ String f233981e;

    /* renamed from: f */
    public final /* synthetic */ String f233982f;

    /* renamed from: g */
    public final /* synthetic */ String f233983g;

    /* renamed from: h */
    public final /* synthetic */ C79819c f233984h;

    public C79832e(C79819c cVar, String str, String str2, String str3, String str4) {
        this.f233984h = cVar;
        this.f233980d = str;
        this.f233981e = str2;
        this.f233982f = str3;
        this.f233983g = str4;
    }

    public void run() {
        C79819c cVar = this.f233984h;
        String str = this.f233980d;
        String str2 = this.f233981e;
        int i = C79819c.f233939q;
        cVar.getClass();
        int parseColor = Color.parseColor("#E6000000");
        try {
            parseColor = C88020k.m109562m(str);
        } catch (Exception unused) {
        }
        cVar.f233943g = parseColor;
        int parseColor2 = Color.parseColor("#07C160");
        try {
            parseColor2 = C88020k.m109562m(str2);
        } catch (Exception unused2) {
        }
        cVar.f233944h = parseColor2;
        C79819c cVar2 = this.f233984h;
        String str3 = this.f233982f;
        String str4 = this.f233983g;
        float c = ((float) C79819c.m96975c(cVar2.getContext(), 1)) / 2.0f;
        int i2 = c > 1.0f ? (int) c : 1;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = -1;
        try {
            i3 = C88020k.m109562m(str3);
        } catch (Exception unused3) {
        }
        gradientDrawable.setColor(i3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(0);
        if ("white".equals(str4)) {
            gradientDrawable2.setStroke(i2, 872415231);
        } else {
            gradientDrawable2.setStroke(i2, 855638016);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
        if ("top".equals(cVar2.f233942f)) {
            int i4 = -i2;
            layerDrawable.setLayerInset(1, i4, i4, i4, i4);
        } else {
            int i5 = -i2;
            layerDrawable.setLayerInset(1, i5, 0, i5, i5);
        }
        cVar2.setBackground(layerDrawable);
        C79819c cVar3 = this.f233984h;
        cVar3.getClass();
        cVar3.mo110002e(new C79818b(cVar3));
    }
}
