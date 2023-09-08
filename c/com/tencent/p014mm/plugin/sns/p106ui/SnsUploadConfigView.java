package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FaceBookBindOperationEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import g34.C116918i;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p462bz.C28435b;
import te3.C101802kr2;
import tn3.C101905a;
import tn3.C118493b;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadConfigView */
public class SnsUploadConfigView extends LinearLayout implements C11385n, C101905a.C101907b, C101905a.C101906a {

    /* renamed from: u */
    public static final /* synthetic */ int f278888u = 0;

    /* renamed from: d */
    public ImageView f278889d;

    /* renamed from: e */
    public ImageView f278890e;

    /* renamed from: f */
    public ImageView f278891f;

    /* renamed from: g */
    public ImageView f278892g;

    /* renamed from: h */
    public boolean f278893h = false;

    /* renamed from: i */
    public boolean f278894i = false;

    /* renamed from: j */
    public boolean f278895j = false;

    /* renamed from: n */
    public boolean f278896n = false;

    /* renamed from: o */
    public boolean f278897o = false;

    /* renamed from: p */
    public boolean f278898p = false;

    /* renamed from: q */
    public Context f278899q;

    /* renamed from: r */
    public C101802kr2 f278900r = new C101802kr2();

    /* renamed from: s */
    public C101905a f278901s = ((C28435b) C86312j.m106911c(C28435b.class)).mo55828lg();

