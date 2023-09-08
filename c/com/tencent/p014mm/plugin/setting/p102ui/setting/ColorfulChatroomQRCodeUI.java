package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a11.C39479c;
import a70.C112760b;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.NewPersionalQRCodeReportStruct;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import dn2.C7373a;
import eb0.C31543z5;
import eb0.C45628s0;
import em0.C86571q;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ol0.C117792a0;
import p159gw.C98250h;
import p196ln.C76705f;
import p200lx.C10661v;
import p200lx.C46896e0;
import p227rn.C48053v;
import p239sv.C13783h;
import p239sv.C13786m;
import p629ny.C76979h;
import pe3.C47465a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48810b52;
import vo3.C90852c;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/ColorfulChatroomQRCodeUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lob0/n;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI */
public final class ColorfulChatroomQRCodeUI extends MMSecDataActivity implements C11385n {

    /* renamed from: t */
    public static final /* synthetic */ int f20639t = 0;

    /* renamed from: d */
    public final C13601g f20640d = C36568h.m40985a(new C5203k(this));

    /* renamed from: e */
    public final C13601g f20641e = C36568h.m40985a(new C5192a(this));

    /* renamed from: f */
    public final C13601g f20642f = C36568h.m40985a(new C5193b(this));

    /* renamed from: g */
    public final C13601g f20643g = C36568h.m40985a(new C5194c(this));

    /* renamed from: h */
    public final C13601g f20644h = C36568h.m40985a(new C5196e(this));

    /* renamed from: i */
    public final C13601g f20645i = C36568h.m40985a(new C5205m(this));

    /* renamed from: j */
    public final C13601g f20646j = C36568h.m40985a(new C5206n(this));

    /* renamed from: n */
    public byte[] f20647n;

    /* renamed from: o */
    public Bitmap f20648o;

    /* renamed from: p */
    public ProgressDialog f20649p;

    /* renamed from: q */
    public final C13601g f20650q = C36568h.m40985a(new C5204l(this));

    /* renamed from: r */
    public int f20651r;

