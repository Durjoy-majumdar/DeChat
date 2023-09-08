package hm3;

import android.content.Intent;
import com.tencent.p014mm.p136ui.matrix.MatrixOpenGLLeakResultUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import p1046ue.C90650d;
import rx3.C13598b0;

/* renamed from: hm3.g */
public final class C32961g extends C32951a {

    /* renamed from: f */
    public static volatile int f89557f;

    /* renamed from: g */
    public static final HashMap<Integer, C32961g> f89558g = new HashMap<>();

    /* renamed from: h */
    public static boolean f89559h;

    /* renamed from: d */
    public List<? extends C90650d> f89560d;

    /* renamed from: e */
    public final C32965j<String>[] f89561e = {new C32965j<>("FTSMainUI", C32966k.m39899a("2022-12-28")), new C32965j<>("MMWebViewUI", C32966k.m39899a("2022-12-28")), new C32965j<>("TmplWebViewMMUI", C32966k.m39899a("2022-12-28"))};

    /* renamed from: hm3.g$a */
    public static final class C32962a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32961g f89562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32962a(C32961g gVar) {
            super(0);
            this.f89562d = gVar;
        }

        public Object invoke() {
            Intent intent = new Intent();
            C32961g gVar = this.f89562d;
            int i = C32961g.f89557f;
            int i2 = C32961g.f89557f;
            C32961g.f89557f = i2 + 1;
            intent.putExtra("KEY_COUNTER", i2);
            gVar.mo58886b(intent);
            return C13598b0.f38549a;
        }
    }

    public C32961g() {
        f89558g.put(Integer.valueOf(f89557f), this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x002a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58885a(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "intent"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "KEY_COUNTER"
            r1 = -1
            int r0 = r14.getIntExtra(r0, r1)
            java.util.HashMap<java.lang.Integer, hm3.g> r1 = f89558g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            hm3.g r1 = (hm3.C32961g) r1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0074
            java.util.List r5 = r1.mo58890d()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x002a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0075
            java.lang.Object r7 = r5.next()
            r8 = r7
            ue.d r8 = (p1046ue.C90650d) r8
            ue.e r9 = p1046ue.C90652e.f260459f
            java.util.List<ue.d> r10 = r9.f260461b
            monitor-enter(r10)
            java.util.List<ue.d> r11 = r9.f260461b     // Catch:{ all -> 0x0071 }
            java.util.LinkedList r11 = (java.util.LinkedList) r11     // Catch:{ all -> 0x0071 }
            boolean r11 = r11.contains(r8)     // Catch:{ all -> 0x0071 }
            if (r11 != 0) goto L_0x0048
            r11 = 1
            goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            monitor-exit(r10)     // Catch:{ all -> 0x0071 }
            if (r11 != 0) goto L_0x006a
            java.util.List<java.lang.Long> r10 = r9.f260464e
            monitor-enter(r10)
            java.util.List<java.lang.Long> r9 = r9.f260464e     // Catch:{ all -> 0x0067 }
            long r11 = r8.f260448g     // Catch:{ all -> 0x0067 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0067 }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0067 }
            boolean r8 = r9.contains(r8)     // Catch:{ all -> 0x0067 }
            if (r8 != 0) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            monitor-exit(r10)     // Catch:{ all -> 0x0067 }
            if (r8 != 0) goto L_0x006a
            r8 = 1
            goto L_0x006b
        L_0x0067:
            r14 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0067 }
            throw r14
        L_0x006a:
            r8 = 0
        L_0x006b:
            if (r8 == 0) goto L_0x002a
            r6.add(r7)
            goto L_0x002a
        L_0x0071:
            r14 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0071 }
            throw r14
        L_0x0074:
            r6 = r4
        L_0x0075:
            if (r6 == 0) goto L_0x007c
            r1.getClass()
            r1.f89560d = r6
        L_0x007c:
            if (r6 == 0) goto L_0x0086
            boolean r1 = r6.isEmpty()
            r1 = r1 ^ r3
            if (r3 != r1) goto L_0x0086
            r2 = 1
        L_0x0086:
            java.lang.String r1 = "MicroMsg.MatrixOpenGLLeakResultHelper"
            if (r2 == 0) goto L_0x00ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "leak not empty["
            r0.append(r2)
            int r2 = r6.size()
            r0.append(r2)
            java.lang.String r2 = "]. continue start ui"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            super.mo58885a(r14)
            goto L_0x00d1
        L_0x00ab:
            java.util.HashMap<java.lang.Integer, hm3.g> r14 = f89558g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r14 = r14.remove(r0)
            hm3.g r14 = (hm3.C32961g) r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "skip start ui, already released: "
            r0.append(r2)
            if (r14 == 0) goto L_0x00c7
            java.util.List r4 = r14.mo58890d()
        L_0x00c7:
            r0.append(r4)
            java.lang.String r14 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hm3.C32961g.mo58885a(android.content.Intent):void");
    }

    /* renamed from: c */
    public String mo58887c() {
        return MatrixOpenGLLeakResultUI.class.getName();
    }

    /* renamed from: d */
    public final List<C90650d> mo58890d() {
        List<? extends C90650d> list = this.f89560d;
        if (list != null) {
            return list;
        }
        C87412m.m108603p("openGLInfoList");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x001e A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58891e(java.util.List<? extends p1046ue.C90650d> r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "list"
            r2 = r19
            gy3.C87412m.m108594g(r2, r1)
            boolean r1 = f89559h
            java.lang.String r3 = "MicroMsg.MatrixOpenGLLeakResultHelper"
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "muted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r19.iterator()
        L_0x001e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x009e
            java.lang.Object r4 = r2.next()
            r5 = r4
            ue.d r5 = (p1046ue.C90650d) r5
            hm3.j<java.lang.String>[] r6 = r0.f89561e
            ve.a$a r7 = r5.f260451j
            java.lang.String r7 = r7.f260663b
            java.lang.String r8 = "it.activityInfo.name"
            gy3.C87412m.m108593f(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r6.length
            r11 = 0
        L_0x003d:
            r12 = 1
            if (r11 >= r9) goto L_0x0058
            r13 = r6[r11]
            long r14 = java.lang.System.currentTimeMillis()
            r16 = r11
            long r10 = r13.f89568b
            int r17 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r17 >= 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r12 = 0
        L_0x0050:
            if (r12 == 0) goto L_0x0055
            r8.add(r13)
        L_0x0055:
            int r11 = r16 + 1
            goto L_0x003d
        L_0x0058:
            boolean r6 = r8.isEmpty()
            if (r6 == 0) goto L_0x0060
        L_0x005e:
            r11 = 0
            goto L_0x007f
        L_0x0060:
            java.util.Iterator r6 = r8.iterator()
        L_0x0064:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x005e
            java.lang.Object r8 = r6.next()
            hm3.j r8 = (hm3.C32965j) r8
            T r8 = r8.f89567a
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9 = 2
            r10 = 0
            r11 = 0
            boolean r8 = z04.C112550d0.m153803w(r7, r8, r11, r9, r10)
            if (r8 == 0) goto L_0x0064
            r10 = 1
            goto L_0x0080
        L_0x007f:
            r10 = 0
        L_0x0080:
            if (r10 == 0) goto L_0x0096
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "leak white list: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
        L_0x0096:
            r5 = r10 ^ 1
            if (r5 == 0) goto L_0x001e
            r1.add(r4)
            goto L_0x001e
        L_0x009e:
            r0.f89560d = r1
            java.util.List r1 = r18.mo58890d()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b0
            java.lang.String r1 = "no leak"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        L_0x00b0:
            hm3.g$a r1 = new hm3.g$a
            r1.<init>(r0)
            o40.C61926c.m72668M(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hm3.C32961g.mo58891e(java.util.List):void");
    }
}
