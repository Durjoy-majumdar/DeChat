package k92;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.finder.live.view.C56069i1;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.plugin.multitask.C105921l;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import qp0.C89783a;
import qp0.C89784b;
import te3.C110964i13;
import te3.C27675g13;
import te3.C49641h13;
import te3.C51173ry;
import te3.C64272c13;
import te3.C64336e13;
import te3.C64459j13;
import v03.C22713a;
import zt3.C119157j;

/* renamed from: k92.a */
public class C108972a implements C108974b {

    /* renamed from: a */
    public MultiTaskInfo f326418a;

    /* renamed from: b */
    public C51173ry f326419b;

    /* renamed from: c */
    public C110964i13 f326420c;

    /* renamed from: d */
    public final String f326421d = "MultiTasklLoopTag";

    /* renamed from: k92.a$a */
    public static final class C108973a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108972a f326422d;

        public C108973a(C108972a aVar) {
            this.f326422d = aVar;
        }

        public final void run() {
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151047kV(2, this.f326422d.f326420c);
        }
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return this instanceof C89783a;
    }

    /* renamed from: B */
    public boolean mo67894B() {
        return this instanceof C22713a;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return this instanceof C89783a;
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        MultiTaskInfo multiTaskInfo = new MultiTaskInfo();
        this.f326418a = multiTaskInfo;
        multiTaskInfo.field_updateTime = ((C105919k) C86312j.m106911c(C105919k.class)).mo151030Bv();
        MultiTaskInfo multiTaskInfo2 = this.f326418a;
        if (multiTaskInfo2 != null) {
            multiTaskInfo2.field_id = str;
        }
        if (multiTaskInfo2 != null) {
            multiTaskInfo2.field_type = i;
        }
        C110964i13 i132 = new C110964i13();
        this.f326420c = i132;
        i132.f332063j = new C64272c13();
        C110964i13 i133 = this.f326420c;
        if (i133 != null) {
            i133.f332062i = new C64336e13();
        }
        C110964i13 i134 = this.f326420c;
        if (i134 != null) {
            i134.f332064n = new C27675g13();
        }
        C110964i13 i135 = this.f326420c;
        if (i135 != null) {
            i135.f332065o = new C49641h13();
        }
        C110964i13 i136 = this.f326420c;
        C49641h13 h132 = i136 != null ? i136.f332065o : null;
        if (h132 != null) {
            h132.f134407e = true;
        }
    }

    /* renamed from: E */
    public void mo74188E() {
        C64336e13 e132;
        Object[] objArr = new Object[1];
        MultiTaskInfo multiTaskInfo = this.f326418a;
        objArr[0] = multiTaskInfo != null ? multiTaskInfo.field_id : null;
        Log.m105925i("MicroMsg.AbsMultiTaskHelper", "onEnterPage, type:", objArr);
        C110964i13 i132 = this.f326420c;
        if (i132 != null && (e132 = i132.f332062i) != null) {
            e132.f182918d = ((C105919k) C86312j.m106911c(C105919k.class)).mo151030Bv();
        }
    }

    /* renamed from: F */
    public void mo74189F() {
        C64336e13 e132;
        Object[] objArr = new Object[1];
        MultiTaskInfo multiTaskInfo = this.f326418a;
        objArr[0] = multiTaskInfo != null ? multiTaskInfo.field_id : null;
        Log.m105925i("MicroMsg.AbsMultiTaskHelper", "onExitPage, type:", objArr);
        C110964i13 i132 = this.f326420c;
        if (!(i132 == null || (e132 = i132.f332062i) == null)) {
            long Bv = ((C105919k) C86312j.m106911c(C105919k.class)).mo151030Bv();
            long j = e132.f182918d;
            if (Bv >= j) {
                e132.f182919e += Bv - j;
            }
        }
        if (mo160082g() && mo160080e()) {
            ((C119157j) C119157j.f356862d).mo183871b(new C108973a(this), this.f326421d);
        }
    }

    /* renamed from: G */
    public void mo67895G(boolean z) {
        mo124068H(z, 1);
    }

    /* renamed from: H */
    public void mo124068H(boolean z, int i) {
    }

    /* renamed from: I */
    public void mo160072I() {
        MultiTaskInfo u;
        if (!(this instanceof C89784b) && (u = mo74196u()) != null) {
            ((C105921l) C86312j.m106911c(C105921l.class)).mo61370E1(u.field_id, true, 2);
        }
    }

    /* renamed from: J */
    public boolean mo74190J() {
        return !(this instanceof C56069i1);
    }

    /* renamed from: K */
    public void mo160073K(Bitmap bitmap, boolean z) {
        if (!(this instanceof C89784b)) {
            Log.m105924i("MicroMsg.AbsMultiTaskHelper", "updateCurrentHistoryTaskInfo");
            MultiTaskInfo u = mo74196u();
            if (u != null) {
                ((C105921l) C86312j.m106911c(C105921l.class)).mo61371q5(u.field_id, u.field_type, u.mo80305m2(), bitmap, u.field_data, z);
            }
        }
    }

    /* renamed from: L */
    public void mo160074L() {
        MultiTaskInfo multiTaskInfo;
        if (mo160080e() && (multiTaskInfo = this.f326418a) != null) {
            String str = multiTaskInfo.field_id;
            C87412m.m108593f(str, "it.field_id");
            int i = multiTaskInfo.field_type;
            C64459j13 m2 = multiTaskInfo.mo80305m2();
            C87412m.m108593f(m2, "it.showData");
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151053y5(str, i, m2, multiTaskInfo.field_data);
        }
    }

    /* renamed from: M */
    public void mo160075M() {
        MultiTaskInfo multiTaskInfo;
        if (mo160080e() && (multiTaskInfo = this.f326418a) != null) {
            String str = multiTaskInfo.field_id;
            C87412m.m108593f(str, "it.field_id");
            int i = multiTaskInfo.field_type;
            C64459j13 m2 = multiTaskInfo.mo80305m2();
            C87412m.m108593f(m2, "it.showData");
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151032D3(str, i, m2, (Bitmap) null, multiTaskInfo.field_data);
        }
    }

    /* renamed from: N */
    public void mo160076N(String str) {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        C64459j13 m2 = multiTaskInfo != null ? multiTaskInfo.mo80305m2() : null;
        if (m2 != null) {
            m2.f183756i = str;
        }
        mo160074L();
    }

    /* renamed from: O */
    public void mo160077O(String str) {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        C64459j13 m2 = multiTaskInfo != null ? multiTaskInfo.mo80305m2() : null;
        if (m2 != null) {
            m2.f183752e = str;
        }
        mo160074L();
    }

    /* renamed from: a */
    public MultiTaskInfo mo160078a() {
        return this.f326418a;
    }

    /* renamed from: b */
    public boolean mo160079b() {
        return false;
    }

    /* renamed from: c */
    public void mo74193c(Bitmap bitmap) {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        if (multiTaskInfo != null) {
            String str = multiTaskInfo.field_id;
            C87412m.m108593f(str, "it.field_id");
            int i = multiTaskInfo.field_type;
            C64459j13 m2 = multiTaskInfo.mo80305m2();
            C87412m.m108593f(m2, "it.showData");
            ((C105919k) C86312j.m106911c(C105919k.class)).mo151032D3(str, i, m2, bitmap, multiTaskInfo.field_data);
        }
    }

    /* renamed from: d */
    public void mo67897d() {
    }

    /* renamed from: e */
    public boolean mo160080e() {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        if (multiTaskInfo != null) {
            return ((C105919k) C86312j.m106911c(C105919k.class)).mo151039S5(multiTaskInfo);
        }
        return false;
    }

    /* renamed from: f */
    public void mo160081f() {
    }

    /* renamed from: g */
    public boolean mo160082g() {
        return false;
    }

    public String getPosition() {
        return null;
    }

    /* renamed from: h */
    public Bitmap mo160084h() {
        return null;
    }

    /* renamed from: i */
    public String mo160085i(int i) {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        if (multiTaskInfo == null) {
            return "";
        }
        String str = multiTaskInfo.field_id;
        C87412m.m108593f(str, "it.field_id");
        return ((C105919k) C86312j.m106911c(C105919k.class)).mo151036P(str, mo160091v(), i);
    }

    /* renamed from: j */
    public C110964i13 mo160086j() {
        return this.f326420c;
    }

    /* renamed from: m */
    public boolean mo160087m() {
        return false;
    }

    /* renamed from: n */
    public String mo160088n() {
        return null;
    }

    /* renamed from: o */
    public Bitmap mo160089o(Bitmap bitmap) {
        return null;
    }

    /* renamed from: p */
    public Boolean mo74194p() {
        return Boolean.FALSE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: te3.c13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: te3.c13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: te3.c13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: te3.c13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: te3.c13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: te3.c13} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: te3.c13} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160090r(android.graphics.Bitmap r13, boolean r14) {
        /*
            r12 = this;
            java.lang.Class<com.tencent.mm.plugin.multitask.k> r0 = com.tencent.p014mm.plugin.multitask.C105919k.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addCurrentMultiTaskInfoWithBlt, forceUpdate:"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AbsMultiTaskHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r12.mo160080e()
            java.lang.String r2 = "it.showData"
            java.lang.String r3 = "it.field_id"
            r4 = 0
            if (r1 != 0) goto L_0x0059
            te3.i13 r14 = r12.f326420c
            if (r14 == 0) goto L_0x002a
            te3.c13 r14 = r14.f332063j
            goto L_0x002b
        L_0x002a:
            r14 = r4
        L_0x002b:
            if (r14 != 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            r5 = 2
            r14.f182353e = r5
        L_0x0032:
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r14 = r12.f326418a
            if (r14 == 0) goto L_0x0098
            di3.d r0 = di3.C86312j.m106911c(r0)
            r5 = r0
            com.tencent.mm.plugin.multitask.k r5 = (com.tencent.p014mm.plugin.multitask.C105919k) r5
            java.lang.String r6 = r14.field_id
            gy3.C87412m.m108593f(r6, r3)
            int r7 = r14.field_type
            te3.j13 r8 = r14.mo80305m2()
            gy3.C87412m.m108593f(r8, r2)
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r14 = r12.f326418a
            if (r14 == 0) goto L_0x0051
            byte[] r4 = r14.field_data
        L_0x0051:
            r10 = r4
            te3.i13 r11 = r12.f326420c
            r9 = r13
            r5.mo151048l0(r6, r7, r8, r9, r10, r11)
            goto L_0x0098
        L_0x0059:
            r5 = 1
            if (r14 != 0) goto L_0x006c
            te3.i13 r14 = r12.f326420c
            if (r14 == 0) goto L_0x0063
            te3.c13 r4 = r14.f332063j
        L_0x0063:
            if (r4 != 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r4.f182353e = r5
        L_0x0068:
            r12.mo74193c(r13)
            goto L_0x0098
        L_0x006c:
            te3.i13 r14 = r12.f326420c
            if (r14 == 0) goto L_0x0072
            te3.c13 r4 = r14.f332063j
        L_0x0072:
            if (r4 != 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r4.f182353e = r5
        L_0x0077:
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r14 = r12.f326418a
            if (r14 == 0) goto L_0x0098
            di3.d r0 = di3.C86312j.m106911c(r0)
            r4 = r0
            com.tencent.mm.plugin.multitask.k r4 = (com.tencent.p014mm.plugin.multitask.C105919k) r4
            java.lang.String r5 = r14.field_id
            gy3.C87412m.m108593f(r5, r3)
            int r6 = r14.field_type
            te3.j13 r7 = r14.mo80305m2()
            gy3.C87412m.m108593f(r7, r2)
            byte[] r9 = r14.field_data
            te3.i13 r10 = r12.f326420c
            r8 = r13
            r4.mo151048l0(r5, r6, r7, r8, r9, r10)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k92.C108972a.mo160090r(android.graphics.Bitmap, boolean):void");
    }

    /* renamed from: s */
    public void mo74195s(Bitmap bitmap) {
        if (!(this instanceof C89784b)) {
            Log.m105924i("MicroMsg.AbsMultiTaskHelper", "add or update taskInfo");
            MultiTaskInfo u = mo74196u();
            if (u != null) {
                ((C105921l) C86312j.m106911c(C105921l.class)).mo61372y3(u.field_id, u.field_type, u.mo80305m2(), bitmap, u.field_data);
            }
        }
    }

    /* renamed from: t */
    public long mo138110t() {
        return 500;
    }

    /* renamed from: u */
    public MultiTaskInfo mo74196u() {
        return this.f326418a;
    }

    /* renamed from: v */
    public int mo160091v() {
        return -1;
    }

    /* renamed from: w */
    public void mo74197w(Bitmap bitmap, boolean z) {
        if (!(this instanceof C89784b)) {
            if (z) {
                Log.m105924i("MicroMsg.AbsMultiTaskHelper", "ended, remove historyTaskInfo");
                mo160072I();
                return;
            }
            Log.m105924i("MicroMsg.AbsMultiTaskHelper", "not ended update historyTaskInfo");
            mo160073K(bitmap, false);
        }
    }

    /* renamed from: x */
    public boolean mo138111x() {
        return true;
    }

    /* renamed from: y */
    public boolean mo35811y() {
        return this instanceof C89784b;
    }

    /* renamed from: z */
    public boolean mo124070z() {
        return !(this instanceof C89783a);
    }
}
