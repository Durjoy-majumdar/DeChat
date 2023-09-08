package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bh0.C113174b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RcptRecentAddrEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d62.C75339i;
import di3.C86312j;
import eb0.C75590o4;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import in3.C87771d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import lc3.C10485b;
import nl3.C47276a;
import p196ln.C76705f;
import p629ny.C76979h;
import p823sg.C77710q;
import qe3.C89625d;
import rg0.C13000e;
import rg0.C13003h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lin3/d$b;", "mStatusBarHeightCallback", "Lin3/d$b;", "<init>", "()V", "a", "b", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI */
public final class SettingsPersonalInfoPreviewUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f20890g = 0;

    /* renamed from: d */
    public final C13601g f20891d = C36568h.m40985a(C5296c.f20901d);

    /* renamed from: e */
    public List<? extends C113174b> f20892e;

    /* renamed from: f */
    public View f20893f;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$a */
    public final class C5291a extends C47276a {

        /* renamed from: s */
        public final String f20894s;

        /* renamed from: t */
        public final String f20895t;

        /* renamed from: u */
        public final ArrayList<C5295b> f20896u;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$a$a */
        public final class C5292a extends C60896i<C5295b> {
            public C5292a(C5291a aVar) {
            }

            /* renamed from: c */
            public int mo43c() {
                return C0966R.C0971layout.f359827az3;
            }

            /* renamed from: e */
            public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
                C5295b bVar = (C5295b) cVar;
                C87412m.m108594g(oVar, "holder");
                C87412m.m108594g(bVar, "data");
                ((TextView) oVar.mo85812D(C0966R.C0970id.kpm)).setText(bVar.f20898d);
                ((TextView) oVar.mo85812D(C0966R.C0970id.c2h)).setText(bVar.f20899e);
                ((TextView) oVar.mo85812D(C0966R.C0970id.kky)).setText(bVar.f20900f);
            }

            /* renamed from: f */
            public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
                C87412m.m108594g(recyclerView, "recyclerView");
                C87412m.m108594g(oVar, "holder");
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$a$b */
        public static final class C5293b extends WxRecyclerAdapter<C5295b> {
            public C5293b(C9500j jVar, ArrayList<C5295b> arrayList) {
                super(jVar, arrayList, true);
            }

            /* renamed from: v6 */
            public boolean mo6267v6() {
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$a$c */
        public static final class C5294c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C5291a f20897d;

            public C5294c(C5291a aVar) {
                this.f20897d = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f20897d.dismiss();
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5291a(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, Context context, String str, String str2, ArrayList<C5295b> arrayList) {
            super(context);
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "empty");
            C87412m.m108594g(arrayList, "data");
            this.f20894s = str;
            this.f20895t = str2;
            this.f20896u = arrayList;
        }

        /* renamed from: G */
        public View mo6265G() {
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f359826az2, (ViewGroup) null);
            C87412m.m108593f(inflate, "getInflater(context).inf…een_address_dialog, null)");
            return inflate;
        }

        /* renamed from: H */
        public void mo6266H() {
            super.mo6266H();
            TextView textView = (TextView) findViewById(C0966R.C0970id.kpm);
            if (textView != null) {
                textView.setText(this.f20894s);
            }
            ArrayList<C5295b> arrayList = this.f20896u;
            if (arrayList == null || arrayList.isEmpty()) {
                View findViewById = findViewById(C0966R.C0970id.iiq);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView2 = (TextView) findViewById(C0966R.C0970id.cjf);
                if (textView2 != null) {
                    textView2.setText(this.f20895t);
                    textView2.setVisibility(0);
                }
            } else {
                WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.iiq);
                if (wxRecyclerView != null) {
                    wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext(), 1, false));
                    wxRecyclerView.setAdapter(new C5293b(new C5303xdfb7c7ed(this), this.f20896u));
                }
            }
            View findViewById2 = findViewById(C0966R.C0970id.bec);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new C5294c(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$b */
    public final class C5295b implements C9493c {

        /* renamed from: d */
        public final String f20898d;

        /* renamed from: e */
        public final String f20899e;

        /* renamed from: f */
        public final String f20900f;

        public C5295b(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, String str, String str2, String str3) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "desc");
            C87412m.m108594g(str3, "time");
            this.f20898d = str;
            this.f20899e = str2;
            this.f20900f = str3;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$c */
    public static final class C5296c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C5296c f20901d = new C5296c();

        public C5296c() {
            super(0);
        }

        public Object invoke() {
            return ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_settings_personal_info_export_url, "https://support.weixin.qq.com/security/readtemplate?t=exportdata/index_new&security=2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$d */
    public static final class C5297d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsPersonalInfoPreviewUI f20902d;

        public C5297d(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
            this.f20902d = settingsPersonalInfoPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f20902d;
            List<? extends C113174b> list = settingsPersonalInfoPreviewUI.f20892e;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
                for (C113174b bVar : list) {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(bVar.f338616f)) {
                        sb.append(bVar.f338616f);
                    }
                    if (!TextUtils.isEmpty(bVar.f338617g)) {
                        sb.append(" ");
                        sb.append(bVar.f338617g);
                    }
                    if (!TextUtils.isEmpty(bVar.f338618h)) {
                        sb.append(" ");
                        sb.append(bVar.f338618h);
                    }
                    if (!TextUtils.isEmpty(bVar.f338624q)) {
                        sb.append(" ");
                        sb.append(bVar.f338624q);
                    }
                    if (!TextUtils.isEmpty(bVar.f338620j)) {
                        sb.append(" ");
                        sb.append(bVar.f338620j);
                    }
                    String sb4 = sb.toString();
                    C87412m.m108593f(sb4, "builder.toString()");
                    arrayList2.add(new C5295b(settingsPersonalInfoPreviewUI, bVar.f338621n + 65292 + bVar.f338622o, sb4, ""));
                }
                SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI2 = this.f20902d;
                AppCompatActivity context = settingsPersonalInfoPreviewUI2.getContext();
                C87412m.m108593f(context, "context");
                String string = settingsPersonalInfoPreviewUI2.getString(C0966R.string.iq4);
                C87412m.m108593f(string, "getString(R.string.settings_address)");
                String string2 = settingsPersonalInfoPreviewUI2.getString(C0966R.string.iwe);
                C87412m.m108593f(string2, "getString(R.string.setti…personal_info_no_address)");
                new C5291a(settingsPersonalInfoPreviewUI2, context, string, string2, new ArrayList(arrayList2)).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$e */
    public static final class C5298e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsPersonalInfoPreviewUI f20903d;

        public C5298e(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
            this.f20903d = settingsPersonalInfoPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            List<C13000e> jo = C13003h.vx0().mo12524jo();
            SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f20903d;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(jo, 10));
            for (C13000e eVar : jo) {
                String str = eVar.field_name;
                C87412m.m108593f(str, "deviceInfo.field_name");
                String str2 = eVar.field_devicetype;
                C87412m.m108593f(str2, "deviceInfo.field_devicetype");
                arrayList2.add(new C5295b(settingsPersonalInfoPreviewUI, str, str2, C72715f.m85112e(settingsPersonalInfoPreviewUI.getContext(), eVar.field_createtime * ((long) 1000), true).toString()));
            }
            SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI2 = this.f20903d;
            AppCompatActivity context = settingsPersonalInfoPreviewUI2.getContext();
            C87412m.m108593f(context, "context");
            String string = settingsPersonalInfoPreviewUI2.getString(C0966R.string.itm);
            C87412m.m108593f(string, "getString(com.tencent.mm…ings_manage_login_device)");
            String string2 = settingsPersonalInfoPreviewUI2.getString(C0966R.string.iwf);
            C87412m.m108593f(string2, "getString(R.string.setti…personal_info_no_devices)");
            new C5291a(settingsPersonalInfoPreviewUI2, context, string, string2, new ArrayList(arrayList2)).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$f */
    public static final class C5299f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsPersonalInfoPreviewUI f20904d;

        public C5299f(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
            this.f20904d = settingsPersonalInfoPreviewUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20904d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$g */
    public static final class C5300g implements View.OnScrollChangeListener {

        /* renamed from: a */
        public final /* synthetic */ SettingsPersonalInfoPreviewUI f20905a;

        /* renamed from: b */
        public final /* synthetic */ C8477a0 f20906b;

        public C5300g(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, C8477a0 a0Var) {
            this.f20905a = settingsPersonalInfoPreviewUI;
            this.f20906b = a0Var;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view.getScrollY() > C76577a.m92151b(this.f20905a.getContext(), 80)) {
                if (this.f20906b.f27482d) {
                    this.f20905a.setMMTitle((int) C0966R.string.iwc);
                    SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f20905a;
                    settingsPersonalInfoPreviewUI.setActionbarColor(settingsPersonalInfoPreviewUI.getResources().getColor(C0966R.color.al6));
                    this.f20905a.supportLightStatusBar();
                    this.f20906b.f27482d = false;
                }
            } else if (!this.f20906b.f27482d) {
                this.f20905a.setMMTitle("");
                SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI2 = this.f20905a;
                settingsPersonalInfoPreviewUI2.setActionbarColor(settingsPersonalInfoPreviewUI2.getResources().getColor(C0966R.color.ahf));
                SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI3 = this.f20905a;
                settingsPersonalInfoPreviewUI3.setActionbarElementColor(settingsPersonalInfoPreviewUI3.getContext().getResources().getColor(C0966R.color.FG_0));
                this.f20905a.supportLightStatusBar();
                this.f20906b.f27482d = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$h */
    public static final class C5301h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsPersonalInfoPreviewUI f20907d;

        /* renamed from: e */
        public final /* synthetic */ TextView f20908e;

        public C5301h(SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, TextView textView) {
            this.f20907d = settingsPersonalInfoPreviewUI;
            this.f20908e = textView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("showShare", false);
            SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f20907d;
            int i = SettingsPersonalInfoPreviewUI.f20890g;
            Object value = ((C36570n) settingsPersonalInfoPreviewUI.f20891d).getValue();
            C87412m.m108593f(value, "<get-exportUrl>(...)");
            intent.putExtra("rawUrl", (String) value);
            intent.putExtra("show_feedback", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", false);
            C88144b.m109791i(this.f20908e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
            userPrivacySettingClientReportStruct.f10079d = 151;
            userPrivacySettingClientReportStruct.mo86054n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$i */
    public static final class C5302i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RcptRecentAddrEvent f20909d;

        /* renamed from: e */
        public final /* synthetic */ SettingsPersonalInfoPreviewUI f20910e;

        public C5302i(RcptRecentAddrEvent rcptRecentAddrEvent, SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
            this.f20909d = rcptRecentAddrEvent;
            this.f20910e = settingsPersonalInfoPreviewUI;
        }

        public final void run() {
            RcptRecentAddrEvent.C1112b bVar = this.f20909d.f9408e;
            if (bVar.f9411a == 0) {
                SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f20910e;
                List<? extends C113174b> list = bVar.f9422l;
                settingsPersonalInfoPreviewUI.f20892e = list;
                if (list == null) {
                    settingsPersonalInfoPreviewUI.f20892e = new ArrayList();
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxq;
    }

    public void initView() {
        Class cls = C76979h.class;
        super.initView();
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) findViewById(C0966R.C0970id.a27), C75592q0.m90789s());
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
        if (str != null) {
            ((TextView) findViewById(C0966R.C0970id.hg4)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), str));
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.l2q);
        String c = C75592q0.m90773c();
        String s = C75592q0.m90789s();
        boolean z = true;
        if (!(c == null || c.length() == 0)) {
            textView.setText(c);
        } else if (C72996z1.m85802I4(s)) {
            textView.setText(getString(C0966R.string.iw5));
        } else {
            textView.setText(s);
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.f358365ep0);
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
        if (nullAs == 0) {
            textView2.setText(getString(C0966R.string.iyt));
        } else if (nullAs == 1) {
            textView2.setText(C0966R.string.f361346j32);
        } else if (nullAs == 2) {
            textView2.setText(C0966R.string.f361345j31);
        }
        C75590o4 a = C75590o4.m90740a();
        String nullAsNil = Util.nullAsNil(a.mo105937d());
        String nullAsNil2 = Util.nullAsNil(a.mo105936c());
        ((TextView) findViewById(C0966R.C0970id.c7n)).setText(((C75339i) C86312j.m106911c(C75339i.class)).K90(nullAsNil) + ' ' + nullAsNil2);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.jlk);
        String nullAsNil3 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(12291, (Object) null));
        C76979h hVar = (C76979h) C86312j.m106911c(cls);
        Context context = textView3.getContext();
        if (nullAsNil3.length() <= 0) {
            nullAsNil3 = getString(C0966R.string.iyt);
        }
        textView3.setText(hVar.mo107057T1(context, nullAsNil3));
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.hvo);
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (str2 == null || str2.length() <= 0) {
            textView4.setText(getString(C0966R.string.iqw));
        } else {
            textView4.setText(str2);
        }
        TextView textView5 = (TextView) findViewById(C0966R.C0970id.i_c);
        Object e = C86709a0.m107535s().mo121142i().mo119684e(9, 0);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) e).intValue();
        if (intValue != 0) {
            textView5.setText("" + new C77710q(intValue));
        } else if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BindQQSwitch"), 1) != 1) {
            View findViewById = textView5.findViewById(C0966R.C0970id.i_d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView5.setText(C0966R.string.iqw);
        }
        if (WeChatBrands.Business.Entries.MeSetSecurityQQ.banned()) {
            View findViewById2 = textView5.findViewById(C0966R.C0970id.i_d);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView6 = (TextView) findViewById(C0966R.C0970id.gkd);
        String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null);
        if (!(str3 == null || str3.length() == 0)) {
            z = false;
        }
        if (!z) {
            textView6.setText(str3);
        } else {
            textView6.setText(C0966R.string.iod);
        }
        TextView textView7 = (TextView) findViewById(C0966R.C0970id.f6142yg);
        textView7.setText(ChannelUtil.formatVersion(textView7.getContext(), C89625d.f257841g));
        findViewById(C0966R.C0970id.h9p).setOnClickListener(new C5297d(this));
        findViewById(C0966R.C0970id.f358632g63).setOnClickListener(new C5298e(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e0, code lost:
        if (z04.C112551y.m153819s((java.lang.String) r0, "http", false) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r4.supportRequestWindowFeature(r0)
            r0 = 1
            r4.customfixStatusbar(r0)
            super.onCreate(r5)
            r5 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r5 = r4.findViewById(r5)
            r4.f20893f = r5
            if (r5 == 0) goto L_0x003c
            boolean r5 = in3.C87771d.f254121g
            if (r5 != 0) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            in3.d r5 = in3.C87771d.m109203b(r4)
            com.tencent.mm.plugin.setting.ui.setting.v2 r1 = new com.tencent.mm.plugin.setting.ui.setting.v2
            r1.<init>(r4)
            r4.mStatusBarHeightCallback = r1
            r5.mo122180d(r1)
            android.view.Window r5 = r4.getWindow()
            android.view.View r5 = r5.getDecorView()
            r5.requestApplyInsets()
            android.view.Window r5 = r4.getWindow()
            in3.C87773e.m109211d(r5)
        L_0x003c:
            android.view.Window r5 = r4.getWindow()
            android.view.View r5 = r5.getDecorView()
            java.lang.String r1 = "window.decorView"
            gy3.C87412m.m108593f(r5, r1)
            r1 = 1280(0x500, float:1.794E-42)
            r5.setSystemUiVisibility(r1)
            java.lang.String r5 = ""
            r4.setMMTitle((java.lang.String) r5)
            r4.hideActionbarLine()
            android.content.res.Resources r5 = r4.getResources()
            r1 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r5 = r5.getColor(r1)
            r4.setActionbarColor(r5)
            androidx.appcompat.app.AppCompatActivity r5 = r4.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r1 = 2131099800(0x7f060098, float:1.7811963E38)
            int r5 = r5.getColor(r1)
            r4.setActionbarElementColor(r5)
            com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$f r5 = new com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$f
            r5.<init>(r4)
            r4.setBackBtn(r5)
            r4.supportLightStatusBar()
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            r5.f27482d = r0
            r1 = 2131300365(0x7f09100d, float:1.8218758E38)
            android.view.View r1 = r4.findViewById(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.ScrollView"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$g r2 = new com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$g
            r2.<init>(r4, r5)
            r1.setOnScrollChangeListener(r2)
            r5 = 2131310911(0x7f09393f, float:1.8240147E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00e7
            com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$h r1 = new com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$h
            r1.<init>(r4, r5)
            r5.setOnClickListener(r1)
            rx3.g r1 = r4.f20891d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "<get-exportUrl>(...)"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r3 = 0
            if (r1 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            if (r0 != 0) goto L_0x00e2
            rx3.g r0 = r4.f20891d
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "http"
            boolean r0 = z04.C112551y.m153819s(r0, r1, r3)
            if (r0 != 0) goto L_0x00e7
        L_0x00e2:
            r0 = 8
            r5.setVisibility(r0)
        L_0x00e7:
            r4.initView()
            com.tencent.mm.autogen.events.RcptRecentAddrEvent r5 = new com.tencent.mm.autogen.events.RcptRecentAddrEvent
            r5.<init>()
            com.tencent.mm.autogen.events.RcptRecentAddrEvent$b r0 = r5.f9408e
            r1 = -1
            r0.f9411a = r1
            com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$i r0 = new com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$i
            r0.<init>(r5, r4)
            r5.callback = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.asyncPublish((android.os.Looper) r0)
            rg0.c r5 = new rg0.c
            r5.<init>()
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsPersonalInfoPreviewUI.onCreate(android.os.Bundle):void");
    }
}
