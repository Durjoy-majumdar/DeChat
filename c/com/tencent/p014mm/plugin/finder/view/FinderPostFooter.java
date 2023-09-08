package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p248ug.C78160t0;
import rx3.C13598b0;
import up1.C37521f;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001VB\u001d\b\u0016\u0012\b\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\u0010S\u001a\u0004\u0018\u00010R¢\u0006\u0004\bT\u0010UR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00102\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R*\u0010;\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010?\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010!R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006W"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostFooter;", "Landroid/widget/LinearLayout;", "", "Lcom/tencent/mm/ui/MMActivity;", "d", "Lcom/tencent/mm/ui/MMActivity;", "getActivity", "()Lcom/tencent/mm/ui/MMActivity;", "setActivity", "(Lcom/tencent/mm/ui/MMActivity;)V", "activity", "Lcom/tencent/mm/api/SmileyPanel;", "e", "Lcom/tencent/mm/api/SmileyPanel;", "getSmileyPanel", "()Lcom/tencent/mm/api/SmileyPanel;", "setSmileyPanel", "(Lcom/tencent/mm/api/SmileyPanel;)V", "smileyPanel", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getSmileyBtn", "()Landroid/widget/ImageView;", "setSmileyBtn", "(Landroid/widget/ImageView;)V", "smileyBtn", "Landroid/view/View;", "g", "Landroid/view/View;", "getTopicBtn", "()Landroid/view/View;", "setTopicBtn", "(Landroid/view/View;)V", "topicBtn", "h", "getAtBtn", "setAtBtn", "atBtn", "Lcom/tencent/mm/ui/widget/MMEditText;", "i", "Lcom/tencent/mm/ui/widget/MMEditText;", "getEditText", "()Lcom/tencent/mm/ui/widget/MMEditText;", "setEditText", "(Lcom/tencent/mm/ui/widget/MMEditText;)V", "editText", "j", "getShortTitleEt", "setShortTitleEt", "shortTitleEt", "Lkotlin/Function0;", "Lrx3/b0;", "o", "Lfy3/a;", "getBackClickListener", "()Lfy3/a;", "setBackClickListener", "(Lfy3/a;)V", "backClickListener", "p", "getContainer", "setContainer", "container", "", "q", "I", "getAtReqCode", "()I", "setAtReqCode", "(I)V", "atReqCode", "Lcom/tencent/mm/plugin/finder/view/FinderPostFooter$a;", "r", "Lcom/tencent/mm/plugin/finder/view/FinderPostFooter$a;", "getITopicCallback", "()Lcom/tencent/mm/plugin/finder/view/FinderPostFooter$a;", "setITopicCallback", "(Lcom/tencent/mm/plugin/finder/view/FinderPostFooter$a;)V", "iTopicCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderPostFooter */
public final class FinderPostFooter extends LinearLayout implements C111847h {

    /* renamed from: s */
    public static final /* synthetic */ int f162112s = 0;

    /* renamed from: d */
    public MMActivity f162113d;

    /* renamed from: e */
    public SmileyPanel f162114e;

    /* renamed from: f */
    public ImageView f162115f;

    /* renamed from: g */
    public View f162116g;

    /* renamed from: h */
    public View f162117h;

    /* renamed from: i */
    public MMEditText f162118i;

    /* renamed from: j */
    public MMEditText f162119j;

    /* renamed from: n */
    public float f162120n = ((float) KeyBoardUtil.getKeyBordHeightPx(getContext()));

    /* renamed from: o */
    public C32224a<C13598b0> f162121o;

    /* renamed from: p */
    public View f162122p;

    /* renamed from: q */
    public int f162123q;

    /* renamed from: r */
    public C56564a f162124r;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderPostFooter$a */
    public interface C56564a {
        /* renamed from: U1 */
        void mo75068U1();
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderPostFooter$b */
    public static final class C56565b implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ FinderPostFooter f162125a;

