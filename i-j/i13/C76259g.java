package i13;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.MMBottomSheetBehavior;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.C103422m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.plugin.transvoice.p324ui.TransVoicePanelLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72788g0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72825s0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import i13.C8840a;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import md0.C99847f;
import p248ug.C78160t0;
import pd0.C35457d;
import wi3.C78603a;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: i13.g */
public final class C76259g extends C103422m {

    /* renamed from: Q0 */
    public static int f223395Q0 = -1;

    /* renamed from: A */
    public int f223396A;

    /* renamed from: B */
    public C76260a f223397B = C76260a.INPUT_NONE;

    /* renamed from: C */
    public long f223398C;

    /* renamed from: D */
    public String f223399D;

    /* renamed from: E */
    public boolean f223400E;

    /* renamed from: F */
    public String f223401F = "";

    /* renamed from: G */
    public int f223402G;

    /* renamed from: H */
    public MTimerHandler f223403H;

    /* renamed from: I */
    public boolean f223404I;

    /* renamed from: J */
    public C8840a f223405J;

    /* renamed from: K */
    public C8840a.C8841a f223406K;

    /* renamed from: L */
    public MMHandler f223407L;

    /* renamed from: M */
    public String f223408M;

    /* renamed from: N */
    public SharedPreferences f223409N;

    /* renamed from: P */
    public boolean f223410P;

    /* renamed from: Q */
    public CoordinatorLayout f223411Q;

    /* renamed from: R */
    public MMBottomSheetBehavior<View> f223412R;

    /* renamed from: S */
    public C76261b f223413S;

    /* renamed from: T */
    public boolean f223414T;

    /* renamed from: U */
    public boolean f223415U;

    /* renamed from: V */
    public boolean f223416V;

    /* renamed from: W */
    public boolean f223417W;

    /* renamed from: X */
    public String f223418X;

    /* renamed from: Y */
    public final C35457d f223419Y;

    /* renamed from: Z */
    public List<String> f223420Z;

    /* renamed from: f */
    public final C71562c f223421f = C71562c.f207365v;

    /* renamed from: g */
    public long f223422g;

    /* renamed from: h */
    public boolean f223423h;

    /* renamed from: i */
    public View f223424i;

    /* renamed from: j */
    public TransVoicePanelLayout f223425j;

    /* renamed from: n */
    public MMEditText f223426n;

    /* renamed from: o */
    public ImageView f223427o;

    /* renamed from: p */
    public View f223428p;

    /* renamed from: p0 */
    public final Runnable f223429p0;

    /* renamed from: q */
    public View f223430q;

    /* renamed from: r */
    public ImageView f223431r;

    /* renamed from: s */
    public FrameLayout f223432s;

    /* renamed from: t */
    public ChatFooterPanel f223433t;

    /* renamed from: u */
    public Button f223434u;

    /* renamed from: v */
    public Button f223435v;

    /* renamed from: w */
    public C71561b f223436w;

    /* renamed from: x */
    public int f223437x = 1;

    /* renamed from: x0 */
    public String f223438x0;

    /* renamed from: y */
    public C99847f f223439y;

    /* renamed from: y0 */
    public C76262c f223440y0;

    /* renamed from: z */
    public boolean f223441z;

    /* renamed from: i13.g$a */
    public enum C76260a {
        INPUT_NONE,
        INPUT_EMOJI,
        INPUT_KEYBOARD
    }

    /* renamed from: i13.g$b */
    public enum C76261b {
        MODE_ONLY_PANEL,
        MODE_WITH_KEYBOARD
    }

    /* renamed from: i13.g$c */
    public interface C76262c {
    }

    /* renamed from: i13.g$d */
    public static final class C76263d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f223449d;

        /* renamed from: e */
        public final /* synthetic */ C76259g f223450e;

        public C76263d(Context context, C76259g gVar) {
            this.f223449d = context;
            this.f223450e = gVar;
        }

