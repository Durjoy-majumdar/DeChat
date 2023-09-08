package il1;

import ak1.C0073g0;
import ak1.C54108o;
import android.app.Activity;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qg1.C12220e;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50326ly0;
import z04.C112550d0;

/* renamed from: il1.h2 */
public final class C9002h2 extends C9120u0 {

    /* renamed from: y */
    public static final /* synthetic */ int f28437y = 0;

    /* renamed from: h */
    public final Activity f28438h;

    /* renamed from: i */
    public final ViewGroup f28439i;

    /* renamed from: j */
    public final C45795b f28440j;

    /* renamed from: n */
    public C32227p<? super Boolean, ? super String, C13598b0> f28441n;

    /* renamed from: o */
    public View f28442o;

    /* renamed from: p */
    public View f28443p;

    /* renamed from: q */
    public LiveBottomSheetPanel f28444q = ((LiveBottomSheetPanel) this.f28442o.findViewById(C0966R.C0970id.brh));

    /* renamed from: r */
    public View f28445r = this.f28442o.findViewById(C0966R.C0970id.f357971cs3);

    /* renamed from: s */
    public TextView f28446s = ((TextView) this.f28442o.findViewById(C0966R.C0970id.ctr));

    /* renamed from: t */
    public TextView f28447t = ((TextView) this.f28442o.findViewById(C0966R.C0970id.ctp));

    /* renamed from: u */
    public EditText f28448u = ((EditText) this.f28442o.findViewById(C0966R.C0970id.h_9));

    /* renamed from: v */
    public TextView f28449v = ((TextView) this.f28442o.findViewById(C0966R.C0970id.blv));

    /* renamed from: w */
    public boolean f28450w;

    /* renamed from: x */
    public String f28451x = "";

    /* renamed from: il1.h2$a */
    public static final class C9003a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9003a(C9002h2 h2Var) {
            super(0);
            this.f28452d = h2Var;
        }

