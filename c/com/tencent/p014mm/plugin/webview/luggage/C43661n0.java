package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43656s;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import in3.C46279a;
import in3.C87763b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;
import qo3.C77398g;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n0 */
public class C43661n0 extends FrameLayout {

    /* renamed from: A */
    public View f117986A;

    /* renamed from: B */
    public boolean f117987B = false;

    /* renamed from: C */
    public Integer f117988C;

    /* renamed from: D */
    public boolean f117989D;

    /* renamed from: E */
    public View.OnClickListener f117990E = new n0$$b(this);

    /* renamed from: d */
    public C87763b f117991d;

    /* renamed from: e */
    public C43658n f117992e;

    /* renamed from: f */
    public Context f117993f;

    /* renamed from: g */
    public RelativeLayout f117994g;

    /* renamed from: h */
    public View f117995h;

    /* renamed from: i */
    public ImageView f117996i;

    /* renamed from: j */
    public ImageView f117997j;

    /* renamed from: n */
    public TextView f117998n;

    /* renamed from: o */
    public LinearLayout f117999o;

    /* renamed from: p */
    public ImageView f118000p;

    /* renamed from: q */
    public TextView f118001q;

    /* renamed from: r */
    public C43687x0 f118002r;

    /* renamed from: s */
    public C43656s f118003s;

    /* renamed from: t */
    public C43663n1 f118004t;

    /* renamed from: u */
    public C77398g f118005u = null;

    /* renamed from: v */
    public String f118006v;

    /* renamed from: w */
    public boolean f118007w = false;

    /* renamed from: x */
    public int f118008x;

    /* renamed from: y */
    public boolean f118009y;

    /* renamed from: z */
    public int f118010z = -1;

