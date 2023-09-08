package ly1;

import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.webview.model.C96649l1;
import com.tencent.p014mm.plugin.webview.model.C96650m;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ji3.C9457a;
import ly1.C99745j;
import p235sm.C36691h0;
import p261wl.C38166b;
import p749xh.C66261f3;
import sw1.C101705t;
import sw1.C101706u;
import sw1.C48471j;
import sw1.C48484q;
import sw1.j$$b;
import w10.C15032a;
import zt3.C119157j;

/* renamed from: ly1.h0 */
public class C99736h0 {

    /* renamed from: o */
    public static final String f292307o = (C41872f.m45392b(C41872f.C41873a.ONE_MONTH) + "haowan/");

    /* renamed from: p */
    public static int f292308p = 5;

    /* renamed from: a */
    public String f292309a;

    /* renamed from: b */
    public LinkedList<String> f292310b = new LinkedList<>();

    /* renamed from: c */
    public boolean f292311c;

    /* renamed from: d */
    public C99742e f292312d;

    /* renamed from: e */
    public Set<String> f292313e = new HashSet();

    /* renamed from: f */
    public Set<String> f292314f = new HashSet();

    /* renamed from: g */
    public Set<String> f292315g = new HashSet();

    /* renamed from: h */
    public int f292316h;

    /* renamed from: i */
    public boolean f292317i;

    /* renamed from: j */
    public boolean f292318j;

    /* renamed from: k */
    public HashMap<String, Long> f292319k;

    /* renamed from: l */
    public Runnable f292320l;

    /* renamed from: m */
    public C96651n f292321m;

    /* renamed from: n */
    public C96650m f292322n;

    /* renamed from: ly1.h0$a */
    public class C99737a implements Runnable {
        public C99737a() {
        }

        public void run() {
            C99736h0 h0Var = C99736h0.this;
            if (!h0Var.f292318j) {
                int i = h0Var.f292316h + 1;
                h0Var.f292316h = i;
                if (i <= C99736h0.f292308p) {
                    ((HashSet) h0Var.f292313e).clear();
                    C99736h0 h0Var2 = C99736h0.this;
                    h0Var2.f292313e.addAll(h0Var2.f292315g);
                    ((HashSet) C99736h0.this.f292315g).clear();
                    C99736h0.this.mo139095e();
                    return;
                }
                Log.m105924i("MicroMsg.Haowan.GameUploadMediaEngine", "retry count bigger than 5");
                C99736h0 h0Var3 = C99736h0.this;
                Iterator it = ((HashSet) h0Var3.f292315g).iterator();
                while (it.hasNext()) {
                    C99734h og02 = ((C48484q) C86312j.m106911c(C48484q.class)).og0();
                    og02.getClass();
                    String format = String.format("update %s set %s=%d where %s=\"%s\"", new Object[]{"GameHaowanMedia", "uploadState", 1, C66261f3.COL_LOCALID, (String) it.next()});
                    Log.m105924i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateUploadSuccess, sql: " + format);
                    og02.execSQL("GameHaowanMedia", format);
                }
                ((HashSet) h0Var3.f292315g).clear();
                C99742e eVar = h0Var3.f292312d;
                if (eVar != null) {
                    ((C99745j.C99746a.C99747a) eVar).mo139106a(false);
                }
            }
        }
    }

    /* renamed from: ly1.h0$b */
    public class C99738b implements C96651n {

        /* renamed from: ly1.h0$b$a */
        public class C99739a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f292325d;

            /* renamed from: e */
            public final /* synthetic */ long f292326e;

            /* renamed from: f */
            public final /* synthetic */ boolean f292327f;

            /* renamed from: g */
            public final /* synthetic */ String f292328g;

            /* renamed from: h */
            public final /* synthetic */ String f292329h;

            /* renamed from: i */
            public final /* synthetic */ int f292330i;

            public C99739a(String str, long j, boolean z, String str2, String str3, int i) {
                this.f292325d = str;
                this.f292326e = j;
                this.f292327f = z;
                this.f292328g = str2;
                this.f292329h = str3;
                this.f292330i = i;
            }

