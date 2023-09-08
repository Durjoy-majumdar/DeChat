package com.tencent.p014mm.plugin.story.p108ui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPageExposeStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import ew2.C97757a;
import ew2.C97758b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gw2.C98261f;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import jw2.C99069d;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import lw2.C99693f;
import nw2.C100231p;
import nw2.C76965a;
import nw2.C76972h;
import o40.C61926c;
import qo3.C77426q;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b#\u0010$B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010%R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "Landroid/widget/RelativeLayout;", "", "", "r", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "sessionId", "Lkotlin/Function1;", "", "Lrx3/b0;", "J", "Lfy3/l;", "getStateChangeCallback", "()Lfy3/l;", "setStateChangeCallback", "(Lfy3/l;)V", "stateChangeCallback", "Lkotlin/Function0;", "", "K", "Lfy3/a;", "getOutsideClickListener", "()Lfy3/a;", "setOutsideClickListener", "(Lfy3/a;)V", "outsideClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView */
public final class StoryCommentView extends RelativeLayout {

    /* renamed from: N */
    public static final int[] f281874N = {-372399, -352965, -15616, -7220480, -16268960, -15683841, -15432210, -10197008};

    /* renamed from: A */
    public CharSequence f281875A;

    /* renamed from: B */
    public LinkedHashMap<String, CharSequence> f281876B;

    /* renamed from: C */
    public String f281877C;

    /* renamed from: D */
    public int f281878D;

    /* renamed from: E */
    public int f281879E;

    /* renamed from: F */
    public final LinkedHashMap<C97757a, LayerDrawable> f281880F;

    /* renamed from: G */
    public final Runnable f281881G;

    /* renamed from: H */
    public final C100231p f281882H;

    /* renamed from: I */
    public boolean f281883I;

    /* renamed from: J */
    public C32226l<? super Integer, C13598b0> f281884J;

    /* renamed from: K */
    public C32224a<Boolean> f281885K;

    /* renamed from: L */
    public final C32227p<String, Boolean, C13598b0> f281886L;

    /* renamed from: M */
    public final C32227p<C97757a, Boolean, C13598b0> f281887M;

    /* renamed from: d */
    public final CommentsContainer f281888d;

    /* renamed from: e */
    public final RecyclerView f281889e;

    /* renamed from: f */
    public final C99693f f281890f;

    /* renamed from: g */
    public final View f281891g;

    /* renamed from: h */
    public final TextView f281892h;

    /* renamed from: i */
    public final View f281893i;

    /* renamed from: j */
    public final View f281894j;

    /* renamed from: n */
    public final View f281895n;

    /* renamed from: o */
    public boolean f281896o;

    /* renamed from: p */
    public boolean f281897p;

    /* renamed from: q */
    public String f281898q;

    /* renamed from: r */
    public String f281899r;

    /* renamed from: s */
    public C98261f f281900s;

    /* renamed from: t */
    public long f281901t;

    /* renamed from: u */
    public int f281902u;

    /* renamed from: v */
    public int f281903v;

    /* renamed from: w */
    public boolean f281904w;

    /* renamed from: x */
    public C76965a f281905x;

    /* renamed from: y */
    public boolean f281906y;

    /* renamed from: z */
    public boolean f281907z;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$a */
    public static final class C96373a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281908d;

