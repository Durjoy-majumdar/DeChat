package bb3;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96729f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p682rz.C101488s;
import xa3.C102595k;

/* renamed from: bb3.g */
public class C92226g extends Thread {

    /* renamed from: r */
    public static HashMap<String, C92229c> f263961r = new HashMap<>();

    /* renamed from: s */
    public static Object f263962s = new byte[0];

    /* renamed from: t */
    public static QueueWorkerThread f263963t;

    /* renamed from: d */
    public List<String> f263964d;

    /* renamed from: e */
    public List<Integer> f263965e;

    /* renamed from: f */
    public List<String> f263966f;

    /* renamed from: g */
    public List<String> f263967g;

    /* renamed from: h */
    public List<Integer> f263968h;

    /* renamed from: i */
    public C54444b f263969i;

    /* renamed from: j */
    public C102595k f263970j;

    /* renamed from: n */
    public String f263971n;

    /* renamed from: o */
    public String f263972o;

    /* renamed from: p */
    public boolean f263973p;

    /* renamed from: q */
    public boolean f263974q = false;

    /* renamed from: bb3.g$b */
    public interface C54444b {
    }

    /* renamed from: bb3.g$a */
    public class C92227a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f263975d;

        /* renamed from: e */
        public final /* synthetic */ int f263976e;

        /* renamed from: bb3.g$a$a */
        public class C92228a implements Runnable {
            public C92228a() {
            }

            public void run() {
                C92226g gVar = C92226g.this;
                ((C96729f) gVar.f263969i).mo134990a(gVar.f263972o, gVar.f263970j);
            }
        }

        public C92227a(String str, int i) {
            this.f263975d = str;
            this.f263976e = i;
        }