        public C56565b(FinderPostFooter finderPostFooter) {
            this.f162125a = finderPostFooter;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            MMEditText shortTitleEt = this.f162125a.getShortTitleEt();
            boolean z = true;
            if (shortTitleEt == null || !shortTitleEt.hasFocus()) {
                z = false;
            }
            if (z) {
                MMEditText shortTitleEt2 = this.f162125a.getShortTitleEt();
                if (shortTitleEt2 != null) {
                    shortTitleEt2.mo98046o(str);
                    return;
                }
                return;
            }
            MMEditText editText = this.f162125a.getEditText();
            if (editText != null) {
                editText.mo98046o(str);
            }
        }

        /* renamed from: c */
        public void mo64628c() {
            InputConnection inputConnection;
            InputConnection inputConnection2;
            InputConnection inputConnection3;
            InputConnection inputConnection4;
            MMEditText shortTitleEt = this.f162125a.getShortTitleEt();
            if (shortTitleEt != null && shortTitleEt.hasFocus()) {
                MMEditText shortTitleEt2 = this.f162125a.getShortTitleEt();
                if (!(shortTitleEt2 == null || (inputConnection4 = shortTitleEt2.getInputConnection()) == null)) {
                    inputConnection4.sendKeyEvent(new KeyEvent(0, 67));
                }
                MMEditText shortTitleEt3 = this.f162125a.getShortTitleEt();
                if (shortTitleEt3 != null && (inputConnection3 = shortTitleEt3.getInputConnection()) != null) {
                    inputConnection3.sendKeyEvent(new KeyEvent(1, 67));
                    return;
                }
                return;
            }
            MMEditText editText = this.f162125a.getEditText();
            if (!(editText == null || (inputConnection2 = editText.getInputConnection()) == null)) {
                inputConnection2.sendKeyEvent(new KeyEvent(0, 67));
            }
            MMEditText editText2 = this.f162125a.getEditText();
            if (editText2 != null && (inputConnection = editText2.getInputConnection()) != null) {
                inputConnection.sendKeyEvent(new KeyEvent(1, 67));
            }
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderPostFooter$c */
    public static final class C56566c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostFooter f162126d;

        public C56566c(FinderPostFooter finderPostFooter) {
            this.f162126d = finderPostFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderPostFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.ImageView");
            Object tag = ((ImageView) view).getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Boolean");
            FinderPostFooter finderPostFooter = this.f162126d;
            int i = FinderPostFooter.f162112s;
            finderPostFooter.mo79845a(!((Boolean) tag).booleanValue(), true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderPostFooter$d */
    public static final class C56567d implements MMEditText.C74949b {

        /* renamed from: a */
        public final /* synthetic */ FinderPostFooter f162127a;

        public C56567d(FinderPostFooter finderPostFooter) {
            this.f162127a = finderPostFooter;
        }

        /* renamed from: a */
        public final void mo65425a() {
            C32224a<C13598b0> backClickListener = this.f162127a.getBackClickListener();
            if (backClickListener != null) {
                backClickListener.invoke();
            }
        }
    }

    public FinderPostFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo79845a(boolean z, boolean z2) {
        if (!z) {
            getSmileyBtn().setImageResource(C0966R.C0969drawable.f4802nb);
            getSmileyBtn().setTag(Boolean.FALSE);
            getSmileyPanel().animate().alpha(0.0f).setDuration(220).setListener(new C56663x3(this)).start();
            if (z2) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).showVKB();
            }
        } else {
            getSmileyPanel().setVisibility(0);
            getSmileyBtn().setImageResource(C0966R.C0969drawable.f4802nb);
            getSmileyBtn().setTag(Boolean.TRUE);
            getSmileyPanel().setAlpha(0.0f);
            getSmileyPanel().animate().alpha(1.0f).setDuration(220).setListener((Animator.AnimatorListener) null).start();
            Context context2 = getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context2).hideVKB();
        }
        if (z) {
            getSmileyBtn().setImageResource(C0966R.C0969drawable.f4803nc);
        } else {
            getSmileyBtn().setImageResource(C0966R.C0969drawable.f4802nb);
        }
    }

