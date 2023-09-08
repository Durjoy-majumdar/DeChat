package com.tencent.p014mm.p136ui;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import p680ru.C77570i;

/* renamed from: com.tencent.mm.ui.u0 */
public class C74931u0 {

    /* renamed from: com.tencent.mm.ui.u0$a */
    public class C74932a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f220311d;

        /* renamed from: e */
        public final /* synthetic */ int f220312e;

        /* renamed from: f */
        public final /* synthetic */ int f220313f;

        public C74932a(Activity activity, int i, int i2) {
            this.f220311d = activity;
            this.f220312e = i;
            this.f220313f = i2;
        }

        public void run() {
            Activity activity = this.f220311d;
            int i = this.f220312e;
            int i2 = this.f220313f;
            Log.m105925i("MicroMsg.LauncherUI.HomeUtil", "clickFlowStat index:%d op:%d %s", Integer.valueOf(i2), Integer.valueOf(i), Util.getStack());
            if (i2 >= 0) {
                String str = i2 == 1 ? "AddressUI" : "MainUI";
                if (i2 == 2) {
                    str = "FindMoreFriendUI";
                }
                if (i2 == 3) {
                    str = "MoreTabUI";
                }
                ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(i, str, ((activity.hashCode() / 16) * 16) + i2);
            }
        }
    }

    /* renamed from: a */
    public static void m89763a(Activity activity, int i, int i2, String str) {
        ThreadPool.post(new C74932a(activity, i, i2), str);
    }
}
