package wk3;

import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseArray;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30757l4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import hk3.C76227e;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import u90.C37355b;
import vk3.C37750k;
import vk3.C78430l;
import zj3.C79343c0;
import zj3.C79368l;

/* renamed from: wk3.h */
public class C78622h extends C78606a {

    /* renamed from: j */
    public int f230296j = 0;

    /* renamed from: k */
    public String f230297k;

    /* renamed from: l */
    public volatile long f230298l = 0;

    /* renamed from: m */
    public volatile long f230299m = 0;

    /* renamed from: n */
    public volatile long f230300n = 0;

    /* renamed from: wk3.h$a */
    public class C78623a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f230301d;

        /* renamed from: e */
        public final /* synthetic */ int f230302e;

        /* renamed from: f */
        public final /* synthetic */ MMChattingListView f230303f;

        public C78623a(Bundle bundle, int i, MMChattingListView mMChattingListView) {
            this.f230301d = bundle;
            this.f230302e = i;
            this.f230303f = mMChattingListView;
        }

        public void run() {
            C79368l lVar = (C79368l) C78622h.this.f230239b.f193278b.mo102812a(C79368l.class);
            Bundle bundle = this.f230301d;
            if (bundle == null || bundle.getInt("SCENE", 0) != 1) {
                Bundle bundle2 = this.f230301d;
                if (bundle2 != null && bundle2.getInt("SCENE", 0) == 2) {
                    lVar.mo108185T3(this.f230302e);
                    C67391b bVar = C78622h.this.f230239b;
                    int i = this.f230302e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    C67391b bVar2 = bVar;
                    C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/source/presenter/ChattingSingleNotifyMsgPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    bVar.mo91544E(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/source/presenter/ChattingSingleNotifyMsgPresenter$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                return;
            }
            boolean z = this.f230301d.getBoolean("IS_IDLE_VISBLE", false);
            int i2 = this.f230301d.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z2 = this.f230301d.getBoolean("IS_SMOOTH_SCROLL", false);
            C78622h hVar = C78622h.this;
            C67391b bVar3 = hVar.f230239b;
            int i3 = this.f230302e;
            bVar3.f193289m = i3;
            hVar.mo108595e(i3, z, i2, z2);
            if (this.f230302e >= 0 && C78622h.this.f230239b.f193286j.getBooleanExtra("need_hight_item", false).booleanValue()) {
                C78622h.this.mo108593c(this.f230303f, this.f230302e, C78622h.this.f230239b.f193286j.getLongExtra("msg_local_id", -1), false, i2, false);
            }
        }
    }

    public C78622h(C67391b bVar, C76227e eVar) {
        super(bVar, eVar);
        String stringExtra = this.f230239b.f193286j.getStringExtra("key_notify_message_real_username");
        this.f230297k = stringExtra;
        Log.m105925i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[ChattingSingleNotifyMsgPresenter] talker:%s", stringExtra);
    }

    /* renamed from: a */
    public void mo106480a(MMChattingListView mMChattingListView, C76227e.C76230d<C72963f4> dVar) {
        MMChattingListView mMChattingListView2 = mMChattingListView;
        C76227e.C76230d<C72963f4> dVar2 = dVar;
        Class cls = C79343c0.class;
        super.mo106480a(mMChattingListView, dVar);
        C76227e.C76228a aVar = dVar2.f223308b;
        SparseArray<T> sparseArray = dVar2.f223311e;
        int size = ((LinkedList) dVar2.f223309c).size();
        int i = dVar2.f223312f;
        int i2 = dVar2.f223313g;
        Bundle bundle = dVar2.f223307a;
        boolean z = false;
        C72963f4 f4Var = (C72963f4) sparseArray.get(0);
        C72963f4 f4Var2 = (C72963f4) sparseArray.get(sparseArray.size() - 1);
        if (f4Var != null) {
            this.f230298l = f4Var.getCreateTime();
        }
        if (f4Var2 != null) {
            this.f230299m = f4Var2.getCreateTime();
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            mMChattingListView2.mo101741d(false);
            C72924q1.m85521b(mMChattingListView.getListView(), (mMChattingListView.getCurCount() - mMChattingListView.getPreCount()) + 1, ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x() + mMChattingListView.getTopHeight(), false, false);
            int curCount = mMChattingListView.getCurCount() - mMChattingListView.getPreCount();
            if (curCount > 0) {
                ((C79368l) this.f230239b.f193278b.mo102812a(C79368l.class)).mo108201i0(curCount);
            }
        } else if (ordinal == 1) {
            mMChattingListView2.mo101739c(false);
            C72924q1.m85521b(mMChattingListView.getListView(), mMChattingListView.getPreCount() + 1, (mMChattingListView.getListView().getHeight() - ((C79343c0) this.f230239b.f193278b.mo102812a(cls)).mo102630x()) - mMChattingListView.getBottomHeight(), false, false);
        } else if (ordinal == 3) {
            this.f230239b.mo91543D(false);
        } else if (ordinal == 4) {
            int i3 = bundle == null ? -1 : bundle.getInt("MSG_POSITION", -1);
            if (i3 != -1) {
                int max = Math.max(0, mMChattingListView.getCurCount() - (dVar2.f223312f - i3));
                dVar2.f223313g = max;
                i2 = max;
            }
            mMChattingListView.getListView().post(new C78623a(bundle, i2, mMChattingListView2));
        }
        if (aVar != C76227e.C76228a.ACTION_ENTER) {
            Log.m105925i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", aVar, Long.valueOf(this.f230298l), Long.valueOf(this.f230299m), Integer.valueOf(size), Integer.valueOf(i), Integer.valueOf(i2));
            int Lo = ((C30757l4) C97625j3.m125812b().mo105875A()).mo57659Lo(this.f230297k, 0, 0);
            Log.m105925i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[isShowTopAll] talker:%s createTime:%s expiredCount:%s", this.f230297k, 0L, Integer.valueOf(Lo));
            if (i - Lo <= size) {
                z = true;
            }
            mMChattingListView2.setIsTopShowAll(z);
            mMChattingListView2.setIsBottomShowAll(true);
        }
    }

    /* renamed from: b */
    public C78430l mo108592b(C76227e.C76228a aVar, Bundle bundle, C76227e.C76230d dVar) {
        C37750k kVar;
        int i;
        C76227e.C76230d dVar2;
        int i2;
        long j;
        long j2;
        String str;
        String str2;
        int i3;
        String str3;
        long j3;
        C78622h hVar = this;
        Bundle bundle2 = bundle;
        C37355b A = C97625j3.m125812b().mo105875A();
        String str4 = hVar.f230297k;
        C30757l4 l4Var = (C30757l4) A;
        l4Var.getClass();
        Cursor rawQuery = l4Var.f82707d.rawQuery("SELECT COUNT(*) FROM " + "NotifyMessageRecord" + " WHERE " + "talker" + " = '" + Util.escapeSqlValue(str4) + "'", (String[]) null);
        int i4 = rawQuery.moveToLast() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            kVar = new C37750k(hVar.f230297k, hVar.f230241d + 48, i4);
        } else if (ordinal == 2) {
            kVar = new C37750k(hVar.f230297k, hVar.f230241d + Math.max(i4 - hVar.f230296j, 0), i4);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (bundle2 == null) {
                    Log.m105928w("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "null == sourceArgs!");
                    return null;
                } else if (bundle2.getInt("SCENE", 0) == 1) {
                    Log.m105924i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[handlePositionForSearch]");
                    long j4 = bundle2.getLong("MSG_ID");
                    boolean z = bundle2.getBoolean("IS_LOAD_ALL", false);
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j4);
                    if (b002.getMsgId() != j4) {
                        Log.m105929w("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "get msg info by id %d error", Long.valueOf(j4));
                        kVar = new C37750k(hVar.f230297k, hVar.f230298l, hVar.f230299m, true);
                        i = i4;
                    } else {
                        long createTime = b002.getCreateTime();
                        if (createTime < hVar.f230298l || createTime > hVar.f230299m) {
                            long j5 = createTime;
                            hVar.f230298l = j5;
                            C37355b A2 = C97625j3.m125812b().mo105875A();
                            String str5 = hVar.f230297k;
                            C30757l4 l4Var2 = (C30757l4) A2;
                            l4Var2.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT ");
                            sb.append("createTime");
                            i = i4;
                            sb.append(" FROM ");
                            sb.append("NotifyMessageRecord");
                            sb.append(" WHERE ");
                            sb.append("talker");
                            sb.append(" = '");
                            sb.append(Util.escapeSqlValue(str5));
                            sb.append("'");
                            sb.append(" ORDER BY ");
                            sb.append("createTime");
                            String str6 = "MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter";
                            sb.append(" DESC LIMIT 1");
                            Cursor rawQuery2 = l4Var2.f82707d.rawQuery(sb.toString(), (String[]) null);
                            if (rawQuery2.moveToFirst()) {
                                j = rawQuery2.getLong(0);
                                rawQuery2.close();
                            } else {
                                rawQuery2.close();
                                j = -1;
                            }
                            hVar.f230300n = j;
                            String str7 = "";
                            if (z) {
                                hVar.f230299m = hVar.f230300n;
                                str2 = "result msg create time %d";
                                str = "'";
                                j2 = j5;
                            } else {
                                String str8 = "result msg create time %d";
                                C37355b A3 = C97625j3.m125812b().mo105875A();
                                String str9 = hVar.f230297k;
                                C30757l4 l4Var3 = (C30757l4) A3;
                                l4Var3.getClass();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("SELECT ");
                                sb4.append("createTime");
                                sb4.append(" FROM ");
                                sb4.append("NotifyMessageRecord");
                                sb4.append(" WHERE ");
                                sb4.append("talker");
                                sb4.append(" = '");
                                sb4.append(Util.escapeSqlValue(str9));
                                sb4.append("'");
                                if (j5 > 0) {
                                    StringBuilder sb5 = new StringBuilder();
                                    str = "'";
                                    sb5.append(" AND createTime > ");
                                    sb5.append(j5);
                                    str3 = sb5.toString();
                                } else {
                                    str = "'";
                                    str3 = str7;
                                }
                                sb4.append(str3);
                                sb4.append(" ORDER BY ");
                                sb4.append("createTime");
                                sb4.append(" ASC LIMIT ");
                                sb4.append(48);
                                Cursor rawQuery3 = l4Var3.f82707d.rawQuery(sb4.toString(), (String[]) null);
                                if (rawQuery3.moveToFirst()) {
                                    j3 = rawQuery3.getLong(0);
                                    j2 = j5;
                                    str2 = str8;
                                    Log.m105919d("MicroMsg.NotifyMessageRecordStorage", str2, Long.valueOf(j3));
                                    rawQuery3.close();
                                    hVar = this;
                                } else {
                                    str2 = str8;
                                    j2 = j5;
                                    rawQuery3.close();
                                    Log.m105928w("MicroMsg.NotifyMessageRecordStorage", "get result fail");
                                    hVar = this;
                                    j3 = j2;
                                }
                                hVar.f230299m = j3;
                            }
                            String str10 = "get result fail";
                            String str11 = "MicroMsg.NotifyMessageRecordStorage";
                            int Lo = ((C30757l4) C97625j3.m125812b().mo105875A()).mo57659Lo(hVar.f230297k, hVar.f230298l, hVar.f230299m);
                            String str12 = str6;
                            Log.m105927v(str12, "reset position, reload count %d", Integer.valueOf(Lo));
                            if (Lo < 48) {
                                Log.m105919d(str12, "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d", Long.valueOf(hVar.f230298l), 0);
                                C37355b A4 = C97625j3.m125812b().mo105875A();
                                String str13 = hVar.f230297k;
                                long j6 = hVar.f230298l;
                                C30757l4 l4Var4 = (C30757l4) A4;
                                l4Var4.getClass();
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("SELECT ");
                                sb6.append("createTime");
                                sb6.append(" FROM ");
                                sb6.append("NotifyMessageRecord");
                                sb6.append(" WHERE ");
                                sb6.append("talker");
                                sb6.append(" = '");
                                sb6.append(Util.escapeSqlValue(str13));
                                sb6.append(str);
                                if (j6 > 0) {
                                    str7 = " AND createTime < " + j6;
                                }
                                sb6.append(str7);
                                sb6.append(" ORDER BY ");
                                sb6.append("createTime");
                                sb6.append(" DESC LIMIT ");
                                sb6.append(48);
                                Cursor rawQuery4 = l4Var4.f82707d.rawQuery(sb6.toString(), (String[]) null);
                                if (rawQuery4.moveToLast()) {
                                    j6 = rawQuery4.getLong(0);
                                    Log.m105919d(str11, str2, Long.valueOf(j6));
                                    rawQuery4.close();
                                } else {
                                    rawQuery4.close();
                                    Log.m105928w(str11, str10);
                                }
                                hVar.f230298l = j6;
                                i3 = ((C30757l4) C97625j3.m125812b().mo105875A()).mo57659Lo(hVar.f230297k, hVar.f230298l, j2);
                            } else {
                                i3 = 0;
                            }
                            dVar2 = dVar;
                            i2 = i3;
                        } else {
                            i2 = ((C30757l4) C97625j3.m125812b().mo105875A()).mo57659Lo(hVar.f230297k, hVar.f230298l, createTime);
                            dVar2 = dVar;
                            i = i4;
                        }
                        dVar2.f223313g = i2;
                        kVar = new C37750k(hVar.f230297k, hVar.f230298l, hVar.f230299m, true);
                    }
                    i4 = i;
                }
            }
            i = i4;
            kVar = null;
            i4 = i;
        } else {
            int i5 = i4;
            kVar = new C37750k(hVar.f230297k, 16, i4);
        }
        hVar.f230296j = i4;
        return kVar;
    }
}
