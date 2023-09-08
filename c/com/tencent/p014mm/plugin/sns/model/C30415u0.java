package com.tencent.p014mm.plugin.sns.model;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.C85609x0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.FrequentLimiter;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: com.tencent.mm.plugin.sns.model.u0 */
public class C30415u0 {

    /* renamed from: e */
    public static boolean f82031e;

    /* renamed from: f */
    public static char[] f82032f = new char[36];

    /* renamed from: a */
    public boolean f82033a = false;

    /* renamed from: b */
    public long f82034b = 0;

    /* renamed from: c */
    public int f82035c = 0;

    /* renamed from: d */
    public MMHandler f82036d = new C30416a(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.sns.model.u0$a */
    public class C30416a extends MMHandler {
        public C30416a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
            super.handleMessage(message);
            C30415u0 u0Var = C30415u0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            int i = u0Var.f82035c;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            if (i < 5) {
                long currentTimeMillis = System.currentTimeMillis();
                C30415u0 u0Var2 = C30415u0.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                long j = u0Var2.f82034b;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                if (currentTimeMillis - j <= 300000) {
                    C30415u0 u0Var3 = C30415u0.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                    boolean z = u0Var3.f82033a;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                    if (z) {
                        SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
                        return;
                    }
                    if (C30415u0.f82031e) {
                        new C30417b().mo119143f("");
                    }
                    SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("cleanCount: ");
            C30415u0 u0Var4 = C30415u0.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            int i2 = u0Var4.f82035c;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            sb.append(i2);
            Log.m105918d("MicroMsg.RemoveSnsTask", sb.toString());
            C30415u0.f82031e = false;
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.u0$b */
    public class C30417b extends C85609x0<String, String, Boolean> {

        /* renamed from: c */
        public SharedPreferences f82038c;

        /* renamed from: d */
        public String f82039d;

        /* renamed from: e */
        public String f82040e;

        /* renamed from: f */
        public PInt f82041f;

        /* renamed from: g */
        public PInt f82042g;

        /* renamed from: h */
        public String f82043h;

        /* renamed from: i */
        public String f82044i;

        public C30417b() {
            this.f82038c = null;
            this.f82039d = "";
            this.f82040e = "";
            this.f82041f = new PInt();
            this.f82042g = new PInt();
            this.f82038c = MMApplicationContext.getContext().getSharedPreferences("preferences_remove_task", 0);
            C86709a0.m107528h();
            if (C86709a0.m107523b().mo121114l()) {
                this.f82044i = C75592q0.m90789s();
                this.f82039d = "remove_key_base" + this.f82044i;
                this.f82040e = "remove_key" + this.f82044i;
                C86709a0.m107528h();
                if (C86709a0.m107523b().mo121114l() && !C94866e1.qy0() && C94866e1.Bx0() != null && C94866e1.Xx0() != null) {
                    String str = C94866e1.Xx0().mo139782Yt(this.f82044i).field_bgId;
                    this.f82043h = str;
                    Log.m105919d("MicroMsg.RemoveSnsTask", "my bgid %s", str);
                    boolean z = C30415u0.f82031e;
                    SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                    C30415u0.this.f82033a = true;
                    SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                }
            }
        }

        /* renamed from: a */
        public Object mo57374a(Object[] objArr) {
            Boolean bool;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            String[] strArr = (String[]) objArr;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            Log.m105918d("MicroMsg.RemoveSnsTask", "simpleCleans sns");
            if (!C30415u0.f82031e) {
                bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            } else {
                C30415u0 u0Var = C30415u0.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                boolean z = u0Var.f82033a;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                if (!z) {
                    bool = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                } else if (C94866e1.qy0()) {
                    C30415u0.f82031e = false;
                    bool = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                } else {
                    this.f82041f.value = this.f82038c.getInt(this.f82039d, 0);
                    this.f82042g.value = this.f82038c.getInt(this.f82040e, 0);
                    String YO = C94866e1.m120262YO();
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append(YO);
                        char[] cArr = C30415u0.f82032f;
                        sb.append(cArr[this.f82041f.value % 36]);
                        sb.append("/");
                        sb.append(cArr[this.f82042g.value % 36]);
                        if (!C30415u0.m39075a(sb.toString(), this.f82043h, this.f82044i)) {
                            bool = Boolean.FALSE;
                            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                        } else {
                            Log.m105918d("MicroMsg.RemoveSnsTask", "clean sns uses time : " + (System.currentTimeMillis() - currentTimeMillis) + " " + this.f82041f.value + " " + this.f82042g.value);
                            bool = Boolean.TRUE;
                            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            return bool;
        }

        /* renamed from: b */
        public ExecutorService mo57375b() {
            SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            ExecutorService Dx0 = C94866e1.Dx0();
            SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            return Dx0;
        }

        /* renamed from: c */
        public void mo57376c(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            Boolean bool = (Boolean) obj;
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            Log.m105918d("MicroMsg.RemoveSnsTask", "onPostExecute " + bool);
            C30415u0 u0Var = C30415u0.this;
            boolean z = C30415u0.f82031e;
            SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            u0Var.f82035c++;
            SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            if (bool.booleanValue()) {
                PInt pInt = this.f82041f;
                PInt pInt2 = this.f82042g;
                SnsMethodCalculate.markStartTimeMs("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                int i = pInt2.value + 1;
                if (i >= 36) {
                    pInt2.value = 0;
                    pInt.value = (pInt.value + 1) % 36;
                    SnsMethodCalculate.markEndTimeMs("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                } else {
                    pInt2.value = i % 36;
                    SnsMethodCalculate.markEndTimeMs("getNextFile", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                }
                SharedPreferences sharedPreferences = this.f82038c;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(this.f82039d, this.f82041f.value).apply();
                    this.f82038c.edit().putInt(this.f82040e, this.f82042g.value).apply();
                    StringBuilder sb = new StringBuilder();
                    sb.append("update dir ");
                    sb.append(this.f82041f.value);
                    sb.append(" ");
                    sb.append(this.f82042g.value);
                    sb.append(" cleanCount: ");
                    C30415u0 u0Var2 = C30415u0.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                    int i2 = u0Var2.f82035c;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                    sb.append(i2);
                    Log.m105918d("MicroMsg.RemoveSnsTask", sb.toString());
                }
                C30415u0 u0Var3 = C30415u0.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                MMHandler mMHandler = u0Var3.f82036d;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                mMHandler.sendEmptyMessageDelayed(0, 20000);
            }
            C30415u0 u0Var4 = C30415u0.this;
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            u0Var4.f82033a = false;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.RemoveSnsTask$simpleClean");
        }
    }

    static {
        int i = 0;
        int i2 = 48;
        while (i2 <= 57) {
            f82032f[i] = (char) i2;
            i2++;
            i++;
        }
        int i3 = 97;
        while (i3 <= 122) {
            f82032f[i] = (char) i3;
            i3++;
            i++;
        }
    }

    /* renamed from: a */
    public static boolean m39075a(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        SnsMethodCalculate.markStartTimeMs("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        boolean z = false;
        Iterator<C86001b0> it = C86013q1.m106459t(str, false).iterator();
        while (true) {
            if (!it.hasNext()) {
                SnsMethodCalculate.markEndTimeMs("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                z = true;
                break;
            }
            C86001b0 next = it.next();
            if (!f82031e) {
                Log.m105918d("MicroMsg.RemoveSnsTask", "broken here by ??");
                SnsMethodCalculate.markEndTimeMs("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                break;
            } else if (next.f250472b != null && !Util.isNullOrNil(str2) && str3 != null && (next.f250472b.contains(str2) || next.f250472b.contains(str3))) {
                Log.m105919d("MicroMsg.RemoveSnsTask", "do not delete my bg %s", str2);
            } else if (!next.f250476f && Util.milliSecondsToNow(next.f250475e) > FrequentLimiter.WEEK_MILLS) {
                next.mo119954a();
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        return z;
    }
}
