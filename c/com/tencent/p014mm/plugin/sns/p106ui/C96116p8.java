package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.sns.ui.p8 */
public class C96116p8 {

    /* renamed from: a */
    public int f280730a = -1;

    /* renamed from: b */
    public int f280731b = -1;

    /* renamed from: c */
    public int f280732c = -1;

    /* renamed from: d */
    public int f280733d = -1;

    /* renamed from: e */
    public int f280734e = 0;

    /* renamed from: f */
    public int f280735f = -1;

    /* renamed from: g */
    public boolean f280736g = false;

    /* renamed from: h */
    public int f280737h;

    /* renamed from: i */
    public ListView f280738i;

    /* renamed from: j */
    public SnsCommentFooter f280739j;

    /* renamed from: k */
    public Runnable f280740k = new C96117a();

    /* renamed from: l */
    public Runnable f280741l = new C96118b();

    /* renamed from: m */
    public Runnable f280742m = new C96119c();

    /* renamed from: com.tencent.mm.plugin.sns.ui.p8$a */
    public class C96117a implements Runnable {
        public C96117a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a5, code lost:
            if (r3 > ((r8.f280733d - com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123153b(r8).getHeight()) - 150)) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.plugin.sns.ui.p8 r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                android.widget.ListView r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r2)
                if (r2 == 0) goto L_0x0175
                com.tencent.mm.plugin.sns.ui.p8 r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                android.widget.ListView r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r2)
                int r2 = r2.getCount()
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r4 = r3.f280730a
                if (r2 <= r4) goto L_0x0175
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123153b(r3)
                int r2 = r2.getTop()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "limitCount: "
                r3.append(r4)
                com.tencent.mm.plugin.sns.ui.p8 r4 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                java.lang.String r5 = "access$200"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                int r4 = r4.f280737h
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                r3.append(r4)
                java.lang.String r4 = " footerHeight:"
                r3.append(r4)
                com.tencent.mm.plugin.sns.ui.p8 r4 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter r4 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123153b(r4)
                int r4 = r4.getHeight()
                r3.append(r4)
                java.lang.String r4 = " listOriginalBottom: "
                r3.append(r4)
                com.tencent.mm.plugin.sns.ui.p8 r4 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r4 = r4.f280733d
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.TimeLineScrollAnimation"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                java.lang.String r7 = "access$210"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                int r8 = r3.f280737h
                int r9 = r8 + -1
                r3.f280737h = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                if (r8 <= 0) goto L_0x00bf
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123154c(r3)
                r7 = 200(0xc8, float:2.8E-43)
                if (r3 != r2) goto L_0x00a7
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r8 = r3.f280733d
                int r8 = r8 - r7
                if (r2 > r8) goto L_0x00a7
                android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r3)
                int r3 = r3.getBottom()
                com.tencent.mm.plugin.sns.ui.p8 r8 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r9 = r8.f280733d
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter r8 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123153b(r8)
                int r8 = r8.getHeight()
                int r9 = r9 - r8
                int r9 = r9 + -150
                if (r3 <= r9) goto L_0x00bf
            L_0x00a7:
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                int r3 = r3.f280737h
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                if (r3 != 0) goto L_0x00b4
                goto L_0x00b6
            L_0x00b4:
                r7 = 10
            L_0x00b6:
                com.tencent.mm.sdk.platformtools.MMHandler r3 = new com.tencent.mm.sdk.platformtools.MMHandler
                r3.<init>()
                long r7 = (long) r7
                r3.postDelayed(r10, r7)
            L_0x00bf:
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                java.lang.String r5 = "access$302"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                r3.f280735f = r2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                com.tencent.mm.plugin.sns.ui.p8 r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r2 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123154c(r2)
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = r3.f280734e
                int r2 = r2 - r5
                int r3 = r3.f280731b
                int r2 = r2 - r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "itemH:"
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = r5.f280731b
                r3.append(r5)
                java.lang.String r5 = " footerTop"
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123154c(r5)
                r3.append(r5)
                java.lang.String r5 = " list.bottom:"
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                android.widget.ListView r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r5)
                int r5 = r5.getBottom()
                r3.append(r5)
                java.lang.String r5 = " position: "
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = r5.f280730a
                r3.append(r5)
                java.lang.String r5 = " topselection: "
                r3.append(r5)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "list.getTop(): "
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                android.widget.ListView r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r5)
                int r5 = r5.getTop()
                r3.append(r5)
                java.lang.String r5 = " marginTop: "
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = r5.f280734e
                r3.append(r5)
                java.lang.String r5 = " footerTop "
                r3.append(r5)
                com.tencent.mm.plugin.sns.ui.p8 r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123154c(r5)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
                com.tencent.mm.plugin.sns.ui.p8 r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                android.widget.ListView r3 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r3)
                com.tencent.mm.plugin.sns.ui.p8 r4 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.this
                int r5 = r4.f280730a
                android.widget.ListView r4 = com.tencent.p014mm.plugin.sns.p106ui.C96116p8.m123152a(r4)
                int r4 = r4.getHeaderViewsCount()
                int r5 = r5 + r4
                r3.setSelectionFromTop(r5, r2)
            L_0x0175:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96116p8.C96117a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.p8$b */
    public class C96118b implements Runnable {

        /* renamed from: d */
        public int f280744d = 0;

        public C96118b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$2");
            if (C96116p8.m123152a(C96116p8.this) != null) {
                int count = C96116p8.m123152a(C96116p8.this).getCount();
                C96116p8 p8Var = C96116p8.this;
                if (count > p8Var.f280730a) {
                    int top = C96116p8.m123153b(p8Var).getTop();
                    SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    p8Var.f280735f = top;
                    SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    int c = C96116p8.m123154c(C96116p8.this);
                    C96116p8 p8Var2 = C96116p8.this;
                    int i = (c - p8Var2.f280734e) - p8Var2.f280731b;
                    Log.m105918d("MicroMsg.TimeLineScrollAnimation", "itemH:" + C96116p8.this.f280731b + " footerTop" + C96116p8.m123154c(C96116p8.this) + " list.bottom:" + C96116p8.m123152a(C96116p8.this).getBottom() + " position: " + C96116p8.this.f280730a + " topselection: " + i);
                    StringBuilder sb = new StringBuilder();
                    sb.append("list.getTop(): ");
                    sb.append(C96116p8.m123152a(C96116p8.this).getTop());
                    sb.append(" marginTop: ");
                    sb.append(C96116p8.this.f280734e);
                    sb.append(" footerTop ");
                    sb.append(C96116p8.m123154c(C96116p8.this));
                    Log.m105918d("MicroMsg.TimeLineScrollAnimation", sb.toString());
                    if (i == this.f280744d) {
                        ListView a = C96116p8.m123152a(C96116p8.this);
                        C96116p8 p8Var3 = C96116p8.this;
                        a.setSelectionFromTop(p8Var3.f280730a + C96116p8.m123152a(p8Var3).getHeaderViewsCount(), i);
                        this.f280744d = 0;
                        C96116p8 p8Var4 = C96116p8.this;
                        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                        p8Var4.f280737h = 0;
                        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    } else {
                        C96116p8 p8Var5 = C96116p8.this;
                        SnsMethodCalculate.markStartTimeMs("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                        int i2 = p8Var5.f280737h;
                        p8Var5.f280737h = i2 - 1;
                        SnsMethodCalculate.markEndTimeMs("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                        if (i2 > 0) {
                            new MMHandler().postDelayed(this, 100);
                            this.f280744d = i;
                        } else {
                            this.f280744d = 0;
                            C96116p8 p8Var6 = C96116p8.this;
                            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                            p8Var6.f280737h = 0;
                            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.p8$c */
    public class C96119c implements Runnable {
        public C96119c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$3");
            Log.m105918d("MicroMsg.TimeLineScrollAnimation", "originalTop:" + C96116p8.this.f280732c + " position:" + C96116p8.this.f280730a + " list.bottom:" + C96116p8.m123152a(C96116p8.this).getBottom());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$3");
        }
    }

    public C96116p8(ListView listView, SnsCommentFooter snsCommentFooter) {
        this.f280738i = listView;
        this.f280739j = snsCommentFooter;
    }

    /* renamed from: a */
    public static /* synthetic */ ListView m123152a(C96116p8 p8Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        ListView listView = p8Var.f280738i;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        return listView;
    }

    /* renamed from: b */
    public static /* synthetic */ SnsCommentFooter m123153b(C96116p8 p8Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        SnsCommentFooter snsCommentFooter = p8Var.f280739j;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        return snsCommentFooter;
    }

    /* renamed from: c */
    public static /* synthetic */ int m123154c(C96116p8 p8Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        int i = p8Var.f280735f;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        return i;
    }

    /* renamed from: d */
    public void mo133679d() {
        SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        if (!this.f280736g) {
            SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        } else {
            this.f280736g = false;
            new MMHandler().postDelayed(this.f280742m, 30);
            this.f280737h = 10;
            SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        }
        SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
    }

    /* renamed from: e */
    public void mo133680e() {
        SnsMethodCalculate.markStartTimeMs("scrollUp2", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        this.f280736g = true;
        this.f280737h = 20;
        new MMHandler().postDelayed(this.f280741l, 100);
        SnsMethodCalculate.markEndTimeMs("scrollUp2", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
    }
}
