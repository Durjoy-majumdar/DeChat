package com.tencent.p014mm.plugin.appbrand.page;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.q */
public class C83883q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f244917d;

    /* renamed from: e */
    public final /* synthetic */ String f244918e;

    /* renamed from: f */
    public final /* synthetic */ String f244919f;

    /* renamed from: g */
    public final /* synthetic */ String f244920g;

    /* renamed from: h */
    public final /* synthetic */ String f244921h;

    /* renamed from: i */
    public final /* synthetic */ AppBrandMenuHeader f244922i;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.q$a */
    public class C83884a extends ClickableSpan {
        public C83884a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$7$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C83883q qVar = C83883q.this;
            AppBrandMenuHeader appBrandMenuHeader = qVar.f244922i;
            String str = qVar.f244918e;
            String str2 = qVar.f244919f;
            String str3 = qVar.f244920g;
            int i = AppBrandMenuHeader.f244378q;
            appBrandMenuHeader.mo116016c(str, str2, str3);
            C84240s.m103845k(C83883q.this.f244921h, 2, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$7$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }
    }

    public C83883q(AppBrandMenuHeader appBrandMenuHeader, String str, String str2, String str3, String str4, String str5) {
        this.f244922i = appBrandMenuHeader;
        this.f244917d = str;
        this.f244918e = str2;
        this.f244919f = str3;
        this.f244920g = str4;
        this.f244921h = str5;
    }

    public void run() {
        TextPaint paint = this.f244922i.f244386n.getPaint();
        int paddingLeft = this.f244922i.f244386n.getPaddingLeft();
        int paddingRight = this.f244922i.f244386n.getPaddingRight();
        int textSize = (int) (paint.getTextSize() * 5.0f);
        int width = (this.f244922i.f244386n.getWidth() - paddingLeft) - paddingRight;
        int width2 = this.f244922i.f244388p.getWidth();
        String charSequence = TextUtils.ellipsize(this.f244922i.f244386n.getText(), paint, (float) (((width >= width2 || width + textSize <= width2) ? ((width2 - paddingLeft) - paddingRight) * 2 : (width2 - paddingLeft) - paddingRight) - textSize), TextUtils.TruncateAt.END).toString();
        String string = Util.isNullOrNil(this.f244917d) ? MMApplicationContext.getContext().getString(C0966R.string.d2i) : this.f244917d;
        int length = charSequence.length();
        int length2 = string.length() + length;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence + string);
        C83884a aVar = new C83884a();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(MMApplicationContext.getResources().getColor(C0966R.color.f3075as));
        spannableStringBuilder.setSpan(aVar, length, length2, 33);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 33);
        this.f244922i.f244386n.setText(spannableStringBuilder);
        TextView textView = this.f244922i.f244386n;
        if (AppBrandMenuHeader$$g.f197146a == null) {
            AppBrandMenuHeader$$g.f197146a = new AppBrandMenuHeader$$g();
        }
        textView.setMovementMethod(AppBrandMenuHeader$$g.f197146a);
        this.f244922i.f244386n.setClickable(true);
        C84240s.m103845k(this.f244921h, 1, 2);
    }
}
