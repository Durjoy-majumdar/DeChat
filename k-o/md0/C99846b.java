package md0;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import md0.C99847f;
import ob0.C11385n;
import ob0.C47350c;
import ob0.C89137b0;
import ob0.C89140c0;
import ob0.y$$c;
import ob0.y$$d;
import p206nj.C76861g;
import pe3.C89349b;
import sf0.C36667o0;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.pt4;
import te3.qt4;
import te3.st4;

/* renamed from: md0.b */
public class C99846b extends C76751a implements C1311n {

    /* renamed from: d */
    public C11385n f292556d;

    /* renamed from: e */
    public int f292557e = 0;

    /* renamed from: f */
    public int f292558f = 120;

    /* renamed from: g */
    public C99847f f292559g;

    /* renamed from: h */
    public boolean f292560h = false;

    /* renamed from: i */
    public boolean f292561i = false;

    /* renamed from: j */
    public boolean f292562j = false;

    /* renamed from: n */
    public int f292563n = 0;

    /* renamed from: o */
    public int f292564o = 0;

    /* renamed from: p */
    public String f292565p = null;

    /* renamed from: q */
    public C51163rv3 f292566q = null;

    /* renamed from: r */
    public int f292567r;

    /* renamed from: s */
    public int f292568s = 0;

    /* renamed from: t */
    public String[] f292569t = new String[0];

    /* renamed from: u */
    public int f292570u = 3960;

    /* renamed from: v */
    public MMHandler f292571v = new C76753b(C86709a0.m107525e().getLooper());

    /* renamed from: md0.b$a */
    public class C76752a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C99847f.C99848a f224528d;

        public C76752a(C99847f.C99848a aVar) {
            this.f224528d = aVar;
        }

