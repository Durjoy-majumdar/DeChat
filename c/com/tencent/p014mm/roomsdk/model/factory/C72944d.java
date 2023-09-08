package com.tencent.p014mm.roomsdk.model.factory;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g62.C75880o;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C89137b0;
import p530fx.C75818e;
import tc0.C77882e;

/* renamed from: com.tencent.mm.roomsdk.model.factory.d */
public class C72944d extends C72940a implements C75818e {

    /* renamed from: f */
    public C77882e f212622f;

    /* renamed from: g */
    public C11385n f212623g = new C72945a();

    /* renamed from: com.tencent.mm.roomsdk.model.factory.d$a */
    public class C72945a implements C11385n {
        public C72945a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r5, int r6, java.lang.String r7, ob0.C117747y r8) {
            /*
                r4 = this;
                com.tencent.mm.roomsdk.model.factory.d r7 = com.tencent.p014mm.roomsdk.model.factory.C72944d.this
                tc0.e r7 = r7.f212622f
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L_0x0093
                f40.C86709a0.m107528h()
                f40.g r7 = f40.C86709a0.m107529k()
                ob0.b0 r7 = r7.f251779b
                int r0 = r8.getType()
                com.tencent.mm.roomsdk.model.factory.d r1 = com.tencent.p014mm.roomsdk.model.factory.C72944d.this
                ob0.n r1 = r1.f212623g
                r7.mo123470p(r0, r1)
                com.tencent.mm.roomsdk.model.factory.d r7 = com.tencent.p014mm.roomsdk.model.factory.C72944d.this
                qo3.i0 r7 = r7.f212616e
                if (r7 == 0) goto L_0x0027
                r7.dismiss()
            L_0x0027:
                com.tencent.mm.roomsdk.model.factory.d r7 = com.tencent.p014mm.roomsdk.model.factory.C72944d.this
                pg3.b r7 = r7.f212615d
                if (r7 == 0) goto L_0x0093
                tc0.d r8 = (tc0.C48623d) r8
                tc0.d$a r7 = r8.f130154e
                tc0.d$c r7 = r7.f130157b
                te3.a93 r7 = r7.f130159a
                java.lang.String r8 = ""
                r0 = 0
                r1 = 0
                if (r5 != 0) goto L_0x007e
                if (r6 != 0) goto L_0x007e
                te3.b93 r5 = r7.f130391e     // Catch:{ Exception -> 0x006b }
                java.util.LinkedList<java.lang.Integer> r5 = r5.f131020e     // Catch:{ Exception -> 0x006b }
                java.lang.Object r5 = r5.getLast()     // Catch:{ Exception -> 0x006b }
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x006b }
                int r6 = r5.intValue()     // Catch:{ Exception -> 0x006b }
                te3.b93 r5 = r7.f130391e     // Catch:{ Exception -> 0x006b }
                java.util.LinkedList<te3.y83> r5 = r5.f131021f     // Catch:{ Exception -> 0x006b }
                java.lang.Object r5 = r5.getLast()     // Catch:{ Exception -> 0x006b }
                te3.y83 r5 = (te3.C52085y83) r5     // Catch:{ Exception -> 0x006b }
                if (r5 == 0) goto L_0x007e
                java.lang.String r7 = r5.f145175d     // Catch:{ Exception -> 0x006b }
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x006b }
                if (r7 != 0) goto L_0x007e
                java.lang.String r7 = r5.f145175d     // Catch:{ Exception -> 0x006b }
                java.lang.String r5 = r5.f145176e     // Catch:{ Exception -> 0x0069 }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r8)     // Catch:{ Exception -> 0x0069 }
                r1 = r5
                goto L_0x007f
            L_0x0069:
                r5 = move-exception
                goto L_0x006d
            L_0x006b:
                r5 = move-exception
                r7 = r1
            L_0x006d:
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r5 = r5.getMessage()
                r2[r0] = r5
                java.lang.String r5 = "MicroMsg.RoomCallbackFactory"
                java.lang.String r3 = "NetSceneSyncOplog %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r2)
                goto L_0x007f
            L_0x007e:
                r7 = r1
            L_0x007f:
                com.tencent.mm.roomsdk.model.factory.d r5 = com.tencent.p014mm.roomsdk.model.factory.C72944d.this
                pg3.b r5 = r5.f212615d
                boolean r2 = r5 instanceof pg3.C77086f
                if (r2 == 0) goto L_0x0090
                r2 = r5
                pg3.f r2 = (pg3.C77086f) r2
                r2.f225171a = r6
                r2.f225172b = r1
                r2.f225173c = r7
            L_0x0090:
                r5.mo10150a(r0, r6, r8, r5)
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.roomsdk.model.factory.C72944d.C72945a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    public C72944d(boolean z) {
        this.f212612a = z;
    }

    /* renamed from: b */
    public void mo100870b(C75880o oVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(oVar);
        this.f212622f = new C77882e(linkedList);
    }

    /* renamed from: c */
    public void mo100865c() {
        C77882e eVar = this.f212622f;
        if (eVar != null) {
            Log.m105925i("MicroMsg.RoomCallbackFactory", "request scene %s", eVar);
            if (!(this.f212616e == null && this.f212613b == null && this.f212614c == null && this.f212615d == null)) {
                C86709a0.m107528h();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                this.f212622f.getClass();
                b0Var.mo123455a(C1805j.CTRL_INDEX, this.f212623g);
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(this.f212622f);
        }
    }

    public void cancel() {
        if (this.f212622f != null) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f212622f);
            C86709a0.m107528h();
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            this.f212622f.getClass();
            b0Var.mo123470p(C1805j.CTRL_INDEX, this.f212623g);
        }
    }

    /* renamed from: d */
    public void mo100867d(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        if (this.f212622f != null) {
            this.f212616e = C76879j.m92723Q(context, str, str2, z, z2, onCancelListener);
            mo100865c();
        }
    }
}
