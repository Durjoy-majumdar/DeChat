package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import te3.C77920eb0;
import te3.C77927fb0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.b */
public class C70873b {

    /* renamed from: a */
    public Context f205279a;

    /* renamed from: b */
    public C77927fb0 f205280b;

    /* renamed from: c */
    public C77927fb0 f205281c;

    /* renamed from: d */
    public boolean f205282d;

    public C70873b() {
        this.f205279a = null;
        this.f205280b = null;
        this.f205281c = null;
        this.f205282d = false;
    }

    /* renamed from: a */
    public final int mo97542a() {
        Iterator<C77920eb0> it = mo97543b().f227354f.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().f227247j == 0) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public C77927fb0 mo97543b() {
        C77927fb0 fb02 = this.f205281c;
        return fb02 != null ? fb02 : this.f205280b;
    }

    /* renamed from: c */
    public long mo97544c() {
        long j = 0;
        if (this.f205280b == null) {
            return 0;
        }
        Iterator<C77920eb0> it = mo97543b().f227354f.iterator();
        while (it.hasNext()) {
            C77920eb0 next = it.next();
            if (next.f227247j == 0 && next.f227249o) {
                j += next.f227244g;
            }
        }
        return j;
    }

    /* renamed from: d */
    public boolean mo97545d() {
        return mo97543b() != null && mo97543b().f227354f.size() > 0;
    }

    public C70873b(Context context, C77927fb0 fb02) {
        this.f205281c = null;
        this.f205282d = false;
        this.f205279a = context;
        this.f205280b = fb02;
        if (fb02 == null) {
            Log.m105924i("MicroMsg.ExtraBuyInfoHelper", "no extra buy info");
            return;
        }
        Log.m105925i("MicroMsg.ExtraBuyInfoHelper", "init. title = %s, detail count = %d", fb02.f227353e, Integer.valueOf(fb02.f227354f.size()));
        Iterator<C77920eb0> it = fb02.f227354f.iterator();
        while (it.hasNext()) {
            C77920eb0 next = it.next();
            Log.m105925i("MicroMsg.ExtraBuyInfoHelper", "extra buy item: %d, %s", Long.valueOf(next.f227241d), next.f227242e);
        }
    }
}
