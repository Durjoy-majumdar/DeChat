package vp2;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94601a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ir2.C60616b;
import lp2.C46885f;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C77407n;
import qo3.C89779i0;
import rq2.C101431r;
import rq2.C63505q;
import te3.C52084y82;
import tp2.C101914d;
import up2.C102060a;
import vr2.C102236a0;
import zt3.C119157j;

/* renamed from: vp2.a */
public class C52974a extends C102060a {

    /* renamed from: vp2.a$b */
    public static class C52975b implements C11385n {

        /* renamed from: d */
        public Context f147855d;

        /* renamed from: e */
        public SnsInfo f147856e;

        /* renamed from: f */
        public C77407n f147857f;

        /* renamed from: g */
        public View f147858g;

        /* renamed from: h */
        public ImageView f147859h;

        /* renamed from: i */
        public TextView f147860i;

        /* renamed from: j */
        public TextView f147861j;

        /* renamed from: n */
        public TextView f147862n;

        /* renamed from: o */
        public C89779i0 f147863o = null;

        /* renamed from: p */
        public AdClickActionInfo f147864p;

        /* renamed from: vp2.a$b$a */
        public class C52976a implements Runnable {
            public C52976a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$3");
                try {
                    C52975b bVar = C52975b.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
                    C89779i0 i0Var = bVar.f147863o;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
                    if (i0Var != null && i0Var.isShowing()) {
                        i0Var.dismiss();
                    }
                    C77407n a = C52975b.m59287a(C52975b.this);
                    if (a != null && a.mo107563h()) {
                        a.mo107572p();
                    }
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$3");
            }
        }

        /* renamed from: vp2.a$b$b */
        public class C52977b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f147866d;

            /* renamed from: e */
            public final /* synthetic */ String f147867e;

            public C52977b(int i, String str) {
                this.f147866d = i;
                this.f147867e = str;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$4");
                try {
                    if (this.f147866d == 0) {
                        C76912y0.m92768g(C52975b.m59288b(C52975b.this), TextUtils.isEmpty(this.f147867e) ? C52975b.m59288b(C52975b.this).getString(C0966R.string.j9u) : this.f147867e);
                    } else {
                        C76912y0.m92767f(C52975b.m59288b(C52975b.this), TextUtils.isEmpty(this.f147867e) ? C52975b.m59288b(C52975b.this).getString(C0966R.string.j9t) : this.f147867e);
                    }
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$4");
            }
        }

        public C52975b(Context context, SnsInfo snsInfo) {
            this.f147855d = context;
            this.f147856e = snsInfo;
        }

        /* renamed from: a */
        public static /* synthetic */ C77407n m59287a(C52975b bVar) {
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            C77407n nVar = bVar.f147857f;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            return nVar;
        }

        /* renamed from: b */
        public static /* synthetic */ Context m59288b(C52975b bVar) {
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            Context context = bVar.f147855d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            return context;
        }

