package ej1;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import cj1.C0575n3;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C52021xu0;

/* renamed from: ej1.h0 */
public final class C7684h0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C0581o5 f26048d;

    /* renamed from: e */
    public final /* synthetic */ C7686i0 f26049e;

    /* renamed from: f */
    public final /* synthetic */ Context f26050f;

    public C7684h0(C0581o5 o5Var, C7686i0 i0Var, Context context) {
        this.f26048d = o5Var;
        this.f26049e = i0Var;
        this.f26050f = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemSendRedPacket$onBindSendLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C0581o5 o5Var = this.f26048d;
        if (o5Var instanceof C0575n3) {
            Object q = o5Var.mo563q();
            C87412m.m108592e(q, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgSendRedPacketInfo");
            String str = ((C52021xu0) q).f144969d;
            if (str != null) {
                this.f26049e.mo3196m(this.f26050f, str);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemSendRedPacket$onBindSendLuckyMoneyMsg$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f26050f.getResources().getColor(C0966R.color.f3416s4));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
