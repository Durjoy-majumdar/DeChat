package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.FlowLayout;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.plugin.ipcall.model.IPCallFeedbackConfigUpdater;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kg3.C76577a;
import p523fp.C32147e;
import qo3.C77390c0;
import s12.C110715e;
import s12.C110716f;
import t12.C110899d;
import te3.C49828ic2;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.f0 */
public class C105408f0 extends C77390c0 {

    /* renamed from: M */
    public static final /* synthetic */ int f313376M = 0;

    /* renamed from: A */
    public PasterEditText f313377A;

    /* renamed from: B */
    public Button f313378B;

    /* renamed from: C */
    public Button f313379C;

    /* renamed from: D */
    public TextView f313380D;

    /* renamed from: E */
    public Animation f313381E;

    /* renamed from: F */
    public ArrayList<C105410b> f313382F;

    /* renamed from: G */
    public MMHandler f313383G = new MMHandler();

    /* renamed from: H */
    public View.OnClickListener f313384H = new C105409a();

    /* renamed from: I */
    public int f313385I = C0966R.C0969drawable.f5015u5;

    /* renamed from: J */
    public int f313386J = C0966R.color.f3381qn;

    /* renamed from: K */
    public int f313387K = C0966R.C0969drawable.f5012u2;

    /* renamed from: L */
    public int f313388L = C0966R.color.al_;

    /* renamed from: d */
    public int f313389d = 0;

    /* renamed from: e */
    public int f313390e;

    /* renamed from: f */
    public long f313391f;

    /* renamed from: g */
    public Activity f313392g;

    /* renamed from: h */
    public Context f313393h;

    /* renamed from: i */
    public View f313394i;

    /* renamed from: j */
    public ScrollView f313395j;

    /* renamed from: n */
    public LinearLayout f313396n;

    /* renamed from: o */
    public LinearLayout f313397o;

    /* renamed from: p */
    public RelativeLayout f313398p;

    /* renamed from: q */
    public RelativeLayout f313399q;

    /* renamed from: r */
    public RelativeLayout f313400r;

    /* renamed from: s */
    public ImageView f313401s;

    /* renamed from: t */
    public ImageView f313402t;

    /* renamed from: u */
    public ImageView f313403u;

    /* renamed from: v */
    public int f313404v;

    /* renamed from: w */
    public FrameLayout f313405w;

    /* renamed from: x */
    public FlowLayout f313406x;

    /* renamed from: y */
    public Button f313407y;