        public void run() {
            C92226g gVar = C92226g.this;
            C54444b bVar = gVar.f263969i;
            String str = this.f263975d;
            C102595k kVar = gVar.f263970j;
            ((C96729f) bVar).getClass();
            Log.m105924i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onImportFinish");
            if (!Util.isNullOrNil(str) && C86013q1.m106450k(str) && kVar != null) {
                kVar.f302084s = str;
            }
            if (C92226g.this.f263974q || this.f263976e != -50006) {
                C86709a0.m107525e().postToWorkerDelayed(new C92228a(), 80);
            }
        }
    }

    /* renamed from: bb3.g$c */
    public static final class C92229c implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public String f263979d;

        /* renamed from: e */
        public String f263980e;

        /* renamed from: f */
        public String f263981f;

        /* renamed from: g */
        public int f263982g;

        /* renamed from: h */
        public VideoTransPara f263983h;

        /* renamed from: i */
        public C102595k f263984i;

        /* renamed from: j */
        public int f263985j;

        /* renamed from: n */
        public int f263986n;

        /* renamed from: o */
        public boolean f263987o;

        /* renamed from: p */
        public C54444b f263988p;

        public C92229c(C92227a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bb, code lost:
            r9[0] = r11;
            r9[1] = r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02f4  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x00bb A[EDGE_INSN: B:118:0x00bb->B:59:0x00bb ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0106  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r29 = this;
                r1 = r29
                java.lang.Class<a62.b> r2 = a62.C27810b.class
                java.lang.Class<rz.u> r3 = p682rz.C101491u.class
                java.lang.Object r4 = bb3.C92226g.f263962s
                monitor-enter(r4)
                java.util.HashMap<java.lang.String, bb3.g$c> r0 = bb3.C92226g.f263961r     // Catch:{ all -> 0x02f8 }
                java.lang.String r5 = r1.f263979d     // Catch:{ all -> 0x02f8 }
                boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x02f8 }
                r5 = 1
                r6 = 0
                if (r0 != 0) goto L_0x0017
                r0 = 1
                goto L_0x0018
            L_0x0017:
                r0 = 0
            L_0x0018:
                monitor-exit(r4)     // Catch:{ all -> 0x02f8 }
                if (r0 != 0) goto L_0x002c
                di3.d r0 = di3.C86312j.m106911c(r3)
                rz.u r0 = (p682rz.C101491u) r0
                java.lang.String r4 = r1.f263979d
                hd0.n0 r0 = r0.mo140806Zd(r4)
                if (r0 != 0) goto L_0x002b
                r0 = 1
                goto L_0x002c
            L_0x002b:
                r0 = 0
            L_0x002c:
                if (r0 == 0) goto L_0x003d
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r2 = "remuxing job has been removed, filename %s"
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r4 = r1.f263979d
                r3[r6] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r3)
                return r5
            L_0x003d:
                com.tencent.mm.modelcontrol.VideoTransPara r0 = r1.f263983h
                r4 = 3
                r8 = 2
                if (r0 == 0) goto L_0x0051
                boolean r9 = r0.f267178s
                if (r9 != 0) goto L_0x0051
                int r9 = r0.f267166d
                r1.f263985j = r9
                int r0 = r0.f267167e
                r1.f263986n = r0
                goto L_0x00c7
            L_0x0051:
                int[] r9 = new int[r8]
                java.lang.String r0 = r1.f263980e
                oj.c r10 = new oj.c     // Catch:{ Exception -> 0x0081, all -> 0x007d }
                r10.<init>()     // Catch:{ Exception -> 0x0081, all -> 0x007d }
                r10.setDataSource(r0)     // Catch:{ Exception -> 0x007b }
                r0 = 18
                java.lang.String r0 = r10.extractMetadata(r0)     // Catch:{ Exception -> 0x007b }
                int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r6)     // Catch:{ Exception -> 0x007b }
                r0 = 19
                java.lang.String r0 = r10.extractMetadata(r0)     // Catch:{ Exception -> 0x0075 }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r6)     // Catch:{ Exception -> 0x0075 }
                r10.release()
                goto L_0x0093
            L_0x0075:
                r0 = move-exception
                goto L_0x0084
            L_0x0077:
                r0 = move-exception
                r7 = r10
                goto L_0x02f2
            L_0x007b:
                r0 = move-exception
                goto L_0x0083
            L_0x007d:
                r0 = move-exception
                r7 = 0
                goto L_0x02f2
            L_0x0081:
                r0 = move-exception
                r10 = 0
            L_0x0083:
                r11 = 0
            L_0x0084:
                java.lang.String r12 = "MicroMsg.NoteVideoCompress"
                java.lang.String r13 = "getImportProperRemuxingResolution error"
                java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ all -> 0x0077 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r13, r14)     // Catch:{ all -> 0x0077 }
                if (r10 == 0) goto L_0x0092
                r10.release()
            L_0x0092:
                r0 = 0
            L_0x0093:
                r9[r6] = r11
                r9[r5] = r0
                r10 = 0
            L_0x0098:
                if (r10 >= r4) goto L_0x00bb
                int r12 = r11 % 2
                if (r12 != 0) goto L_0x00bf
                int r12 = r0 % 2
                if (r12 == 0) goto L_0x00a3
                goto L_0x00bf
            L_0x00a3:
                r12 = 480(0x1e0, float:6.73E-43)
                r13 = 640(0x280, float:8.97E-43)
                if (r11 < r0) goto L_0x00ad
                if (r11 <= r13) goto L_0x00bb
                if (r0 <= r12) goto L_0x00bb
            L_0x00ad:
                if (r11 > r0) goto L_0x00b4
                if (r11 <= r12) goto L_0x00bb
                if (r0 > r13) goto L_0x00b4
                goto L_0x00bb
            L_0x00b4:
                int r11 = r11 / 2
                int r0 = r0 / 2
                int r10 = r10 + 1
                goto L_0x0098
            L_0x00bb:
                r9[r6] = r11
                r9[r5] = r0
            L_0x00bf:
                r0 = r9[r6]
                r1.f263985j = r0
                r0 = r9[r5]
                r1.f263986n = r0
            L_0x00c7:
                com.tencent.mm.pointers.PString r0 = new com.tencent.mm.pointers.PString
                r0.<init>()
                com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt
                r9.<init>()
                eb0.c r10 = eb0.C97625j3.m125812b()
                r10.getClass()
                di3.d r10 = di3.C86312j.m106911c(r2)
                a62.b r10 = (a62.C27810b) r10
                com.tencent.mm.storage.d4 r10 = r10.mo55621A1()
                java.lang.String r11 = r1.f263980e
                boolean r10 = r10.mo57628b(r11, r0, r9)
                if (r10 == 0) goto L_0x0106
                java.lang.String r0 = r0.value
                java.lang.String r10 = r1.f263981f
                long r10 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r10, r6)
                r12 = 0
                int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r0 < 0) goto L_0x0106
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r2 = "copy remuxing file success, do not remuxing again."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                int r0 = r9.value
                r1.f263982g = r0
                r1.f263987o = r5
                return r5
            L_0x0106:
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                com.tencent.mm.modelcontrol.VideoTransPara r0 = r1.f263983h
                if (r0 == 0) goto L_0x014e
                java.lang.String r11 = "MicroMsg.NoteVideoCompress"
                java.lang.String r12 = "remuxing new para %s"
                java.lang.Object[] r13 = new java.lang.Object[r5]
                r13[r6] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r13)
                java.lang.String r14 = r1.f263980e
                java.lang.String r15 = r1.f263981f
                int r0 = r1.f263985j
                int r11 = r1.f263986n
                com.tencent.mm.modelcontrol.VideoTransPara r12 = r1.f263983h
                int r13 = r12.f267169g
                int r7 = r12.f267177r
                r20 = 8
                int r4 = r12.f267176q
                r22 = 1103626240(0x41c80000, float:25.0)
                int r12 = r12.f267168f
                float r12 = (float) r12
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 51
                r16 = r0
                r17 = r11
                r18 = r13
                r19 = r7
                r21 = r4
                r23 = r12
                int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.remuxingVFS(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                r1.f263982g = r0
                goto L_0x0180
            L_0x014e:
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r4 = "remuxing but new para is null. %s"
                java.lang.Object[] r7 = new java.lang.Object[r5]
                java.lang.String r11 = r1.f263979d
                r7[r6] = r11
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r7)
                java.lang.String r12 = r1.f263980e
                java.lang.String r13 = r1.f263981f
                int r14 = r1.f263985j
                int r15 = r1.f263986n
                int r16 = com.tencent.p014mm.plugin.sight.base.C85457c.f249058c
                int r17 = com.tencent.p014mm.plugin.sight.base.C85457c.f249057b
                r18 = 8
                r19 = 2
                r20 = 1103626240(0x41c80000, float:25.0)
                float r21 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 51
                int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.remuxingVFS(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r1.f263982g = r0
            L_0x0180:
                com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r4 = "remuxing [%s] to [%s], result %d, resolution:[%d, %d]"
                r7 = 5
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r9 = r1.f263980e
                r7[r6] = r9
                java.lang.String r9 = r1.f263981f
                r7[r5] = r9
                int r9 = r1.f263982g
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r7[r8] = r9
                int r9 = r1.f263985j
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10 = 3
                r7[r10] = r9
                int r9 = r1.f263986n
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10 = 4
                r7[r10] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r7)
                int r0 = r1.f263982g
                if (r0 < 0) goto L_0x01b6
                r0 = 1
                goto L_0x01b7
            L_0x01b6:
                r0 = 0
            L_0x01b7:
                r1.f263987o = r0
                com.tencent.mm.pointers.PInt r0 = new com.tencent.mm.pointers.PInt
                r0.<init>()
                com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
                r4.<init>()
                di3.d r3 = di3.C86312j.m106911c(r3)
                rz.u r3 = (p682rz.C101491u) r3
                java.lang.String r7 = r1.f263981f
                boolean r3 = r3.mo140803PS(r7, r0, r4)
                if (r3 == 0) goto L_0x01d5
                int r0 = r0.value
                r1.f263982g = r0
            L_0x01d5:
                boolean r0 = r1.f263987o
                if (r0 != 0) goto L_0x01ef
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r2 = "remuxing video error, copy source video to send."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
                java.lang.String r0 = r1.f263981f
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
                java.lang.String r0 = r1.f263980e
                java.lang.String r2 = r1.f263981f
                com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r2)
                goto L_0x02f1
            L_0x01ef:
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r3 = "remuxing video sucess,insert to media duplication storage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                java.lang.String r0 = r1.f263981f     // Catch:{ Exception -> 0x02e1 }
                android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r3 = r0.getPath()     // Catch:{ Exception -> 0x02e1 }
                if (r3 == 0) goto L_0x021d
                java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r6, r6)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r4 = r0.getPath()     // Catch:{ Exception -> 0x02e1 }
                boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x02e1 }
                if (r4 != 0) goto L_0x021d
                android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x02e1 }
                android.net.Uri$Builder r0 = r0.path(r3)     // Catch:{ Exception -> 0x02e1 }
                android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x02e1 }
            L_0x021d:
                java.lang.String r3 = r0.getPath()     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r4 = "/"
                int r4 = r3.lastIndexOf(r4)     // Catch:{ Exception -> 0x02e1 }
                if (r4 >= 0) goto L_0x022a
                goto L_0x022f
            L_0x022a:
                int r4 = r4 + r5
                java.lang.String r3 = r3.substring(r4)     // Catch:{ Exception -> 0x02e1 }
            L_0x022f:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e1 }
                r4.<init>()     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r7 = r1.f263981f     // Catch:{ Exception -> 0x02e1 }
                r4.append(r7)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r7 = ".tmp"
                r4.append(r7)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02e1 }
                com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x02e1 }
                r7.<init>(r6)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r9 = r1.f263981f     // Catch:{ Exception -> 0x02e1 }
                boolean r9 = uf0.C90657e.m113638b(r9, r4, r7)     // Catch:{ Exception -> 0x02e1 }
                if (r9 == 0) goto L_0x02ac
                com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x02e1 }
                r9 = 0
                com.tencent.mm.vfs.f0$h r0 = r7.mo177799l(r0, r9)     // Catch:{ Exception -> 0x02e1 }
                boolean r7 = r0.mo177810a()     // Catch:{ Exception -> 0x02e1 }
                if (r7 == 0) goto L_0x0268
                com.tencent.mm.vfs.FileSystem$c r7 = r0.f348991a     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r0 = r0.f348992b     // Catch:{ Exception -> 0x02e1 }
                boolean r0 = r7.mo119933c(r0)     // Catch:{ Exception -> 0x02e1 }
                if (r0 == 0) goto L_0x0268
                r0 = 1
                goto L_0x0269
            L_0x0268:
                r0 = 0
            L_0x0269:
                com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x02e1 }
                r7.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x02e1 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e1 }
                r4.<init>()     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r9 = r7.mo119973k()     // Catch:{ Exception -> 0x02e1 }
                r4.append(r9)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r9 = "/"
                r4.append(r9)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r9 = r7.getName()     // Catch:{ Exception -> 0x02e1 }
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106435Q(r4, r9, r3)     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r4 = "MicroMsg.NoteVideoCompress"
                java.lang.String r9 = "fast start success. delOld[%b] rename[%b] path[%s] target[%s]"
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x02e1 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x02e1 }
                r10[r6] = r0     // Catch:{ Exception -> 0x02e1 }
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x02e1 }
                r10[r5] = r0     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r0 = r7.mo119971i()     // Catch:{ Exception -> 0x02e1 }
                r10[r8] = r0     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r0 = r1.f263981f     // Catch:{ Exception -> 0x02e1 }
                r3 = 3
                r10[r3] = r0     // Catch:{ Exception -> 0x02e1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r10)     // Catch:{ Exception -> 0x02e1 }
                goto L_0x02c6
            L_0x02ac:
                java.lang.String r0 = "MicroMsg.NoteVideoCompress"
                java.lang.String r3 = "fast start fail. msg[%d] importpath[%s] targetPath[%s]"
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x02e1 }
                int r7 = r7.value     // Catch:{ Exception -> 0x02e1 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x02e1 }
                r4[r6] = r7     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r7 = r1.f263980e     // Catch:{ Exception -> 0x02e1 }
                r4[r5] = r7     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r7 = r1.f263981f     // Catch:{ Exception -> 0x02e1 }
                r4[r8] = r7     // Catch:{ Exception -> 0x02e1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ Exception -> 0x02e1 }
            L_0x02c6:
                eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x02e1 }
                r0.getClass()     // Catch:{ Exception -> 0x02e1 }
                di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x02e1 }
                a62.b r0 = (a62.C27810b) r0     // Catch:{ Exception -> 0x02e1 }
                com.tencent.mm.storage.d4 r0 = r0.mo55621A1()     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r2 = r1.f263980e     // Catch:{ Exception -> 0x02e1 }
                java.lang.String r3 = r1.f263981f     // Catch:{ Exception -> 0x02e1 }
                int r4 = r1.f263982g     // Catch:{ Exception -> 0x02e1 }
                r0.mo57630e(r2, r3, r4)     // Catch:{ Exception -> 0x02e1 }
                goto L_0x02f1
            L_0x02e1:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.NoteVideoCompress"
                java.lang.String r3 = "fast start exception e[%s]"
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r0 = r0.toString()
                r4[r6] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)
            L_0x02f1:
                return r5
            L_0x02f2:
                if (r7 == 0) goto L_0x02f7
                r7.release()
            L_0x02f7:
                throw r0
            L_0x02f8:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x02f8 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bb3.C92226g.C92229c.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            synchronized (C92226g.f263962s) {
                C92226g.f263961r.remove(this.f263979d);
            }
            C54444b bVar = this.f263988p;
            if (bVar == null) {
                return false;
            }
            ((C96729f) bVar).mo134990a(this.f263981f, this.f263984i);
            return false;
        }
    }

    public C92226g(List<String> list, String str, String str2, C102595k kVar, C54444b bVar) {
        this.f263964d = list;
        this.f263965e = new ArrayList();
        this.f263966f = new ArrayList();
        this.f263968h = new ArrayList();
        this.f263967g = new ArrayList();
        this.f263969i = bVar;
        this.f263970j = kVar;
        this.f263972o = str2;
        this.f263971n = str;
    }

    /* renamed from: a */
    public final void mo126223a(int i, String str, String str2, int i2, VideoTransPara videoTransPara, Context context, String str3) {
        Log.m105925i("MicroMsg.NoteVideoCompress", "finish to import %s to %s | ret %d | duration %d", str2, str, Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this) {
            ((ArrayList) this.f263965e).add(Integer.valueOf(i));
            ((ArrayList) this.f263966f).add(str);
            ((ArrayList) this.f263967g).add(str2);
            ((ArrayList) this.f263968h).add(Integer.valueOf(i2));
        }
        if (i == -50002) {
            MMHandlerThread.postToMainThread(new C54445h(this, context, context.getString(C0966R.string.ka_)));
        } else if (i == -50008) {
            MMHandlerThread.postToMainThread(new C54445h(this, context, context.getString(C0966R.string.ka8)));
        } else if (i == -50006) {
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.NoteVideoCompress", "do insertVideoStorage, but file name is null");
            } else {
                C98408n0 n0Var = new C98408n0();
                n0Var.f288554a = str;
                n0Var.f288566m = 1;
                n0Var.f288570q = null;
                n0Var.f288571r = (String) C97625j3.m125812b().mo105906u().mo119684e(2, "");
                n0Var.f288563j = Util.nowSecond();
                n0Var.f288564k = Util.nowSecond();
                n0Var.f288575v = null;
                n0Var.f288574u = str2;
                if (!Util.isNullOrNil(str2)) {
                    n0Var.f288572s = 1;
                }
                n0Var.f288559f = 0;
                ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137730s(n0Var);
            }
            if (f263963t == null) {
                f263963t = new QueueWorkerThread(5, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
            }
            C92229c cVar = new C92229c((C92227a) null);
            synchronized (f263962s) {
                f263961r.put(str, cVar);
            }
            cVar.f263979d = str;
            cVar.f263980e = str2;
            cVar.f263981f = this.f263972o;
            cVar.f263983h = videoTransPara;
            cVar.f263988p = this.f263969i;
            cVar.f263984i = this.f263970j;
            f263963t.add(cVar);
        } else if (i < 0) {
            MMHandlerThread.postToMainThread(new C54445h(this, context, context.getString(C0966R.string.ka9)));
        } else {
            this.f263974q = true;
        }
        if (this.f263969i != null && !this.f263973p) {
            MMHandlerThread.postToMainThread(new C92227a(str3, i));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0319, code lost:
        r19 = -50003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0320, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(r8) != false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0322, code lost:
        r2 = -50004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0329, code lost:
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032b, code lost:
        mo126223a(r2, r16, r4, r5, r10, r14, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02a7, code lost:
        r7 = r1;
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02aa, code lost:
        if (r0 != null) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02ac, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.NoteVideoCompress", r12);
        mo126223a(-50005, r16, r20, 0, (com.tencent.p014mm.modelcontrol.VideoTransPara) null, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02c2, code lost:
        if (r7 != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02c4, code lost:
        r4 = r20;
        com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02ca, code lost:
        r4 = r20;
        r19 = -50006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02cf, code lost:
        r5 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec((long) r0.f224999c);
        r0 = r0.f224998b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02da, code lost:
        if (r0 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02de, code lost:
        r8 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, 60, android.graphics.Bitmap.CompressFormat.JPEG, r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02e4, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02e6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02e9, code lost:
        r8 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02eb, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.NoteVideoCompress", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f2, code lost:
        r8 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02f4, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02f5, code lost:
        if (r0 != false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(-16777216, com.tencent.mapsdk.internal.C0947jz.f2205e, 480), 60, android.graphics.Bitmap.CompressFormat.JPEG, r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0308, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0309, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.NoteVideoCompress", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r32 = this;
            r9 = r32
            java.util.List<java.lang.String> r0 = r9.f263964d
            if (r0 == 0) goto L_0x036e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x036e
            r10 = 0
            r11 = 0
        L_0x000e:
            java.util.List<java.lang.String> r0 = r9.f263964d
            int r0 = r0.size()
            if (r11 >= r0) goto L_0x036e
            boolean r0 = r9.f263973p
            if (r0 != 0) goto L_0x036e
            r12 = 1
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.util.List<java.lang.String> r1 = r9.f263964d
            java.lang.String r1 = r1.toString()
            r0[r10] = r1
            java.lang.String r13 = "MicroMsg.NoteVideoCompress"
            java.lang.String r1 = "start to import %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "file://"
            r1.append(r2)
            java.util.List<java.lang.String> r2 = r9.f263964d
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<rz.s> r1 = p682rz.C101488s.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "note_"
            r2.append(r3)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.String r15 = ""
            r4 = 2
            java.lang.Object r3 = r3.mo119684e(r4, r15)
            java.lang.String r3 = (java.lang.String) r3
            sg.i<java.lang.String, java.util.ArrayList<hd0.n0>> r5 = hd0.C98410o0.f288586c
            java.lang.String r3 = hd0.C98426q0.m127793a(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r9.f263971n
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00ae
            java.lang.String r3 = r9.f263972o
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            java.lang.String r1 = r9.f263971n
            java.lang.String r2 = r9.f263972o
            java.lang.String r3 = "/"
            int r3 = r2.lastIndexOf(r3)
            int r3 = r3 + r12
            java.lang.String r5 = r9.f263972o
            int r5 = r5.length()
            java.lang.String r2 = r2.substring(r3, r5)
            java.lang.String r3 = r9.f263972o
            r7 = r1
            r16 = r2
            r8 = r3
            goto L_0x00d2
        L_0x00ae:
            di3.d r3 = di3.C86312j.m106911c(r1)
            rz.s r3 = (p682rz.C101488s) r3
            rz.t r3 = r3.Kj0()
            hd0.o0 r3 = (hd0.C98410o0) r3
            java.lang.String r3 = r3.mo137729r(r2)
            di3.d r1 = di3.C86312j.m106911c(r1)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            hd0.o0 r1 = (hd0.C98410o0) r1
            java.lang.String r1 = r1.mo137728q(r2)
            r8 = r1
            r16 = r2
            r7 = r3
        L_0x00d2:
            r17 = 0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r1)
            r2 = -1
            oj.a$a r0 = p914oj.C100361a.m131253b(r14, r0, r2)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00ea
        L_0x00e2:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r2, r15, r0)
            r0 = 0
        L_0x00ea:
            if (r0 == 0) goto L_0x00f0
            java.lang.String r2 = r0.f224997a
            r6 = r2
            goto L_0x00f1
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            java.lang.String r5 = "GetVideoMetadata filed."
            if (r2 == 0) goto L_0x010f
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r5)
            r2 = -50005(0xffffffffffff3cab, float:NaN)
            r0 = 0
            r8 = 0
            r5 = 0
            r1 = r32
            r3 = r16
            r4 = r6
            r6 = r0
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
        L_0x010c:
            r12 = 0
            goto L_0x0367
        L_0x010f:
            boolean r2 = uf0.C102016c.m134339a(r6)
            long r25 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            r27 = 10485760(0xa00000, float:1.469368E-38)
            r28 = 26214400(0x1900000, float:5.2897246E-38)
            if (r2 == 0) goto L_0x0222
            com.tencent.mm.pointers.PInt r1 = new com.tencent.mm.pointers.PInt
            r1.<init>()
            xb0.h r4 = xb0.C102609h.Fx0()
            boolean r4 = r4.zx0(r6)
            if (r4 == 0) goto L_0x013e
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r10] = r6
            java.lang.String r3 = "check remuxing, this video had wx meta do not remuxing. %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r4)
            r1.value = r12
            r29 = r5
            r30 = r7
            r3 = 0
            goto L_0x021e
        L_0x013e:
            com.tencent.mm.modelcontrol.VideoTransPara r3 = new com.tencent.mm.modelcontrol.VideoTransPara
            r3.<init>()
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            com.tencent.mm.pointers.PInt r10 = new com.tencent.mm.pointers.PInt
            r10.<init>()
            com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt
            r12.<init>()
            r29 = r5
            com.tencent.mm.pointers.PInt r5 = new com.tencent.mm.pointers.PInt
            r5.<init>()
            r30 = r7
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r7.<init>()
            java.lang.Class<dy.f> r18 = p500dy.C97560f.class
            di3.d r18 = di3.C86312j.m106911c(r18)
            dy.f r18 = (p500dy.C97560f) r18
            r19 = r6
            r20 = r4
            r21 = r10
            r22 = r12
            r23 = r5
            r24 = r7
            r18.mo136826xX(r19, r20, r21, r22, r23, r24)
            int r4 = r4.value
            int r4 = r4 / 1000
            r3.f267170h = r4
            int r4 = r10.value
            r3.f267166d = r4
            int r4 = r12.value
            r3.f267167e = r4
            int r4 = r5.value
            r3.f267168f = r4
            int r4 = r7.value
            r3.f267169g = r4
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r7 = 0
            r5[r7] = r3
            java.lang.String r10 = "check remuxing old para %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r10, r5)
            xb0.h r5 = xb0.C102609h.Fx0()
            r10 = 0
            com.tencent.mm.modelcontrol.VideoTransPara r5 = r5.Ex0(r3, r10)
            if (r5 != 0) goto L_0x01b1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r7] = r3
            java.lang.String r3 = "get C2C album video para is null. old para %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r5)
            r3 = -5
            r1.value = r3
            goto L_0x021d
        L_0x01b1:
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r7] = r5
            java.lang.String r4 = "check remuxing new para %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r4, r12)
            int r4 = r3.f267169g
            r7 = 640000(0x9c400, float:8.96831E-40)
            if (r4 <= r7) goto L_0x020c
            int r7 = r5.f267169g
            if (r7 <= r4) goto L_0x01c6
            goto L_0x020c
        L_0x01c6:
            int r4 = r3.f267168f
            r7 = 45
            if (r4 < r7) goto L_0x01d9
            int r3 = r3.f267170h
            int r3 = r3 * 1000
            r4 = 180000(0x2bf20, float:2.52234E-40)
            if (r3 < r4) goto L_0x01d9
            r3 = -6
            r1.value = r3
            goto L_0x021d
        L_0x01d9:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r3)
            int r4 = r5.f267166d
            int r7 = r5.f267167e
            if (r3 == 0) goto L_0x01ea
            r21 = 10485760(0xa00000, float:1.469368E-38)
            goto L_0x01ec
        L_0x01ea:
            r21 = 26214400(0x1900000, float:5.2897246E-38)
        L_0x01ec:
            if (r3 == 0) goto L_0x01f4
            r18 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            goto L_0x01f9
        L_0x01f4:
            r18 = 4688897573220515840(0x41124f8000000000, double:300000.0)
        L_0x01f9:
            r22 = r18
            r24 = 1000000(0xf4240, float:1.401298E-39)
            r18 = r6
            r19 = r4
            r20 = r7
            int r3 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(r18, r19, r20, r21, r22, r24)
            r1.value = r3
            r3 = r5
            goto L_0x021e
        L_0x020c:
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r4 = 0
            r7[r4] = r5
            r4 = 1
            r7[r4] = r3
            java.lang.String r3 = "new bitrate is bigger than old bitrate %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r7)
            r1.value = r4
        L_0x021d:
            r3 = r10
        L_0x021e:
            int r4 = r1.value
            r10 = r3
            goto L_0x0237
        L_0x0222:
            r29 = r5
            r30 = r7
            r3 = -5
            r10 = 0
            if (r1 == 0) goto L_0x022d
            r1 = 10485760(0xa00000, float:1.469368E-38)
            goto L_0x022f
        L_0x022d:
            r1 = 26214400(0x1900000, float:5.2897246E-38)
        L_0x022f:
            long r4 = (long) r1
            int r1 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0236
            r4 = -5
            goto L_0x0237
        L_0x0236:
            r4 = 1
        L_0x0237:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r1[r5] = r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r25)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "check remuxing, ret %d isMp4 %b length %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            switch(r4) {
                case -6: goto L_0x0357;
                case -5: goto L_0x0346;
                case -4: goto L_0x0357;
                case -3: goto L_0x0357;
                case -2: goto L_0x0357;
                case -1: goto L_0x0335;
                case 0: goto L_0x029f;
                case 1: goto L_0x026f;
                case 2: goto L_0x026f;
                case 3: goto L_0x026f;
                case 4: goto L_0x026f;
                case 5: goto L_0x026f;
                default: goto L_0x0257;
            }
        L_0x0257:
            r4 = r6
            r12 = 0
            java.lang.String r0 = "unknown check type"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r2 = -50001(0xffffffffffff3caf, float:NaN)
            r6 = 0
            r8 = 0
            r5 = 0
            r1 = r32
            r3 = r16
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0367
        L_0x026f:
            r1 = 26214400(0x1900000, double:1.29516345E-316)
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0296
            r12 = -50002(0xffffffffffff3cae, float:NaN)
            r7 = 0
            r18 = 0
            r5 = 0
            r1 = r32
            r2 = r12
            r3 = r16
            r4 = r6
            r12 = r29
            r20 = r6
            r6 = r7
            r31 = r30
            r7 = r14
            r9 = r8
            r8 = r18
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
            r7 = 0
            r19 = -50002(0xffffffffffff3cae, float:NaN)
            goto L_0x02aa
        L_0x0296:
            r20 = r6
            r9 = r8
            r12 = r29
            r31 = r30
            r1 = 0
            goto L_0x02a7
        L_0x029f:
            r20 = r6
            r9 = r8
            r12 = r29
            r31 = r30
            r1 = 1
        L_0x02a7:
            r7 = r1
            r19 = 0
        L_0x02aa:
            if (r0 != 0) goto L_0x02c2
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r12)
            r2 = -50005(0xffffffffffff3cab, float:NaN)
            r6 = 0
            r8 = 0
            r1 = r32
            r3 = r16
            r4 = r20
            r5 = r17
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x010c
        L_0x02c2:
            if (r7 != 0) goto L_0x02ca
            r4 = r20
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r9)
            goto L_0x02cf
        L_0x02ca:
            r4 = r20
            r19 = -50006(0xffffffffffff3caa, float:NaN)
        L_0x02cf:
            int r1 = r0.f224999c
            long r1 = (long) r1
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r1)
            android.graphics.Bitmap r0 = r0.f224998b
            r1 = 60
            if (r0 == 0) goto L_0x02f2
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02e8 }
            r8 = r31
            r3 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r1, r2, r8, r3)     // Catch:{ Exception -> 0x02e6 }
            r0 = 0
            goto L_0x02f5
        L_0x02e6:
            r0 = move-exception
            goto L_0x02eb
        L_0x02e8:
            r0 = move-exception
            r8 = r31
        L_0x02eb:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r15, r3)
            goto L_0x02f4
        L_0x02f2:
            r8 = r31
        L_0x02f4:
            r0 = 1
        L_0x02f5:
            if (r0 == 0) goto L_0x0310
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = 320(0x140, float:4.48E-43)
            r3 = 480(0x1e0, float:6.73E-43)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r2, r3)     // Catch:{ Exception -> 0x0308 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0308 }
            r3 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r1, r2, r8, r3)     // Catch:{ Exception -> 0x0308 }
            goto L_0x0310
        L_0x0308:
            r0 = move-exception
            r12 = 0
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r15, r1)
            goto L_0x0311
        L_0x0310:
            r12 = 0
        L_0x0311:
            if (r7 != 0) goto L_0x031c
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            if (r0 != 0) goto L_0x031c
            r19 = -50003(0xffffffffffff3cad, float:NaN)
        L_0x031c:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 != 0) goto L_0x0329
            r0 = -50004(0xffffffffffff3cac, float:NaN)
            r2 = -50004(0xffffffffffff3cac, float:NaN)
            goto L_0x032b
        L_0x0329:
            r2 = r19
        L_0x032b:
            r1 = r32
            r3 = r16
            r6 = r10
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0367
        L_0x0335:
            r4 = r6
            r12 = 0
            r2 = -50007(0xffffffffffff3ca9, float:NaN)
            r6 = 0
            r8 = 0
            r5 = 0
            r1 = r32
            r3 = r16
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0367
        L_0x0346:
            r4 = r6
            r12 = 0
            r2 = -50008(0xffffffffffff3ca8, float:NaN)
            r6 = 0
            r8 = 0
            r5 = 0
            r1 = r32
            r3 = r16
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0367
        L_0x0357:
            r4 = r6
            r12 = 0
            r2 = -50002(0xffffffffffff3cae, float:NaN)
            r6 = 0
            r8 = 0
            r5 = 0
            r1 = r32
            r3 = r16
            r7 = r14
            r1.mo126223a(r2, r3, r4, r5, r6, r7, r8)
        L_0x0367:
            int r11 = r11 + 1
            r10 = 0
            r9 = r32
            goto L_0x000e
        L_0x036e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92226g.run():void");
    }
}
