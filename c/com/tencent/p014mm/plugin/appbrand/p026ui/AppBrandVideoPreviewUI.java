package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RetransmitMsgEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C88989a;
import s90.C77632o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ls90/o;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI */
public final class AppBrandVideoPreviewUI extends MMActivity implements C77632o {

    /* renamed from: d */
    public final String f49812d = "MicroMsg.AppBrandVideoPreviewUI";

    /* renamed from: e */
    public String f49813e;

    /* renamed from: f */
    public AppBrandVideoView f49814f;

    /* renamed from: g */
    public String f49815g = "";

    /* renamed from: h */
    public Integer f49816h = 0;

    /* renamed from: i */
    public Bundle f49817i;

    /* renamed from: j */
    public Integer f49818j = 0;

    /* renamed from: n */
    public String f49819n = "";

    /* renamed from: o */
    public String f49820o = "";

    /* renamed from: p */
    public String f49821p = "";

    /* renamed from: q */
    public Long f49822q = -1L;

    /* renamed from: r */
    public String f49823r = "";

    /* renamed from: s */
    public String f49824s = "";

    /* renamed from: t */
    public AppBrandVideoViewControlBar f49825t;

    /* renamed from: u */
    public int f49826u;

    /* renamed from: v */
    public int f49827v;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$a */
    public static final class C18026a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandVideoPreviewUI f49828d;

