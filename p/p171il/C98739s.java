package p171il;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i61.C98602h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import o40.C61926c;
import p441aq.C92054g;
import p595ll.C46875a;
import p813fl.C97897d0;
import p813fl.C97927q0;
import rx3.C13598b0;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: il.s */
public final class C98739s extends C98748z<C97897d0> {

    /* renamed from: F */
    public static final /* synthetic */ int f289528F = 0;

    /* renamed from: B */
    public final View f289529B;

    /* renamed from: C */
    public final View f289530C;

    /* renamed from: D */
    public final View f289531D;

    /* renamed from: E */
    public final C98742c f289532E = new C98742c(this);

    /* renamed from: il.s$a */
    public static final class C98740a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98739s f289533d;

        public C98740a(C98739s sVar) {
            this.f289533d = sVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C88144b.m109791i(this.f289533d.f289530C.getContext(), "emoji", ".ui.EmojiMineUI", new Intent(), (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il.s$b */
    public static final class C98741b implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C98739s f289534d;

        public C98741b(C98739s sVar) {
            this.f289534d = sVar;
        }

        public void onViewAttachedToWindow(View view) {
            C39343a cm = ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm();
            C98742c cVar = this.f289534d.f289532E;
            ((C98602h) cm).getClass();
            ((C92054g) C86312j.m106911c(C92054g.class)).wx0().mo127637a(cVar);
        }

        public void onViewDetachedFromWindow(View view) {
            C39343a cm = ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm();
            C98742c cVar = this.f289534d.f289532E;
            ((C98602h) cm).getClass();
            ((C92054g) C86312j.m106911c(C92054g.class)).wx0().mo127638b(cVar);
        }
    }

    /* renamed from: il.s$c */
    public static final class C98742c implements C46875a {

        /* renamed from: a */
        public final /* synthetic */ C98739s f289535a;

        /* renamed from: il.s$c$a */
        public static final class C98743a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C98739s f289536d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C98743a(C98739s sVar) {
                super(0);
                this.f289536d = sVar;
            }

            public Object invoke() {
                C98739s sVar = this.f289536d;
                int i = C98739s.f289528F;
                sVar.mo138127z();
                return C13598b0.f38549a;
            }
        }

        public C98742c(C98739s sVar) {
            this.f289535a = sVar;
        }

        /* renamed from: a */
        public void mo72082a() {
            C61926c.m72668M(new C98743a(this.f289535a));
        }

        /* renamed from: b */
        public void mo72083b(int i) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98739s(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        this.f289529B = view.findViewById(C0966R.C0970id.cgk);
        View findViewById = view.findViewById(C0966R.C0970id.cgl);
        this.f289530C = findViewById;
        this.f289531D = view.findViewById(C0966R.C0970id.cgm);
        view.addOnAttachStateChangeListener(new C98741b(this));
        view.setOnClickListener((View.OnClickListener) null);
        findViewById.setOnClickListener(new C98740a(this));
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        mo138127z();
    }

    /* renamed from: z */
    public final void mo138127z() {
        ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
        if (((C92054g) C86312j.m106911c(C92054g.class)).wx0().f268269a.f110547c) {
            View view = this.f289529B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f289530C;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f289531D;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view6 = this.f289529B;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view8 = this.f289530C;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = this.f289531D;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view10 = view9;
        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/emoji/panel/adapter/GroupSyncViewHolder", "updateSyncView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
