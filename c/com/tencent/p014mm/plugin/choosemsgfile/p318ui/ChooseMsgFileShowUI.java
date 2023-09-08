package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.content.Context;
import android.os.Bundle;
import android.webkit.ValueCallback;
import aw0.C79635e;
import aw0.C92162m;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MiniQbFloatBallMenuActionEvent;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import java.io.IOException;
import nj3.C88989a;
import qo3.C77407n;
import s00.C110692d;
import s00.C110693e;
import s00.C110694g;
import te3.C101828pe0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI */
public class ChooseMsgFileShowUI extends MMSecDataActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f312099t = 0;

    /* renamed from: d */
    public String f312100d = "";

    /* renamed from: e */
    public String f312101e = "";

    /* renamed from: f */
    public int f312102f;

    /* renamed from: g */
    public String f312103g = "";

    /* renamed from: h */
    public String f312104h = Integer.toString(hashCode());

    /* renamed from: i */
    public C85140i f312105i;

    /* renamed from: j */
    public C105124j f312106j;

    /* renamed from: n */
    public boolean f312107n = true;

    /* renamed from: o */
    public boolean f312108o = false;

    /* renamed from: p */
    public IListener<MiniQbFloatBallMenuActionEvent> f312109p = new IListener<MiniQbFloatBallMenuActionEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1644922434;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
            if (r1 != 8) goto L_0x00e1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent r1 = (com.tencent.p014mm.autogen.events.MiniQbFloatBallMenuActionEvent) r1
                java.lang.Class<s00.e> r2 = s00.C110693e.class
                java.lang.String r3 = "MicroMsg.ChooseMsgFileShowUI"
                r4 = 0
                if (r1 == 0) goto L_0x00dc
                com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent$a r5 = r1.f48105d
                if (r5 == 0) goto L_0x00dc
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r6 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                com.tencent.mm.plugin.choosemsgfile.ui.j r7 = r6.f312106j
                if (r7 == 0) goto L_0x00dc
                java.lang.String r5 = r5.f48108b
                java.lang.String r6 = r6.f312100d
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)
                r6 = 2
                r7 = 1
                if (r5 != 0) goto L_0x0038
                java.lang.Object[] r2 = new java.lang.Object[r6]
                com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent$a r1 = r1.f48105d
                java.lang.String r1 = r1.f48108b
                r2[r4] = r1
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r1 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                java.lang.String r1 = r1.f312100d
                r2[r7] = r1
                java.lang.String r1 = "MiniQbFloatBallMenuActionEvent event.data.filePath:%s filePath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r2)
                goto L_0x00e1
            L_0x0038:
                java.lang.Object[] r5 = new java.lang.Object[r7]
                com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent$a r8 = r1.f48105d
                int r8 = r8.f48107a
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r5[r4] = r8
                java.lang.String r8 = "MiniQbFloatBallMenuActionEvent event.data.action:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r5)
                com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent$a r1 = r1.f48105d
                int r1 = r1.f48107a
                if (r1 == r7) goto L_0x00d4
                if (r1 == r6) goto L_0x006f
                r2 = 4
                if (r1 == r2) goto L_0x005a
                r2 = 8
                if (r1 == r2) goto L_0x00d4
                goto L_0x00e1
            L_0x005a:
                java.lang.Class<gw.h> r1 = p159gw.C98250h.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                gw.h r1 = (p159gw.C98250h) r1
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r2 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                java.lang.String r3 = r2.f312100d
                com.tencent.mm.plugin.choosemsgfile.ui.b r5 = new com.tencent.mm.plugin.choosemsgfile.ui.b
                r5.<init>(r0)
                r1.pk0(r2, r3, r5)
                goto L_0x00e1
            L_0x006f:
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r1 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                com.tencent.mm.plugin.choosemsgfile.ui.j r1 = r1.f312106j
                r1.mo124068H(r4, r7)
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r1 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                boolean r3 = r1.f312108o
                if (r3 == 0) goto L_0x009d
                di3.d r1 = di3.C86312j.m106911c(r2)
                r5 = r1
                s00.e r5 = (s00.C110693e) r5
                r6 = 0
                r7 = 0
                r8 = 0
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r9 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                java.lang.String r10 = r9.f312100d
                java.lang.String r11 = r9.f312103g
                java.lang.String r12 = r9.f312101e
                java.lang.String r13 = r9.f312104h
                r14 = 7
                android.webkit.ValueCallback<java.lang.String> r15 = r9.f312112s
                android.webkit.ValueCallback<java.lang.Integer> r1 = r9.f312110q
                r17 = 1
                r16 = r1
                r5.t30(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00e1
            L_0x009d:
                r1.f312107n = r4
                java.lang.Class<s00.d> r1 = s00.C110692d.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                s00.d r1 = (s00.C110692d) r1
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r3 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                java.lang.String r5 = r3.f312104h
                java.lang.String r6 = r3.f312100d
                r1.mo35325SN(r3, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r2)
                r5 = r1
                s00.e r5 = (s00.C110693e) r5
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r10 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                java.lang.String r11 = r10.f312100d
                java.lang.String r12 = r10.f312103g
                java.lang.String r13 = r10.f312101e
                java.lang.String r14 = r10.f312104h
                r15 = 7
                android.webkit.ValueCallback<java.lang.String> r1 = r10.f312112s
                s00.g r17 = r10.mo149424H7(r4)
                r18 = 1
                r16 = r1
                r5.jl0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L_0x00e1
            L_0x00d4:
                com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI r1 = com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.this
                com.tencent.mm.plugin.choosemsgfile.ui.j r1 = r1.f312106j
                r1.mo124068H(r7, r7)
                goto L_0x00e1
            L_0x00dc:
                java.lang.String r1 = "MiniQbFloatBallMenuActionEvent fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            L_0x00e1:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.choosemsgfile.p318ui.ChooseMsgFileShowUI.C1051161.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* renamed from: q */
    public ValueCallback<Integer> f312110q = new C105117a(this);

    /* renamed from: r */
    public C110694g<Integer> f312111r = null;

    /* renamed from: s */
    public ValueCallback<String> f312112s = new C105119c();

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI$a */
    public class C105117a implements ValueCallback<Integer> {
        public C105117a(ChooseMsgFileShowUI chooseMsgFileShowUI) {
        }

        public void onReceiveValue(Object obj) {
            Log.m105925i("MicroMsg.ChooseMsgFileShowUI", "updateRetCallback onReceiveValue ret = %d", (Integer) obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI$b */
    public class C105118b extends C110694g<Integer> {
        public C105118b() {
        }

        public void onReceiveValue(Object obj) {
            Integer num = (Integer) obj;
            if (this.f331114a) {
                Log.m105925i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, ignore ret = %d", num);
                return;
            }
            Log.m105925i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, ret = %d", num);
            ChooseMsgFileShowUI chooseMsgFileShowUI = ChooseMsgFileShowUI.this;
            ((C110692d) C86312j.m106911c(C110692d.class)).S90(chooseMsgFileShowUI, chooseMsgFileShowUI.f312100d, chooseMsgFileShowUI.f312101e, num.intValue());
            if (num.intValue() != 0) {
                ChooseMsgFileShowUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI$c */
    public class C105119c implements ValueCallback<String> {
        public C105119c() {
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105925i("MicroMsg.ChooseMsgFileShowUI", "openReadFile, receiveValue = %s", str);
            if ("query for feature_wx_float_window successfully".equals(str)) {
                ChooseMsgFileShowUI.this.f312108o = true;
                boolean e = ChooseMsgFileShowUI.this.f312106j.mo160080e();
                boolean g = ChooseMsgFileShowUI.this.f312106j.mo160082g();
                ChooseMsgFileShowUI chooseMsgFileShowUI = ChooseMsgFileShowUI.this;
                ((C110693e) C86312j.m106911c(C110693e.class)).jl0(e, g, false, false, chooseMsgFileShowUI, chooseMsgFileShowUI.f312100d, chooseMsgFileShowUI.f312103g, chooseMsgFileShowUI.f312101e, chooseMsgFileShowUI.f312104h, 7, chooseMsgFileShowUI.f312112s, chooseMsgFileShowUI.mo149424H7(true), true);
            } else if ("xwebFileReaderReachEnd".equals(str)) {
                Log.m105918d("MicroMsg.ChooseMsgFileShowUI", "xweb file reader reach end");
            } else if ("xwebFileReaderUserOperated".equals(str)) {
                Log.m105918d("MicroMsg.ChooseMsgFileShowUI", "xweb file reader user operated");
            } else if ("fileReaderClosed".equals(str)) {
                ChooseMsgFileShowUI chooseMsgFileShowUI2 = ChooseMsgFileShowUI.this;
                boolean z = chooseMsgFileShowUI2.f312107n;
                if (z) {
                    chooseMsgFileShowUI2.finish();
                    return;
                }
                Log.m105925i("MicroMsg.ChooseMsgFileShowUI", "opCallback isFinishCurPage:%s", Boolean.valueOf(z));
                ChooseMsgFileShowUI.this.f312107n = true;
            } else if ("fileReaderMenuClicked".equals(str)) {
                C77407n nVar = new C77407n((Context) ChooseMsgFileShowUI.this, 1, false);
                nVar.f225771i = new C105121c(this);
                nVar.f225782p = new C105122d(this);
                nVar.mo107573q();
            }
        }
    }

    /* renamed from: H7 */
    public final C110694g<Integer> mo149424H7(boolean z) {
        C110694g<Integer> gVar;
        if (!z && (gVar = this.f312111r) != null) {
            return gVar;
        }
        C110694g<Integer> gVar2 = this.f312111r;
        if (gVar2 != null) {
            gVar2.f331114a = true;
        }
        C105118b bVar = new C105118b();
        this.f312111r = bVar;
        return bVar;
    }

    public void finish() {
        C85140i iVar = this.f312105i;
        if (iVar != null) {
            iVar.mo149068c0();
        }
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f312100d = getIntent().getStringExtra("key_filepath");
        this.f312101e = getIntent().getStringExtra("key_fileext");
        this.f312102f = getIntent().getIntExtra("sence", 0);
        try {
            int lastIndexOf = this.f312100d.lastIndexOf(47) + 1;
            if (lastIndexOf < 0 || lastIndexOf == this.f312100d.length()) {
                lastIndexOf = 0;
            }
            String str = this.f312100d;
            this.f312103g = str.substring(lastIndexOf, str.length());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ChooseMsgFileShowUI", "get file name error " + e.getMessage());
            this.f312103g = "";
        }
        C85140i iVar = new C85140i(new C18692k(getContext()));
        this.f312105i = iVar;
        String str2 = this.f312100d;
        String str3 = this.f312101e;
        int i = this.f312102f;
        Log.m105925i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onCreate, filePath:%s fileExt:%s ", str2, str3);
        iVar.f248089s = str2;
        iVar.f248090t = i;
        iVar.mo35648A(4, C79635e.m96715c(str2));
        iVar.getReportInfo().f311717f = 4;
        iVar.getReportInfo().f311716e = iVar.f248090t;
        iVar.mo68414O();
        Bundle bundle2 = iVar.f311726d.f311678C;
        if (bundle2 != null) {
            bundle2.putBoolean("ifAppAttachDownloadUI", false);
            iVar.f311726d.f311678C.putString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str2);
            iVar.f311726d.f311678C.putString("fileExt", str3);
            iVar.f311726d.f311678C.putInt("sence", Integer.valueOf(i).intValue());
            iVar.mo68414O();
        }
        C85140i iVar2 = this.f312105i;
        String str4 = this.f312101e;
        String str5 = this.f312103g;
        iVar2.getClass();
        Integer a = C92162m.m115833a(str4);
        if (a == null) {
            a = C92162m.m115833a("unknown");
        }
        iVar2.f311726d.f311698s = a.intValue();
        iVar2.f311726d.f311699t = str5;
        iVar2.mo68414O();
        C105124j jVar = new C105124j(new C40896l(getContext()));
        this.f312106j = jVar;
        String str6 = this.f312100d;
        String str7 = this.f312101e;
        int i2 = this.f312102f;
        Log.m105925i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageMultiTaskHelper", "onCreate, filePath:%s fileExt:%s ", str6, str7);
        jVar.mo35809D(4, C56887p.m65609c(str6));
        C101828pe0 pe02 = jVar.f312120u;
        pe02.f299161e = str6;
        pe02.f299167n = C86013q1.m106451l(str6);
        C101828pe0 pe03 = jVar.f312120u;
        pe03.f299162f = str7;
        pe03.f299165i = i2;
        pe03.f299160d = false;
        try {
            jVar.f326418a.field_data = pe03.toByteArray();
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.FilesFloatBall.ChooseMsgFilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e2);
        }
        jVar.mo160075M();
        C105124j jVar2 = this.f312106j;
        String str8 = this.f312101e;
        String str9 = this.f312103g;
        MultiTaskInfo multiTaskInfo = jVar2.f326418a;
        multiTaskInfo.mo80305m2().f183752e = str9;
        multiTaskInfo.mo80305m2().f183755h = str8;
        jVar2.mo160075M();
        IListener<MiniQbFloatBallMenuActionEvent> iListener = this.f312109p;
        if (iListener != null) {
            iListener.alive();
        }
        ((C110692d) C86312j.m106911c(C110692d.class)).mo35327q9((C110692d.C22288a) null);
        ((C110693e) C86312j.m106911c(C110693e.class)).mo161953Fl(this.f312106j.mo160080e(), this.f312106j.mo160082g(), false, this, this.f312100d, this.f312103g, this.f312101e, this.f312104h, 7, this.f312112s, mo149424H7(true), true);
    }

    public void onDestroy() {
        ((C110692d) C86312j.m106911c(C110692d.class)).mo35325SN(this, this.f312104h, this.f312100d);
        super.onDestroy();
        IListener<MiniQbFloatBallMenuActionEvent> iListener = this.f312109p;
        if (iListener != null) {
            iListener.dead();
        }
        C85140i iVar = this.f312105i;
        if (iVar != null) {
            iVar.mo67996A0();
        }
        C105124j jVar = this.f312106j;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void onPause() {
        super.onPause();
        C85140i iVar = this.f312105i;
        if (iVar != null) {
            iVar.mo64001C();
        }
        C105124j jVar = this.f312106j;
        if (jVar != null) {
            jVar.mo74189F();
        }
    }

    public void onResume() {
        super.onResume();
        C85140i iVar = this.f312105i;
        if (iVar != null) {
            iVar.mo64003o();
        }
        C105124j jVar = this.f312106j;
        if (jVar != null) {
            jVar.mo74188E();
        }
    }
}
