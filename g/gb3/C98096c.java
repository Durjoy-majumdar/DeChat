package gb3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Spanned;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o90.C100308d;
import p823sg.C101611g;
import p823sg.C90193h;
import pb1.C11881t1;
import q90.C101062d;
import xa3.C102587c;
import xa3.C102590f;
import xa3.C102593i;
import xa3.C102595k;
import xi3.C78844a;
import za3.C102988a;

/* renamed from: gb3.c */
public class C98096c {

    /* renamed from: a */
    public static C101611g<String, Integer> f287564a = new C100308d(30);

    static {
        new HashMap();
        new HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: xa3.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: xa3.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: xa3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: xa3.h} */
    /* JADX WARNING: type inference failed for: r2v2, types: [xa3.i, xa3.t] */
    /* JADX WARNING: type inference failed for: r2v3, types: [xa3.f, xa3.q] */
    /* JADX WARNING: type inference failed for: r2v4, types: [xa3.g, xa3.s] */
    /* JADX WARNING: type inference failed for: r2v5, types: [xa3.v, xa3.l] */
    /* JADX WARNING: type inference failed for: r2v6, types: [xa3.u, xa3.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xa3.C102587c m126706a(xa3.C102587c r6, cb3.C92393d r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r6.mo142212c()
            switch(r1) {
                case -1: goto L_0x00fb;
                case 0: goto L_0x000b;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00a4;
                case 4: goto L_0x0087;
                case 5: goto L_0x0071;
                case 6: goto L_0x005b;
                case 7: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r2 = r0
            goto L_0x0100
        L_0x000e:
            r1 = r6
            xa3.p r1 = (xa3.C102600p) r1
            xa3.p r2 = new xa3.p
            r2.<init>()
            if (r7 == 0) goto L_0x004c
            int r3 = r7.f264399a
            int r4 = r7.f264401c
            if (r3 != r4) goto L_0x004c
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r4 = r1.f302075f
            if (r4 == 0) goto L_0x0027
            int r4 = r4.getRecyclerItemPosition()
            goto L_0x0031
        L_0x0027:
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText r4 = r1.f302074e
            if (r4 == 0) goto L_0x0030
            int r4 = r4.getRecyclerItemPosition()
            goto L_0x0031
        L_0x0030:
            r4 = -1
        L_0x0031:
            if (r3 != r4) goto L_0x004c
            int r3 = r7.f264400b
            int r7 = r7.f264402d
        L_0x0037:
            if (r3 >= r7) goto L_0x0100
            java.util.LinkedList<xa3.c> r4 = r1.f302102s
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r5 = "dataList[i]"
            gy3.C87412m.m108593f(r4, r5)
            xa3.c r4 = (xa3.C102587c) r4
            r2.mo142216f(r4)
            int r3 = r3 + 1
            goto L_0x0037
        L_0x004c:
            java.util.LinkedList<xa3.c> r7 = r1.f302102s
            java.lang.String r1 = "list"
            gy3.C87412m.m108594g(r7, r1)
            java.util.LinkedList<xa3.c> r1 = r2.f302102s
            r1.addAll(r7)
            goto L_0x0100
        L_0x005b:
            xa3.k r2 = new xa3.k
            r2.<init>()
            r7 = r6
            xa3.k r7 = (xa3.C102595k) r7
            java.lang.String r1 = r7.f302084s
            r2.f302084s = r1
            int r1 = r7.f302085t
            r2.f302085t = r1
            java.lang.String r7 = r7.f302086u
            r2.f302086u = r7
            goto L_0x0100
        L_0x0071:
            xa3.d r2 = new xa3.d
            r2.<init>()
            r7 = r6
            xa3.d r7 = (xa3.C102588d) r7
            java.lang.String r1 = r7.f302127s
            r2.f302127s = r1
            java.lang.String r1 = r7.f302128t
            r2.f302128t = r1
            java.lang.String r7 = r7.f302129u
            r2.f302129u = r7
            goto L_0x0100
        L_0x0087:
            xa3.l r2 = new xa3.l
            r2.<init>()
            r7 = r6
            xa3.l r7 = (xa3.C102596l) r7
            int r1 = r7.f302132u
            r2.f302132u = r1
            java.lang.String r1 = r7.f302133v
            r2.f302133v = r1
            int r1 = r7.f302135x
            r2.f302135x = r1
            int r1 = r7.f302134w
            r2.f302134w = r1
            java.lang.String r7 = r7.f302130s
            r2.f302130s = r7
            goto L_0x0100
        L_0x00a4:
            xa3.g r2 = new xa3.g
            r2.<init>()
            r7 = r6
            xa3.g r7 = (xa3.C102591g) r7
            double r3 = r7.f302119t
            r2.f302119t = r3
            double r3 = r7.f302120u
            r2.f302120u = r3
            double r3 = r7.f302121v
            r2.f302121v = r3
            java.lang.String r1 = r7.f302122w
            r2.f302122w = r1
            java.lang.String r1 = r7.f302118s
            r2.f302118s = r1
            java.lang.String r1 = r7.f302123x
            r2.f302123x = r1
            boolean r1 = r7.f302124y
            r2.f302124y = r1
            java.lang.String r1 = r7.f302125z
            r2.f302125z = r1
            java.lang.String r1 = r7.f302113A
            r2.f302113A = r1
            java.lang.String r1 = r7.f302114B
            r2.f302114B = r1
            float r1 = r7.f302115C
            r2.f302115C = r1
            java.lang.String r1 = r7.f302116D
            r2.f302116D = r1
            java.lang.String r7 = r7.f302117E
            r2.f302117E = r7
            goto L_0x0100
        L_0x00e1:
            xa3.f r2 = new xa3.f
            r2.<init>()
            r7 = r6
            xa3.f r7 = (xa3.C102590f) r7
            java.lang.String r7 = r7.f302104s
            r2.f302104s = r7
            goto L_0x0100
        L_0x00ee:
            xa3.i r2 = new xa3.i
            r2.<init>()
            r7 = r6
            xa3.i r7 = (xa3.C102593i) r7
            java.lang.String r7 = r7.f302126s
            r2.f302126s = r7
            goto L_0x0100
        L_0x00fb:
            xa3.h r2 = new xa3.h
            r2.<init>()
        L_0x0100:
            if (r2 != 0) goto L_0x0103
            return r0
        L_0x0103:
            xa3.o r6 = (xa3.C102599o) r6
            int r7 = r6.f302099p
            r2.f302099p = r7
            boolean r7 = r6.f302100q
            r2.f302100q = r7
            java.lang.String r6 = r6.f302101r
            r2.f302101r = r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gb3.C98096c.m126706a(xa3.c, cb3.d):xa3.c");
    }

    /* renamed from: b */
    public static String m126707b(Context context, C102587c cVar) {
        if (cVar == null) {
            return "";
        }
        int c = cVar.mo142212c();
        return c == 1 ? ((C102593i) cVar).f302126s : c == 3 ? context.getString(C0966R.string.lks) : c == 2 ? context.getString(C0966R.string.lkr) : c == 6 ? context.getString(C0966R.string.lkt) : c == 4 ? context.getString(C0966R.string.lku) : c == 5 ? context.getString(C0966R.string.lkq) : "";
    }

