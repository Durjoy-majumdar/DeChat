package u21;

import android.content.Context;
import android.text.Spanned;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import p21.C100616a;
import p21.C100620e;
import p21.C100626k;
import p823sg.C101611g;
import pb1.C11881t1;
import s21.C101496a;
import s21.C101498c;

/* renamed from: u21.b */
public class C101940b {

    /* renamed from: a */
    public static String f300114a;

    /* renamed from: b */
    public static ArrayList<C100616a> f300115b;

    /* renamed from: a */
    public static void m134168a() {
        ArrayList<C100616a> arrayList = f300115b;
        if (arrayList != null) {
            arrayList.clear();
        }
        f300114a = "";
        C11881t1.f34720b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r5) != false) goto L_0x0066;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<p21.C100616a> m134169b() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<p21.a> r1 = f300115b
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r1.next()
            p21.a r2 = (p21.C100616a) r2
            p21.a r2 = com.tencent.p014mm.plugin.component.editor.C93088r.m117431a(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0022
            goto L_0x0067
        L_0x0022:
            r4 = 1
            int r5 = r2.mo140076b()
            r6 = 6
            r7 = 2
            if (r5 == r7) goto L_0x0033
            if (r5 == r6) goto L_0x0033
            r8 = 4
            if (r5 == r8) goto L_0x0033
            r8 = 5
            if (r5 != r8) goto L_0x0051
        L_0x0033:
            int r8 = r2.mo140076b()
            if (r8 != r7) goto L_0x003f
            r8 = r2
            p21.k r8 = (p21.C100626k) r8
            java.lang.String r8 = r8.f294806s
            goto L_0x0044
        L_0x003f:
            r8 = r2
            p21.e r8 = (p21.C100620e) r8
            java.lang.String r8 = r8.f294813r
        L_0x0044:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0050
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 != 0) goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r5 == r7) goto L_0x0055
            if (r5 != r6) goto L_0x0066
        L_0x0055:
            java.lang.String r5 = com.tencent.p014mm.plugin.component.editor.C93088r.m117439i(r2)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 != 0) goto L_0x0067
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r3 = r4
        L_0x0067:
            if (r3 == 0) goto L_0x000e
            r0.add(r2)
            goto L_0x000e
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u21.C101940b.m134169b():java.util.ArrayList");
    }

    /* renamed from: c */
    public static int m134170c(Context context) {
        String str;
        boolean isNullOrNil = Util.isNullOrNil(ClipboardHelper.getText());
        ArrayList<C100616a> arrayList = f300115b;
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
            str = text instanceof Spanned ? C101498c.m133261a((Spanned) text) : text.toString();
        } catch (Exception e) {
            Log.m105921e("EditorClipboardManager", "get clipboard data error : ", e);
            str = "";
        }
        return str.equals(f300114a) ? 3 : 2;
    }

    /* renamed from: d */
    public static boolean m134171d(Context context) {
        return ClipboardHelper.getText(context).length() >= 16384 || C93088r.m117438h(ClipboardHelper.getText(context).toString()) >= 16384;
    }

    /* renamed from: e */
    public static void m134172e(Context context, ArrayList<C100616a> arrayList) {
        ArrayList<C100616a> arrayList2 = f300115b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        f300115b = arrayList;
        HashSet hashSet = new HashSet();
        ArrayList<C100616a> arrayList3 = f300115b;
        if (arrayList3 != null) {
            Iterator<C100616a> it = arrayList3.iterator();
            while (it.hasNext()) {
                C100616a next = it.next();
                C101611g<String, Integer> gVar = C93088r.f268179a;
                String str = next == null ? "" : next.mo140076b() == 2 ? ((C100626k) next).f294806s : ((C100620e) next).f294813r;
                if (!Util.isNullOrNil(str)) {
                    hashSet.add(str);
                }
                String i = C93088r.m117439i(next);
                if (!Util.isNullOrNil(i)) {
                    hashSet.add(i);
                }
            }
        }
        C11881t1.f34720b = hashSet;
        StringBuilder sb = new StringBuilder("");
        if (f300115b != null) {
            for (int i2 = 0; i2 < f300115b.size(); i2++) {
                if (i2 != f300115b.size() - 1) {
                    sb.append(C93088r.m117432b(context, f300115b.get(i2)));
                    sb.append("<br/>");
                } else {
                    sb.append(C93088r.m117432b(context, f300115b.get(i2)));
                }
            }
        }
        String sb4 = sb.toString();
        C101611g<String, Integer> gVar2 = C93088r.f268179a;
        String replaceAll = Pattern.compile("wa-b>", 2).matcher(Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(Pattern.compile("</wn-todo>", 2).matcher(Pattern.compile("</wx-li>", 2).matcher(Pattern.compile("wx-b>", 2).matcher(sb4).replaceAll("wa-b>")).replaceAll("<br/>")).replaceAll("<br/>")).replaceAll("")).replaceAll("wx-b>");
        f300114a = replaceAll;
        ClipboardHelper.setText(C101496a.m133260a(replaceAll));
    }
}
