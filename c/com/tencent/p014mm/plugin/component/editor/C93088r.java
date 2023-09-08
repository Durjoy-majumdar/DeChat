package com.tencent.p014mm.plugin.component.editor;

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
import java.util.regex.Pattern;
import o90.C100308d;
import p21.C100616a;
import p21.C100618c;
import p21.C100621f;
import p21.C100626k;
import p21.C100628m;
import p21.C100630o;
import p823sg.C101611g;
import p823sg.C90193h;
import pb1.C11881t1;
import q90.C101062d;
import s21.C101496a;

/* renamed from: com.tencent.mm.plugin.component.editor.r */
public class C93088r {

    /* renamed from: a */
    public static C101611g<String, Integer> f268179a = new C100308d(30);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: p21.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: p21.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: p21.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: p21.l} */
    /* JADX WARNING: type inference failed for: r1v3, types: [p21.g, p21.m] */
    /* JADX WARNING: type inference failed for: r1v4, types: [p21.d, p21.k] */
    /* JADX WARNING: type inference failed for: r1v6, types: [p21.p, p21.i] */
    /* JADX WARNING: type inference failed for: r1v7, types: [p21.c, p21.e, p21.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p21.C100616a m117431a(p21.C100616a r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r5.mo140076b()
            switch(r1) {
                case -1: goto L_0x0099;
                case 0: goto L_0x000b;
                case 1: goto L_0x008c;
                case 2: goto L_0x007f;
                case 3: goto L_0x005a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0024;
                case 6: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = r0
            goto L_0x009e
        L_0x000e:
            p21.o r1 = new p21.o
            r1.<init>()
            r2 = r5
            p21.o r2 = (p21.C100630o) r2
            java.lang.String r3 = r2.f294827s
            r1.f294827s = r3
            int r3 = r2.f294828t
            r1.f294828t = r3
            java.lang.String r2 = r2.f294829u
            r1.f294829u = r2
            goto L_0x009e
        L_0x0024:
            p21.c r1 = new p21.c
            r1.<init>()
            r2 = r5
            p21.c r2 = (p21.C100618c) r2
            long r3 = r2.f294810o
            r1.f294810o = r3
            boolean r3 = r2.f294812q
            r1.f294812q = r3
            java.lang.String r3 = r2.f294813r
            r1.f294813r = r3
            java.lang.String r3 = r2.f294820s
            r1.f294820s = r3
            java.lang.String r3 = r2.f294821t
            r1.f294821t = r3
            java.lang.String r2 = r2.f294822u
            r1.f294822u = r2
            goto L_0x009e
        L_0x0045:
            p21.p r1 = new p21.p
            r1.<init>()
            r2 = r5
            p21.p r2 = (p21.C100631p) r2
            int r3 = r2.f294826v
            r1.f294826v = r3
            int r3 = r2.f294825u
            r1.f294825u = r3
            java.lang.String r2 = r2.f294823s
            r1.f294823s = r2
            goto L_0x009e
        L_0x005a:
            p21.f r1 = new p21.f
            r1.<init>()
            r2 = r5
            p21.f r2 = (p21.C100621f) r2
            double r3 = r2.f294815t
            r1.f294815t = r3
            double r3 = r2.f294816u
            r1.f294816u = r3
            double r3 = r2.f294817v
            r1.f294817v = r3
            java.lang.String r3 = r2.f294818w
            r1.f294818w = r3
            java.lang.String r3 = r2.f294814s
            r1.f294814s = r3
            boolean r3 = r2.f294812q
            r1.f294812q = r3
            java.lang.String r2 = r2.f294813r
            r1.f294813r = r2
            goto L_0x009e
        L_0x007f:
            p21.k r1 = new p21.k
            r1.<init>()
            r2 = r5
            p21.k r2 = (p21.C100626k) r2
            java.lang.String r2 = r2.f294806s
            r1.f294806s = r2
            goto L_0x009e
        L_0x008c:
            p21.m r1 = new p21.m
            r1.<init>()
            r2 = r5
            p21.m r2 = (p21.C100628m) r2
            java.lang.String r2 = r2.f294819s
            r1.f294819s = r2
            goto L_0x009e
        L_0x0099:
            p21.l r1 = new p21.l
            r1.<init>()
        L_0x009e:
            if (r1 != 0) goto L_0x00a1
            return r0
        L_0x00a1:
            p21.e r5 = (p21.C100620e) r5
            int r0 = r5.f294811p
            r1.f294811p = r0
            boolean r0 = r5.f294812q
            r1.f294812q = r0
            java.lang.String r5 = r5.f294813r
            r1.f294813r = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.C93088r.m117431a(p21.a):p21.a");
    }

    /* renamed from: b */
    public static String m117432b(Context context, C100616a aVar) {
        if (aVar == null) {
            return "";
        }
        int b = aVar.mo140076b();
        if (b == 1) {
            return ((C100628m) aVar).f294819s;
        }
        if (b == 3) {
            C100621f fVar = (C100621f) aVar;
            return context.getString(C0966R.string.hjw, new Object[]{fVar.f294814s, fVar.f294818w});
        } else if (b == 2) {
            return context.getString(C0966R.string.hjv);
        } else {
            if (b == 6) {
                return context.getString(C0966R.string.hjx);
            }
            if (b == 4) {
                return context.getString(C0966R.string.hjy);
            }
            if (b != 5) {
                return "";
            }
            return context.getString(C0966R.string.hju, new Object[]{((C100618c) aVar).f294820s});
        }
    }

    /* renamed from: c */
    public static String m117433c(String str, String str2) {
        int i;
        int i2;
        if (Util.isNullOrNil(str2)) {
            str2 = C11881t1.m11565c() + "/" + (C90193h.m112878f((str + System.currentTimeMillis()).getBytes()) + "_TH");
        }
        if (!C86013q1.m106450k(str2)) {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
            if (imageOptions == null || (i = imageOptions.outWidth) <= 0 || (i2 = imageOptions.outHeight) <= 0) {
                Log.m105920e("MicroMsg.EditorUtil", "GetImageOptions Error,use orignal file");
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
    public static int m117434d(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        return m117437g(m117441k(str));
    }

    /* renamed from: e */
    public static int m117435e(String str, int i, int i2, boolean z) {
        Spanned a;
        Spanned spanned;
        if (Util.isNullOrNil(str) || (a = C101496a.m133260a(str)) == null) {
            return 0;
        }
        if (z) {
            i2 = a.length();
        }
        if (i < 0 || i > a.length() || i2 < 0 || i2 > a.length() || i > i2 || (spanned = (Spanned) a.subSequence(i, i2)) == null) {
            return 0;
        }
        return m117437g(spanned.toString());
    }

    /* renamed from: f */
    public static Bitmap m117436f(String str, String str2) {
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
    public static int m117437g(String str) {
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
    public static int m117438h(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        if (((C101062d) f268179a).check(str)) {
            return ((Integer) ((C101062d) f268179a).get(str)).intValue();
        }
        int g = m117437g(str);
        ((C101062d) f268179a).put(str, Integer.valueOf(g));
        return g;
    }

    /* renamed from: i */
    public static String m117439i(C100616a aVar) {
        return aVar == null ? "" : aVar.mo140076b() == 2 ? ((C100626k) aVar).f294813r : aVar.mo140076b() == 6 ? ((C100630o) aVar).f294827s : "";
    }

    /* renamed from: j */
    public static float m117440j(long j) {
        float f = ((float) j) / 1000.0f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (float) Math.round(f);
    }

    /* renamed from: k */
    public static String m117441k(String str) {
        if (Util.isNullOrNil(str) || str.length() == 0) {
            return str;
        }
        return Pattern.compile("&amp;", 2).matcher(Pattern.compile("&gt;", 2).matcher(Pattern.compile("&lt;", 2).matcher(Pattern.compile("&nbsp;", 2).matcher(Pattern.compile("<[^>]*>", 2).matcher(Pattern.compile("</p>", 2).matcher(Pattern.compile("<p [^>]*>", 2).matcher(Pattern.compile("<hr[^>]*>", 2).matcher(Pattern.compile("</wx-todo>", 2).matcher(Pattern.compile("</wx-li>", 2).matcher(Pattern.compile("<div>", 2).matcher(Pattern.compile("<br[^>]*>", 2).matcher(str).replaceAll("\n")).replaceAll("")).replaceAll("\n")).replaceAll("\n")).replaceAll("\n")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll(" ")).replaceAll("<")).replaceAll(">")).replaceAll("&");
    }

    /* renamed from: l */
    public static ArrayList<String> m117442l(String str) {
        if (Util.isNullOrNil(str) || str.length() == 0) {
            return null;
        }
        String[] split = Pattern.compile("\n", 2).matcher(Pattern.compile("<div></div>", 2).matcher(Pattern.compile("</object>", 2).matcher(Pattern.compile("<hr[^>]*>", 2).matcher(Pattern.compile("<object[^>]*>", 2).matcher(Pattern.compile("<div><object[^>]*></object></div>", 2).matcher(str).replaceAll("<object>")).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#")).replaceAll("#WNNoteNode#<ThisisNoteNodeHrObj>#WNNoteNode#")).replaceAll("")).replaceAll("")).replaceAll("").replaceAll("<br>", "<br/>").trim().split("#WNNoteNode#");
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (str2.length() > 0) {
                String replace = str2.replace("</div>", "<div>");
                int i = -1;
                if (replace.endsWith("<div>")) {
                    i = replace.lastIndexOf("<div>");
                }
                if (i > 0) {
                    replace = replace.substring(0, i);
                }
                arrayList.add(replace.replace("<div><br/>", "<div>"));
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static CharSequence m117443m(Context context, int i) {
        if (i <= 0) {
            return context.getString(C0966R.string.cr7, new Object[]{0, 0});
        }
        return context.getString(C0966R.string.cr7, new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)});
    }
}
