package q30;

import android.database.Cursor;
import k30.C99096a;
import r30.C77484b;
import s30.C77614a;

/* renamed from: q30.a */
public class C100976a extends C99096a {

    /* renamed from: e */
    public static C100976a f295681e = new C100976a();

    /* renamed from: q30.a$a */
    public class C100977a implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ int f295682a;

        /* renamed from: b */
        public final /* synthetic */ String f295683b;

        /* renamed from: c */
        public final /* synthetic */ int f295684c;

        /* renamed from: d */
        public final /* synthetic */ long f295685d;

        /* renamed from: e */
        public final /* synthetic */ long f295686e;

        public C100977a(C100976a aVar, int i, String str, int i2, long j, long j2) {
            this.f295682a = i;
            this.f295683b = str;
            this.f295684c = i2;
            this.f295685d = j;
            this.f295686e = j2;
        }

        public Object getData() {
            int i = this.f295682a;
            int i2 = 0;
            if (i == 2) {
                C77614a aVar = C77484b.f225929a;
                String str = this.f295683b;
                int i3 = this.f295684c;
                long j = this.f295685d;
                long j2 = this.f295686e;
                aVar.getClass();
                Cursor rawQuery = aVar.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and talker = '" + str + "' and " + "type" + " = ? and " + "action" + " = 2)", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i3)});
                try {
                    if (rawQuery.moveToFirst()) {
                        i2 = rawQuery.getInt(0);
                    }
                    rawQuery.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            } else if (i != 1) {
                return 0;
            } else {
                C77614a aVar2 = C77484b.f225929a;
                String str2 = this.f295683b;
                int i4 = this.f295684c;
                long j3 = this.f295685d;
                long j4 = this.f295686e;
                aVar2.getClass();
                Cursor rawQuery2 = aVar2.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and talker = '" + str2 + "' and " + "type" + " = ? and " + "action" + " = 1)", new String[]{String.valueOf(j3), String.valueOf(j4), String.valueOf(i4)});
                try {
                    if (rawQuery2.moveToFirst()) {
                        i2 = rawQuery2.getInt(0);
                    }
                    rawQuery2.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th4) {
                    if (rawQuery2 != null) {
                        rawQuery2.close();
                    }
                    throw th4;
                }
            }
        }
    }

    /* renamed from: q30.a$b */
    public class C100978b implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ int f295687a;

        /* renamed from: b */
        public final /* synthetic */ String f295688b;

        /* renamed from: c */
        public final /* synthetic */ int f295689c;

        /* renamed from: d */
        public final /* synthetic */ long f295690d;

        /* renamed from: e */
        public final /* synthetic */ long f295691e;

        /* renamed from: f */
        public final /* synthetic */ int f295692f;

        public C100978b(C100976a aVar, int i, String str, int i2, long j, long j2, int i3) {
            this.f295687a = i;
            this.f295688b = str;
            this.f295689c = i2;
            this.f295690d = j;
            this.f295691e = j2;
            this.f295692f = i3;
        }

        public Object getData() {
            int i = this.f295687a;
            if (i == 2) {
                C77614a aVar = C77484b.f225929a;
                String str = this.f295688b;
                int i2 = this.f295689c;
                long j = this.f295690d;
                long j2 = this.f295691e;
                int i3 = this.f295692f;
                aVar.getClass();
                Cursor rawQuery = aVar.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and talker = '" + str + "' and " + "type" + " = ? and " + "action" + " = 2)", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i3), String.valueOf(i2)});
                try {
                    int i4 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                    return Integer.valueOf(i4);
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            } else if (i != 1) {
                return 0;
            } else {
                C77614a aVar2 = C77484b.f225929a;
                String str2 = this.f295688b;
                int i5 = this.f295689c;
                long j3 = this.f295690d;
                long j4 = this.f295691e;
                int i6 = this.f295692f;
                aVar2.getClass();
                Cursor rawQuery2 = aVar2.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and talker = '" + str2 + "' and " + "type" + " = ? and " + "action" + " = 1)", new String[]{String.valueOf(j3), String.valueOf(j4), String.valueOf(i6), String.valueOf(i5)});
                try {
                    int i7 = rawQuery2.moveToFirst() ? rawQuery2.getInt(0) : 0;
                    rawQuery2.close();
                    return Integer.valueOf(i7);
                } catch (Throwable th4) {
                    if (rawQuery2 != null) {
                        rawQuery2.close();
                    }
                    throw th4;
                }
            }
        }
    }

    /* renamed from: q30.a$c */
    public class C100979c implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ int f295693a;

        /* renamed from: b */
        public final /* synthetic */ String f295694b;

        /* renamed from: c */
        public final /* synthetic */ int f295695c;

        /* renamed from: d */
        public final /* synthetic */ long f295696d;

        /* renamed from: e */
        public final /* synthetic */ long f295697e;

        /* renamed from: f */
        public final /* synthetic */ int f295698f;

        public C100979c(C100976a aVar, int i, String str, int i2, long j, long j2, int i3) {
            this.f295693a = i;
            this.f295694b = str;
            this.f295695c = i2;
            this.f295696d = j;
            this.f295697e = j2;
            this.f295698f = i3;
        }

        public Object getData() {
            int i = this.f295693a;
            if (i == 2) {
                C77614a aVar = C77484b.f225929a;
                String str = this.f295694b;
                int i2 = this.f295695c;
                long j = this.f295696d;
                long j2 = this.f295697e;
                int i3 = this.f295698f;
                aVar.getClass();
                Cursor rawQuery = aVar.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and hourOfDay = ? and talker = '" + str + "' and " + "type" + " = ? and " + "action" + " = 2)", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i3), String.valueOf(i2)});
                try {
                    int i4 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                    return Integer.valueOf(i4);
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            } else if (i != 1) {
                return 0;
            } else {
                C77614a aVar2 = C77484b.f225929a;
                String str2 = this.f295694b;
                int i5 = this.f295695c;
                long j3 = this.f295696d;
                long j4 = this.f295697e;
                int i6 = this.f295698f;
                aVar2.getClass();
                Cursor rawQuery2 = aVar2.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and hourOfDay = ? and talker = '" + str2 + "' and " + "type" + " = ? and " + "action" + " = 1)", new String[]{String.valueOf(j3), String.valueOf(j4), String.valueOf(i6), String.valueOf(i5)});
                try {
                    int i7 = rawQuery2.moveToFirst() ? rawQuery2.getInt(0) : 0;
                    rawQuery2.close();
                    return Integer.valueOf(i7);
                } catch (Throwable th4) {
                    if (rawQuery2 != null) {
                        rawQuery2.close();
                    }
                    throw th4;
                }
            }
        }
    }

    /* renamed from: q30.a$d */
    public class C100980d implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ int f295699a;

        /* renamed from: b */
        public final /* synthetic */ String f295700b;

        /* renamed from: c */
        public final /* synthetic */ int f295701c;

        /* renamed from: d */
        public final /* synthetic */ long f295702d;

        /* renamed from: e */
        public final /* synthetic */ long f295703e;

        /* renamed from: f */
        public final /* synthetic */ int f295704f;

        /* renamed from: g */
        public final /* synthetic */ int f295705g;

        public C100980d(C100976a aVar, int i, String str, int i2, long j, long j2, int i3, int i4) {
            this.f295699a = i;
            this.f295700b = str;
            this.f295701c = i2;
            this.f295702d = j;
            this.f295703e = j2;
            this.f295704f = i3;
            this.f295705g = i4;
        }

        public Object getData() {
            int i = this.f295699a;
            if (i == 2) {
                C77614a aVar = C77484b.f225929a;
                String str = this.f295700b;
                int i2 = this.f295701c;
                long j = this.f295702d;
                long j2 = this.f295703e;
                int i3 = this.f295704f;
                int i4 = this.f295705g;
                aVar.getClass();
                Cursor rawQuery = aVar.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and hourOfDay = ? and talker = '" + str + "' and " + "type" + " = ? and " + "action" + " = 2)", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i3), String.valueOf(i4), String.valueOf(i2)});
                try {
                    int i5 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                    return Integer.valueOf(i5);
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            } else if (i != 1) {
                return 0;
            } else {
                C77614a aVar2 = C77484b.f225929a;
                String str2 = this.f295700b;
                int i6 = this.f295701c;
                long j3 = this.f295702d;
                long j4 = this.f295703e;
                int i7 = this.f295704f;
                int i8 = this.f295705g;
                aVar2.getClass();
                Cursor rawQuery2 = aVar2.f226277d.rawQuery("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and hourOfDay = ? and talker = '" + str2 + "' and " + "type" + " = ? and " + "action" + " = 1)", new String[]{String.valueOf(j3), String.valueOf(j4), String.valueOf(i7), String.valueOf(i8), String.valueOf(i6)});
                try {
                    int i9 = rawQuery2.moveToFirst() ? rawQuery2.getInt(0) : 0;
                    rawQuery2.close();
                    return Integer.valueOf(i9);
                } catch (Throwable th4) {
                    if (rawQuery2 != null) {
                        rawQuery2.close();
                    }
                    throw th4;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo140482b(String str, int i, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append("getCnt_");
        String str2 = str;
        sb.append(str);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return ((Integer) mo138469a(sb.toString(), new C100977a(this, i, str, i2, j, j2))).intValue();
    }

    /* renamed from: c */
    public int mo140483c(String str, int i, int i2, long j, long j2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("getDayOfWeekAndHourOfDayCnt_");
        String str2 = str;
        sb.append(str);
        sb.append("_");
        int i5 = i;
        sb.append(i5);
        sb.append("_");
        int i6 = i2;
        sb.append(i6);
        sb.append("_");
        int i7 = i3;
        sb.append(i7);
        return ((Integer) mo138469a(sb.toString(), new C100980d(this, i5, str, i6, j, j2, i7, i4))).intValue();
    }

    /* renamed from: d */
    public int mo140484d(String str, int i, int i2, long j, long j2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("getDayOfWeekCnt_");
        String str2 = str;
        sb.append(str);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        int i4 = i2;
        sb.append(i4);
        sb.append("_");
        int i5 = i3;
        sb.append(i5);
        return ((Integer) mo138469a(sb.toString(), new C100978b(this, i, str, i4, j, j2, i5))).intValue();
    }

    /* renamed from: e */
    public int mo140485e(String str, int i, int i2, long j, long j2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("getHourOfDayCnt_");
        String str2 = str;
        sb.append(str);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        int i4 = i2;
        sb.append(i4);
        return ((Integer) mo138469a(sb.toString(), new C100979c(this, i, str, i4, j, j2, i3))).intValue();
    }
}
