package com.tencent.p014mm.plugin.recordvideo.background.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import dh2.C31182a;
import dh2.C31183b;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import zh3.C91753f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/background/provider/WeSeeProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider */
public final class WeSeeProvider extends ContentProvider {

    /* renamed from: g */
    public static final C30354a f115880g = new C30354a((C8480h) null);

    /* renamed from: h */
    public static final String f115881h = WeChatAuthorities.AUTHORITIES_PLUGIN_RECORDVIDEO_BACKGROUND_PROVIDER_WESEEPROVIDER();

    /* renamed from: i */
    public static final String f115882i = SearchIntents.EXTRA_QUERY;

    /* renamed from: j */
    public static final String f115883j = "delete";

    /* renamed from: n */
    public static final int f115884n = 100;

    /* renamed from: o */
    public static final int f115885o = 101;

    /* renamed from: p */
    public static final int f115886p = 1;

    /* renamed from: q */
    public static final int f115887q = 3600000;

    /* renamed from: d */
    public UriMatcher f115888d = new UriMatcher(-1);

    /* renamed from: e */
    public C31182a f115889e;

    /* renamed from: f */
    public final String f115890f;

    /* renamed from: com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider$a */
    public static final class C30354a {
        public C30354a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo57308a() {
            C30354a aVar = WeSeeProvider.f115880g;
            Log.m105924i("MicroMsg.WeSeeProvider", "delete fun");
            C91753f fVar = C86709a0.m107535s().f251811i;
            C87412m.m108593f(fVar, "storage().dataDB");
            C31182a aVar2 = new C31182a(fVar);
            int count = aVar2.getCount();
            if (count == 0) {
                Log.m105918d("MicroMsg.WeSeeProvider", "delete fail count == 0");
                return;
            }
            Log.m105918d("MicroMsg.WeSeeProvider", "delete into count: " + count);
            if (count > 1) {
                Log.m105920e("MicroMsg.WeSeeProvider", "delete count error, count: " + count + ' ');
            }
            aVar2.delete((long) WeSeeProvider.f115886p);
        }

        /* renamed from: b */
        public final void mo57309b(String str, long j) {
            C87412m.m108594g(str, "weSeeUri");
            C30354a aVar = WeSeeProvider.f115880g;
            Log.m105924i("MicroMsg.WeSeeProvider", "insert fun");
            C91753f fVar = C86709a0.m107535s().f251811i;
            C87412m.m108593f(fVar, "storage().dataDB");
            C31182a aVar2 = new C31182a(fVar);
            C31183b bVar = new C31183b();
            bVar.field_weSeeUri = str;
            bVar.field_time = j;
            if (aVar2.getCount() == 0) {
                Log.m105924i("MicroMsg.WeSeeProvider", "insert weseeProvider:" + str + ", time:" + j);
                aVar2.insert(bVar);
                return;
            }
            Log.m105924i("MicroMsg.WeSeeProvider", "update weseeProvider:" + str + ", time:" + j);
            aVar2.update((long) WeSeeProvider.f115886p, bVar);
        }
    }

