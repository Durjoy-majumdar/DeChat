package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSafeDeviceNameEvent;
import com.tencent.p014mm.autogen.events.GetSafeDeviceTypeEvent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.sdk.platformtools.Util;
import eg0.C75611b;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import nj3.C76879j;
import ob0.C11385n;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI */
public class VerifyQQUI extends MMWizardActivity implements C11385n {

    /* renamed from: q */
    public static final /* synthetic */ int f196511q = 0;

    /* renamed from: e */
    public C89779i0 f196512e = null;

    /* renamed from: f */
    public long f196513f = 0;

    /* renamed from: g */
    public String f196514g = "";

    /* renamed from: h */
    public byte[] f196515h = null;

    /* renamed from: i */
    public String f196516i = "";

    /* renamed from: j */
    public SecurityImage f196517j = null;

    /* renamed from: n */
    public String f196518n;

    /* renamed from: o */
    public String f196519o;

    /* renamed from: p */
    public C68394d f196520p = new C68394d(this);

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$a */
    public class C68391a implements MenuItem.OnMenuItemClickListener {
        public C68391a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            VerifyQQUI.this.hideVKB();
            VerifyQQUI verifyQQUI = VerifyQQUI.this;
            int i = VerifyQQUI.f196511q;
            verifyQQUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$b */
    public class C68392b implements DialogInterface.OnClickListener {
        public C68392b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            VerifyQQUI verifyQQUI = VerifyQQUI.this;
            int i2 = VerifyQQUI.f196511q;
            verifyQQUI.mo7681K7(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$c */
    public class C68393c extends SecurityImage.C116049b {
        public C68393c() {
        }

        /* renamed from: a */
        public void mo93941a() {
            VerifyQQUI verifyQQUI = VerifyQQUI.this;
            long j = verifyQQUI.f196513f;
            String str = verifyQQUI.f196514g;
            String str2 = verifyQQUI.f196516i;
            verifyQQUI.getClass();
            C86709a0.m107524d().mo123460f(new C75611b(j, str, str2, "", (String) null, 2, true));
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$d */
    public static class C68394d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public WeakReference<VerifyQQUI> f196524d;

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$d$a */
        public class C68395a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C75611b f196525d;

            public C68395a(C68394d dVar, C75611b bVar) {
                this.f196525d = bVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f196525d);
            }
        }

        public C68394d(VerifyQQUI verifyQQUI) {
            this.f196524d = new WeakReference<>(verifyQQUI);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            VerifyQQUI verifyQQUI = this.f196524d.get();
            if (verifyQQUI != null && !verifyQQUI.isFinishing()) {
                String trim = ((EditText) verifyQQUI.findViewById(C0966R.C0970id.a_6)).getText().toString().trim();
                verifyQQUI.f196514g = ((EditText) verifyQQUI.findViewById(C0966R.C0970id.a_5)).getText().toString().trim();
                try {
                    long j = Util.getLong(trim, 0);
                    verifyQQUI.f196513f = j;
                    if (j < 10000) {
                        C76879j.m92738i(verifyQQUI.getContext(), C0966R.string.am7, C0966R.string.am5);
                        return true;
                    } else if (verifyQQUI.f196514g.equals("")) {
                        C76879j.m92738i(verifyQQUI.getContext(), C0966R.string.am6, C0966R.string.am5);
                        return true;
                    } else {
                        verifyQQUI.hideVKB();
                        C75611b bVar = new C75611b(verifyQQUI.f196513f, verifyQQUI.f196514g, "", "", "", 1, verifyQQUI.f196518n, verifyQQUI.f196519o, false);
                        C86709a0.m107524d().mo123460f(bVar);
                        verifyQQUI.f196512e = C76879j.m92723Q(verifyQQUI.getContext(), verifyQQUI.getString(C0966R.string.am9), verifyQQUI.getString(C0966R.string.f360174am0), true, true, new C68395a(this, bVar));
                        return true;
                    }
                } catch (Exception unused) {
                    C76879j.m92738i(verifyQQUI.getContext(), C0966R.string.am7, C0966R.string.am5);
                }
            }
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6579iv;
    }

    public void initView() {
        GetSafeDeviceNameEvent getSafeDeviceNameEvent = new GetSafeDeviceNameEvent();
        getSafeDeviceNameEvent.f193657d.f193659a = this;
        getSafeDeviceNameEvent.publish();
        this.f196518n = getSafeDeviceNameEvent.f193658e.f193660a;
        GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new GetSafeDeviceTypeEvent();
        getSafeDeviceTypeEvent.publish();
        this.f196519o = getSafeDeviceTypeEvent.f78827d.f78828a;
        setMMTitle((int) C0966R.string.amc);
        setBackBtn(new C68391a());
        EditText editText = (EditText) findViewById(C0966R.C0970id.a_6);
        EditText editText2 = (EditText) findViewById(C0966R.C0970id.a_5);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), this.f196520p);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(144, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(144, this);
    }

