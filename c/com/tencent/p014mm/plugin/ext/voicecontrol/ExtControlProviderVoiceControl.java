package com.tencent.p014mm.plugin.ext.voicecontrol;

import ab1.C39532a;
import ab1.C39533b;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import cd3.C39944a;
import cd3.C39945b;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C75339i;
import di3.C86312j;
import eb0.C97625j3;
import ke3.C88144b;
import ob0.C11385n;
import p206nj.C11171e;
import p214om.C11502f;
import p227rn.C48053v;
import p248ug.C52558c;
import p820q9.C47783c;
import pe3.C89349b;
import rb0.C47984k;
import te3.C48673a7;
import te3.C51348t6;
import te3.C51650v6;
import te3.C52222z6;

/* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl */
public class ExtControlProviderVoiceControl extends ExtContentProviderBase implements C11385n {

    /* renamed from: z */
    public static final /* synthetic */ int f111440z = 0;

    /* renamed from: o */
    public String[] f111441o;

    /* renamed from: p */
    public int f111442p;

    /* renamed from: q */
    public Context f111443q;

    /* renamed from: r */
    public int f111444r = 4;

    /* renamed from: s */
    public long f111445s;

    /* renamed from: t */
    public long f111446t;

    /* renamed from: u */
    public long f111447u;

    /* renamed from: v */
    public C39945b f111448v = new C39945b();

    /* renamed from: w */
    public long f111449w = 0;

    /* renamed from: x */
    public boolean f111450x;

    /* renamed from: y */
    public C47783c f111451y = new C41396d();

    /* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$a */
    public class C41393a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39533b f111452d;

        /* renamed from: e */
        public final /* synthetic */ C51650v6 f111453e;

        public C41393a(C39533b bVar, C51650v6 v6Var) {
            this.f111452d = bVar;
            this.f111453e = v6Var;
        }

