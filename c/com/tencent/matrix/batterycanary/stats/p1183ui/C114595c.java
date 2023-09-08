package com.tencent.matrix.batterycanary.stats.p1183ui;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.stats.BatteryRecord;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter;
import java.util.ArrayList;
import java.util.List;
import p723vf.C118672d;
import p933be.C79691a;

/* renamed from: com.tencent.matrix.batterycanary.stats.ui.c */
public class C114595c {

    /* renamed from: a */
    public final BatteryStatsAdapter f343428a;

    /* renamed from: b */
    public final int f343429b;

    /* renamed from: c */
    public final Handler f343430c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public int f343431d = 0;

    /* renamed from: e */
    public String f343432e = "";

    /* renamed from: f */
    public C114596a f343433f;

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.c$a */
    public interface C114596a {
        /* renamed from: a */
        List<BatteryRecord> mo173757a(List<BatteryRecord> list);
    }

    public C114595c(BatteryStatsAdapter batteryStatsAdapter) {
        this.f343428a = batteryStatsAdapter;
        this.f343429b = 7;
    }

    /* renamed from: a */
    public BatteryStatsAdapter.Item.C114579a mo173754a(int i) {
        List<BatteryStatsAdapter.Item> list = this.f343428a.f343382d;
        for (int i2 = i; i2 >= 0; i2--) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size() && (arrayList.get(i2) instanceof BatteryStatsAdapter.Item.C114579a)) {
                return (BatteryStatsAdapter.Item.C114579a) arrayList.get(i2);
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo173755b() {
        if (TextUtils.isEmpty(this.f343432e)) {
            C118672d.m167356f("Matrix.battery.loader", "Call #reset first!", new Object[0]);
        } else {
            C79691a.m96805b(C114572i.class, new C114594b(this, this.f343431d));
        }
    }

    /* renamed from: c */
    public BatteryStatsAdapter.Item mo173756c(BatteryRecord batteryRecord) {
        String str;
        if (batteryRecord instanceof BatteryRecord.ProcStatRecord) {
            BatteryStatsAdapter.Item.EventLevel1Item eventLevel1Item = new BatteryStatsAdapter.Item.EventLevel1Item(batteryRecord);
            BatteryRecord.ProcStatRecord procStatRecord = (BatteryRecord.ProcStatRecord) batteryRecord;
            int i = procStatRecord.f343331f;
            if (i == 1) {
                str = "PROCESS_INIT";
            } else if (i != 2) {
                str = "PROCESS_ID_" + procStatRecord.f343331f;
            } else {
                str = "PROCESS_QUIT";
            }
            eventLevel1Item.f343386f = str + " (pid " + procStatRecord.f343332g + "）";
            return eventLevel1Item;
        } else if (batteryRecord instanceof BatteryRecord.AppStatRecord) {
            BatteryStatsAdapter.Item.EventLevel1Item eventLevel1Item2 = new BatteryStatsAdapter.Item.EventLevel1Item(batteryRecord);
            BatteryRecord.AppStatRecord appStatRecord = (BatteryRecord.AppStatRecord) batteryRecord;
            int i2 = appStatRecord.f343326f;
            if (i2 == 1) {
                eventLevel1Item2.f343386f = "App 切换到前台";
            } else if (i2 == 2) {
                eventLevel1Item2.f343386f = "App 切换到后台";
            } else if (i2 == 3) {
                eventLevel1Item2.f343386f = "App 切换到后台 (有前台服务)";
            } else if (i2 != 4) {
                eventLevel1Item2.f343386f = "App 状态变化: " + appStatRecord.f343326f;
            } else {
                eventLevel1Item2.f343386f = "App 切换到后台 (有浮窗)";
            }
            return eventLevel1Item2;
        } else if (batteryRecord instanceof BatteryRecord.DevStatRecord) {
            BatteryStatsAdapter.Item.EventLevel2Item eventLevel2Item = new BatteryStatsAdapter.Item.EventLevel2Item(batteryRecord);
            BatteryRecord.DevStatRecord devStatRecord = (BatteryRecord.DevStatRecord) batteryRecord;
            switch (devStatRecord.f343327f) {
                case 1:
                    eventLevel2Item.f343387f = "CHARGE_ON";
                    break;
                case 2:
                    eventLevel2Item.f343387f = "CHARGE_OFF";
                    break;
                case 3:
                    eventLevel2Item.f343387f = "SCREEN_OFF";
                    break;
                case 4:
                    eventLevel2Item.f343387f = "待机模式(Standby) ON";
                    break;
                case 5:
                    eventLevel2Item.f343387f = "SCREEN_ON";
                    break;
                case 6:
                    eventLevel2Item.f343387f = "待机模式(Standby) OFF";
                    break;
                case 7:
                    eventLevel2Item.f343387f = "低电耗模式(Doze) ON";
                    break;
                case 8:
                    eventLevel2Item.f343387f = "低电耗模式(Doze) OFF";
                    break;
                default:
                    eventLevel2Item.f343387f = "设备状态变化: " + devStatRecord.f343327f;
                    break;
            }
            return eventLevel2Item;
        } else if (batteryRecord instanceof BatteryRecord.SceneStatRecord) {
            BatteryStatsAdapter.Item.EventLevel2Item eventLevel2Item2 = new BatteryStatsAdapter.Item.EventLevel2Item(batteryRecord);
            eventLevel2Item2.f343387f = "UI: " + ((BatteryRecord.SceneStatRecord) batteryRecord).f343345f;
            return eventLevel2Item2;
        } else if (batteryRecord instanceof BatteryRecord.ReportRecord) {
            return new BatteryStatsAdapter.Item.EventDumpItem((BatteryRecord.ReportRecord) batteryRecord);
        } else {
            if (batteryRecord instanceof BatteryRecord.EventStatRecord) {
                BatteryRecord.EventStatRecord eventStatRecord = (BatteryRecord.EventStatRecord) batteryRecord;
                return "BATTERY_STAT".equals(eventStatRecord.f343329g) ? new BatteryStatsAdapter.Item.EventBatteryItem(eventStatRecord) : new BatteryStatsAdapter.Item.EventSimpleItem(eventStatRecord);
            }
            BatteryStatsAdapter.Item.EventLevel2Item eventLevel2Item3 = new BatteryStatsAdapter.Item.EventLevel2Item(batteryRecord);
            eventLevel2Item3.f343387f = "Unknown: " + batteryRecord.getClass().getName();
            return eventLevel2Item3;
        }
    }
}
