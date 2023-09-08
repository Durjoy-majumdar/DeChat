package ib3;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bb3.C92221d;
import cb3.C92392c;
import cb3.C92400k;
import cb3.C92410t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import xa3.C102587c;

/* renamed from: ib3.o */
public abstract class C98648o extends C98628a {

    /* renamed from: S */
    public static float f289231S = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: T */
    public static int f289232T = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* renamed from: U */
    public static int f289233U = ((int) ((f289231S * 40.0f) + 0.5f));

    /* renamed from: B */
    public ImageView f289234B;

    /* renamed from: C */
    public WXRTEditText f289235C;

    /* renamed from: D */
    public WXRTEditText f289236D;

    /* renamed from: E */
    public LinearLayout f289237E;

    /* renamed from: F */
    public TextView f289238F;

    /* renamed from: G */
    public TextView f289239G;

    /* renamed from: H */
    public ImageView f289240H;

    /* renamed from: I */
    public View f289241I;

    /* renamed from: J */
    public LinearLayout f289242J;

    /* renamed from: K */
    public LinearLayout f289243K;

    /* renamed from: L */
    public LinearLayout f289244L;

    /* renamed from: M */
    public LinearLayout f289245M;

    /* renamed from: N */
    public LinearLayout f289246N;

    /* renamed from: P */
    public LinearLayout f289247P;

    /* renamed from: Q */
    public LinearLayout f289248Q;

    /* renamed from: R */
    public View.OnClickListener f289249R = new o$$e(this);

