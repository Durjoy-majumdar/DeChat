package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.NewContactWidgetNormal;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ob0.C11385n;
import p629ny.C76979h;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.b */
public class C72893b extends LinearLayout implements C11385n {

    /* renamed from: i */
    public static C72895b f212459i;

    /* renamed from: d */
    public Context f212460d;

    /* renamed from: e */
    public TextView f212461e;

    /* renamed from: f */
    public Button f212462f;

    /* renamed from: g */
    public C89779i0 f212463g;

    /* renamed from: h */
    public C72896c f212464h;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.b$a */
    public class C72894a implements DialogInterface.OnClickListener {
        public C72894a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C72896c cVar = C72893b.this.f212464h;
            if (cVar != null) {
                NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
                newContactWidgetNormal.mo96530a(newContactWidgetNormal.f202419d, newContactWidgetNormal.f202420e, newContactWidgetNormal.f202422g, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.b$b */
    public static class C72895b {

        /* renamed from: a */
        public String f212466a;

        /* renamed from: b */
        public int f212467b;

        /* renamed from: c */
        public String f212468c;

        /* renamed from: d */
        public int f212469d;

        /* renamed from: e */
        public String f212470e;
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.b$c */
    public interface C72896c {
    }

    public C72893b(Context context) {
        super(context);
        this.f212460d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.as5, this);
        this.f212461e = (TextView) inflate.findViewById(C0966R.C0970id.ebc);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.ebd);
        this.f212462f = button;
        button.setOnClickListener(new C72889a(this));
    }

    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [xh.q5] */
    /* JADX WARNING: type inference failed for: r12v3, types: [xh.g8] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        if (com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r0).f212759w != 6) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        if (com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r0).f212759w != 6) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        if (r8 != false) goto L_0x008a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m85478a(com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b r13, java.lang.String r14) {
        /*
            r13.getClass()
            com.tencent.mm.pluginsdk.ui.preference.b$b r0 = f212459i
            java.lang.String r1 = "MicroMsg.FMessageItemView"
            if (r0 != 0) goto L_0x0010
            java.lang.String r13 = "FMessage Args is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)
            goto L_0x014a
        L_0x0010:
            java.lang.String r0 = "try to reply verify content"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            com.tencent.mm.pluginsdk.ui.preference.b$b r0 = f212459i
            java.lang.String r0 = r0.f212466a
            r4.add(r0)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            com.tencent.mm.pluginsdk.ui.preference.b$b r0 = f212459i
            int r0 = r0.f212467b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            com.tencent.mm.pluginsdk.ui.preference.b$b r0 = f212459i
            java.lang.String r0 = r0.f212470e
            r6.add(r0)
            com.tencent.mm.pluginsdk.ui.preference.b$b r0 = f212459i
            int r2 = r0.f212469d
            java.lang.String r0 = r0.f212466a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "getOpCode, type = "
            r3.append(r7)
            r3.append(r2)
            java.lang.String r7 = ", talker = "
            r3.append(r7)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            r3 = 2
            r7 = 5
            r8 = 0
            r9 = 1
            r10 = 6
            if (r2 == 0) goto L_0x00bd
            java.lang.String r11 = "getOpCodeFromVerify fail, xml is null"
            r12 = 0
            if (r2 == r9) goto L_0x0095
            if (r2 == r3) goto L_0x006f
            goto L_0x00a8
        L_0x006f:
            com.tencent.mm.storage.v4 r2 = fd0.C75743h.yx0()
            com.tencent.mm.storage.u4[] r0 = r2.mo101226qq(r0, r9)
            if (r0 == 0) goto L_0x007b
            r12 = r0[r8]
        L_0x007b:
            if (r12 != 0) goto L_0x0083
            java.lang.String r0 = "getOpCode, last shakeMsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x00a8
        L_0x0083:
            java.lang.String r0 = r12.field_content
            if (r0 != 0) goto L_0x008c
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r11)
        L_0x008a:
            r7 = 6
            goto L_0x00bb
        L_0x008c:
            com.tencent.mm.storage.f4$h r0 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r0)
            int r0 = r0.f212759w
            if (r0 == r10) goto L_0x00bb
        L_0x0094:
            goto L_0x008a
        L_0x0095:
            com.tencent.mm.storage.c4 r2 = fd0.C75743h.xx0()
            com.tencent.mm.storage.b4[] r0 = r2.mo100932Ow(r0, r9)
            if (r0 == 0) goto L_0x00a1
            r12 = r0[r8]
        L_0x00a1:
            if (r12 != 0) goto L_0x00aa
            java.lang.String r0 = "getOpCode, last lbsMsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x00a8:
            r3 = 6
            goto L_0x00f7
        L_0x00aa:
            java.lang.String r0 = r12.field_content
            if (r0 != 0) goto L_0x00b2
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r11)
            goto L_0x008a
        L_0x00b2:
            com.tencent.mm.storage.f4$h r0 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r0)
            int r0 = r0.f212759w
            if (r0 == r10) goto L_0x00bb
            goto L_0x0094
        L_0x00bb:
            r3 = r7
            goto L_0x00f7
        L_0x00bd:
            java.lang.String r2 = "MicroMsg.FMessageLogic"
            if (r0 == 0) goto L_0x00ef
            int r11 = r0.length()
            if (r11 != 0) goto L_0x00c8
            goto L_0x00ef
        L_0x00c8:
            com.tencent.mm.storage.n3 r11 = fd0.C75743h.wx0()
            com.tencent.mm.storage.m3 r11 = r11.mo101190bD(r0)
            if (r11 != 0) goto L_0x00e7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "isVerifyReceiver, lastRecvFmsg does not exist, talker = "
            r3.append(r9)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x00f4
        L_0x00e7:
            int r0 = r11.field_type
            if (r0 == r9) goto L_0x00ed
            if (r0 != r3) goto L_0x00f4
        L_0x00ed:
            r8 = 1
            goto L_0x00f4
        L_0x00ef:
            java.lang.String r0 = "isVerifyReceiver, invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x00f4:
            if (r8 == 0) goto L_0x00bb
            goto L_0x008a
        L_0x00f7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "reply, final opcode = "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r1 = 30
            r0.mo123455a(r1, r13)
            com.tencent.mm.pluginsdk.model.b1 r0 = new com.tencent.mm.pluginsdk.model.b1
            com.tencent.mm.pluginsdk.ui.preference.b$b r1 = f212459i
            java.lang.String r8 = r1.f212468c
            r9 = 0
            r10 = 0
            java.lang.String r11 = ""
            r2 = r0
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            ob0.b0 r14 = eb0.C97625j3.m125815e()
            r14.mo123460f(r0)
            android.content.Context r1 = r13.f212460d
            r14 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r1.getString(r14)
            android.content.Context r14 = r13.f212460d
            r3 = 2131821681(0x7f110471, float:1.9276112E38)
            java.lang.String r3 = r14.getString(r3)
            r4 = 1
            r5 = 1
            ae3.a r6 = new ae3.a
            r6.<init>(r13, r0)
            qo3.i0 r14 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r13.f212463g = r14
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b.m85478a(com.tencent.mm.pluginsdk.ui.preference.b, java.lang.String):void");
    }

    public static void setFMessageArgs(C72895b bVar) {
        f212459i = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            int r4 = r20.getType()
            r5 = 30
            if (r4 == r5) goto L_0x0011
            return
        L_0x0011:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "onSceneEnd, errType = "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = ", errCode = "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MicroMsg.FMessageItemView"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            qo3.i0 r4 = r0.f212463g
            if (r4 == 0) goto L_0x0036
            r4.dismiss()
        L_0x0036:
            r4 = 5
            r7 = 1
            r8 = 4
            if (r1 != 0) goto L_0x01a9
            if (r2 != 0) goto L_0x01a9
            r1 = r20
            com.tencent.mm.pluginsdk.model.b1 r1 = (com.tencent.p014mm.pluginsdk.model.C44590b1) r1
            int r2 = r1.f120898g
            java.lang.String r1 = r1.f120899h
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onSceneEnd, pre insert fmsg, opcode = "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = ", verifyContent = "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onSceneEnd, type = "
            r9.append(r10)
            com.tencent.mm.pluginsdk.ui.preference.b$b r10 = f212459i
            int r10 = r10.f212469d
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r9)
            com.tencent.mm.pluginsdk.ui.preference.b$b r9 = f212459i
            int r10 = r9.f212469d
            java.lang.String r11 = "fmessage"
            r12 = 1
            r14 = 2
            if (r10 == r7) goto L_0x0118
            if (r10 == r14) goto L_0x00a7
            java.lang.String r3 = r9.f212466a
            if (r2 != r4) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r14 = 3
        L_0x008c:
            int r4 = r9.f212467b
            com.tencent.p014mm.plugin.profile.C70142g.m82629a(r3, r1, r14, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "FMessageConversationStorage onSceneEnd, insert fmsg , opcode = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            goto L_0x023f
        L_0x00a7:
            com.tencent.mm.storage.u4 r2 = new com.tencent.mm.storage.u4
            r2.<init>()
            k40.a r4 = f40.C86709a0.m107533q(r3)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.q r4 = r4.Cc0()
            com.tencent.mm.pluginsdk.ui.preference.b$b r9 = f212459i
            java.lang.String r9 = r9.f212466a
            com.tencent.mm.storage.v4 r4 = (com.tencent.p014mm.storage.C72992v4) r4
            r4.getClass()
            if (r9 == 0) goto L_0x00d8
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.q r3 = r3.Cc0()
            com.tencent.mm.storage.v4 r3 = (com.tencent.p014mm.storage.C72992v4) r3
            com.tencent.mm.storage.u4 r3 = r3.mo101221Lo()
            if (r3 == 0) goto L_0x00d8
            long r3 = r3.field_createtime
            long r14 = r3 + r12
            goto L_0x00da
        L_0x00d8:
            r14 = 0
        L_0x00da:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r9 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r14 = r3
        L_0x00e4:
            r2.field_createtime = r14
            r2.field_isSend = r7
            r2.field_content = r1
            r2.field_talker = r11
            com.tencent.mm.pluginsdk.ui.preference.b$b r1 = f212459i
            java.lang.String r1 = r1.f212466a
            r2.field_sayhiuser = r1
            long r3 = java.lang.System.currentTimeMillis()
            r2.field_svrid = r3
            r2.field_status = r8
            com.tencent.mm.storage.v4 r1 = fd0.C75743h.yx0()
            boolean r1 = r1.insert(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onSceneEnd, insert shake, ret = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)
            goto L_0x023f
        L_0x0118:
            com.tencent.mm.storage.b4 r2 = new com.tencent.mm.storage.b4
            r2.<init>()
            k40.a r4 = f40.C86709a0.m107533q(r3)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.j r4 = r4.mo96099XB()
            com.tencent.mm.pluginsdk.ui.preference.b$b r6 = f212459i
            java.lang.String r6 = r6.f212466a
            com.tencent.mm.storage.c4 r4 = (com.tencent.p014mm.storage.C72957c4) r4
            r4.getClass()
            if (r6 == 0) goto L_0x017e
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.j r3 = r3.mo96099XB()
            com.tencent.mm.storage.c4 r3 = (com.tencent.p014mm.storage.C72957c4) r3
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r3.f212645d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "SELECT * FROM "
            r6.append(r9)
            java.lang.String r3 = r3.getTableName()
            r6.append(r3)
            java.lang.String r3 = " ORDER BY createtime DESC LIMIT 1"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r6 = 0
            android.database.Cursor r3 = r4.rawQuery(r3, r6, r14)
            if (r3 != 0) goto L_0x0162
            goto L_0x0177
        L_0x0162:
            boolean r4 = r3.moveToFirst()
            if (r4 != 0) goto L_0x016c
            r3.close()
            goto L_0x0177
        L_0x016c:
            com.tencent.mm.storage.b4 r6 = new com.tencent.mm.storage.b4
            r6.<init>()
            r6.convertFrom(r3)
            r3.close()
        L_0x0177:
            if (r6 == 0) goto L_0x017e
            long r3 = r6.field_createtime
            long r14 = r3 + r12
            goto L_0x0180
        L_0x017e:
            r14 = 0
        L_0x0180:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0189
            goto L_0x018a
        L_0x0189:
            r14 = r3
        L_0x018a:
            r2.field_createtime = r14
            r2.field_isSend = r7
            r2.field_content = r1
            r2.field_talker = r11
            com.tencent.mm.pluginsdk.ui.preference.b$b r1 = f212459i
            java.lang.String r1 = r1.f212466a
            r2.field_sayhiuser = r1
            long r3 = java.lang.System.currentTimeMillis()
            r2.field_svrid = r3
            r2.field_status = r8
            com.tencent.mm.storage.c4 r1 = fd0.C75743h.xx0()
            r1.insert(r2)
            goto L_0x023f
        L_0x01a9:
            if (r1 != r8) goto L_0x01fe
            r3 = -302(0xfffffffffffffed2, float:NaN)
            if (r2 != r3) goto L_0x01fe
            int r1 = r20.getType()
            r2 = 0
            if (r1 != r5) goto L_0x01bd
            r1 = r20
            com.tencent.mm.pluginsdk.model.b1 r1 = (com.tencent.p014mm.pluginsdk.model.C44590b1) r1
            int r1 = r1.f120898g
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r3[r2] = r7
            java.lang.String r2 = "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r3)
            r2 = 6
            if (r1 == r2) goto L_0x01d0
            if (r1 != r4) goto L_0x023f
        L_0x01d0:
            android.content.Context r6 = r0.f212460d
            r1 = 2131824390(0x7f110f06, float:1.9281607E38)
            java.lang.String r7 = r6.getString(r1)
            android.content.Context r1 = r0.f212460d
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r8 = r1.getString(r2)
            android.content.Context r1 = r0.f212460d
            r2 = 2131820938(0x7f11018a, float:1.9274605E38)
            java.lang.String r9 = r1.getString(r2)
            android.content.Context r1 = r0.f212460d
            r2 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r10 = r1.getString(r2)
            com.tencent.mm.pluginsdk.ui.preference.b$a r11 = new com.tencent.mm.pluginsdk.ui.preference.b$a
            r11.<init>()
            r12 = 0
            nj3.C76879j.m92707A(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x023f
        L_0x01fe:
            if (r1 != r8) goto L_0x020e
            r3 = -34
            if (r2 != r3) goto L_0x020e
            android.content.Context r1 = r0.f212460d
            r2 = 2131830292(0x7f112614, float:1.9293577E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0236
        L_0x020e:
            if (r1 != r8) goto L_0x021e
            r3 = -94
            if (r2 != r3) goto L_0x021e
            android.content.Context r1 = r0.f212460d
            r2 = 2131830295(0x7f112617, float:1.9293583E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0236
        L_0x021e:
            if (r1 != r8) goto L_0x022d
            r1 = -24
            if (r2 != r1) goto L_0x022d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r1 != 0) goto L_0x022d
            r1 = r19
            goto L_0x0236
        L_0x022d:
            android.content.Context r1 = r0.f212460d
            r2 = 2131835640(0x7f113af8, float:1.9304424E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x0236:
            android.content.Context r2 = r0.f212460d
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r1, (int) r7)
            r1.show()
        L_0x023f:
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123470p(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void setBtnVisibility(int i) {
        Button button = this.f212462f;
        if (button != null) {
            button.setVisibility(i);
        }
    }

    public void setContentText(String str) {
        if (Util.isNullOrNil(str)) {
            this.f212461e.setVisibility(8);
            return;
        }
        this.f212461e.setVisibility(0);
        this.f212461e.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f212460d, Util.nullAsNil(str), this.f212461e.getTextSize()));
    }

    public void setGotoSayHiCallBack(C72896c cVar) {
        this.f212464h = cVar;
    }
}
