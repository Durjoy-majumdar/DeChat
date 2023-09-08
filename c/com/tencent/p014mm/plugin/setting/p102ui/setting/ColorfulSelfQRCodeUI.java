package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a70.C112760b;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.NewPersionalQRCodeReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C5380o;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72982l3;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dn2.C7373a;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import g62.C8232g;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ke3.C88144b;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p159gw.C98250h;
import p182kk.C61104a;
import p196ln.C76705f;
import p200lx.C10661v;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vo3.C90852c;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lob0/n;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI */
public final class ColorfulSelfQRCodeUI extends MMSecDataActivity implements C11385n {

    /* renamed from: B */
    public static final /* synthetic */ int f20670B = 0;

    /* renamed from: A */
    public final MStorage.IOnStorageChange f20671A = new C5213f(this);

    /* renamed from: d */
    public final C13601g f20672d = C36568h.m40985a(new C5209b(this));

    /* renamed from: e */
    public final C13601g f20673e = C36568h.m40985a(new C5207a(this));

    /* renamed from: f */
    public final C13601g f20674f = C36568h.m40985a(new C5208a0(this));

    /* renamed from: g */
    public final C13601g f20675g = C36568h.m40985a(new C5220m(this));

    /* renamed from: h */
    public final C13601g f20676h = C36568h.m40985a(new C5225q(this));

    /* renamed from: i */
    public final C13601g f20677i = C36568h.m40985a(new C5212e(this));

    /* renamed from: j */
    public final C13601g f20678j = C36568h.m40985a(new C5211d(this));

    /* renamed from: n */
    public final C13601g f20679n = C36568h.m40985a(new C5214g(this));

    /* renamed from: o */
    public final C13601g f20680o = C36568h.m40985a(new C5228t(this));

    /* renamed from: p */
    public final C13601g f20681p = C36568h.m40985a(new C5210c(this));

    /* renamed from: q */
    public final C13601g f20682q = C36568h.m40985a(new C5227s(this));

    /* renamed from: r */
    public final C13601g f20683r = C36568h.m40985a(new C5229u(this));

    /* renamed from: s */
    public final C13601g f20684s = C36568h.m40985a(new C5233y(this));

    /* renamed from: t */
    public final C13601g f20685t = C36568h.m40985a(new C5230v(this));

    /* renamed from: u */
    public final C13601g f20686u = C36568h.m40985a(new C5231w(this));

    /* renamed from: v */
    public final C13601g f20687v = C36568h.m40985a(new C5232x(this));

    /* renamed from: w */
    public final C7373a f20688w = new C7373a(this, new C5221n(this));

    /* renamed from: x */
    public final Set<String> f20689x = new LinkedHashSet();

    /* renamed from: y */
    public List<C72979k3> f20690y = new ArrayList();

