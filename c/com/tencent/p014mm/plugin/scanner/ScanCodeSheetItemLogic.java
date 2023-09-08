package com.tencent.p014mm.plugin.scanner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.bottomsheet.ViewTitleWithAnimation;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import gc0.C20828a;
import hc0.C20937c;
import io3.C9232a;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lp3.C88631d;
import nj3.C76874e0;
import nj3.C76875f0;
import org.json.JSONObject;
import p200lx.C46897s;
import p200lx.C46900z;
import qo3.C77407n;
import te3.C51216sa2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic */
public class ScanCodeSheetItemLogic implements C0124r, C46900z {

    /* renamed from: d */
    public Context f116146d;

    /* renamed from: e */
    public C51216sa2 f116147e = null;

    /* renamed from: f */
    public final C51216sa2 f116148f = new C51216sa2();

    /* renamed from: g */
    public C46900z.C46901a f116149g;

    /* renamed from: h */
    public C46900z.C46902b f116150h;

    /* renamed from: i */
    public C42902i f116151i;

    /* renamed from: j */
    public HashMap<String, C51216sa2> f116152j = new HashMap<>();

    /* renamed from: n */
    public int f116153n;

    /* renamed from: o */
    public boolean f116154o;

    /* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic$d */
    public class C5152d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f20551d;

        /* renamed from: e */
        public final /* synthetic */ View.OnClickListener f20552e;

