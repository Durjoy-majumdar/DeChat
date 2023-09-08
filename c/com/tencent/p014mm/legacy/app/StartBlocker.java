package com.tencent.p014mm.legacy.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.StatFs;
import com.tencent.p014mm.p136ui.NoRomSpaceDexUI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.legacy.app.StartBlocker */
public class StartBlocker {

    /* renamed from: a */
    public static final /* synthetic */ int f237799a = 0;
    private static final List<C80942b> sBlockers;

    /* renamed from: com.tencent.mm.legacy.app.StartBlocker$a */
    public class C80941a implements C80942b {
        /* renamed from: a */
        public PendingIntent mo112727a(Context context) {
            if (new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() < 52428800) {
                return PendingIntent.getActivity(context, 0, new Intent(context, NoRomSpaceDexUI.class).setFlags(268435456), 0);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.legacy.app.StartBlocker$b */
    public interface C80942b {
        /* renamed from: a */
        PendingIntent mo112727a(Context context);
    }

    static {
        ArrayList arrayList = new ArrayList();
        sBlockers = arrayList;
        arrayList.add(new C80941a());
    }

    public static PendingIntent shouldBlock(Context context) {
        for (C80942b a : sBlockers) {
            try {
                PendingIntent a2 = a.mo112727a(context);
                if (a2 != null) {
                    return a2;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
