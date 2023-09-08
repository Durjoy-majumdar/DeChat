package qx0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.bizui.widget.BizRecTagTextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C8219i;
import fy3.C32226l;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import ke3.C88144b;
import kg3.C76577a;
import rx3.C13598b0;
import te3.C22491bj2;
import te3.C22533wo3;
import te3.C22539zo3;
import te3.C64708sd;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: qx0.a */
public final class C22136a {

    /* renamed from: a */
    public static final C22136a f62618a = new C22136a();

    /* renamed from: b */
    public static boolean f62619b = true;

    /* renamed from: c */
    public static boolean f62620c;

    /* renamed from: d */
    public static boolean f62621d;

    /* renamed from: e */
    public static int f62622e;

    /* renamed from: f */
    public static int f62623f;

    /* renamed from: g */
    public static C19623o0 f62624g;

    /* renamed from: h */
    public static String f62625h;

    /* renamed from: i */
    public static C22137a f62626i = C22137a.CLICK_REC_FEED;

    /* renamed from: qx0.a$a */
    public enum C22137a {
        CLICK_SUBSCRIBE(0),
        CLICK_REC(1),
        CLICK_REC_FEED(2);

        /* access modifiers changed from: public */
        C22137a(int i) {
        }
    }

    /* renamed from: qx0.a$b */
    public static final class C22138b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Integer, C13598b0> f62631d;

