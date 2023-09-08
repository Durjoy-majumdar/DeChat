package v82;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import d62.C75339i;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;
import p447aw.C103918d;
import p629ny.C76979h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: v82.c0 */
public class C111420c0 implements View.OnClickListener {

    /* renamed from: d */
    public MultiTalkMainUI f333559d;

    /* renamed from: e */
    public View f333560e;

    /* renamed from: f */
    public View f333561f;

    /* renamed from: g */
    public TextView f333562g;

    /* renamed from: h */
    public TextView f333563h;

    /* renamed from: i */
    public ImageView f333564i;

    /* renamed from: j */
    public RecyclerView f333565j;

    /* renamed from: n */
    public View f333566n;

    /* renamed from: o */
    public ImageButton f333567o;

    /* renamed from: p */
    public ImageButton f333568p;

    /* renamed from: q */
    public boolean f333569q = false;

    /* renamed from: v82.c0$b */
    public class C78364b extends RecyclerView.C0130p {
        public C78364b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && C111420c0.this.f333569q) {
                C115669n.INSTANCE.idkeyStat(220, 32, 1, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C111420c0.this.f333569q = i2 != 0;
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: v82.c0$a */
    public class C111421a implements Runnable {
        public C111421a() {
        }

        public void run() {
            C111420c0 c0Var = C111420c0.this;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0Var.f333563h.getLayoutParams();
            int i = marginLayoutParams.bottomMargin;
            int i2 = marginLayoutParams.topMargin;
            int height = (int) (((float) c0Var.f333566n.getHeight()) - ((float) ((c0Var.f333563h.getHeight() + i) + i2)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c0Var.f333565j.getLayoutParams();
            int i3 = (C111418b0.f333548i * 3) + (C111418b0.f333543d * 2);
            if (height >= i3) {
                layoutParams.height = i3;
            } else {
                layoutParams.height = height;
            }
            c0Var.f333565j.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: v82.c0$c */
    public class C111422c implements Runnable {
        public C111422c(C111420c0 c0Var) {
        }

        public void run() {
            VoipFloatCardPermissionDialog.f117099e.mo57461a(MMApplicationContext.getContext());
        }
    }

    public C111420c0(MultiTalkMainUI multiTalkMainUI) {
        this.f333559d = multiTalkMainUI;
        this.f333560e = multiTalkMainUI.findViewById(C0966R.C0970id.f97);
        this.f333566n = multiTalkMainUI.findViewById(C0966R.C0970id.f359224jn2);
        View findViewById = multiTalkMainUI.findViewById(C0966R.C0970id.f9b);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = (int) ((((double) C76577a.m92159j(multiTalkMainUI)) * 15.9d) / 100.0d);
        findViewById.setLayoutParams(layoutParams);
        this.f333562g = (TextView) multiTalkMainUI.findViewById(C0966R.C0970id.f9c);
        this.f333564i = (ImageView) multiTalkMainUI.findViewById(C0966R.C0970id.f9a);
        this.f333565j = (RecyclerView) multiTalkMainUI.findViewById(C0966R.C0970id.f359225jn3);
        this.f333561f = multiTalkMainUI.findViewById(C0966R.C0970id.h4f);
        C76577a.m92159j(multiTalkMainUI);
        C76577a.m92151b(multiTalkMainUI, 412);
        C76577a.m92159j(multiTalkMainUI);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(multiTalkMainUI);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f333566n.getLayoutParams();
        layoutParams2.bottomMargin = (int) ((((double) C76577a.m92159j(multiTalkMainUI)) * 21.9d) / 100.0d);
        this.f333566n.setLayoutParams(layoutParams2);
        View findViewById2 = multiTalkMainUI.findViewById(C0966R.C0970id.f8q);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams3.bottomMargin = (int) ((((double) C76577a.m92159j(multiTalkMainUI)) * 3.6d) / 100.0d);
        findViewById2.setLayoutParams(layoutParams3);
        this.f333565j.setLayoutManager(linearLayoutManager);
        this.f333565j.setAdapter(new C14417s1(multiTalkMainUI));
        this.f333565j.post(new C111421a());
        this.f333565j.setOnScrollListener(new C78364b());
        this.f333563h = (TextView) multiTalkMainUI.findViewById(C0966R.C0970id.f8l);
        this.f333567o = (ImageButton) multiTalkMainUI.findViewById(C0966R.C0970id.f9d);
        this.f333568p = (ImageButton) multiTalkMainUI.findViewById(C0966R.C0970id.f96);
        this.f333567o.setOnClickListener(this);
        this.f333568p.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo163083a() {
        View view = this.f333560e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "dismissInviteUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "dismissInviteUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewGroup H7 = this.f333559d.mo150869H7();
        if (H7 != null) {
            H7.removeView(this.f333560e);
        }
    }

    /* renamed from: b */
    public void mo163084b(MultiTalkGroup multiTalkGroup) {
        MultiTalkGroup multiTalkGroup2 = multiTalkGroup;
        Class cls = C76979h.class;
        Class cls2 = C75339i.class;
        View view = this.f333560e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f333561f;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/pb/talkroom/sdk/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String d = C105806i0.m142151d(C105851w0.zx0().f314506t);
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(d)) {
            for (int i = 0; i < multiTalkGroup2.f320047i.size(); i++) {
                if (!multiTalkGroup2.f320047i.get(i).f320048d.equals(d)) {
                    arrayList.add(multiTalkGroup2.f320047i.get(i).f320048d);
                }
            }
            this.f333562g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f333559d, ((C75339i) C86312j.m106911c(cls2)).getDisplayName(d)));
            this.f333564i.setContentDescription(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f333559d, ((C75339i) C86312j.m106911c(cls2)).getDisplayName(d)));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106843mB(this.f333564i, d, 0.1f);
        }
        if (!(this.f333559d.mo150869H7() == null || this.f333559d.mo150869H7().findViewById(C0966R.C0970id.iws) == null)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C75044y4.m89991c(this.f333559d);
            this.f333559d.mo150869H7().findViewById(C0966R.C0970id.iws).setLayoutParams(layoutParams);
        }
        if (arrayList.size() > 0) {
            this.f333563h.setVisibility(0);
            this.f333563h.setText(C0966R.string.gzq);
            View view4 = this.f333566n;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f333559d.getContext().getString(C0966R.string.gzt));
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!((C14417s1) this.f333565j.getAdapter()).mo13710F4((String) arrayList.get(i2))) {
                    stringBuffer.append(((C75339i) C86312j.m106911c(cls2)).getDisplayName((String) arrayList.get(i2)) + ",");
                }
            }
            view4.setTag(C0966R.C0970id.keb, stringBuffer.toString());
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f333565j.getLayoutParams();
            this.f333565j.setVisibility(0);
            this.f333565j.removeAllViews();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!((C14417s1) this.f333565j.getAdapter()).mo13710F4((String) arrayList.get(i3))) {
                    C14417s1 s1Var = (C14417s1) this.f333565j.getAdapter();
                    String str = (String) arrayList.get(i3);
                    s1Var.getClass();
                    C87412m.m108594g(str, "userName");
                    if (s1Var.f40023e.size() <= i3) {
                        s1Var.f40023e.add(str);
                    } else {
                        s1Var.f40023e.set(i3, str);
                    }
                }
            }
            this.f333565j.getAdapter().notifyDataSetChanged();
            return;
        }
        this.f333563h.setVisibility(8);
        this.f333565j.setVisibility(8);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.f96) {
            C105851w0.zx0().mo150660f(true, false);
            Context context = view.getContext();
            if (context != null && !((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context)) {
                C119179t tVar = C119157j.f356862d;
                C111422c cVar = new C111422c(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(cVar, 2000, false);
            }
        } else if (view.getId() == C0966R.C0970id.f9d) {
            C105851w0.zx0().mo150650a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