            public void run() {
                int i;
                int i2;
                Class cls = C48484q.class;
                C99729g Lo = ((C48484q) C86312j.m106911c(cls)).og0().mo139089Lo(this.f292325d);
                HashMap hashMap = new HashMap();
                if (Lo != null) {
                    hashMap.put("type", Integer.valueOf(C99736h0.m130180a(C99736h0.this, Lo.field_mediaType)));
                    if (C99736h0.m130180a(C99736h0.this, Lo.field_mediaType) == 2) {
                        hashMap.put("videoid", C86013q1.m106456q(Lo.field_filePath));
                    }
                }
                hashMap.put("costtime", Long.valueOf(this.f292326e));
                hashMap.put("origtime", Integer.valueOf(Lo.field_duration));
                hashMap.put("origsize", Long.valueOf(Lo.field_size));
                C99743i qq = ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139117qq(C99736h0.this.f292309a);
                if (qq != null) {
                    hashMap.put("pushid", qq.field_taskId);
                    i2 = qq.field_publishSource;
                    i = qq.field_sourceSceneId;
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (this.f292327f) {
                    ((HashSet) C99736h0.this.f292315g).remove(this.f292325d);
                    C99734h og02 = ((C48484q) C86312j.m106911c(cls)).og0();
                    String str = this.f292325d;
                    String str2 = this.f292328g;
                    String str3 = this.f292329h;
                    og02.getClass();
                    String format = String.format("update %s set %s=\"%s\", %s=\"%s\", %s=%d where %s=\"%s\"", new Object[]{"GameHaowanMedia", "mediaUrl", str2, "thumbPicUrl", str3, "uploadState", 2, C66261f3.COL_LOCALID, str});
                    Log.m105924i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMediaUrl, sql: " + format);
                    og02.execSQL("GameHaowanMedia", format);
                    C40314g.m43484c(MMApplicationContext.getContext(), 87, 8764, 0, 48, i, C15032a.m14200a(i2, hashMap));
                } else if (this.f292330i != -21006) {
                    ((HashSet) C99736h0.this.f292315g).add(this.f292325d);
                    hashMap.put("failid", Integer.valueOf(this.f292330i));
                    C40314g.m43484c(MMApplicationContext.getContext(), 87, 8764, 0, 56, i, C15032a.m14200a(i2, hashMap));
                }
                Log.m105925i("MicroMsg.Haowan.GameUploadMediaEngine", "upload list size : %d, hasPushAllUpload: %b", Integer.valueOf(((HashSet) C99736h0.this.f292314f).size()), Boolean.valueOf(C99736h0.this.f292317i));
                if (((HashSet) C99736h0.this.f292314f).isEmpty()) {
                    C99736h0 h0Var = C99736h0.this;
                    if (!h0Var.f292317i) {
                        return;
                    }
                    if (!((HashSet) h0Var.f292315g).isEmpty()) {
                        ((C119157j) C119157j.f356862d).mo183878i(C99736h0.this.f292320l, 60000);
                        return;
                    }
                    C99742e eVar = C99736h0.this.f292312d;
                    if (eVar != null) {
                        ((C99745j.C99746a.C99747a) eVar).mo139106a(true);
                    }
                }
            }
        }

        public C99738b() {
        }

