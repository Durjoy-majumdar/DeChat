package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C85647p1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ji3.C9457a;
import ke3.C88144b;
import kg3.C76577a;
import nd3.C47223a;
import nj3.C76879j;
import p159gw.C45962f;
import p237sp.C13754y;

/* renamed from: com.tencent.mm.ui.chatting.s2 */
public class C73843s2 {

    /* renamed from: a */
    public SharedPreferences f216686a;

    /* renamed from: b */
    public Context f216687b;

    /* renamed from: c */
    public ChatFooterCustom f216688c;

    /* renamed from: d */
    public LinearLayout f216689d = null;

    /* renamed from: e */
    public FrameLayout f216690e;

    /* renamed from: f */
    public FrameLayout f216691f;

    /* renamed from: g */
    public TextView f216692g;

    /* renamed from: h */
    public ImageView f216693h;

    /* renamed from: i */
    public C73845d f216694i = C73845d.DEFAULT;

    /* renamed from: j */
    public int f216695j = -1;

    /* renamed from: k */
    public boolean f216696k;

    /* renamed from: l */
    public String f216697l;

    /* renamed from: m */
    public String f216698m;

    /* renamed from: n */
    public String f216699n;

    /* renamed from: o */
    public String f216700o = null;

    /* renamed from: p */
    public long f216701p = -1;

    /* renamed from: q */
    public String f216702q;

    /* renamed from: r */
    public View.OnClickListener f216703r = new C6795a();

    /* renamed from: s */
    public View.OnClickListener f216704s = new C6796b();

    /* renamed from: t */
    public C85647p1.C85652e f216705t = new C73844c();

    /* renamed from: com.tencent.mm.ui.chatting.s2$a */
    public class C6795a implements View.OnClickListener {
        public C6795a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            new Intent().putExtra("composeType", 1);
            C88144b.m109789g(C73843s2.this.f216687b, "qqmail", ".ui.ComposeUI");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.s2$b */
    public class C6796b implements View.OnClickListener {
        public C6796b() {
        }

