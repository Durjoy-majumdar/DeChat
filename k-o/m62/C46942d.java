package m62;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import pb0.C47445a;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C51205s63;

/* renamed from: m62.d */
public final class C46942d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C89779i0> f126191d;

    /* renamed from: e */
    public final /* synthetic */ C47445a<C51205s63> f126192e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f126193f;

    /* renamed from: g */
    public final /* synthetic */ boolean f126194g;

    /* renamed from: h */
    public final /* synthetic */ Context f126195h;

    /* renamed from: i */
    public final /* synthetic */ Intent f126196i;

    /* renamed from: j */
    public final /* synthetic */ int f126197j;

    /* renamed from: n */
    public final /* synthetic */ String f126198n;

    /* renamed from: o */
    public final /* synthetic */ C46946f f126199o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46942d(C8479f0<C89779i0> f0Var, C47445a<C51205s63> aVar, C72963f4 f4Var, boolean z, Context context, Intent intent, int i, String str, C46946f fVar) {
        super(0);
        this.f126191d = f0Var;
        this.f126192e = aVar;
        this.f126193f = f4Var;
        this.f126194g = z;
        this.f126195h = context;
        this.f126196i = intent;
        this.f126197j = i;
        this.f126198n = str;
        this.f126199o = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            gy3.f0<qo3.i0> r1 = r13.f126191d
            T r1 = r1.f27484d
            qo3.i0 r1 = (qo3.C89779i0) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.isShowing()
            if (r1 != r2) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x0020
            gy3.f0<qo3.i0> r1 = r13.f126191d
            T r1 = r1.f27484d
            qo3.i0 r1 = (qo3.C89779i0) r1
            r1.dismiss()
        L_0x0020:
            pb0.a<te3.s63> r1 = r13.f126192e
            int r4 = r1.f128350c
            if (r4 != 0) goto L_0x0035
            T r1 = r1.f128353f
            te3.s63 r1 = (te3.C51205s63) r1
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.f141348d
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r1 = 0
            goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            if (r1 != 0) goto L_0x009d
            com.tencent.mm.storage.f4 r4 = r13.f126193f
            r4.mo101014q4(r2)
            com.tencent.mm.storage.f4 r2 = r13.f126193f
            int r4 = r2.f230723F
            r5 = -1048577(0xffffffffffefffff, float:NaN)
            r4 = r4 & r5
            r2.mo108743W2(r4)
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.f4 r2 = r13.f126193f
            long r4 = r2.getMsgId()
            com.tencent.mm.storage.f4 r2 = r13.f126193f
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r4, r2)
            boolean r0 = r13.f126194g
            if (r0 == 0) goto L_0x014f
            android.content.Context r0 = r13.f126195h
            android.content.Intent r2 = r13.f126196i
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r2)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/messenger/sec/SecurityMsgIntercept$doCgiIfNeed$1$2$1$1"
            java.lang.String r7 = "invoke"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r0
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r12.mo10231a(r3)
            android.content.Intent r2 = (android.content.Intent) r2
            r0.startActivity(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/messenger/sec/SecurityMsgIntercept$doCgiIfNeed$1$2$1$1"
            java.lang.String r6 = "invoke"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x014f
        L_0x009d:
            int r2 = r13.f126197j
            r3 = 24
            r4 = 2131821556(0x7f1103f4, float:1.9275859E38)
            if (r2 != r3) goto L_0x00be
            android.content.Context r5 = r13.f126195h
            r0 = 2131835466(0x7f113a4a, float:1.9304071E38)
            java.lang.String r6 = r5.getString(r0)
            android.content.Context r0 = r13.f126195h
            java.lang.String r8 = r0.getString(r4)
            r9 = 0
            r10 = 0
            java.lang.String r7 = ""
            nj3.C76879j.m92711E(r5, r6, r7, r8, r9, r10)
            goto L_0x014f
        L_0x00be:
            r3 = 19
            if (r2 != r3) goto L_0x00da
            android.content.Context r5 = r13.f126195h
            r0 = 2131835467(0x7f113a4b, float:1.9304073E38)
            java.lang.String r6 = r5.getString(r0)
            android.content.Context r0 = r13.f126195h
            java.lang.String r8 = r0.getString(r4)
            r9 = 0
            r10 = 0
            java.lang.String r7 = ""
            nj3.C76879j.m92711E(r5, r6, r7, r8, r9, r10)
            goto L_0x014f
        L_0x00da:
            com.tencent.mm.storage.f4 r2 = r13.f126193f
            boolean r2 = r2.mo101016t3()
            if (r2 == 0) goto L_0x014f
            java.lang.ref.WeakReference r2 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            r3 = 0
            if (r2 == 0) goto L_0x00f1
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 != 0) goto L_0x00ff
        L_0x00f1:
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            java.lang.ref.WeakReference r2 = r2.mo174212f()
            if (r2 == 0) goto L_0x0101
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x00ff:
            r5 = r2
            goto L_0x0102
        L_0x0101:
            r5 = r3
        L_0x0102:
            java.lang.String r2 = r13.f126198n
            if (r5 == 0) goto L_0x010e
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
        L_0x010e:
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x012e
            android.content.Context r2 = r13.f126195h
            r3 = 2131835465(0x7f113a49, float:1.930407E38)
            java.lang.String r6 = r2.getString(r3)
            android.content.Context r2 = r13.f126195h
            java.lang.String r8 = r2.getString(r4)
            r9 = 0
            m62.c r10 = new m62.c
            r10.<init>(r5)
            java.lang.String r7 = ""
            nj3.C76879j.m92711E(r5, r6, r7, r8, r9, r10)
        L_0x012e:
            com.tencent.mm.storage.f4 r2 = r13.f126193f
            int r3 = r2.f230723F
            r4 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r4
            r2.mo108743W2(r3)
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.f4 r2 = r13.f126193f
            long r2 = r2.getMsgId()
            com.tencent.mm.storage.f4 r4 = r13.f126193f
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r2, r4)
        L_0x014f:
            m62.f r0 = r13.f126199o
            java.lang.String r0 = r0.f126228d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "errType:"
            r2.append(r3)
            pb0.a<te3.s63> r3 = r13.f126192e
            int r3 = r3.f128349b
            r2.append(r3)
            java.lang.String r3 = ", errCode:"
            r2.append(r3)
            pb0.a<te3.s63> r3 = r13.f126192e
            int r3 = r3.f128350c
            r2.append(r3)
            java.lang.String r3 = ", isBlocked:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m62.C46942d.invoke():java.lang.Object");
    }
}
