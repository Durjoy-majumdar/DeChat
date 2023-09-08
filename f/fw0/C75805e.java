package fw0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import ck3.C67391b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.chatting.C73309a2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.p136ui.tools.C45074p;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68778t4;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ex0.C20642c;
import j20.C117292a;
import java.util.ArrayList;
import p248ug.C52558c;
import p680ru.C77569h;
import s90.C77630j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: fw0.e */
public class C75805e extends C86301e implements C20642c {

    /* renamed from: fw0.e$a */
    public class C75806a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f222423d;

        public C75806a(C75805e eVar, C19623o0 o0Var) {
            this.f222423d = o0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/bbom/BizTimeLineServices$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C73309a2.m86451d(view, view.getContext(), this.f222423d.field_talker);
            C117292a.m165361g(this, "com/tencent/mm/plugin/bbom/BizTimeLineServices$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fw0.e$b */
    public class C75807b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f222424d;

        /* renamed from: e */
        public final /* synthetic */ C77630j f222425e;

        /* renamed from: f */
        public final /* synthetic */ int f222426f;

        /* renamed from: g */
        public final /* synthetic */ C68778t4 f222427g;

        /* renamed from: h */
        public final /* synthetic */ int f222428h;

        public C75807b(C75805e eVar, C19623o0 o0Var, C77630j jVar, int i, C68778t4 t4Var, int i2) {
            this.f222424d = o0Var;
            this.f222425e = jVar;
            this.f222426f = i;
            this.f222427g = t4Var;
            this.f222428h = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0209  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r24) {
            /*
                r23 = this;
                r6 = r23
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7 = r24
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/bbom/BizTimeLineServices$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r23
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                by0.a r0 = by0.C16825a.f45444a
                com.tencent.mm.storage.o0 r1 = r6.f222424d
                java.lang.String r2 = "PAUSE_FOR_RESUME"
                r0.mo17864b(r1, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
                int r1 = (int) r0
                s90.j r0 = r6.f222425e
                java.lang.String r2 = r0.f226325d
                java.lang.String r0 = com.tencent.p014mm.message.C92721n.m116882j(r0)
                int r13 = r6.f222426f
                java.lang.Class<ex0.d> r3 = ex0.C45696d.class
                android.content.Context r4 = r24.getContext()
                java.lang.Object r5 = r24.getTag()
                com.tencent.mm.ui.chatting.viewitems.t8 r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r5
                com.tencent.mm.storage.o0 r14 = r5.f217954F
                java.lang.String r15 = "MicroMsg.ChattingItemHelper"
                if (r14 != 0) goto L_0x0056
                java.lang.String r0 = "onBizTimeLineWebViewClick info is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            L_0x0052:
                r22 = r1
                goto L_0x0205
            L_0x0056:
                boolean r7 = r4 instanceof android.app.Activity
                r8 = 10000(0x2710, float:1.4013E-41)
                if (r7 == 0) goto L_0x006c
                r7 = r4
                android.app.Activity r7 = (android.app.Activity) r7
                android.content.Intent r7 = r7.getIntent()
                java.lang.String r9 = "KOpenArticleSceneFromScene"
                int r7 = r7.getIntExtra(r9, r8)
                r20 = r7
                goto L_0x006e
            L_0x006c:
                r20 = 10000(0x2710, float:1.4013E-41)
            L_0x006e:
                r12 = 1
                java.lang.Object[] r7 = new java.lang.Object[r12]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                r16 = 0
                r7[r16] = r8
                java.lang.String r8 = "onWebViewClick = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r8, r7)
                java.lang.String r7 = r5.f217992z
                java.lang.String r8 = r14.field_talker
                r11 = 0
                boolean r7 = com.tencent.p014mm.p136ui.chatting.C73750m0.m87347a(r7, r4, r11, r8)
                if (r7 == 0) goto L_0x008b
                goto L_0x0052
            L_0x008b:
                java.lang.String r7 = r5.f217968b
                if (r7 == 0) goto L_0x0052
                java.lang.String r8 = ""
                boolean r8 = r7.equals(r8)
                if (r8 == 0) goto L_0x0098
                goto L_0x0052
            L_0x0098:
                eb0.c r8 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.u3 r8 = r8.mo105907v()
                java.lang.String r9 = r14.field_talker
                com.tencent.mm.storage.z1 r17 = r8.get(r9)
                boolean r8 = r14.mo25758F2()
                if (r8 != 0) goto L_0x00b9
                if (r17 == 0) goto L_0x00b9
                boolean r8 = r17.mo62927s3()
                if (r8 != 0) goto L_0x00b9
                r8 = 157(0x9d, float:2.2E-43)
                r19 = 157(0x9d, float:2.2E-43)
                goto L_0x00bd
            L_0x00b9:
                r8 = 90
                r19 = 90
            L_0x00bd:
                r18 = 0
                java.lang.String r21 = ""
                r8 = r19
                r9 = r20
                r10 = r1
                r22 = r1
                r1 = r11
                r11 = r18
                r1 = 1
                r12 = r21
                java.lang.String r7 = com.tencent.p014mm.message.C92721n.m116875c(r7, r8, r9, r10, r11, r12, r13)
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                java.lang.String r9 = "rawUrl"
                r8.putExtra(r9, r7)
                java.lang.String r9 = "shortUrl"
                r8.putExtra(r9, r7)
                java.lang.String r9 = "webpageTitle"
                r8.putExtra(r9, r2)
                java.lang.String r2 = "thumbUrl"
                r8.putExtra(r2, r0)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                if (r17 == 0) goto L_0x010d
                boolean r2 = r17.mo62916m3()
                if (r2 == 0) goto L_0x010d
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r9 = r17.getUsername()
                r2[r16] = r9
                java.lang.String r9 = "hakon click biz msg %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r9, r2)
                r16 = 4
                r2 = 4
                goto L_0x010e
            L_0x010d:
                r2 = 0
            L_0x010e:
                long r9 = r14.field_msgId
                java.lang.String r11 = "msg_id"
                r8.putExtra(r11, r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "msg_"
                r9.append(r10)
                long r11 = r14.field_msgSvrId
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                java.lang.String r11 = "KPublisherId"
                r8.putExtra(r11, r9)
                java.lang.String r9 = r14.field_talker
                java.lang.String r11 = "pre_username"
                r8.putExtra(r11, r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                long r10 = r14.field_msgSvrId
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "prePublishId"
                r8.putExtra(r10, r9)
                java.lang.String r9 = r14.field_talker
                java.lang.String r10 = "preUsername"
                r8.putExtra(r10, r9)
                java.lang.String r9 = r14.field_talker
                java.lang.String r10 = "preChatName"
                r8.putExtra(r10, r9)
                r9 = 7
                java.lang.String r10 = "preChatTYPE"
                r8.putExtra(r10, r9)
                int r9 = r5.f217950B
                java.lang.String r10 = "preMsgIndex"
                r8.putExtra(r10, r9)
                android.os.Bundle r9 = r5.f217953E
                if (r9 == 0) goto L_0x0172
                r8.putExtras(r9)
            L_0x0172:
                java.lang.String r9 = "snsWebSource"
                r0.putInt(r9, r2)
                java.lang.String r2 = "jsapiargs"
                r8.putExtra(r2, r0)
                java.lang.String r0 = r14.field_talker
                java.lang.String r2 = "geta8key_username"
                r8.putExtra(r2, r0)
                java.lang.String r0 = r5.f217972f
                boolean r0 = sf0.C77702q0.m93719b(r0)
                if (r0 != 0) goto L_0x01a1
                java.lang.String r0 = r5.f217972f
                java.lang.String r2 = "srcUsername"
                r8.putExtra(r2, r0)
                java.lang.String r0 = r5.f217973g
                java.lang.String r2 = "srcDisplayname"
                r8.putExtra(r2, r0)
                java.lang.String r0 = "mode"
                r8.putExtra(r0, r1)
            L_0x01a1:
                long r9 = r5.f217949A
                java.lang.String r0 = "message_id"
                r8.putExtra(r0, r9)
                int r0 = r5.f217950B
                java.lang.String r2 = "message_index"
                r8.putExtra(r2, r0)
                java.lang.String r0 = "from_scence"
                r8.putExtra(r0, r1)
                int r0 = r5.f217951C
                java.lang.String r2 = "geta8key_scene"
                r8.putExtra(r2, r0)
                r0 = 536870912(0x20000000, float:1.0842022E-19)
                r8.addFlags(r0)
                long r9 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = "start_activity_time"
                r8.putExtra(r0, r9)
                java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j
                int r2 = r5.f217955G
                r8.putExtra(r0, r2)
                k40.a r0 = f40.C86709a0.m107533q(r3)
                ex0.d r0 = (ex0.C45696d) r0
                boolean r0 = r0.mo70957E5(r1)
                if (r0 == 0) goto L_0x01fc
                k40.a r0 = f40.C86709a0.m107533q(r3)
                r14 = r0
                ex0.d r14 = (ex0.C45696d) r14
                int r0 = r5.f217955G
                r18 = 0
                r1 = r15
                r15 = r4
                r16 = r7
                r17 = r0
                r21 = r8
                boolean r0 = r14.Ms0(r15, r16, r17, r18, r19, r20, r21)
                if (r0 == 0) goto L_0x01fc
                java.lang.String r0 = "jump to TmplWebview"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                goto L_0x0205
            L_0x01fc:
                java.lang.String r0 = "webview"
                java.lang.String r1 = ".ui.tools.WebViewUI"
                r2 = 0
                ke3.C88144b.m109791i(r4, r0, r1, r8, r2)
            L_0x0205:
                com.tencent.mm.plugin.brandservice.ui.timeline.t4 r0 = r6.f222427g
                if (r0 == 0) goto L_0x0216
                com.tencent.mm.storage.o0 r1 = r6.f222424d
                s90.j r2 = r6.f222425e
                java.lang.String r2 = r2.f226326e
                int r3 = r6.f222428h
                r4 = r22
                r0.mo23171a(r1, r2, r3, r4)
            L_0x0216:
                java.lang.String r0 = "com/tencent/mm/plugin/bbom/BizTimeLineServices$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fw0.C75805e.C75807b.onClick(android.view.View):void");
        }
    }

    /* renamed from: DF */
    public void mo32314DF(View view, long j, String str, String str2, int i) {
        C74244u.C74254i iVar = new C74244u.C74254i();
        iVar.f218013b = j;
        iVar.f218016e = i;
        iVar.f218015d = str2;
        iVar.f218014c = str;
        view.setTag(iVar);
    }

    public long Eh0(View view) {
        C73309a2.m86452e(view);
        if (view.getTag() instanceof C74244u.C74254i) {
            return ((C74244u.C74254i) view.getTag()).f218013b;
        }
        return 0;
    }

    /* renamed from: Gz */
    public void mo32316Gz(C72963f4 f4Var, Context context) {
        C73309a2.m86453f(f4Var, context, (C67391b) null);
    }

    /* renamed from: iv */
    public void mo32317iv(View view, long j, String str, String str2, String str3, String str4, String str5, String str6) {
        C74244u.C74254i iVar = new C74244u.C74254i();
        C74244u.C44867j jVar = new C74244u.C44867j();
        iVar.f218012a = jVar;
        jVar.f121724c = str2;
        jVar.f121723b = str3;
        jVar.f121722a = str;
        jVar.f121727f = str6;
        jVar.f121725d = str4;
        view.setTag(iVar);
    }

    /* renamed from: lA */
    public void mo32318lA(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z, int i) {
        C45074p.m49920b(cVar, activity, z1Var, z, (Runnable) null, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: pK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32319pK(s90.C77630j r28, com.tencent.p014mm.storage.C19623o0 r29, int r30, s90.C77629i r31, android.view.View r32, boolean r33, int r34, com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68778t4 r35) {
        /*
            r27 = this;
            r7 = r28
            r8 = r29
            r0 = r31
            r9 = r32
            r10 = r34
            java.lang.Class<ex0.d> r11 = ex0.C45696d.class
            java.lang.Class<d62.i> r1 = d62.C75339i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            d62.i r1 = (d62.C75339i) r1
            java.lang.String r2 = r8.field_talker
            java.lang.String r26 = r1.getDisplayName(r2)
            java.lang.String r1 = r7.f226326e
            java.lang.String r2 = r8.field_talker
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r6 = 1
            r5 = 0
            r4 = 0
            if (r3 != 0) goto L_0x0094
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "http://"
            r3.append(r12)
            r12 = 2131831344(0x7f112a30, float:1.929571E38)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r12)
            r3.append(r12)
            java.lang.String r12 = "/emoticonstore/"
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0094
            java.lang.String r3 = "/"
            int r3 = r1.lastIndexOf(r3)
            int r3 = r3 + r6
            java.lang.String r1 = r1.substring(r3)
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r3.get(r2)
            boolean r12 = r3.mo62927s3()
            if (r12 == 0) goto L_0x0094
            boolean r3 = r3.mo62916m3()
            if (r3 == 0) goto L_0x0094
            ug.c r2 = rb0.C47984k.m53328b(r2)
            if (r2 == 0) goto L_0x0094
            ug.c$b r2 = r2.mo73500r2(r5)
            if (r2 == 0) goto L_0x0094
            java.lang.String r3 = r2.mo73518k()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0094
            java.lang.String r2 = r2.mo73518k()
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0094
            r22 = r1
            goto L_0x0096
        L_0x0094:
            r22 = r4
        L_0x0096:
            uj3.d r15 = new uj3.d
            r3 = r30
            r15.<init>(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r22)
            if (r1 != 0) goto L_0x00d1
            com.tencent.mm.ui.chatting.viewitems.t8 r4 = new com.tencent.mm.ui.chatting.viewitems.t8
            r13 = 0
            r14 = 0
            java.lang.String r1 = r7.f226326e
            java.lang.String r2 = r0.f226292f
            java.lang.String r0 = r0.f226293g
            java.lang.String r3 = r7.f226325d
            r23 = 0
            r24 = 0
            r25 = 0
            r12 = r4
            r16 = r1
            r17 = r33
            r18 = r26
            r19 = r2
            r20 = r0
            r21 = r3
            r12.<init>((com.tencent.p014mm.storage.C72963f4) r13, (boolean) r14, (uj3.C78208e) r15, (java.lang.String) r16, (boolean) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (boolean) r24, (boolean) r25)
            fw0.e$a r0 = new fw0.e$a
            r2 = r27
            r0.<init>(r2, r8)
            r9.setOnClickListener(r0)
            goto L_0x0159
        L_0x00d1:
            r2 = r27
            java.lang.String r1 = r7.f226326e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0159
            com.tencent.mm.ui.chatting.viewitems.t8 r4 = new com.tencent.mm.ui.chatting.viewitems.t8
            r13 = 0
            r14 = 0
            java.lang.String r1 = r7.f226326e
            java.lang.String r12 = r0.f226292f
            java.lang.String r0 = r0.f226293g
            java.lang.String r5 = r7.f226325d
            r19 = r12
            r12 = r4
            r16 = r1
            r17 = r33
            r18 = r26
            r20 = r0
            r21 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 56
            r4.f217951C = r0
            int r0 = r7.f226333o
            r4.f217955G = r0
            java.lang.String r0 = r8.field_talker
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r5 = r7.f226326e
            java.lang.String r12 = "share_report_pre_msg_url"
            r1.putString(r12, r5)
            java.lang.String r5 = r7.f226325d
            java.lang.String r12 = "share_report_pre_msg_title"
            r1.putString(r12, r5)
            java.lang.String r5 = r7.f226332n
            java.lang.String r12 = "share_report_pre_msg_desc"
            r1.putString(r12, r5)
            java.lang.String r5 = com.tencent.p014mm.message.C92721n.m116882j(r28)
            java.lang.String r12 = "share_report_pre_msg_icon_url"
            r1.putString(r12, r5)
            java.lang.String r5 = "share_report_pre_msg_appid"
            java.lang.String r12 = ""
            r1.putString(r5, r12)
            r5 = 5
            java.lang.String r12 = "share_report_from_scene"
            r1.putInt(r12, r5)
            java.lang.String r5 = "share_report_biz_username"
            r1.putString(r5, r0)
            r4.f217953E = r1
            fw0.e$b r12 = new fw0.e$b
            r0 = r12
            r1 = r27
            r2 = r29
            r3 = r28
            r13 = r4
            r4 = r30
            r14 = 0
            r5 = r35
            r15 = 1
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.setOnClickListener(r12)
            r4 = r13
            goto L_0x015b
        L_0x0159:
            r14 = 0
            r15 = 1
        L_0x015b:
            if (r4 == 0) goto L_0x0168
            long r0 = r8.field_msgSvrId
            r4.f217949A = r0
            r4.f217950B = r10
            r4.f217954F = r8
            r9.setTag(r4)
        L_0x0168:
            java.lang.String r0 = r7.f226336r
            sg.g<java.lang.Long, s90.i> r1 = com.tencent.p014mm.message.C92721n.f266840a
            boolean r0 = kb0.C9576e.m9260a(r0)
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = r8.field_talker
            if (r9 == 0) goto L_0x017e
            com.tencent.mm.ui.chatting.z1 r1 = new com.tencent.mm.ui.chatting.z1
            r1.<init>(r7, r0)
            r9.setOnClickListener(r1)
        L_0x017e:
            r0 = 90
            r1 = 2
            if (r10 < r1) goto L_0x0187
            boolean r2 = r8.field_isExpand
            if (r2 == 0) goto L_0x01ba
        L_0x0187:
            k40.a r2 = f40.C86709a0.m107533q(r11)
            ex0.d r2 = (ex0.C45696d) r2
            boolean r2 = r2.mo70957E5(r15)
            if (r2 == 0) goto L_0x01ba
            java.lang.String r2 = r7.f226326e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x01ba
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r14] = r26
            java.lang.String r2 = r7.f226325d
            r1[r15] = r2
            java.lang.String r2 = "MicroMsg.BizTimeLineServices"
            java.lang.String r3 = "terry trace: preload %s:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r1)
            k40.a r1 = f40.C86709a0.m107533q(r11)
            ex0.d r1 = (ex0.C45696d) r1
            java.lang.String r2 = r7.f226326e
            int r3 = r7.f226333o
            java.lang.Object[] r4 = new java.lang.Object[r14]
            r1.Tn0(r2, r3, r0, r4)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw0.C75805e.mo32319pK(s90.j, com.tencent.mm.storage.o0, int, s90.i, android.view.View, boolean, int, com.tencent.mm.plugin.brandservice.ui.timeline.t4):void");
    }

    /* renamed from: qA */
    public void mo32320qA(C72963f4 f4Var, Activity activity) {
        if (!f4Var.mo101020w3()) {
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C96787m0.m124256j(doFavoriteEvent, f4Var);
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
            aVar.f264684i = activity;
            aVar.f264688m = 43;
            doFavoriteEvent.publish();
            if (doFavoriteEvent.f264675e.f9046a == 0) {
                ((C77569h) C86312j.m106911c(C77569h.class)).mo35241nt(f4Var);
            }
        }
    }

    /* renamed from: u0 */
    public void mo32321u0() {
        MMAppMgr.m85988h(true);
    }

    public void ue0(long j, int i, Context context, Fragment fragment, Activity activity, C72963f4 f4Var) {
        C73309a2.m86448a(j, i, context, fragment, activity, f4Var);
    }

    /* renamed from: z3 */
    public int mo32323z3() {
        Integer num = C74720p.f219683U0.get("officialaccounts");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
