package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import ob0.C11385n;
import p270xi.C53356d;
import zj3.C79343c0;

/* renamed from: com.tencent.mm.ui.chatting.component.y5 */
public class C44847y5 extends C73412a implements C53356d, C11385n, MStorageEx.IOnStorageChange, MStorage.IOnStorageChange {
    /* renamed from: g5 */
    public void mo70046g5() {
        C97625j3.m125815e().mo123455a(137, this);
        C97625j3.m125812b().mo105907v().add(this);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        C97625j3.m125815e().mo123470p(137, this);
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105907v().remove(this);
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Class cls = C79343c0.class;
        if (!this.f215752d.f193283g) {
            Log.m105924i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange fragment not foreground, return");
            return;
        }
        Log.m105924i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange " + i);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f215752d.mo91577r());
        if (z1Var != null && ((int) z1Var.f108320R1) != 0) {
            if (z1Var != this.f215752d.mo91574o() || Util.isNullOrNil(z1Var.getNickname())) {
                if (Util.isNullOrNil(z1Var.getNickname())) {
                    z1Var.mo62878U2(this.f215752d.mo91574o().getNickname());
                }
                this.f215752d.mo91548I(z1Var);
                ((C79343c0) this.f215752d.f193278b.mo102812a(cls)).mo102611a();
                ((C79343c0) this.f215752d.f193278b.mo102812a(cls)).mo102623k3(false);
                this.f215752d.mo91540A();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSceneEnd: errType = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " errCode = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " errMsg = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " sceneType:"
            r0.append(r1)
            int r1 = r8.getType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ChattingUI.VerifyUserComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            ck3.b r0 = r4.f215752d
            r0.mo91561b()
            ck3.b r0 = r4.f215752d
            boolean r2 = r0.f193283g
            if (r2 != 0) goto L_0x0043
            java.lang.String r5 = "onSceneEnd fragment not foreground, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            return
        L_0x0043:
            android.app.Activity r0 = r0.mo91565f()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isTopActivity(r0)
            if (r0 != 0) goto L_0x004e
            return
        L_0x004e:
            ck3.b r0 = r4.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r1 = 7
            boolean r1 = com.tencent.p014mm.p136ui.C74785j2.C6981a.m7247a(r0, r5, r6, r7, r1)
            r2 = 1
            if (r1 == 0) goto L_0x005d
            goto L_0x0082
        L_0x005d:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r3 = com.tencent.p014mm.p136ui.LauncherUI.class
            android.content.Intent r1 = r1.setClass(r0, r3)
            java.lang.String r3 = "Intro_Switch"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            java.lang.String r3 = "animation_pop_in"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r1 = r1.addFlags(r3)
            boolean r7 = com.tencent.p014mm.plugin.account.p024ui.C1468a.m1500a(r0, r5, r6, r1, r7)
            if (r7 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            if (r2 == 0) goto L_0x0085
            return
        L_0x0085:
            if (r5 != 0) goto L_0x0106
            if (r6 != 0) goto L_0x0106
            int r5 = r8.getType()
            r6 = 137(0x89, float:1.92E-43)
            if (r5 == r6) goto L_0x0093
            goto L_0x0106
        L_0x0093:
            com.tencent.mm.pluginsdk.model.b1 r8 = (com.tencent.p014mm.pluginsdk.model.C44590b1) r8
            java.util.List<java.lang.String> r5 = r8.f120897f
            if (r5 == 0) goto L_0x00a9
            ck3.b r6 = r4.f215752d
            com.tencent.mm.storage.z1 r6 = r6.mo91574o()
            java.lang.String r6 = r6.getUsername()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0106
        L_0x00a9:
            ck3.b r5 = r4.f215752d
            com.tencent.mm.storage.z1 r5 = r5.mo91574o()
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r6 = r6.mo105907v()
            java.lang.String r7 = r5.getUsername()
            com.tencent.mm.storage.z1 r6 = r6.get(r7)
            if (r6 == 0) goto L_0x00c6
            long r7 = r6.f108320R1
            int r8 = (int) r7
            if (r8 != 0) goto L_0x0100
        L_0x00c6:
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r6 = r6.mo105907v()
            boolean r6 = r6.mo69668Q3(r5)
            if (r6 != 0) goto L_0x00f0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "insert contact failed, username = "
            r6.append(r7)
            java.lang.String r5 = r5.getUsername()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.ChattingUI.ChattingLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
            r5 = 0
            goto L_0x0101
        L_0x00f0:
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r6 = r6.mo105907v()
            java.lang.String r5 = r5.getUsername()
            com.tencent.mm.storage.z1 r6 = r6.get(r5)
        L_0x0100:
            r5 = r6
        L_0x0101:
            if (r5 == 0) goto L_0x0106
            eb0.C45628s0.m50775g0(r5)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C44847y5.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C97625j3.m125815e().mo123470p(137, this);
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105907v().remove(this);
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        onNotifyChange(0, (MStorageEx) null, (Object) null);
    }
}
