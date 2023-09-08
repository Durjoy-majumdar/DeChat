package bb3;

import android.content.Context;
import android.text.Spanned;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gb3.C98096c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import p823sg.C101611g;
import pb1.C11881t1;
import xa3.C102587c;
import xa3.C102590f;
import xa3.C102599o;
import za3.C102988a;
import za3.C102990c;

/* renamed from: bb3.j */
public class C92231j {

    /* renamed from: a */
    public static String f263991a;

    /* renamed from: b */
    public static ArrayList<C102587c> f263992b;

    /* renamed from: a */
    public static void m115953a() {
        ArrayList<C102587c> arrayList = f263992b;
        if (arrayList != null) {
            arrayList.clear();
        }
        f263991a = "";
        C11881t1.f34720b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r5) != false) goto L_0x0067;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<xa3.C102587c> m115954b() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<xa3.c> r1 = f263992b
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r1.next()
            xa3.c r2 = (xa3.C102587c) r2
            r3 = 0
            xa3.c r2 = gb3.C98096c.m126706a(r2, r3)
            r3 = 0
            if (r2 != 0) goto L_0x0023
            goto L_0x0068
        L_0x0023:
            r4 = 1
            int r5 = r2.mo142212c()
            r6 = 6
            r7 = 2
            if (r5 == r7) goto L_0x0034
            if (r5 == r6) goto L_0x0034
            r8 = 4
            if (r5 == r8) goto L_0x0034
            r8 = 5
            if (r5 != r8) goto L_0x0052
        L_0x0034:
            int r8 = r2.mo142212c()
            if (r8 != r7) goto L_0x0040
            r8 = r2
            xa3.f r8 = (xa3.C102590f) r8
            java.lang.String r8 = r8.f302104s
            goto L_0x0045
        L_0x0040:
            r8 = r2
            xa3.o r8 = (xa3.C102599o) r8
            java.lang.String r8 = r8.f302101r
        L_0x0045:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0051
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            if (r5 == r7) goto L_0x0056
            if (r5 != r6) goto L_0x0067
        L_0x0056:
            java.lang.String r5 = gb3.C98096c.m126715j(r2)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x0068
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r3 = r4
        L_0x0068:
            if (r3 == 0) goto L_0x000e
            r0.add(r2)
            goto L_0x000e
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92231j.m115954b():java.util.ArrayList");
    }

    /* renamed from: c */
    public static int m115955c(Context context) {
        String str;
        boolean isNullOrNil = Util.isNullOrNil(ClipboardHelper.getText());
        ArrayList<C102587c> arrayList = f263992b;
        boolean z = arrayList == null || arrayList.size() <= 0;
        if (isNullOrNil && z) {
            return 1;
        }
        if (!isNullOrNil && z) {
            return 2;
        }
        if (isNullOrNil && !z) {
            return 3;
        }
        try {
            CharSequence text = ClipboardHelper.getText();
            str = text instanceof Spanned ? C102990c.m136185a((Spanned) text) : text.toString();
        } catch (Exception e) {
            Log.m105921e("WNNoteClipboardManager", "get clipboard data error : ", e);
            str = "";
        }
        return str.equals(f263991a) ? 3 : 2;
    }

    /* renamed from: d */
    public static boolean m115956d(Context context) {
        return ClipboardHelper.getText(context).length() >= 16384 || C98096c.m126713h(ClipboardHelper.getText(context).toString()) >= 16384;
    }

    /* renamed from: e */
    public static void m115957e(Context context, ArrayList<C102587c> arrayList) {
        ArrayList<C102587c> arrayList2 = f263992b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        f263992b = arrayList;
        HashSet hashSet = new HashSet();
        ArrayList<C102587c> arrayList3 = f263992b;
        if (arrayList3 != null) {
            Iterator<C102587c> it = arrayList3.iterator();
            while (it.hasNext()) {
                C102587c next = it.next();
                C101611g<String, Integer> gVar = C98096c.f287564a;
                String str = next == null ? "" : next.mo142212c() == 2 ? ((C102590f) next).f302104s : ((C102599o) next).f302101r;
                if (!Util.isNullOrNil(str)) {
                    hashSet.add(str);
                }
                String j = C98096c.m126715j(next);
                if (!Util.isNullOrNil(j)) {
                    hashSet.add(j);
                }
            }
        }
        C11881t1.f34720b = hashSet;
        StringBuilder sb = new StringBuilder("");
        if (f263992b != null) {
            for (int i = 0; i < f263992b.size(); i++) {
                if (i != f263992b.size() - 1) {
                    sb.append(C98096c.m126707b(context, f263992b.get(i)));
                    sb.append("<br/>");
                } else {
                    sb.append(C98096c.m126707b(context, f263992b.get(i)));
                }
            }
        }
        String sb4 = sb.toString();
        C101611g<String, Integer> gVar2 = C98096c.f287564a;
        String replaceAll = Pattern.compile("wa-b>", 2).matcher(Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(Pattern.compile("</wn-todo>", 2).matcher(Pattern.compile("</wx-li>", 2).matcher(Pattern.compile("wx-b>", 2).matcher(sb4).replaceAll("wa-b>")).replaceAll("<br/>")).replaceAll("<br/>")).replaceAll("")).replaceAll("wx-b>");
        f263991a = replaceAll;
        ClipboardHelper.setText(C102988a.m136184a(replaceAll));
    }
}
