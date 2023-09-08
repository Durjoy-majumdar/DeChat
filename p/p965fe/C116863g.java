package p965fe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import java.util.Map;
import p1195ge.C116947b;
import p329d3.C58104c;
import p981ie.C87705i;

/* renamed from: fe.g */
public class C116863g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114467i f350267d;

    /* renamed from: e */
    public final /* synthetic */ C86853a f350268e;

    /* renamed from: fe.g$a */
    public class C116864a implements C87705i<C114490k0.C114491a.C114492a<C114513o0.C114515b>> {

        /* renamed from: a */
        public final /* synthetic */ C114490k0.C114491a.C114492a f350269a;

        /* renamed from: b */
        public final /* synthetic */ Map f350270b;

        public C116864a(C116863g gVar, C114490k0.C114491a.C114492a aVar, Map map) {
            this.f350269a = aVar;
            this.f350270b = map;
        }

        public void accept(Object obj) {
            C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
            if (((C116947b.C116948a) this.f350269a.f343207c).f350469f.containsKey("power-mobile-statByte")) {
                Object obj2 = ((C116947b.C116948a) this.f350269a.f343207c).f350469f.get("power-mobile-statByte");
                if (obj2 instanceof Double) {
                    this.f350270b.put(" - mobile-PowerBytes", new C58104c("mAh", Double.valueOf(((Double) obj2).doubleValue())));
                    this.f350270b.put("   - mobile-RxBytes", new C58104c("byte", Double.valueOf((double) ((Long) ((C114513o0.C114515b) aVar.f343207c).f343250h.f343211a).longValue())));
                    this.f350270b.put("   - mobile-TxBytes", new C58104c("byte", Double.valueOf((double) ((Long) ((C114513o0.C114515b) aVar.f343207c).f343251i.f343211a).longValue())));
                }
            }
        }
    }

    /* renamed from: fe.g$b */
    public class C116865b implements C87705i<C114490k0.C114491a.C114492a<C114513o0.C114515b>> {

        /* renamed from: a */
        public final /* synthetic */ C114490k0.C114491a.C114492a f350271a;

        /* renamed from: b */
        public final /* synthetic */ Map f350272b;

        public C116865b(C116863g gVar, C114490k0.C114491a.C114492a aVar, Map map) {
            this.f350271a = aVar;
            this.f350272b = map;
        }

        public void accept(Object obj) {
            C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
            if (((C116947b.C116948a) this.f350271a.f343207c).f350469f.containsKey("power-wifi-statByte")) {
                Object obj2 = ((C116947b.C116948a) this.f350271a.f343207c).f350469f.get("power-wifi-statByte");
                if (obj2 instanceof Double) {
                    this.f350272b.put(" - wifi-PowerBytes", new C58104c("mAh", Double.valueOf(((Double) obj2).doubleValue())));
                    this.f350272b.put("   - wifi-RxBytes", new C58104c("byte", Double.valueOf((double) ((Long) ((C114513o0.C114515b) aVar.f343207c).f343246d.f343211a).longValue())));
                    this.f350272b.put("   - wifi-TxBytes", new C58104c("byte", Double.valueOf((double) ((Long) ((C114513o0.C114515b) aVar.f343207c).f343247e.f343211a).longValue())));
                }
            }
            if (((C116947b.C116948a) this.f350271a.f343207c).f350469f.containsKey("power-wifi-statPacket")) {
                Object obj3 = ((C116947b.C116948a) this.f350271a.f343207c).f350469f.get("power-wifi-statPacket");
                if (obj3 instanceof Double) {
                    this.f350272b.put(" - wifi-PowerPackets", new C58104c("mAh", Double.valueOf(((Double) obj3).doubleValue())));
                    this.f350272b.put("   - wifi-RxPackets", new C58104c("packet", Double.valueOf((double) ((Long) ((C114513o0.C114515b) aVar.f343207c).f343248f.f343211a).longValue())));
                    this.f350272b.put("   - wifi-TxPackets", new C58104c("packet", Double.valueOf((double) ((Long) ((C114513o0.C114515b) aVar.f343207c).f343249g.f343211a).longValue())));
                }
            }
        }
    }

    public C116863g(C86853a aVar, C114467i iVar) {
        this.f350268e = aVar;
        this.f350267d = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x073d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0754 A[LOOP:8: B:105:0x0687->B:124:0x0754, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0312 A[EDGE_INSN: B:134:0x0312->B:71:0x0312 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x075c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02eb A[LOOP:4: B:47:0x01d2->B:69:0x02eb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r48 = this;
            r0 = r48
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.o0$b> r1 = com.tencent.matrix.batterycanary.monitor.feature.C114513o0.C114515b.class
            fe.a r2 = r0.f350268e
            android.view.View r2 = r2.f252125e
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            com.tencent.matrix.batterycanary.monitor.feature.i r2 = r0.f350267d
            ce.a r3 = r2.f343163l
            if (r3 != 0) goto L_0x0012
            return
        L_0x0012:
            java.util.List r2 = r2.mo173663g()
            fe.a r4 = r0.f350268e
            android.view.View r4 = r4.f252125e
            android.content.Context r4 = r4.getContext()
            int r4 = p981ie.C117159b.m165208i(r4)
            fe.a r5 = r0.f350268e
            android.view.View r5 = r5.f252125e
            r6 = 2131315747(0x7f094c23, float:1.8249956E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "/"
            r8 = 1092616192(0x41200000, float:10.0)
            if (r4 <= 0) goto L_0x0041
            float r9 = (float) r4
            float r9 = r9 / r8
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            goto L_0x0042
        L_0x0041:
            r9 = r7
        L_0x0042:
            r6.append(r9)
            java.lang.String r9 = "°C"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.setText(r6)
            fe.a r6 = r0.f350268e
            r10 = 300(0x12c, float:4.2E-43)
            r11 = 350(0x15e, float:4.9E-43)
            r14 = 0
            if (r4 < r11) goto L_0x005d
            r15 = 2
            goto L_0x0062
        L_0x005d:
            if (r4 < r10) goto L_0x0061
            r15 = 1
            goto L_0x0062
        L_0x0061:
            r15 = 0
        L_0x0062:
            p965fe.C86853a.m107856a(r6, r5, r15)
            fe.a r5 = r0.f350268e
            android.view.View r5 = r5.f252125e
            r6 = 2131315845(0x7f094c85, float:1.8250155E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r4 <= 0) goto L_0x007f
            float r7 = (float) r4
            float r7 = r7 / r8
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L_0x007f:
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.setText(r6)
            fe.a r6 = r0.f350268e
            if (r4 < r11) goto L_0x0092
            r4 = 2
            goto L_0x0097
        L_0x0092:
            if (r4 < r10) goto L_0x0096
            r4 = 1
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            p965fe.C86853a.m107856a(r6, r5, r4)
            fe.a r4 = r0.f350268e
            android.view.View r4 = r4.f252125e
            r5 = 2131307114(0x7f092a6a, float:1.8232446E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5 = 0
        L_0x00a8:
            int r6 = r4.getChildCount()
            r7 = 8
            if (r5 >= r6) goto L_0x00f5
            android.view.View r6 = r4.getChildAt(r5)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.mo10233c(r7)
            java.lang.Object[] r16 = r9.mo10232b()
            java.lang.String r17 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r18 = "run"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r9.mo10231a(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r16 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r17 = "run"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            int r5 = r5 + 1
            goto L_0x00a8
        L_0x00f5:
            fe.a r5 = r0.f350268e
            android.view.View r5 = r5.f252125e
            r6 = 2131307111(0x7f092a67, float:1.823244E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 0
        L_0x0103:
            int r9 = r5.getChildCount()
            if (r6 >= r9) goto L_0x014e
            android.view.View r9 = r5.getChildAt(r6)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r10.mo10233c(r11)
            java.lang.Object[] r16 = r10.mo10232b()
            java.lang.String r17 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r18 = "run"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r9
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r10 = r10.mo10231a(r14)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r16 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r17 = "run"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            int r6 = r6 + 1
            goto L_0x0103
        L_0x014e:
            fe.a r6 = r0.f350268e
            android.view.View r6 = r6.f252125e
            android.content.Context r6 = r6.getContext()
            java.util.List r6 = p961ee.C86507b.m107281l(r6)
            r9 = 0
            r10 = 0
        L_0x015c:
            int r11 = r2.size()
            java.lang.String r12 = "%"
            if (r10 >= r11) goto L_0x03f6
            java.lang.Object r11 = r2.get(r10)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r11 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r11
            boolean r17 = r11.mo173690b()
            if (r17 == 0) goto L_0x03d7
            RECORD r7 = r11.f343207c
            r8 = r7
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r8 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r8
            int r8 = r8.f343059d
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r7 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r7
            java.lang.String r7 = r7.f343061f
            r19 = r6
            java.util.ArrayList r19 = (java.util.ArrayList) r19
            java.util.Iterator r19 = r19.iterator()
        L_0x0183:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L_0x01a4
            java.lang.Object r20 = r19.next()
            r13 = r20
            d3.c r13 = (p329d3.C58104c) r13
            F r15 = r13.f166179a
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r15 != r8) goto L_0x0183
            S r7 = r13.f166180b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = p965fe.C86853a.m107857d(r7)
            goto L_0x0183
        L_0x01a4:
            fe.a r13 = r0.f350268e
            d3.c<java.lang.Integer, java.lang.String> r13 = r13.f252124d
            F r13 = r13.f166179a
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r22 = 10
            if (r8 != r13) goto L_0x0319
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            java.lang.String r7 = " <-"
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            RECORD r13 = r11.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r13 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r13
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r13 = r13.f343063h
            java.util.List<ITEM> r13 = r13.f343212a
            java.util.Iterator r13 = r13.iterator()
            r15 = 0
        L_0x01d2:
            boolean r24 = r13.hasNext()
            if (r24 == 0) goto L_0x0300
            java.lang.Object r24 = r13.next()
            r14 = r24
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r14 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r14
            r24 = r2
            DIGIT r2 = r14.f343211a
            java.lang.Long r2 = (java.lang.Long) r2
            r25 = r6
            r26 = r7
            long r6 = r2.longValue()
            int r2 = r14.f343066b
            r27 = r13
            java.lang.String r13 = r14.f343067c
            r28 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r29 = r3
            boolean r3 = r14.f343068d
            if (r3 == 0) goto L_0x0204
            java.lang.String r3 = "+"
            goto L_0x0207
        L_0x0204:
            java.lang.String r3 = "~"
        L_0x0207:
            r1.append(r3)
            java.lang.String r3 = r14.f343069e
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r30 = r4
            long r3 = r11.f343208d
            long r3 = r3 / r22
            float r3 = p961ee.C86507b.m107278i(r6, r3)
            android.view.View r4 = r5.getChildAt(r15)
            fe.a r6 = r0.f350268e
            boolean r6 = r6.f252128h
            if (r6 != 0) goto L_0x026b
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r39 = r5
            r7 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r5)
            java.lang.Object[] r32 = r6.mo10232b()
            java.lang.String r33 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r34 = "run"
            java.lang.String r35 = "()V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r4
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r5 = 0
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r4.setVisibility(r5)
            java.lang.String r32 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r33 = "run"
            java.lang.String r34 = "()V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
            goto L_0x026d
        L_0x026b:
            r39 = r5
        L_0x026d:
            r5 = 2131315780(0x7f094c44, float:1.8250023E38)
            android.view.View r6 = r4.findViewById(r5)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5 = 2131315850(0x7f094c8a, float:1.8250165E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131315837(0x7f094c7d, float:1.8250139E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r31 = r8
            r8 = 2131315766(0x7f094c36, float:1.8249995E38)
            android.view.View r4 = r4.findViewById(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6.setText(r13)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.setText(r2)
            r7.setText(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.String r8 = p961ee.C86507b.m107280k(r3, r2)
            r1.append(r8)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r4.setText(r1)
            boolean r1 = r14.f343068d
            if (r1 == 0) goto L_0x02bf
            r1 = 1092616192(0x41200000, float:10.0)
        L_0x02bd:
            r2 = 0
            goto L_0x02d0
        L_0x02bf:
            r1 = 1112014848(0x42480000, float:50.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x02c9
            r1 = 1092616192(0x41200000, float:10.0)
            r2 = 2
            goto L_0x02d0
        L_0x02c9:
            r1 = 1092616192(0x41200000, float:10.0)
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x02bd
            r2 = 1
        L_0x02d0:
            fe.a r3 = r0.f350268e
            p965fe.C86853a.m107856a(r3, r6, r2)
            fe.a r3 = r0.f350268e
            p965fe.C86853a.m107856a(r3, r5, r2)
            fe.a r3 = r0.f350268e
            p965fe.C86853a.m107856a(r3, r7, r2)
            fe.a r3 = r0.f350268e
            p965fe.C86853a.m107856a(r3, r4, r2)
            int r15 = r15 + 1
            r2 = 10
            if (r15 < r2) goto L_0x02eb
            goto L_0x0312
        L_0x02eb:
            r2 = r24
            r6 = r25
            r7 = r26
            r13 = r27
            r1 = r28
            r3 = r29
            r4 = r30
            r8 = r31
            r5 = r39
            r14 = 0
            goto L_0x01d2
        L_0x0300:
            r28 = r1
            r24 = r2
            r29 = r3
            r30 = r4
            r39 = r5
            r25 = r6
            r26 = r7
            r31 = r8
            r1 = 1092616192(0x41200000, float:10.0)
        L_0x0312:
            fe.a r2 = r0.f350268e
            r2.f252127g = r11
            r7 = r26
            goto L_0x0329
        L_0x0319:
            r28 = r1
            r24 = r2
            r29 = r3
            r30 = r4
            r39 = r5
            r25 = r6
            r31 = r8
            r1 = 1092616192(0x41200000, float:10.0)
        L_0x0329:
            RECORD r2 = r11.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r2
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r2 = r2.f343062g
            DIGIT r2 = r2.f343211a
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r4 = r11.f343208d
            long r4 = r4 / r22
            float r2 = p961ee.C86507b.m107278i(r2, r4)
            float r9 = r9 + r2
            r4 = r30
            android.view.View r3 = r4.getChildAt(r10)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r41 = r5.mo10232b()
            java.lang.String r42 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r43 = "run"
            java.lang.String r44 = "()V"
            java.lang.String r45 = "android/view/View_EXEC_"
            java.lang.String r46 = "setVisibility"
            java.lang.String r47 = "(I)V"
            r40 = r3
            j20.C117292a.m165358d(r40, r41, r42, r43, r44, r45, r46, r47)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r33 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r34 = "run"
            java.lang.String r35 = "()V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r32 = r3
            j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
            r5 = 2131315780(0x7f094c44, float:1.8250023E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131315792(0x7f094c50, float:1.8250047E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r8 = 2131315766(0x7f094c36, float:1.8249995E38)
            android.view.View r3 = r3.findViewById(r8)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = ":"
            r8.append(r11)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r5.setText(r7)
            java.lang.String r5 = java.lang.String.valueOf(r31)
            r6.setText(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 1
            java.lang.String r2 = p961ee.C86507b.m107280k(r2, r6)
            r5.append(r2)
            r5.append(r12)
            java.lang.String r2 = r5.toString()
            r3.setText(r2)
            goto L_0x03e3
        L_0x03d7:
            r28 = r1
            r24 = r2
            r29 = r3
            r39 = r5
            r25 = r6
            r1 = 1092616192(0x41200000, float:10.0)
        L_0x03e3:
            int r10 = r10 + 1
            r2 = r24
            r6 = r25
            r1 = r28
            r3 = r29
            r5 = r39
            r7 = 8
            r8 = 1092616192(0x41200000, float:10.0)
            r14 = 0
            goto L_0x015c
        L_0x03f6:
            r28 = r1
            r29 = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 1
            java.lang.String r2 = p961ee.C86507b.m107280k(r9, r2)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            fe.a r2 = r0.f350268e
            android.view.View r2 = r2.f252125e
            r3 = 2131315748(0x7f094c24, float:1.8249958E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r1)
            fe.a r2 = r0.f350268e
            android.view.View r2 = r2.f252125e
            r3 = 2131315767(0x7f094c37, float:1.8249997E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r1)
            fe.a r1 = r0.f350268e
            android.view.View r1 = r1.f252125e
            r2 = 2131307113(0x7f092a69, float:1.8232444E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
        L_0x043c:
            int r3 = r1.getChildCount()
            if (r2 >= r3) goto L_0x048b
            android.view.View r3 = r1.getChildAt(r2)
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r13 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r7 = "run"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = 0
            java.lang.Object r5 = r12.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r6 = "run"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r2 + 1
            goto L_0x043c
        L_0x048b:
            fe.a r2 = r0.f350268e
            boolean r2 = r2.f252128h
            if (r2 == 0) goto L_0x075c
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            com.tencent.matrix.batterycanary.monitor.feature.i r3 = r0.f350267d
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$d> r4 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114540d.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r3 = r3.mo173673q(r4)
            r4 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            r6 = 0
            java.lang.String r7 = "currency"
            java.lang.String r8 = "mAh"
            if (r3 == 0) goto L_0x04e3
            double r9 = r3.f343236h
            r11 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
            double r9 = r9 / r11
            r3 = r29
            long r11 = r3.f338976n
            float r11 = (float) r11
            r12 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 * r12
            r12 = 1247525376(0x4a5bba00, float:3600000.0)
            float r11 = r11 / r12
            double r11 = (double) r11
            double r9 = r9 * r11
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            double r9 = r9.doubleValue()
            double r9 = r9 * r4
            long r11 = r3.f338976n
            double r11 = (double) r11
            double r9 = r9 / r11
            d3.c r11 = new d3.c
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r9 = r9 / r12
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            r11.<init>(r8, r9)
            r2.put(r7, r11)
            goto L_0x04ed
        L_0x04e3:
            r3 = r29
            d3.c r9 = new d3.c
            r9.<init>(r8, r6)
            r2.put(r7, r9)
        L_0x04ed:
            com.tencent.matrix.batterycanary.monitor.feature.i r7 = r0.f350267d
            java.lang.Class<ge.b$a> r9 = p1195ge.C116947b.C116948a.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r7 = r7.mo173667k(r9)
            if (r7 == 0) goto L_0x067e
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            double r10 = r10.mo180934d()
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r9.<init>(r8, r10)
            java.lang.String r10 = "total"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350471g
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "cpu"
            r2.put(r10, r9)
            java.lang.String r9 = "JiffyUid"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x052d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0590
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            RECORD r11 = r7.f343207c
            ge.b$a r11 = (p1195ge.C116947b.C116948a) r11
            java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f350469f
            java.lang.Object r10 = r11.get(r10)
            if (r10 == 0) goto L_0x052d
            boolean r11 = r10 instanceof java.util.Map
            if (r11 == 0) goto L_0x052d
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0553:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x052d
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.Object r11 = r11.getValue()
            java.lang.String r13 = "power-cpu"
            boolean r14 = r12.startsWith(r13)
            if (r14 == 0) goto L_0x0553
            boolean r14 = r11 instanceof java.lang.Double
            if (r14 == 0) goto L_0x0553
            java.lang.Double r11 = (java.lang.Double) r11
            double r14 = r11.doubleValue()
            java.lang.String r11 = " - cpu"
            java.lang.String r11 = r12.replace(r13, r11)
            d3.c r12 = new d3.c
            java.lang.Double r13 = java.lang.Double.valueOf(r14)
            r12.<init>(r8, r13)
            r2.put(r11, r12)
            goto L_0x0553
        L_0x0590:
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350473h
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "wakelocks"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350475i
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "mobile"
            r2.put(r10, r9)
            com.tencent.matrix.batterycanary.monitor.feature.i r9 = r0.f350267d
            fe.g$a r10 = new fe.g$a
            r10.<init>(r0, r7, r2)
            r11 = r28
            r9.mo173668l(r11, r10)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350477j
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "wifi"
            r2.put(r10, r9)
            com.tencent.matrix.batterycanary.monitor.feature.i r9 = r0.f350267d
            fe.g$b r10 = new fe.g$b
            r10.<init>(r0, r7, r2)
            r9.mo173668l(r11, r10)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350479k
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "blueTooth"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350481l
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "gps"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350483m
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "sensors"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350485n
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "camera"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350487o
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "flashLight"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350489p
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "audio"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350491q
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "video"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r10 = r7.f343207c
            ge.b$a r10 = (p1195ge.C116947b.C116948a) r10
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r10 = r10.f350493r
            DIGIT r10 = r10.f343211a
            r9.<init>(r8, r10)
            java.lang.String r10 = "screen"
            r2.put(r10, r9)
            d3.c r9 = new d3.c
            RECORD r7 = r7.f343207c
            ge.b$a r7 = (p1195ge.C116947b.C116948a) r7
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Double> r7 = r7.f350497t
            DIGIT r7 = r7.f343211a
            r9.<init>(r8, r7)
            java.lang.String r7 = "idle"
            r2.put(r7, r9)
        L_0x067e:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r7 = 0
        L_0x0687:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x075c
            java.lang.Object r9 = r2.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            d3.c r9 = (p329d3.C58104c) r9
            F r11 = r9.f166179a
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x06ce
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x06c2
            S r9 = r9.f166180b
            if (r9 == 0) goto L_0x06ce
            java.lang.Double r9 = (java.lang.Double) r9
            double r13 = r9.doubleValue()
            double r13 = r13 * r4
            long r4 = r3.f338976n
            double r4 = (double) r4
            double r13 = r13 / r4
            java.lang.Double r4 = java.lang.Double.valueOf(r13)
            goto L_0x06cf
        L_0x06c2:
            F r4 = r9.f166179a
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            S r4 = r9.f166180b
            if (r4 == 0) goto L_0x06ce
            java.lang.Double r4 = (java.lang.Double) r4
            goto L_0x06cf
        L_0x06ce:
            r4 = r6
        L_0x06cf:
            android.view.View r5 = r1.getChildAt(r7)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r13)
            java.lang.Object[] r26 = r9.mo10232b()
            java.lang.String r27 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r28 = "run"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r5
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r11 = 0
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.setVisibility(r9)
            java.lang.String r26 = "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$6"
            java.lang.String r27 = "run"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            r9 = 2131315780(0x7f094c44, float:1.8250023E38)
            android.view.View r13 = r5.findViewById(r9)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131315867(0x7f094c9b, float:1.82502E38)
            android.view.View r14 = r5.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r6 = 2131315806(0x7f094c5e, float:1.8250076E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r13.setText(r10)
            r14.setText(r12)
            if (r4 != 0) goto L_0x073d
            java.lang.String r4 = "NULL"
            r5.setText(r4)
            goto L_0x074d
        L_0x073d:
            double r12 = r4.doubleValue()
            r4 = 5
            double r12 = p1195ge.C116951c.m165015p(r12, r4)
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r5.setText(r4)
        L_0x074d:
            int r7 = r7 + 1
            r4 = 30
            if (r7 < r4) goto L_0x0754
            goto L_0x075c
        L_0x0754:
            r4 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            r6 = 0
            goto L_0x0687
        L_0x075c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p965fe.C116863g.run():void");
    }
}
