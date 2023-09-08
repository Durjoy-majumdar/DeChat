package vk3;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72988o1;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75871e;
import hk3.C76227e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p788aj.C67053c;
import p788aj.C67054d;

/* renamed from: vk3.g */
public class C78429g implements C78430l<C72963f4> {

    /* renamed from: a */
    public String f229791a;

    /* renamed from: b */
    public Cursor f229792b;

    /* renamed from: c */
    public C76227e.C76228a f229793c;

    /* renamed from: d */
    public long f229794d;

    /* renamed from: e */
    public long f229795e;

    /* renamed from: f */
    public long f229796f;

    /* renamed from: g */
    public int f229797g;

    /* renamed from: h */
    public Bundle f229798h;

    /* renamed from: i */
    public C76227e.C76230d f229799i;

    /* renamed from: j */
    public boolean f229800j;

    public C78429g(String str, C76227e.C76228a aVar, Bundle bundle, long j, long j2, long j3, int i, C76227e.C76230d dVar, boolean z) {
        this.f229796f = j;
        this.f229794d = j2;
        this.f229795e = j3;
        this.f229797g = i;
        this.f229791a = str;
        this.f229793c = aVar;
        this.f229798h = bundle;
        this.f229799i = dVar;
        this.f229800j = z;
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[ChattingGetDataSource] mLastTopCreateTime:" + this.f229794d + " mLastBottomCreateTime:" + this.f229795e + " isFromSearch:" + z + " mLastCount:" + this.f229797g + " mLastBottomMsgSeq:" + this.f229796f + " mTalker:" + this.f229791a + " action:" + aVar);
    }

    /* renamed from: a */
    public final void mo108376a(C76227e.C32942b bVar) {
        Log.m105920e("MicroMsg.ChattingLoader.ChattingGetDataSource", "[fallback]");
        mo108382g(bVar);
    }

