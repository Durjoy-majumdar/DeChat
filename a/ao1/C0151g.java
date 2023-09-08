package ao1;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C51401ti1;

/* renamed from: ao1.g */
public final class C0151g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ TextView f588a;

    /* renamed from: b */
    public final /* synthetic */ C0166l f589b;

    public C0151g(TextView textView, C0166l lVar) {
        this.f588a = textView;
        this.f589b = lVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("Finder.PostCreateContactUIC", "errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            String str = ((C51401ti1) cVar.f256796d).f142239d;
            Log.m105924i("Finder.PostCreateContactUIC", "nickName: " + str);
            boolean z = false;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                }
            }
            if (z) {
                this.f588a.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f589b.getContext(), str));
                C87412m.m108594g(str, "<set-?>");
                C0166l.f618h = str;
            } else {
                C0166l.f618h = "";
            }
        } else {
            C0166l.f618h = "";
        }
        return C13598b0.f38549a;
    }
}
