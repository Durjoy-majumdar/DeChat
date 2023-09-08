package com.tencent.p014mm.plugin.notification.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.notification.base.j */
public class C115649j {

    /* renamed from: a */
    public ArrayList<Long> f346897a;

    /* renamed from: b */
    public int f346898b;

    public C115649j() {
        this.f346898b = 0;
        this.f346897a = new ArrayList<>();
        this.f346898b = 0;
    }

    /* renamed from: a */
    public void mo175863a(long j) {
        Log.m105919d("MicroMsg.FailMsglist", "addMsgId:%d, currentIndex:%d, size:%d", Long.valueOf(j), Integer.valueOf(this.f346898b), Integer.valueOf(this.f346897a.size()));
        this.f346897a.add(Long.valueOf(j));
    }

    /* renamed from: b */
    public boolean mo175864b(long j) {
        return this.f346897a.contains(Long.valueOf(j));
    }

    /* renamed from: c */
    public long mo175865c(int i) {
        return this.f346897a.get(i).longValue();
    }

    /* renamed from: d */
    public long mo175866d() {
        long longValue = (this.f346897a.size() <= 0 || this.f346898b >= this.f346897a.size()) ? -1 : this.f346897a.get(this.f346898b).longValue();
        Log.m105919d("MicroMsg.FailMsglist", "getNextSendMsgId:%d, currentIndex:%d, msgIdList.size:%d", Long.valueOf(longValue), Integer.valueOf(this.f346898b), Integer.valueOf(this.f346897a.size()));
        this.f346898b++;
        return longValue;
    }

    /* renamed from: e */
    public int mo175867e() {
        return this.f346897a.size();
    }
}
