package com.tencent.p014mm.p136ui.chatting.manager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.manager.c */
public final class C6789c {

    /* renamed from: com.tencent.mm.ui.chatting.manager.c$a */
    public static final class C6790a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f24336d;

        /* renamed from: e */
        public final /* synthetic */ Context f24337e;

        public C6790a(String str, Context context) {
            this.f24336d = str;
            this.f24337e = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f24336d);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109791i(this.f24337e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(17509, 1, this.f24336d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.manager.c$b */
    public static final class C6791b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f24338d;

        /* renamed from: e */
        public final /* synthetic */ String f24339e;

        public C6791b(Runnable runnable, String str) {
            this.f24338d = runnable;
            this.f24339e = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Runnable runnable = this.f24338d;
            if (runnable != null) {
                runnable.run();
            }
            C115669n.INSTANCE.mo160131h(17509, 2, this.f24339e);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.manager.c$c */
    public static final class C6792c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f24340d;

        public C6792c(String str) {
            this.f24340d = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(17509, 3, this.f24340d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r4) == false) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7088a(com.tencent.p014mm.storage.C72963f4 r8, android.content.Context r9, java.lang.Runnable r10) {
        /*
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            int r0 = eb0.C75569c4.f221998a
            eb0.c4$a r0 = new eb0.c4$a
            r0.<init>()
            java.lang.String r1 = r8.f230724G
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0050
            java.lang.String r1 = r8.f230724G
            java.lang.String r4 = "msgsource"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r4, r3)
            if (r1 == 0) goto L_0x0034
            java.lang.String r4 = ".msgsource.sec_msg_node.share-tip-url"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            java.lang.String r4 = ""
        L_0x0036:
            if (r1 == 0) goto L_0x004b
            java.lang.String r5 = ".msgsource.sec_msg_node.sec-ctrl-flag"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r5 != 0) goto L_0x004b
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            r0.f25907a = r4
            r0.f25908b = r1
        L_0x0050:
            bp3.p r1 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Chat_ShareConfirmDialog_Int
            int r1 = r1.mo109882e(r4, r2)
            r0.f25909c = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            java.lang.String r4 = "ShareDialogHelper"
            r5 = 1
            if (r1 == 0) goto L_0x006e
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r8 = r8.f230724G
            r1[r2] = r8
            java.lang.String r8 = "checkSecAndExecute msgSource:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r8, r1)
        L_0x006e:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r2] = r0
            java.lang.String r1 = "checkSecAndExecute secData:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r8)
            java.lang.String r8 = r0.f25907a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0086
            int r8 = r0.f25909c
            if (r8 < r5) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r8 = 0
            goto L_0x0087
        L_0x0086:
            r8 = 1
        L_0x0087:
            if (r8 != 0) goto L_0x0090
            if (r10 == 0) goto L_0x016c
            r10.run()
            goto L_0x016c
        L_0x0090:
            java.lang.String r8 = r0.f25907a
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 17509(0x4465, float:2.4535E-41)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r2] = r7
            r6[r5] = r8
            r1.mo160131h(r4, r6)
            qo3.q r1 = new qo3.q
            r1.<init>(r9)
            boolean r4 = r0.mo8752a()
            if (r4 != 0) goto L_0x00cd
            android.content.res.Resources r0 = r9.getResources()
            r2 = 2131835464(0x7f113a48, float:1.9304067E38)
            java.lang.String r0 = r0.getString(r2)
            r1.mo107606r(r0)
            android.content.res.Resources r0 = r9.getResources()
            r2 = 2131835462(0x7f113a46, float:1.9304063E38)
            java.lang.String r0 = r0.getString(r2)
            r1.mo107595g(r0)
            goto L_0x0117
        L_0x00cd:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r9)
            r5 = 2131496530(0x7f0c0e52, float:1.8616627E38)
            android.view.View r3 = r4.inflate(r5, r3)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.LinearLayout"
            gy3.C87412m.m108592e(r3, r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4 = 2131315882(0x7f094caa, float:1.825023E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131306377(0x7f092789, float:1.8230951E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.res.Resources r6 = r9.getResources()
            r7 = 2131835463(0x7f113a47, float:1.9304065E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "context.resources.getStr….sec_msg_fake_content_v2)"
            gy3.C87412m.m108593f(r6, r7)
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
            r4.setText(r6)
            boolean r0 = r0.mo8752a()
            if (r0 == 0) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r2 = 8
        L_0x0111:
            r5.setVisibility(r2)
            r1.mo107592d(r3)
        L_0x0117:
            r0 = 2131821730(0x7f1104a2, float:1.9276211E38)
            java.lang.String r0 = r9.getString(r0)
            r2 = 2131823634(0x7f110c12, float:1.9280073E38)
            java.lang.String r2 = r9.getString(r2)
            r3 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r3 = r9.getString(r3)
            qo3.g$i r4 = r1.f225837a
            qo3.a r4 = r4.f225714b
            r4.f225665v = r0
            r4.f225666w = r2
            r4.f225667x = r3
            com.tencent.mm.ui.chatting.manager.c$a r0 = new com.tencent.mm.ui.chatting.manager.c$a
            r0.<init>(r8, r9)
            com.tencent.mm.ui.chatting.manager.c$b r2 = new com.tencent.mm.ui.chatting.manager.c$b
            r2.<init>(r10, r8)
            com.tencent.mm.ui.chatting.manager.c$c r10 = new com.tencent.mm.ui.chatting.manager.c$c
            r10.<init>(r8)
            r4.f225624G = r0
            r4.f225625H = r2
            r4.f225626I = r10
            r1.mo107603o()
            qo3.g r8 = r1.f225839c
            r10 = 2131309293(0x7f0932ed, float:1.8236866E38)
            android.view.View r8 = r8.findViewById(r10)
            java.lang.String r10 = "null cannot be cast to non-null type android.widget.Button"
            gy3.C87412m.m108592e(r8, r10)
            android.widget.Button r8 = (android.widget.Button) r8
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131100190(0x7f06021e, float:1.7812754E38)
            int r9 = r9.getColor(r10)
            r8.setTextColor(r9)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.manager.C6789c.m7088a(com.tencent.mm.storage.f4, android.content.Context, java.lang.Runnable):void");
    }
}
