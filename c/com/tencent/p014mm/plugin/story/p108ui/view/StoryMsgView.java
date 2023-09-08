package com.tencent.p014mm.plugin.story.p108ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPageExposeStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ew2.C97757a;
import ew2.C97758b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gw2.C98261f;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import jw2.C99069d;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lw2.C99705o;
import nw2.C100227l;
import nw2.C100228m;
import nw2.C100229n;
import nw2.C100230o;
import qo3.C77426q;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\u0006\u0010E\u001a\u00020\u0013¢\u0006\u0004\bF\u0010GB\u001b\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bF\u0010HR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R6\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR<\u0010%\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R<\u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006I"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMsgView;", "Landroid/widget/RelativeLayout;", "", "z", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "sessionId", "Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;", "A", "Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;", "getCommentInputView", "()Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;", "setCommentInputView", "(Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;)V", "commentInputView", "Lkotlin/Function2;", "", "", "Lrx3/b0;", "B", "Lfy3/p;", "getOnPageSelectedCallback", "()Lfy3/p;", "setOnPageSelectedCallback", "(Lfy3/p;)V", "onPageSelectedCallback", "Lkotlin/Function3;", "", "C", "Lfy3/q;", "getOnPageScrollCallback", "()Lfy3/q;", "setOnPageScrollCallback", "(Lfy3/q;)V", "onPageScrollCallback", "Lkotlin/Function1;", "D", "Lfy3/l;", "getOnPageStateCallback", "()Lfy3/l;", "setOnPageStateCallback", "(Lfy3/l;)V", "onPageStateCallback", "E", "getOnMsgPanelStateCallback", "setOnMsgPanelStateCallback", "onMsgPanelStateCallback", "Lkotlin/Function0;", "F", "Lfy3/a;", "getOutsideClickListener", "()Lfy3/a;", "setOutsideClickListener", "(Lfy3/a;)V", "outsideClickListener", "G", "I", "getCurPosition", "()I", "setCurPosition", "(I)V", "curPosition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView */
public final class StoryMsgView extends RelativeLayout {

    /* renamed from: H */
    public static final /* synthetic */ int f281961H = 0;

    /* renamed from: A */
    public StoryMsgInputView f281962A;

    /* renamed from: B */
    public C32227p<? super Integer, ? super Boolean, C13598b0> f281963B;

    /* renamed from: C */
    public C32228q<? super Integer, ? super Float, ? super Integer, C13598b0> f281964C;

    /* renamed from: D */
    public C32226l<? super Integer, C13598b0> f281965D;

    /* renamed from: E */
    public C32228q<? super Integer, ? super Integer, ? super Boolean, C13598b0> f281966E;

    /* renamed from: F */
    public C32224a<Boolean> f281967F;

    /* renamed from: G */
    public int f281968G;

    /* renamed from: d */
    public final String f281969d;

    /* renamed from: e */
    public final float f281970e;

    /* renamed from: f */
    public final ViewPager f281971f;

    /* renamed from: g */
    public final View f281972g;

    /* renamed from: h */
    public final View f281973h;

    /* renamed from: i */
    public final View f281974i;

    /* renamed from: j */
    public final View f281975j;

    /* renamed from: n */
    public final StoryActionView f281976n;

    /* renamed from: o */
    public C99705o f281977o;

    /* renamed from: p */
    public final ArrayList<StoryMsgListView> f281978p;

    /* renamed from: q */
    public C98261f f281979q;

    /* renamed from: r */
    public boolean f281980r;

    /* renamed from: s */
    public boolean f281981s;

    /* renamed from: t */
    public String f281982t;

    /* renamed from: u */
    public String f281983u;

    /* renamed from: v */
    public int f281984v;

    /* renamed from: w */
    public long f281985w;

    /* renamed from: x */
    public LinkedHashMap<String, CharSequence> f281986x;

    /* renamed from: y */
    public CharSequence f281987y;

    /* renamed from: z */
    public String f281988z;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$a */
    public static final class C96397a implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281989d;

        public C96397a(StoryMsgView storyMsgView) {
            this.f281989d = storyMsgView;
        }

