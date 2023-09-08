package com.tencent.p014mm.plugin.talkroom.component;

import a70.C112760b;
import android.os.Looper;
import com.tencent.p014mm.plugin.talkroom.component.C115781a;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import java.io.IOException;
import p156gj.C107842p;
import p206nj.C88957l;
import p734vz.C102300g;
import te3.af4;
import te3.hv4;

/* renamed from: com.tencent.mm.plugin.talkroom.component.f */
public class C115795f extends C115781a.C115782a {

    /* renamed from: e */
    public final v2engine f347370e = new v2engine();

    /* renamed from: f */
    public final MMHandler f347371f = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$e */
    public class C43186e extends SyncTask<Integer> {

        /* renamed from: a */
        public final /* synthetic */ String[] f116863a;

        /* renamed from: b */
        public final /* synthetic */ int[] f116864b;

        /* renamed from: c */
        public final /* synthetic */ ILiveConEngineCallback_AIDL f116865c;

        /* renamed from: d */
        public final /* synthetic */ int f116866d;

        /* renamed from: e */
        public final /* synthetic */ int f116867e;

        /* renamed from: f */
        public final /* synthetic */ int f116868f;

        /* renamed from: g */
        public final /* synthetic */ long f116869g;

        /* renamed from: h */
        public final /* synthetic */ int f116870h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43186e(long j, Integer num, String[] strArr, int[] iArr, ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i, int i2, int i3, long j2, int i4) {
            super(j, num);
            this.f116863a = strArr;
            this.f116864b = iArr;
            this.f116865c = iLiveConEngineCallback_AIDL;
            this.f116866d = i;
            this.f116867e = i2;
            this.f116868f = i3;
            this.f116869g = j2;
            this.f116870h = i4;
        }

        public Object run() {
            try {
                hv4 hv4 = new hv4();
                Log.m105925i("MicroMsg.TalkRoomEngineProxy", "Open Engine svr cnt %d", Integer.valueOf(this.f116863a.length));
                for (int i = 0; i < this.f116863a.length; i++) {
                    af4 af4 = new af4();
                    String str = this.f116863a[i];
                    af4.f130484d = str;
                    if (str == null) {
                        Log.m105924i("MicroMsg.TalkRoomEngineProxy", "Open Engine ip_str null skip");
                    } else {
                        af4.f130485e = this.f116864b[i];
                        hv4.f134899d.add(af4);
                        Log.m105925i("MicroMsg.TalkRoomEngineProxy", "Open Engine svr:[%s][%d] ", af4.f130484d, Integer.valueOf(af4.f130485e));
                    }
                }
                Log.m105925i("MicroMsg.TalkRoomEngineProxy", "Open Engine valid svr cnt %d", Integer.valueOf(hv4.f134899d.size()));
                return Integer.valueOf(C115795f.this.f347370e.Open(this.f116865c, this.f116866d, this.f116867e, this.f116868f, this.f116869g, this.f116870h, hv4.toByteArray(), hv4.toByteArray().length));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomEngineProxy", e, "engine.Open exception", new Object[0]);
                return -1;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$a */
    public class C115796a extends SyncTask<Integer> {
        public C115796a(long j, Integer num) {
            super(j, num);
        }

        public Object run() {
            return Integer.valueOf(C115795f.this.f347370e.uninitLive());
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$b */
    public class C115797b extends SyncTask<Integer> {

        /* renamed from: a */
        public final /* synthetic */ int f347373a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115797b(long j, Integer num, int i) {
            super(j, num);
            this.f347373a = i;
        }

        public Object run() {
            return Integer.valueOf(C115795f.this.f347370e.SetCurrentMicId(this.f347373a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$c */
    public class C115798c extends SyncTask<Integer> {
        public C115798c(long j, Integer num) {
            super(j, num);
        }

        public Object run() {
            return Integer.valueOf(C115795f.this.f347370e.Close());
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$d */
    public class C115799d extends SyncTask<Integer> {
        public C115799d(long j, Integer num) {
            super(j, num);
        }

        public Object run() {
            int a = C107842p.m146108a();
            Log.m105925i("MicroMsg.TalkRoomEngineProxy", "initLive cpuFlag: %d", Integer.valueOf(a));
            v2engine v2engine = C115795f.this.f347370e;
            int initLive = v2engine.initLive(a, C112760b.m154216X() + "lib/");
            Log.m105925i("MicroMsg.TalkRoomEngineProxy", "initLive %d ", Integer.valueOf(initLive));
            return Integer.valueOf(initLive);
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$f */
    public class C115800f extends SyncTask<byte[]> {

        /* renamed from: a */
        public final /* synthetic */ int[] f347377a;

        /* renamed from: b */
        public final /* synthetic */ String f347378b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115800f(long j, byte[] bArr, int[] iArr, String str) {
            super(j, bArr);
            this.f347377a = iArr;
            this.f347378b = str;
        }

        public Object run() {
            PByteArray pByteArray = new PByteArray();
            this.f347377a[0] = C115795f.this.f347370e.GetStatis(pByteArray, this.f347378b);
            return pByteArray.value;
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$g */
    public class C115801g extends SyncTask<C115790d> {

        /* renamed from: a */
        public final /* synthetic */ C115784b f347380a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115801g(long j, C115790d dVar, C115784b bVar) {
            super(j, dVar);
            this.f347380a = bVar;
        }

        public Object run() {
            return new C115803g(C115795f.this.f347370e, this.f347380a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.talkroom.component.f$h */
    public class C115802h extends SyncTask<C115787c> {
        public C115802h(long j, C115787c cVar) {
            super(j, cVar);
        }

        public Object run() {
            return new C115793e(C115795f.this.f347370e);
        }
    }

    static {
        C102300g.m134933a();
        C88957l.m111079o("voipMain", C115795f.class.getClassLoader());
    }

    public C115790d Ab0(C115784b bVar) {
        return (C115790d) new C115801g(3000, (C115790d) null, bVar).exec(this.f347371f);
    }

    public int B60() {
        return ((Integer) new C115796a(3000, -99999).exec(this.f347371f)).intValue();
    }

    /* renamed from: OO */
    public byte[] mo176143OO(int[] iArr, String str) {
        return (byte[]) new C115800f(3000, (byte[]) null, iArr, str).exec(this.f347371f);
    }

    /* renamed from: Ud */
    public C115787c mo176144Ud() {
        return (C115787c) new C115802h(3000, (C115787c) null).exec(this.f347371f);
    }

    /* renamed from: kg */
    public int mo176145kg(ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i, int i2, int i3, long j, int[] iArr, int[] iArr2, int i4, String[] strArr) {
        int[] iArr3 = iArr2;
        short[] sArr = new short[iArr3.length];
        for (int i5 = 0; i5 < iArr3.length; i5++) {
            sArr[i5] = (short) iArr3[i5];
        }
        return ((Integer) new C43186e(3000, -99999, strArr, iArr2, iLiveConEngineCallback_AIDL, i, i2, i3, j, i4).exec(this.f347371f)).intValue();
    }

    /* renamed from: pl */
    public int mo176146pl() {
        return ((Integer) new C115799d(30000, -99999).exec(this.f347371f)).intValue();
    }

    public int ss0(int i) {
        return ((Integer) new C115797b(3000, -99999, i).exec(this.f347371f)).intValue();
    }

    public int xs0() {
        return ((Integer) new C115798c(3000, -99999).exec(this.f347371f)).intValue();
    }
}
