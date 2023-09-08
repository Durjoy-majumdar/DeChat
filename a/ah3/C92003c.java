package ah3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.panel.EmojiPanelRecyclerView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p1082hl.C98468a;
import wg3.C102442a;
import wg3.C102444c;
import yg3.C102860c;

/* renamed from: ah3.c */
public final class C92003c extends RelativeLayout implements View.OnClickListener {

    /* renamed from: d */
    public final C92002b f263390d;

    /* renamed from: e */
    public C102442a f263391e = new C102444c();

    /* renamed from: f */
    public C92001a f263392f = new C92001a();

    /* renamed from: g */
    public EmojiPanelRecyclerView f263393g;

    /* renamed from: h */
    public boolean f263394h = true;

    /* renamed from: ah3.c$a */
    public static final class C92004a extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ C92003c f263395b;

        /* renamed from: c */
        public final /* synthetic */ GridLayoutManager f263396c;

        public C92004a(C92003c cVar, GridLayoutManager gridLayoutManager) {
            this.f263395b = cVar;
            this.f263396c = gridLayoutManager;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            int itemViewType = this.f263395b.f263392f.getItemViewType(i);
            if (itemViewType == 100 || itemViewType == 101 || itemViewType == 105 || itemViewType == 106) {
                return this.f263396c.f44669w;
            }
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92003c(Context context, C92002b bVar) {
        super(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
        this.f263390d = bVar;
        ((C102444c) this.f263391e).mo142013a();
        setBackgroundColor(context.getResources().getColor(C0966R.color.ahf));
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359984c03, this, true);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        relativeLayout.findViewById(C0966R.C0970id.beq).setOnClickListener(this);
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.cfy);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.emoji_list)");
        this.f263393g = (EmojiPanelRecyclerView) findViewById;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
        gridLayoutManager.f44666B = new C92004a(this, gridLayoutManager);
        this.f263393g.setLayoutManager(gridLayoutManager);
        this.f263393g.setItemViewCacheSize(0);
        this.f263393g.setAdapter(this.f263392f);
        EmojiPanelRecyclerView emojiPanelRecyclerView = this.f263393g;
        emojiPanelRecyclerView.getClass();
        emojiPanelRecyclerView.mo17043c(new C98468a(emojiPanelRecyclerView));
        this.f263393g.setScene(1);
        this.f263393g.setEmojiPopupType(3);
        C92001a aVar = this.f263392f;
        int i = ChatFooterPanel.f211589f;
        aVar.f289521f = new C102860c(1);
    }

    public final C92002b getDialog() {
        return this.f263390d;
    }

    public void onClick(View view) {
        C92002b bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/search/ui/SimilarEmojiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.beq || (bVar = this.f263390d) == null)) {
            bVar.cancel();
        }
        C117292a.m165361g(this, "com/tencent/mm/search/ui/SimilarEmojiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
