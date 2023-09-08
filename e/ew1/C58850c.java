package ew1;

import android.widget.ImageView;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import di3.C86301e;
import ei3.C86522b;
import ew1.C97754e;
import gy3.C87412m;
import ow1.C100562c0;
import p143ds.C58433i;
import p851es.C58800a;

@C86522b
/* renamed from: ew1.c */
public final class C58850c extends C86301e implements C58433i {
    public void Bc0(ImageView imageView, int i, String str, String str2, long j, int i2, long j2) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "thumbFilePath");
        C87412m.m108594g(str2, "orgFilePath");
        C100562c0.m131590a(imageView, i, str, str2, j, i2, j2);
    }

    public void Eo0(ImageView imageView, int i, String str, String str2, long j, long j2) {
        ImageView imageView2 = imageView;
        C87412m.m108594g(imageView, "imageView");
        String str3 = str;
        C87412m.m108594g(str, "thumbFilePath");
        C87412m.m108594g(str2, "orgFilePath");
        C100562c0.m131592c(imageView, i, str, str2, j, -1, (C58800a) null, (C93974o.C93980f) null, j2);
    }

    /* renamed from: dD */
    public void mo83379dD(int i) {
        C97754e.C97756b.f286807a.mo137084c(i);
    }

    /* renamed from: o5 */
    public void mo83380o5(ImageView imageView, int i, String str, String str2, long j, int i2, C58800a aVar, long j2) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "thumbFilePath");
        C87412m.m108594g(str2, "orgFilePath");
        C100562c0.m131591b(imageView, i, str, str2, j, i2, aVar, j2);
    }
}
