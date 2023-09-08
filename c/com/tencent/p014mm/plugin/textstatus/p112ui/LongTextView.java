package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.transition.C103834d;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import b03.C67133s;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import rz2.C48201c;
import sn0.C90259e;
import vl3.C102226d;
import vz2.C78501d;
import yz2.C53671f;
import yz2.C79225c0;
import yz2.C79229d;
import yz2.C79232e;
import yz2.C79255p;
import yz2.C79258q;
import zz2.C16421b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B.\b\u0007\u0012\b\u0010®\u0001\u001a\u00030­\u0001\u0012\f\b\u0002\u0010°\u0001\u001a\u0005\u0018\u00010¯\u0001\u0012\t\b\u0002\u0010±\u0001\u001a\u00020\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00108\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R$\u0010<\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0017\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010\u001bR$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010k\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010o\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bl\u0010f\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR*\u0010x\u001a\u00020p2\u0006\u0010q\u001a\u00020p8\u0006@FX\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR*\u0010|\u001a\u00020\u00022\u0006\u0010q\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\by\u0010f\u001a\u0004\bz\u0010h\"\u0004\b{\u0010jR/\u0010\u0001\u001a\u0004\u0018\u00010\u001d2\b\u0010q\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b}\u0010\u001f\u001a\u0004\b~\u0010!\"\u0004\b\u0010#R.\u0010\u0001\u001a\u00020\u00022\u0006\u0010q\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010f\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR&\u0010\u0001\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010f\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010f\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR&\u0010\u0001\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010f\u001a\u0005\b\u0001\u0010h\"\u0005\b\u0001\u0010jR,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¢\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R7\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00012\t\u0010q\u001a\u0005\u0018\u00010¦\u00018\u0006@FX\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001¨\u0006´\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/LongTextView;", "Landroid/widget/LinearLayout;", "", "paddingBottom", "Lrx3/b0;", "setTextPaddingBottom", "", "getAnimationDuration", "", "getExpandContent", "Lb03/s$a;", "listener", "setFullTextLineCountChangeListener", "Landroid/view/View;", "d", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getTvLongText", "()Landroid/widget/TextView;", "setTvLongText", "(Landroid/widget/TextView;)V", "tvLongText", "Landroid/view/ViewGroup;", "f", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "setRootView", "(Landroid/view/ViewGroup;)V", "rootView", "Landroidx/core/widget/NestedScrollView;", "g", "Landroidx/core/widget/NestedScrollView;", "getScrollview", "()Landroidx/core/widget/NestedScrollView;", "setScrollview", "(Landroidx/core/widget/NestedScrollView;)V", "scrollview", "Lcom/tencent/mm/ui/widget/pulldown/NestedBounceView;", "h", "Lcom/tencent/mm/ui/widget/pulldown/NestedBounceView;", "getNestedBounceView", "()Lcom/tencent/mm/ui/widget/pulldown/NestedBounceView;", "setNestedBounceView", "(Lcom/tencent/mm/ui/widget/pulldown/NestedBounceView;)V", "nestedBounceView", "i", "getLayoutText", "setLayoutText", "layoutText", "j", "getTvInvisible", "setTvInvisible", "tvInvisible", "Lb03/s;", "n", "Lb03/s;", "getTextviewSuffixWrapper", "()Lb03/s;", "setTextviewSuffixWrapper", "(Lb03/s;)V", "textviewSuffixWrapper", "Lyz2/q;", "o", "Lyz2/q;", "getOnExpandListener", "()Lyz2/q;", "setOnExpandListener", "(Lyz2/q;)V", "onExpandListener", "Lyz2/p;", "p", "Lyz2/p;", "getOnCollapseListener", "()Lyz2/p;", "setOnCollapseListener", "(Lyz2/p;)V", "onCollapseListener", "Lyz2/c0;", "q", "Lyz2/c0;", "getSuffixOnClickListener", "()Lyz2/c0;", "setSuffixOnClickListener", "(Lyz2/c0;)V", "suffixOnClickListener", "Lyz2/d;", "r", "Lyz2/d;", "getFullTextHeightChangeListener", "()Lyz2/d;", "setFullTextHeightChangeListener", "(Lyz2/d;)V", "fullTextHeightChangeListener", "t", "I", "getPaddingBottomAfterCollapse", "()I", "setPaddingBottomAfterCollapse", "(I)V", "paddingBottomAfterCollapse", "u", "getFullTextHeight", "setFullTextHeight", "fullTextHeight", "", "value", "v", "Ljava/lang/String;", "getTextContent", "()Ljava/lang/String;", "setTextContent", "(Ljava/lang/String;)V", "textContent", "w", "getMaxLineCount", "setMaxLineCount", "maxLineCount", "x", "getSceneRoot", "setSceneRoot", "sceneRoot", "y", "getRootViewPaddingTop", "setRootViewPaddingTop", "rootViewPaddingTop", "z", "getPaddingTopAfterExpand", "setPaddingTopAfterExpand", "paddingTopAfterExpand", "Landroid/view/GestureDetector;", "A", "Landroid/view/GestureDetector;", "getMGestureDetector", "()Landroid/view/GestureDetector;", "mGestureDetector", "B", "getOriginPaddingTop", "setOriginPaddingTop", "originPaddingTop", "C", "getOriginPaddingBottom", "setOriginPaddingBottom", "originPaddingBottom", "Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "D", "Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "getPullDownListView", "()Lcom/tencent/mm/ui/widget/listview/PullDownListView;", "setPullDownListView", "(Lcom/tencent/mm/ui/widget/listview/PullDownListView;)V", "pullDownListView", "", "E", "Z", "isInPullDownListView", "()Z", "setInPullDownListView", "(Z)V", "Lb03/s$b;", "onCollageEndListener", "Lb03/s$b;", "getOnCollageEndListener", "()Lb03/s$b;", "setOnCollageEndListener", "(Lb03/s$b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView */
public final class LongTextView extends LinearLayout {

    /* renamed from: F */
    public static final /* synthetic */ int f206715F = 0;

    /* renamed from: A */
    public final GestureDetector f206716A;

    /* renamed from: B */
    public int f206717B;

    /* renamed from: C */
    public int f206718C;

    /* renamed from: D */
    public PullDownListView f206719D;

    /* renamed from: E */
    public boolean f206720E;

    /* renamed from: d */
    public View f206721d;

    /* renamed from: e */
    public TextView f206722e;

    /* renamed from: f */
    public ViewGroup f206723f;

    /* renamed from: g */
    public NestedScrollView f206724g;

    /* renamed from: h */
    public NestedBounceView f206725h;

    /* renamed from: i */
    public ViewGroup f206726i;

    /* renamed from: j */
    public TextView f206727j;

    /* renamed from: n */
    public C67133s f206728n;

    /* renamed from: o */
    public C79258q f206729o;

    /* renamed from: p */
    public C79255p f206730p;

    /* renamed from: q */
    public C79225c0 f206731q;

    /* renamed from: r */
    public C79229d f206732r;

    /* renamed from: s */
    public C67133s.C67134a f206733s;

    /* renamed from: t */
    public int f206734t;

    /* renamed from: u */
    public int f206735u;

    /* renamed from: v */
    public String f206736v;

    /* renamed from: w */
    public int f206737w;

    /* renamed from: x */
    public ViewGroup f206738x;

    /* renamed from: y */
    public int f206739y;

    /* renamed from: z */
    public int f206740z;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$a */
    public static final class C43191a implements View.OnTouchListener {

        /* renamed from: d */
        public static final C43191a f116879d = new C43191a();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$e */
    public static final class C43192e implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ LongTextView f116880d;

        public C43192e(LongTextView longTextView) {
            this.f116880d = longTextView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector mGestureDetector = this.f116880d.getMGestureDetector();
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector = mGestureDetector;
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$4", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = mGestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$4", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$f */
    public static final class C43193f implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ LongTextView f116881d;

        public C43193f(LongTextView longTextView) {
            this.f116881d = longTextView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GestureDetector mGestureDetector = this.f116881d.getMGestureDetector();
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector = mGestureDetector;
            C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = mGestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$g */
    public static final class C43194g implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ Context f116882d;

        public C43194g(Context context) {
            this.f116882d = context;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 1) {
                C78501d.m94806h(C78501d.f229945a, this.f116882d, 85, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$b */
    public static final class C71363b implements C67133s.C67134a {

        /* renamed from: a */
        public final /* synthetic */ LongTextView f206741a;

        public C71363b(LongTextView longTextView) {
            this.f206741a = longTextView;
        }

        public void onChange(int i) {
            C67133s.C67134a aVar = this.f206741a.f206733s;
            if (aVar != null) {
                aVar.onChange(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$c */
    public static final class C71364c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LongTextView f206742d;

        /* renamed from: e */
        public final /* synthetic */ C67133s f206743e;

        /* renamed from: f */
        public final /* synthetic */ Context f206744f;

        public C71364c(LongTextView longTextView, C67133s sVar, Context context) {
            this.f206742d = longTextView;
            this.f206743e = sVar;
            this.f206744f = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LongTextView longTextView = this.f206742d;
            int i = LongTextView.f206715F;
            if (!longTextView.mo98339b(true)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f206743e.f192767u = true;
            C79225c0 suffixOnClickListener = this.f206742d.getSuffixOnClickListener();
            if (suffixOnClickListener != null) {
                suffixOnClickListener.mo106718a();
            }
            C78501d.m94806h(C78501d.f229945a, this.f206744f, 81, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$d */
    public static final class C71365d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67133s f206745d;

        /* renamed from: e */
        public final /* synthetic */ LongTextView f206746e;

        /* renamed from: f */
        public final /* synthetic */ Context f206747f;

        public C71365d(C67133s sVar, LongTextView longTextView, Context context) {
            this.f206745d = sVar;
            this.f206746e = longTextView;
            this.f206747f = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f206745d.f192767u = true;
            LongTextView longTextView = this.f206746e;
            int i = LongTextView.f206715F;
            longTextView.mo98338a(true);
            C78501d.m94806h(C78501d.f229945a, this.f206747f, 83, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.LongTextView$h */
    public static final class C71366h extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ LongTextView f206748d;

        /* renamed from: e */
        public final /* synthetic */ Context f206749e;

        public C71366h(LongTextView longTextView, Context context) {
            this.f206748d = longTextView;
            this.f206749e = context;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            Log.m105924i("LongTextView", "onDoubleTap: ");
            if (C87412m.m108589b(this.f206748d.mo98340c(), Boolean.TRUE)) {
                C78501d.m94806h(C78501d.f229945a, this.f206749e, 86, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
            }
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            Boolean bool;
            Log.m105924i("LongTextView", "onSingleTapUp: ");
            C67133s textviewSuffixWrapper = this.f206748d.getTextviewSuffixWrapper();
            boolean z = false;
            if (textviewSuffixWrapper != null && textviewSuffixWrapper.f192767u) {
                C67133s textviewSuffixWrapper2 = this.f206748d.getTextviewSuffixWrapper();
                if (textviewSuffixWrapper2 != null) {
                    textviewSuffixWrapper2.f192767u = false;
                }
            } else {
                LongTextView longTextView = this.f206748d;
                C67133s sVar = longTextView.f206728n;
                if (sVar == null) {
                    bool = null;
                } else {
                    if (sVar.f192761o) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                }
                if (C87412m.m108589b(bool, Boolean.TRUE)) {
                    C67133s sVar2 = longTextView.f206728n;
                    if (sVar2 != null) {
                        if (sVar2.f192751e <= longTextView.f206737w) {
                            Log.m105928w("LongTextView", "textViewOnClick: can't click textview , fullTextLineCount:" + sVar2.f192751e + "  maxLineCount:" + longTextView.f206737w);
                        } else if (longTextView.mo98339b(true)) {
                            C78501d dVar = C78501d.f229945a;
                            Context context = longTextView.getContext();
                            C87412m.m108593f(context, "context");
                            C78501d.m94806h(dVar, context, 82, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
                        }
                    }
                } else {
                    C78501d dVar2 = C78501d.f229945a;
                    Context context2 = longTextView.getContext();
                    C87412m.m108593f(context2, "context");
                    C78501d.m94806h(dVar2, context2, 84, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
                    longTextView.mo98338a(true);
                }
            }
            return super.onSingleTapUp(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LongTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003d, code lost:
        r6 = r6.f151089f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongTextView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r5, r0)
            r4.<init>(r5, r6, r7)
            java.lang.String r6 = ""
            r4.f206736v = r6
            r6 = 3
            r4.f206737w = r6
            android.view.GestureDetector r6 = new android.view.GestureDetector
            android.content.Context r7 = r4.getContext()
            com.tencent.mm.plugin.textstatus.ui.LongTextView$h r0 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$h
            r0.<init>(r4, r5)
            r6.<init>(r7, r0)
            r4.f206716A = r6
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r5)
            r7 = 2131497967(0x7f0c13ef, float:1.8619542E38)
            android.view.View r6 = r6.inflate(r7, r4)
            r4.f206721d = r6
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r6 = r6.mo62443b(r5)
            java.lang.Class<zz2.a> r7 = zz2.C53848a.class
            bl3.t r6 = r6.mo62449e(r7)
            zz2.a r6 = (zz2.C53848a) r6
            r7 = 0
            if (r6 == 0) goto L_0x0048
            java.lang.ref.WeakReference<com.tencent.mm.ui.widget.listview.PullDownListView> r6 = r6.f151089f
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r6.get()
            com.tencent.mm.ui.widget.listview.PullDownListView r6 = (com.tencent.p014mm.p136ui.widget.listview.PullDownListView) r6
            goto L_0x0049
        L_0x0048:
            r6 = r7
        L_0x0049:
            r4.f206719D = r6
            int r6 = r4.f206739y
            r4.f206717B = r6
            int r6 = r4.getPaddingBottom()
            r4.f206718C = r6
            android.view.View r6 = r4.f206721d
            if (r6 == 0) goto L_0x0063
            r0 = 2131315768(0x7f094c38, float:1.8249999E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L_0x0064
        L_0x0063:
            r6 = r7
        L_0x0064:
            r4.f206722e = r6
            android.view.View r6 = r4.f206721d
            if (r6 == 0) goto L_0x0074
            r0 = 2131312857(0x7f0940d9, float:1.8244094E38)
            android.view.View r6 = r6.findViewById(r0)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            goto L_0x0075
        L_0x0074:
            r6 = r7
        L_0x0075:
            r4.f206724g = r6
            android.view.View r6 = r4.f206721d
            if (r6 == 0) goto L_0x0085
            r0 = 2131315139(0x7f0949c3, float:1.8248723E38)
            android.view.View r6 = r6.findViewById(r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x0086
        L_0x0085:
            r6 = r7
        L_0x0086:
            r4.f206723f = r6
            android.view.View r6 = r4.f206721d
            if (r6 == 0) goto L_0x0096
            r0 = 2131310069(0x7f0935f5, float:1.823844E38)
            android.view.View r6 = r6.findViewById(r0)
            com.tencent.mm.ui.widget.pulldown.NestedBounceView r6 = (com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView) r6
            goto L_0x0097
        L_0x0096:
            r6 = r7
        L_0x0097:
            r4.f206725h = r6
            android.view.View r6 = r4.f206721d
            if (r6 == 0) goto L_0x00a7
            r0 = 2131307166(0x7f092a9e, float:1.8232552E38)
            android.view.View r6 = r6.findViewById(r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x00a8
        L_0x00a7:
            r6 = r7
        L_0x00a8:
            r4.f206726i = r6
            android.view.View r6 = r4.f206721d
            if (r6 == 0) goto L_0x00b8
            r0 = 2131306496(0x7f092800, float:1.8231193E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L_0x00b9
        L_0x00b8:
            r6 = r7
        L_0x00b9:
            r4.f206727j = r6
            if (r6 != 0) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            r0 = 4
            r6.setVisibility(r0)
        L_0x00c2:
            android.widget.TextView r6 = r4.f206727j
            if (r6 == 0) goto L_0x00cb
            com.tencent.mm.plugin.textstatus.ui.LongTextView$a r0 = com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView.C43191a.f116879d
            r6.setOnTouchListener(r0)
        L_0x00cb:
            android.widget.TextView r6 = r4.f206722e
            if (r6 == 0) goto L_0x016e
            b03.s r0 = new b03.s
            r0.<init>(r6)
            com.tencent.mm.plugin.textstatus.ui.LongTextView$b r6 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$b
            r6.<init>(r4)
            r0.f192758l = r6
            android.content.res.Resources r6 = r5.getResources()
            r1 = 2131837904(0x7f1143d0, float:1.9309016E38)
            java.lang.String r6 = r6.getString(r1)
            r0.f192759m = r7
            r0.f192754h = r6
            r1 = 2131099702(0x7f060036, float:1.7811765E38)
            if (r6 == 0) goto L_0x010a
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131837882(0x7f1143ba, float:1.9308972E38)
            java.lang.String r2 = r2.getString(r3)
            int r2 = r2.length()
            int r6 = r6.length()
            com.tencent.mm.plugin.textstatus.ui.LongTextView$c r3 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$c
            r3.<init>(r4, r0, r5)
            r0.mo91246i(r2, r6, r1, r3)
        L_0x010a:
            android.content.res.Resources r6 = r5.getResources()
            r2 = 2131837906(0x7f1143d2, float:1.930902E38)
            java.lang.String r6 = r6.getString(r2)
            r0.f192760n = r7
            r0.f192755i = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r0.f192756j = r6
            com.tencent.mm.plugin.textstatus.ui.LongTextView$d r6 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$d
            r6.<init>(r0, r4, r5)
            r0.f192757k = r6
            int r6 = r4.f206737w
            r0.f192763q = r6
            r0.f192759m = r7
            r0.f192760n = r7
            androidx.transition.Transition r6 = r0.f192764r
            if (r6 != 0) goto L_0x0133
            goto L_0x013a
        L_0x0133:
            r1 = 100
            androidx.transition.TransitionSet r6 = (androidx.transition.TransitionSet) r6
            r6.mo145349V(r1)
        L_0x013a:
            android.view.ViewGroup r6 = r4.f206723f
            if (r6 != 0) goto L_0x014b
            android.widget.TextView r6 = r0.f192747a
            android.view.ViewParent r6 = r6.getParent()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r6, r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L_0x014b:
            r0.f192766t = r6
            java.lang.String r6 = r4.f206736v
            r0.mo91245g(r6)
            r6 = 0
            r4.mo98338a(r6)
            android.widget.TextView r6 = r0.f192747a
            com.tencent.mm.plugin.textstatus.ui.LongTextView$e r7 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$e
            r7.<init>(r4)
            r6.setOnTouchListener(r7)
            android.view.ViewGroup r6 = r4.f206726i
            if (r6 == 0) goto L_0x016c
            com.tencent.mm.plugin.textstatus.ui.LongTextView$f r7 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$f
            r7.<init>(r4)
            r6.setOnTouchListener(r7)
        L_0x016c:
            r4.f206728n = r0
        L_0x016e:
            androidx.core.widget.NestedScrollView r6 = r4.f206724g
            if (r6 == 0) goto L_0x017a
            com.tencent.mm.plugin.textstatus.ui.LongTextView$g r7 = new com.tencent.mm.plugin.textstatus.ui.LongTextView$g
            r7.<init>(r5)
            r6.setOnTouchListener(r7)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public final void mo98338a(boolean z) {
        Log.m105924i("LongTextView", "collapseLongText() called with: animation = " + z + " paddingBottomAfterCollapse:" + this.f206734t);
        NestedScrollView nestedScrollView = this.f206724g;
        if (nestedScrollView != null) {
            C53671f.m60200a(nestedScrollView, -2);
        }
        NestedBounceView nestedBounceView = this.f206725h;
        if (nestedBounceView != null) {
            C53671f.m60200a(nestedBounceView, -2);
        }
        NestedBounceView nestedBounceView2 = this.f206725h;
        if (nestedBounceView2 != null) {
            nestedBounceView2.setBounce(false);
        }
        TextView textView = this.f206722e;
        if (textView != null) {
            C67133s sVar = this.f206728n;
            if (sVar != null) {
                sVar.f192750d = this.f206734t;
            }
            if (sVar != null) {
                sVar.mo91242c(z);
            }
            C79255p pVar = this.f206730p;
            if (pVar != null) {
                pVar.mo106681a();
            }
            textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: b */
    public final boolean mo98339b(boolean z) {
        int i;
        PullDownListView pullDownListView = this.f206719D;
        if (pullDownListView == null || !this.f206720E || ((double) pullDownListView.getTranslationY()) > 0.0d) {
            C67133s sVar = this.f206728n;
            if (sVar == null || (i = sVar.f192751e) > sVar.f192763q) {
                NestedScrollView nestedScrollView = this.f206724g;
                if (nestedScrollView != null) {
                    C53671f.m60200a(nestedScrollView, -1);
                }
                NestedBounceView nestedBounceView = this.f206725h;
                if (nestedBounceView != null) {
                    C53671f.m60200a(nestedBounceView, -1);
                }
                NestedBounceView nestedBounceView2 = this.f206725h;
                if (nestedBounceView2 != null) {
                    nestedBounceView2.setBounce(true);
                }
                setVisibility(0);
                ViewGroup viewGroup = this.f206723f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                C79258q qVar = this.f206729o;
                if (qVar != null) {
                    qVar.mo106680a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expandLongText: fullTextLineCount= ");
                C67133s sVar2 = this.f206728n;
                Transition transition = null;
                sb.append(sVar2 != null ? Integer.valueOf(sVar2.f192751e) : null);
                Log.m105924i("LongTextView", sb.toString());
                C67133s sVar3 = this.f206728n;
                if (sVar3 != null) {
                    Log.m105924i("TextViewSuffixWrapper", "expand: isAnimationRunning:" + sVar3.f192769w + " textview:" + sVar3.f192747a);
                    if (!sVar3.f192769w) {
                        sVar3.f192747a.scrollTo(0, 0);
                        if (z) {
                            transition = sVar3.f192764r;
                        }
                        CharSequence charSequence = sVar3.f192760n;
                        if (charSequence == null) {
                            charSequence = sVar3.f192755i == null ? sVar3.f192753g : sVar3.mo91243d();
                        }
                        sVar3.f192761o = false;
                        if (charSequence == null) {
                            charSequence = sVar3.f192753g;
                        }
                        TextView textView = sVar3.f192747a;
                        ViewGroup viewGroup2 = sVar3.f192766t;
                        C87412m.m108594g(textView, "textview");
                        C87412m.m108594g(charSequence, "expandContent");
                        C87412m.m108594g(viewGroup2, "sceneRoot");
                        textView.setMaxLines(Integer.MAX_VALUE);
                        textView.setText(C102226d.m134696a(MMApplicationContext.getContext(), charSequence));
                        if (transition != null) {
                            C103834d.m138407a(viewGroup2, transition);
                        }
                    }
                }
                TextView textView2 = this.f206722e;
                if (textView2 != null) {
                    textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), 0);
                }
                setPadding(getPaddingLeft(), this.f206740z, getPaddingRight(), getPaddingBottom());
                C39818r rVar = C39818r.f106831a;
                Context context = getContext();
                C87412m.m108593f(context, "context");
                ((C16421b) rVar.mo62443b(context).mo75002a(C16421b.class)).mo14879c3();
                return true;
            }
            Log.m105925i("LongTextView", "expandLongText: don't need expand. fullTextLineCount:%s targetLineCount:%s", Integer.valueOf(i), Integer.valueOf(sVar.f192763q));
            return false;
        }
        Log.m105928w("LongTextView", "textViewOnClick: is error  pullDownListView status");
        return false;
    }

    /* renamed from: c */
    public final Boolean mo98340c() {
        C67133s sVar = this.f206728n;
        if (sVar == null) {
            return null;
        }
        boolean z = false;
        if (sVar != null && !sVar.f192761o) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final long getAnimationDuration() {
        Transition transition;
        C67133s sVar = this.f206728n;
        if (sVar == null || (transition = sVar.f192764r) == null) {
            return 0;
        }
        return transition.f306715f;
    }

    public final CharSequence getExpandContent() {
        C67133s sVar = this.f206728n;
        if (sVar != null) {
            CharSequence charSequence = sVar.f192760n;
            if (charSequence == null) {
                charSequence = sVar.f192755i == null ? sVar.f192753g : sVar.mo91243d();
            }
            return charSequence == null ? "" : charSequence;
        }
    }

    public final int getFullTextHeight() {
        return this.f206735u;
    }

    public final C79229d getFullTextHeightChangeListener() {
        return this.f206732r;
    }

    public final ViewGroup getLayoutText() {
        return this.f206726i;
    }

    public final GestureDetector getMGestureDetector() {
        return this.f206716A;
    }

    public final int getMaxLineCount() {
        return this.f206737w;
    }

    public final NestedBounceView getNestedBounceView() {
        return this.f206725h;
    }

    public final C67133s.C67135b getOnCollageEndListener() {
        return null;
    }

    public final C79255p getOnCollapseListener() {
        return this.f206730p;
    }

    public final C79258q getOnExpandListener() {
        return this.f206729o;
    }

    public final int getOriginPaddingBottom() {
        return this.f206718C;
    }

    public final int getOriginPaddingTop() {
        return this.f206717B;
    }

    public final int getPaddingBottomAfterCollapse() {
        return this.f206734t;
    }

    public final int getPaddingTopAfterExpand() {
        return this.f206740z;
    }

    public final PullDownListView getPullDownListView() {
        return this.f206719D;
    }

    public final View getRoot() {
        return this.f206721d;
    }

    public final ViewGroup getRootView() {
        return this.f206723f;
    }

    public final int getRootViewPaddingTop() {
        return this.f206739y;
    }

    public final ViewGroup getSceneRoot() {
        return this.f206738x;
    }

    public final NestedScrollView getScrollview() {
        return this.f206724g;
    }

    public final C79225c0 getSuffixOnClickListener() {
        return this.f206731q;
    }

    public final String getTextContent() {
        return this.f206736v;
    }

    public final C67133s getTextviewSuffixWrapper() {
        return this.f206728n;
    }

    public final TextView getTvInvisible() {
        return this.f206727j;
    }

    public final TextView getTvLongText() {
        return this.f206722e;
    }

    public void onAttachedToWindow() {
        Transition transition;
        super.onAttachedToWindow();
        C67133s sVar = this.f206728n;
        if (sVar != null && (transition = sVar.f192764r) != null) {
            ((TransitionSet) transition).mo145346S(sVar.f192765s);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C67133s sVar = this.f206728n;
        if (sVar != null) {
            Transition transition = sVar.f192764r;
            if (transition != null) {
                transition.mo145310C(sVar.f192765s);
            }
            for (Transition.C103824e f : sVar.f192748b) {
                sVar.mo91244f(f);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        if (C87412m.m108589b(mo98340c(), Boolean.TRUE)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z = true;
        }
        if (z) {
            C39818r rVar = C39818r.f106831a;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            ((C16421b) rVar.mo62443b(context).mo75002a(C16421b.class)).mo14879c3();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFullTextHeight(int i) {
        this.f206735u = i;
    }

    public final void setFullTextHeightChangeListener(C79229d dVar) {
        this.f206732r = dVar;
    }

    public final void setFullTextLineCountChangeListener(C67133s.C67134a aVar) {
        this.f206733s = aVar;
    }

    public final void setInPullDownListView(boolean z) {
        this.f206720E = z;
    }

    public final void setLayoutText(ViewGroup viewGroup) {
        this.f206726i = viewGroup;
    }

    public final void setMaxLineCount(int i) {
        this.f206737w = i;
        C67133s sVar = this.f206728n;
        if (sVar != null) {
            sVar.f192763q = i;
            sVar.f192759m = null;
            sVar.f192760n = null;
        }
    }

    public final void setNestedBounceView(NestedBounceView nestedBounceView) {
        this.f206725h = nestedBounceView;
    }

    public final void setOnCollageEndListener(C67133s.C67135b bVar) {
        C67133s sVar = this.f206728n;
        if (sVar != null) {
            sVar.f192749c = bVar;
        }
    }

    public final void setOnCollapseListener(C79255p pVar) {
        this.f206730p = pVar;
    }

    public final void setOnExpandListener(C79258q qVar) {
        this.f206729o = qVar;
    }

    public final void setOriginPaddingBottom(int i) {
        this.f206718C = i;
    }

    public final void setOriginPaddingTop(int i) {
        this.f206717B = i;
    }

    public final void setPaddingBottomAfterCollapse(int i) {
        this.f206734t = i;
    }

    public final void setPaddingTopAfterExpand(int i) {
        this.f206740z = i;
    }

    public final void setPullDownListView(PullDownListView pullDownListView) {
        this.f206719D = pullDownListView;
    }

    public final void setRoot(View view) {
        this.f206721d = view;
    }

    public final void setRootView(ViewGroup viewGroup) {
        this.f206723f = viewGroup;
    }

    public final void setRootViewPaddingTop(int i) {
        this.f206739y = i;
        ViewGroup viewGroup = this.f206723f;
        if (viewGroup != null) {
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.f206739y, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
    }

    public final void setSceneRoot(ViewGroup viewGroup) {
        C67133s sVar;
        this.f206738x = viewGroup;
        if (viewGroup != null && (sVar = this.f206728n) != null) {
            sVar.f192766t = viewGroup;
        }
    }

    public final void setScrollview(NestedScrollView nestedScrollView) {
        this.f206724g = nestedScrollView;
    }

    public final void setSuffixOnClickListener(C79225c0 c0Var) {
        this.f206731q = c0Var;
    }

    public final void setTextContent(String str) {
        C87412m.m108594g(str, "value");
        this.f206736v = str;
        C67133s sVar = this.f206728n;
        if (sVar != null) {
            sVar.mo91245g(str);
        }
        TextView textView = this.f206727j;
        if (textView != null) {
            textView.setVisibility(4);
            textView.setText(str);
            this.f206735u = 0;
            addOnLayoutChangeListener(new C79232e(this, str));
        }
    }

    public final void setTextPaddingBottom(int i) {
        Boolean bool;
        TextView textView = this.f206722e;
        if (textView != null) {
            this.f206734t = i;
            C67133s sVar = this.f206728n;
            if (sVar == null) {
                bool = null;
            } else {
                boolean z = true;
                if (!sVar.f192761o) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            if (C87412m.m108589b(bool, Boolean.TRUE)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i);
            }
        }
    }

    public final void setTextviewSuffixWrapper(C67133s sVar) {
        this.f206728n = sVar;
    }

    public final void setTvInvisible(TextView textView) {
        this.f206727j = textView;
    }

    public final void setTvLongText(TextView textView) {
        this.f206722e = textView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LongTextView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
