package ek0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import ch0.C113320j;
import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import qo3.C89778c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u24.C90599h;
import z04.C112550d0;
import zg0.C119113p;

@C86522b
/* renamed from: ek0.a */
public final class C116776a extends C86301e implements AddressSelectorContract {

    /* renamed from: d */
    public final C13601g f350096d = C36568h.m40985a(C116777a.f350097d);

    /* renamed from: ek0.a$b */
    public static final class C86532b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116776a f251401d;

        /* renamed from: e */
        public final /* synthetic */ Context f251402e;

        /* renamed from: f */
        public final /* synthetic */ AddressSelectorContract.SelectRequest f251403f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<AddressSelectorContract.SelectResponse, C13598b0> f251404g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f251405h;

        public C86532b(C116776a aVar, Context context, AddressSelectorContract.SelectRequest selectRequest, C32226l<? super AddressSelectorContract.SelectResponse, C13598b0> lVar, C32224a<C13598b0> aVar2) {
            this.f251401d = aVar;
            this.f251402e = context;
            this.f251403f = selectRequest;
            this.f251404g = lVar;
            this.f251405h = aVar2;
        }

        public final void run() {
            this.f251401d.mu0(this.f251402e, this.f251403f, this.f251404g, this.f251405h);
        }
    }

    /* renamed from: ek0.a$d */
    public static final class C86533d implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f251406d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f251407e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C113320j> f251408f;

        public C86533d(C8477a0 a0Var, C32224a<C13598b0> aVar, C8479f0<C113320j> f0Var) {
            this.f251406d = a0Var;
            this.f251407e = aVar;
            this.f251408f = f0Var;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (!this.f251406d.f27482d) {
                this.f251407e.invoke();
            }
            C89778c.m112244b((Dialog) this.f251408f.f27484d);
        }
    }

    /* renamed from: ek0.a$a */
    public static final class C116777a extends C87413o implements C32224a<C119113p> {

        /* renamed from: d */
        public static final C116777a f350097d = new C116777a();

        public C116777a() {
            super(0);
        }

        public Object invoke() {
            C119113p pVar = new C119113p();
            pVar.mo183782g();
            return pVar;
        }
    }

    /* renamed from: ek0.a$c */
    public static final class C116778c extends C87413o implements C32226l<RcptItem, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f350098d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<AddressSelectorContract.SelectResponse, C13598b0> f350099e;

        /* renamed from: f */
        public final /* synthetic */ C116776a f350100f;

        /* renamed from: g */
        public final /* synthetic */ AddressSelectorContract.SelectRequest f350101g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<C113320j> f350102h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116778c(C8477a0 a0Var, C32226l<? super AddressSelectorContract.SelectResponse, C13598b0> lVar, C116776a aVar, AddressSelectorContract.SelectRequest selectRequest, C8479f0<C113320j> f0Var) {
            super(1);
            this.f350098d = a0Var;
            this.f350099e = lVar;
            this.f350100f = aVar;
            this.f350101g = selectRequest;
            this.f350102h = f0Var;
        }

        public Object invoke(Object obj) {
            RcptItem rcptItem = (RcptItem) obj;
            C87412m.m108594g(rcptItem, "rcptItem");
            this.f350098d.f27482d = true;
            C32226l<AddressSelectorContract.SelectResponse, C13598b0> lVar = this.f350099e;
            C116776a aVar = this.f350100f;
            AddressSelectorContract.SelectRequest selectRequest = this.f350101g;
            aVar.getClass();
            ArrayList arrayList = new ArrayList();
            String str = rcptItem.f196788f;
            C87412m.m108593f(str, "selectedRcptItem.post");
            AddressSelectorContract.SelectResponse selectResponse = new AddressSelectorContract.SelectResponse(arrayList, Integer.parseInt(C112550d0.m153799i0(str).toString()));
            do {
                String o = selectRequest.f11047d == AddressSelectorContract.C1582a.REGION ? C90599h.m113522o(rcptItem.f196787e, 0, 6) : rcptItem.f196787e;
                C87412m.m108593f(o, "if (request.mode == Addr…            rcptItem.code");
                int parseInt = Integer.parseInt(o);
                ArrayList<AddressSelectorContract.AddressNode> arrayList2 = selectResponse.f11050d;
                String str2 = rcptItem.f196786d;
                C87412m.m108593f(str2, "rcptItem.name");
                arrayList2.add(0, new AddressSelectorContract.AddressNode(str2, parseInt));
                rcptItem = aVar.vx0().mo183779d(rcptItem.f196790h);
            } while (rcptItem != null);
            lVar.invoke(selectResponse);
            T t = this.f350102h.f27484d;
            C87412m.m108591d(t);
            ((C113320j) t).dismiss();
            return C13598b0.f38549a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.tencent.mm.plugin.address.model.RcptItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: com.tencent.mm.plugin.address.model.RcptItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mu0(android.content.Context r26, com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract.SelectRequest r27, fy3.C32226l<? super com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract.SelectResponse, rx3.C13598b0> r28, fy3.C32224a<rx3.C13598b0> r29) {
        /*
            r25 = this;
            r6 = r27
            r7 = r29
            java.lang.String r0 = "context"
            r9 = r26
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "onSelect"
            r4 = r28
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "onCancel"
            gy3.C87412m.m108594g(r7, r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0042
            zt3.t r8 = zt3.C119157j.f356862d
            ek0.a$b r10 = new ek0.a$b
            r0 = r10
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            zt3.j r8 = (zt3.C119157j) r8
            r8.mo183895z(r10)
            return
        L_0x0042:
            gy3.a0 r15 = new gy3.a0
            r15.<init>()
            gy3.f0 r14 = new gy3.f0
            r14.<init>()
            ch0.j r13 = new ch0.j
            java.util.ArrayList<java.lang.String> r0 = r6.f11048e
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = 0
            goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "北京市"
        L_0x0061:
            r10 = r0
            goto L_0x01ac
        L_0x0064:
            java.util.ArrayList r0 = new java.util.ArrayList
            com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$a r3 = r6.f11047d
            int r3 = r3.f11058d
            r0.<init>(r3)
            java.util.ArrayList<java.lang.String> r3 = r6.f11048e
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$a r5 = r6.f11047d
            int r5 = r5.f11058d
            r10 = 0
            r11 = 0
        L_0x0078:
            if (r10 >= r5) goto L_0x014d
            java.lang.Object r12 = sx3.C110818d0.m150917O(r3, r10)
            java.lang.String r12 = (java.lang.String) r12
            zg0.p r1 = r25.vx0()
            if (r11 == 0) goto L_0x0089
            java.lang.String r8 = r11.f196787e
            goto L_0x008a
        L_0x0089:
            r8 = 0
        L_0x008a:
            if (r8 != 0) goto L_0x008e
            java.lang.String r8 = ""
        L_0x008e:
            java.util.List r1 = r1.mo183781f(r8)
            if (r12 == 0) goto L_0x009d
            int r8 = r12.length()
            if (r8 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r8 = 0
            goto L_0x009e
        L_0x009d:
            r8 = 1
        L_0x009e:
            if (r8 == 0) goto L_0x00a2
            goto L_0x014d
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            int r2 = r12.length()
            if (r8 >= r2) goto L_0x00b8
            char r2 = r12.charAt(r8)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L_0x00b5
            r2 = 0
            goto L_0x00b9
        L_0x00b5:
            int r8 = r8 + 1
            goto L_0x00a3
        L_0x00b8:
            r2 = 1
        L_0x00b9:
            if (r2 == 0) goto L_0x0139
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00c1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x012f
            java.lang.Object r2 = r1.next()
            r8 = r2
            com.tencent.mm.plugin.address.model.RcptItem r8 = (com.tencent.p014mm.plugin.address.model.RcptItem) r8
            r19 = r1
            java.lang.String r1 = "it"
            gy3.C87412m.m108593f(r8, r1)
            java.lang.String r1 = r8.f196787e
            int r1 = r1.length()
            r20 = r2
            int r2 = r12.length()
            if (r1 >= r2) goto L_0x00e7
            r21 = r3
            r1 = 0
            goto L_0x0125
        L_0x00e7:
            java.lang.String r1 = r8.f196787e
            int r1 = r1.length()
            int r2 = r12.length()
            if (r1 <= r2) goto L_0x011c
            java.lang.String r1 = r8.f196787e
            int r1 = r1.length()
            int r2 = r12.length()
            int r1 = r1 - r2
            r21 = r3
            r3 = r12
            r2 = 0
        L_0x0102:
            if (r2 >= r1) goto L_0x011f
            r22 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r3 = 48
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r2 = r2 + 1
            r1 = r22
            goto L_0x0102
        L_0x011c:
            r21 = r3
            r3 = r12
        L_0x011f:
            java.lang.String r1 = r8.f196787e
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r2 = r20
            goto L_0x0132
        L_0x012a:
            r1 = r19
            r3 = r21
            goto L_0x00c1
        L_0x012f:
            r21 = r3
            r2 = 0
        L_0x0132:
            com.tencent.mm.plugin.address.model.RcptItem r2 = (com.tencent.p014mm.plugin.address.model.RcptItem) r2
            if (r2 != 0) goto L_0x0137
            goto L_0x014d
        L_0x0137:
            r11 = r2
            goto L_0x0147
        L_0x0139:
            r21 = r3
            zg0.p r2 = r25.vx0()
            com.tencent.mm.plugin.address.model.RcptItem r1 = r2.mo183778c(r1, r12)
            if (r1 != 0) goto L_0x0146
            goto L_0x014d
        L_0x0146:
            r11 = r1
        L_0x0147:
            int r10 = r10 + 1
            r3 = r21
            goto L_0x0078
        L_0x014d:
            if (r11 != 0) goto L_0x0154
            java.lang.String r0 = "北京市 北京市 东城区"
            goto L_0x0061
        L_0x0154:
            r1 = 0
        L_0x0155:
            r0.add(r1, r11)
            zg0.p r2 = r25.vx0()
            int r3 = r11.f196790h
            com.tencent.mm.plugin.address.model.RcptItem r11 = r2.mo183779d(r3)
            if (r11 != 0) goto L_0x0155
        L_0x0164:
            int r1 = r0.size()
            com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$a r2 = r6.f11047d
            int r2 = r2.f11058d
            r3 = 3
            int r2 = java.lang.Math.max(r2, r3)
            if (r1 >= r2) goto L_0x0194
            java.lang.Object r1 = sx3.C110818d0.m150923U(r0)
            com.tencent.mm.plugin.address.model.RcptItem r1 = (com.tencent.p014mm.plugin.address.model.RcptItem) r1
            zg0.p r2 = r25.vx0()
            java.lang.String r1 = r1.f196787e
            java.util.List r1 = r2.mo183781f(r1)
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.plugin.address.model.RcptItem r1 = (com.tencent.p014mm.plugin.address.model.RcptItem) r1
            if (r1 != 0) goto L_0x018c
            goto L_0x0194
        L_0x018c:
            int r2 = r0.size()
            r0.add(r2, r1)
            goto L_0x0164
        L_0x0194:
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            ek0.b r22 = ek0.C75625b.f222171d
            r23 = 30
            r24 = 0
            java.lang.String r17 = " "
            r16 = r0
            java.lang.String r0 = sx3.C110818d0.m150921S(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0061
        L_0x01ac:
            ek0.a$c r11 = new ek0.a$c
            r0 = r11
            r1 = r15
            r2 = r28
            r3 = r25
            r4 = r27
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$a r0 = r6.f11047d
            int r12 = r0.f11058d
            zg0.p r0 = r25.vx0()
            boolean r1 = r6.f11049f
            r8 = r13
            r9 = r26
            r2 = r13
            r13 = r0
            r3 = r14
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.f27484d = r2
            r13 = r2
            ch0.j r13 = (ch0.C113320j) r13
            ek0.a$d r0 = new ek0.a$d
            r0.<init>(r15, r7, r3)
            r2.f126908o = r0
            r13 = r2
            ch0.j r13 = (ch0.C113320j) r13
            r2.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek0.C116776a.mu0(android.content.Context, com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest, fy3.l, fy3.a):void");
    }

    public final C119113p vx0() {
        return (C119113p) ((C36570n) this.f350096d).getValue();
    }
}