        /* renamed from: a */
        public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
            String str5 = str;
            if (!((HashSet) C99736h0.this.f292314f).contains(str)) {
                Log.m105925i("MicroMsg.Haowan.GameUploadMediaEngine", "onFinish, not in uploadingList, localId: %s", str5);
                return;
            }
            ((HashSet) C99736h0.this.f292314f).remove(str);
            long currentTimeMillis = System.currentTimeMillis() - Util.nullAs(C99736h0.this.f292319k.remove(str), System.currentTimeMillis());
            Log.m105925i("MicroMsg.Haowan.GameUploadMediaEngine", "success : %b, errCode: %d, localId : %s, mediaId : %s, mediaUrl : %s, costTime: %d", Boolean.valueOf(z), Integer.valueOf(i), str5, str2, str3, Long.valueOf(currentTimeMillis));
            if (C99736h0.this.f292318j) {
                Log.m105924i("MicroMsg.Haowan.GameUploadMediaEngine", "uploadMediaFile, has cancel");
            } else {
                C9457a.m9137a(new C99739a(str, currentTimeMillis, z, str3, str4, i));
            }
        }
    }

    /* renamed from: ly1.h0$c */
    public class C99740c implements C96650m {
        public C99740c() {
        }

        /* renamed from: R */
        public void mo68082R(boolean z, int i, int i2, String str, String str2) {
            if (!((HashSet) C99736h0.this.f292314f).contains(str)) {
                Log.m105925i("MicroMsg.Haowan.GameUploadMediaEngine", "onFinish, not in uploadingList, localId: %s", str);
                return;
            }
            int size = C99736h0.this.f292310b.size();
            int size2 = ((HashSet) C99736h0.this.f292314f).size() + ((HashSet) C99736h0.this.f292315g).size();
            float f = (float) size;
            float f2 = ((((float) (size - size2)) / f) + ((1.0f / f) * (((float) i2) / 100.0f))) * 0.95f;
            Log.m105925i("MicroMsg.Haowan.GameUploadMediaEngine", "onProgress, localId : %s, percent : %d, initSize : %d, uploadingSize : %d, uploadProgress : %f", str, Integer.valueOf(i2), Integer.valueOf(size), Integer.valueOf(size2), Float.valueOf(f2));
            String str3 = C99736h0.this.f292309a;
            Iterator<C101705t> it = C48471j.f129677a.iterator();
            while (it.hasNext()) {
                C101705t next = it.next();
                if (next != null) {
                    next.mo68080E4(str3, f2);
                }
            }
            C38166b.m41755b(C101706u.class, new j$$b(str3, f2));
        }
    }

    /* renamed from: ly1.h0$d */
    public class C99741d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f292333d;

        public C99741d(String str) {
            this.f292333d = str;
        }

        public void run() {
            int i;
            Class cls = C48484q.class;
            HashMap hashMap = new HashMap();
            C99729g Lo = ((C48484q) C86312j.m106911c(cls)).og0().mo139089Lo(this.f292333d);
            if (Lo != null) {
                hashMap.put("type", Integer.valueOf(C99736h0.m130180a(C99736h0.this, Lo.field_mediaType)));
                if (C99736h0.m130180a(C99736h0.this, Lo.field_mediaType) == 2) {
                    hashMap.put("videoid", C86013q1.m106456q(Lo.field_filePath));
                }
            }
            C99743i qq = ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139117qq(C99736h0.this.f292309a);
            int i2 = 0;
            if (qq != null) {
                hashMap.put("pushid", qq.field_taskId);
                i2 = qq.field_publishSource;
                i = qq.field_sourceSceneId;
            } else {
                i = 0;
            }
            C40314g.m43484c(MMApplicationContext.getContext(), 87, 8764, 0, 20, i, C15032a.m14200a(i2, hashMap));
        }
    }

    /* renamed from: ly1.h0$e */
    public interface C99742e {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C99736h0(java.lang.String r8, int r9, java.util.LinkedList<java.lang.String> r10, boolean r11) {
        /*
            r7 = this;
            java.lang.Class<sw1.q> r0 = sw1.C48484q.class
            r7.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r7.f292310b = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r7.f292313e = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r7.f292314f = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r7.f292315g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1 = 0
            r7.f292317i = r1
            r7.f292318j = r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r7.f292319k = r2
            ly1.h0$a r2 = new ly1.h0$a
            r2.<init>()
            r7.f292320l = r2
            ly1.h0$b r2 = new ly1.h0$b
            r2.<init>()
            r7.f292321m = r2
            ly1.h0$c r2 = new ly1.h0$c
            r2.<init>()
            r7.f292322n = r2
            r7.f292309a = r8
            r7.f292311c = r11
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r10)
            if (r11 == 0) goto L_0x0052
            return
        L_0x0052:
            r11 = 2
            if (r9 != r11) goto L_0x0061
            java.util.LinkedList<java.lang.String> r9 = r7.f292310b
            java.lang.Object r10 = r10.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            r9.add(r10)
            goto L_0x0066
        L_0x0061:
            java.util.LinkedList<java.lang.String> r9 = r7.f292310b
            r9.addAll(r10)
        L_0x0066:
            di3.d r9 = di3.C86312j.m106911c(r0)
            sw1.q r9 = (sw1.C48484q) r9
            ly1.h r9 = r9.og0()
            r9.getClass()
            r10 = 1
            if (r8 != 0) goto L_0x0077
            goto L_0x0093
        L_0x0077:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "GameHaowanMedia"
            r2[r1] = r3
            java.lang.String r3 = "hostTaskId"
            r2[r10] = r3
            r2[r11] = r8
            java.lang.String r8 = "select * from %s where %s=\"%s\""
            java.lang.String r8 = java.lang.String.format(r8, r2)
            java.lang.String[] r2 = new java.lang.String[r1]
            android.database.Cursor r8 = r9.rawQuery(r8, r2)
            if (r8 != 0) goto L_0x0095
        L_0x0093:
            r9 = 0
            goto L_0x00a1
        L_0x0095:
            int r9 = r8.getCount()
            if (r9 == 0) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            r8.close()
        L_0x00a1:
            if (r9 != 0) goto L_0x0185
            java.util.LinkedList<java.lang.String> r8 = r7.f292310b
            java.util.Iterator r8 = r8.iterator()
        L_0x00a9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0185
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            com.tencent.mm.plugin.webview.model.m1 r2 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem r2 = r2.mo7010b(r9)
            if (r2 != 0) goto L_0x00c0
            goto L_0x00a9
        L_0x00c0:
            ly1.g r3 = new ly1.g
            r3.<init>()
            java.lang.String r4 = r2.f283022e
            r3.field_localId = r4
            java.lang.String r4 = r2.f283026i
            r3.field_mediaId = r4
            java.lang.String r4 = r2.f283024g
            r3.field_filePath = r4
            java.lang.String r4 = r2.f283023f
            r3.field_thumbPath = r4
            int r4 = r2.f283028n
            r3.field_mediaType = r4
            int r4 = r2.f283029o
            long r4 = (long) r4
            r3.field_size = r4
            int r4 = r2.f283030p
            r3.field_width = r4
            int r4 = r2.f283031q
            r3.field_height = r4
            android.os.Bundle r4 = r2.f283036v
            java.lang.String r5 = "mark_edit_flag"
            int r4 = r4.getInt(r5, r1)
            r3.field_editFlag = r4
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem
            if (r4 == 0) goto L_0x00fc
            r4 = r2
            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem r4 = (com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem) r4
            int r4 = r4.f22269w
            r3.field_duration = r4
        L_0x00fc:
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem
            if (r4 == 0) goto L_0x0107
            r4 = r2
            com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem r4 = (com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem) r4
            boolean r4 = r4.f22268w
            r3.field_isGif = r4
        L_0x0107:
            java.lang.String r4 = r7.f292309a
            r3.field_hostTaskId = r4
            int r4 = r2.f283028n
            if (r4 != r10) goto L_0x0176
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = f292307o
            r4.append(r5)
            java.lang.String r5 = "microMsg.compress."
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            int r9 = r9.hashCode()
            r5 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r5
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            boolean r4 = r7.f292311c
            if (r4 == 0) goto L_0x0172
            java.lang.String r4 = r2.f283024g
            boolean r4 = r7.mo139093c(r9, r4)
            if (r4 == 0) goto L_0x0172
            r3.field_compressPath = r9
            java.lang.Object[] r4 = new java.lang.Object[r11]
            java.lang.String r5 = r2.f283024g
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r1] = r5
            java.lang.String r5 = r3.field_compressPath
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r10] = r5
            java.lang.String r5 = "MicroMsg.Haowan.GameUploadMediaEngine"
            java.lang.String r6 = "compress, originSize: %d, dstSize: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            r2.f283024g = r9
            com.tencent.mm.plugin.webview.model.m1 r9 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()
            r9.mo7009a(r2)
            goto L_0x0176
        L_0x0172:
            java.lang.String r9 = r2.f283024g
            r3.field_compressPath = r9
        L_0x0176:
            di3.d r9 = di3.C86312j.m106911c(r0)
            sw1.q r9 = (sw1.C48484q) r9
            ly1.h r9 = r9.og0()
            r9.insert(r3)
            goto L_0x00a9
        L_0x0185:
            com.tencent.mm.plugin.webview.model.l1 r8 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Cx0()
            com.tencent.mm.plugin.webview.model.n r9 = r7.f292321m
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.webview.model.n> r10 = r8.f283039d
            if (r10 == 0) goto L_0x019c
            if (r9 == 0) goto L_0x019c
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x019c
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.webview.model.n> r8 = r8.f283039d
            r8.add(r9)
        L_0x019c:
            com.tencent.mm.plugin.webview.model.l1 r8 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Cx0()
            com.tencent.mm.plugin.webview.model.m r9 = r7.f292322n
            r8.mo134802b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99736h0.<init>(java.lang.String, int, java.util.LinkedList, boolean):void");
    }

    /* renamed from: a */
    public static int m130180a(C99736h0 h0Var, int i) {
        h0Var.getClass();
        if (i == 4) {
            return 2;
        }
        return i == 1 ? 1 : 0;
    }

    /* renamed from: b */
    public void mo139092b() {
        this.f292318j = true;
        Iterator<String> it = this.f292310b.iterator();
        while (it.hasNext()) {
            C6080m.Cx0().mo134805e(it.next());
        }
        ((C48484q) C86312j.m106911c(C48484q.class)).og0().mo139090jo(this.f292310b);
        mo139094d();
    }

    /* renamed from: c */
    public final boolean mo139093c(String str, String str2) {
        if (ImgUtil.isGif(str2)) {
            return false;
        }
        try {
            boolean Oq = ((C36691h0) C86312j.m106911c(C36691h0.class)).mo60646Oq(str, str2, 1440, 1080);
            if (Oq) {
                C86013q1.m106447h(str2);
            }
            return Oq;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Haowan.GameUploadMediaEngine", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: d */
    public void mo139094d() {
        C6080m.Cx0().mo134808h(this.f292321m);
        C96649l1 Cx0 = C6080m.Cx0();
        C96650m mVar = this.f292322n;
        CopyOnWriteArraySet<C96650m> copyOnWriteArraySet = Cx0.f283040e;
        if (!(copyOnWriteArraySet == null || mVar == null)) {
            copyOnWriteArraySet.remove(mVar);
        }
        ((HashSet) this.f292313e).clear();
        ((HashSet) this.f292315g).clear();
        ((HashSet) this.f292314f).clear();
        this.f292310b.clear();
        this.f292312d = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016e, code lost:
        if (((java.util.HashSet) r11.f292314f).isEmpty() == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        r0 = r11.f292312d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0172, code lost:
        if (r0 == null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0174, code lost:
        ((ly1.C99745j.C99746a.C99747a) r0).mo139106a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo139095e() {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f292318j     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r11)
            return
        L_0x0007:
            java.util.Set<java.lang.String> r0 = r11.f292314f     // Catch:{ all -> 0x017e }
            java.util.Set<java.lang.String> r1 = r11.f292313e     // Catch:{ all -> 0x017e }
            r0.addAll(r1)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "MicroMsg.Haowan.GameUploadMediaEngine"
            java.lang.String r1 = "upload, list : %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x017e }
            java.util.Set<java.lang.String> r4 = r11.f292314f     // Catch:{ all -> 0x017e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x017e }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x017e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x017e }
            r11.f292317i = r5     // Catch:{ all -> 0x017e }
            java.util.Set<java.lang.String> r0 = r11.f292313e     // Catch:{ all -> 0x017e }
            monitor-enter(r0)     // Catch:{ all -> 0x017e }
            java.util.Set<java.lang.String> r1 = r11.f292313e     // Catch:{ all -> 0x017b }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x017b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x017b }
        L_0x002f:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0163
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x017b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x017b }
            boolean r4 = r11.f292318j     // Catch:{ all -> 0x017b }
            if (r4 == 0) goto L_0x0042
            monitor-exit(r0)     // Catch:{ all -> 0x017b }
            monitor-exit(r11)
            return
        L_0x0042:
            java.lang.Class<sw1.q> r4 = sw1.C48484q.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x017b }
            sw1.q r4 = (sw1.C48484q) r4     // Catch:{ all -> 0x017b }
            ly1.h r4 = r4.og0()     // Catch:{ all -> 0x017b }
            ly1.g r4 = r4.mo139089Lo(r3)     // Catch:{ all -> 0x017b }
            if (r4 == 0) goto L_0x014e
            java.lang.String r6 = r4.field_localId     // Catch:{ all -> 0x017b }
            if (r6 == 0) goto L_0x014e
            java.lang.String r6 = r4.field_mediaUrl     // Catch:{ all -> 0x017b }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x017b }
            if (r6 != 0) goto L_0x0062
            goto L_0x014e
        L_0x0062:
            com.tencent.mm.plugin.webview.model.m1 r6 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()     // Catch:{ all -> 0x017b }
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem r6 = r6.mo7010b(r3)     // Catch:{ all -> 0x017b }
            r7 = 4
            if (r6 != 0) goto L_0x0107
            int r6 = r4.field_mediaType     // Catch:{ all -> 0x017b }
            if (r6 != r2) goto L_0x00d8
            com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem r6 = new com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r4.field_localId     // Catch:{ all -> 0x017b }
            r6.f283022e = r8     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r4.field_mediaId     // Catch:{ all -> 0x017b }
            r6.f283026i = r8     // Catch:{ all -> 0x017b }
            boolean r8 = r11.f292311c     // Catch:{ all -> 0x017b }
            if (r8 == 0) goto L_0x00c8
            java.lang.String r8 = r4.field_compressPath     // Catch:{ all -> 0x017b }
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ all -> 0x017b }
            if (r8 != 0) goto L_0x00c8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r8.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r9 = f292307o     // Catch:{ all -> 0x017b }
            r8.append(r9)     // Catch:{ all -> 0x017b }
            java.lang.String r9 = "microMsg.compress."
            r8.append(r9)     // Catch:{ all -> 0x017b }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017b }
            r8.append(r9)     // Catch:{ all -> 0x017b }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ all -> 0x017b }
            int r9 = r9.hashCode()     // Catch:{ all -> 0x017b }
            r10 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r10
            r8.append(r9)     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x017b }
            java.lang.String r9 = r4.field_filePath     // Catch:{ all -> 0x017b }
            boolean r9 = r11.mo139093c(r8, r9)     // Catch:{ all -> 0x017b }
            if (r9 == 0) goto L_0x00bf
            r4.field_compressPath = r8     // Catch:{ all -> 0x017b }
            goto L_0x00c3
        L_0x00bf:
            java.lang.String r8 = r4.field_filePath     // Catch:{ all -> 0x017b }
            r4.field_compressPath = r8     // Catch:{ all -> 0x017b }
        L_0x00c3:
            java.lang.String r8 = r4.field_compressPath     // Catch:{ all -> 0x017b }
            r6.f283024g = r8     // Catch:{ all -> 0x017b }
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r8 = r4.field_filePath     // Catch:{ all -> 0x017b }
            r6.f283024g = r8     // Catch:{ all -> 0x017b }
        L_0x00cc:
            java.lang.String r8 = r4.field_thumbPath     // Catch:{ all -> 0x017b }
            r6.f283023f = r8     // Catch:{ all -> 0x017b }
            com.tencent.mm.plugin.webview.model.m1 r8 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()     // Catch:{ all -> 0x017b }
            r8.mo7009a(r6)     // Catch:{ all -> 0x017b }
            goto L_0x0107
        L_0x00d8:
            if (r6 != r7) goto L_0x0107
            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem r6 = new com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem     // Catch:{ all -> 0x017b }
            r6.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r4.field_localId     // Catch:{ all -> 0x017b }
            r6.f283022e = r8     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r4.field_mediaId     // Catch:{ all -> 0x017b }
            r6.f283026i = r8     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r4.field_filePath     // Catch:{ all -> 0x017b }
            r6.f283024g = r8     // Catch:{ all -> 0x017b }
            java.lang.String r8 = r4.field_thumbPath     // Catch:{ all -> 0x017b }
            r6.f283023f = r8     // Catch:{ all -> 0x017b }
            int r8 = r4.field_duration     // Catch:{ all -> 0x017b }
            r6.f22269w = r8     // Catch:{ all -> 0x017b }
            int r8 = r4.field_width     // Catch:{ all -> 0x017b }
            r6.f283030p = r8     // Catch:{ all -> 0x017b }
            int r8 = r4.field_height     // Catch:{ all -> 0x017b }
            r6.f283031q = r8     // Catch:{ all -> 0x017b }
            long r8 = r4.field_size     // Catch:{ all -> 0x017b }
            int r9 = (int) r8     // Catch:{ all -> 0x017b }
            r6.f283029o = r9     // Catch:{ all -> 0x017b }
            com.tencent.mm.plugin.webview.model.m1 r8 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()     // Catch:{ all -> 0x017b }
            r8.mo7009a(r6)     // Catch:{ all -> 0x017b }
        L_0x0107:
            int r4 = r4.field_mediaType     // Catch:{ all -> 0x017b }
            r6 = 2
            if (r4 == r2) goto L_0x012f
            if (r4 == r7) goto L_0x0110
            goto L_0x002f
        L_0x0110:
            r4 = 20302(0x4f4e, float:2.8449E-41)
            r7 = 214(0xd6, float:3.0E-43)
            boolean r4 = r11.mo139096f(r3, r4, r7, r6)     // Catch:{ all -> 0x017b }
            if (r4 != 0) goto L_0x002f
            java.lang.String r4 = "MicroMsg.Haowan.GameUploadMediaEngine"
            java.lang.String r6 = "upload, ret is false, remvoe: %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x017b }
            r7[r5] = r3     // Catch:{ all -> 0x017b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r7)     // Catch:{ all -> 0x017b }
            java.util.Set<java.lang.String> r4 = r11.f292314f     // Catch:{ all -> 0x017b }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x017b }
            r4.remove(r3)     // Catch:{ all -> 0x017b }
            goto L_0x002f
        L_0x012f:
            r4 = 20301(0x4f4d, float:2.8448E-41)
            r7 = 215(0xd7, float:3.01E-43)
            boolean r4 = r11.mo139096f(r3, r4, r7, r6)     // Catch:{ all -> 0x017b }
            if (r4 != 0) goto L_0x002f
            java.lang.String r4 = "MicroMsg.Haowan.GameUploadMediaEngine"
            java.lang.String r6 = "upload, ret is false, remvoe: %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x017b }
            r7[r5] = r3     // Catch:{ all -> 0x017b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r7)     // Catch:{ all -> 0x017b }
            java.util.Set<java.lang.String> r4 = r11.f292314f     // Catch:{ all -> 0x017b }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x017b }
            r4.remove(r3)     // Catch:{ all -> 0x017b }
            goto L_0x002f
        L_0x014e:
            java.lang.String r4 = "MicroMsg.Haowan.GameUploadMediaEngine"
            java.lang.String r6 = "upload, remvoe: %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x017b }
            r7[r5] = r3     // Catch:{ all -> 0x017b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r7)     // Catch:{ all -> 0x017b }
            java.util.Set<java.lang.String> r4 = r11.f292314f     // Catch:{ all -> 0x017b }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x017b }
            r4.remove(r3)     // Catch:{ all -> 0x017b }
            goto L_0x002f
        L_0x0163:
            r11.f292317i = r2     // Catch:{ all -> 0x017b }
            monitor-exit(r0)     // Catch:{ all -> 0x017b }
            java.util.Set<java.lang.String> r0 = r11.f292314f     // Catch:{ all -> 0x017e }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x017e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0179
            ly1.h0$e r0 = r11.f292312d     // Catch:{ all -> 0x017e }
            if (r0 == 0) goto L_0x0179
            ly1.j$a$a r0 = (ly1.C99745j.C99746a.C99747a) r0     // Catch:{ all -> 0x017e }
            r0.mo139106a(r2)     // Catch:{ all -> 0x017e }
        L_0x0179:
            monitor-exit(r11)
            return
        L_0x017b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x017b }
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99736h0.mo139095e():void");
    }

    /* renamed from: f */
    public final boolean mo139096f(String str, int i, int i2, int i3) {
        this.f292319k.put(str, Long.valueOf(System.currentTimeMillis()));
        Log.m105925i("MicroMsg.Haowan.GameUploadMediaEngine", "uploadMediaFile, localId : %s", str);
        C9457a.m9137a(new C99741d(str));
        return C6080m.Cx0().mo134803c("", str, i, i2, i3, (C96651n) null);
    }
}
