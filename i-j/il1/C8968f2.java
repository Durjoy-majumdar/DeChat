package il1;

import ak1.C54116w;
import ak1.C54117x;
import al1.C54134p;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nk1.C11193b;
import o40.C61926c;
import org.json.JSONObject;
import p185kq.C10383h;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C48779ay0;
import z04.C112550d0;
import zk1.C66880s0;
import zp3.C79406f;

/* renamed from: il1.f2 */
public final class C8968f2 {

    /* renamed from: a */
    public final View f28348a;

    /* renamed from: b */
    public String f28349b;

    /* renamed from: c */
    public String f28350c;

    /* renamed from: d */
    public C32226l<? super Boolean, C13598b0> f28351d;

    /* renamed from: e */
    public C32226l<? super String, C13598b0> f28352e;

    /* renamed from: f */
    public final WeImageView f28353f;

    /* renamed from: g */
    public final Button f28354g;

    /* renamed from: h */
    public final WeImageView f28355h;

    /* renamed from: i */
    public final TextView f28356i;

    /* renamed from: j */
    public final TextView f28357j;

    /* renamed from: k */
    public int f28358k;

    /* renamed from: l */
    public C48779ay0 f28359l;

    /* renamed from: m */
    public int f28360m;

    /* renamed from: n */
    public long f28361n;

    /* renamed from: il1.f2$a */
    public static final class C8969a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8968f2 f28362d;

