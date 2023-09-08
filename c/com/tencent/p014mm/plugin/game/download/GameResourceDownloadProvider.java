package com.tencent.p014mm.plugin.game.download;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import p237sp.C13754y;
import sw1.C48484q;
import tw1.C52369c;
import tw1.C52370d;
import wx1.C38343a;
import wx1.C38347e;
import wx1.C53217b;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/download/GameResourceDownloadProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.download.GameResourceDownloadProvider */
public final class GameResourceDownloadProvider extends ContentProvider {

    /* renamed from: e */
    public static final String f112823e = WeChatAuthorities.AUTHORITIES_PLUGIN_GAME_RES_DOWNLOAD();

    /* renamed from: d */
    public final UriMatcher f112824d;

    public GameResourceDownloadProvider() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f112824d = uriMatcher;
        uriMatcher.addURI(f112823e, "res_task", 101);
    }

    /* renamed from: a */
    public final boolean mo65651a(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider,callingPkg isNullOrEmpty ");
            return false;
        } else if (!C86709a0.m107528h().f251735l) {
            Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider,MMKernel uninit");
            return false;
        } else if (C86709a0.m107523b().mo121114l()) {
            return true;
        } else {
            Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider,MMKernel uninit");
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo65652b(C86009m1 m1Var, String str) {
        C86009m1[] u = m1Var.mo119984u();
        if (u == null) {
            return false;
        }
        int length = u.length;
        int i = 0;
        while (i < length) {
            C86009m1 m1Var2 = u[i];
            if (m1Var2.mo119978p() && C87412m.m108589b(m1Var2.getName(), str)) {
                m1Var2.mo119966f();
                return true;
            } else if (m1Var2.mo119977o()) {
                return mo65652b(m1Var2, str);
            } else {
                i++;
            }
        }
        return false;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        T t;
        Class cls = C13754y.class;
        Class cls2 = C48484q.class;
        C87412m.m108594g(uri, "uri");
        Log.m105924i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete");
        String callingPackage = getCallingPackage();
        if (!mo65651a(callingPackage)) {
            return 0;
        }
        if (this.f112824d.match(uri) != 101) {
            Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, path not query");
            return 0;
        }
        C38347e Og0 = ((C48484q) C86312j.m106911c(cls2)).Og0();
        C87412m.m108591d(callingPackage);
        C38343a Lo = Og0.mo61626Lo(callingPackage);
        if (Lo == null) {
            Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete gameResourceDownloadInfo is null");
            return 0;
        } else if (C87412m.m108589b(uri.getQueryParameter(IXWebBroadcastListener.STAGE_FINISHED), "true")) {
            C52370d dVar = new C52370d();
            try {
                dVar.parseFrom(Lo.field_downloadItemList);
                LinkedList<C52369c> linkedList = dVar.f146366d;
                if (linkedList != null) {
                    for (C52369c cVar : linkedList) {
                        int r = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(cVar.f146357d);
                        Log.m105924i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete downloadId:" + cVar.f146357d + " ret:" + r);
                    }
                }
                boolean jo = ((C48484q) C86312j.m106911c(cls2)).Og0().mo61630jo(callingPackage);
                Log.m105924i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete packageName:" + callingPackage + ", delDownloadInfo: " + jo);
            } catch (Exception unused) {
                Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete GameResDownloadList parseFrom error");
                C86013q1.m106445f(C53217b.f148462a.mo73887d(callingPackage));
                ((C48484q) C86312j.m106911c(cls2)).Og0().mo61630jo(callingPackage);
            }
            return 0;
        } else {
            List<String> queryParameters = uri.getQueryParameters("file");
            if (!(queryParameters == null || queryParameters.isEmpty())) {
                C52370d dVar2 = new C52370d();
                try {
                    dVar2.parseFrom(Lo.field_downloadItemList);
                    C87412m.m108593f(queryParameters, "fileList");
                    for (String str2 : queryParameters) {
                        LinkedList<C52369c> linkedList2 = dVar2.f146366d;
                        if (linkedList2 != null) {
                            Iterator<T> it = linkedList2.iterator();
                            while (true) {
                                t = null;
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                String str3 = ((C52369c) next).f146365o;
                                C87412m.m108593f(str3, "it.CustomPath");
                                C87412m.m108593f(str2, DownloadInfo.FILENAME);
                                if (C112551y.m153808h(str3, str2, false, 2, (Object) null)) {
                                    t = next;
                                    break;
                                }
                            }
                            C52369c cVar2 = (C52369c) t;
                            if (cVar2 != null) {
                                int r2 = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63970r(cVar2.f146357d);
                                Log.m105924i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete downloadId:" + cVar2.f146357d + " ret:" + r2 + "  fileName = " + cVar2.f146365o);
                            }
                        }
                    }
                } catch (Exception unused2) {
                    String d = C53217b.f148462a.mo73887d(callingPackage);
                    C87412m.m108593f(queryParameters, "fileList");
                    for (String str4 : queryParameters) {
                        C86009m1 m1Var = new C86009m1(d);
                        C87412m.m108593f(str4, DownloadInfo.FILENAME);
                        boolean b = mo65652b(m1Var, str4);
                        Log.m105924i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete success:" + b + "  fileName = " + str4);
                    }
                }
            }
            return 0;
        }
    }

    public String getType(Uri uri) {
        C87412m.m108594g(uri, "p0");
        Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, not support getType");
        return "not support getType";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C87412m.m108594g(uri, "uri");
        Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, not support insert");
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0184, code lost:
        if (r6 != 6) goto L_0x018f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "uri"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = r17.getCallingPackage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "gamelog.gameRes , contentProvider, query  callingPkg = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "GameResourceDownloadProvider"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r0.mo65651a(r2)
            r5 = 0
            if (r3 != 0) goto L_0x002b
            return r5
        L_0x002b:
            android.content.UriMatcher r3 = r0.f112824d
            int r3 = r3.match(r1)
            r6 = 101(0x65, float:1.42E-43)
            if (r3 == r6) goto L_0x003b
            java.lang.String r1 = "gamelog.gameRes , contentProvider, path not query"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            return r5
        L_0x003b:
            java.lang.Class<sw1.q> r3 = sw1.C48484q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            sw1.q r3 = (sw1.C48484q) r3
            wx1.e r3 = r3.Og0()
            gy3.C87412m.m108591d(r2)
            wx1.a r2 = r3.mo61626Lo(r2)
            java.lang.String r3 = "query"
            java.lang.String r1 = r1.getQueryParameter(r3)
            java.lang.String r3 = "support"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            java.lang.String r6 = "gamelog.gameRes , contentProvider, gameResourceDownloadInfo is null"
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x0086
            android.database.MatrixCursor r1 = new android.database.MatrixCursor
            java.lang.String[] r3 = new java.lang.String[]{r3}
            r1.<init>(r3)
            if (r2 != 0) goto L_0x007a
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
            java.lang.Integer[] r2 = new java.lang.Integer[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2[r7] = r3
            r1.addRow(r2)
            goto L_0x0085
        L_0x007a:
            java.lang.Integer[] r2 = new java.lang.Integer[r8]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2[r7] = r3
            r1.addRow(r2)
        L_0x0085:
            return r1
        L_0x0086:
            if (r2 != 0) goto L_0x008c
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
            return r5
        L_0x008c:
            tw1.d r1 = new tw1.d
            r1.<init>()
            byte[] r2 = r2.field_downloadItemList     // Catch:{ Exception -> 0x020a }
            r1.parseFrom(r2)     // Catch:{ Exception -> 0x020a }
            java.util.LinkedList<tw1.c> r2 = r1.f146366d
            if (r2 == 0) goto L_0x00a3
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r2 = 0
            goto L_0x00a4
        L_0x00a3:
            r2 = 1
        L_0x00a4:
            if (r2 != 0) goto L_0x0209
            android.database.MatrixCursor r2 = new android.database.MatrixCursor
            java.lang.String r9 = "fileName"
            java.lang.String r10 = "md5"
            java.lang.String r11 = "fileLength"
            java.lang.String r12 = "state"
            java.lang.String r13 = "currentLength"
            java.lang.String r14 = "fileUri"
            java.lang.String[] r3 = new java.lang.String[]{r9, r10, r11, r12, r13, r14}
            r2.<init>(r3)
            java.util.LinkedList<tw1.c> r1 = r1.f146366d
            java.lang.String r3 = "gameResDownloadList.DownloadItemList"
            gy3.C87412m.m108593f(r1, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x00c6:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0201
            java.lang.Object r3 = r1.next()
            tw1.c r3 = (tw1.C52369c) r3
            java.lang.String r6 = r3.f146365o
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r9 = r6.getPath()
            if (r9 == 0) goto L_0x00f8
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r7, r7)
            java.lang.String r10 = r6.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x00f8
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r9)
            android.net.Uri r6 = r6.build()
        L_0x00f8:
            java.lang.String r9 = r3.f146365o
            java.lang.String r15 = "item.CustomPath"
            gy3.C87412m.m108593f(r9, r15)
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            java.lang.String r10 = "/"
            int r9 = z04.C112550d0.m153772H(r9, r10, r11, r12, r13, r14)
            if (r9 >= 0) goto L_0x010e
            java.lang.String r9 = r3.f146365o
            goto L_0x011e
        L_0x010e:
            java.lang.String r10 = r3.f146365o
            gy3.C87412m.m108593f(r10, r15)
            int r9 = r9 + 1
            java.lang.String r9 = r10.substring(r9)
            java.lang.String r10 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r9, r10)
        L_0x011e:
            com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r6 = r12.mo177799l(r6, r5)
            boolean r12 = r6.mo177810a()
            if (r12 != 0) goto L_0x012c
            r6 = 0
            goto L_0x0134
        L_0x012c:
            com.tencent.mm.vfs.FileSystem$c r12 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            boolean r6 = r12.mo119948x(r6)
        L_0x0134:
            if (r6 == 0) goto L_0x018d
            java.lang.Class<sp.y> r6 = p237sp.C13754y.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            sp.y r6 = (p237sp.C13754y) r6
            sp.v r6 = r6.Ds0()
            long r10 = r3.f146357d
            com.tencent.mm.plugin.downloader.model.l r6 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r6
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r6 = r6.mo63966n(r10)
            if (r6 == 0) goto L_0x018d
            long r10 = r6.f12200j
            long r12 = r6.f12201n
            long r14 = r3.f146360g
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0176
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "gamelog.gameRes , contentProvider, fileSize not same urlFileSize = "
            r12.append(r13)
            long r13 = r6.f12201n
            r12.append(r13)
            java.lang.String r13 = "   tgpa fileSize = "
            r12.append(r13)
            long r13 = r3.f146360g
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)
        L_0x0176:
            int r6 = r6.f12196f
            if (r6 == r8) goto L_0x018b
            r12 = 2
            if (r6 == r12) goto L_0x018b
            r12 = 3
            if (r6 == r12) goto L_0x0189
            r12 = 5
            if (r6 == r12) goto L_0x0187
            r12 = 6
            if (r6 == r12) goto L_0x0189
            goto L_0x018f
        L_0x0187:
            r12 = 3
            goto L_0x0190
        L_0x0189:
            r12 = 2
            goto L_0x0190
        L_0x018b:
            r12 = 1
            goto L_0x0190
        L_0x018d:
            r10 = 0
        L_0x018f:
            r12 = 0
        L_0x0190:
            android.content.Context r6 = r17.getContext()
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            java.lang.String r14 = r3.f146365o
            r13.<init>((java.lang.String) r14)
            android.net.Uri r6 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r6, r13)
            android.content.Context r13 = r17.getContext()
            if (r13 == 0) goto L_0x01ac
            java.lang.String r14 = r17.getCallingPackage()
            r13.grantUriPermission(r14, r6, r8)
        L_0x01ac:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "gamelog.gameRes , contentProvider, query  filePath = "
            r13.append(r14)
            java.lang.String r14 = r3.f146365o
            r13.append(r14)
            java.lang.String r14 = " fileUri = "
            r13.append(r14)
            r13.append(r6)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            r13 = 6
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r14 = "fileName"
            gy3.C87412m.m108593f(r9, r14)
            r13[r7] = r9
            java.lang.String r9 = r3.f146362i
            java.lang.String r14 = "item.Md5"
            gy3.C87412m.m108593f(r9, r14)
            r13[r8] = r9
            long r14 = r3.f146360g
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r9 = 2
            r13[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r9 = 3
            r13[r9] = r3
            r3 = 4
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            r13[r3] = r9
            java.lang.String r3 = "fileUri"
            gy3.C87412m.m108593f(r6, r3)
            r3 = 5
            r13[r3] = r6
            r2.addRow(r13)
            goto L_0x00c6
        L_0x0201:
            int r1 = r2.getCount()
            if (r1 != 0) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r5 = r2
        L_0x0209:
            return r5
        L_0x020a:
            java.lang.String r1 = "gamelog.gameRes , contentProvider, GameResDownloadList parseFrom error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.download.GameResourceDownloadProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C87412m.m108594g(uri, "uri");
        Log.m105920e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, not support update");
        return 0;
    }
}
