package il1;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qg1.C12220e;
import qo3.C12925w;
import qo3.w$$c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C50326ly0;

/* renamed from: il1.v3 */
public final class C9143v3 extends C9120u0 implements View.OnClickListener {

    /* renamed from: h */
    public C32224a<C13598b0> f28798h;

    /* renamed from: i */
    public View f28799i;

    /* renamed from: j */
    public final View f28800j;

    /* renamed from: n */
    public final View f28801n;

    /* renamed from: o */
    public TextView f28802o = ((TextView) this.f28799i.findViewById(C0966R.C0970id.cti));

    /* renamed from: p */
    public EditText f28803p = ((EditText) this.f28799i.findViewById(C0966R.C0970id.gye));

    /* renamed from: q */
    public WeImageView f28804q = ((WeImageView) this.f28799i.findViewById(C0966R.C0970id.ctg));

    /* renamed from: r */
    public TextView f28805r = ((TextView) this.f28799i.findViewById(C0966R.C0970id.gyb));

    /* renamed from: s */
    public final C13601g f28806s = C36568h.m40985a(new C9147c(this));

    /* renamed from: t */
    public String f28807t = "";

    /* renamed from: u */
    public String f28808u = "";

    /* renamed from: il1.v3$a */
    public static final class C9144a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9143v3 f28809d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9144a(C9143v3 v3Var) {
            super(0);
            this.f28809d = v3Var;
        }

        public Object invoke() {
            String str;
            Editable text;
            C9143v3 v3Var = this.f28809d;
            EditText editText = v3Var.f28803p;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            v3Var.setFansClubName(str);
            C9143v3 v3Var2 = this.f28809d;
            String fansClubName = v3Var2.getFansClubName();
            boolean z = true;
            if ((fansClubName == null || fansClubName.length() == 0) || C87412m.m108589b(this.f28809d.getFansClubName(), this.f28809d.getLastFansClubName())) {
                z = false;
            }
            v3Var2.mo9958d(z);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.v3$b */
    public final class C9145b extends w$$c {

        /* renamed from: il1.v3$b$a */
        public static final class C9146a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9145b f28811d;

            /* renamed from: e */
            public final /* synthetic */ C9143v3 f28812e;

            public C9146a(C9145b bVar, C9143v3 v3Var) {
                this.f28811d = bVar;
                this.f28812e = v3Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
                r0 = r1.getContext();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    il1.v3$b r0 = r3.f28811d
                    qo3.w r0 = r0.f36949a
                    if (r0 == 0) goto L_0x0011
                    android.view.Window r0 = r0.mo12462b()
                    if (r0 == 0) goto L_0x0011
                    r1 = 18
                    r0.setSoftInputMode(r1)
                L_0x0011:
                    il1.v3 r0 = r3.f28812e
                    android.widget.EditText r1 = r0.f28803p
                    r0.getClass()
                    if (r1 == 0) goto L_0x001d
                    r1.requestFocus()
                L_0x001d:
                    if (r1 == 0) goto L_0x002c
                    android.content.Context r0 = r1.getContext()
                    if (r0 == 0) goto L_0x002c
                    java.lang.String r2 = "input_method"
                    java.lang.Object r0 = r0.getSystemService(r2)
                    goto L_0x002d
                L_0x002c:
                    r0 = 0
                L_0x002d:
                    android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                    if (r0 == 0) goto L_0x0035
                    r2 = 0
                    r0.showSoftInput(r1, r2)
                L_0x0035:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: il1.C9143v3.C9145b.C9146a.run():void");
            }
        }

        public C9145b() {
        }

        /* renamed from: a */
        public View mo4781a(Context context) {
            C87412m.m108594g(context, "context");
            return C9143v3.this;
        }

        /* renamed from: c */
        public void mo4873c() {
            C9143v3 v3Var = C9143v3.this;
            v3Var.postDelayed(new C9146a(this, v3Var), 500);
        }
    }