        public Object invoke() {
            String str;
            Editable text;
            C9002h2 h2Var = this.f28452d;
            EditText editText = h2Var.f28448u;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            h2Var.setFansClubString(str);
            C9002h2 h2Var2 = this.f28452d;
            String fansClubString = h2Var2.getFansClubString();
            h2Var2.mo9811d(!(fansClubString == null || fansClubString.length() == 0));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.h2$b */
    public static final class C9004b implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28453d;

        public C9004b(C9002h2 h2Var) {
            this.f28453d = h2Var;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                C9002h2 h2Var = this.f28453d;
                h2Var.f28448u.setHintTextColor(h2Var.getContext().getResources().getColor(C0966R.color.FG_2));
                return;
            }
            C9002h2 h2Var2 = this.f28453d;
            h2Var2.f28448u.setHintTextColor(h2Var2.getContext().getResources().getColor(C0966R.color.FG_0));
            C9002h2 h2Var3 = this.f28453d;
            EditText editText = h2Var3.f28448u;
            Editable text = editText != null ? editText.getText() : null;
            boolean z2 = false;
            h2Var3.setFansClubString((text == null || text.length() == 0 ? this.f28453d.f28448u.getHint() : this.f28453d.f28448u.getText()).toString());
            C9002h2 h2Var4 = this.f28453d;
            String fansClubString = h2Var4.getFansClubString();
            if (fansClubString == null || fansClubString.length() == 0) {
                z2 = true;
            }
            h2Var4.mo9811d(!z2);
        }
    }

    /* renamed from: il1.h2$c */
    public static final class C9005c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28454d;

        public C9005c(C9002h2 h2Var) {
            this.f28454d = h2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28454d.mo9809b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.h2$d */
    public static final class C9006d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28455d;

        public C9006d(C9002h2 h2Var) {
            this.f28455d = h2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28455d.mo9809b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.h2$e */
    public static final class C9007e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28456d;

        public C9007e(C9002h2 h2Var) {
            this.f28456d = h2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9002h2 h2Var = this.f28456d;
            int i = C9002h2.f28437y;
            boolean z = false;
            h2Var.mo9811d(false);
            String str = h2Var.f28451x;
            C50326ly0 ly02 = new C50326ly0();
            ly02.f137706d = str;
            C13598b0 b0Var = C13598b0.f38549a;
            new C12220e(1, ly02, (C49712hj1) null).mo9225i().mo123420E(new C9018i2(h2Var, str));
            Class cls = C54108o.class;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            if (oVar != null && oVar.mo75999e4()) {
                z = true;
            }
            if (z) {
                ((C54108o) C86312j.m106911c(cls)).mo9619wD(C0073g0.FANS_CLUB, "3", (String) null);
            } else {
                ((C54108o) C86312j.m106911c(cls)).tw0(27, "3", (String) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.h2$f */
    public static final class C9008f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9008f(C9002h2 h2Var) {
            super(1);
            this.f28457d = h2Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f28457d.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.h2$g */
    public static final class C9009g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28458d;

        public C9009g(C9002h2 h2Var) {
            this.f28458d = h2Var;
        }

        public final void run() {
            this.f28458d.f28444q.mo78802a();
        }
    }

    /* renamed from: il1.h2$h */
    public static final class C9010h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9002h2 f28459d;

        public C9010h(C9002h2 h2Var) {
            this.f28459d = h2Var;
        }

        public final void run() {
            this.f28459d.f28444q.mo78804d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9002h2(Activity activity, ViewGroup viewGroup, C45795b bVar) {
        super(activity);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "container");
        this.f28438h = activity;
        this.f28439i = viewGroup;
        this.f28440j = bVar;
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359718ag1, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ld_widget_ui, this, true)");
        this.f28442o = inflate;
        this.f28443p = inflate.findViewById(C0966R.C0970id.bdp);
        C62042e.m72802O1(C62042e.f176370a, this.f28448u, (TextView) null, 6, 3, false, new C9003a(this), 16, (Object) null);
        this.f28448u.setOnFocusChangeListener(new C9004b(this));
        this.f28443p.setOnClickListener(new C9005c(this));
        this.f28445r.setOnClickListener(new C9006d(this));
        this.f28449v.setOnClickListener(new C9007e(this));
        LiveBottomSheetPanel liveBottomSheetPanel = this.f28444q;
        liveBottomSheetPanel.setTranslationY(getHEIGHT());
        liveBottomSheetPanel.setOnVisibilityListener(new C9008f(this));
        TextView textView = this.f28446s;
        C87412m.m108593f(textView, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        setTextBold(textView);
        EditText editText = this.f28448u;
        C87412m.m108593f(editText, "fansNameEt");
        setTextBold(editText);
        TextView textView2 = this.f28449v;
        C87412m.m108593f(textView2, "confirmBtn");
        setTextBold(textView2);
        String obj = this.f28448u.getHint().toString();
        this.f28451x = obj;
        mo9811d(!(obj == null || obj.length() == 0));
        CharSequence text = this.f28447t.getText();
        String string = getContext().getString(C0966R.string.dl5);
        C87412m.m108593f(string, "context.getString(R.stri…lub_build_subtitle_right)");
        C87412m.m108593f(text, "subTitleContent");
        int E = C112550d0.m153769E(text, string, 0, false, 6, (Object) null);
        C9026j2 j2Var = new C9026j2(this);
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(j2Var, E, string.length() + E, 33);
        this.f28447t.setText(spannableString);
        this.f28447t.setHighlightColor(getContext().getResources().getColor(C0966R.color.ahf));
        this.f28447t.setMovementMethod(LinkMovementMethod.getInstance());
        setBackgroundColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
        ViewGroup.LayoutParams layoutParams = this.f28449v.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75054z4.m90004b(MMApplicationContext.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r2 = r0.getContext();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9809b() {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f28448u
            if (r0 == 0) goto L_0x0007
            r0.clearFocus()
        L_0x0007:
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto L_0x0017
            java.lang.String r3 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r3)
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r3 = 0
            if (r2 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0023
            android.os.IBinder r1 = r0.getWindowToken()
        L_0x0023:
            r2.hideSoftInputFromWindow(r1, r3)
        L_0x0026:
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r4.f28444q
            il1.h2$g r1 = new il1.h2$g
            r1.<init>(r4)
            r0.post(r1)
            boolean r0 = r4.f28450w
            if (r0 == 0) goto L_0x004d
            fj1.b r0 = r4.f28440j
            if (r0 == 0) goto L_0x004b
            java.lang.Class<cl1.z> r1 = cl1.C0700z.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.z r0 = (cl1.C0700z) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.mo665c3()
            if (r0 == 0) goto L_0x004b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.postValue(r1)
        L_0x004b:
            r4.f28450w = r3
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9002h2.mo9809b():void");
    }

    /* renamed from: c */
    public final void mo9810c() {
        if (this.f28439i.indexOfChild(this) == -1) {
            this.f28439i.addView(this);
        }
        boolean z = false;
        setVisibility(0);
        this.f28444q.post(new C9010h(this));
        Class cls = C54108o.class;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null && oVar.mo75999e4()) {
            z = true;
        }
        if (z) {
            ((C54108o) C86312j.m106911c(cls)).mo9619wD(C0073g0.FANS_CLUB, "2", (String) null);
        } else {
            ((C54108o) C86312j.m106911c(cls)).tw0(27, "2", (String) null);
        }
    }

    /* renamed from: d */
    public final void mo9811d(boolean z) {
        Log.m105924i("FinderLiveFansBuildWidget", "updateConfirmBtn canConfirm:" + z);
        this.f28449v.setEnabled(z);
    }

    public final Activity getActivity() {
        return this.f28438h;
    }

    public final C45795b getBuContext() {
        return this.f28440j;
    }

    public final ViewGroup getContainer() {
        return this.f28439i;
    }

    public final C32227p<Boolean, String, C13598b0> getCreateResultCallback() {
        return this.f28441n;
    }

    public final String getFansClubString() {
        return this.f28451x;
    }

    public final void setCreateResultCallback(C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        this.f28441n = pVar;
    }

    public final void setFansClubString(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f28451x = str;
    }

    public final void setFromWish(boolean z) {
        this.f28450w = z;
    }
}
