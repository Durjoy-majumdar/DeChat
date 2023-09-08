package aa1;

import ba1.C16777c;
import ca1.C113264b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import i91.C21062c;
import java.io.IOException;
import java.util.Iterator;
import op3.C117877b;
import te3.C101777fg2;
import te3.C110960dr1;
import te3.C110962fr1;
import te3.C110970q14;
import te3.C118427eg2;
import te3.C118429er1;
import te3.C22505ka3;

/* renamed from: aa1.g */
public final class C16454g {
    /* renamed from: a */
    public static void m15288a(String str, String str2) {
        String str3;
        String h;
        String str4 = str;
        String str5 = str2;
        Log.m105925i("HABBYGE-MALI.SyncBizCollector", "_collectBizData: %s, %s", str4, str5);
        String h2 = C116711b.m164583h((String) C21062c.m23249d().mo32775f().mo182596a(0));
        if (h2 != null) {
            Log.m105925i("HABBYGE-MALI.SyncBizCollector", "addBizData2Fuzzy, curActivityName: %s", h2);
            byte[] a = C116850b.m164831a("mmkv_fuzzy_pgs_io");
            C110960dr1 dr12 = null;
            if (a != null) {
                if (!(a.length == 0)) {
                    C110960dr1 dr13 = new C110960dr1();
                    try {
                        dr13.parseFrom(a);
                        dr12 = dr13;
                    } catch (Exception e) {
                        Exception exc = e;
                        Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchDao", exc, "FuzzyMatchDao, getFuzzyMatchInfo: %s", exc.getMessage());
                    }
                }
            }
            if (dr12 == null) {
                Log.m105920e("HABBYGE-MALI.SyncBizCollector", "addBizData2Fuzzy, matchInfo is NULL !!");
            } else if (dr12.f331954d.isEmpty()) {
                Log.m105920e("HABBYGE-MALI.SyncBizCollector", "addBizData2Fuzzy, matchInfo.sessionFuzzyPaths is NULL !!");
            } else {
                C22505ka3 e2 = C16777c.m16413e();
                if (e2 == null) {
                    Log.m105920e("HABBYGE-MALI.SyncBizCollector", "addBizData2Fuzzy, curSession is NULL !!");
                } else {
                    C101777fg2 fg22 = new C101777fg2();
                    fg22.f298259f = str4;
                    fg22.f298257d = str5;
                    for (int size = dr12.f331954d.size() - 1; size >= 0; size--) {
                        C110970q14 q142 = dr12.f331954d.get(size);
                        if (!(q142 == null || (str3 = q142.f332254d) == null || !str3.equals(e2.f64087d))) {
                            Iterator<C110962fr1> it = q142.f332255e.iterator();
                            while (it.hasNext()) {
                                C110962fr1 next = it.next();
                                if (!next.f331975g.isEmpty()) {
                                    int size2 = next.f331975g.size() - 1;
                                    while (true) {
                                        if (size2 < 0) {
                                            break;
                                        }
                                        C118429er1 er12 = next.f331975g.get(size2);
                                        if (er12 != null && (h = C116711b.m164583h(er12.f353985d)) != null && h.equals(h2)) {
                                            er12.f353988g.addLast(fg22);
                                            break;
                                        }
                                        size2--;
                                    }
                                }
                            }
                        }
                    }
                    try {
                        byte[] byteArray = dr12.toByteArray();
                        if (byteArray != null) {
                            C116850b.m164834d("mmkv_fuzzy_pgs_io", byteArray);
                        }
                    } catch (IOException e3) {
                        IOException iOException = e3;
                        Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchDao", iOException, "FuzzyMatchDao, setFuzzyMatchInfo: %s", iOException.getMessage());
                    }
                }
            }
        }
        C117877b<C118427eg2, Integer> a2 = C16453b.m15287a();
        if (a2 == null) {
            Log.m105920e("HABBYGE-MALI.SyncBizCollector", "collectBizData, tuple2 is NULL");
            return;
        }
        C118427eg2 eg22 = (C118427eg2) a2.mo182596a(0);
        int intValue = ((Integer) a2.mo182596a(1)).intValue();
        C101777fg2 fg23 = new C101777fg2();
        fg23.f298259f = str4;
        fg23.f298257d = str5;
        eg22.f353973h.add(fg23);
        eg22.f353975j.add(fg23);
        C113264b.m155063i(eg22, intValue);
    }
}
