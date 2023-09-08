package vk3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.j */
public class C37748j implements C78430l<C72963f4> {

    /* renamed from: a */
    public Cursor f99981a;

    /* renamed from: b */
    public String f99982b;

    /* renamed from: c */
    public int f99983c;

    /* renamed from: d */
    public int f99984d;

    /* renamed from: e */
    public C76227e.C76228a f99985e;

    /* renamed from: f */
    public C37749a f99986f;

    /* renamed from: g */
    public long f99987g;

    /* renamed from: vk3.j$a */
    public interface C37749a {
    }

    public C37748j(String str, int i, int i2, C76227e.C76228a aVar, C37749a aVar2) {
        this.f99982b = str;
        this.f99983c = i;
        this.f99984d = i2;
        this.f99985e = aVar;
        this.f99986f = aVar2;
    }

    /* renamed from: a */
    public final void mo61321a(List<C72963f4> list) {
        try {
            this.f99981a.moveToFirst();
            while (!this.f99981a.isAfterLast()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(this.f99981a);
                list.add(f4Var);
                this.f99981a.moveToNext();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", e, "", new Object[0]);
        }
    }

    public void close() {
        this.f99981a.close();
    }

    /* renamed from: p */
    public int mo61317p() {
        return this.f99984d;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61318q(java.util.List<com.tencent.p014mm.storage.C72963f4> r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.mo61321a(r0)
            hk3.e$a r1 = r10.f99985e
            hk3.e$a r2 = hk3.C76227e.C76228a.ACTION_POSITION
            r3 = 1
            r4 = 2
            r5 = 0
            java.lang.String r6 = "MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource"
            if (r1 == r2) goto L_0x0060
            hk3.e$a r2 = hk3.C76227e.C76228a.ACTION_UPDATE
            if (r1 != r2) goto L_0x0018
            goto L_0x0060
        L_0x0018:
            int r1 = r10.f99983c
            if (r1 < r4) goto L_0x0047
            int r1 = r0.size()
            int r2 = r10.f99983c
            if (r1 >= r2) goto L_0x0025
            goto L_0x0047
        L_0x0025:
            vk3.j$a r1 = r10.f99986f
            java.lang.Object r2 = r0.get(r5)
            com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2
            java.lang.Object r7 = r0.get(r3)
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            wk3.g$a r1 = (wk3.C78619g.C78620a) r1
            boolean r1 = r1.mo108603a(r2, r7)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r2[r5] = r7
            java.lang.String r7 = "need load more data: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r2)
            goto L_0x0061
        L_0x0047:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r2 = r10.f99983c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            int r2 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            java.lang.String r2 = "check if need load more data, but list is null or less than expect, except count: %d, actual count: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r1)
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x00f1
            java.lang.String r1 = "contain flex data, load more"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r0.clear()
            r10.close()
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.f r1 = r1.mo96093DX()
            java.lang.String r2 = r10.f99982b
            com.tencent.mm.storage.n2 r1 = (com.tencent.p014mm.storage.C72986n2) r1
            long r1 = r1.mo101184jo(r2)
            int r7 = r10.f99983c
            int r7 = r7 + 8
            int r8 = r10.f99984d
            int r7 = java.lang.Math.min(r7, r8)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = r10.f99982b
            r8[r5] = r9
            int r5 = r10.f99983c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r3] = r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r8[r4] = r3
            r3 = 3
            int r4 = r10.f99984d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8[r3] = r4
            r3 = 4
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r8[r3] = r4
            java.lang.String r3 = "[ChattingServiceNotifyDataSource] talker:%s count:%d ,countForExtraMsg:%d, mTotalCount:%d createTime:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r3, r8)
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            java.lang.String r4 = r10.f99982b
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            android.database.Cursor r1 = r3.zx0(r4, r7, r1)
            r10.f99981a = r1
            r10.mo61321a(r0)
            r1 = 7
        L_0x00cc:
            if (r1 <= 0) goto L_0x00e9
            vk3.j$a r2 = r10.f99986f
            java.lang.Object r3 = r0.get(r1)
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            int r4 = r1 + -1
            java.lang.Object r5 = r0.get(r4)
            com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
            wk3.g$a r2 = (wk3.C78619g.C78620a) r2
            boolean r2 = r2.mo108603a(r3, r5)
            if (r2 != 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r1 = r4
            goto L_0x00cc
        L_0x00e9:
            int r2 = r0.size()
            java.util.List r0 = r0.subList(r1, r2)
        L_0x00f1:
            r11.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk3.C37748j.mo61318q(java.util.List):void");
    }

    /* renamed from: r */
    public void mo61319r(C76227e.C32942b bVar) {
        this.f99987g = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(this.f99982b);
        Log.m105919d("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", "[ChattingServiceNotifyDataSource] talker:%s count:%d mTotalCount:%d createTime:%d", this.f99982b, Integer.valueOf(this.f99983c), Integer.valueOf(this.f99984d), Long.valueOf(this.f99987g));
        this.f99981a = ((C72972g4) C97625j3.m125812b().mo105911z()).zx0(this.f99982b, this.f99983c, this.f99987g);
        bVar.next();
    }

    /* renamed from: s */
    public long mo61320s() {
        return this.f99987g;
    }
}