    /* renamed from: c */
    public static String m126708c(String str, String str2) {
        int i;
        int i2;
        if (Util.isNullOrNil(str2)) {
            str2 = C11881t1.m11565c() + "/" + (C90193h.m112878f((str + System.currentTimeMillis()).getBytes()) + "_TH");
        }
        if (!C86013q1.m106450k(str2)) {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
            if (imageOptions == null || (i = imageOptions.outWidth) <= 0 || (i2 = imageOptions.outHeight) <= 0) {
                Log.m105920e("MicroMsg.WNNoteUtil", "GetImageOptions Error,use orignal file");
                return null;
            }
            while (i * i2 > 2764800) {
                i >>= 1;
                i2 >>= 1;
            }
            if (i > 800) {
                i = 800;
            }
            if (i2 > 800) {
                i2 = 800;
            }
            if (imageOptions.outHeight >= imageOptions.outWidth) {
                int i3 = i2;
                i2 = i;
                i = i3;
            }
            BitmapUtil.createThumbNail(str, i, i2, Bitmap.CompressFormat.JPEG, 95, str2, true);
        }
        return str2;
    }

    /* renamed from: d */
    public static int m126709d(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        return m126712g(C98095b.m126704a(str));
    }

    /* renamed from: e */
    public static int m126710e(String str, int i, int i2, boolean z) {
        Spanned a;
        Spanned spanned;
        if (Util.isNullOrNil(str) || (a = C102988a.m136184a(str)) == null) {
            return 0;
        }
        if (z) {
            i2 = a.length();
        }
        if (i < 0 || i > a.length() || i2 < 0 || i2 > a.length() || i > i2 || (spanned = (Spanned) a.subSequence(i, i2)) == null) {
            return 0;
        }
        return m126712g(spanned.toString());
    }