    /* renamed from: b */
    public final void mo79846b(boolean z) {
        if (!C37521f.f99374d.mo61175c() || !z) {
            View atBtn = getAtBtn();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = atBtn;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            atBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View atBtn2 = getAtBtn();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = atBtn2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        atBtn2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: c */
    public final void mo79847c(boolean z) {
        if (!C37521f.f99374d.mo61158L() || !z) {
            View topicBtn = getTopicBtn();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = topicBtn;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showTopicBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            topicBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showTopicBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View topicBtn2 = getTopicBtn();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = topicBtn2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showTopicBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        topicBtn2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderPostFooter", "showTopicBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final MMActivity getActivity() {
        MMActivity mMActivity = this.f162113d;
        if (mMActivity != null) {
            return mMActivity;
        }
        C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        throw null;
    }

    public final View getAtBtn() {
        View view = this.f162117h;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("atBtn");
        throw null;
    }

    public final int getAtReqCode() {
        return this.f162123q;
    }

    public final C32224a<C13598b0> getBackClickListener() {
        return this.f162121o;
    }

    public final View getContainer() {
        return this.f162122p;
    }

    public final MMEditText getEditText() {
        return this.f162118i;
    }

    public final C56564a getITopicCallback() {
        C56564a aVar = this.f162124r;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("iTopicCallback");
        throw null;
    }

    public final MMEditText getShortTitleEt() {
        return this.f162119j;
    }

    public final ImageView getSmileyBtn() {
        ImageView imageView = this.f162115f;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("smileyBtn");
        throw null;
    }

    public final SmileyPanel getSmileyPanel() {
        SmileyPanel smileyPanel = this.f162114e;
        if (smileyPanel != null) {
            return smileyPanel;
        }
        C87412m.m108603p("smileyPanel");
        throw null;
    }

    public final View getTopicBtn() {
        View view = this.f162116g;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("topicBtn");
        throw null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.jni);
        C87412m.m108593f(findViewById, "findViewById(com.tencent…n.finder.R.id.smiley_btn)");
        setSmileyBtn((ImageView) findViewById);
        getSmileyBtn().setTag(Boolean.FALSE);
        SmileyPanel c = C78160t0.m94372c(getContext(), false);
        C87412m.m108593f(c, "getSmileyPanel(context, false)");
        setSmileyPanel(c);
        getSmileyPanel().setEntranceScene(13);
        getSmileyPanel().setBackgroundResource(C0966R.C0969drawable.c2_);
        getSmileyPanel().mo100191d();
        getSmileyPanel().mo100192e(true);
        getSmileyPanel().mo100193f(false, false);
        getSmileyPanel().setVisibility(4);
        getSmileyPanel().mo100197i();
        getSmileyPanel().setOnTextOperationListener(new C56565b(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) this.f162120n);
        getSmileyPanel().setLayoutParams(layoutParams);
        addView(getSmileyPanel(), layoutParams);
        getSmileyBtn().setOnClickListener(new C56566c(this));
        MMEditText mMEditText = this.f162118i;
        if (mMEditText != null) {
            mMEditText.setBackListener(new C56567d(this));
        }
    }

    public final void setActivity(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "<set-?>");
        this.f162113d = mMActivity;
    }

    public final void setAtBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f162117h = view;
    }

    public final void setAtReqCode(int i) {
        this.f162123q = i;
    }

    public final void setBackClickListener(C32224a<C13598b0> aVar) {
        this.f162121o = aVar;
    }

    public final void setContainer(View view) {
        this.f162122p = view;
    }

    public final void setEditText(MMEditText mMEditText) {
        this.f162118i = mMEditText;
    }

    public final void setITopicCallback(C56564a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f162124r = aVar;
    }

    public final void setShortTitleEt(MMEditText mMEditText) {
        this.f162119j = mMEditText;
    }

    public final void setSmileyBtn(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f162115f = imageView;
    }

    public final void setSmileyPanel(SmileyPanel smileyPanel) {
        C87412m.m108594g(smileyPanel, "<set-?>");
        this.f162114e = smileyPanel;
    }

    public final void setTopicBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f162116g = view;
    }
}