    /* renamed from: t */
    public ProgressDialog f278902t = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$a */
    public class C95674a implements DialogInterface.OnClickListener {
        public C95674a(SnsUploadConfigView snsUploadConfigView) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$13");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$13");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$b */
    public class C95675b implements DialogInterface.OnClickListener {
        public C95675b(SnsUploadConfigView snsUploadConfigView) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$14");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$14");
        }
    }

    static {
        MMApplicationContext.getApplicationId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x019c, code lost:
        if (f40.C86709a0.m107535s().mo121142i().mo119686g(com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC, false) == false) goto L_0x019e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SnsUploadConfigView(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            r10.<init>(r11, r12)
            r12 = 0
            r10.f278893h = r12
            r10.f278894i = r12
            r10.f278895j = r12
            r10.f278896n = r12
            r10.f278897o = r12
            r10.f278898p = r12
            te3.kr2 r0 = new te3.kr2
            r0.<init>()
            r10.f278900r = r0
            java.lang.Class<bz.b> r0 = p462bz.C28435b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            bz.b r0 = (p462bz.C28435b) r0
            tn3.a r0 = r0.mo55828lg()
            r10.f278901s = r0
            r0 = 0
            r10.f278902t = r0
            r10.f278899q = r11
            java.lang.String r0 = "init"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r10.f278899q = r11
            android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r11)
            r3 = 2131497759(0x7f0c131f, float:1.861912E38)
            r4 = 1
            android.view.View r2 = r2.inflate(r3, r10, r4)
            r3 = 2131314117(0x7f0945c5, float:1.824665E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r10.f278889d = r3
            r3 = 2131314119(0x7f0945c7, float:1.8246654E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r10.f278890e = r3
            r3 = 2131314118(0x7f0945c6, float:1.8246652E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r10.f278891f = r3
            r3 = 2131314120(0x7f0945c8, float:1.8246656E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r10.f278892g = r2
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            java.lang.String r3 = "#FFC300"
            int r3 = android.graphics.Color.parseColor(r3)
            r5 = 2131755061(0x7f100035, float:1.914099E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r3)
            android.content.res.Resources r6 = r11.getResources()
            r7 = 2131100124(0x7f0601dc, float:1.781262E38)
            int r6 = r6.getColor(r7)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r6)
            r6 = 2
            int[] r8 = new int[r6]
            r8 = {16842919, 16842908} // fill-array
            r2.addState(r8, r3)
            int[] r8 = new int[r6]
            r8 = {16842919, -16842908} // fill-array
            r2.addState(r8, r3)
            int[] r3 = new int[r4]
            r8 = -16842908(0xfffffffffefeff64, float:-1.6947499E38)
            r3[r12] = r8
            r2.addState(r3, r5)
            int[] r3 = new int[r12]
            r2.addState(r3, r5)
            android.widget.ImageView r3 = r10.f278891f
            r3.setImageDrawable(r2)
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            java.lang.String r3 = "#3C5998"
            int r3 = android.graphics.Color.parseColor(r3)
            r5 = 2131755053(0x7f10002d, float:1.9140974E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r3)
            android.content.res.Resources r9 = r11.getResources()
            int r9 = r9.getColor(r7)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r9)
            int[] r9 = new int[r6]
            r9 = {16842919, 16842908} // fill-array
            r2.addState(r9, r3)
            int[] r9 = new int[r6]
            r9 = {16842919, -16842908} // fill-array
            r2.addState(r9, r3)
            int[] r3 = new int[r4]
            r3[r12] = r8
            r2.addState(r3, r5)
            int[] r3 = new int[r12]
            r2.addState(r3, r5)
            android.widget.ImageView r3 = r10.f278889d
            r3.setImageDrawable(r2)
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            java.lang.String r3 = "#1DA1F2"
            int r3 = android.graphics.Color.parseColor(r3)
            r5 = 2131755066(0x7f10003a, float:1.9141E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r3)
            android.content.res.Resources r9 = r11.getResources()
            int r9 = r9.getColor(r7)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r9)
            int[] r9 = new int[r6]
            r9 = {16842919, 16842908} // fill-array
            r2.addState(r9, r3)
            int[] r9 = new int[r6]
            r9 = {16842919, -16842908} // fill-array
            r2.addState(r9, r3)
            int[] r3 = new int[r4]
            r3[r12] = r8
            r2.addState(r3, r5)
            int[] r3 = new int[r12]
            r2.addState(r3, r5)
            android.widget.ImageView r3 = r10.f278890e
            r3.setImageDrawable(r2)
            android.graphics.drawable.StateListDrawable r2 = new android.graphics.drawable.StateListDrawable
            r2.<init>()
            java.lang.String r3 = "#FF0F80"
            int r3 = android.graphics.Color.parseColor(r3)
            r5 = 2131755067(0x7f10003b, float:1.9141003E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r3)
            android.content.res.Resources r9 = r11.getResources()
            int r7 = r9.getColor(r7)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r11, r5, r7)
            int[] r7 = new int[r6]
            r7 = {16842919, 16842908} // fill-array
            r2.addState(r7, r3)
            int[] r6 = new int[r6]
            r6 = {16842919, -16842908} // fill-array
            r2.addState(r6, r3)
            int[] r3 = new int[r4]
            r3[r12] = r8
            r2.addState(r3, r5)
            int[] r3 = new int[r12]
            r2.addState(r3, r5)
            android.widget.ImageView r3 = r10.f278892g
            r3.setImageDrawable(r2)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginQQMail
            boolean r2 = r2.banned()
            r3 = 8
            if (r2 != 0) goto L_0x017e
            boolean r2 = nc0.C76850a.m92637i()
            if (r2 != 0) goto L_0x0183
        L_0x017e:
            android.widget.ImageView r2 = r10.f278891f
            r2.setVisibility(r3)
        L_0x0183:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.Global3rdSrv
            boolean r4 = r2.banned()
            if (r4 != 0) goto L_0x019e
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC
            boolean r12 = r4.mo119686g(r5, r12)
            if (r12 != 0) goto L_0x01a3
        L_0x019e:
            android.widget.ImageView r12 = r10.f278892g
            r12.setVisibility(r3)
        L_0x01a3:
            boolean r12 = r2.banned()
            if (r12 != 0) goto L_0x01af
            boolean r12 = nc0.C76850a.m92642n()
            if (r12 != 0) goto L_0x01b4
        L_0x01af:
            android.widget.ImageView r12 = r10.f278890e
            r12.setVisibility(r3)
        L_0x01b4:
            boolean r12 = r2.banned()
            if (r12 != 0) goto L_0x01c0
            boolean r12 = eb0.C75592q0.m90755C()
            if (r12 != 0) goto L_0x01c5
        L_0x01c0:
            android.widget.ImageView r12 = r10.f278889d
            r12.setVisibility(r3)
        L_0x01c5:
            android.widget.ImageView r12 = r10.f278891f
            com.tencent.mm.plugin.sns.ui.e7 r2 = new com.tencent.mm.plugin.sns.ui.e7
            r2.<init>(r10, r11)
            r12.setOnClickListener(r2)
            android.widget.ImageView r12 = r10.f278892g
            com.tencent.mm.plugin.sns.ui.f7 r2 = new com.tencent.mm.plugin.sns.ui.f7
            r2.<init>(r10, r11)
            r12.setOnClickListener(r2)
            android.widget.ImageView r11 = r10.f278889d
            com.tencent.mm.plugin.sns.ui.g7 r12 = new com.tencent.mm.plugin.sns.ui.g7
            r12.<init>(r10)
            r11.setOnClickListener(r12)
            android.widget.ImageView r11 = r10.f278890e
            com.tencent.mm.plugin.sns.ui.h7 r12 = new com.tencent.mm.plugin.sns.ui.h7
            r12.<init>(r10)
            r11.setOnClickListener(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUploadConfigView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setSyncFacebook(boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("setSyncFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f278894i) {
            SnsMethodCalculate.markStartTimeMs("isOpenFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            if (!C75592q0.m90792v()) {
                C76879j.m92743n(getContext(), C0966R.string.f361298is2, C0966R.string.a3h, new C71252k7(this), new C71255l7(this));
                SnsMethodCalculate.markEndTimeMs("isOpenFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                z2 = false;
            } else {
                z2 = true;
                SnsMethodCalculate.markEndTimeMs("isOpenFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            }
            if (!z2) {
                this.f278894i = false;
                SnsMethodCalculate.markEndTimeMs("setSyncFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                return;
            }
            if (!z) {
                SnsMethodCalculate.markStartTimeMs("refreshFacebookToken", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                if (C75592q0.m90792v()) {
                    FaceBookBindOperationEvent faceBookBindOperationEvent = new FaceBookBindOperationEvent();
                    faceBookBindOperationEvent.callback = new C95751c7(this, faceBookBindOperationEvent);
                    faceBookBindOperationEvent.asyncPublish(Looper.myLooper());
                }
                SnsMethodCalculate.markEndTimeMs("refreshFacebookToken", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            }
            this.f278889d.setImageDrawable(C74933u4.m89768e(this.f278899q, C0966R.raw.album_facebook_icon_normal, Color.parseColor("#3C5998")));
        } else {
            ImageView imageView = this.f278889d;
            Context context = this.f278899q;
            imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.album_facebook_icon_normal, context.getResources().getColor(C0966R.color.f3107fh)));
        }
        SnsMethodCalculate.markEndTimeMs("setSyncFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: Y6 */
    public void mo5555Y6(C101905a.C101908c cVar) {
        SnsMethodCalculate.markStartTimeMs("onTwitterOAuthDone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        ProgressDialog progressDialog = this.f278902t;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            this.f278895j = true;
            mo133067g(C0966R.string.k64);
        } else if (ordinal == 1) {
            this.f278895j = false;
            mo133067g(C0966R.string.f361477k63);
        } else if (ordinal == 2) {
            this.f278895j = false;
        }
        mo133065e();
        SnsMethodCalculate.markEndTimeMs("onTwitterOAuthDone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: a */
    public void mo133061a(boolean z) {
        SnsMethodCalculate.markStartTimeMs("bindFacebookTokenResult", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (z) {
            this.f278894i = true;
            setSyncFacebook(true);
        }
        SnsMethodCalculate.markEndTimeMs("bindFacebookTokenResult", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: b */
    public void mo133062b() {
        SnsMethodCalculate.markStartTimeMs("offAllSync", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        this.f278894i = false;
        this.f278895j = false;
        this.f278896n = false;
        this.f278897o = false;
        ImageView imageView = this.f278891f;
        Context context = this.f278899q;
        imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.album_qzone_icon_normal, context.getResources().getColor(C0966R.color.f3107fh)));
        ImageView imageView2 = this.f278892g;
        Context context2 = this.f278899q;
        imageView2.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.album_wesee_icon_normal, context2.getResources().getColor(C0966R.color.f3107fh)));
        ImageView imageView3 = this.f278889d;
        Context context3 = this.f278899q;
        imageView3.setImageDrawable(C74933u4.m89768e(context3, C0966R.raw.album_facebook_icon_normal, context3.getResources().getColor(C0966R.color.f3107fh)));
        ImageView imageView4 = this.f278890e;
        Context context4 = this.f278899q;
        imageView4.setImageDrawable(C74933u4.m89768e(context4, C0966R.raw.album_twitter_icon_normal, context4.getResources().getColor(C0966R.color.f3107fh)));
        SnsMethodCalculate.markEndTimeMs("offAllSync", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: c */
    public final void mo133063c() {
        SnsMethodCalculate.markStartTimeMs("setSyncFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        setSyncFacebook(false);
        SnsMethodCalculate.markEndTimeMs("setSyncFacebook", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: d */
    public final void mo133064d() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("setSyncQQZone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f278896n) {
            SnsMethodCalculate.markStartTimeMs("isHasQQ", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            C86709a0.m107528h();
            int nullAsNil = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null));
            if (nullAsNil == 0) {
                C76879j.m92743n(getContext(), C0966R.string.j2c, C0966R.string.a3h, new C95815i7(this), new C71249j7(this));
                SnsMethodCalculate.markEndTimeMs("isHasQQ", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                z = false;
            } else {
                z = nullAsNil != 0;
                SnsMethodCalculate.markEndTimeMs("isHasQQ", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            }
            if (!z) {
                this.f278896n = false;
                SnsMethodCalculate.markEndTimeMs("setSyncQQZone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                return;
            }
            this.f278891f.setImageDrawable(C74933u4.m89768e(this.f278899q, C0966R.raw.album_qzone_icon_normal, Color.parseColor("#FFC300")));
        } else {
            ImageView imageView = this.f278891f;
            Context context = this.f278899q;
            imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.album_qzone_icon_normal, context.getResources().getColor(C0966R.color.f3107fh)));
        }
        SnsMethodCalculate.markEndTimeMs("setSyncQQZone", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: e */
    public final void mo133065e() {
        SnsMethodCalculate.markStartTimeMs("setSyncTwitter", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f278895j) {
            SnsMethodCalculate.markStartTimeMs("isOpenTwitter", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            boolean z = true;
            if (!(((C118493b) this.f278901s).f354643b != null)) {
                C76879j.m92743n(getContext(), C0966R.string.j19, C0966R.string.a3h, new C96069m7(this), new C71235b7(this));
                SnsMethodCalculate.markEndTimeMs("isOpenTwitter", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                z = false;
            } else {
                SnsMethodCalculate.markEndTimeMs("isOpenTwitter", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            }
            if (!z) {
                this.f278895j = false;
                SnsMethodCalculate.markEndTimeMs("setSyncTwitter", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                return;
            }
            this.f278890e.setImageDrawable(C74933u4.m89768e(this.f278899q, C0966R.raw.album_twitter_icon_normal, Color.parseColor("#1DA1F2")));
        } else {
            ImageView imageView = this.f278890e;
            Context context = this.f278899q;
            imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.album_twitter_icon_normal, context.getResources().getColor(C0966R.color.f3107fh)));
        }
        SnsMethodCalculate.markEndTimeMs("setSyncTwitter", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: f */
    public final void mo133066f() {
        SnsMethodCalculate.markStartTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (this.f278892g == null) {
            SnsMethodCalculate.markEndTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            return;
        }
        if (this.f278898p) {
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC, false)) {
                this.f278892g.setVisibility(0);
                if (this.f278897o) {
                    this.f278892g.setImageDrawable(C74933u4.m89768e(this.f278899q, C0966R.raw.album_wesee_icon_normal, Color.parseColor("#FF0F80")));
                } else {
                    ImageView imageView = this.f278892g;
                    Context context = this.f278899q;
                    imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.album_wesee_icon_normal, context.getResources().getColor(C0966R.color.f3107fh)));
                }
                SnsMethodCalculate.markEndTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
                return;
            }
        }
        this.f278897o = false;
        this.f278892g.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("setSyncWeishi", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    /* renamed from: g */
    public final void mo133067g(int i) {
        SnsMethodCalculate.markStartTimeMs("showTwitterAlert", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        C76879j.m92743n(getContext(), i, C0966R.string.a3h, new C95674a(this), new C95675b(this));
        SnsMethodCalculate.markEndTimeMs("showTwitterAlert", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    public int getPrivated() {
        SnsMethodCalculate.markStartTimeMs("getPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z = this.f278893h;
        SnsMethodCalculate.markEndTimeMs("getPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        return z ? 1 : 0;
    }

    public int getSyncFlag() {
        SnsMethodCalculate.markStartTimeMs("getSyncFlag", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        int i = this.f278894i ? 2 : 0;
        if (this.f278895j) {
            i |= 8;
        }
        if (this.f278896n) {
            i |= 4;
        }
        if (this.f278897o) {
            i |= 16;
        }
        SnsMethodCalculate.markEndTimeMs("getSyncFlag", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        return i;
    }

    public C116918i getTwitterAccessToken() {
        SnsMethodCalculate.markStartTimeMs("getTwitterAccessToken", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        C116918i iVar = ((C118493b) this.f278901s).f354643b;
        SnsMethodCalculate.markEndTimeMs("getTwitterAccessToken", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        return iVar;
    }

    /* renamed from: o5 */
    public void mo5556o5(C101905a.C101908c cVar) {
        SnsMethodCalculate.markStartTimeMs("onTwitterAccessTokenValidated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (cVar.ordinal() == 1) {
            this.f278895j = false;
        }
        mo133065e();
        SnsMethodCalculate.markEndTimeMs("onTwitterAccessTokenValidated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (i == 0 && i2 == 0 && yVar != null) {
            mo133066f();
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }

    public void setPrivated(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        this.f278893h = z;
        if (z) {
            mo133062b();
        }
        SnsMethodCalculate.markEndTimeMs("setPrivated", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
    }
}