    /* renamed from: il1.v3$c */
    public static final class C9147c extends C87413o implements C32224a<C9145b> {

        /* renamed from: d */
        public final /* synthetic */ C9143v3 f28813d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9147c(C9143v3 v3Var) {
            super(0);
            this.f28813d = v3Var;
        }

        public Object invoke() {
            return new C9145b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9143v3(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ag_, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…fy_widget_ui, this, true)");
        this.f28799i = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.cte);
        this.f28800j = findViewById;
        View findViewById2 = this.f28799i.findViewById(C0966R.C0970id.ctf);
        this.f28801n = findViewById2;
        TextView textView = this.f28802o;
        C87412m.m108593f(textView, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C7919x.m8091a(textView);
        mo9958d(false);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        this.f28804q.setOnClickListener(this);
        this.f28805r.setOnClickListener(this);
        C62042e.m72802O1(C62042e.f176370a, this.f28803p, (TextView) null, 6, 3, false, new C9144a(this), 16, (Object) null);
        this.f28803p.clearFocus();
        TextView textView2 = this.f28805r;
        C87412m.m108593f(textView2, "confirmBtn");
        setTextBold(textView2);
    }

    /* access modifiers changed from: private */
    public final C9145b getModifyBottomPage() {
        return (C9145b) ((C36570n) this.f28806s).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.f1644g;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9957c(qo3.C12925w r3) {
        /*
            r2 = this;
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.x> r1 = cl1.C0696x.class
            androidx.lifecycle.i0 r0 = r0.mo77630e(r1)
            cl1.x r0 = (cl1.C0696x) r0
            if (r0 == 0) goto L_0x0013
            te3.ly0 r0 = r0.f1644g
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f137706d
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = ""
        L_0x0018:
            r2.f28808u = r0
            android.widget.EditText r1 = r2.f28803p
            r1.setHint(r0)
            ok1.e r0 = ok1.C62042e.f176370a
            r0.mo87010H1(r2)
            if (r3 == 0) goto L_0x002d
            il1.v3$b r0 = r2.getModifyBottomPage()
            r3.mo12468h(r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9143v3.mo9957c(qo3.w):void");
    }

    /* renamed from: d */
    public final void mo9958d(boolean z) {
        Log.m105924i("Finder.FinderLiveFansModifyNameWidget", "updateConfirmBtn canConfirm:" + z);
        this.f28805r.setEnabled(z);
    }

    public final C32224a<C13598b0> getBackClickListener() {
        return this.f28798h;
    }

    public final String getFansClubName() {
        return this.f28807t;
    }

    public final String getLastFansClubName() {
        return this.f28808u;
    }

    public final View getRoot() {
        return this.f28799i;
    }

    public void onClick(View view) {
        Context context;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyNameWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        IBinder iBinder = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.cte) {
            C12925w wVar = getModifyBottomPage().f36949a;
            if (wVar != null) {
                wVar.mo5085n();
            }
            this.f28803p.clearFocus();
            this.f28803p.setText("");
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ctg) {
            this.f28803p.clearFocus();
            this.f28803p.setText("");
            EditText editText = this.f28803p;
            if (editText != null) {
                editText.clearFocus();
            }
            InputMethodManager inputMethodManager = (InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
            if (inputMethodManager != null) {
                if (editText != null) {
                    iBinder = editText.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
            postDelayed(new C9166x3(this), 300);
            C32224a<C13598b0> aVar = this.f28798h;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.gyb) {
            mo9958d(false);
            String str = this.f28807t;
            C50326ly0 ly02 = new C50326ly0();
            ly02.f137706d = str;
            C13598b0 b0Var = C13598b0.f38549a;
            new C12220e(2, ly02, (C49712hj1) null).mo9225i().mo123420E(new C9158w3(this));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyNameWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setBackClickListener(C32224a<C13598b0> aVar) {
        this.f28798h = aVar;
    }

    public final void setFansClubName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f28807t = str;
    }

    public final void setLastFansClubName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f28808u = str;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f28799i = view;
    }
}
