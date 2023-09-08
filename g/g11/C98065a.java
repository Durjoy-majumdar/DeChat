package g11;

import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import f11.C97792a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g11.a */
public class C98065a {

    /* renamed from: a */
    public int f287511a = Integer.MAX_VALUE;

    /* renamed from: b */
    public Map<Long, C98066a> f287512b = new ConcurrentHashMap();

    /* renamed from: c */
    public boolean f287513c;

    /* renamed from: d */
    public Set<Long> f287514d = new HashSet();

    /* renamed from: g11.a$a */
    public class C98066a {

        /* renamed from: a */
        public MsgFile f287515a;

        /* renamed from: b */
        public C97792a f287516b;

        /* renamed from: c */
        public int f287517c;

        public C98066a(C98065a aVar, MsgFile msgFile, C97792a aVar2, int i) {
            this.f287515a = msgFile;
            this.f287516b = aVar2;
            this.f287517c = i;
        }
    }

    /* renamed from: a */
    public ArrayList<MsgFile> mo137361a() {
        Map<Long, C98066a> map = this.f287512b;
        if (map == null || map.size() == 0) {
            Log.m105920e("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath is null, return");
            return null;
        }
        ArrayList<MsgFile> arrayList = new ArrayList<>();
        for (C98066a aVar : this.f287512b.values()) {
            arrayList.add(aVar.f287515a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized void mo137362b(int i) {
        Log.m105925i("MicroMsg.ChooseMsgFileHelper", "init count:%d", Integer.valueOf(i));
        this.f287511a = i;
        this.f287512b.clear();
    }

    /* renamed from: c */
    public boolean mo137363c() {
        Map<Long, C98066a> map = this.f287512b;
        if (map != null) {
            return map.size() == this.f287511a - 1 || this.f287512b.size() == this.f287511a;
        }
        Log.m105920e("MicroMsg.ChooseMsgFileHelper", "isChange() msgIdToMsgFile is null, return");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo137364d(long r6, com.tencent.p014mm.choosemsgfile.compat.MsgFile r8, f11.C97792a r9, int r10) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.ChooseMsgFileHelper"
            r2 = -1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            java.lang.String r6 = "msgid is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r0
        L_0x0010:
            if (r8 != 0) goto L_0x0019
            java.lang.String r6 = "msgFile is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r0
        L_0x0019:
            java.lang.String r2 = r8.f237616e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0027
            java.lang.String r6 = "filePath is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r0
        L_0x0027:
            java.util.Map<java.lang.Long, g11.a$a> r2 = r5.f287512b
            r3 = 1
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = "isInvalid() msgIdToMsgFile is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x003f
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            int r2 = r2.size()
            int r4 = r5.f287511a
            if (r2 < r4) goto L_0x003f
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x0052
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r7 = r5.f287511a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r0] = r7
            java.lang.String r7 = "exceed max:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r7, r6)
            return r0
        L_0x0052:
            java.util.Map<java.lang.Long, g11.a$a> r2 = r5.f287512b
            if (r2 != 0) goto L_0x005d
            java.lang.String r6 = "msgIdToMsgFile is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            return r0
        L_0x005d:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r2[r0] = r4
            r2[r3] = r8
            java.lang.String r0 = "msgIdToFilePath put msgId:%d filePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            java.util.Map<java.lang.Long, g11.a$a> r0 = r5.f287512b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            g11.a$a r7 = new g11.a$a
            r7.<init>(r5, r8, r9, r10)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g11.C98065a.mo137364d(long, com.tencent.mm.choosemsgfile.compat.MsgFile, f11.a, int):boolean");
    }

    /* renamed from: e */
    public boolean mo137365e(long j) {
        if (j == -1) {
            Log.m105920e("MicroMsg.ChooseMsgFileHelper", "msgid is invalid");
            return false;
        } else if (this.f287512b == null) {
            Log.m105920e("MicroMsg.ChooseMsgFileHelper", "msgIdToMsgFile is null, return");
            return false;
        } else {
            Log.m105925i("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath remove msgId:%d", Long.valueOf(j));
            this.f287512b.remove(Long.valueOf(j));
            return true;
        }
    }

    /* renamed from: f */
    public synchronized void mo137366f(long j) {
        Set<Long> set = this.f287514d;
        if (set != null) {
            set.remove(Long.valueOf(j));
        }
    }
}
