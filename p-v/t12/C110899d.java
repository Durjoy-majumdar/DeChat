package t12;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import f40.C86709a0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import lc3.C10485b;
import te3.C49828ic2;
import te3.C50550ni3;
import te3.vt4;
import te3.wt4;

/* renamed from: t12.d */
public class C110899d {
    /* renamed from: a */
    public static String m151187a(long j) {
        Context context = MMApplicationContext.getContext();
        double d = (double) j;
        if (d <= 60.0d) {
            return context.getString(C0966R.string.fu4, new Object[]{String.valueOf(j)});
        }
        double d2 = d / 60.0d;
        int i = (int) d2;
        if (d2 - ((double) i) > 0.0d) {
            i++;
        }
        return context.getString(C0966R.string.f360908fu3, new Object[]{String.valueOf(i)});
    }

    /* renamed from: b */
    public static String m151188b(long j) {
        Context context = MMApplicationContext.getContext();
        boolean z = true;
        if (m151190d(j, 6) == 0) {
            return new SimpleDateFormat("HH:mm", Locale.US).format(new Date(j));
        }
        if (m151190d(j, 6) != -1) {
            z = false;
        }
        return z ? context.getString(C0966R.string.ftv) : new SimpleDateFormat("MM/dd", Locale.US).format(new Date(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m151189c(android.content.Context r10) {
        /*
            java.lang.Class<vz.f> r0 = p734vz.C90876f.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            vz.f r1 = (p734vz.C90876f) r1
            boolean r1 = r1.mo124867WV()
            r2 = 2131831437(0x7f112a8d, float:1.92959E38)
            r3 = 2131831441(0x7f112a91, float:1.9295908E38)
            r4 = 2131831442(0x7f112a92, float:1.929591E38)
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x001e
            r2 = 2131831443(0x7f112a93, float:1.9295912E38)
            goto L_0x00a4
        L_0x001e:
            di3.d r0 = di3.C86312j.m106911c(r0)
            vz.f r0 = (p734vz.C90876f) r0
            boolean r0 = r0.mo124869yj()
            if (r0 == 0) goto L_0x002f
        L_0x002a:
            r2 = 2131831442(0x7f112a92, float:1.929591E38)
            goto L_0x00a4
        L_0x002f:
            boolean r0 = dd0.C75346e.m90355a()
            if (r0 == 0) goto L_0x003a
        L_0x0035:
            r2 = 2131831441(0x7f112a91, float:1.9295908E38)
            goto L_0x00a4
        L_0x003a:
            boolean r0 = p182kk.C61104a.m71644D()
            if (r0 == 0) goto L_0x0041
            goto L_0x00a4
        L_0x0041:
            dd0.b r0 = dd0.C75350g.m90357a()
            if (r0 == 0) goto L_0x0091
            dd0.b r0 = dd0.C75350g.m90357a()
            sx2.j r0 = (sx2.C48497j) r0
            monitor-enter(r0)
            qx2.b r1 = r0.f129703b     // Catch:{ all -> 0x008e }
            java.util.LinkedList<qx2.a> r1 = r1.f128488d     // Catch:{ all -> 0x008e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x008e }
        L_0x0056:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x0088
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x008e }
            qx2.a r7 = (qx2.C47888a) r7     // Catch:{ all -> 0x008e }
            int r8 = r7.f128487f     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0067
            goto L_0x0056
        L_0x0067:
            java.util.LinkedList<te3.gf4> r7 = r7.f128486e     // Catch:{ all -> 0x008e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x008e }
        L_0x006d:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0056
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x008e }
            te3.gf4 r8 = (te3.gf4) r8     // Catch:{ all -> 0x008e }
            java.lang.String r9 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x008e }
            java.lang.String r8 = r8.f134027e     // Catch:{ all -> 0x008e }
            boolean r8 = r9.equals(r8)     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x006d
            monitor-exit(r0)
            r0 = 1
            goto L_0x008a
        L_0x0088:
            monitor-exit(r0)
            r0 = 0
        L_0x008a:
            if (r0 == 0) goto L_0x0091
            r0 = 1
            goto L_0x0092
        L_0x008e:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x0091:
            r0 = 0
        L_0x0092:
            if (r0 == 0) goto L_0x0095
            goto L_0x0035
        L_0x0095:
            boolean r0 = p182kk.C61104a.m71645a()
            if (r0 == 0) goto L_0x009c
            goto L_0x002a
        L_0x009c:
            boolean r0 = p182kk.C61104a.m71648d()
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            if (r2 != 0) goto L_0x00a7
            return r5
        L_0x00a7:
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r10, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t12.C110899d.m151189c(android.content.Context):boolean");
    }

    /* renamed from: d */
    public static long m151190d(long j, int i) {
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis();
        instance.add(i, 1);
        long timeInMillis2 = instance.getTimeInMillis() - timeInMillis;
        return (j / timeInMillis2) - (Calendar.getInstance().getTimeInMillis() / timeInMillis2);
    }

    /* renamed from: e */
    public static C49828ic2 m151191e() {
        Object f = C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_ACCOUNT_CACHE_STRING, (Object) null);
        if (f != null) {
            C49828ic2 ic22 = new C49828ic2();
            try {
                ic22.parseFrom(Util.decodeHexString(f.toString()));
                Log.m105925i("MicroMsg.IPCallUtil", "[royle]parse success,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,Balance:%s,PVWording:%s,PackageMsg:%s", ic22.f135206d, ic22.f135207e, ic22.f135208f, ic22.f135209g, ic22.f135210h, ic22.f135211i, ic22.f135212j, ic22.f135213n, ic22.f135220u);
                return ic22;
            } catch (IOException e) {
                Log.m105925i("MicroMsg.IPCallUtil", "[royle]parse exception:%s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: f */
    public static String m151192f() {
        String string = MMApplicationContext.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryCode", "");
        return !Util.isNullOrNil(string) ? string.replace("+", "") : C13818a.m13113i();
    }

    /* renamed from: g */
    public static boolean m151193g() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WCOClosePurchaseEntranceSwitch", 0) != 0;
    }

    /* renamed from: h */
    public static wt4 m151194h(LinkedList<C50550ni3> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return null;
        }
        wt4 wt4 = new wt4();
        wt4.f299810d = linkedList.size();
        wt4.f299811e = new LinkedList<>();
        Iterator<C50550ni3> it = linkedList.iterator();
        while (it.hasNext()) {
            C50550ni3 next = it.next();
            vt4 vt4 = new vt4();
            String str = next.f138617d;
            byte b = 0;
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                if (address != null) {
                    byte b2 = 0;
                    for (byte b3 : address) {
                        b2 = (b2 << 8) | (b3 & ExifInterface.MARKER);
                    }
                    Log.m105919d("MicroMsg.IPCallUtil", "ipAddressStrToInt, ip: %s, result: %d", str, Integer.valueOf(b2));
                    b = b2;
                }
            } catch (UnknownHostException e) {
                Log.printErrStackTrace("MicroMsg.IPCallUtil", e, "", new Object[0]);
            }
            vt4.f143694d = b;
            vt4.f143695e = next.f138618e;
            vt4.f143696f = next.f138617d;
            wt4.f299811e.add(vt4);
        }
        return wt4;
    }

    /* renamed from: i */
    public static String m151195i(int i) {
        Context context = MMApplicationContext.getContext();
        return i != 1 ? i != 2 ? i != 6 ? i != 7 ? context.getString(C0966R.string.fvk) : context.getString(C0966R.string.fvh) : context.getString(C0966R.string.fvg) : context.getString(C0966R.string.fvk) : context.getString(C0966R.string.fvk);
    }

    /* renamed from: j */
    public static String m151196j(String str) {
        return str.replace("-", "").replace(" ", "").replace("(", "").replace(")", "").trim();
    }
}
