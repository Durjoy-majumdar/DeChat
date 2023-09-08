package n61;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.pluginsdk.model.C6653c1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96984r2;
import eb0.C75592q0;
import f40.C86709a0;
import j61.C33524s;
import j61.C46439j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C11385n;
import p179jw.C9531b;

/* renamed from: n61.g */
public final class C100095g implements C11385n {

    /* renamed from: d */
    public final int f293229d;

    /* renamed from: e */
    public C93116n f293230e;

    /* renamed from: f */
    public C33524s f293231f;

    /* renamed from: g */
    public C46439j f293232g;

    /* renamed from: h */
    public boolean f293233h;

    /* renamed from: i */
    public boolean f293234i;

    /* renamed from: j */
    public boolean f293235j;

    /* renamed from: n */
    public long f293236n;

    /* renamed from: o */
    public EmoticonStoreActionStruct f293237o = new EmoticonStoreActionStruct();

    /* renamed from: p */
    public final C54219z<Integer> f293238p = new C54219z<>();

    /* renamed from: q */
    public final int f293239q = 1;

    /* renamed from: r */
    public final int f293240r = 2;

    /* renamed from: s */
    public final int f293241s = 3;

    /* renamed from: t */
    public final int f293242t = 4;

    /* renamed from: u */
    public final int f293243u = 5;

    /* renamed from: v */
    public final int f293244v = 6;

    /* renamed from: w */
    public final C9531b.C9532a f293245w = new C100096a(this);

    /* renamed from: n61.g$a */
    public static final class C100096a implements C9531b.C9532a {

        /* renamed from: d */
        public final /* synthetic */ C100095g f293246d;

        public C100096a(C100095g gVar) {
            this.f293246d = gVar;
        }

        /* renamed from: g2 */
        public void mo5537g2(ArrayList<C6653c1> arrayList) {
            C93116n nVar = this.f293246d.f293230e;
            if (C75592q0.m90796z() && arrayList != null && arrayList.size() > 0 && nVar != null) {
                Iterator<C6653c1> it = arrayList.iterator();
                while (it.hasNext()) {
                    C6653c1 next = it.next();
                    if (next != null) {
                        boolean z = true;
                        Log.m105925i("MicroMsg.EmojiStoreV3GoogleMarketTool", "endSeachV3GoogleMarket: %s", next);
                        C96984r2 b = nVar.mo127610b(next.f23970b);
                        if (b != null) {
                            int i = next.f23974f;
                            if (i == 10232) {
                                b.f284152g = next.f23971c;
                                b.f284150e = next.f23972d;
                                b.f284151f = new BigDecimal(next.f23973e).divide(new BigDecimal(1000000)).toString();
                                b.f284148c = 12;
                                int i2 = b.f284147b;
                                if (!(i2 == 7)) {
                                    if (i2 != 6) {
                                        z = false;
                                    }
                                    if (!z) {
                                        b.mo135631a(4);
                                    }
                                }
                            } else {
                                b.f284148c = 10;
                                b.f284149d = i;
                                int i3 = b.f284147b;
                                if (!(i3 == 7)) {
                                    if (!(i3 == 6)) {
                                        if (i3 != 3) {
                                            z = false;
                                        }
                                        if (!z) {
                                            b.mo135631a(10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C100095g(int i) {
        this.f293229d = i;
    }

    /* renamed from: a */
    public final void mo139404a() {
        if (this.f293231f == null) {
            Log.m105924i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "requestNetGetStoreRecList failed, mGetStoreRecListNetScene null");
            return;
        }
        Log.m105924i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "ready to doScene NetSceneGetEmotionStoreRecList");
        this.f293234i = true;
        C86709a0.m107529k().f251779b.mo123460f(this.f293231f);
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [pe3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r3, int r4, java.lang.String r5, ob0.C117747y r6) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSceneEnd errType:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ",errCode:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",errMsg:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MicroMsg.EmojiStoreV3HomeBaseDataRepo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            androidx.lifecycle.z<java.lang.Integer> r5 = r2.f293238p
            int r1 = r2.f293240r
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.setValue(r1)
            if (r6 != 0) goto L_0x003b
            java.lang.String r3 = "onSceneEnd scene null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            return
        L_0x003b:
            int r5 = r6.getType()
            r1 = 6910(0x1afe, float:9.683E-42)
            if (r5 != r1) goto L_0x00c5
            boolean r5 = r6 instanceof j61.C33524s
            if (r5 != 0) goto L_0x004e
            java.lang.String r3 = "sceneType:6910,scene cast NetSceneGetEmotionStoreRecList Failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            return
        L_0x004e:
            r5 = 0
            r2.f293234i = r5
            if (r3 == 0) goto L_0x0056
            r0 = 4
            if (r3 != r0) goto L_0x0057
        L_0x0056:
            r5 = 1
        L_0x0057:
            if (r5 == 0) goto L_0x00b5
            androidx.lifecycle.z<java.lang.Integer> r3 = r2.f293238p
            int r5 = r2.f293244v
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.setValue(r5)
            j61.s r6 = (j61.C33524s) r6
            ob0.c r3 = r6.f90772d
            r5 = 0
            if (r3 != 0) goto L_0x006c
            goto L_0x0077
        L_0x006c:
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            boolean r6 = r3 instanceof te3.C49817i92
            if (r6 == 0) goto L_0x0077
            r5 = r3
            te3.i92 r5 = (te3.C49817i92) r5
        L_0x0077:
            if (r5 != 0) goto L_0x0088
            boolean r3 = r2.f293235j
            if (r3 != 0) goto L_0x0088
            androidx.lifecycle.z<java.lang.Integer> r3 = r2.f293238p
            int r6 = r2.f293242t
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.setValue(r6)
        L_0x0088:
            com.tencent.mm.plugin.emoji.model.n r3 = new com.tencent.mm.plugin.emoji.model.n
            r3.<init>(r5)
            r2.f293230e = r3
            if (r4 != 0) goto L_0x00a9
            androidx.lifecycle.z<java.lang.Integer> r3 = r2.f293238p
            int r4 = r2.f293239q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.setValue(r4)
            zt3.t r3 = zt3.C119157j.f356862d
            n61.h r4 = new n61.h
            r4.<init>(r5, r2)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183884o(r4)
            goto L_0x00cb
        L_0x00a9:
            androidx.lifecycle.z<java.lang.Integer> r3 = r2.f293238p
            int r4 = r2.f293241s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.setValue(r4)
            goto L_0x00cb
        L_0x00b5:
            boolean r3 = r2.f293235j
            if (r3 != 0) goto L_0x00cb
            androidx.lifecycle.z<java.lang.Integer> r3 = r2.f293238p
            int r4 = r2.f293242t
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.setValue(r4)
            goto L_0x00cb
        L_0x00c5:
            java.lang.String r3 = "unknow scene type."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n61.C100095g.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
