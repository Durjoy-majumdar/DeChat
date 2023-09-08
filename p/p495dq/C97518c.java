package p495dq;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import di3.C86312j;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import j61.C98909h;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p008bq.C28379i0;
import p441aq.C92054g;
import p910lj.C76701a;
import p911ml.C99922k;
import pc0.C100760a0;
import te3.C101800k70;
import te3.C51365ta;
import u61.C101964h;
import v51.C102146a;

@C86522b(dependencies = {C92054g.class})
/* renamed from: dq.c */
public class C97518c extends C86301e implements C28379i0, C11385n {

    /* renamed from: d */
    public boolean f286202d = false;

    /* renamed from: e */
    public List<C97519a> f286203e = new LinkedList();

    /* renamed from: f */
    public List<String> f286204f = new LinkedList();

    /* renamed from: g */
    public C117747y f286205g;

    /* renamed from: dq.c$a */
    public class C97519a {

        /* renamed from: a */
        public long f286206a;

        /* renamed from: b */
        public String f286207b;

        /* renamed from: c */
        public EmojiInfo f286208c;

        public C97519a(C97518c cVar, long j, String str, EmojiInfo emojiInfo, String str2) {
            this.f286206a = j;
            this.f286207b = str;
            this.f286208c = emojiInfo;
        }
    }

    public void onAccountInitialized(Context context) {
        C86709a0.m107529k().f251779b.mo123455a(3862, this);
        C86709a0.m107529k().f251779b.mo123455a(697, this);
    }

