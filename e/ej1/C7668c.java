package ej1;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import de3.C75375u;
import ej1.C7670d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: ej1.c */
public final class C7668c extends C87413o implements C32226l<CharSequence, C75375u> {

    /* renamed from: d */
    public final /* synthetic */ int f26026d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7668c(int i) {
        super(1);
        this.f26026d = i;
    }

    public Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        return (C75375u) ((C7670d.C7672b) C7670d.f26031k).invoke(charSequence, Integer.valueOf(this.f26026d));
    }
}
