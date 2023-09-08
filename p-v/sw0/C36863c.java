package sw0;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.List;
import tw0.C37288f;
import tw0.C90584e;
import tw0.C90586i;
import tw0.C90588k;
import uw0.C37596a;
import y02.C91358b;
import y02.C91359c;
import y02.C91360d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: sw0.c */
public class C36863c extends C86301e implements C90584e {
    /* renamed from: E9 */
    public void mo60854E9(C90588k kVar, C90586i iVar) {
        ((C37596a) ((C37288f) C86312j.m106911c(C37288f.class)).Lo0()).getClass();
        C86709a0.m107524d().mo123460f(new C91358b(kVar, iVar));
    }

    public void G60(String str, String str2, String str3, boolean z, C90586i iVar) {
        ((C37596a) ((C37288f) C86312j.m106911c(C37288f.class)).Lo0()).getClass();
        C86709a0.m107524d().mo123460f(new C91359c(str, str2, str3, z, iVar));
    }

    /* renamed from: OH */
    public void mo60856OH(int i) {
        Class cls = C37288f.class;
        if (((C37288f) C86312j.m106911c(cls)).Lo0() != null) {
            ((C37596a) ((C37288f) C86312j.m106911c(cls)).Lo0()).mo61219a(i, false, 0);
        }
    }

    /* renamed from: RZ */
    public void mo60857RZ(List<C90588k> list, C90586i iVar) {
        ((C37596a) ((C37288f) C86312j.m106911c(C37288f.class)).Lo0()).getClass();
        C86709a0.m107524d().mo123460f(new C91360d(list, iVar));
    }

    public void bs0(int i, int i2) {
        Class cls = C37288f.class;
        if (((C37288f) C86312j.m106911c(cls)).Lo0() != null) {
            ((C37596a) ((C37288f) C86312j.m106911c(cls)).Lo0()).mo61219a(i, true, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<tw0.a>, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        if (r1 == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r1 == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<tw0.C37285a> c10() {
        /*
            r7 = this;
            java.lang.Class<tw0.f> r0 = tw0.C37288f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tw0.f r0 = (tw0.C37288f) r0
            tw0.g r0 = r0.Lo0()
            uw0.a r0 = (uw0.C37596a) r0
            vw0.a r0 = r0.f99702a
            r1 = 0
            if (r0 == 0) goto L_0x0069
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getBeginTimeOfToday()
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 - r5
            java.lang.String r5 = "select * from ActiveInfo where useTime >= ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            r6[r4] = r3
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f100213d     // Catch:{ Exception -> 0x0052 }
            r3 = 2
            android.database.Cursor r1 = r0.rawQuery(r5, r6, r3)     // Catch:{ Exception -> 0x0052 }
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0052 }
            if (r0 == 0) goto L_0x004d
        L_0x003c:
            tw0.a r0 = new tw0.a     // Catch:{ Exception -> 0x0052 }
            r0.<init>()     // Catch:{ Exception -> 0x0052 }
            r0.convertFrom(r1)     // Catch:{ Exception -> 0x0052 }
            r2.add(r0)     // Catch:{ Exception -> 0x0052 }
            boolean r0 = r1.moveToNext()     // Catch:{ Exception -> 0x0052 }
            if (r0 != 0) goto L_0x003c
        L_0x004d:
            if (r1 == 0) goto L_0x0061
            goto L_0x005e
        L_0x0050:
            r0 = move-exception
            goto L_0x0063
        L_0x0052:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.Tinker.ActiveInfoStorage"
            java.lang.String r5 = "getDayActiveFeature failed."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0050 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r4)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0061
        L_0x005e:
            r1.close()
        L_0x0061:
            r1 = r2
            goto L_0x0069
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.close()
        L_0x0068:
            throw r0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sw0.C36863c.c10():java.util.List");
    }
}
