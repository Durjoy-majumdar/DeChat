package zg0;

import android.text.TextUtils;
import bh0.C113174b;
import bh0.C54460a;
import com.tencent.p014mm.plugin.address.model.RcptItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p287zz.C79442f;
import z04.C119027c;

/* renamed from: zg0.p */
public class C119113p {

    /* renamed from: a */
    public C54460a f356680a = new C54460a();

    /* renamed from: b */
    public boolean f356681b = false;

    /* renamed from: c */
    public final HashMap<Integer, RcptItem> f356682c = new HashMap<>();

    /* renamed from: d */
    public final List<RcptItem> f356683d = new ArrayList();

    /* renamed from: a */
    public final void mo183776a(C54460a aVar) {
        if (aVar != null) {
            try {
                LinkedList<C113174b> linkedList = aVar.f152728d;
                if (linkedList != null) {
                    Iterator<C113174b> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C113174b next = it.next();
                        String str = next.f338620j;
                        if (str != null) {
                            if (str.startsWith(next.f338616f)) {
                                str = str.replaceFirst(next.f338616f, "");
                            }
                            if (str.startsWith(next.f338617g)) {
                                str = str.replaceFirst(next.f338617g, "");
                            }
                            if (str.startsWith(next.f338618h)) {
                                str = str.replaceFirst(next.f338618h, "");
                            }
                            if (str.startsWith(next.f338624q)) {
                                str = str.replaceFirst(next.f338624q, "");
                            }
                            if (!next.f338620j.equalsIgnoreCase(str)) {
                                Log.m105925i("MicroMsg.WalletAddrMgr", "clean dirty data, %s, %s", next.f338620j, str);
                            }
                            next.f338620j = str;
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletAddrMgr", e, (String) null, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public C113174b mo183777b(int i) {
        for (int i2 = 0; i2 < this.f356680a.f152728d.size(); i2++) {
            C113174b bVar = this.f356680a.f152728d.get(i2);
            if (bVar.f338614d == i) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public RcptItem mo183778c(List<RcptItem> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            RcptItem rcptItem = list.get(i);
            if (rcptItem != null && str.startsWith(rcptItem.f196786d)) {
                return rcptItem;
            }
        }
        return null;
    }

    /* renamed from: d */
    public RcptItem mo183779d(int i) {
        return this.f356682c.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public List<RcptItem> mo183780e(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f356683d).iterator();
        while (it.hasNext()) {
            RcptItem rcptItem = (RcptItem) it.next();
            if (rcptItem.f196790h == i) {
                arrayList.add(rcptItem);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<RcptItem> mo183781f(String str) {
        return mo183780e(Util.isNullOrNil(str) ? 0 : str.hashCode());
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067 A[SYNTHETIC, Splitter:B:32:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f A[SYNTHETIC, Splitter:B:43:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087 A[Catch:{ Exception -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e3 A[SYNTHETIC, Splitter:B:75:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f3 A[SYNTHETIC, Splitter:B:81:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0123  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo183782g() {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f356681b
            if (r0 != 0) goto L_0x0010
            java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r0 = r1.f356683d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01e8
        L_0x0010:
            java.lang.String r2 = "MicroMsg.WalletAddrMgr"
            java.lang.String r0 = "need init address info"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 89
            r3 = 1
            java.lang.String r0 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils.m162987a(r0, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = ""
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r8 = 0
            if (r6 == 0) goto L_0x0091
            com.tencent.mm.vfs.t1 r6 = new com.tencent.mm.vfs.t1     // Catch:{ IOException -> 0x005d, all -> 0x0058 }
            r6.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x005d, all -> 0x0058 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r9.<init>(r6)     // Catch:{ IOException -> 0x0056, all -> 0x0054 }
            r4.clear()     // Catch:{ IOException -> 0x0052 }
        L_0x0039:
            java.lang.String r0 = r9.readLine()     // Catch:{ IOException -> 0x0052 }
            if (r0 == 0) goto L_0x0043
            r4.add(r0)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0039
        L_0x0043:
            r6.close()     // Catch:{ Exception -> 0x004a }
            r9.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r6)
        L_0x0050:
            r6 = 1
            goto L_0x0093
        L_0x0052:
            r0 = move-exception
            goto L_0x0060
        L_0x0054:
            r0 = move-exception
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            goto L_0x005f
        L_0x0058:
            r0 = move-exception
            r6 = 0
        L_0x005a:
            r3 = r0
            r7 = 0
            goto L_0x007d
        L_0x005d:
            r0 = move-exception
            r6 = 0
        L_0x005f:
            r9 = 0
        L_0x0060:
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x007a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r10)     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x006d
            r6.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x006d
        L_0x006b:
            r0 = move-exception
            goto L_0x0073
        L_0x006d:
            if (r9 == 0) goto L_0x0078
            r9.close()     // Catch:{ Exception -> 0x006b }
            goto L_0x0078
        L_0x0073:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r6)
        L_0x0078:
            r6 = 0
            goto L_0x0093
        L_0x007a:
            r0 = move-exception
            r7 = r9
            r3 = r0
        L_0x007d:
            if (r6 == 0) goto L_0x0085
            r6.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0085
        L_0x0083:
            r0 = move-exception
            goto L_0x008b
        L_0x0085:
            if (r7 == 0) goto L_0x0090
            r7.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0090
        L_0x008b:
            java.lang.Object[] r4 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r4)
        L_0x0090:
            throw r3
        L_0x0091:
            r6 = 0
            r9 = 0
        L_0x0093:
            long r10 = java.lang.System.currentTimeMillis()
            if (r6 != 0) goto L_0x00ff
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.AssetManager r0 = r0.getAssets()
            r4.clear()
            java.lang.String r12 = "new_address"
            java.io.InputStream r0 = r0.open(r12)     // Catch:{ IOException -> 0x00db }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00db }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00db }
            java.lang.String r14 = "utf-8"
            r13.<init>(r0, r14)     // Catch:{ IOException -> 0x00db }
            r12.<init>(r13)     // Catch:{ IOException -> 0x00db }
        L_0x00b7:
            java.lang.String r9 = r12.readLine()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
            if (r9 == 0) goto L_0x00c1
            r4.add(r9)     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
            goto L_0x00b7
        L_0x00c1:
            r12.close()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
            r0.close()     // Catch:{ IOException -> 0x00d6, all -> 0x00d3 }
            r12.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00ff
        L_0x00cb:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r5, r0)
            goto L_0x00ff
        L_0x00d3:
            r0 = move-exception
            r3 = r0
            goto L_0x00f1
        L_0x00d6:
            r0 = move-exception
            r9 = r12
            goto L_0x00dc
        L_0x00d9:
            r0 = move-exception
            goto L_0x00ef
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r12)     // Catch:{ all -> 0x00d9 }
            if (r9 == 0) goto L_0x00ff
            r9.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00ff
        L_0x00e7:
            r0 = move-exception
            r9 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r5, r0)
            goto L_0x00ff
        L_0x00ef:
            r3 = r0
            r12 = r9
        L_0x00f1:
            if (r12 == 0) goto L_0x00fe
            r12.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00fe
        L_0x00f7:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r5, r0)
        L_0x00fe:
            throw r3
        L_0x00ff:
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "read from addr "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            int r0 = r4.size()
            java.lang.String r5 = "\\s+"
            java.util.regex.Pattern.compile(r5)
            r5 = 0
        L_0x0121:
            if (r5 >= r0) goto L_0x01c9
            java.lang.Object r9 = r4.get(r5)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x012e
            r3 = 0
            r9 = 0
            goto L_0x017f
        L_0x012e:
            int r14 = r9.length()
            if (r14 != 0) goto L_0x0138
            java.lang.String[] r9 = new java.lang.String[r8]
            r3 = 0
            goto L_0x017f
        L_0x0138:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r6 = 0
            r7 = 0
            r16 = 0
        L_0x0141:
            r3 = 32
            if (r7 >= r14) goto L_0x016b
            char r8 = r9.charAt(r7)
            if (r8 == r3) goto L_0x015a
            char r3 = r9.charAt(r7)
            r8 = 9
            if (r3 != r8) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            int r7 = r7 + 1
            r8 = 0
            r16 = 1
            goto L_0x0141
        L_0x015a:
            if (r16 != 0) goto L_0x015d
            goto L_0x0166
        L_0x015d:
            java.lang.String r3 = r9.substring(r6, r7)
            r15.add(r3)
            r16 = 0
        L_0x0166:
            int r6 = r7 + 1
            r7 = r6
            r8 = 0
            goto L_0x0141
        L_0x016b:
            if (r16 != 0) goto L_0x016e
            goto L_0x0175
        L_0x016e:
            java.lang.String r3 = r9.substring(r6, r7)
            r15.add(r3)
        L_0x0175:
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.Object[] r6 = r15.toArray(r6)
            r9 = r6
            java.lang.String[] r9 = (java.lang.String[]) r9
        L_0x017f:
            int r6 = r9.length
            r7 = 3
            if (r6 >= r7) goto L_0x0184
            goto L_0x01c3
        L_0x0184:
            com.tencent.mm.plugin.address.model.RcptItem r6 = new com.tencent.mm.plugin.address.model.RcptItem
            r7 = 1
            r8 = r9[r7]
            r7 = r9[r3]
            r3 = 2
            r9 = r9[r3]
            r6.<init>(r8, r7, r9)
            int r7 = r6.f196789g
            if (r7 != r3) goto L_0x0197
            r3 = 1
            goto L_0x0198
        L_0x0197:
            r3 = 0
        L_0x0198:
            if (r3 == 0) goto L_0x01ad
            java.lang.String r3 = "市辖区"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x01ad
            java.lang.String r3 = r6.f196788f
            java.lang.String r7 = "000000"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x01c3
        L_0x01ad:
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.address.model.RcptItem> r3 = r1.f356682c
            java.lang.String r7 = r6.f196787e
            int r7 = r7.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.put(r7, r6)
            java.util.List<com.tencent.mm.plugin.address.model.RcptItem> r3 = r1.f356683d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r6)
        L_0x01c3:
            int r5 = r5 + 1
            r3 = 1
            r8 = 0
            goto L_0x0121
        L_0x01c9:
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r5 = r12 - r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            long r3 = r3 - r12
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r0[r4] = r3
            java.lang.String r3 = "load data, %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            r1.f356681b = r6
        L_0x01e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg0.C119113p.mo183782g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r3 = mo183778c(mo183781f(r4.f196787e), r6);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.address.model.RcptItem mo183783h(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0060
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x000e
            goto L_0x0060
        L_0x000e:
            r0 = 0
            java.util.List r0 = r2.mo183780e(r0)
            com.tencent.mm.plugin.address.model.RcptItem r3 = r2.mo183778c(r0, r3)
            if (r3 == 0) goto L_0x0060
            java.lang.String r0 = r3.f196787e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x0060
        L_0x0022:
            java.lang.String r3 = r3.f196787e
            java.util.List r3 = r2.mo183781f(r3)
            com.tencent.mm.plugin.address.model.RcptItem r3 = r2.mo183778c(r3, r4)
            if (r3 == 0) goto L_0x0060
            java.lang.String r4 = r3.f196787e
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0037
            goto L_0x0060
        L_0x0037:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L_0x003e
            return r3
        L_0x003e:
            java.lang.String r4 = r3.f196787e
            java.util.List r4 = r2.mo183781f(r4)
            com.tencent.mm.plugin.address.model.RcptItem r4 = r2.mo183778c(r4, r5)
            if (r4 != 0) goto L_0x004b
            return r3
        L_0x004b:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0052
            return r4
        L_0x0052:
            java.lang.String r3 = r4.f196787e
            java.util.List r3 = r2.mo183781f(r3)
            com.tencent.mm.plugin.address.model.RcptItem r3 = r2.mo183778c(r3, r6)
            if (r3 != 0) goto L_0x005f
            return r4
        L_0x005f:
            return r3
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zg0.C119113p.mo183783h(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.tencent.mm.plugin.address.model.RcptItem");
    }

    /* renamed from: i */
    public void mo183784i() {
        try {
            byte[] byteArray = this.f356680a.toByteArray();
            long currentTimeMillis = System.currentTimeMillis();
            ((C79442f) C86312j.m106911c(C79442f.class)).mo109159GK(C72994y1.C72995a.USERINFO_WALLET_ADDRESS_INFO_STRING_SYNC, new String(byteArray, C119027c.f356489b));
            Log.m105919d("MicroMsg.WalletAddrMgr", "hakon saveAddr time %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletAddrMgr", e, "", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        if (r1 != false) goto L_0x0066;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo183785j(java.util.LinkedList<te3.C118470tm3> r8) {
        /*
            r7 = this;
            bh0.a r0 = r7.f356680a
            java.util.LinkedList<bh0.b> r0 = r0.f152728d
            r0.clear()
            java.util.Iterator r8 = r8.iterator()
        L_0x000b:
            boolean r0 = r8.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r8.next()
            te3.tm3 r0 = (te3.C118470tm3) r0
            bh0.b r2 = new bh0.b
            r2.<init>()
            int r3 = r0.f354462d
            r2.f338614d = r3
            te3.rv3 r3 = r0.f354471p
            java.lang.String r3 = r3.f141175d
            r2.f338623p = r3
            te3.rv3 r3 = r0.f354465g
            java.lang.String r3 = r3.f141175d
            r2.f338617g = r3
            te3.rv3 r4 = r0.f354468j
            java.lang.String r4 = r4.f141175d
            r2.f338620j = r4
            te3.rv3 r4 = r0.f354466h
            java.lang.String r4 = r4.f141175d
            r2.f338618h = r4
            te3.rv3 r5 = r0.f354469n
            java.lang.String r5 = r5.f141175d
            r2.f338621n = r5
            te3.rv3 r5 = r0.f354470o
            java.lang.String r5 = r5.f141175d
            r2.f338622o = r5
            te3.rv3 r5 = r0.f354464f
            java.lang.String r5 = r5.f141175d
            r2.f338616f = r5
            te3.rv3 r6 = r0.f354467i
            java.lang.String r6 = r6.f141175d
            r2.f338619i = r6
            te3.rv3 r0 = r0.f354472q
            java.lang.String r0 = r0.f141175d
            r2.f338624q = r0
            com.tencent.mm.plugin.address.model.RcptItem r0 = r7.mo183783h(r5, r3, r4, r0)
            if (r0 == 0) goto L_0x0066
            int r0 = r0.f196789g
            r3 = 3
            if (r0 != r3) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            if (r1 == 0) goto L_0x0087
        L_0x0066:
            java.lang.String r0 = r2.f338618h
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = r2.f338624q
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
        L_0x0072:
            java.lang.String r0 = r2.f338624q
            java.lang.String r1 = "undefined"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = r2.f338624q
            java.lang.String r1 = "null"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x008b
        L_0x0087:
            java.lang.String r0 = ""
            r2.f338624q = r0
        L_0x008b:
            bh0.a r0 = r7.f356680a
            java.util.LinkedList<bh0.b> r0 = r0.f152728d
            r0.add(r2)
            goto L_0x000b
        L_0x0094:
            bh0.a r8 = r7.f356680a
            r7.mo183776a(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zg0.C119113p.mo183785j(java.util.LinkedList):boolean");
    }
}
