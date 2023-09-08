package com.tencent.p014mm.p136ui.matrix;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.PssInfo;
import com.tencent.matrix.util.SystemInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Comparator;
import kotlin.Metadata;
import lu3.C34379c;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import ux3.C65486b;
import vo3.C90852c;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/ui/matrix/MatrixMemoryInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ljava/lang/Runnable;", "<init>", "()V", "a", "plugin-performance_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI */
public final class MatrixMemoryInfoUI extends MMActivity implements Runnable {

    /* renamed from: d */
    public C89779i0 f250215d;

    /* renamed from: e */
    public C34379c<?> f250216e;

    /* renamed from: f */
    public final C13601g f250217f = C36568h.m40985a(new C85902i(this));

    /* renamed from: g */
    public final C13601g f250218g = C36568h.m40985a(new C85901h(this));

    /* renamed from: h */
    public final C13601g f250219h = C36568h.m40985a(new C85898e(this));

    /* renamed from: i */
    public final C13601g f250220i = C36568h.m40985a(new C85903j(this));

    /* renamed from: j */
    public final C13601g f250221j = C36568h.m40985a(new C85900g(this));

    /* renamed from: n */
    public final C13601g f250222n = C36568h.m40985a(new C85899f(this));

    /* renamed from: o */
    public final C13601g f250223o = C36568h.m40985a(new C85895b(this));

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$a */
    public static final class C85894a {

        /* renamed from: a */
        public String f250224a;

        /* renamed from: b */
        public String f250225b;

        /* renamed from: c */
        public String f250226c;

        /* renamed from: d */
        public int f250227d;

        /* renamed from: e */
        public String f250228e;

        public C85894a() {
            this((String) null, (String) null, (String) null, 0, (String) null, 31, (C8480h) null);
        }

