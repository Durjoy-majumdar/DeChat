package p171il;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import p260wk.C102457e;
import p813fl.C97904g;
import p813fl.C97927q0;
import u61.C101964h;
import z51.C39315g;

/* renamed from: il.p */
public class C98736p extends C98748z<C97904g> {

    /* renamed from: B */
    public final ImageView f289523B;

    /* renamed from: C */
    public final TextView f289524C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98736p(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.f6152yr);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.art_emoji_icon_iv)");
        this.f289523B = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f6153ys);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.art_emoji_icon_text)");
        this.f289524C = (TextView) findViewById2;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        Class cls = C39315g.class;
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        C97904g gVar = (C97904g) q0Var;
        if (gVar.f287201c != 3) {
            C102457e eVar = C102457e.f301712a;
            IEmojiInfo iEmojiInfo = gVar.f287200b;
            C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            eVar.mo142072d((EmojiInfo) iEmojiInfo, this.f289523B, (Drawable) null);
        } else {
            C102457e.f301712a.mo142070b(this.f289523B);
            this.f289523B.setImageResource(C0966R.C0969drawable.emoji_download_icon);
        }
        if (gVar.f287201c == 2) {
            this.f289524C.setVisibility(0);
            String T = ((C39315g) C86312j.m106911c(cls)).getProvider().mo138012T(gVar.f287200b.getMd5());
            this.f289524C.setText(T);
            this.f289523B.setContentDescription(T);
        } else {
            if (gVar.f287200b.getMd5().equals("08f223fa83f1ca34e143d1e580252c7c")) {
                this.f289523B.setContentDescription(this.f44854d.getContext().getString(C0966R.string.f360368c63));
            } else if (gVar.f287200b.getMd5().equals("9bd1281af3a31710a45b84d736363691")) {
                this.f289523B.setContentDescription(this.f44854d.getContext().getString(C0966R.string.c6h));
            } else {
                this.f289523B.setContentDescription(((C39315g) C86312j.m106911c(cls)).getProvider().mo138012T(gVar.f287200b.getMd5()));
            }
            this.f289524C.setVisibility(8);
        }
        IEmojiInfo iEmojiInfo2 = gVar.f287200b;
        ArrayList<String> arrayList = C101964h.f300169a;
        if (Util.isEqual(iEmojiInfo2.getGroupId(), "capture")) {
            this.f289523B.setContentDescription(this.f44854d.getContext().getString(C0966R.string.c5w));
        }
    }
}
