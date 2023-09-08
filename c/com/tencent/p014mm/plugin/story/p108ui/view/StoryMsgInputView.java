package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jw2.C99069d;
import kotlin.Metadata;
import nw2.C100226k;
import p206nj.C76865k;
import p248ug.C78160t0;
import p629ny.C76979h;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;", "Lcom/tencent/mm/ui/widget/InputPanelFrameLayout;", "", "visible", "Lrx3/b0;", "setKeyboardVisibility", "", "getContent", "", "p", "I", "getInputType", "()I", "setInputType", "(I)V", "inputType", "Lkotlin/Function2;", "", "v", "Lfy3/p;", "getCommentInputCallback", "()Lfy3/p;", "setCommentInputCallback", "(Lfy3/p;)V", "commentInputCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView */
public final class StoryMsgInputView extends InputPanelFrameLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f281929x = 0;

    /* renamed from: f */
    public final FrameLayout f281930f;

    /* renamed from: g */
    public final MMEditText f281931g;

    /* renamed from: h */
    public final ImageView f281932h;

    /* renamed from: i */
    public final TextView f281933i;

    /* renamed from: j */
    public final View f281934j;

    /* renamed from: n */
    public final View f281935n;

    /* renamed from: o */
    public final ChatFooterPanel f281936o;

    /* renamed from: p */
    public int f281937p;

    /* renamed from: q */
    public boolean f281938q;

    /* renamed from: r */
    public int f281939r;

    /* renamed from: s */
    public boolean f281940s;

    /* renamed from: t */
    public final int f281941t;

    /* renamed from: u */
    public final int f281942u;

    /* renamed from: v */
    public C32227p<? super String, ? super Boolean, C13598b0> f281943v;

    /* renamed from: w */
    public final Runnable f281944w;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView$a */
    public static final class C96392a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgInputView f281945d;

        public C96392a(StoryMsgInputView storyMsgInputView) {
            this.f281945d = storyMsgInputView;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                int length = editable.length();
                int i = 60 - length;
                StoryMsgInputView storyMsgInputView = this.f281945d;
                boolean z = true;
                if (!(editable.length() > 0) || i < 0 || this.f281945d.f281931g.getLineCount() > 10) {
                    z = false;
                }
                storyMsgInputView.f281940s = z;
                if (length >= 55) {
                    this.f281945d.f281933i.setVisibility(0);
                    this.f281945d.f281933i.setText(String.valueOf(i));
                    if (i >= 0) {
                        StoryMsgInputView storyMsgInputView2 = this.f281945d;
                        storyMsgInputView2.f281933i.setTextColor(storyMsgInputView2.f281941t);
                        return;
                    }
                    StoryMsgInputView storyMsgInputView3 = this.f281945d;
                    storyMsgInputView3.f281933i.setTextColor(storyMsgInputView3.f281942u);
                    return;
                }
                this.f281945d.f281933i.setVisibility(8);
                return;
            }
            StoryMsgInputView storyMsgInputView4 = this.f281945d;
            storyMsgInputView4.f281940s = false;
            storyMsgInputView4.f281933i.setVisibility(8);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView$b */
    public static final class C96393b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgInputView f281946d;

        /* renamed from: e */
        public final /* synthetic */ Context f281947e;

        public C96393b(StoryMsgInputView storyMsgInputView, Context context) {
            this.f281946d = storyMsgInputView;
            this.f281947e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StoryMsgInputView storyMsgInputView = this.f281946d;
            if (!storyMsgInputView.f281938q) {
                storyMsgInputView.setInputType(2);
                this.f281946d.setKeyboardVisibility(true);
                this.f281946d.f281932h.setImageDrawable(C74933u4.m89768e(this.f281947e, C0966R.raw.icons_filled_sticker, -1));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView$c */
    public static final class C96394c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgInputView f281948d;

        /* renamed from: e */
        public final /* synthetic */ Context f281949e;

        public C96394c(StoryMsgInputView storyMsgInputView, Context context) {
            this.f281948d = storyMsgInputView;
            this.f281949e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f281948d.getInputType() == 0) {
                this.f281948d.setInputType(2);
                this.f281948d.setKeyboardVisibility(true);
                this.f281948d.f281932h.setImageDrawable(C74933u4.m89768e(this.f281949e, C0966R.raw.icons_filled_sticker, -1));
            } else {
                StoryMsgInputView storyMsgInputView = this.f281948d;
                if (storyMsgInputView.f281938q) {
                    storyMsgInputView.setInputType(0);
                    this.f281948d.setKeyboardVisibility(false);
                } else {
                    storyMsgInputView.setInputType(0);
                    this.f281948d.f281930f.setVisibility(0);
                }
                this.f281948d.f281932h.setImageDrawable(C74933u4.m89768e(this.f281949e, C0966R.raw.icons_filled_keyboard_night, -1));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgInputView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView$d */
    public static final class C96395d implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgInputView f281950d;

        public C96395d(StoryMsgInputView storyMsgInputView) {
            this.f281950d = storyMsgInputView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((4 != i && keyEvent.getAction() != 66) || !this.f281950d.f281940s) {
                return true;
            }
            C99069d.f290418a.mo138412a(9);
            Editable text = this.f281950d.f281931g.getText();
            if (text == null) {
                return true;
            }
            StoryMsgInputView storyMsgInputView = this.f281950d;
            storyMsgInputView.mo134275c();
            storyMsgInputView.f281931g.setText((CharSequence) null);
            C32227p<String, Boolean, C13598b0> commentInputCallback = storyMsgInputView.getCommentInputCallback();
            if (commentInputCallback == null) {
                return true;
            }
            commentInputCallback.invoke(text.toString(), Boolean.TRUE);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView$e */
    public static final class C96396e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgInputView f281951d;

        public C96396e(StoryMsgInputView storyMsgInputView) {
            this.f281951d = storyMsgInputView;
        }

        public final void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f281951d.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f281951d.f281931g, 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryMsgInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f281937p = -1;
        View.inflate(context, C0966R.C0971layout.c79, this);
        setClickable(true);
        View findViewById = findViewById(C0966R.C0970id.k3u);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_comment_emoji_root)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f281930f = frameLayout;
        View findViewById2 = findViewById(C0966R.C0970id.k3w);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_comment_input)");
        MMEditText mMEditText = (MMEditText) findViewById2;
        this.f281931g = mMEditText;
        mMEditText.setEnableSendBtn(true);
        View findViewById3 = findViewById(C0966R.C0970id.k3t);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_comment_emoji_btn)");
        ImageView imageView = (ImageView) findViewById3;
        this.f281932h = imageView;
        View findViewById4 = findViewById(C0966R.C0970id.f359301k41);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_comment_input_limit)");
        this.f281933i = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.f359300k40);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_comment_input_hint)");
        TextView textView = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.f359303k43);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_comment_input_root)");
        this.f281934j = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.k3z);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_…ent_input_footer_content)");
        this.f281935n = findViewById7;
        this.f281941t = getResources().getColor(C0966R.color.afs);
        this.f281942u = getResources().getColor(C0966R.color.f2966ao);
        SmileyPanel c = C78160t0.m94372c(context, true);
        C87412m.m108593f(c, "getSmileyPanel(context, true)");
        this.f281936o = c;
        this.f281939r = KeyBoardUtil.getValidPanelHeight(getContext());
        frameLayout.addView(c, new FrameLayout.LayoutParams(-1, this.f281939r));
        c.setPortHeightPx(this.f281939r);
        int i2 = ChatFooterPanel.f211589f;
        c.setEntranceScene(0);
        c.mo100191d();
        c.setVisibility(0);
        c.setShowSend(true);
        c.mo100197i();
        c.setOnTextOperationListener(new C100226k(this));
        mMEditText.addTextChangedListener(new C96392a(this));
        findViewById6.setOnClickListener(new C96393b(this, context));
        imageView.setOnClickListener(new C96394c(this, context));
        mMEditText.setOnEditorActionListener(new C96395d(this));
        imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_sticker, -1));
        this.f281940s = false;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f281944w = new C96396e(this);
    }

    /* access modifiers changed from: private */
    public final void setKeyboardVisibility(boolean z) {
        if (z) {
            post(this.f281944w);
            return;
        }
        removeCallbacks(this.f281944w);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public final void mo134274b() {
        int i = this.f281937p;
        if (i == 0) {
            this.f281930f.setVisibility(8);
        } else if (i == 2) {
            mo134275c();
        }
        this.f281937p = -1;
    }

    /* renamed from: c */
    public final void mo134275c() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* renamed from: d */
    public final void mo134276d(CharSequence charSequence, String str, boolean z) {
        String str2;
        Class cls = C76979h.class;
        C87412m.m108594g(str, "toUser");
        this.f281931g.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), charSequence, this.f281931g.getTextSize()));
        if (charSequence != null) {
            this.f281931g.setSelection(charSequence.length());
        }
        if (z) {
            C87412m.m108593f(getResources().getString(C0966R.string.jrg), "resources.getString(R.st…story_reply_visible_hint)");
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(C0966R.string.jrf));
            sb.append(' ');
            C76979h hVar = (C76979h) C86312j.m106911c(cls);
            Context context = this.f281931g.getContext();
            String f = z1Var != null ? z1Var.mo62898f() : null;
            if (f == null) {
                f = "";
            }
            sb.append(hVar.yp0(context, f, this.f281931g.getTextSize()));
            str2 = sb.toString();
        } else {
            C87412m.m108593f(getResources().getString(C0966R.string.jp7), "resources.getString(R.st…ory_comment_visible_hint)");
            str2 = getResources().getString(C0966R.string.jp7);
            C87412m.m108593f(str2, "resources.getString(R.st…ory_comment_visible_hint)");
        }
        this.f281931g.setHint(str2);
    }

    /* renamed from: e */
    public final void mo134277e(int i, boolean z) {
        if (z && i == 0) {
            this.f281931g.requestFocus();
            this.f281937p = 2;
            this.f281932h.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_sticker, -1));
            this.f281930f.setVisibility(4);
            setKeyboardVisibility(true);
        }
        setVisibility(i);
        if (!z) {
            clearFocus();
        }
    }

    public final C32227p<String, Boolean, C13598b0> getCommentInputCallback() {
        return this.f281943v;
    }

    public final CharSequence getContent() {
        Editable text = this.f281931g.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final int getInputType() {
        return this.f281937p;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        super.mo1072i0(z, i);
        this.f281938q = z;
        if (z) {
            this.f281937p = 2;
            this.f281930f.setVisibility(4);
        } else if (this.f281937p == 0) {
            this.f281930f.setVisibility(0);
        } else {
            this.f281930f.setVisibility(8);
            this.f281937p = -1;
        }
        if (this.f281939r != i && i != 0) {
            this.f281939r = i;
            C76865k.m92671b(getContext(), i);
            int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
            this.f281936o.setPortHeightPx(validPanelHeight);
            this.f281936o.mo100190c();
            ViewGroup.LayoutParams layoutParams = this.f281936o.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = validPanelHeight;
            }
        }
    }

    public final void setCommentInputCallback(C32227p<? super String, ? super Boolean, C13598b0> pVar) {
        this.f281943v = pVar;
    }

    public final void setInputType(int i) {
        this.f281937p = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryMsgInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
