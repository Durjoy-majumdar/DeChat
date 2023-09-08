package qw1;

import a70.C112760b;
import android.content.Context;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98429r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p158gt.C98199a0;
import p158gt.C98202n;
import p645pj.C77092c;

/* renamed from: qw1.l */
public class C101316l {

    /* renamed from: a */
    public static final String[] f296815a = {"DCIM/Video screenshots", "DCIM/Screen recordings", "DCIM/ScreenRecorder", "Movies/Screenrecords"};

    /* renamed from: b */
    public static final int f296816b = C112760b.m154240l().substring(0, C112760b.m154240l().length() - 1).toLowerCase().hashCode();

    /* renamed from: c */
    public static final int f296817c = m132903b("DCIM/Camera");

    /* renamed from: d */
    public static final int f296818d = m132903b("download");

    /* renamed from: e */
    public static final ArrayList<Integer> f296819e = new ArrayList<>(3);

    /* renamed from: f */
    public static final ArrayList<Integer> f296820f = new ArrayList<>(4);

    static {
        String[] strArr = {"Pictures/Screenshots", "DCIM/Screenshots", "Screenshot"};
        for (int i = 0; i < 3; i++) {
            f296819e.add(Integer.valueOf(m132903b(strArr[i])));
        }
        String[] strArr2 = f296815a;
        for (int i2 = 0; i2 < 4; i2++) {
            f296820f.add(Integer.valueOf(m132903b(strArr2[i2])));
        }
    }

    /* renamed from: a */
    public static int m132902a(String str) {
        PInt pInt = new PInt();
        C98429r0.m127821l(str, pInt, new PInt());
        return pInt.value;
    }

    /* renamed from: b */
    public static int m132903b(String str) {
        return (Environment.getExternalStorageDirectory().toString() + "/" + str).toLowerCase().hashCode();
    }

    /* renamed from: c */
    public static String m132904c(String str, C93974o.C93980f fVar, long j) {
        if (str != null) {
            return str.concat("#*$").concat(fVar != null ? fVar.f271229f : "").concat(String.valueOf(j));
        }
        throw new NullPointerException("getCacheKey filePath is null!!!");
    }

    /* renamed from: d */
    public static String m132905d(String str, C93974o.C93980f fVar, int i) {
        if (str != null) {
            String str2 = "";
            String concat = str.concat("#*$").concat(fVar != null ? fVar.f271229f : str2);
            if (-1 != i) {
                str2 = String.valueOf(i);
            }
            return concat.concat(str2);
        }
        throw new NullPointerException("getDecodeTaskKey filePath is null!!!");
    }

    /* renamed from: e */
    public static String m132906e(long j) {
        if (j >= 1073741824) {
            return String.format("%dG", new Object[]{Long.valueOf(((j / 1024) / 1024) / 1024)});
        } else if (j >= 1048576) {
            return String.format("%dM", new Object[]{Long.valueOf((j / 1024) / 1024)});
        } else if (j <= 0) {
            return "";
        } else {
            return String.format("%dK", new Object[]{Long.valueOf(j / 1024)});
        }
    }

    /* renamed from: f */
    public static String m132907f(String str) {
        if (str != null) {
            int indexOf = str.indexOf("#*$");
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
            throw new NullPointerException("getFilePathFromKey end <= 0!!!");
        }
        throw new NullPointerException("getFilePathFromKey key is null!!!");
    }

    /* renamed from: g */
    public static long m132908g() {
        try {
            return C77092c.m93048j();
        } catch (Exception e) {
            Log.m105924i("MicroMsg.GalleryUtil", "[getMaxSendVideoSize] catch exception:" + e.getMessage());
            return 0;
        }
    }

