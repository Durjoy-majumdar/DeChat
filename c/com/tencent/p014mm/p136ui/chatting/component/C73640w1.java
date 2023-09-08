package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p270xi.C91212b;
import p646pn.C110234e;
import xv0.C112181e;
import xv0.C38856d;
import zj3.C79385v;

@C91212b(exportInterface = C79385v.class)
/* renamed from: com.tencent.mm.ui.chatting.component.w1 */
public final class C73640w1 extends C73412a implements C79385v, ChatFooter$$m1 {

    /* renamed from: e */
    public C67391b f216231e;

    /* renamed from: f */
    public ChatFooter f216232f;

    /* renamed from: g */
    public int f216233g = -1;

    /* renamed from: h */
    public int f216234h = -1;

    /* renamed from: i */
    public C112181e f216235i;

    /* renamed from: com.tencent.mm.ui.chatting.component.w1$a */
    public static final class C30833a implements C112181e.C112182a {

        /* renamed from: a */
        public final /* synthetic */ int f82847a;

        /* renamed from: b */
        public final /* synthetic */ boolean f82848b;

        /* renamed from: c */
        public final /* synthetic */ long f82849c;

        public C30833a(int i, boolean z, long j) {
            this.f82847a = i;
            this.f82848b = z;
            this.f82849c = j;
        }

