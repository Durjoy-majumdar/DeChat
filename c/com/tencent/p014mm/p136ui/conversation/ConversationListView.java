package com.tencent.p014mm.p136ui.conversation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MultiWindowModeChangedEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.widget.recent.AppBrandRecentView;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71321c;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71323d;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71325e;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71326f;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71331l;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71341r;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarContainer;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ky2.C10432i;
import lg3.C88496e;
import vo3.C78461f;
import wc3.C78538u;
import wx2.C78736a;

/* renamed from: com.tencent.mm.ui.conversation.ConversationListView */
public class ConversationListView extends ListView implements AbsListView.OnScrollListener, AppBrandRecentView.C85016d, View.OnTouchListener, C71321c {

    /* renamed from: y0 */
    public static final /* synthetic */ int f219323y0 = 0;

    /* renamed from: A */
    public C78736a f219324A = null;

    /* renamed from: B */
    public Runnable f219325B = null;

    /* renamed from: C */
    public Runnable f219326C = null;

    /* renamed from: D */
    public View f219327D;

    /* renamed from: E */
    public View f219328E;

    /* renamed from: F */
    public C78461f f219329F;

    /* renamed from: G */
    public int f219330G = 0;

    /* renamed from: H */
    public View f219331H;

    /* renamed from: I */
    public int f219332I = C76577a.m92151b(getContext(), 56);

    /* renamed from: J */
    public boolean f219333J = true;

    /* renamed from: K */
    public int f219334K = 0;

    /* renamed from: L */
    public boolean f219335L = false;

    /* renamed from: M */
    public Rect f219336M = new Rect();

    /* renamed from: N */
    public Paint f219337N;

    /* renamed from: P */
    public boolean f219338P = false;

