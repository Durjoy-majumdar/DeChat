package tf0;

import android.database.Cursor;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import cy3.C58003b;
import gy3.C87412m;
import rx3.C13598b0;
import ue1.C65326e;
import z04.C112551y;

/* renamed from: tf0.p0 */
public final class C52339p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderCommonFeatureService f146311d;

    public C52339p0(FinderCommonFeatureService finderCommonFeatureService) {
        this.f146311d = finderCommonFeatureService;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        Throwable th;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        Throwable th7;
        long currentTimeMillis = System.currentTimeMillis();
        FinderCommonFeatureService finderCommonFeatureService = this.f146311d;
        if (currentTimeMillis - finderCommonFeatureService.f157794V > 86400000) {
            finderCommonFeatureService.f157794V = System.currentTimeMillis();
            Cursor rawQuery = this.f146311d.mo76850gW().f188263d.rawQuery("select count(*) from FinderContact", (String[]) null);
            try {
                rawQuery.moveToFirst();
                long j = rawQuery.getLong(0);
                String name = Thread.currentThread().getName();
                C87412m.m108593f(name, "currentThread().name");
                new C65326e("FinderContactStorage.reportSize", C112551y.m153815o("select count(*) from FinderContact", ',', ';', false, 4, (Object) null), 0, name, j).mo89421a();
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(rawQuery, (Throwable) null);
                Cursor rawQuery2 = this.f146311d.Jx0().f188256d.rawQuery("select count(*) from FinderMsgAliasContactStorage", (String[]) null);
                try {
                    rawQuery2.moveToFirst();
                    long j2 = rawQuery2.getLong(0);
                    String name2 = Thread.currentThread().getName();
                    C87412m.m108593f(name2, "currentThread().name");
                    new C65326e("FinderMsgAliasContactStorage.reportSize", C112551y.m153815o("select count(*) from FinderMsgAliasContactStorage", ',', ';', false, 4, (Object) null), 0, name2, j2).mo89421a();
                    C58003b.m67160a(rawQuery2, (Throwable) null);
                    Cursor rawQuery3 = this.f146311d.mo76736Au().f146902d.rawQuery("select count(*) from FinderSessionInfo", (String[]) null);
                    try {
                        rawQuery3.moveToFirst();
                        long j3 = rawQuery3.getLong(0);
                        String name3 = Thread.currentThread().getName();
                        C87412m.m108593f(name3, "currentThread().name");
                        new C65326e("FinderSessionInfoStorage.reportSize", C112551y.m153815o("select count(*) from FinderSessionInfo", ',', ';', false, 4, (Object) null), 0, name3, j3).mo89421a();
                        C58003b.m67160a(rawQuery3, (Throwable) null);
                        Cursor rawQuery4 = this.f146311d.Kx0().f188259d.rawQuery("select count(*) from FinderMsgContactStorage", (String[]) null);
                        try {
                            rawQuery4.moveToFirst();
                            long j4 = rawQuery4.getLong(0);
                            String name4 = Thread.currentThread().getName();
                            C87412m.m108593f(name4, "currentThread().name");
                            new C65326e("FinderMsgStrangerContactStorage.reportSize", C112551y.m153815o("select count(*) from FinderMsgContactStorage", ',', ';', false, 4, (Object) null), 0, name4, j4).mo89421a();
                            C58003b.m67160a(rawQuery4, (Throwable) null);
                            Cursor rawQuery5 = this.f146311d.mo76776L4().f146897d.rawQuery("select count(*) from FinderConversation", (String[]) null);
                            try {
                                rawQuery5.moveToFirst();
                                long j5 = rawQuery5.getLong(0);
                                String name5 = Thread.currentThread().getName();
                                C87412m.m108593f(name5, "currentThread().name");
                                new C65326e("FinderConversationStorage.reportSize", C112551y.m153815o("select count(*) from FinderConversation", ',', ';', false, 4, (Object) null), 0, name5, j5).mo89421a();
                                C58003b.m67160a(rawQuery5, (Throwable) null);
                            } catch (Throwable th8) {
                                Throwable th9 = th8;
                                C58003b.m67160a(rawQuery5, th7);
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable th11 = th10;
                            C58003b.m67160a(rawQuery4, th6);
                            throw th11;
                        }
                    } catch (Throwable th12) {
                        Throwable th13 = th12;
                        C58003b.m67160a(rawQuery3, th5);
                        throw th13;
                    }
                } catch (Throwable th14) {
                    Throwable th15 = th14;
                    C58003b.m67160a(rawQuery2, th4);
                    throw th15;
                }
            } catch (Throwable th16) {
                Throwable th17 = th16;
                C58003b.m67160a(rawQuery, th);
                throw th17;
            }
        }
    }
}
