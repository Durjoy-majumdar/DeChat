package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d92.C45293c;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C97625j3;
import gq0.C107879e0;
import gq0.C107885g0;
import ik3.C21105d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k92.C108976d;
import kj2.C117407d;
import nj3.C11184p0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p154fy.C87121j;
import p262wm.C22921c;
import p407zo.C23546f;
import p910lj.C76701a;
import qg2.C77334n;
import qg2.C77335p;
import qg2.p$$e;
import qo3.C77407n;
import sf0.C77702q0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI */
public class AppAttachDownloadUI extends MMSecDataActivity implements MStorage.IOnStorageChange, C11385n, p$$e {

    /* renamed from: U0 */
    public static final /* synthetic */ int f55901U0 = 0;

    /* renamed from: A */
    public String f55902A;

    /* renamed from: B */
    public int f55903B = 0;

    /* renamed from: C */
    public String f55904C;

    /* renamed from: D */
    public long f55905D;

    /* renamed from: E */
    public String f55906E;

    /* renamed from: F */
    public String f55907F;

    /* renamed from: G */
    public String f55908G;

    /* renamed from: H */
    public String f55909H;

    /* renamed from: I */
    public String f55910I;

    /* renamed from: J */
    public String f55911J;

    /* renamed from: K */
    public boolean f55912K = false;

    /* renamed from: L */
    public boolean f55913L = false;

    /* renamed from: M */
    public boolean f55914M = true;

    /* renamed from: N */
    public boolean f55915N = false;

    /* renamed from: P */
    public int f55916P;

    /* renamed from: Q */
    public LinearLayout f55917Q;

    /* renamed from: Q0 */
    public int f55918Q0;

    /* renamed from: R */
    public LinearLayout f55919R;

    /* renamed from: R0 */
    public C11184p0 f55920R0 = new AppAttachDownloadUI$$b(this);

    /* renamed from: S */
    public boolean f55921S = false;

    /* renamed from: S0 */
    public View.OnTouchListener f55922S0 = new AppAttachDownloadUI$$c(this);

    /* renamed from: T */
    public AbsHandOffFile f55923T;

    /* renamed from: T0 */
    public View.OnLongClickListener f55924T0 = new AppAttachDownloadUI$$d(this);

    /* renamed from: U */
    public C108976d f55925U;

    /* renamed from: V */
    public LinearLayout f55926V;

    /* renamed from: W */
    public String f55927W = null;

    /* renamed from: X */
    public AppBrandOpenMaterialCollection f55928X = null;

    /* renamed from: Y */
    public C107879e0 f55929Y = null;

    /* renamed from: Z */
    public C107885g0 f55930Z = null;

    /* renamed from: d */
    public int f55931d;

    /* renamed from: e */
    public MMImageView f55932e;

    /* renamed from: f */
    public RoundProgressBtn f55933f;

    /* renamed from: g */
    public AppAttachDownloadUI$$i f55934g;

    /* renamed from: h */
    public Button f55935h;

    /* renamed from: i */
    public View f55936i;

    /* renamed from: j */
    public TextView f55937j;

    /* renamed from: n */
    public TextView f55938n;

    /* renamed from: o */
    public TextView f55939o;

    /* renamed from: p */
    public TextView f55940p;

    /* renamed from: p0 */
    public C77407n f55941p0 = null;

    /* renamed from: q */
    public C77335p f55942q;

    /* renamed from: r */
    public String f55943r;

    /* renamed from: s */
    public int f55944s;

    /* renamed from: t */
    public long f55945t;

    /* renamed from: u */
    public C72963f4 f55946u;

    /* renamed from: v */
    public C47355o f55947v;

    /* renamed from: w */
    public boolean f55948w;

    /* renamed from: x */
    public String f55949x;

    /* renamed from: x0 */
    public C78253a f55950x0 = null;

    /* renamed from: y */
    public C68070l.C68072b f55951y;

    /* renamed from: y0 */
    public int f55952y0;

    /* renamed from: z */
    public String f55953z;

    /* renamed from: H7 */
    public static void m21338H7(AppAttachDownloadUI appAttachDownloadUI, int i, int i2) {
        if (appAttachDownloadUI.mo26086I7() != null) {
            LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new LocalCheckResUpdateCacheFileEvent();
            LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
            aVar.f78860a = i;
            aVar.f78861b = i2;
            if (appAttachDownloadUI.mo26086I7() != null) {
                localCheckResUpdateCacheFileEvent.f78859d.f78862c = appAttachDownloadUI.mo26086I7().field_fileFullPath;
            }
            localCheckResUpdateCacheFileEvent.publish();
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply to mv", new Object[0]), 1).show();
        }
    }

    /* renamed from: D0 */
    public void mo26085D0(C77335p pVar) {
        runOnUiThread(new AppAttachDownloadUI$$a(this));
    }

    /* renamed from: I7 */
    public final C72683d mo26086I7() {
        if (this.f55931d == 74) {
            return null;
        }
        C72683d Yt = C72709y1.vx0().mo100150Yt(this.f55945t);
        if (Yt != null) {
            int i = C77702q0.f226484a;
            Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId [%d] stack[%s]", Long.valueOf(this.f55945t), new C77702q0.C77703a());
            return Yt;
        }
        C72683d g = C72695v.m85065g(this.f55943r);
        if (g == null) {
            int i2 = C77702q0.f226484a;
            Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo by msgId and mediaId is null stack[%s]", new C77702q0.C77703a());
            return g;
        }
        if (g.field_msgInfoId != this.f55945t && !C86013q1.m106450k(g.field_fileFullPath)) {
            C72695v.m85072n(this.f55945t, this.f55949x, (String) null);
            C72683d Yt2 = C72709y1.vx0().mo100150Yt(this.f55945t);
            if (Yt2 == null) {
                int i3 = C77702q0.f226484a;
                Log.m105929w("MicroMsg.AppAttachDownloadUI", "summerapp getAppAttachInfo create new info from local but failed stack[%s]", new C77702q0.C77703a());
                return g;
            }
            ThreadPool.post(new AppAttachDownloadUI$$e(this, g, Yt2), "copyAttachFromLocal");
        }
        return g;
    }

    /* renamed from: J7 */
    public MMActivity getContext() {
        return (MMActivity) super.getContext();
    }

