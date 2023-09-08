package com.tencent.p014mm.plugin.hardcoder;

import android.util.Pair;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.hardcoder.C17776i;
import com.tencent.p014mm.hardcoder.C17778l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.hardcoder.HardCoderReporterImpl */
public class HardCoderReporterImpl implements C17776i.C17777a, C17778l.C17779a {

    /* renamed from: d */
    public static String f81455d;

    /* renamed from: e */
    public static Long f81456e;

    /* renamed from: f */
    public static boolean f81457f;

    /* renamed from: g */
    public static HardCoderReporterImpl f81458g;

    /* renamed from: a */
    public ArrayList<Pair<Integer, Object[]>> f81459a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<Object[]> f81460b = new ArrayList<>();

    /* renamed from: c */
    public IListener f81461c = new IListener<CoreAccountInitializationNotifiedEvent>(C40008f.f107254d) {
        {
            this.__eventId = 19430116;
        }

        public boolean callback(IEvent iEvent) {
            if (((CoreAccountInitializationNotifiedEvent) iEvent) instanceof CoreAccountInitializationNotifiedEvent) {
                dead();
                if (!HardCoderReporterImpl.this.f81459a.isEmpty()) {
                    HardCoderReporterImpl.this.f81459a.clear();
                    Iterator it = ((ArrayList) HardCoderReporterImpl.this.f81459a.clone()).iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C115669n.INSTANCE.mo160131h(((Integer) pair.first).intValue(), (Object[]) pair.second);
                    }
                }
                if (!HardCoderReporterImpl.this.f81460b.isEmpty()) {
                    HardCoderReporterImpl.this.f81460b.clear();
                    Iterator it4 = ((ArrayList) HardCoderReporterImpl.this.f81460b.clone()).iterator();
                    while (it4.hasNext()) {
                        Object[] objArr = (Object[]) it4.next();
                        if (objArr.length >= 4) {
                            C115669n.INSTANCE.idkeyStat(((Long) objArr[0]).longValue(), ((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue(), ((Boolean) objArr[3]).booleanValue());
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: a */
    public final void mo57165a(int i, Object... objArr) {
        if (!MMApplicationContext.isMMProcess()) {
            C115669n.INSTANCE.mo160131h(i, objArr);
        } else if (C86709a0.m107523b().f251765p) {
            C115669n.INSTANCE.mo160131h(i, objArr);
        } else {
            Log.m105928w("MicroMsg.HardCoderReporterImpl", "kvStat accountNotInitialReady!");
            this.f81461c.alive();
            this.f81459a.add(new Pair(Integer.valueOf(i), objArr));
        }
    }
}
