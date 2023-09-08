package i22;

import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import java.util.HashMap;

/* renamed from: i22.b */
public class C8846b {

    /* renamed from: a */
    public static int f28073a;

    /* renamed from: b */
    public static HashMap<Integer, C4770c> f28074b = new HashMap<>();

    /* renamed from: c */
    public static int f28075c = 0;

    /* renamed from: d */
    public static HashMap<Integer, C4770c> f28076d = new HashMap<>();

    /* renamed from: e */
    public static int f28077e = 0;

    /* renamed from: f */
    public static HashMap<Integer, C4770c> f28078f = new HashMap<>();

    /* renamed from: g */
    public static int f28079g = 0;

    /* renamed from: h */
    public static HashMap<Integer, C4770c> f28080h = new HashMap<>();

    /* renamed from: i */
    public static int f28081i = 0;

    /* renamed from: j */
    public static HashMap<Integer, C4770c> f28082j = new HashMap<>();

    /* renamed from: k */
    public static int f28083k = 0;

    /* renamed from: l */
    public static HashMap<Integer, C4770c> f28084l = new HashMap<>();

    /* renamed from: m */
    public static int f28085m = 0;

    /* renamed from: n */
    public static HashMap<Integer, C4770c> f28086n = new HashMap<>();

    /* renamed from: o */
    public static int f28087o = 0;

    /* renamed from: p */
    public static HashMap<Integer, C4770c> f28088p = new HashMap<>();

    /* renamed from: q */
    public static int f28089q = 0;

    /* renamed from: r */
    public static HashMap<Integer, C4770c> f28090r = new HashMap<>();

    /* renamed from: s */
    public static int f28091s = 0;

    /* renamed from: t */
    public static HashMap<Integer, C4770c> f28092t = new HashMap<>();

    /* renamed from: u */
    public static int f28093u = 0;

    /* renamed from: v */
    public static HashMap<Integer, C4770c> f28094v = new HashMap<>();

    /* renamed from: w */
    public static int f28095w = 0;

    /* renamed from: x */
    public static HashMap<Integer, C4770c> f28096x = new HashMap<>();

    /* renamed from: a */
    public static void m8674a(int i, boolean z) {
        C4770c cVar = f28082j.get(Integer.valueOf(i));
        if (cVar != null) {
            cVar.mo5683k(z);
            f28082j.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public static void m8675b(int i, boolean z) {
        C4770c cVar = f28084l.get(Integer.valueOf(i));
        if (cVar != null) {
            cVar.mo5684l(z);
            f28084l.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public static void m8676c(int i, int i2, int i3, Intent intent) {
        C4770c cVar = f28074b.get(Integer.valueOf(i));
        if (cVar != null) {
            cVar.mo5688p(i2, i3, intent);
            f28074b.remove(Integer.valueOf(i));
        }
    }
}
