package p168i6;

import android.content.Context;
import com.tencent.rtmp.TXLiveConstants;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: i6.b */
public class C8850b {

    /* renamed from: a */
    public static volatile Integer f28100a;

    /* renamed from: a */
    public static int m8678a(Context context) {
        long e = C87663a.m109021e(context);
        int i = 2014;
        if (e == -1) {
            ArrayList arrayList = new ArrayList();
            int d = C87663a.m109020d();
            int i2 = d < 1 ? -1 : d == 1 ? 2008 : d <= 3 ? 2011 : 2012;
            if (i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            }
            long b = (long) C87663a.m109018b();
            int i3 = b == -1 ? -1 : b <= 528000 ? 2008 : b <= 620000 ? 2009 : b <= 1020000 ? 2010 : b <= 1220000 ? 2011 : b <= 1520000 ? 2012 : b <= 2020000 ? 2013 : 2014;
            if (i3 != -1) {
                arrayList.add(Integer.valueOf(i3));
            }
            long e2 = C87663a.m109021e(context);
            if (e2 <= 0) {
                i = -1;
            } else if (e2 <= 201326592) {
                i = 2008;
            } else if (e2 <= 304087040) {
                i = 2009;
            } else if (e2 <= 536870912) {
                i = 2010;
            } else if (e2 <= 1073741824) {
                i = 2011;
            } else if (e2 <= 1610612736) {
                i = 2012;
            } else if (e2 <= 2147483648L) {
                i = 2013;
            }
            if (i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
            if (arrayList.isEmpty()) {
                return -1;
            }
            Collections.sort(arrayList);
            if ((arrayList.size() & 1) == 1) {
                return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
            }
            int size = (arrayList.size() / 2) - 1;
            return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
        } else if (e <= 805306368) {
            return C87663a.m109020d() <= 1 ? 2009 : 2010;
        } else {
            if (e <= 1073741824) {
                return C87663a.m109018b() < 1300000 ? 2011 : 2012;
            }
            if (e <= 1610612736) {
                return C87663a.m109018b() < 1800000 ? 2012 : 2013;
            }
            if (e <= 2147483648L) {
                return 2013;
            }
            if (e <= 3221225472L) {
                return 2014;
            }
            if (e <= 5368709120L) {
                return TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC;
            }
            return 2016;
        }
    }

    /* renamed from: b */
    public static int m8679b(Context context) {
        if (f28100a == null) {
            synchronized (C8850b.class) {
                if (f28100a == null) {
                    f28100a = Integer.valueOf(m8678a(context));
                }
            }
        }
        return f28100a.intValue();
    }
}
