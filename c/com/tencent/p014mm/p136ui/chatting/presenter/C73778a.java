package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import dk3.C75414f;
import eb0.C97625j3;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import js0.C76443c;
import js0.C76445d;
import js0.C76447f;
import js0.C9515s;
import kb0.C76529i;
import kg3.C76577a;
import lb0.C88394b;
import nj3.C11184p0;
import qo3.C77407n;
import rk3.C63462a;
import uj3.C78211g;

/* renamed from: com.tencent.mm.ui.chatting.presenter.a */
public class C73778a extends C73787b {

    /* renamed from: p */
    public C20937c f216547p;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.a$a */
    public class C73779a implements C76445d.C76446a {

        /* renamed from: a */
        public final /* synthetic */ boolean f216548a;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.a$a$a */
        public class C73780a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f216550d;

            public C73780a(LinkedList linkedList) {
                this.f216550d = linkedList;
            }

            public void run() {
                C73780a aVar = this;
                if (!Util.isNullOrNil((List) aVar.f216550d)) {
                    Iterator it = aVar.f216550d.iterator();
                    while (it.hasNext()) {
                        C76447f fVar = (C76447f) it.next();
                        if (fVar != null) {
                            C73785d dVar = r3;
                            C73785d dVar2 = new C73785d(C73778a.this, fVar.f223775a, fVar.f223776b, fVar.f223777c, fVar.f223778d, fVar.f223779e, fVar.f223780f, fVar.f223781g, fVar.f223782h, fVar.f223783i, fVar.f223784j, fVar.f223785k, fVar.f223786l, fVar.f223787m, fVar.f223788n);
                            aVar = this;
                            C73778a.this.f216572i.add(dVar);
                            it = it;
                        }
                    }
                }
                C73779a aVar2 = C73779a.this;
                C73778a aVar3 = C73778a.this;
                ArrayList<C78211g.C78216c> arrayList = aVar3.f216572i;
                aVar3.f216573j = arrayList;
                C75414f fVar2 = aVar3.f216569f;
                if (fVar2 != null) {
                    fVar2.mo102730k(aVar2.f216548a, arrayList.size());
                }
            }
        }

        public C73779a(boolean z) {
            this.f216548a = z;
        }

        /* renamed from: a */
        public void mo102831a(LinkedList<C76447f> linkedList) {
            C73780a aVar = new C73780a(linkedList);
            if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                MMHandlerThread.postToMainThread(aVar);
            } else {
                aVar.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.a$b */
    public class C73781b implements C78211g.C78219f {

        /* renamed from: com.tencent.mm.ui.chatting.presenter.a$b$a */
        public class C73782a implements View.OnCreateContextMenuListener {
            public C73782a(C73781b bVar) {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.n3j));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.presenter.a$b$b */
        public class C73783b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C78211g.C78216c f216553d;

            public C73783b(C78211g.C78216c cVar) {
                this.f216553d = cVar;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C73778a.this.mo102845t(menuItem.getItemId(), ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f216553d.f229172d), 5);
            }
        }

        public C73781b() {
        }

