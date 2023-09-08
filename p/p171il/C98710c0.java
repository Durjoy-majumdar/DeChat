package p171il;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p813fl.C97904g;
import p813fl.C97927q0;

/* renamed from: il.c0 */
public class C98710c0 extends C98748z<C97904g> {

    /* renamed from: B */
    public boolean f289451B;

    /* renamed from: C */
    public final EmojiStatusView f289452C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98710c0(View view, boolean z, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        this.f289451B = z;
        View findViewById = view.findViewById(C0966R.C0970id.f6152yr);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.art_emoji_icon_iv)");
        this.f289452C = (EmojiStatusView) findViewById;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C97904g gVar;
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        View findViewById = this.f44854d.findViewById(C0966R.C0970id.f5292b4);
        int i = this.f289451B ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiHeadViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiHeadViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f289452C.getEmojiInfo() == null && (gVar = (C97904g) this.f289539A) != null) {
            this.f289452C.setEmojiInfo(gVar.f287200b);
        }
    }
}
