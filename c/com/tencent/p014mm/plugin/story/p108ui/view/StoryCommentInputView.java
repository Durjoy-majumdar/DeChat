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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ew2.C97757a;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jw2.C99069d;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kw2.C99268i;
import lw2.C99693f;
import nw2.C100223g;
import p196ln.C76705f;
import p206nj.C76865k;
import p248ug.C78160t0;
import p629ny.C76979h;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bR6\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentInputView;", "Lcom/tencent/mm/ui/widget/InputPanelFrameLayout;", "", "visible", "Lrx3/b0;", "setKeyboardVisibility", "", "getContent", "Lkw2/i;", "storyInfo", "setHostStory", "Lkotlin/Function2;", "", "z", "Lfy3/p;", "getCommentInputCallback", "()Lfy3/p;", "setCommentInputCallback", "(Lfy3/p;)V", "commentInputCallback", "Lew2/a;", "A", "getCommentReplyCallback", "setCommentReplyCallback", "commentReplyCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView */
public final class StoryCommentInputView extends InputPanelFrameLayout {

    /* renamed from: A */
    public C32227p<? super C97757a, ? super Boolean, C13598b0> f281843A;

    /* renamed from: B */
    public final Runnable f281844B;

    /* renamed from: f */
    public final FrameLayout f281845f;

    /* renamed from: g */
    public final MMEditText f281846g;

    /* renamed from: h */
    public final ImageView f281847h;

    /* renamed from: i */
    public final TextView f281848i;

    /* renamed from: j */
    public final TextView f281849j;

    /* renamed from: n */
    public final TextView f281850n;

    /* renamed from: o */
    public final RecyclerView f281851o;

    /* renamed from: p */
    public final C99693f f281852p;

    /* renamed from: q */
    public final View f281853q;

    /* renamed from: r */
    public final View f281854r;

    /* renamed from: s */
    public final ChatFooterPanel f281855s;

    /* renamed from: t */
    public int f281856t;

    /* renamed from: u */
    public boolean f281857u;

    /* renamed from: v */
    public int f281858v;

    /* renamed from: w */
    public boolean f281859w;

    /* renamed from: x */
    public final int f281860x;

    /* renamed from: y */
    public final int f281861y;

    /* renamed from: z */
    public C32227p<? super String, ? super Boolean, C13598b0> f281862z;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$a */
    public static final class C96365a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96365a(StoryCommentInputView storyCommentInputView) {
            super(0);
            this.f281863d = storyCommentInputView;
        }

