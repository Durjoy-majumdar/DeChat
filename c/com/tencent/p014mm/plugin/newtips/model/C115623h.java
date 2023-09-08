package com.tencent.p014mm.plugin.newtips.model;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.tg4;

/* renamed from: com.tencent.mm.plugin.newtips.model.h */
public class C115623h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115619a f346848d;

    /* renamed from: e */
    public final /* synthetic */ Pair f346849e;

    /* renamed from: f */
    public final /* synthetic */ boolean f346850f;

    public C115623h(C115619a aVar, Pair pair, boolean z) {
        this.f346848d = aVar;
        this.f346849e = pair;
        this.f346850f = z;
    }

    public void run() {
        Pair<Byte, Boolean> f = C115624i.m162570f(this.f346848d, this.f346849e, this.f346850f);
        Object[] objArr = new Object[6];
        objArr[0] = this.f346848d.getPath();
        Pair pair = this.f346849e;
        Object obj = pair.first;
        if (obj == null) {
            obj = "null";
        }
        objArr[1] = obj;
        objArr[2] = C115624i.m162577m((tg4) pair.second);
        objArr[3] = Boolean.valueOf(this.f346850f);
        objArr[4] = f.first;
        objArr[5] = f.second;
        Log.m105925i("MicroMsg.NewTips.NewTipsHelper", "showNewTipsMainThread() path:%s pair:(%s, %s) show:%s state:%s result:%s", objArr);
    }
}