    public void onAccountReleased(Context context) {
        C86709a0.m107529k().f251779b.mo123470p(3862, this);
        C86709a0.m107529k().f251779b.mo123470p(697, this);
        ((LinkedList) this.f286203e).clear();
        ((LinkedList) this.f286204f).clear();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = 2;
        Log.m105925i("MicroMsg.emoji.EmojiBypService", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (!(yVar instanceof C98909h) || this.f286203e.isEmpty()) {
            C117747y yVar2 = this.f286205g;
            if (yVar2 != null && yVar2.getClass().isInstance(yVar)) {
                if (!(i == 0 && i2 == 0)) {
                    Log.m105921e("MicroMsg.emoji.EmojiBypService", "handleBypSendResult errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
                    i3 = 5;
                }
                xx0(i3);
            }
        } else if (i == 0 && i2 == 0) {
            C47350c cVar = ((C98909h) yVar).f289945e;
            C51365ta taVar = cVar == null ? null : (C51365ta) cVar.f127056b.f127083a;
            if (!taVar.f142064g.isEmpty()) {
                C101800k70 first = taVar.f142064g.getFirst();
                if (first.f298586d.equals(((LinkedList) this.f286204f).get(0)) && first.f298587e != null) {
                    vx0();
                    return;
                }
            } else {
                Log.m105920e("MicroMsg.emoji.EmojiBypService", "handleDownloadResult: BatchEmojiDownLoadResponse resp EmojiList empty ");
            }
            if (this.f286203e.isEmpty()) {
                Log.m105920e("MicroMsg.emoji.EmojiBypService", "no emoji to upload");
            } else {
                new C99922k(((C97519a) ((LinkedList) this.f286203e).get(0)).f286208c, false, new C97517a(this));
            }
        } else {
            Log.m105921e("MicroMsg.emoji.EmojiBypService", "handleDownloadResult errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
            xx0(5);
        }
    }

    public void vx0() {
        if (this.f286203e.isEmpty()) {
            Log.m105920e("MicroMsg.emoji.EmojiBypService", "no emoji to upload");
            return;
        }
        C97519a aVar = (C97519a) ((LinkedList) this.f286203e).get(0);
        String str = aVar.f286207b;
        EmojiInfo emojiInfo = aVar.f286208c;
        Long valueOf = Long.valueOf(aVar.f286206a);
        C102146a aVar2 = new C102146a();
        aVar2.f295186B = C100760a0.C100763e.EMOJI;
        aVar2.f300802C = emojiInfo;
        aVar2.f295187a = str;
        aVar2.f295192f = valueOf.longValue();
        C100760a0.C89338b a = aVar2.mo140195a();
        this.f286205g = a.f257313a;
        a.mo123694a();
    }

    public void wx0(String str, EmojiInfo emojiInfo, C72963f4 f4Var) {
        boolean z;
        long j;
        char c;
        long j2;
        char c2;
        EmojiInfo emojiInfo2 = emojiInfo;
        C72963f4 f4Var2 = f4Var;
        Class cls = C75700k0.class;
        Class cls2 = C92054g.class;
        if (!Util.isNullOrNil(str) && emojiInfo2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C101964h.m134231m(emojiInfo)) {
                z = ((C92054g) C86312j.m106911c(cls2)).yx0().mo59028b(emojiInfo2.field_groupId);
                Log.m105925i("MicroMsg.emoji.EmojiBypService", "isNeedShowRewardTip:%b", Boolean.valueOf(z));
            } else {
                ((C92054g) C86312j.m106911c(cls2)).yx0().mo59029c();
                z = false;
            }
            if (f4Var2 == null) {
                C72963f4 f4Var3 = new C72963f4();
                int i = emojiInfo2.field_type;
                if (i > 3 || i < 1) {
                    C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.c7o, 0).show();
                    Log.m105925i("MicroMsg.emoji.EmojiBypService", "gamelife fobidden image: wrong format: emoji Type:%d", Integer.valueOf(emojiInfo2.field_type));
                    return;
                }
                f4Var3.setType(47);
                f4Var3.mo108749c3(str);
                f4Var3.mo108740T2(1);
                c = 1;
                boolean z2 = z;
                c2 = 0;
                f4Var3.mo108732L2(C72989o2.m85759f("", currentTimeMillis, !emojiInfo.mo62678k() && !emojiInfo.mo135617o2(), emojiInfo.getMd5(), z2, ""));
                f4Var3.mo108739S2(emojiInfo.getMd5());
                f4Var3.mo108733M2(C75604z3.m90843o(f4Var3.mo108768t()));
                j = currentTimeMillis;
                j2 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var3);
            } else {
                c2 = 0;
                c = 1;
                j2 = f4Var.getMsgId();
                j = new C72989o2(f4Var.getContent()).f212819b;
                if (j == 0) {
                    f4Var2.mo100991d(5);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j2, f4Var2);
                    return;
                }
            }
            Object[] objArr = new Object[3];
            objArr[c2] = Long.valueOf(j2);
            objArr[c] = emojiInfo.getMd5();
            objArr[2] = Integer.valueOf(emojiInfo2.field_size);
            Log.m105925i("MicroMsg.emoji.EmojiBypService", "add Emoji: msgId = %s, md5 %s, len %s", objArr);
            List<C97519a> list = this.f286203e;
            ((LinkedList) list).add(new C97519a(this, j2, str, emojiInfo, "" + j));
            if (!this.f286202d || ((LinkedList) this.f286203e).size() == 1) {
                this.f286202d = true;
                int i2 = emojiInfo2.field_catalog;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                if (i2 == 50 || i2 == 49) {
                    vx0();
                    return;
                }
                ((LinkedList) this.f286204f).clear();
                ((LinkedList) this.f286204f).add(((C97519a) ((LinkedList) this.f286203e).get(0)).f286208c.field_md5);
                C86709a0.m107529k().f251779b.mo123460f(new C98909h((LinkedList) this.f286204f));
            }
        }
    }

    public final void xx0(int i) {
        Class cls = C75700k0.class;
        if (((LinkedList) this.f286203e).size() < 1) {
            this.f286202d = false;
            return;
        }
        C97519a aVar = (C97519a) ((LinkedList) this.f286203e).remove(0);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(aVar.f286206a);
        b002.mo100991d(i);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(aVar.f286206a, b002);
        if (((LinkedList) this.f286203e).size() > 0) {
            ((LinkedList) this.f286204f).clear();
            ((LinkedList) this.f286204f).add(((C97519a) ((LinkedList) this.f286203e).get(0)).f286208c.field_md5);
            C86709a0.m107529k().f251779b.mo123460f(new C98909h((LinkedList) this.f286204f));
            return;
        }
        this.f286202d = false;
    }
}