        public C18026a(AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
            this.f49828d = appBrandVideoPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f49828d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$b */
    public static final class C18027b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandVideoPreviewUI f49829d;

        public C18027b(AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
            this.f49829d = appBrandVideoPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f49829d.f49812d, "hy: on click menu");
            RetransmitMsgEvent retransmitMsgEvent = new RetransmitMsgEvent();
            RetransmitMsgEvent.C80736a aVar = retransmitMsgEvent.f236267d;
            AppBrandVideoPreviewUI appBrandVideoPreviewUI = this.f49829d;
            aVar.f236268a = appBrandVideoPreviewUI;
            aVar.f236270c = C72996z1.m85820U5(appBrandVideoPreviewUI.f49823r);
            ArrayList arrayList2 = new ArrayList();
            C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
            Long l = this.f49829d.f49822q;
            C87412m.m108591d(l);
            arrayList2.add(((C72972g4) LE).b00(l.longValue()));
            RetransmitMsgEvent.C80736a aVar2 = retransmitMsgEvent.f236267d;
            aVar2.f236269b = arrayList2;
            AppBrandVideoPreviewUI appBrandVideoPreviewUI2 = this.f49829d;
            aVar2.f236271d = appBrandVideoPreviewUI2.f49823r;
            aVar2.f236272e = appBrandVideoPreviewUI2;
            retransmitMsgEvent.publish();
            this.f49829d.mo22496H7(3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$c */
    public static final class C18028c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ AppBrandVideoPreviewUI f49830d;

        public C18028c(AppBrandVideoPreviewUI appBrandVideoPreviewUI) {
            this.f49830d = appBrandVideoPreviewUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f49830d.onBackPressed();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo22496H7(int i) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(C72996z1.m85820U5(this.f49823r) ? 2 : 1);
        objArr[1] = this.f49821p;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = 1;
        nVar.mo160131h(17608, objArr);
    }

    /* renamed from: N */
    public boolean mo22497N() {
        return false;
    }

    /* renamed from: e0 */
    public boolean mo22498e0() {
        return false;
    }

    /* renamed from: g0 */
    public void mo22499g0(Bundle bundle) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6490g9;
    }

    /* renamed from: m6 */
    public void mo22500m6(C77632o.C77633a aVar) {
        Log.m105925i(this.f49812d, "hy: fail do job: %s", aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1
            r8.supportRequestWindowFeature(r0)
            super.onCreate(r9)
            r9 = 8
            r8.setSelfNavigationBarVisible(r9)
            java.lang.Class<nu.e> r9 = p625nu.C100196e.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            nu.e r9 = (p625nu.C100196e) r9
            r9.il0(r0)
            android.view.Window r9 = r8.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setNavigationBarColor(r1)
            android.view.Window r9 = r8.getWindow()
            r2 = 0
            r9.setStatusBarColor(r2)
            android.view.Window r9 = r8.getWindow()
            android.view.View r9 = r9.getDecorView()
            r3 = 1280(0x500, float:1.794E-42)
            r9.setSystemUiVisibility(r3)
            android.view.Window r9 = r8.getWindow()
            android.view.View r9 = r9.getDecorView()
            com.tencent.mm.plugin.appbrand.ui.x3 r3 = new com.tencent.mm.plugin.appbrand.ui.x3
            r3.<init>(r8)
            r9.setOnSystemUiVisibilityChangeListener(r3)
            r9 = 2131165556(0x7f070174, float:1.7945332E38)
            int r9 = kg3.C76577a.m92155f(r8, r9)
            r8.f49826u = r9
            r9 = 2131165959(0x7f070307, float:1.794615E38)
            int r9 = kg3.C76577a.m92155f(r8, r9)
            int r3 = r8.f49826u
            int r9 = r9 + r3
            r8.f49827v = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r3 = "key_video_url"
            java.lang.String r9 = r9.getStringExtra(r3)
            r8.f49813e = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r3 = "key_cover_path"
            java.lang.String r9 = r9.getStringExtra(r3)
            r8.f49815g = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r3 = "key_local_file_path"
            r9.getStringExtra(r3)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r3 = "key_auto_save"
            r9.getBooleanExtra(r3, r2)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r3 = "key_scene"
            int r9 = r9.getIntExtra(r3, r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.f49816h = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r3 = "key_ext_data"
            android.os.Bundle r9 = r9.getBundleExtra(r3)
            r8.f49817i = r9
            java.lang.String r9 = r8.f49815g
            if (r9 == 0) goto L_0x00c4
            gy3.C87412m.m108591d(r9)
            java.lang.String r3 = "/"
            boolean r9 = z04.C112551y.m153819s(r9, r3, r2)
            if (r9 == 0) goto L_0x00c4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "file:/"
            r9.append(r3)
            java.lang.String r3 = r8.f49815g
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r8.f49815g = r9
        L_0x00c4:
            java.lang.String r9 = r8.f49813e
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r3 = 0
            if (r9 == 0) goto L_0x00d0
        L_0x00cd:
            r9 = 0
            goto L_0x018b
        L_0x00d0:
            java.lang.Integer r9 = r8.f49816h
            if (r9 != 0) goto L_0x00d6
            goto L_0x018a
        L_0x00d6:
            int r9 = r9.intValue()
            if (r9 != r0) goto L_0x018a
            android.os.Bundle r9 = r8.f49817i
            if (r9 == 0) goto L_0x00eb
            java.lang.String r4 = "key_chatting_type"
            int r9 = r9.getInt(r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00ec
        L_0x00eb:
            r9 = r3
        L_0x00ec:
            r8.f49818j = r9
            android.os.Bundle r9 = r8.f49817i
            if (r9 == 0) goto L_0x00f9
            java.lang.String r4 = "key_chatting_wording"
            java.lang.String r9 = r9.getString(r4)
            goto L_0x00fa
        L_0x00f9:
            r9 = r3
        L_0x00fa:
            r8.f49819n = r9
            android.os.Bundle r9 = r8.f49817i
            if (r9 == 0) goto L_0x0107
            java.lang.String r4 = "key_chatting_text"
            java.lang.String r9 = r9.getString(r4)
            goto L_0x0108
        L_0x0107:
            r9 = r3
        L_0x0108:
            r8.f49820o = r9
            android.os.Bundle r9 = r8.f49817i
            if (r9 == 0) goto L_0x0115
            java.lang.String r4 = "key_chatting_appid"
            java.lang.String r9 = r9.getString(r4)
            goto L_0x0116
        L_0x0115:
            r9 = r3
        L_0x0116:
            r8.f49821p = r9
            android.os.Bundle r9 = r8.f49817i
            r4 = -1
            if (r9 == 0) goto L_0x0129
            java.lang.String r6 = "key_msg_id"
            long r6 = r9.getLong(r6, r4)
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            goto L_0x012a
        L_0x0129:
            r9 = r3
        L_0x012a:
            r8.f49822q = r9
            android.os.Bundle r9 = r8.f49817i
            if (r9 == 0) goto L_0x0137
            java.lang.String r6 = "key_talker_username"
            java.lang.String r9 = r9.getString(r6)
            goto L_0x0138
        L_0x0137:
            r9 = r3
        L_0x0138:
            r8.f49823r = r9
            android.os.Bundle r9 = r8.f49817i
            if (r9 == 0) goto L_0x0145
            java.lang.String r6 = "key_sender_username"
            java.lang.String r9 = r9.getString(r6)
            goto L_0x0146
        L_0x0145:
            r9 = r3
        L_0x0146:
            r8.f49824s = r9
            java.lang.String r9 = r8.f49821p
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x00cd
            java.lang.String r9 = r8.f49823r
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x00cd
            java.lang.String r9 = r8.f49824s
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0162
            goto L_0x00cd
        L_0x0162:
            java.lang.Long r9 = r8.f49822q
            if (r9 == 0) goto L_0x00cd
            long r6 = r9.longValue()
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0170
            goto L_0x00cd
        L_0x0170:
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.l r9 = r9.mo96095LE()
            java.lang.Long r4 = r8.f49822q
            gy3.C87412m.m108591d(r4)
            long r4 = r4.longValue()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            r9.b00(r4)
        L_0x018a:
            r9 = 1
        L_0x018b:
            if (r9 != 0) goto L_0x0191
            r8.finish()
            return
        L_0x0191:
            r9 = 2
            r8.mo22496H7(r9)
            java.lang.Integer r9 = r8.f49816h
            if (r9 != 0) goto L_0x019a
            goto L_0x01c3
        L_0x019a:
            int r9 = r9.intValue()
            if (r9 != r0) goto L_0x01c3
            r9 = 2131311256(0x7f093a98, float:1.8240847E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$a r1 = new com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$a
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            r9 = 2131311274(0x7f093aaa, float:1.8240884E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$b r1 = new com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$b
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            goto L_0x01d6
        L_0x01c3:
            com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$c r9 = new com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI$c
            r9.<init>(r8)
            r8.setBackBtn(r9)
            java.lang.String r9 = ""
            r8.setMMTitle((java.lang.String) r9)
            r8.hideActionbarLine()
            r8.setActionbarColor(r1)
        L_0x01d6:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper r9 = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper
            r9.<init>(r8, r3)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView
            r1.<init>((android.content.Context) r8, r9)
            r8.f49814f = r1
            com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar r1 = new com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar
            r1.<init>(r8)
            r8.f49825t = r1
            r4 = 2131297184(0x7f0903a0, float:1.8212306E38)
            r1.setId(r4)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x01f8
            com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar r4 = r8.f49825t
            r1.mo22230k(r4)
        L_0x01f8:
            com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar r1 = r8.f49825t
            r9.setVideoFooterView(r1)
            java.lang.Integer r9 = r8.f49818j
            r1 = 48
            if (r9 != 0) goto L_0x0204
            goto L_0x0211
        L_0x0204:
            int r9 = r9.intValue()
            if (r9 != r1) goto L_0x0211
            com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar r9 = r8.f49825t
            if (r9 == 0) goto L_0x0211
            r9.setAutoHide(r2)
        L_0x0211:
            r9 = 2131300368(0x7f091010, float:1.8218764E38)
            android.view.View r1 = r8.findViewById(r9)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r4 = r8.f49814f
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r1.addView(r4, r2, r5)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x022c
            r1.setAutoPlay(r0)
        L_0x022c:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0233
            r1.setLoop(r0)
        L_0x0233:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x023a
            r1.setMute(r2)
        L_0x023a:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 != 0) goto L_0x023f
            goto L_0x0242
        L_0x023f:
            r1.setCookieData(r3)
        L_0x0242:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x024d
            java.lang.String r3 = r8.f49815g
            java.lang.String r4 = "cover"
            r1.mo22275t(r3, r4)
        L_0x024d:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0256
            java.lang.String r3 = "contain"
            r1.setObjectFit(r3)
        L_0x0256:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x025d
            r1.setShowDanmakuBtn(r2)
        L_0x025d:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0264
            r1.setShowMuteBtn(r2)
        L_0x0264:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x026b
            r1.setShowPlayBtn(r0)
        L_0x026b:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0272
            r1.setShowProgress(r0)
        L_0x0272:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0279
            r1.setShowFullScreenBtn(r2)
        L_0x0279:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0280
            r1.setIsShowBasicControls(r0)
        L_0x0280:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0287
            r1.setIsEnableBottomProgressBar(r2)
        L_0x0287:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x028e
            r1.setShowCenterPlayBtn(r2)
        L_0x028e:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x0295
            r1.setShowControlProgress(r0)
        L_0x0295:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x029c
            r1.setPageGesture(r0)
        L_0x029c:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x02a3
            r1.mo22220g(r0)
        L_0x02a3:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r8.f49814f
            if (r1 == 0) goto L_0x02ac
            java.lang.String r3 = r8.f49813e
            r1.mo22276v(r3, r2, r2)
        L_0x02ac:
            java.lang.Integer r1 = r8.f49816h
            if (r1 != 0) goto L_0x02b1
            goto L_0x0310
        L_0x02b1:
            int r1 = r1.intValue()
            if (r1 != r0) goto L_0x0310
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r8)
            r1 = 2131493173(0x7f0c0135, float:1.8609819E38)
            android.view.View r3 = r8.findViewById(r9)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r6, r2)
            r2 = 12
            r1.addRule(r2)
            int r2 = r8.f49827v
            r1.bottomMargin = r2
            android.view.View r9 = r8.findViewById(r9)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r9.addView(r0, r1)
            r9 = 2131296693(0x7f0901b5, float:1.821131E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r1 = r8.f49819n
            r9.setText(r1)
            r9 = 2131296692(0x7f0901b4, float:1.8211308E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            java.lang.String r1 = r8.f49820o
            r9.setText(r1)
            com.tencent.mm.plugin.appbrand.ui.v3 r1 = new com.tencent.mm.plugin.appbrand.ui.v3
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar r9 = r8.f49825t
            if (r9 == 0) goto L_0x0310
            com.tencent.mm.plugin.appbrand.ui.w3 r1 = new com.tencent.mm.plugin.appbrand.ui.w3
            r1.<init>(r8, r0)
            r9.mo22338D(r1)
        L_0x0310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandVideoPreviewUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        AppBrandVideoView appBrandVideoView = this.f49814f;
        if (appBrandVideoView != null) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onUIDestroy");
            appBrandVideoView.mo22219f();
        }
    }

    public void onPause() {
        super.onPause();
        AppBrandVideoView appBrandVideoView = this.f49814f;
        if (appBrandVideoView != null) {
            appBrandVideoView.f49521f.mo22296b();
        }
    }

    public void onResume() {
        super.onResume();
        AppBrandVideoView appBrandVideoView = this.f49814f;
        if (appBrandVideoView != null) {
            appBrandVideoView.mo22236p();
        }
    }

    public boolean onSwipeBackFinish() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* renamed from: r7 */
    public void mo22502r7(C77632o.C77633a aVar) {
        Log.m105925i(this.f49812d, "hy: requestExitSelectedMode do job: %s", aVar);
        if (aVar == C77632o.C77633a.trans) {
            mo22496H7(4);
        }
    }

    /* renamed from: s0 */
    public boolean mo22503s0() {
        return true;
    }

    /* renamed from: z1 */
    public void mo22504z1(C77632o.C77633a aVar) {
        Log.m105925i(this.f49812d, "hy: doInBackground do job: %s", aVar);
    }
}