    /* renamed from: z */
    public final MTimerHandler f20691z = new MTimerHandler(new C5226r(this), true);

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$a */
    public static final class C5207a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5207a(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20692d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (ImageView) this.f20692d.findViewById(C0966R.C0970id.noq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$a0 */
    public static final class C5208a0 extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5208a0(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20693d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (TextView) this.f20693d.findViewById(C0966R.C0970id.f358992np2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$b */
    public static final class C5209b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5209b(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20694d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (ImageView) this.f20694d.findViewById(C0966R.C0970id.i_l);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$c */
    public static final class C5210c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5210c(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20695d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f20695d.findViewById(C0966R.C0970id.nor);
            C85875k4.m106191k0(textView.getPaint());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$d */
    public static final class C5211d extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20696d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5211d(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20696d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (LinearLayout) this.f20696d.findViewById(C0966R.C0970id.nos);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$e */
    public static final class C5212e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5212e(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20697d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (TextView) this.f20697d.findViewById(C0966R.C0970id.not);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$f */
    public static final class C5213f implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20698d;

        public C5213f(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20698d = colorfulSelfQRCodeUI;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105918d("MicroMsg.Setting.ColorfulSelfQRCodeUI", "onNotifyChange, fmsg change");
            if (!this.f20698d.f20691z.stopped()) {
                this.f20698d.f20691z.stopTimer();
            }
            this.f20698d.f20691z.startTimer(1000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$g */
    public static final class C5214g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5214g(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20699d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (TextView) this.f20699d.findViewById(C0966R.C0970id.now);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$h */
    public static final class C5215h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20700d;

        public C5215h(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20700d = colorfulSelfQRCodeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            int i3 = ((C5380o) C39818r.f106831a.mo62444c(this.f20700d).mo75002a(C5380o.class)).mo6356i3();
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 21;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) i3;
            newPersionalQRCodeReportStruct.mo86054n();
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20700d;
            colorfulSelfQRCodeUI.f20688w.mo8548b();
            C77407n nVar = colorfulSelfQRCodeUI.f20688w.f25508d;
            if (nVar == null) {
                return true;
            }
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$i */
    public static final class C5216i implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20701d;

        public C5216i(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20701d = colorfulSelfQRCodeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20701d.hideVKB();
            this.f20701d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$j */
    public static final class C5217j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20702d;

        public C5217j(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20702d = colorfulSelfQRCodeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i3 = ((C5380o) C39818r.f106831a.mo62444c(this.f20702d).mo75002a(C5380o.class)).mo6356i3();
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 11;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) i3;
            newPersionalQRCodeReportStruct.mo86054n();
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20702d;
            int i = ColorfulSelfQRCodeUI.f20670B;
            if (!C61104a.m71651g(colorfulSelfQRCodeUI.getContext()) && !C61104a.m71667w(colorfulSelfQRCodeUI.getContext()) && !C61104a.m71647c(colorfulSelfQRCodeUI.getContext(), true)) {
                Intent intent = new Intent();
                intent.putExtra("key_is_hide_right_btn", true);
                intent.putExtra("key_scan_report_enter_scene", 4);
                intent.putExtra("key_is_hide_right_btn", true);
                intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                C88144b.m109791i(colorfulSelfQRCodeUI.getContext(), "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$k */
    public static final class C5218k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20703d;

        public C5218k(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20703d = colorfulSelfQRCodeUI;
        }

        public final void onClick(View view) {
            Class cls = C5380o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            int i3 = ((C5380o) rVar.mo62444c(this.f20703d).mo75002a(cls)).mo6356i3();
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 12;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) i3;
            newPersionalQRCodeReportStruct.mo86054n();
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20703d;
            int i = ColorfulSelfQRCodeUI.f20670B;
            colorfulSelfQRCodeUI.getClass();
            C39622i0 a = rVar.mo62444c(colorfulSelfQRCodeUI).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this).get…elfQRCodeUIC::class.java)");
            boolean z = C5380o.f21032z;
            ((C5380o) a).mo6351c3(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$l */
    public static final class C5219l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20704d;

        public C5219l(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20704d = colorfulSelfQRCodeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$init$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i3 = ((C5380o) C39818r.f106831a.mo62444c(this.f20704d).mo75002a(C5380o.class)).mo6356i3();
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 13;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) i3;
            newPersionalQRCodeReportStruct.mo86054n();
            ColorfulSelfQRCodeUI.m5223H7(this.f20704d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$init$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$m */
    public static final class C5220m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5220m(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20705d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (TextView) this.f20705d.findViewById(C0966R.C0970id.nox);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$n */
    public static final class C5221n implements C7373a.C7374a {

        /* renamed from: a */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20706a;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$n$a */
        public static final class C5222a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32226l<String, C13598b0> f20707d;

            /* renamed from: e */
            public final /* synthetic */ String f20708e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5222a(C32226l<? super String, C13598b0> lVar, String str) {
                super(0);
                this.f20707d = lVar;
                this.f20708e = str;
            }

            public Object invoke() {
                this.f20707d.invoke(this.f20708e);
                return C13598b0.f38549a;
            }
        }

        public C5221n(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20706a = colorfulSelfQRCodeUI;
        }

        /* renamed from: a */
        public void mo6178a() {
            ColorfulSelfQRCodeUI.m5223H7(this.f20706a);
        }

        /* renamed from: b */
        public void mo6179b() {
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20706a;
            int i = ColorfulSelfQRCodeUI.f20670B;
            C76879j.m92717K(colorfulSelfQRCodeUI, true, colorfulSelfQRCodeUI.getString(C0966R.string.i4n), colorfulSelfQRCodeUI.getString(C0966R.string.i4o), colorfulSelfQRCodeUI.getString(C0966R.string.i4p), colorfulSelfQRCodeUI.getString(C0966R.string.f7926wf), new C5364k(colorfulSelfQRCodeUI), (DialogInterface.OnClickListener) null).f225693g.setTextColor(colorfulSelfQRCodeUI.getResources().getColor(C0966R.color.f2966ao));
        }

        /* renamed from: c */
        public Bitmap mo6180c() {
            return this.f20706a.mo6183I7();
        }

        /* renamed from: d */
        public void mo6181d(C32226l<? super String, C13598b0> lVar) {
            C87412m.m108594g(lVar, "callback");
            C5380o oVar = (C5380o) C39818r.f106831a.mo62444c(this.f20706a).mo75002a(C5380o.class);
            C87412m.m108593f(oVar, LocaleUtil.ITALIAN);
            boolean z = C5380o.f21032z;
            String str = C112760b.m154236i0("qrcode_tmp").mo119971i() + "mmqrcode-" + String.valueOf(oVar.f21050x) + '-' + String.valueOf(oVar.mo6354f3()) + ".png";
            if (C86013q1.m106450k(str)) {
                lVar.invoke(str);
                return;
            }
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20706a;
            Bitmap c = mo6180c();
            C5222a aVar = new C5222a(lVar, str);
            colorfulSelfQRCodeUI.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C5375n(c, str, colorfulSelfQRCodeUI, aVar));
        }

        /* renamed from: e */
        public int mo6182e() {
            return ((C5380o) C39818r.f106831a.mo62444c(this.f20706a).mo75002a(C5380o.class)).mo6356i3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$o */
    public static final class C5223o extends C87413o implements C32226l<C5380o.C5381a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5223o(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(1);
            this.f20709d = colorfulSelfQRCodeUI;
        }

        public Object invoke(Object obj) {
            C5380o.C5381a aVar = (C5380o.C5381a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20709d;
            int i = ColorfulSelfQRCodeUI.f20670B;
            colorfulSelfQRCodeUI.getClass();
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                colorfulSelfQRCodeUI.setActionbarColor(0);
                ((TextView) ((C36570n) colorfulSelfQRCodeUI.f20680o).getValue()).setTextColor(colorfulSelfQRCodeUI.getContext().getResources().getColorStateList(C0966R.color.alc));
                colorfulSelfQRCodeUI.mo6184J7().setTextColor(colorfulSelfQRCodeUI.getContext().getResources().getColorStateList(C0966R.color.alc));
                colorfulSelfQRCodeUI.mo6185K7().setTextColor(colorfulSelfQRCodeUI.getContext().getResources().getColorStateList(C0966R.color.alc));
                colorfulSelfQRCodeUI.findViewById(C0966R.C0970id.nou).setBackgroundColor(Color.parseColor("#1AFFFFFF"));
                colorfulSelfQRCodeUI.findViewById(C0966R.C0970id.nov).setBackgroundColor(Color.parseColor("#1AFFFFFF"));
            } else if (ordinal == 1) {
                colorfulSelfQRCodeUI.setActionbarColor(-1);
                ((TextView) ((C36570n) colorfulSelfQRCodeUI.f20680o).getValue()).setTextColor(colorfulSelfQRCodeUI.getContext().getResources().getColorStateList(C0966R.color.a1g));
                colorfulSelfQRCodeUI.mo6184J7().setTextColor(colorfulSelfQRCodeUI.getContext().getResources().getColorStateList(C0966R.color.a1g));
                colorfulSelfQRCodeUI.mo6185K7().setTextColor(colorfulSelfQRCodeUI.getContext().getResources().getColorStateList(C0966R.color.a1g));
                colorfulSelfQRCodeUI.findViewById(C0966R.C0970id.nou).setBackgroundColor(colorfulSelfQRCodeUI.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
                colorfulSelfQRCodeUI.findViewById(C0966R.C0970id.nov).setBackgroundColor(colorfulSelfQRCodeUI.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$p */
    public static final class C5224p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5224p(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20710d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            this.f20710d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$q */
    public static final class C5225q extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5225q(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20711d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            return (ImageView) this.f20711d.findViewById(C0966R.C0970id.noy);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$r */
    public static final class C5226r implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20712d;

        public C5226r(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20712d = colorfulSelfQRCodeUI;
        }

        public final boolean onTimerExpired() {
            Log.m105918d("MicroMsg.Setting.ColorfulSelfQRCodeUI", "refresh timer expired, update");
            ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f20712d;
            int i = ColorfulSelfQRCodeUI.f20670B;
            colorfulSelfQRCodeUI.mo6186L7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$s */
    public static final class C5227s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5227s(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20713d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f20713d.findViewById(C0966R.C0970id.f358990np0);
            C85875k4.m106191k0(textView.getPaint());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$t */
    public static final class C5228t extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5228t(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20714d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f20714d.findViewById(C0966R.C0970id.f358991np1);
            C85875k4.m106191k0(textView.getPaint());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$u */
    public static final class C5229u extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20715d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5229u(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20715d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            View findViewById = this.f20715d.findViewById(C0966R.C0970id.mlm);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$v */
    public static final class C5230v extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5230v(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20716d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            View findViewById = this.f20716d.findViewById(C0966R.C0970id.mln);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            return (ImageView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$w */
    public static final class C5231w extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5231w(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20717d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            View findViewById = this.f20717d.findViewById(C0966R.C0970id.mlo);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            return (ImageView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$x */
    public static final class C5232x extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5232x(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20718d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            View findViewById = this.f20718d.findViewById(C0966R.C0970id.mlp);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            return (ImageView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$y */
    public static final class C5233y extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5233y(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            super(0);
            this.f20719d = colorfulSelfQRCodeUI;
        }

        public Object invoke() {
            View findViewById = this.f20719d.findViewById(C0966R.C0970id.mmi);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI$z */
    public static final class C5234z implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f20720d;

        public C5234z(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f20720d = colorfulSelfQRCodeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$updateNewFriendData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86709a0.m107535s().mo121142i().mo119676J(143618, 0);
            C88144b.m109791i(this.f20720d.getContext(), "subapp", ".ui.friend.FMessageConversationUI", new Intent(), (Bundle) null);
            this.f20720d.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C5363j(1));
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/ColorfulSelfQRCodeUI$updateNewFriendData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static final void m5223H7(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
        colorfulSelfQRCodeUI.getClass();
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(colorfulSelfQRCodeUI, new C5368l(colorfulSelfQRCodeUI), new C5373m(colorfulSelfQRCodeUI));
    }

    /* renamed from: I7 */
    public final Bitmap mo6183I7() {
        View findViewById = findViewById(C0966R.C0970id.i_o);
        Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(findViewById(C0966R.C0970id.i_l));
        findViewById.setBackground(new BitmapDrawable(getResources(), bitmapFromView));
        Bitmap bitmapFromView2 = BitmapUtil.getBitmapFromView(findViewById);
        findViewById.setBackgroundColor(0);
        bitmapFromView.recycle();
        C87412m.m108593f(bitmapFromView2, "bitmap");
        return bitmapFromView2;
    }

    /* renamed from: J7 */
    public final TextView mo6184J7() {
        return (TextView) ((C36570n) this.f20681p).getValue();
    }

    /* renamed from: K7 */
    public final TextView mo6185K7() {
        return (TextView) ((C36570n) this.f20682q).getValue();
    }

    /* renamed from: L7 */
    public final void mo6186L7() {
        C8232g M5 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96096M5();
        C72982l3 l3Var = M5 instanceof C72982l3 ? (C72982l3) M5 : null;
        if (l3Var != null) {
            try {
                int bD = l3Var.mo101170bD();
                Log.m105925i("MicroMsg.Setting.ColorfulSelfQRCodeUI", "initView, newCount = %s", Integer.valueOf(bD));
                if (bD > 0) {
                    ((LinearLayout) ((C36570n) this.f20683r).getValue()).setVisibility(0);
                    ((C119157j) C119157j.f356862d).mo183875f(new C5363j(2));
                    ((TextView) ((C36570n) this.f20684s).getValue()).setText(getString(C0966R.string.m9c, new Object[]{String.valueOf(bD)}));
                    ((LinearLayout) ((C36570n) this.f20683r).getValue()).setOnClickListener(new C5234z(this));
                    List<C72979k3> kD = l3Var.mo101173kD(3);
                    C87412m.m108593f(kD, "storage.getNewLimitAndNoShowOnSelfQRCode(3)");
                    this.f20690y = kD;
                    if (kD.size() >= 3) {
                        mo6187M7(this.f20690y.get(2), this.f20690y.get(1), this.f20690y.get(0));
                    } else if (this.f20690y.size() >= 2) {
                        mo6187M7(this.f20690y.get(1), this.f20690y.get(0), (C72979k3) null);
                    } else if (this.f20690y.size() >= 1) {
                        mo6187M7(this.f20690y.get(0), (C72979k3) null, (C72979k3) null);
                    } else {
                        mo6187M7((C72979k3) null, (C72979k3) null, (C72979k3) null);
                    }
                } else {
                    ((LinearLayout) ((C36570n) this.f20683r).getValue()).setVisibility(4);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.Setting.ColorfulSelfQRCodeUI", "updateNewFriendData, e = %s", e);
            }
        }
    }

    /* renamed from: M7 */
    public final void mo6187M7(C72979k3 k3Var, C72979k3 k3Var2, C72979k3 k3Var3) {
        Class cls = C76705f.class;
        if (k3Var != null) {
            ((ImageView) ((C36570n) this.f20685t).getValue()).setVisibility(0);
            ((C76705f) C86312j.m106911c(cls)).mo106849z((ImageView) ((C36570n) this.f20685t).getValue(), k3Var.field_talker);
            Set<String> set = this.f20689x;
            String str = k3Var.field_talker;
            C87412m.m108593f(str, "headImg1.field_talker");
            set.add(str);
        } else {
            ((ImageView) ((C36570n) this.f20685t).getValue()).setVisibility(8);
        }
        if (k3Var2 != null) {
            ((ImageView) ((C36570n) this.f20686u).getValue()).setVisibility(0);
            ((C76705f) C86312j.m106911c(cls)).mo106849z((ImageView) ((C36570n) this.f20686u).getValue(), k3Var2.field_talker);
            Set<String> set2 = this.f20689x;
            String str2 = k3Var2.field_talker;
            C87412m.m108593f(str2, "headImg2.field_talker");
            set2.add(str2);
        } else {
            ((ImageView) ((C36570n) this.f20686u).getValue()).setVisibility(8);
        }
        if (k3Var3 != null) {
            ((ImageView) ((C36570n) this.f20687v).getValue()).setVisibility(0);
            ((C76705f) C86312j.m106911c(cls)).mo106849z((ImageView) ((C36570n) this.f20687v).getValue(), k3Var3.field_talker);
            Set<String> set3 = this.f20689x;
            String str3 = k3Var3.field_talker;
            C87412m.m108593f(str3, "headImg3.field_talker");
            set3.add(str3);
            return;
        }
        ((ImageView) ((C36570n) this.f20687v).getValue()).setVisibility(8);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d16;
    }

    public final void init() {
        C85875k4.m106191k0(((TextView) ((C36570n) this.f20677i).getValue()).getPaint());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C5215h(this));
        setBackBtn(new C5216i(this));
        ((TextView) ((C36570n) this.f20680o).getValue()).setOnClickListener(new C5217j(this));
        mo6184J7().setOnClickListener(new C5218k(this));
        mo6185K7().setOnClickListener(new C5219l(this));
    }

    public void onCreate(Bundle bundle) {
        Class cls = C5380o.class;
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        setMMTitle("");
        hideActionbarLine();
        getWindow().setFlags(201327616, 201327616);
        setLightNavigationbarIcon();
        init();
        C8232g M5 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96096M5();
        C13598b0 b0Var = null;
        C72982l3 l3Var = M5 instanceof C72982l3 ? (C72982l3) M5 : null;
        if (l3Var != null) {
            l3Var.add(this.f20671A);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.Setting.ColorfulSelfQRCodeUI", "add fmsgChange error");
        }
        C39818r rVar = C39818r.f106831a;
        C5380o oVar = (C5380o) rVar.mo62444c(this).mo75002a(cls);
        ImageView imageView = (ImageView) ((C36570n) this.f20673e).getValue();
        C87412m.m108593f(imageView, "avatarImgView");
        oVar.getClass();
        oVar.f21034e = imageView;
        ImageView imageView2 = (ImageView) ((C36570n) this.f20676h).getValue();
        C87412m.m108593f(imageView2, "qrImgView");
        oVar.f21035f = imageView2;
        TextView textView = (TextView) ((C36570n) this.f20679n).getValue();
        C87412m.m108593f(textView, "hintTv");
        oVar.f21037h = textView;
        TextView textView2 = (TextView) ((C36570n) this.f20674f).getValue();
        C87412m.m108593f(textView2, "usernameTv");
        oVar.f21038i = textView2;
        TextView textView3 = (TextView) ((C36570n) this.f20675g).getValue();
        C87412m.m108593f(textView3, "localTv");
        oVar.f21039j = textView3;
        ImageView imageView3 = (ImageView) ((C36570n) this.f20672d).getValue();
        C87412m.m108593f(imageView3, "bgImgView");
        oVar.f21036g = imageView3;
        oVar.f21045s = new C5223o(this);
        oVar.f21047u = new C5224p(this);
        oVar.mo6359l3(false);
        mo6186L7();
        int i3 = ((C5380o) rVar.mo62444c(this).mo75002a(cls)).mo6356i3();
        NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
        newPersionalQRCodeReportStruct.f10019d = (long) 1;
        newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
        newPersionalQRCodeReportStruct.f10021f = (long) i3;
        newPersionalQRCodeReportStruct.mo86054n();
    }

    public void onDestroy() {
        super.onDestroy();
        Class cls = C75700k0.class;
        C13598b0 b0Var = null;
        if (!this.f20690y.isEmpty()) {
            C8232g M5 = ((C75700k0) C86709a0.m107533q(cls)).mo96096M5();
            C72982l3 l3Var = M5 instanceof C72982l3 ? (C72982l3) M5 : null;
            if (l3Var != null) {
                for (String next : this.f20689x) {
                    if (!Util.isNullOrNil(next)) {
                        Log.m105925i("MicroMsg.Setting.ColorfulSelfQRCodeUI", "onDestroy, unsetNew item.field_talker = %s,", next);
                        l3Var.mo101167SE(next);
                    }
                }
            }
            int i3 = ((C5380o) C39818r.f106831a.mo62444c(this).mo75002a(C5380o.class)).mo6356i3();
            NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
            newPersionalQRCodeReportStruct.f10019d = (long) 33;
            newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
            newPersionalQRCodeReportStruct.f10021f = (long) i3;
            newPersionalQRCodeReportStruct.mo86054n();
        }
        if (C86709a0.m107522a()) {
            C8232g M52 = ((C75700k0) C86709a0.m107533q(cls)).mo96096M5();
            C72982l3 l3Var2 = M52 instanceof C72982l3 ? (C72982l3) M52 : null;
            if (l3Var2 != null) {
                l3Var2.remove(this.f20671A);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.Setting.ColorfulSelfQRCodeUI", "remove fmsgChange error");
            }
        }
        int i35 = ((C5380o) C39818r.f106831a.mo62444c(this).mo75002a(C5380o.class)).mo6356i3();
        NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct2 = new NewPersionalQRCodeReportStruct();
        newPersionalQRCodeReportStruct2.f10019d = (long) 33;
        newPersionalQRCodeReportStruct2.f10020e = C31543z5.m39453c();
        newPersionalQRCodeReportStruct2.f10021f = (long) i35;
        newPersionalQRCodeReportStruct2.mo86054n();
    }

    public void onResume() {
        super.onResume();
        long k = C75592q0.m90781k();
        StringBuilder sb = new StringBuilder();
        long j = 2 & k;
        sb.append(j);
        sb.append(",extstatus:");
        sb.append(k);
        Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUI", sb.toString());
        if (j != 0) {
            ((LinearLayout) ((C36570n) this.f20678j).getValue()).setVisibility(0);
            ((ImageView) ((C36570n) this.f20676h).getValue()).setVisibility(8);
            mo6185K7().setEnabled(false);
            mo6184J7().setEnabled(false);
            removeAllOptionMenu();
        } else {
            ((ImageView) ((C36570n) this.f20676h).getValue()).setVisibility(0);
            ((LinearLayout) ((C36570n) this.f20678j).getValue()).setVisibility(8);
            mo6185K7().setEnabled(true);
            mo6184J7().setEnabled(true);
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C5360i(this));
        }
        View findViewById = findViewById(C0966R.C0970id.i_o);
        findViewById.post(new C5358h(findViewById, this));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = yVar instanceof C10661v;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C5380o.class);
    }
}