        public Object invoke() {
            StoryCommentInputView.m123618a(this.f281863d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$b */
    public static final class C96366b extends C87413o implements C32227p<C97757a, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281864d;

        /* renamed from: e */
        public final /* synthetic */ Context f281865e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96366b(StoryCommentInputView storyCommentInputView, Context context) {
            super(2);
            this.f281864d = storyCommentInputView;
            this.f281865e = context;
        }

        public Object invoke(Object obj, Object obj2) {
            C97757a aVar = (C97757a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            C32227p<C97757a, Boolean, C13598b0> commentReplyCallback = this.f281864d.getCommentReplyCallback();
            if (commentReplyCallback != null) {
                commentReplyCallback.invoke(aVar, Boolean.valueOf(booleanValue));
            }
            if (booleanValue) {
                this.f281864d.setKeyboardVisibility(true);
                View view = this.f281864d.f281854r;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$2", "invoke", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$2", "invoke", "(Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f281864d.f281847h.setImageDrawable(C74933u4.m89768e(this.f281865e, C0966R.raw.icons_filled_sticker, -1));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$c */
    public static final class C96367c implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281866d;

        public C96367c(StoryCommentInputView storyCommentInputView) {
            this.f281866d = storyCommentInputView;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                int length = editable.length();
                int i = 60 - length;
                StoryCommentInputView storyCommentInputView = this.f281866d;
                boolean z = true;
                if (!(editable.length() > 0) || i < 0 || this.f281866d.f281846g.getLineCount() > 10) {
                    z = false;
                }
                storyCommentInputView.f281859w = z;
                if (length >= 55) {
                    this.f281866d.f281849j.setVisibility(0);
                    this.f281866d.f281849j.setText(String.valueOf(i));
                    if (i >= 0) {
                        StoryCommentInputView storyCommentInputView2 = this.f281866d;
                        storyCommentInputView2.f281849j.setTextColor(storyCommentInputView2.f281860x);
                        return;
                    }
                    StoryCommentInputView storyCommentInputView3 = this.f281866d;
                    storyCommentInputView3.f281849j.setTextColor(storyCommentInputView3.f281861y);
                    return;
                }
                this.f281866d.f281849j.setVisibility(8);
                return;
            }
            StoryCommentInputView storyCommentInputView4 = this.f281866d;
            storyCommentInputView4.f281859w = false;
            storyCommentInputView4.f281849j.setVisibility(8);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$d */
    public static final class C96368d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281867d;

        /* renamed from: e */
        public final /* synthetic */ Context f281868e;

        public C96368d(StoryCommentInputView storyCommentInputView, Context context) {
            this.f281867d = storyCommentInputView;
            this.f281868e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StoryCommentInputView storyCommentInputView = this.f281867d;
            if (!storyCommentInputView.f281857u) {
                storyCommentInputView.f281856t = 2;
                storyCommentInputView.setKeyboardVisibility(true);
                this.f281867d.f281847h.setImageDrawable(C74933u4.m89768e(this.f281868e, C0966R.raw.icons_filled_sticker, -1));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$e */
    public static final class C96369e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281869d;

        /* renamed from: e */
        public final /* synthetic */ Context f281870e;

        public C96369e(StoryCommentInputView storyCommentInputView, Context context) {
            this.f281869d = storyCommentInputView;
            this.f281870e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StoryCommentInputView storyCommentInputView = this.f281869d;
            if (storyCommentInputView.f281856t == 0) {
                storyCommentInputView.f281856t = 2;
                storyCommentInputView.setKeyboardVisibility(true);
                this.f281869d.f281847h.setImageDrawable(C74933u4.m89768e(this.f281870e, C0966R.raw.icons_filled_sticker, -1));
            } else {
                if (storyCommentInputView.f281857u) {
                    storyCommentInputView.f281856t = 0;
                    storyCommentInputView.setKeyboardVisibility(false);
                } else {
                    storyCommentInputView.f281856t = 0;
                    storyCommentInputView.f281845f.setVisibility(0);
                }
                this.f281869d.f281847h.setImageDrawable(C74933u4.m89768e(this.f281870e, C0966R.raw.icons_filled_keyboard_night, -1));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$f */
    public static final class C96370f implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281871d;

        public C96370f(StoryCommentInputView storyCommentInputView) {
            this.f281871d = storyCommentInputView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((4 == i || keyEvent.getAction() == 66) && this.f281871d.f281859w) {
                C99069d.f290418a.mo138412a(9);
                Editable text = this.f281871d.f281846g.getText();
                if (text != null) {
                    StoryCommentInputView storyCommentInputView = this.f281871d;
                    StoryCommentInputView.m123618a(storyCommentInputView);
                    storyCommentInputView.f281846g.setText((CharSequence) null);
                    View view = storyCommentInputView.f281854r;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$6", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$6", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C32227p<String, Boolean, C13598b0> commentInputCallback = storyCommentInputView.getCommentInputCallback();
                    if (commentInputCallback != null) {
                        commentInputCallback.invoke(text.toString(), Boolean.TRUE);
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$g */
    public static final class C96371g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281872d;

        public C96371g(StoryCommentInputView storyCommentInputView) {
            this.f281872d = storyCommentInputView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f281872d.setKeyboardVisibility(false);
            C32227p<String, Boolean, C13598b0> commentInputCallback = this.f281872d.getCommentInputCallback();
            if (commentInputCallback != null) {
                commentInputCallback.invoke("", Boolean.FALSE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentInputView$h */
    public static final class C96372h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentInputView f281873d;

        public C96372h(StoryCommentInputView storyCommentInputView) {
            this.f281873d = storyCommentInputView;
        }

        public final void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f281873d.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f281873d.f281846g, 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCommentInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.c6a, this);
        setClickable(true);
        View findViewById = findViewById(C0966R.C0970id.k3u);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_comment_emoji_root)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f281845f = frameLayout;
        View findViewById2 = findViewById(C0966R.C0970id.k3w);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_comment_input)");
        MMEditText mMEditText = (MMEditText) findViewById2;
        this.f281846g = mMEditText;
        mMEditText.setEnableSendBtn(true);
        View findViewById3 = findViewById(C0966R.C0970id.k3t);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_comment_emoji_btn)");
        ImageView imageView = (ImageView) findViewById3;
        this.f281847h = imageView;
        View findViewById4 = findViewById(C0966R.C0970id.k3x);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_comment_input_avatar)");
        View findViewById5 = findViewById(C0966R.C0970id.k44);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_comment_input_username)");
        TextView textView = (TextView) findViewById5;
        this.f281848i = textView;
        View findViewById6 = findViewById(C0966R.C0970id.f359301k41);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_comment_input_limit)");
        this.f281849j = (TextView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.f359300k40);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_comment_input_hint)");
        this.f281850n = (TextView) findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.f359302k42);
        C87412m.m108593f(findViewById8, "findViewById(R.id.story_comment_input_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById8;
        this.f281851o = recyclerView;
        View findViewById9 = findViewById(C0966R.C0970id.f359303k43);
        C87412m.m108593f(findViewById9, "findViewById(R.id.story_comment_input_root)");
        this.f281853q = findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.k3z);
        C87412m.m108593f(findViewById10, "findViewById(R.id.story_…ent_input_footer_content)");
        this.f281854r = findViewById10;
        C99693f fVar = new C99693f();
        this.f281852p = fVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(fVar);
        recyclerView.setVisibility(8);
        recyclerView.setFocusable(false);
        fVar.f292193g = new C96365a(this);
        fVar.f292192f = new C96366b(this, context);
        this.f281860x = getResources().getColor(C0966R.color.afs);
        this.f281861y = getResources().getColor(C0966R.color.f2966ao);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5((ImageView) findViewById4, StoryCore.f281736t.mo134187e());
        SmileyPanel c = C78160t0.m94372c(context, true);
        C87412m.m108593f(c, "getSmileyPanel(context, true)");
        this.f281855s = c;
        this.f281858v = KeyBoardUtil.getValidPanelHeight(getContext());
        frameLayout.addView(c, new FrameLayout.LayoutParams(-1, this.f281858v));
        c.setPortHeightPx(this.f281858v);
        int i2 = ChatFooterPanel.f211589f;
        c.setEntranceScene(0);
        c.mo100191d();
        c.setVisibility(0);
        c.setShowSend(true);
        c.mo100197i();
        c.setOnTextOperationListener(new C100223g(this));
        mMEditText.addTextChangedListener(new C96367c(this));
        findViewById9.setOnClickListener(new C96368d(this, context));
        imageView.setOnClickListener(new C96369e(this, context));
        mMEditText.setOnEditorActionListener(new C96370f(this));
        setOnClickListener(new C96371g(this));
        imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_sticker, -1));
        frameLayout.setVisibility(0);
        this.f281859w = false;
        Object e = C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, (String) e, textView.getTextSize()));
        this.f281856t = 2;
        this.f281844B = new C96372h(this);
    }

    /* renamed from: a */
    public static final void m123618a(StoryCommentInputView storyCommentInputView) {
        InputMethodManager inputMethodManager = (InputMethodManager) storyCommentInputView.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(storyCommentInputView.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    public final void setKeyboardVisibility(boolean z) {
        if (z) {
            post(this.f281844B);
            return;
        }
        removeCallbacks(this.f281844B);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* renamed from: c */
    public final void mo134237c(CharSequence charSequence, String str, boolean z) {
        String str2;
        CharSequence charSequence2;
        String str3;
        Class cls = C76979h.class;
        C87412m.m108594g(str, "toUser");
        this.f281846g.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), charSequence, this.f281846g.getTextSize()));
        if (charSequence != null) {
            this.f281846g.setSelection(charSequence.length());
        }
        String str4 = null;
        if (z) {
            str2 = getResources().getString(C0966R.string.jrg);
            C87412m.m108593f(str2, "resources.getString(R.st…story_reply_visible_hint)");
            str3 = getResources().getString(C0966R.string.jrf);
            C87412m.m108593f(str3, "resources.getString(R.st…_reply_visible_edit_hint)");
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(C0966R.string.jrf));
            sb.append(' ');
            C76979h hVar = (C76979h) C86312j.m106911c(cls);
            Context context = this.f281848i.getContext();
            if (z1Var != null) {
                str4 = z1Var.mo62898f();
            }
            if (str4 == null) {
                str4 = "";
            }
            sb.append(hVar.yp0(context, str4, this.f281848i.getTextSize()));
            charSequence2 = sb.toString();
        } else {
            str2 = getResources().getString(C0966R.string.jp7);
            C87412m.m108593f(str2, "resources.getString(R.st…ory_comment_visible_hint)");
            str3 = getResources().getString(C0966R.string.jp6);
            C87412m.m108593f(str3, "resources.getString(R.st…omment_visible_edit_hint)");
            Context context2 = getContext();
            Object e = C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
            C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
            charSequence2 = ((C76979h) C86312j.m106911c(cls)).yp0(context2, (String) e, this.f281848i.getTextSize());
            C87412m.m108593f(charSequence2, "getService(ISpannableSer…tring, fromUser.textSize)");
        }
        this.f281846g.setHint(str3);
        this.f281850n.setText(str2);
        this.f281848i.setText(charSequence2);
    }

    public final C32227p<String, Boolean, C13598b0> getCommentInputCallback() {
        return this.f281862z;
    }

    public final C32227p<C97757a, Boolean, C13598b0> getCommentReplyCallback() {
        return this.f281843A;
    }

    public final CharSequence getContent() {
        Editable text = this.f281846g.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        super.mo1072i0(z, i);
        this.f281857u = z;
        if (z) {
            this.f281856t = 2;
            this.f281845f.setVisibility(4);
        } else if (this.f281856t == 0) {
            this.f281845f.setVisibility(0);
        } else {
            this.f281845f.setVisibility(8);
            this.f281856t = -1;
        }
        if (this.f281858v != i && i != 0) {
            this.f281858v = i;
            C76865k.m92671b(getContext(), i);
            int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
            this.f281855s.setPortHeightPx(validPanelHeight);
            this.f281855s.mo100190c();
            ViewGroup.LayoutParams layoutParams = this.f281855s.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = validPanelHeight;
            }
        }
    }

    public final void setCommentInputCallback(C32227p<? super String, ? super Boolean, C13598b0> pVar) {
        this.f281862z = pVar;
    }

    public final void setCommentReplyCallback(C32227p<? super C97757a, ? super Boolean, C13598b0> pVar) {
        this.f281843A = pVar;
    }

    public final void setHostStory(C99268i iVar) {
        this.f281852p.f292191e = iVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryCommentInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
