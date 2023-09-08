package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75359b0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI */
public final class SDKOAuthWechatUI extends BaseMvvmActivity {

    /* renamed from: n */
    public static final /* synthetic */ int f22539n = 0;

    /* renamed from: d */
    public final C13601g f22540d = C36568h.m40985a(new C6140i(this));

    /* renamed from: e */
    public final C13601g f22541e = C36568h.m40985a(new C6138g(this));

    /* renamed from: f */
    public final C13601g f22542f = C36568h.m40985a(new C6139h(this));

    /* renamed from: g */
    public final C13601g f22543g = C36568h.m40985a(new C6133b(this));

    /* renamed from: h */
    public final C13601g f22544h = C36568h.m40985a(new C6134c(this));

    /* renamed from: i */
    public final C13601g f22545i = C36568h.m40985a(new C6135d(this));

    /* renamed from: j */
    public final C13601g f22546j = C36568h.m40985a(new C6136e(this));

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$a */
    public static final class C6132a extends C75359b0 {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22547d;

        /* renamed from: e */
        public final /* synthetic */ String f22548e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6132a(int i, int i2, SDKOAuthWechatUI sDKOAuthWechatUI, String str) {
            super(i, i2);
            this.f22547d = sDKOAuthWechatUI;
            this.f22548e = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$addJumpLink$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "v");
            SDKOAuthWechatUI sDKOAuthWechatUI = this.f22547d;
            String str = this.f22548e;
            int i = SDKOAuthWechatUI.f22539n;
            sDKOAuthWechatUI.getClass();
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.SDKOAuthWechatUI", "jumpToWebView url is null");
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                C88144b.m109791i(sDKOAuthWechatUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$addJumpLink$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$b */
    public static final class C6133b extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6133b(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22549d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (Button) this.f22549d.findViewById(C0966R.C0970id.o_m);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$c */
    public static final class C6134c extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6134c(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22550d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (Button) this.f22550d.findViewById(C0966R.C0970id.o_n);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$d */
    public static final class C6135d extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6135d(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22551d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (WeImageView) this.f22551d.findViewById(C0966R.C0970id.o_p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$e */
    public static final class C6136e extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6136e(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22552d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (WeImageView) this.f22552d.findViewById(C0966R.C0970id.o_r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$f */
    public static final class C6137f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22553d;

        public C6137f(SDKOAuthWechatUI sDKOAuthWechatUI) {
            this.f22553d = sDKOAuthWechatUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f22553d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$g */
    public static final class C6138g extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6138g(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22554d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f22554d.findViewById(C0966R.C0970id.o_o);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$h */
    public static final class C6139h extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6139h(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22555d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f22555d.findViewById(C0966R.C0970id.o_q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI$i */
    public static final class C6140i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SDKOAuthWechatUI f22556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6140i(SDKOAuthWechatUI sDKOAuthWechatUI) {
            super(0);
            this.f22556d = sDKOAuthWechatUI;
        }

        public Object invoke() {
            return (TextView) this.f22556d.findViewById(C0966R.C0970id.o_s);
        }
    }

    /* renamed from: I7 */
    public static final void m6018I7(SDKOAuthWechatUI sDKOAuthWechatUI, ConstraintLayout.LayoutParams layoutParams) {
        int b = C76577a.m92151b(sDKOAuthWechatUI.getContext(), 6);
        float p = C76577a.m92165p(sDKOAuthWechatUI.getContext());
        int i = (int) (((float) b) * p);
        layoutParams.height = i;
        layoutParams.width = i;
        layoutParams.topMargin = (int) (((float) C76577a.m92151b(sDKOAuthWechatUI.getContext(), 11)) * p);
    }

    /* renamed from: H7 */
    public final void mo7098H7(Spannable spannable, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        spannable.setSpan(new C6132a(getContext().getResources().getColor(C0966R.color.a1d), getContext().getResources().getColor(C0966R.color.a1f), this, str3), C112550d0.m153769E(str4, str5, 0, false, 6, (Object) null), C112550d0.m153769E(str4, str5, 0, false, 6, (Object) null) + str2.length(), 33);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8w;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C6137f(this), C0966R.raw.icons_filled_close);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBounceEnabled(false);
        Object value = ((C36570n) this.f22540d).getValue();
        C87412m.m108593f(value, "<get-titleTv>(...)");
        TextView textView = (TextView) value;
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        TextPaint paint2 = textView.getPaint();
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        textView.setText(textView.getContext().getResources().getString(C0966R.string.f361097nc1));
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        ArrayList arrayList = new ArrayList();
        String string = context.getString(C0966R.string.nbw);
        C87412m.m108593f(string, "context.getString(R.stri…th_login_wechat_p1_link1)");
        arrayList.add(string);
        String string2 = context.getString(C0966R.string.nbx);
        C87412m.m108593f(string2, "context.getString(R.stri…th_login_wechat_p1_link2)");
        arrayList.add(string2);
        String string3 = context.getString(C0966R.string.nbz);
        C87412m.m108593f(string3, "context.getString(R.stri…th_login_wechat_p2_link1)");
        arrayList.add(string3);
        String string4 = context.getString(C0966R.string.f361096nc0);
        C87412m.m108593f(string4, "context.getString(R.stri…th_login_wechat_p2_link2)");
        arrayList.add(string4);
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        ArrayList arrayList2 = new ArrayList();
        if (C87412m.m108589b("zh_CN", LocaleUtil.getCurrentLanguage(context2))) {
            String string5 = context2.getResources().getString(C0966R.string.ip7);
            C87412m.m108593f(string5, "context.resources.getStr…tware_safe_guide_link_zh)");
            arrayList2.add(string5);
            String string6 = context2.getResources().getString(C0966R.string.ip4);
            C87412m.m108593f(string6, "context.resources.getStr…at_privary_guide_link_zh)");
            arrayList2.add(string6);
            String string7 = context2.getResources().getString(C0966R.string.n5d);
            C87412m.m108593f(string7, "context.resources.getStr…_wechat_service_terms_zh)");
            arrayList2.add(string7);
            String string8 = context2.getResources().getString(C0966R.string.n5b);
            C87412m.m108593f(string8, "context.resources.getStr…wechat_privacy_policy_zh)");
            arrayList2.add(string8);
        } else {
            String string9 = context2.getResources().getString(C0966R.string.ip6);
            C87412m.m108593f(string9, "context.resources.getStr…software_safe_guide_link)");
            arrayList2.add(string9);
            String string10 = context2.getResources().getString(C0966R.string.f361288ip3);
            C87412m.m108593f(string10, "context.resources.getStr…echat_privary_guide_link)");
            arrayList2.add(string10);
            String string11 = context2.getResources().getString(C0966R.string.n5c);
            C87412m.m108593f(string11, "context.resources.getStr…ing_wechat_service_terms)");
            arrayList2.add(string11);
            String string12 = context2.getResources().getString(C0966R.string.n5a);
            C87412m.m108593f(string12, "context.resources.getStr…ng_wechat_privacy_policy)");
            arrayList2.add(string12);
        }
        Object value2 = ((C36570n) this.f22541e).getValue();
        C87412m.m108593f(value2, "<get-p1NeatTv>(...)");
        MMNeat7extView mMNeat7extView = (MMNeat7extView) value2;
        String str = (String) arrayList.get(0);
        String str2 = (String) arrayList.get(1);
        String string13 = mMNeat7extView.getContext().getResources().getString(C0966R.string.nbv, new Object[]{str, str2});
        C87412m.m108593f(string13, "context.resources.getStr…_wechat_p1, link1, link2)");
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string13);
        C87412m.m108593f(newSpannable, "inputTextSpan");
        mo7098H7(newSpannable, string13, str, (String) arrayList2.get(0));
        mo7098H7(newSpannable, string13, str2, (String) arrayList2.get(1));
        mMNeat7extView.mo104279b(newSpannable);
        mMNeat7extView.setSpacingAdd(C76577a.m92151b(mMNeat7extView.getContext(), 5));
        Object value3 = ((C36570n) this.f22542f).getValue();
        C87412m.m108593f(value3, "<get-p2NeatTv>(...)");
        MMNeat7extView mMNeat7extView2 = (MMNeat7extView) value3;
        String str3 = (String) arrayList.get(2);
        String str4 = (String) arrayList.get(3);
        String string14 = mMNeat7extView2.getContext().getResources().getString(C0966R.string.nby, new Object[]{str3, str4});
        C87412m.m108593f(string14, "context.resources.getStr…_wechat_p2, link1, link2)");
        Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(string14);
        C87412m.m108593f(newSpannable2, "inputTextSpan");
        mo7098H7(newSpannable2, string14, str3, (String) arrayList2.get(2));
        mo7098H7(newSpannable2, string14, str4, (String) arrayList2.get(3));
        mMNeat7extView2.mo104279b(newSpannable2);
        mMNeat7extView2.setSpacingAdd(C76577a.m92151b(mMNeat7extView2.getContext(), 5));
        Object value4 = ((C36570n) this.f22543g).getValue();
        C87412m.m108593f(value4, "<get-agreeBtn>(...)");
        ((Button) value4).setOnClickListener(new C6355k0(this));
        Object value5 = ((C36570n) this.f22544h).getValue();
        C87412m.m108593f(value5, "<get-disagree>(...)");
        ((Button) value5).setOnClickListener(new C6357l0(this));
        Object value6 = ((C36570n) this.f22545i).getValue();
        C87412m.m108593f(value6, "<get-dot1>(...)");
        ViewGroup.LayoutParams layoutParams = ((WeImageView) value6).getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        m6018I7(this, (ConstraintLayout.LayoutParams) layoutParams);
        Object value7 = ((C36570n) this.f22546j).getValue();
        C87412m.m108593f(value7, "<get-dot2>(...)");
        ViewGroup.LayoutParams layoutParams2 = ((WeImageView) value7).getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        m6018I7(this, (ConstraintLayout.LayoutParams) layoutParams2);
    }
}
