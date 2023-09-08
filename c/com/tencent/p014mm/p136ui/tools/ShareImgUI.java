package com.tencent.p014mm.p136ui.tools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.modelsimple.C40364n;
import com.tencent.p014mm.opensdk.constants.Build;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.p136ui.transmit.SelectNoSupportUI;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import ld2.C46848g;
import nj3.C76879j;
import nj3.C88990b;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C107835h0;
import p447aw.C103918d;
import p645pj.C77092c;
import p910lj.C76701a;
import te3.C51740vu;
import te3.C52064y4;
import ud3.C90646e;

/* renamed from: com.tencent.mm.ui.tools.ShareImgUI */
public class ShareImgUI extends AutoLoginActivity implements C11385n {

    /* renamed from: u */
    public static final /* synthetic */ int f250317u = 0;

    /* renamed from: d */
    public ProgressDialog f250318d = null;

    /* renamed from: e */
    public DialogInterface.OnCancelListener f250319e = null;

    /* renamed from: f */
    public Intent f250320f = null;

    /* renamed from: g */
    public ArrayList<C117747y> f250321g = new ArrayList<>();

    /* renamed from: h */
    public int f250322h = 0;

    /* renamed from: i */
    public String f250323i = null;

    /* renamed from: j */
    public Uri f250324j = null;

    /* renamed from: n */
    public ArrayList<String> f250325n = null;

    /* renamed from: o */
    public Intent f250326o = null;

    /* renamed from: p */
    public boolean f250327p = false;

    /* renamed from: q */
    public int f250328q = 1;

    /* renamed from: r */
    public int f250329r = 2;

    /* renamed from: s */
    public MMHandler f250330s = new C85943e();

    /* renamed from: t */
    public Boolean f250331t = null;

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$a */
    public class C85939a implements C85947i {
        public C85939a() {
        }