    /* renamed from: z */
    public Button f313408z;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.f0$a */
    public class C105409a implements View.OnClickListener {
        public C105409a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C105408f0 f0Var = C105408f0.this;
            if (view == f0Var.f313398p) {
                f0Var.mo150142c(1);
            } else if (view == f0Var.f313399q) {
                f0Var.mo150142c(2);
            } else if (view == f0Var.f313400r) {
                f0Var.mo150142c(3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.f0$b */
    public static class C105410b {

        /* renamed from: a */
        public String f313410a;

        /* renamed from: b */
        public String f313411b;

        /* renamed from: c */
        public boolean f313412c;
    }

    public C105408f0(Activity activity, Context context, int i, long j) {
        super(context, C0966R.style.a66);
        C110716f fVar;
        setCancelable(false);
        this.f313393h = context;
        this.f313390e = i;
        this.f313391f = j;
        this.f313392g = activity;
        String str = null;
        View inflate = View.inflate(context, C0966R.C0971layout.b2h, (ViewGroup) null);
        this.f313394i = inflate;
        this.f313396n = (LinearLayout) inflate.findViewById(C0966R.C0970id.fji);
        this.f313397o = (LinearLayout) this.f313394i.findViewById(C0966R.C0970id.fjj);
        Animation loadAnimation = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2328p);
        this.f313381E = loadAnimation;
        loadAnimation.setDuration(200);
        this.f313381E.setStartOffset(100);
        this.f313405w = (FrameLayout) this.f313394i.findViewById(C0966R.C0970id.eal);
        this.f313406x = (FlowLayout) this.f313394i.findViewById(C0966R.C0970id.eak);
        this.f313407y = (Button) this.f313394i.findViewById(C0966R.C0970id.bl9);
        this.f313408z = (Button) this.f313394i.findViewById(C0966R.C0970id.bl_);
        this.f313377A = (PasterEditText) this.f313394i.findViewById(C0966R.C0970id.blm);
        this.f313407y.setOnClickListener(new C105413g0(this));
        this.f313408z.setOnClickListener(new C105416h0(this));
        if (IPCallFeedbackConfigUpdater.f313240c == null) {
            IPCallFeedbackConfigUpdater.f313240c = new IPCallFeedbackConfigUpdater();
        }
        IPCallFeedbackConfigUpdater iPCallFeedbackConfigUpdater = IPCallFeedbackConfigUpdater.f313240c;
        if (iPCallFeedbackConfigUpdater.f313241a == null) {
            Log.m105924i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource try get cacheResUpdate");
            String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(39, 1);
            if (!Util.isNullOrNil(AD)) {
                byte[] O = C86013q1.m106433O(AD, 0, -1);
                if (O != null) {
                    iPCallFeedbackConfigUpdater.mo150082a(O);
                } else {
                    Log.m105920e("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource file not exist");
                }
            } else {
                Log.m105924i("MicroMsg.IPCallFeedbackConfigUpdater", "getCurrentLanugageResource get cacheResUpdate no filePath");
            }
        }
        if (iPCallFeedbackConfigUpdater.f313241a != null) {
            String loadApplicationLanguageSettings = LocaleUtil.loadApplicationLanguageSettings(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if ("language_default".equalsIgnoreCase(loadApplicationLanguageSettings) && Locale.getDefault() != null) {
                loadApplicationLanguageSettings = Locale.getDefault().toString();
            }
            Iterator<C110716f> it = iPCallFeedbackConfigUpdater.f313241a.iterator();
            while (it.hasNext()) {
                fVar = it.next();
                if (loadApplicationLanguageSettings.equalsIgnoreCase(fVar.f331176a)) {
                    Log.m105925i("MicroMsg.IPCallFeedbackConfigUpdater", "curLang: %s,resListCount: %s", loadApplicationLanguageSettings, Integer.valueOf(iPCallFeedbackConfigUpdater.f313241a.size()));
                    break;
                }
            }
            Log.m105921e("MicroMsg.IPCallFeedbackConfigUpdater", "no lanuage equal curLang, curLang: %s,resListCount: %s", loadApplicationLanguageSettings, Integer.valueOf(iPCallFeedbackConfigUpdater.f313241a.size()));
        }
        fVar = null;
        if (fVar != null) {
            ArrayList<C110715e> arrayList = fVar.f331177b;
            ArrayList<C105410b> arrayList2 = new ArrayList<>();
            Iterator<C110715e> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C110715e next = it4.next();
                C105410b bVar = new C105410b();
                bVar.f313410a = next.f331174a;
                bVar.f313411b = next.f331175b;
                bVar.f313412c = false;
                arrayList2.add(bVar);
            }
            this.f313382F = arrayList2;
            Iterator<C105410b> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                C105410b next2 = it5.next();
                FlowLayout flowLayout = this.f313406x;
                TextView textView = new TextView(getContext());
                textView.setTextSize(0, getContext().getResources().getDimension(C0966R.dimen.a5x) * C76577a.m92165p(getContext()));
                textView.setBackgroundResource(this.f313385I);
                textView.setTextColor(this.f313393h.getResources().getColor(this.f313386J));
                textView.setTag(next2);
                textView.setGravity(17);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setText(next2.f313411b);
                textView.setOnClickListener(new C105419i0(this));
                flowLayout.addView(textView);
            }
        }
        this.f313398p = (RelativeLayout) this.f313394i.findViewById(C0966R.C0970id.fjr);
        this.f313399q = (RelativeLayout) this.f313394i.findViewById(C0966R.C0970id.fjs);
        this.f313400r = (RelativeLayout) this.f313394i.findViewById(C0966R.C0970id.fjt);
        this.f313398p.setOnClickListener(this.f313384H);
        this.f313399q.setOnClickListener(this.f313384H);
        this.f313400r.setOnClickListener(this.f313384H);
        this.f313401s = (ImageView) this.f313394i.findViewById(C0966R.C0970id.f5x);
        this.f313402t = (ImageView) this.f313394i.findViewById(C0966R.C0970id.f5y);
        this.f313403u = (ImageView) this.f313394i.findViewById(C0966R.C0970id.f5z);
        this.f313404v = 0;
        mo150142c(0);
        this.f313378B = (Button) this.f313394i.findViewById(C0966R.C0970id.f8r);
        this.f313379C = (Button) this.f313394i.findViewById(C0966R.C0970id.f8s);
        this.f313380D = (TextView) this.f313394i.findViewById(C0966R.C0970id.f8u);
        C49828ic2 e = C110899d.m151191e();
        if (e != null) {
            str = String.format(this.f313393h.getString(C0966R.string.f360917fx1), new Object[]{e.f135216q});
        }
        if (Util.isNullOrNil(str)) {
            this.f313380D.setVisibility(4);
        } else {
            this.f313380D.setVisibility(0);
            this.f313380D.setText(str);
        }
        this.f313378B.setOnClickListener(new C105423j0(this));
        this.f313379C.setOnClickListener(new C105425k0(this));
        this.f313395j = (ScrollView) this.f313394i.findViewById(C0966R.C0970id.czi);
        View childAt = ((ViewGroup) this.f313392g.findViewById(16908290)).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new C105402d0(this, childAt));
    }