    /* renamed from: h */
    public static String m132909h(Context context, int i, int i2, int i3, String str, boolean z, ArrayList<GalleryItem$MediaItem> arrayList) {
        Context context2 = context;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        ArrayList<GalleryItem$MediaItem> arrayList2 = arrayList;
        Class cls = C32735h.class;
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_enable_vlog, false);
        boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_story_enable_vlog, false);
        int j = C86709a0.m107523b().mo121114l() ? C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) : 0;
        boolean z2 = j == 1 || wf;
        boolean z3 = j == 1 || wf4;
        if (i4 != 4) {
            if (i4 != 19) {
                if (i4 != 22) {
                    if (i4 != 25) {
                        if (i4 != 7) {
                            if (!(i4 == 8 || i4 == 28)) {
                                if (i4 != 29) {
                                    if (i4 == 33) {
                                        return context.getString(C0966R.string.f5r);
                                    }
                                    if (i4 != 34) {
                                        switch (i4) {
                                            case 13:
                                                break;
                                            case 14:
                                                break;
                                            case 15:
                                            case 16:
                                                break;
                                            default:
                                                if (i5 == 0 || i6 <= 1) {
                                                    return context.getString(z ? C0966R.string.csu : C0966R.string.a2s);
                                                } else if (z) {
                                                    return context.getString(C0966R.string.nbo, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
                                                } else {
                                                    return context.getString(C0966R.string.f5i, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
                                                }
                                        }
                                    }
                                }
                            }
                        }
                        if (Util.isNullOrNil(str) || !str.equals("album_business_bubble_media_by_coordinate")) {
                            if (i5 == 0 || i6 <= 1) {
                                return context.getString(C0966R.string.f5r);
                            }
                            return context.getString(C0966R.string.f5r) + "(" + i5 + "/" + i6 + ")";
                        } else if (i5 == 0 || i6 <= 1) {
                            return context.getString(C0966R.string.f360089a13);
                        } else {
                            return context.getString(C0966R.string.f360089a13) + "(" + i5 + "/" + i6 + ")";
                        }
                    }
                    if (i5 == 0 || i6 <= 1) {
                        return context.getString(C0966R.string.f360089a13);
                    }
                    return context.getString(C0966R.string.f360089a13) + "(" + i5 + "/" + i6 + ")";
                }
                if (z3 && m132910i(arrayList2, true)) {
                    return context.getString(C0966R.string.f5u) + "(" + i5 + "/" + i6 + ")";
                } else if (i5 == 0 || i6 <= 1) {
                    return context.getString(C0966R.string.f5r);
                } else {
                    return context.getString(C0966R.string.f5r) + "(" + i5 + "/" + i6 + ")";
                }
            }
            if (i5 == 0 || i6 <= 1) {
                return context.getString(C0966R.string.f5r);
            }
            return context.getString(C0966R.string.f5r) + "(" + i5 + "/" + i6 + ")";
        } else if (z2 && m132910i(arrayList2, true)) {
            return context.getString(C0966R.string.f5u) + "(" + i5 + "/" + i6 + ")";
        } else if (i5 == 0 || i6 <= 1) {
            return context.getString(C0966R.string.f5r);
        } else {
            return context.getString(C0966R.string.f5r) + "(" + i5 + "/" + i6 + ")";
        }
    }

    /* renamed from: i */
    public static boolean m132910i(ArrayList<GalleryItem$MediaItem> arrayList, boolean z) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<GalleryItem$MediaItem> it = arrayList.iterator();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            GalleryItem$MediaItem next = it.next();
            if (next.getType() == 1) {
                z3 = true;
            } else if (next.getType() == 2) {
                i++;
                z2 = true;
            }
            if (!z2 || !z3) {
                if (i > 1) {
                    break;
                }
            } else {
                break;
            }
        }
        return z ? (z2 && z3) || i > 1 : (z2 && z3) || i >= 1;
    }

    /* renamed from: j */
    public static void m132911j(AppCompatActivity appCompatActivity, long j, String str, String str2, boolean z, int i, boolean z2) {
        if (!Util.isNullOrNil(str2)) {
            C98199a0 a0Var = new C98199a0();
            C87412m.m108594g(str, "<set-?>");
            a0Var.f287922c = str;
            a0Var.f287923d = j;
            C87412m.m108594g(str2, "<set-?>");
            a0Var.f287924e = str2;
            a0Var.f287925f = z ^ true ? 1 : 0;
            a0Var.f287921b = i;
            a0Var.f287920a = 0;
            ((C98202n) C86312j.m106911c(C98202n.class)).mo127112SA(a0Var);
            return;
        }
        Log.m105925i("MicroMsg.GalleryUtil", "imageSelectedChange username is empty imagePath:%s", str);
    }

    /* renamed from: k */
    public static boolean m132912k() {
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_enable_vlog, false);
    }

    /* renamed from: l */
    public static boolean m132913l() {
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_story_enable_vlog, false);
    }

    /* renamed from: m */
    public static void m132914m(int i, String str) {
        C115669n.INSTANCE.kvStat(i, str);
    }

    /* renamed from: n */
    public static boolean m132915n() {
        return MMApplicationContext.getContext().getApplicationInfo().targetSdkVersion >= 29;
    }

    /* renamed from: o */
    public static void m132916o(List<?> list, int i, int i2) {
        if (i > i2) {
            while (i > i2) {
                Collections.swap(list, i, i - 1);
                i--;
            }
            return;
        }
        while (i < i2) {
            int i3 = i + 1;
            Collections.swap(list, i, i3);
            i = i3;
        }
    }
}
