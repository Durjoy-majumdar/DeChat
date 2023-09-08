package p156gj;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* renamed from: gj.s */
public class C107844s {

    /* renamed from: a */
    public RandomAccessFile f322923a;

    /* renamed from: b */
    public C107845a f322924b;

    /* renamed from: c */
    public ArrayList<C107845a> f322925c;

    /* renamed from: a */
    public final void mo158249a(int i, String str, String str2) {
        String[] split;
        String str3;
        long j;
        int i2;
        int i3 = i;
        String str4 = str;
        String str5 = str2;
        if (str4 == null || str.length() <= 0) {
            Log.m105921e(" MicroMsg.CpuUsage", "unable to get cpu line cpuId[%d]", Integer.valueOf(i));
            return;
        }
        String[] split2 = str4.split("[ ]+");
        if (split2[0].indexOf("cpu") == -1) {
            return;
        }
        if (i3 == -1) {
            if (this.f322924b == null) {
                this.f322924b = new C107845a(this, 0);
            }
            C107845a aVar = this.f322924b;
            if (aVar.f322929d <= 0) {
                aVar.mo158253a(split2);
            } else if (str5 == null || str2.length() <= 0 || (split = str5.split("[ ]+")) == null || split.length <= 0 || (str3 = split[0]) == null || Long.parseLong(str3, 10) != aVar.f322929d) {
                Log.m105921e(" MicroMsg.CpuUsage", "update but pid not match[%d, %s] update nothing", Long.valueOf(aVar.f322929d), str5);
            } else {
                long parseLong = Long.parseLong(split[13], 10);
                long parseLong2 = Long.parseLong(split[14], 10);
                long parseLong3 = Long.parseLong(split[15], 10);
                long parseLong4 = Long.parseLong(split[16], 10);
                String str6 = " MicroMsg.CpuUsage";
                long j2 = parseLong + parseLong2 + parseLong3 + parseLong4;
                long parseLong5 = Long.parseLong(split2[4], 10);
                int length = split2.length;
                int i4 = 0;
                long j3 = 0;
                boolean z = true;
                while (i4 < length) {
                    String str7 = split2[i4];
                    if (z) {
                        i2 = length;
                        j = parseLong2;
                        z = false;
                    } else {
                        i2 = length;
                        j = parseLong2;
                        j3 += Long.parseLong(str7, 10);
                    }
                    i4++;
                    length = i2;
                    parseLong2 = j;
                }
                long j4 = j3;
                long j5 = parseLong5 - aVar.f322928c;
                long j6 = j4 - aVar.f322927b;
                String str8 = str6;
                long j7 = j2 - aVar.f322930e;
                long j8 = j2;
                float f = (float) j6;
                aVar.f322926a = (int) ((((float) (j6 - j5)) / f) * 100.0f);
                aVar.f322931f = (int) ((((float) j7) / f) * 100.0f);
                aVar.f322927b = j4;
                aVar.f322928c = parseLong5;
                long j9 = j8;
                aVar.f322930e = j9;
                Log.m105925i(str8, "CpuUsageInfo(%d) CPU total=%d idle=%d usage=%d pid=%d pidTotal=%d mPidUsage=%d [%d, %d, %d, %d], [%d, %d, %d]", Integer.valueOf(aVar.hashCode()), Long.valueOf(j4), Long.valueOf(parseLong5), Integer.valueOf(aVar.f322926a), Long.valueOf(aVar.f322929d), Long.valueOf(j9), Integer.valueOf(aVar.f322931f), Long.valueOf(parseLong), Long.valueOf(parseLong2), Long.valueOf(parseLong3), Long.valueOf(parseLong4), Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j7));
            }
        } else {
            if (this.f322925c == null) {
                this.f322925c = new ArrayList<>();
            }
            if (i3 < this.f322925c.size()) {
                this.f322925c.get(i3).mo158253a(split2);
                return;
            }
            C107845a aVar2 = new C107845a(this);
            aVar2.mo158253a(split2);
            this.f322925c.add(aVar2);
        }
    }

    /* renamed from: b */
    public final void mo158250b() {
        String readLine;
        RandomAccessFile randomAccessFile = this.f322923a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0);
                int i = -1;
                do {
                    readLine = this.f322923a.readLine();
                    mo158249a(i, readLine, (String) null);
                    i++;
                } while (readLine != null);
            } catch (IOException e) {
                Log.m105920e(" MicroMsg.CpuUsage", "Ops statFile: " + e);
            }
        }
    }

    /* renamed from: c */
    public void mo158251c() {
        try {
            this.f322923a = new RandomAccessFile("/proc/stat", "r");
            mo158250b();
            RandomAccessFile randomAccessFile = this.f322923a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } catch (Exception e) {
            Log.printErrStackTrace(" MicroMsg.CpuUsage", e, "update e:", new Object[0]);
            RandomAccessFile randomAccessFile2 = this.f322923a;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception unused) {
                }
                this.f322923a = null;
            }
        }
    }

    public String toString() {
        mo158251c();
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f322924b != null) {
            stringBuffer.append("Cpu Total : ");
            stringBuffer.append(this.f322924b.f322926a);
            stringBuffer.append("%");
        }
        if (this.f322925c != null) {
            for (int i = 0; i < this.f322925c.size(); i++) {
                stringBuffer.append(" Cpu Core(" + i + ") : ");
                stringBuffer.append(this.f322925c.get(i).f322926a);
                stringBuffer.append("%");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: gj.s$a */
    public class C107845a {

        /* renamed from: a */
        public int f322926a;

        /* renamed from: b */
        public long f322927b;

        /* renamed from: c */
        public long f322928c;

        /* renamed from: d */
        public long f322929d;

        /* renamed from: e */
        public long f322930e;

        /* renamed from: f */
        public int f322931f;

        public C107845a(C107844s sVar) {
            this.f322926a = 0;
            this.f322927b = 0;
            this.f322928c = 0;
            this.f322929d = 0;
            this.f322930e = 0;
            this.f322931f = 0;
        }

        /* renamed from: a */
        public void mo158253a(String[] strArr) {
            long parseLong = Long.parseLong(strArr[4], 10);
            boolean z = true;
            long j = 0;
            for (String str : strArr) {
                if (z) {
                    z = false;
                } else {
                    j += Long.parseLong(str, 10);
                }
            }
            long j2 = j - this.f322927b;
            this.f322926a = (int) ((((float) (j2 - (parseLong - this.f322928c))) / ((float) j2)) * 100.0f);
            this.f322927b = j;
            this.f322928c = parseLong;
            Log.m105924i(" MicroMsg.CpuUsage", "CpuUsageInfo(" + hashCode() + ") CPU total=" + j + "; idle=" + parseLong + "; usage=" + this.f322926a);
        }

        public C107845a(C107844s sVar, long j) {
            this.f322929d = j;
        }
    }
}
