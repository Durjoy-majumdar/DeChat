package qj1;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.os.Message;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d60.C58124b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import lc3.C10485b;
import ok1.C62042e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C64674r41;
import wh1.C66114a;

/* renamed from: qj1.mf */
public final class C12522mf extends C62660c {

    /* renamed from: A */
    public final C13601g f35990A;

    /* renamed from: B */
    public final C13601g f35991B;

    /* renamed from: C */
    public final C13601g f35992C;

    /* renamed from: p */
    public final C58124b f35993p;

    /* renamed from: q */
    public final String f35994q = "FinderLiveTopCommentPlugin";

    /* renamed from: r */
    public final C13601g f35995r;

    /* renamed from: s */
    public final C13601g f35996s;

    /* renamed from: t */
    public final C13601g f35997t;

    /* renamed from: u */
    public final int f35998u;

    /* renamed from: v */
    public final int f35999v;

    /* renamed from: w */
    public final int f36000w;

    /* renamed from: x */
    public final int f36001x;

    /* renamed from: y */
    public View f36002y;

    /* renamed from: z */
    public final long f36003z;

    /* renamed from: qj1.mf$a */
    public static final class C12523a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36004d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12523a(ViewGroup viewGroup) {
            super(0);
            this.f36004d = viewGroup;
        }

