package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import f40.C86709a0;
import gg0.C116952d0;
import nj3.C76879j;
import ob0.C11385n;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.g */
public class C114893g implements C11385n {

    /* renamed from: d */
    public Context f344391d;

    /* renamed from: e */
    public View f344392e = null;

    /* renamed from: f */
    public C89779i0 f344393f = null;

    /* renamed from: g */
    public SecurityImage f344394g = null;

    /* renamed from: h */
    public String f344395h = "";

    /* renamed from: i */
    public byte[] f344396i = null;

    /* renamed from: j */
    public String f344397j = "";

    /* renamed from: n */
    public C114896c f344398n;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.g$a */
    public class C114894a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f344399d;

        public C114894a(EditText editText) {
            this.f344399d = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C114893g.this.getClass();
            C114893g gVar = C114893g.this;
            String trim = this.f344399d.getText().toString().trim();
            gVar.getClass();
            C86709a0.m107524d().mo123455a(384, gVar);
            gVar.f344395h = trim;
            Context context = gVar.f344391d;
            gVar.f344393f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), gVar.f344391d.getString(C0966R.string.ilx), true, true, new C116952d0(gVar));
            C86709a0.m107524d().mo123460f(new C1307j0(5, gVar.f344395h, "", "", "", false, 1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.g$b */
    public class C114895b implements DialogInterface.OnClickListener {
        public C114895b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C114893g.this.getClass();
            C114893g.this.mo174580b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.g$c */
    public interface C114896c {
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.g$d */
    public class C114897d extends SecurityImage.C116049b {
        public C114897d() {
        }

        /* renamed from: a */
        public void mo93941a() {
            C114893g gVar = C114893g.this;
            gVar.getClass();
            C86709a0.m107524d().mo123455a(384, gVar);
            C114893g gVar2 = C114893g.this;
            C86709a0.m107524d().mo123460f(new C1307j0(5, gVar2.f344395h, gVar2.f344394g.getSecImgSid(), C114893g.this.f344394g.getSecImgCode(), C114893g.this.f344394g.getSecImgEncryptKey(), true, 1));
        }

        /* renamed from: b */
        public void mo93942b() {
        }
    }

    public C114893g(Context context, C114896c cVar) {
        this.f344391d = context;
        this.f344398n = cVar;
    }

    /* renamed from: a */
    public void mo174579a() {
        View inflate = View.inflate(this.f344391d, C0966R.C0971layout.bwn, (ViewGroup) null);
        this.f344392e = inflate;
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.jc6);
        editText.setHint(C0966R.string.ama);
        C114894a aVar = new C114894a(editText);
        C114895b bVar = new C114895b();
        Context context = this.f344391d;
        C76879j.m92753x(context, context.getString(C0966R.string.am6), (String) null, this.f344392e, aVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = (com.tencent.p014mm.plugin.account.bind.p021ui.NeedVerifyQQEventListener) r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo174580b() {
        /*
            r4 = this;
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 384(0x180, float:5.38E-43)
            r0.mo123470p(r1, r4)
            com.tencent.mm.plugin.account.bind.ui.g$c r0 = r4.f344398n
            if (r0 == 0) goto L_0x0024
            com.tencent.mm.plugin.account.bind.ui.NeedVerifyQQEventListener r0 = (com.tencent.p014mm.plugin.account.bind.p021ui.NeedVerifyQQEventListener) r0
            com.tencent.mm.autogen.events.NeedVerifyQQEvent r1 = r0.f344390d
            if (r1 == 0) goto L_0x0024
            com.tencent.mm.autogen.events.NeedVerifyQQEvent$a r2 = r1.f236243d
            java.lang.Runnable r2 = r2.f236246b
            if (r2 == 0) goto L_0x0024
            com.tencent.mm.autogen.events.NeedVerifyQQEvent$b r1 = r1.f236244e
            r3 = 0
            r1.f236247a = r3
            r2.run()
            r1 = 0
            r0.f344390d = r1
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.bind.p021ui.C114893g.mo174580b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r17.mo174580b()
            if (r21 == 0) goto L_0x0140
            int r3 = r21.getType()
            r4 = 384(0x180, float:5.38E-43)
            if (r3 == r4) goto L_0x0015
            goto L_0x0140
        L_0x0015:
            qo3.i0 r3 = r0.f344393f
            r4 = 0
            if (r3 == 0) goto L_0x001f
            r3.dismiss()
            r0.f344393f = r4
        L_0x001f:
            r3 = r21
            com.tencent.mm.modelsimple.j0 r3 = (com.tencent.p014mm.modelsimple.C1307j0) r3
            ob0.c r5 = r3.f10428e
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            te3.cq4 r5 = (te3.cq4) r5
            te3.rv3 r5 = r5.f131902d
            java.lang.String r5 = sf0.C48374j0.m53718g(r5)
            r0.f344397j = r5
            ob0.c r5 = r3.f10428e
            ob0.c$d r5 = r5.f127056b
            pe3.a r5 = r5.f127083a
            te3.cq4 r5 = (te3.cq4) r5
            te3.qv3 r6 = r5.f131909n
            if (r6 == 0) goto L_0x0052
            int r6 = r6.f140572d
            if (r6 <= 0) goto L_0x0052
            f40.e r5 = f40.C86709a0.m107523b()
            ob0.o0 r5 = r5.mo121113k()
            long r6 = r3.f10429f
            byte[] r3 = r5.mo182475e(r6)
            goto L_0x0058
        L_0x0052:
            te3.qv3 r3 = r5.f131903e
            byte[] r3 = sf0.C48374j0.m53715d(r3)
        L_0x0058:
            r0.f344396i = r3
            com.tencent.mm.plugin.account.bind.ui.g$c r3 = r0.f344398n
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x008d
            com.tencent.mm.plugin.account.bind.ui.NeedVerifyQQEventListener r3 = (com.tencent.p014mm.plugin.account.bind.p021ui.NeedVerifyQQEventListener) r3
            com.tencent.mm.autogen.events.NeedVerifyQQEvent r7 = r3.f344390d
            if (r7 != 0) goto L_0x0068
        L_0x0066:
            r3 = 0
            goto L_0x008a
        L_0x0068:
            com.tencent.mm.autogen.events.NeedVerifyQQEvent$a r8 = r7.f236243d
            java.lang.Runnable r8 = r8.f236246b
            if (r8 != 0) goto L_0x0071
            r3.f344390d = r4
            goto L_0x0066
        L_0x0071:
            if (r1 != 0) goto L_0x0080
            if (r2 != 0) goto L_0x0080
            com.tencent.mm.autogen.events.NeedVerifyQQEvent$b r7 = r7.f236244e
            r7.f236247a = r5
            r8.run()
            r3.f344390d = r4
            r3 = 1
            goto L_0x008a
        L_0x0080:
            com.tencent.mm.autogen.events.NeedVerifyQQEvent$b r7 = r7.f236244e
            r7.f236247a = r6
            r8.run()
            r3.f344390d = r4
            goto L_0x0066
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            return
        L_0x008d:
            android.content.Context r3 = r0.f344391d
            boolean r7 = r3 instanceof android.app.Activity
            if (r7 == 0) goto L_0x00a2
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r7 = r3.isFinishing()
            if (r7 != 0) goto L_0x00a1
            boolean r3 = r3.isDestroyed()
            if (r3 == 0) goto L_0x00a2
        L_0x00a1:
            return
        L_0x00a2:
            r3 = 4
            if (r1 != r3) goto L_0x0135
            r1 = -311(0xfffffffffffffec9, float:NaN)
            if (r2 == r1) goto L_0x00fe
            r1 = -310(0xfffffffffffffeca, float:NaN)
            if (r2 == r1) goto L_0x00fe
            r1 = -72
            r3 = 2131821704(0x7f110488, float:1.9276159E38)
            if (r2 == r1) goto L_0x00f5
            r1 = -34
            if (r2 == r1) goto L_0x00e2
            r1 = -6
            if (r2 == r1) goto L_0x00fe
            r1 = -3
            if (r2 == r1) goto L_0x00ca
            ei.a r1 = p148ei.C7660a.m7782a(r20)
            if (r1 == 0) goto L_0x0134
            android.content.Context r2 = r0.f344391d
            r1.mo8792b(r2, r4, r4)
            return
        L_0x00ca:
            gg0.e0 r1 = new gg0.e0
            r1.<init>(r0)
            android.content.Context r2 = r0.f344391d
            r5 = 2131822572(0x7f1107ec, float:1.927792E38)
            java.lang.String r5 = r2.getString(r5)
            android.content.Context r6 = r0.f344391d
            java.lang.String r3 = r6.getString(r3)
            nj3.C76879j.m92750u(r2, r5, r3, r1, r4)
            goto L_0x0134
        L_0x00e2:
            android.content.Context r1 = r0.f344391d
            r2 = 2131822565(0x7f1107e5, float:1.9277905E38)
            java.lang.String r2 = r1.getString(r2)
            android.content.Context r4 = r0.f344391d
            java.lang.String r3 = r4.getString(r3)
            nj3.C76879j.m92712F(r1, r2, r3, r5)
            goto L_0x0134
        L_0x00f5:
            android.content.Context r1 = r0.f344391d
            r2 = 2131823595(0x7f110beb, float:1.9279994E38)
            nj3.C76879j.m92738i(r1, r2, r3)
            goto L_0x0134
        L_0x00fe:
            boolean r1 = f40.C86709a0.m107522a()
            if (r1 != 0) goto L_0x0105
            goto L_0x0134
        L_0x0105:
            com.tencent.mm.ui.applet.SecurityImage r1 = r0.f344394g
            if (r1 != 0) goto L_0x012d
            android.content.Context r7 = r0.f344391d
            r8 = 2131834632(0x7f113708, float:1.930238E38)
            r9 = 0
            byte[] r10 = r0.f344396i
            java.lang.String r11 = r0.f344397j
            r12 = 0
            gg0.f0 r13 = new gg0.f0
            r13.<init>(r0)
            r14 = 0
            gg0.g0 r15 = new gg0.g0
            r15.<init>(r0)
            com.tencent.mm.plugin.account.bind.ui.g$d r1 = new com.tencent.mm.plugin.account.bind.ui.g$d
            r1.<init>()
            r16 = r1
            com.tencent.mm.ui.applet.SecurityImage r1 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f344394g = r1
            goto L_0x0134
        L_0x012d:
            byte[] r2 = r0.f344396i
            java.lang.String r3 = r0.f344397j
            r1.mo177230b(r6, r2, r3, r4)
        L_0x0134:
            return
        L_0x0135:
            ei.a r1 = p148ei.C7660a.m7782a(r20)
            if (r1 == 0) goto L_0x0140
            android.content.Context r2 = r0.f344391d
            r1.mo8792b(r2, r4, r4)
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.bind.p021ui.C114893g.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
