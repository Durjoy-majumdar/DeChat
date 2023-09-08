package zv1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lv1.C21461d;
import lv1.C99681n;
import ov1.C21891f;

/* renamed from: zv1.b */
public class C23592b {

    /* renamed from: A */
    public boolean f67694A = false;

    /* renamed from: B */
    public int f67695B = 0;

    /* renamed from: C */
    public List<Integer> f67696C = new ArrayList();

    /* renamed from: D */
    public String f67697D = "";

    /* renamed from: E */
    public String f67698E = "";

    /* renamed from: F */
    public boolean f67699F = true;

    /* renamed from: G */
    public LinkedList<Integer> f67700G = null;

    /* renamed from: H */
    public int f67701H = 0;

    /* renamed from: I */
    public int f67702I = Integer.MAX_VALUE;

    /* renamed from: J */
    public List<C21461d> f67703J = new ArrayList();

    /* renamed from: a */
    public String f67704a;

    /* renamed from: b */
    public long f67705b;

    /* renamed from: c */
    public long f67706c;

    /* renamed from: d */
    public int f67707d;

    /* renamed from: e */
    public int f67708e;

    /* renamed from: f */
    public int f67709f;

    /* renamed from: g */
    public int f67710g;

    /* renamed from: h */
    public int f67711h;

    /* renamed from: i */
    public String f67712i;

    /* renamed from: j */
    public int f67713j;

    /* renamed from: k */
    public String f67714k;

    /* renamed from: l */
    public int f67715l;

    /* renamed from: m */
    public int f67716m;

    /* renamed from: n */
    public int f67717n;

    /* renamed from: o */
    public int f67718o;

    /* renamed from: p */
    public int f67719p;

    /* renamed from: q */
    public int f67720q;

    /* renamed from: r */
    public String f67721r;

    /* renamed from: s */
    public int f67722s;

    /* renamed from: t */
    public int f67723t;

    /* renamed from: u */
    public int f67724u;

    /* renamed from: v */
    public int f67725v;

    /* renamed from: w */
    public int f67726w;

    /* renamed from: x */
    public int f67727x;

    /* renamed from: y */
    public String f67728y = "";

    /* renamed from: z */
    public long f67729z = 0;