        public Object invoke() {
            return (TextView) this.f36004d.findViewById(C0966R.C0970id.e0k);
        }
    }

    /* renamed from: qj1.mf$b */
    public static final class C12524b extends C87413o implements C32224a<ScrollView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36005d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12524b(ViewGroup viewGroup) {
            super(0);
            this.f36005d = viewGroup;
        }

        public Object invoke() {
            return (ScrollView) this.f36005d.findViewById(C0966R.C0970id.e0l);
        }
    }

    /* renamed from: qj1.mf$c */
    public static final class C12525c extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C12522mf f36006d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12525c(C12522mf mfVar) {
            super(0);
            this.f36006d = mfVar;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler("FinderLiveTopCommentPlugin", (MMHandler.Callback) new C12557nf(this.f36006d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: qj1.mf$d */
    public static final class C12526d extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36007d;

        /* renamed from: e */
        public final /* synthetic */ C12522mf f36008e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12526d(ViewGroup viewGroup, C12522mf mfVar) {
            super(0);
            this.f36007d = viewGroup;
            this.f36008e = mfVar;
        }

        public Object invoke() {
            C8479f0 f0Var = new C8479f0();
            T ofFloat = ObjectAnimator.ofFloat(this.f36007d, "alpha", new float[]{0.0f, 1.0f});
            f0Var.f27484d = ofFloat;
            ofFloat.setDuration(300);
            ((ObjectAnimator) f0Var.f27484d).setInterpolator(new DecelerateInterpolator());
            ((ObjectAnimator) f0Var.f27484d).addListener(new C12582of(f0Var, this.f36008e));
            return (ObjectAnimator) f0Var.f27484d;
        }
    }

    /* renamed from: qj1.mf$e */
    public static final class C12527e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12527e(ViewGroup viewGroup) {
            super(0);
            this.f36009d = viewGroup;
        }

        public Object invoke() {
            return (TextView) this.f36009d.findViewById(C0966R.C0970id.e0m);
        }
    }

    /* renamed from: qj1.mf$f */
    public static final class C12528f extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36010d;

        /* renamed from: e */
        public final /* synthetic */ C12522mf f36011e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12528f(ViewGroup viewGroup, C12522mf mfVar) {
            super(0);
            this.f36010d = viewGroup;
            this.f36011e = mfVar;
        }

        public Object invoke() {
            C8479f0 f0Var = new C8479f0();
            T ofFloat = ObjectAnimator.ofFloat(this.f36010d, "alpha", new float[]{1.0f, 0.0f});
            f0Var.f27484d = ofFloat;
            ofFloat.setDuration(300);
            ((ObjectAnimator) f0Var.f27484d).setInterpolator(new DecelerateInterpolator());
            ((ObjectAnimator) f0Var.f27484d).addListener(new C12650rf(f0Var, this.f36011e));
            return (ObjectAnimator) f0Var.f27484d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12522mf(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35993p = bVar;
        this.f35995r = C36568h.m40985a(new C12527e(viewGroup));
        this.f35996s = C36568h.m40985a(new C12523a(viewGroup));
        this.f35997t = C36568h.m40985a(new C12524b(viewGroup));
        this.f35998u = 1;
        this.f35999v = 2;
        this.f36000w = 3;
        this.f36001x = 4;
        long b = ((long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderLiveTopCommentDisplayTimeSec", 10)) * 1000;
        this.f36003z = b;
        if (!mo82893g0()) {
            int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.avw);
            viewGroup.setPadding(dimensionPixelSize, viewGroup.getPaddingTop(), dimensionPixelSize, viewGroup.getPaddingBottom());
        }
        Log.m105924i("FinderLiveTopCommentPlugin", "STAY_DURATION:" + b);
        ((FinderLiveInterceptTouchRelativeLayout) viewGroup.findViewById(C0966R.C0970id.e0j)).setInterceptTouch(true);
        mo12152a1().getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        mo12152a1().getPaint().setStrokeWidth(1.0f);
        this.f35990A = C36568h.m40985a(new C12525c(this));
        this.f35991B = C36568h.m40985a(new C12526d(viewGroup, this));
        this.f35992C = C36568h.m40985a(new C12528f(viewGroup, this));
    }

    /* renamed from: Z0 */
    public static final String m12080Z0(C12522mf mfVar, String str, ImageSpan imageSpan, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder("createTopCommentMsg:");
        if (str.length() > 0) {
            sb.append(str);
            sb4.append("anchorTag:" + str + ',');
        }
        if (imageSpan != null) {
            sb.append(" ");
            sb4.append("globalBadgeSpan:true,");
        }
        sb.append(str2 == null ? "" : str2);
        sb4.append("content:" + str2 + '!');
        C62042e eVar = C62042e.f176370a;
        String str3 = mfVar.f35994q;
        String sb5 = sb4.toString();
        C87412m.m108593f(sb5, "logMsg.toString()");
        eVar.mo86998D1(str3, sb5);
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "result.toString()");
        return sb6;
    }

    /* renamed from: d1 */
    public static final String m12081d1(boolean z, boolean z2) {
        if (z) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.m1f);
            C87412m.m108593f(string, "{\n                MMAppl…_assistant)\n            }");
            return string;
        } else if (z2) {
            String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360620mg0);
            C87412m.m108593f(string2, "{\n                MMAppl…ve_manager)\n            }");
            return string2;
        } else {
            String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dg_);
            C87412m.m108593f(string3, "{\n                MMAppl…or_tag_txt)\n            }");
            return string3;
        }
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
        if (z) {
            this.f166287d.setVisibility(8);
        } else {
            mo10792g(this.f177938i);
        }
    }

    /* renamed from: a1 */
    public final TextView mo12152a1() {
        return (TextView) this.f35996s.getValue();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final MMHandler mo12153b1() {
        return (MMHandler) ((C36570n) this.f35990A).getValue();
    }

    /* renamed from: c1 */
    public final void mo12154c1(View view) {
        int[] iArr = new int[2];
        C66114a.f190029a.mo90152d(view, iArr);
        int dimensionPixelOffset = iArr[1] + (mo82893g0() ? view.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3757d9) : view.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3749d0));
        if (this.f166287d.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, dimensionPixelOffset, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            if (mo82893g0()) {
                layoutParams2.width = C75044y4.m89990b(MMApplicationContext.getContext()).y;
            }
            this.f166287d.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: e1 */
    public final void mo12155e1(List<C64674r41> list) {
        C87412m.m108594g(list, "msgList");
        Message obtainMessage = mo12153b1().obtainMessage();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        obtainMessage.obj = arrayList;
        obtainMessage.what = this.f36001x;
        mo12153b1().sendMessage(obtainMessage);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo12153b1().removeMessages(this.f35998u);
        mo12153b1().removeMessages(this.f35999v);
        mo12153b1().removeMessages(this.f36000w);
    }
}