    /* renamed from: f */
    public static Bitmap m126711f(String str, String str2) {
        Bitmap c = C93693r.m118402c(str, 960, 960, false);
        if (c != null) {
            return c;
        }
        if (Util.isNullOrNil(str2)) {
            return null;
        }
        return C93693r.m118402c(str2, 960, 960, false);
    }

    /* renamed from: g */
    public static int m126712g(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i += str.charAt(i2) <= 127 ? 1 : 2;
        }
        return i;
    }

    /* renamed from: h */
    public static int m126713h(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        if (((C101062d) f287564a).check(str)) {
            return ((Integer) ((C101062d) f287564a).get(str)).intValue();
        }
        int g = m126712g(str);
        ((C101062d) f287564a).put(str, Integer.valueOf(g));
        return g;
    }

    /* renamed from: i */
    public static HashMap<String, String> m126714i(String str, String str2, boolean z, Context context) {
        new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        HashMap<String, String> hashMap = new HashMap<>();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (!Util.isNullOrNil(group)) {
                Matcher matcher2 = Pattern.compile("<wx-li>(.*?)</wx-li>").matcher(group);
                String str3 = "";
                int i = 1;
                while (matcher2.find()) {
                    if (z) {
                        str3 = str3 + context.getString(C0966R.string.lkz) + i + matcher2.group(1);
                    } else {
                        str3 = str3 + context.getString(C0966R.string.hok) + matcher2.group(1);
                    }
                    i++;
                }
                hashMap.put(group, str3);
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public static String m126715j(C102587c cVar) {
        return cVar == null ? "" : cVar.mo142212c() == 2 ? ((C102590f) cVar).f302101r : cVar.mo142212c() == 6 ? ((C102595k) cVar).f302084s : "";
    }

    /* renamed from: k */
    public static String m126716k(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("start, html = ");
        sb.append(str);
        sb.append(", isAccessibilityEnable = ");
        C78844a aVar = C78844a.C15689b.f42385a;
        sb.append(aVar.mo108842h(true));
        Log.m105924i("MicroMsg.WNNoteUtil", sb.toString());
        if (!Util.isNullOrNil(str) && aVar.mo108842h(true)) {
            try {
                str = str.replaceAll("<wn-todo checked=\"0\" >", context.getString(C0966R.string.f361530kk1)).replaceAll("<wn-todo checked=\"1\" >", context.getString(C0966R.string.f361529kk0)).replaceAll("</wn-todo>", "");
                HashMap<String, String> i = m126714i(str, "<wx-ul>(.*?)</wx-ul>", false, context);
                for (String next : i.keySet()) {
                    str = str.replaceAll("<wx-ul>" + next + "</wx-ul>", i.get(next));
                }
                HashMap<String, String> i2 = m126714i(str, "<wx-ol>(.*?)</wx-ol>", true, context);
                for (String next2 : i2.keySet()) {
                    str = str.replaceAll("<wx-ol>" + next2 + "</wx-ol>", i2.get(next2));
                }
                str = str.replaceAll("</wx-ul>", "").replaceAll("</wx-li>", "").replaceAll("</wn-todo>", "").replaceAll("</wn-todo>", "").replaceAll("</wx-ol>", "");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WNNoteUtil", "e = " + e);
            }
            Log.m105924i("MicroMsg.WNNoteUtil", "end htmlStr = " + str);
        }
        return str;
    }
}
