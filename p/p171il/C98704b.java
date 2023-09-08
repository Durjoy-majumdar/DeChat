package p171il;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p813fl.C97904g;
import p813fl.C97927q0;

/* renamed from: il.b */
public final class C98704b extends C98736p {

    /* renamed from: D */
    public final View f289442D;

    /* renamed from: E */
    public final View f289443E;

    /* renamed from: F */
    public final View f289444F;

    /* renamed from: il.b$a */
    public /* synthetic */ class C98705a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f289445a;

        static {
            int[] iArr = new int[IEmojiInfo.C40005a.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[3] = 3;
            iArr[2] = 4;
            iArr[4] = 5;
            f289445a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98704b(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.cel);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…ji_capture_status_layout)");
        this.f289442D = findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.cej);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…oji_capture_loading_view)");
        this.f289443E = findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.cef);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.…oji_capture_failure_view)");
        this.f289444F = findViewById3;
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        super.mo136856y(q0Var);
        C97904g gVar = (C97904g) this.f289539A;
        if (gVar != null) {
            IEmojiInfo.C40005a T1 = gVar.f287200b.mo62647T1();
            int i = T1 == null ? -1 : C98705a.f289445a[T1.ordinal()];
            if (i == -1 || i == 1) {
                View view = this.f289442D;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 2 || i == 3) {
                View view2 = this.f289442D;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f289443E;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view6 = this.f289444F;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 4 || i == 5) {
                View view8 = this.f289442D;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view10 = this.f289443E;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view11 = view10;
                C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view12 = this.f289444F;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view13 = view12;
                C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/emoji/panel/adapter/EmojiLoadingPanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
