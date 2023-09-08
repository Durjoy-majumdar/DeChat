package com.tencent.p014mm.view;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.footer.SelectColorBar;
import cq3.C106952a;
import eq3.C107283a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104085b;
import p248ug.C111159e;
import p248ug.C111164r0;
import p248ug.C111167t;
import p248ug.C111168v;
import p248ug.C78158s0;
import p248ug.C78160t0;
import zp3.C66954b;
import zp3.a$$a;

/* renamed from: com.tencent.mm.view.e */
public abstract class C106853e extends C111159e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    public C111164r0.C111165a f319931e;

    /* renamed from: f */
    public C106952a f319932f;

    /* renamed from: g */
    public C111167t[] f319933g;

    /* renamed from: h */
    public View f319934h;

    /* renamed from: i */
    public C107283a f319935i;

    /* renamed from: j */
    public View f319936j;

    /* renamed from: n */
    public View f319937n;

    /* renamed from: o */
    public View f319938o;

    /* renamed from: p */
    public ChatFooterPanel f319939p;

    /* renamed from: q */
    public C109623f f319940q;

    /* renamed from: r */
    public Button f319941r;

    /* renamed from: s */
    public Button f319942s;

    /* renamed from: t */
    public PhotoEditText f319943t;

    /* renamed from: u */
    public TextModeSelectView f319944u;

    /* renamed from: v */
    public boolean f319945v = true;

    /* renamed from: w */
    public boolean f319946w = true;

    /* renamed from: com.tencent.mm.view.e$a */
    public class C106854a implements Animation.AnimationListener {
        public C106854a() {
        }

        public void onAnimationEnd(Animation animation) {
            C106853e.this.f319939p.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C106853e.this.f319939p.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.view.e$b */
    public class C106855b implements Animation.AnimationListener {
        public C106855b() {
        }

        public void onAnimationEnd(Animation animation) {
            C106853e.this.f319939p.setVisibility(0);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.view.e$c */
    public class C106856c implements View.OnClickListener {
        public C106856c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/BaseDrawingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C106853e.this.getTextEditView().getVisibility() == 0) {
                C109623f presenter = C106853e.this.getPresenter();
                Editable text = C106853e.this.f319943t.getText();
                int currentTextColor = C106853e.this.f319943t.getCurrentTextColor();
                int intValue = C106853e.this.f319944u.getCurMode() == 3 ? ((Integer) C106853e.this.f319944u.getTag()).intValue() : 0;
                C109612c cVar = (C109612c) presenter;
                cVar.getClass();
                if (text != null) {
                    cVar.mo160831o(text.toString(), currentTextColor, intValue, "", false, 0.0f, true, true, 0);
                }
            } else {
                C111168v vVar = ((C109612c) C106853e.this.getPresenter()).f328162e;
                if (vVar != null) {
                    vVar.onFinish();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/view/BaseDrawingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.view.e$d */
    public class C106857d implements View.OnClickListener {
        public C106857d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/BaseDrawingView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C106853e.this.getTextEditView().getVisibility() == 0) {
                C109612c cVar = (C109612c) C106853e.this.getPresenter();
                cVar.f328158a.setFooterVisible(true);
                cVar.mo160834r(false);
            } else {
                C111168v vVar = ((C109612c) C106853e.this.getPresenter()).f328162e;
                if (vVar != null) {
                    vVar.mo79182o0();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/view/BaseDrawingView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.view.e$e */
    public class C106858e implements SelectColorBar.C106865a {
        public C106858e() {
        }

        /* renamed from: b */
        public void mo154869b(int i) {
            if (C106853e.this.f319944u.getCurMode() == 3) {
                C106853e.this.f319944u.setTag(Integer.valueOf(i));
                C106853e.this.f319943t.setTextBackground(i);
                return;
            }
            C106853e.this.f319943t.setTextColor(i);
        }
    }

    /* renamed from: com.tencent.mm.view.e$f */
    public class C106859f implements C78158s0.C78159a {
        public C106859f() {
        }

        /* renamed from: a */
        public void mo68482a(IEmojiInfo iEmojiInfo) {
            Log.m105925i("MicroMsg.BaseDrawingView", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
            ((C109612c) C106853e.this.getPresenter()).mo160830n(iEmojiInfo);
            onHide();
        }

        public void onHide() {
            C106853e.this.setActionBarVisible(true);
            C106853e.this.mo154840c(true);
            C106853e.this.setFooterVisible(true);
        }
    }

    /* renamed from: com.tencent.mm.view.e$g */
    public class C106860g implements Runnable {
        public C106860g() {
        }

        public void run() {
            C109612c cVar = (C109612c) C106853e.this.getPresenter();
            cVar.getClass();
            Log.m105924i("MicroMsg.DrawingPresenter", "[onAttachedToWindow]");
            if (!cVar.f328175r) {
                cVar.f328175r = true;
                Iterator<C104085b> it = cVar.f328161d.iterator();
                while (it.hasNext()) {
                    C104085b next = it.next();
                    if (ArtistCacheManager.m140185a().mo148161d(next.mo145700k())) {
                        next.mo145706q();
                        next.mo145688A(true);
                        Log.m105925i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", next.mo145700k());
                    }
                }
                if (cVar.f328158a.getBaseBoardView().mo157331e()) {
                    cVar.f328158a.getBaseBoardView().mo157327a();
                    cVar.f328158a.getBaseBoardView().invalidate();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.view.e$h */
    public class C106861h implements Animation.AnimationListener {
        public C106861h() {
        }

        public void onAnimationEnd(Animation animation) {
            View actionBar = C106853e.this.getActionBar();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(actionBar, aVar.mo10232b(), "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            actionBar.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(actionBar, "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View footerBg = C106853e.this.getFooterBg();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(footerBg, aVar2.mo10232b(), "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(footerBg, "com/tencent/mm/view/BaseDrawingView$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.view.e$i */
    public class C106862i implements Animation.AnimationListener {
        public C106862i() {
        }

        public void onAnimationEnd(Animation animation) {
            View actionBar = C106853e.this.getActionBar();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(actionBar, aVar.mo10232b(), "com/tencent/mm/view/BaseDrawingView$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            actionBar.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(actionBar, "com/tencent/mm/view/BaseDrawingView$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View footerBg = C106853e.this.getFooterBg();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(footerBg, aVar2.mo10232b(), "com/tencent/mm/view/BaseDrawingView$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(footerBg, "com/tencent/mm/view/BaseDrawingView$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.view.e$j */
    public class C106863j implements Animation.AnimationListener {
        public C106863j() {
        }

        public void onAnimationEnd(Animation animation) {
            View footerBg = C106853e.this.getFooterBg();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(footerBg, aVar.mo10232b(), "com/tencent/mm/view/BaseDrawingView$8", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(footerBg, "com/tencent/mm/view/BaseDrawingView$8", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View actionBar = C106853e.this.getActionBar();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(actionBar, aVar2.mo10232b(), "com/tencent/mm/view/BaseDrawingView$8", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            actionBar.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(actionBar, "com/tencent/mm/view/BaseDrawingView$8", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.view.e$k */
    public class C106864k implements Animation.AnimationListener {
        public C106864k() {
        }

        public void onAnimationEnd(Animation animation) {
            View footerBg = C106853e.this.getFooterBg();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(footerBg, aVar.mo10232b(), "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(footerBg, "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View actionBar = C106853e.this.getActionBar();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(actionBar, aVar2.mo10232b(), "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            actionBar.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(actionBar, "com/tencent/mm/view/BaseDrawingView$9", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C106853e(Context context) {
        super(context);
    }

    /* renamed from: a */
    public abstract C106952a mo154838a();

    /* renamed from: b */
    public abstract C107283a mo154839b();

    /* renamed from: c */
    public void mo154840c(boolean z) {
        Log.m105925i("MicroMsg.BaseDrawingView", "[hideSimleyPanel] isHide:%s", Boolean.valueOf(z));
        ChatFooterPanel chatFooterPanel = this.f319939p;
        if (chatFooterPanel != null) {
            if (chatFooterPanel.getVisibility() == 0 && z) {
                this.f319939p.setVisibility(8);
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2469dt);
                loadAnimation.setAnimationListener(new C106854a());
                this.f319939p.startAnimation(loadAnimation);
            } else if (this.f319939p.getVisibility() == 8 && !z) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2471dv);
                loadAnimation2.setAnimationListener(new C106855b());
                this.f319939p.startAnimation(loadAnimation2);
            }
        }
    }

    /* renamed from: d */
    public void mo154841d() {
        ((C109612c) getPresenter()).mo160826j(getConfig());
        removeAllViews();
        addView(getBaseBoardView(), new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) getResources().getDimension(C0966R.dimen.a5p));
        layoutParams.gravity = 80;
        addView(getFooterBg(), layoutParams);
        addView(getBaseFooterView(), layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        View textEditView = getTextEditView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(textEditView, aVar.mo10232b(), "com/tencent/mm/view/BaseDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(textEditView, "com/tencent/mm/view/BaseDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getTextEditView(), layoutParams2);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) getRubbishView().getLayoutParams();
        layoutParams3.gravity = 81;
        int c = layoutParams3.bottomMargin + C75044y4.m89991c(getContext());
        layoutParams3.bottomMargin = c;
        layoutParams3.bottomMargin = c + C76577a.m92151b(getContext(), 32);
        View rubbishView = getRubbishView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = rubbishView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/view/BaseDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/view/BaseDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getRubbishView(), layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, C78160t0.m94370a(getContext()));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin += C75044y4.m89991c(getContext());
        addView(getChatFooterPanel(), layoutParams4);
        new FrameLayout.LayoutParams(-1, (int) getResources().getDimension(C0966R.dimen.f3678b8)).gravity = 48;
        if (this.f319931e.f332926c) {
            addView(getActionBar());
        } else {
            getBaseFooterView().setVisibility(8);
        }
    }

    public View getActionBar() {
        if (this.f319936j == null) {
            this.f319936j = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bmz, (ViewGroup) null);
            this.f319936j.setPadding(0, C85875k4.m106205t(getContext(), false) ? C85875k4.m106198o(getContext()) + 0 : 0, 0, 0);
            Button button = (Button) this.f319936j.findViewById(C0966R.C0970id.cbc);
            this.f319941r = button;
            button.setOnClickListener(new C106856c());
            Button button2 = (Button) this.f319936j.findViewById(C0966R.C0970id.cb9);
            this.f319942s = button2;
            button2.setOnClickListener(new C106857d());
        }
        return this.f319936j;
    }

    public <T extends C106952a> T getBaseBoardView() {
        if (this.f319932f == null) {
            this.f319932f = mo154838a();
        }
        return this.f319932f;
    }

    public <T extends C107283a> T getBaseFooterView() {
        if (this.f319935i == null) {
            this.f319935i = mo154839b();
        }
        return this.f319935i;
    }

    public TextModeSelectView getBgSwitch() {
        return this.f319944u;
    }

    public ChatFooterPanel getChatFooterPanel() {
        if (this.f319939p == null) {
            boolean z = false;
            try {
                SmileyPanel b = C78160t0.m94371b(getContext());
                this.f319939p = b;
                int i = ChatFooterPanel.f211589f;
                b.setEntranceScene(3);
                this.f319939p.setShowSmiley(false);
                this.f319939p.setShowClose(true);
                this.f319939p.setVisibility(8);
                this.f319939p.mo100197i();
                C78158s0 d = C78160t0.m94373d();
                d.f229009a = new C106859f();
                this.f319939p.setCallback(d);
            } catch (Exception e) {
                Object[] objArr = new Object[2];
                objArr[0] = e.getMessage();
                if (getContext() == null) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                Log.m105921e("MicroMsg.BaseDrawingView", "exception:%s,getContext() is null?", objArr);
                throw e;
            }
        }
        return this.f319939p;
    }

    public C111164r0.C111165a getConfig() {
        return this.f319931e;
    }

    public abstract C111167t[] getFeatures();

    public View getFooterBg() {
        if (this.f319934h == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.as6, (ViewGroup) null);
            this.f319934h = inflate;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = inflate;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/view/BaseDrawingView", "getFooterBg", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/view/BaseDrawingView", "getFooterBg", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return this.f319934h;
    }

    public C109623f getPresenter() {
        if (this.f319940q == null) {
            C109612c cVar = new C109612c();
            this.f319940q = cVar;
            cVar.f328158a = this;
        }
        return this.f319940q;
    }

    public View getRubbishView() {
        if (this.f319937n == null) {
            this.f319938o = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bty, this, false);
        }
        return this.f319938o;
    }

    public View getTextEditView() {
        if (this.f319937n == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.a0d, (ViewGroup) null);
            this.f319937n = inflate;
            PhotoEditText photoEditText = (PhotoEditText) inflate.findViewById(C0966R.C0970id.ki7);
            this.f319943t = photoEditText;
            int dimension = (int) photoEditText.getResources().getDimension(C0966R.dimen.a29);
            int dimension2 = (int) this.f319943t.getResources().getDimension(C0966R.dimen.f4293z0);
            if (C85875k4.m106205t(getContext(), false)) {
                dimension2 += C85875k4.m106198o(getContext());
            }
            this.f319943t.setPadding(dimension, dimension2, dimension, 0);
            SelectColorBar selectColorBar = (SelectColorBar) this.f319937n.findViewById(C0966R.C0970id.j9j);
            TextModeSelectView textModeSelectView = (TextModeSelectView) this.f319937n.findViewById(C0966R.C0970id.a8q);
            this.f319944u = textModeSelectView;
            textModeSelectView.setTag(-707825);
            this.f319944u.setModeChangeListener(new a$$a(this, selectColorBar));
            this.f319943t.setTextColor(-1);
            selectColorBar.setSelectColor(-1);
            selectColorBar.setSelectColorListener(new C106858e());
        }
        return this.f319937n;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new C106860g());
    }

    public void onGlobalLayout() {
        if (getTextEditView().getVisibility() == 0) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f319943t.postDelayed(new C66954b(this), 160);
        }
    }

    public void setActionBarCallback(C111168v vVar) {
        ((C109612c) getPresenter()).f328162e = vVar;
    }

    public void setActionBarVisible(boolean z) {
        if (this.f319946w == z) {
            Log.m105928w("MicroMsg.BaseDrawingView", "[setActionBarVisible] isShowActionBar == isShow");
            return;
        }
        this.f319946w = z;
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2328p);
            loadAnimation.setAnimationListener(new C106861h());
            getActionBar().startAnimation(loadAnimation);
            return;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2329q);
        loadAnimation2.setAnimationListener(new C106862i());
        getActionBar().startAnimation(loadAnimation2);
    }

    public void setAutoShowFooterAndBar(boolean z) {
        ((C109612c) getPresenter()).f328164g = z;
    }

    public void setFooterBgVisible(boolean z) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2328p);
            loadAnimation.setAnimationListener(new C106863j());
            getActionBar().startAnimation(loadAnimation);
            return;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2329q);
        loadAnimation2.setAnimationListener(new C106864k());
        getActionBar().startAnimation(loadAnimation2);
    }

    public void setFooterVisible(boolean z) {
        if (this.f319945v != z && getConfig().f332926c) {
            getBaseFooterView().setFooterVisible(z);
            setFooterBgVisible(z);
            this.f319945v = z;
        }
    }

    public void setup(C111164r0.C111165a aVar) {
        this.f319931e = aVar;
        mo154841d();
        this.f319932f.mo157350h();
    }
}