        public C8969a(C8968f2 f2Var) {
            this.f28362d = f2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8968f2 f2Var = this.f28362d;
            f2Var.getClass();
            C61926c.m72668M(new C8989g2(f2Var));
            C32226l<? super Boolean, C13598b0> lVar = this.f28362d.f28351d;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.f2$b */
    public static final class C8970b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8968f2 f28363d;

        public C8970b(C8968f2 f2Var) {
            this.f28363d = f2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8968f2 f2Var = this.f28363d;
            f2Var.getClass();
            C61926c.m72668M(new C8989g2(f2Var));
            C32226l<? super Boolean, C13598b0> lVar = this.f28363d.f28351d;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.f2$c */
    public static final class C8971c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WeImageView f28364d;

        public C8971c(WeImageView weImageView) {
            this.f28364d = weImageView;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f28364d.getHitRect(rect);
            rect.inset(-rect.width(), -rect.width());
            ViewParent parent = this.f28364d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f28364d));
        }
    }

    /* renamed from: il1.f2$d */
    public static final class C8972d extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C8968f2 f28365d;

        public C8972d(C8968f2 f2Var) {
            this.f28365d = f2Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            StringBuilder sb = new StringBuilder();
            sb.append("license click,licenseClickCallback is null:");
            sb.append(this.f28365d.f28352e == null);
            Log.m105924i("Finder.FinderLiveExceptionWidget", sb.toString());
            C32226l<? super String, C13598b0> lVar = this.f28365d.f28352e;
            if (lVar == null) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
                C88144b.m109791i(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else if (lVar != null) {
                lVar.invoke("https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(this.f28365d.f28348a.getContext().getResources().getColor(C0966R.color.Link_80));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: il1.f2$e */
    public static final class C8973e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8968f2 f28366d;

        /* renamed from: e */
        public final /* synthetic */ int f28367e;

        /* renamed from: f */
        public final /* synthetic */ C48779ay0 f28368f;

        /* renamed from: g */
        public final /* synthetic */ int f28369g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f28370h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8973e(C8968f2 f2Var, int i, C48779ay0 ay02, int i2, C32226l<? super Boolean, C13598b0> lVar) {
            super(0);
            this.f28366d = f2Var;
            this.f28367e = i;
            this.f28368f = ay02;
            this.f28369g = i2;
            this.f28370h = lVar;
        }

        public Object invoke() {
            String str;
            SpannableString spannableString;
            String str2;
            C8968f2 f2Var = this.f28366d;
            f2Var.f28358k = this.f28367e;
            f2Var.f28359l = this.f28368f;
            f2Var.f28360m = this.f28369g;
            View view = f2Var.f28348a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            int i = 0;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$show$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$show$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C8968f2 f2Var2 = this.f28366d;
            f2Var2.f28351d = this.f28370h;
            f2Var2.f28361n = System.currentTimeMillis();
            C8968f2 f2Var3 = this.f28366d;
            f2Var3.getClass();
            Log.m105924i("Finder.FinderLiveExceptionWidget", "show content type:" + f2Var3.f28358k);
            f2Var3.f28355h.setVisibility(8);
            int i2 = f2Var3.f28358k;
            if (i2 == 1) {
                f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.f360571dn2));
                f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.Red_90));
                f2Var3.f28356i.setHighlightColor(f2Var3.f28348a.getContext().getResources().getColor(17170445));
                f2Var3.f28356i.setMovementMethod(LinkMovementMethod.getInstance());
                TextView textView = f2Var3.f28356i;
                String string = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2f);
                C87412m.m108593f(string, "root.context.resources.g…_live_post_forbidden_tip)");
                String string2 = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2e);
                C87412m.m108593f(string2, "root.context.resources.g…e_post_forbidden_license)");
                textView.setText(f2Var3.mo9778b(string, string2));
                f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                f2Var3.mo9781f();
            } else {
                int i3 = C0966R.color.f2976b7;
                if (i2 == 4) {
                    f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.f360571dn2));
                    f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                    f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.f2976b7));
                    f2Var3.f28356i.setHighlightColor(f2Var3.f28348a.getContext().getResources().getColor(17170445));
                    f2Var3.f28356i.setMovementMethod(LinkMovementMethod.getInstance());
                    TextView textView2 = f2Var3.f28356i;
                    String string3 = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2f);
                    C87412m.m108593f(string3, "root.context.resources.g…_live_post_forbidden_tip)");
                    String string4 = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2e);
                    C87412m.m108593f(string4, "root.context.resources.g…e_post_forbidden_license)");
                    textView2.setText(f2Var3.mo9778b(string3, string4));
                    f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                    f2Var3.mo9781f();
                } else if (i2 == 2) {
                    f2Var3.f28355h.setVisibility(0);
                    TextView textView3 = f2Var3.f28357j;
                    C48779ay0 ay02 = f2Var3.f28359l;
                    if (ay02 == null || (str2 = ay02.f130842f) == null) {
                        str2 = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e5w);
                    }
                    textView3.setText(str2);
                    f2Var3.f28353f.setImageResource(C0966R.raw.icons_outlined_real_name);
                    f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.f2969az));
                    TextView textView4 = f2Var3.f28356i;
                    C48779ay0 ay03 = f2Var3.f28359l;
                    textView4.setText(ay03 != null ? f2Var3.mo9777a(ay03, (int) textView4.getTextSize()) : f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2z));
                    f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e5x));
                    f2Var3.mo9781f();
                } else if (i2 == 3) {
                    TextView textView5 = f2Var3.f28357j;
                    C48779ay0 ay04 = f2Var3.f28359l;
                    if (ay04 == null || (str = ay04.f130842f) == null) {
                        str = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.f360570dn1);
                    }
                    textView5.setText(str);
                    f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                    f2Var3.f28353f.setImageResource(C0966R.raw.icons_outlined_error);
                    f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.al8));
                    f2Var3.f28356i.setHighlightColor(f2Var3.f28348a.getContext().getResources().getColor(17170445));
                    f2Var3.f28356i.setMovementMethod(LinkMovementMethod.getInstance());
                    TextView textView6 = f2Var3.f28356i;
                    C48779ay0 ay05 = f2Var3.f28359l;
                    if (ay05 != null) {
                        spannableString = f2Var3.mo9777a(ay05, (int) textView6.getTextSize());
                    } else {
                        String string5 = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.f360569dn0);
                        C87412m.m108593f(string5, "root.context.resources.g…e_forbidden_curlive_tips)");
                        String string6 = f2Var3.f28348a.getContext().getResources().getString(C0966R.string.dmz);
                        C87412m.m108593f(string6, "root.context.resources.g…orbidden_curlive_license)");
                        spannableString = f2Var3.mo9778b(string5, string6);
                    }
                    textView6.setText(spannableString);
                    f2Var3.f28356i.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                    f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                    f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.f5154yl);
                    f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                    f2Var3.mo9780e();
                } else {
                    String str3 = null;
                    if (i2 == 7) {
                        TextView textView7 = f2Var3.f28357j;
                        C48779ay0 ay06 = f2Var3.f28359l;
                        if (ay06 != null) {
                            str3 = ay06.f130842f;
                        }
                        textView7.setText(str3);
                        f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                        if (f2Var3.f28360m == -200012) {
                            i3 = C0966R.color.Red_90;
                        }
                        f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(i3));
                        f2Var3.f28356i.setHighlightColor(f2Var3.f28348a.getContext().getResources().getColor(17170445));
                        f2Var3.f28356i.setMovementMethod(LinkMovementMethod.getInstance());
                        TextView textView8 = f2Var3.f28356i;
                        textView8.setText(f2Var3.mo9777a(f2Var3.f28359l, (int) textView8.getTextSize()));
                        f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                        f2Var3.mo9781f();
                    } else if (i2 == 5) {
                        f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e1z));
                        f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                        f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28356i.setText(f2Var3.f28348a.getContext().getString(C0966R.string.ejb));
                        f2Var3.f28356i.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                        f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.f5154yl);
                        f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                        ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
                        FinderBroadcastPageInStruct finderBroadcastPageInStruct = new FinderBroadcastPageInStruct();
                        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
                        if (E == null) {
                            E = "";
                        }
                        finderBroadcastPageInStruct.mo1021t(E);
                        finderBroadcastPageInStruct.mo1022u("174");
                        finderBroadcastPageInStruct.mo1020s("174");
                        JSONObject jSONObject = new JSONObject();
                        C66880s0 a = C54117x.m60830a();
                        if (a != null && a.f192141n) {
                            i = 1;
                        }
                        finderBroadcastPageInStruct.mo1023v(jSONObject.put("is_scan", i).toString());
                        finderBroadcastPageInStruct.mo86054n();
                        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22946, contextid = " + finderBroadcastPageInStruct.f9761i + ", page_id = " + finderBroadcastPageInStruct.f9757e + ", commentScene = " + finderBroadcastPageInStruct.f9766n);
                        f2Var3.mo9780e();
                    } else if (i2 == 9) {
                        f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.mba));
                        f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28353f.setImageResource(C0966R.raw.icons_outlined_error);
                        f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28356i.setVisibility(8);
                        f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                        f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.f5154yl);
                        f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                        f2Var3.mo9780e();
                    } else if (i2 == 11) {
                        f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.mgh));
                        f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28353f.setImageResource(C0966R.raw.icons_outlined_error);
                        f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28356i.setVisibility(8);
                        f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                        f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.f5154yl);
                        f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                        f2Var3.mo9780e();
                    } else if (i2 == 10) {
                        f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e1z));
                        f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                        f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28356i.setText(f2Var3.f28348a.getContext().getString(C0966R.string.mbe));
                        f2Var3.f28356i.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                        f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.f5154yl);
                        f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                        f2Var3.mo9780e();
                    } else if (i2 == 6) {
                        f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.f360954mi2));
                        f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
                        f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                        f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
                        f2Var3.f28356i.setText(f2Var3.f28348a.getContext().getString(C0966R.string.f360953mi1));
                        f2Var3.f28356i.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
                        f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                        f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.b8u);
                        f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.al_));
                        f2Var3.mo9780e();
                        C54134p.f152047c = null;
                    } else {
                        if (i2 == 12 || i2 == 8) {
                            i = 1;
                        }
                        if (i != 0) {
                            TextView textView9 = f2Var3.f28357j;
                            C48779ay0 ay07 = f2Var3.f28359l;
                            textView9.setText(ay07 != null ? ay07.f130842f : null);
                            f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            f2Var3.f28353f.setImageResource(C0966R.raw.icons_filled_error);
                            f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            TextView textView10 = f2Var3.f28356i;
                            C48779ay0 ay08 = f2Var3.f28359l;
                            if (ay08 != null) {
                                str3 = ay08.f130841e;
                            }
                            textView10.setText(str3);
                            f2Var3.f28356i.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                            f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.f5154yl);
                            f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                            f2Var3.mo9780e();
                        } else if (i2 == 13) {
                            f2Var3.f28357j.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.n4f));
                            f2Var3.f28357j.setTextSize((float) C79406f.m96347a(f2Var3.f28348a.getContext(), 16.0f));
                            f2Var3.f28357j.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            f2Var3.f28353f.setImageResource(C0966R.raw.icons_outlined_error);
                            f2Var3.f28353f.setIconColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            TextView textView11 = f2Var3.f28356i;
                            C48779ay0 ay09 = f2Var3.f28359l;
                            if (ay09 != null) {
                                str3 = ay09.f130841e;
                            }
                            textView11.setText(str3);
                            f2Var3.f28356i.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            f2Var3.f28354g.setText(f2Var3.f28348a.getContext().getResources().getString(C0966R.string.e2d));
                            f2Var3.f28354g.setBackgroundResource(C0966R.C0969drawable.b8u);
                            f2Var3.f28354g.setTextColor(f2Var3.f28348a.getContext().getResources().getColor(C0966R.color.al_));
                            f2Var3.mo9780e();
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C8968f2(View view, String str, String str2) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(str, "anchorUsername");
        C87412m.m108594g(str2, "liveCoverUrl");
        this.f28348a = view;
        this.f28349b = str;
        this.f28350c = str2;
        View findViewById = view.findViewById(C0966R.C0970id.cln);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.exception_icon)");
        this.f28353f = (WeImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.clo);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.exception_ok_btn)");
        Button button = (Button) findViewById2;
        this.f28354g = button;
        View findViewById3 = view.findViewById(C0966R.C0970id.clr);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.exception_top_back)");
        WeImageView weImageView = (WeImageView) findViewById3;
        this.f28355h = weImageView;
        View findViewById4 = view.findViewById(C0966R.C0970id.clp);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.exception_tip)");
        this.f28356i = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.clq);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.exception_title)");
        TextView textView = (TextView) findViewById5;
        this.f28357j = textView;
        this.f28358k = 1;
        button.setOnClickListener(new C8969a(this));
        ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += C75044y4.m89994f(view.getContext());
        weImageView.setOnClickListener(new C8970b(this));
        weImageView.post(new C8971c(weImageView));
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        C85875k4.m106189j0(button.getPaint(), 0.8f);
    }

    /* renamed from: d */
    public static /* synthetic */ void m8755d(C8968f2 f2Var, int i, C48779ay0 ay02, int i2, C32226l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            ay02 = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        f2Var.mo9779c(i, ay02, i2, lVar);
    }

    /* renamed from: a */
    public final SpannableString mo9777a(C48779ay0 ay02, int i) {
        String str;
        if (ay02 != null) {
            String str2 = ay02.f130841e;
            if (!(str2 == null || str2.length() == 0)) {
                SpannableString Jo = ((C76979h) C86312j.m106911c(C76979h.class)).mo107050Jo(this.f28348a.getContext(), ay02.f130841e, i, 1, (Object) null);
                C87412m.m108593f(Jo, "getService(ISpannableSer…ckSpanStyle.NORMAL, null)");
                return Jo;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getLicenseText: error page is null, wording = ");
        sb.append(ay02 != null ? ay02.f130841e : null);
        Log.m105924i("Finder.FinderLiveExceptionWidget", sb.toString());
        if (ay02 == null || (str = ay02.f130841e) == null) {
            str = "";
        }
        return new SpannableString(str);
    }

    /* renamed from: b */
    public final SpannableString mo9778b(String str, String str2) {
        int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + E;
        SpannableString spannableString = new SpannableString(str);
        if (E <= 0 || length > str.length()) {
            E = 0;
            length = str.length();
            Log.m105920e("Finder.FinderLiveExceptionWidget", "license text err,all string:" + str + ",license:" + str2);
        }
        spannableString.setSpan(new C8972d(this), E, length, 33);
        return spannableString;
    }

    /* renamed from: c */
    public final void mo9779c(int i, C48779ay0 ay02, int i2, C32226l<? super Boolean, C13598b0> lVar) {
        C61926c.m72668M(new C8973e(this, i, ay02, i2, lVar));
    }

    /* renamed from: e */
    public final void mo9780e() {
        C11193b.f33003a.mo11281b(this.f28349b, this.f28350c, this.f28348a, (C32226l<? super Boolean, C13598b0>) null);
    }

    /* renamed from: f */
    public final void mo9781f() {
        View view = this.f28348a;
        view.setBackgroundColor(view.getContext().getResources().getColor(C0966R.color.f2929c));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8968f2(View view, String str, String str2, int i, C8480h hVar) {
        this(view, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
