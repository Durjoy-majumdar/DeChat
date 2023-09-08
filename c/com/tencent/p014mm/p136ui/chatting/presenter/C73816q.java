package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletQueryHbStatusEvent;
import com.tencent.p014mm.autogen.events.WalletQueryRemittanceStatusEvent;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73760n0;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import dk3.C75414f;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import java.util.Date;
import java.util.LinkedList;
import kg3.C76577a;
import uj3.C78211g;

/* renamed from: com.tencent.mm.ui.chatting.presenter.q */
public class C73816q extends C73787b {

    /* renamed from: p */
    public int f216621p = -1;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.q$a */
    public class C73817a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f216622d;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.q$a$a */
        public class C73818a implements Runnable {
            public C73818a() {
            }

            public void run() {
                C73817a aVar = C73817a.this;
                C73816q qVar = C73816q.this;
                C75414f fVar = qVar.f216569f;
                if (fVar != null) {
                    fVar.mo102730k(aVar.f216622d, qVar.f216572i.size());
                }
            }
        }

        public C73817a(boolean z) {
            this.f216622d = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r5v11 */
        public void run() {
            Cursor cursor;
            boolean z;
            C68070l.C68072b u;
            C73820c cVar;
            LinkedList linkedList = new LinkedList();
            C75875l z2 = C97625j3.m125812b().mo105911z();
            C73816q qVar = C73816q.this;
            String str = qVar.f216568e;
            int i = qVar.f216621p;
            C72972g4 g4Var = (C72972g4) z2;
            g4Var.getClass();
            ? r5 = 0;
            C44661m1 m1Var = null;
            if (str == null || str.length() == 0) {
                Log.m105920e("MicroMsg.MsgInfoStorage", "getImgMessage fail, argument is invalid");
                cursor = null;
            } else {
                cursor = g4Var.f212775p.rawQuery("select * from " + g4Var.hy0(str) + " where" + g4Var.mo101130mL(str) + g4Var.iy0(str) + " AND " + "type" + " IN (" + 436207665 + "," + 419430449 + ")  order by " + "createTime" + " DESC limit " + i + " OFFSET " + 0, (String[]) null);
            }
            if (cursor == null) {
                Log.m105920e("MicroMsg.PayHistoryListPresenter", "[loadData] cursor is null!");
                return;
            }
            if (C72996z1.m85820U5(C73816q.this.f216568e)) {
                m1Var = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(C73816q.this.f216568e);
            }
            long j = 0;
            while (cursor.moveToNext()) {
                try {
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(cursor);
                    String content = f4Var.getContent();
                    if (content != null && (u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2())) != null && (C73816q.this.mo102857v(Util.safeParseInt(u.f195604n1)) || C73816q.this.mo102857v(f4Var.getType()))) {
                        C73816q qVar2 = C73816q.this;
                        String r = qVar2.mo102843r(f4Var, C72996z1.m85820U5(qVar2.f216568e), r5);
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(r);
                        String str2 = "";
                        if (m1Var != null) {
                            str2 = m1Var.mo69789q2(r);
                        }
                        String str3 = str2;
                        if (C73816q.this.mo102857v(f4Var.getType())) {
                            C73820c cVar2 = new C73820c(C73816q.this, f4Var.getCreateTime(), f4Var.getType(), u.f195493H0, f4Var.getMsgId(), z1Var.getUsername(), z1Var.mo62909j3(), z1Var.mo73969n2(), str3);
                            WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new WalletQueryRemittanceStatusEvent();
                            walletQueryRemittanceStatusEvent.f154909d.f154911a = u.f195501J0;
                            walletQueryRemittanceStatusEvent.publish();
                            boolean z3 = f4Var.mo108769t2() == 1 ? walletQueryRemittanceStatusEvent.f154910e.f154913b : !walletQueryRemittanceStatusEvent.f154910e.f154913b;
                            WalletQueryRemittanceStatusEvent.C55179b bVar = walletQueryRemittanceStatusEvent.f154910e;
                            int i2 = bVar.f154912a;
                            boolean z4 = i2 == -2 ? false : z3;
                            if (!z4) {
                                Object[] objArr = new Object[5];
                                objArr[r5] = Boolean.valueOf(bVar.f154913b);
                                objArr[1] = Integer.valueOf(walletQueryRemittanceStatusEvent.f154910e.f154912a);
                                objArr[2] = Long.valueOf(f4Var.getMsgId());
                                C78211g gVar = C73816q.this.f216570g;
                                long j2 = cVar2.f229169a;
                                gVar.getClass();
                                objArr[3] = C74763a.m89510e().mo103936d(new Date(j2), gVar.f229162d);
                                objArr[4] = cVar2.toString();
                                Log.m105925i("MicroMsg.PayHistoryListPresenter", "[loadData] it's not payer! isSend:%s, status:%s pass this msg:%s date:%s item:%s", objArr);
                                z = r5;
                                r5 = z;
                            } else {
                                if (i2 <= 0) {
                                    i2 = u.f195489G0;
                                }
                                Resources resources = C73816q.this.f216567d.getResources();
                                Object[] objArr2 = new Object[1];
                                objArr2[r5] = cVar2.f229174f;
                                cVar2.f229174f = resources.getString(C0966R.string.jmr, objArr2);
                                C73816q.this.getClass();
                                int i3 = -352966;
                                if (i2 != 1 && i2 != 21) {
                                    if (i2 != 3 && i2 != 4) {
                                        if (!(i2 == 5 || i2 == 6)) {
                                            if (i2 != 7) {
                                                switch (i2) {
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                        break;
                                                }
                                                i3 = -470621;
                                            }
                                        }
                                    }
                                    i3 = -470621;
                                }
                                cVar2.f216628l = i3;
                                C73816q qVar3 = C73816q.this;
                                int i4 = i2;
                                C68070l.C68072b bVar2 = u;
                                C73820c cVar3 = cVar2;
                                cVar3.f216627k = C73816q.m87450u(qVar3, qVar3.f216567d, f4Var, bVar2, z4, i4);
                                Context context = C73816q.this.f216567d;
                                int i5 = C0966R.raw.c2c_remittance_icon;
                                if (context != null) {
                                    int i6 = i4;
                                    if (!(i6 == 1 || i6 == 21)) {
                                        if (i6 != 3) {
                                            if (i6 != 4) {
                                                if (i6 != 5) {
                                                    if (i6 != 6) {
                                                        if (i6 != 7) {
                                                            switch (i6) {
                                                                case 23:
                                                                case 25:
                                                                    break;
                                                                case 24:
                                                                    break;
                                                                case 26:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    i5 = C0966R.raw.c2c_remittance_cancle_icon;
                                                }
                                            }
                                            i5 = C0966R.raw.c2c_remittance_rejected_icon;
                                        }
                                        i5 = C0966R.raw.c2c_remittance_received_icon;
                                    }
                                }
                                cVar3.f216626j = i5;
                                cVar = cVar3;
                            }
                        } else {
                            C73820c cVar4 = new C73820c(C73816q.this, f4Var.getCreateTime(), f4Var.getType(), u.f195584i1, f4Var.getMsgId(), z1Var.getUsername(), z1Var.mo62909j3(), z1Var.mo73969n2(), str3);
                            if (Util.safeParseInt(u.f195604n1) == Util.safeParseInt("1001")) {
                                cVar4.f229174f = C73816q.this.f216567d.getResources().getString(C0966R.string.jmp, new Object[]{cVar4.f229174f});
                                cVar4.f216627k = C73760n0.m87362h(u, f4Var.mo108769t2() == 1);
                                cVar4.f216628l = C73760n0.m87356b(u, f4Var.mo108769t2() == 1);
                                cVar4.f216626j = C73760n0.m87359e(u, f4Var.mo108769t2() == 1);
                            } else {
                                WalletQueryHbStatusEvent walletQueryHbStatusEvent = new WalletQueryHbStatusEvent();
                                walletQueryHbStatusEvent.f154903d.f154905a = u.f195608o1;
                                walletQueryHbStatusEvent.publish();
                                cVar4.f229174f = C73816q.this.f216567d.getResources().getString(C0966R.string.jmq, new Object[]{cVar4.f229174f});
                                WalletQueryHbStatusEvent.C55177b bVar3 = walletQueryHbStatusEvent.f154904e;
                                C68070l.C68072b bVar4 = u;
                                cVar4.f216627k = C73760n0.m87364j(bVar3.f154906a, bVar3.f154907b, bVar3.f154908c, f4Var.mo108769t2() == 1, C72996z1.m85820U5(C73816q.this.f216568e), C73816q.this.f216568e, bVar4, (TextView) null);
                                int identifier = C73816q.this.f216567d.getResources().getIdentifier(((C68062c) bVar4.mo93555w(C68062c.class)).f195385b, "drawable", MMApplicationContext.getPackageName());
                                WalletQueryHbStatusEvent.C55177b bVar5 = walletQueryHbStatusEvent.f154904e;
                                int l = C73760n0.m87366l(bVar5.f154907b, bVar5.f154908c, f4Var.mo108769t2() == 1);
                                cVar4.f216626j = l;
                                if (l <= 0) {
                                    cVar4.f216626j = identifier;
                                }
                            }
                            cVar = cVar4;
                        }
                        long a = C74763a.m89510e().mo103933a(new Date(f4Var.getCreateTime()));
                        if (j != a) {
                            linkedList.add(new C78211g.C78217d(f4Var.getCreateTime()));
                        }
                        linkedList.add(cVar);
                        j = a;
                    }
                    z = false;
                    r5 = z;
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
            cursor.close();
            C73816q.this.f216572i.addAll(linkedList);
            C73816q qVar4 = C73816q.this;
            qVar4.f216573j = qVar4.f216572i;
            linkedList.clear();
            MMHandlerThread.postToMainThread(new C73818a());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.q$b */
    public class C73819b implements C78211g.C78219f {
        public C73819b() {
        }

        /* renamed from: a */
        public void mo102833a(View view, int i, C78211g.C78216c cVar) {
        }

        /* renamed from: b */
        public void mo102834b(View view, int i, C78211g.C78216c cVar) {
            C73816q qVar = C73816q.this;
            qVar.mo102844s(qVar.f216567d, qVar.f216568e, cVar.f229172d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.q$c */
    public class C73820c extends C78211g.C78216c {

        /* renamed from: j */
        public int f216626j;

        /* renamed from: k */
        public String f216627k;

        /* renamed from: l */
        public int f216628l = 0;

        public C73820c(C73816q qVar, long j, int i, String str, long j2, String str2, String str3, String str4, String str5) {
            super(j, i, str, j2, str2, str3, str4, str5);
        }

        /* renamed from: a */
        public int mo102836a() {
            return this.f229170b;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            if (str == null) {
                return false;
            }
            boolean d = super.mo102837d(str);
            return !d ? this.f229171c.contains(str) : d;
        }

        public String toString() {
            return "PayMediaHistoryListItem{appId='" + null + '\'' + ", desc='" + this.f216627k + '\'' + ", timestamp=" + this.f229169a + ", type=" + this.f229170b + ", title='" + this.f229171c + '\'' + ", msgId=" + this.f229172d + ", username='" + this.f229173e + '\'' + ", nickname='" + this.f229174f + '\'' + ", remarkName='" + this.f229175g + '\'' + ", nameInRoom='" + this.f229176h + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.q$d */
    public class C73821d extends C78211g.C78213b {

        /* renamed from: E */
        public ImageView f216629E;

        /* renamed from: F */
        public TextView f216630F;

        public C73821d(C73816q qVar, View view) {
            super(view);
            this.f216629E = (ImageView) view.findViewById(C0966R.C0970id.cv_);
            this.f229166C.setSingleLine(false);
            this.f229166C.setMaxLines(2);
            this.f216630F = (TextView) view.findViewById(C0966R.C0970id.cuy);
        }
    }

    public C73816q(Context context) {
        super(context);
    }

    /* renamed from: u */
    public static String m87450u(C73816q qVar, Context context, C72963f4 f4Var, C68070l.C68072b bVar, boolean z, int i) {
        qVar.getClass();
        if (bVar == null || f4Var == null || context == null) {
            return "";
        }
        if (!(i == 1 || i == 21)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                switch (i) {
                                    case 23:
                                        break;
                                    case 24:
                                        break;
                                    case 25:
                                        break;
                                    case 26:
                                        break;
                                    case 27:
                                        break;
                                    default:
                                        return bVar.f195574g;
                                }
                            }
                        }
                        return context.getResources().getString(C0966R.string.b8p);
                    }
                    if (qVar.mo102858w()) {
                        return qVar.f216567d.getString(C0966R.string.b8w);
                    }
                    if (!z) {
                        return MMApplicationContext.getContext().getString(C0966R.string.b8v);
                    }
                    if (Util.isNullOrNil(bVar.f195532T1)) {
                        return MMApplicationContext.getContext().getString(C0966R.string.b8u);
                    }
                    return MMApplicationContext.getContext().getString(C0966R.string.b8u) + "-" + bVar.f195532T1;
                }
                if (qVar.mo102858w()) {
                    return qVar.f216567d.getString(C0966R.string.b9c);
                }
                if (!z) {
                    return MMApplicationContext.getContext().getString(C0966R.string.b9d);
                }
                if (Util.isNullOrNil(bVar.f195532T1)) {
                    return MMApplicationContext.getContext().getString(C0966R.string.b9e);
                }
                return MMApplicationContext.getContext().getString(C0966R.string.b9e) + "-" + bVar.f195532T1;
            }
            if (qVar.mo102858w()) {
                return qVar.f216567d.getString(C0966R.string.b8l);
            }
            if (!z) {
                return MMApplicationContext.getContext().getString(C0966R.string.b8o);
            }
            if (Util.isNullOrNil(bVar.f195532T1)) {
                return MMApplicationContext.getContext().getString(C0966R.string.b8n);
            }
            return MMApplicationContext.getContext().getString(C0966R.string.b8n) + "-" + bVar.f195532T1;
        }
        C72996z1 H3 = C97625j3.m125812b().mo105907v().mo69656H3(f4Var.mo108768t());
        String f = H3 != null ? H3.mo62898f() : f4Var.mo108768t();
        if (qVar.mo102858w()) {
            return qVar.f216567d.getString(C0966R.string.b96);
        }
        if (!z) {
            return qVar.f216567d.getString(C0966R.string.b8o);
        }
        if (!Util.isNullOrNil(bVar.f195532T1)) {
            return bVar.f195532T1;
        }
        if (f4Var.mo108769t2() != 1) {
            return qVar.f216567d.getString(C0966R.string.b9a);
        }
        return qVar.f216567d.getString(C0966R.string.b99, new Object[]{f});
    }

    /* renamed from: c */
    public String mo102824c() {
        return this.f216567d.getString(C0966R.string.igg);
    }

    /* renamed from: e */
    public String mo102825e() {
        return this.f216567d.getString(C0966R.string.igg);
    }

    /* renamed from: f */
    public void mo102826f(C78211g.C78213b bVar, int i, int i2) {
        C73821d dVar = (C73821d) bVar;
        C73820c cVar = (C73820c) mo102842q(i);
        if (Util.isNullOrNil(cVar.f216627k)) {
            dVar.f216630F.setVisibility(8);
        } else {
            dVar.f216630F.setVisibility(0);
            dVar.f216630F.setText(Util.nullAs(cVar.f216627k, ""));
        }
        int b = C76577a.m92151b(this.f216567d, 6);
        dVar.f216629E.setPadding(b, b, b, b);
        dVar.f216629E.setImageResource(cVar.f216626j);
        dVar.f216629E.setBackgroundColor(cVar.f216628l);
    }

    /* renamed from: g */
    public void mo102827g(boolean z) {
        this.f216569f.mo102729f(z);
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C73817a(z));
    }

    public int getType() {
        return 5;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo102829o(ViewGroup viewGroup, int i) {
        return new C73821d(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a84, viewGroup, false));
    }

    /* renamed from: p */
    public C78211g.C78219f mo102830p() {
        return new C73819b();
    }

    /* renamed from: v */
    public boolean mo102857v(int i) {
        return Util.safeParseInt("1001") == i || Util.safeParseInt("1002") == i || Util.safeParseInt("1005") == i || 419430449 == i;
    }

    /* renamed from: w */
    public final boolean mo102858w() {
        return C72996z1.m85820U5(this.f216568e) || C72996z1.m85847r5(this.f216568e);
    }
}