        public final void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f223449d.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f223450e.f223426n, 0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76259g(Context context) {
        super(context, C0966R.style.f8831zf);
        C87412m.m108594g(context, "context");
        C71562c cVar = C71562c.f207365v;
        this.f223409N = context.getSharedPreferences("voice2txt_sp", 0);
        this.f223413S = C76261b.MODE_ONLY_PANEL;
        this.f223418X = "";
        mo143460C(1);
        this.f223419Y = new C35457d();
        this.f223429p0 = new C76263d(context, this);
        this.f223438x0 = "";
    }

    /* renamed from: E */
    public static final void m91667E(C76259g gVar) {
        if (!Util.isNullOrNil(gVar.f223438x0)) {
            String obj = C112550d0.m153799i0(gVar.f223438x0).toString();
            String substring = obj.substring(obj.length() - 1);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            Log.m105925i("MicroMsg.TransVoiceDialog", "delPunctuation, msg = %s, msg.length() = %s, punctuation = %s.", Util.secPrint(obj), Integer.valueOf(obj.length()), substring);
            if (C112551y.m153809i(substring, "。", true) || C112551y.m153809i(substring, ".", true)) {
                String substring2 = obj.substring(0, obj.length() - 1);
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                MMEditText mMEditText = gVar.f223426n;
                if (mMEditText != null) {
                    mMEditText.setText(substring2);
                    return;
                }
                return;
            }
            MMEditText mMEditText2 = gVar.f223426n;
            if (mMEditText2 != null) {
                mMEditText2.setText(obj);
                return;
            }
            return;
        }
        MMEditText mMEditText3 = gVar.f223426n;
        if (mMEditText3 != null) {
            mMEditText3.setText("");
        }
    }

    /* renamed from: F */
    public static final void m91668F(C76259g gVar) {
        gVar.f223421f.f207378m = gVar.f223437x;
        MMEditText mMEditText = gVar.f223426n;
        String valueOf = String.valueOf(mMEditText != null ? mMEditText.getText() : null);
        if (!Util.isNullOrNil(valueOf)) {
            gVar.f223421f.f207382q = valueOf.length();
            gVar.f223417W = true;
            gVar.f223418X = valueOf;
        } else {
            gVar.f223421f.f207382q = 0;
            gVar.f223418X = "";
        }
        if (gVar.f223423h) {
            gVar.mo106510K(8);
        } else {
            gVar.mo106510K(5);
        }
    }