    public WeSeeProvider() {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C31183b.f83575p;
        sb.append(C31183b.f83576q);
        this.f115890f = sb.toString();
        UriMatcher uriMatcher = this.f115888d;
        String str = f115881h;
        uriMatcher.addURI(str, f115882i, f115884n);
        this.f115888d.addURI(str, f115883j, f115885o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c1 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66968a() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.WeSeeProvider"
            r1 = 1
            r2 = 0
            int r3 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x005b }
            android.content.Context r4 = r11.getContext()     // Catch:{ Exception -> 0x005b }
            gy3.C87412m.m108591d(r4)     // Catch:{ Exception -> 0x005b }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x005b }
            int r5 = android.os.Binder.getCallingUid()     // Catch:{ Exception -> 0x005b }
            java.lang.String[] r4 = r4.getPackagesForUid(r5)     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = "getCallingPackages, callingUid = %d, packages size = %d"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x005b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005b }
            r6[r2] = r3     // Catch:{ Exception -> 0x005b }
            if (r4 == 0) goto L_0x002a
            int r3 = r4.length     // Catch:{ Exception -> 0x005b }
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005b }
            r6[r1] = r3     // Catch:{ Exception -> 0x005b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x003e
            java.lang.String r3 = "getCallingPackages fail, packages is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)     // Catch:{ Exception -> 0x005b }
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Exception -> 0x005b }
            goto L_0x006b
        L_0x003e:
            java.util.Iterator r3 = gy3.C32617c.m39769a(r4)     // Catch:{ Exception -> 0x005b }
        L_0x0042:
            r5 = r3
            gy3.b r5 = (gy3.C32616b) r5     // Catch:{ Exception -> 0x005b }
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x005b }
            if (r6 == 0) goto L_0x006b
            java.lang.Object r5 = r5.next()     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x005b }
            java.lang.String r6 = "getCallingPackages = %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x005b }
            r7[r2] = r5     // Catch:{ Exception -> 0x005b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r7)     // Catch:{ Exception -> 0x005b }
            goto L_0x0042
        L_0x005b:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r3 = r3.getMessage()
            r4[r2] = r3
            java.lang.String r3 = "getCallingPackages, ex = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
            java.lang.String[] r4 = new java.lang.String[r2]
        L_0x006b:
            int r3 = r4.length
            if (r3 != 0) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x00e2
            r3 = r4[r2]
            android.content.Context r4 = r11.getContext()
            android.content.pm.Signature[] r4 = com.tencent.p014mm.pluginsdk.model.app.C6647c.m6936a(r4, r3)
            gy3.C87412m.m108591d(r4)
            r5 = r4[r2]
            byte[] r5 = r5.toByteArray()
            java.lang.String r5 = p823sg.C90193h.m112878f(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkMD5 packageName:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ", signatures:"
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ", sig:"
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.String r3 = "2A281593D71DF33374E6124E9106DF08"
            boolean r3 = z04.C112551y.m153809i(r3, r5, r1)
            if (r3 == 0) goto L_0x00cd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkMD5 success sig:"
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r3 = 1
            goto L_0x00e8
        L_0x00cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkMD5 failed diff sig:"
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            goto L_0x00e7
        L_0x00e2:
            java.lang.String r3 = "checkMD5 failed, packages is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            if (r3 != 0) goto L_0x00eb
            return r2
        L_0x00eb:
            f40.a0 r3 = f40.C86709a0.m107528h()
            boolean r3 = r3.f251735l
            if (r3 == 0) goto L_0x01c2
            f40.e r3 = f40.C86709a0.m107523b()
            boolean r3 = r3.mo121114l()
            if (r3 != 0) goto L_0x00ff
            goto L_0x01c2
        L_0x00ff:
            dh2.a r3 = r11.f115889e
            if (r3 != 0) goto L_0x011b
            dh2.a r3 = new dh2.a
            f40.o r4 = f40.C86709a0.m107535s()
            zh3.f r4 = r4.f251811i
            java.lang.String r5 = "storage().dataDB"
            gy3.C87412m.m108593f(r4, r5)
            r3.<init>(r4)
            r11.f115889e = r3
            java.lang.String r3 = "checkValid, init database"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
        L_0x011b:
            dh2.a r3 = r11.f115889e
            r4 = 0
            if (r3 == 0) goto L_0x0129
            java.lang.String r5 = r11.f115890f
            java.lang.String[] r6 = new java.lang.String[r2]
            android.database.Cursor r3 = r3.rawQuery(r5, r6)
            goto L_0x012a
        L_0x0129:
            r3 = r4
        L_0x012a:
            if (r3 == 0) goto L_0x012f
            r3.moveToFirst()
        L_0x012f:
            if (r3 == 0) goto L_0x0139
            int r4 = r3.getCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0139:
            if (r4 != 0) goto L_0x013c
            goto L_0x0194
        L_0x013c:
            int r5 = r4.intValue()
            if (r5 != r1) goto L_0x0194
            java.lang.String r4 = "time"
            int r4 = r3.getColumnIndex(r4)
            long r4 = r3.getLong(r4)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "checkTime db time: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ", current time: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", diff: "
            r8.append(r9)
            long r9 = r6 - r4
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r8)
            long r4 = r4 - r6
            int r6 = f115887q
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x01a2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkTime timeout diff is: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x01b8
        L_0x0194:
            if (r4 != 0) goto L_0x0197
            goto L_0x01a4
        L_0x0197:
            int r5 = r4.intValue()
            if (r5 != 0) goto L_0x01a4
            java.lang.String r4 = "checkTime no data in db"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
        L_0x01a2:
            r0 = 1
            goto L_0x01b9
        L_0x01a4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkTime count error : "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
        L_0x01b8:
            r0 = 0
        L_0x01b9:
            if (r3 == 0) goto L_0x01be
            r3.close()
        L_0x01be:
            if (r0 != 0) goto L_0x01c1
            return r2
        L_0x01c1:
            return r1
        L_0x01c2:
            java.lang.String r1 = "MMKernel uninit"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.background.provider.WeSeeProvider.mo66968a():boolean");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C87412m.m108594g(uri, "uri");
        Log.m105918d("MicroMsg.WeSeeProvider", "delete uri" + uri + ", selection" + str + ", selectionArgs:" + strArr);
        if (!mo66968a()) {
            Log.m105920e("MicroMsg.WeSeeProvider", "delete checkValid failed");
            return 0;
        }
        if (this.f115888d.match(uri) == f115885o) {
            C31182a aVar = this.f115889e;
            Integer valueOf = aVar != null ? Integer.valueOf(aVar.getCount()) : null;
            C87412m.m108591d(valueOf);
            int intValue = valueOf.intValue();
            if (intValue == 0) {
                Log.m105918d("MicroMsg.WeSeeProvider", "delete fail count == 0");
            } else {
                Log.m105918d("MicroMsg.WeSeeProvider", "delete into count: " + intValue);
                if (intValue > 1) {
                    Log.m105920e("MicroMsg.WeSeeProvider", "delete count error, count: " + intValue + ' ');
                }
                C31182a aVar2 = this.f115889e;
                if (aVar2 != null) {
                    aVar2.delete((long) f115886p);
                }
            }
        } else {
            Log.m105924i("MicroMsg.WeSeeProvider", "delete uriMatcher match failed");
        }
        return 0;
    }

    public String getType(Uri uri) {
        C87412m.m108594g(uri, "uri");
        Log.m105918d("MicroMsg.WeSeeProvider", "getType uri: " + uri);
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C87412m.m108594g(uri, "uri");
        Log.m105918d("MicroMsg.WeSeeProvider", "insert uri:" + uri + ", values:" + contentValues);
        return null;
    }

    public boolean onCreate() {
        Log.m105918d("MicroMsg.WeSeeProvider", "onCreate");
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C87412m.m108594g(uri, "uri");
        Log.m105918d("MicroMsg.WeSeeProvider", "query uri:" + uri + ", projection:" + strArr + ", selection:" + str + ", selectionArgs:" + strArr2 + ", sortOrder:" + str2);
        if (!mo66968a()) {
            Log.m105920e("MicroMsg.WeSeeProvider", "query checkValid failed");
            return null;
        } else if (this.f115888d.match(uri) == f115884n) {
            Log.m105924i("MicroMsg.WeSeeProvider", "query inner ");
            C31182a aVar = this.f115889e;
            if (aVar != null) {
                return aVar.rawQuery(this.f115890f, new String[0]);
            }
            return null;
        } else {
            Log.m105924i("MicroMsg.WeSeeProvider", "query uriMatcher match failed");
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C87412m.m108594g(uri, "uri");
        Log.m105918d("MicroMsg.WeSeeProvider", "update uri" + uri + ", values:" + contentValues + ", selection:" + str + ", selectionArgs:" + strArr);
        return 0;
    }
}