        /* renamed from: a */
        public final void mo57750a(int i) {
            Log.m105925i("MicroMsg.FloatBallComponent", "alvinluo onChattingResume fromScene: %d, canShowMessageFloatBall: %b, addMessageBallResult: %d", Integer.valueOf(this.f82847a), Boolean.valueOf(this.f82848b), Integer.valueOf(i));
            C38856d Zc = ((C110234e) C86312j.m106911c(C110234e.class)).mo161398Zc();
            if (Zc != null) {
                Zc.mo22762b(this.f82849c, i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = (r0 = r0.f193286j).getArguments();
     */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26186F4() {
        /*
            r7 = this;
            xv0.e r0 = r7.f216235i
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r0.mo149104W(r1)
        L_0x0008:
            xv0.e r0 = r7.f216235i
            if (r0 == 0) goto L_0x0011
            r2 = 131072(0x20000, float:1.83671E-40)
            r0.mo149125i(r2)
        L_0x0011:
            ck3.b r0 = r7.f216231e
            r2 = 0
            if (r0 == 0) goto L_0x0027
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            if (r0 == 0) goto L_0x0027
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = "chat_from_scene"
            int r0 = r0.getInt(r3, r2)
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            ck3.b r3 = r7.f216231e
            java.lang.String r4 = "key_can_show_message_float_ball"
            if (r3 == 0) goto L_0x003d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r3 = r3.f193286j
            if (r3 == 0) goto L_0x003d
            android.os.Bundle r3 = r3.getArguments()
            if (r3 == 0) goto L_0x003d
            boolean r3 = r3.getBoolean(r4, r2)
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            xv0.e r5 = r7.f216235i
            if (r5 == 0) goto L_0x004a
            boolean r5 = r5.mo149090H()
            if (r5 != r1) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x0054
            java.lang.String r5 = "MicroMsg.FloatBallComponent"
            java.lang.String r6 = "alvinluo onChattingResume current is in QBFileViewPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
        L_0x0054:
            if (r0 != r1) goto L_0x009a
            if (r3 == 0) goto L_0x009a
            xv0.e r5 = r7.f216235i
            if (r5 == 0) goto L_0x0064
            boolean r5 = r5.mo149090H()
            if (r5 != 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x009a
            xv0.e r5 = r7.f216235i
            if (r5 == 0) goto L_0x006e
            r5.mo149121g(r1)
        L_0x006e:
            xv0.e r1 = r7.f216235i
            if (r1 == 0) goto L_0x0079
            long r5 = java.lang.System.currentTimeMillis()
            r1.mo149099R(r5)
        L_0x0079:
            ck3.b r1 = r7.f216231e
            if (r1 == 0) goto L_0x008a
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            if (r1 == 0) goto L_0x008a
            android.os.Bundle r1 = r1.getArguments()
            if (r1 == 0) goto L_0x008a
            r1.putBoolean(r4, r2)
        L_0x008a:
            long r1 = java.lang.System.currentTimeMillis()
            xv0.e r4 = r7.f216235i
            if (r4 == 0) goto L_0x009a
            com.tencent.mm.ui.chatting.component.w1$a r5 = new com.tencent.mm.ui.chatting.component.w1$a
            r5.<init>(r0, r3, r1)
            r4.mo149127j(r1, r5)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73640w1.mo26186F4():void");
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C112181e eVar = this.f216235i;
        if (eVar != null) {
            eVar.mo149104W(false);
        }
        C112181e eVar2 = this.f216235i;
        if (eVar2 != null) {
            eVar2.mo149143s(131072);
        }
    }

    /* renamed from: g3 */
    public void mo102664g3(ChatFooter chatFooter) {
        this.f216232f = chatFooter;
        if (chatFooter != null) {
            chatFooter.setOnFooterPanelSwitchListener(this);
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        ChatFooter chatFooter = this.f216232f;
        if (chatFooter != null) {
            chatFooter.setOnFooterPanelSwitchListener((ChatFooter$$m1) null);
        }
        this.f216232f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* renamed from: m4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo100543m4(int r13, int r14) {
        /*
            r12 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r3 = 1
            r0[r3] = r1
            int r1 = r12.f216233g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            int r1 = r12.f216234h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 3
            r0[r5] = r1
            java.lang.String r1 = "MicroMsg.FloatBallComponent"
            java.lang.String r6 = "alvinluo onFooterPanelSwitch panelType: %d, panelHeight: %d, last: %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r0)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r12.f216232f
            if (r0 == 0) goto L_0x0034
            int r0 = r0.getBarGroupHeight()
        L_0x0032:
            r8 = r0
            goto L_0x004d
        L_0x0034:
            ck3.b r0 = r12.f215752d
            if (r0 == 0) goto L_0x004c
            android.app.Activity r0 = r0.mo91565f()
            if (r0 == 0) goto L_0x004c
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x004c
            r1 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r0 = r0.getDimensionPixelSize(r1)
            goto L_0x0032
        L_0x004c:
            r8 = 0
        L_0x004d:
            if (r13 != r3) goto L_0x0051
            r9 = 1
            goto L_0x0052
        L_0x0051:
            r9 = 0
        L_0x0052:
            if (r13 != 0) goto L_0x0068
            int r0 = r12.f216233g
            if (r0 == 0) goto L_0x0068
            r1 = -1
            if (r0 == r1) goto L_0x0068
            xv0.e r0 = r12.f216235i
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.mo149128j0()
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            r2 = 1
        L_0x0068:
            r0 = 0
            if (r2 != 0) goto L_0x006e
        L_0x006c:
            r10 = r0
            goto L_0x0081
        L_0x006e:
            if (r13 != 0) goto L_0x006c
            int r2 = r12.f216233g
            if (r2 != r3) goto L_0x0077
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x006c
        L_0x0077:
            if (r2 != r5) goto L_0x007c
            r0 = 300(0x12c, double:1.48E-321)
            goto L_0x006c
        L_0x007c:
            if (r2 != r4) goto L_0x006c
            r0 = 350(0x15e, double:1.73E-321)
            goto L_0x006c
        L_0x0081:
            xv0.e r6 = r12.f216235i
            if (r6 == 0) goto L_0x0089
            r7 = r14
            r6.mo149094L(r7, r8, r9, r10)
        L_0x0089:
            r12.f216233g = r13
            r12.f216234h = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73640w1.mo100543m4(int, int):void");
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        this.f216231e = bVar;
        this.f216235i = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
    }
}
