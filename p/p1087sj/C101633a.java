package p1087sj;

import al3.C0086a;
import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import hd0.C98408n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import yc3.C38992a;
import zh3.C91753f;

/* renamed from: sj.a */
public class C101633a implements C38992a {

    /* renamed from: a */
    public static final int[] f297502a = {0, 1};

    /* renamed from: sj.a$a */
    public class C101634a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101639d f297503d;

        /* renamed from: e */
        public final /* synthetic */ String[] f297504e;

        /* renamed from: f */
        public final /* synthetic */ Context f297505f;

        public C101634a(C101639d dVar, String[] strArr, Context context) {
            this.f297503d = dVar;
            this.f297504e = strArr;
            this.f297505f = context;
        }

        public void run() {
            C101633a aVar = C101633a.this;
            List<String> list = this.f297503d.f297520a;
            int[] iArr = C101633a.f297502a;
            aVar.getClass();
            Class cls = C75700k0.class;
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("[oneliang]do insert contact by username list begin,count:");
                ArrayList arrayList = (ArrayList) list;
                sb.append(arrayList.size());
                Log.m105924i("MicroMsg.AgingTestCommand", sb.toString());
                for (int i = 0; i < arrayList.size(); i++) {
                    String str = (String) arrayList.get(i);
                    C72996z1 d = aVar.mo141090d(str, i);
                    if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69709k3(str)) {
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(d);
                    }
                }
                Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang]do insert contact by username list end,count:%s", Integer.valueOf(arrayList.size()));
            }
            C101633a.m133491b(C101633a.this, (String) null, Util.getInt(this.f297504e[1], 0), this.f297503d);
            C101633a.m133492c(C101633a.this, this.f297505f);
        }
    }

    /* renamed from: sj.a$b */
    public class C101635b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f297507d;

        /* renamed from: e */
        public final /* synthetic */ Context f297508e;

        public C101635b(int i, Context context) {
            this.f297507d = i;
            this.f297508e = context;
        }

        public void run() {
            C101633a aVar = C101633a.this;
            int i = this.f297507d;
            int[] iArr = C101633a.f297502a;
            aVar.getClass();
            Class cls = C75700k0.class;
            Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang]do insert contact begin,count:%s", Integer.valueOf(i));
            Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang]get exists count:%s", Integer.valueOf(C45628s0.m50790o()));
            int o = C45628s0.m50790o();
            for (int i2 = o; i2 < i + o; i2++) {
                String str = "rdgztest_atm" + i2;
                C72996z1 d = aVar.mo141090d("rdgztest_atm" + i2, i2);
                if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69709k3(str)) {
                    ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(d);
                }
            }
            Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang]do insert contact end,count:%s", Integer.valueOf(i));
            C101633a.m133492c(C101633a.this, this.f297508e);
        }
    }

    /* renamed from: sj.a$c */
    public class C101636c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f297510d;

        /* renamed from: e */
        public final /* synthetic */ int f297511e;

        /* renamed from: f */
        public final /* synthetic */ C101639d f297512f;

        /* renamed from: g */
        public final /* synthetic */ Context f297513g;

        public C101636c(String str, int i, C101639d dVar, Context context) {
            this.f297510d = str;
            this.f297511e = i;
            this.f297512f = dVar;
            this.f297513g = context;
        }

        public void run() {
            C101633a.m133491b(C101633a.this, this.f297510d, this.f297511e, this.f297512f);
            C101633a.m133492c(C101633a.this, this.f297513g);
        }
    }

    static {
        try {
            C101633a newInstance = C101633a.class.newInstance();
            if (newInstance != null && (newInstance instanceof C38992a)) {
                C30650a.m39147b(newInstance, "//aging");
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AgingTestCommand", th, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public static void m133491b(C101633a aVar, String str, int i, C101639d dVar) {
        aVar.getClass();
        Class cls = C75700k0.class;
        if (dVar != null) {
            Cursor k4 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69710k4();
            ArrayList arrayList = new ArrayList();
            if (!Util.isNullOrNil(str)) {
                arrayList.add(str);
            } else {
                while (k4.moveToNext()) {
                    try {
                        C72996z1 z1Var = new C72996z1();
                        z1Var.convertFrom(k4);
                        String username = z1Var.getUsername();
                        if (username != null) {
                            if (username.startsWith("rdgztest_atm")) {
                                arrayList.add(username);
                            }
                        }
                    } catch (Throwable th) {
                        if (k4 != null) {
                            k4.close();
                        }
                        throw th;
                    }
                }
                k4.close();
            }
            Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang] batch insert test msg info, begin all transaction,msg count per conversation:%s", Integer.valueOf(i));
            long currentTimeMillis = System.currentTimeMillis();
            int[] iArr = {1, 3, 43, 47};
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C101637b bVar = new C101637b(aVar, str2, i, iArr, dVar);
                if (str2 != null && !str2.isEmpty()) {
                    C72972g4 g4Var = (C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
                    C91753f fVar = g4Var.f212775p;
                    g4Var.qy0("test_msg_info");
                    long beginTransaction = fVar.beginTransaction(Thread.currentThread().getId());
                    Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang] batch insert test msg info, begin transaction ticket:%s,username:%s", Long.valueOf(beginTransaction), str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    try {
                        bVar.mo141095a();
                    } catch (Throwable th4) {
                        fVar.endTransaction(beginTransaction);
                        throw th4;
                    }
                    fVar.endTransaction(beginTransaction);
                    Log.m105924i("MicroMsg.AgingTestCommand", "[oneliang] batch insert test msg info, end transaction, cost:" + (System.currentTimeMillis() - currentTimeMillis2));
                    g4Var.wy0("test_msg_info");
                }
            }
            Log.m105924i("MicroMsg.AgingTestCommand", "[oneliang] batch insert test msg info, end all transaction, cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: c */
    public static void m133492c(C101633a aVar, Context context) {
        aVar.getClass();
        try {
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = C0086a.m38a(context).getString(C0966R.string.f361448jz1);
            aVar2.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
            aVar2.f225620C = new C101638c(aVar);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar2);
            gVar.show();
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f361448jz1, 1).show();
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.AgingTestCommand", "[oneliang] show finished dialog error.");
        }
    }

    /* renamed from: e */
    public static byte[] m133493e(long j) {
        byte[] bArr = new byte[8];
        bArr[7] = (byte) ((int) (j & 255));
        bArr[6] = (byte) ((int) ((j >> 8) & 255));
        bArr[5] = (byte) ((int) ((j >> 16) & 255));
        bArr[4] = (byte) ((int) ((j >> 24) & 255));
        bArr[3] = (byte) ((int) ((j >> 32) & 255));
        bArr[2] = (byte) ((int) ((j >> 40) & 255));
        bArr[1] = (byte) ((int) ((j >> 48) & 255));
        bArr[0] = (byte) ((int) ((j >> 56) & 255));
        return bArr;
    }

    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (Log.getLogLevel() > 1 || strArr.length <= 1) {
            return false;
        }
        String s = C75592q0.m90789s();
        C101639d dVar = new C101639d();
        for (int i = 5001; i <= 6000; i++) {
            List<String> list = dVar.f297520a;
            ((ArrayList) list).add("rdgztest_atm" + i);
        }
        C91753f fVar = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).f212775p;
        Cursor rawQuery = fVar.rawQuery("SELECT * FROM message WHERE talker=? AND (type=3 OR type=43 OR type=47) AND isSend=1", new String[]{s});
        while (rawQuery.moveToNext()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(rawQuery);
            int type = f4Var.getType();
            if (type == 3) {
                Cursor rawQuery2 = fVar.rawQuery("SELECT * FROM " + C92839m.C92844e.m117106b(s) + " WHERE " + "msgSvrId" + "=?", new String[]{String.valueOf(f4Var.mo108774y2())});
                if (rawQuery2.moveToNext()) {
                    C92836k kVar = new C92836k();
                    kVar.mo127131b(rawQuery2);
                    ((ArrayList) dVar.f297521b).add(new C101640e(f4Var, kVar));
                }
                rawQuery2.close();
            } else if (type == 43) {
                Cursor rawQuery3 = fVar.rawQuery("SELECT * FROM videoinfo2 WHERE msgsvrid=?", new String[]{String.valueOf(f4Var.mo108774y2())});
                if (rawQuery3.moveToNext()) {
                    C98408n0 n0Var = new C98408n0();
                    n0Var.mo137698a(rawQuery3);
                    ((ArrayList) dVar.f297522c).add(new C101640e(f4Var, n0Var));
                }
                rawQuery3.close();
            } else if (type == 47) {
                Cursor rawQuery4 = fVar.rawQuery("SELECT * FROM EmojiInfo WHERE md5=?", new String[]{f4Var.mo108765s2()});
                if (rawQuery4.moveToNext()) {
                    EmojiInfo emojiInfo = new EmojiInfo();
                    emojiInfo.convertFrom(rawQuery4);
                    ((ArrayList) dVar.f297523d).add(new C101640e(f4Var, emojiInfo));
                }
                rawQuery4.close();
            }
        }
        rawQuery.close();
        if (!((ArrayList) dVar.f297521b).isEmpty() || !((ArrayList) dVar.f297523d).isEmpty() || !((ArrayList) dVar.f297522c).isEmpty()) {
            Log.m105925i("MicroMsg.AgingTestCommand", "[oneliang]username size:%s,image size:%s,emoji size:%s,video size:%s", Integer.valueOf(((ArrayList) dVar.f297520a).size()), Integer.valueOf(((ArrayList) dVar.f297521b).size()), Integer.valueOf(((ArrayList) dVar.f297523d).size()), Integer.valueOf(((ArrayList) dVar.f297522c).size()));
            if (strArr.length == 2) {
                C76701a.makeText(context, (CharSequence) "aging begin", 1).show();
                C86709a0.m107525e().postToWorker(new C101634a(dVar, strArr, context));
                return true;
            } else if (strArr.length < 3) {
                return false;
            } else {
                int i2 = Util.getInt(strArr[2], 0);
                String str2 = strArr[1];
                str2.getClass();
                if (str2.equals("1")) {
                    C86709a0.m107525e().postToWorker(new C101635b(i2, context));
                    return true;
                } else if (!str2.equals("2")) {
                    return true;
                } else {
                    C86709a0.m107525e().postToWorker(new C101636c(strArr.length == 4 ? strArr[3] : null, i2, dVar, context));
                    return true;
                }
            }
        } else {
            C76701a.makeText(context, (CharSequence) "please send some data(img,video,emoji) to yourself", 1).show();
            return false;
        }
    }

    /* renamed from: d */
    public final C72996z1 mo141090d(String str, int i) {
        C72996z1 z1Var = new C72996z1();
        z1Var.f108320R1 = (long) (100000 + i);
        z1Var.setUsername(str);
        z1Var.mo62857I2("alias_" + i);
        z1Var.mo62878U2("nickName_" + i);
        z1Var.mo62884X2("quanPin_" + i);
        z1Var.mo62882W2("pyInitial_" + i);
        z1Var.setType(3);
        return z1Var;
    }

    /* renamed from: f */
    public final int mo141091f(int i) {
        int random = (int) (Math.random() * ((double) i));
        if (random >= i) {
            return 0;
        }
        return random;
    }
}
