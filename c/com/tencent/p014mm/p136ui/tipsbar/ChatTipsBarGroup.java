package com.tencent.p014mm.p136ui.tipsbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.MaxHeightWxRecyclerView;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn3.C76419a;
import jn3.C76421b;
import jn3.C76422c;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l31.C61212e;
import z04.C112551y;
import zj3.C79387w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003-./B\u001d\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00060"}, mo182094d2 = {"Lcom/tencent/mm/ui/tipsbar/ChatTipsBarGroup;", "Landroid/widget/FrameLayout;", "", "paddingTopToSet", "Lrx3/b0;", "setListViewPaddingTop", "visibility", "setVisibility", "Ljava/util/ArrayList;", "Ljq3/c;", "Lkotlin/collections/ArrayList;", "q", "Ljava/util/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "dataList", "Ljava/lang/ref/WeakReference;", "Lck3/b;", "r", "Ljava/lang/ref/WeakReference;", "getChattingContextRef", "()Ljava/lang/ref/WeakReference;", "setChattingContextRef", "(Ljava/lang/ref/WeakReference;)V", "chattingContextRef", "Landroid/view/View$OnClickListener;", "s", "Landroid/view/View$OnClickListener;", "getSelfClickListener", "()Landroid/view/View$OnClickListener;", "selfClickListener", "", "t", "Ljava/lang/String;", "getCurTalkerName", "()Ljava/lang/String;", "setCurTalkerName", "(Ljava/lang/String;)V", "curTalkerName", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "d", "e", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup */
public final class ChatTipsBarGroup extends FrameLayout {

    /* renamed from: v */
    public static final /* synthetic */ int f219952v = 0;

    /* renamed from: d */
    public final MaxHeightWxRecyclerView f219953d;

    /* renamed from: e */
    public final RelativeLayout f219954e;

    /* renamed from: f */
    public final View f219955f;

    /* renamed from: g */
    public final View f219956g;

    /* renamed from: h */
    public final View f219957h;

    /* renamed from: i */
    public final View f219958i;

    /* renamed from: j */
    public final View f219959j;

    /* renamed from: n */
    public boolean f219960n;

    /* renamed from: o */
    public boolean f219961o;

    /* renamed from: p */
    public final C74825d f219962p;

    /* renamed from: q */
    public final ArrayList<C9493c> f219963q;

    /* renamed from: r */
    public WeakReference<C67391b> f219964r;

    /* renamed from: s */
    public final View.OnClickListener f219965s;

    /* renamed from: t */
    public String f219966t = "";

    /* renamed from: u */
    public final C74827f f219967u = new C74827f();

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$a */
    public static final class C74822a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ int f219968d;

        public C74822a(int i) {
            this.f219968d = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            rect.bottom = this.f219968d;
        }
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$b */
    public static final class C74823b implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ ChatTipsBarGroup f219969d;

