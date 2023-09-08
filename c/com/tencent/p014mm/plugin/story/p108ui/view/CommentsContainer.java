package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ew2.C97757a;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import nw2.C76968e;
import nw2.C76971f;
import o40.C61926c;
import p196ln.C76705f;
import p629ny.C76979h;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer;", "Landroid/widget/RelativeLayout;", "", "i", "Z", "isPause", "()Z", "setPause", "(Z)V", "Lkotlin/Function0;", "Lrx3/b0;", "j", "Lfy3/a;", "getItemClickListener", "()Lfy3/a;", "setItemClickListener", "(Lfy3/a;)V", "itemClickListener", "n", "getOnLoop", "setOnLoop", "onLoop", "o", "isUnread", "setUnread", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.CommentsContainer */
public final class CommentsContainer extends RelativeLayout {

    /* renamed from: d */
    public final String f206300d;

    /* renamed from: e */
    public final ArrayList<C97757a> f206301e;

    /* renamed from: f */
    public int f206302f;

    /* renamed from: g */
    public long f206303g;

    /* renamed from: h */
    public long f206304h;

    /* renamed from: i */
    public boolean f206305i;

    /* renamed from: j */
    public C32224a<C13598b0> f206306j;

    /* renamed from: n */
    public C32224a<C13598b0> f206307n;

    /* renamed from: o */
    public boolean f206308o;

    /* renamed from: p */
    public final Runnable f206309p;

    /* renamed from: q */
    public final Runnable f206310q;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.CommentsContainer$a */
    public static final class C71270a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CommentsContainer f206311d;

        public C71270a(CommentsContainer commentsContainer) {
            this.f206311d = commentsContainer;
        }

        public final void run() {
            CommentsContainer commentsContainer = this.f206311d;
            Log.m105924i(commentsContainer.f206300d, "LogStory: animNext " + commentsContainer.f206302f + ' ' + commentsContainer.f206305i + ' ' + commentsContainer.f206301e.size());
            if (!commentsContainer.f206305i && commentsContainer.f206301e.size() > 0) {
                int i = commentsContainer.f206302f + 1;
                commentsContainer.f206302f = i;
                int size = i % commentsContainer.f206301e.size();
                commentsContainer.f206302f = size;
                C97757a aVar = commentsContainer.f206301e.get(size);
                C87412m.m108593f(aVar, "comments[itemIndex]");
                C97757a aVar2 = aVar;
                Class cls = C75700k0.class;
                Class cls2 = C76979h.class;
                View inflate = LayoutInflater.from(commentsContainer.getContext()).inflate(aVar2.f286814g ? C0966R.C0971layout.c6c : C0966R.C0971layout.c6b, commentsContainer, false);
                inflate.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                View findViewById = inflate.findViewById(C0966R.C0970id.k45);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.…tory_comment_item_avatar)");
                ImageView imageView = (ImageView) findViewById;
                View findViewById2 = inflate.findViewById(C0966R.C0970id.k4d);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.…ry_comment_item_username)");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = inflate.findViewById(C0966R.C0970id.k48);
                C87412m.m108593f(findViewById3, "itemView.findViewById(R.…ory_comment_item_content)");
                TextView textView2 = (TextView) findViewById3;
                imageView.setClickable(false);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(imageView, aVar2.f286808a);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(aVar2.f286808a);
                C76979h hVar = (C76979h) C86312j.m106911c(cls2);
                Context context = textView.getContext();
                String str = null;
                String f = z1Var != null ? z1Var.mo62898f() : null;
                if (f == null) {
                    f = "";
                }
                CharSequence yp02 = hVar.yp0(context, f, textView.getTextSize());
                C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(aVar2.f286817j);
                C76979h hVar2 = (C76979h) C86312j.m106911c(cls2);
                Context context2 = textView.getContext();
                if (z1Var2 != null) {
                    str = z1Var2.mo62898f();
                }
                SpannableString yp03 = hVar2.yp0(context2, str == null ? "" : str, textView.getTextSize());
                if (aVar2.f286819l != 0) {
                    yp02 = yp02 + ' ' + textView.getContext().getResources().getString(C0966R.string.a2h) + ' ' + yp03;
                }
                textView.setText(yp02);
                if (aVar2.f286814g) {
                    textView2.setVisibility(8);
                    C61926c.m72678c(textView);
                } else {
                    textView2.setText(((C76979h) C86312j.m106911c(cls2)).yp0(textView2.getContext(), aVar2.f286809b, textView2.getTextSize()));
                }
                inflate.setOnClickListener(new C76971f(commentsContainer));
                CommentItemView commentItemView = (CommentItemView) inflate;
                int measuredHeight = (commentsContainer.getMeasuredHeight() * 2) / 3;
                Log.m105924i(commentsContainer.f206300d, "LogStory: is enhance comment " + aVar2.f286816i);
                commentItemView.setId(size);
                commentItemView.setVisibility(4);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = commentsContainer.getMeasuredHeight() - measuredHeight;
                commentsContainer.addView(commentItemView, layoutParams);
                commentsContainer.post(new C76968e(commentItemView, commentsContainer, aVar2, measuredHeight));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.CommentsContainer$b */
    public static final class C71271b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CommentsContainer f206312d;

        public C71271b(CommentsContainer commentsContainer) {
            this.f206312d = commentsContainer;
        }

        public final void run() {
            C32224a<C13598b0> onLoop = this.f206312d.getOnLoop();
            if (onLoop != null) {
                onLoop.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f206300d = "MicroMsg.CommentsContainer";
        this.f206301e = new ArrayList<>();
        this.f206302f = -1;
        new Random();
        this.f206305i = true;
        this.f206309p = new C71270a(this);
        this.f206310q = new C71271b(this);
    }

    /* renamed from: d */
    public static void m83735d(CommentsContainer commentsContainer, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        commentsContainer.getClass();
        C87412m.m108594g(list, "storyComments");
        commentsContainer.f206308o = z;
        commentsContainer.f206301e.clear();
        commentsContainer.f206301e.addAll(list);
        commentsContainer.f206302f = -1;
        commentsContainer.f206304h = 4000;
    }

    /* renamed from: a */
    public final void mo98098a() {
        String str = this.f206300d;
        Log.m105924i(str, "LogStory: pause " + this);
        this.f206305i = true;
        removeCallbacks(this.f206309p);
        removeCallbacks(this.f206310q);
        removeAllViews();
        this.f206302f = -1;
    }

    /* renamed from: b */
    public final void mo98099b() {
        String str = this.f206300d;
        Log.m105924i(str, "LogStory: restart " + this);
        mo98100c();
    }

    /* renamed from: c */
    public final void mo98100c() {
        String str = this.f206300d;
        Log.m105924i(str, "LogStory: resume " + this);
        this.f206305i = false;
        if (this.f206302f != 0) {
            removeCallbacks(this.f206309p);
            removeCallbacks(this.f206310q);
            removeAllViews();
            this.f206302f = -1;
            postDelayed(this.f206309p, 300);
        }
    }

    public final C32224a<C13598b0> getItemClickListener() {
        return this.f206306j;
    }

    public final C32224a<C13598b0> getOnLoop() {
        return this.f206307n;
    }

    public final void setItemClickListener(C32224a<C13598b0> aVar) {
        this.f206306j = aVar;
    }

    public final void setOnLoop(C32224a<C13598b0> aVar) {
        this.f206307n = aVar;
    }

    public final void setPause(boolean z) {
        this.f206305i = z;
    }

    public final void setUnread(boolean z) {
        this.f206308o = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
