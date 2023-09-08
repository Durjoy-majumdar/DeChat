package b03;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StatusIconConfigUpdateEvent;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import gz2.C46003b;
import gz2.C98293d;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C9493c;
import k60.C60979d;
import l60.C99344b;
import lc3.C10485b;
import lz2.C46922e;
import o40.C61926c;
import p823sg.C90193h;
import qe3.C89625d;
import qy2.C63347a;
import qz2.C12938b;
import qz2.C12939c;
import qz2.C36226f;
import qz2.C47914d;
import qz2.C47915e;
import r60.C101350i;
import rx3.C13598b0;
import rz2.C48201c;
import su0.C13781a;
import sx3.C64197v;
import sx3.C77813z;
import t60.C64207e;
import ux3.C65486b;
import uz2.C52669b0;
import uz2.C52676d1;
import uz2.C52678e0;
import uz2.C52679e1;
import uz2.C52681f1;
import uz2.C52683g1;
import uz2.C52699m0;
import uz2.C52701n0;
import uz2.C52716t0;
import uz2.C52722w;
import uz2.C52725x;
import x60.C102564a;
import y04.C66488v;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import zf3.C112623b;

/* renamed from: b03.j */
public final class C39707j extends C39691c {

    /* renamed from: a */
    public static final C39707j f106537a = new C39707j();

    /* renamed from: b */
    public static Long f106538b;

    /* renamed from: c */
    public static String f106539c;

    /* renamed from: d */
    public static C52716t0 f106540d;

    /* renamed from: e */
    public static C52679e1 f106541e = new C52679e1();

    /* renamed from: f */
    public static C52699m0 f106542f = new C52699m0();

    /* renamed from: g */
    public static C52669b0 f106543g = new C52669b0();

    /* renamed from: h */
    public static int f106544h;

    /* renamed from: i */
    public static LinkedList<C52679e1> f106545i = new LinkedList<>();

    /* renamed from: b03.j$a */
    public /* synthetic */ class C39708a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f106546a;

