package kv1;

import a11.C39479c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import k20.C9556a;
import p749xh.C38595k2;
import z51.C79305f;

/* renamed from: kv1.g */
public class C99251g {

    /* renamed from: a */
    public static final HashMap<String, String> f291026a = new HashMap<>();

    /* renamed from: b */
    public static String[] f291027b = {"wxid_", "wx_", "gh_"};

    /* renamed from: a */
    public static final String m129280a(String str) {
        if (str == null) {
            return null;
        }
        return C99255j.m129319c(((C79305f) C86312j.m106911c(C79305f.class)).mo109313YP(str.trim(), " "));
    }

    /* renamed from: b */
    public static int m129281b(int[] iArr, int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = i >= iArr.length ? Integer.MAX_VALUE : iArr[i];
        if (i2 < iArr.length) {
            i3 = iArr[i2];
        }
        return i4 - i3;
    }

    /* renamed from: c */
    public static List<String> m129282c() {
        SingleTable singleTable = C38595k2.f102753n;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList.add(C38595k2.f102756q);
        ISqlCondition and = C38595k2.f102754o.equal((Number) 131075).and(C38595k2.f102755p.equal((Number) 38));
        linkedList2.add(C38595k2.f102757r.orderDesc());
        List<C38595k2> multiQuery = C38595k2.f102753n.select((List<? extends ISqlColumn>) linkedList).where(and).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(((C93834f) ((C99260q) C86312j.m106911c(C99260q.class)).mo128742JS()).mo128795l(), C38595k2.class);
        LinkedList linkedList4 = new LinkedList();
        for (C38595k2 l2 : multiQuery) {
            linkedList4.add(l2.mo61727l2());
        }
        return linkedList4;
    }

    /* renamed from: d */
    public static String m129283d(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null) {
            return str;
        }
        if (!Util.isNullOrNil(z1Var.mo73969n2())) {
            return z1Var.mo73969n2();
        }
        if (!Util.isNullOrNil(z1Var.getNickname())) {
            return z1Var.mo62909j3();
        }
        if (C72996z1.m85820U5(z1Var.getUsername())) {
            String displayName = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).getDisplayName(str);
            if (!Util.isNullOrNil(displayName)) {
                return displayName;
            }
        }
        return z1Var.getUsername();
    }

    /* renamed from: e */
    public static String m129284e(String str) {
        C72996z1 z1Var;
        return (!C72996z1.m85820U5(str) && (z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str)) != null) ? !Util.isNullOrNil(z1Var.mo73970o2()) ? z1Var.mo73970o2() : !Util.isNullOrNil(z1Var.mo62945z2()) ? z1Var.mo62945z2() : !Util.isNullOrNil(z1Var.mo62913l2()) ? z1Var.mo62913l2() : str : str;
    }

    /* renamed from: f */
    public static String m129285f(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        for (String startsWith : f291027b) {
            if (str.startsWith(startsWith)) {
                return null;
            }
        }
        if (str.indexOf(64) >= 0) {
            return null;
        }
        return str;
    }

    /* renamed from: g */
    public static long m129286g(int i) {
        return m129287h(System.currentTimeMillis() + "_" + C86709a0.m107523b().mo121111i() + "_" + i);
    }

    /* renamed from: h */
    public static long m129287h(String str) {
        try {
            char[] charArray = "0123456789ABCDEF".toCharArray();
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            char[] cArr = new char[(digest.length * 2)];
            for (int i = 0; i < digest.length; i++) {
                byte b = digest[i] & ExifInterface.MARKER;
                int i2 = i * 2;
                cArr[i2] = charArray[b >>> 4];
                cArr[i2 + 1] = charArray[b & 15];
            }
            return new BigInteger(new String(cArr), 16).longValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FTS.FTSApiLogic", e, "getMd5UInt", new Object[0]);
            return 0;
        }
    }

    /* renamed from: i */
    public static String m129288i(String str, boolean z) {
        if (str == null) {
            return null;
        }
        String lowerCase = m129280a(str).toLowerCase();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (int i = 0; i < lowerCase.length(); i++) {
            char charAt = lowerCase.charAt(i);
            if (C99255j.m129317a(charAt)) {
                String[] strArr = C99255j.f291049l.get(String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() < 1) {
                    arrayList.add(" ");
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        String substring = z ? strArr[i2].substring(0, 1) : strArr[i2];
                        if (!arrayList2.contains(substring)) {
                            arrayList2.add(substring);
                        }
                    }
                    arrayList.add(Util.listToString(arrayList2, "‏"));
                    z2 = true;
                }
            } else {
                arrayList.add(" ");
            }
        }
        if (z2) {
            return Util.listToString(arrayList, "‍");
        }
        return null;
    }

    /* renamed from: j */
    public static String m129289j(String str) {
        if (str == null) {
            return null;
        }
        String replace = m129280a(str).replace(" ", "");
        String upperCase = replace.toUpperCase();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < upperCase.length() && i < replace.length()) {
            char charAt = upperCase.charAt(i);
            char charAt2 = replace.charAt(i);
            boolean z = true;
            if (C99255j.m129317a(charAt)) {
                String[] strArr = C99255j.f291049l.get(String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() < 1) {
                    if ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < '0' || charAt2 > '9'))) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(charAt2 + "");
                    } else {
                        arrayList.add("");
                    }
                } else {
                    arrayList.add(strArr[0].toUpperCase());
                }
            } else {
                if ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < '0' || charAt2 > '9'))) {
                    z = false;
                }
                if (z) {
                    arrayList.add(charAt2 + "");
                } else {
                    arrayList.add("");
                }
            }
            i++;
        }
        return Util.listToString(arrayList, "").toUpperCase(Locale.getDefault());
    }

    /* renamed from: k */
    public static String m129290k(int i) {
        return C99252h.m129298c(m129287h(System.currentTimeMillis() + "_" + C86709a0.m107523b().mo121111i() + "_" + i));
    }

    /* renamed from: l */
    public static String m129291l(int[] iArr) {
        StringBuilder sb = new StringBuilder(32);
        sb.append('(');
        for (int append : iArr) {
            sb.append(append);
            sb.append(',');
        }
        sb.setCharAt(sb.length() - 1, ')');
        return sb.toString();
    }

    /* renamed from: m */
    public static boolean m129292m(String str) {
        return str != null && str.length() < 20 && str.matches("^[0-9]+$");
    }

    /* renamed from: n */
    public static boolean m129293n(String str) {
        return str != null && str.length() < 20 && str.matches("^[A-Za-z][A-Za-z0-9\\-_]+$");
    }

    /* renamed from: o */
    public static final String m129294o(String str) {
        if (str != null) {
            return str.replace('*', ' ').trim();
        }
        return null;
    }

    /* renamed from: p */
    public static void m129295p(Context context, String str, Intent intent) {
        if (intent == null) {
            try {
                intent = new Intent();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", e);
                return;
            }
        }
        String str2 = MMApplicationContext.getSourcePackageName() + ".plugin.fts";
        if (str.startsWith(".")) {
            str = str2 + str;
        }
        intent.setClassName(MMApplicationContext.getPackageName(), str);
        Class.forName(str, false, context.getClassLoader());
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
