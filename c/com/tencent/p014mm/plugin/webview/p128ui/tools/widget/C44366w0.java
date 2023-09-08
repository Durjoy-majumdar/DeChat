package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import cm0.C28613b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ea3.C45588e;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hc0.C20937c;
import i93.C8866a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C47350c;
import p248ug.C78160t0;
import p385u2.C111105a;
import pe3.C47465a;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import t83.C48590l;
import te3.C48670a6;
import te3.C49519g6;
import te3.C49663h6;
import te3.C49983jf;
import te3.C50608ny;
import te3.C52218z5;
import wd3.C22898h;
import wd3.C22908r;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0 */
public final class C44366w0 extends WebViewKeyboardLinearLayout {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f120233Q0 = 0;

    /* renamed from: A */
    public final ListView f120234A;

    /* renamed from: B */
    public final View f120235B;

    /* renamed from: C */
    public final View f120236C;

    /* renamed from: D */
    public final TextView f120237D;

    /* renamed from: E */
    public final TextView f120238E;

    /* renamed from: F */
    public final TextView f120239F;

    /* renamed from: G */
    public C44375i f120240G;

    /* renamed from: H */
    public int f120241H;

    /* renamed from: I */
    public boolean f120242I;

    /* renamed from: J */
    public int f120243J;

    /* renamed from: K */
    public int f120244K;

    /* renamed from: L */
    public int f120245L;

    /* renamed from: M */
    public String f120246M;

    /* renamed from: N */
    public String f120247N;

    /* renamed from: P */
    public int f120248P;

    /* renamed from: Q */
    public int f120249Q;

    /* renamed from: R */
    public int f120250R;

    /* renamed from: S */
    public int f120251S;

    /* renamed from: T */
    public long f120252T;

    /* renamed from: U */
    public int f120253U;

    /* renamed from: V */
    public WeakReference<C44366w0> f120254V;

    /* renamed from: W */
    public boolean f120255W;

    /* renamed from: p0 */
    public int f120256p0;

    /* renamed from: t */
    public final WebViewUI f120257t;

    /* renamed from: u */
    public final boolean f120258u;

    /* renamed from: v */
    public final WebViewKeyboardLinearLayout f120259v;

    /* renamed from: w */
    public final View f120260w;

    /* renamed from: x */
    public final C13601g f120261x = C36568h.m40985a(new C44384m(this));

    /* renamed from: x0 */
    public boolean f120262x0;

    /* renamed from: y */
    public final Button f120263y;

    /* renamed from: y0 */
    public boolean f120264y0;

    /* renamed from: z */
    public final MMEditText f120265z;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$a */
    public static final class C44367a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120266d;

