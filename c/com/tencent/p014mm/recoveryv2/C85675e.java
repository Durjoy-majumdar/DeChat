package com.tencent.p014mm.recoveryv2;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85689j;
import com.tencent.p014mm.recoveryv2.C85692k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.recoveryv2.e */
public class C85675e {

    /* renamed from: i */
    public static boolean f249645i;

    /* renamed from: a */
    public int f249646a = Math.max(this.f249653h.getInt("setting_threshold_1", 3), 2);

    /* renamed from: b */
    public int f249647b;

    /* renamed from: c */
    public long f249648c;

    /* renamed from: d */
    public long f249649d;

    /* renamed from: e */
    public long f249650e;

    /* renamed from: f */
    public long f249651f;

    /* renamed from: g */
    public long f249652g;

    /* renamed from: h */
    public C85672d f249653h;

    /* renamed from: com.tencent.mm.recoveryv2.e$a */
    public static class C85676a {

        /* renamed from: e */
        public static final long f249654e = (TimeUnit.DAYS.toMillis(1) / 2);

        /* renamed from: a */
        public long f249655a;

        /* renamed from: b */
        public long f249656b;

        /* renamed from: c */
        public long f249657c;

        /* renamed from: d */
        public final C85672d f249658d;

        public C85676a(Context context) {
            C85672d.C85674b bVar = new C85672d.C85674b(context, "recovery_internal");
            bVar.mo119256e();
            this.f249658d = bVar;
            this.f249657c = bVar.getLong("internal_overheat_enable", 1);
            this.f249655a = bVar.getLong("internal_last_ui_launched", 0);
            this.f249656b = bVar.getLong("internal_ui_launch_interval", f249654e);
        }

        /* renamed from: a */
        public void mo119260a() {
            C85672d.C85674b bVar = (C85672d.C85674b) this.f249658d;
            bVar.mo119258g("internal_overheat_enable", this.f249657c);
            bVar.mo119258g("internal_last_ui_launched", this.f249655a);
            bVar.mo119258g("internal_ui_launch_interval", this.f249656b);
            bVar.mo119242c();
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.e$b */
    public static class C85677b {

        /* renamed from: a */
        public final Context f249659a;

        /* renamed from: b */
        public final C85672d f249660b;

        /* renamed from: c */
        public String f249661c;

        public C85677b(Context context) {
            this.f249659a = context;
            C85672d.C85673a aVar = new C85672d.C85673a(context, "recovery_log");
            aVar.mo119240a();
            this.f249660b = aVar;
            String absolutePath = new File(new File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), ".log").getAbsolutePath();
            String string = aVar.getString("setting_log_path", absolutePath);
            try {
                C85689j.C85691b.m105834b(new File(string));
                absolutePath = string;
            } catch (Throwable unused) {
                ((C85672d.C85673a) this.f249660b).mo119252e("setting_log_path");
            }
            this.f249661c = absolutePath;
        }

        /* renamed from: a */
        public void mo119261a() {
            LinkedList<C85692k.C85694b> linkedList;
            File file = new File(this.f249661c);
            List<C85692k.C85694b> list = C85692k.C85693a.f249688a;
            if (!file.exists()) {
                try {
                    C85689j.C85691b.m105834b(file);
                } catch (IOException e) {
                    C85692k.m105839a("MicroMsg.recovery.logFile", "create log file error", e);
                    return;
                }
            }
            synchronized (C85692k.C85693a.class) {
                List<C85692k.C85694b> list2 = C85692k.C85693a.f249688a;
                linkedList = new LinkedList<>(list2);
                ((LinkedList) list2).clear();
            }
            PrintWriter printWriter = null;
            try {
                PrintWriter printWriter2 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"));
                try {
                    for (C85692k.C85694b a : linkedList) {
                        printWriter2.println(a.mo119280a());
                    }
                    C85689j.C85691b.m105835c(printWriter2);
                } catch (IOException e2) {
                    e = e2;
                    printWriter = printWriter2;
                    try {
                        C85692k.m105839a("MicroMsg.recovery.logFile", "write to file error", e);
                        C85689j.C85691b.m105835c(printWriter);
                    } catch (Throwable th) {
                        th = th;
                        printWriter2 = printWriter;
                        C85689j.C85691b.m105835c(printWriter2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C85689j.C85691b.m105835c(printWriter2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                C85692k.m105839a("MicroMsg.recovery.logFile", "write to file error", e);
                C85689j.C85691b.m105835c(printWriter);
            }
        }

        /* renamed from: b */
        public String mo119262b() {
            BufferedReader bufferedReader;
            File file = new File(this.f249661c);
            BufferedReader bufferedReader2 = null;
            if (!file.exists()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            sb.append(10);
                        } else {
                            C85689j.C85691b.m105835c(bufferedReader);
                            return sb.toString();
                        }
                    } catch (IOException e) {
                        e = e;
                        try {
                            C85692k.m105839a("MicroMsg.recovery.logConfig", "read log content fail", e);
                            C85689j.C85691b.m105835c(bufferedReader);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            C85689j.C85691b.m105835c(bufferedReader2);
                            throw th;
                        }
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
                C85692k.m105839a("MicroMsg.recovery.logConfig", "read log content fail", e);
                C85689j.C85691b.m105835c(bufferedReader);
                return null;
            } catch (Throwable th4) {
                th = th4;
                C85689j.C85691b.m105835c(bufferedReader2);
                throw th;
            }
        }
    }

    public C85675e(Context context) {
        C85672d.C85674b bVar = new C85672d.C85674b(context, "recovery_setting");
        this.f249653h = bVar;
        bVar.mo119240a();
        f249645i = this.f249653h.getBoolean("setting_debug_mode", false);
        int max = Math.max(this.f249653h.getInt("setting_threshold_2", 5), 3);
        this.f249647b = max;
        int i = this.f249646a;
        if (max < i) {
            this.f249647b = i;
        }
        this.f249648c = Math.max(this.f249653h.getLong("setting_crash_interval", 10000), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        this.f249649d = Math.max(this.f249653h.getLong("setting_crash_interval_sub", 30000), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        this.f249650e = Math.max(this.f249653h.getLong("setting_crash_minimal_interval", 1000), 0);
        this.f249651f = Math.max(this.f249653h.getLong("setting_reset_delay", FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION), 1000);
        this.f249652g = Math.max(this.f249653h.getLong("setting_app_exit_info_interval", 1800000), 0);
    }

    /* renamed from: a */
    public void mo119259a() {
        C85672d.C85674b bVar = (C85672d.C85674b) this.f249653h;
        bVar.putBoolean("setting_debug_mode", f249645i);
        bVar.putInt("setting_threshold_1", this.f249646a);
        bVar.putInt("setting_threshold_2", this.f249647b);
        bVar.putLong("setting_crash_interval", this.f249648c);
        bVar.putLong("setting_crash_interval_sub", this.f249649d);
        bVar.putLong("setting_crash_minimal_interval", this.f249650e);
        bVar.putLong("setting_reset_delay", this.f249651f);
        bVar.putLong("setting_app_exit_info_interval", this.f249652g);
        bVar.mo119242c();
    }
}
