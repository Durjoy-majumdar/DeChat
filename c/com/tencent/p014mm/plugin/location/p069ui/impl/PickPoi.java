package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import lg3.C76695c;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.PickPoi */
public class PickPoi extends FrameLayout {

    /* renamed from: d */
    public Context f346439d;

    /* renamed from: e */
    public Animation f346440e;

    /* renamed from: f */
    public ImageView f346441f;

    /* renamed from: g */
    public C78083b f346442g;

    /* renamed from: h */
    public C115568o f346443h = new C115568o();

    /* renamed from: i */
    public boolean f346444i = true;

    /* renamed from: j */
    public C115565n f346445j = null;

    /* renamed from: n */
    public C78083b.C78084a f346446n = new C115530b();

    /* renamed from: o */
    public C115538c0.C115547h f346447o;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.PickPoi$a */
    public class C115529a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f346448d;

        /* renamed from: e */
        public final /* synthetic */ Context f346449e;

        public C115529a(View view, Context context) {
            this.f346448d = view;
            this.f346449e = context;
        }

        public void run() {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f346448d.getLayoutParams();
            layoutParams.bottomMargin = ((int) ((((double) PickPoi.this.f346441f.getHeight()) / 2.0d) + 0.5d)) + C74942w4.m89784a(this.f346449e, 20);
            this.f346448d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.PickPoi$b */
    public class C115530b implements C78083b.C78084a {
        public C115530b() {
        }

        public void onLocationAddr(Addr addr) {
            Log.m105919d("MicroMsg.PickPoi", "onLocationAddr %s", addr.toString());
            C115568o oVar = PickPoi.this.f346443h;
            if (oVar == null) {
                Log.m105924i("MicroMsg.PickPoi", "error, empty poi!");
            } else if (oVar.mo175617a(addr)) {
                PickPoi pickPoi = PickPoi.this;
                if (pickPoi.f346445j != null) {
                    C115538c0.C115547h hVar = pickPoi.f346447o;
                    if (hVar != null) {
                        C115568o oVar2 = pickPoi.f346443h;
                        C115567n0 n0Var = (C115567n0) hVar;
                        n0Var.f346607a.f346544n.setOnCurPoiGet((C115538c0.C115547h) null);
                        if (oVar2 != null) {
                            n0Var.f346607a.f346534e1.mo175617a(oVar2.f346617j);
                            C115538c0 c0Var = n0Var.f346607a;
                            C115565n nVar = c0Var.f346550s;
                            if (nVar != null) {
                                C115568o oVar3 = c0Var.f346534e1;
                                String str = oVar3.f346613f;
                                String str2 = oVar3.f346614g;
                                nVar.f346601r = str;
                                nVar.f346602s = str2;
                                C115565n nVar2 = c0Var.f346551t;
                                nVar2.f346601r = str;
                                nVar2.f346602s = str2;
                            }
                        }
                    }
                    PickPoi.this.f346445j.notifyDataSetChanged();
                }
            }
        }
    }

    public PickPoi(Context context) {
        super(context);
        mo175540a(context);
    }

    /* renamed from: a */
    public final void mo175540a(Context context) {
        this.f346439d = context;
        this.f346442g = ((C78085c) C86312j.m106911c(C78085c.class)).oe0();
        this.f346440e = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2526ff);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b85, this, true);
        this.f346441f = (ImageView) inflate.findViewById(C0966R.C0970id.g46);
        if (C76695c.m92341b()) {
            this.f346441f.setImageResource(C0966R.C0969drawable.c56);
        }
        post(new C115529a(inflate, context));
    }

    /* renamed from: b */
    public void mo175541b(double d, double d2, boolean z, int i, String str, String str2) {
        C115568o oVar = new C115568o();
        this.f346443h = oVar;
        oVar.f346620m = 3;
        oVar.f346608a = this.f346439d.getResources().getString(C0966R.string.gav);
        C115568o oVar2 = this.f346443h;
        oVar2.f346611d = d;
        oVar2.f346610c = d2;
        oVar2.f346609b = "";
        oVar2.f346622o = str;
        oVar2.f346623p = str2;
        this.f346442g.mo108055b(this.f346446n);
        C118505d dVar = new C118505d(d, d2);
        dVar.f354672d = i;
        dVar.f354673e = str2;
        dVar.f354671c = 2;
        dVar.f354675g = z;
        this.f346442g.mo108054a(dVar, this.f346446n);
        this.f346444i = true;
    }

    public C115568o getPoi() {
        return this.f346443h;
    }

    public void setAdapter(C115565n nVar) {
        this.f346445j = nVar;
    }

    public void setLocationArrow(int i) {
        this.f346441f.setImageResource(i);
    }

    public void setOnCurPoiGet(C115538c0.C115547h hVar) {
        this.f346447o = hVar;
    }

    public PickPoi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo175540a(context);
    }

    public PickPoi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo175540a(context);
    }
}