        /* renamed from: a */
        public void mo102833a(View view, int i, C78211g.C78216c cVar) {
            Log.m105925i("MicroMsg.AppBrandHistoryListPresenter", "[onItemLongClick] position:%s", Integer.valueOf(i));
            C63462a.f180011a.mo88333h(14, 5);
            new C45082x0(view.getContext()).mo70436b(view, new C73782a(this), new C73783b(cVar), (C77407n.C47880p) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0188 A[SYNTHETIC, Splitter:B:38:0x0188] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x01c3  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo102834b(android.view.View r19, int r20, uj3.C78211g.C78216c r21) {
            /*
                r18 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.AppBrandHistoryListPresenter"
                java.lang.String r4 = "[onItemClick] position:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
                r1 = r18
                com.tencent.mm.ui.chatting.presenter.a r4 = com.tencent.p014mm.p136ui.chatting.presenter.C73778a.this
                r5 = r21
                com.tencent.mm.ui.chatting.presenter.a$d r5 = (com.tencent.p014mm.p136ui.chatting.presenter.C73778a.C73785d) r5
                java.lang.String r6 = r4.f216568e
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
                r7 = 3
                java.lang.Object[] r8 = new java.lang.Object[r7]
                com.tencent.mm.message.l$b r9 = r5.f216559k
                java.lang.String r10 = r9.f195573f2
                r8[r3] = r10
                java.lang.String r10 = r5.f216558j
                r8[r0] = r10
                int r9 = r9.f195653z2
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10 = 2
                r8[r10] = r9
                java.lang.String r9 = "username: %s , appid %s ,pkgType : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r8)
                java.lang.String r8 = r4.f216568e
                java.lang.String r9 = r5.f229173e
                android.os.Bundle r15 = new android.os.Bundle
                r15.<init>()
                r11 = 9
                java.lang.String r12 = "stat_scene"
                r15.putInt(r12, r11)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r14 = "msg_"
                r11.append(r14)
                long r12 = r5.f216560l
                java.lang.String r12 = java.lang.Long.toString(r12)
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.String r12 = "stat_msg_id"
                r15.putString(r12, r11)
                java.lang.String r11 = "stat_chat_talker_username"
                r15.putString(r11, r8)
                java.lang.String r11 = "stat_send_msg_user"
                r15.putString(r11, r9)
                com.tencent.mm.message.l$b r11 = r5.f216559k
                int r12 = r11.f195581h2
                r13 = 0
                if (r12 == r0) goto L_0x008a
                if (r12 == r10) goto L_0x0086
                if (r12 == r7) goto L_0x0082
                r7 = 1
                goto L_0x00eb
            L_0x0082:
                kb0.C88132b.m109737g(r8, r9, r6, r11, r15)
                goto L_0x00ea
            L_0x0086:
                kb0.C88132b.m109736f(r8, r9, r6, r11, r15)
                goto L_0x00ea
            L_0x008a:
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                com.tencent.mm.message.l$b r11 = r5.f216559k
                java.lang.String r11 = r11.f195573f2
                java.lang.String r12 = "key_username"
                r7.putExtra(r12, r11)
                java.lang.String r11 = "key_scene_note"
                java.lang.String r12 = "key_from_scene"
                if (r6 == 0) goto L_0x00b9
                r7.putExtra(r12, r0)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r8)
                java.lang.String r8 = ":"
                r12.append(r8)
                r12.append(r9)
                java.lang.String r8 = r12.toString()
                r7.putExtra(r11, r8)
                goto L_0x00bf
            L_0x00b9:
                r7.putExtra(r12, r10)
                r7.putExtra(r11, r8)
            L_0x00bf:
                java.lang.String r8 = "_stat_obj"
                r7.putExtra(r8, r15)
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r8 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
                r8.<init>()
                java.lang.String r9 = r5.f216558j
                r8.f239557a = r9
                r9 = 6
                r8.f239566j = r9
                com.tencent.mm.message.l$b r9 = r5.f216559k
                int r9 = r9.f195653z2
                r8.f239564h = r9
                r8.f239563g = r3
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r8 = r8.mo113977a()
                java.lang.String r9 = "key_scene_exposed_params"
                r7.putExtra(r9, r8)
                android.content.Context r8 = r4.f216567d
                java.lang.String r9 = "appbrand"
                java.lang.String r11 = ".ui.AppBrandProfileUI"
                ke3.C88144b.m109791i(r8, r9, r11, r7, r13)
            L_0x00ea:
                r7 = 0
            L_0x00eb:
                if (r7 == 0) goto L_0x0116
                com.tencent.mm.message.l$b r8 = r5.f216559k
                int r8 = r8.f195582i
                r9 = 36
                if (r8 != r9) goto L_0x0116
                java.lang.Class<kr0.x0> r7 = kr0.C76630x0.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                r11 = r7
                kr0.x0 r11 = (kr0.C76630x0) r11
                android.content.Context r12 = r4.f216567d
                java.lang.String r7 = r4.f216568e
                java.lang.String r8 = r5.f229173e
                r9 = 1
                com.tencent.mm.message.l$b r10 = r5.f216559k
                r13 = r7
                r7 = r14
                r14 = r8
                r8 = r15
                r15 = r9
                r16 = r10
                r17 = r8
                r11.mo106897rj(r12, r13, r14, r15, r16, r17)
                r8 = r7
                r7 = 0
                goto L_0x0117
            L_0x0116:
                r8 = r14
            L_0x0117:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
                r0[r3] = r9
                java.lang.String r9 = "goDefaultClickAction %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r0)
                if (r7 != 0) goto L_0x0128
                goto L_0x0297
            L_0x0128:
                if (r7 == 0) goto L_0x0297
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195586j
                if (r0 == 0) goto L_0x0297
                java.lang.String r7 = ""
                boolean r0 = r0.equals(r7)
                if (r0 != 0) goto L_0x0297
                java.lang.Class<ym.p> r0 = p763ym.C79139p.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ym.p r0 = (p763ym.C79139p) r0
                com.tencent.mm.message.l$b r9 = r5.f216559k
                java.lang.String r9 = r9.f195586j
                if (r6 == 0) goto L_0x0149
                java.lang.String r6 = "groupmessage"
                goto L_0x014b
            L_0x0149:
                java.lang.String r6 = "singlemessage"
            L_0x014b:
                java.lang.String r0 = r0.mo108862K3(r9, r6)
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                java.lang.String r9 = "rawUrl"
                r6.putExtra(r9, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195570f
                java.lang.String r9 = "webpageTitle"
                r6.putExtra(r9, r0)
                android.content.Context r0 = r4.f216567d
                com.tencent.mm.message.l$b r10 = r5.f216559k
                java.lang.String r10 = r10.f195562d
                if (r10 == 0) goto L_0x0184
                int r11 = r10.length()
                if (r11 != 0) goto L_0x0172
                goto L_0x0184
            L_0x0172:
                java.lang.Class<ym.l> r11 = p763ym.C79138l.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                ym.l r11 = (p763ym.C79138l) r11
                com.tencent.mm.pluginsdk.model.app.j r10 = r11.getAppInfo(r10)
                if (r10 != 0) goto L_0x0181
                goto L_0x0184
            L_0x0181:
                java.lang.String r13 = r10.field_packageName
                goto L_0x0185
            L_0x0184:
                r13 = 0
            L_0x0185:
                if (r13 != 0) goto L_0x0188
                goto L_0x0197
            L_0x0188:
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0191 }
                android.content.pm.PackageInfo r13 = r0.getPackageInfo(r13, r3)     // Catch:{ NameNotFoundException -> 0x0191 }
                goto L_0x0198
            L_0x0191:
                r0 = move-exception
                java.lang.Object[] r10 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r7, r10)
            L_0x0197:
                r13 = 0
            L_0x0198:
                if (r13 != 0) goto L_0x019c
                r0 = 0
                goto L_0x019e
            L_0x019c:
                java.lang.String r0 = r13.versionName
            L_0x019e:
                java.lang.String r2 = "version_name"
                r6.putExtra(r2, r0)
                if (r13 != 0) goto L_0x01a8
                r0 = 0
                goto L_0x01aa
            L_0x01a8:
                int r0 = r13.versionCode
            L_0x01aa:
                java.lang.String r2 = "version_code"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195586j
                java.lang.String r2 = "shortUrl"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195634v
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x01d7
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195634v
                java.lang.String r2 = "srcUsername"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195638w
                java.lang.String r2 = "srcDisplayname"
                r6.putExtra(r2, r0)
            L_0x01d7:
                long r10 = r5.f229172d
                java.lang.String r0 = "msg_id"
                r6.putExtra(r0, r10)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                long r10 = r5.f216560l
                java.lang.String r2 = java.lang.Long.toString(r10)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "KPublisherId"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195562d
                java.lang.String r2 = "KAppId"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195570f
                r6.putExtra(r9, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195646y
                java.lang.String r2 = "thumbUrl"
                r6.putExtra(r2, r0)
                java.lang.String r0 = r4.f216568e
                java.lang.String r2 = "geta8key_username"
                r6.putExtra(r2, r0)
                java.lang.String r0 = r5.f229173e
                java.lang.String r2 = "pre_username"
                r6.putExtra(r2, r0)
                java.lang.String r0 = "from_scence"
                r2 = 2
                r6.putExtra(r0, r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                long r7 = r5.f216560l
                java.lang.String r2 = java.lang.Long.toString(r7)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "prePublishId"
                r6.putExtra(r2, r0)
                java.lang.String r0 = r5.f229173e
                java.lang.String r2 = "preUsername"
                r6.putExtra(r2, r0)
                java.lang.String r0 = r4.f216568e
                java.lang.String r2 = "preChatName"
                r6.putExtra(r2, r0)
                java.lang.String r0 = "preChatTYPE"
                r2 = 2
                r6.putExtra(r0, r2)
                java.lang.String r0 = "preMsgIndex"
                r6.putExtra(r0, r3)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195586j
                java.lang.String r2 = "share_report_pre_msg_url"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195570f
                java.lang.String r2 = "share_report_pre_msg_title"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195574g
                java.lang.String r2 = "share_report_pre_msg_desc"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195646y
                java.lang.String r2 = "share_report_pre_msg_icon_url"
                r6.putExtra(r2, r0)
                com.tencent.mm.message.l$b r0 = r5.f216559k
                java.lang.String r0 = r0.f195562d
                java.lang.String r2 = "share_report_pre_msg_appid"
                r6.putExtra(r2, r0)
                java.lang.String r0 = "share_report_from_scene"
                r2 = 2
                r6.putExtra(r0, r2)
                android.content.Context r0 = r4.f216567d
                java.lang.String r2 = "webview"
                java.lang.String r3 = ".ui.tools.WebViewUI"
                r4 = 0
                ke3.C88144b.m109791i(r0, r2, r3, r6, r4)
            L_0x0297:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C73778a.C73781b.mo102834b(android.view.View, int, uj3.g$c):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.a$c */
    public class C73784c implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ C73786e f216555d;

        /* renamed from: e */
        public final /* synthetic */ C73785d f216556e;

        public C73784c(C73786e eVar, C73785d dVar) {
            this.f216555d = eVar;
            this.f216556e = dVar;
        }

        /* renamed from: b */
        public void mo1907b() {
            C20828a.m22825b().mo32519h(this.f216556e.f216562n, this.f216555d.f216564E, C73778a.this.f216547p);
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return "SEARCH#" + C9515s.m9209a(this);
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                C20828a.m22825b().mo32519h(this.f216556e.f216562n, this.f216555d.f216564E, C73778a.this.f216547p);
            } else {
                this.f216555d.f216564E.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.a$d */
    public class C73785d extends C78211g.C78216c {

        /* renamed from: j */
        public String f216558j;

        /* renamed from: k */
        public C68070l.C68072b f216559k;

        /* renamed from: l */
        public long f216560l;

        /* renamed from: m */
        public String f216561m;

        /* renamed from: n */
        public String f216562n;

        /* renamed from: o */
        public String f216563o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73785d(C73778a aVar, long j, int i, String str, long j2, String str2, String str3, String str4, String str5, String str6, C68070l.C68072b bVar, long j3, String str7, String str8, String str9) {
            super(j, i, str, j2, str2, str3, str4, str5);
            this.f216558j = str6;
            this.f216559k = bVar;
            this.f216560l = j3;
            this.f216561m = str7;
            this.f216562n = str8;
            this.f216563o = str9;
        }

        /* renamed from: a */
        public int mo102836a() {
            return 33;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            if (!mo108239b(lowerCase)) {
                if (!Util.isNullOrNil(this.f216561m) && mo108240c(lowerCase, this.f216561m.toLowerCase())) {
                    return true;
                }
            } else if (!Util.isNullOrNil(this.f216561m) && this.f216561m.toLowerCase().contains(lowerCase)) {
                return true;
            }
            return super.mo102837d(lowerCase);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.a$e */
    public class C73786e extends C78211g.C78213b {

        /* renamed from: E */
        public ImageView f216564E;

        /* renamed from: F */
        public ImageView f216565F;

        /* renamed from: G */
        public TextView f216566G;

        public C73786e(C73778a aVar, View view) {
            super(view);
            this.f216564E = (ImageView) view.findViewById(C0966R.C0970id.cv_);
            this.f216565F = (ImageView) view.findViewById(C0966R.C0970id.cve);
            this.f216566G = (TextView) view.findViewById(C0966R.C0970id.cuv);
            ((TextView) view.findViewById(C0966R.C0970id.cw9)).setVisibility(8);
            this.f216565F.setVisibility(8);
        }
    }

    public C73778a(Context context) {
        super(context);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 50);
        int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 50);
        bVar.f59354j = b;
        bVar.f59355k = b2;
        bVar.f59345a = true;
        this.f216547p = bVar.mo32666a();
    }

    /* renamed from: c */
    public String mo102824c() {
        return this.f216567d.getString(C0966R.string.iga);
    }

    /* renamed from: e */
    public String mo102825e() {
        return this.f216567d.getString(C0966R.string.iga);
    }

    /* renamed from: f */
    public void mo102826f(C78211g.C78213b bVar, int i, int i2) {
        C73786e eVar = (C73786e) bVar;
        C73785d dVar = (C73785d) mo102842q(i);
        C80995a aVar = (C80995a) dVar.f216559k.mo93555w(C80995a.class);
        if (aVar == null || aVar.f237911t != 1) {
            eVar.f216565F.setVisibility(8);
        } else {
            eVar.f216565F.setVisibility(0);
        }
        if (Util.isNullOrNil(dVar.f216561m)) {
            eVar.f216566G.setVisibility(8);
            C20828a.m22825b().mo32519h(dVar.f216562n, eVar.f216564E, this.f216547p);
            return;
        }
        eVar.f216566G.setVisibility(0);
        eVar.f216566G.setText(eVar.f229166C.getText());
        eVar.f229166C.setText(dVar.f216561m);
        eVar.mo108236y(eVar.f216566G, this.f216570g.f229163e);
        if (!Util.isNullOrNil(dVar.f216563o)) {
            String str = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122797p(new C73784c(eVar, dVar), dVar.f216563o, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(C76529i.class)).Ij0(45, 45));
            return;
        }
        C20828a.m22825b().mo32519h(dVar.f216562n, eVar.f216564E, this.f216547p);
    }

    /* renamed from: g */
    public void mo102827g(boolean z) {
        Class<C76445d> cls = C76445d.class;
        Log.m105925i("MicroMsg.AppBrandHistoryListPresenter", "[loadData] isFirst:%s", Boolean.valueOf(z));
        C75414f fVar = this.f216569f;
        if (fVar != null) {
            fVar.mo102729f(z);
        }
        LinkedList<C76447f> linkedList = C76445d.f223771a;
        synchronized (cls) {
            C76445d.f223773c = false;
            C76445d.f223774d = false;
            C76445d.f223771a.clear();
            C76445d.f223772b.clear();
        }
        String str = this.f216568e;
        C73779a aVar = new C73779a(z);
        synchronized (cls) {
            if (C76445d.f223773c) {
                C76445d.f223772b.add(aVar);
            } else if (C76445d.f223774d) {
                aVar.mo102831a(C76445d.f223771a);
            } else {
                C76445d.f223773c = true;
                C76445d.f223772b.add(aVar);
                C86709a0.m107528h();
                C86709a0.m107525e().postToWorker(new C76443c(str));
            }
        }
    }

    public int getType() {
        return 33;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo102829o(ViewGroup viewGroup, int i) {
        return new C73786e(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6509gr, viewGroup, false));
    }

    /* renamed from: p */
    public C78211g.C78219f mo102830p() {
        return new C73781b();
    }
}