    /* renamed from: Q */
    public IListener<MultiWindowModeChangedEvent> f219339Q = new IListener<MultiWindowModeChangedEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1571206658;
        }

        public boolean callback(IEvent iEvent) {
            MultiWindowModeChangedEvent multiWindowModeChangedEvent = (MultiWindowModeChangedEvent) iEvent;
            boolean z = ConversationListView.this.f219335L;
            boolean z2 = multiWindowModeChangedEvent.f193745d.f193746a;
            if (z != z2) {
                Log.m105925i("MicroMsg.ConversationListView", "alvinluo MultiWindowModeChanged: %b", Boolean.valueOf(z2));
                ConversationListView conversationListView = ConversationListView.this;
                conversationListView.f219335L = multiWindowModeChangedEvent.f193745d.f193746a;
                conversationListView.mo103741q();
                ConversationListView conversationListView2 = ConversationListView.this;
                C71325e eVar = conversationListView2.f219351i;
                if (eVar != null) {
                    ((TaskBarContainer) eVar).mo98167d(conversationListView2.f219335L);
                }
            }
            return false;
        }
    };

    /* renamed from: R */
    public View.OnLayoutChangeListener f219340R = new C74631e();

    /* renamed from: S */
    public View.OnTouchListener f219341S = null;

    /* renamed from: T */
    public int f219342T;

    /* renamed from: U */
    public View f219343U;

    /* renamed from: V */
    public boolean f219344V;

    /* renamed from: W */
    public boolean f219345W = false;

    /* renamed from: d */
    public LinkedList<ListView.FixedViewInfo> f219346d = new LinkedList<>();

    /* renamed from: e */
    public AbsListView.OnScrollListener f219347e;

    /* renamed from: f */
    public View.OnTouchListener f219348f;

    /* renamed from: g */
    public boolean f219349g = true;

    /* renamed from: h */
    public boolean f219350h = false;

    /* renamed from: i */
    public C71325e f219351i;

    /* renamed from: j */
    public C71323d f219352j;

    /* renamed from: n */
    public FolderHelper f219353n;

    /* renamed from: o */
    public int f219354o;

    /* renamed from: p */
    public Paint f219355p = new Paint(1);

    /* renamed from: p0 */
    public AdapterView.OnItemLongClickListener f219356p0;

    /* renamed from: q */
    public Paint f219357q = new Paint(1);

    /* renamed from: r */
    public int f219358r;

    /* renamed from: s */
    public int f219359s;

    /* renamed from: t */
    public int f219360t = 0;

    /* renamed from: u */
    public int f219361u = 0;

    /* renamed from: v */
    public boolean f219362v;

    /* renamed from: w */
    public int f219363w;

    /* renamed from: x */
    public MMFragmentActivity f219364x;

    /* renamed from: x0 */
    public AdapterView.OnItemClickListener f219365x0;

    /* renamed from: y */
    public int f219366y = 0;

    /* renamed from: z */
    public boolean f219367z = false;

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$a */
    public class C74627a implements AdapterView.OnItemClickListener {
        public C74627a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Log.m105925i("MicroMsg.ConversationListView", "alvinluo onItemClick isCanClose: %b", Boolean.valueOf(ConversationListView.this.f219344V));
            ConversationListView conversationListView = ConversationListView.this;
            AdapterView.OnItemClickListener onItemClickListener = conversationListView.f219365x0;
            if (onItemClickListener != null && !conversationListView.f219344V) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$b */
    public class C74628b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Configuration f219370d;

        public C74628b(Configuration configuration) {
            this.f219370d = configuration;
        }

        public void run() {
            Resources resources = ConversationListView.this.getResources();
            if (C85875k4.m106210y() && (resources instanceof C88496e)) {
                ((C88496e) ConversationListView.this.getResources()).mo122950g(this.f219370d);
                ConversationListView conversationListView = ConversationListView.this;
                int i = ConversationListView.f219323y0;
                conversationListView.mo103717g(true);
                ConversationListView.this.mo103715e();
            }
            if (C85875k4.m106211z()) {
                ConversationListView conversationListView2 = ConversationListView.this;
                int color = conversationListView2.getResources().getColor(C0966R.color.f3275lu);
                int color2 = ConversationListView.this.getResources().getColor(C0966R.color.f3022ch);
                int i2 = ConversationListView.f219323y0;
                conversationListView2.mo103742r(1.0f, color, color2);
            } else {
                ConversationListView conversationListView3 = ConversationListView.this;
                int color3 = conversationListView3.getResources().getColor(C0966R.color.a7_);
                int color4 = ConversationListView.this.getResources().getColor(C0966R.color.f3021cg);
                int i3 = ConversationListView.f219323y0;
                conversationListView3.mo103742r(1.0f, color3, color4);
            }
            C71323d dVar = ConversationListView.this.f219352j;
            if (dVar != null) {
                C71331l lVar = (C71331l) dVar;
                lVar.f206584T = lVar.f206601d.getResources().getColor(C0966R.color.f2927a);
            }
            C71325e eVar = ConversationListView.this.f219351i;
            if (eVar != null) {
                ((TaskBarContainer) eVar).mo98169f();
            }
            ConversationListView.this.setSelection(1);
            ConversationListView conversationListView4 = ConversationListView.this;
            int childCount = conversationListView4.getChildCount();
            Log.m105925i("MicroMsg.ConversationListView", "alvinluo resetListAlpha first: %d, last: %d", 1, Integer.valueOf(childCount));
            for (int i4 = 1; i4 <= childCount; i4++) {
                View childAt = conversationListView4.getChildAt(i4);
                if (childAt != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(1.0f));
                    View view = childAt;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/ConversationListView", "resetListAlpha", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/conversation/ConversationListView", "resetListAlpha", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$c */
    public class C74629c implements Runnable {
        public C74629c() {
        }

        public void run() {
            ConversationListView.this.smoothScrollToPositionFromTop(0, 0, 300);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$d */
    public class C74630d implements C78736a {

        /* renamed from: a */
        public final /* synthetic */ C78736a f219373a;

        public C74630d(ConversationListView conversationListView, C78736a aVar) {
            this.f219373a = aVar;
        }

        /* renamed from: a */
        public void mo101311a(float f, int i, int i2) {
            C78736a aVar = this.f219373a;
            if (aVar != null) {
                aVar.mo101311a(f, i, i2);
            }
        }

        /* renamed from: b */
        public void mo101312b(boolean z) {
            C78736a aVar = this.f219373a;
            if (aVar != null) {
                aVar.mo101312b(z);
            }
        }

        /* renamed from: c */
        public void mo101313c(float f, int i, int i2) {
            C78736a aVar = this.f219373a;
            if (aVar != null) {
                aVar.mo101313c(f, i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$e */
    public class C74631e implements View.OnLayoutChangeListener {
        public C74631e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Log.m105924i("MicroMsg.ConversationListView", "ActionBarView layout changed, call setupActionBarView()");
            ConversationListView conversationListView = ConversationListView.this;
            int i9 = ConversationListView.f219323y0;
            conversationListView.mo103741q();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$f */
    public class C74632f implements Runnable {

        /* renamed from: d */
        public int f219375d = 0;

        /* renamed from: e */
        public final /* synthetic */ int f219376e;

        public C74632f(int i) {
            this.f219376e = i;
        }

        public void run() {
            View view = ConversationListView.this.f219328E;
            if (view != null) {
                if (view.getTop() != 0) {
                    ConversationListView conversationListView = ConversationListView.this;
                    conversationListView.f219330G = conversationListView.f219328E.getTop();
                }
                ConversationListView conversationListView2 = ConversationListView.this;
                int i = conversationListView2.f219330G;
                if (i <= 0) {
                    int i2 = this.f219375d;
                    if (i2 <= 2) {
                        Log.m105925i("MicroMsg.ConversationListView", "alvinluo initActionBarView try again tryCount: %d", Integer.valueOf(i2));
                        ConversationListView.this.post(this);
                    } else {
                        int i3 = this.f219376e;
                        int[] iArr = new int[2];
                        conversationListView2.f219328E.getLocationOnScreen(iArr);
                        int i4 = iArr[1];
                        int[] iArr2 = new int[2];
                        conversationListView2.getLocationOnScreen(iArr2);
                        int i5 = iArr2[1];
                        ViewGroup.LayoutParams layoutParams = conversationListView2.getLayoutParams();
                        int i6 = layoutParams instanceof RelativeLayout.LayoutParams ? ((RelativeLayout.LayoutParams) layoutParams).topMargin : 0;
                        String lowerCase = Util.nullAs(Build.MANUFACTURER, "").toLowerCase();
                        boolean z = lowerCase.contains("vivo") && Build.VERSION.SDK_INT == 28;
                        Log.m105925i("MicroMsg.ConversationListView", "alvinluo initActionBarView actionBarTopOnScreen: %d, listTopOnScreen: %d, listTopMargin: %d, manufacturer: %s, isVivoAbove28: %b", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), lowerCase, Boolean.valueOf(z));
                        if (i5 - i6 != i4 || !z) {
                            int f = C75044y4.m89994f(conversationListView2.getContext());
                            conversationListView2.f219330G = f;
                            Log.m105921e("MicroMsg.ConversationListView", "alvinluo initActionBarView get default status bar height: %d", Integer.valueOf(f));
                            conversationListView2.mo103740p(conversationListView2.f219330G, i3);
                            conversationListView2.mo103729o(conversationListView2.f219330G, false);
                        } else {
                            conversationListView2.f219330G = 0;
                            Log.m105924i("MicroMsg.ConversationListView", "alvinluo initActionBarView set top to 0");
                            conversationListView2.mo103740p(0, i3);
                            conversationListView2.mo103729o(0, true);
                        }
                    }
                } else {
                    conversationListView2.mo103740p(i, this.f219376e);
                    ConversationListView conversationListView3 = ConversationListView.this;
                    conversationListView3.mo103729o(conversationListView3.f219330G, false);
                }
                this.f219375d++;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$g */
    public class C74633g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f219378d;

        public C74633g(View view) {
            this.f219378d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f219378d.getGlobalVisibleRect(ConversationListView.this.f219336M);
            float floatValue = ((Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f;
            ConversationListView.this.f219337N.setAlpha((int) floatValue);
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("MicroMsg.ConversationListView", "m ALpha" + floatValue);
            }
            ConversationListView.this.postInvalidate();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$h */
    public class C74634h extends AnimatorListenerAdapter {
        public C74634h() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ConversationListView.this.f219336M.setEmpty();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ConversationListView.this.f219338P = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$i */
    public class C74635i implements Runnable {
        public C74635i() {
        }

        public void run() {
            ConversationListView.this.setSelection(1);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$j */
    public class C74636j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f219382d;

        public C74636j(int i) {
            this.f219382d = i;
        }

        public void run() {
            C71323d dVar;
            ConversationListView conversationListView = ConversationListView.this;
            int i = this.f219382d;
            if (conversationListView.f219349g && (dVar = conversationListView.f219352j) != null) {
                ((C71331l) dVar).mo98254a(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$k */
    public class C74637k implements Runnable {
        public C74637k() {
        }

        public void run() {
            ConversationListView conversationListView = ConversationListView.this;
            int i = ConversationListView.f219323y0;
            conversationListView.mo103715e();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.ConversationListView$l */
    public class C74638l implements AdapterView.OnItemLongClickListener {
        public C74638l() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            Log.m105925i("MicroMsg.ConversationListView", "alvinluo onItemLongClick isCanClose: %b", Boolean.valueOf(ConversationListView.this.f219344V));
            ConversationListView conversationListView = ConversationListView.this;
            AdapterView.OnItemLongClickListener onItemLongClickListener = conversationListView.f219356p0;
            if (onItemLongClickListener == null || conversationListView.f219344V) {
                return false;
            }
            return onItemLongClickListener.onItemLongClick(adapterView, view, i, j);
        }
    }

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo103724j(context);
    }

    private View getEmptyFooter() {
        View findViewById = getRootView().findViewById(C0966R.C0970id.f358508fj3);
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3925j5);
        int height = findViewById != null ? findViewById.getHeight() : 0;
        if (height > 0) {
            dimension = height;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        View view = new View(getContext());
        this.f219343U = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, dimension));
        linearLayout.addView(this.f219343U);
        linearLayout.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2929c));
        linearLayout.setId(C0966R.C0970id.b7f);
        return linearLayout;
    }

    private ArrayList<View> getHeaderViewList() {
        View view;
        ArrayList<View> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f219346d.size(); i++) {
            ListView.FixedViewInfo fixedViewInfo = this.f219346d.get(i);
            if (!(fixedViewInfo == null || (view = fixedViewInfo.view) == null)) {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    private int getRealCount() {
        if (getAdapter() == null) {
            return 1;
        }
        return (getAdapter().getCount() - getHeaderViewsCount()) - getFooterViewsCount();
    }

    /* renamed from: C */
    public void mo98193C() {
        mo98206h();
    }

    /* renamed from: K */
    public void mo98200K(int i, int i2) {
        Log.m105924i("MicroMsg.ConversationListView", "[onCloseHeader]");
        setImportantForAccessibility(1);
        this.f219344V = false;
        this.f219367z = false;
        this.f219354o = 0;
        C78461f fVar = this.f219329F;
        if (fVar != null) {
            fVar.setBounceEnabled(true);
        }
    }

    /* renamed from: S */
    public void mo98201S(int i) {
        mo98200K(i, 0);
    }

    public void addHeaderView(View view, Object obj, boolean z) {
        super.addHeaderView(view, obj, z);
        ListView.FixedViewInfo fixedViewInfo = new ListView.FixedViewInfo(this);
        fixedViewInfo.view = view;
        fixedViewInfo.data = obj;
        fixedViewInfo.isSelectable = z;
        this.f219346d.add(fixedViewInfo);
    }

    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
        if (this.f219358r <= 0 && this.f219352j != null) {
            this.f219358r = C75044y4.m89989a(getContext()) + C75044y4.m89995g(getContext(), 0);
            this.f219359s = C75044y4.m89989a(getContext()) + C75044y4.m89994f(getContext());
            mo103741q();
            C71325e eVar = this.f219351i;
            if (eVar != null) {
                eVar.setActionBar(this.f219328E);
            }
            C71323d dVar = this.f219352j;
            ((C71331l) dVar).f206600c1 = this.f219328E;
            ((C71331l) dVar).f206599b1 = getRootView().findViewById(C0966R.C0970id.f358508fj3);
        }
    }

    /* renamed from: b */
    public void mo103709b(int i) {
    }

    /* renamed from: c */
    public float mo103710c(int i, int i2, boolean z) {
        if (getAdapter() == null) {
            return 0.0f;
        }
        mo103717g(false);
        int i3 = this.f219360t;
        int i4 = this.f219361u;
        int headerViewsCount = (i - getHeaderViewsCount()) - getFooterViewsCount();
        int i5 = (((headerViewsCount - i2) - (z ? 1 : 0)) * i3) + (z * i4);
        int measuredHeight = getMeasuredHeight();
        int a = C75044y4.m89989a(getContext());
        float f = (float) (((measuredHeight - i5) - a) - this.f219330G);
        Log.m105924i("MicroMsg.ConversationListView", "[isFullScreen] totalItemCount:" + i + " rawCount:" + headerViewsCount + " itemHeight:" + i3 + " foldItemHeight:" + i4 + " foldedItemCount:" + i2 + " foldItemCount:" + z + " getFirstVisiblePosition:" + getFirstVisiblePosition() + " getLastVisiblePosition:" + getLastVisiblePosition() + " getHeaderViewsCount:" + getHeaderViewsCount() + " getFooterViewsCount:" + getFooterViewsCount() + " measuredHeight:" + measuredHeight + " rawHeight:" + i5 + " actionBarHeight:" + a + " statusBarHeight: " + this.f219330G + " extraHeight:" + f);
        return f;
    }

    public boolean canScrollHorizontally(int i) {
        C71325e eVar = this.f219351i;
        return eVar == null ? super.canScrollHorizontally(i) : ((RelativeLayout) eVar).getBottom() >= ((RelativeLayout) this.f219351i).getHeight();
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = this.f219359s + this.f219334K;
        if (i >= 0 && !mo103725k()) {
            float f = (float) i;
            canvas.drawLine(0.0f, f, (float) getMeasuredWidth(), f, this.f219357q);
        }
        if (!this.f219336M.isEmpty()) {
            Rect rect = new Rect();
            getLocalVisibleRect(rect);
            Rect rect2 = new Rect(rect);
            Rect rect3 = new Rect(rect);
            if (!this.f219338P) {
                Rect rect4 = this.f219336M;
                rect2.bottom = rect4.top;
                rect3.top = rect4.bottom;
                canvas.drawRect(rect2, this.f219337N);
                canvas.drawRect(rect3, this.f219337N);
            } else {
                Rect rect5 = this.f219336M;
                rect2.top = rect5.top;
                rect2.bottom = rect5.bottom;
                canvas.drawRect(rect2, this.f219337N);
            }
            if (Log.getLogLevel() <= 1) {
                Log.m105918d("MicroMsg.ConversationListView", "mAlpha" + this.f219337N.getAlpha());
                Log.m105919d("MicroMsg.ConversationListView", "[onDrawForeground] drawingRect:%s mHighLightItemRect:%s newStyle:%b  topRect:%s", rect, this.f219336M, Boolean.valueOf(this.f219338P), rect2);
            }
        }
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (getFirstVisiblePosition() != 0 || i2 >= 0 || iArr == null || iArr.length < 2 || this.f219367z) {
            return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        iArr[1] = (int) (((float) i2) * 0.32f);
        super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f219341S;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        try {
            int rawY = (int) motionEvent.getRawY();
            if (this.f219335L) {
                rawY = (int) motionEvent.getY();
            }
            C71325e eVar = this.f219351i;
            if (eVar != null) {
                Log.m105919d("MicroMsg.ConversationListView", "alvinluo dispatchTouchEvent backUpFooterRect: %s, %f, %f, bottom: %d, height: %d, isCanClose: %b touchY:%d", eVar.getBackUpFooterRect().toString(), Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()), Integer.valueOf(this.f219351i.getBottom()), Integer.valueOf(this.f219351i.getHeight()), Boolean.valueOf(this.f219344V), Integer.valueOf(rawY));
            }
            if (mo103725k() && this.f219351i != null) {
                if (motionEvent.getPointerCount() > 1) {
                    motionEvent.setAction(3);
                    return ((RelativeLayout) this.f219351i).dispatchTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    if (this.f219351i.getBackUpFooterRect().contains((int) motionEvent.getRawX(), rawY)) {
                        this.f219345W = true;
                    } else {
                        this.f219345W = false;
                    }
                }
                Log.m105919d("MicroMsg.ConversationListView", "alvinluo dispatchTouchEvent isDownInCloseRect: %b, touchY: %d", Boolean.valueOf(this.f219345W), Integer.valueOf(rawY));
                if (!this.f219345W) {
                    return ((RelativeLayout) this.f219351i).dispatchTouchEvent(motionEvent);
                }
            }
            C71325e eVar2 = this.f219351i;
            if (eVar2 != null && ((RelativeLayout) eVar2).getBottom() >= ((RelativeLayout) this.f219351i).getHeight()) {
                ((TaskBarContainer) this.f219351i).f206446e.getClass();
                if (getFirstVisiblePosition() == 0) {
                    if (motionEvent.getAction() == 0 && this.f219351i.getBackUpFooterRect().contains((int) motionEvent.getRawX(), rawY)) {
                        this.f219344V = true;
                    } else if (motionEvent.getAction() == 0) {
                        this.f219344V = false;
                    }
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() != 3) {
                            if (this.f219352j != null && motionEvent.getAction() == 0) {
                                ((C71331l) this.f219352j).mo98268o(motionEvent);
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    }
                    if (!this.f219344V) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    this.f219344V = false;
                    if (this.f219352j != null) {
                        Log.m105924i("MicroMsg.ConversationListView", "alvinluo closeHeader by click BackUpFooterRect");
                        ((C71331l) this.f219352j).mo98254a(12);
                    }
                    if (motionEvent.getAction() != 1) {
                        return true;
                    }
                    Log.m105924i("MicroMsg.ConversationListView", "alvinluo ConversationListView cancel touch event");
                    motionEvent.setAction(3);
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (this.f219344V && motionEvent.getAction() == 1) {
                Log.m105925i("MicroMsg.ConversationListView", "alvinluo ConversationListView cancel touch event..., isHeaderOpen: %b, isHeaderVisible: %b", Boolean.valueOf(mo103725k()), Boolean.valueOf(mo103726l()));
                if (!mo103725k()) {
                    this.f219344V = false;
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && this.f219352j != null && motionEvent.getAction() == 0) {
                ((C71331l) this.f219352j).mo98268o(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ConversationListView", e, "alvinluo ConversationListView dispatchTouchEvent exception", new Object[0]);
            return false;
        }
    }

    /* renamed from: e */
    public final void mo103715e() {
        boolean z;
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f219343U.getLayoutParams();
        int count = getAdapter() == null ? 0 : getAdapter().getCount();
        if (!(getAdapter() instanceof HeaderViewListAdapter) || !(((HeaderViewListAdapter) getAdapter()).getWrappedAdapter() instanceof C74720p)) {
            i = 0;
            z = false;
        } else {
            C74720p pVar = (C74720p) ((HeaderViewListAdapter) getAdapter()).getWrappedAdapter();
            pVar.f219697N.getClass();
            ArrayList arrayList = new ArrayList();
            HashMap l = pVar.mo104614l();
            if (l != null) {
                for (Map.Entry value : l.entrySet()) {
                    arrayList.add((C72976h2) value.getValue());
                }
            }
            Iterator it = arrayList.iterator();
            i = 0;
            z = false;
            while (it.hasNext()) {
                C72976h2 h2Var = (C72976h2) it.next();
                if (h2Var.f212787o1 == 4) {
                    i++;
                } else if (C72996z1.m85828Z4(h2Var.getUsername())) {
                    z = true;
                }
            }
        }
        FolderHelper folderHelper = this.f219353n;
        float c = mo103710c(count, i + (folderHelper != null ? folderHelper.f219424z : 0), z);
        boolean z2 = c < 0.0f;
        int i2 = layoutParams.height;
        Log.m105924i("MicroMsg.ConversationListView", "[checkEmptyFooter] isRealFull:" + z2 + " old height:" + i2 + " extraHeight:" + c);
        View findViewById = getRootView().findViewById(C0966R.C0970id.f358508fj3);
        if (findViewById != null) {
            Log.m105925i("MicroMsg.ConversationListView", "alvinluo checkEmptyFooter tabView Height: %d", Integer.valueOf(findViewById.getHeight()));
        }
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3925j5);
        int height = findViewById != null ? findViewById.getHeight() : 0;
        if (height <= 0) {
            height = this.f219366y;
        }
        Log.m105919d("MicroMsg.ConversationListView", "alvinluo checkEmptyFooter tabHeight: %d", Integer.valueOf(height));
        if (z2) {
            layoutParams.height = height;
        } else {
            float f = (float) height;
            if (c < f) {
                c = f;
            }
            layoutParams.height = (int) c;
        }
        if (i2 != layoutParams.height) {
            Log.m105925i("MicroMsg.ConversationListView", "alvinluo checkEmptyFooter isHeaderOpen: %b", Boolean.valueOf(mo103725k()));
            if ((!z2 || Math.abs(c) <= ((float) (height + dimension))) && !mo103725k()) {
                Log.m105924i("MicroMsg.ConversationListView", "[checkEmptyFooter] setSelection");
                setSelection(1);
                C71323d dVar = this.f219352j;
                if (dVar != null) {
                    ((C71331l) dVar).mo98257d(true);
                }
            }
            this.f219343U.requestLayout();
        }
    }

    /* renamed from: f */
    public void mo103716f(boolean z) {
        if (this.f219343U != null) {
            if (z) {
                postDelayed(new C74637k(), 0);
            } else {
                mo103715e();
            }
        }
    }

    /* renamed from: g */
    public final void mo103717g(boolean z) {
        if (z || this.f219360t == 0 || this.f219361u == 0) {
            this.f219360t = (int) getResources().getDimension(C0966R.dimen.f3925j5);
            this.f219361u = (int) getResources().getDimension(C0966R.dimen.f3901ib);
            Log.m105925i("MicroMsg.ConversationListView", "checkSavedItemHeight %b %d %d", Boolean.valueOf(z), Integer.valueOf(this.f219360t), Integer.valueOf(this.f219361u));
        }
    }

    public int getBannerHeaderHeight() {
        Iterator<ListView.FixedViewInfo> it = this.f219346d.iterator();
        int i = 0;
        while (it.hasNext()) {
            View view = it.next().view;
            if (view != this.f219351i) {
                i += view.getMeasuredHeight();
            }
        }
        return i;
    }

    public int getEmptyFooterHeight() {
        View view = this.f219343U;
        LinearLayout.LayoutParams layoutParams = view != null ? (LinearLayout.LayoutParams) view.getLayoutParams() : null;
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    public int getFirstHeaderVisible() {
        View childAt;
        Iterator<ListView.FixedViewInfo> it = this.f219346d.iterator();
        int i = 0;
        while (it.hasNext()) {
            View view = it.next().view;
            if (view == this.f219351i || view == null || !(view instanceof ViewGroup) || (childAt = ((ViewGroup) view).getChildAt(0)) == null || childAt.getVisibility() != 0) {
                i++;
            } else {
                Log.m105925i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", Integer.valueOf(i));
                return i;
            }
        }
        Log.m105925i("MicroMsg.ConversationListView", "[getFirstHeaderVisible] index:%s", Integer.valueOf(i));
        return i;
    }

    public boolean getShowHeaderContainer() {
        return this.f219349g;
    }

    public C71326f getTaskBarView() {
        C71325e eVar = this.f219351i;
        if (eVar != null) {
            return eVar.getTaskBarView();
        }
        Log.m105928w("MicroMsg.ConversationListView", "mHeaderContainer is null");
        return null;
    }

    /* renamed from: h */
    public void mo98206h() {
        Log.m105924i("MicroMsg.ConversationListView", "[onOpenHeader]");
        setImportantForAccessibility(2);
        this.f219367z = true;
        C78461f fVar = this.f219329F;
        if (fVar != null) {
            fVar.setBounceEnabled(false);
        }
    }

    /* renamed from: i */
    public void mo103723i(long j, int i, boolean z) {
        Log.m105925i("MicroMsg.ConversationListView", "[closeHeader] delay:%s, type: %d, forceClose: %b", Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
        if (getFirstVisiblePosition() != 0 && !z) {
            return;
        }
        if (j > 0) {
            Runnable runnable = this.f219325B;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            C74636j jVar = new C74636j(i);
            this.f219325B = jVar;
            postDelayed(jVar, j);
            return;
        }
        setSelection(0);
    }

    /* renamed from: j */
    public final void mo103724j(Context context) {
        this.f219355p.setAlpha(255);
        this.f219355p.setTextSize((float) C76577a.m92155f(getContext(), C0966R.dimen.f3911io));
        Paint paint = new Paint();
        this.f219337N = paint;
        paint.setColor(-16777216);
        this.f219357q.setColor(getResources().getColor(C0966R.color.FG_3));
        this.f219357q.setStyle(Paint.Style.FILL);
        this.f219357q.setStrokeWidth(getResources().getDimension(C0966R.dimen.f3695bo));
        super.setOnScrollListener(this);
        super.setOnTouchListener(this);
        setOverScrollMode(2);
        Log.m105925i("MicroMsg.ConversationListView", "alvinluo HeaderContainer new, ConversationListView: %d", Integer.valueOf(hashCode()));
        mo103763v();
        mo103744s(false);
        addFooterView(getEmptyFooter());
        this.f219366y = (int) (((float) C76577a.m92155f(getContext(), C0966R.dimen.f3683bc)) * C76577a.m92161l(getContext()));
        this.f219359s = C75044y4.m89989a(getContext()) + C75044y4.m89994f(getContext());
        if (Build.VERSION.SDK_INT >= 24 && LauncherUI.getInstance() != null) {
            boolean isInMultiWindowMode = LauncherUI.getInstance().isInMultiWindowMode();
            this.f219335L = isInMultiWindowMode;
            C71325e eVar = this.f219351i;
            if (eVar != null) {
                ((TaskBarContainer) eVar).mo98167d(isInMultiWindowMode);
            }
        }
        setWillNotDraw(false);
    }

    /* renamed from: k */
    public boolean mo103725k() {
        return mo103726l() && this.f219367z;
    }

    /* renamed from: l */
    public boolean mo103726l() {
        C71323d dVar;
        if (this.f219351i == null || (dVar = this.f219352j) == null) {
            return false;
        }
        return ((C71331l) dVar).mo98261h();
    }

    /* renamed from: m */
    public void mo103727m() {
        if (getFirstVisiblePosition() > getFirstHeaderVisible() + 16) {
            setSelection(getFirstHeaderVisible() + 16);
        }
        post(new C74629c());
    }

    /* renamed from: n */
    public final void mo103728n() {
        View view = this.f219328E;
        if (view != null) {
            view.setTranslationY(0.0f);
            View view2 = this.f219328E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/ConversationListView", "resetActionBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/ConversationListView", "resetActionBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f219324A == null) {
            return;
        }
        if (C85875k4.m106211z()) {
            int color = getResources().getColor(C0966R.color.f3022ch);
            this.f219324A.mo101313c(0.0f, color, color);
            this.f219324A.mo101311a(0.0f, getResources().getColor(C0966R.color.f3275lu), 0);
            return;
        }
        int color2 = getResources().getColor(C0966R.color.f3021cg);
        this.f219324A.mo101313c(0.0f, color2, color2);
        this.f219324A.mo101311a(0.0f, getResources().getColor(C0966R.color.a7_), 0);
    }

    /* renamed from: o */
    public final void mo103729o(int i, boolean z) {
        SharedPreferences.Editor edit;
        Log.m105925i("MicroMsg.ConversationListView", "alvinluo saveTopMargin topMargin: %d, needRead: %b", Integer.valueOf(i), Boolean.valueOf(z));
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        if (defaultPreference != null && (edit = defaultPreference.edit()) != null) {
            edit.putBoolean("Main_need_read_top_margin", z);
            edit.putInt("Main_top_marign", i);
            edit.apply();
            Log.m105924i("MicroMsg.ConversationListView", "alvinluo saveTopMargin success");
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IListener<MultiWindowModeChangedEvent> iListener = this.f219339Q;
        if (iListener != null) {
            iListener.alive();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C71323d dVar;
        super.onConfigurationChanged(configuration);
        Log.m105925i("MicroMsg.ConversationListView", "[onConfigurationChanged] orientation:%s, last: %d", Integer.valueOf(configuration.orientation), 0);
        mo103716f(true);
        mo103762t();
        if (this.f219349g && (dVar = this.f219352j) != null) {
            C71331l lVar = (C71331l) dVar;
            lVar.mo98256c();
            lVar.mo98272p(1.0f, lVar.f206584T, 0);
            lVar.mo98274r(1.0f);
            lVar.f206573K = false;
        }
        C71325e eVar = this.f219351i;
        if (eVar != null) {
            TaskBarContainer taskBarContainer = (TaskBarContainer) eVar;
            Log.m105925i("MicroMsg.AppBrandDesktopContainer", "alvinluo AppBrandDesktopContainer onCustomConfigurationChanged newConfig orientation: %d", Integer.valueOf(configuration.orientation));
            Runnable runnable = taskBarContainer.f206443I;
            if (runnable != null) {
                taskBarContainer.removeCallbacks(runnable);
            }
            View view = taskBarContainer.f206453o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "onCustomConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "onCustomConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C71341r rVar = new C71341r(taskBarContainer);
            taskBarContainer.f206443I = rVar;
            taskBarContainer.postDelayed(rVar, 400);
            TaskBarView taskBarView = taskBarContainer.f206446e;
            if (taskBarView != null) {
                Log.m105925i("MicroMsg.TaskBarView", "alvinluo TaskBarView onCustomConfigurationChanged lastOrientation: %d, orientation: %d", Integer.valueOf(taskBarView.f206481O1), Integer.valueOf(configuration.orientation));
                TaskBarContainer taskBarContainer2 = taskBarView.f206469C1;
                if (taskBarContainer2 != null) {
                    int viewHeight = taskBarContainer2.getViewHeight();
                    taskBarView.f206478L1 = viewHeight;
                    Log.m105925i("MicroMsg.TaskBarView", "alvinluo TaskBarView onCustomConfigurationChanged fixedViewHeight: %d", Integer.valueOf(viewHeight));
                }
                int i = taskBarView.f206481O1;
                int i2 = configuration.orientation;
                if (i != i2) {
                    taskBarView.f206481O1 = i2;
                    TaskBarContainer taskBarContainer3 = taskBarView.f206469C1;
                    if (taskBarContainer3 != null) {
                        C71331l lVar2 = taskBarContainer3.f206445d;
                        if (lVar2 != null ? lVar2.mo98261h() : false) {
                            Log.m105924i("MicroMsg.TaskBarView", "alvinluo onCustomConfigurationChanged closeHeader");
                            C71331l lVar3 = taskBarView.f206469C1.f206445d;
                            if (lVar3 != null) {
                                lVar3.mo98255b(0, 0, true);
                            }
                        }
                    }
                    taskBarView.removeCallbacks(taskBarView.f206507o2);
                    taskBarView.post(taskBarView.f206507o2);
                }
            }
        }
        C78736a aVar2 = this.f219324A;
        if (aVar2 != null) {
            aVar2.mo101312b(true);
        }
        Runnable runnable2 = this.f219326C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        C74628b bVar = new C74628b(configuration);
        this.f219326C = bVar;
        postDelayed(bVar, 800);
        this.f219367z = false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IListener<MultiWindowModeChangedEvent> iListener = this.f219339Q;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f219351i != null && getFirstVisiblePosition() == 0) {
            ((TaskBarContainer) this.f219351i).f206446e.getClass();
            if (((RelativeLayout) this.f219351i).getBottom() > 6 && this.f219354o >= 30) {
                this.f219355p.setStyle(Paint.Style.FILL);
                this.f219355p.setColor(getContext().getResources().getColor(C0966R.color.f3059dr));
                this.f219355p.setAlpha(this.f219354o);
                canvas.drawRect((float) this.f219351i.getBackUpFooterRect().left, (float) (this.f219351i.getBackUpFooterRect().top + this.f219332I), (float) this.f219351i.getBackUpFooterRect().right, (float) this.f219351i.getBackUpFooterRect().bottom, this.f219355p);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
            boolean k = mo103725k();
            Log.m105925i("MicroMsg.ConversationListView", "[onLayout] changed:%s, isHeaderOpen: %b", Boolean.valueOf(z), Boolean.valueOf(k));
            Log.m105919d("MicroMsg.ConversationListView", "[onLayout] top: %d, bottom: %d, height: %d, count: %d, realCount: %d, hashCode: %s", Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i4 - i2), Integer.valueOf(this.f219342T), Integer.valueOf(getRealCount()), Integer.valueOf(hashCode()));
            if (z && !k) {
                setSelection(1);
                post(new C74635i());
            }
            if (z || (this.f219342T < 16 && getRealCount() != this.f219342T)) {
                mo103716f(false);
            }
            this.f219342T = getRealCount();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ConversationListView", e, "alvinluo onLayout exception", new Object[0]);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        r0 = r6.f219351i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r23, int r24, int r25, int r26) {
        /*
            r22 = this;
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/ui/conversation/ConversationListView"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScroll"
            java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
            r4 = r22
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            boolean r0 = r6.f219349g
            r1 = 0
            r2 = 2
            java.lang.String r3 = "MicroMsg.ConversationListView"
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x01d4
            if (r8 != 0) goto L_0x01d4
            boolean r0 = r6.f219333J
            if (r0 == 0) goto L_0x01d4
            android.view.View r0 = r6.getChildAt(r5)
            if (r0 != 0) goto L_0x0072
            boolean r0 = r22.mo103725k()
            if (r0 == 0) goto L_0x0063
            com.tencent.mm.plugin.taskbar.ui.e r0 = r6.f219351i
            if (r0 == 0) goto L_0x0063
            int r0 = r0.getMeasuredHeight()
            int r11 = r6.f219359s
            int r0 = r0 - r11
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r11[r1] = r12
            java.lang.String r12 = "alvinluo computeActionBarTranslation %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r11)
            goto L_0x00b0
        L_0x0072:
            int r0 = r0.getTop()
            int r11 = r22.getHeaderViewsCount()
            int r11 = r8 - r11
            int r11 = java.lang.Math.max(r11, r1)
            int r12 = -r0
            float r11 = (float) r11
            android.content.res.Resources r13 = r22.getResources()
            r14 = 2131165589(0x7f070195, float:1.79454E38)
            float r13 = r13.getDimension(r14)
            float r11 = r11 * r13
            int r11 = (int) r11
            int r12 = r12 + r11
            int r11 = r6.f219359s
            int r12 = r12 + r11
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r1] = r0
            int r0 = -r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r11[r5] = r12
            int r12 = r6.f219359s
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r2] = r12
            java.lang.String r12 = "[viroff] top %d translateY %d scrollOffset %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r12, r11)
        L_0x00b0:
            int r0 = java.lang.Math.max(r1, r0)
            r6.f219334K = r0
            android.view.View r11 = r6.f219328E
            if (r11 == 0) goto L_0x00ca
            float r12 = (float) r0
            r11.setTranslationY(r12)
            com.tencent.mm.ui.conversation.FolderHelper r11 = r6.f219353n
            if (r11 == 0) goto L_0x00ca
            android.widget.LinearLayout r11 = r11.f219409h
            if (r11 != 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            r11.setTranslationY(r12)
        L_0x00ca:
            android.view.View r11 = r6.f219331H
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x015d
            if (r0 <= 0) goto L_0x011f
            r13 = 0
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r15.mo10233c(r13)
            java.lang.Object[] r14 = r15.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/conversation/ConversationListView"
            java.lang.String r17 = "onScroll"
            java.lang.String r18 = "(Landroid/widget/AbsListView;III)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            r13 = r11
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r11.setAlpha(r2)
            java.lang.String r14 = "com/tencent/mm/ui/conversation/ConversationListView"
            java.lang.String r15 = "onScroll"
            java.lang.String r16 = "(Landroid/widget/AbsListView;III)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x015d
        L_0x011f:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Float r13 = java.lang.Float.valueOf(r12)
            r2.mo10233c(r13)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/ui/conversation/ConversationListView"
            java.lang.String r16 = "onScroll"
            java.lang.String r17 = "(Landroid/widget/AbsListView;III)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setAlpha"
            java.lang.String r20 = "(F)V"
            r13 = r11
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r11.setAlpha(r2)
            java.lang.String r14 = "com/tencent/mm/ui/conversation/ConversationListView"
            java.lang.String r15 = "onScroll"
            java.lang.String r16 = "(Landroid/widget/AbsListView;III)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x015d:
            boolean r2 = r6.f219349g
            if (r2 == 0) goto L_0x01d9
            com.tencent.mm.plugin.taskbar.ui.e r2 = r6.f219351i
            if (r2 == 0) goto L_0x01d9
            float r11 = (float) r0
            float r11 = r11 * r12
            r2.getHeight()
            com.tencent.mm.plugin.taskbar.ui.e r13 = r6.f219351i
            int r13 = r13.getHeight()
            int r14 = r6.f219359s
            int r13 = r13 - r14
            com.tencent.mm.plugin.taskbar.ui.TaskBarContainer r2 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarContainer) r2
            boolean r14 = r2.f206441G
            r15 = 10
            if (r14 != 0) goto L_0x0181
            if (r0 > r15) goto L_0x01d9
            r2.f206441G = r5
            goto L_0x01d9
        L_0x0181:
            android.widget.LinearLayout r14 = r2.f206450i
            if (r14 == 0) goto L_0x01d9
            if (r0 > r15) goto L_0x0188
            goto L_0x01d9
        L_0x0188:
            int r15 = r2.getMeasuredHeight()
            int r16 = r2.getBottom()
            int r15 = r15 - r16
            float r15 = (float) r15
            r14.setTranslationY(r15)
            float r14 = (float) r13
            float r11 = r11 / r14
            r14 = 1053609164(0x3ecccccc, float:0.39999998)
            float r11 = r11 * r14
            r14 = 1058642330(0x3f19999a, float:0.6)
            float r11 = r11 + r14
            float r11 = java.lang.Math.min(r11, r12)
            float r11 = java.lang.Math.max(r11, r14)
            android.widget.LinearLayout r12 = r2.f206450i
            r12.setScaleX(r11)
            android.widget.LinearLayout r12 = r2.f206450i
            r12.setScaleY(r11)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r12[r1] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r12[r5] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r14 = 2
            r12[r14] = r11
            java.lang.String r11 = "MicroMsg.AppBrandDesktopContainer"
            java.lang.String r14 = "alvinluo HeaderContainer onScroll scale: %f, scrollY: %d, totalHeight: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r14, r12)
            if (r0 < r13) goto L_0x01d9
            r2.f206441G = r1
            goto L_0x01d9
        L_0x01d4:
            if (r8 <= 0) goto L_0x01d9
            r22.mo103728n()
        L_0x01d9:
            android.widget.AbsListView$OnScrollListener r0 = r6.f219347e
            if (r0 == 0) goto L_0x01e0
            r0.onScroll(r7, r8, r9, r10)
        L_0x01e0:
            boolean r0 = r6.f219349g
            if (r0 == 0) goto L_0x01ed
            com.tencent.mm.plugin.taskbar.ui.d r0 = r6.f219352j
            if (r0 == 0) goto L_0x01ed
            com.tencent.mm.plugin.taskbar.ui.l r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.C71331l) r0
            r0.onScroll(r7, r8, r9, r10)
        L_0x01ed:
            boolean r0 = r6.f219349g
            if (r0 == 0) goto L_0x0260
            if (r9 <= r5) goto L_0x0260
            boolean r0 = r22.mo103726l()
            if (r0 == 0) goto L_0x0260
            com.tencent.mm.plugin.taskbar.ui.e r0 = r6.f219351i
            if (r0 == 0) goto L_0x0260
            int r0 = r0.getBottom()
            android.content.Context r2 = r22.getContext()
            r7 = 56
            int r2 = kg3.C76577a.m92151b(r2, r7)
            int r0 = r0 - r2
            com.tencent.mm.plugin.taskbar.ui.e r2 = r6.f219351i
            android.graphics.Rect r2 = r2.getBackUpFooterRect()
            int r7 = r22.getWidth()
            int r8 = r22.getHeight()
            int r8 = r8 + r0
            r2.set(r1, r0, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.mm.plugin.taskbar.ui.e r2 = r6.f219351i
            android.graphics.Rect r2 = r2.getBackUpFooterRect()
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            com.tencent.mm.plugin.taskbar.ui.e r1 = r6.f219351i
            int r1 = r1.getTop()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r5] = r1
            com.tencent.mm.plugin.taskbar.ui.e r1 = r6.f219351i
            int r1 = r1.getBottom()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "alvinluo onScroll BackUpFooterRect: %s, headerContainer top: %d, bottom: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r1, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            com.tencent.mm.plugin.taskbar.ui.e r1 = r6.f219351i
            int r1 = r1.getBottom()
            float r1 = (float) r1
            float r1 = r1 * r0
            com.tencent.mm.plugin.taskbar.ui.e r0 = r6.f219351i
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (int) r1
            r6.f219354o = r0
        L_0x0260:
            java.lang.String r0 = "com/tencent/mm/ui/conversation/ConversationListView"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScroll"
            java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.ConversationListView.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        AbsListView.OnScrollListener onScrollListener = this.f219347e;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
        C71323d dVar = this.f219352j;
        if (dVar != null && this.f219349g) {
            ((C71331l) dVar).onScrollStateChanged(absListView, i);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/ConversationListView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        FolderHelper folderHelper = this.f219353n;
        if (folderHelper != null && i2 != i4) {
            folderHelper.mo103781c(i2, false);
            folderHelper.mo103778B(true);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C71323d dVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/ConversationListView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f219349g && (dVar = this.f219352j) != null) {
            ((C71331l) dVar).onTouch(view, motionEvent);
        }
        boolean z = false;
        View.OnTouchListener onTouchListener = this.f219348f;
        if (onTouchListener != null) {
            z = false | onTouchListener.onTouch(view, motionEvent);
        }
        C117292a.m165362h(z, this, "com/tencent/mm/ui/conversation/ConversationListView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }

    /* renamed from: p */
    public final void mo103740p(int i, int i2) {
        Log.m105925i("MicroMsg.ConversationListView", "alvinluo initActionBarView statusBarHeight: %d, isInMultiWindowMode: %b, target: %d, actionBarTop: %d, actionBarHeight: %d", Integer.valueOf(this.f219330G), Boolean.valueOf(this.f219335L), Integer.valueOf(i), Integer.valueOf(this.f219328E.getTop()), Integer.valueOf(i2));
        if (i >= 0) {
            if (!this.f219335L) {
                View view = this.f219327D;
                if (view != null) {
                    view.getLayoutParams().height = this.f219330G + (this.f219349g ? 0 : i2);
                }
                View view2 = this.f219331H;
                if (view2 != null) {
                    view2.getLayoutParams().height = this.f219330G + (this.f219349g ? 0 : i2);
                }
            } else {
                View view3 = this.f219327D;
                if (view3 != null) {
                    view3.getLayoutParams().height = i;
                }
                View view4 = this.f219331H;
                if (view4 != null) {
                    view4.getLayoutParams().height = i;
                }
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (!this.f219335L) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    if (this.f219349g) {
                        i2 = 0;
                    }
                    layoutParams2.topMargin = i2;
                } else {
                    ((RelativeLayout.LayoutParams) layoutParams).topMargin = 0;
                }
            }
            mo103762t();
        }
    }

    /* renamed from: q */
    public final void mo103741q() {
        boolean z;
        if (this.f219328E == null) {
            View findViewById = getRootView().findViewById(C0966R.C0970id.f5383do);
            this.f219328E = findViewById;
            if (findViewById != null) {
                findViewById.addOnLayoutChangeListener(this.f219340R);
            } else {
                return;
            }
        }
        if (this.f219331H == null) {
            this.f219331H = getRootView().findViewById(C0966R.C0970id.krt);
        }
        if (this.f219335L && Build.VERSION.SDK_INT >= 24 && LauncherUI.getInstance() != null) {
            boolean isInMultiWindowMode = LauncherUI.getInstance().isInMultiWindowMode();
            this.f219335L = isInMultiWindowMode;
            Log.m105925i("MicroMsg.ConversationListView", "alvinluo initActionBarView check multiWindowMode %b", Boolean.valueOf(isInMultiWindowMode));
        }
        int a = C78538u.m94865a(getContext());
        int i = this.f219330G;
        if (i == 0 || !(this.f219335L || this.f219328E.getTop() == this.f219330G || this.f219328E.getTop() == 0)) {
            this.f219330G = this.f219328E.getTop();
            z = true;
        } else {
            z = false;
        }
        if (!z || this.f219335L) {
            int top = this.f219328E.getTop();
            this.f219330G = top;
            if (top <= 0 && !this.f219335L) {
                this.f219330G = C75044y4.m89994f(getContext());
            }
            mo103740p(this.f219330G, a);
            mo103729o(this.f219330G, false);
        } else {
            post(new C74632f(a));
        }
        if (this.f219330G != i) {
            Log.m105925i("MicroMsg.ConversationListView", "statusBar height changed old:%d new:%d", Integer.valueOf(i), Integer.valueOf(this.f219330G));
            mo103716f(false);
        }
    }

    /* renamed from: r */
    public final void mo103742r(float f, int i, int i2) {
        C78736a aVar = this.f219324A;
        if (aVar != null) {
            aVar.mo101311a(f, i, 0);
            this.f219324A.mo101313c(f, i2, i2);
        }
    }

    public boolean removeHeaderView(View view) {
        int i = 0;
        while (true) {
            if (i >= this.f219346d.size()) {
                i = -1;
                break;
            }
            ListView.FixedViewInfo fixedViewInfo = this.f219346d.get(i);
            if (fixedViewInfo != null && fixedViewInfo.view == view) {
                break;
            }
            i++;
        }
        if (i != -1) {
            this.f219346d.remove(i);
        }
        return super.removeHeaderView(view);
    }

    /* renamed from: s */
    public final void mo103744s(boolean z) {
        boolean z2;
        boolean z3 = this.f219349g;
        this.f219349g = true;
        Log.m105925i("MicroMsg.ConversationListView", "updateHeaderContainer showHeaderContainer: %b, last: %b, updateView: %b, isHeaderContainerAdded: %b", true, Boolean.valueOf(z3), Boolean.valueOf(z), Boolean.valueOf(this.f219350h));
        if (!z || z3 == (z2 = this.f219349g)) {
            return;
        }
        if (z2) {
            if (!this.f219350h) {
                if (this.f219351i != null) {
                    ArrayList<View> headerViewList = getHeaderViewList();
                    Log.m105925i("MicroMsg.ConversationListView", "removeHeaderViewList size: %d", Integer.valueOf(headerViewList.size()));
                    for (int i = 0; i < headerViewList.size(); i++) {
                        View view = headerViewList.get(i);
                        if (view != null) {
                            removeHeaderView(view);
                        }
                    }
                    addHeaderView((RelativeLayout) this.f219351i);
                    headerViewList.remove((RelativeLayout) this.f219351i);
                    Log.m105925i("MicroMsg.ConversationListView", "addHeaderViewList addViewList: %d", Integer.valueOf(headerViewList.size()));
                    for (int i2 = 0; i2 < headerViewList.size(); i2++) {
                        addHeaderView(headerViewList.get(i2));
                    }
                    mo103741q();
                }
                this.f219350h = true;
                mo103723i(200, 0, true);
            }
        } else if (this.f219350h) {
            C71325e eVar = this.f219351i;
            if (eVar != null) {
                removeHeaderView((RelativeLayout) eVar);
                mo103741q();
            }
            this.f219350h = false;
            setSelection(0);
        }
    }

    public void setActionBarUpdateCallback(C78736a aVar) {
        C71323d dVar = this.f219352j;
        if (dVar != null) {
            this.f219324A = aVar;
            ((C71331l) dVar).f206609o = new C74630d(this, aVar);
        }
    }

    public void setActivity(MMFragmentActivity mMFragmentActivity) {
        this.f219364x = mMFragmentActivity;
        C71325e eVar = this.f219351i;
        if (eVar != null) {
            eVar.setActivity(mMFragmentActivity);
        }
    }

    public void setFoldBanner(View view) {
        C71325e eVar = this.f219351i;
        if (eVar != null) {
            eVar.setFoldBanner(view);
        }
    }

    public void setFoldHelper(FolderHelper folderHelper) {
        this.f219353n = folderHelper;
    }

    public void setHighLightChildNew(int i) {
        this.f219338P = true;
        if (C85875k4.m106211z()) {
            this.f219337N.setColor(getResources().getColor(C0966R.color.f2975b6));
        } else {
            this.f219337N.setColor(getResources().getColor(C0966R.color.f3131gg));
        }
        Log.m105924i("MicroMsg.ConversationListView", "[newStyle] setfalse" + this.f219338P);
        int max = Math.max(0, i);
        View childAt = getChildAt(max);
        if (childAt == null) {
            Log.m105921e("MicroMsg.ConversationListView", "null == view index:%s", Integer.valueOf(max));
            return;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            childAt = getChildAt(getHeaderViewsCount() + max);
        }
        if (childAt == null) {
            Log.m105921e("MicroMsg.ConversationListView", "null == view index:%s", Integer.valueOf(max + getHeaderViewsCount()));
            return;
        }
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{C85875k4.m106211z() ? PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f}) : PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f})});
        childAt.getGlobalVisibleRect(this.f219336M);
        ofPropertyValuesHolder.addUpdateListener(new C74633g(childAt));
        ofPropertyValuesHolder.addListener(new C74634h());
        ofPropertyValuesHolder.setDuration(1150);
        ofPropertyValuesHolder.start();
    }

    public void setIsCurrentMainUI(boolean z) {
        Log.m105925i("MicroMsg.ConversationListView", "alvinluo setIsCurrentMainUI: %b", Boolean.valueOf(z));
        this.f219333J = z;
        C71323d dVar = this.f219352j;
        if (dVar != null) {
            C71331l lVar = (C71331l) dVar;
            lVar.f206592X = z;
            if (!z && lVar.f206575M) {
                Log.m105924i("MicroMsg.TaskBarAnimController", "alvinluo setIsCurrentMainUI and header open, close");
                lVar.mo98255b(0, 0, true);
            }
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f219365x0 = onItemClickListener;
        super.setOnItemClickListener(new C74627a());
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f219356p0 = onItemLongClickListener;
        super.setOnItemLongClickListener(new C74638l());
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f219347e = onScrollListener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f219348f = onTouchListener;
    }

    public void setSelection(int i) {
        Log.m105925i("MicroMsg.ConversationListView", "[setSelection] position:%s, scrollOffset: %d", Integer.valueOf(i), Integer.valueOf(this.f219359s));
        if (i == 0) {
            super.setSelectionFromTop(getFirstHeaderVisible(), this.f219359s);
        } else {
            super.setSelectionFromTop(i, this.f219359s);
        }
    }

    public void setSelectionFromTop(int i, int i2) {
        Log.m105925i("MicroMsg.ConversationListView", "[setSelectionFromTop] position:%s, scrollOffset: %d", Integer.valueOf(i), Integer.valueOf(i2));
        super.setSelectionFromTop(i, i2);
    }

    public void setStatusBarMaskView(View view) {
        this.f219327D = view;
        C71323d dVar = this.f219352j;
        if (dVar != null) {
            ((C71331l) dVar).f206612q = view;
        }
    }

    public void setonDispatchTouchEventListener(View.OnTouchListener onTouchListener) {
        this.f219341S = onTouchListener;
    }

    public void smoothScrollToPosition(int i) {
        Log.m105925i("MicroMsg.ConversationListView", "[smoothScrollToPosition] position:%s", Integer.valueOf(i));
        if (i == 0) {
            super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), this.f219359s);
        } else {
            super.smoothScrollToPositionFromTop(i, this.f219359s);
        }
    }

    public void smoothScrollToPositionFromTop(int i, int i2) {
        Log.m105925i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0) {
            super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), i2 + this.f219359s);
        } else {
            super.smoothScrollToPositionFromTop(i, i2 + this.f219359s);
        }
    }

    /* renamed from: t */
    public final void mo103762t() {
        C71323d dVar;
        int f = C75044y4.m89994f(getContext());
        int i = this.f219330G;
        if (i <= 0 && !this.f219335L) {
            i = f;
        }
        int i2 = this.f219359s;
        this.f219359s = C75044y4.m89989a(getContext()) + i;
        Log.m105925i("MicroMsg.ConversationListView", "updateScrollOffset statusBarHeight:%d actionBarTop:%d scrollOffset:%d old:%d", Integer.valueOf(f), Integer.valueOf(this.f219330G), Integer.valueOf(this.f219359s), Integer.valueOf(i2));
        if (this.f219349g && (dVar = this.f219352j) != null) {
            int i3 = this.f219359s;
            C71331l lVar = (C71331l) dVar;
            lVar.getClass();
            Log.m105925i("MicroMsg.TaskBarAnimController", "updateScrollOffset %d", Integer.valueOf(i3));
            lVar.f206607j = i3;
        }
        C71325e eVar = this.f219351i;
        if (eVar != null) {
            TaskBarContainer taskBarContainer = (TaskBarContainer) eVar;
            if (taskBarContainer.f206462x != i) {
                taskBarContainer.f206462x = i;
                ((FrameLayout.LayoutParams) taskBarContainer.f206450i.getLayoutParams()).topMargin = i;
                ViewGroup.LayoutParams layoutParams = taskBarContainer.f206464z.f197224d.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).topMargin = i;
            }
        }
        if (i2 != this.f219359s) {
            setSelection(1);
        }
    }

    /* renamed from: v */
    public final void mo103763v() {
        Class cls = C10432i.class;
        this.f219362v = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        this.f219363w = ((C10432i) C86312j.m106911c(cls)).Oh0();
        Log.m105919d("MicroMsg.ConversationListView", "updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", Boolean.valueOf(this.f219362v), Integer.valueOf(this.f219363w));
    }

    public void smoothScrollToPositionFromTop(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.ConversationListView", "[smoothScrollToPositionFromTop] position:%s offset:%s duration:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i == 0) {
            super.smoothScrollToPositionFromTop(getFirstHeaderVisible(), i2 + this.f219359s, i3);
        } else {
            super.smoothScrollToPositionFromTop(i, i2 + this.f219359s, i3);
        }
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo103724j(context);
    }
}