        public void run() {
            C99847f.C99848a aVar = this.f224528d;
            Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "real doLastScene voiceId:%s, voiceFileMarkEnd:%s,hashCode:%s", aVar.f292576a, Integer.valueOf(aVar.f292579d), Integer.valueOf(C99846b.this.hashCode()));
            C86709a0.m107524d().mo123460f(C99846b.this);
        }
    }

    /* renamed from: md0.b$b */
    public class C76753b extends MMHandler {
        public C76753b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 291 && C99846b.this.mo139200q1()) {
                C86709a0.m107524d().mo123460f(C99846b.this);
            }
        }
    }

    public C99846b(String str, String str2, String str3, int i, int i2) {
        this.f292565p = str;
        this.f292559g = new C99847f(str2);
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str3;
        rv32.f141176e = true;
        this.f292566q = rv32;
        this.f292567r = i;
        this.f292568s = i2;
        Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,session:%s,vadVersion:%s, langType:%d, scene:%s", str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f292556d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new qt4();
        bVar.f127067b = new st4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/voicetrans";
        bVar.f127069d = 235;
        bVar.f127070e = 381;
        bVar.f127071f = 1000000381;
        C47350c a = bVar.mo72403a();
        a.getReqObj().setShortSupport(false);
        qt4 qt4 = (qt4) a.f127055a.f127080a;
        C99847f.C99848a f = this.f292559g.mo139206f(this.f292563n);
        qt4.f299230q = this.f292568s;
        if (f == null) {
            qt4.f299220d = new C51018qv3();
            qt4.f299221e = this.f292563n;
            qt4.f299222f = "0";
            qt4.f299223g = 1;
            qt4.f299224h = 2;
            qt4.f299225i = 0;
            LinkedList<C51163rv3> d = this.f292559g.mo139204d();
            qt4.f299227n = d;
            qt4.f299226j = d.size();
            qt4.f299228o = this.f292566q;
            qt4.f299229p = this.f292567r;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Iterator<C51163rv3> it = qt4.f299227n.iterator();
            while (it.hasNext()) {
                sb.append(it.next().f141175d);
                sb.append(", ");
            }
            sb.append("]");
            Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "send empty packet fetch %s time %s", sb.toString(), Long.valueOf(System.currentTimeMillis()));
            return dispatch(gVar, a, this);
        }
        f.f292577b = true;
        if (this.f292562j) {
            f.f292578c = true;
            qt4.f299220d = new C51018qv3();
            Log.m105924i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
        } else {
            int i = this.f292564o;
            int i2 = this.f292570u;
            if (i > i2) {
                this.f292564o = i2;
                f.f292578c = false;
            } else if (i <= i2 && (f.f292579d != Integer.MAX_VALUE || this.f292560h)) {
                f.f292578c = true;
            }
            byte[] O = C86013q1.m106433O(this.f292565p, this.f292563n, this.f292564o);
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(O);
            qt4.f299220d = qv32;
        }
        qt4.f299221e = this.f292563n;
        qt4.f299222f = f.f292576a;
        qt4.f299223g = f.f292578c ? 1 : 0;
        qt4.f299224h = 2;
        int i3 = f.f292580e + 1;
        f.f292580e = i3;
        qt4.f299225i = i3;
        LinkedList<C51163rv3> d2 = this.f292559g.mo139204d();
        qt4.f299227n = d2;
        qt4.f299226j = d2.size();
        qt4.f299228o = this.f292566q;
        qt4.f299229p = this.f292567r;
        Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "%s, read filename: %s, voiceFileMarkEnd: %s, oldReadOffset: %s, canReadLen %s, getILen %s, isRequestEnd: %s, Seq %s, FetchVoiceIds %s, VadVersion %s, scene:%s", C76861g.m92660c(), this.f292565p, Integer.valueOf(f.f292579d), Integer.valueOf(this.f292563n), Integer.valueOf(this.f292564o), Integer.valueOf(qt4.f299220d.f140572d), Boolean.valueOf(f.f292578c), Integer.valueOf(qt4.f299225i), qt4.f299227n, qt4.f299228o, Integer.valueOf(qt4.f299230q));
        int i4 = this.f292563n + qt4.f299220d.f140572d;
        this.f292563n = i4;
        Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", f.f292576a, Integer.valueOf(i4));
        if (f.f292580e == 1) {
            Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", Long.valueOf(System.currentTimeMillis()));
        }
        Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "send dispatch packet time %s", Long.valueOf(System.currentTimeMillis()));
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 235;
    }

    public boolean isSupportConcurrent() {
        return true;
    }

    /* renamed from: j1 */
    public int mo72188j1() {
        return this.f292557e;
    }

    /* renamed from: k1 */
    public String[] mo72189k1() {
        return this.f292569t;
    }

    /* renamed from: l1 */
    public long mo72190l1() {
        return 0;
    }

    /* renamed from: m1 */
    public List<String> mo72191m1() {
        C99847f fVar = this.f292559g;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        ((ReentrantReadWriteLock) fVar.f292574c).readLock().lock();
        for (C99847f.C99848a next : fVar.f292573b.values()) {
            if (next.f292577b) {
                arrayList.add(next.f292576a);
            }
        }
        ((ReentrantReadWriteLock) fVar.f292574c).readLock().unlock();
        return arrayList;
    }

    /* renamed from: n1 */
    public void mo72192n1() {
        this.f292560h = true;
    }

    /* renamed from: o1 */
    public void mo139198o1(int i) {
        Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "%s %s", C76861g.m92660c(), Integer.valueOf(i));
        if (i >= 0) {
            this.f292559g.mo139203c(i);
            return;
        }
        throw new IllegalStateException();
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4;
        C89349b bVar;
        int i5 = i2;
        int i6 = i3;
        String str3 = str;
        int i7 = 1;
        Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "%s time:%s errType: %s, errCode: %s, errMsg: %s", C76861g.m92660c(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i2), Integer.valueOf(i3), str3);
        if (i5 == 3 && i6 == -1) {
            Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "getStack([ %s ]), ThreadID: %s", Util.getStack(), Long.valueOf(Thread.currentThread().getId()));
        }
        C47350c cVar = (C47350c) uVar;
        qt4 qt4 = (qt4) cVar.f127055a.f127080a;
        st4 st4 = (st4) cVar.f127056b.f127083a;
        if (i5 == 0 && i6 == 0) {
            Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd voiceId = %s, seq = %s, time = %s", qt4.f299222f, Integer.valueOf(qt4.f299225i), Long.valueOf(System.currentTimeMillis()));
            C99847f fVar = this.f292559g;
            LinkedList<pt4> linkedList = st4.f141750e;
            fVar.getClass();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(linkedList == null ? 0 : linkedList.size());
            ((ReentrantReadWriteLock) fVar.f292574c).readLock().lock();
            if (fVar.f292573b.size() == 0) {
                ((ReentrantReadWriteLock) fVar.f292574c).readLock().unlock();
                str2 = "[]";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (C99847f.C99848a aVar : fVar.f292573b.values()) {
                    sb.append(aVar.f292576a);
                    sb.append(", ");
                }
                if (sb.length() <= 3) {
                    ((ReentrantReadWriteLock) fVar.f292574c).readLock().unlock();
                    sb.append("]");
                    str2 = sb.toString();
                } else {
                    sb.setLength(sb.length() - 2);
                    ((ReentrantReadWriteLock) fVar.f292574c).readLock().unlock();
                    sb.append("]");
                    str2 = sb.toString();
                }
            }
            objArr[1] = str2;
            Log.m105919d("MicroMsg.ShortSentenceContainer", "updateVoiceInfoResult respVTList size %s innerContainer %s", objArr);
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105924i("MicroMsg.ShortSentenceContainer", "respList == null");
            } else {
                ((ReentrantReadWriteLock) fVar.f292574c).readLock().lock();
                for (pt4 next : linkedList) {
                    if (next == null) {
                        Log.m105924i("MicroMsg.ShortSentenceContainer", "setFetchedVoiceInfoResult voiceTransCell is null.");
                    } else {
                        C99847f.C99848a aVar2 = fVar.f292573b.get(next.f139973e);
                        if (aVar2 == null) {
                            Object[] objArr2 = new Object[i7];
                            objArr2[0] = next.f139973e;
                            Log.m105925i("MicroMsg.ShortSentenceContainer", "voiceInfoContainer not found the voiceId %s", objArr2);
                        } else {
                            Object[] objArr3 = new Object[12];
                            objArr3[0] = next.f139973e;
                            objArr3[i7] = Integer.valueOf(next.f139975g);
                            C51018qv3 qv32 = next.f139972d;
                            String str4 = null;
                            objArr3[2] = (qv32 == null || qv32.f140574f == null) ? null : Integer.valueOf(qv32.f140572d);
                            objArr3[3] = Boolean.valueOf(next.f139974f != 0);
                            objArr3[4] = Integer.valueOf(next.f139974f);
                            objArr3[5] = aVar2.f292576a;
                            objArr3[6] = Boolean.valueOf(aVar2.f292577b);
                            objArr3[7] = Boolean.valueOf(aVar2.f292578c);
                            objArr3[8] = Integer.valueOf(aVar2.f292579d);
                            objArr3[9] = Integer.valueOf(aVar2.f292581f);
                            String str5 = aVar2.f292582g;
                            objArr3[10] = str5 == null ? null : Integer.valueOf(str5.length());
                            objArr3[11] = Boolean.valueOf(aVar2.f292583h);
                            Log.m105919d("MicroMsg.ShortSentenceContainer", "update VoiceInfo get {cell} %s, seq %s, text %s, endFlag %s, endFlag %s {currentInfo} %s, isRequestStart %s, isRequestEnd %s, voiceFileMark %s, seq %s, data %s, isResponseEnd %s", objArr3);
                            int i8 = next.f139975g;
                            if (i8 < aVar2.f292581f || aVar2.f292583h) {
                                Log.m105918d("MicroMsg.ShortSentenceContainer", "update seq not fit.");
                            } else {
                                aVar2.f292581f = i8;
                                C51018qv3 qv33 = next.f139972d;
                                if (!(qv33 == null || (bVar = qv33.f140574f) == null)) {
                                    str4 = bVar.mo123705h();
                                }
                                aVar2.f292582g = str4;
                                aVar2.f292583h = next.f139974f != 0;
                                Object[] objArr4 = new Object[4];
                                objArr4[0] = next.f139973e;
                                objArr4[1] = Integer.valueOf(aVar2.f292581f);
                                objArr4[2] = Boolean.valueOf(aVar2.f292583h);
                                String str6 = aVar2.f292582g;
                                objArr4[3] = Integer.valueOf(str6 == null ? -1 : str6.length());
                                Log.m105925i("MicroMsg.ShortSentenceContainer", "update VoiceId = %s,respSeq = %s,isResponseEnd = %s,data.length = %s", objArr4);
                                if (next.f139974f == 2) {
                                    Log.m105921e("MicroMsg.ShortSentenceContainer", "update cell.EndFlag = 2 VoiceId = %s", next.f139973e);
                                }
                            }
                            i7 = 1;
                        }
                    }
                }
                ((ReentrantReadWriteLock) fVar.f292574c).readLock().unlock();
            }
            if (!this.f292559g.mo139205e() || !this.f292560h) {
                i4 = 1;
            } else {
                Log.m105918d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd isAllRespEnd && isRecordFinish");
                Log.m105918d("MicroMsg.NetSceneNewVoiceInput", C76861g.m92660c());
                MMHandler mMHandler = this.f292571v;
                if (mMHandler != null) {
                    mMHandler.removeMessages(291);
                }
                i4 = 1;
                this.f292561i = true;
            }
            String[] strArr = new String[i4];
            C99847f fVar2 = this.f292559g;
            fVar2.f292575d.setLength(0);
            ((ReentrantReadWriteLock) fVar2.f292574c).readLock().lock();
            for (C99847f.C99848a aVar3 : fVar2.f292573b.values()) {
                String str7 = aVar3.f292582g;
                if (str7 != null) {
                    fVar2.f292575d.append(str7);
                }
            }
            ((ReentrantReadWriteLock) fVar2.f292574c).readLock().unlock();
            strArr[0] = fVar2.f292575d.toString();
            this.f292569t = strArr;
            this.f292556d.onSceneEnd(i5, i6, str3, this);
            int i9 = st4.f141752g;
            if (i9 <= 0) {
                i9 = this.f292570u;
            }
            this.f292570u = i9;
            int i15 = st4.f141751f;
            if (i15 < 0) {
                i15 = 120;
            }
            this.f292558f = i15;
            Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd max_send_byte_per_pack = %s, interval = %s", Integer.valueOf(i9), Integer.valueOf(this.f292558f));
            return;
        }
        Log.m105925i("MicroMsg.NetSceneNewVoiceInput", C76861g.m92660c() + " onGYNetEnd file: %s errType:%s errCode:%s", this.f292565p, Integer.valueOf(i2), Integer.valueOf(i3));
        mo139199p1();
        this.f292556d.onSceneEnd(i5, i6, str3, this);
    }

    /* renamed from: p1 */
    public void mo139199p1() {
        Log.m105918d("MicroMsg.NetSceneNewVoiceInput", C76861g.m92660c());
        if (!this.f292562j) {
            this.f292562j = true;
            Log.m105918d("MicroMsg.NetSceneNewVoiceInput", C76861g.m92660c());
            MMHandler mMHandler = this.f292571v;
            if (mMHandler != null) {
                mMHandler.removeMessages(291);
            }
            this.f292561i = true;
            C89137b0 d = C86709a0.m107524d();
            int hashCode = hashCode();
            d.getClass();
            Log.printInfoStack("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", Integer.valueOf(hashCode));
            C36667o0 o0Var = d.f256819q;
            C89140c0 c0Var = new C89140c0(d, hashCode);
            o0Var.getClass();
            o0Var.mo60790a(c0Var, 0, true);
            C99847f.C99848a f = this.f292559g.mo139206f(this.f292563n);
            if (f != null) {
                this.f292564o = 0;
                C86709a0.m107525e().postToWorker(new C76752a(f));
            }
        }
    }

    /* renamed from: q1 */
    public boolean mo139200q1() {
        Log.m105918d("MicroMsg.NetSceneNewVoiceInput", "preDoScene");
        this.f292571v.removeMessages(291);
        if ((!this.f292559g.mo139205e() || !this.f292560h) && !this.f292561i) {
            C99847f.C99848a f = this.f292559g.mo139206f(this.f292563n);
            if (f != null) {
                long l = C86013q1.m106451l(this.f292565p);
                long min = Math.min(l, (long) f.f292579d);
                Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "fileLength %s info.voiceFileMark %s nowMarkLen %s", Long.valueOf(l), Integer.valueOf(f.f292579d), Long.valueOf(min));
                if (min <= 0) {
                    Log.m105921e("MicroMsg.NetSceneNewVoiceInput", "nowMarkLen <= 0 read failed :%s", this.f292565p);
                    this.f292557e = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
                    this.f292564o = 0;
                    mo139199p1();
                    C11385n nVar = this.f292556d;
                    if (nVar != null) {
                        nVar.onSceneEnd(3, -1, "ReadFileLengthError", this);
                    }
                    return false;
                }
                int i = (int) (min - ((long) this.f292563n));
                this.f292564o = i;
                if (i < 0) {
                    Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "canReadLen < 0 length:%s ", Integer.valueOf(i));
                    this.f292557e = C76861g.m92658a() + CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
                    this.f292571v.sendEmptyMessageDelayed(291, (long) (this.f292558f * 2));
                    return false;
                }
                Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s,reqSeq:%s,interval:%s", Integer.valueOf(i), Integer.valueOf(f.f292580e), Integer.valueOf(this.f292558f));
                int i2 = this.f292564o;
                if (i2 >= 500 || f.f292580e <= 5) {
                    this.f292571v.sendEmptyMessageDelayed(291, (long) this.f292558f);
                } else {
                    Log.m105919d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s double interval", Integer.valueOf(i2));
                    this.f292571v.sendEmptyMessageDelayed(291, (long) (this.f292558f * 2));
                }
                return true;
            }
            this.f292571v.sendEmptyMessageDelayed(291, (long) (this.f292558f * 2));
            return true;
        }
        Log.m105924i("MicroMsg.NetSceneNewVoiceInput", "preDoScene return");
        return false;
    }

    public int securityLimitCount() {
        return 2000;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
        Log.m105929w("MicroMsg.NetSceneNewVoiceInput", C76861g.m92660c() + " setSecurityCheckError e: %s", y__c);
        if (y__c == y$$c.EReachMaxLimit) {
            mo139199p1();
            this.f292556d.onSceneEnd(3, -1, "SecurityCheckError", this);
        }
    }

    public C99846b(String str, C99847f fVar, String str2, int i, int i2) {
        this.f292565p = str;
        this.f292559g = fVar;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str2;
        rv32.f141176e = true;
        this.f292566q = rv32;
        this.f292567r = i;
        this.f292568s = i2;
        Log.m105925i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,container:%s,vadVersion:%s, langType:%d, scene:%s", str, fVar, str2, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
