package rs1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import pf1.C11920q;
import pf1.C62262d0;
import rx3.C13598b0;

/* renamed from: rs1.e1 */
public final class C13210e1 extends C87413o implements C32228q<DialogInterface, Integer, CharSequence, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f37545d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37546e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13210e1(Context context, C60905o oVar) {
        super(3);
        this.f37545d = context;
        this.f37546e = oVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        CharSequence charSequence = (CharSequence) obj3;
        C87412m.m108594g((DialogInterface) obj, "dialog");
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        String obj4 = charSequence.toString();
        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
        finderJumpInfo.jumpinfo_type = 2;
        Html5Info html5Info = new Html5Info();
        html5Info.url = obj4;
        html5Info.style = 1;
        html5Info.webview_ext_info = "test for debug";
        finderJumpInfo.html5_info = html5Info;
        finderJumpInfo.business_type = 2;
        C62262d0.f176978a.mo87320k(this.f37545d, new C11920q(finderJumpInfo), this.f37546e);
        return C13598b0.f38549a;
    }
}
