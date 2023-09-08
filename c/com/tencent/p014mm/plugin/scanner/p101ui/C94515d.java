package com.tencent.p014mm.plugin.scanner.p101ui;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.scanner.p101ui.ProductUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.scanner.ui.d */
public class C94515d extends Preference {

    /* renamed from: J */
    public View f273315J;

    /* renamed from: K */
    public TextView f273316K;

    /* renamed from: L */
    public TextView f273317L;

    /* renamed from: M */
    public TextView f273318M;

    /* renamed from: N */
    public boolean f273319N = false;

    /* renamed from: P */
    public boolean f273320P = false;

    /* renamed from: Q */
    public Boolean f273321Q;

    /* renamed from: R */
    public String f273322R;

    /* renamed from: S */
    public Context f273323S;

    /* renamed from: T */
    public View.OnTouchListener f273324T;

    /* renamed from: U */
    public ViewTreeObserver.OnGlobalLayoutListener f273325U;

    /* renamed from: V */
    public C94518c f273326V;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.d$a */
    public class C94516a implements View.OnTouchListener {
        public C94516a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/DescriptionTextPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                Log.m105918d("MicroMsg.scanner.PlainTextPreference", "moreTv onTouch");
                C94515d.this.f273318M.setVisibility(4);
                C94515d.this.f273317L.setMaxLines(2000);
                C94515d dVar = C94515d.this;
                dVar.f273319N = true;
                C94518c cVar = dVar.f273326V;
                if (cVar != null) {
                    String str = dVar.f121285r;
                    Boolean bool = Boolean.TRUE;
                    ProductUI.C94500i iVar = (ProductUI.C94500i) cVar;
                    if (str != null && str.length() > 0) {
                        ProductUI.this.f273251z.put(str, bool);
                    }
                    C47511g gVar = ProductUI.this.f273232d;
                    if (gVar != null) {
                        gVar.notifyDataSetChanged();
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/scanner/ui/DescriptionTextPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.d$b */
    public class C94517b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C94517b() {
        }

        public void onGlobalLayout() {
            Log.m105918d("MicroMsg.scanner.PlainTextPreference", "summaryTv.getHeight() = " + C94515d.this.f273317L.getHeight() + ", summaryTv.getLineHeight() = " + C94515d.this.f273317L.getLineHeight());
            if (C94515d.this.f273317L.getText() != null && C94515d.this.f273317L.getHeight() > 0 && C94515d.this.f273317L.getLineHeight() > 0) {
                C94515d dVar = C94515d.this;
                if (dVar.f273321Q == null) {
                    if (dVar.f273317L.getHeight() / C94515d.this.f273317L.getLineHeight() > 5) {
                        C94515d dVar2 = C94515d.this;
                        if (!dVar2.f273320P && !dVar2.f273319N) {
                            dVar2.f273318M.setVisibility(0);
                            C94515d.this.f273317L.setMaxLines(5);
                            C94515d dVar3 = C94515d.this;
                            dVar3.f273320P = true;
                            C94518c cVar = dVar3.f273326V;
                            if (cVar != null) {
                                String str = dVar3.f121285r;
                                if (((str == null || str.length() <= 0) ? null : ProductUI.this.f273251z.get(str)) == null) {
                                    C94515d dVar4 = C94515d.this;
                                    C94518c cVar2 = dVar4.f273326V;
                                    String str2 = dVar4.f121285r;
                                    Boolean bool = Boolean.FALSE;
                                    ProductUI.C94500i iVar = (ProductUI.C94500i) cVar2;
                                    iVar.getClass();
                                    if (str2 != null && str2.length() > 0) {
                                        ProductUI.this.f273251z.put(str2, bool);
                                    }
                                    C47511g gVar = ProductUI.this.f273232d;
                                    if (gVar != null) {
                                        gVar.notifyDataSetChanged();
                                    }
                                }
                            }
                        }
                    }
                    Log.m105918d("MicroMsg.scanner.PlainTextPreference", "summaryTv.getHeight() / summaryTv.getLineHeight() = " + (C94515d.this.f273317L.getHeight() / C94515d.this.f273317L.getLineHeight()));
                }
            }
            C94515d.this.f273317L.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.d$c */
    public interface C94518c {
    }

    public C94515d(Activity activity) {
        super(activity);
        this.f121271G = C0966R.C0971layout.be5;
        this.f273323S = activity;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f273315J == null) {
            this.f273315J = mo1087x(viewGroup);
        }
        mo1086w(this.f273315J);
        return this.f273315J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f273316K == null) {
            this.f273316K = (TextView) view.findViewById(16908310);
        }
        if (this.f273317L == null) {
            this.f273317L = (TextView) view.findViewById(16908304);
        }
        if (this.f273318M == null) {
            this.f273318M = (TextView) view.findViewById(C0966R.C0970id.gyw);
        }
        if (this.f273324T == null) {
            C94516a aVar = new C94516a();
            this.f273324T = aVar;
            this.f273318M.setOnTouchListener(aVar);
        }
        C94518c cVar = this.f273326V;
        if (cVar != null) {
            String str = this.f121285r;
            Boolean bool = (str == null || str.length() <= 0) ? null : ProductUI.this.f273251z.get(str);
            this.f273321Q = bool;
            if (bool == null) {
                this.f273318M.setVisibility(8);
                this.f273317L.setMaxLines(6);
            } else if (bool.booleanValue()) {
                this.f273318M.setVisibility(8);
                this.f273317L.setMaxLines(2000);
            } else {
                this.f273318M.setVisibility(0);
                this.f273317L.setMaxLines(5);
            }
        } else {
            this.f273318M.setVisibility(8);
            this.f273317L.setMaxLines(6);
        }
        if (this.f273325U == null) {
            this.f273325U = new C94517b();
            this.f273317L.getViewTreeObserver().addOnGlobalLayoutListener(this.f273325U);
        }
        if (Util.isNullOrNil(this.f273322R)) {
            this.f273316K.setVisibility(8);
            return;
        }
        this.f273316K.setText(this.f273322R);
        this.f273316K.setVisibility(0);
    }
}