        public void onClick(View view) {
            Intent intent;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int ordinal = C73843s2.this.f216694i.ordinal();
            if (ordinal == 1) {
                C115669n.INSTANCE.mo160131h(11288, 6);
                C73843s2 s2Var = C73843s2.this;
                if (!NetStatusUtil.isConnected(s2Var.f216687b)) {
                    Context context = s2Var.f216687b;
                    C76879j.m92754y(context, C76577a.m92166q(context, C0966R.string.b5n), "", C76577a.m92166q(s2Var.f216687b, C0966R.string.b5i), (DialogInterface.OnClickListener) null);
                } else if (!NetStatusUtil.isWifi(s2Var.f216687b)) {
                    C76879j.m92739j(s2Var.f216687b, C0966R.string.b5k, 0, C0966R.string.b5g, C0966R.string.b5f, new C6799t2(s2Var), (DialogInterface.OnClickListener) null);
                } else {
                    C76879j.m92739j(s2Var.f216687b, C0966R.string.b5l, 0, C0966R.string.b5g, C0966R.string.b5f, new C6802u2(s2Var), (DialogInterface.OnClickListener) null);
                }
            } else if (ordinal == 2) {
                C73843s2 s2Var2 = C73843s2.this;
                s2Var2.getClass();
                Log.m105924i("MicroMsg.ChattingQQMailFooterHandler", "dz[cancelDownload]");
                ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(s2Var2.f216701p);
                s2Var2.mo102880b();
            } else if (ordinal == 3) {
                C115669n.INSTANCE.mo160131h(11288, 7);
                C73843s2 s2Var3 = C73843s2.this;
                s2Var3.getClass();
                Log.m105924i("MicroMsg.ChattingQQMailFooterHandler", "dz[installQQMail]");
                ((C45962f) C86312j.m106911c(C45962f.class)).go0(s2Var3.f216687b, s2Var3.f216700o, (C47223a) null, false);
            } else if (ordinal == 4) {
                C115669n.INSTANCE.mo160131h(11288, 5);
                C73843s2 s2Var4 = C73843s2.this;
                s2Var4.getClass();
                Log.m105924i("MicroMsg.ChattingQQMailFooterHandler", "dz[openQQMail]");
                Log.m105925i("MicroMsg.ChattingQQMailFooterHandler", "mQQMailScheme = %s", s2Var4.f216702q);
                if (Util.isNullOrNil(s2Var4.f216702q)) {
                    intent = s2Var4.f216687b.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                } else {
                    intent = new Intent();
                    intent.setData(Uri.parse(s2Var4.f216702q));
                    intent.addFlags(268435456);
                    intent.addFlags(32768);
                    if (!Util.isIntentAvailable(s2Var4.f216687b, intent, false)) {
                        intent = s2Var4.f216687b.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
                    }
                }
                Log.m105925i("MicroMsg.ChattingQQMailFooterHandler", "intent = %s", intent);
                C9457a.m9137a(new C6803v2(s2Var4, intent));
            } else if (ordinal == 5) {
                C73843s2 s2Var5 = C73843s2.this;
                if (s2Var5.f216696k) {
                    C73843s2.m87479a(s2Var5);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.s2$c */
    public class C73844c implements C85647p1.C85652e {
        public C73844c() {
        }

        /* renamed from: a */
        public void mo102882a() {
            C73843s2.this.f216692g.setText(C0966R.string.b5q);
        }

        public void onSuccess(int i) {
            C73843s2 s2Var = C73843s2.this;
            s2Var.f216695j = i;
            s2Var.mo102881c();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.s2$d */
    public enum C73845d {
        DEFAULT,
        NEED_DOWNLOAD,
        DOWNLOADING,
        NEED_INSTALL,
        INSTALLED,
        NO_URL
    }

    public C73843s2(ChatFooterCustom chatFooterCustom) {
        this.f216687b = chatFooterCustom.getContext();
        this.f216688c = chatFooterCustom;
    }

    /* renamed from: a */
    public static void m87479a(C73843s2 s2Var) {
        s2Var.getClass();
        Log.m105924i("MicroMsg.ChattingQQMailFooterHandler", "dz[handleNoUrl]");
        Context context = s2Var.f216687b;
        C76879j.m92754y(context, C76577a.m92166q(context, C0966R.string.b5m), "", C76577a.m92166q(s2Var.f216687b, C0966R.string.b5i), (DialogInterface.OnClickListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f216697l) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f216697l) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f216697l) != false) goto L_0x0075;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102880b() {
        /*
            r11 = this;
            com.tencent.mm.ui.chatting.s2$d r0 = com.tencent.p014mm.p136ui.chatting.C73843s2.C73845d.INSTALLED
            com.tencent.mm.ui.chatting.s2$d r1 = com.tencent.p014mm.p136ui.chatting.C73843s2.C73845d.NO_URL
            com.tencent.mm.ui.chatting.s2$d r2 = com.tencent.p014mm.p136ui.chatting.C73843s2.C73845d.NEED_DOWNLOAD
            android.content.Context r3 = r11.f216687b
            java.lang.String r4 = "com.tencent.androidqqmail"
            boolean r3 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r3, r4)
            r4 = 3
            r5 = 4
            r6 = 1
            if (r3 == 0) goto L_0x0015
            r1 = r0
            goto L_0x0075
        L_0x0015:
            android.content.Context r3 = r11.f216687b
            java.lang.String r7 = "QQMAIL"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r7, r5)
            r11.f216686a = r3
            r7 = -1
            java.lang.String r9 = "qqmail_downloadid"
            long r7 = r3.getLong(r9, r7)
            r11.f216701p = r7
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0038
            java.lang.String r3 = r11.f216697l
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0038:
            java.lang.Class<sp.y> r3 = p237sp.C13754y.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            sp.y r3 = (p237sp.C13754y) r3
            sp.v r3 = r3.Ds0()
            long r7 = r11.f216701p
            com.tencent.mm.plugin.downloader.model.l r3 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r3
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r3 = r3.mo63966n(r7)
            int r7 = r3.f12196f
            java.lang.String r3 = r3.f12197g
            r11.f216700o = r3
            if (r7 == r6) goto L_0x0073
            if (r7 == r4) goto L_0x005f
            java.lang.String r3 = r11.f216697l
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0071
            goto L_0x0075
        L_0x005f:
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r3 == 0) goto L_0x0068
            com.tencent.mm.ui.chatting.s2$d r1 = com.tencent.p014mm.p136ui.chatting.C73843s2.C73845d.NEED_INSTALL
            goto L_0x0075
        L_0x0068:
            java.lang.String r3 = r11.f216697l
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r1 = r2
            goto L_0x0075
        L_0x0073:
            com.tencent.mm.ui.chatting.s2$d r1 = com.tencent.p014mm.p136ui.chatting.C73843s2.C73845d.DOWNLOADING
        L_0x0075:
            r11.f216694i = r1
            if (r1 != r0) goto L_0x0082
            android.widget.ImageView r0 = r11.f216693h
            r1 = 2131756854(0x7f100736, float:1.9144627E38)
            r0.setImageResource(r1)
            goto L_0x008a
        L_0x0082:
            android.widget.ImageView r0 = r11.f216693h
            r1 = 2131756855(0x7f100737, float:1.914463E38)
            r0.setImageResource(r1)
        L_0x008a:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r1 = 0
            com.tencent.mm.ui.chatting.s2$d r2 = r11.f216694i
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            java.lang.String r1 = "MicroMsg.ChattingQQMailFooterHandler"
            java.lang.String r2 = "dz[initRightBtnTv: status:%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            com.tencent.mm.ui.chatting.s2$d r0 = r11.f216694i
            int r0 = r0.ordinal()
            java.lang.String r1 = "QQMailUnreadHelper"
            if (r0 == r6) goto L_0x00cf
            r2 = 2
            if (r0 == r2) goto L_0x00c6
            if (r0 == r4) goto L_0x00bd
            if (r0 == r5) goto L_0x00cf
            r2 = 5
            if (r0 == r2) goto L_0x00cf
            com.tencent.mm.pluginsdk.ui.tools.p1$e r0 = r11.f216705t
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C85647p1.f249608a
            com.tencent.mm.pluginsdk.ui.tools.o1 r2 = new com.tencent.mm.pluginsdk.ui.tools.o1
            r2.<init>(r0)
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r1)
            goto L_0x00db
        L_0x00bd:
            android.widget.TextView r0 = r11.f216692g
            r1 = 2131823365(0x7f110b05, float:1.9279528E38)
            r0.setText(r1)
            goto L_0x00db
        L_0x00c6:
            android.widget.TextView r0 = r11.f216692g
            r1 = 2131823363(0x7f110b03, float:1.9279524E38)
            r0.setText(r1)
            goto L_0x00db
        L_0x00cf:
            com.tencent.mm.pluginsdk.ui.tools.p1$e r0 = r11.f216705t
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C85647p1.f249608a
            com.tencent.mm.pluginsdk.ui.tools.o1 r2 = new com.tencent.mm.pluginsdk.ui.tools.o1
            r2.<init>(r0)
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r1)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73843s2.mo102880b():void");
    }

    /* renamed from: c */
    public final void mo102881c() {
        int i = this.f216695j;
        if (i == 0) {
            this.f216692g.setText(C0966R.string.b5q);
        } else if (i > 99) {
            this.f216692g.setText(C0966R.string.b5p);
        } else {
            this.f216692g.setText(String.format(C76577a.m92166q(this.f216687b, C0966R.string.b5o), new Object[]{Integer.valueOf(this.f216695j)}));
        }
    }
}