        /* renamed from: a */
        public void mo119852a(boolean z) {
            ShareImgUI shareImgUI = ShareImgUI.this;
            MMHandler mMHandler = shareImgUI.f250330s;
            mMHandler.sendMessage(mMHandler.obtainMessage(z ? shareImgUI.f250329r : shareImgUI.f250328q));
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$b */
    public class C85940b implements C85946h {
        public C85940b() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$c */
    public class C85941c implements DialogInterface.OnClickListener {
        public C85941c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ShareImgUI.this.getContext());
            ShareImgUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$d */
    public class C85942d implements DialogInterface.OnClickListener {
        public C85942d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ShareImgUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$e */
    public class C85943e extends MMHandler {
        public C85943e() {
        }

        public void handleMessage(Message message) {
            if (Util.isNullOrNil(ShareImgUI.this.f250323i)) {
                Log.m105920e("MicroMsg.ShareImgUI", "launch : fail, filePath is null");
                ShareImgUI shareImgUI = ShareImgUI.this;
                shareImgUI.mo119843O7(shareImgUI.f250322h);
                ShareImgUI.this.finish();
                return;
            }
            ShareImgUI shareImgUI2 = ShareImgUI.this;
            ShareImgUI.m106254L7(shareImgUI2, message.what == shareImgUI2.f250329r);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$f */
    public class C85944f implements DialogInterface.OnCancelListener {
        public C85944f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Iterator<C117747y> it = ShareImgUI.this.f250321g.iterator();
            while (it.hasNext()) {
                C86709a0.m107524d().mo123458d(it.next());
            }
            ShareImgUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$g */
    public class C85945g implements Runnable {

        /* renamed from: d */
        public Uri f250338d;

        /* renamed from: e */
        public C85947i f250339e;

        public C85945g(Uri uri, C85947i iVar) {
            this.f250338d = uri;
            this.f250339e = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
            if (r4 == false) goto L_0x00ba;
         */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0224  */
        /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:67:0x01eb=Splitter:B:67:0x01eb, B:73:0x01fb=Splitter:B:73:0x01fb, B:79:0x020b=Splitter:B:79:0x020b} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "MicroMsg.ShareImgUI"
                r2 = 0
                r3 = 0
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r5 = r12.f250338d     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r5 = com.tencent.p014mm.p136ui.tools.ShareImgUI.m106256N7(r4, r5)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.f250323i = r5     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = "first try getFilePath ret:%s"
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r7 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r7 = r7.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r6[r3] = r7     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r4 != 0) goto L_0x00ba
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r6 = r4.getPath()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r6 == 0) goto L_0x0050
                java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r3, r3)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r7 = r4.getPath()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r7 = r7.equals(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r7 != 0) goto L_0x0050
                android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri$Builder r4 = r4.path(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r4 = r4.build()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x0050:
                com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.vfs.f0$h r4 = r6.mo177799l(r4, r2)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r6 = r4.mo177810a()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r6 != 0) goto L_0x005e
                r4 = 0
                goto L_0x0066
            L_0x005e:
                com.tencent.mm.vfs.FileSystem$c r6 = r4.f348991a     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.f348992b     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = r6.mo119948x(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x0066:
                if (r4 == 0) goto L_0x00ba
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r6 = r4.getPath()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r6 == 0) goto L_0x0090
                java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r3, r3)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r7 = r4.getPath()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r7 = r7.equals(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r7 != 0) goto L_0x0090
                android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri$Builder r4 = r4.path(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r4 = r4.build()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x0090:
                com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.vfs.f0$h r4 = r6.mo177799l(r4, r2)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r6 = r4.mo177810a()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r6 != 0) goto L_0x009e
                r4 = 0
                goto L_0x00b8
            L_0x009e:
                com.tencent.mm.vfs.FileSystem$c r6 = r4.f348991a     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r7 = r4.f348992b     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r7 = r6.mo119947w(r7, r3)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r7 == 0) goto L_0x00b2
                java.io.File r4 = new java.io.File     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.<init>(r7)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = r4.canRead()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                goto L_0x00b8
            L_0x00b2:
                java.lang.String r4 = r4.f348992b     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = r6.mo119948x(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x00b8:
                if (r4 != 0) goto L_0x01dd
            L_0x00ba:
                java.lang.String r4 = "ret filePath cannot read"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r6 = r12.f250338d     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.getType(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r6 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                int r6 = r6.mo119849U7(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r7 = "getFilePath mimeType: %s"
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r8[r3] = r4     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r8)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r7 = 2
                r8 = 3
                if (r6 != r8) goto L_0x0131
                com.tencent.mm.ui.tools.ShareImgUI r6 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r8 = r12.f250338d     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.util.Pair r5 = ud3.C90646e.m113612a(r6, r8, r5)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r6 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.Object r8 = r5.first     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r6.f250323i = r8     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.Object r5 = r5.second     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r5 = r5.booleanValue()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r6 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                java.lang.String r6 = r6.f250323i     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                if (r6 == 0) goto L_0x012e
                java.lang.String r6 = "text/x-vcard"
                boolean r4 = r4.equals(r6)     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                if (r4 == 0) goto L_0x012e
                java.lang.Class<aw.d> r4 = p447aw.C103918d.class
                di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                aw.d r4 = (p447aw.C103918d) r4     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                com.tencent.mm.ui.tools.ShareImgUI r6 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                java.lang.String r8 = "android.permission.READ_CONTACTS"
                boolean r4 = r4.Un0(r6, r8, r3)     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                if (r4 != 0) goto L_0x012e
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                r4.f250322h = r7     // Catch:{ NullPointerException -> 0x012b, SQLiteDiskIOException -> 0x0128, IllegalAccessException -> 0x0125 }
                goto L_0x012e
            L_0x0125:
                r4 = move-exception
                goto L_0x01eb
            L_0x0128:
                r4 = move-exception
                goto L_0x01fb
            L_0x012b:
                r4 = move-exception
                goto L_0x020b
            L_0x012e:
                r3 = r5
                goto L_0x01dd
            L_0x0131:
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r6 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r9 = r12.f250338d     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r9 = r4.mo119845Q7(r6, r9)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.f250323i = r9     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r4 == 0) goto L_0x01b7
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r9 = r4.getPath()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r9 == 0) goto L_0x016f
                java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r3, r3)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r10 = r4.getPath()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r10 = r10.equals(r9)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r10 != 0) goto L_0x016f
                android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri$Builder r4 = r4.path(r9)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r4 = r4.build()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x016f:
                com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.vfs.f0$h r4 = r9.mo177799l(r4, r2)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r9 = r4.mo177810a()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r9 != 0) goto L_0x017d
                r4 = 0
                goto L_0x0197
            L_0x017d:
                com.tencent.mm.vfs.FileSystem$c r9 = r4.f348991a     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r10 = r4.f348992b     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r10 = r9.mo119947w(r10, r3)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                if (r10 == 0) goto L_0x0191
                java.io.File r4 = new java.io.File     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.<init>(r10)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = r4.canRead()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                goto L_0x0197
            L_0x0191:
                java.lang.String r4 = r4.f348992b     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                boolean r4 = r9.mo119948x(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x0197:
                if (r4 != 0) goto L_0x019a
                goto L_0x01b7
            L_0x019a:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.<init>()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r6 = "GetFilePathRunnable getShareFilePath is Success: "
                r4.append(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r6 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r6 = r6.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.append(r6)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = r4.toString()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.f250327p = r5     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                goto L_0x01dd
            L_0x01b7:
                com.tencent.mm.ui.tools.ShareImgUI r4 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r9 = r4.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.content.ContentResolver r10 = r4.getContentResolver()     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                android.net.Uri r11 = r12.f250338d     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r10 = ud3.C90646e.m113613b(r10, r11, r5)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4.f250323i = r10     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r4 = 18
                com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r4)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r4 = "GetFilePathRunnable getShareFilePath is not Success，use backup ShareUtil copyImg, path: %s , path2:%s , filePath: %s"
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r8[r3] = r6     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r8[r5] = r9     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.mm.ui.tools.ShareImgUI r5 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                java.lang.String r5 = r5.f250323i     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                r8[r7] = r5     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r8)     // Catch:{ NullPointerException -> 0x0209, SQLiteDiskIOException -> 0x01f9, IllegalAccessException -> 0x01e9, all -> 0x01e7 }
            L_0x01dd:
                com.tencent.mm.ui.tools.ShareImgUI$i r0 = r12.f250339e
                if (r0 == 0) goto L_0x021d
                com.tencent.mm.ui.tools.ShareImgUI$a r0 = (com.tencent.p014mm.p136ui.tools.ShareImgUI.C85939a) r0
                r0.mo119852a(r3)
                goto L_0x021d
            L_0x01e7:
                r0 = move-exception
                goto L_0x0220
            L_0x01e9:
                r4 = move-exception
                r5 = 0
            L_0x01eb:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x021e }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r0, r3)     // Catch:{ all -> 0x021e }
                com.tencent.mm.ui.tools.ShareImgUI r0 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ all -> 0x021e }
                r0.f250323i = r2     // Catch:{ all -> 0x021e }
                com.tencent.mm.ui.tools.ShareImgUI$i r0 = r12.f250339e
                if (r0 == 0) goto L_0x021d
                goto L_0x0218
            L_0x01f9:
                r4 = move-exception
                r5 = 0
            L_0x01fb:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x021e }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r0, r3)     // Catch:{ all -> 0x021e }
                com.tencent.mm.ui.tools.ShareImgUI r0 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ all -> 0x021e }
                r0.f250323i = r2     // Catch:{ all -> 0x021e }
                com.tencent.mm.ui.tools.ShareImgUI$i r0 = r12.f250339e
                if (r0 == 0) goto L_0x021d
                goto L_0x0218
            L_0x0209:
                r4 = move-exception
                r5 = 0
            L_0x020b:
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x021e }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r0, r3)     // Catch:{ all -> 0x021e }
                com.tencent.mm.ui.tools.ShareImgUI r0 = com.tencent.p014mm.p136ui.tools.ShareImgUI.this     // Catch:{ all -> 0x021e }
                r0.f250323i = r2     // Catch:{ all -> 0x021e }
                com.tencent.mm.ui.tools.ShareImgUI$i r0 = r12.f250339e
                if (r0 == 0) goto L_0x021d
            L_0x0218:
                com.tencent.mm.ui.tools.ShareImgUI$a r0 = (com.tencent.p014mm.p136ui.tools.ShareImgUI.C85939a) r0
                r0.mo119852a(r5)
            L_0x021d:
                return
            L_0x021e:
                r0 = move-exception
                r3 = r5
            L_0x0220:
                com.tencent.mm.ui.tools.ShareImgUI$i r1 = r12.f250339e
                if (r1 == 0) goto L_0x0229
                com.tencent.mm.ui.tools.ShareImgUI$a r1 = (com.tencent.p014mm.p136ui.tools.ShareImgUI.C85939a) r1
                r1.mo119852a(r3)
            L_0x0229:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareImgUI.C85945g.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$h */
    public interface C85946h {
    }

    /* renamed from: com.tencent.mm.ui.tools.ShareImgUI$i */
    public interface C85947i {
    }

    /* renamed from: L7 */
    public static void m106254L7(ShareImgUI shareImgUI, boolean z) {
        C40364n nVar;
        WXFileObject wXFileObject;
        ShareImgUI shareImgUI2 = shareImgUI;
        Intent intent = shareImgUI.getIntent();
        int U7 = shareImgUI2.mo119849U7(intent.resolveType(shareImgUI2));
        if (U7 == 0 && ImgUtil.isGif(shareImgUI2.f250323i)) {
            Log.m105924i("MicroMsg.ShareImgUI", "fix msg type to emoji.");
            U7 = 5;
        }
        Log.m105925i("MicroMsg.ShareImgUI", "filepath:[%s], msgType:%d", shareImgUI2.f250323i, Integer.valueOf(U7));
        if (U7 == -1) {
            Log.m105920e("MicroMsg.ShareImgUI", "launch, msgType is invalid");
            shareImgUI.finish();
            return;
        }
        ArrayList<String> arrayList = shareImgUI2.f250325n;
        if (arrayList != null && U7 == 0 && arrayList.size() > 9) {
            intent.setClass(shareImgUI2, SelectNoSupportUI.class);
            intent.putExtra("sharePictureTo", "friend");
            intent.addFlags(268435456).addFlags(67108864);
            shareImgUI2.f250326o = intent;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(shareImgUI, aVar.mo10232b(), "com/tencent/mm/ui/tools/ShareImgUI", "deal", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            shareImgUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(shareImgUI, "com/tencent/mm/ui/tools/ShareImgUI", "deal", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            shareImgUI.finish();
        } else if (!Util.isNullOrNil(shareImgUI2.f250323i) && Util.isImageFilename(shareImgUI2.f250323i) && !ImgUtil.isImgFile(shareImgUI2.f250323i)) {
            Log.m105928w("MicroMsg.ShareImgUI", "try to share illegal image.");
            shareImgUI2.mo119843O7(0);
            shareImgUI.finish();
        } else if (C97625j3.m125820j() && !C86718e.m107551r()) {
            if (U7 == 5 && !Util.isNullOrNil(shareImgUI2.f250323i)) {
                long l = C86013q1.m106451l(shareImgUI2.f250323i);
                if (l > ((long) C77092c.m93039a())) {
                    C115669n.INSTANCE.mo160131h(13459, Long.valueOf(l), 1, "", 2);
                    C76701a.makeText((Context) shareImgUI2, (int) C0966R.string.c5n, 1).show();
                    shareImgUI.finish();
                    return;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if ((BitmapUtil.decodeFile(shareImgUI2.f250323i, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c()) {
                    C115669n.INSTANCE.mo160131h(13459, Long.valueOf(l), 1, "", 2);
                    C76701a.makeText((Context) shareImgUI2, (int) C0966R.string.c5n, 1).show();
                    shareImgUI.finish();
                    return;
                }
            }
            if (!Util.isNullOrNil(shareImgUI2.f250323i) && U7 == 3) {
                String str = shareImgUI2.f250323i;
                if (str == null || str.length() == 0) {
                    Log.m105920e("MicroMsg.ShareImgUI", "dealWithFile fail, filePath is empty");
                    C76701a.makeText((Context) shareImgUI2, (int) C0966R.string.j6y, 1).show();
                    shareImgUI.finish();
                    return;
                }
                if ((z && (C117731d.m166007c().mo182443e("clicfg_attachment_copy_form_thirdfile_share", 1, true, true) == 1)) || Util.isFilePathSafeToBeCopySrc(str)) {
                    long l2 = C86013q1.m106451l(str);
                    Log.m105925i("MicroMsg.ShareImgUI", "filelength: [%d]", Long.valueOf(l2));
                    if (l2 == 0) {
                        Log.m105920e("MicroMsg.ShareImgUI", "dealWithFile fail, fileLength is 0");
                        C76701a.makeText((Context) shareImgUI2, (int) C0966R.string.j6y, 1).show();
                        shareImgUI.finish();
                        return;
                    }
                    long i = C77092c.m93047i();
                    if (l2 > i) {
                        Log.m105921e("MicroMsg.ShareImgUI", "summerbig dealWithFile fail, fileLength is too large fileLength[%d],filePath[%s] ", Long.valueOf(l2), str);
                        C76701a.makeText((Context) shareImgUI2, (CharSequence) shareImgUI2.getString(C0966R.string.j6z, new Object[]{Long.valueOf((i / 1024) / 1024)}), 1).show();
                        shareImgUI.finish();
                        return;
                    }
                    C85083h.m104927p(0);
                    if (U7 != 0) {
                        wXFileObject = new WXFileObject(str);
                    } else {
                        WXImageObject wXImageObject = new WXImageObject();
                        wXImageObject.setImagePath(str);
                        wXFileObject = wXImageObject;
                    }
                    WXMediaMessage wXMediaMessage = new WXMediaMessage(wXFileObject);
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    String path2 = n.getPath();
                    int lastIndexOf = path2.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        path2 = path2.substring(lastIndexOf + 1);
                    }
                    wXMediaMessage.title = path2;
                    wXMediaMessage.description = Util.getSizeKB(l2);
                    SendMessageToWX.Req req = new SendMessageToWX.Req();
                    req.transaction = null;
                    req.message = wXMediaMessage;
                    Bundle bundle = new Bundle();
                    req.toBundle(bundle);
                    bundle.putInt(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                    bundle.putString(ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
                    bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
                    Intent intent2 = new Intent();
                    intent2.setClass(shareImgUI2, SelectConversationUI.class);
                    intent2.putExtra("Select_Conv_NextStep", new Intent(shareImgUI2, SendAppMessageWrapperUI.class).putExtras(bundle).putExtra("animation_pop_in", true));
                    if (!C97625j3.m125820j() || C86718e.m107551r()) {
                        Log.m105928w("MicroMsg.ShareImgUI", "not logged in, jump to simple login");
                        MMWizardActivity.m7018M7(shareImgUI2, new Intent(shareImgUI2, SimpleLoginUI.class), shareImgUI.getIntent().addFlags(67108864));
                        return;
                    }
                    C86709a0.m107524d().mo123470p(837, shareImgUI2);
                    C86709a0.m107524d().mo123455a(837, shareImgUI2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    C40364n nVar2 = new C40364n(4, arrayList2, shareImgUI.getCallerPackage());
                    C86709a0.m107524d().mo123460f(nVar2);
                    shareImgUI2.f250321g.add(nVar2);
                    shareImgUI.mo119850V7();
                    shareImgUI2.f250326o = intent2;
                    return;
                }
                Log.m105920e("MicroMsg.ShareImgUI", "dealWithFile fail, filePath is refer to private file.");
                C76701a.makeText((Context) shareImgUI2, (int) C0966R.string.j6y, 1).show();
                shareImgUI.finish();
            } else if (!IntentUtil.getBooleanExtra(shareImgUI.getIntent(), "Intro_Switch", false) && C97625j3.m125820j() && !C86718e.m107551r()) {
                intent.setData(shareImgUI2.f250324j);
                intent.setClass(shareImgUI2, MsgRetransmitUI.class);
                intent.addFlags(268435456).addFlags(67108864);
                intent.putExtra("Retr_File_Name", shareImgUI2.f250323i);
                intent.putStringArrayListExtra("Retr_File_Path_List", shareImgUI2.f250325n);
                intent.putExtra("Retr_Msg_Type", U7);
                intent.putExtra("Retr_Scene", 1);
                intent.putExtra("Retr_start_where_you_are", false);
                intent.putExtra("KISFileFromCopyTmpPath", shareImgUI2.f250327p);
                C97625j3.m125815e().mo123470p(837, shareImgUI2);
                C97625j3.m125815e().mo123455a(837, shareImgUI2);
                ArrayList arrayList3 = new ArrayList();
                if (!Util.isNullOrNil(shareImgUI2.f250323i)) {
                    arrayList3.add(shareImgUI2.f250323i);
                    if (Build.VERSION.SDK_INT >= 28 && shareImgUI2.f250323i.endsWith(".heic")) {
                        intent.putExtra("Retr_Compress_Type", 1);
                    }
                } else {
                    arrayList3.addAll(shareImgUI2.f250325n);
                }
                if (U7 == 1) {
                    nVar = new C40364n(3, arrayList3, shareImgUI.getCallerPackage());
                    C85083h.m104927p(1);
                } else {
                    nVar = new C40364n(1, arrayList3, shareImgUI.getCallerPackage());
                }
                C86709a0.m107524d().mo123460f(nVar);
                shareImgUI2.f250321g.add(nVar);
                shareImgUI.mo119850V7();
                shareImgUI2.f250326o = intent;
            } else if (!shareImgUI.mo119851W7()) {
                shareImgUI2.mo119843O7(0);
                shareImgUI.finish();
            }
        } else if (!shareImgUI.mo119851W7()) {
            shareImgUI2.mo119843O7(0);
            shareImgUI.finish();
        }
    }

    /* renamed from: M7 */
    public static void m106255M7(ShareImgUI shareImgUI, C85946h hVar, ArrayList arrayList) {
        shareImgUI.getClass();
        if (hVar != null) {
            shareImgUI.runOnUiThread(new C85959l1(shareImgUI, hVar, arrayList));
        }
    }

    /* renamed from: N7 */
    public static String m106256N7(ShareImgUI shareImgUI, Uri uri) {
        Intent intent;
        shareImgUI.getClass();
        if (uri == null) {
            Log.m105920e("MicroMsg.ShareImgUI", "uri is null!");
            return null;
        }
        String scheme = uri.getScheme();
        if (Util.isNullOrNil(scheme)) {
            Log.m105921e("MicroMsg.ShareImgUI", "input uri error. %s", uri);
            return null;
        } else if (scheme.equalsIgnoreCase("file")) {
            Log.m105924i("MicroMsg.ShareImgUI", "getFilePath : scheme is SCHEME_FILE");
            String path = uri.getPath();
            String d = C90646e.m113615d(path);
            if (d != null) {
                return d;
            }
            Log.m105920e("MicroMsg.ShareImgUI", "[-] getFilePath : fail, safePath is null.");
            throw new IllegalAccessException("safePath is null while process path: " + path);
        } else {
            if (scheme.equalsIgnoreCase("content")) {
                try {
                    Log.m105924i("MicroMsg.ShareImgUI", "getFilePath : scheme is SCHEME_CONTENT: " + uri.toString());
                    Cursor query = shareImgUI.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
                    if (query == null) {
                        Log.m105920e("MicroMsg.ShareImgUI", "getFilePath : fail, cursor is null");
                        return null;
                    }
                    if (query.getCount() > 0) {
                        if (query.moveToFirst()) {
                            String lowerCase = uri.toString().toLowerCase();
                            if (!lowerCase.startsWith("content://com.android.contacts/contacts/as_vcard") && !lowerCase.startsWith("content://com.android.contacts/contacts/as_multi_vcard") && !lowerCase.startsWith("content://com.mediatek.calendarimporter") && ((intent = shareImgUI.f250320f) == null || !intent.getType().equals("text/x-vcalendar"))) {
                                if (C107835h0.f322856m.f322911r != 1) {
                                    query.close();
                                    String filePath = Util.getFilePath(shareImgUI, uri);
                                    Log.m105925i("MicroMsg.ShareImgUI", "Util.getFilePath ret:%s", filePath);
                                    return filePath;
                                }
                            }
                            return shareImgUI.mo119847S7(uri, query);
                        }
                    }
                    query.close();
                    Log.m105920e("MicroMsg.ShareImgUI", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
                    return null;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ShareImgUI", e, "SCHEME_CONTENT", new Object[0]);
                }
            }
            Log.m105920e("MicroMsg.ShareImgUI", "unknown scheme");
            return null;
        }
    }

    /* renamed from: H7 */
    public boolean mo100186H7() {
        if (C97625j3.m125820j() && !C86718e.m107551r()) {
            return false;
        }
        Log.m105928w("MicroMsg.ShareImgUI", "not login");
        this.f250320f = getIntent();
        mo119848T7();
        return true;
    }

    /* renamed from: J7 */
    public void mo94557J7(AutoLoginActivity.C72717a aVar, Intent intent) {
        if (aVar.ordinal() != 0) {
            finish();
            C88990b.m111200i(this);
            return;
        }
        this.f250320f = intent;
        int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SystemShareControlBitset"), 0);
        Log.m105925i("MicroMsg.ShareImgUI", "now permission = %d", Integer.valueOf(i));
        if ((i & 1) > 0) {
            Log.m105920e("MicroMsg.ShareImgUI", "now allowed to share to friend");
            finish();
            return;
        }
        String stringExtra = IntentUtil.getStringExtra(intent, "android.intent.extra.TEXT");
        Log.m105925i("MicroMsg.ShareImgUI", "postLogin, text = %s", stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            String format = String.format("weixin://dl/business/systemshare/?txt=%s", new Object[]{URLEncoder.encode(stringExtra)});
            mo119850V7();
            C97625j3.m125815e().mo123470p(1200, this);
            C97625j3.m125815e().mo123455a(1200, this);
            C40360i0 i0Var = new C40360i0(format, 15, (LinkedList<C52064y4>) null);
            C97625j3.m125815e().mo123460f(i0Var);
            this.f250321g.add(i0Var);
            return;
        }
        mo119848T7();
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    /* renamed from: O7 */
    public final void mo119843O7(int i) {
        if (i == 1) {
            C76701a.makeText((Context) this, (int) C0966R.string.j6x, 1).show();
        } else if (i != 2) {
            C76701a.makeText((Context) this, (int) C0966R.string.f361356j70, 1).show();
        } else {
            C76701a.makeText((Context) this, (int) C0966R.string.j6w, 1).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119844P7(java.lang.String r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r0 = 3
            r1 = 11
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r0, r1)
            r9.mo119850V7()
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r0 = r10.equals(r0)
            r1 = 0
            java.lang.String r2 = "MicroMsg.ShareImgUI"
            if (r0 == 0) goto L_0x0145
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "send signal: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            android.net.Uri r10 = r9.f250324j
            if (r10 != 0) goto L_0x0135
            android.content.Intent r10 = r9.getIntent()
            r11 = 1
            if (r10 != 0) goto L_0x003c
            java.lang.String r10 = "intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r10)
        L_0x0039:
            r10 = 0
            goto L_0x011f
        L_0x003c:
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r10, r0)
            java.lang.String r3 = "android.intent.extra.SUBJECT"
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getStringExtra(r10, r3)
            if (r0 == 0) goto L_0x0117
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0052
            goto L_0x0117
        L_0x0052:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            com.tencent.mm.opensdk.modelmsg.WXTextObject r4 = new com.tencent.mm.opensdk.modelmsg.WXTextObject
            r4.<init>(r0)
            r3.<init>(r4)
            r3.description = r0
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r4 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            r4.<init>()
            r5 = 0
            r4.transaction = r5
            r4.message = r3
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4.toBundle(r3)
            r4 = 638064131(0x26081603, float:4.721431E-16)
            java.lang.String r5 = "_mmessage_sdkVersion"
            r3.putInt(r5, r4)
            java.lang.String r4 = "_mmessage_appPackage"
            java.lang.String r5 = "com.tencent.mm.openapi"
            r3.putString(r4, r5)
            java.lang.String r4 = "SendAppMessageWrapper_AppId"
            java.lang.String r5 = "wx4310bbd51be7d979"
            r3.putString(r4, r5)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.Class<com.tencent.mm.ui.transmit.SelectConversationUI> r5 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.class
            r4.setClass(r9, r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.transmit.SendAppMessageWrapperUI> r6 = com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI.class
            r5.<init>(r9, r6)
            android.content.Intent r3 = r5.putExtras(r3)
            java.lang.String r5 = "animation_pop_in"
            android.content.Intent r3 = r3.putExtra(r5, r11)
            java.lang.String r5 = "Select_Conv_NextStep"
            r4.putExtra(r5, r3)
            boolean r3 = eb0.C97625j3.m125820j()
            if (r3 == 0) goto L_0x00fc
            boolean r3 = f40.C86718e.m107551r()
            if (r3 != 0) goto L_0x00fc
            ob0.b0 r3 = eb0.C97625j3.m125815e()
            r5 = 837(0x345, float:1.173E-42)
            r3.mo123470p(r5, r9)
            ob0.b0 r3 = eb0.C97625j3.m125815e()
            r3.mo123455a(r5, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r10 = "|"
            r5.append(r10)
            r5.append(r0)
            java.lang.String r10 = r5.toString()
            r3.add(r10)
            com.tencent.mm.modelsimple.n r10 = new com.tencent.mm.modelsimple.n
            r0 = 5
            java.lang.String r5 = r9.getCallerPackage()
            r10.<init>(r0, r3, r5)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r10)
            java.util.ArrayList<ob0.y> r0 = r9.f250321g
            r0.add(r10)
            r9.mo119850V7()
            r9.f250326o = r4
            goto L_0x0115
        L_0x00fc:
            java.lang.String r10 = "not logged in, jump to simple login"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r10)
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.SimpleLoginUI> r0 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.class
            r10.<init>(r9, r0)
            android.content.Intent r0 = r9.getIntent()
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r0.addFlags(r3)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7018M7(r9, r10, r0)
        L_0x0115:
            r10 = 1
            goto L_0x011f
        L_0x0117:
            java.lang.String r10 = "text is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            goto L_0x0039
        L_0x011f:
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r11[r1] = r0
            java.lang.String r0 = "dealWithText: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r11)
            if (r10 != 0) goto L_0x0134
            r9.mo119843O7(r1)
            r9.finish()
        L_0x0134:
            return
        L_0x0135:
            com.tencent.mm.ui.tools.ShareImgUI$g r11 = new com.tencent.mm.ui.tools.ShareImgUI$g
            com.tencent.mm.ui.tools.ShareImgUI$a r0 = new com.tencent.mm.ui.tools.ShareImgUI$a
            r0.<init>()
            r11.<init>(r10, r0)
            java.lang.String r10 = "ShareImgUI_getFilePath"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r11, r10)
            goto L_0x0182
        L_0x0145:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0183
            if (r11 == 0) goto L_0x0183
            java.lang.String r0 = "android.intent.extra.STREAM"
            boolean r0 = r11.containsKey(r0)
            if (r0 == 0) goto L_0x0183
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send multi: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            com.tencent.mm.ui.tools.ShareImgUI$b r6 = new com.tencent.mm.ui.tools.ShareImgUI$b
            r6.<init>()
            long r7 = java.lang.System.currentTimeMillis()
            com.tencent.mm.ui.tools.k1 r10 = new com.tencent.mm.ui.tools.k1
            r3 = r10
            r4 = r9
            r5 = r11
            r3.<init>(r4, r5, r6, r7)
            java.lang.String r11 = "getMultiSendFilePathList"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r10, r11)
        L_0x0182:
            return
        L_0x0183:
            java.lang.String r10 = "launch : fail, uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r10)
            r9.mo119843O7(r1)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareImgUI.mo119844P7(java.lang.String, android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.io.OutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo119845Q7(java.lang.String r13, android.net.Uri r14) {
        /*
            r12 = this;
            java.lang.Boolean r0 = r12.f250331t
            r1 = 0
            if (r0 != 0) goto L_0x002c
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_open_share_img_use_fileprovider_copy_path
            r3 = 1
            int r0 = r0.mo58779Qe(r2, r3)
            if (r0 == r3) goto L_0x0026
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0026
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x0026
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r12.f250331t = r0
        L_0x002c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getShareFilePath useCopyFilePath == "
            r0.append(r2)
            java.lang.Boolean r2 = r12.f250331t
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.ShareImgUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.Boolean r0 = r12.f250331t
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0052
            r14 = 10
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r14)
            return r13
        L_0x0052:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x0083
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r13)
            boolean r3 = r0.mo119967g()
            if (r3 == 0) goto L_0x0083
            boolean r0 = r0.mo119961a()
            if (r0 == 0) goto L_0x0083
            r14 = 17
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "getShareFilePath srcPath is exists and canRead, return srcPath:"
            r14.append(r0)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
            return r13
        L_0x0083:
            r0 = 11
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r0)
            r0 = 0
            android.content.ContentResolver r3 = r12.getContentResolver()     // Catch:{ Exception -> 0x018d, all -> 0x018a }
            java.io.InputStream r14 = r3.openInputStream(r14)     // Catch:{ Exception -> 0x018d, all -> 0x018a }
            if (r14 == 0) goto L_0x016a
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r5 = r12.mo119846R7(r13)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            if (r6 == 0) goto L_0x00c1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.<init>()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r4 = "getShareFilePath tmpPath == null , use srcPath:"
            r3.append(r4)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.append(r13)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3 = 12
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r14)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            return r13
        L_0x00c1:
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            if (r6 == 0) goto L_0x00de
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r6.<init>()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r7 = "getShareFilePath deleteFile:"
            r6.append(r7)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r6.append(r5)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
        L_0x00de:
            java.io.OutputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106429K(r5, r1)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r7 = 0
        L_0x00e8:
            int r9 = r14.read(r6)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r10 = -1
            if (r9 != r10) goto L_0x015a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r6.<init>()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r9 = "getShareFilePath copy cost(ms):"
            r6.append(r9)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            long r9 = r9 - r3
            r6.append(r9)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r3 = "  size(KB):"
            r6.append(r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            float r3 = (float) r7     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r4 = 1149239296(0x44800000, float:1024.0)
            float r3 = r3 / r4
            r6.append(r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            boolean r4 = r3.mo119967g()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            if (r4 == 0) goto L_0x0140
            boolean r3 = r3.mo119961a()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            if (r3 == 0) goto L_0x0140
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.<init>()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r4 = "getShareFilePath tmpFile can use:"
            r3.append(r4)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.append(r5)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3 = 13
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r13 = r5
            goto L_0x0183
        L_0x0140:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.<init>()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r4 = "getShareFilePath tmpFile can not use, use srcPath:"
            r3.append(r4)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.append(r13)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3 = 14
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            goto L_0x0183
        L_0x015a:
            r0.write(r6)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            long r9 = (long) r9     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            long r7 = r7 + r9
            goto L_0x00e8
        L_0x0160:
            r13 = move-exception
            r11 = r0
            r0 = r14
            r14 = r11
            goto L_0x01b7
        L_0x0165:
            r3 = move-exception
            r11 = r0
            r0 = r14
            r14 = r11
            goto L_0x018f
        L_0x016a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.<init>()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r4 = "getShareFilePath inputStream == null, copy fail, use srcPath:"
            r3.append(r4)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3.append(r13)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
            r3 = 15
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r3)     // Catch:{ Exception -> 0x0165, all -> 0x0160 }
        L_0x0183:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r14)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            goto L_0x01b5
        L_0x018a:
            r13 = move-exception
            r14 = r0
            goto L_0x01b7
        L_0x018d:
            r3 = move-exception
            r14 = r0
        L_0x018f:
            java.lang.String r4 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b6 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r4, r1)     // Catch:{ all -> 0x01b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            r1.<init>()     // Catch:{ all -> 0x01b6 }
            java.lang.String r3 = "getShareFilePath copy exception, use srcPath:"
            r1.append(r3)     // Catch:{ all -> 0x01b6 }
            r1.append(r13)     // Catch:{ all -> 0x01b6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)     // Catch:{ all -> 0x01b6 }
            r1 = 16
            com.tencent.p014mm.plugin.base.stub.C85083h.m104927p(r1)     // Catch:{ all -> 0x01b6 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r14)
        L_0x01b5:
            return r13
        L_0x01b6:
            r13 = move-exception
        L_0x01b7:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareImgUI.mo119845Q7(java.lang.String, android.net.Uri):java.lang.String");
    }

    /* renamed from: R7 */
    public final String mo119846R7(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        return C46848g.Dx0() + MD5Util.getMD5String(System.currentTimeMillis() + "_" + str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e6, code lost:
        if (r2 == 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018e, code lost:
        if (r2 == 0) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bc, code lost:
        if (r2 == 0) goto L_0x01fb;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01de A[SYNTHETIC, Splitter:B:100:0x01de] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e3 A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ed A[SYNTHETIC, Splitter:B:108:0x01ed] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f2 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f7 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0186 A[SYNTHETIC, Splitter:B:77:0x0186] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018b A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b4 A[SYNTHETIC, Splitter:B:89:0x01b4] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b9 A[Catch:{ Exception -> 0x01fb }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:97:0x01c3=Splitter:B:97:0x01c3, B:74:0x0164=Splitter:B:74:0x0164, B:86:0x0199=Splitter:B:86:0x0199} */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo119847S7(android.net.Uri r11, android.database.Cursor r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x01fb
            java.lang.String r1 = "contact.vcf"
            java.lang.String r2 = "_display_name"
            int r2 = r12.getColumnIndex(r2)
            r3 = -1
            java.lang.String r4 = "MicroMsg.ShareImgUI"
            r5 = 0
            if (r2 == r3) goto L_0x0045
            java.lang.String r1 = r12.getString(r2)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0026
        L_0x0016:
            r2 = move-exception
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r2 = r2.getMessage()
            r6[r5] = r2
            java.lang.String r2 = "try to get Vcard Name fail: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r6)
        L_0x0026:
            if (r1 == 0) goto L_0x0030
            java.lang.String r2 = "[^.\\w]+"
            java.lang.String r6 = "_"
            java.lang.String r1 = r1.replaceAll(r2, r6)
        L_0x0030:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "vcard file name: "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
        L_0x0045:
            r12.close()
            android.content.ContentResolver r12 = r10.getContentResolver()     // Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x0195, Exception -> 0x0160, all -> 0x015b }
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r11 = r12.openAssetFileDescriptor(r11, r2)     // Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x0195, Exception -> 0x0160, all -> 0x015b }
            java.io.FileInputStream r12 = r11.createInputStream()     // Catch:{ FileNotFoundException -> 0x0157, IOException -> 0x0154, Exception -> 0x0151, all -> 0x014d }
            eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            boolean r2 = r2.mo105883I()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            if (r2 == 0) goto L_0x00f3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r6 = a70.C112760b.m154195C()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r6 = "share"
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r7 = a70.C112760b.m154195C()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r7 = "share/"
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r6.append(r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r1 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r6 = r2.getPath()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            if (r6 == 0) goto L_0x00b4
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r5, r5)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r7 = r2.getPath()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            boolean r7 = r7.equals(r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            if (r7 != 0) goto L_0x00b4
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            android.net.Uri$Builder r2 = r2.path(r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            android.net.Uri r2 = r2.build()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
        L_0x00b4:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            com.tencent.mm.vfs.f0$h r6 = r6.mo177799l(r2, r0)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            boolean r7 = r6.mo177810a()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            if (r7 != 0) goto L_0x00c2
            r7 = 0
            goto L_0x00ca
        L_0x00c2:
            com.tencent.mm.vfs.FileSystem$c r7 = r6.f348991a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r8 = r6.f348992b     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            boolean r7 = r7.mo119948x(r8)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
        L_0x00ca:
            if (r7 != 0) goto L_0x00e0
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            com.tencent.mm.vfs.f0$h r2 = r7.mo177799l(r2, r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            boolean r6 = r2.mo177810a()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            if (r6 != 0) goto L_0x00d9
            goto L_0x00e0
        L_0x00d9:
            com.tencent.mm.vfs.FileSystem$c r6 = r2.f348991a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r2 = r2.f348992b     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r6.mo119937g(r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
        L_0x00e0:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r2.<init>((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            boolean r6 = r2.mo119967g()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            if (r6 != 0) goto L_0x00ee
            r2.mo119964e()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
        L_0x00ee:
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r1, r5)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            goto L_0x0119
        L_0x00f3:
            r10.deleteFile(r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.io.File r6 = r10.getFilesDir()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r6 = r6.getPath()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r6 = "/"
            r2.append(r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r2.append(r1)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            java.io.FileOutputStream r1 = r10.openFileOutput(r1, r5)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0146, Exception -> 0x0143, all -> 0x013f }
            r9 = r2
            r2 = r1
            r1 = r9
        L_0x0119:
            r6 = 5120(0x1400, float:7.175E-42)
            byte[] r7 = new byte[r6]     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0139, Exception -> 0x0137 }
        L_0x011d:
            int r8 = r12.read(r7, r5, r6)     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0139, Exception -> 0x0137 }
            if (r8 == r3) goto L_0x0127
            r2.write(r7, r5, r8)     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0139, Exception -> 0x0137 }
            goto L_0x011d
        L_0x0127:
            r2.flush()     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0139, Exception -> 0x0137 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x013c, IOException -> 0x0139, Exception -> 0x0137 }
            r12.close()     // Catch:{ Exception -> 0x0136 }
            r11.close()     // Catch:{ Exception -> 0x0136 }
            r2.close()     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            return r1
        L_0x0137:
            r1 = move-exception
            goto L_0x0164
        L_0x0139:
            r1 = move-exception
            goto L_0x0199
        L_0x013c:
            r1 = move-exception
            goto L_0x01c3
        L_0x013f:
            r1 = move-exception
            r2 = r0
            goto L_0x01ea
        L_0x0143:
            r1 = move-exception
            r2 = r0
            goto L_0x0164
        L_0x0146:
            r1 = move-exception
            r2 = r0
            goto L_0x0199
        L_0x0149:
            r1 = move-exception
            r2 = r0
            goto L_0x01c3
        L_0x014d:
            r1 = move-exception
            r2 = r0
            goto L_0x01eb
        L_0x0151:
            r1 = move-exception
            r12 = r0
            goto L_0x0163
        L_0x0154:
            r1 = move-exception
            r12 = r0
            goto L_0x0198
        L_0x0157:
            r1 = move-exception
            r12 = r0
            goto L_0x01c2
        L_0x015b:
            r1 = move-exception
            r11 = r0
            r2 = r11
            goto L_0x01eb
        L_0x0160:
            r1 = move-exception
            r11 = r0
            r12 = r11
        L_0x0163:
            r2 = r12
        L_0x0164:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e9 }
            r3.<init>()     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = "vcard uri exception"
            r3.append(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = r1.getMessage()     // Catch:{ all -> 0x01e9 }
            r3.append(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)     // Catch:{ all -> 0x01e9 }
            if (r12 == 0) goto L_0x0189
            r12.close()     // Catch:{ Exception -> 0x01fb }
        L_0x0189:
            if (r11 == 0) goto L_0x018e
            r11.close()     // Catch:{ Exception -> 0x01fb }
        L_0x018e:
            if (r2 == 0) goto L_0x01fb
        L_0x0190:
            r2.close()     // Catch:{ Exception -> 0x01fb }
            goto L_0x01fb
        L_0x0195:
            r1 = move-exception
            r11 = r0
            r12 = r11
        L_0x0198:
            r2 = r12
        L_0x0199:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e9 }
            r3.<init>()     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = "vcard uri ioexception"
            r3.append(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x01e9 }
            r3.append(r1)     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)     // Catch:{ all -> 0x01e9 }
            if (r12 == 0) goto L_0x01b7
            r12.close()     // Catch:{ Exception -> 0x01fb }
        L_0x01b7:
            if (r11 == 0) goto L_0x01bc
            r11.close()     // Catch:{ Exception -> 0x01fb }
        L_0x01bc:
            if (r2 == 0) goto L_0x01fb
            goto L_0x0190
        L_0x01bf:
            r1 = move-exception
            r11 = r0
            r12 = r11
        L_0x01c2:
            r2 = r12
        L_0x01c3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e9 }
            r3.<init>()     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = "vcard uri file not found "
            r3.append(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x01e9 }
            r3.append(r1)     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)     // Catch:{ all -> 0x01e9 }
            if (r12 == 0) goto L_0x01e1
            r12.close()     // Catch:{ Exception -> 0x01fb }
        L_0x01e1:
            if (r11 == 0) goto L_0x01e6
            r11.close()     // Catch:{ Exception -> 0x01fb }
        L_0x01e6:
            if (r2 == 0) goto L_0x01fb
            goto L_0x0190
        L_0x01e9:
            r1 = move-exception
        L_0x01ea:
            r0 = r12
        L_0x01eb:
            if (r0 == 0) goto L_0x01f0
            r0.close()     // Catch:{ Exception -> 0x01fa }
        L_0x01f0:
            if (r11 == 0) goto L_0x01f5
            r11.close()     // Catch:{ Exception -> 0x01fa }
        L_0x01f5:
            if (r2 == 0) goto L_0x01fa
            r2.close()     // Catch:{ Exception -> 0x01fa }
        L_0x01fa:
            throw r1
        L_0x01fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.ShareImgUI.mo119847S7(android.net.Uri, android.database.Cursor):java.lang.String");
    }

    /* renamed from: T7 */
    public final void mo119848T7() {
        Parcelable parcelable;
        Intent intent = this.f250320f;
        if (intent == null) {
            Log.m105920e("MicroMsg.ShareImgUI", "launch : fail, intent is null");
            mo119843O7(0);
            finish();
            return;
        }
        String action = intent.getAction();
        Bundle extras = this.f250320f.getExtras();
        if (Util.isNullOrNil(action)) {
            Log.m105920e("MicroMsg.ShareImgUI", "launch : fail, action is null");
            mo119843O7(0);
            finish();
            return;
        }
        if (!(extras == null || (parcelable = extras.getParcelable("android.intent.extra.STREAM")) == null || !(parcelable instanceof Uri))) {
            Uri uri = (Uri) parcelable;
            this.f250324j = uri;
            if (!Util.isUriSafeToBeCopySrc(uri)) {
                Log.m105921e("MicroMsg.ShareImgUI", "launch : fail, not accepted: %s", this.f250324j);
                mo119843O7(0);
                finish();
                return;
            }
        }
        if (!C90646e.m113617f(this, this.f250324j)) {
            mo119844P7(action, extras);
            return;
        }
        boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(C0966R.string.hif), getString(C0966R.string.f5g));
        Log.m105925i("MicroMsg.ShareImgUI", "checkPermission checkMediaStorage[%b]", Boolean.valueOf(Uu0));
        if (Uu0) {
            mo119844P7(action, extras);
        }
    }

    /* renamed from: U7 */
    public final int mo119849U7(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ShareImgUI", "map : mimeType is null");
            return -1;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.equalsIgnoreCase("image/gif")) {
            return 5;
        }
        if (lowerCase.contains("image")) {
            return 0;
        }
        if (lowerCase.contains("video")) {
            return 1;
        }
        Log.m105918d("MicroMsg.ShareImgUI", "map : unknown mimetype, send as file");
        return 3;
    }

    /* renamed from: V7 */
    public final void mo119850V7() {
        ProgressDialog progressDialog = this.f250318d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            if (this.f250319e == null) {
                this.f250319e = new C85944f();
            }
            this.f250318d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, this.f250319e);
        }
    }

    /* renamed from: W7 */
    public final boolean mo119851W7() {
        Intent intent = new Intent(this, ShareImgUI.class);
        if ("android.intent.action.SEND".equals(getIntent().getAction())) {
            if (Util.isNullOrNil(this.f250323i)) {
                return false;
            }
            intent.putExtra("android.intent.extra.STREAM", FileProviderHelper.getUriForFile(this, new C86009m1(this.f250323i)));
            intent.setAction("android.intent.action.SEND");
            intent.setType(getIntent().getType());
        } else if (!"android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction()) || Util.isNullOrNil((List) this.f250325n)) {
            return false;
        } else {
            ArrayList arrayList = new ArrayList(this.f250325n.size());
            Iterator<String> it = this.f250325n.iterator();
            while (it.hasNext()) {
                arrayList.add(FileProviderHelper.getUriForFile(this, new C86009m1(it.next())));
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(getIntent().getType());
        }
        intent.addFlags(67108864);
        MMWizardActivity.m7018M7(this, new Intent(this, SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent);
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.ShareImgUI", "ShareImgUI onCreate %d", Integer.valueOf(hashCode()));
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(1200, this);
        C97625j3.m125815e().mo123470p(837, this);
        ProgressDialog progressDialog = this.f250318d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f250318d.dismiss();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        Log.m105925i("MicroMsg.ShareImgUI", "ShareImgUI onPause %d", Integer.valueOf(hashCode()));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            Log.m105925i("MicroMsg.ShareImgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ShareImgUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 145) {
            if (iArr[0] == 0) {
                if (this.f250320f == null) {
                    this.f250320f = getIntent();
                }
                Intent intent = this.f250320f;
                if (intent != null && intent.getAction() != null) {
                    mo119844P7(this.f250320f.getAction(), this.f250320f.getExtras());
                    return;
                }
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhw), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f360830f51), false, new C85941c(), new C85942d());
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.ShareImgUI", "ShareImgUI onResume %d", Integer.valueOf(hashCode()));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        objArr[3] = Integer.valueOf(yVar != null ? yVar.getType() : -1);
        objArr[4] = Integer.valueOf(hashCode());
        Log.m105925i("MicroMsg.ShareImgUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s, type: %d, hashCode: %d", objArr);
        if (yVar != null) {
            this.f250321g.remove(yVar);
        }
        ProgressDialog progressDialog = this.f250318d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f250318d.dismiss();
        }
        if (yVar instanceof C40360i0) {
            if (i == 0 && i2 == 0) {
                mo119848T7();
            } else {
                finish();
            }
        }
        if (yVar instanceof C40364n) {
            if (i == 0 && i2 == 0) {
                Intent intent = this.f250326o;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (yVar.getReqResp() != null) {
                C51740vu vuVar = (C51740vu) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
                if (vuVar == null || Util.isNullOrNil(vuVar.f143697d)) {
                    Intent intent2 = this.f250326o;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("rawUrl", vuVar.f143697d);
                    intent3.putExtra("showShare", false);
                    intent3.putExtra("show_bottom", false);
                    intent3.putExtra("needRedirect", false);
                    C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
                }
            }
            finish();
        }
    }
}