        public C22138b(C32226l<? super Integer, C13598b0> lVar) {
            this.f62631d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/model/BizTLRecFeedUtil$initJumpLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f62631d.invoke(24);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/model/BizTLRecFeedUtil$initJumpLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qx0.a$c */
    public static final class C22139c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C22533wo3 f62632d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f62633e;

        /* renamed from: f */
        public final /* synthetic */ Context f62634f;

        /* renamed from: g */
        public final /* synthetic */ C18412m3 f62635g;

        /* renamed from: h */
        public final /* synthetic */ int f62636h;

        /* renamed from: i */
        public final /* synthetic */ int f62637i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22139c(C22533wo3 wo32, C19623o0 o0Var, Context context, C18412m3 m3Var, int i, int i2) {
            super(1);
            this.f62632d = wo32;
            this.f62633e = o0Var;
            this.f62634f = context;
            this.f62635g = m3Var;
            this.f62636h = i;
            this.f62637i = i2;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (!Util.isNullOrNil(this.f62632d.f64693h)) {
                String str = this.f62632d.f64693h;
                Intent intent = new Intent();
                String b = C92721n.m116874b(str, 169, 200, ((int) System.currentTimeMillis()) / 1000, this.f62633e);
                intent.putExtra("rawUrl", b);
                intent.putExtra("geta8key_scene", 56);
                C88144b.m109791i(this.f62634f, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C115669n.INSTANCE.idkeyStat(1590, 25, 1, false);
                this.f62635g.mo22977d(this.f62633e, this.f62636h, this.f62637i, intValue);
                C19623o0 o0Var = this.f62633e;
                C22137a aVar = C22137a.CLICK_REC_FEED;
                C87412m.m108594g(o0Var, "info");
                C22136a.f62624g = o0Var;
                C22136a.f62623f = C22136a.f62622e;
                C22136a.f62625h = b;
                C22136a.f62626i = aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo35249a(TextView textView, String str, int i) {
        if (textView != null) {
            if (!(str == null || C112551y.m153811k(str))) {
                if (i == 1) {
                    Drawable e = C74933u4.m89768e(textView.getContext(), C0966R.raw.icons_outlined_news, textView.getContext().getResources().getColor(C0966R.color.f2958ae));
                    int textSize = (int) (((double) textView.getTextSize()) * 1.1d);
                    e.setBounds(0, 0, textSize, textSize);
                    C76003c cVar = new C76003c(e, 1);
                    SpannableString spannableString = new SpannableString("@");
                    spannableString.setSpan(cVar, 0, 1, 33);
                    textView.setText(TextUtils.concat(new CharSequence[]{spannableString, ' ' + str}));
                } else {
                    textView.setText(str);
                }
            }
            if (textView.getText() != null && textView.getText().length() >= 2) {
                CharSequence text = textView.getText();
                C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
                if (C112550d0.m153788X(text, "#", false, 2, (Object) null)) {
                    String string = textView.getContext().getResources().getString(C0966R.string.aqn);
                    C87412m.m108593f(string, "context.resources.getStr…tring.biz_timeline_topic)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{textView.getText().subSequence(1, textView.getText().length())}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    textView.setContentDescription(format);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35250b(C18412m3 m3Var, int i, int i2, C19623o0 o0Var, C22533wo3 wo32, TextView textView, Context context) {
        C87412m.m108594g(m3Var, "reporter");
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(wo32, "itemMsg");
        C87412m.m108594g(textView, "txtJumpLink");
        C87412m.m108594g(context, "context");
        String str = wo32.f64692g;
        boolean z = true;
        if (!(str == null || C112551y.m153811k(str))) {
            String str2 = wo32.f64693h;
            if (str2 != null && !C112551y.m153811k(str2)) {
                z = false;
            }
            if (!z) {
                textView.setVisibility(0);
                mo35249a(textView, wo32.f64692g, wo32.f64697o);
                C8219i.f27144a.mo9271b(textView);
                textView.setOnClickListener(new C22138b(new C22139c(wo32, o0Var, context, m3Var, i, i2)));
                return;
            }
        }
        textView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo35251c(C22539zo3 zo32, BizRecTagTextView bizRecTagTextView) {
        String str = null;
        if (!Util.isNullOrNil(zo32 != null ? zo32.f64838d : null)) {
            if (bizRecTagTextView != null) {
                bizRecTagTextView.setVisibility(0);
            }
            if (bizRecTagTextView != null) {
                bizRecTagTextView.setText(zo32 != null ? zo32.f64838d : null);
            }
            if (C85875k4.m106211z()) {
                int c = C6600v.m6908c(zo32 != null ? zo32.f64842h : null, -16777216);
                if (zo32 != null) {
                    str = zo32.f64841g;
                }
                int c2 = C6600v.m6908c(str, -1);
                if (bizRecTagTextView != null) {
                    bizRecTagTextView.setFillColor(c);
                }
                if (bizRecTagTextView != null) {
                    bizRecTagTextView.setTextColor(c2);
                }
            } else {
                int c3 = C6600v.m6908c(zo32 != null ? zo32.f64840f : null, -1);
                if (zo32 != null) {
                    str = zo32.f64839e;
                }
                int c4 = C6600v.m6908c(str, -16777216);
                if (bizRecTagTextView != null) {
                    bizRecTagTextView.setFillColor(c3);
                }
                if (bizRecTagTextView != null) {
                    bizRecTagTextView.setTextColor(c4);
                }
            }
            if (bizRecTagTextView != null) {
                bizRecTagTextView.setTextSize(1, ((float) 12) * C76577a.m92165p(bizRecTagTextView.getContext()));
                return;
            }
            return;
        }
        if (bizRecTagTextView != null) {
            bizRecTagTextView.setText("");
        }
        if (bizRecTagTextView != null) {
            bizRecTagTextView.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo35252d(Context context, C19623o0 o0Var, C22533wo3 wo32, int i) {
        C64708sd sdVar;
        C22491bj2 bj22;
        Context context2 = context;
        C19623o0 o0Var2 = o0Var;
        C22533wo3 wo33 = wo32;
        Class cls = C45696d.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(wo33, "recommendItem");
        if (o0Var2.f55539x1 == null || (sdVar = wo33.f64689d) == null || (bj22 = wo33.f64690e) == null) {
            Log.m105928w("Micromsg.BizTimeLineRecFeedsHelper", "onAppMsgClick appMsg is null");
            return;
        }
        C115669n.INSTANCE.idkeyStat(1590, 21, 1, false);
        Log.m105925i("Micromsg.BizTimeLineRecFeedsHelper", "onClick jump to url:%s", bj22.f63729f);
        Intent intent = new Intent();
        String b = C92721n.m116874b(bj22.f63729f, 169, 200, ((int) System.currentTimeMillis()) / 1000, o0Var2);
        intent.putExtra("rawUrl", b);
        intent.putExtra("geta8key_scene", 56);
        intent.putExtra("geta8key_username", sdVar.f185413d);
        intent.putExtra("srcUsername", sdVar.f185413d);
        intent.putExtra("srcDisplayname", sdVar.f185414e);
        intent.putExtra("prePublishId", "rec_feed");
        intent.putExtra("KPublisherId", "rec_feed");
        C22137a aVar = C22137a.CLICK_REC_FEED;
        f62624g = o0Var2;
        f62623f = f62622e;
        f62625h = b;
        f62626i = aVar;
        if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(1)) {
            if (((C45696d) C86709a0.m107533q(cls)).Ms0(context, b, bj22.f63733j, false, 169, 200, intent)) {
                Log.m105924i("Micromsg.BizTimeLineRecFeedsHelper", "jump to TmplWebview");
                return;
            }
        }
        C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