        public C85894a(String str, String str2, String str3, int i, String str4, int i2, C8480h hVar) {
            str = (i2 & 1) != 0 ? "" : str;
            str2 = (i2 & 2) != 0 ? "" : str2;
            str3 = (i2 & 4) != 0 ? "" : str3;
            i = (i2 & 8) != 0 ? 0 : i;
            str4 = (i2 & 16) != 0 ? "" : str4;
            C87412m.m108594g(str, "process");
            C87412m.m108594g(str2, "usedRam");
            C87412m.m108594g(str3, "detailRam");
            C87412m.m108594g(str4, "apps");
            this.f250224a = str;
            this.f250225b = str2;
            this.f250226c = str3;
            this.f250227d = i;
            this.f250228e = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C85894a)) {
                return false;
            }
            C85894a aVar = (C85894a) obj;
            return C87412m.m108589b(this.f250224a, aVar.f250224a) && C87412m.m108589b(this.f250225b, aVar.f250225b) && C87412m.m108589b(this.f250226c, aVar.f250226c) && this.f250227d == aVar.f250227d && C87412m.m108589b(this.f250228e, aVar.f250228e);
        }

        public int hashCode() {
            return (((((((this.f250224a.hashCode() * 31) + this.f250225b.hashCode()) * 31) + this.f250226c.hashCode()) * 31) + this.f250227d) * 31) + this.f250228e.hashCode();
        }

        public String toString() {
            return "Item(process=" + this.f250224a + ", usedRam=" + this.f250225b + ", detailRam=" + this.f250226c + ", activityCount=" + this.f250227d + ", apps=" + this.f250228e + ')';
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$b */
    public static final class C85895b extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85895b(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250229d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (LinearLayout) this.f250229d.findViewById(C0966R.C0970id.m7h);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$c */
    public static final class C85896c<T> implements Comparator {
        public final int compare(T t, T t2) {
            PssInfo pssInfo = ((MemInfo) t2).f235676j;
            C87412m.m108591d(pssInfo);
            Integer valueOf = Integer.valueOf(pssInfo.f235688d);
            PssInfo pssInfo2 = ((MemInfo) t).f235676j;
            C87412m.m108591d(pssInfo2);
            return C65486b.m77169a(valueOf, Integer.valueOf(pssInfo2.f235688d));
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$d */
    public static final class C85897d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250230d;

        /* renamed from: e */
        public final /* synthetic */ long f250231e;

        /* renamed from: f */
        public final /* synthetic */ MemInfo[] f250232f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f250233g;

        /* renamed from: h */
        public final /* synthetic */ C8478d0 f250234h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85897d(MatrixMemoryInfoUI matrixMemoryInfoUI, long j, MemInfo[] memInfoArr, C8478d0 d0Var, C8478d0 d0Var2) {
            super(0);
            this.f250230d = matrixMemoryInfoUI;
            this.f250231e = j;
            this.f250232f = memInfoArr;
            this.f250233g = d0Var;
            this.f250234h = d0Var2;
        }

        public Object invoke() {
            C89779i0 i0Var;
            Object value = ((C36570n) this.f250230d.f250217f).getValue();
            C87412m.m108593f(value, "<get-textTimestamp>(...)");
            ((TextView) value).setText(String.valueOf(this.f250231e));
            Object B = C110823p.m150976B(this.f250232f);
            MatrixMemoryInfoUI matrixMemoryInfoUI = this.f250230d;
            MemInfo memInfo = (MemInfo) B;
            Object value2 = ((C36570n) matrixMemoryInfoUI.f250218g).getValue();
            C87412m.m108593f(value2, "<get-textSysRam>(...)");
            StringBuilder sb = new StringBuilder();
            SystemInfo systemInfo = memInfo.f235675i;
            C87412m.m108591d(systemInfo);
            sb.append(systemInfo.f235709d);
            sb.append(" b");
            ((TextView) value2).setText(sb.toString());
            Object value3 = ((C36570n) matrixMemoryInfoUI.f250219h).getValue();
            C87412m.m108593f(value3, "<get-textAvailRam>(...)");
            StringBuilder sb4 = new StringBuilder();
            SystemInfo systemInfo2 = memInfo.f235675i;
            C87412m.m108591d(systemInfo2);
            sb4.append(systemInfo2.f235710e);
            sb4.append(" b");
            ((TextView) value3).setText(sb4.toString());
            Object value4 = ((C36570n) this.f250230d.f250220i).getValue();
            C87412m.m108593f(value4, "<get-textUsedRam>(...)");
            ((TextView) value4).setText(this.f250233g.f27483d + " k");
            C89779i0 i0Var2 = this.f250230d.f250215d;
            boolean z = true;
            if (i0Var2 == null || true != i0Var2.isShowing()) {
                z = false;
            }
            if (z && (i0Var = this.f250230d.f250215d) != null) {
                i0Var.dismiss();
            }
            Object value5 = ((C36570n) this.f250230d.f250221j).getValue();
            C87412m.m108593f(value5, "<get-textSwapRam>(...)");
            ((TextView) value5).setText(this.f250234h.f27483d + " k");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$e */
    public static final class C85898e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85898e(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250235d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f250235d.findViewById(C0966R.C0970id.mjn);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$f */
    public static final class C85899f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85899f(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250236d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f250236d.findViewById(C0966R.C0970id.mjo);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$g */
    public static final class C85900g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85900g(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250237d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f250237d.findViewById(C0966R.C0970id.mjq);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$h */
    public static final class C85901h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85901h(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250238d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f250238d.findViewById(C0966R.C0970id.mjp);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$i */
    public static final class C85902i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85902i(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250239d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f250239d.findViewById(C0966R.C0970id.mjr);
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$j */
    public static final class C85903j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ MatrixMemoryInfoUI f250240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85903j(MatrixMemoryInfoUI matrixMemoryInfoUI) {
            super(0);
            this.f250240d = matrixMemoryInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f250240d.findViewById(C0966R.C0970id.mjs);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cr9;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 29) {
            Object value = ((C36570n) this.f250222n).getValue();
            C87412m.m108593f(value, "<get-textHint>(...)");
            ((TextView) value).setVisibility(8);
        }
        setMMTitle((CharSequence) "Memory Usage");
        this.f250215d = C89779i0.m112248e(this, "dumping...", false, 0, (DialogInterface.OnCancelListener) null);
        this.f250216e = ((C119157j) C119157j.f356862d).mo183884o(this);
    }

    public void onDestroy() {
        C89779i0 i0Var;
        super.onDestroy();
        C89779i0 i0Var2 = this.f250215d;
        boolean z = false;
        if (i0Var2 != null && true == i0Var2.isShowing()) {
            z = true;
        }
        if (z && (i0Var = this.f250215d) != null) {
            i0Var.dismiss();
        }
        C34379c<?> cVar = this.f250216e;
        if (cVar != null) {
            cVar.cancel(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x04ef A[Catch:{ all -> 0x0533 }, LOOP:10: B:128:0x04e9->B:130:0x04ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r70 = this;
            long r8 = java.lang.System.currentTimeMillis()
            com.tencent.matrix.util.MemInfo$b r0 = com.tencent.matrix.util.MemInfo.f235669p
            com.tencent.matrix.util.MemInfo[] r10 = r0.mo112156a()
            int r0 = r10.length
            r11 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r13 = "MicroMsg.MatrixMemoryInfoUI"
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "memInfos is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            android.content.Context r0 = r70.getApplicationContext()
            java.lang.String r1 = "dump failed"
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r11)
            r0.show()
            return
        L_0x0028:
            com.tencent.mm.matrix.trigger.RemoteTrigger r1 = com.tencent.p014mm.matrix.trigger.RemoteTrigger.f79440d
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            t70.C36961c.C36962a.m41108a(r1, r2, r3, r4, r5, r6)
            java.lang.Class<sm.c> r0 = p235sm.C90229c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sm.c r0 = (p235sm.C90229c) r0
            java.util.List r14 = r0.L10()
            gy3.d0 r0 = new gy3.d0
            r0.<init>()
            gy3.d0 r7 = new gy3.d0
            r7.<init>()
            int r1 = r10.length
            if (r1 <= r11) goto L_0x0053
            com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$c r1 = new com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$c
            r1.<init>()
            sx3.C110821n.m150973t(r10, r1)
        L_0x0053:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r10.length
            r1.<init>(r2)
            int r2 = r10.length
            r3 = 0
        L_0x005b:
            java.lang.String r6 = "appbrandProcesses"
            java.lang.String r5 = ""
            if (r3 >= r2) goto L_0x02ec
            r4 = r10[r3]
            com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$a r11 = new com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$a
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 31
            r23 = 0
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.matrix.util.ProcessInfo r15 = r4.f235671e
            gy3.C87412m.m108591d(r15)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r18 = r2
            java.lang.String r2 = "Process: ["
            r12.append(r2)
            int r2 = r15.f235682d
            r12.append(r2)
            r2 = 45
            r12.append(r2)
            java.lang.String r2 = r15.f235683e
            r12.append(r2)
            java.lang.String r2 = "] "
            r12.append(r2)
            java.lang.String r2 = r15.f235683e
            r19 = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            boolean r5 = gy3.C87412m.m108589b(r2, r5)
            r20 = r13
            java.lang.String r13 = "push"
            r21 = r10
            java.lang.String r10 = "appbrand"
            r24 = r8
            r8 = 0
            if (r5 == 0) goto L_0x00bc
            java.lang.String r5 = "MAIN"
        L_0x00b9:
            r23 = r3
            goto L_0x00e1
        L_0x00bc:
            r5 = 2
            r9 = 0
            boolean r17 = z04.C112550d0.m153803w(r2, r10, r9, r5, r8)
            if (r17 == 0) goto L_0x00c8
            java.lang.String r2 = "MiniProgram"
            r5 = r2
            goto L_0x00b9
        L_0x00c8:
            r23 = r3
            java.lang.String r3 = "tools"
            boolean r3 = z04.C112550d0.m153803w(r2, r3, r9, r5, r8)
            if (r3 == 0) goto L_0x00d7
            java.lang.String r2 = "Web"
            r5 = r2
            goto L_0x00e1
        L_0x00d7:
            boolean r2 = z04.C112550d0.m153803w(r2, r13, r9, r5, r8)
            if (r2 == 0) goto L_0x00df
            r5 = r13
            goto L_0x00e1
        L_0x00df:
            r5 = r19
        L_0x00e1:
            r12.append(r5)
            java.lang.String r2 = r12.toString()
            java.lang.String r3 = "<set-?>"
            gy3.C87412m.m108594g(r2, r3)
            r11.f250224a = r2
            java.lang.String r2 = r15.f235683e
            r5 = 2
            r9 = 0
            boolean r2 = z04.C112550d0.m153803w(r2, r10, r9, r5, r8)
            java.lang.String r5 = "StringBuilder().apply(builderAction).toString()"
            if (r2 == 0) goto L_0x01ad
            gy3.C87412m.m108593f(r14, r6)
            java.util.Iterator r2 = r14.iterator()
        L_0x0102:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x011c
            java.lang.Object r6 = r2.next()
            r9 = r6
            sm.c$a r9 = (p235sm.C90229c.C90230a) r9
            java.lang.String r9 = r9.mo124463a()
            java.lang.String r10 = r15.f235683e
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x0102
            r8 = r6
        L_0x011c:
            sm.c$a r8 = (p235sm.C90229c.C90230a) r8
            if (r8 == 0) goto L_0x0149
            java.util.List r2 = r8.mo124466d()
            if (r2 == 0) goto L_0x0149
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            int r8 = sx3.C36907w.m41090l(r2, r8)
            r6.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x0135:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x014b
            java.lang.Object r8 = r2.next()
            sm.c$b r8 = (p235sm.C90229c.C90231b) r8
            java.lang.String r8 = r8.mo124470a()
            r6.add(r8)
            goto L_0x0135
        L_0x0149:
            sx3.f0 r6 = sx3.C64186f0.f181907d
        L_0x014b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "apps:"
            r8.append(r9)
            int r9 = r6.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r2.append(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r8 != 0) goto L_0x0172
            boolean r8 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r8 == 0) goto L_0x01a4
        L_0x0172:
            boolean r8 = r6.isEmpty()
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x01a4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = ", "
            r8.append(r9)
            r9 = 0
            java.lang.String[] r10 = new java.lang.String[r9]
            java.lang.Object[] r6 = r6.toArray(r10)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r6, r9)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.String r9 = "toString(this)"
            gy3.C87412m.m108593f(r6, r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r2.append(r6)
        L_0x01a4:
            java.lang.String r2 = r2.toString()
            gy3.C87412m.m108593f(r2, r5)
            r11.f250228e = r2
        L_0x01ad:
            java.lang.String r2 = r15.f235683e
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            boolean r2 = gy3.C87412m.m108589b(r2, r6)
            if (r2 == 0) goto L_0x01c7
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r2 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235399x
            java.util.Map r2 = r2.mo111928e()
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r2 = r2.size()
            r11.f250227d = r2
        L_0x01c7:
            com.tencent.matrix.util.PssInfo r2 = r4.f235676j
            gy3.C87412m.m108591d(r2)
            int r4 = r0.f27483d
            int r6 = r2.f235688d
            int r4 = r4 + r6
            r0.f27483d = r4
            int r4 = r7.f27483d
            int r6 = r2.f235693i
            int r4 = r4 + r6
            r7.f27483d = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Used RAM: "
            r4.append(r6)
            int r6 = r2.f235688d
            r4.append(r6)
            java.lang.String r6 = " k"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            gy3.C87412m.m108594g(r4, r3)
            r11.f250225b = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Detail: ("
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Java:"
            r4.append(r6)
            int r6 = r2.f235689e
            r4.append(r6)
            java.lang.String r6 = "k,"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Native:"
            r4.append(r8)
            int r8 = r2.f235690f
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Graphic:"
            r4.append(r8)
            int r8 = r2.f235691g
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "System:"
            r4.append(r8)
            int r8 = r2.f235692h
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "other:"
            r4.append(r8)
            int r8 = r2.f235696o
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Swap:"
            r4.append(r8)
            int r8 = r2.f235693i
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Stack:"
            r4.append(r8)
            int r8 = r2.f235695n
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Code:"
            r4.append(r6)
            int r2 = r2.f235694j
            r4.append(r2)
            r2 = 107(0x6b, float:1.5E-43)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            gy3.C87412m.m108593f(r2, r5)
            r11.f250226c = r2
            r1.add(r11)
            int r3 = r23 + 1
            r2 = r18
            r13 = r20
            r10 = r21
            r8 = r24
            r11 = 1
            goto L_0x005b
        L_0x02ec:
            r19 = r5
            r24 = r8
            r21 = r10
            r20 = r13
            java.util.Iterator r1 = r1.iterator()
        L_0x02f8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x030f
            java.lang.Object r2 = r1.next()
            com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$a r2 = (com.tencent.p014mm.p136ui.matrix.MatrixMemoryInfoUI.C85894a) r2
            gm3.a r3 = new gm3.a
            r8 = r70
            r3.<init>(r8, r2)
            o40.C61926c.m72668M(r3)
            goto L_0x02f8
        L_0x030f:
            r8 = r70
            com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$d r9 = new com.tencent.mm.ui.matrix.MatrixMemoryInfoUI$d
            r1 = r9
            r2 = r70
            r3 = r24
            r10 = r19
            r5 = r21
            r11 = r6
            r6 = r0
            r1.<init>(r2, r3, r5, r6, r7)
            o40.C61926c.m72668M(r9)
            r27 = 6
            int r1 = r0.f27483d
            gy3.C87412m.m108593f(r14, r11)
            java.lang.String r2 = "process"
            r3 = r21
            int r0 = r3.length
            if (r0 != 0) goto L_0x0335
            r0 = 1
            goto L_0x0336
        L_0x0335:
            r0 = 0
        L_0x0336:
            if (r0 == 0) goto L_0x0341
            java.lang.String r0 = "MemInfo is empty!!"
            r4 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0595
        L_0x0341:
            r4 = r20
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x036b }
            com.tencent.mm.vfs.u0 r0 = r0.mo177788a()     // Catch:{ all -> 0x036b }
            java.lang.String r5 = "hprofs"
            com.tencent.mm.vfs.x0 r0 = (com.tencent.p014mm.vfs.C116340x0) r0     // Catch:{ all -> 0x036b }
            com.tencent.mm.vfs.FileSystem$c r0 = r0.mo177847b(r5)     // Catch:{ all -> 0x036b }
            if (r0 == 0) goto L_0x035b
            android.os.CancellationSignal r5 = new android.os.CancellationSignal     // Catch:{ all -> 0x036b }
            r5.<init>()     // Catch:{ all -> 0x036b }
            r0.mo119928a(r5)     // Catch:{ all -> 0x036b }
        L_0x035b:
            com.tencent.mm.matrix.trigger.RemoteTrigger r18 = com.tencent.p014mm.matrix.trigger.RemoteTrigger.f79440d     // Catch:{ all -> 0x036b }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 7
            r23 = 0
            t70.C36961c.C36962a.m41108a(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x036b }
            goto L_0x0372
        L_0x036b:
            r0 = move-exception
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            p723vf.C118672d.m167354d(r4, r0, r10, r6)
        L_0x0372:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x041f }
            r0.<init>()     // Catch:{ all -> 0x041f }
            java.lang.String r6 = "timestamp"
            r11 = r24
            r5.put(r6, r11)     // Catch:{ all -> 0x041f }
            java.lang.String r6 = "apps"
            r5.put(r6, r0)     // Catch:{ all -> 0x041f }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x041f }
            r6.<init>()     // Catch:{ all -> 0x041f }
            java.util.Iterator r7 = r14.iterator()     // Catch:{ all -> 0x041f }
        L_0x0392:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x041f }
            if (r9 == 0) goto L_0x03b4
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x041f }
            r11 = r9
            sm.c$a r11 = (p235sm.C90229c.C90230a) r11     // Catch:{ all -> 0x041f }
            java.util.List r11 = r11.mo124466d()     // Catch:{ all -> 0x041f }
            java.lang.String r12 = "it.appList()"
            gy3.C87412m.m108593f(r11, r12)     // Catch:{ all -> 0x041f }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x041f }
            r12 = 1
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x0392
            r6.add(r9)     // Catch:{ all -> 0x041f }
            goto L_0x0392
        L_0x03b4:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x041f }
            r9 = 10
            int r9 = sx3.C36907w.m41090l(r6, r9)     // Catch:{ all -> 0x041f }
            r7.<init>(r9)     // Catch:{ all -> 0x041f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x041f }
        L_0x03c3:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x041f }
            if (r9 == 0) goto L_0x040b
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x041f }
            sm.c$a r9 = (p235sm.C90229c.C90230a) r9     // Catch:{ all -> 0x041f }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x041f }
            r11.<init>()     // Catch:{ all -> 0x041f }
            java.lang.String r12 = r9.mo124463a()     // Catch:{ all -> 0x041f }
            r11.put(r2, r12)     // Catch:{ all -> 0x041f }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x041f }
            r12.<init>()     // Catch:{ all -> 0x041f }
            java.lang.String r13 = "ids"
            r11.put(r13, r12)     // Catch:{ all -> 0x041f }
            java.util.List r9 = r9.mo124466d()     // Catch:{ all -> 0x041f }
            java.lang.String r13 = "p.appList()"
            gy3.C87412m.m108593f(r9, r13)     // Catch:{ all -> 0x041f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x041f }
        L_0x03f3:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x041f }
            if (r13 == 0) goto L_0x0407
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x041f }
            sm.c$b r13 = (p235sm.C90229c.C90231b) r13     // Catch:{ all -> 0x041f }
            java.lang.String r13 = r13.mo124470a()     // Catch:{ all -> 0x041f }
            r12.put(r13)     // Catch:{ all -> 0x041f }
            goto L_0x03f3
        L_0x0407:
            r7.add(r11)     // Catch:{ all -> 0x041f }
            goto L_0x03c3
        L_0x040b:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x041f }
        L_0x040f:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x041f }
            if (r7 == 0) goto L_0x0426
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x041f }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ all -> 0x041f }
            r0.put(r7)     // Catch:{ all -> 0x041f }
            goto L_0x040f
        L_0x041f:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            p723vf.C118672d.m167354d(r4, r0, r10, r7)
        L_0x0426:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            xe.k$a r6 = p269xe.C91190k.f261451a
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ all -> 0x04a6 }
            r9.<init>()     // Catch:{ all -> 0x04a6 }
            java.lang.String r0 = "count"
            int r11 = r3.length     // Catch:{ all -> 0x04a6 }
            r7.put(r0, r11)     // Catch:{ all -> 0x04a6 }
            java.lang.String r0 = "detail"
            r7.put(r0, r9)     // Catch:{ all -> 0x04a6 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x04a6 }
            int r0 = r3.length     // Catch:{ all -> 0x04a6 }
            r11.<init>(r0)     // Catch:{ all -> 0x04a6 }
            int r12 = r3.length     // Catch:{ all -> 0x04a6 }
            r13 = 0
        L_0x044c:
            if (r13 >= r12) goto L_0x0492
            r0 = r3[r13]     // Catch:{ all -> 0x04a6 }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x04a6 }
            r14.<init>()     // Catch:{ all -> 0x04a6 }
            com.tencent.matrix.util.ProcessInfo r15 = r0.f235671e     // Catch:{ all -> 0x047f }
            gy3.C87412m.m108591d(r15)     // Catch:{ all -> 0x047f }
            java.lang.String r15 = r15.f235683e     // Catch:{ all -> 0x047f }
            r14.put(r2, r15)     // Catch:{ all -> 0x047f }
            java.lang.String r15 = "pid"
            r16 = r2
            com.tencent.matrix.util.ProcessInfo r2 = r0.f235671e     // Catch:{ all -> 0x047d }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x047d }
            int r2 = r2.f235682d     // Catch:{ all -> 0x047d }
            r14.put(r15, r2)     // Catch:{ all -> 0x047d }
            java.lang.String r2 = "amsPss"
            com.tencent.matrix.util.PssInfo r0 = r0.f235676j     // Catch:{ all -> 0x047d }
            gy3.C87412m.m108591d(r0)     // Catch:{ all -> 0x047d }
            org.json.JSONObject r0 = r0.mo112172a()     // Catch:{ all -> 0x047d }
            r14.put(r2, r0)     // Catch:{ all -> 0x047d }
            goto L_0x0488
        L_0x047d:
            r0 = move-exception
            goto L_0x0482
        L_0x047f:
            r0 = move-exception
            r16 = r2
        L_0x0482:
            r2 = 0
            java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ all -> 0x0490 }
            p723vf.C118672d.m167354d(r4, r0, r10, r15)     // Catch:{ all -> 0x04a6 }
        L_0x0488:
            r11.add(r14)     // Catch:{ all -> 0x04a6 }
            int r13 = r13 + 1
            r2 = r16
            goto L_0x044c
        L_0x0490:
            r0 = move-exception
            goto L_0x04a8
        L_0x0492:
            java.util.Iterator r0 = r11.iterator()     // Catch:{ all -> 0x04a6 }
        L_0x0496:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x04a6 }
            if (r2 == 0) goto L_0x04ad
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x04a6 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ all -> 0x04a6 }
            r9.put(r2)     // Catch:{ all -> 0x04a6 }
            goto L_0x0496
        L_0x04a6:
            r0 = move-exception
            r2 = 0
        L_0x04a8:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r4, r0, r10, r9)
        L_0x04ad:
            java.lang.String r42 = p269xe.C91191l.m114455a(r7)
            boolean r55 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            java.lang.Object r0 = sx3.C110823p.m150976B(r3)
            com.tencent.matrix.util.MemInfo r0 = (com.tencent.matrix.util.MemInfo) r0
            com.tencent.matrix.util.SystemInfo r0 = r0.f235675i
            gy3.C87412m.m108591d(r0)
            org.json.JSONObject r0 = r0.mo112194a()
            java.lang.String r58 = p269xe.C91191l.m114455a(r0)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.BUILD_TAG
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            java.lang.String r60 = p269xe.C91191l.m114455a(r5)
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r0 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235399x
            java.util.Map r0 = r0.mo111928e()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ all -> 0x0533 }
            r7.<init>()     // Catch:{ all -> 0x0533 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0533 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0533 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0533 }
            r9 = 0
        L_0x04e9:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0533 }
            if (r11 == 0) goto L_0x0521
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0533 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0533 }
            java.lang.Object r12 = r11.getValue()     // Catch:{ all -> 0x0533 }
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ all -> 0x0533 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0533 }
            int r9 = r9 + r12
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0533 }
            r12.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r13 = "A"
            java.lang.Object r14 = r11.getKey()     // Catch:{ all -> 0x0533 }
            r12.put(r13, r14)     // Catch:{ all -> 0x0533 }
            java.lang.String r13 = "C"
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x0533 }
            java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ all -> 0x0533 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x0533 }
            r12.put(r13, r11)     // Catch:{ all -> 0x0533 }
            r7.put(r12)     // Catch:{ all -> 0x0533 }
            goto L_0x04e9
        L_0x0521:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0533 }
            r0.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r11 = "total"
            r0.put(r11, r9)     // Catch:{ all -> 0x0533 }
            java.lang.String r9 = "leak"
            r0.put(r9, r7)     // Catch:{ all -> 0x0533 }
            r5 = r0
            goto L_0x053a
        L_0x0533:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            p723vf.C118672d.m167354d(r4, r0, r10, r7)
        L_0x053a:
            java.lang.String r50 = p269xe.C91191l.m114455a(r5)
            xe.k$b r0 = new xe.k$b
            r26 = r0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r56 = 0
            r59 = 0
            r61 = 0
            r62 = 0
            java.lang.String r5 = "BUILD_TAG"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.String r5 = "REV"
            gy3.C87412m.m108593f(r3, r5)
            r65 = 0
            r66 = 0
            r67 = -1698830340(0xffffffff9abde7fc, float:-7.854336E-23)
            r68 = 1
            r69 = 0
            java.lang.String r28 = "All"
            r41 = r1
            r63 = r2
            r64 = r3
            r26.<init>(r27, r28, r29, r30, r31, r33, r35, r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            r6.mo53491a(r0)
            java.lang.String r0 = "report24556 done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0595:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.matrix.MatrixMemoryInfoUI.run():void");
    }
}
