package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import pb1.C100734q;
import te3.C101834rc0;
import te3.C101871zc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.s1 */
public class C93697s1 {
    /* renamed from: a */
    public static String m118410a(Context context, int i) {
        return "[" + context.getResources().getString(i) + "]";
    }

    /* renamed from: b */
    public static String m118411b(Context context, C101834rc0 rc02) {
        int i = rc02.f299258I;
        if (i != 3) {
            if (i == 10) {
                return m118410a(context, C0966R.string.cp8) + " " + rc02.f299296c1.f299408g.f298511d;
            } else if (i == 16) {
                return m118410a(context, C0966R.string.f360424com);
            } else {
                if (i != 20) {
                    if (i != 22) {
                        if (i != 29) {
                            if (i == 5) {
                                return m118410a(context, C0966R.string.crs) + " " + rc02.f299297d;
                            } else if (i == 6) {
                                C101871zc0 zc02 = rc02.f299296c1.f299406e;
                                if (zc02 == null) {
                                    return m118410a(context, C0966R.string.crm);
                                }
                                if (m118412c(zc02.f299958o)) {
                                    return m118410a(context, C0966R.string.crm) + " " + zc02.f299958o;
                                }
                                return m118410a(context, C0966R.string.crm) + " " + zc02.f299956j;
                            } else if (i != 7) {
                                if (i == 8) {
                                    return m118410a(context, C0966R.string.crg) + " " + rc02.f299297d;
                                }
                            }
                        }
                        return m118410a(context, C0966R.string.crn) + " " + rc02.f299297d;
                    } else if (!C100734q.m131837a0()) {
                        return m118410a(context, C0966R.string.crs) + " " + rc02.f299297d;
                    }
                    return "";
                }
            }
        }
        return m118410a(context, C0966R.string.cru) + " " + m118413d(context, (int) C100734q.m131827R((long) rc02.f299338y));
    }

    /* renamed from: c */
    public static boolean m118412c(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return !str.equals(MMApplicationContext.getContext().getResources().getString(C0966R.string.gbp));
    }

    /* renamed from: d */
    public static String m118413d(Context context, int i) {
        if (i <= 0) {
            return context.getString(C0966R.string.cs_, new Object[]{0});
        }
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 == 0) {
            return context.getString(C0966R.string.cs_, new Object[]{Integer.valueOf(i3)});
        }
        return context.getString(C0966R.string.cs9, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
    }
}