    /* renamed from: K7 */
    public final String mo26088K7() {
        String str = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(this.f55949x, (String) null);
        String str2 = u.f195602n;
        if (str2 != null && str2.length() > 0) {
            str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(u.f195602n);
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        Log.m105928w("MicroMsg.AppAttachDownloadUI", "getMimeType fail, not a built-in mimetype, use \"*/{fileext}\" instead");
        return "*/" + u.f195602n;
    }

    /* renamed from: L7 */
    public final void mo26089L7() {
        C108976d dVar = (C108976d) ((C23546f) C86312j.m106911c(C23546f.class)).U40(new C45293c(getContext()));
        this.f55925U = dVar;
        ((C21105d) dVar).mo32878l(this.f55953z, this.f55904C, this.f55903B, true);
        ((C21105d) this.f55925U).mo32879q(this.f55904C, this.f55902A);
        this.f55923T.saveToMultiTaskInfo(this.f55925U.f326418a);
    }

    /* renamed from: M7 */
    public final boolean mo26090M7(C72683d dVar) {
        if (dVar == null) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(dVar.field_fileFullPath);
        return m1Var.mo119967g() && m1Var.mo119980r() == dVar.field_totalLen;
    }

    /* renamed from: N7 */
    public final boolean mo26091N7() {
        C72683d I7 = mo26086I7();
        if (I7 == null) {
            return true;
        }
        if (C86013q1.m106450k(I7.field_fileFullPath)) {
            mo26096S7(8);
            View view = this.f55936i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "loadFile", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "loadFile", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f55934g.mo26104a(8);
            return true;
        }
        mo26096S7(8);
        mo26092O7();
        if (this.f55944s == 3) {
            Intent intent = new Intent();
            intent.putExtra("resLoadFailed", true);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    /* renamed from: O7 */
    public final void mo26092O7() {
        this.f55917Q.setVisibility(0);
        this.f55919R.setVisibility(8);
        mo26095R7(8);
        AppAttachDownloadUI$$i appAttachDownloadUI$$i = this.f55934g;
        Log.m105925i("MicroMsg.AppAttachDownloadUI", "showErrorTip overtime %s", Long.valueOf(appAttachDownloadUI$$i.f55963d.f55946u.getMsgId()));
        Button button = appAttachDownloadUI$$i.f55960a;
        if (button != null) {
            button.setVisibility(4);
        }
        TextView textView = appAttachDownloadUI$$i.f55961b;
        if (textView != null) {
            textView.setVisibility(0);
            appAttachDownloadUI$$i.f55961b.setText(C0966R.string.cuz);
            appAttachDownloadUI$$i.f55961b.setTextColor(appAttachDownloadUI$$i.f55963d.getResources().getColor(C0966R.color.Red_120));
            appAttachDownloadUI$$i.f55963d.f55940p.setVisibility(8);
            View view = appAttachDownloadUI$$i.f55963d.f55936i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI$ButtonHolder", "showErrorTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/AppAttachDownloadUI$ButtonHolder", "showErrorTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!appAttachDownloadUI$$i.f55962c) {
                appAttachDownloadUI$$i.f55962c = true;
                appAttachDownloadUI$$i.f55963d.mo26094Q7(8, 6);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x024a  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26093P7() {
        /*
            r22 = this;
            r8 = r22
            java.lang.Class<c02.c> r9 = c02.C92331c.class
            int r0 = r8.f55931d
            java.lang.String r10 = ""
            r11 = 1
            java.lang.String r12 = "MicroMsg.AppAttachDownloadUI"
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r13 = 0
            if (r0 == 0) goto L_0x00e7
            r3 = 2
            if (r0 == r3) goto L_0x007a
            r3 = 6
            if (r0 == r3) goto L_0x00e7
            r3 = 7
            if (r0 == r3) goto L_0x0065
            android.widget.Button r0 = r8.f55935h
            r0.setVisibility(r13)
            r8.mo26096S7(r1)
            android.view.View r0 = r8.f55936i
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r1.mo10233c(r2)
            java.lang.Object[] r15 = r1.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r17 = "onDownLoadImpl"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r1 = r1.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r15 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r16 = "onDownLoadImpl"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0201
        L_0x0065:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            long r1 = r8.f55945t
            java.lang.String r3 = "App_MsgId"
            r0.putExtra(r3, r1)
            r1 = -1
            r8.setResult(r1, r0)
            r22.finish()
            goto L_0x0201
        L_0x007a:
            boolean r0 = r22.mo26091N7()
            if (r0 != 0) goto L_0x0082
            goto L_0x0201
        L_0x0082:
            java.lang.String r0 = "[ImageGalleryUI] showImage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.chatting.gallery.ImageGalleryUI> r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI.class
            r0.<init>(r8, r1)
            com.tencent.mm.storage.f4 r1 = r8.f55946u
            long r1 = r1.getMsgId()
            java.lang.String r3 = "img_gallery_msg_id"
            r0.putExtra(r3, r1)
            com.tencent.mm.storage.f4 r1 = r8.f55946u
            java.lang.String r1 = r1.mo108768t()
            java.lang.String r2 = "img_gallery_talker"
            r0.putExtra(r2, r1)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r0)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r3 = "showImage"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r14.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r2 = "showImage"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r22.finish()
            r8.overridePendingTransition(r13, r13)
            goto L_0x0201
        L_0x00e7:
            boolean r0 = r22.mo26091N7()
            if (r0 != 0) goto L_0x00ef
            goto L_0x0201
        L_0x00ef:
            java.lang.String r0 = r8.f55904C
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r0)
            if (r0 == 0) goto L_0x0162
            com.tencent.mm.pluginsdk.model.app.d r0 = r22.mo26086I7()
            if (r0 != 0) goto L_0x0104
            java.lang.String r0 = "info == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0201
        L_0x0104:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.tools.ShowImageUI> r2 = com.tencent.p014mm.p136ui.tools.ShowImageUI.class
            r1.<init>(r8, r2)
            com.tencent.mm.storage.f4 r2 = r8.f55946u
            long r2 = r2.getMsgId()
            java.lang.String r4 = "key_message_id"
            r1.putExtra(r4, r2)
            java.lang.String r0 = r0.field_fileFullPath
            java.lang.String r2 = "key_image_path"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "key_favorite"
            r1.putExtra(r0, r11)
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r1)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r3 = "showFileImage"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r14.mo10231a(r13)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r2 = "showFileImage"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r22
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r22.finish()
            goto L_0x0201
        L_0x0162:
            java.lang.String r0 = r22.mo26088K7()
            java.lang.String r3 = "onDownLoadImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            r8.mo26095R7(r13)
            r8.mo26096S7(r1)
            android.view.View r3 = r8.f55936i
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r4.mo10233c(r2)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r17 = "onDownLoadImpl"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r4.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r16 = "onDownLoadImpl"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r2 = r8.f55934g
            r2.mo26104a(r1)
            android.widget.TextView r2 = r8.f55938n
            r2.setVisibility(r13)
            java.lang.String r2 = r8.f55902A
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x01ce
            android.widget.TextView r2 = r8.f55938n
            r3 = 2131833854(0x7f1133fe, float:1.9300802E38)
            java.lang.String r3 = r8.getString(r3)
            r2.setText(r3)
            goto L_0x01d5
        L_0x01ce:
            android.widget.TextView r2 = r8.f55938n
            java.lang.String r3 = r8.f55902A
            r2.setText(r3)
        L_0x01d5:
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x01de
            goto L_0x01f0
        L_0x01de:
            android.widget.Button r0 = r8.f55935h
            r0.setVisibility(r13)
            android.widget.TextView r0 = r8.f55940p
            r1 = 2131824704(0x7f111040, float:1.9282243E38)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
            goto L_0x0201
        L_0x01f0:
            android.widget.Button r0 = r8.f55935h
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.f55940p
            r1 = 2131824703(0x7f11103f, float:1.9282241E38)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
        L_0x0201:
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r0 = r8.f55923T
            int r0 = r0.getFileStatus()
            if (r0 == r11) goto L_0x0237
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r0 = r8.f55923T
            r0.setFileStatus(r11)
            com.tencent.mm.pluginsdk.model.app.d r0 = r22.mo26086I7()
            if (r0 == 0) goto L_0x0221
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r1 = r8.f55923T
            java.lang.String r0 = r0.field_fileFullPath
            int r2 = sf0.C77702q0.f226484a
            if (r0 != 0) goto L_0x021d
            goto L_0x021e
        L_0x021d:
            r10 = r0
        L_0x021e:
            r1.setFullPath(r10)
        L_0x0221:
            di3.d r0 = di3.C86312j.m106911c(r9)
            c02.c r0 = (c02.C92331c) r0
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r1 = r8.f55923T
            r0.mo58375rt(r1)
            di3.d r0 = di3.C86312j.m106911c(r9)
            c02.c r0 = (c02.C92331c) r0
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r1 = r8.f55923T
            r0.Gg0(r1)
        L_0x0237:
            java.lang.String r0 = "loadOpenMaterials"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            java.lang.String r0 = r8.f55953z
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 == 0) goto L_0x024a
            java.lang.String r0 = "loadOpenMaterials, filePath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            goto L_0x028c
        L_0x024a:
            java.lang.String r0 = r8.f55953z
            java.lang.String r1 = r8.f55927W
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x025e
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r0 = r8.f55928X
            if (r0 == 0) goto L_0x025e
            java.lang.String r0 = "loadOpenMaterials, already load"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x028c
        L_0x025e:
            java.lang.String r0 = r8.f55953z
            java.lang.String r1 = r8.f55904C
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r0 = com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel.m117225b(r0, r1)
            java.lang.Class<kr0.l0> r1 = kr0.C109033l0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.l0 r1 = (kr0.C109033l0) r1
            if (r1 != 0) goto L_0x0276
            java.lang.String r0 = "loadOpenMaterials, openMaterialService is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            goto L_0x028c
        L_0x0276:
            iq0.b r2 = iq0.C98783b.ATTACH
            boolean r2 = r1.mo158321RB(r2)
            if (r2 != 0) goto L_0x0284
            java.lang.String r0 = "loadOpenMaterials, openMaterialService is not enabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x028c
        L_0x0284:
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$j r2 = new com.tencent.mm.ui.chatting.AppAttachDownloadUI$$j
            r2.<init>(r8, r0, r1)
            r1.mo158324aj(r0, r2)
        L_0x028c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachDownloadUI.mo26093P7():void");
    }

    /* renamed from: Q7 */
    public final void mo26094Q7(int i, int i2) {
        if (6 == this.f55931d) {
            C117407d.INSTANCE.idkeyStat(1203, (long) i2, 1, false);
            Object[] objArr = new Object[13];
            C68070l.C68072b bVar = this.f55951y;
            objArr[0] = bVar.f195500J;
            objArr[1] = Integer.valueOf(bVar.f195626t == 1 ? 7 : 5);
            objArr[2] = Integer.valueOf(this.f55951y.f195594l);
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Long.valueOf((C31543z5.m39453c() - this.f55946u.getCreateTime()) / 1000);
            objArr[5] = this.f55904C;
            objArr[6] = this.f55946u.mo108768t();
            objArr[7] = 1;
            objArr[8] = "";
            objArr[9] = Long.valueOf(this.f55946u.mo108774y2());
            objArr[10] = Long.valueOf(this.f55946u.getCreateTime());
            objArr[11] = Long.valueOf(C31543z5.m39451a());
            objArr[12] = 1;
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
            Log.m105925i("MicroMsg.AppAttachDownloadUI", "reportKVStat 14665 %s", format);
            C115669n.INSTANCE.kvStat(14665, format);
        }
    }

    /* renamed from: R7 */
    public final void mo26095R7(int i) {
        this.f55940p.setVisibility(8);
    }

    /* renamed from: S7 */
    public final void mo26096S7(int i) {
        if (i != this.f55933f.getVisibility()) {
            int i2 = C77702q0.f226484a;
            Log.m105925i("MicroMsg.AppAttachDownloadUI", "setRoundProgressBar %s %s", Integer.valueOf(i), new C77702q0.C77703a());
            this.f55933f.setVisibility(i);
        }
    }

    /* renamed from: T7 */
    public final void mo26097T7() {
        mo26096S7(0);
        this.f55934g.mo26104a(8);
        if (mo26098U7()) {
            Log.m105924i("MicroMsg.AppAttachDownloadUI", "startToDownloadFile");
            if (this.f55942q != null) {
                C97625j3.m125815e().mo123458d(this.f55942q);
            }
            this.f55942q = new C77335p(this.f55945t, this.f55943r, this.f55947v);
            C97625j3.m125815e().mo123460f(this.f55942q);
            ((C87121j) C86312j.m106911c(C87121j.class)).j90(this.f55946u);
            mo26094Q7(7, 1);
        }
    }

    /* renamed from: U7 */
    public final boolean mo26098U7() {
        C72683d I7 = mo26086I7();
        C116281f0.C116288h hVar = null;
        boolean z = true;
        boolean z2 = false;
        if (I7 == null) {
            C72695v.m85072n(this.f55945t, this.f55949x, (String) null);
            I7 = mo26086I7();
            if (I7 != null) {
                Object[] objArr = new Object[8];
                objArr[0] = Long.valueOf(I7.systemRowid);
                objArr[1] = Long.valueOf(I7.field_totalLen);
                objArr[2] = I7.field_fileFullPath;
                objArr[3] = Long.valueOf(I7.field_type);
                objArr[4] = I7.field_mediaId;
                objArr[5] = Long.valueOf(I7.field_msgInfoId);
                objArr[6] = Boolean.valueOf(I7.field_isUpload);
                String str = I7.field_signature;
                objArr[7] = Integer.valueOf(str == null ? -1 : str.length());
                Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", objArr);
                C68070l.C68072b bVar = this.f55951y;
                if (bVar.f195626t != 0 || bVar.f195594l > 26214400) {
                    z = true ^ C77702q0.m93719b(I7.field_signature);
                }
            }
        } else {
            Uri n = C116299g2.m163858n(I7.field_fileFullPath);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            if (I7.field_status == 199) {
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    Log.m105924i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist but file not!");
                    C72695v.m85072n(this.f55945t, this.f55949x, (String) null);
                }
                hVar = l;
            }
            Object[] objArr2 = new Object[10];
            objArr2[0] = Long.valueOf(I7.systemRowid);
            objArr2[1] = Long.valueOf(I7.field_totalLen);
            objArr2[2] = I7.field_fileFullPath;
            objArr2[3] = Long.valueOf(I7.field_type);
            objArr2[4] = I7.field_mediaId;
            objArr2[5] = Long.valueOf(I7.field_msgInfoId);
            objArr2[6] = Boolean.valueOf(I7.field_isUpload);
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, hVar);
            objArr2[7] = Boolean.valueOf(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b));
            objArr2[8] = Long.valueOf(I7.field_status);
            String str2 = I7.field_signature;
            objArr2[9] = Integer.valueOf(str2 == null ? -1 : str2.length());
            Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", objArr2);
        }
        C68070l.C68072b bVar2 = this.f55951y;
        if (bVar2 == null || (bVar2.f195626t == 0 && bVar2.f195594l <= 26214400)) {
            z2 = z;
        }
        if (!z2) {
            C97625j3.m125815e().mo123460f(new C77334n(I7, this.f55910I, this.f55906E, this.f55902A, this.f55904C, this.f55907F));
        }
        if (I7 != null) {
            this.f55953z = I7.field_fileFullPath;
            mo26089L7();
        }
        return z2;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7154zy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r38 = this;
            r1 = r38
            java.lang.String r2 = ""
            r1.setMMTitle((java.lang.String) r2)
            android.content.res.Resources r0 = r38.getResources()
            r3 = 2131101833(0x7f060889, float:1.7816087E38)
            int r0 = r0.getColor(r3)
            r1.setActionbarColor(r0)
            r38.hideActionbarLine()
            java.lang.Class<wm.c> r3 = p262wm.C22921c.class
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r4 = "scene"
            r5 = 0
            int r0 = r0.getIntExtra(r4, r5)
            r1.f55944s = r0
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r4 = "app_msg_id"
            r6 = -1
            long r8 = r0.getLongExtra(r4, r6)
            r1.f55945t = r8
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r4 = "choose_way"
            boolean r0 = r0.getBooleanExtra(r4, r5)
            r1.f55915N = r0
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r4 = "msg_type"
            int r0 = r0.getIntExtra(r4, r5)
            r1.f55916P = r0
            long r8 = r1.f55945t
            r4 = 0
            r10 = 1
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            goto L_0x03ed
        L_0x0058:
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r6 = r1.f55945t
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r6)
            r1.f55946u = r0
            long r6 = r0.getMsgId()
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x007c
            com.tencent.mm.storage.f4 r0 = r1.f55946u
            java.lang.String r0 = r0.getContent()
            if (r0 != 0) goto L_0x00ce
        L_0x007c:
            int r0 = r1.f55916P
            if (r0 != r10) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x03ed
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r6 = "key_quoted_msg"
            android.os.Parcelable r0 = r0.getParcelableExtra(r6)
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r0 = (com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem) r0
            if (r0 != 0) goto L_0x0095
            goto L_0x03ed
        L_0x0095:
            com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4
            r6.<init>()
            r1.f55946u = r6
            int r7 = r0.f201543d
            r6.setType(r7)
            com.tencent.mm.storage.f4 r6 = r1.f55946u
            long r11 = r0.f201544e
            r6.mo108745Y2(r11)
            com.tencent.mm.storage.f4 r6 = r1.f55946u
            java.lang.String r7 = r0.f201545f
            r6.mo108749c3(r7)
            com.tencent.mm.storage.f4 r6 = r1.f55946u
            java.lang.String r7 = r0.f201548i
            r6.mo101012p4(r7)
            com.tencent.mm.storage.f4 r6 = r1.f55946u
            java.lang.String r7 = r0.f201549j
            r6.mo108732L2(r7)
            java.lang.String r0 = r0.f201546g
            java.lang.String r6 = eb0.C75592q0.m90789s()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r6)
            if (r0 == 0) goto L_0x00ce
            com.tencent.mm.storage.f4 r0 = r1.f55946u
            r0.mo108740T2(r10)
        L_0x00ce:
            com.tencent.mm.storage.f4 r0 = r1.f55946u
            java.lang.String r0 = r0.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            r1.f55948w = r0
            com.tencent.mm.storage.f4 r0 = r1.f55946u
            java.lang.String r0 = r0.getContent()
            r1.f55949x = r0
            boolean r0 = r1.f55948w
            if (r0 == 0) goto L_0x0100
            com.tencent.mm.storage.f4 r0 = r1.f55946u
            int r0 = r0.mo108769t2()
            if (r0 != 0) goto L_0x0100
            com.tencent.mm.storage.f4 r0 = r1.f55946u
            java.lang.String r0 = r0.getContent()
            boolean r6 = r1.f55948w
            if (r6 == 0) goto L_0x00fe
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = eb0.C75604z3.m90849u(r0)
        L_0x00fe:
            r1.f55949x = r0
        L_0x0100:
            java.lang.String r0 = r1.f55949x
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)
            r1.f55951y = r0
            java.lang.String r6 = "MicroMsg.AppAttachDownloadUI"
            if (r0 != 0) goto L_0x011a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r2 = r1.f55949x
            r0[r5] = r2
            java.lang.String r2 = "summerapp parse msgContent error, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r0)
            goto L_0x03ed
        L_0x011a:
            java.lang.String r0 = r0.f195606o
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 == 0) goto L_0x0153
            com.tencent.mm.message.l$b r0 = r1.f55951y
            java.lang.String r0 = r0.f195500J
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 != 0) goto L_0x0153
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r7 = r1.f55949x
            r0[r5] = r7
            java.lang.String r7 = "summerapp msgContent format error, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r0)
            com.tencent.mm.message.l$b r0 = r1.f55951y
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            com.tencent.mm.message.l$b r11 = r1.f55951y
            java.lang.String r11 = r11.f195500J
            int r11 = r11.hashCode()
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            r0.f195606o = r7
        L_0x0153:
            com.tencent.mm.message.l$b r0 = r1.f55951y
            int r7 = r0.f195582i
            r1.f55931d = r7
            java.lang.String r7 = r0.f195606o
            r1.f55943r = r7
            java.lang.String r7 = r0.f195570f
            if (r7 != 0) goto L_0x0162
            r7 = r2
        L_0x0162:
            r1.f55902A = r7
            java.lang.String r0 = r0.f195602n
            if (r0 != 0) goto L_0x0169
            r0 = r2
        L_0x0169:
            java.lang.String r0 = r0.toLowerCase()
            r1.f55904C = r0
            com.tencent.mm.message.l$b r7 = r1.f55951y
            int r11 = r7.f195594l
            long r11 = (long) r11
            r1.f55905D = r11
            java.lang.String r11 = r7.f195622s
            if (r11 != 0) goto L_0x017b
            r11 = r2
        L_0x017b:
            r1.f55906E = r11
            java.lang.String r11 = r7.f195488G
            if (r11 != 0) goto L_0x0182
            r11 = r2
        L_0x0182:
            r1.f55907F = r11
            java.lang.String r11 = r7.f195500J
            if (r11 != 0) goto L_0x0189
            r11 = r2
        L_0x0189:
            r1.f55908G = r11
            java.lang.String r11 = r7.f195650z
            if (r11 != 0) goto L_0x0190
            r11 = r2
        L_0x0190:
            r1.f55909H = r11
            java.lang.String r11 = r7.f195524R
            if (r11 != 0) goto L_0x0197
            r11 = r2
        L_0x0197:
            r1.f55910I = r11
            java.lang.String r7 = r7.f195472C
            if (r7 != 0) goto L_0x019e
            r7 = r2
        L_0x019e:
            r1.f55911J = r7
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r1.f55902A
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106454o(r0)
            r1.f55904C = r0
        L_0x01ae:
            r0 = 6
            java.lang.Object[] r7 = new java.lang.Object[r0]
            long r11 = r1.f55945t
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r5] = r11
            com.tencent.mm.storage.f4 r11 = r1.f55946u
            int r11 = r11.mo108769t2()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r10] = r11
            java.lang.String r11 = r1.f55949x
            r12 = 2
            r7[r12] = r11
            int r11 = r1.f55931d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 3
            r7[r13] = r11
            java.lang.String r11 = r1.f55943r
            r14 = 4
            r7[r14] = r11
            r11 = 5
            java.lang.String r15 = r1.f55902A
            r7[r11] = r15
            java.lang.String r11 = "summerapp initParams msgId[%d], sender[%d], msgContent[%s], appType[%d], mediaId[%s], fileName[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r7)
            com.tencent.mm.pluginsdk.model.app.d r7 = r38.mo26086I7()
            if (r7 != 0) goto L_0x01f2
            java.lang.String r8 = "summerapp initParams attInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            r1.f55913L = r5
            goto L_0x023e
        L_0x01f2:
            java.lang.String r11 = r7.field_fileFullPath
            r1.f55953z = r11
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r15 = r11.getPath()
            if (r15 == 0) goto L_0x0219
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r5, r5)
            java.lang.String r4 = r11.getPath()
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0219
            android.net.Uri$Builder r4 = r11.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r15)
            r4.build()
        L_0x0219:
            long r14 = r7.field_offset
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0222
            r1.f55913L = r10
            goto L_0x0224
        L_0x0222:
            r1.f55913L = r5
        L_0x0224:
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r9 = r7.field_fileFullPath
            r8[r5] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r8[r10] = r9
            boolean r9 = r1.f55913L
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r12] = r9
            java.lang.String r9 = "summerapp initParams attInfo field_fileFullPath[%s], field_offset[%d], isDownloadStarted[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r8)
        L_0x023e:
            com.tencent.mm.message.l$b r8 = r1.f55951y
            int r8 = r8.f195582i
            if (r8 != r0) goto L_0x0261
            java.lang.Class<i21.h> r0 = i21.C98591h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            i21.h r0 = (i21.C98591h) r0
            com.tencent.mm.storage.f4 r8 = r1.f55946u
            long r8 = r8.getMsgId()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            com.tencent.mm.storage.f4 r9 = r1.f55946u
            long r14 = r9.mo108774y2()
            boolean r9 = r1.f55913L
            r0.Fn0(r8, r14, r9)
        L_0x0261:
            r0 = 4
            r1.mo26094Q7(r0, r5)
            java.lang.Class<c02.c> r0 = c02.C92331c.class
            java.lang.String r4 = eb0.C75592q0.m90789s()
            if (r4 != 0) goto L_0x026e
            r4 = r2
        L_0x026e:
            com.tencent.mm.storage.f4 r8 = r1.f55946u
            java.lang.String r8 = r8.mo108768t()
            if (r8 != 0) goto L_0x0277
            r8 = r2
        L_0x0277:
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r9 == 0) goto L_0x0284
            com.tencent.mm.message.l$b r8 = r1.f55951y
            java.lang.String r8 = r8.f195488G
            if (r8 != 0) goto L_0x0284
            r8 = r2
        L_0x0284:
            com.tencent.mm.storage.f4 r9 = r1.f55946u
            int r9 = r9.mo108769t2()
            if (r9 != r10) goto L_0x028f
            r36 = r4
            goto L_0x0291
        L_0x028f:
            r36 = r8
        L_0x0291:
            com.tencent.mm.storage.f4 r9 = r1.f55946u
            int r9 = r9.mo108769t2()
            if (r9 != r10) goto L_0x029c
            r37 = r8
            goto L_0x029e
        L_0x029c:
            r37 = r4
        L_0x029e:
            java.lang.Class<at.b> r4 = p444at.C92087b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r16 = r4
            at.b r16 = (p444at.C92087b) r16
            java.lang.String r4 = r1.f55953z
            if (r4 != 0) goto L_0x02af
            r17 = r2
            goto L_0x02b1
        L_0x02af:
            r17 = r4
        L_0x02b1:
            java.lang.String r4 = r1.f55904C
            java.lang.String r8 = r1.f55902A
            java.lang.String r9 = r1.f55906E
            long r14 = r1.f55905D
            r23 = 1
            com.tencent.mm.storage.f4 r11 = r1.f55946u
            long r18 = r11.mo108774y2()
            java.lang.String r24 = java.lang.Long.toString(r18)
            java.lang.String r11 = r1.f55908G
            boolean r11 = sf0.C77702q0.m93719b(r11)
            if (r11 != 0) goto L_0x02d0
            java.lang.String r11 = r1.f55908G
            goto L_0x02d2
        L_0x02d0:
            java.lang.String r11 = r1.f55909H
        L_0x02d2:
            r26 = r11
            java.lang.String r11 = r1.f55910I
            r27 = r11
            java.lang.String r11 = r1.f55911J
            r28 = r11
            r29 = 1
            r31 = 0
            r33 = 0
            r35 = 1
            java.lang.String r25 = ""
            java.lang.String r30 = ""
            java.lang.String r32 = ""
            r18 = r4
            r19 = r8
            r20 = r9
            r21 = r14
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r4 = r16.a40(r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37)
            r1.f55923T = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r38.mo26086I7()
            boolean r4 = r1.mo26090M7(r4)
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r8 = r1.f55923T
            if (r4 == 0) goto L_0x0305
            r12 = 1
        L_0x0305:
            r8.setFileStatus(r12)
            di3.d r4 = di3.C86312j.m106911c(r0)
            c02.c r4 = (c02.C92331c) r4
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r8 = r1.f55923T
            r4.mo58375rt(r8)
            di3.d r0 = di3.C86312j.m106911c(r0)
            c02.c r0 = (c02.C92331c) r0
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile r4 = r1.f55923T
            r0.mo58377tt(r4)
            te3.ry r4 = new te3.ry
            r4.<init>()
            android.content.Intent r0 = r38.getIntent()
            java.lang.String r8 = "key_multi_task_common_info"
            byte[] r0 = r0.getByteArrayExtra(r8)
            if (r0 == 0) goto L_0x033a
            r4.parseFrom(r0)     // Catch:{ Exception -> 0x0333 }
            goto L_0x033a
        L_0x0333:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r8, r2, r0)
        L_0x033a:
            boolean r0 = r1.mo26090M7(r7)
            if (r0 == 0) goto L_0x03ee
            int r0 = r1.f55944s
            if (r0 != r13) goto L_0x0367
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = r1.f55953z
            java.lang.String r3 = "filePath"
            r0.putExtra(r3, r2)
            java.lang.String r2 = r1.f55902A
            java.lang.String r3 = "fileName"
            r0.putExtra(r3, r2)
            java.lang.String r2 = r1.f55904C
            java.lang.String r3 = "fileExt"
            r0.putExtra(r3, r2)
            r2 = -1
            r1.setResult(r2, r0)
            r38.finish()
            goto L_0x03ee
        L_0x0367:
            if (r0 != r10) goto L_0x03a1
            r0 = 7
            r1.f55903B = r0
            boolean r0 = r1.f55915N
            if (r0 == 0) goto L_0x0382
            di3.d r0 = di3.C86312j.m106911c(r3)
            wm.c r0 = (p262wm.C22921c) r0
            java.lang.String r2 = r7.field_fileFullPath
            java.lang.String r3 = r1.f55904C
            int r4 = r1.f55903B
            boolean r10 = r0.Om0(r1, r2, r3, r4)
            goto L_0x03ee
        L_0x0382:
            di3.d r0 = di3.C86312j.m106911c(r3)
            r16 = r0
            wm.c r16 = (p262wm.C22921c) r16
            long r2 = r1.f55945t
            java.lang.String r0 = r7.field_fileFullPath
            java.lang.String r6 = r1.f55904C
            int r7 = r1.f55903B
            r17 = r2
            r19 = r0
            r20 = r6
            r21 = r7
            r22 = r4
            boolean r10 = r16.mo35884YU(r17, r19, r20, r21, r22)
            goto L_0x03ee
        L_0x03a1:
            int r0 = r1.f55903B
            r2 = 9
            if (r0 == r2) goto L_0x03a9
            r1.f55903B = r10
        L_0x03a9:
            boolean r0 = r1.f55915N
            if (r0 == 0) goto L_0x03be
            di3.d r0 = di3.C86312j.m106911c(r3)
            wm.c r0 = (p262wm.C22921c) r0
            java.lang.String r2 = r7.field_fileFullPath
            java.lang.String r3 = r1.f55904C
            int r4 = r1.f55903B
            boolean r10 = r0.Om0(r1, r2, r3, r4)
            goto L_0x03ee
        L_0x03be:
            di3.d r0 = di3.C86312j.m106911c(r3)
            wm.c r0 = (p262wm.C22921c) r0
            java.lang.String r2 = r7.field_fileFullPath
            java.lang.String r6 = r1.f55904C
            boolean r0 = r0.Av0(r2, r6)
            if (r0 != 0) goto L_0x03ee
            di3.d r0 = di3.C86312j.m106911c(r3)
            r16 = r0
            wm.c r16 = (p262wm.C22921c) r16
            long r2 = r1.f55945t
            java.lang.String r0 = r7.field_fileFullPath
            java.lang.String r6 = r1.f55904C
            int r7 = r1.f55903B
            r17 = r2
            r19 = r0
            r20 = r6
            r21 = r7
            r22 = r4
            boolean r10 = r16.mo35884YU(r17, r19, r20, r21, r22)
            goto L_0x03ee
        L_0x03ed:
            r10 = 0
        L_0x03ee:
            if (r10 != 0) goto L_0x03f4
            r38.finish()
            return
        L_0x03f4:
            java.lang.String r0 = a70.C112760b.m154247s()
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r2 = r0.getPath()
            if (r2 == 0) goto L_0x041c
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r5, r5)
            java.lang.String r3 = r0.getPath()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x041c
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r2)
            android.net.Uri r0 = r0.build()
        L_0x041c:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r3 = 0
            com.tencent.mm.vfs.f0$h r3 = r2.mo177799l(r0, r3)
            boolean r4 = r3.mo177810a()
            if (r4 != 0) goto L_0x042a
            goto L_0x0432
        L_0x042a:
            com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a
            java.lang.String r5 = r3.f348992b
            boolean r5 = r4.mo119948x(r5)
        L_0x0432:
            if (r5 != 0) goto L_0x0446
            com.tencent.mm.vfs.f0$h r0 = r2.mo177799l(r0, r3)
            boolean r2 = r0.mo177810a()
            if (r2 != 0) goto L_0x043f
            goto L_0x0446
        L_0x043f:
            com.tencent.mm.vfs.FileSystem$c r2 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            r2.mo119937g(r0)
        L_0x0446:
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            r0.add(r1)
            r38.initView()
            r38.mo26089L7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachDownloadUI.init():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r24 = this;
            r0 = r24
            r1 = 2131301192(0x7f091348, float:1.8220435E38)
            android.view.View r1 = r0.findViewById(r1)
            com.tencent.mm.ui.MMImageView r1 = (com.tencent.p014mm.p136ui.MMImageView) r1
            r0.f55932e = r1
            r1 = 2131312655(0x7f09400f, float:1.8243685E38)
            android.view.View r1 = r0.findViewById(r1)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r1 = (com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn) r1
            r0.f55933f = r1
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = new com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i
            r2 = 2131301159(0x7f091327, float:1.8220368E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r3 = 2131301160(0x7f091328, float:1.822037E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.<init>(r0, r2, r3)
            r0.f55934g = r1
            r1 = 2131301177(0x7f091339, float:1.8220405E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.f55935h = r1
            r1 = 2131301161(0x7f091329, float:1.8220372E38)
            android.view.View r1 = r0.findViewById(r1)
            r0.f55936i = r1
            r1 = 2131301169(0x7f091331, float:1.8220388E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f55940p = r1
            r1 = 2131301162(0x7f09132a, float:1.8220374E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f55937j = r1
            r1 = 2131301167(0x7f09132f, float:1.8220384E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f55938n = r1
            r1 = 2131301168(0x7f091330, float:1.8220386E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f55939o = r1
            r1 = 2131301171(0x7f091333, float:1.8220392E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f55917Q = r1
            r1 = 2131308005(0x7f092de5, float:1.8234253E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f55919R = r1
            r1 = 2131301173(0x7f091335, float:1.8220396E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f55926V = r1
            r1 = 2131301172(0x7f091334, float:1.8220394E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.res.Resources r2 = r24.getResources()
            r3 = 2131100216(0x7f060238, float:1.7812807E38)
            int r2 = r2.getColor(r3)
            r3 = 2131756087(0x7f100437, float:1.9143072E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r3, r2)
            r1.setImageDrawable(r2)
            android.widget.LinearLayout r1 = r0.f55926V
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$f r2 = new com.tencent.mm.ui.chatting.AppAttachDownloadUI$$f
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r0.f55938n
            android.view.View$OnTouchListener r2 = r0.f55922S0
            r1.setOnTouchListener(r2)
            android.widget.TextView r1 = r0.f55938n
            android.view.View$OnLongClickListener r2 = r0.f55924T0
            r1.setOnLongClickListener(r2)
            android.widget.TextView r1 = r0.f55938n
            r2 = 1
            if (r1 == 0) goto L_0x00d6
            android.text.TextPaint r1 = r1.getPaint()
            if (r1 == 0) goto L_0x00d6
            r1.setFakeBoldText(r2)
        L_0x00d6:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r1 = r0.f55933f
            com.tencent.mm.ui.chatting.b r3 = new com.tencent.mm.ui.chatting.b
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            com.tencent.mm.ui.chatting.c r3 = new com.tencent.mm.ui.chatting.c
            r3.<init>(r0)
            android.widget.Button r1 = r1.f55960a
            r1.setOnClickListener(r3)
            android.widget.Button r1 = r0.f55935h
            com.tencent.mm.ui.chatting.d r3 = new com.tencent.mm.ui.chatting.d
            r3.<init>(r0)
            r1.setOnClickListener(r3)
            int r1 = r0.f55931d
            r3 = 2131230947(0x7f0800e3, float:1.8077961E38)
            r4 = 2131755112(0x7f100068, float:1.9141094E38)
            r5 = 7
            r6 = 6
            r7 = 4
            r8 = 2
            if (r1 == 0) goto L_0x0135
            if (r1 == r8) goto L_0x012f
            if (r1 == r7) goto L_0x0126
            if (r1 == r6) goto L_0x0112
            if (r1 == r5) goto L_0x0135
            com.tencent.mm.ui.MMImageView r1 = r0.f55932e
            r1.setImageResource(r4)
            goto L_0x0148
        L_0x0112:
            com.tencent.mm.ui.MMImageView r1 = r0.f55932e
            java.lang.Class<wm.f> r3 = p262wm.C22923f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            wm.f r3 = (p262wm.C22923f) r3
            java.lang.String r4 = r0.f55904C
            int r3 = r3.mo35908u8(r4)
            r1.setImageResource(r3)
            goto L_0x0148
        L_0x0126:
            com.tencent.mm.ui.MMImageView r1 = r0.f55932e
            r3 = 2131755116(0x7f10006c, float:1.9141102E38)
            r1.setImageResource(r3)
            goto L_0x0148
        L_0x012f:
            com.tencent.mm.ui.MMImageView r1 = r0.f55932e
            r1.setImageResource(r3)
            goto L_0x0148
        L_0x0135:
            java.lang.String r1 = r0.f55904C
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r1)
            if (r1 == 0) goto L_0x0143
            com.tencent.mm.ui.MMImageView r1 = r0.f55932e
            r1.setImageResource(r3)
            goto L_0x0148
        L_0x0143:
            com.tencent.mm.ui.MMImageView r1 = r0.f55932e
            r1.setImageResource(r4)
        L_0x0148:
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$g r1 = new com.tencent.mm.ui.chatting.AppAttachDownloadUI$$g
            r1.<init>(r0)
            r0.setBackBtn(r1)
            android.content.Intent r1 = r24.getIntent()
            java.lang.String r3 = "app_show_share"
            boolean r1 = r1.getBooleanExtra(r3, r2)
            r3 = 0
            if (r1 == 0) goto L_0x0168
            r1 = 2131755026(0x7f100012, float:1.914092E38)
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$h r4 = new com.tencent.mm.ui.chatting.AppAttachDownloadUI$$h
            r4.<init>(r0)
            r0.addIconOptionMenu(r3, r1, r4)
        L_0x0168:
            r0.f55912K = r3
            int r1 = r0.f55916P
            if (r1 != r2) goto L_0x0170
            r1 = 1
            goto L_0x0171
        L_0x0170:
            r1 = 0
        L_0x0171:
            r4 = 3
            java.lang.String r9 = ""
            r10 = 0
            r12 = 8
            r13 = 2131833854(0x7f1133fe, float:1.9300802E38)
            if (r1 == 0) goto L_0x01c3
            com.tencent.mm.storage.f4 r1 = r0.f55946u
            long r14 = r1.getMsgId()
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x01c3
            android.widget.TextView r1 = r0.f55939o
            r1.setVisibility(r12)
            android.widget.TextView r1 = r0.f55938n
            r1.setVisibility(r3)
            java.lang.String r1 = r0.f55902A
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x01a3
            android.widget.TextView r1 = r0.f55938n
            java.lang.String r3 = r0.getString(r13)
            r1.setText(r3)
            goto L_0x01aa
        L_0x01a3:
            android.widget.TextView r1 = r0.f55938n
            java.lang.String r3 = r0.f55902A
            r1.setText(r3)
        L_0x01aa:
            r24.mo26092O7()
            int r1 = r0.f55944s
            if (r1 != r4) goto L_0x01c2
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "resLoadFailed"
            r1.putExtra(r3, r2)
            r2 = -1
            r0.setResult(r2, r1)
            r24.finish()
        L_0x01c2:
            return
        L_0x01c3:
            long r14 = r0.f55905D
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x01e9
            android.widget.TextView r1 = r0.f55939o
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.f55939o
            android.content.res.Resources r10 = r24.getResources()
            r11 = 2131825939(0x7f111513, float:1.9284748E38)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            long r4 = r0.f55905D
            java.lang.String r4 = sf0.C77702q0.m93718a(r4)
            r14[r3] = r4
            java.lang.String r4 = r10.getString(r11, r14)
            r1.setText(r4)
            goto L_0x01ee
        L_0x01e9:
            android.widget.TextView r1 = r0.f55939o
            r1.setVisibility(r12)
        L_0x01ee:
            com.tencent.mm.pluginsdk.model.app.d r1 = r24.mo26086I7()
            if (r1 == 0) goto L_0x0248
            java.lang.String r4 = r1.field_fileFullPath
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            r5 = 0
            java.lang.String r10 = r4.getPath()
            if (r10 == 0) goto L_0x021b
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r3, r3)
            java.lang.String r11 = r4.getPath()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x021b
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r10)
            android.net.Uri r4 = r4.build()
        L_0x021b:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r4 = r10.mo177799l(r4, r5)
            boolean r5 = r4.mo177810a()
            if (r5 != 0) goto L_0x0229
            r4 = 0
            goto L_0x0231
        L_0x0229:
            com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a
            java.lang.String r4 = r4.f348992b
            boolean r4 = r5.mo119948x(r4)
        L_0x0231:
            if (r4 != 0) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            boolean r4 = r1.mo100146l2()
            if (r4 != 0) goto L_0x0246
            com.tencent.mm.storage.f4 r4 = r0.f55946u
            int r4 = r4.mo108769t2()
            if (r4 != r2) goto L_0x0248
            boolean r1 = r1.field_isUpload
            if (r1 == 0) goto L_0x0248
        L_0x0246:
            r1 = 1
            goto L_0x0249
        L_0x0248:
            r1 = 0
        L_0x0249:
            java.lang.String r4 = "MicroMsg.AppAttachDownloadUI"
            if (r1 == 0) goto L_0x0259
            java.lang.String r1 = "summerapp isCanOpenFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r0.f55912K = r2
            r24.mo26093P7()
            return
        L_0x0259:
            boolean r1 = r0.f55912K
            if (r1 == 0) goto L_0x025e
            return
        L_0x025e:
            com.tencent.mm.ui.chatting.k r1 = new com.tencent.mm.ui.chatting.k
            r1.<init>(r0)
            r0.f55947v = r1
            int r1 = r0.f55931d
            java.lang.String r5 = "hide moreOpenWaysArea"
            r10 = 2131824704(0x7f111040, float:1.9282243E38)
            if (r1 == 0) goto L_0x0360
            if (r1 == r8) goto L_0x02f1
            r11 = 74
            if (r1 == r11) goto L_0x0360
            if (r1 == r6) goto L_0x0360
            r6 = 7
            if (r1 == r6) goto L_0x027b
            goto L_0x035d
        L_0x027b:
            boolean r1 = r0.f55913L
            if (r1 == 0) goto L_0x0285
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            r1.mo26104a(r3)
            goto L_0x028a
        L_0x0285:
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            r1.mo26104a(r12)
        L_0x028a:
            r0.mo26096S7(r12)
            android.view.View r1 = r0.f55936i
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r6.mo10233c(r9)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r19 = "start"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r18 = "start"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.Button r1 = r0.f55935h
            r1.setVisibility(r12)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            android.widget.LinearLayout r1 = r0.f55926V
            r1.setVisibility(r7)
            android.widget.TextView r1 = r0.f55938n
            r1.setVisibility(r12)
            r0.mo26095R7(r12)
            android.widget.TextView r1 = r0.f55940p
            java.lang.String r5 = r0.getString(r10)
            r1.setText(r5)
            goto L_0x035d
        L_0x02f1:
            r0.mo26096S7(r12)
            android.view.View r1 = r0.f55936i
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r6.mo10233c(r9)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r19 = "start"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r18 = "start"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            boolean r1 = r0.f55913L
            if (r1 == 0) goto L_0x0343
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            r1.mo26104a(r3)
            goto L_0x0348
        L_0x0343:
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            r1.mo26104a(r12)
        L_0x0348:
            android.widget.Button r1 = r0.f55935h
            r1.setVisibility(r12)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            android.widget.LinearLayout r1 = r0.f55926V
            r1.setVisibility(r7)
            android.widget.TextView r1 = r0.f55938n
            r1.setVisibility(r12)
            r0.mo26095R7(r12)
        L_0x035d:
            r1 = 3
            goto L_0x0415
        L_0x0360:
            boolean r1 = r0.f55913L
            if (r1 == 0) goto L_0x036a
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            r1.mo26104a(r3)
            goto L_0x036f
        L_0x036a:
            com.tencent.mm.ui.chatting.AppAttachDownloadUI$$i r1 = r0.f55934g
            r1.mo26104a(r12)
        L_0x036f:
            r0.mo26096S7(r12)
            android.view.View r1 = r0.f55936i
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r6.mo10233c(r11)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r19 = "start"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/AppAttachDownloadUI"
            java.lang.String r18 = "start"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.Button r1 = r0.f55935h
            r1.setVisibility(r12)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            android.widget.LinearLayout r1 = r0.f55926V
            r1.setVisibility(r7)
            r0.mo26095R7(r12)
            android.widget.TextView r1 = r0.f55938n
            r1.setVisibility(r3)
            java.lang.String r1 = r0.f55902A
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x03de
            android.widget.TextView r1 = r0.f55938n
            java.lang.String r5 = r0.getString(r13)
            r1.setText(r5)
            goto L_0x03e5
        L_0x03de:
            android.widget.TextView r1 = r0.f55938n
            java.lang.String r5 = r0.f55902A
            r1.setText(r5)
        L_0x03e5:
            java.lang.String r1 = r24.mo26088K7()
            if (r1 == 0) goto L_0x03fc
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x03f2
            goto L_0x03fc
        L_0x03f2:
            android.widget.TextView r1 = r0.f55940p
            java.lang.String r5 = r0.getString(r10)
            r1.setText(r5)
            goto L_0x0408
        L_0x03fc:
            android.widget.TextView r1 = r0.f55940p
            r5 = 2131824703(0x7f11103f, float:1.9282241E38)
            java.lang.String r5 = r0.getString(r5)
            r1.setText(r5)
        L_0x0408:
            java.lang.String r1 = r0.f55904C
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r1)
            if (r1 == 0) goto L_0x035d
            r0.mo26095R7(r12)
            goto L_0x035d
        L_0x0415:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            ob0.o r5 = r0.f55947v
            r1[r3] = r5
            boolean r3 = r0.f55912K
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r2] = r3
            boolean r2 = r0.f55913L
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r8] = r2
            java.lang.String r2 = "summerapp progressCallBack[%s], isDownloadFinished[%b], isDownloadStarted[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            int r1 = r0.f55931d
            if (r1 == r8) goto L_0x043d
            boolean r1 = r0.f55912K
            if (r1 != 0) goto L_0x0440
            boolean r1 = r0.f55913L
            if (r1 != 0) goto L_0x0440
        L_0x043d:
            r24.mo26097T7()
        L_0x0440:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppAttachDownloadUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, this.f55914M, C0966R.string.c1b, C0966R.string.c1c, 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(C0966R.string.f7936wt));
    }

    public void onDestroy() {
        C77335p pVar = this.f55942q;
        if (pVar != null) {
            pVar.f225465f = null;
        }
        C72709y1.vx0().remove(this);
        super.onDestroy();
        C108976d dVar = this.f55925U;
        if (dVar != null) {
            dVar.mo74191V();
        }
        if (this.f55923T != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).A70(this.f55923T);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C108976d dVar;
        Log.m105925i("MicroMsg.AppAttachDownloadUI", "onKeyDown keyCode %d", Integer.valueOf(i));
        if (i != 4 || (dVar = this.f55925U) == null || !dVar.mo67896U(2, false)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C108976d dVar = this.f55925U;
        if (dVar != null) {
            dVar.mo74189F();
            this.f55925U.mo74191V();
        }
        init();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        C72683d I7 = mo26086I7();
        if (I7 != null) {
            long j = I7.field_totalLen;
            long j2 = I7.field_offset;
            this.f55905D = j;
            this.f55937j.setText(getString(C0966R.string.f360345c10, new Object[]{C77702q0.m93718a(j2), C77702q0.m93718a(j)}));
            long j3 = I7.field_totalLen;
            int i = j3 == 0 ? 0 : (int) ((I7.field_offset * 100) / j3);
            Log.m105926v("MicroMsg.AppAttachDownloadUI", "summerapp attach progress:" + i + " offset:" + j2 + " totallen:" + j + " status " + I7.field_status);
            this.f55933f.setProgress(i);
            if (I7.field_status == 199 && i >= 100 && !this.f55912K) {
                C108976d dVar = this.f55925U;
                if (dVar != null) {
                    ((C21105d) dVar).mo32877k(this.f55905D);
                }
                this.f55912K = true;
                if (this.f55921S) {
                    this.f55921S = false;
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124256j(doFavoriteEvent, this.f55946u);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = this;
                    aVar.f264688m = 39;
                    doFavoriteEvent.publish();
                }
                if (this.f55944s == 3) {
                    Intent intent = new Intent();
                    intent.putExtra(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f55953z);
                    intent.putExtra(DownloadInfo.FILENAME, this.f55902A);
                    intent.putExtra("fileExt", this.f55904C);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                ((C22921c) C86312j.m106911c(C22921c.class)).hr0(this, this.f55945t, I7.field_fileFullPath, this.f55904C, this.f55902A, 1);
                MMHandlerThread.postToMainThreadDelayed(new C19747e(this), 200);
            }
            if (this.f55933f.getVisibility() != 0 && i < 100 && !I7.field_isUpload && I7.field_status == 101) {
                Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp still downloading updateProgress progress[%d]", Integer.valueOf(i));
                mo26096S7(0);
                this.f55934g.mo26104a(8);
            }
        }
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(221, this);
        C97625j3.m125815e().mo123470p(728, this);
        super.onPause();
        C108976d dVar = this.f55925U;
        if (dVar != null) {
            dVar.mo74189F();
        }
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
        aVar.f264981a = false;
        C72963f4 f4Var = this.f55946u;
        aVar.f264982b = f4Var == null ? "" : f4Var.mo108768t();
        pauseAutoGetBigImgEvent.asyncPublish(getMainLooper());
        Log.m105918d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI cancel pause auto download logic");
    }

    public void onResume() {
        super.onResume();
        C97625j3.m125815e().mo123455a(221, this);
        C97625j3.m125815e().mo123455a(728, this);
        PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = new PauseAutoGetBigImgEvent();
        PauseAutoGetBigImgEvent.C92540a aVar = pauseAutoGetBigImgEvent.f264980d;
        aVar.f264981a = true;
        aVar.f264982b = this.f55946u.mo108768t();
        pauseAutoGetBigImgEvent.asyncPublish(getMainLooper());
        Log.m105918d("MicroMsg.AppAttachDownloadUI", "AppAttachDownloadUI req pause auto download logic");
        this.f55935h.setEnabled(true);
        C108976d dVar = this.f55925U;
        if (dVar != null) {
            dVar.mo74188E();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd type[%d], [%d, %d, %s]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar.getType() == 221 || yVar.getType() == 728) {
            int i5 = -1;
            if (yVar.getType() == 728 && i3 == 0 && i4 == 0) {
                C72683d I7 = mo26086I7();
                if (I7 == null) {
                    Log.m105924i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd getAppAttachInfo is null");
                } else {
                    Object[] objArr = new Object[1];
                    String str2 = I7.field_signature;
                    if (str2 != null) {
                        i5 = str2.length();
                    }
                    objArr[0] = Integer.valueOf(i5);
                    Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
                }
                if (I7 != null) {
                    I7.field_status = 101;
                    I7.field_lastModifyTime = Util.nowSecond();
                    C72709y1.vx0().update(I7, new String[0]);
                }
                if (this.f55942q != null) {
                    C97625j3.m125815e().mo123458d(this.f55942q);
                }
                this.f55942q = new C77335p(this.f55945t, this.f55943r, this.f55947v);
                C97625j3.m125815e().mo123460f(this.f55942q);
                return;
            }
            if (this.f55942q == null && (yVar2 instanceof C77335p)) {
                C77335p pVar = (C77335p) yVar2;
                C72683d I72 = mo26086I7();
                if (I72 != null && !C77702q0.m93719b(I72.field_mediaSvrId) && I72.field_mediaSvrId.equals(pVar.mo107462n1())) {
                    this.f55942q = pVar;
                    Log.m105925i("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd reset downloadAppAttachScene[%s] by mediaSvrId[%s]", pVar, I72.field_mediaSvrId);
                }
            }
            if (i3 != 0 || i4 != 0) {
                if (i4 != 0 && CrashReportFactory.hasDebuger()) {
                    C76701a.makeText((Context) this, (CharSequence) "errCode[" + i4 + "]", 0).show();
                }
                if (i4 == -5103059) {
                    mo26092O7();
                    mo26096S7(8);
                    mo26094Q7(1, 3);
                    if (this.f55944s == 3) {
                        Intent intent = new Intent();
                        intent.putExtra("resLoadFailed", true);
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                    return;
                }
                mo26096S7(8);
                this.f55934g.mo26104a(0);
                View view = this.f55936i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Log.m105920e("MicroMsg.AppAttachDownloadUI", "summerapp onSceneEnd, download fail, type = " + yVar.getType() + " errType = " + i3 + ", errCode = " + i4);
            } else if (this.f55951y.f195582i == 6) {
                mo26094Q7(0, 2);
                C72683d I73 = mo26086I7();
                if (I73 != null) {
                    C117407d.INSTANCE.idkeyStat(1203, 5, I73.field_totalLen, false);
                }
            }
        }
    }
}