        static {
            int[] iArr = new int[C63347a.C47892c.values().length];
            iArr[8] = 1;
            iArr[7] = 2;
            f106546a = iArr;
        }
    }

    /* renamed from: b03.j$b */
    public static final class C39709b<T> implements Comparator {
        public final int compare(T t, T t2) {
            C52676d1 d1Var = (C52676d1) t;
            C87412m.m108593f(d1Var, LocaleUtil.ITALIAN);
            C52725x e = C39713l.m42500e(d1Var, true);
            int i = 0;
            Integer valueOf = Integer.valueOf(e != null ? e.f147288n : 0);
            C52676d1 d1Var2 = (C52676d1) t2;
            C87412m.m108593f(d1Var2, LocaleUtil.ITALIAN);
            C52725x e2 = C39713l.m42500e(d1Var2, true);
            if (e2 != null) {
                i = e2.f147288n;
            }
            return C65486b.m77169a(valueOf, Integer.valueOf(i));
        }
    }

    /* renamed from: b03.j$c */
    public static final class C39710c<T> implements Comparator {
        public final int compare(T t, T t2) {
            C52676d1 d1Var = (C52676d1) t;
            C87412m.m108593f(d1Var, LocaleUtil.ITALIAN);
            C52725x e = C39713l.m42500e(d1Var, true);
            int i = 0;
            Integer valueOf = Integer.valueOf(e != null ? e.f147288n : 0);
            C52676d1 d1Var2 = (C52676d1) t2;
            C87412m.m108593f(d1Var2, LocaleUtil.ITALIAN);
            C52725x e2 = C39713l.m42500e(d1Var2, true);
            if (e2 != null) {
                i = e2.f147288n;
            }
            return C65486b.m77169a(valueOf, Integer.valueOf(i));
        }
    }

    /* renamed from: b03.j$d */
    public static final class C39711d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52716t0 f106547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39711d(C52716t0 t0Var) {
            super(0);
            this.f106547d = t0Var;
        }

        public Object invoke() {
            C39707j jVar = C39707j.f106537a;
            jVar.mo62307s(this.f106547d, (C46922e) null);
            jVar.mo62306r(this.f106547d);
            jVar.mo62304p(this.f106547d);
            jVar.mo62305q(this.f106547d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b03.j$e */
    public static final class C39712e<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f106548a;

        public C39712e(C32226l<? super Bitmap, C13598b0> lVar) {
            this.f106548a = lVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C28226k(this.f106548a, (Bitmap) obj));
        }
    }

    /* renamed from: A */
    public boolean mo62271A() {
        if (mo62311w() || mo62312x() || mo62310v()) {
            return true;
        }
        return mo62272B();
    }

    /* renamed from: B */
    public boolean mo62272B() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_status_expt_custom_status_switch_and, C104160f.RepairerConfig_TextStatus_CustomStatusSwitch_Int, 0) == 1;
    }

    /* renamed from: C */
    public boolean mo62273C() {
        return !mo62278H() && !mo62275E() && !mo62277G() && !mo62274D();
    }

    /* renamed from: D */
    public boolean mo62274D() {
        return mo62340Y() == 5 && (mo62339X() & 32) == 0;
    }

    /* renamed from: E */
    public boolean mo62275E() {
        return mo62340Y() == 3 && (mo62339X() & 8) == 0;
    }

    /* renamed from: F */
    public boolean mo62276F() {
        return mo62278H() || mo62275E() || mo62277G();
    }

    /* renamed from: G */
    public boolean mo62277G() {
        return mo62340Y() == 2 && (mo62339X() & 4) == 0;
    }

    /* renamed from: H */
    public boolean mo62278H() {
        return mo62340Y() == 1 && (mo62339X() & 2) == 0;
    }

    /* renamed from: I */
    public boolean mo62279I() {
        if (!mo62278H()) {
            return mo62340Y() == 4 && (mo62339X() & 16) == 0;
        }
    }

    /* renamed from: J */
    public boolean mo62280J(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String d = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107406d(new C112623b());
        Log.m105918d("MicroMsg.TextStatus.StatusIconHelperV2", "isValidLuckyMoneyIconId() called with: iconId = " + str + " str:" + d);
        C87412m.m108593f(d, "str");
        Iterator it = ((C66488v) C112550d0.m153786V(d, new char[]{','}, false, 0, 6, (Object) null)).iterator();
        int i = 0;
        while (true) {
            C66488v.C66489a aVar = (C66488v.C66489a) it;
            if (!aVar.hasNext()) {
                i = -1;
                break;
            }
            Object next = aVar.next();
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (C87412m.m108589b(str, next)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8 A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f9 A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0155 A[Catch:{ all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0172 A[Catch:{ all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0173 A[Catch:{ all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d5 A[Catch:{ all -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef A[Catch:{ all -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f5 A[Catch:{ all -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62281K() {
        /*
            r12 = this;
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            java.lang.String r1 = "username()"
            java.lang.String r2 = "textstatus/"
            r3 = 0
            r4 = -1
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r6.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r7 = a70.C112760b.m154225d()     // Catch:{ all -> 0x003e }
            r6.append(r7)     // Catch:{ all -> 0x003e }
            r6.append(r2)     // Catch:{ all -> 0x003e }
            java.lang.String r7 = su0.C13781a.m13082a()     // Catch:{ all -> 0x003e }
            gy3.C87412m.m108593f(r7, r1)     // Catch:{ all -> 0x003e }
            java.nio.charset.Charset r8 = z04.C119027c.f356488a     // Catch:{ all -> 0x003e }
            byte[] r7 = r7.getBytes(r8)     // Catch:{ all -> 0x003e }
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ all -> 0x003e }
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)     // Catch:{ all -> 0x003e }
            r6.append(r7)     // Catch:{ all -> 0x003e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x003e }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)     // Catch:{ all -> 0x003e }
            if (r7 != 0) goto L_0x0040
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x003e:
            goto L_0x0061
        L_0x0040:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r7.<init>()     // Catch:{ all -> 0x003e }
            r7.append(r6)     // Catch:{ all -> 0x003e }
            java.lang.String r6 = "/icon.cfg"
            r7.append(r6)     // Catch:{ all -> 0x003e }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x003e }
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r6, r3, r4)     // Catch:{ all -> 0x003e }
            if (r6 != 0) goto L_0x0058
            goto L_0x0061
        L_0x0058:
            uz2.e1 r7 = new uz2.e1     // Catch:{ all -> 0x003e }
            r7.<init>()     // Catch:{ all -> 0x003e }
            r7.parseFrom(r6)     // Catch:{ all -> 0x003e }
            goto L_0x0062
        L_0x0061:
            r7 = r5
        L_0x0062:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "getConfigFromLocal isFromfile:"
            r6.append(r8)
            r8 = 1
            if (r7 == 0) goto L_0x0071
            r9 = 1
            goto L_0x0072
        L_0x0071:
            r9 = 0
        L_0x0072:
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "MicroMsg.TextStatus.StatusIconHelperV2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            if (r7 != 0) goto L_0x00a9
            java.lang.String r6 = "assets:///text_status_config/icon.cfg"
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r6, r3, r4)     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x0093
            java.lang.String r6 = "getConfigFromAsset data null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r6)     // Catch:{ all -> 0x009c }
            uz2.e1 r7 = new uz2.e1     // Catch:{ all -> 0x009c }
            r7.<init>()     // Catch:{ all -> 0x009c }
            goto L_0x00a9
        L_0x0093:
            uz2.e1 r7 = new uz2.e1     // Catch:{ all -> 0x009c }
            r7.<init>()     // Catch:{ all -> 0x009c }
            r7.parseFrom(r6)     // Catch:{ all -> 0x009c }
            goto L_0x00a9
        L_0x009c:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r10 = "getConfigFromAsset err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r6, r10, r7)
            uz2.e1 r7 = new uz2.e1
            r7.<init>()
        L_0x00a9:
            f106541e = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r6.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r7 = a70.C112760b.m154225d()     // Catch:{ all -> 0x00df }
            r6.append(r7)     // Catch:{ all -> 0x00df }
            r6.append(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r7 = su0.C13781a.m13082a()     // Catch:{ all -> 0x00df }
            gy3.C87412m.m108593f(r7, r1)     // Catch:{ all -> 0x00df }
            java.nio.charset.Charset r10 = z04.C119027c.f356488a     // Catch:{ all -> 0x00df }
            byte[] r7 = r7.getBytes(r10)     // Catch:{ all -> 0x00df }
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ all -> 0x00df }
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)     // Catch:{ all -> 0x00df }
            r6.append(r7)     // Catch:{ all -> 0x00df }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00df }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)     // Catch:{ all -> 0x00df }
            if (r7 != 0) goto L_0x00e1
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)     // Catch:{ all -> 0x00df }
            goto L_0x00e1
        L_0x00df:
            goto L_0x0102
        L_0x00e1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r7.<init>()     // Catch:{ all -> 0x00df }
            r7.append(r6)     // Catch:{ all -> 0x00df }
            java.lang.String r6 = "/cover.cfg"
            r7.append(r6)     // Catch:{ all -> 0x00df }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00df }
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r6, r3, r4)     // Catch:{ all -> 0x00df }
            if (r6 != 0) goto L_0x00f9
            goto L_0x0102
        L_0x00f9:
            uz2.m0 r7 = new uz2.m0     // Catch:{ all -> 0x00df }
            r7.<init>()     // Catch:{ all -> 0x00df }
            r7.parseFrom(r6)     // Catch:{ all -> 0x00df }
            goto L_0x0103
        L_0x0102:
            r7 = r5
        L_0x0103:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "getCoverAgendaFromLocal isFromfile:"
            r6.append(r10)
            if (r7 == 0) goto L_0x0111
            r10 = 1
            goto L_0x0112
        L_0x0111:
            r10 = 0
        L_0x0112:
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            if (r7 != 0) goto L_0x0123
            uz2.m0 r7 = new uz2.m0
            r7.<init>()
        L_0x0123:
            f106542f = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r6.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = a70.C112760b.m154225d()     // Catch:{ all -> 0x0159 }
            r6.append(r7)     // Catch:{ all -> 0x0159 }
            r6.append(r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = su0.C13781a.m13082a()     // Catch:{ all -> 0x0159 }
            gy3.C87412m.m108593f(r7, r1)     // Catch:{ all -> 0x0159 }
            java.nio.charset.Charset r10 = z04.C119027c.f356488a     // Catch:{ all -> 0x0159 }
            byte[] r7 = r7.getBytes(r10)     // Catch:{ all -> 0x0159 }
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)     // Catch:{ all -> 0x0159 }
            r6.append(r7)     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0159 }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)     // Catch:{ all -> 0x0159 }
            if (r7 != 0) goto L_0x015b
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)     // Catch:{ all -> 0x0159 }
            goto L_0x015b
        L_0x0159:
            goto L_0x017c
        L_0x015b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r7.<init>()     // Catch:{ all -> 0x0159 }
            r7.append(r6)     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = "/kvconfig.cfg"
            r7.append(r6)     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0159 }
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r6, r3, r4)     // Catch:{ all -> 0x0159 }
            if (r6 != 0) goto L_0x0173
            goto L_0x017c
        L_0x0173:
            uz2.b0 r7 = new uz2.b0     // Catch:{ all -> 0x0159 }
            r7.<init>()     // Catch:{ all -> 0x0159 }
            r7.parseFrom(r6)     // Catch:{ all -> 0x0159 }
            goto L_0x017d
        L_0x017c:
            r7 = r5
        L_0x017d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "getKeyValueConfigFromLocal isFromfile:"
            r6.append(r10)
            if (r7 == 0) goto L_0x018b
            r10 = 1
            goto L_0x018c
        L_0x018b:
            r10 = 0
        L_0x018c:
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            if (r7 != 0) goto L_0x019d
            uz2.b0 r7 = new uz2.b0
            r7.<init>()
        L_0x019d:
            f106543g = r7
            int r6 = r12.mo62338W(r7)
            f106544h = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x021b }
            r6.<init>()     // Catch:{ all -> 0x021b }
            java.lang.String r7 = a70.C112760b.m154225d()     // Catch:{ all -> 0x021b }
            r6.append(r7)     // Catch:{ all -> 0x021b }
            r6.append(r2)     // Catch:{ all -> 0x021b }
            java.lang.String r2 = su0.C13781a.m13082a()     // Catch:{ all -> 0x021b }
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x021b }
            java.nio.charset.Charset r1 = z04.C119027c.f356488a     // Catch:{ all -> 0x021b }
            byte[] r1 = r2.getBytes(r1)     // Catch:{ all -> 0x021b }
            gy3.C87412m.m108593f(r1, r0)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = p823sg.C90193h.m112878f(r1)     // Catch:{ all -> 0x021b }
            r6.append(r0)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x021b }
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x021b }
            if (r1 != 0) goto L_0x01d8
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ all -> 0x021b }
        L_0x01d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021b }
            r1.<init>()     // Catch:{ all -> 0x021b }
            r1.append(r0)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "/iconConfigListPath.cfg"
            r1.append(r0)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021b }
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r3, r4)     // Catch:{ all -> 0x021b }
            if (r0 != 0) goto L_0x01f5
            java.lang.String r0 = "getIconConfigListFromFile: buffer is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)     // Catch:{ all -> 0x021b }
            goto L_0x0223
        L_0x01f5:
            uz2.i r1 = new uz2.i     // Catch:{ all -> 0x021b }
            r1.<init>()     // Catch:{ all -> 0x021b }
            r1.parseFrom(r0)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "getIconConfigListFromFile: %s"
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x021b }
            java.util.LinkedList<uz2.e1> r4 = r1.f147135d     // Catch:{ all -> 0x021b }
            if (r4 == 0) goto L_0x020e
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x021b }
            if (r4 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            r4 = 0
            goto L_0x020f
        L_0x020e:
            r4 = 1
        L_0x020f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x021b }
            r2[r3] = r4     // Catch:{ all -> 0x021b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r2)     // Catch:{ all -> 0x021b }
            java.util.LinkedList<uz2.e1> r5 = r1.f147135d     // Catch:{ all -> 0x021b }
            goto L_0x0223
        L_0x021b:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "getIconConfigListFromFile"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r2, r1)
        L_0x0223:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getIconConfigList isFromfile:"
            r0.append(r1)
            if (r5 == 0) goto L_0x0231
            r1 = 1
            goto L_0x0232
        L_0x0231:
            r1 = 0
        L_0x0232:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            if (r5 != 0) goto L_0x0243
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
        L_0x0243:
            f106545i = r5
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_COVER_AGENDA_LAST_CLICK_TIME_LONG
            r4 = 0
            long r0 = r0.mo119673G(r1, r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            f106538b = r0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_REQ_ICON_CONFIG_LONG
            long r0 = r0.mo119673G(r1, r4)
            long r4 = eb0.C31543z5.m39451a()
            long r6 = r4 - r0
            long r6 = java.lang.Math.abs(r6)
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x027b
            r3 = 1
        L_0x027b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "initIconConfig lrt:"
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = " ct:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " dt:"
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = " version:"
            r2.append(r0)
            int r0 = qe3.C89625d.f257841g
            r2.append(r0)
            java.lang.String r0 = " isReq:"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " content:"
            r2.append(r0)
            uz2.e1 r0 = f106541e
            java.lang.String r0 = b03.C39713l.m42507l(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            if (r3 == 0) goto L_0x02c9
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.mo62284N(r0)
        L_0x02c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62281K():void");
    }

    /* renamed from: L */
    public void mo62282L() {
    }

    /* renamed from: N */
    public void mo62284N(Integer num) {
        int i = 0;
        boolean z = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_INT, 0) != C89625d.f257841g;
        boolean z2 = z || C79758p.f233760a.mo109882e(C104160f.RepairerConfig_TextStatus_PullNewConfigSwitch_Int, 0) == 1;
        long j = 0;
        long j2 = z2 ? 0 : f106541e.f147101d;
        long j3 = z2 ? 0 : f106542f.f147161d;
        long j4 = z2 ? 0 : f106543g.f147060d;
        if (!z2) {
            j = mo62290b().f147101d;
        }
        if (num != null && num.intValue() == 1) {
            i = 5;
        } else if (z) {
            i = 2;
        } else if (num != null && num.intValue() == 2) {
            i = 16;
        } else if (num != null && num.intValue() == 3) {
            i = 8;
        }
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "[reqNewestIconConfig] key:" + j2 + " coverAgendaKey:" + j3 + " keyValueConfigKey:" + j4 + " appbrandConfigKey:" + j + " flag:" + i + " isClientVersionChange:" + z);
        C86709a0.m107524d().mo123460f(new C46922e(j2, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j), Integer.valueOf(i)));
    }

    /* renamed from: O */
    public void mo62285O(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar) {
        C52725x a;
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        if (!IStatusIconHelperKt.m39109a().mo62278H()) {
            if (IStatusIconHelperKt.m39109a().mo62278H()) {
                str = "1080";
            }
            C39694d U = mo62336U(imageView, str, dVar, bVar, cVar, false);
            if (U != null && (a = U.mo62316a()) != null) {
                U.mo62317b(a.f147290p, C39713l.m42505j(a));
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: P */
    public void mo62286P(long j) {
        f106538b = Long.valueOf(j);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_COVER_AGENDA_LAST_CLICK_TIME_LONG, Long.valueOf(j));
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "setCoverAgendaClickTime:  clickTime:" + j);
    }

    /* renamed from: Q */
    public void mo62287Q(String str) {
        C87412m.m108594g(str, "iconId");
        f106539c = str;
    }

    /* renamed from: R */
    public void mo62288R(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar, boolean z, boolean z2) {
        C52725x a;
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        if (IStatusIconHelperKt.m39109a().mo62278H() && !z) {
            str = "1080";
        }
        C39694d U = mo62336U(imageView, str, dVar, bVar, cVar, z2);
        if (U != null && (a = U.mo62316a()) != null) {
            U.mo62317b(a.f147281d, C39713l.m42505j(a));
        }
    }

    /* renamed from: T */
    public final void mo62335T(C52676d1 d1Var, String str, List<? extends C52683g1> list) {
        for (C52683g1 g1Var : list) {
            if (C87412m.m108589b(g1Var.f147110d.f147106d, str)) {
                g1Var.f147111e.add(d1Var);
            }
        }
    }

    /* renamed from: U */
    public final C39694d mo62336U(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar, boolean z) {
        if ((str == null || C112551y.m153811k(str)) || imageView == null) {
            return null;
        }
        return new C39694d(imageView, mo62298j(str), dVar, bVar, cVar, z);
    }

    /* renamed from: V */
    public final C52679e1 mo62337V(LinkedList<C52679e1> linkedList) {
        if (!(linkedList == null || linkedList.isEmpty())) {
            for (C52679e1 e1Var : linkedList) {
                Log.m105919d("MicroMsg.TextStatus.StatusIconHelperV2", "getAppBrandPanelConfig:  configId:%s key:%s", e1Var.f147102e, Long.valueOf(e1Var.f147101d));
                String str = e1Var.f147102e;
                if (str != null && str.equals("weapp_panel")) {
                    return e1Var;
                }
            }
        }
        Log.m105929w("MicroMsg.TextStatus.StatusIconHelperV2", "getAppBrandPanelConfig: can't find right config ,return curConfig. iconConfigs.size:%s", Integer.valueOf(linkedList.size()));
        return new C52679e1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x003c A[EDGE_INSN: B:41:0x003c->B:10:0x003c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo62338W(uz2.C52669b0 r4) {
        /*
            r3 = this;
            java.util.LinkedList<uz2.c0> r4 = r4.f147061e
            if (r4 == 0) goto L_0x003c
            java.util.Iterator r4 = r4.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.next()
            uz2.c0 r0 = (uz2.C52672c0) r0
            java.lang.String r1 = r0.f147065d
            java.lang.String r2 = "textstatus_post_explore_param_202207"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = r0.f147065d
            java.lang.String r2 = "textstatus_customtitle_expt_param_202208"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0008
        L_0x0028:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r0.f147065d
            r4.append(r1)
            java.lang.String r0 = r0.f147066e
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r0 = 0
            if (r4 == 0) goto L_0x00aa
            int r1 = r4.hashCode()
            switch(r1) {
                case -1576802596: goto L_0x009f;
                case -1025813249: goto L_0x0093;
                case -682472626: goto L_0x0087;
                case -231679503: goto L_0x007b;
                case 406916073: goto L_0x006f;
                case 622069136: goto L_0x0063;
                case 1136985625: goto L_0x0055;
                case 1406151676: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x00aa
        L_0x0049:
            java.lang.String r1 = "textstatus_customtitle_expt_param_202208fullscreen_title"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0052
            goto L_0x00aa
        L_0x0052:
            r4 = 7
            r0 = 7
            goto L_0x00aa
        L_0x0055:
            java.lang.String r1 = "textstatus_customtitle_expt_param_202208default"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x005e
            goto L_0x00aa
        L_0x005e:
            r4 = 8
            r0 = 8
            goto L_0x00aa
        L_0x0063:
            java.lang.String r1 = "textstatus_post_explore_param_202207expt_browse"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x006c
            goto L_0x00aa
        L_0x006c:
            r4 = 4
            r0 = 4
            goto L_0x00aa
        L_0x006f:
            java.lang.String r1 = "textstatus_post_explore_param_202207expt_legacy_icon"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0078
            goto L_0x00aa
        L_0x0078:
            r4 = 2
            r0 = 2
            goto L_0x00aa
        L_0x007b:
            java.lang.String r1 = "textstatus_post_explore_param_202207expt_no_icon"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0084
            goto L_0x00aa
        L_0x0084:
            r4 = 1
            r0 = 1
            goto L_0x00aa
        L_0x0087:
            java.lang.String r1 = "textstatus_post_explore_param_202207expt_emoji_or_smiley"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0090
            goto L_0x00aa
        L_0x0090:
            r4 = 3
            r0 = 3
            goto L_0x00aa
        L_0x0093:
            java.lang.String r1 = "textstatus_post_explore_param_202207default"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            r4 = 5
            r0 = 5
            goto L_0x00aa
        L_0x009f:
            java.lang.String r1 = "textstatus_customtitle_expt_param_202208fullscreen_title_icon"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r4 = 6
            r0 = 6
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62338W(uz2.b0):int");
    }

    /* renamed from: X */
    public final int mo62339X() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_text_status_expt_and, 0);
        Log.m105925i("MicroMsg.TextStatus.StatusIconHelperV2", "getExptExtraSwitch: result:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: Y */
    public final int mo62340Y() {
        C79758p pVar = C79758p.f233760a;
        return pVar.mo109882e(C104160f.RepairerConfig_TextStatus_ExptSwitch_Int, 0) != 0 ? pVar.mo109882e(C104160f.RepairerConfig_TextStatus_EditorDemo_Int, 0) : f106544h;
    }

    /* renamed from: Z */
    public final void mo62341Z(String str, C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(lVar, "callback");
        if (C112551y.m153811k(str)) {
            lVar.invoke(null);
            return;
        }
        C60979d<C46003b> dVar = C98293d.f288116a;
        C99344b<C46003b, Bitmap> a = C98293d.f288116a.mo85955a(new C46003b(str));
        C39712e eVar = new C39712e(lVar);
        a.getClass();
        a.f291320d = eVar;
        a.mo85953c();
    }

    /* renamed from: a */
    public boolean mo62289a(String str) {
        if (str == null) {
            return false;
        }
        if (!C87412m.m108589b(str, "userdefine")) {
            C52676d1 j = f106537a.mo62298j(str);
            return 1 == (j != null ? j.f147085h : 0);
        }
    }

    /* renamed from: b */
    public C52679e1 mo62290b() {
        return mo62337V(f106545i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        if (r6 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007c, code lost:
        if (r6 != null) goto L_0x007f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62291c(uz2.C52678e0 r6, int r7, java.lang.String r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r8 = ""
            if (r6 != 0) goto L_0x000a
            return r8
        L_0x000a:
            rz2.a r0 = rz2.C48198a.f129173a
            int r0 = r0.mo72932a()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0015
            goto L_0x0041
        L_0x0015:
            uz2.q r0 = rz2.C48200b.m53531d(r6)
            if (r0 == 0) goto L_0x0041
            if (r9 == r2) goto L_0x0031
            if (r9 == r1) goto L_0x0020
            goto L_0x0041
        L_0x0020:
            uz2.x r0 = b03.C39713l.m42502g(r0)
            if (r0 == 0) goto L_0x0041
            java.util.LinkedList<uz2.w> r0 = r0.f147289o
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = b03.C39713l.m42497b(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0041
        L_0x0031:
            uz2.x r0 = b03.C39713l.m42502g(r0)
            if (r0 == 0) goto L_0x0041
            java.util.LinkedList<uz2.w> r0 = r0.f147284g
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = b03.C39713l.m42497b(r0)
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r0 = r8
        L_0x0042:
            boolean r3 = z04.C112551y.m153811k(r0)
            r4 = 0
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 != 0) goto L_0x004f
            goto L_0x0082
        L_0x004f:
            java.lang.String r6 = r6.f147088e
            uz2.d1 r6 = r5.mo62298j(r6)
            if (r6 == 0) goto L_0x0081
            if (r9 == r2) goto L_0x006e
            if (r9 == r1) goto L_0x005d
            r0 = r8
            goto L_0x0082
        L_0x005d:
            uz2.x r6 = b03.C39713l.m42503h(r6)
            if (r6 == 0) goto L_0x007e
            java.util.LinkedList<uz2.w> r6 = r6.f147289o
            if (r6 == 0) goto L_0x007e
            java.lang.String r6 = b03.C39713l.m42497b(r6)
            if (r6 != 0) goto L_0x007f
            goto L_0x007e
        L_0x006e:
            uz2.x r6 = b03.C39713l.m42503h(r6)
            if (r6 == 0) goto L_0x007e
            java.util.LinkedList<uz2.w> r6 = r6.f147284g
            if (r6 == 0) goto L_0x007e
            java.lang.String r6 = b03.C39713l.m42497b(r6)
            if (r6 != 0) goto L_0x007f
        L_0x007e:
            r6 = r8
        L_0x007f:
            r0 = r6
            goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r0 != 0) goto L_0x0085
            r0 = r8
        L_0x0085:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x009c }
            r6[r4] = r7     // Catch:{ all -> 0x009c }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)     // Catch:{ all -> 0x009c }
            java.lang.String r6 = java.lang.String.format(r0, r6)     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "format(format, *args)"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x009c }
            r8 = r6
            goto L_0x00a6
        L_0x009c:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r9 = "MicroMsg.TextStatus.StatusIconHelperV2"
            java.lang.String r0 = "format err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r6, r0, r7)
        L_0x00a6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62291c(uz2.e0, int, java.lang.String, int):java.lang.String");
    }

    /* renamed from: d */
    public C52679e1 mo62292d() {
        return f106541e;
    }

    /* renamed from: e */
    public String mo62293e() {
        String str;
        LinkedList<C52701n0> linkedList;
        LinkedList<C52701n0> linkedList2;
        C13598b0 b0Var;
        Integer num = null;
        if (!IStatusIconHelperKt.m39109a().mo62273C()) {
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: isTextStatusEditorDefault , return AgendaIconId is null ");
            return null;
        }
        long a = C31543z5.m39451a() / ((long) 1000);
        C52699m0 m0Var = f106542f;
        if (m0Var == null || (linkedList2 = m0Var.f147162e) == null) {
            str = null;
        } else {
            str = null;
            for (C52701n0 n0Var : linkedList2) {
                if (((long) n0Var.f147167e) > a || ((long) n0Var.f147168f) < a) {
                    Log.m105928w("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId Out of time range : begin_time:" + n0Var.f147167e + " end_time:" + n0Var.f147168f + " nowTime:" + a);
                } else {
                    Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: begin_time:" + n0Var.f147167e + " end_time:" + n0Var.f147168f + " nowTime:" + a);
                    Long l = f106538b;
                    if (l != null) {
                        long longValue = l.longValue();
                        if (longValue < ((long) n0Var.f147167e) || longValue > ((long) n0Var.f147168f)) {
                            str = n0Var.f147166d;
                            Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: lastAgendaClickTime:" + longValue);
                        } else {
                            Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "getCoverAgendaIconId: Has been clicked");
                        }
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        str = n0Var.f147166d;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getCoverAgendaIconId: nowTime:");
        sb.append(a);
        sb.append(" lastAgendaClickTime:");
        sb.append(f106538b);
        sb.append(" coverAgenda.cover_icons.size:");
        C52699m0 m0Var2 = f106542f;
        if (!(m0Var2 == null || (linkedList = m0Var2.f147162e) == null)) {
            num = Integer.valueOf(linkedList.size());
        }
        sb.append(num);
        sb.append(" iconId:");
        sb.append(str);
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", sb.toString());
        return str;
    }

    /* renamed from: f */
    public String mo62294f() {
        String str = f106539c;
        f106539c = null;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public ArrayList<C9493c> mo62295g() {
        ArrayList<C9493c> arrayList = new ArrayList<>();
        arrayList.add(new C12939c(MMApplicationContext.getContext().getString(C0966R.string.k18)));
        C52679e1 e1Var = f106541e;
        if (e1Var != null) {
            LinkedList linkedList = new LinkedList();
            Iterator<C52681f1> it = e1Var.f147103f.iterator();
            while (it.hasNext()) {
                C52683g1 g1Var = new C52683g1();
                g1Var.f147110d = it.next();
                linkedList.add(g1Var);
            }
            Iterator<C52676d1> it4 = e1Var.f147104g.iterator();
            while (true) {
                boolean z = true;
                if (!it4.hasNext()) {
                    break;
                }
                C52676d1 next = it4.next();
                C87412m.m108593f(next, "icon");
                C52725x e = C39713l.m42500e(next, true);
                String str = e != null ? e.f147287j : null;
                if (str != null && !C112551y.m153811k(str)) {
                    z = false;
                }
                if (!z) {
                    f106537a.mo62335T(next, str, linkedList);
                }
            }
            Iterator it5 = linkedList.iterator();
            while (it5.hasNext()) {
                C52683g1 g1Var2 = (C52683g1) it5.next();
                if (g1Var2.f147111e.size() > 0) {
                    LinkedList<C52676d1> linkedList2 = g1Var2.f147111e;
                    C87412m.m108593f(linkedList2, "group.icons");
                    if (linkedList2.size() > 1) {
                        C77813z.m93909o(linkedList2, new C39709b());
                    }
                    C52681f1 f1Var = g1Var2.f147110d;
                    C87412m.m108593f(f1Var, "group.iconGroup");
                    LinkedList<C52722w> linkedList3 = f1Var.f147107e;
                    C87412m.m108593f(linkedList3, "iconGroupDescriptions");
                    String b = C39713l.m42497b(linkedList3);
                    if (b == null) {
                        b = "";
                    }
                    arrayList.add(new C12938b(b));
                    Iterator<C52676d1> it6 = g1Var2.f147111e.iterator();
                    while (it6.hasNext()) {
                        C52676d1 next2 = it6.next();
                        C87412m.m108593f(next2, "iconItem");
                        arrayList.add(new C47914d(C39713l.m42498c(next2), next2.f147081d));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList<C9493c> mo62296h() {
        ArrayList<C9493c> arrayList = new ArrayList<>();
        if ((mo62311w() || mo62312x()) && (!((ArrayList) C39697g.f106502a.mo62325c()).isEmpty())) {
            arrayList.add(new C36226f());
        }
        C52679e1 e1Var = f106541e;
        if (e1Var != null) {
            LinkedList linkedList = new LinkedList();
            Iterator<C52681f1> it = e1Var.f147103f.iterator();
            while (it.hasNext()) {
                C52683g1 g1Var = new C52683g1();
                g1Var.f147110d = it.next();
                linkedList.add(g1Var);
            }
            Iterator<C52676d1> it4 = e1Var.f147104g.iterator();
            while (true) {
                boolean z = false;
                if (!it4.hasNext()) {
                    break;
                }
                C52676d1 next = it4.next();
                C87412m.m108593f(next, "icon");
                C52725x e = C39713l.m42500e(next, true);
                String str = e != null ? e.f147287j : null;
                if (str == null || C112551y.m153811k(str)) {
                    z = true;
                }
                if (!z) {
                    f106537a.mo62335T(next, str, linkedList);
                }
            }
            Iterator it5 = linkedList.iterator();
            while (it5.hasNext()) {
                C52683g1 g1Var2 = (C52683g1) it5.next();
                if (g1Var2.f147111e.size() > 0) {
                    LinkedList<C52676d1> linkedList2 = g1Var2.f147111e;
                    C87412m.m108593f(linkedList2, "group.icons");
                    if (linkedList2.size() > 1) {
                        C77813z.m93909o(linkedList2, new C39710c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<C52676d1> it6 = g1Var2.f147111e.iterator();
                    while (it6.hasNext()) {
                        C52676d1 next2 = it6.next();
                        C39707j jVar = f106537a;
                        if (!(jVar.mo62312x() || jVar.mo62311w())) {
                            C87412m.m108593f(next2, "iconItem");
                            arrayList2.add(new C47914d(C39713l.m42498c(next2), next2.f147081d));
                        } else if (!C87412m.m108589b(next2.f147081d, "userdefine")) {
                            arrayList2.add(new C47914d(C39713l.m42498c(next2), next2.f147081d));
                        }
                    }
                    C52681f1 f1Var = g1Var2.f147110d;
                    C87412m.m108593f(f1Var, "group.iconGroup");
                    LinkedList<C52722w> linkedList3 = f1Var.f147107e;
                    C87412m.m108593f(linkedList3, "iconGroupDescriptions");
                    String b = C39713l.m42497b(linkedList3);
                    if (b == null) {
                        b = "";
                    }
                    arrayList.add(new C47915e(b, arrayList2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public C52676d1 mo62298j(String str) {
        C52676d1 d = C39713l.m42499d(f106541e, str);
        return d == null ? C39713l.m42499d(mo62290b(), str) : d;
    }

    /* renamed from: k */
    public ImageSpan mo62299k(View view, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C63347a.C47892c cVar, int i, C48201c cVar2) {
        int i2;
        C63347a.C47893d dVar2 = dVar;
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        String str2 = IStatusIconHelperKt.m39109a().mo62279I() ? "1080" : str;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        colorDrawable.setBounds(0, 0, 0, 0);
        int i3 = cVar == null ? -1 : C39708a.f106546a[cVar.ordinal()];
        if (i3 == 1 || i3 == 2) {
            i2 = 0;
        } else {
            int i4 = C39715n.f106552s;
            i2 = C39715n.f106552s;
        }
        return new C39715n(view, colorDrawable, str2, 1, cVar2, cVar, dVar, bVar, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r3 = mo62298j(r3);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62300l(java.lang.String r3) {
        /*
            r2 = this;
            b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r0 = r0.mo62278H()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0021
            b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r0 = r0.mo62275E()
            if (r0 == 0) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            uz2.d1 r3 = r2.mo62298j(r3)
            if (r3 == 0) goto L_0x0021
            java.lang.String r1 = b03.C39713l.m42498c(r3)
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62300l(java.lang.String):java.lang.String");
    }

    /* renamed from: m */
    public String mo62301m(C52678e0 e0Var) {
        if (IStatusIconHelperKt.m39109a().mo62278H() || IStatusIconHelperKt.m39109a().mo62275E() || e0Var == null) {
            return "";
        }
        String str = e0Var.f147092i;
        if (str == null || str.length() == 0) {
            return mo62300l(e0Var.f147088e);
        }
        String str2 = e0Var.f147092i;
        C87412m.m108593f(str2, "{\n            topicInfo.title\n        }");
        return str2;
    }

    /* renamed from: n */
    public long mo62302n() {
        return f106541e.f147101d;
    }

    /* renamed from: o */
    public C52669b0 mo62303o() {
        return f106543g;
    }

    /* renamed from: p */
    public void mo62304p(C52716t0 t0Var) {
        C87412m.m108594g(t0Var, "rsp");
        C52699m0 m0Var = t0Var.f147218e;
        if (m0Var == null) {
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "handleCoverAgendaResult nochange");
            return;
        }
        f106542f = m0Var;
        StringBuilder sb = new StringBuilder();
        sb.append("handleCoverAgendaResult:");
        LinkedList<C52701n0> linkedList = f106542f.f147162e;
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        sb.append(' ');
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", sb.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C112760b.m154225d());
        sb4.append("textstatus/");
        String a = C13781a.m13082a();
        C87412m.m108593f(a, "username()");
        byte[] bytes = a.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb4.append(C90193h.m112878f(bytes));
        String sb5 = sb4.toString();
        if (!C86013q1.m106450k(sb5)) {
            C86013q1.m106461v(sb5);
        }
        C86013q1.m106437S(sb5 + "/cover.cfg", f106542f.toByteArray());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62305q(uz2.C52716t0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "rsp"
            gy3.C87412m.m108594g(r9, r0)
            java.util.LinkedList<uz2.e1> r0 = r9.f147220g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r3 = 0
            goto L_0x0015
        L_0x0014:
            r3 = 1
        L_0x0015:
            if (r3 == 0) goto L_0x0018
            goto L_0x002f
        L_0x0018:
            uz2.e1 r0 = r8.mo62337V(r0)
            java.util.LinkedList<uz2.f1> r3 = r0.f147103f
            int r3 = r3.size()
            if (r3 == 0) goto L_0x002f
            java.util.LinkedList<uz2.d1> r0 = r0.f147104g
            int r0 = r0.size()
            if (r0 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            java.lang.String r3 = "MicroMsg.TextStatus.StatusIconHelperV2"
            if (r0 != 0) goto L_0x003a
            java.lang.String r9 = "handleIconConfigListResult nochange"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            return
        L_0x003a:
            java.util.LinkedList<uz2.e1> r9 = r9.f147220g
            java.lang.String r0 = "rsp.icon_configs"
            gy3.C87412m.m108593f(r9, r0)
            f106545i = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "handleIconConfigListResult:"
            r9.append(r0)
            java.util.LinkedList<uz2.e1> r0 = f106545i
            int r0 = r0.size()
            r9.append(r0)
            r0 = 32
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            java.util.LinkedList<uz2.e1> r9 = f106545i
            if (r9 == 0) goto L_0x006f
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r9 = 0
            goto L_0x0070
        L_0x006f:
            r9 = 1
        L_0x0070:
            if (r9 != 0) goto L_0x00c9
            java.util.LinkedList<uz2.e1> r9 = f106545i
            java.util.Iterator r9 = r9.iterator()
            java.lang.String r0 = ""
        L_0x007a:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r9.next()
            uz2.e1 r4 = (uz2.C52679e1) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "index:"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " , key:"
            r5.append(r0)
            long r6 = r4.f147101d
            r5.append(r6)
            java.lang.String r0 = " , configId:"
            r5.append(r0)
            java.lang.String r0 = r4.f147102e
            r5.append(r0)
            java.lang.String r0 = " .    "
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            int r2 = r2 + r1
            goto L_0x007a
        L_0x00b5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "handleIconConfigListResult: "
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
        L_0x00c9:
            uz2.i r9 = new uz2.i
            r9.<init>()
            java.util.LinkedList<uz2.e1> r0 = f106545i
            r9.f147135d = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154225d()
            r0.append(r1)
            java.lang.String r1 = "textstatus/"
            r0.append(r1)
            java.lang.String r1 = su0.C13781a.m13082a()
            java.lang.String r2 = "username()"
            gy3.C87412m.m108593f(r1, r2)
            java.nio.charset.Charset r2 = z04.C119027c.f356488a
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 != 0) goto L_0x010c
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
        L_0x010c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/iconConfigListPath.cfg"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            byte[] r9 = r9.toByteArray()
            com.tencent.p014mm.vfs.C86013q1.m106437S(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62305q(uz2.t0):void");
    }

    /* renamed from: r */
    public void mo62306r(C52716t0 t0Var) {
        C87412m.m108594g(t0Var, "rsp");
        C52679e1 e1Var = t0Var.f147217d;
        if (e1Var == null || e1Var.f147103f.size() == 0 || t0Var.f147217d.f147104g.size() == 0) {
            Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", "handleIconConfigResult nochange");
            return;
        }
        long j = f106541e.f147101d;
        C52679e1 e1Var2 = t0Var.f147217d;
        long j2 = e1Var2.f147101d;
        f106541e = e1Var2;
        byte[] byteArray = e1Var2.toByteArray();
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154225d());
        sb.append("textstatus/");
        String a = C13781a.m13082a();
        C87412m.m108593f(a, "username()");
        byte[] bytes = a.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        String sb4 = sb.toString();
        if (!C86013q1.m106450k(sb4)) {
            C86013q1.m106461v(sb4);
        }
        int S = C86013q1.m106437S(sb4 + "/icon.cfg", byteArray);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("res:");
        sb5.append(S);
        sb5.append(" icon_configs.isNullOrEmpty():");
        LinkedList<C52679e1> linkedList = t0Var.f147220g;
        sb5.append(linkedList == null || linkedList.isEmpty());
        sb5.append(" handleIconConfigResult:");
        C52679e1 e1Var3 = t0Var.f147217d;
        C87412m.m108593f(e1Var3, "rsp.icon_config");
        sb5.append(C39713l.m42507l(e1Var3));
        sb5.append(' ');
        Log.m105924i("MicroMsg.TextStatus.StatusIconHelperV2", sb5.toString());
        if (S == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_REQ_ICON_CONFIG_LONG, Long.valueOf(C31543z5.m39451a()));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_INT, Integer.valueOf(C89625d.f257841g));
        }
        StatusIconConfigUpdateEvent statusIconConfigUpdateEvent = new StatusIconConfigUpdateEvent();
        statusIconConfigUpdateEvent.f107775d.f107776a = Long.valueOf(j);
        statusIconConfigUpdateEvent.f107775d.f107777b = Long.valueOf(j2);
        statusIconConfigUpdateEvent.publish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e6, code lost:
        if (((r10 == null || (r10 = r10.f126153d) == null || r10.intValue() != 5) ? false : true) != false) goto L_0x00e8;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62307s(uz2.C52716t0 r9, lz2.C46922e r10) {
        /*
            r8 = this;
            java.lang.String r0 = "rsp"
            gy3.C87412m.m108594g(r9, r0)
            uz2.b0 r0 = r9.f147219f
            r1 = 0
            java.lang.String r2 = "MicroMsg.TextStatus.StatusIconHelperV2"
            if (r0 != 0) goto L_0x0012
            java.lang.String r9 = "handleKeyValueConfigResult key_value_config == null ,No Change"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            return r1
        L_0x0012:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "handleKeyValueConfigResult:rspKey:"
            r0.append(r3)
            uz2.b0 r3 = r9.f147219f
            long r3 = r3.f147060d
            r0.append(r3)
            java.lang.String r3 = "  key:"
            r0.append(r3)
            uz2.b0 r3 = f106543g
            long r3 = r3.f147060d
            r0.append(r3)
            java.lang.String r3 = " scene.flag:"
            r0.append(r3)
            if (r10 == 0) goto L_0x0039
            java.lang.Integer r3 = r10.f126153d
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            r0.append(r3)
            java.lang.String r3 = " key_value_items.size:"
            r0.append(r3)
            uz2.b0 r3 = f106543g
            java.util.LinkedList<uz2.c0> r3 = r3.f147061e
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            uz2.b0 r0 = f106543g
            java.util.LinkedList<uz2.c0> r0 = r0.f147061e
            r3 = 1
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r0 = 0
            goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r0 != 0) goto L_0x00c1
            uz2.b0 r0 = f106543g
            java.util.LinkedList<uz2.c0> r0 = r0.f147061e
            java.lang.String r4 = "keyValueConfig.key_value_items"
            gy3.C87412m.m108593f(r0, r4)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r4 = ""
            r5 = 0
        L_0x0077:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00ad
            java.lang.Object r6 = r0.next()
            uz2.c0 r6 = (uz2.C52672c0) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = " , key:"
            r7.append(r4)
            java.lang.String r4 = r6.f147065d
            r7.append(r4)
            java.lang.String r4 = " , value:"
            r7.append(r4)
            java.lang.String r4 = r6.f147066e
            r7.append(r4)
            java.lang.String r4 = " ."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            int r5 = r5 + r3
            goto L_0x0077
        L_0x00ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "handleKeyValueConfigResult: "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00c1:
            if (r10 == 0) goto L_0x00d0
            java.lang.Integer r0 = r10.f126153d
            if (r0 != 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x00d0
            r0 = 1
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            java.lang.String r4 = "rsp.key_value_config"
            if (r0 != 0) goto L_0x00e8
            if (r10 == 0) goto L_0x00e5
            java.lang.Integer r10 = r10.f126153d
            r0 = 5
            if (r10 != 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            int r10 = r10.intValue()
            if (r10 != r0) goto L_0x00e5
            r10 = 1
            goto L_0x00e6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            if (r10 == 0) goto L_0x014d
        L_0x00e8:
            uz2.b0 r10 = r9.f147219f
            gy3.C87412m.m108593f(r10, r4)
            int r10 = r8.mo62338W(r10)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r5 = f106544h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r1] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r0[r3] = r5
            java.lang.String r5 = "exptSwitchChange: old:%s new:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
            int r0 = f106544h
            if (r10 == r0) goto L_0x010d
            r10 = 1
            goto L_0x010e
        L_0x010d:
            r10 = 0
        L_0x010e:
            if (r10 == 0) goto L_0x014d
            bp3.p r10 = bp3.C79758p.f233760a
            bp3.f r0 = bp3.C104160f.RepairerConfig_TextStatus_ForceUseKVSwitch_Int
            int r10 = r10.mo109882e(r0, r1)
            if (r10 == r3) goto L_0x014d
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_text_status_handle_last_resp_and
            int r10 = r10.mo58779Qe(r0, r3)
            if (r10 != r3) goto L_0x012c
            r10 = 1
            goto L_0x012d
        L_0x012c:
            r10 = 0
        L_0x012d:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r0[r1] = r4
            java.lang.String r1 = "isNeedHandleLastResp: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            if (r10 == 0) goto L_0x014c
            f106540d = r9
            com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent r9 = new com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent
            r9.<init>()
            com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent$a r10 = r9.f107773d
            java.lang.String r0 = "ACTION_NEED_HANDLE_LAST_RESP"
            r10.f107774a = r0
            r9.publish()
        L_0x014c:
            return r3
        L_0x014d:
            uz2.b0 r10 = r9.f147219f
            gy3.C87412m.m108593f(r10, r4)
            f106543g = r10
            uz2.b0 r9 = r9.f147219f
            gy3.C87412m.m108593f(r9, r4)
            int r9 = r8.mo62338W(r9)
            f106544h = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = a70.C112760b.m154225d()
            r9.append(r10)
            java.lang.String r10 = "textstatus/"
            r9.append(r10)
            java.lang.String r10 = su0.C13781a.m13082a()
            java.lang.String r0 = "username()"
            gy3.C87412m.m108593f(r10, r0)
            java.nio.charset.Charset r0 = z04.C119027c.f356488a
            byte[] r10 = r10.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r10, r0)
            java.lang.String r10 = p823sg.C90193h.m112878f(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r10 != 0) goto L_0x0199
            com.tencent.p014mm.vfs.C86013q1.m106461v(r9)
        L_0x0199:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "/kvconfig.cfg"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            uz2.b0 r10 = f106543g
            byte[] r10 = r10.toByteArray()
            com.tencent.p014mm.vfs.C86013q1.m106437S(r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62307s(uz2.t0, lz2.e):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.f147217d;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62308t() {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            uz2.t0 r1 = f106540d
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0014
            uz2.e1 r1 = r1.f147217d
            if (r1 == 0) goto L_0x0014
            long r3 = r1.f147101d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            r0[r3] = r1
            r1 = 1
            uz2.t0 r3 = f106540d
            if (r3 == 0) goto L_0x0027
            uz2.b0 r3 = r3.f147219f
            if (r3 == 0) goto L_0x0027
            long r2 = r3.f147060d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0027:
            r0[r1] = r2
            java.lang.String r1 = "MicroMsg.TextStatus.StatusIconHelperV2"
            java.lang.String r2 = "lastRsp: icon_config.key: %s  key_value_config?.key:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            uz2.t0 r0 = f106540d
            if (r0 == 0) goto L_0x003e
            b03.j$d r1 = new b03.j$d
            r1.<init>(r0)
            java.lang.String r0 = "TextStatusThread"
            o40.C61926c.m72661F(r0, r1)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62308t():void");
    }

    /* renamed from: u */
    public boolean mo62309u() {
        return mo62275E() || mo62311w();
    }

    /* renamed from: v */
    public boolean mo62310v() {
        return mo62340Y() == 8 && (mo62339X() & 128) == 0;
    }

    /* renamed from: w */
    public boolean mo62311w() {
        return mo62340Y() == 6 && (mo62339X() & 64) == 0;
    }

    /* renamed from: x */
    public boolean mo62312x() {
        return mo62340Y() == 7 && (mo62339X() & 128) == 0;
    }

    /* renamed from: y */
    public boolean mo62313y(String str) {
        if (str == null || C112551y.m153811k(str)) {
            return false;
        }
        C52676d1 j = mo62298j(str);
        return (j != null ? C39713l.m42500e(j, false) : null) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r5 = rz2.C48200b.m53531d((r5 = p773yy.C66710j.C53637a.m60171a(r5, false, 1, (java.lang.Object) null)));
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62314z(rz2.C48201c r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0008
            java.lang.String r0 = rz2.C48200b.m53529b(r5)
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            boolean r1 = z04.C112551y.m153811k(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            uz2.d1 r0 = r4.mo62298j(r0)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001d
            java.util.LinkedList<uz2.x> r5 = r0.f147083f
            goto L_0x002f
        L_0x001d:
            if (r5 == 0) goto L_0x002e
            uz2.e0 r5 = p773yy.C66710j.C53637a.m60171a(r5, r2, r1, r3)
            if (r5 == 0) goto L_0x002e
            uz2.q r5 = rz2.C48200b.m53531d(r5)
            if (r5 == 0) goto L_0x002e
            java.util.LinkedList<uz2.x> r5 = r5.f147180e
            goto L_0x002f
        L_0x002e:
            r5 = r3
        L_0x002f:
            if (r5 == 0) goto L_0x0035
            uz2.x r3 = b03.C39713l.m42501f(r5)
        L_0x0035:
            if (r3 == 0) goto L_0x0038
            r2 = 1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39707j.mo62314z(rz2.c):boolean");
    }
}
