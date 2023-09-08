package com.tencent.p014mm.plugin.record.p094ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.e */
public class C94352e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f272705d;

    /* renamed from: e */
    public final /* synthetic */ FavRecordDetailUI f272706e;

    public C94352e(FavRecordDetailUI favRecordDetailUI, List list) {
        this.f272706e = favRecordDetailUI;
        this.f272705d = list;
    }

    public void run() {
        if (this.f272705d != null) {
            Log.m105924i("MicroMsg.FavRecordDetailUI", "start calc");
            int i = 0;
            long j = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (C101834rc0 rc02 : this.f272705d) {
                if (rc02 != null && !this.f272706e.f272519w) {
                    int i5 = rc02.f299258I;
                    if (i5 == 1) {
                        i++;
                        String str = rc02.f299301f;
                        j += str != null ? (long) str.getBytes().length : 0;
                    } else if (i5 == 2) {
                        i2++;
                    } else if (i5 == 4 || i5 == 15) {
                        i3++;
                    } else {
                        i4++;
                    }
                }
            }
            String format = String.format("%s:%s:%s:%s:%s", new Object[]{Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            FavRecordDetailUI favRecordDetailUI = this.f272706e;
            int i6 = FavRecordDetailUI.f272514z;
            favRecordDetailUI.f270015g.f295020e = format;
            Log.m105927v("MicroMsg.FavRecordDetailUI", "start calc finish %s", format);
        }
    }
}