        public C44367a(C44366w0 w0Var) {
            this.f120266d = w0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C44366w0.m48736e(this.f120266d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$b */
    public static final class C44368b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120267d;

        public C44368b(C44366w0 w0Var) {
            this.f120267d = w0Var;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C44366w0.m48736e(this.f120267d);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$c */
    public static final class C44369c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120268d;

        public C44369c(C44366w0 w0Var) {
            this.f120268d = w0Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                this.f120268d.mo69139v();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$d */
    public static final class C44370d implements View.OnClickListener {

        /* renamed from: d */
        public static final C44370d f120269d = new C44370d();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$e */
    public static final class C44371e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120270d;

        public C44371e(C44366w0 w0Var) {
            this.f120270d = w0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f120270d.mo69124r();
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$f */
    public static final class C44372f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120271d;

        public C44372f(C44366w0 w0Var) {
            this.f120271d = w0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C44366w0 w0Var = this.f120271d;
            if (w0Var.f120242I) {
                String obj = w0Var.f120265z.getText().toString();
                C48590l lVar = this.f120271d.getWebView().f118508Z;
                if (lVar != null) {
                    lVar.mo73260u0(1, obj, 1);
                }
            } else {
                w0Var.getWebView().hideVKB();
                if (this.f120271d.getSayFooter().mo68901d()) {
                    MPSmileyFooter k = this.f120271d.getSayFooter();
                    k.f119808g.mo100196h();
                    k.f119808g.setVisibility(8);
                    k.setVisibility(8);
                }
                C49519g6 g6Var = new C49519g6();
                g6Var.f133875e = this.f120271d.f120265z.getText().toString();
                g6Var.f133877g = 1;
                C44366w0 w0Var2 = this.f120271d;
                int i = w0Var2.f120244K;
                if (i != 0) {
                    g6Var.f133877g = 3;
                    g6Var.f133878h = i;
                }
                w0Var2.mo69122p(g6Var);
                C8866a.m8686c(10);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$g */
    public static final class C44373g implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120272d;

        public C44373g(C44366w0 w0Var) {
            this.f120272d = w0Var;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C44366w0 w0Var = this.f120272d;
            Button button = w0Var.f120263y;
            Editable text = w0Var.f120265z.getText();
            C87412m.m108593f(text, "contentEt.text");
            button.setEnabled(text.length() > 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$h */
    public static final class C44374h implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120273d;

        public C44374h(C44366w0 w0Var) {
            this.f120273d = w0Var;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "event");
            if (view.getId() == C0966R.C0970id.h0s && this.f120273d.f120265z.getLineCount() >= 5) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$i */
    public static final class C44375i extends BaseAdapter {

        /* renamed from: h */
        public static C20937c f120274h;

        /* renamed from: d */
        public final Context f120275d;

        /* renamed from: e */
        public final LinkedList<C49983jf> f120276e;

        /* renamed from: f */
        public C44366w0 f120277f;

        /* renamed from: g */
        public final ArrayList<View> f120278g = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a */
        public final class C44376a {

            /* renamed from: a */
            public TextView f120279a;

            /* renamed from: b */
            public TextView f120280b;

            /* renamed from: c */
            public NeatTextView f120281c;

            /* renamed from: d */
            public WeImageView f120282d;

            /* renamed from: e */
            public final ImageView f120283e;

            /* renamed from: f */
            public final ImageView f120284f;

            /* renamed from: g */
            public final TextView f120285g;

            /* renamed from: h */
            public final TextView f120286h;

            /* renamed from: i */
            public final ImageView f120287i;

            /* renamed from: j */
            public final ImageView f120288j;

            public C44376a(C44375i iVar, View view) {
                C87412m.m108594g(view, "itemView");
                this.f120279a = (TextView) view.findViewById(C0966R.C0970id.af7);
                this.f120280b = (TextView) view.findViewById(C0966R.C0970id.af6);
                this.f120281c = (NeatTextView) view.findViewById(C0966R.C0970id.af4);
                this.f120282d = (WeImageView) view.findViewById(C0966R.C0970id.af5);
                this.f120283e = (ImageView) view.findViewById(C0966R.C0970id.a_n);
                this.f120284f = (ImageView) view.findViewById(C0966R.C0970id.a_p);
                this.f120285g = (TextView) view.findViewById(C0966R.C0970id.a_s);
                this.f120286h = (TextView) view.findViewById(C0966R.C0970id.a_q);
                this.f120287i = (ImageView) view.findViewById(C0966R.C0970id.abv);
                this.f120288j = (ImageView) view.findViewById(C0966R.C0970id.abw);
                Context context = view.getContext();
                NeatTextView neatTextView = this.f120281c;
                C87412m.m108593f(context, "context");
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(C0966R.attr.f2753hd, typedValue, true);
                neatTextView.setTextColor(C111105a.m151500b(context, typedValue.resourceId));
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$b */
        public final class C44377b {

            /* renamed from: a */
            public final ImageView f120289a;

            /* renamed from: b */
            public final LinearLayout f120290b;

            /* renamed from: c */
            public LinearLayout f120291c;

            /* renamed from: d */
            public LinearLayout f120292d;

            /* renamed from: e */
            public C44376a f120293e;

            /* renamed from: f */
            public final TextView f120294f;

            /* renamed from: g */
            public final ArrayList<View> f120295g = new ArrayList<>();

            /* renamed from: h */
            public final /* synthetic */ C44375i f120296h;

            public C44377b(C44375i iVar, View view) {
                C87412m.m108594g(view, "itemView");
                this.f120296h = iVar;
                this.f120289a = (ImageView) view.findViewById(C0966R.C0970id.f357548af2);
                this.f120290b = (LinearLayout) view.findViewById(C0966R.C0970id.f357549af3);
                this.f120291c = (LinearLayout) view.findViewById(C0966R.C0970id.af9);
                this.f120292d = (LinearLayout) view.findViewById(C0966R.C0970id.cjv);
                LinearLayout linearLayout = this.f120291c;
                C87412m.m108593f(linearLayout, "fansLayout");
                this.f120293e = new C44376a(iVar, linearLayout);
                this.f120294f = (TextView) view.findViewById(C0966R.C0970id.a_r);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$c */
        public static final class C44378c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C44375i f120297d;

            /* renamed from: e */
            public final /* synthetic */ boolean f120298e;

            /* renamed from: f */
            public final /* synthetic */ C50608ny f120299f;

            /* renamed from: g */
            public final /* synthetic */ C49983jf f120300g;

            /* renamed from: h */
            public final /* synthetic */ C44376a f120301h;

            public C44378c(C44375i iVar, boolean z, C50608ny nyVar, C49983jf jfVar, C44376a aVar) {
                this.f120297d = iVar;
                this.f120298e = z;
                this.f120299f = nyVar;
                this.f120300g = jfVar;
                this.f120301h = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0139  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x0141  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0154  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r0.add(r8)
                    java.lang.Object[] r6 = r0.toArray()
                    r0.clear()
                    java.lang.String r1 = "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$showLikeStatus$1"
                    java.lang.String r2 = "android/view/View$OnClickListener"
                    java.lang.String r3 = "onClick"
                    java.lang.String r4 = "(Landroid/view/View;)V"
                    r5 = r7
                    j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r8 = r7.f120297d
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0 r8 = r8.f120277f
                    com.tencent.mm.ui.widget.MMEditText r8 = r8.f120265z
                    r8.clearFocus()
                    boolean r8 = r7.f120298e
                    r0 = 0
                    if (r8 == 0) goto L_0x003d
                    te3.ny r8 = r7.f120299f
                    if (r8 == 0) goto L_0x0034
                    int r8 = r8.f138830j
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                    goto L_0x0035
                L_0x0034:
                    r8 = r0
                L_0x0035:
                    gy3.C87412m.m108591d(r8)
                    int r8 = r8.intValue()
                    goto L_0x0041
                L_0x003d:
                    te3.jf r8 = r7.f120300g
                    int r8 = r8.f136081o
                L_0x0041:
                    boolean r1 = r7.f120298e
                    if (r1 == 0) goto L_0x004e
                    te3.ny r1 = r7.f120299f
                    if (r1 == 0) goto L_0x004c
                    int r1 = r1.f138831n
                    goto L_0x0052
                L_0x004c:
                    r1 = r0
                    goto L_0x0056
                L_0x004e:
                    te3.jf r1 = r7.f120300g
                    int r1 = r1.f136082p
                L_0x0052:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                L_0x0056:
                    r2 = 1
                    if (r1 != 0) goto L_0x005a
                    goto L_0x0060
                L_0x005a:
                    int r3 = r1.intValue()
                    if (r3 == 0) goto L_0x006d
                L_0x0060:
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a r3 = r7.f120301h
                    android.widget.ImageView r3 = r3.f120284f
                    r4 = 2131755195(0x7f1000bb, float:1.9141262E38)
                    r3.setImageResource(r4)
                    int r8 = r8 + -1
                    goto L_0x0078
                L_0x006d:
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a r3 = r7.f120301h
                    android.widget.ImageView r3 = r3.f120284f
                    r4 = 2131755196(0x7f1000bc, float:1.9141264E38)
                    r3.setImageResource(r4)
                    int r8 = r8 + r2
                L_0x0078:
                    r3 = 0
                    if (r8 >= 0) goto L_0x007c
                    r8 = 0
                L_0x007c:
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a r4 = r7.f120301h
                    android.widget.TextView r4 = r4.f120280b
                    java.lang.String r5 = java.lang.String.valueOf(r8)
                    r4.setText(r5)
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a r4 = r7.f120301h
                    android.widget.TextView r4 = r4.f120280b
                    if (r8 <= 0) goto L_0x008f
                    r5 = 0
                    goto L_0x0091
                L_0x008f:
                    r5 = 8
                L_0x0091:
                    r4.setVisibility(r5)
                    te3.e6 r4 = new te3.e6
                    r4.<init>()
                    te3.jf r5 = r7.f120300g
                    int r6 = r5.f136074e
                    r4.f132715e = r6
                    java.lang.String r5 = r5.f136075f
                    r4.f132716f = r5
                    r4.f132718h = r2
                    boolean r5 = r7.f120298e
                    if (r5 == 0) goto L_0x00bf
                    te3.ny r5 = r7.f120299f
                    if (r5 == 0) goto L_0x00b3
                    int r0 = r5.f138827g
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L_0x00b3:
                    gy3.C87412m.m108591d(r0)
                    int r0 = r0.intValue()
                    r4.f132719i = r0
                    r0 = 2
                    r4.f132718h = r0
                L_0x00bf:
                    if (r1 != 0) goto L_0x00c2
                    goto L_0x00c8
                L_0x00c2:
                    int r0 = r1.intValue()
                    if (r0 == 0) goto L_0x00ca
                L_0x00c8:
                    r0 = 0
                    goto L_0x00cb
                L_0x00ca:
                    r0 = 1
                L_0x00cb:
                    r4.f132717g = r0
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r0 = r7.f120297d
                    com.tencent.mm.plugin.webview.ui.tools.widget.w0 r0 = r0.f120277f
                    r0.getClass()
                    int r5 = r0.f120248P
                    r4.f132720j = r5
                    int r5 = r0.f120249Q
                    r4.f132721n = r5
                    java.lang.String r5 = r0.f120246M
                    r4.f132714d = r5
                    int r5 = r0.f120250R
                    r4.f132723p = r5
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = ""
                    r5.append(r6)
                    int r6 = r0.f120253U
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    r4.f132724q = r5
                    int r5 = r0.f120251S
                    r4.f132722o = r5
                    ob0.c$b r5 = new ob0.c$b
                    r5.<init>()
                    r5.f127066a = r4
                    te3.f6 r4 = new te3.f6
                    r4.<init>()
                    r5.f127067b = r4
                    java.lang.String r4 = "/cgi-bin/mmbiz-bin/appmsg/appmsg_like_comment"
                    r5.f127068c = r4
                    r4 = 2759(0xac7, float:3.866E-42)
                    r5.f127069d = r4
                    r5.f127070e = r3
                    r5.f127071f = r3
                    java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r4 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
                    di3.d r4 = di3.C86312j.m106911c(r4)
                    com.tencent.mm.ipcinvoker.wx_extension.j r4 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r4
                    ob0.c r5 = r5.mo72403a()
                    com.tencent.mm.plugin.webview.ui.tools.widget.b1 r6 = new com.tencent.mm.plugin.webview.ui.tools.widget.b1
                    r6.<init>(r0)
                    r4.mo63014eH(r5, r6)
                    if (r1 != 0) goto L_0x012e
                    goto L_0x0134
                L_0x012e:
                    int r0 = r1.intValue()
                    if (r0 == 0) goto L_0x0139
                L_0x0134:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                    goto L_0x013d
                L_0x0139:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                L_0x013d:
                    boolean r1 = r7.f120298e
                    if (r1 == 0) goto L_0x0154
                    te3.ny r1 = r7.f120299f
                    if (r1 != 0) goto L_0x0146
                    goto L_0x014c
                L_0x0146:
                    int r0 = r0.intValue()
                    r1.f138831n = r0
                L_0x014c:
                    te3.ny r0 = r7.f120299f
                    if (r0 != 0) goto L_0x0151
                    goto L_0x0160
                L_0x0151:
                    r0.f138830j = r8
                    goto L_0x0160
                L_0x0154:
                    te3.jf r1 = r7.f120300g
                    int r0 = r0.intValue()
                    r1.f136082p = r0
                    te3.jf r0 = r7.f120300g
                    r0.f136081o = r8
                L_0x0160:
                    java.lang.String r8 = "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$showLikeStatus$1"
                    java.lang.String r0 = "android/view/View$OnClickListener"
                    java.lang.String r1 = "onClick"
                    java.lang.String r2 = "(Landroid/view/View;)V"
                    j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0.C44375i.C44378c.onClick(android.view.View):void");
            }
        }

        static {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59361q = C0966R.color.f3237k_;
            bVar.f59346b = true;
            bVar.f59354j = 120;
            bVar.f59355k = 120;
            bVar.f59369y = new C22908r(0);
            bVar.f59370z = new C22898h(0);
            bVar.f59364t = true;
            bVar.f59365u = (float) C76577a.m92151b(MMApplicationContext.getContext(), 3);
            f120274h = bVar.mo32666a();
        }

        public C44375i(Context context, LinkedList<C49983jf> linkedList, C44366w0 w0Var, boolean z) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(linkedList, "list");
            C87412m.m108594g(w0Var, "controller");
            this.f120275d = context;
            this.f120276e = linkedList;
            this.f120277f = w0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo69152a(com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0.C44375i.C44376a r9, te3.C49983jf r10, te3.C50608ny r11, boolean r12) {
            /*
                r8 = this;
                java.lang.String r0 = "itemView"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.String r0 = "info"
                gy3.C87412m.m108594g(r10, r0)
                r0 = 0
                if (r12 == 0) goto L_0x0014
                if (r11 == 0) goto L_0x0012
                int r1 = r11.f138832o
                goto L_0x0016
            L_0x0012:
                r1 = r0
                goto L_0x001a
            L_0x0014:
                int r1 = r10.f136080n
            L_0x0016:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            L_0x001a:
                if (r12 == 0) goto L_0x0023
                if (r11 == 0) goto L_0x0021
                int r2 = r11.f138830j
                goto L_0x0025
            L_0x0021:
                r2 = r0
                goto L_0x0029
            L_0x0023:
                int r2 = r10.f136081o
            L_0x0025:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L_0x0029:
                if (r12 == 0) goto L_0x0032
                if (r11 == 0) goto L_0x0030
                int r3 = r11.f138831n
                goto L_0x0034
            L_0x0030:
                r3 = r0
                goto L_0x0038
            L_0x0032:
                int r3 = r10.f136082p
            L_0x0034:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            L_0x0038:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "showLikeStatus content = "
                r4.append(r5)
                if (r12 == 0) goto L_0x004b
                if (r11 == 0) goto L_0x0049
                java.lang.String r5 = r11.f138824d
                goto L_0x004d
            L_0x0049:
                r5 = r0
                goto L_0x004d
            L_0x004b:
                java.lang.String r5 = r10.f136078i
            L_0x004d:
                r4.append(r5)
                java.lang.String r5 = ", isElected = "
                r4.append(r5)
                r4.append(r1)
                java.lang.String r5 = ", likeNum = "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r5 = ", likeStatus = "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "MicroMsg.MPMyCommentItemAdapter"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r4)
                android.widget.ImageView r4 = r9.f120284f
                r4.setOnClickListener(r0)
                r0 = 0
                r4 = 8
                if (r1 != 0) goto L_0x007c
                goto L_0x0092
            L_0x007c:
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x0092
                android.widget.TextView r10 = r9.f120286h
                r10.setVisibility(r0)
                android.widget.ImageView r10 = r9.f120284f
                r10.setVisibility(r4)
                android.widget.TextView r9 = r9.f120280b
                r9.setVisibility(r4)
                goto L_0x00e4
            L_0x0092:
                android.widget.TextView r1 = r9.f120286h
                r1.setVisibility(r4)
                android.widget.ImageView r1 = r9.f120284f
                r1.setVisibility(r0)
                android.widget.TextView r1 = r9.f120280b
                r1.setVisibility(r4)
                if (r2 == 0) goto L_0x00ba
                android.widget.TextView r1 = r9.f120280b
                int r5 = r2.intValue()
                if (r5 <= 0) goto L_0x00ac
                goto L_0x00ae
            L_0x00ac:
                r0 = 8
            L_0x00ae:
                r1.setVisibility(r0)
                android.widget.TextView r0 = r9.f120280b
                java.lang.String r1 = r2.toString()
                r0.setText(r1)
            L_0x00ba:
                if (r3 != 0) goto L_0x00bd
                goto L_0x00cc
            L_0x00bd:
                int r0 = r3.intValue()
                if (r0 != 0) goto L_0x00cc
                android.widget.ImageView r0 = r9.f120284f
                r1 = 2131755195(0x7f1000bb, float:1.9141262E38)
                r0.setImageResource(r1)
                goto L_0x00d4
            L_0x00cc:
                android.widget.ImageView r0 = r9.f120284f
                r1 = 2131755196(0x7f1000bc, float:1.9141264E38)
                r0.setImageResource(r1)
            L_0x00d4:
                android.widget.ImageView r0 = r9.f120284f
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$c r7 = new com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$c
                r1 = r7
                r2 = r8
                r3 = r12
                r4 = r11
                r5 = r10
                r6 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                r0.setOnClickListener(r7)
            L_0x00e4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0.C44375i.mo69152a(com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a, te3.jf, te3.ny, boolean):void");
        }

        public int getCount() {
            return this.f120276e.size();
        }

        public Object getItem(int i) {
            return (C49983jf) C110818d0.m150917O(this.f120276e, i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "viewGroup"
                r3 = r19
                gy3.C87412m.m108594g(r3, r2)
                r2 = 0
                r3 = 0
                if (r18 != 0) goto L_0x0026
                android.content.Context r4 = r0.f120275d
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                r5 = 2131496693(0x7f0c0ef5, float:1.8616958E38)
                android.view.View r4 = r4.inflate(r5, r2, r3)
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$b r5 = new com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$b
                r5.<init>(r0, r4)
                r4.setTag(r5)
                goto L_0x0034
            L_0x0026:
                java.lang.Object r4 = r18.getTag()
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout.MPMyCommentItemAdapter.BizCommentViewHolder"
                gy3.C87412m.m108592e(r4, r5)
                r5 = r4
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$b r5 = (com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0.C44375i.C44377b) r5
                r4 = r18
            L_0x0034:
                java.util.LinkedList<te3.jf> r6 = r0.f120276e
                java.lang.Object r6 = sx3.C110818d0.m150917O(r6, r1)
                te3.jf r6 = (te3.C49983jf) r6
                r7 = 8
                r8 = 1
                if (r6 == 0) goto L_0x0293
                java.lang.Class<ny.h> r9 = p629ny.C76979h.class
                gc0.a r10 = gc0.C20828a.m22825b()
                java.lang.String r11 = r6.f136077h
                android.widget.ImageView r12 = r5.f120289a
                hc0.c r13 = f120274h
                r10.mo32519h(r11, r12, r13)
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r10 = r5.f120296h
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a r11 = r5.f120293e
                r10.getClass()
                java.lang.String r12 = "itemView"
                gy3.C87412m.m108594g(r11, r12)
                di3.d r12 = di3.C86312j.m106911c(r9)
                ny.h r12 = (p629ny.C76979h) r12
                android.content.Context r13 = r10.f120275d
                java.lang.String r14 = r6.f136076g
                android.widget.TextView r15 = r11.f120279a
                float r15 = r15.getTextSize()
                android.text.SpannableString r12 = r12.yp0(r13, r14, r15)
                android.widget.TextView r13 = r11.f120279a
                r13.setText(r12)
                di3.d r12 = di3.C86312j.m106911c(r9)
                ny.h r12 = (p629ny.C76979h) r12
                android.content.Context r13 = r10.f120275d
                java.lang.String r14 = r6.f136078i
                com.tencent.neattextview.textview.view.NeatTextView r15 = r11.f120281c
                float r15 = r15.getTextSize()
                android.text.SpannableString r12 = r12.yp0(r13, r14, r15)
                com.tencent.neattextview.textview.view.NeatTextView r13 = r11.f120281c
                r13.mo104279b(r12)
                com.tencent.mm.ui.widget.imageview.WeImageView r12 = r11.f120282d
                android.content.Context r13 = r10.f120275d
                android.content.res.Resources r13 = r13.getResources()
                r14 = 2131099850(0x7f0600ca, float:1.7812065E38)
                int r13 = r13.getColor(r14)
                r12.setIconColor(r13)
                com.tencent.mm.ui.widget.imageview.WeImageView r12 = r11.f120282d
                r12.setVisibility(r3)
                android.widget.ImageView r12 = r11.f120283e
                r12.setVisibility(r3)
                com.tencent.mm.ui.widget.imageview.WeImageView r12 = r11.f120282d
                com.tencent.mm.plugin.webview.ui.tools.widget.y0 r13 = new com.tencent.mm.plugin.webview.ui.tools.widget.y0
                r13.<init>(r10, r6)
                r12.setOnClickListener(r13)
                r10.mo69152a(r11, r6, r2, r3)
                android.widget.ImageView r10 = r11.f120287i
                r10.setVisibility(r7)
                android.widget.ImageView r10 = r11.f120288j
                r11 = 4
                r10.setVisibility(r11)
                android.widget.TextView r10 = r5.f120294f
                r10.setVisibility(r7)
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r10 = r5.f120296h
                com.tencent.mm.plugin.webview.ui.tools.widget.w0 r10 = r10.f120277f
                int r12 = com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0.f120233Q0
                boolean r10 = r10.mo69125s()
                if (r10 == 0) goto L_0x0293
                android.widget.TextView r10 = r5.f120294f
                r10.setVisibility(r3)
                android.widget.TextView r10 = r5.f120294f
                com.tencent.mm.plugin.webview.ui.tools.widget.x0 r12 = new com.tencent.mm.plugin.webview.ui.tools.widget.x0
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r13 = r5.f120296h
                r12.<init>(r13, r6)
                r10.setOnClickListener(r12)
                java.util.ArrayList<android.view.View> r10 = r5.f120295g
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r12 = r5.f120296h
                java.util.Iterator r10 = r10.iterator()
            L_0x00ec:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x0105
                java.lang.Object r13 = r10.next()
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x00ec
                android.widget.LinearLayout r15 = r5.f120290b
                r15.removeView(r13)
                java.util.ArrayList<android.view.View> r15 = r12.f120278g
                r15.add(r13)
                goto L_0x00ec
            L_0x0105:
                java.util.ArrayList<android.view.View> r10 = r5.f120295g
                r10.clear()
                te3.oy r10 = r6.f136083q
                if (r10 == 0) goto L_0x0293
                java.util.LinkedList<te3.ny> r10 = r10.f139442d
                if (r10 == 0) goto L_0x0293
                int r10 = r10.size()
                if (r10 <= 0) goto L_0x0293
                te3.oy r10 = r6.f136083q
                java.util.LinkedList<te3.ny> r10 = r10.f139442d
                java.lang.String r12 = "replyList"
                gy3.C87412m.m108593f(r10, r12)
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i r12 = r5.f120296h
                java.util.Iterator r10 = r10.iterator()
                r13 = 0
            L_0x0128:
                boolean r15 = r10.hasNext()
                if (r15 == 0) goto L_0x0293
                java.lang.Object r15 = r10.next()
                int r11 = r13 + 1
                if (r13 < 0) goto L_0x028e
                te3.ny r15 = (te3.C50608ny) r15
                java.util.ArrayList<android.view.View> r13 = r12.f120278g
                int r13 = r13.size()
                if (r13 <= 0) goto L_0x014f
                java.util.ArrayList<android.view.View> r13 = r12.f120278g
                java.lang.Object r13 = r13.remove(r3)
                java.lang.String r7 = "viewPool.removeAt(0)"
                gy3.C87412m.m108593f(r13, r7)
                android.view.View r13 = (android.view.View) r13
                goto L_0x015d
            L_0x014f:
                android.content.Context r7 = r12.f120275d
                r13 = 2131496692(0x7f0c0ef4, float:1.8616956E38)
                android.view.View r13 = android.view.View.inflate(r7, r13, r2)
                java.lang.String r7 = "inflate(context, R.layou…mment_content_item, null)"
                gy3.C87412m.m108593f(r13, r7)
            L_0x015d:
                java.util.ArrayList<android.view.View> r7 = r5.f120295g
                r7.add(r13)
                android.widget.LinearLayout r7 = r5.f120290b
                r7.addView(r13)
                java.lang.String r7 = "reply"
                gy3.C87412m.m108593f(r15, r7)
                com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a r7 = new com.tencent.mm.plugin.webview.ui.tools.widget.w0$i$a
                r7.<init>(r12, r13)
                com.tencent.mm.plugin.webview.ui.tools.widget.a1 r13 = new com.tencent.mm.plugin.webview.ui.tools.widget.a1
                r13.<init>(r7, r12, r6)
                java.lang.String r2 = r6.f136075f
                java.lang.String r3 = r15.f138825e
                boolean r2 = gy3.C87412m.m108589b(r2, r3)
                if (r2 != r8) goto L_0x01f0
                int r2 = r15.f138833p
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r2 = r13.invoke(r2)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0250
                android.widget.TextView r2 = r7.f120279a
                di3.d r3 = di3.C86312j.m106911c(r9)
                ny.h r3 = (p629ny.C76979h) r3
                android.content.Context r13 = r12.f120275d
                java.lang.String r8 = r6.f136076g
                android.widget.TextView r14 = r7.f120279a
                float r14 = r14.getTextSize()
                android.text.SpannableString r3 = r3.yp0(r13, r8, r14)
                r2.setText(r3)
                com.tencent.neattextview.textview.view.NeatTextView r2 = r7.f120281c
                di3.d r3 = di3.C86312j.m106911c(r9)
                ny.h r3 = (p629ny.C76979h) r3
                android.content.Context r8 = r12.f120275d
                java.lang.String r13 = r15.f138824d
                com.tencent.neattextview.textview.view.NeatTextView r14 = r7.f120281c
                float r14 = r14.getTextSize()
                android.text.SpannableString r3 = r3.yp0(r8, r13, r14)
                r2.mo104279b(r3)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = r7.f120282d
                android.content.Context r3 = r12.f120275d
                android.content.res.Resources r3 = r3.getResources()
                r8 = 2131099850(0x7f0600ca, float:1.7812065E38)
                int r3 = r3.getColor(r8)
                r2.setIconColor(r3)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = r7.f120282d
                r3 = 0
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r7.f120283e
                r2.setVisibility(r3)
                r2 = 1
                r12.mo69152a(r7, r6, r15, r2)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = r7.f120282d
                com.tencent.mm.plugin.webview.ui.tools.widget.z0 r3 = new com.tencent.mm.plugin.webview.ui.tools.widget.z0
                r3.<init>(r12, r6, r15)
                r2.setOnClickListener(r3)
                goto L_0x0250
            L_0x01f0:
                r8 = 2131099850(0x7f0600ca, float:1.7812065E38)
                int r2 = r15.f138833p
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r2 = r13.invoke(r2)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0250
                android.widget.TextView r2 = r7.f120279a
                di3.d r3 = di3.C86312j.m106911c(r9)
                ny.h r3 = (p629ny.C76979h) r3
                android.content.Context r13 = r12.f120275d
                android.content.res.Resources r14 = r13.getResources()
                r8 = 2131833052(0x7f1130dc, float:1.9299175E38)
                java.lang.String r8 = r14.getString(r8)
                android.widget.TextView r14 = r7.f120279a
                float r14 = r14.getTextSize()
                android.text.SpannableString r3 = r3.yp0(r13, r8, r14)
                r2.setText(r3)
                com.tencent.neattextview.textview.view.NeatTextView r2 = r7.f120281c
                di3.d r3 = di3.C86312j.m106911c(r9)
                ny.h r3 = (p629ny.C76979h) r3
                android.content.Context r8 = r12.f120275d
                java.lang.String r13 = r15.f138824d
                com.tencent.neattextview.textview.view.NeatTextView r14 = r7.f120281c
                float r14 = r14.getTextSize()
                android.text.SpannableString r3 = r3.yp0(r8, r13, r14)
                r2.mo104279b(r3)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = r7.f120282d
                r3 = 8
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r7.f120283e
                r2.setVisibility(r3)
                r2 = 1
                r12.mo69152a(r7, r6, r15, r2)
            L_0x0250:
                android.widget.ImageView r2 = r7.f120287i
                r3 = 0
                r2.setVisibility(r3)
                android.widget.ImageView r2 = r7.f120288j
                r3 = 4
                r2.setVisibility(r3)
                te3.oy r2 = r6.f136083q
                java.util.LinkedList<te3.ny> r2 = r2.f139442d
                int r2 = r2.size()
                if (r11 >= r2) goto L_0x0282
                android.widget.ImageView r2 = r7.f120288j
                java.lang.String r7 = r15.f138825e
                te3.oy r8 = r6.f136083q
                java.util.LinkedList<te3.ny> r8 = r8.f139442d
                java.lang.Object r8 = r8.get(r11)
                te3.ny r8 = (te3.C50608ny) r8
                java.lang.String r8 = r8.f138825e
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                if (r7 == 0) goto L_0x027e
                r7 = 0
                goto L_0x027f
            L_0x027e:
                r7 = 4
            L_0x027f:
                r2.setVisibility(r7)
            L_0x0282:
                r13 = r11
                r2 = 0
                r3 = 0
                r7 = 8
                r8 = 1
                r11 = 4
                r14 = 2131099850(0x7f0600ca, float:1.7812065E38)
                goto L_0x0128
            L_0x028e:
                sx3.C64197v.m75542k()
                r1 = 0
                throw r1
            L_0x0293:
                int r2 = r16.getCount()
                r3 = 1
                int r2 = r2 - r3
                if (r1 != r2) goto L_0x02a7
                android.widget.LinearLayout r1 = r5.f120292d
                r2 = 0
                r1.setVisibility(r2)
                com.tencent.mm.plugin.webview.ui.tools.widget.w0 r1 = r0.f120277f
                r1.getAppMsgCommentList()
                goto L_0x02ae
            L_0x02a7:
                android.widget.LinearLayout r1 = r5.f120292d
                r2 = 8
                r1.setVisibility(r2)
            L_0x02ae:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0.C44375i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$j */
    public interface C44379j {
        void onHide();

        void onShow();
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$k */
    public static final class C44380k implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C44366w0 f120302a;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$k$a */
        public static final class C44381a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C44366w0 f120303d;

            /* renamed from: e */
            public final /* synthetic */ int f120304e;

            /* renamed from: f */
            public final /* synthetic */ int f120305f;

            /* renamed from: g */
            public final /* synthetic */ String f120306g;

            /* renamed from: h */
            public final /* synthetic */ C47350c f120307h;

            public C44381a(C44366w0 w0Var, int i, int i2, String str, C47350c cVar) {
                this.f120303d = w0Var;
                this.f120304e = i;
                this.f120305f = i2;
                this.f120306g = str;
                this.f120307h = cVar;
            }

            public final void run() {
                C89779i0 i0Var = this.f120303d.getWebView().f118510Z1;
                if (i0Var != null && i0Var.isShowing()) {
                    i0Var.dismiss();
                }
                if (this.f120303d.getWeakThis$plugin_webview_release().get() != null) {
                    C44366w0 w0Var = this.f120303d.getWeakThis$plugin_webview_release().get();
                    C87412m.m108592e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
                    C44366w0 w0Var2 = w0Var;
                    int i = this.f120304e;
                    int i2 = this.f120305f;
                    String str = this.f120306g;
                    C47350c cVar = this.f120307h;
                    C87412m.m108593f(cVar, "rr");
                    String str2 = null;
                    boolean z = false;
                    if (i2 == 0 || Util.isNullOrNil(str)) {
                        C47465a aVar = cVar.f127055a.f127080a;
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgOperateCommentReq");
                        C49519g6 g6Var = (C49519g6) aVar;
                        if (i == 0 && i2 == 0) {
                            int i3 = g6Var.f133877g;
                            if (i3 == 1) {
                                C76912y0.m92768g(w0Var2.getContext(), w0Var2.getContext().getString(C0966R.string.are));
                                w0Var2.f120265z.setText("");
                                w0Var2.f120256p0 = 0;
                                w0Var2.getAppMsgCommentList();
                            } else if (i3 == 3) {
                                C76912y0.m92768g(w0Var2.getContext(), w0Var2.getContext().getString(C0966R.string.arf));
                                w0Var2.mo69119n(true);
                                w0Var2.f120265z.setText("");
                                w0Var2.f120256p0 = 0;
                                w0Var2.getAppMsgCommentList();
                            } else if (i3 != 4) {
                                C44375i iVar = w0Var2.f120240G;
                                if (iVar != null) {
                                    Iterator<C49983jf> it = iVar.f120276e.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        C49983jf next = it.next();
                                        if (g6Var.f133878h == next.f136074e) {
                                            str2 = next.f136075f;
                                            iVar.f120276e.remove(next);
                                            iVar.notifyDataSetChanged();
                                            break;
                                        }
                                    }
                                }
                                String str3 = str2;
                                C44375i iVar2 = w0Var2.f120240G;
                                if (iVar2 != null && iVar2.getCount() == 0) {
                                    z = true;
                                }
                                if (z) {
                                    w0Var2.mo69138t();
                                }
                                C48590l lVar = w0Var2.f120257t.f118508Z;
                                if (lVar != null) {
                                    lVar.mo73220Q("deleteComment", g6Var.f133878h, str3, 0, 0);
                                }
                                w0Var2.mo69119n(true);
                            } else {
                                C44375i iVar3 = w0Var2.f120240G;
                                if (iVar3 != null) {
                                    Iterator<C49983jf> it4 = iVar3.f120276e.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        C49983jf next2 = it4.next();
                                        if (g6Var.f133878h == next2.f136074e) {
                                            String str4 = next2.f136075f;
                                            LinkedList<C50608ny> linkedList = next2.f136083q.f139442d;
                                            C87412m.m108593f(linkedList, "comment.reply.reply_list");
                                            for (C50608ny nyVar : linkedList) {
                                                if (nyVar.f138827g == g6Var.f133886s) {
                                                    nyVar.f138833p = 1;
                                                }
                                            }
                                            str2 = str4;
                                        }
                                    }
                                    iVar3.notifyDataSetChanged();
                                }
                                String str5 = str2;
                                C44375i iVar4 = w0Var2.f120240G;
                                if (iVar4 != null && iVar4.getCount() == 0) {
                                    z = true;
                                }
                                if (z) {
                                    w0Var2.mo69138t();
                                }
                                C48590l lVar2 = w0Var2.f120257t.f118508Z;
                                if (lVar2 != null) {
                                    lVar2.mo73220Q("deleteCommentReply", g6Var.f133878h, str5, g6Var.f133886s, 0);
                                }
                                w0Var2.mo69119n(true);
                            }
                            w0Var2.f120265z.clearFocus();
                        } else if (g6Var.f133877g == 1) {
                            C76879j.m92726T(w0Var2.getContext(), w0Var2.getContext().getString(C0966R.string.arc, new Object[]{Integer.valueOf(i2)}));
                            if (i == 2) {
                                C8866a.m8686c(11);
                            } else {
                                C8866a.m8686c(12);
                            }
                        } else {
                            C76879j.m92726T(w0Var2.getContext(), w0Var2.getContext().getString(C0966R.string.aqw, new Object[]{Integer.valueOf(i2)}));
                            if (i == 2) {
                                C8866a.m8686c(14);
                            } else {
                                C8866a.m8686c(15);
                            }
                        }
                    } else {
                        C76879j.m92754y(w0Var2.getContext(), str, "", w0Var2.getContext().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                        Button button = w0Var2.f120263y;
                        if (i2 != 60005) {
                            z = true;
                        }
                        button.setEnabled(z);
                    }
                }
            }
        }

        public C44380k(C44366w0 w0Var) {
            this.f120302a = w0Var;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            MMHandlerThread.postToMainThread(new C44381a(this.f120302a, i, i2, str, cVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$l */
    public static final class C44382l implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C44366w0 f120308a;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$l$a */
        public static final class C44383a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C44366w0 f120309d;

            /* renamed from: e */
            public final /* synthetic */ C47350c f120310e;

            public C44383a(C44366w0 w0Var, C47350c cVar) {
                this.f120309d = w0Var;
                this.f120310e = cVar;
            }

            public final void run() {
                C89779i0 i0Var = this.f120309d.getWebView().f118510Z1;
                if (i0Var != null && i0Var.isShowing()) {
                    i0Var.dismiss();
                }
                if (this.f120309d.getWeakThis$plugin_webview_release().get() != null) {
                    C44366w0 w0Var = this.f120309d.getWeakThis$plugin_webview_release().get();
                    C87412m.m108592e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
                    C44366w0 w0Var2 = w0Var;
                    C47350c cVar = this.f120310e;
                    C87412m.m108593f(cVar, "rr");
                    C47465a aVar = cVar.f127055a.f127080a;
                    if ((aVar instanceof C52218z5) && (cVar.f127056b.f127083a instanceof C48670a6)) {
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListReq");
                        C52218z5 z5Var = (C52218z5) aVar;
                        C47465a aVar2 = cVar.f127056b.f127083a;
                        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListResp");
                        C48670a6 a6Var = (C48670a6) aVar2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("url_info size is ");
                        LinkedList<C49983jf> linkedList = a6Var.f130324d;
                        sb.append(linkedList != null ? linkedList.size() : 0);
                        Log.m105924i("MicroMsg.MPWriteCommentLayout", sb.toString());
                        if (z5Var.f145699f == 2) {
                            int i = w0Var2.f120256p0;
                            w0Var2.f120256p0 = a6Var.f130328h;
                            boolean z = i == 0;
                            if (!w0Var2.f120242I) {
                                if (Util.isNullOrNil((List) a6Var.f130324d)) {
                                    w0Var2.mo69138t();
                                } else {
                                    w0Var2.f120236C.setBackgroundColor(w0Var2.getResources().getColor(C0966R.color.BW_97));
                                    w0Var2.f120237D.setVisibility(0);
                                    C44375i iVar = w0Var2.f120240G;
                                    if (iVar == null) {
                                        Context context = w0Var2.getContext();
                                        C87412m.m108593f(context, "context");
                                        LinkedList<C49983jf> linkedList2 = a6Var.f130324d;
                                        C87412m.m108593f(linkedList2, "resp.comment");
                                        C44375i iVar2 = new C44375i(context, linkedList2, w0Var2, w0Var2.f120258u);
                                        w0Var2.f120240G = iVar2;
                                        w0Var2.f120234A.setAdapter(iVar2);
                                    } else {
                                        LinkedList<C49983jf> linkedList3 = a6Var.f130324d;
                                        C87412m.m108593f(linkedList3, "resp.comment");
                                        Log.m105924i("MicroMsg.MPMyCommentItemAdapter", "update: " + linkedList3.size());
                                        if (z) {
                                            iVar.f120276e.clear();
                                            iVar.f120276e.addAll(linkedList3);
                                        } else {
                                            iVar.f120276e.addAll(linkedList3);
                                        }
                                        iVar.notifyDataSetChanged();
                                    }
                                }
                            }
                            LinkedList<C49983jf> linkedList4 = a6Var.f130324d;
                            if (linkedList4 == null || linkedList4.size() <= 0 || w0Var2.f120244K != 0) {
                                w0Var2.postDelayed(new C44253e1(w0Var2), 10);
                            }
                        }
                    }
                }
            }
        }

        public C44382l(C44366w0 w0Var) {
            this.f120308a = w0Var;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            C44366w0 w0Var = this.f120308a;
            w0Var.f120255W = false;
            MMHandlerThread.postToMainThread(new C44383a(w0Var, cVar));
            if (i == 2) {
                C8866a.m8686c(8);
            } else if (i != 0) {
                C8866a.m8686c(9);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.w0$m */
    public static final class C44384m extends C87413o implements C32224a<MPSmileyFooter> {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f120311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44384m(C44366w0 w0Var) {
            super(0);
            this.f120311d = w0Var;
        }

        public Object invoke() {
            View findViewById = this.f120311d.findViewById(C0966R.C0970id.h0l);
            C44366w0 w0Var = this.f120311d;
            MPSmileyFooter mPSmileyFooter = (MPSmileyFooter) findViewById;
            mPSmileyFooter.setExtraAddHeight(w0Var.getNavHeightByDisplay());
            mPSmileyFooter.setFobbidenWhenLandscape(true);
            boolean z = w0Var.f120258u;
            WeImageView weImageView = (WeImageView) ((ViewGroup) C85868k2.m106137b(mPSmileyFooter.f119807f).inflate(C0966R.C0971layout.bgt, mPSmileyFooter)).findViewById(C0966R.C0970id.f5704mb);
            mPSmileyFooter.f119810i = weImageView;
            weImageView.setOnClickListener(new C44362u0(mPSmileyFooter));
            SmileyPanel c = C78160t0.m94372c(mPSmileyFooter.f119807f, z);
            mPSmileyFooter.f119808g = c;
            if (c == null) {
                mPSmileyFooter.f119808g = new C72834u0(mPSmileyFooter.f119807f);
            } else {
                c.setEntranceScene(2);
                mPSmileyFooter.f119808g.setVisibility(8);
                mPSmileyFooter.f119811j = (LinearLayout) mPSmileyFooter.findViewById(C0966R.C0970id.jnt);
                LinearLayout linearLayout = (LinearLayout) mPSmileyFooter.findViewById(C0966R.C0970id.f358764gy1);
                mPSmileyFooter.f119811j.setOnClickListener((View.OnClickListener) null);
                int validPanelHeight = KeyBoardUtil.getValidPanelHeight(mPSmileyFooter.getContext());
                mPSmileyFooter.f119813o = validPanelHeight;
                mPSmileyFooter.f119811j.addView(mPSmileyFooter.f119808g, -1, validPanelHeight);
                mPSmileyFooter.f119808g.mo100191d();
                mPSmileyFooter.f119808g.mo100197i();
                mPSmileyFooter.mo68902e();
                mPSmileyFooter.f119808g.setOnTextOperationListener(new C44364v0(mPSmileyFooter));
            }
            return mPSmileyFooter;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44366w0(WebViewUI webViewUI, boolean z, Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(webViewUI, "webView");
        C87412m.m108594g(context, "context");
        this.f120257t = webViewUI;
        this.f120258u = z;
        View inflate = View.inflate(context, C0966R.C0971layout.bgx, this);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout");
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = (WebViewKeyboardLinearLayout) inflate;
        this.f120259v = webViewKeyboardLinearLayout;
        View findViewById = findViewById(C0966R.C0970id.h0q);
        C87412m.m108593f(findViewById, "findViewById(R.id.mp_video_comment_action_layout)");
        this.f120260w = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.h0r);
        C87412m.m108593f(findViewById2, "findViewById(R.id.mp_video_comment_cancel)");
        WeImageView weImageView = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.h0t);
        C87412m.m108593f(findViewById3, "findViewById(R.id.mp_video_comment_ok)");
        Button button = (Button) findViewById3;
        this.f120263y = button;
        View findViewById4 = findViewById(C0966R.C0970id.h0s);
        C87412m.m108593f(findViewById4, "findViewById(R.id.mp_video_comment_et)");
        MMEditText mMEditText = (MMEditText) findViewById4;
        this.f120265z = mMEditText;
        View findViewById5 = findViewById(C0966R.C0970id.af_);
        C87412m.m108593f(findViewById5, "findViewById(R.id.biz_video_my_comment_list)");
        this.f120234A = (ListView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.h15);
        C87412m.m108593f(findViewById6, "findViewById(R.id.mp_write_comment_root)");
        this.f120235B = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.f358780h14);
        C87412m.m108593f(findViewById7, "findViewById(R.id.mp_vid…rite_comment_scroll_view)");
        this.f120236C = findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.afa);
        C87412m.m108593f(findViewById8, "findViewById(R.id.biz_video_my_comment_tv)");
        this.f120237D = (TextView) findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.h0v);
        C87412m.m108593f(findViewById9, "findViewById(R.id.mp_video_my_comment_title)");
        this.f120238E = (TextView) findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.afb);
        C87412m.m108593f(findViewById10, "findViewById(R.id.biz_video_reply_tip)");
        TextView textView = (TextView) findViewById10;
        this.f120239F = textView;
        this.f120241H = -1;
        this.f120246M = "";
        this.f120247N = "";
        this.f120254V = new WeakReference<>(this);
        getSayFooter().setMMEditText(mMEditText);
        getSayFooter().setVisibility(8);
        mMEditText.setOnClickListener(new C44367a(this));
        mMEditText.setOnLongClickListener(new C44368b(this));
        webViewKeyboardLinearLayout.setOnTouchListener(new C44369c(this));
        findViewById6.setOnClickListener(C44370d.f120269d);
        int rootHeight = getRootHeight();
        if (rootHeight > 0) {
            ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = rootHeight;
            findViewById6.setLayoutParams(layoutParams);
        }
        if (!KeyBoardUtil.isPortOrientation(context)) {
            mo69120o(2);
        }
        weImageView.setOnClickListener(new C44371e(this));
        button.setOnClickListener(new C44372f(this));
        mMEditText.addTextChangedListener(new C44373g(this));
        Editable text = mMEditText.getText();
        C87412m.m108593f(text, "contentEt.text");
        button.setEnabled(text.length() > 0);
        mMEditText.setOnTouchListener(new C44374h(this));
        textView.setVisibility(8);
    }

    /* renamed from: e */
    public static final void m48736e(C44366w0 w0Var) {
        w0Var.f120265z.requestFocus();
        Log.m105918d("MicroMsg.MPWriteCommentLayout", "request fouces");
        if (w0Var.getSayFooter().mo68901d()) {
            MPSmileyFooter sayFooter = w0Var.getSayFooter();
            sayFooter.f119808g.mo100196h();
            sayFooter.f119808g.setVisibility(8);
            sayFooter.setVisibility(8);
        }
        if (!KeyBoardUtil.isPortOrientation(w0Var.getContext())) {
            MPSmileyFooter sayFooter2 = w0Var.getSayFooter();
            if (!sayFooter2.mo68901d()) {
                sayFooter2.setVisibility(8);
            }
        }
        w0Var.f120235B.postInvalidate();
    }

    /* access modifiers changed from: private */
    public final int getNavHeightByDisplay() {
        Point b = C75044y4.m89990b(getContext());
        Window window = this.f120257t.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        Rect rect = new Rect();
        if (decorView != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.bottom;
        int keyBoardHeight = (b.y - i) - this.f120259v.getKeyBoardHeight();
        Log.m105926v("MicroMsg.MPWriteCommentLayout", "getNavHeightByDisplay screenHeight = " + i + ", realSize = " + b.y);
        if (keyBoardHeight < 0) {
            keyBoardHeight = C75044y4.m89991c(getContext());
            Log.m105926v("MicroMsg.MPWriteCommentLayout", "getNavHeightByDisplay error");
        }
        Log.m105927v("MicroMsg.MPWriteCommentLayout", "getNavHeightByDisplay h = %s", Integer.valueOf(keyBoardHeight));
        return keyBoardHeight;
    }

    private final int getReplyHeight() {
        if (this.f120244K != 0) {
            return C76577a.m92151b(getContext(), 38);
        }
        return 0;
    }

    private final int getRootHeight() {
        return C76577a.m92151b(getContext(), C28613b.CTRL_INDEX);
    }

    /* access modifiers changed from: private */
    public final MPSmileyFooter getSayFooter() {
        Object value = ((C36570n) this.f120261x).getValue();
        C87412m.m108593f(value, "<get-sayFooter>(...)");
        return (MPSmileyFooter) value;
    }

    /* renamed from: i */
    public static final void m48737i(C44366w0 w0Var, int i) {
        if (i <= 0) {
            w0Var.getClass();
        } else if (KeyBoardUtil.getScreenOrientation(w0Var.getContext()) != 2) {
            w0Var.mo69117l(i);
        }
    }

    private final void setRootHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f120235B.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = mo69118m(i);
        this.f120235B.setLayoutParams(layoutParams);
        int i2 = layoutParams.height;
        if (KeyBoardUtil.isPortOrientation(getContext())) {
            this.f120243J = i2;
        }
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("MPWriteCommentLayout");
        singleMMKV.encode("MPWriteCommentRootHeight", i2);
        singleMMKV.apply();
    }

    public final void getAppMsgCommentList() {
        C52218z5 z5Var = new C52218z5();
        z5Var.f145697d = this.f120246M;
        if (!this.f120255W) {
            int i = this.f120256p0;
            z5Var.f145698e = i;
            if (i == -1) {
                Log.m105924i("MicroMsg.MPWriteCommentLayout", "no more my comment");
                return;
            }
            this.f120255W = true;
            z5Var.f145699f = 2;
            z5Var.f145700g = this.f120248P;
            z5Var.f145701h = this.f120249Q;
            z5Var.f145703j = this.f120250R;
            z5Var.f145704n = "" + this.f120253U;
            z5Var.f145702i = this.f120251S;
            z5Var.f145705o = this.f120252T;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = z5Var;
            bVar.f127067b = new C48670a6();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_comment_list";
            bVar.f127069d = 2866;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C44382l(this));
            C8866a.m8686c(7);
        }
    }

    public final C44379j getCallback() {
        return null;
    }

    public final long getCommentTopicId() {
        return this.f120252T;
    }

    public final int getEnterId() {
        return this.f120251S;
    }

    public final int getItemShowType() {
        return this.f120250R;
    }

    public final int getMinHeaderHeight() {
        return this.f120245L;
    }

    public final int getMyCommentOffset() {
        return this.f120256p0;
    }

    public final int getScene() {
        return this.f120248P;
    }

    public final int getSubScene() {
        return this.f120249Q;
    }

    public final int getTimeLineSessionId() {
        return this.f120253U;
    }

    public final String getTitle() {
        return this.f120247N;
    }

    public final String getUrl() {
        return this.f120246M;
    }

    public final WeakReference<C44366w0> getWeakThis$plugin_webview_release() {
        return this.f120254V;
    }

    public final WebViewUI getWebView() {
        return this.f120257t;
    }

    /* renamed from: l */
    public final void mo69117l(int i) {
        ViewGroup.LayoutParams layoutParams = this.f120235B.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int height = i + this.f120265z.getHeight() + this.f120260w.getHeight() + getNavHeightByDisplay() + C76577a.m92151b(getContext(), C76577a.m92152c(getContext(), 60) + 16) + getReplyHeight();
        layoutParams.height = height;
        layoutParams.height = mo69118m(height);
        this.f120235B.setLayoutParams(layoutParams);
        int i2 = layoutParams.height;
        if (KeyBoardUtil.isPortOrientation(getContext())) {
            this.f120243J = i2;
        }
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("MPWriteCommentLayout");
        singleMMKV.encode("MPWriteCommentRootHeight", i2);
        singleMMKV.apply();
    }

    /* renamed from: m */
    public final int mo69118m(int i) {
        int f = C75044y4.m89994f(getContext());
        int i2 = C75044y4.m89990b(getContext()).y;
        int i3 = i2 - f;
        if (i > i3) {
            return i3;
        }
        if (this.f120245L <= 0) {
            return i;
        }
        int b = C76577a.m92151b(getContext(), 20);
        int i4 = this.f120245L;
        return i < ((i2 - i4) - f) + b ? (i3 - i4) + b : i;
    }

    /* renamed from: n */
    public final void mo69119n(boolean z) {
        if (this.f120244K != 0) {
            this.f120244K = 0;
            if (z) {
                mo69120o(KeyBoardUtil.getScreenOrientation(getContext()));
            }
        }
        this.f120239F.setText("");
        this.f120239F.setVisibility(8);
        this.f120265z.setHint(getContext().getString(C0966R.string.ard));
        this.f120238E.setText(getContext().getString(C0966R.string.arb));
    }

    /* renamed from: o */
    public final void mo69120o(int i) {
        if (i == 2) {
            setRootHeight(C75044y4.m89990b(getContext()).y - C75044y4.m89994f(getContext()));
            this.f120265z.setMinLines(3);
            return;
        }
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f120259v;
        if (webViewKeyboardLinearLayout.f118382n) {
            mo69117l(webViewKeyboardLinearLayout.getKeyBoardHeight());
        } else {
            int i2 = this.f120243J;
            if (i2 != 0) {
                setRootHeight(i2);
            } else {
                mo69117l(0);
            }
        }
        this.f120265z.setMinLines(5);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo69120o(configuration.orientation);
        if (getSayFooter().mo68901d()) {
            MPSmileyFooter sayFooter = getSayFooter();
            sayFooter.f119808g.mo100196h();
            sayFooter.f119808g.setVisibility(8);
            sayFooter.setVisibility(8);
        }
    }

    /* renamed from: p */
    public final void mo69122p(C49519g6 g6Var) {
        C87412m.m108594g(g6Var, "req");
        g6Var.f133880j = this.f120248P;
        g6Var.f133881n = this.f120249Q;
        g6Var.f133874d = this.f120246M;
        g6Var.f133879i = this.f120247N;
        g6Var.f133876f = System.currentTimeMillis();
        g6Var.f133883p = this.f120250R;
        g6Var.f133884q = "" + this.f120253U;
        g6Var.f133882o = this.f120251S;
        g6Var.f133885r = this.f120252T;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = g6Var;
        bVar.f127067b = new C49663h6();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_operate_comment";
        bVar.f127069d = 2617;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C44380k(this));
        WebViewUI webViewUI = this.f120257t;
        C45588e eVar = C45588e.f123306a;
        String string = getContext().getString(C0966R.string.a4d);
        C87412m.m108593f(string, "context.getString(com.te…mui.R.string.app_waiting)");
        Context context = getContext();
        C87412m.m108593f(context, "context");
        webViewUI.f118510Z1 = eVar.mo71111a(string, context, this.f120257t.f118510Z1);
    }

    /* renamed from: q */
    public final void mo69123q(int i) {
        String queryParameter = Uri.parse(this.f120246M).getQueryParameter("clicktime");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f120246M);
        sb.append(",");
        sb.append(this.f120248P);
        sb.append(",");
        if (Util.isNullOrNil(queryParameter)) {
            queryParameter = "";
        }
        sb.append(queryParameter);
        sb.append(",");
        sb.append(i);
        sb.append(",");
        sb.append(System.currentTimeMillis());
        String sb4 = sb.toString();
        Log.m105926v("MicroMsg.MPWriteCommentLayout", sb4);
        C115669n.INSTANCE.kvStat(19265, sb4);
    }

    /* renamed from: r */
    public final void mo69124r() {
        if (getVisibility() == 0) {
            if (getSayFooter().mo68901d()) {
                MPSmileyFooter sayFooter = getSayFooter();
                sayFooter.f119808g.mo100196h();
                sayFooter.f119808g.setVisibility(8);
                sayFooter.setVisibility(8);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(150);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new C44244c1(this));
            this.f120235B.clearAnimation();
            this.f120235B.startAnimation(translateAnimation);
            this.f120257t.hideVKB();
            this.f120256p0 = 0;
            C44375i iVar = this.f120240G;
            if (iVar != null) {
                iVar.f120276e.clear();
                iVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: s */
    public final boolean mo69125s() {
        if (!this.f120262x0) {
            this.f120264y0 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_comment_reply, 1) == 1;
            this.f120262x0 = true;
            Log.m105926v("MicroMsg.MPWriteCommentLayout", "isReplyOpen = " + this.f120264y0);
        }
        return this.f120264y0;
    }

    public final void setCallback(C44379j jVar) {
    }

    public final void setCommentTopicId(long j) {
        this.f120252T = j;
    }

    public final void setEnterId(int i) {
        this.f120251S = i;
    }

    public final void setItemShowType(int i) {
        this.f120250R = i;
    }

    public final void setMinHeaderHeight(int i) {
        this.f120245L = i;
    }

    public final void setMyCommentOffset(int i) {
        this.f120256p0 = i;
    }

    public final void setScene(int i) {
        this.f120248P = i;
    }

    public final void setSubScene(int i) {
        this.f120249Q = i;
    }

    public final void setTimeLineSessionId(int i) {
        this.f120253U = i;
    }

    public final void setTitle(String str) {
        this.f120247N = str;
    }

    public final void setUrl(String str) {
        this.f120246M = str;
    }

    public final void setWeakThis$plugin_webview_release(WeakReference<C44366w0> weakReference) {
        C87412m.m108594g(weakReference, "<set-?>");
        this.f120254V = weakReference;
    }

    /* renamed from: t */
    public final void mo69138t() {
        View view = this.f120236C;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0966R.attr.f2745h6, typedValue, true);
        view.setBackgroundColor(C111105a.m151500b(context, typedValue.resourceId));
        this.f120237D.setVisibility(8);
    }

    /* renamed from: v */
    public final void mo69139v() {
        if (this.f120241H == -3) {
            this.f120257t.hideVKB();
            return;
        }
        MPSmileyFooter sayFooter = getSayFooter();
        boolean z = false;
        if (sayFooter.mo68901d() || sayFooter.getVisibility() == 0) {
            if (getVisibility() == 0) {
                z = true;
            }
            if (z) {
                MPSmileyFooter sayFooter2 = getSayFooter();
                sayFooter2.f119808g.mo100196h();
                sayFooter2.f119808g.setVisibility(8);
                sayFooter2.setVisibility(8);
                return;
            }
        }
        mo69124r();
    }

    /* renamed from: w */
    public final void mo69140w(String str, int i, boolean z) {
        C87412m.m108594g(str, "replyContent");
        this.f120244K = i;
        this.f120238E.setText(getContext().getString(C0966R.string.f360180an2));
        this.f120239F.setVisibility(0);
        TextView textView = this.f120239F;
        Context context = getContext();
        Object[] objArr = new Object[1];
        if (Util.isNullOrNil(str)) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(context.getString(C0966R.string.f360179an1, objArr));
        this.f120265z.setHint(getContext().getString(C0966R.string.f360178an0));
        if (z) {
            this.f120236C.scrollTo(0, 0);
            this.f120265z.requestFocus();
            Object systemService = getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(this.f120265z, 0);
        }
    }

    /* renamed from: x */
    public final void mo69141x(boolean z) {
        this.f120242I = z;
        this.f120235B.clearAnimation();
        setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250);
        translateAnimation.setFillAfter(false);
        this.f120235B.clearAnimation();
        this.f120235B.startAnimation(translateAnimation);
        if (z) {
            this.f120237D.setVisibility(8);
            this.f120238E.setText(getContext().getString(C0966R.string.f360198ar2));
            this.f120265z.setHint(C0966R.string.ar4);
            this.f120263y.setText(C0966R.string.a2s);
            this.f120263y.setBackground(getContext().getResources().getDrawable(C0966R.C0969drawable.f4623i2));
            this.f120265z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200)});
            return;
        }
        getAppMsgCommentList();
        this.f120263y.setText(C0966R.string.aqu);
        Button button = this.f120263y;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0966R.attr.f2744h5, typedValue, true);
        int i = typedValue.resourceId;
        Object obj = C111105a.f332697a;
        button.setBackground(C111105a.C111110c.m151511b(context, i));
    }
}
