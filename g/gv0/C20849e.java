package gv0;

import com.tencent.p014mm.jniinterface.AesEcb;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dv0.C86406l;
import gv0.C20842c;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C11385n;
import pe3.C47465a;
import pe3.C89349b;
import pv0.C100963a0;
import pv0.C100964b0;
import te3.C101780g9;

/* renamed from: gv0.e */
public class C20849e extends C20842c {

    /* renamed from: A */
    public static final /* synthetic */ int f58894A = 0;

    /* renamed from: u */
    public C100963a0 f58895u;

    /* renamed from: v */
    public C100964b0 f58896v;

    /* renamed from: w */
    public C11385n f58897w;

    /* renamed from: x */
    public int f58898x;

    /* renamed from: y */
    public PByteArray f58899y;

    /* renamed from: z */
    public e$$c f58900z;

    public C20849e(e$$d e__d, String str, e$$c e__c, byte[] bArr, byte[] bArr2, int i, C20850f fVar) {
        this.f58895u = new C100963a0();
        this.f58896v = new C100964b0();
        boolean z = false;
        this.f58898x = 0;
        this.f58899y = new PByteArray();
        this.f58900z = null;
        C100963a0 a0Var = this.f58895u;
        a0Var.f295636d = str;
        a0Var.f295637e = 2;
        this.f58897w = new e$$a(this, e__d);
        this.f58900z = e__c;
        e__c.f58905a.add(this);
        if (bArr2 == null) {
            Log.m105928w("MicroMsg.BackupDataPushScene", "BackupDataPushScene media backFileOp buff is null");
            this.f58895u.f295642j = null;
            return;
        }
        C100963a0 a0Var2 = this.f58895u;
        int i2 = this.f58900z.f58907c;
        a0Var2.f295638f = i2;
        a0Var2.f295639g = i;
        int length = i + bArr2.length;
        a0Var2.f295640h = length;
        a0Var2.f295642j = mo32552F1(bArr2, length == i2 ? true : z, bArr);
        mo32553G1();
    }

    /* renamed from: F1 */
    public C89349b mo32552F1(byte[] bArr, boolean z, byte[] bArr2) {
        return (Util.getLength(bArr2) <= 0 || Util.getLength(bArr) <= 0) ? new C89349b(bArr, 0, bArr.length) : new C89349b(AesEcb.aesCryptEcb(bArr, bArr2, true, z));
    }

    /* renamed from: G1 */
    public final void mo32553G1() {
        int i = C20842c.f58885s;
        C20842c.f58885s = i + 1;
        this.f58898x = i;
        try {
            C86406l.m107073a(this.f58895u.toByteArray(), this.f58898x, (short) 6, this.f58899y, C20842c.f58880n);
            int i2 = this.f58898x;
            PByteArray pByteArray = this.f58899y;
            PByteArray pByteArray2 = new PByteArray();
            this.f58888e = pByteArray2;
            pByteArray2.value = pByteArray.value;
            ConcurrentHashMap<Integer, C20842c> concurrentHashMap = C20842c.f58876g;
            synchronized (concurrentHashMap) {
                concurrentHashMap.put(Integer.valueOf(i2), this);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupDataPushScene", e, "PacketBackupDataPush to buf fail:%s", e.toString());
        }
    }

    public int getType() {
        return 6;
    }

    /* renamed from: o1 */
    public boolean mo32547o1() {
        boolean z = false;
        C100963a0 a0Var = this.f58895u;
        Log.m105925i("MicroMsg.BackupDataPushScene", "BackupDataPushScene type:%d, msgid:%s, size:%d, scope:[%d,%d]", Integer.valueOf(this.f58895u.f295637e), a0Var.f295636d, Integer.valueOf(a0Var.f295638f), Integer.valueOf(this.f58895u.f295639g), Integer.valueOf(this.f58895u.f295640h));
        byte[] bArr = this.f58899y.value;
        int i = this.f58898x;
        C20842c.C20843b bVar = C20842c.f58879j;
        if (bVar != null && bVar.mo32549b(i, bArr, 6) == 0) {
            z = true;
        }
        if (!z) {
            this.f58897w.onSceneEnd(1, -2, "doScene failed", this);
        }
        return z;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f58895u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f58896v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        this.f58897w.onSceneEnd(0, this.f58896v.f295648h, "", this);
    }

    public C20849e(e$$d e__d, String str, LinkedList linkedList, byte[] bArr, C20850f fVar) {
        int i;
        this.f58895u = new C100963a0();
        this.f58896v = new C100964b0();
        this.f58898x = 0;
        this.f58899y = new PByteArray();
        byte[] bArr2 = null;
        this.f58900z = null;
        long nowMilliSecond = Util.nowMilliSecond();
        C100963a0 a0Var = this.f58895u;
        a0Var.f295636d = str;
        a0Var.f295637e = 1;
        this.f58897w = new e$$b(this, e__d);
        try {
            C101780g9 g9Var = new C101780g9();
            g9Var.f298276e = linkedList;
            g9Var.f298275d = linkedList.size();
            bArr2 = g9Var.toByteArray();
        } catch (Exception e) {
            Object[] objArr = new Object[2];
            if (linkedList == null) {
                i = -1;
            } else {
                i = linkedList.size();
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = e.getMessage();
            Log.m105921e("MicroMsg.BackupDataPushScene", "BackupDataPushScene text, BakChatMsgList to buf error, list size[%d], errMsg:%s", objArr);
        }
        bArr2 = bArr2 == null ? new byte[0] : bArr2;
        C100963a0 a0Var2 = this.f58895u;
        a0Var2.f295639g = 0;
        a0Var2.f295640h = bArr2.length;
        a0Var2.f295638f = bArr2.length;
        a0Var2.f295642j = mo32552F1(bArr2, true, bArr);
        mo32553G1();
        Log.m105919d("MicroMsg.BackupDataPushScene", "BackupDataPushScene text  msgid:%s, size:%d, packTime:%d, key:%s, msgSize:%d, seq:%d", str, Integer.valueOf(this.f58895u.f295642j.f257327a.length), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), bArr, Integer.valueOf(linkedList.size()), Integer.valueOf(this.f58898x));
    }
}