    /* renamed from: b */
    public final long mo108377b(long j) {
        C67053c s = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101213s(this.f229791a, j, true);
        if (s == null) {
            return mo108379d();
        }
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findLastBlockFirstCreateTime] has block! so return just lastBlock of lastCreateTime! firstCreateTime:" + s.f192603f + " time:" + j);
        return s.f192603f;
    }

    /* renamed from: c */
    public final long mo108378c() {
        C67053c z = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101220z(this.f229791a);
        if (z == null) {
            return this.f229794d;
        }
        Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findLastBlockLastSeq] has block! so return just lastBlock of lastCreateTime! lastCreateTime:" + z.f192604g + " seq:" + z.f192601d + "~" + z.f192602e);
        return z.f192604g;
    }

    public void close() {
        Cursor cursor = this.f229792b;
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: d */
    public final long mo108379d() {
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Dx0(this.f229791a);
    }

    /* renamed from: e */
    public final long mo108380e() {
        Class cls = C75700k0.class;
        C72988o1 v = ((C75700k0) C86709a0.m107533q(cls)).mo96101cU().mo101216v(this.f229791a);
        long j = this.f229796f;
        if (j > 0) {
            v.getClass();
            LinkedList linkedList = new LinkedList();
            C67054d dVar = v.field_seqBlockInfo;
            if (dVar != null) {
                Iterator<C67053c> it = dVar.f192605d.iterator();
                while (it.hasNext()) {
                    C67053c next = it.next();
                    if (next.f192601d > j) {
                        linkedList.add(next);
                    }
                }
            }
            boolean z = false;
            Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findUpdateLastCreateTime] list size=", Integer.valueOf(linkedList.size()));
            if (linkedList.size() > 0) {
                C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(this.f229791a);
                long createTime = Ex0.getCreateTime();
                StringBuilder sb = new StringBuilder();
                sb.append("[findUpdateLastCreateTime]isSender=");
                if (Ex0.mo108769t2() == 1) {
                    z = true;
                }
                sb.append(z);
                sb.append(" mLastBottomMsgSeq=");
                sb.append(this.f229796f);
                sb.append(" chatroomMsgSeq:");
                sb.append(v);
                sb.append(" mLastBottomCreateTime=");
                sb.append(this.f229795e);
                sb.append(" localLastMsgCreateTime=");
                sb.append(createTime);
                Log.m105928w("MicroMsg.ChattingLoader.ChattingGetDataSource", sb.toString());
                return Ex0.mo108769t2() == 1 ? createTime : this.f229795e;
            }
        }
        return mo108379d();
    }

    /* renamed from: f */
    public final void mo108381f(C76227e.C32942b bVar) {
        long c = mo108378c();
        long d = mo108379d();
        Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleEnter] from:%d to:%d", Long.valueOf(c), Long.valueOf(d));
        this.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Pq0(this.f229791a, c, d, 18);
        bVar.next();
    }

    /* renamed from: g */
    public final void mo108382g(C76227e.C32942b bVar) {
        C72963f4 Ex0;
        Class cls = C75700k0.class;
        Bundle bundle = this.f229799i.f223307a;
        boolean z = false;
        boolean z2 = bundle != null && bundle.getBoolean("has_position_tongue", false);
        Bundle bundle2 = this.f229799i.f223307a;
        if (bundle2 != null && bundle2.getBoolean("has_position_search", false)) {
            z = true;
        }
        if (!z2 || (Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(this.f229791a)) == null || Ex0.mo108769t2() != 1 || Ex0.mo108772w2() != 0) {
            if (this.f229794d == 0) {
                Log.m105928w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findUpdateFirstCreateTime] mLastTopCreateTime == 0");
                this.f229794d = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ky0(this.f229791a, mo108379d(), 18);
            }
            long j = this.f229794d;
            long e = z2 ? mo108380e() : z ? this.f229795e : mo108380e();
            Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleUpdate] talker:" + this.f229791a + " from:" + j + " to:" + e + " hasTongue:" + z2);
            this.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Pq0(this.f229791a, j, e, Integer.MAX_VALUE);
            bVar.next();
            return;
        }
        mo108381f(bVar);
        C76227e.C76230d dVar = this.f229799i;
        if (dVar.f223307a == null) {
            dVar.f223307a = new Bundle();
        }
        this.f229799i.f223307a.putBoolean("need_scroll_to_bottom", true);
        Log.m105928w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleUpdate] send msg! need scroll to bottom!");
    }

    /* renamed from: p */
    public int mo61317p() {
        return ((C72972g4) C97625j3.m125812b().mo105911z()).Vx0(this.f229791a);
    }

    /* renamed from: q */
    public void mo61318q(List<C72963f4> list) {
        Cursor cursor = this.f229792b;
        if (cursor == null) {
            Log.m105920e("MicroMsg.ChattingLoader.ChattingGetDataSource", "[fillItem] cursor is null");
            return;
        }
        cursor.moveToFirst();
        while (!this.f229792b.isAfterLast()) {
            try {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(this.f229792b);
                list.add(f4Var);
                this.f229792b.moveToNext();
            } catch (IllegalStateException e) {
                Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingGetDataSource", e, "", new Object[0]);
                return;
            }
        }
    }

    /* renamed from: r */
    public void mo61319r(C76227e.C32942b bVar) {
        int i;
        C76227e.C32942b bVar2 = bVar;
        Class cls = C75700k0.class;
        int ordinal = this.f229793c.ordinal();
        if (ordinal == 0) {
            C75871e cU = ((C75700k0) C86709a0.m107533q(cls)).mo96101cU();
            C67053c w = cU.mo101217w(this.f229791a, this.f229794d);
            long j = w == null ? 0 : w.f192604g;
            long j2 = this.f229794d;
            int X90 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).X90(this.f229791a, j, j2);
            StringBuilder sb = new StringBuilder();
            sb.append("[handleLoadTop] talker:");
            sb.append(this.f229791a);
            sb.append(" from:");
            sb.append(j);
            sb.append(" to:");
            C75871e eVar = cU;
            sb.append(j2);
            sb.append(" count:");
            sb.append(X90);
            sb.append(" seqBlock is null? ");
            sb.append(w == null);
            Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", sb.toString());
            if (X90 >= 18 || w == null) {
                long j3 = this.f229795e;
                Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadTop] talker:" + this.f229791a + " from:" + j + " to:" + j3 + " count:" + (this.f229797g + 18));
                this.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Pq0(this.f229791a, j, j3, this.f229797g + 18);
                bVar.next();
                return;
            }
            C68111c.m80513e().mo93622d(this.f229791a, w.f192602e, w.f192601d, 1, new C78428f(this, w.f192603f, eVar, w.f192604g, bVar));
        } else if (ordinal == 1) {
            Bundle bundle = this.f229798h;
            if (bundle == null || !bundle.getBoolean("load_bottom", false)) {
                C75871e cU2 = ((C75700k0) C86709a0.m107533q(cls)).mo96101cU();
                C67053c s = cU2.mo101213s(this.f229791a, this.f229795e, true);
                if (s != null) {
                    C68111c.m80513e().mo93622d(this.f229791a, s.f192601d, s.f192602e, 0, new C78426d(this, bVar2));
                    return;
                }
                Log.m105928w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] null == seqBlock talker:" + this.f229791a + " mLastBottomCreateTime:" + this.f229795e);
                C72988o1 v = cU2.mo101216v(this.f229791a);
                C68111c.m80513e().mo93622d(this.f229791a, v.field_lastLocalSeq + 1, v.field_lastPushSeq, 0, new C78427e(this, bVar2));
                return;
            }
            C72988o1 v2 = ((C75700k0) C86709a0.m107533q(cls)).mo96101cU().mo101216v(this.f229791a);
            C68111c.m80513e().mo93622d(this.f229791a, v2.field_lastPushSeq, v2.field_lastLocalSeq + 1, 1, new C78425c(this, bVar2));
        } else if (ordinal == 2) {
            mo108382g(bVar);
        } else if (ordinal == 3) {
            mo108381f(bVar);
        } else if (ordinal == 4) {
            if (this.f229800j) {
                long j4 = this.f229798h.getLong("MSG_ID");
                boolean z = this.f229798h.getBoolean("IS_LOAD_ALL", false);
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j4);
                if (b002.getMsgId() != j4) {
                    Log.m105929w("MicroMsg.ChattingLoader.ChattingGetDataSource", "get msg info by id %d error", Long.valueOf(j4));
                    bVar.next();
                    return;
                }
                long createTime = b002.getCreateTime();
                C72963f4 f4Var = b002;
                Log.m105919d("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePositionForSearch] targetCreateTime:%s [%s:%s]", Long.valueOf(createTime), Long.valueOf(this.f229794d), Long.valueOf(this.f229795e));
                if (createTime < this.f229794d || createTime > this.f229795e) {
                    long createTime2 = f4Var.getCreateTime();
                    long min = Math.min(mo108377b(f4Var.getCreateTime()), ((C72972g4) C97625j3.m125812b().mo105911z()).Jt0(this.f229791a, createTime2, 18));
                    Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePositionForSearch] [from:%s to:%s] messageId:%s isLoadAllBottomMsg:%s selection:%s", Long.valueOf(createTime2), Long.valueOf(min), Long.valueOf(j4), Boolean.valueOf(z), 0);
                    this.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Pq0(this.f229791a, createTime2, min, Integer.MAX_VALUE);
                    i = 0;
                } else {
                    this.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Pq0(this.f229791a, this.f229794d, this.f229795e, Integer.MAX_VALUE);
                    i = ((C72972g4) C97625j3.m125812b().mo105911z()).X90(this.f229791a, this.f229794d, createTime) - 1;
                    Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePositionForSearch] selection:%s messageId:%s isLoadAllBottomMsg:%s", Integer.valueOf(i), Long.valueOf(j4), Boolean.valueOf(z));
                }
                this.f229799i.f223313g = Math.max(0, i);
                bVar.next();
                return;
            }
            C75871e cU3 = ((C75700k0) C86709a0.m107533q(cls)).mo96101cU();
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f229798h == null);
            Log.m105925i("MicroMsg.ChattingLoader.ChattingGetDataSource", "null == mSourceArgs?%s", objArr);
            Bundle bundle2 = this.f229798h;
            int i2 = bundle2 == null ? 0 : bundle2.getInt("MSG_POSITION_UNREAD_COUNT");
            if (i2 > 0) {
                long e = mo108380e();
                long ky02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ky0(this.f229791a, e, i2);
                Log.m105924i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePosition] talker:" + this.f229791a + " from:" + ky02 + " to:" + e + " unreadCount:" + i2);
                this.f229792b = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Pq0(this.f229791a, ky02, e, Integer.MAX_VALUE);
                bVar.next();
                return;
            }
            C67053c z2 = cU3.mo101220z(this.f229791a);
            if (z2 == null) {
                Log.m105929w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePosition] lastSeqBlock == null！mTalker:%s", this.f229791a);
                mo108376a(bVar);
                return;
            }
            C68111c.m80513e().mo93622d(this.f229791a, z2.f192601d, z2.f192602e, 0, new C78424b(this, z2.f192603f, z2.f192604g, bVar));
        }
    }

    /* renamed from: s */
    public long mo61320s() {
        return 0;
    }
}
