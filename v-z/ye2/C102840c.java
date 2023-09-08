package ye2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import ke2.C99129c;
import kj2.C117407d;
import me2.C10783a;
import pe2.C100785e;

/* renamed from: ye2.c */
public class C102840c extends C102838a {
    /* renamed from: c */
    public static boolean m135908c() {
        try {
            long b = C10783a.m10758b();
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            return cVar.f290660j.mo140223e(16777219, 0) < b;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public String mo129622a() {
        return "Priority.CalC2CChatPriorityTask";
    }

    /* renamed from: b */
    public final void mo142562b(C100785e eVar, String str, long j, float f, float f2, float f3) {
        C100785e eVar2 = eVar;
        String str2 = str;
        long b = C10783a.m10758b();
        long j2 = b - 2505600000L;
        String str3 = str2 + "temp";
        if (eVar2.mo140225g(str3)) {
            eVar2.mo140220b(str3);
        }
        String str4 = str2 + "count";
        String str5 = str2 + "totalcount";
        String str6 = str2 + "frequency";
        String str7 = str2 + "recent";
        eVar2.mo140222d(String.format("CREATE TABLE %s AS SELECT chat, cast(MMDecaySum(%d, date, %s, %d, %d) AS DOUBLE) AS %s, cast(MMFrequency(%s) AS DOUBLE) AS %s, cast(MMRecent(%d, %s, %s, 30) AS DOUBLE) AS %s FROM %s WHERE date >= ? GROUP BY chat;", new Object[]{str3, Long.valueOf(b), str4, 7, 2, str5, str4, str6, Long.valueOf(j), FFmpegMetadataRetriever.METADATA_KEY_DATE, str4, str7, "C2CChatUsage"}), new String[]{String.valueOf(j2)});
        if (eVar2.mo140224f(str3) != 0) {
            double[] dArr = new double[3];
            Cursor h = eVar2.mo140226h(String.format("SELECT avg(%s), avg(%s), avg(%s) FROM %s", new Object[]{str5, str6, str7, str3}), (String[]) null);
            if (h.moveToNext()) {
                dArr[0] = h.getDouble(0);
                dArr[1] = h.getDouble(1);
                dArr[2] = h.getDouble(2);
            }
            h.close();
            double[] dArr2 = new double[3];
            Cursor h2 = eVar2.mo140226h(String.format("SELECT MMStdev(%s, %f), MMStdev(%s, %f), MMStdev(%s, %f) FROM %s", new Object[]{str5, Double.valueOf(dArr[0]), str6, Double.valueOf(dArr[1]), str7, Double.valueOf(dArr[2]), str3}), (String[]) null);
            if (h2.moveToNext()) {
                dArr2[0] = h2.getDouble(0);
                dArr2[1] = h2.getDouble(1);
                dArr2[2] = h2.getDouble(2);
            }
            h2.close();
            Log.m105925i("MicroMsg.Priority.CalC2CChatPriorityTask", "calculateStdev %s %.2f %.2f %.2f %.2f %.2f %.2f", str2, Double.valueOf(dArr[0]), Double.valueOf(dArr[1]), Double.valueOf(dArr[2]), Double.valueOf(dArr2[0]), Double.valueOf(dArr2[1]), Double.valueOf(dArr2[2]));
            String str8 = str2 + "temp2";
            if (eVar2.mo140225g(str8)) {
                eVar2.mo140220b(str8);
            }
            String str9 = str2 + "totalcountdev";
            String str10 = str2 + "frequencydev";
            String str11 = str2 + "recentdev";
            eVar2.mo140221c(String.format("CREATE TABLE %s AS SELECT chat, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s FROM %s", new Object[]{str8, str5, Double.valueOf(dArr[0]), Double.valueOf(dArr2[0]), str9, str6, Double.valueOf(dArr[1]), Double.valueOf(dArr2[1]), str10, str7, Double.valueOf(dArr[2]), Double.valueOf(dArr2[2]), str11, str3}));
            if (eVar2.mo140224f(str8) != 0) {
                eVar2.mo140221c(String.format("UPDATE %s SET %s = (SELECT MMDWeightAverage(%s, %f, %s, %f, %s, %f) FROM %s B WHERE %s.chat = B.chat);", new Object[]{"C2CChatUsageResult", str2 + "rmf", str9, Float.valueOf(f), str10, Float.valueOf(f2), str11, Float.valueOf(f3), str8, "C2CChatUsageResult"}));
            }
        }
    }

    public void run() {
        Class cls = C99129c.class;
        if (!m135908c()) {
            Log.m105924i("MicroMsg.Priority.CalC2CChatPriorityTask", "no need to cal usage result");
            return;
        }
        C99129c cVar = (C99129c) C86312j.m106911c(cls);
        cVar.requireAccountInitialized();
        C100785e eVar = cVar.f290660j;
        if (eVar.mo140224f("C2CChatUsage") != 0) {
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1252, 1, 1, false);
            long b = C10783a.m10758b();
            long currentTimeMillis = System.currentTimeMillis();
            eVar.mo140222d(String.format("INSERT OR REPLACE INTO %s(chat) SELECT distinct(chat) AS chat FROM %s WHERE date >= ?;", new Object[]{"C2CChatUsageResult", "C2CChatUsage"}), new String[]{String.valueOf(b - 2505600000L)});
            C100785e eVar2 = eVar;
            long j = currentTimeMillis;
            mo142562b(eVar2, WeChatBrands.Business.GROUP_OPEN, j, 0.4f, 0.4f, 0.2f);
            mo142562b(eVar2, "sendmsg", j, 0.7f, 0.2f, 0.1f);
            mo142562b(eVar2, "consumemsg", j, 0.3f, 0.3f, 0.4f);
            long b2 = C10783a.m10758b();
            long j2 = b2 - 2505600000L;
            if (eVar.mo140225g("staytimetemp")) {
                eVar.mo140220b("staytimetemp");
            }
            eVar.mo140222d(String.format("CREATE TABLE %s AS SELECT chat, cast(MMDecaySum(%d, date, %s, %d, %d) AS DOUBLE) AS %s, cast(MMSumDivision(%s, %s, 0) AS DOUBLE) AS %s FROM %s WHERE date >= ? GROUP BY chat;", new Object[]{"staytimetemp", Long.valueOf(b2), "staytime", 7, 2, "staytimetotal", "opencount", "staytime", "staytimeperopen", "C2CChatUsage"}), new String[]{String.valueOf(j2)});
            double[] dArr = new double[2];
            Cursor h = eVar.mo140226h(String.format("SELECT avg(%s), avg(%s) FROM %s", new Object[]{"staytimetotal", "staytimeperopen", "staytimetemp"}), (String[]) null);
            if (h.moveToNext()) {
                dArr[0] = h.getDouble(0);
                dArr[1] = h.getDouble(1);
            }
            h.close();
            double[] dArr2 = new double[2];
            Cursor h2 = eVar.mo140226h(String.format("SELECT MMStdev(%s, %f), MMStdev(%s, %f) FROM %s", new Object[]{"staytimetotal", Double.valueOf(dArr[0]), "staytimeperopen", Double.valueOf(dArr[1]), "staytimetemp"}), (String[]) null);
            if (h2.moveToNext()) {
                dArr2[0] = h2.getDouble(0);
                dArr2[1] = h2.getDouble(1);
            }
            h2.close();
            Log.m105925i("MicroMsg.Priority.CalC2CChatPriorityTask", "calculateStayTime %.2f %.2f %.2f %.2f", Double.valueOf(dArr[0]), Double.valueOf(dArr[1]), Double.valueOf(dArr2[0]), Double.valueOf(dArr2[1]));
            if (eVar.mo140225g("staytimetemp2")) {
                eVar.mo140220b("staytimetemp2");
            }
            eVar.mo140221c(String.format("CREATE TABLE %s AS SELECT chat, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s, cast(MMNormalization(%s, %f, %f) AS DOUBLE) AS %s FROM %s", new Object[]{"staytimetemp2", "staytimetotal", Double.valueOf(dArr[0]), Double.valueOf(dArr2[0]), "staytimetotaldev", "staytimeperopen", Double.valueOf(dArr[1]), Double.valueOf(dArr2[1]), "staytimeperopendev", "staytimetemp"}));
            eVar.mo140221c(String.format("UPDATE %s SET staytimedev = (SELECT MMDWeightAverage(%s, %f, %s, %f) FROM %s E WHERE %s.chat = E.chat);", new Object[]{"C2CChatUsageResult", "staytimetotaldev", Double.valueOf(0.5d), "staytimeperopendev", Double.valueOf(0.5d), "staytimetemp2", "C2CChatUsageResult"}));
            double pow = (((2.2847d - (Math.pow(0.9d, 2.0d) * 4.729d)) + (Math.pow(0.9d, 3.0d) * 3.937d)) / 0.9d) * 0.09999999999999998d;
            Log.m105925i("MicroMsg.Priority.CalC2CChatPriorityTask", "d: %.2f r: %.4f", Double.valueOf(0.9d), Double.valueOf(pow));
            Double valueOf = Double.valueOf(0.3d);
            eVar.mo140221c(String.format("UPDATE %s SET totallsp = MMLSP(%f, %d, %s, %f, %s, %f, %s, %f, %s, %f)", new Object[]{"C2CChatUsageResult", Double.valueOf(pow), 4, "openrmf", Double.valueOf(0.1d), "sendmsgrmf", valueOf, "staytimedev", valueOf, "consumemsgrmf", valueOf}));
            if (eVar.mo140225g("lsptemp")) {
                eVar.mo140220b("lsptemp");
            }
            eVar.mo140221c(String.format("CREATE TABLE %s AS SELECT chat, cast(RANK() OVER (ORDER BY totallsp DESC) AS INTEGER) as rank FROM %s", new Object[]{"lsptemp", "C2CChatUsageResult"}));
            eVar.mo140221c(String.format("UPDATE %s SET rank=(SELECT E.rank FROM %s E WHERE %s.chat=E.chat);", new Object[]{"C2CChatUsageResult", "lsptemp", "C2CChatUsageResult"}));
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            cVar2.f290660j.mo140227i(16777219, b);
            dVar.idkeyStat(1252, 0, 1, false);
        }
    }
}