    /* renamed from: G */
    public static final void m91669G(C76259g gVar, boolean z) {
        C76259g gVar2 = gVar;
        if (z) {
            View view = gVar2.f223428p;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view3 = gVar2.f223428p;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: H */
    public static final void m91670H(C76259g gVar, boolean z) {
        C76259g gVar2 = gVar;
        if (z) {
            View view = gVar2.f223430q;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view3 = gVar2.f223430q;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: I */
    public static final void m91671I(C76259g gVar, boolean z) {
        if (z) {
            ChatFooterPanel chatFooterPanel = gVar.f223433t;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(0);
                return;
            }
            return;
        }
        ChatFooterPanel chatFooterPanel2 = gVar.f223433t;
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.setVisibility(4);
        }
    }

    /* renamed from: J */
    public final void mo106509J(boolean z) {
        if (z) {
            ImageView imageView = this.f223427o;
            if (imageView != null) {
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f223427o;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    /* renamed from: K */
    public final void mo106510K(int i) {
        C76262c cVar;
        if (isShowing()) {
            this.f223421f.mo98691b(i);
            mo106511L();
            dismiss();
            C76262c cVar2 = this.f223440y0;
            if (cVar2 != null) {
                C72788g0 g0Var = (C72788g0) cVar2;
                if (g0Var.f212149a.f211746C2.isShowing()) {
                    g0Var.f212149a.f211746C2.dismiss();
                }
                g0Var.f212149a.f211932s1 = true;
            }
            if (!this.f223400E && (cVar = this.f223440y0) != null) {
                String str = this.f223399D;
                C72825s0 s0Var = ((C72788g0) cVar).f212149a.f211780L;
                if (s0Var != null) {
                    s0Var.mo100660v(str);
                }
            }
            this.f223400E = false;
        }
    }

    /* renamed from: L */
    public final void mo106511L() {
        this.f223438x0 = "";
        this.f223402G = 0;
        this.f223401F = "";
        this.f223404I = false;
        MMEditText mMEditText = this.f223426n;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        MMEditText mMEditText2 = this.f223426n;
        if (mMEditText2 != null) {
            mMEditText2.setCursorVisible(false);
        }
        MMEditText mMEditText3 = this.f223426n;
        if (mMEditText3 != null) {
            mMEditText3.setFocusable(false);
        }
        MMEditText mMEditText4 = this.f223426n;
        if (mMEditText4 != null) {
            mMEditText4.setFocusableInTouchMode(false);
        }
        View view = this.f223428p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f223430q;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo106512M(false);
        ChatFooterPanel chatFooterPanel = this.f223433t;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(8);
        }
        mo106509J(false);
        MMHandler mMHandler = this.f223407L;
        if (mMHandler != null) {
            mMHandler.removeMessages(5000);
        }
        this.f223413S = C76261b.MODE_ONLY_PANEL;
        this.f223414T = false;
        this.f223415U = false;
        this.f223416V = false;
    }

    /* renamed from: M */
    public final void mo106512M(boolean z) {
        Log.m105919d("MicroMsg.TransVoiceDialog", "setKeyboardVisibility, %s.", Boolean.valueOf(z));
        if (z) {
            View view = this.f223424i;
            if (view != null) {
                view.removeCallbacks(this.f223429p0);
            }
            View view2 = this.f223424i;
            if (view2 != null) {
                view2.post(this.f223429p0);
                return;
            }
            return;
        }
        View view3 = this.f223424i;
        if (view3 != null) {
            view3.removeCallbacks(this.f223429p0);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            MMEditText mMEditText = this.f223426n;
            inputMethodManager.hideSoftInputFromWindow(mMEditText != null ? mMEditText.getWindowToken() : null, 0);
        }
    }

    public void onBackPressed() {
        mo106510K(6);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        TextPaint textPaint = null;
        this.f223424i = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.car, (ViewGroup) null, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        View view = this.f223424i;
        C87412m.m108591d(view);
        setContentView(view, layoutParams);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(34);
            window.setDimAmount(0.5f);
            window.setWindowAnimations(C0966R.style.f8365fv);
        }
        View view2 = this.f223424i;
        TransVoicePanelLayout transVoicePanelLayout = view2 != null ? (TransVoicePanelLayout) view2.findViewById(C0966R.C0970id.f7s) : null;
        this.f223425j = transVoicePanelLayout;
        if (transVoicePanelLayout != null) {
            transVoicePanelLayout.setOnInputPanelChange(new C76270n(this));
        }
        View view3 = this.f223424i;
        this.f223411Q = view3 != null ? (CoordinatorLayout) view3.findViewById(C0966R.C0970id.f5846q8) : null;
        View view4 = this.f223424i;
        MMBottomSheetBehavior<View> y = MMBottomSheetBehavior.m137073y(view4 != null ? view4.findViewById(C0966R.C0970id.id_) : null);
        this.f223412R = y;
        if (y != null) {
            y.f304916w = new C76271o(this);
        }
        MMBottomSheetBehavior<View> mMBottomSheetBehavior = this.f223412R;
        if (mMBottomSheetBehavior != null) {
            mMBottomSheetBehavior.f304899G = new C76273p(this);
        }
        View view5 = this.f223424i;
        MMEditText mMEditText = view5 != null ? (MMEditText) view5.findViewById(C0966R.C0970id.kti) : null;
        this.f223426n = mMEditText;
        if (mMEditText != null) {
            mMEditText.setCursorVisible(false);
            mMEditText.setOnEditorActionListener(new C76274q(this));
            mMEditText.setMaxLines(Integer.MAX_VALUE);
            mMEditText.setHorizontallyScrolling(false);
            mMEditText.setOnClickListener(new C76275r(this));
            mMEditText.addTextChangedListener(new C76276s(this));
        }
        View view6 = this.f223424i;
        ImageView imageView = view6 != null ? (ImageView) view6.findViewById(C0966R.C0970id.bew) : null;
        if (imageView != null) {
            imageView.setOnClickListener(new C76277t(this));
        }
        View view7 = this.f223424i;
        ImageView imageView2 = view7 != null ? (ImageView) view7.findViewById(C0966R.C0970id.ktj) : null;
        this.f223427o = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C8845u(this));
        }
        View view8 = this.f223424i;
        ImageView imageView3 = view8 != null ? (ImageView) view8.findViewById(C0966R.C0970id.beo) : null;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C76278v(this));
        }
        View view9 = this.f223424i;
        this.f223428p = view9 != null ? view9.findViewById(C0966R.C0970id.id8) : null;
        View view10 = this.f223424i;
        this.f223430q = view10 != null ? view10.findViewById(C0966R.C0970id.jnj) : null;
        View view11 = this.f223424i;
        ImageView imageView4 = view11 != null ? (ImageView) view11.findViewById(C0966R.C0970id.jnn) : null;
        this.f223431r = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new C76279w(this));
        }
        View view12 = this.f223424i;
        this.f223432s = view12 != null ? (FrameLayout) view12.findViewById(C0966R.C0970id.chk) : null;
        this.f223433t = C78160t0.m94371b(getContext());
        this.f223396A = KeyBoardUtil.getValidPanelHeight(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.f223396A);
        FrameLayout frameLayout = this.f223432s;
        if (frameLayout != null) {
            frameLayout.addView(this.f223433t, layoutParams2);
        }
        ChatFooterPanel chatFooterPanel = this.f223433t;
        if (chatFooterPanel != null) {
            chatFooterPanel.setPortHeightPx(this.f223396A);
        }
        ChatFooterPanel chatFooterPanel2 = this.f223433t;
        if (chatFooterPanel2 != null) {
            int i = ChatFooterPanel.f211589f;
            chatFooterPanel2.setEntranceScene(0);
        }
        ChatFooterPanel chatFooterPanel3 = this.f223433t;
        if (chatFooterPanel3 != null) {
            chatFooterPanel3.mo100191d();
        }
        ChatFooterPanel chatFooterPanel4 = this.f223433t;
        if (chatFooterPanel4 != null) {
            chatFooterPanel4.mo100197i();
        }
        ChatFooterPanel chatFooterPanel5 = this.f223433t;
        if (chatFooterPanel5 != null) {
            chatFooterPanel5.setVisibility(0);
        }
        ChatFooterPanel chatFooterPanel6 = this.f223433t;
        if (chatFooterPanel6 != null) {
            chatFooterPanel6.setShowSend(true);
        }
        ChatFooterPanel chatFooterPanel7 = this.f223433t;
        if (chatFooterPanel7 != null) {
            chatFooterPanel7.setOnTextOperationListener(new C76281y(this));
        }
        this.f223403H = new MTimerHandler(new C76280x(this), true);
        View view13 = this.f223424i;
        Button button = view13 != null ? (Button) view13.findViewById(C0966R.C0970id.am_) : null;
        this.f223434u = button;
        if (button != null) {
            button.setOnClickListener(new C76264h(this));
        }
        View view14 = this.f223424i;
        Button button2 = view14 != null ? (Button) view14.findViewById(C0966R.C0970id.ama) : null;
        this.f223435v = button2;
        if (button2 != null) {
            button2.setOnClickListener(new C76265i(this));
        }
        Button button3 = this.f223434u;
        C85875k4.m106189j0(button3 != null ? button3.getPaint() : null, 0.8f);
        Button button4 = this.f223435v;
        if (button4 != null) {
            textPaint = button4.getPaint();
        }
        C85875k4.m106189j0(textPaint, 0.8f);
        this.f223406K = new C76266j(this);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C8840a aVar = new C8840a(context);
        this.f223405J = aVar;
        aVar.setOnDismissListener(C76267k.f223454d);
        aVar.f28067q = this.f223406K;
        this.f223407L = new MMHandler((MMHandler.Callback) new C76268l(this));
        setOnDismissListener(new C76269m(this));
    }

    public void show() {
        C78603a.f230232b = true;
        super.show();
    }
}