        public C96373a(StoryCommentView storyCommentView) {
            this.f281908d = storyCommentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int[] iArr = StoryCommentView.f281874N;
            Log.m105924i("MicroMsg.StoryCommentView", "commentEditGroup click");
            this.f281908d.mo134254f(1);
            C99069d.f290418a.mo138412a(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$b */
    public static final class C96374b extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96374b(StoryCommentView storyCommentView) {
            super(1);
            this.f281909d = storyCommentView;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            StoryCommentView storyCommentView = this.f281909d;
            if (storyCommentView.f281902u == 3) {
                storyCommentView.mo134254f(2);
            } else {
                C32224a<Boolean> outsideClickListener = storyCommentView.getOutsideClickListener();
                if (outsideClickListener != null) {
                    Boolean invoke = outsideClickListener.invoke();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$c */
    public static final class C96375c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281910d;

        public C96375c(StoryCommentView storyCommentView) {
            this.f281910d = storyCommentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100231p pVar = this.f281910d.f281882H;
            boolean z = true;
            int i = pVar.f293660d + 1;
            pVar.f293660d = i;
            if (!((i == 1 && pVar.f293659c == null) || i == 2 || i == 3)) {
                z = false;
            }
            if (z) {
                pVar.mo139522a();
            }
            MMHandlerThread.removeRunnable(pVar.f293662f);
            MMHandlerThread.postToMainThreadDelayed(pVar.f293662f, pVar.f293661e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$d */
    public static final class C96376d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281911d;

        public C96376d(StoryCommentView storyCommentView) {
            this.f281911d = storyCommentView;
        }

        public final boolean onLongClick(View view) {
            C32224a<Boolean> outsideClickListener;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            StoryCommentView storyCommentView = this.f281911d;
            boolean z = false;
            if (!(storyCommentView.f281902u == 3 || (outsideClickListener = storyCommentView.getOutsideClickListener()) == null)) {
                z = outsideClickListener.invoke().booleanValue();
            }
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$13", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$e */
    public static final class C96377e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96377e(StoryCommentView storyCommentView) {
            super(0);
            this.f281912d = storyCommentView;
        }

        public Object invoke() {
            this.f281912d.mo134254f(3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$f */
    public static final class C96378f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281913d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96378f(StoryCommentView storyCommentView) {
            super(0);
            this.f281913d = storyCommentView;
        }

        public Object invoke() {
            this.f281913d.mo134254f(2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$g */
    public static final class C96379g extends C87413o implements C32227p<C97757a, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281914d;

        /* renamed from: e */
        public final /* synthetic */ Context f281915e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96379g(StoryCommentView storyCommentView, Context context) {
            super(2);
            this.f281914d = storyCommentView;
            this.f281915e = context;
        }

        public Object invoke(Object obj, Object obj2) {
            C97757a aVar = (C97757a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            if (booleanValue) {
                StoryCommentView storyCommentView = this.f281914d;
                storyCommentView.f281877C = aVar.f286808a;
                storyCommentView.f281878D = aVar.f286812e;
                storyCommentView.f281879E = storyCommentView.f281900s.f288074g.indexOf(aVar);
                this.f281914d.mo134254f(5);
            } else {
                String string = aVar.f286819l == 0 ? this.f281915e.getResources().getString(C0966R.string.joy) : this.f281915e.getResources().getString(C0966R.string.f361413jp0);
                C87412m.m108593f(string, "if (comment.replyComment…_reply)\n                }");
                C77426q qVar = new C77426q(this.f281915e);
                qVar.mo107595g(string);
                qVar.mo107602n(this.f281915e.getString(C0966R.string.f7944x1));
                qVar.mo107599k(-65536);
                qVar.mo107589a(true);
                qVar.mo107590b(new C96407a(this.f281914d, aVar));
                qVar.mo107603o();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$h */
    public static final class C96380h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281916d;

        /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$h$a */
        public static final class C96381a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryCommentView f281917d;

            public C96381a(StoryCommentView storyCommentView) {
                this.f281917d = storyCommentView;
            }

            public final void run() {
                this.f281917d.f281892h.setVisibility(8);
            }
        }

        public C96380h(StoryCommentView storyCommentView) {
            this.f281916d = storyCommentView;
        }

        public final void run() {
            this.f281916d.f281892h.animate().cancel();
            this.f281916d.f281892h.animate().alpha(0.0f).withEndAction(new C96381a(this.f281916d)).start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$i */
    public static final class C96382i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281918d;

        public C96382i(StoryCommentView storyCommentView) {
            this.f281918d = storyCommentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f281918d.f281900s.f288074g.isEmpty()) {
                StoryCommentView storyCommentView = this.f281918d;
                if (storyCommentView.f281902u == 3) {
                    storyCommentView.mo134254f(2);
                    C99069d.f290418a.mo138412a(1);
                } else {
                    storyCommentView.mo134254f(3);
                    C99069d dVar = C99069d.f290418a;
                    dVar.mo138412a(2);
                    StoryPageExposeStruct storyPageExposeStruct = C99069d.f290419b;
                    storyPageExposeStruct.f266262d = 4;
                    storyPageExposeStruct.f266263e = storyPageExposeStruct.mo86045b("StoryId", String.valueOf(this.f281918d.f281901t), true);
                    dVar.mo138413b();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$j */
    public static final class C96383j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281919d;

        public C96383j(StoryCommentView storyCommentView) {
            this.f281919d = storyCommentView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int[] iArr = StoryCommentView.f281874N;
            Log.m105924i("MicroMsg.StoryCommentView", "CommentBubble click");
            StoryCommentView.m123623b(this.f281919d, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$k */
    public static final class C96384k extends C87413o implements C32227p<String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281920d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96384k(StoryCommentView storyCommentView) {
            super(2);
            this.f281920d = storyCommentView;
        }

        public Object invoke(Object obj, Object obj2) {
            StoryCommentInputView storyCommentInputView;
            StoryCommentInputView storyCommentInputView2;
            StoryCommentInputView storyCommentInputView3;
            String str = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(str, "content");
            StoryCommentView storyCommentView = this.f281920d;
            storyCommentView.f281906y = booleanValue;
            if (!storyCommentView.f281907z) {
                if (booleanValue) {
                    storyCommentView.f281876B.remove(storyCommentView.f281877C);
                    StoryCommentView storyCommentView2 = this.f281920d;
                    storyCommentView2.f281875A = null;
                    C97758b bVar = C97758b.f286820d;
                    long j = storyCommentView2.f281901t;
                    String str2 = storyCommentView2.f281877C;
                    String sessionId = storyCommentView2.getSessionId();
                    StoryCommentView storyCommentView3 = this.f281920d;
                    this.f281920d.f281900s.f288074g.add(bVar.mo137094h(j, str, str2, sessionId, storyCommentView3.f281898q, storyCommentView3.f281878D));
                    StoryCommentView storyCommentView4 = this.f281920d;
                    CommentsContainer.m83735d(storyCommentView4.f281888d, storyCommentView4.f281900s.f288074g, false, 2, (Object) null);
                    this.f281920d.f281888d.mo98099b();
                }
                C76965a aVar = this.f281920d.f281905x;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } else if (booleanValue) {
                storyCommentView.f281876B.remove(storyCommentView.f281877C);
                StoryCommentView storyCommentView5 = this.f281920d;
                storyCommentView5.f281875A = null;
                C97758b bVar2 = C97758b.f286820d;
                long j2 = storyCommentView5.f281901t;
                String str3 = storyCommentView5.f281877C;
                String sessionId2 = storyCommentView5.getSessionId();
                StoryCommentView storyCommentView6 = this.f281920d;
                C97757a h = bVar2.mo137094h(j2, str, str3, sessionId2, storyCommentView6.f281898q, storyCommentView6.f281878D);
                this.f281920d.f281900s.f288074g.add(h);
                this.f281920d.f281900s.f288075h.add(h);
                StoryCommentView storyCommentView7 = this.f281920d;
                CommentsContainer.m83735d(storyCommentView7.f281888d, storyCommentView7.f281900s.f288074g, false, 2, (Object) null);
                StoryCommentView storyCommentView8 = this.f281920d;
                C76965a aVar2 = storyCommentView8.f281905x;
                if (!(aVar2 == null || (storyCommentInputView3 = aVar2.f224892f) == null)) {
                    LinkedList<C97757a> linkedList = storyCommentView8.f281900s.f288074g;
                    C87412m.m108594g(linkedList, "storyComments");
                    storyCommentInputView3.f281852p.mo139061F4(linkedList);
                }
                C76965a aVar3 = this.f281920d.f281905x;
                if (!(aVar3 == null || (storyCommentInputView2 = aVar3.f224892f) == null)) {
                    storyCommentInputView2.f281852p.notifyDataSetChanged();
                }
                StoryCommentView storyCommentView9 = this.f281920d;
                C76965a aVar4 = storyCommentView9.f281905x;
                if (!(aVar4 == null || (storyCommentInputView = aVar4.f224892f) == null)) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar5.mo10233c(Integer.valueOf(storyCommentView9.f281900s.f288074g.size() - 1));
                    C117292a.m165358d(storyCommentInputView, aVar5.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView$commentInputCallback$1", "invoke", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
                    storyCommentInputView.f281851o.post(new C76972h(storyCommentInputView, ((Integer) aVar5.mo10231a(0)).intValue()));
                    C117292a.m165359e(storyCommentInputView, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$commentInputCallback$1", "invoke", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
                }
            } else {
                C76965a aVar6 = storyCommentView.f281905x;
                if (aVar6 != null) {
                    aVar6.dismiss();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$l */
    public static final class C96385l extends C87413o implements C32227p<C97757a, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281921d;

        /* renamed from: e */
        public final /* synthetic */ Context f281922e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96385l(StoryCommentView storyCommentView, Context context) {
            super(2);
            this.f281921d = storyCommentView;
            this.f281922e = context;
        }

        public Object invoke(Object obj, Object obj2) {
            StoryCommentInputView storyCommentInputView;
            C97757a aVar = (C97757a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            if (booleanValue) {
                StoryCommentView.m123624c(this.f281921d);
                StoryCommentView storyCommentView = this.f281921d;
                String str = aVar.f286808a;
                storyCommentView.f281877C = str;
                storyCommentView.f281878D = aVar.f286812e;
                C76965a aVar2 = storyCommentView.f281905x;
                if (!(aVar2 == null || (storyCommentInputView = aVar2.f224892f) == null)) {
                    storyCommentInputView.mo134237c(storyCommentView.f281876B.get(str), this.f281921d.f281877C, true);
                }
            } else {
                String string = aVar.f286819l == 0 ? this.f281922e.getResources().getString(C0966R.string.joy) : this.f281922e.getResources().getString(C0966R.string.f361413jp0);
                C87412m.m108593f(string, "if (comment.replyComment…lete_reply)\n            }");
                C77426q qVar = new C77426q(this.f281922e);
                qVar.mo107595g(string);
                qVar.mo107602n(this.f281922e.getString(C0966R.string.f7944x1));
                qVar.mo107599k(-65536);
                qVar.mo107589a(true);
                qVar.mo107590b(new C96408b(this.f281921d, aVar));
                qVar.mo107603o();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$m */
    public static final class C96386m implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281923d;

        public C96386m(StoryCommentView storyCommentView) {
            this.f281923d = storyCommentView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r0.f224892f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onDismiss(android.content.DialogInterface r3) {
            /*
                r2 = this;
                com.tencent.mm.plugin.story.ui.view.StoryCommentView r3 = r2.f281923d
                r0 = 2
                r3.mo134254f(r0)
                com.tencent.mm.plugin.story.ui.view.StoryCommentView r3 = r2.f281923d
                boolean r0 = r3.f281906y
                if (r0 != 0) goto L_0x001c
                nw2.a r0 = r3.f281905x
                if (r0 == 0) goto L_0x0019
                com.tencent.mm.plugin.story.ui.view.StoryCommentInputView r0 = r0.f224892f
                if (r0 == 0) goto L_0x0019
                java.lang.CharSequence r0 = r0.getContent()
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                r3.f281875A = r0
            L_0x001c:
                com.tencent.mm.plugin.story.ui.view.StoryCommentView r3 = r2.f281923d
                nw2.a r3 = r3.f281905x
                if (r3 == 0) goto L_0x003a
                com.tencent.mm.plugin.story.ui.view.StoryCommentInputView r3 = r3.f224892f
                if (r3 == 0) goto L_0x003a
                lw2.f r0 = r3.f281852p
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mo139061F4(r1)
                lw2.f r0 = r3.f281852p
                r0.notifyDataSetChanged()
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel r3 = r3.f281855s
                r3.mo100189b()
            L_0x003a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView.C96386m.onDismiss(android.content.DialogInterface):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$n */
    public static final class C96387n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281924d;

        public C96387n(StoryCommentView storyCommentView) {
            this.f281924d = storyCommentView;
        }

        public final void run() {
            this.f281924d.f281889e.setVisibility(8);
            this.f281924d.f281889e.setAlpha(1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$o */
    public static final class C96388o implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281925d;

        public C96388o(StoryCommentView storyCommentView) {
            this.f281925d = storyCommentView;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            StoryCommentInputView storyCommentInputView;
            StoryCommentView storyCommentView = this.f281925d;
            if (!storyCommentView.f281906y) {
                StoryCommentView.m123624c(storyCommentView);
            }
            this.f281925d.mo134254f(2);
            C76965a aVar = this.f281925d.f281905x;
            if (aVar != null && (storyCommentInputView = aVar.f224892f) != null) {
                storyCommentInputView.f281852p.mo139061F4(new ArrayList());
                storyCommentInputView.f281852p.notifyDataSetChanged();
                storyCommentInputView.f281855s.mo100189b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$p */
    public static final class C96389p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281926d;

        public C96389p(StoryCommentView storyCommentView) {
            this.f281926d = storyCommentView;
        }

        public final void run() {
            this.f281926d.f281889e.setVisibility(8);
            this.f281926d.f281889e.setAlpha(1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$q */
    public static final class C96390q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281927d;

        public C96390q(StoryCommentView storyCommentView) {
            this.f281927d = storyCommentView;
        }

        public final void run() {
            this.f281927d.f281888d.mo98098a();
            this.f281927d.f281888d.setAlpha(1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentView$r */
    public static final class C96391r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentView f281928d;

        public C96391r(StoryCommentView storyCommentView) {
            this.f281928d = storyCommentView;
        }

        public final void run() {
            this.f281928d.f281890f.getClass();
            int[] iArr = StoryCommentView.f281874N;
            Log.m105924i("MicroMsg.StoryCommentView", "LogStory: comment recycler count is " + this.f281928d.f281889e.getChildCount());
            int childCount = this.f281928d.f281889e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f281928d.f281889e.getChildAt(i);
                if (childAt instanceof CommentItemView) {
                    CommentItemView commentItemView = (CommentItemView) childAt;
                    int childCount2 = this.f281928d.f281889e.getChildCount() - i;
                    long j = ((long) childCount2) * 30;
                    float b = ((float) (childCount2 + 1)) * ((float) C76577a.m92151b(commentItemView.getContext(), 16));
                    commentItemView.setAlpha(0.0f);
                    commentItemView.setTranslationY(b);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(commentItemView, "translationY", new float[]{b, 0.0f});
                    ofFloat.setDuration(150);
                    ofFloat.setStartDelay(j);
                    ofFloat.start();
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(commentItemView, "alpha", new float[]{0.0f, 1.0f});
                    ofFloat2.setDuration(150);
                    ofFloat2.setStartDelay(j);
                    ofFloat2.start();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f281898q = "";
        this.f281900s = new C98261f();
        this.f281902u = 2;
        this.f281903v = 2;
        this.f281876B = new LinkedHashMap<>();
        this.f281877C = "";
        this.f281879E = -1;
        this.f281880F = new LinkedHashMap<>();
        View.inflate(context2, C0966R.C0971layout.c6f, this);
        View findViewById = findViewById(C0966R.C0970id.k47);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_comment_item_container)");
        CommentsContainer commentsContainer = (CommentsContainer) findViewById;
        this.f281888d = commentsContainer;
        View findViewById2 = findViewById(C0966R.C0970id.k4j);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_comment_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f281889e = recyclerView;
        View findViewById3 = findViewById(C0966R.C0970id.k4e);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_comment_mask_view)");
        this.f281891g = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k3v);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_comment_hint)");
        TextView textView = (TextView) findViewById4;
        this.f281892h = textView;
        View findViewById5 = findViewById(C0966R.C0970id.k4k);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_comment_root_view)");
        this.f281893i = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.k4m);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_comment_self_bubble_icon)");
        StoryCommentBubbleView storyCommentBubbleView = (StoryCommentBubbleView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.k4g);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_…mment_others_bubble_icon)");
        View findViewById8 = findViewById(C0966R.C0970id.k4h);
        C87412m.m108593f(findViewById8, "findViewById(R.id.story_…ment_others_comment_icon)");
        View findViewById9 = findViewById(C0966R.C0970id.k4l);
        C87412m.m108593f(findViewById9, "findViewById(R.id.story_comment_self_action_group)");
        this.f281894j = findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.k4f);
        C87412m.m108593f(findViewById10, "findViewById(R.id.story_…ment_others_action_group)");
        this.f281895n = findViewById10;
        C61926c.m72678c(textView);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById3;
        StoryCommentBubbleView storyCommentBubbleView2 = (StoryCommentBubbleView) findViewById8;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        commentsContainer.setItemClickListener(new C96377e(this));
        storyCommentBubbleView.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icons_filled_chats, -1));
        storyCommentBubbleView2.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icons_filled_chats, -1));
        C99693f fVar = new C99693f();
        this.f281890f = fVar;
        recyclerView.setLayoutManager(new LinearLayoutManager(context2));
        recyclerView.setAdapter(fVar);
        recyclerView.setVisibility(8);
        recyclerView.setFocusable(false);
        fVar.f292193g = new C96378f(this);
        fVar.f292192f = new C96379g(this, context2);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.f357370bm2);
        int b = C76577a.m92151b(context2, 48);
        Bitmap.createScaledBitmap(decodeResource, b, b, true);
        this.f281881G = new C96380h(this);
        storyCommentBubbleView.setOnClickListener(new C96382i(this));
        ((StoryCommentBubbleView) findViewById7).setOnClickListener(new C96383j(this));
        storyCommentBubbleView2.setOnClickListener(new C96373a(this));
        C100231p pVar = new C100231p(this);
        this.f281882H = pVar;
        pVar.f293658b = new C96374b(this);
        setOnClickListener(new C96375c(this));
        setOnLongClickListener(new C96376d(this));
        int c = C75044y4.m89991c(context);
        Log.m105924i("MicroMsg.StoryCommentView", "LogStory: navigationHeight " + c);
        findViewById(C0966R.C0970id.k3r).setPadding(0, 0, 0, c);
        this.f281886L = new C96384k(this);
        this.f281887M = new C96385l(this, context2);
    }

    /* renamed from: a */
    public static final void m123622a(StoryCommentView storyCommentView, C97757a aVar) {
        StoryCommentInputView storyCommentInputView;
        StoryCommentInputView storyCommentInputView2;
        storyCommentView.getClass();
        C97758b.f286820d.mo137091e(aVar.f286811d, aVar.f286812e, storyCommentView.f281899r, aVar.f286809b);
        Iterator<C97757a> it = storyCommentView.f281900s.f288074g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C97757a next = it.next();
            int i2 = next.f286812e;
            if (i2 == 0 ? Util.isEqual(next.f286809b, aVar.f286809b) : i2 == aVar.f286812e) {
                break;
            }
            i++;
        }
        if (i != -1) {
            storyCommentView.f281900s.f288074g.remove(i);
            CommentsContainer.m83735d(storyCommentView.f281888d, storyCommentView.f281900s.f288074g, false, 2, (Object) null);
            storyCommentView.f281890f.mo139061F4(storyCommentView.f281900s.f288074g);
            C76965a aVar2 = storyCommentView.f281905x;
            if (!(aVar2 == null || (storyCommentInputView2 = aVar2.f224892f) == null)) {
                LinkedList<C97757a> linkedList = storyCommentView.f281900s.f288074g;
                C87412m.m108594g(linkedList, "storyComments");
                storyCommentInputView2.f281852p.mo139061F4(linkedList);
            }
            C76965a aVar3 = storyCommentView.f281905x;
            if (!(aVar3 == null || (storyCommentInputView = aVar3.f224892f) == null)) {
                storyCommentInputView.f281852p.notifyDataSetChanged();
            }
            storyCommentView.f281890f.notifyItemRemoved(i);
        }
    }

    /* renamed from: b */
    public static final void m123623b(StoryCommentView storyCommentView, boolean z) {
        if (!storyCommentView.f281897p && storyCommentView.f281896o && !storyCommentView.f281904w) {
            storyCommentView.f281904w = true;
            C97758b bVar = C97758b.f286820d;
            long j = storyCommentView.f281901t;
            String str = storyCommentView.f281877C;
            boolean z2 = !z;
            String str2 = storyCommentView.f281899r;
            String str3 = storyCommentView.f281898q;
            C87412m.m108594g(str, "toUsername");
            C87412m.m108594g(str3, "storyOwner");
            Log.m105924i(C97758b.f286824h, "postBubble: " + j + "  " + str + ", " + z2);
            C97757a i = C97758b.m126114i(bVar, j, str, "", false, z2, str2, str3, 0, 0, 384, (Object) null);
            i.f286815h = true;
            storyCommentView.f281900s.f288074g.add(i);
            CommentsContainer.m83735d(storyCommentView.f281888d, storyCommentView.f281900s.f288074g, false, 2, (Object) null);
            storyCommentView.f281888d.mo98099b();
            if (z) {
                C99069d.f290418a.mo138412a(5);
            } else {
                C99069d.f290418a.mo138412a(7);
            }
        } else if (z) {
            C99069d.f290418a.mo138412a(6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.f224892f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m123624c(com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView r3) {
        /*
            java.util.LinkedHashMap<java.lang.String, java.lang.CharSequence> r0 = r3.f281876B
            java.lang.String r1 = r3.f281877C
            nw2.a r2 = r3.f281905x
            if (r2 == 0) goto L_0x0011
            com.tencent.mm.plugin.story.ui.view.StoryCommentInputView r2 = r2.f224892f
            if (r2 == 0) goto L_0x0011
            java.lang.CharSequence r2 = r2.getContent()
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            r0.put(r1, r2)
            java.util.LinkedHashMap<java.lang.String, java.lang.CharSequence> r0 = r3.f281876B
            int r0 = r0.size()
            r1 = 3
            if (r0 <= r1) goto L_0x0037
            java.util.LinkedHashMap<java.lang.String, java.lang.CharSequence> r3 = r3.f281876B
            java.util.Set r0 = r3.keySet()
            java.lang.String r1 = "saveReplyContentCache.keys"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.Object r0 = sx3.C110818d0.m150915M(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = ""
        L_0x0034:
            r3.remove(r0)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView.m123624c(com.tencent.mm.plugin.story.ui.view.StoryCommentView):void");
    }

    /* renamed from: d */
    public void mo134252d() {
        this.f281888d.mo98098a();
        View view = this.f281893i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        r0 = f40.C86709a0.m107535s().mo121142i();
        r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_BUBBLE_COUNT_INT;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo134253e() {
        /*
            r11 = this;
            android.view.View r8 = r11.f281893i
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r3 = "show"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r8
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r2 = "show"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r8
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            int r0 = r11.f281903v
            r1 = 2
            r2 = 3
            if (r0 != r1) goto L_0x00b8
            android.view.View r0 = r11.f281893i
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0110
            int r0 = r11.f281902u
            if (r0 != r1) goto L_0x0110
            com.tencent.mm.plugin.story.ui.view.CommentsContainer r0 = r11.f281888d
            boolean r1 = r0.f206305i
            if (r1 == 0) goto L_0x0110
            gw2.f r1 = r11.f281900s
            r1.f288071d = r10
            r0.mo98100c()
            boolean r0 = r11.f281897p
            if (r0 != 0) goto L_0x0110
            boolean r0 = r11.f281896o
            if (r0 == 0) goto L_0x0110
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_BUBBLE_COUNT_INT
            int r0 = r0.mo119689j(r1, r10)
            if (r0 >= r2) goto L_0x0110
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo119677K(r1, r0)
            android.widget.TextView r0 = r11.f281892h
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.widget.TextView r0 = r11.f281892h
            r0.setVisibility(r10)
            android.widget.TextView r0 = r11.f281892h
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r0.start()
            java.lang.Runnable r0 = r11.f281881G
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
            java.lang.Runnable r0 = r11.f281881G
            r1 = 3000(0xbb8, double:1.482E-320)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            goto L_0x0110
        L_0x00b8:
            if (r0 != r2) goto L_0x0110
            r11.mo134254f(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f281889e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x0110
            gw2.f r1 = r11.f281900s
            java.util.LinkedList<ew2.a> r1 = r1.f288074g
            int r1 = r1.size()
            int r1 = r1 + -1
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r4 = "show"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "scrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.scrollToPosition(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/story/ui/view/StoryCommentView"
            java.lang.String r3 = "show"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "scrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView.mo134253e():void");
    }

    /* renamed from: f */
    public void mo134254f(int i) {
        StoryCommentInputView storyCommentInputView;
        StoryCommentInputView storyCommentInputView2;
        StoryCommentInputView storyCommentInputView3;
        StoryCommentInputView storyCommentInputView4;
        StoryCommentInputView storyCommentInputView5;
        StoryCommentInputView storyCommentInputView6;
        StoryCommentInputView storyCommentInputView7;
        StoryCommentInputView storyCommentInputView8;
        StoryCommentInputView storyCommentInputView9;
        StoryCommentInputView storyCommentInputView10;
        int i2 = i;
        Log.m105924i("MicroMsg.StoryCommentView", "switchState " + i2 + ' ' + Util.getStack());
        if (this.f281902u != i2) {
            this.f281902u = i2;
            this.f281903v = i2;
            StoryCommentInputView storyCommentInputView11 = null;
            if (i2 == 1) {
                this.f281877C = this.f281898q;
                this.f281878D = 0;
                this.f281888d.mo98098a();
                this.f281889e.setVisibility(8);
                this.f281888d.setVisibility(8);
                this.f281907z = false;
                Context context = getContext();
                C87412m.m108593f(context, "context");
                C76965a aVar = new C76965a(context);
                this.f281905x = aVar;
                StoryCommentInputView storyCommentInputView12 = aVar.f224892f;
                if (storyCommentInputView12 != null) {
                    storyCommentInputView12.setHostStory(this.f281890f.f292191e);
                }
                C76965a aVar2 = this.f281905x;
                StoryCommentInputView storyCommentInputView13 = aVar2 != null ? aVar2.f224892f : null;
                if (storyCommentInputView13 != null) {
                    storyCommentInputView13.setCommentInputCallback(this.f281886L);
                }
                C76965a aVar3 = this.f281905x;
                if (aVar3 != null) {
                    storyCommentInputView11 = aVar3.f224892f;
                }
                if (storyCommentInputView11 != null) {
                    storyCommentInputView11.setCommentReplyCallback(this.f281887M);
                }
                C76965a aVar4 = this.f281905x;
                if (!(aVar4 == null || (storyCommentInputView5 = aVar4.f224892f) == null)) {
                    storyCommentInputView5.mo134237c(this.f281875A, "", false);
                }
                C76965a aVar5 = this.f281905x;
                if (!(aVar5 == null || (storyCommentInputView4 = aVar5.f224892f) == null)) {
                    storyCommentInputView4.f281851o.setVisibility(0);
                }
                C76965a aVar6 = this.f281905x;
                if (!(aVar6 == null || (storyCommentInputView3 = aVar6.f224892f) == null)) {
                    LinkedList<C97757a> linkedList = this.f281900s.f288074g;
                    C87412m.m108594g(linkedList, "storyComments");
                    storyCommentInputView3.f281852p.mo139061F4(linkedList);
                }
                C76965a aVar7 = this.f281905x;
                if (!(aVar7 == null || (storyCommentInputView2 = aVar7.f224892f) == null)) {
                    storyCommentInputView2.f281852p.notifyDataSetChanged();
                }
                C76965a aVar8 = this.f281905x;
                if (!(aVar8 == null || (storyCommentInputView = aVar8.f224892f) == null)) {
                    C9556a aVar9 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar9.mo10233c(Integer.valueOf(this.f281900s.f288074g.size() - 1));
                    C117292a.m165358d(storyCommentInputView, aVar9.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    storyCommentInputView.f281851o.post(new C76972h(storyCommentInputView, ((Integer) aVar9.mo10231a(0)).intValue()));
                    C117292a.m165359e(storyCommentInputView, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                }
                C76965a aVar10 = this.f281905x;
                if (aVar10 != null) {
                    aVar10.show();
                }
                this.f281906y = false;
                C76965a aVar11 = this.f281905x;
                if (aVar11 != null) {
                    aVar11.setOnDismissListener(new C96386m(this));
                }
            } else if (i2 == 2) {
                this.f281877C = this.f281898q;
                this.f281878D = 0;
                if (this.f281897p) {
                    View view = this.f281894j;
                    C9556a aVar12 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar12.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar12.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f281895n;
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar13.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view5 = this.f281894j;
                    C9556a aVar14 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar14.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar14.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view7 = this.f281895n;
                    C9556a aVar15 = new C9556a();
                    aVar15.mo10233c(0);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar15.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f281891g.animate().cancel();
                this.f281891g.animate().alpha(0.0f).start();
                this.f281889e.animate().alpha(0.0f).withEndAction(new C96389p(this)).start();
                this.f281888d.animate().cancel();
                this.f281888d.setVisibility(0);
                this.f281888d.setAlpha(1.0f);
                if (this.f281883I) {
                    this.f281888d.mo98100c();
                }
                C76965a aVar16 = this.f281905x;
                if (aVar16 != null) {
                    aVar16.dismiss();
                }
            } else if (i2 == 3) {
                this.f281877C = this.f281898q;
                this.f281878D = 0;
                this.f281891g.animate().cancel();
                View view9 = this.f281891g;
                C9556a aVar17 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar17.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar17.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f281891g.animate().alpha(1.0f).start();
                this.f281888d.animate().alpha(0.0f).withEndAction(new C96390q(this)).start();
                this.f281889e.animate().cancel();
                this.f281889e.setVisibility(0);
                this.f281889e.setAlpha(1.0f);
                this.f281890f.mo139061F4(this.f281900s.f288074g);
                this.f281890f.notifyDataSetChanged();
                this.f281890f.getClass();
                this.f281889e.setAdapter(this.f281890f);
                RecyclerView recyclerView = this.f281889e;
                C9556a aVar18 = new C9556a();
                aVar18.mo10233c(Integer.valueOf(this.f281900s.f288074g.size() - 1));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar18.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar18.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                this.f281889e.post(new C96391r(this));
            } else if (i2 == 5) {
                this.f281888d.mo98098a();
                this.f281888d.setVisibility(8);
                this.f281889e.animate().alpha(0.0f).withEndAction(new C96387n(this)).start();
                this.f281907z = true;
                Context context2 = getContext();
                C87412m.m108593f(context2, "context");
                C76965a aVar19 = new C76965a(context2);
                this.f281905x = aVar19;
                StoryCommentInputView storyCommentInputView14 = aVar19.f224892f;
                if (storyCommentInputView14 != null) {
                    storyCommentInputView14.setHostStory(this.f281890f.f292191e);
                }
                C76965a aVar20 = this.f281905x;
                StoryCommentInputView storyCommentInputView15 = aVar20 != null ? aVar20.f224892f : null;
                if (storyCommentInputView15 != null) {
                    storyCommentInputView15.setCommentInputCallback(this.f281886L);
                }
                C76965a aVar21 = this.f281905x;
                if (aVar21 != null) {
                    storyCommentInputView11 = aVar21.f224892f;
                }
                if (storyCommentInputView11 != null) {
                    storyCommentInputView11.setCommentReplyCallback(this.f281887M);
                }
                C76965a aVar22 = this.f281905x;
                if (!(aVar22 == null || (storyCommentInputView10 = aVar22.f224892f) == null)) {
                    storyCommentInputView10.mo134237c(this.f281876B.get(this.f281877C), this.f281877C, true);
                }
                C76965a aVar23 = this.f281905x;
                if (!(aVar23 == null || (storyCommentInputView9 = aVar23.f224892f) == null)) {
                    storyCommentInputView9.f281851o.setVisibility(0);
                }
                C76965a aVar24 = this.f281905x;
                if (!(aVar24 == null || (storyCommentInputView8 = aVar24.f224892f) == null)) {
                    LinkedList<C97757a> linkedList2 = this.f281900s.f288074g;
                    C87412m.m108594g(linkedList2, "storyComments");
                    storyCommentInputView8.f281852p.mo139061F4(linkedList2);
                }
                C76965a aVar25 = this.f281905x;
                if (!(aVar25 == null || (storyCommentInputView7 = aVar25.f224892f) == null)) {
                    storyCommentInputView7.f281852p.notifyDataSetChanged();
                }
                C76965a aVar26 = this.f281905x;
                if (!(aVar26 == null || (storyCommentInputView6 = aVar26.f224892f) == null)) {
                    int i3 = this.f281879E;
                    C9556a aVar27 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar27.mo10233c(Integer.valueOf(i3));
                    C117292a.m165358d(storyCommentInputView6, aVar27.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    storyCommentInputView6.f281851o.post(new C76972h(storyCommentInputView6, ((Integer) aVar27.mo10231a(0)).intValue()));
                    C117292a.m165359e(storyCommentInputView6, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                }
                C76965a aVar28 = this.f281905x;
                if (aVar28 != null) {
                    aVar28.show();
                }
                this.f281906y = false;
                C76965a aVar29 = this.f281905x;
                if (aVar29 != null) {
                    aVar29.setOnDismissListener(new C96388o(this));
                }
            }
            C32226l<? super Integer, C13598b0> lVar = this.f281884J;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(this.f281902u));
            }
        }
    }

    public final C32224a<Boolean> getOutsideClickListener() {
        return this.f281885K;
    }

    public final String getSessionId() {
        return this.f281899r;
    }

    public final C32226l<Integer, C13598b0> getStateChangeCallback() {
        return this.f281884J;
    }

    public final void setOutsideClickListener(C32224a<Boolean> aVar) {
        this.f281885K = aVar;
    }

    public final void setSessionId(String str) {
        this.f281899r = str;
    }

    public final void setStateChangeCallback(C32226l<? super Integer, C13598b0> lVar) {
        this.f281884J = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