        public void run() {
            Log.m105924i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode getVoiceControlResult");
            C39533b bVar = this.f111452d;
            int i = this.f111453e.f143335e;
            bVar.getClass();
            Log.m105925i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] setGetResultTimeOut %s", Integer.valueOf(i));
            bVar.f106148s = i;
            ExtControlProviderVoiceControl extControlProviderVoiceControl = ExtControlProviderVoiceControl.this;
            C39533b bVar2 = this.f111452d;
            extControlProviderVoiceControl.mo64470l(bVar2.f106140h, bVar2.f106139g, bVar2.f106141i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$b */
    public class C41394b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39533b f111455d;

        public C41394b(C39533b bVar) {
            this.f111455d = bVar;
        }

        public void run() {
            ExtControlProviderVoiceControl extControlProviderVoiceControl = ExtControlProviderVoiceControl.this;
            C39533b bVar = this.f111455d;
            extControlProviderVoiceControl.mo64470l(bVar.f106140h, bVar.f106139g, bVar.f106141i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$c */
    public class C41395c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39533b f111457d;

        public C41395c(C39533b bVar) {
            this.f111457d = bVar;
        }

        public void run() {
            ExtControlProviderVoiceControl extControlProviderVoiceControl = ExtControlProviderVoiceControl.this;
            C39533b bVar = this.f111457d;
            extControlProviderVoiceControl.mo64470l(bVar.f106140h, bVar.f106139g, bVar.f106141i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$d */
    public class C41396d implements C47783c {
        public C41396d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$e */
    public class C41397e {

        /* renamed from: a */
        public final /* synthetic */ String f111460a;

        public C41397e(String str) {
            this.f111460a = str;
        }

        /* renamed from: a */
        public void mo64477a() {
            ExtControlProviderVoiceControl extControlProviderVoiceControl = ExtControlProviderVoiceControl.this;
            String str = this.f111460a;
            int i = ExtControlProviderVoiceControl.f111440z;
            extControlProviderVoiceControl.getClass();
            Class cls = C48053v.class;
            if (((C48053v) C86312j.m106911c(cls)).mo72617gl(str)) {
                Intent intent = new Intent();
                intent.putExtra("enterprise_biz_name", str);
                intent.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
                C88144b.m109801s(extControlProviderVoiceControl.f111443q, ".ui.conversation.EnterpriseConversationUI", intent, (Bundle) null);
            } else if (((C48053v) C86312j.m106911c(cls)).mo72614OE(str)) {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", str);
                intent2.addFlags(67108864);
                intent2.putExtra("biz_chat_from_scene", 7);
                C88144b.m109801s(extControlProviderVoiceControl.f111443q, ".ui.bizchat.BizChatConversationUI", intent2, (Bundle) null);
            } else if (C47984k.m53339m(str)) {
                C52558c b = C47984k.m53328b(str);
                String B = b == null ? null : b.mo72807B();
                if (B == null) {
                    B = "";
                }
                Intent intent3 = new Intent();
                intent3.putExtra("rawUrl", B);
                intent3.putExtra("useJs", true);
                intent3.putExtra("srcUsername", str);
                intent3.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent3.addFlags(67108864);
                C88144b.m109791i(extControlProviderVoiceControl.f111443q, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            } else {
                Intent intent4 = new Intent();
                intent4.putExtra("Chat_User", str);
                intent4.addFlags(268435456);
                intent4.addFlags(32768);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent4, extControlProviderVoiceControl.f111443q);
            }
        }
    }

    public ExtControlProviderVoiceControl(String[] strArr, int i, Context context) {
        this.f111441o = strArr;
        this.f111442p = i;
        this.f111443q = context;
    }

    /* renamed from: l */
    public boolean mo64470l(int i, String str, C89349b bVar) {
        Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getVoiceControlResult voiceId=%s, appId=%s", Integer.valueOf(i), str);
        if (this.f111446t == 0) {
            this.f111446t = System.currentTimeMillis();
        }
        this.f111447u = System.currentTimeMillis();
        C51348t6 t6Var = new C51348t6();
        t6Var.f141980d = bVar;
        C97625j3.m125815e().mo123460f(new C39533b(2, i, str, 1, (C52222z6) null, t6Var, this.f111446t));
        return true;
    }

    /* renamed from: m */
    public final void mo64471m(String str) {
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
        if (z1Var == null || !z1Var.mo62927s3()) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] username is not contact, countDown");
            this.f111444r = 3505;
            this.f111448v.mo62559a();
            return;
        }
        C41397e eVar = new C41397e(str);
        if (C11171e.m11046c(11)) {
            eVar.mo64477a();
        }
        this.f111444r = 1;
        Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] jump to chattingUI : %s, countDown", str);
        this.f111448v.mo62559a();
    }

    /* renamed from: n */
    public boolean mo64472n(C39533b bVar, int i, int i2) {
        C39533b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        if (bVar2 == null) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue netscene null");
            return false;
        }
        C52222z6 z6Var = bVar2.f106146q;
        if (z6Var == null) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue uploadCmd null");
            return false;
        } else if (z6Var.f145715e == null) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue UploadCtx null");
            return false;
        } else {
            new C52222z6();
            C52222z6 z6Var2 = bVar2.f106146q;
            C48673a7 a7Var = z6Var2.f145715e;
            a7Var.f130337e = i3;
            a7Var.f130338f = i4;
            byte[] O = C86013q1.m106433O(bVar2.f106145p, i3, i4);
            Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue %s, startPos=%s, dataLen=%s", Integer.valueOf(bVar2.f106140h), Integer.valueOf(i), Integer.valueOf(i2));
            if (O == null || O.length <= 0) {
                Log.m105921e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty, %s", bVar2.f106145p);
                return false;
            }
            z6Var2.f145716f = C89349b.m111674a(O);
            C39533b bVar3 = new C39533b(1, bVar2.f106140h, bVar2.f106139g, 1, bVar2.f106143n, bVar2.f106145p, z6Var2, (C51348t6) null);
            bVar3.f106142j = bVar2.f106142j;
            C97625j3.m125815e().mo123460f(bVar3);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r10 = r10.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r10, int r11, java.lang.String r12, ob0.C117747y r13) {
        /*
            r9 = this;
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4 = 1
            r1[r4] = r2
            r2 = 2
            r1[r2] = r12
            java.lang.String r12 = "MicroMsg.ext.ExtControlProviderVoiceControl"
            java.lang.String r5 = "[voiceControl] onSceneEnd errType=%s, errCode=%s, errMsg=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r1)
            if (r13 != 0) goto L_0x002c
            java.lang.String r10 = "[voiceControl] scene null, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r10 = 3506(0xdb2, float:4.913E-42)
            r9.f111444r = r10
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x002c:
            if (r10 != 0) goto L_0x02a7
            if (r11 == 0) goto L_0x0032
            goto L_0x02a7
        L_0x0032:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            int r11 = r13.getType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r3] = r11
            java.lang.String r11 = "[voiceControl] scene.getType()=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r11, r10)
            int r10 = r13.getType()
            r11 = 985(0x3d9, float:1.38E-42)
            if (r10 != r11) goto L_0x02a6
            boolean r10 = r9.f111450x
            if (r10 == 0) goto L_0x0055
            java.lang.String r10 = "[voiceControl] localVoiceControlSucess, no need to process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            return
        L_0x0055:
            ab1.b r13 = (ab1.C39533b) r13
            ob0.c r10 = r13.f106137e
            r11 = 0
            if (r10 == 0) goto L_0x0065
            ob0.c$d r10 = r10.f127056b
            pe3.a r10 = r10.f127083a
            if (r10 == 0) goto L_0x0065
            te3.v6 r10 = (te3.C51650v6) r10
            goto L_0x0066
        L_0x0065:
            r10 = r11
        L_0x0066:
            r1 = 3508(0xdb4, float:4.916E-42)
            if (r10 != 0) goto L_0x0077
            java.lang.String r10 = "[voiceControl] resp null, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r9.f111444r = r1
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x0077:
            pe3.b r5 = r10.f143336f
            r13.f106141i = r5
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r6 = r13.f106138f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            pe3.b r6 = r10.f143336f
            if (r6 != 0) goto L_0x008c
            java.lang.String r6 = "null"
            goto L_0x0094
        L_0x008c:
            java.lang.String r7 = new java.lang.String
            byte[] r6 = r6.f257327a
            r7.<init>(r6)
            r6 = r7
        L_0x0094:
            r5[r4] = r6
            java.lang.String r6 = "[voiceControl] opCode=%s, resp.Cookies=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r5)
            int r5 = r13.f106138f
            if (r5 != r4) goto L_0x00a1
            r6 = 1
            goto L_0x00a2
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            if (r6 == 0) goto L_0x013d
            te3.a7 r11 = r10.f143337g
            if (r11 != 0) goto L_0x00b5
            java.lang.String r10 = "[voiceControl] resp.UploadCtx is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r9.f111444r = r1
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x00b5:
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r1 = r10.f143334d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r3] = r1
            int r1 = r10.f143335e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r4] = r1
            te3.a7 r1 = r10.f143337g
            int r1 = r1.f130337e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r2] = r1
            te3.a7 r1 = r10.f143337g
            int r1 = r1.f130338f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r0] = r1
            java.lang.String r0 = "[voiceControl] uploadMode resp: Interval=%s, Timeout=%s, StartPos=%s, DataLen=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r11)
            te3.a7 r11 = r10.f143337g
            int r11 = r11.f130337e
            int r0 = r13.f106143n
            if (r11 < r0) goto L_0x00f5
            com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$a r11 = new com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$a
            r11.<init>(r13, r10)
            int r10 = r10.f143334d
            long r12 = (long) r10
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r11, r12)
            goto L_0x013c
        L_0x00f5:
            java.lang.String r11 = "[voiceControl] continue upload voice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            te3.a7 r10 = r10.f143337g
            int r11 = r10.f130337e
            if (r11 == 0) goto L_0x010a
            int r0 = r13.f106142j
            if (r11 != r0) goto L_0x010a
            java.lang.String r10 = "[voiceControl] avoid duplicate doscene"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            return
        L_0x010a:
            r13.f106142j = r11
            int r10 = r10.f130338f
            int r0 = r11 + r10
            int r1 = r13.f106143n
            r2 = 3510(0xdb6, float:4.919E-42)
            if (r0 >= r1) goto L_0x0129
            boolean r10 = r9.mo64472n(r13, r11, r10)
            if (r10 != 0) goto L_0x013c
            java.lang.String r10 = "[voiceControl] uploadVoiceContinue fail1, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r9.f111444r = r2
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x0129:
            int r1 = r1 - r11
            boolean r10 = r9.mo64472n(r13, r11, r1)
            if (r10 != 0) goto L_0x013c
            java.lang.String r10 = "[voiceControl] uploadVoiceContinue fail2, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r9.f111444r = r2
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
        L_0x013c:
            return
        L_0x013d:
            if (r5 != r2) goto L_0x0141
            r0 = 1
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 == 0) goto L_0x02a6
            java.lang.String r0 = ""
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r13.f106149t
            long r0 = r0 - r5
            int r5 = r13.f106148s
            long r5 = (long) r5
            java.lang.String r7 = "MicroMsg.ext.NetSceneAppVoiceControl"
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0170
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5[r3] = r0
            int r0 = r13.f106148s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r4] = r0
            java.lang.String r0 = "[voiceControl] isGetResultTimeOut %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r0, r5)
            r0 = 1
            goto L_0x0186
        L_0x0170:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5[r3] = r0
            int r0 = r13.f106148s
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r4] = r0
            java.lang.String r0 = "[voiceControl] time %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r5)
            r0 = 0
        L_0x0186:
            if (r0 == 0) goto L_0x0192
            r10 = 3509(0xdb5, float:4.917E-42)
            r9.f111444r = r10
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x0192:
            te3.w6 r0 = r10.f143338h
            if (r0 == 0) goto L_0x01af
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r0 = r0.f143871d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            te3.w6 r0 = r10.f143338h
            int r0 = r0.f143873f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.lang.String r0 = "[voiceControl] getResultMode resp VoiceId=%s, RecognizeRet=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)
        L_0x01af:
            te3.w6 r0 = r10.f143338h
            if (r0 == 0) goto L_0x0276
            int r1 = r0.f143873f
            if (r1 == 0) goto L_0x01b9
            goto L_0x0276
        L_0x01b9:
            te3.x6 r0 = r0.f143874g
            r1 = 3511(0xdb7, float:4.92E-42)
            if (r0 != 0) goto L_0x01cc
            java.lang.String r10 = "[voiceControl] SearchContactResultInfo null, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r9.f111444r = r1
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x01cc:
            java.util.LinkedList<te3.y6> r0 = r0.f144481d
            if (r0 == 0) goto L_0x0269
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01d8
            goto L_0x0269
        L_0x01d8:
            te3.w6 r0 = r10.f143338h
            te3.x6 r0 = r0.f143874g
            java.util.LinkedList<te3.y6> r0 = r0.f144481d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01ec
            r9.f111444r = r1
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x01ec:
            te3.w6 r0 = r10.f143338h
            te3.x6 r0 = r0.f143874g
            java.util.LinkedList<te3.y6> r0 = r0.f144481d
            int r0 = r0.size()
            if (r0 != r4) goto L_0x020a
            te3.w6 r10 = r10.f143338h
            te3.x6 r10 = r10.f143874g
            java.util.LinkedList<te3.y6> r10 = r10.f144481d
            java.lang.Object r10 = r10.get(r3)
            te3.y6 r10 = (te3.C52072y6) r10
            java.lang.String r10 = r10.f145136d
            r9.mo64471m(r10)
            return
        L_0x020a:
            te3.w6 r0 = r10.f143338h
            te3.x6 r0 = r0.f143874g
            java.util.LinkedList<te3.y6> r0 = r0.f144481d
            int r0 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L_0x0217:
            if (r2 >= r0) goto L_0x0235
            te3.w6 r5 = r10.f143338h
            te3.x6 r5 = r5.f143874g
            java.util.LinkedList<te3.y6> r5 = r5.f144481d
            java.lang.Object r5 = r5.get(r2)
            te3.y6 r5 = (te3.C52072y6) r5
            java.lang.String r5 = r5.f145136d
            r1[r2] = r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r5
            java.lang.String r5 = "[voiceControl] resp result item: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r6)
            int r2 = r2 + 1
            goto L_0x0217
        L_0x0235:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r0 = "VoiceSearchResultUI_Resultlist"
            r10.putExtra(r0, r1)
            int r13 = r13.f106140h
            java.lang.String r0 = "VoiceSearchResultUI_VoiceId"
            r10.putExtra(r0, r13)
            java.lang.String r13 = "VoiceSearchResultUI_IsVoiceControl"
            r10.putExtra(r13, r4)
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            r10.setFlags(r13)
            java.lang.String r13 = "VoiceSearchResultUI_ShowType"
            r10.putExtra(r13, r4)
            android.content.Context r13 = r9.f111443q
            java.lang.String r0 = ".ui.voicesearch.VoiceSearchResultUI"
            ke3.C88144b.m109801s(r13, r0, r10, r11)
            java.lang.String r10 = "[voiceControl] scene end countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            r9.f111444r = r4
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x0269:
            java.lang.String r10 = "[voiceControl] SearchContactResultInfo.Items null, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r9.f111444r = r1
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        L_0x0276:
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = r9.f111447u
            long r11 = r11 - r0
            int r0 = r10.f143334d
            long r1 = (long) r0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x028d
            com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$b r10 = new com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$b
            r10.<init>(r13)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r10)
            goto L_0x02a6
        L_0x028d:
            long r11 = (long) r0
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r9.f111447u
            long r0 = r0 - r2
            long r11 = r11 - r0
            int r10 = r10.f143334d
            long r0 = (long) r10
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x029e
            long r11 = (long) r10
        L_0x029e:
            com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$c r10 = new com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl$c
            r10.<init>(r13)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r10, r11)
        L_0x02a6:
            return
        L_0x02a7:
            java.lang.String r10 = "[voiceControl] errType、errCode not ok, countDown"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r10)
            r10 = 3507(0xdb3, float:4.914E-42)
            r9.f111444r = r10
            cd3.b r10 = r9.f111448v
            r10.mo62559a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uri2 = uri;
        String[] strArr3 = strArr2;
        Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] query(), ApiId=%s", Integer.valueOf(this.f111442p));
        this.f111445s = 0;
        this.f111446t = 0;
        mo128170c(uri2, this.f111443q, this.f111442p, this.f111441o);
        if (uri2 == null) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "uri == null");
            mo128177j(3, 5);
            return C39944a.m42754a(5);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Util.isNullOrNil(this.f269494g)) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "AppID == null");
            mo128177j(3, 7);
            return C39944a.m42754a(7);
        } else if (Util.isNullOrNil(mo128169b())) {
            Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "PkgName == null");
            mo128177j(3, 6);
            return C39944a.m42754a(6);
        } else {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long currentTimeMillis3 = System.currentTimeMillis() - System.currentTimeMillis();
            int f = mo128173f();
            if (f != 1) {
                Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "invalid appid ! return code = " + f);
                mo128177j(2, f);
                return C39944a.m42754a(f);
            }
            Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] getAppIdAndPkg = %s, checkIsLogin = %s", Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis3));
            if (this.f111442p != 29) {
                mo128177j(3, 15);
                return C39944a.m42754a(15);
            }
            Log.m105924i("MicroMsg.ext.ExtControlProviderVoiceControl", "voiceControl");
            if (strArr3 == null || strArr3.length < 4) {
                Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
                mo128177j(3, 3501);
                this.f111444r = 3501;
                return C39944a.m42754a(3501);
            }
            String str3 = strArr3[0];
            String str4 = strArr3[1];
            String str5 = strArr3[2];
            String str6 = strArr3[3];
            String str7 = strArr3[4];
            Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] args: %s, %s, %s, %s %s", str3, str4, str5, str6, str7);
            if (Util.isNullOrNil(str3) || Util.isNullOrNil(str4) || Util.isNullOrNil(str5) || Util.isNullOrNil(str6) || Util.isNullOrNil(str7)) {
                mo128177j(3, 3502);
                Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
                return C39944a.m42754a(3502);
            } else if (!C86013q1.m106450k(str7)) {
                Log.m105920e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] speex file not exist");
                mo128177j(3, 3503);
                return C39944a.m42754a(3503);
            } else {
                this.f111445s = System.currentTimeMillis();
                C97625j3.m125815e().mo123455a(985, this);
                C39532a aVar = r0;
                String str8 = str3;
                String str9 = str7;
                C39532a aVar2 = new C39532a(this, str8, str9, str4, str5, str6);
                this.f111448v.mo62560b(13000, aVar2);
                Log.m105925i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] finish uploadVoice = %s, getResult = %s", Long.valueOf(this.f111446t - this.f111445s), Long.valueOf(System.currentTimeMillis() - this.f111446t));
                C97625j3.m125815e().mo123470p(985, this);
                mo128175h(10, 0, 1);
                if (1 != this.f111444r) {
                    mo128175h(11, 4, 1);
                } else {
                    mo128175h(10, 0, 1);
                }
                mo128176i(0);
                return C39944a.m42754a(this.f111444r);
            }
        }
    }
}
