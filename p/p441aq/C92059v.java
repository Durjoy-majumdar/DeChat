package p441aq;

import ah3.C92001a;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.view.SmileyPanelImpl;
import cs1.C97365a;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import p008bq.C92290u0;
import p171il.C60337u;
import p171il.C98711d;
import p171il.C98745v;
import p171il.C98746w;
import p813fl.C97927q0;
import yg3.C102859a;
import yg3.C102861d;

@C86522b
/* renamed from: aq.v */
public final class C92059v extends C86301e implements C92290u0 {
    public void O90(View view, Context context, int i, C97927q0 q0Var) {
        C87412m.m108594g(context, "context");
        C102861d dVar = C102859a.f303616a;
        if (dVar != null) {
            dVar.mo127711c(view, context, i, q0Var);
        }
    }

    /* renamed from: RS */
    public C98745v mo126049RS() {
        return new C97365a();
    }

    /* renamed from: X1 */
    public void mo126050X1(IEmojiInfo iEmojiInfo) {
        C72837v1 v1Var;
        C102861d dVar = C102859a.f303616a;
        if (dVar != null && (v1Var = dVar.f289454b) != null) {
            v1Var.mo65586X1((EmojiInfo) iEmojiInfo);
        }
    }

    /* renamed from: le */
    public C60337u mo126051le(int i) {
        return new C98711d(i);
    }

    /* renamed from: lo */
    public C98746w mo126052lo() {
        return new C92001a();
    }

    /* renamed from: tm */
    public ChatFooterPanel mo126053tm(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        return new SmileyPanelImpl(context, z);
    }
}