    public C98648o(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        this.f289234B = (ImageView) view.findViewById(C0966R.C0970id.cav);
        this.f289241I = view.findViewById(C0966R.C0970id.l4x);
        this.f289237E = (LinearLayout) view.findViewById(C0966R.C0970id.hid);
        this.f289242J = (LinearLayout) view.findViewById(C0966R.C0970id.hj4);
        this.f289238F = (TextView) view.findViewById(C0966R.C0970id.hie);
        this.f289239G = (TextView) view.findViewById(C0966R.C0970id.hib);
        this.f289240H = (ImageView) view.findViewById(C0966R.C0970id.hic);
        this.f289238F.setTextSize(16.0f);
        this.f289239G.setTextSize(12.0f);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.f358870hj2);
        this.f289243K = linearLayout;
        linearLayout.setVisibility(8);
        ((LinearLayout) view.findViewById(C0966R.C0970id.hix)).setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.hia);
        this.f289245M = linearLayout2;
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(C0966R.C0970id.hpr);
        this.f289246N = linearLayout3;
        linearLayout3.setBackgroundColor(1347529272);
        this.f289246N.setVisibility(8);
        this.f289246N.setOnClickListener(new o$$b(this));
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(C0966R.C0970id.hpv);
        this.f289247P = linearLayout4;
        linearLayout4.setBackgroundColor(1347529272);
        this.f289247P.setVisibility(4);
        LinearLayout linearLayout5 = (LinearLayout) view.findViewById(C0966R.C0970id.hpt);
        this.f289248Q = linearLayout5;
        linearLayout5.setBackgroundColor(1347529272);
        this.f289248Q.setVisibility(4);
        LinearLayout linearLayout6 = (LinearLayout) view.findViewById(C0966R.C0970id.cbj);
        this.f289244L = linearLayout6;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout6.getLayoutParams();
        layoutParams.width = f289232T - f289233U;
        layoutParams.height = -2;
        this.f289244L.setLayoutParams(layoutParams);
        this.f289236D = (WXRTEditText) view.findViewById(C0966R.C0970id.al4);
        this.f289235C = (WXRTEditText) view.findViewById(C0966R.C0970id.al6);
        ((LinearLayout) view.findViewById(C0966R.C0970id.al5)).setOnClickListener(new o$$c(this));
        ((LinearLayout) view.findViewById(C0966R.C0970id.al7)).setOnClickListener(new o$$d(this));
        this.f289236D.setEditTextType(2);
        this.f289235C.setEditTextType(1);
        this.f289235C.f283150F = this;
        WXRTEditText wXRTEditText = this.f289236D;
        wXRTEditText.f283150F = this;
        if (bVar.f283197m != 2 || !this.f289192z.f283198n) {
            wXRTEditText.setKeyListener((KeyListener) null);
            this.f289236D.setEnabled(false);
            this.f289236D.setFocusable(false);
            this.f289235C.setKeyListener((KeyListener) null);
            this.f289235C.setEnabled(false);
            this.f289235C.setFocusable(false);
        }
        this.f289192z.mo134911i(this.f289235C);
        this.f289192z.mo134911i(this.f289236D);
    }

    /* renamed from: B */
    public View mo138062B() {
        return null;
    }

    /* renamed from: C */
    public View mo138063C() {
        return null;
    }

    /* renamed from: D */
    public C92392c mo138064D(View view) {
        return C92410t.m116227a(view);
    }

    /* renamed from: E */
    public void mo138065E(C102587c cVar) {
        if (!cVar.f302071b) {
            if (this.f289235C.hasFocus()) {
                this.f289235C.clearFocus();
            }
            if (this.f289236D.hasFocus()) {
                this.f289236D.clearFocus();
            }
        } else if (cVar.f302077h) {
            this.f289235C.requestFocus();
        } else {
            this.f289236D.requestFocus();
        }
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        Log.m105924i("Micromsg.NoteOtherItemHolder", "ImageItemHolder position is " + mo17364k());
        this.f289235C.setPosInDataList(i);
        this.f289236D.setPosInDataList(i);
        if (C92400k.f264411N) {
            C92400k.m116191h().mo126371G(mo138064D(this.f44854d), this.f44854d, false);
        }
        cVar.f302073d = this.f289235C;
        cVar.f302074e = this.f289236D;
        cVar.f302075f = null;
        mo138065E(cVar);
        if (this.f289237E.getVisibility() == 0) {
            if (cVar.f302078i) {
                this.f289237E.setBackgroundResource(C0966R.C0969drawable.b3_);
            } else {
                this.f289237E.setBackgroundResource(C0966R.C0969drawable.b39);
            }
        }
        if (mo138062B() != null) {
            int y = mo138058y();
            View B = mo138062B();
            Context context = B.getContext();
            if (y == 20) {
                B.setContentDescription(context.getResources().getString(C0966R.string.lkt));
                context.getResources().getString(C0966R.string.lkt);
            } else if (y == 30) {
                B.setContentDescription(context.getResources().getString(C0966R.string.b7n));
                context.getResources().getString(C0966R.string.b7n);
            } else if (y == -3) {
                B.setContentDescription(context.getResources().getString(C0966R.string.fjp));
                context.getResources().getString(C0966R.string.fjp);
            } else if (y == -2) {
                B.setContentDescription(context.getResources().getString(C0966R.string.at5));
                context.getResources().getString(C0966R.string.at5);
            } else if (y == 2) {
                B.setContentDescription(context.getResources().getString(C0966R.string.h_6));
                context.getResources().getString(C0966R.string.h_6);
            } else if (y == 3) {
                B.setContentDescription(context.getResources().getString(C0966R.string.h_7));
                context.getResources().getString(C0966R.string.h_7);
            } else if (y == 4) {
                B.setContentDescription(context.getResources().getString(C0966R.string.lku));
                context.getResources().getString(C0966R.string.lku);
            } else if (y == 5) {
                B.setContentDescription(context.getResources().getString(C0966R.string.h_5));
                context.getResources().getString(C0966R.string.h_5);
            } else if (y == 6) {
                B.setContentDescription(context.getResources().getString(C0966R.string.lkt));
                context.getResources().getString(C0966R.string.lkt);
            }
        }
        View C = mo138063C();
        if (C != null) {
            C.setOnLongClickListener(new o$$a(i));
        }
    }
}