        /* renamed from: c */
        public void mo73732c(AdClickActionInfo adClickActionInfo) {
            SnsMethodCalculate.markStartTimeMs("sendRequest", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            SnsInfo snsInfo = this.f147856e;
            if (adClickActionInfo != null) {
                C46885f fVar = new C46885f(adClickActionInfo.f273616D, adClickActionInfo.f273617E, snsInfo.getUxinfo(), "");
                C86709a0.m107524d().mo123455a(4743, this);
                C86709a0.m107524d().mo123460f(fVar);
                C89779i0 i0Var = this.f147863o;
                if (i0Var == null) {
                    Context context = this.f147855d;
                    this.f147863o = C76879j.m92723Q(context, "", context.getString(C0966R.string.gap), true, true, (DialogInterface.OnCancelListener) null);
                } else if (!i0Var.isShowing()) {
                    this.f147863o.show();
                }
            }
            SnsMethodCalculate.markEndTimeMs("sendRequest", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            try {
                ((C119157j) C119157j.f356862d).mo183895z(new C52976a());
                C86709a0.m107524d().mo123470p(4743, this);
                int i3 = -1;
                String str2 = "";
                if (i == 0 && i2 == 0) {
                    if (yVar instanceof C46885f) {
                        C52084y82 y822 = (C52084y82) ((C46885f) yVar).mo72086k1();
                        if (y822 != null) {
                            i3 = y822.f145173d;
                            str2 = Util.nullAsNil(y822.f145174e);
                        }
                        Log.m105918d("SnsAd.AdCoupon", "the coupon result is " + i3);
                        ((C119157j) C119157j.f356862d).mo183895z(new C52977b(i3, str2));
                        C63505q.m74843b(new C52978a(this.f147856e, i3, str2, this.f147864p));
                        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
                    }
                }
                Log.m105928w("SnsAd.AdCoupon", "the coupon errType is " + i + ", errCode is " + i2);
                Log.m105918d("SnsAd.AdCoupon", "the coupon result is " + i3);
                ((C119157j) C119157j.f356862d).mo183895z(new C52977b(i3, str2));
                C63505q.m74843b(new C52978a(this.f147856e, i3, str2, this.f147864p));
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        }
    }

    /* renamed from: vp2.a$a */
    public static class C52978a extends C94601a.C94602a {
        public C52978a(SnsInfo snsInfo, int i, String str, AdClickActionInfo adClickActionInfo) {
            super(i, str);
            this.f273770h = 1;
            if (snsInfo != null) {
                this.f273764b = Util.nullAsNil(snsInfo.getUxinfo());
                this.f273763a = C102236a0.m134728W(snsInfo);
                if (snsInfo.getAdXml() != null) {
                    this.f273765c = Util.nullAsNil(snsInfo.getAdXml().adExtInfo);
                    if (adClickActionInfo != null) {
                        this.f273766d = Util.nullAsNil(adClickActionInfo.f273616D);
                        this.f273767e = Util.nullAsNil(adClickActionInfo.f273617E);
                    }
                }
            }
        }
    }

    public C52974a(AdClickActionInfo adClickActionInfo) {
        this.f300548a = adClickActionInfo;
    }

    /* renamed from: c */
    public boolean mo73731c(View view, int i, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
        if (adClickActionInfo == null || snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
            return false;
        }
        C101431r.m133118a((SnsAdClick) dVar.mo141403a("snsAdClick", null), 42);
        C52975b bVar = new C52975b(view.getContext(), snsInfo);
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        bVar.f147864p = adClickActionInfo;
        if (bVar.f147857f == null) {
            SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            View inflate = LayoutInflater.from(bVar.f147855d).inflate(C0966R.C0971layout.c2a, (ViewGroup) null);
            bVar.f147858g = inflate;
            View findViewById = inflate.findViewById(C0966R.C0970id.be4);
            TextView textView = (TextView) bVar.f147858g.findViewById(C0966R.C0970id.k9x);
            bVar.f147859h = (ImageView) bVar.f147858g.findViewById(C0966R.C0970id.lll);
            bVar.f147860i = (TextView) bVar.f147858g.findViewById(C0966R.C0970id.llm);
            bVar.f147861j = (TextView) bVar.f147858g.findViewById(C0966R.C0970id.k_a);
            bVar.f147862n = (TextView) bVar.f147858g.findViewById(C0966R.C0970id.k_1);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C52979b(bVar));
            }
            if (textView != null) {
                textView.setText(C0966R.string.j9s);
                textView.setOnClickListener(new C52980c(bVar));
            }
            SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            C77407n nVar = new C77407n(bVar.f147855d, true, 0);
            bVar.f147857f = nVar;
            nVar.mo107569n(bVar.f147858g, true);
            bVar.f147857f.mo107559d(true);
        }
        SnsMethodCalculate.markStartTimeMs("updateUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        TextView textView2 = bVar.f147860i;
        if (textView2 != null) {
            textView2.setText(adClickActionInfo.f273619G);
        }
        TextView textView3 = bVar.f147861j;
        if (textView3 != null) {
            textView3.setText(adClickActionInfo.f273620H);
        }
        TextView textView4 = bVar.f147862n;
        if (textView4 != null) {
            textView4.setText(adClickActionInfo.f273621I);
        }
        C60616b.m70876a(C0966R.C0970id.jr4, adClickActionInfo.f273618F, bVar.f147859h);
        SnsMethodCalculate.markEndTimeMs("updateUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        if (!bVar.f147857f.mo107563h()) {
            bVar.f147857f.mo107573q();
        }
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
        return true;
    }
}
