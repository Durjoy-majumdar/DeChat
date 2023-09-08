package s61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import kg3.C76577a;
import p260wk.C102457e;
import u61.C101962d;
import z51.C39315g;

/* renamed from: s61.n */
public final class C101553n extends C101540a<C101552m> {

    /* renamed from: B */
    public final String f297297B = "MicroMsg.PreviewSingleEmotionViewHolder";

    /* renamed from: C */
    public final ImageView f297298C;

    /* renamed from: D */
    public final Drawable f297299D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101553n(Context context, View view, C101542b bVar) {
        super(view, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.aqa);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.art_emotion_icon_iv)");
        this.f297298C = (ImageView) findViewById;
        int d = C76577a.m92153d(context, C0966R.color.ahf);
        int d2 = C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_0_5);
        float h = (float) C76577a.m92157h(context, C0966R.dimen.auz);
        this.f297299D = C101962d.f300168a.mo141484b(d, d2, h, h, h, h);
    }

    /* renamed from: y */
    public void mo141016y(C101543c cVar) {
        C87412m.m108594g(cVar, "dataItem");
        this.f297278A = cVar;
        this.f44854d.setBackground(this.f297299D);
        C101552m mVar = cVar instanceof C101552m ? (C101552m) cVar : null;
        EmojiInfo emojiInfo = mVar != null ? mVar.f297296a : null;
        if (emojiInfo != null) {
            C102457e.f301712a.mo142072d(emojiInfo, this.f297298C, (Drawable) null);
            this.f297298C.setContentDescription(((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138012T(emojiInfo.getMd5()));
        }
        String str = this.f297297B;
        Log.m105918d(str, "onBind, hash:" + hashCode());
    }
}
