package com.tencent.p014mm.feature.performance;

import be2.C79693c;
import com.tencent.p014mm.plugin.performance.watchdogs.C85337k;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import g40.C87134f;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import p757xv.C91355x;
import zt3.C119157j;

/* renamed from: com.tencent.mm.feature.performance.r */
public class C80865r implements C87134f {

    /* renamed from: com.tencent.mm.feature.performance.r$a */
    public class C80866a implements Runnable {
        public C80866a(C80865r rVar) {
        }

        public void run() {
            int i;
            BufferedReader bufferedReader;
            Throwable th;
            C91355x g = MemoryWatchDog.f248575A.mo118581g();
            MultiProcessMMKV multiProcessMMKV = C79693c.f233599a;
            HashSet hashSet = new HashSet();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/maps")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.endsWith(".so") && readLine.contains("com.tencent.mm")) {
                        String[] split = readLine.split("/");
                        hashSet.add(split[split.length - 1]);
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.performance.Utils", e, "", new Object[0]);
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
            Object[] array = hashSet.toArray();
            StringBuilder sb = new StringBuilder();
            C91355x[] xVarArr = g.f261990C;
            if (xVarArr != null && xVarArr.length > 0) {
                sb.append("allProcess:");
                for (C91355x xVar : g.f261990C) {
                    sb.append(xVar.f261999a);
                    sb.append("-");
                    sb.append(xVar.f262000b);
                    sb.append("-pss:");
                    sb.append(xVar.f262023y);
                    sb.append(";");
                }
            }
            if (array != null) {
                int length = array.length;
                if (length > 0) {
                    sb.append("loaded so:");
                    for (Object append : array) {
                        sb.append(append);
                        sb.append(";");
                    }
                }
                i = length;
            } else {
                i = -1;
            }
            C85337k.m105359h(32, g.f262014p - g.f262015q, g.f262012n, (long) g.f262003e, (long) g.f262023y, (long) g.f261988A, sb.toString(), i, -2, -2, -1, g.f262022x.totalMem, "", "", "", "", (long) g.f262024z, g.f262005g);
            return;
            throw th;
        }
    }

    public C80865r(C80864q qVar) {
    }

    /* renamed from: e */
    public void mo1180e() {
        ((C119157j) C119157j.f356862d).mo183878i(new C80866a(this), 10000);
        C86709a0.m107528h().mo121101p(this);
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
    }
}
