package com.tencent.matrix.batterycanary.stats.p1183ui;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.C103412e;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.p014mm.C0966R;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import p981ie.C117186v;

/* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter */
public class BatteryStatsAdapter extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final List<Item> f343382d = new ArrayList();

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item */
    public interface Item {

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventBatteryItem */
        public static class EventBatteryItem extends BatteryRecord.EventStatRecord implements Item {

            /* renamed from: i */
            public final BatteryRecord.EventStatRecord f343383i;

            public EventBatteryItem(BatteryRecord.EventStatRecord eventStatRecord) {
                this.f343325e = eventStatRecord.f343325e;
                this.f343383i = eventStatRecord;
                this.f343328f = eventStatRecord.f343328f;
                this.f343329g = eventStatRecord.f343329g;
            }

            /* renamed from: a */
            public int mo173746a() {
                return 6;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem */
        public static class EventDumpItem extends BatteryRecord.ReportRecord implements Item {

            /* renamed from: p */
            public final BatteryRecord.ReportRecord f343384p;

            /* renamed from: q */
            public boolean f343385q = false;

            public EventDumpItem(BatteryRecord.ReportRecord reportRecord) {
                this.f343384p = reportRecord;
                this.f343325e = reportRecord.f343325e;
                this.f343328f = reportRecord.f343328f;
                this.f343329g = reportRecord.f343329g;
                this.f343330h = reportRecord.f343330h;
                this.f343333i = reportRecord.f343333i;
                this.f343334j = reportRecord.f343334j;
                this.f343335n = reportRecord.f343335n;
                this.f343336o = reportRecord.f343336o;
            }

            /* renamed from: a */
            public int mo173746a() {
                return 1;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item */
        public static class EventLevel1Item extends BatteryRecord implements Item {

            /* renamed from: f */
            public String f343386f;

            public EventLevel1Item(BatteryRecord batteryRecord) {
                this.f343325e = batteryRecord.f343325e;
            }

            /* renamed from: a */
            public int mo173746a() {
                return 2;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item */
        public static class EventLevel2Item extends BatteryRecord implements Item {

            /* renamed from: f */
            public String f343387f;

            public EventLevel2Item(BatteryRecord batteryRecord) {
                this.f343325e = batteryRecord.f343325e;
            }

            /* renamed from: a */
            public int mo173746a() {
                return 3;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem */
        public static class EventSimpleItem extends BatteryRecord.EventStatRecord implements Item {

            /* renamed from: i */
            public final BatteryRecord.EventStatRecord f343388i;

            public EventSimpleItem(BatteryRecord.EventStatRecord eventStatRecord) {
                this.f343325e = eventStatRecord.f343325e;
                this.f343388i = eventStatRecord;
                this.f343328f = eventStatRecord.f343328f;
                this.f343329g = eventStatRecord.f343329g;
            }

            /* renamed from: a */
            public int mo173746a() {
                return 5;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$a */
        public static class C114579a implements Item {

            /* renamed from: d */
            public String f343389d;

            /* renamed from: a */
            public int mo173746a() {
                return 0;
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$b */
        public static class C114580b implements Item {

            /* renamed from: d */
            public String f343390d;

            /* renamed from: a */
            public int mo173746a() {
                return 4;
            }
        }

        /* renamed from: a */
        int mo173746a();
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a */
    public static abstract class C114581a<ITEM extends Item> extends RecyclerView.C16631z {

        /* renamed from: A */
        public static final C117186v<DateFormat> f343391A = new C114582a();

        /* renamed from: z */
        public ITEM f343392z;

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$a */
        public class C114582a extends C117186v<DateFormat> {
            /* renamed from: a */
            public Object mo173739a() {
                return new SimpleDateFormat("HH:mm", Locale.getDefault());
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$b */
        public static class C114583b extends C114581a<Item.EventBatteryItem> {

            /* renamed from: B */
            public final TextView f343393B;

            /* renamed from: C */
            public final ImageView f343394C;

            /* renamed from: D */
            public final TextView f343395D;

            public C114583b(View view) {
                super(view);
                this.f343393B = (TextView) view.findViewById(C0966R.C0970id.kyj);
                this.f343394C = (ImageView) view.findViewById(C0966R.C0970id.meg);
                this.f343395D = (TextView) view.findViewById(C0966R.C0970id.kyn);
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.EventBatteryItem) item;
                this.f343392z = item2;
                this.f343393B.setText(C114581a.f343391A.mo181110b().format(new Date(item2.f343325e)));
                this.f343395D.setText(item2.f343329g);
                this.f343394C.setImageLevel(1);
                String str = "";
                if (item2.f343383i.f343330h.containsKey("battery-low")) {
                    boolean d = item2.f343383i.mo173719d("battery-low", false);
                    this.f343394C.setImageLevel(d ? 4 : 2);
                    long e = item2.f343383i.mo173720e("battery-pct", -1);
                    TextView textView = this.f343395D;
                    StringBuilder sb = new StringBuilder();
                    sb.append(d ? "电量低" : "电量恢复");
                    if (e > 0) {
                        str = " (" + e + "%)";
                    }
                    sb.append(str);
                    textView.setText(sb.toString());
                    return;
                }
                Object obj = "/";
                if (item2.f343383i.f343330h.containsKey("battery-temp")) {
                    long e2 = item2.f343383i.mo173720e("battery-temp", -1);
                    if (e2 != -1) {
                        this.f343394C.setImageLevel(3);
                    }
                    long e3 = item2.f343383i.mo173720e("battery-pct", -1);
                    TextView textView2 = this.f343395D;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("电池温度: ");
                    if (e2 > 0) {
                        obj = Float.valueOf(((float) e2) / 10.0f);
                    }
                    sb4.append(obj);
                    sb4.append("°C");
                    if (e3 > 0) {
                        str = " (" + e3 + "%)";
                    }
                    sb4.append(str);
                    textView2.setText(sb4.toString());
                } else if (item2.f343383i.f343330h.containsKey("battery-pct")) {
                    long e4 = item2.f343383i.mo173720e("battery-pct", -1);
                    TextView textView3 = this.f343395D;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("电量变化: ");
                    if (e4 > 0) {
                        obj = Long.valueOf(e4);
                    }
                    sb5.append(obj);
                    sb5.append("%");
                    textView3.setText(sb5.toString());
                }
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$c */
        public static class C114584c extends C114581a<Item.EventDumpItem> {

            /* renamed from: S */
            public static final /* synthetic */ int f343396S = 0;

            /* renamed from: B */
            public final TextView f343397B;

            /* renamed from: C */
            public final TextView f343398C;

            /* renamed from: D */
            public final TextView f343399D;

            /* renamed from: E */
            public final TextView f343400E;

            /* renamed from: F */
            public final TextView f343401F;

            /* renamed from: G */
            public final ImageView f343402G;

            /* renamed from: H */
            public final View f343403H;

            /* renamed from: I */
            public final View f343404I;

            /* renamed from: J */
            public final TextView f343405J;

            /* renamed from: K */
            public final TextView f343406K;

            /* renamed from: L */
            public final TextView f343407L;

            /* renamed from: M */
            public final View f343408M;

            /* renamed from: N */
            public final View f343409N;

            /* renamed from: P */
            public final View f343410P;

            /* renamed from: Q */
            public final View f343411Q;

            /* renamed from: R */
            public final View f343412R;

            /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$c$a */
            public class C114585a implements View.OnClickListener {
                public C114585a() {
                }

                public void onClick(View view) {
                    C114584c cVar = C114584c.this;
                    ITEM item = cVar.f343392z;
                    ((Item.EventDumpItem) item).f343385q = !((Item.EventDumpItem) item).f343385q;
                    int i = C114584c.f343396S;
                    cVar.mo173748z((Item.EventDumpItem) item);
                }
            }

            /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$c$b */
            public class C114586b implements View.OnClickListener {
                public C114586b() {
                }

                public void onClick(View view) {
                    long j = ((Item.EventDumpItem) C114584c.this.f343392z).f343384p.f343325e;
                    StringBuilder sb = new StringBuilder();
                    BatteryRecord.ReportRecord reportRecord = ((Item.EventDumpItem) C114584c.this.f343392z).f343384p;
                    long j2 = reportRecord.f343325e - reportRecord.f343334j;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS, Locale.getDefault());
                    sb.append("线程异常: ");
                    sb.append(((Item.EventDumpItem) C114584c.this.f343392z).f343384p.mo173719d("jiffy_overheat", false));
                    sb.append("\n统计时长: ");
                    long j3 = 60000;
                    sb.append(Math.max(((Item.EventDumpItem) C114584c.this.f343392z).f343384p.f343334j / 60000, 1));
                    sb.append("min");
                    sb.append("\n时间窗口: ");
                    sb.append(simpleDateFormat.format(new Date(j2)));
                    sb.append(" ~ ");
                    sb.append(simpleDateFormat.format(new Date(j)));
                    int i = 0;
                    while (i < ((Item.EventDumpItem) C114584c.this.f343392z).f343384p.f343335n.size()) {
                        BatteryRecord.ReportRecord.ThreadInfo threadInfo = ((Item.EventDumpItem) C114584c.this.f343392z).f343384p.f343335n.get(i);
                        if (threadInfo != null) {
                            String str = threadInfo.f343342f;
                            str.getClass();
                            char c = 65535;
                            switch (str.hashCode()) {
                                case 68:
                                    if (str.equals("D")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 82:
                                    if (str.equals("R")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 83:
                                    if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str = "Dead";
                                    break;
                                case 1:
                                    str = "Running";
                                    break;
                                case 2:
                                    str = "Sleep";
                                    break;
                            }
                            sb.append("\n\n线程 TOP ");
                            sb.append(i + 1);
                            sb.append(XVFSFile.PATH_SEPARATOR);
                            sb.append(threadInfo.f343341e);
                            sb.append("\ntid: ");
                            sb.append(threadInfo.f343340d);
                            sb.append("\n状态: ");
                            sb.append(str);
                            sb.append("\nJiffy 开销: ");
                            sb.append(threadInfo.f343343g);
                            sb.append(", ");
                            sb.append(threadInfo.f343343g / Math.max(((Item.EventDumpItem) C114584c.this.f343392z).f343334j / j3, 1));
                            sb.append("/min");
                            sb.append("\n运行时间: ");
                            sb.append(Math.max((threadInfo.f343343g * 10) / j3, 1));
                            sb.append("min");
                            sb.append(", 占整体统计时间 ");
                            sb.append(String.format(Locale.US, "%s", new Object[]{Long.valueOf(((threadInfo.f343343g * 10) * 100) / ((Item.EventDumpItem) C114584c.this.f343392z).f343334j)}));
                            sb.append("%");
                            sb.append("\nStackTrace: \n");
                            sb.append(threadInfo.f343344h.get("extra_stack_top"));
                        }
                        i++;
                        j3 = 60000;
                    }
                    View inflate = LayoutInflater.from(view.getContext()).inflate(C0966R.C0971layout.cq8, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0966R.C0970id.mi8)).setText(sb.toString());
                    C103412e.C103413a aVar = new C103412e.C103413a(view.getContext());
                    AlertController.C103396b bVar = aVar.f305071a;
                    bVar.f304979d = "线程详细信息";
                    bVar.f304981f = "确定";
                    bVar.f304982g = null;
                    bVar.f304983h = true;
                    bVar.f304987l = inflate;
                    aVar.mo143455a().show();
                }
            }

            public C114584c(View view) {
                super(view);
                this.f343397B = (TextView) view.findViewById(C0966R.C0970id.kyj);
                this.f343398C = (TextView) view.findViewById(C0966R.C0970id.kyn);
                this.f343399D = (TextView) view.findViewById(C0966R.C0970id.mia);
                this.f343400E = (TextView) view.findViewById(C0966R.C0970id.mib);
                this.f343401F = (TextView) view.findViewById(C0966R.C0970id.mi5);
                this.f343402G = (ImageView) view.findViewById(C0966R.C0970id.meg);
                this.f343403H = view.findViewById(C0966R.C0970id.mf4);
                View findViewById = view.findViewById(C0966R.C0970id.mf9);
                this.f343404I = findViewById;
                this.f343405J = (TextView) findViewById.findViewById(C0966R.C0970id.f359435mi0);
                this.f343406K = (TextView) findViewById.findViewById(C0966R.C0970id.f359436mi1);
                this.f343407L = (TextView) findViewById.findViewById(C0966R.C0970id.f359429kw2);
                View findViewById2 = view.findViewById(C0966R.C0970id.mf_);
                this.f343408M = findViewById2;
                this.f343409N = view.findViewById(C0966R.C0970id.mf5);
                this.f343410P = view.findViewById(C0966R.C0970id.mf6);
                this.f343411Q = view.findViewById(C0966R.C0970id.mf7);
                this.f343412R = view.findViewById(C0966R.C0970id.mf8);
                C114585a aVar = new C114585a();
                view.findViewById(C0966R.C0970id.mfh).setOnClickListener(aVar);
                view.findViewById(C0966R.C0970id.mfb).setOnClickListener(aVar);
                findViewById2.setOnClickListener(new C114586b());
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.EventDumpItem) item;
                this.f343392z = item2;
                View view = this.f343403H;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f343404I;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f343408M;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view6 = this.f343409N;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view8 = this.f343410P;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view10 = this.f343411Q;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view11 = view10;
                C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view12 = this.f343412R;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view13 = view12;
                C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo173748z(item2);
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* renamed from: z */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo173748z(com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter.Item.EventDumpItem r44) {
                /*
                    r43 = this;
                    r0 = r43
                    r1 = r44
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r2 = r1.f343384p
                    java.lang.String r2 = r2.f343333i
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    java.lang.String r3 = ""
                    if (r2 == 0) goto L_0x0012
                    r2 = r3
                    goto L_0x0016
                L_0x0012:
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r2 = r1.f343384p
                    java.lang.String r2 = r2.f343333i
                L_0x0016:
                    r2.getClass()
                    int r4 = r2.hashCode()
                    r5 = 2
                    r6 = -1
                    r8 = 0
                    switch(r4) {
                        case -1367725928: goto L_0x003b;
                        case 529694916: goto L_0x0030;
                        case 570410685: goto L_0x0025;
                        default: goto L_0x0023;
                    }
                L_0x0023:
                    r2 = -1
                    goto L_0x0045
                L_0x0025:
                    java.lang.String r4 = "internal"
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x002e
                    goto L_0x0023
                L_0x002e:
                    r2 = 2
                    goto L_0x0045
                L_0x0030:
                    java.lang.String r4 = "overheat"
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x0023
                L_0x0039:
                    r2 = 1
                    goto L_0x0045
                L_0x003b:
                    java.lang.String r4 = "canary"
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x0023
                L_0x0044:
                    r2 = 0
                L_0x0045:
                    switch(r2) {
                        case 0: goto L_0x006e;
                        case 1: goto L_0x0069;
                        case 2: goto L_0x0064;
                        default: goto L_0x0048;
                    }
                L_0x0048:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r3)
                    java.lang.String r3 = ": "
                    r2.append(r3)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r3 = r1.f343384p
                    java.lang.String r3 = r3.f343333i
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "缺乏描述"
                    goto L_0x0083
                L_0x0064:
                    java.lang.String r2 = "Matrix 内部监控"
                    java.lang.String r3 = "Matrix 自身电量开销的监控, 避免电量监控框架自身导致的耗电问题"
                    goto L_0x0083
                L_0x0069:
                    java.lang.String r2 = "Runnable 任务监控"
                    java.lang.String r3 = "ThreadPool 等需要执行大量零碎 Runnable 的专项电量统计。"
                    goto L_0x0083
                L_0x006e:
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r2 = r1.f343384p
                    java.lang.String r3 = "app_fg"
                    boolean r2 = r2.mo173719d(r3, r8)
                    if (r2 == 0) goto L_0x007e
                    java.lang.String r2 = "前台 Polling 监控"
                    java.lang.String r3 = "App 在前台时, 周期性地执行电量统计 (具体周期见时长)"
                    goto L_0x0083
                L_0x007e:
                    java.lang.String r2 = "待机功耗监控"
                    java.lang.String r3 = "App 进入后台并持续一段时间后 (待机), 再次切换到前台时执行一次电量统计。"
                L_0x0083:
                    android.widget.TextView r4 = r0.f343397B
                    ie.v<java.text.DateFormat> r9 = com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter.C114581a.f343391A
                    java.lang.Object r10 = r9.mo181110b()
                    java.text.DateFormat r10 = (java.text.DateFormat) r10
                    java.util.Date r11 = new java.util.Date
                    long r12 = r1.f343325e
                    r11.<init>(r12)
                    java.lang.String r10 = r10.format(r11)
                    r4.setText(r10)
                    android.widget.TextView r4 = r0.f343401F
                    boolean r10 = r1.f343385q
                    if (r10 == 0) goto L_0x00a4
                    r10 = 1127481344(0x43340000, float:180.0)
                    goto L_0x00a5
                L_0x00a4:
                    r10 = 0
                L_0x00a5:
                    r4.setRotation(r10)
                    android.view.View r4 = r0.f343403H
                    boolean r10 = r1.f343385q
                    r19 = 8
                    if (r10 == 0) goto L_0x00b2
                    r10 = 0
                    goto L_0x00b4
                L_0x00b2:
                    r10 = 8
                L_0x00b4:
                    k20.a r15 = new k20.a
                    r15.<init>()
                    java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    r15.mo10233c(r10)
                    java.lang.Object[] r12 = r15.mo10232b()
                    java.lang.String r13 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r14 = "updateView"
                    java.lang.String r10 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r16 = "android/view/View_EXEC_"
                    java.lang.String r17 = "setVisibility"
                    java.lang.String r18 = "(I)V"
                    r11 = r4
                    r7 = r15
                    r15 = r10
                    j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                    java.lang.Object r7 = r7.mo10231a(r8)
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    int r7 = r7.intValue()
                    r4.setVisibility(r7)
                    java.lang.String r12 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r13 = "updateView"
                    java.lang.String r14 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r15 = "android/view/View_EXEC_"
                    java.lang.String r16 = "setVisibility"
                    java.lang.String r17 = "(I)V"
                    j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                    android.widget.TextView r4 = r0.f343398C
                    r4.setText(r2)
                    android.widget.TextView r2 = r0.f343399D
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.Object r7 = r9.mo181110b()
                    java.text.DateFormat r7 = (java.text.DateFormat) r7
                    java.util.Date r10 = new java.util.Date
                    long r11 = r1.f343325e
                    long r13 = r1.f343334j
                    long r11 = r11 - r13
                    r10.<init>(r11)
                    java.lang.String r7 = r7.format(r10)
                    r4.append(r7)
                    java.lang.String r7 = " ~ "
                    r4.append(r7)
                    java.lang.Object r7 = r9.mo181110b()
                    java.text.DateFormat r7 = (java.text.DateFormat) r7
                    java.util.Date r9 = new java.util.Date
                    long r10 = r1.f343325e
                    r9.<init>(r10)
                    java.lang.String r7 = r7.format(r9)
                    r4.append(r7)
                    java.lang.String r4 = r4.toString()
                    r2.setText(r4)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r2 = r1.f343384p
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f343330h
                    java.util.Set r4 = r4.keySet()
                    java.util.Iterator r4 = r4.iterator()
                L_0x0143:
                    boolean r7 = r4.hasNext()
                    if (r7 == 0) goto L_0x015f
                    java.lang.Object r7 = r4.next()
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String r9 = "_overheat"
                    boolean r9 = r7.endsWith(r9)
                    if (r9 == 0) goto L_0x0143
                    boolean r7 = r2.mo173719d(r7, r8)
                    if (r7 == 0) goto L_0x0143
                    r2 = 1
                    goto L_0x0160
                L_0x015f:
                    r2 = 0
                L_0x0160:
                    r4 = 4
                    if (r2 == 0) goto L_0x0170
                    android.widget.ImageView r2 = r0.f343402G
                    r2.setImageLevel(r4)
                    android.widget.TextView r2 = r0.f343400E
                    java.lang.String r7 = "#OVERHEAT"
                    r2.setText(r7)
                    goto L_0x017d
                L_0x0170:
                    android.widget.ImageView r2 = r0.f343402G
                    r2.setImageLevel(r5)
                    android.widget.TextView r2 = r0.f343400E
                    java.lang.String r7 = "正常"
                    r2.setText(r7)
                L_0x017d:
                    boolean r2 = r1.f343385q
                    if (r2 != 0) goto L_0x0182
                    return
                L_0x0182:
                    android.widget.TextView r2 = r0.f343405J
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r9 = "模式: "
                    r7.append(r9)
                    java.lang.String r9 = r1.f343333i
                    r7.append(r9)
                    java.lang.String r7 = r7.toString()
                    r2.setText(r7)
                    android.widget.TextView r2 = r0.f343406K
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r9 = "时长: "
                    r7.append(r9)
                    long r9 = r1.f343334j
                    r11 = 60000(0xea60, double:2.9644E-319)
                    long r9 = r9 / r11
                    r13 = 1
                    long r9 = java.lang.Math.max(r13, r9)
                    r7.append(r9)
                    java.lang.String r9 = "min"
                    r7.append(r9)
                    java.lang.String r7 = r7.toString()
                    r2.setText(r7)
                    android.widget.TextView r2 = r0.f343407L
                    r7 = 0
                    boolean r9 = android.text.TextUtils.isEmpty(r7)
                    if (r9 == 0) goto L_0x01cd
                    goto L_0x01ce
                L_0x01cd:
                    r3 = r7
                L_0x01ce:
                    r2.setText(r3)
                    android.view.View r2 = r0.f343408M
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo> r3 = r1.f343335n
                    boolean r3 = r3.isEmpty()
                    if (r3 != 0) goto L_0x01dd
                    r3 = 0
                    goto L_0x01df
                L_0x01dd:
                    r3 = 8
                L_0x01df:
                    k20.a r9 = new k20.a
                    r9.<init>()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r9.mo10233c(r3)
                    java.lang.Object[] r22 = r9.mo10232b()
                    java.lang.String r23 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r24 = "updateView"
                    java.lang.String r25 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r26 = "android/view/View_EXEC_"
                    java.lang.String r27 = "setVisibility"
                    java.lang.String r28 = "(I)V"
                    r21 = r2
                    j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
                    java.lang.Object r3 = r9.mo10231a(r8)
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r2.setVisibility(r3)
                    java.lang.String r22 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r23 = "updateView"
                    java.lang.String r24 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r25 = "android/view/View_EXEC_"
                    java.lang.String r26 = "setVisibility"
                    java.lang.String r27 = "(I)V"
                    j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo> r2 = r1.f343335n
                    boolean r2 = r2.isEmpty()
                    r3 = 2131315868(0x7f094c9c, float:1.8250201E38)
                    r9 = 2131315761(0x7f094c31, float:1.8249984E38)
                    r10 = 1084227584(0x40a00000, float:5.0)
                    r15 = -2
                    r7 = 2131497803(0x7f0c134b, float:1.861921E38)
                    r5 = 2131307111(0x7f092a67, float:1.823244E38)
                    r4 = 2131315747(0x7f094c23, float:1.8249956E38)
                    if (r2 != 0) goto L_0x03a7
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r2 = r1.f343384p
                    java.lang.String r13 = "jiffy_overheat"
                    boolean r2 = r2.mo173719d(r13, r8)
                    android.view.View r13 = r0.f343408M
                    android.view.View r13 = r13.findViewById(r4)
                    android.widget.TextView r13 = (android.widget.TextView) r13
                    android.content.res.Resources r14 = r13.getResources()
                    if (r2 == 0) goto L_0x0250
                    r2 = 2131099904(0x7f060100, float:1.7812174E38)
                    goto L_0x0253
                L_0x0250:
                    r2 = 2131099806(0x7f06009e, float:1.7811976E38)
                L_0x0253:
                    int r2 = r14.getColor(r2)
                    r13.setTextColor(r2)
                    android.view.View r2 = r0.f343408M
                    android.view.View r2 = r2.findViewById(r5)
                    android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
                    int r13 = r2.getChildCount()
                    r14 = 0
                L_0x0267:
                    if (r14 >= r13) goto L_0x02b6
                    android.view.View r5 = r2.getChildAt(r14)
                    k20.a r4 = new k20.a
                    r4.<init>()
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r19)
                    r4.mo10233c(r11)
                    java.lang.Object[] r24 = r4.mo10232b()
                    java.lang.String r25 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r26 = "updateView"
                    java.lang.String r27 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r28 = "android/view/View_EXEC_"
                    java.lang.String r29 = "setVisibility"
                    java.lang.String r30 = "(I)V"
                    r23 = r5
                    j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
                    java.lang.Object r4 = r4.mo10231a(r8)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r5.setVisibility(r4)
                    java.lang.String r24 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r25 = "updateView"
                    java.lang.String r26 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r27 = "android/view/View_EXEC_"
                    java.lang.String r28 = "setVisibility"
                    java.lang.String r29 = "(I)V"
                    j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
                    int r14 = r14 + 1
                    r4 = 2131315747(0x7f094c23, float:1.8249956E38)
                    r5 = 2131307111(0x7f092a67, float:1.823244E38)
                    r11 = 60000(0xea60, double:2.9644E-319)
                    goto L_0x0267
                L_0x02b6:
                    r4 = 0
                L_0x02b7:
                    r5 = 5
                    if (r4 >= r5) goto L_0x03a7
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo> r5 = r1.f343335n
                    int r5 = r5.size()
                    if (r4 >= r5) goto L_0x0394
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo> r5 = r1.f343335n
                    java.lang.Object r5 = r5.get(r4)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo r5 = (com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.ThreadInfo) r5
                    if (r4 >= r13) goto L_0x02d1
                    android.view.View r11 = r2.getChildAt(r4)
                    goto L_0x02f9
                L_0x02d1:
                    android.content.Context r11 = r2.getContext()
                    android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
                    android.view.View r11 = r11.inflate(r7, r2, r8)
                    android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
                    r12.<init>(r6, r15)
                    android.content.Context r14 = r2.getContext()
                    android.content.res.Resources r14 = r14.getResources()
                    android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
                    r6 = 1
                    float r14 = android.util.TypedValue.applyDimension(r6, r10, r14)
                    int r6 = (int) r14
                    r12.topMargin = r6
                    r2.addView(r11, r12)
                L_0x02f9:
                    k20.a r6 = new k20.a
                    r6.<init>()
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
                    r6.mo10233c(r12)
                    java.lang.Object[] r36 = r6.mo10232b()
                    java.lang.String r37 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r38 = "updateView"
                    java.lang.String r39 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r40 = "android/view/View_EXEC_"
                    java.lang.String r41 = "setVisibility"
                    java.lang.String r42 = "(I)V"
                    r35 = r11
                    j20.C117292a.m165358d(r35, r36, r37, r38, r39, r40, r41, r42)
                    java.lang.Object r6 = r6.mo10231a(r8)
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    int r6 = r6.intValue()
                    r11.setVisibility(r6)
                    java.lang.String r25 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r26 = "updateView"
                    java.lang.String r27 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r28 = "android/view/View_EXEC_"
                    java.lang.String r29 = "setVisibility"
                    java.lang.String r30 = "(I)V"
                    r24 = r11
                    j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
                    android.view.View r6 = r11.findViewById(r9)
                    android.widget.TextView r6 = (android.widget.TextView) r6
                    android.view.View r11 = r11.findViewById(r3)
                    android.widget.TextView r11 = (android.widget.TextView) r11
                    if (r5 == 0) goto L_0x0348
                    r12 = 0
                    goto L_0x034a
                L_0x0348:
                    r12 = 8
                L_0x034a:
                    r6.setVisibility(r12)
                    if (r5 == 0) goto L_0x0351
                    r12 = 0
                    goto L_0x0353
                L_0x0351:
                    r12 = 8
                L_0x0353:
                    r11.setVisibility(r12)
                    if (r5 == 0) goto L_0x0394
                    java.lang.String r12 = r5.f343341e
                    r6.setText(r12)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    int r12 = r5.f343340d
                    r6.append(r12)
                    java.lang.String r12 = " / "
                    r6.append(r12)
                    long r9 = r5.f343343g
                    r24 = 10
                    long r9 = r9 * r24
                    r24 = 60000(0xea60, double:2.9644E-319)
                    long r9 = r9 / r24
                    r26 = r13
                    r12 = 1
                    long r9 = java.lang.Math.max(r12, r9)
                    r6.append(r9)
                    java.lang.String r9 = "min / "
                    r6.append(r9)
                    java.lang.String r5 = r5.f343342f
                    r6.append(r5)
                    java.lang.String r5 = r6.toString()
                    r11.setText(r5)
                    goto L_0x039b
                L_0x0394:
                    r26 = r13
                    r12 = 1
                    r24 = 60000(0xea60, double:2.9644E-319)
                L_0x039b:
                    int r4 = r4 + 1
                    r13 = r26
                    r6 = -1
                    r9 = 2131315761(0x7f094c31, float:1.8249984E38)
                    r10 = 1084227584(0x40a00000, float:5.0)
                    goto L_0x02b7
                L_0x03a7:
                    r2 = 4
                    r6 = 1
                L_0x03a9:
                    if (r6 > r2) goto L_0x0560
                    r4 = 1
                    if (r6 == r4) goto L_0x03d6
                    r4 = 2
                    if (r6 == r4) goto L_0x03d3
                    r5 = 3
                    if (r6 == r5) goto L_0x03d0
                    if (r6 != r2) goto L_0x03b9
                    android.view.View r5 = r0.f343412R
                    goto L_0x03d9
                L_0x03b9:
                    java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "entryList section out of bound: "
                    r2.append(r3)
                    r2.append(r6)
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
                L_0x03d0:
                    android.view.View r5 = r0.f343411Q
                    goto L_0x03d9
                L_0x03d3:
                    android.view.View r5 = r0.f343410P
                    goto L_0x03d9
                L_0x03d6:
                    r4 = 2
                    android.view.View r5 = r0.f343409N
                L_0x03d9:
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo> r9 = r1.f343336o
                    int r9 = r9.size()
                    if (r6 > r9) goto L_0x03ec
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo> r9 = r1.f343336o
                    int r10 = r6 + -1
                    java.lang.Object r9 = r9.get(r10)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo r9 = (com.tencent.matrix.batterycanary.stats.BatteryRecord.ReportRecord.EntryInfo) r9
                    goto L_0x03ed
                L_0x03ec:
                    r9 = 0
                L_0x03ed:
                    if (r9 == 0) goto L_0x03f1
                    r10 = 0
                    goto L_0x03f3
                L_0x03f1:
                    r10 = 8
                L_0x03f3:
                    k20.a r11 = new k20.a
                    r11.<init>()
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    r11.mo10233c(r10)
                    java.lang.Object[] r34 = r11.mo10232b()
                    java.lang.String r35 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r36 = "updateView"
                    java.lang.String r37 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r38 = "android/view/View_EXEC_"
                    java.lang.String r39 = "setVisibility"
                    java.lang.String r40 = "(I)V"
                    r33 = r5
                    j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
                    java.lang.Object r10 = r11.mo10231a(r8)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    int r10 = r10.intValue()
                    r5.setVisibility(r10)
                    java.lang.String r34 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r35 = "updateView"
                    java.lang.String r36 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r37 = "android/view/View_EXEC_"
                    java.lang.String r38 = "setVisibility"
                    java.lang.String r39 = "(I)V"
                    j20.C117292a.m165359e(r33, r34, r35, r36, r37, r38, r39)
                    if (r9 == 0) goto L_0x0555
                    r10 = 2131315747(0x7f094c23, float:1.8249956E38)
                    android.view.View r11 = r5.findViewById(r10)
                    android.widget.TextView r11 = (android.widget.TextView) r11
                    java.lang.String r12 = r9.f343337d
                    r11.setText(r12)
                    r11 = 2131307111(0x7f092a67, float:1.823244E38)
                    android.view.View r5 = r5.findViewById(r11)
                    android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
                    int r12 = r5.getChildCount()
                    r13 = 0
                L_0x044e:
                    if (r13 >= r12) goto L_0x0499
                    android.view.View r2 = r5.getChildAt(r13)
                    k20.a r4 = new k20.a
                    r4.<init>()
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
                    r4.mo10233c(r10)
                    java.lang.Object[] r29 = r4.mo10232b()
                    java.lang.String r30 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r31 = "updateView"
                    java.lang.String r32 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r33 = "android/view/View_EXEC_"
                    java.lang.String r34 = "setVisibility"
                    java.lang.String r35 = "(I)V"
                    r28 = r2
                    j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
                    java.lang.Object r4 = r4.mo10231a(r8)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    r2.setVisibility(r4)
                    java.lang.String r29 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r30 = "updateView"
                    java.lang.String r31 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r32 = "android/view/View_EXEC_"
                    java.lang.String r33 = "setVisibility"
                    java.lang.String r34 = "(I)V"
                    j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
                    int r13 = r13 + 1
                    r2 = 4
                    r4 = 2
                    r10 = 2131315747(0x7f094c23, float:1.8249956E38)
                    goto L_0x044e
                L_0x0499:
                    r2 = 6
                    java.util.Map<java.lang.String, java.lang.String> r4 = r9.f343339f
                    java.util.Set r4 = r4.entrySet()
                    java.util.Iterator r4 = r4.iterator()
                    r9 = 0
                L_0x04a5:
                    boolean r10 = r4.hasNext()
                    if (r10 == 0) goto L_0x0555
                    java.lang.Object r10 = r4.next()
                    java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                    r13 = 1
                    int r9 = r9 + r13
                    if (r9 <= r2) goto L_0x04b7
                    goto L_0x0555
                L_0x04b7:
                    if (r9 >= r12) goto L_0x04c1
                    android.view.View r13 = r5.getChildAt(r9)
                    r11 = 1
                    r14 = 1084227584(0x40a00000, float:5.0)
                    goto L_0x04ec
                L_0x04c1:
                    android.content.Context r13 = r5.getContext()
                    android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
                    android.view.View r13 = r13.inflate(r7, r5, r8)
                    android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
                    r7 = -1
                    r2.<init>(r7, r15)
                    android.content.Context r23 = r5.getContext()
                    android.content.res.Resources r23 = r23.getResources()
                    android.util.DisplayMetrics r7 = r23.getDisplayMetrics()
                    r11 = 1
                    r14 = 1084227584(0x40a00000, float:5.0)
                    float r7 = android.util.TypedValue.applyDimension(r11, r14, r7)
                    int r7 = (int) r7
                    r2.topMargin = r7
                    r5.addView(r13, r2)
                L_0x04ec:
                    k20.a r2 = new k20.a
                    r2.<init>()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                    r2.mo10233c(r7)
                    java.lang.Object[] r33 = r2.mo10232b()
                    java.lang.String r34 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r35 = "updateView"
                    java.lang.String r36 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r37 = "android/view/View_EXEC_"
                    java.lang.String r38 = "setVisibility"
                    java.lang.String r39 = "(I)V"
                    r32 = r13
                    j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
                    java.lang.Object r2 = r2.mo10231a(r8)
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    r13.setVisibility(r2)
                    java.lang.String r33 = "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder"
                    java.lang.String r34 = "updateView"
                    java.lang.String r35 = "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V"
                    java.lang.String r36 = "android/view/View_EXEC_"
                    java.lang.String r37 = "setVisibility"
                    java.lang.String r38 = "(I)V"
                    j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
                    r2 = 2131315761(0x7f094c31, float:1.8249984E38)
                    android.view.View r7 = r13.findViewById(r2)
                    android.widget.TextView r7 = (android.widget.TextView) r7
                    android.view.View r13 = r13.findViewById(r3)
                    android.widget.TextView r13 = (android.widget.TextView) r13
                    java.lang.Object r20 = r10.getKey()
                    r2 = r20
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    r7.setText(r2)
                    java.lang.Object r2 = r10.getValue()
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    r13.setText(r2)
                    r2 = 6
                    r7 = 2131497803(0x7f0c134b, float:1.861921E38)
                    r11 = 2131307111(0x7f092a67, float:1.823244E38)
                    goto L_0x04a5
                L_0x0555:
                    r11 = 1
                    r14 = 1084227584(0x40a00000, float:5.0)
                    int r6 = r6 + 1
                    r2 = 4
                    r7 = 2131497803(0x7f0c134b, float:1.861921E38)
                    goto L_0x03a9
                L_0x0560:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter.C114581a.C114584c.mo173748z(com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventDumpItem):void");
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$d */
        public static class C114587d extends C114581a<Item.EventLevel1Item> {

            /* renamed from: B */
            public final TextView f343415B;

            /* renamed from: C */
            public final TextView f343416C;

            public C114587d(View view) {
                super(view);
                this.f343415B = (TextView) view.findViewById(C0966R.C0970id.kyj);
                this.f343416C = (TextView) view.findViewById(C0966R.C0970id.kyn);
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.EventLevel1Item) item;
                this.f343392z = item2;
                this.f343415B.setText(C114581a.f343391A.mo181110b().format(new Date(item2.f343325e)));
                this.f343416C.setText(item2.f343386f);
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$e */
        public static class C114588e extends C114581a<Item.EventLevel2Item> {

            /* renamed from: B */
            public final TextView f343417B;

            /* renamed from: C */
            public final TextView f343418C;

            public C114588e(View view) {
                super(view);
                this.f343417B = (TextView) view.findViewById(C0966R.C0970id.kyj);
                this.f343418C = (TextView) view.findViewById(C0966R.C0970id.kyn);
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.EventLevel2Item) item;
                this.f343392z = item2;
                this.f343417B.setText(C114581a.f343391A.mo181110b().format(new Date(item2.f343325e)));
                this.f343418C.setText(item2.f343387f);
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$f */
        public static class C114589f extends C114581a<Item.EventSimpleItem> implements View.OnClickListener {

            /* renamed from: B */
            public final TextView f343419B;

            /* renamed from: C */
            public final TextView f343420C;

            public C114589f(View view) {
                super(view);
                this.f343419B = (TextView) view.findViewById(C0966R.C0970id.kyj);
                this.f343420C = (TextView) view.findViewById(C0966R.C0970id.kyn);
                view.findViewById(C0966R.C0970id.mfh).setOnClickListener(this);
            }

            public void onClick(View view) {
                View inflate = LayoutInflater.from(view.getContext()).inflate(C0966R.C0971layout.cq8, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.mi8);
                StringBuilder sb = new StringBuilder();
                sb.append("EVENT_ID: ");
                sb.append(((Item.EventSimpleItem) this.f343392z).f343388i.f343328f);
                sb.append("\n\n");
                for (String next : ((Item.EventSimpleItem) this.f343392z).f343388i.f343330h.keySet()) {
                    sb.append(next);
                    sb.append(" = ");
                    sb.append(((Item.EventSimpleItem) this.f343392z).f343388i.f343330h.get(next));
                    sb.append("\n\n");
                }
                textView.setText(sb.toString());
                C103412e.C103413a aVar = new C103412e.C103413a(view.getContext());
                String str = ((Item.EventSimpleItem) this.f343392z).f343329g;
                AlertController.C103396b bVar = aVar.f305071a;
                bVar.f304979d = str;
                bVar.f304981f = "确定";
                bVar.f304982g = null;
                bVar.f304983h = true;
                bVar.f304987l = inflate;
                aVar.mo143455a().show();
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.EventSimpleItem) item;
                this.f343392z = item2;
                this.f343419B.setText(C114581a.f343391A.mo181110b().format(new Date(item2.f343325e)));
                this.f343420C.setText(item2.f343329g);
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$g */
        public static class C114590g extends C114581a<Item.C114579a> {

            /* renamed from: B */
            public final TextView f343421B;

            public C114590g(View view) {
                super(view);
                this.f343421B = (TextView) view.findViewById(C0966R.C0970id.kyn);
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.C114579a) item;
                this.f343392z = item2;
                this.f343421B.setText(item2.f343389d);
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$a$h */
        public static class C114591h extends C114581a<Item.C114580b> {

            /* renamed from: B */
            public final TextView f343422B;

            public C114591h(View view) {
                super(view);
                this.f343422B = (TextView) view.findViewById(C0966R.C0970id.kyn);
            }

            /* renamed from: y */
            public void mo173747y(Item item) {
                ITEM item2 = (Item.C114580b) item;
                this.f343392z = item2;
                if (!TextUtils.isEmpty(item2.f343390d)) {
                    this.f343422B.setText(item2.f343390d);
                }
            }
        }

        public C114581a(View view) {
            super(view);
        }

        /* renamed from: y */
        public void mo173747y(ITEM item) {
        }
    }

    public int getItemCount() {
        return ((ArrayList) this.f343382d).size();
    }

    public int getItemViewType(int i) {
        return ((Item) ((ArrayList) this.f343382d).get(i)).mo173746a();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        ((C114581a) zVar).mo173747y((Item) ((ArrayList) this.f343382d).get(i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new C114581a.C114590g(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cqh, viewGroup, false));
            case 1:
                return new C114581a.C114584c(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cqb, viewGroup, false));
            case 2:
                return new C114581a.C114587d(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cq9, viewGroup, false));
            case 3:
                return new C114581a.C114588e(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cq_, viewGroup, false));
            case 4:
                return new C114581a.C114591h(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cqi, viewGroup, false));
            case 5:
                return new C114581a.C114589f(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cqg, viewGroup, false));
            case 6:
                return new C114581a.C114583b(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cqa, viewGroup, false));
            default:
                throw new IllegalStateException("Unknown view type: " + i);
        }
    }
}