        public void onPageScrollStateChanged(int i) {
            C32226l<Integer, C13598b0> onPageStateCallback = this.f281989d.getOnPageStateCallback();
            if (onPageStateCallback != null) {
                onPageStateCallback.invoke(Integer.valueOf(i));
            }
            StoryActionView storyActionView = this.f281989d.f281976n;
            if (storyActionView.f281815s) {
                String str = storyActionView.f281803d;
                Log.m105918d(str, "onPageChangedState state:" + i + " scrollDirection:" + storyActionView.f281819w);
                storyActionView.f281816t = i;
                if (i == 2) {
                    storyActionView.f281817u = true;
                } else if (i == 0) {
                    storyActionView.f281819w = -1;
                    storyActionView.f281817u = false;
                    storyActionView.f281818v = -1.0f;
                }
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            C32228q<Integer, Float, Integer, C13598b0> onPageScrollCallback = this.f281989d.getOnPageScrollCallback();
            if (onPageScrollCallback != null) {
                onPageScrollCallback.invoke(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
            }
            StoryActionView storyActionView = this.f281989d.f281976n;
            String str = storyActionView.f281803d;
            Log.m105918d(str, "curIndex:" + i + " offset:" + f + " p2:" + i2 + " readyAnimation:" + storyActionView.f281817u + " scrollDirection:" + storyActionView.f281819w + " lastOffset:" + storyActionView.f281818v);
            if (storyActionView.f281815s) {
                boolean z = true;
                if (storyActionView.f281816t == 1 && i == 0) {
                    int i3 = storyActionView.f281806g >>> 24;
                    int i4 = storyActionView.f281807h >>> 24;
                    float max = Math.max(Math.min(f, 1.0f), 0.0f);
                    float f2 = ((float) (i3 - i4)) * max;
                    int max2 = (Math.max(Math.min((int) (((float) i3) - f2), i3), i4) << 24) | 16777215;
                    int max3 = (Math.max(Math.min((int) (((float) i4) + f2), i3), i4) << 24) | 16777215;
                    float f3 = storyActionView.f281804e;
                    float max4 = Math.max(Math.min(f3 - ((f3 - storyActionView.f281805f) * max), f3), storyActionView.f281805f);
                    float f4 = storyActionView.f281805f;
                    float f5 = storyActionView.f281804e;
                    float max5 = Math.max(Math.min(f4 + ((f5 - f4) * max), f5), storyActionView.f281805f);
                    String str2 = storyActionView.f281803d;
                    Log.m105918d(str2, "outOffset:" + (max2 - i3) + "  inOffset:" + (max3 - i4));
                    storyActionView.f281811o.setTextColor(max2);
                    storyActionView.f281811o.setTextSize(0, max4);
                    storyActionView.f281812p.setTextColor(max3);
                    storyActionView.f281812p.setTextSize(0, max5);
                }
                float f6 = storyActionView.f281818v;
                if (f6 > f) {
                    storyActionView.f281819w = storyActionView.f281808i;
                } else if (f6 < f) {
                    storyActionView.f281819w = 0;
                }
                if (storyActionView.f281817u) {
                    if (!(f6 == -1.0f)) {
                        if (f6 != 0.0f) {
                            z = false;
                        }
                        if (!z) {
                            storyActionView.f281817u = false;
                            int i5 = storyActionView.f281819w;
                            if (i5 == 0) {
                                storyActionView.mo134212a(storyActionView.f281812p);
                                storyActionView.mo134214c(storyActionView.f281811o);
                            } else if (i5 == storyActionView.f281808i) {
                                storyActionView.mo134212a(storyActionView.f281811o);
                                storyActionView.mo134214c(storyActionView.f281812p);
                            }
                        }
                    }
                }
                storyActionView.f281818v = f;
            }
        }

        public void onPageSelected(int i) {
            List list;
            List list2;
            List list3;
            this.f281989d.setCurPosition(i);
            C32227p<Integer, Boolean, C13598b0> onPageSelectedCallback = this.f281989d.getOnPageSelectedCallback();
            if (onPageSelectedCallback != null) {
                onPageSelectedCallback.invoke(Integer.valueOf(i), Boolean.valueOf(this.f281989d.f281980r));
            }
            StoryActionView storyActionView = this.f281989d.f281976n;
            if (storyActionView != null) {
                storyActionView.f281821y = i;
                if (storyActionView.f281815s) {
                    if (i == 0) {
                        storyActionView.mo134215d(false, storyActionView.f281811o);
                    } else if (i == 1) {
                        storyActionView.mo134215d(false, storyActionView.f281812p);
                    }
                    String str = storyActionView.f281803d;
                    Log.m105918d(str, "onPageChanged index:" + i);
                }
            }
            StoryMsgView storyMsgView = this.f281989d;
            if (storyMsgView.f281980r) {
                String str2 = "";
                if (i == 0) {
                    StoryMsgListView storyMsgListView = storyMsgView.f281978p.get(0);
                    C98261f fVar = this.f281989d.f281979q;
                    if (fVar == null || (list2 = fVar.f288077j) == null) {
                        list2 = new ArrayList();
                    }
                    storyMsgListView.mo134292c(list2);
                    this.f281989d.getCommentInputView().mo134274b();
                    this.f281989d.getCommentInputView().setVisibility(8);
                    C99069d dVar = C99069d.f290418a;
                    long j = this.f281989d.f281985w;
                    if (j != 0) {
                        String bigInteger = new BigInteger(Long.toBinaryString(j), 2).toString();
                        C87412m.m108593f(bigInteger, "big.toString()");
                        StringBuffer stringBuffer = new StringBuffer(bigInteger);
                        while (stringBuffer.length() < 25) {
                            stringBuffer.insert(0, "0");
                        }
                        str2 = stringBuffer.toString();
                        C87412m.m108593f(str2, "sb.toString()");
                    }
                    if (C99069d.f290425h) {
                        StoryPageExposeStruct storyPageExposeStruct = C99069d.f290419b;
                        storyPageExposeStruct.f266262d = 8;
                        storyPageExposeStruct.f266263e = storyPageExposeStruct.mo86045b("StoryId", str2, true);
                        dVar.mo138413b();
                    }
                    C99069d.f290425h = false;
                } else if (i == 1) {
                    StoryMsgListView storyMsgListView2 = storyMsgView.f281978p.get(1);
                    C98261f fVar2 = this.f281989d.f281979q;
                    if (fVar2 == null || (list3 = fVar2.f288075h) == null) {
                        list3 = new ArrayList();
                    }
                    storyMsgListView2.mo134292c(list3);
                    C99069d dVar2 = C99069d.f290418a;
                    long j2 = this.f281989d.f281985w;
                    if (j2 != 0) {
                        String bigInteger2 = new BigInteger(Long.toBinaryString(j2), 2).toString();
                        C87412m.m108593f(bigInteger2, "big.toString()");
                        StringBuffer stringBuffer2 = new StringBuffer(bigInteger2);
                        while (stringBuffer2.length() < 25) {
                            stringBuffer2.insert(0, "0");
                        }
                        str2 = stringBuffer2.toString();
                        C87412m.m108593f(str2, "sb.toString()");
                    }
                    if (C99069d.f290426i) {
                        StoryPageExposeStruct storyPageExposeStruct2 = C99069d.f290419b;
                        storyPageExposeStruct2.f266262d = 5;
                        storyPageExposeStruct2.f266263e = storyPageExposeStruct2.mo86045b("StoryId", str2, true);
                        dVar2.mo138413b();
                    }
                    C99069d.f290426i = false;
                }
            } else {
                StoryMsgListView storyMsgListView3 = storyMsgView.f281978p.get(i);
                C98261f fVar3 = this.f281989d.f281979q;
                if (fVar3 == null || (list = fVar3.f288075h) == null) {
                    list = new ArrayList();
                }
                storyMsgListView3.mo134292c(list);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$b */
    public static final class C96398b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281990d;

        public C96398b(StoryMsgView storyMsgView) {
            this.f281990d = storyMsgView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<Boolean> outsideClickListener = this.f281990d.getOutsideClickListener();
            if (outsideClickListener != null) {
                Boolean invoke = outsideClickListener.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$c */
    public static final class C96399c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96399c(StoryMsgView storyMsgView) {
            super(1);
            this.f281991d = storyMsgView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            StoryMsgView storyMsgView = this.f281991d;
            if (storyMsgView.f281974i.getVisibility() == 0) {
                storyMsgView.f281971f.setCurrentItem(intValue);
            } else {
                storyMsgView.mo134306b(intValue, false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$d */
    public static final class C96400d extends C87413o implements C32226l<C97757a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281992d;

        /* renamed from: e */
        public final /* synthetic */ Context f281993e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96400d(StoryMsgView storyMsgView, Context context) {
            super(1);
            this.f281992d = storyMsgView;
            this.f281993e = context;
        }

        public Object invoke(Object obj) {
            C97757a aVar = (C97757a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            if (this.f281992d.getCommentInputView().getInputType() != -1) {
                this.f281992d.getCommentInputView().mo134274b();
            } else if (!Util.isEqual(StoryCore.f281736t.mo134187e(), aVar.f286808a)) {
                StoryMsgView storyMsgView = this.f281992d;
                String str = aVar.f286808a;
                storyMsgView.f281982t = str;
                storyMsgView.f281984v = aVar.f286812e;
                storyMsgView.f281962A.mo134276d(storyMsgView.f281987y, str, true);
                storyMsgView.f281962A.mo134277e(0, true);
            } else {
                String string = aVar.f286819l == 0 ? this.f281993e.getResources().getString(C0966R.string.joz) : this.f281993e.getResources().getString(C0966R.string.f361413jp0);
                C87412m.m108593f(string, "if (it.replyCommentId ==…_reply)\n                }");
                C77426q qVar = new C77426q(this.f281993e);
                qVar.mo107595g(string);
                qVar.mo107602n(this.f281993e.getString(C0966R.string.f7944x1));
                qVar.mo107599k(-65536);
                qVar.mo107589a(true);
                qVar.mo107590b(new C96409c(this.f281992d, aVar));
                qVar.mo107603o();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$e */
    public static final class C96401e extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96401e(StoryMsgView storyMsgView) {
            super(1);
            this.f281994d = storyMsgView;
        }

        public Object invoke(Object obj) {
            this.f281994d.f281974i.setTranslationY(Math.min(Math.max(this.f281994d.f281974i.getTranslationY() - ((float) ((Number) obj).intValue()), 0.0f), this.f281994d.f281970e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$f */
    public static final class C96402f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96402f(StoryMsgView storyMsgView) {
            super(0);
            this.f281995d = storyMsgView;
        }

        public Object invoke() {
            float translationY = this.f281995d.f281974i.getTranslationY();
            StoryMsgView storyMsgView = this.f281995d;
            if (translationY < storyMsgView.f281970e) {
                if (storyMsgView.f281974i.getTranslationY() > ((float) (this.f281995d.f281974i.getMeasuredHeight() / 10))) {
                    this.f281995d.mo134305a();
                } else {
                    StoryMsgView storyMsgView2 = this.f281995d;
                    storyMsgView2.mo134306b(storyMsgView2.getCurPosition(), true);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$g */
    public static final class C96403g extends C87413o implements C32227p<String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96403g(StoryMsgView storyMsgView) {
            super(2);
            this.f281996d = storyMsgView;
        }

        public Object invoke(Object obj, Object obj2) {
            List list;
            List list2;
            ArrayList<C97757a> arrayList;
            LinkedList<C97757a> linkedList;
            LinkedList<C97757a> linkedList2;
            String str = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(str, "content");
            StoryMsgView storyMsgView = this.f281996d;
            int i = StoryMsgView.f281961H;
            storyMsgView.getClass();
            if (booleanValue) {
                StoryMsgView storyMsgView2 = this.f281996d;
                storyMsgView2.f281986x.remove(storyMsgView2.f281982t);
                StoryMsgView storyMsgView3 = this.f281996d;
                storyMsgView3.f281987y = null;
                C97758b bVar = C97758b.f286820d;
                long j = storyMsgView3.f281985w;
                String str2 = storyMsgView3.f281982t;
                String sessionId = storyMsgView3.getSessionId();
                StoryMsgView storyMsgView4 = this.f281996d;
                C97757a h = bVar.mo137094h(j, str, str2, sessionId, storyMsgView4.f281983u, storyMsgView4.f281984v);
                C98261f fVar = this.f281996d.f281979q;
                if (!(fVar == null || (linkedList2 = fVar.f288075h) == null)) {
                    linkedList2.add(h);
                }
                C98261f fVar2 = this.f281996d.f281979q;
                if (!(fVar2 == null || (linkedList = fVar2.f288074g) == null)) {
                    linkedList.add(h);
                }
                C99705o oVar = this.f281996d.f281977o;
                if (!(oVar == null || (arrayList = oVar.f292230f) == null)) {
                    arrayList.add(h);
                }
                StoryMsgView storyMsgView5 = this.f281996d;
                if (storyMsgView5.f281980r) {
                    StoryMsgListView storyMsgListView = storyMsgView5.f281978p.get(1);
                    C98261f fVar3 = this.f281996d.f281979q;
                    if (fVar3 == null || (list2 = fVar3.f288075h) == null) {
                        list2 = new ArrayList();
                    }
                    storyMsgListView.mo134292c(list2);
                } else {
                    StoryMsgListView storyMsgListView2 = storyMsgView5.f281978p.get(0);
                    C98261f fVar4 = this.f281996d.f281979q;
                    if (fVar4 == null || (list = fVar4.f288075h) == null) {
                        list = new ArrayList();
                    }
                    storyMsgListView2.mo134292c(list);
                }
            }
            StoryMsgView storyMsgView6 = this.f281996d;
            if (storyMsgView6.f281980r) {
                storyMsgView6.getCommentInputView().setVisibility(8);
                StoryMsgView storyMsgView7 = this.f281996d;
                C98261f fVar5 = storyMsgView7.f281979q;
                if (fVar5 != null) {
                    storyMsgView7.f281976n.mo134216e(fVar5);
                }
            }
            this.f281996d.f281984v = 0;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$h */
    public static final class C96404h extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgView f281997d;

        public C96404h(StoryMsgView storyMsgView) {
            this.f281997d = storyMsgView;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f281997d.f281974i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateClose$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateClose$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationStart(Animator animator) {
            C32228q<Integer, Integer, Boolean, C13598b0> onMsgPanelStateCallback = this.f281997d.getOnMsgPanelStateCallback();
            if (onMsgPanelStateCallback != null) {
                onMsgPanelStateCallback.invoke(0, Integer.valueOf(this.f281997d.f281971f.getCurrentItem()), Boolean.valueOf(this.f281997d.f281980r));
            }
            StoryActionView storyActionView = this.f281997d.f281976n;
            storyActionView.f281820x = false;
            if (storyActionView.f281815s) {
                storyActionView.f281811o.setBackground(storyActionView.getResources().getDrawable(C0966R.C0969drawable.auu));
                storyActionView.f281812p.setBackground(storyActionView.getResources().getDrawable(C0966R.C0969drawable.auu));
                C98261f fVar = storyActionView.f281822z;
                if (fVar != null && fVar.f288073f) {
                    storyActionView.mo134215d(true, storyActionView.f281812p);
                } else {
                    storyActionView.mo134215d(false, storyActionView.f281812p);
                }
                C98261f fVar2 = storyActionView.f281822z;
                if (fVar2 != null && fVar2.f288072e) {
                    storyActionView.mo134215d(true, storyActionView.f281811o);
                } else {
                    storyActionView.mo134215d(false, storyActionView.f281811o);
                }
                storyActionView.mo134213b(storyActionView.f281811o);
                storyActionView.mo134213b(storyActionView.f281812p);
            } else {
                View view = storyActionView.f281814r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgClosed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgClosed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f281997d.getCommentInputView().mo134274b();
            this.f281997d.getCommentInputView().setVisibility(8);
            C99069d dVar = C99069d.f290418a;
            C99069d.f290425h = true;
            C99069d.f290426i = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgView$i */
    public static final class C96405i extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ boolean f281998d;

        /* renamed from: e */
        public final /* synthetic */ StoryMsgView f281999e;

        /* renamed from: f */
        public final /* synthetic */ int f282000f;

        public C96405i(boolean z, StoryMsgView storyMsgView, int i) {
            this.f281998d = z;
            this.f281999e = storyMsgView;
            this.f282000f = i;
        }

        public void onAnimationStart(Animator animator) {
            List list;
            List list2;
            List list3;
            if (!this.f281998d) {
                View view = this.f281999e.f281974i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateOpen$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateOpen$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                StoryMsgView storyMsgView = this.f281999e;
                String str = "";
                if (storyMsgView.f281980r) {
                    storyMsgView.f281971f.setCurrentItem(this.f282000f);
                    StoryMsgListView storyMsgListView = this.f281999e.f281978p.get(0);
                    C98261f fVar = this.f281999e.f281979q;
                    if (fVar == null || (list2 = fVar.f288077j) == null) {
                        list2 = new ArrayList();
                    }
                    storyMsgListView.mo134292c(list2);
                    StoryMsgListView storyMsgListView2 = this.f281999e.f281978p.get(1);
                    C98261f fVar2 = this.f281999e.f281979q;
                    if (fVar2 == null || (list3 = fVar2.f288075h) == null) {
                        list3 = new ArrayList();
                    }
                    storyMsgListView2.mo134292c(list3);
                    int i = this.f282000f;
                    if (i == 0) {
                        C99069d dVar = C99069d.f290418a;
                        long j = this.f281999e.f281985w;
                        if (j != 0) {
                            String bigInteger = new BigInteger(Long.toBinaryString(j), 2).toString();
                            C87412m.m108593f(bigInteger, "big.toString()");
                            StringBuffer stringBuffer = new StringBuffer(bigInteger);
                            while (stringBuffer.length() < 25) {
                                stringBuffer.insert(0, "0");
                            }
                            str = stringBuffer.toString();
                            C87412m.m108593f(str, "sb.toString()");
                        }
                        if (C99069d.f290425h) {
                            StoryPageExposeStruct storyPageExposeStruct = C99069d.f290419b;
                            storyPageExposeStruct.f266262d = 8;
                            storyPageExposeStruct.f266263e = storyPageExposeStruct.mo86045b("StoryId", str, true);
                            dVar.mo138413b();
                        }
                        C99069d.f290425h = false;
                    } else if (i == 1) {
                        C99069d dVar2 = C99069d.f290418a;
                        long j2 = this.f281999e.f281985w;
                        if (j2 != 0) {
                            String bigInteger2 = new BigInteger(Long.toBinaryString(j2), 2).toString();
                            C87412m.m108593f(bigInteger2, "big.toString()");
                            StringBuffer stringBuffer2 = new StringBuffer(bigInteger2);
                            while (stringBuffer2.length() < 25) {
                                stringBuffer2.insert(0, "0");
                            }
                            str = stringBuffer2.toString();
                            C87412m.m108593f(str, "sb.toString()");
                        }
                        if (C99069d.f290426i) {
                            StoryPageExposeStruct storyPageExposeStruct2 = C99069d.f290419b;
                            storyPageExposeStruct2.f266262d = 5;
                            storyPageExposeStruct2.f266263e = storyPageExposeStruct2.mo86045b("StoryId", str, true);
                            dVar2.mo138413b();
                        }
                        C99069d.f290426i = false;
                    }
                } else {
                    StoryMsgListView storyMsgListView3 = storyMsgView.f281978p.get(this.f282000f);
                    C98261f fVar3 = this.f281999e.f281979q;
                    if (fVar3 == null || (list = fVar3.f288075h) == null) {
                        list = new ArrayList();
                    }
                    storyMsgListView3.mo134292c(list);
                    StoryMsgInputView commentInputView = this.f281999e.getCommentInputView();
                    CharSequence charSequence = this.f281999e.f281987y;
                    int i2 = StoryMsgInputView.f281929x;
                    commentInputView.mo134276d(charSequence, str, false);
                    StoryMsgInputView commentInputView2 = this.f281999e.getCommentInputView();
                    C98261f fVar4 = this.f281999e.f281979q;
                    LinkedList<C97757a> linkedList = fVar4 != null ? fVar4.f288075h : null;
                    commentInputView2.mo134277e(0, linkedList == null || linkedList.isEmpty());
                    StoryMsgView storyMsgView2 = this.f281999e;
                    storyMsgView2.f281982t = storyMsgView2.f281983u;
                }
                StoryActionView storyActionView = this.f281999e.f281976n;
                int i3 = this.f282000f;
                storyActionView.f281820x = true;
                storyActionView.f281821y = i3;
                if (storyActionView.f281815s) {
                    storyActionView.f281811o.setBackground((Drawable) null);
                    storyActionView.f281812p.setBackground((Drawable) null);
                    if (i3 == 0) {
                        storyActionView.mo134212a(storyActionView.f281811o);
                        storyActionView.mo134214c(storyActionView.f281812p);
                        storyActionView.mo134215d(false, storyActionView.f281811o);
                    } else if (i3 == 1) {
                        storyActionView.mo134212a(storyActionView.f281812p);
                        storyActionView.mo134214c(storyActionView.f281811o);
                        storyActionView.mo134215d(false, storyActionView.f281812p);
                    }
                } else {
                    View view2 = storyActionView.f281814r;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgOpened", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgOpened", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C32228q<Integer, Integer, Boolean, C13598b0> onMsgPanelStateCallback = this.f281999e.getOnMsgPanelStateCallback();
                if (onMsgPanelStateCallback != null) {
                    onMsgPanelStateCallback.invoke(3, Integer.valueOf(this.f282000f), Boolean.valueOf(this.f281999e.f281980r));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f281969d = "MicroMsg.StoryMsgView";
        float f = (float) C75044y4.m89990b(context).y;
        this.f281970e = f;
        C74942w4.m89784a(context2, 3);
        this.f281978p = new ArrayList<>();
        this.f281982t = "";
        this.f281983u = "";
        this.f281986x = new LinkedHashMap<>();
        View.inflate(context2, C0966R.C0971layout.c7_, this);
        View findViewById = findViewById(C0966R.C0970id.k8g);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_msg_view_pager)");
        ViewPager viewPager = (ViewPager) findViewById;
        this.f281971f = viewPager;
        View findViewById2 = findViewById(C0966R.C0970id.k87);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_msg_close_img)");
        this.f281972g = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f359319k83);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_msg_blank_area)");
        this.f281973h = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k8c);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_msg_input_view)");
        this.f281962A = (StoryMsgInputView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.k8d);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_msg_list_root)");
        this.f281974i = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.f359317k81);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_msg_action_view)");
        StoryActionView storyActionView = (StoryActionView) findViewById6;
        this.f281976n = storyActionView;
        View findViewById7 = findViewById(C0966R.C0970id.f359318k82);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_msg_bg_area)");
        this.f281975j = findViewById7;
        ViewGroup.LayoutParams layoutParams = this.f281962A.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C75044y4.m89991c(context);
        C99705o oVar = new C99705o(this.f281980r, (ArrayList) null, (ArrayList) null, (ArrayList) null, 14, (C8480h) null);
        this.f281977o = oVar;
        viewPager.setAdapter(oVar);
        viewPager.addOnPageChangeListener(new C96397a(this));
        setOnClickListener(new C96398b(this));
        storyActionView.setOnActionClicked(new C96399c(this));
        findViewById7.setOnClickListener(new C100227l(this));
        findViewById2.setOnClickListener(new C100228m(this));
        findViewById3.setOnClickListener(new C100229n(this));
        C99705o oVar2 = this.f281977o;
        if (oVar2 != null) {
            oVar2.f292235n = new C100230o(this);
        }
        C99705o oVar3 = this.f281977o;
        if (oVar3 != null) {
            oVar3.f292234j = new C96400d(this, context2);
        }
        C99705o oVar4 = this.f281977o;
        if (oVar4 != null) {
            oVar4.f292236o = new C96401e(this);
        }
        C99705o oVar5 = this.f281977o;
        if (oVar5 != null) {
            oVar5.f292237p = new C96402f(this);
        }
        this.f281962A.setCommentInputCallback(new C96403g(this));
        findViewById5.setTranslationY(f);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById5;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: a */
    public final void mo134305a() {
        this.f281974i.animate().setListener(new C96404h(this)).translationY(this.f281970e).start();
    }

    /* renamed from: b */
    public final void mo134306b(int i, boolean z) {
        this.f281968G = i;
        this.f281974i.animate().setListener(new C96405i(z, this, i)).translationY(0.0f).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r4 = r4.f288077j;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134307c() {
        /*
            r18 = this;
            r0 = r18
            zv2.c r1 = zv2.C103109c.f304232b
            boolean r1 = r1.mo108963a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0082
            boolean r1 = r0.f281980r
            if (r1 != 0) goto L_0x0082
            boolean r1 = r0.f281981s
            if (r1 != 0) goto L_0x0082
            java.lang.String r1 = r0.f281969d
            java.lang.String r4 = "post visit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r0.f281981s = r2
            ew2.b r5 = ew2.C97758b.f286820d
            long r6 = r0.f281985w
            java.lang.String r13 = r0.f281983u
            java.lang.String r12 = r0.f281988z
            java.lang.String r1 = "toUsername"
            gy3.C87412m.m108594g(r13, r1)
            java.lang.String r1 = "storyOwner"
            gy3.C87412m.m108594g(r13, r1)
            java.lang.String r1 = ew2.C97758b.f286824h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "postVisit: "
            r4.append(r8)
            r4.append(r6)
            java.lang.String r8 = "  "
            r4.append(r8)
            r4.append(r13)
            java.lang.String r8 = ", "
            r4.append(r8)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            r10 = 0
            r14 = 0
            r15 = 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 0
            r11 = 0
            java.lang.String r9 = ""
            r8 = r13
            ew2.a r1 = ew2.C97758b.m126114i(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.f286815h = r2
            gw2.f r2 = r0.f281979q
            if (r2 == 0) goto L_0x0075
            java.util.LinkedList<ew2.a> r2 = r2.f288077j
            if (r2 == 0) goto L_0x0075
            r2.add(r1)
        L_0x0075:
            lw2.o r2 = r0.f281977o
            if (r2 == 0) goto L_0x0138
            java.util.ArrayList<ew2.a> r2 = r2.f292229e
            if (r2 == 0) goto L_0x0138
            r2.add(r1)
            goto L_0x0138
        L_0x0082:
            boolean r1 = r0.f281980r
            java.lang.String r4 = " isBubbled:"
            if (r1 == 0) goto L_0x0117
            java.lang.String r1 = r0.f281969d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "skip this post visit, but rpt. isSelf:"
            r5.append(r6)
            boolean r6 = r0.f281980r
            r5.append(r6)
            r5.append(r4)
            boolean r4 = r0.f281981s
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            jw2.d r1 = jw2.C99069d.f290418a
            long r4 = r0.f281985w
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00b6
            java.lang.String r1 = ""
            goto L_0x00e6
        L_0x00b6:
            java.lang.String r1 = java.lang.Long.toBinaryString(r4)
            java.math.BigInteger r4 = new java.math.BigInteger
            r5 = 2
            r4.<init>(r1, r5)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "big.toString()"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>(r1)
        L_0x00ce:
            int r1 = r4.length()
            r5 = 25
            if (r1 >= r5) goto L_0x00dc
            java.lang.String r1 = "0"
            r4.insert(r3, r1)
            goto L_0x00ce
        L_0x00dc:
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "sb.toString()"
            gy3.C87412m.m108593f(r1, r4)
        L_0x00e6:
            gw2.f r4 = r0.f281979q
            if (r4 == 0) goto L_0x00f3
            java.util.LinkedList<ew2.a> r4 = r4.f288077j
            if (r4 == 0) goto L_0x00f3
            int r4 = r4.size()
            goto L_0x00f4
        L_0x00f3:
            r4 = 0
        L_0x00f4:
            gw2.f r5 = r0.f281979q
            if (r5 == 0) goto L_0x0100
            java.util.LinkedList<ew2.a> r5 = r5.f288075h
            if (r5 == 0) goto L_0x0100
            int r3 = r5.size()
        L_0x0100:
            com.tencent.mm.autogen.mmdata.rpt.StoryFriendVisitPageExposeStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.StoryFriendVisitPageExposeStruct
            r5.<init>()
            java.lang.String r6 = "StoryidStr"
            java.lang.String r1 = r5.mo86045b(r6, r1, r2)
            r5.f156862f = r1
            long r1 = (long) r4
            r5.f156860d = r1
            long r1 = (long) r3
            r5.f156861e = r1
            r5.mo86054n()
            goto L_0x0138
        L_0x0117:
            java.lang.String r1 = r0.f281969d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "skip this post visit. isSelf:"
            r2.append(r3)
            boolean r3 = r0.f281980r
            r2.append(r3)
            r2.append(r4)
            boolean r3 = r0.f281981s
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView.mo134307c():void");
    }

    /* renamed from: d */
    public final void mo134308d() {
        this.f281976n.setVisibility(0);
        if (this.f281974i.getVisibility() != 0) {
            boolean z = true;
            if (this.f281980r) {
                C98261f fVar = this.f281979q;
                if (fVar != null && fVar.f288072e) {
                    mo134306b(0, false);
                    return;
                }
                if (fVar != null && fVar.f288073f) {
                    mo134306b(1, false);
                    return;
                }
                return;
            }
            C98261f fVar2 = this.f281979q;
            if (fVar2 == null || !fVar2.f288073f) {
                z = false;
            }
            if (z) {
                mo134306b(0, false);
                return;
            }
            return;
        }
        mo134306b(this.f281968G, false);
    }

    public final StoryMsgInputView getCommentInputView() {
        return this.f281962A;
    }

    public final int getCurPosition() {
        return this.f281968G;
    }

    public final C32228q<Integer, Integer, Boolean, C13598b0> getOnMsgPanelStateCallback() {
        return this.f281966E;
    }

    public final C32228q<Integer, Float, Integer, C13598b0> getOnPageScrollCallback() {
        return this.f281964C;
    }

    public final C32227p<Integer, Boolean, C13598b0> getOnPageSelectedCallback() {
        return this.f281963B;
    }

    public final C32226l<Integer, C13598b0> getOnPageStateCallback() {
        return this.f281965D;
    }

    public final C32224a<Boolean> getOutsideClickListener() {
        return this.f281967F;
    }

    public final String getSessionId() {
        return this.f281988z;
    }

    public final void setCommentInputView(StoryMsgInputView storyMsgInputView) {
        C87412m.m108594g(storyMsgInputView, "<set-?>");
        this.f281962A = storyMsgInputView;
    }

    public final void setCurPosition(int i) {
        this.f281968G = i;
    }

    public final void setOnMsgPanelStateCallback(C32228q<? super Integer, ? super Integer, ? super Boolean, C13598b0> qVar) {
        this.f281966E = qVar;
    }

    public final void setOnPageScrollCallback(C32228q<? super Integer, ? super Float, ? super Integer, C13598b0> qVar) {
        this.f281964C = qVar;
    }

    public final void setOnPageSelectedCallback(C32227p<? super Integer, ? super Boolean, C13598b0> pVar) {
        this.f281963B = pVar;
    }

    public final void setOnPageStateCallback(C32226l<? super Integer, C13598b0> lVar) {
        this.f281965D = lVar;
    }

    public final void setOutsideClickListener(C32224a<Boolean> aVar) {
        this.f281967F = aVar;
    }

    public final void setSessionId(String str) {
        this.f281988z = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryMsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
