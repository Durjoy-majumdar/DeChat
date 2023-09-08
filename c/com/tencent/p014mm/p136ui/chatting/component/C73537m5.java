package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C104160f;
import bp3.C79758p;
import cj3.C28600e;
import cj3.C67387c;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TranslateMsgStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.anim.content.AnimSizeRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72842y;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$i1;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import e13.C75472a;
import e13.C7583b;
import f40.C45747a;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32227p;
import g13.C45876f;
import g13.C75824d;
import g13.C8227e;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import p270xi.C91212b;
import qo3.C101218e0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import sx3.C90364q0;
import z04.C112550d0;
import z04.C112551y;
import zj3.C79353f1;
import zj3.C79387w;
import zt3.C119157j;

@C91212b(exportInterface = C79353f1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.m5 */
public final class C73537m5 extends C73412a implements C79353f1 {

    /* renamed from: G */
    public static final Map<Integer, Integer> f216008G = C90364q0.m113147f(new C13604l(0, Integer.valueOf(C0966R.string.bcd)), new C13604l(1, Integer.valueOf(C0966R.string.bce)), new C13604l(2, Integer.valueOf(C0966R.string.bc_)), new C13604l(3, Integer.valueOf(C0966R.string.bca)), new C13604l(4, Integer.valueOf(C0966R.string.bcb)));

    /* renamed from: H */
    public static final Map<Integer, String> f216009H = C90364q0.m113147f(new C13604l(0, "zh_CN"), new C13604l(1, "zh_TW"), new C13604l(2, "en"), new C13604l(3, LocaleUtil.JAPANESE), new C13604l(4, LocaleUtil.KOREAN));

    /* renamed from: A */
    public final Runnable f216010A = new C73548m(this);

    /* renamed from: B */
    public final C73539b f216011B = new C73539b();

    /* renamed from: C */
    public final IMvvmObserver<C7583b> f216012C = new C73547l(this);

    /* renamed from: D */
    public final C13601g f216013D;

    /* renamed from: E */
    public final C73543h f216014E;

    /* renamed from: F */
    public final int f216015F;

    /* renamed from: e */
    public C79353f1.C79355b f216016e;

    /* renamed from: f */
    public C79353f1.C79356c f216017f;

    /* renamed from: g */
    public C79353f1.C79354a f216018g;

    /* renamed from: h */
    public AnimSizeRelativeLayout f216019h;

    /* renamed from: i */
    public ViewGroup f216020i;

    /* renamed from: j */
    public TranslateControllerView f216021j;

    /* renamed from: n */
    public LoadableTextView f216022n;

    /* renamed from: o */
    public final C13601g f216023o = C36568h.m40985a(new C73542g(this));

    /* renamed from: p */
    public final C13601g f216024p = C36568h.m40985a(new C73540d(this));

    /* renamed from: q */
    public final C13601g f216025q = C36568h.m40985a(new C73541e(this));

    /* renamed from: r */
    public final C13601g f216026r = C36568h.m40985a(new C30826f(this));

    /* renamed from: s */
    public C73538a f216027s = C73538a.BarStatusEmpty;

    /* renamed from: t */
    public final List<C32227p<C73538a, C73538a, C13598b0>> f216028t = new ArrayList();

    /* renamed from: u */
    public String f216029u = "";

    /* renamed from: v */
    public String f216030v = "";

    /* renamed from: w */
    public int f216031w;

    /* renamed from: x */
    public LinkedList<Runnable> f216032x = new LinkedList<>();

    /* renamed from: y */
    public boolean f216033y;

    /* renamed from: z */
    public final MMHandler f216034z = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$c */
    public interface C30825c {
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$f */
    public static final class C30826f extends C87413o implements C32224a<ArrayList<C30816a3>> {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f82837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30826f(C73537m5 m5Var) {
            super(0);
            this.f82837d = m5Var;
        }

        public Object invoke() {
            this.f82837d.getClass();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : C73537m5.f216008G.entrySet()) {
                arrayList.add(new C30816a3(((Number) next.getKey()).intValue(), ((Number) next.getValue()).intValue(), false, 4, (C8480h) null));
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$a */
    public enum C73538a {
        BarStatusEmpty,
        BarStatusTranslating,
        BarStatusTranslateFinish
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$b */
    public final class C73539b {
        public C73539b() {
        }

        /* renamed from: a */
        public final String mo102538a(String str) {
            return C86709a0.m107523b().mo121110g() + '_' + C73537m5.this.f215752d.mo91577r() + '_' + str;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$d */
    public static final class C73540d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73540d(C73537m5 m5Var) {
            super(0);
            this.f216040d = m5Var;
        }

        public Object invoke() {
            return C85868k2.m106137b(this.f216040d.f215752d.mo91565f()).inflate(C0966R.C0971layout.f6846q5, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$e */
    public static final class C73541e extends C87413o implements C32224a<C101218e0> {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73541e(C73537m5 m5Var) {
            super(0);
            this.f216041d = m5Var;
        }

        public Object invoke() {
            C73537m5 m5Var = this.f216041d;
            C101218e0 e0Var = new C101218e0(m5Var.f215752d.mo91565f(), 0, 2, true);
            e0Var.mo140671q(m5Var.f215752d.mo91565f().getString(C0966R.string.bcc));
            LinearLayout linearLayout = new LinearLayout(m5Var.f215752d.mo91565f());
            linearLayout.setOrientation(1);
            linearLayout.addView((WxRecyclerView) ((C36570n) m5Var.f216023o).getValue());
            Object value = ((C36570n) m5Var.f216024p).getValue();
            C87412m.m108593f(value, "<get-chooseLanFooterView>(...)");
            linearLayout.addView((View) value);
            e0Var.mo140664k(linearLayout, 0, 0);
            Object value2 = ((C36570n) m5Var.f216024p).getValue();
            C87412m.m108593f(value2, "<get-chooseLanFooterView>(...)");
            ((View) value2).setOnClickListener(new C73563o5(m5Var));
            e0Var.f296389o = true;
            return e0Var;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$g */
    public static final class C73542g extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73542g(C73537m5 m5Var) {
            super(0);
            this.f216042d = m5Var;
        }

        public Object invoke() {
            C73537m5 m5Var = this.f216042d;
            m5Var.getClass();
            Activity f = m5Var.f215752d.mo91565f();
            C87412m.m108593f(f, "mChattingContext.context");
            WxRecyclerView wxRecyclerView = new WxRecyclerView(f);
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(m5Var.f215752d.mo91565f()));
            wxRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            wxRecyclerView.setOverScrollMode(2);
            wxRecyclerView.setAdapter(new WxRecyclerAdapter(new TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1(m5Var), (ArrayList) ((C36570n) m5Var.f216026r).getValue(), false));
            return wxRecyclerView;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$h */
    public static final class C73543h implements C75875l.C75877b {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216043d;

        public C73543h(C73537m5 m5Var) {
            this.f216043d = m5Var;
        }

        /* renamed from: w5 */
        public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            C87412m.m108594g(lVar, "storage");
            C87412m.m108594g(eVar, "info");
            ArrayList<C72963f4> arrayList = eVar.f123846c;
            C87412m.m108593f(arrayList, "info.msgList");
            C73537m5 m5Var = this.f216043d;
            for (C72963f4 f4Var : arrayList) {
                if (f4Var.mo108769t2() == 1 && f4Var.mo100993e4()) {
                    String content = f4Var.getContent();
                    C87412m.m108593f(content, "it.content");
                    if (C73537m5.m86972Y5(m5Var, content) && m5Var.mo102529e6()) {
                        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_CHATFOOT_TRANS_IN_WRITE_TIP_HAS_SHOW_BOOLEAN_SYNC, false) || !C87412m.m108589b(C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Global_TransInWriteTipsShow_Int, 0), 0)) {
                            ((C119157j) C119157j.f356862d).mo183875f(new C73556n5(lVar, m5Var));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$i */
    public static final class C73544i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216044d;

        public C73544i(C73537m5 m5Var) {
            this.f216044d = m5Var;
        }

        public final void run() {
            C73537m5 m5Var = this.f216044d;
            m5Var.f216033y = false;
            ((C79387w) m5Var.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1().setIgnoreScroll(Boolean.FALSE);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$j */
    public static final class C73545j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73545j(C73537m5 m5Var) {
            super(0);
            this.f216045d = m5Var;
        }

        public Object invoke() {
            return C85868k2.m106137b(this.f216045d.f215752d.mo91565f()).inflate(C0966R.C0971layout.f6985u5, (ViewGroup) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$k */
    public static final class C73546k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73546k(C73537m5 m5Var) {
            super(0);
            this.f216046d = m5Var;
        }

        public Object invoke() {
            View rootView = ((C79387w) this.f216046d.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1().getRootView();
            C87412m.m108592e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            return ((ViewGroup) rootView).findViewById(C0966R.C0970id.b4a);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$l */
    public static final class C73547l<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216047d;

        public C73547l(C73537m5 m5Var) {
            this.f216047d = m5Var;
        }

        public void onChanged(Object obj) {
            C7583b bVar = (C7583b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            ((C119157j) C119157j.f356862d).mo183895z(new C73653x5(this.f216047d, bVar));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m5$m */
    public static final class C73548m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C73537m5 f216048d;

        public C73548m(C73537m5 m5Var) {
            this.f216048d = m5Var;
        }

        public final void run() {
            C73537m5 m5Var = this.f216048d;
            String str = m5Var.f216030v;
            m5Var.getClass();
            boolean z = false;
            if (!(str.length() == 0)) {
                if (m5Var.mo102522Z5().length() == 0) {
                    z = true;
                }
                if (!z) {
                    Log.m105924i("TAG", "updateOriginTextInternal() called with: text = " + str + " lastTransResult = " + m5Var.f216029u + " lastOriginText = " + m5Var.f216030v);
                    m5Var.mo102530f6(str);
                    LoadableTextView loadableTextView = m5Var.f216022n;
                    if (loadableTextView != null) {
                        loadableTextView.setLoading(true);
                    } else {
                        C87412m.m108603p("resultTv");
                        throw null;
                    }
                }
            }
        }
    }

    public C73537m5() {
        C36568h.m40985a(new C73545j(this));
        this.f216013D = C36568h.m40985a(new C73546k(this));
        this.f216014E = new C73543h(this);
        this.f216015F = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_translate_tool_expose_max_count, 5);
    }

    /* renamed from: Y5 */
    public static final boolean m86972Y5(C73537m5 m5Var, String str) {
        boolean z;
        m5Var.getClass();
        int i = 0;
        for (String str2 : C112550d0.m153785U(C112551y.m153814n(C112551y.m153814n(str, "\n", " ", false), "\r", " ", false), new String[]{" "}, false, 0, 6, (Object) null)) {
            char[] charArray = "-/:'()$&@\",.?!'：；（）¥，。、？！“”‘’".toCharArray();
            C87412m.m108593f(charArray, "this as java.lang.String).toCharArray()");
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < str2.length()) {
                    char charAt = str2.charAt(i2);
                    if (!('a' <= charAt && charAt < '{')) {
                        if (!('A' <= charAt && charAt < '[')) {
                            if (!C110823p.m151007w(charArray, charAt)) {
                                if (!('0' <= charAt && charAt < ':')) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i2++;
                        }
                    }
                    i3++;
                    i2++;
                } else if (i3 >= 2) {
                    z = true;
                }
            }
            z = false;
            if (z && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C2 */
    public void mo102516C2(C79353f1.C79356c cVar) {
        C87412m.m108594g(cVar, "callback");
        this.f216017f = cVar;
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        AnimSizeRelativeLayout animSizeRelativeLayout = this.f216019h;
        if (animSizeRelativeLayout != null) {
            animSizeRelativeLayout.postDelayed(new C73544i(this), 500);
        } else {
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: L0 */
    public void mo102517L0(C79353f1.C79355b bVar) {
        C87412m.m108594g(bVar, "callback");
        this.f216016e = bVar;
    }

    /* renamed from: P4 */
    public void mo102518P4() {
        if (mo102523a6() != -1) {
            AnimSizeRelativeLayout animSizeRelativeLayout = this.f216019h;
            if (animSizeRelativeLayout != null) {
                C67387c sizeAnimController = animSizeRelativeLayout.getSizeAnimController();
                if (sizeAnimController.f193263b.getVisibility() != 0) {
                    View view = sizeAnimController.f193263b;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/anim/content/SizeAnimController", "requestVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/anim/content/SizeAnimController", "requestVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    sizeAnimController.f193263b.requestLayout();
                    return;
                }
                return;
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: Q0 */
    public boolean mo102519Q0() {
        return mo102523a6() != -1;
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
        LoadableTextView loadableTextView = this.f216022n;
        if (loadableTextView != null) {
            loadableTextView.f215645h = ((View) ((C36570n) this.f216013D).getValue()).getWidth();
            loadableTextView.requestLayout();
            return;
        }
        C87412m.m108603p("resultTv");
        throw null;
    }

    /* renamed from: X1 */
    public void mo102520X1(boolean z) {
        C73538a aVar = C73538a.BarStatusEmpty;
        Log.m105924i("MicroMsg.TranslateWhileWriteComponent", "setTranslating() called with: enable = " + z);
        if (z) {
            if (this.f216030v.length() == 0) {
                mo102531g6(aVar);
            }
            mo102534i6();
        } else {
            mo102533h6(-1);
            Log.m105918d("MicroMsg.TranslateWhileWriteComponent", "tryHideRoot() called");
            mo102531g6(aVar);
            mo102536q5();
        }
        C73539b bVar = this.f216011B;
        bVar.getClass();
        MultiProcessMMKV.getMMKV(C73537m5.this.mo102527d6()).putInt(bVar.mo102538a("useTrans"), 0);
    }

    /* renamed from: Z2 */
    public void mo102521Z2(C79353f1.C79354a aVar) {
        this.f216018g = aVar;
    }

    /* renamed from: Z5 */
    public final String mo102522Z5() {
        String str = f216009H.get(Integer.valueOf(mo102523a6()));
        return str == null ? "" : str;
    }

    /* renamed from: a6 */
    public final int mo102523a6() {
        if (MultiProcessMMKV.getMMKV(mo102527d6()).containsKey(this.f215752d.mo91577r())) {
            return MultiProcessMMKV.getMMKV(mo102527d6()).getInt(this.f215752d.mo91577r(), -1);
        }
        MultiProcessMMKV.getMMKV(mo102527d6()).putInt(this.f215752d.mo91577r(), -1);
        return -1;
    }

    /* renamed from: b5 */
    public void mo102524b5(String str) {
        String str2;
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        if (mo102519Q0()) {
            String r = this.f215752d.mo91577r();
            C87412m.m108593f(r, "mChattingContext.talkerUserName");
            int length = str.length();
            int length2 = this.f216029u.length();
            String Z5 = mo102522Z5();
            TranslateMsgStruct translateMsgStruct = new TranslateMsgStruct();
            if (C75824d.f222434a.length() == 0) {
                str2 = UUID.randomUUID().toString();
                C87412m.m108593f(str2, "randomUUID().toString()");
                C75824d.f222434a = str2;
            } else {
                str2 = C75824d.f222434a;
            }
            translateMsgStruct.mo93199u(str2);
            translateMsgStruct.f194636f = 2;
            translateMsgStruct.mo93197s("7");
            translateMsgStruct.f194640j = length2;
            translateMsgStruct.f194641k = length;
            translateMsgStruct.f194642l = translateMsgStruct.mo86045b("TargetLanguage", Z5, true);
            translateMsgStruct.mo93198t(r);
            translateMsgStruct.mo86054n();
            this.f216029u = "";
        }
    }

    /* renamed from: b6 */
    public final String mo102525b6() {
        try {
            if (mo102523a6() == -1) {
                return "";
            }
            Activity f = this.f215752d.mo91565f();
            Integer num = f216008G.get(Integer.valueOf(mo102523a6()));
            String string = f.getString(num != null ? num.intValue() : 0);
            C87412m.m108593f(string, "{\n            if (getCur…rLanId()] ?: 0)\n        }");
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c6 */
    public final String mo102526c6() {
        return (this.f216030v.length() >= this.f216029u.length() && C112550d0.m153803w(this.f216030v, this.f216029u, false, 2, (Object) null)) ? this.f216029u : "";
    }

    /* renamed from: d6 */
    public final String mo102527d6() {
        return C86709a0.m107523b().mo121111i() + "TransInWriting";
    }

    /* renamed from: e */
    public void mo70065e() {
        ((ArrayList) this.f216028t).clear();
        Log.m105924i("MicroMsg.TranslateWhileWriteComponent", "initRootView(): Translate While Write init root view");
        View c = this.f215752d.mo91562c(C0966R.C0970id.f357672b51);
        C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout");
        this.f216019h = (AnimSizeRelativeLayout) c;
        if (mo102519Q0()) {
            mo102534i6();
        } else {
            Log.m105918d("MicroMsg.TranslateWhileWriteComponent", "tryHideRoot() called");
            mo102531g6(C73538a.BarStatusEmpty);
            mo102536q5();
        }
        View c2 = this.f215752d.mo91562c(C0966R.C0970id.b4y);
        C87412m.m108592e(c2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.component.TranslateControllerView");
        TranslateControllerView translateControllerView = (TranslateControllerView) c2;
        this.f216021j = translateControllerView;
        translateControllerView.setOnClickListener(new C73586q5(this));
        TranslateControllerView translateControllerView2 = this.f216021j;
        if (translateControllerView2 != null) {
            translateControllerView2.setLanguageText(mo102525b6());
            ((ArrayList) this.f216028t).add(new C73592r5(this));
            View c3 = this.f215752d.mo91562c(C0966R.C0970id.f357671b50);
            C87412m.m108592e(c3, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.component.LoadableTextView");
            LoadableTextView loadableTextView = (LoadableTextView) c3;
            this.f216022n = loadableTextView;
            loadableTextView.setVisibility(8);
            LoadableTextView loadableTextView2 = this.f216022n;
            if (loadableTextView2 != null) {
                loadableTextView2.setOnDoubleClickListener(new C73598s5(this));
                ((ArrayList) this.f216028t).add(new C73602t5(this));
                int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_TransInWriteMaxLine_Int, 1);
                if (e > 1) {
                    LoadableTextView loadableTextView3 = this.f216022n;
                    if (loadableTextView3 != null) {
                        loadableTextView3.setSingleLine(false);
                        LoadableTextView loadableTextView4 = this.f216022n;
                        if (loadableTextView4 != null) {
                            loadableTextView4.setMaxLines(e);
                        } else {
                            C87412m.m108603p("resultTv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("resultTv");
                        throw null;
                    }
                }
                View c4 = this.f215752d.mo91562c(C0966R.C0970id.f357673b52);
                C87412m.m108592e(c4, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) c4;
                this.f216020i = viewGroup;
                TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.b54);
                ViewGroup viewGroup2 = this.f216020i;
                if (viewGroup2 != null) {
                    WeImageView weImageView = (WeImageView) viewGroup2.findViewById(C0966R.C0970id.f357674b53);
                    ViewGroup viewGroup3 = this.f216020i;
                    if (viewGroup3 != null) {
                        viewGroup3.setVisibility(8);
                        ViewGroup viewGroup4 = this.f216020i;
                        if (viewGroup4 != null) {
                            viewGroup4.setOnClickListener(new C73629u5(this));
                            ((ArrayList) this.f216028t).add(new C73638v5(this, textView, weImageView));
                            return;
                        }
                        C87412m.m108603p("useBtn");
                        throw null;
                    }
                    C87412m.m108603p("useBtn");
                    throw null;
                }
                C87412m.m108603p("useBtn");
                throw null;
            }
            C87412m.m108603p("resultTv");
            throw null;
        }
        C87412m.m108603p("controllerView");
        throw null;
    }

    /* renamed from: e3 */
    public boolean mo102528e3() {
        Log.m105924i("MicroMsg.TranslateWhileWriteComponent", "needInteruptChatFooterDown:" + this.f216033y + ' ');
        return this.f216033y;
    }

    /* renamed from: e6 */
    public final boolean mo102529e6() {
        return C87412m.m108589b(WeChatBrands.AppInfo.lang, "zh_CN") || C87412m.m108589b(WeChatBrands.AppInfo.lang, "zh_HK") || C87412m.m108589b(WeChatBrands.AppInfo.lang, "zh_TW");
    }

    /* renamed from: f6 */
    public final void mo102530f6(String str) {
        Class cls = C45876f.class;
        if (this.f215752d.mo91582w()) {
            C86709a0.m107523b().mo121108c();
            C39622i0 a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C8227e()).mo75002a(cls);
            C87412m.m108593f(a, "ViewModelProvider(\n     …ritingHelper::class.java]");
            int i = C45876f.f123832d;
            C45876f.f123832d = i + 1;
            String Z5 = mo102522Z5();
            String r = this.f215752d.mo91577r();
            C87412m.m108593f(r, "mChattingContext.talkerUserName");
            String c6 = mo102526c6();
            C87412m.m108594g(c6, "prefixContent");
            C87412m.m108594g(str, "textMsg");
            ((C45876f) a).mo71312c3(i, Z5, r, c6, 30, str);
            return;
        }
        C86709a0.m107523b().mo121108c();
        C39622i0 a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C8227e()).mo75002a(cls);
        C87412m.m108593f(a2, "ViewModelProvider(\n     …ritingHelper::class.java]");
        int i2 = C45876f.f123832d;
        C45876f.f123832d = i2 + 1;
        String Z52 = mo102522Z5();
        String r2 = this.f215752d.mo91577r();
        C87412m.m108593f(r2, "mChattingContext.talkerUserName");
        String c64 = mo102526c6();
        C87412m.m108594g(c64, "prefixContent");
        C87412m.m108594g(str, "textMsg");
        ((C45876f) a2).mo71312c3(i2, Z52, r2, c64, 29, str);
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this.f216014E, Looper.getMainLooper());
    }

    /* renamed from: g6 */
    public final void mo102531g6(C73538a aVar) {
        C73538a aVar2 = this.f216027s;
        Log.m105924i("MicroMsg.TranslateWhileWriteComponent", "notifyStatusChange() called with: oldStatus = " + aVar2 + ", newValue = " + aVar);
        Iterator it = ((ArrayList) this.f216028t).iterator();
        while (it.hasNext()) {
            ((C32227p) it.next()).invoke(aVar2, aVar);
        }
        this.f216027s = aVar;
    }

    public C67387c getSizeAnimController() {
        AnimSizeRelativeLayout animSizeRelativeLayout = this.f216019h;
        if (animSizeRelativeLayout != null) {
            return animSizeRelativeLayout.getSizeAnimController();
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: h6 */
    public final void mo102533h6(int i) {
        int a6 = mo102523a6();
        MultiProcessMMKV.getMMKV(mo102527d6()).putInt(this.f215752d.mo91577r(), i);
        RecyclerView.C16613e adapter = ((WxRecyclerView) ((C36570n) this.f216023o).getValue()).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        TranslateControllerView translateControllerView = this.f216021j;
        if (translateControllerView != null) {
            translateControllerView.setLanguageText(mo102525b6());
            if (a6 != i && i != -1) {
                if (this.f216030v.length() > 0) {
                    LoadableTextView loadableTextView = this.f216022n;
                    if (loadableTextView != null) {
                        loadableTextView.setLoading(true);
                        mo102531g6(C73538a.BarStatusTranslating);
                        mo102530f6(this.f216030v);
                        return;
                    }
                    C87412m.m108603p("resultTv");
                    throw null;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("controllerView");
        throw null;
    }

    /* renamed from: i6 */
    public final void mo102534i6() {
        Log.m105924i("MicroMsg.TranslateWhileWriteComponent", "tryShowRoot(): Translate While Write try show root");
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        C75824d.f222434a = uuid;
        boolean z = false;
        if (mo102523a6() == -1) {
            if (mo102529e6()) {
                mo102533h6(2);
            } else {
                mo102533h6(0);
            }
        }
        if (this.f216030v.length() == 0) {
            z = true;
        }
        if (z) {
            mo102531g6(C73538a.BarStatusEmpty);
        }
        mo102518P4();
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        ((C75472a) MvvmEventCenter.Companion.getEvent(C75472a.class)).removeObserver(this.f216012C);
    }

    /* renamed from: n1 */
    public void mo102535n1(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        if (!C87412m.m108589b(str, this.f216030v)) {
            if (str.length() == 0) {
                mo102531g6(C73538a.BarStatusEmpty);
                this.f216034z.removeCallbacks(this.f216010A);
                LoadableTextView loadableTextView = this.f216022n;
                if (loadableTextView != null) {
                    loadableTextView.setOriginText("");
                } else {
                    C87412m.m108603p("resultTv");
                    throw null;
                }
            } else if (!C87412m.m108589b(str, this.f216029u) && mo102523a6() != -1) {
                mo102531g6(C73538a.BarStatusTranslating);
                this.f216034z.removeCallbacks(this.f216010A);
                this.f216034z.postDelayed(this.f216010A, 300);
            }
            this.f216030v = str;
        }
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        C73539b bVar = this.f216011B;
        bVar.getClass();
        if (MultiProcessMMKV.getMMKV(C73537m5.this.mo102527d6()).getInt(bVar.mo102538a("useTrans"), 0) >= this.f216015F) {
            mo102533h6(-1);
        }
        C79353f1.C79354a aVar = this.f216018g;
        if (aVar != null) {
            C72842y yVar = (C72842y) aVar;
            yVar.f212276a.f211888j.setHint("");
            ChatFooter$$i1 chatFooter$$i1 = yVar.f212276a.f211826V1;
            if (!(chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null)) {
                ((C79353f1) yVar.f212276a.f211826V1.mo100531a().f193278b.mo102812a(C79353f1.class)).mo102521Z2((C79353f1.C79354a) null);
            }
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this.f216014E);
    }

    /* renamed from: q5 */
    public void mo102536q5() {
        AnimSizeRelativeLayout animSizeRelativeLayout = this.f216019h;
        if (animSizeRelativeLayout != null) {
            C67387c sizeAnimController = animSizeRelativeLayout.getSizeAnimController();
            if (sizeAnimController.f193263b.getVisibility() != 8) {
                sizeAnimController.mo91531c(sizeAnimController.f193267f, 0, true, new C28600e(sizeAnimController));
                return;
            }
            return;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: r */
    public void mo102537r(int i) {
        this.f216031w = i;
        if (i == 0) {
            while (!this.f216032x.isEmpty()) {
                this.f216032x.removeLast().run();
            }
        }
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        C45747a aVar = C86709a0.m107523b().f251755f;
        C87412m.m108593f(aVar, "account().accountModelOwner");
        ((C75472a) MvvmEventCenter.Companion.getEvent(C75472a.class)).observe(aVar, this.f216012C);
    }
}