    public C43661n0(C43658n nVar) {
        super(nVar.f148196d);
        setId(C0966R.C0970id.gjq);
        this.f117993f = nVar.f148196d;
        this.f117992e = nVar;
        setBackgroundColor(0);
        C43591h hVar = new C43591h(this.f117993f);
        this.f117991d = hVar;
        addView(hVar, -1, -1);
        this.f118008x = C111105a.m151500b(this.f117993f, C0966R.color.al8);
        this.f117986A = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.chu, this, false);
        setActionBarViewColor(this.f118008x);
        this.f117991d.addView(this.f117986A, new FrameLayout.LayoutParams(-1, getActionBarHeight()));
        this.f117994g = (RelativeLayout) this.f117986A.findViewById(C0966R.C0970id.f5386dr);
        this.f117995h = this.f117986A.findViewById(C0966R.C0970id.goh);
        this.f117996i = (ImageView) this.f117986A.findViewById(C0966R.C0970id.c7p);
        ImageView imageView = (ImageView) this.f117986A.findViewById(C0966R.C0970id.f5441f8);
        this.f117997j = imageView;
        imageView.setOnClickListener(new n0$$c(this));
        TextView textView = (TextView) this.f117986A.findViewById(C0966R.C0970id.knx);
        this.f117998n = textView;
        C44706b.m49451b(textView, C0966R.dimen.f3635t);
        this.f117999o = (LinearLayout) this.f117986A.findViewById(C0966R.C0970id.f5460fq);
        ImageView imageView2 = (ImageView) this.f117986A.findViewById(C0966R.C0970id.f5459fp);
        this.f118000p = imageView2;
        imageView2.setOnClickListener(new n0$$d(this));
        this.f118000p.setClickable(false);
        TextView textView2 = (TextView) this.f117986A.findViewById(C0966R.C0970id.f5461fr);
        this.f118001q = textView2;
        textView2.setOnClickListener(new n0$$e(this));
        this.f118001q.setClickable(false);
    }

    private int getActionBarHeight() {
        return C75044y4.m89989a(MMApplicationContext.getContext());
    }

    private void setActionBarColor(int i) {
        boolean z = true;
        Log.m105925i("MicroMsg.GameWebViewActionBar", "setActionBarColor, color : %d", Integer.valueOf(i));
        if (i == 0) {
            i = getResources().getColor(C0966R.color.al6);
        }
        boolean g = C74933u4.m89770g(i);
        int i2 = this.f118010z;
        if (i2 != 0) {
            z = i2 != 1 ? g : false;
        }
        C46279a.m51577a(this.f117991d, i, !z);
        this.f117988C = Integer.valueOf(i);
        this.f117989D = z;
        setActionBarViewColor(i);
        mo65847g(z);
    }

    private void setActionBarViewColor(int i) {
        View view = this.f117986A;
        if (view != null) {
            view.setBackgroundColor(i);
            if (((float) ((i >> 24) & 255)) / 255.0f > 0.0f) {
                this.f117986A.setClickable(true);
            } else {
                this.f117986A.setClickable(false);
            }
        }
    }

    private void setImmersiveStyle(boolean z) {
        Log.m105924i("MicroMsg.GameWebViewActionBar", "setImmersiveStyle");
        int i = this.f118010z;
        if (i == 0) {
            z = true;
        } else if (i == 1) {
            z = false;
        }
        C46279a.m51577a(this.f117991d, 0, !z);
        this.f117988C = 0;
        this.f117989D = z;
        setActionBarViewColor(0);
        this.f117998n.setVisibility(8);
        this.f117996i.setVisibility(8);
        this.f117997j.setImageAlpha(255);
        this.f118000p.setImageAlpha(255);
        mo65847g(z);
    }

    /* renamed from: a */
    public final void mo67957a(boolean z) {
        ImageView imageView = this.f118000p;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo67958b() {
        this.f117987B = true;
        ImageView imageView = this.f117996i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        View view = this.f117995h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar", "fakeNativeClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar", "fakeNativeClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public void mo65843c() {
        C77407n nVar;
        C43687x0 x0Var = this.f118002r;
        if (x0Var != null && (nVar = x0Var.f118058c) != null) {
            nVar.mo107572p();
        }
    }

    /* renamed from: d */
    public void mo65844d() {
        this.f117992e.mo67938q(true);
    }

    /* renamed from: e */
    public void mo65845e() {
    }

    /* renamed from: f */
    public void mo65846f() {
    }

    /* renamed from: g */
    public void mo65847g(boolean z) {
        if (!z) {
            this.f117998n.setTextColor(-16777216);
            this.f117997j.postDelayed(new n0$$i(this), 100);
            if (!this.f118007w) {
                this.f118000p.setImageResource(C0966R.raw.actionbar_icon_dark_more);
                return;
            }
            return;
        }
        this.f117998n.setTextColor(-1);
        this.f117997j.postDelayed(new n0$$j(this), 100);
        if (!this.f118007w) {
            this.f118000p.setImageResource(C0966R.raw.actionbar_icon_light_more);
        }
    }

    public C43656s getMenuHelp() {
        if (this.f118003s == null) {
            this.f118003s = new C43656s();
        }
        return this.f118003s;
    }

    public String getTitle() {
        return this.f118006v;
    }

    public int getTopBarHeight() {
        return this.f117991d.getHeight();
    }

    /* renamed from: h */
    public void mo67961h(int i, boolean z, boolean z2) {
        Integer num;
        this.f118008x = i;
        this.f118009y = z2;
        if (!z || !((num = this.f117988C) == null || num.intValue() == 0)) {
            setActionBarColor(i);
        } else {
            setImmersiveStyle(z2);
        }
    }

    /* renamed from: i */
    public void mo67962i() {
        setImmersiveStyle(this.f118009y);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo67963j() {
        /*
            r13 = this;
            com.tencent.mm.plugin.webview.luggage.n1 r0 = r13.f118004t
            r1 = 0
            if (r0 == 0) goto L_0x00f2
            boolean r2 = r0.f118026a
            r3 = 1
            java.lang.String r4 = "zh_CN"
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r0.f118033h
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r0.f118027b
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = r0.f118028c
        L_0x001a:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r0.f118033h
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r0.f118029d
            goto L_0x002d
        L_0x002b:
            java.lang.String r2 = r0.f118030e
        L_0x002d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r0.f118033h
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x003e
            java.lang.String r0 = r0.f118031f
            goto L_0x0040
        L_0x003e:
            java.lang.String r0 = r0.f118032g
        L_0x0040:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x00f2
            com.tencent.mm.plugin.webview.luggage.n1 r0 = r13.f118004t
            java.lang.String r2 = r0.f118033h
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0058
            java.lang.String r0 = r0.f118027b
            goto L_0x005a
        L_0x0058:
            java.lang.String r0 = r0.f118028c
        L_0x005a:
            com.tencent.mm.plugin.webview.luggage.n1 r2 = r13.f118004t
            java.lang.String r5 = r2.f118033h
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0067
            java.lang.String r2 = r2.f118029d
            goto L_0x0069
        L_0x0067:
            java.lang.String r2 = r2.f118030e
        L_0x0069:
            r9 = r2
            com.tencent.mm.plugin.webview.luggage.n1 r2 = r13.f118004t
            java.lang.String r5 = r2.f118033h
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0077
            java.lang.String r2 = r2.f118031f
            goto L_0x0079
        L_0x0077:
            java.lang.String r2 = r2.f118032g
        L_0x0079:
            r10 = r2
            r2 = 8
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r0
            r4[r3] = r9
            r5 = 2
            r4[r5] = r10
            java.lang.String r5 = "MicroMsg.GameWebViewActionBar"
            java.lang.String r6 = "use js api close window confirm info : %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            android.content.Context r4 = r13.getContext()
            r5 = 2131496507(0x7f0c0e3b, float:1.861658E38)
            r6 = 0
            android.view.View r8 = android.view.View.inflate(r4, r5, r6)
            r4 = 2131309298(0x7f0932f2, float:1.8236876E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r4.setChecked(r1)
            r4.setVisibility(r2)
            r1 = 2131309300(0x7f0932f4, float:1.823688E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            android.content.res.Resources r0 = r13.getResources()
            r4 = 2131101252(0x7f060644, float:1.7814908E38)
            int r0 = r0.getColor(r4)
            r1.setTextColor(r0)
            r0 = 2131309299(0x7f0932f3, float:1.8236878E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r1 = r13.getResources()
            int r1 = r1.getColor(r4)
            r0.setTextColor(r1)
            r0.setVisibility(r2)
            android.content.Context r5 = r13.getContext()
            r6 = 1
            com.tencent.mm.plugin.webview.luggage.n0$$g r11 = new com.tencent.mm.plugin.webview.luggage.n0$$g
            r11.<init>(r13)
            com.tencent.mm.plugin.webview.luggage.n0$$h r12 = new com.tencent.mm.plugin.webview.luggage.n0$$h
            r12.<init>(r13)
            java.lang.String r7 = ""
            qo3.g r0 = nj3.C76879j.m92715I(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f118005u = r0
            return r3
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.luggage.C43661n0.mo67963j():boolean");
    }

    /* renamed from: k */
    public void mo65849k() {
        MMHandlerThread.postToMainThreadDelayed(new n0$$f(this), getContext() instanceof MMActivity ? ((MMActivity) getContext()).hideVKBHavingResult() : false ? 100 : 0);
    }

    public void setActionBarColorValue(int i) {
        this.f118008x = i;
    }

    public void setAlpha(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            if (f == 0.0f) {
                mo67962i();
                return;
            }
            int i = (int) (255.0f * f);
            this.f117998n.setVisibility(0);
            if (this.f117987B) {
                this.f117996i.setVisibility(8);
            } else {
                this.f117996i.setVisibility(0);
            }
            int i2 = this.f118008x;
            setActionBarColor((i2 & 255) | (((i2 >> 16) & 255) << 16) | (i << 24) | (((i2 >> 8) & 255) << 8));
            this.f117998n.setAlpha(f);
            this.f117996i.setImageAlpha(i);
            this.f117997j.setImageAlpha(i);
            this.f118000p.setImageAlpha(i);
        }
    }

    public void setBackBtn(int i) {
        this.f117997j.setImageResource(i);
    }

    public void setCloseWindowConfirmInfo(Bundle bundle) {
        this.f118004t = bundle == null ? null : new C43663n1(bundle);
    }

    public void setIconDark(int i) {
        this.f118010z = i;
    }

    public void setNavigationBarButtons(Bundle bundle) {
        Bitmap bitmap;
        if (bundle != null) {
            String string = bundle.getString("set_navigation_bar_buttons_left_text_color");
            boolean z = bundle.getBoolean("set_navigation_bar_buttons_hide_right_button", false);
            String string2 = bundle.getString("set_navigation_bar_buttons_text");
            String string3 = bundle.getString("set_navigation_bar_buttons_icon_data");
            String string4 = bundle.getString("set_navigation_bar_buttons_text_color");
            boolean z2 = bundle.getBoolean("set_navigation_bar_buttons_need_click_event", false);
            C6600v.m6908c(string, -16777216);
            int d = (int) C6600v.m6909d(string4, -1);
            if (!Util.isNullOrNil(string3)) {
                try {
                    bitmap = C6600v.m6906a(string3);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.GameWebViewActionBar", "setNavigationBarButtons, decode base64 image, exception = %s", e);
                }
                MMHandlerThread.postToMainThread(new n0$$k(this, z, bitmap, string2, d, z2));
            }
            bitmap = null;
            MMHandlerThread.postToMainThread(new n0$$k(this, z, bitmap, string2, d, z2));
        }
    }

    public void setOptionEnable(boolean z) {
        if (z) {
            this.f118000p.setClickable(true);
            this.f118001q.setClickable(true);
            return;
        }
        this.f118000p.setClickable(false);
        this.f118001q.setClickable(false);
    }

    public void setTitleColor(int i) {
        this.f117998n.setTextColor(i);
    }

    public void setTitleText(String str) {
        Log.m105919d("MicroMsg.GameWebViewActionBar", "setTitleText, title: %s", str);
        this.f118006v = str;
        this.f117998n.setText(str);
    }
}
