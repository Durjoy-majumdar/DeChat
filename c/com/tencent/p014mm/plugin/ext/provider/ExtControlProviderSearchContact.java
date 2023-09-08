package com.tencent.p014mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import cd3.C39945b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact */
public class ExtControlProviderSearchContact extends ExtContentProviderBase {

    /* renamed from: p */
    public static final String[] f269545p = {"userId", "nickname", "avatar", "content", "msgId", "msgType"};

    /* renamed from: q */
    public static List<String> f269546q = new ArrayList();

    /* renamed from: o */
    public Cursor f269547o = null;

    /* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact$a */
    public class C68886a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Cursor f197967d;

        /* renamed from: e */
        public final /* synthetic */ C39945b f197968e;

        public C68886a(Cursor cursor, C39945b bVar) {
            this.f197967d = cursor;
            this.f197968e = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.ByteArrayOutputStream} */
        /* JADX WARNING: type inference failed for: r12v1, types: [java.io.ByteArrayOutputStream] */
        /* JADX WARNING: type inference failed for: r12v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact r2 = com.tencent.p014mm.plugin.ext.provider.ExtControlProviderSearchContact.this
                android.database.Cursor r3 = r1.f197967d
                r2.getClass()
                java.lang.String r4 = ""
                java.lang.String r5 = "MicroMsg.ExtControlProviderSearchContact"
                zh3.d r6 = new zh3.d
                java.lang.String[] r0 = com.tencent.p014mm.plugin.ext.provider.ExtControlProviderSearchContact.f269545p
                r6.<init>(r0)
                r7 = 0
                r8 = 0
                boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x0118 }
                if (r0 == 0) goto L_0x0114
                r0 = 0
            L_0x001d:
                r9 = 1
                int r0 = r0 + r9
                com.tencent.mm.storage.z1 r10 = new com.tencent.mm.storage.z1     // Catch:{ Exception -> 0x0118 }
                r10.<init>()     // Catch:{ Exception -> 0x0118 }
                r10.convertFrom(r3)     // Catch:{ Exception -> 0x0118 }
                java.lang.String r11 = r10.getUsername()     // Catch:{ Exception -> 0x0118 }
                boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r11)     // Catch:{ Exception -> 0x0118 }
                if (r11 == 0) goto L_0x0033
                goto L_0x0106
            L_0x0033:
                java.lang.Class<ln.g> r11 = p196ln.C76706g.class
                di3.d r11 = di3.C86312j.m106911c(r11)     // Catch:{ Exception -> 0x0118 }
                ln.g r11 = (p196ln.C76706g) r11     // Catch:{ Exception -> 0x0118 }
                ln.j r11 = r11.mo106847uz()     // Catch:{ Exception -> 0x0118 }
                java.lang.String r12 = r10.getUsername()     // Catch:{ Exception -> 0x0118 }
                com.tencent.mm.modelavatar.g r11 = (com.tencent.p014mm.modelavatar.C68082g) r11     // Catch:{ Exception -> 0x0118 }
                android.graphics.Bitmap r11 = r11.mo93579f(r12, r9, r7, r8)     // Catch:{ Exception -> 0x0118 }
                if (r11 == 0) goto L_0x0058
                java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0118 }
                r12.<init>()     // Catch:{ Exception -> 0x0118 }
                android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0118 }
                r14 = 100
                r11.compress(r13, r14, r12)     // Catch:{ Exception -> 0x0118 }
                goto L_0x005e
            L_0x0058:
                java.lang.String r11 = "get useravatar is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)     // Catch:{ Exception -> 0x0118 }
                r12 = r8
            L_0x005e:
                eb0.c r11 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0118 }
                g62.l r11 = r11.mo105911z()     // Catch:{ Exception -> 0x0118 }
                java.lang.String r13 = r10.getUsername()     // Catch:{ Exception -> 0x0118 }
                com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11     // Catch:{ Exception -> 0x0118 }
                com.tencent.mm.storage.f4[] r11 = r11.Jx0(r13, r9)     // Catch:{ Exception -> 0x0118 }
                r13 = 6
                r16 = 3
                r17 = 2
                if (r11 == 0) goto L_0x00d4
                int r8 = r11.length     // Catch:{ Exception -> 0x0118 }
                if (r8 != r9) goto L_0x00d4
                java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0118 }
                long r14 = r10.f108320R1     // Catch:{ Exception -> 0x0118 }
                int r13 = (int) r14     // Catch:{ Exception -> 0x0118 }
                long r13 = (long) r13     // Catch:{ Exception -> 0x0118 }
                java.lang.String r13 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r13)     // Catch:{ Exception -> 0x0118 }
                r8[r7] = r13     // Catch:{ Exception -> 0x0118 }
                java.lang.String r10 = r10.mo62898f()     // Catch:{ Exception -> 0x0118 }
                r8[r9] = r10     // Catch:{ Exception -> 0x0118 }
                if (r12 != 0) goto L_0x0090
                r10 = 0
                goto L_0x0094
            L_0x0090:
                byte[] r10 = r12.toByteArray()     // Catch:{ Exception -> 0x0118 }
            L_0x0094:
                r8[r17] = r10     // Catch:{ Exception -> 0x0118 }
                r10 = r11[r7]     // Catch:{ Exception -> 0x0118 }
                int r10 = r10.getType()     // Catch:{ Exception -> 0x0118 }
                if (r10 != r9) goto L_0x00a5
                r10 = r11[r7]     // Catch:{ Exception -> 0x0118 }
                java.lang.String r10 = r10.getContent()     // Catch:{ Exception -> 0x0118 }
                goto L_0x00a6
            L_0x00a5:
                r10 = r4
            L_0x00a6:
                r8[r16] = r10     // Catch:{ Exception -> 0x0118 }
                r10 = r11[r7]     // Catch:{ Exception -> 0x0118 }
                long r12 = r10.getMsgId()     // Catch:{ Exception -> 0x0118 }
                java.lang.String r10 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r12)     // Catch:{ Exception -> 0x0118 }
                r12 = 4
                r8[r12] = r10     // Catch:{ Exception -> 0x0118 }
                r10 = r11[r7]     // Catch:{ Exception -> 0x0118 }
                int r11 = r10.getType()     // Catch:{ Exception -> 0x0118 }
                r12 = 34
                if (r11 != r12) goto L_0x00c1
                r9 = 2
                goto L_0x00c9
            L_0x00c1:
                int r10 = r10.getType()     // Catch:{ Exception -> 0x0118 }
                if (r10 != r9) goto L_0x00c8
                goto L_0x00c9
            L_0x00c8:
                r9 = 3
            L_0x00c9:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0118 }
                r10 = 5
                r8[r10] = r9     // Catch:{ Exception -> 0x0118 }
                r6.mo183794a(r8)     // Catch:{ Exception -> 0x0118 }
                goto L_0x0106
            L_0x00d4:
                java.lang.String r8 = "get msginfo failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r8)     // Catch:{ Exception -> 0x0118 }
                java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0118 }
                long r13 = r10.f108320R1     // Catch:{ Exception -> 0x0118 }
                int r11 = (int) r13     // Catch:{ Exception -> 0x0118 }
                long r13 = (long) r11     // Catch:{ Exception -> 0x0118 }
                java.lang.String r11 = com.tencent.p014mm.plugin.ext.key.AESUtil.m105053b(r13)     // Catch:{ Exception -> 0x0118 }
                r8[r7] = r11     // Catch:{ Exception -> 0x0118 }
                java.lang.String r10 = r10.mo62898f()     // Catch:{ Exception -> 0x0118 }
                r8[r9] = r10     // Catch:{ Exception -> 0x0118 }
                if (r12 != 0) goto L_0x00ef
                r9 = 0
                goto L_0x00f3
            L_0x00ef:
                byte[] r9 = r12.toByteArray()     // Catch:{ Exception -> 0x0118 }
            L_0x00f3:
                r8[r17] = r9     // Catch:{ Exception -> 0x0118 }
                r8[r16] = r4     // Catch:{ Exception -> 0x0118 }
                java.lang.String r9 = "0"
                r10 = 4
                r8[r10] = r9     // Catch:{ Exception -> 0x0118 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0118 }
                r10 = 5
                r8[r10] = r9     // Catch:{ Exception -> 0x0118 }
                r6.mo183794a(r8)     // Catch:{ Exception -> 0x0118 }
            L_0x0106:
                boolean r8 = r3.moveToNext()     // Catch:{ Exception -> 0x0118 }
                if (r8 == 0) goto L_0x0114
                r8 = 15
                if (r0 < r8) goto L_0x0111
                goto L_0x0114
            L_0x0111:
                r8 = 0
                goto L_0x001d
            L_0x0114:
                r3.close()     // Catch:{ Exception -> 0x0118 }
                goto L_0x012e
            L_0x0118:
                r0 = move-exception
                java.lang.String r8 = r0.getMessage()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
                java.lang.Object[] r7 = new java.lang.Object[r7]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r7)
                if (r3 == 0) goto L_0x012a
                r3.close()
            L_0x012a:
                r6.close()
                r6 = 0
            L_0x012e:
                r2.f269547o = r6
                cd3.b r0 = r1.f197968e
                r0.mo62559a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ext.provider.ExtControlProviderSearchContact.C68886a.run():void");
        }
    }

    static {
        for (String add : C45628s0.f123409o) {
            f269546q.add(add);
        }
        f269546q.add("officialaccounts");
        f269546q.add("helper_entry");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Log.m105918d("MicroMsg.ExtControlProviderSearchContact", "query()");
        Context context = getContext();
        this.f269494g = uri == null ? "" : Util.nullAsNil(uri.getQueryParameter("appid"));
        mo128172e(context);
        this.f269496i = 16;
        this.f269492e = Util.currentTicks();
        if (uri == null) {
            mo128176i(3);
            return null;
        } else if (Util.isNullOrNil(this.f269494g) || Util.isNullOrNil(mo128169b())) {
            mo128176i(3);
            return null;
        } else if (!mo128168a()) {
            mo128176i(1);
            return this.f269491d;
        } else if (!mo128174g(getContext())) {
            Log.m105928w("MicroMsg.ExtControlProviderSearchContact", "invalid appid ! return null");
            mo128176i(2);
            return null;
        } else if (strArr2 == null || strArr2.length == 0) {
            Log.m105920e("MicroMsg.ExtControlProviderSearchContact", "invaild selections");
            mo128176i(3);
            return null;
        } else {
            String trim = strArr2[0].trim();
            if (Util.isNullOrNil(trim)) {
                Log.m105920e("MicroMsg.ExtControlProviderSearchContact", "filter should not be null or nil");
                mo128176i(3);
                return null;
            }
            Cursor c = C97625j3.m125812b().mo105878D().mo71146c(trim, "@micromsg.no.verify.biz.qq.com", (String) null, f269546q, false, false, false, 1, (List<String>) null);
            if (c == null) {
                Log.m105920e("MicroMsg.ExtControlProviderSearchContact", "cursor is null");
                mo128176i(3);
                return null;
            }
            C39945b bVar = new C39945b();
            bVar.mo62560b(4000, new C68886a(c, bVar));
            if (this.f269547o != null) {
                mo128176i(0);
            } else {
                mo128176i(4);
            }
            return this.f269547o;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
