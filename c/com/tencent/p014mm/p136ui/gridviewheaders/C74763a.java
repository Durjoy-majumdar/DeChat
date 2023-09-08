package com.tencent.p014mm.p136ui.gridviewheaders;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.tencent.mm.ui.gridviewheaders.a */
public class C74763a {

    /* renamed from: c */
    public static C74763a f219845c;

    /* renamed from: a */
    public long f219846a;

    /* renamed from: b */
    public long f219847b;

    public C74763a() {
        Calendar instance = Calendar.getInstance();
        instance.set(7, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        this.f219846a = instance.getTimeInMillis();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(5, 1);
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance2.set(14, 0);
        this.f219847b = instance2.getTimeInMillis();
        Calendar.getInstance().getTimeInMillis();
    }

    /* renamed from: e */
    public static C74763a m89510e() {
        if (f219845c == null) {
            synchronized (C74763a.class) {
                f219845c = new C74763a();
            }
        }
        return f219845c;
    }

    /* renamed from: a */
    public long mo103933a(Date date) {
        if (date.getTime() >= this.f219846a) {
            return MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        if (date.getTime() >= this.f219847b) {
            return 9223372036854775806L;
        }
        return (long) ((date.getYear() * 100) + date.getMonth());
    }

    /* renamed from: b */
    public long mo103934b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(5, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    public String mo103935c(Date date, Context context) {
        if (date.getTime() >= this.f219846a) {
            return context.getString(C0966R.string.k2e);
        }
        if (date.getTime() >= this.f219847b) {
            return context.getString(C0966R.string.k2d);
        }
        return context.getString(C0966R.string.f8054bm, new Object[]{Integer.valueOf(date.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID), Integer.valueOf(date.getMonth() + 1)});
    }

    /* renamed from: d */
    public String mo103936d(Date date, Context context) {
        if (date.getTime() >= this.f219846a) {
            return context.getString(C0966R.string.k2e);
        }
        if (date.getTime() >= this.f219847b) {
            return context.getString(C0966R.string.k2d);
        }
        return (date.getYear() + WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID) + "/" + (date.getMonth() + 1);
    }
}