        public C5152d(ScanCodeSheetItemLogic scanCodeSheetItemLogic, int i, View.OnClickListener onClickListener) {
            this.f20551d = i;
            this.f20552e = onClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String safeFormatString = Util.safeFormatString("%d,%d", Integer.valueOf(this.f20551d), Long.valueOf(System.currentTimeMillis()));
            Log.m105924i("MicroMsg.ScanCodeSheetItemLogic", "18684 report:" + safeFormatString);
            C115669n.INSTANCE.kvStat(18684, safeFormatString);
            this.f20552e.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic$e */
    public class C5153e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f20553d;

        /* renamed from: e */
        public final /* synthetic */ View.OnClickListener f20554e;

        public C5153e(ScanCodeSheetItemLogic scanCodeSheetItemLogic, int i, View.OnClickListener onClickListener) {
            this.f20553d = i;
            this.f20554e = onClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String safeFormatString = Util.safeFormatString("%d,%d", Integer.valueOf(this.f20553d), Long.valueOf(System.currentTimeMillis()));
            Log.m105924i("MicroMsg.ScanCodeSheetItemLogic", "18684 report:" + safeFormatString);
            C115669n.INSTANCE.kvStat(18684, safeFormatString);
            this.f20554e.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ScanCodeSheetItemLogic$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic$a */
    public class C42895a implements C88631d.C88632b<C51216sa2> {

        /* renamed from: a */
        public final /* synthetic */ String f116156a;

        /* renamed from: b */
        public final /* synthetic */ C46900z.C46901a f116157b;

        public C42895a(String str, C46900z.C46901a aVar) {
            this.f116156a = str;
            this.f116157b = aVar;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C51216sa2 sa22 = (C51216sa2) obj;
            if (sa22 != null) {
                ScanCodeSheetItemLogic scanCodeSheetItemLogic = ScanCodeSheetItemLogic.this;
                scanCodeSheetItemLogic.f116147e = sa22;
                ScanCodeSheetItemLogic.m46549a(scanCodeSheetItemLogic, sa22);
                ScanCodeSheetItemLogic.this.f116152j.put(this.f116156a, sa22);
                C46900z.C46901a aVar = this.f116157b;
                if (aVar != null) {
                    aVar.mo64788a();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic$b */
    public class C42896b implements C88631d.C88632b<C51216sa2> {

        /* renamed from: a */
        public final /* synthetic */ String f116159a;

        public C42896b(String str) {
            this.f116159a = str;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C51216sa2 sa22 = (C51216sa2) obj;
            if (sa22 != null) {
                ScanCodeSheetItemLogic scanCodeSheetItemLogic = ScanCodeSheetItemLogic.this;
                if (scanCodeSheetItemLogic.f116147e == scanCodeSheetItemLogic.f116148f) {
                    Log.m105924i("MicroMsg.ScanCodeSheetItemLogic", "net call back after 1s");
                } else if (!scanCodeSheetItemLogic.f116154o) {
                    Log.m105924i("MicroMsg.ScanCodeSheetItemLogic", "enableCallback false");
                } else {
                    ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.ScanCodeSheetItemLogic");
                    ScanCodeSheetItemLogic scanCodeSheetItemLogic2 = ScanCodeSheetItemLogic.this;
                    scanCodeSheetItemLogic2.f116147e = sa22;
                    ScanCodeSheetItemLogic.m46549a(scanCodeSheetItemLogic2, sa22);
                    ScanCodeSheetItemLogic.this.f116152j.put(this.f116159a, sa22);
                    C46900z.C46901a aVar = ScanCodeSheetItemLogic.this.f116149g;
                    if (aVar != null) {
                        aVar.mo64788a();
                    }
                    ScanCodeSheetItemLogic scanCodeSheetItemLogic3 = ScanCodeSheetItemLogic.this;
                    C46900z.C46902b bVar = scanCodeSheetItemLogic3.f116150h;
                    if (bVar != null) {
                        bVar.mo72110a(this.f116159a, scanCodeSheetItemLogic3.f116147e);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic$c */
    public class C42897c implements C88631d.C88632b<C51216sa2> {

        /* renamed from: a */
        public final /* synthetic */ String f116161a;

        public C42897c(String str) {
            this.f116161a = str;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C51216sa2 sa22 = (C51216sa2) obj;
            if (sa22 != null) {
                ScanCodeSheetItemLogic scanCodeSheetItemLogic = ScanCodeSheetItemLogic.this;
                scanCodeSheetItemLogic.f116147e = sa22;
                ScanCodeSheetItemLogic.m46549a(scanCodeSheetItemLogic, sa22);
                ScanCodeSheetItemLogic.this.f116152j.put(this.f116161a, sa22);
                C46900z.C46901a aVar = ScanCodeSheetItemLogic.this.f116149g;
                if (aVar != null) {
                    aVar.mo64788a();
                }
                ScanCodeSheetItemLogic scanCodeSheetItemLogic2 = ScanCodeSheetItemLogic.this;
                C46900z.C46902b bVar = scanCodeSheetItemLogic2.f116150h;
                if (bVar != null) {
                    bVar.mo72110a(this.f116161a, scanCodeSheetItemLogic2.f116147e);
                }
            }
        }
    }

    public ScanCodeSheetItemLogic(Context context) {
        new C54219z();
        this.f116154o = false;
        this.f116146d = context;
    }

    /* renamed from: a */
    public static void m46549a(ScanCodeSheetItemLogic scanCodeSheetItemLogic, C51216sa2 sa22) {
        scanCodeSheetItemLogic.getClass();
        if (sa22 != null && !TextUtils.isEmpty(sa22.f141408n)) {
            try {
                String optString = new JSONObject(sa22.f141408n).optString("username");
                if (!TextUtils.isEmpty(optString) && C72996z1.m85804J4(optString)) {
                    Log.m105925i("MicroMsg.ScanCodeSheetItemLogic", "try preloadWxaAttrs username:%s, scene:%d", optString, Integer.valueOf(scanCodeSheetItemLogic.f116153n));
                    EventScanCodeSheetPreloadWxaAttrs eventScanCodeSheetPreloadWxaAttrs = new EventScanCodeSheetPreloadWxaAttrs();
                    eventScanCodeSheetPreloadWxaAttrs.f81941d = optString;
                    eventScanCodeSheetPreloadWxaAttrs.publish();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public View mo67071b(View.OnClickListener onClickListener, int i, String str, int i2) {
        this.f116153n = i2;
        C5152d dVar = new C5152d(this, i2, onClickListener);
        return this.f116147e == null ? mo67075f(dVar, i, str) : mo67076g(dVar);
    }

    /* renamed from: c */
    public View mo67072c(View.OnClickListener onClickListener, List<ImageQBarDataBean> list, ImageQBarDataBean imageQBarDataBean, int i) {
        this.f116153n = i;
        C5153e eVar = new C5153e(this, i, onClickListener);
        if (this.f116147e != null) {
            return mo67076g(eVar);
        }
        if (list == null || list.isEmpty()) {
            Log.m105920e("MicroMsg.ScanCodeSheetItemLogic", "createQRCodeMenuItemDefault return null,  list is null or empty");
            return null;
        } else if (imageQBarDataBean != null) {
            return mo67075f(eVar, imageQBarDataBean.f273114e, imageQBarDataBean.f273113d);
        } else {
            if (list.size() == 1) {
                ImageQBarDataBean imageQBarDataBean2 = list.get(0);
                return mo67075f(eVar, imageQBarDataBean2.f273114e, imageQBarDataBean2.f273113d);
            }
            String m = mo67082m(list);
            C9232a aVar = new C9232a(this.f116146d);
            aVar.setOnClickListener(eVar);
            aVar.setTitle(m);
            return aVar;
        }
    }

    /* renamed from: d */
    public void mo67073d(int i, String str, C77407n nVar, C76874e0 e0Var, int i2) {
        String str2 = str;
        C77407n nVar2 = nVar;
        C76874e0 e0Var2 = e0Var;
        int i3 = i2;
        C51216sa2 sa22 = this.f116147e;
        if (sa22 != null && (Util.isEqual(sa22.f141402e, str) || this.f116147e == this.f116148f)) {
            C51216sa2 sa23 = this.f116147e;
            if ((sa23 == null || (sa23.f141409o & 1) == 0) ? false : true) {
                Log.m105921e("MicroMsg.ScanCodeSheetItemLogic", "qrcode banned: %s, remove menu: %d", str2, Integer.valueOf(i2));
                e0Var.removeItem(i2);
            } else if (sa23.f141401d == 0 && !Util.isNullOrNil(sa23.f141406i)) {
                C51216sa2 sa24 = this.f116147e;
                String str3 = sa24.f141406i;
                C42919v vVar = new C42919v(this, i3);
                nVar2.f225721B = vVar;
                nVar2.f225719A = vVar;
                int i4 = sa24.f141404g;
                if (i4 == 4) {
                    e0Var.mo107155o(i2, str3, this.f116146d.getString(C0966R.string.f361229ib3), 0, 0);
                } else if (i4 == 3) {
                    e0Var.mo107155o(i2, str3, this.f116146d.getString(C0966R.string.ibf), 0, 0);
                } else if (i4 == 1) {
                    e0Var.mo107155o(i2, str3, this.f116146d.getString(C0966R.string.ids), 0, 0);
                } else if (i4 == 2) {
                    e0Var.mo107155o(i2, str3, this.f116146d.getString(C0966R.string.icc), 0, this.f116146d.getResources().getColor(C0966R.color.FG_0));
                } else if (i4 == 7) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String str4 = str3 + " ";
                    spannableStringBuilder.append(str4);
                    String str5 = "@" + this.f116147e.f141408n;
                    spannableStringBuilder.append(str5);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f116146d.getResources().getColor(C0966R.color.f2960ag)), str4.length(), str4.length() + str5.length(), 33);
                    e0Var.mo107155o(i2, spannableStringBuilder, this.f116146d.getString(C0966R.string.iez), 0, 0);
                } else if (i4 == 6) {
                    e0Var.mo107155o(i2, Util.safeFormatString(this.f116146d.getString(C0966R.string.idr), this.f116147e.f141406i), this.f116146d.getString(C0966R.string.idq), 0, this.f116146d.getResources().getColor(C0966R.color.FG_0));
                } else if (i4 == 5) {
                    e0Var.mo107155o(i2, Util.safeFormatString(this.f116146d.getString(C0966R.string.iee), this.f116147e.f141406i), this.f116146d.getString(C0966R.string.ied), 0, this.f116146d.getResources().getColor(C0966R.color.FG_0));
                } else if (i4 == 9) {
                    e0Var.mo107155o(i2, str3, this.f116146d.getString(C0966R.string.f361230ic1), 0, 0);
                }
            } else if (C42914t.m46583d(i, str) || C42914t.m46587h(i, str) || C42914t.m46591l(i, str) || C42914t.m46593n(i, str)) {
                e0Var2.mo107146h(i3, this.f116146d.getString(C0966R.string.ick), C0966R.raw.icons_outlined_qr_code, this.f116146d.getResources().getColor(C0966R.color.FG_0));
            } else if (C42914t.m46594o(i, str)) {
                e0Var2.mo107146h(i3, this.f116146d.getString(C0966R.string.icm), C0966R.raw.icons_outlined_qr_code, this.f116146d.getResources().getColor(C0966R.color.FG_0));
            } else if (C42914t.m46590k(i, str)) {
                e0Var2.mo107146h(i3, this.f116146d.getString(C0966R.string.icj), C0966R.raw.icons_outlined_wechatpay, this.f116146d.getResources().getColor(C0966R.color.FG_0));
            } else if (C42914t.m46592m(i, str)) {
                e0Var2.mo107146h(i3, this.f116146d.getString(C0966R.string.icl), C0966R.raw.icons_outlined_pay_reward_code, this.f116146d.getResources().getColor(C0966R.color.FG_0));
            } else {
                String string = this.f116146d.getString(C0966R.string.ick);
                if (!C5177x.m5205b(i)) {
                    string = this.f116146d.getString(C0966R.string.ici);
                }
                e0Var2.mo107146h(i3, string, C0966R.raw.icons_outlined_qr_code, this.f116146d.getResources().getColor(C0966R.color.FG_0));
            }
        } else if (C42914t.m46584e(i, str)) {
            C76875f0 f0Var = new C76875f0(e0Var2.f224706f, i3, 0);
            f0Var.f224714f = true;
            ((ArrayList) e0Var2.f224704d).add(f0Var);
        } else {
            e0Var2.mo107144g(i3, mo67081l(i, str), C0966R.raw.icons_outlined_qr_code);
        }
    }

    /* renamed from: e */
    public void mo67074e(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, C77407n nVar, C76874e0 e0Var, int i) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() <= 1) {
                mo67073d(arrayList.get(0).f273114e, arrayList.get(0).f273113d, nVar, e0Var, i);
            } else if (imageQBarDataBean != null) {
                mo67073d(imageQBarDataBean.f273114e, imageQBarDataBean.f273113d, nVar, e0Var, i);
            } else {
                e0Var.mo107144g(i, mo67082m(arrayList), C0966R.raw.icons_outlined_qr_code);
            }
        }
    }

    /* renamed from: f */
    public final View mo67075f(View.OnClickListener onClickListener, int i, String str) {
        ViewTitleWithAnimation viewTitleWithAnimation = new ViewTitleWithAnimation(this.f116146d);
        viewTitleWithAnimation.f122373h.clearAnimation();
        viewTitleWithAnimation.f122369d.setVisibility(8);
        viewTitleWithAnimation.f122372g.setVisibility(8);
        viewTitleWithAnimation.f122370e.setVisibility(8);
        viewTitleWithAnimation.f122373h.setVisibility(0);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        viewTitleWithAnimation.f122373h.startAnimation(rotateAnimation);
        viewTitleWithAnimation.setOnClickListener(onClickListener);
        if (C42914t.m46594o(i, str)) {
            viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.raw.actionsheet_default_appbrand_icon);
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic4));
        } else if (C42914t.m46583d(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic5));
            viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
            viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.C0969drawable.apu);
        } else if (C42914t.m46591l(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic9));
            viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
            viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.color.BW_BG_95);
        } else if (C42914t.m46587h(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic7));
            viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
            viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.raw.default_chatroom);
        } else if (C42914t.m46593n(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ica));
            viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
            viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.color.BW_BG_95);
        } else if (C42914t.m46590k(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic8));
            ImageView iconImageView = viewTitleWithAnimation.getIconImageView();
            Context context = this.f116146d;
            iconImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_wallet, context.getResources().getColor(C0966R.color.Brand_100)));
        } else if (C42914t.m46592m(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic_));
            ImageView iconImageView2 = viewTitleWithAnimation.getIconImageView();
            Context context2 = this.f116146d;
            iconImageView2.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icon_scan_code_reward, context2.getResources().getColor(C0966R.color.f2976b7)));
        } else if (C42914t.m46586g(i, str)) {
            viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic6));
            viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
            viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.C0969drawable.apu);
        } else {
            String string = this.f116146d.getString(C0966R.string.idu);
            if (!C5177x.m5205b(i)) {
                string = this.f116146d.getString(C0966R.string.idt);
            }
            C9232a aVar = new C9232a(this.f116146d);
            aVar.setOnClickListener(onClickListener);
            aVar.setTitle(string);
            return aVar;
        }
        return viewTitleWithAnimation;
    }

    /* renamed from: g */
    public final View mo67076g(View.OnClickListener onClickListener) {
        C51216sa2 sa22 = this.f116147e;
        if ((sa22 == null || (sa22.f141409o & 1) == 0) ? false : true) {
            Log.m105920e("MicroMsg.ScanCodeSheetItemLogic", "qrcode banned, remove menu");
            return null;
        } else if (sa22 == null) {
            Log.m105920e("MicroMsg.ScanCodeSheetItemLogic", "qrcode mCodeInfoRespItem is null, remove menu");
            return null;
        } else {
            ViewTitleWithAnimation viewTitleWithAnimation = new ViewTitleWithAnimation(this.f116146d);
            viewTitleWithAnimation.f122373h.clearAnimation();
            viewTitleWithAnimation.f122373h.setVisibility(8);
            viewTitleWithAnimation.f122369d.setVisibility(0);
            viewTitleWithAnimation.f122370e.setVisibility(0);
            viewTitleWithAnimation.f122372g.setVisibility(0);
            C51216sa2 sa23 = this.f116147e;
            if (sa23.f141401d != 0 || Util.isNullOrNil(sa23.f141406i)) {
                viewTitleWithAnimation.f122375j.setVisibility(4);
                viewTitleWithAnimation.f122374i.setVisibility(0);
                viewTitleWithAnimation.setOnClickListener(onClickListener);
                return viewTitleWithAnimation;
            }
            viewTitleWithAnimation.setTitle(this.f116147e.f141406i);
            viewTitleWithAnimation.setOnClickListener(onClickListener);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59347c = true;
            viewTitleWithAnimation.getIconImageView().setBackground((Drawable) null);
            viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
            int i = this.f116147e.f141404g;
            if (i == 4) {
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic4));
                bVar.f59359o = C0966R.raw.actionsheet_default_appbrand_icon;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(this.f116147e.f141407j, viewTitleWithAnimation.getIconImageView(), bVar.mo32666a());
            } else if (i == 3) {
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic5));
                bVar.f59359o = C0966R.C0969drawable.apu;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(this.f116147e.f141407j, viewTitleWithAnimation.getIconImageView(), bVar.mo32666a());
            } else if (i == 1) {
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic9));
                bVar.f59359o = C0966R.color.BW_BG_95;
                C20828a.m22825b().mo32519h(this.f116147e.f141407j, viewTitleWithAnimation.getIconImageView(), bVar.mo32666a());
            } else if (i == 2) {
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic7));
                viewTitleWithAnimation.getIconImageView().setImageResource(C0966R.raw.default_chatroom);
            } else if (i == 7) {
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ica));
                viewTitleWithAnimation.getIconImageView().setImageDrawable((Drawable) null);
                if (!Util.isNullOrNil(this.f116147e.f141408n)) {
                    viewTitleWithAnimation.setCompanyText(Util.safeFormatString("@%s", this.f116147e.f141408n));
                }
                bVar.f59359o = C0966R.color.BW_BG_95;
                C20828a.m22825b().mo32519h(this.f116147e.f141407j, viewTitleWithAnimation.getIconImageView(), bVar.mo32666a());
            } else if (i == 6) {
                viewTitleWithAnimation.setTitle(Util.safeFormatString(this.f116146d.getString(C0966R.string.idr), this.f116147e.f141406i));
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic8));
                ImageView iconImageView = viewTitleWithAnimation.getIconImageView();
                Context context = this.f116146d;
                iconImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_wallet, context.getResources().getColor(C0966R.color.f2939n)));
            } else if (i == 5) {
                viewTitleWithAnimation.setTitle(Util.safeFormatString(this.f116146d.getString(C0966R.string.iee), this.f116147e.f141406i));
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic_));
                ImageView iconImageView2 = viewTitleWithAnimation.getIconImageView();
                Context context2 = this.f116146d;
                iconImageView2.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icon_scan_code_reward, context2.getResources().getColor(C0966R.color.f2976b7)));
            } else if (i == 9) {
                viewTitleWithAnimation.setSubTitle(this.f116146d.getString(C0966R.string.ic6));
                bVar.f59359o = C0966R.C0969drawable.apu;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(this.f116147e.f141407j, viewTitleWithAnimation.getIconImageView(), bVar.mo32666a());
            } else {
                viewTitleWithAnimation.f122375j.setVisibility(4);
                viewTitleWithAnimation.f122374i.setVisibility(0);
            }
            return viewTitleWithAnimation;
        }
    }

    /* renamed from: h */
    public void mo67077h(int i, String str) {
        mo67078i(i, new C46897s.C46898a(str));
    }

    /* renamed from: i */
    public void mo67078i(int i, C46897s.C46898a aVar) {
        this.f116147e = null;
        String trim = aVar.f126105a.trim();
        aVar.f126105a = trim;
        if (!Util.isNullOrNil(trim)) {
            if (this.f116151i == null) {
                this.f116151i = new C42902i();
            }
            if (C42914t.m46584e(i, trim)) {
                this.f116151i.mo67099a(i, aVar).mo114038a(new C42897c(trim));
            }
        }
    }

    /* renamed from: j */
    public void mo67079j(int i, C46897s.C46898a aVar, long j) {
        this.f116154o = true;
        this.f116147e = null;
        ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.ScanCodeSheetItemLogic");
        String str = aVar.f126105a;
        if (!Util.isNullOrNil(str)) {
            if (this.f116151i == null) {
                this.f116151i = new C42902i();
            }
            if (C42914t.m46584e(i, str)) {
                if (j > 0) {
                    ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.ScanCodeSheetItemLogic");
                    ((C119157j) C119157j.f356862d).mo183879j(new C42915u(this, str), j, "MicroMsg.ScanCodeSheetItemLogic");
                }
                this.f116151i.mo67099a(i, aVar).mo114038a(new C42896b(str));
            }
        }
    }

    /* renamed from: k */
    public void mo67080k(int i, C46897s.C46898a aVar, C46900z.C46901a aVar2) {
        this.f116147e = null;
        String str = aVar.f126105a;
        if (!Util.isNullOrNil(str)) {
            if (this.f116151i == null) {
                this.f116151i = new C42902i();
            }
            if (C42914t.m46584e(i, str)) {
                this.f116151i.mo67099a(i, aVar).mo114038a(new C42895a(str, aVar2));
            }
        }
    }

    /* renamed from: l */
    public String mo67081l(int i, String str) {
        return !C5177x.m5205b(i) ? this.f116146d.getString(C0966R.string.ici) : this.f116146d.getString(C0966R.string.ick);
    }

    /* renamed from: m */
    public String mo67082m(List<ImageQBarDataBean> list) {
        boolean z;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            z = true;
            if (i >= list.size()) {
                break;
            }
            String str = list.get(i).f273113d;
            int i2 = list.get(i).f273114e;
            if (C42914t.m46594o(i2, str)) {
                z5 = true;
            } else if (!C5177x.m5205b(i2)) {
                z4 = true;
            } else {
                z3 = true;
            }
            i++;
        }
        StringBuilder sb = new StringBuilder("识别图中");
        if (z3) {
            sb.append("二维码");
            z2 = true;
        }
        if (z4) {
            if (z2) {
                sb.append(" / ");
            }
            sb.append("条码");
        } else {
            z = z2;
        }
        if (z5) {
            if (z) {
                sb.append(" / ");
            }
            sb.append("小程序码");
        }
        return sb.toString();
    }

    /* renamed from: n */
    public void mo67083n() {
        ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.ScanCodeSheetItemLogic");
        this.f116147e = null;
        this.f116154o = false;
    }

    /* renamed from: o */
    public void mo67084o(int i, byte[] bArr) {
        C51216sa2 sa22 = new C51216sa2();
        if (i != 0 || Util.isNullOrNil(bArr)) {
            sa22.f141401d = -1;
        } else {
            try {
                sa22.parseFrom(bArr);
                if (Util.isNullOrNil(sa22.f141407j) && Util.isNullOrNil(sa22.f141406i)) {
                    sa22.f141401d = -1;
                }
            } catch (IOException e) {
                Log.m105921e("MicroMsg.ScanCodeSheetItemLogic", "parse exception: s%", e.getMessage());
                sa22.f141401d = -1;
            }
        }
        this.f116147e = sa22;
        C46900z.C46901a aVar = this.f116149g;
        if (aVar != null) {
            aVar.mo64788a();
        }
    }

    public ScanCodeSheetItemLogic(Context context, C46900z.C46901a aVar) {
        new C54219z();
        this.f116154o = false;
        this.f116146d = context;
        this.f116149g = aVar;
    }

    public ScanCodeSheetItemLogic(Context context, C46900z.C46902b bVar) {
        new C54219z();
        this.f116154o = false;
        this.f116146d = context;
        this.f116150h = bVar;
    }

    public ScanCodeSheetItemLogic(Context context, C46900z.C46902b bVar, C0125s sVar) {
        new C54219z();
        this.f116154o = false;
        this.f116146d = context;
        this.f116150h = bVar;
        sVar.getLifecycle().addObserver(new C0124r() {
            @C112974b0(C39623j.C39625b.ON_DESTROY)
            public void onDestroyed() {
                ScanCodeSheetItemLogic.this.f116150h = null;
            }
        });
    }
}
