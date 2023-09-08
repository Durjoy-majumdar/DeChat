package com.tencent.p014mm.plugin.qrcode.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseIntArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import he0.C46025n;
import he0.C59837i;
import j20.C117292a;
import k20.C9556a;
import nj3.C76912y0;
import p008bq.C92282j0;
import p329d3.C86165a;
import p728vs.C52991e;
import te3.C51195s3;
import vl2.C102212j;

/* renamed from: com.tencent.mm.plugin.qrcode.model.a */
public class C94313a {

    /* renamed from: a */
    public static final SparseIntArray f272498a = new C94320g();

    /* renamed from: b */
    public static final SparseIntArray f272499b = new C94321h();

    /* renamed from: c */
    public static final SparseIntArray f272500c = new C94322i();

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$a */
    public class C94314a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f272501d;

        /* renamed from: e */
        public final /* synthetic */ C52991e f272502e;

        /* renamed from: f */
        public final /* synthetic */ int f272503f;

        /* renamed from: g */
        public final /* synthetic */ int f272504g;

        /* renamed from: h */
        public final /* synthetic */ Context f272505h;

        public C94314a(Intent intent, C52991e eVar, int i, int i2, Context context) {
            this.f272501d = intent;
            this.f272502e = eVar;
            this.f272503f = i;
            this.f272504g = i2;
            this.f272505h = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f272501d.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f272502e.getTitle());
            this.f272501d.putExtra("rawUrl", this.f272502e.mo63062R());
            int i2 = this.f272503f;
            if (i2 == 2) {
                this.f272501d.putExtra("stastic_scene", 13);
            } else if (i2 == 1) {
                this.f272501d.putExtra("stastic_scene", 14);
            } else {
                this.f272501d.putExtra("stastic_scene", 11);
            }
            this.f272501d.putExtra("pay_channel", C94313a.m119261a(this.f272504g));
            this.f272501d.putExtra("geta8key_session_id", this.f272502e.getCurrentSessionId());
            this.f272501d.putExtra("geta8key_cookie", this.f272502e.mo63063U());
            this.f272501d.putExtra("key_enable_teen_mode_check", true);
            C94313a.m119265e(this.f272501d, this.f272502e);
            ((C67654r1) C5176w.m5203a()).mo93190w(this.f272501d, this.f272505h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$b */
    public class C94315b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f272506d;

        /* renamed from: e */
        public final /* synthetic */ Intent f272507e;

        /* renamed from: f */
        public final /* synthetic */ String f272508f;

        public C94315b(Context context, Intent intent, String str) {
            this.f272506d = context;
            this.f272507e = intent;
            this.f272508f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                Context context = this.f272506d;
                if (context != null) {
                    Intent intent = this.f272507e;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.scanner.GetA8KeyRedirect", e, "", new Object[0]);
                Context context2 = this.f272506d;
                if (context2 != null) {
                    C76912y0.m92767f(context2, this.f272508f);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$c */
    public class C94316c implements C86165a<Integer> {

        /* renamed from: a */
        public final /* synthetic */ DialogInterface.OnClickListener f272509a;

        public C94316c(DialogInterface.OnClickListener onClickListener) {
            this.f272509a = onClickListener;
        }

        public void accept(Object obj) {
            Integer num = (Integer) obj;
            this.f272509a.onClick((DialogInterface) null, -2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$d */
    public class C94317d implements C92282j0.C92283a {

        /* renamed from: a */
        public final /* synthetic */ C94323j f272510a;

        public C94317d(C94323j jVar) {
            this.f272510a = jVar;
        }

        /* renamed from: a */
        public void mo126268a(boolean z) {
            ((C102212j) this.f272510a).mo141756s(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$e */
    public class C94318e implements C92282j0.C92283a {

        /* renamed from: a */
        public final /* synthetic */ C94323j f272511a;

        public C94318e(C94323j jVar) {
            this.f272511a = jVar;
        }

        /* renamed from: a */
        public void mo126268a(boolean z) {
            ((C102212j) this.f272511a).mo141756s(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$f */
    public class C94319f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C94323j f272512d;

        /* renamed from: e */
        public final /* synthetic */ GetA8KeyRedirectEvent f272513e;

        public C94319f(C94323j jVar, GetA8KeyRedirectEvent getA8KeyRedirectEvent) {
            this.f272512d = jVar;
            this.f272513e = getA8KeyRedirectEvent;
        }

        public void run() {
            GetA8KeyRedirectEvent getA8KeyRedirectEvent;
            GetA8KeyRedirectEvent.C40114b bVar;
            C94323j jVar = this.f272512d;
            if (jVar != null && (getA8KeyRedirectEvent = this.f272513e) != null && (bVar = getA8KeyRedirectEvent.f107574e) != null) {
                int i = bVar.f107579a;
                if (i == 1) {
                    ((C102212j) jVar).mo141756s(true);
                } else if (i == 2) {
                    ((C102212j) jVar).mo141756s(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$g */
    public class C94320g extends SparseIntArray {
        public C94320g() {
            put(2, 1012);
            put(1, 1013);
        }

        public int get(int i) {
            return get(i, 1011);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$h */
    public class C94321h extends SparseIntArray {
        public C94321h() {
            put(2, 1048);
            put(1, 1049);
        }

        public int get(int i) {
            return get(i, 1047);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$i */
    public class C94322i extends SparseIntArray {
        public C94322i() {
            put(2, 1125);
            put(1, 1126);
        }

        public int get(int i) {
            return get(i, 1124);
        }
    }

    /* renamed from: com.tencent.mm.plugin.qrcode.model.a$j */
    public interface C94323j {
    }

    /* renamed from: a */
    public static int m119261a(int i) {
        if (i == 30 || i == 37 || i == 38 || i == 40) {
            return 13;
        }
        if (i == 4 || i == 47) {
            return 12;
        }
        if (i == 34) {
            return 24;
        }
        return i == 39 ? 5 : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Class<h81.h>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Class<ht1.t1>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x09d9  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0a52  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0aab  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x09f8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m119262b(com.tencent.p014mm.plugin.qrcode.model.C94313a.C94323j r27, p728vs.C52991e r28, android.content.DialogInterface.OnClickListener r29, java.lang.String r30, int r31, int r32, java.lang.Runnable r33, android.os.Bundle r34) {
        /*
            r0 = r27
            r2 = r28
            r6 = r29
            r1 = r30
            r4 = r31
            r3 = r32
            r5 = r33
            r7 = r34
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            if (r0 == 0) goto L_0x001e
            r11 = r0
            vl2.j r11 = (vl2.C102212j) r11
            android.content.Context r11 = r11.mo141745i()
            goto L_0x001f
        L_0x001e:
            r11 = 0
        L_0x001f:
            java.lang.String r15 = "MicroMsg.scanner.GetA8KeyRedirect"
            r14 = 0
            if (r11 != 0) goto L_0x002a
            java.lang.String r0 = "handleGetA8KeyRedirect, null redirectContext"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            return r14
        L_0x002a:
            int r12 = r28.mo63058K()
            int r13 = r28.mo63069d0()
            r10 = 3
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r7[r14] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r13)
            r10 = 1
            r7[r10] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r31)
            r14 = 2
            r7[r14] = r17
            java.lang.String r14 = "handleGetA8KeyRedirect actionCode : %s, codeType : %s, source: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r14 = "geta8key_scene"
            r7.putExtra(r14, r4)
            java.lang.String r10 = "qrcode"
            r20 = r9
            java.lang.String r9 = "KPublisherId"
            r7.putExtra(r9, r10)
            java.lang.String r9 = "prePublishId"
            r7.putExtra(r9, r10)
            int r9 = m119261a(r31)
            ie3.C87716k.f253994a = r9
            java.lang.String r9 = "geta8key_session_id"
            java.lang.String r10 = "pay_channel"
            r21 = r8
            java.lang.String r8 = "stastic_scene"
            r22 = r8
            java.lang.String r8 = "showShare"
            java.lang.String r1 = "data"
            r23 = r1
            r1 = 1
            if (r12 == r1) goto L_0x0bcd
            r1 = 2
            if (r12 == r1) goto L_0x0b7e
            r1 = 3
            if (r12 == r1) goto L_0x0afd
            r1 = 4
            if (r12 == r1) goto L_0x0afb
            java.lang.String r1 = "webview"
            java.lang.String r2 = "rawUrl"
            r25 = r13
            java.lang.String r13 = "key_enable_teen_mode_check"
            r24 = r1
            java.lang.String r1 = "geta8key_cookie"
            r4 = 30
            if (r12 == r4) goto L_0x08d2
            r4 = 51
            if (r12 == r4) goto L_0x086e
            r4 = 55
            if (r12 == r4) goto L_0x085d
            java.lang.String r4 = ""
            r26 = r14
            r14 = 5
            switch(r12) {
                case 6: goto L_0x0213;
                case 7: goto L_0x08d2;
                case 8: goto L_0x0137;
                case 9: goto L_0x0106;
                case 10: goto L_0x00e9;
                case 11: goto L_0x00e9;
                case 12: goto L_0x085d;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r8 = r15
            r1 = 0
            r9 = 200(0xc8, double:9.9E-322)
            r15 = r28
            java.lang.String r13 = "key_stastic_scene"
            java.lang.String r14 = "MicroMsg.ScannerUtil"
            switch(r12) {
                case 14: goto L_0x034b;
                case 15: goto L_0x085f;
                case 16: goto L_0x0315;
                case 17: goto L_0x030e;
                case 18: goto L_0x026b;
                default: goto L_0x00be;
            }
        L_0x00be:
            switch(r12) {
                case 20: goto L_0x06cd;
                case 21: goto L_0x065f;
                case 22: goto L_0x0614;
                case 23: goto L_0x05e5;
                case 24: goto L_0x05c6;
                case 25: goto L_0x04fd;
                case 26: goto L_0x0375;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            r6 = r30
            r14 = r31
            r4 = r23
            r2 = 1
            java.lang.String r3 = "handleGetA8KeyRedirect: %s, %s"
            switch(r12) {
                case 32: goto L_0x0746;
                case 33: goto L_0x0723;
                case 34: goto L_0x0700;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            switch(r12) {
                case 40: goto L_0x0838;
                case 41: goto L_0x0807;
                case 42: goto L_0x0861;
                case 43: goto L_0x07e7;
                case 44: goto L_0x07de;
                case 45: goto L_0x07b0;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getA8key-not_catch: action code = "
            r0.append(r2)
            int r2 = r28.mo63058K()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            return r1
        L_0x00e9:
            java.lang.String r1 = r28.mo63062R()
            int r2 = m119261a(r31)
            m119264d(r0, r12, r1, r2)
            if (r5 == 0) goto L_0x0104
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r14 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r5, r14)
        L_0x0104:
            r1 = 1
            return r1
        L_0x0106:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_scene"
            r0.putInt(r1, r14)
            wc3.z r1 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            java.lang.String r2 = r28.mo63062R()
            r3 = 0
            com.tencent.mm.app.r1 r1 = (com.tencent.p014mm.app.C67654r1) r1
            r1.getClass()
            wc3.f0 r1 = wc3.C15134f0.C15135a.m14248a()
            com.tencent.mm.app.plugin.e r1 = (com.tencent.p014mm.app.plugin.C40030e) r1
            r4 = 0
            r27 = r1
            r28 = r11
            r29 = r2
            r30 = r3
            r31 = r4
            r32 = r0
            boolean r0 = r27.mo62718b(r28, r29, r30, r31, r32)
            return r0
        L_0x0137:
            java.lang.String r1 = r28.getContent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get vcard from server: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x01ff
            com.tencent.mm.plugin.scanner.model.n1 r2 = new com.tencent.mm.plugin.scanner.model.n1
            r2.<init>()
            r2.mo24277a(r1)     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            java.lang.Class<com.tencent.mm.plugin.scanner.ui.VcardContactUI> r3 = com.tencent.p014mm.plugin.scanner.p101ui.VcardContactUI.class
            r2.<init>(r11, r3)     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            k20.a r3 = new k20.a     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            r3.mo10233c(r2)     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            java.lang.Object[] r13 = r3.mo10232b()     // Catch:{ XmlPullParserException -> 0x01d5, IOException -> 0x01ab }
            java.lang.String r14 = "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect"
            java.lang.String r2 = "handleGetA8KeyRedirect"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$IScanQRCodeGetA8KeyRedirect;Lcom/tencent/mm/feature/geta8key/api/INetSceneGetA8Key;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;IILjava/lang/Runnable;Landroid/os/Bundle;)Z"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "startActivity"
            java.lang.String r5 = "(Landroid/content/Intent;)V"
            r12 = r11
            r8 = 0
            r7 = r15
            r15 = r2
            r19 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            java.lang.Object r2 = r3.mo10231a(r8)     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            r11.startActivity(r2)     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            java.lang.String r13 = "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect"
            java.lang.String r14 = "handleGetA8KeyRedirect"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$IScanQRCodeGetA8KeyRedirect;Lcom/tencent/mm/feature/geta8key/api/INetSceneGetA8Key;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;IILjava/lang/Runnable;Landroid/os/Bundle;)Z"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r12 = r11
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            vl2.j r0 = (vl2.C102212j) r0     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            r0.mo141756s(r8)     // Catch:{ XmlPullParserException -> 0x01a9, IOException -> 0x01a7 }
            r1 = 1
            return r1
        L_0x01a7:
            r0 = move-exception
            goto L_0x01ae
        L_0x01a9:
            r0 = move-exception
            goto L_0x01d8
        L_0x01ab:
            r0 = move-exception
            r7 = r15
            r8 = 0
        L_0x01ae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parser vcardxml err: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r1)
            goto L_0x0200
        L_0x01d5:
            r0 = move-exception
            r7 = r15
            r8 = 0
        L_0x01d8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parser vcardxml err: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r1)
            goto L_0x0200
        L_0x01ff:
            r8 = 0
        L_0x0200:
            r0 = 2131834304(0x7f1135c0, float:1.9301715E38)
            java.lang.String r0 = r11.getString(r0)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r1 = r11.getString(r1)
            nj3.C76879j.m92713G(r11, r0, r1, r8, r6)
            r1 = 1
            return r1
        L_0x0213:
            r4 = r15
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "getA8key-special_webview: "
            r0.append(r3)
            java.lang.String r3 = r28.mo63062R()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            java.lang.String r0 = r28.mo63062R()
            r7.putExtra(r2, r0)
            int r0 = m119261a(r31)
            r7.putExtra(r10, r0)
            r7.putExtra(r8, r6)
            java.lang.String r0 = "show_bottom"
            r7.putExtra(r0, r6)
            java.lang.String r0 = "isWebwx"
            r7.putExtra(r0, r6)
            int r0 = r28.getCurrentSessionId()
            r7.putExtra(r9, r0)
            byte[] r0 = r28.mo63063U()
            r7.putExtra(r1, r0)
            r1 = 1
            r7.putExtra(r13, r1)
            r15 = r28
            m119265e(r7, r15)
            wc3.z r0 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r7, r11)
            return r1
        L_0x026b:
            java.lang.String r0 = r28.mo63062R()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0276
            goto L_0x029f
        L_0x0276:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0299 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0299 }
            vl2.c0$a r0 = new vl2.c0$a     // Catch:{ JSONException -> 0x0299 }
            r0.<init>()     // Catch:{ JSONException -> 0x0299 }
            java.lang.String r5 = "card_tp_id"
            java.lang.String r5 = r2.optString(r5)     // Catch:{ JSONException -> 0x0299 }
            r0.f99997a = r5     // Catch:{ JSONException -> 0x0299 }
            java.lang.String r5 = "card_type"
            int r5 = r2.optInt(r5)     // Catch:{ JSONException -> 0x0299 }
            r0.f99998b = r5     // Catch:{ JSONException -> 0x0299 }
            java.lang.String r5 = "card_ext"
            java.lang.String r2 = r2.optString(r5)     // Catch:{ JSONException -> 0x0299 }
            r0.f99999c = r2     // Catch:{ JSONException -> 0x0299 }
            goto L_0x02a0
        L_0x0299:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r4, r2)
        L_0x029f:
            r0 = 0
        L_0x02a0:
            if (r0 != 0) goto L_0x02a9
            java.lang.String r0 = "item == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x030d
        L_0x02a9:
            int r2 = r0.f99998b
            java.lang.Class<nz0.e> r4 = nz0.C76982e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            nz0.e r4 = (nz0.C76982e) r4
            if (r4 == 0) goto L_0x02ba
            boolean r14 = r4.mo59837AA(r2)
            goto L_0x02bb
        L_0x02ba:
            r14 = 0
        L_0x02bb:
            if (r14 != 0) goto L_0x02ce
            r0 = 2131823154(0x7f110a32, float:1.92791E38)
            java.lang.String r0 = r11.getString(r0)
            vl2.b0 r2 = new vl2.b0
            r2.<init>()
            r3 = 0
            nj3.C76879j.m92713G(r11, r0, r3, r1, r2)
            goto L_0x030d
        L_0x02ce:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = r0.f99997a
            java.lang.String r5 = "key_card_id"
            r2.putExtra(r5, r4)
            java.lang.String r0 = r0.f99999c
            java.lang.String r4 = "key_card_ext"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "key_from_scene"
            r2.putExtra(r0, r1)
            r4 = 2
            if (r3 != r4) goto L_0x02f2
            r4 = 13
            r2.putExtra(r13, r4)
            goto L_0x0300
        L_0x02f2:
            r4 = 1
            if (r3 != r4) goto L_0x02fb
            r3 = 14
            r2.putExtra(r13, r3)
            goto L_0x0300
        L_0x02fb:
            r3 = 11
            r2.putExtra(r13, r3)
        L_0x0300:
            java.lang.String r0 = "card"
            java.lang.String r3 = ".ui.CardDetailUI"
            r4 = 0
            ke3.C88144b.m109791i(r11, r0, r3, r2, r4)
            java.lang.String r0 = "MMSCAN_QRCODE_CARD start end"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
        L_0x030d:
            return r1
        L_0x030e:
            java.lang.String r0 = "freewifi had Deprecated"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            r1 = 1
            return r1
        L_0x0315:
            java.lang.String r0 = r28.mo63062R()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.BakchatPcUsbService"
            android.content.Intent r1 = r1.setClassName(r2, r3)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Intent r2 = com.tencent.p014mm.sdk.platformtools.Util.createExplicitFromImplicitIntent(r2, r1)
            if (r2 == 0) goto L_0x0333
            r1 = r2
        L_0x0333:
            java.lang.String r2 = "url"
            android.content.Intent r0 = r1.putExtra(r2, r0)
            java.lang.String r1 = "isFromWifi"
            r2 = 1
            android.content.Intent r0 = r0.putExtra(r1, r2)
            ke3.C88144b.m109807y(r0)
            java.lang.String r0 = "GET_CONNECT_INFO start end"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            return r2
        L_0x034b:
            java.lang.String r0 = r28.mo63062R()
            if (r0 == 0) goto L_0x0358
            java.lang.String r1 = "wxpd://"
            java.lang.String r0 = r0.replace(r1, r4)
        L_0x0358:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "key_product_id"
            r1.putExtra(r2, r0)
            r0 = 7
            java.lang.String r2 = "key_product_scene"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "product"
            java.lang.String r2 = ".ui.MallProductUI"
            r3 = 0
            ke3.C88144b.m109791i(r11, r0, r2, r1, r3)
            r1 = 1
            return r1
        L_0x0375:
            java.lang.String r4 = r28.mo63062R()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fullURL: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            android.os.Bundle r5 = r28.mo63070e1()
            int r6 = r28.mo63061Q0()
            long r6 = (long) r6
            java.lang.String r9 = "CgiSpeedOutSideStructResponseSize"
            r5.putLong(r9, r6)
            int r6 = r28.mo63080m()
            java.lang.String r7 = "CgiSpeedOutSideStructBizRet"
            r5.putInt(r7, r6)
            java.lang.Class<kr0.s0> r6 = kr0.C34014s0.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            kr0.s0 r6 = (kr0.C34014s0) r6
            java.lang.String r6 = r6.getNetworkType()
            java.lang.String r7 = "CgiSpeedOutSideStructNetworkType"
            r5.putString(r7, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "stat_get_a8_key_cgi_speed"
            r6.putBundle(r7, r5)
            r14 = r31
            r5 = r26
            r6.putInt(r5, r14)
            java.lang.Class<c00.n> r5 = c00.C0405n.class
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "processAppBrandFullURL, fullURL: "
            r7.append(r9)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            android.net.Uri r7 = android.net.Uri.parse(r4)
            java.lang.String r9 = "search_query"
            java.lang.String r10 = r7.getQueryParameter(r9)
            if (r10 == 0) goto L_0x04a1
            java.lang.String r10 = r7.getQueryParameter(r9)
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x04a1
            java.lang.String r3 = r7.getQueryParameter(r9)
            java.lang.String r6 = "appid"
            java.lang.String r6 = r7.getQueryParameter(r6)
            java.lang.String r8 = "search_extInfo"
            java.lang.String r8 = r7.getQueryParameter(r8)
            java.lang.String r9 = "debug"
            java.lang.String r9 = r7.getQueryParameter(r9)
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r1)
            java.lang.String r10 = "version"
            java.lang.String r7 = r7.getQueryParameter(r10)
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r1)
            com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent r10 = new com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent
            r10.<init>()
            com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent$a r11 = r10.f264957d
            r12 = 1
            r11.f264958a = r12
            r11.f264961d = r6
            r11.f264962e = r9
            r11.f264963f = r7
            r11.f264960c = r3
            r11.f264959b = r4
            r11.f264964g = r8
            r10.publish()
            di3.d r6 = di3.C86312j.m106911c(r5)
            c00.n r6 = (c00.C0405n) r6
            android.content.Intent r6 = r6.O20()
            r7 = 99999(0x1869f, float:1.40128E-40)
            java.lang.String r8 = "ftsbizscene"
            r6.putExtra(r8, r7)
            java.lang.String r7 = "ftsQuery"
            r6.putExtra(r7, r3)
            java.lang.String r7 = "ftsqrcodestring"
            r6.putExtra(r7, r4)
            di3.d r4 = di3.C86312j.m106911c(r5)
            c00.n r4 = (c00.C0405n) r4
            r7 = 300(0x12c, float:4.2E-43)
            r8 = 262144(0x40000, float:3.67342E-40)
            java.util.Map r4 = r4.mo280hn(r7, r1, r8)
            java.lang.String r7 = "query"
            r4.put(r7, r3)
            di3.d r3 = di3.C86312j.m106911c(r5)
            c00.n r3 = (c00.C0405n) r3
            java.lang.String r7 = "scene"
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)
            java.lang.String r3 = r3.lh0(r7)
            java.lang.String r7 = "sessionid"
            r4.put(r7, r3)
            di3.d r5 = di3.C86312j.m106911c(r5)
            c00.n r5 = (c00.C0405n) r5
            java.lang.String r4 = r5.mo277Vw(r4)
            r6.putExtra(r2, r4)
            java.lang.String r2 = "key_session_id"
            r6.putExtra(r2, r3)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = ".ui.tools.fts.FTSWebViewUI"
            r4 = r24
            r5 = 0
            ke3.C88144b.m109791i(r2, r4, r3, r6, r5)
            goto L_0x04f6
        L_0x04a1:
            java.lang.String r2 = "wxa_open_scene"
            java.lang.String r2 = r7.getQueryParameter(r2)
            r5 = -1
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)
            if (r2 <= 0) goto L_0x04bf
            r5 = 1
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3[r1] = r5
            java.lang.String r5 = "processAppBrandFullURL, override scene:%d from wxa_open_scene"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r3)
            goto L_0x04df
        L_0x04bf:
            java.lang.String r2 = "qr_type4wxa"
            java.lang.String r2 = r7.getQueryParameter(r2)
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r1)
            r5 = 2
            if (r2 != r5) goto L_0x04d0
            android.util.SparseIntArray r2 = f272500c
            goto L_0x04db
        L_0x04d0:
            r2 = 22
            r5 = r25
            if (r5 == r2) goto L_0x04d9
            android.util.SparseIntArray r2 = f272498a
            goto L_0x04db
        L_0x04d9:
            android.util.SparseIntArray r2 = f272499b
        L_0x04db:
            int r2 = r2.get(r3)
        L_0x04df:
            java.lang.Class<kr0.y0> r3 = kr0.C76632y0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kr0.y0 r3 = (kr0.C76632y0) r3
            r28 = r3
            r29 = r11
            r30 = r4
            r31 = r2
            r32 = r34
            r33 = r6
            r28.mo106903ZO(r29, r30, r31, r32, r33)
        L_0x04f6:
            vl2.j r0 = (vl2.C102212j) r0
            r0.mo141756s(r1)
            r1 = 1
            return r1
        L_0x04fd:
            java.lang.String r2 = r28.mo63062R()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0508
            goto L_0x055c
        L_0x0508:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0556 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0556 }
            java.lang.String r5 = "card_list"
            org.json.JSONArray r0 = r0.optJSONArray(r5)     // Catch:{ JSONException -> 0x0556 }
            if (r0 == 0) goto L_0x054f
            int r5 = r0.length()     // Catch:{ JSONException -> 0x0556 }
            if (r5 != 0) goto L_0x051c
            goto L_0x054f
        L_0x051c:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0556 }
            r5.<init>()     // Catch:{ JSONException -> 0x0556 }
            r6 = 0
        L_0x0522:
            int r7 = r0.length()     // Catch:{ JSONException -> 0x0556 }
            if (r6 >= r7) goto L_0x055d
            org.json.JSONObject r7 = r0.optJSONObject(r6)     // Catch:{ JSONException -> 0x0556 }
            vl2.c0$a r9 = new vl2.c0$a     // Catch:{ JSONException -> 0x0556 }
            r9.<init>()     // Catch:{ JSONException -> 0x0556 }
            java.lang.String r10 = "card_tp_id"
            java.lang.String r10 = r7.optString(r10)     // Catch:{ JSONException -> 0x0556 }
            r9.f99997a = r10     // Catch:{ JSONException -> 0x0556 }
            java.lang.String r10 = "card_type"
            int r10 = r7.optInt(r10)     // Catch:{ JSONException -> 0x0556 }
            r9.f99998b = r10     // Catch:{ JSONException -> 0x0556 }
            java.lang.String r10 = "card_ext"
            java.lang.String r7 = r7.optString(r10)     // Catch:{ JSONException -> 0x0556 }
            r9.f99999c = r7     // Catch:{ JSONException -> 0x0556 }
            r5.add(r9)     // Catch:{ JSONException -> 0x0556 }
            int r6 = r6 + 1
            goto L_0x0522
        L_0x054f:
            java.lang.String r0 = "parseCardListItemArray cardItemListJson is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)     // Catch:{ JSONException -> 0x0556 }
            goto L_0x055c
        L_0x0556:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r4, r5)
        L_0x055c:
            r5 = 0
        L_0x055d:
            if (r5 == 0) goto L_0x05bf
            int r0 = r5.size()
            if (r0 != 0) goto L_0x0566
            goto L_0x05bf
        L_0x0566:
            boolean r0 = vl2.C37751c0.m41523c(r5)
            if (r0 != 0) goto L_0x057d
            r0 = 2131823154(0x7f110a32, float:1.92791E38)
            java.lang.String r0 = r11.getString(r0)
            vl2.b0 r2 = new vl2.b0
            r2.<init>()
            r3 = 0
            nj3.C76879j.m92713G(r11, r0, r3, r1, r2)
            goto L_0x05c5
        L_0x057d:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r5 = "key_from_scene"
            r0.putExtra(r5, r1)
            java.lang.String r5 = "src_username"
            r0.putExtra(r5, r4)
            java.lang.String r5 = "js_url"
            r0.putExtra(r5, r4)
            java.lang.String r4 = "key_in_card_list"
            r0.putExtra(r4, r2)
            r2 = 2
            if (r3 != r2) goto L_0x05a3
            r2 = 13
            r0.putExtra(r13, r2)
            goto L_0x05b1
        L_0x05a3:
            r2 = 1
            if (r3 != r2) goto L_0x05ac
            r2 = 14
            r0.putExtra(r13, r2)
            goto L_0x05b1
        L_0x05ac:
            r2 = 11
            r0.putExtra(r13, r2)
        L_0x05b1:
            java.lang.String r2 = "card"
            java.lang.String r3 = ".ui.CardAddEntranceUI"
            r4 = 0
            ke3.C88144b.m109791i(r11, r2, r3, r0, r4)
            java.lang.String r0 = "MMSCAN_QRCODE_MULTIPLE_CARD start end"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            goto L_0x05c5
        L_0x05bf:
            java.lang.String r0 = "list == null || list.size() == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x05c5:
            return r1
        L_0x05c6:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryScanExtDevice
            com.tencent.mm.plugin.qrcode.model.a$c r1 = new com.tencent.mm.plugin.qrcode.model.a$c
            r1.<init>(r6)
            boolean r0 = r0.checkAvailable(r11, r1)
            if (r0 != 0) goto L_0x05d5
            r2 = 1
            return r2
        L_0x05d5:
            r2 = 1
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent r0 = new com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent$a r1 = r0.f78966d
            r6 = r30
            r1.f78967a = r6
            r0.publish()
            return r2
        L_0x05e5:
            r2 = 1
            java.lang.String r0 = r28.mo63062R()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x05f7
            java.lang.String r0 = "onStartCommand url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return r2
        L_0x05f7:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r0
            java.lang.String r1 = "summerbak start url, url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r3)
            com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent r1 = new com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent
            r1.<init>()
            com.tencent.mm.autogen.events.BackupGetA8keyRedirectEvent$a r3 = r1.f78722d
            r3.f78723a = r0
            r1.publish()
            java.lang.String r0 = "publish BackupGetA8keyRedirectEvent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return r2
        L_0x0614:
            r14 = r31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ftf pay url:"
            r0.append(r1)
            java.lang.String r1 = r28.mo63062R()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            java.lang.Class<xz.f> r0 = p275xz.C15919f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xz.f r0 = (p275xz.C15919f) r0
            r1 = 1
            java.lang.String r2 = r28.mo63062R()
            int r3 = m119261a(r31)
            r4 = 0
            r27 = r0
            r28 = r11
            r29 = r1
            r30 = r2
            r31 = r3
            r32 = r4
            r27.mo14568d9(r28, r29, r30, r31, r32)
            if (r5 == 0) goto L_0x065d
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r9)
        L_0x065d:
            r1 = 1
            return r1
        L_0x065f:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.Class<com.tencent.mm.plugin.scanner.ui.ProductUI> r2 = com.tencent.p014mm.plugin.scanner.p101ui.ProductUI.class
            r0.setClass(r11, r2)
            java.lang.String r2 = "key_ProductUI_getProductInfoScene"
            r3 = 5
            r0.putExtra(r2, r3)
            java.lang.String r2 = r28.mo63062R()
            java.lang.String r3 = "key_Qrcode_Url"
            r0.putExtra(r3, r2)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r0)
            java.lang.Object[] r0 = r2.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect"
            java.lang.String r4 = "handleGetA8KeyRedirect"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$IScanQRCodeGetA8KeyRedirect;Lcom/tencent/mm/feature/geta8key/api/INetSceneGetA8Key;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;IILjava/lang/Runnable;Landroid/os/Bundle;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r27 = r11
            r28 = r0
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r8
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r0 = r2.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r11.startActivity(r0)
            java.lang.String r0 = "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect"
            java.lang.String r1 = "handleGetA8KeyRedirect"
            java.lang.String r2 = "(Lcom/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$IScanQRCodeGetA8KeyRedirect;Lcom/tencent/mm/feature/geta8key/api/INetSceneGetA8Key;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;IILjava/lang/Runnable;Landroid/os/Bundle;)Z"
            java.lang.String r3 = "Undefined"
            java.lang.String r4 = "startActivity"
            java.lang.String r5 = "(Landroid/content/Intent;)V"
            r28 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            r1 = 1
            return r1
        L_0x06cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getA8key-emoticon full url: "
            r0.append(r1)
            java.lang.String r1 = r28.mo63062R()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            java.lang.String r0 = r28.mo63062R()
            java.lang.Class<bq.k0> r1 = p008bq.C54530k0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            bq.k0 r1 = (p008bq.C54530k0) r1
            bq.j1 r0 = r1.mo75394pc(r0)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            ob0.y r0 = (ob0.C117747y) r0
            r1.mo123460f(r0)
            r2 = 1
            return r2
        L_0x0700:
            r13 = 2
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r1] = r6
            java.lang.String r1 = r28.mo63062R()
            r4[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)
            java.lang.String r1 = r28.mo63062R()
            java.lang.Class<bq.j0> r3 = p008bq.C92282j0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            bq.j0 r3 = (p008bq.C92282j0) r3
            com.tencent.mm.plugin.qrcode.model.a$e r4 = new com.tencent.mm.plugin.qrcode.model.a$e
            r4.<init>(r0)
            r3.mo58287P4(r11, r1, r4)
            return r2
        L_0x0723:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            java.lang.String r1 = r28.mo63062R()
            r4[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)
            java.lang.String r1 = r28.mo63062R()
            java.lang.Class<bq.j0> r3 = p008bq.C92282j0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            bq.j0 r3 = (p008bq.C92282j0) r3
            com.tencent.mm.plugin.qrcode.model.a$d r4 = new com.tencent.mm.plugin.qrcode.model.a$d
            r4.<init>(r0)
            r3.mo58288m0(r11, r1, r4)
            return r2
        L_0x0746:
            java.lang.String r2 = "jump to forceNotify UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            java.lang.String r2 = r28.mo63065Y()
            r7.putExtra(r4, r2)
            java.lang.String r2 = "com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI"
            r7.setClassName(r11, r2)
            vl2.j r0 = (vl2.C102212j) r0
            r0.mo141756s(r1)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r7)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect"
            java.lang.String r4 = "handleGetA8KeyRedirect"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$IScanQRCodeGetA8KeyRedirect;Lcom/tencent/mm/feature/geta8key/api/INetSceneGetA8Key;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;IILjava/lang/Runnable;Landroid/os/Bundle;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r27 = r11
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r8
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r0 = r0.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r11.startActivity(r0)
            java.lang.String r0 = "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect"
            java.lang.String r1 = "handleGetA8KeyRedirect"
            java.lang.String r2 = "(Lcom/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$IScanQRCodeGetA8KeyRedirect;Lcom/tencent/mm/feature/geta8key/api/INetSceneGetA8Key;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;IILjava/lang/Runnable;Landroid/os/Bundle;)Z"
            java.lang.String r3 = "Undefined"
            java.lang.String r4 = "startActivity"
            java.lang.String r5 = "(Landroid/content/Intent;)V"
            r28 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r32 = r4
            r33 = r5
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            r2 = 1
            return r2
        L_0x07b0:
            java.lang.String r0 = "livescreencast"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x07dd
            java.lang.String r0 = "ticket_s="
            java.lang.String[] r0 = r6.split(r0)
            r0 = r0[r2]
            com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent r1 = new com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent
            r1.<init>()
            com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent$a r2 = r1.f154870d
            r2.f154871a = r0
            r1.publish()
            if (r5 == 0) goto L_0x07dc
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r9)
        L_0x07dc:
            r1 = 1
        L_0x07dd:
            return r1
        L_0x07de:
            r1 = 1
            java.lang.String r2 = r28.mo63062R()
            m119263c(r0, r2, r5)
            return r1
        L_0x07e7:
            com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent r0 = new com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ScanQrcodeKidsWatchLoginEvent$a r1 = r0.f78969d
            r1.f78970a = r6
            java.lang.String r2 = qe3.C89625d.f257838d
            r1.f78971b = r2
            r0.publish()
            if (r5 == 0) goto L_0x0805
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r9)
        L_0x0805:
            r1 = 1
            return r1
        L_0x0807:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r28.mo63062R()
            java.lang.String r2 = "key_qrcode_string"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "account"
            java.lang.String r2 = ".friend.ui.RecoverAccountUI1"
            r3 = 0
            ke3.C88144b.m109791i(r11, r1, r2, r0, r3)
            if (r5 == 0) goto L_0x082c
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r9)
        L_0x082c:
            com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct
            r0.<init>()
            r1 = 1
            r0.f108034d = r1
            r0.mo86054n()
            return r1
        L_0x0838:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "key_red_packet_preview_url"
            r2.put(r3, r6)
            java.lang.String r3 = "key_red_packet_preview_scene"
            java.lang.String r4 = "0"
            r2.put(r3, r4)
            java.lang.Class<m00.d> r3 = m00.C10700d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            m00.d r3 = (m00.C10700d) r3
            r3.mo10956l2(r11, r2)
            vl2.j r0 = (vl2.C102212j) r0
            r0.mo141756s(r1)
            r1 = 1
            return r1
        L_0x085d:
            r15 = r28
        L_0x085f:
            r14 = r31
        L_0x0861:
            java.lang.String r1 = r28.mo63062R()
            int r2 = m119261a(r31)
            m119264d(r0, r12, r1, r2)
            r2 = 1
            return r2
        L_0x086e:
            r15 = r28
            r6 = r30
            r1 = 0
            r2 = 1
            r9 = 200(0xc8, double:9.9E-322)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = r28.mo63062R()
            java.lang.String r7 = "feed_short_url"
            r0.putExtra(r7, r4)
            r4 = 9
            java.lang.String r7 = "tab_type"
            r0.putExtra(r7, r4)
            if (r3 != 0) goto L_0x0890
            r14 = 1
            goto L_0x0895
        L_0x0890:
            if (r3 != r2) goto L_0x0894
            r14 = 2
            goto L_0x0895
        L_0x0894:
            r14 = 0
        L_0x0895:
            java.lang.String r2 = "KEY_SCAN_TYPE"
            r0.putExtra(r2, r14)
            java.lang.String r2 = "KEY_SCAN_EXPORT_URL"
            r0.putExtra(r2, r6)
            r2 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r3 = "report_scene"
            r0.getIntExtra(r3, r2)
            di3.d r2 = di3.C86312j.m106911c(r21)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r3 = 40
            r4 = 2
            r2.mo76842e7(r3, r4, r3, r0)
            java.lang.String r2 = "key_need_related_list"
            r0.putExtra(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r21)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r1.mo76864nr(r11, r0)
            if (r5 == 0) goto L_0x08d0
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r9)
        L_0x08d0:
            r1 = 1
            return r1
        L_0x08d2:
            r6 = r30
            r8 = r15
            r4 = r24
            r0 = 30
            r14 = 0
            r15 = r28
            r0 = 3
            java.lang.Object[] r15 = new java.lang.Object[r0]
            java.lang.String r0 = r28.mo63065Y()
            r15[r14] = r0
            java.lang.String r0 = r28.mo63062R()
            r14 = 1
            r15[r14] = r0
            java.lang.String r0 = r28.mo63064U0()
            r17 = 2
            r15[r17] = r0
            java.lang.String r0 = "getA8key-webview_no_notice: reqUrl : %s,  fullUrl : %s, shareUrl : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r15)
            di3.d r0 = di3.C86312j.m106911c(r20)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_webview_scan_qr_code_use_outer_get_a8key
            int r0 = r0.mo58779Qe(r15, r14)
            if (r0 != r14) goto L_0x0909
            r0 = 1
            goto L_0x090a
        L_0x0909:
            r0 = 0
        L_0x090a:
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            r19 = 0
            r15[r19] = r14
            java.lang.String r14 = "webViewUseOuterGetA8key:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r15)
            if (r0 == 0) goto L_0x0946
            ob0.c r0 = r28.getCommReqResp()     // Catch:{ IOException -> 0x0945 }
            ob0.c$d r0 = r0.f127056b     // Catch:{ IOException -> 0x0945 }
            pe3.a r0 = r0.f127083a     // Catch:{ IOException -> 0x0945 }
            te3.xt1 r0 = (te3.C52018xt1) r0     // Catch:{ IOException -> 0x0945 }
            ob0.c r14 = r28.getCommReqResp()     // Catch:{ IOException -> 0x0945 }
            ob0.c$c r14 = r14.f127055a     // Catch:{ IOException -> 0x0945 }
            pe3.a r14 = r14.f127080a     // Catch:{ IOException -> 0x0945 }
            te3.wt1 r14 = (te3.C51874wt1) r14     // Catch:{ IOException -> 0x0945 }
            java.lang.String r15 = "key_scan_qr_code_get_a8key_req"
            byte[] r14 = r14.toByteArray()     // Catch:{ IOException -> 0x0945 }
            r7.putExtra(r15, r14)     // Catch:{ IOException -> 0x0945 }
            java.lang.String r14 = "key_scan_qr_code_get_a8key_resp"
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0945 }
            r7.putExtra(r14, r0)     // Catch:{ IOException -> 0x0945 }
            goto L_0x0946
        L_0x0945:
        L_0x0946:
            java.lang.String r0 = r28.getTitle()
            java.lang.String r14 = "title"
            r7.putExtra(r14, r0)
            java.lang.String r0 = r28.mo63062R()
            r7.putExtra(r2, r0)
            java.lang.String r0 = r28.mo63064U0()
            java.lang.String r2 = "k_share_url"
            r7.putExtra(r2, r0)
            r2 = 2
            if (r3 != r2) goto L_0x096c
            r0 = r22
            r14 = 13
            r7.putExtra(r0, r14)
            goto L_0x097c
        L_0x096c:
            r0 = r22
            r14 = 1
            if (r3 != r14) goto L_0x0977
            r14 = 14
            r7.putExtra(r0, r14)
            goto L_0x097c
        L_0x0977:
            r14 = 11
            r7.putExtra(r0, r14)
        L_0x097c:
            if (r3 != r2) goto L_0x098c
            r0 = 1012(0x3f4, float:1.418E-42)
            r2 = r34
            int r14 = com.tencent.p014mm.plugin.appbrand.launching.C83311e.m102262a(r0, r2)
            java.lang.String r0 = "code_scene"
            r7.putExtra(r0, r14)
            goto L_0x098f
        L_0x098c:
            r2 = r34
            r14 = 0
        L_0x098f:
            int r0 = m119261a(r31)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = "start webview with channel : "
            r3.append(r15)
            r3.append(r0)
            java.lang.String r0 = " codeScene : "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            int r0 = m119261a(r31)
            r7.putExtra(r10, r0)
            int r0 = r28.getCurrentSessionId()
            r7.putExtra(r9, r0)
            byte[] r0 = r28.mo63063U()
            r7.putExtra(r1, r0)
            java.util.List r0 = r28.getHttpHeader()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r1 != 0) goto L_0x0a4d
            java.util.Iterator r1 = r0.iterator()
        L_0x09d3:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x09f8
            java.lang.Object r3 = r1.next()
            te3.bh2 r3 = (te3.C48857bh2) r3
            if (r3 == 0) goto L_0x09f1
            java.lang.String r9 = r3.f131120d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x09f1
            java.lang.String r3 = r3.f131121e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x09d3
        L_0x09f1:
            java.lang.String r1 = "http header has null value"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            r14 = 1
            goto L_0x09f9
        L_0x09f8:
            r14 = 0
        L_0x09f9:
            if (r14 != 0) goto L_0x0a4d
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            r14 = 0
        L_0x0a08:
            int r9 = r0.size()
            if (r14 >= r9) goto L_0x0a3b
            java.lang.Object r9 = r0.get(r14)
            te3.bh2 r9 = (te3.C48857bh2) r9
            java.lang.String r10 = r9.f131120d
            java.lang.String r9 = r9.f131121e
            r27 = r0
            r15 = 3
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            r19 = 0
            r0[r19] = r18
            r18 = 1
            r0[r18] = r10
            r17 = 2
            r0[r17] = r9
            java.lang.String r15 = "http header index = %d, key = %s, value = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r15, r0)
            r1[r14] = r10
            r3[r14] = r9
            int r14 = r14 + 1
            r0 = r27
            goto L_0x0a08
        L_0x0a3b:
            java.lang.String r0 = "geta8key_result_http_header_key_list"
            r7.putExtra(r0, r1)
            java.lang.String r0 = "geta8key_result_http_header_value_list"
            r7.putExtra(r0, r3)
            java.lang.String r0 = "k_has_http_header"
            r1 = 1
            r7.putExtra(r0, r1)
            goto L_0x0a4e
        L_0x0a4d:
            r1 = 1
        L_0x0a4e:
            r0 = 30
            if (r12 != r0) goto L_0x0aab
            java.lang.String r0 = "auth_raw_url"
            r7.putExtra(r0, r6)
            java.lang.String r0 = "auth_from_scan"
            r7.putExtra(r0, r1)
            nf3.f r0 = new nf3.f
            r0.<init>()
            di3.d r2 = di3.C86312j.m106911c(r20)
            h81.h r2 = (h81.C32735h) r2
            int r0 = r2.mo58782dM(r0)
            if (r0 != r1) goto L_0x0a6f
            r14 = 1
            goto L_0x0a70
        L_0x0a6f:
            r14 = 0
        L_0x0a70:
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.d r0 = (ex0.C45696d) r0
            boolean r0 = r0.Rq0()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0a8e
            if (r14 != 0) goto L_0x0a8e
            java.lang.String r0 = "overseas user, need to do extra auth!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = ".ui.tools.SDKOAuthWechatUI"
            r1 = 0
            ke3.C88144b.m109791i(r11, r4, r0, r7, r1)
            goto L_0x0a99
        L_0x0a8e:
            r1 = 0
            java.lang.String r0 = "do auth directly!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = ".ui.tools.SDKOAuthUI"
            ke3.C88144b.m109791i(r11, r4, r0, r7, r1)
        L_0x0a99:
            if (r5 == 0) goto L_0x0aa9
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r14 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r5, r14)
        L_0x0aa9:
            r1 = 1
            return r1
        L_0x0aab:
            r14 = 200(0xc8, double:9.9E-322)
            java.lang.String r0 = "stat_send_msg_user"
            if (r2 == 0) goto L_0x0ac1
            java.lang.String r1 = r2.getString(r0)
            if (r1 == 0) goto L_0x0ac1
            java.lang.String r1 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122324p
            java.lang.String r3 = r2.getString(r0)
            r7.putExtra(r1, r3)
        L_0x0ac1:
            if (r2 == 0) goto L_0x0ad9
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r1 = "msgUsername"
            r7.putExtra(r1, r0)
            java.lang.String r0 = "stat_chat_talker_username"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r1 = "geta8key_username"
            r7.putExtra(r1, r0)
        L_0x0ad9:
            r1 = 1
            r7.putExtra(r13, r1)
            r2 = r28
            m119265e(r7, r2)
            wc3.z r0 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r7, r11)
            if (r5 == 0) goto L_0x0af9
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r14)
        L_0x0af9:
            r1 = 1
            return r1
        L_0x0afb:
            r1 = 0
            return r1
        L_0x0afd:
            r2 = r28
            r8 = r15
            java.lang.String r0 = r28.mo63062R()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getA8key-app: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
            if (r0 == 0) goto L_0x0b77
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0b21
            goto L_0x0b77
        L_0x0b21:
            r1 = 2131834282(0x7f1135aa, float:1.930167E38)
            java.lang.String r1 = r11.getString(r1)
            java.lang.String r2 = "http"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0b3d
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r0
            r2 = 2131834283(0x7f1135ab, float:1.9301672E38)
            java.lang.String r1 = r11.getString(r2, r1)
        L_0x0b3d:
            r2 = 2131834319(0x7f1135cf, float:1.9301745E38)
            java.lang.String r2 = r11.getString(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            if (r0 == 0) goto L_0x0b75
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            r4 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r11, r3, r4)
            if (r0 == 0) goto L_0x0b75
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r4 = r11.getString(r4)
            r5 = 0
            com.tencent.mm.plugin.qrcode.model.a$b r7 = new com.tencent.mm.plugin.qrcode.model.a$b
            r7.<init>(r11, r3, r2)
            r0 = r11
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r29
            nj3.C76879j.m92714H(r0, r1, r2, r3, r4, r5)
            r1 = 1
            return r1
        L_0x0b75:
            r1 = 0
            return r1
        L_0x0b77:
            r1 = 0
            java.lang.String r0 = "getA8key-app, fullUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return r1
        L_0x0b7e:
            r2 = r28
            r8 = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getA8key-webview: "
            r0.append(r1)
            java.lang.String r1 = r28.mo63062R()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r30)
            if (r1 != 0) goto L_0x0ba5
            r1 = r30
            goto L_0x0ba9
        L_0x0ba5:
            java.lang.String r1 = r28.mo63062R()
        L_0x0ba9:
            r4 = 0
            r0[r4] = r1
            r1 = 2131834283(0x7f1135ab, float:1.9301672E38)
            java.lang.String r8 = r11.getString(r1, r0)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r9 = r11.getString(r1)
            com.tencent.mm.plugin.qrcode.model.a$a r10 = new com.tencent.mm.plugin.qrcode.model.a$a
            r0 = r10
            r1 = r7
            r2 = r28
            r3 = r32
            r4 = r31
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            nj3.C76879j.m92750u(r11, r8, r9, r10, r6)
            r1 = 1
            return r1
        L_0x0bcd:
            r2 = r28
            r1 = r15
            r0 = r22
            r4 = r23
            r14 = 200(0xc8, double:9.9E-322)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "getA8key-text: "
            r6.append(r12)
            java.lang.String r12 = r28.getContent()
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r6)
            java.lang.Class<h81.g> r1 = h81.C59773g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.g r1 = (h81.C59773g) r1
            java.lang.String r6 = r28.getContent()
            r1.mo84746oV(r6)
            java.lang.String r1 = r28.getContent()
            r7.putExtra(r4, r1)
            r1 = 0
            r7.putExtra(r8, r1)
            r1 = 2
            if (r3 != r1) goto L_0x0c11
            r1 = 13
            r7.putExtra(r0, r1)
            goto L_0x0c1f
        L_0x0c11:
            r1 = 1
            if (r3 != r1) goto L_0x0c1a
            r1 = 14
            r7.putExtra(r0, r1)
            goto L_0x0c1f
        L_0x0c1a:
            r1 = 11
            r7.putExtra(r0, r1)
        L_0x0c1f:
            int r0 = m119261a(r31)
            r7.putExtra(r10, r0)
            int r0 = r28.getCurrentSessionId()
            r7.putExtra(r9, r0)
            m119265e(r7, r2)
            wc3.z r0 = com.tencent.p014mm.plugin.scanner.C5176w.m5203a()
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r7, r11)
            if (r5 == 0) goto L_0x0c47
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            r0.postDelayed(r5, r14)
        L_0x0c47:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.qrcode.model.C94313a.m119262b(com.tencent.mm.plugin.qrcode.model.a$j, vs.e, android.content.DialogInterface$OnClickListener, java.lang.String, int, int, java.lang.Runnable, android.os.Bundle):boolean");
    }

    /* renamed from: c */
    public static void m119263c(C94323j jVar, String str, Runnable runnable) {
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
        openIMKefuStartConversationRequest.f108517f = 1;
        C102212j jVar2 = (C102212j) jVar;
        openIMKefuStartConversationRequest.f108515d = jVar2.mo141745i();
        C51195s3 s3Var = new C51195s3();
        openIMKefuStartConversationRequest.f108520i = s3Var;
        s3Var.f141285d = str;
        s3Var.f141286e = str;
        openIMKefuStartConversationRequest.f108526r = true;
        openIMKefuStartConversationRequest.f108522n = true;
        openIMKefuStartConversationRequest.f108523o = openIMKefuStartConversationRequest.f108515d.getString(C0966R.string.hfd);
        openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(openIMKefuStartConversationRequest.f108517f);
        openIMKefuStartConversationRequest.f108524p = true;
        Intent intent = new Intent();
        openIMKefuStartConversationRequest.f108528t = intent;
        intent.putExtra("key_result_receiver", new OpenCustomerServiceChatResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper()), jVar2, runnable));
        ((C59837i) C86312j.m106911c(C59837i.class)).mo71855jT(openIMKefuStartConversationRequest);
    }

    /* renamed from: d */
    public static void m119264d(C94323j jVar, int i, String str, int i2) {
        Log.m105919d("MicroMsg.scanner.GetA8KeyRedirect", "actionCode = %s, url = %s", Integer.valueOf(i), str);
        Context i3 = jVar != null ? ((C102212j) jVar).mo141745i() : null;
        if (i3 != null) {
            GetA8KeyRedirectEvent getA8KeyRedirectEvent = new GetA8KeyRedirectEvent();
            GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
            aVar.f107575a = i;
            aVar.f107576b = str;
            aVar.f107577c = i3;
            Bundle bundle = new Bundle();
            bundle.putInt("pay_channel", i2);
            getA8KeyRedirectEvent.f107573d.f107578d = bundle;
            getA8KeyRedirectEvent.callback = new C94319f(jVar, getA8KeyRedirectEvent);
            getA8KeyRedirectEvent.asyncPublish(Looper.myLooper());
        }
    }

    /* renamed from: e */
    public static void m119265e(Intent intent, C52991e eVar) {
        if (eVar.mo63060Q() != null) {
            JsapiPermissionWrapper jsapiPermissionWrapper = new JsapiPermissionWrapper();
            jsapiPermissionWrapper.f121048d = eVar.mo63068c0();
            intent.putExtra("scan_jspermission", jsapiPermissionWrapper);
        }
        intent.putExtra("scan_general_ctrl", new GeneralControlWrapper(eVar.mo63060Q()));
    }
}
