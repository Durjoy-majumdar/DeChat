package p920uj;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g62.C75880o;
import java.util.ArrayList;
import java.util.LinkedList;
import je0.C46496s;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import tc0.C77882e;

/* renamed from: uj.b */
public class C78178b extends C78177a {

    /* renamed from: f */
    public C117747y f229033f;

    /* renamed from: g */
    public C11385n f229034g = new C78179a();

    /* renamed from: uj.b$a */
    public class C78179a implements C11385n {
        public C78179a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
            r8 = (te3.C51659v73) ((ob0.C47350c) r11.getReqResp()).f127056b.f127083a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x013f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r8, int r9, java.lang.String r10, ob0.C117747y r11) {
            /*
                r7 = this;
                uj.b r0 = p920uj.C78178b.this
                ob0.y r0 = r0.f229033f
                boolean r0 = r0.equals(r11)
                if (r0 == 0) goto L_0x0166
                f40.C86709a0.m107528h()
                f40.g r0 = f40.C86709a0.m107529k()
                ob0.b0 r0 = r0.f251779b
                int r1 = r11.getType()
                uj.b r2 = p920uj.C78178b.this
                ob0.n r2 = r2.f229034g
                r0.mo123470p(r1, r2)
                uj.b r0 = p920uj.C78178b.this
                qo3.i0 r0 = r0.f229032e
                if (r0 == 0) goto L_0x0027
                r0.dismiss()
            L_0x0027:
                r0 = 1
                java.lang.String r1 = "onSceneEnd %s"
                java.lang.String r2 = "MicroMsg.ContactSyncOpLogCallbackFactory"
                r3 = 806(0x326, float:1.13E-42)
                r4 = 0
                java.lang.String r5 = ""
                if (r8 != 0) goto L_0x00a1
                if (r9 != 0) goto L_0x00a1
                int r8 = r11.getType()     // Catch:{ Exception -> 0x0093 }
                if (r8 != r3) goto L_0x005e
                com.tencent.mm.network.u r8 = r11.getReqResp()     // Catch:{ Exception -> 0x0093 }
                ob0.c r8 = (ob0.C47350c) r8     // Catch:{ Exception -> 0x0093 }
                ob0.c$d r8 = r8.f127056b     // Catch:{ Exception -> 0x0093 }
                pe3.a r8 = r8.f127083a     // Catch:{ Exception -> 0x0093 }
                te3.v73 r8 = (te3.C51659v73) r8     // Catch:{ Exception -> 0x0093 }
                te3.ja r9 = r8.getBaseResponse()     // Catch:{ Exception -> 0x005a }
                if (r9 == 0) goto L_0x0054
                te3.ja r8 = r8.getBaseResponse()     // Catch:{ Exception -> 0x005a }
                int r8 = r8.f135955d     // Catch:{ Exception -> 0x005a }
                goto L_0x0055
            L_0x0054:
                r8 = 0
            L_0x0055:
                r9 = r8
            L_0x0056:
                r8 = r5
                r10 = r8
                goto L_0x00e3
            L_0x005a:
                r8 = move-exception
                r10 = r5
                r9 = 0
                goto L_0x0095
            L_0x005e:
                tc0.d r11 = (tc0.C48623d) r11     // Catch:{ Exception -> 0x0093 }
                tc0.d$a r8 = r11.f130154e     // Catch:{ Exception -> 0x0093 }
                tc0.d$c r8 = r8.f130157b     // Catch:{ Exception -> 0x0093 }
                te3.a93 r8 = r8.f130159a     // Catch:{ Exception -> 0x0093 }
                te3.b93 r10 = r8.f130391e     // Catch:{ Exception -> 0x0093 }
                java.util.LinkedList<java.lang.Integer> r10 = r10.f131020e     // Catch:{ Exception -> 0x0093 }
                java.lang.Object r10 = r10.getLast()     // Catch:{ Exception -> 0x0093 }
                java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ Exception -> 0x0093 }
                int r9 = r10.intValue()     // Catch:{ Exception -> 0x0093 }
                te3.b93 r8 = r8.f130391e     // Catch:{ Exception -> 0x0093 }
                java.util.LinkedList<te3.y83> r8 = r8.f131021f     // Catch:{ Exception -> 0x0093 }
                java.lang.Object r8 = r8.getLast()     // Catch:{ Exception -> 0x0093 }
                te3.y83 r8 = (te3.C52085y83) r8     // Catch:{ Exception -> 0x0093 }
                if (r8 == 0) goto L_0x0056
                java.lang.String r10 = r8.f145175d     // Catch:{ Exception -> 0x0093 }
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0093 }
                if (r10 != 0) goto L_0x0056
                java.lang.String r10 = r8.f145175d     // Catch:{ Exception -> 0x0093 }
                java.lang.String r8 = r8.f145176e     // Catch:{ Exception -> 0x0091 }
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r5)     // Catch:{ Exception -> 0x0091 }
                goto L_0x00e3
            L_0x0091:
                r8 = move-exception
                goto L_0x0095
            L_0x0093:
                r8 = move-exception
                r10 = r5
            L_0x0095:
                java.lang.Object[] r11 = new java.lang.Object[r0]
                java.lang.String r8 = r8.getMessage()
                r11[r4] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r11)
                goto L_0x00e2
            L_0x00a1:
                int r8 = r11.getType()     // Catch:{ Exception -> 0x00d5 }
                if (r8 != r3) goto L_0x00c6
                com.tencent.mm.network.u r8 = r11.getReqResp()     // Catch:{ Exception -> 0x00d5 }
                ob0.c r8 = (ob0.C47350c) r8     // Catch:{ Exception -> 0x00d5 }
                ob0.c$d r8 = r8.f127056b     // Catch:{ Exception -> 0x00d5 }
                pe3.a r8 = r8.f127083a     // Catch:{ Exception -> 0x00d5 }
                te3.v73 r8 = (te3.C51659v73) r8     // Catch:{ Exception -> 0x00d5 }
                if (r8 == 0) goto L_0x00c6
                te3.ja r11 = r8.getBaseResponse()     // Catch:{ Exception -> 0x00d5 }
                if (r11 == 0) goto L_0x00c6
                te3.ja r8 = r8.getBaseResponse()     // Catch:{ Exception -> 0x00d5 }
                te3.rv3 r8 = r8.f135956e     // Catch:{ Exception -> 0x00d5 }
                java.lang.String r8 = sf0.C48374j0.m53718g(r8)     // Catch:{ Exception -> 0x00d5 }
                goto L_0x00c7
            L_0x00c6:
                r8 = r5
            L_0x00c7:
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00d0 }
                if (r11 == 0) goto L_0x00ce
                goto L_0x00e2
            L_0x00ce:
                r10 = r8
                goto L_0x00e2
            L_0x00d0:
                r10 = move-exception
                r6 = r10
                r10 = r8
                r8 = r6
                goto L_0x00d7
            L_0x00d5:
                r8 = move-exception
                r10 = r5
            L_0x00d7:
                java.lang.Object[] r11 = new java.lang.Object[r0]
                java.lang.String r8 = r8.getMessage()
                r11[r4] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r11)
            L_0x00e2:
                r8 = r5
            L_0x00e3:
                uj.b r11 = p920uj.C78178b.this
                java.util.List<eb0.e0> r11 = r11.f229030c
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                boolean r11 = r11.isEmpty()
                if (r11 != 0) goto L_0x0116
                uj.b r11 = p920uj.C78178b.this
                java.util.List<eb0.e0> r11 = r11.f229030c
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x00f9:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0116
                java.lang.Object r0 = r11.next()
                eb0.e0 r0 = (eb0.C75572e0) r0
                boolean r1 = r0 instanceof p695tj.C78033b
                if (r1 == 0) goto L_0x0112
                r1 = r0
                tj.b r1 = (p695tj.C78033b) r1
                r1.f228777a = r9
                r1.f228778b = r8
                r1.f228779c = r10
            L_0x0112:
                r0.mo73364a(r4, r9, r5, r0)
                goto L_0x00f9
            L_0x0116:
                if (r9 != 0) goto L_0x013f
                uj.b r11 = p920uj.C78178b.this
                java.util.List<eb0.e0> r11 = r11.f229028a
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x0122:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0166
                java.lang.Object r0 = r11.next()
                eb0.e0 r0 = (eb0.C75572e0) r0
                boolean r1 = r0 instanceof p695tj.C78033b
                if (r1 == 0) goto L_0x013b
                r1 = r0
                tj.b r1 = (p695tj.C78033b) r1
                r1.f228777a = r9
                r1.f228778b = r8
                r1.f228779c = r10
            L_0x013b:
                r0.mo73364a(r4, r9, r5, r0)
                goto L_0x0122
            L_0x013f:
                uj.b r11 = p920uj.C78178b.this
                java.util.List<eb0.e0> r11 = r11.f229029b
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x0149:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x0166
                java.lang.Object r0 = r11.next()
                eb0.e0 r0 = (eb0.C75572e0) r0
                boolean r1 = r0 instanceof p695tj.C78033b
                if (r1 == 0) goto L_0x0162
                r1 = r0
                tj.b r1 = (p695tj.C78033b) r1
                r1.f228777a = r9
                r1.f228778b = r8
                r1.f228779c = r10
            L_0x0162:
                r0.mo73364a(r4, r9, r5, r0)
                goto L_0x0149
            L_0x0166:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p920uj.C78178b.C78179a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    public C78178b(boolean z) {
        this.f229031d = z;
    }

    /* renamed from: b */
    public void mo108163b(C75880o oVar) {
        if (this.f229031d) {
            this.f229033f = new C46496s(oVar);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(oVar);
        this.f229033f = new C77882e(linkedList);
    }

    /* renamed from: c */
    public void mo108164c(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        if (this.f229033f != null) {
            this.f229032e = C76879j.m92723Q(context, str, str2, z, z2, onCancelListener);
            C117747y yVar = this.f229033f;
            if (yVar != null) {
                Log.m105925i("MicroMsg.ContactSyncOpLogCallbackFactory", "request scene %s", yVar);
                if (this.f229032e != null || !((ArrayList) this.f229028a).isEmpty() || !((ArrayList) this.f229029b).isEmpty() || !((ArrayList) this.f229030c).isEmpty()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(this.f229033f.getType(), this.f229034g);
                }
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(this.f229033f);
            }
        }
    }
}