    /* renamed from: c */
    public final void mo150142c(int i) {
        this.f313404v = i;
        if (i == 0) {
            this.f313401s.setVisibility(4);
            this.f313402t.setVisibility(4);
            this.f313403u.setVisibility(4);
            this.f313408z.setEnabled(false);
            mo150144e(0);
        } else if (i == 1) {
            this.f313401s.setVisibility(0);
            this.f313402t.setVisibility(4);
            this.f313403u.setVisibility(4);
            this.f313408z.setEnabled(true);
            mo150144e(1);
        } else if (i == 2) {
            this.f313401s.setVisibility(0);
            this.f313402t.setVisibility(0);
            this.f313403u.setVisibility(4);
            this.f313408z.setEnabled(true);
            mo150144e(1);
        } else if (i == 3) {
            this.f313401s.setVisibility(0);
            this.f313402t.setVisibility(0);
            this.f313403u.setVisibility(0);
            this.f313408z.setEnabled(true);
            mo150144e(0);
        }
    }

    /* renamed from: d */
    public final String mo150143d(int i) {
        if (i == 3) {
            return "";
        }
        String str = !Util.isNullOrNil(this.f313377A.getText().toString().trim()) ? "0" : "";
        ArrayList<C105410b> arrayList = this.f313382F;
        if (arrayList != null) {
            Iterator<C105410b> it = arrayList.iterator();
            while (it.hasNext()) {
                C105410b next = it.next();
                if (next.f313412c) {
                    if (str.equals("")) {
                        str = next.f313410a;
                    } else {
                        str = str + "_" + next.f313410a;
                    }
                }
            }
        }
        return str;
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.IPCallFeedbackDialog", "dismiss exception, e = " + e.getMessage());
        }
    }

    /* renamed from: e */
    public void mo150144e(int i) {
        if (i == 0) {
            this.f313396n.setVisibility(0);
            this.f313397o.setVisibility(4);
            if (this.f313389d == 1) {
                ((LinearLayout.LayoutParams) this.f313405w.getLayoutParams()).height = 0;
                this.f313405w.requestLayout();
            }
            Util.hideVKB(this.f313394i);
        } else if (i == 1) {
            this.f313396n.setVisibility(0);
            this.f313397o.setVisibility(4);
            if (this.f313389d == 0) {
                ((LinearLayout.LayoutParams) this.f313405w.getLayoutParams()).height = -2;
                this.f313405w.requestLayout();
                this.f313405w.startAnimation(this.f313381E);
            }
        } else if (i == 2) {
            this.f313396n.setVisibility(4);
            this.f313397o.setVisibility(0);
            Util.hideVKB(this.f313394i);
        }
        this.f313389d = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f313394i);
        getWindow().getAttributes().width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        mo150144e(0);
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void show() {
        super.show();
    }
}
