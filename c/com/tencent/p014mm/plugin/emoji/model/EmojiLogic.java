package com.tencent.p014mm.plugin.emoji.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatCommonLibs;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import p823sg.C77710q;
import p823sg.C90193h;
import te3.C101792j80;
import u61.C101964h;
import wh3.C102451g;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.model.EmojiLogic */
public class EmojiLogic {

    /* renamed from: a */
    public static final /* synthetic */ int f268226a = 0;

    static {
        WeChatCommonLibs.load();
    }

    /* renamed from: a */
    public static boolean m117470a() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        return !(TextUtils.isEmpty(str) ? false : "CN".equalsIgnoreCase(str) ^ true) && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_new_emoji_store_ui, 0) == 1;
    }

    /* renamed from: b */
    public static String m117471b(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        if (i <= 0 && Util.isNullOrNil(str5)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<xml>");
        sb.append("<tid>" + i + "</tid>");
        sb.append("<title>" + str + "</title>");
        sb.append("<desc>" + str2 + "</desc>");
        sb.append("<iconUrl>" + str3 + "</iconUrl>");
        sb.append("<secondUrl>" + str4 + "</secondUrl>");
        sb.append("<pageType>" + i2 + "</pageType>");
        sb.append("<setKey>" + str5 + "</setKey>");
        sb.append("</xml>");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", sb4);
        return sb4;
    }

    /* renamed from: c */
    public static String m117472c(String str) {
        String str2;
        Exception e;
        try {
            str2 = XmlParser.parseXml(str, "xml", (String) null).get(".xml.designername");
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "designeruin:%s", str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getDesignerNameBySnsObjData exception. %s", e.toString());
            return str2;
        }
        return str2;
    }

    /* renamed from: d */
    public static String m117473d(String str) {
        String str2;
        Exception e;
        try {
            str2 = XmlParser.parseXml(str, "xml", (String) null).get(".xml.designerrediretcturl");
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "designerrediretcturl:%s", str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getDesignerRediretctUrlBySnsObjData exception. %s", e.toString());
            return str2;
        }
        return str2;
    }

    /* renamed from: e */
    public static int m117474e(String str) {
        int i;
        try {
            i = C77710q.m93739b(XmlParser.parseXml(str, "xml", (String) null).get(".xml.designeruin"));
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "designeruin:%s", Integer.valueOf(i));
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getDesignerUINBySnsObjData exception. %s", e.toString());
            return i;
        }
        return i;
    }

    public static native boolean extractForeground(int[] iArr, int i, int i2);

    /* renamed from: f */
    public static EmojiInfo m117475f(String str, int i, String str2, float f, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.m105918d("MicroMsg.emoji.EmojiLogic", "getIcon : productId is null.");
            return null;
        }
        EmojiInfo emojiInfo = new EmojiInfo();
        boolean z2 = false;
        if (z) {
            String p = m117485p(C101964h.m134224f(), str, str2);
            if (C86013q1.m106450k(p)) {
                C86009m1 m1Var = new C86009m1(p);
                if (m1Var.mo119967g()) {
                    if (m1Var.mo119980r() < 1) {
                        m1Var.mo119966f();
                    } else {
                        emojiInfo.field_type = C101964h.m134225g(C86013q1.m106433O(p, 0, 10));
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                Log.m105918d("MicroMsg.emoji.EmojiLogic", "banner icon does not exist. icon path :" + p + "...., icon type:" + i);
                return null;
            }
        } else {
            String p2 = m117485p(C101964h.m134224f(), str, str2);
            if (!C86013q1.m106450k(p2)) {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "icon file no exist. path:%s type:%d, url:%s", p2, Integer.valueOf(i), str2);
                return null;
            }
        }
        emojiInfo.field_md5 = m117487r(str, str2);
        emojiInfo.field_catalog = i != 2 ? i != 4 ? i != 8 ? 17 : 84 : 83 : 82;
        emojiInfo.field_groupId = str;
        emojiInfo.field_temp = 1;
        return emojiInfo;
    }

    /* renamed from: g */
    public static String m117476g(String str) {
        String str2;
        Exception e;
        try {
            str2 = XmlParser.parseXml(str, "xml", (String) null).get(".xml.desc");
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "desc:%s", str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getEmojiPageDesc exception. %s", e.toString());
            return str2;
        }
        return str2;
    }

    public static native boolean gifToMMAni(byte[] bArr, PByteArray pByteArray, int i);

    /* renamed from: h */
    public static String m117477h(String str) {
        String str2;
        Exception e;
        try {
            str2 = XmlParser.parseXml(str, "xml", (String) null).get(".xml.iconUrl");
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "iconUrl:%s", str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getEmojiPageIconUrl exception. %s", e.toString());
            return str2;
        }
        return str2;
    }

    /* renamed from: i */
    public static String m117478i(String str) {
        String str2 = "";
        try {
            str2 = Util.nullAs(XmlParser.parseXml(str, "xml", (String) null).get(".xml.secondUrl"), str2);
            Log.m105919d("MicroMsg.emoji.EmojiLogic", "secondUrl:%s", str2);
            return str2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getEmojiPageSecondUrl exception. %s", e.toString());
            return str2;
        }
    }

    /* renamed from: j */
    public static int m117479j(String str) {
        int i;
        try {
            i = Util.safeParseInt(XmlParser.parseXml(str, "xml", (String) null).get(".xml.tid"));
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "tid:%s", Integer.valueOf(i));
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTid exception. %s", e.toString());
            return i;
        }
        return i;
    }

    /* renamed from: k */
    public static String m117480k(String str) {
        String str2;
        Exception e;
        try {
            str2 = XmlParser.parseXml(str, "xml", (String) null).get(".xml.title");
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "title:%s", str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getEmojiPageTitle exception. %s", e.toString());
            return str2;
        }
        return str2;
    }

    /* renamed from: l */
    public static int m117481l(String str) {
        int i;
        try {
            i = Util.safeParseInt(XmlParser.parseXml(str, "xml", (String) null).get(".xml.pageType"));
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "pageType:%s", Integer.valueOf(i));
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getEmojiPageType exception. %s", e.toString());
            return i;
        }
        return i;
    }

    /* renamed from: m */
    public static int m117482m(C101792j80 j802) {
        if (j802 == null) {
            return 0;
        }
        return j802.f298509n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = r2.f298508j;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m117483n(te3.C101792j80 r2) {
        /*
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r2 = r2.f298508j
            if (r2 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.String r0 = ","
            java.lang.String r1 = ";"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117483n(te3.j80):java.lang.String");
    }

    /* renamed from: o */
    public static int m117484o(C101792j80 j802) {
        if (j802 != null && !Util.isNullOrNil(j802.f298504f)) {
            return j802.f298502d == 0 ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: p */
    public static String m117485p(String str, String str2, String str3) {
        if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str3)) {
            String r = m117487r(str2, str3);
            if (Util.isNullOrNil(r)) {
                return null;
            }
            if (Util.isNullOrNil(str2)) {
                return str + r;
            }
            return str + str2 + "/" + r;
        }
        Log.m105928w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and url are null.");
        return null;
    }

    /* renamed from: q */
    public static String m117486q(String str, String str2, String str3) {
        String str4 = null;
        if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str3)) {
            if (!Util.isNullOrNil(str3)) {
                if (Util.isNullOrNil(str2)) {
                    str4 = str + str3;
                } else {
                    str4 = str + str2 + "/" + str3;
                }
            }
            Log.m105919d("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path. productid:%s md5:%s path:%s", str2, str3, str4);
            return str4;
        }
        Log.m105928w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and md5 are null.");
        return null;
    }

    /* renamed from: r */
    public static String m117487r(String str, String str2) {
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            return Util.isNullOrNil(str2) ? C90193h.m112878f(str.getBytes()) : C90193h.m112878f(str2.getBytes());
        }
        Log.m105920e("MicroMsg.emoji.EmojiLogic", "[cpan] product id and url are null.");
        return null;
    }

    /* renamed from: s */
    public static String m117488s(String str) {
        String str2;
        Exception e;
        try {
            str2 = XmlParser.parseXml(str, "xml", (String) null).get(".xml.productid");
            try {
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "productId:%s", str2);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            Log.m105921e("MicroMsg.emoji.EmojiLogic", "getProductIdBySnsObjData exception. %s", e.toString());
            return str2;
        }
        return str2;
    }

    /* renamed from: t */
    public static void m117489t(Context context, byte[] bArr, String str, byte[] bArr2, String str2) {
        EmojiInfo emojiInfo;
        Bitmap bitmap;
        int i;
        byte[] bArr3 = bArr2;
        Class cls = C39315g.class;
        if (str != null || bArr3 != null) {
            String f = C101964h.m134224f();
            C86013q1.m106438T(f + str, bArr2, 0, bArr3.length);
            if (ImgUtil.isGif(bArr2)) {
                C102451g d = ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d();
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                emojiInfo = d.mo142050bD(str, "", 65, 10, bArr3.length, (String) null, str2, "");
            } else {
                C102451g d2 = ((C39315g) C86312j.m106911c(cls)).mo58034O6().mo57717d();
                IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = EmojiInfo.f284123W1;
                emojiInfo = d2.mo142050bD(str, "", 65, 11, bArr3.length, (String) null, str2, "");
            }
            if (bArr == null) {
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(emojiInfo == null);
                Log.m105919d("MicroMsg.emoji.EmojiLogic", "insertEmoji: thumb is null, emojiInfo is null ? %B", objArr);
                if (emojiInfo != null) {
                    Context context2 = context;
                    bitmap = emojiInfo.mo62698y(context);
                } else {
                    return;
                }
            } else {
                bitmap = BitmapUtil.decodeByteArray(bArr);
            }
            if (bitmap != null) {
                int i2 = 300;
                if (bitmap.getWidth() > 300 || bitmap.getHeight() > 300) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Log.m105925i("MicroMsg.emoji.EmojiLogic", "cpan app msg width:%d height:%d", Integer.valueOf(width), Integer.valueOf(height));
                    if (width > height) {
                        i = (int) ((((float) height) / ((float) width)) * 300.0f);
                    } else {
                        i2 = (int) ((((float) width) / ((float) height)) * 300.0f);
                        i = 300;
                    }
                    Log.m105925i("MicroMsg.emoji.EmojiLogic", "cpan app msg new width:%d new height:%d", Integer.valueOf(i2), Integer.valueOf(i));
                    bitmap = BitmapUtil.extractThumbNail(bitmap, i, i2, false, true);
                }
            }
            if (bitmap != null) {
                try {
                    if (bitmap.getByteCount() > 65536) {
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        BitmapUtil.saveBitmapToImage(bitmap, 80, compressFormat, f + str + "_thumb", true);
                        Log.m105925i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is over size. save as jpg. size :%d", Integer.valueOf(bitmap.getByteCount()));
                        return;
                    }
                    Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                    BitmapUtil.saveBitmapToImage(bitmap, 100, compressFormat2, f + str + "_thumb", true);
                    Log.m105925i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is in normal size. sav as png. size :%d", Integer.valueOf(bitmap.getByteCount()));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.emoji.EmojiLogic", e, "insertEmoji Error", new Object[0]);
                }
            }
        }
    }

    /* renamed from: u */
    public static boolean m117490u(C101792j80 j802) {
        return j802 != null && !Util.isNullOrNil(j802.f298504f) && !Util.isNullOrNil(j802.f298503e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0265, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0267, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0268, code lost:
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0271, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0272, code lost:
        r1 = r0;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0275, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0276, code lost:
        r23 = r3;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04d9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0612, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0617, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0618, code lost:
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x061b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x061c, code lost:
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x061f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0620, code lost:
        r4 = r22;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e0, code lost:
        if (r10.endsWith(".png") != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0184, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0255 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:227:0x04d2 */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0271 A[Catch:{ Exception -> 0x0265, all -> 0x0184 }, ExcHandler: all (r0v43 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ Exception -> 0x0265, all -> 0x0184 }]), Splitter:B:43:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04d9 A[Catch:{ Exception -> 0x04d9, all -> 0x0612 }, ExcHandler: Exception (e java.lang.Exception), PHI: r4 r17 
      PHI: (r4v16 java.util.zip.ZipFile) = (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile) binds: [B:288:0x05b2, B:290:0x05c6, B:291:?, B:280:0x057f, B:281:?, B:274:0x0574, B:275:?, B:268:0x0549, B:269:?, B:261:0x0529, B:178:0x036d, B:180:0x0371, B:194:0x040c, B:202:0x0422, B:206:0x0449, B:212:0x046e, B:214:0x0485, B:227:0x04d2, B:199:0x0417] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v9 java.io.InputStream) = (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v21 java.io.InputStream) binds: [B:288:0x05b2, B:290:0x05c6, B:291:?, B:280:0x057f, B:281:?, B:274:0x0574, B:275:?, B:268:0x0549, B:269:?, B:261:0x0529, B:178:0x036d, B:180:0x0371, B:194:0x040c, B:202:0x0422, B:206:0x0449, B:212:0x046e, B:214:0x0485, B:227:0x04d2, B:199:0x0417] A[DONT_GENERATE, DONT_INLINE], Splitter:B:227:0x04d2] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0612 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 r17 
      PHI: (r4v14 java.util.zip.ZipFile) = (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v13 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile), (r4v27 java.util.zip.ZipFile) binds: [B:258:0x0524, B:259:?, B:264:0x053e, B:270:0x054c, B:276:0x0577, B:282:0x0582, B:295:0x05de, B:296:?, B:298:0x05f0, B:288:0x05b2, B:280:0x057f, B:281:?, B:274:0x0574, B:275:?, B:268:0x0549, B:269:?, B:261:0x0529, B:178:0x036d, B:180:0x0371, B:194:0x040c, B:202:0x0422, B:206:0x0449, B:212:0x046e, B:227:0x04d2, B:199:0x0417] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v7 java.io.InputStream) = (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v6 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v20 java.io.InputStream), (r17v21 java.io.InputStream) binds: [B:258:0x0524, B:259:?, B:264:0x053e, B:270:0x054c, B:276:0x0577, B:282:0x0582, B:295:0x05de, B:296:?, B:298:0x05f0, B:288:0x05b2, B:280:0x057f, B:281:?, B:274:0x0574, B:275:?, B:268:0x0549, B:269:?, B:261:0x0529, B:178:0x036d, B:180:0x0371, B:194:0x040c, B:202:0x0422, B:206:0x0449, B:212:0x046e, B:227:0x04d2, B:199:0x0417] A[DONT_GENERATE, DONT_INLINE], Splitter:B:227:0x04d2] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x061b A[ExcHandler: all (th java.lang.Throwable), PHI: r17 r22 
      PHI: (r17v5 java.io.InputStream) = (r17v4 java.io.InputStream), (r17v6 java.io.InputStream) binds: [B:165:0x033f, B:169:0x0349] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v1 java.util.zip.ZipFile) = (r22v0 java.util.zip.ZipFile), (r22v2 java.util.zip.ZipFile) binds: [B:165:0x033f, B:169:0x0349] A[DONT_GENERATE, DONT_INLINE], Splitter:B:165:0x033f] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0184 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:38:0x00e2] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m117491v(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.tencent.p014mm.storage.emotion.EmojiGroupInfo r29) {
        /*
            r1 = r25
            java.lang.String r2 = "_cover."
            java.lang.String r3 = "MicroMsg.emoji.EmojiLogic"
            java.lang.Class<z51.g> r4 = z51.C39315g.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = a70.C112760b.m154247s()
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = u61.C101964h.m134224f()
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.zip.ZipFile r11 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x064a, all -> 0x0644 }
            r12 = 1
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r12)     // Catch:{ Exception -> 0x064a, all -> 0x0644 }
            r11.<init>(r5)     // Catch:{ Exception -> 0x064a, all -> 0x0644 }
            java.util.Enumeration r5 = r11.entries()     // Catch:{ Exception -> 0x063e, all -> 0x0639 }
            r13 = 0
            r14 = 0
        L_0x0048:
            boolean r15 = r5.hasMoreElements()     // Catch:{ Exception -> 0x0630, all -> 0x0628 }
            java.lang.String r9 = "."
            java.lang.String r10 = "..\\"
            java.lang.String r12 = "../"
            r17 = r13
            java.lang.String r13 = "/"
            r18 = r2
            if (r15 == 0) goto L_0x0339
            java.lang.Object r15 = r5.nextElement()     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            java.util.zip.ZipEntry r15 = (java.util.zip.ZipEntry) r15     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            java.lang.String r2 = r15.getName()     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            boolean r2 = r2.contains(r12)     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            if (r2 != 0) goto L_0x030a
            java.lang.String r2 = r15.getName()     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            boolean r2 = r2.contains(r10)     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            if (r2 == 0) goto L_0x0076
            goto L_0x030a
        L_0x0076:
            boolean r2 = r15.isDirectory()     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            if (r2 != 0) goto L_0x02f0
            java.io.InputStream r2 = r11.getInputStream(r15)     // Catch:{ Exception -> 0x032b, all -> 0x0321 }
            java.lang.String r10 = r15.getName()     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            java.lang.String r12 = r15.getName()     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            int r12 = r12.lastIndexOf(r13)     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            r16 = 1
            int r12 = r12 + 1
            java.lang.String r10 = r10.substring(r12)     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            java.lang.String r10 = r10.toLowerCase()     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            r21 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            r5.<init>()     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            r5.append(r6)     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            r5.append(r13)     // Catch:{ Exception -> 0x02e8, all -> 0x02e1 }
            r22 = r11
            java.lang.String r11 = r15.getName()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r11)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r12.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            boolean r5 = r12.mo119978p()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r5 == 0) goto L_0x00c5
            r12.mo119966f()     // Catch:{ Exception -> 0x00c1, all -> 0x0184 }
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            r1 = r0
            goto L_0x0189
        L_0x00c5:
            com.tencent.mm.vfs.m1 r5 = r12.mo119974l()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.mo119987x()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            boolean r5 = r10.startsWith(r9)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r5 != 0) goto L_0x02db
            java.lang.String r5 = ".gif"
            boolean r5 = r10.endsWith(r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r5 != 0) goto L_0x00e2
            java.lang.String r5 = ".png"
            boolean r5 = r10.endsWith(r5)     // Catch:{ Exception -> 0x00c1, all -> 0x0184 }
            if (r5 == 0) goto L_0x02db
        L_0x00e2:
            java.lang.String r5 = r15.getName()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r9 = "/large/"
            boolean r5 = r5.contains(r9)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r5 == 0) goto L_0x027b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.<init>()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r6)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r13)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r10)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106428J(r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r9 = 131072(0x20000, float:1.83671E-40)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x0275, all -> 0x0271 }
        L_0x010c:
            int r11 = r2.read(r9)     // Catch:{ Exception -> 0x0275, all -> 0x0271 }
            if (r11 <= 0) goto L_0x011d
            r12 = 0
            r5.write(r9, r12, r11)     // Catch:{ Exception -> 0x0117, all -> 0x0271 }
            goto L_0x010c
        L_0x0117:
            r0 = move-exception
            r1 = r0
            r23 = r3
            goto L_0x0279
        L_0x011d:
            r5.close()     // Catch:{ Exception -> 0x0275, all -> 0x0271 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.<init>()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r6)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r13)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r5.append(r10)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r9 = "md5:%s index:%d"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r11 = 0
            r12[r11] = r5     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r15 = 1
            r12[r15] = r11     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r12)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r9.<init>()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r9.append(r6)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r9.append(r13)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r9.append(r10)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r11 = r9.getPath()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r11 == 0) goto L_0x018d
            r12 = 0
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r12, r12)     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            java.lang.String r12 = r9.getPath()     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            if (r12 != 0) goto L_0x018d
            android.net.Uri$Builder r9 = r9.buildUpon()     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            android.net.Uri$Builder r9 = r9.path(r11)     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            android.net.Uri r9 = r9.build()     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            goto L_0x018d
        L_0x0181:
            r1 = r0
            goto L_0x02e6
        L_0x0184:
            r0 = move-exception
            goto L_0x0181
        L_0x0186:
            r0 = move-exception
            goto L_0x00c2
        L_0x0189:
            r23 = r3
            goto L_0x02ee
        L_0x018d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r11.<init>()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r11.append(r6)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r11.append(r13)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r11.append(r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)     // Catch:{ Exception -> 0x0267, all -> 0x0184 }
            java.lang.String r12 = r11.getPath()     // Catch:{ Exception -> 0x0267, all -> 0x0184 }
            if (r12 == 0) goto L_0x01c8
            r13 = 0
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r13, r13)     // Catch:{ Exception -> 0x01c5, all -> 0x0184 }
            java.lang.String r13 = r11.getPath()     // Catch:{ Exception -> 0x01c5, all -> 0x0184 }
            boolean r13 = r13.equals(r12)     // Catch:{ Exception -> 0x01c5, all -> 0x0184 }
            if (r13 != 0) goto L_0x01c8
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ Exception -> 0x01c5, all -> 0x0184 }
            android.net.Uri$Builder r11 = r11.path(r12)     // Catch:{ Exception -> 0x01c5, all -> 0x0184 }
            android.net.Uri r11 = r11.build()     // Catch:{ Exception -> 0x01c5, all -> 0x0184 }
            goto L_0x01c8
        L_0x01c5:
            r0 = move-exception
            r1 = r0
            goto L_0x0189
        L_0x01c8:
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163865u(r9)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r12)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r12 == 0) goto L_0x01d4
            r12 = 2
            goto L_0x01d5
        L_0x01d4:
            r12 = 1
        L_0x01d5:
            di3.d r13 = di3.C86312j.m106911c(r4)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            z51.g r13 = (z51.C39315g) r13     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            com.tencent.mm.storage.w2 r13 = r13.mo58034O6()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            wh3.g r13 = r13.mo57717d()     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            com.tencent.mm.storage.emotion.EmojiInfo r13 = r13.mo142044TO(r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            if (r13 != 0) goto L_0x01f2
            com.tencent.mm.storage.emotion.EmojiInfo r13 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ Exception -> 0x00c1, all -> 0x0184 }
            r13.<init>()     // Catch:{ Exception -> 0x00c1, all -> 0x0184 }
            r15 = 0
            r13.mo62656c2(r15)     // Catch:{ Exception -> 0x00c1, all -> 0x0184 }
        L_0x01f2:
            r13.mo135623t2(r10)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            r13.setMd5(r5)     // Catch:{ Exception -> 0x026b, all -> 0x0184 }
            com.tencent.mm.vfs.f0 r15 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0267, all -> 0x0184 }
            r23 = r3
            r3 = 0
            com.tencent.mm.vfs.f0$h r15 = r15.mo177799l(r9, r3)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            boolean r3 = r15.mo177810a()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r19 = 0
            if (r3 != 0) goto L_0x020e
            r24 = r4
        L_0x020b:
            r3 = r19
            goto L_0x0220
        L_0x020e:
            com.tencent.mm.vfs.FileSystem$c r3 = r15.f348991a     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r24 = r4
            java.lang.String r4 = r15.f348992b     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            com.tencent.mm.vfs.b0 r3 = r3.mo119945q(r4)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            if (r3 != 0) goto L_0x021b
            goto L_0x020b
        L_0x021b:
            long r3 = r3.f250473c     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r19 = r3
            goto L_0x020b
        L_0x0220:
            int r4 = (int) r3     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r13.mo62682l1(r4)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r13.setType(r12)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r13.mo62634E(r1)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r13.mo135622s2(r14)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r8.add(r13)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r9, r15)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r9 = 0
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r11, r9)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            boolean r9 = r3.mo177810a()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            if (r9 == 0) goto L_0x0255
            boolean r9 = r4.mo177810a()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            if (r9 != 0) goto L_0x024a
            goto L_0x0255
        L_0x024a:
            com.tencent.mm.vfs.FileSystem$c r9 = r4.f348991a     // Catch:{ IOException -> 0x0255 }
            java.lang.String r4 = r4.f348992b     // Catch:{ IOException -> 0x0255 }
            com.tencent.mm.vfs.FileSystem$c r11 = r3.f348991a     // Catch:{ IOException -> 0x0255 }
            java.lang.String r3 = r3.f348992b     // Catch:{ IOException -> 0x0255 }
            r9.mo119946t(r4, r11, r3)     // Catch:{ IOException -> 0x0255 }
        L_0x0255:
            int r3 = r10.length()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            int r3 = r3 + -4
            r4 = 0
            java.lang.String r3 = r10.substring(r4, r3)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r7.put(r3, r5)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            goto L_0x02df
        L_0x0265:
            r0 = move-exception
            goto L_0x026e
        L_0x0267:
            r0 = move-exception
            r23 = r3
            goto L_0x026e
        L_0x026b:
            r0 = move-exception
            r23 = r3
        L_0x026e:
            r1 = r0
            goto L_0x02ee
        L_0x0271:
            r0 = move-exception
            r1 = r0
            r9 = r5
            goto L_0x02cc
        L_0x0275:
            r0 = move-exception
            r23 = r3
            r1 = r0
        L_0x0279:
            r9 = r5
            goto L_0x02d4
        L_0x027b:
            r23 = r3
            r24 = r4
            java.lang.String r3 = "icon"
            boolean r3 = r10.startsWith(r3)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            if (r3 == 0) goto L_0x02df
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r3.<init>()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            byte[] r4 = r25.getBytes()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r3.append(r4)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            java.lang.String r4 = "_panel_enable"
            r3.append(r4)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r4.<init>()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r4.append(r6)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r4.append(r13)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r4.append(r3)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            java.io.OutputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106428J(r3)     // Catch:{ Exception -> 0x0265, all -> 0x0184 }
            r4 = 131072(0x20000, float:1.83671E-40)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x02d1, all -> 0x02c9 }
        L_0x02ba:
            int r5 = r2.read(r4)     // Catch:{ Exception -> 0x02d1, all -> 0x02c9 }
            if (r5 <= 0) goto L_0x02c5
            r9 = 0
            r3.write(r4, r9, r5)     // Catch:{ Exception -> 0x02d1, all -> 0x02c9 }
            goto L_0x02ba
        L_0x02c5:
            r3.close()     // Catch:{ Exception -> 0x02d1, all -> 0x02c9 }
            goto L_0x02df
        L_0x02c9:
            r0 = move-exception
            r1 = r0
            r9 = r3
        L_0x02cc:
            r13 = r2
            r11 = r22
            goto L_0x067c
        L_0x02d1:
            r0 = move-exception
            r1 = r0
            r9 = r3
        L_0x02d4:
            r13 = r2
            r11 = r22
            r2 = r23
            goto L_0x0650
        L_0x02db:
            r23 = r3
            r24 = r4
        L_0x02df:
            r13 = r2
            goto L_0x02fa
        L_0x02e1:
            r0 = move-exception
            r22 = r11
            goto L_0x0181
        L_0x02e6:
            r13 = r2
            goto L_0x0327
        L_0x02e8:
            r0 = move-exception
            r23 = r3
            r22 = r11
            goto L_0x026e
        L_0x02ee:
            r13 = r2
            goto L_0x0333
        L_0x02f0:
            r23 = r3
            r24 = r4
            r21 = r5
            r22 = r11
            r13 = r17
        L_0x02fa:
            if (r13 == 0) goto L_0x0307
            r13.close()     // Catch:{ Exception -> 0x0304, all -> 0x0301 }
            r13 = 0
            goto L_0x0307
        L_0x0301:
            r0 = move-exception
            r1 = r0
            goto L_0x0327
        L_0x0304:
            r0 = move-exception
            r1 = r0
            goto L_0x0333
        L_0x0307:
            int r14 = r14 + 1
            goto L_0x0314
        L_0x030a:
            r23 = r3
            r24 = r4
            r21 = r5
            r22 = r11
            r13 = r17
        L_0x0314:
            r2 = r18
            r5 = r21
            r11 = r22
            r3 = r23
            r4 = r24
            r12 = 1
            goto L_0x0048
        L_0x0321:
            r0 = move-exception
            r22 = r11
            r1 = r0
            r13 = r17
        L_0x0327:
            r4 = r22
            goto L_0x062d
        L_0x032b:
            r0 = move-exception
            r23 = r3
            r22 = r11
            r1 = r0
            r13 = r17
        L_0x0333:
            r4 = r22
        L_0x0335:
            r2 = r23
            goto L_0x0636
        L_0x0339:
            r23 = r3
            r24 = r4
            r22 = r11
            java.util.Enumeration r2 = r22.entries()     // Catch:{ Exception -> 0x061f, all -> 0x061b }
        L_0x0343:
            boolean r3 = r2.hasMoreElements()     // Catch:{ Exception -> 0x061f, all -> 0x061b }
            if (r3 == 0) goto L_0x0522
            java.lang.Object r3 = r2.nextElement()     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            boolean r4 = r4.contains(r12)     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            if (r4 != 0) goto L_0x0514
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            boolean r4 = r4.contains(r10)     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            if (r4 == 0) goto L_0x0365
            goto L_0x0514
        L_0x0365:
            boolean r4 = r3.isDirectory()     // Catch:{ Exception -> 0x051e, all -> 0x061b }
            if (r4 != 0) goto L_0x0508
            r4 = r22
            java.io.InputStream r5 = r4.getInputStream(r3)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            java.lang.String r11 = r3.getName()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r14 = r3.getName()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            int r14 = r14.lastIndexOf(r13)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r15 = 1
            int r14 = r14 + r15
            java.lang.String r11 = r11.substring(r14)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r11 = r11.toLowerCase()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r15.<init>()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r15.append(r6)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r15.append(r13)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r21 = r2
            java.lang.String r2 = r3.getName()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r15.append(r2)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r2 = r15.toString()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r14.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            boolean r2 = r14.mo119978p()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            if (r2 == 0) goto L_0x03b8
            r14.mo119966f()     // Catch:{ Exception -> 0x03b3, all -> 0x03ae }
            goto L_0x03b8
        L_0x03ae:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x062d
        L_0x03b3:
            r0 = move-exception
            r1 = r0
            r13 = r5
            goto L_0x0335
        L_0x03b8:
            com.tencent.mm.vfs.m1 r2 = r14.mo119974l()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r2.mo119987x()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r2 = r3.getName()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r3 = "/thumb/"
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            if (r2 == 0) goto L_0x04fc
            int r2 = r11.lastIndexOf(r9)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = r11.substring(r2)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r14.<init>()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            int r2 = r2 + -1
            r15 = 0
            java.lang.String r2 = r11.substring(r15, r2)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r14.append(r2)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r2 = r18
            r14.append(r2)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r14.append(r3)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r11.<init>()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r11.append(r6)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r11.append(r13)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r11.append(r3)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            java.io.OutputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106428J(r11)     // Catch:{ Exception -> 0x0504, all -> 0x04ff }
            r14 = 131072(0x20000, float:1.83671E-40)
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x04f0, all -> 0x04e6 }
        L_0x040e:
            int r14 = r5.read(r15)     // Catch:{ Exception -> 0x04f0, all -> 0x04e6 }
            if (r14 <= 0) goto L_0x041d
            r17 = r5
            r5 = 0
            r11.write(r15, r5, r14)     // Catch:{ Exception -> 0x04e3, all -> 0x04e0 }
            r5 = r17
            goto L_0x040e
        L_0x041d:
            r17 = r5
            r11.close()     // Catch:{ Exception -> 0x04e3, all -> 0x04e0 }
            int r5 = r3.lastIndexOf(r2)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r11 = 0
            java.lang.String r5 = r3.substring(r11, r5)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            boolean r11 = r7.containsKey(r5)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            if (r11 == 0) goto L_0x04dd
            java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r11.<init>()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r11.append(r6)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r11.append(r13)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r11.append(r3)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            java.lang.String r14 = r11.getPath()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            if (r14 == 0) goto L_0x046e
            r15 = 0
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r15, r15)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            java.lang.String r15 = r11.getPath()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            boolean r15 = r15.equals(r14)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            if (r15 != 0) goto L_0x046e
            android.net.Uri$Builder r11 = r11.buildUpon()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            android.net.Uri$Builder r11 = r11.path(r14)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            android.net.Uri r11 = r11.build()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
        L_0x046e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r14.<init>()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r14.append(r6)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r14.append(r13)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r14.append(r5)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            java.lang.String r15 = "_cover"
            r14.append(r15)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            java.lang.String r15 = r14.getPath()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            if (r15 == 0) goto L_0x04ad
            r18 = r2
            r2 = 0
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r2, r2)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            java.lang.String r2 = r14.getPath()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            boolean r2 = r2.equals(r15)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            if (r2 != 0) goto L_0x04af
            android.net.Uri$Builder r2 = r14.buildUpon()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            android.net.Uri$Builder r2 = r2.path(r15)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            android.net.Uri r14 = r2.build()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            goto L_0x04af
        L_0x04ad:
            r18 = r2
        L_0x04af:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            r15 = 0
            com.tencent.mm.vfs.f0$h r11 = r2.mo177799l(r11, r15)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            com.tencent.mm.vfs.f0$h r2 = r2.mo177799l(r14, r15)     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            boolean r14 = r11.mo177810a()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            if (r14 == 0) goto L_0x04d2
            boolean r14 = r2.mo177810a()     // Catch:{ Exception -> 0x04d9, all -> 0x04d6 }
            if (r14 != 0) goto L_0x04c7
            goto L_0x04d2
        L_0x04c7:
            com.tencent.mm.vfs.FileSystem$c r14 = r2.f348991a     // Catch:{ IOException -> 0x04d2 }
            java.lang.String r2 = r2.f348992b     // Catch:{ IOException -> 0x04d2 }
            com.tencent.mm.vfs.FileSystem$c r15 = r11.f348991a     // Catch:{ IOException -> 0x04d2 }
            java.lang.String r11 = r11.f348992b     // Catch:{ IOException -> 0x04d2 }
            r14.mo119946t(r2, r15, r11)     // Catch:{ IOException -> 0x04d2 }
        L_0x04d2:
            r7.put(r3, r5)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            goto L_0x050c
        L_0x04d6:
            r0 = move-exception
            goto L_0x0613
        L_0x04d9:
            r0 = move-exception
        L_0x04da:
            r1 = r0
            goto L_0x05d6
        L_0x04dd:
            r18 = r2
            goto L_0x050c
        L_0x04e0:
            r0 = move-exception
        L_0x04e1:
            r1 = r0
            goto L_0x04ea
        L_0x04e3:
            r0 = move-exception
        L_0x04e4:
            r1 = r0
            goto L_0x04f4
        L_0x04e6:
            r0 = move-exception
            r17 = r5
            goto L_0x04e1
        L_0x04ea:
            r9 = r11
            r13 = r17
            r11 = r4
            goto L_0x067c
        L_0x04f0:
            r0 = move-exception
            r17 = r5
            goto L_0x04e4
        L_0x04f4:
            r9 = r11
            r13 = r17
            r2 = r23
            r11 = r4
            goto L_0x0650
        L_0x04fc:
            r17 = r5
            goto L_0x050c
        L_0x04ff:
            r0 = move-exception
            r17 = r5
            goto L_0x0613
        L_0x0504:
            r0 = move-exception
            r17 = r5
            goto L_0x04da
        L_0x0508:
            r21 = r2
            r4 = r22
        L_0x050c:
            if (r17 == 0) goto L_0x0518
            r17.close()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r17 = 0
            goto L_0x0518
        L_0x0514:
            r21 = r2
            r4 = r22
        L_0x0518:
            r22 = r4
            r2 = r21
            goto L_0x0343
        L_0x051e:
            r0 = move-exception
            r4 = r22
            goto L_0x04da
        L_0x0522:
            r4 = r22
            r7.clear()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            if (r29 != 0) goto L_0x053c
            di3.d r2 = di3.C86312j.m106911c(r24)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            z51.g r2 = (z51.C39315g) r2     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            com.tencent.mm.storage.w2 r2 = r2.mo58034O6()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            wh3.c r2 = r2.mo57715b()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            com.tencent.mm.storage.emotion.EmojiGroupInfo r2 = r2.mo142023TE(r1)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            goto L_0x053e
        L_0x053c:
            r2 = r29
        L_0x053e:
            r2.mo135607r2(r1)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            if (r3 != 0) goto L_0x054c
            r3 = r26
            r2.mo135605p2(r3)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
        L_0x054c:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r2.mo135603n2(r5)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r3 = 7
            r2.mo135599d(r3)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r3 = 1
            r2.mo135606q2(r3)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r3 = 2
            r2.setType(r3)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.field_recommand = r5     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r2.field_sync = r3     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            int r3 = r8.size()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r2.field_count = r3     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r2.field_idx = r5     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            if (r3 != 0) goto L_0x0577
            r3 = r27
            r2.mo135604o2(r3)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
        L_0x0577:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            if (r3 != 0) goto L_0x0582
            r3 = r28
            r2.mo135602m2(r3)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
        L_0x0582:
            di3.d r3 = di3.C86312j.m106911c(r24)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            z51.g r3 = (z51.C39315g) r3     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            com.tencent.mm.storage.w2 r3 = r3.mo58034O6()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            wh3.g r3 = r3.mo57717d()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            boolean r1 = r3.b00(r8, r1)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            if (r1 == 0) goto L_0x05f4
            di3.d r3 = di3.C86312j.m106911c(r24)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            z51.g r3 = (z51.C39315g) r3     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            com.tencent.mm.storage.w2 r3 = r3.mo58034O6()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            wh3.c r3 = r3.mo57715b()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            boolean r2 = r3.insert(r2)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            java.util.Iterator r3 = r8.iterator()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
        L_0x05ac:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            if (r5 == 0) goto L_0x05da
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            com.tencent.mm.storage.emotion.EmojiInfo r5 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r5     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            r6 = 0
            r5.mo62655c0(r6)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            di3.d r6 = di3.C86312j.m106911c(r24)     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            z51.g r6 = (z51.C39315g) r6     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            zc3.a r6 = r6.mo58035cm()     // Catch:{ Exception -> 0x04d9, all -> 0x0612 }
            i61.h r6 = (i61.C98602h) r6     // Catch:{ Exception -> 0x04d9, all -> 0x05d4 }
            r6.getClass()     // Catch:{ Exception -> 0x04d9, all -> 0x05d4 }
            tk.a r6 = p384tk.C101897a.m134075e()     // Catch:{ Exception -> 0x04d9, all -> 0x05d4 }
            r7 = 1
            r6.mo141394c(r5, r7)     // Catch:{ Exception -> 0x04d9, all -> 0x05d4 }
            goto L_0x05ac
        L_0x05d4:
            r0 = move-exception
            goto L_0x0613
        L_0x05d6:
            r13 = r17
            goto L_0x0335
        L_0x05da:
            java.lang.String r3 = "saveGroupFlag:%b saveEmojiFlag:%b"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r6 = 0
            r5[r6] = r2     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r2 = 1
            r5[r2] = r1     // Catch:{ Exception -> 0x0617, all -> 0x0612 }
            r2 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ Exception -> 0x0610, all -> 0x0612 }
            goto L_0x0606
        L_0x05f4:
            r2 = r23
            java.lang.String r3 = "saveEmojiFlag:%b"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0610, all -> 0x0612 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0610, all -> 0x0612 }
            r5 = 0
            r6[r5] = r1     // Catch:{ Exception -> 0x0610, all -> 0x0612 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r6)     // Catch:{ Exception -> 0x0610, all -> 0x0612 }
        L_0x0606:
            if (r17 == 0) goto L_0x060b
            r17.close()
        L_0x060b:
            r4.close()
            r1 = 1
            return r1
        L_0x0610:
            r0 = move-exception
            goto L_0x0624
        L_0x0612:
            r0 = move-exception
        L_0x0613:
            r1 = r0
            r13 = r17
            goto L_0x062d
        L_0x0617:
            r0 = move-exception
            r2 = r23
            goto L_0x0624
        L_0x061b:
            r0 = move-exception
            r4 = r22
            goto L_0x0613
        L_0x061f:
            r0 = move-exception
            r4 = r22
            r2 = r23
        L_0x0624:
            r1 = r0
            r13 = r17
            goto L_0x0636
        L_0x0628:
            r0 = move-exception
            r4 = r11
            r17 = r13
            goto L_0x0613
        L_0x062d:
            r11 = r4
            r9 = 0
            goto L_0x067c
        L_0x0630:
            r0 = move-exception
            r2 = r3
            r4 = r11
            r17 = r13
            goto L_0x0624
        L_0x0636:
            r11 = r4
            r9 = 0
            goto L_0x0650
        L_0x0639:
            r0 = move-exception
            r4 = r11
            r1 = r0
            r11 = r4
            goto L_0x0647
        L_0x063e:
            r0 = move-exception
            r2 = r3
            r4 = r11
            r1 = r0
            r11 = r4
            goto L_0x064e
        L_0x0644:
            r0 = move-exception
            r1 = r0
            r11 = 0
        L_0x0647:
            r9 = 0
            r13 = 0
            goto L_0x067c
        L_0x064a:
            r0 = move-exception
            r2 = r3
            r1 = r0
            r11 = 0
        L_0x064e:
            r9 = 0
            r13 = 0
        L_0x0650:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x067a }
            r3.<init>()     // Catch:{ all -> 0x067a }
            java.lang.String r4 = "un zip package fail."
            r3.append(r4)     // Catch:{ all -> 0x067a }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x067a }
            r3.append(r1)     // Catch:{ all -> 0x067a }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x067a }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)     // Catch:{ all -> 0x067a }
            if (r9 == 0) goto L_0x066e
            r9.close()
        L_0x066e:
            if (r13 == 0) goto L_0x0673
            r13.close()
        L_0x0673:
            if (r11 == 0) goto L_0x0678
            r11.close()
        L_0x0678:
            r1 = 0
            return r1
        L_0x067a:
            r0 = move-exception
            r1 = r0
        L_0x067c:
            if (r9 == 0) goto L_0x0681
            r9.close()
        L_0x0681:
            if (r13 == 0) goto L_0x0686
            r13.close()
        L_0x0686:
            if (r11 == 0) goto L_0x068b
            r11.close()
        L_0x068b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117491v(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.storage.emotion.EmojiGroupInfo):boolean");
    }
}
