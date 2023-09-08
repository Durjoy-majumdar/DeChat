package com.tencent.p014mm.plugin.webview.model;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.RWCache;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import p749xh.C38611m5;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.webview.model.q */
public class C30597q implements RWCache.IRWCacheAppender<Integer, Long> {

    /* renamed from: g */
    public static final String[] f82404g = {MAutoStorage.getCreateSQLs(C38611m5.initAutoDBInfo(C38611m5.class), "JsLogBlockList")};

    /* renamed from: d */
    public final C91753f f82405d;

    /* renamed from: e */
    public final RWCache<Integer, Long> f82406e = new RWCache(this, C86709a0.m107525e().getLooper(), 100, 20, 300000, 1000);

    /* renamed from: f */
    public long f82407f;

    public C30597q(C91753f fVar) {
        this.f82405d = fVar;
    }

    public void append(RWCache<Integer, Long> rWCache, RWCache.Holder<Integer, Long> holder) {
        int i = holder.funcType;
        if (i == 1) {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("logId", (Integer) holder.key);
            contentValues.put("liftTime", (Long) holder.values);
            this.f82405d.replace("JsLogBlockList", "logId", contentValues);
        } else if (i == 2) {
            C91753f fVar = this.f82405d;
            fVar.delete("JsLogBlockList", "logId=" + holder.key, (String[]) null);
        }
    }

    public void postAppend() {
        long j = this.f82407f;
        if (j > 0) {
            this.f82405d.endTransaction(j);
        }
    }

    public boolean preAppend() {
        if (this.f82405d.mo125622l()) {
            return false;
        }
        long beginTransaction = this.f82405d.beginTransaction(Thread.currentThread().getId());
        this.f82407f = beginTransaction;
        return beginTransaction > 0;
    }
}
