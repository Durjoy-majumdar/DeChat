package com.tencent.p014mm.plugin.announcement;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import f40.C86709a0;
import p749xh.C38564g1;

/* renamed from: com.tencent.mm.plugin.announcement.f */
public class C29091f implements IMvvmDBProvider {

    /* renamed from: e */
    public static final C29091f f79662e = new C29091f();

    /* renamed from: d */
    public volatile boolean f79663d = false;

    public ISQLiteDatabase getDB() {
        if (!this.f79663d) {
            synchronized (this) {
                if (!this.f79663d) {
                    C38564g1.createTable(C86709a0.m107535s().f251811i);
                }
                this.f79663d = true;
            }
        }
        return C86709a0.m107535s().f251811i;
    }
}