    /* renamed from: a */
    public void mo37067a(int i) {
        ((ArrayList) this.f67696C).add(Integer.valueOf(i));
        if (i == 31) {
            this.f67697D = this.f67714k;
        } else if (i == 5) {
            this.f67697D = this.f67712i;
        } else if (i == 19) {
            this.f67697D = this.f67721r;
        }
        Log.m105925i("MicroMsg.FTS.FTSSearchStaticsObj", "addClickItemType %s, currentClickUserName %s.", Integer.valueOf(i), this.f67697D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r12.f62334l == 2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        r2 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0073, code lost:
        r2 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007e, code lost:
        r2 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0087, code lost:
        if (r12.f62334l == 2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        r2 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008c, code lost:
        r2 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0092, code lost:
        r2 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0095, code lost:
        r2 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0098, code lost:
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009a, code lost:
        r2 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009f, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37068b(pv1.C22019b r12) {
        /*
            r11 = this;
            int r0 = com.tencent.p014mm.plugin.fts.p059ui.C18843b0.f52842a
            int r0 = r12.f62329g
            r1 = -8
            r2 = 0
            r3 = 19
            r4 = 5
            r5 = 10
            r6 = 3
            r7 = 2
            r8 = 31
            r9 = 9
            r10 = 4
            if (r0 != r1) goto L_0x003a
            if (r0 != r1) goto L_0x0034
            int r12 = r12.f62323a
            r0 = 1
            if (r12 == r0) goto L_0x0032
            if (r12 == r7) goto L_0x0030
            if (r12 == r6) goto L_0x002d
            if (r12 == r10) goto L_0x002b
            if (r12 == r9) goto L_0x0035
            r0 = 17
            if (r12 == r0) goto L_0x0028
            goto L_0x0034
        L_0x0028:
            r3 = 31
            goto L_0x0035
        L_0x002b:
            r3 = 5
            goto L_0x0035
        L_0x002d:
            r3 = 10
            goto L_0x0035
        L_0x0030:
            r3 = 4
            goto L_0x0035
        L_0x0032:
            r3 = 3
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x00a0
            r2 = 2
            goto L_0x00a0
        L_0x003a:
            int r1 = r12.f62323a
            switch(r1) {
                case 1: goto L_0x009f;
                case 2: goto L_0x009d;
                case 3: goto L_0x009a;
                case 4: goto L_0x0098;
                case 5: goto L_0x0095;
                case 6: goto L_0x0092;
                case 7: goto L_0x008f;
                case 8: goto L_0x004e;
                case 9: goto L_0x0073;
                case 10: goto L_0x004a;
                case 11: goto L_0x003f;
                case 12: goto L_0x0046;
                case 13: goto L_0x0068;
                case 14: goto L_0x0041;
                case 15: goto L_0x003f;
                case 16: goto L_0x003f;
                case 17: goto L_0x007e;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x00a0
        L_0x0041:
            int r12 = r12.f62334l
            if (r12 != r7) goto L_0x008c
            goto L_0x0089
        L_0x0046:
            r2 = 22
            goto L_0x00a0
        L_0x004a:
            r2 = 20
            goto L_0x00a0
        L_0x004e:
            r1 = -5
            if (r0 != r1) goto L_0x0054
            r2 = 16
            goto L_0x00a0
        L_0x0054:
            r1 = -3
            if (r0 != r1) goto L_0x0058
            goto L_0x009d
        L_0x0058:
            r1 = -4
            if (r0 != r1) goto L_0x005c
            goto L_0x009f
        L_0x005c:
            r1 = -1
            if (r0 != r1) goto L_0x0060
            goto L_0x0092
        L_0x0060:
            r1 = -2
            if (r0 != r1) goto L_0x0064
            goto L_0x0095
        L_0x0064:
            r1 = -15
            if (r0 != r1) goto L_0x006b
        L_0x0068:
            r2 = 21
            goto L_0x00a0
        L_0x006b:
            r1 = -6
            if (r0 != r1) goto L_0x006f
            goto L_0x009a
        L_0x006f:
            r1 = -13
            if (r0 != r1) goto L_0x0076
        L_0x0073:
            r2 = 19
            goto L_0x00a0
        L_0x0076:
            r1 = -7
            if (r0 != r1) goto L_0x007a
            goto L_0x0098
        L_0x007a:
            r1 = -23
            if (r0 != r1) goto L_0x0081
        L_0x007e:
            r2 = 31
            goto L_0x00a0
        L_0x0081:
            r1 = -20
            if (r0 != r1) goto L_0x00a0
            int r12 = r12.f62334l
            if (r12 != r7) goto L_0x008c
        L_0x0089:
            r2 = 26
            goto L_0x00a0
        L_0x008c:
            r2 = 25
            goto L_0x00a0
        L_0x008f:
            r2 = 9
            goto L_0x00a0
        L_0x0092:
            r2 = 12
            goto L_0x00a0
        L_0x0095:
            r2 = 11
            goto L_0x00a0
        L_0x0098:
            r2 = 5
            goto L_0x00a0
        L_0x009a:
            r2 = 10
            goto L_0x00a0
        L_0x009d:
            r2 = 4
            goto L_0x00a0
        L_0x009f:
            r2 = 3
        L_0x00a0:
            r11.mo37067a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.C23592b.mo37068b(pv1.b):void");
    }

    /* renamed from: c */
    public final int mo37069c(int i) {
        int i2 = i > this.f67702I ? this.f67701H : 0;
        LinkedList<Integer> linkedList = this.f67700G;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; size >= 0; size--) {
                if (i > this.f67700G.get(size).intValue()) {
                    return (i - size) + i2;
                }
            }
        }
        return i + i2;
    }

    /* renamed from: d */
    public final String mo37070d(C21891f.C21892a aVar) {
        List<C99681n> list = aVar.f61909f;
        if (list == null || list.size() <= 0 || aVar.f61909f.get(0) == null) {
            return null;
        }
        return aVar.f61909f.get(0).f292151e;
    }

    /* renamed from: e */
    public void mo37071e() {
        this.f67704a = "";
        this.f67706c = 0;
        this.f67707d = 0;
        this.f67708e = 0;
        this.f67709f = 0;
        this.f67711h = 0;
        this.f67715l = 0;
        this.f67717n = 0;
        this.f67718o = 0;
        this.f67713j = 0;
        this.f67719p = 0;
        this.f67720q = 0;
        this.f67729z = 0;
        this.f67722s = 0;
        this.f67723t = 0;
        this.f67724u = 0;
        this.f67725v = 0;
        this.f67710g = 0;
        this.f67726w = 0;
        ((ArrayList) this.f67703J).clear();
        ((ArrayList) this.f67696C).clear();
        this.f67712i = "";
        this.f67714k = "";
        this.f67721r = "";
        this.f67697D = "";
        this.f67698E = "";
        this.f67700G = null;
        this.f67701H = 0;
        this.f67702I = Integer.MAX_VALUE;
        this.f67699F = true;
    }

    /* renamed from: f */
    public void mo37072f(int i) {
        this.f67726w = i;
        Iterator it = ((ArrayList) this.f67703J).iterator();
        while (it.hasNext()) {
            C21461d dVar = (C21461d) it.next();
            if ("SearchContactBar".equals(dVar.f60765g)) {
                dVar.f60760b = this.f67726w + 1;
            }
        }
        int i2 = this.f67726w;
        Iterator it4 = ((ArrayList) this.f67703J).iterator();
        while (it4.hasNext()) {
            C21461d dVar2 = (C21461d) it4.next();
            if (dVar2.f60765g.startsWith("SOSRelevant:")) {
                dVar2.f60760b = i2;
            }
        }
    }
}
