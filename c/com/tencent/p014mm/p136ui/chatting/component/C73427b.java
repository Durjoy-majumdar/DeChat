package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.app.plugin.C40030e;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.chatting.C73323b5;
import com.tencent.p014mm.p136ui.chatting.C74355z4;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72930u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C116756s5;
import eb0.C97625j3;
import java.util.HashSet;
import java.util.Set;
import ke3.C88144b;
import p270xi.C91212b;
import p763ym.C79138l;
import q43.C77302a;
import wc3.C15134f0;
import zj3.C79339b;
import zj3.C79368l;

@C91212b(exportInterface = C79339b.class)
/* renamed from: com.tencent.mm.ui.chatting.component.b */
public class C73427b extends C73412a implements C79339b {

    /* renamed from: e */
    public C77302a f215797e = null;

    /* renamed from: f */
    public C73323b5 f215798f = null;

    /* renamed from: g */
    public final MStorage.IOnStorageChange f215799g = new C73428a();

    /* renamed from: h */
    public final MStorage.IOnStorageChange f215800h = new C73429b();

    /* renamed from: com.tencent.mm.ui.chatting.component.b$a */
    public class C73428a implements MStorage.IOnStorageChange {
        public C73428a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105926v("MicroMsg.ChattingUI.AppMsgComponent", "app attach info watcher notify");
            ((C79368l) C73427b.this.f215752d.f193278b.mo102812a(C79368l.class)).mo108171E0();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.b$b */
    public class C73429b implements MStorage.IOnStorageChange {
        public C73429b() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105926v("MicroMsg.ChattingUI.AppMsgComponent", "app info watcher notify");
            ((C79368l) C73427b.this.f215752d.f193278b.mo102812a(C79368l.class)).mo108171E0();
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C74355z4.f218406a.clear();
        C74355z4.f218407b.clear();
        C74355z4.f218408c.clear();
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        Class cls = C79138l.class;
        if (i != 210) {
            if (i == 222 && i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("service_app_package_name");
                String stringExtra2 = intent.getStringExtra("service_app_openid");
                String stringExtra3 = intent.getStringExtra("service_app_appid");
                Object[] objArr = new Object[4];
                objArr[0] = Boolean.valueOf(this.f215798f != null);
                objArr[1] = stringExtra;
                objArr[2] = stringExtra3;
                objArr[3] = stringExtra2;
                Log.m105925i("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg, wxmessage[%b], package[%s], appId[%s], openId[%s]", objArr);
                if (Util.isNullOrNil(stringExtra3)) {
                    Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "REQUEST_CODE_SERVICE_APP openId is null");
                } else if (this.f215798f == null || Util.isNullOrNil(stringExtra)) {
                    mo102381Y5(((C79138l) C86312j.m106911c(cls)).getAppInfo(stringExtra3));
                } else if (Util.isNullOrNil(stringExtra2)) {
                    C72709y1.Bx0().mo69340a(stringExtra3);
                    Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg fail, openId is null, go get it");
                } else {
                    boolean c = this.f215798f.mo102143c(stringExtra, stringExtra2);
                    Log.m105919d("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg success = %b", Boolean.valueOf(c));
                    if (!c) {
                        mo102381Y5(((C79138l) C86312j.m106911c(cls)).getAppInfo(stringExtra3));
                    }
                }
            }
        } else if (i2 == -1) {
            mo102380Y3(((C72972g4) C97625j3.m125812b().mo105911z()).b00(intent.getLongExtra("App_MsgId", 0)), (C44580q1) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0154 A[SYNTHETIC, Splitter:B:40:0x0154] */
    /* renamed from: Y3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102380Y3(com.tencent.p014mm.storage.C72963f4 r21, com.tencent.p014mm.pluginsdk.model.app.C44580q1 r22) {
        /*
            r20 = this;
            r1 = r20
            java.lang.Class<ym.p> r0 = p763ym.C79139p.class
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            java.lang.String r3 = r21.getContent()
            int r4 = r21.mo108769t2()
            if (r4 != 0) goto L_0x0034
            ck3.b r4 = r1.f215752d
            int r5 = r21.mo108769t2()
            java.lang.Class<zj3.e> r6 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r7 = r4.f193278b
            xi.d r6 = r7.mo102812a(r6)
            zj3.e r6 = (zj3.C79348e) r6
            boolean r6 = r6.mo70075s4()
            if (r6 != 0) goto L_0x0034
            boolean r4 = r4.mo91582w()
            if (r4 == 0) goto L_0x0034
            if (r3 == 0) goto L_0x0034
            if (r5 != 0) goto L_0x0034
            java.lang.String r3 = eb0.C75604z3.m90849u(r3)
        L_0x0034:
            r4 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            di3.d r5 = di3.C86312j.m106911c(r2)
            ym.l r5 = (p763ym.C79138l) r5
            java.lang.String r6 = r3.f195562d
            com.tencent.mm.pluginsdk.model.app.j r5 = r5.getAppInfo(r6)
            if (r5 == 0) goto L_0x0271
            ck3.b r6 = r1.f215752d
            android.app.Activity r6 = r6.mo91565f()
            java.lang.String r7 = r5.field_packageName
            boolean r6 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r6, r7)
            if (r6 == 0) goto L_0x0271
            int r6 = r5.field_status
            r7 = 3
            java.lang.String r8 = "MicroMsg.ChattingUI.AppMsgComponent"
            if (r6 != r7) goto L_0x0073
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "requestAppShow fail, app is in blacklist, packageName = "
            r0.append(r2)
            java.lang.String r2 = r5.field_packageName
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x0073:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.p r0 = (p763ym.C79139p) r0
            ck3.b r6 = r1.f215752d
            android.app.Activity r6 = r6.mo91565f()
            boolean r0 = r0.mo108864OB(r6, r5)
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x00c1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r3 = r5.field_appName
            r0[r7] = r3
            java.lang.String r3 = "The app %s signature is incorrect."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r3, r0)
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            ck3.b r3 = r1.f215752d
            android.content.res.Resources r3 = r3.mo91572m()
            r4 = 2131830801(0x7f112811, float:1.929461E38)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            ck3.b r9 = r1.f215752d
            android.app.Activity r9 = r9.mo91565f()
            java.lang.String r2 = r2.mo74011hv(r9, r5)
            r8[r7] = r2
            java.lang.String r2 = r3.getString(r4, r8)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r6)
            r0.show()
            return
        L_0x00c1:
            java.lang.String r2 = "utf-8"
            java.lang.String r9 = ""
            java.lang.String r0 = r21.mo108768t()
            java.lang.String r10 = "@qqim"
            boolean r0 = r0.endsWith(r10)
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = r5.field_packageName
            java.lang.String r10 = "com.tencent.mobileqq"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00de
            goto L_0x01cf
        L_0x00de:
            java.lang.String r0 = "jacks open QQ"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MAIN"
            r11.<init>(r0, r4)
            java.lang.String r12 = "android.intent.category.LAUNCHER"
            r11.addCategory(r12)
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r11.addFlags(r13)
            ck3.b r13 = r1.f215752d
            android.app.Activity r13 = r13.mo91565f()
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            android.content.pm.PackageInfo r14 = r13.getPackageInfo(r10, r7)     // Catch:{ Exception -> 0x0124 }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x0124 }
            r15.<init>(r0, r4)     // Catch:{ Exception -> 0x0124 }
            r15.addCategory(r12)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r0 = r14.packageName     // Catch:{ Exception -> 0x0124 }
            r15.setPackage(r0)     // Catch:{ Exception -> 0x0124 }
            java.util.List r0 = r13.queryIntentActivities(r15, r7)     // Catch:{ Exception -> 0x0124 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r0 = r0.next()     // Catch:{ Exception -> 0x0124 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x0124 }
            if (r0 == 0) goto L_0x012a
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x0124 }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x0124 }
            goto L_0x012b
        L_0x0124:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r9, r12)
        L_0x012a:
            r0 = r4
        L_0x012b:
            r11.setClassName(r10, r0)
            java.lang.String r0 = "platformId"
            java.lang.String r10 = "wechat"
            r11.putExtra(r0, r10)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r10 = 9
            java.lang.Object r0 = r0.mo119684e(r10, r4)
            if (r0 == 0) goto L_0x0151
            boolean r10 = r0 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0151
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            if (r0 == 0) goto L_0x0192
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x018c }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x018c }
            r10.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x018c }
            r10.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x018c }
            java.lang.String r0 = r10.toString()     // Catch:{ UnsupportedEncodingException -> 0x018c }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x018c }
            java.lang.String r10 = "asdfghjkl;'"
            byte[] r2 = r10.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x018c }
            int r10 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x018c }
            r12 = 0
            r13 = 0
        L_0x0170:
            if (r12 >= r10) goto L_0x0185
            byte r14 = r2[r12]     // Catch:{ UnsupportedEncodingException -> 0x018c }
            int r15 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x018c }
            if (r13 < r15) goto L_0x0178
            goto L_0x0185
        L_0x0178:
            int r15 = r13 + 1
            byte r16 = r0[r13]     // Catch:{ UnsupportedEncodingException -> 0x018c }
            r14 = r14 ^ r16
            byte r14 = (byte) r14     // Catch:{ UnsupportedEncodingException -> 0x018c }
            r0[r13] = r14     // Catch:{ UnsupportedEncodingException -> 0x018c }
            int r12 = r12 + 1
            r13 = r15
            goto L_0x0170
        L_0x0185:
            java.lang.String r2 = "tencent_gif"
            r11.putExtra(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x018c }
            goto L_0x0192
        L_0x018c:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r9, r2)
        L_0x0192:
            ck3.b r0 = r1.f215752d     // Catch:{ Exception -> 0x01cd }
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j     // Catch:{ Exception -> 0x01cd }
            k20.a r2 = new k20.a     // Catch:{ Exception -> 0x01cd }
            r2.<init>()     // Catch:{ Exception -> 0x01cd }
            r2.mo10233c(r11)     // Catch:{ Exception -> 0x01cd }
            java.lang.Object[] r13 = r2.mo10232b()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r14 = "com/tencent/mm/ui/chatting/component/AppMsgComponent"
            java.lang.String r15 = "dealOpenQQ"
            java.lang.String r16 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "startActivity"
            java.lang.String r19 = "(Landroid/content/Intent;)V"
            r12 = r0
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r2 = r2.mo10231a(r7)     // Catch:{ Exception -> 0x01cd }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x01cd }
            r0.startActivity(r2)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r13 = "com/tencent/mm/ui/chatting/component/AppMsgComponent"
            java.lang.String r14 = "dealOpenQQ"
            java.lang.String r15 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r12 = r0
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01cd }
        L_0x01cd:
            r0 = 1
            goto L_0x01d0
        L_0x01cf:
            r0 = 0
        L_0x01d0:
            if (r0 == 0) goto L_0x01d3
            return
        L_0x01d3:
            com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r0 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
            r0.<init>()
            java.lang.String r2 = r3.f195614q
            r0.extInfo = r2
            java.lang.String r2 = r3.f195606o
            if (r2 == 0) goto L_0x0221
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0221
            com.tencent.mm.pluginsdk.model.app.e r2 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r8 = r3.f195606o
            com.tencent.mm.pluginsdk.model.app.d r2 = r2.mo100154qq(r8)
            if (r2 != 0) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            java.lang.String r4 = r2.field_fileFullPath
        L_0x01f5:
            r0.filePath = r4
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r2 == 0) goto L_0x0221
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = r0.filePath
            r4.<init>((java.lang.String) r8)
            android.net.Uri r2 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r2, r4)
            if (r2 == 0) goto L_0x0221
            ck3.b r4 = r1.f215752d
            android.app.Activity r4 = r4.mo91565f()
            java.lang.String r8 = r5.field_packageName
            r4.grantUriPermission(r8, r2, r6)
            java.lang.String r2 = r2.toString()
            r0.filePath = r2
        L_0x0221:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r10 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r10.<init>()
            r2 = 638064131(0x26081603, float:4.721431E-16)
            r10.sdkVer = r2
            r10.mediaObject = r0
            java.lang.String r0 = r3.f195570f
            r10.title = r0
            java.lang.String r0 = r3.f195574g
            r10.description = r0
            java.lang.String r0 = r3.f195539W
            r10.messageAction = r0
            java.lang.String r0 = r3.f195542X
            r10.messageExt = r0
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            java.lang.String r2 = r21.mo108765s2()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127161CZ(r2)
            r2 = -1
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r7, r2)
            r10.thumbData = r0
            com.tencent.mm.ui.chatting.d5 r8 = new com.tencent.mm.ui.chatting.d5
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r8.<init>(r0)
            java.lang.String r9 = r5.field_packageName
            java.lang.String r11 = r5.field_appId
            java.lang.String r12 = r5.field_openId
            r13 = r22
            r8.mo102719b(r9, r10, r11, r12, r13)
            return
        L_0x0271:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.p r0 = (p763ym.C79139p) r0
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            java.lang.String r3 = r3.f195562d
            java.lang.String r5 = "message"
            java.lang.String r0 = r0.I90(r2, r3, r5)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r0)
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            java.lang.String r3 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r3, r5, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73427b.mo102380Y3(com.tencent.mm.storage.f4, com.tencent.mm.pluginsdk.model.app.q1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r1 = ((com.tencent.p014mm.storage.C44662n1) eb0.C97625j3.m125812b().mo105902q()).mo69799Lo(r8.f215752d.mo91577r());
     */
    /* renamed from: Y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102381Y5(com.tencent.p014mm.pluginsdk.model.app.C44561j r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.ChattingUI.AppMsgComponent"
            if (r9 == 0) goto L_0x00d7
            java.lang.String r1 = r9.field_appId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x000e
            goto L_0x00d7
        L_0x000e:
            java.lang.String r1 = r9.f149249Q0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r9 = "ForwardUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
            return
        L_0x001c:
            ck3.b r0 = r8.f215752d
            android.app.Activity r0 = r0.mo91565f()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            ck3.b r1 = r8.f215752d
            android.app.Activity r1 = r1.mo91565f()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.loadApplicationLanguage(r0, r1)
            java.lang.String r1 = "language_default"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x004b
            java.util.Locale r1 = java.util.Locale.getDefault()
            if (r1 == 0) goto L_0x004b
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toString()
        L_0x004b:
            ck3.b r1 = r8.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            r3 = 1
            if (r1 == 0) goto L_0x0077
            eb0.c r1 = eb0.C97625j3.m125812b()
            eb0.m2 r1 = r1.mo105902q()
            ck3.b r4 = r8.f215752d
            java.lang.String r4 = r4.mo91577r()
            com.tencent.mm.storage.n1 r1 = (com.tencent.p014mm.storage.C44662n1) r1
            com.tencent.mm.storage.m1 r1 = r1.mo69799Lo(r4)
            if (r1 == 0) goto L_0x0077
            java.util.List r1 = r1.mo69790r2()
            int r1 = r1.size()
            goto L_0x0078
        L_0x0077:
            r1 = 1
        L_0x0078:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r9.field_appId
            java.lang.String r7 = "jsapi_args_appid"
            r5.putString(r7, r6)
            java.lang.String r6 = "isFromService"
            r5.putBoolean(r6, r3)
            java.lang.String r6 = "forceHideShare"
            r4.putExtra(r6, r3)
            ck3.b r6 = r8.f215752d
            com.tencent.mm.storage.z1 r6 = r6.mo91574o()
            java.lang.String r6 = r6.getUsername()
            java.lang.String r7 = "sendAppMsgToUserName"
            r5.putString(r7, r6)
            java.lang.String r6 = "jsapiargs"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "show_bottom"
            r4.putExtra(r5, r2)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r9 = r9.f149249Q0
            r5[r2] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r5[r3] = r9
            r9 = 2
            r5[r9] = r0
            java.lang.String r9 = "%s&wxchatmembers=%s&lang=%s"
            java.lang.String r9 = java.lang.String.format(r9, r5)
            java.lang.String r0 = "rawUrl"
            r4.putExtra(r0, r9)
            ck3.b r9 = r8.f215752d
            android.app.Activity r9 = r9.mo91565f()
            r0 = 0
            java.lang.String r1 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r9, r1, r2, r4, r0)
            return
        L_0x00d7:
            java.lang.String r9 = "jumpServiceH5 error args"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73427b.mo102381Y5(com.tencent.mm.pluginsdk.model.app.j):void");
    }

    /* renamed from: Z5 */
    public final void mo102382Z5() {
        C73323b5 b5Var = this.f215798f;
        if (b5Var != null) {
            C73323b5.f215434d.remove(b5Var);
            ((HashSet) b5Var.f215437c).clear();
            C73323b5.m86464d(b5Var.f215435a.getContext(), (Set<String>) null);
        }
        if (C97625j3.m125811a()) {
            C72709y1.vx0().remove(this.f215799g);
            C72709y1.yx0().remove(this.f215800h);
        }
    }

    /* renamed from: b1 */
    public void mo102383b1(C72930u1 u1Var) {
        C86001b0 q;
        C116756s5.m164691d().mo180727a(38, 1);
        String str = u1Var.f212553a;
        String e = C72695v.m85063e(C97625j3.m125812b().mo105889d(), C86013q1.m106457r(str), C86013q1.m106454o(str));
        C86013q1.m106442c(str, e);
        WXMediaMessage wXMediaMessage = new WXMediaMessage(new WXFileObject(e));
        Uri n = C116299g2.m163858n(e);
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
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        long j = 0;
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
            j = q.f250473c;
        }
        wXMediaMessage.description = Util.getSizeKB(j);
        C44561j jVar = new C44561j();
        jVar.field_appId = "wx4310bbd51be7d979";
        C72709y1.yx0().get(jVar, new String[0]);
        C72695v.m85049B(wXMediaMessage, jVar.field_appId, jVar.field_appName, this.f215752d.mo91577r(), 2, (String) null);
    }

    /* renamed from: b2 */
    public void mo102384b2(C44561j jVar) {
        C77302a aVar;
        if (jVar == null) {
            Log.m105921e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSelected, info is null, %s", Util.getStack());
            return;
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44561j.f120844x1;
        if ("wxce6f23b478a3a2a2".equals(jVar.field_appId) && (aVar = this.f215797e) != null) {
            aVar.mo107446a(2, this.f215752d.mo91574o().getUsername());
        }
        if (jVar.mo69361t2()) {
            if (!jVar.mo69361t2()) {
                Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect not service app");
            } else if (this.f215752d.mo91574o() == null || Util.isNullOrNil(this.f215752d.mo91574o().getUsername())) {
                Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect talker is null");
            } else {
                Log.m105925i("MicroMsg.ChattingUI.AppMsgComponent", "serviceApp, jumpType[%d], package[%s], appid[%s]", Integer.valueOf(jVar.f149251R0), jVar.field_packageName, jVar.field_appId);
                if (jVar.f149251R0 != 2 || Util.isNullOrNil(jVar.f149249Q0)) {
                    int i = jVar.f149251R0;
                    if (i == 3) {
                        if (Util.isNullOrNil(jVar.field_openId)) {
                            C72709y1.Bx0().mo69340a(jVar.field_appId);
                            Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail, openId is null, go get it");
                        } else if (this.f215798f == null || Util.isNullOrNil(jVar.field_packageName)) {
                            Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail");
                            mo102381Y5(jVar);
                        } else {
                            boolean c = this.f215798f.mo102143c(jVar.field_packageName, jVar.field_openId);
                            Log.m105925i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP success[%s]", Boolean.valueOf(c));
                            if (!c) {
                                mo102381Y5(jVar);
                            }
                        }
                    } else if (i == 1) {
                        Log.m105925i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP NATIVE ForwardUrl[%s]", jVar.f149249Q0);
                        ((C40030e) C15134f0.C15135a.m14248a()).mo62719c(this.f215752d.f193286j.getContext(), jVar.f149249Q0, false, new C44814c(this));
                    }
                } else {
                    mo102381Y5(jVar);
                }
            }
        } else if (jVar.field_status == 3) {
            Log.m105920e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSeleted fail, app is in blacklist, packageName = " + jVar.field_packageName);
        } else if (!this.f215798f.mo102143c(jVar.field_packageName, jVar.field_openId) && jVar.field_status == 5) {
            Log.m105919d("MicroMsg.ChattingUI.AppMsgComponent", "SuggestionApp appSuggestionIntroUrl = %s", jVar.f149250R);
            if (!Util.isNullOrNil(jVar.f149250R)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", jVar.f149250R);
                C88144b.m109791i(this.f215752d.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C77302a c = C77302a.m93123c(this.f215752d.mo91574o().getUsername(), 1);
        this.f215797e = c;
        c.mo107446a(1, this.f215752d.mo91574o().getUsername());
        C72709y1.vx0().add(this.f215799g);
        C72709y1.yx0().add(this.f215800h);
        if (this.f215798f == null) {
            this.f215798f = new C73323b5(this.f215752d);
        }
        C73323b5.f215434d.add(this.f215798f, (Looper) null);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        mo102382Z5();
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        mo102382Z5();
    }
}
