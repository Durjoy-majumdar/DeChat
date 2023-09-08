package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ReaderAppOperationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.LeftSlideOptionStruct;
import com.tencent.p014mm.modelsimple.C40366p;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.storage.C19601c0;
import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C44654e1;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44663q0;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C75604z3;
import eb0.C97625j3;
import eb0.z3$$g;
import g62.C32330n;
import h81.C32735h;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p154fy.C87121j;
import p203mi.C34572d0;
import p214om.C11502f;
import p227rn.C22240c0;
import p227rn.C48053v;
import p248ug.C65347o0;
import p275xz.C79012e;
import p565ir.C60611o;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C47997p;
import rb0.C48009v0;
import sb0.C48340e;
import tc0.C48628g;
import tc0.C77885p;
import te3.C49618gw;
import te3.C49939j34;
import te3.C50052jy2;
import te3.C51018qv3;
import te3.C51163rv3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.d */
public class C44965d {

    /* renamed from: com.tencent.mm.ui.conversation.d$a */
    public class C44966a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f121974d;

        /* renamed from: e */
        public final /* synthetic */ PBool f121975e;

        /* renamed from: f */
        public final /* synthetic */ ProgressDialog f121976f;

        /* renamed from: g */
        public final /* synthetic */ String f121977g;

        /* renamed from: com.tencent.mm.ui.conversation.d$a$a */
        public class C44967a implements z3$$g {
            public C44967a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
                r0 = r0.f121976f;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo24603b() {
                /*
                    r2 = this;
                    com.tencent.mm.ui.conversation.d$a r0 = com.tencent.p014mm.p136ui.conversation.C44965d.C44966a.this
                    com.tencent.mm.pointers.PBool r1 = r0.f121975e
                    boolean r1 = r1.value
                    if (r1 != 0) goto L_0x0015
                    android.app.ProgressDialog r0 = r0.f121976f
                    if (r0 == 0) goto L_0x0015
                    boolean r0 = r0.isShowing()
                    if (r0 != 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r0 = 0
                    goto L_0x0016
                L_0x0015:
                    r0 = 1
                L_0x0016:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C44965d.C44966a.C44967a.mo24603b():boolean");
            }

            /* renamed from: c */
            public void mo24604c() {
                C48340e.m53661b(C44966a.this.f121977g, false, (z3$$g) null);
                ProgressDialog progressDialog = C44966a.this.f121976f;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        }

        public C44966a(String str, PBool pBool, ProgressDialog progressDialog, String str2) {
            this.f121974d = str;
            this.f121975e = pBool;
            this.f121976f = progressDialog;
            this.f121977g = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75604z3.m90836h(this.f121974d, new C44967a());
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(this.f121974d, 15);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$b */
    public class C44968b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f121979d;

        public C44968b(PBool pBool) {
            this.f121979d = pBool;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f121979d.value = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$c */
    public class C44969c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f121980d;

        /* renamed from: e */
        public final /* synthetic */ Context f121981e;

        /* renamed from: f */
        public final /* synthetic */ boolean f121982f;

        /* renamed from: g */
        public final /* synthetic */ String f121983g;

        /* renamed from: h */
        public final /* synthetic */ boolean f121984h;

        public C44969c(PBool pBool, Context context, boolean z, String str, boolean z2) {
            this.f121980d = pBool;
            this.f121981e = context;
            this.f121982f = z;
            this.f121983g = str;
            this.f121984h = z2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f121980d.value = true;
            C44965d.m49841a(this.f121981e, this.f121982f, this.f121983g);
            if (this.f121984h) {
                C115669n.INSTANCE.mo160131h(14553, 0, 4, this.f121983g);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$d */
    public class C44970d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f121985d;

        /* renamed from: e */
        public final /* synthetic */ PBool f121986e;

        /* renamed from: f */
        public final /* synthetic */ Context f121987f;

        /* renamed from: g */
        public final /* synthetic */ String f121988g;

        /* renamed from: h */
        public final /* synthetic */ C72976h2 f121989h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f121990i;

        /* renamed from: j */
        public final /* synthetic */ boolean f121991j;

        public C44970d(ProgressDialog progressDialog, PBool pBool, Context context, String str, C72976h2 h2Var, Runnable runnable, boolean z) {
            this.f121985d = progressDialog;
            this.f121986e = pBool;
            this.f121987f = context;
            this.f121988g = str;
            this.f121989h = h2Var;
            this.f121990i = runnable;
            this.f121991j = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f121985d.show();
            PBool pBool = this.f121986e;
            pBool.value = false;
            C44965d.m49843c(this.f121987f, this.f121988g, this.f121989h, pBool, this.f121985d);
            Runnable runnable = this.f121990i;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f121991j) {
                C115669n.INSTANCE.mo160131h(14553, 0, 3, this.f121988g);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$e */
    public class C44971e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f121992d;

        /* renamed from: e */
        public final /* synthetic */ String f121993e;

        /* renamed from: f */
        public final /* synthetic */ C72976h2 f121994f;

        /* renamed from: g */
        public final /* synthetic */ PBool f121995g;

        /* renamed from: h */
        public final /* synthetic */ ProgressDialog f121996h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f121997i;

        public C44971e(Context context, String str, C72976h2 h2Var, PBool pBool, ProgressDialog progressDialog, Runnable runnable) {
            this.f121992d = context;
            this.f121993e = str;
            this.f121994f = h2Var;
            this.f121995g = pBool;
            this.f121996h = progressDialog;
            this.f121997i = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C44965d.m49843c(this.f121992d, this.f121993e, this.f121994f, this.f121995g, this.f121996h);
            Runnable runnable = this.f121997i;
            if (runnable != null) {
                runnable.run();
            }
            if (C47984k.m53340n(this.f121993e)) {
                C47997p Cx0 = C48009v0.Cx0();
                Cx0.mo72789b(this.f121993e, 14, 0, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null, 0, Cx0.f128740i, (C49939j34) null);
            }
            if (C72996z1.m85841l5(this.f121993e)) {
                boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_delete_office_account_msg, 1) == 1;
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(1378, 1, 1, false);
                nVar.mo160131h(23601, WebViewUtilities.doUrlEncode(C19601c0.f55451f), Integer.valueOf(C19601c0.f55462q), Integer.valueOf(C19601c0.f55461p));
                if (z) {
                    C19625p0 Jx0 = C48009v0.Jx0();
                    Jx0.getClass();
                    ((C119157j) C119157j.f356862d).mo183879j(new C44663q0(Jx0), 10, "BizTimeLineInfoStorageDeleteThread");
                    C19607d1 Kx0 = C48009v0.Kx0();
                    Kx0.getClass();
                    ((C119157j) C119157j.f356862d).mo183879j(new C44654e1(Kx0), 10, "BizTimeLineInfoStorageDeleteThread");
                    ((C22240c0) C86312j.m106911c(C22240c0.class)).mo35411yU();
                }
            }
            if (C72996z1.m85813P4(this.f121993e)) {
                C44660i2 i2Var = (C44660i2) C97625j3.m125812b().mo105908w();
                i2Var.getClass();
                LinkedList<C72976h2> linkedList = new LinkedList<>();
                Cursor I = i2Var.mo69738I(5, (List<String>) null, "conversationboxservice", -1);
                if (I != null && I.getCount() > 0) {
                    while (I.moveToNext()) {
                        C72976h2 h2Var = new C72976h2();
                        h2Var.convertFrom(I);
                        linkedList.add(h2Var);
                    }
                    I.close();
                }
                for (C72976h2 h2Var2 : linkedList) {
                    ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48628g(h2Var2.getUsername(), ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(h2Var2.getUsername()).mo108774y2()));
                    C44965d.m49842b(this.f121992d, h2Var2.getUsername(), new PBool(), (ProgressDialog) null, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$f */
    public class C44972f implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f121998d;

        public C44972f(PBool pBool) {
            this.f121998d = pBool;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f121998d.value = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$g */
    public class C44973g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f121999d;

        /* renamed from: e */
        public final /* synthetic */ Context f122000e;

        /* renamed from: f */
        public final /* synthetic */ boolean f122001f;

        /* renamed from: g */
        public final /* synthetic */ String f122002g;

        /* renamed from: h */
        public final /* synthetic */ boolean f122003h;

        public C44973g(PBool pBool, Context context, boolean z, String str, boolean z2) {
            this.f121999d = pBool;
            this.f122000e = context;
            this.f122001f = z;
            this.f122002g = str;
            this.f122003h = z2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f121999d.value = true;
            C44965d.m49841a(this.f122000e, this.f122001f, this.f122002g);
            if (this.f122003h) {
                C115669n.INSTANCE.mo160131h(14553, 1, 4, this.f122002g);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$h */
    public class C44974h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f122004d;

        /* renamed from: e */
        public final /* synthetic */ PBool f122005e;

        /* renamed from: f */
        public final /* synthetic */ Context f122006f;

        /* renamed from: g */
        public final /* synthetic */ String f122007g;

        /* renamed from: h */
        public final /* synthetic */ boolean f122008h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f122009i;

        public C44974h(ProgressDialog progressDialog, PBool pBool, Context context, String str, boolean z, Runnable runnable) {
            this.f122004d = progressDialog;
            this.f122005e = pBool;
            this.f122006f = context;
            this.f122007g = str;
            this.f122008h = z;
            this.f122009i = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f122004d.show();
            PBool pBool = this.f122005e;
            pBool.value = false;
            C44965d.m49842b(this.f122006f, this.f122007g, pBool, this.f122004d, true);
            if (this.f122008h) {
                C115669n.INSTANCE.mo160131h(14553, 1, 3, this.f122007g);
            }
            Runnable runnable = this.f122009i;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$i */
    public class C44975i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f122010d;

        /* renamed from: e */
        public final /* synthetic */ String f122011e;

        /* renamed from: f */
        public final /* synthetic */ PBool f122012f;

        /* renamed from: g */
        public final /* synthetic */ ProgressDialog f122013g;

        /* renamed from: h */
        public final /* synthetic */ Runnable f122014h;

        public C44975i(Context context, String str, PBool pBool, ProgressDialog progressDialog, Runnable runnable) {
            this.f122010d = context;
            this.f122011e = str;
            this.f122012f = pBool;
            this.f122013g = progressDialog;
            this.f122014h = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C44965d.m49842b(this.f122010d, this.f122011e, this.f122012f, this.f122013g, true);
            Runnable runnable = this.f122014h;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$j */
    public class C44976j implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f122015d;

        public C44976j(PBool pBool) {
            this.f122015d = pBool;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f122015d.value = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$k */
    public class C44977k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f122016d;

        /* renamed from: e */
        public final /* synthetic */ String f122017e;

        /* renamed from: f */
        public final /* synthetic */ C72976h2 f122018f;

        /* renamed from: g */
        public final /* synthetic */ PBool f122019g;

        /* renamed from: h */
        public final /* synthetic */ ProgressDialog f122020h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f122021i;

        public C44977k(Context context, String str, C72976h2 h2Var, PBool pBool, ProgressDialog progressDialog, Runnable runnable) {
            this.f122016d = context;
            this.f122017e = str;
            this.f122018f = h2Var;
            this.f122019g = pBool;
            this.f122020h = progressDialog;
            this.f122021i = runnable;
        }

        public void run() {
            C44965d.m49843c(this.f122016d, this.f122017e, this.f122018f, this.f122019g, this.f122020h);
            Runnable runnable = this.f122021i;
            if (runnable != null) {
                runnable.run();
            }
            if (C47984k.m53340n(this.f122017e)) {
                C47997p Cx0 = C48009v0.Cx0();
                Cx0.mo72789b(this.f122017e, 14, 0, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null, 0, Cx0.f128740i, (C49939j34) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$l */
    public class C44978l implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f122022d;

        public C44978l(Runnable runnable) {
            this.f122022d = runnable;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f122022d.run();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$m */
    public class C44979m implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f122023d;

        /* renamed from: e */
        public final /* synthetic */ String f122024e;

        /* renamed from: f */
        public final /* synthetic */ PBool f122025f;

        /* renamed from: g */
        public final /* synthetic */ ProgressDialog f122026g;

        /* renamed from: h */
        public final /* synthetic */ String f122027h;

        /* renamed from: com.tencent.mm.ui.conversation.d$m$a */
        public class C44980a implements z3$$g {
            public C44980a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
                r0 = r0.f122026g;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo24603b() {
                /*
                    r2 = this;
                    com.tencent.mm.ui.conversation.d$m r0 = com.tencent.p014mm.p136ui.conversation.C44965d.C44979m.this
                    com.tencent.mm.pointers.PBool r1 = r0.f122025f
                    boolean r1 = r1.value
                    if (r1 != 0) goto L_0x0015
                    android.app.ProgressDialog r0 = r0.f122026g
                    if (r0 == 0) goto L_0x0015
                    boolean r0 = r0.isShowing()
                    if (r0 != 0) goto L_0x0013
                    goto L_0x0015
                L_0x0013:
                    r0 = 0
                    goto L_0x0016
                L_0x0015:
                    r0 = 1
                L_0x0016:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C44965d.C44979m.C44980a.mo24603b():boolean");
            }

            /* renamed from: c */
            public void mo24604c() {
                C48340e.m53661b(C44979m.this.f122027h, false, (z3$$g) null);
                ProgressDialog progressDialog = C44979m.this.f122026g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }
        }

        public C44979m(Runnable runnable, String str, PBool pBool, ProgressDialog progressDialog, String str2) {
            this.f122023d = runnable;
            this.f122024e = str;
            this.f122025f = pBool;
            this.f122026g = progressDialog;
            this.f122027h = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f122023d.run();
            C75604z3.m90836h(this.f122024e, new C44980a());
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(this.f122024e, 15);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d$n */
    public class C44981n implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ PBool f122029d;

        public C44981n(PBool pBool) {
            this.f122029d = pBool;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f122029d.value = true;
        }
    }

    /* renamed from: a */
    public static void m49841a(Context context, boolean z, String str) {
        if (!z) {
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.startChatting(str, (Bundle) null, true);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("chat_from_scene", 4);
        C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    /* renamed from: b */
    public static void m49842b(Context context, String str, PBool pBool, ProgressDialog progressDialog, boolean z) {
        m49845e(str);
        if (z && C85875k4.m106208w()) {
            C88144b.m109801s(context, ".ui.EmptyActivity", new Intent(), (Bundle) null);
            Log.m105924i("MicroMsg.ConvDelLogic", "start empty activity");
        }
        C34572d0.m40394e(str);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93168a(str);
        ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG(str);
        C75604z3.m90836h(str, new C44985f(pBool, progressDialog, str));
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
    }

    /* renamed from: c */
    public static void m49843c(Context context, String str, C72976h2 h2Var, PBool pBool, ProgressDialog progressDialog) {
        m49845e(str);
        if (C85875k4.m106208w()) {
            C88144b.m109801s(context, ".ui.EmptyActivity", new Intent(), (Bundle) null);
            Log.m105924i("MicroMsg.ConvDelLogic", "start empty activity");
        }
        C75604z3.m90836h(str, new C44983e(pBool, progressDialog));
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93168a(str);
        ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG(str);
        C72996z1 y3 = C97625j3.m125812b().mo105907v().mo69730y3(str);
        if (y3 == null || !y3.mo62916m3() || Util.isEqual(y3.mo62913l2(), y3.getUsername())) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            z1Var.setType(z1Var.getType() & -3);
            z1Var.setType(z1Var.getType() & -2049);
            if (z1Var.mo62916m3() && C47984k.m53340n(str)) {
                C115669n.INSTANCE.mo160131h(13773, 0, Integer.valueOf(h2Var.mo108786G2()), 1, h2Var.getUsername());
            }
            C50052jy2 jy22 = new C50052jy2();
            Log.m105925i("MicroMsg.ConvDelLogic", "oplog modContact user:%s remark:%s type:%d ", z1Var.getUsername(), z1Var.mo73969n2(), Integer.valueOf(z1Var.getType()));
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = Util.nullAsNil(z1Var.getUsername());
            rv32.f141176e = true;
            jy22.f136424d = rv32;
            C51163rv3 rv33 = new C51163rv3();
            rv33.f141175d = Util.nullAsNil(z1Var.getNickname());
            rv33.f141176e = true;
            jy22.f136426e = rv33;
            C51163rv3 rv34 = new C51163rv3();
            rv34.f141175d = Util.nullAsNil(z1Var.mo62942y2());
            rv34.f141176e = true;
            jy22.f136428f = rv34;
            C51163rv3 rv35 = new C51163rv3();
            rv35.f141175d = Util.nullAsNil(z1Var.mo62945z2());
            rv35.f141176e = true;
            jy22.f136430g = rv35;
            jy22.f136432h = z1Var.f149500H;
            jy22.f136436j = -90206337;
            jy22.f136441n = z1Var.getType();
            jy22.f136457u1 = 1;
            jy22.f136459v1 = z1Var.mo73951C2();
            C51163rv3 rv36 = new C51163rv3();
            rv36.f141175d = Util.nullAsNil(z1Var.mo73969n2());
            rv36.f141176e = true;
            jy22.f136445p = rv36;
            C51163rv3 rv37 = new C51163rv3();
            rv37.f141175d = Util.nullAsNil(z1Var.mo73971p2());
            rv37.f141176e = true;
            jy22.f136448q = rv37;
            C51163rv3 rv38 = new C51163rv3();
            rv38.f141175d = Util.nullAsNil(z1Var.mo73970o2());
            rv38.f141176e = true;
            jy22.f136450r = rv38;
            jy22.f136452s = z1Var.f149507P;
            C51163rv3 rv39 = new C51163rv3();
            rv39.f141175d = Util.nullAsNil(z1Var.mo73977u2());
            rv39.f141176e = true;
            jy22.f136458v = rv39;
            jy22.f136460w = z1Var.f149512S;
            jy22.f136387B = z1Var.f149514T;
            jy22.f136386A = Util.nullAsNil(z1Var.f149516U);
            jy22.f136466z = Util.nullAsNil(z1Var.mo101228F4());
            jy22.f136464y = Util.nullAsNil(z1Var.mo101230H4());
            jy22.f136393H = Util.nullAsNil(z1Var.f149545p0);
            jy22.f136398M = z1Var.mo73955G2();
            jy22.f136443o = 0;
            jy22.f136434i = new C51018qv3();
            jy22.f136405S = Util.nullAsNil(z1Var.mo101229G4());
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(2, jy22));
            C97625j3.m125812b().mo105907v().mo69719p3(str, z1Var);
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str);
            if (j == null) {
                return;
            }
            if (j.mo108372k3(4194304) || (z1Var.mo62916m3() && !z1Var.mo62927s3() && j.mo108821o2() < C48009v0.Nx0())) {
                C97625j3.m125815e().mo123460f(new C40366p(str, (byte[]) null));
                return;
            }
            return;
        }
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str);
        C97625j3.m125812b().mo105907v().mo69688c(str);
    }

    /* renamed from: d */
    public static void m49844d(String str, Context context, C72976h2 h2Var, boolean z, Runnable runnable, boolean z2, boolean z3) {
        String str2 = str;
        Context context2 = context;
        Class cls = C48053v.class;
        Class cls2 = C79012e.class;
        Class cls3 = C87121j.class;
        PBool pBool = new PBool();
        if (C72996z1.m85820U5(str)) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48628g(str2, ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str2).mo108774y2()));
            pBool.value = false;
            C89779i0 Q = C76879j.m92723Q(context, context2.getString(C0966R.string.a3h), context2.getString(C0966R.string.a4d), true, true, new C44972f(pBool));
            String rk02 = (pBool.value || !z) ? null : ((C79012e) C86312j.m106911c(cls2)).rk0(str2);
            if (!Util.isNullOrNil(rk02)) {
                Q.dismiss();
                String str3 = str;
                boolean z4 = z2;
                C76879j.m92718L(context, false, context2.getString(C0966R.string.kqp, new Object[]{rk02}), (String) null, context2.getString(C0966R.string.fey), context2.getString(C0966R.string.bxt), new C44973g(pBool, context, z3, str3, z4), new C44974h(Q, pBool, context, str3, z4, runnable), -1, C0966R.color.f3041d1);
            } else {
                Q.dismiss();
                C76879j.m92708B(context, context2.getString(C0966R.string.eyr), "", context2.getString(C0966R.string.f7944x1), context2.getString(C0966R.string.f7926wf), new C44975i(context, str, pBool, Q, runnable), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
            }
        } else if (C72996z1.m85853x5(str)) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i(str2);
            ReaderAppOperationEvent readerAppOperationEvent = new ReaderAppOperationEvent();
            ReaderAppOperationEvent.C67767a aVar = readerAppOperationEvent.f193863d;
            aVar.f193865a = 4;
            aVar.f193869e = 20;
            readerAppOperationEvent.publish();
            ((C87121j) C86312j.m106911c(cls3)).mo71213Ot(str2, 15);
        } else if (C72996z1.m85827Y4(str)) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i(str2);
            ((C87121j) C86312j.m106911c(cls3)).mo71213Ot(str2, 15);
        } else if (C72996z1.m85836g5(str)) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str2);
            ((C87121j) C86312j.m106911c(cls3)).mo71213Ot(str2, 15);
        } else if (((C48053v) C86312j.m106911c(cls)).mo72617gl(str2)) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48628g(str2, ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str2).mo108774y2()));
            pBool.value = false;
            String string = context2.getString(C0966R.string.a3h);
            String string2 = context2.getString(C0966R.string.a4d);
            C44976j jVar = new C44976j(pBool);
            int i = C0966R.string.eyo;
            C89779i0 Q2 = C76879j.m92723Q(context, string, string2, true, true, jVar);
            String TE = C48009v0.Fx0().mo72758TE(str2);
            C44977k kVar = r0;
            C44977k kVar2 = new C44977k(context, str, h2Var, pBool, Q2, runnable);
            Q2.dismiss();
            if (Util.isNullOrNil(TE)) {
                if (C72996z1.m85841l5(str)) {
                    i = C0966R.string.eyp;
                }
                C76879j.m92708B(context, context2.getString(i), "", context2.getString(C0966R.string.f7944x1), context2.getString(C0966R.string.f7926wf), new C44978l(kVar), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
            } else {
                C76879j.m92708B(context, context2.getString(C0966R.string.eyo), "", context2.getString(C0966R.string.f7944x1), context2.getString(C0966R.string.f7926wf), new C44979m(kVar, str, pBool, Q2, TE), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
            }
        } else if (((C48053v) C86312j.m106911c(cls)).mo72614OE(str2)) {
            pBool.value = false;
            C89779i0 Q3 = C76879j.m92723Q(context, context2.getString(C0966R.string.a3h), context2.getString(C0966R.string.a4d), true, true, new C44981n(pBool));
            Q3.dismiss();
            C76879j.m92708B(context, context2.getString(C0966R.string.eyo), "", context2.getString(C0966R.string.f7944x1), context2.getString(C0966R.string.f7926wf), new C44966a(str2, pBool, Q3, str2), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
        } else {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48628g(str2, ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str2).mo108774y2()));
            pBool.value = false;
            C89779i0 Q4 = C76879j.m92723Q(context, context2.getString(C0966R.string.a3h), context2.getString(C0966R.string.a4d), true, true, new C44968b(pBool));
            String rk03 = (pBool.value || !z) ? null : ((C79012e) C86312j.m106911c(cls2)).rk0(str2);
            if (!Util.isNullOrNil(rk03)) {
                Q4.dismiss();
                String str4 = str;
                C76879j.m92718L(context, false, context2.getString(C0966R.string.kqp, new Object[]{rk03}), (String) null, context2.getString(C0966R.string.fey), context2.getString(C0966R.string.bxt), new C44969c(pBool, context, z3, str4, z2), new C44970d(Q4, pBool, context, str4, h2Var, runnable, z2), -1, C0966R.color.f3041d1);
            } else {
                Q4.dismiss();
                C76879j.m92708B(context, context2.getString(C72996z1.m85841l5(str) ? C0966R.string.eyp : C72996z1.m85813P4(str) ? C0966R.string.eyq : C0966R.string.eyo), "", context2.getString(C0966R.string.f7944x1), context2.getString(C0966R.string.f7926wf), new C44971e(context, str, h2Var, pBool, Q4, runnable), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
            }
        }
        if (C72996z1.m85850u5(str)) {
            Log.m105924i("MicroMsg.ConvDelLogic", "del all qmessage");
            C75604z3.m90831c();
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i("@qqim");
        } else if (C72996z1.m85838i5(str)) {
            Log.m105924i("MicroMsg.ConvDelLogic", "del all tmessage");
            C75604z3.m90832d();
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i("@t.qq.com");
        } else if (C72996z1.m85840k5(str)) {
            Log.m105924i("MicroMsg.ConvDelLogic", "del all notify message");
            ((C60611o) C86312j.m106911c(C60611o.class)).Y10();
        }
    }

    /* renamed from: e */
    public static void m49845e(String str) {
        C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
        if (j != null) {
            LeftSlideOptionStruct leftSlideOptionStruct = new LeftSlideOptionStruct();
            leftSlideOptionStruct.f107964d = 15;
            leftSlideOptionStruct.f107965e = leftSlideOptionStruct.mo86045b("SessionName", str, true);
            leftSlideOptionStruct.f107967g = (long) C45629t0.m50816c(str);
            leftSlideOptionStruct.f107966f = (long) j.mo108786G2();
            leftSlideOptionStruct.mo86054n();
        }
    }
}