    public void onResume() {
        super.onResume();
        initView();
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, ob0.C117747y r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onSceneEnd: errType = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " errCode = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " errMsg = "
            r3.append(r4)
            r4 = r26
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.VerifyQQUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            qo3.i0 r3 = r0.f196512e
            r6 = 0
            if (r3 == 0) goto L_0x0038
            r3.dismiss()
            r0.f196512e = r6
        L_0x0038:
            r3 = r27
            eg0.b r3 = (eg0.C75611b) r3
            r3.getClass()
            f40.e r7 = f40.C86709a0.m107523b()
            ob0.o0 r7 = r7.mo121113k()
            long r8 = r3.f222119f
            byte[] r7 = r7.mo182475e(r8)
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            byte[] r11 = new byte[r10]
            byte[] r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((byte[]) r7, (byte[]) r11)
            int r11 = r11.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9[r10] = r11
            long r11 = r3.f222119f
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 1
            r9[r12] = r11
            java.lang.String r11 = "MicroMsg.NetSceneBindQQ"
            java.lang.String r13 = "getRespImgBuf getWtloginMgr getVerifyImg:%d  uin:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r7)
            if (r9 == 0) goto L_0x0082
            ob0.c r7 = r3.f222118e
            ob0.c$d r7 = r7.f127056b
            pe3.a r7 = r7.f127083a
            te3.id r7 = (te3.C49829id) r7
            te3.qv3 r7 = r7.f135227e
            byte[] r7 = sf0.C48374j0.m53715d(r7)
        L_0x0082:
            r0.f196515h = r7
            ob0.c r3 = r3.f222118e
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            te3.id r3 = (te3.C49829id) r3
            java.lang.String r3 = r3.f135226d
            r0.f196516i = r3
            java.lang.String r3 = " "
            java.lang.String r9 = " img len"
            java.lang.String r11 = "imgSid:"
            if (r7 == 0) goto L_0x00bf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            java.lang.String r13 = r0.f196516i
            r7.append(r13)
            r7.append(r9)
            byte[] r13 = r0.f196515h
            int r13 = r13.length
            r7.append(r13)
            r7.append(r3)
            java.lang.String r13 = p206nj.C76861g.m92660c()
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r7)
        L_0x00bf:
            if (r1 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00e5
            java.lang.Class<om.f> r1 = p214om.C11502f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            om.f r1 = (p214om.C11502f) r1
            wc3.y r1 = r1.mo11461Sr()
            r1.mo93136Bk()
            androidx.appcompat.app.AppCompatActivity r1 = r23.getContext()
            r2 = 2131822570(0x7f1107ea, float:1.9277915E38)
            r3 = 2131822571(0x7f1107eb, float:1.9277917E38)
            com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$b r4 = new com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$b
            r4.<init>()
            nj3.C76879j.m92742m(r1, r2, r3, r4)
            return
        L_0x00e5:
            r7 = 4
            if (r1 != r7) goto L_0x01f6
            r7 = -311(0xfffffffffffffec9, float:NaN)
            if (r2 == r7) goto L_0x015a
            r7 = -310(0xfffffffffffffeca, float:NaN)
            if (r2 == r7) goto L_0x015a
            r7 = -72
            r13 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r2 == r7) goto L_0x014f
            r7 = -34
            if (r2 == r7) goto L_0x0144
            r7 = -12
            r14 = 2131822567(0x7f1107e7, float:1.927791E38)
            if (r2 == r7) goto L_0x0139
            r7 = -6
            if (r2 == r7) goto L_0x015a
            r3 = -5
            if (r2 == r3) goto L_0x012e
            r3 = -4
            if (r2 == r3) goto L_0x0119
            r3 = -3
            if (r2 == r3) goto L_0x0119
            ei.a r3 = p148ei.C7660a.m7782a(r26)
            if (r3 == 0) goto L_0x01f6
            r3.mo8792b(r0, r6, r6)
            goto L_0x018b
        L_0x0119:
            ei.a r3 = p148ei.C7660a.m7782a(r26)
            if (r3 == 0) goto L_0x0123
            r3.mo8792b(r0, r6, r6)
            goto L_0x018b
        L_0x0123:
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            r4 = 2131822572(0x7f1107ec, float:1.927792E38)
            nj3.C76879j.m92738i(r3, r4, r14)
            goto L_0x018b
        L_0x012e:
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            r4 = 2131822564(0x7f1107e4, float:1.9277903E38)
            nj3.C76879j.m92738i(r3, r4, r13)
            goto L_0x018b
        L_0x0139:
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            r4 = 2131822563(0x7f1107e3, float:1.92779E38)
            nj3.C76879j.m92738i(r3, r4, r14)
            goto L_0x018b
        L_0x0144:
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            r4 = 2131822565(0x7f1107e5, float:1.9277905E38)
            nj3.C76879j.m92738i(r3, r4, r13)
            goto L_0x018b
        L_0x014f:
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            r4 = 2131822566(0x7f1107e6, float:1.9277907E38)
            nj3.C76879j.m92738i(r3, r4, r13)
            goto L_0x018b
        L_0x015a:
            byte[] r4 = r0.f196515h
            if (r4 == 0) goto L_0x0185
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r7 = r0.f196516i
            r4.append(r7)
            r4.append(r9)
            byte[] r7 = r0.f196515h
            int r7 = r7.length
            r4.append(r7)
            r4.append(r3)
            java.lang.String r7 = p206nj.C76861g.m92660c()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
        L_0x0185:
            boolean r4 = f40.C86709a0.m107522a()
            if (r4 != 0) goto L_0x018d
        L_0x018b:
            r3 = 1
            goto L_0x01f7
        L_0x018d:
            com.tencent.mm.ui.applet.SecurityImage r4 = r0.f196517j
            if (r4 != 0) goto L_0x01c1
            androidx.appcompat.app.AppCompatActivity r13 = r23.getContext()
            r14 = 2131834632(0x7f113708, float:1.930238E38)
            r15 = 0
            byte[] r3 = r0.f196515h
            java.lang.String r4 = r0.f196516i
            r18 = 0
            gg0.h0 r5 = new gg0.h0
            r5.<init>(r0)
            r20 = 0
            gg0.i0 r6 = new gg0.i0
            r6.<init>(r0)
            com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$c r7 = new com.tencent.mm.plugin.account.bind.ui.VerifyQQUI$c
            r7.<init>()
            r16 = r3
            r17 = r4
            r19 = r5
            r21 = r6
            r22 = r7
            com.tencent.mm.ui.applet.SecurityImage r3 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f196517j = r3
            goto L_0x018b
        L_0x01c1:
            byte[] r4 = r0.f196515h
            if (r4 == 0) goto L_0x01ec
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r7 = r0.f196516i
            r4.append(r7)
            r4.append(r9)
            byte[] r7 = r0.f196515h
            int r7 = r7.length
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = p206nj.C76861g.m92660c()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
        L_0x01ec:
            com.tencent.mm.ui.applet.SecurityImage r3 = r0.f196517j
            byte[] r4 = r0.f196515h
            java.lang.String r5 = r0.f196516i
            r3.mo177230b(r10, r4, r5, r6)
            goto L_0x018b
        L_0x01f6:
            r3 = 0
        L_0x01f7:
            if (r3 == 0) goto L_0x01fa
            return
        L_0x01fa:
            r3 = 2131830303(0x7f11261f, float:1.92936E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r4[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r4[r12] = r1
            java.lang.String r1 = r0.getString(r3, r4)
            android.widget.Toast r1 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.bind.p021ui.VerifyQQUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public boolean onSwipeBackFinish() {
        hideVKB();
        finish();
        return true;
    }
}