        public C74823b(ChatTipsBarGroup chatTipsBarGroup) {
            this.f219969d = chatTipsBarGroup;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$2", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            this.f219969d.f219962p.f219976d[0] = (int) motionEvent.getRawX();
            this.f219969d.f219962p.f219976d[1] = (int) motionEvent.getRawY();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c */
    public enum C74824c {
        MODE_FOLD,
        MODE_EXPAND
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d */
    public static final class C74825d {

        /* renamed from: a */
        public C74824c f219973a = C74824c.MODE_FOLD;

        /* renamed from: b */
        public C74826e f219974b = C74826e.DEFAULT;

        /* renamed from: c */
        public final ArrayList<C9493c> f219975c = new ArrayList<>();

        /* renamed from: d */
        public final int[] f219976d = new int[2];

        /* renamed from: a */
        public final boolean mo104003a() {
            if (this.f219973a == C74824c.MODE_FOLD) {
                if (this.f219975c.size() > 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$e */
    public enum C74826e {
        DEFAULT,
        ON_RESUME
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$f */
    public static final class C74827f extends C60896i<C9493c> {
        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(cVar, "item");
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$g */
    public static final class C74828g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChatTipsBarGroup f219980d;

        public C74828g(ChatTipsBarGroup chatTipsBarGroup) {
            this.f219980d = chatTipsBarGroup;
        }

        public final void onClick(View view) {
            Class cls = C61212e.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChatTipsBarGroup chatTipsBarGroup = this.f219980d;
            if (chatTipsBarGroup.f219960n || chatTipsBarGroup.f219961o) {
                C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int ordinal = chatTipsBarGroup.f219962p.f219973a.ordinal();
            if (ordinal == 0) {
                ChatTipsBarGroup chatTipsBarGroup2 = this.f219980d;
                int height = chatTipsBarGroup2.f219954e.getHeight();
                chatTipsBarGroup2.mo103991c();
                chatTipsBarGroup2.f219954e.setClipToOutline(true);
                View view2 = chatTipsBarGroup2.f219958i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                chatTipsBarGroup2.f219961o = true;
                ViewPropertyAnimator alpha = chatTipsBarGroup2.f219958i.animate().alpha(1.0f);
                alpha.setInterpolator(new AccelerateDecelerateInterpolator());
                alpha.setDuration(250);
                alpha.start();
                alpha.setUpdateListener(new C76419a(chatTipsBarGroup2, height));
                alpha.setListener(new C76421b(chatTipsBarGroup2, alpha));
                ChatTipsBarGroup chatTipsBarGroup3 = this.f219980d;
                C87412m.m108594g(chatTipsBarGroup3, "tipsBarList");
                ((C61212e) C86312j.m106911c(cls)).mo86153W7("group_msg_set_top_list_open", chatTipsBarGroup3, (Map<String, Object>) null, 26356);
            } else if (ordinal == 1) {
                ChatTipsBarGroup chatTipsBarGroup4 = this.f219980d;
                int height2 = chatTipsBarGroup4.f219954e.getHeight();
                chatTipsBarGroup4.mo103992d();
                View view4 = chatTipsBarGroup4.f219958i;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ViewGroup.LayoutParams layoutParams = chatTipsBarGroup4.f219959j.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = height2;
                    chatTipsBarGroup4.f219959j.setLayoutParams(layoutParams);
                }
                chatTipsBarGroup4.f219960n = true;
                chatTipsBarGroup4.f219958i.post(new C76422c(chatTipsBarGroup4, height2));
                ChatTipsBarGroup chatTipsBarGroup5 = this.f219980d;
                C87412m.m108594g(chatTipsBarGroup5, "tipsBarList");
                ((C61212e) C86312j.m106911c(cls)).mo86153W7("group_msg_set_top_list_close", chatTipsBarGroup5, (Map<String, Object>) null, 26356);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$h */
    public static final class C74829h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ChatTipsBarGroup f219981d;

        public C74829h(ChatTipsBarGroup chatTipsBarGroup) {
            this.f219981d = chatTipsBarGroup;
        }

        public final void run() {
            this.f219981d.setTranslationY((float) (-this.f219981d.getMeasuredHeight()));
            this.f219981d.setAlpha(1.0f);
            ViewPropertyAnimator translationY = this.f219981d.animate().translationY(0.0f);
            translationY.setInterpolator(new AccelerateDecelerateInterpolator());
            translationY.setDuration(200);
            translationY.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatTipsBarGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C74825d dVar = new C74825d();
        this.f219962p = dVar;
        this.f219963q = dVar.f219975c;
        C74828g gVar = new C74828g(this);
        this.f219965s = gVar;
        View.inflate(getContext(), C0966R.C0971layout.cue, this);
        int h = C76577a.m92157h(context, C0966R.dimen.f3766df);
        View findViewById = findViewById(C0966R.C0970id.n3n);
        C87412m.m108593f(findViewById, "findViewById(R.id.rv_tipsbar_group)");
        MaxHeightWxRecyclerView maxHeightWxRecyclerView = (MaxHeightWxRecyclerView) findViewById;
        this.f219953d = maxHeightWxRecyclerView;
        View findViewById2 = findViewById(C0966R.C0970id.n1s);
        C87412m.m108593f(findViewById2, "findViewById(R.id.layout_tipsbar_container)");
        this.f219954e = (RelativeLayout) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.jad);
        C87412m.m108593f(findViewById3, "findViewById(R.id.btn_up)");
        this.f219955f = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.n4u);
        C87412m.m108593f(findViewById4, "findViewById(R.id.v_fold_divider)");
        this.f219956g = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.n4t);
        C87412m.m108593f(findViewById5, "findViewById(R.id.v_fake_item)");
        this.f219957h = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.l35);
        C87412m.m108593f(findViewById6, "findViewById(R.id.v_mask)");
        this.f219958i = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.n4v);
        C87412m.m108593f(findViewById7, "findViewById(R.id.v_help_fold_anim_back)");
        this.f219959j = findViewById7;
        maxHeightWxRecyclerView.mo17085h0(new C74822a(h));
        maxHeightWxRecyclerView.mo17092j0(new C74823b(this));
        maxHeightWxRecyclerView.setLayoutManager(new WxLinearLayoutManager(getContext()));
        setOnClickListener(gVar);
    }

    /* access modifiers changed from: private */
    public final void setListViewPaddingTop(int i) {
        C67391b bVar;
        WeakReference<C67391b> weakReference = this.f219964r;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            ViewGroup D = bVar.mo91570k().mo81289D();
            Object tag = D.getTag(C0966R.C0970id.luw);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            int intValue = num != null ? num.intValue() : 0;
            if (i != intValue) {
                D.setTag(C0966R.C0970id.luw, Integer.valueOf(i));
                D.setPadding(D.getPaddingLeft(), D.getPaddingTop() + (i - intValue), D.getPaddingRight(), D.getPaddingBottom());
            }
        }
    }

    /* renamed from: b */
    public final void mo103990b() {
        if (!this.f219960n && !this.f219961o && this.f219962p.f219973a == C74824c.MODE_EXPAND) {
            mo103992d();
        }
        setVisibility(8);
        setListViewPaddingTop(0);
        this.f219953d.setAdapter((RecyclerView.C16613e<?>) null);
    }

    /* renamed from: c */
    public final void mo103991c() {
        C67391b bVar;
        ChatFooter k1;
        C74825d dVar = this.f219962p;
        C74824c cVar = C74824c.MODE_EXPAND;
        dVar.getClass();
        dVar.f219973a = cVar;
        RecyclerView.C16613e adapter = this.f219953d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f219954e.setBackgroundColor(getContext().getResources().getColor(C0966R.color.a7_));
        this.f219954e.setBackgroundResource(C0966R.C0969drawable.b_l);
        View view = this.f219955f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f219956g;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f219957h;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = this.f219958i;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view8 = this.f219958i;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
        C117292a.m165359e(view8, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        WeakReference<C67391b> weakReference = this.f219964r;
        if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
            C79387w wVar = (C79387w) bVar.f193278b.mo102812a(C79387w.class);
            if (!(wVar == null || (k1 = wVar.mo102193k1()) == null)) {
                k1.mo100339A(0, true);
            }
        }
        mo103993e();
        if (C72996z1.m85824W5(this.f219966t)) {
            C115669n.INSTANCE.mo160131h(27193, 1, 4);
        }
    }

    /* renamed from: d */
    public final void mo103992d() {
        C74825d dVar = this.f219962p;
        C74824c cVar = C74824c.MODE_FOLD;
        dVar.getClass();
        dVar.f219973a = cVar;
        RecyclerView.C16613e adapter = this.f219953d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f219954e.setBackgroundColor(getContext().getResources().getColor(C0966R.color.a7_));
        View view = this.f219955f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f219956g;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewGroup.LayoutParams layoutParams = this.f219956g.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        boolean z = true;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = this.f219962p.f219975c.size() > 1 ? C76577a.m92157h(getContext(), C0966R.dimen.auz) : 0;
            this.f219956g.setLayoutParams(marginLayoutParams);
        }
        View view5 = this.f219957h;
        if (this.f219962p.f219975c.size() <= 1) {
            z = false;
        }
        int i = z ? 0 : 8;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Integer.valueOf(i));
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view7 = this.f219958i;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo103993e();
    }

    /* renamed from: e */
    public final void mo103993e() {
        String str;
        boolean z = false;
        if (this.f219962p.mo104003a()) {
            this.f219953d.setImportantForAccessibility(4);
            str = getContext().getString(C0966R.string.miq, new Object[]{Integer.valueOf(this.f219962p.f219975c.size())});
        } else {
            if (this.f219962p.f219973a == C74824c.MODE_EXPAND) {
                this.f219953d.setImportantForAccessibility(1);
                getContext().getString(C0966R.string.mip, new Object[]{Integer.valueOf(this.f219962p.f219975c.size())});
                str = null;
            } else {
                str = "";
            }
        }
        if (str == null || C112551y.m153811k(str)) {
            z = true;
        }
        if (!z) {
            setContentDescription(str);
        } else {
            setContentDescription((CharSequence) null);
        }
        this.f219958i.setContentDescription((CharSequence) null);
    }

    public final WeakReference<C67391b> getChattingContextRef() {
        return this.f219964r;
    }

    public final String getCurTalkerName() {
        return this.f219966t;
    }

    public final ArrayList<C9493c> getDataList() {
        return this.f219963q;
    }

    public final View.OnClickListener getSelfClickListener() {
        return this.f219965s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if ((r0.f219975c.size() > 1) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r0 = r5.f219962p
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c r1 = r0.f219973a
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c r2 = com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup.C74824c.MODE_FOLD
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            if (r1 == 0) goto L_0x001d
            java.util.ArrayList<jq3.c> r0 = r0.f219975c
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onInterceptTouchEvent() called with: ev = "
            r0.append(r1)
            if (r6 == 0) goto L_0x002f
            int r6 = r6.getAction()
            goto L_0x0030
        L_0x002f:
            r6 = -1
        L_0x0030:
            java.lang.String r6 = android.view.MotionEvent.actionToString(r6)
            r0.append(r6)
            java.lang.String r6 = " intercept:"
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MicroMsg.ChatTipsBarGroup"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setChattingContextRef(WeakReference<C67391b> weakReference) {
        this.f219964r = weakReference;
    }

    public final void setCurTalkerName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f219966t = str;
    }

    public void setVisibility(int i) {
        int visibility = getVisibility();
        boolean z = visibility == 8 || visibility == 4;
        if (i != 0 || !z) {
            super.setVisibility(i);
            return;
        }
        setAlpha(0.0f);
        super.setVisibility(i);
        post(new C74829h(this));
    }
}