    /* renamed from: s */
    public final C7373a f20652s = new C7373a(this, new C5201j(this));

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$a */
    public static final class C5192a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5192a(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20653d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            return (ImageView) this.f20653d.findViewById(C0966R.C0970id.o_9);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$b */
    public static final class C5193b extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5193b(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20654d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f20654d.findViewById(C0966R.C0970id.o__);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$c */
    public static final class C5194c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5194c(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20655d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            return (ImageView) this.f20655d.findViewById(C0966R.C0970id.o_a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$d */
    public static final class C5195d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f20656d;

        /* renamed from: e */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20657e;

        public C5195d(C117747y yVar, ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20656d = yVar;
            this.f20657e = colorfulChatroomQRCodeUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f20656d);
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f20657e;
            int i = ColorfulChatroomQRCodeUI.f20639t;
            if (C72996z1.m85820U5(colorfulChatroomQRCodeUI.getUserName()) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f20657e.getUserName())) {
                this.f20657e.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$e */
    public static final class C5196e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5196e(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20658d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            return (TextView) this.f20658d.findViewById(C0966R.C0970id.now);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$f */
    public static final class C5197f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20659d;

        public C5197f(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20659d = colorfulChatroomQRCodeUI;
        }

        public final void run() {
            Class cls = C76979h.class;
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f20659d;
            int i = ColorfulChatroomQRCodeUI.f20639t;
            if (colorfulChatroomQRCodeUI.mo6166J7().getLineCount() > 1) {
                ViewGroup.LayoutParams layoutParams = this.f20659d.mo6166J7().getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI2 = this.f20659d;
                    layoutParams2.setMargins(0, 0, 0, (int) (((float) colorfulChatroomQRCodeUI2.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv)) / C76577a.m92161l(colorfulChatroomQRCodeUI2)));
                    colorfulChatroomQRCodeUI2.mo6166J7().setLayoutParams(layoutParams2);
                }
            }
            this.f20659d.mo6167K7().getLayoutParams().width = (int) (((float) this.f20659d.mo6167K7().getWidth()) / C76577a.m92161l(this.f20659d));
            this.f20659d.mo6167K7().getLayoutParams().height = (int) (((float) this.f20659d.mo6167K7().getHeight()) / C76577a.m92161l(this.f20659d));
            this.f20659d.mo6166J7().requestLayout();
            this.f20659d.mo6167K7().requestLayout();
            if (C45628s0.m50748M(this.f20659d.getUserName())) {
                ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI3 = this.f20659d;
                String L7 = colorfulChatroomQRCodeUI3.mo6168L7(colorfulChatroomQRCodeUI3.mo6166J7().mo154968a().toString(), "...", "@@@@", this.f20659d.mo6166J7(), true);
                Drawable drawable = this.f20659d.getResources().getDrawable(C0966R.raw.open_im_main_logo);
                drawable.setBounds(0, 0, this.f20659d.mo6166J7().getLineHeight(), this.f20659d.mo6166J7().getLineHeight());
                ImageSpan imageSpan = new ImageSpan(drawable);
                SpannableString spannableString = new SpannableString(L7);
                MMNeat7extView J7 = this.f20659d.mo6166J7();
                ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI4 = this.f20659d;
                SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(colorfulChatroomQRCodeUI4, spannableString, colorfulChatroomQRCodeUI4.mo6166J7().getTextSize());
                yp02.setSpan(imageSpan, L7.length() - 4, L7.length(), 18);
                J7.mo104279b(yp02);
                return;
            }
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI5 = this.f20659d;
            String L72 = colorfulChatroomQRCodeUI5.mo6168L7(colorfulChatroomQRCodeUI5.mo6166J7().mo154968a().toString(), "...", "", this.f20659d.mo6166J7(), true);
            MMNeat7extView J72 = this.f20659d.mo6166J7();
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI6 = this.f20659d;
            J72.mo104279b(((C76979h) C86312j.m106911c(cls)).yp0(colorfulChatroomQRCodeUI6, L72, colorfulChatroomQRCodeUI6.mo6166J7().getTextSize()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$g */
    public static final class C5198g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20660d;

        public C5198g(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20660d = colorfulChatroomQRCodeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f20660d;
            C7373a aVar = colorfulChatroomQRCodeUI.f20652s;
            aVar.f25507c = true;
            aVar.mo8548b();
            C77407n nVar = colorfulChatroomQRCodeUI.f20652s.f25508d;
            if (nVar != null) {
                nVar.mo107573q();
            }
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 21;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) 99;
            newPersionalQRCodeReportStruct.mo86054n();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$h */
    public static final class C5199h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20661d;

        public C5199h(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20661d = colorfulChatroomQRCodeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20661d.hideVKB();
            this.f20661d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$i */
    public static final class C5200i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20662d;

        public C5200i(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20662d = colorfulChatroomQRCodeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/ColorfulChatroomQRCodeUI$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 13;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) 99;
            newPersionalQRCodeReportStruct.mo86054n();
            ColorfulChatroomQRCodeUI.m5210H7(this.f20662d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/ColorfulChatroomQRCodeUI$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$j */
    public static final class C5201j implements C7373a.C7374a {

        /* renamed from: a */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20663a;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$j$a */
        public static final class C5202a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32226l<String, C13598b0> f20664d;

            /* renamed from: e */
            public final /* synthetic */ String f20665e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5202a(C32226l<? super String, C13598b0> lVar, String str) {
                super(0);
                this.f20664d = lVar;
                this.f20665e = str;
            }

            public Object invoke() {
                this.f20664d.invoke(this.f20665e);
                return C13598b0.f38549a;
            }
        }

        public C5201j(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20663a = colorfulChatroomQRCodeUI;
        }

        /* renamed from: a */
        public void mo6178a() {
            ColorfulChatroomQRCodeUI.m5210H7(this.f20663a);
        }

        /* renamed from: b */
        public void mo6179b() {
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f20663a;
            int i = ColorfulChatroomQRCodeUI.f20639t;
            C76879j.m92717K(colorfulChatroomQRCodeUI, true, colorfulChatroomQRCodeUI.getString(C0966R.string.i4n), colorfulChatroomQRCodeUI.getString(C0966R.string.i4o), colorfulChatroomQRCodeUI.getString(C0966R.string.i4p), colorfulChatroomQRCodeUI.getString(C0966R.string.f7926wf), new C5337b(colorfulChatroomQRCodeUI), (DialogInterface.OnClickListener) null);
        }

        /* renamed from: c */
        public Bitmap mo6180c() {
            return this.f20663a.mo6165I7();
        }

        /* renamed from: d */
        public void mo6181d(C32226l<? super String, C13598b0> lVar) {
            C87412m.m108594g(lVar, "callback");
            String str = C112760b.m154236i0("qrcode_tmp").mo119971i() + "mmqrcode-" + System.currentTimeMillis() + ".png";
            ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f20663a;
            Bitmap c = mo6180c();
            C5202a aVar = new C5202a(lVar, str);
            colorfulChatroomQRCodeUI.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C5354g(c, str, colorfulChatroomQRCodeUI, aVar));
        }

        /* renamed from: e */
        public int mo6182e() {
            return 99;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$k */
    public static final class C5203k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5203k(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20666d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            return this.f20666d.findViewById(C0966R.C0970id.noz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$l */
    public static final class C5204l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5204l(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20667d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f20667d.getResources().getDimensionPixelSize(C0966R.dimen.f3758d_));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$m */
    public static final class C5205m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5205m(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20668d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f20668d.findViewById(C0966R.C0970id.f358990np0);
            C85875k4.m106191k0(textView.getPaint());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI$n */
    public static final class C5206n extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5206n(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            super(0);
            this.f20669d = colorfulChatroomQRCodeUI;
        }

        public Object invoke() {
            String stringExtra = this.f20669d.getIntent().getStringExtra("from_userName");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: H7 */
    public static final void m5210H7(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        colorfulChatroomQRCodeUI.getClass();
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(colorfulChatroomQRCodeUI, new C5340c(colorfulChatroomQRCodeUI), new C5344d(colorfulChatroomQRCodeUI));
    }

    /* renamed from: I7 */
    public final Bitmap mo6165I7() {
        Rect rect = new Rect();
        Object value = ((C36570n) this.f20641e).getValue();
        C87412m.m108593f(value, "<get-avatarImg>(...)");
        ((ImageView) value).getHitRect(rect);
        Rect rect2 = new Rect();
        Object value2 = ((C36570n) this.f20644h).getValue();
        C87412m.m108593f(value2, "<get-hintTv>(...)");
        ((TextView) value2).getHitRect(rect2);
        Rect rect3 = new Rect();
        mo6167K7().getHitRect(rect3);
        int max = Math.max(Math.min(rect2.left, rect3.left) - mo6170N7(), 0);
        int max2 = Math.max(rect.top - mo6170N7(), 0);
        int max3 = Math.max(rect2.right, rect3.right) + mo6170N7();
        Object value3 = ((C36570n) this.f20640d).getValue();
        C87412m.m108593f(value3, "<get-root>(...)");
        int min = Math.min(max3, ((View) value3).getWidth());
        int N7 = rect2.bottom + mo6170N7();
        Object value4 = ((C36570n) this.f20640d).getValue();
        C87412m.m108593f(value4, "<get-root>(...)");
        Rect rect4 = new Rect(max, max2, min, Math.min(N7, ((View) value4).getHeight()));
        Object value5 = ((C36570n) this.f20640d).getValue();
        C87412m.m108593f(value5, "<get-root>(...)");
        Bitmap bitmapFromView = BitmapUtil.getBitmapFromView((View) value5);
        C87412m.m108593f(bitmapFromView, "getBitmapFromView(root)");
        Bitmap createBitmap = Bitmap.createBitmap(bitmapFromView, rect4.left, rect4.top, rect4.width(), rect4.height());
        C87412m.m108593f(createBitmap, "createBitmap(rootBm,crop…dth(), cropRect.height())");
        bitmapFromView.recycle();
        return createBitmap;
    }

    /* renamed from: J7 */
    public final MMNeat7extView mo6166J7() {
        Object value = ((C36570n) this.f20642f).getValue();
        C87412m.m108593f(value, "<get-chatroomNameTv>(...)");
        return (MMNeat7extView) value;
    }

    /* renamed from: K7 */
    public final ImageView mo6167K7() {
        Object value = ((C36570n) this.f20643g).getValue();
        C87412m.m108593f(value, "<get-codeImg>(...)");
        return (ImageView) value;
    }

    /* renamed from: L7 */
    public final String mo6168L7(String str, String str2, String str3, MMNeat7extView mMNeat7extView, boolean z) {
        if (this.f20651r == 0) {
            this.f20651r = ((int) mMNeat7extView.getPaint().measureText("a")) * 2;
        }
        if (z) {
            if (mMNeat7extView.getPaint().measureText(str + str3) < ((float) ((getResources().getDimensionPixelSize(C0966R.dimen.f3740cu) - this.f20651r) * 2))) {
                return str + str3;
            }
        }
        String str4 = str + str2 + str3;
        if (mMNeat7extView.getPaint().measureText(str4) < ((float) ((getResources().getDimensionPixelSize(C0966R.dimen.f3740cu) - this.f20651r) * 2))) {
            return str4;
        }
        return mo6168L7(str.subSequence(0, str.length() - 1).toString(), str2, str3, mMNeat7extView, false);
    }

    /* renamed from: M7 */
    public final void mo6169M7(int i) {
        C117747y yVar;
        if (C72996z1.m85847r5(getUserName())) {
            yVar = ((C13786m) C86312j.m106911c(C13786m.class)).ig0(getUserName());
            C87412m.m108593f(yVar, "getService(\n            …MChatroomQRCode(userName)");
            C86709a0.m107524d().mo123460f(yVar);
        } else {
            C10661v dU = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71988dU(getUserName(), C86571q.CTRL_INDEX, i);
            C87412m.m108592e(dU, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            yVar = (C117747y) dU;
            C86709a0.m107524d().mo123460f(yVar);
        }
        this.f20649p = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f361157nc2), true, true, new C5195d(yVar, this));
    }

    /* renamed from: N7 */
    public final int mo6170N7() {
        return ((Number) ((C36570n) this.f20650q).getValue()).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6171O7(int r3, int r4, java.lang.String r5, com.tencent.p014mm.plugin.setting.p102ui.setting.C5401s r6) {
        /*
            r2 = this;
            wc3.y r0 = tm2.C14049d.m13402a()
            androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()
            boolean r5 = r0.mo93165v5(r1, r3, r4, r5)
            if (r5 == 0) goto L_0x000f
            return
        L_0x000f:
            r5 = 2
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L_0x00a2
            if (r4 == 0) goto L_0x0018
            goto L_0x00a2
        L_0x0018:
            byte[] r3 = r6.mo6324b()
            r2.f20647n = r3
            byte[] r3 = r6.mo6324b()
            if (r3 == 0) goto L_0x003a
            byte[] r3 = r6.mo6324b()
            if (r3 == 0) goto L_0x002e
            int r3 = r3.length
            if (r3 != 0) goto L_0x002e
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            byte[] r3 = r2.f20647n
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r3)
            r2.f20648o = r3
            goto L_0x005d
        L_0x003a:
            java.lang.String r3 = r6.mo6326d()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x005d
            java.lang.Class<lx.k0> r3 = p200lx.C10660k0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            lx.k0 r3 = (p200lx.C10660k0) r3
            java.lang.String r4 = r6.mo6326d()
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r0 == 0) goto L_0x0057
            r5 = 1
        L_0x0057:
            android.graphics.Bitmap r3 = r3.p60(r4, r5, r1)
            r2.f20648o = r3
        L_0x005d:
            java.lang.String r3 = r2.getUserName()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 != 0) goto L_0x0079
            java.lang.Class<rn.v> r3 = p227rn.C48053v.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            rn.v r3 = (p227rn.C48053v) r3
            java.lang.String r4 = r2.getUserName()
            boolean r3 = r3.mo72617gl(r4)
            if (r3 == 0) goto L_0x0098
        L_0x0079:
            r2.enableOptionMenu(r1)
            java.lang.String r3 = r6.mo6325c()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0098
            rx3.g r4 = r2.f20644h
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r5 = "<get-hintTv>(...)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
        L_0x0098:
            android.widget.ImageView r3 = r2.mo6167K7()
            android.graphics.Bitmap r4 = r2.f20648o
            r3.setImageBitmap(r4)
            return
        L_0x00a2:
            r6 = 2131830380(0x7f11266c, float:1.9293756E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r0] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5[r1] = r3
            java.lang.String r3 = r2.getString(r6, r5)
            android.widget.Toast r3 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r3, (int) r0)
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.ColorfulChatroomQRCodeUI.mo6171O7(int, int, java.lang.String, com.tencent.mm.plugin.setting.ui.setting.s):void");
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d7i;
    }

    public final String getUserName() {
        return (String) ((C36570n) this.f20646j).getValue();
    }

    public final void init() {
        C86709a0.m107524d().mo123455a(168, this);
        C86709a0.m107524d().mo123455a(C117792a0.CTRL_INDEX, this);
        C85875k4.m106191k0(mo6166J7().getPaint());
        mo6166J7().mo154994l(0, ((float) C76577a.m92155f(this, C0966R.dimen.f3635t)) * C76577a.m92161l(this));
        mo6169M7(1);
        Object value = ((C36570n) this.f20641e).getValue();
        C87412m.m108593f(value, "<get-avatarImg>(...)");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) value, getUserName());
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(getUserName());
        mo6166J7().setMaxLines(2);
        mo6167K7();
        mo6166J7().post(new C5197f(this));
        if (z1Var != null) {
            String nickname = z1Var.getNickname();
            if (Util.isNullOrNil(nickname)) {
                nickname = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(getUserName()).field_displayname;
            }
            mo6166J7().mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, getString(C0966R.string.f360248ct1, new Object[]{nickname}), mo6166J7().getTextSize()));
        } else {
            mo6166J7().setVisibility(8);
        }
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C5198g(this));
        setBackBtn(new C5199h(this));
        if (C85875k4.m106211z()) {
            Object value2 = ((C36570n) this.f20645i).getValue();
            C87412m.m108593f(value2, "<get-saveTv>(...)");
            ((TextView) value2).setTextColor(getContext().getResources().getColorStateList(C0966R.color.alc));
        } else {
            Object value3 = ((C36570n) this.f20645i).getValue();
            C87412m.m108593f(value3, "<get-saveTv>(...)");
            ((TextView) value3).setTextColor(getContext().getResources().getColorStateList(C0966R.color.a1g));
        }
        Object value4 = ((C36570n) this.f20645i).getValue();
        C87412m.m108593f(value4, "<get-saveTv>(...)");
        ((TextView) value4).setOnClickListener(new C5200i(this));
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
        newPersionalQRCodeReportStruct.f10019d = (long) 1;
        newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
        newPersionalQRCodeReportStruct.f10021f = (long) 99;
        newPersionalQRCodeReportStruct.mo86054n();
        if (C85875k4.m106211z()) {
            setActionbarColor(0);
        } else {
            setActionbarColor(-1);
        }
        hideActionbarLine();
        setMMTitle("");
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        getWindow().setFlags(201327616, 201327616);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
        newPersionalQRCodeReportStruct.f10019d = (long) 33;
        newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
        newPersionalQRCodeReportStruct.f10021f = (long) 99;
        newPersionalQRCodeReportStruct.mo86054n();
        C86709a0.m107524d().mo123470p(168, this);
        C86709a0.m107524d().mo123470p(C117792a0.CTRL_INDEX, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ColorfulChatroomQRCodeUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f20649p;
        if (progressDialog != null) {
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f20649p = null;
        }
        if (yVar instanceof C10661v) {
            if (str == null) {
                str = "";
            }
            mo6171O7(i, i2, str, new C5350f((C10661v) yVar));
        } else if (yVar instanceof C13783h) {
            if (str == null) {
                str = "";
            }
            C114799u reqResp = yVar.getReqResp();
            C87412m.m108592e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            C47465a aVar = ((C47350c) reqResp).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetOpenIMChatRoomQRCodeResp");
            C48810b52 b522 = (C48810b52) aVar;
            byte[] bArr = b522.f130948d.f257327a;
            C87412m.m108593f(bArr, "resp.qrcode.getBytes()");
            String str2 = b522.f130949e;
            C87412m.m108593f(str2, "resp.footer_wording");
            mo6171O7(i, i2, str, new C5347e(bArr, str2));
        }
    }
}
