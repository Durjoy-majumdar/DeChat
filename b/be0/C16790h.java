package be0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import fy3.C32226l;
import gy3.C87412m;
import rd0.C22222c;
import rd0.C48018e;
import rx3.C13598b0;
import sd0.C22357b;

/* renamed from: be0.h */
public final class C16790h {

    /* renamed from: a */
    public static final C16790h f45352a = new C16790h();

    /* renamed from: be0.h$a */
    public static final class C16791a implements C22357b.C22358b {

        /* renamed from: d */
        public final /* synthetic */ C32226l<SubscribeMsgRequestResult, C13598b0> f45353d;

        /* renamed from: e */
        public final /* synthetic */ String f45354e;

        public C16791a(C32226l<? super SubscribeMsgRequestResult, C13598b0> lVar, String str) {
            this.f45353d = lVar;
            this.f45354e = str;
        }

        /* renamed from: a */
        public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "errMsg");
            if (i == 0 && i2 == 0) {
                C22222c a = C48018e.f128802a.mo72802a("name_wxa");
                if (!(a == null || subscribeMsgRequestResult == null)) {
                    a.mo35361b(this.f45354e, subscribeMsgRequestResult.f49004h, subscribeMsgRequestResult.f49008o, true, false);
                }
                this.f45353d.invoke(subscribeMsgRequestResult);
                return;
            }
            this.f45353d.invoke(null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: be0.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: be0.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: be0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: be0.h$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17819a(java.lang.String r14, com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData r15, jp3.C9487b<? super jp3.C9486a> r16, fy3.C32226l<? super com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult, rx3.C13598b0> r17) {
        /*
            r13 = this;
            r1 = r14
            r0 = r15
            r2 = r16
            r3 = r17
            java.lang.String r4 = "userName"
            gy3.C87412m.m108594g(r14, r4)
            java.lang.String r4 = "data"
            gy3.C87412m.m108594g(r15, r4)
            java.lang.String r4 = "receiver"
            gy3.C87412m.m108594g(r3, r4)
            sd0.b$a$a r4 = sd0.C22357b.C22359a.f63389a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r6 = r0.f49052f
            java.util.Iterator r6 = r6.iterator()
        L_0x0023:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x006e
            java.lang.Object r7 = r6.next()
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r7 = (com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem) r7
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r9 = r0.f49054h
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r9 = r9.f49004h
            java.util.Iterator r9 = r9.iterator()
        L_0x0038:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0050
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r11 = (com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem) r11
            java.lang.String r11 = r11.f49021f
            java.lang.String r12 = r7.f49021f
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 == 0) goto L_0x0038
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r10 = (com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem) r10
            if (r10 == 0) goto L_0x0023
            int r9 = r10.f49025j
            int r11 = r7.f49025j
            if (r9 != r11) goto L_0x0067
            boolean r9 = r10.f49033u
            boolean r11 = r7.f49033u
            if (r9 != r11) goto L_0x0067
            boolean r9 = r10.f49036x
            boolean r10 = r7.f49036x
            if (r9 == r10) goto L_0x0068
        L_0x0067:
            r8 = 1
        L_0x0068:
            if (r8 == 0) goto L_0x0023
            r5.add(r7)
            goto L_0x0023
        L_0x006e:
            be0.h$a r6 = new be0.h$a
            r6.<init>(r3, r14)
            if (r2 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            be0.f r3 = new be0.f
            r3.<init>()
            r3.f45349d = r6
            r2.keep(r3)
            r6 = r3
        L_0x0081:
            boolean r3 = r0.f49051e
            byte[] r7 = new byte[r8]
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 384(0x180, float:5.38E-43)
            r12 = 0
            java.lang.String r2 = ""
            r0 = r4
            r1 = r14
            r4 = r6
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            sd0.b r0 = sd0.C22357b.C22359a.C22360a.m26033d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            sd0.a r1 = sd0.C22355a.f63371a
            r0.mo35487b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: be0.C16790h.mo17819a(java.lang.String, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData, jp3.b, fy3.l):void");
    }
}
